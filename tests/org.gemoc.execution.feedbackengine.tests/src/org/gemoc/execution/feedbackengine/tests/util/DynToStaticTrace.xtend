package org.gemoc.execution.feedbackengine.tests.util

import fr.inria.diverse.melange.resource.MelangeResource
import fr.inria.diverse.trace.commons.model.generictrace.GenericDimension
import fr.inria.diverse.trace.commons.model.generictrace.GenericTracedObject
import fr.inria.diverse.trace.commons.model.generictrace.ManyReferenceValue
import fr.inria.diverse.trace.commons.model.generictrace.SingleReferenceValue
import fr.inria.diverse.trace.commons.model.trace.GenericMSE
import fr.inria.diverse.trace.commons.model.trace.MSEModel
import fr.inria.diverse.trace.commons.model.trace.Trace
import org.gemoc.xdsmlframework.api.core.IExecutionEngine

class DynToStaticTrace {
	
	static def void execute(IExecutionEngine engine, Trace<?,?,?> trace) {
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
}