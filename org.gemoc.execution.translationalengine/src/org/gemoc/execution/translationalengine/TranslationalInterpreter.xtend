package org.gemoc.execution.translationalengine

import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface TranslationalInterpreter {
	
	def void initialize(Resource inputModel, IExecutionEngine engine)
	
	def void start()
}
