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

	public boolean hasNext() {
		if (isClosed) {
			throw new IllegalStateException("Iterator is closed!");
		}
		return iter.hasNext();
	}

	public Statement next() {
		if (hasNext() == false) {
			throw new NoSuchElementException();
		}
		return (Statement) iter.next();
	}

	public void remove() {
		iter.remove();
	}

	public void close() {
		iter.close();
		iter = null;
	}

	public boolean isClosed() {
		return isClosed;
	}
}
