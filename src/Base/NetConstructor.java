package Base;

import Graph.*;

public class NetConstructor {
	// the pointer of the graph structure
	private Graph g;
	
	
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
			// now check the numbers of hidden layers
			if(HiddenLayers == 0){
				this.createDeepNetwork();
			}
			int params[] =  {Inputs, Outputs, HiddenLayers};
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


	private void createDeepNetwork() {
		// TODO Auto-generated method stub
		
	}
	
}
