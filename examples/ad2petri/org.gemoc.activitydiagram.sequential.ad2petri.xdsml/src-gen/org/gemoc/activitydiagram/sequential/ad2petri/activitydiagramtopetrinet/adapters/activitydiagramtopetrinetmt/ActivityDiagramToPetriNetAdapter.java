package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public class ActivityDiagramToPetriNetAdapter extends ResourceAdapter implements ActivityDiagramToPetriNetMT {
  public ActivityDiagramToPetriNetAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ActivitydiagramFactory getActivitydiagramFactory() {
    return new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getActivitydiagramFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
