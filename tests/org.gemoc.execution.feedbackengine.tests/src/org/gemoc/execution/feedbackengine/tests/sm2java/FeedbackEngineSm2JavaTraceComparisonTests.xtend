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
import org.eclipse.gemoc.trace.commons.model.trace.State
import statemachines.almostuml.Pseudostate
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericTracedObject
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Region
import org.eclipse.gemoc.trace.commons.model.trace.Step
import java.util.HashMap
import statemachines.almostuml.Transition
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericSequentialStep
import statemachines.CustomSystem
import statemachines.almostuml.NamedElement

@RunWith(Parameterized)
class FeedbackEngineSm2JavaTraceComparisonTests extends AbstractFeedbackEngineTraceComparisonTestSuite {

	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}

	@Parameters(name="{1}")
	static def Collection<Object[]> data() {
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
	private def filterDiffs(Collection<Diff> diffs) {
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
			} else if (diff.value instanceof State) {
				toRemove.add(diff)
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
	def static State findCorrespondingState(Trace<?, ?, ?> t, State s) {
		val index = (s.eContainer as Trace<?, ?, ?>).states.indexOf(s)
		return t.states.get(index)
	}

	private def void compareSteps(Step step1, Step step2) {

		if (step1.eClass !== step2.eClass) {
			throw new RuntimeException
		}

		// Starting and ending states
		if (statesT1toT2.get(step1.startingState) !== step2.startingState ||
			statesT1toT2.get(step1.endingState) !== step2.endingState) {
			throw new RuntimeException
		}

		// MSE
		if (step1.mseoccurrence !== null) {
			if (step1.mseoccurrence.parameters.size != 0) {
				println("!!")
			}
			val mse1 = step1.mseoccurrence.mse
			val mse2 = step2.mseoccurrence.mse
			if (mse1.name != mse2.name) {
				throw new RuntimeException
			}

			if (mse1.action !== null && mse1.action.name != mse2.action.name) {
				throw new RuntimeException
			}

			val param1 = mse1.caller
			val param2 = mse2.caller
			if (param1 instanceof NamedElement) {
				if (param1.name != (param2 as NamedElement).name) {
					throw new RuntimeException

				}
			} else if (param1 instanceof TracedObject) {
				if (tracedObjectsT1toT2.get(param1) !== param2) {
					throw new RuntimeException
				}
			} else if (param1 instanceof CustomSystem) {
				if (!(param2 instanceof CustomSystem)) {
					throw new RuntimeException
				}
			} else
				println("!")

		}

		// Substeps
		if (step1 instanceof GenericSequentialStep) {
			if (step1.subSteps.size != (step2 as GenericSequentialStep).subSteps.size) {
				throw new RuntimeException
			}
			for (substep1 : step1.subSteps) {
				val index = step1.subSteps.indexOf(substep1)
				val substep2 = (step2 as GenericSequentialStep).subSteps.get(index)
				compareSteps(substep1, substep2)
			}
		}
	}

	val statesT1toT2 = new HashMap<State, State>
	val tracedObjectsT1toT2 = new HashMap<GenericTracedObject, GenericTracedObject>


	// Fully manual trace comparison (no emf compare)
	override analyze(Trace<?, ?, ?> t1, Trace<?, ?, ?> t2) {

		if (t1.eAllContents.toList.size != t2.eAllContents.toList.size) {
			throw new RuntimeException
		}

		if (t1.states.size != t2.states.size) {
			throw new RuntimeException
		}

		if (t1.tracedObjects.size != t2.tracedObjects.size) {
			throw new RuntimeException
		}

		// Checking that traced objects are equivalent
		val remainingT2TracedObjects = new HashSet<GenericTracedObject>
		remainingT2TracedObjects.addAll(t2.tracedObjects.filter(GenericTracedObject))
		for (GenericTracedObject tracedObject1 : t1.tracedObjects.filter(GenericTracedObject)) {
			var found = false
			if (tracedObject1.originalObject !== null) {
				val orig1 = tracedObject1.originalObject
				if (orig1 instanceof StateMachine) {
					for (tracedObject2 : remainingT2TracedObjects.immutableCopy) {
						val orig2 = tracedObject2.originalObject
						if (orig2 instanceof StateMachine) {
							if (orig1.name == orig2.name) {

								val dim1 = tracedObject1.allDimensions.get(0)
								val dim2 = tracedObject2.allDimensions.get(0)

								var dimEquals = true
								for (value1 : dim1.values.filter(ManyReferenceValue)) {
									val index = dim1.values.indexOf(value1)
									val value2 = dim2.values.filter(ManyReferenceValue).get(index)
									val queue1 = value1.referenceValues.filter(GenericTracedObject).toList
									val queue2 = value2.referenceValues.filter(GenericTracedObject).toList
									var queueEquals = true
									for (queueTO1 : queue1) {
										val indexqueue = queue1.indexOf(queueTO1)
										val queueTO2 = queue2.get(indexqueue)
										val event1 = (queueTO1.dimensions.get(0).values.get(0) as SingleReferenceValue).
											referenceValue as CustomEvent
										val event2 = (queueTO2.dimensions.get(0).values.get(0) as SingleReferenceValue).
											referenceValue as CustomEvent
										if (event1.name != event2.name) {
											queueEquals = false
										}
									}
									if (!queueEquals) {
										dimEquals = false
									}

								}
								if (dimEquals) {
									if (!found) {
										found = true
										remainingT2TracedObjects.remove(tracedObject2)
										tracedObjectsT1toT2.put(tracedObject1, tracedObject2)
									}
								}
							}
						}
					}
				} else if (orig1 instanceof Region) {
					for (tracedObject2 : remainingT2TracedObjects.immutableCopy) {
						val orig2 = tracedObject2.originalObject
						if (orig2 instanceof Region) {
							if (orig1.name == orig2.name) {

								val dim1 = tracedObject1.allDimensions.get(0)
								val dim2 = tracedObject2.allDimensions.get(0)

								var dimEquals = true
								for (value1 : dim1.values.filter(SingleReferenceValue)) {
									val index = dim1.values.indexOf(value1)
									val value2 = dim2.values.filter(SingleReferenceValue).get(index)
									val state1 = value1.referenceValue as statemachines.almostuml.State
									val state2 = value2.referenceValue as statemachines.almostuml.State
									if (state1.name != state2.name) {
										dimEquals = false
									}
								}
								if (dimEquals) {
									if (!found) {
										found = true
										remainingT2TracedObjects.remove(tracedObject2)
										tracedObjectsT1toT2.put(tracedObject1, tracedObject2)
									}
								}
							}
						}
					}
				} else
					println("!")
			} else {
				// Case EventOccurrence
				val event1 = (tracedObject1.allDimensions.get(0).values.get(0) as SingleReferenceValue).
					referenceValue as CustomEvent
				for (tracedObject2 : remainingT2TracedObjects.immutableCopy) {
					val event2 = (tracedObject2.allDimensions.get(0).values.get(0) as SingleReferenceValue).
						referenceValue as CustomEvent
					if (event1.name == event2.name) {
						if (!found) {
							found = true
							remainingT2TracedObjects.remove(tracedObject2)
							tracedObjectsT1toT2.put(tracedObject1, tracedObject2)

						}
					}
				}
			}
			if (!found) {
				throw new RuntimeException
			}
		}

		// Checking that states are equivalent
		for (State s1 : t1.states) {
			val s2 = t2.findCorrespondingState(s1)
			statesT1toT2.put(s1, s2)
			if (s1.values.size !== s2.values.size) {
				throw new RuntimeException
			} else {
				val v2usedvalues = new HashSet<SingleReferenceValue>
				for (v1 : s1.values) {
					if (v1 instanceof SingleReferenceValue) {
						val v1RefValue = v1.referenceValue
						if (v1RefValue instanceof CustomEvent) {
							var found = false
							for (v2 : s2.values.filter[!v2usedvalues.contains(it)]) {
								if (v2 instanceof SingleReferenceValue) {
									val v2RefValue = v2.referenceValue
									if (v2RefValue instanceof CustomEvent) {
										if (v1RefValue.name == v2RefValue.name) {
											if (!found) {
												found = true
												v2usedvalues.add(v2)
											}
										}
									}
								}
							}
							if (!found) {
								throw new RuntimeException
							}
						} else {
							val candidates = s2.values.filter(SingleReferenceValue).filter [
								it.referenceValue instanceof statemachines.almostuml.State
							]
							if (candidates.size > 1) {
								throw new RuntimeException
							}
							val v2 = candidates.head
							val statemachines.almostuml.State v1refvalue = v1.
								referenceValue as statemachines.almostuml.State
							val statemachines.almostuml.State v2refvalue = v2.
								referenceValue as statemachines.almostuml.State
							if (v1refvalue.name != v2refvalue.name) {
								throw new RuntimeException
							}
						}
					} else if (v1 instanceof ManyReferenceValue) {

						val candidates = s2.values.filter(ManyReferenceValue)
						if (candidates.size > 1) {
							throw new RuntimeException
						}
						val v2 = candidates.head

						if (v1.referenceValues.size != v2.referenceValues.size) {
							throw new RuntimeException
						}

						for (v1val : v1.referenceValues.filter(TracedObject)) {
							val index = v1.referenceValues.indexOf(v1val)
							val v2val = v2.referenceValues.get(index) as TracedObject<?>
							val v1valref = (v1val.dimensions.get(0) as Dimension).values.get(0) as SingleReferenceValue
							val v2valref = (v2val.dimensions.get(0) as Dimension).values.get(0) as SingleReferenceValue
							val e1 = v1valref.referenceValue as CustomEvent
							val e2 = v2valref.referenceValue as CustomEvent
							if (e1.name != e2.name)
								throw new RuntimeException
						}

					}
				}
			}
		}

		// Checking that steps are equivalent
		compareSteps(t1.rootStep, t2.rootStep)

	}

}
