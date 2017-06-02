package org.gemoc.activitydiagram.sequential.ad2petri.semantics

import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface BackInterpreter {
	
	def void initialize(Resource inputModel, IExecutionEngine engine)
	
	def void start()
}