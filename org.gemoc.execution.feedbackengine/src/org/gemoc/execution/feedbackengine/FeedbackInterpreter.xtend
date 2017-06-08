package org.gemoc.execution.feedbackengine

import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackInterpreter {
	
	def void initialize(Resource inputModel, IExecutionEngine engine)
	
	def void start()
}
