package model;

import model.Node;

public class Network {
	private Node[] input;
	private Node[] output;
	private Node[][] hiddenLayers;
	
	/**
	 * This class is responsible for managing all the nodes of the network.
	 * @param numberOfInputs The number of inputs of the network
	 * @param numberOfOutputs The number of outputs of The network
	 * @param numberOfHiddenLayers The number of Hidden Layers of the network
	 */
	Network (int numberOfInputs, int numberOfOutputs, int[] numberOfHiddenLayers){
		this.input = new Node[numberOfInputs];
		this.output = new Node[numberOfOutputs];
		for(int i = 0 ; i < numberOfHiddenLayers.length ; i++){
			this.hiddenLayers[i] = new Node[numberOfHiddenLayers[i]];
		}
	}
}
