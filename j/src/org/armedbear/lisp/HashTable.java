/*
 * HashTable.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: HashTable.java,v 1.27 2003-12-09 20:26:22 asimon Exp $
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
    private int count;

    private HashTable(LispObject test, int size, LispObject rehashSize,
                      LispObject rehashThreshold)
        throws ConditionThrowable
    {
        if (test == NIL || test == Symbol.EQ.getSymbolFunction())
            this.test = TEST_EQ;
        else if (test == Symbol.EQL.getSymbolFunction())
            this.test = TEST_EQL;
        else if (test == Symbol.EQUAL.getSymbolFunction())
            this.test = TEST_EQUAL;
        else if (test == Symbol.EQUALP.getSymbolFunction())
            this.test = TEST_EQUALP;
        else
            throw new ConditionThrowable(new LispError("MAKE-HASH-TABLE:  test " + test));
        // Ignore rehashSize and rehashThreshold.
        buckets = new HashEntry[size];
        threshold = (int) (size * loadFactor);
    }

    private int getCount()
    {
        return count;
    }

    public LispObject typeOf()
    {
        return Symbol.HASH_TABLE;
    }

    public LispClass classOf()
    {
        return BuiltInClass.HASH_TABLE;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.HASH_TABLE)
            return T;
        if (type == BuiltInClass.HASH_TABLE)
            return T;
        return super.typep(type);
    }

    public synchronized void clear()
    {
        for (int i = buckets.length; i-- > 0;)
            buckets[i] = null;
        count = 0;
    }

    // gethash key hash-table &optional default => value, present-p
    public synchronized LispObject gethash(LispObject key,
                                           LispObject defaultValue)
        throws ConditionThrowable
    {
        LispObject value = (LispObject) get(key);
        final LispObject presentp;
        if (value == null) {
            value = defaultValue;
            presentp = NIL;
        } else
            presentp = T;
        return LispThread.currentThread().setValues(value, presentp);
    }

    public synchronized LispObject puthash(LispObject key, LispObject newValue)
        throws ConditionThrowable
    {
        put(key, newValue);
        return newValue;
    }

    // remhash key hash-table => generalized-boolean
    public synchronized LispObject remhash(LispObject key) throws ConditionThrowable
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
        sb.append(count);
        if (count == 1)
            sb.append(" entry>");
        else
            sb.append(" entries>");
        return sb.toString();
    }

    public LispObject get(LispObject key) throws ConditionThrowable
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

    public LispObject put(LispObject key, LispObject value) throws ConditionThrowable
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
        if (++count > threshold) {
            rehash();
            // Need a new hash value to suit the bigger table.
            idx = hash(key);
        }
        e = new HashEntry(key, value);
        e.next = buckets[idx];
        buckets[idx] = e;
        return null;
    }

    public LispObject remove(LispObject key) throws ConditionThrowable
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
                --count;
                return e.value;
            }
            last = e;
            e = e.next;
        }
        return null;
    }

    final int hash(LispObject key)
    {
        return key == null ? 0 : (key.sxhash().getValue() % buckets.length);
    }

    private final boolean equals(LispObject o1, LispObject o2) throws ConditionThrowable
    {
        switch (test) {
            case TEST_EQ:
                return o1 == o2;
            case TEST_EQL:
                return o1.eql(o2);
            case TEST_EQUAL:
                return o1.equal(o2);
            case TEST_EQUALP:
                return o1.equalp(o2);
            default:
                Debug.bug();
                return false;
        }
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

    // Returns a list of (key . value) pairs.
    private LispObject ENTRIES()
    {
        LispObject list = NIL;
        for (int i = buckets.length; i-- > 0;) {
            HashEntry e = buckets[i];
            while (e != null) {
                list = new Cons(new Cons(e.key, e.value), list);
                e = e.next;
            }
        }
        return list;
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

    // ### %make-hash-table
    private static final Primitive _MAKE_HASH_TABLE =
        new Primitive("%make-hash-table", PACKAGE_SYS, false) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 4)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            LispObject test = args[0];
            int size = Fixnum.getValue(args[1]);
            LispObject rehashSize = args[2];
            LispObject rehashThreshold = args[3];
            return new HashTable(test, size, rehashSize, rehashThreshold);
        }
    };

    // ### gethash
    // gethash key hash-table &optional default => value, present-p
    private static final Primitive GETHASH = new Primitive("gethash","key hash-table &optional default") {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length < 2 || length > 3)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            if (args[1] instanceof HashTable) {
                LispObject key = args[0];
                HashTable ht = (HashTable) args[1];
                LispObject defaultValue =
                    length == 3 ? args[2] : NIL;
                return ht.gethash(key, defaultValue);
            }
            throw new ConditionThrowable(new TypeError(args[1], "hash-table"));
        }
    };

    // ### puthash
    // puthash key hash-table default &optional (value default) => value
    private static final Primitive PUTHASH =
        new Primitive("puthash", PACKAGE_SYS, false) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length < 3 || length > 4)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            if (args[1] instanceof HashTable) {
                LispObject key = args[0];
                HashTable ht = (HashTable) args[1];
                LispObject value;
                if (length == 3)
                    value = args[2];
                else {
                    Debug.assertTrue(length == 4);
                    value = args[3];
                }
                return ht.puthash(key, value);
            }
            throw new ConditionThrowable(new TypeError(args[1], "hash-table"));
        }
    };

    // remhash key hash-table => generalized-boolean
    private static final Primitive2 REMHASH = new Primitive2("remhash","key hash-table") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second instanceof HashTable) {
                LispObject key = first;
                HashTable ht = (HashTable) second;
                return ht.remhash(key);
            }
            throw new ConditionThrowable(new TypeError(second, "hash-table"));
        }
    };

    // ### clrhash
    // clrhash hash-table => hash-table
    private static final Primitive1 CLRHASH = new Primitive1("clrhash","hash-table") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof HashTable) {
                ((HashTable)arg).clear();
                return arg;
            }
            throw new ConditionThrowable(new TypeError(arg, "hash-table"));
        }
    };

    // ### hash-table-count
    private static final Primitive1 HASH_TABLE_COUNT =
        new Primitive1("hash-table-count","hash-table") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof HashTable)
                return new Fixnum(((HashTable)arg).getCount());
            throw new ConditionThrowable(new TypeError(arg, "hash-table"));
        }
    };

    // ### sxhash
    // sxhash object => hash-code
    private static final Primitive1 SXHASH = new Primitive1("sxhash","object")
    {
        public LispObject execute(LispObject arg)
        {
            return arg.sxhash();
        }
    };

    // ### hash-table-p
    private static final Primitive1 HASH_TABLE_P =
        new Primitive1("hash-table-p","object") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof HashTable ? T : NIL;
        }
    };

    // ### hash-table-entries
    private static final Primitive1 HASH_TABLE_ENTRIES =
        new Primitive1("hash-table-entries", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof HashTable)
                return ((HashTable)arg).ENTRIES();
            throw new ConditionThrowable(new TypeError(arg, "hash-table"));
        }
    };
}
