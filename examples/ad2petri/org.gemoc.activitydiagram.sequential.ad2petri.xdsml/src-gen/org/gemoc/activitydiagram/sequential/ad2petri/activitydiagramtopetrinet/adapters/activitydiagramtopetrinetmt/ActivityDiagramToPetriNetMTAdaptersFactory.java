package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Action;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ExecutableNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Expression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.FinalNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Input;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InputValue;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.NamedElement;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Trace;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Util;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityEdgeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityFinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanBinaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlFlowAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlTokenAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.DecisionNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExecutableNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.FinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkedTokenAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InitialNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerCalculationExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.JoinNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.MergeNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.NamedElementAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OfferAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OpaqueActionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TokenAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TraceAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.UtilAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.VariableAdapter;

@SuppressWarnings("all")
public class ActivityDiagramToPetriNetMTAdaptersFactory implements AdaptersFactory {
  private static ActivityDiagramToPetriNetMTAdaptersFactory instance;
  
  public static ActivityDiagramToPetriNetMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ActivityDiagramToPetriNetMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity){
    	return createActivityAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Activity) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlFlow){
    	return createControlFlowAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlFlow) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction){
    	return createOpaqueActionAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode){
    	return createInitialNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityFinalNode){
    	return createActivityFinalNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivityFinalNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkNode){
    	return createForkNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode){
    	return createJoinNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode){
    	return createMergeNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode){
    	return createDecisionNodeAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable){
    	return createVariableAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanValue){
    	return createBooleanValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue){
    	return createIntegerValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value){
    	return createValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression){
    	return createIntegerCalculationExpressionAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression){
    	return createIntegerComparisonExpressionAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryExpression){
    	return createBooleanUnaryExpressionAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanUnaryExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression){
    	return createBooleanBinaryExpressionAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token){
    	return createTokenAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Token) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer){
    	return createOfferAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Offer) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InputValue){
    	return createInputValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InputValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Input){
    	return createInputAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Input) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlToken){
    	return createControlTokenAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ControlToken) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkedToken){
    	return createForkedTokenAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkedToken) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Trace){
    	return createTraceAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Trace) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Util){
    	return createUtilAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Util) o, res);
    }
    
    return null;
  }
  
  public ActivityAdapter createActivityAdapter(final Activity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityAdapter) adapter;
    }
  }
  
  public ActivityNodeAdapter createActivityNodeAdapter(final ActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityNodeAdapter) adapter;
    }
  }
  
  public ActivityEdgeAdapter createActivityEdgeAdapter(final ActivityEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityEdgeAdapter) adapter;
    }
  }
  
  public ControlFlowAdapter createControlFlowAdapter(final ControlFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlFlowAdapter) adapter;
    }
  }
  
  public ControlNodeAdapter createControlNodeAdapter(final ControlNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlNodeAdapter) adapter;
    }
  }
  
  public ExecutableNodeAdapter createExecutableNodeAdapter(final ExecutableNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExecutableNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExecutableNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExecutableNodeAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActionAdapter) adapter;
    }
  }
  
  public OpaqueActionAdapter createOpaqueActionAdapter(final OpaqueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OpaqueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OpaqueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OpaqueActionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.NamedElementAdapter) adapter;
    }
  }
  
  public InitialNodeAdapter createInitialNodeAdapter(final InitialNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InitialNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InitialNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InitialNodeAdapter) adapter;
    }
  }
  
  public FinalNodeAdapter createFinalNodeAdapter(final FinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.FinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.FinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.FinalNodeAdapter) adapter;
    }
  }
  
  public ActivityFinalNodeAdapter createActivityFinalNodeAdapter(final ActivityFinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityFinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    }
  }
  
  public ForkNodeAdapter createForkNodeAdapter(final ForkNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkNodeAdapter) adapter;
    }
  }
  
  public JoinNodeAdapter createJoinNodeAdapter(final JoinNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.JoinNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.JoinNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.JoinNodeAdapter) adapter;
    }
  }
  
  public MergeNodeAdapter createMergeNodeAdapter(final MergeNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.MergeNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.MergeNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.MergeNodeAdapter) adapter;
    }
  }
  
  public DecisionNodeAdapter createDecisionNodeAdapter(final DecisionNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.DecisionNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.DecisionNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.DecisionNodeAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.VariableAdapter) adapter;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanVariableAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanValueAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerValueAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ExpressionAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IntegerCalculationExpressionAdapter createIntegerCalculationExpressionAdapter(final IntegerCalculationExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerCalculationExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    }
  }
  
  public IntegerComparisonExpressionAdapter createIntegerComparisonExpressionAdapter(final IntegerComparisonExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    }
  }
  
  public BooleanUnaryExpressionAdapter createBooleanUnaryExpressionAdapter(final BooleanUnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    }
  }
  
  public BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    }
  }
  
  public TokenAdapter createTokenAdapter(final Token adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TokenAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TokenAdapter) adapter;
    }
  }
  
  public OfferAdapter createOfferAdapter(final Offer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OfferAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OfferAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.OfferAdapter) adapter;
    }
  }
  
  public InputValueAdapter createInputValueAdapter(final InputValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputValueAdapter) adapter;
    }
  }
  
  public InputAdapter createInputAdapter(final Input adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.InputAdapter) adapter;
    }
  }
  
  public ControlTokenAdapter createControlTokenAdapter(final ControlToken adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlTokenAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlTokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ControlTokenAdapter) adapter;
    }
  }
  
  public ForkedTokenAdapter createForkedTokenAdapter(final ForkedToken adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkedTokenAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkedTokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.ForkedTokenAdapter) adapter;
    }
  }
  
  public TraceAdapter createTraceAdapter(final Trace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TraceAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.TraceAdapter) adapter;
    }
  }
  
  public UtilAdapter createUtilAdapter(final Util adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.UtilAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.UtilAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.activitydiagram.UtilAdapter) adapter;
    }
  }
}
