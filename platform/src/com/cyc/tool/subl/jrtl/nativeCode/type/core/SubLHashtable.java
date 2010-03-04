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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public  final class SubLHashtable extends AbstractSubLObject implements SubLObject {
  
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
    hash = new HashMap<SubLObject, SubLObject>((int)(size*1.5) + 1);
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
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_hash_table$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.NINE_INTEGER;
  }
  
  public final boolean canFastHash() {
    return false;
  }
  
  public static final String HASHTABLE_TYPE_NAME = "HASHTABLE";
  
  public String toTypeName() {
    return HASHTABLE_TYPE_NAME;
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return 0; // @hack
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public String toString() {
    return "#<HASH-TABLE " + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + size()
    + " entries @ " + super.toString() + ">";
  }
  
  public String toStringComplete() {
    return toString();
  }
  
  public BinaryFunction getTest() {
    return test;
  }
  
  public void clear() {
    hash.clear();
  }
  
  public boolean containsKey(Object obj) {
    SubLHashtableKeyEntryImpl key = null;
    try {
      key = Resourcer.getInstance().acquireHashtableKeyEntry();
      key.init((SubLObject)obj, test);
      final boolean result = hash.containsKey(key);
      return result;
    } finally {
      Resourcer.getInstance().releaseHashtableKeyEntry(key);
    }
  }
  
  public boolean containsValue(Object obj) {
    return hash.containsValue(obj);
  }
  
  public java.util.Set entrySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.entrySet()");
    return null;
  }
  
  public SubLObject get(SubLObject obj) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = ((SubLThread)Thread.currentThread()).hashtableEqKeyEntry;
      key.init(obj);
      return hash.get(key);
    } else if (obj.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(obj);
      return hash.get(key);
    } else {
      SubLHashtableKeyEntryImpl key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(obj, test);
        return hash.get(key);
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
    }
  }
  
  public boolean isEmpty() {
    return hash.isEmpty();
  }
  
  public java.util.Set keySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.keySet()");
    return null;
  }
  
  public SubLObject put(SubLObject key, SubLObject value) {
    if (test == BinaryFunction.EQUALP_TEST) {
      // this implementation lets the last representation of the key
      // survive, rather than the first; this is justified by Steele (1983), p282
      final boolean knownKey = containsKey(key);
      if (knownKey) {
        remove(key);
      }
      return hash.put(key, value);
    } else {
      return hash.put(key, value);
    }
  }
  
  public void putAll(Map map) {
    // @note we'll need to box keys before storing them. --APB
    Errors.unimplementedMethod("SubLHashtable.putAll()");
  }
  
  public SubLObject remove(SubLObject obj) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
      key.init(obj);
      return hash.remove(key);
    } else if (obj.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(obj);
      return hash.remove(key);
    } else {
      SubLHashtableKeyEntryImpl key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(obj, test);
        return hash.remove(key);
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
    }
  }
  
  public int size() {
    return hash.size();
  }
  
  public int getCurrentCapacity() {
    return (int)(hash.size() * 1.30) + 1; //@hack
  }
  
  public java.util.Collection values() {
    return hash.values();
  }
  
  public Iterator getEntrySetIterator() {
    return hash.entrySet().iterator();
  }
  
  /** Method created to avoid casting */
  public final SubLHashtable toHashtable() { // SubLHashtable
    return this;
  }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return true; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  /** Public only for implementation reasons
   * No one should ever use this directly outside of SubLHashtable.
   */
  public static interface SubLHashtableKeyEntry {
    SubLObject getKey();
    void clear();
    public void init(SubLObject key);
    public void init(SubLObject key, BinaryFunction test);
  }
  
  /** Public only for implementation reasons
   * No one should ever use this directly outside of SubLHashtable.
   */
  public static final class SubLHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
    
    public SubLHashtableKeyEntryImpl() {}
    
    public void init(SubLObject key, BinaryFunction test) {
      this.key = key;
      this.test = test;
    }
    
    public void init(SubLObject key) {
      Errors.error("Ugh."); //this shouldn't happen'
    }
    
    public boolean equals(Object obj) {
      final boolean result = (SubLNil.NIL != test.processItem(key, (SubLObject)obj));
      return result;
    }
    
    public int hashCode() {
      return key.hashCode();
    }
    
    public void clear()  {
      key = null;
      test = null;
    }
    
    public SubLObject getKey() { return key; }
    
    private SubLObject key;
    private BinaryFunction test;
  }
  
  public static final class SubLEqHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
    
    public SubLEqHashtableKeyEntryImpl() {}
    
    public void init(SubLObject key) {
      this.key = key;
    }
    
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); //this shouldn't happen'
    }
    
    public boolean equals(Object obj) {
      return key == obj;
    }
    
    public int hashCode() {
      return key.hashCode();
    }
    
    public void clear()  {
      key = null;
    }
    
    public SubLObject getKey() { return key; }
    
    private SubLObject key;
  }
  
  
  
  public static final class SubLEqlHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
    
    public SubLEqlHashtableKeyEntryImpl() {}
    
    public void init(SubLObject key) {
      this.key = key;
    }
    
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); //this shouldn't happen'
    }
    
    public boolean equals(Object obj) {
      return key.eql((SubLObject)obj);
    }
    
    public int hashCode() {
      return key.hashCode();
    }
    
    public void clear()  {
      key = null;
    }
    
    public SubLObject getKey() { return key; }
    
    private SubLObject key;
  }
  
  
  
  public static final class SubLEqualHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
    
    public SubLEqualHashtableKeyEntryImpl() {}
    
    public void init(SubLObject key) {
      this.key = key;
    }
    
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); //this shouldn't happen'
    }
    
    public boolean equals(Object obj) {
      return key.equal((SubLObject)obj);
    }
    
    public int hashCode() {
      return key.hashCode();
    }
    
    public void clear()  {
      key = null;
    }
    
    public SubLObject getKey() { return key; }
    
    private SubLObject key;
  }
  
  
  
  public static final class SubLEqualpHashtableKeyEntryImpl implements SubLHashtableKeyEntry {
    
    public SubLEqualpHashtableKeyEntryImpl() {}
    
    public void init(SubLObject key) {
      this.key = key;
    }
    
    public void init(SubLObject key, BinaryFunction test) {
      Errors.error("Ugh."); //this shouldn't happen'
    }
    
    public boolean equals(Object obj) {
      return key.equalp((SubLObject)obj);
    }
    
    public int hashCode() {
      return key.hashCode();
    }
    
    public void clear()  {
      key = null;
    }
    
    public SubLObject getKey() { return key; }
    
    private SubLObject key;
  }
  
  interface SubLKeyEntryFactory {
    SubLHashtableKeyEntry makeKeyEntry();
  }
  
  static final SubLKeyEntryFactory EQ_KEY_FACTORY = new SubLKeyEntryFactory() {
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
    }
  };
  
  static final SubLKeyEntryFactory EQL_KEY_FACTORY = new SubLKeyEntryFactory() {
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
    }
  };
  
  static final SubLKeyEntryFactory EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
    }
  };
  
  static final SubLKeyEntryFactory EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {
    public final SubLHashtableKeyEntry makeKeyEntry() {
      return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
    }
  };
  
  //// Internal Rep
  
  private final BinaryFunction test;
  private final HashMap<SubLObject, SubLObject> hash;
  private final SubLKeyEntryFactory keyFactory;
  
}
