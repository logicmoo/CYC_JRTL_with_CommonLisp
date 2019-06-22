/*
 * HashTable.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * Copyright (C) 2010 Erik Huelsmann
 * $Id$
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
package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*; 

import java.util.concurrent.locks.ReentrantLock;

public class HashTable
    extends SLispObject
    implements org.armedbear.lisp.protocol.Hashtable, LispHashTable
{

	@Override
	public LispObject getWeakness()
	{
		return NIL;
	}

	protected static final float loadFactor = 0.75f;
    protected final LispObject rehashSize;
    protected final LispObject rehashThreshold;
    // The rounded product of the capacity and the load factor. When the number
    // of elements exceeds the threshold, the implementation calls rehash().
    protected int threshold;
    // Array containing the actual key-value mappings.
    @SuppressWarnings("VolatileArrayField")
    protected volatile HashEntry[] buckets;
    // The number of key-value pairs.
    protected volatile int count;
    final HTComparator comparator;
    final private ReentrantLock lock = new ReentrantLock();

    protected HashTable(HTComparator c, int size, LispObject rehashSize,
            LispObject rehashThreshold) {
        this.rehashSize = rehashSize;
        this.rehashThreshold = rehashThreshold;
        buckets = new HashEntry[size];
        threshold = (int) (size * loadFactor);
        comparator = c;
    }



	protected static int calculateInitialCapacity(int size) {
        int capacity = 1;
        while (capacity < size) {
            capacity <<= 1;
        }
        return capacity;
    }
    public static HashTable newEqHashTable(int size, LispObject rehashSize,
            LispObject rehashThreshold) {
        return new HashTable(new EqComparator(), size, rehashSize, rehashThreshold);
    }

    public static HashTable newEqlHashTable(int size, LispObject rehashSize,
            LispObject rehashThreshold) {
        return new HashTable(new EqlComparator(), size, rehashSize, rehashThreshold);
    }

    public static HashTable newEqualHashTable(int size, LispObject rehashSize,
            LispObject rehashThreshold) {
        return new HashTable(new EqualComparator(), size, rehashSize, rehashThreshold);
    }

    public static LispObject newEqualpHashTable(int size, LispObject rehashSize,
            LispObject rehashThreshold) {
        return new HashTable(new EqualpComparator(), size, rehashSize, rehashThreshold);
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getRehashSize()
	 */
    @Override
	public final LispObject getRehashSize() {
        return rehashSize;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getRehashThreshold()
	 */
    @Override
	public final LispObject getRehashThreshold() {
        return rehashThreshold;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getSize()
	 */
    @Override
	public int getSize() {
        return buckets.length;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getCount()
	 */
    @Override
	public int getCount() {
        return count;
    }

    @Override
	public LispObject typeOf() {
        return Symbol.HASH_TABLE;
    }

    @Override
	public LispObject classOf() {
        return BuiltInClass.HASH_TABLE;
    }

    @Override
	public LispObject typep(LispObject type) {
        if (type == Symbol.HASH_TABLE) {
            return T;
        }
        if (type == BuiltInClass.HASH_TABLE) {
            return T;
        }
        return super.typep(type);
    }

    @Override
	public boolean equalp(LispObject obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HashTable) {
        	HashTable ht = (HashTable) obj;
            if (count != ht.count) {
                return false;
            }
            if (getTestSymbol() != ht.getTestSymbol()) {
                return false;
            }
            LispObject entries = ENTRIES();
            while (entries != NIL) {
                LispObject entry = entries.car();
                LispObject key = entry.car();
                LispObject value = entry.cdr();
                if (!value.equalp(ht.get(key))) {
                    return false;
                }
                entries = entries.cdr();
            }
            return true;
        }
        return false;
    }

    @Override
	public LispObject getParts() {
        // No need to take out a read lock, for the same reason as MAPHASH
        HashEntry[] b = buckets;
        LispObject parts = NIL;
        for (int i = 0; i < b.length; i++) {
            HashEntry e = b[i];
            while (e != null) {
                parts = parts.push(new Cons("KEY [bucket " + i + "]", e.key));
                parts = parts.push(new Cons("VALUE", e.value));
                e = e.next;
            }
        }
        return parts.nreverse();
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#clear()
	 */
    @Override
	public void clear() {
        lock.lock();
        try {
            buckets = new HashEntry[buckets.length];
            count = 0;
        } finally {
            lock.unlock();
        }
    }

    // gethash key hash-table &optional default => value, present-p
    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#gethash(org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject gethash(LispObject key) {
        LispObject value = get(key);
        final LispObject presentp;
        if (value == null) {
            value = presentp = NIL;
        } else {
            presentp = T;
        }
        return LispThread.currentThread().setValues(value, presentp);
    }

    // gethash key hash-table &optional default => value, present-p
    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#gethash(org.armedbear.lisp.LispObject, org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject gethash(LispObject key, LispObject defaultValue) {
        LispObject value = get(key);
        final LispObject presentp;
        if (value == null) {
            value = defaultValue;
            presentp = NIL;
        } else {
            presentp = T;
        }
        return LispThread.currentThread().setValues(value, presentp);
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#gethash1(org.armedbear.lisp.LispObject)
	 */
  //  @Override
	public LispObject gethash1(LispObject key) {
        final LispObject value = get(key);
        return value != null ? value : NIL;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#puthash(org.armedbear.lisp.LispObject, org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject puthash(LispObject key, LispObject newValue) {
        put(key, newValue);
        return newValue;
    }

    // remhash key hash-table => generalized-boolean
    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#remhash(org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject remhash(LispObject key) {
        // A value in a Lisp hash table can never be null, so...
        return remove(key) != null ? T : NIL;
    }
    

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public LispObject getCopyForm() {
        StringBuilder sb = new StringBuilder(getTestSymbol().princToString());
        sb.append(' ');
        sb.append(Symbol.HASH_TABLE.princToString());
        sb.append(' ');
        sb.append(count);
        if (count == 1) {
            sb.append(" entry");
        } else {
            sb.append(" entries");
        }
        sb.append(", ");
        sb.append(buckets.length);
        sb.append(" buckets");
		LispObject s = list(Symbol.MAKE_HASH_TABLE, Keyword.TEST, getTestSymbol(), //
				internKeyword("SIZE"), LispInteger.makeInteger(buckets.length), //
				internKeyword("REHASH-THRESHOLD"), rehashThreshold, //
				internKeyword("REHASH-SIZE"), rehashSize, //
				internKeyword("ENTRIES"), (LispObject) quote(ENTRIES()));		
		return list(Symbol.PROGN, makeStringOrJNull(sb.toString()), s);
	}
    
    @Override
    public String printObjectImpl() {
    	if(isPrintReadable(null))  {
    		return printReadableObject(false);
    	}
        checkUnreadableOk();
        StringBuilder sb = new StringBuilder(getTestSymbol().princToString());
        sb.append(' ');
        sb.append(Symbol.HASH_TABLE.princToString());
        sb.append(' ');
        sb.append(count);
        if (count == 1) {
            sb.append(" entry");
        } else {
            sb.append(" entries");
        }
        sb.append(", ");
        sb.append(buckets.length);
        sb.append(" buckets");
        return unreadableString(sb.toString());
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getTestSymbol()
	 */
    @Override
	public Symbol getTestSymbol() {
        return comparator.getTestSymbol();
    }

    protected HashEntry getEntry(LispObject key) {
        HashEntry[] b = buckets;
        int hash = comparator.hash(key);
        HashEntry e = b[hash & (b.length - 1)];
        while (e != null) {
            if (hash == e.hash &&
                    (key == e.key || comparator.keysEqual(key, e.key))) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#get(org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject get(LispObject key) {
        HashEntry e = getEntry(key);
        LispObject v = (e == null) ? null : e.value;

        if (e == null || v != null) {
            return v;
        }

        lock.lock();
        try {
            return e.value;
        } finally {
            lock.unlock();
        }
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#put(org.armedbear.lisp.LispObject, org.armedbear.lisp.LispObject)
	 */
    @Override
	public void put(LispObject key, LispObject value) {
        lock.lock();
        try {
            HashEntry e = getEntry(key);
            if (e != null) {
                e.value = value;
            } else {
                // Not found. We need to add a new entry.
                if (++count > threshold) {
                    rehash();
                }

                int hash = comparator.hash(key);
                int index = hash & (buckets.length - 1);
                buckets[index] = new HashEntry(key, hash, value, buckets[index]);
            }
        } finally {
            lock.unlock();
        }
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#remove(org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject remove(LispObject key) {
        lock.lock();
        try {
            int index = comparator.hash(key) & (buckets.length - 1);

            HashEntry e = buckets[index];
            HashEntry last = null;
            while (e != null) {
                if (comparator.keysEqual(key, e.key)) {
                    if (last == null) {
                        buckets[index] = e.next;
                    } else {
                        last.next = e.next;
                    }
                    --count;
                    return e.value;
                }
                last = e;
                e = e.next;
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    protected void rehash() {
        lock.lock();
        try {
            final int newCapacity = buckets.length * 2;
            threshold = (int) (newCapacity * loadFactor);
            int mask = newCapacity - 1;
            HashEntry[] newBuckets = new HashEntry[newCapacity];

            for (int i = buckets.length; i-- > 0;) {
                HashEntry e = buckets[i];
                while (e != null) {
                    final int index = comparator.hash(e.key) & mask;
                    newBuckets[index] = new HashEntry(e.key, e.hash, e.value,
                            newBuckets[index]);
                    e = e.next;
                }
            }
            buckets = newBuckets;
        } finally {
            lock.unlock();
        }
    }


    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#ENTRIES()
	 */
    @Override
	public LispObject ENTRIES() {
        return getEntries();
    }

    // Returns a list of (key . value) pairs.
    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#getEntries()
	 */
    @Override
	public LispObject getEntries() {
        // No need to take out a read lock, for the same reason as MAPHASH
        HashEntry[] b = buckets;
        LispObject list = NIL;
        for (int i = b.length; i-- > 0;) {
            HashEntry e = b[i];
            while (e != null) {
                list = new Cons(new Cons(e.key, e.value), list);
                e = e.next;
            }
        }
        return list;
    }

    /* (non-Javadoc)
	 * @see org.armedbear.lisp.LispHashTable#MAPHASH(org.armedbear.lisp.LispObject)
	 */
    @Override
	public LispObject MAPHASH(LispObject function) {
        // Don't take out a read lock: it can't be upgraded to a write
        // lock, which would block the scenario where put() is called to
        // set the value of the current entry

        HashEntry[] b = buckets;
        for (int i = b.length; i-- > 0;) {
            HashEntry e = b[i];
            while (e != null) {
                function.execute(e.key, e.value);
                e = e.next;
            }
        }
        return NIL;
    }
    
    protected interface HTComparator
    {
        Symbol getTestSymbol();

        boolean keysEqual(LispObject key1, LispObject key2);

        int hash(LispObject key);
    }
    
    public static class EqComparator implements HTComparator {

        @Override
        public Symbol getTestSymbol() {
            return Symbol.EQ;
        }

        @Override
        public boolean keysEqual(LispObject key1, LispObject key2) {
            return key1 == key2;
        }

        @Override
        public int hash(LispObject key) {
            return key.sxhash();
        }
    }

    public static class EqlComparator implements HTComparator {

        @Override
        public Symbol getTestSymbol() {
            return Symbol.EQL;
        }

        @Override
        public boolean keysEqual(LispObject key1, LispObject key2) {
            return key1.eql(key2);
        }

        @Override
        public int hash(LispObject key) {
            return key.sxhash();
        }

    }
    

    public static class EqualComparator implements HTComparator {

        @Override
        public Symbol getTestSymbol() {
            return Symbol.EQUAL;
        }

        @Override
        public boolean keysEqual(LispObject key1, LispObject key2) {
            return key1.equal(key2);
        }
        
        @Override
        public int hash(LispObject key) {
            return key.sxhash();
        }
    }

    public static class EqualpComparator implements HTComparator {

        @Override
        public Symbol getTestSymbol() {
            return Symbol.EQUALP;
        }

        @Override
        public boolean keysEqual(LispObject key1, LispObject key2) {
            return key1.equalp(key2);
        }

        @Override
        public int hash(LispObject key) {
            return key.psxhash();
        }
    }

    protected static class HashEntry {

        LispObject key;
        int hash;
        volatile LispObject value;
        HashEntry next;

        HashEntry(LispObject key, int hash, LispObject value, HashEntry next) {
            this.key = key;
            this.hash = hash;
            this.value = value;
            this.next = next;
        }
    }

    // For EQUALP hash tables.
    @Override
	public int psxhash() {
        long result = 2062775257; // Chosen at random.
        result = mix(result, count);
        result = mix(result, getTestSymbol().sxhash());
        return (int) (result & 0x7fffffff);
    }



	@Override
	public HashTable toLispObject()
	{
		return this;
	}
}
