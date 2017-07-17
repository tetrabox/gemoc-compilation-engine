package org.eclipse.gemoc.execution.feedbackengine.tests.languages

import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper

class InterpretedActivityDiagram implements ILanguageWrapper {

	override getEntryPoint() {
		"public static void org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspect.main(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity)"
	}

	override getLanguageName() {
		"org.eclipse.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram"
	}

	override getInitializationMethod() {
		"org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspect.initialize"
	}

}
