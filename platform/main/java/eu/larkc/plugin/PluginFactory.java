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

import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;

public interface PluginFactory {

	public Identifier getIdentifier(URI thePluginId);
	public InformationSetTransformer getDataSetTransformer(URI thePluginId);
	public QueryTransformer getQueryTransformer(URI thePluginId);
	public Selecter getSelecter(URI thePluginId);
	public Reasoner getReasoner(URI thePluginId);
	public Decider getDecider(URI thePluginId);
	
	public Plugin getPlugin(URI thePluginId);
}
