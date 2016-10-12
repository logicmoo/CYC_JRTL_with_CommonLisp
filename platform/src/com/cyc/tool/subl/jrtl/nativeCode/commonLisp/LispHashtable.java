/*
 * HashTable.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: HashTable.java 12431 2010-02-08 08:05:15Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class LispHashtable extends AbstractLispObject implements HashTable {
	protected static class HashEntry {
		SubLObject key;
		SubLObject value;
		HashEntry next;

		HashEntry(SubLObject key, SubLObject value) {
			this.key = key;
			this.value = value;
		}
	}

	private static int DEFAULT_SIZE = 16;

	protected static float loadFactor = 0.75f;

	protected static int calculateInitialCapacity(int size) {
		int capacity = 1;
		while (capacity < size)
			capacity <<= 1;
		return capacity;
	}

	protected SubLObject rehashSize;

	protected SubLObject rehashThreshold;

	// The rounded product of the capacity and the load factor. When the number
	// of elements exceeds the threshold, the implementation calls rehash().
	protected int threshold;

	// Array containing the actual key-value mappings.
	protected HashEntry[] buckets;

	// The number of key-value pairs.
	protected int count;

	protected LispHashtable() {
		this.rehashSize = LispObjectFactory.makeSingle(1.5f); // FIXME
		this.rehashThreshold = LispObjectFactory.makeSingle(0.75f); // FIXME
		this.buckets = new HashEntry[LispHashtable.DEFAULT_SIZE];
		this.threshold = (int) (LispHashtable.DEFAULT_SIZE * LispHashtable.loadFactor);
	}

	protected LispHashtable(int size, SubLObject rehashSize, SubLObject rehashThreshold) {
		this.rehashSize = rehashSize;
		this.rehashThreshold = rehashThreshold;
		this.buckets = new HashEntry[size];
		this.threshold = (int) (size * LispHashtable.loadFactor);
	}

	public SubLObject classOf() {
		return BuiltInClass.HASH_TABLE;
	}

	public synchronized void clear() {
		for (int i = this.buckets.length; i-- > 0;)
			this.buckets[i] = null;
		this.count = 0;
	}

	// Returns a list of (key . value) pairs.
	public SubLObject ENTRIES() {
		SubLObject list = Lisp.NIL;
		for (int i = this.buckets.length; i-- > 0;) {
			HashEntry e = this.buckets[i];
			while (e != null) {
				list = LispObjectFactory.makeCons(LispObjectFactory.makeCons(e.key, e.value), list);
				e = e.next;
			}
		}
		return list;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof HashTable) {
			HashTable ht = (HashTable) obj;
			if (this.count != ht.getCount())
				return false;
			if (this.getTest() != ht.getTest())
				return false;
			SubLObject entries = this.ENTRIES();
			while (entries != Lisp.NIL) {
				SubLObject entry = entries.first();
				SubLObject key = entry.first();
				SubLObject value = entry.rest();
				if (!value.equalp(ht.getHT(key)))
					return false;
				entries = entries.rest();
			}
			return true;
		}
		return false;
	}

	public int getCount() {
		return this.count;
	}

	// gethash key hash-table &optional default => value, present-p
	public synchronized SubLObject gethash(SubLObject key)

	{
		SubLObject value = this.getHT(key);
		SubLObject presentp;
		if (value == null)
			value = presentp = Lisp.NIL;
		else
			presentp = Lisp.T;
		return LispThread.currentThread().setValues(value, presentp);
	}

	// gethash key hash-table &optional default => value, present-p
	public synchronized SubLObject gethash(SubLObject key, SubLObject defaultValue)

	{
		SubLObject value = this.getHT(key);
		SubLObject presentp;
		if (value == null) {
			value = defaultValue;
			presentp = Lisp.NIL;
		} else
			presentp = Lisp.T;
		return LispThread.currentThread().setValues(value, presentp);
	}

	public synchronized SubLObject gethash1(SubLObject key)

	{
		SubLObject value = this.getHT(key);
		return value != null ? value : Lisp.NIL;
	}

	public abstract SubLObject getHT(SubLObject key);

	public SubLObject getParts() {
		SubLObject parts = Lisp.NIL;
		for (int i = 0; i < this.buckets.length; i++) {
			HashEntry e = this.buckets[i];
			while (e != null) {
				parts = parts.push(LispObjectFactory.makeCons("KEY [bucket " + i + "]", e.key));
				parts = parts.push(LispObjectFactory.makeCons("VALUE", e.value));
				e = e.next;
			}
		}
		return parts.nreverse();
	}

	public SubLObject getRehashSize() {
		return this.rehashSize;
	}

	public SubLObject getRehashThreshold() {
		return this.rehashThreshold;
	}

	public int getSize() {
		return this.buckets.length;
	}

	public abstract SubLSymbol getTest();

	public SubLObject MAPHASH(SubLObject function) {
		for (int i = this.buckets.length; i-- > 0;) {
			HashEntry e = this.buckets[i];
			while (e != null) {
				function.execute(e.key, e.value);
				e = e.next;
			}
		}
		return Lisp.NIL;
	}

	// For EQUALP hash tables.

	public int psxhash() {
		long result = 2062775257; // Chosen at random.
		result = Lisp.mix(result, this.count);
		result = Lisp.mix(result, this.getTest().sxhash());
		return (int) (result & 0x7fffffff);
	}

	public synchronized SubLObject puthash(SubLObject key, SubLObject newValue)

	{
		this.putVoid(key, newValue);
		return newValue;
	}

	public abstract void putVoid(SubLObject key, SubLObject value);

	public abstract void rehash();

	// remhash key hash-table => generalized-boolean
	public synchronized SubLObject remhash(SubLObject key)

	{
		// A value in a Lisp hash table can never be null, so...
		return this.removeHT(key) != null ? Lisp.T : Lisp.NIL;
	}

	public abstract SubLObject removeHT(SubLObject key);

	public SubLObject typeOf() {
		return LispSymbols.HASH_TABLE;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.HASH_TABLE)
			return Lisp.T;
		if (type == BuiltInClass.HASH_TABLE)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		if (LispSymbols.PRINT_READABLY.symbolValue(LispThread.currentThread()) != Lisp.NIL) {
			Lisp.error(new PrintNotReadable(Lisp.list(Keyword.OBJECT, this)));
			return null; // Not reached.
		}
		StringBuilder sb = new StringBuilder(this.getTest().writeToString());
		sb.append(' ');
		sb.append(LispSymbols.HASH_TABLE.writeToString());
		sb.append(' ');
		sb.append(this.count);
		if (this.count == 1)
			sb.append(" entry");
		else
			sb.append(" entries");
		sb.append(", ");
		sb.append(this.buckets.length);
		sb.append(" buckets");
		return this.unreadableString(sb.toString());
	}
}
