/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
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
	
	 
	@Override
	public String getName() {
		return methodName;
	}
	
	 
	@Override
	public String[] getInputTypes(int inputN) {
		return inputTypesV.get(inputN);
	}
	 
	@Override
	public int getInputs() {
		return inputTypesV.size();
	}

	 
	@Override
	public String[] getOutputTypes() {
		return outputTypes;
	}

}
