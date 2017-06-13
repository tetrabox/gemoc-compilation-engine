package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import ad2petritraceability.Ad2petriTraceability
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreter
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine

class Ad2PetriFeedbackInterpreter implements FeedbackInterpreter {

	/**
	 * Mapping between source and target models.
	 */
	private var Ad2petriTraceability mapping

	/**
	 * This is where we send our translated steps.
	 */
	private var FeedbackEngine feedbackEngine

	var Map<EObject, EObject> staticSource2dynamicSource
	var Map<EObject, EObject> staticTarget2dynamicTarget

	override createTargetEngine() {
		return new PlainK3ExecutionEngine()
	}

	override initialize(EObject staticSource2staticTarget, FeedbackEngine feedbackEngine,
		Map<EObject, EObject> staticSource2dynamicSource, Map<EObject, EObject> staticTarget2dynamicTarget) {
		this.mapping = staticSource2staticTarget as Ad2petriTraceability
		this.feedbackEngine = feedbackEngine
		this.staticSource2dynamicSource = staticSource2dynamicSource
		this.staticTarget2dynamicTarget = staticTarget2dynamicTarget
	}

	private def void feedbackModelState() {
	}

	private def Activity findDynamicActivity(Net net) {
		val staticNet = staticTarget2dynamicTarget.entrySet.findFirst[it.value == net].key
		val staticActivity = mapping.activityTraces.findFirst[it.net == staticNet].originalActivity
		val dynamicActivity = staticSource2dynamicSource.get(staticActivity)
		return dynamicActivity as Activity
	}

	override processTargetStepStart(Step<?> targetStep) {

		// There are only two possible steps: run and fire
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {

			// Follow traceability links
			val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
			val dynamicActivity = findDynamicActivity(runnedNet)

			val it = ""
			charAt(1)
			val it = 1
			shortValue

			// Feedback the model state (ie. modify the AD state)
			feedbackModelState()

			// Feedback the step
			feedbackEngine.feedbackStartStep(dynamicActivity, dynamicActivity.eClass.name, "execute")
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
			// Follow dynamic->static mapping
			val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
			val staticTransition = staticTarget2dynamicTarget.entrySet.findFirst[it.value == firedTransition].key

			// Trying all possibilities
			val controlFlowTrace = mapping.controlFlowTraces.findFirst[it.transition == staticTransition]
			if (controlFlowTrace != null) {
				println("Mapped! " + controlFlowTrace)
			} else {
				val finalNodeTrace = mapping.finalNodeTraces.findFirst[it.transition == staticTransition]
				if (finalNodeTrace != null) {
					println("Mapped! " + finalNodeTrace)
				} else {
					val forkNodeTrace = mapping.forkNodeTraces.findFirst[it.transition == staticTransition]
					if (forkNodeTrace != null) {
						println("Mapped! " + forkNodeTrace)
					} else {
						val joinNodeTrace = mapping.joinNodeTraces.findFirst[it.transition == staticTransition]
						if (joinNodeTrace != null) {
							println("Mapped! " + joinNodeTrace)
						} else {
							println("WARNING: the transition does not match anything? " + staticTransition)
						}
					}
				}
			}
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
			feedbackModelState()
			feedbackEngine.feedbackEndStep
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith(
			"fire")) {
		}
	// TODO
	}

	override getTargetLanguageName() {
		"fr.inria.diverse.sample.petrinetv1.xdsml.XPetrinetv1"
	}

	override getTargetEntryPoint() {
		"public static void fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.run(fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net)"
	}

	override getTargetInitializationMethod() {
		"fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.initialize"
	}

}
