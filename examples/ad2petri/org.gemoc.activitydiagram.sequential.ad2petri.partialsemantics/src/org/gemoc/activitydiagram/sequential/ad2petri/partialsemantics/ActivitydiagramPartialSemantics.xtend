package org.gemoc.activitydiagram.sequential.ad2petri.partialsemantics

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityFinalNode
import activitydiagram.ActivityNode
import activitydiagram.BooleanBinaryExpression
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanVariable
import activitydiagram.ControlFlow
import activitydiagram.DecisionNode
import activitydiagram.Expression
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerComparisonExpression
import activitydiagram.IntegerVariable
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.NamedElement
import activitydiagram.OpaqueAction
import activitydiagram.Value
import activitydiagram.Variable
import dynamic.activitydiagram.ForkedToken
import dynamic.activitydiagram.Input
import dynamic.activitydiagram.InputValue
import dynamic.activitydiagram.Offer
import dynamic.activitydiagram.Token
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import org.eclipse.emf.common.util.EList

class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	@Main
	def void main() {
	}

	@OverrideAspectMethod
	@Step
	def void execute() {
	}

}

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute() {
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends NamedElementAspect {

	@Containment
	public EList<Token> heldTokens

	@OverrideAspectMethod
	@Step
	def void execute() {
	}

	@Step
	def void terminate() {
	}

	@Step
	def void sendOffers(EList<Token> tokens) {
	}

	@Step
	def EList<Token> takeOfferdTokens() {
	}

	@Step
	def void addTokens(EList<Token> tokens) {
	}

	@Step
	def void removeToken(Token token) {
	}
}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {

	@Containment
	public EList<Offer> offers

}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {
}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	def void execute() {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}

}

@Aspect(className=Variable)
class VariableAspect {

	public Value currentValue

	@Step
	def void execute() {
	}

	@Step
	def void init() {
	}

}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends VariableAspect {

	@OverrideAspectMethod
	def void execute() {
	}

}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends VariableAspect {
	def void execute() {
	}

}

@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Offer)
class OfferAspect {

	public EList<Token> offeredTokens

}

@Aspect(className=ForkedToken)
class ForkedTokenAspect {

	public Token baseToken

	public int remainingOffersCount

}

@Aspect(className=Input)
class InputAspect {

	@Containment
	public EList<InputValue> inputValues

}

@Aspect(className=InputValue)
class InputValueAspect {

	public Variable variable

	@Containment
	public Value value

}
