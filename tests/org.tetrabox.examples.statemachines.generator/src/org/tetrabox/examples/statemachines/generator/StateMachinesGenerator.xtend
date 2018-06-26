package org.tetrabox.examples.statemachines.generator

import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.HashSet
import java.util.Iterator
import java.util.List
import java.util.Random
import java.util.Set
import statemachines.CustomSystem
import statemachines.StatemachinesFactory
import statemachines.almostuml.AlmostumlFactory
import statemachines.almostuml.Event
import statemachines.almostuml.FinalState
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.State
import statemachines.almostuml.Transition

class StateMachinesGenerator {

	static val factory1 = StatemachinesFactory.eINSTANCE
	static val factory2 = AlmostumlFactory.eINSTANCE
	private static val random = new Random

	private def static <T> T randomPoll(Collection<T> collection) {
		val index = random.nextInt(collection.size)
		return collection.get(index)
	}

	protected def static Set<Transition> outTransitions(State state) {
		state.container.transition.filter[it.source === state].toSet
	}

	protected def static Set<Transition> inTransitions(State state) {
		state.container.transition.filter[it.target === state].toSet
	}

	def CustomSystem generate(int nbStates, int nbEvents) {

		// Create region
		val reg = factory2.createRegion => [
			name = "uniqueregion"
		]

		// Create state machine
		val sm = factory2.createStateMachine => [
			name = '''statemachine_«nbStates»_«nbEvents»'''
		]
		sm.region.add(reg)

		// Create system
		val system = factory1.createCustomSystem => [
			statemachine = sm
		]

		// Create events
		for (int x : 0 .. nbEvents) {
			val event = factory1.createCustomEvent => [
				name = "event" + x
			]
			system.events.add(event)
		}

		// Create normal states
		val normalStates = new HashSet<State>
		for (int x : 0 .. nbStates) {
			val state = factory2.createState => [
				name = "state" + x
			]
			normalStates.add(state)
			reg.subvertex.add(state)
		}

		// Create initial state
		val Pseudostate initial = factory2.createPseudostate => [
			name = "initial"
			kind = PseudostateKind::INITIAL
		]
		reg.subvertex.add(initial)

		// Create final state
		val FinalState final = factory2.createFinalState => [
			name = "final"
		]
		reg.subvertex.add(final)

		// For each normal state, connect to initial and final
		val nonFinalStates = (normalStates + #{initial}).toSet.immutableCopy
		val nonInitialStates = (normalStates + #{final}).toSet.immutableCopy
		val connectedToInit = new HashSet<State>
		connectedToInit.add(initial)
		val connectedToFinal = new HashSet<State>
		connectedToFinal.add(final)
		for (state : normalStates) {
			reverseConnectToInit(connectedToInit, nonFinalStates, initial, state)
			connectToFinal(connectedToFinal, nonInitialStates, final, state)
		}

		return system
	}

	public def generateScenario(CustomSystem system) {
//		// Generate scenarios
//		for (int i : 0..nbScenarios) {
		val List<Event> scenario = new ArrayList
		var State current = system.statemachine.region.head.subvertex.filter(Pseudostate).get(0)
		var State final = system.statemachine.region.head.subvertex.filter(FinalState).get(0)
		while (current != final) {
			val transition = current.outTransitions.randomPoll
			scenario.add(transition.trigger.head.event)
			current = transition.target as State
		}
		return scenario
//		}
	}

	protected def void reverseConnectToInit(Set<State> connectedToInit, Set<State> allButFinalStates, State initial,
		State state) {
		val visitedStates = new HashSet<State>
		var State currentToInit = state
		val shuffled = allButFinalStates.toList
		Collections::shuffle(shuffled)
		val Iterator<State> i = shuffled.iterator
		while (currentToInit != initial && !connectedToInit.contains(currentToInit)) {
			val currentToInit_final = currentToInit
			visitedStates.add(currentToInit)

			val randomState = i.next
			val region = currentToInit_final.container
			val system = region.stateMachine.eContainer as CustomSystem

			// if there is no existing transition, we create one
			if (!randomState.outTransitions.exists[it.target === currentToInit_final]) {

				// pick event unused in this state
				val usedEvents = randomState.outTransitions.map[trigger].flatten.map[event].toSet
				val e = system.events.filter[!usedEvents.contains(it)].toSet.randomPoll

				// create trigger
				val trigger = factory2.createTrigger => [
					name = '''trigger_«randomState.name»_«e.name»'''
					event = e
				]

				// connect to it
				val transition = factory2.createTransition => [
					name = '''«randomState.name»_to_«currentToInit_final.name»'''
					source = randomState
					target = currentToInit_final
				]
				transition.trigger.add(trigger)
				region.transition.add(transition)

			}
			currentToInit = randomState
		}
		connectedToInit.addAll(visitedStates)

	}

	protected def void connectToFinal(Set<State> connectedToFinal, Set<State> allButInitialStates, State finl,
		State state) {
		val visitedStates = new HashSet<State>
		val shuffled = allButInitialStates.toList
		Collections::shuffle(shuffled)
		val Iterator<State> i = shuffled.iterator
		var State currentToFinal = state
		while (currentToFinal != finl && !connectedToFinal.contains(currentToFinal)) {
			val currentToFinal_final = currentToFinal
			visitedStates.add(currentToFinal)
			val randomState = i.next
			val region = currentToFinal_final.container
			val system = region.stateMachine.eContainer as CustomSystem

			// if there is no existing transition, we create one
			if (!randomState.inTransitions.exists[it.source === currentToFinal_final]) {

				// pick event unused in this state
				val usedEvents = currentToFinal_final.outTransitions.map[trigger].flatten.map[event].toSet
				val e = system.events.filter[!usedEvents.contains(it)].toSet.randomPoll

				// create trigger
				val trigger = factory2.createTrigger => [
					name = '''trigger_«currentToFinal_final.name»_«e.name»'''
					event = e
				]

				// connect to it
				val transition = factory2.createTransition => [
					name = '''«currentToFinal_final.name»_to_«randomState.name»'''
					source = currentToFinal_final
					target = randomState
				]
				transition.trigger.add(trigger)
				region.transition.add(transition)
			}
			currentToFinal = randomState
		}
		connectedToFinal.addAll(visitedStates)
	}

}
