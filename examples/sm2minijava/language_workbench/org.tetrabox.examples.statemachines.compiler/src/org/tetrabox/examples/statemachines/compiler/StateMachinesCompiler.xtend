package org.tetrabox.examples.statemachines.compiler

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.CompilationResult
import org.gemoc.execution.feedbackengine.Compiler
import org.tetrabox.examples.statemachines.compiler.modeltransformation.CustomEventTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.CustomSystemTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.StateMachineTransformer
import org.tetrabox.examples.statemachines.compiler.modeltransformation.StateTransformer
import org.tetrabox.minijava.xtext.miniJava.Program
import statemachines.CustomSystem
import org.tetrabox.examples.statemachines.compiler.modeltransformation.TransitionTransformer

class StateMachinesCompiler implements Compiler {

	private var CustomSystem input
	private var TraceabilityModel mapping
	private extension var Util util

	override compile(EObject sourceModelRoot) {
		mapping = GemoctraceabilityFactory::eINSTANCE.createTraceabilityModel
		util = new Util(mapping)
		input = sourceModelRoot as CustomSystem
		val output = transformToJava()
		return new CompilationResult(mapping, output)
	}

	override getTargetFileExtension() {
		"minijava"
	}

	private def Program transformToJava() {

		// Creating the model transformation
		val CustomSystemTransformer transformer = new CustomSystemTransformer(mapping)
		val CustomEventTransformer eventTransformer = new CustomEventTransformer(mapping)
		val StateMachineTransformer statemachineTransformer = new StateMachineTransformer(mapping)
		val StateTransformer stateTransformer = new StateTransformer(mapping)
		val TransitionTransformer transitionTransformer = new TransitionTransformer(mapping)

		// Manual injection...
		transformer.eventTransformer = eventTransformer
		transformer.stateTransformer = stateTransformer
		eventTransformer.stateMachineTransformer = statemachineTransformer
		statemachineTransformer.eventTransformer = eventTransformer
		statemachineTransformer.stateTransformer = stateTransformer
		stateTransformer.stateMachineTransformer = statemachineTransformer
		stateTransformer.customEventTransformer = eventTransformer
		stateTransformer.transitionTransformer = transitionTransformer
		transitionTransformer.stateTransformer = stateTransformer

		// Calling the transformation
		val link = transformer.transform(input)
		val result = link.targetElements.map[element].filter(Program).head
		return result
	}

}
