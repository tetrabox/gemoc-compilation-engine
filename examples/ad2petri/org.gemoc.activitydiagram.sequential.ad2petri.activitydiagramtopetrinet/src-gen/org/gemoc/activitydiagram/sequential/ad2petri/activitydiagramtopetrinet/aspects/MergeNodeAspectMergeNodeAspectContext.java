package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.MergeNodeAspectMergeNodeAspectProperties;

@SuppressWarnings("all")
public class MergeNodeAspectMergeNodeAspectContext {
  public final static MergeNodeAspectMergeNodeAspectContext INSTANCE = new MergeNodeAspectMergeNodeAspectContext();
  
  public static MergeNodeAspectMergeNodeAspectProperties getSelf(final MergeNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.MergeNodeAspectMergeNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.MergeNodeAspectMergeNodeAspectProperties>();
  
  public Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> getMap() {
    return map;
  }
}
