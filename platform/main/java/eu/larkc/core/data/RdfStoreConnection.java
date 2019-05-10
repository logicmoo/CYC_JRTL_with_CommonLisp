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

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;

import eu.larkc.core.query.SPARQLQuery;

/**
 * RdfStoreConnection is database-like connection to RDF repository. The
 * connection is functional super set of SPARQL endpoint with write support.
 * 
 * @author vassil
 * 
 */
public interface RdfStoreConnection extends SPARQLEndpoint {

	/**
	 * Adds a new statement.
	 * 
	 * @return the newly added statement to the store
	 */
	public Statement addStatement(Resource subj, URI pred, Value obj, URI graph);

	/**
	 * Adds a new statement and associated it with a collection of labels.
	 * 
	 * @return the newly added statement to the store
	 */
	public Statement addStatement(Resource subj, URI pred, Value obj,
			URI graph, URI... ts);

	/**
	 * Removes statements from the RDF store.
	 * 
	 * @param subj
	 *            is subject of the statement to be removed (may be null)
	 * @param pred
	 *            is predicate of the statement to be removed (may be null)
	 * @param obj
	 *            is object of the statement to be removed (may be null)
	 * @param graph
	 *            is graph of the statement to be removed (may be null)
	 * @return the number of removed statements
	 */
	public int removeStatement(Resource subj, URI pred, Value obj, URI graph);

	/**
	 * Creates a statement iterator based on simple pattern matching .
	 * 
	 * @param subj
	 *            is subject of the statements to be matched (may be null)
	 * @param pred
	 *            is predicate of the statements to be matched (may be null)
	 * @param obj
	 *            is object of the statements to be matched (may be null)
	 * @param graph
	 *            is graph of the statements to be matched (may be null)
	 * @param label
	 *            is label of the statements to be matched (may be null)
	 * @return closeable statement iterator
	 */
	public CloseableIterator<Statement> search(Resource subj, URI pred,
			Value obj, URI graph, URI label);

	/**
	 * Creates a handle to a labeled group of statements.
	 * 
	 * @param label
	 *            to be used as name for the new group
	 * @return labeled group of statements
	 */
	public LabelledGroupOfStatements createLabelledGroupOfStatements(URI label);

	/**
	 * Creates a handle to a labeled group of statements with random name.
	 * 
	 * @return label is a group of statements
	 */
	public LabelledGroupOfStatements createLabelledGroupOfStatements();

	/**
	 * Associates a statements with a labeled group.
	 * 
	 * @param subj
	 *            is subject of the statement to be associated (may be null)
	 * @param pred
	 *            is predicate of the statement to be associated (may be null)
	 * @param obj
	 *            is object of the statement to be associated (may be null)
	 * @param graph
	 *            is graph of the statement to be associated (may be null)
	 * @param label
	 *            is label of the group to be associated to
	 * @return true if the operation associated at least one statement
	 */
	public boolean associateStatements(Resource subj, URI pred, Value obj,
			URI graph, URI... label);

	/**
	 * Associates the statements result of SPARQL CONSTRUCT or DESCRIBE query to
	 * a labeled group.
	 * 
	 * @param query
	 *            is construct or describe SPARQL query
	 * @param label
	 *            is label of the group
	 * @return true if the operation associated at least one statement
	 */
	public boolean associateStatements(SPARQLQuery query, URI... label);

	/**
	 * Deassociates one or more statements from a labeled group.
	 * 
	 * @param subj
	 *            is subject of the statement to be deassociated (may be null)
	 * @param pred
	 *            is predicate of the statement to be deassociated (may be null)
	 * @param obj
	 *            is object of the statement to be deassociated (may be null)
	 * @param graph
	 *            is graph of the statement to be deassociated (may be null)
	 * @param label
	 *            is label of the statement to be deassociated (may be null)
	 * @param removedLabel
	 *            is label to be removed
	 * @return true if the operation deassociated at least one statement
	 */
	public boolean deassociateStatements(Resource subj, URI pred, Value obj,
			URI graph, URI label);

	/**
	 * Closes the connection and free all allocated resources. All subsequent
	 * operations will generate exception.
	 */
	public void close();

	/**
	 * Verifies if the current connection is closed.
	 * 
	 * @return true or false
	 */
	public boolean isClosed();

	/**
	 * Get a factory to create values.
	 * 
	 * @return value factory.
	 */
	public ValueFactory getValueFactory();
}
