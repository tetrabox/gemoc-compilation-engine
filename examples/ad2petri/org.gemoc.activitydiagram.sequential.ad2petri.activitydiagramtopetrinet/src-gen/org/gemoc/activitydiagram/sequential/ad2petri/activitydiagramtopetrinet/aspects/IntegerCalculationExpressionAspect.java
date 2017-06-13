package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@Aspect(className = IntegerCalculationExpression.class)
@SuppressWarnings("all")
public class IntegerCalculationExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerCalculationExpression _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerCalculationExpression _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_, final IntegerCalculationExpression _self) {
  }
}
