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

package  com.cyc.cycjava_1.cycl.inference;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertion_utilities;
import com.cyc.cycjava_1.cycl.at_utilities;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.inference.harness.forward;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.negation_predicate;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.relation_evaluation;
import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.sdc;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_parameters;

public  final class inference_trampolines extends SubLTranslatedFile {

  //// Constructor

  private inference_trampolines() {}
  public static final SubLFile me = new inference_trampolines();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.inference_trampolines";

  //// Definitions

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1252) 
  public static final SubLObject inference_collectionP(SubLObject object, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean((((NIL != forts.fort_p(object))
             && (NIL != fort_types_interface.collectionP(object)))
          || ((NIL != el_utilities.possibly_naut_p(object))
             && (NIL != isa.isaP(object, $const0$Collection, mt, UNPROVIDED)))));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1493) 
  public static final SubLObject inference_predicate_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL != fort_types_interface.predicateP(object))));
  }

  public static final class $inference_predicate_p$UnaryFunction extends UnaryFunction {
    public $inference_predicate_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_predicate_p(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1601) 
  public static final SubLObject inference_commutative_relationP(SubLObject relation) {
    return fort_types_interface.commutative_relation_p(relation);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1889) 
  public static final SubLObject inference_symmetric_predicateP(SubLObject predicate) {
    return fort_types_interface.symmetric_binary_predicate_p(predicate);
  }

  public static final class $inference_symmetric_predicateP$UnaryFunction extends UnaryFunction {
    public $inference_symmetric_predicateP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-SYMMETRIC-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_symmetric_predicateP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2001) 
  public static final SubLObject inference_commutative_predicate_p(SubLObject predicate) {
    return fort_types_interface.commutative_predicate_p(predicate);
  }

  public static final class $inference_commutative_predicate_p$UnaryFunction extends UnaryFunction {
    public $inference_commutative_predicate_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-COMMUTATIVE-PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_commutative_predicate_p(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2111) 
  public static final SubLObject inference_partially_commutative_predicate_p_internal(SubLObject predicate) {
    return fort_types_interface.partially_commutative_predicate_p(predicate);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2111) 
  public static final SubLObject inference_partially_commutative_predicate_p(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_partially_commutative_predicate_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_partially_commutative_predicate_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  public static final class $inference_partially_commutative_predicate_p$UnaryFunction extends UnaryFunction {
    public $inference_partially_commutative_predicate_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_partially_commutative_predicate_p(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2283) 
  public static final SubLObject inference_at_least_partially_commutative_predicate_p(SubLObject predicate) {
    return makeBoolean(((NIL != inference_commutative_predicate_p(predicate))
          || (NIL != inference_partially_commutative_predicate_p(predicate))));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2604) 
  public static final SubLObject inference_transitive_predicateP(SubLObject predicate) {
    return fort_types_interface.transitive_binary_predicate_p(predicate);
  }

  public static final class $inference_transitive_predicateP$UnaryFunction extends UnaryFunction {
    public $inference_transitive_predicateP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-TRANSITIVE-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_transitive_predicateP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2719) 
  public static final SubLObject inference_evaluatable_predicateP(SubLObject predicate) {
    return relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED);
  }

  public static final class $inference_evaluatable_predicateP$UnaryFunction extends UnaryFunction {
    public $inference_evaluatable_predicateP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-EVALUATABLE-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_evaluatable_predicateP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2827) 
  public static final SubLObject inference_reflexive_predicateP(SubLObject predicate) {
    return fort_types_interface.reflexive_binary_predicate_p(predicate);
  }

  public static final class $inference_reflexive_predicateP$UnaryFunction extends UnaryFunction {
    public $inference_reflexive_predicateP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-REFLEXIVE-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_reflexive_predicateP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2939) 
  public static final SubLObject inference_irreflexive_predicateP(SubLObject predicate) {
    return fort_types_interface.irreflexive_binary_predicate_p(predicate);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3055) 
  public static final SubLObject inference_indeterminate_termP(SubLObject value) {
    if ((NIL != forts.fort_p(value))) {
      return indeterminate_term_p(value);
    } else if ((NIL != el_utilities.possibly_naut_p(value))) {
      return makeBoolean(((NIL != kb_accessors.common_non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(value)))
            || (NIL != memoized_inference_indeterminate_termP(value))));
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378) 
  private static SubLSymbol $indeterminate_term_p_caching_state$ = null;

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378) 
  public static final SubLObject clear_indeterminate_term_p() {
    {
      SubLObject cs = $indeterminate_term_p_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_indeterminate_term_p$ZeroArityFunction extends ZeroArityFunction {
    public $clear_indeterminate_term_p$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-INDETERMINATE-TERM-P")); }
    public SubLObject processItem() { return clear_indeterminate_term_p(); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378) 
  public static final SubLObject indeterminate_term_p_internal(SubLObject fort) {
    return isa.quoted_isa_in_any_mtP(fort, $const4$IndeterminateTerm);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378) 
  public static final SubLObject indeterminate_term_p(SubLObject fort) {
    {
      SubLObject caching_state = $indeterminate_term_p_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym3$INDETERMINATE_TERM_P, $sym5$_INDETERMINATE_TERM_P_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym6$CLEAR_INDETERMINATE_TERM_P);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(indeterminate_term_p_internal(fort)));
          memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3638) 
  public static final SubLObject memoized_inference_indeterminate_termP_internal(SubLObject value) {
    return isa.quoted_isa_in_any_mtP(value, $const4$IndeterminateTerm);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3638) 
  public static final SubLObject memoized_inference_indeterminate_termP(SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_inference_indeterminate_termP_internal(value);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, value, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_inference_indeterminate_termP_internal(value)));
            memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3832) 
  public static final SubLObject inference_some_genl_pred_or_inverseP(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
          try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_genl_pred_or_inverseP(pred, NIL, UNPROVIDED);
          } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  public static final class $inference_some_genl_pred_or_inverseP$UnaryFunction extends UnaryFunction {
    public $inference_some_genl_pred_or_inverseP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_some_genl_pred_or_inverseP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4225) 
  public static final SubLObject inference_some_spec_pred_or_inverseP(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred))) {
        return NIL;
      }
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
          try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = genl_predicates.some_spec_pred_or_inverseP(pred, NIL, UNPROVIDED);
          } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  public static final class $inference_some_spec_pred_or_inverseP$UnaryFunction extends UnaryFunction {
    public $inference_some_spec_pred_or_inverseP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_some_spec_pred_or_inverseP(arg1); }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4820) 
  public static final SubLObject inference_all_spec_predicates(SubLObject predicate) {
    if ((NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate))) {
      return inference_all_spec_predicates_int(predicate);
    } else {
      return list(predicate);
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5033) 
  public static final SubLObject inference_all_spec_predicates_int_internal(SubLObject predicate) {
    return genl_predicates.all_spec_predicates(predicate, NIL, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5033) 
  public static final SubLObject inference_all_spec_predicates_int(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_all_spec_predicates_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym9$INFERENCE_ALL_SPEC_PREDICATES_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym9$INFERENCE_ALL_SPEC_PREDICATES_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym9$INFERENCE_ALL_SPEC_PREDICATES_INT, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_spec_predicates_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5291) 
  public static final SubLObject inference_all_spec_inverses(SubLObject predicate) {
    if ((NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(predicate))) {
      return inference_all_spec_inverses_int(predicate);
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5487) 
  public static final SubLObject inference_all_spec_inverses_int_internal(SubLObject predicate) {
    return genl_predicates.all_spec_inverses(predicate, NIL, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5487) 
  public static final SubLObject inference_all_spec_inverses_int(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_all_spec_inverses_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$INFERENCE_ALL_SPEC_INVERSES_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$INFERENCE_ALL_SPEC_INVERSES_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym11$INFERENCE_ALL_SPEC_INVERSES_INT, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_spec_inverses_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6503) 
  public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index(SubLObject pred, SubLObject sense) {
    if ((NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred))) {
      return inference_all_proper_spec_predicates_with_axiom_index_int(pred, sense);
    } else {
      return Values.values(NIL, ZERO_INTEGER);
    }
  }

  /** @return 0 listp; a list of all proper specPreds of PRED with a relevant predicate rule index
   wrt sense SENSE.
   @return 1 integerp; the total accumulated number of rules indexed via
   the axiom index for all proper specPreds of PRED. */
  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6759) 
  public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_internal(SubLObject pred, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject cost = ZERO_INTEGER;
        SubLObject node_var = pred;
        SubLObject deck_type = (false ? ((SubLObject) $kw14$STACK) : $kw15$QUEUE);
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject tv_var = NIL;
              {
                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym16$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw17$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw20$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2122");
                          } else if (pcase_var.eql($kw22$WARN)) {
                            Errors.warn($str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str23$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str21$continue_anyway, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                      sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                      sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                      if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                          || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                        {
                          SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_1_23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                            while ((NIL != node_and_predicate_mode)) {
                              {
                                SubLObject node_var_25 = node_and_predicate_mode.first();
                                SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                SubLObject spec_pred = node_var_25;
                                {
                                  SubLObject _prev_bind_0_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                    if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_25))) {
                                      if ((spec_pred != pred)) {
                                        {
                                          SubLObject num = kb_indexing.relevant_num_predicate_rule_index(spec_pred, sense);
                                          if (num.isPositive()) {
                                            result = cons(spec_pred, result);
                                            cost = Numbers.add(cost, num);
                                          }
                                        }
                                      }
                                    }
                                    {
                                      SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const24$genlPreds));
                                      SubLObject cdolist_list_var = accessible_modules;
                                      SubLObject module_var = NIL;
                                      for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                        {
                                          SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                          SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                          try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            {
                                              SubLObject node = function_terms.naut_to_nart(node_var_25);
                                              if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                {
                                                  SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                  if ((NIL != d_link)) {
                                                    {
                                                      SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                      if ((NIL != mt_links)) {
                                                        {
                                                          SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                            thread.resetMultipleValues();
                                                            {
                                                              SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                              SubLObject tv_links = thread.secondMultipleValue();
                                                              thread.resetMultipleValues();
                                                              if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                {
                                                                  SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                  try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    {
                                                                      SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                      while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                          SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                          SubLObject link_nodes = thread.secondMultipleValue();
                                                                          thread.resetMultipleValues();
                                                                          if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                            {
                                                                              SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                              try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                {
                                                                                  SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9259")) : link_nodes);
                                                                                  SubLObject cdolist_list_var_32 = new_list;
                                                                                  SubLObject node_vars_link_node = NIL;
                                                                                  for (node_vars_link_node = cdolist_list_var_32.first(); (NIL != cdolist_list_var_32); cdolist_list_var_32 = cdolist_list_var_32.rest(), node_vars_link_node = cdolist_list_var_32.first()) {
                                                                                    if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                      deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_31, thread);
                                                                              }
                                                                            }
                                                                          }
                                                                          iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                        }
                                                                      }
                                                                      dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                    }
                                                                  } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_29, thread);
                                                                  }
                                                                }
                                                              }
                                                              iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                          }
                                                          dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                  }
                                                }
                                              } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                {
                                                  SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9260")) : Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2569"));
                                                  SubLObject cdolist_list_var_33 = new_list;
                                                  SubLObject generating_fn = NIL;
                                                  for (generating_fn = cdolist_list_var_33.first(); (NIL != cdolist_list_var_33); cdolist_list_var_33 = cdolist_list_var_33.rest(), generating_fn = cdolist_list_var_33.first()) {
                                                    {
                                                      SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                      try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        {
                                                          SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                          SubLObject new_list_35 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9261")) : link_nodes);
                                                          SubLObject cdolist_list_var_36 = new_list_35;
                                                          SubLObject node_vars_link_node = NIL;
                                                          for (node_vars_link_node = cdolist_list_var_36.first(); (NIL != cdolist_list_var_36); cdolist_list_var_36 = cdolist_list_var_36.rest(), node_vars_link_node = cdolist_list_var_36.first()) {
                                                            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                              deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_34, thread);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
                                          }
                                        }
                                      }
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_26, thread);
                                  }
                                }
                              }
                              node_and_predicate_mode = deck.deck_pop(recur_deck);
                            }
                          } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_24, thread);
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_23, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_22, thread);
                          }
                        }
                      } else {
                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      }
                    } finally {
                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_21, thread);
                      sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_20, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_19, thread);
                }
              }
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
            }
          } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(Sequences.nreverse(result), cost);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6759) 
  public static final SubLObject inference_all_proper_spec_predicates_with_axiom_index_int(SubLObject pred, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(pred, sense);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && sense.eql(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_all_proper_spec_predicates_with_axiom_index_int_internal(pred, sense)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, sense));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8051) 
  public static final SubLObject inference_some_max_floor_mts(SubLObject mts) {
    mts = Sequences.remove_duplicates(mts, Symbols.symbol_function($sym29$HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    mts = mt_vars.minimize_mts_wrt_core(mts);
    return some_max_floor_mtsP_cached(mts);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8318) 
  private static SubLSymbol $some_max_floor_mtsP_cached_caching_state$ = null;

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8318) 
  public static final SubLObject clear_some_max_floor_mtsP_cached() {
    {
      SubLObject cs = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8318) 
  public static final SubLObject some_max_floor_mtsP_cached_internal(SubLObject mts) {
    return some_max_floor_mtsP(mts);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8318) 
  public static final SubLObject some_max_floor_mtsP_cached(SubLObject mts) {
    {
      SubLObject caching_state = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym30$SOME_MAX_FLOOR_MTS__CACHED, $sym31$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_, $int32$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        memoization_state.register_mt_dependent_cache_clear_callback($sym33$CLEAR_SOME_MAX_FLOOR_MTS__CACHED);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(some_max_floor_mtsP_cached_internal(mts)));
          memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8468) 
  public static final SubLObject inference_max_floor_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    mts = Sequences.remove_duplicates(mts, Symbols.symbol_function($sym29$HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    mts = mt_vars.minimize_mts_wrt_core(mts);
    if ((NIL != candidates)) {
      return genl_mts.max_floor_mts_with_cycles_pruned(mts, candidates, UNPROVIDED);
    } else {
      return inference_max_floor_mts_with_cycles_pruned_cached(mts);
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8885) 
  private static SubLSymbol $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = null;

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8885) 
  public static final SubLObject clear_inference_max_floor_mts_with_cycles_pruned_cached() {
    {
      SubLObject cs = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8885) 
  public static final SubLObject inference_max_floor_mts_with_cycles_pruned_cached_internal(SubLObject mts) {
    return genl_mts.max_floor_mts_with_cycles_pruned(mts, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8885) 
  public static final SubLObject inference_max_floor_mts_with_cycles_pruned_cached(SubLObject mts) {
    {
      SubLObject caching_state = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym34$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED, $sym35$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_, $int32$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        memoization_state.register_mt_dependent_cache_clear_callback($sym36$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(inference_max_floor_mts_with_cycles_pruned_cached_internal(mts)));
          memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9180) 
  public static final SubLObject some_max_floor_mtsP(SubLObject mts) {
    return list_utilities.sublisp_boolean(genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10062) 
  public static final SubLObject inference_gaf_lookup_index_internal(SubLObject asent, SubLObject sense) {
    return kb_indexing.best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10062) 
  public static final SubLObject inference_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym44$INFERENCE_GAF_LOOKUP_INDEX, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym44$INFERENCE_GAF_LOOKUP_INDEX, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym44$INFERENCE_GAF_LOOKUP_INDEX, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && sense.equal(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_gaf_lookup_index_internal(asent, sense)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, sense));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10198) 
  public static final SubLObject inference_num_gaf_lookup_index_internal(SubLObject asent, SubLObject sense) {
    return kb_indexing.num_best_gaf_lookup_index(asent, enumeration_types.sense_truth(sense), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10198) 
  public static final SubLObject inference_num_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_num_gaf_lookup_index_internal(asent, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym47$INFERENCE_NUM_GAF_LOOKUP_INDEX, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym47$INFERENCE_NUM_GAF_LOOKUP_INDEX, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym47$INFERENCE_NUM_GAF_LOOKUP_INDEX, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(asent, sense);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && sense.equal(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_num_gaf_lookup_index_internal(asent, sense)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, sense));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** Return T iff PROBLEM is backchain required */
  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10669) 
  public static final SubLObject problem_backchain_requiredP(SubLObject problem) {
    checkType(problem, $sym50$PROBLEM_P);
    {
      SubLObject query = inference_datastructures_problem.problem_query(problem);
      SubLObject cdolist_list_var = query;
      SubLObject contextualized_dnf_clause = NIL;
      for (contextualized_dnf_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_dnf_clause = cdolist_list_var.first()) {
        if ((NIL == inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause))) {
          return NIL;
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11094) 
  public static final SubLObject inference_some_backchain_required_asent_in_clauseP(SubLObject contextualized_dnf_clause) {
    {
      SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
      SubLObject contextualized_asent = NIL;
      for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
        if ((NIL != inference_backchain_required_contextualized_asentP(contextualized_asent))) {
          return T;
        }
      }
    }
    {
      SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
      SubLObject contextualized_asent = NIL;
      for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
        if ((NIL != inference_backchain_required_contextualized_asentP(contextualized_asent))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11365) 
  public static final SubLObject inference_backchain_required_contextualized_asentP(SubLObject contextualized_asent) {
    {
      SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
      SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt(contextualized_asent);
      return inference_backchain_required_asentP(asent, mt);
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11642) 
  public static final SubLObject inference_backchain_required_asentP(SubLObject asent, SubLObject mt) {
    mt = backchain_control_mt(mt);
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(pred))) {
        if ((NIL != inference_predicate_backchain_requiredP(pred, mt))) {
          return T;
        }
        {
          SubLObject pred_38 = cycl_utilities.atomic_sentence_predicate(asent);
          if ((NIL != list_utilities.member_eqP(pred_38, $list51))) {
            {
              SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
              if ((NIL != forts.fort_p(col))) {
                if ((NIL != inference_collection_backchain_requiredP(col, mt))) {
                  return T;
                } else if (((pred_38 == $const52$isa)
                     && (NIL != inference_collection_isa_backchain_requiredP(col, mt)))) {
                  return T;
                } else if (((pred_38 == $const53$genls)
                     && (NIL != inference_collection_genls_backchain_requiredP(col, mt)))) {
                  return T;
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12386) 
  public static final SubLObject inference_predicate_backchain_requiredP_internal(SubLObject predicate, SubLObject mt) {
    return kb_accessors.backchain_requiredP(predicate, backchain_control_mt(mt));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12386) 
  public static final SubLObject inference_predicate_backchain_requiredP(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_predicate_backchain_requiredP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_predicate_backchain_requiredP_internal(predicate, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12542) 
  public static final SubLObject inference_backchain_forbiddenP_internal(SubLObject predicate, SubLObject mt) {
    return kb_accessors.backchain_forbiddenP(predicate, backchain_control_mt(mt));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12542) 
  public static final SubLObject inference_backchain_forbiddenP(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_backchain_forbiddenP_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_backchain_forbiddenP_internal(predicate, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13229) 
  public static final SubLObject inference_collection_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
    return kb_accessors.collection_backchain_requiredP(col, backchain_control_mt(mt));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13229) 
  public static final SubLObject inference_collection_backchain_requiredP(SubLObject col, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_collection_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((col == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_backchain_requiredP_internal(col, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13384) 
  public static final SubLObject inference_collection_isa_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
    return kb_accessors.collection_isa_backchain_requiredP(col, backchain_control_mt(mt));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13384) 
  public static final SubLObject inference_collection_isa_backchain_requiredP(SubLObject col, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_collection_isa_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((col == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_isa_backchain_requiredP_internal(col, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13548) 
  public static final SubLObject inference_collection_genls_backchain_requiredP_internal(SubLObject col, SubLObject mt) {
    return kb_accessors.collection_genls_backchain_requiredP(col, backchain_control_mt(mt));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13548) 
  public static final SubLObject inference_collection_genls_backchain_requiredP(SubLObject col, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_collection_genls_backchain_requiredP_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((col == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_collection_genls_backchain_requiredP_internal(col, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** Assuming that we are doing inference MT, return the mt in which to look for
assertions that control the behaviour of backchaining.  If all mts are relevant,
we need to be conservative and only look for universally true backchain control assertions. */
  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13716) 
  public static final SubLObject backchain_control_mt(SubLObject mt) {
    return mt_relevance_macros.conservative_constraint_mt(mt);
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14054) 
  public static final SubLObject inference_relevant_mtP(SubLObject assertion_mt, SubLObject inference_mt) {
    if ((inference_mt == UNPROVIDED)) {
      inference_mt = NIL;
    }
    return makeBoolean(((NIL != forts.fort_p(assertion_mt))
           && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $const62$highlyRelevantMt, inference_mt, ONE_INTEGER, $kw63$TRUE))));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15155) 
  public static final SubLObject inference_irrelevant_mtP(SubLObject assertion_mt, SubLObject inference_mt) {
    if ((inference_mt == UNPROVIDED)) {
      inference_mt = NIL;
    }
    return makeBoolean(((NIL != forts.fort_p(assertion_mt))
           && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(assertion_mt, $const67$irrelevantMt, inference_mt, ONE_INTEGER, $kw63$TRUE))));
  }

  @SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18446) 
  private static SubLSymbol $inference_true_sentence_recursion_stack$ = null;

  public static final SubLObject declare_inference_trampolines_file() {
    //declareFunction(myName, "inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false);
    declareFunction(myName, "inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false); new $inference_predicate_p$UnaryFunction();
    declareFunction(myName, "inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false);
    declareFunction(myName, "inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false); new $inference_symmetric_predicateP$UnaryFunction();
    declareFunction(myName, "inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false); new $inference_commutative_predicate_p$UnaryFunction();
    declareFunction(myName, "inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false);
    declareFunction(myName, "inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false); new $inference_partially_commutative_predicate_p$UnaryFunction();
    declareFunction(myName, "inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false); new $inference_transitive_predicateP$UnaryFunction();
    declareFunction(myName, "inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false); new $inference_evaluatable_predicateP$UnaryFunction();
    declareFunction(myName, "inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false); new $inference_reflexive_predicateP$UnaryFunction();
    declareFunction(myName, "inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
    declareFunction(myName, "clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false); new $clear_indeterminate_term_p$ZeroArityFunction();
    //declareFunction(myName, "remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false);
    declareFunction(myName, "indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false);
    declareFunction(myName, "indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false);
    declareFunction(myName, "memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false);
    declareFunction(myName, "memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false);
    declareFunction(myName, "inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false); new $inference_some_genl_pred_or_inverseP$UnaryFunction();
    declareFunction(myName, "inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false); new $inference_some_spec_pred_or_inverseP$UnaryFunction();
    //declareFunction(myName, "inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false);
    //declareFunction(myName, "inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false);
    declareFunction(myName, "inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false);
    declareFunction(myName, "inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false);
    declareFunction(myName, "inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false);
    //declareFunction(myName, "inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false);
    declareFunction(myName, "inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false);
    declareFunction(myName, "inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false);
    declareFunction(myName, "inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false);
    //declareFunction(myName, "inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
    declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
    declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false);
    //declareFunction(myName, "inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false);
    declareFunction(myName, "inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false);
    declareFunction(myName, "clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false);
    //declareFunction(myName, "remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
    declareFunction(myName, "some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false);
    declareFunction(myName, "some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false);
    declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false);
    declareFunction(myName, "clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false);
    //declareFunction(myName, "remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
    declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false);
    declareFunction(myName, "inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false);
    //declareFunction(myName, "inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false);
    declareFunction(myName, "some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false);
    //declareFunction(myName, "inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false);
    //declareMacro(myName, "do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX");
    declareFunction(myName, "inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false);
    declareFunction(myName, "inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false);
    //declareFunction(myName, "inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false);
    //declareFunction(myName, "inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false);
    //declareFunction(myName, "inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false);
    //declareFunction(myName, "inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false);
    declareFunction(myName, "problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
    declareFunction(myName, "inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false);
    declareFunction(myName, "inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false);
    declareFunction(myName, "inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false);
    //declareFunction(myName, "inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
    //declareFunction(myName, "inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false);
    //declareFunction(myName, "inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
    declareFunction(myName, "inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false);
    declareFunction(myName, "inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false);
    declareFunction(myName, "inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false);
    declareFunction(myName, "backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false);
    declareFunction(myName, "inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false);
    //declareFunction(myName, "inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false);
    //declareFunction(myName, "inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
    //declareFunction(myName, "inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false);
    declareFunction(myName, "inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false);
    //declareFunction(myName, "inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false);
    //declareFunction(myName, "inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false);
    //declareFunction(myName, "inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false);
    //declareFunction(myName, "inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false);
    //declareFunction(myName, "inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false);
    //declareFunction(myName, "inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false);
    //declareFunction(myName, "inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false);
    //declareFunction(myName, "inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
    //declareFunction(myName, "inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false);
    //declareFunction(myName, "inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 1, false);
    //declareFunction(myName, "inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 1, false);
    //declareFunction(myName, "inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false);
    //declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false);
    //declareFunction(myName, "inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false);
    //declareFunction(myName, "determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false);
    //declareFunction(myName, "inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_trampolines_file() {
    $indeterminate_term_p_caching_state$ = deflexical("*INDETERMINATE-TERM-P-CACHING-STATE*", NIL);
    $some_max_floor_mtsP_cached_caching_state$ = deflexical("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*", NIL);
    $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = deflexical("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*", NIL);
    $inference_true_sentence_recursion_stack$ = defparameter("*INFERENCE-TRUE-SENTENCE-RECURSION-STACK*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_trampolines_file() {
    // CVS_ID("Id: inference-trampolines.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_memoized_function($sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P);
    memoization_state.note_globally_cached_function($sym3$INDETERMINATE_TERM_P);
    memoization_state.note_memoized_function($sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_);
    memoization_state.note_memoized_function($sym8$INFERENCE_ALL_GENL_PREDICATES);
    memoization_state.note_memoized_function($sym9$INFERENCE_ALL_SPEC_PREDICATES_INT);
    memoization_state.note_memoized_function($sym10$INFERENCE_ALL_GENL_INVERSES);
    memoization_state.note_memoized_function($sym11$INFERENCE_ALL_SPEC_INVERSES_INT);
    memoization_state.note_memoized_function($sym12$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX);
    memoization_state.note_memoized_function($sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT);
    memoization_state.note_memoized_function($sym28$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX);
    memoization_state.note_globally_cached_function($sym30$SOME_MAX_FLOOR_MTS__CACHED);
    memoization_state.note_globally_cached_function($sym34$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED);
    memoization_state.note_memoized_function($sym37$INFERENCE_MAX_FLOOR_MTS_OF_NAT);
    memoization_state.note_memoized_function($sym38$INFERENCE_APPLICABLE_SDCT_);
    memoization_state.note_memoized_function($sym44$INFERENCE_GAF_LOOKUP_INDEX);
    memoization_state.note_memoized_function($sym47$INFERENCE_NUM_GAF_LOOKUP_INDEX);
    memoization_state.note_memoized_function($sym48$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX);
    memoization_state.note_memoized_function($sym49$INFERENCE_KEY_GAF_ARG_INDEX);
    memoization_state.note_memoized_function($sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_);
    memoization_state.note_memoized_function($sym55$INFERENCE_BACKCHAIN_FORBIDDEN_);
    memoization_state.note_memoized_function($sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_);
    memoization_state.note_memoized_function($sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_);
    memoization_state.note_memoized_function($sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_);
    memoization_state.note_memoized_function($sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_);
    memoization_state.note_memoized_function($sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_);
    memoization_state.note_memoized_function($sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_);
    memoization_state.note_memoized_function($sym72$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY);
    memoization_state.note_memoized_function($sym76$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY);
    memoization_state.note_memoized_function($sym78$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE);
    memoization_state.note_memoized_function($sym80$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED);
    memoization_state.note_memoized_function($sym85$INFERENCE_RULE_TYPE_CONSTRAINTS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLSymbol $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P = makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P");
  public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym3$INDETERMINATE_TERM_P = makeSymbol("INDETERMINATE-TERM-P");
  public static final SubLObject $const4$IndeterminateTerm = constant_handles.reader_make_constant_shell(makeString("IndeterminateTerm"));
  public static final SubLSymbol $sym5$_INDETERMINATE_TERM_P_CACHING_STATE_ = makeSymbol("*INDETERMINATE-TERM-P-CACHING-STATE*");
  public static final SubLSymbol $sym6$CLEAR_INDETERMINATE_TERM_P = makeSymbol("CLEAR-INDETERMINATE-TERM-P");
  public static final SubLSymbol $sym7$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ = makeSymbol("MEMOIZED-INFERENCE-INDETERMINATE-TERM?");
  public static final SubLSymbol $sym8$INFERENCE_ALL_GENL_PREDICATES = makeSymbol("INFERENCE-ALL-GENL-PREDICATES");
  public static final SubLSymbol $sym9$INFERENCE_ALL_SPEC_PREDICATES_INT = makeSymbol("INFERENCE-ALL-SPEC-PREDICATES-INT");
  public static final SubLSymbol $sym10$INFERENCE_ALL_GENL_INVERSES = makeSymbol("INFERENCE-ALL-GENL-INVERSES");
  public static final SubLSymbol $sym11$INFERENCE_ALL_SPEC_INVERSES_INT = makeSymbol("INFERENCE-ALL-SPEC-INVERSES-INT");
  public static final SubLSymbol $sym12$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX");
  public static final SubLSymbol $kw13$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw14$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw15$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym16$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw17$ERROR = makeKeyword("ERROR");
  public static final SubLString $str18$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym19$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw20$CERROR = makeKeyword("CERROR");
  public static final SubLString $str21$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw22$WARN = makeKeyword("WARN");
  public static final SubLString $str23$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const24$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLString $str25$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str26$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT = makeSymbol("INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT");
  public static final SubLSymbol $sym28$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX = makeSymbol("INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX");
  public static final SubLSymbol $sym29$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym30$SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("SOME-MAX-FLOOR-MTS?-CACHED");
  public static final SubLSymbol $sym31$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_ = makeSymbol("*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*");
  public static final SubLInteger $int32$256 = makeInteger(256);
  public static final SubLSymbol $sym33$CLEAR_SOME_MAX_FLOOR_MTS__CACHED = makeSymbol("CLEAR-SOME-MAX-FLOOR-MTS?-CACHED");
  public static final SubLSymbol $sym34$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");
  public static final SubLSymbol $sym35$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_ = makeSymbol("*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*");
  public static final SubLSymbol $sym36$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol("CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED");
  public static final SubLSymbol $sym37$INFERENCE_MAX_FLOOR_MTS_OF_NAT = makeSymbol("INFERENCE-MAX-FLOOR-MTS-OF-NAT");
  public static final SubLSymbol $sym38$INFERENCE_APPLICABLE_SDCT_ = makeSymbol("INFERENCE-APPLICABLE-SDCT?");
  public static final SubLList $list39 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list40 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw41$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw42$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym43$DO_GAF_LOOKUP_INDEX = makeSymbol("DO-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym44$INFERENCE_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $kw45$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $sym46$SENSE_TRUTH = makeSymbol("SENSE-TRUTH");
  public static final SubLSymbol $sym47$INFERENCE_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-NUM-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym48$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX = makeSymbol("INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym49$INFERENCE_KEY_GAF_ARG_INDEX = makeSymbol("INFERENCE-KEY-GAF-ARG-INDEX");
  public static final SubLSymbol $sym50$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLList $list51 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLObject $const52$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const53$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym54$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?");
  public static final SubLSymbol $sym55$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN?");
  public static final SubLSymbol $sym56$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?");
  public static final SubLSymbol $sym57$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?");
  public static final SubLSymbol $sym58$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?");
  public static final SubLSymbol $sym59$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?");
  public static final SubLSymbol $sym60$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?");
  public static final SubLSymbol $sym61$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ = makeSymbol("INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?");
  public static final SubLObject $const62$highlyRelevantMt = constant_handles.reader_make_constant_shell(makeString("highlyRelevantMt"));
  public static final SubLSymbol $kw63$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const64$highlyRelevantAssertion = constant_handles.reader_make_constant_shell(makeString("highlyRelevantAssertion"));
  public static final SubLObject $const65$highlyRelevantPredAssertion = constant_handles.reader_make_constant_shell(makeString("highlyRelevantPredAssertion"));
  public static final SubLObject $const66$highlyRelevantTerm = constant_handles.reader_make_constant_shell(makeString("highlyRelevantTerm"));
  public static final SubLObject $const67$irrelevantMt = constant_handles.reader_make_constant_shell(makeString("irrelevantMt"));
  public static final SubLObject $const68$irrelevantAssertion = constant_handles.reader_make_constant_shell(makeString("irrelevantAssertion"));
  public static final SubLObject $const69$irrelevantPredAssertion = constant_handles.reader_make_constant_shell(makeString("irrelevantPredAssertion"));
  public static final SubLObject $const70$irrelevantTerm = constant_handles.reader_make_constant_shell(makeString("irrelevantTerm"));
  public static final SubLObject $const71$assertionUtility = constant_handles.reader_make_constant_shell(makeString("assertionUtility"));
  public static final SubLSymbol $sym72$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY = makeSymbol("INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY");
  public static final SubLSymbol $kw73$ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
  public static final SubLSymbol $sym74$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");
  public static final SubLSymbol $kw75$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym76$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY = makeSymbol("INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY");
  public static final SubLSymbol $kw77$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $sym78$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE");
  public static final SubLList $list79 = list(makeSymbol("MTS"), makeSymbol("SUPPORT-COMBINATION"));
  public static final SubLSymbol $sym80$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED = makeSymbol("INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED");
  public static final SubLObject $const81$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $kw82$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLList $list83 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);
  public static final SubLObject $const84$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLSymbol $sym85$INFERENCE_RULE_TYPE_CONSTRAINTS = makeSymbol("INFERENCE-RULE-TYPE-CONSTRAINTS");

  //// Initializers

  public void declareFunctions() {
    declare_inference_trampolines_file();
  }

  public void initializeVariables() {
    init_inference_trampolines_file();
  }

  public void runTopLevelForms() {
    setup_inference_trampolines_file();
  }

}
