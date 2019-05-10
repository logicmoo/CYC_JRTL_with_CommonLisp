package eu.larkc.plugin.reason.urbancomputing;

import it.cefriel.larkc.urbancomputing.ontologies.DijkstraPathFindingReasonerVocabulary;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.reason.urbancomputing.NamedWeightedEdge;

public class PathFindingReasoner implements Reasoner {
	private static final Logger logger = LoggerFactory.getLogger(PathFindingReasoner.class);

	RdfStoreConnection dataLayer = DataFactory.INSTANCE.createRdfStoreConnection();
	
	Set<URI> dataGraphs = new HashSet<URI>();
	URI configurationGraph=null;
	URI outputGraph = null;
	
	public PathFindingReasoner() {
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
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("Invoked (ASK)");
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("Invoked (CONSTRUCT)");
		
		generatePath(theSetOfStatements);

		return theSetOfStatements;
//		Set<URI> namedGraphs = new HashSet<URI>();
//		namedGraphs.addAll(dataGraphs);
//		namedGraphs.add(outputGraph);
//		DataSet ds = dataLayer.createDataSet(new HashSet<URI>(), namedGraphs);
//		return ds;
//		return generatePath(theSetOfStatements);
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("Invoked (DESCRIBE)");
		return null;
	}
	

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {	
		logger.info("Invoked (SELECT)");
		generatePath(theSetOfStatements);
		
		Set<URI> namedGraphs = new HashSet<URI>();
		namedGraphs.addAll(dataGraphs);
		namedGraphs.add(outputGraph);
		DataSet ds = dataLayer.createDataSet(new HashSet<URI>(), namedGraphs);
		
		return new SPARQLQueryExecutor().executeSelect(theQuery, ds);
	}

	private SetOfStatements generatePath(SetOfStatements theSetOfStatements){
		Set<Statement> ret = new HashSet<Statement>();
		
		Graph<URI, NamedWeightedEdge> graph = new DefaultDirectedWeightedGraph<URI, NamedWeightedEdge>(NamedWeightedEdge.class);
		
		CloseableIterator<Statement> it = theSetOfStatements.getStatements();
	
		logger.debug("Computing the input");
		
		while(it.hasNext()){
			Statement s = it.next();
			ret.add(s);
			if(s.getPredicate().equals(DijkstraPathFindingReasonerVocabulary.rdfType) && s.getObject().equals(DijkstraPathFindingReasonerVocabulary.dataClass))
				dataGraphs.add((URI)s.getSubject());
			else if(s.getPredicate().equals(DijkstraPathFindingReasonerVocabulary.rdfType) && s.getObject().equals(DijkstraPathFindingReasonerVocabulary.configurationClass))
				configurationGraph=(URI)s.getSubject();
			else if(s.getPredicate().equals(DijkstraPathFindingReasonerVocabulary.rdfType) && s.getObject().equals(DijkstraPathFindingReasonerVocabulary.pathGraphClass))
				outputGraph=(URI)s.getSubject();
		}

		logger.debug("Generating the configuration");
		
		//generates the configuration
		Configuration config = null;
			config = prepareConfiguration(dataLayer.createRdfGraph(configurationGraph));

		Resource pathUri= null;
		URI source = null;
		URI destination = null;

		SPARQLQuery query = new SPARQLQueryImpl(
				"SELECT ?path ?source ?destination "+
				"FROM <"+outputGraph+"> "+
				"WHERE {" +
				"?path a <"+config.getPathClass()+">; " +
				"<"+config.getSourceProperty()+"> ?source; " +
				"<"+config.getDestinationProperty()+"> ?destination. " +
				"}");

		//writes the path in the data layer
		CloseableIterator<Binding> path = dataLayer.executeSelect(query).iterator();
		if(path.hasNext()){
			List<Value> pathDescription = path.next().getValues();
			pathUri=(URI)pathDescription.get(0);
			source=(URI)pathDescription.get(1);
			destination=(URI)pathDescription.get(2);
		}
		else{
			pathUri = dataLayer.getValueFactory().createBNode();
			logger.debug("Inserting <{} {} {}> in {}", new Object[]{pathUri, DijkstraPathFindingReasonerVocabulary.rdfType, config.getPathClass(), outputGraph});
			dataLayer.addStatement(pathUri, DijkstraPathFindingReasonerVocabulary.rdfType, config.getPathClass(), outputGraph);
		}
		
		String from = "";
		for(URI graphName : dataGraphs){
			from+="FROM <"+graphName.stringValue()+"> ";
		}
		
		logger.debug("Creating the graph");

		query = new SPARQLQueryImpl(
				"SELECT ?x "+
				from +
				"WHERE {" +
				"?x a <"+config.getVertexClass()+">" +
				"}");
		logger.debug("first query: {}", query);
		
		CloseableIterator<Binding> vertices = dataLayer.executeSelect(query).iterator();
		while(vertices.hasNext()){
			Binding vertix = vertices.next();
			graph.addVertex((URI)vertix.getValues().get(0));
		}
		
		query = new SPARQLQueryImpl(
				"SELECT ?e ?f ?t ?w "+
				from +
				"WHERE {" +
				"?e a <"+config.getEdgeClass()+">;" +
				"<"+config.getFromProperty()+"> ?f;" +
				"<"+config.getToProperty()+"> ?t;" +
				"<"+config.getWeightProperty()+"> ?w." +
				"}");
		logger.debug("second query: {}", query);

		CloseableIterator<Binding> edges = dataLayer.executeSelect(query).iterator();
		while(edges.hasNext()){
			List<Value> edge = edges.next().getValues();
			NamedWeightedEdge e = graph.addEdge((URI)edge.get(1), (URI)edge.get(2));
			if(e!=null){
				e.setURI((URI)edge.get(0));
				Double weight = Double.parseDouble(edge.get(3).stringValue());
				((AbstractBaseGraph<URI, NamedWeightedEdge>) graph).setEdgeWeight(e, weight);
			}
//			else{
//				logger.error("Not inserted: {} <{} {}>. A link with the same source and destination has been previously inserted", new Object[]{edge.get(1), edge.get(2), edge.get(0), e});
//			}
		}

		logger.debug("Computing the path from <{}> to <{}>", source, destination);
		DijkstraShortestPath<URI, NamedWeightedEdge> dijkstra = new DijkstraShortestPath<URI, NamedWeightedEdge>(graph, source, destination);

		query = new SPARQLQueryImpl(
				"SELECT ?x "+
				"FROM <"+outputGraph+">" +
				"WHERE {" +
				"?x a <"+config.getPathClass()+">" +
				"}");
		
		logger.debug("Inserting <{} {} {}> in {}", new Object[]{pathUri, config.getPathWeightProperty(), ValueFactoryImpl.getInstance().createLiteral(dijkstra.getPathLength()), outputGraph});
		dataLayer.addStatement(pathUri, config.getPathWeightProperty(), ValueFactoryImpl.getInstance().createLiteral(dijkstra.getPathLength()), outputGraph);
		logger.debug("Inserting <{} {} {}> in {}", new Object[]{pathUri, config.getSourceProperty(), source, outputGraph});
		dataLayer.addStatement(pathUri, config.getSourceProperty(), source, outputGraph);
		logger.debug("Inserting <{} {} {}> in {}", new Object[]{pathUri, config.getDestinationProperty(), destination, outputGraph});
		dataLayer.addStatement(pathUri, config.getDestinationProperty(), destination, outputGraph);
		List<NamedWeightedEdge> nwe = dijkstra.getPathEdgeList();
		for(NamedWeightedEdge n : nwe){
			logger.debug("Inserting <{} {} {}> in {}", new Object[]{pathUri, config.getComposedByProperty(), n.getURI(), outputGraph});
			dataLayer.addStatement(pathUri, config.getComposedByProperty(), n.getURI(), outputGraph);
		}
		
		return new SetOfStatementsImpl(ret);
	}
	
	public Configuration prepareConfiguration(SetOfStatements sos){
		CloseableIterator<Statement> it = sos.getStatements();
		Configuration ret = new Configuration();
		if(!it.hasNext()) logger.error("The configuration graph is empty!!");
		while(it.hasNext()){
			Statement s = it.next();
			logger.debug("Processing <{} {} {}>", new Object[]{s.getSubject(), s.getPredicate(), s.getObject()}); 
			if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strVertexClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setVertexClass((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strVertexClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setVertexClass((URI)s.getSubject());
			
			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strEdgeClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setEdgeClass((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strEdgeClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setEdgeClass((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strPathClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setPathClass((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strPathClass) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setPathClass((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strFromProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setFromProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strFromProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setFromProperty((URI)s.getSubject());
			
			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strToProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setToProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strToProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setToProperty((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strWeightProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setWeightProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strWeightProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setWeightProperty((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strSourceProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setSourceProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strSourceProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setSourceProperty((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strDestinationProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setDestinationProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strDestinationProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setDestinationProperty((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strPathWeightProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setPathWeightProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strPathWeightProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setPathWeightProperty((URI)s.getSubject());

			else if(s.getSubject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strComposedByProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setComposedByProperty((URI)s.getObject());
			else if(s.getObject().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strComposedByProperty) && s.getPredicate().stringValue().equals(DijkstraPathFindingReasonerVocabulary.strMappingTo))
				ret.setComposedByProperty((URI)s.getSubject());
		}
		return ret;
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
