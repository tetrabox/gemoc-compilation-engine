package org.modelexecution.activitydiagram.generator.test;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import org.modelexecution.activitydiagram.generator.ActivityGenerator;

import activitydiagram.Activity;

public class TestActivityGenerator {

	@Test
	public void generateActivitySize10() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(10, 40);
		Assert.assertEquals(10, activity.getNodes().size());
		activity.setName("Activity-Size10");
		persist(activity, "models/Activity-Size10.xmi");
	}
	
	@Test
	public void generateActivitySize20() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(20, 40);
		Assert.assertEquals(20, activity.getNodes().size());
		activity.setName("Activity-Size20");
		persist(activity, "models/Activity-Size20.xmi");
	}

	@Test
	public void generateActivitySize30() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(30, 40);
		Assert.assertEquals(30, activity.getNodes().size());
		activity.setName("Activity-Size30");
		persist(activity, "models/Activity-Size30.xmi");
	}
	
	@Test
	public void generateActivitySize50() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(50, 40);
		Assert.assertEquals(50, activity.getNodes().size());
		activity.setName("Activity-Size50");
		persist(activity, "models/Activity-Size50.xmi");
	}
	
	@Test
	public void generateActivitySize100() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(100, 40);
		Assert.assertEquals(100, activity.getNodes().size());
		activity.setName("Activity-Size100");
		persist(activity, "models/Activity-Size100.xmi");
	}

	private void persist(Activity activity, String path) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(activity);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not store generated activity " + activity.getName() + " at path " + path);
		}
	}

}
