package org.gemoc.activitydiagram.sequential.ad2petri.semantics

import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon
import org.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus
import java.util.List
import fr.inria.diverse.trace.commons.model.trace.Step
import java.util.Collection
import org.eclipse.emf.ecore.resource.Resource
import org.gemoc.activitydiagram.sequential.ad2petri.Ad2Petri
import activitydiagram.Activity
import ad2petritraceability.Ad2petriTraceability
import petrinetv1.Net
import org.eclipse.emf.common.util.URI
import org.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine

class Ad2PetriBackInterpreter implements IEngineAddon, BackInterpreter {

	private var Ad2petriTraceability mapping
	private var Net targetNet
	private var PlainK3ExecutionEngine targetEngine

	override initialize(Resource inputModel, IExecutionEngine engine) {

		// Compiling
		val activity = inputModel.contents.head as Activity
		val transf = new Ad2Petri(activity)
		transf.transformToNet
		this.mapping = transf.mapping
		this.targetNet = transf.output

		// Saving the compilation result to temporary file
		val exeFolder = engine.executionContext.workspace.executionPath
		val targetURI = URI::createPlatformResourceURI(exeFolder.toString + "/target.xmi", true)
		val rs = inputModel.resourceSet
		val targetResource = rs.createResource(targetURI)
		targetResource.contents.add(transf.output)
		targetResource.save(null)

		// Preparing target engine
		this.targetEngine = new PlainK3ExecutionEngine
		
	}

	override start() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineAboutToDispose(IExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineAboutToStart(IExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineAboutToStop(IExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineStarted(IExecutionEngine executionEngine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineStatusChanged(IExecutionEngine engine, RunStatus newStatus) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override engineStopped(IExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override validate(List<IEngineAddon> otherAddons) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override aboutToExecuteStep(IExecutionEngine engine, Step<?> stepToExecute) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override aboutToSelectStep(IExecutionEngine engine, Collection<Step<?>> steps) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override proposedStepsChanged(IExecutionEngine engine, Collection<Step<?>> steps) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override stepExecuted(IExecutionEngine engine, Step<?> stepExecuted) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override stepSelected(IExecutionEngine engine, Step<?> selectedStep) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
