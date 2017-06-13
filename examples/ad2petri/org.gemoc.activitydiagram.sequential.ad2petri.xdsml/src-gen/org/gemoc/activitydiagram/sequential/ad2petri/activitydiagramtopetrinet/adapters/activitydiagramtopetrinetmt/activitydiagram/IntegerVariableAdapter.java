package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.Value;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.IntegerVariable {
  private ActivityDiagramToPetriNetMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Value getInitialValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getInitialValue(), eResource);
  }
  
  @Override
  public void setInitialValue(final Value o) {
    if (o != null)
    	adaptee.setInitialValue(((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setInitialValue(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspect.execute(adaptee);
  }
  
  @Override
  public Value getCurrentValue() {
    return (Value) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect.currentValue(adaptee), eResource);
  }
  
  @Override
  public void setCurrentValue(final Value currentValue) {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect.currentValue(adaptee, (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value)((EObjectAdapter)currentValue).getAdaptee()
    );
  }
  
  @Override
  public void init() {
    org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.VariableAspect.init(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		return getCurrentValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != null;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		return getCurrentValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.Value)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		setCurrentValue(
    		(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt.activitydiagram.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
