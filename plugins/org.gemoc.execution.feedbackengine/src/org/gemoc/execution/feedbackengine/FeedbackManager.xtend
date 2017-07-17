package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step

interface FeedbackManager {

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)
	
}
