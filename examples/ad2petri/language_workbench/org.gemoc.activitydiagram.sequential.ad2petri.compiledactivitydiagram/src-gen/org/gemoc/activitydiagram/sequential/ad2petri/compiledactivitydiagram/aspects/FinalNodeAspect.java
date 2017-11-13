package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties;

@Aspect(className = FinalNode.class)
@SuppressWarnings("all")
public class FinalNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final FinalNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext
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
		manager.executeStep(_self, command, "FinalNode", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  @OverrideAspectMethod
  @Step
  public static void take(final FinalNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_take(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FinalNode", "take");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final FinalNode _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final FinalNodeAspectFinalNodeAspectProperties _self_, final FinalNode _self) {
    FinalNodeAspect.take(_self);
  }
  
  private static void super_take(final FinalNode _self) {
    final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect._privk3_take(_self_, _self);
  }
  
  protected static void _privk3_take(final FinalNodeAspectFinalNodeAspectProperties _self_, final FinalNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      ActivityEdgeAspect.heldTokens(edge).remove(IterableExtensions.<Token>head(ActivityEdgeAspect.heldTokens(edge)));
    }
  }
}
