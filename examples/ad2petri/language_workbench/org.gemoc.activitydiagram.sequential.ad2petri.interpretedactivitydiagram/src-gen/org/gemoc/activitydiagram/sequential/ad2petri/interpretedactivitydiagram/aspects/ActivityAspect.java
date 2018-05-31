package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode;
import com.google.common.collect.Iterables;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect {
  @InitializeModel
  public static void initialize(final Activity _self, final List<String> args) {
    final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self,args);;
  }
  
  @Main
  public static void main(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  public static void execute(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Activity", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static ActivityNode findReadyNode(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findReadyNode(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode) result;
}
  
  protected static void _privk3_initialize(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final List<String> args) {
    final InitialNode initialNode = IterableExtensions.<InitialNode>head(Iterables.<InitialNode>filter(_self.getNodes(), InitialNode.class));
    final ControlToken initialToken = ActivitydiagramFactory.eINSTANCE.createControlToken();
    ActivityNodeAspect.heldTokens(initialNode).add(initialToken);
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.execute(_self);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityNode node = ActivityAspect.findReadyNode(_self);
    while ((node != null)) {
      {
        ActivityNodeAspect.execute(node);
        node = ActivityAspect.findReadyNode(_self);
      }
    }
  }
  
  protected static ActivityNode _privk3_findReadyNode(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    final Function1<ActivityNode, Boolean> _function = (ActivityNode it) -> {
      return Boolean.valueOf(ActivityNodeAspect.isReady(it));
    };
    return IterableExtensions.<ActivityNode>findFirst(_self.getNodes(), _function);
  }
}
