package org.gemoc.activitydiagram.sequential.ad2petri.interpreter

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityNode
import activitydiagram.FinalNode
import activitydiagram.InitialNode
import dynamic.activitydiagram.ActivitydiagramFactory
import dynamic.activitydiagram.Token
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import java.util.List
import org.eclipse.emf.common.util.EList

import static extension org.gemoc.activitydiagram.sequential.ad2petri.interpreter.ActivityEdgeAspect.*
import static extension org.gemoc.activitydiagram.sequential.ad2petri.interpreter.ActivityNodeAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=Activity)
class ActivityAspect {

	@InitializeModel def void initialize(List<String> args) {
		val initialNode = _self.nodes.filter(InitialNode).head
		val initialToken = ActivitydiagramFactory.eINSTANCE.createControlToken
		initialNode.heldTokens.add(initialToken)
	}

	@Main def void main() {
		_self.execute()
	}

	@Step def void execute() {
		var ActivityNode node = _self.findReadyNode()
		while (node !== null) {
			node.execute()
			node = _self.findReadyNode()
		}
	}

	def ActivityNode findReadyNode() {
		return _self.nodes.findFirst[isReady]
	}

}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect {

	@Containment public EList<Token> heldTokens

}

@Aspect(className=ActivityNode) class ActivityNodeAspect {

	@Containment public EList<Token> heldTokens

	@Step def void execute() {
		_self.take()
		_self.offer()
	}

	@Step def void offer() {
		_self.heldTokens.remove(_self.heldTokens.head)
		for (edge : _self.outgoing) {
			edge.heldTokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken)
		}
	}

	@Step def void take() {
		for (edge : _self.incoming) {
			edge.heldTokens.remove(edge.heldTokens.head)
		}
		_self.heldTokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken)
	}

	public def boolean isReady() {
		return _self.incoming.forall[heldTokens.size > 0]
	}

}

@Aspect(className=InitialNode) class InitialNodeAspect extends ActivityNodeAspect {

	@OverrideAspectMethod @Step def void execute() {
		_self.offer()
	}

	@OverrideAspectMethod def boolean isReady() {
		_self.heldTokens.size > 0
	}

}

@Aspect(className=FinalNode) class FinalNodeAspect extends ActivityNodeAspect {

	@OverrideAspectMethod @Step def void execute() {
		_self.take()
	}

	@OverrideAspectMethod @Step def void take() {
		for (edge : _self.incoming) {
			edge.heldTokens.remove(edge.heldTokens.head)
		}
	}

}
