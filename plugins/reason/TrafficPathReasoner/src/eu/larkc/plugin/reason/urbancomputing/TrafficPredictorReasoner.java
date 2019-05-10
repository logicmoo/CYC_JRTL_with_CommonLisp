package eu.larkc.plugin.reason.urbancomputing;

import it.cefriel.larkc.urbancomputing.ontologies.DijkstraPathFindingReasonerVocabulary;
import it.cefriel.larkc.urbancomputing.ontologies.UrbanPathFindingVocabulary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.openrdf.model.Literal;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.RDF;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

public class TrafficPredictorReasoner implements Reasoner {
	private static final Logger logger = LoggerFactory.getLogger(TrafficPredictorReasoner.class);
	private RdfStoreConnection dataLayer = DataFactory.INSTANCE.createRdfStoreConnection();
	
	private URI reviewGraph;
	private XMLGregorianCalendar reviewTime;

	public TrafficPredictorReasoner() {
	}
	
	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
		logger.info("Generating Review Data");
		RdfStoreConnection con = DataFactory.INSTANCE.createRdfStoreConnection();
		
		String query = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "
			+ "PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "
			+ "PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "
			+ "SELECT DISTINCT ?debug ?datetime "
			+ "FROM <http://www.larkc.cefriel.it#reviewGraph>"
			+ "WHERE { "
			+ "<http://www.larkc.cefriel.it#reviewDemo> <http://www.larkc.cefriel.it#hasGraph> ?debug; "
			+ "<http://www.larkc.cefriel.it#hasDateTime> ?datetime. "
			+ "} ORDER BY DESC(?datetime)";

		CloseableIterator<Binding> res = con.executeSelect(new SPARQLQueryImpl(query)).iterator();
		if(res.hasNext()){
			List<Value> temp = res.next().getValues();
			reviewGraph = (URI)temp.get(0);
			reviewTime = ((Literal)temp.get(1)).calendarValue();
			logger.debug("Prediction graph: {}, Prediction time: {}", reviewGraph, reviewTime);
		}
	}
	
	@Override
	public void shutdown() {
	}

	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("invoked (ASK)");
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("invoked (CONSTRUCT)");
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		logger.info("invoked (DESCRIBE)");
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {	
		logger.info("invoked (SELECT)");

		//discover the method used to build the path
		URI path = null;
		URI graph = null;
		
		CloseableIterator<Statement> it = theSetOfStatements.getStatements();
		while(it.hasNext()){
			Statement s = it.next();
			if(s.getPredicate().equals(RDF.TYPE) && s.getObject().equals(DijkstraPathFindingReasonerVocabulary.pathGraphClass))
				graph=(URI)s.getSubject();
		}
		
		if(graph!=null){
			CloseableIterator<Binding> bind = dataLayer.executeSelect(new SPARQLQueryImpl("PREFIX upf: <"+UrbanPathFindingVocabulary.UPF+"> SELECT ?path FROM <"+graph+"> WHERE{?path a <"+UrbanPathFindingVocabulary.PATH+">.}")).iterator();
			if(bind.hasNext()){
				path = (URI)bind.next().getValues().get(0);
			}
		}

		logger.debug("Path: <{}> Graph: <{}>", path, graph);
		CloseableIterator<Binding> bind2  = dataLayer.executeSelect(new SPARQLQueryImpl("SELECT ?s ?p ?o FROM <"+graph+"> WHERE {?s ?p ?o.}")).iterator();
		while(bind2.hasNext()){
			Binding s = bind2.next();
			logger.debug("{}", s.getValues());
		}
		
		//compute the distances using the other methods
		
		//TODO: seconda parte di questa query!!!
		VariableBinding vb = dataLayer.executeSelect(new SPARQLQueryImpl("PREFIX upf: <"+UrbanPathFindingVocabulary.UPF+"> SELECT ?policy ?minimized WHERE{<"+path+"> <"+UrbanPathFindingVocabulary.HAS_POLICY+"> ?policy. ?policy <"+UrbanPathFindingVocabulary.HAS_MINIMIZED_DIMENSION+"> ?minimized.}"));
		CloseableIterator<Binding> bind = vb.iterator();
		logger.debug("Policy found: {}", bind.hasNext());
		if(bind.hasNext()){
			Binding b = bind.next();
			List<Value> values = b.getValues();
			Value minimized = values.get(1);
			logger.debug("Policy found: {}", minimized);
			
			if(minimized.equals(UrbanPathFindingVocabulary.HAS_LENGTH)){
				logger.debug("The path has been generated using the length policy, processing the nominal travel time");
				generateNominalTravelTime(path, graph);

				logger.debug("... and the predicted travel time");
				GregorianCalendar time = new GregorianCalendar();
				time.add(GregorianCalendar.HOUR, 1);
				XMLGregorianCalendar predictionTime = new XMLGregorianCalendarImpl(time);
//				URI predGraph = getPredictionGraph(predictionTime);
//				if(predGraph!=null)
					generateEstimatedTravelTime(path, graph, reviewGraph);
			}else if(minimized.equals(UrbanPathFindingVocabulary.HAS_NOMINAL_TRAVEL_TIME)){
				logger.debug("The path has been generated using the nominal travel time policy, processing the length");
				generatePathLength(path, graph);

				logger.debug("... and the predicted travel time");
				GregorianCalendar time = new GregorianCalendar();
				time.add(GregorianCalendar.HOUR, 1);
				XMLGregorianCalendar predictionTime = new XMLGregorianCalendarImpl(time);
//				URI predGraph = getPredictionGraph(predictionTime);
//				if(predGraph!=null)
					generateEstimatedTravelTime(path, graph, reviewGraph);
			}else if(minimized.equals(UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME)){
				logger.debug("The path has been generated using the predicted travel time, processing the length...");
				generatePathLength(path, graph);
				logger.debug("... and the nominal travel time");
				generateNominalTravelTime(path, graph);
			}
			else
				logger.error("Cannot manage the policy");
		}
		return dataLayer.executeSelect(theQuery);
	}
	
	private void generateNominalTravelTime(URI path, URI graph){
		VariableBinding vb = dataLayer.executeSelect(new SPARQLQueryImpl("PREFIX upf: <"+UrbanPathFindingVocabulary.UPF+"> SELECT ?ntt ?l WHERE{<"+path+"> <"+UrbanPathFindingVocabulary.IS_COMPOSED_BY+"> ?l. ?l <"+UrbanPathFindingVocabulary.HAS_NOMINAL_TRAVEL_TIME+"> ?ntt.}"));
		CloseableIterator<Binding> it = vb.iterator();
		double ntt = 0;
		while(it.hasNext()){
			Binding b = it.next();
			List<Value> values = b.getValues();
			ntt+=((Literal)values.get(0)).doubleValue();
		}		
		logger.debug("Adding <{} {} {}> to {}", new Object[]{path, UrbanPathFindingVocabulary.HAS_PATH_NOMINAL_TRAVEL_TIME, ValueFactoryImpl.getInstance().createLiteral(ntt), graph});
		dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_PATH_NOMINAL_TRAVEL_TIME, ValueFactoryImpl.getInstance().createLiteral(ntt), graph);
	}

	private void generateEstimatedTravelTime(URI path, URI graph, URI predictionGraph){
		VariableBinding vb = dataLayer.executeSelect(new SPARQLQueryImpl(
				"PREFIX upf: <"+UrbanPathFindingVocabulary.UPF+"> " +
				"SELECT ?ett ?l " +
				"FROM <"+predictionGraph+"> " +
				"FROM <"+graph+"> " +
				"WHERE{<"+path+"> <"+UrbanPathFindingVocabulary.IS_COMPOSED_BY+"> ?l. " +
				"?l <"+UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME+"> ?ett.}"));
		CloseableIterator<Binding> it = vb.iterator();
		double ett = 0;
		while(it.hasNext()){
			Binding b = it.next();
			List<Value> values = b.getValues();
			ett+=((Literal)values.get(0)).doubleValue();
		}		
		logger.debug("Adding <{} {} {}> to {}", new Object[]{path, UrbanPathFindingVocabulary.HAS_PATH_ESTIMATED_TRAVEL_TIME, ValueFactoryImpl.getInstance().createLiteral(ett), graph});
		dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_PATH_ESTIMATED_TRAVEL_TIME, ValueFactoryImpl.getInstance().createLiteral(ett), graph);
	}

//	private URI getPredictionGraph(XMLGregorianCalendar time){
//		String query = 
//			"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
//			"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> "+
//			"SELECT ?g "+
//			"WHERE { "+
//				"?g upf:hasTrafficRecordsFrom ?dfrom . "+ 
//				"?g upf:hasTrafficRecordsUntil ?duntil . "+
//				"FILTER(?dfrom <= \""+reviewTime.toXMLFormat()+"\"^^xsd:dateTime && ?duntil >= \""+reviewTime.toXMLFormat()+"\"^^xsd:dateTime) "+
//			"}";
//		logger.debug("Sending query to retrieve the graph for the estimated travel times: {}", query);
//		CloseableIterator<Binding> graph = DataFactory.INSTANCE.createRdfStoreConnection().executeSelect(new SPARQLQueryImpl(query)).iterator();
//		if(graph.hasNext()){
//			URI predictionGraph = (URI)graph.next().getValues().get(0);
//			logger.debug("Found graph: {}", predictionGraph);
//			return predictionGraph;
//		}
//		return null;
//	}
	
	private void generatePathLength(URI path, URI graph){
		VariableBinding vb = dataLayer.executeSelect(new SPARQLQueryImpl("PREFIX upf: <"+UrbanPathFindingVocabulary.UPF+"> SELECT ?length ?l WHERE{<"+path+"> upf:isComposedBy ?l. ?l upf:hasLength ?length.}"));
		CloseableIterator<Binding> it = vb.iterator();
		double length = 0;
		while(it.hasNext()){
			Binding b = it.next();
			List<Value> values = b.getValues();
			length+=((Literal)values.get(0)).doubleValue();
		}		
		logger.debug("Adding <{} {} {}> to {}", new Object[]{path, UrbanPathFindingVocabulary.HAS_PATH_LENGTH, ValueFactoryImpl.getInstance().createLiteral(length), graph});
		dataLayer.addStatement(path, UrbanPathFindingVocabulary.HAS_PATH_LENGTH, ValueFactoryImpl.getInstance().createLiteral(length), graph);
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
