package org.gemoc.execution.feedbackengine.tests.sm2java

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
abstract class AbstractSm2JavaFeedbackEngineRandomModelsTestSuite {

	public static val sm2javaModelsPlugin = "org.tetrabox.examples.statemachines.models"

	protected int sizeNumber;
	protected String size;
	protected String model;

	abstract def void genericInternalTest(String plugin, String folder, String model)

	@Parameters(name="{1}")
	public static def Collection<Object[]> data() {
		val amountPerSize = 3
		val sizes = #[100]
		val result = new ArrayList<Object[]>

		var first = true

		for (size : sizes) {
			val names = (1 .. amountPerSize).map [
				//'''sm-size«format(size,3)»-id«format(it,2)».xmi'''
				'''test«it».xmi'''
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

	new(int size, String model) {
		this.size = format(size, 3)
		this.sizeNumber = size
		this.model = model
	}

	@Test
	def void test() {
		//genericInternalTest(sm2javaModelsPlugin, '''/models/«size»''', model)
		genericInternalTest(sm2javaModelsPlugin, '''/models''', model)
	}

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
