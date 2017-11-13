package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.resource.MelangeResource
import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.TraceabilityModel
import java.util.Map
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.transaction.util.TransactionUtil
import org.eclipse.gemoc.executionframework.engine.core.AbstractExecutionEngine
import org.eclipse.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext

class FeedbackEngine extends AbstractSequentialExecutionEngine {

	public static val String annotationCompilerKey = "compiler"
	public static val String annotationFeedbackKey = "feedback"
	public static val String compilerExtensionPoint = "org.gemoc.execution.feedbackengine.compiler"
	public static val String feedbackExtensionPoint = "org.gemoc.execution.feedbackengine.feedback"

	var FeedbackManager feedbackInterpreter
	var AbstractExecutionEngine targetEngine

	var boolean feedback = true

	public def void feedbackStartStep(EObject caller, String className, String operationName) {
		beforeExecutionStep(caller, className, operationName);
	}

	public def void feedbackEndStep() {
		afterExecutionStep
	}

	override protected prepareEntryPoint(IExecutionContext executionContext) {

		// Reading melange model to find compiler and feedback identifiers
		val Language language = getMelangeLanguage(executionContext)
		val String compilerID = language.annotations.findFirst[key.equals(annotationCompilerKey)].value
		val String feedbackID = language.annotations.findFirst[key.equals(annotationFeedbackKey)].value

		// Compiling
		val Compiler compiler = getExtension(compilerExtensionPoint, compilerID) as Compiler
		val MelangeResource dynamicSourceModel = executionContext.resourceModel as MelangeResource
		val EObject staticSourceModelRoot = dynamicSourceModel.wrappedResource.contents.head
		val compilatioResult = compiler.compile(staticSourceModelRoot)

		// Putting target model in resource
		val exeFolder = executionContext.workspace.executionPath
		val targetURI = URI::createPlatformResourceURI(exeFolder.toString + "/target." + compiler.targetFileExtension,
			true)
		val rs = dynamicSourceModel.resourceSet
		val targetResource = rs.createResource(targetURI)
		val ed = TransactionUtil::getEditingDomain(rs)
		val addCommand = new AddCommand(ed, targetResource.contents, compilatioResult.targetModelRoot)
		ed.commandStack.execute(addCommand)

		// Saving, and temporary disable URIConverter to bypass save blocking from org.eclipse.gemoc.executionframework.extensions.sirius.modelloader.DebugURIHandler
		val tmp = rs.URIConverter
		rs.URIConverter = null
		targetResource.save(null)
		rs.URIConverter = tmp

		// Creating the feedback configuration
		val feedbackConfiguration = getExtension(feedbackExtensionPoint, feedbackID) as FeedbackConfiguration

		// Creating the target engine
		val exeContext = new TargetExecutionContext(targetResource, feedbackConfiguration)
		targetEngine = feedbackConfiguration.createTargetEngine() as AbstractExecutionEngine
		targetEngine.initialize(exeContext);
		targetEngine.stopOnAddonError = true;

		// Converting the traceability model to a dynamic one
		val Map<EObject, EObject> sourceMapping = dynamicSourceModel.modelsMapping
		val Map<EObject, EObject> targetMapping = (targetEngine.executionContext.resourceModel as MelangeResource).
			modelsMapping
		val TraceabilityModel dynamicTraceability = transformToDynamic(compilatioResult.traceabilityModelRoot,
			sourceMapping, targetMapping)

		if (feedback) {

			// Creating the feedback interpreter
			feedbackInterpreter = feedbackConfiguration.createFeedbackManager(dynamicTraceability, this)

			// Create the feedback addon
			val feedbackAddon = new FeedbackAddon(feedbackInterpreter)
			targetEngine.executionContext.executionPlatform.addEngineAddon(feedbackAddon)

		}

	}

	private def static transformToDynamic(TraceabilityModel traceabilityModel, Map<EObject, EObject> sourceMapping,
		Map<EObject, EObject> targetMapping) {
		val dynamicTraceabilityModel = GemoctraceabilityFactory::eINSTANCE.createTraceabilityModel
		for (link : traceabilityModel.links) {
			val dynamicLink = GemoctraceabilityFactory::eINSTANCE.createLink
			for (sourceElement : link.sourceElements) {
				val element = GemoctraceabilityFactory::eINSTANCE.createAnnotatedElement
				element.element = sourceMapping.get(sourceElement.element)
				element.annotation = sourceElement.annotation
				element.link = dynamicLink
				dynamicLink.sourceElements.add(element)
			}
			for (targetElement : link.targetElements) {
				val element = GemoctraceabilityFactory::eINSTANCE.createAnnotatedElement
				element.element = targetMapping.get(targetElement.element)
				element.annotation = targetElement.annotation
				element.link = dynamicLink
				dynamicLink.targetElements.add(element)
			}
			dynamicTraceabilityModel.links.add(dynamicLink)
		}
		return dynamicTraceabilityModel
	}

	private static def Object getExtension(String extensionPoint, String id) {
		val extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPoint);
		val correctExtension = extensions.findFirst[c|c.getAttribute("id").equals(id)]
		val extensionInstance = correctExtension.createExecutableExtension("class")
		return extensionInstance
	}

	override engineKindName() {
		"FeedbackEngine"
	}

	private static def Language getMelangeLanguage(IExecutionContext executionContext) {
		val String melangeModelPath = executionContext.getLanguageDefinitionExtension().getXDSMLFilePath();
		val ResourceSet rs = new ResourceSetImpl
		val Resource xdsmlFileResource = rs.getResource(URI::createPlatformPluginURI(melangeModelPath, true), true);
		val ModelTypingSpace modelTypingSpace = xdsmlFileResource.getContents().get(0) as ModelTypingSpace;
		val String languageFQN = executionContext.getLanguageDefinitionExtension().getName();
		for (Element element : modelTypingSpace.getElements()) {
			if (element instanceof Language) {
				val Language language = element as Language;
				if (languageFQN.endsWith("." + language.getName())) {
					return language;
				}
			}
		}
	}

	override protected executeEntryPoint() {
		targetEngine.startSynchronous();
		if (targetEngine.error !== null)
			throw targetEngine.error
	}

	override protected initializeModel() {
		// Nothing to do
	}

	override protected prepareInitializeModel(IExecutionContext executionContext) {
		// Nothing to do
	}

	public def disableFeedback() {
		this.feedback = false
	}

}
