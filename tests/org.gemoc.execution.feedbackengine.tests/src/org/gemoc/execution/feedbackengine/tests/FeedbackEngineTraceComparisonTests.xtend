package org.gemoc.execution.feedbackengine.tests

import fr.inria.diverse.trace.commons.EMFCompareUtil
import fr.inria.diverse.trace.commons.model.generictrace.GenericDimension
import fr.inria.diverse.trace.commons.model.generictrace.ManyReferenceValue
import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram
import org.gemoc.execution.feedbackengine.tests.util.DynToStaticTrace
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.gemoc.executionframework.test.lib.impl.TestHelper
import org.gemoc.executionframework.test.lib.impl.TestModel
import org.gemoc.executionframework.test.lib.impl.TestUtil
import org.junit.Assert
import org.junit.Test

class FeedbackEngineTraceComparisonTests {
	public static val ad2petriModelsPlugin = "org.gemoc.activitydiagram.sequential.ad2petri.models"
	public static val ad2petriGeneratedModelsPlugin = "org.modelexecution.activitydiagram.generator.test"

	/**
	 * Removes the diffs due to a mismatch between token elements,
	 * as long as the amount of "heldTokens" is the same.
	 */
	private static def void filterDiffs(Collection<Diff> diffs) {
		val toRemove = new HashSet<Diff>
		for (diff : diffs.filter(ReferenceChange)) {
			if (diff.reference.name.equals("referenceValues")) {
				val left = diff.match.left as ManyReferenceValue
				val right = diff.match.right as ManyReferenceValue
				val dimLeft = left.eContainer as GenericDimension
				if (dimLeft.dynamicProperty.name.equals("heldTokens")) {
					val tokens1 = left.referenceValues.size
					val tokens2 = right.referenceValues.size
					if (tokens1 == tokens2) {
						toRemove.add(diff)
					}
				}
			}
		}
		diffs.removeAll(toRemove)

	}

	private def void genericInternalTest(String plugin, String folder, String model) {
		val engine1 = new FeedbackEngineWrapper()
		val engine2 = new JavaEngineWrapper()
		val trace1 = TestHelper::testWithGenericTrace(engine1, new CompiledActivityDiagram(),
			new TestModel(plugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram"))
		val trace2 = TestHelper::testWithGenericTrace(engine2, new InterpretedActivityDiagram(),
			new TestModel(plugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram"))
		DynToStaticTrace::execute(engine1.realEngine, trace1)
		DynToStaticTrace::execute(engine2.realEngine, trace2)

		val diffs = EMFCompareUtil::compare(trace1, trace2)
		filterDiffs(diffs)

		Assert::assertTrue(diffs.empty)
	}

	// @AfterClass
	static def void pause() {
		TestUtil::waitForJobsThenWindowClosed
	}

	// @Test
	def void test1TraceComparison() {
		genericInternalTest(ad2petriModelsPlugin, "/basic", "test1.xmi")
	}

	// @Test
	def void test2TraceComparison() {
		genericInternalTest(ad2petriModelsPlugin, "/basic", "test2.xmi")
	}

	@Test
	def void generatedSize10() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, "/models", "Activity-Size10.xmi")
	}

	@Test
	def void generatedSize20() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, "/models", "Activity-Size20.xmi")
	}

	@Test
	def void generatedSize30() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, "/models", "Activity-Size30.xmi")
	}

	@Test
	def void generatedSize50() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, "/models", "Activity-Size50.xmi")
	}

	@Test
	def void generatedSize100() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, "/models", "Activity-Size100.xmi")
	}
}
