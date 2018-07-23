package org.gemoc.execution.feedbackengine.tests

import java.util.Collection
import org.eclipse.emf.compare.Diff
import org.eclipse.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.eclipse.gemoc.trace.commons.EMFCompareUtil
import org.gemoc.execution.feedbackengine.tests.util.DynToStaticTrace
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.junit.Assert

abstract class AbstractFeedbackEngineTraceComparisonTestSuite extends AbstractFeedbackEngineTestSuite {

	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}

	abstract def String getSemanticsPlugin()
	
	
	abstract def ILanguageWrapper getCompiledDSL()
	abstract def ILanguageWrapper getInterpretedDSL()

	override genericInternalTest(String plugin, String folder, String model, int scenarioID) {
		val engine1 = new FeedbackEngineWrapper()
		val engine2 = new JavaEngineWrapper()
		val scenario = findScenario(model, plugin, folder, scenarioID)
		val String initArgs = if(scenario.isPresent) scenario.get else ""
		val testmodel = new TestModel(plugin, folder, model, initArgs, null)
		val testResult1 = TestHelper::testWithGenericTrace(engine1, getCompiledDSL, testmodel, false)
		val testResult2 = TestHelper::testWithGenericTrace(engine2, getInterpretedDSL, testmodel, false)
		DynToStaticTrace::execute(engine1.realEngine, testResult1.trace)
		DynToStaticTrace::execute(engine2.realEngine, testResult2.trace)

		val diffs = EMFCompareUtil::compare(testResult1.trace, testResult2.trace)
		filterDiffs(diffs)

		Assert::assertTrue(diffs.empty)
		TestHelper::cleanWorkspace()
		Util::cleanup(getSemanticsPlugin())
	}

	/**
	 * Removes the diffs due to a mismatch between token elements,
	 * as long as the amount of "heldTokens" is the same.
	 */
	abstract def void filterDiffs(Collection<Diff> diffs)

// @AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
