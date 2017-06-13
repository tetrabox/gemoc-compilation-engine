package org.gemoc.activitydiagram.sequential.ad2petri;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public interface ActivityDiagramToPetriNetMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ActivitydiagramFactory getActivitydiagramFactory();
  
  public abstract void save(final String uri) throws IOException;
}