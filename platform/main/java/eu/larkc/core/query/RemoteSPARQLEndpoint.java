package eu.larkc.core.query;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Collection;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.openrdf.model.URI;
import org.openrdf.rio.rdfxml.RDFXMLParser;

import com.ontotext.ordi.tripleset.ORDIConst;

import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.DataSetImpl;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfGraphDataSet;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;

/**
 * RemoteSPARQLEndpoint class automates the result reading from a specific
 * SPARQL endpoint available on the web.
 * 
 * @author vassil
 * 
 */
public class RemoteSPARQLEndpoint implements SPARQLEndpoint {

	private URI uri;

	public RemoteSPARQLEndpoint(URI uri) {
		if (uri == null) {
			throw new IllegalArgumentException();
		}
		this.uri = uri;
	}

	@Override
	public DataSet createDataSet(Collection<URI> defaultGraphs,
			Collection<URI> namedGraphs) {
		return new DataSetImpl(this, defaultGraphs, namedGraphs);
	}

	@Override
	public RdfGraph createRdfGraph(URI graph) {
		return new RdfGraphDataSet(graph, this);
	}

	@Override
	public boolean executeAsk(SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isAsk() == false) {
			throw new IllegalArgumentException("Only ask queries are supported!");
		}
		try {
			final InputStream rstr = sendHTTPGet(query);
			final SAXParserFactory factory = SAXParserFactory.newInstance();
			final SAXParser saxParser = factory.newSAXParser();
			final BooleanXmlVariableBinding result = new BooleanXmlVariableBinding();
			saxParser.parse(rstr, result.getDefaultHandler());
			return result.getResult();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public SetOfStatements executeConstruct(SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isSelect() == true || query.isAsk() == true ) {
			throw new IllegalArgumentException("Only construct queries are supported!");
		}
		final InputStream rstr = sendHTTPGet(query);
		final RDFXMLParser parser = new RDFXMLParser();
		final RDFXMLGraphResult result = new RDFXMLGraphResult();
		parser.setRDFHandler(result.getRDFHandler());
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					parser.parse(rstr, ORDIConst.DEFAULT_GRAPH);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		};
		Thread t = new Thread(task);
		t.start();
		return result;

	}

	@Override
	public VariableBinding executeSelect(SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isSelect() == false) {
			throw new IllegalArgumentException("Only selecte queries are supported!");
		}
		try {
			final InputStream rstr = sendHTTPGet(query);
			final SAXParserFactory factory = SAXParserFactory.newInstance();
			final SAXParser saxParser = factory.newSAXParser();
			final SelectXMLVariableBinding result = new SelectXMLVariableBinding();
			Runnable task = new Runnable() {
				@Override
				public void run() {
					try {
						saxParser.parse(rstr, result.getDefaultHandler());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
			};
			Thread t = new Thread(task);
			t.start();
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public InputStream sendHTTPGet(SPARQLQuery query) {
		URL queryURL = null;

		try {
			String qs = URLEncoder.encode(query.toString(), "UTF-8");
			queryURL = new URL(uri.stringValue()
					+ (uri.stringValue().endsWith("?query=") ? "" : "?query=")
					+ qs);
			URLConnection con = queryURL.openConnection();
			con.setRequestProperty("User-agent", "larkc-datalayer");
			if (query.isConstruct() || query.isDescribe()) {
				con.setRequestProperty("Accept", "application/rdf+xml");
			} else {
				con.setRequestProperty("Accept",
						"application/sparql-results+xml");
			}
			return con.getInputStream();
		} catch (IOException ioe) {
			throw new RuntimeException("Could not load the remote URL file:"
					+ queryURL);
		}
	}
}
