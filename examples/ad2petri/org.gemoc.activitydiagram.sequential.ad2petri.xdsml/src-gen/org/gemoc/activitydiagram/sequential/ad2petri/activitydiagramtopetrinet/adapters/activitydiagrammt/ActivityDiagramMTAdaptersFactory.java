package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt;

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
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ExecutableNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Expression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.FinalNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.NamedElement;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.Variable;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ValueAdapter;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.VariableAdapter;

@SuppressWarnings("all")
public class ActivityDiagramMTAdaptersFactory implements AdaptersFactory {
  private static ActivityDiagramMTAdaptersFactory instance;
  
  public static ActivityDiagramMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ActivityDiagramMTAdaptersFactory() {
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
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanValue){
    	return createBooleanValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue){
    	return createIntegerValueAdapter((org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue) o, res);
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
    
    return null;
  }
  
  public ActivityAdapter createActivityAdapter(final Activity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    }
  }
  
  public ActivityNodeAdapter createActivityNodeAdapter(final ActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    }
  }
  
  public ActivityEdgeAdapter createActivityEdgeAdapter(final ActivityEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    }
  }
  
  public ControlFlowAdapter createControlFlowAdapter(final ControlFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    }
  }
  
  public ControlNodeAdapter createControlNodeAdapter(final ControlNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    }
  }
  
  public ExecutableNodeAdapter createExecutableNodeAdapter(final ExecutableNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActionAdapter) adapter;
    }
  }
  
  public OpaqueActionAdapter createOpaqueActionAdapter(final OpaqueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    }
  }
  
  public InitialNodeAdapter createInitialNodeAdapter(final InitialNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    }
  }
  
  public FinalNodeAdapter createFinalNodeAdapter(final FinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    }
  }
  
  public ActivityFinalNodeAdapter createActivityFinalNodeAdapter(final ActivityFinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    }
  }
  
  public ForkNodeAdapter createForkNodeAdapter(final ForkNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    }
  }
  
  public JoinNodeAdapter createJoinNodeAdapter(final JoinNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    }
  }
  
  public MergeNodeAdapter createMergeNodeAdapter(final MergeNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    }
  }
  
  public DecisionNodeAdapter createDecisionNodeAdapter(final DecisionNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.VariableAdapter) adapter;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IntegerCalculationExpressionAdapter createIntegerCalculationExpressionAdapter(final IntegerCalculationExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    }
  }
  
  public IntegerComparisonExpressionAdapter createIntegerComparisonExpressionAdapter(final IntegerComparisonExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    }
  }
  
  public BooleanUnaryExpressionAdapter createBooleanUnaryExpressionAdapter(final BooleanUnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    }
  }
  
  public BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    }
  }
}
