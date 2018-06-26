package org.gemoc.execution.feedbackengine

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration

class TargetRunConfiguration implements IRunConfiguration {

	val URI staticModelURI
	val String melangeQuery
	val String entryPoint
	val String languageName
	val String initMethod
	val String initArguments

	new(URI staticModelURI, String entryPoint, String languageName, String initMethod, String initArguments) {
		this.staticModelURI = staticModelURI
		this.melangeQuery = "?lang=" + languageName
		this.entryPoint = entryPoint
		this.languageName = languageName
		this.initMethod = initMethod
		this.initArguments = initArguments
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
		"org.eclipse.gemoc.execution.sequential.javaengine.ui.debugModel"
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
		initArguments
	}

	override getModelInitializationMethod() {
		initMethod
	}

}
