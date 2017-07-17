package org.eclipse.gemoc.execution.feedbackengine.tests

import org.eclipse.gemoc.trace.commons.EMFCompareUtil
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericDimension
import org.eclipse.gemoc.trace.commons.model.generictrace.ManyReferenceValue
import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.eclipse.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram
import org.eclipse.gemoc.execution.feedbackengine.tests.util.DynToStaticTrace
import org.eclipse.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.eclipse.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.junit.Assert
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


class FeedbackEngineTraceComparisonTests extends AbstractFeedbackEngineRandomModelsTestSuite {

	new(int size, String model) {
		super(size, model)
	}

	override genericInternalTest(String plugin, String folder, String model) {
		val engine1 = new FeedbackEngineWrapper()
		val engine2 = new JavaEngineWrapper()
		val testmodel = new TestModel(plugin, folder, model, "", null)
		val testResult1 = TestHelper::testWithGenericTrace(engine1, new CompiledActivityDiagram(), testmodel, true)
		val testResult2 = TestHelper::testWithGenericTrace(engine2, new InterpretedActivityDiagram(), testmodel, true)
		DynToStaticTrace::execute(engine1.realEngine, testResult1.trace)
		DynToStaticTrace::execute(engine2.realEngine, testResult2.trace)

		val diffs = EMFCompareUtil::compare(testResult1.trace, testResult2.trace)
		filterDiffs(diffs)

		Assert::assertTrue(diffs.empty)
	}

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

// @AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
