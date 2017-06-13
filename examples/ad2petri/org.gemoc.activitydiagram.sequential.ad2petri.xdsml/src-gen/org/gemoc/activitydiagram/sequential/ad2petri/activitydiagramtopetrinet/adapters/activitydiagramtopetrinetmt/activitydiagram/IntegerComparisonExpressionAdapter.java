package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAdapter extends EObjectAdapter<IntegerComparisonExpression> implements org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonExpression {
  private ActivityDiagramToPetriNetMTAdaptersFactory adaptersFactory;
  
  public IntegerComparisonExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerComparisonOperator getOperator() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final IntegerComparisonOperator o) {
    adaptee.setOperator(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonOperator.get(o.getValue()));
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
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerComparisonExpressionAspect.execute(adaptee);
  }
  
  protected final static IntegerComparisonOperator OPERATOR_EDEFAULT = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonOperator.SMALLER;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerComparisonExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		return getOperand2();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		return getOperand1();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE:
    		return getAssignee();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		return getOperand2() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		return getOperand1() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE:
    		return getAssignee() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		setOperand2(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		setOperand1(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE:
    		setAssignee(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
