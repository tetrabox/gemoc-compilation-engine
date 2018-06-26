package org.gemoc.execution.feedbackengine.tests.sm2java

import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.gemoc.execution.feedbackengine.tests.languages.CompiledStateMachines
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.junit.Test

class FeedbackEngineSm2JavaSimpleTests {
	public static val sm2javaModelsPlugin = "org.tetrabox.examples.statemachines.models"

	@Test
	def void test1() {
		TestHelper::testWithoutExtraAddons(new FeedbackEngineWrapper(), new CompiledStateMachines(),
			new TestModel(sm2javaModelsPlugin, "/models", "test1.xmi", "", "?lang=org.tetrabox.examples.statemachines.CompiledStateMachines"))
	}
	
	@Test
	def void test1GenericTrace() {
		TestHelper::testWithGenericTrace(new FeedbackEngineWrapper(), new CompiledStateMachines(),
			new TestModel(sm2javaModelsPlugin, "/models", "test1.xmi", "", "?lang=org.tetrabox.examples.statemachines.CompiledStateMachines"))
	}
	
		@Test
	def void test2() {
		TestHelper::testWithoutExtraAddons(new FeedbackEngineWrapper(), new CompiledStateMachines(),
			new TestModel(sm2javaModelsPlugin, "/models", "test2.xmi", "", "?lang=org.tetrabox.examples.statemachines.CompiledStateMachines"))
	}
}