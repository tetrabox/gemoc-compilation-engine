package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanUnaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final BooleanUnaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self) {
  }
}
