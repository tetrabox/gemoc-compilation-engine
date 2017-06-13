package org.gemoc.execution.feedbackengine

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

interface FeedbackInterpreter {
	
	def void initialize(Resource inputModel, URI targetModelURI, EObject traceability, FeedbackEngine feedbackEngine) 
	def void start()
}
