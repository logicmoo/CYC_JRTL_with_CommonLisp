/*
 * Copyright (C) 2008, 2009 Semantic Technology Institute (STI) Innsbruck, 
 * University of Innsbruck, Technikerstrasse 21a, 6020 Innsbruck, Austria.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package eu.larkc.plugin.decider.randomindexing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.Larkc;
import eu.larkc.core.Workflow;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalCollectionInformationSetTransformManager;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalQueryTransformManager;
import eu.larkc.core.pluginManager.local.LocalReasonManager;
import eu.larkc.core.pluginManager.local.LocalReasonManagerFromCollectionInformationSetManager;
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
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.plugin.Context;

import eu.larkc.core.pluginManager.distributed.GAT.RemoteQueryTransformerExecute_MPI;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteQueryTransformerExecute;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteQueryTransformerPrestage;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteQueryTransformerPoststage;
import eu.larkc.core.gatresource.GATResource;

public class RandomIndexingDecider implements Decider {

	private static Logger logger = Logger.getLogger(RandomIndexingDecider.class.getCanonicalName());
	
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
		Queue<InformationSet> lastOutputQueue=null;
		
		try {
			//***************************** RITransformer ***************************\\
			
			boolean DISTRIBUTED_EXECUTION_ENABLE=true;
			
			Queue<Query> queryTransformerInputQueue = new Queue<Query>();
			Queue<Query> queryTransformerOutputQueue = new Queue<Query>();

			QueryTransformer qt = (QueryTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.gate.RandomIndexingTransformer_MPI"));

			PluginManager queryTransformer = new LocalQueryTransformManager(qt, queryTransformerInputQueue, queryTransformerOutputQueue);
			
			if (DISTRIBUTED_EXECUTION_ENABLE==false)
			{
							
				queryTransformer = new LocalQueryTransformManager(qt, queryTransformerInputQueue, queryTransformerOutputQueue);
				queryTransformerInputQueue.put(theQuery);
				queryTransformerInputQueue.put(null);
				queryTransformer.start();
			}
			else
			{
				Queue<String> queryTransformerOutputQueue_prestage = new Queue<String>();
				Queue<String> queryTransformerOutputQueue_execute = new Queue<String>();	

				//Resource Description 1 - local machine
				//String ResourceURI="localhost";
				//String FileAdaptor="local";
				//String Broker="local";
				//String LarKC_Location=System.getProperty("user.dir");
				//the current working dir containing the LarKC installation
				//String WorkDir="/tmp";
				//String InputDataID="input1";
				//String OutputDataID="output1";
				//String JavaDir="/usr/bin";
				//String JavaArgs="-Xmx1024M";

				//Resource Description 2 - machine accessible via Globus grid middleware
				String ResourceURI="gridway.dgrid.hlrs.de";
				String FileAdaptor="gt4gridftp";
				String Broker="wsgt4new";
				String LarKC_Location="/lustre/ws2/ws/stbw0250-myspace-0/LarKC/platform/dist";
				String WorkDir="/nfs/HOME/HLRS/dgrid/stbw0250/LarKC_remote/Data";
				String InputDataID="input2";
				String OutputDataID="output2";
				String JavaDir="/usr/bin";
				String JavaArgs="-Xmx12000M";
				int NumMPIProcesses=3;
	
				GATResource resource1 = new GATResource(ResourceURI, FileAdaptor, Broker, LarKC_Location, WorkDir, JavaDir, JavaArgs, NumMPIProcesses);

				//Step1. Data prestaging

				PluginManager prestage_transformer = new RemoteQueryTransformerPrestage(
					qt, queryTransformerInputQueue, queryTransformerOutputQueue_prestage, resource1, InputDataID);

				queryTransformerInputQueue.put(theQuery);
				queryTransformerInputQueue.put(null);
				prestage_transformer.start();
			
				//Step2. Plug-in run
				PluginManager execute_transformer = 
					new RemoteQueryTransformerExecute_MPI(
						qt, queryTransformerOutputQueue_prestage, queryTransformerOutputQueue_execute, resource1, OutputDataID);
				execute_transformer.setPrevious(prestage_transformer);
				execute_transformer.start();
			
				//Step3. Data poststaging
				queryTransformer = 
					new RemoteQueryTransformerPoststage(
						qt, queryTransformerOutputQueue_execute, queryTransformerOutputQueue, resource1, OutputDataID);
				queryTransformer.setPrevious(execute_transformer);
				queryTransformer.start();
					
			}
			
			

			//***************************** RIIdentifier ***************************\\
			Identifier id = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.RandomIndexingIdentifier"));
			
			Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
			LocalIdentifyManager identify = new LocalIdentifyManager(id, queryTransformerOutputQueue, identifyOutputQueue);
			identify.setPrevious(queryTransformer);
			identify.start();

			//***************************** GrowingSetSelector ***************************\\
			Selecter sel = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
			
			Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
			LocalSelectFromCollectionInformationSetManager select = new LocalSelectFromCollectionInformationSetManager(sel, identifyOutputQueue, selectionOutputQueue);
			select.setPrevious(identify);
			select.start();
			
			//***************************** SparqlQueryEvaluationReasoner ***************************\\
			Reasoner res = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
				
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
