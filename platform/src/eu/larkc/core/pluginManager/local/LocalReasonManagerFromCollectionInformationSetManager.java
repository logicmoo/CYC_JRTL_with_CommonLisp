package eu.larkc.core.pluginManager.local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openrdf.model.URI;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

/**
 * LocalReasonManager is a LocalPluginManager for Reasoner plugins
 * 
 * It will generate an InformationSet on the output queue for each SetOfStatements that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalReasonManagerFromCollectionInformationSetManager extends LocalPluginManager <Collection<InformationSet>, InformationSet> {
	
	/**
	 * The Reasoner plugin to be managed
	 */
	private final Reasoner mReasoner;
	
	/**
	 * The Query to executed over each of the input SetOfStatements
	 */
	private final Query mQuery;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param reasoner The Reasoner plugin to be managed
	 * @param query The Query to executed over each of the input SetOfStatements
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalReasonManagerFromCollectionInformationSetManager(Reasoner reasoner, Query query, Queue<Collection<InformationSet>> inputQueue, Queue<InformationSet> outputQueue) {
		super(inputQueue, outputQueue);
		mReasoner = reasoner;
		mQuery = query;
		super.setThread(new ReasonThread());
	}

	/**
	 * The Thread within which the Reasoner Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class ReasonThread extends Thread {
		ReasonThread() {
			super("Reason");
		}

		public void run() {
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					Collection<InformationSet> informationSets = getNextInput();

					if (informationSets == null) {
						putNextOutput(null);
						break;
					}
					
					SetOfStatements statements = null;
					if (informationSets.size() == 1 && informationSets.iterator().next() instanceof SetOfStatements){
						statements = (SetOfStatements) informationSets.iterator().next();
					}
					else{
						List <URI> uris = new ArrayList <URI> ();
						for (InformationSet is : informationSets){
							if (is instanceof RdfGraph) {
								RdfGraph graph = (RdfGraph) is;
						        uris.add(graph.getName());
							}
						}
						DataSet dataset = DataFactory.INSTANCE.createRdfStoreConnection().createDataSet(uris, new ArrayList <URI>());
	
						if (dataset.getDefaultGraphs().isEmpty() && dataset.getNamedGraphs().isEmpty()){
							putNextOutput(null);
							break;
						}
						statements = dataset;
					}

					SPARQLQuery sparqlQuery = (SPARQLQuery) mQuery;

					InformationSet result = null;
					if (sparqlQuery.isSelect()) {
						result = mReasoner.sparqlSelect(sparqlQuery, statements, new Contract() {}, new Context() {});
					} 
					else if (sparqlQuery.isConstruct()) {
						result = mReasoner.sparqlConstruct(sparqlQuery, statements, new Contract() {}, new Context() {});
					} 
					else if (sparqlQuery.isDescribe()) {
						result = mReasoner.sparqlDescribe(sparqlQuery, statements, new Contract() {}, new Context() {});
					} 
					else if (sparqlQuery.isAsk()) {
						result = mReasoner.sparqlAsk(sparqlQuery, statements, new Contract() {}, new Context() {});
					}

					putNextOutput(result);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}
}
