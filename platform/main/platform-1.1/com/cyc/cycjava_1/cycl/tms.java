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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.after_adding;
//dm import com.cyc.cycjava_1.cycl.inference.harness.argumentation;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_interface;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hl_modifiers;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.rewrite_of_propagation;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class tms extends SubLTranslatedFile {

  //// Constructor

  private tms() {}
  public static final SubLFile me = new tms();
  public static final String myName = "com.cyc.cycjava_1.cycl.tms";

  //// Definitions

  @SubL(source = "cycl/tms.lisp", position = 718) 
  private static SubLSymbol $tms_assertions_being_removed$ = null;

  /** Return T iff ASSERTION is in the midst of being removed via TMS */
  @SubL(source = "cycl/tms.lisp", position = 823) 
  public static final SubLObject tms_assertion_being_removedP(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym0$ASSERTION_P);
      return subl_promotions.memberP(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 1241) 
  private static SubLSymbol $tms_deductions_being_removed$ = null;

  /** Return T iff DEDUCTION is in the midst of being removed via TMS */
  @SubL(source = "cycl/tms.lisp", position = 1301) 
  public static final SubLObject tms_deduction_being_removedP(SubLObject deduction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(deduction, $sym6$DEDUCTION_P);
      return subl_promotions.memberP(deduction, $tms_deductions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  /** Return T iff ARGUMENT is known to be in the midst of being removed via TMS */
  @SubL(source = "cycl/tms.lisp", position = 1719) 
  public static final SubLObject tms_argument_being_removedP(SubLObject argument) {
    return makeBoolean(((NIL != deduction_handles.deduction_p(argument))
           && (NIL != tms_deduction_being_removedP(argument))));
  }

  /** Assumes that ASSERTION does not have any asserted arguments.
   Creates a new asserted argument for ASSERTION with TV. */
  @SubL(source = "cycl/tms.lisp", position = 2684) 
  public static final SubLObject tms_create_asserted_argument_with_tv(SubLObject assertion, SubLObject tv) {
    {
      SubLObject new_asserted_argument = hl_modifiers.kb_create_asserted_argument_with_tv(assertion, tv);
      if ((NIL != new_asserted_argument)) {
        return tms_postprocess_new_argument(assertion, new_asserted_argument);
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 3077) 
  public static final SubLObject tms_add_new_deduction(SubLObject assertion, SubLObject supports, SubLObject tv) {
    {
      SubLObject deduction = deductions_high.create_deduction_with_tv(assertion, supports, tv);
      tms_postprocess_new_argument(assertion, deduction);
      return deduction;
    }
  }

  /** Now that ARGUMENT for ASSERTION has been added to the KB,
   perform necessary truth maintenance.  ARGUMENT is assumed to be a new argument,
   not a redundant already-existing one. */
  @SubL(source = "cycl/tms.lisp", position = 3288) 
  public static final SubLObject tms_postprocess_new_argument(SubLObject assertion, SubLObject argument) {
    checkType(argument, $sym13$ARGUMENT_P);
    {
      SubLObject successfulP = NIL;
      try {
        tms_recompute_assertion_tv(assertion);
        after_adding.handle_after_addings(argument, assertion);
        successfulP = T;
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            if ((NIL == successfulP)) {
              tms_remove_argument(argument, assertion);
            }
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
    }
    return argument;
  }

  /** Remove ARGUMENT for ASSERTION from the KB and perform necessary truth maintenance.
   Return T if the supported assertion was removed, or it was invalid, else NIL. */
  @SubL(source = "cycl/tms.lisp", position = 3830) 
  public static final SubLObject tms_remove_argument(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument, $sym13$ARGUMENT_P);
      if (((NIL != arguments.valid_argument(argument, UNPROVIDED))
           && (NIL == tms_argument_being_removedP(argument)))) {
        {
          SubLObject assertion_removedP = NIL;
          if ((NIL != deduction_handles.deduction_p(argument))) {
            {
              SubLObject _prev_bind_0 = $tms_deductions_being_removed$.currentBinding(thread);
              try {
                $tms_deductions_being_removed$.bind(conses_high.adjoin(argument, $tms_deductions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                arguments.remove_argument(argument, assertion);
                if ((NIL != assertion_handles.assertion_p(assertion))) {
                  if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
                    assertion_removedP = tms_propagate_removed_argument(argument, assertion);
                  } else {
                    assertion_removedP = T;
                  }
                } else if ((NIL != arguments.hl_support_p(assertion))) {
                  {
                    SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(assertion);
                    if ((NIL != kb_hl_support)) {
                      assertion_removedP = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11075");
                    } else {
                      assertion_removedP = T;
                    }
                  }
                }
              } finally {
                $tms_deductions_being_removed$.rebind(_prev_bind_0, thread);
              }
            }
          } else {
            arguments.remove_argument(argument, assertion);
            if ((NIL != assertion_handles.assertion_p(assertion))) {
              if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
                assertion_removedP = tms_propagate_removed_argument(argument, assertion);
              } else {
                assertion_removedP = T;
              }
            } else if ((NIL != arguments.hl_support_p(assertion))) {
              {
                SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(assertion);
                if ((NIL != kb_hl_support)) {
                  assertion_removedP = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11076");
                } else {
                  assertion_removedP = T;
                }
              }
            }
          }
          return assertion_removedP;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 4778) 
  public static final SubLObject tms_propagate_removed_argument(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertion_removedP = NIL;
        if ((NIL != kb_hl_supports.enqueueing_kb_hl_supports_for_tmsP())) {
          assertion_removedP = tms_recompute_assertion_tv(assertion);
          if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
            try {
              if ((NIL != assertion_removedP)) {
                {
                  SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
                  try {
                    $tms_assertions_being_removed$.bind(conses_high.adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    after_adding.handle_after_removings(argument, assertion);
                  } finally {
                    $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
                  }
                }
              } else {
                after_adding.handle_after_removings(argument, assertion);
              }
            } finally {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  if ((NIL != assertion_removedP)) {
                    if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED))) {
                      if ((NIL != tms_assertion_being_removedP(assertion))) {
                        tms_remove_assertion_int_2(assertion);
                      } else {
                        tms_remove_assertion_int(assertion);
                      }
                    }
                  } else {
                    if (((NIL != control_vars.$check_for_circular_justs$.getDynamicValue(thread))
                         && (NIL == some_belief_justification(assertion, UNPROVIDED)))) {
                      tms_remove_assertion(assertion);
                      assertion_removedP = T;
                    }
                  }
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } else {
          {
            SubLObject _prev_bind_0 = kb_hl_supports.$tms_kb_hl_support_queue$.currentBinding(thread);
            try {
              kb_hl_supports.$tms_kb_hl_support_queue$.bind(queues.create_queue(), thread);
              assertion_removedP = tms_recompute_assertion_tv(assertion);
              if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
                try {
                  if ((NIL != assertion_removedP)) {
                    {
                      SubLObject _prev_bind_0_1 = $tms_assertions_being_removed$.currentBinding(thread);
                      try {
                        $tms_assertions_being_removed$.bind(conses_high.adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                        after_adding.handle_after_removings(argument, assertion);
                      } finally {
                        $tms_assertions_being_removed$.rebind(_prev_bind_0_1, thread);
                      }
                    }
                  } else {
                    after_adding.handle_after_removings(argument, assertion);
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      if ((NIL != assertion_removedP)) {
                        if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED))) {
                          if ((NIL != tms_assertion_being_removedP(assertion))) {
                            tms_remove_assertion_int_2(assertion);
                          } else {
                            tms_remove_assertion_int(assertion);
                          }
                        }
                      } else {
                        if (((NIL != control_vars.$check_for_circular_justs$.getDynamicValue(thread))
                             && (NIL == some_belief_justification(assertion, UNPROVIDED)))) {
                          tms_remove_assertion(assertion);
                          assertion_removedP = T;
                        }
                      }
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                    }
                  }
                }
              }
              kb_hl_supports.process_tms_kb_hl_support_queue();
            } finally {
              kb_hl_supports.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return assertion_removedP;
      }
    }
  }

  /** Remove each valid assertion in ASSERTIONS */
  @SubL(source = "cycl/tms.lisp", position = 5898) 
  public static final SubLObject tms_remove_assertion_list(SubLObject assertions) {
    if ((NIL == assertions)) {
      return NIL;
    } else {
      return tms_remove_nonempty_assertion_list(assertions);
    }
  }

  /** Remove each valid assertion in ASSERTIONS */
  @SubL(source = "cycl/tms.lisp", position = 6104) 
  public static final SubLObject tms_remove_nonempty_assertion_list(SubLObject assertions) {
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
        tms_remove_assertion(assertion);
      }
    }
    return NIL;
  }

  /** Remove ASSERTION from the KB and do all necessary truth maintenance. */
  @SubL(source = "cycl/tms.lisp", position = 6341) 
  public static final SubLObject tms_remove_assertion(SubLObject assertion) {
    checkType(assertion, $sym0$ASSERTION_P);
    if (((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))
         && (NIL == tms_assertion_being_removedP(assertion)))) {
      return tms_remove_assertion_int(assertion);
    }
    return NIL;
  }

  @SubL(source = "cycl/tms.lisp", position = 6650) 
  public static final SubLObject tms_remove_assertion_int(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != kb_hl_supports.enqueueing_kb_hl_supports_for_tmsP())) {
        {
          SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
          try {
            $tms_assertions_being_removed$.bind(conses_high.adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
            {
              SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
              if ((NIL == v_arguments)) {
                tms_remove_assertion_int_2(assertion);
              } else {
                {
                  SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                  SubLObject argument = NIL;
                  for (argument = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argument = cdolist_list_var.first()) {
                    tms_remove_argument(argument, assertion);
                  }
                }
              }
            }
          } finally {
            $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
          }
        }
      } else {
        {
          SubLObject _prev_bind_0 = kb_hl_supports.$tms_kb_hl_support_queue$.currentBinding(thread);
          try {
            kb_hl_supports.$tms_kb_hl_support_queue$.bind(queues.create_queue(), thread);
            {
              SubLObject _prev_bind_0_3 = $tms_assertions_being_removed$.currentBinding(thread);
              try {
                $tms_assertions_being_removed$.bind(conses_high.adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                {
                  SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                  if ((NIL == v_arguments)) {
                    tms_remove_assertion_int_2(assertion);
                  } else {
                    {
                      SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                      SubLObject argument = NIL;
                      for (argument = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argument = cdolist_list_var.first()) {
                        tms_remove_argument(argument, assertion);
                      }
                    }
                  }
                }
              } finally {
                $tms_assertions_being_removed$.rebind(_prev_bind_0_3, thread);
              }
            }
            kb_hl_supports.process_tms_kb_hl_support_queue();
          } finally {
            kb_hl_supports.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** Remove ASSERTION from the KB. */
  @SubL(source = "cycl/tms.lisp", position = 7278) 
  public static final SubLObject tms_remove_assertion_int_2(SubLObject assertion) {
    checkType(assertion, $sym0$ASSERTION_P);
    kb_indexing.remove_term_indices(assertion);
    forward.remqueue_forward_assertion(assertion);
    if ((NIL != assertions_high.rule_assertionP(assertion))) {
      inference_analysis.clear_transformation_rule_statistics(assertion);
    }
    if ((NIL == function_terms.tou_assertionP(assertion))) {
      return assertions_high.remove_assertion(assertion);
    }
    return NIL;
  }

  /** Recompute ASSERTION's tv and perform necessary truth maintenance.  
   Return T if ASSERTION should be removed, else NIL */
  @SubL(source = "cycl/tms.lisp", position = 8858) 
  public static final SubLObject tms_recompute_assertion_tv(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym0$ASSERTION_P);
      {
        SubLObject changedP = NIL;
        SubLObject removeP = NIL;
        if ((NIL == assertion_utilities.assertion_has_argumentsP(assertion))) {
          {
            SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
            try {
              $tms_assertions_being_removed$.bind(conses_high.adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
              tms_remove_dependents(assertion);
            } finally {
              $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
            }
          }
          removeP = T;
        } else {
          {
            SubLObject old_tv = assertions_high.cyc_assertion_tv(assertion);
            SubLObject new_tv = argumentation.compute_assertion_tv(assertion);
            if ((NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread))) {
            } else if ((old_tv == new_tv)) {
            } else if ((enumeration_types.tv_truth(old_tv) == enumeration_types.tv_truth(new_tv))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12462");
            } else {
              tms_remove_dependents(assertion);
              changedP = T;
            }
          }
        }
        if ((NIL != changedP)) {
          rewrite_of_propagation.perform_rewrite_of_propagation(assertion);
          if ((assertions_high.assertion_direction(assertion) == $kw16$FORWARD)) {
            forward.queue_forward_assertion(assertion);
          }
        }
        return removeP;
      }
    }
  }

  /** Change the DIRECTION of ASSERTION and queue forward propagation if required. */
  @SubL(source = "cycl/tms.lisp", position = 10129) 
  public static final SubLObject tms_change_direction(SubLObject assertion, SubLObject direction) {
    checkType(assertion, $sym0$ASSERTION_P);
    checkType(direction, $sym17$DIRECTION_P);
    assertions_interface.kb_set_assertion_direction(assertion, direction);
    if ((direction == $kw16$FORWARD)) {
      forward.queue_forward_assertion(assertion);
    }
    return assertion;
  }

  /** Remove all the deductions depending on this ASSERTION. */
  @SubL(source = "cycl/tms.lisp", position = 10785) 
  public static final SubLObject tms_remove_dependents(SubLObject assertion) {
    checkType(assertion, $sym0$ASSERTION_P);
    {
      SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
      SubLObject dependent_deduction = NIL;
      for (dependent_deduction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dependent_deduction = cdolist_list_var.first()) {
        if ((NIL != deduction_handles.valid_deductionP(dependent_deduction, UNPROVIDED))) {
          {
            SubLObject deduction_assertion = deductions_high.deduction_assertion(dependent_deduction);
            tms_remove_argument(dependent_deduction, deduction_assertion);
          }
        }
      }
    }
    return assertion;
  }

  /** @return 0 NIL or deduction-p
@return 1 booleanp; whether the deduction is redundant */
  @SubL(source = "cycl/tms.lisp", position = 12859) 
  public static final SubLObject tms_add_deduction_for_assertion(SubLObject assertion, SubLObject supports, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw24$TRUE;
    }
    if ((NIL != tms_direct_circularity(assertion, supports))) {
      return Values.values(NIL, T);
    }
    {
      SubLObject existing = deductions_high.find_deduction(assertion, supports, truth);
      if ((NIL != existing)) {
        return Values.values(existing, T);
      }
    }
    {
      SubLObject tv = argumentation.compute_supports_tv(supports, truth);
      SubLObject new_argument = tms_add_new_deduction(assertion, supports, tv);
      return Values.values(new_argument, NIL);
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 13423) 
  public static final SubLObject tms_add_deduction_for_cnf(SubLObject cnf, SubLObject mt, SubLObject supports, SubLObject truth, SubLObject direction, SubLObject var_names) {
    if ((truth == UNPROVIDED)) {
      truth = $kw24$TRUE;
    }
    if ((direction == UNPROVIDED)) {
      direction = $kw25$BACKWARD;
    }
    if ((var_names == UNPROVIDED)) {
      var_names = NIL;
    }
    {
      SubLObject assertion = assertions_high.find_or_create_assertion(cnf, mt, var_names, direction);
      return tms_add_deduction_for_assertion(assertion, supports, truth);
    }
  }

  /** Return T iff SUPPORTS for ASSERTION include a direct circularity */
  @SubL(source = "cycl/tms.lisp", position = 13686) 
  public static final SubLObject tms_direct_circularity(SubLObject assertion, SubLObject supports) {
    checkType(assertion, $sym0$ASSERTION_P);
    return conses_high.member(assertion, supports, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/tms.lisp", position = 26932) 
  private static SubLSymbol $circular_deductions$ = null;

  @SubL(source = "cycl/tms.lisp", position = 27092) 
  private static SubLSymbol $circular_assertions$ = null;

  @SubL(source = "cycl/tms.lisp", position = 27140) 
  private static SubLSymbol $circular_target_assertion$ = null;

  @SubL(source = "cycl/tms.lisp", position = 27195) 
  private static SubLSymbol $circular_local_assertions$ = null;

  @SubL(source = "cycl/tms.lisp", position = 27249) 
  private static SubLSymbol $circular_complexity_count$ = null;

  /** The maximum number of assertions we'll consider while checking for
circularly supported assertions.  NIL means no limit */
  @SubL(source = "cycl/tms.lisp", position = 27303) 
  public static SubLSymbol $circular_complexity_count_limit$ = null;

  @SubL(source = "cycl/tms.lisp", position = 28427) 
  public static final SubLObject some_belief_justification(SubLObject assertion, SubLObject asserted_assertions_to_ignore) {
    if ((asserted_assertions_to_ignore == UNPROVIDED)) {
      asserted_assertions_to_ignore = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym0$ASSERTION_P);
      if (((NIL != assertions_high.asserted_assertionP(assertion))
           && (NIL == list_utilities.member_eqP(assertion, asserted_assertions_to_ignore)))) {
        return T;
      } else if ((NIL == assertions_high.assertion_arguments(assertion))) {
        return NIL;
      } else {
        {
          SubLObject just_found = NIL;
          {
            SubLObject _prev_bind_0 = $circular_deductions$.currentBinding(thread);
            SubLObject _prev_bind_1 = $circular_assertions$.currentBinding(thread);
            SubLObject _prev_bind_2 = $circular_local_assertions$.currentBinding(thread);
            SubLObject _prev_bind_3 = $circular_target_assertion$.currentBinding(thread);
            SubLObject _prev_bind_4 = $circular_complexity_count$.currentBinding(thread);
            try {
              $circular_deductions$.bind(NIL, thread);
              $circular_assertions$.bind(NIL, thread);
              $circular_local_assertions$.bind(NIL, thread);
              $circular_target_assertion$.bind(assertion, thread);
              $circular_complexity_count$.bind(ZERO_INTEGER, thread);
              try {
                {
                  SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                  SubLObject argument = NIL;
                  for (argument = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argument = cdolist_list_var.first()) {
                    if ((NIL != deduction_handles.deduction_p(argument))) {
                      gather_circular_deduction(argument, asserted_assertions_to_ignore);
                    }
                  }
                }
                {
                  SubLObject cdolist_list_var = $circular_assertions$.getDynamicValue(thread);
                  SubLObject supported_assertion = NIL;
                  for (supported_assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supported_assertion = cdolist_list_var.first()) {
                    if (((NIL != assertions_high.asserted_assertionP(supported_assertion))
                         && (NIL == list_utilities.member_eqP(supported_assertion, asserted_assertions_to_ignore)))) {
                      mark_circular_assertion(supported_assertion);
                    }
                  }
                }
              } catch (Throwable ccatch_env_var) {
                just_found = Errors.handleThrowable(ccatch_env_var, $kw66$JUST_FOUND);
              }
            } finally {
              $circular_complexity_count$.rebind(_prev_bind_4, thread);
              $circular_target_assertion$.rebind(_prev_bind_3, thread);
              $circular_local_assertions$.rebind(_prev_bind_2, thread);
              $circular_assertions$.rebind(_prev_bind_1, thread);
              $circular_deductions$.rebind(_prev_bind_0, thread);
            }
          }
          return just_found;
        }
      }
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 29672) 
  public static final SubLObject inc_circular_complexity_count() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $circular_complexity_count$.setDynamicValue(Numbers.add($circular_complexity_count$.getDynamicValue(thread), ONE_INTEGER), thread);
      if ((NIL != $circular_complexity_count_limit$.getDynamicValue(thread))) {
        if ($circular_complexity_count$.getDynamicValue(thread).numG($circular_complexity_count_limit$.getDynamicValue(thread))) {
          Dynamic.sublisp_throw($kw66$JUST_FOUND, T);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 30144) 
  public static final SubLObject gather_circular_deduction(SubLObject deduction, SubLObject asserted_assertions_to_ignore) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.memberP(deduction, $circular_deductions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
        $circular_deductions$.setDynamicValue(cons(deduction, $circular_deductions$.getDynamicValue(thread)), thread);
        inc_circular_complexity_count();
        {
          SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
          SubLObject assertion = NIL;
          for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
            if ((NIL != assertion_handles.assertion_p(assertion))) {
              $circular_assertions$.setDynamicValue(cons(assertion, $circular_assertions$.getDynamicValue(thread)), thread);
              inc_circular_complexity_count();
              if ((!(((NIL != assertions_high.asserted_assertionP(assertion))
                     && (NIL == list_utilities.member_eqP(assertion, asserted_assertions_to_ignore)))))) {
                {
                  SubLObject cdolist_list_var_19 = assertions_high.assertion_arguments(assertion);
                  SubLObject argument = NIL;
                  for (argument = cdolist_list_var_19.first(); (NIL != cdolist_list_var_19); cdolist_list_var_19 = cdolist_list_var_19.rest(), argument = cdolist_list_var_19.first()) {
                    if ((NIL != deduction_handles.deduction_p(argument))) {
                      gather_circular_deduction(argument, asserted_assertions_to_ignore);
                    }
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

  @SubL(source = "cycl/tms.lisp", position = 30885) 
  public static final SubLObject mark_circular_assertion(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((assertion == $circular_target_assertion$.getDynamicValue(thread))) {
        Dynamic.sublisp_throw($kw66$JUST_FOUND, T);
      }
      if ((NIL == subl_promotions.memberP(assertion, $circular_local_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
        $circular_local_assertions$.setDynamicValue(cons(assertion, $circular_local_assertions$.getDynamicValue(thread)), thread);
        {
          SubLObject cdolist_list_var = circular_deductions_with_assertion(assertion);
          SubLObject deduction = NIL;
          for (deduction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), deduction = cdolist_list_var.first()) {
            if ((NIL != believed_circular_deduction(deduction))) {
              mark_circular_assertion(deductions_high.deduction_assertion(deduction));
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 31511) 
  public static final SubLObject circular_deductions_with_assertion(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = $circular_deductions$.getDynamicValue(thread);
        SubLObject deduction = NIL;
        for (deduction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), deduction = cdolist_list_var.first()) {
          if ((NIL != subl_promotions.memberP(assertion, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED))) {
            ans = cons(deduction, ans);
          }
        }
        return Sequences.nreverse(ans);
      }
    }
  }

  @SubL(source = "cycl/tms.lisp", position = 31752) 
  public static final SubLObject believed_circular_deduction(SubLObject deduction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        SubLObject rest = NIL;
        for (rest = deductions_high.deduction_supports(deduction); (!(((NIL != ans)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject support = rest.first();
            if ((NIL != assertion_handles.assertion_p(support))) {
              if ((NIL == subl_promotions.memberP(support, $circular_local_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                ans = T;
              }
            }
          }
        }
        return makeBoolean((NIL == ans));
      }
    }
  }

  public static final SubLObject declare_tms_file() {
    declareFunction(myName, "tms_assertion_being_removedP", "TMS-ASSERTION-BEING-REMOVED?", 1, 0, false);
    //declareMacro(myName, "tms_note_assertion_being_removed", "TMS-NOTE-ASSERTION-BEING-REMOVED");
    declareFunction(myName, "tms_deduction_being_removedP", "TMS-DEDUCTION-BEING-REMOVED?", 1, 0, false);
    //declareMacro(myName, "tms_note_deduction_being_removed", "TMS-NOTE-DEDUCTION-BEING-REMOVED");
    declareFunction(myName, "tms_argument_being_removedP", "TMS-ARGUMENT-BEING-REMOVED?", 1, 0, false);
    //declareMacro(myName, "tms_note_argument_being_removed", "TMS-NOTE-ARGUMENT-BEING-REMOVED");
    //declareFunction(myName, "tms_possibly_replace_asserted_argument_with_tv", "TMS-POSSIBLY-REPLACE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
    declareFunction(myName, "tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
    declareFunction(myName, "tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 0, false);
    declareFunction(myName, "tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 0, false);
    declareFunction(myName, "tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 0, false);
    declareFunction(myName, "tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 2, 0, false);
    declareFunction(myName, "tms_remove_assertion_list", "TMS-REMOVE-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "tms_remove_nonempty_assertion_list", "TMS-REMOVE-NONEMPTY-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "tms_remove_assertion", "TMS-REMOVE-ASSERTION", 1, 0, false);
    declareFunction(myName, "tms_remove_assertion_int", "TMS-REMOVE-ASSERTION-INT", 1, 0, false);
    declareFunction(myName, "tms_remove_assertion_int_2", "TMS-REMOVE-ASSERTION-INT-2", 1, 0, false);
    //declareFunction(myName, "tms_remove_deduction", "TMS-REMOVE-DEDUCTION", 1, 0, false);
    //declareFunction(myName, "tms_change_asserted_argument_tv", "TMS-CHANGE-ASSERTED-ARGUMENT-TV", 3, 0, false);
    declareFunction(myName, "tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 0, false);
    declareFunction(myName, "tms_change_direction", "TMS-CHANGE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "tms_recompute_dependents", "TMS-RECOMPUTE-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "tms_remove_dependents", "TMS-REMOVE-DEPENDENTS", 1, 0, false);
    //declareFunction(myName, "tms_recompute_dependents_tv", "TMS-RECOMPUTE-DEPENDENTS-TV", 1, 0, false);
    //declareFunction(myName, "tms_recompute_deduction_tv", "TMS-RECOMPUTE-DEDUCTION-TV", 1, 0, false);
    //declareFunction(myName, "tms_remove_mt_arguments", "TMS-REMOVE-MT-ARGUMENTS", 1, 1, false);
    //declareFunction(myName, "tms_remove_deduction_for_assertion", "TMS-REMOVE-DEDUCTION-FOR-ASSERTION", 2, 1, false);
    declareFunction(myName, "tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 1, false);
    declareFunction(myName, "tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 3, false);
    declareFunction(myName, "tms_direct_circularity", "TMS-DIRECT-CIRCULARITY", 2, 0, false);
    //declareFunction(myName, "tms_directly_circular_deduction", "TMS-DIRECTLY-CIRCULAR-DEDUCTION", 1, 0, false);
    //declareFunction(myName, "atomic_cnf_trivially_derivable", "ATOMIC-CNF-TRIVIALLY-DERIVABLE", 2, 0, false);
    //declareFunction(myName, "gaf_trivially_derivable", "GAF-TRIVIALLY-DERIVABLE", 3, 0, false);
    //declareFunction(myName, "true_gaf_trivially_derivable", "TRUE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
    //declareFunction(myName, "false_gaf_trivially_derivable", "FALSE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
    //declareFunction(myName, "tms_reconsider_assertion_deductions", "TMS-RECONSIDER-ASSERTION-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "tms_reconsider_assertion_dependents", "TMS-RECONSIDER-ASSERTION-DEPENDENTS", 1, 0, false);
    //declareFunction(myName, "tms_reconsider_deduction", "TMS-RECONSIDER-DEDUCTION", 1, 0, false);
    //declareFunction(myName, "tms_deduction_stale_wrt_supportsP", "TMS-DEDUCTION-STALE-WRT-SUPPORTS?", 1, 0, false);
    //declareFunction(myName, "tms_deduction_stale_wrt_exceptionsP", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?", 1, 0, false);
    //declareFunction(myName, "tms_reprove_deduction_query_sentence", "TMS-REPROVE-DEDUCTION-QUERY-SENTENCE", 1, 0, false);
    //declareFunction(myName, "tms_reprove_deduction_query_mt", "TMS-REPROVE-DEDUCTION-QUERY-MT", 1, 0, false);
    //declareFunction(myName, "tms_reprove_deduction_query_properties", "TMS-REPROVE-DEDUCTION-QUERY-PROPERTIES", 5, 0, false);
    //declareFunction(myName, "tms_reconsider_assertion", "TMS-RECONSIDER-ASSERTION", 1, 0, false);
    //declareFunction(myName, "tms_reconsider_mt", "TMS-RECONSIDER-MT", 1, 0, false);
    //declareFunction(myName, "tms_reconsider_term_gafs", "TMS-RECONSIDER-TERM-GAFS", 1, 1, false);
    //declareFunction(myName, "tms_reconsider_predicate_extent", "TMS-RECONSIDER-PREDICATE-EXTENT", 1, 1, false);
    //declareFunction(myName, "tms_reconsider_gaf_args", "TMS-RECONSIDER-GAF-ARGS", 2, 2, false);
    //declareFunction(myName, "tms_reconsider_term", "TMS-RECONSIDER-TERM", 1, 1, false);
    //declareFunction(myName, "tms_reconsider_all_assertions", "TMS-RECONSIDER-ALL-ASSERTIONS", 0, 0, false);
    //declareFunction(myName, "stale_support", "STALE-SUPPORT", 1, 0, false);
    //declareFunction(myName, "stale_support_mtP", "STALE-SUPPORT-MT?", 2, 0, false);
    //declareFunction(myName, "support_mt_okP", "SUPPORT-MT-OK?", 2, 0, false);
    //declareFunction(myName, "assertion_asserted_more_specifically_deductions", "ASSERTION-ASSERTED-MORE-SPECIFICALLY-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "remove_circularly_supported_assertions", "REMOVE-CIRCULARLY-SUPPORTED-ASSERTIONS", 0, 1, false);
    //declareFunction(myName, "remove_if_circularly_supported_assertion", "REMOVE-IF-CIRCULARLY-SUPPORTED-ASSERTION", 1, 1, false);
    //declareFunction(myName, "independently_deducible_assertionP", "INDEPENDENTLY-DEDUCIBLE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "some_belief_justification", "SOME-BELIEF-JUSTIFICATION", 1, 1, false);
    declareFunction(myName, "inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 0, false);
    declareFunction(myName, "gather_circular_deduction", "GATHER-CIRCULAR-DEDUCTION", 2, 0, false);
    declareFunction(myName, "mark_circular_assertion", "MARK-CIRCULAR-ASSERTION", 1, 0, false);
    declareFunction(myName, "circular_deductions_with_assertion", "CIRCULAR-DEDUCTIONS-WITH-ASSERTION", 1, 0, false);
    declareFunction(myName, "believed_circular_deduction", "BELIEVED-CIRCULAR-DEDUCTION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_tms_file() {
    $tms_assertions_being_removed$ = defparameter("*TMS-ASSERTIONS-BEING-REMOVED*", NIL);
    $tms_deductions_being_removed$ = defparameter("*TMS-DEDUCTIONS-BEING-REMOVED*", NIL);
    $circular_deductions$ = defparameter("*CIRCULAR-DEDUCTIONS*", NIL);
    $circular_assertions$ = defparameter("*CIRCULAR-ASSERTIONS*", NIL);
    $circular_target_assertion$ = defparameter("*CIRCULAR-TARGET-ASSERTION*", NIL);
    $circular_local_assertions$ = defparameter("*CIRCULAR-LOCAL-ASSERTIONS*", NIL);
    $circular_complexity_count$ = defparameter("*CIRCULAR-COMPLEXITY-COUNT*", ZERO_INTEGER);
    $circular_complexity_count_limit$ = defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int62$50);
    return NIL;
  }

  public static final SubLObject setup_tms_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list1 = list(list(makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$_TMS_ASSERTIONS_BEING_REMOVED_ = makeSymbol("*TMS-ASSERTIONS-BEING-REMOVED*");
  public static final SubLSymbol $sym4$ADJOIN = makeSymbol("ADJOIN");
  public static final SubLList $list5 = list(makeSymbol("*TMS-ASSERTIONS-BEING-REMOVED*"));
  public static final SubLSymbol $sym6$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLList $list7 = list(list(makeSymbol("DEDUCTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym8$_TMS_DEDUCTIONS_BEING_REMOVED_ = makeSymbol("*TMS-DEDUCTIONS-BEING-REMOVED*");
  public static final SubLList $list9 = list(makeSymbol("*TMS-DEDUCTIONS-BEING-REMOVED*"));
  public static final SubLSymbol $sym10$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym11$TMS_NOTE_DEDUCTION_BEING_REMOVED = makeSymbol("TMS-NOTE-DEDUCTION-BEING-REMOVED");
  public static final SubLSymbol $sym12$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym13$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym14$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
  public static final SubLSymbol $sym15$TV_P = makeSymbol("TV-P");
  public static final SubLSymbol $kw16$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym17$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $sym18$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $kw19$MT = makeKeyword("MT");
  public static final SubLSymbol $kw20$BROAD_MT = makeKeyword("BROAD-MT");
  public static final SubLString $str21$do_broad_mt_index = makeString("do-broad-mt-index");
  public static final SubLSymbol $sym22$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw23$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw24$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw25$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $sym26$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $kw27$FALSE = makeKeyword("FALSE");
  public static final SubLString $str28$_S_was_not_an_atomic_CNF_ = makeString("~S was not an atomic CNF.");
  public static final SubLObject $const29$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list30 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLObject $const31$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym32$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $sym33$RULE_HAS_EXCEPTIONS_ = makeSymbol("RULE-HAS-EXCEPTIONS?");
  public static final SubLSymbol $sym34$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_ = makeSymbol("RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?");
  public static final SubLSymbol $sym35$_PRED = makeSymbol("?PRED");
  public static final SubLObject $const36$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const37$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLObject $const38$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym39$UNBOUND_PREDICATE_RULE_P = makeSymbol("UNBOUND-PREDICATE-RULE-P");
  public static final SubLSymbol $kw40$ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
  public static final SubLSymbol $kw41$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $kw42$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw43$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLSymbol $kw44$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $kw45$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw46$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw47$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw48$HL = makeKeyword("HL");
  public static final SubLSymbol $kw49$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLSymbol $kw50$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw51$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $kw52$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw53$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw54$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLString $str55$Performing_full_TMS_on_mt__S = makeString("Performing full TMS on mt ~S");
  public static final SubLSymbol $sym56$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym57$TMS_RECONSIDER_ASSERTION = makeSymbol("TMS-RECONSIDER-ASSERTION");
  public static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const59$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str60$Reconsidering_assertion_arguments = makeString("Reconsidering assertion arguments");
  public static final SubLSymbol $sym61$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLInteger $int62$50 = makeInteger(50);
  public static final SubLString $str63$Removing_circularly_supported_ass = makeString("Removing circularly supported assertions");
  public static final SubLString $str64$_____S_circularly_supported_asser = makeString("~%~%~S circularly supported assertions removed");
  public static final SubLString $str65$__Removing__S = makeString("~%Removing ~S");
  public static final SubLSymbol $kw66$JUST_FOUND = makeKeyword("JUST-FOUND");

  //// Initializers

  public void declareFunctions() {
    declare_tms_file();
  }

  public void initializeVariables() {
    init_tms_file();
  }

  public void runTopLevelForms() {
    setup_tms_file();
  }

}
