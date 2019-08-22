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

package com.cyc.cycjava_1.cycl.inference;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.arete;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cfasl_utilities;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hl_storage_modules;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.kbq_query_run;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.special_variable_state;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;
//dm import com.cyc.cycjava_1.cycl.wff;

public  final class leviathan extends SubLTranslatedFile {

  //// Constructor

  private leviathan() {}
  public static final SubLFile me = new leviathan();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.leviathan";

  //// Definitions

  @SubL(source = "cycl/inference/leviathan.lisp", position = 867) 
  private static SubLSymbol $leviathan_directory$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 948) 
  private static SubLSymbol $leviathan_experiment_directory$ = null;

  /** A set of experiment analysis and comparison metrics that's large enough to
be useful but small enough to be manageable. */
  @SubL(source = "cycl/inference/leviathan.lisp", position = 1168) 
  private static SubLSymbol $standard_leviathan_query_metrics$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 2350) 
  public static SubLSymbol $leviathan_outlier_timeout$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 5495) 
  private static SubLSymbol $cached_load_all_haystacks_caching_state$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 6591) 
  private static SubLSymbol $cached_load_all_instantiated_haystacks_caching_state$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 8942) 
  private static SubLSymbol $cached_load_all_crippled_haystacks_caching_state$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 28445) 
  private static SubLSymbol $sorted_rule_analyses$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 35595) 
  private static SubLSymbol $rule_bindings_wff_table$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 36324) 
  public static SubLSymbol $rule_bindings_to_closed_wff_pruning_enabledP$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 36401) 
  public static final SubLObject rule_bindings_wff_cachedP(SubLObject rule, SubLObject transformation_bindings, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $rule_bindings_wff_table$.getGlobalValue())) {
        {
          SubLObject v_set = Hashtables.gethash_without_values(rule, $rule_bindings_wff_table$.getGlobalValue(), UNPROVIDED);
          if ((NIL != v_set)) {
            {
              SubLObject rule_bindings_to_closed = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36438");
              if ((NIL != set.set_memberP(cons(mt, rule_bindings_to_closed), v_set))) {
                if ((NIL != $rule_bindings_to_closed_wff_pruning_enabledP$.getDynamicValue(thread))) {
                  return NIL;
                }
              }
            }
          }
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/inference/leviathan.lisp", position = 39409) 
  public static SubLSymbol $maintain_problem_creation_timesP$ = null;

  /** @todo lock this or bind it or make it an inference slot or something */
  @SubL(source = "cycl/inference/leviathan.lisp", position = 39502) 
  private static SubLSymbol $problem_creation_times$ = null;

  @SubL(source = "cycl/inference/leviathan.lisp", position = 39728) 
  public static final SubLObject note_new_problem_created() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != $maintain_problem_creation_timesP$.getDynamicValue(thread))) {
          result = Time.get_internal_real_time();
          $problem_creation_times$.setGlobalValue(cons(result, $problem_creation_times$.getGlobalValue()));
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/leviathan.lisp", position = 53607) 
  private static SubLSymbol $leviathan_crtl_internal_time_units_per_second$ = null;

  public static final SubLObject declare_leviathan_file() {
    //declareFunction("basic_leviathan_query_metrics", "BASIC-LEVIATHAN-QUERY-METRICS", 0, 0, false);
    //declareFunction("standard_leviathan_query_metrics", "STANDARD-LEVIATHAN-QUERY-METRICS", 0, 0, false);
    //declareFunction("all_leviathan_query_metrics", "ALL-LEVIATHAN-QUERY-METRICS", 0, 0, false);
    //declareFunction("leviathan_experiment_full_filename", "LEVIATHAN-EXPERIMENT-FULL-FILENAME", 1, 1, false);
    //declareMacro("run_leviathan_experiment", "RUN-LEVIATHAN-EXPERIMENT");
    //declareFunction("load_leviathan_experiment", "LOAD-LEVIATHAN-EXPERIMENT", 1, 0, false);
    //declareFunction("save_leviathan_experiment", "SAVE-LEVIATHAN-EXPERIMENT", 2, 0, false);
    //declareFunction("leviathan_kb_content_query_set_run", "LEVIATHAN-KB-CONTENT-QUERY-SET-RUN", 1, 0, false);
    //declareFunction("leviathan_halo_query_set_run", "LEVIATHAN-HALO-QUERY-SET-RUN", 1, 0, false);
    //declareFunction("leviathan_haystack_query_set_run", "LEVIATHAN-HAYSTACK-QUERY-SET-RUN", 1, 0, false);
    //declareFunction("leviathan_kb_content_queryP", "LEVIATHAN-KB-CONTENT-QUERY?", 1, 0, false);
    //declareFunction("leviathan_halo_queryP", "LEVIATHAN-HALO-QUERY?", 1, 0, false);
    //declareFunction("leviathan_haystack_queryP", "LEVIATHAN-HAYSTACK-QUERY?", 1, 0, false);
    //declareFunction("save_haystack", "SAVE-HAYSTACK", 1, 0, false);
    //declareFunction("load_haystack", "LOAD-HAYSTACK", 1, 0, false);
    //declareFunction("load_all_haystacks", "LOAD-ALL-HAYSTACKS", 0, 1, false);
    //declareFunction("clear_cached_load_all_haystacks", "CLEAR-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
    //declareFunction("remove_cached_load_all_haystacks", "REMOVE-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
    //declareFunction("cached_load_all_haystacks_internal", "CACHED-LOAD-ALL-HAYSTACKS-INTERNAL", 0, 0, false);
    //declareFunction("cached_load_all_haystacks", "CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
    //declareFunction("load_all_haystacks_int", "LOAD-ALL-HAYSTACKS-INT", 0, 0, false);
    //declareFunction("show_haystack_statistics", "SHOW-HAYSTACK-STATISTICS", 0, 0, false);
    //declareFunction("load_all_instantiated_haystacks", "LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 1, false);
    //declareFunction("clear_cached_load_all_instantiated_haystacks", "CLEAR-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
    //declareFunction("remove_cached_load_all_instantiated_haystacks", "REMOVE-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
    //declareFunction("cached_load_all_instantiated_haystacks_internal", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL", 0, 0, false);
    //declareFunction("cached_load_all_instantiated_haystacks", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
    //declareFunction("load_all_instantiated_haystacks_int", "LOAD-ALL-INSTANTIATED-HAYSTACKS-INT", 0, 0, false);
    //declareFunction("show_instantiated_haystack_statistics", "SHOW-INSTANTIATED-HAYSTACK-STATISTICS", 0, 0, false);
    //declareFunction("save_good_instantiated_haystack", "SAVE-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false);
    //declareFunction("make_haystacks_good", "MAKE-HAYSTACKS-GOOD", 0, 2, false);
    //declareFunction("load_all_crippled_haystacks", "LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 1, false);
    //declareFunction("clear_cached_load_all_crippled_haystacks", "CLEAR-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
    //declareFunction("remove_cached_load_all_crippled_haystacks", "REMOVE-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
    //declareFunction("cached_load_all_crippled_haystacks_internal", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-INTERNAL", 0, 0, false);
    //declareFunction("cached_load_all_crippled_haystacks", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
    //declareFunction("load_all_crippled_haystacks_int", "LOAD-ALL-CRIPPLED-HAYSTACKS-INT", 0, 0, false);
    //declareFunction("show_crippled_haystack_statistics", "SHOW-CRIPPLED-HAYSTACK-STATISTICS", 0, 0, false);
    //declareFunction("make_haystacks_crippled", "MAKE-HAYSTACKS-CRIPPLED", 0, 2, false);
    //declareFunction("reify_all_haystacks", "REIFY-ALL-HAYSTACKS", 0, 0, false);
    //declareFunction("reify_all_instantiated_haystacks", "REIFY-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
    //declareFunction("reify_all_crippled_haystacks", "REIFY-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
    //declareFunction("reify_haystack", "REIFY-HAYSTACK", 2, 0, false);
    //declareFunction("haystack_constant_name_from_filename", "HAYSTACK-CONSTANT-NAME-FROM-FILENAME", 1, 0, false);
    //declareFunction("haystack_id_string_from_filename", "HAYSTACK-ID-STRING-FROM-FILENAME", 1, 0, false);
    //declareFunction("haystack_id_string_from_query", "HAYSTACK-ID-STRING-FROM-QUERY", 1, 0, false);
    //declareFunction("haystack_size_from_query", "HAYSTACK-SIZE-FROM-QUERY", 1, 0, false);
    //declareFunction("haystack_filename_from_query", "HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
    //declareFunction("instantiated_haystack_filename_from_query", "INSTANTIATED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
    //declareFunction("crippled_haystack_filename_from_query", "CRIPPLED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
    //declareFunction("remove_haystack_files", "REMOVE-HAYSTACK-FILES", 1, 0, false);
    //declareFunction("remove_all_duplicate_haystack_files", "REMOVE-ALL-DUPLICATE-HAYSTACK-FILES", 0, 1, false);
    //declareFunction("remove_duplicate_haystack_files_int", "REMOVE-DUPLICATE-HAYSTACK-FILES-INT", 2, 0, false);
    //declareFunction("kill_duplicate_and_broken_reified_haystacks", "KILL-DUPLICATE-AND-BROKEN-REIFIED-HAYSTACKS", 0, 1, false);
    //declareFunction("finalize_haystack_corpus", "FINALIZE-HAYSTACK-CORPUS", 0, 0, false);
    //declareFunction("initialize_kb_content_leviathan_queries", "INITIALIZE-KB-CONTENT-LEVIATHAN-QUERIES", 0, 0, false);
    //declareFunction("determine_leviathan_training_and_blind_sets", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS", 0, 0, false);
    //declareFunction("determine_leviathan_training_and_blind_sets_int", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS-INT", 3, 0, false);
    //declareFunction("unassert_assertion", "UNASSERT-ASSERTION", 1, 0, false);
    //declareFunction("unassert_assertion_via_cyc", "UNASSERT-ASSERTION-VIA-CYC", 1, 0, false);
    //declareFunction("unassert_assertion_via_hl", "UNASSERT-ASSERTION-VIA-HL", 1, 0, false);
    //declareFunction("unassert_assertion_via_tms", "UNASSERT-ASSERTION-VIA-TMS", 1, 0, false);
    //declareFunction("assert_allowed_rules_for_justified_queries", "ASSERT-ALLOWED-RULES-FOR-JUSTIFIED-QUERIES", 0, 1, false);
    //declareFunction("allowed_rules_utilities", "ALLOWED-RULES-UTILITIES", 0, 0, false);
    //declareFunction("allowed_rules_sorted_utility_tuples", "ALLOWED-RULES-SORTED-UTILITY-TUPLES", 0, 0, false);
    //declareFunction("skolem_ruleP", "SKOLEM-RULE?", 1, 0, false);
    //declareFunction("all_skolem_rules", "ALL-SKOLEM-RULES", 0, 0, false);
    //declareFunction("negative_utility_skolem_rules", "NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
    //declareFunction("sorted_rule_utilities", "SORTED-RULE-UTILITIES", 1, 0, false);
    //declareFunction("rule_utility_tuples", "RULE-UTILITY-TUPLES", 1, 0, false);
    //declareFunction("rule_consideration_tuples", "RULE-CONSIDERATION-TUPLES", 1, 0, false);
    //declareFunction("rule_success_tuples", "RULE-SUCCESS-TUPLES", 1, 0, false);
    //declareFunction("skolem_rules_used_in_justified_queries", "SKOLEM-RULES-USED-IN-JUSTIFIED-QUERIES", 0, 1, false);
    //declareFunction("skolem_allowed_rules", "SKOLEM-ALLOWED-RULES", 0, 0, false);
    //declareFunction("kill_all_skolem_rules", "KILL-ALL-SKOLEM-RULES", 0, 0, false);
    //declareFunction("kill_all_negative_utility_skolem_rules", "KILL-ALL-NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
    //declareFunction("inert_rules", "INERT-RULES", 0, 0, false);
    //declareFunction("inert_ruleP", "INERT-RULE?", 1, 0, false);
    //declareFunction("assertion_has_non_skolem_assertion_dependentsP", "ASSERTION-HAS-NON-SKOLEM-ASSERTION-DEPENDENTS?", 1, 0, false);
    //declareFunction("kill_all_inert_rules", "KILL-ALL-INERT-RULES", 0, 0, false);
    //declareFunction("rules_that_totally_suck", "RULES-THAT-TOTALLY-SUCK", 0, 0, false);
    //declareFunction("kill_all_rules_that_totally_suck", "KILL-ALL-RULES-THAT-TOTALLY-SUCK", 0, 0, false);
    //declareFunction("never_successful_ruleP", "NEVER-SUCCESSFUL-RULE?", 1, 0, false);
    //declareFunction("successful_ruleP", "SUCCESSFUL-RULE?", 1, 0, false);
    //declareFunction("never_considered_ruleP", "NEVER-CONSIDERED-RULE?", 1, 0, false);
    //declareFunction("considered_ruleP", "CONSIDERED-RULE?", 1, 0, false);
    //declareFunction("considered_but_not_successful_ruleP", "CONSIDERED-BUT-NOT-SUCCESSFUL-RULE?", 1, 0, false);
    //declareFunction("leviathan_rule_statistics", "LEVIATHAN-RULE-STATISTICS", 1, 0, false);
    //declareFunction("rule_analysis_L", "RULE-ANALYSIS-<", 2, 0, false);
    //declareFunction("leviathan_rule_statistics_int", "LEVIATHAN-RULE-STATISTICS-INT", 6, 0, false);
    //declareFunction("leviathan_allowed_rules", "LEVIATHAN-ALLOWED-RULES", 0, 0, false);
    //declareFunction("leviathan_kb_content_allowed_rules", "LEVIATHAN-KB-CONTENT-ALLOWED-RULES", 0, 0, false);
    //declareFunction("leviathan_haystack_allowed_rules", "LEVIATHAN-HAYSTACK-ALLOWED-RULES", 0, 0, false);
    //declareFunction("leviathan_haystack_all_allowed_rules", "LEVIATHAN-HAYSTACK-ALL-ALLOWED-RULES", 0, 0, false);
    //declareFunction("conditional_queries", "CONDITIONAL-QUERIES", 0, 0, false);
    //declareFunction("queries_that_probably_ought_to_be_conditional", "QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
    //declareFunction("fix_queries_that_probably_ought_to_be_conditional", "FIX-QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
    //declareFunction("rule_bindings_to_closed_summary", "RULE-BINDINGS-TO-CLOSED-SUMMARY", 0, 1, false);
    //declareFunction("rule_bindings_wffP", "RULE-BINDINGS-WFF?", 3, 0, false);
    //declareFunction("rule_bindings_wff_analysis", "RULE-BINDINGS-WFF-ANALYSIS", 0, 1, false);
    //declareFunction("initialize_rule_bindings_wff_table", "INITIALIZE-RULE-BINDINGS-WFF-TABLE", 0, 1, false);
    declareFunction("rule_bindings_wff_cachedP", "RULE-BINDINGS-WFF-CACHED?", 3, 0, false);
    //declareFunction("leviathan_generate_answerable_vs_unanswerable_comparison", "LEVIATHAN-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 0, false);
    //declareFunction("generate_all_leviathan_answerable_vs_unanswerable_comparisons", "GENERATE-ALL-LEVIATHAN-ANSWERABLE-VS-UNANSWERABLE-COMPARISONS", 1, 0, false);
    //declareFunction("leviathan_answerability_data", "LEVIATHAN-ANSWERABILITY-DATA", 1, 1, false);
    //declareFunction("leviathan_generate_answerability_prediction_graph", "LEVIATHAN-GENERATE-ANSWERABILITY-PREDICTION-GRAPH", 3, 0, false);
    //declareFunction("generate_all_leviathan_answerability_prediction_graphs", "GENERATE-ALL-LEVIATHAN-ANSWERABILITY-PREDICTION-GRAPHS", 2, 0, false);
    //declareFunction("leviathan_win_at_solitaire", "LEVIATHAN-WIN-AT-SOLITAIRE", 2, 0, false);
    //declareFunction("clear_problem_creation_times", "CLEAR-PROBLEM-CREATION-TIMES", 0, 0, false);
    declareFunction("note_new_problem_created", "NOTE-NEW-PROBLEM-CREATED", 0, 0, false);
    //declareFunction("historical_problem_creation_times", "HISTORICAL-PROBLEM-CREATION-TIMES", 0, 0, false);
    //declareFunction("initialize_halo_leviathan_queries", "INITIALIZE-HALO-LEVIATHAN-QUERIES", 0, 0, false);
    //declareFunction("analyze_leviathan_experiment", "ANALYZE-LEVIATHAN-EXPERIMENT", 1, 4, false);
    //declareFunction("analyze_leviathan_experiments", "ANALYZE-LEVIATHAN-EXPERIMENTS", 2, 5, false);
    //declareFunction("leviathan_generate_sorted_property_comparison", "LEVIATHAN-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
    //declareFunction("leviathan_generate_sorted_property_display", "LEVIATHAN-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false);
    //declareFunction("ylabel_for_property", "YLABEL-FOR-PROPERTY", 1, 0, false);
    //declareFunction("problem_query_relational_complexity_analysis", "PROBLEM-QUERY-RELATIONAL-COMPLEXITY-ANALYSIS", 0, 1, false);
    //declareFunction("problem_query_fort_analysis", "PROBLEM-QUERY-FORT-ANALYSIS", 0, 1, false);
    //declareFunction("elapsed_crtl_internal_real_time_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false);
    //declareFunction("elapsed_crtl_internal_real_times_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIMES-TO-ELAPSED-SECONDS", 1, 0, false);
    //declareFunction("compute_n_way_parallelism_total_time", "COMPUTE-N-WAY-PARALLELISM-TOTAL-TIME", 2, 0, false);
    //declareFunction("compute_n_way_parallelism_time_to_first_answer", "COMPUTE-N-WAY-PARALLELISM-TIME-TO-FIRST-ANSWER", 2, 0, false);
    //declareFunction("compute_n_way_parallelism_times", "COMPUTE-N-WAY-PARALLELISM-TIMES", 2, 0, false);
    //declareFunction("earliest_free_processor_number", "EARLIEST-FREE-PROCESSOR-NUMBER", 1, 0, false);
    //declareFunction("new_root_first_answer_times", "NEW-ROOT-FIRST-ANSWER-TIMES", 1, 0, false);
    //declareFunction("generate_new_root_first_answer_times_graph", "GENERATE-NEW-ROOT-FIRST-ANSWER-TIMES-GRAPH", 1, 1, false);
    //declareFunction("new_root_total_times", "NEW-ROOT-TOTAL-TIMES", 1, 0, false);
    //declareFunction("generate_new_root_total_times_graph", "GENERATE-NEW-ROOT-TOTAL-TIMES-GRAPH", 1, 1, false);
    //declareFunction("haystack_transformation_fanout_estimate", "HAYSTACK-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
    //declareFunction("inference_transformation_fanout_estimate", "INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
    //declareFunction("problem_standard_transformation_fanout", "PROBLEM-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
    //declareFunction("literal_standard_transformation_fanout", "LITERAL-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
    //declareFunction("inference_top_level_removal_fanout", "INFERENCE-TOP-LEVEL-REMOVAL-FANOUT", 1, 0, false);
    //declareFunction("balanced_strategy_root_initial_removal_fanout", "BALANCED-STRATEGY-ROOT-INITIAL-REMOVAL-FANOUT", 2, 0, false);
    //declareFunction("inference_new_root_initial_removal_fanouts", "INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_leviathan_file() {
    $leviathan_directory$ = deflexical("*LEVIATHAN-DIRECTORY*", $str0$_cyc_projects_inference_leviathan);
    $leviathan_experiment_directory$ = deflexical("*LEVIATHAN-EXPERIMENT-DIRECTORY*", Sequences.cconcatenate($leviathan_directory$.getGlobalValue(), $str1$experiments_));
    $standard_leviathan_query_metrics$ = deflexical("*STANDARD-LEVIATHAN-QUERY-METRICS*", $list3);
    $leviathan_outlier_timeout$ = deflexical("*LEVIATHAN-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
    $cached_load_all_haystacks_caching_state$ = deflexical("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*", NIL);
    $cached_load_all_instantiated_haystacks_caching_state$ = deflexical("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*", NIL);
    $cached_load_all_crippled_haystacks_caching_state$ = deflexical("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*", NIL);
    $sorted_rule_analyses$ = deflexical("*SORTED-RULE-ANALYSES*", $list123);
    $rule_bindings_wff_table$ = deflexical("*RULE-BINDINGS-WFF-TABLE*", maybeDefault( $sym147$_RULE_BINDINGS_WFF_TABLE_, $rule_bindings_wff_table$, NIL));
    $rule_bindings_to_closed_wff_pruning_enabledP$ = defparameter("*RULE-BINDINGS-TO-CLOSED-WFF-PRUNING-ENABLED?*", NIL);
    $maintain_problem_creation_timesP$ = defparameter("*MAINTAIN-PROBLEM-CREATION-TIMES?*", NIL);
    $problem_creation_times$ = deflexical("*PROBLEM-CREATION-TIMES*", maybeDefault( $sym156$_PROBLEM_CREATION_TIMES_, $problem_creation_times$, NIL));
    $leviathan_crtl_internal_time_units_per_second$ = deflexical("*LEVIATHAN-CRTL-INTERNAL-TIME-UNITS-PER-SECOND*", $int220$1000000);
    return NIL;
  }

  public static final SubLObject setup_leviathan_file() {
        memoization_state.note_globally_cached_function($sym33$CACHED_LOAD_ALL_HAYSTACKS);
    memoization_state.note_globally_cached_function($sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS);
    memoization_state.note_globally_cached_function($sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS);
    subl_macro_promotions.declare_defglobal($sym147$_RULE_BINDINGS_WFF_TABLE_);
    subl_macro_promotions.declare_defglobal($sym156$_PROBLEM_CREATION_TIMES_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_cyc_projects_inference_leviathan = makeString("/cyc/projects/inference/leviathan/");
  public static final SubLString $str1$experiments_ = makeString("experiments/");
  public static final SubLSymbol $kw2$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("TACTIC-COUNT"), makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"), makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("NEW-ROOT-COUNT")});
  public static final SubLList $list4 = list(makeKeyword("PROBLEM-QUERIES"), makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"));
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-LEVIATHAN-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*"))), list(makeSymbol("INCREMENTAL"), T), list(makeSymbol("INCLUDE-RESULTS"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*LEVIATHAN-EXPERIMENT-DIRECTORY*"))});
  public static final SubLList $list6 = list(new SubLObject[] {makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY")});
  public static final SubLSymbol $kw7$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw8$QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");
  public static final SubLSymbol $kw9$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw10$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw11$OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
  public static final SubLSymbol $kw12$METRICS = makeKeyword("METRICS");
  public static final SubLList $list13 = list(makeSymbol("ALL-LEVIATHAN-QUERY-METRICS"));
  public static final SubLSymbol $kw14$OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
  public static final SubLSymbol $sym15$_LEVIATHAN_OUTLIER_TIMEOUT_ = makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*");
  public static final SubLSymbol $kw16$INCREMENTAL = makeKeyword("INCREMENTAL");
  public static final SubLSymbol $kw17$INCLUDE_RESULTS = makeKeyword("INCLUDE-RESULTS");
  public static final SubLSymbol $kw18$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw19$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw20$DIRECTORY = makeKeyword("DIRECTORY");
  public static final SubLSymbol $sym21$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym22$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");
  public static final SubLSymbol $sym23$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym24$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym25$LEVIATHAN_EXPERIMENT_FULL_FILENAME = makeSymbol("LEVIATHAN-EXPERIMENT-FULL-FILENAME");
  public static final SubLSymbol $sym26$RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");
  public static final SubLObject $const27$KBContentLeviathanQuery = constant_handles.reader_make_constant_shell(makeString("KBContentLeviathanQuery"));
  public static final SubLObject $const28$HALOLeviathanQuery = constant_handles.reader_make_constant_shell(makeString("HALOLeviathanQuery"));
  public static final SubLObject $const29$AutogeneratedLeviathanQuery = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery"));
  public static final SubLString $str30$data_haystacks_ = makeString("data/haystacks/");
  public static final SubLString $str31$_haystack_ = makeString("-haystack-");
  public static final SubLString $str32$_cfasl = makeString(".cfasl");
  public static final SubLSymbol $sym33$CACHED_LOAD_ALL_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-HAYSTACKS");
  public static final SubLSymbol $sym34$_CACHED_LOAD_ALL_HAYSTACKS_CACHING_STATE_ = makeSymbol("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*");
  public static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym36$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLString $str37$Loading_all_haystacks = makeString("Loading all haystacks");
  public static final SubLSymbol $sym38$_ = makeSymbol("<");
  public static final SubLSymbol $sym39$HAYSTACK_SIZE = makeSymbol("HAYSTACK-SIZE");
  public static final SubLString $str40$____Total_haystacks_ = makeString("~%~%Total haystacks:");
  public static final SubLString $str41$____Interesting_haystacks_ = makeString("~%~%Interesting haystacks:");
  public static final SubLSymbol $sym42$INTERESTING_HAYSTACK_P = makeSymbol("INTERESTING-HAYSTACK-P");
  public static final SubLSymbol $sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS");
  public static final SubLSymbol $sym44$_CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS_CACHING_STATE_ = makeSymbol("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*");
  public static final SubLString $str45$data_instantiated_haystacks_ = makeString("data/instantiated-haystacks/");
  public static final SubLString $str46$Loading_all_instantiated_haystack = makeString("Loading all instantiated haystacks");
  public static final SubLString $str47$____Total_instantiated_haystacks_ = makeString("~%~%Total instantiated haystacks: ~a");
  public static final SubLSymbol $sym48$FIX_HAYSTACK_VARIABLES = makeSymbol("FIX-HAYSTACK-VARIABLES");
  public static final SubLString $str49$_a_ = makeString("~a ");
  public static final SubLSymbol $sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS");
  public static final SubLSymbol $sym51$_CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS_CACHING_STATE_ = makeSymbol("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*");
  public static final SubLString $str52$data_crippled_haystacks_ = makeString("data/crippled-haystacks/");
  public static final SubLString $str53$Loading_all_crippled_haystacks = makeString("Loading all crippled haystacks");
  public static final SubLString $str54$____Total_crippled_haystacks___a = makeString("~%~%Total crippled haystacks: ~a");
  public static final SubLString $str55$Reifying_all_instantiated_haystac = makeString("Reifying all instantiated haystacks");
  public static final SubLString $str56$Reifying_all_crippled_haystacks = makeString("Reifying all crippled haystacks");
  public static final SubLObject $const57$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list58 = list(constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled")));
  public static final SubLObject $const59$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLList $list60 = list(constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled")));
  public static final SubLObject $const61$TestVocabularyMt = constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt"));
  public static final SubLObject $const62$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));
  public static final SubLObject $const63$InferenceMaxTransformationStepsPa = constant_handles.reader_make_constant_shell(makeString("InferenceMaxTransformationStepsParameter"));
  public static final SubLList $list64 = list(constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArg")), constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification")), TWO_INTEGER, constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")));
  public static final SubLObject $const65$UniversalVocabularyImplementation = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt"));
  public static final SubLObject $const66$InferenceAllowedRulesParameter = constant_handles.reader_make_constant_shell(makeString("InferenceAllowedRulesParameter"));
  public static final SubLString $str67$LeviathanHaystack_ = makeString("LeviathanHaystack-");
  public static final SubLSymbol $kw68$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLString $str69$Removing_duplicate_haystacks = makeString("Removing duplicate haystacks");
  public static final SubLSymbol $kw70$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym71$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str72$haystacks_20050425_focused = makeString("haystacks-20050425-focused");
  public static final SubLString $str73$haystacks_20050425_exploratory = makeString("haystacks-20050425-exploratory");
  public static final SubLList $list74 = list(constant_handles.reader_make_constant_shell(makeString("AutogeneratedHaystackQuery")));
  public static final SubLObject $const75$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled"));
  public static final SubLString $str76$deep_queries_with_1_backchain = makeString("deep-queries-with-1-backchain");
  public static final SubLList $list77 = list(constant_handles.reader_make_constant_shell(makeString("KBContentLeviathanQuery")));
  public static final SubLObject $const78$KBContentLeviathanQuery_Training = constant_handles.reader_make_constant_shell(makeString("KBContentLeviathanQuery-Training"));
  public static final SubLObject $const79$KBContentLeviathanQuery_Blind = constant_handles.reader_make_constant_shell(makeString("KBContentLeviathanQuery-Blind"));
  public static final SubLObject $const80$HALOLeviathanQuery_Training = constant_handles.reader_make_constant_shell(makeString("HALOLeviathanQuery-Training"));
  public static final SubLObject $const81$HALOLeviathanQuery_Blind = constant_handles.reader_make_constant_shell(makeString("HALOLeviathanQuery-Blind"));
  public static final SubLObject $const82$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled-Training"));
  public static final SubLObject $const83$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled-Blind"));
  public static final SubLObject $const84$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled"));
  public static final SubLObject $const85$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled-Training"));
  public static final SubLObject $const86$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled-Blind"));
  public static final SubLFloat $float87$0_8 = makeDouble(0.8);
  public static final SubLString $str88$Oops__off_by_one_error_in_first_n = makeString("Oops, off by one error in first-n / last-n");
  public static final SubLString $str89$could_not_unassert__a_at_Cyc_laye = makeString("could not unassert ~a at Cyc layer");
  public static final SubLString $str90$could_not_unassert__a_at_HL = makeString("could not unassert ~a at HL");
  public static final SubLString $str91$could_not_unassert__a_via_TMS = makeString("could not unassert ~a via TMS");
  public static final SubLString $str92$kb_content_training_justification = makeString("kb-content-training-justifications-rabbit-hole-20050426");
  public static final SubLString $str93$Asserting_allowed_rules_for_answe = makeString("Asserting allowed rules for answerable queries");
  public static final SubLSymbol $sym94$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLObject $const95$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLObject $const96$LeviathanQuery_Training = constant_handles.reader_make_constant_shell(makeString("LeviathanQuery-Training"));
  public static final SubLSymbol $kw97$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw98$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw99$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw101$ERROR = makeKeyword("ERROR");
  public static final SubLString $str102$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym103$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw104$CERROR = makeKeyword("CERROR");
  public static final SubLString $str105$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw106$WARN = makeKeyword("WARN");
  public static final SubLString $str107$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str108$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list109 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str110$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym111$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");
  public static final SubLString $str112$Gathering_all_skolem_rules = makeString("Gathering all skolem rules");
  public static final SubLSymbol $sym113$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str114$Gathering_all_negative_utility_sk = makeString("Gathering all negative-utility skolem rules");
  public static final SubLSymbol $sym115$TRANSFORMATION_RULE_HISTORICAL_UTILITY = makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");
  public static final SubLSymbol $sym116$TRANSFORMATION_RULE_CONSIDERED_COUNT = makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");
  public static final SubLSymbol $sym117$TRANSFORMATION_RULE_SUCCESS_COUNT = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
  public static final SubLString $str118$cdolist = makeString("cdolist");
  public static final SubLString $str119$mapping_Cyc_rules = makeString("mapping Cyc rules");
  public static final SubLObject $const120$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLSymbol $sym121$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str122$_A = makeString("~A");
  public static final SubLList $list123 = list(new SubLObject[] {makeKeyword("SUCKY-SKOLEM-RULE"), makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE"), makeKeyword("SUCKY-RULE"), makeKeyword("INERT-SKOLEM-RULE"), makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE"), makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE"), makeKeyword("INERT-RULE"), makeKeyword("UNSUCCESSFUL-FORWARD-RULE"), makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS"), makeKeyword("SUCCESSFUL-SKOLEM-RULE"), makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE"), makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE"), makeKeyword("SUCCESSFUL-FORWARD-RULE"), makeKeyword("OTHER")});
  public static final SubLSymbol $kw124$SUCKY_SKOLEM_RULE = makeKeyword("SUCKY-SKOLEM-RULE");
  public static final SubLSymbol $kw125$NEGATIVE_UTILITY_SKOLEM_RULE = makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE");
  public static final SubLSymbol $kw126$INERT_SKOLEM_RULE = makeKeyword("INERT-SKOLEM-RULE");
  public static final SubLSymbol $kw127$SUCCESSFUL_SKOLEM_RULE = makeKeyword("SUCCESSFUL-SKOLEM-RULE");
  public static final SubLSymbol $kw128$NEVER_CONSIDERED_FORWARD_SKOLEM_RULE = makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE");
  public static final SubLSymbol $kw129$NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE = makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE");
  public static final SubLSymbol $kw130$INERT_RULE = makeKeyword("INERT-RULE");
  public static final SubLSymbol $kw131$SUCKY_RULE = makeKeyword("SUCKY-RULE");
  public static final SubLSymbol $kw132$BACKWARD_SUCCESSFUL_FORWARD_RULE = makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE");
  public static final SubLSymbol $kw133$BACKWARD_SUCCESSFUL_BACKWARD_RULE = makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE");
  public static final SubLSymbol $kw134$SUCCESSFUL_FORWARD_RULE = makeKeyword("SUCCESSFUL-FORWARD-RULE");
  public static final SubLSymbol $kw135$UNSUCCESSFUL_FORWARD_RULE = makeKeyword("UNSUCCESSFUL-FORWARD-RULE");
  public static final SubLSymbol $kw136$UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS = makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS");
  public static final SubLSymbol $kw137$OTHER = makeKeyword("OTHER");
  public static final SubLObject $const138$AutogeneratedLeviathanQuery_Train = constant_handles.reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Training"));
  public static final SubLObject $const139$CycLQuerySpecification = constant_handles.reader_make_constant_shell(makeString("CycLQuerySpecification"));
  public static final SubLSymbol $kw140$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLObject $const141$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLObject $const142$InferenceConditionalSentenceParam = constant_handles.reader_make_constant_shell(makeString("InferenceConditionalSentenceParameter"));
  public static final SubLObject $const143$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLString $str144$pre_halo_training_rule_bindings_t = makeString("pre-halo-training-rule-bindings-to-closed-20050506");
  public static final SubLSymbol $kw145$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
  public static final SubLList $list146 = list(makeSymbol("RULE"), makeSymbol("BINDINGS"), makeSymbol("MT"));
  public static final SubLSymbol $sym147$_RULE_BINDINGS_WFF_TABLE_ = makeSymbol("*RULE-BINDINGS-WFF-TABLE*");
  public static final SubLString $str148$_cyc_projects_inference_leviathan = makeString("/cyc/projects/inference/leviathan/data/rule-bindings-to-closed-wff-analysis.cfasl");
  public static final SubLSymbol $kw149$LOGSCALE_Y_ = makeKeyword("LOGSCALE-Y?");
  public static final SubLSymbol $kw150$YLABEL = makeKeyword("YLABEL");
  public static final SubLSymbol $kw151$PLOT_TITLE = makeKeyword("PLOT-TITLE");
  public static final SubLString $str152$Answerable_vs__Unanswerable_ = makeString("Answerable vs. Unanswerable ");
  public static final SubLList $list153 = list(makeSymbol("VALUE"), makeSymbol("EXPERIMENT"));
  public static final SubLSymbol $kw154$TOTAL_ANSWERABLE = makeKeyword("TOTAL-ANSWERABLE");
  public static final SubLString $str155$Oracularly_Answerable_vs__Unanswe = makeString("Oracularly Answerable vs. Unanswerable ");
  public static final SubLSymbol $sym156$_PROBLEM_CREATION_TIMES_ = makeSymbol("*PROBLEM-CREATION-TIMES*");
  public static final SubLString $str157$halo_queries_with_1_backchain_823 = makeString("halo-queries-with-1-backchain-823-0524");
  public static final SubLList $list158 = list(constant_handles.reader_make_constant_shell(makeString("HALOLeviathanQuery")));
  public static final SubLString $str159$Leviathan_Training = makeString("Leviathan Training");
  public static final SubLString $str160$_0 = makeString(":0");
  public static final SubLSymbol $sym161$BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");
  public static final SubLString $str162$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");
  public static final SubLString $str163$____Answerable____ = makeString("~%~%Answerable: ~%");
  public static final SubLString $str164$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");
  public static final SubLString $str165$____KB_Content____ = makeString("~%~%KB Content: ~%");
  public static final SubLString $str166$____Autogenerated____ = makeString("~%~%Autogenerated: ~%");
  public static final SubLString $str167$____HALO____ = makeString("~%~%HALO: ~%");
  public static final SubLString $str168$____Answerable_KB_Content____ = makeString("~%~%Answerable KB Content: ~%");
  public static final SubLString $str169$____Answerable_Autogenerated____ = makeString("~%~%Answerable Autogenerated: ~%");
  public static final SubLString $str170$____Answerable_HALO____ = makeString("~%~%Answerable HALO: ~%");
  public static final SubLString $str171$____Unanswerable_KB_Content____ = makeString("~%~%Unanswerable KB Content: ~%");
  public static final SubLString $str172$____Unanswerable_Autogenerated___ = makeString("~%~%Unanswerable Autogenerated: ~%");
  public static final SubLString $str173$____Unanswerable_HALO____ = makeString("~%~%Unanswerable HALO: ~%");
  public static final SubLString $str174$______of_queries_answerable_in__B = makeString("~%~%# of queries answerable in (BASELINE  BOTH  EXPERIMENT): ~%");
  public static final SubLString $str175$Total___________s__s__s__ = makeString("Total:         ~s ~s ~s~%");
  public static final SubLString $str176$KB_Content______s__s__s__ = makeString("KB Content:    ~s ~s ~s~%");
  public static final SubLString $str177$Autogenerated___s__s__s__ = makeString("Autogenerated: ~s ~s ~s~%");
  public static final SubLString $str178$HALO____________s__s__s__ = makeString("HALO:          ~s ~s ~s~%");
  public static final SubLString $str179$____Key___BASELINE_VALUE__EXPERIM = makeString("~%~%Key: (BASELINE-VALUE  EXPERIMENT-VALUE  RATIO), times are expressed in seconds.~%");
  public static final SubLString $str180$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");
  public static final SubLString $str181$____Mutually_Answerable_KB_Conten = makeString("~%~%Mutually Answerable KB Content: ~%");
  public static final SubLString $str182$____Mutually_Answerable_Autogener = makeString("~%~%Mutually Answerable Autogenerated: ~%");
  public static final SubLString $str183$____Mutually_Answerable_HALO____ = makeString("~%~%Mutually Answerable HALO: ~%");
  public static final SubLSymbol $kw184$BOTH = makeKeyword("BOTH");
  public static final SubLString $str185$Mutually_Answerable_ = makeString("Mutually Answerable ");
  public static final SubLSymbol $kw186$BASELINE = makeKeyword("BASELINE");
  public static final SubLString $str187$__ = makeString(": ");
  public static final SubLString $str188$_vs__ = makeString(" vs. ");
  public static final SubLString $str189$_n = makeString("\\n");
  public static final SubLSymbol $kw190$XLABEL = makeKeyword("XLABEL");
  public static final SubLString $str191$Sorted_Queries = makeString("Sorted Queries");
  public static final SubLSymbol $kw192$BASELINE_KEY_LABEL = makeKeyword("BASELINE-KEY-LABEL");
  public static final SubLSymbol $kw193$EXPERIMENT_KEY_LABEL = makeKeyword("EXPERIMENT-KEY-LABEL");
  public static final SubLList $list194 = list(makeKeyword("KEY-LOCATION"), list(makeInteger(212), makeInteger(100)));
  public static final SubLList $list195 = list(makeSymbol("LEVIATHAN-KB-CONTENT-QUERY?"), makeSymbol("LEVIATHAN-HAYSTACK-QUERY?"), makeSymbol("LEVIATHAN-HALO-QUERY?"));
  public static final SubLString $str196$_ = makeString(" ");
  public static final SubLList $list197 = list(makeKeyword("CLASSIFICATION-LABELS"), list(makeString("KB Content queries"), makeString("Autogenerated queries"), makeString("HALO queries")), makeKeyword("KEY-LOCATION"), list(makeInteger(212), makeInteger(100)));
  public static final SubLString $str198$time = makeString("time");
  public static final SubLString $str199$Time__sec_ = makeString("Time (sec)");
  public static final SubLString $str200$problem = makeString("problem");
  public static final SubLString $str201$__of_problems = makeString("# of problems");
  public static final SubLString $str202$link = makeString("link");
  public static final SubLString $str203$__of_links = makeString("# of links");
  public static final SubLString $str204$tactic = makeString("tactic");
  public static final SubLString $str205$__of_tactics = makeString("# of tactics");
  public static final SubLString $str206$proof = makeString("proof");
  public static final SubLString $str207$__of_proofs = makeString("# of proofs");
  public static final SubLString $str208$answer = makeString("answer");
  public static final SubLString $str209$__of_answers = makeString("# of answers");
  public static final SubLString $str210$byte = makeString("byte");
  public static final SubLString $str211$__of_bytes = makeString("# of bytes");
  public static final SubLString $str212$ = makeString("");
  public static final SubLString $str213$training_823_h_queries_0602 = makeString("training-823-h-queries-0602");
  public static final SubLSymbol $kw214$PROBLEM_QUERIES = makeKeyword("PROBLEM-QUERIES");
  public static final SubLSymbol $kw215$NEG = makeKeyword("NEG");
  public static final SubLList $list216 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw217$POS = makeKeyword("POS");
  public static final SubLSymbol $sym218$_ = makeSymbol(">");
  public static final SubLSymbol $sym219$CDR = makeSymbol("CDR");
  public static final SubLInteger $int220$1000000 = makeInteger(1000000);
  public static final SubLSymbol $sym221$ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS = makeSymbol("ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS");
  public static final SubLSymbol $kw222$NEW_ROOT_RELATIVE_TOTAL_TIMES = makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
  public static final SubLSymbol $kw223$NEW_ROOT_RELATIVE_ANSWER_TIMES = makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
  public static final SubLSymbol $sym224$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $sym225$KBQ_INTERNAL_REAL_TIME_TO_SECONDS = makeSymbol("KBQ-INTERNAL-REAL-TIME-TO-SECONDS");
  public static final SubLList $list226 = list(makeKeyword("BROWSABLE?"), T);
  public static final SubLList $list227 = list(ONE_INTEGER);
  public static final SubLSymbol $sym228$_ = makeSymbol("*");
  public static final SubLSymbol $sym229$SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");
  public static final SubLSymbol $sym230$CYCL_LITERAL_P = makeSymbol("CYCL-LITERAL-P");
  public static final SubLList $list231 = list(makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);
  public static final SubLSymbol $kw232$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw233$TRANS_UNBOUND_PREDICATE_POS = makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
  public static final SubLSymbol $sym234$BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");
  public static final SubLSymbol $kw235$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw236$EXECUTED = makeKeyword("EXECUTED");

  //// Initializers

  public void declareFunctions() {
    declare_leviathan_file();
  }

  public void initializeVariables() {
    init_leviathan_file();
  }

  public void runTopLevelForms() {
    setup_leviathan_file();
  }

}
