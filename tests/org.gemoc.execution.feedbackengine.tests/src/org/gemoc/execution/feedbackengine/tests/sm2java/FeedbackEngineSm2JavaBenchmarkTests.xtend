package org.gemoc.execution.feedbackengine.tests.sm2java

import java.util.Collection
import org.gemoc.execution.feedbackengine.tests.AbstractFeedbackEngineBenchmarkTestSuite
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.gemoc.execution.feedbackengine.tests.languages.CompiledStateMachines
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedStateMachines

@RunWith(Parameterized)
class FeedbackEngineSm2JavaBenchmarkTests extends AbstractFeedbackEngineBenchmarkTestSuite {

	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}

	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		return Sm2JavaGeneratedTestData::data
	}

	override getSemanticsPlugin() {
		"org.tetrabox.minijava.xminijava"
	}

	override getPluginName() {
		"org.tetrabox.examples.statemachines.generator.test"
	}

	override getCompiledDSL() {
		return new CompiledStateMachines
	}

	override getInterpretedDSL() {
		return new InterpretedStateMachines
	}

}
