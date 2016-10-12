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

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class Keyhashes implements SubLFile {

	//// Constructors

	public static SubLFile me = new Keyhashes();

	public static SubLObject clrkeyhash(SubLObject table) {
		table.toKeyhash().clear();
		return CommonSymbols.NIL;
	}

	//// Public Area

	public static SubLObject do_keyhash_nodes(SubLObject keyhash) {
		return keyhash.toKeyhash().toSubLList();
	}

	public static SubLObject getEntryKey(Entry entry) {
		// @todo handle this natively in the translator
		// final SubLHashtableKeyEntry boxedKey =
		// (SubLHashtableKeyEntry)entry.getKey();
		// return boxedKey.getKey();
		// return (SubLObject)entry.getKey();
		return null;
	}

	public static Iterator getEntrySetIterator(SubLObject table) {
		// return table.toHashtable().getEntrySetIterator();
		return null;
	}

	public static SubLObject getEntryValue(Entry entry) {
		// @todo handle this natively in the translator
		// return (SubLObject)entry.getValue();
		return null;
	}

	public static SubLObject getkeyhash(SubLObject key, SubLObject table) {
		return table.hasKey(key) ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject hash_index_key(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_key()");
	}

	public static SubLObject hash_index_obj(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.hash_index_obj()");
	}

	public static boolean iteratorHasNext(Iterator iter) {
		// @todo handle this natively in the translator
		return iter.hasNext();
	}

	public static Entry iteratorNextEntry(Iterator iter) {
		// @todo handle this natively in the translator
		// return (Entry)iter.next();
		return null;
	}

	public static SubLObject keyhash_capacity(SubLObject table) {
		return SubLNumberFactory.makeInteger((int) (table.toKeyhash().size() * 1.3)); // @hack
	}

	public static SubLObject keyhash_count(SubLObject table) {
		return SubLNumberFactory.makeInteger(table.toKeyhash().size());
	}

	//// CDOKEYHASH macro helpers

	public static SubLObject keyhash_matching_key(SubLObject key, SubLObject table) {
		return table.hasKey(key) ? key : CommonSymbols.NIL;
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
		else {
			SubLFunction func = test.getFunc();
			BinaryFunction bf = BinaryFunction.makeInstance(func);
			return SubLObjectFactory.makeKeyhash(size.intValue(), bf);
		}
	}

	public static SubLObject next_hash_index(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.next_hash_index()");
	}

	public static void releaseEntrySetIterator(Iterator iter) {
		// @todo unstub this
	}

	public static SubLObject remkeyhash(SubLObject key, SubLObject table) {
		return table.remKey(key) ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject setkeyhash(SubLObject key, SubLObject table) {
		table.addKey(key);
		return key;
	}

	//// Initializers

	/** Creates a new instance of Hashtables. */
	private Keyhashes() {
	}

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

	public void initializeVariables() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

	public void runTopLevelForms() {
	}

}
