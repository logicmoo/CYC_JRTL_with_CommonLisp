/*
 * Copyright (C) 2009-2010 CEFRIEL 
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

package eu.larkc.plugin.decider.urbancomputing.ubl;

import java.util.Collection;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalCollectionInformationSetTransformManager;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteCollectionInformationSetTransformManagerExecute;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteCollectionInformationSetTransformManagerPrestage;
import eu.larkc.core.pluginManager.distributed.GAT.RemoteCollectionInformationSetTransformManagerPoststage;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalQueryTransformManager;
import eu.larkc.core.pluginManager.local.LocalReasonManager;
import eu.larkc.core.pluginManager.local.LocalReasonManagerFromCollectionInformationSetManager;
import eu.larkc.core.pluginManager.local.LocalSelectFromCollectionInformationSetManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.pluginManager.local.queue.QueueListener;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.decide.Decider;

import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;

import eu.larkc.core.gatresource.GATResource;

/**
 * alpha Urban Decider which, on the basis of the input query, 
 * tries to find a suitable destination (monument or event) 
 * or calculates a suitable path to a destination
 * 
 * @author Daniele Dell'Aglio, Emanuele Della Valle, Irene Celino, Alexey Chepstov, Matthias Assel
 * 
 */
public class UrbanLarKCEventDecider implements Decider {
	private static Logger logger = LoggerFactory.getLogger(UrbanLarKCEventDecider.class);
	
	public UrbanLarKCEventDecider(){
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

	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		throw new UnsupportedOperationException();
	}

	public RdfGraph sparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		throw new UnsupportedOperationException();
	}

	public RdfGraph sparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		throw new UnsupportedOperationException();
	}

	// execution of SPARQL Select queries 
	public VariableBinding sparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		logger.debug("[DEBUG]: Nr of processors: {}", Runtime.getRuntime().availableProcessors());
		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastOutputQueue=null;

		// processes the input query in order to...
		String inputQuery = theQuery.toString();
		int start = inputQuery.indexOf("FILTER");
		byte[] arr = inputQuery.getBytes();
		int par = 1;
		int end = start+7;
		while(par>0){
			if((char)arr[end]==')')
				par--;
			if((char)arr[end]=='(')
				par++;
			end++;
		}
		String query = inputQuery.substring(0, inputQuery.indexOf("RE{")+3) +
		inputQuery.substring(start, end+1)+"}";
		
		//...extract the subquery to be sent to the identifier
		logger.debug("Input query: {"+query+"}");
		//logger.info("Input query: {}", query);
		SPARQLQuery inputTransformQuery = new SPARQLQueryImpl(query);
		query = inputQuery.substring(0, start)+" "+inputQuery.substring(end+1);
		//...extract the subquery to be sent to the reasoner
		//logger.info("Output query: {}", query);
		logger.debug("Input query: {"+query+"}");
		SPARQLQuery reasonerQuery = new SPARQLQueryImpl(query);
		
		QueryTransformer qt;
		try {
			qt = (QueryTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.SparqlToCityQueryTransformer"));
		
		
		// setup the input queue
		Queue<Query> queryTransformerInputQueue = new Queue<Query>();

		Queue<Query> queryTransformerOutputQueue = new Queue<Query>();
		LocalQueryTransformManager queryTransformer = new LocalQueryTransformManager(qt, queryTransformerInputQueue, queryTransformerOutputQueue);
//		queryTransformerInputQueue.put(inputTransformQuery);
		queryTransformerInputQueue.put(theQuery);
		queryTransformerInputQueue.put(null);
		queryTransformer.start();
		
		Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.ubl.EventIdentifier"));
		// put the EventIdentifier in the queue and pass it the query
		Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
		LocalIdentifyManager identify = new LocalIdentifyManager(
				i, queryTransformerOutputQueue, identifyOutputQueue);
		identify.setPrevious(queryTransformer);
		identify.start();

		InformationSetTransformer x2r = (InformationSetTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.XML2RDFTransformer"));

		// put the LocalCollectionInformationSetTransformManager in the queue and pass it the output of the identifier
		Queue<String> prestage_transformerOutputQueue = new Queue<String>();
		Queue<String> execute_transformerOutputQueue = new Queue<String>();
		Queue<Collection<InformationSet>> transformerOutputQueue = new Queue<Collection<InformationSet>>(); // = poststage transformer
														    // for distributed run

		//this plug-in is also available as distributed
		PluginManager transformer;
		PluginManager prestage_transformer;
		PluginManager execute_transformer;

		boolean DISTRIBUTED_EXECUTION_ENABLE=true;
		if (DISTRIBUTED_EXECUTION_ENABLE==false)
		{
			transformer = 
				new LocalCollectionInformationSetTransformManager(
					x2r, identifyOutputQueue, transformerOutputQueue);
			transformer.setPrevious(identify);
			transformer.start();
		}
		else
		{
			//Resource Description 1 - local machine
			//String ResourceURI="localhost";
			//String FileAdaptor="local";
			//String Broker="local";
			//String LarKC_Location=System.getProperty("user.dir");//the current working dir containing the LarKC installation
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
			String InputDataID="input1";
			String OutputDataID="output1";
			String JavaDir="/usr/bin";
			String JavaArgs="-Xmx12000M";
			
			//Resource Description 3 - machine accessible via ssh
			//String ResourceURI="frbw.dgrid.hlrs.de";
			//String FileAdaptor="CommandlineSsh";
			//String Broker="CommandlineSsh";
			//String LarKC_Location="/nfs/HOME/HLRS/hlrs/hpcochep/LarKC/LarKC";
			//String WorkDir="/nfs/HOME/HLRS/hlrs/hpcochep/LarKC/LarKC/Data";
			//String InputDataID="input3";
			//String OutputDataID="output3";

			
			GATResource resource1 = new GATResource(ResourceURI, FileAdaptor, Broker, LarKC_Location, WorkDir, JavaDir, JavaArgs);

			//Step1. Data prestaging
			prestage_transformer = 
				new RemoteCollectionInformationSetTransformManagerPrestage(
					x2r, identifyOutputQueue, prestage_transformerOutputQueue, resource1, InputDataID);
			prestage_transformer.setPrevious(identify);
			prestage_transformer.start();
			
			//Step2. Plug-in run
			execute_transformer = 
				new RemoteCollectionInformationSetTransformManagerExecute(
					x2r, prestage_transformerOutputQueue, execute_transformerOutputQueue, resource1, OutputDataID);
			execute_transformer.setPrevious(prestage_transformer);
			execute_transformer.start();
			
			//Step3. Data poststaging
			transformer = 
				new RemoteCollectionInformationSetTransformManagerPoststage(
					x2r, execute_transformerOutputQueue, transformerOutputQueue, resource1, OutputDataID);
			transformer.setPrevious(execute_transformer);
			transformer.start();
			
			
			

		}

		Selecter s = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
		// put the GrowingDataSetSelecter in the queue and pass it the output of the transformer
		Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
		LocalSelectFromCollectionInformationSetManager select = 
			new LocalSelectFromCollectionInformationSetManager(
				s, transformerOutputQueue, selectionOutputQueue);
		select.setPrevious(transformer);
		select.start();

		Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
		// put the SparqlQueryEvaluationReasoner in the queue and pass it the output of the selecter
		Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
		LocalReasonManager reason = new LocalReasonManager(
				r, 
				reasonerQuery, 
				selectionOutputQueue,
				reasonOutputQueue);
		reason.setPrevious(select);
		reason.start();

		lastOutputQueue = reasonOutputQueue;

		reason.accept(PluginManager.Message.NEXT);
		lastOutputQueue.addListener(new QueueListenerImpl(reason) {
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
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		logger.info("Elapsed Time: {}"+elapsedTime);
		return (VariableBinding) is;
	}
	
	// supporting method
	private InformationSet getLastResult(Queue<InformationSet> queue) {
    	VariableBinding result = (VariableBinding) queue.take();
		do {
		} while (queue.take() != null);
		return result;
	}
	
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}
	

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private abstract class QueueListenerImpl implements QueueListener<InformationSet> {
		protected PluginManager lastPluginManager;
		
		QueueListenerImpl(PluginManager lastPluginManager) {
			this.lastPluginManager=lastPluginManager;
		}
		
		public abstract void elementAdded(InformationSet is);
	}
}
