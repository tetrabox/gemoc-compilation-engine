package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties;

@SuppressWarnings("all")
public class FinalNodeAspectFinalNodeAspectContext {
  public final static FinalNodeAspectFinalNodeAspectContext INSTANCE = new FinalNodeAspectFinalNodeAspectContext();
  
  public static FinalNodeAspectFinalNodeAspectProperties getSelf(final FinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalNode, FinalNodeAspectFinalNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode, org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties>();
  
  public Map<FinalNode, FinalNodeAspectFinalNodeAspectProperties> getMap() {
    return map;
  }
}
