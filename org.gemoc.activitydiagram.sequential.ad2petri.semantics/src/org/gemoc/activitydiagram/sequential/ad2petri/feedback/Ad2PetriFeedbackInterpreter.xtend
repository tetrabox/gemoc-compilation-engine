package org.gemoc.activitydiagram.sequential.ad2petri.feedback

import activitydiagram.Activity
import ad2petritraceability.Ad2petriTraceability
import fr.inria.diverse.sample.xpetrinetv1.petrinetv1.Net
import fr.inria.diverse.trace.commons.model.trace.Step
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.activitydiagram.sequential.ad2petri.Ad2Petri
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine
import org.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.gemoc.xdsmlframework.api.engine_addon.DefaultEngineAddon
import fr.inria.diverse.sample.xpetrinetv1.petrinetv1.Transition
import org.gemoc.execution.feedbackengine.FeedbackInterpreter
//import org.gemoc.execution.feedbackengine.FeedbackEngine

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
	//private var FeedbackEngine translationalEngine

	/**
	 * TODO maybe all the compilation job could be done by the engine? the interpreter could focus on translating back
	 * TODO maybe there could be 1 kind of translational engine per target engine? eg. JavaSlaveEngine (bad name)
	 */
	override initialize(Resource inputModel, IExecutionEngine translationalEngine) {
		
		// Compiling (generic)
		val activity = inputModel.contents.head as Activity
		val transf = new Ad2Petri(activity)
		transf.transformToNet
		this.mapping = transf.mapping

		// Saving the compilation result to temporary file (generic, except file extension)
		val exeFolder = translationalEngine.executionContext.workspace.executionPath
		val targetURI = URI::createPlatformResourceURI(exeFolder.toString + "/target.xmi", true)
		val rs = inputModel.resourceSet
		val targetResource = rs.createResource(targetURI)
		targetResource.contents.add(transf.output)
		targetResource.save(null)

		// Preparing target engine to run compiled model (specific to target language)
		targetEngine = new PlainK3ExecutionEngine()
		val IRunConfiguration runConf = new PetriRunConfiguration(targetURI, #{})
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
		// TODO dispose it later?
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
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineStopped(IExecutionEngine engine) {
		if (targetEngine.error != null)
			throw targetEngine.error

	}

//	override engineAboutToDispose(IExecutionEngine engine) {
//		targetEngine.dispose
//	}
//	override engineAboutToStart(IExecutionEngine engine) {
//	}
//
//	override engineAboutToStop(IExecutionEngine engine) {
//	}
//	override engineStarted(IExecutionEngine executionEngine) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
//
}
