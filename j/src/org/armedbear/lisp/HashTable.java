/*
 * HashTable.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: HashTable.java,v 1.2 2003-03-11 14:11:47 piso Exp $
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

public final class HashTable extends LispObject
{
    private static final int TEST_EQ     = 0;
    private static final int TEST_EQL    = 1;
    private static final int TEST_EQUAL  = 2;
    private static final int TEST_EQUALP = 3;

    private int test;

    // The rounded product of the capacity and the load factor. When the number
    // of elements exceeds the threshold, the implementation calls rehash().
    private int threshold;

    private final float loadFactor = 0.75f;

    // Array containing the actual key-value mappings.
    private HashEntry[] buckets;

    // The number of key-value pairs.
    private int size;

    public HashTable(LispObject test, LispObject size, LispObject rehashSize,
        LispObject rehashThreshold) throws LispError
    {
        if (test == NIL || test == Symbol.EQ.getSymbolFunction())
            this.test = TEST_EQ;
        else if (test == Symbol.EQL.getSymbolFunction())
            this.test = TEST_EQL;
        else if (test == Symbol.EQUAL.getSymbolFunction())
            this.test = TEST_EQUAL;
        else if (test == Symbol.EQUALP.getSymbolFunction())
            this.test = TEST_EQUALP;
        int initialCapacity;
        if (size == NIL)
            initialCapacity = 11; // Default size.
        else
            initialCapacity = (int) Fixnum.getValue(size);
        if (initialCapacity < 0)
            throw new TypeError("MAKE-HASH-TABLE: " + initialCapacity +
                " is not a valid size");
        // Ignore rehashSize and rehashThreshold.
        buckets = new HashEntry[initialCapacity];
        threshold = (int) (initialCapacity * loadFactor);
    }

    // gethash key hash-table &optional default => value, present-p
    public synchronized LispObject gethash(LispObject key,
        LispObject defaultValue) throws LispError
    {
        LispObject[] values = new LispObject[2];
        LispObject value = (LispObject) get(key);
        if (value == null) {
            value = defaultValue;
            values[1] = NIL;
        } else
            values[1] = T;
        values[0] = value;
        setValues(values);
        return value;
    }

    public synchronized LispObject puthash(LispObject key, LispObject newValue)
        throws LispError
    {
        put(key, newValue);
        return newValue;
    }

    // remhash key hash-table => generalized-boolean
    public synchronized LispObject remhash(LispObject key) throws LispError
    {
        // A value in a Lisp hash table can never be null, so...
        return remove(key) != null ? T : NIL;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<");
        switch (test) {
            case TEST_EQ:
                sb.append("EQ");
                break;
            case TEST_EQL:
                sb.append("EQL");
                break;
            case TEST_EQUAL:
                sb.append("EQUAL");
                break;
            case TEST_EQUALP:
                sb.append("EQUALP");
                break;
            default:
                Debug.bug();
        }
        sb.append(" hash table, ");
        sb.append(size);
        if (size == 1)
            sb.append(" entry>");
        else
            sb.append(" entries>");
        return sb.toString();
    }

    public LispObject get(LispObject key) throws LispError
    {
        int idx = hash(key);
        HashEntry e = buckets[idx];
        while (e != null) {
            if (equals(key, e.key))
                return e.value;
            e = e.next;
        }
        return null;
    }

    public LispObject put(LispObject key, LispObject value) throws LispError
    {
        int idx = hash(key);
        HashEntry e = buckets[idx];
        while (e != null) {
            if (equals(key, e.key)) {
                LispObject r = e.value;
                e.value = value;
                return r;
            } else
                e = e.next;
        }
        // Not found. We need to add a new entry.
        if (++size > threshold) {
            rehash();
            // Need a new hash value to suit the bigger table.
            idx = hash(key);
        }
        e = new HashEntry(key, value);
        e.next = buckets[idx];
        buckets[idx] = e;
        return null;
    }

    public LispObject remove(LispObject key) throws LispError
    {
        int idx = hash(key);
        HashEntry e = buckets[idx];
        HashEntry last = null;
        while (e != null) {
            if (equals(key, e.key)) {
                if (last == null)
                    buckets[idx] = e.next;
                else
                    last.next = e.next;
                --size;
                return e.value;
            }
            last = e;
            e = e.next;
        }
        return null;
    }

    final int hash(LispObject key)
    {
        return key == null ? 0 : Math.abs(key.hashCode() % buckets.length);
    }

    private final boolean equals(LispObject o1, LispObject o2) throws LispError
    {
        switch (test) {
            case TEST_EQ:
                return o1 == o2;
            case TEST_EQL:
                return eql(o1, o2);
            case TEST_EQUAL:
                return equal(o1, o2);
            case TEST_EQUALP:
                return equalp(o1, o2);
            default:
                Debug.bug();
                return false;
        }
    }

    private static final int hashCode(LispObject o)
    {
        return o == null ? 0 : o.hashCode();
    }

    private void rehash()
    {
        HashEntry[] oldBuckets = buckets;
        int newCapacity = buckets.length * 2 + 1;
        threshold = (int) (newCapacity * loadFactor);
        buckets = new HashEntry[newCapacity];
        for (int i = oldBuckets.length; i-- > 0;) {
            HashEntry e = oldBuckets[i];
            while (e != null) {
                int idx = hash(e.key);
                HashEntry dest = buckets[idx];
                if (dest != null) {
                    while (dest.next != null)
                        dest = dest.next;
                    dest.next = e;
                } else
                    buckets[idx] = e;
                HashEntry next = e.next;
                e.next = null;
                e = next;
            }
        }
    }

    private static class HashEntry
    {
        LispObject key;
        LispObject value;
        HashEntry next;

        HashEntry(LispObject key, LispObject value)
        {
            this.key = key;
            this.value = value;
        }
    }
}
