package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect {
  @Containment
  public static EList<Token> heldTokens(final ActivityEdge _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_heldTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void heldTokens(final ActivityEdge _self, final EList<Token> heldTokens) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);;
  }
  
  protected static EList<Token> _privk3_heldTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Token> heldTokens) {
    _self_.heldTokens = heldTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
