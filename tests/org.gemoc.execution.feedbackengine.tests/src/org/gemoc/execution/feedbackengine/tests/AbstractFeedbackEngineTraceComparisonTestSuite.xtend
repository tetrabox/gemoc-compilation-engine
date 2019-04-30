package org.gemoc.execution.feedbackengine.tests

import org.eclipse.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.eclipse.gemoc.trace.commons.model.trace.Trace
import org.gemoc.execution.feedbackengine.tests.util.DynToStaticTrace
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper

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

		// Will throw runtime exceptions if differences are found, and make the test fail
		analyze(testResult1.trace, testResult2.trace)

		Util::cleanWorkspace()
		Util::cleanup(getSemanticsPlugin())
	}

	def void analyze(Trace<?, ?, ?> t1, Trace<?, ?, ?> t2)

}
