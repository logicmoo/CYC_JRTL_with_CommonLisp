/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
//import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLIntegerBignum;
import com.cyc.tool.subl.util.ObjectPool;

//// External Imports

public class Resourcer extends RuntimeException implements CommonSymbols {

	/*
	 * Examples:
	 *
	 * Object[] array = null; Resourcer resourcer = Resourcer.getInstance(); try
	 * { array = resourcer.acquireObjectArray(2); //takes the size of the array
	 * //initialize array here //do something with array here } finally {
	 * resourcer.releaseObjectArray(args); }
	 *
	 * SubLListListIterator iter = null; Resourcer resourcer =
	 * Resourcer.getInstance(); try { iter =
	 * resourcer.acquireSubLListListIterator(list); //takes the list you want to
	 * iterate over while (iter.hasNext()) { SubLObject item =
	 * iter.nextSubLObject(); //do something with item here } } finally {
	 * resourcer.releaseSubLListListIterator(iter); }
	 *
	 */

	//// Constructors

	private static class ArrayListPool extends ObjectPool {
		public static int DEFAULT_SIZE = 8192;

		ArrayListPool() {
			super(16);
		}

		public Object makePoolItem() {
			return new ArrayList(ArrayListPool.DEFAULT_SIZE);
		}

		public void resetPoolItem(Object item) {
			((ArrayList) item).clear(); // allow gc to work
		}
	}

	//// Public Area

	private static class HashtableKeyEntryPool extends ObjectPool {
		HashtableKeyEntryPool() {
			super(16);
		}

		public Object makePoolItem() {
			return new SubLHashtableKeyEntryImpl();
		}

		public void resetPoolItem(Object item) {
			((SubLHashtableKeyEntry) item).clear();
		}
	}

	static class ObjectArrayObjectPool extends ObjectPool {
		public static int MAX_ARRAY_SIZE = 24;

		private int arraySize;

		ObjectArrayObjectPool(int size) {
			super(32);
			this.arraySize = size;
		}

		public Object makePoolItem() {
			return new Object[this.arraySize];
		}

		public void resetPoolItem(Object item) {
			Arrays.fill((Object[]) item, null);
		} // allow gc to work
	}

	private static class StringBuilderPool extends ObjectPool {
		public static int DEFAULT_SIZE = 8192;

		StringBuilderPool(int size) {
			super(16);
		}

		public Object makePoolItem() {
			return new StringBuilder(StringBuilderPool.DEFAULT_SIZE);
		}

		public void resetPoolItem(Object item) {
			((StringBuilder) item).setLength(0);
		} // allow gc to work
	}

	//// SubLListListIterators

	private static class SubLArrayListListIteratorObjectPool extends ObjectPool {
		public Object makePoolItem() {
			return new SubLArrayListListIterator();
		}

		public void resetPoolItem(Object item) {
			((SubLListListIterator) item).reset();
		}
	}

	private static class SubLConsListListIteratorObjectPool extends ObjectPool {
		public Object makePoolItem() {
			return new SubLConsListListIterator();
		}

		public void resetPoolItem(Object item) {
			((SubLListListIterator) item).reset();
		}
	}

	static class SubLObjectArrayObjectPool extends ObjectPool {
		public static int MAX_ARRAY_SIZE = 24;

		private int arraySize;

		SubLObjectArrayObjectPool(int size) {
			super(32);
			this.arraySize = size;
		}

		public Object makePoolItem() {
			return new SubLObject[this.arraySize];
		}

		public void resetPoolItem(Object item) {
			Arrays.fill((SubLObject[]) item, null);
		} // allow gc to work
	}

	public static Object[] EMPTY_OBJECT_ARRAY = new Object[0];

	//// Object Arrays

	public static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];

	public static Resourcer getInstance() {
		return ((SubLThread) Thread.currentThread()).getResourcer();
	}

	//// SubLObject Arrays

	private ObjectPool sublArrayListListIteratorPool = new SubLArrayListListIteratorObjectPool().init();

	private ObjectPool sublConsListListIteratorPool = new SubLConsListListIteratorObjectPool().init();

	private ObjectPool hashtableKeyEntryPool = new HashtableKeyEntryPool().init();

	private ObjectPool[] objectArrayObjectPools = new ObjectArrayObjectPool[ObjectArrayObjectPool.MAX_ARRAY_SIZE];

	/// SubL hashtable key entries

	private ObjectPool[] sublObjectArrayObjectPools = new SubLObjectArrayObjectPool[SubLObjectArrayObjectPool.MAX_ARRAY_SIZE];

	/** Creates a new instance of Resourcer. */
	public Resourcer() {
		for (int i = 0, size = ObjectArrayObjectPool.MAX_ARRAY_SIZE; i < size; i++)
			this.objectArrayObjectPools[i] = new ObjectArrayObjectPool(i).init();
		for (int i = 0, size = SubLObjectArrayObjectPool.MAX_ARRAY_SIZE; i < size; i++)
			this.sublObjectArrayObjectPools[i] = new SubLObjectArrayObjectPool(i).init();
	}

	/*
	 * public SubLIntegerBignum acquireSubLIntegerBignum() { return
	 * (SubLIntegerBignum)sublIntegerBignumPool.acquire(); }
	 *
	 * public void releaseSubLIntegerBignum(SubLIntegerBignum num) {
	 * sublIntegerBignumPool.release(num); }
	 */

	//// Protected Area

	//// Private Area

	//// Internal Rep

	// private ObjectPool sublIntegerBignumPool = new
	// SubLIntegerBignumObjectPool().init();

	public SubLHashtableKeyEntryImpl acquireHashtableKeyEntry() {
		SubLHashtableKeyEntryImpl keyEntry = (SubLHashtableKeyEntryImpl) this.hashtableKeyEntryPool.acquire();
		return keyEntry;
	}

	public Object[] acquireObjectArray(int size) {
		if (size >= ObjectArrayObjectPool.MAX_ARRAY_SIZE)
			return new Object[size];
		return (Object[]) this.objectArrayObjectPools[size].acquire();
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list) {
		return this.acquireSubLListListIterator(list, 0, -1);
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list, int start) {
		return this.acquireSubLListListIterator(list, start, list == null ? 0 : -1);
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list, int start, int end) {
		SubLListListIterator iter = null;
		if (list.isArrayBased())
			iter = (SubLListListIterator) this.sublArrayListListIteratorPool.acquire();
		else
			iter = (SubLListListIterator) this.sublConsListListIteratorPool.acquire();
		iter.init(list, start, end);
		return iter;
	}

	public SubLObject[] acquireSubLObjectArray(ArrayList<SubLObject> list) {
		if (list == null || list.size() <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		SubLObject[] result;
		int size = list.size();
		if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE)
			result = new SubLObject[size];
		else
			result = (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
		return list.toArray(result);
	}

	public SubLObject[] acquireSubLObjectArray(int size) {
		if (size <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE)
			return new SubLObject[size];
		return (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
	}

	public SubLObject[] acquireSubLObjectArray(SubLList list) {
		if (list == null || list.size() <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		SubLObject[] result;
		int size = list.size();
		if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE)
			result = new SubLObject[size];
		else
			result = (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
		return (SubLObject[]) list.toArray(result);
	}

	public void releaseHashtableKeyEntry(SubLHashtableKeyEntry keyEntry) {
		if (keyEntry != null)
			this.hashtableKeyEntryPool.release(keyEntry);
	}

	public void releaseObjectArray(Object[] array) {
		if (array == null)
			return;
		if (array.length >= ObjectArrayObjectPool.MAX_ARRAY_SIZE)
			return;
		this.objectArrayObjectPools[array.length].release(array);
	}

	public void releaseSubLListListIterator(SubLListListIterator iter) {
		if (iter == null)
			return;
		if (iter.isArrayBased())
			this.sublArrayListListIteratorPool.release(iter);
		else
			this.sublConsListListIteratorPool.release(iter);
	}

	public void releaseSubLObjectArray(SubLObject[] array) {
		if (array == null)
			return;
		if (array.length == 0)
			return;
		if (array.length >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE)
			return;
		this.sublObjectArrayObjectPools[array.length].release(array);
	}

	/*
	 * private static class SubLIntegerBignumObjectPool extends ObjectPool {
	 * SubLIntegerBignumObjectPool() { super(1024 * 10); } public void
	 * resetPoolItem(Object item) { } public Object makePoolItem() { return new
	 * SubLIntegerBignum.MutableSubLIntegerBignum(0); } }
	 */
}
