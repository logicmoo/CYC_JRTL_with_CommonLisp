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
