package eu.larkc.plugin.identify.urbancomputing;

import it.cefriel.larkc.urbancomputing.ontologies.UrbanPathFindingVocabulary;

import java.util.Date;
import java.util.Iterator;

import javax.xml.datatype.XMLGregorianCalendar;

import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;
import org.openrdf.query.parser.ParsedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

public class QueryAnalyzer {
	protected enum Policy {length, nominal, estimated, undefined};

	private URI start;
	private URI goal;
	private Policy policy = Policy.undefined;
	private XMLGregorianCalendar time;

	public URI getStart() {
		return start;
	}

	public URI getGoal() {
		return goal;
	}

	public Policy getPolicy() {
		return policy;
	}

	public XMLGregorianCalendar getTime() {
		return time;
	}

	private static final Logger logger = LoggerFactory.getLogger(QueryAnalyzer.class);

	private static final String NTT1 =
			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "+
			"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
			"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
			"SELECT ?p ?pntt ?pl ?n1 ?lat1 ?long1 ?l ?n2 ?lat2 ?long2 "+
			"WHERE { "+
				"?p a upf:Path; "+
				"upf:hasStart <http://www.linkingurbandata.org/onto/ama/nodes/node17>; "+
				"upf:hasGoal <http://www.linkingurbandata.org/onto/ama/nodes/node117>; "+
				"upf:isComposedBy ?l; "+
				"upf:hasPathLength ?pl; "+
				"upf:hasPathNominalTravelTime ?pntt. "+
				"?l upf:from ?n1; "+
				"upf:to ?n2. "+
				"?n1 geo:lat ?lat1; "+
				"geo:long ?long1. "+
				"?n2 geo:lat ?lat2; "+
				"geo:long ?long2. "+
			"} "+
			"ORDER BY ?pntt "+
			"LIMIT 1 ";

	private static final String NTT2 =
			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "+
			"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
			"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
			"SELECT ?p ?pntt ?pl ?n1 ?lat1 ?long1 ?l ?n2 ?lat2 ?long2 "+
			"WHERE { "+
				"?p a upf:Path; "+
				"upf:hasStart <http://example.org/start>; "+
				"upf:hasGoal <http://example.org/goal>; "+
				"upf:isComposedBy ?l; "+
				"upf:hasPolicy ?policy; "+
				"upf:hasPathLength ?pl; "+
				"upf:hasPathNominalTravelTime ?pntt. "+
				"?policy upf:hasMinimizedDimension upf:hasNominalTravelTime. "+
				"?l upf:from ?n1; "+
				"upf:to ?n2. "+
				"?n1 geo:lat ?lat1; "+
				"geo:long ?long1. "+
				"?n2 geo:lat ?lat2; "+
				"geo:long ?long2. "+
			"} ";

	private static final String NTT3 =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "+
		"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
		"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
		"SELECT ?p ?pntt ?pl ?n1 ?lat1 ?long1 ?l ?n2 ?lat2 ?long2 "+
		"WHERE { "+
			"?p a upf:Path; "+
			"upf:hasStart <http://example.org/start>; "+
			"upf:hasGoal <http://example.org/goal>; "+
			"upf:isComposedBy ?l; "+
			"upf:hasPolicy upf:nominalTravelTimePolicy; "+
			"upf:hasPathLength ?pl. "+
			"?l upf:from ?n1; "+
			"upf:to ?n2. "+
			"?n1 geo:lat ?lat1; "+
			"geo:long ?long1. "+
			"?n2 geo:lat ?lat2; "+
			"geo:long ?long2. "+
		"} ";

	private static final String ETT =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "+
		"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
		"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
		"SELECT ?p ?pett ?pl ?n1 ?lat1 ?long1 ?l ?n2 ?lat2 ?long2 "+
		"WHERE { "+
			"?p a upf:Path; "+
			"upf:hasStart <http://example.org/start>; "+
			"upf:hasGoal <http://example.org/goal>; "+
			"upf:isComposedBy ?l; "+
			"upf:hasPolicy ?policy; "+
			"upf:hasPathLength ?pl; "+
			"upf:hasPathNominalTravelTime ?pntt; "+
			"upf:hasPathEstimatedTravelTime ?pett. "+
			"?policy upf:hasMinimizedDimension upf:hasEstimatedTravelTime. "+
			"?policy upf:hasTimeValidity \"2010-08-26T11:50:00\". "+
			"?l upf:from ?n1; "+
			"upf:to ?n2. "+
			"?n1 geo:lat ?lat1; "+
			"geo:long ?long1. "+
			"?n2 geo:lat ?lat2; "+
			"geo:long ?long2. "+
		"} ";

	public QueryAnalyzer(SPARQLQuery query){
		ParsedQuery pq = ((SPARQLQueryImpl)query).getParsedQuery();
		StatementPatternCollector sc = new StatementPatternCollector();
		OrderFinder of = new OrderFinder();
		pq.getTupleExpr().visit(of);

		String var = null;
		if(of.isFound())
			var = of.getVar();
		pq.getTupleExpr().visit(sc);
		Iterator<StatementPattern> i = sc.getStatementPatterns().iterator();

		URI minimizedDimension = null;
		URI policy = null;
		String ntt = null,
				ett = null,
				l = null;

		while(i.hasNext()){
			StatementPattern sp = i.next();
			if(sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_PATH_ESTIMATED_TRAVEL_TIME))
				ett = sp.getObjectVar().getName();
			if(sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_PATH_NOMINAL_TRAVEL_TIME))
				ntt = sp.getObjectVar().getName();
			if(sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_PATH_LENGTH))
				l = sp.getObjectVar().getName();
			if(sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_TIME_VALIDITY)){
				time=((Literal)sp.getObjectVar().getValue()).calendarValue();
				System.out.println(time);
			}
			if (sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_START))
				start=(URI)sp.getObjectVar().getValue();
			if (sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_GOAL))
				goal=(URI)sp.getObjectVar().getValue();
			if (sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_MINIMIZED_DIMENSION))
				minimizedDimension=(URI)sp.getObjectVar().getValue();
			if (sp.getPredicateVar().getValue().equals(UrbanPathFindingVocabulary.HAS_POLICY)) {
				if(sp.getObjectVar().getValue() instanceof URI)
					policy = (URI)sp.getObjectVar().getValue();
			}

		}

		if(policy!=null){
			logger.debug("A policy has been found! Let's use "+policy);
		}
		else if(minimizedDimension!=null){
			if(minimizedDimension.equals(UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME)){
				logger.debug("A minimized dimension has been found! Let's use "+UrbanPathFindingVocabulary.HAS_PATH_ESTIMATED_TRAVEL_TIME);
				this.policy = Policy.estimated;
			}
			else if (minimizedDimension.equals(UrbanPathFindingVocabulary.HAS_NOMINAL_TRAVEL_TIME)){
				logger.debug("A minimized dimension has been found! Let's use "+UrbanPathFindingVocabulary.NOMINAL_TRAVEL_TIME_POLICY);
				this.policy = Policy.nominal;
			}
			else if (minimizedDimension.equals(UrbanPathFindingVocabulary.HAS_LENGTH)){
				logger.debug("A minimized dimension has been found! Let's use "+UrbanPathFindingVocabulary.LENGTH_POLICY);
				this.policy = Policy.length;
			}
		}
		else{
			if(var != null){
				if(var.equals(ett)){
					logger.debug("Order by ETT! Let's use the estimated travel time policy!");
					this.policy = Policy.estimated;
				}
				else if(var.equals(ntt)){
					logger.debug("Order by NTT! Let's use the nominal travel time policy!");
					this.policy = Policy.nominal;
				}
				else if(var.equals(l)){
					logger.debug("Order by L! Let's use the length travel time policy!");
					this.policy = Policy.length;
				}
			}
			else if(ett!=null){
				logger.debug("ETT has been defined! Let's use the estimated travel time policy!");
				this.policy = Policy.estimated;
			}
			else if(ntt!=null){
				if(l==null){
					logger.debug("Only NTT has been defined! Let's use the nominal travel time policy!");
					this.policy = Policy.nominal;
				}
				else{
					logger.debug("Both NTT and L has been defined! Let's use the default policy (length)!");
					this.policy = Policy.length;
				}
			}
			else if(l!=null){
				logger.debug("Only L has been defined! Let's use the length policy!");
				this.policy = Policy.length;
			}
			else
				logger.debug("Empty result! Policy undefined");
		}
	}

	public static void main(String[] args) {
		logger.debug("************ NTT1 ************");
		new QueryAnalyzer(new SPARQLQueryImpl(NTT1));
		logger.debug("************ NTT2 ************");
		new QueryAnalyzer(new SPARQLQueryImpl(NTT2));
		logger.debug("************ NTT3 ************");
		new QueryAnalyzer(new SPARQLQueryImpl(NTT3));
		logger.debug("************ ETT ************");
		new QueryAnalyzer(new SPARQLQueryImpl(ETT));

		logger.debug("************ Q ************");
		new QueryAnalyzer(
				new SPARQLQueryImpl("PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/> "+
				"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+ 
				"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
				"SELECT ?p ?pl ?pntt ?entt "+
				"WHERE { "+
				"?p a upf:Path; "+ 
				"upf:hasStart <http://www.linkingurbandata.org/onto/ama/nodes/node17>; "+ 
				"upf:hasGoal <http://www.linkingurbandata.org/onto/ama/nodes/node117>;  "+
				"upf:isComposedBy ?l;  "+
				"upf:hasPolicy ?policy; "+
				"upf:hasPathLength ?pl; "+
				"upf:hasPathNominalTravelTime ?pntt; "+
				"upf:hasPathEstimatedTravelTime ?entt. "+ 
				"?policy upf:hasMinimizedDimension upf:hasEstimatedTravelTime; "+
				"upf:hasTimeValidity \"2010-08-26T18:51:00.324+02:00\". "+
				"} "));
	}
}
