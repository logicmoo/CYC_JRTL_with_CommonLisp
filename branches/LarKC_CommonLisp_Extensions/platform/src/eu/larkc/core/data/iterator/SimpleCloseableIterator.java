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
	
	public void close() {
		isClosed = true;
		iterator = null;
	}

	public boolean hasNext() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		return iterator.hasNext();
	}

	public T next() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		return iterator.next();
	}

	public void remove() {
		if (isClosed) {
			throw new RuntimeException("Iterator is closed!");
		}
		iterator.remove();
	}
	
	public boolean isClosed() {
		return isClosed;
	}
}
