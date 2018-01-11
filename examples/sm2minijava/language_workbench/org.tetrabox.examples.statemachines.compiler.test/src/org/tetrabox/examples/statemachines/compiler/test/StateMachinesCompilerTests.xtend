package org.tetrabox.examples.statemachines.compiler.test

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.tetrabox.examples.statemachines.compiler.StateMachinesCompiler
import statemachines.CustomSystem

class StateMachinesCompilerTests {

	@Test
	def void test() {
		val ResourceSet rs = new XtextResourceSet
		val resource = rs.getResource(URI::createFileURI("input/test1.statemachines"), true)
		val root = resource.contents.head as CustomSystem
		val compiler = new StateMachinesCompiler()
		val result = compiler.compile(root)
		val out = rs.createResource(URI::createFileURI("tmp/test1.minijava"))
			out.contents.add(result.targetModelRoot)
		out.save(null)
		

	}

}
