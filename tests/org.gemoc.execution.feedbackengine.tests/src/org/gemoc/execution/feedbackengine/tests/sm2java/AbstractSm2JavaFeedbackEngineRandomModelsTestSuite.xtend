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

	public static val sm2javaModelsPlugin = "org.tetrabox.examples.statemachines.generator.test"

	protected int sizeNumber;
	protected String size;
	protected String modelFileName;
	protected int scenarioID;

	abstract def void genericInternalTest(String plugin, String folder, String model, int scenarioID)

	new(int size, String modelFileName, int scenarioID) {
		this.size = format(size, 3)
		this.sizeNumber = size
		this.modelFileName = modelFileName
		this.scenarioID = scenarioID
	}

	@Parameters(name="{1} - scenario {2}")
	public static def Collection<Object[]> data() {
		val amountPerSize = 11
		val nbScenarios = 10
		val sizes = #[100]
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
		return result
	}

	@Test
	def void test() {
		genericInternalTest(sm2javaModelsPlugin, '''/models/«size»''', modelFileName, scenarioID)
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
