package org.gemoc.activitydiagram.sequential.ad2petri.compiler

import activitydiagram.Activity
import activitydiagram.ActivityNode
import activitydiagram.ControlFlow
import activitydiagram.FinalNode
import activitydiagram.InitialNode
import gemoctraceability.AnnotatedElement
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
 * Output: basic petri nets, with one place per node (except final nodes) and per edge
 */
class Ad2PetriCompiler implements Compiler {

	private var Activity input
	private var TraceabilityModel mapping
	private var Net output

	private def void transformToNet() {
		transform(input)
		output = mapping.links.findFirst[it.sourceElements.map[element].contains(input)].targetElements.map[element].
			head as Net
	}

	private def dispatch Link transform(Activity activity) {
		var result = getExistingLink(activity)
		if (result == null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, activity))
			mapping.links.add(result)

			// Create net
			val net = PetrinetV1Factory::eINSTANCE.createNet
			result.targetElements.add(createAnnotatedElement(result, net))

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

	private def dispatch Link transform(ActivityNode node) {
		var result = getExistingLink(node)
		if (result == null) {
			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, node))
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(node)

			// Deeclaring potential target elements
			var Transition transition1 = null
			var Transition transition2 = null
			var Place place = null

			if (! (node instanceof FinalNode)) {
				// Create place
				place = PetrinetV1Factory::eINSTANCE.createPlace
				result.targetElements.add(createAnnotatedElement(result, place))
				place.name = node.name + "_node"
				net.places.add(place)

				// Create transition offer tokens
				transition2 = PetrinetV1Factory::eINSTANCE.createTransition
				result.targetElements.add(createAnnotatedElement(result, transition2, "offer"))
				transition2.name = node.name + "_offerTokens"
				net.transitions.add(transition2)
				transition2.input.add(place)
			}

			if (! (node instanceof InitialNode)) {
				// Create transition take tokens
				transition1 = PetrinetV1Factory::eINSTANCE.createTransition
				result.targetElements.add(createAnnotatedElement(result, transition1, "take"))
				transition1.name = node.name + "_takeOfferedTokens"
				net.transitions.add(transition1)
				if (place != null)
					transition1.output.add(place)
			} else {
				place.initialTokens = 1
			}

			// Create links
			for (incoming : node.incoming) {
				val Place incomingPlace = transform(incoming).targetElements.map[element].filter(Place).head
				transition1.input.add(incomingPlace)
			}
			for (outgoing : node.outgoing) {
				val Place outgoingPlace = transform(outgoing).targetElements.map[element].filter(Place).head
				transition2.output.add(outgoingPlace)
			}

		}
		return result
	}

	private def dispatch Link transform(ControlFlow controlFlow) {

		var result = getExistingLink(controlFlow)
		if (result == null) {

			// Create trace
			result = GemoctraceabilityFactory::eINSTANCE.createLink
			result.sourceElements.add(createAnnotatedElement(result, controlFlow))
			mapping.links.add(result)

			// Get containing net
			val net = getContainingNet(controlFlow)

			// Create place
			val place = PetrinetV1Factory::eINSTANCE.createPlace
			result.targetElements.add(createAnnotatedElement(result, place))
			place.name = controlFlow.name + "_controlflow"
			net.places.add(place)
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
		(transform(o.eContainer) as Link).targetElements.head.element as Net
	}

	private def Link getExistingLink(EObject o) {
		mapping.links.findFirst[it.sourceElements.map[element].contains(o)]
	}

	private def AnnotatedElement createAnnotatedElement(Link l, EObject o, String s) {
		val annotatedElement = GemoctraceabilityFactory::eINSTANCE.createAnnotatedElement
		annotatedElement.element = o
		annotatedElement.annotation = s
		annotatedElement.link = l
		return annotatedElement
	}

	private def AnnotatedElement createAnnotatedElement(Link l, EObject o) {
		return createAnnotatedElement(l, o, "")
	}

}
