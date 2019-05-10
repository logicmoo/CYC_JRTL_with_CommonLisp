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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.backward_results;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.inference.harness.forward;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class system_benchmarks extends SubLTranslatedFile {

  //// Constructor

  private system_benchmarks() {}
  public static final SubLFile me = new system_benchmarks();
  public static final String myName = "com.cyc.cycjava_1.cycl.system_benchmarks";

  //// Definitions

  /** When non-NIL, a uniquifying FAMILY predicate is added */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 1182) 
  private static SubLSymbol $cyclops_family_fix_enabledP$ = null;

  /** Temporary control variable;
   When non-nil
   (1) we assert the ANECT of the created term in BaseKB
   (2) we assert the the non-ANECTs of the term in a lower Mt
   When nil
   (1) we only assert the non-ANECTs of the term in BaseKB. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 1292) 
  private static SubLSymbol $cyclops_anect_fix_enabledP$ = null;

  @SubL(source = "cycl/system-benchmarks.lisp", position = 1621) 
  private static SubLSymbol $benchmark_cyclops_power$ = null;

  /** The top of the ontology created by CycLOPs. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 1857) 
  private static SubLSymbol $benchmark_cyclops_ontology_root$ = null;

  @SubL(source = "cycl/system-benchmarks.lisp", position = 2002) 
  private static SubLSymbol $cyclops_throwaway_default$ = null;

  /** The standard interface function for CycLOPs benchmarking.
   Runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.
   Then runs it SAMPLE-N more times and returns the median of those sampled results. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 2077) 
  public static final SubLObject benchmark_cyclops_compensating_for_paging(SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
    if ((throwaway_n == UNPROVIDED)) {
      throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
    }
    if ((sample_n == UNPROVIDED)) {
      sample_n = SEVEN_INTEGER;
    }
    if ((power == UNPROVIDED)) {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    {
      SubLObject total_n = Numbers.add(throwaway_n, sample_n);
      return median_cyclops(total_n, power, stream, throwaway_n);
    }
  }

  /** @param THROW-AWAY-FIRST-N integerp; if zero, has no effect.
   if greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.
   This can be used to compensate for paging. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 2635) 
  public static final SubLObject benchmark_cyclops_n_times(SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
    if ((power == UNPROVIDED)) {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((throw_away_first_n == UNPROVIDED)) {
      throw_away_first_n = ZERO_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(n, $sym3$NON_NEGATIVE_INTEGER_P);
      checkType(power, $sym3$NON_NEGATIVE_INTEGER_P);
      {
        SubLObject values = NIL;
        thread.resetMultipleValues();
        {
          SubLObject mt_1 = benchmark_cyclops_setup();
          SubLObject mt_2 = thread.secondMultipleValue();
          SubLObject collections = thread.thirdMultipleValue();
          SubLObject bottom_collection = thread.fourthMultipleValue();
          SubLObject parent = thread.fifthMultipleValue();
          SubLObject ancestor = thread.sixthMultipleValue();
          SubLObject sibling = thread.seventhMultipleValue();
          SubLObject family = thread.eighthMultipleValue();
          thread.resetMultipleValues();
          try {
            {
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
                {
                  SubLObject guts_time = benchmark_cyclops_guts(power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
                  SubLObject cyclops = benchmark_cyclops_compute_and_print_statistics(stream, power, guts_time);
                  if (i.numGE(throw_away_first_n)) {
                    values = cons(cyclops, values);
                  }
                }
              }
            }
          } finally {
            {
              SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
              try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
              } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        values = Sequences.nreverse(values);
        if (n.numG(ONE_INTEGER)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31856");
        }
        return values;
      }
    }
  }

  /** Runs benchmark-cyclops N times and returns the median recorded value. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 4173) 
  public static final SubLObject median_cyclops(SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
    if ((power == UNPROVIDED)) {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((throw_away_first_n == UNPROVIDED)) {
      throw_away_first_n = ZERO_INTEGER;
    }
    {
      SubLObject cyclops = number_utilities.median(benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), UNPROVIDED);
      SubLObject bogomips = misc_utilities.machine_bogomips();
      if ((NIL != bogomips)) {
        return Values.values(cyclops, Numbers.divide(bogomips, cyclops));
      } else {
        return cyclops;
      }
    }
  }

  /** initialization */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 5567) 
  public static final SubLObject benchmark_cyclops_setup() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject mt_1 = NIL;
        SubLObject mt_2 = NIL;
        SubLObject collections = NIL;
        SubLObject top_collection = NIL;
        SubLObject bottom_collection = NIL;
        SubLObject parent = NIL;
        SubLObject ancestor = NIL;
        SubLObject sibling = NIL;
        SubLObject family = NIL;
        {
          SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
          SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
          try {
            utilities_macros.$silent_progressP$.bind(T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            thread.resetMultipleValues();
            {
              SubLObject mt_1_9 = benchmark_cyclops_create_mts();
              SubLObject mt_2_10 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              mt_1 = mt_1_9;
              mt_2 = mt_2_10;
            }
            thread.resetMultipleValues();
            {
              SubLObject collections_11 = benchmark_cyclops_create_ontology();
              SubLObject top_collection_12 = thread.secondMultipleValue();
              SubLObject bottom_collection_13 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              collections = collections_11;
              top_collection = top_collection_12;
              bottom_collection = bottom_collection_13;
            }
            parent = benchmark_cyclops_create_parent(top_collection);
            ancestor = benchmark_cyclops_create_ancestor(top_collection);
            sibling = benchmark_cyclops_create_sibling(top_collection);
            family = benchmark_cyclops_create_family(top_collection);
            benchmark_cyclops_define_predicates(parent, ancestor, sibling, family);
          } finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(mt_1, mt_2, collections, bottom_collection, parent, ancestor, sibling, family);
      }
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 6870) 
  public static final SubLObject benchmark_cyclops_guts(SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
    Storage.gc_ephemeral();
    {
      SubLObject time = NIL;
      SubLObject time_var = Time.get_internal_real_time();
      benchmark_cyclops_guts_int(ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
      time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
      return time;
    }
  }

  /** the scalable portion */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 7259) 
  public static final SubLObject benchmark_cyclops_guts_int(SubLObject uniquifier, SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
        SubLObject _prev_bind_2 = backward_results.$inference_intermediate_step_validation_level$.currentBinding(thread);
        SubLObject _prev_bind_3 = Types.$suspend_type_checkingP$.currentBinding(thread);
        try {
          utilities_macros.$silent_progressP$.bind(T, thread);
          StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
          backward_results.$inference_intermediate_step_validation_level$.bind($kw4$NONE, thread);
          Types.$suspend_type_checkingP$.bind(T, thread);
          {
            SubLObject cprogv_var = utilities_macros.$fi_state_variables$.getGlobalValue();
            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
            try {
              Dynamic.bind_dynamic_vars(cprogv_var, ConsesLow.make_list(Sequences.length(utilities_macros.$fi_state_variables$.getGlobalValue()), NIL));
              {
                SubLObject _prev_bind_0_14 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                SubLObject _prev_bind_1_15 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                try {
                  kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                  control_vars.$prefer_forward_skolemization$.bind(NIL, thread);
                  {
                    SubLObject environment = forward.get_forward_inference_environment();
                    checkType(environment, $sym5$QUEUE_P);
                    {
                      SubLObject _prev_bind_0_16 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                      SubLObject _prev_bind_1_17 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                      try {
                        kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                        utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
                        try {
                          {
                            SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                            {
                              SubLObject _prev_bind_0_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                              SubLObject _prev_bind_1_19 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                              SubLObject _prev_bind_2_20 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                              try {
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                {
                                  SubLObject k = Numbers.subtract(Numbers.expt(TWO_INTEGER, power), ONE_INTEGER);
                                  SubLObject terms = NIL;
                                  try {
                                    terms = benchmark_cyclops_create_terms(uniquifier, k, bottom_collection, mt_1);
                                    benchmark_cyclops_assert_family_links(uniquifier, k, terms, family, mt_1);
                                    benchmark_cyclops_assert_parent_links(k, terms, parent, mt_1);
                                    benchmark_cyclops_query_parent_links(k, terms, parent, mt_2);
                                    benchmark_cyclops_query_ancestor_links(k, terms, ancestor, mt_1);
                                    benchmark_cyclops_query_sibling_links_via_rule(k, terms, sibling, mt_2);
                                    benchmark_cyclops_forward_propagate_sibling_rule(uniquifier, parent, sibling, family);
                                    benchmark_cyclops_turn_sibling_rule_backward(uniquifier, parent, sibling, family);
                                    benchmark_cyclops_query_sibling_links_via_lookup(k, terms, sibling, mt_2);
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        benchmark_cyclops_kill_terms(k, terms);
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                      }
                                    }
                                  }
                                  sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                }
                              } finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_20, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_19, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_18, thread);
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0_22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              forward.clear_current_forward_problem_store();
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                            }
                          }
                        }
                      } finally {
                        utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_17, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_16, thread);
                      }
                    }
                  }
                } finally {
                  control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_1_15, thread);
                  kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_14, thread);
                }
              }
            } finally {
              Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
            }
          }
        } finally {
          Types.$suspend_type_checkingP$.rebind(_prev_bind_3, thread);
          backward_results.$inference_intermediate_step_validation_level$.rebind(_prev_bind_2, thread);
          StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
          utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** cleanup */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 9278) 
  public static final SubLObject benchmark_cyclops_teardown(SubLObject mt_1, SubLObject mt_2, SubLObject collections, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
          utilities_macros.$silent_progressP$.bind(T, thread);
          StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
          benchmark_cyclops_kill_vocabulary(mt_1, mt_2, collections, parent, ancestor, sibling, family);
        } finally {
          StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
          utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 9566) 
  public static final SubLObject benchmark_cyclops_compute_and_print_statistics(SubLObject stream, SubLObject power, SubLObject guts_time) {
    {
      SubLObject k = Numbers.subtract(Numbers.expt(TWO_INTEGER, power), ONE_INTEGER);
      SubLObject efficiency = Numbers.divide(guts_time, k);
      SubLObject cyclops = Numbers.invert(efficiency);
      SubLObject bogomips = misc_utilities.machine_bogomips();
      benchmark_cyclops_print_statistics(stream, bogomips, k, guts_time, efficiency, cyclops);
      return cyclops;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 9893) 
  public static final SubLObject benchmark_cyclops_create_mts() {
    {
      SubLObject mt_1 = NIL;
      SubLObject mt_2 = NIL;
      mt_1 = cyc_kernel.cyc_create_new_ephemeral($str6$Mt_1);
      mt_2 = cyc_kernel.cyc_create_new_ephemeral($str7$Mt_2);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, mt_1, $list9), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, mt_2, $list9), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const12$genlMt, mt_2, mt_1), $const10$BaseKB, $list11);
      return Values.values(mt_1, mt_2);
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 10430) 
  public static final SubLObject benchmark_cyclops_create_ontology() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject collections = NIL;
        SubLObject top_collection = NIL;
        SubLObject bottom_collection = NIL;
        utilities_macros.$progress_note$.setDynamicValue($str13$Creating_collection_ontology, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue($int14$25, thread);
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
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                {
                  SubLObject collection = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate($str15$Col_, format_nil.format_nil_a_no_copy(i)));
                  collections = cons(collection, collections);
                  cyc_kernel.cyc_assert_wff(listS($const8$isa, collection, $list16), $const10$BaseKB, $list11);
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
        {
          SubLObject previous = $benchmark_cyclops_ontology_root$.getDynamicValue(thread);
          SubLObject cdolist_list_var = collections;
          SubLObject collection = NIL;
          for (collection = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collection = cdolist_list_var.first()) {
            cyc_kernel.cyc_assert_wff(list($const17$genls, collection, previous), $const10$BaseKB, $list11);
            previous = collection;
          }
        }
        top_collection = collections.first();
        bottom_collection = conses_high.last(collections, UNPROVIDED).first();
        return Values.values(collections, top_collection, bottom_collection);
      }
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 11230) 
  public static final SubLObject benchmark_cyclops_create_parent(SubLObject top_collection) {
    {
      SubLObject parent = cyc_kernel.cyc_create_new_ephemeral($str18$parent);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, parent, $list19), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, parent, $list20), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const21$arg1Isa, parent, top_collection), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const22$arg2Isa, parent, top_collection), $const10$BaseKB, $list11);
      return parent;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 11832) 
  public static final SubLObject benchmark_cyclops_create_ancestor(SubLObject top_collection) {
    {
      SubLObject ancestor = cyc_kernel.cyc_create_new_ephemeral($str23$ancestor);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, ancestor, $list24), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, ancestor, $list25), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, ancestor, $list26), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const21$arg1Isa, ancestor, top_collection), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const22$arg2Isa, ancestor, top_collection), $const10$BaseKB, $list11);
      return ancestor;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 12578) 
  public static final SubLObject benchmark_cyclops_create_sibling(SubLObject top_collection) {
    {
      SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral($str27$sibling);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, sibling, $list19), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, sibling, $list28), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const21$arg1Isa, sibling, top_collection), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const22$arg2Isa, sibling, top_collection), $const10$BaseKB, $list11);
      return sibling;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 13188) 
  public static final SubLObject benchmark_cyclops_create_family(SubLObject top_collection) {
    {
      SubLObject family = cyc_kernel.cyc_create_new_ephemeral($str29$family);
      cyc_kernel.cyc_assert_wff(listS($const8$isa, family, $list30), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(list($const21$arg1Isa, family, top_collection), $const10$BaseKB, $list11);
      cyc_kernel.cyc_assert_wff(listS($const22$arg2Isa, family, $list31), $const10$BaseKB, $list11);
      return family;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 13659) 
  public static final SubLObject benchmark_cyclops_define_predicates(SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
    cyc_kernel.cyc_assert_wff(list($const32$genlPreds, parent, ancestor), $const10$BaseKB, $list11);
    benchmark_cyclops_assert_sibling_rule(MINUS_ONE_INTEGER, parent, sibling, family, $kw33$BACKWARD);
    return NIL;
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 14043) 
  public static final SubLObject benchmark_cyclops_assert_sibling_rule(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family, SubLObject direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_properties = list($kw34$STRENGTH, $kw35$MONOTONIC, $kw36$DIRECTION, direction);
        SubLObject sentence = NIL;
        if (((NIL != $cyclops_family_fix_enabledP$.getDynamicValue(thread))
             && (!(uniquifier.isNegative())))) {
          sentence = list($const37$implies, list($const38$and, $list39, list(family, $sym40$_PARENT, uniquifier), reader.bq_cons(parent, $list41), reader.bq_cons(parent, $list42)), reader.bq_cons(sibling, $list43));
        } else {
          sentence = list($const37$implies, list($const38$and, list($const44$different, $sym45$_CHILD_1, $sym46$_CHILD_2, uniquifier), reader.bq_cons(parent, $list41), reader.bq_cons(parent, $list42)), reader.bq_cons(sibling, $list43));
        }
        return cyc_kernel.cyc_assert_wff(sentence, $const10$BaseKB, v_properties);
      }
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 14810) 
  private static SubLSymbol $cyclops_lockedP$ = null;

  /** This is a temporary proxy for better HL lock handling. */
  @SubL(source = "cycl/system-benchmarks.lisp", position = 14857) 
  private static SubLSymbol $cyclops_lock$ = null;

  @SubL(source = "cycl/system-benchmarks.lisp", position = 15185) 
  public static final SubLObject benchmark_cyclops_create_terms(SubLObject uniquifier, SubLObject k, SubLObject bottom_collection, SubLObject mt_1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $cyclops_anect_fix_enabledP$.getDynamicValue(thread))) {
        mt_1 = $const10$BaseKB;
      }
      {
        SubLObject terms = NIL;
        utilities_macros.$progress_note$.setDynamicValue($str54$Creating_terms, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                {
                  SubLObject v_term = benchmark_cyclops_create_term(uniquifier, i);
                  terms = cons(v_term, terms);
                  if ((NIL != $cyclops_anect_fix_enabledP$.getDynamicValue(thread))) {
                    if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
                      {
                        SubLObject lock = $cyclops_lock$.getGlobalValue();
                        SubLObject release = NIL;
                        try {
                          release = Locks.seize_lock(lock);
                          cyc_kernel.cyc_assert_wff(listS($const8$isa, v_term, $list55), $const10$BaseKB, $list11);
                        } finally {
                          if ((NIL != release)) {
                            Locks.release_lock(lock);
                          }
                        }
                      }
                    } else {
                      cyc_kernel.cyc_assert_wff(listS($const8$isa, v_term, $list55), $const10$BaseKB, $list11);
                    }
                  }
                  if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
                    {
                      SubLObject lock = $cyclops_lock$.getGlobalValue();
                      SubLObject release = NIL;
                      try {
                        release = Locks.seize_lock(lock);
                        cyc_kernel.cyc_assert_wff(list($const8$isa, v_term, bottom_collection), mt_1, $list11);
                      } finally {
                        if ((NIL != release)) {
                          Locks.release_lock(lock);
                        }
                      }
                    }
                  } else {
                    cyc_kernel.cyc_assert_wff(list($const8$isa, v_term, bottom_collection), mt_1, $list11);
                  }
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
        terms = Functions.apply(Symbols.symbol_function($sym56$VECTOR), Sequences.nreverse(terms));
        return terms;
      }
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 15928) 
  public static final SubLObject benchmark_cyclops_create_term(SubLObject uniquifier, SubLObject index) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_term = NIL;
        if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
          {
            SubLObject lock = $cyclops_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
              release = Locks.seize_lock(lock);
              v_term = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate($str57$Term_, new SubLObject[] {format_nil.format_nil_a_no_copy(uniquifier), $str58$_, format_nil.format_nil_a_no_copy(index)}));
            } finally {
              if ((NIL != release)) {
                Locks.release_lock(lock);
              }
            }
          }
        } else {
          v_term = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate($str57$Term_, new SubLObject[] {format_nil.format_nil_a_no_copy(uniquifier), $str58$_, format_nil.format_nil_a_no_copy(index)}));
        }
        return v_term;
      }
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 16139) 
  public static final SubLObject benchmark_cyclops_assert_family_links(SubLObject uniquifier, SubLObject k, SubLObject terms, SubLObject family, SubLObject mt_1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str59$Asserting_family_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
                {
                  SubLObject lock = $cyclops_lock$.getGlobalValue();
                  SubLObject release = NIL;
                  try {
                    release = Locks.seize_lock(lock);
                    cyc_kernel.cyc_assert_wff(list(family, Vectors.aref(terms, i), uniquifier), mt_1, $list11);
                  } finally {
                    if ((NIL != release)) {
                      Locks.release_lock(lock);
                    }
                  }
                }
              } else {
                cyc_kernel.cyc_assert_wff(list(family, Vectors.aref(terms, i), uniquifier), mt_1, $list11);
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 16442) 
  public static final SubLObject benchmark_cyclops_assert_parent_links(SubLObject k, SubLObject terms, SubLObject parent, SubLObject mt_1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str60$Asserting_parent_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((!(i.numE(ZERO_INTEGER)))) {
                if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
                  {
                    SubLObject lock = $cyclops_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                      release = Locks.seize_lock(lock);
                      cyc_kernel.cyc_assert_wff(list(parent, Vectors.aref(terms, i), Vectors.aref(terms, Numbers.integerDivide(Numbers.subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list11);
                    } finally {
                      if ((NIL != release)) {
                        Locks.release_lock(lock);
                      }
                    }
                  }
                } else {
                  cyc_kernel.cyc_assert_wff(list(parent, Vectors.aref(terms, i), Vectors.aref(terms, Numbers.integerDivide(Numbers.subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list11);
                }
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 16766) 
  public static final SubLObject benchmark_cyclops_query(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject error_spec) {
    {
      SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
      if ((NIL != result)) {
        return result;
      }
      Functions.apply(Symbols.symbol_function($sym61$WARN), error_spec);
    }
    {
      SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
      if ((NIL != result)) {
        return result;
      }
      Functions.apply(Symbols.symbol_function($sym62$ERROR), error_spec);
    }
    return NIL;
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 17099) 
  public static final SubLObject benchmark_cyclops_query_parent_links(SubLObject k, SubLObject terms, SubLObject parent, SubLObject mt_2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str63$Asking_parent_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((!(i.numE(ZERO_INTEGER)))) {
                {
                  SubLObject sentence = listS(parent, Vectors.aref(terms, i), $list64);
                  benchmark_cyclops_query(sentence, mt_2, NIL, list($str65$CycLOPs_error_asking_parent__S, i));
                }
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 17416) 
  public static final SubLObject benchmark_cyclops_query_ancestor_links(SubLObject k, SubLObject terms, SubLObject ancestor, SubLObject mt_1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str66$Asking_ancestor_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((!(i.numE(ZERO_INTEGER)))) {
                {
                  SubLObject sentence = list($const38$and, listS(ancestor, Vectors.aref(terms, i), $list67), listS($const44$different, Vectors.aref(terms, i), $list67));
                  benchmark_cyclops_query(sentence, mt_1, NIL, list($str68$CycLOPs_error__asking_ancestor__S, i));
                }
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 17799) 
  public static final SubLObject benchmark_cyclops_query_sibling_links_via_rule(SubLObject k, SubLObject terms, SubLObject sibling, SubLObject mt_2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str69$Asking_sibling_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((!(i.numE(ZERO_INTEGER)))) {
                {
                  SubLObject sentence = listS(sibling, Vectors.aref(terms, i), $list70);
                  SubLObject v_properties = $list71;
                  benchmark_cyclops_query(sentence, mt_2, v_properties, list($str72$CycLOPs_error__asking_sibling__S_, i));
                }
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 18204) 
  public static final SubLObject benchmark_cyclops_forward_propagate_sibling_rule(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
        {
          SubLObject lock = $cyclops_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $kw73$FORWARD);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      } else {
        benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $kw73$FORWARD);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 18485) 
  public static final SubLObject benchmark_cyclops_turn_sibling_rule_backward(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
        {
          SubLObject lock = $cyclops_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $kw33$BACKWARD);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      } else {
        benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $kw33$BACKWARD);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 18760) 
  public static final SubLObject benchmark_cyclops_query_sibling_links_via_lookup(SubLObject k, SubLObject terms, SubLObject sibling, SubLObject mt_2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str69$Asking_sibling_links, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((!(i.numE(ZERO_INTEGER)))) {
                {
                  SubLObject sentence = listS(sibling, Vectors.aref(terms, i), $list70);
                  benchmark_cyclops_query(sentence, mt_2, NIL, list($str74$CycLOPs_error__asking_sibling__S, i));
                }
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 19096) 
  public static final SubLObject benchmark_cyclops_kill_terms(SubLObject k, SubLObject terms) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      utilities_macros.$progress_note$.setDynamicValue($str75$Killing_terms, thread);
      utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
      utilities_macros.$progress_total$.setDynamicValue(k, thread);
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
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
              utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
              utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
              if ((NIL != $cyclops_lockedP$.getDynamicValue(thread))) {
                {
                  SubLObject lock = $cyclops_lock$.getGlobalValue();
                  SubLObject release = NIL;
                  try {
                    release = Locks.seize_lock(lock);
                    cyc_kernel.cyc_kill(Vectors.aref(terms, i));
                  } finally {
                    if ((NIL != release)) {
                      Locks.release_lock(lock);
                    }
                  }
                }
              } else {
                cyc_kernel.cyc_kill(Vectors.aref(terms, i));
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
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 19300) 
  public static final SubLObject benchmark_cyclops_kill_vocabulary(SubLObject mt_1, SubLObject mt_2, SubLObject collections, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject list_var = collections;
        utilities_macros.$progress_note$.setDynamicValue($str76$Killing_collections, thread);
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
              SubLObject col = NIL;
              for (col = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                cyc_kernel.cyc_kill(col);
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
      cyc_kernel.cyc_kill(family);
      cyc_kernel.cyc_kill(sibling);
      cyc_kernel.cyc_kill(ancestor);
      cyc_kernel.cyc_kill(parent);
      cyc_kernel.cyc_kill(mt_2);
      cyc_kernel.cyc_kill(mt_1);
      return NIL;
    }
  }

  @SubL(source = "cycl/system-benchmarks.lisp", position = 19653) 
  public static final SubLObject benchmark_cyclops_print_statistics(SubLObject stream, SubLObject bogomips, SubLObject k, SubLObject guts_time, SubLObject efficiency, SubLObject cyclops) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
          reader.$read_default_float_format$.bind($sym77$DOUBLE_FLOAT, thread);
          PrintLow.format(stream, $str78$__CycLOPs_Benchmark_Results);
          PrintLow.format(stream, $str79$_________________________________);
          PrintLow.format(stream, $str80$__System__S__S_KB__S, new SubLObject[] {obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded()});
          if ((NIL != bogomips)) {
            PrintLow.format(stream, $str81$__Bogomips______S, bogomips);
          }
          PrintLow.format(stream, $str82$__Scaling_factor______S, k);
          PrintLow.format(stream, $str83$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, FOUR_INTEGER));
          PrintLow.format(stream, $str84$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, FOUR_INTEGER));
          PrintLow.format(stream, $str85$__CycLOPs______S, number_utilities.significant_digits(cyclops, FOUR_INTEGER));
          if ((NIL != bogomips)) {
            PrintLow.format(stream, $str86$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(Numbers.divide(bogomips, cyclops), FOUR_INTEGER));
          }
          streams_high.terpri(stream);
          streams_high.force_output(stream);
        } finally {
          reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
      }
      return stream;
    }
  }

  public static final SubLObject declare_system_benchmarks_file() {
    declareFunction(myName, "benchmark_cyclops_compensating_for_paging", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false);
    declareFunction(myName, "benchmark_cyclops_n_times", "BENCHMARK-CYCLOPS-N-TIMES", 1, 3, false);
    declareFunction(myName, "benchmark_cyclops", "BENCHMARK-CYCLOPS", 0, 2, false);
    declareFunction(myName, "median_cyclops", "MEDIAN-CYCLOPS", 1, 3, false);
    declareFunction(myName, "max_cyclops", "MAX-CYCLOPS", 1, 3, false);
    declareFunction(myName, "benchmark_cyclops_setup_and_teardown", "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN", 0, 0, false);
    declareFunction(myName, "benchmark_cyclops_setup", "BENCHMARK-CYCLOPS-SETUP", 0, 0, false);
    declareFunction(myName, "benchmark_cyclops_guts", "BENCHMARK-CYCLOPS-GUTS", 8, 0, false);
    declareFunction(myName, "benchmark_cyclops_guts_int", "BENCHMARK-CYCLOPS-GUTS-INT", 9, 0, false);
    declareFunction(myName, "benchmark_cyclops_teardown", "BENCHMARK-CYCLOPS-TEARDOWN", 7, 0, false);
    declareFunction(myName, "benchmark_cyclops_compute_and_print_statistics", "BENCHMARK-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 3, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_mts", "BENCHMARK-CYCLOPS-CREATE-MTS", 0, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_ontology", "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY", 0, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_parent", "BENCHMARK-CYCLOPS-CREATE-PARENT", 1, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_ancestor", "BENCHMARK-CYCLOPS-CREATE-ANCESTOR", 1, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_sibling", "BENCHMARK-CYCLOPS-CREATE-SIBLING", 1, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_family", "BENCHMARK-CYCLOPS-CREATE-FAMILY", 1, 0, false);
    declareFunction(myName, "benchmark_cyclops_define_predicates", "BENCHMARK-CYCLOPS-DEFINE-PREDICATES", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_assert_sibling_rule", "BENCHMARK-CYCLOPS-ASSERT-SIBLING-RULE", 5, 0, false);
    declareMacro(myName, "with_cyclops_lock", "WITH-CYCLOPS-LOCK");
    declareFunction(myName, "benchmark_cyclops_create_terms", "BENCHMARK-CYCLOPS-CREATE-TERMS", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_create_term", "BENCHMARK-CYCLOPS-CREATE-TERM", 2, 0, false);
    declareFunction(myName, "benchmark_cyclops_assert_family_links", "BENCHMARK-CYCLOPS-ASSERT-FAMILY-LINKS", 5, 0, false);
    declareFunction(myName, "benchmark_cyclops_assert_parent_links", "BENCHMARK-CYCLOPS-ASSERT-PARENT-LINKS", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_query", "BENCHMARK-CYCLOPS-QUERY", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_query_parent_links", "BENCHMARK-CYCLOPS-QUERY-PARENT-LINKS", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_query_ancestor_links", "BENCHMARK-CYCLOPS-QUERY-ANCESTOR-LINKS", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_query_sibling_links_via_rule", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-RULE", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_forward_propagate_sibling_rule", "BENCHMARK-CYCLOPS-FORWARD-PROPAGATE-SIBLING-RULE", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_turn_sibling_rule_backward", "BENCHMARK-CYCLOPS-TURN-SIBLING-RULE-BACKWARD", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_query_sibling_links_via_lookup", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-LOOKUP", 4, 0, false);
    declareFunction(myName, "benchmark_cyclops_kill_terms", "BENCHMARK-CYCLOPS-KILL-TERMS", 2, 0, false);
    declareFunction(myName, "benchmark_cyclops_kill_vocabulary", "BENCHMARK-CYCLOPS-KILL-VOCABULARY", 7, 0, false);
    declareFunction(myName, "benchmark_cyclops_print_statistics", "BENCHMARK-CYCLOPS-PRINT-STATISTICS", 6, 0, false);
    declareFunction(myName, "benchmark_cyclops_print_statistical_summary", "BENCHMARK-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 2, 0, false);
    declareFunction(myName, "benchmark_parallel_cyclops_compensating_for_paging", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false);
    declareFunction(myName, "benchmark_parallel_cyclops_efficiency", "BENCHMARK-PARALLEL-CYCLOPS-EFFICIENCY", 1, 3, false);
    declareFunction(myName, "median_parallel_cyclops", "MEDIAN-PARALLEL-CYCLOPS", 2, 3, false);
    declareFunction(myName, "benchmark_parallel_cyclops_n_times", "BENCHMARK-PARALLEL-CYCLOPS-N-TIMES", 2, 3, false);
    declareFunction(myName, "benchmark_parallel_cyclops_guts", "BENCHMARK-PARALLEL-CYCLOPS-GUTS", 9, 0, false);
    declareFunction(myName, "benchmark_parallel_cyclops_guts_thread", "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD", 10, 0, false);
    declareFunction(myName, "benchmark_parallel_cyclops_compute_and_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 4, 0, false);
    declareFunction(myName, "benchmark_parallel_cyclops_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICS", 7, 0, false);
    declareFunction(myName, "benchmark_parallel_cyclops_print_statistical_summary", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 3, 0, false);
    declareFunction(myName, "benchmark_cyclops_sample", "BENCHMARK-CYCLOPS-SAMPLE", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_system_benchmarks_file() {
    $cyclops_family_fix_enabledP$ = defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL);
    $cyclops_anect_fix_enabledP$ = defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", T);
    $benchmark_cyclops_power$ = defvar("*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER);
    $benchmark_cyclops_ontology_root$ = defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $const0$Individual);
    $cyclops_throwaway_default$ = deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", $int1$33);
    $cyclops_lockedP$ = defparameter("*CYCLOPS-LOCKED?*", NIL);
    $cyclops_lock$ = deflexical("*CYCLOPS-LOCK*", ((NIL != Symbols.boundp($sym47$_CYCLOPS_LOCK_)) ? ((SubLObject) $cyclops_lock$.getGlobalValue()) : Locks.make_lock($str48$CycLOPs_lock)));
    return NIL;
  }

  public static final SubLObject setup_system_benchmarks_file() {
    // CVS_ID("Id: system-benchmarks.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_external_symbol($sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
    subl_macro_promotions.declare_defglobal($sym47$_CYCLOPS_LOCK_);
    access_macros.register_external_symbol($sym98$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING);
    access_macros.define_obsolete_register($sym108$BENCHMARK_CYCLOPS_SAMPLE, $list109);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));
  public static final SubLInteger $int1$33 = makeInteger(33);
  public static final SubLSymbol $sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING");
  public static final SubLSymbol $sym3$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $kw4$NONE = makeKeyword("NONE");
  public static final SubLSymbol $sym5$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLString $str6$Mt_1 = makeString("Mt-1");
  public static final SubLString $str7$Mt_2 = makeString("Mt-2");
  public static final SubLObject $const8$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("Microtheory")));
  public static final SubLObject $const10$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLList $list11 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));
  public static final SubLObject $const12$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLString $str13$Creating_collection_ontology = makeString("Creating collection ontology");
  public static final SubLInteger $int14$25 = makeInteger(25);
  public static final SubLString $str15$Col_ = makeString("Col-");
  public static final SubLList $list16 = list(constant_handles.reader_make_constant_shell(makeString("Collection")));
  public static final SubLObject $const17$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLString $str18$parent = makeString("parent");
  public static final SubLList $list19 = list(constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate")));
  public static final SubLList $list20 = list(constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")));
  public static final SubLObject $const21$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const22$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLString $str23$ancestor = makeString("ancestor");
  public static final SubLList $list24 = list(constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")));
  public static final SubLList $list25 = list(constant_handles.reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate")));
  public static final SubLList $list26 = list(constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate")));
  public static final SubLString $str27$sibling = makeString("sibling");
  public static final SubLList $list28 = list(constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate")));
  public static final SubLString $str29$family = makeString("family");
  public static final SubLList $list30 = list(constant_handles.reader_make_constant_shell(makeString("BinaryPredicate")));
  public static final SubLList $list31 = list(constant_handles.reader_make_constant_shell(makeString("Integer")));
  public static final SubLObject $const32$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw33$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw34$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw35$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLSymbol $kw36$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLObject $const37$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLObject $const38$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLList $list39 = list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));
  public static final SubLSymbol $sym40$_PARENT = makeSymbol("?PARENT");
  public static final SubLList $list41 = list(makeSymbol("?CHILD-1"), makeSymbol("?PARENT"));
  public static final SubLList $list42 = list(makeSymbol("?CHILD-2"), makeSymbol("?PARENT"));
  public static final SubLList $list43 = list(makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));
  public static final SubLObject $const44$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLSymbol $sym45$_CHILD_1 = makeSymbol("?CHILD-1");
  public static final SubLSymbol $sym46$_CHILD_2 = makeSymbol("?CHILD-2");
  public static final SubLSymbol $sym47$_CYCLOPS_LOCK_ = makeSymbol("*CYCLOPS-LOCK*");
  public static final SubLString $str48$CycLOPs_lock = makeString("CycLOPs lock");
  public static final SubLSymbol $sym49$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym50$_CYCLOPS_LOCKED__ = makeSymbol("*CYCLOPS-LOCKED?*");
  public static final SubLSymbol $sym51$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list52 = list(makeSymbol("*CYCLOPS-LOCK*"));
  public static final SubLSymbol $sym53$PROGN = makeSymbol("PROGN");
  public static final SubLString $str54$Creating_terms = makeString("Creating terms");
  public static final SubLList $list55 = list(constant_handles.reader_make_constant_shell(makeString("Individual")));
  public static final SubLSymbol $sym56$VECTOR = makeSymbol("VECTOR");
  public static final SubLString $str57$Term_ = makeString("Term-");
  public static final SubLString $str58$_ = makeString("-");
  public static final SubLString $str59$Asserting_family_links = makeString("Asserting family links");
  public static final SubLString $str60$Asserting_parent_links = makeString("Asserting parent links");
  public static final SubLSymbol $sym61$WARN = makeSymbol("WARN");
  public static final SubLSymbol $sym62$ERROR = makeSymbol("ERROR");
  public static final SubLString $str63$Asking_parent_links = makeString("Asking parent links");
  public static final SubLList $list64 = list(makeSymbol("?PARENT"));
  public static final SubLString $str65$CycLOPs_error_asking_parent__S = makeString("CycLOPs error asking parent ~S");
  public static final SubLString $str66$Asking_ancestor_links = makeString("Asking ancestor links");
  public static final SubLList $list67 = list(makeSymbol("?ANCEST"));
  public static final SubLString $str68$CycLOPs_error__asking_ancestor__S = makeString("CycLOPs error: asking ancestor ~S");
  public static final SubLString $str69$Asking_sibling_links = makeString("Asking sibling links");
  public static final SubLList $list70 = list(makeSymbol("?SIBLING"));
  public static final SubLList $list71 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);
  public static final SubLString $str72$CycLOPs_error__asking_sibling__S_ = makeString("CycLOPs error: asking sibling ~S via rule");
  public static final SubLSymbol $kw73$FORWARD = makeKeyword("FORWARD");
  public static final SubLString $str74$CycLOPs_error__asking_sibling__S = makeString("CycLOPs error: asking sibling ~S");
  public static final SubLString $str75$Killing_terms = makeString("Killing terms");
  public static final SubLString $str76$Killing_collections = makeString("Killing collections");
  public static final SubLSymbol $sym77$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str78$__CycLOPs_Benchmark_Results = makeString("~%CycLOPs Benchmark Results");
  public static final SubLString $str79$_________________________________ = makeString("~%========================================");
  public static final SubLString $str80$__System__S__S_KB__S = makeString("~%System ~S.~S KB ~S");
  public static final SubLString $str81$__Bogomips______S = makeString("~%Bogomips :~% ~S");
  public static final SubLString $str82$__Scaling_factor______S = makeString("~%Scaling factor :~% ~S");
  public static final SubLString $str83$__Elapsed_time__seconds_______S = makeString("~%Elapsed time (seconds) :~% ~S");
  public static final SubLString $str84$__Efficiency__seconds_op_______S = makeString("~%Efficiency (seconds/op) :~% ~S");
  public static final SubLString $str85$__CycLOPs______S = makeString("~%CycLOPs :~% ~S");
  public static final SubLString $str86$__Bogomips_CycLOPs_______S = makeString("~%Bogomips/CycLOPs : ~% ~S");
  public static final SubLString $str87$__CycLOPs_Benchmark_Statistical_S = makeString("~%CycLOPs Benchmark Statistical Summary");
  public static final SubLString $str88$__Raw_Data______S = makeString("~%Raw Data :~% ~S");
  public static final SubLSymbol $sym89$FOUR_SIGNIFICANT_DIGITS = makeSymbol("FOUR-SIGNIFICANT-DIGITS");
  public static final SubLString $str90$__Sorted_Data______S = makeString("~%Sorted Data :~% ~S");
  public static final SubLSymbol $sym91$_ = makeSymbol("<");
  public static final SubLString $str92$__N______S = makeString("~%N :~% ~S");
  public static final SubLString $str93$__Min______S = makeString("~%Min :~% ~S");
  public static final SubLString $str94$__Max______S = makeString("~%Max :~% ~S");
  public static final SubLString $str95$__Median______S = makeString("~%Median :~% ~S");
  public static final SubLString $str96$__Mean______S = makeString("~%Mean :~% ~S");
  public static final SubLString $str97$__Standard_Deviation______S = makeString("~%Standard Deviation :~% ~S");
  public static final SubLSymbol $sym98$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING");
  public static final SubLString $str99$___S____S = makeString("~%~S = ~S");
  public static final SubLString $str100$__eff____S = makeString("  eff = ~S");
  public static final SubLSymbol $sym101$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLString $str102$Parallel_CycLOPs = makeString("Parallel CycLOPs");
  public static final SubLString $str103$Parallel_CycLOPs_thread_ = makeString("Parallel CycLOPs thread ");
  public static final SubLSymbol $sym104$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD = makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD");
  public static final SubLString $str105$__Parallel_CycLOPs_Benchmark_Resu = makeString("~%Parallel CycLOPs Benchmark Results");
  public static final SubLString $str106$__Parallelism_________S = makeString("~%Parallelism    :~% ~S");
  public static final SubLString $str107$__Parallel_CycLOPs_Benchmark_Stat = makeString("~%Parallel CycLOPs Benchmark Statistical Summary");
  public static final SubLSymbol $sym108$BENCHMARK_CYCLOPS_SAMPLE = makeSymbol("BENCHMARK-CYCLOPS-SAMPLE");
  public static final SubLList $list109 = list(makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));

  //// Initializers

  public void declareFunctions() {
    declare_system_benchmarks_file();
  }

  public void initializeVariables() {
    init_system_benchmarks_file();
  }

  public void runTopLevelForms() {
    setup_system_benchmarks_file();
  }

}
