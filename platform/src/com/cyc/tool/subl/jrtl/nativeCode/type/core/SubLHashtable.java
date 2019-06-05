//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.LispHashTable;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLHashtable extends FromSubLisp implements SubLObject, LispHashTable {

    public interface SubLHashtableKeyEntry extends SubLObject {
        void clear();

        SubLObject getKey();

        void init(SubLObject p0);

        void init(SubLObject p0, BinaryFunction p1);
    }

    public abstract static class SomeSubLHashtableKeyEntryImpl extends UnsupportedObjectImpl implements SubLHashtableKeyEntry {

        @Override
        public SubLObject getKey() {
            return key;
        }

        protected SubLObject key;

        @Override
        abstract public boolean equals(Object obj);

        @Override
        public boolean canFastHash() {
            return key.canFastHash();
        }

        @Override
        public void clear() {
            key = null;
        }

        @Override
        public int hashCode(int currentDepth) {
            return key.hashCode(currentDepth);
        }

        @Override
        public void init(SubLObject key) {
            this.key = key;
        }

        @Override
        public void init(SubLObject key, BinaryFunction test) {
            Errors.error("Ugh.");
        }

    }

    public static class SubLEqHashtableKeyEntryImpl extends SomeSubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

        @Override
        public boolean equals(Object obj) {
            return key == obj;
        }

    }

    public static class SubLEqlHashtableKeyEntryImpl extends SomeSubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

        @Override
        public boolean equals(Object obj) {
            return key.eql((SubLObject) obj);
        }

    }

    public static class SubLEqualHashtableKeyEntryImpl extends SomeSubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

        @Override
        public boolean equals(Object obj) {
            return key.equal((SubLObject) obj);
        }

    }

    public static class SubLEqualpHashtableKeyEntryImpl extends SomeSubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

        @Override
        public boolean equals(Object obj) {
            return key.equalp((SubLObject) obj);
        }

    }

    public static class SubLHashtableKeyEntryImpl extends SomeSubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
        private BinaryFunction test;

        @Override
        public boolean equals(Object obj) {
            boolean result = SubLNil.NIL != test.processItem(key, (SubLObject) obj);
            return result;
        }

        @Override
        public void init(SubLObject key) {
            Errors.error("Ugh.");
        }

        @Override
        public void init(SubLObject key, BinaryFunction test) {
            this.key = key;
            this.test = test;
        }

    }

    interface SubLKeyEntryFactory {
        SubLHashtableKeyEntry makeKeyEntry();
    }

    protected SubLHashtable() {
        this(128, BinaryFunction.EQL_TEST);
    }

    SubLHashtable(int size) {
        this(size, BinaryFunction.EQL_TEST);
    }

    SubLHashtable(int size, BinaryFunction test) {
        //super((HashTable.HTComparator)null,size,null,NIL);
        hashWas = ConcurrentSubLHashtableFactory.factory.createMap((int) (size * 1.5) + 1);
        this.test = test;
        if (test == BinaryFunction.EQ_TEST)
            keyFactory = SubLHashtable.EQ_KEY_FACTORY;
        else if (test == BinaryFunction.EQL_TEST)
            keyFactory = SubLHashtable.EQL_KEY_FACTORY;
        else if (test == BinaryFunction.EQUAL_TEST)
            keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
        else if (test == BinaryFunction.EQUALP_TEST)
            keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
        else {
            if (!test.getFunction().isSubLispBased()) {
                keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
            } else {
                Errors.error("Got non-equality test for hashtable: " + test);
                keyFactory = null;
            }
        }
    }

    private Map<SubLObject, SubLObject> hashMe() {
        return (Map<SubLObject, SubLObject>) hashWas;
    }

    private BinaryFunction test;
    //private Map<SubLObject, SubLObject>
    private final Map<SubLObject, SubLObject> hashWas; // = (SubLHashtable) (Map<SubLObject, SubLObject>) (Object) this;
    private SubLKeyEntryFactory keyFactory;

    public static String HASHTABLE_TYPE_NAME = "HASHTABLE";

    static final SubLKeyEntryFactory EQ_KEY_FACTORY = new SubLKeyEntryFactory() {
        @Override
        public SubLHashtableKeyEntry makeKeyEntry() {
            return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
        }
    };
    static final SubLKeyEntryFactory EQL_KEY_FACTORY = new SubLKeyEntryFactory() {
        @Override
        public SubLHashtableKeyEntry makeKeyEntry() {
            return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
        }
    };
    static final SubLKeyEntryFactory EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {
        @Override
        public SubLHashtableKeyEntry makeKeyEntry() {
            return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
        }
    };
    static final SubLKeyEntryFactory EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {
        @Override
        public SubLHashtableKeyEntry makeKeyEntry() {
            return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
        }
    };

    public void clear() {
        Map<SubLObject, SubLObject> hash = hashMe();
        hash.clear();
    }

    public boolean containsKey(Object obj) {
        SubLHashtableKeyEntryImpl key = null;
        try {
            key = Resourcer.getInstance().acquireHashtableKeyEntry();
            key.init((SubLObject) obj, test);
            Map<SubLObject, SubLObject> hash = hashMe();
            boolean result = hash.containsKey(key);
            return result;
        } finally {
            Resourcer.getInstance().releaseHashtableKeyEntry(key);
        }
    }

    public boolean containsValue(Object obj) {
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.containsValue(obj);
    }

    public Set<Entry<SubLObject, SubLObject>> entrySet() {
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.entrySet();
    }

    @Override
    public SubLObject get(SubLObject obj) {
        if (test == BinaryFunction.EQ_TEST) {
            SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
            key.init(obj);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.get(key);
        }
        if (obj.canFastHash()) {
            SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
            key.init(obj);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.get(key);
        }
        SubLHashtableKeyEntryImpl key2 = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
            key2 = resourcer.acquireHashtableKeyEntry();
            key2.init(obj, test);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.get(key2);
        } finally {
            resourcer.releaseHashtableKeyEntry(key2);
        }
    }

    public int getCurrentCapacity() {
        Map<SubLObject, SubLObject> hash = hashMe();
        return (int) (hash.size() * 1.3) + 1;
    }

    public boolean isEmpty() {
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.isEmpty();
    }

    public Set keySet() {
        Errors.unimplementedMethod("SubLHashtable.keySet()");
        return null;
    }

    public Iterator<Map.Entry<SubLObject, SubLObject>> getEntrySetIterator() {
        return entrySet().iterator();
    }

    @Override
    public SubLObject put(SubLObject key, SubLObject value) {
        if (test == BinaryFunction.EQUALP_TEST) {
            boolean knownKey = containsKey(key);
            if (knownKey)
                remove(key);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.put(key, value);
        }
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.put(key, value);
    }

    @Override
    public int size() {
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.size();
    }

    public Collection values() {
        Map<SubLObject, SubLObject> hash = hashMe();
        return hash.values();
    }

    @Override
    public SubLObject remove(SubLObject obj) {
        if (test == BinaryFunction.EQ_TEST) {
            SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
            key.init(obj);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.remove(key);
        }
        if (obj.canFastHash()) {
            SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
            key.init(obj);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.remove(key);
        }
        SubLHashtableKeyEntryImpl key2 = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
            key2 = resourcer.acquireHashtableKeyEntry();
            key2.init(obj, test);
            Map<SubLObject, SubLObject> hash = hashMe();
            return hash.remove(key2);
        } finally {
            resourcer.releaseHashtableKeyEntry(key2);
        }
    }

    public void putAll(Map map) {

        Errors.unimplementedMethod("SubLHashtable.putAll()");
    }

    @Override
    public boolean canFastHash() {
        return false;
    }

    public BinaryFunction getTest() {
        return test;
    }

    @Override
    public SubLSymbol getType() {
        return Types.$dtp_hash_table$;
    }

    @Override
    public SubLFixnum getTypeCode() {
        return CommonSymbols.NINE_INTEGER;
    }

    @Override
    public int hashCode(int currentDepth) {
        if (currentDepth < 8)
            return 0;
        return 0;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public boolean isHashtable() {
        return true;
    }

    @Override
    public boolean isHashtableIterator() {
        return false;
    }

    @Override
    public boolean isKeyhash() {
        return false;
    }

    @Override
    public boolean isKeyhashIterator() {
        return false;
    }

    @Override
    public SubLHashtable toHashtable() {
        return this;
    }

    @Override
    public SubLHashtable toLispObject() {
        return this;
    }

    @Override
    public String printObject() {
        return "#<HASH-TABLE " + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + this.size() + " entries @ " + super.toString() + ">";
    }

    public String toStringComplete() {
        return toString();
    }

    @Override
    public String toTypeName() {
        return "HASHTABLE";
    }

    @Override
    public Symbol getTestSymbol() {
        return getTest().getFunction().getFunctionSymbol().toLispObject();
    }

    @Override
    public int getSize() {
        return getCurrentCapacity();
    }

    @Override
    public int getCount() {
        return size();
    }

    @Override
    public LispObject gethash(LispObject key) {
        return (LispObject) Hashtables.gethash(key, this);
    }

    @Override
    public LispObject gethash(LispObject key, LispObject defaultValue) {
        return (LispObject) Hashtables.gethash(key, this, defaultValue);
    }

    @Override
    public LispObject puthash(LispObject key, LispObject newValue) {
        return (LispObject) Hashtables.sethash(key, this, newValue);
    }

    @Override
    public LispObject remhash(LispObject key) {
        return (LispObject) Hashtables.remhash(key, this);
    }

    @Override
    public LispObject get(LispObject key) {
        return (LispObject) this.get((SubLObject) key);
    }

    public LispObject gethash1(LispObject key) {
        final LispObject value = get(key);
        return value != null ? value : NIL;
    }

    @Override
    public void put(LispObject key, LispObject value) {
        this.put((SubLObject) key, (SubLObject) value);
    }

    @Override
    public LispObject remove(LispObject key) {
        return (LispObject) this.remove((SubLObject) key);
    }

    @Override
    public LispObject getWeakness() {
        return CommonSymbols.NIL.toLispObject();
    }

    /* (non-Javadoc)
     * @see org.armedbear.lisp.LispHashTable#ENTRIES()
     */
    @Override
    public LispObject ENTRIES() {
        return getEntries();
    }

    // Returns a list of (key . value) pairs.
    @Override
    public LispObject getEntries() {
        // No need to take out a read lock, for the same reason as MAPHASH
        Iterator it = getEntrySetIterator();
        LispObject list = NIL;
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();) {
            Entry e = (Entry) iterator.next();
            while (e != null) {
                list = new Cons(new Cons((SubLObject) e.getKey(), (SubLObject) e.getValue()), list);
            }
        }
        return list;
    }

    @Override
    public LispObject MAPHASH(LispObject function) {
        // Don't take out a read lock: it can't be upgraded to a write
        // lock, which would block the scenario where put() is called to
        // set the value of the current entry
        Iterator it = getEntrySetIterator();
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();) {
            Entry e = (Entry) iterator.next();
            while (e != null) {
                function.execute((LispObject) e.getKey(), (LispObject) e.getValue());
            }
        }
        return NIL;
    }

    public LispObject getRehashThreshold() {
        Map<SubLObject, SubLObject> hash = hashMe();
        if (true)
            throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }

    @Override
    public LispObject getRehashSize() {

        Map<SubLObject, SubLObject> hash = hashMe();
        if (true)
            throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }

}
