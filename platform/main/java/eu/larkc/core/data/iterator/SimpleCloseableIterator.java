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

import java.util.Iterator;

import eu.larkc.core.data.CloseableIterator;

public class SimpleCloseableIterator<T> implements CloseableIterator<T> {

	private Iterator<T> iterator;
	private boolean isClosed;
	
	public SimpleCloseableIterator(Iterator<T> iterator) {
		if (iterator == null) {
			throw new IllegalArgumentException();
		}
		this.iterator = iterator;
		this.isClosed = false;
	}
	
	@Override
	public void close() {
		isClosed = true;
		iterator = null;
	}

	@Override
	public boolean hasNext() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		return iterator.hasNext();
	}

	@Override
	public T next() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		return iterator.next();
	}

	@Override
	public void remove() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		iterator.remove();
	}
	
	@Override
	public boolean isClosed() {
		return isClosed;
	}
}
