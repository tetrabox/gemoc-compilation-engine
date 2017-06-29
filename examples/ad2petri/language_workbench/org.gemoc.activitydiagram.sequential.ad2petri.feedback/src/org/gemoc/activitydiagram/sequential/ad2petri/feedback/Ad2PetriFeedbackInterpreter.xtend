package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import gemoctraceability.AnnotatedElement
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Activity
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramFactory
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlFlow
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreter

class Ad2PetriFeedbackInterpreter implements FeedbackInterpreter {

	/**
	 * Mapping between source and target models.
	 */
	private val TraceabilityModel mapping

	/**
	 * This is where we send our translated steps.
	 */
	private val FeedbackEngine feedbackEngine

	private val TransactionalEditingDomain ed

	new(TraceabilityModel traceabilityModel, FeedbackEngine feedbackEngine) {
		this.mapping = traceabilityModel
		this.feedbackEngine = feedbackEngine
		this.ed = TransactionUtil::getEditingDomain(traceabilityModel.links.head.sourceElements.head.element)
	}

	/**
	 * TODO manage fork tokens
	 */
	private def void feedbackModelState() {
		// For all links
		for (link : mapping.links) {
			val place = link.targetElements.map[element].filter(Place).head
			val node = link.sourceElements.map[element].filter(ActivityNode).head
			val edge = link.sourceElements.map[element].filter(ControlFlow).head

			if (place != null) {
				// Case node
				if (node != null) {
					val diff = place.tokens - node.heldTokens.size
					// Add tokens
					if (diff > 0) {
						val EList<Token> newTokens = new BasicEList<Token>
						for (_ : 1 .. diff) {
							newTokens.add(ActivitydiagramFactory::eINSTANCE.createToken)
						}
						node.heldTokens.addAll(newTokens)

					} // Remove tokens
					else if (diff < 0) {
						for (_ : 1 .. Math::abs(diff)) {
							val token = node.heldTokens.get(0)
							node.heldTokens.remove(token)
						}
					}
				} // Case edge
				else if (edge != null) {
					val diff = place.tokens - edge.heldTokens.size
					// Add tokens
					if (diff > 0) {
						val EList<Token> newTokens = new BasicEList<Token>
						for (_ : 1 .. diff) {
							newTokens.add(ActivitydiagramFactory::eINSTANCE.createToken)
						}
						edge.heldTokens.addAll(newTokens)

					} // Remove tokens
					else if (diff < 0) {
						for (_ : 1 .. Math::abs(diff)) {
							val token = edge.heldTokens.get(0)
							edge.heldTokens.remove(token)
						}
					}
				}
			}
		}
	}

	private def Activity getActivity(Net net) {
		return mapping.links.findFirst[it.targetElements.map[element].contains(net)].sourceElements.map[element].filter(
			Activity).head
	}

	var boolean initial = true

	override processTargetStepStart(Step<?> targetStep) {
		if (targetStep.mseoccurrence.mse.action.name.endsWith("initialize")) {
			val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
			val activity = getActivity(runnedNet)
			feedbackEngine.feedbackStartStep(activity, activity.eClass.name, "initialize")
		} else {
			feedbackModelState()
			if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
				val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
				val activity = getActivity(runnedNet)
				feedbackEngine.feedbackStartStep(activity, activity.eClass.name, "execute")
			} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
				val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
				val link = mapping.links.findFirst[it.targetElements.map[element].contains(firedTransition)]
				if (link != null) {
					val AnnotatedElement targetElement = link.targetElements.findFirst[e|e.element == firedTransition]
					val AnnotatedElement sourceElement = link.sourceElements.head
					if (targetElement.annotation.equals("take")) {
						feedbackEngine.feedbackStartStep(sourceElement.element, ActivityNode.name, "execute")
						feedbackEngine.feedbackStartStep(sourceElement.element, ActivityNode.name, "take")
					} else if (targetElement.annotation.equals("offer")) {
						// The first "offer" is for the initial node, which does not "take" any tokens
						if (initial) {
							feedbackEngine.feedbackStartStep(sourceElement.element, ActivityNode.name, "execute")
							initial = false
						}
						feedbackEngine.feedbackStartStep(sourceElement.element, ActivityNode.name, "offer")
					}
				}
			}
		}

	}

	override processTargetStepEnd(Step<?> targetStep) {
		feedbackModelState()
		if (targetStep.mseoccurrence.mse.action.name.endsWith("initialize")) {
			feedbackEngine.feedbackEndStep
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
			// We first end the final node execute 
			feedbackEngine.feedbackEndStep
			// Then we end the activity
			feedbackEngine.feedbackEndStep
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
			val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
			val link = mapping.links.findFirst[it.targetElements.map[element].contains(firedTransition)]
			if (link != null) {
				val AnnotatedElement targetElement = link.targetElements.findFirst[e|e.element == firedTransition]
				if (targetElement.annotation.equals("take")) {
					feedbackEngine.feedbackEndStep()
				} else if (targetElement.annotation.equals("offer")) {
					// First we end the node offer
					feedbackEngine.feedbackEndStep() // Then we end the node execute
					feedbackEngine.feedbackEndStep
				}
			}

		}
	}

	override processTargetExecutionEnd() {
		feedbackModelState()
	}

}
