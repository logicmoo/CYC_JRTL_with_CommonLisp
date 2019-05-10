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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.metadata.PluginRegistry;
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
 * @author Daniele Dell'Aglio, Emanuele Della Valle, Irene Celino
 * 
 */
public class AlphaUrbanLarkcDecider implements Decider {
	//private static Logger logger = LoggerFactory.getLogger(AlphaUrbanLarkcDecider.class);
	private static Logger logger = LoggerFactory.getLogger(AlphaUrbanLarkcDecider.class);
	
//	private PluginManager lastPluginManager;
//	private Queue<InformationSet> lastOutputQueue;
	
//	private boolean mFinished = false;
	
	public AlphaUrbanLarkcDecider(){
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

	// main method launched when a query arrives
	public Queue<InformationSet> buildAndStartPipeline(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		Queue<InformationSet> ret = null;
		
		// on the basis of the query, it selects the correct pipeline to be invoked
		int sw = selectPipeline(theQuery);
		
		switch(sw){
		case 1:
			// invocation of the path-finding pipeline
			logger.debug("--- invocation of the path-finding pipeline ---");
			ret=pipeline1a(theQuery, theQoSParameters);
			break;
		case 2:
			// invocation of the monument destination selection
			logger.debug("--- invocation of the monument pipeline ---");
			ret=monumentpipeline(theQuery, theQoSParameters);
			break;
		case 3:
			// invocation of the event destination selection
			logger.debug("--- invocation of the event pipeline ---");
			ret=eventpipeline(theQuery, theQoSParameters);
			break;
		case 4:
			logger.debug("--- invocation of the new monument pipeline ---");
			ret=newmonumentpipeline(theQuery, theQoSParameters);
			break;
		default:;
		}
		return ret;
	}
	
    // method that checks the query to identify which pipeline to run
	private int selectPipeline(SPARQLQuery theQuery){
		//takes the input query
		String inputQuery = theQuery.toString();
		//if it contains a reference to the Milano topology data...
		if(inputQuery.indexOf("http://www.linkingurbandata.org/onto/ama/")>=0)
			//... the correct pipeline is the pathfinding one
			return 1;
		//if it contains a reference to DBpedia...
		if(inputQuery.indexOf("http://dbpedia.org/")>=0)
			//... the correct pipeline is the monument-related one
			if(inputQuery.indexOf("UNION")>=0)
				return 2;
			else
				return 4;
		//if it contains a reference to calendar entities...
		if(inputQuery.indexOf("http://www.w3.org/2002/12/cal/icaltzd#")>=0)
			//... the correct pipeline is the event-related one
			return 3;
		return 0;
	}

	//---------------------------------------------------------------------------
	
	// PATHFINDING pipeline
	private Queue<InformationSet> pipeline1a(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		Queue<InformationSet> lastOutputQueue=null;
		
		// configuration parameter: where the Milano roads graph is
		//		Config.setRemoteGraphLoaderIdentifierURI("http://localhost:8112/ama-xml-milano_graph.rdf");

		// setup the input queue
		Queue<Query> identifierInputQueue = new Queue<Query>();
		identifierInputQueue.put(theQuery);
		identifierInputQueue.put(null);

		// put the RemoteGraphLoaderIdentifier in the queue and pass it the query
		try {

			//************************ Identifier ************************\\
			Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.ubl.RemoteGraphLoaderIdentifier"));

			Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
			PluginManager identify = new LocalIdentifyManager(
					/*new RemoteGraphLoaderIdentifier(MILANO_GRAPH_LOCATION)*/
					i, identifierInputQueue, identifyOutputQueue);
			identify.start();

			//************************ Selecter ************************\\
/*	
 * 			Selecter ss = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));

			// put the GrowingDataSetSelecter in the queue and pass it the output of the identifier
			Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
			LocalSelectFromCollectionInformationSetManager select = 
				new LocalSelectFromCollectionInformationSetManager(
						ss, identifyOutputQueue, selectionOutputQueue);
			select.setPrevious(identify);
			select.start();
*/
			//************************ Reasoner ************************\\
			Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.urbancomputing.ubl.OpResPathFinderReasoner"));

			// put the OpResPathFinderReasoner in the queue and pass it the output of the selecter
			Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
//			PluginManager reason = new LocalReasonManager(
//					r, theQuery, selectionOutputQueue, reasonOutputQueue);
			PluginManager reason = new LocalReasonManagerFromCollectionInformationSetManager(
					r, theQuery, identifyOutputQueue, reasonOutputQueue);
//			reason.setPrevious(select);
			reason.setPrevious(identify);
			reason.start();

			lastOutputQueue = reasonOutputQueue;

			reason.accept(PluginManager.Message.NEXT);
			lastOutputQueue.addListener(new QueueListenerImpl(reason) {
				@Override
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
		
		return lastOutputQueue;
	}
	
	//--------------------------------------------------------------
	
	private Queue<InformationSet> eventpipeline(SPARQLQuery theQuery, QoSParameters theQoSParameters){
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
//		"?l addr:localityName \"Milan\". "+
		inputQuery.substring(start, end+1)+"}";
		
		//...extract the subquery to be sent to the identifier
		logger.info("Input query: {"+query+"}");
		//logger.info("Input query: {}", query);
		SPARQLQuery inputTransformQuery = new SPARQLQueryImpl(query);
		query = inputQuery.substring(0, start)+" "+inputQuery.substring(end+1);
		//...extract the subquery to be sent to the reasoner
		//logger.info("Output query: {}", query);
		logger.info("Input query: {"+query+"}");
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

		boolean DISTRIBUTED_EXECUTION_ENABLE=false;
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
			//String LarKC_Location="/home/hpcochep/Development/LarKC/LarKC-trunk/RemoteNode/LarKC";
			//String WorkDir="/home/hpcochep/Development/LarKC/LarKC-trunk/RemoteNode/Data";
			//String InputDataID="input1";
			//String OutputDataID="output1";
			//String JavaDir="/usr/bin";
			
			//Resource Description 2 - machine accessible via Globus grid middleware
			String ResourceURI="gridway.dgrid.hlrs.de";
			String FileAdaptor="gt4gridftp";
			String Broker="wsgt4new";
			String LarKC_Location="/nfs/HOME/HLRS/dgrid/stbw0250/LarKC_remote";
			String WorkDir="/nfs/HOME/HLRS/dgrid/stbw0250/LarKC_remote/Data";
			String InputDataID="input2";
			String OutputDataID="output2";
			String JavaDir="/usr/bin";

			//Resource Description 3 - machine accessible via ssh
			//String ResourceURI="frbw.dgrid.hlrs.de";
			//String FileAdaptor="CommandlineSsh";
			//String Broker="CommandlineSsh";
			//String LarKC_Location="/nfs/HOME/HLRS/hlrs/hpcochep/LarKC/LarKC";
			//String WorkDir="/nfs/HOME/HLRS/hlrs/hpcochep/LarKC/LarKC/Data";
			//String InputDataID="input3";
			//String OutputDataID="output3";

			
			GATResource resource1 = new GATResource(ResourceURI, FileAdaptor, Broker, LarKC_Location, WorkDir, JavaDir);

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
		return lastOutputQueue;
	}
	
	//--------------------------------------------------------------
	
	private Queue<InformationSet> newmonumentpipeline(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		Queue<InformationSet> lastOutputQueue=null;
		try {
			Queue<Query> queryTransformerInputQueue = new Queue<Query>();
			queryTransformerInputQueue.put(theQuery);
			queryTransformerInputQueue.put(null);

			//*************************** Query Transformer *************************\\
			Queue<Query> queryTransformerOutputQueue = new Queue<Query>();

			QueryTransformer qt = (QueryTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.Select2ConstructQueryTransformer"));
			PluginManager qtm = new LocalQueryTransformManager(qt, queryTransformerInputQueue, queryTransformerOutputQueue);
			qtm.start();
			
			//***************************** Identifier ***************************\\
			Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();

			Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.recsys.SPARQLEndpointIdentifier"));
			PluginManager identify = new LocalIdentifyManager(i, queryTransformerOutputQueue, identifyOutputQueue);
			identify.setPrevious(qtm);
			identify.start();

			//***************************** Selecter ***************************\\
			Queue<SetOfStatements> selecterOutputQueue = new Queue<SetOfStatements>();

			Selecter s = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
			PluginManager select = new LocalSelectFromCollectionInformationSetManager(s, identifyOutputQueue, selecterOutputQueue);
			select.setPrevious(identify);
			select.start();

			//***************************** Reasoner ***************************\\
			Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();

			Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
//			PluginManager reason = new LocalReasonManagerFromCollectionInformationSetManager(r, theQuery, identifyOutputQueue, reasonOutputQueue);
			PluginManager reason = new LocalReasonManager(r, theQuery, selecterOutputQueue, reasonOutputQueue);
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
		return lastOutputQueue;
	}
	
	// MONUMENT DESTINATION SELECTION pipeline
	
	private Queue<InformationSet> monumentpipeline(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		Queue<InformationSet> lastOutputQueue=null;
		
		Queue<Query> identifierInputQueue = new Queue<Query>();
		Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
		identifierInputQueue.put(theQuery);
		identifierInputQueue.put(null);

		// put the RemoteGraphLoaderIdentifier in the queue and pass it the query
//		Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
		try {
			Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.ubl.UrbanSindiceIdentifier"));

			LocalIdentifyManager identify = new LocalIdentifyManager(/*new RemoteGraphLoaderIdentifier(MILANO_GRAPH_LOCATION)*/i, identifierInputQueue, identifyOutputQueue);
			identify.start();

			Selecter ss = (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));

			// put the GrowingDataSetSelecter in the queue and pass it the output of the identifier
			Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
			LocalSelectFromCollectionInformationSetManager select = 
				new LocalSelectFromCollectionInformationSetManager(
						ss, identifyOutputQueue, selectionOutputQueue);
			select.setPrevious(identify);
			select.start();

			SPARQLQuery queryWithoutUnion = getQueryWithoutUnionPattern(theQuery);
			Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));

			// put the OpResPathFinderReasoner in the queue and pass it the output of the selecter
			Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
			LocalReasonManager reason = new LocalReasonManager(
					r, queryWithoutUnion, selectionOutputQueue, reasonOutputQueue);
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
		return lastOutputQueue;
		
/*		
		//TODO check if it works!!!!
		
		// setup the input and output queues
		Queue<Query> identifierInputQueue = new Queue<Query>();
		Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
		identifierInputQueue.put(theQuery);
		identifierInputQueue.put(null);

		// put the UrbanSindiceIdentifier in the queue and pass it the query (even if it doesn't use it)
		Identifier id = new UrbanSindiceIdentifier();
		LocalIdentifyManager identify = new LocalIdentifyManager(
				id, identifierInputQueue, identifyOutputQueue);
		identify.start();

		// put the GrowingDataSetSelecter in the queue and pass it the output of the identifier
		Selecter sel = new GrowingDataSetSelecter();
		Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
		LocalSelectFromCollectionInformationSetManager select = 
			new LocalSelectFromCollectionInformationSetManager(
					sel, identifyOutputQueue, selectionOutputQueue);
		select.setPrevious(identify);
		select.start();
		
		// passes the query without the UNION part
		SPARQLQuery queryWithoutUnion = getQueryWithoutUnionPattern(theQuery);

		// put the SparqlQueryEvaluationReasoner in the queue and pass it the output of the selecter
		Reasoner res = new SparqlQueryEvaluationReasoner();
		Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
		LocalReasonManagerFromSetOfStatementsManager reason = 
			new LocalReasonManagerFromSetOfStatementsManager(
					res, queryWithoutUnion, selectionOutputQueue, reasonOutputQueue);
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
*/	}
	
	private SPARQLQuery getQueryWithoutUnionPattern(SPARQLQuery theQuery) {
		// input query
		Logger log = LoggerFactory.getLogger(AlphaUrbanLarkcDecider.class);
		String inputQuery = theQuery.toString();
		int start = inputQuery.indexOf("{{");
		int end = inputQuery.indexOf("}}")+2;
		if(start>0 && end>0){
			String beginOutputQuery = inputQuery.substring(0, start);
			String endOutputQuery = inputQuery.substring(end, inputQuery.length());
			String outputQuery = beginOutputQuery+endOutputQuery;
			log.info("reduced query: "+outputQuery);
			SPARQLQuery newQuery = new SPARQLQueryImpl(outputQuery);
			return newQuery;
		}else{
			System.err.println("PROBLEMA!!!!");
			return theQuery;			
		}
			
	}

	//-------------------------------------
	// other methods
	
	// Synchronous execution
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
		Logger log = LoggerFactory.getLogger(AlphaUrbanLarkcDecider.class);
/*		System.out.println("Composing pipeline ...");
		Pipeline pipeline = new Pipeline();
		pipeline.addPlugIn(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.SparqlToCityQueryTransformer"));
		pipeline.addPlugIn(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.ubl.EventIdentifier"));
		pipeline.addPlugIn(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.XML2RDFTransformer"));
		pipeline.addPlugIn(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
		pipeline.addPlugIn(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
		
		System.out.println("Starting pipeline ...");
		try {
			pipeline.start(theQuery);
		} catch (Exception e) {
			logger.error("An error has occoured: ", e);
		}
		return (VariableBinding)pipeline.take();
*/


		log.info("[DEBUG]: Nr of proccessors: "+Runtime.getRuntime().availableProcessors());
		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastResult = buildAndStartPipeline(theQuery, theQoSParameters);
		InformationSet is = getLastResult(lastResult);
		if (!(is instanceof VariableBinding)){
			return null;
		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		log.info("[DEBUG]: Elapsed Time: "+elapsedTime);
		return (VariableBinding) is;
	}
	
	// supporting method
	private InformationSet getLastResult(Queue<InformationSet> queue) {
    	VariableBinding result = (VariableBinding) queue.take();
		do {
		} while (queue.take() != null);
//		mFinished = true;
		return result;
	}
	
	//  Asynchronous execution
	public void startASyncSparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		buildAndStartPipeline(theQuery, theQoSParameters);
	}
/*	
	// (unused??) supporting method
	public VariableBinding getNextSparqlSelectResult(){
    	InformationSet is = getNextResult();
    	if (is == null){
    		return null;
    	}
		if (!(is instanceof VariableBinding)){
			return null;
		}
		return (VariableBinding) is;
    }

	// (unused??) supporting method
	public void stopASyncSparqlSelect(){
    	lastPluginManager.accept(PluginManager.Message.STOP);
    }
    
	// (unused??) supporting method
	public void startASyncSparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	throw new UnsupportedOperationException();
    }

	// (unused??) supporting method
	public SetOfStatements getNextSparqlConstructResult(){
    	throw new UnsupportedOperationException();
    }

	// (unused??) supporting method
	public void stopASyncSparqlConstruct(){
    	throw new UnsupportedOperationException();
    }
    
	// (unused??) supporting method
	public void startASyncSparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	throw new UnsupportedOperationException();
    }
    
	// (unused??) supporting method
	public SetOfStatements getNextSparqlDescribeResult(){
    	throw new UnsupportedOperationException();
    }

	// (unused??) supporting method
	public void stopASyncSparqlDescribe(){
    	throw new UnsupportedOperationException();
    }
    
	// (unused??) supporting method
	public void startASyncSparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	throw new UnsupportedOperationException();
    }

	// (unused??) supporting method
	public BooleanInformationSet getNextSparqlAskResult(){
    	throw new UnsupportedOperationException();
    }

	// (unused??) supporting method
	public void stopASyncSparqlAsk(){
    	throw new UnsupportedOperationException();
    } 
    
	// supporting method
    private InformationSet getNextResult() {
		InformationSet result;
		if (mFinished) {
			result = null;
		} else {
			result = lastOutputQueue.take();
		}

		if (result == null) {
			mFinished = true;
		}
		return result;
	}
*/    



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
