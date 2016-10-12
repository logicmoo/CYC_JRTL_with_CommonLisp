/*
 * HashTableFunctions.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: HashTableFunctions.java 12513 2010-03-02 22:35:36Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class HashTableFunctions {
	static SubLObject FUNCTION_EQ = LispSymbols.EQ.getSymbolFunction();
	static SubLObject FUNCTION_EQL = LispSymbols.EQL.getSymbolFunction();
	static SubLObject FUNCTION_EQUAL = LispSymbols.EQUAL.getSymbolFunction();
	static SubLObject FUNCTION_EQUALP = LispSymbols.EQUALP.getSymbolFunction();

	// ### %make-hash-table
	private static Primitive _MAKE_HASH_TABLE = new JavaPrimitive("%make-hash-table", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject test, SubLObject size, SubLObject rehashSize, SubLObject rehashThreshold)

		{
			int n = size.intValue();
			if (test == HashTableFunctions.FUNCTION_EQL || test == Lisp.NIL)
				return new EqlHashTable(n, rehashSize, rehashThreshold);
			if (test == HashTableFunctions.FUNCTION_EQ)
				return new EqHashTable(n, rehashSize, rehashThreshold);
			if (test == HashTableFunctions.FUNCTION_EQUAL)
				return new EqualHashTable(n, rehashSize, rehashThreshold);
			if (test == HashTableFunctions.FUNCTION_EQUALP)
				return new EqualpHashTable(n, rehashSize, rehashThreshold);
			return Lisp.error(new LispError("Unsupported test for MAKE-HASH-TABLE: " + test.writeToString()));
		}
	};

	// ### gethash key hash-table &optional default => value, present-p
	private static Primitive GETHASH = new JavaPrimitive(LispSymbols.GETHASH, "key hash-table &optional default") {

		public SubLObject execute(SubLObject key, SubLObject ht)

		{
			return HashTableFunctions.checkHashTable(ht).gethash(key);
		}

		public SubLObject execute(SubLObject key, SubLObject ht, SubLObject defaultValue)

		{
			return HashTableFunctions.checkHashTable(ht).gethash(key, defaultValue);
		}
	};

	// ### gethash1 key hash-table => value
	private static Primitive GETHASH1 = new JavaPrimitive(LispSymbols.GETHASH1, "key hash-table") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			HashTable ht = HashTableFunctions.checkHashTable(second);
			synchronized (ht) {
				SubLObject value = ht.getHT(first);
				return value != null ? value : Lisp.NIL;
			}
		}
	};

	// ### puthash key hash-table new-value &optional default => value
	private static Primitive PUTHASH = new JavaPrimitive(LispSymbols.PUTHASH,
			"key hash-table new-value &optional default") {

		public SubLObject execute(SubLObject key, SubLObject ht, SubLObject value)

		{
			return HashTableFunctions.checkHashTable(ht).puthash(key, value);
		}

		public SubLObject execute(SubLObject key, SubLObject ht, SubLObject ignored, SubLObject value)

		{
			return HashTableFunctions.checkHashTable(ht).puthash(key, value);
		}
	};

	// remhash key hash-table => generalized-boolean
	private static Primitive REMHASH = new JavaPrimitive(LispSymbols.REMHASH, "key hash-table") {

		public SubLObject execute(SubLObject key, SubLObject ht)

		{
			return HashTableFunctions.checkHashTable(ht).remhash(key);
		}
	};

	// ### clrhash hash-table => hash-table
	private static Primitive CLRHASH = new JavaPrimitive(LispSymbols.CLRHASH, "hash-table") {

		public SubLObject execute(SubLObject ht) {
			HashTableFunctions.checkHashTable(ht).clear();
			return ht;
		}
	};

	// ### hash-table-count
	private static Primitive HASH_TABLE_COUNT = new JavaPrimitive(LispSymbols.HASH_TABLE_COUNT, "hash-table") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(HashTableFunctions.checkHashTable(arg).getCount());
		}
	};

	// ### sxhash object => hash-code
	private static Primitive SXHASH = new JavaPrimitive(LispSymbols.SXHASH, "object") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(arg.sxhash());
		}
	};

	// ### psxhash object => hash-code
	// For EQUALP hash tables.
	private static Primitive PSXHASH = new JavaPrimitive("psxhash", Lisp.PACKAGE_SYS, true, "object") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(arg.psxhash());
		}
	};

	// ### hash-table-p
	private static Primitive HASH_TABLE_P = new JavaPrimitive(LispSymbols.HASH_TABLE_P, "object") {

		public SubLObject execute(SubLObject arg) {
			return arg instanceof HashTable ? Lisp.T : Lisp.NIL;
		}
	};

	// ### hash-table-entries
	private static Primitive HASH_TABLE_ENTRIES = new JavaPrimitive("hash-table-entries", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject arg) {
			return HashTableFunctions.checkHashTable(arg).ENTRIES();
		}
	};

	// ### hash-table-test
	private static Primitive HASH_TABLE_TEST = new JavaPrimitive(LispSymbols.HASH_TABLE_TEST, "hash-table") {

		public SubLObject execute(SubLObject arg) {
			return HashTableFunctions.checkHashTable(arg).getTest();
		}
	};

	// ### hash-table-size
	private static Primitive HASH_TABLE_SIZE = new JavaPrimitive(LispSymbols.HASH_TABLE_SIZE, "hash-table") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(HashTableFunctions.checkHashTable(arg).getSize());
		}
	};

	// ### hash-table-rehash-size
	private static Primitive HASH_TABLE_REHASH_SIZE = new JavaPrimitive(LispSymbols.HASH_TABLE_REHASH_SIZE,
			"hash-table") {

		public SubLObject execute(SubLObject arg) {
			return HashTableFunctions.checkHashTable(arg).getRehashSize();
		}
	};

	// ### hash-table-rehash-threshold
	private static Primitive HASH_TABLE_REHASH_THRESHOLD = new JavaPrimitive(LispSymbols.HASH_TABLE_REHASH_THRESHOLD,
			"hash-table") {

		public SubLObject execute(SubLObject arg) {
			return HashTableFunctions.checkHashTable(arg).getRehashThreshold();
		}
	};

	// ### maphash
	private static Primitive MAPHASH = new JavaPrimitive(LispSymbols.MAPHASH, "function hash-table") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return HashTableFunctions.checkHashTable(second).MAPHASH(first);
		}
	};

	protected static HashTable checkHashTable(SubLObject ht) {
		if (ht instanceof HashTable)
			return (HashTable) ht;
		Lisp.type_error(ht, LispSymbols.HASH_TABLE);
		return null;
	}
}
