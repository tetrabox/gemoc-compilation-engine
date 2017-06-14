package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivitydiagramFactory
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlFlow
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.FinalNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token
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
		this.ed = TransactionUtil::getEditingDomain(traceabilityModel.links.head.sourceElements.head)
	}

	/**
	 * TODO manage fork tokens
	 */
	private def void feedbackModelState() {
		// For all links
		for (link : mapping.links) {
			val dynamicPlace = link.targetElements.filter(Place).head
			val dynamicNode = link.sourceElements.filter(ActivityNode).head
			if (dynamicPlace != null && dynamicNode != null) {
				val diff = dynamicPlace.tokens - dynamicNode.heldTokens.size
				// Add tokens
				if (diff > 0) {
					val EList<Token> newTokens = new BasicEList<Token>
					for (_ : 1 .. diff) {
						newTokens.add(ActivitydiagramFactory::eINSTANCE.createToken)
					}
					dynamicNode.heldTokens.addAll(newTokens)

				} // Remove tokens
				else if (diff < 0) {
					for (_ : 1 .. Math::abs(diff)) {
						val token = dynamicNode.heldTokens.get(0)
						dynamicNode.heldTokens.remove(token)
					}
				}
			}
		}

	}

	private def Activity findDynamicActivity(Net net) {
		return mapping.links.findFirst[it.targetElements.contains(net)].sourceElements.filter(Activity).head
	}

	override processTargetStepStart(Step<?> targetStep) {
		if (targetStep.mseoccurrence.mse.action.name.endsWith("initialize")) {
			val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
			val dynamicActivity = findDynamicActivity(runnedNet)
			feedbackEngine.feedbackStartStep(dynamicActivity, dynamicActivity.eClass.name, "initialize")
		} else {
			// At this point we are in a step/transaction
			feedbackModelState()
			if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
				val Net runnedNet = targetStep.mseoccurrence.mse.caller as Net
				val dynamicActivity = findDynamicActivity(runnedNet)
				feedbackEngine.feedbackStartStep(dynamicActivity, dynamicActivity.eClass.name, "execute")
			} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
				val Transition firedTransition = targetStep.mseoccurrence.mse.caller as Transition
				val link = mapping.links.findFirst[it.targetElements.contains(firedTransition)]
				if (link != null) {
					val EObject source =  link.sourceElements.head
					switch(source) {
						InitialNode:{}
						ControlFlow:{}
						FinalNode:{}
						JoinNode:{}
						ForkNode:{}
					}
					println("Mapped! " + link)
				}
			}
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		feedbackModelState()
		if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
			feedbackEngine.feedbackEndStep
		} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
		}
	}

	override processTargetExecutionEnd() {
		feedbackModelState()
	}

}
