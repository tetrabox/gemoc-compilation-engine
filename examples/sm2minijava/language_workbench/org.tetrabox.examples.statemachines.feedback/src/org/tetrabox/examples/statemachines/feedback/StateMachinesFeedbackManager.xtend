package org.tetrabox.examples.statemachines.feedback

import gemoctraceability.AnnotatedElement
import gemoctraceability.TraceabilityModel
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackManager


/**
 * 
 *
 * main(program)
 *  └─evaluateStatement()
 *  └─evaluateStatement()
 *  └─evaluateStatement()
 * 
 *  run(state machine)
 *	   └─handle(state)
 *	   │   └─fire(transition)
 *     └─handle(state)
 *	       └─fire(transition)
 */
class StateMachinesFeedbackManager implements FeedbackManager {

	private val TraceabilityModel mapping
	private val FeedbackEngine feedbackEngine
	private val BatchModelChangeListener listener
	private val Map<EObject, AnnotatedElement> efficientAnnotatedMapping = new HashMap
	
	new(TraceabilityModel traceabilityModel, FeedbackEngine feedbackEngine) {
		this.mapping = traceabilityModel
		this.feedbackEngine = feedbackEngine
		val anyTargetElement = mapping.links.head.targetElements.head.element

		listener = new BatchModelChangeListener(#{anyTargetElement.eResource})
		listener.registerObserver(this)

		for (annot : mapping.eAllContents.filter(AnnotatedElement).toSet) {
			efficientAnnotatedMapping.put(annot.element,annot)
		}
	}
	
	
	
	override processTargetStepStart(Step<?> targetStep) {
		
		//TODO main program == run system + run state machine
		
		//TODO evaluate methodcall 
		
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override processTargetStepEnd(Step<?> targetStep) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override feedbackState() {
		
	}

}
