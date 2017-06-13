package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import ad2petritraceability.Ad2petriTraceability
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition
import fr.inria.diverse.trace.commons.model.trace.Step
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.feedbackengine.FeedbackInterpreter
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine
import org.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.gemoc.xdsmlframework.api.engine_addon.DefaultEngineAddon

class Ad2PetriFeedbackInterpreter extends DefaultEngineAddon implements FeedbackInterpreter {

	/**
	 * Mapping between source and target models.
	 */
	private var Ad2petriTraceability mapping

	/**
	 * This is where steps come from.
	 */
	private var PlainK3ExecutionEngine targetEngine

	/**
	 * This is where we send our translated steps.
	 */
	private var FeedbackEngine feedbackEngine

	/**
	 * TODO maybe there could be 1 kind of translational engine per target engine? eg. JavaSlaveEngine (bad name)
	 */
	override initialize(Resource inputModel, URI targetModelURI, EObject traceability, FeedbackEngine feedbackEngine) {

		this.mapping = traceability as Ad2petriTraceability
		this.feedbackEngine = feedbackEngine

		// Preparing target engine to run compiled model
		targetEngine = new PlainK3ExecutionEngine()
		val IRunConfiguration runConf = new PetriRunConfiguration(targetModelURI, #{})
		val SequentialModelExecutionContext exeContext = new SequentialModelExecutionContext(runConf,
			ExecutionMode::Run);
		exeContext.initializeResourceModel();
		targetEngine.initialize(exeContext);
		targetEngine.stopOnAddonError = true;

		// Add itself as addon
		exeContext.executionPlatform.addEngineAddon(this)

	}

	override start() {
		// Start target engine
		targetEngine.start();
	}

	/**
	 * We get notified of target execution steps,
	 * and we translate them 
	 */
	override aboutToExecuteStep(IExecutionEngine engine, Step<?> stepToExecute) {
		// There are only two possible steps: run and fire
		if (stepToExecute.mseoccurrence.mse.action.name.endsWith("run")) {
			val Net runnedNet = stepToExecute.mseoccurrence.mse.caller as Net
			println("yay run: " + runnedNet)

		// TODO: translationalEngine.callbackStartStep(step)
		}
		if (stepToExecute.mseoccurrence.mse.action.name.endsWith("fire")) {
			val Transition firedTransition = stepToExecute.mseoccurrence.mse.caller as Transition
			println("yay fire: " + firedTransition)

		// TODO: translationalEngine.callbackEndStep()
		}
	}

	override stepExecuted(IExecutionEngine engine, Step<?> stepExecuted) {
		// TODO
	}

	override engineStopped(IExecutionEngine engine) {
		
		// We re-throw any error occurring in the target engine
		if (targetEngine.error != null)
			throw targetEngine.error

	}

	override engineAboutToStop(IExecutionEngine engine) {
		// We don't need the target engine anymore as soon as the execution is over
		targetEngine.dispose
	}
	
}
