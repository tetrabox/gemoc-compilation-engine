package org.tetrabox.examples.statemachines.generator.test

import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import statemachines.CustomSystem

class Util {
	public static def void persist(CustomSystem system, String path) {
		val ResourceSet resourceSet = new ResourceSetImpl();
		val Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(system);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not store generated state machine " + system + " at path " + path);
		}
	}


	public static def String format(int value, int amountNumbers) {
		String.format("%0"+amountNumbers+"d", value);
	}

}
