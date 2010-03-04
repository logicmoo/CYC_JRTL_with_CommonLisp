package eu.larkc.core.metadata;

import java.util.Vector;

public class MethodMetaDataImpl implements MethodMetaData {

	String methodName;
	Vector<String[]> inputTypesV;
	String[] outputTypes;
	
	public MethodMetaDataImpl(String _methodName, String[] inputTypes, String outputType) {
		methodName = _methodName;
		inputTypesV = new Vector<String[]>();
		inputTypesV.add(inputTypes);
		outputTypes = new String[] { outputType };
	}

	public MethodMetaDataImpl(String _methodName, String[] firstInputTypes, 
				String[] secondInputTypes, String outputType) {
		
		methodName = _methodName;
		inputTypesV = new Vector<String[]>();
		inputTypesV.add(firstInputTypes);
		inputTypesV.add(secondInputTypes);
		outputTypes = new String[] { outputType };
	}	
	
	public static String getGemericsName(String templateClass, String elementClass) {
		return templateClass + "<" + elementClass + ">";
	}
	
	 
	public String getName() {
		return methodName;
	}
	
	 
	public String[] getInputTypes(int inputN) {
		return inputTypesV.get(inputN);
	}
	 
	public int getInputs() {
		return inputTypesV.size();
	}

	 
	public String[] getOutputTypes() {
		return outputTypes;
	}

}
