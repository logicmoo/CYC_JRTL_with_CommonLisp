package eu.larkc.plugin.identify.urbancomputing;

import it.cefriel.larkc.urbancomputing.ontologies.DijkstraPathFindingReasonerVocabulary;
import it.cefriel.larkc.urbancomputing.ontologies.UrbanPathFindingVocabulary;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.time.DateFormatUtils;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.model.vocabulary.XMLSchema;
import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.identify.urbancomputing.QueryAnalyzer.Policy;

public class PathFindingIdentifier implements Identifier {
	private static final Logger logger = LoggerFactory.getLogger(PathFindingIdentifier.class);
	private static final String pathFindingPrefix= "http://larkc.cefriel.it/ontologies/oprespathfindingreasoner#";

	//only first time when called, return results (anytime b.)
	private boolean once = false;

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

	public Collection<InformationSet> identify(Query theQuery, Contract contract, Context context) {
		logger.info("invoked");
		if (once) { return null; }
		once = true;

		if(((SPARQLQuery)theQuery).isAsk()){
			logger.debug("The input query is an ASK!");
			Set<InformationSet> ret = new HashSet<InformationSet>();
			ret.add(DataFactory.INSTANCE.createRdfStoreConnection().createRdfGraph(new URIImpl("http://larkc.cefriel.it/pathfinding/map")));
			return ret;
		}

		//define the graph involved in this workflow
		long millis = System.currentTimeMillis();
		String strPath = UrbanPathFindingVocabulary.UPF+"path"+millis;
		URI path = new URIImpl(strPath);
		URI pathGraph = new URIImpl(strPath+"_graph");

		URI configurationGraph = new URIImpl(pathFindingPrefix+"config"+millis);

		RdfStoreConnection dataLayer = DataFactory.INSTANCE.createRdfStoreConnection();

		QueryAnalyzer qa = new QueryAnalyzer((SPARQLQuery)theQuery);

		URI start = qa.getStart();
		URI goal = qa.getGoal();

		Policy policy=qa.getPolicy();
		switch(policy){
		case estimated:
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"weight"), configurationGraph);
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_PATH_ESTIMATED_TRAVEL_TIME, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"pathWeight"), configurationGraph);
			URI pathPolicy = new URIImpl(strPath+"_policy");
			dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_POLICY, pathPolicy, pathGraph);
			dataLayer.addStatement(pathPolicy, UrbanPathFindingVocabulary.HAS_MINIMIZED_DIMENSION, UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME, pathGraph);
			dataLayer.addStatement(pathPolicy, UrbanPathFindingVocabulary.HAS_TIME_VALIDITY, dataLayer.getValueFactory().createLiteral(qa.getTime()), pathGraph);
//			dataLayer.addStatement(pathPolicy, UrbanPathFindingVocabulary.HAS_TIME_VALIDITY, dataLayer.getValueFactory().createLiteral(DateFormatUtils.formatUTC(qa.getTime().toGregorianCalendar().getTime(), "yyyy-MM-dd'T'HH:mm:ssZZ"), XMLSchema.DATETIME), pathGraph);
//			logger.debug();
			break;
		case nominal:
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_NOMINAL_TRAVEL_TIME, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"weight"), configurationGraph);
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_PATH_NOMINAL_TRAVEL_TIME, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"pathWeight"), configurationGraph);
			dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_POLICY, UrbanPathFindingVocabulary.NOMINAL_TRAVEL_TIME_POLICY, pathGraph);
			dataLayer.addStatement(UrbanPathFindingVocabulary.NOMINAL_TRAVEL_TIME_POLICY, UrbanPathFindingVocabulary.HAS_MINIMIZED_DIMENSION, UrbanPathFindingVocabulary.HAS_NOMINAL_TRAVEL_TIME, pathGraph);
			break;
		case length:
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_LENGTH, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"weight"), configurationGraph);
			dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_PATH_LENGTH, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"pathWeight"), configurationGraph);
			dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_POLICY, UrbanPathFindingVocabulary.LENGTH_POLICY, pathGraph);
			dataLayer.addStatement(UrbanPathFindingVocabulary.LENGTH_POLICY, UrbanPathFindingVocabulary.HAS_MINIMIZED_DIMENSION, UrbanPathFindingVocabulary.HAS_LENGTH, pathGraph);
			break;
		default:;
		}

		Set<InformationSet> ret = new HashSet<InformationSet>();

		//prepares the mapping for the reasoner
		dataLayer.addStatement(UrbanPathFindingVocabulary.NODE , new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"Vertex"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.LINK, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"Edge"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_FROM, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"from"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_TO, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"to"), configurationGraph);

		dataLayer.addStatement(UrbanPathFindingVocabulary.PATH, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"Path"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_START, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"source"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.HAS_GOAL, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"destination"), configurationGraph);
		dataLayer.addStatement(UrbanPathFindingVocabulary.IS_COMPOSED_BY, new URIImpl(pathFindingPrefix+"mappingTo"), new URIImpl(pathFindingPrefix+"composedBy"), configurationGraph);

		//path description
		dataLayer.addStatement(path, RDF.TYPE, UrbanPathFindingVocabulary.PATH, pathGraph);
		dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_START, start, pathGraph);
		dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_GOAL, goal, pathGraph);

		//graphs
		Collection<Statement> sos = new HashSet<Statement>();
		sos.add(new StatementImpl(pathGraph, new URIImpl("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), new URIImpl("http://larkc.cefriel.it/ontologies/oprespathfindingreasoner#PathGraph")));
		sos.add(new StatementImpl(configurationGraph, new URIImpl("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), new URIImpl("http://larkc.cefriel.it/ontologies/oprespathfindingreasoner#ConfigurationGraph")));
		sos.add(new StatementImpl(new URIImpl("http://larkc.cefriel.it/pathfinding/map"), new URIImpl("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), new URIImpl("http://larkc.cefriel.it/ontologies/oprespathfindingreasoner#DataGraph")));
		if(policy==Policy.estimated){
			String query = 
				"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> "+
				"SELECT ?g "+
				"WHERE { "+
					"?g upf:hasTrafficRecordsFrom ?dfrom . "+ 
					"?g upf:hasTrafficRecordsUntil ?duntil . "+
					"FILTER(?dfrom <= \""+qa.getTime()+"\"^^xsd:dateTime && ?duntil >= \""+qa.getTime()+"\"^^xsd:dateTime) "+
				"}";
			logger.debug("Sending query to retrieve the graph for the estimated travel times: {}", query);
			CloseableIterator<Binding> graph = DataFactory.INSTANCE.createRdfStoreConnection().executeSelect(new SPARQLQueryImpl(query)).iterator();
			if(graph.hasNext()){
				URI predictionGraph = (URI)graph.next().getValues().get(0);
				logger.debug("Found graph: {}", predictionGraph);
				sos.add(new StatementImpl(predictionGraph, RDF.TYPE, new URIImpl("http://larkc.cefriel.it/ontologies/oprespathfindingreasoner#DataGraph")));
			}
			else{
				logger.error("No graph has been found!");
			}
		}

		ret.add(new SetOfStatementsImpl(sos));
		return ret;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		return null;
	}

}
