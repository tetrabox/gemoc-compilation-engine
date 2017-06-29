package org.gemoc.activitydiagram.sequential.ad2petri.compiler.test

import activitydiagram.Activity
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.gemoc.activitydiagram.sequential.ad2petri.compiler.Ad2PetriCompiler
import org.junit.Test

class Ad2PetriTest {

	private static def void genericTest(String path) {
		val rs = new ResourceSetImpl
		val uri = URI::createFileURI(path)
		val Resource resource = rs.getResource(uri, true)
		val activity = resource.contents.head as Activity
		val transf = new Ad2PetriCompiler()
		val result = transf.compile(activity)
		val Resource output = rs.createResource(URI::createFileURI("tmp/" + uri.lastSegment + "_out.xmi"))
		output.contents.add(result.targetModelRoot)
		output.save(null)
	}

	@Test
	public def void empty() {
		genericTest("model/empty.xmi")
	}

	@Test
	public def void singleaction() {
		genericTest("model/singleaction.xmi")
	}

	@Test
	public def void forkandjoin() {
		genericTest("model/forkandjoin.xmi")
	}

}
