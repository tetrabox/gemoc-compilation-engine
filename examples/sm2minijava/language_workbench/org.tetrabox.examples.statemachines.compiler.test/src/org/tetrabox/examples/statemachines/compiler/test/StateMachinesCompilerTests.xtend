package org.tetrabox.examples.statemachines.compiler.test

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.tetrabox.examples.statemachines.compiler.StateMachinesCompiler
import statemachines.CustomSystem

class StateMachinesCompilerTests {

	private def void genericTest(String name) {
		val ResourceSet rs = new XtextResourceSet
		val resource = rs.getResource(URI::createFileURI("input/" + name + ".statemachines"), true)
		val root = resource.contents.head as CustomSystem
		val compiler = new StateMachinesCompiler()
		val result = compiler.compile(root)
		val out = rs.createResource(URI::createFileURI("tmp/" + name + ".minijava"))

		out.contents.add(result.targetModelRoot)
		out.save(null)

	}

	@Test
	def void test1() {
		genericTest("test1")
	}

	@Test
	def void test2() {
		genericTest("test2")
	}
}
