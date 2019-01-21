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
