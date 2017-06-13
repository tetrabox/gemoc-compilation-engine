package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackInterpreterConfiguration {

	def void initialize(EObject traceability, FeedbackEngine feedbackEngine,  Map<EObject,EObject> staticSource2dynamicSource)

	def IExecutionEngine createTargetEngine()

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)
	
	def void setTargetMapping(Map<EObject, EObject> mapping)
	
	def String getMelangeQuery()
	
	def String getEntryPoint()
	
	def String getLanguageName()
	
	def String getInitializationMethod()
	
}
	