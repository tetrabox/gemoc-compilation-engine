package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerComparisonExpression _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerComparisonExpression _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self) {
  }
}
