package org.gemoc.execution.feedbackengine.tests

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.List
import org.eclipse.gemoc.execution.sequential.javaengine.tests.wrapper.JavaEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.IEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.IExecutableModel
import org.eclipse.gemoc.executionframework.test.lib.ILanguageWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.eclipse.xtend.lib.annotations.Data
import org.gemoc.execution.feedbackengine.tests.util.CSVLine
import org.gemoc.execution.feedbackengine.tests.wrapper.FeedbackEngineWrapper
import org.junit.AfterClass
import org.junit.BeforeClass

import static org.gemoc.execution.feedbackengine.tests.Util.*

abstract class AbstractFeedbackEngineBenchmarkTestSuite extends AbstractFeedbackEngineTestSuite {

	// Common to all tests
	static var File outputFolder
	static var File outputCSV
	static var PrintWriter outputCSVWriter
	static var FileOutputStream outputCSVStream

	abstract def String getSemanticsPlugin()

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

	@Data
	static class BenchResult1 {
		int amountSteps
		List<Long> executionTimes
	}

	@Data
	static class BenchResult2 {
		int amountSteps
		Long executionTime
	}

	def BenchResult1 runBench(IEngineWrapper engine, ILanguageWrapper language, IExecutableModel model) {
		val executionTimes = new ArrayList<Long>
		var boolean haveAmounts = false
		var int amountSteps
		for (x : 1 .. 25) {
			val testResult = TestHelper::testWithoutExtraAddons(engine, language, model, true)
			executionTimes.add(testResult.executionDuration)
			if (!haveAmounts) {
				amountSteps = testResult.amountOfStepsExecuted
				haveAmounts = true
			}
			cleanup(getSemanticsPlugin())
		}
		return new BenchResult1(amountSteps, executionTimes.subList(executionTimes.size - 11, executionTimes.size))

	}

	def BenchResult2 testGeneric(String name, IEngineWrapper engine, ILanguageWrapper language, String plugin,
		String folder, String model, int scenarioID) {

		val scenario = findScenario(model, plugin, folder, scenarioID)
		val initArgs = if (scenario.isPresent) scenario .get else ""
			val result1 = runBench(engine, language, new TestModel(plugin, folder, model, initArgs, null))
		val numbers = result1.executionTimes

		println('''«name» - «model» - scenario «scenarioID» :''')
		println("- numbers: " + numbers)
		// println("- mean: " + mean(numbers))
		println("- median: " + median(numbers))

		return new BenchResult2(result1.amountSteps, median(numbers))
	}
	
	abstract def ILanguageWrapper getCompiledDSL()
	abstract def ILanguageWrapper getInterpretedDSL()

	def BenchResult2 testCompiled(String plugin, String folder, String model, int scenarioID) {
		val compiledEngine = new FeedbackEngineWrapper()
		return testGeneric("compiled", compiledEngine, getCompiledDSL, plugin, folder, model, scenarioID)
	}

	def BenchResult2 testInterpreted(String plugin, String folder, String model) {
		val interpretedEngine = new JavaEngineWrapper()
		return testGeneric("interpreted", interpretedEngine, getInterpretedDSL, plugin, folder, model,
			scenarioID)
	}

	def BenchResult2 testNoFeedback(String plugin, String folder, String model, int scenarioID) {
		val noFeedback = new FeedbackEngineWrapper(true)
		return testGeneric("noFeedback", noFeedback, getCompiledDSL, plugin, folder, model, scenarioID)
	}

	override genericInternalTest(String plugin, String folder, String model, int scenarioID) {
		val line = new CSVLine

		line.modelName = model
		line.modelSize = sizeNumber
		line.scenarioID = scenarioID

		val resultNoFeedback = testNoFeedback(plugin, folder, model, scenarioID)
		val resultInterpreter = testInterpreted(plugin, folder, model)
		val resultCompiled = testCompiled(plugin, folder, model, scenarioID)

		line.timeCompiledNoFeedback = resultNoFeedback.executionTime
		line.timeInterpreted = resultInterpreter.executionTime
		line.timeCompiled = resultCompiled.executionTime

		line.amountSteps = resultInterpreter.getAmountSteps

		outputCSVWriter.println(line.customToString)

	}

//	@AfterClass
//	static def void pause() {
//		TestUtil::waitForJobsThenWindowClosed
//	}
}
