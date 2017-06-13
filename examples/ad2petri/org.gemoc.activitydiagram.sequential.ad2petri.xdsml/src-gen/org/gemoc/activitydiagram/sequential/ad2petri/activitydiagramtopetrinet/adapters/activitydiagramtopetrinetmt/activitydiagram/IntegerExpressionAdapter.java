package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable;

@SuppressWarnings("all")
public class IntegerExpressionAdapter extends EObjectAdapter<IntegerExpression> implements org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerExpression {
  private ActivityDiagramToPetriNetMTAdaptersFactory adaptersFactory;
  
  public IntegerExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerVariable getOperand2() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getOperand2(), eResource);
  }
  
  @Override
  public void setOperand2(final IntegerVariable o) {
    if (o != null)
    	adaptee.setOperand2(((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setOperand2(null);
  }
  
  @Override
  public IntegerVariable getOperand1() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getOperand1(), eResource);
  }
  
  @Override
  public void setOperand1(final IntegerVariable o) {
    if (o != null)
    	adaptee.setOperand1(((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setOperand1(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.ExpressionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		return getOperand2();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		return getOperand1();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		return getOperand2() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		return getOperand1() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		setOperand2(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		setOperand1(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
