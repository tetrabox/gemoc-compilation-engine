package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties;

@Aspect(className = Offer.class)
@SuppressWarnings("all")
public class OfferAspect {
  public static EList<Token> offeredTokens(final Offer _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_offeredTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void offeredTokens(final Offer _self, final EList<Token> offeredTokens) {
    final org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectContext.getSelf(_self);
    _privk3_offeredTokens(_self_, _self,offeredTokens);;
  }
  
  protected static EList<Token> _privk3_offeredTokens(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOfferedTokens") &&
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
    return _self_.offeredTokens;
  }
  
  protected static void _privk3_offeredTokens(final OfferAspectOfferAspectProperties _self_, final Offer _self, final EList<Token> offeredTokens) {
    _self_.offeredTokens = offeredTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOfferedTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offeredTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
