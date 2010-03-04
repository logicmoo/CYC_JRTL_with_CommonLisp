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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Iterator;
import java.util.Map.Entry;


//// Internal Imports

//// External Imports

public  final class Keyhashes implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Hashtables. */
  private Keyhashes() {}
  public static final SubLFile me = new Keyhashes();
  
  //// Public Area
  
  public static final SubLObject new_keyhash(SubLObject size, SubLObject test) {    
    if (test == UNPROVIDED) {
      return SubLObjectFactory.makeKeyhash(size.intValue());
    } else {
      SubLFunction func = test.getFunc();
      BinaryFunction bf = BinaryFunction.makeInstance(func);
      return SubLObjectFactory.makeKeyhash(size.intValue(), bf);
    }
  }
  public static final SubLObject do_keyhash_nodes(SubLObject keyhash) {
    return keyhash.toKeyhash().toSubLList();
  }
  
  public static final SubLObject keyhash_test(SubLObject table) {
    return table.toKeyhash().getTest().getFunction();
  }
  
  public static final SubLObject keyhash_count(SubLObject table) {
    return SubLNumberFactory.makeInteger(table.toKeyhash().size());
  }
  
  public static final SubLObject keyhash_capacity(SubLObject table) {
    return SubLNumberFactory.makeInteger((int)(table.toKeyhash().size() * 1.3)); // @hack
  }
  
  public static final SubLObject getkeyhash(SubLObject key, SubLObject table) {
    return table.hasKey(key) ? RET_T : NIL;
  }
  
  public static final SubLObject keyhash_matching_key(SubLObject key, SubLObject table) {
    return table.hasKey(key) ? key : NIL;
  }
  
  public static final SubLObject setkeyhash(SubLObject key, SubLObject table) {
    table.addKey(key);
    return key;
  }
  
  public static final SubLObject remkeyhash(SubLObject key, SubLObject table) {
    return table.remKey(key) ? RET_T : NIL;
  }
  
  public static final SubLObject clrkeyhash(SubLObject table) {
    table.toKeyhash().clear();
    return NIL;
  }
  
  public static final SubLObject mapkeyhash(SubLObject function, SubLObject table) {
    return Errors.unimplementedMethod("Keyhash.maphash()");
  }
  
  //// CDOKEYHASH macro helpers
  
  public static Iterator getEntrySetIterator(SubLObject table) {
    //return table.toHashtable().getEntrySetIterator();
    return null;
  }
  
  public static void releaseEntrySetIterator(Iterator iter) {
    // @todo unstub this
  }
  
  public static boolean iteratorHasNext(Iterator iter) {
    // @todo handle this natively in the translator
    return iter.hasNext();
  }
  
  public static Entry iteratorNextEntry(Iterator iter) {
    // @todo handle this natively in the translator
    //return (Entry)iter.next();
    return null;
  }
  
  public static SubLObject getEntryKey(Entry entry) {
    // @todo handle this natively in the translator
    //final SubLHashtableKeyEntry boxedKey = (SubLHashtableKeyEntry)entry.getKey();
    // return boxedKey.getKey();
    //return (SubLObject)entry.getKey();
    return null;
  }
  
  public static SubLObject getEntryValue(Entry entry) {
    // @todo handle this natively in the translator
    //return (SubLObject)entry.getValue();
    return null;
  }
  
  public static final SubLObject next_hash_index(SubLObject table, SubLObject index) {
    return Errors.unimplementedMethod("Hashtables.next_hash_index()");
  }
  
  public static final SubLObject hash_index_key(SubLObject table, SubLObject index) {
    return Errors.unimplementedMethod("Hashtables.hash_index_key()");
  }
  
  public static final SubLObject hash_index_obj(SubLObject table, SubLObject index) {
    return Errors.unimplementedMethod("Hashtables.hash_index_obj()");
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "new_keyhash", "NEW-KEYHASH", 1, 1, false);
    
    SubLFiles.declareFunction(me, "keyhash_test", "KEYHASH-TEST", 1, 0, false);
    SubLFiles.declareFunction(me, "keyhash_count", "KEYHASH-COUNT", 1, 0, false);
    SubLFiles.declareFunction(me, "keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
    
    SubLFiles.declareFunction(me, "getkeyhash", "GETKEYHASH", 2, 0, false);
    SubLFiles.declareFunction(me, "keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
    
    SubLFiles.declareFunction(me, "setkeyhash", "SETKEYHASH", 2, 0, false);
    SubLFiles.declareFunction(me, "remkeyhash", "REMKEYHASH", 2, 0, false);
    SubLFiles.declareFunction(me, "clrkeyhash", "CLRKEYHASH", 1, 0, false);
    
    SubLFiles.declareFunction(me, "mapkeyhash", "MAPKEYHASH", 2, 0, false);
    
    SubLFiles.declareFunction(me, "do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
  public static void main(String[]args) {
  }
  
}
