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
package eu.larkc.core.data.util;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.query.SPARQLQuery;

/**
 * SPARQLQueryExecutor is an utility class to execute SPARQL queries over
 * arbitrary RDF data. SPARQL queries could be executed against remote or local
 * RDF data types. Please note that some of the RDF data merges could be IO and
 * computationally expensive operations and should be performed with care.
 * 
 * @author vassil
 * 
 */
public class SPARQLQueryExecutor {

	/**
	 * Executes SPARQL ASK query against arbitrary RDF data type.
	 * 
	 * @param query
	 *            is query to be executed
	 * @param rdf
	 *            is RDF data to be executed against
	 * @return SPARQL result
	 */
	public boolean executeAsk(SPARQLQuery query, SetOfStatements rdf) {
		if (query == null || rdf == null) {
			throw new IllegalArgumentException();
		}
		if (rdf instanceof DataSet) {
			return (Boolean) executeLocalStoreQuery(query);
		} else if (rdf instanceof LabelledGroupOfStatements
				|| rdf instanceof SetOfStatementsMerger) {
			URI label = ((LabelledGroupOfStatements) rdf).getLabel();
			query.setLabelledGroup(label);
			return (Boolean) executeLocalStoreQuery(query);
		}
		return (Boolean) executeLocalMemoryQuery(query, rdf);
	}

	/**
	 * Executes SPARQL CONSTRUCT or DESCRIBE query against arbitrary RDF data
	 * type.
	 * 
	 * @param query
	 *            is query to be executed
	 * @param rdf
	 *            is RDF data to be executed against
	 * @return SPARQL result
	 */
	public SetOfStatements executeConstruct(SPARQLQuery query,
			SetOfStatements rdf) {
		if (query == null || rdf == null) {
			throw new IllegalArgumentException();
		}
		if (rdf instanceof DataSet) {
			return (SetOfStatements) executeLocalStoreQuery(query);
		} else if (rdf instanceof LabelledGroupOfStatements
				|| rdf instanceof SetOfStatementsMerger) {
			URI label = ((LabelledGroupOfStatements) rdf).getLabel();
			query.setLabelledGroup(label);
			return (SetOfStatements) executeLocalStoreQuery(query);
		}
		return (SetOfStatements) executeLocalMemoryQuery(query, rdf);
	}

	/**
	 * Executes SPARQL SELECT query against arbitrary RDF data type.
	 * 
	 * @param query
	 *            is query to be executed
	 * @param rdf
	 *            is RDF data to be executed against
	 * @return SPARQL result
	 */
	public VariableBinding executeSelect(SPARQLQuery query, SetOfStatements rdf) {
		if (query == null || rdf == null) {
			throw new IllegalArgumentException();
		}
		if (rdf instanceof DataSet) {
			return (VariableBinding) executeLocalStoreQuery(query);
		} else if (rdf instanceof LabelledGroupOfStatements
				|| rdf instanceof SetOfStatementsMerger) {
			URI label = ((LabelledGroupOfStatements) rdf).getLabel();
			query.setLabelledGroup(label);
			return (VariableBinding) executeLocalStoreQuery(query);
		}
		return (VariableBinding) executeLocalMemoryQuery(query, rdf);
	}

	private Object executeLocalStoreQuery(SPARQLQuery query) {
		RdfStoreConnection con = DataFactory.INSTANCE
				.createRdfStoreConnection();
		if (query.isAsk()) {
			return con.executeAsk(query);
		} else if (query.isSelect()) {
			return con.executeSelect(query);
		} else {
			return con.executeConstruct(query);
		}
	}

	private Object executeLocalMemoryQuery(SPARQLQuery query,
			SetOfStatements rdf) {
		RdfStoreConnection con = DataFactory.INSTANCE
				.createRdfStoreConnection();
		LabelledGroupOfStatements label = con.createLabelledGroupOfStatements();
		try {
			CloseableIterator<Statement> iter = rdf.getStatements();
			while (iter.hasNext()) {
				Statement s = iter.next();
				con.addStatement(s.getSubject(), s.getPredicate(), s
						.getObject(), s.getContext() instanceof URI ? (URI) s
						.getContext() : label.getLabel(), label.getLabel());
			}
			query.setLabelledGroup(label.getLabel());
			Object result = executeLocalStoreQuery(query);
			return result;
		} finally {
			// con.removeStatement(null, null, null, label.getLabel());
		}
	}
}
