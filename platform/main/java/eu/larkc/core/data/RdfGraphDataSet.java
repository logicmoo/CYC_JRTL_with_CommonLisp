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

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.ContextStatementImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

/**
 * @author  vassil
 */
public class RdfGraphDataSet extends RdfGraphBase {

	private static final long serialVersionUID = 1L;
	private final SPARQLEndpoint endpoint;
	private long timeStamp = System.currentTimeMillis();

	public RdfGraphDataSet(URI graph, SPARQLEndpoint endpoint) {
		super(graph);
		if (endpoint == null) {
			throw new IllegalArgumentException("null!");
		}
		this.endpoint = endpoint;
	}

	@Override
	public CloseableIterator<Statement> getStatements() {
		String q = String.format(
				"construct {?s ?p ?o} FROM <%s> WHERE {?s ?p ?o}", getName());
		SPARQLQuery query = new SPARQLQueryImpl(q);
		CloseableIterator<Statement> inner = endpoint.executeConstruct(query)
				.getStatements();
		return new GraphCloseableIterator(getName(), inner);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof RdfGraphDataSet == false) {
			return false;
		}
		if (getName().toString().equals(((RdfGraphDataSet) o).getName().toString()) == false) {
			return false;
		}
		if (Math.abs(timeStamp - (((RdfGraphDataSet) o).timeStamp)) > 
				DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		// the mutable hashcodes are risky (timeStamp)
		return getName().toString().hashCode();
	}
	
	/**
	 * @author  vassil
	 */
	public class GraphCloseableIterator implements CloseableIterator<Statement> {

		private URI graph;
		private CloseableIterator<Statement> inner;

		public GraphCloseableIterator(URI graph,
				CloseableIterator<Statement> inner) {
			if (inner == null || graph == null) {
				throw new IllegalArgumentException();
			}
			this.graph = graph;
			this.inner = inner;
		}

		@Override
		public boolean hasNext() {
			return inner.hasNext();
		}

		@Override
		public Statement next() {
			Statement s = inner.next();
			return new ContextStatementImpl(s.getSubject(), s.getPredicate(), s
					.getObject(), graph);
		}

		@Override
		public void remove() {
			inner.remove();
		}

		@Override
		public void close() {
			inner.close();
		}

		@Override
		public boolean isClosed() {
			return inner.isClosed();
		}
	}
}
