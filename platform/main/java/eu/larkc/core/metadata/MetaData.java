package eu.larkc.core.metadata;

public interface MetaData {
	// returns the name of the plug-in interface that is being implemented
	public String getPluginType();	
	// returns all the methods available through the interface
	public MethodMetaData[] getMethods();
}
