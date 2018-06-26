package org.gemoc.execution.feedbackengine.tests.ad2petri

import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.junit.Test
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram

class FeedbackEngineSimpleTests {
	public static val ad2petriModelsPlugin = "org.gemoc.activitydiagram.sequential.ad2petri.models"

	@Test
	def void test1() {
		TestHelper::testWithoutExtraAddons(new FeedbackEngineWrapper(), new CompiledActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, "/basic", "test1.xmi", "", "?lang=org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram"))
	}
	
	@Test
	def void test1GenericTrace() {
		TestHelper::testWithGenericTrace(new FeedbackEngineWrapper(), new CompiledActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, "/basic", "test1.xmi", "", "?lang=org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram"))
	}
}