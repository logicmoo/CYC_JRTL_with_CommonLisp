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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class hashtables_high implements SubLFile {

	//// Constructor

	public static SubLFile me = new hashtables_high();

	private static SubLObject[] $constants = new SubLObject[2];

	//// Internal Constants

	/** Destroy HASH-TABLE-ITERATOR */
	public static SubLObject destroy_hash_table_iterator(SubLObject hash_table_iterator) {
		hash_table_iterator.toHashtableIterator().clear();
		return CommonSymbols.NIL;
	}

	//// Definitions

	/** Return T iff HASH-TABLE-ITERATOR has completed. */
	public static SubLObject hash_table_iterator_done_p(SubLObject hash_table_iterator) {
		boolean result = !hash_table_iterator.toHashtableIterator().hasNext();
		return SubLObjectFactory.makeBoolean(result);
	}

	/**
	 * Return the hash-table over which HASH-TABLE-ITERATOR is currently
	 * iterating.
	 */
	public static SubLObject hash_table_iterator_hash_table(SubLObject hash_table_iterator) {
		return Errors.unimplementedMethod("HASH-TABLE-ITERATOR-HASH-TABLE");
	}

	/**
	 * Return the current hashtable key of the iteration by HASH-TABLE-ITERATOR.
	 */
	public static SubLObject hash_table_iterator_key(SubLObject hash_table_iterator) {
		return hash_table_iterator.toHashtableIterator().getCurrentKey();
	}

	/** Step HASH-TABLE-ITERATOR to make the next key/value pair current. */
	public static SubLObject hash_table_iterator_next(SubLObject hash_table_iterator) {
		hash_table_iterator.toHashtableIterator().next();
		return hash_table_iterator;
	}

	/** Return T iff OBJECT is a hash-table-iterator */
	public static SubLObject hash_table_iterator_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isHashtableIterator());
	}

	/**
	 * Return the current hashtable value of the iteration by
	 * HASH-TABLE-ITERATOR.
	 */
	public static SubLObject hash_table_iterator_value(SubLObject hash_table_iterator) {
		return hash_table_iterator.toHashtableIterator().getCurrentValue();
	}

	/** Return a new hash-table-iterator for iterating over HASH-TABLE. */
	public static SubLObject make_hash_table_iterator(SubLObject hash_table) {
		return SubLObjectFactory.makeHashtableIterator(hash_table.toHashtable());
	}

	private hashtables_high() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_p", "HASH-TABLE-ITERATOR-P", 1, 0, false);
		SubLFiles.declareFunction(hashtables_high.me, "make_hash_table_iterator", "MAKE-HASH-TABLE-ITERATOR", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "destroy_hash_table_iterator", "DESTROY-HASH-TABLE-ITERATOR", 1,
				0, false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_hash_table",
				"HASH-TABLE-ITERATOR-HASH-TABLE", 1, 0, false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_done_p", "HASH-TABLE-ITERATOR-DONE-P", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_key", "HASH-TABLE-ITERATOR-KEY", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_value", "HASH-TABLE-ITERATOR-VALUE", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_next", "HASH-TABLE-ITERATOR-NEXT", 1, 0,
				false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	/// private stuff

}
