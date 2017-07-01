package org.gemoc.execution.feedbackengine.tests

import fr.inria.diverse.trace.commons.EMFCompareUtil
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram
import org.gemoc.execution.feedbackengine.tests.util.DynToStaticTrace
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.gemoc.executionframework.test.lib.impl.TestHelper
import org.gemoc.executionframework.test.lib.impl.TestModel
import org.junit.AfterClass
import org.junit.Assert
import org.junit.Test

class FeedbackEngineTraceComparisonTests {
	public static val ad2petriModelsPlugin = "org.gemoc.activitydiagram.sequential.ad2petri.models"


	private def void genericInternalTest(String folder, String model) {
		val engine1 = new FeedbackEngineWrapper()
		val engine2 = new JavaEngineWrapper()
		val trace1 = TestHelper::testWithGenericTrace(engine1, new CompiledActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram"))
		val trace2 = TestHelper::testWithGenericTrace(engine2, new InterpretedActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram"))
		DynToStaticTrace::execute(engine1.realEngine, trace1)
		DynToStaticTrace::execute(engine2.realEngine, trace2)

		val diffs = EMFCompareUtil::compare(trace1, trace2)


		Assert::assertTrue(diffs.empty)
	}
	
	@AfterClass
	static def void pause() {
	//	TestUtil::waitForJobsThenWindowClosed
	}

	@Test
	def void test1TraceComparison() {
		genericInternalTest("/basic", "test1.xmi")
	}

	@Test
	def void test2TraceComparison() {
		genericInternalTest("/basic", "test2.xmi")
	}
}
