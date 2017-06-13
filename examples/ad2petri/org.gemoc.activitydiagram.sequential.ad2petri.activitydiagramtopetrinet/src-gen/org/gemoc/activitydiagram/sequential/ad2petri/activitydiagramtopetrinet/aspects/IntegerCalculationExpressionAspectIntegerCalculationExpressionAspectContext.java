package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext {
  public final static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext INSTANCE = new IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext();
  
  public static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties getSelf(final IntegerCalculationExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties>();
  
  public Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> getMap() {
    return map;
  }
}
