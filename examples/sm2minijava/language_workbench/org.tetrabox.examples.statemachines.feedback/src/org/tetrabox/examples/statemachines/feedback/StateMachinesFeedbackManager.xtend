package org.tetrabox.examples.statemachines.feedback

import gemoctraceability.AnnotatedElement
import gemoctraceability.TraceabilityModel
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackManager
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.CustomSystem
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.almostuml.Transition
import org.tetrabox.minijava.xminijava.aspects.FrameAspect
import org.tetrabox.minijava.xminijava.miniJava.ObjectInstance
import org.tetrabox.minijava.xminijava.miniJava.Program
import org.tetrabox.minijava.xminijava.miniJava.Return
import org.tetrabox.minijava.xminijava.miniJava.State
import org.tetrabox.minijava.xminijava.miniJava.Statement
import org.tetrabox.minijava.xminijava.miniJava.Method
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.CustomEvent

/**
 * 
 * initialize(program)
 * main(program)
 *  └─evaluateStatement()
 *  └─evaluateStatement()
 *  └─evaluateStatement()
 * 
 *  initialize(state machine)
 *  run(state machine)
 *    └─handle(state)
 *    │   └─fire(transition)
 *    └─handle(state)
 *        └─fire(transition)
 */
class StateMachinesFeedbackManager implements FeedbackManager {

	private val TraceabilityModel mapping
	private val FeedbackEngine feedbackEngine
	private val BatchModelChangeListener listener
	private val Map<EObject, AnnotatedElement> efficientAnnotatedMapping = new HashMap

	private var State targetModelState

	new(TraceabilityModel traceabilityModel, FeedbackEngine feedbackEngine) {
		this.mapping = traceabilityModel
		this.feedbackEngine = feedbackEngine
		val anyTargetElement = mapping.links.head.targetElements.head.element

		listener = new BatchModelChangeListener(#{anyTargetElement.eResource})
		listener.registerObserver(this)

		for (annot : mapping.eAllContents.filter(AnnotatedElement).toSet) {
			efficientAnnotatedMapping.put(annot.element, annot)
		}

	}

	override initialize() {
		targetModelState = (feedbackEngine.targetEngine.executionContext.resourceModel.contents.head as Program).state
	}

	static def boolean match(Step<?> step, String stepName) {
		step.mseoccurrence.mse.action.name.endsWith(stepName)
	}

	def EObject getCaller(Step<?> step) {
		step.mseoccurrence.mse.caller
	}

//	def AnnotatedElement getAnnotatedElement(Step<?> step) {
//		efficientAnnotatedMapping.get(step.mseoccurrence.mse.caller)
//	}
	def AnnotatedElement getAnnotatedElement(EObject o) {
		efficientAnnotatedMapping.get(o)
	}

	def Collection<? extends EObject> getSourceElements(EObject targetElement) {
		val annotatedElement = getAnnotatedElement(targetElement)
		if (annotatedElement === null) {
			return emptySet
		}
		val link = annotatedElement.link
		val result = link.sourceElements.map[it.element].toSet
		return result
	}

	def Collection<? extends EObject> getTargetElements(EObject sourceElement) {
		val annotatedElement = getAnnotatedElement(sourceElement)
		if (annotatedElement === null) {
			return emptySet
		}
		val link = annotatedElement.link
		val result = link.targetElements.map[it.element].toSet
		return result
	}

	var Step<?> currentExecuteStep

	override processTargetStepStart(Step<?> targetStep) {
		if (targetStep.match("initialize")) {
			val system = targetStep.caller.sourceElements.head as CustomSystem
			feedbackEngine.feedbackStartStep(system, "initialize")
		} else if (targetStep.match("main")) {
			val system = targetStep.caller.sourceElements.head as CustomSystem
			feedbackEngine.feedbackStartStep(system, "run")
		} else if (targetStep.match("execute")) {
			val targetMethod = targetStep.caller as Method // TODO retrieve event and pass it as arg to handle
			val targetEvent = targetMethod.sourceElements.get(0) as CustomEvent
			val targetObject = FrameAspect::findCurrentFrame(targetModelState.rootFrame).instance as ObjectInstance
			val targetType = targetObject.type
			if (targetType.implements.exists[it.name == "State"]) { // TODO find State using traceability links
				val sourceState = targetType.sourceElements.
					head as org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.almostuml.State
				currentExecuteStep = targetStep
				feedbackEngine.feedbackStartStep(sourceState, "handle", #[targetEvent])

			}

		} else if (targetStep.match("evaluateStatement") || targetStep.match("evaluateExpression")) {

			val targetStatement = targetStep.caller as Statement
			if (targetStatement instanceof Return) {
				val candidateTransition = targetStatement.expression.sourceElements.head
				if (candidateTransition !== null) {
					if (candidateTransition instanceof Transition) {
						feedbackEngine.feedbackStartStep(candidateTransition, "fire")
					}

				}
			}
		} else {
			println("Unsupported step: " + targetStep)
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		if (targetStep.match("initialize") || targetStep.match("main")) {
			feedbackEngine.feedbackEndStep
		} else if (targetStep === currentExecuteStep) {
			feedbackEngine.feedbackEndStep
			feedbackEngine.feedbackEndStep
		}
	}

	override feedbackState() {
	}

}
