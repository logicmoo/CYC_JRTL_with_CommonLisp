package eu.larkc.core.metadata;

import java.util.Vector;

public class MetaDataImpl implements MetaData {

	private String pluginType;
	private Vector<MethodMetaData> methodMetaDataV;
	
	public MetaDataImpl(String _pluginType) {
		pluginType = _pluginType;
		methodMetaDataV = new Vector<MethodMetaData>();
	}	
	
	public void addMethod(MethodMetaData methodMetaData) {
		methodMetaDataV.add(methodMetaData);
	}
	
	 
	public MethodMetaData[] getMethods() {
		MethodMetaData[] methodMetaDataArray = new MethodMetaData[methodMetaDataV.size()];
		methodMetaDataV.toArray(methodMetaDataArray);
		return methodMetaDataArray;
	}

	 
	public String getPluginType() {
		return pluginType;
	}

}
