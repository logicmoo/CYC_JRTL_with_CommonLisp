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
