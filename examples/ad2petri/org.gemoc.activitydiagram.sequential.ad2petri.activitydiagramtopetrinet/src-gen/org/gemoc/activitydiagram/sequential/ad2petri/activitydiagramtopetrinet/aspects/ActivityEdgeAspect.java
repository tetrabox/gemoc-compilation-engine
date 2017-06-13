package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.NamedElementAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  @Containment
  public static EList<Offer> offers(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_offers(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void offers(final ActivityEdge _self, final EList<Offer> offers) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offers(_self_, _self,offers);;
  }
  
  protected static EList<Offer> _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOffers") &&
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
    return _self_.offers;
  }
  
  protected static void _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Offer> offers) {
    _self_.offers = offers; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOffers")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offers);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
