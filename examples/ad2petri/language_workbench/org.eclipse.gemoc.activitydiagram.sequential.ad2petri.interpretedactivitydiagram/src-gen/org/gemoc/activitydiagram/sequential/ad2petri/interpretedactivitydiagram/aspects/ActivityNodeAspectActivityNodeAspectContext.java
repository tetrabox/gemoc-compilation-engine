package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode;
import java.util.Map;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityNodeAspectActivityNodeAspectContext {
  public final static ActivityNodeAspectActivityNodeAspectContext INSTANCE = new ActivityNodeAspectActivityNodeAspectContext();
  
  public static ActivityNodeAspectActivityNodeAspectProperties getSelf(final ActivityNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode, org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties>();
  
  public Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> getMap() {
    return map;
  }
}
