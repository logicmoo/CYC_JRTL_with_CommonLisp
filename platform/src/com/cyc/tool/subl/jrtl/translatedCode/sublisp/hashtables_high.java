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

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.util.*;

public  final class hashtables_high implements SubLFile {
  
  //// Constructor
  
  private hashtables_high() {}
  public static final SubLFile me = new hashtables_high();
  
  //// Internal Constants
  
  private static final SubLObject[] $constants = new SubLObject[2];
  
  //// Definitions
  
  /** Return T iff OBJECT is a hash-table-iterator */
  public static final SubLObject hash_table_iterator_p(SubLObject object) {
    return SubLObjectFactory.makeBoolean(object.isHashtableIterator());
  }
  
  /** Return a new hash-table-iterator for iterating over HASH-TABLE. */
  public static final SubLObject make_hash_table_iterator(SubLObject hash_table) {
    return SubLObjectFactory.makeHashtableIterator(hash_table.toHashtable());
  }
  
  /** Destroy HASH-TABLE-ITERATOR */
  public static final SubLObject destroy_hash_table_iterator(SubLObject hash_table_iterator) {
    hash_table_iterator.toHashtableIterator().clear();
    return NIL;
  }
  
  /** Return the hash-table over which HASH-TABLE-ITERATOR is currently iterating. */
  public static final SubLObject hash_table_iterator_hash_table(SubLObject hash_table_iterator) {
    return Errors.unimplementedMethod("HASH-TABLE-ITERATOR-HASH-TABLE");
  }
  
  /** Return T iff HASH-TABLE-ITERATOR has completed. */
  public static final SubLObject hash_table_iterator_done_p(SubLObject hash_table_iterator) {
    boolean result = !hash_table_iterator.toHashtableIterator().hasNext();
    return SubLObjectFactory.makeBoolean(result);
  }
  
  /** Return the current hashtable key of the iteration by HASH-TABLE-ITERATOR. */
  public static final SubLObject hash_table_iterator_key(SubLObject hash_table_iterator) {
    return hash_table_iterator.toHashtableIterator().getCurrentKey();
  }
  
  /** Return the current hashtable value of the iteration by HASH-TABLE-ITERATOR. */
  public static final SubLObject hash_table_iterator_value(SubLObject hash_table_iterator) {
    return hash_table_iterator.toHashtableIterator().getCurrentValue();
  }
  
  /** Step HASH-TABLE-ITERATOR to make the next key/value pair current. */
  public static final SubLObject hash_table_iterator_next(SubLObject hash_table_iterator) {
    hash_table_iterator.toHashtableIterator().next();
    return hash_table_iterator;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "hash_table_iterator_p", "HASH-TABLE-ITERATOR-P", 1, 0, false);
    SubLFiles.declareFunction(me, "make_hash_table_iterator", "MAKE-HASH-TABLE-ITERATOR", 1, 0, false);
    SubLFiles.declareFunction(me, "destroy_hash_table_iterator", "DESTROY-HASH-TABLE-ITERATOR", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_iterator_hash_table", "HASH-TABLE-ITERATOR-HASH-TABLE", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_iterator_done_p", "HASH-TABLE-ITERATOR-DONE-P", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_iterator_key", "HASH-TABLE-ITERATOR-KEY", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_iterator_value", "HASH-TABLE-ITERATOR-VALUE", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_iterator_next", "HASH-TABLE-ITERATOR-NEXT", 1, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  /// private stuff
  
}
