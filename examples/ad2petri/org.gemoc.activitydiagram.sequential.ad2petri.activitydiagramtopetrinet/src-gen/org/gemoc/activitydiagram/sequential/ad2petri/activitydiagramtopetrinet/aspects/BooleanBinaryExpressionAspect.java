package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanBinaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final BooleanBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_, final BooleanBinaryExpression _self) {
  }
}
