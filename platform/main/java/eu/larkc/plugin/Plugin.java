package eu.larkc.plugin;

import org.openrdf.model.URI;

import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.qos.QoSInformation;

public interface Plugin {

	/**
	 * Called once before the plug-in's main invocation method
	 * e.g. before identify(...) for an Identifier plug-in.
	 * The same Context instance should be passed to each successive plug-in invocation
	 * for the same workflow level task (query-answering).
	 * @return The new context object that holds all of the plug-in's internal state.
	 */
	public Context createContext();
	
	/**
	 * Called by the platform so that the plug-in can do any extra one-time initailisation
	 * after construction, but before invocation.
	 */
	public void initialise();
	
	/**
	 * Called by the platform to allow the plug-in to do any final resource clean up.
	 * The plug-in should not be used after this has been invoked. 
	 */
	public void shutdown();
	
	public URI getIdentifier();
	public QoSInformation getQoSInformation();
	//public MetaData getMetaData();
}
