package org.tetrabox.examples.statemachines.generator.test

import org.junit.Test
import org.tetrabox.examples.statemachines.generator.StateMachinesGenerator
import statemachines.CustomSystem

class GenerateAll {
	@Test
	public def void generateAll() {

		val amountPerSize = 10
		val sizes = #[10, 20] //30, 40, 50, 60, 70, 80, 90, 100]

		for (size : sizes) {
			for (i : 0 .. amountPerSize) {
				val StateMachinesGenerator generator = new StateMachinesGenerator();
				val CustomSystem system = generator.generate(size, 10);
				val name = '''statemachine-size«Util::format(size,3)»-id«Util::format(i,2)»'''
				Util::persist(system, '''models/«Util::format(size,3)»/«name».xmi''');
			}
		}

	}
}
