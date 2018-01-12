package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.AccessLevel
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration
import statemachines.CustomSystem

class CustomSystemTransformer {

	private extension var StateMachineTransformer stateMachineTransformer
	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateTransformer stateTransformer
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var CustomEventTransformer eventTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
		stateMachineTransformer = new StateMachineTransformer(mapping)
	}

	def Link transform(CustomSystem system) {

		var result = getExistingLink(system)
		if (result === null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, system))
			mapping.links.add(result)

			// 'machine' variable declaration
			val machineVarDecl = MiniJavaFactory::eINSTANCE.createVariableDeclaration => [name = "machine"]
			val machineVarDeclNew = MiniJavaFactory::eINSTANCE.createNewObject
			val machineVarDeclAssignment = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = machineVarDecl
				value = machineVarDeclNew
			]

			// Output: main method String args
			val args = MiniJavaFactory::eINSTANCE.createParameter => [
				name = "args";
				typeRef = MiniJavaFactory::eINSTANCE.createArrayTypeRef => [
					typeRef = MiniJavaFactory::eINSTANCE.createStringTypeRef
				]
			]

			// Output: for loop declaration
			val declareI = MiniJavaFactory::eINSTANCE.createVariableDeclaration => [
				name = "i";
				typeRef = MiniJavaFactory::eINSTANCE.createIntegerTypeRef
			]
			val assignI = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = declareI;
				value = MiniJavaFactory::eINSTANCE.createIntConstant => [value = 0]
			]

			// Output: for loop condition
			val conditionI = MiniJavaFactory::eINSTANCE.createInferior => [
				left = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = declareI];
				right = MiniJavaFactory::eINSTANCE.createArrayLength => [
					array = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = args]
				]
			]

			// Output: for loop progression
			val progressionI = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = declareI];
				value = MiniJavaFactory::eINSTANCE.createPlus => [
					left = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = declareI];
					right = MiniJavaFactory::eINSTANCE.createIntConstant => [value = 1]
				]
			]

			// Output: loop get arg
			val eventNameVar = MiniJavaFactory::eINSTANCE.createVariableDeclaration => [
				name = "eventName";
				typeRef = MiniJavaFactory::eINSTANCE.createStringTypeRef
			]
			val getArg = MiniJavaFactory::eINSTANCE.createAssignment => [
				assignee = eventNameVar;
				value = MiniJavaFactory::eINSTANCE.createArrayAccess => [
					object = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = args];
					index = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = declareI]
				]
			]

			// Output: loop call handle
			val callHandle = MiniJavaFactory::eINSTANCE.createMethodCall => [
				receiver = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = machineVarDecl]
			]
			callHandle.args.add(MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = eventNameVar])

			// Output: for loop body
			val loopBody = MiniJavaFactory::eINSTANCE.createBlock
			loopBody.statements.add(getArg)
			loopBody.statements.add(callHandle)

			// Output: for loop over args
			val forLoop = MiniJavaFactory::eINSTANCE.createForStatement => [
				declaration = assignI;
				condition = conditionI;
				progression = progressionI
				block = loopBody
			]
			result.targetElements.add(createAnnotatedElement(result, forLoop))

			// Output: main method body
			val mainBody = MiniJavaFactory::eINSTANCE.createBlock
			result.targetElements.add(createAnnotatedElement(result, mainBody))
			mainBody.statements.add(machineVarDeclAssignment)
			mainBody.statements.add(forLoop)

			// Output: main method
			val mainMethod = MiniJavaFactory::eINSTANCE.createMethod => [
				name = "main";
				static = true;
				typeRef = MiniJavaFactory::eINSTANCE.createVoidTypeRef;
				body = mainBody;
				access = AccessLevel::PUBLIC
			]
			result.targetElements.add(createAnnotatedElement(result, mainMethod))
			mainMethod.params.add(args)

			// Output: main class
			val mainClass = MiniJavaFactory::eINSTANCE.createClass => [name = "Main"]
			result.targetElements.add(createAnnotatedElement(result, mainClass))
			mainClass.members.add(mainMethod)

			// Transform events
			for (e : system.events) {
				transform(e)
			}

			// Transform state machine and get stuff
			val stateMachineLink = transform(system.statemachine)
			val stateMachineClass = stateMachineLink.targetElements.filter[it.annotation == "stateMachineClass"].map [
				element
			].filter(Class).head
			val handleMethod = stateMachineClass.members.findFirst[it.name == "handle"] as Method

			// Connect stuff
			callHandle.receiver = MiniJavaFactory::eINSTANCE.createSymbolRef => [symbol = machineVarDecl]
			callHandle.method = handleMethod
			machineVarDecl.typeRef = MiniJavaFactory::eINSTANCE.createClassRef => [referencedClass = stateMachineClass]
			machineVarDeclNew.type = stateMachineClass

			// Gather all generated types
			val Set<TypeDeclaration> types = findTargetElementsOfType(MiniJavaPackage::eINSTANCE.typeDeclaration).
				filter(TypeDeclaration).toSet

			// Create the output program
			val program = MiniJavaFactory::eINSTANCE.createProgram => [name = "DefaultProgramName"]
			program.classes.addAll(types)
			result.targetElements.add(createAnnotatedElement(result, program))

		}
		return result

	}
}
