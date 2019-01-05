package eu.larkc.core.query;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;

/**
 * GraphResultBase is an abstract class to implement asynchronous streaming of
 * RDF statements. All implementing classes must: 1. Put the next statements
 * from the stream with results.put(X) 2. For the final statement to put
 * results.put(new FinalStatement())
 * 
 * @author vassil
 * 
 */
public abstract class GraphResultBase implements SetOfStatements {

	protected transient boolean isClosed = false;
	protected transient BlockingQueue<Statement> results;
	protected transient CloseableIterator<Statement> iterator;
	private final static long serialVersionUID = 1L;

	public GraphResultBase() {
		this.results = new ArrayBlockingQueue<Statement>(1024);
	}

	public synchronized void close() {
		isClosed = true;
	}

	public synchronized CloseableIterator<Statement> getStatements() {
		if (iterator == null) {
			iterator = new BlockingQueueIterator();
		}
		return iterator;
	}

	/**
	 * Helper class to iterate the blocking queue used to simulate asynchrnous
	 * streaming of RDF statements.
	 * 
	 * @author vassil
	 * 
	 */
	public class BlockingQueueIterator implements CloseableIterator<Statement> {

		private Statement next;

		public synchronized boolean hasNext() {
			while (next == null) {
				try {
					next = results.take();
				} catch (InterruptedException ie) {
				}
			}
			if (next instanceof FinalStatement) {
				return false;
			}
			return true;
		}

		public synchronized Statement next() {
			if (hasNext() == false) {
				throw new NoSuchElementException();
			}
			Statement result = next;
			next = null;
			return result;
		}

		public void remove() {
		}

		public synchronized void close() {
			isClosed = true;
		}

		public synchronized boolean isClosed() {
			return isClosed;
		}
	}

	/**
	 * Helper class to denote the end of streamed statements.
	 * 
	 * @author vassil
	 * 
	 */
	public class FinalStatement implements Statement {

		private static final long serialVersionUID = 1L;

		public Resource getSubject() {
			throw new UnsupportedOperationException();
		}

		public URI getPredicate() {
			throw new UnsupportedOperationException();
		}

		public Value getObject() {
			throw new UnsupportedOperationException();
		}

		public Resource getContext() {
			throw new UnsupportedOperationException();
		}
	}
}
