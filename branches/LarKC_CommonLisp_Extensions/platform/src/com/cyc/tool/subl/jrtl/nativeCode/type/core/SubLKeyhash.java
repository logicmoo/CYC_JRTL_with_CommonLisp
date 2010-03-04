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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLKeyEntryFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public  final class SubLKeyhash extends AbstractSubLObject implements SubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash() {
    this(128, BinaryFunction.EQL_TEST);
  }
  
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash(int size) {
    this(size, BinaryFunction.EQL_TEST);
  }
  
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash(int size, BinaryFunction test) {
    hash = new HashSet<SubLObject>((int)(size*1.5) + 1);
    this.test = test;
    if (test == BinaryFunction.EQ_TEST) { 
      keyFactory = SubLHashtable.EQ_KEY_FACTORY;
    } else if (test == BinaryFunction.EQL_TEST) {
      keyFactory = SubLHashtable.EQL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUAL_TEST) {
      keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUALP_TEST) {
      keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
    } else {
      Errors.error("Got non-equality test for hashtable: " + test);
      keyFactory = null;
    }
  }
  
  //// Public Area
  
  public final SubLList toSubLList() {
    SubLList result = SubLNil.NIL;
    SubLObject[] values = (SubLObject[])hash.toArray(new SubLObject[hash.size()]);
    for (int i = 0, size = values.length; i < size; i++) {
      result = result.push(values[i]);
    }
    return SubLNil.NIL;
  }
  
  public final SubLList toSubLVector() {
    SubLList result = SubLNil.NIL;
    SubLObject[] values = (SubLObject[])hash.toArray(new SubLObject[hash.size()]);
    for (int i = 0, size = values.length; i < size; i++) {
      result = result.push(values[i]);
    }
    return SubLNil.NIL;
  }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_keyhash$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.ONE_HUNDRED_THIRTY_SEVEN_INTEGER;
  }
  
  public final boolean canFastHash() {
    return false;
  }
  
  public static final String KEYHASH_TYPE_NAME = "KEYHASH";
  
  public String toTypeName() {
    return KEYHASH_TYPE_NAME;
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return 0; // @hack
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public String toString() {
    return "#<" + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + size()
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
  
  public boolean hasKey(SubLObject obj) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = ((SubLThread)Thread.currentThread()).hashtableEqKeyEntry;
      key.init(obj);
      return hash.contains(key);
    } else if (obj.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(obj);
      return hash.contains(key);
    } else {
      SubLHashtableKeyEntryImpl key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(obj, test);
        return hash.contains(key);
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
    }
  }
  
  public java.util.Set entrySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.entrySet()");
    return null;
  }
  
  public boolean isEmpty() {
    return hash.isEmpty();
  }
  
  public java.util.Set keySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.keySet()");
    return null;
  }
  
  public void addKey(SubLObject key) {
    hash.add(key);
  }
  
  public void putAll(Map map) {
    // @note we'll need to box keys before storing them. --APB
    Errors.unimplementedMethod("SubLHashtable.putAll()");
  }
  
  public boolean remKey(SubLObject obj) {
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
  
  public Iterator<SubLObject> getEntrySetIterator() {
    return hash.iterator();
  }
  
  /** Method created to avoid casting */
  public final SubLKeyhash toKeyhash() { // SubLKeyhash
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
  public final boolean isHashtable() { return false; }
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
  public final boolean isKeyhhashIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return true; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private final BinaryFunction test;
  private final HashSet<SubLObject> hash;
  private final SubLKeyEntryFactory keyFactory;
  
}
