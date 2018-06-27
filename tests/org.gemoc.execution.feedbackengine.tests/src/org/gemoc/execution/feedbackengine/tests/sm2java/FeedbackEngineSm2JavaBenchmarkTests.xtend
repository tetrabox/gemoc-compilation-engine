package org.gemoc.execution.feedbackengine.tests.sm2java

import java.io.BufferedReader
import java.io.File
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.List
import java.util.stream.Collectors
import org.eclipse.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.IEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.IExecutableModel
import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.eclipse.gemoc.executionframework.test.lib.impl.TestUtil
import org.gemoc.execution.feedbackengine.tests.languages.CompiledStateMachines
import org.gemoc.execution.feedbackengine.tests.languages.InterpretedStateMachines
import org.gemoc.execution.feedbackengine.tests.util.CSVLine
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.junit.AfterClass
import org.junit.BeforeClass

import static org.gemoc.execution.feedbackengine.tests.Util.*

class FeedbackEngineSm2JavaBenchmarkTests extends AbstractSm2JavaFeedbackEngineRandomModelsTestSuite {

	// Common to all tests
	static var File outputFolder
	static var File outputCSV
	static var PrintWriter outputCSVWriter
	static var FileOutputStream outputCSVStream

	@BeforeClass
	def static void before() {
		// Create output folder in test project
		val Calendar currentDate = Calendar::getInstance();
		val SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY_HH-mm-ss");
		val String dateNow = formatter.format(currentDate.getTime());
		outputFolder = new File("output_time" + "_" + dateNow)
		if (!outputFolder.exists)
			outputFolder.mkdir

		// Prepare CSV file in output folder
		outputCSV = new File(outputFolder, "results.csv")
		outputCSVStream = new FileOutputStream(outputCSV)
		outputCSVWriter = new PrintWriter(outputCSVStream, true)
		outputCSVWriter.println(CSVLine::columnNames)
	}

	@AfterClass
	def static void after() {
		outputCSVStream.close
		outputCSVWriter.close
	}

	new(int size, String model, int scenarioID) {
		super(size, model, scenarioID)
	}

	static def List<Long> runBench(IEngineWrapper engine, ILanguageWrapper language, IExecutableModel model) {
		val out = new ArrayList<Long>
		for (x : 1 .. 25) {
			out.add(TestHelper::testWithoutExtraAddons(engine, language, model, true).executionDuration)
			cleanup()
		}
		return out.subList(out.size - 11, out.size)

	}

	def long testGeneric(String name, IEngineWrapper engine, ILanguageWrapper language, String plugin, String folder,
		String model, int scenarioID) {

		// Copy model to execute in WS
		val path = model.replace(".xmi", "_scenarios.txt")
		val scenarioStream = TestUtil::openFileFromPlugin(plugin, folder + "/" + path)

		val List<String> allScenarios = new BufferedReader(new InputStreamReader(scenarioStream)).lines().collect(
			Collectors.toList());
		scenarioStream.close
		val String scenario = allScenarios.get(scenarioID).replaceAll(",", "\n")

		val numbers = runBench(engine, language, new TestModel(plugin, folder, model, scenario, null))

		println('''«name» - «model» - scenario «scenarioID» :''')
		println("- numbers: " + numbers)
		// println("- mean: " + mean(numbers))
		println("- median: " + median(numbers))

		return median(numbers)
	}

	def long testCompiled(String plugin, String folder, String model, int scenarioID) {
		val compiledEngine = new FeedbackEngineWrapper()
		return testGeneric("compiled", compiledEngine, new CompiledStateMachines, plugin, folder, model, scenarioID)
	}

	def long testInterpreted(String plugin, String folder, String model) {
		val interpretedEngine = new JavaEngineWrapper()
		return testGeneric("interpreted", interpretedEngine, new InterpretedStateMachines, plugin, folder, model, scenarioID)
	}
	def long testNoFeedback(String plugin, String folder, String model, int scenarioID) {
		val noFeedback = new FeedbackEngineWrapper(true)
		return testGeneric("noFeedback", noFeedback, new CompiledStateMachines, plugin, folder, model, scenarioID)
	}

	override genericInternalTest(String plugin, String folder, String model, int scenarioID) {
		val line = new CSVLine

		line.modelName = model
		line.modelSize = sizeNumber
		line.scenarioID = scenarioID

		line.timeCompiledNoFeedback = testNoFeedback(plugin, folder, model, scenarioID)
		line.timeInterpreted = testInterpreted(plugin, folder, model)
		line.timeCompiled = testCompiled(plugin, folder, model, scenarioID)

		outputCSVWriter.println(line.customToString)

	}

//	@AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
