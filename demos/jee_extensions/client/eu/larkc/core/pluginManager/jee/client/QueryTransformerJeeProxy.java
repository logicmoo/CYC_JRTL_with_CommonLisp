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

import java.util.Set;
import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.core.pluginManager.jee.shared.QueryTransformerParameters;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.QueryTransformer;

/**
 * Specific JEE proxy class used for query transformer plug-ins. 
 * 
 * @author Barry Bishop
 *
 */
public class QueryTransformerJeeProxy extends PluginJeeProxy implements QueryTransformer {

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            the URL where the actual plug-in is deployed
	 */
	public QueryTransformerJeeProxy( String url ) {
		super( url );
	}
	
	/**
	 * @see QueryTransformer#transform(Query, Contract, Context)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Set<Query> transform( Query theQuery, Contract theContract, Context theContext ) {
		QueryTransformerParameters parameters = new QueryTransformerParameters( theQuery, theContract, theContext );
		
		return (Set<Query>) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
	}
}
