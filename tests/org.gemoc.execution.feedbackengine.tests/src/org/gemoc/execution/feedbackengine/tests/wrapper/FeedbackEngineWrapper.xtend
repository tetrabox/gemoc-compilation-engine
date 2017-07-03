package org.gemoc.execution.feedbackengine.tests.wrapper

import java.util.Set
import org.eclipse.emf.common.util.URI
import org.gemoc.execution.feedbackengine.FeedbackEngine
import org.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.gemoc.executionframework.test.lib.IEngineWrapper
import org.gemoc.executionframework.test.lib.IExecutableModel
import org.gemoc.executionframework.test.lib.ILanguageWrapper
import org.gemoc.executionframework.test.lib.impl.TestRunConfiguration
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.gemoc.xdsmlframework.api.core.IExecutionContext
import org.gemoc.xdsmlframework.api.core.IRunConfiguration

class FeedbackEngineWrapper implements IEngineWrapper  {
	
	
	private var FeedbackEngine engine
	
	boolean disableFeedback = false
	
	new () {
		
	}
	
	new (boolean disableFeedback) {
		this.disableFeedback = disableFeedback
	}
	
	override prepare(ILanguageWrapper wrapper, IExecutableModel model, Set<String> addons, URI uri) {
		engine = new FeedbackEngine
		
		if (disableFeedback)
			engine.disableFeedback
		val IRunConfiguration runConf = new TestRunConfiguration(model, uri,wrapper,addons)
		val IExecutionContext exeContext = new SequentialModelExecutionContext(runConf, ExecutionMode::Run);
		exeContext.initializeResourceModel();
		engine.initialize(exeContext)
		engine.stopOnAddonError = true;
	}
	
	override run() {
		engine.start();
		engine.joinThread();
		if (engine.error != null)
			throw engine.error
	}
	
	override getRealEngine() {
		return engine
	}
	


	
}