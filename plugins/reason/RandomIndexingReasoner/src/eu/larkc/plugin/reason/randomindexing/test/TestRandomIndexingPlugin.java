/**
 * 
 */
package eu.larkc.plugin.reason.randomindexing.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junitx.framework.ListAssert;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.reason.randomindexing.RandomIndexing;
import eu.larkc.plugin.reason.randomindexing.StatementImpl;

/**
 * Simple class to test the ESA plugin; It does not use the Larkc Platform, it
 * just calls the Esa's plugin " sparqlConstruct(...)" method, which in turn
 * sends a query to the web service for further processing;
 * 
 * @author R.B.Vidal/ Max-Planck Institute Berlin
 * 
 */
public class TestRandomIndexingPlugin extends TestCase {
	private static Logger log = Logger.getLogger(TestRandomIndexingPlugin.class
			.getCanonicalName());
	private final static String SELECT_QUERY_1 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
			+ "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n"
			+ "SELECT DISTINCT ?name ?person2 where {\n"
			+ "?person rdf:type foaf:Person .\n"
			+ "?person foaf:name \"Oscar Alin\" .\n"
			+ "?person2 rdf:type foaf:Person .\n"
			+ "?person2 foaf:knows ?person .\n"
			+ "?person2 foaf:name ?name .\n" + "}";
	private final static String SELECT_QUERY_2 = "PREFIX dbp-ont: <http://dbpedia.org/ontology/> PREFIX dbp-prop: <http://dbpedia.org/property/> PREFIX skos: <http://www.w3.org/2004/02/skos/core#> PREFIX dbpedia: <http://dbpedia.org/resource/> PREFIX dbp-cat: <http://dbpedia.org/resource/Category:>  SELECT distinct ?Country ?City WHERE { 	 ?Country dbp-ont:capital ?City . 			?City skos:subject dbp-cat:Capitals_in_Europe . 			?Country dbp-ont:governmenttype dbpedia:Parliamentary_republic .}";

	public TestRandomIndexingPlugin() {

	}

	public static Test suite() {
		return new TestSuite(TestRandomIndexingPlugin.class);
	}

	/**
	 *  Tests the results obtained from the webservice (using the query 'SELECT_QUERY_2' (see above), 
	 *  and the SetOfStatements object, looking in the set for the  pre-defined strings defined bellow as 'expectedResutlOne' and 
	 *   'expectedResutlTwo';
	 *   
	 *  If the set contains those strings, the results from the web service are correct. This test works only for one specific version
	 *  of dbpedia  that generated the random indexing vector files.  If those vectors are created with another version from 
	 *  the dbpedia, please replace the "expectedResutl...' variables with other expected values.
	 *  
	 *  
	 * @throws Exception
	 */
	public void testWebServiceResults() throws Exception {
		final String expectedResutlOne = "mpib:'Parliamentary republic'    rdf:resource    http://en.wikipedia.org/wiki/Parliamentary_republic";
		final String expectedResutlTwo = "mpib:'Western Europe'    skos:related    http://en.wikipedia.org/wiki/Western_Europe";
		List<String> resultsFromWebServiceList = new ArrayList<String>();
		RandomIndexing qt = new RandomIndexing();

		SetOfStatements result = qt.sparqlConstruct(new SPARQLQueryImpl(
				SELECT_QUERY_2), null, null, null);
		CloseableIterator<?> it = result.getStatements();
		//Set statemensSet = new TreeSet();

		while (it.hasNext()) {
			StatementImpl statementImpl = (StatementImpl) it.next();
			String tempStatement = statementImpl.getSubject() + "    "
					+ statementImpl.getPredicate() + "    "
					+ statementImpl.getObject();
			log.info(tempStatement);
			resultsFromWebServiceList.add(tempStatement);
		}
		ListAssert.assertContains(resultsFromWebServiceList, expectedResutlOne);
		ListAssert.assertContains(resultsFromWebServiceList, expectedResutlTwo);

		 
	}

}
