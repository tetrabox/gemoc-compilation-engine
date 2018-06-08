package org.gemoc.execution.feedbackengine

import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon

class FeedbackAddon implements IEngineAddon {

	private val FeedbackManager feedbackInterpreter

	new(FeedbackManager feedbackInterpreter) {
		this.feedbackInterpreter = feedbackInterpreter
	}

	override aboutToExecuteStep(IExecutionEngine engine, Step<?> step) {
		feedbackInterpreter.feedbackState
		feedbackInterpreter.processTargetStepStart(step)
	}

	override stepExecuted(IExecutionEngine engine, Step<?> step) {
		feedbackInterpreter.feedbackState
		feedbackInterpreter.processTargetStepEnd(step)
	}

	override engineInitialized(IExecutionEngine executionEngine) {
		feedbackInterpreter.initialize
		feedbackInterpreter.feedbackState
	}
	
	

}
