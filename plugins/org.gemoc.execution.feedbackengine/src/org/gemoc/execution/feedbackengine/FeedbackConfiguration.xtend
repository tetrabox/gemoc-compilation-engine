package org.gemoc.execution.feedbackengine

import gemoctraceability.TraceabilityModel
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackConfiguration {
	def FeedbackManager createFeedbackInterpreter(TraceabilityModel traceability, FeedbackEngine feedbackEngine)
	
	def IExecutionEngine createTargetEngine()
	
	def String getTargetEntryPoint()

	def String getTargetLanguageName()

	def String getTargetInitializationMethod()
}