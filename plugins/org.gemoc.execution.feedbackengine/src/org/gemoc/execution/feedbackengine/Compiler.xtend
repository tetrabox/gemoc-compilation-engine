package org.gemoc.execution.feedbackengine

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data 


@Data class CompilationResult {
	EObject traceabilityModelRoot
	EObject targetModelRoot
}


interface Compiler {
	def CompilationResult compile (EObject sourceModelRoot)
	def String getTargetFileExtension()
}