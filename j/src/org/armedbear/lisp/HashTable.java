/*
 * HashTable.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: HashTable.java,v 1.46 2004-11-23 17:39:42 piso Exp $
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

public abstract class HashTable extends LispObject
{
    protected final LispObject rehashSize;
    protected final LispObject rehashThreshold;

    // The rounded product of the capacity and the load factor. When the number
    // of elements exceeds the threshold, the implementation calls rehash().
    protected int threshold;

    private static final float loadFactor = 0.75f;

    // Array containing the actual key-value mappings.
    protected HashEntry[] buckets;

    // The number of key-value pairs.
    protected int count;

    protected HashTable(int size, LispObject rehashSize,
                        LispObject rehashThreshold)
    {
        this.rehashSize = rehashSize;
        this.rehashThreshold = rehashThreshold;
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

    public LispObject classOf()
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

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof HashTable) {
            HashTable ht = (HashTable) obj;
            if (count != ht.count)
                return false;
            if (getTest() != ht.getTest())
                return false;
            LispObject entries = ENTRIES();
            while (entries != NIL) {
                LispObject entry = entries.car();
                LispObject key = entry.car();
                LispObject value = entry.cdr();
                if (!value.equalp(ht.get(key)))
                    return false;
                entries = entries.cdr();
            }
            return true;
        }
        return false;
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject parts = NIL;
        for (int i = 0; i < buckets.length; i++) {
            HashEntry e = buckets[i];
            while (e != null) {
                parts = parts.push(new Cons("KEY [bucket " + i + "]", e.key));
                parts = parts.push(new Cons("VALUE", e.value));
                e = e.next;
            }
        }
        return parts.nreverse();
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
    public synchronized LispObject remhash(LispObject key)
        throws ConditionThrowable
    {
        // A value in a Lisp hash table can never be null, so...
        return remove(key) != null ? T : NIL;
    }

    public String writeToString() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer(getTest().writeToString());
        sb.append(" hash table, ");
        sb.append(count);
        if (count == 1)
            sb.append(" entry");
        else
            sb.append(" entries");
        sb.append(", ");
        sb.append(buckets.length);
        sb.append(" buckets");
        return unreadableString(sb.toString());
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

    public void put(LispObject key, LispObject value) throws ConditionThrowable
    {
        int idx = hash(key);
        HashEntry e = buckets[idx];
        while (e != null) {
            if (equals(key, e.key)) {
                e.value = value;
                return;
            }
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

    protected int hash(LispObject key) throws ConditionThrowable
    {
        return (key.sxhash() % buckets.length);
    }

    protected abstract boolean equals(LispObject o1, LispObject o2)
        throws ConditionThrowable;

    protected void rehash() throws ConditionThrowable
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

    protected static class HashEntry
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

    private static final LispObject FUNCTION_EQ =
        Symbol.EQ.getSymbolFunction();
    private static final LispObject FUNCTION_EQL =
        Symbol.EQL.getSymbolFunction();
    private static final LispObject FUNCTION_EQUAL =
        Symbol.EQUAL.getSymbolFunction();
    private static final LispObject FUNCTION_EQUALP =
        Symbol.EQUALP.getSymbolFunction();

    // For EQUALP hash tables.
    public int psxhash() throws ConditionThrowable
    {
        long result = 2062775257; // Chosen at random.
        result = mix(result, count);
        result = mix(result, getTest().sxhash());
        return (int) (result & 0x7fffffff);
    }

    // ### %make-hash-table
    private static final Primitive _MAKE_HASH_TABLE =
        new Primitive("%make-hash-table", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject test, LispObject size,
                                  LispObject rehashSize, LispObject rehashThreshold)
            throws ConditionThrowable
        {
            int n;
            try {
                n = ((Fixnum)size).value;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(size, Symbol.FIXNUM));
            }
            if (test == FUNCTION_EQL || test == NIL)
                return new EqlHashTable(n, rehashSize, rehashThreshold);
            if (test == FUNCTION_EQ)
                return new EqHashTable(n, rehashSize, rehashThreshold);
            if (test == FUNCTION_EQUAL)
                return new EqualHashTable(n, rehashSize, rehashThreshold);
            if (test == FUNCTION_EQUALP)
                return new EqualpHashTable(n, rehashSize, rehashThreshold);
            return signal(new LispError("Unknown test for MAKE-HASH-TABLE: " +
                                        test.writeToString()));
        }
    };

    // ### gethash
    // gethash key hash-table &optional default => value, present-p
    private static final Primitive GETHASH =
        new Primitive("gethash","key hash-table &optional default")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                return ((HashTable)second).gethash(first, NIL);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(second, Symbol.HASH_TABLE));
            }
        }
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            try {
                return ((HashTable)second).gethash(first, third);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(second, Symbol.HASH_TABLE));
            }
        }
    };

    // ### puthash
    // puthash key hash-table default &optional (value default) => value
    private static final Primitive PUTHASH =
        new Primitive("puthash", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length < 3 || length > 4)
                return signal(new WrongNumberOfArgumentsException(this));
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
            return signal(new TypeError(args[1], "hash-table"));
        }
    };

    // remhash key hash-table => generalized-boolean
    private static final Primitive REMHASH =
        new Primitive("remhash", "key hash-table")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second instanceof HashTable) {
                LispObject key = first;
                HashTable ht = (HashTable) second;
                return ht.remhash(key);
            }
            return signal(new TypeError(second, "hash-table"));
        }
    };

    // ### clrhash
    // clrhash hash-table => hash-table
    private static final Primitive CLRHASH =
        new Primitive("clrhash", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof HashTable) {
                ((HashTable)arg).clear();
                return arg;
            }
            return signal(new TypeError(arg, "hash-table"));
        }
    };

    // ### hash-table-count
    private static final Primitive HASH_TABLE_COUNT =
        new Primitive("hash-table-count", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof HashTable)
                return new Fixnum(((HashTable)arg).getCount());
            return signal(new TypeError(arg, "hash-table"));
        }
    };

    // ### sxhash
    // sxhash object => hash-code
    private static final Primitive SXHASH = new Primitive("sxhash", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new Fixnum(arg.sxhash());
        }
    };

    // ### psxhash
    // psxhash object => hash-code
    // For EQUALP hash tables.
    private static final Primitive PSXHASH =
        new Primitive("psxhash", PACKAGE_SYS, false, "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new Fixnum(arg.psxhash());
        }
    };

    private static final Primitive MIX =
        new Primitive("mix", PACKAGE_SYS, false, "x y")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return number(mix(Fixnum.getValue(first), Fixnum.getValue(second)));
        }
    };

    // ### hash-table-p
    private static final Primitive HASH_TABLE_P =
        new Primitive("hash-table-p","object") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof HashTable ? T : NIL;
        }
    };

    // ### hash-table-entries
    private static final Primitive HASH_TABLE_ENTRIES =
        new Primitive("hash-table-entries", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((HashTable)arg).ENTRIES();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.HASH_TABLE));
            }
        }
    };
    
    public abstract Symbol getTest();

    private static final Primitive HASH_TABLE_TEST =
        new Primitive("hash-table-test", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((HashTable)arg).getTest();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.HASH_TABLE));
            }
        }
    };

    private static final Primitive HASH_TABLE_SIZE =
        new Primitive("hash-table-size", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new Fixnum(((HashTable)arg).buckets.length);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.HASH_TABLE));
            }
        }
    };

    private static final Primitive HASH_TABLE_REHASH_SIZE =
        new Primitive("hash-table-rehash-size", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((HashTable)arg).rehashSize;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.HASH_TABLE));
            }
        }
    };

    private static final Primitive HASH_TABLE_REHASH_THRESHOLD =
        new Primitive("hash-table-rehash-threshold", "hash-table")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((HashTable)arg).rehashThreshold;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.HASH_TABLE));
            }
        }
    };
}
