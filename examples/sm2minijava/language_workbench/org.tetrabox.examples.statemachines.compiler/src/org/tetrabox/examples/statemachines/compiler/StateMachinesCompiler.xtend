package org.tetrabox.examples.statemachines.compiler

import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.Compiler
import statemachines.CustomSystem
import org.gemoc.execution.feedbackengine.CompilationResult

class StateMachinesCompiler implements Compiler {

	override compile(EObject sourceModelRoot) {
		val root = sourceModelRoot as CustomSystem
		val transfo = new Sm2MiniJava
		val result = transfo.transform(root)
		return new CompilationResult(transfo.traceabilityModel, result)

	}

	override getTargetFileExtension() {
		"xmi"
	}

}
