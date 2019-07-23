package eu.larkc.core.data;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RDFProviders extends ORDITestCase {

	public final static int TOPIC_COUNT = 49;
	public final static String TOPIC_URL = "http://dbpedia.org/resource/Ontotext";

	/**
	 * This example demonstrate how to pass RdfGraph by Value
	 */
	@Test
	public void testPassGraphByValue() {
		URI uri = new URIImpl(TOPIC_URL);

		// Access RDF graph exposed according linked data principles
		RdfGraph remote = df.createRemoteRdfGraph(uri);

		// Transfer all remote data
		CloseableIterator<Statement> iter = remote.getStatements();
		Set<Statement> statements = new HashSet<Statement>();
		while (iter.hasNext()) {
			Statement s = iter.next();
			statements.add(s);
		}

		// Create a RdfGraph passed by value
		URI graphName = new URIImpl(TOPIC_URL);
		RdfGraph graph = df.createRdfGraph(statements, graphName);

		// Send to another component transparently
		printGraph(graph, TOPIC_COUNT);
	}

	/**
	 * This example demonstrate how to pass RdfGraph by HTTP reference.
	 */
	@Test
	public void testPassGraphByHTTPReference() throws Exception {
		URI uri = new URIImpl(TOPIC_URL);

		// Access RDF graph exposed according linked data principles
		RdfGraph remote = df.createRemoteRdfGraph(uri);

		// Send to another component transparently
		printGraph(remote, TOPIC_COUNT);
	}

	/**
	 * This example demonstrate how to pass RdfGraph by SPARQL dataset
	 * reference.
	 */
	@Test
	public void testPassGraphByDatasetReference() {

		// Create a new DataSet
		URI uri = new URIImpl(TOPIC_URL);
		RdfGraph remote = df.createRemoteRdfGraph(uri);

		// Create a graph for this DataSet (it lives only in repository)
		RdfStoreConnection con = df.createRdfStoreConnection();
		CloseableIterator<Statement> i = remote.getStatements();
		while (i.hasNext()) {
			Statement s = i.next();
			con.addStatement(s.getSubject(), s.getPredicate(), s.getObject(),
					(URI) s.getContext());
		}

		Set<URI> dataSetURI = new HashSet<URI>();
		dataSetURI.add(remote.getName());
		DataSet ds = con.createDataSet(dataSetURI, dataSetURI);

		// Pass the DataSet by reference
		printGraph(ds, TOPIC_COUNT);
	}

	/**
	 * This example demonstrate how to pass RdfGraph by labeled group
	 * reference.
	 */
	@Test
	public void testPassGraphByLabelledGroup() throws Exception {
		RdfStoreConnection con = df.createRdfStoreConnection();
		LabelledGroupOfStatements group = con.createLabelledGroupOfStatements();
		boolean result = group.includeStatement(null, null, null, null);
		assertEquals(true, result);

		// Pass the labeled group by reference
		printGraph(group, TOPIC_COUNT);
	}

	/**
	 * The implementor of the method do not know whether it's a value or
	 * reference graph.
	 * 
	 * @param graph
	 */
	public void printGraph(SetOfStatements graph, int expectedCount) {
		Logger log = LoggerFactory.getLogger(RDFProviders.class);
		log.info("",graph.getClass());
		CloseableIterator<Statement> iter = graph.getStatements();

		int count = 0;
		while (iter.hasNext()) {
			iter.next();
			count++;
		}
		assertEquals(count, expectedCount);
	}
}
