package model;

import java.util.LinkedList;

public class Node {
	private double bias;
	private double weight;
	private FUNCTION actFun;
	private LinkedList<Node> inputs;
	
	/**
	 * Creates a new node of the network
	 * 
	 * @param bias - The Bias of this node
	 * @param weight - The Weight of the pre activation function
	 * @param actiivationFunction - The function wich the node will use to calculate it's activation
	 */
	Node(double bias, double weight, FUNCTION actiivationFunction){
		this.bias = bias;
		this.weight = weight;
		this.actFun = actiivationFunction;
	}
	
	/**
	 * calculates the activation function of this node and returns the value.
	 * if the there's no function selected the node will use the Sigmoid Function as
	 * activation...
	 **/
	double CalculateActivation(){
		if (actFun == FUNCTION.RectifiedLinear){
			return Math.max(0, this.CalculatePreActivation());
		}
		if (actFun == FUNCTION.HperbolicTangent){
			Math.tanh(this.CalculatePreActivation());
		}
		// else calculates the Sigmoid Function
		double x = -(this.CalculatePreActivation());
		return 1/(1 + Math.exp(x));
	}
	
	/**
	 * adds a new reference to a previous node, all the nodes activations added as input will be used
	 * in order to calculate this node activation. 
	 */
	public void addInput(Node n){
		this.inputs.add(n);
	}
	
	/**
	 * Calculates the pre ativation function of this node.
	 * @return the sum of the inputs multiplied by the weight
	 */
	private double CalculatePreActivation() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}