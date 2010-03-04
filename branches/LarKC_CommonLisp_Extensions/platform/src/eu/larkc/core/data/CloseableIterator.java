package eu.larkc.core.data;

import java.util.Iterator;

/**
 * This class implements client side closeable iterator for the processing of
 * long streamed results.
 * 
 * @author vassil
 * 
 * @param <T>
 *            type of the processed resource
 */
public interface CloseableIterator<T> extends Iterator<T> {

	/**
	 * Checks whether the next result could be returned.
	 * 
	 * @return whether a next item is available
	 */
	public boolean hasNext();

	/**
	 * Fetches the next result from the iterator.
	 * 
	 * @return the next item
	 */
	public T next();

	/**
	 * Removes the current item from the iterated collection. This method may be
	 * not implemented.
	 */
	public void remove();

	/**
	 * Closes the current iterator and all subsequent operations will raise
	 * exception. The method could be invoked many times.
	 */
	public void close();

	/**
	 * Verifies if the current iterator is closed.
	 * 
	 * @return is closed
	 */
	public boolean isClosed();
}
