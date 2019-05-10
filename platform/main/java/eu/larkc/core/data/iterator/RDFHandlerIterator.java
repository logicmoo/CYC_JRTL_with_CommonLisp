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
package eu.larkc.core.data.iterator;

import java.util.HashSet;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.ContextStatementImpl;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.helpers.RDFHandlerBase;

import eu.larkc.core.data.CloseableIterator;

public class RDFHandlerIterator extends RDFHandlerBase implements
		CloseableIterator<Statement> {

	private boolean isClosed;
	private HashSet<Statement> statements = new HashSet<Statement>();
	private SimpleCloseableIterator<Statement> iter;
	private URI graph;

	public RDFHandlerIterator(URI graph) {
		if (graph == null) {
			throw new IllegalArgumentException();
		}
		this.graph = graph;
	}

	@Override
	public void close() {
		iter.close();
	}

	@Override
	public synchronized boolean hasNext() {
		return iter.hasNext();
	}

	@Override
	public Statement next() {
		return iter.next();
	}

	@Override
	public void remove() {
		iter.remove();
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}

	@Override
	public void handleStatement(Statement st) throws RDFHandlerException {
		statements.add(new ContextStatementImpl(st.getSubject(), st
				.getPredicate(), st.getObject(), graph));
	}

	@Override
	public void endRDF() {
		iter = new SimpleCloseableIterator<Statement>(statements.iterator());
	}
}
