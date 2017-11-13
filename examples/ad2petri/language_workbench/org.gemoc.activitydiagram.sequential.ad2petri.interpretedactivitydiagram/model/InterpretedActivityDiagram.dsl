DSL org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram {
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram/model/InterpretedActivityDiagram.ecore"
	}
	semantic {
		k3 = "org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.FinalNodeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect",
		"org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspect"
	}
}
