//FIXME: Include licensing header
package eu.larkc.plugin.transform.gate;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.plugin.Contract;
import gate.ri.RandomIndexing;
import gate.ri.airhead.RandomIndexingAH;

public class RandomIndexingTransformer implements QueryTransformer {

	private static Logger logger = LoggerFactory.getLogger(RandomIndexingTransformer.class);
	
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

	public Set<Query> transform(Query theQuery, Contract theContract, Context theContext) {
		
		if(theQuery instanceof SPARQLQuery) {
			// extract keywords from input query
			Collection<String> keywords = SparqlToKeywords.extractKeywords(theQuery.toString());
			
			try {
				for (String word : keywords) {
					// for each keyword we find similar ones according to RI
					// (similar URIs as well)

					// then we extend the sparql query by adding the additional
					// filter
					RandomIndexing randomIndexing = new RandomIndexingAH();
					//TODO: Extract filename from input query
					String filePath = "plugins/RandomIndexingTransformer/input/lld1-docs-vectors.sspace";
					/* this parameter is required only if the vectors are not generated */
					String corpusOrFile = "resources/mooney-sample";
					randomIndexing.setCorpusOrFile(corpusOrFile);
					int numberOfSimilarWords = 10;
					randomIndexing.setFilePath(filePath);
					randomIndexing.setNumberOfSimilarWords(numberOfSimilarWords);
					
					Set<String> similarWords = randomIndexing.findSimilarTerms(
							randomIndexing.getFilePath(), word, randomIndexing.getNumberOfSimilarWords(),
							true);

					SparqlGenerator sparqlGenerator = new SparqlGenerator();
					
					List<SPARQLQuery> queries = sparqlGenerator
							.generateSparqlQueries(theQuery.toString(), similarWords);
			
					return new HashSet<Query>(queries);
				}
			} catch (Exception ex) {
				logger.error(ex.toString());
			}
		}
		else {
			//TODO: Throw exception
		}
		
		return null;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}
	
	//For internal testing purposes only
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		logger.info("Starting RI...");
		RandomIndexingTransformer riTransformer = new RandomIndexingTransformer();
	
		String sparqlQuery = "SELECT ?s ?p ?o" +
				"WHERE {" +
				"{ ?s ?p ?o . ?s ?p \"trauma\"} }";
		
		logger.info("Using '"+sparqlQuery+"' as input");
		
		SPARQLQuery inputQuery = DataFactoryImpl.INSTANCE.createSPARQLQuery(sparqlQuery);
		
		logger.info("Beginning transformation...");
		Set<Query> queries = riTransformer.transform(inputQuery, null, null);
		
		if(queries != null) {
			for (Query query : queries)
				logger.info(query.toString());
		}
		
		System.out.println("Finished in " + (System.currentTimeMillis()-startTime) + " ms");
	}
}
