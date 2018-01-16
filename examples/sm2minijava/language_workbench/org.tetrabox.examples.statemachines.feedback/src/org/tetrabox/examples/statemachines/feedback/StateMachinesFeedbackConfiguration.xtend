package org.tetrabox.examples.statemachines.feedback

import org.gemoc.execution.feedbackengine.FeedbackConfiguration
import org.gemoc.execution.feedbackengine.FeedbackEngine
import gemoctraceability.TraceabilityModel
import org.eclipse.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine

class StateMachinesFeedbackConfiguration implements FeedbackConfiguration {
	
	override createFeedbackManager(TraceabilityModel traceability, FeedbackEngine feedbackEngine) {
		return new StateMachinesFeedbackManager(traceability,feedbackEngine)
	}
	
	override createTargetEngine() {
		return new PlainK3ExecutionEngine()
	}
	
	override getTargetEntryPoint() {
		"public static void org.tetrabox.minijava.xminijava.aspects.ProgramAspect.main(org.tetrabox.minijava.xminijava.miniJava.Program)"
	}
	
	override getTargetLanguageName() {
		"org.tetrabox.minijava.XMiniJava"
	}
	
	override getTargetInitializationMethod() {
		"org.tetrabox.minijava.xminijava.aspects.ProgramAspect.initialize"
	}
	

}