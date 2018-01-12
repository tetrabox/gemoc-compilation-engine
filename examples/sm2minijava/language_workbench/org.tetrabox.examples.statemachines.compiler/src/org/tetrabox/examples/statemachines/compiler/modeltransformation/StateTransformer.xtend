package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import java.util.HashMap
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.ClassRef
import org.tetrabox.minijava.xtext.miniJava.Interface
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.almostuml.FinalState
import statemachines.almostuml.State
import statemachines.almostuml.Transition
import java.util.HashSet
import org.tetrabox.minijava.xtext.miniJava.NewObject

class StateTransformer {

	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateMachineTransformer stateMachineTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var CustomEventTransformer customEventTransformer

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

			// Output: one method per event
			val postponedNews = new HashMap<Transition, NewObject>
			val postponedMethodTypes = new HashSet<ClassRef>
			for (event : state.stateMachine.events) {
				val eventMethodBodyreturnStatement = MiniJavaFactory::eINSTANCE.createReturn
				val matchingTransition = event.stateMachine.region.head.transition.findFirst [
					it.trigger.exists[it.event == event]
				]
				// if state is final, return null
				if (state instanceof FinalState) {
					eventMethodBodyreturnStatement.expression = MiniJavaFactory::eINSTANCE.createNull
				} else // if a transition exists with the even, return the new state
				if (matchingTransition !== null) {
					val expr = MiniJavaFactory::eINSTANCE.createNewObject
					eventMethodBodyreturnStatement.expression = expr
					postponedNews.put(matchingTransition, expr)
				} else {
					eventMethodBodyreturnStatement.expression = MiniJavaFactory::eINSTANCE.createThis
				}
				val eventMethodBody = MiniJavaFactory::eINSTANCE.createBlock
				eventMethodBody.statements.add(eventMethodBodyreturnStatement)
				val methodType = MiniJavaFactory::eINSTANCE.createClassRef
				postponedMethodTypes.add(methodType)
				val eventMethod = MiniJavaFactory::eINSTANCE.createMethod => [
					name = event.name;
					access = AccessLevel::PUBLIC;
					typeRef = methodType
					body = eventMethodBody
				]
				stateClass.members.add(eventMethod)
			}

			// Transform target states and connect
			for (t : postponedNews.keySet) {
				val expr = postponedNews.get(t)
				val targetStateLink = transform(t.target as State)
				val targetStateClass = targetStateLink.targetElements.map[element].filter(Class).head
				expr.type = targetStateClass
			}

			// Transform state machine and connect
			val stateMachineLink = transform(state.stateMachine)
			val stateInterface = stateMachineLink.targetElements.findFirst[it.annotation == "stateInterface"].
				element as Interface
			stateClass.implements.add(stateInterface)
			for (cr : postponedMethodTypes) {
				cr.referencedClass = stateInterface
			}

		}

		return result
	}
}
