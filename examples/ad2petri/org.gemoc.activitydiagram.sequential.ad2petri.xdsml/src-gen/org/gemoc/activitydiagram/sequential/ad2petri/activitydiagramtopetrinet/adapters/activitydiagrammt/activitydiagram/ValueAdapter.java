package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class ValueAdapter extends EObjectAdapter<Value> implements activitydiagram.Value {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ValueAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return activitydiagram.ActivitydiagramPackage.eINSTANCE.getValue();
  }
}
