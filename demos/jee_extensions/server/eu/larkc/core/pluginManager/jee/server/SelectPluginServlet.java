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
package eu.larkc.core.pluginManager.jee.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.jee.shared.SelecterParameters;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.select.Selecter;

/**
 * Servlet for a selecter plugin.
 * 
 * @author Barry Bishop
 * 
 */
public class SelectPluginServlet extends PluginServlet {
	
	protected void invokePlugin( Plugin plugin, UrlParameters parameters, ObjectInputStream input, ObjectOutputStream output ) throws IOException {
		
		SelecterParameters invocationParameters;
		
		try {
			invocationParameters = (SelecterParameters) input.readObject();
        }
        catch( ClassNotFoundException e ) {
        	String message = "Unable to read input stream: " + e.getMessage();
        	log( message );
	        throw new IOException( message, e );
        }
		
		log( "Invoking" );
		
		Selecter identifier = (Selecter) plugin;
		
		SetOfStatements outputStatements = identifier.select( invocationParameters.getStatements(), invocationParameters.getContract(), invocationParameters.getContext() );
		
		output.writeObject( outputStatements );
	}

	private static final long serialVersionUID = 1L;
}
