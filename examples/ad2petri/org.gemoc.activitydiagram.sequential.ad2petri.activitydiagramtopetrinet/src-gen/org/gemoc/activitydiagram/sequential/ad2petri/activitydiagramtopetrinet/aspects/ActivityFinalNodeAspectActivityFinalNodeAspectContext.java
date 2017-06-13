package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityFinalNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityFinalNodeAspectActivityFinalNodeAspectContext {
  public final static ActivityFinalNodeAspectActivityFinalNodeAspectContext INSTANCE = new ActivityFinalNodeAspectActivityFinalNodeAspectContext();
  
  public static ActivityFinalNodeAspectActivityFinalNodeAspectProperties getSelf(final ActivityFinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityFinalNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties>();
  
  public Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> getMap() {
    return map;
  }
}
