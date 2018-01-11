package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.CustomEvent
import statemachines.almostuml.Transition
import statemachines.almostuml.State

class TransitionTransformer {
	private var TraceabilityModel mapping
	private extension var Util util
	private extension var StateTransformer stateTransformer
	private extension var StateMachineTransformer stateMachineTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
		stateTransformer = new StateTransformer(mapping)
		stateMachineTransformer = new StateMachineTransformer(mapping)
	}

	def Link transform(Transition transition) {

		var result = getExistingLink(transition)
		if (result === null) {
			
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, transition))
			mapping.links.add(result)

			// Output: method
			val methodBodyReturnNew = MiniJavaFactory::eINSTANCE.createNewObject
			val methodBodyReturn = MiniJavaFactory::eINSTANCE.createReturn => [
				expression = methodBodyReturnNew
			]
			val methodBody = MiniJavaFactory::eINSTANCE.createBlock
			methodBody.statements.add(methodBodyReturn)
			val methodType = MiniJavaFactory::eINSTANCE.createClassRef
			val event = transition.trigger.head as CustomEvent
			val method = MiniJavaFactory::eINSTANCE.createMethod => [
				access = AccessLevel::PUBLIC
				body = methodBody
				typeRef = methodType
				name = event.name
			]
			result.targetElements.add(createAnnotatedElement(result,method))
			
			// Add method to target elements of event link
			//mapping.links.findFirst[it.sourceElements.contains()]
			
			// Transform state machine and connect
			val linkStateMachine = transform(transition.stateMachine)
			val stateInterface = linkStateMachine.targetElements.findFirst[it == "stateInterface"] as Class
			methodType.referencedClass = stateInterface
			
			// Transform target state and connect
			val linkTargetState = transform(transition.target as State)
			val stateClass = linkTargetState.targetElements.head as Class
			methodBodyReturnNew.type = stateClass

		}
		return result
	}
}
