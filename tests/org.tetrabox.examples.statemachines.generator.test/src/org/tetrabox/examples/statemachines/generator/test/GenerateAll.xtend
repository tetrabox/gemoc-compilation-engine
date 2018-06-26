package org.tetrabox.examples.statemachines.generator.test

import java.nio.file.Files
import java.nio.file.Paths
import org.junit.Test
import org.tetrabox.examples.statemachines.generator.StateMachinesGenerator
import statemachines.CustomSystem

class GenerateAll {
	@Test
	public def void generateAll() {

		val amountPerSize = 10
		val sizes = #[100, 20] // 30, 40, 50, 60, 70, 80, 90, 100]
		for (size : sizes) {
			for (i : 0 .. amountPerSize) {
				// Generate and persist model
				val StateMachinesGenerator generator = new StateMachinesGenerator();
				val CustomSystem system = generator.generate(size, 10);
				val name = '''statemachine-size«Util::format(size,3)»-id«Util::format(i,2)»'''
				val folder = '''models/«Util::format(size,3)»'''
				Util::persist(system, '''«folder»/«name».xmi''');

				// Generate and persist scenarios
				val scenariofile = Paths::get(folder, '''«name»_scenarios.txt''');
				Files::createFile(scenariofile)
				val buffer = Files::newBufferedWriter(scenariofile)
				for (j : 0 .. 10) {
					val scenario = generator.generateScenario(system)
					val scenarioString = scenario.map[it.name].join(",")
					buffer.write(scenarioString)
					buffer.newLine
				}
				buffer.close
			}
		}

	}
}
