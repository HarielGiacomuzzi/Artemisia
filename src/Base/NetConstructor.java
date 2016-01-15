package Base;

import Graph.*;

public class NetConstructor {
	// the pointer of the graph structure
	private Graph graph;
	
	
	/**
	 * 
	 * The NetContructor Class handle the creation of the network structure
	 * and the future adjustments
	 * 
	 * @param Inputs The number of inputs of the neural network, called I
	 * @param Outputs The number of outputs of the neural network, called O
	 * @param HiddenLayers The number of hidden layers of the neural network, called H.
	 * If 0 the network will have I-1 hidden layers. 
	 */
	public NetConstructor(int Inputs, int Outputs, int HiddenLayers){
		// checking if the numbers are okay.
		if(Outputs <= Inputs && HiddenLayers < Inputs){
			int params[] =  {Inputs, HiddenLayers, Outputs};
			// now check the numbers of hidden layers
			if(HiddenLayers == 0){
				this.createDeepNetwork(params);
			}
			this.createNetwork(params);
		}
	}

	/**
	 * This Method Creates the network with the structure defined by the User.
	 * 
	 * @param params is the network parameters, Inputs, Outputs and Hidden Layers
	 */
	private void createNetwork(int[] params) {
		// TODO Auto-generated method stub
		
	}


	private void createDeepNetwork(int[] params) {
		this.graph = new Graph();
		
		// creates all the input nodes 
		for(int i = 0; i < params[0]; i++){
			this.graph.addNode("I: "+i);
		}
		
		// creates all the hidden layers
		for(int i = 0; i < params[0]-params[2]-1; i++){	
			for(int j = 0; j < params[0]-1 - i; j++){
				// creates all the nodes of a hidden layer
				this.graph.addNode("H: "+i+"N: "+j);
				for(int k = 0; k < params[0]; k++){
					//creates all the joints of that node
					if(i == 0){
						this.graph.addDirectedVertex("I: "+k, "H: "+i+"N: "+j);
					}
					this.graph.addDirectedVertex("H: "+(i-1)+"N: "+k, "H: "+i+"N: "+j);
				}
			}
		}
		
		// creates all the output nodes
		for(int i = 0; i < params[2]; i++){
			this.graph.addNode("O: "+i);
			for(int k = 0; k < params[2]+1; k++){
				//creates all the joints of that node
				this.graph.addDirectedVertex("H: "+(params[0]-params[2]-2)+"N: "+k, "O: "+i);
			}
		}
		
		this.graph.CreateGraphVizFile("/Users/harielgiacomuzzi/Desktop/", true);
		System.out.println("feitoria");
	}
	
}
