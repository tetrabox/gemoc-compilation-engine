package org.modelexecution.activitydiagram.generator.test

import activitydiagram.Activity
import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Util {
	public static def void persist(Activity activity, String path) {
		val ResourceSet resourceSet = new ResourceSetImpl();
		val Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(activity);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not store generated activity " + activity.getName() + " at path " + path);
		}
	}


	public static def String format(int value, int amountNumbers) {
		String.format("%0"+amountNumbers+"d", value);
	}

}
