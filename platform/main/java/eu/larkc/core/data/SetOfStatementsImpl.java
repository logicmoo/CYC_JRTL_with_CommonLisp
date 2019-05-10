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

import java.util.ArrayList;
import java.util.Collection;

import org.openrdf.model.Statement;
import org.openrdf.model.impl.StatementImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;

/**
 * This class is a in-memory set of RDF statements.
 * 
 * @author vassil
 * 
 */
public class SetOfStatementsImpl implements SetOfStatements {

	private static final long serialVersionUID = 1L;
	private final Collection<Statement> data;

	public SetOfStatementsImpl(Iterable<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>();
		// FIXME: Too slow, find a better way to guarantee serializations
		for (Statement st : data) {
			this.data.add(new StatementImpl(st.getSubject(), st.getPredicate(),
					st.getObject()));
		}
	}

	public SetOfStatementsImpl(Collection<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>(data);
	}

	@Override
	public CloseableIterator<Statement> getStatements() {
		return new SimpleCloseableIterator<Statement>(data.iterator());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof SetOfStatementsImpl == false) {
			return false;
		}
		return data.equals(((SetOfStatementsImpl) o).data);
	}
	
	@Override
	public int hashCode() {
		return data.hashCode();
	}

}
