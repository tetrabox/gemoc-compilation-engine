package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
  }
}
