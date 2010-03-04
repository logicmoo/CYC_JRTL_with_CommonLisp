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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public  final class SubLHashtableIterator extends AbstractSubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLHashtableIterator. */
  SubLHashtableIterator(SubLHashtable hashTable) {
    iter = hashTable.getEntrySetIterator();
    next();
  }
  
  //// Public Area
  
  public static final String HASHTABLE_ITERATOR_TYPE_NAME = "HASHTABLE-ITERATOR";
  
  public String toTypeName() {
    return HASHTABLE_ITERATOR_TYPE_NAME;
  }
  
  public String toString() {
    return "#<" + toTypeName() + " @ " + super.toString() + ">";
  }
  
  public boolean hasNext() {
    return entry != null;
  }
  
  public Object next() {
    if (iter.hasNext()) {
      entry = (Map.Entry)iter.next();
    } else {
      entry = null;
    }
    return entry;
  }
  
  public SubLObject getCurrentKey() {
    return (SubLObject)entry.getKey();
  }
  
  public SubLObject getCurrentValue() {
    return (SubLObject)entry.getValue();
  }
  
  public void clear() {
    iter = null;
    entry = null;
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return iter.hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  /** Method created to avoid casting */
  public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
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
  public final boolean isHashtableIterator() { return true; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private Iterator iter;
  private Map.Entry entry;
  
  //// Main
  
}
