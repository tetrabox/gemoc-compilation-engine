package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import statemachines.almostuml.State

class StateTransformer {
	
private var TraceabilityModel mapping
	private extension var org.tetrabox.examples.statemachines.compiler.Util util
		
	new(TraceabilityModel model) {
		this.mapping = model
		util = new org.tetrabox.examples.statemachines.compiler.Util(mapping)
	}

	def Link transform(State state) {

		var result = getExistingLink(state)
		if (result === null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, state))
			mapping.links.add(result)

			// Create state Class
		//	val stateClass = MiniJavaFactory::eINSTANCE.createClass => [name = state.name]
			//transform(state.stateMachine).targetElements

		// If initial state, create constructor call in state machine
		}

		return result
	}
}
