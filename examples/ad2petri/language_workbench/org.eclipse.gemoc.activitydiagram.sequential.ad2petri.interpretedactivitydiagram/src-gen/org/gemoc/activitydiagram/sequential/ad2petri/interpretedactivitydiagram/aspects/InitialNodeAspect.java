package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Token;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final InitialNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
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
		manager.executeStep(_self, command, "InitialNode", "execute");
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
  
  @OverrideAspectMethod
  public static boolean isReady(final InitialNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isReady(_self_, _self);
	;
	return (boolean) result;
}
  
  private static void super_execute(final InitialNode _self) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    ActivityNodeAspect.offer(_self);
  }
  
  private static boolean super_isReady(final InitialNode _self) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.aspects.ActivityNodeAspect._privk3_isReady(_self_, _self);
  }
  
  protected static boolean _privk3_isReady(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    int _size = _heldTokens.size();
    return (_size > 0);
  }
}
