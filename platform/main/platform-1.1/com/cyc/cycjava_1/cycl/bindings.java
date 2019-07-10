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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class bindings extends SubLTranslatedFile {

  //// Constructor

  private bindings() {}
  public static final SubLFile me = new bindings();
  public static final String myName = "com.cyc.cycjava_1.cycl.bindings";

  //// Definitions

  @SubL(source = "cycl/bindings.lisp", position = 810) 
  private static SubLSymbol $hl_identity_binding_caching_state$ = null;

  @SubL(source = "cycl/bindings.lisp", position = 1018) 
  private static SubLSymbol $hl_identity_bindings_caching_state$ = null;

  /** Return bindings of the form ((?varN-1 . ?varN-1) ... (?var0 . ?var0)) */
  @SubL(source = "cycl/bindings.lisp", position = 1018) 
  public static final SubLObject hl_identity_bindings_internal(SubLObject n) {
    checkType(n, $sym1$NON_NEGATIVE_INTEGER_P);
    if (n.isZero()) {
      return NIL;
    } else {
      {
        SubLObject n_1 = number_utilities.f_1_(n);
        SubLObject variable = variables.find_variable_by_id(n_1);
        return add_variable_binding(variable, variable, hl_identity_bindings(n_1));
      }
    }
  }

  @SubL(source = "cycl/bindings.lisp", position = 1018) 
  public static final SubLObject hl_identity_bindings(SubLObject n) {
    {
      SubLObject caching_state = $hl_identity_bindings_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym4$HL_IDENTITY_BINDINGS, $sym5$_HL_IDENTITY_BINDINGS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(hl_identity_bindings_internal(n)));
          memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/bindings.lisp", position = 1395) 
  public static final SubLObject binding_p(SubLObject object) {
    return Types.consp(object);
  }

  public static final class $binding_p$UnaryFunction extends UnaryFunction {
    public $binding_p$UnaryFunction() { super(extractFunctionNamed("BINDING-P")); }
    public SubLObject processItem(SubLObject arg1) { return binding_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is a binding list */
  @SubL(source = "cycl/bindings.lisp", position = 1823) 
  public static final SubLObject binding_list_p(SubLObject object) {
    return makeBoolean(((NIL != list_utilities.non_dotted_list_p(object))
           && (NIL != list_utilities.every_in_list($sym7$BINDING_P, object, UNPROVIDED))));
  }

  /** True if OBJECT is of the form (<el-var> . <whatever>). */
  @SubL(source = "cycl/bindings.lisp", position = 2522) 
  public static final SubLObject inference_binding_p(SubLObject object) {
    return makeBoolean(((NIL != binding_p(object))
           && (NIL != cycl_variables.el_varP(variable_binding_variable(object)))));
  }

  public static final class $inference_binding_p$UnaryFunction extends UnaryFunction {
    public $inference_binding_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-BINDING-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_binding_p(arg1); }
  }

  /** True if OBJECT is of the form (#$ELInferenceBindingFn <var> <whatever>) */
  @SubL(source = "cycl/bindings.lisp", position = 3252) 
  public static final SubLObject kb_binding_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (cycl_utilities.nat_functor(object) == $const12$ELInferenceBindingFn)
           && (NIL != cycl_variables.el_varP(cycl_utilities.nat_arg1(object, UNPROVIDED)))));
  }

  /** True if OBJECT is of the form (#$TheSet [<kb-binding-p>]) */
  @SubL(source = "cycl/bindings.lisp", position = 3554) 
  public static final SubLObject kb_binding_set_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_empty_set_p(object))
          || ((NIL != el_utilities.possibly_naut_p(object))
             && (NIL != el_utilities.el_extensional_set_p(object))
             && (NIL != list_utilities.every_in_list(Symbols.symbol_function($sym13$KB_BINDING_P), cycl_utilities.nat_args(object, UNPROVIDED), UNPROVIDED)))));
  }

  /** Substitute the value of variables in bindings into object,
   taking recursively bound variables into account. */
  @SubL(source = "cycl/bindings.lisp", position = 4104) 
  public static final SubLObject subst_bindings(SubLObject v_bindings, SubLObject object) {
    return ((NIL != binding_list_p(v_bindings)) ? ((SubLObject) apply_bindings(v_bindings, object)) : object);
  }

  public static final class $subst_bindings$BinaryFunction extends BinaryFunction {
    public $subst_bindings$BinaryFunction() { super(extractFunctionNamed("SUBST-BINDINGS")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return subst_bindings(arg1, arg2); }
  }

  /** Return T iff the binding lists BINDINGS-1 and BINDINGS-2 are equivalent */
  @SubL(source = "cycl/bindings.lisp", position = 4618) 
  public static final SubLObject bindings_equalP(SubLObject bindings_1, SubLObject bindings_2) {
    return list_utilities.fast_sets_equalP(bindings_1, bindings_2, Symbols.symbol_function(EQUAL));
  }

  /** Return T iff VARIABLE has some associated value in BINDINGS */
  @SubL(source = "cycl/bindings.lisp", position = 5811) 
  public static final SubLObject variable_bound_p(SubLObject variable, SubLObject v_bindings) {
    return list_utilities.sublisp_boolean(get_variable_binding(variable, v_bindings));
  }

  /** Add a new (VARIABLE . VALUE) variable-binding to BINDINGS */
  @SubL(source = "cycl/bindings.lisp", position = 6231) 
  public static final SubLObject add_variable_binding(SubLObject variable, SubLObject value, SubLObject v_bindings) {
    return cons(make_variable_binding(variable, value), v_bindings);
  }

  @SubL(source = "cycl/bindings.lisp", position = 6420) 
  public static final SubLObject make_variable_binding(SubLObject variable, SubLObject value) {
    return cons(variable, value);
  }

  /** Get the value part of a single binding. */
  @SubL(source = "cycl/bindings.lisp", position = 6513) 
  public static final SubLObject variable_binding_variable(SubLObject binding) {
    return binding.first();
  }

  public static final class $variable_binding_variable$UnaryFunction extends UnaryFunction {
    public $variable_binding_variable$UnaryFunction() { super(extractFunctionNamed("VARIABLE-BINDING-VARIABLE")); }
    public SubLObject processItem(SubLObject arg1) { return variable_binding_variable(arg1); }
  }

  /** Get the value part of a single binding. */
  @SubL(source = "cycl/bindings.lisp", position = 6625) 
  public static final SubLObject variable_binding_value(SubLObject binding) {
    return binding.rest();
  }

  public static final class $variable_binding_value$UnaryFunction extends UnaryFunction {
    public $variable_binding_value$UnaryFunction() { super(extractFunctionNamed("VARIABLE-BINDING-VALUE")); }
    public SubLObject processItem(SubLObject arg1) { return variable_binding_value(arg1); }
  }

  /** Return the variable-binding for VARIABLE in BINDINGS, or NIL if none. */
  @SubL(source = "cycl/bindings.lisp", position = 6734) 
  public static final SubLObject get_variable_binding(SubLObject variable, SubLObject v_bindings) {
    return conses_high.assoc(variable, v_bindings, UNPROVIDED, UNPROVIDED);
  }

  /** Return the variable-binding which binds something to VALUE, or NIL if none.
Assumes there is a unique one. */
  @SubL(source = "cycl/bindings.lisp", position = 6893) 
  public static final SubLObject get_value_binding(SubLObject value, SubLObject v_bindings, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return conses_high.rassoc(value, v_bindings, test, UNPROVIDED);
  }

  /** @param BINDINGS; A -> B
@return a modified version of TREE with all elements of A
replaced by corresponding elements of B */
  @SubL(source = "cycl/bindings.lisp", position = 8009) 
  public static final SubLObject apply_bindings(SubLObject v_bindings, SubLObject tree) {
    checkType(v_bindings, $sym19$BINDINGS_P);
    return conses_high.sublis(v_bindings, tree, UNPROVIDED, UNPROVIDED);
  }

  /** @param BINDINGS-TO-APPLY  ; A -> B
   @return a modified version of TARGET-BINDINGS with all elements of A in the values
 (cdrs) replaced by corresponding elements of B. */
  @SubL(source = "cycl/bindings.lisp", position = 8249) 
  public static final SubLObject apply_bindings_to_values(SubLObject bindings_to_apply, SubLObject target_bindings) {
    checkType(bindings_to_apply, $sym19$BINDINGS_P);
    checkType(target_bindings, $sym19$BINDINGS_P);
    {
      SubLObject modified_target_bindings = NIL;
      SubLObject cdolist_list_var = target_bindings;
      SubLObject target_binding = NIL;
      for (target_binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), target_binding = cdolist_list_var.first()) {
        {
          SubLObject datum = target_binding;
          SubLObject current = datum;
          SubLObject variable = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          variable = current.first();
          current = current.rest();
          value = current;
          {
            SubLObject modified_value = apply_bindings(bindings_to_apply, value);
            SubLObject modified_target_binding = make_variable_binding(variable, modified_value);
            modified_target_bindings = cons(modified_target_binding, modified_target_bindings);
          }
        }
      }
      return Sequences.nreverse(modified_target_bindings);
    }
  }

  /** @param BINDINGS; A -> B
@return a modified version of TREE with all elements of B
replaced by corresponding elements of A */
  @SubL(source = "cycl/bindings.lisp", position = 8991) 
  public static final SubLObject apply_bindings_backwards(SubLObject v_bindings, SubLObject tree) {
    checkType(v_bindings, $sym19$BINDINGS_P);
    return subl_promotions.rsublis(v_bindings, tree, UNPROVIDED, UNPROVIDED);
  }

  /** A destructive version of @xref apply-bindings. */
  @SubL(source = "cycl/bindings.lisp", position = 10172) 
  public static final SubLObject napply_bindings(SubLObject v_bindings, SubLObject tree) {
    checkType(v_bindings, $sym19$BINDINGS_P);
    return conses_high.nsublis(v_bindings, tree, Symbols.symbol_function(EQ), UNPROVIDED);
  }

  /** Like @xref napply-bindings-backwards that assumes a proper list rather than an arbitrary tree. */
  @SubL(source = "cycl/bindings.lisp", position = 10583) 
  public static final SubLObject napply_bindings_backwards_to_list(SubLObject v_bindings, SubLObject list) {
    checkType(v_bindings, $sym19$BINDINGS_P);
    {
      SubLObject cons = NIL;
      for (cons = list; (!(cons.isAtom())); cons = cons.rest()) {
        ConsesLow.rplaca(cons, subl_promotions.nrsublis(v_bindings, cons.first(), UNPROVIDED, UNPROVIDED));
      }
    }
    return list;
  }

  /** @param A-TO-B-VARIABLE-MAP; A -> B
   @param A-TO-C-BINDINGS;     A -> C
   @return binding-list-p;     B -> C
Errors if A-TO-B-VARIABLE-MAP does not contain bindings for all As.
@example (transfer-variable-map-to-bindings '((?X . ?Y)) '((?X . #$Muffet))) -> ((?Y . #$Muffet)) */
  @SubL(source = "cycl/bindings.lisp", position = 10905) 
  public static final SubLObject transfer_variable_map_to_bindings(SubLObject a_to_b_variable_map, SubLObject a_to_c_bindings) {
    return transfer_variable_map_to_bindings_int(a_to_b_variable_map, a_to_c_bindings, T);
  }

  /** @param A-TO-B-VARIABLE-MAP; A -> B
   @param A-TO-C-BINDINGS;     A -> C
   @return binding-list-p;     B -> C
Filters out bindings for which there is no binding to B in A-TO-B-VARIABLE-MAP.
@example (transfer-variable-map-to-bindings-filtered '((?X . ?Y)) '((?X . #$Muffet) (?Z . #$Dog))) -> ((?Y . #$Muffet)) */
  @SubL(source = "cycl/bindings.lisp", position = 11411) 
  public static final SubLObject transfer_variable_map_to_bindings_filtered(SubLObject a_to_b_variable_map, SubLObject a_to_c_bindings) {
    return transfer_variable_map_to_bindings_int(a_to_b_variable_map, a_to_c_bindings, NIL);
  }

  @SubL(source = "cycl/bindings.lisp", position = 12862) 
  public static final SubLObject transfer_variable_map_to_bindings_int(SubLObject a_to_b_variable_map, SubLObject a_to_c_bindings, SubLObject error_if_incompleteP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(a_to_b_variable_map, $sym20$VARIABLE_MAP_P);
      checkType(a_to_c_bindings, $sym19$BINDINGS_P);
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = a_to_c_bindings;
        SubLObject a_to_c_binding = NIL;
        for (a_to_c_binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), a_to_c_binding = cdolist_list_var.first()) {
          {
            SubLObject datum = a_to_c_binding;
            SubLObject current = datum;
            SubLObject a_var = NIL;
            SubLObject c_value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
            a_var = current.first();
            current = current.rest();
            c_value = current;
            {
              SubLObject a_to_b_binding = get_variable_binding(a_var, a_to_b_variable_map);
              if ((NIL != error_if_incompleteP)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                  if ((NIL == a_to_b_binding)) {
                    Errors.error($str22$Incomplete_variable_map__a_applie, a_to_b_variable_map, a_to_c_bindings);
                  }
                }
              }
              if ((NIL != a_to_b_binding)) {
                {
                  SubLObject b_var = variable_binding_value(a_to_b_binding);
                  result = add_variable_binding(b_var, c_value, result);
                }
              }
            }
          }
        }
        return Sequences.nreverse(result);
      }
    }
  }

  /** @param A-TO-B-VARIABLE-MAP; A -> B
   @param B-TO-C-BINDINGS;     B -> C
   @return binding-list-p;     A -> C
Errors if A-TO-B-VARIABLE-MAP does not contain bindings for all Bs.
@example (compose-bindings '((?X . ?A) (?Y . ?B) (?Z . ?C)) '((?A . #$Cat) (?C . #$Dog))) -> ((?X . #$Cat) (?Z . #$Dog)) */
  @SubL(source = "cycl/bindings.lisp", position = 13710) 
  public static final SubLObject compose_bindings(SubLObject a_to_b_variable_map, SubLObject b_to_c_bindings) {
    return compose_bindings_int(a_to_b_variable_map, b_to_c_bindings, T);
  }

  /** @param A-TO-B-VARIABLE-MAP; A -> B
   @param B-TO-C-BINDINGS;     B -> C
   @return binding-list-p;     A -> C
Filters out bindings for which there is no binding to B in A-TO-B-VARIABLE-MAP.
@example (compose-bindings-filtered '((?X . ?A) (?Y . ?B) (?Z . ?C)) '((?A . #$Cat) (?C . #$Dog) (?D . #$Horse))) -> ((?X . #$Cat) (?Z . #$Dog)) */
  @SubL(source = "cycl/bindings.lisp", position = 14254) 
  public static final SubLObject compose_bindings_filtered(SubLObject a_to_b_variable_map, SubLObject b_to_c_bindings) {
    return compose_bindings_int(a_to_b_variable_map, b_to_c_bindings, NIL);
  }

  @SubL(source = "cycl/bindings.lisp", position = 14746) 
  public static final SubLObject compose_bindings_int(SubLObject a_to_b_variable_map, SubLObject b_to_c_bindings, SubLObject error_if_incompleteP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(a_to_b_variable_map, $sym20$VARIABLE_MAP_P);
      checkType(b_to_c_bindings, $sym19$BINDINGS_P);
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = b_to_c_bindings;
        SubLObject b_to_c_binding = NIL;
        for (b_to_c_binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), b_to_c_binding = cdolist_list_var.first()) {
          {
            SubLObject datum = b_to_c_binding;
            SubLObject current = datum;
            SubLObject b_var = NIL;
            SubLObject c_value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            b_var = current.first();
            current = current.rest();
            c_value = current;
            {
              SubLObject a_to_b_binding = get_value_binding(b_var, a_to_b_variable_map, UNPROVIDED);
              if ((NIL != error_if_incompleteP)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                  if ((NIL == a_to_b_binding)) {
                    Errors.error($str22$Incomplete_variable_map__a_applie, a_to_b_variable_map, b_to_c_bindings);
                  }
                }
              }
              if ((NIL != a_to_b_binding)) {
                {
                  SubLObject a_var = variable_binding_variable(a_to_b_binding);
                  result = add_variable_binding(a_var, c_value, result);
                }
              }
            }
          }
        }
        return Sequences.nreverse(result);
      }
    }
  }

  /** @param BINDINGS; A -> B
@return binding-list-p; B -> A */
  @SubL(source = "cycl/bindings.lisp", position = 15461) 
  public static final SubLObject invert_bindings(SubLObject v_bindings) {
    return list_utilities.flip_alist(v_bindings);
  }

  /** Filters out bindings from BINDINGS whose variables are not
members of VARIABLE-KEEP-LIST. */
  @SubL(source = "cycl/bindings.lisp", position = 15594) 
  public static final SubLObject filter_bindings_by_variables(SubLObject v_bindings, SubLObject variable_keep_list) {
    {
      SubLObject filtered_bindings = NIL;
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        {
          SubLObject datum = binding;
          SubLObject current = datum;
          SubLObject variable = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          variable = current.first();
          current = current.rest();
          value = current;
          if ((NIL != subl_promotions.memberP(variable, variable_keep_list, UNPROVIDED, UNPROVIDED))) {
            filtered_bindings = cons(make_variable_binding(variable, value), filtered_bindings);
          }
        }
      }
      filtered_bindings = Sequences.nreverse(filtered_bindings);
      return filtered_bindings;
    }
  }

  @SubL(source = "cycl/bindings.lisp", position = 16086) 
  public static final SubLObject inference_simplify_unification_bindings(SubLObject v_bindings) {
    if ((NIL != Sequences.find_if($sym10$INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
      v_bindings = Sequences.remove_if($sym10$INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    if ((NIL != unification_success_token_p(v_bindings))) {
      v_bindings = NIL;
    }
    return v_bindings;
  }

  @SubL(source = "cycl/bindings.lisp", position = 16496) 
  public static final SubLObject possibly_optimize_bindings_wrt_equivalence(SubLObject old_bindings) {
    if (((NIL == old_bindings)
        || (NIL != list_utilities.singletonP(old_bindings)))) {
      return old_bindings;
    }
    while (true) {
      {
        SubLObject new_bindings = NIL;
        SubLObject cdolist_list_var = old_bindings;
        SubLObject binding = NIL;
        for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
          {
            SubLObject old_value = variable_binding_value(binding);
            if ((NIL == variables.fully_bound_p(old_value))) {
              {
                SubLObject new_value = apply_bindings_backwards(old_bindings, old_value);
                SubLObject variable = variable_binding_variable(binding);
                if (((NIL == list_utilities.simple_tree_findP(variable, new_value))
                     && (!(new_value.equal(old_value))))) {
                  binding = make_variable_binding(variable, new_value);
                }
              }
            }
          }
          new_bindings = cons(binding, new_bindings);
        }
        new_bindings = Sequences.nreverse(new_bindings);
        if (new_bindings.equal(old_bindings)) {
          return old_bindings;
        }
        old_bindings = new_bindings;
      }
    }
  }

  /** All bindings in BINDINGS that bind a variable to a fully bound value. */
  @SubL(source = "cycl/bindings.lisp", position = 17526) 
  public static final SubLObject bindings_to_closed(SubLObject v_bindings) {
    return list_utilities.remove_if_not(Symbols.symbol_function($sym24$FULLY_BOUND_P), v_bindings, Symbols.symbol_function($sym17$VARIABLE_BINDING_VALUE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Sort BINDINGS via the variable order in VARIABLES */
  @SubL(source = "cycl/bindings.lisp", position = 17721) 
  public static final SubLObject stable_sort_bindings(SubLObject v_bindings, SubLObject v_variables) {
    return list_utilities.stable_sort_via_position(v_bindings, v_variables, Symbols.symbol_function(EQ), Symbols.symbol_function($sym16$VARIABLE_BINDING_VARIABLE));
  }

  /** Dummy unification binding indicating unification success, with no variables. */
  @SubL(source = "cycl/bindings.lisp", position = 17921) 
  private static SubLSymbol $dummy_binding$ = null;

  /** Dummy unification binding list indicating unification success, with no variables. */
  @SubL(source = "cycl/bindings.lisp", position = 18715) 
  private static SubLSymbol $unification_success_token$ = null;

  /** Return a token indicating successful unification without any substitution required. */
  @SubL(source = "cycl/bindings.lisp", position = 19005) 
  public static final SubLObject unification_success_token() {
    return $unification_success_token$.getGlobalValue();
  }

  /** Return T iff BINDINGS are a token indicating unification success without any substitution required. */
  @SubL(source = "cycl/bindings.lisp", position = 19175) 
  public static final SubLObject unification_success_token_p(SubLObject v_bindings) {
    return Equality.equal(v_bindings, $unification_success_token$.getGlobalValue());
  }

  /** @return a kb-binding-p, denoting a binding of VARIABLE to VALUE. */
  @SubL(source = "cycl/bindings.lisp", position = 25771) 
  public static final SubLObject make_kb_binding(SubLObject variable, SubLObject value) {
    checkType(variable, $sym32$EL_VAR_);
    return el_utilities.make_el_formula($const12$ELInferenceBindingFn, list(variable, value), UNPROVIDED);
  }

  /** @return a kb-binding-set-p, consisting of BINDINGS. */
  @SubL(source = "cycl/bindings.lisp", position = 26117) 
  public static final SubLObject make_kb_binding_set(SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == list_utilities.every_in_list($sym13$KB_BINDING_P, v_bindings, UNPROVIDED))) {
          Errors.error($str34$Some_element_of__A_is_not_a_KB_BI, v_bindings);
        }
      }
      return el_utilities.make_el_formula($const35$TheSet, v_bindings, UNPROVIDED);
    }
  }

  /** @return a kb-set-of-binding-sets-p, consisting of BINDING-SETS */
  @SubL(source = "cycl/bindings.lisp", position = 26369) 
  public static final SubLObject make_kb_set_of_binding_sets(SubLObject binding_sets) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == list_utilities.every_in_list($sym14$KB_BINDING_SET_P, binding_sets, UNPROVIDED))) {
          Errors.error($str36$Some_element_of__A_is_not_a_KB_BI, binding_sets);
        }
      }
      return el_utilities.make_el_formula($const35$TheSet, binding_sets, UNPROVIDED);
    }
  }

  public static final SubLObject declare_bindings_file() {
    declareFunction(myName, "clear_hl_identity_binding", "CLEAR-HL-IDENTITY-BINDING", 0, 0, false);
    declareFunction(myName, "remove_hl_identity_binding", "REMOVE-HL-IDENTITY-BINDING", 1, 0, false);
    declareFunction(myName, "hl_identity_binding_internal", "HL-IDENTITY-BINDING-INTERNAL", 1, 0, false);
    declareFunction(myName, "hl_identity_binding", "HL-IDENTITY-BINDING", 1, 0, false);
    declareFunction(myName, "clear_hl_identity_bindings", "CLEAR-HL-IDENTITY-BINDINGS", 0, 0, false);
    declareFunction(myName, "remove_hl_identity_bindings", "REMOVE-HL-IDENTITY-BINDINGS", 1, 0, false);
    declareFunction(myName, "hl_identity_bindings_internal", "HL-IDENTITY-BINDINGS-INTERNAL", 1, 0, false);
    declareFunction(myName, "hl_identity_bindings", "HL-IDENTITY-BINDINGS", 1, 0, false);
    declareFunction(myName, "binding_p", "BINDING-P", 1, 0, false); new $binding_p$UnaryFunction();
    declareFunction(myName, "variable_to_variable_binding_p", "VARIABLE-TO-VARIABLE-BINDING-P", 1, 0, false);
    declareFunction(myName, "bindings_p", "BINDINGS-P", 1, 0, false);
    declareFunction(myName, "binding_list_p", "BINDING-LIST-P", 1, 0, false);
    declareFunction(myName, "non_empty_binding_list_p", "NON-EMPTY-BINDING-LIST-P", 1, 0, false);
    declareFunction(myName, "binding_lists_p", "BINDING-LISTS-P", 1, 0, false);
    declareFunction(myName, "variable_map_p", "VARIABLE-MAP-P", 1, 0, false);
    declareFunction(myName, "inference_binding_p", "INFERENCE-BINDING-P", 1, 0, false); new $inference_binding_p$UnaryFunction();
    declareFunction(myName, "inference_binding_set_p", "INFERENCE-BINDING-SET-P", 1, 0, false);
    declareFunction(myName, "inference_set_of_binding_sets_p", "INFERENCE-SET-OF-BINDING-SETS-P", 1, 0, false);
    declareFunction(myName, "kb_binding_p", "KB-BINDING-P", 1, 0, false);
    declareFunction(myName, "kb_binding_set_p", "KB-BINDING-SET-P", 1, 0, false);
    declareFunction(myName, "kb_set_of_binding_sets_p", "KB-SET-OF-BINDING-SETS-P", 1, 0, false);
    declareFunction(myName, "subst_bindings", "SUBST-BINDINGS", 2, 0, false); new $subst_bindings$BinaryFunction();
    declareFunction(myName, "equal_bindings", "EQUAL-BINDINGS", 2, 0, false);
    declareFunction(myName, "bindings_equalP", "BINDINGS-EQUAL?", 2, 0, false);
    declareFunction(myName, "lists_of_binding_lists_equalP", "LISTS-OF-BINDING-LISTS-EQUAL?", 2, 0, false);
    declareFunction(myName, "compare_lists_of_binding_lists", "COMPARE-LISTS-OF-BINDING-LISTS", 2, 0, false);
    declareFunction(myName, "variable_bound_p", "VARIABLE-BOUND-P", 2, 0, false);
    declareFunction(myName, "variable_lookup", "VARIABLE-LOOKUP", 2, 0, false);
    declareFunction(myName, "add_variable_binding", "ADD-VARIABLE-BINDING", 3, 0, false);
    declareFunction(myName, "make_variable_binding", "MAKE-VARIABLE-BINDING", 2, 0, false);
    declareFunction(myName, "variable_binding_variable", "VARIABLE-BINDING-VARIABLE", 1, 0, false); new $variable_binding_variable$UnaryFunction();
    declareFunction(myName, "variable_binding_value", "VARIABLE-BINDING-VALUE", 1, 0, false); new $variable_binding_value$UnaryFunction();
    declareFunction(myName, "get_variable_binding", "GET-VARIABLE-BINDING", 2, 0, false);
    declareFunction(myName, "get_value_binding", "GET-VALUE-BINDING", 2, 1, false);
    declareFunction(myName, "bindings_variables", "BINDINGS-VARIABLES", 1, 0, false);
    declareFunction(myName, "bindings_values", "BINDINGS-VALUES", 1, 0, false);
    declareFunction(myName, "apply_binding", "APPLY-BINDING", 2, 0, false);
    declareFunction(myName, "apply_bindings", "APPLY-BINDINGS", 2, 0, false);
    declareFunction(myName, "apply_bindings_to_values", "APPLY-BINDINGS-TO-VALUES", 2, 0, false);
    declareFunction(myName, "apply_bindings_backwards", "APPLY-BINDINGS-BACKWARDS", 2, 0, false);
    declareFunction(myName, "apply_bindings_backwards_to_values", "APPLY-BINDINGS-BACKWARDS-TO-VALUES", 2, 0, false);
    declareFunction(myName, "napply_binding", "NAPPLY-BINDING", 2, 0, false);
    declareFunction(myName, "napply_bindings", "NAPPLY-BINDINGS", 2, 0, false);
    declareFunction(myName, "napply_bindings_backwards", "NAPPLY-BINDINGS-BACKWARDS", 2, 0, false);
    declareFunction(myName, "napply_bindings_backwards_to_list", "NAPPLY-BINDINGS-BACKWARDS-TO-LIST", 2, 0, false);
    declareFunction(myName, "transfer_variable_map_to_bindings", "TRANSFER-VARIABLE-MAP-TO-BINDINGS", 2, 0, false);
    declareFunction(myName, "transfer_variable_map_to_bindings_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-FILTERED", 2, 0, false);
    declareFunction(myName, "transfer_variable_map_to_bindings_backwards", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS", 2, 0, false);
    declareFunction(myName, "transfer_variable_map_to_bindings_backwards_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS-FILTERED", 2, 0, false);
    declareFunction(myName, "transfer_variable_map_to_bindings_int", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-INT", 3, 0, false);
    declareFunction(myName, "compose_bindings", "COMPOSE-BINDINGS", 2, 0, false);
    declareFunction(myName, "compose_bindings_filtered", "COMPOSE-BINDINGS-FILTERED", 2, 0, false);
    declareFunction(myName, "compose_bindings_int", "COMPOSE-BINDINGS-INT", 3, 0, false);
    declareFunction(myName, "invert_bindings", "INVERT-BINDINGS", 1, 0, false);
    declareFunction(myName, "filter_bindings_by_variables", "FILTER-BINDINGS-BY-VARIABLES", 2, 0, false);
    declareFunction(myName, "inference_simplify_unification_bindings", "INFERENCE-SIMPLIFY-UNIFICATION-BINDINGS", 1, 0, false);
    declareFunction(myName, "possibly_optimize_bindings_wrt_equivalence", "POSSIBLY-OPTIMIZE-BINDINGS-WRT-EQUIVALENCE", 1, 0, false);
    declareFunction(myName, "bindings_to_closed", "BINDINGS-TO-CLOSED", 1, 0, false);
    declareFunction(myName, "stable_sort_bindings", "STABLE-SORT-BINDINGS", 2, 0, false);
    declareFunction(myName, "remove_dummy_binding", "REMOVE-DUMMY-BINDING", 1, 0, false);
    declareFunction(myName, "delete_dummy_binding", "DELETE-DUMMY-BINDING", 1, 0, false);
    declareFunction(myName, "tree_find_dummy_bindingP", "TREE-FIND-DUMMY-BINDING?", 1, 0, false);
    declareFunction(myName, "unification_success_token", "UNIFICATION-SUCCESS-TOKEN", 0, 0, false);
    declareFunction(myName, "unification_success_token_p", "UNIFICATION-SUCCESS-TOKEN-P", 1, 0, false);
    declareFunction(myName, "variables_with_conflicting_bindings", "VARIABLES-WITH-CONFLICTING-BINDINGS", 2, 0, false);
    declareFunction(myName, "some_variable_with_conflicting_bindings", "SOME-VARIABLE-WITH-CONFLICTING-BINDINGS", 2, 0, false);
    declareFunction(myName, "inferencify_kb_set_of_binding_sets", "INFERENCIFY-KB-SET-OF-BINDING-SETS", 1, 0, false);
    declareFunction(myName, "inferencify_kb_set_of_binding_sets_internal", "INFERENCIFY-KB-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false);
    declareFunction(myName, "inferencify_kb_binding_set", "INFERENCIFY-KB-BINDING-SET", 1, 0, false);
    declareFunction(myName, "inferencify_kb_binding_set_internal", "INFERENCIFY-KB-BINDING-SET-INTERNAL", 1, 0, false);
    declareFunction(myName, "inferencify_kb_binding", "INFERENCIFY-KB-BINDING", 1, 0, false);
    declareFunction(myName, "kbify_inference_set_of_binding_sets", "KBIFY-INFERENCE-SET-OF-BINDING-SETS", 1, 0, false);
    declareFunction(myName, "kbify_inference_set_of_binding_sets_internal", "KBIFY-INFERENCE-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false);
    declareFunction(myName, "kbify_inference_binding_set", "KBIFY-INFERENCE-BINDING-SET", 1, 0, false);
    declareFunction(myName, "kbify_inference_binding_set_internal", "KBIFY-INFERENCE-BINDING-SET-INTERNAL", 1, 0, false);
    declareFunction(myName, "kbify_inference_binding", "KBIFY-INFERENCE-BINDING", 1, 0, false);
    declareFunction(myName, "kb_binding_variable", "KB-BINDING-VARIABLE", 1, 0, false);
    declareFunction(myName, "kb_binding_value", "KB-BINDING-VALUE", 1, 0, false);
    declareFunction(myName, "kb_binding_set_variables", "KB-BINDING-SET-VARIABLES", 1, 0, false);
    declareFunction(myName, "kb_binding_set_values", "KB-BINDING-SET-VALUES", 1, 0, false);
    declareFunction(myName, "kb_binding_set_value_for_variable", "KB-BINDING-SET-VALUE-FOR-VARIABLE", 2, 0, false);
    declareFunction(myName, "kb_set_of_binding_sets_values", "KB-SET-OF-BINDING-SETS-VALUES", 1, 0, false);
    declareFunction(myName, "kb_set_of_binding_sets_size", "KB-SET-OF-BINDING-SETS-SIZE", 1, 0, false);
    declareFunction(myName, "kb_set_of_binding_sets_binding_sets", "KB-SET-OF-BINDING-SETS-BINDING-SETS", 1, 0, false);
    declareFunction(myName, "make_kb_binding", "MAKE-KB-BINDING", 2, 0, false);
    declareFunction(myName, "make_kb_binding_set", "MAKE-KB-BINDING-SET", 1, 0, false);
    declareFunction(myName, "make_kb_set_of_binding_sets", "MAKE-KB-SET-OF-BINDING-SETS", 1, 0, false);
    declareFunction(myName, "no_answers_kb_set_of_binding_sets", "NO-ANSWERS-KB-SET-OF-BINDING-SETS", 0, 0, false);
    declareFunction(myName, "proven_kb_binding_set", "PROVEN-KB-BINDING-SET", 0, 0, false);
    declareFunction(myName, "proven_kb_set_of_binding_sets", "PROVEN-KB-SET-OF-BINDING-SETS", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_bindings_file() {
    $hl_identity_binding_caching_state$ = deflexical("*HL-IDENTITY-BINDING-CACHING-STATE*", NIL);
    $hl_identity_bindings_caching_state$ = deflexical("*HL-IDENTITY-BINDINGS-CACHING-STATE*", NIL);
    $dummy_binding$ = deflexical("*DUMMY-BINDING*", maybeDefault( $sym25$_DUMMY_BINDING_, $dummy_binding$, ()-> (make_variable_binding(T, T))));
    $unification_success_token$ = deflexical("*UNIFICATION-SUCCESS-TOKEN*", list($dummy_binding$.getGlobalValue()));
    return NIL;
  }

  public static final SubLObject setup_bindings_file() {
    // CVS_ID("Id: bindings.lisp 127732 2009-04-28 22:41:37Z jantos ");
    memoization_state.note_globally_cached_function($sym0$HL_IDENTITY_BINDING);
    memoization_state.note_globally_cached_function($sym4$HL_IDENTITY_BINDINGS);
    subl_macro_promotions.declare_defglobal($sym25$_DUMMY_BINDING_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$HL_IDENTITY_BINDING = makeSymbol("HL-IDENTITY-BINDING");
  public static final SubLSymbol $sym1$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym2$_HL_IDENTITY_BINDING_CACHING_STATE_ = makeSymbol("*HL-IDENTITY-BINDING-CACHING-STATE*");
  public static final SubLSymbol $kw3$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym4$HL_IDENTITY_BINDINGS = makeSymbol("HL-IDENTITY-BINDINGS");
  public static final SubLSymbol $sym5$_HL_IDENTITY_BINDINGS_CACHING_STATE_ = makeSymbol("*HL-IDENTITY-BINDINGS-CACHING-STATE*");
  public static final SubLList $list6 = cons(makeSymbol("A"), makeSymbol("B"));
  public static final SubLSymbol $sym7$BINDING_P = makeSymbol("BINDING-P");
  public static final SubLSymbol $sym8$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLSymbol $sym9$VARIABLE_TO_VARIABLE_BINDING_P = makeSymbol("VARIABLE-TO-VARIABLE-BINDING-P");
  public static final SubLSymbol $sym10$INFERENCE_BINDING_P = makeSymbol("INFERENCE-BINDING-P");
  public static final SubLSymbol $sym11$INFERENCE_BINDING_SET_P = makeSymbol("INFERENCE-BINDING-SET-P");
  public static final SubLObject $const12$ELInferenceBindingFn = constant_handles.reader_make_constant_shell(makeString("ELInferenceBindingFn"));
  public static final SubLSymbol $sym13$KB_BINDING_P = makeSymbol("KB-BINDING-P");
  public static final SubLSymbol $sym14$KB_BINDING_SET_P = makeSymbol("KB-BINDING-SET-P");
  public static final SubLSymbol $sym15$BINDINGS_EQUAL_ = makeSymbol("BINDINGS-EQUAL?");
  public static final SubLSymbol $sym16$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
  public static final SubLSymbol $sym17$VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");
  public static final SubLList $list18 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym19$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLSymbol $sym20$VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");
  public static final SubLList $list21 = cons(makeSymbol("A-VAR"), makeSymbol("C-VALUE"));
  public static final SubLString $str22$Incomplete_variable_map__a_applie = makeString("Incomplete variable map ~a applied to ~a");
  public static final SubLList $list23 = cons(makeSymbol("B-VAR"), makeSymbol("C-VALUE"));
  public static final SubLSymbol $sym24$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
  public static final SubLSymbol $sym25$_DUMMY_BINDING_ = makeSymbol("*DUMMY-BINDING*");
  public static final SubLSymbol $sym26$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym27$KB_SET_OF_BINDING_SETS_P = makeSymbol("KB-SET-OF-BINDING-SETS-P");
  public static final SubLSymbol $sym28$INFERENCE_SET_OF_BINDING_SETS_P = makeSymbol("INFERENCE-SET-OF-BINDING-SETS-P");
  public static final SubLList $list29 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym30$KB_BINDING_VARIABLE = makeSymbol("KB-BINDING-VARIABLE");
  public static final SubLSymbol $sym31$KB_BINDING_VALUE = makeSymbol("KB-BINDING-VALUE");
  public static final SubLSymbol $sym32$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym33$KB_BINDING_SET_VALUES = makeSymbol("KB-BINDING-SET-VALUES");
  public static final SubLString $str34$Some_element_of__A_is_not_a_KB_BI = makeString("Some element of ~A is not a KB-BINDING-P");
  public static final SubLObject $const35$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLString $str36$Some_element_of__A_is_not_a_KB_BI = makeString("Some element of ~A is not a KB-BINDING-SET-P");

  //// Initializers

  public void declareFunctions() {
    declare_bindings_file();
  }

  public void initializeVariables() {
    init_bindings_file();
  }

  public void runTopLevelForms() {
    setup_bindings_file();
  }

}
