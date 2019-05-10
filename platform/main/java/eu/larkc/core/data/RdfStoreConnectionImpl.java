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

import com.ontotext.ordi.exception.ORDIException;
import com.ontotext.ordi.tripleset.TConnection;
import com.ontotext.ordi.tripleset.TSource;

import eu.larkc.core.data.iterator.ORDICloseableIterator;
import eu.larkc.core.query.LocalStoreSPARQLService;
import eu.larkc.core.query.SPARQLQuery;

/**
 * RdfStoreConnectionImpl is class to implement a connection to local RDF
 * repository.
 * 
 * @author vassil
 * 
 */
public class RdfStoreConnectionImpl extends LocalStoreSPARQLService implements
		RdfStoreConnection {

	public RdfStoreConnectionImpl(TConnection con) {
		super(con);
	}

	@Override
	public Statement addStatement(Resource subj, URI pred, Value obj, URI graph) {
		try {
			return con.addStatement(subj, pred, obj, graph);
		} catch (ORDIException oe) {
			throw new RuntimeException(oe);
		}
	}

	@Override
	public Statement addStatement(Resource subj, URI pred, Value obj,
			URI graph, URI... label) {
		try {
			return con.addStatement(subj, pred, obj, graph, label);
		} catch (ORDIException oe) {
			throw new RuntimeException(oe);
		}
	}

	@Override
	public boolean associateStatements(Resource subj, URI pred, Value obj,
			URI graph, URI... labels) {
		int count = con.associateTripleset(subj, pred, obj, graph, labels);
		return count <= 0 ? false : true;
	}

	@Override
	public boolean associateStatements(SPARQLQuery query, URI... ts) {
		if (query.isDescribe() == false && query.isConstruct() == false) {
			throw new IllegalArgumentException(
					"Only CONSTRUCT and DESCRIBE queries are supported!");
		}
		if (ts == null || query == null) {
			throw new IllegalArgumentException("null!");
		}
		SetOfStatements result = this.executeConstruct(query);
		CloseableIterator<Statement> iter = result.getStatements();
		int count = 0;
		while (iter.hasNext()) {
			Statement s = iter.next();
			count += con.associateTripleset(s.getSubject(), s.getPredicate(), s
					.getObject(), null, ts);
		}
		return count <= 0 ? false : true;
	}

	@Override
	public void close() {
		try {
			con.close();
		} catch (ORDIException oe) {
			throw new RuntimeException(oe);
		}
	}

	@Override
	public boolean isClosed() {
		return con.isOpen() == true ? false : true;
	}

	@Override
	public LabelledGroupOfStatements createLabelledGroupOfStatements(URI label) {
		return new LabelledGroupOfStatementsImpl(label, this, true);
	}

	@Override
	public LabelledGroupOfStatements createLabelledGroupOfStatements() {
		return new LabelledGroupOfStatementsImpl(this);
	}

	@Override
	public boolean deassociateStatements(Resource subj, URI pred, Value obj,
			URI graph, URI label) {
		int count = con.deassociateTripleset(subj, pred, obj, graph, label);
		return count <= 0 ? false : true;
	}

	@Override
	public ValueFactory getValueFactory() {
		return ((TSource) con.getDataSource()).getTriplesetFactory();
	}

	@Override
	public int removeStatement(Resource subj, URI pred, Value obj, URI graph) {
		try {
			return con.removeStatement(subj, pred, obj, graph);
		} catch (ORDIException oe) {
			throw new RuntimeException(oe);
		}
	}

	@Override
	public CloseableIterator<Statement> search(Resource subj, URI pred,
			Value obj, URI graph, URI label) {
		try {
			return new ORDICloseableIterator(con.search(subj, pred, obj, graph,
					label));
		} catch (ORDIException oe) {
			throw new RuntimeException(oe);
		}
	}
}
