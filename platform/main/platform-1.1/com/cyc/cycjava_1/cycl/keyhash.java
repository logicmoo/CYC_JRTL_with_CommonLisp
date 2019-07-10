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
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class keyhash extends SubLTranslatedFile {

  //// Constructor

  private keyhash() {}
  public static final SubLFile me = new keyhash();
  public static final String myName = "com.cyc.cycjava_1.cycl.keyhash";

  //// Definitions

  public static final class $keyhash_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $nodes; }
    public SubLObject getField3() { return $test; }
    public SubLObject getField4() { return $count; }
    public SubLObject getField5() { return $hash_stash; }
    public SubLObject setField2(SubLObject value) { return $nodes = value; }
    public SubLObject setField3(SubLObject value) { return $test = value; }
    public SubLObject setField4(SubLObject value) { return $count = value; }
    public SubLObject setField5(SubLObject value) { return $hash_stash = value; }
    public SubLObject $nodes = NIL;
    public SubLObject $test = NIL;
    public SubLObject $count = NIL;
    public SubLObject $hash_stash = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($keyhash_native.class, $sym0$KEYHASH, $sym1$KEYHASH_P, $list3, $list4, new String[] {"$nodes", "$test", "$count", "$hash_stash"}, $list5, $list6, $sym7$PRINT_KEY_HASH);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static SubLSymbol $dtp_keyhash$ = null;

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject keyhash_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31684");
    return NIL;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject keyhash_p(SubLObject object) {
    return ((object.getClass() == $keyhash_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $keyhash_p$UnaryFunction extends UnaryFunction {
    public $keyhash_p$UnaryFunction() { super(extractFunctionNamed("KEYHASH-P")); }
    public SubLObject processItem(SubLObject arg1) { return keyhash_p(arg1); }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject khash_nodes(SubLObject object) {
    checkType(object, $sym1$KEYHASH_P);
    return object.getField2();
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject khash_test(SubLObject object) {
    checkType(object, $sym1$KEYHASH_P);
    return object.getField3();
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject khash_count(SubLObject object) {
    checkType(object, $sym1$KEYHASH_P);
    return object.getField4();
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject khash_hash_stash(SubLObject object) {
    checkType(object, $sym1$KEYHASH_P);
    return object.getField5();
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject _csetf_khash_nodes(SubLObject object, SubLObject value) {
    checkType(object, $sym1$KEYHASH_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject _csetf_khash_test(SubLObject object, SubLObject value) {
    checkType(object, $sym1$KEYHASH_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject _csetf_khash_count(SubLObject object, SubLObject value) {
    checkType(object, $sym1$KEYHASH_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject _csetf_khash_hash_stash(SubLObject object, SubLObject value) {
    checkType(object, $sym1$KEYHASH_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 2339) 
  public static final SubLObject make_keyhash(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $keyhash_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw17$NODES)) {
            _csetf_khash_nodes(v_new, current_value);
          } else if (pcase_var.eql($kw18$TEST)) {
            _csetf_khash_test(v_new, current_value);
          } else if (pcase_var.eql($kw19$COUNT)) {
            _csetf_khash_count(v_new, current_value);
          } else if (pcase_var.eql($kw20$HASH_STASH)) {
            _csetf_khash_hash_stash(v_new, current_value);
          } else {
            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 3202) 
  public static final SubLObject keyhash_capacity_internal(SubLObject v_keyhash) {
    return Sequences.length(khash_nodes(v_keyhash));
  }

  /** The constant A -- see Donald E. Knuth's dicussion of the hash algorithm for details. */
  @SubL(source = "cycl/keyhash.lisp", position = 3295) 
  private static SubLSymbol $keyhash_a$ = null;

  /** The step size during collision resolution -- see Donald E. Knuth's discussion of the hash algorithm for details. */
  @SubL(source = "cycl/keyhash.lisp", position = 3456) 
  private static SubLSymbol $keyhash_step$ = null;

  @SubL(source = "cycl/keyhash.lisp", position = 3613) 
  private static SubLSymbol $keyhash_empty_key$ = null;

  @SubL(source = "cycl/keyhash.lisp", position = 3692) 
  private static SubLSymbol $keyhash_empty_hash$ = null;

  /** Compute the sizes and the respective grow sizes, and return that as an
   association list of size - grow-size tupplies. */
  @SubL(source = "cycl/keyhash.lisp", position = 3920) 
  public static final SubLObject compute_keyhash_grow_sizes(SubLObject lower_bound, SubLObject upper_bound) {
    {
      SubLObject start = Numbers.ceiling(Numbers.log(lower_bound, TWO_INTEGER), UNPROVIDED);
      SubLObject top = Numbers.ceiling(Numbers.log(upper_bound, TWO_INTEGER), UNPROVIDED);
      SubLObject iterations = Numbers.subtract(top, start);
      SubLObject size = Numbers.expt(TWO_INTEGER, start);
      SubLObject sizes = NIL;
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(iterations); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject grow_size = Numbers.integerDivide(Numbers.multiply(size, FOUR_INTEGER), FIVE_INTEGER);
          sizes = conses_high.acons(size, grow_size, sizes);
          size = Numbers.add(size, size);
        }
      }
      return Sequences.nreverse(sizes);
    }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 4513) 
  private static SubLSymbol $keyhash_grow_sizes$ = null;

  /** We assume that no hash-table can be bigger than the most-positive-fixnum. */
  @SubL(source = "cycl/keyhash.lisp", position = 4628) 
  public static final SubLObject compute_keyhash_capacity(SubLObject initial_size) {
    {
      SubLObject size = Numbers.integerDivide(Numbers.multiply(initial_size, FOUR_INTEGER), THREE_INTEGER);
      SubLObject final_size = NIL;
      SubLObject doneP = NIL;
      if ((NIL == doneP)) {
        {
          SubLObject csome_list_var = $keyhash_grow_sizes$.getGlobalValue();
          SubLObject tuple = NIL;
          for (tuple = csome_list_var.first(); (!(((NIL != doneP)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), tuple = csome_list_var.first()) {
            {
              SubLObject datum = tuple;
              SubLObject current = datum;
              SubLObject table_size = NIL;
              SubLObject grow_size = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
              table_size = current.first();
              current = current.rest();
              grow_size = current;
              final_size = table_size;
              doneP = Numbers.numL(size, table_size);
            }
          }
        }
      }
      return final_size;
    }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 5078) 
  public static final SubLObject keyhash_table_size_limit_tuple() {
    return conses_high.last($keyhash_grow_sizes$.getGlobalValue(), UNPROVIDED).first();
  }

  @SubL(source = "cycl/keyhash.lisp", position = 5278) 
  public static final SubLObject keyhash_allocate(SubLObject v_keyhash, SubLObject proposed_size) {
    {
      SubLObject capacity = compute_keyhash_capacity(proposed_size);
      keyhash_allocate_nodes(v_keyhash, capacity);
      _csetf_khash_count(v_keyhash, ZERO_INTEGER);
    }
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 5498) 
  public static final SubLObject keyhash_allocate_nodes(SubLObject v_keyhash, SubLObject capacity) {
    _csetf_khash_nodes(v_keyhash, Vectors.make_vector(capacity, $keyhash_empty_key$.getGlobalValue()));
    _csetf_khash_hash_stash(v_keyhash, Vectors.make_vector(capacity, $keyhash_empty_hash$.getGlobalValue()));
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 5730) 
  public static final SubLObject grow_keyhash(SubLObject v_keyhash) {
    {
      SubLObject old_nodes = khash_nodes(v_keyhash);
      SubLObject old_hash_stash = khash_hash_stash(v_keyhash);
      SubLObject capacity = keyhash_capacity_internal(v_keyhash);
      SubLObject new_capacity = Numbers.add(capacity, capacity);
      keyhash_allocate_nodes(v_keyhash, new_capacity);
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(capacity); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject node_key = Vectors.aref(old_nodes, i);
            if ((node_key != $keyhash_empty_key$.getGlobalValue())) {
              {
                SubLObject node_keycode = Vectors.aref(old_hash_stash, i);
                store_in_keyhash(node_key, node_keycode, v_keyhash);
              }
            }
          }
        }
      }
    }
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 6281) 
  public static final SubLObject potentially_grow_keyhash(SubLObject v_keyhash) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject capacity = keyhash_capacity_internal(v_keyhash);
        SubLObject count = keyhash_count(v_keyhash);
        SubLObject growth_tuple = conses_high.assoc(capacity, $keyhash_grow_sizes$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(growth_tuple.isCons()))) {
            Errors.error($str35$Keyhash_capacity__A_has_exceeded_, capacity, keyhash_table_size_limit_tuple());
          }
        }
        {
          SubLObject datum = growth_tuple;
          SubLObject current = datum;
          SubLObject the_capacity = NIL;
          SubLObject the_limit = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
          the_capacity = current.first();
          current = current.rest();
          the_limit = current;
          if ((!(count.numL(the_limit)))) {
            grow_keyhash(v_keyhash);
          }
        }
      }
      return v_keyhash;
    }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 6926) 
  public static final SubLObject clear_keyhash_node(SubLObject v_keyhash, SubLObject index) {
    Vectors.set_aref(khash_nodes(v_keyhash), index, $keyhash_empty_key$.getGlobalValue());
    Vectors.set_aref(khash_hash_stash(v_keyhash), index, $keyhash_empty_hash$.getGlobalValue());
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 7123) 
  public static final SubLObject clear_all_keyhash_nodes(SubLObject v_keyhash) {
    {
      SubLObject capacity = keyhash_capacity_internal(v_keyhash);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(capacity); i = Numbers.add(i, ONE_INTEGER)) {
        clear_keyhash_node(v_keyhash, i);
      }
    }
    return v_keyhash;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 7729) 
  public static final SubLObject scale_keycode_to_keyhash(SubLObject keycode, SubLObject v_keyhash) {
    {
      SubLObject capacity = keyhash_capacity_internal(v_keyhash);
      SubLObject mask = Numbers.subtract(capacity, ONE_INTEGER);
      return Numbers.logand(Numbers.fixnumMultiply(Numbers.logand(keycode, mask), $keyhash_a$.getGlobalValue()), mask);
    }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 9101) 
  public static final SubLObject keyhash_lookup_key_eq(SubLObject key, SubLObject keycode, SubLObject nodes, SubLObject hash_stash, SubLObject capacity, SubLObject index, SubLObject wrapped_around) {
    {
      SubLObject done = NIL;
      while ((NIL == done)) {
        {
          SubLObject node_key = Vectors.aref(nodes, index);
          if ((node_key == $keyhash_empty_key$.getGlobalValue())) {
            done = T;
          } else if ((keycode.numE(Vectors.aref(hash_stash, index))
               && (key == node_key))) {
            done = T;
          } else if (index.numE(wrapped_around)) {
            return $kw59$NO_NODE;
          } else {
            index = Numbers.subtract(index, $keyhash_step$.getGlobalValue());
            if (index.isNegative()) {
              index = Numbers.add(index, capacity);
            }
          }
        }
      }
    }
    return index;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 9921) 
  public static final SubLObject keyhash_lookup_key(SubLObject key, SubLObject keycode, SubLObject v_keyhash) {
    {
      SubLObject test_function = keyhash_test(v_keyhash);
      SubLObject nodes = khash_nodes(v_keyhash);
      SubLObject hash_stash = khash_hash_stash(v_keyhash);
      SubLObject capacity = keyhash_capacity_internal(v_keyhash);
      SubLObject index = scale_keycode_to_keyhash(keycode, v_keyhash);
      SubLObject wrapped_around = Numbers.add(index, $keyhash_step$.getGlobalValue());
      if (wrapped_around.numG(capacity)) {
        wrapped_around = Numbers.subtract(wrapped_around, capacity);
      }
      {
        SubLObject pcase_var = test_function;
        if ((pcase_var.eql($sym60$QUOTE)
            || pcase_var.eql(EQ))) {
          return keyhash_lookup_key_eq(key, keycode, nodes, hash_stash, capacity, index, wrapped_around);
        } else if ((pcase_var.eql($sym60$QUOTE)
            || pcase_var.eql(EQL))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31679");
        } else if ((pcase_var.eql($sym60$QUOTE)
            || pcase_var.eql(EQUAL))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31680");
        } else if ((pcase_var.eql($sym60$QUOTE)
            || pcase_var.eql(EQUALP))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31681");
        } else {
          Errors.error($str61$Unsupported_test_function__s, test_function);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/keyhash.lisp", position = 10979) 
  public static final SubLObject keyhash_find_key(SubLObject key, SubLObject v_keyhash) {
    return keyhash_lookup_key(key, Sxhash.sxhash(key), v_keyhash);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 11082) 
  public static final SubLObject keyhash_cannot_find_empty_nodeP(SubLObject val) {
    return Equality.eq(val, $kw59$NO_NODE);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 11164) 
  public static final SubLObject store_in_keyhash(SubLObject node_key, SubLObject node_keycode, SubLObject v_keyhash) {
    {
      SubLObject index = keyhash_lookup_key(node_key, node_keycode, v_keyhash);
      if ((!(index.isNumber()))) {
        Errors.error($str62$The_keyhash__A_mysteriously_overf, v_keyhash);
      }
      {
        SubLObject nodes = khash_nodes(v_keyhash);
        SubLObject hash_stash = khash_hash_stash(v_keyhash);
        Vectors.set_aref(nodes, index, node_key);
        Vectors.set_aref(hash_stash, index, node_keycode);
      }
    }
    return v_keyhash;
  }

  /** Given the index of a gap in the hashtable, walk down the probe chain
   and swap up any items that belong to the same chain. */
  @SubL(source = "cycl/keyhash.lisp", position = 11617) 
  public static final SubLObject keyhash_fill_gap(SubLObject gap_index, SubLObject v_keyhash) {
    {
      SubLObject capacity = keyhash_capacity_internal(v_keyhash);
      SubLObject nodes = khash_nodes(v_keyhash);
      SubLObject hash_stash = khash_hash_stash(v_keyhash);
      SubLObject empty = gap_index;
      SubLObject done = NIL;
      clear_keyhash_node(v_keyhash, empty);
      while ((NIL == done)) {
        gap_index = Numbers.subtract(gap_index, $keyhash_step$.getGlobalValue());
        if (gap_index.isNegative()) {
          gap_index = Numbers.add(gap_index, capacity);
        }
        {
          SubLObject node_key = Vectors.aref(nodes, gap_index);
          if ((node_key == $keyhash_empty_key$.getGlobalValue())) {
            done = T;
          } else {
            {
              SubLObject node_keycode = Vectors.aref(hash_stash, gap_index);
              SubLObject new_index = keyhash_lookup_key(node_key, node_keycode, v_keyhash);
              if (new_index.numE(empty)) {
                Vectors.set_aref(nodes, empty, node_key);
                Vectors.set_aref(hash_stash, empty, node_keycode);
                empty = gap_index;
                clear_keyhash_node(v_keyhash, empty);
              }
            }
          }
        }
      }
    }
    return v_keyhash;
  }

  /** Allocate a new keyhash with TEST as the equality test.
   Assume that SIZE elements will likely be immediately added.
   @return keyhash */
  @SubL(source = "cycl/keyhash.lisp", position = 12789) 
  public static final SubLObject new_keyhash(SubLObject size, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(size, $sym63$FIXNUMP);
    checkType(test, $sym64$VALID_HASH_TEST_P);
    if (test.isFunction()) {
      test = hash_table_utilities.hash_test_to_symbol(test);
    }
    {
      SubLObject v_keyhash = make_keyhash(UNPROVIDED);
      keyhash_allocate(v_keyhash, size);
      _csetf_khash_test(v_keyhash, test);
      return v_keyhash;
    }
  }

  /** Reset KEYHASH to the status of being just allocated.
   @return keyhash */
  @SubL(source = "cycl/keyhash.lisp", position = 13503) 
  public static final SubLObject clrkeyhash(SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    clear_all_keyhash_nodes(v_keyhash);
    _csetf_khash_count(v_keyhash, ZERO_INTEGER);
    return v_keyhash;
  }

  /** Return the equality test used in KEYHASH.
   @return valid-hash-test-p. */
  @SubL(source = "cycl/keyhash.lisp", position = 13764) 
  public static final SubLObject keyhash_test(SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    {
      SubLObject test = khash_test(v_keyhash);
      if (test.isFunction()) {
        _csetf_khash_test(v_keyhash, hash_table_utilities.hash_test_to_symbol(test));
        return keyhash_test(v_keyhash);
      }
      return test;
    }
  }

  /** Return the number of items currently stored in KEYHASH.
   @return integerp. */
  @SubL(source = "cycl/keyhash.lisp", position = 14224) 
  public static final SubLObject keyhash_count(SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    return khash_count(v_keyhash);
  }

  /** Return T iff KEY is currently stored in KEYHASH.
   @return boolean. */
  @SubL(source = "cycl/keyhash.lisp", position = 14672) 
  public static final SubLObject getkeyhash(SubLObject key, SubLObject v_keyhash) {
    {
      SubLObject matching_key = keyhash_matching_key(key, v_keyhash);
      return list_utilities.sublisp_boolean(matching_key);
    }
  }

  /** If there is a key in KEYHASH that matches KEY, then return it.
   Otherwise return NIL. */
  @SubL(source = "cycl/keyhash.lisp", position = 14912) 
  public static final SubLObject keyhash_matching_key(SubLObject key, SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    {
      SubLObject position = keyhash_find_key(key, v_keyhash);
      if (position.isFixnum()) {
        {
          SubLObject node_key = Vectors.aref(khash_nodes(v_keyhash), position);
          if ((node_key == $keyhash_empty_key$.getGlobalValue())) {
            return NIL;
          } else {
            return node_key;
          }
        }
      }
    }
    return NIL;
  }

  /** Note that KEY is stored in KEYHASH.
   @return KEY. */
  @SubL(source = "cycl/keyhash.lisp", position = 15355) 
  public static final SubLObject setkeyhash(SubLObject key, SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    {
      SubLObject keycode = Sxhash.sxhash(key);
      SubLObject position = keyhash_lookup_key(key, keycode, v_keyhash);
      if ((NIL != keyhash_cannot_find_empty_nodeP(position))) {
        grow_keyhash(v_keyhash);
        position = keyhash_lookup_key(key, keycode, v_keyhash);
        if ((NIL != keyhash_cannot_find_empty_nodeP(position))) {
          Errors.error($str65$Cannot_grow_keyhash__A_any_more_, v_keyhash);
        }
      }
      if ((Vectors.aref(khash_nodes(v_keyhash), position) == $keyhash_empty_key$.getGlobalValue())) {
        _csetf_khash_count(v_keyhash, Numbers.add(khash_count(v_keyhash), ONE_INTEGER));
        Vectors.set_aref(khash_nodes(v_keyhash), position, key);
        Vectors.set_aref(khash_hash_stash(v_keyhash), position, keycode);
        potentially_grow_keyhash(v_keyhash);
      }
    }
    return key;
  }

  /** Remove KEY from KEYHASH.  Return T iff KEY was stored in KEYHASH.
   @return boolean. */
  @SubL(source = "cycl/keyhash.lisp", position = 16198) 
  public static final SubLObject remkeyhash(SubLObject key, SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    {
      SubLObject keycode = Sxhash.sxhash(key);
      SubLObject position = keyhash_lookup_key(key, keycode, v_keyhash);
      if (position.isFixnum()) {
        if ((Vectors.aref(khash_nodes(v_keyhash), position) != $keyhash_empty_key$.getGlobalValue())) {
          _csetf_khash_count(v_keyhash, Numbers.subtract(khash_count(v_keyhash), ONE_INTEGER));
          clear_keyhash_node(v_keyhash, position);
          keyhash_fill_gap(position, v_keyhash);
          return T;
        }
      }
      return NIL;
    }
  }

  public static final class $iterate_keyhash_necessary$UnaryFunction extends UnaryFunction {
    public $iterate_keyhash_necessary$UnaryFunction() { super(extractFunctionNamed("ITERATE-KEYHASH-NECESSARY")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31677"); }
  }

  @SubL(source = "cycl/keyhash.lisp", position = 17893) 
  public static final SubLObject do_keyhash_nodes(SubLObject v_keyhash) {
    checkType(v_keyhash, $sym1$KEYHASH_P);
    return khash_nodes(v_keyhash);
  }

  @SubL(source = "cycl/keyhash.lisp", position = 18058) 
  public static final SubLObject do_keyhash_valid_key_p(SubLObject key) {
    return makeBoolean((key != $keyhash_empty_key$.getGlobalValue()));
  }

  @SubL(source = "cycl/keyhash.lisp", position = 18891) 
  private static SubLSymbol $cfasl_opcode_keyhash$ = null;

  @SubL(source = "cycl/keyhash.lisp", position = 19013) 
  public static final SubLObject cfasl_output_object_keyhash_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31675");
  }

  @SubL(source = "cycl/keyhash.lisp", position = 19453) 
  public static final SubLObject cfasl_input_keyhash(SubLObject stream) {
    {
      SubLObject type = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject size = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject test = NIL;
      SubLObject v_keyhash = NIL;
      SubLObject pcase_var = type;
      if ((pcase_var.eql(EQ)
          || pcase_var.eql(EQL)
          || pcase_var.eql(EQUAL)
          || pcase_var.eql(EQUALP))) {
        test = Symbols.symbol_function(type);
      }
      v_keyhash = new_keyhash(size, test);
      {
        SubLObject index = NIL;
        for (index = ZERO_INTEGER; index.numL(size); index = Numbers.add(index, ONE_INTEGER)) {
          {
            SubLObject key = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            setkeyhash(key, v_keyhash);
          }
        }
      }
      return v_keyhash;
    }
  }

  public static final SubLObject declare_keyhash_file() {
    declareFunction(myName, "keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "keyhash_p", "KEYHASH-P", 1, 0, false); new $keyhash_p$UnaryFunction();
    declareFunction(myName, "khash_nodes", "KHASH-NODES", 1, 0, false);
    declareFunction(myName, "khash_test", "KHASH-TEST", 1, 0, false);
    declareFunction(myName, "khash_count", "KHASH-COUNT", 1, 0, false);
    declareFunction(myName, "khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false);
    declareFunction(myName, "_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false);
    declareFunction(myName, "_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false);
    declareFunction(myName, "_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false);
    declareFunction(myName, "make_keyhash", "MAKE-KEYHASH", 0, 1, false);
    declareFunction(myName, "print_key_hash", "PRINT-KEY-HASH", 3, 0, false);
    declareFunction(myName, "keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false);
    declareMacro(myName, "is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P");
    declareMacro(myName, "is_empty_hash_stash_value_p", "IS-EMPTY-HASH-STASH-VALUE-P");
    declareFunction(myName, "compute_keyhash_grow_sizes", "COMPUTE-KEYHASH-GROW-SIZES", 2, 0, false);
    declareFunction(myName, "compute_keyhash_capacity", "COMPUTE-KEYHASH-CAPACITY", 1, 0, false);
    declareFunction(myName, "keyhash_table_size_limit_tuple", "KEYHASH-TABLE-SIZE-LIMIT-TUPLE", 0, 0, false);
    declareFunction(myName, "keyhash_allocate", "KEYHASH-ALLOCATE", 2, 0, false);
    declareFunction(myName, "keyhash_allocate_nodes", "KEYHASH-ALLOCATE-NODES", 2, 0, false);
    declareFunction(myName, "grow_keyhash", "GROW-KEYHASH", 1, 0, false);
    declareFunction(myName, "potentially_grow_keyhash", "POTENTIALLY-GROW-KEYHASH", 1, 0, false);
    declareFunction(myName, "clear_keyhash_node", "CLEAR-KEYHASH-NODE", 2, 0, false);
    declareFunction(myName, "clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false);
    declareFunction(myName, "keyhash_compute_hash", "KEYHASH-COMPUTE-HASH", 2, 0, false);
    declareFunction(myName, "scale_keycode_to_keyhash", "SCALE-KEYCODE-TO-KEYHASH", 2, 0, false);
    declareMacro(myName, "set_to_next_probe_index", "SET-TO-NEXT-PROBE-INDEX");
    declareMacro(myName, "keyhash_lookup_loop", "KEYHASH-LOOKUP-LOOP");
    declareFunction(myName, "keyhash_lookup_key_eq", "KEYHASH-LOOKUP-KEY-EQ", 7, 0, false);
    declareFunction(myName, "keyhash_lookup_key_eql", "KEYHASH-LOOKUP-KEY-EQL", 7, 0, false);
    declareFunction(myName, "keyhash_lookup_key_equal", "KEYHASH-LOOKUP-KEY-EQUAL", 7, 0, false);
    declareFunction(myName, "keyhash_lookup_key_equalp", "KEYHASH-LOOKUP-KEY-EQUALP", 7, 0, false);
    declareFunction(myName, "keyhash_lookup_key", "KEYHASH-LOOKUP-KEY", 3, 0, false);
    declareFunction(myName, "keyhash_find_key", "KEYHASH-FIND-KEY", 2, 0, false);
    declareFunction(myName, "keyhash_cannot_find_empty_nodeP", "KEYHASH-CANNOT-FIND-EMPTY-NODE?", 1, 0, false);
    declareFunction(myName, "store_in_keyhash", "STORE-IN-KEYHASH", 3, 0, false);
    declareFunction(myName, "keyhash_fill_gap", "KEYHASH-FILL-GAP", 2, 0, false);
    declareFunction(myName, "new_keyhash", "NEW-KEYHASH", 1, 1, false);
    declareFunction(myName, "clrkeyhash", "CLRKEYHASH", 1, 0, false);
    declareFunction(myName, "keyhash_test", "KEYHASH-TEST", 1, 0, false);
    declareFunction(myName, "keyhash_count", "KEYHASH-COUNT", 1, 0, false);
    declareFunction(myName, "keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
    declareFunction(myName, "getkeyhash", "GETKEYHASH", 2, 0, false);
    declareFunction(myName, "keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
    declareFunction(myName, "setkeyhash", "SETKEYHASH", 2, 0, false);
    declareFunction(myName, "remkeyhash", "REMKEYHASH", 2, 0, false);
    declareFunction(myName, "new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false);
    declareFunction(myName, "iterate_keyhash_necessary", "ITERATE-KEYHASH-NECESSARY", 1, 0, false); new $iterate_keyhash_necessary$UnaryFunction();
    declareMacro(myName, "do_keyhash", "DO-KEYHASH");
    declareMacro(myName, "some_keyhash", "SOME-KEYHASH");
    declareFunction(myName, "do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
    declareFunction(myName, "do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false);
    declareFunction(myName, "is_occupied_keyhash_index_p", "IS-OCCUPIED-KEYHASH-INDEX-P", 2, 0, false);
    declareFunction(myName, "get_occupied_keyhash_index", "GET-OCCUPIED-KEYHASH-INDEX", 2, 0, false);
    declareFunction(myName, "mapkeyhash", "MAPKEYHASH", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false);
    declareFunction(myName, "cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false);
    declareFunction(myName, "copy_keyhash", "COPY-KEYHASH", 1, 0, false);
    declareFunction(myName, "keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_keyhash_file() {
    $dtp_keyhash$ = defconstant("*DTP-KEYHASH*", $sym0$KEYHASH);
    $keyhash_a$ = defconstant("*KEYHASH-A*", $int27$10009);
    $keyhash_step$ = defconstant("*KEYHASH-STEP*", THIRTEEN_INTEGER);
    $keyhash_empty_key$ = deflexical("*KEYHASH-EMPTY-KEY*", maybeDefault( $sym28$_KEYHASH_EMPTY_KEY_, $keyhash_empty_key$, ()-> (Symbols.make_symbol($str29$The_Empty_KEYHASH_Key))));
    $keyhash_empty_hash$ = deflexical("*KEYHASH-EMPTY-HASH*", maybeDefault( $sym30$_KEYHASH_EMPTY_HASH_, $keyhash_empty_hash$, NIL));
    $keyhash_grow_sizes$ = deflexical("*KEYHASH-GROW-SIZES*", compute_keyhash_grow_sizes($keyhash_step$.getGlobalValue(), Numbers.$most_positive_fixnum$.getGlobalValue()));
    $cfasl_opcode_keyhash$ = defconstant("*CFASL-OPCODE-KEYHASH*", $int82$68);
    return NIL;
  }

  public static final SubLObject setup_keyhash_file() {
    // CVS_ID("Id: keyhash.lisp 128862 2009-09-30 16:02:44Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), Symbols.symbol_function($sym8$KEYHASH_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$KHASH_NODES, $sym10$_CSETF_KHASH_NODES);
    Structures.def_csetf($sym11$KHASH_TEST, $sym12$_CSETF_KHASH_TEST);
    Structures.def_csetf($sym13$KHASH_COUNT, $sym14$_CSETF_KHASH_COUNT);
    Structures.def_csetf($sym15$KHASH_HASH_STASH, $sym16$_CSETF_KHASH_HASH_STASH);
    Equality.identity($sym0$KEYHASH);
    subl_macro_promotions.declare_defglobal($sym28$_KEYHASH_EMPTY_KEY_);
    subl_macro_promotions.declare_defglobal($sym30$_KEYHASH_EMPTY_HASH_);
    access_macros.register_macro_helper($sym72$DO_KEYHASH_NODES, $list76);
    access_macros.register_macro_helper($sym73$DO_KEYHASH_VALID_KEY_P, $list76);
    access_macros.define_obsolete_register($sym77$IS_OCCUPIED_KEYHASH_INDEX_P, $list78);
    access_macros.define_obsolete_register($sym79$GET_OCCUPIED_KEYHASH_INDEX, $list80);
    cfasl.register_cfasl_input_function($cfasl_opcode_keyhash$.getGlobalValue(), $sym83$CFASL_INPUT_KEYHASH);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), Symbols.symbol_function($sym84$CFASL_OUTPUT_OBJECT_KEYHASH_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$KEYHASH = makeSymbol("KEYHASH");
  public static final SubLSymbol $sym1$KEYHASH_P = makeSymbol("KEYHASH-P");
  public static final SubLInteger $int2$137 = makeInteger(137);
  public static final SubLList $list3 = list(makeSymbol("NODES"), makeSymbol("TEST"), makeSymbol("COUNT"), makeSymbol("HASH-STASH"));
  public static final SubLList $list4 = list(makeKeyword("NODES"), makeKeyword("TEST"), makeKeyword("COUNT"), makeKeyword("HASH-STASH"));
  public static final SubLList $list5 = list(makeSymbol("KHASH-NODES"), makeSymbol("KHASH-TEST"), makeSymbol("KHASH-COUNT"), makeSymbol("KHASH-HASH-STASH"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-KHASH-NODES"), makeSymbol("_CSETF-KHASH-TEST"), makeSymbol("_CSETF-KHASH-COUNT"), makeSymbol("_CSETF-KHASH-HASH-STASH"));
  public static final SubLSymbol $sym7$PRINT_KEY_HASH = makeSymbol("PRINT-KEY-HASH");
  public static final SubLSymbol $sym8$KEYHASH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KEYHASH-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$KHASH_NODES = makeSymbol("KHASH-NODES");
  public static final SubLSymbol $sym10$_CSETF_KHASH_NODES = makeSymbol("_CSETF-KHASH-NODES");
  public static final SubLSymbol $sym11$KHASH_TEST = makeSymbol("KHASH-TEST");
  public static final SubLSymbol $sym12$_CSETF_KHASH_TEST = makeSymbol("_CSETF-KHASH-TEST");
  public static final SubLSymbol $sym13$KHASH_COUNT = makeSymbol("KHASH-COUNT");
  public static final SubLSymbol $sym14$_CSETF_KHASH_COUNT = makeSymbol("_CSETF-KHASH-COUNT");
  public static final SubLSymbol $sym15$KHASH_HASH_STASH = makeSymbol("KHASH-HASH-STASH");
  public static final SubLSymbol $sym16$_CSETF_KHASH_HASH_STASH = makeSymbol("_CSETF-KHASH-HASH-STASH");
  public static final SubLSymbol $kw17$NODES = makeKeyword("NODES");
  public static final SubLSymbol $kw18$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw19$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw20$HASH_STASH = makeKeyword("HASH-STASH");
  public static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str22$__ = makeString("#<");
  public static final SubLSymbol $kw23$STREAM = makeKeyword("STREAM");
  public static final SubLString $str24$_ = makeString(" ");
  public static final SubLString $str25$_ = makeString("/");
  public static final SubLSymbol $kw26$BASE = makeKeyword("BASE");
  public static final SubLInteger $int27$10009 = makeInteger(10009);
  public static final SubLSymbol $sym28$_KEYHASH_EMPTY_KEY_ = makeSymbol("*KEYHASH-EMPTY-KEY*");
  public static final SubLString $str29$The_Empty_KEYHASH_Key = makeString("The Empty KEYHASH Key");
  public static final SubLSymbol $sym30$_KEYHASH_EMPTY_HASH_ = makeSymbol("*KEYHASH-EMPTY-HASH*");
  public static final SubLList $list31 = list(makeSymbol("VAL"));
  public static final SubLList $list32 = list(makeSymbol("*KEYHASH-EMPTY-KEY*"));
  public static final SubLList $list33 = list(makeSymbol("*KEYHASH-EMPTY-HASH*"));
  public static final SubLList $list34 = cons(makeSymbol("TABLE-SIZE"), makeSymbol("GROW-SIZE"));
  public static final SubLString $str35$Keyhash_capacity__A_has_exceeded_ = makeString("Keyhash capacity ~A has exceeded the limit ~A for this platform.");
  public static final SubLList $list36 = cons(makeSymbol("THE-CAPACITY"), makeSymbol("THE-LIMIT"));
  public static final SubLList $list37 = list(makeSymbol("INDEX"), makeSymbol("CAPACITY"));
  public static final SubLSymbol $sym38$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym39$CDEC = makeSymbol("CDEC");
  public static final SubLList $list40 = list(makeSymbol("*KEYHASH-STEP*"));
  public static final SubLSymbol $sym41$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym42$MINUSP = makeSymbol("MINUSP");
  public static final SubLSymbol $sym43$CINC = makeSymbol("CINC");
  public static final SubLList $list44 = list(makeSymbol("TEST-FUNCTION"), makeSymbol("KEY"), makeSymbol("KEYCODE"), makeSymbol("NODES"), makeSymbol("HASH-STASH"), makeSymbol("CAPACITY"), makeSymbol("INDEX"), makeSymbol("WRAPPED-AROUND"));
  public static final SubLSymbol $sym45$CLET = makeSymbol("CLET");
  public static final SubLList $list46 = list(makeSymbol("DONE"));
  public static final SubLSymbol $sym47$WHILE = makeSymbol("WHILE");
  public static final SubLList $list48 = list(makeSymbol("CNOT"), makeSymbol("DONE"));
  public static final SubLSymbol $sym49$NODE_KEY = makeSymbol("NODE-KEY");
  public static final SubLSymbol $sym50$AREF = makeSymbol("AREF");
  public static final SubLSymbol $sym51$PCOND = makeSymbol("PCOND");
  public static final SubLList $list52 = list(list(makeSymbol("IS-EMPTY-KEYHASH-KEY-P"), makeSymbol("NODE-KEY")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T));
  public static final SubLSymbol $sym53$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym54$_ = makeSymbol("=");
  public static final SubLList $list55 = list(makeSymbol("NODE-KEY"));
  public static final SubLList $list56 = list(list(makeSymbol("CSETQ"), makeSymbol("DONE"), T));
  public static final SubLList $list57 = list(list(makeSymbol("RET"), makeKeyword("NO-NODE")));
  public static final SubLSymbol $sym58$SET_TO_NEXT_PROBE_INDEX = makeSymbol("SET-TO-NEXT-PROBE-INDEX");
  public static final SubLSymbol $kw59$NO_NODE = makeKeyword("NO-NODE");
  public static final SubLSymbol $sym60$QUOTE = makeSymbol("QUOTE");
  public static final SubLString $str61$Unsupported_test_function__s = makeString("Unsupported test function ~s");
  public static final SubLString $str62$The_keyhash__A_mysteriously_overf = makeString("The keyhash ~A mysteriously overflowed.");
  public static final SubLSymbol $sym63$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym64$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLString $str65$Cannot_grow_keyhash__A_any_more_ = makeString("Cannot grow keyhash ~A any more.");
  public static final SubLSymbol $sym66$ITERATE_KEYHASH_NECESSARY = makeSymbol("ITERATE-KEYHASH-NECESSARY");
  public static final SubLList $list67 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list68 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw69$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw70$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym71$DO_VECTOR = makeSymbol("DO-VECTOR");
  public static final SubLSymbol $sym72$DO_KEYHASH_NODES = makeSymbol("DO-KEYHASH-NODES");
  public static final SubLSymbol $sym73$DO_KEYHASH_VALID_KEY_P = makeSymbol("DO-KEYHASH-VALID-KEY-P");
  public static final SubLList $list74 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym75$DO_KEYHASH = makeSymbol("DO-KEYHASH");
  public static final SubLList $list76 = list(makeSymbol("DO-KEYHASH"), makeSymbol("DO-SET-CONTENTS"));
  public static final SubLSymbol $sym77$IS_OCCUPIED_KEYHASH_INDEX_P = makeSymbol("IS-OCCUPIED-KEYHASH-INDEX-P");
  public static final SubLList $list78 = list(makeSymbol("DO-KEYHASH-VALID-KEY-P"));
  public static final SubLSymbol $sym79$GET_OCCUPIED_KEYHASH_INDEX = makeSymbol("GET-OCCUPIED-KEYHASH-INDEX");
  public static final SubLList $list80 = list(makeSymbol("DO-KEYHASH-NODES"));
  public static final SubLSymbol $sym81$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLInteger $int82$68 = makeInteger(68);
  public static final SubLSymbol $sym83$CFASL_INPUT_KEYHASH = makeSymbol("CFASL-INPUT-KEYHASH");
  public static final SubLSymbol $sym84$CFASL_OUTPUT_OBJECT_KEYHASH_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-KEYHASH-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_keyhash_file();
  }

  public void initializeVariables() {
    init_keyhash_file();
  }

  public void runTopLevelForms() {
    setup_keyhash_file();
  }

}
