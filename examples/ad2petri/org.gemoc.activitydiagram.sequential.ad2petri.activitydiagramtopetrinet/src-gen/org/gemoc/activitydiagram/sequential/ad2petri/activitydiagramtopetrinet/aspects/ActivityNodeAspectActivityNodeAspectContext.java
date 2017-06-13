package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspectActivityNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityNodeAspectActivityNodeAspectContext {
  public final static ActivityNodeAspectActivityNodeAspectContext INSTANCE = new ActivityNodeAspectActivityNodeAspectContext();
  
  public static ActivityNodeAspectActivityNodeAspectProperties getSelf(final ActivityNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspectActivityNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityNodeAspectActivityNodeAspectProperties>();
  
  public Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> getMap() {
    return map;
  }
}
