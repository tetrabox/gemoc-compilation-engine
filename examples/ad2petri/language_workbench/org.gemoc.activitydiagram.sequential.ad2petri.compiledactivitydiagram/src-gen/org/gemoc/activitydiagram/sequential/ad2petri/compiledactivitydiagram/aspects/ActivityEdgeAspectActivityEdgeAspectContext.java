package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;

@SuppressWarnings("all")
public class ActivityEdgeAspectActivityEdgeAspectContext {
  public final static ActivityEdgeAspectActivityEdgeAspectContext INSTANCE = new ActivityEdgeAspectActivityEdgeAspectContext();
  
  public static ActivityEdgeAspectActivityEdgeAspectProperties getSelf(final ActivityEdge _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityEdge, ActivityEdgeAspectActivityEdgeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge, org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties>();
  
  public Map<ActivityEdge, ActivityEdgeAspectActivityEdgeAspectProperties> getMap() {
    return map;
  }
}
