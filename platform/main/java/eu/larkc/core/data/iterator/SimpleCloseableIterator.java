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
