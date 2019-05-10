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
package eu.larkc.core;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.decide.Decider;


/**
 * Main entry point to the LarKC platform
 * 
 * @author Blaz Fortuna, Luka Bradesko
 *
 */
public final class Larkc {
	
	// plug-in storage
	public static PluginRegistry pluginRegistry; 
	private static Decider decider;
	
	
	public static void main(String[] args) {
		//Logger.getLogger("eu.larkc.core.metadata.PluginRegistry").setLevel(Level.ALL);
	    
		if (args == null || args.length==0)
			SubLMain.main(new String[]{"-i","conf"+ File.separator+"larkc-init.lisp", "-b"});
		else
			SubLMain.main(args);
	}
	
	
	// initialize the platform
	public static void Initialize() { 		
		pluginRegistry = new PluginRegistry();	
		// load plug-ins' meta-data to the internal KB
		pluginRegistry.loadPlugins();	
		// initialize decider
		decider = pluginRegistry.startDecider();		
	}
	
	// entry points for queries
	public static VariableBinding sparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		ensureDecider();
		return decider.sparqlSelect(theQuery, theQoSParameters);
	}
	
	public static SetOfStatements sparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		ensureDecider();
		return decider.sparqlConstruct(theQuery, theQoSParameters);
	}
	

	private static void ensureDecider()
	{
		if(decider==null) {
			decider = pluginRegistry.startDecider();
		}
	}
	
	public static SetOfStatements sparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		ensureDecider();
		return decider.sparqlDescribe(theQuery, theQoSParameters);
	}
	
	public static BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		ensureDecider();
		return decider.sparqlAsk(theQuery, theQoSParameters);
	}
}
