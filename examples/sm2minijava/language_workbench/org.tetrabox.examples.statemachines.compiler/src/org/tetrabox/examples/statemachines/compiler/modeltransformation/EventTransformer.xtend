package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.CustomEvent

class EventTransformer {
	
	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateMachineTransformer stateMachineTransformer
		
	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
	}

	// output: operation in state interface + one method per state class + one method in state machine class
	def Link transform(CustomEvent event) {

		var result = getExistingLink(event)
		if (result === null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, event))
			mapping.links.add(result)

			// Output: empty method for the state interface
			val stateInterfaceMethod = MiniJavaFactory::eINSTANCE.createMethod => [
				name = event.name;
				access = AccessLevel::PUBLIC;
			]
			result.targetElements.add(
				createAnnotatedElement(result, stateInterfaceMethod, event.stateMachine.name + "_interfaceMethod"))

			// Output: concrete private method for the state machine class
			val currentFieldAccess1 = MiniJavaFactory::eINSTANCE.createFieldAccess => [
				receiver = MiniJavaFactory::eINSTANCE.createThis
			]
			val currentFieldAccess2 = MiniJavaFactory::eINSTANCE.createFieldAccess => [
				receiver = MiniJavaFactory::eINSTANCE.createThis
			]
			val stateMachineMethodAssignment = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = currentFieldAccess1;
				value = MiniJavaFactory::eINSTANCE.createMethodCall => [
					receiver = currentFieldAccess2;
					method = stateInterfaceMethod
				]
			]
			val stateMachineMethodBody = MiniJavaFactory::eINSTANCE.createBlock
			stateMachineMethodBody.statements.add(stateMachineMethodAssignment)
			val stateMachineMethod = MiniJavaFactory::eINSTANCE.createMethod => [
				name = event.name;
				typeRef = MiniJavaFactory::eINSTANCE.createVoidTypeRef;
				access = AccessLevel::PRIVATE;
				body = stateMachineMethodBody
			]
			result.targetElements.add(
				createAnnotatedElement(result, stateMachineMethod, event.stateMachine.name + "_method"))

			// Output: conditional for the handler
			val stateMachineConditionnalExpression = MiniJavaFactory::eINSTANCE.createEquality => [
				right = MiniJavaFactory::eINSTANCE.createStringConstant => [value = event.name]
			]
			val stateMachineConditionnalThenBlock = MiniJavaFactory::eINSTANCE.createBlock
			val stateMachineConditionnalThenBlockMethodCall = MiniJavaFactory::eINSTANCE.createMethodCall => [
				receiver = MiniJavaFactory::eINSTANCE.createThis
				method = stateMachineMethod
			]
			stateMachineConditionnalThenBlock.statements.add(stateMachineConditionnalThenBlockMethodCall)
			val stateMachineConditionnal = MiniJavaFactory::eINSTANCE.createIfStatement => [
				expression = stateMachineConditionnalExpression;
				thenBlock = stateMachineConditionnalThenBlock;
				elseBlock = MiniJavaFactory::eINSTANCE.createBlock
			]
			result.targetElements.add(
				createAnnotatedElement(result, stateMachineConditionnal, event.stateMachine.name + "_conditionnal"))

			// Transform state machine and connect stuff
			val stateMachineLink = transform(event.stateMachine)
			val stateMachineClass = stateMachineLink.targetElements.
				findFirst[it.annotation == "stateMachineClass"] as Class
			val stateMachineHandle = stateMachineClass.members.findFirst[it.name == "handle"] as Method
			val stateInterface = stateMachineLink.targetElements.findFirst[it.annotation == "stateInterface"] as Class
			val stateMachineCurrentField = stateMachineClass.members.findFirst[it.name == "current"] as Field
			currentFieldAccess1.field = stateMachineCurrentField
			currentFieldAccess2.field = stateMachineCurrentField
			stateInterfaceMethod.typeRef = MiniJavaFactory::eINSTANCE.createClassRef => [
				referencedClass = stateInterface
			]
			stateMachineConditionnalExpression.left = MiniJavaFactory::eINSTANCE.createSymbolRef => [
				symbol = stateMachineHandle.params.head
			]
		}
		return result
	}
}
