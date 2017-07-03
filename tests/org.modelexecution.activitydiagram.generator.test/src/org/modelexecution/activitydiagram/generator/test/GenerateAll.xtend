package org.modelexecution.activitydiagram.generator.test

import activitydiagram.Activity
import org.junit.Test
import org.modelexecution.activitydiagram.generator.ActivityGenerator

class GenerateAll {
	@Test
	public def void generateActivitySize50() {

		val amountPerSize = 10
		val sizes = #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

		for (size : sizes) {
			for (i : 0 .. amountPerSize) {
				val ActivityGenerator generator = new ActivityGenerator();
				val Activity activity = generator.generateActivity(size, 40);
				val name = '''activity-size«Util::format(size,3)»-id«Util::format(i,2)»'''
				activity.setName(name);
				Util::persist(activity, '''models/«Util::format(size,3)»/«name».xmi''');
			}
		}

	}
}
