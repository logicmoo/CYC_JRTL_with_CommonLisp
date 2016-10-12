/*
 * EqualpHashTable.java
 *
 * Copyright (C) 2004-2006 Peter Graves
 * $Id: EqualpHashTable.java 12255 2009-11-06 22:36:32Z ehuelsmann $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class EqualpHashTable extends LispHashtable {
	public EqualpHashTable(int size, SubLObject rehashSize, SubLObject rehashThreshold) {
		super(size, rehashSize, rehashThreshold);
	}

	public SubLObject getHT(SubLObject key) {
		int index = key.psxhash() % this.buckets.length;
		HashEntry e = this.buckets[index];
		while (e != null) {
			if (key.equalp(e.key))
				return e.value;
			e = e.next;
		}
		return null;
	}

	public SubLSymbol getTest() {
		return LispSymbols.EQUALP;
	}

	public void putVoid(SubLObject key, SubLObject value) {
		int index = key.psxhash() % this.buckets.length;
		HashEntry e = this.buckets[index];
		while (e != null) {
			if (key.equalp(e.key)) {
				e.value = value;
				return;
			}
			e = e.next;
		}
		// Not found. We need to add a new entry.
		if (++this.count > this.threshold) {
			this.rehash();
			// Need a new hash value to suit the bigger table.
			index = key.psxhash() % this.buckets.length;
		}
		e = new HashEntry(key, value);
		e.next = this.buckets[index];
		this.buckets[index] = e;
	}

	public void rehash() {
		HashEntry[] oldBuckets = this.buckets;
		int newCapacity = this.buckets.length * 2 + 1;
		this.threshold = (int) (newCapacity * LispHashtable.loadFactor);
		this.buckets = new HashEntry[newCapacity];
		for (int i = oldBuckets.length; i-- > 0;) {
			HashEntry e = oldBuckets[i];
			while (e != null) {
				int index = e.key.psxhash() % this.buckets.length;
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
		int index = key.psxhash() % this.buckets.length;
		HashEntry e = this.buckets[index];
		HashEntry last = null;
		while (e != null) {
			if (key.equalp(e.key)) {
				if (last == null)
					this.buckets[index] = e.next;
				else
					last.next = e.next;
				--this.count;
				return e.value;
			}
			last = e;
			e = e.next;
		}
		return null;
	}
}
