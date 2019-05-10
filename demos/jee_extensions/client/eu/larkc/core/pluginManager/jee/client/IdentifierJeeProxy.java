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
package eu.larkc.core.pluginManager.jee.client;

import java.util.Collection;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.pluginManager.jee.shared.IdentifierParameters;
import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;

/**
 * Specific JEE proxy class used for identifier plug-ins. 
 * 
 * @author Barry Bishop
 *
 */
public class IdentifierJeeProxy extends PluginJeeProxy implements Identifier {

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            the URL where the actual plug-in is deployed
	 */
	public IdentifierJeeProxy( String url ) {
		super( url );
	}
	
	/**
	 * @see Identifier#identify(Query, Contract, Context)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<InformationSet> identify(Query query, Contract contract, Context context) {
		IdentifierParameters parameters = new IdentifierParameters( query, contract, context );
		
		return (Collection<InformationSet>) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
	}
}
