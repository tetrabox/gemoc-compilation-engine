package org.eclipse.gemoc.execution.feedbackengine.tests

import java.util.Collection
import java.util.List

class Util {
	public static def Long mean(Collection<Long> values) {
		val sum = values.reduce[p1, p2|p1 + p2]
		return sum / values.size
	}

	public static def Long median(List<Long> values) {
		val sorted = values.sort
		val int middle = sorted.size / 2;
		if (sorted.size % 2 == 1) {
			return sorted.get(middle);
		} else {
			return (sorted.get(middle - 1) + sorted.get(middle)) / 2;
		}
	}

	public static def String format(int value, int amountNumbers) {
		String.format("%0" + amountNumbers + "d", value);
	}

}
