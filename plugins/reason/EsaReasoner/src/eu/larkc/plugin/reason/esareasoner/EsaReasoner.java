package eu.larkc.plugin.reason.esareasoner;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.CorruptIndexException_Exception;
import eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.IOException_Exception;
import eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.ParseException_Exception;
import eu.larkc.plugin.reason.esareasoner.util.QueryProcessor;

/**
 * The Esa Plugin gets a Sparql query as input, and does following:
 * 
 * 1) Extracts the keywords from that query, append them to a single string; 2)
 * Sends the that string to the Webservice at
 * http://urlwolfpack.gotdns.org:8080, 3) The webservice itself processes the
 * query, creating RDF statements with the most similar documents found in the
 * dbpedia; 4) Adds all statements to a SetOfStatements object, returns that
 * object to the calling class
 * 
 * @author R.B.Vidal / Max-Planck Institute Berlin
 * 
 */
public class EsaReasoner implements Reasoner {

	private static Logger log = Logger.getLogger(EsaReasoner.class
			.getCanonicalName());

	public EsaReasoner() {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.larkc.plugin.reason.Reasoner#sparqlAsk(eu.larkc.core.query.SPARQLQuery
	 * , eu.larkc.core.data.SetOfStatements, eu.larkc.plugin.Contract,
	 * eu.larkc.plugin.Context)
	 */
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeeu.larkc.plugin.reason.Reasoner#sparqlConstruct(eu.larkc.core.query.
	 * SPARQLQuery, eu.larkc.core.data.SetOfStatements,
	 * eu.larkc.plugin.Contract, eu.larkc.plugin.Context)
	 */

	/**
	 * This method uses the EsaPluginServiceStub to call the web service that
	 * runs the ESA plugin. The service returns an object of type
	 * ArrayOfString[], containing the statement triples that are related to the
	 * sparql query.
	 * 
	 * The query is stripped here ,so that we get the keywords in the query and
	 * send them to the web service, getting the triples related to the keywords
	 * as a response from the web service. Then an object of type
	 * {@link org.openrdf.model.Statement Statement } is created with each
	 * triple, and add them to a SetOfStatements object.
	 * 
	 */
	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		List<Statement> statementsList = new ArrayList<Statement>();
		// check that the query is really a Sparql query
		if (theQuery instanceof SPARQLQueryImpl) {

			float start = System.currentTimeMillis();
			java.util.List<net.java.dev.jaxb.array.StringArray> result = null;
			//init the webservice call
			eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.EsaRiWebServiceService service = new eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.EsaRiWebServiceService();
			eu.larkc.plugin.reason.esareasoner.esa_ri.webservice.EsaRiWebService port = service
					.getEsaRiWebServicePort();
			//call the webservice and get the created rdf statements

			try {
				result = port.getResultsUsingEsa(QueryProcessor
						.getKeywordsFromQuery(theQuery.toString()));
			} catch (CorruptIndexException_Exception e) {
				e.printStackTrace();
			} catch (IOException_Exception e) {
				e.printStackTrace();
			} catch (ParseException_Exception e) {
				e.printStackTrace();
			}
            // if got results, add them to a statementlist (each list member with subject,predicate,object);
			if (null != result && result.size() > 0) {
				log.info("Created  " + result.size()
						+ " RDF Statements from the Query");
				int count = 1;
				for (Object b : result) {
					statementsList.add(new StatementImpl(
							((net.java.dev.jaxb.array.StringArray) b).getItem()
									.get(0),
							((net.java.dev.jaxb.array.StringArray) b).getItem()
									.get(1),
							((net.java.dev.jaxb.array.StringArray) b).getItem()
									.get(2)));
					count++;
				}
			} else {
				log.info("No docs were found   ");
			}

		}
        // create a SetOfStatementsImpl object, usingthe statementlist as arg in its constructor;
		return new SetOfStatementsImpl(statementsList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeeu.larkc.plugin.reason.Reasoner#sparqlDescribe(eu.larkc.core.query.
	 * SPARQLQuery, eu.larkc.core.data.SetOfStatements,
	 * eu.larkc.plugin.Contract, eu.larkc.plugin.Context)
	 */
	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.larkc.plugin.reason.Reasoner#sparqlSelect(eu.larkc.core.query.SPARQLQuery
	 * , eu.larkc.core.data.SetOfStatements, eu.larkc.plugin.Contract,
	 * eu.larkc.plugin.Context)
	 */
	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.plugin.Plugin#getIdentifier()
	 */
	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.plugin.Plugin#getQoSInformation()
	 */
	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
