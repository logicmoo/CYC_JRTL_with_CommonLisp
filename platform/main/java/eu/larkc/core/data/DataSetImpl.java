/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
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
 * Default implementation of a data set.
 * 
 * @author vassil
 */
public class DataSetImpl implements DataSet {

	/** Generated Serial Version UID. */
	private static final long serialVersionUID = -2488891715384699605L;

	/** The endpoint. */
	private final SPARQLEndpoint endpoint;

	/** The dataset. */
	private final DatasetImpl dataset;

	/** The time stamp. */
	private final long timeStamp = System.currentTimeMillis();

	/**
	 * Instantiates a new data set impl.
	 * 
	 * @param endpoint
	 *            the endpoint
	 * @param defaultGraphs
	 *            the default graphs
	 * @param namedGraphs
	 *            the named graphs
	 */
	public DataSetImpl(SPARQLEndpoint endpoint, Collection<URI> defaultGraphs,
			Collection<URI> namedGraphs) {
		if (endpoint == null) {
			throw new IllegalArgumentException("SPARQL endpoint must not be null");
		}
		this.endpoint = endpoint;
        if(LARKC_1_1)
		this.dataset = new DatasetImplSerializationProxy();
        else
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.core.data.DataSet#addAll(eu.larkc.core.data.DataSet)
	 */
	@Override
	public void addAll(DataSet ds) {
		if (ds.getSPARQLEndpoint().equals(endpoint) == false) {
			throw new IllegalArgumentException(
					"Invalid SPARQL endpoint to be combined!");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.core.data.DataSet#getDefaultGraphs()
	 */
	@Override
	public Set<RdfGraph> getDefaultGraphs() {
		Set<RdfGraph> result = new HashSet<RdfGraph>();
		for (URI u : dataset.getDefaultGraphs()) {
			result.add(new RdfGraphDataSet(u, endpoint));
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.core.data.DataSet#getNamedGraphs()
	 */
	@Override
	public Set<RdfGraph> getNamedGraphs() {
		Set<RdfGraph> result = new HashSet<RdfGraph>();
		for (URI u : dataset.getNamedGraphs()) {
			result.add(new RdfGraphDataSet(u, endpoint));
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.core.data.DataSet#getSPARQLEndpoint()
	 */
	@Override
	public SPARQLEndpoint getSPARQLEndpoint() {
		return endpoint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.larkc.core.data.SetOfStatements#getStatements()
	 */
	@Override
	public CloseableIterator<Statement> getStatements() {
		String q = "construct {?s ?p ?o} WHERE {?s ?p ?o}";
		SPARQLQuery query = new SPARQLQueryImpl(q);
		query.setDataSet(this);
		return endpoint.executeConstruct(query).getStatements();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// the mutable hashcodes are risky (timeStamp)
		return dataset.toString().hashCode();
	}

	/**
	 * Read resolve method for DataSetImplSerializationProxy
	 * 
	 * @return the object
	 */
    @Override
	private Object readResolve() {
		return new DataSetImpl(endpoint, dataset.getDefaultGraphs(), dataset
				.getNamedGraphs()); // Uses public constructor
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + timeStamp + ", " + endpoint + ", " + dataset + "]";
	}
}
