package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectProperties;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final InitialNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
  }
}
