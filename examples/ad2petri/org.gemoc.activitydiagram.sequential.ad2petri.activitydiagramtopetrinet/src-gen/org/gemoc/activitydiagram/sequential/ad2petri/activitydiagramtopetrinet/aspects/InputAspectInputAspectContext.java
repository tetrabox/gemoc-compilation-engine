package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Input;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputAspectInputAspectProperties;

@SuppressWarnings("all")
public class InputAspectInputAspectContext {
  public final static InputAspectInputAspectContext INSTANCE = new InputAspectInputAspectContext();
  
  public static InputAspectInputAspectProperties getSelf(final Input _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputAspectInputAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Input, InputAspectInputAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Input, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputAspectInputAspectProperties>();
  
  public Map<Input, InputAspectInputAspectProperties> getMap() {
    return map;
  }
}
