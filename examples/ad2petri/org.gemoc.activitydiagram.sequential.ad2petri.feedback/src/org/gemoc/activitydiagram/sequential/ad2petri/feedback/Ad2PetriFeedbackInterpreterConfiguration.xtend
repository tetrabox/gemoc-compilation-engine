package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import ad2petritraceability.Ad2petriTraceability
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreterConfiguration
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine

// TODO rename feedbackconfiguration
class Ad2PetriFeedbackInterpreterConfiguration implements FeedbackInterpreterConfiguration {

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
		Map<EObject, EObject> staticSource2dynamicSource) {
		this.mapping = staticSource2staticTarget as Ad2petriTraceability
		this.feedbackEngine = feedbackEngine
		this.staticSource2dynamicSource = staticSource2dynamicSource
	}

	override processTargetStepStart(Step<?> targetStep) {
		// There are only two possible steps: run and fire
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
			val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
			println("starting run: " + targetStep)
			println("\tdynamic net: " + runnedNet)
			val staticNet = staticTarget2dynamicTarget.entrySet.findFirst[it.value == runnedNet].key
			println("\tstatic net: " + staticNet)
			val staticActivity = mapping.activityTraces.findFirst[it.net == staticNet].originalActivity
			println("\tcorresponding static activity: " + staticActivity)
			val dynamicActivity = staticSource2dynamicSource.get(staticActivity)
			println("\tcorresponding dynamic activity: " + dynamicActivity)
			println("==============")

		// TODO: feedbackEngine.callbackStartStep(step)
		}
		if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
			val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
			println("starting fire: " + targetStep)
			println("\tdynamic transition: " + firedTransition)
			val staticTransition = staticTarget2dynamicTarget.entrySet.findFirst[it.value == firedTransition].key
			println("\tstatic  transition: " + staticTransition)
			println("==============")

		// TODO: feedbackEngine.callbackEndStep()
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		// TODO
	}

	override setTargetMapping(Map<EObject, EObject> mapping) {
		this.staticTarget2dynamicTarget = mapping
	}
	
	override getMelangeQuery() {
		"?lang=fr.inria.diverse.sample.petrinetv1.xdsml.XPetrinetv1"
	}
	
	override getEntryPoint() {
		"public static void fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.run(fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net)"
	}
	
	override getLanguageName() {
		"fr.inria.diverse.sample.petrinetv1.xdsml.XPetrinetv1"
	}
	
	override getInitializationMethod() {
		"fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.initialize"
	}

}
