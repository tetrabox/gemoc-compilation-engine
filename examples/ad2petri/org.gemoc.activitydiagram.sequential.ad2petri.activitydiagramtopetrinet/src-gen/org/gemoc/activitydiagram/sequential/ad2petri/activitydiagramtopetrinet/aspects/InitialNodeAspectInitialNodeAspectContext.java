package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectProperties;

@SuppressWarnings("all")
public class InitialNodeAspectInitialNodeAspectContext {
  public final static InitialNodeAspectInitialNodeAspectContext INSTANCE = new InitialNodeAspectInitialNodeAspectContext();
  
  public static InitialNodeAspectInitialNodeAspectProperties getSelf(final InitialNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InitialNodeAspectInitialNodeAspectProperties>();
  
  public Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> getMap() {
    return map;
  }
}
