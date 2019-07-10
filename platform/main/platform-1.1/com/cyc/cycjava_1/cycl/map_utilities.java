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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class map_utilities extends SubLTranslatedFile {

  //// Constructor

  private map_utilities() {}
  public static final SubLFile me = new map_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.map_utilities";

  //// Definitions

  @SubL(source = "cycl/map-utilities.lisp", position = 2250) 
  public static final SubLObject map_p(SubLObject object) {
    return is_map_object_p(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 2371) 
  public static final SubLObject map_size(SubLObject map) {
    return map_object_size(map);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 2497) 
  public static final SubLObject map_empty_p(SubLObject map) {
    return Numbers.zerop(map_size(map));
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 2649) 
  public static final SubLObject map_put(SubLObject map, SubLObject key, SubLObject value) {
    return map_object_put(map, key, value);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 2881) 
  public static final SubLObject map_get_without_values(SubLObject map, SubLObject key, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    return map_object_get_without_values(map, key, not_found);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 3010) 
  public static final SubLObject map_remove(SubLObject map, SubLObject key) {
    return map_object_remove(map, key);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 3233) 
  public static final SubLObject new_map_iterator(SubLObject map) {
    return new_map_object_iterator(map);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 14561) 
  public static SubLSymbol $is_map_object_p_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 14561) 
  public static final SubLObject is_map_object_p(SubLObject object) {
    {
      SubLObject method_function = Structures.method_func(object, $is_map_object_p_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 14723) 
  public static final SubLObject is_map_object_p_dictionary_method(SubLObject object) {
    return T;
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 14788) 
  public static final SubLObject is_map_object_p_hash_table_method(SubLObject object) {
    return T;
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 14853) 
  public static SubLSymbol $map_object_size_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 14853) 
  public static final SubLObject map_object_size(SubLObject object) {
    {
      SubLObject method_function = Structures.method_func(object, $map_object_size_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object);
      }
      return Errors.error($str35$_A_is_not_a_MAP_P_, object);
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 14964) 
  public static final SubLObject map_object_size_dictionary_method(SubLObject object) {
    return dictionary.dictionary_length(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15054) 
  public static final SubLObject map_object_size_hash_table_method(SubLObject object) {
    return Hashtables.hash_table_count(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15143) 
  public static SubLSymbol $map_object_test_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 15252) 
  public static final SubLObject map_object_test_dictionary_method(SubLObject object) {
    return dictionary.dictionary_test(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15340) 
  public static final SubLObject map_object_test_hash_table_method(SubLObject object) {
    return Hashtables.hash_table_test(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15428) 
  public static SubLSymbol $map_object_put_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 15428) 
  public static final SubLObject map_object_put(SubLObject object, SubLObject key, SubLObject value) {
    {
      SubLObject method_function = Structures.method_func(object, $map_object_put_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object, key, value);
      }
      return Errors.error($str35$_A_is_not_a_MAP_P_, object);
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15687) 
  public static final SubLObject map_object_put_hash_table_method(SubLObject object, SubLObject key, SubLObject value) {
    return Hashtables.sethash(key, object, value);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 15786) 
  public static SubLSymbol $map_object_get_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 15945) 
  public static final SubLObject map_object_get_dictionary_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return dictionary.dictionary_lookup(object, key, not_found);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16062) 
  public static final SubLObject map_object_get_hash_table_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash(key, object, not_found);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16169) 
  public static SubLSymbol $map_object_get_without_values_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 16169) 
  public static final SubLObject map_object_get_without_values(SubLObject object, SubLObject key, SubLObject not_found) {
    {
      SubLObject method_function = Structures.method_func(object, $map_object_get_without_values_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object, key, not_found);
      }
      return Errors.error($str35$_A_is_not_a_MAP_P_, object);
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16353) 
  public static final SubLObject map_object_get_without_values_dictionary_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return dictionary.dictionary_lookup_without_values(object, key, not_found);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16500) 
  public static final SubLObject map_object_get_without_values_hash_table_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash_without_values(key, object, not_found);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16637) 
  public static SubLSymbol $map_object_remove_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 16637) 
  public static final SubLObject map_object_remove(SubLObject map, SubLObject key) {
    {
      SubLObject method_function = Structures.method_func(map, $map_object_remove_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, map, key);
      }
      return Errors.error($str35$_A_is_not_a_MAP_P_, map);
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16763) 
  public static final SubLObject map_object_remove_dictionary_method(SubLObject object, SubLObject key) {
    return dictionary.dictionary_remove(object, key);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16863) 
  public static final SubLObject map_object_remove_hash_table_method(SubLObject object, SubLObject key) {
    return Hashtables.remhash(key, object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 16953) 
  public static SubLSymbol $map_object_touch_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 17227) 
  public static SubLSymbol $new_map_object_with_same_properties_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 17420) 
  public static final SubLObject new_map_object_with_same_properties_dictionary_method(SubLObject object, SubLObject test, SubLObject size) {
    return dictionary.new_dictionary(test, size);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 17540) 
  public static final SubLObject new_map_object_with_same_properties_hash_table_method(SubLObject object, SubLObject test, SubLObject size) {
    return Hashtables.make_hash_table(size, test, UNPROVIDED);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 17661) 
  public static SubLSymbol $map_object_arbitrary_key_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 17994) 
  public static SubLSymbol $new_map_object_iterator_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 17994) 
  public static final SubLObject new_map_object_iterator(SubLObject object) {
    {
      SubLObject method_function = Structures.method_func(object, $new_map_object_iterator_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object);
      }
      return Errors.error($str35$_A_is_not_a_MAP_P_, object);
    }
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 18119) 
  public static final SubLObject new_map_object_iterator_dictionary_method(SubLObject object) {
    return dictionary.new_dictionary_iterator(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 18223) 
  public static final SubLObject new_map_object_iterator_hash_table_method(SubLObject object) {
    return iteration.new_hash_table_iterator(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 18327) 
  public static SubLSymbol $map_object_remove_all_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 18448) 
  public static final SubLObject map_object_remove_all_dictionary_method(SubLObject object) {
    return dictionary.clear_dictionary(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 18629) 
  public static SubLSymbol $map_object_keys_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 19045) 
  public static final SubLObject map_object_keys_dictionary_method(SubLObject object) {
    return dictionary.dictionary_keys(object);
  }

  @SubL(source = "cycl/map-utilities.lisp", position = 19222) 
  public static SubLSymbol $map_object_values_method_table$ = null;

  @SubL(source = "cycl/map-utilities.lisp", position = 19745) 
  public static final SubLObject map_object_values_hash_table_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8887");
  }

  /** Tests whether the hash-table correctly conflates keys. */
  @SubL(source = "cycl/map-utilities.lisp", position = 20662) 
  public static final SubLObject test_hash_table_key_conflation(SubLObject test, SubLObject raw_items) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject hash_table = Hashtables.make_hash_table(Sequences.length(raw_items), test, UNPROVIDED);
        SubLObject unique_items = Sequences.remove_duplicates(raw_items, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = NIL;
        for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
          Hashtables.sethash(item, hash_table, $kw68$PRESENT);
        }
        {
          SubLObject expected = Sequences.length(unique_items);
          SubLObject actual = Hashtables.hash_table_count(hash_table);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(expected.numE(actual)))) {
              Errors.error($str69$Expected__A_entries__but_got__A_, expected, actual);
            }
          }
        }
      }
      return $kw70$SUCCESS;
    }
  }

  public static final SubLObject declare_map_utilities_file() {
    declareFunction(myName, "map_p", "MAP-P", 1, 0, false);
    declareFunction(myName, "map_size", "MAP-SIZE", 1, 0, false);
    declareFunction(myName, "map_test", "MAP-TEST", 1, 0, false);
    declareFunction(myName, "map_empty_p", "MAP-EMPTY-P", 1, 0, false);
    declareFunction(myName, "map_test_symbol", "MAP-TEST-SYMBOL", 1, 0, false);
    declareFunction(myName, "map_put", "MAP-PUT", 3, 0, false);
    declareFunction(myName, "map_get", "MAP-GET", 2, 1, false);
    declareFunction(myName, "map_get_without_values", "MAP-GET-WITHOUT-VALUES", 2, 1, false);
    declareFunction(myName, "map_remove", "MAP-REMOVE", 2, 0, false);
    declareFunction(myName, "map_remove_all", "MAP-REMOVE-ALL", 1, 0, false);
    declareFunction(myName, "map_touch", "MAP-TOUCH", 2, 0, false);
    declareFunction(myName, "new_map_iterator", "NEW-MAP-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_map", "DO-MAP");
    declareFunction(myName, "new_map_with_same_properties", "NEW-MAP-WITH-SAME-PROPERTIES", 1, 0, false);
    declareFunction(myName, "clone_map", "CLONE-MAP", 1, 1, false);
    declareFunction(myName, "map_arbitrary_key", "MAP-ARBITRARY-KEY", 1, 1, false);
    declareFunction(myName, "map_arbitrary_value", "MAP-ARBITRARY-VALUE", 1, 1, false);
    declareFunction(myName, "map_keys", "MAP-KEYS", 1, 0, false);
    declareFunction(myName, "map_values", "MAP-VALUES", 1, 0, false);
    declareFunction(myName, "map_has_keyP", "MAP-HAS-KEY?", 2, 0, false);
    declareFunction(myName, "map_push", "MAP-PUSH", 3, 0, false);
    declareFunction(myName, "map_pushnew", "MAP-PUSHNEW", 3, 2, false);
    declareFunction(myName, "map_increment", "MAP-INCREMENT", 2, 1, false);
    declareFunction(myName, "map_decrement", "MAP-DECREMENT", 2, 1, false);
    declareFunction(myName, "reverse_index_map", "REVERSE-INDEX-MAP", 2, 2, false);
    declareFunction(myName, "store_in_reverse_index_map", "STORE-IN-REVERSE-INDEX-MAP", 4, 0, false);
    declareFunction(myName, "store_or_collate_in_map", "STORE-OR-COLLATE-IN-MAP", 4, 0, false);
    declareFunction(myName, "filter_map_values", "FILTER-MAP-VALUES", 1, 1, false);
    declareFunction(myName, "map_remove_if_not_value", "MAP-REMOVE-IF-NOT-VALUE", 1, 1, false);
    declareFunction(myName, "map_remove_keys", "MAP-REMOVE-KEYS", 2, 0, false);
    declareFunction(myName, "map_sample_from_map", "MAP-SAMPLE-FROM-MAP", 2, 1, false);
    declareFunction(myName, "maps_differ_in_keys", "MAPS-DIFFER-IN-KEYS", 2, 0, false);
    declareFunction(myName, "maps_differ_in_values", "MAPS-DIFFER-IN-VALUES", 2, 1, false);
    declareFunction(myName, "map_map_values", "MAP-MAP-VALUES", 2, 0, false);
    declareFunction(myName, "map_change_values", "MAP-CHANGE-VALUES", 2, 0, false);
    declareFunction(myName, "map_to_dictionary", "MAP-TO-DICTIONARY", 1, 0, false);
    declareFunction(myName, "map_to_hash_table", "MAP-TO-HASH-TABLE", 1, 0, false);
    declareFunction(myName, "copy_map", "COPY-MAP", 2, 1, false);
    declareFunction(myName, "is_map_object_p", "IS-MAP-OBJECT-P", 1, 0, false);
    declareFunction(myName, "is_map_object_p_dictionary_method", "IS-MAP-OBJECT-P-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "is_map_object_p_hash_table_method", "IS-MAP-OBJECT-P-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_size", "MAP-OBJECT-SIZE", 1, 0, false);
    declareFunction(myName, "map_object_size_dictionary_method", "MAP-OBJECT-SIZE-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_size_hash_table_method", "MAP-OBJECT-SIZE-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_test", "MAP-OBJECT-TEST", 1, 0, false);
    declareFunction(myName, "map_object_test_dictionary_method", "MAP-OBJECT-TEST-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_test_hash_table_method", "MAP-OBJECT-TEST-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_put", "MAP-OBJECT-PUT", 3, 0, false);
    declareFunction(myName, "map_object_put_dictionary_method", "MAP-OBJECT-PUT-DICTIONARY-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_put_hash_table_method", "MAP-OBJECT-PUT-HASH-TABLE-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_get", "MAP-OBJECT-GET", 3, 0, false);
    declareFunction(myName, "map_object_get_dictionary_method", "MAP-OBJECT-GET-DICTIONARY-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_get_hash_table_method", "MAP-OBJECT-GET-HASH-TABLE-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_get_without_values", "MAP-OBJECT-GET-WITHOUT-VALUES", 3, 0, false);
    declareFunction(myName, "map_object_get_without_values_dictionary_method", "MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_get_without_values_hash_table_method", "MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_remove", "MAP-OBJECT-REMOVE", 2, 0, false);
    declareFunction(myName, "map_object_remove_dictionary_method", "MAP-OBJECT-REMOVE-DICTIONARY-METHOD", 2, 0, false);
    declareFunction(myName, "map_object_remove_hash_table_method", "MAP-OBJECT-REMOVE-HASH-TABLE-METHOD", 2, 0, false);
    declareFunction(myName, "map_object_touch", "MAP-OBJECT-TOUCH", 2, 0, false);
    declareFunction(myName, "new_map_object_with_same_properties", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES", 3, 0, false);
    declareFunction(myName, "new_map_object_with_same_properties_dictionary_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD", 3, 0, false);
    declareFunction(myName, "new_map_object_with_same_properties_hash_table_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD", 3, 0, false);
    declareFunction(myName, "map_object_arbitrary_key", "MAP-OBJECT-ARBITRARY-KEY", 1, 0, false);
    declareFunction(myName, "map_object_arbitrary_key_dictionary_method", "MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_arbitrary_key_hash_table_method", "MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "new_map_object_iterator", "NEW-MAP-OBJECT-ITERATOR", 1, 0, false);
    declareFunction(myName, "new_map_object_iterator_dictionary_method", "NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "new_map_object_iterator_hash_table_method", "NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_remove_all", "MAP-OBJECT-REMOVE-ALL", 1, 0, false);
    declareFunction(myName, "map_object_remove_all_dictionary_method", "MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_remove_all_hash_table_method", "MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_keys", "MAP-OBJECT-KEYS", 1, 0, false);
    declareFunction(myName, "map_keys_via_do_map", "MAP-KEYS-VIA-DO-MAP", 1, 0, false);
    declareFunction(myName, "map_object_keys_dictionary_method", "MAP-OBJECT-KEYS-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_keys_hash_table_method", "MAP-OBJECT-KEYS-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_values", "MAP-OBJECT-VALUES", 1, 0, false);
    declareFunction(myName, "map_values_via_do_map", "MAP-VALUES-VIA-DO-MAP", 1, 0, false);
    declareFunction(myName, "map_object_values_dictionary_method", "MAP-OBJECT-VALUES-DICTIONARY-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_values_hash_table_method", "MAP-OBJECT-VALUES-HASH-TABLE-METHOD", 1, 0, false);
    declareFunction(myName, "test_hash_table_key_conflation", "TEST-HASH-TABLE-KEY-CONFLATION", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_map_utilities_file() {
    $is_map_object_p_method_table$ = deflexical("*IS-MAP-OBJECT-P-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_size_method_table$ = deflexical("*MAP-OBJECT-SIZE-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_test_method_table$ = deflexical("*MAP-OBJECT-TEST-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_put_method_table$ = deflexical("*MAP-OBJECT-PUT-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_get_method_table$ = deflexical("*MAP-OBJECT-GET-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_get_without_values_method_table$ = deflexical("*MAP-OBJECT-GET-WITHOUT-VALUES-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_remove_method_table$ = deflexical("*MAP-OBJECT-REMOVE-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_touch_method_table$ = deflexical("*MAP-OBJECT-TOUCH-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $new_map_object_with_same_properties_method_table$ = deflexical("*NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_arbitrary_key_method_table$ = deflexical("*MAP-OBJECT-ARBITRARY-KEY-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $new_map_object_iterator_method_table$ = deflexical("*NEW-MAP-OBJECT-ITERATOR-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_remove_all_method_table$ = deflexical("*MAP-OBJECT-REMOVE-ALL-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_keys_method_table$ = deflexical("*MAP-OBJECT-KEYS-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    $map_object_values_method_table$ = deflexical("*MAP-OBJECT-VALUES-METHOD-TABLE*", Vectors.make_vector($int32$256, NIL));
    return NIL;
  }

  public static final SubLObject setup_map_utilities_file() {
    // CVS_ID("Id: map-utilities.lisp 128869 2009-10-01 02:11:06Z rck ");
    Structures.register_method($is_map_object_p_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym33$IS_MAP_OBJECT_P_DICTIONARY_METHOD));
    Structures.register_method($is_map_object_p_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym34$IS_MAP_OBJECT_P_HASH_TABLE_METHOD));
    Structures.register_method($map_object_size_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym36$MAP_OBJECT_SIZE_DICTIONARY_METHOD));
    Structures.register_method($map_object_size_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym37$MAP_OBJECT_SIZE_HASH_TABLE_METHOD));
    Structures.register_method($map_object_test_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym38$MAP_OBJECT_TEST_DICTIONARY_METHOD));
    Structures.register_method($map_object_test_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym39$MAP_OBJECT_TEST_HASH_TABLE_METHOD));
    Structures.register_method($map_object_put_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym40$MAP_OBJECT_PUT_DICTIONARY_METHOD));
    Structures.register_method($map_object_put_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym41$MAP_OBJECT_PUT_HASH_TABLE_METHOD));
    Structures.register_method($map_object_get_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym42$MAP_OBJECT_GET_DICTIONARY_METHOD));
    Structures.register_method($map_object_get_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym43$MAP_OBJECT_GET_HASH_TABLE_METHOD));
    Structures.register_method($map_object_get_without_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym44$MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD));
    Structures.register_method($map_object_get_without_values_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym45$MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD));
    Structures.register_method($map_object_remove_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym46$MAP_OBJECT_REMOVE_DICTIONARY_METHOD));
    Structures.register_method($map_object_remove_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym47$MAP_OBJECT_REMOVE_HASH_TABLE_METHOD));
    Structures.register_method($new_map_object_with_same_properties_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym48$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD));
    Structures.register_method($new_map_object_with_same_properties_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym49$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD));
    Structures.register_method($map_object_arbitrary_key_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym50$MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD));
    Structures.register_method($map_object_arbitrary_key_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym51$MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD));
    Structures.register_method($new_map_object_iterator_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym52$NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD));
    Structures.register_method($new_map_object_iterator_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym53$NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD));
    Structures.register_method($map_object_remove_all_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym54$MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD));
    Structures.register_method($map_object_remove_all_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym55$MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD));
    Structures.register_method($map_object_keys_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym56$MAP_OBJECT_KEYS_DICTIONARY_METHOD));
    Structures.register_method($map_object_keys_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym57$MAP_OBJECT_KEYS_HASH_TABLE_METHOD));
    Structures.register_method($map_object_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function($sym58$MAP_OBJECT_VALUES_DICTIONARY_METHOD));
    Structures.register_method($map_object_values_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym59$MAP_OBJECT_VALUES_HASH_TABLE_METHOD));
    generic_testing.define_test_case_table_int($sym60$TEST_HASH_TABLE_KEY_CONFLATION, list(new SubLObject[] {$kw61$TEST, NIL, $kw62$OWNER, NIL, $kw63$CLASSES, NIL, $kw64$KB, $kw65$TINY, $kw66$WORKING_, T}), $list67);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MAP"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw4$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym5$VAR = makeUninternedSymbol("VAR");
  public static final SubLSymbol $sym6$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym8$NEW_MAP_ITERATOR = makeSymbol("NEW-MAP-ITERATOR");
  public static final SubLSymbol $sym9$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym10$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym11$THE_MAP = makeUninternedSymbol("THE-MAP");
  public static final SubLSymbol $sym12$MESS = makeUninternedSymbol("MESS");
  public static final SubLSymbol $sym13$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym14$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLList $list15 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym16$MAP_SIZE = makeSymbol("MAP-SIZE");
  public static final SubLSymbol $sym17$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list18 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym19$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym20$DO_MAP = makeSymbol("DO-MAP");
  public static final SubLSymbol $sym21$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym22$CINC = makeSymbol("CINC");
  public static final SubLList $list23 = list(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym24$MAP_P = makeSymbol("MAP-P");
  public static final SubLString $str25$Invalid_map_format__Attempting_to = makeString("Invalid map format: Attempting to push values on a non listp ~a.~%");
  public static final SubLSymbol $sym26$FALSE = makeSymbol("FALSE");
  public static final SubLInteger $int27$100 = makeInteger(100);
  public static final SubLString $str28$Error__percentage__A_is_not_one_o = makeString("Error, percentage ~A is not one of 0-100 or 0-1.");
  public static final SubLString $str29$Cannot_compute_key_differences_in = makeString("Cannot compute key differences in the face of unclear key equality.");
  public static final SubLList $list30 = list(makeSymbol("KEY"), makeSymbol("OLD-VALUE"));
  public static final SubLList $list31 = list(makeSymbol("KEY"), makeSymbol("VAL"));
  public static final SubLInteger $int32$256 = makeInteger(256);
  public static final SubLSymbol $sym33$IS_MAP_OBJECT_P_DICTIONARY_METHOD = makeSymbol("IS-MAP-OBJECT-P-DICTIONARY-METHOD");
  public static final SubLSymbol $sym34$IS_MAP_OBJECT_P_HASH_TABLE_METHOD = makeSymbol("IS-MAP-OBJECT-P-HASH-TABLE-METHOD");
  public static final SubLString $str35$_A_is_not_a_MAP_P_ = makeString("~A is not a MAP-P.");
  public static final SubLSymbol $sym36$MAP_OBJECT_SIZE_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-SIZE-DICTIONARY-METHOD");
  public static final SubLSymbol $sym37$MAP_OBJECT_SIZE_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-SIZE-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym38$MAP_OBJECT_TEST_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-TEST-DICTIONARY-METHOD");
  public static final SubLSymbol $sym39$MAP_OBJECT_TEST_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-TEST-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym40$MAP_OBJECT_PUT_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-PUT-DICTIONARY-METHOD");
  public static final SubLSymbol $sym41$MAP_OBJECT_PUT_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-PUT-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym42$MAP_OBJECT_GET_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-DICTIONARY-METHOD");
  public static final SubLSymbol $sym43$MAP_OBJECT_GET_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-GET-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym44$MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD");
  public static final SubLSymbol $sym45$MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym46$MAP_OBJECT_REMOVE_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-DICTIONARY-METHOD");
  public static final SubLSymbol $sym47$MAP_OBJECT_REMOVE_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-REMOVE-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym48$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD");
  public static final SubLSymbol $sym49$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym50$MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD");
  public static final SubLSymbol $sym51$MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym52$NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD");
  public static final SubLSymbol $sym53$NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym54$MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD");
  public static final SubLSymbol $sym55$MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym56$MAP_OBJECT_KEYS_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-KEYS-DICTIONARY-METHOD");
  public static final SubLSymbol $sym57$MAP_OBJECT_KEYS_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-KEYS-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym58$MAP_OBJECT_VALUES_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-VALUES-DICTIONARY-METHOD");
  public static final SubLSymbol $sym59$MAP_OBJECT_VALUES_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-VALUES-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym60$TEST_HASH_TABLE_KEY_CONFLATION = makeSymbol("TEST-HASH-TABLE-KEY-CONFLATION");
  public static final SubLSymbol $kw61$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw62$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw63$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw64$KB = makeKeyword("KB");
  public static final SubLSymbol $kw65$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw66$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list67 = list(list(list(EQUALP, list(makeString("Sea"), makeString("sea"))), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea")})), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central")})), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[] {makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea")})), makeKeyword("SUCCESS")));
  public static final SubLSymbol $kw68$PRESENT = makeKeyword("PRESENT");
  public static final SubLString $str69$Expected__A_entries__but_got__A_ = makeString("Expected ~A entries, but got ~A.");
  public static final SubLSymbol $kw70$SUCCESS = makeKeyword("SUCCESS");

  //// Initializers

  public void declareFunctions() {
    declare_map_utilities_file();
  }

  public void initializeVariables() {
    init_map_utilities_file();
  }

  public void runTopLevelForms() {
    setup_map_utilities_file();
  }

}
