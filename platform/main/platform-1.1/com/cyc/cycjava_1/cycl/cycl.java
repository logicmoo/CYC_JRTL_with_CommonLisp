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

import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class cycl implements SubLFile
{
  //// Constructors
  /** Creates a new instance of cycl. */
  public cycl()
  {}
  public static final SubLFile me = new cycl();

  //// Initializers
  @Override
  public void declareFunctions()
  {
    String[] weak = new String[] { "accumulation", "agenda", "api_kernel", "arg_type", "arguments", "arity", "assertion_handles", "assertion_utilities", "assertions_high", "assertions_interface", "assertions_low",
      "at_admitted", "at_defns", "at_routines", "at_utilities", "at_var_types", "auxiliary_indexing", "backward", "backward_utilities", "bag", "bijection", "binary_tree", "bookkeeping_store", "cache", "cache_utilities",
      "canon_tl", "cardinality_estimates", "cfasl", "cfasl_compression", "cfasl_kb_methods", "clause_strucs", "clausifier", "collection_defns", "concept_filter", "constant_completion_interface", "constants_high",
      "constants_interface", "constants_low", "cycl_grammar", "cycl_query_specification", "cycl_utilities", "cycl_variables", "cycml_generator", "czer_graph", "czer_main", "czer_meta", "czer_trampolines",
      "czer_utilities", "deck", "deduction_handles", "deductions_interface", "deductions_low", "defns", "dictionary", "dictionary_contents", "dictionary_utilities", "disjoint_with", "dumper", "el_grammar",
      "el_utilities", "encapsulation", "equality_store", "equals", "eval_in_api", "evaluation_defns", "fi", "file_backed_cache", "file_backed_cache_setup", "file_hash_table", "file_translation", "file_vector",
      "file_vector_utilities", "finite_state_transducer", "formula_pattern_match", "formula_templates", "fort_types_interface", "forts", "fraction_utilities", "function_terms", "genl_mts", "genls", "ghl_link_iterators",
      "ghl_search_methods", "ghl_search_utilities", "ghl_search_vars", "glob", "graphic_library_format", "graphl_search_vars", "gt_methods", "guardian", "heap", "hierarchical_visitor", "hl_interface_infrastructure",
      "hl_modifiers", "hl_storage_module_declarations", "hl_storage_modules", "hl_supports", "hlmt", "hlmt_czer", "id_index", "integer_sequence_generator", "interval_span", "isa", "iteration", "java_api_kernel",
      "java_name_translation", "kb_access_metering", "kb_accessors", "kb_compare", "kb_hl_supports", "kb_indexing", "kb_indexing_datastructures", "kb_mapping", "kb_mapping_macros", "kb_object_manager", "kb_paths",
      "kb_utilities", "ke", "keyhash", "keyhash_utilities", "list_utilities", "lucene_session", "mail_message", "map_utilities", "misc_kb_utilities", "misc_utilities", "modules", "morphology", "mt_relevance_cache",
      "mt_relevance_macros", "nart_handles", "narts_high", "neural_net", "new_cycl_query_specification", "number_utilities", "operation_communication", "os_process_utilities", "pattern_match", "postcanonicalizer",
      "precanonicalizer", "pred_relevance_macros", "predicate_relevance_cache", "preserves_genls_in_arg", "process_utilities", "queues", "red_api", "red_infrastructure", "relation_evaluation", "remote_image",
      "rewrite_of_propagation", "rule_macros", "sdbc", "sdc", "search", "secure_translation", "set", "set_contents", "shelfs", "simple_indexing", "simple_lru_cache_strategy", "simplifier", "somewhere_cache",
      "sparse_matrix", "sparse_vector", "special_variable_state", "stacks", "standard_tokenization", "stream_buffer", "string_utilities", "subl_identifier", "subl_promotions", "system_benchmarks", "system_translation",
      "task_processor", "tcp_server_utilities", "term", "test_query_suite", "timing", "tms", "transcript_utilities", "transform_list_utilities", "transitivity", "tries", "tva_cache", "tva_inference", "tva_strategy",
      "tva_tactic", "tva_utilities", "uncanonicalizer", "unicode_streams", "unicode_strings", "unification", "unification_utilities", "user_actions", "utilities_macros", "value_tables", "virtual_indexing",
      "web_utilities", "wff", "wff_macros", "wff_module_datastructures", "xref_database", "cyc_testing.cyc_testing", "cyc_testing.evaluatable_relation_tests", "cyc_testing.inference_unit_tests",
      "cyc_testing.removal_module_cost_tests", "cyc_testing.removal_module_tests", "cyc_testing.transformation_module_tests", "cyc_testing.kb_content_test.kct_utils", "inference.collection_intersection",
      "inference.inference_completeness_utilities", "inference.inference_trampolines", "inference.janus", "inference.kbq_query_run", "inference.leviathan", "inference.harness.abnormal", "inference.harness.argumentation",
      "inference.harness.balancing_tactician", "inference.harness.forward", "inference.harness.inference_abduction_utilities", "inference.harness.inference_analysis",
      "inference.harness.inference_balanced_tactician_datastructures", "inference.harness.inference_balanced_tactician_execution", "inference.harness.inference_balanced_tactician_motivation",
      "inference.harness.inference_balanced_tactician_strategic_uninterestingness", "inference.harness.inference_czer", "inference.harness.inference_datastructures_enumerated_types",
      "inference.harness.inference_datastructures_forward_propagate", "inference.harness.inference_datastructures_inference", "inference.harness.inference_datastructures_problem",
      "inference.harness.inference_datastructures_problem_link", "inference.harness.inference_datastructures_problem_query", "inference.harness.inference_datastructures_problem_store",
      "inference.harness.inference_datastructures_proof", "inference.harness.inference_datastructures_strategy", "inference.harness.inference_datastructures_tactic",
      "inference.harness.inference_heuristic_balanced_tactician", "inference.harness.inference_kernel", "inference.harness.inference_lookahead_productivity", "inference.harness.inference_metrics",
      "inference.harness.inference_min_transformation_depth", "inference.harness.inference_modules", "inference.harness.inference_strategic_heuristics", "inference.harness.inference_strategist",
      "inference.harness.inference_tactician", "inference.harness.inference_tactician_strategic_uninterestingness", "inference.harness.inference_tactician_utilities", "inference.harness.inference_trivial",
      "inference.harness.inference_worker", "inference.harness.inference_worker_join", "inference.harness.inference_worker_join_ordered", "inference.harness.inference_worker_removal",
      "inference.harness.inference_worker_residual_transformation", "inference.harness.inference_worker_restriction", "inference.harness.inference_worker_rewrite", "inference.harness.inference_worker_split",
      "inference.harness.inference_worker_transformation", "inference.harness.new_root_tactician_datastructures", "inference.harness.removal_tactician_datastructures", "inference.harness.removal_tactician_execution",
      "inference.harness.removal_tactician_motivation", "inference.harness.removal_tactician_uninterestingness", "inference.harness.rule_after_adding", "inference.harness.transformation_tactician_datastructures",
      "inference.modules.forward_modules", "inference.modules.preference_modules", "inference.modules.simplification_modules", "inference.modules.transformation_modules",
      "inference.modules.removal.removal_modules_abduction", "inference.modules.removal.removal_modules_asserted_formula", "inference.modules.removal.removal_modules_conjunctive_pruning",
      "inference.modules.removal.removal_modules_function_corresponding_predicate", "inference.modules.removal.removal_modules_genlpreds", "inference.modules.removal.removal_modules_genlpreds_lookup",
      "inference.modules.removal.removal_modules_genls", "inference.modules.removal.removal_modules_indexical_referent", "inference.modules.removal.removal_modules_isa",
      "inference.modules.removal.removal_modules_lookup", "inference.modules.removal.removal_modules_natfunction", "inference.modules.removal.removal_modules_relation_all_exists",
      "inference.modules.removal.removal_modules_relation_all_instance", "inference.modules.removal.removal_modules_relation_instance_exists", "inference.modules.removal.removal_modules_symmetry",
      "inference.modules.removal.removal_modules_termofunit", "inference.modules.removal.removal_modules_transitivity", "inference.modules.removal.removal_modules_tva_lookup", "sbhl.sbhl_cache",
      "sbhl.sbhl_caching_policies", "sbhl.sbhl_graphs", "sbhl.sbhl_iteration", "sbhl.sbhl_link_iterators", "sbhl.sbhl_link_methods", "sbhl.sbhl_link_vars", "sbhl.sbhl_links", "sbhl.sbhl_marking_methods",
      "sbhl.sbhl_marking_utilities", "sbhl.sbhl_module_utilities", "sbhl.sbhl_module_vars", "sbhl.sbhl_search_datastructures", "sbhl.sbhl_search_implied_relations", "sbhl.sbhl_search_methods",
      "sbhl.sbhl_search_utilities", "sbhl.sbhl_search_vars", "sbhl.sbhl_search_what_mts",
    };
    for( int i = 0; i < weak.length; i++ )
    {
      SubLFiles.declareOverridable( "com.cyc.cycjava_1.cycl." + weak[ i ] );
    }
  }

  @Override
  public void initializeVariables()
  {}

  @Override
  public void runTopLevelForms()
  {
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_cvs_id");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.meta_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.access_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.subl_macro_promotions" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.subl_promotions" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.subl_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.format_nil" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_revision_extraction" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.system_parameters" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.system_version" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.system_info" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.utilities_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.timing" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_file_dependencies");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cycml_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.control_vars" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sunit_macros");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sunit_external");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cfasl" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sxhash_external");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.red_implementation");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.red_api" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing_initialization" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.generic_testing" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hash_table_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.keyhash" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.set_contents" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.reader_writer_locks");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.memoization_state" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.list_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.transform_list_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.vector_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.string_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unicode_strings" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unicode_subsets" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.unicode_support");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unicode_streams" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.defstruct_sequence");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.visitation_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.mail_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.mail_message" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.number_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.fraction_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.matrix_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.numeric_date_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.iteration" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.binary_tree" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.stacks" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.queues" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deck" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.integer_sequence_generator" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.semaphores");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.process_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.os_process_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tcp_server_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.pattern_match" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tries" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.shelfs" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.id_index" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.dictionary_contents" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.dictionary" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cfasl_compression" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cfasl_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.bijection" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.glob" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.keyhash_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.set" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.set_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.dictionary_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.map_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.bag" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.accumulation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.red_infrastructure" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.red_infrastructure_macros" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.red_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.stream_buffer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hierarchical_visitor" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.strie");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.finite_state_transducer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cache_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.special_variable_state" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.simple_lru_cache_strategy" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_hash_table" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.file_hash_table_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_vector" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_vector_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.generic_table_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sdbc_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sdbc" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.graph_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sparse_vector" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sparse_matrix" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.remote_image" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.heap" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.decision_tree");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.misc_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.web_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.timing_by_category");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.api_control_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.eval_in_api" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.eval_in_api_registrations" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.api_kernel" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cfasl_kernel" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.guardian" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hl_interface_infrastructure" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_completion_low" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_completion_interface" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_completion_high" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_completion" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_handles" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_reader" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.enumeration_types" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_control_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.mt_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.graphl_search_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ghl_search_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_iteration" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_datastructures" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sbhl.sbhl_time_vars");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_iterators" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.gt_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_vars" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.mt_relevance_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.pred_relevance_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_macros" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.czer_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.wff_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.wff_vars" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.gt_macros");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.hl_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.obsolete" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.obsolete_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_mapping_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_access_metering" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_object_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hlmt" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hlmt_czer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constants_interface" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constant_index_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constants_low" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.constants_high" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.nart_handles" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.narts_interface");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.nart_index_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.nart_hl_formula_manager" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.narts_low");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.narts_high" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.forts" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertion_handles" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertions_interface" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertion_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertions_low" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertions_high" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_hl_support_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_hl_supports" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deduction_handles" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deductions_interface" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deduction_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deductions_low" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.deductions_high" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unrepresented_term_index_manager" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unrepresented_terms" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.arguments" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.clause_strucs" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.variables" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.format_cycl_expression");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hl_storage_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hl_modifiers" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sxhash_external_kb");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.el_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cycl_variables" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.el_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.clause_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cycl_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cycl_grammar" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.el_grammar" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.unicode_nauts");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.term" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_indexing_datastructures" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.simple_indexing" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_indexing_declarations" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_indexing_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_indexing" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.virtual_indexing" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_mapping" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_mapping_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_gp_mapping" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.somewhere_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.auxiliary_indexing" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inferred_indexing");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.arity" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_accessors" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kb_iterators");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.function_terms" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.relation_evaluation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.assertion_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.parameter_specification_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.clauses" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.bindings" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unification" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.unification_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_backed_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.graphl_graph_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ghl_graph_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ghl_link_iterators" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ghl_marking_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ghl_search_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_caching_policies" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_links" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.sbhl.sbhl_nat_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_declarations" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.genls" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.disjoint_with" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sdc" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.isa" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.genl_predicates" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.negation_predicate" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.genl_mts" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.mt_relevance_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.predicate_relevance_cache" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.negation_mt");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ghl_search_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sbhl.sbhl_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.fort_types_interface" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_trampolines" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.wff_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.wff_module_datastructures" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.wff_modules");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.wff" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.wff_suggest");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.simplifier" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.tersifier");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.verbosifier" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.precanonicalizer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.postcanonicalizer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.clausifier" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.prop_sentence_clausifier");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_graph" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_main" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.rule_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.skolems" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.czer_meta" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.uncanonicalizer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.canon_tl" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_routines" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_admitted" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_defns" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.defns" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_var_types" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.at_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.arg_type" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.applicable_relations");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.sksi.sksi_infrastructure.sksi_macros" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.janus_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.gt_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.gt_search" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.gt_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.transitivity" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.transfers_through");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tva_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tva_tactic" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tva_strategy" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tva_inference" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tva_cache" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.equality_store" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.equals" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.rewrite_of_propagation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hl_supports" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.conflicts");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ebl");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.preserves_genls_in_arg" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.formula_pattern_match" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cfasl_kb_methods" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_macros" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.search" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.tms" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.after_adding" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.rule_after_adding" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.argumentation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.backward" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.psc" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.inference_trampolines" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.backward_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.backward_results" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.transformation_heuristics");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.inference_pad_data" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.preference_modules" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.preference_module_declarations");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_forward_propagate" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_czer" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.inference_proof_spec");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.inference_proof_spec_store");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_min_transformation_depth" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_strategic_heuristics" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_execution" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_heuristic_balanced_tactician" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_datastructures" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_uninterestingness" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_motivation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_execution" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_datastructures" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_uninterestingness");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_motivation");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_execution");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.new_root_tactician_datastructures" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.new_root_tactician_motivation");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.new_root_tactician_execution");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.new_root_tactician");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.neural_net" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_strategist" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_kernel" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_trivial" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.inference_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_parameters" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_metrics" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_analysis" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.inference_serialization");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.inference_unit_tests" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.removal_module_tests" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.transformation_module_tests" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.evaluatable_relation_tests" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.inference_testing_helpers");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.inference_testing");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.removal_module_cost_tests" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.kb_query");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.kbq_query_run" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.arete" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.janus" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.leviathan" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.deep_inference_generator");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.lilliput");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.lilliput_caches");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.ask_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lookup" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_minimization");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_transitivity" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_reflexivity" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_reflexive_on" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlpreds_lookup" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relation_all" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relation_all_instance" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relation_all_exists" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relation_instance_exists" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_term_external_id_string");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_backchain_required" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_abduction" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.meta_removal_modules" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_non_wff");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_isa" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genls" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_denotes");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_classification");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_subset_of");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_nearest_isa");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_disjointwith");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_termofunit" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_natfunction" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_formula_arg_n");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_equals");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluate");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_different" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlmt");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlpreds" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlinverse");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_negationpreds");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_negationinverse");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_ist");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_consistent");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_admitted_formula");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_asserted_formula" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_start_offset");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_true_sentence");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_formula_implies");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_asserted_more_specifically");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_isomorphic_sentences");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_conceptually_related");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_integer_between");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_indexical_referent" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_constant_name");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_assertion_mt");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_term_strings");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_perform_subl");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_term_chosen");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_tva_lookup" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_bookkeeping");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_rtv");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_member_of_list");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_assertion_arguments");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_deduction_supports");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_assertion_deductions");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_assertion_hl_asserted_argument_keyword");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_inference_reflection");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_known_antecedent_rule");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_distance_between");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lat_long");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_country_of_city");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_kappa");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_interval_range");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_kb_indexing");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_concatenate_strings");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_query_answers");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_set_of_list_with_same_member_in_pos");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_conjunctive_pruning" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_kb_sentence");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_source_sentence");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.transformation_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.simplification_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.rewrite_modules" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.forward" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.modules.forward_modules" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.forward_propagate_assertions");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.abnormal" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.hl_prototypes" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.collection_intersection" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.abduction");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.fi" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_bookkeeping" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_kernel" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.harness.prove");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.inference_iterators");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.ke" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.api_remote_objects");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.batch_ke");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.inference_viewer");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.plot_generation");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cardinality_estimates" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.relationship_generality_estimates");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.evaluation_defns" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.collection_defns" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ke_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ke_text");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kb_ontology_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ontology_layers");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.system_benchmarks" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.object_similarity");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.partitions");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.convert_partitions");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.core");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_identification");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_add_redundant");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_partition");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_cleanup");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kbs_compare");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kb_cleanup");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.genls_hierarchy_problems");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.encapsulation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.transcript_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.transcript_server" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.operation_communication" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.operation_queues" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.remote_operation_filters");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.user_actions" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.formula_template_vars");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.xml_vars");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.xml_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.agenda" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.subl_identifier" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.query_utilities");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_compare" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.kb_paths" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ke_coherence");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.ke_tools");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.kb_filtering");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.xml_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.misc_kb_utilities" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.scientific_numbers" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.scientific_number_utilities");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.extended_numbers");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.arithmetic");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.hl_storage_module_declarations" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.bookkeeping_store" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.dumper" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.builder_utilities" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.gt_modules");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.task_processor" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.java_api_kernel" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.connection_guarding");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.open_cyc_simple_inference_api");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.term_classification_tree");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.ctest_macros");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.ctest_utils" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_variables");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_utils" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_cyc_testing");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_thinking");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cycl_query_specification" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.new_cycl_query_specification" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.formula_templates" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.graphic_library_format" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.value_tables" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.script_instance_editor_api");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.similarity");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.constrained_term_finder");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.constraint_filters");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.test_query_suite" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.nl_api_datastructures");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.morphology" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_backed_cache_setup" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.standard_tokenization" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.interval_span" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relevant_similar_queries");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_semantically_related");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.folification" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.thcl");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.cycml");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.cycml_generator" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.concept_filter" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.lucene_session" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.quirk.quirk_trampolines");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.nlp_tests");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.properties");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.webcache");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.xref_database" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.secure_translation" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.form_translation");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.file_translation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.system_translation" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.common_optimization");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.c_name_translation" );
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.c_backend" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.optimized_funcall_declarations");
    SubLFiles.initialize( "com.cyc.cycjava_1.cycl.java_name_translation" );
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.java_backend");
    // SubLFiles.initialize("com.cyc.cycjava_1.cycl.translator_utilities");
    SubLFiles.initialize( "eu.larkc.core.orchestrator.LarkcInit" );
    SubLFiles.initialize( "eu.larkc.core.orchestrator.servers.LarKCHttpServer" );
  }
}