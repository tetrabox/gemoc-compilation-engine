package org.gemoc.execution.feedbackengine.tests.sm2java

import java.net.URL
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.gemoc.executionframework.engine.Activator
import org.eclipse.gemoc.executionframework.test.lib.impl.TestUtil
import org.eclipse.gemoc.xdsmlframework.api.core.EngineStatus
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipse.xtext.util.SimpleCache
import org.junit.AfterClass
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
		val amountPerSize = 3 // max number is 11
		val nbScenarios = 3 // max number is 10
		val sizes = #[20, 30, 40, 50] // real list is #[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
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

	static def void cleanup() {

		// GEMOC cleanup
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

		// K3 cleanup
		cleanK3Maps()

		// Xtext cleanup (by reading private fields)
		val valueCacheField = SimpleAttributeResolver.getDeclaredField("valueCache")
		val attributeCacheField = SimpleAttributeResolver.getDeclaredField("attributeCache")
		valueCacheField.accessible = true
		attributeCacheField.accessible = true
		val valueCache = valueCacheField.get(SimpleAttributeResolver::NAME_RESOLVER) as SimpleCache<?, ?>
		val attributeCache = attributeCacheField.get(SimpleAttributeResolver::NAME_RESOLVER) as SimpleCache<?, ?>
		valueCache.clear
		attributeCache.clear
	}

	static Set<Map<?, ?>> k3Maps = new HashSet

	static def void cleanK3Maps() {

		// find all k3 maps
		if (k3Maps.empty) {
			val bundle = Platform::getBundle("org.tetrabox.minijava.xminijava")
			val bundleIterator = bundle.findEntries("/", "*Context.class", true)
			while (bundleIterator.hasMoreElements) {
				val URL bundleElement = bundleIterator.nextElement
				val className = bundleElement.file.replaceFirst("/bin/", "").replaceFirst(".class", "").
					replaceAll("/", ".")
				val Class<?> c = bundle.loadClass(className)
				if (c.fields.exists[it.name == "INSTANCE"]) {
					val instanceField = c.getField("INSTANCE")
					val instance = instanceField.get(c)
					val mapGetter = instance.class.methods.findFirst[it.name == "getMap"]
					val map = mapGetter.invoke(instance) as Map<?, ?>
					k3Maps.add(map)
				}
			}
		}

		// clear all maps
		for (m : k3Maps) {
			m.clear
		}
	}

	@AfterClass
	static def void pause() {
		TestUtil::waitForJobsThenWindowClosed
	}
}
