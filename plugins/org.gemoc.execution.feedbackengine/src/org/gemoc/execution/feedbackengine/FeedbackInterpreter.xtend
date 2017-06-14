package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step
import gemoctraceability.TraceabilityModel
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackInterpreter {

	def void initialize(TraceabilityModel traceability, FeedbackEngine feedbackEngine)

	def IExecutionEngine createTargetEngine()

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)
	
	def void processTargetExecutionEnd()

	def String getTargetEntryPoint()

	def String getTargetLanguageName()

	def String getTargetInitializationMethod()

}
