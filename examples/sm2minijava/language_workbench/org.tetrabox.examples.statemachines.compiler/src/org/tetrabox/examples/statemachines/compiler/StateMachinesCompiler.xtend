package org.tetrabox.examples.statemachines.compiler

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.CompilationResult
import org.gemoc.execution.feedbackengine.Compiler
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.Program
import statemachines.CustomSystem
import statemachines.almostuml.Transition
import org.tetrabox.examples.statemachines.compiler.modeltransformation.CustomSystemTransformer

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
		transformer.transform(input)
		output = findTargetElementsOfType(MiniJavaPackage::eINSTANCE.program).head as Program
	}


	def Link transform(Transition transition) {
	}

}
