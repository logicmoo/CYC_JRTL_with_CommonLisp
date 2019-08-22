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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class dictionary_utilities extends SubLTranslatedFile {

  //// Constructor

  private dictionary_utilities() {}
  public static final SubLFile me = new dictionary_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.dictionary_utilities";

  //// Definitions

  /** Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the 
   current value at KEY is a listp.  If the number of
   entries would exceed the limit, revamp the dictionary
   to the next better representation.
   @return key */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 1740) 
  public static final SubLObject dictionary_push(SubLObject v_dictionary, SubLObject key, SubLObject value) {
    checkType(v_dictionary, $sym0$DICTIONARY_P);
    {
      SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
      if (current_val.isList()) {
        current_val = cons(value, current_val);
        return dictionary.dictionary_enter(v_dictionary, key, current_val);
      } else {
        Errors.error($str1$Corrupted_dictionary__attempting_, current_val);
      }
    }
    return NIL;
  }

  /** Push VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the 
   current value at KEY is a listp.  If the number of
   entries would exceed the limit, revamp the dictionary
   to the next better representation. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 2385) 
  public static final SubLObject dictionary_contents_push(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
    checkType(v_dictionary_contents, $sym2$DICTIONARY_CONTENTS_P);
    {
      SubLObject current_val = dictionary_contents.dictionary_contents_lookup_without_values(v_dictionary_contents, key, test, UNPROVIDED);
      if (current_val.isList()) {
        current_val = cons(value, current_val);
        return dictionary_contents.dictionary_contents_enter(v_dictionary_contents, key, current_val, test);
      } else {
        Errors.error($str3$Corrupted_dictionary_contents__at, current_val);
      }
    }
    return NIL;
  }

  /** Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the 
   current value at KEY is a listp and that VALUE is not yet a member of
   the list.  If the number of entries would exceed the limit, revamp
   the dictionary to the next better representation.  TEST is a predicate
   that tests elements for equality and KEY-ACCESSOR is a function
   that represents the key field of the element.
   @return key
   @owner sdevoy */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 4005) 
  public static final SubLObject dictionary_pushnew(SubLObject v_dictionary, SubLObject key, SubLObject value, SubLObject test, SubLObject key_accessor) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key_accessor == UNPROVIDED)) {
      key_accessor = Symbols.symbol_function(IDENTITY);
    }
    checkType(v_dictionary, $sym0$DICTIONARY_P);
    {
      SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
      if (current_val.isList()) {
        {
          SubLObject item_var = value;
          if ((NIL == conses_high.member(item_var, current_val, test, key_accessor))) {
            current_val = cons(item_var, current_val);
          }
          return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
      } else {
        Errors.error($str1$Corrupted_dictionary__attempting_, current_val);
      }
    }
    return NIL;
  }

  /** Assumes that the values of DICTIONARY are property lists (plists).
Looks up KEY in DICTIONARY to get the plist, then gets the property indicated
by INDICATOR from that plist.
@owner pace */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 6961) 
  public static final SubLObject dictionary_getf(SubLObject v_dictionary, SubLObject key, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
      checkType(plist, $sym8$LISTP);
      return conses_high.getf(plist, indicator, v_default);
    }
  }

  /** Assumes that the values of DICTIONARY are property lists (plists).
Looks up KEY in DICTIONARY to get the plist, then sets the property indicated
by INDICATOR on that plist to the value VALUE.
@owner pace */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 7369) 
  public static final SubLObject dictionary_putf(SubLObject v_dictionary, SubLObject key, SubLObject indicator, SubLObject value) {
    {
      SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
      checkType(plist, $sym8$LISTP);
      return dictionary.dictionary_enter(v_dictionary, key, conses_high.putf(plist, indicator, value));
    }
  }

  /** Deletes the first occurrence of ELT from current value at KEY in DICTIONARY.
   Ensures that the current value is a listp. If this deletes the last element
   from current value, then perform an @see dictionary-remove. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 9468) 
  public static final SubLObject dictionary_delete_first_from_value(SubLObject v_dictionary, SubLObject key, SubLObject elt, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(v_dictionary, $sym0$DICTIONARY_P);
    {
      SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
      if (current_val.isList()) {
        {
          SubLObject new_val = list_utilities.delete_first(elt, current_val, test);
          if ((NIL == new_val)) {
            dictionary.dictionary_remove(v_dictionary, key);
          } else {
            if ((new_val != current_val)) {
              dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
          }
        }
      } else {
        Errors.error($str12$Corrupted_dictionary__attempting_, current_val);
      }
    }
    return NIL;
  }

  /** Increments the value at KEY in DICTIONARY by INCREMENT.
Treats NIL as 0. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 11145) 
  public static final SubLObject dictionary_increment(SubLObject v_dictionary, SubLObject key, SubLObject increment) {
    if ((increment == UNPROVIDED)) {
      increment = ONE_INTEGER;
    }
    {
      SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
      value = Numbers.add(value, increment);
      dictionary.dictionary_enter(v_dictionary, key, value);
    }
    return v_dictionary;
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 13442) 
  public static final SubLObject new_dictionary_from_alist(SubLObject alist, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject size = Sequences.length(alist);
      SubLObject v_dictionary = dictionary.new_dictionary(test, size);
      SubLObject cdolist_list_var = alist;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject key = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
          key = current.first();
          current = current.rest();
          value = current;
          dictionary.dictionary_enter(v_dictionary, key, value);
        }
      }
      return v_dictionary;
    }
  }

  /** A triple of dictionary, predicate and key that is used by the DICTIONARY-KEYS-SORTED-BY-VALUES
   infrastructure to help apply the comparison predicate to the values looked up from the
   dictionary. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 19194) 
  private static SubLSymbol $dictionary_keys_sorter_current_sorting_information$ = null;

  /** @return BOOLEANP; Does DICTIONARY have an entry for KEY? */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 27246) 
  public static final SubLObject dictionary_has_keyP(SubLObject v_dictionary, SubLObject key) {
    return Values.nth_value_step_2(Values.nth_value_step_1(ONE_INTEGER), dictionary.dictionary_lookup(v_dictionary, key, UNPROVIDED));
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 30463) 
  private static SubLSymbol $sub_dictionary_not_found$ = null;

  public static final class $synchronized_dictionary_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $dictionary; }
    public SubLObject getField3() { return $lock; }
    public SubLObject setField2(SubLObject value) { return $dictionary = value; }
    public SubLObject setField3(SubLObject value) { return $lock = value; }
    public SubLObject $dictionary = NIL;
    public SubLObject $lock = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($synchronized_dictionary_native.class, $sym69$SYNCHRONIZED_DICTIONARY, $sym70$SYNCHRONIZED_DICTIONARY_P, $list71, $list72, new String[] {"$dictionary", "$lock"}, $list73, $list74, $sym75$PRINT_SYNCHRONIZED_DICTIONARY);
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static SubLSymbol $dtp_synchronized_dictionary$ = null;

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject synchronized_dictionary_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12447");
    return NIL;
  }

  public static final class $synchronized_dictionary_p$UnaryFunction extends UnaryFunction {
    public $synchronized_dictionary_p$UnaryFunction() { super(extractFunctionNamed("SYNCHRONIZED-DICTIONARY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12451"); }
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject synchronized_dictionary_dictionary(SubLObject object) {
    checkType(object, $sym70$SYNCHRONIZED_DICTIONARY_P);
    return object.getField2();
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject synchronized_dictionary_lock(SubLObject object) {
    checkType(object, $sym70$SYNCHRONIZED_DICTIONARY_P);
    return object.getField3();
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject _csetf_synchronized_dictionary_dictionary(SubLObject object, SubLObject value) {
    checkType(object, $sym70$SYNCHRONIZED_DICTIONARY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject _csetf_synchronized_dictionary_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym70$SYNCHRONIZED_DICTIONARY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32015) 
  public static final SubLObject make_synchronized_dictionary(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $synchronized_dictionary_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw81$DICTIONARY)) {
            _csetf_synchronized_dictionary_dictionary(v_new, current_value);
          } else if (pcase_var.eql($kw82$LOCK)) {
            _csetf_synchronized_dictionary_lock(v_new, current_value);
          } else {
            Errors.error($str83$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32127) 
  public static final SubLObject new_synchronized_dictionary(SubLObject test, SubLObject size) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((size == UNPROVIDED)) {
      size = ZERO_INTEGER;
    }
    {
      SubLObject sd = make_synchronized_dictionary(UNPROVIDED);
      _csetf_synchronized_dictionary_dictionary(sd, dictionary.new_dictionary(test, size));
      _csetf_synchronized_dictionary_lock(sd, Locks.make_lock($str84$Synchronized_Dictionary_Lock));
      return sd;
    }
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 32827) 
  public static final SubLObject clear_synchronized_dictionary(SubLObject synchronized_dictionary) {
    checkType(synchronized_dictionary, $sym70$SYNCHRONIZED_DICTIONARY_P);
    {
      SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        dictionary.clear_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return synchronized_dictionary;
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 33157) 
  public static final SubLObject synchronized_dictionary_enter(SubLObject synchronized_dictionary, SubLObject key, SubLObject value) {
    checkType(synchronized_dictionary, $sym70$SYNCHRONIZED_DICTIONARY_P);
    {
      SubLObject result = NIL;
      SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 33529) 
  public static final SubLObject synchronized_dictionary_remove(SubLObject synchronized_dictionary, SubLObject key) {
    checkType(synchronized_dictionary, $sym70$SYNCHRONIZED_DICTIONARY_P);
    {
      SubLObject result = NIL;
      SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = dictionary.dictionary_remove(synchronized_dictionary_dictionary(synchronized_dictionary), key);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/dictionary-utilities.lisp", position = 33889) 
  public static final SubLObject synchronized_dictionary_lookup(SubLObject synchronized_dictionary, SubLObject key, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    checkType(synchronized_dictionary, $sym70$SYNCHRONIZED_DICTIONARY_P);
    {
      SubLObject result = NIL;
      SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = dictionary.dictionary_lookup(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  /** Returns a list of the given SYNCHRONIZED-DICTIONARY's keys. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 35116) 
  public static final SubLObject synchronized_dictionary_keys(SubLObject synchronized_dictionary) {
    {
      SubLObject keys = NIL;
      SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        keys = dictionary.dictionary_keys(synchronized_dictionary_dictionary(synchronized_dictionary));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return keys;
    }
  }

  /** Tests whether the dictionary correctly conflates keys. */
  @SubL(source = "cycl/dictionary-utilities.lisp", position = 38002) 
  public static final SubLObject test_dictionary_key_conflation(SubLObject test, SubLObject raw_items) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_dictionary = dictionary.new_dictionary(test, UNPROVIDED);
        SubLObject unique_items = Sequences.remove_duplicates(raw_items, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = NIL;
        for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
          dictionary.dictionary_enter(v_dictionary, item, $kw94$PRESENT);
        }
        {
          SubLObject expected = Sequences.length(unique_items);
          SubLObject actual = dictionary.dictionary_length(v_dictionary);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(expected.numE(actual)))) {
              Errors.error($str95$Expected__A_entries__but_got__A_, expected, actual);
            }
          }
        }
      }
      return $kw57$SUCCESS;
    }
  }

  public static final SubLObject declare_dictionary_utilities_file() {
    //declareFunction(myName, "dictionary_arbitrary_key", "DICTIONARY-ARBITRARY-KEY", 1, 0, false);
    //declareFunction(myName, "copy_dictionary", "COPY-DICTIONARY", 1, 0, false);
    //declareFunction(myName, "dictionary_pop", "DICTIONARY-POP", 2, 0, false);
    declareFunction(myName, "dictionary_push", "DICTIONARY-PUSH", 3, 0, false);
    declareFunction(myName, "dictionary_contents_push", "DICTIONARY-CONTENTS-PUSH", 4, 0, false);
    //declareFunction(myName, "dictionary_pop_from_value", "DICTIONARY-POP-FROM-VALUE", 2, 0, false);
    declareFunction(myName, "dictionary_pushnew", "DICTIONARY-PUSHNEW", 3, 2, false);
    //declareFunction(myName, "dictionary_add_to_value_sorted", "DICTIONARY-ADD-TO-VALUE-SORTED", 3, 2, false);
    //declareFunction(myName, "dictionary_append", "DICTIONARY-APPEND", 3, 0, false);
    //declareFunction(myName, "dictionary_union", "DICTIONARY-UNION", 3, 2, false);
    declareFunction(myName, "dictionary_getf", "DICTIONARY-GETF", 3, 1, false);
    declareFunction(myName, "dictionary_putf", "DICTIONARY-PUTF", 4, 0, false);
    //declareFunction(myName, "dictionary_remove_from_value", "DICTIONARY-REMOVE-FROM-VALUE", 3, 2, false);
    //declareFunction(myName, "dictionary_delete_from_value", "DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
    declareFunction(myName, "dictionary_delete_first_from_value", "DICTIONARY-DELETE-FIRST-FROM-VALUE", 3, 1, false);
    //declareFunction(myName, "dictionary_delete_items_from_value", "DICTIONARY-DELETE-ITEMS-FROM-VALUE", 3, 2, false);
    declareFunction(myName, "dictionary_increment", "DICTIONARY-INCREMENT", 2, 1, false);
    //declareFunction(myName, "dictionary_decrement", "DICTIONARY-DECREMENT", 2, 1, false);
    //declareFunction(myName, "dictionary_decrement_and_remove_if", "DICTIONARY-DECREMENT-AND-REMOVE-IF", 2, 2, false);
    //declareFunction(myName, "dictionary_extremal", "DICTIONARY-EXTREMAL", 2, 0, false);
    //declareFunction(myName, "dictionary_total", "DICTIONARY-TOTAL", 1, 0, false);
    //declareFunction(myName, "dictionary_to_alist", "DICTIONARY-TO-ALIST", 1, 0, false);
    declareFunction(myName, "new_dictionary_from_alist", "NEW-DICTIONARY-FROM-ALIST", 1, 1, false);
    //declareFunction(myName, "dictionary_to_paired_lists", "DICTIONARY-TO-PAIRED-LISTS", 1, 0, false);
    //declareFunction(myName, "new_dictionary_from_paired_lists_unique", "NEW-DICTIONARY-FROM-PAIRED-LISTS-UNIQUE", 2, 1, false);
    //declareFunction(myName, "new_dictionary_from_paired_lists_push", "NEW-DICTIONARY-FROM-PAIRED-LISTS-PUSH", 2, 1, false);
    //declareFunction(myName, "new_classification_dictionary", "NEW-CLASSIFICATION-DICTIONARY", 2, 1, false);
    //declareMacro(myName, "do_dictionary_accumulating", "DO-DICTIONARY-ACCUMULATING");
    //declareFunction(myName, "make_dictionary_from_text", "MAKE-DICTIONARY-FROM-TEXT", 1, 0, false);
    //declareMacro(myName, "do_dictionary_numbered", "DO-DICTIONARY-NUMBERED");
    //declareFunction(myName, "print_dictionary_contents", "PRINT-DICTIONARY-CONTENTS", 1, 1, false);
    //declareFunction(myName, "print_dictionary_contents_wX_dictionary_values", "PRINT-DICTIONARY-CONTENTS-W/-DICTIONARY-VALUES", 1, 1, false);
    //declareFunction(myName, "print_dictionary_contents_to_csv", "PRINT-DICTIONARY-CONTENTS-TO-CSV", 2, 2, false);
    //declareFunction(myName, "sort_dictionary_by_keys", "SORT-DICTIONARY-BY-KEYS", 2, 0, false);
    //declareFunction(myName, "sort_dictionary_by_values", "SORT-DICTIONARY-BY-VALUES", 2, 0, false);
    //declareFunction(myName, "dictionary_keys_sorted_by_values", "DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
    //declareFunction(myName, "dictionary_keys_sorter_comparison_predicate", "DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE", 2, 0, false);
    //declareFunction(myName, "test_dictionary_keys_sorted_by_values", "TEST-DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
    //declareFunction(myName, "map_dictionary_values", "MAP-DICTIONARY-VALUES", 2, 0, false);
    //declareFunction(myName, "test_map_dictionary_values", "TEST-MAP-DICTIONARY-VALUES", 3, 0, false);
    //declareFunction(myName, "partition_dictionary_keys_into_n_tiles", "PARTITION-DICTIONARY-KEYS-INTO-N-TILES", 2, 1, false);
    //declareMacro(myName, "do_dictionary_keys", "DO-DICTIONARY-KEYS");
    //declareMacro(myName, "do_dictionary_values", "DO-DICTIONARY-VALUES");
    //declareFunction(myName, "add_tuple_list_to_dictionary", "ADD-TUPLE-LIST-TO-DICTIONARY", 1, 1, false);
    //declareFunction(myName, "add_values_from_lists_to_dictionary", "ADD-VALUES-FROM-LISTS-TO-DICTIONARY", 2, 1, false);
    //declareFunction(myName, "dictionary_reverse_lookup", "DICTIONARY-REVERSE-LOOKUP", 2, 1, false);
    declareFunction(myName, "dictionary_has_keyP", "DICTIONARY-HAS-KEY?", 2, 0, false);
    //declareFunction(myName, "dictionary_has_valueP", "DICTIONARY-HAS-VALUE?", 2, 1, false);
    //declareFunction(myName, "dictionary_nmerge", "DICTIONARY-NMERGE", 2, 1, false);
    //declareFunction(myName, "dictionary_merge", "DICTIONARY-MERGE", 2, 1, false);
    //declareFunction(myName, "dictionary_merge_list_values", "DICTIONARY-MERGE-LIST-VALUES", 2, 2, false);
    //declareFunction(myName, "dictionary_nsum", "DICTIONARY-NSUM", 2, 0, false);
    //declareFunction(myName, "dictionary_sum", "DICTIONARY-SUM", 2, 0, false);
    //declareFunction(myName, "sub_dictionaryP", "SUB-DICTIONARY?", 2, 1, false);
    //declareFunction(myName, "dictionaries_coextensionalP", "DICTIONARIES-COEXTENSIONAL?", 2, 1, false);
    declareFunction(myName, "synchronized_dictionary_print_function_trampoline", "SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "synchronized_dictionary_p", "SYNCHRONIZED-DICTIONARY-P", 1, 0, false); new $synchronized_dictionary_p$UnaryFunction();
    declareFunction(myName, "synchronized_dictionary_dictionary", "SYNCHRONIZED-DICTIONARY-DICTIONARY", 1, 0, false);
    declareFunction(myName, "synchronized_dictionary_lock", "SYNCHRONIZED-DICTIONARY-LOCK", 1, 0, false);
    declareFunction(myName, "_csetf_synchronized_dictionary_dictionary", "_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY", 2, 0, false);
    declareFunction(myName, "_csetf_synchronized_dictionary_lock", "_CSETF-SYNCHRONIZED-DICTIONARY-LOCK", 2, 0, false);
    declareFunction(myName, "make_synchronized_dictionary", "MAKE-SYNCHRONIZED-DICTIONARY", 0, 1, false);
    declareFunction(myName, "new_synchronized_dictionary", "NEW-SYNCHRONIZED-DICTIONARY", 0, 2, false);
    //declareFunction(myName, "print_synchronized_dictionary", "PRINT-SYNCHRONIZED-DICTIONARY", 3, 0, false);
    declareFunction(myName, "clear_synchronized_dictionary", "CLEAR-SYNCHRONIZED-DICTIONARY", 1, 0, false);
    declareFunction(myName, "synchronized_dictionary_enter", "SYNCHRONIZED-DICTIONARY-ENTER", 3, 0, false);
    declareFunction(myName, "synchronized_dictionary_remove", "SYNCHRONIZED-DICTIONARY-REMOVE", 2, 0, false);
    declareFunction(myName, "synchronized_dictionary_lookup", "SYNCHRONIZED-DICTIONARY-LOOKUP", 2, 1, false);
    //declareFunction(myName, "synchronized_dictionary_push", "SYNCHRONIZED-DICTIONARY-PUSH", 3, 0, false);
    //declareFunction(myName, "synchronized_dictionary_delete_from_value", "SYNCHRONIZED-DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
    declareFunction(myName, "synchronized_dictionary_keys", "SYNCHRONIZED-DICTIONARY-KEYS", 1, 0, false);
    //declareFunction(myName, "test_timings_of_alist_of_size", "TEST-TIMINGS-OF-ALIST-OF-SIZE", 2, 0, false);
    //declareFunction(myName, "test_timings_of_hashtable_of_size", "TEST-TIMINGS-OF-HASHTABLE-OF-SIZE", 2, 0, false);
    //declareFunction(myName, "estimate_optimal_dictionary_watermark", "ESTIMATE-OPTIMAL-DICTIONARY-WATERMARK", 0, 2, false);
    declareFunction(myName, "test_dictionary_key_conflation", "TEST-DICTIONARY-KEY-CONFLATION", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_dictionary_utilities_file() {
    $dictionary_keys_sorter_current_sorting_information$ = defparameter("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*", NIL);
    $sub_dictionary_not_found$ = deflexical("*SUB-DICTIONARY-NOT-FOUND*", maybeDefault( $sym68$_SUB_DICTIONARY_NOT_FOUND_, $sub_dictionary_not_found$, ()-> (Symbols.gensym(UNPROVIDED))));
    $dtp_synchronized_dictionary$ = defconstant("*DTP-SYNCHRONIZED-DICTIONARY*", $sym69$SYNCHRONIZED_DICTIONARY);
    return NIL;
  }

  public static final SubLObject setup_dictionary_utilities_file() {
        utilities_macros.note_funcall_helper_function($sym44$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE);
    generic_testing.define_test_case_table_int($sym46$TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, list(new SubLObject[] {$kw47$TEST, Symbols.symbol_function(EQUAL), $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list53);
    generic_testing.define_test_case_table_int($sym54$TEST_MAP_DICTIONARY_VALUES, list(new SubLObject[] {$kw47$TEST, Symbols.symbol_function(EQUAL), $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list55);
    subl_macro_promotions.declare_defglobal($sym68$_SUB_DICTIONARY_NOT_FOUND_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function($sym76$SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym77$SYNCHRONIZED_DICTIONARY_DICTIONARY, $sym78$_CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY);
    Structures.def_csetf($sym79$SYNCHRONIZED_DICTIONARY_LOCK, $sym80$_CSETF_SYNCHRONIZED_DICTIONARY_LOCK);
    Equality.identity($sym69$SYNCHRONIZED_DICTIONARY);
    generic_testing.define_test_case_table_int($sym92$TEST_DICTIONARY_KEY_CONFLATION, list(new SubLObject[] {$kw47$TEST, NIL, $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list93);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DICTIONARY_P = makeSymbol("DICTIONARY-P");
  public static final SubLString $str1$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");
  public static final SubLSymbol $sym2$DICTIONARY_CONTENTS_P = makeSymbol("DICTIONARY-CONTENTS-P");
  public static final SubLString $str3$Corrupted_dictionary_contents__at = makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");
  public static final SubLString $str4$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");
  public static final SubLSymbol $sym5$STRING__ = makeSymbol("STRING<=");
  public static final SubLSymbol $sym6$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLString $str7$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");
  public static final SubLSymbol $sym8$LISTP = makeSymbol("LISTP");
  public static final SubLString $str9$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");
  public static final SubLString $str10$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");
  public static final SubLString $str11$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");
  public static final SubLString $str12$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");
  public static final SubLSymbol $sym13$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym14$ZEROP = makeSymbol("ZEROP");
  public static final SubLSymbol $sym15$NON_EMPTY_DICTIONARY_P = makeSymbol("NON-EMPTY-DICTIONARY-P");
  public static final SubLSymbol $sym16$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLList $list17 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLList $list18 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("DICT-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));
  public static final SubLSymbol $sym19$DICT_EXPRESSION_VAR = makeUninternedSymbol("DICT-EXPRESSION-VAR");
  public static final SubLSymbol $sym20$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym21$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list22 = list(NIL);
  public static final SubLSymbol $sym23$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym24$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym25$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym26$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym27$NREVERSE = makeSymbol("NREVERSE");
  public static final SubLSymbol $kw28$INPUT = makeKeyword("INPUT");
  public static final SubLList $list29 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("NUMVAR"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list30 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym31$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym32$CINC = makeSymbol("CINC");
  public static final SubLString $str33$_S_____S__ = makeString("~S -> ~S~%");
  public static final SubLString $str34$_S____ = makeString("~S -> ");
  public static final SubLString $str35$_S__ = makeString("~S~%");
  public static final SubLSymbol $sym36$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str37$_csv = makeString(".csv");
  public static final SubLSymbol $kw38$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw39$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $kw40$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol $kw41$CREATE = makeKeyword("CREATE");
  public static final SubLString $str42$_A___A__ = makeString("~A, ~A~%");
  public static final SubLString $str43$_S___S__ = makeString("~S, ~S~%");
  public static final SubLSymbol $sym44$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE = makeSymbol("DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE");
  public static final SubLList $list45 = list(makeSymbol("DICTIONARY"), makeSymbol("PREDICATE"), makeSymbol("KEY"));
  public static final SubLSymbol $sym46$TEST_DICTIONARY_KEYS_SORTED_BY_VALUES = makeSymbol("TEST-DICTIONARY-KEYS-SORTED-BY-VALUES");
  public static final SubLSymbol $kw47$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw48$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw49$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw50$KB = makeKeyword("KB");
  public static final SubLSymbol $kw51$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw52$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list53 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("<")), list(makeString("eins"), makeString("zwei"), makeString("drei"), makeString("vier"), makeString("fuenf"), makeString("sechs"))), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol(">")), list(makeString("six"), makeString("five"), makeString("four"), makeString("three"), makeString("two"), makeString("one"))), list(list(list(list(makeString("un"), ONE_INTEGER), list(makeString("deux"), TWO_INTEGER), list(makeString("trois"), THREE_INTEGER), list(makeString("quatre"), FOUR_INTEGER), list(makeString("cinq"), FIVE_INTEGER), list(makeString("seize"), SIX_INTEGER)), makeSymbol(">"), makeSymbol("FIRST")), list(makeString("seize"), makeString("cinq"), makeString("quatre"), makeString("trois"), makeString("deux"), makeString("un"))));
  public static final SubLSymbol $sym54$TEST_MAP_DICTIONARY_VALUES = makeSymbol("TEST-MAP-DICTIONARY-VALUES");
  public static final SubLList $list55 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("SQUARE"), makeSymbol("=")), makeKeyword("SUCCESS")), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol("SQRT"), makeSymbol("=")), makeKeyword("SUCCESS")));
  public static final SubLString $str56$For_key__A__the_computed_new_valu = makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");
  public static final SubLSymbol $kw57$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym58$_ = makeSymbol(">");
  public static final SubLList $list59 = list(list(makeSymbol("KEY"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list60 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw61$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw62$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym63$VALUE = makeUninternedSymbol("VALUE");
  public static final SubLList $list64 = list(list(makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym65$KEY = makeUninternedSymbol("KEY");
  public static final SubLList $list66 = list(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLString $str67$Overwriting__s_from__s_to__s = makeString("Overwriting ~s from ~s to ~s");
  public static final SubLSymbol $sym68$_SUB_DICTIONARY_NOT_FOUND_ = makeSymbol("*SUB-DICTIONARY-NOT-FOUND*");
  public static final SubLSymbol $sym69$SYNCHRONIZED_DICTIONARY = makeSymbol("SYNCHRONIZED-DICTIONARY");
  public static final SubLSymbol $sym70$SYNCHRONIZED_DICTIONARY_P = makeSymbol("SYNCHRONIZED-DICTIONARY-P");
  public static final SubLList $list71 = list(makeSymbol("DICTIONARY"), makeSymbol("LOCK"));
  public static final SubLList $list72 = list(makeKeyword("DICTIONARY"), makeKeyword("LOCK"));
  public static final SubLList $list73 = list(makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK"));
  public static final SubLList $list74 = list(makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK"));
  public static final SubLSymbol $sym75$PRINT_SYNCHRONIZED_DICTIONARY = makeSymbol("PRINT-SYNCHRONIZED-DICTIONARY");
  public static final SubLSymbol $sym76$SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym77$SYNCHRONIZED_DICTIONARY_DICTIONARY = makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY");
  public static final SubLSymbol $sym78$_CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY = makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY");
  public static final SubLSymbol $sym79$SYNCHRONIZED_DICTIONARY_LOCK = makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK");
  public static final SubLSymbol $sym80$_CSETF_SYNCHRONIZED_DICTIONARY_LOCK = makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK");
  public static final SubLSymbol $kw81$DICTIONARY = makeKeyword("DICTIONARY");
  public static final SubLSymbol $kw82$LOCK = makeKeyword("LOCK");
  public static final SubLString $str83$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str84$Synchronized_Dictionary_Lock = makeString("Synchronized Dictionary Lock");
  public static final SubLString $str85$__ = makeString("#<");
  public static final SubLSymbol $kw86$STREAM = makeKeyword("STREAM");
  public static final SubLString $str87$DICTIONARY___A___LOCK___A__ = makeString("DICTIONARY: ~A ~%LOCK: ~A~%");
  public static final SubLSymbol $kw88$BASE = makeKeyword("BASE");
  public static final SubLInteger $int89$50 = makeInteger(50);
  public static final SubLInteger $int90$3000000 = makeInteger(3000000);
  public static final SubLString $str91$Testing_size__A_ALIST__A_HASHTABL = makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");
  public static final SubLSymbol $sym92$TEST_DICTIONARY_KEY_CONFLATION = makeSymbol("TEST-DICTIONARY-KEY-CONFLATION");
  public static final SubLList $list93 = list(list(list(EQUALP, list(makeString("Sea"), makeString("sea"))), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea")})), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central")})), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea")})), makeKeyword("SUCCESS")));
  public static final SubLSymbol $kw94$PRESENT = makeKeyword("PRESENT");
  public static final SubLString $str95$Expected__A_entries__but_got__A_ = makeString("Expected ~A entries, but got ~A.");

  //// Initializers

  public void declareFunctions() {
    declare_dictionary_utilities_file();
  }

  public void initializeVariables() {
    init_dictionary_utilities_file();
  }

  public void runTopLevelForms() {
    setup_dictionary_utilities_file();
  }

}
