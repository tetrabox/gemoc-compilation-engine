package org.gemoc.execution.feedbackengine.tests

import java.util.ArrayList
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.eclipse.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension
import org.eclipse.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtensionPoint
import org.eclipse.gemoc.executionframework.test.lib.IExecutableModel
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration

class FeedbackTestRunConfiguration implements IK3RunConfiguration {
	val ILanguageWrapper language
	val IExecutableModel model
	val Set<String> addonsToLoad
	val URI modelURI

	new(IExecutableModel model, URI modelURI, ILanguageWrapper language, Set<String> addonsToLoad) {
		this.language = language
		this.model = model
		this.addonsToLoad = addonsToLoad
		this.modelURI = modelURI
	}

	override getAnimationDelay() {
		return 0;
	}

	override getAnimatorURI() {
		return null;
	}

	override getEngineAddonExtensions() {
		val List<EngineAddonSpecificationExtension> result = new ArrayList<EngineAddonSpecificationExtension>();
		val loadedAddons = EngineAddonSpecificationExtensionPoint.getSpecifications()
		for (ext : loadedAddons) {
			if (addonsToLoad.contains(ext.name)) {
				result.add(ext)
			}
		}
		return result
	}

	override getExecutedModelAsMelangeURI() {
		if (melangeQuery.isEmpty())
			return modelURI;
		val String melangeURIString = modelURI.toString().replace("platform:/", "melange:/") + melangeQuery;
		return URI.createURI(melangeURIString);
	}

	override getExecutedModelURI() {
		modelURI
	}

	override getExecutionEntryPoint() {
		language.entryPoint
	}

	override getLanguageName() {
		language.languageName
	}

	override getMelangeQuery() {
		if (model.melangeQuery == null)
			"?lang=" + languageName
		else
			model.melangeQuery
	}

	override getBreakStart() {
		false
	}

	override getDebugModelID() {
		"org.eclipse.gemoc.execution.sequential.javaengine.ui.debugModel"
	}

	override getModelEntryPoint() {
		val ResourceSet resourceSet = new ResourceSetImpl();
		val Resource modelResource = resourceSet.createResource(modelURI);
		modelResource.load(null);
		val result = modelResource.getURIFragment(modelResource.contents.head)
		modelResource.unload
		return result
	}

	override getModelInitializationArguments() {
		model.initArgument
	}

	override getModelInitializationMethod() {
		language.initializationMethod
	}
}
