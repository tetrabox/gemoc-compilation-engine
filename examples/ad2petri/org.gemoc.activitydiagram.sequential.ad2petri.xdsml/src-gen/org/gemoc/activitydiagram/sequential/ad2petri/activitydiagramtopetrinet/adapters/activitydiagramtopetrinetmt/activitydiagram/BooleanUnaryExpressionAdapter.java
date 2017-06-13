package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryOperator;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAdapter extends EObjectAdapter<BooleanUnaryExpression> implements org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryExpression {
  private ActivityDiagramToPetriNetMTAdaptersFactory adaptersFactory;
  
  public BooleanUnaryExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanUnaryOperator getOperator() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BooleanUnaryOperator o) {
    adaptee.setOperator(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryOperator.get(o.getValue()));
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
  public BooleanVariable getOperand() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final BooleanVariable o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanUnaryExpressionAspect.execute(adaptee);
  }
  
  protected final static BooleanUnaryOperator OPERATOR_EDEFAULT = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryOperator.NOT;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		return getAssignee();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		return getAssignee() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		setAssignee(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
