package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.JoinNodeAspectJoinNodeAspectProperties;

@SuppressWarnings("all")
public class JoinNodeAspectJoinNodeAspectContext {
  public final static JoinNodeAspectJoinNodeAspectContext INSTANCE = new JoinNodeAspectJoinNodeAspectContext();
  
  public static JoinNodeAspectJoinNodeAspectProperties getSelf(final JoinNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.JoinNodeAspectJoinNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.JoinNodeAspectJoinNodeAspectProperties>();
  
  public Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> getMap() {
    return map;
  }
}
