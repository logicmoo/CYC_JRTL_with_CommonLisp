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

package com.cyc.cycjava_1.cycl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class hash_table_utilities extends SubLTranslatedFile {

  //// Constructor

  private hash_table_utilities() {}
  public static final SubLFile me = new hash_table_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.hash_table_utilities";

  //// Definitions

  /** All function symbols which are permitted tests for hashtable-based algorithms. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 369) 
  private static SubLSymbol $valid_hash_test_symbols$ = null;

  /** All functions which are permitted tests for hashtable-based algorithms. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 585) 
  private static SubLSymbol $valid_hash_test_functions$ = null;

  @SubL(source = "cycl/hash-table-utilities.lisp", position = 755) 
  public static final SubLObject valid_hash_test_symbols() {
    return $valid_hash_test_symbols$.getGlobalValue();
  }

  /** Return the symbol form of TEST, which is a valid hash-test function. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 1076) 
  public static final SubLObject hash_test_to_symbol(SubLObject test) {
    checkType(test, $sym1$VALID_HASH_TEST_P);
    if (test.isSymbol()) {
      return test;
    } else {
      return Sequences.find(test, $valid_hash_test_symbols$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym2$SYMBOL_FUNCTION), UNPROVIDED, UNPROVIDED);
    }
  }

  /** Return T iff TABLE is an empty hashtable */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 1347) 
  public static final SubLObject hash_table_empty_p(SubLObject table) {
    return Numbers.numE(ZERO_INTEGER, Hashtables.hash_table_count(table));
  }

  /** Rehash every KEY VALUE pair in the hashtable TABLE. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 1469) 
  public static final SubLObject rehash(SubLObject table) {
    {
      SubLObject pairs = NIL;
      {
        SubLObject key = NIL;
        SubLObject value = NIL;
        {
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
          try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
              final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
              key = Hashtables.getEntryKey(cdohash_entry);
              value = Hashtables.getEntryValue(cdohash_entry);
              pairs = cons(cons(key, value), pairs);
            }
          } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
          }
        }
      }
      Hashtables.clrhash(table);
      {
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = NIL;
        for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
          {
            SubLObject datum = pair;
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = current.rest();
            value = current;
            Hashtables.sethash(key, table, value);
          }
        }
      }
      return table;
    }
  }

  @SubL(source = "cycl/hash-table-utilities.lisp", position = 2382) 
  public static final SubLObject push_hash(SubLObject key, SubLObject item, SubLObject table) {
    return Hashtables.sethash(key, table, cons(item, Hashtables.gethash(key, table, UNPROVIDED)));
  }

  /** Pops off the first element of the value of KEY in TABLE.
   More precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 3511) 
  public static final SubLObject pop_hash(SubLObject key, SubLObject table) {
    {
      SubLObject value = Hashtables.gethash_without_values(key, table, UNPROVIDED);
      Hashtables.sethash(key, table, value.rest());
      return value.first();
    }
  }

  @SubL(source = "cycl/hash-table-utilities.lisp", position = 7474) 
  public static final SubLObject delete_hash(SubLObject key, SubLObject item, SubLObject table, SubLObject test, SubLObject test_key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((test_key == UNPROVIDED)) {
      test_key = Symbols.symbol_function(IDENTITY);
    }
    return Hashtables.sethash(key, table, Sequences.delete(item, Hashtables.gethash(key, table, UNPROVIDED), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED));
  }

  /** Return a list of all the keys of HASH-TABLE. */
  @SubL(source = "cycl/hash-table-utilities.lisp", position = 11428) 
  public static final SubLObject hash_table_keys(SubLObject hash_table) {
    checkType(hash_table, $sym6$HASH_TABLE_P);
    {
      SubLObject answer = ConsesLow.make_list(Hashtables.hash_table_count(hash_table), UNPROVIDED);
      SubLObject cursor = answer;
      SubLObject key = NIL;
      SubLObject obj = NIL;
      {
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
            key = Hashtables.getEntryKey(cdohash_entry);
            obj = Hashtables.getEntryValue(cdohash_entry);
            ConsesLow.rplaca(cursor, key);
            cursor = cursor.rest();
          }
        } finally {
          Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
      }
      return answer;
    }
  }

  public static final SubLObject declare_hash_table_utilities_file() {
    declareFunction(myName, "valid_hash_test_symbols", "VALID-HASH-TEST-SYMBOLS", 0, 0, false);
    //declareFunction(myName, "valid_hash_test_p", "VALID-HASH-TEST-P", 1, 0, false);
    declareFunction(myName, "hash_test_to_symbol", "HASH-TEST-TO-SYMBOL", 1, 0, false);
    declareFunction(myName, "hash_table_empty_p", "HASH-TABLE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "rehash", "REHASH", 1, 0, false);
    //declareFunction(myName, "rehash_if_stale", "REHASH-IF-STALE", 1, 0, false);
    //declareFunction(myName, "hash_table_staleP", "HASH-TABLE-STALE?", 1, 0, false);
    declareFunction(myName, "push_hash", "PUSH-HASH", 3, 0, false);
    //declareFunction(myName, "pushnew_hash", "PUSHNEW-HASH", 3, 1, false);
    //declareFunction(myName, "push_to_end_hash", "PUSH-TO-END-HASH", 3, 0, false);
    //declareFunction(myName, "hash_add_to_value_sorted", "HASH-ADD-TO-VALUE-SORTED", 3, 2, false);
    //declareFunction(myName, "pushnew_to_end_hash", "PUSHNEW-TO-END-HASH", 3, 0, false);
    declareFunction(myName, "pop_hash", "POP-HASH", 2, 0, false);
    //declareFunction(myName, "remove_value_from_hash", "REMOVE-VALUE-FROM-HASH", 3, 1, false);
    //declareFunction(myName, "gethash_first", "GETHASH-FIRST", 2, 1, false);
    //declareFunction(myName, "sethash_first", "SETHASH-FIRST", 3, 0, false);
    //declareFunction(myName, "nconc_hash", "NCONC-HASH", 3, 0, false);
    //declareFunction(myName, "nconc_to_end_hash", "NCONC-TO-END-HASH", 3, 0, false);
    //declareFunction(myName, "copy_hash_table_values_into", "COPY-HASH-TABLE-VALUES-INTO", 2, 0, false);
    //declareFunction(myName, "copy_hashtable", "COPY-HASHTABLE", 1, 1, false);
    //declareFunction(myName, "sort_hash_value", "SORT-HASH-VALUE", 3, 0, false);
    declareFunction(myName, "delete_hash", "DELETE-HASH", 3, 2, false);
    //declareFunction(myName, "prune_hash", "PRUNE-HASH", 3, 2, false);
    //declareFunction(myName, "cinc_hash", "CINC-HASH", 2, 2, false);
    //declareFunction(myName, "nunion_hash", "NUNION-HASH", 3, 1, false);
    //declareFunction(myName, "nset_difference_hash", "NSET-DIFFERENCE-HASH", 3, 1, false);
    //declareFunction(myName, "hash_difference", "HASH-DIFFERENCE", 2, 1, false);
    //declareFunction(myName, "hash_existence_difference", "HASH-EXISTENCE-DIFFERENCE", 2, 0, false);
    //declareFunction(myName, "hash_memberP", "HASH-MEMBER?", 3, 2, false);
    //declareFunction(myName, "all_elements_in_hashP", "ALL-ELEMENTS-IN-HASH?", 2, 0, false);
    //declareFunction(myName, "sort_hash_table_data", "SORT-HASH-TABLE-DATA", 2, 1, false);
    //declareFunction(myName, "hash_first_n", "HASH-FIRST-N", 2, 0, false);
    //declareFunction(myName, "list_table_keys", "LIST-TABLE-KEYS", 1, 0, false);
    //declareFunction(myName, "hash_table_arbitrary_key", "HASH-TABLE-ARBITRARY-KEY", 1, 0, false);
    //declareFunction(myName, "hash_table_arbitrary_value", "HASH-TABLE-ARBITRARY-VALUE", 1, 0, false);
    declareFunction(myName, "hash_table_keys", "HASH-TABLE-KEYS", 1, 0, false);
    //declareFunction(myName, "hash_table_values", "HASH-TABLE-VALUES", 1, 0, false);
    //declareFunction(myName, "hash_table_keys_with_value", "HASH-TABLE-KEYS-WITH-VALUE", 2, 1, false);
    //declareFunction(myName, "random_hash_table_key_with_value", "RANDOM-HASH-TABLE-KEY-WITH-VALUE", 2, 1, false);
    //declareFunction(myName, "hash_table_to_alist", "HASH-TABLE-TO-ALIST", 1, 0, false);
    //declareFunction(myName, "new_hash_table_from_alist", "NEW-HASH-TABLE-FROM-ALIST", 1, 1, false);
    //declareFunction(myName, "get_table_values", "GET-TABLE-VALUES", 1, 0, false);
    //declareFunction(myName, "hash_table_values_min_length", "HASH-TABLE-VALUES-MIN-LENGTH", 1, 1, false);
    //declareFunction(myName, "hash_table_values_min_count", "HASH-TABLE-VALUES-MIN-COUNT", 1, 1, false);
    //declareFunction(myName, "hash_list_elements", "HASH-LIST-ELEMENTS", 1, 3, false);
    //declareFunction(myName, "find_in_hash_if", "FIND-IN-HASH-IF", 3, 0, false);
    //declareFunction(myName, "find_in_hash_if_not", "FIND-IN-HASH-IF-NOT", 3, 0, false);
    //declareFunction(myName, "printhash", "PRINTHASH", 1, 1, false);
    //declareFunction(myName, "hashtable_key_collision_count", "HASHTABLE-KEY-COLLISION-COUNT", 1, 0, false);
    //declareFunction(myName, "hashtable_key_collision_probability", "HASHTABLE-KEY-COLLISION-PROBABILITY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hash_table_utilities_file() {
    $valid_hash_test_symbols$ = defconstant("*VALID-HASH-TEST-SYMBOLS*", $list0);
    $valid_hash_test_functions$ = defconstant("*VALID-HASH-TEST-FUNCTIONS*", list(Symbols.symbol_function(EQ), Symbols.symbol_function(EQL), Symbols.symbol_function(EQUAL), Symbols.symbol_function(EQUALP)));
    return NIL;
  }

  public static final SubLObject setup_hash_table_utilities_file() {
    // CVS_ID("Id: hash-table-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(EQ, EQL, EQUAL, EQUALP);
  public static final SubLSymbol $sym1$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym2$SYMBOL_FUNCTION = makeSymbol("SYMBOL-FUNCTION");
  public static final SubLList $list3 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym4$STRING__ = makeSymbol("STRING<=");
  public static final SubLSymbol $sym5$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym6$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLString $str7$Corrupted_hash_table__attempting_ = makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");
  public static final SubLString $str8$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");
  public static final SubLSymbol $kw9$NOTHING = makeKeyword("NOTHING");
  public static final SubLSymbol $kw10$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym11$TRUE = makeSymbol("TRUE");
  public static final SubLString $str12$_S_____S__ = makeString("~S -> ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_hash_table_utilities_file();
  }

  public void initializeVariables() {
    init_hash_table_utilities_file();
  }

  public void runTopLevelForms() {
    setup_hash_table_utilities_file();
  }

}
