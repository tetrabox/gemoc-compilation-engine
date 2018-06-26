package org.gemoc.execution.feedbackengine.tests.util

//model_size,nbMut,timeStep,traceSize,traceMemoryFootprint,meanJumpTime,allJumpTimes
class CSVLine {

	public String modelName = ""
	public int scenarioID = -1
	public int modelSize = -1
	public Long timeCompiled = new Long(0)
	public Long timeInterpreted = new Long(0)
	public Long timeCompiledNoFeedback = new Long(0) 
	

	private static val separator = ";";

	private static def getAllFields() {
		CSVLine.declaredFields.filter[f|!f.name.contentEquals("separator")]
	}

	def static String getColumnNames() {
		val allNames = getAllFields.map[f|f.name]
		return allNames.join(separator)
	}

	def String customToString() {
		return getAllFields.map[f|f.get(this)].join(separator)
	}

}
