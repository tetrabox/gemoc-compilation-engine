package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlToken;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Token;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.InitializeModel;
import org.eclipse.gemoc.k3.al.annotationprocessor.Main;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect {
  @InitializeModel
  public static void initialize(final Activity _self, final List<String> args) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self,args);;
  }
  
  @Main
  public static void main(final Activity _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  public static void execute(final Activity _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Activity", "execute");
	} else {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  public static ActivityNode findReadyNode(final Activity _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findReadyNode(_self_, _self);
	;
	return (org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode) result;
}
  
  protected static void _privk3_initialize(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final List<String> args) {
    EList<ActivityNode> _nodes = _self.getNodes();
    Iterable<InitialNode> _filter = Iterables.<InitialNode>filter(_nodes, InitialNode.class);
    final InitialNode initialNode = IterableExtensions.<InitialNode>head(_filter);
    final ControlToken initialToken = ActivitydiagramFactory.eINSTANCE.createControlToken();
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(initialNode);
    _heldTokens.add(initialToken);
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.execute(_self);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityNode node = ActivityAspect.findReadyNode(_self);
    while ((!Objects.equal(node, null))) {
      {
        ActivityNodeAspect.execute(node);
        ActivityNode _findReadyNode = ActivityAspect.findReadyNode(_self);
        node = _findReadyNode;
      }
    }
  }
  
  protected static ActivityNode _privk3_findReadyNode(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    EList<ActivityNode> _nodes = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function = (ActivityNode it) -> {
      return Boolean.valueOf(ActivityNodeAspect.isReady(it));
    };
    return IterableExtensions.<ActivityNode>findFirst(_nodes, _function);
  }
}
