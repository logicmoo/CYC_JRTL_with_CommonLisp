package eu.larkc.core.data;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

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
		URI uri = new URIImpl(host);
		RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(uri);
		CloseableIterator<Statement> iter = graph.getStatements();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
