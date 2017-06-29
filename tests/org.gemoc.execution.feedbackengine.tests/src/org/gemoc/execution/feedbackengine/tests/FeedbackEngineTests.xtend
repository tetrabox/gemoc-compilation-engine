package org.gemoc.execution.feedbackengine.tests

import org.gemoc.executionframework.test.lib.impl.TestHelper
import org.gemoc.executionframework.test.lib.impl.TestModel
import org.junit.Test
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.gemoc.execution.feedbackengine.tests.languages.Ad2petri

class FeedbackEngineTests {
	public static val ad2petriModelsPlugin = "???"

	@Test
	def void testTFSM() {
		TestHelper::testWithoutExtraAddons(new FeedbackEngineWrapper(), new Ad2petri(),
			new TestModel(ad2petriModelsPlugin, "/", "test1.xmi", "", ""))
	}
}
