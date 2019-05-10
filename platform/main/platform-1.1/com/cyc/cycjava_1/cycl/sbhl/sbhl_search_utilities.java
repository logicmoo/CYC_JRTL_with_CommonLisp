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

package com.cyc.cycjava_1.cycl.sbhl;
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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.kb_access_metering;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_transitivity;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_search_utilities extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_utilities() {}
  public static final SubLFile me = new sbhl_search_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities";

  //// Definitions

  /** Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by MODULE's type, DIRECTION, and TV. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 632) 
  public static final SubLObject determine_sbhl_search_behavior(SubLObject module, SubLObject direction, SubLObject tv) {
    checkType(module, $sym0$SBHL_MODULE_P);
    if ((NIL != sbhl_module_utilities.sbhl_transitive_module_p(module))) {
      if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
        return $sym1$SBHL_SIMPLE_TRUE_SEARCH;
      } else {
        return $sym2$SBHL_SIMPLE_FALSE_SEARCH;
      }
    } else if ((NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module))) {
      if ((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction))) {
        return $sym3$SBHL_STEP_AND_SWEEP_WITH_TT_MODULE;
      } else {
        return $sym4$SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP;
      }
    } else if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
      return $sym5$SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN;
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str6$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Accessor: @return sbhl-space-object-p; uses SEARCH-BEHAVIOR to determine which marking space will contain goal markings. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 1510) 
  public static final SubLObject determine_sbhl_terminating_marking_space(SubLObject search_behavior) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = search_behavior;
        if (pcase_var.eql($sym1$SBHL_SIMPLE_TRUE_SEARCH)) {
          return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
        } else if (pcase_var.eql($sym2$SBHL_SIMPLE_FALSE_SEARCH)) {
          return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        } else if (pcase_var.eql($sym3$SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
          return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
        } else if (pcase_var.eql($sym4$SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
          return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        } else if (pcase_var.eql($sym5$SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
          return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        } else {
          sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$Search_Behavior_not_recognized___, search_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  /** Accessor. @return booleanp; whether MODULE marks in gather space before performing other search. Used for boolean disjoins searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 2174) 
  public static final SubLObject sbhl_module_premarks_gather_nodes_p() {
    return makeBoolean(((NIL != sbhl_search_vars.sbhl_boolean_search_p())
           && (NIL != sbhl_module_utilities.sbhl_disjoins_search_p())
           && (NIL != sbhl_search_vars.sbhl_true_search_p())));
  }

  /** Accessor. @return listp; the gaf part of JUST-STEP. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 2545) 
  public static final SubLObject sbhl_just_gaf(SubLObject just_step) {
    return just_step.first();
  }

  /** Accessor. @return sbhl-mt-object-p; the mt of JUST-STEP. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 2748) 
  public static final SubLObject sbhl_just_mt(SubLObject just_step) {
    return conses_high.second(just_step);
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 2879) 
  public static final SubLObject sbhl_possibly_just_mt(SubLObject just_step, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = sbhl_just_mt(just_step);
        if ((NIL != result)) {
          return result;
        } else if ((NIL != mt)) {
          return mt;
        } else {
          return mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
      }
    }
  }

  /** Accessor. @return sbhl-tv-object-p; the truth value of JUST-STEP. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 3076) 
  public static final SubLObject sbhl_just_tv(SubLObject just_step) {
    return conses_high.third(just_step);
  }

  /** Accessor. @return fort-p; the predicate of GAF-FORMULA */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 3220) 
  public static final SubLObject sbhl_gaf_pred(SubLObject gaf_formula) {
    return gaf_formula.first();
  }

  /** Accessor. @return gaf-assertion?; the assertion associated with GAF-FORMULA and MT. if the predicate of GAF-FORMULA is symmetric, the associated assertion may have it's arguments flipped. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 3813) 
  public static final SubLObject sbhl_find_gaf(SubLObject gaf_formula, SubLObject mt, SubLObject tv) {
    {
      SubLObject result = NIL;
      SubLObject lucky_gaf = kb_indexing.find_gaf(gaf_formula, mt);
      SubLObject pred = sbhl_gaf_pred(gaf_formula);
      SubLObject hl_module = sbhl_module_utilities.sbhl_pred_get_hl_module(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
      if ((NIL != lucky_gaf)) {
        result = lucky_gaf;
      } else if ((NIL == sbhl_module_utilities.sbhl_predicate_p(pred))) {
        {
          SubLObject gaf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2328");
          if ((NIL != gaf)) {
            result = gaf;
          } else {
            result = arguments.make_hl_support(hl_module, gaf_formula, mt, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2317"));
          }
        }
      } else if ((NIL == sbhl_module_utilities.sbhl_module_directed_linksP(sbhl_module_vars.get_sbhl_module(pred)))) {
        {
          SubLObject datum = gaf_formula;
          SubLObject current = datum;
          SubLObject pred_1 = NIL;
          SubLObject arg1 = NIL;
          SubLObject arg2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
          pred_1 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
          arg1 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
          arg2 = current.first();
          current = current.rest();
          if ((NIL == current)) {
            {
              SubLObject sym_formula = list(pred_1, arg2, arg1);
              SubLObject gaf = kb_indexing.find_gaf(sym_formula, mt);
              if ((NIL == gaf)) {
                gaf = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2329");
              }
              if ((NIL == gaf)) {
                gaf = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2330");
              }
              if ((NIL != gaf)) {
                result = gaf;
              } else {
                result = arguments.make_hl_support(hl_module, gaf_formula, mt, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2318"));
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list12);
          }
        }
      } else {
        {
          SubLObject gaf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2331");
          if ((NIL != gaf)) {
            result = gaf;
          } else {
            result = arguments.make_hl_support(hl_module, gaf_formula, mt, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2319"));
          }
        }
      }
      return result;
    }
  }

  /** Accessor. Takes JUST-STEP and assembles a justification step it according to @see get-sbhl-just-behavior. The return is either a list or an assertion. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 5388) 
  public static final SubLObject sbhl_assemble_justification_step(SubLObject just_step, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != arguments.hl_support_p(just_step))) {
      return just_step;
    }
    {
      SubLObject assembly_behavior = sbhl_search_vars.get_sbhl_just_behavior();
      SubLObject just_tv = sbhl_just_tv(just_step);
      SubLObject tv = ((NIL != sbhl_link_vars.sbhl_link_truth_value_p(just_tv)) ? ((SubLObject) sbhl_search_vars.sbhl_possibly_translate_tv(just_tv)) : just_tv);
      if ((NIL == assembly_behavior)) {
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2477"))) {
          assembly_behavior = $kw13$OLD;
        }
      }
      {
        SubLObject pcase_var = assembly_behavior;
        if (pcase_var.eql($kw14$ASSERTION)) {
          return sbhl_find_gaf(sbhl_just_gaf(just_step), sbhl_possibly_just_mt(just_step, mt), just_tv);
        } else if (pcase_var.eql($kw15$VERBOSE)) {
          return just_step;
        } else if (pcase_var.eql($kw13$OLD)) {
          return ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2478")) ? ((SubLObject) list(sbhl_just_gaf(just_step), tv)) : list(sbhl_just_gaf(just_step), sbhl_search_vars.sbhl_possibly_translate_tv(sbhl_just_tv(just_step))));
        } else {
          sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$incorrect_justification_assembly_, assembly_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  /** @return listp; the justification distilled from repeated application of @see sbhl-assemble-justification-step, to JUST-PATH. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 6490) 
  public static final SubLObject sbhl_assemble_justification(SubLObject just_path, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != sbhl_search_vars.sbhl_justification_assembled_p())) {
      return just_path;
    } else {
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = just_path;
        SubLObject just_step = NIL;
        for (just_step = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), just_step = cdolist_list_var.first()) {
          result = cons(sbhl_assemble_justification_step(just_step, mt), result);
        }
        return Sequences.nreverse(result);
      }
    }
  }

  /** Wraps the execution of METHOD (with args NODE1 NODE2 MT TV) so that justifications will be accumulated on the unwind. Justification behavior is governed by BEHAVIOR. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 6906) 
  public static final SubLObject sbhl_handle_justification(SubLObject method, SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior, SubLObject justify_node_equalityP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((behavior == UNPROVIDED)) {
      behavior = sbhl_search_vars.$sbhl_justification_behavior$.getDynamicValue();
    }
    if ((justify_node_equalityP == UNPROVIDED)) {
      justify_node_equalityP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject just = NIL;
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_justification_assembled_p$.currentBinding(thread);
          SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_justification_defaulted_old$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_justification_assembled_p$.bind(NIL, thread);
            sbhl_search_vars.$sbhl_justification_defaulted_old$.bind(NIL, thread);
            if ((NIL != behavior)) {
              {
                SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_justification_behavior$.bind(behavior, thread);
                  if (((NIL != justify_node_equalityP)
                       && node1.equal(node2)
                       && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module)))) {
                    just = list(arguments.make_hl_support($kw17$REFLEXIVE, el_utilities.make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
                  } else if (((NIL != justify_node_equalityP)
                       && node1.equal(node2)
                       && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))
                       && (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 69")))) {
                    just = list(list($const18$equals, node1, node2), mt, $const19$MonotonicallyTrue);
                  } else {
                    {
                      SubLObject _prev_bind_0_3 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                      SubLObject _prev_bind_1_4 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                      SubLObject _prev_bind_2_5 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                      SubLObject _prev_bind_3_6 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                      SubLObject _prev_bind_4_7 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_unwind_function$.bind(((NIL != sbhl_module_utilities.sbhl_time_search_p()) ? ((SubLObject) $sym20$SBHL_TEMPORAL_JUSTIFICATION_UNWIND) : $sym21$SBHL_PUSH_UNWIND_ONTO_RESULT), thread);
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                        sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                        try {
                          result = Functions.funcall(method, module, node1, node2, mt, tv);
                        } finally {
                          {
                            SubLObject _prev_bind_0_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                            }
                          }
                        }
                      } finally {
                        sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_4_7, thread);
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3_6, thread);
                        sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_5, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_4, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_3, thread);
                      }
                    }
                  }
                  just = sbhl_assemble_justification(just, mt);
                } finally {
                  sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0_2, thread);
                }
              }
            } else {
              if (((NIL != justify_node_equalityP)
                   && node1.equal(node2)
                   && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module)))) {
                just = list(arguments.make_hl_support($kw17$REFLEXIVE, el_utilities.make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
              } else if (((NIL != justify_node_equalityP)
                   && node1.equal(node2)
                   && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 70")))) {
                just = list(list($const18$equals, node1, node2), mt, $const19$MonotonicallyTrue);
              } else {
                {
                  SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                  SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                  SubLObject _prev_bind_2_11 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                  SubLObject _prev_bind_3_12 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                  SubLObject _prev_bind_4_13 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                  try {
                    sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                    sbhl_search_vars.$sbhl_unwind_function$.bind(((NIL != sbhl_module_utilities.sbhl_time_search_p()) ? ((SubLObject) $sym20$SBHL_TEMPORAL_JUSTIFICATION_UNWIND) : $sym21$SBHL_PUSH_UNWIND_ONTO_RESULT), thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                    sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                    try {
                      result = Functions.funcall(method, module, node1, node2, mt, tv);
                    } finally {
                      {
                        SubLObject _prev_bind_0_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                          just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                        } finally {
                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                        }
                      }
                    }
                  } finally {
                    sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_4_13, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3_12, thread);
                    sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_11, thread);
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_10, thread);
                    sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_9, thread);
                  }
                }
              }
              just = sbhl_assemble_justification(just, mt);
            }
          } finally {
            sbhl_search_vars.$sbhl_justification_defaulted_old$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$sbhl_justification_assembled_p$.rebind(_prev_bind_5, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
          }
        }
        if (((NIL != list_utilities.lengthGE(just, TWO_INTEGER, UNPROVIDED))
             && (NIL != sbhl_module_utilities.sbhl_transitive_module_p(module))
             && (NIL == sbhl_module_utilities.sbhl_inverse_module_p(module)))) {
          just = conses_high.adjoin(sbhl_module_transitivity_support(module, mt), just, Symbols.symbol_function(EQUAL), UNPROVIDED);
        }
        return ((NIL != just) ? ((SubLObject) just) : result);
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 8595) 
  public static final SubLObject sbhl_module_transitivity_support(SubLObject module, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == sbhl_module_utilities.sbhl_transitive_module_p(module))) {
          Errors.error($str22$_S_is_not_a_transitive_module, module);
        }
      }
      return removal_modules_transitivity.make_transitivity_support(sbhl_module_utilities.get_sbhl_link_pred(module), $const23$UniversalVocabularyMt, UNPROVIDED);
    }
  }

  /** @hack removes funcalls. Applies TEST-FN (to NODE, where appropriate).  Used to determine whether to add node to result. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 12487) 
  public static final SubLObject apply_sbhl_add_node_test(SubLObject test_fn, SubLObject node) {
    {
      SubLObject pcase_var = test_fn;
      if (pcase_var.eql($sym25$NOT_GENL_INVERSE_MODE_P)) {
        return sbhl_search_vars.not_genl_inverse_mode_p();
      } else if (pcase_var.eql($sym26$GENL_INVERSE_MODE_P)) {
        return sbhl_search_vars.genl_inverse_mode_p();
      } else if (pcase_var.eql($sym27$NON_EMPTY_EXTENT)) {
        return T;
      } else {
        sbhl_paranoia.sbhl_warn(THREE_INTEGER, $str28$Using_potentially_unsupported_gat, test_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Functions.funcall(test_fn, node);
      }
    }
  }

  /** Modifier. will push NODE onto @see *sbhl-result*. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 13632) 
  public static final SubLObject sbhl_push_onto_result(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
      return NIL;
    }
  }

  /** Modifier. will push NODE onto *sbhl-result* if applying *sbhl-compose-fn* to node gives a non-nil answer. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 13776) 
  public static final SubLObject sbhl_push_onto_result_if(SubLObject node) {
    {
      SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
      SubLObject test_p = Functions.funcall(compose_fn, node);
      if ((NIL != test_p)) {
        sbhl_push_onto_result(node);
      }
    }
    return NIL;
  }

  public static final class $sbhl_push_onto_result_if$UnaryFunction extends UnaryFunction {
    public $sbhl_push_onto_result_if$UnaryFunction() { super(extractFunctionNamed("SBHL-PUSH-ONTO-RESULT-IF")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_push_onto_result_if(arg1); }
  }

  /** Modifier: will push a list of *sbhl-module*, the nodes in NODELIST, *sbhl-link-mt*, and sbhl-link-tv* onto the result. If search is a time search, instead calls @see sbhl-temporal-justification-unwind. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 15018) 
  public static final SubLObject sbhl_push_unwind_onto_result(SubLObject nodelist) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject directedP = sbhl_module_utilities.sbhl_module_directed_linksP(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject forwardP = ((NIL != directedP) ? ((SubLObject) sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) : T);
        SubLObject node1 = ((NIL != forwardP) ? ((SubLObject) nodelist.first()) : conses_high.second(nodelist));
        SubLObject node2 = ((NIL != forwardP) ? ((SubLObject) conses_high.second(nodelist)) : nodelist.first());
        if (((NIL != forts.fort_p(node1))
            || (NIL == forwardP))) {
          sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node1, node2), sbhl_link_vars.get_sbhl_link_mt(), sbhl_link_vars.get_sbhl_link_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
        } else {
          sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 57"), thread);
        }
      }
      return NIL;
    }
  }

  /** Modifier. Applies *sbhl-compose-fn* to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 16956) 
  public static final SubLObject sbhl_apply_compose_fn(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        if ((NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP())) {
          {
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
              sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
              Functions.funcall(compose_fn, node);
            } finally {
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
              sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
              sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          Functions.funcall(compose_fn, node);
        }
      }
      return NIL;
    }
  }

  /** Modifier. Applies *sbhl-compose-fn* to node. If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 18252) 
  public static final SubLObject sbhl_gather_first_non_nil_result(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        SubLObject result = NIL;
        if ((NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP())) {
          {
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
              sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
              result = Functions.funcall(compose_fn, node);
            } finally {
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
              sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
              sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          result = Functions.funcall(compose_fn, node);
        }
        if ((NIL != result)) {
          sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
          sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
        }
      }
      return NIL;
    }
  }

  /** Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. If the result is nil, sets *sbhl-finished?* to the value of done? */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 18786) 
  public static final SubLObject sbhl_gather_first_non_nil_result_with_prune(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        SubLObject v_return = NIL;
        if ((NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP())) {
          {
            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
              sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
              v_return = Functions.funcall(compose_fn, node);
            } finally {
              sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
              sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
              sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          v_return = Functions.funcall(compose_fn, node);
        }
        {
          SubLObject datum = v_return;
          SubLObject current = datum;
          SubLObject result = NIL;
          SubLObject doneP = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list30);
          result = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list30);
          doneP = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL != result)) {
              sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
              sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
            } else {
              if ((NIL != doneP)) {
                sbhl_search_vars.sbhl_stop_search_path();
              } else {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2474");
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list30);
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier. Sets *sbhl-result* to true, and sets *sbhl-finished?* to indicate that the goal was found. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 20675) 
  public static final SubLObject set_sbhl_boolean_goal_conditions() {
    sbhl_search_vars.sbhl_finished_with_goal();
    if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
      sbhl_search_vars.sbhl_toggle_unwind_function_on();
    } else {
      sbhl_search_vars.$sbhl_result$.setDynamicValue(T);
    }
    return NIL;
  }

  /** Modifier. Determines if NODE is marked with a terminating mark in the *sbhl-goal-space*. If so, calls @see set-sbhl-boolean-goal-conditions. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 20985) 
  public static final SubLObject sbhl_node_marked_as_goal_node(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject goal_space = sbhl_marking_vars.get_sbhl_goal_space();
        if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, goal_space))) {
          if (((NIL != sbhl_search_vars.sbhl_justification_search_p())
               && (NIL != sbhl_module_premarks_gather_nodes_p()))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1442");
            sbhl_search_vars.$sbhl_result$.setDynamicValue(Sequences.nreverse(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
          }
          set_sbhl_boolean_goal_conditions();
        }
      }
      return NIL;
    }
  }

  /** Modifier. Determines if NODE is the current *sbhl-goal-node*. If so, calls @see set-sbhl-boolean-goal-conditions. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 21529) 
  public static final SubLObject sbhl_node_is_goal_node(SubLObject node) {
    if ((NIL != sbhl_search_vars.sbhl_goal_node_p(node))) {
      set_sbhl_boolean_goal_conditions();
    }
    return NIL;
  }

  /** Modifier. Checks cutoff conditions and terminates search if cutoff is reached. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 22279) 
  public static final SubLObject sbhl_check_cutoff(SubLObject node) {
    return NIL;
  }

  public static final class $sbhl_check_cutoff$UnaryFunction extends UnaryFunction {
    public $sbhl_check_cutoff$UnaryFunction() { super(extractFunctionNamed("SBHL-CHECK-CUTOFF")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_check_cutoff(arg1); }
  }

  /** Modifier: applies FN to NODE. Used at each step of search. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 22435) 
  public static final SubLObject apply_sbhl_consider_node_fn(SubLObject fn, SubLObject node) {
    {
      SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
      SubLObject apply_fnP = T;
      if ((NIL != add_node_test)) {
        apply_fnP = apply_sbhl_add_node_test(add_node_test, node);
      }
      if (((NIL != apply_fnP)
           && (NIL != fn))) {
        {
          SubLObject pcase_var = fn;
          if (pcase_var.eql($sym31$SBHL_PUSH_ONTO_RESULT)) {
            sbhl_push_onto_result(node);
          } else if (pcase_var.eql($sym32$SBHL_PUSH_ONTO_RESULT_WITH_PRUNE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2340");
          } else if (pcase_var.eql($sym33$SBHL_NODE_IS_GOAL_NODE)) {
            sbhl_node_is_goal_node(node);
          } else if (pcase_var.eql($sym34$SBHL_NODE_MARKED_AS_GOAL_NODE)) {
            sbhl_node_marked_as_goal_node(node);
          } else if (pcase_var.eql($sym35$SBHL_GATHER_FIRST_NON_NIL_RESULT)) {
            sbhl_gather_first_non_nil_result(node);
          } else if (pcase_var.eql($sym36$SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE)) {
            sbhl_gather_first_non_nil_result_with_prune(node);
          } else if (pcase_var.eql($sym37$SBHL_APPLY_COMPOSE_FN)) {
            sbhl_apply_compose_fn(node);
          } else if (pcase_var.eql($sym38$SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2326");
          } else if (pcase_var.eql($sym39$SBHL_GATHER_DEAD_END_NODES)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1565");
          } else if (pcase_var.eql($sym40$SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2332");
          } else {
            Functions.funcall(fn, node);
          }
        }
      }
    }
    return NIL;
  }

  /** Modifier: applies FN to NODE. Used at each step of some unmarking searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 23762) 
  public static final SubLObject apply_sbhl_consider_unmarked_node_fn(SubLObject fn, SubLObject node) {
    {
      SubLObject add_unmarked_node_test = sbhl_search_vars.get_sbhl_search_add_unmarked_node_test();
      SubLObject apply_fnP = T;
      if ((NIL != add_unmarked_node_test)) {
        apply_fnP = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2316");
      }
      if ((NIL != apply_fnP)) {
        {
          SubLObject pcase_var = fn;
          if (pcase_var.eql($sym31$SBHL_PUSH_ONTO_RESULT)) {
            sbhl_push_onto_result(node);
          } else {
            Functions.funcall(fn, node);
          }
        }
      }
    }
    return NIL;
  }

  /** Modifier. Called during search on each NODE. Determines behavior with @see *sbhl-consider-node-fn* */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 24285) 
  public static final SubLObject sbhl_consider_node(SubLObject node) {
    if ((NIL != sbhl_search_vars.sbhl_unmarking_search_p())) {
      sbhl_consider_unmarked_node(node);
    } else {
      {
        SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
        apply_sbhl_consider_node_fn(consider_node_fn, node);
      }
    }
    return NIL;
  }

  /** Modifier. Called during search to check any NODE, without passing through an add node test */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 24726) 
  public static final SubLObject sbhl_consider_any_node(SubLObject node) {
    {
      SubLObject fn = sbhl_search_vars.get_sbhl_consider_node_fn();
      SubLObject pcase_var = fn;
      if (pcase_var.eql($sym34$SBHL_NODE_MARKED_AS_GOAL_NODE)) {
        sbhl_node_marked_as_goal_node(node);
      } else {
        Functions.funcall(fn, node);
      }
    }
    return NIL;
  }

  public static final class $sbhl_consider_any_node$UnaryFunction extends UnaryFunction {
    public $sbhl_consider_any_node$UnaryFunction() { super(extractFunctionNamed("SBHL-CONSIDER-ANY-NODE")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_consider_any_node(arg1); }
  }

  /** Modifier. Called upon each NODE during unmarking searches which gather node. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 25068) 
  public static final SubLObject sbhl_consider_unmarked_node(SubLObject node) {
    {
      SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
      apply_sbhl_consider_unmarked_node_fn(consider_node_fn, node);
    }
    return NIL;
  }

  /** Modifier. The recursive search workhouse. Stops recurring when NODE's marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes). */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 25421) 
  public static final SubLObject sbhl_mark_and_sweep(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
        sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
        apply_sbhl_mapping_function(node);
        if ((NIL == sbhl_search_vars.sbhl_stop_search_path_p())) {
          {
            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject rest = NIL;
            for (rest = accessible_modules; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                  || (NIL == rest)))); rest = rest.rest()) {
              {
                SubLObject module_var = rest.first();
                {
                  SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                  SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                  try {
                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                    {
                      SubLObject node_15 = function_terms.naut_to_nart(node);
                      if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_15))) {
                        {
                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_15, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                          if ((NIL != d_link)) {
                            {
                              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                              if ((NIL != mt_links)) {
                                {
                                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                  while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                    thread.resetMultipleValues();
                                    {
                                      SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                      SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                        {
                                          SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                          try {
                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                            {
                                              SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                              while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)))))) {
                                                thread.resetMultipleValues();
                                                {
                                                  SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                  SubLObject link_nodes = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                    {
                                                      SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                      try {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                        {
                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9313")) : link_nodes);
                                                          SubLObject rest_19 = NIL;
                                                          for (rest_19 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                                || (NIL == rest_19)))); rest_19 = rest_19.rest()) {
                                                            {
                                                              SubLObject link_node = rest_19.first();
                                                              if (((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue())
                                                                   && (NIL != Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7967")))) {
                                                                Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2320");
                                                              }
                                                              sbhl_mark_and_sweep(link_node);
                                                              if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                                                sbhl_apply_unwind_function(list(node, link_node));
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                      }
                                                    }
                                                  }
                                                  iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                            }
                                          } finally {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_16, thread);
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
                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        }
                      } else if ((NIL != obsolete.cnat_p(node_15, UNPROVIDED))) {
                        {
                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9314")) : Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2703"));
                          SubLObject rest_20 = NIL;
                          for (rest_20 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                || (NIL == rest_20)))); rest_20 = rest_20.rest()) {
                            {
                              SubLObject generating_fn = rest_20.first();
                              {
                                SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                try {
                                  sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                  {
                                    SubLObject link_nodes = Functions.funcall(generating_fn, node_15);
                                    SubLObject new_list_22 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9315")) : link_nodes);
                                    SubLObject rest_23 = NIL;
                                    for (rest_23 = new_list_22; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                          || (NIL == rest_23)))); rest_23 = rest_23.rest()) {
                                      {
                                        SubLObject link_node = rest_23.first();
                                        if (((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue())
                                             && (NIL != Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7968")))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2321");
                                        }
                                        sbhl_mark_and_sweep(link_node);
                                        if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                          sbhl_apply_unwind_function(list(node, link_node));
                                        }
                                      }
                                    }
                                  }
                                } finally {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_21, thread);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                  }
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier. The recursive search workhouse, for searches on marked nodes. Stops recurring when NODE's marking does not indicate path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes). */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 26642) 
  public static final SubLObject sbhl_unmark_and_sweep(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
        sbhl_marking_utilities.sbhl_mark_node_unmarked(node, UNPROVIDED);
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
            apply_sbhl_mapping_function(node);
          } finally {
            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL == sbhl_search_vars.sbhl_stop_search_path_p())) {
          {
            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject rest = NIL;
            for (rest = accessible_modules; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                  || (NIL == rest)))); rest = rest.rest()) {
              {
                SubLObject module_var = rest.first();
                {
                  SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                  SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                  try {
                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                    {
                      SubLObject node_24 = function_terms.naut_to_nart(node);
                      if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_24))) {
                        {
                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_24, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                          if ((NIL != d_link)) {
                            {
                              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                              if ((NIL != mt_links)) {
                                {
                                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                  while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                    thread.resetMultipleValues();
                                    {
                                      SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                      SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                        {
                                          SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                          try {
                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                            {
                                              SubLObject iteration_state_26 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                              while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_26)))))) {
                                                thread.resetMultipleValues();
                                                {
                                                  SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_26);
                                                  SubLObject link_nodes = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                    {
                                                      SubLObject _prev_bind_0_27 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                      try {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                        {
                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9316")) : link_nodes);
                                                          SubLObject rest_28 = NIL;
                                                          for (rest_28 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                                || (NIL == rest_28)))); rest_28 = rest_28.rest()) {
                                                            {
                                                              SubLObject link_node = rest_28.first();
                                                              if (((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue())
                                                                   && (NIL != Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7969")))) {
                                                                Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2322");
                                                              }
                                                              {
                                                                SubLObject _prev_bind_0_29 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                try {
                                                                  sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                  sbhl_unmark_and_sweep(link_node);
                                                                } finally {
                                                                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_29, thread);
                                                                }
                                                              }
                                                              if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                                                sbhl_apply_unwind_function(list(node, link_node));
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_27, thread);
                                                      }
                                                    }
                                                  }
                                                  iteration_state_26 = dictionary_contents.do_dictionary_contents_next(iteration_state_26);
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state_26);
                                            }
                                          } finally {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_25, thread);
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
                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        }
                      } else if ((NIL != obsolete.cnat_p(node_24, UNPROVIDED))) {
                        {
                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9317")) : Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2705"));
                          SubLObject rest_30 = NIL;
                          for (rest_30 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                || (NIL == rest_30)))); rest_30 = rest_30.rest()) {
                            {
                              SubLObject generating_fn = rest_30.first();
                              {
                                SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                try {
                                  sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                  {
                                    SubLObject link_nodes = Functions.funcall(generating_fn, node_24);
                                    SubLObject new_list_32 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9318")) : link_nodes);
                                    SubLObject rest_33 = NIL;
                                    for (rest_33 = new_list_32; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                          || (NIL == rest_33)))); rest_33 = rest_33.rest()) {
                                      {
                                        SubLObject link_node = rest_33.first();
                                        if (((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue())
                                             && (NIL != Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7970")))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2323");
                                        }
                                        {
                                          SubLObject _prev_bind_0_34 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          try {
                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                            sbhl_unmark_and_sweep(link_node);
                                          } finally {
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_34, thread);
                                          }
                                        }
                                        if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                          sbhl_apply_unwind_function(list(node, link_node));
                                        }
                                      }
                                    }
                                  }
                                } finally {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_31, thread);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                  }
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Mofifier: Steps over NODE's accessible links, ignoring NODE's marking if SUSPEND-TEST-P is true. Does not mark node. Applies sbhl-mapping-function. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 29319) 
  public static final SubLObject sbhl_step_and_suspend_mark(SubLObject node, SubLObject suspend_test_p) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject terminate_p = NIL;
        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest = NIL;
        for (rest = accessible_modules; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject module_var = rest.first();
            {
              SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
              SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
              try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                {
                  SubLObject node_44 = function_terms.naut_to_nart(node);
                  if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_44))) {
                    {
                      SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_44, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                      if ((NIL != d_link)) {
                        {
                          SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                          if ((NIL != mt_links)) {
                            {
                              SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                              while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                thread.resetMultipleValues();
                                {
                                  SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                  SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                    {
                                      SubLObject _prev_bind_0_45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                      try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        {
                                          SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                          while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)))))) {
                                            thread.resetMultipleValues();
                                            {
                                              SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
                                              SubLObject link_nodes = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                {
                                                  SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                  try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    {
                                                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9319")) : link_nodes);
                                                      SubLObject rest_48 = NIL;
                                                      for (rest_48 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                            || (NIL == rest_48)))); rest_48 = rest_48.rest()) {
                                                        {
                                                          SubLObject link_node = rest_48.first();
                                                          if ((NIL != suspend_test_p)) {
                                                            terminate_p = NIL;
                                                          } else {
                                                            terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED);
                                                          }
                                                          if ((NIL == terminate_p)) {
                                                            apply_sbhl_mapping_function(link_node);
                                                          }
                                                          if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                                            sbhl_apply_unwind_function(list(node, link_node));
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_47, thread);
                                                  }
                                                }
                                              }
                                              iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
                                        }
                                      } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_45, thread);
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
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      }
                    }
                  } else if ((NIL != obsolete.cnat_p(node_44, UNPROVIDED))) {
                    {
                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9320")) : Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2707"));
                      SubLObject rest_49 = NIL;
                      for (rest_49 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                            || (NIL == rest_49)))); rest_49 = rest_49.rest()) {
                        {
                          SubLObject generating_fn = rest_49.first();
                          {
                            SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                              sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                              {
                                SubLObject link_nodes = Functions.funcall(generating_fn, node_44);
                                SubLObject new_list_51 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9321")) : link_nodes);
                                SubLObject rest_52 = NIL;
                                for (rest_52 = new_list_51; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                      || (NIL == rest_52)))); rest_52 = rest_52.rest()) {
                                  {
                                    SubLObject link_node = rest_52.first();
                                    if ((NIL != suspend_test_p)) {
                                      terminate_p = NIL;
                                    } else {
                                      terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED);
                                    }
                                    if ((NIL == terminate_p)) {
                                      apply_sbhl_mapping_function(link_node);
                                    }
                                    if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                      sbhl_apply_unwind_function(list(node, link_node));
                                    }
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_50, thread);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier: Steps over NODE's accessible unmarked links, testing their markings and subsequently marking them. Applies sbhl-mapping-function. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 30543) 
  public static final SubLObject sbhl_step_and_mark(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest = NIL;
        for (rest = accessible_modules; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject module_var = rest.first();
            {
              SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
              SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
              try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                {
                  SubLObject node_62 = function_terms.naut_to_nart(node);
                  if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_62))) {
                    {
                      SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_62, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                      if ((NIL != d_link)) {
                        {
                          SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                          if ((NIL != mt_links)) {
                            {
                              SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                              while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                thread.resetMultipleValues();
                                {
                                  SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                  SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                    {
                                      SubLObject _prev_bind_0_63 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                      try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        {
                                          SubLObject iteration_state_64 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                          while ((!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_64)))))) {
                                            thread.resetMultipleValues();
                                            {
                                              SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_64);
                                              SubLObject link_nodes = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                {
                                                  SubLObject _prev_bind_0_65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                  try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    {
                                                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9322")) : link_nodes);
                                                      SubLObject rest_66 = NIL;
                                                      for (rest_66 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                            || (NIL == rest_66)))); rest_66 = rest_66.rest()) {
                                                        {
                                                          SubLObject link_node = rest_66.first();
                                                          if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED))) {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(link_node, UNPROVIDED);
                                                            apply_sbhl_mapping_function(link_node);
                                                          }
                                                          if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                                            sbhl_apply_unwind_function(list(node, link_node));
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_65, thread);
                                                  }
                                                }
                                              }
                                              iteration_state_64 = dictionary_contents.do_dictionary_contents_next(iteration_state_64);
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize(iteration_state_64);
                                        }
                                      } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_63, thread);
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
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      }
                    }
                    if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node_62, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                      if ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))) {
                        {
                          SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node_62);
                          SubLObject instance_tuple = NIL;
                          for (instance_tuple = csome_list_var.first(); (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), instance_tuple = csome_list_var.first()) {
                            {
                              SubLObject datum = instance_tuple;
                              SubLObject current = datum;
                              SubLObject link_node = NIL;
                              SubLObject mt = NIL;
                              SubLObject tv = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
                              link_node = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
                              mt = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
                              tv = current.first();
                              current = current.rest();
                              if ((NIL == current)) {
                                if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                  {
                                    SubLObject _prev_bind_0_67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                      if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                        {
                                          SubLObject _prev_bind_0_68 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                          try {
                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                            {
                                              SubLObject link_nodes = list(link_node);
                                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9323")) : link_nodes);
                                              SubLObject rest_69 = NIL;
                                              for (rest_69 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                                    || (NIL == rest_69)))); rest_69 = rest_69.rest()) {
                                                {
                                                  SubLObject link_node_70 = rest_69.first();
                                                  if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node_70, UNPROVIDED))) {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(link_node_70, UNPROVIDED);
                                                    apply_sbhl_mapping_function(link_node_70);
                                                  }
                                                  if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                                    sbhl_apply_unwind_function(list(node, link_node_70));
                                                  }
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_68, thread);
                                          }
                                        }
                                      }
                                    } finally {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_67, thread);
                                    }
                                  }
                                }
                              } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
                              }
                            }
                          }
                        }
                      }
                    }
                  } else if ((NIL != obsolete.cnat_p(node_62, UNPROVIDED))) {
                    {
                      SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9324")) : Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2709"));
                      SubLObject rest_71 = NIL;
                      for (rest_71 = new_list; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                            || (NIL == rest_71)))); rest_71 = rest_71.rest()) {
                        {
                          SubLObject generating_fn = rest_71.first();
                          {
                            SubLObject _prev_bind_0_72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                              sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                              {
                                SubLObject link_nodes = Functions.funcall(generating_fn, node_62);
                                SubLObject new_list_73 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9325")) : link_nodes);
                                SubLObject rest_74 = NIL;
                                for (rest_74 = new_list_73; (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                      || (NIL == rest_74)))); rest_74 = rest_74.rest()) {
                                  {
                                    SubLObject link_node = rest_74.first();
                                    if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED))) {
                                      sbhl_marking_utilities.sbhl_mark_node_marked(link_node, UNPROVIDED);
                                      apply_sbhl_mapping_function(link_node);
                                    }
                                    if ((NIL != sbhl_search_vars.sbhl_apply_unwind_function_p())) {
                                      sbhl_apply_unwind_function(list(node, link_node));
                                    }
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_72, thread);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 31675) 
  public static final SubLObject sbhl_sweep(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
    if ((unmarkingP == UNPROVIDED)) {
      unmarkingP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      if ((NIL != unmarkingP)) {
        sbhl_unmark_sweep(module, link_direction, tv, space, map_fn, node);
      } else {
        {
          SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
          try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
            if ((NIL != sbhl_module_utilities.sbhl_time_search_p())) {
            } else {
              sbhl_mark_and_sweep(node);
            }
          } finally {
            sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 32537) 
  public static final SubLObject sbhl_unmark_sweep(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
        SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
        try {
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
          sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
          sbhl_marking_vars.$sbhl_space$.bind(space, thread);
          sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
          sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
          sbhl_search_vars.set_sbhl_search_parent_marking(sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
          sbhl_unmark_and_sweep(node);
        } finally {
          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_5, thread);
          sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 33788) 
  public static final SubLObject sbhl_step(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject suspend_marking_p, SubLObject suspend_test_p) {
    if ((suspend_marking_p == UNPROVIDED)) {
      suspend_marking_p = NIL;
    }
    if ((suspend_test_p == UNPROVIDED)) {
      suspend_test_p = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
        try {
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
          sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
          sbhl_marking_vars.$sbhl_space$.bind(space, thread);
          sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
          if ((NIL != suspend_marking_p)) {
            sbhl_step_and_suspend_mark(node, suspend_test_p);
          } else {
            sbhl_step_and_mark(node);
          }
        } finally {
          sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 34438) 
  public static final SubLObject sbhl_step_through(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node) {
    checkType(module, $sym0$SBHL_MODULE_P);
    sbhl_step(module, link_direction, tv, space, map_fn, node, T, T);
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 34659) 
  public static final SubLObject sbhl_step_and_test(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
    if ((unmarkingP == UNPROVIDED)) {
      unmarkingP = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    if ((NIL != unmarkingP)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2347");
    } else {
      sbhl_step(module, link_direction, tv, space, map_fn, node, T, NIL);
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 35004) 
  public static final SubLObject sbhl_step_and_perform_marking(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
    if ((unmarkingP == UNPROVIDED)) {
      unmarkingP = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    if ((NIL != unmarkingP)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2348");
    } else {
      sbhl_step(module, link_direction, tv, space, map_fn, node, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** @Hack removes funcalls. Applies BEHAVIOR to NODE */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 36071) 
  public static final SubLObject apply_sbhl_search_behavior(SubLObject behavior, SubLObject node) {
    {
      SubLObject pcase_var = behavior;
      if (pcase_var.eql($sym1$SBHL_SIMPLE_TRUE_SEARCH)) {
        sbhl_simple_true_search(node);
      } else if (pcase_var.eql($sym2$SBHL_SIMPLE_FALSE_SEARCH)) {
        sbhl_simple_false_search(node);
      } else if (pcase_var.eql($sym3$SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
        sbhl_step_and_sweep_with_tt_module(node);
      } else if (pcase_var.eql($sym4$SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
        sbhl_sweep_with_tt_module_carry_step(node);
      } else if (pcase_var.eql($sym5$SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
        sbhl_sweep_step_disjoins_and_sweep_again(node);
      } else if (pcase_var.eql($sym43$SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2343");
      } else if (pcase_var.eql($sym44$SBHL_LEAF_INSTANCES_SWEEP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2333");
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str45$attempt_to_call_unsupported_sbhl_, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** @Hack removes funcalls. Applies sbhl-map-function to NODE. @see get-sbhl-map-function. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 36984) 
  public static final SubLObject apply_sbhl_mapping_function(SubLObject node) {
    {
      SubLObject map_fn = sbhl_search_vars.get_sbhl_map_function();
      SubLObject pcase_var = map_fn;
      if (pcase_var.eql($sym46$SBHL_CONSIDER_NODE)) {
        sbhl_consider_node(node);
      } else if (pcase_var.eql($sym47$SBHL_CONSIDER_UNMARKED_NODE)) {
        sbhl_consider_unmarked_node(node);
      } else if (pcase_var.eql($sym48$SBHL_SWEEP_WITH_CARRYING_MODULE)) {
        sbhl_sweep_with_carrying_module(node);
      } else if (pcase_var.eql($sym49$SBHL_STEP_WITH_CARRIED_MODULE)) {
        sbhl_step_with_carried_module(node);
      } else if (pcase_var.eql($sym50$SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED)) {
        sbhl_step_disjoins_and_sweep_inherited(node);
      } else if (pcase_var.eql($sym51$SBHL_SWEEP_INHERITED_DISJOINS)) {
        sbhl_sweep_inherited_disjoins(node);
      } else if (pcase_var.eql($sym52$SBHL_STEP_AND_CHECK_MARKINGS)) {
        sbhl_step_and_check_markings(node);
      } else if (pcase_var.eql($sym53$SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE)) {
        sbhl_step_false_and_sweep_opposite(node);
      } else if (pcase_var.eql($sym54$SBHL_SWEEP_OPPOSITE_FOR_FALSE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2346");
      } else if (pcase_var.eql($sym55$SBHL_CHECK_CUTOFF)) {
        sbhl_check_cutoff(node);
      } else {
        Functions.funcall(map_fn, node);
      }
    }
    return NIL;
  }

  /** @hack. removes funcalls. applies the *sbhl-unwind-function* to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 38056) 
  public static final SubLObject sbhl_apply_unwind_function(SubLObject node) {
    {
      SubLObject unwind_fn = sbhl_search_vars.get_sbhl_unwind_function();
      SubLObject pcase_var = unwind_fn;
      if (pcase_var.eql($sym21$SBHL_PUSH_UNWIND_ONTO_RESULT)) {
        sbhl_push_unwind_onto_result(node);
      } else {
        Functions.funcall(unwind_fn, node);
      }
    }
    return NIL;
  }

  /** Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 38397) 
  public static final SubLObject sbhl_simple_true_search(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 39192) 
  public static final SubLObject sbhl_simple_false_search(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym53$SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 39823) 
  public static final SubLObject sbhl_step_false_and_sweep_opposite(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym54$SBHL_SWEEP_OPPOSITE_FOR_FALSE, node, UNPROVIDED);
      return NIL;
    }
  }

  /** Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 40964) 
  public static final SubLObject sbhl_step_and_sweep_with_tt_module(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym48$SBHL_SWEEP_WITH_CARRYING_MODULE, node, UNPROVIDED);
      return NIL;
    }
  }

  /** Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 41534) 
  public static final SubLObject sbhl_sweep_with_carrying_module(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_link_vars.get_sbhl_link_direction()) : sbhl_link_vars.get_sbhl_opposite_link_direction()), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 42212) 
  public static final SubLObject sbhl_sweep_with_tt_module_carry_step(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_link_vars.get_sbhl_link_direction()) : sbhl_link_vars.get_sbhl_opposite_link_direction()), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym49$SBHL_STEP_WITH_CARRIED_MODULE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 42955) 
  public static final SubLObject sbhl_step_with_carried_module(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_search_vars.sbhl_leaf_sample_search_p())) {
        queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
      }
      sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_search_vars.sbhl_search_true_tv()) : sbhl_search_vars.sbhl_search_false_tv()), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 43731) 
  public static final SubLObject sbhl_sweep_step_disjoins_and_sweep_again(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != sbhl_search_vars.sbhl_true_search_p())
           && (NIL != sbhl_search_vars.sbhl_boolean_search_p())
           && ((NIL != sbhl_empty_extent_p(node))
            || (NIL != sbhl_goal_empty_extent_p())))) {
        if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
          if ((NIL != sbhl_goal_empty_extent_p())) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2341");
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2342");
          }
        } else {
          sbhl_search_vars.$sbhl_result$.setDynamicValue(T, thread);
        }
      } else {
        {
          SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
          sbhl_sweep(tt_module, ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module)) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) ((NIL != sbhl_search_vars.sbhl_boolean_search_p()) ? ((SubLObject) $sym52$SBHL_STEP_AND_CHECK_MARKINGS) : $sym50$SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED)) : $sym56$SBHL_SWEEP_FORWARD_STEP_FALSE_DISJOINS_AND_SWEEP_FORWARD_NOTS), node, sbhl_search_vars.sbhl_unmarking_search_p());
        }
      }
      return NIL;
    }
  }

  /** Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 45372) 
  public static final SubLObject sbhl_step_disjoins_and_sweep_inherited(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym51$SBHL_SWEEP_INHERITED_DISJOINS, node, UNPROVIDED);
      return NIL;
    }
  }

  /** Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 45934) 
  public static final SubLObject sbhl_sweep_inherited_disjoins(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module)) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
      }
    }
  }

  /** Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 46716) 
  public static final SubLObject sbhl_step_and_check_markings(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_step_through(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym57$SBHL_CONSIDER_ANY_NODE, node);
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 47265) 
  public static final SubLObject sbhl_node_locally_disjoint_with_self_p(SubLObject node) {
    {
      SubLObject links = sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject result = NIL;
      result = subl_promotions.memberP(node, links, UNPROVIDED, UNPROVIDED);
      return result;
    }
  }

  public static final class $sbhl_node_locally_disjoint_with_self_p$UnaryFunction extends UnaryFunction {
    public $sbhl_node_locally_disjoint_with_self_p$UnaryFunction() { super(extractFunctionNamed("SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_node_locally_disjoint_with_self_p(arg1); }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 47520) 
  public static final SubLObject sbhl_empty_extent_p(SubLObject node) {
    return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, $sym58$SBHL_NODE_LOCALLY_DISJOINT_WITH_SELF_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 47749) 
  public static final SubLObject sbhl_goal_empty_extent_p() {
    {
      SubLObject goal = sbhl_search_vars.get_sbhl_goal_node();
      SubLObject goals = sbhl_search_vars.get_sbhl_goal_nodes();
      SubLObject doneP = NIL;
      if ((NIL != goal)) {
        return sbhl_empty_extent_p(goal);
      } else if ((NIL != goals)) {
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = goals;
            SubLObject node = NIL;
            for (node = csome_list_var.first(); (!(((NIL != doneP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), node = csome_list_var.first()) {
              if ((NIL != sbhl_empty_extent_p(node))) {
                doneP = T;
              }
            }
          }
        }
        return doneP;
      } else {
        return NIL;
      }
    }
  }

  /** Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 48083) 
  public static final SubLObject sbhl_sweep_forward_step_false_disjoins_and_sweep_forward_nots(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if ((!(((NIL != sbhl_empty_extent_p(node))
              || (NIL == sbhl_module_vars.$assume_sbhl_extensions_nonempty$.getDynamicValue(thread)))))) {
          sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, UNPROVIDED);
        }
      }
      sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym59$SBHL_SWEEP_FORWARD_NOTS, node, UNPROVIDED);
      return NIL;
    }
  }

  /** Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 49290) 
  public static final SubLObject sbhl_sweep_and_gather_disjoins(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module)) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym60$SBHL_STEP_GATHER_DISJOINS, node, UNPROVIDED);
      }
      return NIL;
    }
  }

  /** Steps and marks asserted disjoins of NODE. Used to gather extremal disjoins. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 49894) 
  public static final SubLObject sbhl_step_gather_disjoins(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_search_vars.sbhl_search_true_tv()) : sbhl_search_vars.sbhl_search_false_tv()), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym46$SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  public static final class $sbhl_step_gather_disjoins$UnaryFunction extends UnaryFunction {
    public $sbhl_step_gather_disjoins$UnaryFunction() { super(extractFunctionNamed("SBHL-STEP-GATHER-DISJOINS")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_step_gather_disjoins(arg1); }
  }

  /** Used for implied false relations, which need to check the disjoins of all of the backward closure of NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 55292) 
  public static final SubLObject sbhl_check_disjoins_of_all_backward_nodes(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym80$SBHL_TARGET_SWEEP_STEP_DISJOINS_AND_CHECK, node, UNPROVIDED);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-utilities.lisp", position = 55826) 
  public static final SubLObject sbhl_target_sweep_step_disjoins_and_check(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
          sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
          {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym52$SBHL_STEP_AND_CHECK_MARKINGS, node, UNPROVIDED);
          }
        } finally {
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_sbhl_search_utilities_file() {
    declareFunction(myName, "determine_sbhl_search_behavior", "DETERMINE-SBHL-SEARCH-BEHAVIOR", 3, 0, false);
    declareFunction(myName, "determine_sbhl_terminating_marking_space", "DETERMINE-SBHL-TERMINATING-MARKING-SPACE", 1, 0, false);
    declareFunction(myName, "sbhl_module_premarks_gather_nodes_p", "SBHL-MODULE-PREMARKS-GATHER-NODES-P", 0, 0, false);
    declareFunction(myName, "sbhl_just_gaf", "SBHL-JUST-GAF", 1, 0, false);
    declareFunction(myName, "sbhl_just_mt", "SBHL-JUST-MT", 1, 0, false);
    declareFunction(myName, "sbhl_possibly_just_mt", "SBHL-POSSIBLY-JUST-MT", 1, 1, false);
    declareFunction(myName, "sbhl_just_tv", "SBHL-JUST-TV", 1, 0, false);
    declareFunction(myName, "sbhl_gaf_pred", "SBHL-GAF-PRED", 1, 0, false);
    //declareFunction(myName, "hl_default_tv", "HL-DEFAULT-TV", 1, 0, false);
    //declareFunction(myName, "sbhl_find_first_matching_gaf", "SBHL-FIND-FIRST-MATCHING-GAF", 1, 0, false);
    declareFunction(myName, "sbhl_find_gaf", "SBHL-FIND-GAF", 3, 0, false);
    declareFunction(myName, "sbhl_assemble_justification_step", "SBHL-ASSEMBLE-JUSTIFICATION-STEP", 1, 1, false);
    declareFunction(myName, "sbhl_assemble_justification", "SBHL-ASSEMBLE-JUSTIFICATION", 1, 1, false);
    declareFunction(myName, "sbhl_handle_justification", "SBHL-HANDLE-JUSTIFICATION", 4, 4, false);
    declareFunction(myName, "sbhl_module_transitivity_support", "SBHL-MODULE-TRANSITIVITY-SUPPORT", 1, 1, false);
    //declareFunction(myName, "sbhl_set_empty_extent_justification", "SBHL-SET-EMPTY-EXTENT-JUSTIFICATION", 1, 0, false);
    //declareFunction(myName, "sbhl_temporal_faux_link", "SBHL-TEMPORAL-FAUX-LINK", 2, 0, false);
    //declareFunction(myName, "any_support_chain_of_temporal_link", "ANY-SUPPORT-CHAIN-OF-TEMPORAL-LINK", 1, 0, false);
    //declareFunction(myName, "any_support_chain_of_link_disjunction_consequent", "ANY-SUPPORT-CHAIN-OF-LINK-DISJUNCTION-CONSEQUENT", 2, 0, false);
    declareFunction(myName, "apply_sbhl_add_node_test", "APPLY-SBHL-ADD-NODE-TEST", 2, 0, false);
    //declareFunction(myName, "apply_sbhl_add_unmarked_node_test", "APPLY-SBHL-ADD-UNMARKED-NODE-TEST", 1, 0, false);
    declareFunction(myName, "sbhl_push_onto_result", "SBHL-PUSH-ONTO-RESULT", 1, 0, false);
    declareFunction(myName, "sbhl_push_onto_result_if", "SBHL-PUSH-ONTO-RESULT-IF", 1, 0, false); new $sbhl_push_onto_result_if$UnaryFunction();
    //declareFunction(myName, "sbhl_push_onto_result_if_and_stop_unless", "SBHL-PUSH-ONTO-RESULT-IF-AND-STOP-UNLESS", 1, 0, false);
    //declareFunction(myName, "sbhl_push_onto_result_with_prune", "SBHL-PUSH-ONTO-RESULT-WITH-PRUNE", 1, 0, false);
    declareFunction(myName, "sbhl_push_unwind_onto_result", "SBHL-PUSH-UNWIND-ONTO-RESULT", 1, 0, false);
    declareFunction(myName, "sbhl_apply_compose_fn", "SBHL-APPLY-COMPOSE-FN", 1, 0, false);
    //declareFunction(myName, "sbhl_apply_compose_fn_if", "SBHL-APPLY-COMPOSE-FN-IF", 1, 0, false);
    //declareFunction(myName, "sbhl_apply_compose_fn_and_combine_with_result", "SBHL-APPLY-COMPOSE-FN-AND-COMBINE-WITH-RESULT", 1, 0, false);
    declareFunction(myName, "sbhl_gather_first_non_nil_result", "SBHL-GATHER-FIRST-NON-NIL-RESULT", 1, 0, false);
    declareFunction(myName, "sbhl_gather_first_non_nil_result_with_prune", "SBHL-GATHER-FIRST-NON-NIL-RESULT-WITH-PRUNE", 1, 0, false);
    //declareFunction(myName, "sbhl_gather_first_dead_end_node_and_enqueue_others", "SBHL-GATHER-FIRST-DEAD-END-NODE-AND-ENQUEUE-OTHERS", 1, 0, false);
    //declareFunction(myName, "sbhl_gather_first_node", "SBHL-GATHER-FIRST-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_gather_first_target_unmarked_node", "SBHL-GATHER-FIRST-TARGET-UNMARKED-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_search_has_multiple_goals_p", "SBHL-SEARCH-HAS-MULTIPLE-GOALS-P", 0, 0, false);
    declareFunction(myName, "set_sbhl_boolean_goal_conditions", "SET-SBHL-BOOLEAN-GOAL-CONDITIONS", 0, 0, false);
    declareFunction(myName, "sbhl_node_marked_as_goal_node", "SBHL-NODE-MARKED-AS-GOAL-NODE", 1, 0, false);
    declareFunction(myName, "sbhl_node_is_goal_node", "SBHL-NODE-IS-GOAL-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_node_is_a_goal_node", "SBHL-NODE-IS-A-GOAL-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_reached_cutoff_p", "SBHL-REACHED-CUTOFF-P", 0, 0, false);
    declareFunction(myName, "sbhl_check_cutoff", "SBHL-CHECK-CUTOFF", 1, 0, false); new $sbhl_check_cutoff$UnaryFunction();
    declareFunction(myName, "apply_sbhl_consider_node_fn", "APPLY-SBHL-CONSIDER-NODE-FN", 2, 0, false);
    declareFunction(myName, "apply_sbhl_consider_unmarked_node_fn", "APPLY-SBHL-CONSIDER-UNMARKED-NODE-FN", 2, 0, false);
    declareFunction(myName, "sbhl_consider_node", "SBHL-CONSIDER-NODE", 1, 0, false);
    declareFunction(myName, "sbhl_consider_any_node", "SBHL-CONSIDER-ANY-NODE", 1, 0, false); new $sbhl_consider_any_node$UnaryFunction();
    declareFunction(myName, "sbhl_consider_unmarked_node", "SBHL-CONSIDER-UNMARKED-NODE", 1, 0, false);
    declareFunction(myName, "sbhl_mark_and_sweep", "SBHL-MARK-AND-SWEEP", 1, 0, false);
    declareFunction(myName, "sbhl_unmark_and_sweep", "SBHL-UNMARK-AND-SWEEP", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_sweep_and_unwind", "SBHL-MARK-SWEEP-AND-UNWIND", 1, 0, false);
    declareFunction(myName, "sbhl_step_and_suspend_mark", "SBHL-STEP-AND-SUSPEND-MARK", 2, 0, false);
    //declareFunction(myName, "sbhl_step_and_suspend_unmark", "SBHL-STEP-AND-SUSPEND-UNMARK", 1, 0, false);
    declareFunction(myName, "sbhl_step_and_mark", "SBHL-STEP-AND-MARK", 1, 0, false);
    //declareFunction(myName, "sbhl_step_and_unmark", "SBHL-STEP-AND-UNMARK", 1, 0, false);
    declareFunction(myName, "sbhl_sweep", "SBHL-SWEEP", 6, 1, false);
    declareFunction(myName, "sbhl_unmark_sweep", "SBHL-UNMARK-SWEEP", 6, 0, false);
    //declareFunction(myName, "sbhl_sweep_and_unwind", "SBHL-SWEEP-AND-UNWIND", 6, 1, false);
    declareFunction(myName, "sbhl_step", "SBHL-STEP", 6, 2, false);
    declareFunction(myName, "sbhl_step_through", "SBHL-STEP-THROUGH", 6, 0, false);
    declareFunction(myName, "sbhl_step_and_test", "SBHL-STEP-AND-TEST", 6, 1, false);
    declareFunction(myName, "sbhl_step_and_perform_marking", "SBHL-STEP-AND-PERFORM-MARKING", 6, 1, false);
    //declareFunction(myName, "sbhl_unmark_step", "SBHL-UNMARK-STEP", 6, 1, false);
    declareFunction(myName, "apply_sbhl_search_behavior", "APPLY-SBHL-SEARCH-BEHAVIOR", 2, 0, false);
    declareFunction(myName, "apply_sbhl_mapping_function", "APPLY-SBHL-MAPPING-FUNCTION", 1, 0, false);
    declareFunction(myName, "sbhl_apply_unwind_function", "SBHL-APPLY-UNWIND-FUNCTION", 1, 0, false);
    declareFunction(myName, "sbhl_simple_true_search", "SBHL-SIMPLE-TRUE-SEARCH", 1, 0, false);
    //declareFunction(myName, "sbhl_simple_true_search_and_unwind", "SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND", 1, 0, false);
    declareFunction(myName, "sbhl_simple_false_search", "SBHL-SIMPLE-FALSE-SEARCH", 1, 0, false);
    declareFunction(myName, "sbhl_step_false_and_sweep_opposite", "SBHL-STEP-FALSE-AND-SWEEP-OPPOSITE", 1, 0, false);
    //declareFunction(myName, "sbhl_sweep_opposite_for_false", "SBHL-SWEEP-OPPOSITE-FOR-FALSE", 1, 0, false);
    declareFunction(myName, "sbhl_step_and_sweep_with_tt_module", "SBHL-STEP-AND-SWEEP-WITH-TT-MODULE", 1, 0, false);
    declareFunction(myName, "sbhl_sweep_with_carrying_module", "SBHL-SWEEP-WITH-CARRYING-MODULE", 1, 0, false);
    declareFunction(myName, "sbhl_sweep_with_tt_module_carry_step", "SBHL-SWEEP-WITH-TT-MODULE-CARRY-STEP", 1, 0, false);
    declareFunction(myName, "sbhl_step_with_carried_module", "SBHL-STEP-WITH-CARRIED-MODULE", 1, 0, false);
    declareFunction(myName, "sbhl_sweep_step_disjoins_and_sweep_again", "SBHL-SWEEP-STEP-DISJOINS-AND-SWEEP-AGAIN", 1, 0, false);
    declareFunction(myName, "sbhl_step_disjoins_and_sweep_inherited", "SBHL-STEP-DISJOINS-AND-SWEEP-INHERITED", 1, 0, false);
    declareFunction(myName, "sbhl_sweep_inherited_disjoins", "SBHL-SWEEP-INHERITED-DISJOINS", 1, 0, false);
    declareFunction(myName, "sbhl_step_and_check_markings", "SBHL-STEP-AND-CHECK-MARKINGS", 1, 0, false);
    declareFunction(myName, "sbhl_node_locally_disjoint_with_self_p", "SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P", 1, 0, false); new $sbhl_node_locally_disjoint_with_self_p$UnaryFunction();
    declareFunction(myName, "sbhl_empty_extent_p", "SBHL-EMPTY-EXTENT-P", 1, 0, false);
    declareFunction(myName, "sbhl_goal_empty_extent_p", "SBHL-GOAL-EMPTY-EXTENT-P", 0, 0, false);
    declareFunction(myName, "sbhl_sweep_forward_step_false_disjoins_and_sweep_forward_nots", "SBHL-SWEEP-FORWARD-STEP-FALSE-DISJOINS-AND-SWEEP-FORWARD-NOTS", 1, 0, false);
    //declareFunction(myName, "sbhl_sweep_forward_nots", "SBHL-SWEEP-FORWARD-NOTS", 1, 0, false);
    declareFunction(myName, "sbhl_sweep_and_gather_disjoins", "SBHL-SWEEP-AND-GATHER-DISJOINS", 1, 0, false);
    declareFunction(myName, "sbhl_step_gather_disjoins", "SBHL-STEP-GATHER-DISJOINS", 1, 0, false); new $sbhl_step_gather_disjoins$UnaryFunction();
    //declareFunction(myName, "sbhl_sweep_and_gather_first_disjoin", "SBHL-SWEEP-AND-GATHER-FIRST-DISJOIN", 1, 0, false);
    //declareFunction(myName, "sbhl_step_gather_first_disjoin", "SBHL-STEP-GATHER-FIRST-DISJOIN", 1, 0, false);
    //declareFunction(myName, "determine_sbhl_sample_leaf_consider_fn", "DETERMINE-SBHL-SAMPLE-LEAF-CONSIDER-FN", 0, 1, false);
    //declareFunction(myName, "sbhl_enqueue_node_in_leaf_queue", "SBHL-ENQUEUE-NODE-IN-LEAF-QUEUE", 1, 0, false);
    //declareFunction(myName, "sbhl_leaf_instances_sweep", "SBHL-LEAF-INSTANCES-SWEEP", 1, 0, false);
    //declareFunction(myName, "sbhl_leaf_instances_step", "SBHL-LEAF-INSTANCES-STEP", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_and_sweep_extremal_independent_nodes", "SBHL-MARK-AND-SWEEP-EXTREMAL-INDEPENDENT-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_min_backward_true_nodes_such_that", "SBHL-MIN-BACKWARD-TRUE-NODES-SUCH-THAT", 3, 2, false);
    //declareFunction(myName, "sbhl_extremal_independent_nodes_such_that", "SBHL-EXTREMAL-INDEPENDENT-NODES-SUCH-THAT", 2, 0, false);
    //declareFunction(myName, "sbhl_test_for_previous_extremal_paths", "SBHL-TEST-FOR-PREVIOUS-EXTREMAL-PATHS", 1, 0, false);
    declareFunction(myName, "sbhl_check_disjoins_of_all_backward_nodes", "SBHL-CHECK-DISJOINS-OF-ALL-BACKWARD-NODES", 1, 0, false);
    declareFunction(myName, "sbhl_target_sweep_step_disjoins_and_check", "SBHL-TARGET-SWEEP-STEP-DISJOINS-AND-CHECK", 1, 0, false);
    //declareFunction(myName, "note_kb_access_sbhl_link", "NOTE-KB-ACCESS-SBHL-LINK", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_search_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_utilities_file() {
    // CVS_ID("Id: sbhl-search-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym1$SBHL_SIMPLE_TRUE_SEARCH = makeSymbol("SBHL-SIMPLE-TRUE-SEARCH");
  public static final SubLSymbol $sym2$SBHL_SIMPLE_FALSE_SEARCH = makeSymbol("SBHL-SIMPLE-FALSE-SEARCH");
  public static final SubLSymbol $sym3$SBHL_STEP_AND_SWEEP_WITH_TT_MODULE = makeSymbol("SBHL-STEP-AND-SWEEP-WITH-TT-MODULE");
  public static final SubLSymbol $sym4$SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP = makeSymbol("SBHL-SWEEP-WITH-TT-MODULE-CARRY-STEP");
  public static final SubLSymbol $sym5$SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN = makeSymbol("SBHL-SWEEP-STEP-DISJOINS-AND-SWEEP-AGAIN");
  public static final SubLString $str6$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");
  public static final SubLString $str7$Search_Behavior_not_recognized___ = makeString("Search Behavior not recognized: ~a");
  public static final SubLSymbol $kw8$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw9$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw10$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw11$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLList $list12 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $kw13$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw14$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw15$VERBOSE = makeKeyword("VERBOSE");
  public static final SubLString $str16$incorrect_justification_assembly_ = makeString("incorrect justification assembly ~a");
  public static final SubLSymbol $kw17$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLObject $const18$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLObject $const19$MonotonicallyTrue = constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue"));
  public static final SubLSymbol $sym20$SBHL_TEMPORAL_JUSTIFICATION_UNWIND = makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND");
  public static final SubLSymbol $sym21$SBHL_PUSH_UNWIND_ONTO_RESULT = makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT");
  public static final SubLString $str22$_S_is_not_a_transitive_module = makeString("~S is not a transitive module");
  public static final SubLObject $const23$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLObject $const24$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLSymbol $sym25$NOT_GENL_INVERSE_MODE_P = makeSymbol("NOT-GENL-INVERSE-MODE-P");
  public static final SubLSymbol $sym26$GENL_INVERSE_MODE_P = makeSymbol("GENL-INVERSE-MODE-P");
  public static final SubLSymbol $sym27$NON_EMPTY_EXTENT = makeSymbol("NON-EMPTY-EXTENT");
  public static final SubLString $str28$Using_potentially_unsupported_gat = makeString("Using potentially unsupported gather gating behavior: ~a");
  public static final SubLString $str29$Using_potentially_unsupported_unm = makeString("Using potentially unsupported unmark gather gating behavior: ~a");
  public static final SubLList $list30 = list(makeSymbol("RESULT"), makeSymbol("DONE?"));
  public static final SubLSymbol $sym31$SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");
  public static final SubLSymbol $sym32$SBHL_PUSH_ONTO_RESULT_WITH_PRUNE = makeSymbol("SBHL-PUSH-ONTO-RESULT-WITH-PRUNE");
  public static final SubLSymbol $sym33$SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");
  public static final SubLSymbol $sym34$SBHL_NODE_MARKED_AS_GOAL_NODE = makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");
  public static final SubLSymbol $sym35$SBHL_GATHER_FIRST_NON_NIL_RESULT = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT");
  public static final SubLSymbol $sym36$SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT-WITH-PRUNE");
  public static final SubLSymbol $sym37$SBHL_APPLY_COMPOSE_FN = makeSymbol("SBHL-APPLY-COMPOSE-FN");
  public static final SubLSymbol $sym38$SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT = makeSymbol("SBHL-APPLY-COMPOSE-FN-AND-COMBINE-WITH-RESULT");
  public static final SubLSymbol $sym39$SBHL_GATHER_DEAD_END_NODES = makeSymbol("SBHL-GATHER-DEAD-END-NODES");
  public static final SubLSymbol $sym40$SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS = makeSymbol("SBHL-GATHER-FIRST-DEAD-END-NODE-AND-ENQUEUE-OTHERS");
  public static final SubLString $str41$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list42 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLSymbol $sym43$SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND = makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND");
  public static final SubLSymbol $sym44$SBHL_LEAF_INSTANCES_SWEEP = makeSymbol("SBHL-LEAF-INSTANCES-SWEEP");
  public static final SubLString $str45$attempt_to_call_unsupported_sbhl_ = makeString("attempt to call unsupported sbhl search behavior: ~a~%");
  public static final SubLSymbol $sym46$SBHL_CONSIDER_NODE = makeSymbol("SBHL-CONSIDER-NODE");
  public static final SubLSymbol $sym47$SBHL_CONSIDER_UNMARKED_NODE = makeSymbol("SBHL-CONSIDER-UNMARKED-NODE");
  public static final SubLSymbol $sym48$SBHL_SWEEP_WITH_CARRYING_MODULE = makeSymbol("SBHL-SWEEP-WITH-CARRYING-MODULE");
  public static final SubLSymbol $sym49$SBHL_STEP_WITH_CARRIED_MODULE = makeSymbol("SBHL-STEP-WITH-CARRIED-MODULE");
  public static final SubLSymbol $sym50$SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED = makeSymbol("SBHL-STEP-DISJOINS-AND-SWEEP-INHERITED");
  public static final SubLSymbol $sym51$SBHL_SWEEP_INHERITED_DISJOINS = makeSymbol("SBHL-SWEEP-INHERITED-DISJOINS");
  public static final SubLSymbol $sym52$SBHL_STEP_AND_CHECK_MARKINGS = makeSymbol("SBHL-STEP-AND-CHECK-MARKINGS");
  public static final SubLSymbol $sym53$SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE = makeSymbol("SBHL-STEP-FALSE-AND-SWEEP-OPPOSITE");
  public static final SubLSymbol $sym54$SBHL_SWEEP_OPPOSITE_FOR_FALSE = makeSymbol("SBHL-SWEEP-OPPOSITE-FOR-FALSE");
  public static final SubLSymbol $sym55$SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");
  public static final SubLSymbol $sym56$SBHL_SWEEP_FORWARD_STEP_FALSE_DISJOINS_AND_SWEEP_FORWARD_NOTS = makeSymbol("SBHL-SWEEP-FORWARD-STEP-FALSE-DISJOINS-AND-SWEEP-FORWARD-NOTS");
  public static final SubLSymbol $sym57$SBHL_CONSIDER_ANY_NODE = makeSymbol("SBHL-CONSIDER-ANY-NODE");
  public static final SubLSymbol $sym58$SBHL_NODE_LOCALLY_DISJOINT_WITH_SELF_P = makeSymbol("SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P");
  public static final SubLSymbol $sym59$SBHL_SWEEP_FORWARD_NOTS = makeSymbol("SBHL-SWEEP-FORWARD-NOTS");
  public static final SubLSymbol $sym60$SBHL_STEP_GATHER_DISJOINS = makeSymbol("SBHL-STEP-GATHER-DISJOINS");
  public static final SubLSymbol $sym61$SBHL_STEP_GATHER_FIRST_DISJOIN = makeSymbol("SBHL-STEP-GATHER-FIRST-DISJOIN");
  public static final SubLSymbol $sym62$SBHL_GATHER_FIRST_TARGET_UNMARKED_NODE = makeSymbol("SBHL-GATHER-FIRST-TARGET-UNMARKED-NODE");
  public static final SubLSymbol $sym63$SBHL_GATHER_FIRST_NODE = makeSymbol("SBHL-GATHER-FIRST-NODE");
  public static final SubLString $str64$invalid_module_type__a = makeString("invalid module type ~a");
  public static final SubLSymbol $sym65$SBHL_LEAF_INSTANCES_STEP = makeSymbol("SBHL-LEAF-INSTANCES-STEP");
  public static final SubLSymbol $sym66$SBHL_ENQUEUE_NODE_IN_LEAF_QUEUE = makeSymbol("SBHL-ENQUEUE-NODE-IN-LEAF-QUEUE");
  public static final SubLSymbol $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw68$ERROR = makeKeyword("ERROR");
  public static final SubLString $str69$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym70$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw71$CERROR = makeKeyword("CERROR");
  public static final SubLString $str72$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw73$WARN = makeKeyword("WARN");
  public static final SubLString $str74$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const75$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw76$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym77$SBHL_TEST_FOR_PREVIOUS_EXTREMAL_PATHS = makeSymbol("SBHL-TEST-FOR-PREVIOUS-EXTREMAL-PATHS");
  public static final SubLObject $const78$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const79$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym80$SBHL_TARGET_SWEEP_STEP_DISJOINS_AND_CHECK = makeSymbol("SBHL-TARGET-SWEEP-STEP-DISJOINS-AND-CHECK");
  public static final SubLList $list81 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));
  public static final SubLString $str82$Unexpected_direction____S = makeString("Unexpected direction : ~S");
  public static final SubLSymbol $kw83$INVERSE = makeKeyword("INVERSE");
  public static final SubLString $str84$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S for ~S");
  public static final SubLString $str85$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_utilities_file();
  }

  public void initializeVariables() {
    init_sbhl_search_utilities_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_utilities_file();
  }

}
