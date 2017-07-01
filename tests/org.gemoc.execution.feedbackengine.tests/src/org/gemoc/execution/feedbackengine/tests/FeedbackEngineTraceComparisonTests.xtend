package org.gemoc.execution.feedbackengine.tests

import fr.inria.diverse.melange.resource.MelangeResource
import fr.inria.diverse.trace.commons.EMFCompareUtil
import fr.inria.diverse.trace.commons.model.generictrace.GenericDimension
import fr.inria.diverse.trace.commons.model.generictrace.GenericTracedObject
import fr.inria.diverse.trace.commons.model.generictrace.ManyReferenceValue
import fr.inria.diverse.trace.commons.model.generictrace.SingleReferenceValue
import fr.inria.diverse.trace.commons.model.trace.GenericMSE
import fr.inria.diverse.trace.commons.model.trace.MSEModel
import fr.inria.diverse.trace.commons.model.trace.Trace
import org.gemoc.execution.feedbackengine.tests.languages.CompiledActivityDiagram
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedActivityDiagram
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.gemoc.executionframework.test.lib.impl.TestHelper
import org.gemoc.executionframework.test.lib.impl.TestModel
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.junit.AfterClass
import org.junit.Assert
import org.junit.Test

class FeedbackEngineTraceComparisonTests {
	public static val ad2petriModelsPlugin = "org.gemoc.activitydiagram.sequential.ad2petri.models"

	private static def void cleanTrace(IExecutionEngine engine, Trace<?,?,?> trace) {
		val modelResource = engine.executionContext.resourceModel
		if (modelResource instanceof MelangeResource) {
			val entrySet = modelResource.modelsMapping.entrySet
			val allTraceElements = trace.eAllContents.toSet

			// Replace "originalObject" refs
			for (tracedObject : trace.tracedObjects.filter(GenericTracedObject)) {
				if (tracedObject.originalObject != null) {
					val obj = tracedObject.originalObject

					val realObject = entrySet.findFirst[it.value == obj].key
					tracedObject.originalObject = realObject

				}
			}

			// Replace "SingleRef" refs
			for (SingleReferenceValue singleRef : allTraceElements.filter(SingleReferenceValue)) {
				val entry = entrySet.findFirst[it.value == singleRef.referenceValue]
				if (entry != null) {
					val realObject = entry.key
					singleRef.referenceValue = realObject
				}
			}

			// Replace "ManyReferenceValue" refs
			for (ManyReferenceValue manyref : allTraceElements.filter(ManyReferenceValue)) {
				val objs = manyref.referenceValues
				for (obj : objs) {
					val entry = entrySet.findFirst[it.value == obj]
					if (entry != null) {
						val realObject = entry.key
						objs.set(objs.indexOf(obj), realObject)
					}
				}
			}

			// Remove refs to dyn properties
			for (GenericDimension dim : allTraceElements.filter(GenericDimension)) {
				dim.dynamicProperty = null
			}

			// Remove refs to eoperations
			// Replace "callerReference" refs
			val MSEModel msemodel = trace.eResource.contents.filter(MSEModel).head
			val mseModelAllContent = msemodel.eAllContents.toSet
			for (GenericMSE mse : mseModelAllContent.filter(GenericMSE)) {
				mse.actionReference = null
				val obj = mse.callerReference
				val entry = entrySet.findFirst[it.value == obj]
				if (entry != null) {
					val realObject = entry.key
					mse.callerReference = realObject
				}

			}

			// Remove launchconfiguration
			trace.launchconfiguration = null
			trace.eResource.save(null)

		}
	}

	private def void genericInternalTest(String folder, String model) {
		val engine1 = new FeedbackEngineWrapper()
		val engine2 = new JavaEngineWrapper()
		val trace1 = TestHelper::testWithGenericTrace(engine1, new CompiledActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram"))
		val trace2 = TestHelper::testWithGenericTrace(engine2, new InterpretedActivityDiagram(),
			new TestModel(ad2petriModelsPlugin, folder, model, "",
				"?lang=org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram"))
		cleanTrace(engine1.realEngine, trace1)
		cleanTrace(engine2.realEngine, trace2)

		val diffs = EMFCompareUtil::compare(trace1, trace2)


		Assert::assertTrue(diffs.empty)
	}
	
	@AfterClass
	static def void pause() {
	//	TestUtil::waitForJobsThenWindowClosed
	}

	@Test
	def void test1TraceComparison() {
		genericInternalTest("/basic", "test1.xmi")
	}

	@Test
	def void test2TraceComparison() {
		genericInternalTest("/basic", "test2.xmi")
	}
}
