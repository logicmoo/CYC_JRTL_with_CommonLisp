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

import java.util.Collection;

import org.openrdf.model.URI;
import org.openrdf.query.TupleQueryResultHandler;

import com.ontotext.ordi.tripleset.TConnection;
import com.ontotext.ordi.tripleset.TriplesetQuery;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.DataSetImpl;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfGraphDataSet;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;

/**
 * LocalStoreSPARQLService class implements SPARQL query evaluation over a local
 * memory RDF Store.
 * 
 * @author vassil
 * 
 */
public class LocalStoreSPARQLService implements SPARQLEndpoint {

	protected final TConnection con;
	private static volatile int runningQueries;

	public LocalStoreSPARQLService(TConnection con) {
		if (con == null) {
			throw new IllegalArgumentException("null!");
		}
		this.con = con;
	}

	@Override
	public boolean executeAsk(SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isAsk() == false) {
			throw new IllegalArgumentException(
					"Only ASK queries are supported!");
		}
		final ORDIVariableBinding result = new ORDIVariableBinding();
		startQuery(query, result);
		CloseableIterator<Binding> bind = result.iterator();
		while (bind.hasNext()) {
			return true;
		}
		return false;
	}

	@Override
	public SetOfStatements executeConstruct(final SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isConstruct() == false && query.isDescribe() == false) {
			throw new IllegalArgumentException(
					"Only DESCRIBE and CONSTRUCT queries are supported!");
		}
		final ORDIGraphResult result = new ORDIGraphResult();
		startQuery(query, result);
		return result;
	}

	@Override
	public VariableBinding executeSelect(final SPARQLQuery query) {
		if (query == null) {
			throw new IllegalArgumentException("Null value is not supported!");
		}
		if (query.isSelect() == false) {
			throw new IllegalArgumentException(
					"Only SELECT queries are supported!");
		}
		final ORDIVariableBinding result = new ORDIVariableBinding();
		startQuery(query, result);
		return result;
	}

	private void startQuery(final SPARQLQuery query,
			final TupleQueryResultHandler result) {
		Thread t = new Thread() {
			@Override
			public void run() {
				synchronized(LocalStoreSPARQLService.class) {
				try {
					runningQueries++;
					while (runningQueries > 10) {
						LocalStoreSPARQLService.class.wait();
					}
					getQuery(query).evaluate(result);
				} catch (Exception oe) {
					throw new RuntimeException(oe);
				} finally {
					runningQueries--;
					LocalStoreSPARQLService.class.notifyAll();
				}
				}
			}
		};
		t.start();
	}

	private TriplesetQuery getQuery(SPARQLQuery query) {
		if (query instanceof SPARQLQueryImpl == false) {
			throw new IllegalArgumentException(
					"Only SPARQLQueryImpl is supported now!");
		}
		SPARQLQueryImpl sqi = (SPARQLQueryImpl) query;
		TriplesetQuery tq = null;
		URI ts = null;

		if (query.getLabelledGroup() != null) {
			ts = query.getLabelledGroup();
		}
		if (ts == null) {
			tq = new TriplesetQuery(sqi.getParsedQuery(), con);
		} else {
			tq = new TriplesetQuery(sqi.getParsedQuery(), con, ts);
		}
		return tq;
	}

	@Override
	public DataSet createDataSet(Collection<URI> defaultGraphs,
			Collection<URI> namedGraphs) {
		return new DataSetImpl(this, defaultGraphs, namedGraphs);
	}
	
	@Override
	public RdfGraph createRdfGraph(URI name) {
		return new RdfGraphDataSet(name, this);
	}
}
