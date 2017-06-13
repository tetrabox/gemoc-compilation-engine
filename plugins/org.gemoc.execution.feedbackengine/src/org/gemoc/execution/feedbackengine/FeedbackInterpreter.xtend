package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.resource.MelangeResource
import fr.inria.diverse.trace.commons.model.trace.Step
import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.executionframework.engine.core.AbstractExecutionEngine
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.gemoc.xdsmlframework.api.engine_addon.DefaultEngineAddon

class FeedbackInterpreter extends DefaultEngineAddon {

	private var AbstractExecutionEngine targetEngine

	private val FeedbackInterpreterConfiguration conf

	new(FeedbackInterpreterConfiguration conf, Resource targetModel) {
		this.conf = conf
		val exeContext = new TargetExecutionContext(targetModel, conf)
		targetEngine = conf.createTargetEngine() as AbstractExecutionEngine
		targetEngine.initialize(exeContext);
		targetEngine.stopOnAddonError = true;
		targetEngine.executionContext.executionPlatform.addEngineAddon(this)
		conf.targetMapping = (targetEngine.executionContext.resourceModel as MelangeResource).modelsMapping
	}

	public def start() {
		// Start target engine
		targetEngine.start();
	}

	override engineStopped(IExecutionEngine engine) {

		// We re-throw any error occurring in the target engine
		if (targetEngine.error != null)
			throw targetEngine.error

	}

	override aboutToExecuteStep(IExecutionEngine executionEngine, Step<?> step) {
		conf.processTargetStepStart(step)
	}

	override stepExecuted(IExecutionEngine engine, Step<?> step) {
		conf.processTargetStepEnd(step)
	}
}
