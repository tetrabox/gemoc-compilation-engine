package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon

class FeedbackAddon implements IEngineAddon {
	
	private val FeedbackInterpreter feedbackInterpreter
	
	new(FeedbackInterpreter feedbackInterpreter) {
		this.feedbackInterpreter = feedbackInterpreter
	}
	
	override aboutToExecuteStep(IExecutionEngine engine, Step<?> step) {
		feedbackInterpreter.processTargetStepStart(step)
	}

	override stepExecuted(IExecutionEngine engine, Step<?> step) {
		feedbackInterpreter.processTargetStepEnd(step)
	}

	override engineAboutToStop(IExecutionEngine engine) {
		feedbackInterpreter.processTargetExecutionEnd()
	}
	
	override engineInitialized(IExecutionEngine executionEngine) {
		feedbackInterpreter.initialize
	}
	
}