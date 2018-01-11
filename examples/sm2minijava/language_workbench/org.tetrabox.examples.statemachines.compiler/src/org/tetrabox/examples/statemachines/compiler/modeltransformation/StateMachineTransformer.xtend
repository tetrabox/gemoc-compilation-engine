package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.IfStatement
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import org.eclipse.xtend.lib.annotations.Accessors

class StateMachineTransformer {

	private var TraceabilityModel mapping
	private extension var org.tetrabox.examples.statemachines.compiler.Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var EventTransformer eventTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateTransformer stateTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new org.tetrabox.examples.statemachines.compiler.Util(mapping)
	}
	


	/**
	 *    class <state machine name> {
	 * 	private State current; 
	 * 	
	 * 	<one method per event>
	 * 	 
	 * 	public void handle(String eventName) {
	 * 		if (this.current != null) {
	 * 			<one conditional per event>
	 * 		}
	 * 	}
	 * }
	 */
	def Link transform(StateMachine stateMachine) {

		var result = getExistingLink(stateMachine)
		if (result === null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, stateMachine))
			mapping.links.add(result)

			// Output: unique state interface
			val stateInterface = MiniJavaFactory::eINSTANCE.createInterface => [name = "State"]
			result.targetElements.add(createAnnotatedElement(result, stateInterface, "stateInterface"))

			// Output: current field
			val currentField = MiniJavaFactory::eINSTANCE.createField => [
				name = "current";
				typeRef = MiniJavaFactory::eINSTANCE.createClassRef => [referencedClass = stateInterface;]
				access = AccessLevel::PUBLIC;
			]

			// Output: state machine class
			val stateMachineClass = MiniJavaFactory::eINSTANCE.createClass => [name = stateMachine.name.toFirstUpper]
			result.targetElements.add(createAnnotatedElement(result, stateMachineClass, "stateMachineClass"))
			stateMachineClass.members.add(currentField)

			// Output: constructor
			val constructorCall = MiniJavaFactory::eINSTANCE.createNewObject
			val constructorAssignment = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = MiniJavaFactory::eINSTANCE.createFieldAccess => [
					field = currentField;
					receiver = MiniJavaFactory::eINSTANCE.createThis
				]
				value = constructorCall
			]
			val constructorBlock = MiniJavaFactory::eINSTANCE.createBlock
			constructorBlock.statements.add(constructorAssignment)
			val constructor = MiniJavaFactory::eINSTANCE.createMethod => [
				name = stateMachineClass.name;
				access = AccessLevel::PUBLIC;
				body = constructorBlock
			]
			stateMachineClass.members.add(constructor)

			// Output: handle method
			val handleRootConditionnalBlock = MiniJavaFactory::eINSTANCE.createBlock
			val handleRootConditionnal = MiniJavaFactory::eINSTANCE.createIfStatement => [
				expression = MiniJavaFactory::eINSTANCE.createInequality => [
					left = MiniJavaFactory::eINSTANCE.createFieldAccess => [
						receiver = MiniJavaFactory::eINSTANCE.createThis;
						field = currentField
					];
					right = MiniJavaFactory::eINSTANCE.createNull
				];
				thenBlock = handleRootConditionnalBlock
			]

			val handleMethodBody = MiniJavaFactory::eINSTANCE.createBlock
			handleMethodBody.statements.add(handleRootConditionnal)
			val handleMethod = MiniJavaFactory::eINSTANCE.createMethod => [
				name = "handle";
				access = AccessLevel::PUBLIC;
				typeRef = MiniJavaFactory::eINSTANCE.createVoidTypeRef;
				body = handleMethodBody
			]
			stateMachineClass.members.add(handleMethod)

			// Transform the events, and connect their results with everything
			for (e : stateMachine.events) {
				val link = transform(e)
				// event concrete method
				val Method eventMethod = link.targetElements.
					findFirst[it.annotation === stateMachine.name + "_method"] as Method
				stateMachineClass.members.add(eventMethod)

				// event conditional
				val IfStatement eventConditionnal = link.targetElements.findFirst [
					it.annotation === stateMachine.name + "_conditionnal"
				] as IfStatement
				val block = handleRootConditionnalBlock.endOfConditionnalElseChain
				block.statements.add(eventConditionnal)

				// event interface method
				val Method eventInterfaceMethod = link.targetElements.findFirst [
					it.annotation === stateMachine.name + "_interfaceMethod"
				] as Method
				stateInterface.members.add(eventInterfaceMethod)

			}

			// Transform the states (each state manages its transitions) and connect
			var Class initClass = null
			for (s : stateMachine.region.head.subvertex.filter(State)) {
				val link = transform(s)
				if (s instanceof Pseudostate) {
					if (s.kind === PseudostateKind::INITIAL) {
						initClass = link.targetElements.head.element as Class
					}

				}
			}
			constructorCall.type = initClass

		// Transform the transitions TODO or not? 
//			for (t : stateMachine.region.head.transition) {
//				transform(t)
//			}
		}
		return result
	}
}
