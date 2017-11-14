package org.tetrabox.examples.statemachines.compiler

import org.eclipse.emf.ecore.EObject
import statemachines.CustomSystem
import org.tetrabox.minijava.xtext.miniJava.Program
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import gemoctraceability.GemoctraceabilityFactory

class Sm2MiniJava {
	
	@Accessors(PRIVATE_SETTER,PUBLIC_GETTER)
	private TraceabilityModel traceabilityModel = GemoctraceabilityFactory::eINSTANCE.createTraceabilityModel
	
	def Program transform(CustomSystem system) {
		
	}
	
}