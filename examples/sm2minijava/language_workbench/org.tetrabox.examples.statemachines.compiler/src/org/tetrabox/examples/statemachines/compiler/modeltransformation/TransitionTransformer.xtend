package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Interface
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.CustomEvent
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition

class TransitionTransformer {
	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateTransformer stateTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateMachineTransformer stateMachineTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
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
			val event = transition.trigger.head.event as CustomEvent
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
			val StateMachine stateMachine = transition.stateMachine
			val linkStateMachine = transform(stateMachine)
			val stateInterface = linkStateMachine.targetElements.findFirst[it.annotation == "stateInterface"].element as Interface
			methodType.referencedClass = stateInterface
			
			// Transform target state and connect
			val linkTargetState = transform(transition.target as State)
			val stateClass = linkTargetState.targetElements.head.element as Class
			methodBodyReturnNew.type = stateClass

		}
		return result
	}
}
