package eu.larkc.core.metadata;

public interface MethodMetaData {	
	// name of the method
	public String getName();
	// number of inputs
	public int getInputs();
	// supported types for each of the inputs
	public String[] getInputTypes(int inputN);
	// type on the output
	public String[] getOutputTypes();
}
