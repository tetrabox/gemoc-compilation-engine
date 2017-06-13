package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
  }
}
