/*
 * EqHashTable.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: EqHashTable.java,v 1.8 2005-11-05 19:15:07 piso Exp $
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
 */

package org.armedbear.lisp;

public final class EqHashTable extends HashTable
{
    private LispObject cachedKey;
    private int cachedIndex;

    private int mask;

    public EqHashTable(int size, LispObject rehashSize,
                       LispObject rehashThreshold)
    {
        super(calculateInitialCapacity(size), rehashSize, rehashThreshold);
        mask = buckets.length - 1;
    }

    private static int calculateInitialCapacity(int size)
    {
        int capacity = 1;
        while (capacity < size)
            capacity <<= 1;
        return capacity;
    }

    public Symbol getTest()
    {
        return Symbol.EQ;
    }

    public LispObject get(LispObject key)
    {
        final int index;
        if (key == cachedKey) {
            index = cachedIndex;
        } else {
            index = key.sxhash() & mask;
            cachedKey = key;
            cachedIndex = index;
        }
        HashEntry e = buckets[index];
        while (e != null) {
            if (key == e.key)
                return e.value;
            e = e.next;
        }
        return null;
    }

    public void put(LispObject key, LispObject value)
    {
        int index;
        if (key == cachedKey) {
            index = cachedIndex;
        } else {
            index = key.sxhash() & mask;
            cachedKey = key;
            cachedIndex = index;
        }
        HashEntry e = buckets[index];
        while (e != null) {
            if (key == e.key) {
                e.value = value;
                return;
            }
            e = e.next;
        }
        // Not found. We need to add a new entry.
        if (++count > threshold) {
            rehash();
            // Need a new hash value to suit the bigger table.
            index = key.sxhash() & mask;
            cachedKey = key;
            cachedIndex = index;
        }
        e = new HashEntry(key, value);
        e.next = buckets[index];
        buckets[index] = e;
    }

    public LispObject remove(LispObject key)
    {
        final int index;
        if (key == cachedKey) {
            index = cachedIndex;
        } else {
            index = key.sxhash() & mask;
            cachedKey = key;
            cachedIndex = index;
        }
        HashEntry e = buckets[index];
        HashEntry last = null;
        while (e != null) {
            if (key == e.key) {
                if (last == null)
                    buckets[index] = e.next;
                else
                    last.next = e.next;
                --count;
                return e.value;
            }
            last = e;
            e = e.next;
        }
        return null;
    }

    protected void rehash()
    {
        cachedKey = null; // Invalidate the cache!
        HashEntry[] oldBuckets = buckets;
        final int newCapacity = buckets.length * 2;
        threshold = (int) (newCapacity * loadFactor);
        buckets = new HashEntry[newCapacity];
        mask = buckets.length - 1;
        for (int i = oldBuckets.length; i-- > 0;) {
            HashEntry e = oldBuckets[i];
            while (e != null) {
                final int index = e.key.sxhash() & mask;
                HashEntry dest = buckets[index];
                if (dest != null) {
                    while (dest.next != null)
                        dest = dest.next;
                    dest.next = e;
                } else
                    buckets[index] = e;
                HashEntry next = e.next;
                e.next = null;
                e = next;
            }
        }
    }
}
