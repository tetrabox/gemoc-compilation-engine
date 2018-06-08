package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.Interface
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.almostuml.State

class StateTransformer {

	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateMachineTransformer stateMachineTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var CustomEventTransformer customEventTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var TransitionTransformer transitionTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
	}

	def Link transform(State state) {

		var result = getExistingLink(state)
		if (!result.present) {
			// Create trace
			val newLink = GemoctraceabilityFactory::eINSTANCE.createLink
			newLink.sourceElements.add(createAnnotatedElement(newLink, state))
			mapping.links.add(newLink)

			// Output: state class
			val stateClass = MiniJavaFactory::eINSTANCE.createClass => [name = state.name]
			newLink.targetElements.add(createAnnotatedElement(newLink, stateClass))

			// Transform events and connect
			for (event : state.stateMachine.events) {
				val eventLink = transform(event)
				val targetMethod = eventLink.targetElements.findFirst[it.annotation == state.name + "_method"].element as Method
				stateClass.members.add(targetMethod)
			}
			// Transform state machine and connect
			val stateMachineLink = transform(state.stateMachine)
			val stateInterface = stateMachineLink.targetElements.findFirst[it.annotation == "stateInterface"].
				element as Interface
			stateClass.implements.add(stateInterface)

			return newLink

		} else {
			return result.get
		}

	}
}
