package neural;

public class NeuralNetworkSimple implements Cloneable{

	// Simple neural net with a input and an output layer
	
	int inputLayerSize;
	int outputLayerSize;
	int hiddenLayerSize;
	public double[] weights;
	
	public NeuralNetworkSimple(int inputLayerSize,int hiddenLayerSize, int outputLayerSize) {
		this.inputLayerSize = inputLayerSize;
		this.outputLayerSize = outputLayerSize;
		this.hiddenLayerSize = hiddenLayerSize;
		weights = new double[inputLayerSize* hiddenLayerSize + hiddenLayerSize * outputLayerSize];
	}
	
	
	public double[] calculate(double[] input) {
	
		double[] hiddenOutput = new double[hiddenLayerSize];
		int weightIndex = 0;
		for (int j = 0;j < hiddenLayerSize; j++) {
			
			for (int i = 0; i < inputLayerSize; i++) {
				hiddenOutput[j] += input[i]*weights[weightIndex];
				
				weightIndex++;
			}
		}
		
		for (int i = 0;i < hiddenOutput.length;i++) {
			hiddenOutput[i] = hiddenSigmoid(hiddenOutput[i]);
			
			if (hiddenOutput[i]<0) {
				hiddenOutput[i] = hiddenOutput[i]/2F;
			}
			
		}
		
		double[] output = new double[outputLayerSize];
		for (int j = 0;j < outputLayerSize; j++) {
			
			for (int i = 0; i < hiddenLayerSize; i++) {
				output[j] += hiddenOutput[i]*weights[weightIndex];
				
				weightIndex++;
			}
		}
		for (int j = 0;j < outputLayerSize; j++) {
			
			
			 output[j] = outputSigmoid(output[j]);
		}
		return output;
	}
	
	public NeuralNetworkSimple clone() {
		NeuralNetworkSimple clone = new NeuralNetworkSimple(inputLayerSize,hiddenLayerSize, outputLayerSize);
		for (int i = 0;i < clone.weights.length;i++) {
			clone.weights[i] = weights[i];
		}
		return clone;
	}

	 public static double hiddenSigmoid(double x) {
	        return (1D/(1+ Math.exp(-x)))*2-1;
	    }
	 public static double outputSigmoid(double x) {
			 return (1D/(1+ Math.exp(-x)));
	    }
}
