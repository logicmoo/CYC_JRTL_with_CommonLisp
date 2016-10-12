/*
 * SymbolHashTable.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: SymbolHashTable.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SymbolHashTable {
	private static class HashEntry {
		SubLSymbol symbol;
		HashEntry next;

		HashEntry(SubLSymbol symbol) {
			this.symbol = symbol;
		}
	}

	private static float LOAD_FACTOR = 0.75f;

	private static int calculateInitialCapacity(int size) {
		int capacity = 1;
		while (capacity < size)
			capacity <<= 1;
		return capacity;
	}

	private int threshold;

	private HashEntry[] buckets;

	private int count;

	private int mask;

	public SymbolHashTable(int size) {
		this.buckets = new HashEntry[SymbolHashTable.calculateInitialCapacity(size)];
		this.threshold = (int) (size * SymbolHashTable.LOAD_FACTOR);
		this.mask = this.buckets.length - 1;
	}

	public SubLSymbol getHT(SubLString key) {
		HashEntry e = this.buckets[key.sxhash() & this.mask];
		while (e != null) {
			if (key.equal(e.symbol.getSubLName()))
				return e.symbol; // Return the symbol.
			e = e.next;
		}
		return null;
	}

	public SubLSymbol getHT(SubLString key, int hash) {
		HashEntry e = this.buckets[hash & this.mask];
		while (e != null) {
			if (key.equal(e.symbol.getSubLName()))
				return e.symbol; // Return the symbol.
			e = e.next;
		}
		return null;
	}

	public List<SubLSymbol> getSymbols() {
		ArrayList<SubLSymbol> list = new ArrayList<SubLSymbol>();
		for (int i = 0; i < this.buckets.length; i++) {
			HashEntry e = this.buckets[i];
			while (e != null) {
				list.add(e.symbol);
				e = e.next;
			}
		}
		return list;
	}

	public void putHT(SubLString key, SubLSymbol symbol) {
		int index = key.sxhash() & this.mask;
		HashEntry e = this.buckets[index];
		while (e != null) {
			if (key.equal(e.symbol.getSubLName())) {
				if (e.symbol != symbol) {
					Debug.trace("replacing existing key for " + key.getString() + " in package "
							+ e.symbol.getLispPackage().writeToString());
					Thread.dumpStack();
					e.symbol = symbol;
				}
				return;
			}
			e = e.next;
		}
		// Not found. We need to add a new entry.
		if (++this.count > this.threshold) {
			this.rehash();
			// We need a new index for the bigger table.
			index = key.sxhash() & this.mask;
		}
		e = new HashEntry(symbol);
		e.next = this.buckets[index];
		this.buckets[index] = e;
	}

	public void putHT(SubLSymbol symbol) {
		int index = symbol.sxhash() & this.mask;
		HashEntry e = this.buckets[index];
		while (e != null) {
			if (symbol.getSubLName().equal(e.symbol.getSubLName())) {
				if (e.symbol != symbol) {
					Debug.trace("replacing existing key for " + symbol.getJavaSymbolName());
					Thread.dumpStack();
					e.symbol = symbol; // Replace existing key.
				}
				return;
			}
			e = e.next;
		}
		// Not found. We need to add a new entry.
		if (++this.count > this.threshold) {
			this.rehash();
			// Need a new hash value to suit the bigger table.
			index = symbol.sxhash() & this.mask;
		}
		e = new HashEntry(symbol);
		e.next = this.buckets[index];
		this.buckets[index] = e;
	}

	private void rehash() {
		HashEntry[] oldBuckets = this.buckets;
		int newCapacity = this.buckets.length * 2;
		this.threshold = (int) (newCapacity * SymbolHashTable.LOAD_FACTOR);
		this.buckets = new HashEntry[newCapacity];
		this.mask = this.buckets.length - 1;
		for (int i = oldBuckets.length; i-- > 0;) {
			HashEntry e = oldBuckets[i];
			while (e != null) {
				int index = e.symbol.sxhash() & this.mask;
				HashEntry dest = this.buckets[index];
				if (dest != null) {
					while (dest.next != null)
						dest = dest.next;
					dest.next = e;
				} else
					this.buckets[index] = e;
				HashEntry next = e.next;
				e.next = null;
				e = next;
			}
		}
	}

	public SubLObject removeHT(SubLObject key) {
		if (key instanceof SubLSymbol)
			key = ((SubLSymbol) key).getSubLName();
		int index = key.sxhash() & this.mask;
		HashEntry e = this.buckets[index];
		HashEntry last = null;
		while (e != null) {
			if (key.equal(e.symbol.getSubLName())) {
				if (last == null)
					this.buckets[index] = e.next;
				else
					last.next = e.next;
				--this.count;
				return e.symbol; // The key is the value!
			}
			last = e;
			e = e.next;
		}
		return null;
	}
}
