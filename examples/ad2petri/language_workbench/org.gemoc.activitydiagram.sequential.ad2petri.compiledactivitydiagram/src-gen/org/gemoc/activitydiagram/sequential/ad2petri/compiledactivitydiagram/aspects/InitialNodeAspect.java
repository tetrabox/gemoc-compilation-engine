package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final InitialNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
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
		manager.executeStep(_self, command, "InitialNode", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  @OverrideAspectMethod
  public static boolean isReady(final InitialNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isReady(_self_, _self);
	;
	return (boolean) result;
}
  
  private static void super_execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    ActivityNodeAspect.offer(_self);
  }
  
  private static boolean super_isReady(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_isReady(_self_, _self);
  }
  
  protected static boolean _privk3_isReady(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    int _size = ActivityNodeAspect.heldTokens(_self).size();
    return (_size > 0);
  }
}
