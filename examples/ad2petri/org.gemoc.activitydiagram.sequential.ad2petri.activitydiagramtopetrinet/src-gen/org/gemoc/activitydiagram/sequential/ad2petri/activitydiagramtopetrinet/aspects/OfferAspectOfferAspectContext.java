package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties;

@SuppressWarnings("all")
public class OfferAspectOfferAspectContext {
  public final static OfferAspectOfferAspectContext INSTANCE = new OfferAspectOfferAspectContext();
  
  public static OfferAspectOfferAspectProperties getSelf(final Offer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Offer, OfferAspectOfferAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OfferAspectOfferAspectProperties>();
  
  public Map<Offer, OfferAspectOfferAspectProperties> getMap() {
    return map;
  }
}
