package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspect;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties;

@Aspect(className = FinalNode.class)
@SuppressWarnings("all")
public class FinalNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final FinalNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext
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
		manager.executeStep(_self, command, "FinalNode", "execute");
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
  @Step
  public static void take(final FinalNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext
			.getSelf(_self);
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_take(_self_, _self);
		}
	};
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FinalNode", "take");
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
  
  private static void super_execute(final FinalNode _self) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final FinalNodeAspectFinalNodeAspectProperties _self_, final FinalNode _self) {
    FinalNodeAspect.take(_self);
  }
  
  private static void super_take(final FinalNode _self) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_take(_self_, _self);
  }
  
  protected static void _privk3_take(final FinalNodeAspectFinalNodeAspectProperties _self_, final FinalNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      EList<Token> _heldTokens = ActivityEdgeAspect.heldTokens(edge);
      EList<Token> _heldTokens_1 = ActivityEdgeAspect.heldTokens(edge);
      Token _head = IterableExtensions.<Token>head(_heldTokens_1);
      _heldTokens.remove(_head);
    }
  }
}
