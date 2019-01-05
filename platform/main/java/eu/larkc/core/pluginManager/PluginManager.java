package eu.larkc.core.pluginManager;

/**
 * A Plugin Manager is a container within which a particular instantiation of a Plugin lives during the execution of the pipeline.
 * 
 * The Plugin manager makes the life of the plugin developer easier by providing all those features related to communication with the 
 * rest of the pipeline. 
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public interface PluginManager {
	
	/**
	 * This enumeraton contains the set of messages that can be send to a given PluginManger from another PluginManger.
	 */
	enum Message {
		/**
		 * This messages instructs a PluginManger to provide the next piece of output for the next plugin in the pipeline
		 */
		NEXT, 
		/**
		 * This message instructs a PluginManager to stop producing output for the next plugin in the pipeline
		 */
		STOP
	}

	/**
	 * The accept method allows a particular party to send a control message to the Plugin Manger. 
	 * 
	 * @see Message
	 * 
	 * @param message the message being sent from another PluginManager
	 */
	public void accept(Message message);
	
	/**
	 * The setPrevious method is used to inform the PluginManager of the previous PluginManager in the pipeline, i.e. the PluginManger 
	 * from whcih it should request data
	 * 
	 * @param thePluginManager the PluginManager responsible for managing the previous plugin in the pipeline 
	 */
	public void setPrevious(PluginManager thePluginManager);
	
	/**
	 * The start method should be called to instruct the Plugin Manager that it should begin the process of finding data for the plugin
	 * it manages and producing data for the next plugin in the pipeline.  
	 */
	public void start();
}
