/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.StatementImpl;
import com.cyc.cycjava.cycl.new_cycl_query_specification;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.decider.simpleanytimedecider.SimpleAnytimeDecider;
import eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier;
import eu.larkc.plugin.reason.irisrulereasoner.IrisRuleBasedReasoner;
import eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner;
import eu.larkc.plugin.select.simple.GrowingDataSetSelecter;
import eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer;


public class ConfigurableSimplePipeline {
	
	List<Statement> allStatements = new ArrayList<Statement>();
	SetOfStatements f(SetOfStatements input) {
//		RdfStoreConnection rdfStore = DataFactoryImpl.getInstance().createRdfStoreConnection();
		CloseableIterator<Statement> itInput = input.getStatements();
		
		while( itInput.hasNext() ) {
			Statement statement = itInput.next();
			allStatements.add( new StatementImpl( statement.getSubject(), statement.getPredicate(), statement.getObject() ) );
		}
		itInput.close();

		SetOfStatementsImpl output = new SetOfStatementsImpl( allStatements );
//		output.setData( allStatements );
		
		return output;
	}
	public URI getIdentifier() {
		return null;
	}	
	// rdf files
	protected static final String WINE_LIGHT_RDF = "files/data/wine-light.rdf";
	protected static final String FOAF_STI_RDF = "files/data/foaf-sti.rdf";
	protected static final String UNIPROT_PATH_RDF = "files/data/pathways.rdf";
	protected static final String UNIPROT_CORE_RDF = "files/data/core.owl";
	protected static final String UNIPROT_GO_RDF = "files/data/go.rdf";
	
	// rule files
	protected static final String L2_ENTAILMENT_RULES = "files/L2_entailment.rules";
	protected static final String RDF_ENTAILMENT_RULES = "files/RDF_entailment.rules";
	protected static final String RDFS_ENTAILMENT_RULES = "files/RDFS_entailment.rules";
	
	

	// prefix foaf-sti
	protected static String PREFIX_FOAF_STI = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> "
		+ "PREFIX owl: <http://www.w3.org/2002/07/owl/>"
		+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/>"
		+ "PREFIX sti: <http://sti2.at/>";
	
	// prefix wine-light
	protected static String PREFIX_WINE_LIGHT = ""
			+ "PREFIX wine: <http://wine-light.org/wine#> \n"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n";

	// query wine
	private static String WINE_QUERY_LOCATE = PREFIX_WINE_LIGHT
			+ " SELECT ?x \n"
			+ " WHERE {?x wine:hasFlavor wine:Moderate. ?x wine:locatedIn wine:CaliforniaRegion} \n";
	
	// query foaf
	protected static String STI_FOAF_NUMBER = PREFIX_FOAF_STI 
			+ "SELECT DISTINCT ?o ?o2 ?number "
			+ "WHERE { ?o foaf:name 'Christoph Fuchs'. ?o owl:sameAs ?o2. ?o2 foaf:phone ?number.  } ";
	
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(ConfigurableSimplePipeline.class);
		
		// ====================================================================
		// Step 1
		// WEB SPARQL
		String TBL_QUERY = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
		"PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" + 
		"SELECT DISTINCT ?name where {\n" + 
		"?person rdf:type foaf:Person .\n" + 
		"?person foaf:name \"Frank van Harmelen\" .\n" +
		"?person2 rdf:type foaf:Person .\n" + 
		"?person2 foaf:knows ?person .\n" +
		"?person2 foaf:name ?name .\n" +
		"}";
//		String TBL_QUERY = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//		"SELECT ?s  ?o where {\n" + 
//		"?s rdf:type ?o .\n" +
//		"}";
		SPARQLQuery theQuery = new SPARQLQueryImpl(TBL_QUERY);
		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
						new SPARQLToTriplePatternQueryTransformer(),
						new SindiceTriplePatternIdentifier(),
						new GrowingDataSetSelecter(),
//						new IrisRuleBasedReasoner() );
						new SparqlQueryEvaluationReasoner() );
		
		// ====================================================================
		// Step 2
		// LOCAL DATA SETS with no inference
//		String SELECT_ALL_TRIPLES =
//			"SELECT ?s ?p ?o " +
//			"WHERE { ?s  ?p  ?o }";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SELECT_ALL_TRIPLES);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),  // RDF files
//				 new GrowingDataSetSelecter(),
//				 new IrisRuleBasedReasoner(null) );
		
		// ====================================================================
		// Step 3
		// LOCAL DATA SETS with inference
//		String SELECT_ALL_TRIPLES =
//			"SELECT ?s ?p ?o " +
//			"WHERE { ?s  ?p  ?o }";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SELECT_ALL_TRIPLES);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),
//				 new GrowingDataSetSelecter(),
//		 		 new IrisRuleBasedReasoner(RDFS_ENTAILMENT_RULES) ); // RDFS entailment*
		
		// *IRIS does not support blank nodes, so for example, the lg, gl rules are disabled at the moment.

		
		// ====================================================================
		// Step 4
		// query for subclass - no inference
//		String SUBCLASS_QUERY =
//			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + 
//			"SELECT DISTINCT ?class ?label where {\n" + 
//			"?class rdfs:subClassOf <http://purl.uniprot.org/unipathway/402> .\n" +
//			"?class rdfs:label ?label \n" +
//			"}";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SUBCLASS_QUERY);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),
//				 new GrowingDataSetSelecter(),
//				 new IrisRuleBasedReasoner(null) );  // without any entailment rules
		
		// ====================================================================
		// Step 5
		// query for subclass - with inference
//		String SUBCLASS_QUERY =
//			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + 
//			"SELECT DISTINCT ?class ?label where {\n" + 
//			"?class rdfs:subClassOf <http://purl.uniprot.org/unipathway/402> .\n" +
//			"?class rdfs:label ?label \n" +
//			"}";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SUBCLASS_QUERY);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),
//				 new GrowingDataSetSelecter(),
//				 new IrisRuleBasedReasoner(RDFS_ENTAILMENT_RULES) );
		
		// ====================================================================
		// Step 6, query for sub class of self
//		String SUBCLASS_OF_SELF =
//			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + 
//			"SELECT ?concept where {\n" + 
//			"?concept rdfs:subClassOf ?concept .\n" + 
//			"}";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SUBCLASS_OF_SELF);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),
//				 new GrowingDataSetSelecter(),
//				 new IrisRuleBasedReasoner(L2_ENTAILMENT_RULES) );
		
		
		// ====================================================================
		// Step 7, query for sub class of self
		// Copy L2_entailment.rules => L2_plus.rules
		// Add this line:
		// triple(_iri("owl:Class"), _iri("rdfs:subClassOf"), _iri("rdfs:Class")) :- .
		// OR
		// triple(?v, _iri("rdf:type"), _iri("rdfs:Class") ) :- triple(?v, _iri("rdf:type"), _iri("owl:Class") ).
//		String SUBCLASS_OF_SELF =
//			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + 
//			"SELECT ?concept where {\n" + 
//			"?concept rdfs:subClassOf ?concept .\n" + 
//			"}";
//		SPARQLQuery theQuery = new SPARQLQueryImpl(SUBCLASS_OF_SELF);
//		SimpleAnytimeDecider decider = new SimpleAnytimeDecider(
//				 new PassItOnTransformer(),
//				 new SimpleFileReaderIdentifier(UNIPROT_CORE_RDF, UNIPROT_PATH_RDF),
//				 new GrowingDataSetSelecter(),
//				 new IrisRuleBasedReasoner("files/L2_plus.rules") );


		printOriginalQuery(theQuery.toString());

		if (theQuery.isSelect()) {
			decider.startASyncSparqlSelect(theQuery, null);
		} 
		else if (theQuery.isConstruct()) {
			decider.startASyncSparqlConstruct(theQuery, null);
		} 
		else if (theQuery.isDescribe()) {
			decider.startASyncSparqlDescribe(theQuery, null);
		} 
		else if (theQuery.isAsk()) {
			decider.startASyncSparqlAsk(theQuery, null);
		}
		
		for(;;) {
			if (theQuery.isSelect()) {
				VariableBinding result = decider.getNextSparqlSelectResult();
				if(result == null){
					break;
				}
				printVariableBindings(result);
			} 
			else if (theQuery.isConstruct()) {
				SetOfStatements result = decider.getNextSparqlConstructResult();
				if(result == null){
					break;
				}
				printSetOfStatements(result);
			} 
			else if (theQuery.isDescribe()) {
				SetOfStatements result = decider.getNextSparqlDescribeResult();
				if(result == null){
					break;
				}
				printSetOfStatements(result);
			} 
			else if (theQuery.isAsk()) {
				BooleanInformationSet result = decider.getNextSparqlAskResult();
				if(result == null){
					break;
				}
				printBoolean(result);
			}
		}	
		log.info( "**** FINISHED ****" );
	}

	// Methods related to printing stuff
	
	private static void printOriginalQuery(String query) {
		Logger log = LoggerFactory.getLogger(ConfigurableSimplePipeline.class);
		log.info("Query");
		log.info("==============================================================");
		log.info(query);
		log.info("");
	}
	
	private static void printVariableBindings(VariableBinding bindings) {
		Logger log = LoggerFactory.getLogger(ConfigurableSimplePipeline.class);
		log.info("Variable Bindings");
		log.info("==============================================================");

		int k = 0;
		int numCols = bindings.getVariables().size();
		int[] colWidth = new int[numCols];
		for (int col = 0; col < numCols; ++col){
			colWidth[col] = bindings.getVariables().get(col).length();
		}
		
		List<String[]> formatted = new ArrayList<String[]>();
		Iterator<VariableBinding.Binding> bindingIterator = bindings.iterator();
		while (bindingIterator.hasNext()) {
			VariableBinding.Binding binding = bindingIterator.next();

			String[] row = new String[numCols];
			for (int col = 0; col < numCols; ++col) {
				String value = binding.getValues().get(col).toString();
				int len = value.length();
				if (len > colWidth[col]){
					colWidth[col] = len;
				}
				row[col] = value;
			}
			formatted.add(row);
		}

		log.info("|");
		for (int col = 0; col < numCols; ++col){
			log.info(toString(bindings.getVariables().get(col), colWidth[col]) + "|");
		}
		log.info("");

		log.info("|");
		for (int col = 0; col < numCols; ++col){
			log.info(line(colWidth[col]) + "|");
		}
		log.info("");

		Iterator<String[]> it = formatted.iterator();
		while (it.hasNext()) {
			k++;
			String[] row = it.next();
			log.info("|");
			for (int col = 0; col < numCols; ++col) {
				log.info(toString(row[col], colWidth[col]) + "|");
			}
			log.info("");
		}
		log.info("\n # Bindings: " + k);
		log.info("");
	}
	
	private static void printSetOfStatements(SetOfStatements theSetOfStatements) {
		Logger log = LoggerFactory.getLogger(ConfigurableSimplePipeline.class);
		final String subject = "Subject";
		final String predicate = "Predicate";
		final String object = "Object";
		
		int k = 0;
		int maxSubject = subject.length();
		int maxPredicate = predicate.length();
		int maxObject = object.length();
		
		
		CloseableIterator<Statement> s = theSetOfStatements.getStatements();
		ArrayList <Statement> sts = new ArrayList <Statement> ();
		while (s.hasNext()){
			Statement st = s.next();
			if (st != null){
				sts.add(st);
				int slen = st.getSubject().toString().length();
				if( slen > maxSubject )
					maxSubject = slen;
				int plen = st.getPredicate().toString().length();
				if( plen > maxPredicate )
					maxPredicate = plen;
				int olen = st.getObject().toString().length();
				if( olen > maxObject )
					maxObject = olen;
			}
		}
		s.close();
		
		log.info("Set Of Statements");
		log.info("==============================================================");
		log.info("|" + toString( subject, maxSubject) + "|" + toString( predicate, maxPredicate) + "|" + toString( object, maxObject ) + "|");
		log.info("|" + line( maxSubject) + "|" + line( maxPredicate) + "|" + line( maxObject ) + "|");
		for (Statement st : sts){		
			if (st != null){
				k++;
				log.info("|" + toString( st.getSubject(), maxSubject ) + "|" + toString( st.getPredicate(), maxPredicate ) + "|" + toString( st.getObject(), maxObject ) + "|" );
			}
		}
		log.info("\n # of Statements: " + k);
		log.info("");
	}
	
	private static String toString(Object object, int length) {
		StringBuilder buffer = new StringBuilder();
		buffer.append(object.toString());
		while (buffer.length() < length){
			buffer.append(' ');
		}
		return buffer.toString();
	}

	private static String line(int length) {
		StringBuilder buffer = new StringBuilder();
		while (buffer.length() < length){
			buffer.append('-');
		}
		return buffer.toString();
	}

	private static void printBoolean(BooleanInformationSet result) {
		Logger log = LoggerFactory.getLogger(ConfigurableSimplePipeline.class);
		log.info("Boolean Result");
		log.info("==============================================================");
		System.out.print(result.getValue());
		log.info("");
	}
}
