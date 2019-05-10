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
import java.util.Set;
import eu.larkc.core.pluginManager.jee.shared.QueryTransformerParameters;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.transform.QueryTransformer;

/**
 * Servlet for a query transformer plugin.
 * 
 * @author Barry Bishop
 * 
 */
public class QueryTransformerPluginServlet extends PluginServlet {
	
	protected void invokePlugin( Plugin plugin, UrlParameters parameters, ObjectInputStream input, ObjectOutputStream output ) throws IOException {
		
		QueryTransformerParameters invocationParameters;
		
		try {
			invocationParameters = (QueryTransformerParameters) input.readObject();
        }
        catch( ClassNotFoundException e ) {
        	String message = "Unable to read input stream: " + e.getMessage();
        	log( message );
	        throw new IOException( message, e );
        }
		
		log( "Invoking with: " + invocationParameters.getQuery() );
		
		QueryTransformer transformer = (QueryTransformer) plugin;
		
		Set<Query> result = transformer.transform(invocationParameters.getQuery(), invocationParameters.getContract(), invocationParameters.getContext());
		
		output.writeObject( result );
	}

	private static final long serialVersionUID = 1L;
}
