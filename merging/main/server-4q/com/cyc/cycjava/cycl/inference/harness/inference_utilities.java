/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.api_control_vars.$the_cyclist$;
import static com.cyc.cycjava.cycl.arguments.sort_supports;
import static com.cyc.cycjava.cycl.arity.min_arity;
import static com.cyc.cycjava.cycl.assertion_utilities.list_of_rule_assertion_p;
import static com.cyc.cycjava.cycl.assertions_high.asserted_assertionP;
import static com.cyc.cycjava.cycl.assertions_high.assertion_cnf;
import static com.cyc.cycjava.cycl.assertions_high.assertion_cons;
import static com.cyc.cycjava.cycl.assertions_high.assertion_el_variables;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg3;
import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.bindings.apply_bindings_backwards;
import static com.cyc.cycjava.cycl.bindings.kbify_inference_set_of_binding_sets;
import static com.cyc.cycjava.cycl.bindings.napply_bindings;
import static com.cyc.cycjava.cycl.bindings.variable_binding_value;
import static com.cyc.cycjava.cycl.bindings.variable_lookup;
import static com.cyc.cycjava.cycl.clauses.clause_without_literal;
import static com.cyc.cycjava.cycl.clauses.make_clause;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.clausifier.cnf_clausal_form;
import static com.cyc.cycjava.cycl.clausifier.dnf_clausal_form;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_with_pred_p;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find_if;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_sublis_hl_variables;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_subst;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_term;
import static com.cyc.cycjava.cycl.date_utilities.indexical_now;
import static com.cyc.cycjava.cycl.date_utilities.universal_time_to_cycl_date;
import static com.cyc.cycjava.cycl.deck.create_deck;
import static com.cyc.cycjava.cycl.deck.deck_pop;
import static com.cyc.cycjava.cycl.deck.deck_push;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.el_utilities.asent_and_sense_to_literal;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_remove_outermost_existentials;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_atomic_sentence;
import static com.cyc.cycjava.cycl.el_utilities.literal_sense;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.nreplace_formula_arg;
import static com.cyc.cycjava.cycl.format_nil.force_format;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s;
import static com.cyc.cycjava.cycl.formula_pattern_match.formula_matches_pattern;
import static com.cyc.cycjava.cycl.function_terms.naut_to_nart;
import static com.cyc.cycjava.cycl.hl_supports.hl_justification_expand;
import static com.cyc.cycjava.cycl.hlmt_czer.canonicalize_hlmt;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_gaf_arg_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_gaf_arg_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.ke.ke_assert;
import static com.cyc.cycjava.cycl.ke.ke_assert_now;
import static com.cyc.cycjava.cycl.ke.ke_create_now;
import static com.cyc.cycjava.cycl.lexicon_accessors.typed_denots_of_string;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup_without_values;
import static com.cyc.cycjava.cycl.list_utilities.fast_delete_duplicates;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.list_utilities.lengthLE;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.non_dotted_list_p;
import static com.cyc.cycjava.cycl.list_utilities.randomize_list;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.list_utilities.tree_find;
import static com.cyc.cycjava.cycl.list_utilities.tree_gather;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.new_memoization_state;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_3;
import static com.cyc.cycjava.cycl.misc_utilities.uninitialized;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.number_utilities.positive_infinity;
import static com.cyc.cycjava.cycl.obsolete.cnat_p;
import static com.cyc.cycjava.cycl.operation_communication.set_the_cyclist;
import static com.cyc.cycjava.cycl.operation_communication.the_cyclist;
import static com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_graph_link;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_direction$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_generator$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_mt$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_node_object_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_randomize_lists_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_mt_links;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.get_sbhl_accessible_modules;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_search_path_termination_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$sbhl_space$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.free_sbhl_marking_space;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.get_sbhl_marking_space;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.apply_sbhl_module_type_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_add_node_to_result_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_type_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_search_direction_to_link_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_module;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.$sbhl_type_error_action$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.sbhl_cerror;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.sbhl_error;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.sbhl_object_type_checking_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.sbhl_warn;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.suspend_sbhl_type_checkingP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$genl_inverse_mode_p$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$relevant_sbhl_tv_function$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_add_node_to_result_test$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_direction$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_module$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_module_type$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.flip_genl_inverse_modeP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_backward_search_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_true_tv;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.relevant_sbhl_tvP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.set_contents.new_set_contents;
import static com.cyc.cycjava.cycl.set_contents.set_contents_add;
import static com.cyc.cycjava.cycl.set_contents.set_contents_element_list;
import static com.cyc.cycjava.cycl.set_contents.set_contents_emptyP;
import static com.cyc.cycjava.cycl.set_contents.set_contents_size;
import static com.cyc.cycjava.cycl.set_utilities.construct_set_contents_from_list;
import static com.cyc.cycjava.cycl.set_utilities.construct_set_from_list;
import static com.cyc.cycjava.cycl.set_utilities.set_add_all;
import static com.cyc.cycjava.cycl.simplifier.conjoin;
import static com.cyc.cycjava.cycl.string_utilities.make_valid_constant_name;
import static com.cyc.cycjava.cycl.string_utilities.remove_substring;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process;
import static com.cyc.cycjava.cycl.task_processor.post_task_info_processor_partial_results;
import static com.cyc.cycjava.cycl.task_processor.task_process_pool_p;
import static com.cyc.cycjava.cycl.term.open_termP;
import static com.cyc.cycjava.cycl.uncanonicalizer.cnf_el_formula;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.variables.canonicalize_default_el_vars;
import static com.cyc.cycjava.cycl.variables.fully_bound_p;
import static com.cyc.cycjava.cycl.variables.sort_hl_variable_list;
import static com.cyc.cycjava.cycl.verbosifier.el_relations_out;
import static com.cyc.cycjava.cycl.xml_utilities.get_default_xml_spec_for_el_vars;
import static com.cyc.cycjava.cycl.xml_utilities.query_bindings_to_xml_stream;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.butler.alchemy_export;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-UTILITIES
 * source file: /cyc/top/cycl/inference/harness/inference-utilities.lisp
 * created:     2019/07/03 17:37:42
 */
public final class inference_utilities extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_193_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), ONE_INTEGER), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), ONE_INTEGER), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), ONE_INTEGER), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), ONE_INTEGER), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("greaterThan"), ONE_INTEGER, makeSymbol("?X")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("greaterThan"), ONE_INTEGER, makeSymbol("?X")), makeKeyword("UNANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("different"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("different"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("different"), makeSymbol("?X"), makeInteger(212)))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("different"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?TIME"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?TIME"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?LATER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?LATER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?DATE"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?DATE"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?EVENT"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?EVENT"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), makeKeyword("UNANSWERABLE")))) });
    }

    public static final SubLFile me = new inference_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $unsatisfied_cnfs_time_cutoff$ = makeSymbol("*UNSATISFIED-CNFS-TIME-CUTOFF*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $answerability_statuses$ = makeSymbol("*ANSWERABILITY-STATUSES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $count_hl_supports_in_hypothetical_contextsP$ = makeSymbol("*COUNT-HL-SUPPORTS-IN-HYPOTHETICAL-CONTEXTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $count_deduced_assertions_in_hypothetical_contextsP$ = makeSymbol("*COUNT-DEDUCED-ASSERTIONS-IN-HYPOTHETICAL-CONTEXTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $gather_required_vocab_set$ = makeSymbol("*GATHER-REQUIRED-VOCAB-SET*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $gather_required_vocab_trace$ = makeSymbol("*GATHER-REQUIRED-VOCAB-TRACE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kbq_query_set_inference_vocab_set$ = makeSymbol("*KBQ-QUERY-SET-INFERENCE-VOCAB-SET*");

    private static final SubLSymbol START_SPARQL_SERVER = makeSymbol("START-SPARQL-SERVER");

    private static final SubLSymbol START_EXTERNAL_SPARQL_PROCESS = makeSymbol("START-EXTERNAL-SPARQL-PROCESS");

    static private final SubLList $list3 = list(makeKeyword("EXTERNAL"), makeSymbol("START-EXTERNAL-SPARQL-PROCESS"));

    private static final SubLList $list6 = list($OPEN, makeKeyword("CLOSED"));

    private static final SubLList $list7 = list(makeKeyword("ANSWERABLE"), makeKeyword("UNANSWERABLE"));

    private static final SubLString $str8$Unhandled_inference_property__S = makeString("Unhandled inference property ~S");

    private static final SubLSymbol $kw16$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLSymbol $kw18$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");

    private static final SubLSymbol $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLSymbol $kw26$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    private static final SubLSymbol $kw27$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw29$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $kw30$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");

    private static final SubLSymbol $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");

    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol $kw42$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    private static final SubLSymbol $kw43$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw44$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol $kw45$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");

    private static final SubLSymbol $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");

    private static final SubLSymbol $kw49$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLSymbol $kw52$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $kw53$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");

    private static final SubLSymbol $kw55$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");

    private static final SubLSymbol $kw56$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLSymbol $kw57$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLString $str58$Unhandled_problem_store_property_ = makeString("Unhandled problem store property ~S");

    private static final SubLSymbol $sym60$HL_VAR_ = makeSymbol("HL-VAR?");



    private static final SubLString $str62$Got_more_than_2_answers_for__a_wh = makeString("Got more than 2 answers for ~a where #$True and #$False were expected to be the only possible answers");

    private static final SubLSymbol $sym64$SINGLETON_ = makeSymbol("SINGLETON?");





    private static final SubLString $str67$No_true_answer_for__a = makeString("No true answer for ~a");

    private static final SubLString $str68$No_false_answer_for__a = makeString("No false answer for ~a");

    private static final SubLSymbol INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-TO-TRUE-TMS-DEDUCTION-SPEC");

    private static final SubLSymbol INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-TO-FALSE-TMS-DEDUCTION-SPEC");

    private static final SubLSymbol $sym71$INFERENCE_ANSWER__ = makeSymbol("INFERENCE-ANSWER-<");

    static private final SubLList $list74 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    private static final SubLSymbol $sym75$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym80$SATISFIED_PROBLEM_ = makeSymbol("SATISFIED-PROBLEM?");

    private static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");

    private static final SubLString $str83$Inference__A_is_not_controlled_by = makeString("Inference ~A is not controlled by the thread of thinking task ~A.");

    private static final SubLSymbol SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");

    private static final SubLSymbol $sym87$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol QUERY_STATIC_PROPERTIES_P = makeSymbol("QUERY-STATIC-PROPERTIES-P");

    private static final SubLList $list89 = list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL")));

    private static final SubLString $str90$new_continuable_antecedent_infere = makeString("new-continuable-antecedent-inference could not find the transformed problem for ~s in ~s");

    private static final SubLString $str94$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str98$Output_format__S_is_not_supported = makeString("Output format ~S is not supported.");

    private static final SubLString $str99$_A_C = makeString("~A~C");

    private static final SubLString $str100$__ = makeString("~%");

    private static final SubLString $str101$__ = makeString("#$");

    private static final SubLList $list102 = list(makeKeyword("ANSWERABLE"), makeKeyword("UNANSWERABLE"), makeKeyword("UNKNOWN"));

    private static final SubLSymbol $kw105$MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");

    private static final SubLSymbol QUERY_LITERAL_ANSWERABILITY_STATUS = makeSymbol("QUERY-LITERAL-ANSWERABILITY-STATUS");

    static private final SubLList $list110 = list(makeSymbol("LITERAL"), makeSymbol("ANSWERABILITY-STATUS"));

    private static final SubLString $str116$unexpected_preference_level__s = makeString("unexpected preference level ~s");

    private static final SubLSymbol QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS = makeSymbol("QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS");

    private static final SubLSymbol QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH = makeSymbol("QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH");

    private static final SubLSymbol HANDLE_ANSWERABILITY_RESULT_TUPLE = makeSymbol("HANDLE-ANSWERABILITY-RESULT-TUPLE");

    private static final SubLSymbol DNF_LITERALS = makeSymbol("DNF-LITERALS");

    private static final SubLSymbol QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK = makeSymbol("QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK");

    private static final SubLSymbol CALLBACK_P = makeSymbol("CALLBACK-P");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLList $list126 = list(makeSymbol("LIT"), makeSymbol("NEW-STATUS"));

    private static final SubLSymbol INFERENCE_ANSWER_ARGUMENT_STRENGTH = makeSymbol("INFERENCE-ANSWER-ARGUMENT-STRENGTH");



    private static final SubLSymbol $HYPOTHETICAL_MT_SUPPORT_COUNT = makeKeyword("HYPOTHETICAL-MT-SUPPORT-COUNT");









    private static final SubLString $str138$Couldn_t_find_a_term_representing = makeString("Couldn't find a term representing this machine based on its name ~S.");



    private static final SubLList $list140 = list(reader_make_constant_shell("Computer"));





























    private static final SubLSymbol QUERY_LITERAL_REMOVAL_COST = makeSymbol("QUERY-LITERAL-REMOVAL-COST");

    private static final SubLSymbol $sym157$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");



    private static final SubLList $list160 = list(makeSymbol("BRIDGING-ARGNUM"), makeSymbol("ARGNUM"));

    private static final SubLList $list161 = list(reader_make_constant_shell("isa"), list(makeKeyword("AND"), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("ARG1"))), list($BIND, makeSymbol("COL")));

    private static final SubLString $str169$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str174$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLObject $$rdf_type = reader_make_constant_shell("rdf-type");

    private static final SubLString $str177$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str178$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str179$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLObject $const182$logicalResultSetCardinalityWRTVal = reader_make_constant_shell("logicalResultSetCardinalityWRTValue");



    private static final SubLList $list186 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    private static final SubLList $list188 = list(list(makeSymbol("FOCAL-ASENT-VAR"), makeSymbol("FOCAL-MT-VAR"), makeSymbol("FOCAL-SENSE-VAR"), makeSymbol("NON-FOCAL-CLAUSE-VAR"), makeSymbol("CLAUSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list189 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym192$CLAUSE_VAR = makeUninternedSymbol("CLAUSE-VAR");

    private static final SubLSymbol $sym193$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    private static final SubLSymbol DO_CONTEXTUALIZED_CLAUSE_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSE-LITERALS");

    private static final SubLSymbol CLAUSE_WITHOUT_LITERAL = makeSymbol("CLAUSE-WITHOUT-LITERAL");

    private static final SubLSymbol CONTEXTUALIZED_DNF_CLAUSE_P = makeSymbol("CONTEXTUALIZED-DNF-CLAUSE-P");

    private static final SubLList $list199 = list(makeSymbol("CANDIDATE-MT"), makeSymbol("CANDIDATE-ASENT"));

    private static final SubLSymbol MEMOIZED_LITERAL_REMOVAL_OPTIONS = makeSymbol("MEMOIZED-LITERAL-REMOVAL-OPTIONS");

    private static final SubLList $list208 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLString $str211$__added__S = makeString("~%added ~S");

    private static final SubLSymbol GATHER_REQUIRED_VOCAB_HANDLER = makeSymbol("GATHER-REQUIRED-VOCAB-HANDLER");

    private static final SubLSymbol GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT = makeSymbol("GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET-INT");

    private static final SubLString $str215$Gathering_vocab_from_KBQ_inferenc = makeString("Gathering vocab from KBQ inferences");

    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");

    private static final SubLList $list219 = list(makeSymbol("VOCAB-SET"), makeSymbol("RULE-SET"));

    private static final SubLString $str220$___a___a__a__ = makeString("~&~a: ~a ~a~%");

    private static final SubLSymbol PROBLEM_STORE_LINK_ID_MAP = makeSymbol("PROBLEM-STORE-LINK-ID-MAP");

    private static final SubLSymbol QUERY_ANSWERABILITY_STATUS = makeSymbol("QUERY-ANSWERABILITY-STATUS");

    private static final SubLList $list232 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), makeSymbol("?X"))), makeKeyword("ANSWERABLE")), list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Dog"), makeSymbol("?X"))), makeKeyword("UNANSWERABLE")), list(list(list(reader_make_constant_shell("performsActsOfType-Percentage"), makeSymbol("?AGENT"), makeSymbol("?COL1"), makeSymbol("?COL2"), makeSymbol("?RATIO"))), makeKeyword("UNKNOWN")), list(list(list(reader_make_constant_shell("ratioOfCollectionToDifferentiatedCollection"), makeSymbol("?MOD"), makeSymbol("?COLL"), makeSymbol("?DIFF"), makeSymbol("?CARD-DIFF")), reader_make_constant_shell("CyclistsMt"), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER)), makeKeyword("UNKNOWN")));

    private static final SubLObject $list233 = inference_utilities._constant_233_initializer();

    public static SubLObject sparql_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$sparql_port_offset$.getDynamicValue(thread));
    }

    public static SubLObject start_external_sparql_process(final SubLObject port) {
        funcall(inference_utilities.START_SPARQL_SERVER, port);
        return NIL;
    }

    // Definitions
    public static final SubLObject allowed_rules_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != assertion_utilities.list_of_rule_assertion_p(v_object)));
    }

    // Definitions
    public static SubLObject allowed_rules_spec_p(final SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != list_of_rule_assertion_p(v_object)));
    }

    public static final SubLObject forbidden_rules_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($NONE == v_object) || (NIL != assertion_utilities.list_of_rule_assertion_p(v_object)));
    }

    public static SubLObject forbidden_rules_spec_p(final SubLObject v_object) {
        return makeBoolean(($NONE == v_object) || (NIL != list_of_rule_assertion_p(v_object)));
    }

    public static final SubLObject openness_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list_alt2);
    }

    public static SubLObject openness_p(final SubLObject v_object) {
        return member_eqP(v_object, inference_utilities.$list6);
    }

    public static final SubLObject answerability_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list_alt3);
    }

    public static SubLObject answerability_p(final SubLObject v_object) {
        return member_eqP(v_object, inference_utilities.$list7);
    }

    public static final SubLObject inference_input_property_lookup_alt(SubLObject inference, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
            return inference_datastructures_inference.inference_input_query_property(inference, property, v_default);
        } else {
            Errors.error($str_alt4$Unhandled_inference_property__S, property);
            return v_default;
        }
    }

    public static SubLObject inference_input_property_lookup(final SubLObject inference, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
            return inference_datastructures_inference.inference_input_query_property(inference, property, v_default);
        }
        Errors.error(inference_utilities.$str8$Unhandled_inference_property__S, property);
        return v_default;
    }

    public static final SubLObject inference_property_lookup_alt(SubLObject inference, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.inference_resource_constraint_p(property)) {
            {
                SubLObject pcase_var = property;
                if (pcase_var.eql($MAX_NUMBER)) {
                    return inference_datastructures_inference.inference_max_number(inference);
                } else {
                    if (pcase_var.eql($MAX_TIME)) {
                        return inference_datastructures_inference.inference_max_time(inference);
                    } else {
                        if (pcase_var.eql($INFERENCE_MODE)) {
                            return inference_datastructures_inference.inference_mode(inference);
                        } else {
                            return v_default;
                        }
                    }
                }
            }
        } else {
            if (NIL != inference_datastructures_enumerated_types.inference_dynamic_property_p(property)) {
                {
                    SubLObject pcase_var = property;
                    if (pcase_var.eql($MAX_TRANSFORMATION_DEPTH)) {
                        return inference_datastructures_inference.inference_max_transformation_depth(inference);
                    } else {
                        if (pcase_var.eql($MAX_PROOF_DEPTH)) {
                            return inference_datastructures_inference.inference_max_proof_depth(inference);
                        } else {
                            if (pcase_var.eql($PROBABLY_APPROXIMATELY_DONE)) {
                                return inference_datastructures_inference.inference_probably_approximately_done(inference);
                            } else {
                                if (pcase_var.eql($BLOCK_)) {
                                    return inference_datastructures_inference.inference_blockingP(inference);
                                } else {
                                    if (pcase_var.eql($kw12$CACHE_INFERENCE_RESULTS_)) {
                                        return inference_datastructures_inference.inference_cache_resultsP(inference);
                                    } else {
                                        if (pcase_var.eql($ANSWER_LANGUAGE)) {
                                            return inference_datastructures_inference.inference_answer_language(inference);
                                        } else {
                                            if (pcase_var.eql($CONTINUABLE_)) {
                                                return inference_datastructures_inference.inference_continuableP(inference);
                                            } else {
                                                return v_default;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != inference_datastructures_enumerated_types.inference_static_property_p(property)) {
                    {
                        SubLObject pcase_var = property;
                        if (pcase_var.eql($kw15$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
                            return inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
                        } else {
                            if (pcase_var.eql($kw16$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
                                return inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                            } else {
                                if (pcase_var.eql($kw17$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
                                    return inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                                } else {
                                    if (pcase_var.eql($kw18$ALLOW_INDETERMINATE_RESULTS_)) {
                                        return inference_datastructures_inference.inference_allow_indeterminate_resultsP(inference);
                                    } else {
                                        if (pcase_var.eql($kw19$ALLOW_ABNORMALITY_CHECKING_)) {
                                            return inference_datastructures_inference.inference_allow_abnormality_checkingP(inference);
                                        } else {
                                            if (pcase_var.eql($TRANSITIVE_CLOSURE_MODE)) {
                                                return inference_datastructures_inference.inference_transitive_closure_mode(inference);
                                            } else {
                                                if (pcase_var.eql($RESULT_UNIQUENESS)) {
                                                    return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
                                                } else {
                                                    if (pcase_var.eql($ALLOWED_MODULES)) {
                                                        return inference_datastructures_inference.inference_allowed_modules(inference);
                                                    } else {
                                                        if (pcase_var.eql($EVENTS)) {
                                                            return inference_datastructures_inference.inference_events(inference);
                                                        } else {
                                                            return v_default;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != inference_datastructures_enumerated_types.strategy_property_p(property)) {
                        {
                            SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                            SubLObject pcase_var = property;
                            if (pcase_var.eql($PRODUCTIVITY_LIMIT)) {
                                return inference_datastructures_strategy.strategy_productivity_limit(strategy);
                            } else {
                                if (pcase_var.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                                    return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
                                } else {
                                    return v_default;
                                }
                            }
                        }
                    } else {
                        if (NIL != inference_datastructures_enumerated_types.problem_store_property_p(property)) {
                            {
                                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                                return com.cyc.cycjava.cycl.inference.harness.inference_utilities.problem_store_property_lookup(store, property, v_default);
                            }
                        } else {
                            Errors.error($str_alt4$Unhandled_inference_property__S, property);
                            return v_default;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject inference_property_lookup(final SubLObject inference, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.inference_resource_constraint_p(property)) {
            if (property.eql($INFERENCE_MODE)) {
                return inference_datastructures_inference.inference_mode(inference);
            }
            if (property.eql($MAX_NUMBER)) {
                return inference_datastructures_inference.inference_max_number(inference);
            }
            if (property.eql($MAX_STEP)) {
                return inference_datastructures_inference.inference_max_step(inference);
            }
            if (property.eql($MAX_TIME)) {
                return inference_datastructures_inference.inference_max_time(inference);
            }
            Errors.warn(inference_utilities.$str8$Unhandled_inference_property__S, property);
            return v_default;
        } else
            if (NIL != inference_datastructures_enumerated_types.inference_dynamic_property_p(property)) {
                if (property.eql($ANSWER_LANGUAGE)) {
                    return inference_datastructures_inference.inference_answer_language(inference);
                }
                if (property.eql($BLOCK_)) {
                    return inference_datastructures_inference.inference_blockingP(inference);
                }
                if (property.eql($BROWSABLE_)) {
                    return inference_datastructures_inference.inference_browsableP(inference);
                }
                if (property.eql(inference_utilities.$kw16$CACHE_INFERENCE_RESULTS_)) {
                    return inference_datastructures_inference.inference_cache_resultsP(inference);
                }
                if (property.eql($CONTINUABLE_)) {
                    return inference_datastructures_inference.inference_continuableP(inference);
                }
                if (property.eql(inference_utilities.$kw18$FORGET_EXTRA_RESULTS_)) {
                    return inference_datastructures_inference.inference_forget_extra_resultsP(inference);
                }
                if (property.eql(inference_utilities.$FORWARD_MAX_TIME)) {
                    return inference_datastructures_inference.inference_forward_max_time(inference);
                }
                if (property.eql(inference_utilities.$MAX_PROOF_DEPTH)) {
                    return inference_datastructures_inference.inference_max_proof_depth(inference);
                }
                if (property.eql(inference_utilities.$MAX_TRANSFORMATION_DEPTH)) {
                    return inference_datastructures_inference.inference_max_transformation_depth(inference);
                }
                if (property.eql(inference_utilities.$MIN_RULE_UTILITY)) {
                    return inference_datastructures_inference.inference_min_rule_utility(inference);
                }
                if (property.eql($METRICS)) {
                    return inference_datastructures_inference.inference_metrics_template(inference);
                }
                if (property.eql(inference_utilities.$PROBABLY_APPROXIMATELY_DONE)) {
                    return inference_datastructures_inference.inference_probably_approximately_done(inference);
                }
                if (property.eql($RETURN)) {
                    return inference_datastructures_inference.inference_return_type(inference);
                }
                Errors.warn(inference_utilities.$str8$Unhandled_inference_property__S, property);
                return v_default;
            } else
                if (NIL != inference_datastructures_enumerated_types.inference_static_property_p(property)) {
                    if (property.eql(inference_utilities.$kw26$ALLOW_ABNORMALITY_CHECKING_)) {
                        return inference_datastructures_inference.inference_allow_abnormality_checkingP(inference);
                    }
                    if (property.eql(inference_utilities.$kw27$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
                        return inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                    }
                    if (property.eql(inference_utilities.$kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
                        return inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
                    }
                    if (property.eql(inference_utilities.$kw29$ALLOW_INDETERMINATE_RESULTS_)) {
                        return inference_datastructures_inference.inference_allow_indeterminate_resultsP(inference);
                    }
                    if (property.eql(inference_utilities.$kw30$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
                        return inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                    }
                    if (property.eql($ALLOWED_MODULES)) {
                        return inference_datastructures_inference.inference_allowed_modules(inference);
                    }
                    if (property.eql($ALLOWED_RULES)) {
                        return inference_datastructures_inference.inference_allowed_rules(inference);
                    }
                    if (property.eql(inference_utilities.$DISJUNCTION_FREE_EL_VARS_POLICY)) {
                        return inference_datastructures_inference.inference_disjunction_free_el_vars_policy(inference);
                    }
                    if (property.eql($EVENTS)) {
                        return inference_datastructures_inference.inference_events(inference);
                    }
                    if (property.eql($FORBIDDEN_RULES)) {
                        return inference_datastructures_inference.inference_forbidden_rules(inference);
                    }
                    if (property.eql($PROBLEM_STORE)) {
                        return inference_datastructures_inference.inference_problem_store(inference);
                    }
                    if (property.eql($RESULT_UNIQUENESS)) {
                        return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
                    }
                    if (property.eql(inference_utilities.$TRANSITIVE_CLOSURE_MODE)) {
                        return inference_datastructures_inference.inference_transitive_closure_mode(inference);
                    }
                    if (property.eql(inference_utilities.$TRANSITIVE_CLOSURE_MODE)) {
                        return inference_datastructures_inference.inference_transitive_closure_mode(inference);
                    }
                    Errors.warn(inference_utilities.$str8$Unhandled_inference_property__S, property);
                    return v_default;
                } else
                    if (NIL != inference_datastructures_enumerated_types.strategy_property_p(property)) {
                        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                        if (property.eql($PRODUCTIVITY_LIMIT)) {
                            return inference_datastructures_strategy.strategy_productivity_limit(strategy);
                        }
                        if (property.eql($PROOF_SPEC)) {
                            return inference_datastructures_strategy.strategy_proof_spec(strategy);
                        }
                        if (property.eql(inference_utilities.$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                            return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
                        }
                        Errors.warn(inference_utilities.$str8$Unhandled_inference_property__S, property);
                        return v_default;
                    } else {
                        if (NIL != inference_datastructures_enumerated_types.problem_store_property_p(property)) {
                            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                            return inference_utilities.problem_store_property_lookup(store, property, v_default);
                        }
                        Errors.error(inference_utilities.$str8$Unhandled_inference_property__S, property);
                        return v_default;
                    }



    }

    public static final SubLObject problem_store_property_lookup_alt(SubLObject store, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject pcase_var = property;
            if (pcase_var.eql($kw26$NEGATION_BY_FAILURE_)) {
                return inference_datastructures_problem_store.problem_store_negation_by_failureP(store);
            } else {
                if (pcase_var.eql($kw27$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
                    return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
                } else {
                    if (pcase_var.eql($DIRECTION)) {
                        return inference_datastructures_problem_store.problem_store_direction(store);
                    } else {
                        if (pcase_var.eql($EQUALITY_REASONING_METHOD)) {
                            return inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
                        } else {
                            if (pcase_var.eql($EQUALITY_REASONING_DOMAIN)) {
                                return inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
                            } else {
                                if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
                                    return inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
                                } else {
                                    if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
                                        return inference_datastructures_problem_store.problem_store_max_problem_count(store);
                                    } else {
                                        if (pcase_var.eql($kw33$REMOVAL_ALLOWED_)) {
                                            return inference_datastructures_problem_store.problem_store_removal_allowedP(store);
                                        } else {
                                            if (pcase_var.eql($kw34$TRANSFORMATION_ALLOWED_)) {
                                                return inference_datastructures_problem_store.problem_store_transformation_allowedP(store);
                                            } else {
                                                if (pcase_var.eql($kw35$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
                                                    return inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store);
                                                } else {
                                                    if (pcase_var.eql($kw36$EVALUATE_SUBL_ALLOWED_)) {
                                                        return inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP(store);
                                                    } else {
                                                        if (pcase_var.eql($kw37$REWRITE_ALLOWED_)) {
                                                            return inference_datastructures_problem_store.problem_store_rewrite_allowedP(store);
                                                        } else {
                                                            if (pcase_var.eql($kw38$ABDUCTION_ALLOWED_)) {
                                                                return inference_datastructures_problem_store.problem_store_abduction_allowedP(store);
                                                            } else {
                                                                if (pcase_var.eql($kw39$NEW_TERMS_ALLOWED_)) {
                                                                    return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
                                                                } else {
                                                                    if (pcase_var.eql($kw40$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
                                                                        return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(store);
                                                                    } else {
                                                                        return v_default;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject problem_store_property_lookup(final SubLObject store, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (property.eql(inference_utilities.$kw42$ABDUCTION_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_abduction_allowedP(store);
        }
        if (property.eql(inference_utilities.$kw43$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
            return inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store);
        }
        if (property.eql(inference_utilities.$kw44$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
        }
        if (property.eql(inference_utilities.$kw45$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
            return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(store);
        }
        if (property.eql($DIRECTION)) {
            return inference_datastructures_problem_store.problem_store_direction(store);
        }
        if (property.eql(inference_utilities.$EQUALITY_REASONING_DOMAIN)) {
            return inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
        }
        if (property.eql(inference_utilities.$EQUALITY_REASONING_METHOD)) {
            return inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
        }
        if (property.eql(inference_utilities.$kw49$EVALUATE_SUBL_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP(store);
        }
        if (property.eql(inference_utilities.$INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
            return inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
        }
        if (property.eql(inference_utilities.$MAX_PROBLEM_COUNT)) {
            return inference_datastructures_problem_store.problem_store_max_problem_count(store);
        }
        if (property.eql(inference_utilities.$kw52$NEGATION_BY_FAILURE_)) {
            return inference_datastructures_problem_store.problem_store_negation_by_failureP(store);
        }
        if (property.eql(inference_utilities.$kw53$NEW_TERMS_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
        }
        if (property.eql(inference_utilities.$PROBLEM_STORE_NAME)) {
            return inference_datastructures_problem_store.problem_store_name(store);
        }
        if (property.eql(inference_utilities.$kw55$REMOVAL_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_removal_allowedP(store);
        }
        if (property.eql(inference_utilities.$kw56$REWRITE_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_rewrite_allowedP(store);
        }
        if (property.eql(inference_utilities.$kw57$TRANSFORMATION_ALLOWED_)) {
            return inference_datastructures_problem_store.problem_store_transformation_allowedP(store);
        }
        Errors.warn(inference_utilities.$str58$Unhandled_problem_store_property_, property);
        return v_default;
    }

    public static final SubLObject single_literal_backchain_required_problemP_alt(SubLObject problem) {
        {
            SubLObject result = NIL;
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                {
                    SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
                    SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
                    if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt)) {
                        result = T;
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject single_literal_backchain_required_problemP(final SubLObject problem) {
        SubLObject result = NIL;
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
            final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
            if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt)) {
                result = T;
            }
        }
        return result;
    }

    public static final SubLObject find_previous_inference_problem_by_el_asent_alt(SubLObject el_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        {
            SubLObject store = inference_worker.currently_active_problem_store();
            if (NIL != store) {
                {
                    SubLObject inference = inference_datastructures_problem_store.earliest_problem_store_inference(store);
                    if (NIL != inference) {
                        {
                            SubLObject mt = inference_datastructures_inference.inference_first_hl_query_mt(inference);
                            if (NIL != mt) {
                                {
                                    SubLObject asent = variables.canonicalize_default_el_vars(el_asent);
                                    SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(asent, sense, mt);
                                    return inference_datastructures_problem_store.find_problem_by_query(store, query);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_previous_inference_problem_by_el_asent(final SubLObject el_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        final SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            final SubLObject inference = inference_datastructures_problem_store.earliest_problem_store_inference(store);
            if (NIL != inference) {
                final SubLObject mt = inference_datastructures_inference.inference_first_hl_query_mt(inference);
                if (NIL != mt) {
                    final SubLObject asent = canonicalize_default_el_vars(el_asent);
                    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(asent, sense, mt);
                    final SubLObject free_hl_vars = (NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) ? sort_hl_variable_list(cycl_utilities.expression_gather(asent, inference_utilities.$sym60$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL;
                    return inference_datastructures_problem_store.find_problem_by_query(store, query, free_hl_vars);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t iff INFERENCE requires argumentation
    to decide between its answers.  Currently, the only case is
    a #$sentenceTruth query with both a true and false answer.
     */
    @LispMethod(comment = "@return booleanp; t iff INFERENCE requires argumentation\r\nto decide between its answers.  Currently, the only case is\r\na #$sentenceTruth query with both a true and false answer.")
    public static final SubLObject inference_requires_argumentationP_alt(SubLObject inference) {
        {
            SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
            if ((NIL != el_formula_p(el_query)) && (NIL != atomic_sentence_with_pred_p(el_query, $$sentenceTruth))) {
                {
                    SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                    SubLObject pcase_var = answer_count;
                    if (pcase_var.eql(ZERO_INTEGER) || pcase_var.eql(ONE_INTEGER)) {
                        return NIL;
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return T;
                        } else {
                            Errors.error($str_alt43$Got_more_than_2_answers_for__a_wh, inference);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t iff INFERENCE requires argumentation
    to decide between its answers.  Currently, the only case is
    a #$sentenceTruth query with both a true and false answer.
     */
    @LispMethod(comment = "@return booleanp; t iff INFERENCE requires argumentation\r\nto decide between its answers.  Currently, the only case is\r\na #$sentenceTruth query with both a true and false answer.")
    public static SubLObject inference_requires_argumentationP(final SubLObject inference) {
        final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
        if ((NIL != el_formula_p(el_query)) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(el_query, inference_utilities.$$sentenceTruth))) {
            final SubLObject pcase_var;
            final SubLObject answer_count = pcase_var = inference_datastructures_inference.inference_answer_count(inference);
            if (pcase_var.eql(ZERO_INTEGER) || pcase_var.eql(ONE_INTEGER)) {
                return NIL;
            }
            if (pcase_var.eql(TWO_INTEGER)) {
                return T;
            }
            Errors.error(inference_utilities.$str62$Got_more_than_2_answers_for__a_wh, inference);
        }
        return NIL;
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one binding a single
     * variable to #$True and one binding a single variable to #$False
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one binding a single\r\nvariable to #$True and one binding a single variable to #$False\nAssumes that INFERENCE has exactly two answers, one binding a single\nvariable to #$True and one binding a single variable to #$False")
    public static final SubLObject inference_true_and_false_answers_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject true_answer = NIL;
                SubLObject false_answer = NIL;
                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject v_answer = NIL;
                        while (NIL != id) {
                            v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                                {
                                    SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                    SubLTrampolineFile.checkType(v_bindings, $sym45$SINGLETON_);
                                    {
                                        SubLObject binding = v_bindings.first();
                                        SubLObject value = bindings.variable_binding_value(binding);
                                        SubLObject pcase_var = value;
                                        if (pcase_var.eql($$True)) {
                                            true_answer = v_answer;
                                        } else {
                                            if (pcase_var.eql($$False)) {
                                                false_answer = v_answer;
                                            } else {
                                                Errors.error($str_alt43$Got_more_than_2_answers_for__a_wh, inference);
                                            }
                                        }
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == true_answer) {
                        Errors.error($str_alt48$No_true_answer_for__a, inference);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == false_answer) {
                        Errors.error($str_alt49$No_false_answer_for__a, inference);
                    }
                }
                return values(true_answer, false_answer);
            }
        }
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one binding a single
     * variable to #$True and one binding a single variable to #$False
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one binding a single\r\nvariable to #$True and one binding a single variable to #$False\nAssumes that INFERENCE has exactly two answers, one binding a single\nvariable to #$True and one binding a single variable to #$False")
    public static SubLObject inference_true_and_false_answers(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject true_answer = NIL;
        SubLObject false_answer = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject v_bindings;
                SubLObject binding;
                SubLObject pcase_var;
                SubLObject value;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                        assert NIL != singletonP(v_bindings) : "! list_utilities.singletonP(v_bindings) " + ("list_utilities.singletonP(v_bindings) " + "CommonSymbols.NIL != list_utilities.singletonP(v_bindings) ") + v_bindings;
                        binding = v_bindings.first();
                        value = pcase_var = variable_binding_value(binding);
                        if (pcase_var.eql(inference_utilities.$$True)) {
                            true_answer = v_answer;
                        } else
                            if (pcase_var.eql(inference_utilities.$$False)) {
                                false_answer = v_answer;
                            } else {
                                Errors.error(inference_utilities.$str62$Got_more_than_2_answers_for__a_wh, inference);
                            }

                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject v_bindings2 = inference_datastructures_inference.inference_answer_bindings(v_answer2);
                        assert NIL != singletonP(v_bindings2) : "! list_utilities.singletonP(v_bindings2) " + ("list_utilities.singletonP(v_bindings2) " + "CommonSymbols.NIL != list_utilities.singletonP(v_bindings2) ") + v_bindings2;
                        final SubLObject binding2 = v_bindings2.first();
                        final SubLObject pcase_var2;
                        final SubLObject value2 = pcase_var2 = variable_binding_value(binding2);
                        if (pcase_var2.eql(inference_utilities.$$True)) {
                            true_answer = v_answer2;
                        } else
                            if (pcase_var2.eql(inference_utilities.$$False)) {
                                false_answer = v_answer2;
                            } else {
                                Errors.error(inference_utilities.$str62$Got_more_than_2_answers_for__a_wh, inference);
                            }

                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == true_answer)) {
            Errors.error(inference_utilities.$str67$No_true_answer_for__a, inference);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == false_answer)) {
            Errors.error(inference_utilities.$str68$No_false_answer_for__a, inference);
        }
        return values(true_answer, false_answer);
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one binding a single
     * variable to #$True and one binding a single variable to #$False.
     *
     * @return tv-p; the results of performing argumentation on all
    the justifications for all the answers.
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one binding a single\r\nvariable to #$True and one binding a single variable to #$False.\r\n\r\n@return tv-p; the results of performing argumentation on all\r\nthe justifications for all the answers.\nAssumes that INFERENCE has exactly two answers, one binding a single\nvariable to #$True and one binding a single variable to #$False.")
    public static final SubLObject inference_argumentation_result_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_perform_argumentation(inference);
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one binding a single
     * variable to #$True and one binding a single variable to #$False.
     *
     * @return tv-p; the results of performing argumentation on all
    the justifications for all the answers.
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one binding a single\r\nvariable to #$True and one binding a single variable to #$False.\r\n\r\n@return tv-p; the results of performing argumentation on all\r\nthe justifications for all the answers.\nAssumes that INFERENCE has exactly two answers, one binding a single\nvariable to #$True and one binding a single variable to #$False.")
    public static SubLObject inference_argumentation_result(final SubLObject inference) {
        return inference_utilities.inference_perform_argumentation(inference);
    }

    public static final SubLObject inference_perform_argumentation_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject true_answer = com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_true_and_false_answers(inference);
                SubLObject false_answer = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject true_justifications = inference_datastructures_inference.inference_answer_justifications(true_answer);
                    SubLObject false_justifications = inference_datastructures_inference.inference_answer_justifications(false_answer);
                    SubLObject true_tms_deduction_specs = Mapping.mapcar(INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC, true_justifications);
                    SubLObject false_tms_deduction_specs = Mapping.mapcar(INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC, false_justifications);
                    SubLObject tms_deduction_specs = append(true_tms_deduction_specs, false_tms_deduction_specs);
                    SubLObject tv = argumentation.perform_tms_deduction_spec_argumentation(tms_deduction_specs);
                    return tv;
                }
            }
        }
    }

    public static SubLObject inference_perform_argumentation(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject true_answer = inference_utilities.inference_true_and_false_answers(inference);
        final SubLObject false_answer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject true_justifications = inference_datastructures_inference.inference_answer_justifications(true_answer);
        final SubLObject false_justifications = inference_datastructures_inference.inference_answer_justifications(false_answer);
        final SubLObject true_tms_deduction_specs = Mapping.mapcar(inference_utilities.INFERENCE_ANSWER_JUSTIFICATION_TO_TRUE_TMS_DEDUCTION_SPEC, true_justifications);
        final SubLObject false_tms_deduction_specs = Mapping.mapcar(inference_utilities.INFERENCE_ANSWER_JUSTIFICATION_TO_FALSE_TMS_DEDUCTION_SPEC, false_justifications);
        final SubLObject tms_deduction_specs = append(true_tms_deduction_specs, false_tms_deduction_specs);
        final SubLObject tv = argumentation.perform_tms_deduction_spec_argumentation(tms_deduction_specs);
        return tv;
    }

    public static final SubLObject inference_some_proof_uses_removal_moduleP_alt(SubLObject inference, SubLObject hl_module) {
        {
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                SubLObject justification = NIL;
                                for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_1 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                        SubLObject proof = NIL;
                                        for (proof = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , proof = cdolist_list_var_1.first()) {
                                            {
                                                SubLObject cdolist_list_var_2 = inference_datastructures_proof.all_proof_subproofs(proof);
                                                SubLObject subproof = NIL;
                                                for (subproof = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , subproof = cdolist_list_var_2.first()) {
                                                    if (NIL != inference_worker_removal.removal_proof_p(subproof)) {
                                                        {
                                                            SubLObject proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                                            if (hl_module == proof_hl_module) {
                                                                return T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_some_proof_uses_removal_moduleP(final SubLObject inference, final SubLObject hl_module) {
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$3 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$3);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$4;
                SubLObject proof;
                SubLObject cdolist_list_var_$5;
                SubLObject subproof;
                SubLObject proof_hl_module;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$4 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = NIL;
                            proof = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                cdolist_list_var_$5 = inference_datastructures_proof.all_proof_subproofs(proof);
                                subproof = NIL;
                                subproof = cdolist_list_var_$5.first();
                                while (NIL != cdolist_list_var_$5) {
                                    if (NIL != inference_worker_removal.removal_proof_p(subproof)) {
                                        proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                        if (hl_module.eql(proof_hl_module)) {
                                            return T;
                                        }
                                    }
                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                    subproof = cdolist_list_var_$5.first();
                                } 
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                proof = cdolist_list_var_$4.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$4 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$4)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$4);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$6 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = NIL;
                            proof2 = cdolist_list_var_$6.first();
                            while (NIL != cdolist_list_var_$6) {
                                SubLObject cdolist_list_var_$7 = inference_datastructures_proof.all_proof_subproofs(proof2);
                                SubLObject subproof2 = NIL;
                                subproof2 = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    if (NIL != inference_worker_removal.removal_proof_p(subproof2)) {
                                        final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module(subproof2);
                                        if (hl_module.eql(proof_hl_module2)) {
                                            return T;
                                        }
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    subproof2 = cdolist_list_var_$7.first();
                                } 
                                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                proof2 = cdolist_list_var_$6.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject inference_some_proof_uses_transformation_moduleP_alt(SubLObject inference, SubLObject hl_module) {
        {
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                SubLObject justification = NIL;
                                for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_3 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                        SubLObject proof = NIL;
                                        for (proof = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , proof = cdolist_list_var_3.first()) {
                                            {
                                                SubLObject cdolist_list_var_4 = inference_datastructures_proof.all_proof_subproofs(proof);
                                                SubLObject subproof = NIL;
                                                for (subproof = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , subproof = cdolist_list_var_4.first()) {
                                                    if (NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                                                        {
                                                            SubLObject proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                                            if (hl_module == proof_hl_module) {
                                                                return T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_some_proof_uses_transformation_moduleP(final SubLObject inference, final SubLObject hl_module) {
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$9 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$9);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$10;
                SubLObject proof;
                SubLObject cdolist_list_var_$11;
                SubLObject subproof;
                SubLObject proof_hl_module;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$10 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = NIL;
                            proof = cdolist_list_var_$10.first();
                            while (NIL != cdolist_list_var_$10) {
                                cdolist_list_var_$11 = inference_datastructures_proof.all_proof_subproofs(proof);
                                subproof = NIL;
                                subproof = cdolist_list_var_$11.first();
                                while (NIL != cdolist_list_var_$11) {
                                    if (NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                                        proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                        if (hl_module.eql(proof_hl_module)) {
                                            return T;
                                        }
                                    }
                                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                    subproof = cdolist_list_var_$11.first();
                                } 
                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                proof = cdolist_list_var_$10.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$10 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$10)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$10);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$12 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = NIL;
                            proof2 = cdolist_list_var_$12.first();
                            while (NIL != cdolist_list_var_$12) {
                                SubLObject cdolist_list_var_$13 = inference_datastructures_proof.all_proof_subproofs(proof2);
                                SubLObject subproof2 = NIL;
                                subproof2 = cdolist_list_var_$13.first();
                                while (NIL != cdolist_list_var_$13) {
                                    if (NIL != inference_worker_transformation.transformation_proof_p(subproof2)) {
                                        final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module(subproof2);
                                        if (hl_module.eql(proof_hl_module2)) {
                                            return T;
                                        }
                                    }
                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                    subproof2 = cdolist_list_var_$13.first();
                                } 
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                proof2 = cdolist_list_var_$12.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject inference_removal_modules_used_in_proofs_alt(SubLObject inference) {
        {
            SubLObject hl_modules = NIL;
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                SubLObject justification = NIL;
                                for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_5 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                        SubLObject proof = NIL;
                                        for (proof = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , proof = cdolist_list_var_5.first()) {
                                            {
                                                SubLObject cdolist_list_var_6 = inference_datastructures_proof.all_proof_subproofs(proof);
                                                SubLObject subproof = NIL;
                                                for (subproof = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , subproof = cdolist_list_var_6.first()) {
                                                    if (NIL != inference_worker_removal.removal_proof_p(subproof)) {
                                                        {
                                                            SubLObject proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                                            hl_modules = cons(proof_hl_module, hl_modules);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return list_utilities.fast_delete_duplicates(hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject inference_removal_modules_used_in_proofs(final SubLObject inference) {
        SubLObject hl_modules = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$15 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$15, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$15);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$16;
                SubLObject proof;
                SubLObject cdolist_list_var_$17;
                SubLObject subproof;
                SubLObject proof_hl_module;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$16 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = NIL;
                            proof = cdolist_list_var_$16.first();
                            while (NIL != cdolist_list_var_$16) {
                                cdolist_list_var_$17 = inference_datastructures_proof.all_proof_subproofs(proof);
                                subproof = NIL;
                                subproof = cdolist_list_var_$17.first();
                                while (NIL != cdolist_list_var_$17) {
                                    if (NIL != inference_worker_removal.removal_proof_p(subproof)) {
                                        proof_hl_module = inference_worker.content_proof_hl_module(subproof);
                                        hl_modules = cons(proof_hl_module, hl_modules);
                                    }
                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                    subproof = cdolist_list_var_$17.first();
                                } 
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                proof = cdolist_list_var_$16.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$16 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$16)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$16);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$18 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = NIL;
                            proof2 = cdolist_list_var_$18.first();
                            while (NIL != cdolist_list_var_$18) {
                                SubLObject cdolist_list_var_$19 = inference_datastructures_proof.all_proof_subproofs(proof2);
                                SubLObject subproof2 = NIL;
                                subproof2 = cdolist_list_var_$19.first();
                                while (NIL != cdolist_list_var_$19) {
                                    if (NIL != inference_worker_removal.removal_proof_p(subproof2)) {
                                        final SubLObject proof_hl_module2 = inference_worker.content_proof_hl_module(subproof2);
                                        hl_modules = cons(proof_hl_module2, hl_modules);
                                    }
                                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                    subproof2 = cdolist_list_var_$19.first();
                                } 
                                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                proof2 = cdolist_list_var_$18.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return fast_delete_duplicates(hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of lists of answers for INFERENCE where the answers
     * are organized into groups such that all answers are supported by the
     * same set of rules.
     */
    @LispMethod(comment = "Return a list of lists of answers for INFERENCE where the answers\r\nare organized into groups such that all answers are supported by the\r\nsame set of rules.\nReturn a list of lists of answers for INFERENCE where the answers\nare organized into groups such that all answers are supported by the\nsame set of rules.")
    public static final SubLObject categorize_inference_answers_via_rules_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules_to_answer_map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                        SubLObject v_answer = NIL;
                        while (NIL != id) {
                            v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                                {
                                    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                    SubLObject justification = NIL;
                                    for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                        {
                                            SubLObject rules = inference_datastructures_inference.inference_answer_justification_rules(justification);
                                            dictionary_utilities.dictionary_push(rules_to_answer_map, rules, v_answer);
                                        }
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, T, id, state_var);
                            state_var = do_id_index_next_state(idx, T, id, state_var);
                        } 
                    }
                }
                {
                    SubLObject answer_lists = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rules_to_answer_map));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject answers = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            answers = nreverse(answers);
                            answer_lists = cons(answers, answer_lists);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    answer_lists = Sort.sort(answer_lists, $sym52$INFERENCE_ANSWER__, symbol_function(FIRST));
                    return answer_lists;
                }
            }
        }
    }

    /**
     * Return a list of lists of answers for INFERENCE where the answers
     * are organized into groups such that all answers are supported by the
     * same set of rules.
     */
    @LispMethod(comment = "Return a list of lists of answers for INFERENCE where the answers\r\nare organized into groups such that all answers are supported by the\r\nsame set of rules.\nReturn a list of lists of answers for INFERENCE where the answers\nare organized into groups such that all answers are supported by the\nsame set of rules.")
    public static SubLObject categorize_inference_answers_via_rules(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules_to_answer_map = new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$21 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$21);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject rules;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            rules = inference_datastructures_inference.inference_answer_justification_rules(justification);
                            dictionary_push(rules_to_answer_map, rules, v_answer);
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$22 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$22)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$22);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$22);
                final SubLObject end_id = id_index_next_id(idx_$22);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_answer2))) {
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject rules2 = inference_datastructures_inference.inference_answer_justification_rules(justification2);
                            dictionary_push(rules_to_answer_map, rules2, v_answer2);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        } 
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        SubLObject answer_lists = NIL;
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(rules_to_answer_map)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = do_dictionary_contents_key_value(iteration_state);
            SubLObject answers = thread.secondMultipleValue();
            thread.resetMultipleValues();
            answers = nreverse(answers);
            answer_lists = cons(answers, answer_lists);
        }
        do_dictionary_contents_finalize(iteration_state);
        answer_lists = Sort.sort(answer_lists, inference_utilities.$sym71$INFERENCE_ANSWER__, symbol_function(FIRST));
        return answer_lists;
    }

    /**
     * Sub HL-BINDINGS into RULE and see how much of RULE is still unknown yet possible.
     *
     * @param RULE
    assertion-p;
     * 		
     * @param HL-BINDINGS
    bindings-p;
     * 		
     * @param UNBOUND-VAR-MAX
     * 		integerp or :NONE; a limit on how many unbound variables the answers may have.
     * @param MT
     * 		hlmt-p; the context from which to do inference.
     * @param PROBLEM-STORE
     * 		problem-store-p; in which to do inference.
     * @return listp of CNF-P with EL variables.
     * @unknown baxter
     */
    @LispMethod(comment = "Sub HL-BINDINGS into RULE and see how much of RULE is still unknown yet possible.\r\n\r\n@param RULE\nassertion-p;\r\n\t\t\r\n@param HL-BINDINGS\nbindings-p;\r\n\t\t\r\n@param UNBOUND-VAR-MAX\r\n\t\tintegerp or :NONE; a limit on how many unbound variables the answers may have.\r\n@param MT\r\n\t\thlmt-p; the context from which to do inference.\r\n@param PROBLEM-STORE\r\n\t\tproblem-store-p; in which to do inference.\r\n@return listp of CNF-P with EL variables.\r\n@unknown baxter")
    public static final SubLObject unsatisfied_cnfs_for_rule_alt(SubLObject rule, SubLObject hl_bindings, SubLObject unbound_var_max, SubLObject mt, SubLObject problem_store) {
        if (unbound_var_max == UNPROVIDED) {
            unbound_var_max = $NONE;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (problem_store == UNPROVIDED) {
            problem_store = $UNSPECIFIED;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subbed_rule_formula = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnf_subbed_rule_formula_from_bindings(rule, hl_bindings, mt);
                SubLObject new_problem_storeP = makeBoolean(NIL == inference_datastructures_problem_store.valid_problem_store_p(problem_store));
                SubLObject ans = NIL;
                if (NIL != new_problem_storeP) {
                    problem_store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
                }
                try {
                    if ((NIL != el_implication_p(subbed_rule_formula)) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnf_rejectP(subbed_rule_formula, mt, list($PROBLEM_STORE, problem_store)))) {
                        {
                            SubLObject datum = formula_args(subbed_rule_formula, UNPROVIDED);
                            SubLObject current = datum;
                            SubLObject antecedent = NIL;
                            SubLObject consequent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt56);
                            antecedent = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt56);
                            consequent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (!((NIL == expression_find_if($sym57$EL_VAR_, consequent, UNPROVIDED, UNPROVIDED)) && (NIL != inference_kernel.new_cyc_query(consequent, mt, list($PROBLEM_STORE, problem_store))))) {
                                    {
                                        SubLObject inference_static_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $BINDINGS);
                                        SubLObject inference = inference_kernel.new_continuable_inference(antecedent, mt, inference_static_properties);
                                        SubLObject inference_dynamic_properties = list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw12$CACHE_INFERENCE_RESULTS_, NIL, $kw60$FORGET_EXTRA_RESULTS_, T, $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnfs_time_cutoff() });
                                        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings = inference_kernel.continue_inference(inference, inference_dynamic_properties);
                                                SubLObject exit_condition = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnfs_ok_inference_result_p(v_bindings, exit_condition))) {
                                                    {
                                                        SubLObject root_mapped_problem = inference_datastructures_inference.inference_root_mapped_problem(inference);
                                                        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                                                        SubLObject subproblem_paths = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_td_subproblem_paths(root_mapped_problem, strategy);
                                                        SubLObject contextualized_cnfs = com.cyc.cycjava.cycl.inference.harness.inference_utilities.reconstruct_partially_satisfied_el_cnfs_from_td_subpaths(inference, subproblem_paths, consequent, mt);
                                                        inference_datastructures_inference.destroy_inference(inference);
                                                        ans = inference_czer.decontextualize_clauses(com.cyc.cycjava.cycl.inference.harness.inference_utilities.filter_unsatisfied_cnfs(contextualized_cnfs, unbound_var_max), mt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt56);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != new_problem_storeP) {
                                inference_datastructures_problem_store.destroy_problem_store(problem_store);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Sub HL-BINDINGS into RULE and see how much of RULE is still unknown yet possible.
     *
     * @param RULE
    		assertion-p;
     * 		
     * @param HL-BINDINGS
    		bindings-p;
     * 		
     * @param UNBOUND-VAR-MAX
     * 		integerp or :NONE; a limit on how many unbound variables the answers may have.
     * @param MT
     * 		hlmt-p; the context from which to do inference.
     * @param PROBLEM-STORE
     * 		problem-store-p; in which to do inference.
     * @return listp of CNF-P with EL variables.
     * @unknown baxter
     */
    @LispMethod(comment = "Sub HL-BINDINGS into RULE and see how much of RULE is still unknown yet possible.\r\n\r\n@param RULE\n\t\tassertion-p;\r\n\t\t\r\n@param HL-BINDINGS\n\t\tbindings-p;\r\n\t\t\r\n@param UNBOUND-VAR-MAX\r\n\t\tintegerp or :NONE; a limit on how many unbound variables the answers may have.\r\n@param MT\r\n\t\thlmt-p; the context from which to do inference.\r\n@param PROBLEM-STORE\r\n\t\tproblem-store-p; in which to do inference.\r\n@return listp of CNF-P with EL variables.\r\n@unknown baxter")
    public static SubLObject unsatisfied_cnfs_for_rule(final SubLObject rule, final SubLObject hl_bindings, SubLObject unbound_var_max, SubLObject mt, SubLObject problem_store) {
        if (unbound_var_max == UNPROVIDED) {
            unbound_var_max = $NONE;
        }
        if (mt == UNPROVIDED) {
            mt = $mt$.getDynamicValue();
        }
        if (problem_store == UNPROVIDED) {
            problem_store = $UNSPECIFIED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subbed_rule_formula = inference_utilities.unsatisfied_cnf_subbed_rule_formula_from_bindings(rule, hl_bindings, mt);
        final SubLObject new_problem_storeP = makeBoolean(NIL == inference_datastructures_problem_store.valid_problem_store_p(problem_store));
        SubLObject ans = NIL;
        if (NIL != new_problem_storeP) {
            problem_store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
        }
        try {
            if ((NIL != el_implication_p(subbed_rule_formula)) && (NIL == inference_utilities.unsatisfied_cnf_rejectP(subbed_rule_formula, mt, list($PROBLEM_STORE, problem_store)))) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(subbed_rule_formula, UNPROVIDED);
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                destructuring_bind_must_consp(current, datum, inference_utilities.$list74);
                antecedent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_utilities.$list74);
                consequent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != cycl_utilities.expression_find_if(inference_utilities.$sym75$EL_VAR_, consequent, UNPROVIDED, UNPROVIDED)) || (NIL == inference_kernel.new_cyc_query(consequent, mt, list($PROBLEM_STORE, problem_store)))) {
                        final SubLObject inference_static_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $BINDINGS);
                        final SubLObject inference = inference_kernel.new_continuable_inference(antecedent, mt, inference_static_properties);
                        final SubLObject inference_dynamic_properties = list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, inference_utilities.$kw16$CACHE_INFERENCE_RESULTS_, NIL, inference_utilities.$kw18$FORGET_EXTRA_RESULTS_, T, $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, inference_utilities.unsatisfied_cnfs_time_cutoff() });
                        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings = inference_kernel.continue_inference(inference, inference_dynamic_properties);
                            final SubLObject exit_condition = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)) && (NIL != inference_utilities.unsatisfied_cnfs_ok_inference_result_p(v_bindings, exit_condition))) {
                                final SubLObject root_mapped_problem = inference_datastructures_inference.inference_root_mapped_problem(inference);
                                final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                                final SubLObject subproblem_paths = inference_utilities.unsatisfied_td_subproblem_paths(root_mapped_problem, strategy);
                                final SubLObject contextualized_cnfs = inference_utilities.reconstruct_partially_satisfied_el_cnfs_from_td_subpaths(inference, subproblem_paths, consequent, mt);
                                inference_datastructures_inference.destroy_inference(inference);
                                ans = inference_czer.decontextualize_clauses(inference_utilities.filter_unsatisfied_cnfs(contextualized_cnfs, unbound_var_max), mt);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_utilities.$list74);
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != new_problem_storeP) {
                    inference_datastructures_problem_store.destroy_problem_store(problem_store);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    /**
     * How many seconds we allow to try to find further bindings for the current rule.
     */
    @LispMethod(comment = "How many seconds we allow to try to find further bindings for the current rule.")
    public static final SubLObject unsatisfied_cnfs_time_cutoff_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $unsatisfied_cnfs_time_cutoff$.getDynamicValue(thread);
        }
    }

    /**
     * How many seconds we allow to try to find further bindings for the current rule.
     */
    @LispMethod(comment = "How many seconds we allow to try to find further bindings for the current rule.")
    public static SubLObject unsatisfied_cnfs_time_cutoff() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_utilities.$unsatisfied_cnfs_time_cutoff$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return EL-FORMULA-P left after subbing HL-BINDINGS in to RULE.
     */
    @LispMethod(comment = "@return EL-FORMULA-P left after subbing HL-BINDINGS in to RULE.")
    public static final SubLObject unsatisfied_cnf_subbed_rule_formula_from_bindings_alt(SubLObject rule, SubLObject hl_bindings, SubLObject mt) {
        {
            SubLObject cnf_copy = copy_tree(assertions_high.assertion_cnf(rule));
            SubLObject el_vars = assertions_high.assertion_el_variables(rule);
            SubLObject ans = NIL;
            if (NIL != hl_bindings) {
                cnf_copy = bindings.napply_bindings(hl_bindings, cnf_copy);
            }
            ans = uncanonicalizer.cnf_el_formula(cnf_copy, mt, el_vars);
            return ans;
        }
    }

    /**
     *
     *
     * @return EL-FORMULA-P left after subbing HL-BINDINGS in to RULE.
     */
    @LispMethod(comment = "@return EL-FORMULA-P left after subbing HL-BINDINGS in to RULE.")
    public static SubLObject unsatisfied_cnf_subbed_rule_formula_from_bindings(final SubLObject rule, final SubLObject hl_bindings, final SubLObject mt) {
        SubLObject cnf_copy = copy_tree(assertion_cnf(rule));
        final SubLObject el_vars = assertion_el_variables(rule);
        SubLObject ans = NIL;
        if (NIL != hl_bindings) {
            cnf_copy = napply_bindings(hl_bindings, cnf_copy);
        }
        ans = cnf_el_formula(cnf_copy, mt, el_vars);
        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Should we reject EL-IMPLICATION on the basis that either its
    consequent is already known, or that either its consequent or its antecedent is known
    not* to hold?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we reject EL-IMPLICATION on the basis that either its\r\nconsequent is already known, or that either its consequent or its antecedent is known\r\nnot* to hold?")
    public static final SubLObject unsatisfied_cnf_rejectP_alt(SubLObject el_implication, SubLObject mt, SubLObject inference_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = formula_args(el_implication, UNPROVIDED);
                SubLObject current = datum;
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt56);
                antecedent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt56);
                consequent = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rejectedP = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnf_reject_knownP(consequent, mt, inference_properties);
                        thread.resetMultipleValues();
                        {
                            SubLObject cnf = clausifier.cnf_clausal_form(el_implication, mt);
                            SubLObject new_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == rejectedP) {
                                {
                                    SubLObject csome_list_var = cnf;
                                    SubLObject clause = NIL;
                                    for (clause = csome_list_var.first(); !((NIL != rejectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                                        {
                                            SubLObject open_asents = NIL;
                                            {
                                                SubLObject index_var = ZERO_INTEGER;
                                                SubLObject cdolist_list_var = clauses.neg_lits(clause);
                                                SubLObject lit = NIL;
                                                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject sense = $NEG;
                                                        if (NIL != rejectedP) {
                                                        } else {
                                                            if (NIL != term.open_termP(lit, $sym57$EL_VAR_)) {
                                                                open_asents = cons(lit, open_asents);
                                                            } else {
                                                                rejectedP = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnf_reject_knownP(make_negation(lit), new_mt, inference_properties);
                                                            }
                                                        }
                                                    }
                                                    index_var = add(index_var, ONE_INTEGER);
                                                }
                                            }
                                            {
                                                SubLObject index_var = ZERO_INTEGER;
                                                SubLObject cdolist_list_var = clauses.pos_lits(clause);
                                                SubLObject lit = NIL;
                                                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject sense = $POS;
                                                        if (NIL != rejectedP) {
                                                        } else {
                                                            if (NIL != term.open_termP(lit, $sym57$EL_VAR_)) {
                                                                open_asents = cons(lit, open_asents);
                                                            } else {
                                                                rejectedP = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_cnf_reject_knownP(make_negation(lit), new_mt, inference_properties);
                                                            }
                                                        }
                                                    }
                                                    index_var = add(index_var, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return rejectedP;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt56);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Should we reject EL-IMPLICATION on the basis that either its
    consequent is already known, or that either its consequent or its antecedent is known
    not* to hold?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we reject EL-IMPLICATION on the basis that either its\r\nconsequent is already known, or that either its consequent or its antecedent is known\r\nnot* to hold?")
    public static SubLObject unsatisfied_cnf_rejectP(final SubLObject el_implication, final SubLObject mt, final SubLObject inference_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(el_implication, UNPROVIDED);
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(current, datum, inference_utilities.$list74);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list74);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject rejectedP = inference_utilities.unsatisfied_cnf_reject_knownP(consequent, mt, inference_properties);
            thread.resetMultipleValues();
            final SubLObject cnf = cnf_clausal_form(el_implication, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == rejectedP) {
                SubLObject csome_list_var = cnf;
                SubLObject clause = NIL;
                clause = csome_list_var.first();
                while ((NIL == rejectedP) && (NIL != csome_list_var)) {
                    SubLObject open_asents = NIL;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var = neg_lits(clause);
                    SubLObject lit = NIL;
                    lit = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject sense = $NEG;
                        if (NIL == rejectedP) {
                            if (NIL != open_termP(lit, inference_utilities.$sym75$EL_VAR_)) {
                                open_asents = cons(lit, open_asents);
                            } else {
                                rejectedP = inference_utilities.unsatisfied_cnf_reject_knownP(make_negation(lit), new_mt, inference_properties);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        lit = cdolist_list_var.first();
                    } 
                    index_var = ZERO_INTEGER;
                    cdolist_list_var = pos_lits(clause);
                    lit = NIL;
                    lit = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject sense = $POS;
                        if (NIL == rejectedP) {
                            if (NIL != open_termP(lit, inference_utilities.$sym75$EL_VAR_)) {
                                open_asents = cons(lit, open_asents);
                            } else {
                                rejectedP = inference_utilities.unsatisfied_cnf_reject_knownP(make_negation(lit), new_mt, inference_properties);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        lit = cdolist_list_var.first();
                    } 
                    csome_list_var = csome_list_var.rest();
                    clause = csome_list_var.first();
                } 
            }
            return rejectedP;
        }
        cdestructuring_bind_error(datum, inference_utilities.$list74);
        return NIL;
    }

    public static final SubLObject unsatisfied_cnf_reject_knownP_alt(SubLObject el_formula, SubLObject mt, SubLObject inference_properties) {
        return makeBoolean((NIL != closedP(el_formula, $sym57$EL_VAR_)) && (NIL != inference_kernel.new_cyc_query(el_formula, mt, inference_properties)));
    }

    public static SubLObject unsatisfied_cnf_reject_knownP(final SubLObject el_formula, final SubLObject mt, final SubLObject inference_properties) {
        return makeBoolean((NIL != closedP(el_formula, inference_utilities.$sym75$EL_VAR_)) && (NIL != inference_kernel.new_cyc_query(el_formula, mt, inference_properties)));
    }

    public static final SubLObject unsatisfied_cnfs_ok_inference_result_p_alt(SubLObject v_bindings, SubLObject exit_condition) {
        return makeBoolean((NIL == v_bindings) && (NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)));
    }

    public static SubLObject unsatisfied_cnfs_ok_inference_result_p(final SubLObject v_bindings, final SubLObject exit_condition) {
        return makeBoolean((NIL == v_bindings) && (NIL == inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)));
    }

    public static final SubLObject filter_unsatisfied_cnfs_alt(SubLObject cnfs, SubLObject unbound_var_max) {
        if (!unbound_var_max.isInteger()) {
            return cnfs;
        }
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                if (NIL != list_utilities.lengthLE(list_utilities.tree_gather(cnf, $sym57$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED), unbound_var_max, UNPROVIDED)) {
                    ans = cons(cnf, ans);
                }
            }
            return ans;
        }
    }

    public static SubLObject filter_unsatisfied_cnfs(final SubLObject cnfs, final SubLObject unbound_var_max) {
        if (!unbound_var_max.isInteger()) {
            return cnfs;
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lengthLE(tree_gather(cnf, inference_utilities.$sym75$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED), unbound_var_max, UNPROVIDED)) {
                ans = cons(cnf, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     *
     *
     * @param ROOT-MAPPED-PROBLEM
     * 		mapped-problem-p; an unsatisfied problem.
     * @return LISTP; of (MAPPED-PROBLEM*) lists, in top-down order starting-with ROOT-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@param ROOT-MAPPED-PROBLEM\r\n\t\tmapped-problem-p; an unsatisfied problem.\r\n@return LISTP; of (MAPPED-PROBLEM*) lists, in top-down order starting-with ROOT-MAPPED-PROBLEM.")
    public static final SubLObject unsatisfied_td_subproblem_paths_alt(SubLObject root_mapped_problem, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt62$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(root_problem);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state_7 = NIL;
                                    for (state_7 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_7); state_7 = set_contents.do_set_contents_update_state(state_7)) {
                                        {
                                            SubLObject link = set_contents.do_set_contents_next(basis_object, state_7);
                                            if (NIL != set_contents.do_set_contents_element_validP(state_7, link)) {
                                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $SPLIT)) {
                                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.partially_satisfied_split_link_p(link, strategy)) {
                                                        {
                                                            SubLObject link_var = link;
                                                            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                                            SubLObject mapped_supporting_problem = NIL;
                                                            for (mapped_supporting_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_supporting_problem = cdolist_list_var.first()) {
                                                                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_supporting_problem)) {
                                                                    {
                                                                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_supporting_problem);
                                                                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.satisfied_problemP(supporting_problem, strategy)) {
                                                                            {
                                                                                SubLObject cdolist_list_var_8 = com.cyc.cycjava.cycl.inference.harness.inference_utilities.unsatisfied_td_subproblem_paths(mapped_supporting_problem, strategy);
                                                                                SubLObject subpath = NIL;
                                                                                for (subpath = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , subpath = cdolist_list_var_8.first()) {
                                                                                    ans = cons(cons(root_mapped_problem, subpath), ans);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == ans) {
                    ans = list(list(root_mapped_problem));
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param ROOT-MAPPED-PROBLEM
     * 		mapped-problem-p; an unsatisfied problem.
     * @return LISTP; of (MAPPED-PROBLEM*) lists, in top-down order starting-with ROOT-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@param ROOT-MAPPED-PROBLEM\r\n\t\tmapped-problem-p; an unsatisfied problem.\r\n@return LISTP; of (MAPPED-PROBLEM*) lists, in top-down order starting-with ROOT-MAPPED-PROBLEM.")
    public static SubLObject unsatisfied_td_subproblem_paths(final SubLObject root_mapped_problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
        final SubLObject local_state;
        final SubLObject state = local_state = new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(root_problem);
                SubLObject basis_object;
                SubLObject state_$23;
                SubLObject link;
                SubLObject link_var;
                SubLObject cdolist_list_var;
                SubLObject mapped_supporting_problem;
                SubLObject supporting_problem;
                SubLObject cdolist_list_var_$24;
                SubLObject subpath;
                for (basis_object = do_set_contents_basis_object(set_contents_var), state_$23 = NIL, state_$23 = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state_$23); state_$23 = do_set_contents_update_state(state_$23)) {
                    link = do_set_contents_next(basis_object, state_$23);
                    if (((NIL != do_set_contents_element_validP(state_$23, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $SPLIT))) && (NIL != inference_utilities.partially_satisfied_split_link_p(link, strategy))) {
                        link_var = link;
                        cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                        mapped_supporting_problem = NIL;
                        mapped_supporting_problem = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_supporting_problem)) {
                                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_supporting_problem);
                                if (NIL == inference_utilities.satisfied_problemP(supporting_problem, strategy)) {
                                    cdolist_list_var_$24 = inference_utilities.unsatisfied_td_subproblem_paths(mapped_supporting_problem, strategy);
                                    subpath = NIL;
                                    subpath = cdolist_list_var_$24.first();
                                    while (NIL != cdolist_list_var_$24) {
                                        ans = cons(cons(root_mapped_problem, subpath), ans);
                                        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                        subpath = cdolist_list_var_$24.first();
                                    } 
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            mapped_supporting_problem = cdolist_list_var.first();
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL == ans) {
            ans = list(list(root_mapped_problem));
        }
        return ans;
    }

    public static final SubLObject satisfied_problemP_internal_alt(SubLObject problem, SubLObject strategy) {
        if (NIL != inference_worker.good_problem_p(problem, strategy)) {
            return T;
        } else {
            if ((NIL == inference_worker.no_good_problem_p(problem, strategy)) && (NIL != inference_worker.potentially_possible_problem_p(problem, strategy))) {
                {
                    SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
                    SubLObject problem_store = inference_datastructures_problem.problem_store(problem);
                    SubLObject v_properties = list($PROBLEM_STORE, problem_store);
                    SubLObject problem_query_formula = inference_czer.problem_query_formula(problem_query);
                    SubLObject recursive_query_result = inference_kernel.new_cyc_query(problem_query_formula, NIL, v_properties);
                    return list_utilities.sublisp_boolean(recursive_query_result);
                }
            }
        }
        return NIL;
    }

    public static SubLObject satisfied_problemP_internal(final SubLObject problem, final SubLObject strategy) {
        if (NIL != inference_worker.good_problem_p(problem, strategy)) {
            return T;
        }
        if ((NIL == inference_worker.no_good_problem_p(problem, strategy)) && (NIL != inference_worker.potentially_possible_problem_p(problem, strategy))) {
            final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
            final SubLObject problem_store = inference_datastructures_problem.problem_store(problem);
            final SubLObject v_properties = list($PROBLEM_STORE, problem_store);
            final SubLObject problem_query_formula = inference_czer.problem_query_formula(problem_query);
            final SubLObject recursive_query_result = inference_kernel.new_cyc_query(problem_query_formula, NIL, v_properties);
            return sublisp_boolean(recursive_query_result);
        }
        return NIL;
    }

    public static final SubLObject satisfied_problemP_alt(SubLObject problem, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_utilities.satisfied_problemP_internal(problem, strategy);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym64$SATISFIED_PROBLEM_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym64$SATISFIED_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym64$SATISFIED_PROBLEM_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(problem, strategy);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw65$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (problem == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (strategy == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_utilities.satisfied_problemP_internal(problem, strategy)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, strategy));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject satisfied_problemP(final SubLObject problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_utilities.satisfied_problemP_internal(problem, strategy);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_utilities.$sym80$SATISFIED_PROBLEM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_utilities.$sym80$SATISFIED_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_utilities.$sym80$SATISFIED_PROBLEM_, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_2(problem, strategy);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && strategy.eql(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_utilities.satisfied_problemP_internal(problem, strategy)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, strategy));
        return caching_results(results3);
    }

    public static final SubLObject partially_satisfied_split_link_p_alt(SubLObject link, SubLObject strategy) {
        {
            SubLObject found_satisfiedP = NIL;
            SubLObject found_unsatisfiedP = NIL;
            SubLObject link_var = link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    {
                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.satisfied_problemP(supporting_problem, strategy)) {
                            found_satisfiedP = T;
                        } else {
                            found_unsatisfiedP = T;
                        }
                    }
                }
            }
            return makeBoolean((NIL != found_satisfiedP) && (NIL != found_unsatisfiedP));
        }
    }

    public static SubLObject partially_satisfied_split_link_p(final SubLObject link, final SubLObject strategy) {
        SubLObject found_satisfiedP = NIL;
        SubLObject found_unsatisfiedP = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL != inference_utilities.satisfied_problemP(supporting_problem, strategy)) {
                    found_satisfiedP = T;
                } else {
                    found_unsatisfiedP = T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return makeBoolean((NIL != found_satisfiedP) && (NIL != found_unsatisfiedP));
    }

    public static final SubLObject reconstruct_partially_satisfied_el_cnfs_from_td_subpaths_alt(SubLObject inference, SubLObject td_subpaths, SubLObject consequent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject antecedent_cnfs = NIL;
                SubLObject ans = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject consequent_cnfs = clausifier.cnf_clausal_form(consequent, mt);
                    SubLObject new_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    consequent_cnfs = inference_czer.contextualize_clauses(consequent_cnfs, new_mt, UNPROVIDED);
                    {
                        SubLObject neg_lits = NIL;
                        SubLObject pos_lits = NIL;
                        SubLObject cdolist_list_var = td_subpaths;
                        SubLObject td_subpath = NIL;
                        for (td_subpath = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , td_subpath = cdolist_list_var.first()) {
                            {
                                SubLObject bu_subpath = nreverse(td_subpath);
                                SubLObject mapped_terminal_problem = bu_subpath.first();
                                SubLObject terminal_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_terminal_problem);
                                SubLObject hl_dnfs = inference_datastructures_problem.problem_query(terminal_problem);
                                {
                                    SubLObject cdolist_list_var_10 = bu_subpath;
                                    SubLObject mapped_problem = NIL;
                                    for (mapped_problem = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , mapped_problem = cdolist_list_var_10.first()) {
                                        {
                                            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
                                            hl_dnfs = bindings.apply_bindings_backwards(variable_map, hl_dnfs);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_11 = hl_dnfs;
                                    SubLObject hl_dnf = NIL;
                                    for (hl_dnf = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , hl_dnf = cdolist_list_var_11.first()) {
                                        neg_lits = append(neg_lits, clauses.neg_lits(hl_dnf));
                                        pos_lits = append(pos_lits, clauses.pos_lits(hl_dnf));
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cnf = clauses.make_clause(neg_lits, pos_lits);
                            SubLObject el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
                            antecedent_cnfs = cons(bindings.apply_bindings_backwards(el_bindings, cnf), antecedent_cnfs);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = antecedent_cnfs;
                        SubLObject antecedent_cnf = NIL;
                        for (antecedent_cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_cnf = cdolist_list_var.first()) {
                            {
                                SubLObject antecedent_neg_lits = clauses.neg_lits(antecedent_cnf);
                                SubLObject antecedent_pos_lits = clauses.pos_lits(antecedent_cnf);
                                SubLObject cdolist_list_var_12 = consequent_cnfs;
                                SubLObject consequent_cnf = NIL;
                                for (consequent_cnf = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , consequent_cnf = cdolist_list_var_12.first()) {
                                    {
                                        SubLObject consequent_neg_lits = clauses.neg_lits(consequent_cnf);
                                        SubLObject consequent_pos_lits = clauses.pos_lits(consequent_cnf);
                                        ans = cons(clauses.make_clause(append(antecedent_pos_lits, consequent_neg_lits), append(antecedent_neg_lits, consequent_pos_lits)), ans);
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject reconstruct_partially_satisfied_el_cnfs_from_td_subpaths(final SubLObject inference, final SubLObject td_subpaths, final SubLObject consequent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent_cnfs = NIL;
        SubLObject ans = NIL;
        thread.resetMultipleValues();
        SubLObject consequent_cnfs = cnf_clausal_form(consequent, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        consequent_cnfs = inference_czer.contextualize_clauses(consequent_cnfs, new_mt, UNPROVIDED);
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject cdolist_list_var = td_subpaths;
        SubLObject td_subpath = NIL;
        td_subpath = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bu_subpath = nreverse(td_subpath);
            final SubLObject mapped_terminal_problem = bu_subpath.first();
            final SubLObject terminal_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_terminal_problem);
            SubLObject hl_dnfs = inference_datastructures_problem.problem_query(terminal_problem);
            SubLObject cdolist_list_var_$26 = bu_subpath;
            SubLObject mapped_problem = NIL;
            mapped_problem = cdolist_list_var_$26.first();
            while (NIL != cdolist_list_var_$26) {
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
                hl_dnfs = apply_bindings_backwards(variable_map, hl_dnfs);
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                mapped_problem = cdolist_list_var_$26.first();
            } 
            SubLObject cdolist_list_var_$27 = hl_dnfs;
            SubLObject hl_dnf = NIL;
            hl_dnf = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                neg_lits = append(neg_lits, neg_lits(hl_dnf));
                pos_lits = append(pos_lits, pos_lits(hl_dnf));
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                hl_dnf = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            td_subpath = cdolist_list_var.first();
        } 
        final SubLObject cnf = make_clause(neg_lits, pos_lits);
        final SubLObject el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
        SubLObject cdolist_list_var2;
        antecedent_cnfs = cdolist_list_var2 = cons(apply_bindings_backwards(el_bindings, cnf), antecedent_cnfs);
        SubLObject antecedent_cnf = NIL;
        antecedent_cnf = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject antecedent_neg_lits = neg_lits(antecedent_cnf);
            final SubLObject antecedent_pos_lits = pos_lits(antecedent_cnf);
            SubLObject cdolist_list_var_$28 = consequent_cnfs;
            SubLObject consequent_cnf = NIL;
            consequent_cnf = cdolist_list_var_$28.first();
            while (NIL != cdolist_list_var_$28) {
                final SubLObject consequent_neg_lits = neg_lits(consequent_cnf);
                final SubLObject consequent_pos_lits = pos_lits(consequent_cnf);
                ans = cons(make_clause(append(antecedent_pos_lits, consequent_neg_lits), append(antecedent_neg_lits, consequent_pos_lits)), ans);
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                consequent_cnf = cdolist_list_var_$28.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            antecedent_cnf = cdolist_list_var2.first();
        } 
        return ans;
    }

    /**
     *
     *
     * @param inference
    inference-p
     * 		
     * @param thinking
    thinking-task-p
     * 		
     * @return inference
    Halt the thread associated with the task THINKING by aborting INFERENCE.
     */
    @LispMethod(comment = "@param inference\ninference-p\r\n\t\t\r\n@param thinking\nthinking-task-p\r\n\t\t\r\n@return inference\r\nHalt the thread associated with the task THINKING by aborting INFERENCE.")
    public static final SubLObject inference_thinking_task_abort_alt(SubLObject inference, SubLObject thinking) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference, INFERENCE_P);
            SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (inference_datastructures_inference.inference_control_process(inference) != process_utilities.thinking_thread(thinking)) {
                    Errors.error($str_alt68$Inference__A_is_not_controlled_by, inference, thinking);
                }
            }
            try {
                inference_strategist.inference_abort(inference);
            } finally {
                {
                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        process_utilities.thinking_stop(thinking);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return inference;
        }
    }

    /**
     *
     *
     * @param inference
    inference-p
     * 		
     * @param thinking
    thinking-task-p
     * 		
     * @return inference
    Halt the thread associated with the task THINKING by aborting INFERENCE.
     */
    @LispMethod(comment = "@param inference\ninference-p\r\n\t\t\r\n@param thinking\nthinking-task-p\r\n\t\t\r\n@return inference\r\nHalt the thread associated with the task THINKING by aborting INFERENCE.")
    public static SubLObject inference_thinking_task_abort(final SubLObject inference, final SubLObject thinking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!inference_datastructures_inference.inference_control_process(inference).eql(process_utilities.thinking_thread(thinking)))) {
            Errors.error(inference_utilities.$str83$Inference__A_is_not_controlled_by, inference, thinking);
        }
        try {
            inference_strategist.inference_abort(inference);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                process_utilities.thinking_stop(thinking);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return inference;
    }

    public static final SubLObject new_continuable_inference_from_problem_alt(SubLObject problem, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_utilities.new_continuable_inference_from_problem_query(inference_datastructures_problem.problem_query(problem), scoped_vars, query_static_properties);
    }

    public static SubLObject new_continuable_inference_from_problem(final SubLObject problem, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return inference_utilities.new_continuable_inference_from_problem_query(inference_datastructures_problem.problem_query(problem), scoped_vars, query_static_properties);
    }

    public static final SubLObject new_continuable_inference_from_problem_query_alt(SubLObject query, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, SINGLE_CLAUSE_PROBLEM_QUERY_P);
            {
                SubLObject list_var = scoped_vars;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, $sym72$CYC_VAR_);
                    }
                }
            }
            SubLTrampolineFile.checkType(query_static_properties, QUERY_STATIC_PROPERTIES_P);
            thread.resetMultipleValues();
            {
                SubLObject dnfs = inference_czer.decontextualize_clauses_with_best_mt(query);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLTrampolineFile.checkType(dnfs, $sym45$SINGLETON_);
                {
                    SubLObject dnf = dnfs.first();
                    return inference_kernel.new_continuable_inference_from_dnf(dnf, mt, scoped_vars, query_static_properties);
                }
            }
        }
    }

    public static SubLObject new_continuable_inference_from_problem_query(final SubLObject query, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query) : "! inference_datastructures_problem_query.single_clause_problem_query_p(query) " + ("inference_datastructures_problem_query.single_clause_problem_query_p(query) " + "CommonSymbols.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query) ") + query;
        final SubLObject list_var = scoped_vars;
        assert NIL != non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_variables.cyc_varP(elem) : "! cycl_variables.cyc_varP(elem) " + ("cycl_variables.cyc_varP(elem) " + "CommonSymbols.NIL != cycl_variables.cyc_varP(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != inference_datastructures_enumerated_types.query_static_properties_p(query_static_properties) : "! inference_datastructures_enumerated_types.query_static_properties_p(query_static_properties) " + ("inference_datastructures_enumerated_types.query_static_properties_p(query_static_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_static_properties_p(query_static_properties) ") + query_static_properties;
        thread.resetMultipleValues();
        final SubLObject dnfs = inference_czer.decontextualize_clauses_with_best_mt(query);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        assert NIL != singletonP(dnfs) : "! list_utilities.singletonP(dnfs) " + ("list_utilities.singletonP(dnfs) " + "CommonSymbols.NIL != list_utilities.singletonP(dnfs) ") + dnfs;
        final SubLObject dnf = dnfs.first();
        return inference_kernel.new_continuable_inference_from_dnf(dnf, mt, scoped_vars, query_static_properties);
    }

    /**
     *
     *
     * @return continuable-inference-p
    In STORE, this function will create a problem for ASENT in MT, a transformation link for RULE, and a
    problem for the result of backchaining on RULE with ASENT.  This transformed problem will
    be the root problem of the returned inference, which will be created with QUERY-STATIC-PROPERTIES.
     */
    @LispMethod(comment = "@return continuable-inference-p\r\nIn STORE, this function will create a problem for ASENT in MT, a transformation link for RULE, and a\r\nproblem for the result of backchaining on RULE with ASENT.  This transformed problem will\r\nbe the root problem of the returned inference, which will be created with QUERY-STATIC-PROPERTIES.")
    public static final SubLObject new_continuable_antecedent_inference_alt(SubLObject asent, SubLObject mt, SubLObject rule, SubLObject store, SubLObject query_static_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject consequent_problem = NIL;
                SubLObject transformation_inference = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_inference(asent, mt, rule, store, $list_alt74);
                SubLObject query_dynamic_properties = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_dynamic_properties(asent);
                consequent_problem = inference_datastructures_inference.inference_root_problem(transformation_inference);
                inference_kernel.continue_inference(transformation_inference, query_dynamic_properties);
                inference_datastructures_inference.destroy_inference(transformation_inference);
                {
                    SubLObject antecedent_problem = inference_worker_transformation.transformed_problem_using_rule(consequent_problem, rule);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == antecedent_problem) {
                            Errors.error($str_alt75$new_continuable_antecedent_infere, rule, store);
                        }
                    }
                    {
                        SubLObject inference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.new_continuable_inference_from_problem(antecedent_problem, NIL, query_static_properties);
                        return inference;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return continuable-inference-p
    In STORE, this function will create a problem for ASENT in MT, a transformation link for RULE, and a
    problem for the result of backchaining on RULE with ASENT.  This transformed problem will
    be the root problem of the returned inference, which will be created with QUERY-STATIC-PROPERTIES.
     */
    @LispMethod(comment = "@return continuable-inference-p\r\nIn STORE, this function will create a problem for ASENT in MT, a transformation link for RULE, and a\r\nproblem for the result of backchaining on RULE with ASENT.  This transformed problem will\r\nbe the root problem of the returned inference, which will be created with QUERY-STATIC-PROPERTIES.")
    public static SubLObject new_continuable_antecedent_inference(final SubLObject asent, final SubLObject mt, final SubLObject rule, final SubLObject store, final SubLObject query_static_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject consequent_problem = NIL;
        final SubLObject transformation_inference = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_inference(asent, mt, rule, store, inference_utilities.$list89);
        final SubLObject query_dynamic_properties = removal_modules_known_antecedent_rule.removal_known_antecedent_rule_dynamic_properties(asent);
        consequent_problem = inference_datastructures_inference.inference_root_problem(transformation_inference);
        inference_kernel.continue_inference(transformation_inference, query_dynamic_properties);
        inference_datastructures_inference.destroy_inference(transformation_inference);
        final SubLObject antecedent_problem = inference_worker_transformation.transformed_problem_using_rule(consequent_problem, rule);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == antecedent_problem)) {
            Errors.error(inference_utilities.$str90$new_continuable_antecedent_infere, rule, store);
        }
        final SubLObject inference = inference_utilities.new_continuable_inference_from_problem(antecedent_problem, NIL, query_static_properties);
        return inference;
    }

    /**
     * Output the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.
     * The file is opened with DIRECTION, which is :OUTPUT or :APPEND.
     * Currently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.
     */
    @LispMethod(comment = "Output the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.\r\nThe file is opened with DIRECTION, which is :OUTPUT or :APPEND.\r\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.\nOutput the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.\nThe file is opened with DIRECTION, which is :OUTPUT or :APPEND.\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.")
    public static final SubLObject inference_output_answers_to_file_alt(SubLObject inference, SubLObject filename, SubLObject output_format, SubLObject direction, SubLObject xml_spec, SubLObject cycl_prefixP) {
        if (output_format == UNPROVIDED) {
            output_format = $TAB_DELIMITED;
        }
        if (direction == UNPROVIDED) {
            direction = $OUTPUT;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = NIL;
        }
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference, INFERENCE_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject successP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, direction, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt79$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_13 = stream;
                        com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_output_answers(inference, stream_13, output_format, xml_spec, cycl_prefixP);
                        successP = T;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return successP;
            }
        }
    }

    /**
     * Output the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.
     * The file is opened with DIRECTION, which is :OUTPUT or :APPEND.
     * Currently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.
     */
    @LispMethod(comment = "Output the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.\r\nThe file is opened with DIRECTION, which is :OUTPUT or :APPEND.\r\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.\nOutput the answers of INFERENCE to FILENAME in OUTPUT-FORMAT.\nThe file is opened with DIRECTION, which is :OUTPUT or :APPEND.\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.")
    public static SubLObject inference_output_answers_to_file(final SubLObject inference, final SubLObject filename, SubLObject output_format, SubLObject direction, SubLObject xml_spec, SubLObject cycl_prefixP) {
        if (output_format == UNPROVIDED) {
            output_format = $TAB_DELIMITED;
        }
        if (direction == UNPROVIDED) {
            direction = $OUTPUT;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = NIL;
        }
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject successP = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, direction);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error(inference_utilities.$str94$Unable_to_open__S, filename);
            }
            final SubLObject stream_$29 = stream;
            inference_utilities.inference_output_answers(inference, stream_$29, output_format, xml_spec, cycl_prefixP);
            successP = T;
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return successP;
    }

    /**
     * Output the answers of INFERENCE to STREAM in OUTPUT-FORMAT.
     * Currently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.
     */
    @LispMethod(comment = "Output the answers of INFERENCE to STREAM in OUTPUT-FORMAT.\r\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.\nOutput the answers of INFERENCE to STREAM in OUTPUT-FORMAT.\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.")
    public static final SubLObject inference_output_answers_alt(SubLObject inference, SubLObject stream, SubLObject output_format, SubLObject xml_spec, SubLObject cycl_prefixP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format == UNPROVIDED) {
            output_format = $TAB_DELIMITED;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = NIL;
        }
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(stream, OUTPUT_STREAM_P);
        {
            SubLObject pcase_var = output_format;
            if (pcase_var.eql($TAB_DELIMITED)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_output_answers_tab_delimited(inference, stream, cycl_prefixP);
            } else {
                if (pcase_var.eql($XML)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_output_answers_xml(inference, stream, xml_spec, cycl_prefixP);
                } else {
                    if (pcase_var.eql($ALCHEMY)) {
                        return alchemy_export.inference_output_answers_alchemy(inference, stream);
                    } else {
                        return Errors.error($str_alt83$Output_format__S_is_not_supported);
                    }
                }
            }
        }
    }

    /**
     * Output the answers of INFERENCE to STREAM in OUTPUT-FORMAT.
     * Currently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.
     */
    @LispMethod(comment = "Output the answers of INFERENCE to STREAM in OUTPUT-FORMAT.\r\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.\nOutput the answers of INFERENCE to STREAM in OUTPUT-FORMAT.\nCurrently, :TAB-DELIMITED, :XML, and :ALCHEMY are the supported OUTPUT-FORMATs.")
    public static SubLObject inference_output_answers(final SubLObject inference, SubLObject stream, SubLObject output_format, SubLObject xml_spec, SubLObject cycl_prefixP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format == UNPROVIDED) {
            output_format = $TAB_DELIMITED;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = NIL;
        }
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != output_stream_p(stream) : "! streams_high.output_stream_p(stream) " + ("streams_high.output_stream_p(stream) " + "CommonSymbols.NIL != streams_high.output_stream_p(stream) ") + stream;
        final SubLObject pcase_var = output_format;
        if (pcase_var.eql($TAB_DELIMITED)) {
            return inference_utilities.inference_output_answers_tab_delimited(inference, stream, cycl_prefixP);
        }
        if (pcase_var.eql($XML)) {
            return inference_utilities.inference_output_answers_xml(inference, stream, xml_spec, cycl_prefixP);
        }
        if (pcase_var.eql($ALCHEMY)) {
            return alchemy_export.inference_output_answers_alchemy(inference, stream);
        }
        return Errors.error(inference_utilities.$str98$Output_format__S_is_not_supported);
    }

    public static final SubLObject inference_output_answers_tab_delimited_alt(SubLObject inference, SubLObject stream, SubLObject cycl_prefixP) {
        {
            SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
            {
                SubLObject cdolist_list_var = free_el_vars;
                SubLObject el_var = NIL;
                for (el_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_var = cdolist_list_var.first()) {
                    format(stream, $str_alt84$_A_C, el_var, CHAR_tab);
                }
            }
            format(stream, $str_alt85$__);
            {
                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject v_answer = NIL;
                        while (NIL != id) {
                            v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                                {
                                    SubLObject el_bindings = inference_kernel.inference_answer_el_bindings(v_answer);
                                    SubLObject cdolist_list_var = free_el_vars;
                                    SubLObject el_var = NIL;
                                    for (el_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_var = cdolist_list_var.first()) {
                                        {
                                            SubLObject value = format_nil.format_nil_s(bindings.variable_lookup(el_var, el_bindings));
                                            if (NIL == cycl_prefixP) {
                                                value = string_utilities.remove_substring(value, $str_alt86$__);
                                            }
                                            format(stream, $str_alt84$_A_C, value, CHAR_tab);
                                        }
                                    }
                                    format(stream, $str_alt85$__);
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
        }
        return inference;
    }

    public static SubLObject inference_output_answers_tab_delimited(final SubLObject inference, final SubLObject stream, final SubLObject cycl_prefixP) {
        SubLObject cdolist_list_var;
        final SubLObject free_el_vars = cdolist_list_var = inference_datastructures_inference.inference_free_el_vars(inference);
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, inference_utilities.$str99$_A_C, el_var, CHAR_tab);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        format(stream, inference_utilities.$str100$__);
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$30 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$30, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$30);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject el_bindings;
                SubLObject cdolist_list_var2;
                SubLObject el_var2;
                SubLObject value;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        el_bindings = inference_kernel.inference_answer_el_bindings(v_answer);
                        cdolist_list_var2 = free_el_vars;
                        el_var2 = NIL;
                        el_var2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            value = format_nil_s(variable_lookup(el_var2, el_bindings));
                            if (NIL == cycl_prefixP) {
                                value = remove_substring(value, inference_utilities.$str101$__);
                            }
                            format(stream, inference_utilities.$str99$_A_C, value, CHAR_tab);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            el_var2 = cdolist_list_var2.first();
                        } 
                        format(stream, inference_utilities.$str100$__);
                    }
                }
            }
            final SubLObject idx_$31 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$31)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$31);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject el_bindings2 = inference_kernel.inference_answer_el_bindings(v_answer2);
                        SubLObject cdolist_list_var3 = free_el_vars;
                        SubLObject el_var3 = NIL;
                        el_var3 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            SubLObject value2 = format_nil_s(variable_lookup(el_var3, el_bindings2));
                            if (NIL == cycl_prefixP) {
                                value2 = remove_substring(value2, inference_utilities.$str101$__);
                            }
                            format(stream, inference_utilities.$str99$_A_C, value2, CHAR_tab);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            el_var3 = cdolist_list_var3.first();
                        } 
                        format(stream, inference_utilities.$str100$__);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference;
    }

    public static final SubLObject inference_output_answers_xml_alt(SubLObject inference, SubLObject stream, SubLObject xml_spec, SubLObject cycl_prefixP) {
        {
            SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
            SubLObject xml_spec_used = (NIL != xml_spec) ? ((SubLObject) (xml_spec)) : xml_utilities.get_default_xml_spec_for_el_vars(free_el_vars);
            SubLObject el_bindings = NIL;
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject item_var = inference_kernel.inference_answer_el_bindings(v_answer);
                                if (NIL == member(item_var, el_bindings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    el_bindings = cons(item_var, el_bindings);
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return xml_utilities.query_bindings_to_xml_stream(el_bindings, xml_spec_used, TWO_INTEGER, stream, cycl_prefixP);
        }
    }

    public static SubLObject inference_output_answers_xml(final SubLObject inference, final SubLObject stream, final SubLObject xml_spec, final SubLObject cycl_prefixP) {
        final SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
        final SubLObject xml_spec_used = (NIL != xml_spec) ? xml_spec : get_default_xml_spec_for_el_vars(free_el_vars);
        SubLObject el_bindings = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$32 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$32, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$32);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject item_var;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        item_var = inference_kernel.inference_answer_el_bindings(v_answer);
                        if (NIL == member(item_var, el_bindings, symbol_function(EQL), symbol_function(IDENTITY))) {
                            el_bindings = cons(item_var, el_bindings);
                        }
                    }
                }
            }
            final SubLObject idx_$33 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$33)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$33);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject item_var2 = inference_kernel.inference_answer_el_bindings(v_answer2);
                        if (NIL == member(item_var2, el_bindings, symbol_function(EQL), symbol_function(IDENTITY))) {
                            el_bindings = cons(item_var2, el_bindings);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return query_bindings_to_xml_stream(el_bindings, xml_spec_used, TWO_INTEGER, stream, cycl_prefixP);
    }

    /**
     * Return T iff OBJECT is an answerability status.
     */
    @LispMethod(comment = "Return T iff OBJECT is an answerability status.")
    public static final SubLObject answerability_status_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $answerability_statuses$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is an answerability status.
     */
    @LispMethod(comment = "Return T iff OBJECT is an answerability status.")
    public static SubLObject answerability_status_p(final SubLObject v_object) {
        return member_eqP(v_object, inference_utilities.$answerability_statuses$.getGlobalValue());
    }

    /**
     * Determine the answerability status of SENTENCE in MT.
     *
     * @return one of :ANSWERABLE :UNANSWERABLE :UNKNOWN
     */
    @LispMethod(comment = "Determine the answerability status of SENTENCE in MT.\r\n\r\n@return one of :ANSWERABLE :UNANSWERABLE :UNKNOWN")
    public static final SubLObject query_answerability_status_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject status = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_answerability_status_int(sentence, mt, query_properties);
            if (status == $NON_TRIVIAL) {
                return $UNKNOWN;
            } else {
                return status;
            }
        }
    }

    /**
     * Determine the answerability status of SENTENCE in MT.
     *
     * @return one of :ANSWERABLE :UNANSWERABLE :UNKNOWN
     */
    @LispMethod(comment = "Determine the answerability status of SENTENCE in MT.\r\n\r\n@return one of :ANSWERABLE :UNANSWERABLE :UNKNOWN")
    public static SubLObject query_answerability_status(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject status = inference_utilities.query_answerability_status_int(sentence, mt, query_properties);
        if (status == $NON_TRIVIAL) {
            return $UNKNOWN;
        }
        return status;
    }

    public static final SubLObject query_answerability_status_int_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            query_properties = copy_list(query_properties);
            query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
            query_properties = remf(query_properties, $CONTINUABLE_);
            query_properties = remf(query_properties, $kw90$MAINTAIN_TERM_WORKING_SET_);
            thread.resetMultipleValues();
            {
                SubLObject result = inference_trivial.new_cyc_trivial_query(sentence, mt, query_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    return $ANSWERABLE;
                }
                if ($EXHAUST_TOTAL == halt_reason) {
                    return $UNANSWERABLE;
                }
                if ($NON_TRIVIAL == halt_reason) {
                    return $NON_TRIVIAL;
                }
                return $UNKNOWN;
            }
        }
    }

    public static SubLObject query_answerability_status_int(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_properties = copy_list(query_properties);
        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = remf(query_properties, $CONTINUABLE_);
        query_properties = remf(query_properties, inference_utilities.$kw105$MAINTAIN_TERM_WORKING_SET_);
        thread.resetMultipleValues();
        final SubLObject result = inference_trivial.new_cyc_trivial_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return $ANSWERABLE;
        }
        if ($EXHAUST_TOTAL == halt_reason) {
            return $UNANSWERABLE;
        }
        if ($NON_TRIVIAL == halt_reason) {
            return $NON_TRIVIAL;
        }
        return $UNKNOWN;
    }

    /**
     * Determine the answerability of the individual literals of SENTENCE in MT.
     *
     * @return a list of (<literal> <answerability-status-p>) tuples
     */
    @LispMethod(comment = "Determine the answerability of the individual literals of SENTENCE in MT.\r\n\r\n@return a list of (<literal> <answerability-status-p>) tuples")
    public static final SubLObject query_literal_answerability_status_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_tuples = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject dnf_clauses = clausifier.dnf_clausal_form(sentence, mt);
                    SubLObject dnf_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result_tuples = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_literal_independent_answerability_status(dnf_clauses, dnf_mt, query_properties);
                    result_tuples = com.cyc.cycjava.cycl.inference.harness.inference_utilities.refine_query_literal_answerability_status(result_tuples, dnf_clauses, dnf_mt);
                }
                return result_tuples;
            }
        }
    }

    /**
     * Determine the answerability of the individual literals of SENTENCE in MT.
     *
     * @return a list of (<literal> <answerability-status-p>) tuples
     */
    @LispMethod(comment = "Determine the answerability of the individual literals of SENTENCE in MT.\r\n\r\n@return a list of (<literal> <answerability-status-p>) tuples")
    public static SubLObject query_literal_answerability_status(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_tuples = NIL;
        thread.resetMultipleValues();
        final SubLObject dnf_clauses = dnf_clausal_form(sentence, mt);
        final SubLObject dnf_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_tuples = inference_utilities.query_literal_independent_answerability_status(dnf_clauses, dnf_mt, query_properties);
        result_tuples = inference_utilities.refine_query_literal_answerability_status(result_tuples, dnf_clauses, dnf_mt);
        return result_tuples;
    }

    /**
     * Evaluates each literal independently.
     */
    @LispMethod(comment = "Evaluates each literal independently.")
    public static final SubLObject query_literal_independent_answerability_status_alt(SubLObject dnf_clauses, SubLObject dnf_mt, SubLObject query_properties) {
        {
            SubLObject result_tuples = NIL;
            SubLObject cdolist_list_var = dnf_clauses;
            SubLObject dnf_clause = NIL;
            for (dnf_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf_clause = cdolist_list_var.first()) {
                {
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_14 = clauses.neg_lits(dnf_clause);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , asent = cdolist_list_var_14.first()) {
                        {
                            SubLObject sense = $NEG;
                            SubLObject literal = asent_and_sense_to_literal(asent, sense);
                            SubLObject answerability_status = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_answerability_status(literal, dnf_mt, query_properties);
                            result_tuples = cons(list(literal, answerability_status), result_tuples);
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_15 = clauses.pos_lits(dnf_clause);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , asent = cdolist_list_var_15.first()) {
                        {
                            SubLObject sense = $POS;
                            SubLObject literal = asent_and_sense_to_literal(asent, sense);
                            SubLObject answerability_status = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_answerability_status(literal, dnf_mt, query_properties);
                            result_tuples = cons(list(literal, answerability_status), result_tuples);
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            return nreverse(result_tuples);
        }
    }

    /**
     * Evaluates each literal independently.
     */
    @LispMethod(comment = "Evaluates each literal independently.")
    public static SubLObject query_literal_independent_answerability_status(final SubLObject dnf_clauses, final SubLObject dnf_mt, final SubLObject query_properties) {
        SubLObject result_tuples = NIL;
        SubLObject cdolist_list_var = dnf_clauses;
        SubLObject dnf_clause = NIL;
        dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$34 = neg_lits(dnf_clause);
            SubLObject asent = NIL;
            asent = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                final SubLObject sense = $NEG;
                final SubLObject literal = asent_and_sense_to_literal(asent, sense);
                final SubLObject answerability_status = inference_utilities.query_answerability_status(literal, dnf_mt, query_properties);
                result_tuples = cons(list(literal, answerability_status), result_tuples);
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                asent = cdolist_list_var_$34.first();
            } 
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$35 = pos_lits(dnf_clause);
            asent = NIL;
            asent = cdolist_list_var_$35.first();
            while (NIL != cdolist_list_var_$35) {
                final SubLObject sense = $POS;
                final SubLObject literal = asent_and_sense_to_literal(asent, sense);
                final SubLObject answerability_status = inference_utilities.query_answerability_status(literal, dnf_mt, query_properties);
                result_tuples = cons(list(literal, answerability_status), result_tuples);
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                asent = cdolist_list_var_$35.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            dnf_clause = cdolist_list_var.first();
        } 
        return nreverse(result_tuples);
    }

    /**
     * If a literal is :unanswerable by itself but has preference modules that indicate it
     * might become more complete if some variables shared by the conjunction were bound,
     * and some :answerable literal binds some of those variables, then this function will return
     * :unknown or :answerable rather than :unanswerable for that literal.
     */
    @LispMethod(comment = "If a literal is :unanswerable by itself but has preference modules that indicate it\r\nmight become more complete if some variables shared by the conjunction were bound,\r\nand some :answerable literal binds some of those variables, then this function will return\r\n:unknown or :answerable rather than :unanswerable for that literal.\nIf a literal is :unanswerable by itself but has preference modules that indicate it\nmight become more complete if some variables shared by the conjunction were bound,\nand some :answerable literal binds some of those variables, then this function will return\n:unknown or :answerable rather than :unanswerable for that literal.")
    public static final SubLObject refine_query_literal_answerability_status_alt(SubLObject result_tuples, SubLObject dnf_clauses, SubLObject dnf_mt) {
        {
            SubLObject new_result_tuples = NIL;
            SubLObject cdolist_list_var = result_tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject literal = NIL;
                    SubLObject answerability_status = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    literal = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    answerability_status = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (answerability_status == $UNANSWERABLE) {
                            {
                                SubLObject shared_vars = NIL;
                                SubLObject literal_vars = list_utilities.tree_gather(literal, $sym57$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject asent = literal_atomic_sentence(literal);
                                SubLObject sense = literal_sense(literal);
                                SubLObject other_lits = com.cyc.cycjava.cycl.inference.harness.inference_utilities.other_independently_answerable_lits(dnf_clauses, result_tuples, asent, sense);
                                SubLObject cdolist_list_var_16 = literal_vars;
                                SubLObject var = NIL;
                                for (var = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , var = cdolist_list_var_16.first()) {
                                    if (NIL != list_utilities.tree_find(var, other_lits, UNPROVIDED, UNPROVIDED)) {
                                        shared_vars = cons(var, shared_vars);
                                    }
                                }
                                if (NIL != shared_vars) {
                                    {
                                        SubLObject preference_level = preference_modules.el_literal_preference_level_wrt_modules(asent, sense, shared_vars, dnf_mt);
                                        SubLObject pcase_var = preference_level;
                                        if (pcase_var.eql($PREFERRED)) {
                                        } else {
                                            if (pcase_var.eql($DISPREFERRED)) {
                                                tuple = list(literal, $UNKNOWN);
                                            } else {
                                                if (pcase_var.eql($GROSSLY_DISPREFERRED) || pcase_var.eql($DISALLOWED)) {
                                                    tuple = list(literal, $ANSWERABLE);
                                                } else {
                                                    Errors.error($str_alt100$unexpected_preference_level__s, preference_level);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt95);
                    }
                }
                new_result_tuples = cons(tuple, new_result_tuples);
            }
            return nreverse(new_result_tuples);
        }
    }

    /**
     * If a literal is :unanswerable by itself but has preference modules that indicate it
     * might become more complete if some variables shared by the conjunction were bound,
     * and some :answerable literal binds some of those variables, then this function will return
     * :unknown or :answerable rather than :unanswerable for that literal.
     */
    @LispMethod(comment = "If a literal is :unanswerable by itself but has preference modules that indicate it\r\nmight become more complete if some variables shared by the conjunction were bound,\r\nand some :answerable literal binds some of those variables, then this function will return\r\n:unknown or :answerable rather than :unanswerable for that literal.\nIf a literal is :unanswerable by itself but has preference modules that indicate it\nmight become more complete if some variables shared by the conjunction were bound,\nand some :answerable literal binds some of those variables, then this function will return\n:unknown or :answerable rather than :unanswerable for that literal.")
    public static SubLObject refine_query_literal_answerability_status(final SubLObject result_tuples, final SubLObject dnf_clauses, final SubLObject dnf_mt) {
        SubLObject new_result_tuples = NIL;
        SubLObject cdolist_list_var = result_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject literal = NIL;
            SubLObject answerability_status = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list110);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list110);
            answerability_status = current.first();
            current = current.rest();
            if (NIL == current) {
                if (answerability_status == $UNANSWERABLE) {
                    SubLObject shared_vars = NIL;
                    final SubLObject literal_vars = tree_gather(literal, inference_utilities.$sym75$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject asent = literal_atomic_sentence(literal);
                    final SubLObject sense = literal_sense(literal);
                    final SubLObject other_lits = inference_utilities.other_independently_answerable_lits(dnf_clauses, result_tuples, asent, sense);
                    SubLObject cdolist_list_var_$36 = literal_vars;
                    SubLObject var = NIL;
                    var = cdolist_list_var_$36.first();
                    while (NIL != cdolist_list_var_$36) {
                        if (NIL != tree_find(var, other_lits, UNPROVIDED, UNPROVIDED)) {
                            shared_vars = cons(var, shared_vars);
                        }
                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                        var = cdolist_list_var_$36.first();
                    } 
                    if (NIL != shared_vars) {
                        final SubLObject pcase_var;
                        final SubLObject preference_level = pcase_var = preference_modules.el_literal_preference_level_wrt_modules(asent, sense, shared_vars, dnf_mt);
                        if (!pcase_var.eql($PREFERRED)) {
                            if (pcase_var.eql($DISPREFERRED)) {
                                tuple = list(literal, $UNKNOWN);
                            } else
                                if ((pcase_var.eql($GROSSLY_DISPREFERRED) || pcase_var.eql($DISALLOWED)) || pcase_var.eql($DOOMED)) {
                                    tuple = list(literal, $ANSWERABLE);
                                } else {
                                    Errors.error(inference_utilities.$str116$unexpected_preference_level__s, preference_level);
                                }

                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list110);
            }
            new_result_tuples = cons(tuple, new_result_tuples);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(new_result_tuples);
    }

    /**
     * Literals in DNF-CLAUSES other than ASENT/SENSE that are answerable according to RESULT-TUPLES.
     */
    @LispMethod(comment = "Literals in DNF-CLAUSES other than ASENT/SENSE that are answerable according to RESULT-TUPLES.")
    public static final SubLObject other_independently_answerable_lits_alt(SubLObject dnf_clauses, SubLObject result_tuples, SubLObject asent, SubLObject sense) {
        {
            SubLObject other_lits = NIL;
            SubLObject cdolist_list_var = dnf_clauses;
            SubLObject dnf_clause = NIL;
            for (dnf_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf_clause = cdolist_list_var.first()) {
                {
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_17 = clauses.neg_lits(dnf_clause);
                    SubLObject other_asent = NIL;
                    for (other_asent = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , other_asent = cdolist_list_var_17.first()) {
                        {
                            SubLObject other_sense = $NEG;
                            if (!(asent.equal(other_asent) && sense.equal(other_sense))) {
                                {
                                    SubLObject other_literal = asent_and_sense_to_literal(other_asent, other_sense);
                                    SubLObject answerability_list = list_utilities.alist_lookup(result_tuples, other_literal, symbol_function(EQUAL), UNPROVIDED);
                                    SubLObject answerability = answerability_list.first();
                                    if ($ANSWERABLE == answerability) {
                                        other_lits = cons(other_literal, other_lits);
                                    }
                                }
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_18 = clauses.pos_lits(dnf_clause);
                    SubLObject other_asent = NIL;
                    for (other_asent = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , other_asent = cdolist_list_var_18.first()) {
                        {
                            SubLObject other_sense = $POS;
                            if (!(asent.equal(other_asent) && sense.equal(other_sense))) {
                                {
                                    SubLObject other_literal = asent_and_sense_to_literal(other_asent, other_sense);
                                    SubLObject answerability_list = list_utilities.alist_lookup(result_tuples, other_literal, symbol_function(EQUAL), UNPROVIDED);
                                    SubLObject answerability = answerability_list.first();
                                    if ($ANSWERABLE == answerability) {
                                        other_lits = cons(other_literal, other_lits);
                                    }
                                }
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            return nreverse(other_lits);
        }
    }

    /**
     * Literals in DNF-CLAUSES other than ASENT/SENSE that are answerable according to RESULT-TUPLES.
     */
    @LispMethod(comment = "Literals in DNF-CLAUSES other than ASENT/SENSE that are answerable according to RESULT-TUPLES.")
    public static SubLObject other_independently_answerable_lits(final SubLObject dnf_clauses, final SubLObject result_tuples, final SubLObject asent, final SubLObject sense) {
        SubLObject other_lits = NIL;
        SubLObject cdolist_list_var = dnf_clauses;
        SubLObject dnf_clause = NIL;
        dnf_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$37 = neg_lits(dnf_clause);
            SubLObject other_asent = NIL;
            other_asent = cdolist_list_var_$37.first();
            while (NIL != cdolist_list_var_$37) {
                final SubLObject other_sense = $NEG;
                if ((!asent.equal(other_asent)) || (!sense.equal(other_sense))) {
                    final SubLObject other_literal = asent_and_sense_to_literal(other_asent, other_sense);
                    final SubLObject answerability_list = alist_lookup(result_tuples, other_literal, symbol_function(EQUAL), UNPROVIDED);
                    final SubLObject answerability = answerability_list.first();
                    if ($ANSWERABLE == answerability) {
                        other_lits = cons(other_literal, other_lits);
                    }
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                other_asent = cdolist_list_var_$37.first();
            } 
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$38 = pos_lits(dnf_clause);
            other_asent = NIL;
            other_asent = cdolist_list_var_$38.first();
            while (NIL != cdolist_list_var_$38) {
                final SubLObject other_sense = $POS;
                if ((!asent.equal(other_asent)) || (!sense.equal(other_sense))) {
                    final SubLObject other_literal = asent_and_sense_to_literal(other_asent, other_sense);
                    final SubLObject answerability_list = alist_lookup(result_tuples, other_literal, symbol_function(EQUAL), UNPROVIDED);
                    final SubLObject answerability = answerability_list.first();
                    if ($ANSWERABLE == answerability) {
                        other_lits = cons(other_literal, other_lits);
                    }
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                other_asent = cdolist_list_var_$38.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            dnf_clause = cdolist_list_var.first();
        } 
        return nreverse(other_lits);
    }

    /**
     * Determine the answerability of the terms in TERMS when substituted for TOKEN in SENTENCE in MT.
     *
     * @return a list of (<term> <answerability-status-p>) tuples
     */
    @LispMethod(comment = "Determine the answerability of the terms in TERMS when substituted for TOKEN in SENTENCE in MT.\r\n\r\n@return a list of (<term> <answerability-status-p>) tuples")
    public static final SubLObject query_term_substitution_answerability_status_alt(SubLObject terms, SubLObject token, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject result_tuples = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject substituted_sentence = expression_subst(v_term, token, sentence, UNPROVIDED, UNPROVIDED);
                    SubLObject answerability_status = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_answerability_status(substituted_sentence, mt, query_properties);
                    result_tuples = cons(list(v_term, answerability_status), result_tuples);
                }
            }
            return nreverse(result_tuples);
        }
    }

    /**
     * Determine the answerability of the terms in TERMS when substituted for TOKEN in SENTENCE in MT.
     *
     * @return a list of (<term> <answerability-status-p>) tuples
     */
    @LispMethod(comment = "Determine the answerability of the terms in TERMS when substituted for TOKEN in SENTENCE in MT.\r\n\r\n@return a list of (<term> <answerability-status-p>) tuples")
    public static SubLObject query_term_substitution_answerability_status(final SubLObject terms, final SubLObject token, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject result_tuples = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject substituted_sentence = cycl_utilities.expression_subst(v_term, token, sentence, UNPROVIDED, UNPROVIDED);
            final SubLObject answerability_status = inference_utilities.query_answerability_status(substituted_sentence, mt, query_properties);
            result_tuples = cons(list(v_term, answerability_status), result_tuples);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result_tuples);
    }

    public static final SubLObject query_term_arg_position_answerability_status_alt(SubLObject terms, SubLObject arg_position, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject token = formula_arg_position(sentence, arg_position, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_term_substitution_answerability_status(terms, token, sentence, mt, query_properties);
        }
    }

    public static SubLObject query_term_arg_position_answerability_status(final SubLObject terms, final SubLObject arg_position, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject token = cycl_utilities.formula_arg_position(sentence, arg_position, UNPROVIDED);
        return inference_utilities.query_term_substitution_answerability_status(terms, token, sentence, mt, query_properties);
    }

    /**
     * To be called externally and uses the ability to post partial results using the task processor API
     */
    @LispMethod(comment = "To be called externally and uses the ability to post partial results using the task processor API")
    public static final SubLObject query_literal_answerability_status_asynch_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        {
            SubLObject unwrapped_sentence = el_remove_outermost_existentials(sentence);
            if (NIL != el_conjunction_p(unwrapped_sentence)) {
                com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_literal_set_answerability_status_via_callback(formula_args(unwrapped_sentence, UNPROVIDED), com.cyc.cycjava.cycl.inference.harness.inference_utilities.make_callback(symbol_function(HANDLE_ANSWERABILITY_RESULT_TUPLE), UNPROVIDED), mt, query_properties, T);
            } else {
                com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_literal_set_answerability_status_via_callback(Mapping.mapcan(DNF_LITERALS, clausifier.dnf_clausal_form(unwrapped_sentence, mt), EMPTY_SUBL_OBJECT_ARRAY), com.cyc.cycjava.cycl.inference.harness.inference_utilities.make_callback(symbol_function(HANDLE_ANSWERABILITY_RESULT_TUPLE), UNPROVIDED), mt, query_properties, NIL);
            }
        }
        return NIL;
    }

    /**
     * To be called externally and uses the ability to post partial results using the task processor API
     */
    @LispMethod(comment = "To be called externally and uses the ability to post partial results using the task processor API")
    public static SubLObject query_literal_answerability_status_asynch(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties) {
        final SubLObject unwrapped_sentence = el_remove_outermost_existentials(sentence);
        if (NIL != el_conjunction_p(unwrapped_sentence)) {
            inference_utilities.query_literal_set_answerability_status_via_callback(cycl_utilities.formula_args(unwrapped_sentence, UNPROVIDED), inference_utilities.make_callback(symbol_function(inference_utilities.HANDLE_ANSWERABILITY_RESULT_TUPLE), UNPROVIDED), mt, query_properties, T);
        } else {
            inference_utilities.query_literal_set_answerability_status_via_callback(Mapping.mapcan(inference_utilities.DNF_LITERALS, dnf_clausal_form(unwrapped_sentence, mt), EMPTY_SUBL_OBJECT_ARRAY), inference_utilities.make_callback(symbol_function(inference_utilities.HANDLE_ANSWERABILITY_RESULT_TUPLE), UNPROVIDED), mt, query_properties, NIL);
        }
        return NIL;
    }

    /**
     * An asynchronous wrapper around query-literal-answerability-status
     * for determining the answerability of a set of literals.
     */
    @LispMethod(comment = "An asynchronous wrapper around query-literal-answerability-status\r\nfor determining the answerability of a set of literals.\nAn asynchronous wrapper around query-literal-answerability-status\nfor determining the answerability of a set of literals.")
    public static final SubLObject query_literal_set_answerability_status_via_callback_alt(SubLObject literals, SubLObject callback, SubLObject mt, SubLObject query_properties, SubLObject conjunctionsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (conjunctionsP == UNPROVIDED) {
            conjunctionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(literals, LISTP);
            SubLTrampolineFile.checkType(callback, CALLBACK_P);
            SubLTrampolineFile.checkType(conjunctionsP, BOOLEANP);
            query_properties = copy_list(query_properties);
            {
                SubLObject unknown_count = length(literals);
                SubLObject unknowns = set_utilities.construct_set_contents_from_list(literals, symbol_function(EQUAL), UNPROVIDED);
                SubLObject still_unknowns = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
                SubLObject global_timeout = getf(query_properties, $MAX_TIME, NIL);
                SubLObject iterative_timeout = $float$0_01;
                SubLObject timed_out = NIL;
                SubLObject total_time = NIL;
                SubLObject result_tuples = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject tag = with_timeout_make_tag();
                    try {
                        {
                            SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                {
                                    SubLObject timer = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_19 = $with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = with_timeout_start_timer(global_timeout, tag);
                                                while (NIL == set_contents.set_contents_emptyP(unknowns)) {
                                                    query_properties = putf(query_properties, $MAX_TIME, iterative_timeout);
                                                    {
                                                        SubLObject set_contents_var = unknowns;
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject literal = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                                                                    {
                                                                        SubLObject status = com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_answerability_status_int(literal, mt, query_properties);
                                                                        if (status == $UNKNOWN) {
                                                                            still_unknowns = set_contents.set_contents_add(literal, still_unknowns, symbol_function(EQUAL));
                                                                        } else {
                                                                            {
                                                                                SubLObject dwimmed_status = (status == $NON_TRIVIAL) ? ((SubLObject) ($UNKNOWN)) : status;
                                                                                SubLObject result = list(literal, dwimmed_status);
                                                                                result_tuples = cons(result, result_tuples);
                                                                                com.cyc.cycjava.cycl.inference.harness.inference_utilities.invoke_callback(callback, result);
                                                                                unknown_count = subtract(unknown_count, ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    iterative_timeout = multiply(TEN_INTEGER, iterative_timeout);
                                                    unknowns = still_unknowns;
                                                    still_unknowns = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
                                                } 
                                                if (NIL != conjunctionsP) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject dnf_clauses = clausifier.dnf_clausal_form(simplifier.conjoin(literals, UNPROVIDED), mt);
                                                        SubLObject dnf_mt = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject refined_result_tuples = com.cyc.cycjava.cycl.inference.harness.inference_utilities.refine_query_literal_answerability_status(result_tuples, dnf_clauses, dnf_mt);
                                                            SubLObject cdolist_list_var = refined_result_tuples;
                                                            SubLObject refined_result_tuple = NIL;
                                                            for (refined_result_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , refined_result_tuple = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = refined_result_tuple;
                                                                    SubLObject current = datum;
                                                                    SubLObject lit = NIL;
                                                                    SubLObject new_status = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt110);
                                                                    lit = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt110);
                                                                    new_status = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        {
                                                                            SubLObject old_status = list_utilities.alist_lookup(result_tuples, lit, symbol_function(EQUAL), NIL).first();
                                                                            if (NIL != old_status) {
                                                                                if (old_status != new_status) {
                                                                                    com.cyc.cycjava.cycl.inference.harness.inference_utilities.invoke_callback(callback, refined_result_tuple);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt110);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                with_timeout_stop_timer(timer);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                    }
                }
                return values(total_time, timed_out, set_contents.set_contents_size(unknowns));
            }
        }
    }

    /**
     * An asynchronous wrapper around query-literal-answerability-status
     * for determining the answerability of a set of literals.
     */
    @LispMethod(comment = "An asynchronous wrapper around query-literal-answerability-status\r\nfor determining the answerability of a set of literals.\nAn asynchronous wrapper around query-literal-answerability-status\nfor determining the answerability of a set of literals.")
    public static SubLObject query_literal_set_answerability_status_via_callback(final SubLObject literals, final SubLObject callback, SubLObject mt, SubLObject query_properties, SubLObject conjunctionsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (conjunctionsP == UNPROVIDED) {
            conjunctionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(literals) : "! listp(literals) " + ("Types.listp(literals) " + "CommonSymbols.NIL != Types.listp(literals) ") + literals;
        assert NIL != inference_utilities.callback_p(callback) : "! inference_utilities.callback_p(callback) " + ("inference_utilities.callback_p(callback) " + "CommonSymbols.NIL != inference_utilities.callback_p(callback) ") + callback;
        assert NIL != booleanp(conjunctionsP) : "! booleanp(conjunctionsP) " + ("Types.booleanp(conjunctionsP) " + "CommonSymbols.NIL != Types.booleanp(conjunctionsP) ") + conjunctionsP;
        query_properties = copy_list(query_properties);
        SubLObject unknown_count = length(literals);
        SubLObject unknowns = construct_set_contents_from_list(literals, symbol_function(EQUAL), UNPROVIDED);
        SubLObject still_unknowns = new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
        final SubLObject global_timeout = getf(query_properties, $MAX_TIME, NIL);
        SubLObject iterative_timeout = inference_utilities.$float$0_01;
        SubLObject timed_out = NIL;
        final SubLObject total_time = NIL;
        SubLObject result_tuples = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$39 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(global_timeout, tag);
                        while (NIL == set_contents_emptyP(unknowns)) {
                            query_properties = putf(query_properties, $MAX_TIME, iterative_timeout);
                            final SubLObject set_contents_var = unknowns;
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject literal;
                            SubLObject status;
                            SubLObject dwimmed_status;
                            SubLObject result;
                            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                literal = do_set_contents_next(basis_object, state);
                                if (NIL != do_set_contents_element_validP(state, literal)) {
                                    status = inference_utilities.query_answerability_status_int(literal, mt, query_properties);
                                    if (status == $UNKNOWN) {
                                        still_unknowns = set_contents_add(literal, still_unknowns, symbol_function(EQUAL));
                                    } else {
                                        dwimmed_status = (status == $NON_TRIVIAL) ? $UNKNOWN : status;
                                        result = list(literal, dwimmed_status);
                                        result_tuples = cons(result, result_tuples);
                                        inference_utilities.invoke_callback(callback, result);
                                        unknown_count = subtract(unknown_count, ONE_INTEGER);
                                    }
                                }
                            }
                            iterative_timeout = multiply(TEN_INTEGER, iterative_timeout);
                            unknowns = still_unknowns;
                            still_unknowns = new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
                        } 
                        if (NIL != conjunctionsP) {
                            thread.resetMultipleValues();
                            final SubLObject dnf_clauses = dnf_clausal_form(conjoin(literals, UNPROVIDED), mt);
                            final SubLObject dnf_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var;
                            final SubLObject refined_result_tuples = cdolist_list_var = inference_utilities.refine_query_literal_answerability_status(result_tuples, dnf_clauses, dnf_mt);
                            SubLObject refined_result_tuple = NIL;
                            refined_result_tuple = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = refined_result_tuple;
                                SubLObject lit = NIL;
                                SubLObject new_status = NIL;
                                destructuring_bind_must_consp(current, datum, inference_utilities.$list126);
                                lit = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, inference_utilities.$list126);
                                new_status = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject old_status = alist_lookup(result_tuples, lit, symbol_function(EQUAL), NIL).first();
                                    if ((NIL != old_status) && (!old_status.eql(new_status))) {
                                        inference_utilities.invoke_callback(callback, refined_result_tuple);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, inference_utilities.$list126);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                refined_result_tuple = cdolist_list_var.first();
                            } 
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$39, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        return values(total_time, timed_out, set_contents_size(unknowns));
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static final SubLObject handle_answerability_result_tuple_alt(SubLObject literal, SubLObject status) {
        if (NIL != task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process()))) {
            task_processor.post_task_info_processor_partial_results(list(literal, status));
        }
        return print(list(literal, status), UNPROVIDED);
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static SubLObject handle_answerability_result_tuple(final SubLObject literal, final SubLObject status) {
        if (NIL != task_process_pool_p(get_task_process_pool_for_process(current_process()))) {
            post_task_info_processor_partial_results(list(literal, status));
        }
        return print(list(literal, status), UNPROVIDED);
    }

    public static final SubLObject callback_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && v_object.first().isFunctionSpec()) && second(v_object).isList());
    }

    public static SubLObject callback_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && v_object.first().isFunctionSpec()) && second(v_object).isList());
    }

    public static final SubLObject make_callback_alt(SubLObject method, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        SubLTrampolineFile.checkType(method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(data, LISTP);
        return list(method, data);
    }

    public static SubLObject make_callback(final SubLObject method, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        assert NIL != function_spec_p(method) : "! function_spec_p(method) " + ("Types.function_spec_p(method) " + "CommonSymbols.NIL != Types.function_spec_p(method) ") + method;
        assert NIL != listp(data) : "! listp(data) " + ("Types.listp(data) " + "CommonSymbols.NIL != Types.listp(data) ") + data;
        return list(method, data);
    }

    public static final SubLObject invoke_callback_alt(SubLObject callback, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLTrampolineFile.checkType(callback, CALLBACK_P);
        {
            SubLObject method = com.cyc.cycjava.cycl.inference.harness.inference_utilities.callback_method(callback);
            SubLObject callback_data = com.cyc.cycjava.cycl.inference.harness.inference_utilities.callback_data(callback);
            return apply(method, append(args, callback_data));
        }
    }

    public static SubLObject invoke_callback(final SubLObject callback, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != inference_utilities.callback_p(callback) : "! inference_utilities.callback_p(callback) " + ("inference_utilities.callback_p(callback) " + "CommonSymbols.NIL != inference_utilities.callback_p(callback) ") + callback;
        final SubLObject method = inference_utilities.callback_method(callback);
        final SubLObject callback_data = inference_utilities.callback_data(callback);
        return apply(method, append(args, callback_data));
    }

    public static final SubLObject callback_method_alt(SubLObject callback) {
        return callback.first();
    }

    public static SubLObject callback_method(final SubLObject callback) {
        return callback.first();
    }

    public static final SubLObject callback_data_alt(SubLObject callback) {
        return second(callback);
    }

    public static SubLObject callback_data(final SubLObject callback) {
        return second(callback);
    }

    public static SubLObject inference_answer_argument_strength(final SubLObject inference_answer) {
        SubLObject max_strength = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject just_strength = inference_utilities.hl_justification_strength(inference_datastructures_inference.inference_answer_justification_supports(just));
            max_strength = max(max_strength, just_strength);
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return max_strength;
    }

    public static SubLObject hl_justification_strength(final SubLObject hl_justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strength = ONE_INTEGER;
        SubLObject strength_reasons = NIL;
        final SubLObject hypothetical_mt_supports = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = hl_supports.hl_justification_expand(hl_justification);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt = arguments.support_mt(support);
            if ((((NIL != hlmt.hlmt_p(mt)) && ((NIL == arguments.hl_support_p(support)) || (NIL != inference_utilities.$count_hl_supports_in_hypothetical_contextsP$.getDynamicValue(thread)))) && (((NIL == assertion_handles.assertion_p(support)) || (NIL != asserted_assertionP(support))) || (NIL != inference_utilities.$count_deduced_assertions_in_hypothetical_contextsP$.getDynamicValue(thread)))) && (NIL != isa.isaP(hlmt.hlmt_monad_mt(mt), inference_utilities.$$HypotheticalContext, UNPROVIDED, UNPROVIDED))) {
                set.set_add(support, hypothetical_mt_supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        if (NIL == set.set_emptyP(hypothetical_mt_supports)) {
            final SubLObject hypothetical_mt_support_count = set.set_size(hypothetical_mt_supports);
            strength = add(strength, hypothetical_mt_support_count);
            strength_reasons = cons(list(inference_utilities.$HYPOTHETICAL_MT_SUPPORT_COUNT, hypothetical_mt_support_count), strength_reasons);
        }
        return values(strength, nreverse(strength_reasons));
    }

    /**
     * Return the complete justification for all proofs of all answers for INFERENCE.
     */
    @LispMethod(comment = "Return the complete justification for all proofs of all answers for INFERENCE.")
    public static final SubLObject inference_expanded_justification_alt(SubLObject inference) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        {
            SubLObject support_set = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject sub_supports = com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_answer_expanded_justification_guts(v_answer);
                                SubLObject set_contents_var = sub_supports;
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                            support_set = set_contents.set_contents_add(support, support_set, symbol_function(EQUAL));
                                        }
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, T, id, state_var);
                        state_var = do_id_index_next_state(idx, T, id, state_var);
                    } 
                }
            }
            return sort_supports(set_contents.set_contents_element_list(support_set));
        }
    }

    /**
     * Return the complete justification for all proofs of all answers for INFERENCE.
     */
    @LispMethod(comment = "Return the complete justification for all proofs of all answers for INFERENCE.")
    public static SubLObject inference_expanded_justification(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        SubLObject support_set = new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$41 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$41, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$41);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject set_contents_var;
                SubLObject sub_supports;
                SubLObject basis_object;
                SubLObject state;
                SubLObject support;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        sub_supports = set_contents_var = inference_utilities.inference_answer_expanded_justification_guts(v_answer);
                        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                            support = do_set_contents_next(basis_object, state);
                            if (NIL != do_set_contents_element_validP(state, support)) {
                                support_set = set_contents_add(support, support_set, symbol_function(EQUAL));
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$42 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$42)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$42);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$42);
                final SubLObject end_id = id_index_next_id(idx_$42);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_answer2))) {
                        final SubLObject set_contents_var2;
                        final SubLObject sub_supports2 = set_contents_var2 = inference_utilities.inference_answer_expanded_justification_guts(v_answer2);
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject support2;
                        for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                            support2 = do_set_contents_next(basis_object2, state2);
                            if (NIL != do_set_contents_element_validP(state2, support2)) {
                                support_set = set_contents_add(support2, support_set, symbol_function(EQUAL));
                            }
                        }
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return arguments.sort_supports(set_contents_element_list(support_set));
    }

    /**
     * Return the complete justification for all proofs for ANSWER of INFERENCE.
     */
    @LispMethod(comment = "Return the complete justification for all proofs for ANSWER of INFERENCE.")
    public static final SubLObject inference_answer_expanded_justification_alt(SubLObject v_answer) {
        SubLTrampolineFile.checkType(v_answer, INFERENCE_ANSWER_P);
        {
            SubLObject support_set = com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_answer_expanded_justification_guts(v_answer);
            return sort_supports(set_contents.set_contents_element_list(support_set));
        }
    }

    /**
     * Return the complete justification for all proofs for ANSWER of INFERENCE.
     */
    @LispMethod(comment = "Return the complete justification for all proofs for ANSWER of INFERENCE.")
    public static SubLObject inference_answer_expanded_justification(final SubLObject v_answer) {
        assert NIL != inference_datastructures_inference.inference_answer_p(v_answer) : "! inference_datastructures_inference.inference_answer_p(v_answer) " + ("inference_datastructures_inference.inference_answer_p(v_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(v_answer) ") + v_answer;
        final SubLObject support_set = inference_utilities.inference_answer_expanded_justification_guts(v_answer);
        return arguments.sort_supports(set_contents_element_list(support_set));
    }

    public static SubLObject inference_answer_completely_expanded_justification(final SubLObject v_answer) {
        assert NIL != inference_datastructures_inference.inference_answer_p(v_answer) : "! inference_datastructures_inference.inference_answer_p(v_answer) " + ("inference_datastructures_inference.inference_answer_p(v_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(v_answer) ") + v_answer;
        final SubLObject support_set = inference_utilities.inference_answer_expanded_justification_guts(v_answer);
        return arguments.sort_supports(hl_supports.hl_justification_complete_backward_theory(set_contents_element_list(support_set), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject inference_answer_expanded_justification_guts_alt(SubLObject v_answer) {
        {
            SubLObject support_set = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
            SubLObject inf_just = NIL;
            for (inf_just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inf_just = cdolist_list_var.first()) {
                {
                    SubLObject sub_supports = com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_answer_justification_expanded_supports_guts(inf_just);
                    SubLObject set_contents_var = sub_supports;
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                support_set = set_contents.set_contents_add(support, support_set, symbol_function(EQUAL));
                            }
                        }
                    }
                }
            }
            return support_set;
        }
    }

    public static SubLObject inference_answer_expanded_justification_guts(final SubLObject v_answer) {
        SubLObject support_set = new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject inf_just = NIL;
        inf_just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var;
            final SubLObject sub_supports = set_contents_var = inference_utilities.inference_answer_justification_expanded_supports_guts(inf_just);
            SubLObject basis_object;
            SubLObject state;
            SubLObject support;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                support = do_set_contents_next(basis_object, state);
                if (NIL != do_set_contents_element_validP(state, support)) {
                    support_set = set_contents_add(support, support_set, symbol_function(EQUAL));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            inf_just = cdolist_list_var.first();
        } 
        return support_set;
    }

    public static final SubLObject inference_answer_justification_expanded_supports_guts_alt(SubLObject inf_just) {
        {
            SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(inf_just);
            SubLObject expanded_justification = hl_justification_expand(supports);
            return expanded_justification;
        }
    }

    public static SubLObject inference_answer_justification_expanded_supports_guts(final SubLObject inf_just) {
        final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(inf_just);
        final SubLObject expanded_justification = hl_supports.hl_justification_expand(supports);
        return expanded_justification;
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing PROBLEM-STORE.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing PROBLEM-STORE.")
    public static final SubLObject cycl_term_for_problem_store_alt(SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = inference_datastructures_problem_store.most_recent_problem_store();
        }
        SubLTrampolineFile.checkType(problem_store, PROBLEM_STORE_P);
        {
            SubLObject image = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_image();
            return NIL != image ? ((SubLObject) (czer_main.canonicalize_term(make_binary_formula($$AbsoluteCycProblemStoreFn, image, inference_datastructures_problem_store.problem_store_suid(problem_store)), UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing PROBLEM-STORE.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing PROBLEM-STORE.")
    public static SubLObject cycl_term_for_problem_store(SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = inference_datastructures_problem_store.most_recent_problem_store();
        }
        assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "! inference_datastructures_problem_store.problem_store_p(problem_store) " + ("inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) ") + problem_store;
        final SubLObject image = inference_utilities.cycl_term_for_image();
        return NIL != image ? canonicalize_term(make_binary_formula(inference_utilities.$$AbsoluteCycProblemStoreFn, image, inference_datastructures_problem_store.problem_store_suid(problem_store)), UNPROVIDED) : NIL;
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing INFERENCE.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing INFERENCE.")
    public static final SubLObject cycl_term_for_inference_alt(SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.latest_inference();
        }
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        {
            SubLObject problem_store = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_problem_store(inference_datastructures_inference.inference_problem_store(inference));
            return NIL != problem_store ? ((SubLObject) (czer_main.canonicalize_term(make_binary_formula($$CycInferenceFn, inference_datastructures_inference.inference_suid(inference), problem_store), UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing INFERENCE.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing INFERENCE.")
    public static SubLObject cycl_term_for_inference(SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_utilities.latest_inference();
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        final SubLObject problem_store = inference_utilities.cycl_term_for_problem_store(inference_datastructures_inference.inference_problem_store(inference));
        return NIL != problem_store ? canonicalize_term(make_binary_formula(inference_utilities.$$CycInferenceFn, inference_datastructures_inference.inference_suid(inference), problem_store), UNPROVIDED) : NIL;
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the machine running Cyc.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the machine running Cyc.")
    public static final SubLObject cycl_term_for_machine_alt(SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        {
            SubLObject machine_name = Environment.get_machine_name(UNPROVIDED);
            SubLObject v_term = lexicon_accessors.typed_denots_of_string(machine_name, $$Computer, NIL, $DENOT, NIL, NIL, $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            if (!((NIL == warnP) || (NIL != cycl_grammar.cycl_denotational_term_p(v_term)))) {
                Errors.warn($str_alt119$Couldn_t_find_a_term_representing, machine_name);
            }
            return v_term;
        }
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the machine running Cyc.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the machine running Cyc.")
    public static SubLObject cycl_term_for_machine(SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        final SubLObject machine_name = Environment.get_machine_name(UNPROVIDED);
        final SubLObject v_term = typed_denots_of_string(machine_name, inference_utilities.$$Computer, NIL, $DENOT, NIL, NIL, inference_utilities.$$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        if ((NIL != warnP) && (NIL == cycl_denotational_term_p(v_term))) {
            Errors.warn(inference_utilities.$str138$Couldn_t_find_a_term_representing, machine_name);
        }
        return v_term;
    }

    /**
     * Ensure that this image has a term representing the machine it is running on.
     */
    @LispMethod(comment = "Ensure that this image has a term representing the machine it is running on.")
    public static final SubLObject ensure_term_for_machine_alt(SubLObject mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_for_machine = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_machine(NIL);
                if (NIL == cycl_grammar.cycl_denotational_term_p(term_for_machine)) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind(NIL, thread);
                            operation_communication.set_the_cyclist(cyclist);
                            {
                                SubLObject machine_name = Environment.get_machine_name(UNPROVIDED);
                                SubLObject term_name = string_utilities.upcase_leading(machine_name);
                                term_for_machine = ke.ke_create_now(term_name, UNPROVIDED);
                                ke.ke_assert_now(listS($$isa, term_for_machine, $list_alt121), mt, UNPROVIDED, UNPROVIDED);
                                ke.ke_assert_now(list($$nameString, term_for_machine, machine_name), mt, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return term_for_machine;
            }
        }
    }

    /**
     * Ensure that this image has a term representing the machine it is running on.
     */
    @LispMethod(comment = "Ensure that this image has a term representing the machine it is running on.")
    public static SubLObject ensure_term_for_machine(final SubLObject mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_for_machine = inference_utilities.cycl_term_for_machine(NIL);
        if (NIL == cycl_denotational_term_p(term_for_machine)) {
            final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
            try {
                $the_cyclist$.bind(NIL, thread);
                set_the_cyclist(cyclist);
                final SubLObject machine_name = Environment.get_machine_name(UNPROVIDED);
                final SubLObject term_name = make_valid_constant_name(machine_name, T);
                term_for_machine = ke_create_now(term_name, UNPROVIDED);
                ke_assert_now(listS(inference_utilities.$$isa, term_for_machine, inference_utilities.$list140), mt, UNPROVIDED, UNPROVIDED);
                ke_assert_now(list(inference_utilities.$$nameString, term_for_machine, machine_name), mt, UNPROVIDED, UNPROVIDED);
            } finally {
                $the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return term_for_machine;
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the currently running Cyc image.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the currently running Cyc image.")
    public static final SubLObject cycl_term_for_image_alt() {
        {
            SubLObject machine = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_machine(UNPROVIDED);
            return NIL != machine ? ((SubLObject) (czer_main.canonicalize_term(make_binary_formula($$CycImageFn, machine, cyc_image_id()), UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the currently running Cyc image.
     */
    @LispMethod(comment = "@return CYCL-DENOTATIONAL-TERM-P or NIL; the Cyc term representing the currently running Cyc image.")
    public static SubLObject cycl_term_for_image() {
        final SubLObject machine = inference_utilities.cycl_term_for_machine(UNPROVIDED);
        return NIL != machine ? canonicalize_term(make_binary_formula(inference_utilities.$$CycImageFn, machine, cyc_image_id()), UNPROVIDED) : NIL;
    }

    /**
     * Assert data about PROBLEM-STORE.
     */
    @LispMethod(comment = "Assert data about PROBLEM-STORE.")
    public static final SubLObject assert_problem_store_data(SubLObject problem_store, SubLObject cyclist) {
        if (problem_store == UNPROVIDED) {
            problem_store = inference_datastructures_problem_store.most_recent_problem_store();
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(problem_store, PROBLEM_STORE_P);
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(NIL, thread);
                    operation_communication.set_the_cyclist(cyclist);
                    {
                        SubLObject problem_store_term = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_problem_store(problem_store);
                        SubLObject mt = hlmt_czer.canonicalize_hlmt(list($$MtSpace, $$BaseKB, list($$MtTimeDimFn, date_utilities.indexical_now())));
                        if (NIL != cycl_grammar.cycl_denotational_term_p(problem_store_term)) {
                            ke.ke_assert(list($$cycProblemStoreLinkCount, problem_store_term, inference_datastructures_problem_store.problem_store_link_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
                            ke.ke_assert(list($$cycProblemStoreProblemCount, problem_store_term, inference_datastructures_problem_store.problem_store_problem_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
                            ke.ke_assert(list($$cycProblemStoreProofCount, problem_store_term, inference_datastructures_problem_store.problem_store_proof_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject assert_problem_store_data(SubLObject problem_store, SubLObject monad_mt, SubLObject cyclist) {
        if (problem_store == UNPROVIDED) {
            problem_store = inference_datastructures_problem_store.most_recent_problem_store();
        }
        if (monad_mt == UNPROVIDED) {
            monad_mt = inference_utilities.$$BaseKB;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "! inference_datastructures_problem_store.problem_store_p(problem_store) " + ("inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) ") + problem_store;
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(cyclist);
            final SubLObject problem_store_term = inference_utilities.cycl_term_for_problem_store(problem_store);
            final SubLObject mt = canonicalize_hlmt(list(inference_utilities.$$MtSpace, monad_mt, list(inference_utilities.$$MtTimeDimFn, indexical_now())));
            if (NIL != cycl_denotational_term_p(problem_store_term)) {
                ke_assert(list(inference_utilities.$$cycProblemStoreLinkCount, problem_store_term, inference_datastructures_problem_store.problem_store_link_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
                ke_assert(list(inference_utilities.$$cycProblemStoreProblemCount, problem_store_term, inference_datastructures_problem_store.problem_store_problem_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
                ke_assert(list(inference_utilities.$$cycProblemStoreProofCount, problem_store_term, inference_datastructures_problem_store.problem_store_proof_count(problem_store)), mt, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Assert data about INFERENCE.
     */
    @LispMethod(comment = "Assert data about INFERENCE.")
    public static final SubLObject assert_inference_data(SubLObject inference, SubLObject cyclist) {
        if (inference == UNPROVIDED) {
            inference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.latest_inference();
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference, INFERENCE_P);
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(NIL, thread);
                    operation_communication.set_the_cyclist(cyclist);
                    {
                        SubLObject inference_term = com.cyc.cycjava.cycl.inference.harness.inference_utilities.cycl_term_for_inference(inference);
                        SubLObject mt = hlmt_czer.canonicalize_hlmt(list($$MtSpace, $$BaseKB, list($$MtTimeDimFn, date_utilities.indexical_now())));
                        SubLTrampolineFile.checkType(inference_term, CYCL_DENOTATIONAL_TERM_P);
                        {
                            SubLObject start_time = date_utilities.universal_time_to_cycl_date(inference_datastructures_inference.inference_start_universal_time(inference));
                            ke.ke_assert_now(list($$inferenceStartTime, inference_term, start_time), $$BaseKB, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != inference_datastructures_inference.inference_has_some_answerP(inference)) {
                            {
                                SubLObject time_to_first_answer = list($$SecondsDuration, inference_datastructures_inference.inference_first_answer_elapsed_time(inference));
                                SubLObject time_to_last_answer = list($$SecondsDuration, inference_datastructures_inference.inference_last_answer_elapsed_time(inference));
                                ke.ke_assert_now(list($$inferenceTimeToFirstAnswer, inference_term, time_to_first_answer), $$BaseKB, UNPROVIDED, UNPROVIDED);
                                ke.ke_assert_now(list($$inferenceTimeToLastAnswer, inference_term, time_to_last_answer), mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        com.cyc.cycjava.cycl.inference.harness.inference_utilities.assert_inference_bindings(inference, inference_term, mt);
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject assert_inference_data(SubLObject inference, SubLObject monad_mt, SubLObject cyclist) {
        if (inference == UNPROVIDED) {
            inference = inference_utilities.latest_inference();
        }
        if (monad_mt == UNPROVIDED) {
            monad_mt = inference_utilities.$$BaseKB;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
        try {
            $the_cyclist$.bind(NIL, thread);
            set_the_cyclist(cyclist);
            final SubLObject inference_term = inference_utilities.cycl_term_for_inference(inference);
            final SubLObject mt = canonicalize_hlmt(list(inference_utilities.$$MtSpace, monad_mt, list(inference_utilities.$$MtTimeDimFn, indexical_now())));
            assert NIL != cycl_denotational_term_p(inference_term) : "! cycl_grammar.cycl_denotational_term_p(inference_term) " + ("cycl_grammar.cycl_denotational_term_p(inference_term) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(inference_term) ") + inference_term;
            final SubLObject start_time = universal_time_to_cycl_date(inference_datastructures_inference.inference_start_universal_time(inference));
            ke_assert_now(list(inference_utilities.$$inferenceStartTime, inference_term, start_time), inference_utilities.$$BaseKB, UNPROVIDED, UNPROVIDED);
            if (NIL != inference_datastructures_inference.inference_has_some_answerP(inference)) {
                final SubLObject time_to_first_answer = list(inference_utilities.$$SecondsDuration, inference_datastructures_inference.inference_first_answer_elapsed_time(inference));
                final SubLObject time_to_last_answer = list(inference_utilities.$$SecondsDuration, inference_datastructures_inference.inference_last_answer_elapsed_time(inference));
                ke_assert_now(list(inference_utilities.$$inferenceTimeToFirstAnswer, inference_term, time_to_first_answer), inference_utilities.$$BaseKB, UNPROVIDED, UNPROVIDED);
                ke_assert_now(list(inference_utilities.$$inferenceTimeToLastAnswer, inference_term, time_to_last_answer), mt, UNPROVIDED, UNPROVIDED);
            }
            inference_utilities.assert_inference_bindings(inference, inference_term, mt);
        } finally {
            $the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject assert_inference_bindings_alt(SubLObject inference, SubLObject inference_term, SubLObject mt) {
        {
            SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
            if (ZERO_INTEGER.eql(answer_count) || answer_count.numG(TEN_INTEGER)) {
                ke.ke_assert_now(list($$inferenceAnswerCount, inference_term, answer_count), mt, UNPROVIDED, UNPROVIDED);
            } else {
                {
                    SubLObject binding_sets = NIL;
                    SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject inference_answer = NIL;
                            while (NIL != id) {
                                inference_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != do_id_index_id_and_object_validP(id, inference_answer, $SKIP)) {
                                    binding_sets = cons(inference_datastructures_inference.inference_answer_bindings(inference_answer), binding_sets);
                                }
                                id = do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                    ke.ke_assert_now(list($$inferenceBindings, inference_term, bindings.kbify_inference_set_of_binding_sets(binding_sets)), mt, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return inference_term;
    }

    public static SubLObject assert_inference_bindings(final SubLObject inference, final SubLObject inference_term, final SubLObject mt) {
        final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
        if (ZERO_INTEGER.eql(answer_count) || answer_count.numG(TEN_INTEGER)) {
            ke_assert_now(list(inference_utilities.$$inferenceAnswerCount, inference_term, answer_count), mt, UNPROVIDED, UNPROVIDED);
        } else {
            SubLObject binding_sets = NIL;
            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$43 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$43, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$43);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference_answer;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference_answer = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference_answer)) {
                                inference_answer = $SKIP;
                            }
                            binding_sets = cons(inference_datastructures_inference.inference_answer_bindings(inference_answer), binding_sets);
                        }
                    }
                }
                final SubLObject idx_$44 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$44)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$44);
                    SubLObject id2 = NIL;
                    SubLObject inference_answer2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            inference_answer2 = getEntryValue(cdohash_entry);
                            binding_sets = cons(inference_datastructures_inference.inference_answer_bindings(inference_answer2), binding_sets);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            ke_assert_now(list(inference_utilities.$$inferenceBindings, inference_term, kbify_inference_set_of_binding_sets(binding_sets)), mt, UNPROVIDED, UNPROVIDED);
        }
        return inference_term;
    }

    public static final SubLObject latest_inference_alt() {
        {
            SubLObject latest_store = inference_datastructures_problem_store.most_recent_problem_store();
            if (NIL != latest_store) {
                return inference_datastructures_problem_store.latest_problem_store_inference(latest_store);
            }
        }
        return NIL;
    }

    public static SubLObject latest_inference() {
        final SubLObject latest_store = inference_datastructures_problem_store.most_recent_problem_store();
        if (NIL != latest_store) {
            return inference_datastructures_problem_store.latest_problem_store_inference(latest_store);
        }
        return NIL;
    }

    /**
     *
     *
     * @return non-negative-number-p; an estimate of the cost of removing LITERAL.
     */
    @LispMethod(comment = "@return non-negative-number-p; an estimate of the cost of removing LITERAL.")
    public static final SubLObject query_literal_removal_cost_alt(SubLObject literal, SubLObject sense, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(literal, $sym138$ATOMIC_SENTENCE_);
            {
                SubLObject allowed_modules_spec = getf(query_properties, $ALLOWED_MODULES, $ALL);
                SubLObject hl_literal = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        hl_literal = expression_sublis_hl_variables(verbosifier.el_relations_out(literal, mt, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_literal_removal_cost_internal(hl_literal, sense, mt, allowed_modules_spec, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return non-negative-number-p; an estimate of the cost of removing LITERAL.
     */
    @LispMethod(comment = "@return non-negative-number-p; an estimate of the cost of removing LITERAL.")
    public static SubLObject query_literal_removal_cost(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != atomic_sentenceP(literal) : "! el_utilities.atomic_sentenceP(literal) " + ("el_utilities.atomic_sentenceP(literal) " + "CommonSymbols.NIL != el_utilities.atomic_sentenceP(literal) ") + literal;
        final SubLObject allowed_modules_spec = getf(query_properties, $ALLOWED_MODULES, $ALL);
        SubLObject hl_literal = NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            hl_literal = cycl_utilities.expression_sublis_hl_variables(el_relations_out(literal, mt, UNPROVIDED, UNPROVIDED));
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return inference_utilities.query_literal_removal_cost_internal(hl_literal, sense, mt, allowed_modules_spec, UNPROVIDED);
    }

    public static final SubLObject query_literal_removal_cost_internal_alt(SubLObject hl_literal, SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec, SubLObject seen) {
        if (seen == UNPROVIDED) {
            seen = new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cost = ZERO_INTEGER;
                if (NIL == set_memberP(hl_literal, seen)) {
                    set_add(hl_literal, seen);
                    {
                        SubLObject rewritten_literals = NIL;
                        SubLObject arg0 = literal_arg0(hl_literal, UNPROVIDED);
                        cost = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_cost(hl_literal, sense, mt, allowed_modules_spec);
                        if (NIL != indexed_term_p(arg0)) {
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
                                        {
                                            SubLObject pred_var = $$bridgingPredicateForPredicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg0, TWO_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg0, TWO_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_21 = NIL;
                                                                            SubLObject token_var_22 = NIL;
                                                                            while (NIL == done_var_21) {
                                                                                {
                                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                                                    SubLObject valid_23 = makeBoolean(token_var_22 != gaf);
                                                                                    if (NIL != valid_23) {
                                                                                        {
                                                                                            SubLObject bridging_pred = assertions_high.gaf_arg1(gaf);
                                                                                            SubLObject el_arg_pos_map = assertions_high.gaf_arg3(gaf);
                                                                                            SubLObject bridged_args = make_list(arity.min_arity(bridging_pred), NIL);
                                                                                            SubLObject bridged_literal = make_formula(bridging_pred, bridged_args, UNPROVIDED);
                                                                                            SubLObject cdolist_list_var = el_set_items(el_arg_pos_map);
                                                                                            SubLObject arg_pos_pair = NIL;
                                                                                            for (arg_pos_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos_pair = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject datum = el_list_items(arg_pos_pair);
                                                                                                    SubLObject current = datum;
                                                                                                    SubLObject bridging_argnum = NIL;
                                                                                                    SubLObject argnum = NIL;
                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt141);
                                                                                                    bridging_argnum = current.first();
                                                                                                    current = current.rest();
                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt141);
                                                                                                    argnum = current.first();
                                                                                                    current = current.rest();
                                                                                                    if (NIL == current) {
                                                                                                        bridged_literal = nreplace_formula_arg(bridging_argnum, literal_arg(hl_literal, argnum, UNPROVIDED), bridged_literal);
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum, $list_alt141);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (NIL == expression_find(NIL, bridged_literal, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject item_var = bridged_literal;
                                                                                                    if (NIL == member(item_var, rewritten_literals, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                        rewritten_literals = cons(item_var, rewritten_literals);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_21 = makeBoolean(NIL == valid_23);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
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
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(hl_literal, $list_alt142);
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                    SubLObject arg1 = list_utilities.alist_lookup_without_values(v_bindings, ARG1, UNPROVIDED, UNPROVIDED);
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject node_var = col;
                                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                SubLObject recur_deck = deck.create_deck(deck_type);
                                                {
                                                    SubLObject _prev_bind_0_25 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject tv_var = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt150$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt150$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt150$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt155$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt150$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_28 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_29 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_30 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_31 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                        while (NIL != node_var) {
                                                                                            {
                                                                                                SubLObject spec = node_var;
                                                                                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.collection_has_rdf_type_cardinality_estimateP(spec)) {
                                                                                                    {
                                                                                                        SubLObject item_var = make_binary_formula($$rdf_type, arg1, spec);
                                                                                                        if (NIL == member(item_var, rewritten_literals, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                            rewritten_literals = cons(item_var, rewritten_literals);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt_36 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_36)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_36, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_38)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_38);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_40 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , node_vars_link_node = cdolist_list_var_40.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_38 = dictionary_contents.do_dictionary_contents_next(iteration_state_38);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_38);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_37, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt158$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_41 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , generating_fn = cdolist_list_var_41.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_44 = new_list_43;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , node_vars_link_node = cdolist_list_var_44.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_42, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_35, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_34, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_33, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_32, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_31, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt159$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_30, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_29, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_28, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_27, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_26, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_25, thread);
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
                        {
                            SubLObject cdolist_list_var = rewritten_literals;
                            SubLObject rewritten_literal = NIL;
                            for (rewritten_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rewritten_literal = cdolist_list_var.first()) {
                                cost = add(cost, com.cyc.cycjava.cycl.inference.harness.inference_utilities.query_literal_removal_cost_internal(rewritten_literal, sense, mt, allowed_modules_spec, seen));
                            }
                        }
                    }
                }
                return cost;
            }
        }
    }

    public static SubLObject query_literal_removal_cost_internal(final SubLObject hl_literal, final SubLObject sense, final SubLObject mt, final SubLObject allowed_modules_spec, SubLObject seen) {
        if (seen == UNPROVIDED) {
            seen = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = ZERO_INTEGER;
        if (NIL == set.set_memberP(hl_literal, seen)) {
            set.set_add(hl_literal, seen);
            SubLObject rewritten_literals = NIL;
            final SubLObject arg0 = literal_arg0(hl_literal, UNPROVIDED);
            cost = inference_utilities.literal_removal_cost(hl_literal, sense, mt, allowed_modules_spec);
            if (NIL != indexed_term_p(arg0)) {
                final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
                try {
                    $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                    $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                    $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject pred_var = inference_utilities.$$bridgingPredicateForPredicate;
                    if (NIL != do_gaf_arg_index_key_validator(arg0, TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(arg0, TWO_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$45 = NIL;
                                    final SubLObject token_var_$46 = NIL;
                                    while (NIL == done_var_$45) {
                                        final SubLObject gaf = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                        final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(gaf));
                                        if (NIL != valid_$47) {
                                            final SubLObject bridging_pred = gaf_arg1(gaf);
                                            final SubLObject el_arg_pos_map = gaf_arg3(gaf);
                                            final SubLObject bridged_args = make_list(min_arity(bridging_pred), NIL);
                                            SubLObject bridged_literal = make_formula(bridging_pred, bridged_args, UNPROVIDED);
                                            SubLObject cdolist_list_var = el_set_items(el_arg_pos_map);
                                            SubLObject arg_pos_pair = NIL;
                                            arg_pos_pair = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                SubLObject current;
                                                final SubLObject datum = current = el_list_items(arg_pos_pair);
                                                SubLObject bridging_argnum = NIL;
                                                SubLObject argnum = NIL;
                                                destructuring_bind_must_consp(current, datum, inference_utilities.$list160);
                                                bridging_argnum = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, inference_utilities.$list160);
                                                argnum = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    bridged_literal = nreplace_formula_arg(bridging_argnum, literal_arg(hl_literal, argnum, UNPROVIDED), bridged_literal);
                                                } else {
                                                    cdestructuring_bind_error(datum, inference_utilities.$list160);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                arg_pos_pair = cdolist_list_var.first();
                                            } 
                                            if (NIL == cycl_utilities.expression_find(NIL, bridged_literal, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                final SubLObject item_var = bridged_literal;
                                                if (NIL == member(item_var, rewritten_literals, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    rewritten_literals = cons(item_var, rewritten_literals);
                                                }
                                            }
                                        }
                                        done_var_$45 = makeBoolean(NIL == valid_$47);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    $relevant_mts$.rebind(_prev_bind_3, thread);
                    $relevant_mt_function$.rebind(_prev_bind_2, thread);
                    $mt$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            final SubLObject success = formula_matches_pattern(hl_literal, inference_utilities.$list161);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject col = alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                final SubLObject arg2 = alist_lookup_without_values(v_bindings, ARG1, UNPROVIDED, UNPROVIDED);
                final SubLObject mt_var2 = with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_4 = $mt$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $relevant_mts$.currentBinding(thread);
                try {
                    $mt$.bind(update_inference_mt_relevance_mt(mt_var2), thread);
                    $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var2), thread);
                    $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var2), thread);
                    SubLObject node_var = col;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = create_deck(deck_type);
                    final SubLObject _prev_bind_0_$49 = $sbhl_space$.currentBinding(thread);
                    try {
                        $sbhl_space$.bind(get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$50 = $sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$51 = $relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                                $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_error(ONE_INTEGER, inference_utilities.$str169$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_cerror(ONE_INTEGER, inference_utilities.$$$continue_anyway, inference_utilities.$str169$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn(inference_utilities.$str169$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn(inference_utilities.$str174$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror(inference_utilities.$$$continue_anyway, inference_utilities.$str169$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$51 = $sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$52 = $sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$54 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = $genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_8 = $sbhl_module$.currentBinding(thread);
                                try {
                                    $sbhl_search_module$.bind(get_sbhl_module(inference_utilities.$$genls), thread);
                                    $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(inference_utilities.$$genls)), thread);
                                    $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(inference_utilities.$$genls)), thread);
                                    $genl_inverse_mode_p$.bind(NIL, thread);
                                    $sbhl_module$.bind(get_sbhl_module(inference_utilities.$$genls), thread);
                                    if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(col, get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$52 = $sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$53 = $sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$55 = $genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            $sbhl_search_direction$.bind(get_sbhl_backward_search_direction(), thread);
                                            $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_backward_search_direction(), get_sbhl_module(inference_utilities.$$genls)), thread);
                                            $genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while (NIL != node_var) {
                                                final SubLObject spec = node_var;
                                                if (NIL != inference_utilities.collection_has_rdf_type_cardinality_estimateP(spec)) {
                                                    final SubLObject item_var2 = make_binary_formula(inference_utilities.$$rdf_type, arg2, spec);
                                                    if (NIL == member(item_var2, rewritten_literals, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        rewritten_literals = cons(item_var2, rewritten_literals);
                                                    }
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules = cdolist_list_var2 = get_sbhl_accessible_modules(get_sbhl_module(inference_utilities.$$genls));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$53 = $sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$54 = $genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        $sbhl_module$.bind(module_var, thread);
                                                        $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = naut_to_nart(node_var);
                                                        if (NIL != sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = do_dictionary_contents_state(dictionary_contents(mt_links)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$60 = do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != relevant_mtP(mt_$60)) {
                                                                            final SubLObject _prev_bind_0_$54 = $sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                $sbhl_link_mt$.bind(mt_$60, thread);
                                                                                SubLObject iteration_state_$62;
                                                                                for (iteration_state_$62 = do_dictionary_contents_state(dictionary_contents(tv_links)); NIL == do_dictionary_contents_doneP(iteration_state_$62); iteration_state_$62 = do_dictionary_contents_next(iteration_state_$62)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = do_dictionary_contents_key_value(iteration_state_$62);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$55 = $sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            $sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error(inference_utilities.$str177$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            $sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                do_dictionary_contents_finalize(iteration_state_$62);
                                                                            } finally {
                                                                                $sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_error(FIVE_INTEGER, inference_utilities.$str178$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$64;
                                                                final SubLObject new_list = cdolist_list_var_$64 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$64.first();
                                                                while (NIL != cdolist_list_var_$64) {
                                                                    final SubLObject _prev_bind_0_$56 = $sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        $sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error(inference_utilities.$str177$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        $sbhl_link_generator$.rebind(_prev_bind_0_$56, thread);
                                                                    }
                                                                    cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                                                                    generating_fn = cdolist_list_var_$64.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        $genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                        $sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var = cdolist_list_var2.first();
                                                } 
                                                node_var = deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            $genl_inverse_mode_p$.rebind(_prev_bind_2_$55, thread);
                                            $sbhl_link_direction$.rebind(_prev_bind_1_$53, thread);
                                            $sbhl_search_direction$.rebind(_prev_bind_0_$52, thread);
                                        }
                                    } else {
                                        sbhl_warn(TWO_INTEGER, inference_utilities.$str179$Node__a_does_not_pass_sbhl_type_t, col, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    $sbhl_module$.rebind(_prev_bind_8, thread);
                                    $genl_inverse_mode_p$.rebind(_prev_bind_7, thread);
                                    $sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$54, thread);
                                    $sbhl_search_module_type$.rebind(_prev_bind_1_$52, thread);
                                    $sbhl_search_module$.rebind(_prev_bind_0_$51, thread);
                                }
                            } finally {
                                $relevant_sbhl_tv_function$.rebind(_prev_bind_1_$51, thread);
                                $sbhl_tv$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                            }
                        }
                    } finally {
                        $sbhl_space$.rebind(_prev_bind_0_$49, thread);
                    }
                } finally {
                    $relevant_mts$.rebind(_prev_bind_6, thread);
                    $relevant_mt_function$.rebind(_prev_bind_5, thread);
                    $mt$.rebind(_prev_bind_4, thread);
                }
            }
            SubLObject cdolist_list_var3 = rewritten_literals;
            SubLObject rewritten_literal = NIL;
            rewritten_literal = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                cost = add(cost, inference_utilities.query_literal_removal_cost_internal(rewritten_literal, sense, mt, allowed_modules_spec, seen));
                cdolist_list_var3 = cdolist_list_var3.rest();
                rewritten_literal = cdolist_list_var3.first();
            } 
        }
        return cost;
    }

    public static final SubLObject collection_has_rdf_type_cardinality_estimateP_alt(SubLObject spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject ls = NIL;
                            SubLObject pred_var = $const162$logicalResultSetCardinalityWRTVal;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec, FIVE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec, FIVE_INTEGER, pred_var);
                                    SubLObject done_var = foundP;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_45 = foundP;
                                                            SubLObject token_var_46 = NIL;
                                                            while (NIL == done_var_45) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_46);
                                                                    SubLObject valid_47 = makeBoolean(token_var_46 != assertion);
                                                                    if (NIL != valid_47) {
                                                                        ls = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                        {
                                                                            SubLObject sentence = NIL;
                                                                            SubLObject pred_var_48 = $$meaningSentenceOfSchema;
                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ls, ONE_INTEGER, pred_var_48)) {
                                                                                {
                                                                                    SubLObject iterator_var_49 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ls, ONE_INTEGER, pred_var_48);
                                                                                    SubLObject done_var_50 = foundP;
                                                                                    SubLObject token_var_51 = NIL;
                                                                                    while (NIL == done_var_50) {
                                                                                        {
                                                                                            SubLObject final_index_spec_52 = iteration.iteration_next_without_values_macro_helper(iterator_var_49, token_var_51);
                                                                                            SubLObject valid_53 = makeBoolean(token_var_51 != final_index_spec_52);
                                                                                            if (NIL != valid_53) {
                                                                                                {
                                                                                                    SubLObject final_index_iterator_54 = NIL;
                                                                                                    try {
                                                                                                        final_index_iterator_54 = kb_mapping_macros.new_final_index_iterator(final_index_spec_52, $GAF, $TRUE, NIL);
                                                                                                        {
                                                                                                            SubLObject done_var_55 = foundP;
                                                                                                            SubLObject token_var_56 = NIL;
                                                                                                            while (NIL == done_var_55) {
                                                                                                                {
                                                                                                                    SubLObject assertion_57 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_54, token_var_56);
                                                                                                                    SubLObject valid_58 = makeBoolean(token_var_56 != assertion_57);
                                                                                                                    if (NIL != valid_58) {
                                                                                                                        sentence = assertions_high.gaf_arg(assertion_57, TWO_INTEGER);
                                                                                                                        if (NIL != el_formula_with_operator_p(sentence, $$rdf_type)) {
                                                                                                                            foundP = T;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var_55 = makeBoolean((NIL == valid_58) || (NIL != foundP));
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } finally {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                if (NIL != final_index_iterator_54) {
                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_54);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_59, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_50 = makeBoolean((NIL == valid_53) || (NIL != foundP));
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_45 = makeBoolean((NIL == valid_47) || (NIL != foundP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    public static SubLObject collection_has_rdf_type_cardinality_estimateP(final SubLObject spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(inference_utilities.$$EverythingPSC, thread);
            SubLObject ls = NIL;
            final SubLObject pred_var = inference_utilities.$const182$logicalResultSetCardinalityWRTVal;
            if (NIL != do_gaf_arg_index_key_validator(spec, FIVE_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(spec, FIVE_INTEGER, pred_var);
                SubLObject done_var = foundP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$67 = foundP;
                            final SubLObject token_var_$68 = NIL;
                            while (NIL == done_var_$67) {
                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                final SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(assertion));
                                if (NIL != valid_$69) {
                                    ls = gaf_arg(assertion, ONE_INTEGER);
                                    SubLObject sentence = NIL;
                                    final SubLObject pred_var_$70 = inference_utilities.$$meaningSentenceOfSchema;
                                    if (NIL != do_gaf_arg_index_key_validator(ls, ONE_INTEGER, pred_var_$70)) {
                                        final SubLObject iterator_var_$71 = new_gaf_arg_final_index_spec_iterator(ls, ONE_INTEGER, pred_var_$70);
                                        SubLObject done_var_$68 = foundP;
                                        final SubLObject token_var_$69 = NIL;
                                        while (NIL == done_var_$68) {
                                            final SubLObject final_index_spec_$74 = iteration_next_without_values_macro_helper(iterator_var_$71, token_var_$69);
                                            final SubLObject valid_$70 = makeBoolean(!token_var_$69.eql(final_index_spec_$74));
                                            if (NIL != valid_$70) {
                                                SubLObject final_index_iterator_$76 = NIL;
                                                try {
                                                    final_index_iterator_$76 = new_final_index_iterator(final_index_spec_$74, $GAF, $TRUE, NIL);
                                                    SubLObject done_var_$69 = foundP;
                                                    final SubLObject token_var_$70 = NIL;
                                                    while (NIL == done_var_$69) {
                                                        final SubLObject assertion_$79 = iteration_next_without_values_macro_helper(final_index_iterator_$76, token_var_$70);
                                                        final SubLObject valid_$71 = makeBoolean(!token_var_$70.eql(assertion_$79));
                                                        if (NIL != valid_$71) {
                                                            sentence = gaf_arg(assertion_$79, TWO_INTEGER);
                                                            if (NIL != el_formula_with_operator_p(sentence, inference_utilities.$$rdf_type)) {
                                                                foundP = T;
                                                            }
                                                        }
                                                        done_var_$69 = makeBoolean((NIL == valid_$71) || (NIL != foundP));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator_$76) {
                                                            destroy_final_index_iterator(final_index_iterator_$76);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                                    }
                                                }
                                            }
                                            done_var_$68 = makeBoolean((NIL == valid_$70) || (NIL != foundP));
                                        } 
                                    }
                                }
                                done_var_$67 = makeBoolean((NIL == valid_$69) || (NIL != foundP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }

    /**
     * Estimate the cost of removing LITERAL
     */
    @LispMethod(comment = "Estimate the cost of removing LITERAL")
    public static final SubLObject literal_removal_cost_alt(SubLObject literal, SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactic_specs_total_cost(com.cyc.cycjava.cycl.inference.harness.inference_utilities.some_literal_removal_options_int(literal, sense, mt, allowed_modules_spec));
    }

    /**
     * Estimate the cost of removing LITERAL
     */
    @LispMethod(comment = "Estimate the cost of removing LITERAL")
    public static SubLObject literal_removal_cost(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return inference_utilities.tactic_specs_total_cost(inference_utilities.some_literal_removal_options_int(literal, sense, mt, allowed_modules_spec));
    }

    /**
     * Return T iff there are some removal options available for LITERAL with SENSE.
     */
    @LispMethod(comment = "Return T iff there are some removal options available for LITERAL with SENSE.")
    public static final SubLObject some_literal_removal_options_alt(SubLObject literal, SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_utilities.some_literal_removal_options_int(literal, sense, mt, allowed_modules_spec));
    }

    /**
     * Return T iff there are some removal options available for LITERAL with SENSE.
     */
    @LispMethod(comment = "Return T iff there are some removal options available for LITERAL with SENSE.")
    public static SubLObject some_literal_removal_options(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return sublisp_boolean(inference_utilities.some_literal_removal_options_int(literal, sense, mt, allowed_modules_spec));
    }

    /**
     * Estimate the completeness of the tactics for removing LITERAL.
     *
     * @return completeness-p
     */
    @LispMethod(comment = "Estimate the completeness of the tactics for removing LITERAL.\r\n\r\n@return completeness-p")
    public static final SubLObject literal_removal_completeness_alt(SubLObject literal, SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strongest_completeness = $IMPOSSIBLE;
                {
                    SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
                    SubLObject _prev_bind_1 = inference_macros.$controlling_strategy$.currentBinding(thread);
                    try {
                        inference_macros.$controlling_inferences$.bind(cons(NIL, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
                        inference_macros.$controlling_strategy$.bind(NIL, thread);
                        {
                            SubLObject tactic_specs = com.cyc.cycjava.cycl.inference.harness.inference_utilities.some_literal_removal_options_int(literal, sense, mt, UNPROVIDED);
                            SubLObject cdolist_list_var = tactic_specs;
                            SubLObject tactic_spec = NIL;
                            for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = tactic_spec;
                                    SubLObject current = datum;
                                    SubLObject hl_module = NIL;
                                    SubLObject productivity = NIL;
                                    SubLObject completeness = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt166);
                                    hl_module = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt166);
                                    productivity = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt166);
                                    completeness = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        strongest_completeness = inference_datastructures_enumerated_types.max2_completeness(strongest_completeness, completeness);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt166);
                                    }
                                }
                            }
                            if ($COMPLETE != strongest_completeness) {
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_61 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1_62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            if (NIL != removal_modules_true_sentence.removal_complete_asentP(literal)) {
                                                strongest_completeness = $COMPLETE;
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_62, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        inference_macros.$controlling_strategy$.rebind(_prev_bind_1, thread);
                        inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
                    }
                }
                return strongest_completeness;
            }
        }
    }

    /**
     * Estimate the completeness of the tactics for removing LITERAL.
     *
     * @return completeness-p
     */
    @LispMethod(comment = "Estimate the completeness of the tactics for removing LITERAL.\r\n\r\n@return completeness-p")
    public static SubLObject literal_removal_completeness(final SubLObject literal, final SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strongest_completeness = $IMPOSSIBLE;
        final SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_macros.$controlling_strategy$.currentBinding(thread);
        try {
            inference_macros.$controlling_inferences$.bind(cons(NIL, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_macros.$controlling_strategy$.bind(NIL, thread);
            SubLObject cdolist_list_var;
            final SubLObject tactic_specs = cdolist_list_var = inference_utilities.some_literal_removal_options_int(literal, sense, mt, UNPROVIDED);
            SubLObject tactic_spec = NIL;
            tactic_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = tactic_spec;
                SubLObject hl_module = NIL;
                SubLObject productivity = NIL;
                SubLObject completeness = NIL;
                destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
                productivity = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
                completeness = current.first();
                current = current.rest();
                if (NIL == current) {
                    strongest_completeness = inference_datastructures_enumerated_types.max2_completeness(strongest_completeness, completeness);
                } else {
                    cdestructuring_bind_error(datum, inference_utilities.$list186);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic_spec = cdolist_list_var.first();
            } 
            if ($COMPLETE != strongest_completeness) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$83 = $mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$84 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
                try {
                    $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                    $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                    $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL != removal_modules_true_sentence.removal_complete_asentP(literal)) {
                        strongest_completeness = $COMPLETE;
                    }
                } finally {
                    $relevant_mts$.rebind(_prev_bind_3, thread);
                    $relevant_mt_function$.rebind(_prev_bind_1_$84, thread);
                    $mt$.rebind(_prev_bind_0_$83, thread);
                }
            }
        } finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_2, thread);
            inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
        }
        return strongest_completeness;
    }

    public static final SubLObject some_literal_removal_options_int_alt(SubLObject literal, SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic_specs = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        tactic_specs = com.cyc.cycjava.cycl.inference.harness.inference_utilities.memoized_literal_removal_options(literal, sense, allowed_modules_spec);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return tactic_specs;
            }
        }
    }

    public static SubLObject some_literal_removal_options_int(final SubLObject literal, final SubLObject sense, final SubLObject mt, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt), thread);
            $mt$.bind(possibly_in_mt_determine_mt(mt), thread);
            tactic_specs = inference_utilities.memoized_literal_removal_options(literal, sense, allowed_modules_spec);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }

    public static final SubLObject tactic_specs_total_cost_alt(SubLObject tactic_specs) {
        {
            SubLObject total_productivity = ZERO_INTEGER;
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec = NIL;
            for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = tactic_spec;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject productivity = NIL;
                    SubLObject completeness = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    hl_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    productivity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt166);
                    completeness = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt166);
                    }
                }
            }
            return inference_datastructures_enumerated_types.cost_for_productivity(total_productivity);
        }
    }

    public static SubLObject tactic_specs_total_cost(final SubLObject tactic_specs) {
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = tactic_specs;
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            SubLObject completeness = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
            productivity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list186);
            completeness = current.first();
            current = current.rest();
            if (NIL == current) {
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list186);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        } 
        return inference_datastructures_enumerated_types.cost_for_productivity(total_productivity);
    }

    public static final SubLObject do_contextualized_clause_focal_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt168);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject focal_asent_var = NIL;
                    SubLObject focal_mt_var = NIL;
                    SubLObject focal_sense_var = NIL;
                    SubLObject non_focal_clause_var = NIL;
                    SubLObject clause = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt168);
                    focal_asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt168);
                    focal_mt_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt168);
                    focal_sense_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt168);
                    non_focal_clause_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt168);
                    clause = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_63 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt168);
                            current_63 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt168);
                            if (NIL == member(current_63, $list_alt169, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_63 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt168);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject clause_var = $sym172$CLAUSE_VAR;
                                SubLObject index_var = $sym173$INDEX_VAR;
                                return list(CLET, list(list(clause_var, clause)), list(DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(focal_asent_var, focal_mt_var, focal_sense_var, clause_var, $INDEX, index_var, $DONE, done), listS(CLET, list(list(non_focal_clause_var, list(CLAUSE_WITHOUT_LITERAL, clause_var, focal_sense_var, index_var))), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_contextualized_clause_focal_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject focal_asent_var = NIL;
        SubLObject focal_mt_var = NIL;
        SubLObject focal_sense_var = NIL;
        SubLObject non_focal_clause_var = NIL;
        SubLObject clause = NIL;
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        focal_asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        focal_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        focal_sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        non_focal_clause_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_utilities.$list188);
        clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$85 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_utilities.$list188);
            current_$85 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_utilities.$list188);
            if (NIL == member(current_$85, inference_utilities.$list189, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$85 == inference_utilities.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_utilities.$list188);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject clause_var = inference_utilities.$sym192$CLAUSE_VAR;
        final SubLObject index_var = inference_utilities.$sym193$INDEX_VAR;
        return list(CLET, list(list(clause_var, clause)), list(inference_utilities.DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(focal_asent_var, focal_mt_var, focal_sense_var, clause_var, $INDEX, index_var, $DONE, done), listS(CLET, list(list(non_focal_clause_var, list(inference_utilities.CLAUSE_WITHOUT_LITERAL, clause_var, focal_sense_var, index_var))), append(body, NIL))));
    }

    /**
     * Return a contextualized asent and a sense specifying the literal in DNF-CLAUSE
     * that the Balanced Tactician judges best to focus on first.
     *
     * @return 0 hl-contextualized-asent-p
     * @return 1 sense-p
     * @return 2 preference-level-p
     * @return 3 productivity-p
     */
    @LispMethod(comment = "Return a contextualized asent and a sense specifying the literal in DNF-CLAUSE\r\nthat the Balanced Tactician judges best to focus on first.\r\n\r\n@return 0 hl-contextualized-asent-p\r\n@return 1 sense-p\r\n@return 2 preference-level-p\r\n@return 3 productivity-p\nReturn a contextualized asent and a sense specifying the literal in DNF-CLAUSE\nthat the Balanced Tactician judges best to focus on first.")
    public static final SubLObject join_ordered_committed_literal_alt(SubLObject dnf_clause, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        SubLTrampolineFile.checkType(dnf_clause, CONTEXTUALIZED_DNF_CLAUSE_P);
        {
            SubLObject committed_contextualized_asent = misc_utilities.uninitialized();
            SubLObject committed_sense = misc_utilities.uninitialized();
            SubLObject committed_preference = $DISALLOWED;
            SubLObject committed_productivity = number_utilities.positive_infinity();
            SubLObject max_preference_level = com.cyc.cycjava.cycl.inference.harness.inference_utilities.join_ordered_max_preference_level(dnf_clause, UNPROVIDED);
            SubLObject clause_var = dnf_clause;
            {
                SubLObject candidate_sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(clause_var);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject candidate_mt = NIL;
                        SubLObject candidate_asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject non_focal_clause = clauses.clause_without_literal(clause_var, candidate_sense, index_var);
                                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                                    {
                                        SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                                        SubLObject shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                                        SubLObject candidate_preference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                                        SubLObject candidate_productivity = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_productivity(candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec);
                                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.magic_wand_tactic_specP(candidate_productivity, candidate_preference, max_preference_level)) {
                                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_deems_join_ordered_analysis_betterP(candidate_productivity, candidate_preference, ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER)) {
                                                committed_contextualized_asent = candidate_contextualized_asent;
                                                committed_sense = candidate_sense;
                                                committed_preference = candidate_preference;
                                                committed_productivity = candidate_productivity;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt179);
                        }
                    }
                    index_var = add(index_var, ONE_INTEGER);
                }
            }
            {
                SubLObject candidate_sense = $POS;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.pos_lits(clause_var);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject candidate_mt = NIL;
                        SubLObject candidate_asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject non_focal_clause = clauses.clause_without_literal(clause_var, candidate_sense, index_var);
                                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                                    {
                                        SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                                        SubLObject shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                                        SubLObject candidate_preference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                                        SubLObject candidate_productivity = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_productivity(candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec);
                                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.magic_wand_tactic_specP(candidate_productivity, candidate_preference, max_preference_level)) {
                                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_deems_join_ordered_analysis_betterP(candidate_productivity, candidate_preference, ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER)) {
                                                committed_contextualized_asent = candidate_contextualized_asent;
                                                committed_sense = candidate_sense;
                                                committed_preference = candidate_preference;
                                                committed_productivity = candidate_productivity;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt179);
                        }
                    }
                    index_var = add(index_var, ONE_INTEGER);
                }
            }
            return values(committed_contextualized_asent, committed_sense, committed_preference, committed_productivity);
        }
    }

    /**
     * Return a contextualized asent and a sense specifying the literal in DNF-CLAUSE
     * that the Balanced Tactician judges best to focus on first.
     *
     * @return 0 hl-contextualized-asent-p
     * @return 1 sense-p
     * @return 2 preference-level-p
     * @return 3 productivity-p
     */
    @LispMethod(comment = "Return a contextualized asent and a sense specifying the literal in DNF-CLAUSE\r\nthat the Balanced Tactician judges best to focus on first.\r\n\r\n@return 0 hl-contextualized-asent-p\r\n@return 1 sense-p\r\n@return 2 preference-level-p\r\n@return 3 productivity-p\nReturn a contextualized asent and a sense specifying the literal in DNF-CLAUSE\nthat the Balanced Tactician judges best to focus on first.")
    public static SubLObject join_ordered_committed_literal(final SubLObject dnf_clause, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        assert NIL != inference_datastructures_problem_query.contextualized_dnf_clause_p(dnf_clause) : "! inference_datastructures_problem_query.contextualized_dnf_clause_p(dnf_clause) " + ("inference_datastructures_problem_query.contextualized_dnf_clause_p(dnf_clause) " + "CommonSymbols.NIL != inference_datastructures_problem_query.contextualized_dnf_clause_p(dnf_clause) ") + dnf_clause;
        SubLObject committed_contextualized_asent = uninitialized();
        SubLObject committed_sense = uninitialized();
        SubLObject committed_preference = preference_modules.$max_preference_level$.getGlobalValue();
        SubLObject committed_productivity = positive_infinity();
        final SubLObject max_preference_level = inference_utilities.join_ordered_max_preference_level(dnf_clause, UNPROVIDED);
        SubLObject candidate_sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject candidate_mt = NIL;
            SubLObject candidate_asent = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject non_focal_clause = clause_without_literal(dnf_clause, candidate_sense, index_var);
                if (NIL == inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                    final SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                    final SubLObject shared_vars = inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                    final SubLObject candidate_preference = inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                    final SubLObject candidate_productivity = inference_utilities.literal_removal_productivity(candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec);
                    if ((NIL == inference_utilities.magic_wand_tactic_specP(candidate_productivity, candidate_preference, max_preference_level)) && (NIL != inference_utilities.tactician_deems_join_ordered_analysis_betterP(candidate_productivity, candidate_preference, ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER))) {
                        committed_contextualized_asent = candidate_contextualized_asent;
                        committed_sense = candidate_sense;
                        committed_preference = candidate_preference;
                        committed_productivity = candidate_productivity;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list199);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        candidate_sense = $POS;
        index_var = ZERO_INTEGER;
        cdolist_list_var = pos_lits(dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject candidate_mt = NIL;
            SubLObject candidate_asent = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject non_focal_clause = clause_without_literal(dnf_clause, candidate_sense, index_var);
                if (NIL == inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                    final SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                    final SubLObject shared_vars = inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                    final SubLObject candidate_preference = inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                    final SubLObject candidate_productivity = inference_utilities.literal_removal_productivity(candidate_asent, candidate_sense, candidate_mt, allowed_modules_spec);
                    if ((NIL == inference_utilities.magic_wand_tactic_specP(candidate_productivity, candidate_preference, max_preference_level)) && (NIL != inference_utilities.tactician_deems_join_ordered_analysis_betterP(candidate_productivity, candidate_preference, ONE_INTEGER, committed_productivity, committed_preference, ONE_INTEGER))) {
                        committed_contextualized_asent = candidate_contextualized_asent;
                        committed_sense = candidate_sense;
                        committed_preference = candidate_preference;
                        committed_productivity = candidate_productivity;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list199);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return values(committed_contextualized_asent, committed_sense, committed_preference, committed_productivity);
    }

    public static final SubLObject join_ordered_max_preference_level_alt(SubLObject dnf_clause, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        {
            SubLObject max_preference = $DISALLOWED;
            SubLObject max_foundP = NIL;
            SubLObject clause_var = dnf_clause;
            {
                SubLObject candidate_sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject rest = NIL;
                for (rest = clauses.neg_lits(clause_var); !((NIL != max_foundP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject contextualized_asent = rest.first();
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject candidate_mt = NIL;
                        SubLObject candidate_asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject non_focal_clause = clauses.clause_without_literal(clause_var, candidate_sense, index_var);
                                if ($PREFERRED != max_preference) {
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                                        {
                                            SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                                            SubLObject shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                                            SubLObject candidate_preference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                                            if (NIL != preference_modules.preference_level_G(candidate_preference, max_preference)) {
                                                max_preference = candidate_preference;
                                                max_foundP = eq($PREFERRED, max_preference);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt179);
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            {
                SubLObject candidate_sense = $POS;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject rest = NIL;
                for (rest = clauses.pos_lits(clause_var); !((NIL != max_foundP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject contextualized_asent = rest.first();
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject candidate_mt = NIL;
                        SubLObject candidate_asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt179);
                        candidate_asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject non_focal_clause = clauses.clause_without_literal(clause_var, candidate_sense, index_var);
                                if ($PREFERRED != max_preference) {
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense)) {
                                        {
                                            SubLObject candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                                            SubLObject shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                                            SubLObject candidate_preference = com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                                            if (NIL != preference_modules.preference_level_G(candidate_preference, max_preference)) {
                                                max_preference = candidate_preference;
                                                max_foundP = eq($PREFERRED, max_preference);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt179);
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            return max_preference;
        }
    }

    public static SubLObject join_ordered_max_preference_level(final SubLObject dnf_clause, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        SubLObject max_preference = preference_modules.$max_preference_level$.getGlobalValue();
        SubLObject max_foundP = NIL;
        SubLObject candidate_sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject rest;
        SubLObject contextualized_asent;
        SubLObject current;
        SubLObject datum;
        SubLObject candidate_mt;
        SubLObject candidate_asent;
        SubLObject non_focal_clause;
        SubLObject candidate_contextualized_asent;
        SubLObject shared_vars;
        SubLObject candidate_preference;
        for (rest = NIL, rest = neg_lits(dnf_clause); (NIL == max_foundP) && (NIL != rest); rest = rest.rest()) {
            contextualized_asent = rest.first();
            datum = current = contextualized_asent;
            candidate_mt = NIL;
            candidate_asent = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                non_focal_clause = clause_without_literal(dnf_clause, candidate_sense, index_var);
                if (($PREFERRED != max_preference) && (NIL == inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense))) {
                    candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                    shared_vars = inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                    candidate_preference = inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                    if (NIL != preference_modules.preference_level_G(candidate_preference, max_preference)) {
                        max_preference = candidate_preference;
                        max_foundP = eq($PREFERRED, max_preference);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list199);
            }
            index_var = add(index_var, ONE_INTEGER);
        }
        candidate_sense = $POS;
        index_var = ZERO_INTEGER;
        for (rest = NIL, rest = pos_lits(dnf_clause); (NIL == max_foundP) && (NIL != rest); rest = rest.rest()) {
            contextualized_asent = rest.first();
            datum = current = contextualized_asent;
            candidate_mt = NIL;
            candidate_asent = NIL;
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_utilities.$list199);
            candidate_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                non_focal_clause = clause_without_literal(dnf_clause, candidate_sense, index_var);
                if (($PREFERRED != max_preference) && (NIL == inference_utilities.tactician_chooses_to_throw_away_asent_mt_senseP(candidate_asent, candidate_mt, candidate_sense))) {
                    candidate_contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(candidate_mt, candidate_asent);
                    shared_vars = inference_utilities.common_hl_variables(candidate_contextualized_asent, non_focal_clause);
                    candidate_preference = inference_utilities.literal_removal_preference_level(candidate_asent, candidate_sense, shared_vars, candidate_mt, allowed_modules_spec);
                    if (NIL != preference_modules.preference_level_G(candidate_preference, max_preference)) {
                        max_preference = candidate_preference;
                        max_foundP = eq($PREFERRED, max_preference);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, inference_utilities.$list199);
            }
            index_var = add(index_var, ONE_INTEGER);
        }
        return max_preference;
    }

    public static final SubLObject tactician_chooses_to_throw_away_asent_mt_senseP_alt(SubLObject candidate_asent, SubLObject candidate_mt, SubLObject candidate_sense) {
        return NIL;
    }

    public static SubLObject tactician_chooses_to_throw_away_asent_mt_senseP(final SubLObject candidate_asent, final SubLObject candidate_mt, final SubLObject candidate_sense) {
        return NIL;
    }

    public static final SubLObject common_hl_variables_alt(SubLObject expression1, SubLObject expression2) {
        {
            SubLObject vars1 = list_utilities.tree_gather(expression1, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject vars2 = list_utilities.tree_gather(expression2, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject common_vars = intersection(vars1, vars2, symbol_function(EQ), UNPROVIDED);
            return variables.sort_hl_variable_list(common_vars);
        }
    }

    public static SubLObject common_hl_variables(final SubLObject expression1, final SubLObject expression2) {
        final SubLObject vars1 = tree_gather(expression1, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject vars2 = tree_gather(expression2, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject common_vars = intersection(vars1, vars2, symbol_function(EQL), UNPROVIDED);
        return sort_hl_variable_list(common_vars);
    }

    public static final SubLObject memoized_literal_removal_options_internal_alt(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return inference_worker_removal.literal_removal_options(asent, sense, allowed_modules_spec);
    }

    public static SubLObject memoized_literal_removal_options_internal(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return inference_worker_removal.literal_removal_options(asent, sense, allowed_modules_spec);
    }

    public static final SubLObject memoized_literal_removal_options_alt(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_utilities.memoized_literal_removal_options_internal(asent, sense, allowed_modules_spec);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_LITERAL_REMOVAL_OPTIONS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_LITERAL_REMOVAL_OPTIONS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_LITERAL_REMOVAL_OPTIONS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(asent, sense, allowed_modules_spec);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw65$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sense.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && allowed_modules_spec.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_utilities.memoized_literal_removal_options_internal(asent, sense, allowed_modules_spec)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, sense, allowed_modules_spec));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_literal_removal_options(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_utilities.memoized_literal_removal_options_internal(asent, sense, allowed_modules_spec);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_utilities.MEMOIZED_LITERAL_REMOVAL_OPTIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_utilities.MEMOIZED_LITERAL_REMOVAL_OPTIONS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_utilities.MEMOIZED_LITERAL_REMOVAL_OPTIONS, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_3(asent, sense, allowed_modules_spec);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sense.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && allowed_modules_spec.equal(cached_args.first())) {
                            return caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_utilities.memoized_literal_removal_options_internal(asent, sense, allowed_modules_spec)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sense, allowed_modules_spec));
        return caching_results(results3);
    }

    public static final SubLObject literal_removal_preference_level_alt(SubLObject asent, SubLObject sense, SubLObject shared_vars, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preference_level = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL != variables.fully_bound_p(asent)) && (NIL != variables.fully_bound_p(mt))) {
                            preference_level = $PREFERRED;
                        } else {
                            if (NIL == shared_vars) {
                                preference_level = $PREFERRED;
                            } else {
                                if ($COMPLETE == com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_completeness(asent, sense, mt)) {
                                    preference_level = $PREFERRED;
                                } else {
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_utilities.memoized_literal_removal_options(asent, sense, allowed_modules_spec)) {
                                        preference_level = $DISALLOWED;
                                    } else {
                                        preference_level = preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars, $TACTICAL);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return preference_level;
            }
        }
    }

    public static SubLObject literal_removal_preference_level(final SubLObject asent, final SubLObject sense, final SubLObject shared_vars, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != fully_bound_p(asent)) && (NIL != fully_bound_p(mt))) {
                preference_level = $PREFERRED;
            } else
                if (NIL == shared_vars) {
                    preference_level = $PREFERRED;
                } else
                    if ($COMPLETE == inference_utilities.literal_removal_completeness(asent, sense, mt)) {
                        preference_level = $PREFERRED;
                    } else {
                        preference_level = preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars, $TACTICAL);
                        if ((NIL != preference_modules.preference_level_L(preference_level, $DISALLOWED)) && (NIL == inference_utilities.memoized_literal_removal_options(asent, sense, allowed_modules_spec))) {
                            preference_level = $DISALLOWED;
                        }
                    }


        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return preference_level;
    }

    public static final SubLObject literal_removal_productivity_alt(SubLObject literal, SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(com.cyc.cycjava.cycl.inference.harness.inference_utilities.literal_removal_cost(literal, sense, mt, allowed_modules_spec));
    }

    public static SubLObject literal_removal_productivity(final SubLObject literal, final SubLObject sense, SubLObject mt, SubLObject allowed_modules_spec) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(inference_utilities.literal_removal_cost(literal, sense, mt, allowed_modules_spec));
    }

    public static final SubLObject magic_wand_tactic_specP_alt(SubLObject productivity, SubLObject preference_level, SubLObject max_sibling_preference_level) {
        return makeBoolean(((NIL != inference_datastructures_enumerated_types.productivity_E(ZERO_INTEGER, productivity)) && (NIL != inference_tactician_utilities.under_magic_wand_max_preference_levelP(preference_level))) && (NIL != preference_modules.preference_level_L(preference_level, max_sibling_preference_level)));
    }

    public static SubLObject magic_wand_tactic_specP(final SubLObject productivity, final SubLObject preference_level, final SubLObject max_sibling_preference_level) {
        return makeBoolean(((NIL != inference_datastructures_enumerated_types.productivity_E(ZERO_INTEGER, productivity)) && (NIL != inference_tactician_utilities.under_magic_wand_max_preference_levelP(preference_level))) && (NIL != preference_modules.preference_level_L(preference_level, max_sibling_preference_level)));
    }

    public static final SubLObject tactician_deems_join_ordered_analysis_betterP_alt(SubLObject candidate_productivity, SubLObject candidate_preference, SubLObject candidate_literal_count, SubLObject committed_productivity, SubLObject committed_preference, SubLObject committed_literal_count) {
        return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_productivity, candidate_preference, $JOIN_ORDERED, candidate_literal_count, committed_productivity, committed_preference, $JOIN_ORDERED, committed_literal_count);
    }

    public static SubLObject tactician_deems_join_ordered_analysis_betterP(final SubLObject candidate_productivity, final SubLObject candidate_preference, final SubLObject candidate_literal_count, final SubLObject committed_productivity, final SubLObject committed_preference, final SubLObject committed_literal_count) {
        return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_productivity, candidate_preference, $JOIN_ORDERED, candidate_literal_count, committed_productivity, committed_preference, $JOIN_ORDERED, committed_literal_count);
    }

    public static final SubLObject current_query_properties_alt() {
        {
            SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference) {
                return inference_datastructures_enumerated_types.inference_input_non_default_query_properties(inference);
            }
        }
        return inference_trivial.current_trivial_query_properties();
    }

    public static SubLObject current_query_properties() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference) {
            return inference_datastructures_enumerated_types.inference_input_non_default_query_properties(inference);
        }
        return inference_trivial.current_trivial_query_properties();
    }

    public static SubLObject inference_literal_to_supports_map(final SubLObject inference, final SubLObject proof, SubLObject literal_to_proofs_map, SubLObject variable_map, SubLObject supported_asents) {
        if (literal_to_proofs_map == UNPROVIDED) {
            literal_to_proofs_map = NIL;
        }
        if (variable_map == UNPROVIDED) {
            variable_map = NIL;
        }
        if (supported_asents == UNPROVIDED) {
            supported_asents = NIL;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        if (((NIL != literal_to_proofs_map) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hash_table_p(literal_to_proofs_map))) {
            throw new AssertionError(literal_to_proofs_map);
        }
        if (!literal_to_proofs_map.isHashtable()) {
            literal_to_proofs_map = make_hash_table(inference_datastructures_problem_store.problem_store_proof_count(inference_datastructures_inference.inference_problem_store(inference)), EQUAL, UNPROVIDED);
        }
        final SubLObject proof_direct_subproofs = inference_datastructures_proof.proof_direct_subproofs(proof);
        final SubLObject proof_supported_problem = inference_datastructures_proof.proof_supported_problem(proof);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(proof_supported_problem);
        if (proof_supported_problem.eql(inference_datastructures_inference.inference_root_problem(inference)) && (NIL == variable_map)) {
            variable_map = inference_datastructures_inference.inference_el_bindings(inference);
        }
        if (((NIL != inference_datastructures_problem.single_literal_problem_p(proof_supported_problem)) && (NIL == proof_direct_subproofs)) && (((NIL != inference_modules.hl_module_p(inference_datastructures_proof.proof_type(proof))) && (inference_modules.hl_module_type(inference_datastructures_proof.proof_type(proof)) == $REMOVAL)) || (inference_datastructures_proof.proof_type(proof) == $RESTRICTION))) {
            SubLObject cdolist_list_var = problem_query;
            SubLObject contextualized_clause = NIL;
            contextualized_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$86 = neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$86.first();
                while (NIL != cdolist_list_var_$86) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, inference_utilities.$list208);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, inference_utilities.$list208);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject item_var;
                        asent = item_var = apply_bindings_backwards(variable_map, asent);
                        if (NIL == member(item_var, supported_asents, EQUAL, symbol_function(IDENTITY))) {
                            supported_asents = cons(item_var, supported_asents);
                        }
                        SubLObject cdolist_list_var_$87 = supported_asents;
                        SubLObject supported_asent = NIL;
                        supported_asent = cdolist_list_var_$87.first();
                        while (NIL != cdolist_list_var_$87) {
                            SubLObject cdolist_list_var_$88 = inference_datastructures_proof.proof_supports(proof);
                            SubLObject support = NIL;
                            support = cdolist_list_var_$88.first();
                            while (NIL != cdolist_list_var_$88) {
                                hash_table_utilities.pushnew_hash(supported_asent, support, literal_to_proofs_map, EQUAL);
                                SubLObject cdolist_list_var_$89 = hl_supports.hl_justify_expanded(support);
                                SubLObject just = NIL;
                                just = cdolist_list_var_$89.first();
                                while (NIL != cdolist_list_var_$89) {
                                    hash_table_utilities.pushnew_hash(supported_asent, just, literal_to_proofs_map, EQUAL);
                                    cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                                    just = cdolist_list_var_$89.first();
                                } 
                                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                                support = cdolist_list_var_$88.first();
                            } 
                            cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                            supported_asent = cdolist_list_var_$87.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, inference_utilities.$list208);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    contextualized_asent = cdolist_list_var_$86.first();
                } 
                sense = $POS;
                index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$90 = pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$90.first();
                while (NIL != cdolist_list_var_$90) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, inference_utilities.$list208);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, inference_utilities.$list208);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject item_var;
                        asent = item_var = apply_bindings_backwards(variable_map, asent);
                        if (NIL == member(item_var, supported_asents, EQUAL, symbol_function(IDENTITY))) {
                            supported_asents = cons(item_var, supported_asents);
                        }
                        SubLObject cdolist_list_var_$91 = supported_asents;
                        SubLObject supported_asent = NIL;
                        supported_asent = cdolist_list_var_$91.first();
                        while (NIL != cdolist_list_var_$91) {
                            SubLObject cdolist_list_var_$92 = inference_datastructures_proof.proof_supports(proof);
                            SubLObject support = NIL;
                            support = cdolist_list_var_$92.first();
                            while (NIL != cdolist_list_var_$92) {
                                hash_table_utilities.pushnew_hash(supported_asent, support, literal_to_proofs_map, EQUAL);
                                SubLObject cdolist_list_var_$93 = hl_supports.hl_justify_expanded(support);
                                SubLObject just = NIL;
                                just = cdolist_list_var_$93.first();
                                while (NIL != cdolist_list_var_$93) {
                                    hash_table_utilities.pushnew_hash(supported_asent, just, literal_to_proofs_map, EQUAL);
                                    cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                                    just = cdolist_list_var_$93.first();
                                } 
                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                support = cdolist_list_var_$92.first();
                            } 
                            cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                            supported_asent = cdolist_list_var_$91.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, inference_utilities.$list208);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                    contextualized_asent = cdolist_list_var_$90.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            } 
        } else {
            SubLObject sub_proof_variable_map = variable_map;
            if ((NIL != inference_modules.hl_module_p(inference_datastructures_proof.proof_type(proof))) && (inference_modules.hl_module_type(inference_datastructures_proof.proof_type(proof)) == $TRANSFORMATION)) {
                sub_proof_variable_map = apply_bindings(inference_worker_transformation.transformation_link_bindings(inference_datastructures_proof.proof_link(proof)), variable_map);
                sub_proof_variable_map = apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_transformation.transformation_link_supporting_mapped_problem(inference_datastructures_proof.proof_link(proof))), sub_proof_variable_map);
            }
            SubLObject cdolist_list_var2 = problem_query;
            SubLObject contextualized_clause2 = NIL;
            contextualized_clause2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject sense2 = $NEG;
                SubLObject index_var2 = ZERO_INTEGER;
                SubLObject cdolist_list_var_$94 = neg_lits(contextualized_clause2);
                SubLObject contextualized_asent2 = NIL;
                contextualized_asent2 = cdolist_list_var_$94.first();
                while (NIL != cdolist_list_var_$94) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = contextualized_asent2;
                    SubLObject mt2 = NIL;
                    SubLObject asent2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, inference_utilities.$list208);
                    mt2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, inference_utilities.$list208);
                    asent2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        final SubLObject item_var2;
                        asent2 = item_var2 = apply_bindings_backwards(variable_map, asent2);
                        if (NIL == member(item_var2, supported_asents, EQUAL, symbol_function(IDENTITY))) {
                            supported_asents = cons(item_var2, supported_asents);
                        }
                        SubLObject cdolist_list_var_$95 = inference_datastructures_proof.proof_direct_subproofs(proof);
                        SubLObject subproof = NIL;
                        subproof = cdolist_list_var_$95.first();
                        while (NIL != cdolist_list_var_$95) {
                            literal_to_proofs_map = inference_utilities.inference_literal_to_supports_map(inference, subproof, literal_to_proofs_map, sub_proof_variable_map, supported_asents);
                            cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                            subproof = cdolist_list_var_$95.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum2, inference_utilities.$list208);
                    }
                    index_var2 = add(index_var2, ONE_INTEGER);
                    cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                    contextualized_asent2 = cdolist_list_var_$94.first();
                } 
                sense2 = $POS;
                index_var2 = ZERO_INTEGER;
                SubLObject cdolist_list_var_$96 = pos_lits(contextualized_clause2);
                contextualized_asent2 = NIL;
                contextualized_asent2 = cdolist_list_var_$96.first();
                while (NIL != cdolist_list_var_$96) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = contextualized_asent2;
                    SubLObject mt2 = NIL;
                    SubLObject asent2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, inference_utilities.$list208);
                    mt2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, inference_utilities.$list208);
                    asent2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        final SubLObject item_var2;
                        asent2 = item_var2 = apply_bindings_backwards(variable_map, asent2);
                        if (NIL == member(item_var2, supported_asents, EQUAL, symbol_function(IDENTITY))) {
                            supported_asents = cons(item_var2, supported_asents);
                        }
                        SubLObject cdolist_list_var_$97 = inference_datastructures_proof.proof_direct_subproofs(proof);
                        SubLObject subproof = NIL;
                        subproof = cdolist_list_var_$97.first();
                        while (NIL != cdolist_list_var_$97) {
                            literal_to_proofs_map = inference_utilities.inference_literal_to_supports_map(inference, subproof, literal_to_proofs_map, sub_proof_variable_map, supported_asents);
                            cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                            subproof = cdolist_list_var_$97.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum2, inference_utilities.$list208);
                    }
                    index_var2 = add(index_var2, ONE_INTEGER);
                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                    contextualized_asent2 = cdolist_list_var_$96.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                contextualized_clause2 = cdolist_list_var2.first();
            } 
        }
        return literal_to_proofs_map;
    }

    static private final SubLList $list_alt2 = list($OPEN, makeKeyword("CLOSED"));

    static private final SubLList $list_alt3 = list(makeKeyword("ANSWERABLE"), makeKeyword("UNANSWERABLE"));

    public static SubLObject problem_store_forts(final SubLObject problem_store) {
        final SubLObject result_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(problem_store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$98 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$98, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$98);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        set_add_all(tree_gather(inference_datastructures_problem.problem_query(problem), symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED), result_set);
                    }
                }
            }
            final SubLObject idx_$99 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$99)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$99);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        set_add_all(tree_gather(inference_datastructures_problem.problem_query(problem2), symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED), result_set);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return set.set_element_list(result_set);
    }

    static private final SubLString $str_alt4$Unhandled_inference_property__S = makeString("Unhandled inference property ~S");

    public static final SubLSymbol $kw12$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    public static final SubLSymbol $kw15$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw16$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw17$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw18$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    public static final SubLSymbol $kw19$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    public static final SubLSymbol $kw26$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    public static final SubLSymbol $kw27$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    public static final SubLSymbol $kw33$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");

    public static final SubLSymbol $kw34$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    public static final SubLSymbol $kw35$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    public static final SubLSymbol $kw36$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    public static final SubLSymbol $kw37$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    public static SubLObject gather_required_vocab_handler(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != forts.fort_p(v_object)) && (NIL == set.set_memberP(v_object, inference_utilities.$gather_required_vocab_set$.getDynamicValue(thread)))) && (NIL == kb_cleanup.ephemeral_termP(v_object))) {
            set.set_add(v_object, inference_utilities.$gather_required_vocab_set$.getDynamicValue(thread));
            if (NIL != inference_utilities.$gather_required_vocab_trace$.getDynamicValue(thread)) {
                force_format(inference_utilities.$gather_required_vocab_trace$.getDynamicValue(thread), inference_utilities.$str211$__added__S, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return v_object;
        }
        return NIL;
    }

    public static final SubLSymbol $kw38$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    public static final SubLSymbol $kw39$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    public static final SubLSymbol $kw40$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    static private final SubLString $str_alt43$Got_more_than_2_answers_for__a_wh = makeString("Got more than 2 answers for ~a where #$True and #$False were expected to be the only possible answers");

    static private final SubLSymbol $sym45$SINGLETON_ = makeSymbol("SINGLETON?");

    public static SubLObject gather_supports_required_vocab(final SubLObject supports, SubLObject accumulator, SubLObject trace_stream) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        if (trace_stream == UNPROVIDED) {
            trace_stream = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == accumulator) {
            accumulator = set.new_set(symbol_function(EQL), UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = inference_utilities.$gather_required_vocab_set$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_utilities.$gather_required_vocab_trace$.currentBinding(thread);
        try {
            inference_utilities.$gather_required_vocab_set$.bind(accumulator, thread);
            inference_utilities.$gather_required_vocab_trace$.bind(trace_stream, thread);
            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), supports, T, UNPROVIDED);
        } finally {
            inference_utilities.$gather_required_vocab_trace$.rebind(_prev_bind_2, thread);
            inference_utilities.$gather_required_vocab_set$.rebind(_prev_bind_0, thread);
        }
        return accumulator;
    }

    static private final SubLString $str_alt48$No_true_answer_for__a = makeString("No true answer for ~a");

    static private final SubLString $str_alt49$No_false_answer_for__a = makeString("No false answer for ~a");

    static private final SubLSymbol $sym52$INFERENCE_ANSWER__ = makeSymbol("INFERENCE-ANSWER-<");

    static private final SubLList $list_alt56 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    static private final SubLSymbol $sym57$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLSymbol $kw60$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");

    static private final SubLString $str_alt62$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static SubLObject gather_inference_required_vocab(final SubLObject inference, SubLObject accumulator) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == accumulator) {
            accumulator = set.new_set(symbol_function(EQL), UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = inference_utilities.$gather_required_vocab_set$.currentBinding(thread);
        try {
            inference_utilities.$gather_required_vocab_set$.bind(accumulator, thread);
            final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
            final SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
            final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
            final SubLObject explicit_supports = inference_datastructures_inference.inference_all_answer_supports(inference);
            thread.resetMultipleValues();
            final SubLObject backward_theory = hl_supports.hl_justification_complete_backward_theory(explicit_supports, mt, UNPROVIDED, UNPROVIDED);
            final SubLObject intermediate_hl_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), el_query, T, UNPROVIDED);
            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), hl_query, T, UNPROVIDED);
            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), mt, T, UNPROVIDED);
            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$100 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$100, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$100);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject v_bindings;
                    SubLObject cdolist_list_var;
                    SubLObject justification;
                    SubLObject supports;
                    SubLObject cdolist_list_var_$101;
                    SubLObject proof;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        v_answer = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(v_answer)) {
                                v_answer = $SKIP;
                            }
                            v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), v_bindings, T, UNPROVIDED);
                            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                            justification = NIL;
                            justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), supports, T, UNPROVIDED);
                                cdolist_list_var_$101 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                proof = NIL;
                                proof = cdolist_list_var_$101.first();
                                while (NIL != cdolist_list_var_$101) {
                                    cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                    proof = cdolist_list_var_$101.first();
                                } 
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            } 
                        }
                    }
                }
                final SubLObject idx_$101 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$101)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$101);
                    SubLObject id2 = NIL;
                    SubLObject v_answer2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            v_answer2 = getEntryValue(cdohash_entry);
                            final SubLObject v_bindings2 = inference_datastructures_inference.inference_answer_bindings(v_answer2);
                            cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), v_bindings2, T, UNPROVIDED);
                            SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                            SubLObject justification2 = NIL;
                            justification2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification2);
                                cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), supports2, T, UNPROVIDED);
                                SubLObject cdolist_list_var_$102 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                                SubLObject proof2 = NIL;
                                proof2 = cdolist_list_var_$102.first();
                                while (NIL != cdolist_list_var_$102) {
                                    cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                                    proof2 = cdolist_list_var_$102.first();
                                } 
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                justification2 = cdolist_list_var2.first();
                            } 
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            SubLObject cdolist_list_var3 = backward_theory;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), assertion_cons(assertion), T, UNPROVIDED);
                cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), assertion_mt(assertion), T, UNPROVIDED);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion = cdolist_list_var3.first();
            } 
            cdolist_list_var3 = intermediate_hl_supports;
            SubLObject hl_support = NIL;
            hl_support = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                cycl_utilities.expression_map(symbol_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER), hl_support, T, UNPROVIDED);
                cdolist_list_var3 = cdolist_list_var3.rest();
                hl_support = cdolist_list_var3.first();
            } 
        } finally {
            inference_utilities.$gather_required_vocab_set$.rebind(_prev_bind_0, thread);
        }
        return accumulator;
    }

    static private final SubLSymbol $sym64$SATISFIED_PROBLEM_ = makeSymbol("SATISFIED-PROBLEM?");

    public static final SubLSymbol $kw65$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt68$Inference__A_is_not_controlled_by = makeString("Inference ~A is not controlled by the thread of thinking task ~A.");

    static private final SubLSymbol $sym72$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list_alt74 = list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL")));

    static private final SubLString $str_alt75$new_continuable_antecedent_infere = makeString("new-continuable-antecedent-inference could not find the transformed problem for ~s in ~s");

    static private final SubLString $str_alt79$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt83$Output_format__S_is_not_supported = makeString("Output format ~S is not supported.");

    static private final SubLString $str_alt84$_A_C = makeString("~A~C");

    static private final SubLString $str_alt85$__ = makeString("~%");

    static private final SubLString $str_alt86$__ = makeString("#$");

    static private final SubLList $list_alt87 = list(makeKeyword("ANSWERABLE"), makeKeyword("UNANSWERABLE"), makeKeyword("UNKNOWN"));

    public static final SubLSymbol $kw90$MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");

    static private final SubLList $list_alt95 = list(makeSymbol("LITERAL"), makeSymbol("ANSWERABILITY-STATUS"));

    static private final SubLString $str_alt100$unexpected_preference_level__s = makeString("unexpected preference level ~s");

    static private final SubLList $list_alt110 = list(makeSymbol("LIT"), makeSymbol("NEW-STATUS"));

    static private final SubLString $str_alt119$Couldn_t_find_a_term_representing = makeString("Couldn't find a term representing this machine based on its name ~S.");

    static private final SubLList $list_alt121 = list(reader_make_constant_shell("Computer"));

    static private final SubLSymbol $sym138$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");

    static private final SubLList $list_alt141 = list(makeSymbol("BRIDGING-ARGNUM"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt142 = list(reader_make_constant_shell("isa"), list(makeKeyword("AND"), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("ARG1"))), list($BIND, makeSymbol("COL")));

    static private final SubLString $str_alt150$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt155$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt158$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt159$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLObject $const162$logicalResultSetCardinalityWRTVal = reader_make_constant_shell("logicalResultSetCardinalityWRTValue");

    static private final SubLList $list_alt166 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    static private final SubLList $list_alt168 = list(list(makeSymbol("FOCAL-ASENT-VAR"), makeSymbol("FOCAL-MT-VAR"), makeSymbol("FOCAL-SENSE-VAR"), makeSymbol("NON-FOCAL-CLAUSE-VAR"), makeSymbol("CLAUSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt169 = list($DONE);

    public static SubLObject gather_vocab_required_for_kbq_query_set(final SubLObject query_spec_set, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject trace_stream) {
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (trace_stream == UNPROVIDED) {
            trace_stream = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vocab_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject rule_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        inference_utilities.$kbq_query_set_inference_vocab_set$.setDynamicValue(vocab_set, thread);
        final SubLObject _prev_bind_0 = inference_utilities.$gather_required_vocab_trace$.currentBinding(thread);
        try {
            inference_utilities.$gather_required_vocab_trace$.bind(trace_stream, thread);
            kbq_query_run.run_kbq_query_spec_set_and_process_inferences(query_spec_set, inference_utilities.GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT, list($PROGRESS_MESSAGE, inference_utilities.$str215$Gathering_vocab_from_KBQ_inferenc, $OUTLIER_TIMEOUT, outlier_timeout, inference_utilities.$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $ADDITIONAL_ARGS, list(vocab_set, rule_set)));
        } finally {
            inference_utilities.$gather_required_vocab_trace$.rebind(_prev_bind_0, thread);
        }
        return values(vocab_set, rule_set);
    }

    static private final SubLSymbol $sym172$CLAUSE_VAR = makeUninternedSymbol("CLAUSE-VAR");

    static private final SubLSymbol $sym173$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    static private final SubLList $list_alt179 = list(makeSymbol("CANDIDATE-MT"), makeSymbol("CANDIDATE-ASENT"));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt192 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), makeSymbol("?X"))), makeKeyword("ANSWERABLE")), list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Dog"), makeSymbol("?X"))), makeKeyword("UNANSWERABLE")), list(list(list(reader_make_constant_shell("performsActsOfType-Percentage"), makeSymbol("?AGENT"), makeSymbol("?COL1"), makeSymbol("?COL2"), makeSymbol("?RATIO"))), makeKeyword("UNKNOWN")), list(list(list(reader_make_constant_shell("ratioOfCollectionToDifferentiatedCollection"), makeSymbol("?MOD"), makeSymbol("?COLL"), makeSymbol("?DIFF"), makeSymbol("?CARD-DIFF")), reader_make_constant_shell("CyclistsMt"), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER)), makeKeyword("UNKNOWN")));

    public static SubLObject gather_vocab_required_for_kbq_query_set_int(final SubLObject kbq, final SubLObject inferences, final SubLObject additional_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vocab_set = NIL;
        SubLObject rule_set = NIL;
        destructuring_bind_must_consp(additional_args, additional_args, inference_utilities.$list219);
        vocab_set = additional_args.first();
        SubLObject current = additional_args.rest();
        destructuring_bind_must_consp(current, additional_args, inference_utilities.$list219);
        rule_set = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject before = set.set_size(vocab_set);
            SubLObject cdolist_list_var = inferences;
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject el_kbq = cycl_utilities.hl_to_el(kbq);
                force_format(inference_utilities.$gather_required_vocab_trace$.getDynamicValue(thread), inference_utilities.$str220$___a___a__a__, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), el_kbq, inference_datastructures_inference.inference_cumulative_time(inference), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                inference_utilities.gather_inference_required_vocab(inference, vocab_set);
                inference_utilities.gather_inference_successful_rules(inference, rule_set);
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            } 
            final SubLObject after = set.set_size(vocab_set);
            return subtract(after, before);
        }
        cdestructuring_bind_error(additional_args, inference_utilities.$list219);
        return NIL;
    }

    public static final SubLObject $list_alt193 = com.cyc.cycjava.cycl.inference.harness.inference_utilities._constant_193_initializer();

    public static SubLObject gather_inference_successful_rules(final SubLObject inference, SubLObject accumulator) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        final SubLObject successful_rules = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        if (NIL != accumulator) {
            set_add_all(successful_rules, accumulator);
        }
        return construct_set_from_list(successful_rules, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject problem_store_link_id_map(final SubLObject store, SubLObject starting_id, SubLObject ending_id) {
        if (starting_id == UNPROVIDED) {
            starting_id = ZERO_INTEGER;
        }
        if (ending_id == UNPROVIDED) {
            ending_id = NIL;
        }
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        assert NIL != subl_promotions.non_negative_integer_p(starting_id) : "! subl_promotions.non_negative_integer_p(starting_id) " + ("subl_promotions.non_negative_integer_p(starting_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(starting_id) ") + starting_id;
        if (((NIL != ending_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(ending_id))) {
            throw new AssertionError(ending_id);
        }
        final SubLObject link_limit = (NIL != ending_id) ? ending_id : inference_datastructures_problem_store.problem_store_historical_link_count(store);
        SubLObject link_map = NIL;
        if (starting_id.numL(link_limit)) {
            SubLObject end_var;
            SubLObject link_suid;
            SubLObject link;
            SubLObject parent_problem;
            SubLObject child_problems;
            for (end_var = link_limit, link_suid = NIL, link_suid = starting_id; !link_suid.numGE(end_var); link_suid = f_1X(link_suid)) {
                link = inference_datastructures_problem_store.find_problem_link_by_id(store, link_suid);
                if (NIL != link) {
                    parent_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    child_problems = inference_datastructures_problem_link.problem_link_supporting_problems(link);
                    link_map = cons(listS(link_suid, NIL != parent_problem ? inference_datastructures_problem.problem_suid(parent_problem) : $ROOT, Mapping.mapcar(symbol_function(PROBLEM_SUID), child_problems)), link_map);
                }
            }
        }
        return values(nreverse(link_map), link_limit);
    }

    public static final SubLObject declare_inference_utilities_file_alt() {
        declareFunction("allowed_rules_spec_p", "ALLOWED-RULES-SPEC-P", 1, 0, false);
        declareFunction("forbidden_rules_spec_p", "FORBIDDEN-RULES-SPEC-P", 1, 0, false);
        declareFunction("openness_p", "OPENNESS-P", 1, 0, false);
        declareFunction("answerability_p", "ANSWERABILITY-P", 1, 0, false);
        declareFunction("inference_input_property_lookup", "INFERENCE-INPUT-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("inference_property_lookup", "INFERENCE-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("problem_store_property_lookup", "PROBLEM-STORE-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("single_literal_backchain_required_problemP", "SINGLE-LITERAL-BACKCHAIN-REQUIRED-PROBLEM?", 1, 0, false);
        declareFunction("find_previous_inference_problem_by_el_asent", "FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT", 1, 1, false);
        declareFunction("inference_requires_argumentationP", "INFERENCE-REQUIRES-ARGUMENTATION?", 1, 0, false);
        declareFunction("inference_true_and_false_answers", "INFERENCE-TRUE-AND-FALSE-ANSWERS", 1, 0, false);
        declareFunction("inference_argumentation_result", "INFERENCE-ARGUMENTATION-RESULT", 1, 0, false);
        declareFunction("inference_perform_argumentation", "INFERENCE-PERFORM-ARGUMENTATION", 1, 0, false);
        declareFunction("inference_some_proof_uses_removal_moduleP", "INFERENCE-SOME-PROOF-USES-REMOVAL-MODULE?", 2, 0, false);
        declareFunction("inference_some_proof_uses_transformation_moduleP", "INFERENCE-SOME-PROOF-USES-TRANSFORMATION-MODULE?", 2, 0, false);
        declareFunction("inference_removal_modules_used_in_proofs", "INFERENCE-REMOVAL-MODULES-USED-IN-PROOFS", 1, 0, false);
        declareFunction("categorize_inference_answers_via_rules", "CATEGORIZE-INFERENCE-ANSWERS-VIA-RULES", 1, 0, false);
        declareFunction("unsatisfied_cnfs_for_rule", "UNSATISFIED-CNFS-FOR-RULE", 2, 3, false);
        declareFunction("unsatisfied_cnfs_time_cutoff", "UNSATISFIED-CNFS-TIME-CUTOFF", 0, 0, false);
        declareFunction("unsatisfied_cnf_subbed_rule_formula_from_bindings", "UNSATISFIED-CNF-SUBBED-RULE-FORMULA-FROM-BINDINGS", 3, 0, false);
        declareFunction("unsatisfied_cnf_rejectP", "UNSATISFIED-CNF-REJECT?", 3, 0, false);
        declareFunction("unsatisfied_cnf_reject_knownP", "UNSATISFIED-CNF-REJECT-KNOWN?", 3, 0, false);
        declareFunction("unsatisfied_cnfs_ok_inference_result_p", "UNSATISFIED-CNFS-OK-INFERENCE-RESULT-P", 2, 0, false);
        declareFunction("filter_unsatisfied_cnfs", "FILTER-UNSATISFIED-CNFS", 2, 0, false);
        declareFunction("unsatisfied_td_subproblem_paths", "UNSATISFIED-TD-SUBPROBLEM-PATHS", 2, 0, false);
        declareFunction("satisfied_problemP_internal", "SATISFIED-PROBLEM?-INTERNAL", 2, 0, false);
        declareFunction("satisfied_problemP", "SATISFIED-PROBLEM?", 2, 0, false);
        declareFunction("partially_satisfied_split_link_p", "PARTIALLY-SATISFIED-SPLIT-LINK-P", 2, 0, false);
        declareFunction("reconstruct_partially_satisfied_el_cnfs_from_td_subpaths", "RECONSTRUCT-PARTIALLY-SATISFIED-EL-CNFS-FROM-TD-SUBPATHS", 4, 0, false);
        declareFunction("inference_thinking_task_abort", "INFERENCE-THINKING-TASK-ABORT", 2, 0, false);
        declareFunction("new_continuable_inference_from_problem", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM", 1, 2, false);
        declareFunction("new_continuable_inference_from_problem_query", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM-QUERY", 1, 2, false);
        declareFunction("new_continuable_antecedent_inference", "NEW-CONTINUABLE-ANTECEDENT-INFERENCE", 5, 0, false);
        declareFunction("inference_output_answers_to_file", "INFERENCE-OUTPUT-ANSWERS-TO-FILE", 2, 4, false);
        declareFunction("inference_output_answers", "INFERENCE-OUTPUT-ANSWERS", 1, 4, false);
        declareFunction("inference_output_answers_tab_delimited", "INFERENCE-OUTPUT-ANSWERS-TAB-DELIMITED", 3, 0, false);
        declareFunction("inference_output_answers_xml", "INFERENCE-OUTPUT-ANSWERS-XML", 4, 0, false);
        declareFunction("answerability_status_p", "ANSWERABILITY-STATUS-P", 1, 0, false);
        declareFunction("query_answerability_status", "QUERY-ANSWERABILITY-STATUS", 1, 2, false);
        declareFunction("query_answerability_status_int", "QUERY-ANSWERABILITY-STATUS-INT", 3, 0, false);
        declareFunction("query_literal_answerability_status", "QUERY-LITERAL-ANSWERABILITY-STATUS", 1, 2, false);
        declareFunction("query_literal_independent_answerability_status", "QUERY-LITERAL-INDEPENDENT-ANSWERABILITY-STATUS", 3, 0, false);
        declareFunction("refine_query_literal_answerability_status", "REFINE-QUERY-LITERAL-ANSWERABILITY-STATUS", 3, 0, false);
        declareFunction("other_independently_answerable_lits", "OTHER-INDEPENDENTLY-ANSWERABLE-LITS", 4, 0, false);
        declareFunction("query_term_substitution_answerability_status", "QUERY-TERM-SUBSTITUTION-ANSWERABILITY-STATUS", 3, 2, false);
        declareFunction("query_term_arg_position_answerability_status", "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS", 3, 2, false);
        declareFunction("query_literal_answerability_status_asynch", "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH", 3, 0, false);
        declareFunction("query_literal_set_answerability_status_via_callback", "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK", 2, 3, false);
        declareFunction("handle_answerability_result_tuple", "HANDLE-ANSWERABILITY-RESULT-TUPLE", 2, 0, false);
        declareFunction("callback_p", "CALLBACK-P", 1, 0, false);
        declareFunction("make_callback", "MAKE-CALLBACK", 1, 1, false);
        declareFunction("invoke_callback", "INVOKE-CALLBACK", 1, 1, false);
        declareFunction("callback_method", "CALLBACK-METHOD", 1, 0, false);
        declareFunction("callback_data", "CALLBACK-DATA", 1, 0, false);
        declareFunction("inference_expanded_justification", "INFERENCE-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("inference_answer_expanded_justification", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("inference_answer_expanded_justification_guts", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION-GUTS", 1, 0, false);
        declareFunction("inference_answer_justification_expanded_supports_guts", "INFERENCE-ANSWER-JUSTIFICATION-EXPANDED-SUPPORTS-GUTS", 1, 0, false);
        declareFunction("cycl_term_for_problem_store", "CYCL-TERM-FOR-PROBLEM-STORE", 0, 1, false);
        declareFunction("cycl_term_for_inference", "CYCL-TERM-FOR-INFERENCE", 0, 1, false);
        declareFunction("cycl_term_for_machine", "CYCL-TERM-FOR-MACHINE", 0, 1, false);
        declareFunction("ensure_term_for_machine", "ENSURE-TERM-FOR-MACHINE", 1, 1, false);
        declareFunction("cycl_term_for_image", "CYCL-TERM-FOR-IMAGE", 0, 0, false);
        declareFunction("assert_problem_store_data", "ASSERT-PROBLEM-STORE-DATA", 0, 2, false);
        declareFunction("assert_inference_data", "ASSERT-INFERENCE-DATA", 0, 2, false);
        declareFunction("assert_inference_bindings", "ASSERT-INFERENCE-BINDINGS", 3, 0, false);
        declareFunction("latest_inference", "LATEST-INFERENCE", 0, 0, false);
        declareFunction("query_literal_removal_cost", "QUERY-LITERAL-REMOVAL-COST", 2, 2, false);
        declareFunction("query_literal_removal_cost_internal", "QUERY-LITERAL-REMOVAL-COST-INTERNAL", 4, 1, false);
        declareFunction("collection_has_rdf_type_cardinality_estimateP", "COLLECTION-HAS-RDF-TYPE-CARDINALITY-ESTIMATE?", 1, 0, false);
        declareFunction("literal_removal_cost", "LITERAL-REMOVAL-COST", 2, 2, false);
        declareFunction("some_literal_removal_options", "SOME-LITERAL-REMOVAL-OPTIONS", 2, 2, false);
        declareFunction("literal_removal_completeness", "LITERAL-REMOVAL-COMPLETENESS", 2, 1, false);
        declareFunction("some_literal_removal_options_int", "SOME-LITERAL-REMOVAL-OPTIONS-INT", 3, 1, false);
        declareFunction("tactic_specs_total_cost", "TACTIC-SPECS-TOTAL-COST", 1, 0, false);
        declareMacro("do_contextualized_clause_focal_literals", "DO-CONTEXTUALIZED-CLAUSE-FOCAL-LITERALS");
        declareFunction("join_ordered_committed_literal", "JOIN-ORDERED-COMMITTED-LITERAL", 1, 1, false);
        declareFunction("join_ordered_max_preference_level", "JOIN-ORDERED-MAX-PREFERENCE-LEVEL", 1, 1, false);
        declareFunction("tactician_chooses_to_throw_away_asent_mt_senseP", "TACTICIAN-CHOOSES-TO-THROW-AWAY-ASENT-MT-SENSE?", 3, 0, false);
        declareFunction("common_hl_variables", "COMMON-HL-VARIABLES", 2, 0, false);
        declareFunction("memoized_literal_removal_options_internal", "MEMOIZED-LITERAL-REMOVAL-OPTIONS-INTERNAL", 2, 1, false);
        declareFunction("memoized_literal_removal_options", "MEMOIZED-LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        declareFunction("literal_removal_preference_level", "LITERAL-REMOVAL-PREFERENCE-LEVEL", 3, 2, false);
        declareFunction("literal_removal_productivity", "LITERAL-REMOVAL-PRODUCTIVITY", 2, 2, false);
        declareFunction("magic_wand_tactic_specP", "MAGIC-WAND-TACTIC-SPEC?", 3, 0, false);
        declareFunction("tactician_deems_join_ordered_analysis_betterP", "TACTICIAN-DEEMS-JOIN-ORDERED-ANALYSIS-BETTER?", 6, 0, false);
        declareFunction("current_query_properties", "CURRENT-QUERY-PROPERTIES", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sparql_port", "SPARQL-PORT", 0, 0, false);
            declareFunction("start_external_sparql_process", "START-EXTERNAL-SPARQL-PROCESS", 1, 0, false);
            declareFunction("allowed_rules_spec_p", "ALLOWED-RULES-SPEC-P", 1, 0, false);
            declareFunction("forbidden_rules_spec_p", "FORBIDDEN-RULES-SPEC-P", 1, 0, false);
            declareFunction("openness_p", "OPENNESS-P", 1, 0, false);
            declareFunction("answerability_p", "ANSWERABILITY-P", 1, 0, false);
            declareFunction("inference_input_property_lookup", "INFERENCE-INPUT-PROPERTY-LOOKUP", 2, 1, false);
            declareFunction("inference_property_lookup", "INFERENCE-PROPERTY-LOOKUP", 2, 1, false);
            declareFunction("problem_store_property_lookup", "PROBLEM-STORE-PROPERTY-LOOKUP", 2, 1, false);
            declareFunction("single_literal_backchain_required_problemP", "SINGLE-LITERAL-BACKCHAIN-REQUIRED-PROBLEM?", 1, 0, false);
            declareFunction("find_previous_inference_problem_by_el_asent", "FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT", 1, 1, false);
            declareFunction("inference_requires_argumentationP", "INFERENCE-REQUIRES-ARGUMENTATION?", 1, 0, false);
            declareFunction("inference_true_and_false_answers", "INFERENCE-TRUE-AND-FALSE-ANSWERS", 1, 0, false);
            declareFunction("inference_argumentation_result", "INFERENCE-ARGUMENTATION-RESULT", 1, 0, false);
            declareFunction("inference_perform_argumentation", "INFERENCE-PERFORM-ARGUMENTATION", 1, 0, false);
            declareFunction("inference_some_proof_uses_removal_moduleP", "INFERENCE-SOME-PROOF-USES-REMOVAL-MODULE?", 2, 0, false);
            declareFunction("inference_some_proof_uses_transformation_moduleP", "INFERENCE-SOME-PROOF-USES-TRANSFORMATION-MODULE?", 2, 0, false);
            declareFunction("inference_removal_modules_used_in_proofs", "INFERENCE-REMOVAL-MODULES-USED-IN-PROOFS", 1, 0, false);
            declareFunction("categorize_inference_answers_via_rules", "CATEGORIZE-INFERENCE-ANSWERS-VIA-RULES", 1, 0, false);
            declareFunction("unsatisfied_cnfs_for_rule", "UNSATISFIED-CNFS-FOR-RULE", 2, 3, false);
            declareFunction("unsatisfied_cnfs_time_cutoff", "UNSATISFIED-CNFS-TIME-CUTOFF", 0, 0, false);
            declareFunction("unsatisfied_cnf_subbed_rule_formula_from_bindings", "UNSATISFIED-CNF-SUBBED-RULE-FORMULA-FROM-BINDINGS", 3, 0, false);
            declareFunction("unsatisfied_cnf_rejectP", "UNSATISFIED-CNF-REJECT?", 3, 0, false);
            declareFunction("unsatisfied_cnf_reject_knownP", "UNSATISFIED-CNF-REJECT-KNOWN?", 3, 0, false);
            declareFunction("unsatisfied_cnfs_ok_inference_result_p", "UNSATISFIED-CNFS-OK-INFERENCE-RESULT-P", 2, 0, false);
            declareFunction("filter_unsatisfied_cnfs", "FILTER-UNSATISFIED-CNFS", 2, 0, false);
            declareFunction("unsatisfied_td_subproblem_paths", "UNSATISFIED-TD-SUBPROBLEM-PATHS", 2, 0, false);
            declareFunction("satisfied_problemP_internal", "SATISFIED-PROBLEM?-INTERNAL", 2, 0, false);
            declareFunction("satisfied_problemP", "SATISFIED-PROBLEM?", 2, 0, false);
            declareFunction("partially_satisfied_split_link_p", "PARTIALLY-SATISFIED-SPLIT-LINK-P", 2, 0, false);
            declareFunction("reconstruct_partially_satisfied_el_cnfs_from_td_subpaths", "RECONSTRUCT-PARTIALLY-SATISFIED-EL-CNFS-FROM-TD-SUBPATHS", 4, 0, false);
            declareFunction("inference_thinking_task_abort", "INFERENCE-THINKING-TASK-ABORT", 2, 0, false);
            declareFunction("new_continuable_inference_from_problem", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM", 1, 2, false);
            declareFunction("new_continuable_inference_from_problem_query", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM-QUERY", 1, 2, false);
            declareFunction("new_continuable_antecedent_inference", "NEW-CONTINUABLE-ANTECEDENT-INFERENCE", 5, 0, false);
            declareFunction("inference_output_answers_to_file", "INFERENCE-OUTPUT-ANSWERS-TO-FILE", 2, 4, false);
            declareFunction("inference_output_answers", "INFERENCE-OUTPUT-ANSWERS", 1, 4, false);
            declareFunction("inference_output_answers_tab_delimited", "INFERENCE-OUTPUT-ANSWERS-TAB-DELIMITED", 3, 0, false);
            declareFunction("inference_output_answers_xml", "INFERENCE-OUTPUT-ANSWERS-XML", 4, 0, false);
            declareFunction("answerability_status_p", "ANSWERABILITY-STATUS-P", 1, 0, false);
            declareFunction("query_answerability_status", "QUERY-ANSWERABILITY-STATUS", 1, 2, false);
            declareFunction("query_answerability_status_int", "QUERY-ANSWERABILITY-STATUS-INT", 3, 0, false);
            declareFunction("query_literal_answerability_status", "QUERY-LITERAL-ANSWERABILITY-STATUS", 1, 2, false);
            declareFunction("query_literal_independent_answerability_status", "QUERY-LITERAL-INDEPENDENT-ANSWERABILITY-STATUS", 3, 0, false);
            declareFunction("refine_query_literal_answerability_status", "REFINE-QUERY-LITERAL-ANSWERABILITY-STATUS", 3, 0, false);
            declareFunction("other_independently_answerable_lits", "OTHER-INDEPENDENTLY-ANSWERABLE-LITS", 4, 0, false);
            declareFunction("query_term_substitution_answerability_status", "QUERY-TERM-SUBSTITUTION-ANSWERABILITY-STATUS", 3, 2, false);
            declareFunction("query_term_arg_position_answerability_status", "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS", 3, 2, false);
            declareFunction("query_literal_answerability_status_asynch", "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH", 3, 0, false);
            declareFunction("query_literal_set_answerability_status_via_callback", "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK", 2, 3, false);
            declareFunction("handle_answerability_result_tuple", "HANDLE-ANSWERABILITY-RESULT-TUPLE", 2, 0, false);
            declareFunction("callback_p", "CALLBACK-P", 1, 0, false);
            declareFunction("make_callback", "MAKE-CALLBACK", 1, 1, false);
            declareFunction("invoke_callback", "INVOKE-CALLBACK", 1, 1, false);
            declareFunction("callback_method", "CALLBACK-METHOD", 1, 0, false);
            declareFunction("callback_data", "CALLBACK-DATA", 1, 0, false);
            declareFunction("inference_answer_argument_strength", "INFERENCE-ANSWER-ARGUMENT-STRENGTH", 1, 0, false);
            declareFunction("hl_justification_strength", "HL-JUSTIFICATION-STRENGTH", 1, 0, false);
            declareFunction("inference_expanded_justification", "INFERENCE-EXPANDED-JUSTIFICATION", 1, 0, false);
            declareFunction("inference_answer_expanded_justification", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION", 1, 0, false);
            declareFunction("inference_answer_completely_expanded_justification", "INFERENCE-ANSWER-COMPLETELY-EXPANDED-JUSTIFICATION", 1, 0, false);
            declareFunction("inference_answer_expanded_justification_guts", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION-GUTS", 1, 0, false);
            declareFunction("inference_answer_justification_expanded_supports_guts", "INFERENCE-ANSWER-JUSTIFICATION-EXPANDED-SUPPORTS-GUTS", 1, 0, false);
            declareFunction("cycl_term_for_problem_store", "CYCL-TERM-FOR-PROBLEM-STORE", 0, 1, false);
            declareFunction("cycl_term_for_inference", "CYCL-TERM-FOR-INFERENCE", 0, 1, false);
            declareFunction("cycl_term_for_machine", "CYCL-TERM-FOR-MACHINE", 0, 1, false);
            declareFunction("ensure_term_for_machine", "ENSURE-TERM-FOR-MACHINE", 1, 1, false);
            declareFunction("cycl_term_for_image", "CYCL-TERM-FOR-IMAGE", 0, 0, false);
            declareFunction("assert_problem_store_data", "ASSERT-PROBLEM-STORE-DATA", 0, 3, false);
            declareFunction("assert_inference_data", "ASSERT-INFERENCE-DATA", 0, 3, false);
            declareFunction("assert_inference_bindings", "ASSERT-INFERENCE-BINDINGS", 3, 0, false);
            declareFunction("latest_inference", "LATEST-INFERENCE", 0, 0, false);
            declareFunction("query_literal_removal_cost", "QUERY-LITERAL-REMOVAL-COST", 2, 2, false);
            declareFunction("query_literal_removal_cost_internal", "QUERY-LITERAL-REMOVAL-COST-INTERNAL", 4, 1, false);
            declareFunction("collection_has_rdf_type_cardinality_estimateP", "COLLECTION-HAS-RDF-TYPE-CARDINALITY-ESTIMATE?", 1, 0, false);
            declareFunction("literal_removal_cost", "LITERAL-REMOVAL-COST", 2, 2, false);
            declareFunction("some_literal_removal_options", "SOME-LITERAL-REMOVAL-OPTIONS", 2, 2, false);
            declareFunction("literal_removal_completeness", "LITERAL-REMOVAL-COMPLETENESS", 2, 1, false);
            declareFunction("some_literal_removal_options_int", "SOME-LITERAL-REMOVAL-OPTIONS-INT", 3, 1, false);
            declareFunction("tactic_specs_total_cost", "TACTIC-SPECS-TOTAL-COST", 1, 0, false);
            declareMacro("do_contextualized_clause_focal_literals", "DO-CONTEXTUALIZED-CLAUSE-FOCAL-LITERALS");
            declareFunction("join_ordered_committed_literal", "JOIN-ORDERED-COMMITTED-LITERAL", 1, 1, false);
            declareFunction("join_ordered_max_preference_level", "JOIN-ORDERED-MAX-PREFERENCE-LEVEL", 1, 1, false);
            declareFunction("tactician_chooses_to_throw_away_asent_mt_senseP", "TACTICIAN-CHOOSES-TO-THROW-AWAY-ASENT-MT-SENSE?", 3, 0, false);
            declareFunction("common_hl_variables", "COMMON-HL-VARIABLES", 2, 0, false);
            declareFunction("memoized_literal_removal_options_internal", "MEMOIZED-LITERAL-REMOVAL-OPTIONS-INTERNAL", 2, 1, false);
            declareFunction("memoized_literal_removal_options", "MEMOIZED-LITERAL-REMOVAL-OPTIONS", 2, 1, false);
            declareFunction("literal_removal_preference_level", "LITERAL-REMOVAL-PREFERENCE-LEVEL", 3, 2, false);
            declareFunction("literal_removal_productivity", "LITERAL-REMOVAL-PRODUCTIVITY", 2, 2, false);
            declareFunction("magic_wand_tactic_specP", "MAGIC-WAND-TACTIC-SPEC?", 3, 0, false);
            declareFunction("tactician_deems_join_ordered_analysis_betterP", "TACTICIAN-DEEMS-JOIN-ORDERED-ANALYSIS-BETTER?", 6, 0, false);
            declareFunction("current_query_properties", "CURRENT-QUERY-PROPERTIES", 0, 0, false);
            declareFunction("inference_literal_to_supports_map", "INFERENCE-LITERAL-TO-SUPPORTS-MAP", 2, 3, false);
            declareFunction("problem_store_forts", "PROBLEM-STORE-FORTS", 1, 0, false);
            declareFunction("gather_required_vocab_handler", "GATHER-REQUIRED-VOCAB-HANDLER", 1, 0, false);
            declareFunction("gather_supports_required_vocab", "GATHER-SUPPORTS-REQUIRED-VOCAB", 1, 2, false);
            declareFunction("gather_inference_required_vocab", "GATHER-INFERENCE-REQUIRED-VOCAB", 1, 1, false);
            declareFunction("gather_vocab_required_for_kbq_query_set", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET", 1, 3, false);
            declareFunction("gather_vocab_required_for_kbq_query_set_int", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET-INT", 3, 0, false);
            declareFunction("gather_inference_successful_rules", "GATHER-INFERENCE-SUCCESSFUL-RULES", 1, 1, false);
            declareFunction("problem_store_link_id_map", "PROBLEM-STORE-LINK-ID-MAP", 1, 2, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("assert_problem_store_data", "ASSERT-PROBLEM-STORE-DATA", 0, 2, false);
            declareFunction("assert_inference_data", "ASSERT-INFERENCE-DATA", 0, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_utilities_file_Previous() {
        declareFunction("sparql_port", "SPARQL-PORT", 0, 0, false);
        declareFunction("start_external_sparql_process", "START-EXTERNAL-SPARQL-PROCESS", 1, 0, false);
        declareFunction("allowed_rules_spec_p", "ALLOWED-RULES-SPEC-P", 1, 0, false);
        declareFunction("forbidden_rules_spec_p", "FORBIDDEN-RULES-SPEC-P", 1, 0, false);
        declareFunction("openness_p", "OPENNESS-P", 1, 0, false);
        declareFunction("answerability_p", "ANSWERABILITY-P", 1, 0, false);
        declareFunction("inference_input_property_lookup", "INFERENCE-INPUT-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("inference_property_lookup", "INFERENCE-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("problem_store_property_lookup", "PROBLEM-STORE-PROPERTY-LOOKUP", 2, 1, false);
        declareFunction("single_literal_backchain_required_problemP", "SINGLE-LITERAL-BACKCHAIN-REQUIRED-PROBLEM?", 1, 0, false);
        declareFunction("find_previous_inference_problem_by_el_asent", "FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT", 1, 1, false);
        declareFunction("inference_requires_argumentationP", "INFERENCE-REQUIRES-ARGUMENTATION?", 1, 0, false);
        declareFunction("inference_true_and_false_answers", "INFERENCE-TRUE-AND-FALSE-ANSWERS", 1, 0, false);
        declareFunction("inference_argumentation_result", "INFERENCE-ARGUMENTATION-RESULT", 1, 0, false);
        declareFunction("inference_perform_argumentation", "INFERENCE-PERFORM-ARGUMENTATION", 1, 0, false);
        declareFunction("inference_some_proof_uses_removal_moduleP", "INFERENCE-SOME-PROOF-USES-REMOVAL-MODULE?", 2, 0, false);
        declareFunction("inference_some_proof_uses_transformation_moduleP", "INFERENCE-SOME-PROOF-USES-TRANSFORMATION-MODULE?", 2, 0, false);
        declareFunction("inference_removal_modules_used_in_proofs", "INFERENCE-REMOVAL-MODULES-USED-IN-PROOFS", 1, 0, false);
        declareFunction("categorize_inference_answers_via_rules", "CATEGORIZE-INFERENCE-ANSWERS-VIA-RULES", 1, 0, false);
        declareFunction("unsatisfied_cnfs_for_rule", "UNSATISFIED-CNFS-FOR-RULE", 2, 3, false);
        declareFunction("unsatisfied_cnfs_time_cutoff", "UNSATISFIED-CNFS-TIME-CUTOFF", 0, 0, false);
        declareFunction("unsatisfied_cnf_subbed_rule_formula_from_bindings", "UNSATISFIED-CNF-SUBBED-RULE-FORMULA-FROM-BINDINGS", 3, 0, false);
        declareFunction("unsatisfied_cnf_rejectP", "UNSATISFIED-CNF-REJECT?", 3, 0, false);
        declareFunction("unsatisfied_cnf_reject_knownP", "UNSATISFIED-CNF-REJECT-KNOWN?", 3, 0, false);
        declareFunction("unsatisfied_cnfs_ok_inference_result_p", "UNSATISFIED-CNFS-OK-INFERENCE-RESULT-P", 2, 0, false);
        declareFunction("filter_unsatisfied_cnfs", "FILTER-UNSATISFIED-CNFS", 2, 0, false);
        declareFunction("unsatisfied_td_subproblem_paths", "UNSATISFIED-TD-SUBPROBLEM-PATHS", 2, 0, false);
        declareFunction("satisfied_problemP_internal", "SATISFIED-PROBLEM?-INTERNAL", 2, 0, false);
        declareFunction("satisfied_problemP", "SATISFIED-PROBLEM?", 2, 0, false);
        declareFunction("partially_satisfied_split_link_p", "PARTIALLY-SATISFIED-SPLIT-LINK-P", 2, 0, false);
        declareFunction("reconstruct_partially_satisfied_el_cnfs_from_td_subpaths", "RECONSTRUCT-PARTIALLY-SATISFIED-EL-CNFS-FROM-TD-SUBPATHS", 4, 0, false);
        declareFunction("inference_thinking_task_abort", "INFERENCE-THINKING-TASK-ABORT", 2, 0, false);
        declareFunction("new_continuable_inference_from_problem", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM", 1, 2, false);
        declareFunction("new_continuable_inference_from_problem_query", "NEW-CONTINUABLE-INFERENCE-FROM-PROBLEM-QUERY", 1, 2, false);
        declareFunction("new_continuable_antecedent_inference", "NEW-CONTINUABLE-ANTECEDENT-INFERENCE", 5, 0, false);
        declareFunction("inference_output_answers_to_file", "INFERENCE-OUTPUT-ANSWERS-TO-FILE", 2, 4, false);
        declareFunction("inference_output_answers", "INFERENCE-OUTPUT-ANSWERS", 1, 4, false);
        declareFunction("inference_output_answers_tab_delimited", "INFERENCE-OUTPUT-ANSWERS-TAB-DELIMITED", 3, 0, false);
        declareFunction("inference_output_answers_xml", "INFERENCE-OUTPUT-ANSWERS-XML", 4, 0, false);
        declareFunction("answerability_status_p", "ANSWERABILITY-STATUS-P", 1, 0, false);
        declareFunction("query_answerability_status", "QUERY-ANSWERABILITY-STATUS", 1, 2, false);
        declareFunction("query_answerability_status_int", "QUERY-ANSWERABILITY-STATUS-INT", 3, 0, false);
        declareFunction("query_literal_answerability_status", "QUERY-LITERAL-ANSWERABILITY-STATUS", 1, 2, false);
        declareFunction("query_literal_independent_answerability_status", "QUERY-LITERAL-INDEPENDENT-ANSWERABILITY-STATUS", 3, 0, false);
        declareFunction("refine_query_literal_answerability_status", "REFINE-QUERY-LITERAL-ANSWERABILITY-STATUS", 3, 0, false);
        declareFunction("other_independently_answerable_lits", "OTHER-INDEPENDENTLY-ANSWERABLE-LITS", 4, 0, false);
        declareFunction("query_term_substitution_answerability_status", "QUERY-TERM-SUBSTITUTION-ANSWERABILITY-STATUS", 3, 2, false);
        declareFunction("query_term_arg_position_answerability_status", "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS", 3, 2, false);
        declareFunction("query_literal_answerability_status_asynch", "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH", 3, 0, false);
        declareFunction("query_literal_set_answerability_status_via_callback", "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK", 2, 3, false);
        declareFunction("handle_answerability_result_tuple", "HANDLE-ANSWERABILITY-RESULT-TUPLE", 2, 0, false);
        declareFunction("callback_p", "CALLBACK-P", 1, 0, false);
        declareFunction("make_callback", "MAKE-CALLBACK", 1, 1, false);
        declareFunction("invoke_callback", "INVOKE-CALLBACK", 1, 1, false);
        declareFunction("callback_method", "CALLBACK-METHOD", 1, 0, false);
        declareFunction("callback_data", "CALLBACK-DATA", 1, 0, false);
        declareFunction("inference_answer_argument_strength", "INFERENCE-ANSWER-ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction("hl_justification_strength", "HL-JUSTIFICATION-STRENGTH", 1, 0, false);
        declareFunction("inference_expanded_justification", "INFERENCE-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("inference_answer_expanded_justification", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("inference_answer_completely_expanded_justification", "INFERENCE-ANSWER-COMPLETELY-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("inference_answer_expanded_justification_guts", "INFERENCE-ANSWER-EXPANDED-JUSTIFICATION-GUTS", 1, 0, false);
        declareFunction("inference_answer_justification_expanded_supports_guts", "INFERENCE-ANSWER-JUSTIFICATION-EXPANDED-SUPPORTS-GUTS", 1, 0, false);
        declareFunction("cycl_term_for_problem_store", "CYCL-TERM-FOR-PROBLEM-STORE", 0, 1, false);
        declareFunction("cycl_term_for_inference", "CYCL-TERM-FOR-INFERENCE", 0, 1, false);
        declareFunction("cycl_term_for_machine", "CYCL-TERM-FOR-MACHINE", 0, 1, false);
        declareFunction("ensure_term_for_machine", "ENSURE-TERM-FOR-MACHINE", 1, 1, false);
        declareFunction("cycl_term_for_image", "CYCL-TERM-FOR-IMAGE", 0, 0, false);
        declareFunction("assert_problem_store_data", "ASSERT-PROBLEM-STORE-DATA", 0, 3, false);
        declareFunction("assert_inference_data", "ASSERT-INFERENCE-DATA", 0, 3, false);
        declareFunction("assert_inference_bindings", "ASSERT-INFERENCE-BINDINGS", 3, 0, false);
        declareFunction("latest_inference", "LATEST-INFERENCE", 0, 0, false);
        declareFunction("query_literal_removal_cost", "QUERY-LITERAL-REMOVAL-COST", 2, 2, false);
        declareFunction("query_literal_removal_cost_internal", "QUERY-LITERAL-REMOVAL-COST-INTERNAL", 4, 1, false);
        declareFunction("collection_has_rdf_type_cardinality_estimateP", "COLLECTION-HAS-RDF-TYPE-CARDINALITY-ESTIMATE?", 1, 0, false);
        declareFunction("literal_removal_cost", "LITERAL-REMOVAL-COST", 2, 2, false);
        declareFunction("some_literal_removal_options", "SOME-LITERAL-REMOVAL-OPTIONS", 2, 2, false);
        declareFunction("literal_removal_completeness", "LITERAL-REMOVAL-COMPLETENESS", 2, 1, false);
        declareFunction("some_literal_removal_options_int", "SOME-LITERAL-REMOVAL-OPTIONS-INT", 3, 1, false);
        declareFunction("tactic_specs_total_cost", "TACTIC-SPECS-TOTAL-COST", 1, 0, false);
        declareMacro("do_contextualized_clause_focal_literals", "DO-CONTEXTUALIZED-CLAUSE-FOCAL-LITERALS");
        declareFunction("join_ordered_committed_literal", "JOIN-ORDERED-COMMITTED-LITERAL", 1, 1, false);
        declareFunction("join_ordered_max_preference_level", "JOIN-ORDERED-MAX-PREFERENCE-LEVEL", 1, 1, false);
        declareFunction("tactician_chooses_to_throw_away_asent_mt_senseP", "TACTICIAN-CHOOSES-TO-THROW-AWAY-ASENT-MT-SENSE?", 3, 0, false);
        declareFunction("common_hl_variables", "COMMON-HL-VARIABLES", 2, 0, false);
        declareFunction("memoized_literal_removal_options_internal", "MEMOIZED-LITERAL-REMOVAL-OPTIONS-INTERNAL", 2, 1, false);
        declareFunction("memoized_literal_removal_options", "MEMOIZED-LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        declareFunction("literal_removal_preference_level", "LITERAL-REMOVAL-PREFERENCE-LEVEL", 3, 2, false);
        declareFunction("literal_removal_productivity", "LITERAL-REMOVAL-PRODUCTIVITY", 2, 2, false);
        declareFunction("magic_wand_tactic_specP", "MAGIC-WAND-TACTIC-SPEC?", 3, 0, false);
        declareFunction("tactician_deems_join_ordered_analysis_betterP", "TACTICIAN-DEEMS-JOIN-ORDERED-ANALYSIS-BETTER?", 6, 0, false);
        declareFunction("current_query_properties", "CURRENT-QUERY-PROPERTIES", 0, 0, false);
        declareFunction("inference_literal_to_supports_map", "INFERENCE-LITERAL-TO-SUPPORTS-MAP", 2, 3, false);
        declareFunction("problem_store_forts", "PROBLEM-STORE-FORTS", 1, 0, false);
        declareFunction("gather_required_vocab_handler", "GATHER-REQUIRED-VOCAB-HANDLER", 1, 0, false);
        declareFunction("gather_supports_required_vocab", "GATHER-SUPPORTS-REQUIRED-VOCAB", 1, 2, false);
        declareFunction("gather_inference_required_vocab", "GATHER-INFERENCE-REQUIRED-VOCAB", 1, 1, false);
        declareFunction("gather_vocab_required_for_kbq_query_set", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET", 1, 3, false);
        declareFunction("gather_vocab_required_for_kbq_query_set_int", "GATHER-VOCAB-REQUIRED-FOR-KBQ-QUERY-SET-INT", 3, 0, false);
        declareFunction("gather_inference_successful_rules", "GATHER-INFERENCE-SUCCESSFUL-RULES", 1, 1, false);
        declareFunction("problem_store_link_id_map", "PROBLEM-STORE-LINK-ID-MAP", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_inference_utilities_file_alt() {
        defparameter("*UNSATISFIED-CNFS-TIME-CUTOFF*", TEN_INTEGER);
        deflexical("*ANSWERABILITY-STATUSES*", $list_alt87);
        return NIL;
    }

    public static SubLObject init_inference_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*UNSATISFIED-CNFS-TIME-CUTOFF*", TEN_INTEGER);
            deflexical("*ANSWERABILITY-STATUSES*", inference_utilities.$list102);
            defparameter("*COUNT-HL-SUPPORTS-IN-HYPOTHETICAL-CONTEXTS?*", NIL);
            defparameter("*COUNT-DEDUCED-ASSERTIONS-IN-HYPOTHETICAL-CONTEXTS?*", NIL);
            defparameter("*GATHER-REQUIRED-VOCAB-SET*", NIL);
            defparameter("*GATHER-REQUIRED-VOCAB-TRACE*", NIL);
            defparameter("*KBQ-QUERY-SET-INFERENCE-VOCAB-SET*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ANSWERABILITY-STATUSES*", $list_alt87);
        }
        return NIL;
    }

    public static SubLObject init_inference_utilities_file_Previous() {
        defparameter("*UNSATISFIED-CNFS-TIME-CUTOFF*", TEN_INTEGER);
        deflexical("*ANSWERABILITY-STATUSES*", inference_utilities.$list102);
        defparameter("*COUNT-HL-SUPPORTS-IN-HYPOTHETICAL-CONTEXTS?*", NIL);
        defparameter("*COUNT-DEDUCED-ASSERTIONS-IN-HYPOTHETICAL-CONTEXTS?*", NIL);
        defparameter("*GATHER-REQUIRED-VOCAB-SET*", NIL);
        defparameter("*GATHER-REQUIRED-VOCAB-TRACE*", NIL);
        defparameter("*KBQ-QUERY-SET-INFERENCE-VOCAB-SET*", NIL);
        return NIL;
    }

    public static final SubLObject setup_inference_utilities_file_alt() {
        memoization_state.note_memoized_function($sym64$SATISFIED_PROBLEM_);
        register_external_symbol(QUERY_LITERAL_ANSWERABILITY_STATUS);
        register_external_symbol(QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS);
        register_external_symbol(QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH);
        register_external_symbol(QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK);
        register_external_symbol(QUERY_LITERAL_REMOVAL_COST);
        memoization_state.note_memoized_function(MEMOIZED_LITERAL_REMOVAL_OPTIONS);
        define_test_case_table_int(QUERY_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt192);
        define_test_case_table_int(QUERY_LITERAL_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt193);
        return NIL;
    }

    public static SubLObject setup_inference_utilities_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function(inference_utilities.START_EXTERNAL_SPARQL_PROCESS);
            tcp_server_utilities.register_tcp_server_type($SPARQL, inference_utilities.$list3, UNPROVIDED);
            note_memoized_function(inference_utilities.$sym80$SATISFIED_PROBLEM_);
            register_external_symbol(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS);
            register_external_symbol(inference_utilities.QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS);
            register_external_symbol(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH);
            register_external_symbol(inference_utilities.QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK);
            register_external_symbol(inference_utilities.INFERENCE_ANSWER_ARGUMENT_STRENGTH);
            register_external_symbol(inference_utilities.QUERY_LITERAL_REMOVAL_COST);
            note_memoized_function(inference_utilities.MEMOIZED_LITERAL_REMOVAL_OPTIONS);
            note_funcall_helper_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER);
            note_funcall_helper_function(inference_utilities.GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT);
            register_external_symbol(inference_utilities.PROBLEM_STORE_LINK_ID_MAP);
            define_test_case_table_int(inference_utilities.QUERY_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), inference_utilities.$list232);
            define_test_case_table_int(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), inference_utilities.$list233);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym64$SATISFIED_PROBLEM_);
            define_test_case_table_int(QUERY_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt192);
            define_test_case_table_int(QUERY_LITERAL_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt193);
        }
        return NIL;
    }

    public static SubLObject setup_inference_utilities_file_Previous() {
        note_funcall_helper_function(inference_utilities.START_EXTERNAL_SPARQL_PROCESS);
        tcp_server_utilities.register_tcp_server_type($SPARQL, inference_utilities.$list3, UNPROVIDED);
        note_memoized_function(inference_utilities.$sym80$SATISFIED_PROBLEM_);
        register_external_symbol(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS);
        register_external_symbol(inference_utilities.QUERY_TERM_ARG_POSITION_ANSWERABILITY_STATUS);
        register_external_symbol(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS_ASYNCH);
        register_external_symbol(inference_utilities.QUERY_LITERAL_SET_ANSWERABILITY_STATUS_VIA_CALLBACK);
        register_external_symbol(inference_utilities.INFERENCE_ANSWER_ARGUMENT_STRENGTH);
        register_external_symbol(inference_utilities.QUERY_LITERAL_REMOVAL_COST);
        note_memoized_function(inference_utilities.MEMOIZED_LITERAL_REMOVAL_OPTIONS);
        note_funcall_helper_function(inference_utilities.GATHER_REQUIRED_VOCAB_HANDLER);
        note_funcall_helper_function(inference_utilities.GATHER_VOCAB_REQUIRED_FOR_KBQ_QUERY_SET_INT);
        register_external_symbol(inference_utilities.PROBLEM_STORE_LINK_ID_MAP);
        define_test_case_table_int(inference_utilities.QUERY_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), inference_utilities.$list232);
        define_test_case_table_int(inference_utilities.QUERY_LITERAL_ANSWERABILITY_STATUS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), inference_utilities.$list233);
        return NIL;
    }

    private static SubLObject _constant_233_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), ONE_INTEGER), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), ONE_INTEGER), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), ONE_INTEGER), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), ONE_INTEGER), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("greaterThan"), ONE_INTEGER, makeSymbol("?X")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER))), list(list(list(reader_make_constant_shell("greaterThan"), ONE_INTEGER, makeSymbol("?X")), makeKeyword("UNANSWERABLE")), list(list(reader_make_constant_shell("greaterThan"), makeSymbol("?X"), FIVE_INTEGER), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("genls"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), reader_make_constant_shell("ThirdOrderCollection")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("different"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("different"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("different"), makeSymbol("?X"), makeInteger(212)))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("different"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Y"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), makeInteger(212)), list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?Z"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("equals"), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?TIME"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?TIME"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?LATER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?LATER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("laterThan"), makeSymbol("?TIME"), makeSymbol("?LATER")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?DATE"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?DATE"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?EVENT"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?EVENT"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?WHENEVER"), reader_make_constant_shell("Now")), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("dateOfEvent"), makeSymbol("?EVENT"), makeSymbol("?DATE")), makeKeyword("UNANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person")), makeKeyword("ANSWERABLE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")))), list(list(list(reader_make_constant_shell("equalSymbols"), makeSymbol("?X"), makeInteger(212)), makeKeyword("ANSWERABLE")), list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), makeKeyword("ANSWERABLE")))) });
    }

    @Override
    public void declareFunctions() {
        inference_utilities.declare_inference_utilities_file();
    }

    @Override
    public void initializeVariables() {
        inference_utilities.init_inference_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_utilities.setup_inference_utilities_file();
    }

    
}

/**
 * Total time: 1938 ms synthetic
 */
