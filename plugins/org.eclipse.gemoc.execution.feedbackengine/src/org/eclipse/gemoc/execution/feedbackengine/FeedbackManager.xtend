package org.eclipse.gemoc.execution.feedbackengine

import org.eclipse.gemoc.trace.commons.model.trace.Step

interface FeedbackManager {

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)
	
}
