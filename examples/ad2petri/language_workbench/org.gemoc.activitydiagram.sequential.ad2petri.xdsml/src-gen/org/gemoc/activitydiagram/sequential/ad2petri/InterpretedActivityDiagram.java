package org.gemoc.activitydiagram.sequential.ad2petri;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT;
import org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagramMT;
import org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagramMT;

@SuppressWarnings("all")
public class InterpretedActivityDiagram implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static InterpretedActivityDiagram load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    InterpretedActivityDiagram mm = new InterpretedActivityDiagram();
    mm.setResource(res);
    return mm ;
  }
  

}
