package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode;
import java.util.Map;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@SuppressWarnings("all")
public class InitialNodeAspectInitialNodeAspectContext {
  public final static InitialNodeAspectInitialNodeAspectContext INSTANCE = new InitialNodeAspectInitialNodeAspectContext();
  
  public static InitialNodeAspectInitialNodeAspectProperties getSelf(final InitialNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode, org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties>();
  
  public Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> getMap() {
    return map;
  }
}
