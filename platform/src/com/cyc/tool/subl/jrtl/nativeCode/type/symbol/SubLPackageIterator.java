//
//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.util.Iterator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class SubLPackageIterator extends AbstractSubLObject implements Iterator {
	public static String PACKAGE_ITERATOR_TYPE_NAME = "PACKAGE-ITERATOR";

	private Iterator iter;
	private SubLObject entry;

	SubLPackageIterator(SubLPackage thePackage) {
		this.iter = thePackage.getAllSymbols().iterator();
	}

	public boolean canFastHash() {
		return true;
	}

	public void clear() {
		this.iter = null;
		this.entry = null;
	}

	public SubLObject getCurrentKey() {
		return this.entry;
	}

	public SubLObject getCurrentValue() {
		return this.entry;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return this.iter.hashCode();
		return 0;
	}

	public boolean hasNext() {
		return this.iter.hasNext();
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

	public boolean isPackageIterator() {
		return true;
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
			this.entry = (SubLObject) this.iter.next();
		else
			this.entry = null;
		return this.entry;
	}

	public void remove() {
		Errors.error("Remove on a package iterator is not supported.");
	}

	public SubLPackageIterator toPackageIterator() {
		return this;
	}

	public String toString() {
		return "#<" + this.toTypeName() + " @ " + super.toString() + ">";
	}

	public String toTypeName() {
		return "PACKAGE-ITERATOR";
	}

	public String writeToString() {
		return unreadableString(toTypeName());
	}
}
