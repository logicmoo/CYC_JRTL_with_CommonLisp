package eu.larkc.core.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.query.impl.DatasetImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

/**
 * @author vassil
 */
public class DataSetImpl implements DataSet {

	private static final long serialVersionUID = 1L;
	private final SPARQLEndpoint endpoint;
	private final DatasetImpl dataset;
	private final long timeStamp = System.currentTimeMillis();

	public DataSetImpl(SPARQLEndpoint endpoint, Collection<URI> defaultGraphs,
			Collection<URI> namedGraphs) {
		if (endpoint == null) {
			throw new IllegalArgumentException("null!");
		}
		this.endpoint = endpoint;
		this.dataset = new DatasetImpl();
		if (defaultGraphs != null) {
			for (URI u : defaultGraphs) {
				dataset.addDefaultGraph(u);
			}
		}
		if (namedGraphs != null) {
			for (URI u : namedGraphs) {
				dataset.addNamedGraph(u);
			}
		}
	}

	public void addAll(DataSet ds) {
		if (ds.getSPARQLEndpoint().equals(endpoint) == false) {
			throw new IllegalArgumentException(
					"Invalid SPARQL endpoint to be combined!");
		}

	}

	public Set<RdfGraph> getDefaultGraphs() {
		Set<RdfGraph> result = new HashSet<RdfGraph>();
		for (URI u : dataset.getDefaultGraphs()) {
			result.add(new RdfGraphDataSet(u, endpoint));
		}
		return result;
	}

	public Set<RdfGraph> getNamedGraphs() {
		Set<RdfGraph> result = new HashSet<RdfGraph>();
		for (URI u : dataset.getNamedGraphs()) {
			result.add(new RdfGraphDataSet(u, endpoint));
		}
		return result;
	}

	public SPARQLEndpoint getSPARQLEndpoint() {
		return endpoint;
	}

	public CloseableIterator<Statement> getStatements() {
		String q = "construct {?s ?p ?o} WHERE {?s ?p ?o}";
		SPARQLQuery query = new SPARQLQueryImpl(q);
		query.setDataSet(this);
		return endpoint.executeConstruct(query).getStatements();
	}

	public boolean equals(Object o) {
		if (o instanceof DataSetImpl == false) {
			return false;
		}
		if (dataset.toString().equals(((DataSetImpl) o).dataset.toString()) == false) {
			return false;
		}
		if (Math.abs(timeStamp - (((DataSetImpl) o).timeStamp)) > 
				DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		// the mutable hashcodes are risky (timeStamp)
		return dataset.toString().hashCode();
	}
}
