package eu.larkc.core.data;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This test class demonstrate the accept request made by the default
 * RemoteRdfGraph.
 * 
 * @author vassil
 * 
 */
public class TestRemoteRdfHeader {

	private static final String host = "http://richard.cyganiak.de/2008/03/rdfbugs/accept.php";

	@org.junit.Test
	public void testRemoteHeader() {
		Logger log = LoggerFactory.getLogger(TestRemoteRdfHeader.class);
		URI uri = new URIImpl(host);
		RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(uri);
		CloseableIterator<Statement> iter = graph.getStatements();
		while (iter.hasNext()) {
			log.info("" + iter.next());
		}
	}
}
