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
package eu.larkc.plugin.decider.simpleanytimedecider;

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
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalQueryTransformManager;
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
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.plugin.Context;

public class SimpleAnytimeDecider implements Decider {

	private PluginManager lastPluginManager;
	private Queue<InformationSet> lastOutputQueue;

	private boolean mFinished = false;
	
	private QueryTransformer transformer;
	private Identifier identifier;
	private Selecter selecter;
	private Reasoner reasoner;

	public SimpleAnytimeDecider() {
	}
	
	public SimpleAnytimeDecider(
					QueryTransformer transformer,
					Identifier identifier,
					Selecter selecter,
					Reasoner reasoner
					) {
		this.transformer = transformer;
		this.identifier = identifier;
		this.selecter = selecter;
		this.reasoner = reasoner;
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

	// Synchronous execution
	
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		buildAndStartPipeline(theQuery, theQoSParameters);
		InformationSet is = getLastResult();
		if (!(is instanceof BooleanInformationSet)){
			return null;
		}
		return (BooleanInformationSet) is;
	}

	public RdfGraph sparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		buildAndStartPipeline(theQuery, theQoSParameters);
		InformationSet is = getLastResult();
		if (!(is instanceof RdfGraph)){
			return null;
		}
		return (RdfGraph) is;
	}

	public RdfGraph sparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		buildAndStartPipeline(theQuery, theQoSParameters);
		InformationSet is = getLastResult();
		if (!(is instanceof RdfGraph)){
			return null;
		}
		return (RdfGraph) is;
	}

	public VariableBinding sparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		buildAndStartPipeline(theQuery, theQoSParameters);
		InformationSet is = getLastResult();
		if (!(is instanceof VariableBinding)){
			return null;
		}
		return (VariableBinding) is;
	}
	
    private InformationSet getLastResult() {
    	VariableBinding result = (VariableBinding) lastOutputQueue.take();
		do {
		} while (lastOutputQueue.take() != null);
		mFinished = true;
		return result;
	}

	//  Asynchronous execution
	
	public void startASyncSparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters){
		buildAndStartPipeline(theQuery, theQoSParameters);
	}

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

    public void stopASyncSparqlSelect(){
    	lastPluginManager.accept(PluginManager.Message.STOP);
    }
    
    public void startASyncSparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	buildAndStartPipeline(theQuery, theQoSParameters);
    }

    public SetOfStatements getNextSparqlConstructResult(){
    	InformationSet is = getNextResult();
    	if (is == null){
    		return null;
    	}
		if (!(is instanceof SetOfStatements)){
			return null;
		}
		return (SetOfStatements) is;
    }

    public void stopASyncSparqlConstruct(){
    	lastPluginManager.accept(PluginManager.Message.STOP);
    }
    
    public void startASyncSparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	buildAndStartPipeline(theQuery, theQoSParameters);
    }
    
    public SetOfStatements getNextSparqlDescribeResult(){
    	InformationSet is = getNextResult();
    	if (is == null){
    		return null;
    	}
		if (!(is instanceof SetOfStatements)){
			return null;
		}
		return (SetOfStatements) is;
    }

    public void stopASyncSparqlDescribe(){
    	lastPluginManager.accept(PluginManager.Message.STOP);
    }
    
    public void startASyncSparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters){
    	buildAndStartPipeline(theQuery, theQoSParameters);
    }

    public BooleanInformationSet getNextSparqlAskResult(){
    	InformationSet is = getNextResult();
    	if (is == null){
    		return null;
    	}
		if (!(is instanceof BooleanInformationSet)){
			return null;
		}
		return (BooleanInformationSet) is;
    }

    public void stopASyncSparqlAsk(){
		lastPluginManager.accept(PluginManager.Message.STOP);
    } 
    
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
	
    // Build the pipeline
    
	private void buildAndStartPipeline(SPARQLQuery theQuery, QoSParameters theQoSParameters) {
		Logger log = LoggerFactory.getLogger(SimpleAnytimeDecider.class);
		Queue<Query> queryTransformerInputQueue = new Queue<Query>();
		Queue<Query> queryTransformerOutputQueue = new Queue<Query>();
		
		QueryTransformer qt = transformer;
		if( qt == null )
		{
			log.info("Initialization of a Transformer");
			//qt = new SPARQLToTriplePatternQueryTransformer();
			try {
				qt = (QueryTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer"));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else
		{
			log.info("Transformer is already initialized");
		}
		LocalQueryTransformManager queryTransformer = new LocalQueryTransformManager(qt, queryTransformerInputQueue, queryTransformerOutputQueue);
		queryTransformerInputQueue.put(theQuery);
		queryTransformerInputQueue.put(null);
		queryTransformer.start();
	
		Identifier id = identifier;
		if( id == null ) {
			log.info("Initialization of an Indentifier");
			try {
				id = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier"));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
		LocalIdentifyManager identify = new LocalIdentifyManager(id, queryTransformerOutputQueue, identifyOutputQueue);
		identify.setPrevious(queryTransformer);
		identify.start();

		Selecter sel = selecter;
		if( sel == null )
			try {
				sel =  (Selecter)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Queue<SetOfStatements> selectionOutputQueue = new Queue<SetOfStatements>();
		LocalSelectFromCollectionInformationSetManager select = new LocalSelectFromCollectionInformationSetManager(sel, identifyOutputQueue, selectionOutputQueue);
		select.setPrevious(identify);
		select.start();

		Reasoner res = reasoner;
		if( res == null )
			try {
				res = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
	}

	// General stuff

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public MetaData getMetaData() {
		// TODO Auto-generated method stub
		return null;
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setInputQuery(Query theQuery) {
		// TODO Auto-generated method stub

	}
}
