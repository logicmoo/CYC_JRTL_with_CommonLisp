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

import java.util.NoSuchElementException;

import org.openrdf.model.Statement;

import com.ontotext.ordi.tripleset.TStatement;

import eu.larkc.core.data.CloseableIterator;

public class ORDICloseableIterator implements CloseableIterator<Statement> {

	private com.ontotext.ordi.iterator.CloseableIterator<? extends TStatement> iter;
	private boolean isClosed;

	public ORDICloseableIterator(
			com.ontotext.ordi.iterator.CloseableIterator<? extends TStatement> iter) {
		if (iter == null) {
			throw new IllegalArgumentException();
		}
		this.iter = iter;
		isClosed = false;
	}

	@Override
	public boolean hasNext() {
		if (isClosed) {
			throw new IllegalStateException("Iterator is closed!");
		}
		return iter.hasNext();
	}

	@Override
	public Statement next() {
		if (hasNext() == false) {
			throw new NoSuchElementException();
		}
		return (Statement) iter.next();
	}

	@Override
	public void remove() {
		iter.remove();
	}

	@Override
	public void close() {
		iter.close();
		iter = null;
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}
}
