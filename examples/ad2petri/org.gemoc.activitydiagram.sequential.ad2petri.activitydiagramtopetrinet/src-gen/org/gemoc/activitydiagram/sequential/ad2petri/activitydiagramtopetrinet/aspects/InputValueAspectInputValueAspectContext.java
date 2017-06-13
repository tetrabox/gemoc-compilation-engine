package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InputValue;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputValueAspectInputValueAspectProperties;

@SuppressWarnings("all")
public class InputValueAspectInputValueAspectContext {
  public final static InputValueAspectInputValueAspectContext INSTANCE = new InputValueAspectInputValueAspectContext();
  
  public static InputValueAspectInputValueAspectProperties getSelf(final InputValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputValueAspectInputValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InputValue, InputValueAspectInputValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InputValue, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.InputValueAspectInputValueAspectProperties>();
  
  public Map<InputValue, InputValueAspectInputValueAspectProperties> getMap() {
    return map;
  }
}
