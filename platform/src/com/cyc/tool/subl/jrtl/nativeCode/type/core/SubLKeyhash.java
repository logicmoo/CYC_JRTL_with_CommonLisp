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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLKeyEntryFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLKeyhash extends AbstractSubLObject implements SubLObject {

	public static String KEYHASH_TYPE_NAME = "KEYHASH";

	//// Constructors

	private BinaryFunction test;

	private HashSet<SubLObject> hash;

	private SubLKeyEntryFactory keyFactory;

	//// Public Area

	/** Creates a new instance of SubLHashtable. */
	SubLKeyhash() {
		this(128, BinaryFunction.EQL_TEST);
	}

	/** Creates a new instance of SubLHashtable. */
	SubLKeyhash(int size) {
		this(size, BinaryFunction.EQL_TEST);
	}

	/** Creates a new instance of SubLHashtable. */
	SubLKeyhash(int size, BinaryFunction test) {
		this.hash = new HashSet<SubLObject>((int) (size * 1.5) + 1);
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

	public void addKey(SubLObject key) {
		this.hash.add(key);
	}

	public boolean canFastHash() {
		return false;
	}

	public void clear() {
		this.hash.clear();
	}

	public java.util.Set entrySet() {
		// @note we'll need to unpack keys before returning them. --APB
		Errors.unimplementedMethod("SubLHashtable.entrySet()");
		return null;
	}

	public int getCurrentCapacity() {
		return (int) (this.hash.size() * 1.30) + 1; // @hack
	}

	public Iterator<SubLObject> getEntrySetIterator() {
		return this.hash.iterator();
	}

	public BinaryFunction getTest() {
		return this.test;
	}

	public SubLSymbol getType() {
		return Types.$dtp_keyhash$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.ONE_HUNDRED_THIRTY_SEVEN_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return 0; // @hack
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public boolean hasKey(SubLObject obj) {
		if (this.test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = ((SubLThread) Thread.currentThread()).hashtableEqKeyEntry;
			key.init(obj);
			return this.hash.contains(key);
		} else if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = this.keyFactory.makeKeyEntry();
			key.init(obj);
			return this.hash.contains(key);
		} else {
			SubLHashtableKeyEntryImpl key = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				key = resourcer.acquireHashtableKeyEntry();
				key.init(obj, this.test);
				return this.hash.contains(key);
			} finally {
				resourcer.releaseHashtableKeyEntry(key);
			}
		}
	}

	public boolean isAlien() {
		return false;
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
		return false;
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
		return true;
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

	public boolean isPackageIterator() {
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

	public void putAll(Map map) {
		// @note we'll need to box keys before storing them. --APB
		Errors.unimplementedMethod("SubLHashtable.putAll()");
	}

	public boolean remKey(SubLObject obj) {
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
	public SubLKeyhash toKeyhash() { // SubLKeyhash
		return this;
	}

	public String toString() {
		return "#<" + this.test.getFunction().getFunctionSymbol() + " " + this.toTypeName() + " with " + this.size()
				+ " entries @ " + super.toString() + ">";
	}

	public String toStringComplete() {
		return this.toString();
	}

	public SubLList toSubLList() {
		SubLList result = SubLNil.NIL;
		SubLObject[] values = this.hash.toArray(new SubLObject[this.hash.size()]);
		for (int i = 0, size = values.length; i < size; i++)
			result = result.push(values[i]);
		return SubLNil.NIL;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public SubLList toSubLVector() {
		SubLList result = SubLNil.NIL;
		SubLObject[] values = this.hash.toArray(new SubLObject[this.hash.size()]);
		for (int i = 0, size = values.length; i < size; i++)
			result = result.push(values[i]);
		return SubLNil.NIL;
	}

	public String toTypeName() {
		return SubLKeyhash.KEYHASH_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
