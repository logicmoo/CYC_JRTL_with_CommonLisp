package eu.larkc.plugin.decider;

import java.util.Collection;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalCollectionInformationSetTransformManager;
import eu.larkc.core.pluginManager.local.LocalIdentifyManager;
import eu.larkc.core.pluginManager.local.LocalInformationSetTransformManager;
import eu.larkc.core.pluginManager.local.LocalReasonManager;
import eu.larkc.core.pluginManager.local.LocalReasonManagerFromCollectionInformationSetManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.pluginManager.local.queue.QueueListener;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.Context;


public class TrafficPredictorDecider implements Decider {
	private static Logger logger = LoggerFactory.getLogger(TrafficPredictorDecider.class);
	
	public TrafficPredictorDecider(){
		super();
		Thread bt = new BatchTimeDataLoader();
		bt.start();
	}
	
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		return this.trafficDataUpdater2(theQuery);
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		return DataFactory.INSTANCE.createRdfStoreConnection().executeConstruct(theQuery);
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		return DataFactory.INSTANCE.createRdfStoreConnection().executeConstruct(theQuery);
	}

	private boolean isPathQuery(SPARQLQuery theQuery){
		if(theQuery.toString().contains("?debug"))
			return false;
		return true;
	}
	
	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		logger.info("Decider invoked for a SELECT query");
		if(!isPathQuery(theQuery)){
			InformationSet is = DataFactory.INSTANCE.createRdfStoreConnection().executeSelect(theQuery);
			logger.info("Querying the data layer...");
			return (VariableBinding) is;
		}
		
		VariableBinding check = DataFactory.INSTANCE.createRdfStoreConnection().executeSelect(theQuery);
		if(check.iterator().hasNext()){
			logger.info("Data Layer contains the result, it's not necessary to invoke the workflow...");
			return check;
		}
		
		
		logger.debug("Nr of processors: {}", Runtime.getRuntime().availableProcessors());
		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastOutputQueue=null;

		// processes the input query in order to...
		try {
			Queue<Query> queryTransformerInputQueue = new Queue<Query>();
			queryTransformerInputQueue.put(theQuery);
			queryTransformerInputQueue.put(null);
		
			Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.PathFindingIdentifier"));
			Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
			LocalIdentifyManager identify = new LocalIdentifyManager(i, queryTransformerInputQueue, identifyOutputQueue);
			identify.start();

			Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.urbancomputing.PathFindingReasoner"));
			Queue reasonOutputQueue = new Queue();
			PluginManager reason = new LocalReasonManagerFromCollectionInformationSetManager(
					r, 
					new SPARQLQueryImpl("CONSTRUCT{?s ?p ?o} WHERE {?s ?p ?o} LIMIT 10"), 
					identifyOutputQueue,
					reasonOutputQueue);
			reason.setPrevious(identify);
			reason.start();

			Reasoner tpr = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.urbancomputing.TrafficPredictorReasoner"));
			Queue<InformationSet> tprOutputQueue = new Queue<InformationSet>();
			PluginManager tpreason = new LocalReasonManager(
					tpr, 
					theQuery, 
					reasonOutputQueue,
					tprOutputQueue);
			tpreason.setPrevious(reason);
			tpreason.start();

			lastOutputQueue = tprOutputQueue;
	
			tpreason.accept(PluginManager.Message.NEXT);
			lastOutputQueue.addListener(new QueueListenerImpl(tpreason) {
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
		logger.info("Elapsed Time: {}",elapsedTime);
		return (VariableBinding) is;
	}
	
	private BooleanInformationSet trafficDataUpdater2(SPARQLQuery theQuery){
		logger.info("invoked the traffic data updater workflow");

		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastOutputQueue=null;
		try{
			Queue<InformationSet> queryTransformerInputQueue = new Queue<InformationSet>();
			queryTransformerInputQueue.put(DataFactory.INSTANCE.createRdfStoreConnection().createRdfGraph(new URIImpl("http://larkc.cefriel.it/pathfinding/map")));
			queryTransformerInputQueue.put(null);
	
			InformationSetTransformer ist = (InformationSetTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.MilanTrafficDataTransformer"));
			Queue<InformationSet> transformerOutputQueue = new Queue<InformationSet>();
			PluginManager transform = new LocalInformationSetTransformManager(ist, queryTransformerInputQueue, transformerOutputQueue);
			transform.start();
			
			lastOutputQueue = transformerOutputQueue;
			
			transform.accept(PluginManager.Message.NEXT);
			lastOutputQueue.addListener(new QueueListenerImpl(transform) {
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
		if (!(is instanceof BooleanInformationSet)){
			is = new BooleanInformationSetImpl(true);
		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		logger.info("Elapsed Time: {}",elapsedTime);
		return (BooleanInformationSet) is;	
	}
	
	private BooleanInformationSet trafficDataUpdater(SPARQLQuery theQuery){
		logger.info("invoked the traffic data updater workflow");

		long startTime = System.currentTimeMillis();
		
		Queue<InformationSet> lastOutputQueue=null;

		// processes the input query in order to...
		try {
			Queue<Query> queryIdentifierInputQueue = new Queue<Query>();
			queryIdentifierInputQueue.put(theQuery);
			queryIdentifierInputQueue.put(null);
		
			Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.urbancomputing.PathFindingIdentifier"));
			Queue<Collection<InformationSet>> identifyOutputQueue = new Queue<Collection<InformationSet>>();
			LocalIdentifyManager identify = new LocalIdentifyManager(i, queryIdentifierInputQueue, identifyOutputQueue);
			identify.start();

			InformationSetTransformer t = (InformationSetTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.urbancomputing.ubl.MilanTrafficDataTransformer"));
			Queue<Collection<InformationSet>> transformOutputQueue = new Queue<Collection<InformationSet>>();
			PluginManager transform = new LocalCollectionInformationSetTransformManager(t, identifyOutputQueue, transformOutputQueue);
			transform.setPrevious(identify);
			transform.start();

			Reasoner r = (Reasoner)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
			Queue<InformationSet> reasonOutputQueue = new Queue<InformationSet>();
			PluginManager reason = new LocalReasonManagerFromCollectionInformationSetManager(
					r, 
					theQuery, 
					transformOutputQueue,
					reasonOutputQueue);
			reason.setPrevious(transform);
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
		if (!(is instanceof BooleanInformationSet)){
			return null;
		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		logger.info("Elapsed Time: {}",elapsedTime);
		return (BooleanInformationSet) is;
	}

	private InformationSet getLastResult(Queue<InformationSet> queue) {
    	InformationSet result = queue.take();
//		VariableBinding result = (VariableBinding) queue.take();
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
		return new URIImpl("urn:eu.larkc.plugin.decider.TrafficPredicotrDecider");
	}

	@Override
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
