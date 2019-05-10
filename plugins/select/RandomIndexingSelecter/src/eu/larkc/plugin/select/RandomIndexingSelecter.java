package eu.larkc.plugin.select;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SetOfStatementsMerger;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import gate.ri.RandomIndexing;
import gate.ri.airhead.RandomIndexingAH;
import gate.ri.sv.RandomIndexingSV;

/**
 * This is a RI based selecter: takes as input SPARQL query, extract keywords
 * (using Baseline selector method); run RI term-term similarity to find similar
 * literal strings or URIs and then refines the base query using this list;
 * 
 * vectors are build externally and the vector file is passed through Contract
 * 
 * @author Danica Damljanovic
 * 
 */
public class RandomIndexingSelecter implements Selecter {

	RdfStoreConnection connection = null;

	RandomIndexing randomIndexingAH = new RandomIndexingAH();

	public static class PluginContract implements Contract {
		private static final long serialVersionUID = 4964585541551132712L;
		String theQuery;
		RandomIndexing randomIndexing;

		public RandomIndexing getRandomIndexing() {
			return randomIndexing;
		};

		public void setRandomIndexing(RandomIndexing randomIndexing) {
			this.randomIndexing = randomIndexing;
		}

		public PluginContract(String query, RandomIndexing randomIndexing) {
			theQuery = query;
			this.randomIndexing = randomIndexing;
		}

		public String getInputQuery() {
			return theQuery;
		}
	}

	SparqlGenerator sparqlGenerator = new SparqlGenerator();
	SparqlToKeywords sparqlToKeywords = new SparqlToKeywords();

	public RandomIndexingSelecter() {
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
	public LabelledGroupOfStatements select(SetOfStatements rdf,
			Contract contract, Context context) {
		String inputQuery = ((PluginContract) contract).getInputQuery();

		// establish connection to repository
		if (connection == null) {
			connection = DataFactory.INSTANCE.createRdfStoreConnection();
		}

		SPARQLEndpoint endpoint = null;

		if (rdf instanceof DataSet) {
			endpoint = ((DataSet) rdf).getSPARQLEndpoint();
		} else if (rdf instanceof LabelledGroupOfStatements) {
			endpoint = ((LabelledGroupOfStatements) rdf)
					.getRdfStoreConnection();
		} else {
			SetOfStatementsMerger merger = new SetOfStatementsMerger();
			merger.add(rdf);
			endpoint = merger.getRdfStoreConnection();
		}

		// create a new tripleset to be returned
		LabelledGroupOfStatements sos = connection
				.createLabelledGroupOfStatements();

		// extract keywords from input query
		Collection<String> keywords = sparqlToKeywords
				.extractKeywords(inputQuery.toString());

		try {
			for (String word : keywords) {
				// for each keyword we find similar ones according to RI
				// (similar URIs as well)

				// then we extend the sparql query by adding the additional
				// filter
				//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				//%%%%IMPORTANT: find the alternative way to pass on the ri 
				//parameters as the contract is not aimed to be used for this%%%%%%%%
				//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				RandomIndexing randomIndexing = new RandomIndexingAH();
				ResourceBundle rb = ResourceBundle
						.getBundle("eu.larkc.plugin.select.RandomIndexingSelecter");
				String filePath = rb.getString("vectorsFilePath");
				/* this parameter is required only if the vectors are not generated */
				String corpusOrFile = rb.getString("corpusOrFile");
				randomIndexing.setCorpusOrFile(corpusOrFile);
				int numberOfSimilarWords = 5;
				randomIndexing.setFilePath(filePath);
				randomIndexing.setNumberOfSimilarWords(numberOfSimilarWords);
				
				Set<String> similarWords = randomIndexing.findSimilarTerms(
						randomIndexing.getFilePath(), word, randomIndexing.getNumberOfSimilarWords(),
						true);

				List<SPARQLQuery> queries = sparqlGenerator
						.generateSparqlQueries(((PluginContract) contract)
								.getInputQuery(), similarWords);

				for (SPARQLQuery query : queries) {
					// SPARQLQuery query = new
					// SPARQLQueryImpl(searchQueryString);
					// search for relevant nodes in graph
					CloseableIterator<Binding> it = endpoint.executeSelect(
							query).iterator();
					Resource subject = null;
					URI predicate = null;
					Value object = null;
					while (it.hasNext()) {
						Binding column = (Binding) it.next();
						List<Value> values = column.getValues();
						for (Value value : values) {
							String subjectUri = value.stringValue();
							subject = new URIImpl(subjectUri);
							String predicateUri = value.stringValue();
							predicate = new URIImpl(predicateUri);
							object = value;
						}
					}

					StatementImpl st = new StatementImpl(subject, predicate,
							object);
					// select statement as part of the molecule
					sos.includeStatement(st);
				}

			}
		} catch (Exception ex) {
			System.err.println(ex);
			return null;
		}
		return sos;

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

	public static void main(String[] args) {
		runAHExampleSelecter();
		// runSVExampleSelecter();
	}

	/**
	 * example method to show how we can use airHead library to find similar
	 * words
	 */
	static void runAHExampleSelecter() {
		Logger log = LoggerFactory.getLogger(RandomIndexingSelecter.class);
		// Instantiate the RandomIndexingAHSelecter
		log.info("Generating ri selecter...");
		RandomIndexingSelecter s = new RandomIndexingSelecter();
		// Create plug-in contract
		String sparqlQuery = "SELECT ?s ?p ?o WHERE { ?s ?p ?o . filter ( ?o='alaska') . }";

		RandomIndexing randomIndexing = new RandomIndexingAH();
		ResourceBundle rb = ResourceBundle
				.getBundle("eu.larkc.plugin.select.RandomIndexingSelecter");
		String filePath = rb.getString("vectorsFilePath");
		/* this parameter is required only if the vectors are not generated */
		String corpusOrFile = rb.getString("corpusOrFile");
		randomIndexing.setCorpusOrFile(corpusOrFile);
		int numberOfSimilarWords = 5;
		randomIndexing.setFilePath(filePath);
		randomIndexing.setNumberOfSimilarWords(numberOfSimilarWords);
		Contract contract = new PluginContract(new String(sparqlQuery),
				randomIndexing);
		log.info("Generating contract with baseQuery..."
				+ ((PluginContract) contract).getInputQuery());

		DataFactory df = DataFactory.INSTANCE;
		LabelledGroupOfStatements ts = (LabelledGroupOfStatements) s.select(df
				.createRdfGraph(Arrays.<Statement> asList(), new URIImpl(
						"urn:temp")), contract, null);
		// SetOfStatements sos = new HTTPRemoteGraph(
		// new URIImpl(
		// "http://www.ninebynine.org/Software/HaskellRDF/RDF/Harp/test/wine.rdf"));
		// Do selection
		ts = s.select(ts, contract, null);
		// LabelledGroupOfStatements ts = s.select(sos, contract, null);
		if (ts != null)
			log.info("tripleset-uri: " + ts.getLabel());

	}

	/**
	 * sample method showing how we can use SemanticVectors library
	 */
	static void runSVExampleSelecter() {
		Logger log = LoggerFactory.getLogger(RandomIndexingSelecter.class);
		log.info("now using semantic vectors library...");
		RandomIndexingSelecter s = new RandomIndexingSelecter();
		// Create plug-in contract
		String sparqlQuery = "SELECT ?s ?p ?o WHERE { ?s ?p ?o . filter ( ?o='alaska') . }";

		RandomIndexing randomIndexing = new RandomIndexingSV();
		ResourceBundle rb = ResourceBundle
				.getBundle("eu.larkc.plugin.select.RandomIndexingAHSelecter");
		String filePath = rb.getString("vectorsFilePath");
		int numberOfSimilarWords = 5;
		randomIndexing.setFilePath(filePath);
		randomIndexing.setNumberOfSimilarWords(numberOfSimilarWords);
		Contract contract = new PluginContract(new String(sparqlQuery),
				randomIndexing);
		log.info("Generating contract with baseQuery..."
				+ ((PluginContract) contract).getInputQuery());

		DataFactory df = DataFactory.INSTANCE;
		LabelledGroupOfStatements ts = (LabelledGroupOfStatements) s.select(df
				.createRdfGraph(Arrays.<Statement> asList(), new URIImpl(
						"urn:temp")), contract, null);
		// SetOfStatements sos = new HTTPRemoteGraph(
		// new URIImpl(
		// "http://www.ninebynine.org/Software/HaskellRDF/RDF/Harp/test/wine.rdf"));
		// Do selection
		ts = s.select(ts, contract, null);
		// LabelledGroupOfStatements ts = s.select(sos, contract, null);
		if (ts != null)
			log.info("tripleset-uri: " + ts.getLabel());

	}
}
