/***
	 *   Copyright (c) 1995-2009 Cycorp Inc.
	 *
	 *   Licensed under the Apache License, Version 2.0 (the "License");
	 *   you may not use this file except in compliance with the License.
	 *   You may obtain a copy of the License at
	 *
	 *   http://www.apache.org/licenses/LICENSE-2.0
	 *
	 *   Unless required by applicable law or agreed to in writing, software
	 *   distributed under the License is distributed on an "AS IS" BASIS,
	 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 *   See the License for the specific language governing permissions and
	 *   limitations under the License.
	 *
	 *  Substantial portions of this code were developed by the Cyc project
	 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
	*/

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.armedbear.j.Debug;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLHashtable extends FromSubLisp implements SubLObject, LispHashTable {

  //// Constructors

  /** Creates a new instance of SubLHashtable. */
  SubLHashtable() {
    this(128, BinaryFunction.EQL_TEST);
  }

  /** Creates a new instance of SubLHashtable. */
  SubLHashtable(int size) {
    this(size, BinaryFunction.EQL_TEST);
  }

  /** Creates a new instance of SubLHashtable. */
  SubLHashtable(int size, BinaryFunction test) {
    hash = new HashMap<SubLHashtableKeyEntry, SubLObject>((int) (size * 1.5) + 1);
    this.test = test;
    if (test == BinaryFunction.EQ_TEST) {
      keyFactory = EQ_KEY_FACTORY;
    } else if (test == BinaryFunction.EQL_TEST) {
      keyFactory = EQL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUAL_TEST) {
      keyFactory = EQUAL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUALP_TEST) {
      keyFactory = EQUALP_KEY_FACTORY;
    } else {
      Errors.error("Got non-equality test for hashtable: " + test);
      keyFactory = null;
    }
  }

  //// Public Area

  @Override
public final SubLSymbol getType() {
    return Types.$dtp_hash_table$;
  }

  @Override
public final SubLFixnum getTypeCode() {
    return CommonSymbols.NINE_INTEGER;
  }

  @Override
public final boolean canFastHash() {
    return false;
  }

  public static final String HASHTABLE_TYPE_NAME = "HASHTABLE";

  // extremely slow on _some_ hashmaps
  public boolean check4Bugs = false;

  @Override
public String toTypeName() {
    return HASHTABLE_TYPE_NAME;
  }

  @Override
public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return 0; // @hack
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }

  @Override
public String toString() {
    return "#<HASH-TABLE " + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + size() + " entries @ " + super.toString() + ">";
  }
  //
  //	public String toStringComplete() {
  //		return toString();
  //	}

  public BinaryFunction getTest() {
    return test;
  }

  @Override
public void clear() {
    hash.clear();
  }

  public boolean containsKey(Object hkey) {
    SubLHashtableKeyEntry key = null;
    try {
      key = Resourcer.getInstance().acquireHashtableKeyEntry();
      key.init((SubLObject) hkey, test);
      boolean result = hash.containsKey(key);
      if (test == BinaryFunction.EQ_TEST)
        return result;
      if (test == BinaryFunction.EQL_TEST)
        return result;
      if (!check4Bugs)
        return result;
      if (!result) {
        for (Iterator iterator = getKeyEntrySetIterator(); iterator.hasNext();) {
          Entry<SubLHashtableKeyEntry, SubLObject> entry = (Entry<SubLHashtableKeyEntry, SubLObject>) iterator.next();
          final SubLObject key2 = unwrap(entry.getKey());
          final boolean hasKey = withTest(key2, hkey);
          if (hasKey) {
            boolean result1 = hash.containsKey(hkey);
            boolean result2 = hash.containsKey(key);
            // if (false) {
            Debug.bug();
            // }
            return true;
          }
        }
      }
      return result;
    } finally {
      Resourcer.getInstance().releaseHashtableKeyEntry(key);
    }
  }

  public boolean containsValue(Object hkey) {
    return hash.containsValue(hkey);
  }

  public Set<Entry<SubLHashtableKeyEntry, SubLObject>> entrySet() {
    Map<SubLHashtableKeyEntry, SubLObject> hash = hashMe();
    return hash.entrySet();
  }

  @Override
public SubLObject get(SubLObject objI) {
    return get0(objI, false);
  }

  public SubLObject get(Object objI) {
    return get0(objI, false);
  }

  public SubLObject get0(Object objI, boolean must) {

    SubLObject subLObject = get1(objI);
    if (!check4Bugs)
      return subLObject;
    if (subLObject == null) {
      SubLHashtableKeyEntry key2 = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        final Map<SubLHashtableKeyEntry, SubLObject> //
        hash = hashMe();
        final SubLObject hkey = unwrap(objI);
        key2 = resourcer.acquireHashtableKeyEntry();
        key2.init(hkey, test);
        subLObject = hash.get(key2);
        if (must && subLObject == null) {

          final SubLHashtableKeyEntry makeKeyEntry = makeKeyEntry(keyFactory, test, hkey);
          int hc1 = hkey.hashCode();
          int hc2 = key2.hashCode();
          int hc3 = makeKeyEntry.hashCode();
          subLObject = hash.get(makeKeyEntry);
          Iterator<Entry<SubLHashtableKeyEntry, SubLObject>> esi = getKeyEntrySetIterator();
          while (esi.hasNext()) {
            Entry<SubLHashtableKeyEntry, SubLObject> entry = esi.next();
            final SubLHashtableKeyEntry key = entry.getKey();
            int hc4 = key.hashCode();
            final SubLObject unwrap = unwrap(key);
            if (withTest(unwrap, unwrap(objI))) {

              // if (false) {
              Debug.bug();
              // }
              return entry.getValue();
            }
          }
        }
        return subLObject;

      } finally {
        resourcer.releaseHashtableKeyEntry(key2);
      }
    }
    return subLObject;
  }

  public SubLObject get1(Object objI) {
    SubLObject hkey = unwrap(objI);
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
      key.init(hkey);
      return hash.get(key);
    } else if (hkey.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(hkey);
      return hash.get(key);
    } else {
      SubLHashtableKeyEntry key2 = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key2 = resourcer.acquireHashtableKeyEntry();
        key2.init(hkey, test);
        Map<SubLHashtableKeyEntry, SubLObject> hash = hashMe();
        final SubLObject subLObject = hash.get(key2);
        return subLObject;

      } finally {
        resourcer.releaseHashtableKeyEntry(key2);
      }

    }
  }

  private boolean withTest(SubLObject key, Object hkey) {
    return test.processItem(unwrap(key), unwrap(hkey)) != NIL;
  }

  public boolean isEmpty() {
    return hash.isEmpty();
  }

  public java.util.Set keySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.keySet()");
    return null;
  }

  @Override
public SubLObject put(SubLObject hkey, SubLObject value) {
    if (isAltTest()) {
      // this implementation lets the last representation of the key
      // survive, rather than the first; this is justified by Steele (1983), p282
      boolean knownKey = containsKey(hkey);
      if (knownKey) {
        remove(hkey);
      }
      SubLHashtableKeyEntry key = makeKeyEntry(keyFactory, test, hkey);
      final SubLObject put = hash.put(key, value);
      if (!check4Bugs)
        return put;
      SubLObject keyS2 = (SubLObject) hkey.clone();
      //			int hc1 = hkey.hashCode();
      //			int hc2 = keyS2.hashCode();
      SubLObject find = get0(keyS2, true);
      if (find == null) {
        Debug.bug();
      }
      return put;
    } else {
      SubLHashtableKeyEntry key = makeKeyEntry(keyFactory, test, hkey);
      final SubLObject put = hash.put(key, value);
      if (!check4Bugs)
        return put;
      SubLObject find = get0(hkey, true);
      if (find == null) {
        Debug.bug();
      }
      return put;
    }
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @return
   */
  private boolean isAltTest() {
    if (test == BinaryFunction.EQUALP_TEST)
      return true;
    return test != BinaryFunction.EQL_TEST && test != BinaryFunction.EQ_TEST && test != BinaryFunction.EQUAL_TEST;
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @param hkey
   * @return
   */
  public static SubLHashtableKeyEntry makeKeyEntry(SubLKeyEntryFactory keyFactory, BinaryFunction test, Object hkey) {
    if (hkey instanceof SubLHashtableKeyEntry) {
      return (SubLHashtableKeyEntry) hkey;
    }
    final SubLObject subLObject = (SubLObject) hkey;
    final SubLHashtableKeyEntry key;
    if (subLObject.canFastHash()) {
      key = keyFactory.makeKeyEntry(subLObject);
    } else {
      key = new SubLHashtableKeyEntryImpl();
      key.init(subLObject, test);
    }
    return key;

  }

  public void putAll(Map map) {
    // @note we'll need to box keys before storing them. --APB
    Errors.unimplementedMethod("SubLHashtable.putAll()");
  }

  @Override
public SubLObject remove(SubLObject hkey) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
      key.init(hkey);
      return hash.remove(key);
    } else if (hkey.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(hkey);
      return hash.remove(key);
    } else {
      SubLHashtableKeyEntry key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(hkey, test);
        SubLObject result = hash.remove(key);
        if (!check4Bugs)
          return result;

        if (result == null) {
          for (Iterator iterator = entrySet().iterator(); iterator.hasNext();) {
            Entry<SubLHashtableKeyEntry, SubLObject> entry = //
                (Entry<SubLHashtableKeyEntry, SubLObject>) iterator.next();
            final SubLObject key2 = unwrap(entry.getKey());
            final boolean hasKey = withTest(key2, hkey);
            if (hasKey) {
              final SubLObject value = entry.getValue();
              iterator.remove();
              // if (false) {
              Debug.bug();
              // }
              return value;
            }
          }
        }
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
      return null;
    }
  }

  @Override
public int size() {
    return hash.size();
  }

  public int getCurrentCapacity() {
    return (int) (hash.size() * 1.30) + 1; // @hack
  }

  public java.util.Collection<SubLObject> values() {
    return hash.values();
  }

  public Iterator<Entry<SubLHashtableKeyEntry, SubLObject>> getKeyEntrySetIterator() {
    return hash.entrySet().iterator();
  }

  /** Method created to avoid casting */
  @Override
public final SubLHashtable toHashtable() { // SubLHashtable
    return this;
  }

  @Override
public final boolean isNil() {
    return false;
  }

  @Override
public final boolean isBoolean() {
    return false;
  }

  @Override
public final boolean isSymbol() {
    return false;
  }

  @Override
public final boolean isKeyword() {
    return false;
  }

  @Override
public final boolean isAtom() {
    return true;
  }

  @Override
public final boolean isCons() {
    return false;
  }

  @Override
public final boolean isList() {
    return false;
  }

  @Override
public final boolean isSequence() {
    return false;
  }

  @Override
public final boolean isNumber() {
    return false;
  }

  @Override
public final boolean isFixnum() {
    return false;
  }

  @Override
public final boolean isBignum() {
    return false;
  }

  @Override
public final boolean isIntBignum() {
    return false;
  }

  @Override
public final boolean isLongBignum() {
    return false;
  }

  @Override
public final boolean isBigIntegerBignum() {
    return false;
  }

  @Override
public final boolean isInteger() {
    return false;
  }

  @Override
public final boolean isDouble() {
    return false;
  }

  @Override
public final boolean isChar() {
    return false;
  }

  @Override
public final boolean isString() {
    return false;
  }

  @Override
public final boolean isVector() {
    return false;
  }

  @Override
public final boolean isFunction() {
    return false;
  }

  @Override
public final boolean isFunctionSpec() {
    return false;
  }

  @Override
public final boolean isMacroOperator() {
    return false;
  }

  @Override
public final boolean isHashtable() {
    return true;
  }

  @Override
public final boolean isProcess() {
    return false;
  }

  @Override
public final boolean isLock() {
    return false;
  }

  @Override
public final boolean isReadWriteLock() {
    return false;
  }

  @Override
public final boolean isStructure() {
    return false;
  }

  @Override
public final boolean isStream() {
    return false;
  }

  @Override
public final boolean isPackage() {
    return false;
  }

  @Override
public final boolean isError() {
    return false;
  }

  @Override
public final boolean isGuid() {
    return false;
  }

  @Override
public final boolean isSemaphore() {
    return false;
  }

  @Override
public final boolean isEnvironment() {
    return false;
  }

  @Override
public final boolean isHashtableIterator() {
    return false;
  }

  @Override
public final boolean isRegexPattern() {
    return false;
  }

  @Override
public final boolean isKeyhash() {
    return false;
  }

  @Override
public final boolean isKeyhashIterator() {
    return false;
  }

  //// Protected Area

  //// Private Area

  /**
   * Public only for implementation reasons No one should ever use this directly
   * outside of SubLHashtable.
   */
  public static interface SubLHashtableKeyEntry {
    SubLObject getSKey();

    void clear();

    public void init(SubLObject key);

    public void init(SubLObject key, BinaryFunction test);
  }

  /**
   * Public only for implementation reasons No one should ever use this directly
   * outside of SubLHashtable.
   */
  public static final class SubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

    public SubLHashtableKeyEntryImpl() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return "#<KeyTest " + getSimpleName(test.getClass()) + ": " + stringValueOf(getSKey()) + " hc=" + hashCode() + ">";
    }

    @Override
    public void init(SubLObject key, BinaryFunction test) {
      this.key = key;
      this.test = test;
    }

    @Override
    public void init(SubLObject key) {
      Errors.error("Ugh."); // this shouldn't happen'
    }

    @Override
    public boolean equals(Object hkey) {
      if (hkey == this)
        return true;
      hkey = unwrap(hkey);
      if (hkey == key)
        return true;
      final boolean result = (SubLNil.NIL != test.processItem(key, (SubLObject) hkey));
      return result;
    }

    @Override
    public int hashCode() {
      if (key == null)
        return -1;
      if (hashCodeMaker != null) {
        final SubLObject processItem = hashCodeMaker.processItem(key);
        return processItem.hashCode();
      }
      if (true)
        return key.hashCode(0);
      if (test == BinaryFunction.EQ_TEST) {
        return key.hashCode();
      }
      if (test == BinaryFunction.EQL_TEST) {
        return key.hashCode(0);
      }
      if (test == BinaryFunction.EQUAL_TEST) {
        return ((LispObject) key).sxhash();
      }
      if (test == BinaryFunction.EQUALP_TEST) {
        return ((LispObject) key).psxhash();
      }
      return ((LispObject) key).psxhash();
    }

    @Override
    public void clear() {
      key = null;
      test = null;
    }

    @Override
    public SubLObject getSKey() {
      return key;
    }

    /**
     * Setter. Sets or updates the hashCodeMaker to the passed value.
     * 
     * @param hashCodeMaker the hashCodeMaker to set
     */
    public void setHashCodeMaker(UnaryFunction hashCodeMaker) {
      this.hashCodeMaker = hashCodeMaker;
    }

    private SubLObject key;
    private BinaryFunction test;
    private UnaryFunction hashCodeMaker;
  }

  public static final class SubLEqHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return "#<KeyTest EQ: " + stringValueOf(getSKey()) + " hc=" + hashCode() + ">";
    }

    public SubLEqHashtableKeyEntryImpl() {
    }

    @Override
    public void init(SubLObject key) {
      this.key = key;
    }

    @Override
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); // this shouldn't happen'
    }

    @Override
    public boolean equals(Object hkey) {
      if (hkey == this)
        return true;
      hkey = unwrap(hkey);
      if (hkey == key)
        return true;
      return key == hkey;
    }

    @Override
    public int hashCode() {
      if (true)
        return key.hashCode(0);

      return key.hashCode(0);
    }

    @Override
    public void clear() {
      key = null;
    }

    @Override
    public SubLObject getSKey() {
      return key;
    }

    private SubLObject key;
  }

  public static final class SubLEqlHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return "#<KeyTest EQL: " + stringValueOf(getSKey()) + " hc=" + hashCode() + ">";
    }

    public SubLEqlHashtableKeyEntryImpl() {
    }

    @Override
    public void init(SubLObject key) {
      this.key = key;
    }

    @Override
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); // this shouldn't happen'
    }

    @Override
    public boolean equals(Object hkey) {
      hkey = unwrap(hkey);
      return key.eql((SubLObject) hkey);
    }

    @Override
    public int hashCode() {
      if (true)
        return key.hashCode(0);

      return ((LispObject) key).sxhash();
    }

    @Override
    public void clear() {
      key = null;
    }

    @Override
    public SubLObject getSKey() {
      return key;
    }

    private SubLObject key;
  }

  public static final class SubLEqualHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return "#<KeyTest EQUAL: " + stringValueOf(getSKey()) + " hc=" + hashCode() + ">";
    }

    public SubLEqualHashtableKeyEntryImpl() {
    }

    @Override
    public void init(SubLObject key) {
      this.key = key;
    }

    @Override
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); // this shouldn't happen'
    }

    @Override
    public boolean equals(Object hkey) {
      hkey = unwrap(hkey);
      return key.equal((SubLObject) hkey);
    }

    @Override
    public int hashCode() {
      if (true)
        return key.hashCode(0);

      return key.hashCode(0);
    }

    @Override
    public void clear() {
      key = null;
    }

    @Override
    public SubLObject getSKey() {
      return key;
    }

    private SubLObject key;
  }

  public static final class SubLEqualpHashtableKeyEntryImpl implements SubLHashtableKeyEntry {

    @Override
    public String toString() {
      return "#<KeyTest EQUALP: " + stringValueOf(getSKey()) + " hc=" + hashCode() + ">";

    }

    public SubLEqualpHashtableKeyEntryImpl() {
    }

    @Override
    public void init(SubLObject key) {
      this.key = key;
    }

    @Override
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); // this shouldn't happen'
    }

    @Override
    public boolean equals(Object hkey) {
      hkey = unwrap(hkey);
      return key.equalp((SubLObject) hkey);
    }

    @Override
    public int hashCode() {
      if (true)
        return key.hashCode(0);

      return ((LispObject) key).psxhash();
    }

    @Override
    public void clear() {
      key = null;
    }

    @Override
    public SubLObject getSKey() {
      return key;
    }

    private SubLObject key;
  }

  interface SubLKeyEntryFactory {
    SubLHashtableKeyEntry makeKeyEntry();

    SubLHashtableKeyEntry makeKeyEntry(SubLObject key);
  }

  static final SubLKeyEntryFactory EQ_KEY_FACTORY = new SubLKeyEntryFactory() {
    @Override
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable#toString()
     */
    @Override
    public String toString() {
      return makeKeyEntry().toString();
    }

    @Override
    public SubLHashtableKeyEntry makeKeyEntry(SubLObject key) {
      SubLEqHashtableKeyEntryImpl entry = new SubLEqHashtableKeyEntryImpl();
      entry.init(key);
      return entry;
    }
  };

  static final SubLKeyEntryFactory EQL_KEY_FACTORY = new SubLKeyEntryFactory() {
    @Override
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable#toString()
     */
    @Override
    public String toString() {
      return makeKeyEntry().toString();
    }

    @Override
    public SubLHashtableKeyEntry makeKeyEntry(SubLObject key) {
      SubLEqlHashtableKeyEntryImpl entry = new SubLEqlHashtableKeyEntryImpl();
      entry.init(key);
      return entry;

    }
  };

  static final SubLKeyEntryFactory EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {
    @Override
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable#toString()
     */
    @Override
    public String toString() {
      return makeKeyEntry().toString();
    }

    @Override
    public SubLHashtableKeyEntry makeKeyEntry(SubLObject key) {
      SubLEqualHashtableKeyEntryImpl entry = new SubLEqualHashtableKeyEntryImpl();
      entry.init(key);
      return entry;
    }
  };

  static final SubLKeyEntryFactory EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {
    @Override
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable#toString()
     */
    @Override
    public String toString() {
      return makeKeyEntry().toString();
    }

    @Override
    public SubLHashtableKeyEntry makeKeyEntry(SubLObject key) {
      SubLEqualpHashtableKeyEntryImpl entry = new SubLEqualpHashtableKeyEntryImpl();
      entry.init(key);
      return entry;
    }
  };

  //// Internal Rep

  private final BinaryFunction test;
    public HashMap<SubLHashtableKeyEntry, SubLObject> hash;
  private final SubLKeyEntryFactory keyFactory;
  //
  //	@Override
  //	public boolean isAtom() {
  //		return true;
  //	}
  //
  //	@Override
  //	public boolean isHashtable() {
  //		return true;
  //	}
  //
  //	@Override
  //	public boolean isHashtableIterator() {
  //		return false;
  //	}
  //
  //	@Override
  //	public boolean isKeyhash() {
  //		return false;
  //	}
  //
  //	@Override
  //	public boolean isKeyhashIterator() {
  //		return false;
  //	}
  //
  //	@Override
  //	public SubLHashtable toHashtable() {
  //		return this;
  //	}

  @Override
  public SubLHashtable toLispObject() {
    return this;
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @param hkey
   * @return
   */
  public static SubLObject unwrap(Object hkey) {
    if (hkey instanceof SubLHashtableKeyEntry) {
      return ((SubLHashtableKeyEntry) hkey).getSKey();
    }
    return (SubLObject) hkey;
  }

  @Override
  public String printObjectImpl() {
    checkUnreadableOk();
    return "#<HASH-TABLE " + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + this.size() + " entries @ " + super.toString() + ">";
  }

  public String toStringComplete() {
    return toString();
  }

  //	@Override
  //	public String toTypeName() {
  //		return "HASHTABLE";
  //	}

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

  /*
   * (non-Javadoc)
   * 
   * @see org.armedbear.lisp.LispHashTable#ENTRIES()
   */
  @Override
  public LispObject ENTRIES() {
    return getEntries();
  }

    public Map hashMe() {
    return this.hash;
  }

  // Returns a list of (key . value) pairs.
  @Override
  public LispObject getEntries() {
    // No need to take out a read lock, for the same reason as MAPHASH
    Iterator<Entry<SubLObject, SubLObject>> it = getEntrySetIterator();
    LispObject list = NIL;
    for (Iterator iterator = it; iterator.hasNext();) {
      Entry e = (Entry) iterator.next();
      while (e != null) {
        list = new Cons(new Cons(unwrap(e.getKey()), (SubLObject) e.getValue()), list);
      }
    }
    return list;
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @return
   */
  public Iterator<Entry<SubLObject, SubLObject>> getEntrySetIterator() {
    final boolean advanceToNext = false;
    return new SubLHashtableIterator(this, advanceToNext);
  }

  @Override
  public LispObject MAPHASH(LispObject function) {
    // Don't take out a read lock: it can't be upgraded to a write
    // lock, which would block the scenario where put() is called to
    // set the value of the current entry
    Iterator<Entry<SubLObject, SubLObject>> it = getEntrySetIterator();
    for (Iterator<Entry<SubLObject, SubLObject>> iterator = it; iterator.hasNext();) {
      Entry<SubLObject, SubLObject> e = iterator.next();
      while (e != null) {
        final LispObject key = (LispObject) unwrap(e.getKey());
        function.execute(key, (LispObject) e.getValue());
      }
    }
    return NIL;
  }

  @Override
public LispObject getRehashThreshold() {
    Map<SubLHashtableKeyEntry, SubLObject> hash = hashMe();
    if (true)
      throw new UnsupportedOperationException("Not supported yet.");
    return null;
  }

  @Override
  public LispObject getRehashSize() {

    Map<SubLHashtableKeyEntry, SubLObject> hash = hashMe();
    if (true)
      throw new UnsupportedOperationException("Not supported yet.");
    return null;
  }

}
