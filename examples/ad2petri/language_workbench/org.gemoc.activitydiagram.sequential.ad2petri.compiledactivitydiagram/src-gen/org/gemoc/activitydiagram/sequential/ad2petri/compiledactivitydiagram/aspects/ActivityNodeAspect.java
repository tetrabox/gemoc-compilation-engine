package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect {
  @Step
  public static void execute(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.execute(
				(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.execute(
				(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspect.execute(
				(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_execute(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
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
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_offer(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ActivityNode", "offer");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void take(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.take(
				(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.FinalNodeAspect.take(
				(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
						._privk3_take(_self_,
								(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "take");
		} else {
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
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.JoinNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.OpaqueAction) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ForkNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.DecisionNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.InitialNodeAspect
				.isReady(
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.MergeNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ControlNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.Action) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ExecutableNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) {
		result = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspect
				._privk3_isReady(_self_,
						(org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivityNode) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  @Containment
  public static EList<Token> heldTokens(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_heldTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void heldTokens(final ActivityNode _self, final EList<Token> heldTokens) {
    final org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);;
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    ActivityNodeAspect.take(_self);
    ActivityNodeAspect.offer(_self);
  }
  
  protected static void _privk3_offer(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    ActivityNodeAspect.heldTokens(_self).remove(IterableExtensions.<Token>head(ActivityNodeAspect.heldTokens(_self)));
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      ActivityEdgeAspect.heldTokens(edge).add(ActivitydiagramFactory.eINSTANCE.createControlToken());
    }
  }
  
  protected static void _privk3_take(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      ActivityEdgeAspect.heldTokens(edge).remove(IterableExtensions.<Token>head(ActivityEdgeAspect.heldTokens(edge)));
    }
    ActivityNodeAspect.heldTokens(_self).add(ActivitydiagramFactory.eINSTANCE.createControlToken());
  }
  
  protected static boolean _privk3_isReady(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge it) -> {
      int _size = ActivityEdgeAspect.heldTokens(it).size();
      return Boolean.valueOf((_size > 0));
    };
    return IterableExtensions.<ActivityEdge>forall(_self.getIncoming(), _function);
  }
  
  protected static EList<Token> _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> heldTokens) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.heldTokens = heldTokens;
    }
  }
}
