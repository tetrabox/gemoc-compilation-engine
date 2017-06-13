package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityAspectActivityAspectProperties;

@SuppressWarnings("all")
public class ActivityAspectActivityAspectContext {
  public final static ActivityAspectActivityAspectContext INSTANCE = new ActivityAspectActivityAspectContext();
  
  public static ActivityAspectActivityAspectProperties getSelf(final Activity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityAspectActivityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Activity, ActivityAspectActivityAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityAspectActivityAspectProperties>();
  
  public Map<Activity, ActivityAspectActivityAspectProperties> getMap() {
    return map;
  }
}
