//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.HashSet;
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

public class SubLKeyhash extends FromSubLisp implements SubLObject {
	SubLKeyhash() {
		this(128, BinaryFunction.EQL_TEST);
	}

	SubLKeyhash(int size) {
		this(size, BinaryFunction.EQL_TEST);
	}

	SubLKeyhash(int size, BinaryFunction test) {
		hash = new HashSet<SubLObject>((int) (size * 1.5) + 1);
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
	private HashSet<SubLObject> hash;
	private SubLHashtable.SubLKeyEntryFactory keyFactory;
	public static String KEYHASH_TYPE_NAME = "KEYHASH";

	@Override
	public void addKey(SubLObject key) {
		hash.add(key);
	}

	@Override
	public boolean canFastHash() {
		return false;
	}

	public void clear() {
		hash.clear();
	}

	public Set entrySet() {
		Errors.unimplementedMethod("SubLHashtable.entrySet()");
		return null;
	}

	public int getCurrentCapacity() {
		return (int) (hash.size() * 1.3) + 1;
	}

	public Iterator<SubLObject> getEntrySetIterator() {
		return hash.iterator();
	}

	public BinaryFunction getTest() {
		return test;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_keyhash$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.ONE_HUNDRED_THIRTY_SEVEN_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return 0;
		return 0;
	}

	@Override
	public boolean hasKey(SubLObject obj) {
		if (test == BinaryFunction.EQ_TEST) {
			SubLHashtable.SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return hash.contains(key);
		}
		if (obj.canFastHash()) {
			SubLHashtable.SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
			key.init(obj);
			return hash.contains(key);
		}
		SubLHashtable.SubLHashtableKeyEntryImpl key2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			key2 = resourcer.acquireHashtableKeyEntry();
			key2.init(obj, test);
			return hash.contains(key2);
		} finally {
			resourcer.releaseHashtableKeyEntry(key2);
		}
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
		return false;
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
		return true;
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

	public void putAll(Map map) {
		Errors.unimplementedMethod("SubLHashtable.putAll()");
	}

	@Override
	public boolean remKey(SubLObject obj) {
		if (test == BinaryFunction.EQ_TEST) {
			SubLHashtable.SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return hash.remove(key);
		}
		if (obj.canFastHash()) {
			SubLHashtable.SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
			key.init(obj);
			return hash.remove(key);
		}
		SubLHashtable.SubLHashtableKeyEntryImpl key2 = null;
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
	public SubLKeyhash toKeyhash() {
		return this;
	}

	@Override
	public String printObject() {
		return "#<" + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + this.size()
				+ " entries @ " + super.easyToString() + ">";
	}

	public String toStringComplete() {
		return toString();
	}

	public SubLList toSubLList() {
		SubLList result = SubLNil.NIL;
		SubLObject[] values = hash.toArray(new SubLObject[hash.size()]);
		for (int i = 0, size = values.length; i < size; ++i)
			result = result.push(values[i]);
		return SubLNil.NIL;
	}

	public SubLList toSubLVector() {
		SubLList result = SubLNil.NIL;
		SubLObject[] values = hash.toArray(new SubLObject[hash.size()]);
		for (int i = 0, size = values.length; i < size; ++i)
			result = result.push(values[i]);
		return SubLNil.NIL;
	}

	@Override
	public String toTypeName() {
		return "KEYHASH";
	}
}
