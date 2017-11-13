DSL org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram {
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram/model/CompiledActivityDiagram.ecore"
	}
	semantic {
		k3 = "org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspect"
	}
}
