package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.DecisionNodeAspectDecisionNodeAspectProperties;

@SuppressWarnings("all")
public class DecisionNodeAspectDecisionNodeAspectContext {
  public final static DecisionNodeAspectDecisionNodeAspectContext INSTANCE = new DecisionNodeAspectDecisionNodeAspectContext();
  
  public static DecisionNodeAspectDecisionNodeAspectProperties getSelf(final DecisionNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.DecisionNodeAspectDecisionNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.DecisionNodeAspectDecisionNodeAspectProperties>();
  
  public Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> getMap() {
    return map;
  }
}
