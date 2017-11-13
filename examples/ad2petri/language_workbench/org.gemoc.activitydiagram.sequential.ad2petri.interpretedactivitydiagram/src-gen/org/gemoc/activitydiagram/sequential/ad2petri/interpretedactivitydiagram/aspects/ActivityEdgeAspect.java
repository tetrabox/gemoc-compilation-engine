package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect {
  @Containment
  public static EList<Token> heldTokens(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_heldTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void heldTokens(final ActivityEdge _self, final EList<Token> heldTokens) {
    final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
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
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Token> heldTokens) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.heldTokens = heldTokens;
    }
  }
}
