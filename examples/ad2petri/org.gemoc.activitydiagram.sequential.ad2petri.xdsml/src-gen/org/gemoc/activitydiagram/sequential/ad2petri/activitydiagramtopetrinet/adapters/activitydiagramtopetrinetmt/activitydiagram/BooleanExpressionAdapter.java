package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable;

@SuppressWarnings("all")
public class BooleanExpressionAdapter extends EObjectAdapter<BooleanExpression> implements org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanExpression {
  private ActivityDiagramToPetriNetMTAdaptersFactory adaptersFactory;
  
  public BooleanExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanVariable getAssignee() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource);
  }
  
  @Override
  public void setAssignee(final BooleanVariable o) {
    if (o != null)
    	adaptee.setAssignee(((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setAssignee(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_EXPRESSION__ASSIGNEE:
    		return getAssignee();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_EXPRESSION__ASSIGNEE:
    		return getAssignee() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_EXPRESSION__ASSIGNEE:
    		setAssignee(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
