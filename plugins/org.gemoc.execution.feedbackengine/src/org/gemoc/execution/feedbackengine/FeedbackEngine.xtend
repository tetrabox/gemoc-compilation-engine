package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.resource.MelangeResource
import fr.inria.diverse.trace.commons.model.trace.Step
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine
import org.gemoc.xdsmlframework.api.core.IExecutionContext
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.transaction.util.TransactionUtil

class FeedbackEngine extends AbstractSequentialExecutionEngine {

	public static val String annotationCompilerKey = "compiler"
	public static val String annotationFeedbackKey = "feedback"

	var FeedbackInterpreter feedbackInterpreter

	public def void callbackStartStep(Step<?> step) {
		this.beforeExecutionStep(step);
	}

	public def void callbackEndStep() {
		this.afterExecutionStep
	}

	override protected executeEntryPoint() {
		feedbackInterpreter.start
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
				if (languageFQN.endsWith(language.getName())) {
					return language;
				}
			}
		}
	}

	/**
	 * WARNING: with the GEMOC loading process, we could either obtain a static or dynamic model (ie. with or without melange)
	 * We would actually need both: the static to compile, and the dynamic to mirror back.
	 * BUT it means we would need the traceability links to point to the dynamic model, which melange should manage I think?
	 * 
	 */
	override protected prepareEntryPoint(IExecutionContext executionContext) {

		// Reading melange model 
		val Language language = getMelangeLanguage(executionContext)
		val String compilerID = language.annotations.findFirst[key.equals(annotationCompilerKey)].value
		val String feedbackInterpreterID = language.annotations.findFirst[key.equals(annotationFeedbackKey)].value

		// Compiling
		val Compiler compiler = getExtension("org.gemoc.execution.feedbackengine.compiler", compilerID) as Compiler
		val Resource resourceModel = executionContext.resourceModel
		val EObject modelroot = if (resourceModel instanceof MelangeResource) {
				resourceModel.wrappedResource.contents.head
			} else {
				resourceModel.contents.head
			}
		val result = compiler.compile(modelroot)

		// Saving compilation result
		val exeFolder = executionContext.workspace.executionPath
		val targetURI = URI::createPlatformResourceURI(exeFolder.toString + "/target." + compiler.targetFileExtension,
			true)
		val rs = resourceModel.resourceSet
		val targetResource = rs.createResource(targetURI)
		val ed = TransactionUtil::getEditingDomain(rs)
		val addCommand = new AddCommand(ed, targetResource.contents, result.targetModelRoot)
		ed.commandStack.execute(addCommand)

		// Temporary disable URIConverter to bypass save blocking from org.gemoc.executionframework.extensions.sirius.modelloader.DebugURIHandler
		val tmp = rs.URIConverter
		rs.URIConverter = null
		targetResource.save(null)
		rs.URIConverter = tmp

		// Configuring feedback interpreter
		this.feedbackInterpreter = getExtension("org.gemoc.execution.feedbackengine.feedbackinterpreter",
			feedbackInterpreterID) as FeedbackInterpreter
		feedbackInterpreter.initialize(resourceModel, targetResource.URI, result.traceabilityModelRoot, this)

	}

	private static def Object getExtension(String extensionPoint, String id) {
		val extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPoint);
		val correctExtension = extensions.findFirst[c|c.getAttribute("id").equals(id)]
		val extensionInstance = correctExtension.createExecutableExtension("class")
		return extensionInstance
	}

	override engineKindName() {
		"TranslationalEngine"
	}

	override protected initializeModel() {
		// Nothing to do
	}

	override protected prepareInitializeModel(IExecutionContext executionContext) {
		// Nothing to do
	}

}
