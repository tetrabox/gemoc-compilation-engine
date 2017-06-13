package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.resource.MelangeResourceImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.executionframework.engine.commons.MelangeHelper
import org.gemoc.executionframework.engine.core.ExecutionWorkspace
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.gemoc.xdsmlframework.api.core.IExecutionContext
import org.gemoc.xdsmlframework.api.core.IExecutionPlatform
import org.gemoc.xdsmlframework.api.core.IExecutionWorkspace
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.osgi.framework.Bundle

/**
 * Simpler context relying on some existing ResourceSet, which
 * is the one of the considered source FeedbackEngine.
 */
class TargetExecutionContext implements IExecutionContext {

	val IExecutionPlatform executionPlatform
	val IRunConfiguration runConfiguration
	val Bundle melangeBundle
	val Resource targetStaticModel
	val Resource targetDynamicModel
	val IExecutionWorkspace executionWorkspace;

	new(Resource targetStaticModel, FeedbackInterpreter conf) {
		this.executionPlatform = new TargetExecutionPlatform()
		this.runConfiguration = new TargetRunConfiguration(targetStaticModel.URI, conf.getMelangeQuery(),
			conf.getEntryPoint(), conf.getLanguageName(), conf.getInitializationMethod())
		this.targetStaticModel = targetStaticModel
		this.melangeBundle = MelangeHelper.getMelangeBundle(conf.getLanguageName())
		executionWorkspace = new ExecutionWorkspace(runConfiguration.getExecutedModelURI());
		val String melangeURIString = targetStaticModel.URI.toString().replace("platform:/", "melange:/") + conf.melangeQuery;
		val melangeURI = URI::createURI(melangeURIString);
		targetDynamicModel = new MelangeResourceImpl(targetStaticModel.resourceSet, melangeURI) 
	}

	override getExecutionMode() {
		return ExecutionMode::Run
	}

	override getExecutionPlatform() {
		return executionPlatform
	}

	override getMelangeBundle() {
		return melangeBundle
	}

	override getResourceModel() {
		targetDynamicModel
	}

	override getRunConfiguration() {
		return runConfiguration
	}

	override getWorkspace() {
		return workspace
	}

	override initializeResourceModel() {
		// nothing to do
	}

	override dispose() {
		// nothing to do
	}

	override getLanguageDefinitionExtension() {
		throw new UnsupportedOperationException()
	}

	override getMSEModel() {
		throw new UnsupportedOperationException()
	}

}
