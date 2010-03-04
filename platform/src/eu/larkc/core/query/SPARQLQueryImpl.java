package eu.larkc.core.query;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.openrdf.model.URI;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.impl.DatasetImpl;
import org.openrdf.query.parser.ParsedBooleanQuery;
import org.openrdf.query.parser.ParsedGraphQuery;
import org.openrdf.query.parser.ParsedQuery;
import org.openrdf.query.parser.ParsedTupleQuery;
import org.openrdf.query.parser.sparql.SPARQLParser;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.DataSetImpl;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SPARQLEndpoint;

/**
 * SPARQLQueryImpl is the default SPARQLQuery implementation.
 * 
 * @author vassil
 * 
 */
public class SPARQLQueryImpl implements SPARQLQuery {

	private ParsedQuery query;
	private static SPARQLParser parser = new SPARQLParser();
	private String originalQuery;
	private String originalNS;
	private URI label;
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the class.
	 * 
	 * @param query
	 *            SPARQL query
	 * @param ns
	 *            default namespace to be applied
	 */
	public SPARQLQueryImpl(String query, String ns) {
		if (query == null || ns == null) {
			throw new IllegalArgumentException("null!");
		}
		try {
			this.query = parser.parseQuery(query, ns);
			this.originalQuery = query;
			this.originalNS = ns;
		} catch (MalformedQueryException mqe) {
			throw new IllegalArgumentException("Not a valid SPARQL query!", mqe);
		}
	}

	/**
	 * Constructor of the class.
	 * 
	 * @param query
	 *            SPARQL query
	 */
	public SPARQLQueryImpl(String query) {
		this(query, RDF.TYPE.stringValue());
	}

	public boolean isAsk() {
		return query instanceof ParsedBooleanQuery;
	}

	public boolean isDescribe() {
		if (getGraphQuery() < 0) {
			return true;
		}
		return false;
	}

	public boolean isConstruct() {
		if (getGraphQuery() > 0) {
			return true;
		}
		return false;
	}

	public boolean isSelect() {
		return query instanceof ParsedTupleQuery;
	}

	public DataSet getDataSet() {
		SPARQLEndpoint local = DataFactory.INSTANCE.createRdfStoreConnection();
		return new DataSetImpl(local, query.getDataset().getDefaultGraphs(),
				query.getDataset().getNamedGraphs());
	}

	public void setDataSet(DataSet ds) {
		if (LocalStoreSPARQLService.class.isInstance(ds.getSPARQLEndpoint()) == false) {
			throw new IllegalArgumentException(
					"Remote dataset could not be assigned"
							+ " to local queries!");
		}
		DatasetImpl d = new DatasetImpl();
		if (ds != null) {
			for (RdfGraph g : ds.getDefaultGraphs()) {
				d.addDefaultGraph(g.getName());
			}
			for (RdfGraph g : ds.getNamedGraphs()) {
				d.addNamedGraph(g.getName());
			}
		}
		query.setDataset(d);
	}

	public URI getLabelledGroup() {
		return label;
	}

	public void setLabelledGroup(URI label) {
		this.label = label;
	}
	
	public ParsedQuery getParsedQuery() {
		return query;
	}

	public String toString() {
		return originalQuery;
	}

	/**
	 * Check the query type.
	 * 
	 * @return 1 >= construct, 0 = other, -1 <= describe
	 */
	private int getGraphQuery() {
		if (query instanceof ParsedGraphQuery == false) {
			return 0;
		}
		int c = originalQuery.toUpperCase().indexOf("CONSTRUCT");
		if (c == -1) {
			return -1;
		}
		int d = originalQuery.toUpperCase().indexOf("DESCRIBE");
		if (d == -1) {
			return 1;
		}
		return d - c;
	}

	// Custom serialization
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeObject(originalQuery);
		out.writeObject(originalNS);
	}

	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		originalQuery = (String) in.readObject();
		originalNS = (String) in.readObject();
		try {
			this.query = parser.parseQuery(originalQuery, originalNS);
		} catch (MalformedQueryException mqe) {
			throw new RuntimeException("Invalid internal validation!");
		}
	}
}
