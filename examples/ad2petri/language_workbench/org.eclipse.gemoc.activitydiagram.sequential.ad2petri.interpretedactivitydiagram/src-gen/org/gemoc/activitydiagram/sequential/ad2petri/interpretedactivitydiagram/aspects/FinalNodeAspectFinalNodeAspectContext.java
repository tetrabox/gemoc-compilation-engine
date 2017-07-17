package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.FinalNode;
import java.util.Map;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties;

@SuppressWarnings("all")
public class FinalNodeAspectFinalNodeAspectContext {
  public final static FinalNodeAspectFinalNodeAspectContext INSTANCE = new FinalNodeAspectFinalNodeAspectContext();
  
  public static FinalNodeAspectFinalNodeAspectProperties getSelf(final FinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalNode, FinalNodeAspectFinalNodeAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.FinalNode, org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties>();
  
  public Map<FinalNode, FinalNodeAspectFinalNodeAspectProperties> getMap() {
    return map;
  }
}
