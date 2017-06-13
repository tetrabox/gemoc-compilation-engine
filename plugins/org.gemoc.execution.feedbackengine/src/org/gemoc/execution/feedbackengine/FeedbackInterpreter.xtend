package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackInterpreter {

	def void initialize(EObject traceability, FeedbackEngine feedbackEngine,
		Map<EObject, EObject> staticSource2dynamicSource, Map<EObject, EObject> staticTarget2dynamicTarget)

	def IExecutionEngine createTargetEngine()

	def void processTargetStepStart(Step<?> targetStep)

	def void processTargetStepEnd(Step<?> targetStep)

	def String getTargetEntryPoint()

	def String getTargetLanguageName()

	def String getTargetInitializationMethod()

}
