package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext {
  public final static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext INSTANCE = new IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext();
  
  public static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties getSelf(final IntegerComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties>();
  
  public Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
