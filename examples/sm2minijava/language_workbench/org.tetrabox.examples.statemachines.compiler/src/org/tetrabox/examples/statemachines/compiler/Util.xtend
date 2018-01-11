package org.tetrabox.examples.statemachines.compiler

import gemoctraceability.AnnotatedElement
import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.IfStatement
import statemachines.CustomEvent
import statemachines.CustomSystem
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.ecore.EClass

class Util {

	TraceabilityModel mapping

	public new(TraceabilityModel mapping) {
		this.mapping = mapping

	}

	public def Link getExistingLink(EObject o) {
		mapping.links.findFirst[it.sourceElements.map[element].contains(o)]
	}

	public def Set<EObject> findTargetElementsOfType(EClass c) {
		mapping.links.map[targetElements].flatten.map[element].filter[it.eClass === c].toSet
	}

	public def StateMachine getStateMachine(EObject o) {
		return (EcoreUtil::getRootContainer(o) as CustomSystem).statemachine
	}

	public def AnnotatedElement createAnnotatedElement(Link l, EObject o) {
		return createAnnotatedElement(l, o, "")
	}

	public def AnnotatedElement createAnnotatedElement(Link l, EObject o, String s) {
		val annotatedElement = GemoctraceabilityFactory::eINSTANCE.createAnnotatedElement
		annotatedElement.element = o
		annotatedElement.annotation = s
		annotatedElement.link = l
		return annotatedElement
	}

	public def Set<CustomEvent> getEvents(EObject o) {
		return (EcoreUtil::getRootContainer(o) as CustomSystem).events.toSet
	}

	public def Set<State> getStates(StateMachine stateMachine) {
		return stateMachine.region.head.subvertex.filter(State).toSet
	}

//	private def Method transformToMethod(CustomEvent e) {
//		MiniJavaFactory::eINSTANCE.createMethod => [
//			name = e.name;
//			access = AccessLevel::PRIVATE;
//			typeRef = MiniJavaFactory::eINSTANCE.createClassRef => [referencedClass = stateInterface]
//		]
//	}
	public def Block endOfConditionnalElseChain(Block conditionnal) {
		if (!conditionnal.statements.empty) {
			val nextStatement = conditionnal.statements.head
			if (nextStatement instanceof IfStatement) {
				return nextStatement.elseBlock.endOfConditionnalElseChain
			} else {
				return null
			}
		} else {
			return conditionnal
		}
	}

}
