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

import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public class SubLHashtableIterator extends AbstractSubLObject {

	public static String HASHTABLE_ITERATOR_TYPE_NAME = "HASHTABLE-ITERATOR";

	//// Constructors

	private Iterator iter;

	//// Public Area

	private Map.Entry entry;

	/** Creates a new instance of SubLHashtableIterator. */
	SubLHashtableIterator(SubLHashtable hashTable) {
		this.iter = hashTable.getEntrySetIterator();
		this.next();
	}

	public boolean canFastHash() {
		return true;
	}

	public void clear() {
		this.iter = null;
		this.entry = null;
	}

	public SubLObject getCurrentKey() {
		return (SubLObject) this.entry.getKey();
	}

	public SubLObject getCurrentValue() {
		return (SubLObject) this.entry.getValue();
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.iter.hashCode();
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public boolean hasNext() {
		return this.entry != null;
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
		return true;
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

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public Object next() {
		if (this.iter.hasNext())
			this.entry = (Map.Entry) this.iter.next();
		else
			this.entry = null;
		return this.entry;
	}

	/** Method created to avoid casting */
	public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
		return this;
	}

	public String toString() {
		return "#<" + this.toTypeName() + " @ " + super.toString() + ">";
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toTypeName() {
		return SubLHashtableIterator.HASHTABLE_ITERATOR_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Main

}
