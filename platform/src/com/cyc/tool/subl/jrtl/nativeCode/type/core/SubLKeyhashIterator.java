/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SubLKeyhashIterator extends FromSubLisp {
	SubLKeyhashIterator(SubLHashtable hashTable) {
		iter = hashTable.getEntrySetIterator();
		next();
	}

	private Iterator iter;
	private Map.Entry entry;
	public static String HASHTABLE_ITERATOR_TYPE_NAME = "HASHTABLE-ITERATOR";

	@Override
	public boolean canFastHash() {
		return true;
	}

	public void clear() {
		iter = null;
		entry = null;
	}

	public SubLObject getCurrentKey() {
		return (SubLObject) entry.getKey();
	}

	public SubLObject getCurrentValue() {
		return (SubLObject) entry.getValue();
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return iter.hashCode();
		return 0;
	}

	public boolean hasNext() {
		return entry != null;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return true;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return true;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	public Object next() {
		if (iter.hasNext())
			entry = (Entry) iter.next();
		else
			entry = null;
		return entry;
	}

	@Override
	public SubLKeyhashIterator toKeyhashIterator() {
		return this;
	}
//
//	@Override
//	public String printObject() {
//		return "#<" + toTypeName() + " @ " + super.toString() + ">";
//	}

	@Override
	public String toTypeName() {
		return "HASHTABLE-ITERATOR";
	}
}
