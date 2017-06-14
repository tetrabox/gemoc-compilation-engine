package org.gemoc.activitydiagram.sequential.ad2petri.compiler

import activitydiagram.Action
import activitydiagram.Activity
import activitydiagram.ControlFlow
import activitydiagram.FinalNode
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.JoinNode
import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.emf.ecore.EObject
import org.gemoc.execution.feedbackengine.CompilationResult
import org.gemoc.execution.feedbackengine.Compiler
import petrinetv1.Net
import petrinetv1.PetrinetV1Factory
import petrinetv1.Place
import petrinetv1.Transition

/**
 * Input: subset of AD
 * - no variables
 * - no decision/merge nodes
 * --> need better petri nets (colored or high-level)
 * 
 * Output: basic petri nets, with one place per node (except final nodes)
 */
class Ad2PetriCompiler implements Compiler {

	private var Activity input
	private var TraceabilityModel mapping
	private var Net output

	private def void transformToNet() {
		transform(input)
		output = mapping.links.findFirst[it.sourceElements.contains(input)].targetElements.head as Net
	}

	private def dispatch Link transform(Activity activity) {
		var result = getExistingLink(activity)
		if (result == null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(activity)
			mapping.links.add(result)

			// Create net
			val net = PetrinetV1Factory::eINSTANCE.createNet
			result.targetElements.add(net)

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

	private def dispatch Link transform(Action action) {
		var result = getExistingLink(action)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(action)
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(action)

			// Create place
			val place = PetrinetV1Factory::eINSTANCE.createPlace
			result.targetElements.add(place)
			place.name = action.name + "_action"
			net.places.add(place)

		}
		return result
	}

	private def dispatch Link transform(InitialNode initialNode) {
		var result = getExistingLink(initialNode)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(initialNode)
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(initialNode)

			// Create initial place
			val place = PetrinetV1Factory::eINSTANCE.createPlace
			result.targetElements.add(place)
			place.initialTokens = 1
			place.name = initialNode.name + "_initial"
			net.places.add(place)
		}
		return result
	}

	private def dispatch Link transform(FinalNode finalNode) {
		var result = getExistingLink(finalNode)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(finalNode)
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(finalNode)

			// Create final transition
			val transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.targetElements.add(transition)
			transition.name = finalNode.name + "_final"
			net.transitions.add(transition)
		}
		return result
	}

	/**
	 * Two cases: before final node, or not
	 */
	private def dispatch Link transform(ControlFlow controlFlow) {

		var result = getExistingLink(controlFlow)
		if (result == null) {

			val source = transform(controlFlow.source)
			val target = transform(controlFlow.target)

			// Finding all connection cases
			val sourcePlace = if (source.sourceElements.exists [
					it instanceof InitialNode || it instanceof Action || it instanceof JoinNode
				])
					source.targetElements.filter(Place).head

			val targetPlace = if (target.sourceElements.exists [
					it instanceof InitialNode || it instanceof Action || it instanceof ForkNode
				])
					target.targetElements.filter(Place).head

			val sourceTransition = if (source.sourceElements.exists[it instanceof ForkNode])
					source.targetElements.filter(Transition).head

			val targetTransition = if (target.sourceElements.exists[it instanceof JoinNode || it instanceof FinalNode])
					target.targetElements.filter(Transition).head

			// Case edge -> transition
			if (sourcePlace != null && targetPlace != null) {
				// Get containing net
				val net = getContainingNet(controlFlow)

				// Create trace
				result = GemoctraceabilityFactory::eINSTANCE.createLink
				result.sourceElements.add(controlFlow)
				mapping.links.add(result)

				// Create transition
				val transition = PetrinetV1Factory::eINSTANCE.createTransition
				result.targetElements.add(transition)
				net.transitions.add(transition)
				transition.name = controlFlow.name + "_controlflow"
				transition.input.add(sourcePlace)
				transition.output.add(targetPlace)
			} // Cases edge -> simple link
			else if (sourcePlace != null && targetTransition != null) {
				targetTransition.input.add(sourcePlace)
			} else if (sourceTransition != null && targetPlace != null) {
				sourceTransition.output.add(targetPlace)
			}

		}
		return result
	}

	private def dispatch Link transform(JoinNode joinNode) {
		var result = getExistingLink(joinNode)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(joinNode)
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(joinNode)

			// Create place
			val place = PetrinetV1Factory::eINSTANCE.createPlace
			result.targetElements.add(place)
			place.name = joinNode.name + "_joinNode"
			net.places.add(place)

			// Create transition
			val transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.targetElements.add(transition)
			transition.name = joinNode.name + "_joinNode"
			net.transitions.add(transition)
			transition.output.add(place)

		}
		return result
	}

	private def dispatch Link transform(ForkNode forkNode) {
		var result = getExistingLink(forkNode)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(forkNode)
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(forkNode)

			// Create place
			val place = PetrinetV1Factory::eINSTANCE.createPlace
			result.targetElements.add(place)
			place.name = forkNode.name + "_forkNode"
			net.places.add(place)

			// Create transition
			val transition = PetrinetV1Factory::eINSTANCE.createTransition
			result.targetElements.add(transition)
			transition.name = forkNode.name + "_forkNode"
			net.transitions.add(transition)
			transition.input.add(place)
		}
		return result
	}

	private def dispatch Link transform(EObject o) {
		throw new Exception("Unsupported kind of object: " + o)
	}

	override compile(EObject sourceModelRoot) {
		mapping = GemoctraceabilityFactory::eINSTANCE.createTraceabilityModel
		input = sourceModelRoot as Activity
		transformToNet()
		return new CompilationResult(mapping, output)
	}

	override getTargetFileExtension() {
		"xmi"
	}

	private def Net getContainingNet(EObject o) {
		(transform(o.eContainer) as Link).targetElements.head as Net
	}

	private def Link getExistingLink(EObject o) {
		mapping.links.findFirst[it.sourceElements.contains(o)]
	}

}
