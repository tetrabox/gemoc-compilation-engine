package org.modelexecution.activitydiagram.generator;

import java.util.Random;


import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ControlFlow;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.OpaqueAction;

public class ActivityGenerator {

	private static final ActivitydiagramFactory umlFactory = ActivitydiagramFactory.eINSTANCE;

	private int numberAddedNodes = 0;

	private int numberCreatedActions = 0;
	private int numberCreatedForks = 0;
	private int numberCreatedJoins = 0;
	private int numberCreatedControlFlows = 0;

	private int numberOpenBranches = 0;

	private int[] forkProbabilityArray;

	private int numberDesiredNodes;

	private Activity activity = null;

	/**
	 * Generates a random activity.
	 * 
	 * @param numberNodes
	 *            Number of nodes that should be added to the activity
	 * @param forkProbability
	 *            Probability to generate a fork nodes given as an Integer
	 *            between 0 and 100 representing 0% to 100 %
	 * @return the generated activity
	 */
	public Activity generateActivity(int numberNodes, int forkProbability) {
		forkProbabilityArray = createForkProbabilityArray(forkProbability);
		this.numberDesiredNodes = numberNodes;

		activity = umlFactory.createActivity();

		InitialNode initialNode = createInitialNode();
		addNode(initialNode);

		ActivityNode lastNode = initialNode;
		while (!isDesiredNumberOfNodesReached()) {
			lastNode = createNode(lastNode);
		}

		ActivityFinalNode finalNode = createFinalNode();
		addNode(finalNode, lastNode);

		return activity;
	}

	private ActivityNode createNode(ActivityNode predecessorNode) {
		ActivityNode node = null;

		NodeType nodeType = chooseNodeType();
		if (nodeType == NodeType.FORK && canCreateBranch()) {
			node = createBranch(predecessorNode);
		} else {
			node = createAction();
			addNode(node, predecessorNode);
		}

		return node;
	}

	private JoinNode createBranch(ActivityNode predecessorNode) {
		++numberOpenBranches;
		ForkNode fork = createFork();
		addNode(fork, predecessorNode);

		ActivityNode lastNodeBranch1 = fork;
		while (!shouldJoin() && !isDesiredNumberOfNodesReached()) {
			lastNodeBranch1 = createNode(lastNodeBranch1);
		}

		ActivityNode lastNodeBranch2 = fork;
		while (!shouldJoin() && !isDesiredNumberOfNodesReached()) {
			lastNodeBranch2 = createNode(lastNodeBranch2);
		}

		JoinNode join = createJoin();
		addNode(join, lastNodeBranch1, lastNodeBranch2);
		--numberOpenBranches;
		return join;
	}

	private boolean shouldJoin() {
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		if (randomNumber == 1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean canCreateBranch() {
		int numberIntroducedForkNodes = 1;
		int numberIntroducedJoinNodes = 1;
		int numberMissingFinalNodes = 1;
		int numberMissingJoinNodes = numberOpenBranches;
		if ((numberAddedNodes + numberIntroducedForkNodes + numberIntroducedJoinNodes + numberMissingFinalNodes
				+ numberMissingJoinNodes) < numberDesiredNodes) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isDesiredNumberOfNodesReached() {
		int numberMissingJoinNodes = numberOpenBranches;
		int numberMissingFinalNodes = 1;
		if ((numberAddedNodes + numberMissingJoinNodes + numberMissingFinalNodes) == numberDesiredNodes) {
			return true;
		} else {
			return false;
		}
	}

	private NodeType chooseNodeType() {
		NodeType type;

		Random random = new Random();
		int randomNumber = random.nextInt(100);
		int choice = forkProbabilityArray[randomNumber];

		if (choice == 1) {
			type = NodeType.FORK;
		} else {
			type = NodeType.ACTION;
		}
		return type;
	}

	private int[] createForkProbabilityArray(int forkProbability) {
		if (forkProbability > 100) {
			throw new RuntimeException("Probability that a fork is generated has to be between 0 and 100");
		}

		int[] forkProbabilityArray = new int[100];
		for (int i = 0; i < forkProbability; ++i) {
			forkProbabilityArray[i] = 1;
		}
		for (int i = forkProbability; i < 100; ++i) {
			forkProbabilityArray[i] = 0;
		}
		return forkProbabilityArray;
	}

	private ActivityFinalNode createFinalNode() {
		ActivityFinalNode finalNode = umlFactory.createActivityFinalNode();
		finalNode.setName("FinalNode");
		return finalNode;
	}

	private InitialNode createInitialNode() {
		InitialNode initialNode = umlFactory.createInitialNode();
		initialNode.setName("InitialNode");
		return initialNode;
	}

	private OpaqueAction createAction() {
		OpaqueAction action = umlFactory.createOpaqueAction();
		++numberCreatedActions;
		action.setName("Action" + numberCreatedActions);
		return action;
	}

	private ForkNode createFork() {
		ForkNode fork = umlFactory.createForkNode();
		++numberCreatedForks;
		fork.setName("Fork" + numberCreatedForks);
		return fork;
	}

	private JoinNode createJoin() {
		JoinNode join = umlFactory.createJoinNode();
		++numberCreatedJoins;
		join.setName("Join" + numberCreatedJoins);
		return join;
	}

	private ControlFlow createControlFlow(ActivityNode sourceNode, ActivityNode targetNode) {
		ControlFlow controlFlow = umlFactory.createControlFlow();
		++numberCreatedControlFlows;
		controlFlow.setName("ControlFlow" + numberCreatedControlFlows);
		controlFlow.setSource(sourceNode);
		controlFlow.setTarget(targetNode);
		return controlFlow;
	}

	private void addNode(ActivityNode newNode, ActivityNode... predecessorNodes) {
		activity.getNodes().add(newNode);

		for (ActivityNode predecessorNode : predecessorNodes) {
			ControlFlow incomingEdge = createControlFlow(predecessorNode, newNode);
			addEdge(incomingEdge);
		}

		++numberAddedNodes;
	}

	private void addEdge(ActivityEdge edge) {
		activity.getEdges().add(edge);
	}

	enum NodeType {
		FORK, ACTION;
	}
}
