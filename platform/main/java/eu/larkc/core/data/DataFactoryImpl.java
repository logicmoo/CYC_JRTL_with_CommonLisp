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

import org.apache.log4j.Logger;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

/**
 * This is a dummy factory to abstract ORDI creation specifics.
 * 
 * @author vassil
 * 
 */
public class DataFactoryImpl implements DataFactory {

	private static Logger logger = Logger.getLogger(DataFactory.class);
	public static String REFERENCE_TYPES_CACHE_TIME_PROP = "eu.larkc.core.data.reference-type-cache-time";
	public static long REFERENCE_TYPES_CACHE_TIME = 1000 * 60;

	private DataFactoryImpl() {
		initReferenceTypeCache();
	}

	public synchronized static DataFactoryImpl getInstance() {
		return new DataFactoryImpl();
	}

	/**
	 * Creates a RDF graph that will be passed by value.
	 * 
	 * @param graph
	 *            name (may be null)
	 * @param sts
	 *            collection of the statements
	 * @return the graph
	 */
	@Override
	public RdfGraph createRdfGraph(Iterable<Statement> sts, URI graph) {
		return new RdfGraphInMemory(graph, sts);
	}

	/**
	 * Creates RDF graph from a remote location. If the URI could not be
	 * resolved an exception will be generated during the construction of the
	 * graph.
	 * 
	 * @param uri
	 *            to be resolved
	 * @return the constructed rdf graph
	 */
	@Override
	public RdfGraph createRemoteRdfGraph(URI uri) {
		return new HTTPRemoteGraph(uri);
	}

	/**
	 * Creates a connection to local storage.
	 * 
	 * @return a connection to the local store
	 */
	@Override
	public RdfStoreConnection createRdfStoreConnection() {
		if (DataLayerService.getORDI() == null) {
			throw new UnsupportedOperationException(
					"Cannot access remote data layer instance!");
		}

		return new RdfStoreConnectionImpl(DataLayerService.getORDI()
				.getConnection());
	}

	/**
	 * Create a connection to remote SPARQL endpoint. If the URI is not
	 * resolvable or SPARQL enabled service could not be found an exception will
	 * be generated after constructing the object.
	 * 
	 * @param uri
	 * @return
	 */
	@Override
	public SPARQLEndpoint createSPARQLEndpoint(URI uri) {
		throw new UnsupportedOperationException(
				"The execution of remote SPARQL endpoints "
						+ "is still not supported! Please use "
						+ "createRdfStoreConnection() method instead!");
	}

	@Override
	public SPARQLQuery createSPARQLQuery(String query) {
		return new SPARQLQueryImpl(query);
	}

	@Override
	public SPARQLQuery createSPARQLQuery(String query, URI label) {
		SPARQLQuery sparql = createSPARQLQuery(query);
		sparql.setLabelledGroup(label);
		return sparql;
	}

	@Override
	public SPARQLQuery createSPARQLQuery(String query, String ns, URI label) {
		SPARQLQuery sparql = new SPARQLQueryImpl(query, ns);
		sparql.setLabelledGroup(label);
		return sparql;
	}

	private void initReferenceTypeCache() {
		String ct = System.getProperty(REFERENCE_TYPES_CACHE_TIME_PROP);
		try {
			REFERENCE_TYPES_CACHE_TIME = Long.parseLong(ct);
			logger.info(String
					.format("New value (%d) for %s has been set!",
							REFERENCE_TYPES_CACHE_TIME,
							REFERENCE_TYPES_CACHE_TIME_PROP));
		} catch (NumberFormatException nfe) {
			if (ct != null) {
				logger.warn(String.format(
						"Invalid set value for %s. Keep using the value %d!",
						REFERENCE_TYPES_CACHE_TIME_PROP,
						REFERENCE_TYPES_CACHE_TIME));
			}
		}
	}
}
