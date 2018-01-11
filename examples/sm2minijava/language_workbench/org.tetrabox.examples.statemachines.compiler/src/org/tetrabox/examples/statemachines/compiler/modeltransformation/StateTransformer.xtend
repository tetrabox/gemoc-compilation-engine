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
	private extension var TransitionTransformer transitionTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateMachineTransformer stateMachineTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
	}

	def Link transform(State state) {

		var result = getExistingLink(state)
		if (result === null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, state))
			mapping.links.add(result)

			// Output: state class
			val stateClass = MiniJavaFactory::eINSTANCE.createClass => [name = state.name]
			result.targetElements.add(createAnnotatedElement(result, stateClass))

			// Transform transitions and connect
			for (t : state.stateMachine.region.head.transition) {
				val link = transform(t)
				val transitionMethod = link.targetElements.head.element as Method
				stateClass.members.add(transitionMethod)
			}

			// Transform state machine and connect
			val stateMachineLink = transform(state.stateMachine)
			val stateInterface = stateMachineLink.targetElements.
				findFirst[it.annotation == "stateInterface"] as Interface
			stateClass.implements.add(stateInterface)

		}

		return result
	}
}
