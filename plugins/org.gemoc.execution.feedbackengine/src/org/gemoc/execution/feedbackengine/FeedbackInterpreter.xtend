package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step

interface FeedbackInterpreter {

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)
	
	def void processTargetExecutionEnd()


}
