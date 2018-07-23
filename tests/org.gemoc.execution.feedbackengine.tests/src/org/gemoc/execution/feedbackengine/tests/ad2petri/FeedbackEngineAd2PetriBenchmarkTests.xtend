package org.gemoc.execution.feedbackengine.tests.ad2petri

import java.util.Collection
import org.gemoc.execution.feedbackengine.tests.AbstractFeedbackEngineBenchmarkTestSuite
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram

@RunWith(Parameterized)
class FeedbackEngineAd2PetriBenchmarkTests extends AbstractFeedbackEngineBenchmarkTestSuite {

	
	
	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}
	
	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		return Ad2PetriTestData::data
	}
	
	
	override getSemanticsPlugin() {
		"fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1"
	}
	
	override getPluginName() {
		"org.modelexecution.activitydiagram.generator.test"
	}
	
	override getCompiledDSL() {
		new CompiledActivityDiagram
	}
	
	override getInterpretedDSL() {
		new InterpretedActivityDiagram
	}


//	@AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
