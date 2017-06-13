package org.gemoc.activitydiagram.sequential.ad2petri;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT;
import org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT;

@SuppressWarnings("all")
public class ActivityDiagramToPetriNet implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static ActivityDiagramToPetriNet load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    ActivityDiagramToPetriNet mm = new ActivityDiagramToPetriNet();
    mm.setResource(res);
    return mm ;
  }
  
  public ActivityDiagramMT toActivityDiagramMT() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramToPetriNetAdapter adaptee = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramToPetriNetAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public ActivityDiagramToPetriNetMT toActivityDiagramToPetriNetMT() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetAdapter adaptee = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
