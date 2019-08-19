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
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cache_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class memoization_state extends SubLTranslatedFile {

  //// Constructor

  private memoization_state() {}
  public static final SubLFile me = new memoization_state();
  public static final String myName = "com.cyc.cycjava_1.cycl.memoization_state";

  //// Definitions

  @SubL(source = "cycl/memoization-state.lisp", position = 3684) 
  public static SubLSymbol $global_caching_lock$ = null;

  /** Whether to enable cache monitoring. Need to do a retranslation after changing this. */
  @SubL(source = "cycl/memoization-state.lisp", position = 3768) 
  public static SubLSymbol $caching_mode_should_monitor$ = null;

  /** Hashtable for monitoring all caching calls. */
  @SubL(source = "cycl/memoization-state.lisp", position = 4090) 
  private static SubLSymbol $cache_monitor_hash$ = null;

  /** Hashtable for monitoring cached calls that aren't already cached. */
  @SubL(source = "cycl/memoization-state.lisp", position = 4199) 
  private static SubLSymbol $cache_monitor_failure_hash$ = null;

  /** This indicates that when evaluating the function caching macros, whether to test if 
  the function should be disabled. 
  Not testing for disabled is generally faster but less flexible because then you
  can no longer dynamically disable function caching. 
  You'll need to do a new translation after setting this for it to take effect. */
  @SubL(source = "cycl/memoization-state.lisp", position = 5667) 
  private static SubLSymbol $allow_function_caching_to_be_disabled$ = null;

  /** Caching mode function indicating what's enabled. */
  @SubL(source = "cycl/memoization-state.lisp", position = 6243) 
  public static SubLSymbol $caching_mode_enabled$ = null;

  /** Caching mode function indicating what's disabled. */
  @SubL(source = "cycl/memoization-state.lisp", position = 6352) 
  public static SubLSymbol $caching_mode_disabled$ = null;

  /** Global caching and memoization are disabled when NIL. */
  @SubL(source = "cycl/memoization-state.lisp", position = 6462) 
  public static SubLSymbol $function_caching_enabledP$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 10785) 
  public static final SubLObject sxhash_calc_7(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
    {
      SubLObject sxhash = ZERO_INTEGER;
      SubLObject composite_state = FOUR_INTEGER;
      SubLObject composite_hash = $int21$167;
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
      sxhash = composite_hash;
      return sxhash;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 12153) 
  public static final SubLObject sxhash_calc_4(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
    {
      SubLObject sxhash = ZERO_INTEGER;
      SubLObject composite_state = FOUR_INTEGER;
      SubLObject composite_hash = $int21$167;
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
      sxhash = composite_hash;
      return sxhash;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 12515) 
  public static final SubLObject sxhash_calc_3(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    {
      SubLObject sxhash = ZERO_INTEGER;
      SubLObject composite_state = FOUR_INTEGER;
      SubLObject composite_hash = $int21$167;
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
      sxhash = composite_hash;
      return sxhash;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 12830) 
  public static final SubLObject sxhash_calc_2(SubLObject arg1, SubLObject arg2) {
    {
      SubLObject sxhash = ZERO_INTEGER;
      SubLObject composite_state = FOUR_INTEGER;
      SubLObject composite_hash = $int21$167;
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
      composite_state = utilities_macros.sxhash_update_state(composite_state);
      composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
      sxhash = composite_hash;
      return sxhash;
    }
  }

  public static final class $caching_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $store; }
    public SubLObject getField3() { return $zero_arg_results; }
    public SubLObject getField4() { return $lock; }
    public SubLObject getField5() { return $capacity; }
    public SubLObject getField6() { return $func_symbol; }
    public SubLObject getField7() { return $test; }
    public SubLObject getField8() { return $args_length; }
    public SubLObject setField2(SubLObject value) { return $store = value; }
    public SubLObject setField3(SubLObject value) { return $zero_arg_results = value; }
    public SubLObject setField4(SubLObject value) { return $lock = value; }
    public SubLObject setField5(SubLObject value) { return $capacity = value; }
    public SubLObject setField6(SubLObject value) { return $func_symbol = value; }
    public SubLObject setField7(SubLObject value) { return $test = value; }
    public SubLObject setField8(SubLObject value) { return $args_length = value; }
    public SubLObject $store = NIL;
    public SubLObject $zero_arg_results = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $capacity = NIL;
    public SubLObject $func_symbol = NIL;
    public SubLObject $test = NIL;
    public SubLObject $args_length = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($caching_state_native.class, $sym35$CACHING_STATE, $sym36$CACHING_STATE_P, $list37, $list38, new String[] {"$store", "$zero_arg_results", "$lock", "$capacity", "$func_symbol", "$test", "$args_length"}, $list39, $list40, $sym41$PRINT_CACHING_STATE);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static SubLSymbol $dtp_caching_state$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject caching_state_p(SubLObject object) {
    return ((object.getClass() == $caching_state_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $caching_state_p$UnaryFunction extends UnaryFunction {
    public $caching_state_p$UnaryFunction() { super(extractFunctionNamed("CACHING-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return caching_state_p(arg1); }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject caching_state_store(SubLObject object) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject caching_state_zero_arg_results(SubLObject object) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject caching_state_lock(SubLObject object) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject caching_state_capacity(SubLObject object) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_store(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_zero_arg_results(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_capacity(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_func_symbol(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_test(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject _csetf_caching_state_args_length(SubLObject object, SubLObject value) {
    checkType(object, $sym36$CACHING_STATE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15433) 
  public static final SubLObject make_caching_state(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $caching_state_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw57$STORE)) {
            _csetf_caching_state_store(v_new, current_value);
          } else if (pcase_var.eql($kw58$ZERO_ARG_RESULTS)) {
            _csetf_caching_state_zero_arg_results(v_new, current_value);
          } else if (pcase_var.eql($kw59$LOCK)) {
            _csetf_caching_state_lock(v_new, current_value);
          } else if (pcase_var.eql($kw60$CAPACITY)) {
            _csetf_caching_state_capacity(v_new, current_value);
          } else if (pcase_var.eql($kw61$FUNC_SYMBOL)) {
            _csetf_caching_state_func_symbol(v_new, current_value);
          } else if (pcase_var.eql($kw62$TEST)) {
            _csetf_caching_state_test(v_new, current_value);
          } else if (pcase_var.eql($kw63$ARGS_LENGTH)) {
            _csetf_caching_state_args_length(v_new, current_value);
          } else {
            Errors.error($str64$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 15781) 
  public static final SubLObject create_caching_state(SubLObject lock, SubLObject func_symbol, SubLObject func_args_length, SubLObject capacity, SubLObject test, SubLObject initial_size) {
    if ((capacity == UNPROVIDED)) {
      capacity = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((initial_size == UNPROVIDED)) {
      initial_size = ZERO_INTEGER;
    }
    {
      SubLObject cs = make_caching_state(UNPROVIDED);
      enforceType(initial_size, $sym65$NON_NEGATIVE_INTEGER_P);
      if ((NIL != capacity)) {
        enforceType(capacity, $sym66$POSITIVE_INTEGER_P);
      }
      enforceType(func_symbol, $sym67$SYMBOLP);
      if (test.isSymbol()) {
        test = Symbols.symbol_function(test);
      }
      enforceType(test, $sym68$FUNCTION_SPEC_P);
      if ((NIL != capacity)) {
        _csetf_caching_state_store(cs, cache.new_cache(capacity, (func_args_length.eql(ONE_INTEGER) ? ((SubLObject) test) : Symbols.symbol_function(EQL))));
      } else {
        _csetf_caching_state_store(cs, dictionary.new_dictionary((func_args_length.eql(ONE_INTEGER) ? ((SubLObject) test) : Symbols.symbol_function(EQL)), initial_size));
      }
      _csetf_caching_state_lock(cs, lock);
      _csetf_caching_state_capacity(cs, capacity);
      _csetf_caching_state_func_symbol(cs, func_symbol);
      _csetf_caching_state_test(cs, test);
      _csetf_caching_state_args_length(cs, func_args_length);
      _csetf_caching_state_zero_arg_results(cs, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
      return cs;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 17977) 
  public static final SubLObject caching_state_get_zero_arg_results(SubLObject caching_state, SubLObject lock) {
    if ((lock == UNPROVIDED)) {
      lock = caching_state_lock(caching_state);
    }
    if ((NIL != lock)) {
      {
        SubLObject result = NIL;
        SubLObject rw_lock_var = lock;
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
          result = caching_state_zero_arg_results(caching_state);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
          }
        }
        return result;
      }
    } else {
      return caching_state_zero_arg_results(caching_state);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 18214) 
  public static final SubLObject caching_state_set_zero_arg_results_internal(SubLObject caching_state, SubLObject val) {
    _csetf_caching_state_zero_arg_results(caching_state, val);
    return NIL;
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 18371) 
  public static final SubLObject caching_state_set_zero_arg_results(SubLObject caching_state, SubLObject val, SubLObject lock) {
    if ((lock == UNPROVIDED)) {
      lock = caching_state_lock(caching_state);
    }
    if ((NIL != lock)) {
      {
        SubLObject result = NIL;
        SubLObject rw_lock_var = lock;
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          result = caching_state_set_zero_arg_results_internal(caching_state, val);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
        return result;
      }
    } else {
      return caching_state_set_zero_arg_results_internal(caching_state, val);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 18629) 
  public static final SubLObject caching_state_lookup_internal(SubLObject caching_state, SubLObject key, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = $kw69$_MEMOIZED_ITEM_NOT_FOUND_;
    }
    if ((NIL != caching_state_capacity(caching_state))) {
      return cache.cache_get_without_values(caching_state_store(caching_state), key, v_default);
    } else {
      return dictionary.dictionary_lookup(caching_state_store(caching_state), key, v_default);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 18962) 
  public static final SubLObject caching_state_lookup(SubLObject caching_state, SubLObject key, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = $kw69$_MEMOIZED_ITEM_NOT_FOUND_;
    }
    if ((NIL != caching_state_lock(caching_state))) {
      {
        SubLObject result = NIL;
        SubLObject rw_lock_var = caching_state_lock(caching_state);
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
          result = caching_state_lookup_internal(caching_state, key, v_default);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
          }
        }
        return result;
      }
    } else {
      return caching_state_lookup_internal(caching_state, key, v_default);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 19225) 
  public static final SubLObject caching_state_put_internal(SubLObject caching_state, SubLObject key, SubLObject value) {
    if ((NIL != caching_state_capacity(caching_state))) {
      return cache.cache_set(caching_state_store(caching_state), key, value);
    } else {
      return dictionary.dictionary_enter(caching_state_store(caching_state), key, value);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 19494) 
  public static final SubLObject caching_state_put(SubLObject caching_state, SubLObject key, SubLObject value, SubLObject lock) {
    if ((lock == UNPROVIDED)) {
      lock = caching_state_lock(caching_state);
    }
    if ((NIL != lock)) {
      {
        SubLObject result = NIL;
        SubLObject rw_lock_var = lock;
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          result = caching_state_put_internal(caching_state, key, value);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
        return result;
      }
    } else {
      return caching_state_put_internal(caching_state, key, value);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 19730) 
  public static final SubLObject caching_state_clear_internal(SubLObject caching_state) {
    if ((NIL != caching_state_capacity(caching_state))) {
      cache.cache_clear(caching_state_store(caching_state));
    } else {
      dictionary.clear_dictionary(caching_state_store(caching_state));
    }
    _csetf_caching_state_zero_arg_results(caching_state, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
    return NIL;
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 20057) 
  public static final SubLObject caching_state_clear(SubLObject caching_state) {
    if ((NIL == caching_state)) {
      return NIL;
    }
    enforceType(caching_state, $sym36$CACHING_STATE_P);
    if ((NIL != caching_state_lock(caching_state))) {
      {
        SubLObject result = NIL;
        SubLObject rw_lock_var = caching_state_lock(caching_state);
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          result = caching_state_clear_internal(caching_state);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
        return result;
      }
    } else {
      return caching_state_clear_internal(caching_state);
    }
  }

  /** Cache in CACHING-STATE under hash code SXHASH the fact that ARGS-LIST returns the list of values RESULTS */
  @SubL(source = "cycl/memoization-state.lisp", position = 28388) 
  public static final SubLObject caching_state_enter_multi_key_n(SubLObject caching_state, SubLObject sxhash, SubLObject collisions, SubLObject results, SubLObject args_list) {
    if ((!(collisions.isList()))) {
      collisions = NIL;
    }
    if ((NIL == args_list)) {
      _csetf_caching_state_zero_arg_results(caching_state, results);
      return NIL;
    }
    collisions = cons(list(args_list, results), collisions);
    caching_state_put(caching_state, sxhash, collisions, UNPROVIDED);
    return NIL;
  }

  public static final class $memoization_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $store; }
    public SubLObject getField3() { return $current_process; }
    public SubLObject getField4() { return $lock; }
    public SubLObject getField5() { return $name; }
    public SubLObject getField6() { return $should_clone; }
    public SubLObject setField2(SubLObject value) { return $store = value; }
    public SubLObject setField3(SubLObject value) { return $current_process = value; }
    public SubLObject setField4(SubLObject value) { return $lock = value; }
    public SubLObject setField5(SubLObject value) { return $name = value; }
    public SubLObject setField6(SubLObject value) { return $should_clone = value; }
    public SubLObject $store = NIL;
    public SubLObject $current_process = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $name = NIL;
    public SubLObject $should_clone = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($memoization_state_native.class, $sym77$MEMOIZATION_STATE, $sym78$MEMOIZATION_STATE_P, $list79, $list80, new String[] {"$store", "$current_process", "$lock", "$name", "$should_clone"}, $list81, $list82, $sym83$PRINT_MEMOIZATION_STATE);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static SubLSymbol $dtp_memoization_state$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject memoization_state_p(SubLObject object) {
    return ((object.getClass() == $memoization_state_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $memoization_state_p$UnaryFunction extends UnaryFunction {
    public $memoization_state_p$UnaryFunction() { super(extractFunctionNamed("MEMOIZATION-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return memoization_state_p(arg1); }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject memoization_state_store(SubLObject object) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject memoization_state_current_process(SubLObject object) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject memoization_state_lock(SubLObject object) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject _csetf_memoization_state_store(SubLObject object, SubLObject value) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject _csetf_memoization_state_current_process(SubLObject object, SubLObject value) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject _csetf_memoization_state_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject _csetf_memoization_state_name(SubLObject object, SubLObject value) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject _csetf_memoization_state_should_clone(SubLObject object, SubLObject value) {
    checkType(object, $sym78$MEMOIZATION_STATE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 29319) 
  public static final SubLObject make_memoization_state(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $memoization_state_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw57$STORE)) {
            _csetf_memoization_state_store(v_new, current_value);
          } else if (pcase_var.eql($kw94$CURRENT_PROCESS)) {
            _csetf_memoization_state_current_process(v_new, current_value);
          } else if (pcase_var.eql($kw59$LOCK)) {
            _csetf_memoization_state_lock(v_new, current_value);
          } else if (pcase_var.eql($kw95$NAME)) {
            _csetf_memoization_state_name(v_new, current_value);
          } else if (pcase_var.eql($kw96$SHOULD_CLONE)) {
            _csetf_memoization_state_should_clone(v_new, current_value);
          } else {
            Errors.error($str64$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return a new memoization state suitable for WITH-MEMOIZATION-STATE */
  @SubL(source = "cycl/memoization-state.lisp", position = 29612) 
  public static final SubLObject create_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
    if ((name == UNPROVIDED)) {
      name = NIL;
    }
    if ((lock == UNPROVIDED)) {
      lock = NIL;
    }
    if ((should_clone == UNPROVIDED)) {
      should_clone = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject ms = make_memoization_state(UNPROVIDED);
      if ((NIL != name)) {
        enforceType(name, $sym97$STRINGP);
      }
      if ((NIL != lock)) {
        enforceType(lock, $sym98$READER_WRITER_LOCK_P);
      }
      if (test.isSymbol()) {
        test = Symbols.symbol_function(test);
      }
      enforceType(test, $sym99$FUNCTIONP);
      if (((NIL != should_clone)
           && (NIL == lock))) {
        lock = ReadWriteLocks.new_rw_lock($str100$memoization_state_clone_lock);
      }
      _csetf_memoization_state_name(ms, name);
      _csetf_memoization_state_lock(ms, lock);
      _csetf_memoization_state_store(ms, dictionary.new_dictionary(test, UNPROVIDED));
      _csetf_memoization_state_current_process(ms, NIL);
      _csetf_memoization_state_should_clone(ms, should_clone);
      return ms;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 30425) 
  public static final SubLObject new_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
    if ((name == UNPROVIDED)) {
      name = NIL;
    }
    if ((lock == UNPROVIDED)) {
      lock = NIL;
    }
    if ((should_clone == UNPROVIDED)) {
      should_clone = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return create_memoization_state(name, lock, should_clone, test);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 31357) 
  public static final SubLObject memoization_state_lookup_internal(SubLObject v_memoization_state, SubLObject key, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    return dictionary.dictionary_lookup(memoization_state_store(v_memoization_state), key, v_default);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 31543) 
  public static final SubLObject memoization_state_lookup(SubLObject v_memoization_state, SubLObject key, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject lock = memoization_state_lock(v_memoization_state);
      if ((NIL != lock)) {
        {
          SubLObject result = NIL;
          SubLObject rw_lock_var = lock;
          SubLObject needs_to_releaseP = NIL;
          try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = memoization_state_lookup_internal(v_memoization_state, key, v_default);
          } finally {
            if ((NIL != needs_to_releaseP)) {
              ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
          }
          return result;
        }
      } else {
        return memoization_state_lookup_internal(v_memoization_state, key, v_default);
      }
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 32081) 
  public static final SubLObject memoization_state_put_internal(SubLObject v_memoization_state, SubLObject key, SubLObject value) {
    return dictionary.dictionary_enter(memoization_state_store(v_memoization_state), key, value);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 32243) 
  public static final SubLObject memoization_state_put(SubLObject v_memoization_state, SubLObject key, SubLObject value) {
    {
      SubLObject lock = memoization_state_lock(v_memoization_state);
      if ((NIL != lock)) {
        {
          SubLObject result = NIL;
          SubLObject rw_lock_var = lock;
          SubLObject needs_to_releaseP = NIL;
          try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            result = memoization_state_put_internal(v_memoization_state, key, value);
          } finally {
            if ((NIL != needs_to_releaseP)) {
              ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
          }
          return result;
        }
      } else {
        return memoization_state_put_internal(v_memoization_state, key, value);
      }
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 32825) 
  public static final SubLObject memoization_state_clear_internal(SubLObject v_memoization_state) {
    return dictionary.clear_dictionary(memoization_state_store(v_memoization_state));
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 32969) 
  public static final SubLObject memoization_state_clear(SubLObject v_memoization_state) {
    if ((NIL == v_memoization_state)) {
      return NIL;
    }
    {
      SubLObject lock = memoization_state_lock(v_memoization_state);
      if ((NIL != lock)) {
        {
          SubLObject result = NIL;
          SubLObject rw_lock_var = lock;
          SubLObject needs_to_releaseP = NIL;
          try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            result = memoization_state_clear_internal(v_memoization_state);
          } finally {
            if ((NIL != needs_to_releaseP)) {
              ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
          }
          return result;
        }
      } else {
        return memoization_state_clear_internal(v_memoization_state);
      }
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 33872) 
  public static final SubLObject memoization_state_get_current_process_internal(SubLObject v_memoization_state) {
    return memoization_state_current_process(v_memoization_state);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 34591) 
  public static final SubLObject memoization_state_set_current_process_internal(SubLObject v_memoization_state, SubLObject current_process) {
    _csetf_memoization_state_current_process(v_memoization_state, current_process);
    return v_memoization_state;
  }

  /** Current memoization state.  NIL indicates no memoization is occurring. */
  @SubL(source = "cycl/memoization-state.lisp", position = 38506) 
  public static SubLSymbol $memoization_state$ = null;

  /** Return the current memoization state, or NIL if none. */
  @SubL(source = "cycl/memoization-state.lisp", position = 38813) 
  public static final SubLObject current_memoization_state() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $memoization_state$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 44235) 
  public static final SubLObject possibly_new_memoization_state() {
    {
      SubLObject current = current_memoization_state();
      if ((NIL == memoization_state_p(current))) {
        current = create_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return current;
    }
  }

  /** Clear the memoization for all functions in memoization STATE.
   deprecated Use: (memoization-state-clear state) */
  @SubL(source = "cycl/memoization-state.lisp", position = 45385) 
  public static final SubLObject clear_all_memoization(SubLObject state) {
    checkType(state, $sym78$MEMOIZATION_STATE_P);
    memoization_state_clear(state);
    return state;
  }

  /** The master list of all functions defined via define-memoized */
  @SubL(source = "cycl/memoization-state.lisp", position = 45920) 
  private static SubLSymbol $memoized_functions$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 46182) 
  public static final SubLObject note_memoized_function(SubLObject function_symbol) {
    {
      SubLObject item_var = function_symbol;
      if ((NIL == conses_high.member(item_var, $memoized_functions$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $memoized_functions$.setGlobalValue(cons(item_var, $memoized_functions$.getGlobalValue()));
      }
    }
    return function_symbol;
  }

  /** The master list of all functions defined via define-cached or define-cached-new */
  @SubL(source = "cycl/memoization-state.lisp", position = 65472) 
  private static SubLSymbol $globally_cached_functions$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 65763) 
  public static final SubLObject note_globally_cached_function(SubLObject function_symbol) {
    {
      SubLObject item_var = function_symbol;
      if ((NIL == conses_high.member(item_var, $globally_cached_functions$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $globally_cached_functions$.setGlobalValue(cons(item_var, $globally_cached_functions$.getGlobalValue()));
      }
    }
    return function_symbol;
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 66043) 
  public static final SubLObject globally_cached_functions() {
    return list_utilities.remove_if_not($sym127$FBOUNDP, $globally_cached_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 66203) 
  public static final SubLObject global_cache_variables() {
    return list_utilities.remove_if_not($sym189$BOUNDP, Mapping.mapcar($sym190$GLOBAL_CACHING_VARIABLE_NEW, globally_cached_functions()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 66347) 
  public static final SubLObject global_cache_variable_values() {
    return Mapping.mapcar($sym191$SYMBOL_VALUE, global_cache_variables());
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 66613) 
  public static final SubLObject clear_all_globally_cached_functions() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject list_var = global_cache_variable_values();
        utilities_macros.$progress_note$.setDynamicValue($str192$Clearing_all_globally_cached_func, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(Sequences.length(list_var), thread);
        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
        {
          SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
          SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
          SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
          SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
            {
              SubLObject csome_list_var = list_var;
              SubLObject caching_state = NIL;
              for (caching_state = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), caching_state = csome_list_var.first()) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                if ((NIL != caching_state)) {
                  caching_state_clear(caching_state);
                }
              }
            }
            utilities_macros.noting_percent_progress_postamble();
          } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** The list of possible triggers which can clear caches when they are triggered.  Note that :genl-preds-modified is also triggered on the addition or removal of a #$genlInverse assertion. */
  @SubL(source = "cycl/memoization-state.lisp", position = 68714) 
  private static SubLSymbol $cache_clear_triggers$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 76675) 
  public static final SubLObject create_global_caching_state_for_name(SubLObject name, SubLObject cs_variable, SubLObject capacity, SubLObject test, SubLObject args_length, SubLObject size) {
    if ((NIL == test)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject caching_state = NIL;
      SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
      SubLObject needs_to_releaseP = NIL;
      try {
        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
        caching_state = Symbols.symbol_value(cs_variable);
        if ((NIL == caching_state)) {
          caching_state = create_caching_state(ReadWriteLocks.new_rw_lock(Sequences.cconcatenate($str211$global_caching_lock_for_, Symbols.symbol_name(name))), name, args_length, capacity, test, size);
          Symbols.set(cs_variable, caching_state);
        }
      } finally {
        if ((NIL != needs_to_releaseP)) {
          ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
        }
      }
      return caching_state;
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 77910) 
  public static final SubLObject global_caching_variable_new(SubLObject name) {
    return Packages.intern(PrintLow.format(NIL, $str213$__A_CACHING_STATE_, name), UNPROVIDED);
  }

  /** The list of zero-arity function-spec-p's to funcall each time the HL store changes.
These are intended to clear HL-store-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 79894) 
  public static SubLSymbol $hl_store_cache_clear_callbacks$ = null;

  /** @param CALLBACK, a function-spec-p which should take zero arguments.
   Registers CALLBACK as a function which will be funcalled each time the HL store changes. */
  @SubL(source = "cycl/memoization-state.lisp", position = 80198) 
  public static final SubLObject register_hl_store_cache_clear_callback(SubLObject callback) {
    checkType(callback, $sym68$FUNCTION_SPEC_P);
    {
      SubLObject item_var = callback;
      if ((NIL == conses_high.member(item_var, $hl_store_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $hl_store_cache_clear_callbacks$.setGlobalValue(cons(item_var, $hl_store_cache_clear_callbacks$.getGlobalValue()));
      }
    }
    return callback;
  }

  /** Clears all HL store dependent caches, as registered by @xref register-hl-store-cache-clear-callback. */
  @SubL(source = "cycl/memoization-state.lisp", position = 80920) 
  public static final SubLObject clear_hl_store_dependent_caches() {
    {
      SubLObject cdolist_list_var = $hl_store_cache_clear_callbacks$.getGlobalValue();
      SubLObject callback = NIL;
      for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
        if ((NIL != Symbols.fboundp(callback))) {
          Functions.funcall(callback);
        }
      }
    }
    return NIL;
  }

  /** The list of zero-arity function-spec-p's to funcall each time the microtheory structure changes.
These are intended to clear mt-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 81235) 
  public static SubLSymbol $mt_dependent_cache_clear_callbacks$ = null;

  /** @param CALLBACK, a function-spec-p which should take zero arguments.
   Registers CALLBACK as a function which will be funcalled each time the microtheory structure changes. */
  @SubL(source = "cycl/memoization-state.lisp", position = 81473) 
  public static final SubLObject register_mt_dependent_cache_clear_callback(SubLObject callback) {
    checkType(callback, $sym68$FUNCTION_SPEC_P);
    {
      SubLObject item_var = callback;
      if ((NIL == conses_high.member(item_var, $mt_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        $mt_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $mt_dependent_cache_clear_callbacks$.getGlobalValue()));
      }
    }
    return callback;
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 82241) 
  public static SubLSymbol $suspend_clearing_mt_dependent_cachesP$ = null;

  @SubL(source = "cycl/memoization-state.lisp", position = 82311) 
  public static final SubLObject clear_mt_dependent_cachesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((NIL == $suspend_clearing_mt_dependent_cachesP$.getDynamicValue(thread)));
    }
  }

  /** The list of zero-arity function-spec-p's to funcall each time the genlPreds structure changes.
These are intended to clear mt-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 82560) 
  public static SubLSymbol $genl_preds_dependent_cache_clear_callbacks$ = null;

  /** The list of zero-arity function-spec-p's to funcall each time the genls structure changes.
These are intended to clear mt-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 83615) 
  public static SubLSymbol $genls_dependent_cache_clear_callbacks$ = null;

  /** The list of zero-arity function-spec-p's to funcall each time the isa structure changes.
These are intended to clear mt-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 84624) 
  public static SubLSymbol $isa_dependent_cache_clear_callbacks$ = null;

  /** The list of zero-arity function-spec-p's to funcall each time the quotedIsa structure changes.
These are intended to clear mt-dependent caches. */
  @SubL(source = "cycl/memoization-state.lisp", position = 85613) 
  public static SubLSymbol $quoted_isa_dependent_cache_clear_callbacks$ = null;

  /** Return as mutiple values the list of values in RESULTS. */
  @SubL(source = "cycl/memoization-state.lisp", position = 90431) 
  public static final SubLObject caching_results(SubLObject results) {
    if ((NIL != results.rest())) {
      return subl_promotions.values_list(results);
    } else {
      return results.first();
    }
  }

  @SubL(source = "cycl/memoization-state.lisp", position = 91676) 
  public static SubLSymbol $caching_n_sxhash_composite_value$ = null;

  public static final SubLObject declare_memoization_state_file() {
    declareFunction("note_cached_function_called", "NOTE-CACHED-FUNCTION-CALLED", 1, 0, false);
    declareFunction("note_cached_function_called_but_not_cached", "NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED", 1, 0, false);
    declareFunction("show_function_caching_results", "SHOW-FUNCTION-CACHING-RESULTS", 0, 0, false);
    declareFunction("clear_function_caching_results", "CLEAR-FUNCTION-CACHING-RESULTS", 0, 0, false);
    declareMacro("with_caching_mode", "WITH-CACHING-MODE");
    declareFunction("caching_mode_enable", "CACHING-MODE-ENABLE", 0, 1, false);
    declareFunction("caching_mode_disable", "CACHING-MODE-DISABLE", 0, 1, false);
    declareFunction("caching_disabled", "CACHING-DISABLED", 1, 0, false);
    declareFunction("sxhash_calc_n", "SXHASH-CALC-N", 1, 0, false);
    declareFunction("sxhash_calc_10", "SXHASH-CALC-10", 10, 0, false);
    declareFunction("sxhash_calc_9", "SXHASH-CALC-9", 9, 0, false);
    declareFunction("sxhash_calc_8", "SXHASH-CALC-8", 8, 0, false);
    declareFunction("sxhash_calc_7", "SXHASH-CALC-7", 7, 0, false);
    declareFunction("sxhash_calc_6", "SXHASH-CALC-6", 6, 0, false);
    declareFunction("sxhash_calc_5", "SXHASH-CALC-5", 5, 0, false);
    declareFunction("sxhash_calc_4", "SXHASH-CALC-4", 4, 0, false);
    declareFunction("sxhash_calc_3", "SXHASH-CALC-3", 3, 0, false);
    declareFunction("sxhash_calc_2", "SXHASH-CALC-2", 2, 0, false);
    declareMacro("possibly_with_memoization_state_writer_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-WRITER-LOCK");
    declareMacro("possibly_with_memoization_state_reader_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-READER-LOCK");
    declareMacro("possibly_with_caching_state_writer_lock", "POSSIBLY-WITH-CACHING-STATE-WRITER-LOCK");
    declareMacro("possibly_with_caching_state_reader_lock", "POSSIBLY-WITH-CACHING-STATE-READER-LOCK");
    declareFunction("caching_state_print_function_trampoline", "CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("caching_state_p", "CACHING-STATE-P", 1, 0, false); new $caching_state_p$UnaryFunction();
    declareFunction("caching_state_store", "CACHING-STATE-STORE", 1, 0, false);
    declareFunction("caching_state_zero_arg_results", "CACHING-STATE-ZERO-ARG-RESULTS", 1, 0, false);
    declareFunction("caching_state_lock", "CACHING-STATE-LOCK", 1, 0, false);
    declareFunction("caching_state_capacity", "CACHING-STATE-CAPACITY", 1, 0, false);
    declareFunction("caching_state_func_symbol", "CACHING-STATE-FUNC-SYMBOL", 1, 0, false);
    declareFunction("caching_state_test", "CACHING-STATE-TEST", 1, 0, false);
    declareFunction("caching_state_args_length", "CACHING-STATE-ARGS-LENGTH", 1, 0, false);
    declareFunction("_csetf_caching_state_store", "_CSETF-CACHING-STATE-STORE", 2, 0, false);
    declareFunction("_csetf_caching_state_zero_arg_results", "_CSETF-CACHING-STATE-ZERO-ARG-RESULTS", 2, 0, false);
    declareFunction("_csetf_caching_state_lock", "_CSETF-CACHING-STATE-LOCK", 2, 0, false);
    declareFunction("_csetf_caching_state_capacity", "_CSETF-CACHING-STATE-CAPACITY", 2, 0, false);
    declareFunction("_csetf_caching_state_func_symbol", "_CSETF-CACHING-STATE-FUNC-SYMBOL", 2, 0, false);
    declareFunction("_csetf_caching_state_test", "_CSETF-CACHING-STATE-TEST", 2, 0, false);
    declareFunction("_csetf_caching_state_args_length", "_CSETF-CACHING-STATE-ARGS-LENGTH", 2, 0, false);
    declareFunction("make_caching_state", "MAKE-CACHING-STATE", 0, 1, false);
    declareFunction("create_caching_state", "CREATE-CACHING-STATE", 3, 3, false);
    declareFunction("print_caching_state_internal", "PRINT-CACHING-STATE-INTERNAL", 3, 0, false);
    declareFunction("print_caching_state", "PRINT-CACHING-STATE", 3, 0, false);
    declareFunction("caching_state_get_zero_arg_results_internal", "CACHING-STATE-GET-ZERO-ARG-RESULTS-INTERNAL", 1, 0, false);
    declareFunction("caching_state_get_zero_arg_results", "CACHING-STATE-GET-ZERO-ARG-RESULTS", 1, 1, false);
    declareFunction("caching_state_set_zero_arg_results_internal", "CACHING-STATE-SET-ZERO-ARG-RESULTS-INTERNAL", 2, 0, false);
    declareFunction("caching_state_set_zero_arg_results", "CACHING-STATE-SET-ZERO-ARG-RESULTS", 2, 1, false);
    declareFunction("caching_state_lookup_internal", "CACHING-STATE-LOOKUP-INTERNAL", 2, 1, false);
    declareFunction("caching_state_lookup", "CACHING-STATE-LOOKUP", 2, 1, false);
    declareFunction("caching_state_put_internal", "CACHING-STATE-PUT-INTERNAL", 3, 0, false);
    declareFunction("caching_state_put", "CACHING-STATE-PUT", 3, 1, false);
    declareFunction("caching_state_clear_internal", "CACHING-STATE-CLEAR-INTERNAL", 1, 0, false);
    declareFunction("caching_state_clear", "CACHING-STATE-CLEAR", 1, 0, false);
    declareFunction("caching_state_get_capacity", "CACHING-STATE-GET-CAPACITY", 1, 0, false);
    declareFunction("caching_state_get_func_symbol", "CACHING-STATE-GET-FUNC-SYMBOL", 1, 0, false);
    declareFunction("caching_state_get_test", "CACHING-STATE-GET-TEST", 1, 0, false);
    declareFunction("caching_state_keys_internal", "CACHING-STATE-KEYS-INTERNAL", 1, 0, false);
    declareFunction("caching_state_keys", "CACHING-STATE-KEYS", 1, 1, false);
    declareFunction("caching_state_size_internal", "CACHING-STATE-SIZE-INTERNAL", 1, 0, false);
    declareFunction("caching_state_size", "CACHING-STATE-SIZE", 1, 1, false);
    declareFunction("caching_state_remove_internal", "CACHING-STATE-REMOVE-INTERNAL", 2, 0, false);
    declareFunction("caching_state_remove", "CACHING-STATE-REMOVE", 2, 1, false);
    declareFunction("caching_state_remove_function_results_with_args_internal", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS-INTERNAL", 2, 1, false);
    declareFunction("caching_state_remove_function_results_with_args", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 2, false);
    declareFunction("caching_state_clone_internal", "CACHING-STATE-CLONE-INTERNAL", 1, 0, false);
    declareFunction("caching_state_store_as_dictionary", "CACHING-STATE-STORE-AS-DICTIONARY", 1, 0, false);
    declareFunction("caching_state_clone", "CACHING-STATE-CLONE", 1, 1, false);
    declareFunction("caching_state_multi_key_n_is_cached", "CACHING-STATE-MULTI-KEY-N-IS-CACHED", 2, 0, false);
    declareFunction("caching_state_lookup_multi_key_n", "CACHING-STATE-LOOKUP-MULTI-KEY-N", 2, 2, false);
    declareFunction("caching_state_lookup_multi_key_1", "CACHING-STATE-LOOKUP-MULTI-KEY-1", 2, 0, false);
    declareFunction("caching_state_enter_multi_key_n", "CACHING-STATE-ENTER-MULTI-KEY-N", 5, 0, false);
    declareFunction("memoization_state_print_function_trampoline", "MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("memoization_state_p", "MEMOIZATION-STATE-P", 1, 0, false); new $memoization_state_p$UnaryFunction();
    declareFunction("memoization_state_store", "MEMOIZATION-STATE-STORE", 1, 0, false);
    declareFunction("memoization_state_current_process", "MEMOIZATION-STATE-CURRENT-PROCESS", 1, 0, false);
    declareFunction("memoization_state_lock", "MEMOIZATION-STATE-LOCK", 1, 0, false);
    declareFunction("memoization_state_name", "MEMOIZATION-STATE-NAME", 1, 0, false);
    declareFunction("memoization_state_should_clone", "MEMOIZATION-STATE-SHOULD-CLONE", 1, 0, false);
    declareFunction("_csetf_memoization_state_store", "_CSETF-MEMOIZATION-STATE-STORE", 2, 0, false);
    declareFunction("_csetf_memoization_state_current_process", "_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS", 2, 0, false);
    declareFunction("_csetf_memoization_state_lock", "_CSETF-MEMOIZATION-STATE-LOCK", 2, 0, false);
    declareFunction("_csetf_memoization_state_name", "_CSETF-MEMOIZATION-STATE-NAME", 2, 0, false);
    declareFunction("_csetf_memoization_state_should_clone", "_CSETF-MEMOIZATION-STATE-SHOULD-CLONE", 2, 0, false);
    declareFunction("make_memoization_state", "MAKE-MEMOIZATION-STATE", 0, 1, false);
    declareFunction("create_memoization_state", "CREATE-MEMOIZATION-STATE", 0, 4, false);
    declareFunction("new_memoization_state", "NEW-MEMOIZATION-STATE", 0, 4, false);
    declareFunction("print_memoization_state_internal", "PRINT-MEMOIZATION-STATE-INTERNAL", 3, 0, false);
    declareFunction("print_memoization_state", "PRINT-MEMOIZATION-STATE", 3, 0, false);
    declareFunction("memoization_state_lookup_internal", "MEMOIZATION-STATE-LOOKUP-INTERNAL", 2, 1, false);
    declareFunction("memoization_state_lookup", "MEMOIZATION-STATE-LOOKUP", 2, 1, false);
    declareFunction("memoization_state_get_caching_state_for_function", "MEMOIZATION-STATE-GET-CACHING-STATE-FOR-FUNCTION", 2, 0, false);
    declareFunction("memoization_state_put_internal", "MEMOIZATION-STATE-PUT-INTERNAL", 3, 0, false);
    declareFunction("memoization_state_put", "MEMOIZATION-STATE-PUT", 3, 0, false);
    declareFunction("memoization_state_remove_internal", "MEMOIZATION-STATE-REMOVE-INTERNAL", 2, 0, false);
    declareFunction("memoization_state_remove", "MEMOIZATION-STATE-REMOVE", 2, 0, false);
    declareFunction("memoization_state_clear_internal", "MEMOIZATION-STATE-CLEAR-INTERNAL", 1, 0, false);
    declareFunction("memoization_state_clear", "MEMOIZATION-STATE-CLEAR", 1, 0, false);
    declareFunction("memoization_state_get_test", "MEMOIZATION-STATE-GET-TEST", 1, 0, false);
    declareFunction("memoization_state_get_lock", "MEMOIZATION-STATE-GET-LOCK", 1, 0, false);
    declareFunction("memoization_state_get_name", "MEMOIZATION-STATE-GET-NAME", 1, 0, false);
    declareFunction("memoization_state_get_should_clone", "MEMOIZATION-STATE-GET-SHOULD-CLONE", 1, 0, false);
    declareFunction("memoization_state_get_current_process_internal", "MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL", 1, 0, false);
    declareFunction("memoization_state_get_current_process", "MEMOIZATION-STATE-GET-CURRENT-PROCESS", 1, 0, false);
    declareFunction("memoization_state_keys_internal", "MEMOIZATION-STATE-KEYS-INTERNAL", 1, 0, false);
    declareFunction("memoization_state_keys", "MEMOIZATION-STATE-KEYS", 1, 0, false);
    declareFunction("memoization_state_set_current_process_internal", "MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL", 2, 0, false);
    declareFunction("memoization_state_set_current_process", "MEMOIZATION-STATE-SET-CURRENT-PROCESS", 2, 0, false);
    declareFunction("memoization_state_clone", "MEMOIZATION-STATE-CLONE", 1, 0, false);
    declareFunction("memoization_state_merge_cloned_state", "MEMOIZATION-STATE-MERGE-CLONED-STATE", 2, 0, false);
    declareFunction("caching_state_results_has_argsP", "CACHING-STATE-RESULTS-HAS-ARGS?", 2, 0, false);
    declareFunction("current_memoization_state", "CURRENT-MEMOIZATION-STATE", 0, 0, false);
    declareMacro("with_memoization_state", "WITH-MEMOIZATION-STATE");
    declareFunction("possibly_clone_memoization_state", "POSSIBLY-CLONE-MEMOIZATION-STATE", 1, 0, false);
    declareFunction("possibly_merge_back_memoization_state", "POSSIBLY-MERGE-BACK-MEMOIZATION-STATE", 3, 0, false);
    declareMacro("with_new_memoization_state", "WITH-NEW-MEMOIZATION-STATE");
    declareMacro("with_possibly_new_memoization_state", "WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
    declareFunction("possibly_new_memoization_state", "POSSIBLY-NEW-MEMOIZATION-STATE", 0, 0, false);
    declareFunction("clear_memoization", "CLEAR-MEMOIZATION", 2, 0, false);
    declareFunction("clear_current_memoization", "CLEAR-CURRENT-MEMOIZATION", 1, 0, false);
    declareFunction("clear_all_memoization", "CLEAR-ALL-MEMOIZATION", 1, 0, false);
    declareFunction("clear_all_current_memoization", "CLEAR-ALL-CURRENT-MEMOIZATION", 0, 0, false);
    declareFunction("note_memoized_function", "NOTE-MEMOIZED-FUNCTION", 1, 0, false);
    declareFunction("memoized_functions", "MEMOIZED-FUNCTIONS", 0, 0, false);
    declareMacro("define_memoized", "DEFINE-MEMOIZED");
    declareFunction("macro_test_to_run_time_test", "MACRO-TEST-TO-RUN-TIME-TEST", 1, 0, false);
    declareFunction("define_memoized_internal", "DEFINE-MEMOIZED-INTERNAL", 8, 0, false);
    declareFunction("define_memoized_internal_0_or_1", "DEFINE-MEMOIZED-INTERNAL-0-OR-1", 8, 0, false);
    declareFunction("define_memoized_internal_n", "DEFINE-MEMOIZED-INTERNAL-N", 8, 0, false);
    declareFunction("caching_sxhash_code", "CACHING-SXHASH-CODE", 1, 0, false);
    declareFunction("caching_lookup_code", "CACHING-LOOKUP-CODE", 5, 0, false);
    declareFunction("lookup_memoization_state_code", "LOOKUP-MEMOIZATION-STATE-CODE", 4, 0, false);
    declareFunction("note_memoized_function_code", "NOTE-MEMOIZED-FUNCTION-CODE", 1, 0, false);
    declareFunction("note_globally_cached_function", "NOTE-GLOBALLY-CACHED-FUNCTION", 1, 0, false);
    declareFunction("globally_cached_functions", "GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
    declareFunction("global_cache_variables", "GLOBAL-CACHE-VARIABLES", 0, 0, false);
    declareFunction("global_cache_variable_values", "GLOBAL-CACHE-VARIABLE-VALUES", 0, 0, false);
    declareFunction("memoized_or_cached_functions", "MEMOIZED-OR-CACHED-FUNCTIONS", 0, 0, false);
    declareFunction("clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
    declareMacro("define_cached_new", "DEFINE-CACHED-NEW");
    declareMacro("define_cached", "DEFINE-CACHED");
    declareMacro("define_cached_multiarg", "DEFINE-CACHED-MULTIARG");
    declareFunction("cache_clear_trigger_p", "CACHE-CLEAR-TRIGGER-P", 1, 0, false);
    declareFunction("define_cached_internal", "DEFINE-CACHED-INTERNAL", 8, 0, false);
    declareFunction("define_cached_internal_0_or_1", "DEFINE-CACHED-INTERNAL-0-OR-1", 8, 0, false);
    declareFunction("define_cached_internal_n", "DEFINE-CACHED-INTERNAL-N", 8, 0, false);
    declareFunction("load_caching_state_contents_from_hash_table", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE", 2, 0, false);
    declareFunction("load_caching_state_contents_from_hash_table_internal", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE-INTERNAL", 2, 0, false);
    declareFunction("get_caching_state_contents_as_hash_table", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE", 1, 0, false);
    declareFunction("get_caching_state_contents_as_hash_table_internal", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE-INTERNAL", 1, 0, false);
    declareFunction("get_caching_state_for_globally_cached_function", "GET-CACHING-STATE-FOR-GLOBALLY-CACHED-FUNCTION", 1, 4, false);
    declareFunction("create_global_caching_state_for_name", "CREATE-GLOBAL-CACHING-STATE-FOR-NAME", 6, 0, false);
    declareFunction("memoize_caching_state_for_function_new", "MEMOIZE-CACHING-STATE-FOR-FUNCTION-NEW", 2, 0, false);
    declareFunction("global_caching_reset_from_function", "GLOBAL-CACHING-RESET-FROM-FUNCTION", 1, 0, false);
    declareFunction("global_caching_lock", "GLOBAL-CACHING-LOCK", 1, 0, false);
    declareFunction("global_caching_variable_new", "GLOBAL-CACHING-VARIABLE-NEW", 1, 0, false);
    declareFunction("global_caching_variable_code", "GLOBAL-CACHING-VARIABLE-CODE", 1, 0, false);
    declareFunction("global_caching_reset_function", "GLOBAL-CACHING-RESET-FUNCTION", 1, 0, false);
    declareFunction("global_caching_register_reset_code_new", "GLOBAL-CACHING-REGISTER-RESET-CODE-NEW", 2, 0, false);
    declareFunction("global_caching_reset_code_new", "GLOBAL-CACHING-RESET-CODE-NEW", 1, 0, false);
    declareFunction("global_caching_remove_function", "GLOBAL-CACHING-REMOVE-FUNCTION", 1, 0, false);
    declareFunction("global_caching_n_remove_code_new", "GLOBAL-CACHING-N-REMOVE-CODE-NEW", 3, 0, false);
    declareFunction("register_hl_store_cache_clear_callback", "REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_hl_store_cache_clear_callback", "DEREGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("clear_hl_store_dependent_caches", "CLEAR-HL-STORE-DEPENDENT-CACHES", 0, 0, false);
    declareFunction("register_mt_dependent_cache_clear_callback", "REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_mt_dependent_cache_clear_callback", "DEREGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("clear_mt_dependent_cachesP", "CLEAR-MT-DEPENDENT-CACHES?", 0, 0, false);
    declareMacro("without_clearing_mt_dependent_caches", "WITHOUT-CLEARING-MT-DEPENDENT-CACHES");
    declareFunction("register_genl_preds_dependent_cache_clear_callback", "REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_genl_preds_dependent_cache_clear_callback", "DEREGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("register_genls_dependent_cache_clear_callback", "REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_genls_dependent_cache_clear_callback", "DEREGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("register_isa_dependent_cache_clear_callback", "REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_isa_dependent_cache_clear_callback", "DEREGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("register_quoted_isa_dependent_cache_clear_callback", "REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareFunction("deregister_quoted_isa_dependent_cache_clear_callback", "DEREGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
    declareMacro("memoized_already", "MEMOIZED-ALREADY");
    declareMacro("cached_already", "CACHED-ALREADY");
    declareFunction("define_formal_args", "DEFINE-FORMAL-ARGS", 1, 0, false);
    declareFunction("caching_results", "CACHING-RESULTS", 1, 0, false);
    declareFunction("global_caching_note_function_code", "GLOBAL-CACHING-NOTE-FUNCTION-CODE", 1, 0, false);
    declareFunction("caching_internal_function", "CACHING-INTERNAL-FUNCTION", 1, 0, false);
    declareFunction("caching_internal_function_code", "CACHING-INTERNAL-FUNCTION-CODE", 3, 0, false);
    declareFunction("caching_faccess_code", "CACHING-FACCESS-CODE", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_memoization_state_file() {
    $global_caching_lock$ = defconstant("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock($str0$global_caching_lock));
    $caching_mode_should_monitor$ = deflexical("*CACHING-MODE-SHOULD-MONITOR*", maybeDefault( $sym1$_CACHING_MODE_SHOULD_MONITOR_, $caching_mode_should_monitor$, NIL));
    $cache_monitor_hash$ = deflexical("*CACHE-MONITOR-HASH*", maybeDefault( $sym2$_CACHE_MONITOR_HASH_, $cache_monitor_hash$, ()-> (Hashtables.make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED))));
    $cache_monitor_failure_hash$ = deflexical("*CACHE-MONITOR-FAILURE-HASH*", maybeDefault( $sym3$_CACHE_MONITOR_FAILURE_HASH_, $cache_monitor_failure_hash$, ()-> (Hashtables.make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED))));
    $allow_function_caching_to_be_disabled$ = deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", maybeDefault( $sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_, $allow_function_caching_to_be_disabled$, NIL));
    $caching_mode_enabled$ = defvar("*CACHING-MODE-ENABLED*", $kw9$ALL);
    $caching_mode_disabled$ = defvar("*CACHING-MODE-DISABLED*", NIL);
    $function_caching_enabledP$ = defparameter("*FUNCTION-CACHING-ENABLED?*", T);
    $dtp_caching_state$ = defconstant("*DTP-CACHING-STATE*", $sym35$CACHING_STATE);
    $dtp_memoization_state$ = defconstant("*DTP-MEMOIZATION-STATE*", $sym77$MEMOIZATION_STATE);
    $memoization_state$ = defparameter("*MEMOIZATION-STATE*", NIL);
    $memoized_functions$ = deflexical("*MEMOIZED-FUNCTIONS*", maybeDefault( $sym126$_MEMOIZED_FUNCTIONS_, $memoized_functions$, NIL));
    $globally_cached_functions$ = deflexical("*GLOBALLY-CACHED-FUNCTIONS*", maybeDefault( $sym188$_GLOBALLY_CACHED_FUNCTIONS_, $globally_cached_functions$, NIL));
    $cache_clear_triggers$ = deflexical("*CACHE-CLEAR-TRIGGERS*", $list201);
    $hl_store_cache_clear_callbacks$ = deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym234$_HL_STORE_CACHE_CLEAR_CALLBACKS_, $hl_store_cache_clear_callbacks$, NIL));
    $mt_dependent_cache_clear_callbacks$ = deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym235$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_, $mt_dependent_cache_clear_callbacks$, NIL));
    $suspend_clearing_mt_dependent_cachesP$ = defparameter("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*", NIL);
    $genl_preds_dependent_cache_clear_callbacks$ = deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym237$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_, $genl_preds_dependent_cache_clear_callbacks$, NIL));
    $genls_dependent_cache_clear_callbacks$ = deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym238$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_, $genls_dependent_cache_clear_callbacks$, NIL));
    $isa_dependent_cache_clear_callbacks$ = deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym239$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_, $isa_dependent_cache_clear_callbacks$, NIL));
    $quoted_isa_dependent_cache_clear_callbacks$ = deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", maybeDefault( $sym240$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_, $quoted_isa_dependent_cache_clear_callbacks$, NIL));
    $caching_n_sxhash_composite_value$ = defconstant("*CACHING-N-SXHASH-COMPOSITE-VALUE*", $int21$167);
    return NIL;
  }

  public static final SubLObject setup_memoization_state_file() {
        subl_macro_promotions.declare_defglobal($sym1$_CACHING_MODE_SHOULD_MONITOR_);
    subl_macro_promotions.declare_defglobal($sym2$_CACHE_MONITOR_HASH_);
    subl_macro_promotions.declare_defglobal($sym3$_CACHE_MONITOR_FAILURE_HASH_);
    subl_macro_promotions.declare_defglobal($sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), Symbols.symbol_function($sym42$CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym43$CACHING_STATE_STORE, $sym44$_CSETF_CACHING_STATE_STORE);
    Structures.def_csetf($sym45$CACHING_STATE_ZERO_ARG_RESULTS, $sym46$_CSETF_CACHING_STATE_ZERO_ARG_RESULTS);
    Structures.def_csetf($sym47$CACHING_STATE_LOCK, $sym48$_CSETF_CACHING_STATE_LOCK);
    Structures.def_csetf($sym49$CACHING_STATE_CAPACITY, $sym50$_CSETF_CACHING_STATE_CAPACITY);
    Structures.def_csetf($sym51$CACHING_STATE_FUNC_SYMBOL, $sym52$_CSETF_CACHING_STATE_FUNC_SYMBOL);
    Structures.def_csetf($sym53$CACHING_STATE_TEST, $sym54$_CSETF_CACHING_STATE_TEST);
    Structures.def_csetf($sym55$CACHING_STATE_ARGS_LENGTH, $sym56$_CSETF_CACHING_STATE_ARGS_LENGTH);
    Equality.identity($sym35$CACHING_STATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), Symbols.symbol_function($sym84$MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym85$MEMOIZATION_STATE_STORE, $sym86$_CSETF_MEMOIZATION_STATE_STORE);
    Structures.def_csetf($sym87$MEMOIZATION_STATE_CURRENT_PROCESS, $sym88$_CSETF_MEMOIZATION_STATE_CURRENT_PROCESS);
    Structures.def_csetf($sym24$MEMOIZATION_STATE_LOCK, $sym89$_CSETF_MEMOIZATION_STATE_LOCK);
    Structures.def_csetf($sym90$MEMOIZATION_STATE_NAME, $sym91$_CSETF_MEMOIZATION_STATE_NAME);
    Structures.def_csetf($sym92$MEMOIZATION_STATE_SHOULD_CLONE, $sym93$_CSETF_MEMOIZATION_STATE_SHOULD_CLONE);
    Equality.identity($sym77$MEMOIZATION_STATE);
    access_macros.register_macro_helper($sym124$POSSIBLY_NEW_MEMOIZATION_STATE, $sym125$WITH_POSSIBLY_NEW_MEMOIZATION_STATE);
    subl_macro_promotions.declare_defglobal($sym126$_MEMOIZED_FUNCTIONS_);
    access_macros.register_external_symbol($sym128$DEFINE_MEMOIZED);
    subl_macro_promotions.declare_defglobal($sym188$_GLOBALLY_CACHED_FUNCTIONS_);
    Storage.register_low_memory_callback(Symbols.symbol_function($sym193$CLEAR_ALL_GLOBALLY_CACHED_FUNCTIONS));
    access_macros.register_external_symbol($sym194$DEFINE_CACHED_NEW);
    subl_macro_promotions.declare_defglobal($sym234$_HL_STORE_CACHE_CLEAR_CALLBACKS_);
    subl_macro_promotions.declare_defglobal($sym235$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
    subl_macro_promotions.declare_defglobal($sym237$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
    subl_macro_promotions.declare_defglobal($sym238$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
    subl_macro_promotions.declare_defglobal($sym239$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
    subl_macro_promotions.declare_defglobal($sym240$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
    access_macros.register_macro_helper($sym157$CACHING_RESULTS, $list246);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$global_caching_lock = makeString("global-caching-lock");
  public static final SubLSymbol $sym1$_CACHING_MODE_SHOULD_MONITOR_ = makeSymbol("*CACHING-MODE-SHOULD-MONITOR*");
  public static final SubLSymbol $sym2$_CACHE_MONITOR_HASH_ = makeSymbol("*CACHE-MONITOR-HASH*");
  public static final SubLSymbol $sym3$_CACHE_MONITOR_FAILURE_HASH_ = makeSymbol("*CACHE-MONITOR-FAILURE-HASH*");
  public static final SubLSymbol $sym4$_ = makeSymbol(">");
  public static final SubLSymbol $sym5$CDR = makeSymbol("CDR");
  public static final SubLString $str6$Cached_Function_Call___S__S___ = makeString("Cached Function Call: ~S(~S)~%");
  public static final SubLString $str7$Missed_Cached_Function_Call___S__ = makeString("Missed Cached Function Call: ~S(~S)~%");
  public static final SubLSymbol $sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_ = makeSymbol("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*");
  public static final SubLSymbol $kw9$ALL = makeKeyword("ALL");
  public static final SubLList $list10 = list(list(makeSymbol("&KEY"), makeSymbol("DISABLE"), makeSymbol("ENABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list11 = list(makeKeyword("DISABLE"), makeKeyword("ENABLE"));
  public static final SubLSymbol $kw12$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw13$DISABLE = makeKeyword("DISABLE");
  public static final SubLSymbol $kw14$ENABLE = makeKeyword("ENABLE");
  public static final SubLString $str15$DISABLE_must_be__ALL = makeString("DISABLE must be :ALL");
  public static final SubLString $str16$ENABLE_must_be__ALL = makeString("ENABLE must be :ALL");
  public static final SubLSymbol $sym17$CLET = makeSymbol("CLET");
  public static final SubLList $list18 = list(list(makeSymbol("*CACHING-MODE-ENABLED*"), makeSymbol("*CACHING-MODE-ENABLED*")), list(makeSymbol("*CACHING-MODE-DISABLED*"), makeSymbol("*CACHING-MODE-DISABLED*")), list(makeSymbol("*FUNCTION-CACHING-ENABLED?*"), makeSymbol("*FUNCTION-CACHING-ENABLED?*")));
  public static final SubLSymbol $sym19$CACHING_MODE_ENABLE = makeSymbol("CACHING-MODE-ENABLE");
  public static final SubLSymbol $sym20$CACHING_MODE_DISABLE = makeSymbol("CACHING-MODE-DISABLE");
  public static final SubLInteger $int21$167 = makeInteger(167);
  public static final SubLList $list22 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym23$LOCK = makeSymbol("LOCK");
  public static final SubLSymbol $sym24$MEMOIZATION_STATE_LOCK = makeSymbol("MEMOIZATION-STATE-LOCK");
  public static final SubLSymbol $sym25$PIF = makeSymbol("PIF");
  public static final SubLList $list26 = list(makeSymbol("RESULT"));
  public static final SubLSymbol $sym27$WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");
  public static final SubLList $list28 = list(makeSymbol("LOCK"));
  public static final SubLSymbol $sym29$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym30$RESULT = makeSymbol("RESULT");
  public static final SubLList $list31 = list(list(makeSymbol("RET"), makeSymbol("RESULT")));
  public static final SubLSymbol $sym32$RET = makeSymbol("RET");
  public static final SubLSymbol $sym33$WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");
  public static final SubLList $list34 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$CACHING_STATE = makeSymbol("CACHING-STATE");
  public static final SubLSymbol $sym36$CACHING_STATE_P = makeSymbol("CACHING-STATE-P");
  public static final SubLList $list37 = list(makeSymbol("STORE"), makeSymbol("ZERO-ARG-RESULTS"), makeSymbol("LOCK"), makeSymbol("CAPACITY"), makeSymbol("FUNC-SYMBOL"), makeSymbol("TEST"), makeSymbol("ARGS-LENGTH"));
  public static final SubLList $list38 = list(makeKeyword("STORE"), makeKeyword("ZERO-ARG-RESULTS"), makeKeyword("LOCK"), makeKeyword("CAPACITY"), makeKeyword("FUNC-SYMBOL"), makeKeyword("TEST"), makeKeyword("ARGS-LENGTH"));
  public static final SubLList $list39 = list(makeSymbol("CACHING-STATE-STORE"), makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("CACHING-STATE-LOCK"), makeSymbol("CACHING-STATE-CAPACITY"), makeSymbol("CACHING-STATE-FUNC-SYMBOL"), makeSymbol("CACHING-STATE-TEST"), makeSymbol("CACHING-STATE-ARGS-LENGTH"));
  public static final SubLList $list40 = list(makeSymbol("_CSETF-CACHING-STATE-STORE"), makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("_CSETF-CACHING-STATE-LOCK"), makeSymbol("_CSETF-CACHING-STATE-CAPACITY"), makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL"), makeSymbol("_CSETF-CACHING-STATE-TEST"), makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH"));
  public static final SubLSymbol $sym41$PRINT_CACHING_STATE = makeSymbol("PRINT-CACHING-STATE");
  public static final SubLSymbol $sym42$CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym43$CACHING_STATE_STORE = makeSymbol("CACHING-STATE-STORE");
  public static final SubLSymbol $sym44$_CSETF_CACHING_STATE_STORE = makeSymbol("_CSETF-CACHING-STATE-STORE");
  public static final SubLSymbol $sym45$CACHING_STATE_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS");
  public static final SubLSymbol $sym46$_CSETF_CACHING_STATE_ZERO_ARG_RESULTS = makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS");
  public static final SubLSymbol $sym47$CACHING_STATE_LOCK = makeSymbol("CACHING-STATE-LOCK");
  public static final SubLSymbol $sym48$_CSETF_CACHING_STATE_LOCK = makeSymbol("_CSETF-CACHING-STATE-LOCK");
  public static final SubLSymbol $sym49$CACHING_STATE_CAPACITY = makeSymbol("CACHING-STATE-CAPACITY");
  public static final SubLSymbol $sym50$_CSETF_CACHING_STATE_CAPACITY = makeSymbol("_CSETF-CACHING-STATE-CAPACITY");
  public static final SubLSymbol $sym51$CACHING_STATE_FUNC_SYMBOL = makeSymbol("CACHING-STATE-FUNC-SYMBOL");
  public static final SubLSymbol $sym52$_CSETF_CACHING_STATE_FUNC_SYMBOL = makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL");
  public static final SubLSymbol $sym53$CACHING_STATE_TEST = makeSymbol("CACHING-STATE-TEST");
  public static final SubLSymbol $sym54$_CSETF_CACHING_STATE_TEST = makeSymbol("_CSETF-CACHING-STATE-TEST");
  public static final SubLSymbol $sym55$CACHING_STATE_ARGS_LENGTH = makeSymbol("CACHING-STATE-ARGS-LENGTH");
  public static final SubLSymbol $sym56$_CSETF_CACHING_STATE_ARGS_LENGTH = makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH");
  public static final SubLSymbol $kw57$STORE = makeKeyword("STORE");
  public static final SubLSymbol $kw58$ZERO_ARG_RESULTS = makeKeyword("ZERO-ARG-RESULTS");
  public static final SubLSymbol $kw59$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw60$CAPACITY = makeKeyword("CAPACITY");
  public static final SubLSymbol $kw61$FUNC_SYMBOL = makeKeyword("FUNC-SYMBOL");
  public static final SubLSymbol $kw62$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw63$ARGS_LENGTH = makeKeyword("ARGS-LENGTH");
  public static final SubLString $str64$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym65$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym66$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym67$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym68$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $kw69$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str70$__caching_state_function___A_lock = makeString("#<caching-state function: ~A lock: '~A' capacity: ~A test: ~S ~%    store: ");
  public static final SubLString $str71$_ = makeString(">");
  public static final SubLString $str72$Attempting_to_remove_arg_list_tha = makeString("Attempting to remove arg list that isn't in cache: ~S~%");
  public static final SubLList $list73 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULT"));
  public static final SubLSymbol $sym74$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw75$RECALC = makeKeyword("RECALC");
  public static final SubLList $list76 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULTS"));
  public static final SubLSymbol $sym77$MEMOIZATION_STATE = makeSymbol("MEMOIZATION-STATE");
  public static final SubLSymbol $sym78$MEMOIZATION_STATE_P = makeSymbol("MEMOIZATION-STATE-P");
  public static final SubLList $list79 = list(makeSymbol("STORE"), makeSymbol("CURRENT-PROCESS"), makeSymbol("LOCK"), makeSymbol("NAME"), makeSymbol("SHOULD-CLONE"));
  public static final SubLList $list80 = list(makeKeyword("STORE"), makeKeyword("CURRENT-PROCESS"), makeKeyword("LOCK"), makeKeyword("NAME"), makeKeyword("SHOULD-CLONE"));
  public static final SubLList $list81 = list(makeSymbol("MEMOIZATION-STATE-STORE"), makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("MEMOIZATION-STATE-LOCK"), makeSymbol("MEMOIZATION-STATE-NAME"), makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE"));
  public static final SubLList $list82 = list(makeSymbol("_CSETF-MEMOIZATION-STATE-STORE"), makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK"), makeSymbol("_CSETF-MEMOIZATION-STATE-NAME"), makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE"));
  public static final SubLSymbol $sym83$PRINT_MEMOIZATION_STATE = makeSymbol("PRINT-MEMOIZATION-STATE");
  public static final SubLSymbol $sym84$MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym85$MEMOIZATION_STATE_STORE = makeSymbol("MEMOIZATION-STATE-STORE");
  public static final SubLSymbol $sym86$_CSETF_MEMOIZATION_STATE_STORE = makeSymbol("_CSETF-MEMOIZATION-STATE-STORE");
  public static final SubLSymbol $sym87$MEMOIZATION_STATE_CURRENT_PROCESS = makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS");
  public static final SubLSymbol $sym88$_CSETF_MEMOIZATION_STATE_CURRENT_PROCESS = makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS");
  public static final SubLSymbol $sym89$_CSETF_MEMOIZATION_STATE_LOCK = makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK");
  public static final SubLSymbol $sym90$MEMOIZATION_STATE_NAME = makeSymbol("MEMOIZATION-STATE-NAME");
  public static final SubLSymbol $sym91$_CSETF_MEMOIZATION_STATE_NAME = makeSymbol("_CSETF-MEMOIZATION-STATE-NAME");
  public static final SubLSymbol $sym92$MEMOIZATION_STATE_SHOULD_CLONE = makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE");
  public static final SubLSymbol $sym93$_CSETF_MEMOIZATION_STATE_SHOULD_CLONE = makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE");
  public static final SubLSymbol $kw94$CURRENT_PROCESS = makeKeyword("CURRENT-PROCESS");
  public static final SubLSymbol $kw95$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw96$SHOULD_CLONE = makeKeyword("SHOULD-CLONE");
  public static final SubLSymbol $sym97$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym98$READER_WRITER_LOCK_P = makeSymbol("READER-WRITER-LOCK-P");
  public static final SubLSymbol $sym99$FUNCTIONP = makeSymbol("FUNCTIONP");
  public static final SubLString $str100$memoization_state_clone_lock = makeString("memoization-state-clone-lock");
  public static final SubLString $str101$__memoization_state_name____A__lo = makeString("#<memoization-state name: '~A' lock: '~A' should-clone: ~A current-process: '~A' ~%    store: ~A ");
  public static final SubLString $str102$Clone__ = makeString("Clone: ");
  public static final SubLString $str103$Need_to_implement_dictionary_copy = makeString("Need to implement dictionary copy!");
  public static final SubLString $str104$implement_me_in__memoization_stat = makeString("implement me in: memoization-state-merge-cloned-state");
  public static final SubLSymbol $sym105$CACHING_STATE_RESULTS_HAS_ARGS_ = makeSymbol("CACHING-STATE-RESULTS-HAS-ARGS?");
  public static final SubLSymbol $sym106$ORIGINAL_MEMOIZATION_PROCESS = makeUninternedSymbol("ORIGINAL-MEMOIZATION-PROCESS");
  public static final SubLSymbol $sym107$CURRENT_PROC = makeUninternedSymbol("CURRENT-PROC");
  public static final SubLSymbol $sym108$LOCAL_STATE = makeUninternedSymbol("LOCAL-STATE");
  public static final SubLSymbol $sym109$_MEMOIZATION_STATE_ = makeSymbol("*MEMOIZATION-STATE*");
  public static final SubLList $list110 = list(NIL);
  public static final SubLSymbol $sym111$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym112$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym113$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym114$MEMOIZATION_STATE_GET_CURRENT_PROCESS_INTERNAL = makeSymbol("MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL");
  public static final SubLList $list115 = list(list(makeSymbol("CURRENT-PROCESS")));
  public static final SubLSymbol $sym116$MEMOIZATION_STATE_SET_CURRENT_PROCESS_INTERNAL = makeSymbol("MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL");
  public static final SubLList $list117 = list(list(makeSymbol("ERROR"), makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.")));
  public static final SubLSymbol $sym118$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym119$STATE = makeUninternedSymbol("STATE");
  public static final SubLList $list120 = list(list(makeSymbol("NEW-MEMOIZATION-STATE")));
  public static final SubLSymbol $sym121$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
  public static final SubLSymbol $sym122$STATE = makeUninternedSymbol("STATE");
  public static final SubLList $list123 = list(list(makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE")));
  public static final SubLSymbol $sym124$POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE");
  public static final SubLSymbol $sym125$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
  public static final SubLSymbol $sym126$_MEMOIZED_FUNCTIONS_ = makeSymbol("*MEMOIZED-FUNCTIONS*");
  public static final SubLSymbol $sym127$FBOUNDP = makeSymbol("FBOUNDP");
  public static final SubLSymbol $sym128$DEFINE_MEMOIZED = makeSymbol("DEFINE-MEMOIZED");
  public static final SubLList $list129 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("MEMOIZATION-STATE-FUNCTION"), makeSymbol("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list130 = list(makeKeyword("TEST"), makeKeyword("CAPACITY"), makeKeyword("FACCESS"), makeKeyword("MEMOIZATION-STATE-FUNCTION"), makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS"));
  public static final SubLSymbol $kw131$FACCESS = makeKeyword("FACCESS");
  public static final SubLSymbol $kw132$MEMOIZATION_STATE_FUNCTION = makeKeyword("MEMOIZATION-STATE-FUNCTION");
  public static final SubLSymbol $kw133$MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS = makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS");
  public static final SubLList $list134 = list(makeSymbol("QUOTE"), EQL);
  public static final SubLString $str135$Got_a_test_expression_of_length__ = makeString("Got a test expression of length: ~S for ~S~%");
  public static final SubLSymbol $sym136$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym137$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLString $str138$Don_t_know_how_to_convert___S_to_ = makeString("Don't know how to convert: ~S to a test~%");
  public static final SubLSymbol $sym139$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");
  public static final SubLSymbol $sym140$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");
  public static final SubLSymbol $sym141$RESULTS = makeUninternedSymbol("RESULTS");
  public static final SubLSymbol $sym142$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym143$DECLAIM = makeSymbol("DECLAIM");
  public static final SubLSymbol $sym144$FACCESS = makeSymbol("FACCESS");
  public static final SubLSymbol $sym145$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym146$NOTE_CACHED_FUNCTION_CALLED = makeSymbol("NOTE-CACHED-FUNCTION-CALLED");
  public static final SubLSymbol $sym147$CACHING_DISABLED = makeSymbol("CACHING-DISABLED");
  public static final SubLSymbol $sym148$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym149$MEMOIZATION_STATE_LOOKUP = makeSymbol("MEMOIZATION-STATE-LOOKUP");
  public static final SubLSymbol $sym150$CREATE_CACHING_STATE = makeSymbol("CREATE-CACHING-STATE");
  public static final SubLSymbol $sym151$MEMOIZATION_STATE_PUT = makeSymbol("MEMOIZATION-STATE-PUT");
  public static final SubLList $list152 = list(makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&"));
  public static final SubLSymbol $sym153$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED = makeSymbol("NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED");
  public static final SubLSymbol $sym154$MULTIPLE_VALUE_LIST = makeSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym155$CACHING_STATE_SET_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-SET-ZERO-ARG-RESULTS");
  public static final SubLSymbol $sym156$CACHING_STATE_PUT = makeSymbol("CACHING-STATE-PUT");
  public static final SubLSymbol $sym157$CACHING_RESULTS = makeSymbol("CACHING-RESULTS");
  public static final SubLSymbol $sym158$SXHASH = makeUninternedSymbol("SXHASH");
  public static final SubLSymbol $sym159$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");
  public static final SubLSymbol $sym160$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");
  public static final SubLSymbol $sym161$RESULTS = makeUninternedSymbol("RESULTS");
  public static final SubLSymbol $sym162$COLLISIONS = makeUninternedSymbol("COLLISIONS");
  public static final SubLSymbol $sym163$CACHING_STATE_LOOKUP = makeSymbol("CACHING-STATE-LOOKUP");
  public static final SubLSymbol $sym164$CACHING_STATE_ENTER_MULTI_KEY_N = makeSymbol("CACHING-STATE-ENTER-MULTI-KEY-N");
  public static final SubLSymbol $sym165$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym166$SXHASH_CALC_2 = makeSymbol("SXHASH-CALC-2");
  public static final SubLSymbol $sym167$SXHASH_CALC_3 = makeSymbol("SXHASH-CALC-3");
  public static final SubLSymbol $sym168$SXHASH_CALC_4 = makeSymbol("SXHASH-CALC-4");
  public static final SubLSymbol $sym169$SXHASH_CALC_5 = makeSymbol("SXHASH-CALC-5");
  public static final SubLSymbol $sym170$SXHASH_CALC_6 = makeSymbol("SXHASH-CALC-6");
  public static final SubLSymbol $sym171$SXHASH_CALC_7 = makeSymbol("SXHASH-CALC-7");
  public static final SubLSymbol $sym172$SXHASH_CALC_8 = makeSymbol("SXHASH-CALC-8");
  public static final SubLSymbol $sym173$SXHASH_CALC_9 = makeSymbol("SXHASH-CALC-9");
  public static final SubLSymbol $sym174$SXHASH_CALC_10 = makeSymbol("SXHASH-CALC-10");
  public static final SubLSymbol $sym175$SXHASH_CALC_N = makeSymbol("SXHASH-CALC-N");
  public static final SubLSymbol $sym176$CACHING_STATE_GET_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-GET-ZERO-ARG-RESULTS");
  public static final SubLSymbol $sym177$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym178$COLLISION = makeSymbol("COLLISION");
  public static final SubLList $list179 = list(list(makeSymbol("CACHED-ARGS"), list(makeSymbol("FIRST"), makeSymbol("COLLISION"))), list(makeSymbol("RESULTS2"), list(makeSymbol("SECOND"), makeSymbol("COLLISION"))));
  public static final SubLList $list180 = list(list(makeSymbol("FIRST"), makeSymbol("CACHED-ARGS")));
  public static final SubLList $list181 = list(makeSymbol("CPOP"), makeSymbol("CACHED-ARGS"));
  public static final SubLSymbol $sym182$CACHED_ARGS = makeSymbol("CACHED-ARGS");
  public static final SubLList $list183 = list(makeSymbol("CNOT"), list(makeSymbol("REST"), makeSymbol("CACHED-ARGS")));
  public static final SubLList $list184 = list(list(makeSymbol("RET"), list(makeSymbol("CACHING-RESULTS"), makeSymbol("RESULTS2"))));
  public static final SubLSymbol $sym185$CACHING_STATE_LOOKUP_MULTI_KEY_N = makeSymbol("CACHING-STATE-LOOKUP-MULTI-KEY-N");
  public static final SubLSymbol $sym186$MAKE_SYMBOL = makeSymbol("MAKE-SYMBOL");
  public static final SubLSymbol $sym187$NOTE_MEMOIZED_FUNCTION = makeSymbol("NOTE-MEMOIZED-FUNCTION");
  public static final SubLSymbol $sym188$_GLOBALLY_CACHED_FUNCTIONS_ = makeSymbol("*GLOBALLY-CACHED-FUNCTIONS*");
  public static final SubLSymbol $sym189$BOUNDP = makeSymbol("BOUNDP");
  public static final SubLSymbol $sym190$GLOBAL_CACHING_VARIABLE_NEW = makeSymbol("GLOBAL-CACHING-VARIABLE-NEW");
  public static final SubLSymbol $sym191$SYMBOL_VALUE = makeSymbol("SYMBOL-VALUE");
  public static final SubLString $str192$Clearing_all_globally_cached_func = makeString("Clearing all globally cached functions");
  public static final SubLSymbol $sym193$CLEAR_ALL_GLOBALLY_CACHED_FUNCTIONS = makeSymbol("CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS");
  public static final SubLSymbol $sym194$DEFINE_CACHED_NEW = makeSymbol("DEFINE-CACHED-NEW");
  public static final SubLList $list195 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("SIZE"), makeSymbol("CLEAR-WHEN")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list196 = list(makeKeyword("TEST"), makeKeyword("CAPACITY"), makeKeyword("FACCESS"), makeKeyword("SIZE"), makeKeyword("CLEAR-WHEN"));
  public static final SubLSymbol $kw197$SIZE = makeKeyword("SIZE");
  public static final SubLSymbol $kw198$CLEAR_WHEN = makeKeyword("CLEAR-WHEN");
  public static final SubLList $list199 = list(makeSymbol("NAME"), list(makeSymbol("ARG")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list200 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list201 = list(makeKeyword("HL-STORE-MODIFIED"), makeKeyword("GENL-MT-MODIFIED"), makeKeyword("GENL-PREDS-MODIFIED"), makeKeyword("GENLS-MODIFIED"), makeKeyword("ISA-MODIFIED"), makeKeyword("QUOTED-ISA-MODIFIED"));
  public static final SubLSymbol $sym202$CACHE_CLEAR_TRIGGER_P = makeSymbol("CACHE-CLEAR-TRIGGER-P");
  public static final SubLSymbol $sym203$RESULTS = makeUninternedSymbol("RESULTS");
  public static final SubLSymbol $sym204$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");
  public static final SubLSymbol $sym205$CREATE_GLOBAL_CACHING_STATE_FOR_NAME = makeSymbol("CREATE-GLOBAL-CACHING-STATE-FOR-NAME");
  public static final SubLSymbol $sym206$SXHASH = makeUninternedSymbol("SXHASH");
  public static final SubLSymbol $sym207$RESULTS = makeUninternedSymbol("RESULTS");
  public static final SubLSymbol $sym208$COLLISIONS = makeUninternedSymbol("COLLISIONS");
  public static final SubLSymbol $sym209$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");
  public static final SubLSymbol $sym210$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLString $str211$global_caching_lock_for_ = makeString("global caching lock for ");
  public static final SubLString $str212$__A_RW_LOCK_ = makeString("*~A-RW-LOCK*");
  public static final SubLString $str213$__A_CACHING_STATE_ = makeString("*~A-CACHING-STATE*");
  public static final SubLSymbol $sym214$DEFLEXICAL_PRIVATE = makeSymbol("DEFLEXICAL-PRIVATE");
  public static final SubLString $str215$CLEAR__A = makeString("CLEAR-~A");
  public static final SubLSymbol $kw216$HL_STORE_MODIFIED = makeKeyword("HL-STORE-MODIFIED");
  public static final SubLSymbol $sym217$REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK");
  public static final SubLSymbol $kw218$GENL_MT_MODIFIED = makeKeyword("GENL-MT-MODIFIED");
  public static final SubLSymbol $sym219$REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK");
  public static final SubLSymbol $kw220$GENL_PREDS_MODIFIED = makeKeyword("GENL-PREDS-MODIFIED");
  public static final SubLSymbol $sym221$REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK");
  public static final SubLSymbol $kw222$GENLS_MODIFIED = makeKeyword("GENLS-MODIFIED");
  public static final SubLSymbol $sym223$REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK");
  public static final SubLSymbol $kw224$ISA_MODIFIED = makeKeyword("ISA-MODIFIED");
  public static final SubLSymbol $sym225$REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");
  public static final SubLSymbol $kw226$QUOTED_ISA_MODIFIED = makeKeyword("QUOTED-ISA-MODIFIED");
  public static final SubLSymbol $sym227$REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");
  public static final SubLList $list228 = list(makeSymbol("PROGN"));
  public static final SubLSymbol $sym229$CS = makeSymbol("CS");
  public static final SubLList $list230 = list(list(makeSymbol("PWHEN"), makeSymbol("CS"), list(makeSymbol("CACHING-STATE-CLEAR"), makeSymbol("CS"))));
  public static final SubLList $list231 = list(list(makeSymbol("RET"), NIL));
  public static final SubLString $str232$REMOVE__A = makeString("REMOVE-~A");
  public static final SubLSymbol $sym233$CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS = makeSymbol("CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS");
  public static final SubLSymbol $sym234$_HL_STORE_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*HL-STORE-CACHE-CLEAR-CALLBACKS*");
  public static final SubLSymbol $sym235$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
  public static final SubLList $list236 = list(list(makeSymbol("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*"), T));
  public static final SubLSymbol $sym237$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
  public static final SubLSymbol $sym238$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
  public static final SubLSymbol $sym239$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
  public static final SubLSymbol $sym240$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = makeSymbol("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
  public static final SubLList $list241 = list(list(makeSymbol("ANSWER"), makeSymbol("&KEY"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("FORM"));
  public static final SubLList $list242 = list(makeKeyword("TEST"));
  public static final SubLList $list243 = list(makeSymbol("ERROR"), makeString("Unimplemented macro memoized-already."));
  public static final SubLList $list244 = list(makeSymbol("ERROR"), makeString("Unimplemented macro cached-already."));
  public static final SubLSymbol $sym245$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLList $list246 = list(makeSymbol("DEFINE-CACHED-NEW"), makeSymbol("DEFINE-MEMOIZED"));
  public static final SubLSymbol $sym247$NOTE_GLOBALLY_CACHED_FUNCTION = makeSymbol("NOTE-GLOBALLY-CACHED-FUNCTION");
  public static final SubLString $str248$_A_INTERNAL = makeString("~A-INTERNAL");
  public static final SubLSymbol $sym249$DEFINE_PROTECTED = makeSymbol("DEFINE-PROTECTED");
  public static final SubLList $list250 = list(makeSymbol("EXTERNAL"), makeSymbol("API-PROVISIONAL"));
  public static final SubLSymbol $sym251$REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");
  public static final SubLSymbol $sym252$PUBLIC = makeSymbol("PUBLIC");
  public static final SubLSymbol $sym253$API = makeSymbol("API");
  public static final SubLSymbol $sym254$REGISTER_CYC_API_FUNCTION = makeSymbol("REGISTER-CYC-API-FUNCTION");
  public static final SubLList $list255 = list(makeString(""), NIL, NIL);
  public static final SubLList $list256 = list(makeSymbol("PRIVATE"), makeSymbol("PROTECTED"), makeSymbol("PUBLIC"));
  public static final SubLString $str257$_A_is_not_a_known_FACCESS_visibil = makeString("~A is not a known FACCESS visibility type for cached functions.");

  //// Initializers

  public void declareFunctions() {
    declare_memoization_state_file();
  }

  public void initializeVariables() {
    init_memoization_state_file();
  }

  public void runTopLevelForms() {
    setup_memoization_state_file();
  }

}
