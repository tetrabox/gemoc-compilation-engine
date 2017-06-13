package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import ad2petritraceability.Ad2petriTraceability
import ad2petritraceability.ControlFlowTrace
import ad2petritraceability.FinalNodeTrace
import ad2petritraceability.ForkNodeTrace
import ad2petritraceability.ForkOrJoinNodeTrace
import ad2petritraceability.JoinNodeTrace
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivitydiagramFactory
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreter
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine
import org.gemoc.executionframework.engine.core.CommandExecution

class Ad2PetriFeedbackInterpreter implements FeedbackInterpreter {

	/**
	 * Mapping between source and target models.
	 */
	private var Ad2petriTraceability mapping

	/**
	 * This is where we send our translated steps.
	 */
	private var FeedbackEngine feedbackEngine

	private var TransactionalEditingDomain ed

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
		ed = TransactionUtil.getEditingDomain(staticSource2dynamicSource.entrySet.get(0).value)
	}

	/**
	 * TODO manage fork tokens
	 * TODO put in transaction
	 */
	private def void feedbackModelState() {

		val Map<Place, ActivityNode> merge = new HashMap

		// case init/action
		for (node2placeTrace : mapping.nonFinalNodeTraces) {
			val Place dynamicPlace = staticTarget2dynamicTarget.get(node2placeTrace.place) as Place
			val ActivityNode dynamicNode = staticSource2dynamicSource.get(node2placeTrace.originalNode) as ActivityNode
			merge.put(dynamicPlace, dynamicNode)
		}
		// case ForkOrJoinNodeTrace
		val Iterable<ForkOrJoinNodeTrace> forkOrJoinTraces = (mapping.forkNodeTraces + mapping.joinNodeTraces)
		for (forkOrJoinTrace : forkOrJoinTraces) {
			val Place dynamicPlace = staticTarget2dynamicTarget.get(forkOrJoinTrace.place) as Place
			val ActivityNode dynamicNode = staticSource2dynamicSource.get(forkOrJoinTrace.originalNode) as ActivityNode
			merge.put(dynamicPlace, dynamicNode)
		}

		// For all mappings
		for (a : merge.entrySet) {
			val diff = a.key.tokens - a.value.heldTokens.size
			// Add tokens
			if (diff > 0) {
				val EList<Token> newTokens = new BasicEList<Token>
				for (_ : 1 .. diff) {
					newTokens.add(ActivitydiagramFactory::eINSTANCE.createToken)
				}
				modifyModel[a.value.heldTokens.addAll(newTokens)]

			} // Remove tokens
			else if (diff < 0) {
				for (_ : 1 .. Math::abs(diff)) {
					val token = a.value.heldTokens.get(0)
					modifyModel[a.value.heldTokens.remove(token)]
				}
			}
		}

	}

	private def Activity findDynamicActivity(Net net) {
		val staticNet = staticTarget2dynamicTarget.entrySet.findFirst[it.value == net].key
		val staticActivity = mapping.activityTraces.findFirst[it.net == staticNet].originalActivity
		val dynamicActivity = staticSource2dynamicSource.get(staticActivity)
		return dynamicActivity as Activity
	}

	override processTargetStepStart(Step<?> targetStep) {

		// Feedback the model state (ie. modify the AD state)
		feedbackModelState()

		// There are only two possible steps: run and fire
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {

			// Follow traceability links
			val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
			val dynamicActivity = findDynamicActivity(runnedNet)

			// Feedback the step
			feedbackEngine.feedbackStartStep(dynamicActivity, dynamicActivity.eClass.name, "execute")
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
			// Follow dynamic->static mapping
			val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
			val staticTransition = staticTarget2dynamicTarget.entrySet.findFirst[it.value == firedTransition].key

			// Preparing mapped variables, to abuse xtend assignment expressions
			var ControlFlowTrace controlFlowTrace = null
			var FinalNodeTrace finalNodeTrace = null
			var ForkNodeTrace forkNodeTrace = null
			var JoinNodeTrace joinNodeTrace = null

			// Trying all mapping possibilities
			if ((controlFlowTrace = mapping.controlFlowTraces.findFirst[it.transition == staticTransition]) != null) {
				println("Mapped! " + controlFlowTrace)
			} else if ((finalNodeTrace = mapping.finalNodeTraces.findFirst[it.transition == staticTransition]) !=
				null) {
				println("Mapped! " + finalNodeTrace)
			} else if ((forkNodeTrace = mapping.forkNodeTraces.findFirst[it.transition == staticTransition]) != null) {
				println("Mapped! " + forkNodeTrace)
			} else if ((joinNodeTrace = mapping.joinNodeTraces.findFirst[it.transition == staticTransition]) != null) {
				println("Mapped! " + joinNodeTrace)
			} else {
				println("WARNING: the transition does not match anything? " + staticTransition)
			}

		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {

			feedbackEngine.feedbackEndStep
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith(
			"fire")) {
		}
		feedbackModelState()
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

	/**
	 * Wrapper using lambda to always use a RecordingCommand when modifying the model
	 */
	private def void modifyModel(Runnable r, String message) {

		val Set<Throwable> catchedException = new HashSet
		var RecordingCommand command = new RecordingCommand(ed, message) {
			protected override void doExecute() {
				try {
					r.run
				} catch (Throwable t) {
					catchedException.add(t)
				}
			}
		}
		CommandExecution::execute(ed, command)
		if (!catchedException.empty)
			throw catchedException.head
	}

	/**
	 * Same as above, but without message.
	 */
	private def void modifyModel(Runnable r) {
		modifyModel(r, "")
	}

}
