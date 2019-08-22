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
package eu.larkc.plugin;

import org.openrdf.model.URI;

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
