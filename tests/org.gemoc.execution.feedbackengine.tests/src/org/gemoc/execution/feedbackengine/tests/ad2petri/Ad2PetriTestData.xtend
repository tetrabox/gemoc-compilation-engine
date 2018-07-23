package org.gemoc.execution.feedbackengine.tests.ad2petri

import java.util.ArrayList
import java.util.Collection
import org.junit.runners.Parameterized.Parameters

import static org.gemoc.execution.feedbackengine.tests.Util.*

class Ad2PetriTestData {

	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		val amountPerSize = 11
		val sizes = #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		val result = new ArrayList<Object[]>

		var first = true

		for (size : sizes) {
			val names = (0 .. amountPerSize-1).map [
				'''activity-size«format(size,3)»-id«format(it,2)».xmi'''
			]

			for (name : names) {
				result.add(#[size, name, -1])
				// TODO we put the first one first, since it will give terrible results the first time 
				if (first) {
					result.add(#[size, name, -1])
					first = false
				}

			}

		}
		return result
	}

}
