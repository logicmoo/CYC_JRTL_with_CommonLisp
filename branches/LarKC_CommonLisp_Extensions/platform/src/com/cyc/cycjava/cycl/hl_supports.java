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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_macros;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;

public  final class hl_supports extends SubLTranslatedFile {

  //// Constructor

  private hl_supports() {}
  public static final SubLFile me = new hl_supports();
  public static final String myName = "com.cyc.cycjava.cycl.hl_supports";

  //// Definitions

  @SubL(source = "cycl/hl-supports.lisp", position = 899) 
  private static SubLSymbol $hl_predicates$ = null;

  @SubL(source = "cycl/hl-supports.lisp", position = 1360) 
  public static final SubLObject hl_predicate_p(SubLObject object) {
    return list_utilities.member_eqP(object, $hl_predicates$.getGlobalValue());
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 1445) 
  public static final SubLObject non_hl_predicate_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL == hl_predicate_p(object))));
  }

  public static final class $non_hl_predicate_p$UnaryFunction extends UnaryFunction {
    public $non_hl_predicate_p$UnaryFunction() { super(extractFunctionNamed("NON-HL-PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return non_hl_predicate_p(arg1); }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 1849) 
  private static SubLSymbol $hl_support_modules$ = null;

  @SubL(source = "cycl/hl-supports.lisp", position = 2061) 
  public static final SubLObject hl_support_modules() {
    return $hl_support_modules$.getGlobalValue();
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 2169) 
  private static SubLSymbol $hl_support_module_plist_indicators$ = null;

  /** Return T iff OBJECT is an HL support module. */
  @SubL(source = "cycl/hl-supports.lisp", position = 2283) 
  public static final SubLObject hl_support_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $hl_support_modules$.getGlobalValue());
  }

  /** Declare NAME as a new HL support module */
  @SubL(source = "cycl/hl-supports.lisp", position = 2451) 
  public static final SubLObject setup_hl_support_module(SubLObject name, SubLObject plist) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(name, $sym8$KEYWORDP);
      {
        SubLObject cdolist_list_var = $hl_support_module_plist_indicators$.getDynamicValue(thread);
        SubLObject indicator = NIL;
        for (indicator = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), indicator = cdolist_list_var.first()) {
          Symbols.remprop(name, indicator);
        }
      }
      {
        SubLObject indicator = NIL;
        SubLObject value = NIL;
        for (indicator = plist.first(), value = conses_high.second(plist); (NIL != plist); indicator = plist.first(), value = conses_high.second(plist)) {
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == conses_high.member(indicator, $hl_support_module_plist_indicators$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
              Errors.error($str9$_S_was_not_a_valid_hl_support_mod, indicator);
            }
          }
          Symbols.put(name, indicator, value);
          plist = conses_high.cddr(plist);
        }
        {
          SubLObject item_var = name;
          if ((NIL == conses_high.member(item_var, $hl_support_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            $hl_support_modules$.setGlobalValue(cons(item_var, $hl_support_modules$.getGlobalValue()));
          }
        }
        return name;
      }
    }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 3140) 
  public static final SubLObject hl_support_module_justify_func(SubLObject hl_support_module) {
    return Symbols.get(hl_support_module, $kw11$JUSTIFY, NIL);
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 3370) 
  public static final SubLObject hl_support_module_forward_mt_combos_func(SubLObject hl_support_module) {
    return Symbols.get(hl_support_module, $kw13$FORWARD_MT_COMBOS, $sym14$LIST);
  }

  /** @return listp; a list of supports */
  @SubL(source = "cycl/hl-supports.lisp", position = 4295) 
  public static final SubLObject hl_justify(SubLObject support) {
    checkType(support, $sym15$SUPPORT_P);
    return arguments.support_justification(support);
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 5552) 
  public static final SubLObject hl_support_justify(SubLObject hl_support) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(hl_support, $sym18$HL_SUPPORT_P);
      {
        SubLObject module = arguments.hl_support_module(hl_support);
        SubLObject justification = NIL;
        if ((NIL != hl_support_module_p(module))) {
          {
            SubLObject justify_func = hl_support_module_justify_func(module);
            if ((NIL != justify_func)) {
              {
                SubLObject mt = arguments.hl_support_mt(hl_support);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                  SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    justification = Functions.funcall(justify_func, hl_support);
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                  }
                }
              }
            }
          }
          if ((NIL == arguments.non_empty_hl_justification_p(justification))) {
            justification = hl_trivial_justification(hl_support);
          }
        }
        return justification;
      }
    }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 6391) 
  public static final SubLObject hl_trivial_justification(SubLObject support) {
    return list(support);
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 7428) 
  public static final SubLObject hl_forward_mt_combos(SubLObject support) {
    {
      SubLObject hl_module = arguments.support_module(support);
      checkType(hl_module, $sym4$HL_SUPPORT_MODULE_P);
      {
        SubLObject forward_mt_combos_func = hl_support_module_forward_mt_combos_func(hl_module);
        SubLObject mt = arguments.support_mt(support);
        if (((NIL != forward_mt_combos_func)
             && (mt == $const19$InferencePSC))) {
          return Functions.funcall(forward_mt_combos_func, support);
        } else {
          return list(support);
        }
      }
    }
  }

  /** @return hl-support-p; Returns an assertion corresponding to SENTENCE iff one exists (within MT relevance), or a :code support with SENTENCE as support sentence. */
  @SubL(source = "cycl/hl-supports.lisp", position = 7903) 
  public static final SubLObject find_assertion_or_make_support(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            {
              SubLObject assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
              if ((NIL != assertion)) {
                result = assertion;
              } else {
                result = arguments.make_hl_support($kw20$CODE, sentence, mt, UNPROVIDED);
              }
            }
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 9575) 
  public static SubLSymbol $perform_opaque_support_verification$ = null;

  /** The mt in which assertions for HL justifications of bookkeeping assertions are expected to be. */
  @SubL(source = "cycl/hl-supports.lisp", position = 12615) 
  public static SubLSymbol $bookkeeping_justification_assertion_mt$ = null;

  @SubL(source = "cycl/hl-supports.lisp", position = 12844) 
  private static SubLSymbol $cached_find_assertion_cycl_caching_state$ = null;

  @SubL(source = "cycl/hl-supports.lisp", position = 26107) 
  public static final SubLObject hl_justify_eval(SubLObject support) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject justification = NIL;
        SubLObject datum = support;
        SubLObject current = datum;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        hl_module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        tv = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
            if ((predicate == $const68$evaluate)) {
              {
                SubLObject result = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject expression = el_utilities.literal_arg2(literal, UNPROVIDED);
                if ((NIL == cycl_utilities.negatedP(literal))) {
                  {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        justification = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30327");
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                } else {
                  {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        {
                          SubLObject answer = relation_evaluation.cyc_evaluate(expression);
                          SubLObject validP = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if (((NIL != validP)
                               && (NIL == unification_utilities.term_unify(answer, result, UNPROVIDED, UNPROVIDED)))) {
                            {
                              SubLObject evaluate_support = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1324");
                              SubLObject different_support = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32841");
                              justification = list(evaluate_support, different_support);
                            }
                          }
                        }
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                }
              }
            } else if ((predicate == $const34$different)) {
              {
                SubLObject args = el_utilities.literal_args(literal, UNPROVIDED);
                justification = equals.why_different(args);
              }
            } else {
              {
                SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                if ((NIL == cycl_utilities.negatedP(literal))) {
                  {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        justification = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30328");
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                } else {
                  {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        {
                          SubLObject answer = relation_evaluation.cyc_evaluate(atomic_sentence);
                          SubLObject validP = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if (((NIL != validP)
                               && (NIL == answer))) {
                            {
                              SubLObject unknown_support = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1298");
                              justification = list(unknown_support);
                            }
                          }
                        }
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
        }
        return justification;
      }
    }
  }

  public static final class $hl_justify_eval$UnaryFunction extends UnaryFunction {
    public $hl_justify_eval$UnaryFunction() { super(extractFunctionNamed("HL-JUSTIFY-EVAL")); }
    public SubLObject processItem(SubLObject arg1) { return hl_justify_eval(arg1); }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 28783) 
  public static final SubLObject hl_justify_reflexive(SubLObject support) {
    {
      SubLObject datum = support;
      SubLObject current = datum;
      SubLObject hl_module = NIL;
      SubLObject literal = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      literal = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject negatedP = cycl_utilities.negatedP(literal);
          SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
          SubLObject datum_26 = atomic_sentence;
          SubLObject current_27 = datum_26;
          SubLObject pred = NIL;
          SubLObject arg1 = NIL;
          SubLObject arg2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_27, datum_26, $list70);
          pred = current_27.first();
          current_27 = current_27.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current_27, datum_26, $list70);
          arg1 = current_27.first();
          current_27 = current_27.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current_27, datum_26, $list70);
          arg2 = current_27.first();
          current_27 = current_27.rest();
          if ((NIL == current_27)) {
            {
              SubLObject reflexive_col = ((NIL != negatedP) ? ((SubLObject) $const71$IrreflexiveBinaryPredicate) : $const72$ReflexiveBinaryPredicate);
              SubLObject isa_sentence = el_utilities.make_binary_formula($const73$isa, pred, reflexive_col);
              SubLObject arg1_sentence = el_utilities.make_ternary_formula($const74$admittedArgument, arg1, ONE_INTEGER, pred);
              SubLObject arg2_sentence = el_utilities.make_ternary_formula($const74$admittedArgument, arg2, TWO_INTEGER, pred);
              SubLObject equals_sentence = (arg1.equal(arg2) ? ((SubLObject) NIL) : el_utilities.make_binary_formula($const60$equals, arg1, arg2));
              SubLObject isa_support = arguments.make_hl_support($kw75$ISA, isa_sentence, mt, UNPROVIDED);
              SubLObject arg1_support = arguments.make_hl_support($kw76$ADMIT, arg1_sentence, mt, UNPROVIDED);
              SubLObject arg2_support = arguments.make_hl_support($kw76$ADMIT, arg2_sentence, mt, UNPROVIDED);
              SubLObject equals_support = ((NIL != equals_sentence) ? ((SubLObject) arguments.make_hl_support($kw66$EQUALITY, equals_sentence, mt, UNPROVIDED)) : NIL);
              return listS(isa_support, arg1_support, arg2_support, ConsesLow.append(((NIL != equals_support) ? ((SubLObject) list(equals_support)) : NIL), NIL));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum_26, $list70);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 38065) 
  public static final SubLObject hl_justify_transitivity(SubLObject support) {
    {
      SubLObject datum = support;
      SubLObject current = datum;
      SubLObject hl_module = NIL;
      SubLObject literal = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      literal = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL == cycl_utilities.negatedP(literal))) {
          {
            SubLObject datum_51 = el_utilities.literal_atomic_sentence(literal);
            SubLObject current_52 = datum_51;
            SubLObject predicate = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_52, datum_51, $list81);
            predicate = current_52.first();
            current_52 = current_52.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_52, datum_51, $list81);
            arg1 = current_52.first();
            current_52 = current_52.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_52, datum_51, $list81);
            arg2 = current_52.first();
            current_52 = current_52.rest();
            if ((NIL == current_52)) {
              return removal_modules_transitivity.inference_transitivity_justify(predicate, arg1, arg2, mt, tv);
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_51, $list81);
            }
          }
        } else {
          return NIL;
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 45569) 
  public static final SubLObject hl_justify_admit(SubLObject support) {
    return NIL;
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 53932) 
  public static final SubLObject hl_justify_sbhl(SubLObject support) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject datum = support;
        SubLObject current = datum;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        hl_module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
        tv = current.first();
        current = current.rest();
        if ((NIL == current)) {
          if ((NIL != el_utilities.el_negation_p(literal))) {
            {
              SubLObject new_literal = cycl_utilities.formula_arg1(literal, $kw128$REGULARIZE);
              SubLObject new_tv = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32094");
              SubLObject datum_61 = new_literal;
              SubLObject current_62 = datum_61;
              SubLObject predicate = NIL;
              SubLObject arg1 = NIL;
              SubLObject arg2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_62, datum_61, $list81);
              predicate = current_62.first();
              current_62 = current_62.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_62, datum_61, $list81);
              arg1 = current_62.first();
              current_62 = current_62.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_62, datum_61, $list81);
              arg2 = current_62.first();
              current_62 = current_62.rest();
              if ((NIL == current_62)) {
                {
                  SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                  {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                      mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                      mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                      mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                      result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, NIL, sbhl_link_vars.support_tv_to_sbhl_tv(new_tv), $kw56$ASSERTION);
                    } finally {
                      mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                      mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                      mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_61, $list81);
              }
            }
          } else if ((NIL != el_utilities.el_formula_p(literal))) {
            {
              SubLObject new_literal = literal;
              SubLObject new_tv = tv;
              SubLObject datum_63 = new_literal;
              SubLObject current_64 = datum_63;
              SubLObject predicate = NIL;
              SubLObject arg1 = NIL;
              SubLObject arg2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_64, datum_63, $list81);
              predicate = current_64.first();
              current_64 = current_64.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_64, datum_63, $list81);
              arg1 = current_64.first();
              current_64 = current_64.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_64, datum_63, $list81);
              arg2 = current_64.first();
              current_64 = current_64.rest();
              if ((NIL == current_64)) {
                {
                  SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                  {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                      mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                      mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                      mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                      result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, NIL, sbhl_link_vars.support_tv_to_sbhl_tv(new_tv), $kw56$ASSERTION);
                    } finally {
                      mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                      mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                      mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_63, $list81);
              }
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 61345) 
  public static final SubLObject hl_justify_genls(SubLObject support) {
    {
      SubLObject datum = support;
      SubLObject current = datum;
      SubLObject hl_module = NIL;
      SubLObject literal = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      literal = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject pcase_var = el_utilities.literal_predicate(literal, UNPROVIDED);
          if (pcase_var.eql($const137$nearestGenls)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1314");
          } else if (pcase_var.eql($const138$nearestGenlsOfType)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1315");
          } else {
            return hl_justify_sbhl(support);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 61730) 
  public static final SubLObject hl_forward_mt_combos_genls(SubLObject support) {
    {
      SubLObject datum = support;
      SubLObject current = datum;
      SubLObject hl_module = NIL;
      SubLObject literal = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      literal = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject mts = NIL;
          SubLObject ans = NIL;
          if ((NIL == cycl_utilities.negatedP(literal))) {
            mts = inference_max_floor_mts_of_genls_paths(el_utilities.literal_arg1(literal, UNPROVIDED), el_utilities.literal_arg2(literal, UNPROVIDED));
          } else {
            mts = list(mt);
          }
          {
            SubLObject cdolist_list_var = mts;
            SubLObject mt_81 = NIL;
            for (mt_81 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_81 = cdolist_list_var.first()) {
              ans = cons(arguments.make_hl_support(hl_module, literal, mt_81, tv), ans);
            }
          }
          return Sequences.nreverse(ans);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-supports.lisp", position = 62367) 
  public static final SubLObject inference_max_floor_mts_of_genls_paths(SubLObject spec, SubLObject genl) {
    if ((NIL != term.first_order_nautP(spec))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5038");
    } else {
      {
        SubLObject min_mt_sets = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($const141$genls), spec, genl, UNPROVIDED);
        SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        SubLObject max_floor_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(reduced_min_mt_sets);
        SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
      }
    }
  }

  public static final SubLObject declare_hl_supports_file() {
    declareFunction(myName, "hl_predicate_p", "HL-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "non_hl_predicate_p", "NON-HL-PREDICATE-P", 1, 0, false); new $non_hl_predicate_p$UnaryFunction();
    //declareFunction(myName, "declare_hl_predicate", "DECLARE-HL-PREDICATE", 1, 0, false);
    //declareFunction(myName, "undeclare_hl_predicate", "UNDECLARE-HL-PREDICATE", 1, 0, false);
    declareFunction(myName, "hl_support_modules", "HL-SUPPORT-MODULES", 0, 0, false);
    declareFunction(myName, "hl_support_module_p", "HL-SUPPORT-MODULE-P", 1, 0, false);
    declareFunction(myName, "setup_hl_support_module", "SETUP-HL-SUPPORT-MODULE", 2, 0, false);
    //declareFunction(myName, "hl_support_module_verify_func", "HL-SUPPORT-MODULE-VERIFY-FUNC", 1, 0, false);
    declareFunction(myName, "hl_support_module_justify_func", "HL-SUPPORT-MODULE-JUSTIFY-FUNC", 1, 0, false);
    //declareFunction(myName, "hl_support_module_validate_func", "HL-SUPPORT-MODULE-VALIDATE-FUNC", 1, 0, false);
    declareFunction(myName, "hl_support_module_forward_mt_combos_func", "HL-SUPPORT-MODULE-FORWARD-MT-COMBOS-FUNC", 1, 0, false);
    //declareFunction(myName, "hl_verify", "HL-VERIFY", 1, 0, false);
    declareFunction(myName, "hl_justify", "HL-JUSTIFY", 1, 0, false);
    //declareFunction(myName, "hl_justify_expanded", "HL-JUSTIFY-EXPANDED", 1, 0, false);
    //declareFunction(myName, "hl_justification_expand", "HL-JUSTIFICATION-EXPAND", 1, 0, false);
    declareFunction(myName, "hl_support_justify", "HL-SUPPORT-JUSTIFY", 1, 0, false);
    declareFunction(myName, "hl_trivial_justification", "HL-TRIVIAL-JUSTIFICATION", 1, 0, false);
    //declareFunction(myName, "hl_validate", "HL-VALIDATE", 2, 0, false);
    //declareFunction(myName, "hl_validate_wff_violations", "HL-VALIDATE-WFF-VIOLATIONS", 2, 0, false);
    declareFunction(myName, "hl_forward_mt_combos", "HL-FORWARD-MT-COMBOS", 1, 0, false);
    declareFunction(myName, "find_assertion_or_make_support", "FIND-ASSERTION-OR-MAKE-SUPPORT", 1, 1, false);
    //declareFunction(myName, "max_floor_mts_of_justification", "MAX-FLOOR-MTS-OF-JUSTIFICATION", 1, 0, false);
    //declareFunction(myName, "hl_verify_opaque", "HL-VERIFY-OPAQUE", 1, 0, false);
    //declareFunction(myName, "opaque_hl_support_p", "OPAQUE-HL-SUPPORT-P", 1, 0, false);
    //declareFunction(myName, "hl_verify_bookkeeping", "HL-VERIFY-BOOKKEEPING", 1, 0, false);
    //declareFunction(myName, "hl_justify_bookkeeping", "HL-JUSTIFY-BOOKKEEPING", 1, 0, false);
    //declareFunction(myName, "clear_cached_find_assertion_cycl", "CLEAR-CACHED-FIND-ASSERTION-CYCL", 0, 0, false);
    //declareFunction(myName, "remove_cached_find_assertion_cycl", "REMOVE-CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
    //declareFunction(myName, "cached_find_assertion_cycl_internal", "CACHED-FIND-ASSERTION-CYCL-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_find_assertion_cycl", "CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_bookkeeping", "HL-FORWARD-MT-COMBOS-BOOKKEEPING", 1, 0, false);
    //declareFunction(myName, "hl_verify_defn", "HL-VERIFY-DEFN", 1, 0, false);
    //declareFunction(myName, "hl_justify_defn", "HL-JUSTIFY-DEFN", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_defn", "HL-FORWARD-MT-COMBOS-DEFN", 1, 0, false);
    //declareFunction(myName, "hl_verify_elementof", "HL-VERIFY-ELEMENTOF", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_elementof", "HL-FORWARD-MT-COMBOS-ELEMENTOF", 1, 0, false);
    //declareFunction(myName, "hl_verify_subsetof", "HL-VERIFY-SUBSETOF", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_subsetof", "HL-FORWARD-MT-COMBOS-SUBSETOF", 1, 0, false);
    //declareFunction(myName, "hl_verify_sibling_disjoint", "HL-VERIFY-SIBLING-DISJOINT", 1, 0, false);
    //declareFunction(myName, "hl_justify_sibling_disjoint", "HL-JUSTIFY-SIBLING-DISJOINT", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_sibling_disjoint", "HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT", 1, 0, false);
    //declareFunction(myName, "hl_verify_equality", "HL-VERIFY-EQUALITY", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_equality", "HL-FORWARD-MT-COMBOS-EQUALITY", 1, 0, false);
    //declareFunction(myName, "hl_validate_equality", "HL-VALIDATE-EQUALITY", 2, 0, false);
    //declareFunction(myName, "hl_validate_default", "HL-VALIDATE-DEFAULT", 2, 0, false);
    //declareFunction(myName, "hl_validate_literal_minimal", "HL-VALIDATE-LITERAL-MINIMAL", 2, 0, false);
    //declareFunction(myName, "hl_justify_equality", "HL-JUSTIFY-EQUALITY", 1, 0, false);
    //declareFunction(myName, "hl_verify_eval", "HL-VERIFY-EVAL", 1, 0, false);
    declareFunction(myName, "hl_justify_eval", "HL-JUSTIFY-EVAL", 1, 0, false); new $hl_justify_eval$UnaryFunction();
    //declareFunction(myName, "hl_verify_reflexive", "HL-VERIFY-REFLEXIVE", 1, 0, false);
    declareFunction(myName, "hl_justify_reflexive", "HL-JUSTIFY-REFLEXIVE", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_reflexive", "HL-FORWARD-MT-COMBOS-REFLEXIVE", 1, 0, false);
    //declareFunction(myName, "inference_semantically_valid_irreflexive_literalP", "INFERENCE-SEMANTICALLY-VALID-IRREFLEXIVE-LITERAL?", 1, 1, false);
    //declareFunction(myName, "max_floor_mts_where_reflexive", "MAX-FLOOR-MTS-WHERE-REFLEXIVE", 1, 1, false);
    //declareFunction(myName, "max_floor_mts_where_arg_constraints_met_internal", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET-INTERNAL", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_where_arg_constraints_met", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET", 2, 1, false);
    //declareFunction(myName, "hl_validate_reflexive", "HL-VALIDATE-REFLEXIVE", 2, 0, false);
    //declareFunction(myName, "hl_verify_reflexive_on", "HL-VERIFY-REFLEXIVE-ON", 1, 0, false);
    //declareFunction(myName, "hl_justify_reflexive_on", "HL-JUSTIFY-REFLEXIVE-ON", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_reflexive_on", "HL-FORWARD-MT-COMBOS-REFLEXIVE-ON", 1, 0, false);
    //declareFunction(myName, "max_floor_mts_where_reflexive_on", "MAX-FLOOR-MTS-WHERE-REFLEXIVE-ON", 1, 0, false);
    //declareFunction(myName, "hl_verify_transitivity", "HL-VERIFY-TRANSITIVITY", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_transitivity", "HL-FORWARD-MT-COMBOS-TRANSITIVITY", 1, 0, false);
    declareFunction(myName, "hl_justify_transitivity", "HL-JUSTIFY-TRANSITIVITY", 1, 0, false);
    //declareFunction(myName, "hl_verify_contextual_transitivity", "HL-VERIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
    //declareFunction(myName, "hl_justify_contextual_transitivity", "HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
    //declareFunction(myName, "max_floor_mts_of_transitivity_paths", "MAX-FLOOR-MTS-OF-TRANSITIVITY-PATHS", 3, 1, false);
    //declareFunction(myName, "hl_verify_tva", "HL-VERIFY-TVA", 1, 0, false);
    //declareFunction(myName, "hl_justify_tva", "HL-JUSTIFY-TVA", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_tva", "HL-FORWARD-MT-COMBOS-TVA", 1, 0, false);
    //declareFunction(myName, "hl_verify_rtv", "HL-VERIFY-RTV", 1, 0, false);
    //declareFunction(myName, "hl_justify_rtv", "HL-JUSTIFY-RTV", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_rtv", "HL-FORWARD-MT-COMBOS-RTV", 1, 0, false);
    //declareFunction(myName, "hl_verify_minimize", "HL-VERIFY-MINIMIZE", 1, 0, false);
    //declareFunction(myName, "hl_verify_consistent", "HL-VERIFY-CONSISTENT", 1, 0, false);
    //declareFunction(myName, "hl_justify_consistent", "HL-JUSTIFY-CONSISTENT", 1, 0, false);
    //declareFunction(myName, "hl_verify_conceptually_related", "HL-VERIFY-CONCEPTUALLY-RELATED", 1, 0, false);
    //declareFunction(myName, "hl_justify_conceptually_related", "HL-JUSTIFY-CONCEPTUALLY-RELATED", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_conceptually_related", "HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED", 1, 0, false);
    //declareFunction(myName, "hl_verify_admit", "HL-VERIFY-ADMIT", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_admit", "HL-FORWARD-MT-COMBOS-ADMIT", 1, 0, false);
    declareFunction(myName, "hl_justify_admit", "HL-JUSTIFY-ADMIT", 1, 0, false);
    //declareFunction(myName, "hl_verify_admitted_argument", "HL-VERIFY-ADMITTED-ARGUMENT", 1, 0, false);
    //declareFunction(myName, "hl_verify_admitted_sentence", "HL-VERIFY-ADMITTED-SENTENCE", 1, 0, false);
    //declareFunction(myName, "hl_verify_admitted_nat", "HL-VERIFY-ADMITTED-NAT", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_admitted_argument", "HL-FORWARD-MT-COMBOS-ADMITTED-ARGUMENT", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_admitted_sentence", "HL-FORWARD-MT-COMBOS-ADMITTED-SENTENCE", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_admitted_nat", "HL-FORWARD-MT-COMBOS-ADMITTED-NAT", 1, 0, false);
    //declareFunction(myName, "hl_justify_reformulate", "HL-JUSTIFY-REFORMULATE", 1, 0, false);
    //declareFunction(myName, "hl_justify_assertion", "HL-JUSTIFY-ASSERTION", 1, 0, false);
    //declareFunction(myName, "hl_verify_assertion", "HL-VERIFY-ASSERTION", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_assertion", "HL-FORWARD-MT-COMBOS-ASSERTION", 1, 0, false);
    //declareMacro(myName, "possibly_with_negated_truth", "POSSIBLY-WITH-NEGATED-TRUTH");
    declareFunction(myName, "hl_justify_sbhl", "HL-JUSTIFY-SBHL", 1, 0, false);
    //declareFunction(myName, "hl_verify_isa", "HL-VERIFY-ISA", 1, 0, false);
    //declareFunction(myName, "hl_justify_isa", "HL-JUSTIFY-ISA", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_isa", "HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
    //declareFunction(myName, "justify_not_type_by_extent_known", "JUSTIFY-NOT-TYPE-BY-EXTENT-KNOWN", 3, 0, false);
    //declareFunction(myName, "inference_max_floor_mts_of_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 0, false);
    //declareFunction(myName, "inference_max_floor_mts_of_quoted_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
    //declareFunction(myName, "gaf_axioms", "GAF-AXIOMS", 2, 0, false);
    //declareFunction(myName, "gaf_axioms_genl_mts", "GAF-AXIOMS-GENL-MTS", 2, 0, false);
    //declareFunction(myName, "symmetric_hl_predP", "SYMMETRIC-HL-PRED?", 1, 0, false);
    //declareFunction(myName, "hl_verify_genls", "HL-VERIFY-GENLS", 1, 0, false);
    declareFunction(myName, "hl_justify_genls", "HL-JUSTIFY-GENLS", 1, 0, false);
    declareFunction(myName, "hl_forward_mt_combos_genls", "HL-FORWARD-MT-COMBOS-GENLS", 1, 0, false);
    declareFunction(myName, "inference_max_floor_mts_of_genls_paths", "INFERENCE-MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 0, false);
    //declareFunction(myName, "hl_verify_disjointwith", "HL-VERIFY-DISJOINTWITH", 1, 0, false);
    //declareFunction(myName, "hl_justify_disjointwith", "HL-JUSTIFY-DISJOINTWITH", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_disjointwith", "HL-FORWARD-MT-COMBOS-DISJOINTWITH", 1, 0, false);
    //declareFunction(myName, "hl_verify_genlmt", "HL-VERIFY-GENLMT", 1, 0, false);
    //declareFunction(myName, "hl_justify_genlmt", "HL-JUSTIFY-GENLMT", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_genlmt", "HL-FORWARD-MT-COMBOS-GENLMT", 1, 0, false);
    //declareFunction(myName, "hl_verify_genlpreds", "HL-VERIFY-GENLPREDS", 1, 0, false);
    //declareFunction(myName, "hl_justify_genlpreds", "HL-JUSTIFY-GENLPREDS", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_genlpreds", "HL-FORWARD-MT-COMBOS-GENLPREDS", 1, 0, false);
    //declareFunction(myName, "hl_verify_negationpreds", "HL-VERIFY-NEGATIONPREDS", 1, 0, false);
    //declareFunction(myName, "hl_justify_negationpreds", "HL-JUSTIFY-NEGATIONPREDS", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_negationpreds", "HL-FORWARD-MT-COMBOS-NEGATIONPREDS", 1, 0, false);
    //declareFunction(myName, "hl_verify_time_sentence", "HL-VERIFY-TIME-SENTENCE", 1, 0, false);
    //declareFunction(myName, "hl_true_mts_for_time_sentence", "HL-TRUE-MTS-FOR-TIME-SENTENCE", 1, 0, false);
    //declareFunction(myName, "hl_validate_time", "HL-VALIDATE-TIME", 2, 0, false);
    //declareFunction(myName, "hl_justify_time_sentence", "HL-JUSTIFY-TIME-SENTENCE", 1, 0, false);
    //declareFunction(myName, "hl_verify_asserted_arg1_binary_preds", "HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
    //declareFunction(myName, "hl_justify_asserted_arg1_binary_preds", "HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
    //declareFunction(myName, "hl_verify_shop_effect", "HL-VERIFY-SHOP-EFFECT", 1, 0, false);
    //declareFunction(myName, "hl_justify_shop_effect", "HL-JUSTIFY-SHOP-EFFECT", 1, 0, false);
    //declareFunction(myName, "hl_verify_query", "HL-VERIFY-QUERY", 1, 0, false);
    //declareFunction(myName, "hl_justify_query", "HL-JUSTIFY-QUERY", 1, 0, false);
    //declareFunction(myName, "hl_justify_query_int", "HL-JUSTIFY-QUERY-INT", 3, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_of_query", "HL-FORWARD-MT-COMBOS-OF-QUERY", 1, 0, false);
    //declareFunction(myName, "hl_verify_matrix_of_reaction_type", "HL-VERIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
    //declareFunction(myName, "hl_justify_matrix_of_reaction_type", "HL-JUSTIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
    //declareFunction(myName, "hl_forward_mt_combos_matrix_of_reaction_type", "HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE", 1, 0, false);
    //declareFunction(myName, "hl_verify_parse_tree_relation", "HL-VERIFY-PARSE-TREE-RELATION", 1, 0, false);
    //declareFunction(myName, "hl_justify_parse_tree_relation", "HL-JUSTIFY-PARSE-TREE-RELATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_supports_file() {
    $hl_predicates$ = deflexical("*HL-PREDICATES*", $list0);
    $hl_support_modules$ = deflexical("*HL-SUPPORT-MODULES*", ((NIL != Symbols.boundp($sym2$_HL_SUPPORT_MODULES_)) ? ((SubLObject) $hl_support_modules$.getGlobalValue()) : NIL));
    $hl_support_module_plist_indicators$ = defparameter("*HL-SUPPORT-MODULE-PLIST-INDICATORS*", $list3);
    $perform_opaque_support_verification$ = defparameter("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*", NIL);
    $bookkeeping_justification_assertion_mt$ = deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", ((NIL != Symbols.boundp($sym38$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_)) ? ((SubLObject) $bookkeeping_justification_assertion_mt$.getGlobalValue()) : $const39$BaseKB));
    $cached_find_assertion_cycl_caching_state$ = deflexical("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_hl_supports_file() {
    // CVS_ID("Id: hl-supports.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym2$_HL_SUPPORT_MODULES_);
    utilities_macros.register_cyc_api_function($sym4$HL_SUPPORT_MODULE_P, $list5, $str6$Return_T_iff_OBJECT_is_an_HL_supp, NIL, $list7);
    setup_hl_support_module($kw20$CODE, $list22);
    setup_hl_support_module($kw24$OPAQUE, $list25);
    setup_hl_support_module($kw26$ABDUCTION, $list22);
    subl_macro_promotions.declare_defglobal($sym38$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_);
    mt_vars.note_mt_var($sym38$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_, NIL);
    memoization_state.note_globally_cached_function($sym40$CACHED_FIND_ASSERTION_CYCL);
    setup_hl_support_module($kw43$BOOKKEEPING, $list44);
    setup_hl_support_module($kw46$DEFN, $list47);
    setup_hl_support_module($kw49$ELEMENTOF, $list50);
    setup_hl_support_module($kw53$SUBSETOF, $list54);
    setup_hl_support_module($kw57$SIBLING_DISJOINT, $list58);
    setup_hl_support_module($kw66$EQUALITY, $list67);
    setup_hl_support_module($kw35$EVAL, $list69);
    memoization_state.note_memoized_function($sym77$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET);
    setup_hl_support_module($kw78$REFLEXIVE, $list79);
    setup_hl_support_module($kw88$REFLEXIVE_ON, $list89);
    setup_hl_support_module($kw90$TRANSITIVITY, $list91);
    setup_hl_support_module($kw92$CONTEXTUAL_TRANSITIVITY, $list93);
    setup_hl_support_module($kw97$TVA, $list98);
    setup_hl_support_module($kw100$RTV, $list101);
    setup_hl_support_module($kw104$MINIMIZE, $list105);
    setup_hl_support_module($kw106$CONSISTENT, $list107);
    setup_hl_support_module($kw108$CONCEPTUALLY_RELATED, $list109);
    setup_hl_support_module($kw76$ADMIT, $list112);
    setup_hl_support_module($kw114$REFORMULATE, $list115);
    setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), $list116);
    setup_hl_support_module($kw118$EXTERNAL, NIL);
    setup_hl_support_module($kw119$EXTERNAL_EVAL, NIL);
    setup_hl_support_module($kw75$ISA, $list134);
    setup_hl_support_module($kw139$GENLS, $list140);
    setup_hl_support_module($kw144$DISJOINTWITH, $list145);
    setup_hl_support_module($kw146$GENLMT, $list147);
    setup_hl_support_module($kw151$GENLPREDS, $list152);
    setup_hl_support_module($kw155$NEGATIONPREDS, $list156);
    setup_hl_support_module($kw159$TIME, $list160);
    setup_hl_support_module($kw161$ASSERTED_ARG1_BINARY_PREDS, $list162);
    setup_hl_support_module($kw163$FCP, $list164);
    setup_hl_support_module($kw165$SHOP_EFFECT, $list166);
    setup_hl_support_module($kw172$QUERY, $list173);
    setup_hl_support_module($kw176$MATRIX_OF_REACTION_TYPE, $list177);
    utilities_macros.note_funcall_helper_function($sym178$HL_VERIFY_PARSE_TREE_RELATION);
    utilities_macros.note_funcall_helper_function($sym179$HL_JUSTIFY_PARSE_TREE_RELATION);
    setup_hl_support_module($kw180$PARSE_TREE, $list181);
    setup_hl_support_module($kw182$WORD_STRINGS, $list183);
    setup_hl_support_module($kw184$TERM_PHRASES, $list185);
    setup_hl_support_module($kw186$RKF_IRRELEVANT_FORT_CACHE, $list187);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), constant_handles.reader_make_constant_shell(makeString("equals")), constant_handles.reader_make_constant_shell(makeString("equalSymbols")), constant_handles.reader_make_constant_shell(makeString("different")), constant_handles.reader_make_constant_shell(makeString("differentSymbols")), constant_handles.reader_make_constant_shell(makeString("evaluate")), constant_handles.reader_make_constant_shell(makeString("elementOf")), constant_handles.reader_make_constant_shell(makeString("subsetOf")), constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("genlMt")), constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("negationPreds")), constant_handles.reader_make_constant_shell(makeString("negationInverse")), constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated"))});
  public static final SubLSymbol $sym1$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym2$_HL_SUPPORT_MODULES_ = makeSymbol("*HL-SUPPORT-MODULES*");
  public static final SubLList $list3 = list(makeKeyword("VERIFY"), makeKeyword("JUSTIFY"), makeKeyword("VALIDATE"), makeKeyword("FORWARD-MT-COMBOS"));
  public static final SubLSymbol $sym4$HL_SUPPORT_MODULE_P = makeSymbol("HL-SUPPORT-MODULE-P");
  public static final SubLList $list5 = list(makeSymbol("OBJECT"));
  public static final SubLString $str6$Return_T_iff_OBJECT_is_an_HL_supp = makeString("Return T iff OBJECT is an HL support module.");
  public static final SubLList $list7 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym8$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLString $str9$_S_was_not_a_valid_hl_support_mod = makeString("~S was not a valid hl-support-module indicator");
  public static final SubLSymbol $kw10$VERIFY = makeKeyword("VERIFY");
  public static final SubLSymbol $kw11$JUSTIFY = makeKeyword("JUSTIFY");
  public static final SubLSymbol $kw12$VALIDATE = makeKeyword("VALIDATE");
  public static final SubLSymbol $kw13$FORWARD_MT_COMBOS = makeKeyword("FORWARD-MT-COMBOS");
  public static final SubLSymbol $sym14$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym15$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLSymbol $sym16$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym17$APPEND = makeSymbol("APPEND");
  public static final SubLSymbol $sym18$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
  public static final SubLObject $const19$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $kw20$CODE = makeKeyword("CODE");
  public static final SubLSymbol $sym21$HL_SUPPORT_MT = makeSymbol("HL-SUPPORT-MT");
  public static final SubLList $list22 = list(makeKeyword("VERIFY"), makeSymbol("TRUE"));
  public static final SubLList $list23 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLSymbol $kw24$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLList $list25 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-OPAQUE"));
  public static final SubLSymbol $kw26$ABDUCTION = makeKeyword("ABDUCTION");
  public static final SubLSymbol $kw27$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw28$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw29$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLObject $const30$myCreator = constant_handles.reader_make_constant_shell(makeString("myCreator"));
  public static final SubLObject $const31$myCreationPurpose = constant_handles.reader_make_constant_shell(makeString("myCreationPurpose"));
  public static final SubLObject $const32$myCreationTime = constant_handles.reader_make_constant_shell(makeString("myCreationTime"));
  public static final SubLObject $const33$myCreationSecond = constant_handles.reader_make_constant_shell(makeString("myCreationSecond"));
  public static final SubLObject $const34$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLSymbol $kw35$EVAL = makeKeyword("EVAL");
  public static final SubLObject $const36$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));
  public static final SubLObject $const37$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLSymbol $sym38$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_ = makeSymbol("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*");
  public static final SubLObject $const39$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $sym40$CACHED_FIND_ASSERTION_CYCL = makeSymbol("CACHED-FIND-ASSERTION-CYCL");
  public static final SubLSymbol $sym41$_CACHED_FIND_ASSERTION_CYCL_CACHING_STATE_ = makeSymbol("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*");
  public static final SubLSymbol $kw42$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw43$BOOKKEEPING = makeKeyword("BOOKKEEPING");
  public static final SubLList $list44 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-BOOKKEEPING"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-BOOKKEEPING"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-BOOKKEEPING"));
  public static final SubLList $list45 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));
  public static final SubLSymbol $kw46$DEFN = makeKeyword("DEFN");
  public static final SubLList $list47 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DEFN"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DEFN"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DEFN"));
  public static final SubLList $list48 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ARGS")));
  public static final SubLSymbol $kw49$ELEMENTOF = makeKeyword("ELEMENTOF");
  public static final SubLList $list50 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ELEMENTOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ELEMENTOF"));
  public static final SubLObject $const51$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLObject $const52$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLSymbol $kw53$SUBSETOF = makeKeyword("SUBSETOF");
  public static final SubLList $list54 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SUBSETOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SUBSETOF"));
  public static final SubLList $list55 = list(makeSymbol("COL1"), makeSymbol("COL2"));
  public static final SubLSymbol $kw56$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw57$SIBLING_DISJOINT = makeKeyword("SIBLING-DISJOINT");
  public static final SubLList $list58 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SIBLING-DISJOINT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SIBLING-DISJOINT"));
  public static final SubLObject $const59$equalSymbols = constant_handles.reader_make_constant_shell(makeString("equalSymbols"));
  public static final SubLObject $const60$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLSymbol $kw61$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw62$MINIMAL = makeKeyword("MINIMAL");
  public static final SubLSymbol $kw63$ARG_TYPE = makeKeyword("ARG-TYPE");
  public static final SubLSymbol $kw64$ALL = makeKeyword("ALL");
  public static final SubLString $str65$Unexpected_intermediate_step_vali = makeString("Unexpected intermediate step validation level ~s");
  public static final SubLSymbol $kw66$EQUALITY = makeKeyword("EQUALITY");
  public static final SubLList $list67 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EQUALITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-EQUALITY"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-EQUALITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EQUALITY"));
  public static final SubLObject $const68$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLList $list69 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EVAL"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EVAL"));
  public static final SubLList $list70 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLObject $const71$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));
  public static final SubLObject $const72$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));
  public static final SubLObject $const73$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const74$admittedArgument = constant_handles.reader_make_constant_shell(makeString("admittedArgument"));
  public static final SubLSymbol $kw75$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw76$ADMIT = makeKeyword("ADMIT");
  public static final SubLSymbol $sym77$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET = makeSymbol("MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET");
  public static final SubLSymbol $kw78$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLList $list79 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-REFLEXIVE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE"));
  public static final SubLList $list80 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLList $list81 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $sym82$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const83$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const84$reflexiveOn = constant_handles.reader_make_constant_shell(makeString("reflexiveOn"));
  public static final SubLSymbol $kw85$GAF = makeKeyword("GAF");
  public static final SubLList $list86 = cons(makeSymbol("REFLEX-MT"), makeSymbol("COL"));
  public static final SubLSymbol $sym87$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $kw88$REFLEXIVE_ON = makeKeyword("REFLEXIVE-ON");
  public static final SubLList $list89 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE-ON"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE-ON"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE-ON"));
  public static final SubLSymbol $kw90$TRANSITIVITY = makeKeyword("TRANSITIVITY");
  public static final SubLList $list91 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TRANSITIVITY"));
  public static final SubLSymbol $kw92$CONTEXTUAL_TRANSITIVITY = makeKeyword("CONTEXTUAL-TRANSITIVITY");
  public static final SubLList $list93 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONTEXTUAL-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY"));
  public static final SubLSymbol $kw94$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $sym95$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLList $list96 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLSymbol $kw97$TVA = makeKeyword("TVA");
  public static final SubLList $list98 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TVA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TVA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TVA"));
  public static final SubLList $list99 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("SUPPORT-MT"), makeSymbol("TV"));
  public static final SubLSymbol $kw100$RTV = makeKeyword("RTV");
  public static final SubLList $list101 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RTV"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RTV"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RTV"));
  public static final SubLList $list102 = list(makeSymbol("HL-MODULE"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLObject $const103$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLSymbol $kw104$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLList $list105 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MINIMIZE"));
  public static final SubLSymbol $kw106$CONSISTENT = makeKeyword("CONSISTENT");
  public static final SubLList $list107 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONSISTENT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONSISTENT"));
  public static final SubLSymbol $kw108$CONCEPTUALLY_RELATED = makeKeyword("CONCEPTUALLY-RELATED");
  public static final SubLList $list109 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONCEPTUALLY-RELATED"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONCEPTUALLY-RELATED"));
  public static final SubLObject $const110$admittedSentence = constant_handles.reader_make_constant_shell(makeString("admittedSentence"));
  public static final SubLObject $const111$admittedNAT = constant_handles.reader_make_constant_shell(makeString("admittedNAT"));
  public static final SubLList $list112 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ADMIT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ADMIT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ADMIT"));
  public static final SubLList $list113 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("RELATION"));
  public static final SubLSymbol $kw114$REFORMULATE = makeKeyword("REFORMULATE");
  public static final SubLList $list115 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFORMULATE"));
  public static final SubLList $list116 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTION"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ASSERTION"));
  public static final SubLList $list117 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLSymbol $kw118$EXTERNAL = makeKeyword("EXTERNAL");
  public static final SubLSymbol $kw119$EXTERNAL_EVAL = makeKeyword("EXTERNAL-EVAL");
  public static final SubLList $list120 = list(list(makeSymbol("LITERAL-VAR"), makeSymbol("TV-VAR"), makeSymbol("LITERAL"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym121$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym122$EL_NEGATION_P = makeSymbol("EL-NEGATION-P");
  public static final SubLSymbol $sym123$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym124$FORMULA_ARG1 = makeSymbol("FORMULA-ARG1");
  public static final SubLList $list125 = list(makeKeyword("REGULARIZE"));
  public static final SubLSymbol $sym126$INVERSE_TV = makeSymbol("INVERSE-TV");
  public static final SubLSymbol $sym127$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $kw128$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLObject $const129$nearestIsa = constant_handles.reader_make_constant_shell(makeString("nearestIsa"));
  public static final SubLObject $const130$nearestIsaOfType = constant_handles.reader_make_constant_shell(makeString("nearestIsaOfType"));
  public static final SubLObject $const131$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLObject $const132$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLList $list133 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"));
  public static final SubLList $list134 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ISA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ISA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ISA"));
  public static final SubLList $list135 = list(makeSymbol("GAF"), makeSymbol("TV"));
  public static final SubLList $list136 = list(constant_handles.reader_make_constant_shell(makeString("disjointWith")));
  public static final SubLObject $const137$nearestGenls = constant_handles.reader_make_constant_shell(makeString("nearestGenls"));
  public static final SubLObject $const138$nearestGenlsOfType = constant_handles.reader_make_constant_shell(makeString("nearestGenlsOfType"));
  public static final SubLSymbol $kw139$GENLS = makeKeyword("GENLS");
  public static final SubLList $list140 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLS"));
  public static final SubLObject $const141$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const142$instancesOfDisjointCollections = constant_handles.reader_make_constant_shell(makeString("instancesOfDisjointCollections"));
  public static final SubLList $list143 = list(makeSymbol("TERM1"), makeSymbol("TERM2"));
  public static final SubLSymbol $kw144$DISJOINTWITH = makeKeyword("DISJOINTWITH");
  public static final SubLList $list145 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DISJOINTWITH"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DISJOINTWITH"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DISJOINTWITH"));
  public static final SubLSymbol $kw146$GENLMT = makeKeyword("GENLMT");
  public static final SubLList $list147 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLMT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLMT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLMT"));
  public static final SubLList $list148 = list(makeSymbol("PREDICATE"), makeSymbol("SPEC"), makeSymbol("GENL"));
  public static final SubLObject $const149$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const150$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $kw151$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLList $list152 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLPREDS"));
  public static final SubLObject $const153$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLObject $const154$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $kw155$NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
  public static final SubLList $list156 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-NEGATIONPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-NEGATIONPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-NEGATIONPREDS"));
  public static final SubLString $str157$Time_feature_not_supported__Suppo = makeString("Time feature not supported. Support unverifiable: ~a~%");
  public static final SubLString $str158$Time_feature_not_supported__Suppo = makeString("Time feature not supported. Support-mts not computable: ~a~%");
  public static final SubLSymbol $kw159$TIME = makeKeyword("TIME");
  public static final SubLList $list160 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TIME-SENTENCE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-TRUE-MTS-FOR-TIME-SENTENCE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-TIME"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TIME-SENTENCE"));
  public static final SubLSymbol $kw161$ASSERTED_ARG1_BINARY_PREDS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS");
  public static final SubLList $list162 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("FORWARD-MT-COMBOS"), NIL);
  public static final SubLSymbol $kw163$FCP = makeKeyword("FCP");
  public static final SubLList $list164 = list(makeKeyword("VERIFY"), makeSymbol("REMOVAL-FCP-VERIFY"), makeKeyword("JUSTIFY"), makeSymbol("REMOVAL-FCP-JUSTIFY"), makeKeyword("FORWARD-MT-COMBOS"), NIL);
  public static final SubLSymbol $kw165$SHOP_EFFECT = makeKeyword("SHOP-EFFECT");
  public static final SubLList $list166 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SHOP-EFFECT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SHOP-EFFECT"), makeKeyword("FORWARD-MT-COMBOS"), NIL);
  public static final SubLList $list167 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("BINDINGS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"));
  public static final SubLSymbol $kw168$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLList $list169 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("SUPPORTS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"));
  public static final SubLSymbol $kw170$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLList $list171 = list(makeSymbol("COMBO-MTS"), makeSymbol("COMBO-SUPPORTS"));
  public static final SubLSymbol $kw172$QUERY = makeKeyword("QUERY");
  public static final SubLList $list173 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-QUERY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUERY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-OF-QUERY"));
  public static final SubLString $str174$Halo_feature_not_supported__Suppo = makeString("Halo feature not supported. Support unverifiable: ~a~%");
  public static final SubLString $str175$Halo_feature_not_supported__Suppo = makeString("Halo feature not supported. Support-mts not computable: ~a~%");
  public static final SubLSymbol $kw176$MATRIX_OF_REACTION_TYPE = makeKeyword("MATRIX-OF-REACTION-TYPE");
  public static final SubLList $list177 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE"));
  public static final SubLSymbol $sym178$HL_VERIFY_PARSE_TREE_RELATION = makeSymbol("HL-VERIFY-PARSE-TREE-RELATION");
  public static final SubLSymbol $sym179$HL_JUSTIFY_PARSE_TREE_RELATION = makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION");
  public static final SubLSymbol $kw180$PARSE_TREE = makeKeyword("PARSE-TREE");
  public static final SubLList $list181 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-PARSE-TREE-RELATION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION"));
  public static final SubLSymbol $kw182$WORD_STRINGS = makeKeyword("WORD-STRINGS");
  public static final SubLList $list183 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-WORD-STRINGS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-WORD-STRINGS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS"));
  public static final SubLSymbol $kw184$TERM_PHRASES = makeKeyword("TERM-PHRASES");
  public static final SubLList $list185 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TERM-PHRASES"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TERM-PHRASES"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES"));
  public static final SubLSymbol $kw186$RKF_IRRELEVANT_FORT_CACHE = makeKeyword("RKF-IRRELEVANT-FORT-CACHE");
  public static final SubLList $list187 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE"));

  //// Initializers

  public void declareFunctions() {
    declare_hl_supports_file();
  }

  public void initializeVariables() {
    init_hl_supports_file();
  }

  public void runTopLevelForms() {
    setup_hl_supports_file();
  }

}
