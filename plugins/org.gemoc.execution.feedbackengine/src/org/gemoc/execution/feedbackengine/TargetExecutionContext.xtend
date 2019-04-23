package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.resource.MelangeResourceImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException
import org.eclipse.gemoc.executionframework.engine.commons.MelangeHelper
import org.eclipse.gemoc.executionframework.engine.core.ExecutionWorkspace
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode

/**
 * Simpler context relying on some existing ResourceSet, which
 * is the one of the considered source FeedbackEngine.
 */
class TargetExecutionContext extends SequentialModelExecutionContext<IK3RunConfiguration> {

//	val IExecutionPlatform executionPlatform
//	val IRunConfiguration runConfiguration
//	val Resource targetStaticModel
//	val Resource targetDynamicModel
//	val IExecutionWorkspace executionWorkspace;
//	val Bundle dslBundle;
	new(Resource targetStaticModel, FeedbackConfiguration conf, String initArguments) throws EngineContextException {
		super(new TargetRunConfiguration(
			targetStaticModel.URI,
			conf.getTargetEntryPoint(),
			conf.getTargetLanguageName(),
			conf.getTargetInitializationMethod(),
			initArguments
		), ExecutionMode::Run)
		val executionPlatform = new TargetExecutionPlatform()
		// val runConfiguration = 
		// val targetStaticModel = targetStaticModel
		val bundle = MelangeHelper.getMelangeBundle(conf.getTargetLanguageName()) // TODO probably to change
		val executionWorkspace = new ExecutionWorkspace(runConfiguration.getExecutedModelURI());
		val String melangeURIString = targetStaticModel.URI.toString().replace("platform:/", "melange:/") +
			runConfiguration.melangeQuery;
		val melangeURI = URI::createURI(melangeURIString);
		val targetDynamicModel = new MelangeResourceImpl(targetStaticModel.resourceSet, melangeURI)
		_resourceModel = targetDynamicModel
	}

//	override getExecutionMode() {
//		return ExecutionMode::Run
//	}
//
//	override getExecutionPlatform() {
//		return executionPlatform
//	}
//
//	override getResourceModel() {
//		targetDynamicModel
//	}
//
//	override getRunConfiguration() {
//		return runConfiguration
//	}
//
//	override getWorkspace() {
//		return workspace
//	}
//
//	override initializeResourceModel() {
//		// nothing to do
//	}
//
//	override dispose() {
//		// nothing to do
//	}
//
//	override getLanguageDefinitionExtension() {
//		throw new UnsupportedOperationException()
//	}
//
//	override getMSEModel() {
//		throw new UnsupportedOperationException()
//	}
//
//	override getDslBundle() {
//		return dslBundle;
//	}
}
