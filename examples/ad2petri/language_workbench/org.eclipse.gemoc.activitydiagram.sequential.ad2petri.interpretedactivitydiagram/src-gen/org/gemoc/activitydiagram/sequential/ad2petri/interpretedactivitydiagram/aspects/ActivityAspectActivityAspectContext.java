package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity;
import java.util.Map;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties;

@SuppressWarnings("all")
public class ActivityAspectActivityAspectContext {
  public final static ActivityAspectActivityAspectContext INSTANCE = new ActivityAspectActivityAspectContext();
  
  public static ActivityAspectActivityAspectProperties getSelf(final Activity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Activity, ActivityAspectActivityAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity, org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties>();
  
  public Map<Activity, ActivityAspectActivityAspectProperties> getMap() {
    return map;
  }
}
