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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class dictionary extends SubLTranslatedFile {

  //// Constructor

  private dictionary() {}
  public static final SubLFile me = new dictionary();
  public static final String myName = "com.cyc.cycjava_1.cycl.dictionary";

  //// Definitions

  @SubL(source = "cycl/dictionary.lisp", position = 1952) 
  private static SubLSymbol $dictionary_high_water_mark$ = null;

  @SubL(source = "cycl/dictionary.lisp", position = 2251) 
  private static SubLSymbol $dictionary_low_water_mark$ = null;

  public static final class $dictionary_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $database; }
    public SubLObject getField3() { return $test; }
    public SubLObject setField2(SubLObject value) { return $database = value; }
    public SubLObject setField3(SubLObject value) { return $test = value; }
    public SubLObject $database = NIL;
    public SubLObject $test = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($dictionary_native.class, $sym0$DICTIONARY, $sym1$DICTIONARY_P, $list3, $list4, new String[] {"$database", "$test"}, $list5, $list6, $sym7$PRINT_DICTIONARY);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static SubLSymbol $dtp_dictionary$ = null;

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject dictionary_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31988");
    return NIL;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject dictionary_p(SubLObject object) {
    return ((object.getClass() == $dictionary_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $dictionary_p$UnaryFunction extends UnaryFunction {
    public $dictionary_p$UnaryFunction() { super(extractFunctionNamed("DICTIONARY-P")); }
    public SubLObject processItem(SubLObject arg1) { return dictionary_p(arg1); }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject dictionary_database(SubLObject object) {
    checkType(object, $sym1$DICTIONARY_P);
    return object.getField2();
  }


  @SubL(source = "cycl/dictionary.lisp", position = 4094) 
  public static final SubLObject dictionary_style_error(SubLObject v_dictionary) {
    return Errors.error($str26$Corrupted_dictionary__unsupported, dictionary_style(v_dictionary));
  }

  

  /** Returns an iterator for DICTIONARY.
   Values returned are tuples of the form (<key> <value>). */
  @SubL(source = "cycl/dictionary.lisp", position = 13777) 
  public static final SubLObject new_dictionary_iterator(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return iteration.new_alist_iterator(database);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return iteration.new_hash_table_iterator(database);
      } else {
        return dictionary_style_error(v_dictionary);
      }
    }
  }

  
  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject dictionary_test(SubLObject object) {
    checkType(object, $sym1$DICTIONARY_P);
    return object.getField3();
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject _csetf_dictionary_database(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DICTIONARY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject _csetf_dictionary_test(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DICTIONARY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 2559) 
  public static final SubLObject make_dictionary(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $dictionary_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw13$DATABASE)) {
            _csetf_dictionary_database(v_new, current_value);
          } else if (pcase_var.eql($kw14$TEST)) {
            _csetf_dictionary_test(v_new, current_value);
          } else {
            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return the current style of dictionary database DICTIONARY-DATABASE
   @return type-symbol. */
  @SubL(source = "cycl/dictionary.lisp", position = 3487) 
  public static final SubLObject dictionary_database_style(SubLObject dictionary_database) {
    if (dictionary_database.isList()) {
      return $kw23$ALIST;
    } else if (dictionary_database.isHashtable()) {
      return $kw24$HASHTABLE;
    } else {
      return $kw25$UNKNOWN;
    }
  }

  /** Return the current style of dictionary DICTIONARY
   @return type-symbol. */
  @SubL(source = "cycl/dictionary.lisp", position = 3824) 
  public static final SubLObject dictionary_style(SubLObject v_dictionary) {
    return dictionary_database_style(dictionary_database(v_dictionary));
  }

  @SubL(source = "cycl/dictionary.lisp", position = 4601) 
  public static final SubLObject dictionary_empty_alist_style(SubLObject v_dictionary, SubLObject alist) {
    return Types.sublisp_null(alist);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 4710) 
  public static final SubLObject dictionary_size_alist_style(SubLObject v_dictionary, SubLObject alist) {
    return Sequences.length(alist);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 4820) 
  public static final SubLObject dictionary_lookup_alist_style(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject not_found) {
    {
      SubLObject test = dictionary_test(v_dictionary);
      return list_utilities.alist_lookup(alist, key, test, not_found);
    }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 4998) 
  public static final SubLObject dictionary_lookup_without_values_alist_style(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject not_found) {
    {
      SubLObject test = dictionary_test(v_dictionary);
      return list_utilities.alist_lookup_without_values(alist, key, test, not_found);
    }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 5252) 
  public static final SubLObject dictionary_enter_alist_style(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject test = dictionary_test(v_dictionary);
        thread.resetMultipleValues();
        {
          SubLObject new_alist = list_utilities.alist_enter(alist, key, value, test);
          SubLObject replacement_p = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL == replacement_p)) {
            _csetf_dictionary_database(v_dictionary, new_alist);
            if (dictionary_length(v_dictionary).numG($dictionary_high_water_mark$.getGlobalValue())) {
              make_hashtable_dictionary_from_alist(v_dictionary, new_alist);
            }
          }
        }
      }
      return key;
    }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 5719) 
  public static final SubLObject dictionary_remove_alist_style(SubLObject v_dictionary, SubLObject alist, SubLObject key) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject test = dictionary_test(v_dictionary);
        thread.resetMultipleValues();
        {
          SubLObject new_alist = list_utilities.alist_delete(alist, key, test);
          SubLObject removed_p = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != removed_p)) {
            _csetf_dictionary_database(v_dictionary, new_alist);
          }
        }
      }
      return key;
    }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 6005) 
  public static final SubLObject dictionary_optimize_alist_style(SubLObject v_dictionary, SubLObject alist, SubLObject predicate) {
    {
      SubLObject new_database = list_utilities.alist_optimize(alist, predicate);
      _csetf_dictionary_database(v_dictionary, new_database);
    }
    return v_dictionary;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 6220) 
  public static final SubLObject make_hashtable_dictionary_from_alist(SubLObject v_dictionary, SubLObject old_database) {
    {
      SubLObject test = dictionary_test(v_dictionary);
      SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
      _csetf_dictionary_database(v_dictionary, new_database);
    }
    return v_dictionary;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 6872) 
  public static final SubLObject dictionary_empty_hashtable_style(SubLObject v_dictionary, SubLObject hashtable) {
    return hash_table_utilities.hash_table_empty_p(hashtable);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 7007) 
  public static final SubLObject dictionary_size_hashtable_style(SubLObject v_dictionary, SubLObject hashtable) {
    return Hashtables.hash_table_count(hashtable);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 7139) 
  public static final SubLObject dictionary_lookup_hashtable_style(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash(key, table, not_found);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 7284) 
  public static final SubLObject dictionary_lookup_without_values_hashtable_style(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash_without_values(key, table, not_found);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 7459) 
  public static final SubLObject dictionary_enter_hashtable_style(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject value) {
    Hashtables.sethash(key, table, value);
    return key;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 7609) 
  public static final SubLObject dictionary_remove_hashtable_style(SubLObject v_dictionary, SubLObject table, SubLObject key) {
    {
      SubLObject removed_p = Hashtables.remhash(key, table);
      if ((NIL != removed_p)) {
        if (dictionary_length(v_dictionary).numL($dictionary_low_water_mark$.getGlobalValue())) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31985");
        }
      }
    }
    return key;
  }

  /** Allocate a new dictionary with TEST as the equality test.
  Assume that SIZE elements will likely be immediately added.
  @return dictionary */
  @SubL(source = "cycl/dictionary.lisp", position = 8273) 
  public static final SubLObject new_dictionary(SubLObject test, SubLObject size) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((size == UNPROVIDED)) {
      size = ZERO_INTEGER;
    }
    checkType(test, $sym27$VALID_HASH_TEST_P);
    checkType(size, $sym28$INTEGERP);
    if (test.isSymbol()) {
      test = Symbols.symbol_function(test);
    }
    {
      SubLObject v_dictionary = make_dictionary(UNPROVIDED);
      clear_dictionary(v_dictionary);
      _csetf_dictionary_test(v_dictionary, test);
      if (size.numG($dictionary_high_water_mark$.getGlobalValue())) {
        _csetf_dictionary_database(v_dictionary, Hashtables.make_hash_table(size, test, UNPROVIDED));
      }
      return v_dictionary;
    }
  }

  /** Reset a dictionary to the status of being just allocated.
   @return dictionary */
  @SubL(source = "cycl/dictionary.lisp", position = 9155) 
  public static final SubLObject clear_dictionary(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    _csetf_dictionary_database(v_dictionary, NIL);
    return v_dictionary;
  }

  /** Return the number of items currently indexed in dictionary DICTIONARY.
   @return integerp. */
  @SubL(source = "cycl/dictionary.lisp", position = 9391) 
  public static final SubLObject dictionary_length(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_size_alist_style(v_dictionary, database);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_size_hashtable_style(v_dictionary, database);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31974");
      }
    }
  }

  /** Return T iff DICTIONARY is empty. */
  @SubL(source = "cycl/dictionary.lisp", position = 10088) 
  public static final SubLObject dictionary_empty_p(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_empty_alist_style(v_dictionary, database);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_empty_hashtable_style(v_dictionary, database);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31975");
      }
    }
  }

  /** Return the value mapped from KEY in DICTIONARY.
   Return the formal <tt>not-found</tt> if there was no entry.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/dictionary.lisp", position = 10725) 
  public static final SubLObject dictionary_lookup(SubLObject v_dictionary, SubLObject key, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_lookup_alist_style(v_dictionary, database, key, not_found);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_lookup_hashtable_style(v_dictionary, database, key, not_found);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31976");
      }
    }
  }

  /** Return the value mapped from KEY in DICTIONARY.
   Return the formal <tt>not-found</tt> if there was no entry.
   Unlike DICTIONARY-LOOKUP, only 1 value is returned. */
  @SubL(source = "cycl/dictionary.lisp", position = 11382) 
  public static final SubLObject dictionary_lookup_without_values(SubLObject v_dictionary, SubLObject key, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_lookup_without_values_alist_style(v_dictionary, database, key, not_found);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_lookup_without_values_hashtable_style(v_dictionary, database, key, not_found);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31977");
      }
    }
  }

  /** Note that KEY maps to VALUE in DICTIONARY.
   @return key */
  @SubL(source = "cycl/dictionary.lisp", position = 12059) 
  public static final SubLObject dictionary_enter(SubLObject v_dictionary, SubLObject key, SubLObject value) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_enter_alist_style(v_dictionary, database, key, value);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_enter_hashtable_style(v_dictionary, database, key, value);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31978");
      }
    }
  }

  /** Remove any mapping for KEY in DICTIONARY.
   @return key iff found, else NIL */
  @SubL(source = "cycl/dictionary.lisp", position = 12607) 
  public static final SubLObject dictionary_remove(SubLObject v_dictionary, SubLObject key) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_remove_alist_style(v_dictionary, database, key);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return dictionary_remove_hashtable_style(v_dictionary, database, key);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31979");
      }
    }
  }

  /** Optimize the keys of DICTIONARY for access based on the preference function PREDICATE.
   PREDICATE is a method with a signature (KEY1 KEY2) and returns T iff
   KEY1 is preferred over KEY2.
   @return DICTIONARY */
  @SubL(source = "cycl/dictionary.lisp", position = 13110) 
  public static final SubLObject dictionary_optimize(SubLObject v_dictionary, SubLObject predicate) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return dictionary_optimize_alist_style(v_dictionary, database, predicate);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31973");
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31980");
      }
    }
  }

  /** Return the contents of the dictionary.
   @return (or alist-p hash-table-p) */
  @SubL(source = "cycl/dictionary.lisp", position = 14870) 
  public static final SubLObject dictionary_contents(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    return dictionary_database(v_dictionary);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 16616) 
  private static SubLSymbol $cfasl_opcode_dictionary$ = null;

  @SubL(source = "cycl/dictionary.lisp", position = 17270) 
  public static final SubLObject cfasl_input_dictionary(SubLObject stream) {
    {
      SubLObject test = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject size = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject v_dictionary = NIL;
      {
        SubLObject pcase_var = test;
        if ((pcase_var.eql(EQ)
            || pcase_var.eql(EQL)
            || pcase_var.eql(EQUAL)
            || pcase_var.eql(EQUALP))) {
          test = Symbols.symbol_function(test);
        }
      }
      v_dictionary = new_dictionary(test, size);
      {
        SubLObject pcase_var = dictionary_style(v_dictionary);
        if (pcase_var.eql($kw23$ALIST)) {
          cfasl_input_dictionary_content_alist_style(v_dictionary, size, stream);
        } else if (pcase_var.eql($kw24$HASHTABLE)) {
          cfasl_input_dictionary_content_hashtable_style(v_dictionary, size, stream);
        } else {
          cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
        }
      }
      return v_dictionary;
    }
  }

  public static final class $cfasl_input_dictionary$UnaryFunction extends UnaryFunction {
    public $cfasl_input_dictionary$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-DICTIONARY")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_dictionary(arg1); }
  }

  @SubL(source = "cycl/dictionary.lisp", position = 18067) 
  public static final SubLObject cfasl_input_dictionary_content_alist_style(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
    {
      SubLObject database = NIL;
      database = ConsesLow.make_list(size, NIL);
      {
        SubLObject cons = NIL;
        for (cons = database; (!(cons.isAtom())); cons = cons.rest()) {
          {
            SubLObject key = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject value = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject association = NIL;
            association = cons(key, value);
            ConsesLow.rplaca(cons, association);
          }
        }
      }
      _csetf_dictionary_database(v_dictionary, database);
    }
    return v_dictionary;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 18591) 
  public static final SubLObject cfasl_input_dictionary_content_hashtable_style(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
    return cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
  }

  @SubL(source = "cycl/dictionary.lisp", position = 18755) 
  public static final SubLObject cfasl_input_dictionary_content_logically(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
    {
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(size); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject key = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          SubLObject value = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          dictionary_enter(v_dictionary, key, value);
        }
      }
    }
    return v_dictionary;
  }

  @SubL(source = "cycl/dictionary.lisp", position = 19008) 
  private static SubLSymbol $cfasl_opcode_legacy_dictionary$ = null;

  /** @param DICT dictionary; @return list; a list of all keys of DICT
   @owner aldag */
  @SubL(source = "cycl/dictionary.lisp", position = 19609) 
  public static final SubLObject dictionary_keys(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return list_utilities.alist_keys(database);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return hash_table_utilities.hash_table_keys(database);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31982");
      }
    }
  }

  /** @param DICTIONARY dictionary; @return list; a list of all values of DICTIONARY
   @owner aldag */
  @SubL(source = "cycl/dictionary.lisp", position = 20357) 
  public static final SubLObject dictionary_values(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return list_utilities.alist_values(database);
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8882");
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31983");
      }
    }
  }

  /** Rehashes a dictionary if its contents is hashtable style
   @owner pace */
  @SubL(source = "cycl/dictionary.lisp", position = 20816) 
  public static final SubLObject dictionary_rebuild(SubLObject v_dictionary) {
    checkType(v_dictionary, $sym1$DICTIONARY_P);
    {
      SubLObject database = dictionary_database(v_dictionary);
      SubLObject pcase_var = dictionary_database_style(database);
      if (pcase_var.eql($kw23$ALIST)) {
        return v_dictionary;
      } else if (pcase_var.eql($kw24$HASHTABLE)) {
        hash_table_utilities.rehash(database);
        return v_dictionary;
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31984");
      }
    }
  }

  public static final SubLObject declare_dictionary_file() {
    declareFunction(myName, "dictionary_print_function_trampoline", "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "dictionary_p", "DICTIONARY-P", 1, 0, false); new $dictionary_p$UnaryFunction();
    declareFunction(myName, "dictionary_database", "DICTIONARY-DATABASE", 1, 0, false);
    declareFunction(myName, "dictionary_test", "DICTIONARY-TEST", 1, 0, false);
    declareFunction(myName, "_csetf_dictionary_database", "_CSETF-DICTIONARY-DATABASE", 2, 0, false);
    declareFunction(myName, "_csetf_dictionary_test", "_CSETF-DICTIONARY-TEST", 2, 0, false);
    declareFunction(myName, "make_dictionary", "MAKE-DICTIONARY", 0, 1, false);
    declareFunction(myName, "print_dictionary", "PRINT-DICTIONARY", 3, 0, false);
    declareFunction(myName, "dictionary_database_style", "DICTIONARY-DATABASE-STYLE", 1, 0, false);
    declareFunction(myName, "dictionary_style", "DICTIONARY-STYLE", 1, 0, false);
    declareFunction(myName, "dictionary_style_error", "DICTIONARY-STYLE-ERROR", 1, 0, false);
    declareFunction(myName, "dictionary_empty_alist_style", "DICTIONARY-EMPTY-ALIST-STYLE", 2, 0, false);
    declareFunction(myName, "dictionary_size_alist_style", "DICTIONARY-SIZE-ALIST-STYLE", 2, 0, false);
    declareFunction(myName, "dictionary_lookup_alist_style", "DICTIONARY-LOOKUP-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_lookup_without_values_alist_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_enter_alist_style", "DICTIONARY-ENTER-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_remove_alist_style", "DICTIONARY-REMOVE-ALIST-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_optimize_alist_style", "DICTIONARY-OPTIMIZE-ALIST-STYLE", 3, 0, false);
    declareFunction(myName, "make_hashtable_dictionary_from_alist", "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST", 2, 0, false);
    declareFunction(myName, "dictionary_empty_hashtable_style", "DICTIONARY-EMPTY-HASHTABLE-STYLE", 2, 0, false);
    declareFunction(myName, "dictionary_size_hashtable_style", "DICTIONARY-SIZE-HASHTABLE-STYLE", 2, 0, false);
    declareFunction(myName, "dictionary_lookup_hashtable_style", "DICTIONARY-LOOKUP-HASHTABLE-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_lookup_without_values_hashtable_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_enter_hashtable_style", "DICTIONARY-ENTER-HASHTABLE-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_remove_hashtable_style", "DICTIONARY-REMOVE-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_optimize_hashtable_style", "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "make_alist_dictionary_from_hashtable", "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE", 2, 0, false);
    declareFunction(myName, "new_dictionary", "NEW-DICTIONARY", 0, 2, false);
    declareFunction(myName, "clear_dictionary", "CLEAR-DICTIONARY", 1, 0, false);
    declareFunction(myName, "dictionary_length", "DICTIONARY-LENGTH", 1, 0, false);
    declareFunction(myName, "dictionary_empty_p", "DICTIONARY-EMPTY-P", 1, 0, false);
    declareFunction(myName, "non_empty_dictionary_p", "NON-EMPTY-DICTIONARY-P", 1, 0, false);
    declareFunction(myName, "dictionary_lookup", "DICTIONARY-LOOKUP", 2, 1, false);
    declareFunction(myName, "dictionary_lookup_without_values", "DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
    declareFunction(myName, "dictionary_enter", "DICTIONARY-ENTER", 3, 0, false);
    declareFunction(myName, "dictionary_remove", "DICTIONARY-REMOVE", 2, 0, false);
    declareFunction(myName, "dictionary_optimize", "DICTIONARY-OPTIMIZE", 2, 0, false);
    declareFunction(myName, "new_dictionary_iterator", "NEW-DICTIONARY-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_dictionary", "DO-DICTIONARY");
    declareFunction(myName, "dictionary_contents", "DICTIONARY-CONTENTS", 1, 0, false);
    declareMacro(myName, "do_dictionary_progress", "DO-DICTIONARY-PROGRESS");
    declareFunction(myName, "mapdictionary", "MAPDICTIONARY", 2, 0, false);
    declareFunction(myName, "mapdictionary_parameterized", "MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
    declareFunction(myName, "cfasl_output_object_dictionary_method", "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_dictionary", "CFASL-OUTPUT-DICTIONARY", 2, 0, false);
    declareFunction(myName, "cfasl_input_dictionary", "CFASL-INPUT-DICTIONARY", 1, 0, false); new $cfasl_input_dictionary$UnaryFunction();
    declareFunction(myName, "cfasl_input_dictionary_content_alist_style", "CFASL-INPUT-DICTIONARY-CONTENT-ALIST-STYLE", 3, 0, false);
    declareFunction(myName, "cfasl_input_dictionary_content_hashtable_style", "CFASL-INPUT-DICTIONARY-CONTENT-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "cfasl_input_dictionary_content_logically", "CFASL-INPUT-DICTIONARY-CONTENT-LOGICALLY", 3, 0, false);
    declareFunction(myName, "cfasl_input_legacy_dictionary", "CFASL-INPUT-LEGACY-DICTIONARY", 1, 0, false);
    declareFunction(myName, "dictionary_keys", "DICTIONARY-KEYS", 1, 0, false);
    declareFunction(myName, "dictionary_values", "DICTIONARY-VALUES", 1, 0, false);
    declareFunction(myName, "dictionary_rebuild", "DICTIONARY-REBUILD", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_dictionary_file() {
    $dictionary_high_water_mark$ = deflexical("*DICTIONARY-HIGH-WATER-MARK*", TWELVE_INTEGER);
    $dictionary_low_water_mark$ = deflexical("*DICTIONARY-LOW-WATER-MARK*", EIGHT_INTEGER);
    $dtp_dictionary$ = defconstant("*DTP-DICTIONARY*", $sym0$DICTIONARY);
    $cfasl_opcode_dictionary$ = defconstant("*CFASL-OPCODE-DICTIONARY*", $int48$61);
    $cfasl_opcode_legacy_dictionary$ = defconstant("*CFASL-OPCODE-LEGACY-DICTIONARY*", $int51$64);
    return NIL;
  }

  public static final SubLObject setup_dictionary_file() {
    // CVS_ID("Id: dictionary.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$DICTIONARY_DATABASE, $sym10$_CSETF_DICTIONARY_DATABASE);
    Structures.def_csetf($sym11$DICTIONARY_TEST, $sym12$_CSETF_DICTIONARY_TEST);
    Equality.identity($sym0$DICTIONARY);
    access_macros.register_macro_helper($sym31$DICTIONARY_CONTENTS, $sym33$DO_DICTIONARY);
    cfasl.register_cfasl_input_function($cfasl_opcode_dictionary$.getGlobalValue(), $sym49$CFASL_INPUT_DICTIONARY);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym50$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_legacy_dictionary$.getGlobalValue(), $sym52$CFASL_INPUT_LEGACY_DICTIONARY);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DICTIONARY = makeSymbol("DICTIONARY");
  public static final SubLSymbol $sym1$DICTIONARY_P = makeSymbol("DICTIONARY-P");
  public static final SubLInteger $int2$133 = makeInteger(133);
  public static final SubLList $list3 = list(makeSymbol("DATABASE"), makeSymbol("TEST"));
  public static final SubLList $list4 = list(makeKeyword("DATABASE"), makeKeyword("TEST"));
  public static final SubLList $list5 = list(makeSymbol("DICTIONARY-DATABASE"), makeSymbol("DICTIONARY-TEST"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-DICTIONARY-DATABASE"), makeSymbol("_CSETF-DICTIONARY-TEST"));
  public static final SubLSymbol $sym7$PRINT_DICTIONARY = makeSymbol("PRINT-DICTIONARY");
  public static final SubLSymbol $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$DICTIONARY_DATABASE = makeSymbol("DICTIONARY-DATABASE");
  public static final SubLSymbol $sym10$_CSETF_DICTIONARY_DATABASE = makeSymbol("_CSETF-DICTIONARY-DATABASE");
  public static final SubLSymbol $sym11$DICTIONARY_TEST = makeSymbol("DICTIONARY-TEST");
  public static final SubLSymbol $sym12$_CSETF_DICTIONARY_TEST = makeSymbol("_CSETF-DICTIONARY-TEST");
  public static final SubLSymbol $kw13$DATABASE = makeKeyword("DATABASE");
  public static final SubLSymbol $kw14$TEST = makeKeyword("TEST");
  public static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str16$__ = makeString("#<");
  public static final SubLSymbol $kw17$STREAM = makeKeyword("STREAM");
  public static final SubLString $str18$_ = makeString("(");
  public static final SubLString $str19$_ = makeString(" ");
  public static final SubLString $str20$_ = makeString(")");
  public static final SubLString $str21$_size_ = makeString(" size=");
  public static final SubLSymbol $kw22$BASE = makeKeyword("BASE");
  public static final SubLSymbol $kw23$ALIST = makeKeyword("ALIST");
  public static final SubLSymbol $kw24$HASHTABLE = makeKeyword("HASHTABLE");
  public static final SubLSymbol $kw25$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str26$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");
  public static final SubLSymbol $sym27$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym28$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLList $list29 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym30$DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");
  public static final SubLSymbol $sym31$DICTIONARY_CONTENTS = makeSymbol("DICTIONARY-CONTENTS");
  public static final SubLSymbol $kw32$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym33$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list34 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), makeString("Mapping dictionary..."))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list35 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-NOTE"));
  public static final SubLSymbol $kw36$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw37$PROGRESS_NOTE = makeKeyword("PROGRESS-NOTE");
  public static final SubLString $str38$Mapping_dictionary___ = makeString("Mapping dictionary...");
  public static final SubLSymbol $sym39$SO_FAR = makeUninternedSymbol("SO-FAR");
  public static final SubLSymbol $sym40$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym41$CLET = makeSymbol("CLET");
  public static final SubLList $list42 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym43$DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");
  public static final SubLSymbol $sym44$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym45$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym46$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym47$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLInteger $int48$61 = makeInteger(61);
  public static final SubLSymbol $sym49$CFASL_INPUT_DICTIONARY = makeSymbol("CFASL-INPUT-DICTIONARY");
  public static final SubLSymbol $sym50$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD");
  public static final SubLInteger $int51$64 = makeInteger(64);
  public static final SubLSymbol $sym52$CFASL_INPUT_LEGACY_DICTIONARY = makeSymbol("CFASL-INPUT-LEGACY-DICTIONARY");

  //// Initializers

  public void declareFunctions() {
    declare_dictionary_file();
  }

  public void initializeVariables() {
    init_dictionary_file();
  }

  public void runTopLevelForms() {
    setup_dictionary_file();
  }

}
