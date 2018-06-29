package org.tetrabox.examples.statemachines.feedback

import gemoctraceability.AnnotatedElement
import gemoctraceability.TraceabilityModel
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Optional
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackManager
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.CustomEvent
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.CustomSystem
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.StatemachinesFactory
import org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.almostuml.Transition
import org.tetrabox.minijava.xminijava.aspects.FrameAspect
import org.tetrabox.minijava.xminijava.miniJava.ArrayRefValue
import org.tetrabox.minijava.xminijava.miniJava.FieldBinding
import org.tetrabox.minijava.xminijava.miniJava.ForStatement
import org.tetrabox.minijava.xminijava.miniJava.Method
import org.tetrabox.minijava.xminijava.miniJava.ObjectInstance
import org.tetrabox.minijava.xminijava.miniJava.ObjectRefValue
import org.tetrabox.minijava.xminijava.miniJava.Program
import org.tetrabox.minijava.xminijava.miniJava.Return
import org.tetrabox.minijava.xminijava.miniJava.State
import org.tetrabox.minijava.xminijava.miniJava.Statement
import org.tetrabox.minijava.xminijava.miniJava.StringValue
import org.tetrabox.minijava.xminijava.miniJava.SymbolBinding

/**
 * 
 * initialize(program)    <--- does not set the initial state!
 * main(program)
 *  └─evaluateStatement() <--- the initial state is set around here!
 *  └─evaluateStatement()
 *  └─evaluateStatement()
 * 
 *  initialize(state machine) <--- should set the initial state!
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
	private val Map<EObject, Set<AnnotatedElement>> efficientAnnotatedMapping = new HashMap

	private var State targetModelState
	private var CustomSystem sourceModel

	new(TraceabilityModel traceabilityModel, FeedbackEngine feedbackEngine) {
		this.mapping = traceabilityModel
		this.feedbackEngine = feedbackEngine
		val anyTargetElement = mapping.links.head.targetElements.head.element

		listener = new BatchModelChangeListener(#{anyTargetElement.eResource})
		listener.registerObserver(this)

		for (annot : mapping.eAllContents.filter(AnnotatedElement).toSet) {
			if (!efficientAnnotatedMapping.containsKey(annot.element)) {
				efficientAnnotatedMapping.put(annot.element, new HashSet)
			}
			efficientAnnotatedMapping.get(annot.element).add(annot)
		}
	}

	static def boolean match(Step<?> step, String stepName) {
		step.mseoccurrence.mse.action.name.endsWith(stepName)
	}

	def EObject getCaller(Step<?> step) {
		step.mseoccurrence.mse.caller
	}

	def Set<AnnotatedElement> getAnnotatedElements(EObject o) {
		if (efficientAnnotatedMapping.containsKey(o))
			return efficientAnnotatedMapping.get(o)
		else
			return Collections::emptySet()
	}

	def Collection<? extends EObject> getSourceElements(EObject targetElement) {
		return getSourceAnnotatedElements(targetElement).map[it.element].toSet
	}

	def Collection<? extends AnnotatedElement> getSourceAnnotatedElements(EObject targetElement) {
		val annotatedElement = getAnnotatedElements(targetElement)
		if (annotatedElement === null) {
			return emptySet
		}
		return annotatedElement.map[it.link].map[it.sourceElements].flatten.toSet
	}

	def Collection<? extends EObject> getTargetElements(EObject sourceElement) {
		val annotatedElement = getAnnotatedElements(sourceElement)
		if (annotatedElement === null) {
			return emptySet
		}
		return annotatedElement.map[it.link].map[it.targetElements].flatten.toSet
	}

	var Step<?> currentExecuteStep

	override processTargetStepStart(Step<?> targetStep) {
		if (targetStep.match("initialize")) {
			val system = targetStep.caller.sourceElements.head as CustomSystem
			feedbackEngine.feedbackStartStep(system, "initialize")
		} else if (targetStep.match("evaluateStatement")) {
			val targetStatement = targetStep.caller as Statement
			if (targetStatement instanceof Return) {
				val candidateTransition = targetStatement.expression.sourceElements.head
				if (candidateTransition !== null) {
					if (candidateTransition instanceof Transition) {
						feedbackEngine.feedbackStartStep(candidateTransition, "fire")
					}
				}
			} else if (targetStatement instanceof ForStatement) {
				// End of initialize
				feedbackEngine.feedbackEndStep
				// Start of run
				feedbackEngine.feedbackStartStep(sourceModel.statemachine, "run")
			}
		} else if (targetStep.match("call")) {
			val targetObject = FrameAspect::findCurrentFrame(targetModelState.rootFrame).instance as ObjectInstance
			val targetType = targetObject.type
			val targetMethod = targetStep.caller as Method
			val annotatedTargetMethod = Optional::ofNullable(targetMethod.annotatedElements.findFirst [
				it.annotation.endsWith("_method")
			])

			if (annotatedTargetMethod.isPresent) {
				val sourceEvent = annotatedTargetMethod.get.element.sourceElements.get(0) as CustomEvent
				val sourceState = targetType.sourceElements.
					head as org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.almostuml.State
				currentExecuteStep = targetStep
				feedbackEngine.feedbackStartStep(sourceState, "handle", #[sourceEvent])
			}
		}
	}

	override processTargetStepEnd(Step<?> targetStep) {
		if (targetStep.match("run")) {
			feedbackEngine.feedbackEndStep
		} else if (targetStep.match("call")) {
			val targetMethod = targetStep.caller as Method
			val annotatedStateMachineTargetMethod = Optional::ofNullable(targetMethod.annotatedElements.findFirst [
				it.annotation == "method"
			])
			if (annotatedStateMachineTargetMethod.isPresent) {
				feedbackEngine.feedbackEndStep
				feedbackEngine.feedbackEndStep
			}
		}
	}

	override feedbackState() {

		// Get source and target states, if needed
		if (targetModelState === null)
			targetModelState = (feedbackEngine.targetEngine.executionContext.resourceModel.contents.head as Program).
				state
		if (sourceModel === null)
			sourceModel = feedbackEngine.executionContext.resourceModel.contents.get(0) as CustomSystem

		// If both target and source states are available, then we feedback
		if (targetModelState !== null && sourceModel !== null) {
			val changes = listener.getChanges(this)
			for (change : changes) {
				val changedObject = change.changedObject
				// If the MiniJava State object was created, we find the args and recreate a SM queue 
				if (change instanceof NewObjectModelChange) {
					if (changedObject instanceof State) {
						val argsBinding = changedObject.rootFrame.rootContext.bindings.findFirst [
							it.symbol.name == "args"
						]
						val argsValues = (argsBinding.value as ArrayRefValue).instance
						for (argsValue : argsValues.value.filter(StringValue).map[value]) {
							val correspondingEvent = sourceModel.events.findFirst[it.name == argsValue]
							if (correspondingEvent !== null) {
								val occurrence = StatemachinesFactory::eINSTANCE.createEventOccurrence => [
									event = correspondingEvent
								]
								sourceModel.statemachine.queue.add(occurrence)
							}
						}
					}
				}

				// If the "eventName" variable is changed, we remove the corresponding event from the queue
				if (changedObject instanceof SymbolBinding) {
					val symbolName = changedObject.symbol.name
					if (symbolName == "eventName") {
						val eventName = (changedObject.value as StringValue).value
						val correspondingEvent = sourceModel.events.findFirst[it.name == eventName]
						if (sourceModel.statemachine.queue.head.event == correspondingEvent) {
							sourceModel.statemachine.queue.remove(sourceModel.statemachine.queue.head)
						}
					}
				}

				// If a field called "current" was changed in MiniJava, we change the SM current state 
				if (changedObject instanceof FieldBinding) {
					val fieldName = changedObject.field.name
					if (fieldName == "current") {
						val stateRef = changedObject.value as ObjectRefValue
						val stateType = stateRef.instance.type
						val sourceSMState = stateType.sourceElements.
							head as org.tetrabox.examples.statemachines.compiledstatemachines.statemachines.almostuml.State
						sourceModel.statemachine.region.head.currentState = sourceSMState
					}
				}
			}
		}
	}
}
