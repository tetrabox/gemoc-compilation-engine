package org.gemoc.execution.feedbackengine.tests.sm2java

import java.util.ArrayList
import java.util.Collection
import org.junit.runners.Parameterized.Parameters

import static org.gemoc.execution.feedbackengine.tests.Util.*

class Sm2JavaGeneratedTestData {


	@Parameters(name="{1} - scenario {2}")
	public static def Collection<Object[]> data() {
		val amountPerSize = 3 // max number is 11
		val nbScenarios = 3 // max number is 10
		val sizes = #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100] // real list is #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		val result = new ArrayList<Object[]>

		var first = true

		for (size : sizes) {
			val names = (0 .. amountPerSize - 1).map [
				'''statemachine-size«format(size,3)»-id«format(it,2)».xmi'''
			]
			for (name : names) {
				for (scenarioID : 0 .. nbScenarios - 1) {
					result.add(#[size, name, scenarioID])
					// TODO we put the first one twice, since it will give terrible results the first time 
					if (first) {
						result.add(#[size, name, scenarioID])
						first = false
					}

				}
			}
		}
		result.removeIf([it.get(1) == "statemachine-size030-id01.xmi"]) // some problematic traces
		// result.removeIf([! (it.get(1) == "statemachine-size030-id01.xmi")])
		return result
	}


}
