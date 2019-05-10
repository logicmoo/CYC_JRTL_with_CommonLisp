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
package eu.larkc.core.query;

import org.openrdf.model.URI;

import eu.larkc.core.data.DataSet;

/**
 * The class represent a SPARQL query that might be executed by a SPARQL
 * endpoint.
 * 
 * @author vassil
 * 
 */
public interface SPARQLQuery extends Query {

	/**
	 * Checks whether this query is ASK.
	 * 
	 * @return true if it is ASK query
	 */
	public boolean isAsk();

	/**
	 * Checks whether this query is DESCRIBE
	 * 
	 * @return true if it is DESCRIBE query
	 */
	public boolean isDescribe();

	/**
	 * Checks whether this query is CONSTRUCT
	 * 
	 * @return true if it is CONSTRUCT query
	 */
	public boolean isConstruct();

	/**
	 * Checks whether this query is SELECT
	 * 
	 * @return true if it is SELECT query
	 */
	public boolean isSelect();

	/**
	 * Gets the SPARQL dataset of this query. The SPARQL dataset is defined by
	 * FROM and FROM NAMED clauses.
	 * 
	 * @return dataset (may be null)
	 */
	public DataSet getDataSet();

	/**
	 * Sets the SPARQL dataset of this query. The SPARQL dataset is defined by
	 * FROM and FROM NAMED clauses.
	 * 
	 * @param ds
	 *            dataset (may be null)
	 */
	public void setDataSet(DataSet ds);

	/**
	 * Gets the labeled group this query to be executed against. SPARQL syntax
	 * does not support this feature and it is currently accessible only via
	 * this the API.
	 * 
	 * @return URI of the labeled group (may be null)
	 */
	public URI getLabelledGroup();

	/**
	 * Sets the labeled group this query to be executed against.SPARQL syntax
	 * does not support this feature and it is currently accessible only via
	 * this the API.
	 * 
	 * @param label
	 *            of the labeled group (may be null)
	 */
	public void setLabelledGroup(URI label);
}
