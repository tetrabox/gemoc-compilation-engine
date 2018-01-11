package org.tetrabox.examples.statemachines.compiler

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.CompilationResult
import org.gemoc.execution.feedbackengine.Compiler
import org.tetrabox.examples.statemachines.compiler.modeltransformation.CustomSystemTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.EventTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.StateMachineTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.StateTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.TransitionTransformer
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.Program
import statemachines.CustomSystem
import statemachines.almostuml.Transition

class StateMachinesCompiler implements Compiler {

	private var CustomSystem input
	private var TraceabilityModel mapping
	private var Program output
	private extension var Util util
	

	override compile(EObject sourceModelRoot) {
		mapping = GemoctraceabilityFactory::eINSTANCE.createTraceabilityModel
		util = new Util(mapping)
		input = sourceModelRoot as CustomSystem
		transformToJava()
		return new CompilationResult(mapping, output)
	}

	override getTargetFileExtension() {
		"minijava"
	}

	private def void transformToJava() {
		val CustomSystemTransformer transformer = new CustomSystemTransformer(mapping)
		val EventTransformer eventTransformer = new EventTransformer(mapping)
		val StateMachineTransformer statemachineTransformer = new StateMachineTransformer(mapping)
		val StateTransformer stateTransformer = new StateTransformer(mapping)
		val TransitionTransformer transitionTransformer = new TransitionTransformer(mapping)
		transformer.eventTransformer = eventTransformer
		transformer.stateTransformer = stateTransformer
		eventTransformer.stateMachineTransformer = statemachineTransformer
		statemachineTransformer.eventTransformer = eventTransformer
		statemachineTransformer.stateTransformer = stateTransformer
		stateTransformer.stateMachineTransformer = statemachineTransformer
		stateTransformer.transitionTransformer = transitionTransformer
		transitionTransformer.stateMachineTransformer = statemachineTransformer
		transitionTransformer.stateTransformer = stateTransformer
		transformer.transform(input)
		output = findTargetElementsOfType(MiniJavaPackage::eINSTANCE.program).head as Program
	}


	def Link transform(Transition transition) {
	}

}
