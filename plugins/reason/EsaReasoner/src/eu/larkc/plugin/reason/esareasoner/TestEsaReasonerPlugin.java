/**
 * 
 */
package eu.larkc.plugin.reason.esareasoner;



import java.util.Set;
import java.util.logging.Logger;


import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.core.query.TriplePattern;
import eu.larkc.core.query.TriplePatternQuery;
import eu.larkc.plugin.transform.QueryTransformer;

import eu.larkc.plugin.reason.esareasoner.EsaReasoner;

/**
 * @author brandao
 *
 */
public class TestEsaReasonerPlugin {
	private static Logger log = Logger.getLogger(TestEsaReasonerPlugin.class.getCanonicalName());
	
	private static String SELECT_QUERY = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
	"PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" + 
	"SELECT DISTINCT ?name ?person2 where {\n" + 
	"?person rdf:type foaf:Person .\n" + 
	"?person foaf:name \"Oscar Alin\" .\n" +
	"?person2 rdf:type foaf:Person .\n" + 
	"?person2 foaf:knows ?person .\n" +
	"?person2 foaf:name ?name .\n" +
	"}";
	/**
	 * 
	 */
	public TestEsaReasonerPlugin() {
		 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EsaReasoner qt = new EsaReasoner();
		
		SetOfStatements result = qt.sparqlConstruct(new SPARQLQueryImpl( SELECT_QUERY ), null, null,null);
		CloseableIterator it=result.getStatements();
		while(it.hasNext()){
			StatementImpl statementImpl=(StatementImpl)it.next();
		log.info(statementImpl.getSubject()+"    "+statementImpl.getPredicate()+"    "+statementImpl.getObject());
						
		}
	} 

	}

 

