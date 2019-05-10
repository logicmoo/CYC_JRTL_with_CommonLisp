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

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.core.pluginManager.jee.shared.ReasonerParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

/**
 * Specific JEE proxy class used for reasoner plug-ins. 
 * 
 * @author Barry Bishop
 *
 */
public class ReasonerJeeProxy extends PluginJeeProxy implements Reasoner {

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            the URL where the actual plug-in is deployed
	 */
	public ReasonerJeeProxy( String url ) {
		super( url );
	}
	
	@Override
    public BooleanInformationSet sparqlAsk( SPARQLQuery query, SetOfStatements statements, Contract contract, Context context ) {
		ReasonerParameters parameters = new ReasonerParameters( query, statements, contract, context );
		return (BooleanInformationSet) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
    }

	@Override
    public SetOfStatements sparqlConstruct( SPARQLQuery query, SetOfStatements statements, Contract contract, Context context ) {
		ReasonerParameters parameters = new ReasonerParameters( query, statements, contract, context );
		return (SetOfStatements) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
    }

	@Override
    public SetOfStatements sparqlDescribe( SPARQLQuery query, SetOfStatements statements, Contract contract, Context context ) {
		ReasonerParameters parameters = new ReasonerParameters( query, statements, contract, context );
		return (SetOfStatements) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
    }

	@Override
    public VariableBinding sparqlSelect( SPARQLQuery query, SetOfStatements statements, Contract contract,
                    Context context ) {
		ReasonerParameters parameters = new ReasonerParameters( query, statements, contract, context );
		return (VariableBinding) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
    }
}
