//FIXME: Include licensing header
package eu.larkc.plugin.identify;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.BindingSet;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.http.HTTPRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

public class RandomIndexingIdentifier implements Identifier {

	private static Logger logger = LoggerFactory.getLogger(RandomIndexingIdentifier.class);
	
	private boolean hasIdentified = false;
	
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

	private synchronized BindingSet getNextBinding(TupleQueryResult tqr) {
		try {
			if (!tqr.hasNext()) return null;
			return tqr.next();
		}
		catch (Exception e) {
			return null;
		}
	}

	//FIXME: Works only with queries of the form SELECT ?s ?p ?o. Throws NullPointer Exception if queries are selecting different
	private synchronized void store(HashSetOfStatements statements, Resource s, URI p, Value o) {
		statements.add(new StatementImpl(s, p, o));
	}

	private static class HashSetOfStatements extends HashSet<Statement> implements SetOfStatements {

		/**
		 * 
		 */
		private static final long serialVersionUID = -6479721576109275946L;

		@Override
		public CloseableIterator<Statement> getStatements() {
			return new SimpleCloseableIterator<Statement>(iterator());
		}

	}

	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context) {

		if(hasIdentified)
			return null;
		
		Collection<InformationSet> result = new HashSet<InformationSet>();
		
		if (!(theQuery instanceof SPARQLQuery))
			return result;

		SPARQLQuery sq = (SPARQLQuery)theQuery;

		System.setProperty("bk.endpoint", "http://linkedlifedata.com/");
		System.setProperty("bk.endpoint.username", "wp7b");
		System.setProperty("bk.endpoint.password", "wp7b");
		System.setProperty("repository.id", "owlim");

		final HashSetOfStatements statements = new HashSetOfStatements();

		try {

			Repository myRepository = new HTTPRepository(
					"http://linkedlifedata.com/", "owlim");
			String username = System.getProperty("bk.endpoint.username");
			String password = System.getProperty("bk.endpoint.password");
			if (username != null && password != null) {
				((HTTPRepository) myRepository).setUsernameAndPassword(
						username, password);
			}
			RepositoryConnection connection = myRepository.getConnection();
			connection.setAutoCommit(false);

			logger.info("Requesting tupels...");
			final TupleQueryResult tqResult = connection.prepareTupleQuery(
					QueryLanguage.SPARQL, sq.toString()).evaluate();

			int threads = Math.max(2, Runtime.getRuntime().availableProcessors()) - 1;
			logger.info("Using " + threads + " Threads");
			final CountDownLatch ct = new CountDownLatch(threads);

			long startTime = System.currentTimeMillis();

			for (int i = 0; i < threads ; ++i) {
				new Thread(){
					public void run(){

						try {
							BindingSet bindings = getNextBinding(tqResult);
							while (bindings != null) {
								try {

									store(statements,(Resource)bindings.getValue("s"),(URI)bindings.getValue("p"), bindings.getValue("o"));

									bindings = getNextBinding(tqResult);

								}
								catch (Exception e)
								{
									e.printStackTrace();
								}
							}
						}
						finally {
							ct.countDown();
						}
					}
				}.start();
			}

			ct.await();

			logger.info("Finished " + statements.size() + " statements in " + (System.currentTimeMillis()-startTime) + " ms");

			tqResult.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		result.add(statements);
		
		hasIdentified = true;

		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//For internal testing purposes only
	public static void main(String[] args) {
		RandomIndexingIdentifier riIdent = new RandomIndexingIdentifier();
	
		String sparqlQuery = "SELECT ?s ?p ?o " +
				"WHERE { { ?s ?p ?o . ?s ?p \"trauma\"}  " +
						"UNION {?s ?p ?o . ?s ?p 'MYOCARDIUM' } " +
						"UNION {?s ?p ?o . ?s ?p 'APRAXIAS' } " +
						"UNION {?s ?p ?o . ?s ?p 'level;' } " +
						"UNION {?s ?p ?o . ?s ?p 'superoxide' } " +
						"UNION {?s ?p ?o . ?s ?p 'envenomations' } }";
		
		SPARQLQuery inputQuery = DataFactoryImpl.INSTANCE.createSPARQLQuery(sparqlQuery);
		
		riIdent.identify(inputQuery, null, null);
	}
}
