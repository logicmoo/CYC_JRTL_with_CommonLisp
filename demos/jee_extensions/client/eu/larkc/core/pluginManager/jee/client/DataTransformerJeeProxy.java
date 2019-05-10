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

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.pluginManager.jee.shared.DataTransformerParameters;
import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;

/**
 * Specific JEE proxy class used for data transformer plug-ins. 
 * 
 * @author Barry Bishop
 *
 */
public class DataTransformerJeeProxy extends PluginJeeProxy implements InformationSetTransformer {

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            the URL where the actual plug-in is deployed
	 */
	public DataTransformerJeeProxy( String url ) {
		super( url );
	}
	
	
	/**
	 * @see InformationSetTransformer#transform(InformationSet, Contract, Context)
	 */
	@Override
	public InformationSet transform(InformationSet informationSet, Contract contract, Context context) {
		
		DataTransformerParameters parameters = new DataTransformerParameters( informationSet, contract, context );
		return (InformationSet) callPluginInstance( parameters, OperationDescriptor.OP_INVOKE );
	}
}
