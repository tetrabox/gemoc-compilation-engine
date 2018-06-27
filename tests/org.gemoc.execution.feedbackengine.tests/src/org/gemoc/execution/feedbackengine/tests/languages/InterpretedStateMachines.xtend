package org.gemoc.execution.feedbackengine.tests.languages

import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper

class InterpretedStateMachines implements ILanguageWrapper {

	override getEntryPoint() {
		"public static void org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspect.main(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem)"
	}

	override getLanguageName() {
		"org.tetrabox.examples.statemachines.InterpretedStateMachines"
	}

	override getInitializationMethod() {
		"org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CustomSystemAspect.initialize"
	}

}
