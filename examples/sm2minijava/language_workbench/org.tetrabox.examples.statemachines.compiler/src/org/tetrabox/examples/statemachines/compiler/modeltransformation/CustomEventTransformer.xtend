package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Interface
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.CustomEvent

class CustomEventTransformer {

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
		if (!result.isPresent) {

			// Create trace
			val newLink = GemoctraceabilityFactory::eINSTANCE.createLink
			newLink.sourceElements.add(createAnnotatedElement(newLink, event))
			mapping.links.add(newLink)

			// Output: empty method for the state interface
			val stateInterfaceMethod = MiniJavaFactory::eINSTANCE.createMethod => [
				name = event.name;
				access = AccessLevel::PUBLIC;
			]
			newLink.targetElements.add(createAnnotatedElement(newLink, stateInterfaceMethod, "interfaceMethod"))

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
			newLink.targetElements.add(createAnnotatedElement(newLink, stateMachineMethod, "method"))

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
			newLink.targetElements.add(createAnnotatedElement(newLink, stateMachineConditionnal, "conditionnal"))

			// Transform state machine and connect stuff
			val stateMachineLink = transform(event.stateMachine)
			val stateMachineClass = stateMachineLink.targetElements.findFirst[it.annotation == "stateMachineClass"].
				element as Class
			val stateMachineHandle = stateMachineClass.members.findFirst[it.name == "handle"] as Method
			val stateInterface = stateMachineLink.targetElements.findFirst[it.annotation == "stateInterface"].
				element as Interface
			val stateMachineCurrentField = stateMachineClass.members.findFirst[it.name == "current"] as Field
			currentFieldAccess1.field = stateMachineCurrentField
			currentFieldAccess2.field = stateMachineCurrentField
			stateInterfaceMethod.typeRef = MiniJavaFactory::eINSTANCE.createClassRef => [
				referencedClass = stateInterface
			]
			stateMachineConditionnalExpression.left = MiniJavaFactory::eINSTANCE.createSymbolRef => [
				symbol = stateMachineHandle.params.head
			]
			return newLink
		} else {
			return result.get
		}
	}
}
