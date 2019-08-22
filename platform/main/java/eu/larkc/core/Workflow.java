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

import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

import org.openrdf.model.URI;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalCollectionInformationSetTransformManager;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalQueryTransformManager;
import eu.larkc.core.pluginManager.local.LocalReasonManagerFromSetOfStatementsManager;
import eu.larkc.core.pluginManager.local.LocalSelectFromCollectionInformationSetManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.pluginManager.local.queue.QueueListener;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;

/**
 * This class is responsible for construction and running the workflows. It removes the technical
 * java stuff out of the deciders.
 * 
 * @author Luka Bradesko
 *
 */
public class Workflow {

	//list of plugin identifiers
	private Vector<URI> pluginIds = new Vector<URI>();
	private HashMap<URI, Plugin> pluginInstances = new HashMap<URI, Plugin>();
	
	private Queue<Query> WorkflowInputQueue = new Queue<Query>();
	private Queue<InformationSet> WorkflowOutputQueue = new Queue<InformationSet>();


	/**
	 * Adds the plug-in to the Workflow
	 */
	public void addPlugIn(URI _plugIn){
		pluginIds.add(_plugIn);
	}
	
	/**
	 * Instantiates the plug-ins, connects them into the Workflow and starts the Workflow.
	 * This method assumes that the Workflow is correct and that it is only linear, with a reasoner 
	 * as a last plug-in
	 * 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void start(Query _query) throws InstantiationException, IllegalAccessException{
		/*
		 * TODO: if wrong incorrect it should throw some exception
		 * TODO: warnings can be avoided by checks and 3 different types of inputQueue
		 */
		WorkflowInputQueue.put(_query); WorkflowInputQueue.put(null);
		
		Queue<?> inputQueue = WorkflowInputQueue;
		PluginManager previousManager = null;
		
		for (URI uri : pluginIds){
			Plugin plugin = Larkc.pluginRegistry.getNewPluginInstance(uri);
			if (plugin == null) throw new InstantiationException(uri +  " not found in the LarKC internal plug-in KB!");//TODO: Change to LarKC exception
			pluginInstances.put(uri, plugin);
						
			if (plugin instanceof QueryTransformer) {
				Queue<Query> transformOutputQ = new Queue<Query>();
				
				LocalQueryTransformManager transform = new LocalQueryTransformManager(
						(QueryTransformer) plugin, (Queue<Query>)inputQueue, transformOutputQ);

				transform.setPrevious(previousManager);
				transform.start();
				inputQueue = transformOutputQ;
				previousManager = transform;
			} else if (plugin instanceof Identifier) {
				Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
				LocalIdentifyManager identify = new LocalIdentifyManager(
						(Identifier) plugin, (Queue<Query>)inputQueue, identifyOutputQueue);
			
				identify.setPrevious(previousManager);
				identify.start();
				inputQueue = identifyOutputQueue;
				previousManager = identify;
			} else if (plugin instanceof InformationSetTransformer) {
				Queue<Collection<InformationSet>> transformOutputQueue = new Queue<Collection<InformationSet>>();
				LocalCollectionInformationSetTransformManager transform = new LocalCollectionInformationSetTransformManager(
						(InformationSetTransformer) plugin, (Queue<Collection<InformationSet>>)inputQueue, transformOutputQueue);
			
				transform.setPrevious(previousManager);
				transform.start();
				inputQueue = transformOutputQueue;
				previousManager = transform;
			} else if (plugin instanceof Selecter) {
				Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
				LocalSelectFromCollectionInformationSetManager select = new LocalSelectFromCollectionInformationSetManager(
						(Selecter)plugin, (Queue<Collection<InformationSet>>)inputQueue,
						selectionOutputQueue);

				select.setPrevious(previousManager);
				select.start();
				inputQueue = selectionOutputQueue;
				previousManager = select;
			} else if (plugin instanceof Reasoner) {
				Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
				final LocalReasonManagerFromSetOfStatementsManager reason = new LocalReasonManagerFromSetOfStatementsManager((Reasoner)plugin, 
															 _query,
															 (Queue<SetOfStatements>)inputQueue, 
															 reasonOutputQueue);
				reason.setPrevious(previousManager);
				reason.start();

				//Here I suppose that reasoner is the last in the Workflow and the only one
				WorkflowOutputQueue = reasonOutputQueue; 
				previousManager = reason;
				
				reason.accept(PluginManager.Message.NEXT);
				reasonOutputQueue.addListener(new QueueListener<InformationSet>() {
					public void elementAdded(InformationSet is) {
						if (is != null) {
							reason.accept(PluginManager.Message.NEXT);
						}
						else{
							reason.accept(PluginManager.Message.STOP);
						}
					}
				});
			}
		}//for all added plug-ins		
	}
	
		
	/**
	 * Gets the result from the last plug-in in the Workflow
	 * 
	 * @param inputQuery
	 */
	public InformationSet take(){
		return WorkflowOutputQueue.take();
	}
	
	
	
	
}//class
