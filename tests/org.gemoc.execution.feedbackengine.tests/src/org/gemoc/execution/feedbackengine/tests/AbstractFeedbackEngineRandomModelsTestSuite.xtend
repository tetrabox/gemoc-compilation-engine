package org.gemoc.execution.feedbackengine.tests

import java.util.ArrayList
import java.util.Collection
import org.eclipse.gemoc.executionframework.engine.Activator
import org.eclipse.gemoc.xdsmlframework.api.core.EngineStatus
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

import static org.gemoc.execution.feedbackengine.tests.Util.*

@RunWith(Parameterized)
abstract class AbstractFeedbackEngineRandomModelsTestSuite {

	public static val ad2petriModelsPlugin = "org.gemoc.activitydiagram.sequential.ad2petri.models"
	public static val ad2petriGeneratedModelsPlugin = "org.modelexecution.activitydiagram.generator.test"

	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		val amountPerSize = 1
//val sizes = #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		val sizes = #[100]
		val result = new ArrayList<Object[]>

		var first = true

		for (size : sizes) {
			val names = (1 .. amountPerSize).map [
				'''activity-size«format(size,3)»-id«format(it,2)».xmi'''
			]

			for (name : names) {
				result.add(#[size, name])
				// TODO we put the first one first, since it will give terrible results the first time 
				if (first) {
					result.add(#[size, name])
					first = false
				}

			}

		}
		return result
	}

	protected int sizeNumber;
	protected String size;
	protected String model;

	new(int size, String model) {
		this.size = format(size, 3)
		this.sizeNumber = size
		this.model = model
	}

	@Test
	def void test() {
		genericInternalTest(ad2petriGeneratedModelsPlugin, '''/models/«size»''', model)
	}

	abstract def void genericInternalTest(String string, String string2, String string3)

	// @After
	static def void cleanup() {

		val stoppedEnginesEntries = Activator.getDefault().gemocRunningEngineRegistry.getRunningEngines().entrySet().
			filter[it.value.getRunningStatus == EngineStatus.RunStatus.Stopped]
		for (stopped : stoppedEnginesEntries) {
			val resourceSet = stopped.getValue().executionContext.resourceModel.resourceSet
			for (resource : resourceSet.resources) {
				resource.eAdapters.clear()
				resource.unload()
			}
			stopped.getValue().dispose();
			Activator.getDefault().gemocRunningEngineRegistry.unregisterEngine(stopped.getKey());
		}

	}
}
