//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLHashtable extends FromSubLisp implements SubLObject {
	public static class SubLEqHashtableKeyEntryImpl extends FromSubLisp implements SubLHashtableKeyEntry {
		private SubLObject key;

		@Override
		public boolean canFastHash() {
			return key.canFastHash();
		}

		@Override
		public void clear() {
			key = null;
		}

		@Override
		public boolean equals(Object obj) {
			return key == obj;
		}

		@Override
		public SubLObject getKey() {
			return key;
		}

		@Override
		public int hashCode(int currentDepth) {
			return key.hashCode(currentDepth);
		}

		@Override
		public void init(SubLObject key) {
			this.key = key;
		}

		@Override
		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		@Override
		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqlHashtableKeyEntryImpl extends FromSubLisp implements SubLHashtableKeyEntry {
		private SubLObject key;

		@Override
		public boolean canFastHash() {
			return key.canFastHash();
		}

		@Override
		public void clear() {
			key = null;
		}

		@Override
		public boolean equals(Object obj) {
			return key.eql((SubLObject) obj);
		}

		@Override
		public SubLObject getKey() {
			return key;
		}

		@Override
		public int hashCode(int currentDepth) {
			return key.hashCode(currentDepth);
		}

		@Override
		public void init(SubLObject key) {
			this.key = key;
		}

		@Override
		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		@Override
		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqualHashtableKeyEntryImpl extends FromSubLisp implements SubLHashtableKeyEntry {
		private SubLObject key;

		@Override
		public boolean canFastHash() {
			return key.canFastHash();
		}

		@Override
		public void clear() {
			key = null;
		}

		@Override
		public boolean equals(Object obj) {
			return key.equal((SubLObject) obj);
		}

		@Override
		public SubLObject getKey() {
			return key;
		}

		@Override
		public int hashCode(int currentDepth) {
			return key.hashCode(currentDepth);
		}

		@Override
		public void init(SubLObject key) {
			this.key = key;
		}

		@Override
		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		@Override
		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqualpHashtableKeyEntryImpl extends FromSubLisp implements SubLHashtableKeyEntry {
		private SubLObject key;

		@Override
		public boolean canFastHash() {
			return key.canFastHash();
		}

		@Override
		public void clear() {
			key = null;
		}

		@Override
		public boolean equals(Object obj) {
			return key.equalp((SubLObject) obj);
		}

		@Override
		public SubLObject getKey() {
			return key;
		}

		@Override
		public int hashCode(int currentDepth) {
			return key.hashCode(currentDepth);
		}

		@Override
		public void init(SubLObject key) {
			this.key = key;
		}

		@Override
		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		@Override
		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public interface SubLHashtableKeyEntry extends SubLObject {
		void clear();

		SubLObject getKey();

		void init(SubLObject p0);

		void init(SubLObject p0, BinaryFunction p1);
	}

	public static class SubLHashtableKeyEntryImpl extends FromSubLisp implements SubLHashtableKeyEntry {
		private SubLObject key;
		private BinaryFunction test;

		@Override
		public boolean canFastHash() {
			return key.canFastHash();
		}

		@Override
		public void clear() {
			key = null;
			test = null;
		}

		@Override
		public boolean equals(Object obj) {
			boolean result = SubLNil.NIL != test.processItem(key, (SubLObject) obj);
			return result;
		}

		@Override
		public SubLObject getKey() {
			return key;
		}

		@Override
		public int hashCode(int currentDepth) {
			return key.hashCode(currentDepth);
		}

		@Override
		public void init(SubLObject key) {
			Errors.error("Ugh.");
		}

		@Override
		public void init(SubLObject key, BinaryFunction test) {
			this.key = key;
			this.test = test;
		}

		@Override
		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	interface SubLKeyEntryFactory {
		SubLHashtableKeyEntry makeKeyEntry();
	}

	SubLHashtable() {
		this(128, BinaryFunction.EQL_TEST);
	}

	SubLHashtable(int size) {
		this(size, BinaryFunction.EQL_TEST);
	}

	SubLHashtable(int size, BinaryFunction test) {
		hash = ConcurrentSubLHashtableFactory.factory.createMap((int) (size * 1.5) + 1);
		this.test = test;
		if (test == BinaryFunction.EQ_TEST)
			keyFactory = SubLHashtable.EQ_KEY_FACTORY;
		else if (test == BinaryFunction.EQL_TEST)
			keyFactory = SubLHashtable.EQL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUAL_TEST)
			keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUALP_TEST)
			keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
		else {
			Errors.error("Got non-equality test for hashtable: " + test);
			keyFactory = null;
		}
	}

	private BinaryFunction test;
	private Map<SubLObject, SubLObject> hash;
	private SubLKeyEntryFactory keyFactory;
	public static String HASHTABLE_TYPE_NAME = "HASHTABLE";
	static SubLKeyEntryFactory EQ_KEY_FACTORY;
	static SubLKeyEntryFactory EQL_KEY_FACTORY;
	static SubLKeyEntryFactory EQUAL_KEY_FACTORY;
	static SubLKeyEntryFactory EQUALP_KEY_FACTORY;
	static {
		EQ_KEY_FACTORY = new SubLKeyEntryFactory() {
			@Override
			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			}
		};
		EQL_KEY_FACTORY = new SubLKeyEntryFactory() {
			@Override
			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
			}
		};
		EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {
			@Override
			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
			}
		};
		EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {
			@Override
			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
			}
		};
	}

	@Override
	public boolean canFastHash() {
		return false;
	}

	public void clear() {
		hash.clear();
	}

	public boolean containsKey(Object obj) {
		SubLHashtableKeyEntryImpl key = null;
		try {
			key = Resourcer.getInstance().acquireHashtableKeyEntry();
			key.init((SubLObject) obj, test);
			boolean result = hash.containsKey(key);
			return result;
		} finally {
			Resourcer.getInstance().releaseHashtableKeyEntry(key);
		}
	}

	public boolean containsValue(Object obj) {
		return hash.containsValue(obj);
	}

	public Set entrySet() {
		Errors.unimplementedMethod("SubLHashtable.entrySet()");
		return null;
	}

	@Override
	public SubLObject get(SubLObject obj) {
		if (test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return hash.get(key);
		}
		if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
			key.init(obj);
			return hash.get(key);
		}
		SubLHashtableKeyEntryImpl key2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			key2 = resourcer.acquireHashtableKeyEntry();
			key2.init(obj, test);
			return hash.get(key2);
		} finally {
			resourcer.releaseHashtableKeyEntry(key2);
		}
	}

	public int getCurrentCapacity() {
		return (int) (hash.size() * 1.3) + 1;
	}

	public Iterator getEntrySetIterator() {
		return hash.entrySet().iterator();
	}

	public BinaryFunction getTest() {
		return test;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_hash_table$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.NINE_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return 0;
		return 0;
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

	public boolean isEmpty() {
		return hash.isEmpty();
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
		return true;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
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
		return false;
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

	public Set keySet() {
		Errors.unimplementedMethod("SubLHashtable.keySet()");
		return null;
	}

	@Override
	public SubLObject put(SubLObject key, SubLObject value) {
		if (test == BinaryFunction.EQUALP_TEST) {
			boolean knownKey = containsKey(key);
			if (knownKey)
				remove(key);
			return hash.put(key, value);
		}
		return hash.put(key, value);
	}

	public void putAll(Map map) {
		Errors.unimplementedMethod("SubLHashtable.putAll()");
	}

	@Override
	public SubLObject remove(SubLObject obj) {
		if (test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return hash.remove(key);
		}
		if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
			key.init(obj);
			return hash.remove(key);
		}
		SubLHashtableKeyEntryImpl key2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			key2 = resourcer.acquireHashtableKeyEntry();
			key2.init(obj, test);
			return hash.remove(key2);
		} finally {
			resourcer.releaseHashtableKeyEntry(key2);
		}
	}

	@Override
	public int size() {
		return hash.size();
	}

	@Override
	public SubLHashtable toHashtable() {
		return this;
	}

	@Override
	public String printObjectImpl() {
		return "#<HASH-TABLE " + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + this.size()
				+ " entries @ " + super.toString() + ">";
	}

	public String toStringComplete() {
		return toString();
	}

	@Override
	public String toTypeName() {
		return "HASHTABLE";
	}

	public Collection values() {
		return hash.values();
	}
}
