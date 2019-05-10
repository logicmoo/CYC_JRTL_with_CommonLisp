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
package eu.larkc.plugin.decider;

import java.util.Collection;
import java.util.logging.Logger;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalReasonManagerFromSetOfStatementsManager;
import eu.larkc.core.pluginManager.local.LocalSelectFromCollectionInformationSetManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.pluginManager.local.queue.QueueListener;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.Context;

public class LDSRDecider implements Decider {

	private static Logger logger = Logger.getLogger(LDSRDecider.class.getCanonicalName());
	
	private PluginManager lastPluginManager;
	
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		
		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastOutputQueue=null;
		
		try {	
			Queue<Query> queryIdentifierInputQueue = new Queue<Query>();
			Queue<Collection<InformationSet>> identifierOutputQueue = new Queue<Collection<InformationSet>>();
			
			//***************************** LDSRIdentifier ***************************\\
			Identifier id = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.LDSRIdentifier"));
			
			LocalIdentifyManager identify = new LocalIdentifyManager(id, queryIdentifierInputQueue, identifierOutputQueue);
			queryIdentifierInputQueue.put(theQuery);
			queryIdentifierInputQueue.put(null);
			identify.start();

			//***************************** GrowingSetSelector ***************************\\
			Selecter sel = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
			
			Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
			LocalSelectFromCollectionInformationSetManager select = new LocalSelectFromCollectionInformationSetManager(sel, identifierOutputQueue, selectionOutputQueue);
			select.setPrevious(identify);
			select.start();
			
			//***************************** LDSRReasoner ***************************\\
			Reasoner res = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.LDSRReasoner"));
				
			Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
			LocalReasonManagerFromSetOfStatementsManager reason = new LocalReasonManagerFromSetOfStatementsManager(res, theQuery, selectionOutputQueue, reasonOutputQueue);
			reason.setPrevious(select);
			reason.start();

			lastPluginManager = reason;
			lastOutputQueue = reasonOutputQueue;
			
			reason.accept(PluginManager.Message.NEXT);
			lastOutputQueue.addListener(new QueueListener<InformationSet>() {
				public void elementAdded(InformationSet is) {
					if (is != null) {
						lastPluginManager.accept(PluginManager.Message.NEXT);
					} else {
						lastPluginManager.accept(PluginManager.Message.STOP);
					}
				}
			});
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Queue<InformationSet> lastResult = lastOutputQueue;
		InformationSet is = getLastResult(lastResult);
		if (!(is instanceof VariableBinding)){
			return null;
		}

		logger.info("Finished in " + (System.currentTimeMillis()-startTime) + " ms");
		
		return (VariableBinding) is;
	}
	
	private InformationSet getLastResult(Queue<InformationSet> queue) {
    	VariableBinding result = (VariableBinding) queue.take();
		do {
		} while (queue.take() != null);
		return result;
	}
	
	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
