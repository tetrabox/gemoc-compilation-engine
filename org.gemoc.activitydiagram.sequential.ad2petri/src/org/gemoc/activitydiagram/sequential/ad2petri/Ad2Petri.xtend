package org.gemoc.activitydiagram.sequential.ad2petri

import activitydiagram.Action
import activitydiagram.Activity
import activitydiagram.ControlFlow
import activitydiagram.FinalNode
import activitydiagram.InitialNode
import ad2petritraceability.ActivityTrace
import ad2petritraceability.Ad2petriTraceability
import ad2petritraceability.Ad2petritraceabilityFactory
import ad2petritraceability.ControlFlowTrace
import ad2petritraceability.FinalNodeTrace
import ad2petritraceability.ForkNodeTrace
import ad2petritraceability.NodeToPlaceTrace
import ad2petritraceability.Trace
import org.eclipse.emf.ecore.EObject
import petrinetv1.PetrinetV1Factory
import activitydiagram.JoinNode
import ad2petritraceability.JoinNodeTrace
import activitydiagram.ForkNode
import org.eclipse.xtend.lib.annotations.Accessors
import petrinetv1.Net

/**
 * Input: subset of AD
 * - no variables
 * - no decision/merge nodes
 * --> need better petri nets (colored or high-level)
 * 
 * Output: basic petri nets, with one place per node (except final nodes)
 */
class Ad2Petri {

	private val Activity input

	@Accessors(PROTECTED_SETTER,PUBLIC_GETTER)
	val Ad2petriTraceability mapping = Ad2petritraceabilityFactory::eINSTANCE.createAd2petriTraceability

	@Accessors(PROTECTED_SETTER,PUBLIC_GETTER)
	var Net output

	new(Activity input) {
		this.input = input
	}

	public def void transformToNet() {
		transform(input)
		output = mapping.activityTraces.findFirst[t|t.originalActivity == input].net
	}

	private def dispatch ActivityTrace transform(Activity activity) {
		var result = mapping.activityTraces.findFirst[t|t.originalActivity == activity]
		if (result == null) {

			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createActivityTrace
			result.originalActivity = activity
			mapping.activityTraces.add(result)

			// Create net
			result.net = PetrinetV1Factory::eINSTANCE.createNet

			// Transform all referenced stuff
			for (node : activity.nodes) {
				transform(node)
			}
			for (edge : activity.edges) {
				transform(edge)
			}

		}
		return result
	}

	private def dispatch NodeToPlaceTrace transform(Action action) {
		var result = mapping.nonFinalNodeTraces.findFirst[t|t.originalNode == action]
		if (result == null) {
			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createNodeToPlaceTrace
			result.originalNode = action
			mapping.nonFinalNodeTraces.add(result)

			// Get containing net
			val net = (transform(action.eContainer) as ActivityTrace).net

			// Create place
			result.place = PetrinetV1Factory::eINSTANCE.createPlace
			result.place.name = action.name + "_action"
			net.places.add(result.place)

		}
		return result
	}

	private def dispatch NodeToPlaceTrace transform(InitialNode initialNode) {
		var result = mapping.nonFinalNodeTraces.findFirst[t|t.originalNode == initialNode]
		if (result == null) {
			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createNodeToPlaceTrace
			result.originalNode = initialNode
			mapping.nonFinalNodeTraces.add(result)

			// Get containing net
			val net = (transform(initialNode.eContainer) as ActivityTrace).net

			// Create initial place
			result.place = PetrinetV1Factory::eINSTANCE.createPlace
			result.place.initialTokens = 1
			result.place.name = initialNode.name + "_initial"
			net.places.add(result.place)
		}
		return result
	}

	private def dispatch FinalNodeTrace transform(FinalNode finalNode) {
		var result = mapping.finalNodeTraces.findFirst[t|t.originalNode == finalNode]
		if (result == null) {
			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createFinalNodeTrace
			result.originalNode = finalNode
			mapping.finalNodeTraces.add(result)

			// Get containing net
			val net = (transform(finalNode.eContainer) as ActivityTrace).net

			// Create final transition
			result.transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.transition.name = finalNode.name + "_final"
			net.transitions.add(result.transition)
		}
		return result
	}

	/**
	 * Two cases: before final node, or not
	 */
	private def dispatch ControlFlowTrace transform(ControlFlow controlFlow) {

		var result = mapping.controlFlowTraces.findFirst[t|t.originalControlFlow == controlFlow]
		if (result == null) {

			val source = transform(controlFlow.source)
			val target = transform(controlFlow.target)

			// Finding all connection cases
			val sourcePlace = if (source instanceof NodeToPlaceTrace)
					source.place
				else if(source instanceof JoinNodeTrace) source.place else null
			val targetPlace = if (target instanceof NodeToPlaceTrace)
					target.place
				else if(target instanceof ForkNodeTrace) target.place else null
			val sourceTransition = if(source instanceof ForkNodeTrace) source.transition else null
			val targetTransition = if (target instanceof JoinNodeTrace)
					target.transition
				else if(target instanceof FinalNodeTrace) target.transition

			// Case edge -> transition
			if (sourcePlace != null && targetPlace != null) {
				// Get containing net
				val net = (transform(controlFlow.eContainer) as ActivityTrace).net

				// Create trace
				result = Ad2petritraceabilityFactory::eINSTANCE.createControlFlowTrace
				result.originalControlFlow = controlFlow
				mapping.controlFlowTraces.add(result)

				// Create transition
				result.transition = PetrinetV1Factory::eINSTANCE.createTransition
				mapping.controlFlowTraces.add(result)
				net.transitions.add(result.transition)
				result.transition.name = controlFlow.name + "_controlflow"
				result.transition.input.add(sourcePlace)
				result.transition.output.add(targetPlace)
			} // Cases edge -> simple link
			else if (sourcePlace != null && targetTransition != null) {
				targetTransition.input.add(sourcePlace)
			} else if (sourceTransition != null && targetPlace != null) {
				sourceTransition.output.add(targetPlace)
			}

		}
		return result
	}

	private def dispatch JoinNodeTrace transform(JoinNode joinNode) {
		var result = mapping.joinNodeTraces.findFirst[t|t.originalNode == joinNode]
		if (result == null) {
			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createJoinNodeTrace
			result.originalNode = joinNode
			mapping.joinNodeTraces.add(result)

			// Get containing net
			val net = (transform(joinNode.eContainer) as ActivityTrace).net

			// Create place
			result.place = PetrinetV1Factory::eINSTANCE.createPlace
			result.place.name = joinNode.name + "_joinNode"
			net.places.add(result.place)

			// Create transition
			result.transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.transition.name = joinNode.name + "_joinNode"
			net.transitions.add(result.transition)
			result.transition.output.add(result.place)

		}
		return result
	}

	private def dispatch ForkNodeTrace transform(ForkNode forkNode) {
		var result = mapping.forkNodeTraces.findFirst[t|t.originalNode == forkNode]
		if (result == null) {
			// Create trace
			result = Ad2petritraceabilityFactory::eINSTANCE.createForkNodeTrace
			result.originalNode = forkNode
			mapping.forkNodeTraces.add(result)

			// Get containing net
			val net = (transform(forkNode.eContainer) as ActivityTrace).net

			// Create place
			result.place = PetrinetV1Factory::eINSTANCE.createPlace
			result.place.name = forkNode.name + "_forkNode"
			net.places.add(result.place)

			// Create transition
			result.transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.transition.name = forkNode.name + "_forkNode"
			net.transitions.add(result.transition)
			result.transition.input.add(result.place)
		}
		return result
	}

	private def dispatch Trace transform(EObject o) {
		throw new Exception("Unsupported kind of object: " + o)
	}

}
