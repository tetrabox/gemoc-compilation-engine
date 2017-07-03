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
		Util.persist(activity, "models-test/Activity-Size10.xmi");
	}
	
	@Test
	public void generateActivitySize20() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(20, 40);
		Assert.assertEquals(20, activity.getNodes().size());
		activity.setName("Activity-Size20");
		Util.persist(activity, "models-test/Activity-Size20.xmi");
	}

	@Test
	public void generateActivitySize30() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(30, 40);
		Assert.assertEquals(30, activity.getNodes().size());
		activity.setName("Activity-Size30");
		Util.persist(activity, "models-test/Activity-Size30.xmi");
	}
	
	@Test
	public void generateActivitySize50() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(50, 40);
		Assert.assertEquals(50, activity.getNodes().size());
		activity.setName("Activity-Size50");
		Util.persist(activity, "models-test/Activity-Size50.xmi");
	}
	
	@Test
	public void generateActivitySize100() {
		ActivityGenerator generator = new ActivityGenerator();
		Activity activity = generator.generateActivity(100, 40);
		Assert.assertEquals(100, activity.getNodes().size());
		activity.setName("Activity-Size100");
		Util.persist(activity, "models-test/Activity-Size100.xmi");
	}


}
