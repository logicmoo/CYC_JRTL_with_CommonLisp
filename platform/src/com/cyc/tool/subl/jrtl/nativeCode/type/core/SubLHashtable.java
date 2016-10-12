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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLHashtable extends AbstractSubLObject implements SubLObject {

	public static class SubLEqHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

		private SubLObject key;

		public SubLEqHashtableKeyEntryImpl() {
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key == obj;
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode() {
			return this.key.hashCode();
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh."); // this shouldn't happen'
		}
	}

	//// Constructors

	public static class SubLEqlHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

		private SubLObject key;

		public SubLEqlHashtableKeyEntryImpl() {
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.eql((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode() {
			return this.key.hashCode();
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh."); // this shouldn't happen'
		}
	}

	public static class SubLEqualHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

		private SubLObject key;

		public SubLEqualHashtableKeyEntryImpl() {
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.equal((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode() {
			return this.key.hashCode();
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh."); // this shouldn't happen'
		}
	}

	public static class SubLEqualpHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

		private SubLObject key;

		public SubLEqualpHashtableKeyEntryImpl() {
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.equalp((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode() {
			return this.key.hashCode();
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh."); // this shouldn't happen'
		}
	}

	//// Public Area

	/**
	 * Public only for implementation reasons No one should ever use this
	 * directly outside of SubLHashtable.
	 */
	public static interface SubLHashtableKeyEntry {
		void clear();

		SubLObject getKey();

		public void init(SubLObject key);

		public void init(SubLObject key, BinaryFunction test);
	}

	/**
	 * Public only for implementation reasons No one should ever use this
	 * directly outside of SubLHashtable.
	 */
	public static class SubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

		private SubLObject key;

		private BinaryFunction test;

		public SubLHashtableKeyEntryImpl() {
		}

		public void clear() {
			this.key = null;
			this.test = null;
		}

		public boolean equals(Object obj) {
			boolean result = SubLNil.NIL != this.test.processItem(this.key, (SubLObject) obj);
			return result;
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode() {
			return this.key.hashCode();
		}

		public void init(SubLObject key) {
			Errors.error("Ugh."); // this shouldn't happen'
		}

		public void init(SubLObject key, BinaryFunction test) {
			this.key = key;
			this.test = test;
		}
	}

	interface SubLKeyEntryFactory {
		SubLHashtableKeyEntry makeKeyEntry();
	}

	public static String HASHTABLE_TYPE_NAME = "HASHTABLE";

	static SubLKeyEntryFactory EQ_KEY_FACTORY = new SubLKeyEntryFactory() {
		public SubLHashtableKeyEntry makeKeyEntry() {
			return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
		}
	};

	static SubLKeyEntryFactory EQL_KEY_FACTORY = new SubLKeyEntryFactory() {
		public SubLHashtableKeyEntry makeKeyEntry() {
			return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
		}
	};

	static SubLKeyEntryFactory EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {
		public SubLHashtableKeyEntry makeKeyEntry() {
			return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
		}
	};

	static SubLKeyEntryFactory EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {
		public SubLHashtableKeyEntry makeKeyEntry() {
			return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
		}
	};

	private BinaryFunction test;

	private HashMap<SubLObject, SubLObject> hash;

	private SubLKeyEntryFactory keyFactory;

	/** Creates a new instance of SubLHashtable. */
	SubLHashtable() {
		this(128, BinaryFunction.EQL_TEST);
	}

	/** Creates a new instance of SubLHashtable. */
	SubLHashtable(int size) {
		this(size, BinaryFunction.EQL_TEST);
	}

	/** Creates a new instance of SubLHashtable. */
	SubLHashtable(int size, BinaryFunction test) {
		this.hash = new HashMap<SubLObject, SubLObject>((int) (size * 1.5) + 1);
		this.test = test;
		if (test == BinaryFunction.EQ_TEST)
			this.keyFactory = SubLHashtable.EQ_KEY_FACTORY;
		else if (test == BinaryFunction.EQL_TEST)
			this.keyFactory = SubLHashtable.EQL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUAL_TEST)
			this.keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUALP_TEST)
			this.keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
		else {
			Errors.error("Got non-equality test for hashtable: " + test);
			this.keyFactory = null;
		}
	}

	public boolean canFastHash() {
		return false;
	}

	public void clear() {
		this.hash.clear();
	}

	public boolean containsKey(Object obj) {
		SubLHashtableKeyEntryImpl key = null;
		try {
			key = Resourcer.getInstance().acquireHashtableKeyEntry();
			key.init((SubLObject) obj, this.test);
			boolean result = this.hash.containsKey(key);
			return result;
		} finally {
			Resourcer.getInstance().releaseHashtableKeyEntry(key);
		}
	}

	public boolean containsValue(Object obj) {
		return this.hash.containsValue(obj);
	}

	public java.util.Set entrySet() {
		// @note we'll need to unpack keys before returning them. --APB
		Errors.unimplementedMethod("SubLHashtable.entrySet()");
		return null;
	}

	public SubLObject get(SubLObject obj) {
		if (this.test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = ((SubLThread) Thread.currentThread()).hashtableEqKeyEntry;
			key.init(obj);
			return this.hash.get(key);
		} else if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = this.keyFactory.makeKeyEntry();
			key.init(obj);
			return this.hash.get(key);
		} else {
			SubLHashtableKeyEntryImpl key = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				key = resourcer.acquireHashtableKeyEntry();
				key.init(obj, this.test);
				return this.hash.get(key);
			} finally {
				resourcer.releaseHashtableKeyEntry(key);
			}
		}
	}

	public int getCurrentCapacity() {
		return (int) (this.hash.size() * 1.30) + 1; // @hack
	}

	public Iterator getEntrySetIterator() {
		return this.hash.entrySet().iterator();
	}

	public BinaryFunction getTest() {
		return this.test;
	}

	public SubLSymbol getType() {
		return Types.$dtp_hash_table$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.NINE_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return 0; // @hack
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEmpty() {
		return this.hash.isEmpty();
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return true;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	//// Protected Area

	//// Private Area

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public java.util.Set keySet() {
		// @note we'll need to unpack keys before returning them. --APB
		Errors.unimplementedMethod("SubLHashtable.keySet()");
		return null;
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		if (this.test == BinaryFunction.EQUALP_TEST) {
			// this implementation lets the last representation of the key
			// survive, rather than the first; this is justified by Steele
			// (1983), p282
			boolean knownKey = this.containsKey(key);
			if (knownKey)
				this.remove(key);
			return this.hash.put(key, value);
		} else
			return this.hash.put(key, value);
	}

	public void putAll(Map map) {
		// @note we'll need to box keys before storing them. --APB
		Errors.unimplementedMethod("SubLHashtable.putAll()");
	}

	public SubLObject remove(SubLObject obj) {
		if (this.test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return this.hash.remove(key);
		} else if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = this.keyFactory.makeKeyEntry();
			key.init(obj);
			return this.hash.remove(key);
		} else {
			SubLHashtableKeyEntryImpl key = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				key = resourcer.acquireHashtableKeyEntry();
				key.init(obj, this.test);
				return this.hash.remove(key);
			} finally {
				resourcer.releaseHashtableKeyEntry(key);
			}
		}
	}

	public int size() {
		return this.hash.size();
	}

	/** Method created to avoid casting */
	public SubLHashtable toHashtable() { // SubLHashtable
		return this;
	}

	public String toString() {
		return "#<HASH-TABLE " + this.test.getFunction().getFunctionSymbol() + " " + this.toTypeName() + " with "
				+ this.size() + " entries @ " + super.toString() + ">";
	}

	public String toStringComplete() {
		return this.toString();
	}

	//// Internal Rep

	public String toTypeName() {
		return SubLHashtable.HASHTABLE_TYPE_NAME;
	}

	public java.util.Collection values() {
		return this.hash.values();
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
