package eu.larkc.core.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.openrdf.model.Value;
import org.openrdf.query.BindingSet;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.VariableBinding;

/**
 * VariableBindingBase is an abstract class to implement asynchronous streaming
 * of RDF variable bindings. All implementing classes must: 1. Invoke
 * super.notifyAll() after setting bindNames 2. Put next the next binding
 * results with results.put(X).
 * 
 * @author vassil
 * 
 */
public class VariableBindingBase implements VariableBinding {

	protected transient boolean isClosed = false;
	protected transient String[] bindNames;
	protected transient BlockingQueue<BindingSet> results;
	protected transient CloseableIterator<Binding> iterator;
	private final static long serialVersionUID = 1L;

	public VariableBindingBase() {
		this.results = new ArrayBlockingQueue<BindingSet>(1024);
	}

	public synchronized List<String> getVariables() {
		if (bindNames == null) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		return Collections.unmodifiableList(Arrays.asList(bindNames));
	}

	public synchronized CloseableIterator<Binding> iterator() {
		if (iterator == null) {
			iterator = new BindingIterator();
		}
		return iterator;
	}

	/**
	 * This class iterates an asynchronous blocking and returns back the results
	 * on demand. It works as a local result cache.
	 * 
	 * @author vassil
	 * 
	 */
	public class BindingIterator implements CloseableIterator<Binding> {

		private BindingSet next;

		public synchronized boolean hasNext() {
			while (next == null) {
				try {
					next = results.take();
				} catch (InterruptedException ie) {
				}
			}
			if (next instanceof FinalBindingSet) {
				return false;
			}
			return true;
		}

		public synchronized Binding next() {
			if (hasNext() == false) {
				throw new NoSuchElementException();
			}
			WrappedBinding result = new WrappedBinding(next);
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
	 * Helper class to transform a Sesame to LarKC binding.
	 * 
	 * @author vassil
	 * 
	 */
	public class WrappedBinding implements Binding {

		public List<Value> values = new ArrayList<Value>();

		public WrappedBinding(BindingSet bs) {
			if (bs == null) {
				throw new IllegalArgumentException("null!");
			}
			for (int i = 0; i < bs.size(); i++) {
				values.add(bs.getValue(bindNames[i]));
			}
		}

		public WrappedBinding(List<Value> values) {
			if (values == null) {
				throw new IllegalArgumentException("null!");
			}
			this.values = values;
		}

		public List<Value> getValues() {
			return Collections.unmodifiableList(values);
		}

		public String toString() {
			return values.toString();
		}
	}

	/**
	 * Helper class to denote the end of the streamed solutions.
	 * 
	 * @author vassil
	 * 
	 */
	public class FinalBindingSet implements BindingSet {

		public Iterator<org.openrdf.query.Binding> iterator() {
			throw new UnsupportedOperationException();
		}

		public Set<String> getBindingNames() {
			throw new UnsupportedOperationException();
		}

		public org.openrdf.query.Binding getBinding(String s) {
			throw new UnsupportedOperationException();
		}

		public boolean hasBinding(String s) {
			throw new UnsupportedOperationException();
		}

		public Value getValue(String s) {
			throw new UnsupportedOperationException();
		}

		public int size() {
			throw new UnsupportedOperationException();
		}
	}
}
