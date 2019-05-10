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
	@Override
	public boolean hasNext();

	/**
	 * Fetches the next result from the iterator.
	 * 
	 * @return the next item
	 */
	@Override
	public T next();

	/**
	 * Removes the current item from the iterated collection. This method may be
	 * not implemented.
	 */
	@Override
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
