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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class Hashtables implements SubLFile {

	//// Constructors

	public static SubLFile me = new Hashtables();

	public static SubLObject clrhash(SubLObject table) {
		table.toHashtable().clear();
		return CommonSymbols.NIL;
	}

	//// Public Area

	public static SubLObject getEntryKey(Entry entry) {
		// @todo handle this natively in the translator
		return (SubLObject) entry.getKey();
	}

	public static Iterator getEntrySetIterator(SubLObject table) {
		return table.toHashtable().getEntrySetIterator();
	}

	public static SubLObject getEntryValue(Entry entry) {
		// @todo handle this natively in the translator
		return (SubLObject) entry.getValue();
	}

	public static SubLObject gethash(SubLObject key, SubLObject table) {
		return Hashtables.gethash(table, key, CommonSymbols.NIL);
	}

	public static SubLObject gethash(SubLObject key, SubLObject table, SubLObject defaultValue) {
		SubLObject result = table.get(key);
		if (result == null)
			return Values.values(defaultValue == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : defaultValue,
					CommonSymbols.NIL);
		return Values.values(result, CommonSymbols.T);
	}

	public static SubLObject gethash_bucket(SubLObject key, SubLObject table) {
		SubLHashtable tableTyped = table.toHashtable();
		//// Copied from HashMap.hash() /////
		int h = key.hashCode();
		h += ~(h << 9);
		h ^= h >>> 14;
		h += h << 4;
		h ^= h >>> 10;
		/////////////////////////////////////
		h %= tableTyped.getCurrentCapacity();
		return SubLObjectFactory.makeInteger(h);
	}

	public static SubLObject gethash_without_values(SubLObject key, SubLObject table) {
		SubLObject result = table.get(key);
		return result == null ? CommonSymbols.NIL : result;
	}

	public static SubLObject gethash_without_values(SubLObject key, SubLObject table, SubLObject defaultValue) {
		SubLObject result = table.get(key);
		return result != null ? result : defaultValue == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : defaultValue;
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
		// @todo handle this natively in the translator
		return iter.hasNext();
	}

	public static Entry iteratorNextEntry(Iterator iter) {
		// @todo handle this natively in the translator
		return (Entry) iter.next();
	}

	//// CDOHASH macro helpers

	public static void main(String[] args) {
		SubLHashtable table = SubLObjectFactory.makeHashtable();

		// (%local iter (%CDOHASH-GET-ENTRY-SET-ITERATOR table) "Iterator")
		Iterator iter = Hashtables.getEntrySetIterator(table);
		// (while (%CDOHASH-ITERATOR-HAS-NEXT iter) ...)
		while (Hashtables.iteratorHasNext(iter)) {
			// (%local entry (%CDOHASH-ITERATOR-NEXT-ENTRY iter) "Entry")
			Entry entry = Hashtables.iteratorNextEntry(iter);
			// (%local key (%CDOHASH-GET-ENTRY-KEY entry))
			SubLObject key = Hashtables.getEntryKey(entry);
			// (%local value (%CDOHASH-GET-ENTRY-VALUE entry))
			SubLObject value = Hashtables.getEntryValue(entry);
			// body here
		}
	}

	public static SubLObject make_hash_table(SubLObject size) {
		return Hashtables.make_hash_table(size, CommonSymbols.EQL, CommonSymbols.NIL);
	}

	public static SubLObject make_hash_table(SubLObject size, SubLObject test) {
		return Hashtables.make_hash_table(size, test, CommonSymbols.NIL);
	}

	public static SubLObject make_hash_table(SubLObject size, SubLObject test, SubLObject area) {
		if (test == CommonSymbols.UNPROVIDED)
			test = CommonSymbols.EQL;
		SubLFunction func = test.getFunc();
		BinaryFunction bff = BinaryFunction.makeInstance(func);
		return SubLObjectFactory.makeHashtable(size.intValue(), bff);
	}

	public static SubLObject maphash(SubLObject function, SubLObject table) {
		return Errors.unimplementedMethod("Hashtables.maphash()");
	}

	public static SubLObject next_hash_index(SubLObject table, SubLObject index) {
		return Errors.unimplementedMethod("Hashtables.next_hash_index()");
	}

	public static void releaseEntrySetIterator(Iterator iter) {
		// @todo unstub this
	}

	public static SubLObject remhash(SubLObject key, SubLObject table) {
		return table.remove(key);
	}

	public static SubLObject sethash(SubLObject key, SubLObject table, SubLObject value) {
		table.put(key, value);
		return value;
	}

	//// Initializers

	/** Creates a new instance of Hashtables. */
	private Hashtables() {
	}

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

	public void initializeVariables() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

	public void runTopLevelForms() {
	}

}
