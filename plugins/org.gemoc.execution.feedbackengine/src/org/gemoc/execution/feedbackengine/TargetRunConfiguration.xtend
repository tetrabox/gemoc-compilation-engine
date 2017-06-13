package org.gemoc.execution.feedbackengine

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.gemoc.xdsmlframework.api.core.IRunConfiguration

class TargetRunConfiguration implements IRunConfiguration {

	val URI staticModelURI
	val String melangeQuery
	val String entryPoint
	val String languageName
	val String initMethod

	new(URI staticModelURI, String melangeQuery, String entryPoint, String languageName, String initMethod) {
		this.staticModelURI = staticModelURI
		this.melangeQuery = melangeQuery
		this.entryPoint = entryPoint
		this.languageName = languageName
		this.initMethod = initMethod
	}

	override getAnimationDelay() {
		0;
	}

	override getAnimatorURI() {
		null;
	}

	override getDeadlockDetectionDepth() {
		0;
	}

	override getEngineAddonExtensions() {
		#[]
	}

	override getExecutedModelAsMelangeURI() {
		null
	}

	override getExecutedModelURI() {
		staticModelURI
	}

	override getExecutionEntryPoint() {
		entryPoint
	}

	override getLanguageName() {
		languageName
	}

	override getMelangeQuery() {
		melangeQuery
	}

	override getBreakStart() {
		false
	}

	override getDebugModelID() {
		"org.gemoc.execution.sequential.javaengine.ui.debugModel"
	}

	override getModelEntryPoint() {
		val ResourceSet resourceSet = new ResourceSetImpl();
		val Resource modelResource = resourceSet.createResource(staticModelURI);
		modelResource.load(null);
		val result = modelResource.getURIFragment(modelResource.contents.head)
		modelResource.unload
		return result
	}

	override getModelInitializationArguments() {
		""
	}

	override getModelInitializationMethod() {
		initMethod
	}

}
