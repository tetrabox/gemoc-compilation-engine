package org.gemoc.execution.feedbackengine.tests.ad2petri

import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericDimension
import org.eclipse.gemoc.trace.commons.model.generictrace.ManyReferenceValue
import org.gemoc.execution.feedbackengine.tests.AbstractFeedbackEngineTraceComparisonTestSuite
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized)
class FeedbackEngineTraceComparisonTests extends AbstractFeedbackEngineTraceComparisonTestSuite {

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

	/**
	 * Removes the diffs due to a mismatch between token elements,
	 * as long as the amount of "heldTokens" is the same.
	 */
	override filterDiffs(Collection<Diff> diffs) {
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
