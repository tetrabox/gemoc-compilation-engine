package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspectVariableAspectProperties;

@SuppressWarnings("all")
public class VariableAspectVariableAspectContext {
  public final static VariableAspectVariableAspectContext INSTANCE = new VariableAspectVariableAspectContext();
  
  public static VariableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, VariableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspectVariableAspectProperties>();
  
  public Map<Variable, VariableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
