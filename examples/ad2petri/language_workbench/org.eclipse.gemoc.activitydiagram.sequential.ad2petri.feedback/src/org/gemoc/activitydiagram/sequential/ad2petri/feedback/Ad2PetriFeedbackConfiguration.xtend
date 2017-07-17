package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.feedback

import gemoctraceability.TraceabilityModel
import org.eclipse.gemoc.execution.feedbackengine.FeedbackConfiguration
import org.eclipse.gemoc.execution.feedbackengine.FeedbackEngine
import org.eclipse.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine

class Ad2PetriFeedbackConfiguration implements FeedbackConfiguration {

	override createFeedbackInterpreter(TraceabilityModel traceability, FeedbackEngine feedbackEngine) {
		return new Ad2PetriFeedbackManager(traceability,
			feedbackEngine)
	}

	override createTargetEngine() {
		return new PlainK3ExecutionEngine()
	}

	override getTargetLanguageName() {
		"org.eclipse.gemoc.sample.petrinetv1.xdsml.XPetrinetv1"
	}

	override getTargetEntryPoint() {
		"public static void org.eclipse.gemoc.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.run(org.eclipse.gemoc.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net)"
	}

	override getTargetInitializationMethod() {
		"org.eclipse.gemoc.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect.initialize"
	}

}
