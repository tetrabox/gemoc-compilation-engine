package org.gemoc.execution.feedbackengine.tests.sm2java

import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericDimension
import org.eclipse.gemoc.trace.commons.model.generictrace.ManyReferenceValue
import org.eclipse.gemoc.trace.commons.model.generictrace.SingleReferenceValue
import org.eclipse.gemoc.trace.commons.model.trace.Dimension
import org.eclipse.gemoc.trace.commons.model.trace.Trace
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject
import org.gemoc.execution.feedbackengine.tests.AbstractFeedbackEngineTraceComparisonTestSuite
import org.gemoc.execution.feedbackengine.tests.languages.CompiledStateMachines
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedStateMachines
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import statemachines.CustomEvent

@RunWith(Parameterized)
class FeedbackEngineSm2JavaTraceComparisonTests extends AbstractFeedbackEngineTraceComparisonTestSuite {

	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}

	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		return Sm2JavaGeneratedTestData::data
	}

	override getCompiledDSL() {
		return new CompiledStateMachines
	}

	override getInterpretedDSL() {
		return new InterpretedStateMachines
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
				if (dimLeft.dynamicProperty.name.equals("queue")) {
					val areEqual = left.referenceValues.filter(TracedObject).forall [ leftEventOcc |
						// Getting left name
						val leftEventDim = leftEventOcc.dimensions.get(0) as Dimension<?>
						val leftEvent = (leftEventDim.values.get(0) as SingleReferenceValue).
							referenceValue as CustomEvent
						val leftEventName = leftEvent.name

						// Getting right name
						val index = left.referenceValues.indexOf(leftEventOcc)
						val rightEventOcc = right.referenceValues.get(index) as TracedObject
						val rightEventDim = rightEventOcc.dimensions.get(0) as Dimension<?>
						val rightEvent = (rightEventDim.values.get(0) as SingleReferenceValue).
							referenceValue as CustomEvent
						val rightEventName = rightEvent.name

						// Compare
						leftEventName == rightEventName
					]

					if (areEqual && (left.referenceValues.size == right.referenceValues.size)) {
						toRemove.add(diff)
					}
				}
			} else if (diff.reference.name.equals("values") && diff.match.left instanceof Dimension) {
				val left = diff.match.left as Dimension
				val right = diff.match.right as Dimension
				val leftEvent = (left.values.get(0) as SingleReferenceValue).referenceValue as CustomEvent
				val rightEvent = (right.values.get(0) as SingleReferenceValue).referenceValue as CustomEvent
				val leftTrace = left.eContainer.eContainer as Trace
				val rightTrace = right.eContainer.eContainer as Trace
				val rightEventInLeftTrace = leftTrace.tracedObjects.filter(TracedObject).exists [
					it.dimensions.exists [
						(it as Dimension).values.exists [
							if (it instanceof SingleReferenceValue) {
								(it.referenceValue as CustomEvent) == rightEvent.name
							} else {
								false
							}
						]
						true
					]
				]

				val leftEventInRightTrace = rightTrace.tracedObjects.filter(TracedObject).exists [
					it.dimensions.exists [
						(it as Dimension).values.exists [
							if (it instanceof SingleReferenceValue) {
								(it.referenceValue as CustomEvent) == leftEvent.name
							} else {
								false
							}
						]
						true
					]
				]

				val sameAmountOfTracedObjects = leftTrace.tracedObjects.size == rightTrace.tracedObjects.size

				if (rightEventInLeftTrace && leftEventInRightTrace && sameAmountOfTracedObjects) {
					toRemove.add(diff)
				}
			} else {
				println("hum")
			}
		}
		diffs.removeAll(toRemove)

	}

	override getSemanticsPlugin() {
		"org.tetrabox.minijava.xminijava"
	}

	override getPluginName() {
		"org.tetrabox.examples.statemachines.generator.test"
	}
// @AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
