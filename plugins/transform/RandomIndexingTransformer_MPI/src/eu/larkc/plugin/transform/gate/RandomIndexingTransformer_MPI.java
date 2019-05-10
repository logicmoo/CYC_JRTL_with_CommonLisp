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

public class RandomIndexingTransformer_MPI implements QueryTransformer {

	private static Logger logger = LoggerFactory.getLogger(RandomIndexingTransformer_MPI.class);
	
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
					//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
					//IMPORTANT: find the alternative way to pass on the ri 
					//parameters as the contract is not aimed to be used for this
					//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
					
					System.out.println("Hello from the MPI transformer");
					
					
					RandomIndexing randomIndexing = new RandomIndexingAH();
					//TODO: Extract filename from input query
					String filePath;
					if (System.getProperty("larkc.location") != null)
						filePath = System.getProperty("larkc.location")+"/plugins/RandomIndexingTransformer_MPI/input/lld1-docs-vectors.sspace";
					else
						filePath = "plugins/RandomIndexingTransformer_MPI/input/lld1-docs-vectors.sspace";
					/* this parameter is required only if the vectors are not generated */
					int numberOfSimilarWords = 10;
					
					Set<String> similarWords = randomIndexing.findSimilarTerms(
							filePath, word, numberOfSimilarWords, true);

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
		logger.debug("Starting RI...");
		RandomIndexingTransformer_MPI riTransformer = new RandomIndexingTransformer_MPI();
	
		String sparqlQuery = "SELECT ?s ?p ?o" +
				"WHERE {" +
				"{ ?s ?p ?o . ?s ?p \"trauma\"} }";
		
		logger.debug("Using '"+sparqlQuery+"' as input");
		
		SPARQLQuery inputQuery = DataFactoryImpl.INSTANCE.createSPARQLQuery(sparqlQuery);
		
		logger.debug("Beginning transformation...");
		Set<Query> queries = riTransformer.transform(inputQuery, null, null);
		
		if(queries != null) {
			for (Query query : queries)
				System.out.println(query.toString());
		}
	}
}
