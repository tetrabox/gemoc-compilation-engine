package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import gemoctraceability.AnnotatedElement
import gemoctraceability.TraceabilityModel
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Activity
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramFactory
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.NamedElement
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreter

class Ad2PetriFeedbackInterpreter implements FeedbackInterpreter {

	private val TraceabilityModel mapping
	private val FeedbackEngine feedbackEngine

	new(TraceabilityModel traceabilityModel, FeedbackEngine feedbackEngine) {
		this.mapping = traceabilityModel
		this.feedbackEngine = feedbackEngine
	}

	static def Collection<Token> heldTokens(NamedElement e) {
		if(e instanceof ActivityNode) e.heldTokens else if(e instanceof ActivityEdge) e.heldTokens
	}

	def AnnotatedElement getAnnotatedElement(EObject o) {
		mapping.eAllContents.filter(AnnotatedElement).findFirst[it.element == o]
	}

	private def void initializeSourceState() {
		for (link : mapping.links) {
			val place = link.targetElements.map[element].filter(Place).head
			if (place != null) {
				val tokenHolder = link.sourceElements.head.element as NamedElement
				val diff = place.tokens - tokenHolder.heldTokens.size
				for (var i = 0; i< Math.abs(diff); i++) {
					if (diff > 0)
						tokenHolder.heldTokens.add(ActivitydiagramFactory::eINSTANCE.createToken)
					else
						tokenHolder.heldTokens.remove(tokenHolder.heldTokens.head)
				}
			}
		}
	}

	override processTargetStepStart(Step<?> targetStep) {
		if (targetStep.mseoccurrence.mse.action.name.endsWith("initialize")) {
			val annotatedNet = getAnnotatedElement(targetStep.mseoccurrence.mse.caller)
			val activity = annotatedNet.link.sourceElements.head.element as Activity
			feedbackEngine.feedbackStartStep(activity, activity.eClass.name, "initialize")
		} else {
			if (targetStep.mseoccurrence.mse.action.name.endsWith("run")) {
				val annotatedNet = getAnnotatedElement(targetStep.mseoccurrence.mse.caller)
				val activity = annotatedNet.link.sourceElements.head.element as Activity
				feedbackEngine.feedbackStartStep(activity, activity.eClass.name, "execute")
			} else if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
				val annotTransition = getAnnotatedElement(targetStep.mseoccurrence.mse.caller as Transition)
				val node = annotTransition.link.sourceElements.head.element as ActivityNode
				if (annotTransition.annotation.equals("take")) {
					feedbackEngine.feedbackStartStep(node, ActivityNode.name, "execute")
					feedbackEngine.feedbackStartStep(node, ActivityNode.name, "take")
				} else if (annotTransition.annotation.equals("offer")) {
					if (node instanceof InitialNode)
						feedbackEngine.feedbackStartStep(node, ActivityNode.name, "execute")
					feedbackEngine.feedbackStartStep(node, ActivityNode.name, "offer")
				}
			}
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		initializeSourceState()
		feedbackEngine.feedbackEndStep()
		if (targetStep.mseoccurrence.mse.action.name.endsWith("fire")) {
			val annotatedTransition = getAnnotatedElement(targetStep.mseoccurrence.mse.caller as Transition)
			val node = annotatedTransition.link.sourceElements.head.element as ActivityNode
			if (annotatedTransition.annotation.equals("take")) {
				if (node instanceof FinalNode)
					feedbackEngine.feedbackEndStep
			} else if (annotatedTransition.annotation.equals("offer")) {
				feedbackEngine.feedbackEndStep
			}
		}
	}
}
