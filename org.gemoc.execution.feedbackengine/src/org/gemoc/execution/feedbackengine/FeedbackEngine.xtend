package org.gemoc.execution.feedbackengine

import fr.inria.diverse.trace.commons.model.trace.Step
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine
import org.gemoc.xdsmlframework.api.core.IExecutionContext

class FeedbackEngine extends AbstractSequentialExecutionEngine {

	var FeedbackInterpreter backInterpreter

	public def void callbackStartStep(Step<?> step) {
		this.beforeExecutionStep(step);
	}

	public def void callbackEndStep() {
		this.afterExecutionStep
	}

	public def void setInterpreter(FeedbackInterpreter backInterpreter) {
		this.backInterpreter = backInterpreter
	}

	override protected executeEntryPoint() {
		backInterpreter.start
	}

	/**
	 * WARNING: with the GEMOC loading process, we could either obtain a static or dynamic model (ie. with or without melange)
	 * We would actually need both: the static to compile, and the dynamic to mirror back.
	 * BUT it means we would need the traceability links to point to the dynamic model, which melange should manage I think?
	 * 
	 */
	override protected prepareEntryPoint(IExecutionContext executionContext) {
		// TODO UI to declaire/choose compiler and back-interpreter
		// TODO code to instantiate chosen back interpreter and run it
		// Should result in something like: 
		// backInterpreter = new org.gemoc.activitydiagram.sequential.ad2petri.compiler.semantics.Ad2PetriTranslationalInterpreter
		//backInterpreter.initialize(executionContext.resourceModel, this)
	}

	override engineKindName() {
		"TranslationalEngine"
	}

	override protected initializeModel() {
	}

	override protected prepareInitializeModel(IExecutionContext executionContext) {
	}

}
