package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlToken;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspect;
import org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect {
  @Step
  public static void execute(final ActivityNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspect.execute(
				(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.execute(
				(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.execute(
				(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Step
  public static void offer(final ActivityNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_offer(_self_, _self);
		}
	};
	org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ActivityNode", "offer");
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
  
  @Step
  public static void take(final ActivityNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.take(
				(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.take(
				(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
			}
		};
		org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static boolean isReady(final ActivityNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspect
				.isReady(
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
	} else if (_self instanceof org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		result = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  @Containment
  public static EList<Token> heldTokens(final ActivityNode _self) {
	final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_heldTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void heldTokens(final ActivityNode _self, final EList<Token> heldTokens) {
    final org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);;
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    ActivityNodeAspect.take(_self);
    ActivityNodeAspect.offer(_self);
  }
  
  protected static void _privk3_offer(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    EList<Token> _heldTokens_1 = ActivityNodeAspect.heldTokens(_self);
    Token _head = IterableExtensions.<Token>head(_heldTokens_1);
    _heldTokens.remove(_head);
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      EList<Token> _heldTokens_2 = ActivityEdgeAspect.heldTokens(edge);
      ControlToken _createControlToken = ActivitydiagramFactory.eINSTANCE.createControlToken();
      _heldTokens_2.add(_createControlToken);
    }
  }
  
  protected static void _privk3_take(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      EList<Token> _heldTokens = ActivityEdgeAspect.heldTokens(edge);
      EList<Token> _heldTokens_1 = ActivityEdgeAspect.heldTokens(edge);
      Token _head = IterableExtensions.<Token>head(_heldTokens_1);
      _heldTokens.remove(_head);
    }
    EList<Token> _heldTokens_2 = ActivityNodeAspect.heldTokens(_self);
    ControlToken _createControlToken = ActivitydiagramFactory.eINSTANCE.createControlToken();
    _heldTokens_2.add(_createControlToken);
  }
  
  protected static boolean _privk3_isReady(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge it) -> {
      EList<Token> _heldTokens = ActivityEdgeAspect.heldTokens(it);
      int _size = _heldTokens.size();
      return Boolean.valueOf((_size > 0));
    };
    return IterableExtensions.<ActivityEdge>forall(_incoming, _function);
  }
  
  protected static EList<Token> _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> heldTokens) {
    _self_.heldTokens = heldTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
