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

import org.openrdf.model.URI;

import eu.larkc.core.query.SPARQLQuery;

/**
 * SPARQLEndpoint is interface to SPARQL endpoint. The interface is
 * 
 * @author vassil
 * 
 */
public interface SPARQLEndpoint {

	/**
	 * Creates a SPARQL dataset from this endpoint.
	 * 
	 * @param defaultGraphs
	 *            is list of default graphs
	 * @param namedGraphs
	 *            is a list of named graphs
	 * @return dataset
	 */
	public DataSet createDataSet(Collection<URI> defaultGraphs,
			Collection<URI> namedGraphs);
	
	/**
	 * Creates a named graph from this endpoint.
	 * @param graph is the URI of the named graph
	 * @return named graph
	 */
	public RdfGraph createRdfGraph(URI graph);

	/**
	 * Executes ASK query. If the submitted query is not ASK a runtime exception
	 * will be generated.
	 * 
	 * @param query
	 *            is ask query to be executed
	 * @return true or false
	 */
	public boolean executeAsk(SPARQLQuery query);

	/**
	 * Executes CONSTRUCT or DESCRIBE query. If the submitted query is not
	 * CONSTRUCT or DESCRIBE a runtime exception will be generated.
	 * 
	 * @param query
	 *            is construct or describe query to be executed
	 * @return set of rdf statements
	 */
	public SetOfStatements executeConstruct(SPARQLQuery query);

	/**
	 * Executes SELECT query. If the submitted query is not SELECT a runtime
	 * exception will be generated.
	 * 
	 * @param query
	 *            is select query to be executed
	 * @return list of solutions
	 */
	public VariableBinding executeSelect(SPARQLQuery query);

}
