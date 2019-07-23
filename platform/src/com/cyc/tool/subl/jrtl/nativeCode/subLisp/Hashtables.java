/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.armedbear.lisp.LispObject;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Hashtables implements SubLFile {
	public static SubLObject clrhash(SubLObject table) {
		table.toHashtable().clear();
		return SubLNil.NIL;
	}

	public static SubLObject getEntryKey(Map.Entry entry) {
		return (SubLObject) entry.getKey();
	}

	public static Iterator getEntrySetIterator(SubLObject table) {
		return table.toHashtable().getEntrySetIterator();
	}

	public static SubLObject getEntryValue(Map.Entry entry) {
		return (SubLObject) entry.getValue();
	}

	public static SubLObject gethash(SubLObject key, SubLObject table) {
		return gethash(table, key, SubLNil.NIL);
	}

	public static SubLObject gethash(SubLObject key, SubLObject table, SubLObject defaultValue) {
		SubLObject result = table.get(key);
		if (result == null)
			return Values.values(defaultValue == CommonSymbols.UNPROVIDED ? SubLNil.NIL : defaultValue, SubLNil.NIL);
		return Values.values(result, CommonSymbols.T);
	}

	public static SubLObject gethash_bucket(SubLObject key, SubLObject table) {
		SubLHashtable tableTyped = table.toHashtable();
		int h = key.hashCode();
		h += ~(h << 9);
		h ^= h >>> 14;
		h += h << 4;
		h ^= h >>> 10;
		h %= tableTyped.getCurrentCapacity();
		return SubLObjectFactory.makeInteger(h);
	}

	public static SubLObject gethash_without_values(SubLObject key, SubLObject table) {
		SubLObject result = table.get(key);
		return result == null ? SubLNil.NIL : result;
	}

	public static SubLObject gethash_without_values(SubLObject key, SubLObject table, SubLObject defaultValue) {
		SubLObject result = table.get(key);
		return result != null ? result : defaultValue == CommonSymbols.UNPROVIDED ? SubLNil.NIL : defaultValue;
	}

	public static SubLObject hash_index_key(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_key()");
	}

	public static SubLObject hash_index_obj(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_obj()");
	}

	public static SubLObject hash_table_count(SubLObject table) {
		return SubLNumberFactory.makeInteger(table.toHashtable().size());
	}

	public static SubLObject hash_table_size(SubLObject table) {
		return SubLNumberFactory.makeInteger(table.toHashtable().getCurrentCapacity());
	}

	public static SubLObject hash_table_test(SubLObject table) {
		return table.toHashtable().getTest().getFunction();
	}

	public static boolean iteratorHasNext(Iterator iter) {
		return iter.hasNext();
	}

	public static Map.Entry iteratorNextEntry(Iterator iter) {
		return (Entry) iter.next();
	}

	public static void main(String[] args) {
		SubLHashtable table = SubLObjectFactory.makeHashtable();
		Iterator iter = getEntrySetIterator(table);
		while (iteratorHasNext(iter)) {
			Map.Entry entry = iteratorNextEntry(iter);
			SubLObject key = getEntryKey(entry);
			SubLObject value = getEntryValue(entry);
		}
	}

	public static SubLObject make_hash_table(SubLObject size) {
		return make_hash_table(size, CommonSymbols.EQL, SubLNil.NIL);
	}

	public static SubLObject make_hash_table(SubLObject size, SubLObject test) {
		return make_hash_table(size, test, SubLNil.NIL);
	}

	public static SubLObject make_hash_table(SubLObject size, SubLObject test, SubLObject area) {
		if (test == CommonSymbols.UNPROVIDED)
			test = CommonSymbols.EQL;
		SubLFunction func = test.getFunc();
		BinaryFunction bff = BinaryFunction.makeInstance(func);
		return (LispObject) SubLObjectFactory.makeHashtable(size.intValue(), bff);
	}

	public static SubLObject maphash(SubLObject function, SubLObject table) {
		return table.toHashtable().MAPHASH(function.toLispObject());
	}

	public static SubLObject next_hash_index(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.next_hash_index()");
	}

	public static void releaseEntrySetIterator(Iterator iter) {
	}

	public static SubLObject remhash(SubLObject key, SubLObject table) {
		return table.remove(key);
	}

	public static SubLObject sethash(SubLObject key, SubLObject table, SubLObject value) {
		table.put(key, value);
		return value;
	}

	public static SubLFile me;
	static {
		me = new Hashtables();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Hashtables.me, "make_hash_table", "MAKE-HASH-TABLE", 1, 2, false);
		SubLFiles.declareFunction(Hashtables.me, "hash_table_test", "HASH-TABLE-TEST", 1, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "hash_table_size", "HASH-TABLE-SIZE", 1, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "hash_table_count", "HASH-TABLE-COUNT", 1, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "gethash", "GETHASH", 2, 1, false);
		SubLFiles.declareFunction(Hashtables.me, "gethash_without_values", "GETHASH-WITHOUT-VALUES", 2, 1, false);
		SubLFiles.declareFunction(Hashtables.me, "sethash", "SETHASH", 3, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "remhash", "REMHASH", 2, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "clrhash", "CLRHASH", 1, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "maphash", "MAPHASH", 2, 0, false);
		SubLFiles.declareFunction(Hashtables.me, "gethash_bucket", "GETHASH-BUCKET", 2, 0, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}

	public Hashtables() {
		BeanShellCntrl.addSubLFile(this);

	}
}
