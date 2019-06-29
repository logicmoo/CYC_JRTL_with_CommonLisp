//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Keyhashes implements SubLFile {
	public static SubLObject clrkeyhash(SubLObject table) {
		table.toKeyhash().clear();
		return SubLNil.NIL;
	}

	public static SubLObject do_keyhash_nodes(SubLObject keyhash) {
		return keyhash.toKeyhash().toSubLList();
	}

	public static SubLObject getEntryKey(Map.Entry entry) {
		return null;
	}

	public static Iterator getEntrySetIterator(SubLObject table) {
		return null;
	}

	public static SubLObject getEntryValue(Map.Entry entry) {
		return null;
	}

	public static SubLObject getkeyhash(SubLObject key, SubLObject table) {
		return table.hasKey(key) ? CommonSymbols.RET_T : SubLNil.NIL;
	}

	public static SubLObject hash_index_key(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_key()");
	}

	public static SubLObject hash_index_obj(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_obj()");
	}

	public static boolean iteratorHasNext(Iterator iter) {
		return iter.hasNext();
	}

	public static Map.Entry iteratorNextEntry(Iterator iter) {
		return null;
	}

	public static SubLObject keyhash_capacity(SubLObject table) {
		return SubLNumberFactory.makeInteger((int) (table.toKeyhash().size() * 1.3));
	}

	public static SubLObject keyhash_count(SubLObject table) {
		return SubLNumberFactory.makeInteger(table.toKeyhash().size());
	}

	public static SubLObject keyhash_matching_key(SubLObject key, SubLObject table) {
		return table.hasKey(key) ? key : SubLNil.NIL;
	}

	public static SubLObject keyhash_test(SubLObject table) {
		return table.toKeyhash().getTest().getFunction();
	}

	public static void main(String[] args) {
	}

	public static SubLObject mapkeyhash(SubLObject function, SubLObject table) {
		return Errors.unimplementedMethod("Keyhash.maphash()");
	}

	public static SubLObject new_keyhash(SubLObject size, SubLObject test) {
		if (test == CommonSymbols.UNPROVIDED)
			return SubLObjectFactory.makeKeyhash(size.intValue());
		SubLFunction func = test.getFunc();
		BinaryFunction bf = BinaryFunction.makeInstance(func);
		return SubLObjectFactory.makeKeyhash(size.intValue(), bf);
	}

	public static SubLObject next_hash_index(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.next_hash_index()");
	}

	public static void releaseEntrySetIterator(Iterator iter) {
	}

	public static SubLObject remkeyhash(SubLObject key, SubLObject table) {
		return table.remKey(key) ? CommonSymbols.RET_T : SubLNil.NIL;
	}

	public static SubLObject setkeyhash(SubLObject key, SubLObject table) {
		table.addKey(key);
		return key;
	}

	public static SubLFile me;
	static {
		me = new Keyhashes();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Keyhashes.me, "new_keyhash", "NEW-KEYHASH", 1, 1, false);
		SubLFiles.declareFunction(Keyhashes.me, "keyhash_test", "KEYHASH-TEST", 1, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "keyhash_count", "KEYHASH-COUNT", 1, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "getkeyhash", "GETKEYHASH", 2, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "setkeyhash", "SETKEYHASH", 2, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "remkeyhash", "REMKEYHASH", 2, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "clrkeyhash", "CLRKEYHASH", 1, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "mapkeyhash", "MAPKEYHASH", 2, 0, false);
		SubLFiles.declareFunction(Keyhashes.me, "do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}

	public Keyhashes() {
		BeanShellCntrl.addSubLFile(this);
	}
}
