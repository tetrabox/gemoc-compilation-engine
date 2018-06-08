package org.tetrabox.examples.statemachines.compiler.modeltransformation

import gemoctraceability.GemoctraceabilityFactory
import gemoctraceability.Link
import gemoctraceability.TraceabilityModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.tetrabox.examples.statemachines.compiler.Util
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import statemachines.almostuml.State
import statemachines.almostuml.Transition

class TransitionTransformer {

	private var TraceabilityModel mapping
	private extension var Util util
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	private extension var StateTransformer stateTransformer

	new(TraceabilityModel model) {
		mapping = model
		util = new Util(mapping)
	}

	def Link transform(Transition transition) {

		var result = getExistingLink(transition)
		if (!result.present) {
			// Create trace
			val newLink = GemoctraceabilityFactory::eINSTANCE.createLink
			newLink.sourceElements.add(createAnnotatedElement(newLink, transition))
			mapping.links.add(newLink)

			// Output: returned state in event handler
			val expr = MiniJavaFactory::eINSTANCE.createNewObject
			newLink.targetElements.add(createAnnotatedElement(newLink, expr))

			// Transform target state and connect
			val targetStateLink = transform(transition.target as State)
			val targetStateClass = targetStateLink.targetElements.map[element].filter(Class).head
			expr.type = targetStateClass

			// Return
			return newLink
		} else
			return result.get

	}

}
