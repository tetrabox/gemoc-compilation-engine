package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.resource.MelangeResourceImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gemoc.executionframework.engine.commons.DslHelper
import org.eclipse.gemoc.executionframework.engine.core.ExecutionWorkspace
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionPlatform
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionWorkspace
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.osgi.framework.Bundle

/**
 * Simpler context relying on some existing ResourceSet, which
 * is the one of the considered source FeedbackEngine.
 */
class TargetExecutionContext implements IExecutionContext {

	val IExecutionPlatform executionPlatform
	val IRunConfiguration runConfiguration
	val Resource targetStaticModel
	val Resource targetDynamicModel
	val IExecutionWorkspace executionWorkspace;
	val Bundle dslBundle;

	new(Resource targetStaticModel, FeedbackConfiguration conf, String initArguments) {
		this.executionPlatform = new TargetExecutionPlatform()
		this.runConfiguration = new TargetRunConfiguration(targetStaticModel.URI, conf.getTargetEntryPoint(),
			conf.getTargetLanguageName(), conf.getTargetInitializationMethod(), initArguments)
		this.targetStaticModel = targetStaticModel
		executionWorkspace = new ExecutionWorkspace(runConfiguration.getExecutedModelURI());
		val String melangeURIString = targetStaticModel.URI.toString().replace("platform:/", "melange:/") +
			runConfiguration.melangeQuery;
		val melangeURI = URI::createURI(melangeURIString);
		targetDynamicModel = new MelangeResourceImpl(targetStaticModel.resourceSet, melangeURI)
		dslBundle = DslHelper::getDslBundle(runConfiguration.getLanguageName());
	}

	override getExecutionMode() {
		return ExecutionMode::Run
	}

	override getExecutionPlatform() {
		return executionPlatform
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

	override getDslBundle() {
		return dslBundle;
	}

}
