package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Expression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class ExpressionAdapter extends EObjectAdapter<Expression> implements activitydiagram.Expression {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return activitydiagram.ActivitydiagramPackage.eINSTANCE.getExpression();
  }
}
