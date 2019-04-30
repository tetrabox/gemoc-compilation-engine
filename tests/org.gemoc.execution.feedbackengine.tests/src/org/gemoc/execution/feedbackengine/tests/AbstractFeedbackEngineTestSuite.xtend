package org.gemoc.execution.feedbackengine.tests

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.HashSet
import java.util.List
import java.util.Optional
import java.util.stream.Collectors
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.gemoc.executionframework.engine.Activator
import org.eclipse.gemoc.executionframework.test.lib.impl.TestUtil
import org.eclipse.gemoc.xdsmlframework.api.core.EngineStatus
import org.junit.AfterClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

import static org.gemoc.execution.feedbackengine.tests.Util.*

@RunWith(Parameterized)
abstract class AbstractFeedbackEngineTestSuite {

	protected int sizeNumber;
	protected String size;
	protected String modelFileName;
	protected int scenarioID = -1;

	abstract def void genericInternalTest(String plugin, String folder, String model, int scenarioID)

	abstract def String getPluginName()

	new(int size, String modelFileName, int scenarioID) {
		this.size = format(size, 3)
		this.sizeNumber = size
		this.modelFileName = modelFileName
		this.scenarioID = scenarioID
	}

	protected static def Optional<String> findScenario(String model, String plugin, String folder, int scenarioID) {
		if (scenarioID != -1) {
			val path = model.replace(".xmi", "_scenarios.txt")
			val scenarioStream = Util::openFileFromPlugin(plugin, folder + "/" + path)

			val List<String> allScenarios = new BufferedReader(new InputStreamReader(scenarioStream)).lines().collect(
				Collectors.toList());
			scenarioStream.close
			val String scenario = allScenarios.get(scenarioID).replaceAll(",", "\n")
			Optional::of(scenario)
		} else {
			return Optional::ofNullable(null)
		}
	}

	@Test
	def void test() {
		genericInternalTest(getPluginName, '''/models/«size»''', modelFileName, scenarioID)
	}

	static def void gemocCleanUp() {
		val stoppedEnginesEntries = Activator.getDefault().gemocRunningEngineRegistry.getRunningEngines().entrySet().
			filter[it.value.getRunningStatus == EngineStatus.RunStatus.Stopped]
		val resourceSets = new HashSet<ResourceSet>
		for (stopped : stoppedEnginesEntries) {
			val resourceSet = stopped.getValue().executionContext.resourceModel.resourceSet
			resourceSets.add(resourceSet)
			for (resource : resourceSet.resources) {
				resource.eAdapters.clear()
				resource.unload()
			}
			stopped.getValue().dispose();
			Activator.getDefault().gemocRunningEngineRegistry.unregisterEngine(stopped.getKey());
		}
		for (resourceSet : resourceSets) {
			resourceSet.resources.clear
		}
	}

	@AfterClass
	static def void pause() {
		TestUtil::waitForJobsThenWindowClosed
	}
}
