/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.assertions_high.assertion_formula;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg0;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.collection_defns.el_expressionP;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find_if;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg0;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg3;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.deck.create_deck;
import static com.cyc.cycjava.cycl.deck.deck_pop;
import static com.cyc.cycjava.cycl.deck.deck_push;
import static com.cyc.cycjava.cycl.dictionary.clear_dictionary;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_keys;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_pushnew;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.expression_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.fi.$fi_error$;
import static com.cyc.cycjava.cycl.fi.$fi_warning$;
import static com.cyc.cycjava.cycl.fi.fi_assert_int;
import static com.cyc.cycjava.cycl.fi.fi_kill_int;
import static com.cyc.cycjava.cycl.fi.fi_rename_int;
import static com.cyc.cycjava.cycl.fi.fi_unassert_int;
import static com.cyc.cycjava.cycl.fort_types_interface.mt_in_any_mtP;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.function_terms.naut_to_nart;
import static com.cyc.cycjava.cycl.genls.genlP;
import static com.cyc.cycjava.cycl.genls.genl_in_any_mtP;
import static com.cyc.cycjava.cycl.genls.genlsP;
import static com.cyc.cycjava.cycl.hash_table_utilities.pushnew_hash;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_href$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_target$;
import static com.cyc.cycjava.cycl.html_macros.$html_safe_print$;
import static com.cyc.cycjava.cycl.html_macros.$html_stream$;
import static com.cyc.cycjava.cycl.html_macros.note_cgi_handler_function;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.isa_in_any_mtP;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.kb_mapping.gather_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_gaf_arg_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_gaf_arg_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.fpred_value;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_values;
import static com.cyc.cycjava.cycl.lexicon_accessors.genl_posP;
import static com.cyc.cycjava.cycl.lexicon_accessors.npP;
import static com.cyc.cycjava.cycl.lexicon_accessors.vbarP;
import static com.cyc.cycjava.cycl.list_utilities.extremal;
import static com.cyc.cycjava.cycl.list_utilities.fast_sets_equalP;
import static com.cyc.cycjava.cycl.list_utilities.find_if_not;
import static com.cyc.cycjava.cycl.list_utilities.lengthG;
import static com.cyc.cycjava.cycl.list_utilities.proper_list_p;
import static com.cyc.cycjava.cycl.list_utilities.randomize_list;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.list_utilities.tree_find;
import static com.cyc.cycjava.cycl.list_utilities.tree_find_if;
import static com.cyc.cycjava.cycl.list_utilities.tree_gather;
import static com.cyc.cycjava.cycl.list_utilities.tree_substitute;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_get_zero_arg_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_set_zero_arg_results;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_4;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_6;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.narts_high.nart_expand;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.numeral_parser.string_to_interval;
import static com.cyc.cycjava.cycl.obsolete.cnat_p;
import static com.cyc.cycjava.cycl.parsing_utilities.create_parse_tree_with_root_node;
import static com.cyc.cycjava.cycl.parsing_utilities.hypothesize_parse_tree_element;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_category;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_formulaP;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_highest_category;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_span;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_span_length;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_words;
import static com.cyc.cycjava.cycl.parsing_utilities.syntactic_node_add_dtr;
import static com.cyc.cycjava.cycl.parsing_utilities.syntactic_node_add_head_dtr;
import static com.cyc.cycjava.cycl.parsing_utilities.syntactic_node_proposed_meanings;
import static com.cyc.cycjava.cycl.parsing_utilities.vp_parse_from_pspP;
import static com.cyc.cycjava.cycl.parsing_vars.$npp_use_nl_tagsP$;
import static com.cyc.cycjava.cycl.parsing_vars.$parse_root_node$;
import static com.cyc.cycjava.cycl.parsing_vars.$parse_tokenization$;
import static com.cyc.cycjava.cycl.parsing_vars.$parse_tokenization_offset$;
import static com.cyc.cycjava.cycl.parsing_vars.$parse_tree_mt$;
import static com.cyc.cycjava.cycl.parsing_vars.$perform_np_parser_expansion$;
import static com.cyc.cycjava.cycl.parsing_vars.$perform_vp_parser_expansion$;
import static com.cyc.cycjava.cycl.parsing_vars.$psp_chart$;
import static com.cyc.cycjava.cycl.parsing_vars.$psp_extra_charts$;
import static com.cyc.cycjava.cycl.parsing_vars.$psp_return_mode$;
import static com.cyc.cycjava.cycl.parsing_vars.$reify_parse_nodesP$;
import static com.cyc.cycjava.cycl.psp_chart.destroy_psp_chart;
import static com.cyc.cycjava.cycl.psp_chart.psp_chart_memoization_state;
import static com.cyc.cycjava.cycl.psp_chart.psp_edge_count;
import static com.cyc.cycjava.cycl.psp_lexicon.get_default_psp_lexicon;
import static com.cyc.cycjava.cycl.psp_main.ps_get_cycls_for_phrase;
import static com.cyc.cycjava.cycl.psp_main.ps_parse_predicative_adjp;
import static com.cyc.cycjava.cycl.psp_main.ps_parse_vbar;
import static com.cyc.cycjava.cycl.psp_main.psp_find_string_in_chart;
import static com.cyc.cycjava.cycl.psp_syntax.psp_chart_for_string;
import static com.cyc.cycjava.cycl.queues.create_p_queue;
import static com.cyc.cycjava.cycl.queues.create_queue;
import static com.cyc.cycjava.cycl.queues.dequeue;
import static com.cyc.cycjava.cycl.queues.enqueue;
import static com.cyc.cycjava.cycl.queues.p_dequeue;
import static com.cyc.cycjava.cycl.queues.p_enqueue;
import static com.cyc.cycjava.cycl.queues.p_queue_size;
import static com.cyc.cycjava.cycl.queues.queue_empty_p;
import static com.cyc.cycjava.cycl.queues.queue_find;
import static com.cyc.cycjava.cycl.rkf_concept_harvester.rkf_ch_gather_parsing_surrogates;
import static com.cyc.cycjava.cycl.rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list;
import static com.cyc.cycjava.cycl.rkf_concept_harvester.rkf_ch_simplify_assemble_phrases;
import static com.cyc.cycjava.cycl.rkf_concept_harvester.rkf_ch_string_tokenize;
import static com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_graph_link;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_instance_table_lookup;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_direction$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_generator$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_mt$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_node_object_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_randomize_lists_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_mt_links;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.do_sbhl_non_fort_linksP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.get_sbhl_accessible_modules;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_search_path_termination_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$sbhl_gather_space$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$sbhl_space$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.free_sbhl_marking_space;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.get_sbhl_marking_space;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.apply_sbhl_module_type_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_add_node_to_result_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_backward_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_transfers_through_module;
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
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.string_utilities.bunge;
import static com.cyc.cycjava.cycl.string_utilities.english_ordinal_number_string_p;
import static com.cyc.cycjava.cycl.string_utilities.english_ordinal_string_to_cardinal_string;
import static com.cyc.cycjava.cycl.string_utilities.fort_to_string;
import static com.cyc.cycjava.cycl.string_utilities.substring;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.transform_list_utilities.transform;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeral_parser;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.psp_chart;
import com.cyc.cycjava.cycl.psp_lexicon;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.psp_syntax;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ITERATIVE-TEMPLATE-PARSER
 * source file: /cyc/top/cycl/rtp/iterative-template-parser.lisp
 * created:     2019/07/03 17:38:39
 */
public final class iterative_template_parser extends SubLTranslatedFile implements V12 {
    public static final class $itp_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$sequence;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$complete_parses_only;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$work_set;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$solution_set;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$sentence;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$category;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$cache;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$psp_charts;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$working_mt;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$sequence = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$complete_parses_only = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$work_set = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$solution_set = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$sentence = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$category = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$cache = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$psp_charts = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.this.$working_mt = value;
        }

        public SubLObject $sequence = Lisp.NIL;

        public SubLObject $complete_parses_only = Lisp.NIL;

        public SubLObject $work_set = Lisp.NIL;

        public SubLObject $solution_set = Lisp.NIL;

        public SubLObject $sentence = Lisp.NIL;

        public SubLObject $category = Lisp.NIL;

        public SubLObject $cache = Lisp.NIL;

        public SubLObject $psp_charts = Lisp.NIL;

        public SubLObject $working_mt = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.class, ITP_STATE, ITP_STATE_P, $list_alt186, $list_alt187, new String[]{ "$sequence", "$complete_parses_only", "$work_set", "$solution_set", "$sentence", "$category", "$cache", "$psp_charts", "$working_mt" }, $list_alt188, $list_alt189, PRINT_ITP_STATE);
    }

    public static final SubLFile me = new iterative_template_parser();

 public static final String myName = "com.cyc.cycjava.cycl.rtp.iterative_template_parser";


    // defparameter
    // Definitions
    /**
     * If non-nil, only create nodes, with a basic (#$isa NODE WHATEVER), and return
     * lists of the things you would assert so they can be saved up for later
     */
    @LispMethod(comment = "If non-nil, only create nodes, with a basic (#$isa NODE WHATEVER), and return\r\nlists of the things you would assert so they can be saved up for later\ndefparameter\nIf non-nil, only create nodes, with a basic (#$isa NODE WHATEVER), and return\nlists of the things you would assert so they can be saved up for later")
    public static final SubLSymbol $kb_node_gathering_modeP$ = makeSymbol("*KB-NODE-GATHERING-MODE?*");

    // defparameter
    /**
     * If non-nil, new nodes will be #$CycSyntacticNodeFns, not simply
     * #$SyntacticNodes. @note this is just a stub at the moment
     */
    @LispMethod(comment = "If non-nil, new nodes will be #$CycSyntacticNodeFns, not simply\r\n#$SyntacticNodes. @note this is just a stub at the moment\ndefparameter\nIf non-nil, new nodes will be #$CycSyntacticNodeFns, not simply\n#$SyntacticNodes. @note this is just a stub at the moment")
    public static final SubLSymbol $kb_node_reify_as_functionsP$ = makeSymbol("*KB-NODE-REIFY-AS-FUNCTIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kb_node_internal_counter$ = makeSymbol("*KB-NODE-INTERNAL-COUNTER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $last_itp_state_created$ = makeSymbol("*LAST-ITP-STATE-CREATED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rtp_graphing_filter$ = makeSymbol("*RTP-GRAPHING-FILTER*");

    // defparameter
    // force hordes of rtp-related debugging info to be printed to the console?
    /**
     * force hordes of rtp-related debugging info to be printed to the console?
     */
    @LispMethod(comment = "force hordes of rtp-related debugging info to be printed to the console?\ndefparameter")
    public static final SubLSymbol $rtp_trace_aggressivelyP$ = makeSymbol("*RTP-TRACE-AGGRESSIVELY?*");

    // defparameter
    /**
     * If this is a microtheory, then build a tree of #$SyntacticNodes in this mt
     * while doing the parse
     */
    @LispMethod(comment = "If this is a microtheory, then build a tree of #$SyntacticNodes in this mt\r\nwhile doing the parse\ndefparameter\nIf this is a microtheory, then build a tree of #$SyntacticNodes in this mt\nwhile doing the parse")
    public static final SubLSymbol $rtp_kb_parse_mt$ = makeSymbol("*RTP-KB-PARSE-MT*");

    // defparameter
    /**
     * If t, create KB nodes at every step along the way, even for doomed
     * parses/spans. If nil, wait until the end on produce only useful stuff.
     */
    @LispMethod(comment = "If t, create KB nodes at every step along the way, even for doomed\r\nparses/spans. If nil, wait until the end on produce only useful stuff.\ndefparameter\nIf t, create KB nodes at every step along the way, even for doomed\nparses/spans. If nil, wait until the end on produce only useful stuff.")
    private static final SubLSymbol $rtp_exhaustive_kb_parseP$ = makeSymbol("*RTP-EXHAUSTIVE-KB-PARSE?*");

    // defparameter
    /**
     * If a parse is (heuristically) identified as doomed, assert
     * #$excludedOptionNodes if this is t, otherwise block it from the KB
     */
    @LispMethod(comment = "If a parse is (heuristically) identified as doomed, assert\r\n#$excludedOptionNodes if this is t, otherwise block it from the KB\ndefparameter\nIf a parse is (heuristically) identified as doomed, assert\n#$excludedOptionNodes if this is t, otherwise block it from the KB")
    public static final SubLSymbol $rtp_reify_doomed_parsesP$ = makeSymbol("*RTP-REIFY-DOOMED-PARSES?*");

    // defparameter
    /**
     * A global for storing the #$CycParseTree, if any, produced during the last
     * call to @see itp-sequel
     */
    @LispMethod(comment = "A global for storing the #$CycParseTree, if any, produced during the last\r\ncall to @see itp-sequel\ndefparameter\nA global for storing the #$CycParseTree, if any, produced during the last\ncall to @see itp-sequel")
    public static final SubLSymbol $rtp_latest_kb_parse_tree$ = makeSymbol("*RTP-LATEST-KB-PARSE-TREE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_node$ = makeSymbol("*DTP-ITP-NODE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_state$ = makeSymbol("*DTP-ITP-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $extend_itp_state_analyze_assertionP$ = makeSymbol("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $npparse_graph_type$ = makeSymbol("*NPPARSE-GRAPH-TYPE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trace_itp_state_expansion$ = makeSymbol("*TRACE-ITP-STATE-EXPANSION*");

    // defparameter
    // a list of strings that might be NPs, to be sent in externally
    /**
     * a list of strings that might be NPs, to be sent in externally
     */
    @LispMethod(comment = "a list of strings that might be NPs, to be sent in externally\ndefparameter")
    public static final SubLSymbol $possible_nps$ = makeSymbol("*POSSIBLE-NPS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $verb_phrasal_template_categoryP_caching_state$ = makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $verbal_template_categoryP_caching_state$ = makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $vbar_template_categoryP_caching_state$ = makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rtp_vbar_template_categoryP_caching_state$ = makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $predicative_adjp_template_categoryP_caching_state$ = makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $nominal_categoryP_caching_state$ = makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $adjectival_categoryP_caching_state$ = makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");

    // defparameter
    /**
     * Do not even attempt to compute beyond the first level parse. Makes it
     * equivalent to template-parse only.
     */
    @LispMethod(comment = "Do not even attempt to compute beyond the first level parse. Makes it\r\nequivalent to template-parse only.\ndefparameter\nDo not even attempt to compute beyond the first level parse. Makes it\nequivalent to template-parse only.")
    private static final SubLSymbol $compute_top_level_form_only$ = makeSymbol("*COMPUTE-TOP-LEVEL-FORM-ONLY*");

    // defparameter
    /**
     * When T, expand even those items that could be left as resolvable by other
     * harvesting methods, i.e. NPTemplate, NumberTemplates, etc.
     */
    @LispMethod(comment = "When T, expand even those items that could be left as resolvable by other\r\nharvesting methods, i.e. NPTemplate, NumberTemplates, etc.\ndefparameter\nWhen T, expand even those items that could be left as resolvable by other\nharvesting methods, i.e. NPTemplate, NumberTemplates, etc.")
    private static final SubLSymbol $compute_all_resolvable_expansions$ = makeSymbol("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $inform_about_pruned_templates$ = makeSymbol("*INFORM-ABOUT-PRUNED-TEMPLATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $set_of_attempted_subparses$ = makeSymbol("*SET-OF-ATTEMPTED-SUBPARSES*");

    // deflexical
    /**
     * The ternary NL quantification functions. Derived from the KB; presently just
     * '(#$NLQuantFn-3 #$NLDefinitenessFn-3)
     */
    @LispMethod(comment = "The ternary NL quantification functions. Derived from the KB; presently just\r\n\'(#$NLQuantFn-3 #$NLDefinitenessFn-3)\ndeflexical\nThe ternary NL quantification functions. Derived from the KB; presently just\n\'(#$NLQuantFn-3 #$NLDefinitenessFn-3)")
    private static final SubLSymbol $ternary_quant_fns$ = makeSymbol("*TERNARY-QUANT-FNS*");



    static private final SubLSymbol $sym1$_CAT = makeSymbol("?CAT");





    static private final SubLList $list4 = list(makeSymbol("?CAT"));





    static private final SubLSymbol $sym7$_TYPE = makeSymbol("?TYPE");





    static private final SubLList $list10 = list(makeSymbol("?TEMPLATE-TYPE"));

    static private final SubLList $list11 = list(list(reader_make_constant_shell("nlPhraseTypeForTemplateCategory"), makeSymbol("?TYPE"), makeSymbol("?TEMPLATE-TYPE")));



    static private final SubLSymbol $sym13$_NODE = makeSymbol("?NODE");





    static private final SubLString $str16$Node__A__D = makeString("Node-~A-~D");



    static private final SubLList $list19 = list(makeSymbol("NODE-TYPE"), makeSymbol("LINGUISTIC-CATEGORY"));

    private static final SubLObject $$SyntacticNode_MatrixClause = reader_make_constant_shell("SyntacticNode-MatrixClause");

    static private final SubLString $$$Root = makeString("Root");

    static private final SubLString $$$Unrecognized = makeString("Unrecognized");

    static private final SubLList $list23 = list(makeSymbol("FUNC"), makeSymbol("CAT"));

    static private final SubLString $str24$_A_A = makeString("~A~A");



    static private final SubLString $$$P = makeString("P");

    static private final SubLString $$$Bar = makeString("Bar");

    static private final SubLString $str28$____creating_a__A_node__of_type__ = makeString("*** creating a ~A node, of type ~A and cat ~A");





    static private final SubLString $$$Choice = makeString("Choice");





    static private final SubLString $str39$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str45$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str46$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list47 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");











    static private final SubLList $list56 = list(list(makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell("CycRecursiveTemplateParser"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list57 = list(makeKeyword("CATEGORY"), makeKeyword("OPTIONS"), makeKeyword("CHOICE"), makeKeyword("SOURCE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym64$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");

    private static final SubLList $list70 = list(reader_make_constant_shell("SyntacticChoiceNode"));

    private static final SubLSymbol NEW_SYNTACTIC_CHOICE_NODE = makeSymbol("NEW-SYNTACTIC-CHOICE-NODE");

    private static final SubLSymbol NEW_SYNTACTIC_FUNCTIONAL_NODE = makeSymbol("NEW-SYNTACTIC-FUNCTIONAL-NODE");

    private static final SubLSymbol FI_ASSERT_INT = makeSymbol("FI-ASSERT-INT");







    static private final SubLList $list80 = list(reader_make_constant_shell("partOfIBT"), reader_make_constant_shell("Cyc"));

    private static final SubLList $list81 = list(list(new SubLObject[]{ makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("NEW-GAFS"), makeSymbol("OLD-GAFS"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell("CycRecursiveTemplateParser")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym82$TEST_GAF = makeUninternedSymbol("TEST-GAF");

    private static final SubLSymbol $sym83$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");

    private static final SubLList $list84 = list(makeSymbol("*KB-NODE-GATHERING-MODE?*"), T);



    private static final SubLString $str90$restore_syntactic_option__A = makeString("restore-syntactic-option&~A");

    private static final SubLString $str91$_Restore_Syntactic_Option_ = makeString("[Restore Syntactic Option]");

    private static final SubLString $str92$exclude_syntactic_option__A = makeString("exclude-syntactic-option&~A");

    private static final SubLString $str93$_Exclude_Syntactic_Option_ = makeString("[Exclude Syntactic Option]");

    private static final SubLSymbol $SYNTACTIC_NODE_TOOLKIT = makeKeyword("SYNTACTIC-NODE-TOOLKIT");

    private static final SubLSymbol CB_LINK_SYNTACTIC_NODE_TOOLKIT = makeSymbol("CB-LINK-SYNTACTIC-NODE-TOOLKIT");

    private static final SubLSymbol EXCLUDE_SYNTACTIC_OPTION = makeSymbol("EXCLUDE-SYNTACTIC-OPTION");

    private static final SubLSymbol RESTORE_SYNTACTIC_OPTION = makeSymbol("RESTORE-SYNTACTIC-OPTION");

    private static final SubLList $list100 = list(list(makeSymbol("*RTP-LATEST-KB-PARSE-TREE*"), $SAVE));

    private static final SubLSymbol $rtp_component_tokenizations$ = makeSymbol("*RTP-COMPONENT-TOKENIZATIONS*");

    private static final SubLList $list103 = list(list(makeSymbol("SAVE-HERE"), makeSymbol("OFFSET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_PARSE_TOKENIZATION = makeSymbol("WITH-PARSE-TOKENIZATION");

    private static final SubLSymbol $rtp_relevant_tokenization$ = makeSymbol("*RTP-RELEVANT-TOKENIZATION*");

    private static final SubLList $list108 = list(makeSymbol("ASSERTING-TREES?"));

    private static final SubLSymbol SETTING_PARSE_ROOT_NODE = makeSymbol("SETTING-PARSE-ROOT-NODE");













    private static final SubLString $str118$_S_is_not_a_template_category__ = makeString("~S is not a template category~%");





    private static final SubLObject $$ToyParseTreeMt_FullSentences = reader_make_constant_shell("ToyParseTreeMt-FullSentences");

    private static final SubLSymbol ITP_NODE = makeSymbol("ITP-NODE");

    private static final SubLSymbol ITP_NODE_P = makeSymbol("ITP-NODE-P");

    static private final SubLList $list125 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("PARENT"), makeSymbol("COMPONENT"), makeSymbol("SPAN"), makeSymbol("NEW-PARSE"), makeSymbol("ASSERTION"), makeSymbol("CHILDREN"), makeSymbol("PERMUTATIONS"), makeSymbol("SYNTACTIC-NODE"), makeSymbol("SYNTACTIC-CHOICES") });

    static private final SubLList $list126 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("PARENT"), makeKeyword("COMPONENT"), $SPAN, makeKeyword("NEW-PARSE"), makeKeyword("ASSERTION"), makeKeyword("CHILDREN"), makeKeyword("PERMUTATIONS"), makeKeyword("SYNTACTIC-NODE"), makeKeyword("SYNTACTIC-CHOICES") });

    private static final SubLList $list127 = list(new SubLObject[]{ makeSymbol("ITP-NODE-ID"), makeSymbol("ITP-NODE-PARENT"), makeSymbol("ITP-NODE-COMPONENT"), makeSymbol("ITP-NODE-SPAN"), makeSymbol("ITP-NODE-NEW-PARSE"), makeSymbol("ITP-NODE-ASSERTION"), makeSymbol("ITP-NODE-CHILDREN"), makeSymbol("ITP-NODE-PERMUTATIONS"), makeSymbol("ITP-NODE-SYNTACTIC-NODE"), makeSymbol("ITP-NODE-SYNTACTIC-CHOICES") });

    private static final SubLList $list128 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-NODE-ID"), makeSymbol("_CSETF-ITP-NODE-PARENT"), makeSymbol("_CSETF-ITP-NODE-COMPONENT"), makeSymbol("_CSETF-ITP-NODE-SPAN"), makeSymbol("_CSETF-ITP-NODE-NEW-PARSE"), makeSymbol("_CSETF-ITP-NODE-ASSERTION"), makeSymbol("_CSETF-ITP-NODE-CHILDREN"), makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES") });

    private static final SubLSymbol PRINT_ITP_NODE = makeSymbol("PRINT-ITP-NODE");

    private static final SubLSymbol ITP_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list131 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-NODE-P"));

    private static final SubLSymbol ITP_NODE_ID = makeSymbol("ITP-NODE-ID");

    private static final SubLSymbol _CSETF_ITP_NODE_ID = makeSymbol("_CSETF-ITP-NODE-ID");

    private static final SubLSymbol ITP_NODE_PARENT = makeSymbol("ITP-NODE-PARENT");

    private static final SubLSymbol _CSETF_ITP_NODE_PARENT = makeSymbol("_CSETF-ITP-NODE-PARENT");

    private static final SubLSymbol ITP_NODE_COMPONENT = makeSymbol("ITP-NODE-COMPONENT");

    private static final SubLSymbol _CSETF_ITP_NODE_COMPONENT = makeSymbol("_CSETF-ITP-NODE-COMPONENT");

    private static final SubLSymbol ITP_NODE_SPAN = makeSymbol("ITP-NODE-SPAN");

    private static final SubLSymbol _CSETF_ITP_NODE_SPAN = makeSymbol("_CSETF-ITP-NODE-SPAN");

    private static final SubLSymbol ITP_NODE_NEW_PARSE = makeSymbol("ITP-NODE-NEW-PARSE");

    private static final SubLSymbol _CSETF_ITP_NODE_NEW_PARSE = makeSymbol("_CSETF-ITP-NODE-NEW-PARSE");

    private static final SubLSymbol ITP_NODE_ASSERTION = makeSymbol("ITP-NODE-ASSERTION");

    private static final SubLSymbol _CSETF_ITP_NODE_ASSERTION = makeSymbol("_CSETF-ITP-NODE-ASSERTION");

    private static final SubLSymbol ITP_NODE_CHILDREN = makeSymbol("ITP-NODE-CHILDREN");

    private static final SubLSymbol _CSETF_ITP_NODE_CHILDREN = makeSymbol("_CSETF-ITP-NODE-CHILDREN");

    private static final SubLSymbol ITP_NODE_PERMUTATIONS = makeSymbol("ITP-NODE-PERMUTATIONS");

    private static final SubLSymbol _CSETF_ITP_NODE_PERMUTATIONS = makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS");

    private static final SubLSymbol ITP_NODE_SYNTACTIC_NODE = makeSymbol("ITP-NODE-SYNTACTIC-NODE");

    private static final SubLSymbol _CSETF_ITP_NODE_SYNTACTIC_NODE = makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE");

    private static final SubLSymbol ITP_NODE_SYNTACTIC_CHOICES = makeSymbol("ITP-NODE-SYNTACTIC-CHOICES");

    private static final SubLSymbol _CSETF_ITP_NODE_SYNTACTIC_CHOICES = makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES");

    private static final SubLString $str161$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ITP_NODE = makeSymbol("MAKE-ITP-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str168$__ = makeString("~%");













    private static final SubLSymbol $sym176$_VBAR = makeSymbol("?VBAR");



    private static final SubLSymbol $sym178$_CHILD = makeSymbol("?CHILD");



    private static final SubLList $list180 = list(list(reader_make_constant_shell("syntacticDaughters"), makeSymbol("?VBAR"), makeSymbol("?CHILD")), list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?VBAR"), list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Verb"))));

    private static final SubLSymbol $sym181$_V = makeSymbol("?V");



    private static final SubLList $list183 = list(makeSymbol("?V"));

    private static final SubLList $list184 = list(list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?V"), reader_make_constant_shell("Verb")));





    static private final SubLList $list187 = list(ONE_INTEGER, makeSymbol("?NODE"));

    static private final SubLList $list188 = list(list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?NODE"), reader_make_constant_shell("Verb")));

    private static final SubLString $str189$____RTP_____Couldn_t_create_KB_no = makeString("*** RTP *** Couldn't create KB node for ~A in ~A");

    private static final SubLSymbol ITP_STATE = makeSymbol("ITP-STATE");

    private static final SubLSymbol ITP_STATE_P = makeSymbol("ITP-STATE-P");

    private static final SubLList $list192 = list(new SubLObject[]{ makeSymbol("SEQUENCE"), makeSymbol("COMPLETE-PARSES-ONLY"), makeSymbol("WORK-SET"), makeSymbol("SOLUTION-SET"), makeSymbol("SENTENCE"), makeSymbol("CATEGORY"), makeSymbol("CACHE"), makeSymbol("PSP-CHARTS"), makeSymbol("WORKING-MT") });

    private static final SubLList $list193 = list(new SubLObject[]{ makeKeyword("SEQUENCE"), makeKeyword("COMPLETE-PARSES-ONLY"), makeKeyword("WORK-SET"), makeKeyword("SOLUTION-SET"), makeKeyword("SENTENCE"), makeKeyword("CATEGORY"), makeKeyword("CACHE"), makeKeyword("PSP-CHARTS"), makeKeyword("WORKING-MT") });

    private static final SubLList $list194 = list(new SubLObject[]{ makeSymbol("ITP-STATE-SEQUENCE"), makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("ITP-STATE-WORK-SET"), makeSymbol("ITP-STATE-SOLUTION-SET"), makeSymbol("ITP-STATE-SENTENCE"), makeSymbol("ITP-STATE-CATEGORY"), makeSymbol("ITP-STATE-CACHE"), makeSymbol("ITP-STATE-PSP-CHARTS"), makeSymbol("ITP-STATE-WORKING-MT") });

    private static final SubLList $list195 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-STATE-SEQUENCE"), makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("_CSETF-ITP-STATE-WORK-SET"), makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET"), makeSymbol("_CSETF-ITP-STATE-SENTENCE"), makeSymbol("_CSETF-ITP-STATE-CATEGORY"), makeSymbol("_CSETF-ITP-STATE-CACHE"), makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS"), makeSymbol("_CSETF-ITP-STATE-WORKING-MT") });

    private static final SubLSymbol PRINT_ITP_STATE = makeSymbol("PRINT-ITP-STATE");

    private static final SubLSymbol ITP_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list198 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-STATE-P"));

    private static final SubLSymbol ITP_STATE_SEQUENCE = makeSymbol("ITP-STATE-SEQUENCE");

    private static final SubLSymbol _CSETF_ITP_STATE_SEQUENCE = makeSymbol("_CSETF-ITP-STATE-SEQUENCE");

    private static final SubLSymbol ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY");

    private static final SubLSymbol _CSETF_ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY");

    private static final SubLSymbol ITP_STATE_WORK_SET = makeSymbol("ITP-STATE-WORK-SET");

    private static final SubLSymbol _CSETF_ITP_STATE_WORK_SET = makeSymbol("_CSETF-ITP-STATE-WORK-SET");

    private static final SubLSymbol ITP_STATE_SOLUTION_SET = makeSymbol("ITP-STATE-SOLUTION-SET");

    private static final SubLSymbol _CSETF_ITP_STATE_SOLUTION_SET = makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET");

    private static final SubLSymbol ITP_STATE_SENTENCE = makeSymbol("ITP-STATE-SENTENCE");

    private static final SubLSymbol _CSETF_ITP_STATE_SENTENCE = makeSymbol("_CSETF-ITP-STATE-SENTENCE");

    private static final SubLSymbol ITP_STATE_CATEGORY = makeSymbol("ITP-STATE-CATEGORY");

    private static final SubLSymbol _CSETF_ITP_STATE_CATEGORY = makeSymbol("_CSETF-ITP-STATE-CATEGORY");

    private static final SubLSymbol ITP_STATE_CACHE = makeSymbol("ITP-STATE-CACHE");

    private static final SubLSymbol _CSETF_ITP_STATE_CACHE = makeSymbol("_CSETF-ITP-STATE-CACHE");

    private static final SubLSymbol ITP_STATE_PSP_CHARTS = makeSymbol("ITP-STATE-PSP-CHARTS");

    private static final SubLSymbol _CSETF_ITP_STATE_PSP_CHARTS = makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS");

    private static final SubLSymbol ITP_STATE_WORKING_MT = makeSymbol("ITP-STATE-WORKING-MT");

    private static final SubLSymbol _CSETF_ITP_STATE_WORKING_MT = makeSymbol("_CSETF-ITP-STATE-WORKING-MT");

    private static final SubLSymbol $COMPLETE_PARSES_ONLY = makeKeyword("COMPLETE-PARSES-ONLY");

    private static final SubLSymbol MAKE_ITP_STATE = makeSymbol("MAKE-ITP-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD");

    private static final SubLString $str227$Work___D_Solution___D_KB_Mt___A = makeString("Work: ~D Solution: ~D KB Mt: ~A");

    private static final SubLSymbol ITP_NODE_MAX_CHILD_SPAN_LENGTH = makeSymbol("ITP-NODE-MAX-CHILD-SPAN-LENGTH");

    private static final SubLSymbol $sym229$_ = makeSymbol(">");

    private static final SubLSymbol NEW_ITP_STATE_PSP_CHART_DICTIONARY = makeSymbol("NEW-ITP-STATE-PSP-CHART-DICTIONARY");



    private static final SubLString $$$R = makeString("R");





    private static final SubLString $str236$Expanding_itp_node__A________S__ = makeString("Expanding itp-node ~A:~%    ~S~%");



    private static final SubLList $list238 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));





    private static final SubLSymbol ITP_PS_GET_CYCLS_FOR_PHRASE = makeSymbol("ITP-PS-GET-CYCLS-FOR-PHRASE");

    private static final SubLSymbol ITP_PS_PARSE_VBAR = makeSymbol("ITP-PS-PARSE-VBAR");

    private static final SubLString $str245$length_of_chart_for__S____S__ = makeString("length of chart for ~S = ~S~%");





    private static final SubLString $str248$sent_a_weird_category___S__to_pre = makeString("sent a weird category (~S) to pred-for-category (the vp-parser)~%");



    private static final SubLString $str250$sent_a_non_categorized_pred___S__ = makeString("sent a non-categorized pred (~S) to RTP-CAT-FOR-PRED~%");





    private static final SubLString $str253$sent_un_categorized_category__s_t = makeString("sent un-categorized category ~s to RTP-CAT-FOR-POS~%");

    private static final SubLSymbol $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_ = makeSymbol("VERB-PHRASAL-TEMPLATE-CATEGORY?");

    private static final SubLSymbol $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym257$VERBAL_TEMPLATE_CATEGORY_ = makeSymbol("VERBAL-TEMPLATE-CATEGORY?");

    private static final SubLSymbol $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym259$VBAR_TEMPLATE_CATEGORY_ = makeSymbol("VBAR-TEMPLATE-CATEGORY?");



    private static final SubLSymbol $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym262$RTP_VBAR_TEMPLATE_CATEGORY_ = makeSymbol("RTP-VBAR-TEMPLATE-CATEGORY?");



    private static final SubLObject $$assertTemplate_Reln = reader_make_constant_shell("assertTemplate-Reln");

    private static final SubLSymbol $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ = makeSymbol("PREDICATIVE-ADJP-TEMPLATE-CATEGORY?");

    private static final SubLObject $$AdjPTemplate_Predicative = reader_make_constant_shell("AdjPTemplate-Predicative");

    private static final SubLSymbol $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym269$NOMINAL_CATEGORY_ = makeSymbol("NOMINAL-CATEGORY?");

    private static final SubLSymbol $sym270$_NOMINAL_CATEGORY__CACHING_STATE_ = makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym271$ADJECTIVAL_CATEGORY_ = makeSymbol("ADJECTIVAL-CATEGORY?");



    private static final SubLSymbol $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_ = makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");

    private static final SubLList $list274 = list(reader_make_constant_shell("NumberTemplate"), reader_make_constant_shell("OrdinalTemplate"));

    private static final SubLSymbol RESULT_OF_PARSING_SPAN_LENGTH = makeSymbol("RESULT-OF-PARSING-SPAN-LENGTH");

    private static final SubLSymbol $sym277$IS_THIS_A_THELIST_SPAN_ = makeSymbol("IS-THIS-A-THELIST-SPAN?");

    private static final SubLSymbol $sym278$_ = makeSymbol("<");

    private static final SubLSymbol $sym279$_FUNC = makeSymbol("?FUNC");

    private static final SubLList $list280 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("NLTaggedTermDenotingFunction")), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("TernaryFunction")));

    private static final SubLSymbol $sym281$MT_IN_ANY_MT_ = makeSymbol("MT-IN-ANY-MT?");







    private static final SubLString $str285$Couldn_t_find_a_parse_tree_mt_to_ = makeString("Couldn't find a parse-tree mt to be a genls of ~A -- some assertions may bomb out accordingly");

    private static final SubLObject $$SyntacticNode_Sentential = reader_make_constant_shell("SyntacticNode-Sentential");

    private static final SubLSymbol $sym287$_N = makeSymbol("?N");



    private static final SubLSymbol $sym289$RESULT_OF_PARSING_FORMULA_ = makeSymbol("RESULT-OF-PARSING-FORMULA?");

    private static final SubLList $list290 = list(reader_make_constant_shell("TheList"), reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("VPTemplate"));

    static private final SubLList $list291 = list(makeSymbol("SUBJ-COMPONENT"), makeSymbol("VP-COMPONENT"));

    private static final SubLString $str292$____can_t_build_any_meaning_combi = makeString("*** can't build any meaning combinations for ~A");

    private static final SubLList $list293 = list(makeSymbol("VP-NODE"), makeSymbol("VP-MEANING"));

    private static final SubLList $list294 = list(makeSymbol("SUBJ-NODE"), makeSymbol("SUBJ-MEANING"));



    private static final SubLSymbol $sym297$NL_ATTR_W_LOCATION_ = makeSymbol("NL-ATTR-W-LOCATION?");

    private static final SubLList $list298 = list(reader_make_constant_shell("NLDefinitenessFn"), reader_make_constant_shell("NLQuantFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"));

    private static final SubLSymbol ITP_OUTPUT_SORTING_FUNCTION = makeSymbol("ITP-OUTPUT-SORTING-FUNCTION");



    private static final SubLSymbol $sym303$UNASSEMBLED_PHRASE_ = makeSymbol("UNASSEMBLED-PHRASE?");

    private static final SubLSymbol REWRITE_ASSEMBLE_PHRASE = makeSymbol("REWRITE-ASSEMBLE-PHRASE");



    private static final SubLList $list307 = list(reader_make_constant_shell("STemplate"), reader_make_constant_shell("VPTemplate"));



    private static final SubLObject $$termTemplate_Reln = reader_make_constant_shell("termTemplate-Reln");

    private static final SubLObject $$termTemplate_Test = reader_make_constant_shell("termTemplate-Test");

    private static final SubLObject $$assertTemplate_Test = reader_make_constant_shell("assertTemplate-Test");



    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell("queryTemplate-Reln");

    private static final SubLObject $$queryTemplate_Test = reader_make_constant_shell("queryTemplate-Test");

    private static final SubLString $str315$sent__S_to_force_for_result__ = makeString("sent ~S to force-for-result~%");

    private static final SubLList $list316 = list(reader_make_constant_shell("STemplate"), reader_make_constant_shell("QuestionTemplate"));



    private static final SubLSymbol $sym319$SUBSTITUTABLE_CHILD_FORMULA_ = makeSymbol("SUBSTITUTABLE-CHILD-FORMULA?");

    private static final SubLSymbol PARTIAL_PARSE_FILTER_FUNCTION = makeSymbol("PARTIAL-PARSE-FILTER-FUNCTION");

    /**
     *
     *
     * @param OBJECT
     * 		- presumed to be a spec of #$SyntacticNode or #$ParsingTemplateCategory, or an #$NLPhraseType
     * @param MICROTHEORY
     * 		- from which to run the KB queries analyzing the category
     * @return (list NODE-TYPE LINGUISTIC-CATEGORY) - depending on the object passed in
     * @unknown passing #$SyntacticNodeOfNPCategory, #$NPTemplate, or #$NounPhrase should all return (list #$SyntacticNodeOfNPCategory #$NounPhrase)
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\t- presumed to be a spec of #$SyntacticNode or #$ParsingTemplateCategory, or an #$NLPhraseType\r\n@param MICROTHEORY\r\n\t\t- from which to run the KB queries analyzing the category\r\n@return (list NODE-TYPE LINGUISTIC-CATEGORY) - depending on the object passed in\r\n@unknown passing #$SyntacticNodeOfNPCategory, #$NPTemplate, or #$NounPhrase should all return (list #$SyntacticNodeOfNPCategory #$NounPhrase)")
    public static final SubLObject kb_node_analyze_category_alt(SubLObject category, SubLObject into_mt) {
        if (NIL == category) {
            return NIL;
        } else {
            if (NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
                return NIL;
            }
        }
        {
            SubLObject node_type = NIL;
            SubLObject ling_cat = NIL;
            if (NIL != genls.genlP(category, $$SyntacticNode, into_mt, UNPROVIDED)) {
                node_type = category;
                ling_cat = ask_utilities.ask_variable($sym1$_CAT, listS($$relationAllInstance, $$syntacticNodeCategory, category, $list_alt4), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            } else {
                if (NIL != genls.genlP(category, $$ParsingTemplateCategory, $$TemplateParsingMt, UNPROVIDED)) {
                    {
                        SubLObject types = ask_utilities.ask_variable($sym7$_TYPE, listS($$and, listS($$genls, category, $list_alt10), $list_alt11), $$RKFParsingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        ling_cat = types.first();
                        {
                            SubLObject node_types = ask_utilities.ask_variable($sym13$_NODE, list($$relationAllInstance, $$syntacticNodeCategory, $sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            node_type = (NIL != list_utilities.singletonP(node_types)) ? ((SubLObject) (node_types.first())) : $$SyntacticNode;
                        }
                    }
                } else {
                    if (NIL != isa.isaP(category, $$NLPhraseType, into_mt, UNPROVIDED)) {
                        ling_cat = category;
                        {
                            SubLObject node_types2 = ask_utilities.ask_variable($sym13$_NODE, list($$relationAllInstance, $$syntacticNodeCategory, $sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            node_type = (NIL != list_utilities.singletonP(node_types2)) ? ((SubLObject) (node_types2.first())) : $$SyntacticNode;
                        }
                    } else {
                        if (NIL != genls.genlsP(category, $$NLWordForm, into_mt, UNPROVIDED)) {
                            ling_cat = category;
                            node_type = $$SyntacticNode;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
            return list(node_type, ling_cat);
        }
    }

    /**
     *
     *
     * @param OBJECT
     * 		- presumed to be a spec of #$SyntacticNode or #$ParsingTemplateCategory, or an #$NLPhraseType
     * @param MICROTHEORY
     * 		- from which to run the KB queries analyzing the category
     * @return (list NODE-TYPE LINGUISTIC-CATEGORY) - depending on the object passed in
     * @unknown passing #$SyntacticNodeOfNPCategory, #$NPTemplate, or #$NounPhrase should all return (list #$SyntacticNodeOfNPCategory #$NounPhrase)
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\t- presumed to be a spec of #$SyntacticNode or #$ParsingTemplateCategory, or an #$NLPhraseType\r\n@param MICROTHEORY\r\n\t\t- from which to run the KB queries analyzing the category\r\n@return (list NODE-TYPE LINGUISTIC-CATEGORY) - depending on the object passed in\r\n@unknown passing #$SyntacticNodeOfNPCategory, #$NPTemplate, or #$NounPhrase should all return (list #$SyntacticNodeOfNPCategory #$NounPhrase)")
    public static SubLObject kb_node_analyze_category(final SubLObject category, final SubLObject into_mt) {
        if (NIL == category) {
            return NIL;
        }
        if (NIL == mt_in_any_mtP(into_mt)) {
            return NIL;
        }
        SubLObject node_type = NIL;
        SubLObject ling_cat = NIL;
        if (NIL != genlP(category, iterative_template_parser.$$SyntacticNode, into_mt, UNPROVIDED)) {
            node_type = category;
            ling_cat = ask_utilities.ask_variable(iterative_template_parser.$sym1$_CAT, listS(iterative_template_parser.$$relationAllInstance, iterative_template_parser.$$syntacticNodeCategory, category, iterative_template_parser.$list4), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        } else
            if (NIL != genlP(category, iterative_template_parser.$$ParsingTemplateCategory, iterative_template_parser.$$TemplateParsingMt, UNPROVIDED)) {
                final SubLObject types = ask_utilities.ask_variable(iterative_template_parser.$sym7$_TYPE, listS(iterative_template_parser.$$and, listS(iterative_template_parser.$$genls, category, iterative_template_parser.$list10), iterative_template_parser.$list11), iterative_template_parser.$$RKFParsingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                ling_cat = types.first();
                final SubLObject node_types = ask_utilities.ask_variable(iterative_template_parser.$sym13$_NODE, list(iterative_template_parser.$$relationAllInstance, iterative_template_parser.$$syntacticNodeCategory, iterative_template_parser.$sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                node_type = (NIL != singletonP(node_types)) ? node_types.first() : iterative_template_parser.$$SyntacticNode;
            } else
                if (NIL != isaP(category, iterative_template_parser.$$NLPhraseType, into_mt, UNPROVIDED)) {
                    ling_cat = category;
                    final SubLObject node_types2 = ask_utilities.ask_variable(iterative_template_parser.$sym13$_NODE, list(iterative_template_parser.$$relationAllInstance, iterative_template_parser.$$syntacticNodeCategory, iterative_template_parser.$sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    node_type = (NIL != singletonP(node_types2)) ? node_types2.first() : iterative_template_parser.$$SyntacticNode;
                } else {
                    if (NIL == genlsP(category, iterative_template_parser.$$NLWordForm, into_mt, UNPROVIDED)) {
                        return NIL;
                    }
                    ling_cat = category;
                    node_type = iterative_template_parser.$$SyntacticNode;
                }


        return list(node_type, ling_cat);
    }

    public static final SubLObject reset_kb_node_internal_counter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $kb_node_internal_counter$.setDynamicValue(ZERO_INTEGER, thread);
            return $kb_node_internal_counter$.getDynamicValue(thread);
        }
    }

    public static SubLObject reset_kb_node_internal_counter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        iterative_template_parser.$kb_node_internal_counter$.setDynamicValue(ZERO_INTEGER, thread);
        return iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param STRINGP
     * 		; to be used in the name
     * @return "Node-STRINGP-#", where # is the lowest number >= *kb-node-internal-counter* for which a #$Node-StringP-# doesn't already exist
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\t; to be used in the name\r\n@return \"Node-STRINGP-#\", where # is the lowest number >= *kb-node-internal-counter* for which a #$Node-StringP-# doesn\'t already exist")
    public static final SubLObject next_available_kb_node_alt(SubLObject type, SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kb_node = NIL;
                while (NIL == kb_node) {
                    kb_node = parsing_utilities.hypothesize_parse_tree_element(type, mt, UNPROVIDED);
                    if ((NIL != kb_node) && (NIL != label)) {
                        fi.fi_rename_int(kb_node, format(NIL, $str_alt16$Node__A__D, label, $kb_node_internal_counter$.getDynamicValue(thread)));
                        $kb_node_internal_counter$.setDynamicValue(add($kb_node_internal_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                    }
                } 
                return kb_node;
            }
        }
    }

    /**
     *
     *
     * @param STRINGP
     * 		; to be used in the name
     * @return "Node-STRINGP-#", where # is the lowest number >= *kb-node-internal-counter* for which a #$Node-StringP-# doesn't already exist
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\t; to be used in the name\r\n@return \"Node-STRINGP-#\", where # is the lowest number >= *kb-node-internal-counter* for which a #$Node-StringP-# doesn\'t already exist")
    public static SubLObject next_available_kb_node(final SubLObject type, final SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_node = NIL;
        while (NIL == kb_node) {
            kb_node = hypothesize_parse_tree_element(type, mt, UNPROVIDED);
            if ((NIL != kb_node) && (NIL != label)) {
                fi_rename_int(kb_node, format(NIL, iterative_template_parser.$str16$Node__A__D, label, iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread)));
                iterative_template_parser.$kb_node_internal_counter$.setDynamicValue(add(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
        } 
        return kb_node;
    }

    /**
     *
     *
     * @param MICOTHEORY
     * 		
     * @param #$SententialConstituentType
     * 		or STRINGP ; the newly created node's #$syntacticNodeCategory, defaults to #$NLPhrase
     * @return value1 the node which was created
    value2 if *kb-node-gathering-mode?* is non-nil, will return the (ordered) list of gafs which would flesh out the node
     */
    @LispMethod(comment = "@param MICOTHEORY\r\n\t\t\r\n@param #$SententialConstituentType\r\n\t\tor STRINGP ; the newly created node\'s #$syntacticNodeCategory, defaults to #$NLPhrase\r\n@return value1 the node which was created\r\nvalue2 if *kb-node-gathering-mode?* is non-nil, will return the (ordered) list of gafs which would flesh out the node")
    public static final SubLObject new_syntactic_functional_node_alt(SubLObject into_mt, SubLObject category, SubLObject label) {
        if (category == UNPROVIDED) {
            category = $$NLPhrase;
        }
        if (label == UNPROVIDED) {
            label = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $kb_node_internal_counter$.getDynamicValue(thread)) {
                SubLTrampolineFile.checkType($kb_node_internal_counter$.getDynamicValue(thread), NON_NEGATIVE_INTEGER_P);
            }
            {
                SubLObject datum = com.cyc.cycjava.cycl.rtp.iterative_template_parser.kb_node_analyze_category(category, into_mt);
                SubLObject current = datum;
                SubLObject node_type = NIL;
                SubLObject linguistic_category = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt19);
                node_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                linguistic_category = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject node_string = NIL;
                        SubLObject kb_node = NIL;
                        SubLObject instructions = NIL;
                        if (label.isString()) {
                            node_string = label;
                        } else {
                            if (node_type.eql($$SyntacticNode_MatrixClause)) {
                                node_string = $$$Root;
                            } else {
                                if (NIL == linguistic_category) {
                                    node_string = $$$Unrecognized;
                                } else {
                                    if (NIL != list_utilities.proper_list_p(linguistic_category)) {
                                        {
                                            SubLObject datum_1 = linguistic_category;
                                            SubLObject current_2 = datum_1;
                                            SubLObject func = NIL;
                                            SubLObject cat = NIL;
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt23);
                                            func = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt23);
                                            cat = current_2.first();
                                            current_2 = current_2.rest();
                                            if (NIL == current_2) {
                                                node_string = format(NIL, $str_alt24$_A_A, string_utilities.substring(string_utilities.fort_to_string(cat), TWO_INTEGER, THREE_INTEGER), func.eql($$PhraseFn) ? ((SubLObject) ($$$P)) : $$$Bar);
                                            } else {
                                                cdestructuring_bind_error(datum_1, $list_alt23);
                                            }
                                        }
                                    } else {
                                        node_string = string_utilities.substring(string_utilities.fort_to_string(linguistic_category), TWO_INTEGER, UNPROVIDED);
                                    }
                                }
                            }
                        }
                        if (NIL != $rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                            Errors.warn($str_alt28$____creating_a__A_node__of_type__, node_string, node_type, linguistic_category);
                        }
                        kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.next_available_kb_node(node_type, into_mt, node_string);
                        if (NIL != kb_node) {
                            if (NIL != isa.isaP(linguistic_category, $$SententialConstituentType, into_mt, UNPROVIDED)) {
                                {
                                    SubLObject cat_gaf = list($$syntacticNodeCategory, kb_node, linguistic_category);
                                    if (NIL != $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                                        instructions = cons(cat_gaf, instructions);
                                    } else {
                                        fi.fi_assert_int(cat_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                            return values(kb_node, reverse(instructions));
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt19);
                }
            }
            return values(NIL, NIL);
        }
    }

    /**
     *
     *
     * @param MICOTHEORY
     * 		
     * @param #$SententialConstituentType
     * 		or STRINGP ; the newly created node's #$syntacticNodeCategory, defaults to #$NLPhrase
     * @return value1 the node which was created
    value2 if *kb-node-gathering-mode?* is non-nil, will return the (ordered) list of gafs which would flesh out the node
     */
    @LispMethod(comment = "@param MICOTHEORY\r\n\t\t\r\n@param #$SententialConstituentType\r\n\t\tor STRINGP ; the newly created node\'s #$syntacticNodeCategory, defaults to #$NLPhrase\r\n@return value1 the node which was created\r\nvalue2 if *kb-node-gathering-mode?* is non-nil, will return the (ordered) list of gafs which would flesh out the node")
    public static SubLObject new_syntactic_functional_node(final SubLObject into_mt, SubLObject category, SubLObject label) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$NLPhrase;
        }
        if (label == UNPROVIDED) {
            label = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread)))) {
            throw new AssertionError(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread));
        }
        SubLObject current;
        final SubLObject datum = current = iterative_template_parser.kb_node_analyze_category(category, into_mt);
        SubLObject node_type = NIL;
        SubLObject linguistic_category = NIL;
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list19);
        node_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list19);
        linguistic_category = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject node_string = NIL;
            SubLObject kb_node = NIL;
            SubLObject instructions = NIL;
            if (label.isString()) {
                node_string = label;
            } else
                if (node_type.eql(iterative_template_parser.$$SyntacticNode_MatrixClause)) {
                    node_string = iterative_template_parser.$$$Root;
                } else
                    if (NIL == linguistic_category) {
                        node_string = iterative_template_parser.$$$Unrecognized;
                    } else
                        if (NIL != proper_list_p(linguistic_category)) {
                            SubLObject current_$2;
                            final SubLObject datum_$1 = current_$2 = linguistic_category;
                            SubLObject func = NIL;
                            SubLObject cat = NIL;
                            destructuring_bind_must_consp(current_$2, datum_$1, iterative_template_parser.$list23);
                            func = current_$2.first();
                            current_$2 = current_$2.rest();
                            destructuring_bind_must_consp(current_$2, datum_$1, iterative_template_parser.$list23);
                            cat = current_$2.first();
                            current_$2 = current_$2.rest();
                            if (NIL == current_$2) {
                                node_string = format(NIL, iterative_template_parser.$str24$_A_A, substring(fort_to_string(cat), TWO_INTEGER, THREE_INTEGER), func.eql(iterative_template_parser.$$PhraseFn) ? iterative_template_parser.$$$P : iterative_template_parser.$$$Bar);
                            } else {
                                cdestructuring_bind_error(datum_$1, iterative_template_parser.$list23);
                            }
                        } else {
                            node_string = substring(fort_to_string(linguistic_category), TWO_INTEGER, UNPROVIDED);
                        }



            if (NIL != iterative_template_parser.$rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                Errors.warn(iterative_template_parser.$str28$____creating_a__A_node__of_type__, node_string, node_type, linguistic_category);
            }
            kb_node = iterative_template_parser.next_available_kb_node(node_type, into_mt, node_string);
            if (NIL != kb_node) {
                if (NIL != isaP(linguistic_category, iterative_template_parser.$$SententialConstituentType, into_mt, UNPROVIDED)) {
                    final SubLObject cat_gaf = list(iterative_template_parser.$$syntacticNodeCategory, kb_node, linguistic_category);
                    if (NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                        instructions = cons(cat_gaf, instructions);
                    } else {
                        fi_assert_int(cat_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                return values(kb_node, reverse(instructions));
            }
        } else {
            cdestructuring_bind_error(datum, iterative_template_parser.$list19);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject new_syntactic_choice_node_alt(SubLObject into_mt, SubLObject options, SubLObject category, SubLObject label) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (category == UNPROVIDED) {
            category = $$SyntacticChoiceNode;
        }
        if (label == UNPROVIDED) {
            label = $$$Choice;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node(into_mt, category, label);
                SubLObject gafs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cdolist_list_var = options;
                    SubLObject this_opt = NIL;
                    for (this_opt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_opt = cdolist_list_var.first()) {
                        if (NIL != isa.isaP(this_opt, $$SyntacticNode, into_mt, UNPROVIDED)) {
                            {
                                SubLObject daughter_gaf = list($$optionNodes, kb_node, this_opt);
                                if (NIL != $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                                    gafs = cons(daughter_gaf, gafs);
                                } else {
                                    fi.fi_assert_int(daughter_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return values(kb_node, reverse(gafs));
            }
        }
    }

    public static SubLObject new_syntactic_choice_node(final SubLObject into_mt, SubLObject options, SubLObject category, SubLObject label) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$SyntacticChoiceNode;
        }
        if (label == UNPROVIDED) {
            label = iterative_template_parser.$$$Choice;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject kb_node = iterative_template_parser.new_syntactic_functional_node(into_mt, category, label);
        SubLObject gafs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = options;
        SubLObject this_opt = NIL;
        this_opt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isaP(this_opt, iterative_template_parser.$$SyntacticNode, into_mt, UNPROVIDED)) {
                final SubLObject daughter_gaf = list(iterative_template_parser.$$optionNodes, kb_node, this_opt);
                if (NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                    gafs = cons(daughter_gaf, gafs);
                } else {
                    fi_assert_int(daughter_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_opt = cdolist_list_var.first();
        } 
        return values(kb_node, reverse(gafs));
    }

    /**
     *
     *
     * @param MICROTHEORY
     * 		
     * @return the number of constants killed via this function - #$SyntacticNodes, #$CycTokenizations, etc
     */
    @LispMethod(comment = "@param MICROTHEORY\r\n\t\t\r\n@return the number of constants killed via this function - #$SyntacticNodes, #$CycTokenizations, etc")
    public static final SubLObject kb_nodes_kill_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kills = ZERO_INTEGER;
                SubLObject cdolist_list_var = list($$SyntacticNode, $$SyntacticChoiceNode, $$CycParseTree, $$CycTokenization, $$CycParsingToken);
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    {
                        SubLObject node_var = col;
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject node_var_3 = node_var;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject mt_var = mt;
                                                {
                                                    SubLObject _prev_bind_0_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                        {
                                                            SubLObject tv_var = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_11 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_3, UNPROVIDED);
                                                                                        while (NIL != node_var_3) {
                                                                                            {
                                                                                                SubLObject tt_node_var = node_var_3;
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                                SubLObject cdolist_list_var_15 = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , module_var = cdolist_list_var_15.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt_18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_18)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_18, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_20)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_20);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_22 = new_list;
                                                                                                                                                                                        SubLObject node_23 = NIL;
                                                                                                                                                                                        for (node_23 = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , node_23 = cdolist_list_var_22.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                                if (NIL != forts.fort_p(node_23)) {
                                                                                                                                                                                                    if (NIL != fi.fi_kill_int(node_23)) {
                                                                                                                                                                                                        kills = add(kills, ONE_INTEGER);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_21, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_20 = dictionary_contents.do_dictionary_contents_next(iteration_state_20);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_20);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_19, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt45$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                        {
                                                                                                                            SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                            SubLObject instance_tuple = NIL;
                                                                                                                            for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject datum = instance_tuple;
                                                                                                                                    SubLObject current = datum;
                                                                                                                                    SubLObject link_node = NIL;
                                                                                                                                    SubLObject mt_24 = NIL;
                                                                                                                                    SubLObject tv = NIL;
                                                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt46);
                                                                                                                                    link_node = current.first();
                                                                                                                                    current = current.rest();
                                                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt46);
                                                                                                                                    mt_24 = current.first();
                                                                                                                                    current = current.rest();
                                                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt46);
                                                                                                                                    tv = current.first();
                                                                                                                                    current = current.rest();
                                                                                                                                    if (NIL == current) {
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_24)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_24, thread);
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject link_nodes = list(link_node);
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_27 = new_list;
                                                                                                                                                                    SubLObject node_28 = NIL;
                                                                                                                                                                    for (node_28 = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , node_28 = cdolist_list_var_27.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_28, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_28, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                            if (NIL != forts.fort_p(node_28)) {
                                                                                                                                                                                if (NIL != fi.fi_kill_int(node_28)) {
                                                                                                                                                                                    kills = add(kills, ONE_INTEGER);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_25, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        cdestructuring_bind_error(datum, $list_alt46);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_29 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , generating_fn = cdolist_list_var_29.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_31 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_32 = new_list_31;
                                                                                                                                            SubLObject node_33 = NIL;
                                                                                                                                            for (node_33 = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , node_33 = cdolist_list_var_32.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_33, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_33, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                    if (NIL != forts.fort_p(node_33)) {
                                                                                                                                                        if (NIL != fi.fi_kill_int(node_33)) {
                                                                                                                                                            kills = add(kills, ONE_INTEGER);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_30, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_17, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_16, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                                SubLObject cdolist_list_var_34 = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , module_var = cdolist_list_var_34.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_3);
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
                                                                                                                                                SubLObject mt_37 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_37)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_37, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_39 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_39)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_39);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_41 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , node_vars_link_node = cdolist_list_var_41.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_40, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_39 = dictionary_contents.do_dictionary_contents_next(iteration_state_39);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_39);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_38, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt45$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_42 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , generating_fn = cdolist_list_var_42.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_44 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_45 = new_list_44;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , node_vars_link_node = cdolist_list_var_45.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_43, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_36, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var_3 = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_14, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_13, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_12, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt47$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_11, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_10, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_8, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_6, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return kills;
            }
        }
    }

    /**
     *
     *
     * @param MICROTHEORY
     * 		
     * @return the number of constants killed via this function - #$SyntacticNodes, #$CycTokenizations, etc
     */
    @LispMethod(comment = "@param MICROTHEORY\r\n\t\t\r\n@return the number of constants killed via this function - #$SyntacticNodes, #$CycTokenizations, etc")
    public static SubLObject kb_nodes_kill(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kills = ZERO_INTEGER;
        SubLObject cdolist_list_var = list(iterative_template_parser.$$SyntacticNode, iterative_template_parser.$$SyntacticChoiceNode, iterative_template_parser.$$CycParseTree, iterative_template_parser.$$CycTokenization, iterative_template_parser.$$CycParsingToken);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node_var = col;
            final SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $sbhl_gather_space$.currentBinding(thread);
            try {
                $sbhl_module$.bind(get_sbhl_module(iterative_template_parser.$$isa), thread);
                $sbhl_gather_space$.bind(get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = create_deck(deck_type);
                    final SubLObject _prev_bind_0_$4 = $sbhl_space$.currentBinding(thread);
                    try {
                        $sbhl_space$.bind(get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$5 = $mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = $relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
                            try {
                                $mt$.bind(update_inference_mt_relevance_mt(mt), thread);
                                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt), thread);
                                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt), thread);
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$6 = $sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$7 = $relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                                    $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_error(ONE_INTEGER, iterative_template_parser.$str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_cerror(ONE_INTEGER, iterative_template_parser.$$$continue_anyway, iterative_template_parser.$str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn(iterative_template_parser.$str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn(iterative_template_parser.$str44$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror(iterative_template_parser.$$$continue_anyway, iterative_template_parser.$str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$7 = $sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = $sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$11 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = $sbhl_module$.currentBinding(thread);
                                    try {
                                        $sbhl_search_module$.bind(get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa)), thread);
                                        $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa))), thread);
                                        $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa))), thread);
                                        $genl_inverse_mode_p$.bind(NIL, thread);
                                        $sbhl_module$.bind(get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa)), thread);
                                        if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(node_var, get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$8 = $sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$9 = $sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$12 = $genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                $sbhl_search_direction$.bind(get_sbhl_backward_search_direction(), thread);
                                                $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_backward_search_direction(), get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa))), thread);
                                                $genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_mark_node_marked(node_var_$3, UNPROVIDED);
                                                while (NIL != node_var_$3) {
                                                    final SubLObject tt_node_var = node_var_$3;
                                                    SubLObject cdolist_list_var_$15;
                                                    final SubLObject accessible_modules = cdolist_list_var_$15 = get_sbhl_accessible_modules(get_sbhl_module(iterative_template_parser.$$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var_$15.first();
                                                    while (NIL != cdolist_list_var_$15) {
                                                        final SubLObject _prev_bind_0_$9 = $sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$10 = $genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            $sbhl_module$.bind(module_var, thread);
                                                            $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_module_backward_direction(get_sbhl_module(iterative_template_parser.$$isa)), get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = do_dictionary_contents_state(dictionary_contents(mt_links)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$18 = do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != relevant_mtP(mt_$18)) {
                                                                                final SubLObject _prev_bind_0_$10 = $sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_link_mt$.bind(mt_$18, thread);
                                                                                    SubLObject iteration_state_$20;
                                                                                    for (iteration_state_$20 = do_dictionary_contents_state(dictionary_contents(tv_links)); NIL == do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = do_dictionary_contents_next(iteration_state_$20)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = do_dictionary_contents_key_value(iteration_state_$20);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$11 = $sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                $sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_$22;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_$22 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_$22)) && (NIL == sbhl_search_path_termination_p(node_$22, $sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_mark_node_marked(node_$22, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != fort_p(node_$22)) && (NIL != fi_kill_int(node_$22))) {
                                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_$23 = NIL;
                                                                                                        node_$23 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_search_path_termination_p(node_$23, $sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_mark_node_marked(node_$23, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != fort_p(node_$23)) && (NIL != fi_kill_int(node_$23))) {
                                                                                                                    kills = add(kills, ONE_INTEGER);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_$23 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error(iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                $sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    do_dictionary_contents_finalize(iteration_state_$20);
                                                                                } finally {
                                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_error(FIVE_INTEGER, iterative_template_parser.$str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != do_sbhl_non_fort_linksP(node, get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt_$19 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list47);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list47);
                                                                        mt_$19 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list47);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != relevant_mtP(mt_$19)) {
                                                                                final SubLObject _prev_bind_0_$12 = $sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_link_mt$.bind(mt_$19, thread);
                                                                                    if (NIL != relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$13 = $sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            $sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_$24;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_$24 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_$24)) && (NIL == sbhl_search_path_termination_p(node_$24, $sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_mark_node_marked(node_$24, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != fort_p(node_$24)) && (NIL != fi_kill_int(node_$24))) {
                                                                                                            kills = add(kills, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$28 = sol;
                                                                                                    SubLObject node_$25 = NIL;
                                                                                                    node_$25 = csome_list_var_$28.first();
                                                                                                    while (NIL != csome_list_var_$28) {
                                                                                                        if (NIL == sbhl_search_path_termination_p(node_$25, $sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_mark_node_marked(node_$25, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != fort_p(node_$25)) && (NIL != fi_kill_int(node_$25))) {
                                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$28 = csome_list_var_$28.rest();
                                                                                                        node_$25 = csome_list_var_$28.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error(iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            $sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, iterative_template_parser.$list47);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$16;
                                                                    final SubLObject new_list = cdolist_list_var_$16 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_module_backward_direction(get_sbhl_module(iterative_template_parser.$$isa)), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_module_backward_direction(get_sbhl_module(iterative_template_parser.$$isa)), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$16.first();
                                                                    while (NIL != cdolist_list_var_$16) {
                                                                        final SubLObject _prev_bind_0_$14 = $sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_$26;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_$26 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_$26)) && (NIL == sbhl_search_path_termination_p(node_$26, $sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_mark_node_marked(node_$26, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((NIL != fort_p(node_$26)) && (NIL != fi_kill_int(node_$26))) {
                                                                                            kills = add(kills, ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject node_$27 = NIL;
                                                                                    node_$27 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_search_path_termination_p(node_$27, $sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_mark_node_marked(node_$27, $sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if ((NIL != fort_p(node_$27)) && (NIL != fi_kill_int(node_$27))) {
                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_$27 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error(iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            $sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                                        generating_fn = cdolist_list_var_$16.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            $genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                            $sbhl_module$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                        module_var = cdolist_list_var_$15.first();
                                                    } 
                                                    SubLObject cdolist_list_var_$17;
                                                    final SubLObject accessible_modules2 = cdolist_list_var_$17 = get_sbhl_accessible_modules(get_sbhl_transfers_through_module(get_sbhl_module(iterative_template_parser.$$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var_$17.first();
                                                    while (NIL != cdolist_list_var_$17) {
                                                        final SubLObject _prev_bind_0_$15 = $sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = $genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            $sbhl_module$.bind(module_var2, thread);
                                                            $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = naut_to_nart(node_var_$3);
                                                            if (NIL != sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = get_sbhl_graph_link(node2, get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = get_sbhl_mt_links(d_link2, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = do_dictionary_contents_state(dictionary_contents(mt_links2)); NIL == do_dictionary_contents_doneP(iteration_state2); iteration_state2 = do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$20 = do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != relevant_mtP(mt_$20)) {
                                                                                final SubLObject _prev_bind_0_$16 = $sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_link_mt$.bind(mt_$20, thread);
                                                                                    SubLObject iteration_state_$21;
                                                                                    for (iteration_state_$21 = do_dictionary_contents_state(dictionary_contents(tv_links2)); NIL == do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = do_dictionary_contents_next(iteration_state_$21)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = do_dictionary_contents_key_value(iteration_state_$21);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$17 = $sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                $sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error(iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                $sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    do_dictionary_contents_finalize(iteration_state_$21);
                                                                                } finally {
                                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_error(FIVE_INTEGER, iterative_template_parser.$str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$18;
                                                                    final SubLObject new_list2 = cdolist_list_var_$18 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$18.first();
                                                                    while (NIL != cdolist_list_var_$18) {
                                                                        final SubLObject _prev_bind_0_$18 = $sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error(iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            $sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                                                        }
                                                                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                                        generating_fn2 = cdolist_list_var_$18.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            $genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                            $sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                        module_var2 = cdolist_list_var_$17.first();
                                                    } 
                                                    node_var_$3 = deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                $genl_inverse_mode_p$.rebind(_prev_bind_2_$12, thread);
                                                $sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                                $sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        } else {
                                            sbhl_warn(TWO_INTEGER, iterative_template_parser.$str48$Node__a_does_not_pass_sbhl_type_t, node_var, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        $sbhl_module$.rebind(_prev_bind_5, thread);
                                        $genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        $sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$11, thread);
                                        $sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                                        $sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                                    }
                                } finally {
                                    $relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                                    $sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                                }
                            } finally {
                                $relevant_mts$.rebind(_prev_bind_3, thread);
                                $relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                                $mt$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                    } finally {
                        $sbhl_space$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        free_sbhl_marking_space($sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                $sbhl_gather_space$.rebind(_prev_bind_2, thread);
                $sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return kills;
    }

    public static final SubLObject kill_syntactic_node_tree_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$syntacticDescendants;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
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
                                                        SubLObject done_var_46 = NIL;
                                                        SubLObject token_var_47 = NIL;
                                                        while (NIL == done_var_46) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_47);
                                                                SubLObject valid_48 = makeBoolean(token_var_47 != ass);
                                                                if (NIL != valid_48) {
                                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED));
                                                                }
                                                                done_var_46 = makeBoolean(NIL == valid_48);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_49, thread);
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
                    {
                        SubLObject pred_var = $$optionNodes;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
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
                                                        SubLObject done_var_50 = NIL;
                                                        SubLObject token_var_51 = NIL;
                                                        while (NIL == done_var_50) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_51);
                                                                SubLObject valid_52 = makeBoolean(token_var_51 != ass);
                                                                if (NIL != valid_52) {
                                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED));
                                                                }
                                                                done_var_50 = makeBoolean(NIL == valid_52);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
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
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return fi.fi_kill_int(self);
        }
    }

    public static SubLObject kill_syntactic_node_tree(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(iterative_template_parser.$$EverythingPSC, thread);
            SubLObject pred_var = iterative_template_parser.$$syntacticDescendants;
            if (NIL != do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
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
                                final SubLObject ass = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(ass));
                                if (NIL != valid_$47) {
                                    iterative_template_parser.kill_syntactic_node_tree(formula_arg2(assertion_formula(ass), UNPROVIDED));
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
            pred_var = iterative_template_parser.$$optionNodes;
            if (NIL != do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$46 = NIL;
                            final SubLObject token_var_$47 = NIL;
                            while (NIL == done_var_$46) {
                                final SubLObject ass = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(ass));
                                if (NIL != valid_$48) {
                                    iterative_template_parser.kill_syntactic_node_tree(formula_arg2(assertion_formula(ass), UNPROVIDED));
                                }
                                done_var_$46 = makeBoolean(NIL == valid_$48);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return fi_kill_int(self);
    }

    public static final SubLObject with_new_syntactic_kb_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    mt = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_54 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt55);
                            current_54 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt55);
                            if (NIL == member(current_54, $list_alt56, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_54 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt55);
                        }
                        {
                            SubLObject category_tail = property_list_member($CATEGORY, current);
                            SubLObject category = (NIL != category_tail) ? ((SubLObject) (cadr(category_tail))) : NIL;
                            SubLObject options_tail = property_list_member($OPTIONS, current);
                            SubLObject options = (NIL != options_tail) ? ((SubLObject) (cadr(options_tail))) : NIL;
                            SubLObject choice_tail = property_list_member($CHOICE, current);
                            SubLObject choice = (NIL != choice_tail) ? ((SubLObject) (cadr(choice_tail))) : NIL;
                            SubLObject source_tail = property_list_member($SOURCE, current);
                            SubLObject source = (NIL != source_tail) ? ((SubLObject) (cadr(source_tail))) : $$CycRecursiveTemplateParser;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject choice_cat = $sym63$CHOICE_CAT;
                                return list(CLET, list(list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, $list_alt69)), listS(CLET, list(list(node, list(FIF, choice, list(NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)))), list(PWHEN, list(FORT_P, source), list(FI_ASSERT_INT, list(LIST, $$syntacticNodeCreator, listS(LIST, $$InstanceWithRelationFromFn, list(LIST, $$ProgramCopyFn, source), $list_alt79), node), mt)), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject with_new_syntactic_kb_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list56);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list56);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$53 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, iterative_template_parser.$list56);
            current_$53 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, iterative_template_parser.$list56);
            if (NIL == member(current_$53, iterative_template_parser.$list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$53 == iterative_template_parser.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, iterative_template_parser.$list56);
        }
        final SubLObject category_tail = property_list_member($CATEGORY, current);
        final SubLObject category = (NIL != category_tail) ? cadr(category_tail) : NIL;
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : NIL;
        final SubLObject choice_tail = property_list_member($CHOICE, current);
        final SubLObject choice = (NIL != choice_tail) ? cadr(choice_tail) : NIL;
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : iterative_template_parser.$$CycRecursiveTemplateParser;
        final SubLObject body;
        current = body = temp;
        final SubLObject choice_cat = iterative_template_parser.$sym64$CHOICE_CAT;
        return list(CLET, list(list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, iterative_template_parser.$list70)), listS(CLET, list(list(node, list(FIF, choice, list(iterative_template_parser.NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(iterative_template_parser.NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)))), list(PWHEN, list(FORT_P, source), list(iterative_template_parser.FI_ASSERT_INT, list(LIST, iterative_template_parser.$$syntacticNodeCreator, listS(LIST, iterative_template_parser.$$InstanceWithRelationFromFn, list(LIST, iterative_template_parser.$$ProgramCopyFn, source), iterative_template_parser.$list80), node), mt)), append(body, NIL)));
    }

    public static final SubLObject with_new_syntactic_kb_node_wXgafs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node = NIL;
                    SubLObject mt = NIL;
                    SubLObject new_gafs = NIL;
                    SubLObject old_gafs = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    new_gafs = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    old_gafs = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_55 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            current_55 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            if (NIL == member(current_55, $list_alt56, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_55 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt80);
                        }
                        {
                            SubLObject category_tail = property_list_member($CATEGORY, current);
                            SubLObject category = (NIL != category_tail) ? ((SubLObject) (cadr(category_tail))) : NIL;
                            SubLObject options_tail = property_list_member($OPTIONS, current);
                            SubLObject options = (NIL != options_tail) ? ((SubLObject) (cadr(options_tail))) : NIL;
                            SubLObject choice_tail = property_list_member($CHOICE, current);
                            SubLObject choice = (NIL != choice_tail) ? ((SubLObject) (cadr(choice_tail))) : NIL;
                            SubLObject source_tail = property_list_member($SOURCE, current);
                            SubLObject source = (NIL != source_tail) ? ((SubLObject) (cadr(source_tail))) : $$CycRecursiveTemplateParser;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject test_gaf = $sym81$TEST_GAF;
                                SubLObject choice_cat = $sym82$CHOICE_CAT;
                                return list(CLET, list($list_alt83, list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, $list_alt69)), listS(CMULTIPLE_VALUE_BIND, list(node, new_gafs), list(FIF, choice, list(NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)), list(PWHEN, list(FORT_P, source), list(FI_ASSERT_INT, list(LIST, $$syntacticNodeCreator, listS(LIST, $$InstanceWithRelationFromFn, list(LIST, $$ProgramCopyFn, source), $list_alt79), node), mt)), list(CDOLIST, list(test_gaf, new_gafs), list(CPUSH, test_gaf, old_gafs)), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject with_new_syntactic_kb_node_wXgafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list81);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject mt = NIL;
        SubLObject new_gafs = NIL;
        SubLObject old_gafs = NIL;
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list81);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list81);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list81);
        new_gafs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list81);
        old_gafs = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$54 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, iterative_template_parser.$list81);
            current_$54 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, iterative_template_parser.$list81);
            if (NIL == member(current_$54, iterative_template_parser.$list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$54 == iterative_template_parser.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, iterative_template_parser.$list81);
        }
        final SubLObject category_tail = property_list_member($CATEGORY, current);
        final SubLObject category = (NIL != category_tail) ? cadr(category_tail) : NIL;
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : NIL;
        final SubLObject choice_tail = property_list_member($CHOICE, current);
        final SubLObject choice = (NIL != choice_tail) ? cadr(choice_tail) : NIL;
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : iterative_template_parser.$$CycRecursiveTemplateParser;
        final SubLObject body;
        current = body = temp;
        final SubLObject test_gaf = iterative_template_parser.$sym82$TEST_GAF;
        final SubLObject choice_cat = iterative_template_parser.$sym83$CHOICE_CAT;
        return list(CLET, list(iterative_template_parser.$list84, list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, iterative_template_parser.$list70)), listS(CMULTIPLE_VALUE_BIND, list(node, new_gafs), list(FIF, choice, list(iterative_template_parser.NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(iterative_template_parser.NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)), list(PWHEN, list(FORT_P, source), list(iterative_template_parser.FI_ASSERT_INT, list(LIST, iterative_template_parser.$$syntacticNodeCreator, listS(LIST, iterative_template_parser.$$InstanceWithRelationFromFn, list(LIST, iterative_template_parser.$$ProgramCopyFn, source), iterative_template_parser.$list80), node), mt)), list(CDOLIST, list(test_gaf, new_gafs), list(CPUSH, test_gaf, old_gafs)), append(body, NIL)));
    }

    public static final SubLObject syntactic_option_node_p_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject trueP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        trueP = list_utilities.sublisp_boolean(kb_mapping.gather_gaf_arg_index(v_term, TWO_INTEGER, $$optionNodes, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return trueP;
            }
        }
    }

    public static SubLObject syntactic_option_node_p(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trueP = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(iterative_template_parser.$$EverythingPSC, thread);
            trueP = sublisp_boolean(gather_gaf_arg_index(v_term, TWO_INTEGER, iterative_template_parser.$$optionNodes, UNPROVIDED, UNPROVIDED));
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return trueP;
    }

    /**
     * Provide quickie links for excluding the node as an option, or for reinstating it
     */
    @LispMethod(comment = "Provide quickie links for excluding the node as an option, or for reinstating it")
    public static final SubLObject cb_link_syntactic_node_toolkit_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping.gather_gaf_arg_index(v_term, TWO_INTEGER, $$excludedOptionNodes, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject frame_name_var = cb_frame_name($MAIN);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            cyc_cgi_url_int();
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt89$restore_syntactic_option__A, cb_fort_identifier(v_term));
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(frame_name_var);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str_alt90$_Restore_Syntactic_Option_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                    } else {
                        {
                            SubLObject frame_name_var = cb_frame_name($MAIN);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            cyc_cgi_url_int();
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt91$exclude_syntactic_option__A, cb_fort_identifier(v_term));
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(frame_name_var);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str_alt92$_Exclude_Syntactic_Option_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                }
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Provide quickie links for excluding the node as an option, or for reinstating it
     */
    @LispMethod(comment = "Provide quickie links for excluding the node as an option, or for reinstating it")
    public static SubLObject cb_link_syntactic_node_toolkit(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(iterative_template_parser.$$EverythingPSC, thread);
            if (NIL != gather_gaf_arg_index(v_term, TWO_INTEGER, iterative_template_parser.$$excludedOptionNodes, UNPROVIDED, UNPROVIDED)) {
                final SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup($html_anchor_head$.getGlobalValue());
                html_markup($html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format($html_stream$.getDynamicValue(thread), iterative_template_parser.$str90$restore_syntactic_option__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup($html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = $html_safe_print$.currentBinding(thread);
                try {
                    $html_safe_print$.bind(T, thread);
                    html_princ(iterative_template_parser.$str91$_Restore_Syntactic_Option_);
                } finally {
                    $html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup($html_anchor_tail$.getGlobalValue());
            } else {
                final SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup($html_anchor_head$.getGlobalValue());
                html_markup($html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format($html_stream$.getDynamicValue(thread), iterative_template_parser.$str92$exclude_syntactic_option__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup($html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = $html_safe_print$.currentBinding(thread);
                try {
                    $html_safe_print$.bind(T, thread);
                    html_princ(iterative_template_parser.$str93$_Exclude_Syntactic_Option_);
                } finally {
                    $html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup($html_anchor_tail$.getGlobalValue());
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject exclude_syntactic_option_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
                SubLObject assertion = NIL;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        assertion = kb_mapping.gather_gaf_arg_index(this_node, TWO_INTEGER, $$optionNodes, UNPROVIDED, UNPROVIDED).first();
                        if (NIL != assertion) {
                            result = fi.fi_assert_int(list($$excludedOptionNodes, cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), UNPROVIDED), this_node), assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
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

    public static SubLObject exclude_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
        SubLObject assertion = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(iterative_template_parser.$$EverythingPSC, thread);
            assertion = gather_gaf_arg_index(this_node, TWO_INTEGER, iterative_template_parser.$$optionNodes, UNPROVIDED, UNPROVIDED).first();
            if (NIL != assertion) {
                result = fi_assert_int(list(iterative_template_parser.$$excludedOptionNodes, formula_arg1(assertion_formula(assertion), UNPROVIDED), this_node), assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject restore_syntactic_option_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
                SubLObject assertion = NIL;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        assertion = kb_mapping.gather_gaf_arg_index(this_node, TWO_INTEGER, $$excludedOptionNodes, UNPROVIDED, UNPROVIDED).first();
                        if (NIL != assertion) {
                            result = fi.fi_unassert_int(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
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

    public static SubLObject restore_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
        SubLObject assertion = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(iterative_template_parser.$$EverythingPSC, thread);
            assertion = gather_gaf_arg_index(this_node, TWO_INTEGER, iterative_template_parser.$$excludedOptionNodes, UNPROVIDED, UNPROVIDED).first();
            if (NIL != assertion) {
                result = fi_unassert_int(assertion_formula(assertion), assertion_mt(assertion));
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Should the system try to assert parse-trees into the KB?
     */
    @LispMethod(comment = "Should the system try to assert parse-trees into the KB?")
    public static final SubLObject asserting_treesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($rtp_kb_parse_mt$.getDynamicValue(thread));
        }
    }

    /**
     * Should the system try to assert parse-trees into the KB?
     */
    @LispMethod(comment = "Should the system try to assert parse-trees into the KB?")
    public static SubLObject asserting_treesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_boolean(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
    }

    public static final SubLObject while_saving_rtp_parse_into_kb_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt98, append(body, NIL));
        }
    }

    public static SubLObject while_saving_rtp_parse_into_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, iterative_template_parser.$list100, append(body, NIL));
    }

    public static final SubLObject save_rtp_kb_parse_if_desired_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($rtp_latest_kb_parse_tree$.getDynamicValue(thread).eql($SAVE)) {
                $rtp_latest_kb_parse_tree$.setDynamicValue(node, thread);
                return node;
            }
            return NIL;
        }
    }

    public static SubLObject save_rtp_kb_parse_if_desired(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread).eql($SAVE)) {
            iterative_template_parser.$rtp_latest_kb_parse_tree$.setDynamicValue(node, thread);
            return node;
        }
        return NIL;
    }

    public static final SubLObject get_rtp_kb_parse_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rtp_latest_kb_parse_tree$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread);
    }

    public static final SubLObject get_and_erase_rtp_kb_parse_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node = $rtp_latest_kb_parse_tree$.getDynamicValue(thread);
                $rtp_latest_kb_parse_tree$.setDynamicValue(NIL, thread);
                return node;
            }
        }
    }

    public static SubLObject get_and_erase_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread);
        iterative_template_parser.$rtp_latest_kb_parse_tree$.setDynamicValue(NIL, thread);
        return node;
    }

    /**
     *
     *
     * @param OBJECT
     * 		; to store the result of @see setting-parse-root-node
     * @param TOKENIZATION
     * 		; defaults to *rtp-relevant-tokenization*
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\t; to store the result of @see setting-parse-root-node\r\n@param TOKENIZATION\r\n\t\t; defaults to *rtp-relevant-tokenization*")
    public static final SubLObject with_the_rtp_parse_tokenization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt101);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject save_here = NIL;
                    SubLObject offset = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    save_here = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    offset = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_PARSE_TOKENIZATION, list($rtp_relevant_tokenization$, $OFFSET, offset), list(PIF, $list_alt106, list(PROGN, listS(SETTING_PARSE_ROOT_NODE, list(save_here), append(body, NIL))), bq_cons(PROGN, append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt101);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OBJECT
     * 		; to store the result of @see setting-parse-root-node
     * @param TOKENIZATION
     * 		; defaults to *rtp-relevant-tokenization*
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\t; to store the result of @see setting-parse-root-node\r\n@param TOKENIZATION\r\n\t\t; defaults to *rtp-relevant-tokenization*")
    public static SubLObject with_the_rtp_parse_tokenization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject save_here = NIL;
        SubLObject offset = NIL;
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list103);
        save_here = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, iterative_template_parser.$list103);
        offset = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(iterative_template_parser.WITH_PARSE_TOKENIZATION, list(iterative_template_parser.$rtp_relevant_tokenization$, $OFFSET, offset), list(PIF, iterative_template_parser.$list108, list(PROGN, listS(iterative_template_parser.SETTING_PARSE_ROOT_NODE, list(save_here), append(body, NIL))), bq_cons(PROGN, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, iterative_template_parser.$list103);
        return NIL;
    }

    /**
     *
     *
     * @param STRINGP,
     * 		JOIN-TEMPLATE-COMPONENTS-P, or RESULT-OF-PARSING-FORMULA?
     * @param MICROTHEORY
     * 		; defaults to *rtp-kb-parse-mt*
     * @return a #$CycTokenization corresponding to that component
     * @unknown if this has to create the tokenization, it will arrange for things like #$tokenizationInputString
     */
    @LispMethod(comment = "@param STRINGP,\r\n\t\tJOIN-TEMPLATE-COMPONENTS-P, or RESULT-OF-PARSING-FORMULA?\r\n@param MICROTHEORY\r\n\t\t; defaults to *rtp-kb-parse-mt*\r\n@return a #$CycTokenization corresponding to that component\r\n@unknown if this has to create the tokenization, it will arrange for things like #$tokenizationInputString")
    public static final SubLObject rtp_component_tokenization_alt(SubLObject component, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rtp_kb_parse_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((component.isString() || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_p(component))) || (NIL != parsing_utilities.result_of_parsing_formulaP(component)))) {
                return NIL;
            }
            {
                SubLObject tokenization = dictionary.dictionary_lookup($rtp_component_tokenizations$.getGlobalValue(), component, UNPROVIDED);
                if (NIL == valid_constantP(tokenization, UNPROVIDED)) {
                    {
                        SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
                        SubLObject _prev_bind_1 = fi.$fi_warning$.currentBinding(thread);
                        try {
                            fi.$fi_error$.bind(NIL, thread);
                            fi.$fi_warning$.bind(NIL, thread);
                            {
                                SubLObject input_string = NIL;
                                if (component.isString()) {
                                    input_string = component;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_p(component)) {
                                        input_string = com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_word_list(component);
                                    } else {
                                        if (NIL != parsing_utilities.result_of_parsing_formulaP(component)) {
                                            input_string = parsing_utilities.result_of_parsing_words(component);
                                        }
                                    }
                                }
                                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) {
                                    tokenization = parsing_utilities.hypothesize_parse_tree_element($$CycTokenization, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                                    dictionary.dictionary_enter($rtp_component_tokenizations$.getGlobalValue(), component, tokenization);
                                    if ((NIL != tokenization) && (NIL != input_string)) {
                                        fi.fi_assert_int(list($$tokenizationInputString, tokenization, input_string), mt, UNPROVIDED, UNPROVIDED);
                                    }
                                    {
                                        SubLObject num = NIL;
                                        SubLObject list_var = NIL;
                                        SubLObject word = NIL;
                                        SubLObject n = NIL;
                                        for (list_var = rkf_concept_harvester.rkf_ch_string_tokenize(input_string), word = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , n = add(ONE_INTEGER, n)) {
                                            num = number_utilities.f_1X(n);
                                            {
                                                SubLObject kb_token = parsing_utilities.hypothesize_parse_tree_element($$CycParsingToken, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                                                fi.fi_assert_int(list($$tokenString, kb_token, word), mt, UNPROVIDED, UNPROVIDED);
                                                fi.fi_assert_int(list($$nthTokenInTokenization, tokenization, num, kb_token), mt, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        fi.fi_assert_int(list($$numberOfTokensInTokenization, tokenization, num), mt, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            fi.$fi_warning$.rebind(_prev_bind_1, thread);
                            fi.$fi_error$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return tokenization;
            }
        }
    }

    /**
     *
     *
     * @param STRINGP,
     * 		JOIN-TEMPLATE-COMPONENTS-P, or RESULT-OF-PARSING-FORMULA?
     * @param MICROTHEORY
     * 		; defaults to *rtp-kb-parse-mt*
     * @return a #$CycTokenization corresponding to that component
     * @unknown if this has to create the tokenization, it will arrange for things like #$tokenizationInputString
     */
    @LispMethod(comment = "@param STRINGP,\r\n\t\tJOIN-TEMPLATE-COMPONENTS-P, or RESULT-OF-PARSING-FORMULA?\r\n@param MICROTHEORY\r\n\t\t; defaults to *rtp-kb-parse-mt*\r\n@return a #$CycTokenization corresponding to that component\r\n@unknown if this has to create the tokenization, it will arrange for things like #$tokenizationInputString")
    public static SubLObject rtp_component_tokenization(final SubLObject component, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((!component.isString()) && (NIL == iterative_template_parser.join_template_components_p(component))) && (NIL == result_of_parsing_formulaP(component))) {
            return NIL;
        }
        SubLObject tokenization = dictionary_lookup(iterative_template_parser.$rtp_component_tokenizations$.getGlobalValue(), component, UNPROVIDED);
        if (NIL == valid_constantP(tokenization, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = $fi_error$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $fi_warning$.currentBinding(thread);
            try {
                $fi_error$.bind(NIL, thread);
                $fi_warning$.bind(NIL, thread);
                SubLObject input_string = NIL;
                if (component.isString()) {
                    input_string = component;
                } else
                    if (NIL != iterative_template_parser.join_template_components_p(component)) {
                        input_string = iterative_template_parser.join_template_components_word_list(component);
                    } else
                        if (NIL != result_of_parsing_formulaP(component)) {
                            input_string = result_of_parsing_words(component);
                        }


                if (NIL != iterative_template_parser.asserting_treesP()) {
                    tokenization = hypothesize_parse_tree_element(iterative_template_parser.$$CycTokenization, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                    dictionary_enter(iterative_template_parser.$rtp_component_tokenizations$.getGlobalValue(), component, tokenization);
                    if ((NIL != tokenization) && (NIL != input_string)) {
                        fi_assert_int(list(iterative_template_parser.$$tokenizationInputString, tokenization, input_string), mt, UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject num = NIL;
                    SubLObject list_var = NIL;
                    SubLObject word = NIL;
                    SubLObject n = NIL;
                    list_var = rkf_ch_string_tokenize(input_string);
                    word = list_var.first();
                    for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , n = add(ONE_INTEGER, n)) {
                        num = f_1X(n);
                        final SubLObject kb_token = hypothesize_parse_tree_element(iterative_template_parser.$$CycParsingToken, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                        fi_assert_int(list(iterative_template_parser.$$tokenString, kb_token, word), mt, UNPROVIDED, UNPROVIDED);
                        fi_assert_int(list(iterative_template_parser.$$nthTokenInTokenization, tokenization, num, kb_token), mt, UNPROVIDED, UNPROVIDED);
                    }
                    fi_assert_int(list(iterative_template_parser.$$numberOfTokensInTokenization, tokenization, num), mt, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                $fi_warning$.rebind(_prev_bind_2, thread);
                $fi_error$.rebind(_prev_bind_0, thread);
            }
        }
        return tokenization;
    }

    /**
     * The experimental version of itp-sequel.  This should be used for in-house testing, since it
     * clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of itp-sequel.  This should be used for in-house testing, since it\r\nclears all the caches that might need to be cleared.\nThe experimental version of itp-sequel.  This should be used for in-house testing, since it\nclears all the caches that might need to be cleared.")
    public static final SubLObject rtp_parse_exp_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    /**
     * The experimental version of itp-sequel.  This should be used for in-house testing, since it
     * clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of itp-sequel.  This should be used for in-house testing, since it\r\nclears all the caches that might need to be cleared.\nThe experimental version of itp-sequel.  This should be used for in-house testing, since it\nclears all the caches that might need to be cleared.")
    public static SubLObject rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    /**
     * The experimental version of itp-sequel that calls the vp-parser.  This should be used for in-house testing, since it clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of itp-sequel that calls the vp-parser.  This should be used for in-house testing, since it clears all the caches that might need to be cleared.")
    public static final SubLObject rtp_parse_exp_wXvpp_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answers = NIL;
                rtp_datastructures.reset_all_rtp_datastructure_caches();
                {
                    SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
                    try {
                        parsing_vars.$perform_vp_parser_expansion$.bind(T, thread);
                        answers = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
                    } finally {
                        parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
                    }
                }
                return answers;
            }
        }
    }

    /**
     * The experimental version of itp-sequel that calls the vp-parser.  This should be used for in-house testing, since it clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of itp-sequel that calls the vp-parser.  This should be used for in-house testing, since it clears all the caches that might need to be cleared.")
    public static SubLObject rtp_parse_exp_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        final SubLObject _prev_bind_0 = $perform_vp_parser_expansion$.currentBinding(thread);
        try {
            $perform_vp_parser_expansion$.bind(T, thread);
            answers = iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            $perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }

    /**
     * entry point to template parser that calls the vp-parser.  Note that this does not clear
     * all caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp
     */
    @LispMethod(comment = "entry point to template parser that calls the vp-parser.  Note that this does not clear\r\nall caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp\nentry point to template parser that calls the vp-parser.  Note that this does not clear\nall caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp")
    public static final SubLObject rtp_parse_wXvpp_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answers = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
                    try {
                        parsing_vars.$perform_vp_parser_expansion$.bind(T, thread);
                        answers = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
                    } finally {
                        parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
                    }
                }
                return answers;
            }
        }
    }

    /**
     * entry point to template parser that calls the vp-parser.  Note that this does not clear
     * all caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp
     */
    @LispMethod(comment = "entry point to template parser that calls the vp-parser.  Note that this does not clear\r\nall caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp\nentry point to template parser that calls the vp-parser.  Note that this does not clear\nall caches before doing the parse, in contrast to @xref rtp-parse-exp-w/vpp")
    public static SubLObject rtp_parse_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        final SubLObject _prev_bind_0 = $perform_vp_parser_expansion$.currentBinding(thread);
        try {
            $perform_vp_parser_expansion$.bind(T, thread);
            answers = iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            $perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }

    /**
     *
     *
     * @return (values ANSWERS . possibly a #$CycParseTree)
     */
    @LispMethod(comment = "@return (values ANSWERS . possibly a #$CycParseTree)")
    public static final SubLObject itp_sequel_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answers = NIL;
                SubLObject the_cyc_parse_tree = NIL;
                {
                    SubLObject _prev_bind_0 = rtp_vars.$rtp_semantic_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rtp_relevant_tokenization$.currentBinding(thread);
                    try {
                        rtp_vars.$rtp_semantic_mt$.bind(NIL != semantics_mt ? ((SubLObject) (semantics_mt)) : $$InferencePSC, thread);
                        rtp_vars.$rtp_syntactic_mt$.bind(syntax_mt, thread);
                        $rtp_relevant_tokenization$.bind(com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_component_tokenization(sentence, UNPROVIDED), thread);
                        {
                            SubLObject _prev_bind_0_58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_59 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                                if (NIL == genls.genlP(category, $$ParsingTemplateCategory, UNPROVIDED, UNPROVIDED)) {
                                    Errors.warn($str_alt116$_S_is_not_a_template_category__, category);
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_59, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_58, thread);
                            }
                        }
                        {
                            SubLObject state = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_itp_state(sentence, category, UNPROVIDED);
                            $last_itp_state_created$.setDynamicValue(state, thread);
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser.prime_itp_pump(state, syntax_mt);
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser.expand_itp_state_completely(state, syntax_mt);
                            answers = com.cyc.cycjava.cycl.rtp.iterative_template_parser.cat_itp(state);
                            if ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) && (NIL == $rtp_exhaustive_kb_parseP$.getDynamicValue(thread))) {
                                the_cyc_parse_tree = com.cyc.cycjava.cycl.rtp.iterative_template_parser.reify_itp(state);
                                if ((NIL != the_cyc_parse_tree) && (NIL != $rtp_relevant_tokenization$.getDynamicValue(thread))) {
                                    fi.fi_assert_int(list($$parseTreeOfTokenization, the_cyc_parse_tree, $rtp_relevant_tokenization$.getDynamicValue(thread)), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                }
                                com.cyc.cycjava.cycl.rtp.iterative_template_parser.save_rtp_kb_parse_if_desired(the_cyc_parse_tree);
                            }
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser.destroy_itp_state(state);
                        }
                    } finally {
                        $rtp_relevant_tokenization$.rebind(_prev_bind_2, thread);
                        rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_1, thread);
                        rtp_vars.$rtp_semantic_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                answers = rkf_concept_harvester.rkf_ch_simplify_assemble_phrases(answers);
                if (rtp_vars.$rtp_return_style$.getDynamicValue(thread) != $ASSERTION) {
                    answers = com.cyc.cycjava.cycl.rtp.iterative_template_parser.delete_duplicate_tp_results(answers);
                }
                return values(answers, the_cyc_parse_tree);
            }
        }
    }

    /**
     *
     *
     * @return (values ANSWERS . possibly a #$CycParseTree)
     */
    @LispMethod(comment = "@return (values ANSWERS . possibly a #$CycParseTree)")
    public static SubLObject itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject the_cyc_parse_tree = NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_semantic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = iterative_template_parser.$rtp_relevant_tokenization$.currentBinding(thread);
        try {
            rtp_vars.$rtp_semantic_mt$.bind(NIL != semantics_mt ? semantics_mt : iterative_template_parser.$$InferencePSC, thread);
            rtp_vars.$rtp_syntactic_mt$.bind(syntax_mt, thread);
            iterative_template_parser.$rtp_relevant_tokenization$.bind(iterative_template_parser.rtp_component_tokenization(sentence, UNPROVIDED), thread);
            rtp_initialize.possibly_initialize_and_populate_rtp(UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$57 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = $mt$.currentBinding(thread);
            try {
                $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                if (NIL == genlP(category, iterative_template_parser.$$ParsingTemplateCategory, UNPROVIDED, UNPROVIDED)) {
                    Errors.warn(iterative_template_parser.$str118$_S_is_not_a_template_category__, category);
                }
            } finally {
                $mt$.rebind(_prev_bind_1_$58, thread);
                $relevant_mt_function$.rebind(_prev_bind_0_$57, thread);
            }
            final SubLObject state = iterative_template_parser.new_itp_state(sentence, category, UNPROVIDED);
            iterative_template_parser.$last_itp_state_created$.setDynamicValue(state, thread);
            iterative_template_parser.prime_itp_pump(state, syntax_mt);
            iterative_template_parser.expand_itp_state_completely(state, syntax_mt);
            answers = iterative_template_parser.cat_itp(state);
            if ((NIL != iterative_template_parser.asserting_treesP()) && (NIL == iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread))) {
                the_cyc_parse_tree = iterative_template_parser.reify_itp(state);
                if ((NIL != the_cyc_parse_tree) && (NIL != iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread))) {
                    fi_assert_int(list(iterative_template_parser.$$parseTreeOfTokenization, the_cyc_parse_tree, iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread)), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                iterative_template_parser.save_rtp_kb_parse_if_desired(the_cyc_parse_tree);
            }
            iterative_template_parser.destroy_itp_state(state);
        } finally {
            iterative_template_parser.$rtp_relevant_tokenization$.rebind(_prev_bind_3, thread);
            rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_2, thread);
            rtp_vars.$rtp_semantic_mt$.rebind(_prev_bind_0, thread);
        }
        answers = rkf_ch_simplify_assemble_phrases(answers);
        if (rtp_vars.$rtp_return_style$.getDynamicValue(thread) != $ASSERTION) {
            answers = iterative_template_parser.delete_duplicate_tp_results(answers);
        }
        return values(answers, the_cyc_parse_tree);
    }

    /**
     * The experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it
     * clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it\r\nclears all the caches that might need to be cleared.\nThe experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it\nclears all the caches that might need to be cleared.")
    public static final SubLObject categorized_rtp_parse_exp_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.categorized_itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    /**
     * The experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it
     * clears all the caches that might need to be cleared.
     */
    @LispMethod(comment = "The experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it\r\nclears all the caches that might need to be cleared.\nThe experimental version of categorized-itp-sequel.  This should be used for in-house testing, since it\nclears all the caches that might need to be cleared.")
    public static SubLObject categorized_rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return iterative_template_parser.categorized_itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    /**
     * returns the assertions with each parse
     */
    @LispMethod(comment = "returns the assertions with each parse")
    public static final SubLObject categorized_itp_sequel_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
                    try {
                        rtp_vars.$rtp_return_style$.bind($ASSERTION, thread);
                        result = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
                    } finally {
                        rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * returns the assertions with each parse
     */
    @LispMethod(comment = "returns the assertions with each parse")
    public static SubLObject categorized_itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
        try {
            rtp_vars.$rtp_return_style$.bind($ASSERTION, thread);
            result = iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject delete_duplicate_tp_results_alt(SubLObject answers) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                result = cons(list(v_answer.first(), delete_duplicates(second(v_answer), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)), result);
            }
            return nreverse(result);
        }
    }

    public static SubLObject delete_duplicate_tp_results(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(v_answer.first(), delete_duplicates(second(v_answer), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * return just the rewrites of a given input, instead of all of the possible parses
     */
    @LispMethod(comment = "return just the rewrites of a given input, instead of all of the possible parses")
    public static final SubLObject itp_rewrite_alt(SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.rewrites_only(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt));
    }

    /**
     * return just the rewrites of a given input, instead of all of the possible parses
     */
    @LispMethod(comment = "return just the rewrites of a given input, instead of all of the possible parses")
    public static SubLObject itp_rewrite(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        return iterative_template_parser.rewrites_only(iterative_template_parser.itp_sequel(sentence, category, syntax_mt, semantics_mt));
    }

    /**
     * filter all the non-rewrite out of a set of answers from the template-parser
     *
     * @param ANSWERS
     * 		list; a list of parsing results, in the format output by ITP-SEQUEL
     * @return list; a list of parsing results, in the format output by ITP-SEQUEL
     */
    @LispMethod(comment = "filter all the non-rewrite out of a set of answers from the template-parser\r\n\r\n@param ANSWERS\r\n\t\tlist; a list of parsing results, in the format output by ITP-SEQUEL\r\n@return list; a list of parsing results, in the format output by ITP-SEQUEL")
    public static final SubLObject rewrites_only_alt(SubLObject answers) {
        {
            SubLObject result = NIL;
            SubLObject rewrites = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                rewrites = com.cyc.cycjava.cycl.rtp.iterative_template_parser.rewrites_helper(second(v_answer));
                if (NIL != rewrites) {
                    result = cons(list(v_answer.first(), rewrites), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * filter all the non-rewrite out of a set of answers from the template-parser
     *
     * @param ANSWERS
     * 		list; a list of parsing results, in the format output by ITP-SEQUEL
     * @return list; a list of parsing results, in the format output by ITP-SEQUEL
     */
    @LispMethod(comment = "filter all the non-rewrite out of a set of answers from the template-parser\r\n\r\n@param ANSWERS\r\n\t\tlist; a list of parsing results, in the format output by ITP-SEQUEL\r\n@return list; a list of parsing results, in the format output by ITP-SEQUEL")
    public static SubLObject rewrites_only(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject rewrites = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rewrites = iterative_template_parser.rewrites_helper(second(v_answer));
            if (NIL != rewrites) {
                result = cons(list(v_answer.first(), rewrites), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * remove all sentences that don't start with #$RewriteSequenceFn.
     *
     * @param ANSWERS
     * 		list; a list of CycL sentences
     * @return list; a list of CycL sentences, a subset of ANSWERS
     */
    @LispMethod(comment = "remove all sentences that don\'t start with #$RewriteSequenceFn.\r\n\r\n@param ANSWERS\r\n\t\tlist; a list of CycL sentences\r\n@return list; a list of CycL sentences, a subset of ANSWERS")
    public static final SubLObject rewrites_helper_alt(SubLObject answers) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                if (cycl_utilities.formula_arg0(v_answer) == $$RewriteSequenceFn) {
                    result = cons(v_answer, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * remove all sentences that don't start with #$RewriteSequenceFn.
     *
     * @param ANSWERS
     * 		list; a list of CycL sentences
     * @return list; a list of CycL sentences, a subset of ANSWERS
     */
    @LispMethod(comment = "remove all sentences that don\'t start with #$RewriteSequenceFn.\r\n\r\n@param ANSWERS\r\n\t\tlist; a list of CycL sentences\r\n@return list; a list of CycL sentences, a subset of ANSWERS")
    public static SubLObject rewrites_helper(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (formula_arg0(v_answer).eql(iterative_template_parser.$$RewriteSequenceFn)) {
                result = cons(v_answer, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject itp_nuke_syntactic_nodes_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$ToyParseTreeMt_FullSentences;
        }
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.kb_nodes_kill(mt);
    }

    public static SubLObject itp_nuke_syntactic_nodes(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = iterative_template_parser.$$ToyParseTreeMt_FullSentences;
        }
        return iterative_template_parser.kb_nodes_kill(mt);
    }

    public static final SubLObject itp_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.iterative_template_parser.print_itp_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        iterative_template_parser.print_itp_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native.class ? T : NIL;
    }

    public static final SubLObject itp_node_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject itp_node_id(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_node_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField3();
    }

    public static SubLObject itp_node_parent(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_node_component_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField4();
    }

    public static SubLObject itp_node_component(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject itp_node_span_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField5();
    }

    public static SubLObject itp_node_span(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject itp_node_new_parse_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField6();
    }

    public static SubLObject itp_node_new_parse(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject itp_node_assertion_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField7();
    }

    public static SubLObject itp_node_assertion(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject itp_node_children_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField8();
    }

    public static SubLObject itp_node_children(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject itp_node_permutations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField9();
    }

    public static SubLObject itp_node_permutations(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject itp_node_syntactic_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField10();
    }

    public static SubLObject itp_node_syntactic_node(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject itp_node_syntactic_choices_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.getField11();
    }

    public static SubLObject itp_node_syntactic_choices(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject _csetf_itp_node_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_node_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_node_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_node_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_node_component_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_node_component(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_itp_node_span_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_node_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_itp_node_new_parse_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_itp_node_new_parse(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_itp_node_assertion_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_itp_node_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_itp_node_children_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_itp_node_children(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_itp_node_permutations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_itp_node_permutations(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_itp_node_syntactic_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_itp_node_syntactic_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_itp_node_syntactic_choices_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_NODE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_itp_node_syntactic_choices(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_node_p(v_object) : "! iterative_template_parser.itp_node_p(v_object) " + "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject make_itp_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PARENT)) {
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_parent(v_new, current_value);
                        } else {
                            if (pcase_var.eql($COMPONENT)) {
                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_component(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SPAN)) {
                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_span(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NEW_PARSE)) {
                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_new_parse(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ASSERTION)) {
                                            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_assertion(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($CHILDREN)) {
                                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_children(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PERMUTATIONS)) {
                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_permutations(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($SYNTACTIC_NODE)) {
                                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($SYNTACTIC_CHOICES)) {
                                                            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_choices(v_new, current_value);
                                                        } else {
                                                            Errors.error($str_alt158$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_itp_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                iterative_template_parser._csetf_itp_node_id(v_new, current_value);
            } else
                if (pcase_var.eql($PARENT)) {
                    iterative_template_parser._csetf_itp_node_parent(v_new, current_value);
                } else
                    if (pcase_var.eql($COMPONENT)) {
                        iterative_template_parser._csetf_itp_node_component(v_new, current_value);
                    } else
                        if (pcase_var.eql($SPAN)) {
                            iterative_template_parser._csetf_itp_node_span(v_new, current_value);
                        } else
                            if (pcase_var.eql($NEW_PARSE)) {
                                iterative_template_parser._csetf_itp_node_new_parse(v_new, current_value);
                            } else
                                if (pcase_var.eql($ASSERTION)) {
                                    iterative_template_parser._csetf_itp_node_assertion(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CHILDREN)) {
                                        iterative_template_parser._csetf_itp_node_children(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PERMUTATIONS)) {
                                            iterative_template_parser._csetf_itp_node_permutations(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SYNTACTIC_NODE)) {
                                                iterative_template_parser._csetf_itp_node_syntactic_node(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SYNTACTIC_CHOICES)) {
                                                    iterative_template_parser._csetf_itp_node_syntactic_choices(v_new, current_value);
                                                } else {
                                                    Errors.error(iterative_template_parser.$str161$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, iterative_template_parser.MAKE_ITP_NODE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, iterative_template_parser.itp_node_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, iterative_template_parser.itp_node_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPONENT, iterative_template_parser.itp_node_component(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, iterative_template_parser.itp_node_span(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_PARSE, iterative_template_parser.itp_node_new_parse(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION, iterative_template_parser.itp_node_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILDREN, iterative_template_parser.itp_node_children(obj));
        funcall(visitor_fn, obj, $SLOT, $PERMUTATIONS, iterative_template_parser.itp_node_permutations(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_NODE, iterative_template_parser.itp_node_syntactic_node(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_CHOICES, iterative_template_parser.itp_node_syntactic_choices(obj));
        funcall(visitor_fn, obj, $END, iterative_template_parser.MAKE_ITP_NODE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return iterative_template_parser.visit_defstruct_itp_node(obj, visitor_fn);
    }

    public static final SubLObject print_itp_node_alt(SubLObject itp_node, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(itp_node, stream);
            } else {
                {
                    SubLObject v_object = itp_node;
                    SubLObject stream_60 = stream;
                    write_string($str_alt159$__, stream_60, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_60 });
                    write_char(CHAR_space, stream_60);
                    princ(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_id(itp_node), stream);
                    princ($str_alt161$_, stream);
                    princ(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(itp_node), stream);
                    if (NIL != $rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                        format(stream, $str_alt162$__);
                    } else {
                        princ($str_alt161$_, stream);
                    }
                    prin1(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(itp_node), stream);
                    princ($str_alt161$_, stream);
                    prin1(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(itp_node), stream);
                    write_char(CHAR_space, stream_60);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_60, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_60);
                }
            }
            return itp_node;
        }
    }

    public static SubLObject print_itp_node(final SubLObject itp_node, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(itp_node, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, itp_node, T, T);
            princ(iterative_template_parser.itp_node_id(itp_node), stream);
            princ(iterative_template_parser.$$$_, stream);
            princ(iterative_template_parser.itp_node_component(itp_node), stream);
            if (NIL != iterative_template_parser.$rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                format(stream, iterative_template_parser.$str168$__);
            } else {
                princ(iterative_template_parser.$$$_, stream);
            }
            prin1(iterative_template_parser.itp_node_new_parse(itp_node), stream);
            princ(iterative_template_parser.$$$_, stream);
            prin1(iterative_template_parser.itp_node_syntactic_node(itp_node), stream);
            print_macros.print_unreadable_object_postamble(stream, itp_node, T, T);
        }
        return itp_node;
    }

    public static final SubLObject construct_itp_node_alt(SubLObject parent, SubLObject span, SubLObject component, SubLObject assertion, SubLObject id) {
        {
            SubLObject self = com.cyc.cycjava.cycl.rtp.iterative_template_parser.make_itp_node(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_id(self, id);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_parent(self, parent);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_span(self, span);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_component(self, component);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_assertion(self, assertion);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_new_parse(self, NIL);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_children(self, NIL);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_permutations(self, NIL);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(self, NIL);
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_choices(self, NIL);
            return self;
        }
    }

    public static SubLObject construct_itp_node(final SubLObject parent, final SubLObject span, final SubLObject component, final SubLObject assertion, final SubLObject id) {
        final SubLObject self = iterative_template_parser.make_itp_node(UNPROVIDED);
        iterative_template_parser._csetf_itp_node_id(self, id);
        iterative_template_parser._csetf_itp_node_parent(self, parent);
        iterative_template_parser._csetf_itp_node_span(self, span);
        iterative_template_parser._csetf_itp_node_component(self, component);
        iterative_template_parser._csetf_itp_node_assertion(self, assertion);
        iterative_template_parser._csetf_itp_node_new_parse(self, NIL);
        iterative_template_parser._csetf_itp_node_children(self, NIL);
        iterative_template_parser._csetf_itp_node_permutations(self, NIL);
        iterative_template_parser._csetf_itp_node_syntactic_node(self, NIL);
        iterative_template_parser._csetf_itp_node_syntactic_choices(self, NIL);
        return self;
    }

    public static final SubLObject add_itp_node_child_alt(SubLObject self, SubLObject child, SubLObject kb_node) {
        if (kb_node == UNPROVIDED) {
            kb_node = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject children = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(self);
                children = cons(child, children);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_children(self, children);
            }
            if (NIL != kb_node) {
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(child, kb_node);
                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) {
                    {
                        SubLObject parental_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self);
                        if (NIL != parental_node) {
                            parsing_utilities.syntactic_node_add_dtr(parental_node, kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                        }
                    }
                }
            }
            return self;
        }
    }

    public static SubLObject add_itp_node_child(final SubLObject self, final SubLObject child, SubLObject kb_node) {
        if (kb_node == UNPROVIDED) {
            kb_node = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject children = iterative_template_parser.itp_node_children(self);
        children = cons(child, children);
        iterative_template_parser._csetf_itp_node_children(self, children);
        if (NIL != kb_node) {
            iterative_template_parser._csetf_itp_node_syntactic_node(child, kb_node);
            if (NIL != iterative_template_parser.asserting_treesP()) {
                final SubLObject parental_node = iterative_template_parser.itp_node_syntactic_node(self);
                if (NIL != parental_node) {
                    syntactic_node_add_dtr(parental_node, kb_node, NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                }
            }
        }
        return self;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param LISTP
     * 		; presumably a subset of node's children
     * @param CATEGORY
     * 		
     * @return new ITP-NODE-P covering the span preceding the list of children
     * @unknown this function assumes that if self's span is (X ... Y ... Z), then the children passed to it
    cover just Y ... Z, and that we want a node covering X ... Y-1
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param LISTP\r\n\t\t; presumably a subset of node\'s children\r\n@param CATEGORY\r\n\t\t\r\n@return new ITP-NODE-P covering the span preceding the list of children\r\n@unknown this function assumes that if self\'s span is (X ... Y ... Z), then the children passed to it\r\ncover just Y ... Z, and that we want a node covering X ... Y-1")
    public static final SubLObject itp_node_create_initial_head_alt(SubLObject self, SubLObject gene_pool, SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(self, ITP_NODE_P);
            SubLTrampolineFile.checkType(gene_pool, PROPER_LIST_P);
            {
                SubLObject my_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self);
                SubLObject new_itp_node = NIL;
                SubLObject the_span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.initial_span_gap(self, gene_pool);
                if (NIL == my_node) {
                    return NIL;
                }
                {
                    SubLObject choice_cat = cat;
                    SubLObject head_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), cat, UNPROVIDED);
                    if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                        fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), head_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                    parsing_utilities.syntactic_node_add_head_dtr(my_node, head_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                    new_itp_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.construct_itp_node(self, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(self), cat, NIL, NIL);
                }
                return new_itp_node;
            }
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param LISTP
     * 		; presumably a subset of node's children
     * @param CATEGORY
     * 		
     * @return new ITP-NODE-P covering the span preceding the list of children
     * @unknown this function assumes that if self's span is (X ... Y ... Z), then the children passed to it
    cover just Y ... Z, and that we want a node covering X ... Y-1
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param LISTP\r\n\t\t; presumably a subset of node\'s children\r\n@param CATEGORY\r\n\t\t\r\n@return new ITP-NODE-P covering the span preceding the list of children\r\n@unknown this function assumes that if self\'s span is (X ... Y ... Z), then the children passed to it\r\ncover just Y ... Z, and that we want a node covering X ... Y-1")
    public static SubLObject itp_node_create_initial_head(final SubLObject self, final SubLObject gene_pool, final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterative_template_parser.itp_node_p(self) : "! iterative_template_parser.itp_node_p(self) " + ("iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) ") + self;
        assert NIL != proper_list_p(gene_pool) : "! list_utilities.proper_list_p(gene_pool) " + ("list_utilities.proper_list_p(gene_pool) " + "CommonSymbols.NIL != list_utilities.proper_list_p(gene_pool) ") + gene_pool;
        final SubLObject my_node = iterative_template_parser.itp_node_syntactic_node(self);
        SubLObject new_itp_node = NIL;
        final SubLObject the_span = iterative_template_parser.initial_span_gap(self, gene_pool);
        if (NIL == my_node) {
            return NIL;
        }
        final SubLObject head_node = iterative_template_parser.new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), cat, UNPROVIDED);
        if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
            fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), head_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        syntactic_node_add_head_dtr(my_node, head_node, NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        new_itp_node = iterative_template_parser.construct_itp_node(self, iterative_template_parser.itp_node_span(self), cat, NIL, NIL);
        return new_itp_node;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return a subset of its children which are deemed (potentially) useful
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return a subset of its children which are deemed (potentially) useful")
    public static final SubLObject itp_node_get_legitimate_children_alt(SubLObject self) {
        {
            SubLObject valid_children = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(self);
            SubLObject this_child = NIL;
            for (this_child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_child = cdolist_list_var.first()) {
                {
                    SubLObject the_parse = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(this_child);
                    if (NIL != parsing_utilities.vp_parse_from_pspP(the_parse)) {
                        valid_children = cons(this_child, valid_children);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_get_legitimate_children(this_child)) {
                            valid_children = cons(this_child, valid_children);
                        } else {
                            if (!(((NIL != parsing_utilities.result_of_parsing_formulaP(the_parse)) || ((NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), $$NLFunction)) && (NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), $$NLTaggedTermDenotingFunction)))) || parsing_utilities.result_of_parsing_category(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(this_child)).eql($$isa))) {
                                valid_children = cons(this_child, valid_children);
                            }
                        }
                    }
                }
            }
            if ((NIL != list_utilities.proper_list_p(valid_children)) && (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.full_span_coverageP(self, valid_children))) {
                {
                    SubLObject my_parse = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(self);
                    SubLObject my_component = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(self);
                    if ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_p(my_parse)) || cycl_utilities.formula_arg0(my_parse).eql($$TheRNPParse)) {
                        return NIL;
                    }
                    if ((NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) && (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.verb_phrasal_template_categoryP(parsing_utilities.result_of_parsing_category(my_component)))) {
                        {
                            SubLObject vbars = ask_utilities.ask_variable($sym170$_VBAR, listS($$and, list($$memberOfList, $sym172$_CHILD, bq_cons($$TheList, Mapping.mapcar(ITP_NODE_SYNTACTIC_NODE, valid_children))), $list_alt174), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject head_itp_node = NIL;
                            SubLObject my_kb_node = NIL;
                            if (NIL != list_utilities.singletonP(vbars)) {
                                my_kb_node = vbars.first();
                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(self, my_kb_node);
                                {
                                    SubLObject head_verb = ask_utilities.ask_variable($sym175$_V, listS($$and, listS($$syntacticDaughters, my_kb_node, $list_alt177), $list_alt178), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != list_utilities.singletonP(head_verb)) {
                                        head_itp_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.construct_itp_node(self, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(self), $$Verb, NIL, NIL);
                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(head_itp_node, head_verb.first());
                                    }
                                }
                            }
                            if (((NIL == head_itp_node) && (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.extended_vbar_template_categoryP(parsing_utilities.result_of_parsing_category(my_component)))) && (NIL == ask_utilities.ask_variable($sym13$_NODE, listS($$and, listS($$syntacticNodeNthDaughter, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self), $list_alt181), $list_alt182), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                head_itp_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_create_initial_head(self, valid_children, $$Verb);
                            }
                            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(head_itp_node)) {
                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_new_parse(head_itp_node, cycl_utilities.formula_arg0(my_parse));
                                valid_children = cons(head_itp_node, valid_children);
                            }
                        }
                    }
                }
            }
            return valid_children;
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return a subset of its children which are deemed (potentially) useful
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return a subset of its children which are deemed (potentially) useful")
    public static SubLObject itp_node_get_legitimate_children(final SubLObject self) {
        SubLObject valid_children = NIL;
        SubLObject cdolist_list_var = iterative_template_parser.itp_node_children(self);
        SubLObject this_child = NIL;
        this_child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject the_parse = iterative_template_parser.itp_node_new_parse(this_child);
            if (NIL != vp_parse_from_pspP(the_parse)) {
                valid_children = cons(this_child, valid_children);
            } else
                if (NIL != iterative_template_parser.itp_node_get_legitimate_children(this_child)) {
                    valid_children = cons(this_child, valid_children);
                } else
                    if (((NIL == result_of_parsing_formulaP(the_parse)) && ((NIL == isa_in_any_mtP(formula_arg0(the_parse), iterative_template_parser.$$NLFunction)) || (NIL != isa_in_any_mtP(formula_arg0(the_parse), iterative_template_parser.$$NLTaggedTermDenotingFunction)))) && (!result_of_parsing_category(iterative_template_parser.itp_node_component(this_child)).eql(iterative_template_parser.$$VPTemplate))) {
                        valid_children = cons(this_child, valid_children);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        } 
        if ((NIL != proper_list_p(valid_children)) && (NIL == iterative_template_parser.full_span_coverageP(self, valid_children))) {
            final SubLObject my_parse = iterative_template_parser.itp_node_new_parse(self);
            final SubLObject my_component = iterative_template_parser.itp_node_component(self);
            if ((NIL != iterative_template_parser.join_template_components_p(my_parse)) || formula_arg0(my_parse).eql(iterative_template_parser.$$TheRNPParse)) {
                return NIL;
            }
            if ((NIL != result_of_parsing_formulaP(my_component)) && (NIL != iterative_template_parser.verb_phrasal_template_categoryP(result_of_parsing_category(my_component)))) {
                final SubLObject vbars = ask_utilities.ask_variable(iterative_template_parser.$sym176$_VBAR, listS(iterative_template_parser.$$and, list(iterative_template_parser.$$memberOfList, iterative_template_parser.$sym178$_CHILD, bq_cons(iterative_template_parser.$$TheList, Mapping.mapcar(iterative_template_parser.ITP_NODE_SYNTACTIC_NODE, valid_children))), iterative_template_parser.$list180), iterative_template_parser.$$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject head_itp_node = NIL;
                SubLObject my_kb_node = NIL;
                if (NIL != singletonP(vbars)) {
                    my_kb_node = vbars.first();
                    iterative_template_parser._csetf_itp_node_syntactic_node(self, my_kb_node);
                    final SubLObject head_verb = ask_utilities.ask_variable(iterative_template_parser.$sym181$_V, listS(iterative_template_parser.$$and, listS(iterative_template_parser.$$syntacticDaughters, my_kb_node, iterative_template_parser.$list183), iterative_template_parser.$list184), iterative_template_parser.$$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != singletonP(head_verb)) {
                        head_itp_node = iterative_template_parser.construct_itp_node(self, iterative_template_parser.itp_node_span(self), iterative_template_parser.$$Verb, NIL, NIL);
                        iterative_template_parser._csetf_itp_node_syntactic_node(head_itp_node, head_verb.first());
                    }
                }
                if (((NIL == head_itp_node) && (NIL != iterative_template_parser.extended_vbar_template_categoryP(result_of_parsing_category(my_component)))) && (NIL == ask_utilities.ask_variable(iterative_template_parser.$sym13$_NODE, listS(iterative_template_parser.$$and, listS(iterative_template_parser.$$syntacticNodeNthDaughter, iterative_template_parser.itp_node_syntactic_node(self), iterative_template_parser.$list187), iterative_template_parser.$list188), iterative_template_parser.$$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    head_itp_node = iterative_template_parser.itp_node_create_initial_head(self, valid_children, iterative_template_parser.$$Verb);
                }
                if (NIL != iterative_template_parser.itp_node_p(head_itp_node)) {
                    iterative_template_parser._csetf_itp_node_new_parse(head_itp_node, formula_arg0(my_parse));
                    valid_children = cons(head_itp_node, valid_children);
                }
            }
        }
        return valid_children;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return a list of gafs establishing its syntactic-choices in the KB
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return a list of gafs establishing its syntactic-choices in the KB")
    public static final SubLObject itp_node_get_dominance_gafs_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self)) {
                {
                    SubLObject gafs = NIL;
                    SubLObject my_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self);
                    if (NIL == my_node) {
                        return NIL;
                    }
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self)));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject node_and_children = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                gafs = cons(list($$optionNodes, my_node, node_and_children.first()), gafs);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    return gafs;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return a list of gafs establishing its syntactic-choices in the KB
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return a list of gafs establishing its syntactic-choices in the KB")
    public static SubLObject itp_node_get_dominance_gafs(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == iterative_template_parser.itp_node_syntactic_choices(self)) {
            return NIL;
        }
        SubLObject gafs = NIL;
        final SubLObject my_node = iterative_template_parser.itp_node_syntactic_node(self);
        if (NIL == my_node) {
            return NIL;
        }
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(iterative_template_parser.itp_node_syntactic_choices(self))); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject component = do_dictionary_contents_key_value(iteration_state);
            final SubLObject node_and_children = thread.secondMultipleValue();
            thread.resetMultipleValues();
            gafs = cons(list(iterative_template_parser.$$optionNodes, my_node, node_and_children.first()), gafs);
        }
        do_dictionary_contents_finalize(iteration_state);
        return gafs;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.
    if present, just initialize components using this (and its specs)
     * @unknown wipes out the subset of syntactic-choices relevant to category (i.e., the whole thing if no category)
     * @unknown consider killing the choice nodes in the KB
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.\r\nif present, just initialize components using this (and its specs)\r\n@unknown wipes out the subset of syntactic-choices relevant to category (i.e., the whole thing if no category)\r\n@unknown consider killing the choice nodes in the KB")
    public static final SubLObject itp_node_clear_syntactic_choices_alt(SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self)) {
            if (NIL != cat) {
                {
                    SubLObject cdolist_list_var = dictionary.dictionary_keys(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self));
                    SubLObject key = NIL;
                    for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                        if (NIL != genls.genlP(key, cat, $$TemplateParsingMt, UNPROVIDED)) {
                            dictionary.dictionary_enter(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self), key, NIL);
                        }
                    }
                }
            } else {
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_choices(self, dictionary.new_dictionary(EQL, UNPROVIDED));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.
    if present, just initialize components using this (and its specs)
     * @unknown wipes out the subset of syntactic-choices relevant to category (i.e., the whole thing if no category)
     * @unknown consider killing the choice nodes in the KB
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.\r\nif present, just initialize components using this (and its specs)\r\n@unknown wipes out the subset of syntactic-choices relevant to category (i.e., the whole thing if no category)\r\n@unknown consider killing the choice nodes in the KB")
    public static SubLObject itp_node_clear_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        if (NIL != iterative_template_parser.itp_node_syntactic_choices(self)) {
            if (NIL != cat) {
                SubLObject cdolist_list_var = dictionary_keys(iterative_template_parser.itp_node_syntactic_choices(self));
                SubLObject key = NIL;
                key = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != genlP(key, cat, iterative_template_parser.$$TemplateParsingMt, UNPROVIDED)) {
                        dictionary_enter(iterative_template_parser.itp_node_syntactic_choices(self), key, NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    key = cdolist_list_var.first();
                } 
            } else {
                iterative_template_parser._csetf_itp_node_syntactic_choices(self, new_dictionary(EQL, UNPROVIDED));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.
    if present, just initialize components using this (and its specs)
     * @return value 1: whether any #$SyntacticChoiceNodes should be created
    value 2: if so, any definitional gafs needed to establish them
     * @unknown calls @see itp-node-initialize-syntactic-choices
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.\r\nif present, just initialize components using this (and its specs)\r\n@return value 1: whether any #$SyntacticChoiceNodes should be created\r\nvalue 2: if so, any definitional gafs needed to establish them\r\n@unknown calls @see itp-node-initialize-syntactic-choices")
    public static final SubLObject itp_node_initialize_syntactic_choices_alt(SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject offspring = dictionary.new_dictionary(EQL, UNPROVIDED);
                SubLObject valid_children = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_get_legitimate_children(self);
                SubLObject return_gafs = NIL;
                com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_clear_syntactic_choices(self, cat);
                {
                    SubLObject cdolist_list_var = valid_children;
                    SubLObject this_child = NIL;
                    for (this_child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_child = cdolist_list_var.first()) {
                        {
                            SubLObject this_comp = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(this_child);
                            if (NIL != parsing_utilities.result_of_parsing_formulaP(this_comp)) {
                                {
                                    SubLObject raw_cat = parsing_utilities.result_of_parsing_category(this_comp);
                                    SubLObject high_cat = parsing_utilities.result_of_parsing_highest_category(this_comp, cat);
                                    if ((NIL == cat) || (NIL != genls.genl_in_any_mtP(raw_cat, cat))) {
                                        dictionary.dictionary_enter(offspring, high_cat, cons(this_child, dictionary.dictionary_lookup(offspring, high_cat, UNPROVIDED)));
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != list_utilities.lengthG(dictionary.dictionary_keys(offspring), ONE_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject new_nodes = NIL;
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(offspring));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject kids = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding(thread);
                                    try {
                                        $kb_node_gathering_modeP$.bind(T, thread);
                                        {
                                            SubLObject choice_cat = category;
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), category, UNPROVIDED);
                                                SubLObject ignore_this = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                                    fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                }
                                                {
                                                    SubLObject cdolist_list_var = ignore_this;
                                                    SubLObject test_gaf = NIL;
                                                    for (test_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_gaf = cdolist_list_var.first()) {
                                                        return_gafs = cons(test_gaf, return_gafs);
                                                    }
                                                }
                                                dictionary.dictionary_enter(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self), category, cons(node, kids));
                                                new_nodes = cons(node, new_nodes);
                                            }
                                        }
                                    } finally {
                                        $kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        {
                            SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding(thread);
                            try {
                                $kb_node_gathering_modeP$.bind(T, thread);
                                {
                                    SubLObject choice_cat = NIL;
                                    if (NIL == choice_cat) {
                                        choice_cat = $$SyntacticChoiceNode;
                                    }
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject choice_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_choice_node($rtp_kb_parse_mt$.getDynamicValue(thread), new_nodes, choice_cat, UNPROVIDED);
                                        SubLObject ignore_this = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                            fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), choice_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        }
                                        {
                                            SubLObject cdolist_list_var = ignore_this;
                                            SubLObject test_gaf = NIL;
                                            for (test_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_gaf = cdolist_list_var.first()) {
                                                return_gafs = cons(test_gaf, return_gafs);
                                            }
                                        }
                                        parsing_utilities.syntactic_node_add_dtr(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self), choice_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                                    }
                                }
                            } finally {
                                $kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(T, return_gafs);
            }
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.
    if present, just initialize components using this (and its specs)
     * @return value 1: whether any #$SyntacticChoiceNodes should be created
    value 2: if so, any definitional gafs needed to establish them
     * @unknown calls @see itp-node-initialize-syntactic-choices
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@unknown spec of #$ParsingTemplateCategory - e.g., #$VPTemplate or #$RTPVBarTemplate.\r\nif present, just initialize components using this (and its specs)\r\n@return value 1: whether any #$SyntacticChoiceNodes should be created\r\nvalue 2: if so, any definitional gafs needed to establish them\r\n@unknown calls @see itp-node-initialize-syntactic-choices")
    public static SubLObject itp_node_initialize_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject offspring = new_dictionary(EQL, UNPROVIDED);
        final SubLObject valid_children = iterative_template_parser.itp_node_get_legitimate_children(self);
        SubLObject return_gafs = NIL;
        iterative_template_parser.itp_node_clear_syntactic_choices(self, cat);
        SubLObject cdolist_list_var = valid_children;
        SubLObject this_child = NIL;
        this_child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_comp = iterative_template_parser.itp_node_component(this_child);
            if (NIL != result_of_parsing_formulaP(this_comp)) {
                final SubLObject raw_cat = result_of_parsing_category(this_comp);
                final SubLObject high_cat = result_of_parsing_highest_category(this_comp, cat);
                if ((NIL == cat) || (NIL != genl_in_any_mtP(raw_cat, cat))) {
                    dictionary_enter(offspring, high_cat, cons(this_child, dictionary_lookup(offspring, high_cat, UNPROVIDED)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        } 
        if (NIL != lengthG(dictionary_keys(offspring), ONE_INTEGER, UNPROVIDED)) {
            SubLObject new_nodes = NIL;
            SubLObject iteration_state;
            for (iteration_state = do_dictionary_contents_state(dictionary_contents(offspring)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject category = do_dictionary_contents_key_value(iteration_state);
                final SubLObject kids = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
                try {
                    iterative_template_parser.$kb_node_gathering_modeP$.bind(T, thread);
                    final SubLObject choice_cat = category;
                    thread.resetMultipleValues();
                    final SubLObject node = iterative_template_parser.new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), category, UNPROVIDED);
                    final SubLObject ignore_this = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
                        fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject cdolist_list_var2 = ignore_this;
                    SubLObject test_gaf = NIL;
                    test_gaf = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        return_gafs = cons(test_gaf, return_gafs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        test_gaf = cdolist_list_var2.first();
                    } 
                    dictionary_enter(iterative_template_parser.itp_node_syntactic_choices(self), category, cons(node, kids));
                    new_nodes = cons(node, new_nodes);
                } finally {
                    iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                }
            }
            do_dictionary_contents_finalize(iteration_state);
            final SubLObject _prev_bind_2 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
            try {
                iterative_template_parser.$kb_node_gathering_modeP$.bind(T, thread);
                SubLObject choice_cat2 = NIL;
                if (NIL == choice_cat2) {
                    choice_cat2 = iterative_template_parser.$$SyntacticChoiceNode;
                }
                thread.resetMultipleValues();
                final SubLObject choice_node = iterative_template_parser.new_syntactic_choice_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), new_nodes, choice_cat2, UNPROVIDED);
                final SubLObject ignore_this2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
                    fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), choice_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                SubLObject cdolist_list_var3 = ignore_this2;
                SubLObject test_gaf2 = NIL;
                test_gaf2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    return_gafs = cons(test_gaf2, return_gafs);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    test_gaf2 = cdolist_list_var3.first();
                } 
                syntactic_node_add_dtr(iterative_template_parser.itp_node_syntactic_node(self), choice_node, NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
            } finally {
                iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(T, return_gafs);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; whose syntactic-choices to check
     * @param COMPONENT
     * 		; to search for
     * @return the #$SyntacticChoiceNode ; if any
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; whose syntactic-choices to check\r\n@param COMPONENT\r\n\t\t; to search for\r\n@return the #$SyntacticChoiceNode ; if any")
    public static final SubLObject itp_choice_node_for_component_alt(SubLObject self, SubLObject key_component) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self)) {
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_choices(self)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject this_component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject node_and_references = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (this_component.equal(key_component)) {
                                return values(node_and_references.first(), node_and_references.rest());
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
            return values(NIL, NIL);
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; whose syntactic-choices to check
     * @param COMPONENT
     * 		; to search for
     * @return the #$SyntacticChoiceNode ; if any
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; whose syntactic-choices to check\r\n@param COMPONENT\r\n\t\t; to search for\r\n@return the #$SyntacticChoiceNode ; if any")
    public static SubLObject itp_choice_node_for_component(final SubLObject self, final SubLObject key_component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != iterative_template_parser.itp_node_syntactic_choices(self)) {
            SubLObject iteration_state;
            for (iteration_state = do_dictionary_contents_state(dictionary_contents(iterative_template_parser.itp_node_syntactic_choices(self))); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject this_component = do_dictionary_contents_key_value(iteration_state);
                final SubLObject node_and_references = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (this_component.equal(key_component)) {
                    return values(node_and_references.first(), node_and_references.rest());
                }
            }
            do_dictionary_contents_finalize(iteration_state);
        }
        return values(NIL, NIL);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param COMPONENT
     * 		; to search for, and initialize if needed
     * @return (values #$SyntacticChoiceNode if any ; gafs to assert later, if any
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param COMPONENT\r\n\t\t; to search for, and initialize if needed\r\n@return (values #$SyntacticChoiceNode if any ; gafs to assert later, if any")
    public static final SubLObject itp_node_find_or_initialize_syntactic_choices_alt(SubLObject self, SubLObject component) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_choice_node_for_component(self, component);
                SubLObject the_gafs = NIL;
                if (NIL == the_node) {
                    thread.resetMultipleValues();
                    {
                        SubLObject initP = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_initialize_syntactic_choices(self, NIL != parsing_utilities.result_of_parsing_formulaP(component) ? ((SubLObject) (parsing_utilities.result_of_parsing_highest_category(component, UNPROVIDED))) : NIL);
                        SubLObject gafs = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != initP) {
                            the_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_choice_node_for_component(self, component);
                        }
                        if (NIL != gafs) {
                            the_gafs = gafs;
                        }
                    }
                }
                return values(the_node, the_gafs);
            }
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param COMPONENT
     * 		; to search for, and initialize if needed
     * @return (values #$SyntacticChoiceNode if any ; gafs to assert later, if any
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param COMPONENT\r\n\t\t; to search for, and initialize if needed\r\n@return (values #$SyntacticChoiceNode if any ; gafs to assert later, if any")
    public static SubLObject itp_node_find_or_initialize_syntactic_choices(final SubLObject self, final SubLObject component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_node = iterative_template_parser.itp_choice_node_for_component(self, component);
        SubLObject the_gafs = NIL;
        if (NIL == the_node) {
            thread.resetMultipleValues();
            final SubLObject initP = iterative_template_parser.itp_node_initialize_syntactic_choices(self, NIL != result_of_parsing_formulaP(component) ? result_of_parsing_highest_category(component, UNPROVIDED) : NIL);
            final SubLObject gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != initP) {
                the_node = iterative_template_parser.itp_choice_node_for_component(self, component);
            }
            if (NIL != gafs) {
                the_gafs = gafs;
            }
        }
        return values(the_node, the_gafs);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return the results of @see rtp-component-tokenization (itp-node-new-parse NODE)
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return the results of @see rtp-component-tokenization (itp-node-new-parse NODE)")
    public static final SubLObject itp_node_tokenization_alt(SubLObject self) {
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_component_tokenization(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(self), UNPROVIDED);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @return the results of @see rtp-component-tokenization (itp-node-new-parse NODE)
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@return the results of @see rtp-component-tokenization (itp-node-new-parse NODE)")
    public static SubLObject itp_node_tokenization(final SubLObject self) {
        return iterative_template_parser.rtp_component_tokenization(iterative_template_parser.itp_node_new_parse(self), UNPROVIDED);
    }

    public static final SubLObject itp_node_equalP_alt(SubLObject one, SubLObject other) {
        return makeBoolean((com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(other).equal(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(one)) && com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(one).equal(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(other))) && com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(one).equal(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(other)));
    }

    public static SubLObject itp_node_equalP(final SubLObject one, final SubLObject other) {
        return makeBoolean((iterative_template_parser.itp_node_span(other).equal(iterative_template_parser.itp_node_span(one)) && iterative_template_parser.itp_node_component(one).equal(iterative_template_parser.itp_node_component(other))) && iterative_template_parser.itp_node_new_parse(one).equal(iterative_template_parser.itp_node_new_parse(other)));
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param MICROTHEORY
     * 		
     * @param #$SententialConstituentType
     * 		; optional, a newly created node's #$syntacticNodeCategory
     * @param #$SyntacticNode
     * 		; optional itp-node, presumed to be this one's parent, for #$syntacticDaughters
     * @return ; if the ITP node already had a #$SyntacticNode, return it. Otherwise, if the mt is valid,
    create a #$SyntacticNode in the mt and return it
     * @unknown this is relevant only to on-the-fly reification, which we aren't doing right now
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param MICROTHEORY\r\n\t\t\r\n@param #$SententialConstituentType\r\n\t\t; optional, a newly created node\'s #$syntacticNodeCategory\r\n@param #$SyntacticNode\r\n\t\t; optional itp-node, presumed to be this one\'s parent, for #$syntacticDaughters\r\n@return ; if the ITP node already had a #$SyntacticNode, return it. Otherwise, if the mt is valid,\r\ncreate a #$SyntacticNode in the mt and return it\r\n@unknown this is relevant only to on-the-fly reification, which we aren\'t doing right now")
    public static final SubLObject find_or_create_itp_node_syntactic_node_alt(SubLObject itp_node, SubLObject into_mt, SubLObject category, SubLObject parent) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (NIL == itp_node) {
            return NIL;
        }
        {
            SubLObject old_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(itp_node);
            if (NIL != old_node) {
                return old_node;
            }
        }
        if (NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
            return NIL;
        }
        {
            SubLObject kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node(into_mt, category, UNPROVIDED);
            if (NIL != kb_node) {
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(itp_node, kb_node);
                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(parent)) {
                    {
                        SubLObject parent_kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(parent);
                        if (NIL != isa.isaP(parent_kb_node, $$SyntacticNode, into_mt, UNPROVIDED)) {
                            parsing_utilities.syntactic_node_add_dtr(parent_kb_node, kb_node, NIL, into_mt);
                        }
                    }
                }
            } else {
                Errors.warn($str_alt183$____RTP_____Couldn_t_create_KB_no, itp_node, into_mt);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		
     * @param MICROTHEORY
     * 		
     * @param #$SententialConstituentType
     * 		; optional, a newly created node's #$syntacticNodeCategory
     * @param #$SyntacticNode
     * 		; optional itp-node, presumed to be this one's parent, for #$syntacticDaughters
     * @return ; if the ITP node already had a #$SyntacticNode, return it. Otherwise, if the mt is valid,
    create a #$SyntacticNode in the mt and return it
     * @unknown this is relevant only to on-the-fly reification, which we aren't doing right now
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t\r\n@param MICROTHEORY\r\n\t\t\r\n@param #$SententialConstituentType\r\n\t\t; optional, a newly created node\'s #$syntacticNodeCategory\r\n@param #$SyntacticNode\r\n\t\t; optional itp-node, presumed to be this one\'s parent, for #$syntacticDaughters\r\n@return ; if the ITP node already had a #$SyntacticNode, return it. Otherwise, if the mt is valid,\r\ncreate a #$SyntacticNode in the mt and return it\r\n@unknown this is relevant only to on-the-fly reification, which we aren\'t doing right now")
    public static SubLObject find_or_create_itp_node_syntactic_node(final SubLObject itp_node, final SubLObject into_mt, SubLObject category, SubLObject parent) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (NIL == itp_node) {
            return NIL;
        }
        final SubLObject old_node = iterative_template_parser.itp_node_syntactic_node(itp_node);
        if (NIL != old_node) {
            return old_node;
        }
        if (NIL == mt_in_any_mtP(into_mt)) {
            return NIL;
        }
        final SubLObject kb_node = iterative_template_parser.new_syntactic_functional_node(into_mt, category, UNPROVIDED);
        if (NIL != kb_node) {
            iterative_template_parser._csetf_itp_node_syntactic_node(itp_node, kb_node);
            if (NIL != iterative_template_parser.itp_node_p(parent)) {
                final SubLObject parent_kb_node = iterative_template_parser.itp_node_syntactic_node(parent);
                if (NIL != isaP(parent_kb_node, iterative_template_parser.$$SyntacticNode, into_mt, UNPROVIDED)) {
                    syntactic_node_add_dtr(parent_kb_node, kb_node, NIL, into_mt);
                }
            }
        } else {
            Errors.warn(iterative_template_parser.$str189$____RTP_____Couldn_t_create_KB_no, itp_node, into_mt);
        }
        return NIL;
    }

    public static final SubLObject itp_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.iterative_template_parser.print_itp_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        iterative_template_parser.print_itp_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native.class ? T : NIL;
    }

    public static final SubLObject itp_state_sequence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject itp_state_sequence(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_state_complete_parses_only_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject itp_state_complete_parses_only(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_state_work_set_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject itp_state_work_set(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject itp_state_solution_set_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject itp_state_solution_set(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject itp_state_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject itp_state_sentence(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject itp_state_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject itp_state_category(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject itp_state_cache_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject itp_state_cache(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject itp_state_psp_charts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject itp_state_psp_charts(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject itp_state_working_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject itp_state_working_mt(final SubLObject v_object) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_itp_state_sequence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_state_sequence(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_state_complete_parses_only_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_state_complete_parses_only(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_state_work_set_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_state_work_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_itp_state_solution_set_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_state_solution_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_itp_state_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_itp_state_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_itp_state_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_itp_state_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_itp_state_cache_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_itp_state_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_itp_state_psp_charts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_itp_state_psp_charts(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_itp_state_working_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_itp_state_working_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterative_template_parser.itp_state_p(v_object) : "! iterative_template_parser.itp_state_p(v_object) " + "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_itp_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SEQUENCE)) {
                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_sequence(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COMPLETE_PARSES_ONLY)) {
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_complete_parses_only(v_new, current_value);
                        } else {
                            if (pcase_var.eql($WORK_SET)) {
                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_work_set(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SOLUTION_SET)) {
                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_solution_set(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SENTENCE)) {
                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_sentence(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($CATEGORY)) {
                                            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_category(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($CACHE)) {
                                                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_cache(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PSP_CHARTS)) {
                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_psp_charts(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($WORKING_MT)) {
                                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_working_mt(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt158$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_itp_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SEQUENCE)) {
                iterative_template_parser._csetf_itp_state_sequence(v_new, current_value);
            } else
                if (pcase_var.eql(iterative_template_parser.$COMPLETE_PARSES_ONLY)) {
                    iterative_template_parser._csetf_itp_state_complete_parses_only(v_new, current_value);
                } else
                    if (pcase_var.eql($WORK_SET)) {
                        iterative_template_parser._csetf_itp_state_work_set(v_new, current_value);
                    } else
                        if (pcase_var.eql($SOLUTION_SET)) {
                            iterative_template_parser._csetf_itp_state_solution_set(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCE)) {
                                iterative_template_parser._csetf_itp_state_sentence(v_new, current_value);
                            } else
                                if (pcase_var.eql($CATEGORY)) {
                                    iterative_template_parser._csetf_itp_state_category(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CACHE)) {
                                        iterative_template_parser._csetf_itp_state_cache(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PSP_CHARTS)) {
                                            iterative_template_parser._csetf_itp_state_psp_charts(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($WORKING_MT)) {
                                                iterative_template_parser._csetf_itp_state_working_mt(v_new, current_value);
                                            } else {
                                                Errors.error(iterative_template_parser.$str161$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, iterative_template_parser.MAKE_ITP_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SEQUENCE, iterative_template_parser.itp_state_sequence(obj));
        funcall(visitor_fn, obj, $SLOT, iterative_template_parser.$COMPLETE_PARSES_ONLY, iterative_template_parser.itp_state_complete_parses_only(obj));
        funcall(visitor_fn, obj, $SLOT, $WORK_SET, iterative_template_parser.itp_state_work_set(obj));
        funcall(visitor_fn, obj, $SLOT, $SOLUTION_SET, iterative_template_parser.itp_state_solution_set(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, iterative_template_parser.itp_state_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, iterative_template_parser.itp_state_category(obj));
        funcall(visitor_fn, obj, $SLOT, $CACHE, iterative_template_parser.itp_state_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $PSP_CHARTS, iterative_template_parser.itp_state_psp_charts(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_MT, iterative_template_parser.itp_state_working_mt(obj));
        funcall(visitor_fn, obj, $END, iterative_template_parser.MAKE_ITP_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return iterative_template_parser.visit_defstruct_itp_state(obj, visitor_fn);
    }

    public static final SubLObject print_itp_state_alt(SubLObject itp_state, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(itp_state, stream);
            } else {
                {
                    SubLObject v_object = itp_state;
                    SubLObject stream_61 = stream;
                    write_string($str_alt159$__, stream_61, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_61 });
                    write_char(CHAR_space, stream_61);
                    format(stream, $str_alt218$Work___D_Solution___D_KB_Mt___A, new SubLObject[]{ queues.p_queue_size(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_work_set(itp_state)), length(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_solution_set(itp_state)), com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_working_mt(itp_state) });
                    write_char(CHAR_space, stream_61);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_61, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_61);
                }
            }
            return itp_state;
        }
    }

    public static SubLObject print_itp_state(final SubLObject itp_state, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(itp_state, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, itp_state, T, T);
            format(stream, iterative_template_parser.$str227$Work___D_Solution___D_KB_Mt___A, new SubLObject[]{ p_queue_size(iterative_template_parser.itp_state_work_set(itp_state)), length(iterative_template_parser.itp_state_solution_set(itp_state)), iterative_template_parser.itp_state_working_mt(itp_state) });
            print_macros.print_unreadable_object_postamble(stream, itp_state, T, T);
        }
        return itp_state;
    }

    public static final SubLObject new_itp_state_alt(SubLObject sentence, SubLObject category, SubLObject complete_parses_only) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = com.cyc.cycjava.cycl.rtp.iterative_template_parser.make_itp_state(UNPROVIDED);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_sequence(state, ZERO_INTEGER);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_complete_parses_only(state, complete_parses_only);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_sentence(state, sentence);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_category(state, category);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_cache(state, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_work_set(state, queues.create_p_queue(NIL, ITP_NODE_MAX_CHILD_SPAN_LENGTH, $sym220$_));
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_solution_set(state, NIL);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_psp_charts(state, com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_itp_state_psp_chart_dictionary());
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_working_mt(state, $rtp_kb_parse_mt$.getDynamicValue(thread));
                return state;
            }
        }
    }

    public static SubLObject new_itp_state(final SubLObject sentence, SubLObject category, SubLObject complete_parses_only) {
        if (category == UNPROVIDED) {
            category = iterative_template_parser.$$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = iterative_template_parser.make_itp_state(UNPROVIDED);
        iterative_template_parser._csetf_itp_state_sequence(state, ZERO_INTEGER);
        iterative_template_parser._csetf_itp_state_complete_parses_only(state, complete_parses_only);
        iterative_template_parser._csetf_itp_state_sentence(state, sentence);
        iterative_template_parser._csetf_itp_state_category(state, category);
        iterative_template_parser._csetf_itp_state_cache(state, new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        iterative_template_parser._csetf_itp_state_work_set(state, create_p_queue(NIL, iterative_template_parser.ITP_NODE_MAX_CHILD_SPAN_LENGTH, iterative_template_parser.$sym229$_));
        iterative_template_parser._csetf_itp_state_solution_set(state, NIL);
        iterative_template_parser._csetf_itp_state_psp_charts(state, iterative_template_parser.new_itp_state_psp_chart_dictionary());
        iterative_template_parser._csetf_itp_state_working_mt(state, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        return state;
    }

    public static final SubLObject destroy_itp_state_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.clear_dictionary(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_cache(state));
            {
                SubLObject chart_dictionary = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_psp_charts(state);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject chart = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        psp_chart.destroy_psp_chart(chart);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary.clear_dictionary(chart_dictionary);
            }
            return $DESTROYED;
        }
    }

    public static SubLObject destroy_itp_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_dictionary(iterative_template_parser.itp_state_cache(state));
        final SubLObject chart_dictionary = iterative_template_parser.itp_state_psp_charts(state);
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(chart_dictionary)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            destroy_psp_chart(chart);
        }
        do_dictionary_contents_finalize(iteration_state);
        clear_dictionary(chart_dictionary);
        return $DESTROYED;
    }

    /**
     * allow us to re-use dictionaries between parses
     */
    @LispMethod(comment = "allow us to re-use dictionaries between parses")
    public static final SubLObject new_itp_state_psp_chart_dictionary_internal_alt() {
        return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
    }

    /**
     * allow us to re-use dictionaries between parses
     */
    @LispMethod(comment = "allow us to re-use dictionaries between parses")
    public static SubLObject new_itp_state_psp_chart_dictionary_internal() {
        return new_dictionary(UNPROVIDED, UNPROVIDED);
    }/**
     * allow us to re-use dictionaries between parses
     */


    public static final SubLObject new_itp_state_psp_chart_dictionary_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_itp_state_psp_chart_dictionary_internal();
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NEW_ITP_STATE_PSP_CHART_DICTIONARY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NEW_ITP_STATE_PSP_CHART_DICTIONARY, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, NEW_ITP_STATE_PSP_CHART_DICTIONARY, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                    if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_itp_state_psp_chart_dictionary_internal()));
                        memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject new_itp_state_psp_chart_dictionary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return iterative_template_parser.new_itp_state_psp_chart_dictionary_internal();
        }
        caching_state = memoization_state_lookup(v_memoization_state, iterative_template_parser.NEW_ITP_STATE_PSP_CHART_DICTIONARY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), iterative_template_parser.NEW_ITP_STATE_PSP_CHART_DICTIONARY, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, iterative_template_parser.NEW_ITP_STATE_PSP_CHART_DICTIONARY, caching_state);
        }
        SubLObject results = caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(iterative_template_parser.new_itp_state_psp_chart_dictionary_internal()));
            caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * A solution vindicates the parent as well.
     */
    @LispMethod(comment = "A solution vindicates the parent as well.")
    public static final SubLObject add_to_itp_solution_alt(SubLObject state, SubLObject solution) {
        {
            SubLObject current = solution;
            SubLObject solutions = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_solution_set(state);
            while (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(current)) {
                {
                    SubLObject item_var = current;
                    if (NIL == member(item_var, solutions, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        solutions = cons(item_var, solutions);
                    }
                }
                current = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_parent(current);
            } 
            com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_solution_set(state, solutions);
            return state;
        }
    }

    /**
     * A solution vindicates the parent as well.
     */
    @LispMethod(comment = "A solution vindicates the parent as well.")
    public static SubLObject add_to_itp_solution(final SubLObject state, final SubLObject solution) {
        SubLObject current = solution;
        SubLObject solutions = iterative_template_parser.itp_state_solution_set(state);
        while (NIL != iterative_template_parser.itp_node_p(current)) {
            final SubLObject item_var = current;
            if (NIL == member(item_var, solutions, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                solutions = cons(item_var, solutions);
            }
            current = iterative_template_parser.itp_node_parent(current);
        } 
        iterative_template_parser._csetf_itp_state_solution_set(state, solutions);
        return state;
    }/**
     * A solution vindicates the parent as well.
     */


    /**
     * Remember that someone is already attempting to solve this problem.
     */
    @LispMethod(comment = "Remember that someone is already attempting to solve this problem.")
    public static final SubLObject memoize_itp_attempt_alt(SubLObject state, SubLObject node) {
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_cache(state);
            SubLObject key = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(node);
            if (NIL != key) {
                dictionary_utilities.dictionary_pushnew(v_cache, key, node, UNPROVIDED, UNPROVIDED);
            }
        }
        return state;
    }

    /**
     * Remember that someone is already attempting to solve this problem.
     */
    @LispMethod(comment = "Remember that someone is already attempting to solve this problem.")
    public static SubLObject memoize_itp_attempt(final SubLObject state, final SubLObject node) {
        final SubLObject v_cache = iterative_template_parser.itp_state_cache(state);
        final SubLObject key = iterative_template_parser.itp_node_component(node);
        if (NIL != key) {
            dictionary_pushnew(v_cache, key, node, UNPROVIDED, UNPROVIDED);
        }
        return state;
    }/**
     * Remember that someone is already attempting to solve this problem.
     */


    /**
     * Check the cache if some node is already working on this
     * problem.
     */
    @LispMethod(comment = "Check the cache if some node is already working on this\r\nproblem.\nCheck the cache if some node is already working on this\nproblem.")
    public static final SubLObject is_a_known_itp_attemptP_alt(SubLObject state, SubLObject problem) {
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_cache(state);
            SubLObject hit = dictionary.dictionary_lookup(v_cache, problem, UNPROVIDED);
            return hit;
        }
    }

    @LispMethod(comment = "Check the cache if some node is already working on this\r\nproblem.\nCheck the cache if some node is already working on this\nproblem.")
    public static SubLObject is_a_known_itp_attemptP(final SubLObject state, final SubLObject problem) {
        final SubLObject v_cache = iterative_template_parser.itp_state_cache(state);
        final SubLObject hit = dictionary_lookup(v_cache, problem, UNPROVIDED);
        return hit;
    }/**
     * Check the cache if some node is already working on this
     * problem.
     */


    public static final SubLObject prime_itp_pump_alt(SubLObject itp_state, SubLObject mt) {
        {
            SubLObject parses = recognition.categorizing_template_parse(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_sentence(itp_state), mt, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_category(itp_state), com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_complete_parses_only(itp_state));
            SubLObject undo_extension_traceP = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject parse = NIL;
            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                {
                    SubLObject span = parse.first();
                    SubLObject possibles = second(parse);
                    SubLObject cdolist_list_var_62 = possibles;
                    SubLObject possible = NIL;
                    for (possible = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , possible = cdolist_list_var_62.first()) {
                        {
                            SubLObject formula = possible.first();
                            SubLObject assertion = second(possible);
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state(itp_state, span, NIL, formula, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return itp_state;
    }

    public static SubLObject prime_itp_pump(final SubLObject itp_state, final SubLObject mt) {
        final SubLObject parses = recognition.categorizing_template_parse(iterative_template_parser.itp_state_sentence(itp_state), mt, iterative_template_parser.itp_state_category(itp_state), iterative_template_parser.itp_state_complete_parses_only(itp_state));
        final SubLObject undo_extension_traceP = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject span = parse.first();
            SubLObject cdolist_list_var_$59;
            final SubLObject possibles = cdolist_list_var_$59 = second(parse);
            SubLObject possible = NIL;
            possible = cdolist_list_var_$59.first();
            while (NIL != cdolist_list_var_$59) {
                final SubLObject formula = possible.first();
                final SubLObject assertion = second(possible);
                iterative_template_parser.extend_itp_state(itp_state, span, NIL, formula, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                possible = cdolist_list_var_$59.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return itp_state;
    }

    public static final SubLObject extend_itp_state_alt(SubLObject state, SubLObject span, SubLObject old_formula, SubLObject new_parse, SubLObject assertion, SubLObject parent, SubLObject psp_node_if_any, SubLObject graph_type) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (psp_node_if_any == UNPROVIDED) {
            psp_node_if_any = NIL;
        }
        if (graph_type == UNPROVIDED) {
            graph_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, ITP_STATE_P);
            if (NIL != parent) {
                SubLTrampolineFile.checkType(parent, ITP_NODE_P);
            }
            {
                SubLObject id = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_sequence(state);
                SubLObject node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.construct_itp_node(parent, span, old_formula, assertion, id);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_new_parse(node, new_parse);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(node, psp_node_if_any);
                {
                    SubLObject into_mt = (NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_working_mt(state))) : NIL;
                    if (NIL == parent) {
                        if (NIL != into_mt) {
                            {
                                SubLObject kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.find_or_create_itp_node_syntactic_node(node, into_mt, $$SyntacticNode_MatrixClause, UNPROVIDED);
                                if ((NIL != kb_node) && (NIL != parsing_utilities.result_of_parsing_formulaP(old_formula))) {
                                    fi.fi_assert_int(list($$syntacticNodeString, kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject child_kb_node = NIL;
                            if (NIL != into_mt) {
                                if (NIL == child_kb_node) {
                                    {
                                        SubLObject category = ((NIL != $extend_itp_state_analyze_assertionP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(assertion))) ? ((SubLObject) (cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), UNPROVIDED))) : assertion;
                                        if ((NIL == assertion_handles.assertion_p(category)) && (NIL != genls.genlP(category, $$ParsingTemplateCategory, $$TemplateParsingMt, UNPROVIDED))) {
                                            child_kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node(into_mt, category, UNPROVIDED);
                                            if ((NIL != child_kb_node) && (NIL != parsing_utilities.result_of_parsing_formulaP(old_formula))) {
                                                fi.fi_assert_int(list($$syntacticNodeString, child_kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                            com.cyc.cycjava.cycl.rtp.iterative_template_parser.add_itp_node_child(parent, node, child_kb_node);
                        }
                    }
                }
                queues.p_enqueue(node, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_work_set(state));
                id = add(id, ONE_INTEGER);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_state_sequence(state, id);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser.memoize_itp_attempt(state, node);
                return node;
            }
        }
    }

    public static SubLObject extend_itp_state(final SubLObject state, final SubLObject span, final SubLObject old_formula, final SubLObject new_parse, final SubLObject assertion, SubLObject parent, SubLObject psp_node_if_any, SubLObject graph_type) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (psp_node_if_any == UNPROVIDED) {
            psp_node_if_any = NIL;
        }
        if (graph_type == UNPROVIDED) {
            graph_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterative_template_parser.itp_state_p(state) : "! iterative_template_parser.itp_state_p(state) " + ("iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) ") + state;
        if (((NIL != parent) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == iterative_template_parser.itp_node_p(parent))) {
            throw new AssertionError(parent);
        }
        SubLObject id = iterative_template_parser.itp_state_sequence(state);
        final SubLObject node = iterative_template_parser.construct_itp_node(parent, span, old_formula, assertion, id);
        iterative_template_parser._csetf_itp_node_new_parse(node, new_parse);
        iterative_template_parser._csetf_itp_node_syntactic_node(node, psp_node_if_any);
        final SubLObject into_mt = (NIL != iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) ? iterative_template_parser.itp_state_working_mt(state) : NIL;
        if (NIL == parent) {
            if (NIL != into_mt) {
                final SubLObject kb_node = iterative_template_parser.find_or_create_itp_node_syntactic_node(node, into_mt, iterative_template_parser.$$SyntacticNode_MatrixClause, UNPROVIDED);
                if ((NIL != kb_node) && (NIL != result_of_parsing_formulaP(old_formula))) {
                    fi_assert_int(list(iterative_template_parser.$$syntacticNodeString, kb_node, result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
        } else {
            SubLObject child_kb_node = NIL;
            if ((NIL != into_mt) && (NIL == child_kb_node)) {
                final SubLObject category = ((NIL != iterative_template_parser.$extend_itp_state_analyze_assertionP$.getDynamicValue(thread)) && (NIL != assertion_p(assertion))) ? formula_arg1(assertion_formula(assertion), UNPROVIDED) : assertion;
                if ((NIL == assertion_p(category)) && (NIL != genlP(category, iterative_template_parser.$$ParsingTemplateCategory, iterative_template_parser.$$TemplateParsingMt, UNPROVIDED))) {
                    child_kb_node = iterative_template_parser.new_syntactic_functional_node(into_mt, category, UNPROVIDED);
                    if ((NIL != child_kb_node) && (NIL != result_of_parsing_formulaP(old_formula))) {
                        fi_assert_int(list(iterative_template_parser.$$syntacticNodeString, child_kb_node, result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            iterative_template_parser.add_itp_node_child(parent, node, child_kb_node);
        }
        p_enqueue(node, iterative_template_parser.itp_state_work_set(state));
        id = add(id, ONE_INTEGER);
        iterative_template_parser._csetf_itp_state_sequence(state, id);
        iterative_template_parser.memoize_itp_attempt(state, node);
        return node;
    }

    public static final SubLObject extend_itp_state_multiple_alt(SubLObject state, SubLObject span, SubLObject formula, SubLObject answers, SubLObject parent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, ITP_STATE_P);
            SubLTrampolineFile.checkType(parent, ITP_NODE_P);
            {
                SubLObject solution = answers.first();
                SubLObject subspan = solution.first();
                SubLObject subparses = second(solution);
                SubLObject absolute_span = NIL;
                SubLObject listy_span = NIL;
                if (span.first() == $$TheList) {
                    listy_span = span;
                } else {
                    listy_span = cons($$TheList, span);
                }
                absolute_span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.compute_correct_span(listy_span, subspan);
                com.cyc.cycjava.cycl.rtp.iterative_template_parser.adjust_the_spans(subparses, absolute_span, UNPROVIDED);
                {
                    SubLObject kb_node = NIL;
                    SubLObject cdolist_list_var = subparses;
                    SubLObject parse = NIL;
                    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                        {
                            SubLObject form = parse.first();
                            SubLObject assertion = second(parse);
                            SubLObject undo_extension_traceP = NIL;
                            if (!(form.isList() && (NIL != member(formula, form, symbol_function(EQUALP), UNPROVIDED)))) {
                                {
                                    SubLObject _prev_bind_0 = $extend_itp_state_analyze_assertionP$.currentBinding(thread);
                                    try {
                                        $extend_itp_state_analyze_assertionP$.bind(T, thread);
                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state(state, absolute_span, formula, form, assertion, parent, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        $extend_itp_state_analyze_assertionP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return state;
        }
    }

    public static SubLObject extend_itp_state_multiple(final SubLObject state, final SubLObject span, final SubLObject formula, final SubLObject answers, final SubLObject parent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterative_template_parser.itp_state_p(state) : "! iterative_template_parser.itp_state_p(state) " + ("iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) ") + state;
        assert NIL != iterative_template_parser.itp_node_p(parent) : "! iterative_template_parser.itp_node_p(parent) " + ("iterative_template_parser.itp_node_p(parent) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(parent) ") + parent;
        final SubLObject solution = answers.first();
        final SubLObject subspan = solution.first();
        final SubLObject subparses = second(solution);
        SubLObject absolute_span = NIL;
        SubLObject listy_span = NIL;
        if (span.first().eql(iterative_template_parser.$$TheList)) {
            listy_span = span;
        } else {
            listy_span = cons(iterative_template_parser.$$TheList, span);
        }
        absolute_span = iterative_template_parser.compute_correct_span(listy_span, subspan);
        iterative_template_parser.adjust_the_spans(subparses, absolute_span, UNPROVIDED);
        final SubLObject kb_node = NIL;
        SubLObject cdolist_list_var = subparses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject form = parse.first();
            final SubLObject assertion = second(parse);
            final SubLObject undo_extension_traceP = NIL;
            if ((!form.isList()) || (NIL == member(formula, form, symbol_function(EQUALP), UNPROVIDED))) {
                final SubLObject _prev_bind_0 = iterative_template_parser.$extend_itp_state_analyze_assertionP$.currentBinding(thread);
                try {
                    iterative_template_parser.$extend_itp_state_analyze_assertionP$.bind(T, thread);
                    iterative_template_parser.extend_itp_state(state, absolute_span, formula, form, assertion, parent, UNPROVIDED, UNPROVIDED);
                } finally {
                    iterative_template_parser.$extend_itp_state_analyze_assertionP$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return state;
    }

    /**
     * Take this PS parse and add it to the results of the template parse.
     */
    @LispMethod(comment = "Take this PS parse and add it to the results of the template parse.")
    public static final SubLObject extend_itp_state_by_ps_parse_alt(SubLObject state, SubLObject span, SubLObject component, SubLObject psp_parse, SubLObject parent, SubLObject pos_of_parse) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject real_span = (span.first() == $$TheList) ? ((SubLObject) (span.rest())) : span;
                SubLObject interpretations = NIL;
                SubLObject psp_node_if_any = psp_parse.first();
                SubLObject node = NIL;
                if ((NIL == psp_node_if_any) || (NIL != forts.fort_p(psp_node_if_any))) {
                    psp_parse = psp_parse.rest();
                } else {
                    psp_node_if_any = NIL;
                }
                {
                    SubLObject cdolist_list_var = psp_parse;
                    SubLObject meaning = NIL;
                    for (meaning = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning = cdolist_list_var.first()) {
                        {
                            SubLObject formula = narts_high.nart_expand(meaning);
                            SubLObject adjusted_formula = com.cyc.cycjava.cycl.rtp.iterative_template_parser.adjust_the_spans(formula, real_span, UNPROVIDED);
                            SubLObject item_var = adjusted_formula;
                            if (NIL == member(item_var, interpretations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                interpretations = cons(item_var, interpretations);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = interpretations;
                    SubLObject interpretation = NIL;
                    for (interpretation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interpretation = cdolist_list_var.first()) {
                        node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state(state, real_span, component, interpretation, pos_of_parse, parent, psp_node_if_any, $npparse_graph_type$.getDynamicValue(thread));
                        if (NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) {
                            {
                                SubLObject kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(node);
                                SubLObject into_mt = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_working_mt(state);
                                if ((NIL != kb_node) && (NIL != into_mt)) {
                                    fi.fi_assert_int(list($$proposedMeaning, kb_node, list($$SubLQuoteFn, interpretation)), into_mt, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return node;
            }
        }
    }

    @LispMethod(comment = "Take this PS parse and add it to the results of the template parse.")
    public static SubLObject extend_itp_state_by_ps_parse(final SubLObject state, final SubLObject span, final SubLObject component, SubLObject psp_parse, final SubLObject parent, final SubLObject pos_of_parse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject real_span = (span.first().eql(iterative_template_parser.$$TheList)) ? span.rest() : span;
        SubLObject interpretations = NIL;
        SubLObject psp_node_if_any = psp_parse.first();
        SubLObject node = NIL;
        if ((NIL == psp_node_if_any) || (NIL != fort_p(psp_node_if_any))) {
            psp_parse = psp_parse.rest();
        } else {
            psp_node_if_any = NIL;
        }
        SubLObject cdolist_list_var = psp_parse;
        SubLObject meaning = NIL;
        meaning = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = nart_expand(meaning);
            final SubLObject item_var;
            final SubLObject adjusted_formula = item_var = iterative_template_parser.adjust_the_spans(formula, real_span, UNPROVIDED);
            if (NIL == member(item_var, interpretations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                interpretations = cons(item_var, interpretations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning = cdolist_list_var.first();
        } 
        cdolist_list_var = interpretations;
        SubLObject interpretation = NIL;
        interpretation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            node = iterative_template_parser.extend_itp_state(state, real_span, component, interpretation, pos_of_parse, parent, psp_node_if_any, iterative_template_parser.$npparse_graph_type$.getDynamicValue(thread));
            if (NIL != iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) {
                final SubLObject kb_node = iterative_template_parser.itp_node_syntactic_node(node);
                final SubLObject into_mt = iterative_template_parser.itp_state_working_mt(state);
                if ((NIL != kb_node) && (NIL != into_mt)) {
                    fi_assert_int(list(iterative_template_parser.$$proposedMeaning, kb_node, list(iterative_template_parser.$$SubLQuoteFn, interpretation)), into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretation = cdolist_list_var.first();
        } 
        return node;
    }/**
     * Take this PS parse and add it to the results of the template parse.
     */


    /**
     * This is the key loop of the ITP state. It performs one iteration
     * by getting a working set element and motioning it onto either the
     * solution set or discarding it.
     */
    @LispMethod(comment = "This is the key loop of the ITP state. It performs one iteration\r\nby getting a working set element and motioning it onto either the\r\nsolution set or discarding it.\nThis is the key loop of the ITP state. It performs one iteration\nby getting a working set element and motioning it onto either the\nsolution set or discarding it.")
    public static final SubLObject expand_itp_state_alt(SubLObject state, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current = queues.p_dequeue(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_work_set(state), UNPROVIDED);
                SubLObject span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(current);
                SubLObject formula = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(current);
                SubLObject components = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(formula);
                SubLObject parts = ZERO_INTEGER;
                SubLObject good = ZERO_INTEGER;
                SubLObject listy_span = NIL;
                if (NIL != $trace_itp_state_expansion$.getDynamicValue(thread)) {
                    format(T, $str_alt228$Expanding_itp_node__A________S__, current, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(current));
                }
                if (NIL != components) {
                    if (span.first() == $$TheList) {
                        listy_span = span;
                    } else {
                        listy_span = cons($$TheList, span);
                    }
                }
                {
                    SubLObject cdolist_list_var = components;
                    SubLObject component = NIL;
                    for (component = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , component = cdolist_list_var.first()) {
                        {
                            SubLObject words = parsing_utilities.result_of_parsing_words(component);
                            SubLObject subspan = parsing_utilities.result_of_parsing_span(component);
                            SubLObject category = parsing_utilities.result_of_parsing_category(component);
                            parts = add(parts, ONE_INTEGER);
                            if ((NIL == parsing_utilities.result_of_parsing_formulaP(component)) && ((!(((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.verbal_template_categoryP(category)) || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.number_template_categoryP(category))) || ((NIL != parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)) && ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.adjectival_categoryP(category)) || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.nominal_categoryP(category)))))) || ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.nominal_categoryP(category)) && (NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread))))) {
                                good = add(good, ONE_INTEGER);
                            } else {
                                {
                                    SubLObject v_cache = com.cyc.cycjava.cycl.rtp.iterative_template_parser.is_a_known_itp_attemptP(state, component);
                                    if ((NIL != v_cache) && (v_cache != current)) {
                                        {
                                            SubLObject cdolist_list_var_63 = v_cache;
                                            SubLObject known_node = NIL;
                                            for (known_node = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , known_node = cdolist_list_var_63.first()) {
                                                com.cyc.cycjava.cycl.rtp.iterative_template_parser.add_itp_node_child(current, known_node, UNPROVIDED);
                                            }
                                        }
                                        good = add(good, ONE_INTEGER);
                                    } else {
                                        if ((NIL == v_cache) || (v_cache == current)) {
                                            {
                                                SubLObject answers = recognition.categorizing_template_parse(words, mt, category, UNPROVIDED);
                                                SubLObject absolute_span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.compute_correct_span(listy_span, subspan);
                                                if (NIL != answers) {
                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_multiple(state, absolute_span, component, answers, current);
                                                }
                                                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.nominal_categoryP(category)) {
                                                    if (NIL != parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)) {
                                                        {
                                                            SubLObject pcase_var = category;
                                                            if (pcase_var.eql($$NBarTemplate)) {
                                                                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.appropriate_span_for_nbar_parsingP(words, subspan)) {
                                                                    {
                                                                        SubLObject chart = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                                                        SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
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
                                                                                                    Errors.error($str_alt230$Invalid_attempt_to_reuse_memoizat);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_64 = parsing_vars.$psp_chart$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                                                                                            try {
                                                                                                parsing_vars.$psp_chart$.bind(chart, thread);
                                                                                                parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                                                                                                {
                                                                                                    SubLObject parses = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_get_cycls_for_phrase(words, span, $list_alt231, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, parses, current, $$NBarTemplate);
                                                                                                }
                                                                                            } finally {
                                                                                                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
                                                                                                parsing_vars.$psp_chart$.rebind(_prev_bind_0_64, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_65, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($$NPTemplate)) {
                                                                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.appropriate_span_for_np_parsingP(words, subspan)) {
                                                                        {
                                                                            SubLObject chart = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                                                            SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
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
                                                                                                        Errors.error($str_alt230$Invalid_attempt_to_reuse_memoizat);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_66 = parsing_vars.$psp_chart$.currentBinding(thread);
                                                                                                try {
                                                                                                    parsing_vars.$psp_chart$.bind(chart, thread);
                                                                                                    {
                                                                                                        SubLObject np_parses = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_get_cycls_for_phrase(words, span, $$NounPhrase, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                                                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, np_parses, current, $$NPTemplate);
                                                                                                    }
                                                                                                } finally {
                                                                                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_66, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    good = add(good, ONE_INTEGER);
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.predicative_adjp_template_categoryP(category)) {
                                                        if (NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread)) {
                                                            {
                                                                SubLObject psp_node_if_any = NIL;
                                                                SubLObject adjp_parses = NIL;
                                                                SubLObject chart = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                                                SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
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
                                                                                            Errors.error($str_alt230$Invalid_attempt_to_reuse_memoizat);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            try {
                                                                                {
                                                                                    SubLObject _prev_bind_0_68 = parsing_vars.$psp_chart$.currentBinding(thread);
                                                                                    try {
                                                                                        parsing_vars.$psp_chart$.bind(chart, thread);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_69 = parsing_vars.$parse_tokenization$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
                                                                                            try {
                                                                                                parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                                                                                                parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                                                                                                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_70 = parsing_vars.$parse_root_node$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_71 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            parsing_vars.$parse_root_node$.bind(NIL, thread);
                                                                                                            parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                                                                                                            adjp_parses = psp_main.ps_parse_predicative_adjp(words, com.cyc.cycjava.cycl.rtp.iterative_template_parser.pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                                                                            psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                                                                                                        } finally {
                                                                                                            parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_71, thread);
                                                                                                            parsing_vars.$parse_root_node$.rebind(_prev_bind_0_70, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    adjp_parses = psp_main.ps_parse_predicative_adjp(words, com.cyc.cycjava.cycl.rtp.iterative_template_parser.pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                                                                }
                                                                                            } finally {
                                                                                                parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_1, thread);
                                                                                                parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_69, thread);
                                                                                            }
                                                                                        }
                                                                                        adjp_parses = cons(psp_node_if_any, adjp_parses);
                                                                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, adjp_parses, current, category);
                                                                                    } finally {
                                                                                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_68, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_72, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        good = add(good, ONE_INTEGER);
                                                    } else {
                                                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.vbar_template_categoryP(category)) {
                                                            if ((NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.appropriate_span_for_vbar_parsingP(words, subspan))) {
                                                                {
                                                                    SubLObject chart = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                                                    SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
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
                                                                                                Errors.error($str_alt230$Invalid_attempt_to_reuse_memoizat);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_73 = parsing_vars.$psp_chart$.currentBinding(thread);
                                                                                        try {
                                                                                            parsing_vars.$psp_chart$.bind(chart, thread);
                                                                                            {
                                                                                                SubLObject vp_parses = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_parse_vbar(words, span, category, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                                                                com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, vp_parses, current, category);
                                                                                            }
                                                                                        } finally {
                                                                                            parsing_vars.$psp_chart$.rebind(_prev_bind_0_73, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            good = add(good, ONE_INTEGER);
                                                        } else {
                                                            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.number_template_categoryP(category)) {
                                                                {
                                                                    SubLObject number_parses = list(numeral_parser.string_to_interval(NIL != string_utilities.english_ordinal_number_string_p(words) ? ((SubLObject) (string_utilities.english_ordinal_string_to_cardinal_string(words))) : words));
                                                                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, number_parses, current, category);
                                                                }
                                                                good = add(good, ONE_INTEGER);
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
                if (good.numE(parts)) {
                    com.cyc.cycjava.cycl.rtp.iterative_template_parser.add_to_itp_solution(state, current);
                }
            }
            return state;
        }
    }

    /**
     * This is the key loop of the ITP state. It performs one iteration
     * by getting a working set element and motioning it onto either the
     * solution set or discarding it.
     */
    @LispMethod(comment = "This is the key loop of the ITP state. It performs one iteration\r\nby getting a working set element and motioning it onto either the\r\nsolution set or discarding it.\nThis is the key loop of the ITP state. It performs one iteration\nby getting a working set element and motioning it onto either the\nsolution set or discarding it.")
    public static SubLObject expand_itp_state(final SubLObject state, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current = p_dequeue(iterative_template_parser.itp_state_work_set(state), UNPROVIDED);
        final SubLObject span = iterative_template_parser.itp_node_span(current);
        final SubLObject formula = iterative_template_parser.itp_node_new_parse(current);
        final SubLObject components = rkf_ch_gather_parsing_surrogates(formula);
        SubLObject parts = ZERO_INTEGER;
        SubLObject good = ZERO_INTEGER;
        SubLObject listy_span = NIL;
        if (NIL != iterative_template_parser.$trace_itp_state_expansion$.getDynamicValue(thread)) {
            format(T, iterative_template_parser.$str236$Expanding_itp_node__A________S__, current, iterative_template_parser.itp_node_new_parse(current));
        }
        if (NIL != components) {
            if (span.first().eql(iterative_template_parser.$$TheList)) {
                listy_span = span;
            } else {
                listy_span = cons(iterative_template_parser.$$TheList, span);
            }
        }
        SubLObject cdolist_list_var = components;
        SubLObject component = NIL;
        component = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject words = result_of_parsing_words(component);
            final SubLObject subspan = result_of_parsing_span(component);
            final SubLObject category = result_of_parsing_category(component);
            parts = add(parts, ONE_INTEGER);
            if ((NIL == result_of_parsing_formulaP(component)) && ((((NIL == iterative_template_parser.verbal_template_categoryP(category)) && (NIL == iterative_template_parser.number_template_categoryP(category))) && ((NIL == $perform_np_parser_expansion$.getDynamicValue(thread)) || ((NIL == iterative_template_parser.adjectival_categoryP(category)) && (NIL == iterative_template_parser.nominal_categoryP(category))))) || ((NIL != iterative_template_parser.nominal_categoryP(category)) && (NIL == $perform_np_parser_expansion$.getDynamicValue(thread))))) {
                good = add(good, ONE_INTEGER);
            } else {
                final SubLObject v_cache = iterative_template_parser.is_a_known_itp_attemptP(state, component);
                if ((NIL != v_cache) && (!v_cache.eql(current))) {
                    SubLObject cdolist_list_var_$60 = v_cache;
                    SubLObject known_node = NIL;
                    known_node = cdolist_list_var_$60.first();
                    while (NIL != cdolist_list_var_$60) {
                        iterative_template_parser.add_itp_node_child(current, known_node, UNPROVIDED);
                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                        known_node = cdolist_list_var_$60.first();
                    } 
                    good = add(good, ONE_INTEGER);
                } else
                    if ((NIL == v_cache) || v_cache.eql(current)) {
                        final SubLObject answers = recognition.categorizing_template_parse(words, mt, category, UNPROVIDED);
                        final SubLObject absolute_span = iterative_template_parser.compute_correct_span(listy_span, subspan);
                        if (NIL != answers) {
                            iterative_template_parser.extend_itp_state_multiple(state, absolute_span, component, answers, current);
                        }
                        if (NIL != iterative_template_parser.nominal_categoryP(category)) {
                            if (NIL != $perform_np_parser_expansion$.getDynamicValue(thread)) {
                                final SubLObject pcase_var = category;
                                if (pcase_var.eql(iterative_template_parser.$$NBarTemplate)) {
                                    if (NIL != iterative_template_parser.appropriate_span_for_nbar_parsingP(words, subspan)) {
                                        final SubLObject chart = iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                        final SubLObject local_state = psp_chart_memoization_state(chart);
                                        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
                                        try {
                                            $memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
                                            try {
                                                final SubLObject _prev_bind_0_$61 = $psp_chart$.currentBinding(thread);
                                                final SubLObject _prev_bind_2 = $npp_use_nl_tagsP$.currentBinding(thread);
                                                try {
                                                    $psp_chart$.bind(chart, thread);
                                                    $npp_use_nl_tagsP$.bind(NIL, thread);
                                                    final SubLObject parses = iterative_template_parser.itp_ps_get_cycls_for_phrase(words, span, iterative_template_parser.$list238, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                    iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, parses, current, iterative_template_parser.$$NBarTemplate);
                                                } finally {
                                                    $npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                                                    $psp_chart$.rebind(_prev_bind_0_$61, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                }
                                            }
                                        } finally {
                                            $memoization_state$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql(iterative_template_parser.$$NPTemplate) && (NIL != iterative_template_parser.appropriate_span_for_np_parsingP(words, subspan))) {
                                        final SubLObject chart = iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                        final SubLObject local_state = psp_chart_memoization_state(chart);
                                        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
                                        try {
                                            $memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
                                            try {
                                                final SubLObject _prev_bind_0_$63 = $psp_chart$.currentBinding(thread);
                                                try {
                                                    $psp_chart$.bind(chart, thread);
                                                    final SubLObject np_parses = iterative_template_parser.itp_ps_get_cycls_for_phrase(words, span, iterative_template_parser.$$NounPhrase, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                    iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, np_parses, current, iterative_template_parser.$$NPTemplate);
                                                } finally {
                                                    $psp_chart$.rebind(_prev_bind_0_$63, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                }
                                            }
                                        } finally {
                                            $memoization_state$.rebind(_prev_bind_0, thread);
                                        }
                                    }

                            }
                            good = add(good, ONE_INTEGER);
                        } else
                            if (NIL != iterative_template_parser.predicative_adjp_template_categoryP(category)) {
                                if (NIL != $perform_vp_parser_expansion$.getDynamicValue(thread)) {
                                    SubLObject psp_node_if_any = NIL;
                                    SubLObject adjp_parses = NIL;
                                    final SubLObject chart2 = iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                    final SubLObject local_state2 = psp_chart_memoization_state(chart2);
                                    final SubLObject _prev_bind_3 = $memoization_state$.currentBinding(thread);
                                    try {
                                        $memoization_state$.bind(local_state2, thread);
                                        final SubLObject original_memoization_process2 = memoization_state_original_process(local_state2);
                                        try {
                                            final SubLObject _prev_bind_0_$65 = $psp_chart$.currentBinding(thread);
                                            try {
                                                $psp_chart$.bind(chart2, thread);
                                                final SubLObject _prev_bind_0_$66 = $parse_tokenization$.currentBinding(thread);
                                                final SubLObject _prev_bind_4 = $parse_tokenization_offset$.currentBinding(thread);
                                                try {
                                                    $parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                                                    $parse_tokenization_offset$.bind(span.first(), thread);
                                                    if (NIL != iterative_template_parser.asserting_treesP()) {
                                                        final SubLObject _prev_bind_0_$67 = $parse_root_node$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$68 = $reify_parse_nodesP$.currentBinding(thread);
                                                        try {
                                                            $parse_root_node$.bind(NIL, thread);
                                                            $reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                                                            adjp_parses = ps_parse_predicative_adjp(words, iterative_template_parser.pred_for_category(category), get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                            psp_node_if_any = $parse_root_node$.getDynamicValue(thread);
                                                        } finally {
                                                            $reify_parse_nodesP$.rebind(_prev_bind_1_$68, thread);
                                                            $parse_root_node$.rebind(_prev_bind_0_$67, thread);
                                                        }
                                                    } else {
                                                        adjp_parses = ps_parse_predicative_adjp(words, iterative_template_parser.pred_for_category(category), get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                    }
                                                } finally {
                                                    $parse_tokenization_offset$.rebind(_prev_bind_4, thread);
                                                    $parse_tokenization$.rebind(_prev_bind_0_$66, thread);
                                                }
                                                adjp_parses = cons(psp_node_if_any, adjp_parses);
                                                iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, adjp_parses, current, category);
                                            } finally {
                                                $psp_chart$.rebind(_prev_bind_0_$65, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                            }
                                        }
                                    } finally {
                                        $memoization_state$.rebind(_prev_bind_3, thread);
                                    }
                                }
                                good = add(good, ONE_INTEGER);
                            } else
                                if (NIL != iterative_template_parser.vbar_template_categoryP(category)) {
                                    if ((NIL != $perform_vp_parser_expansion$.getDynamicValue(thread)) && (NIL != iterative_template_parser.appropriate_span_for_vbar_parsingP(words, subspan))) {
                                        final SubLObject chart3 = iterative_template_parser.itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                        final SubLObject local_state3 = psp_chart_memoization_state(chart3);
                                        final SubLObject _prev_bind_5 = $memoization_state$.currentBinding(thread);
                                        try {
                                            $memoization_state$.bind(local_state3, thread);
                                            final SubLObject original_memoization_process3 = memoization_state_original_process(local_state3);
                                            try {
                                                final SubLObject _prev_bind_0_$69 = $psp_chart$.currentBinding(thread);
                                                try {
                                                    $psp_chart$.bind(chart3, thread);
                                                    final SubLObject vp_parses = iterative_template_parser.itp_ps_parse_vbar(words, span, category, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                    iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, vp_parses, current, category);
                                                } finally {
                                                    $psp_chart$.rebind(_prev_bind_0_$69, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    memoization_state_possibly_clear_original_process(local_state3, original_memoization_process3);
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                                }
                                            }
                                        } finally {
                                            $memoization_state$.rebind(_prev_bind_5, thread);
                                        }
                                    }
                                    good = add(good, ONE_INTEGER);
                                } else
                                    if (NIL != iterative_template_parser.number_template_categoryP(category)) {
                                        final SubLObject number_parses = list(string_to_interval(NIL != english_ordinal_number_string_p(words) ? english_ordinal_string_to_cardinal_string(words) : words));
                                        iterative_template_parser.extend_itp_state_by_ps_parse(state, absolute_span, component, number_parses, current, category);
                                        good = add(good, ONE_INTEGER);
                                    }



                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            component = cdolist_list_var.first();
        } 
        if (good.numE(parts)) {
            iterative_template_parser.add_to_itp_solution(state, current);
        }
        return state;
    }

    /**
     * should we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list
     * that is provided from the outside
     */
    @LispMethod(comment = "should we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list\r\nthat is provided from the outside\nshould we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list\nthat is provided from the outside")
    public static final SubLObject appropriate_span_for_np_parsingP_alt(SubLObject words, SubLObject subspan) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $possible_nps$.getDynamicValue(thread)) {
                return memberP(words, $possible_nps$.getDynamicValue(thread), EQUALP, UNPROVIDED);
            }
            return T;
        }
    }

    @LispMethod(comment = "should we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list\r\nthat is provided from the outside\nshould we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list\nthat is provided from the outside")
    public static SubLObject appropriate_span_for_np_parsingP(final SubLObject words, final SubLObject subspan) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != iterative_template_parser.$possible_nps$.getDynamicValue(thread)) {
            return subl_promotions.memberP(words, iterative_template_parser.$possible_nps$.getDynamicValue(thread), EQUALP, UNPROVIDED);
        }
        return T;
    }/**
     * should we try to call the PSP on WORDS/SUBSPAN?  The current implementation limits the PSP to only work on NPs on a list
     * that is provided from the outside
     */


    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject appropriate_span_for_vbar_parsingP_alt(SubLObject words, SubLObject subspan) {
        return T;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject appropriate_span_for_vbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return T;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject appropriate_span_for_nbar_parsingP_alt(SubLObject words, SubLObject subspan) {
        return T;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject appropriate_span_for_nbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return T;
    }

    public static final SubLObject itp_ps_get_cycls_for_phrase_internal_alt(SubLObject words, SubLObject span, SubLObject category, SubLObject pos_pred, SubLObject non_trivialP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject psp_node_if_any = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
                        {
                            SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_75 = parsing_vars.$parse_tokenization$.currentBinding(thread);
                                SubLObject _prev_bind_1 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
                                try {
                                    parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                                    parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) {
                                        {
                                            SubLObject _prev_bind_0_76 = parsing_vars.$parse_root_node$.currentBinding(thread);
                                            SubLObject _prev_bind_1_77 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                                            try {
                                                parsing_vars.$parse_root_node$.bind(NIL, thread);
                                                parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                                                ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                                                psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                                            } finally {
                                                parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_77, thread);
                                                parsing_vars.$parse_root_node$.rebind(_prev_bind_0_76, thread);
                                            }
                                        }
                                    } else {
                                        ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_1, thread);
                                    parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_75, thread);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return cons(psp_node_if_any, ans);
            }
        }
    }

    public static SubLObject itp_ps_get_cycls_for_phrase_internal(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject psp_node_if_any = NIL;
        final SubLObject _prev_bind_0 = $psp_return_mode$.currentBinding(thread);
        try {
            $psp_return_mode$.bind($psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = $parse_tokenization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $parse_tokenization_offset$.currentBinding(thread);
            try {
                $parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                $parse_tokenization_offset$.bind(span.first(), thread);
                if (NIL != iterative_template_parser.asserting_treesP()) {
                    final SubLObject _prev_bind_0_$73 = $parse_root_node$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$74 = $reify_parse_nodesP$.currentBinding(thread);
                    try {
                        $parse_root_node$.bind(NIL, thread);
                        $reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                        ans = ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                        psp_node_if_any = $parse_root_node$.getDynamicValue(thread);
                    } finally {
                        $reify_parse_nodesP$.rebind(_prev_bind_1_$74, thread);
                        $parse_root_node$.rebind(_prev_bind_0_$73, thread);
                    }
                } else {
                    ans = ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                $parse_tokenization_offset$.rebind(_prev_bind_2, thread);
                $parse_tokenization$.rebind(_prev_bind_0_$72, thread);
            }
        } finally {
            $psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return cons(psp_node_if_any, ans);
    }

    public static final SubLObject itp_ps_get_cycls_for_phrase_alt(SubLObject words, SubLObject span, SubLObject category, SubLObject pos_pred, SubLObject non_trivialP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ITP_PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ITP_PS_GET_CYCLS_FOR_PHRASE, SIX_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ITP_PS_GET_CYCLS_FOR_PHRASE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(words, span, category, pos_pred, non_trivialP, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (words.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (span.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (category.equalp(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (pos_pred.equalp(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (non_trivialP.equalp(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
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
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(words, span, category, pos_pred, non_trivialP, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject itp_ps_get_cycls_for_phrase(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return iterative_template_parser.itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt);
        }
        caching_state = memoization_state_lookup(v_memoization_state, iterative_template_parser.ITP_PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), iterative_template_parser.ITP_PS_GET_CYCLS_FOR_PHRASE, SIX_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state_put(v_memoization_state, iterative_template_parser.ITP_PS_GET_CYCLS_FOR_PHRASE, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_6(words, span, category, pos_pred, non_trivialP, mt);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (words.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (span.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pos_pred.equalp(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (non_trivialP.equalp(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                        return caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(iterative_template_parser.itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(words, span, category, pos_pred, non_trivialP, mt));
        return caching_results(results3);
    }

    public static final SubLObject itp_ps_parse_vbar_internal_alt(SubLObject words, SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_pred = com.cyc.cycjava.cycl.rtp.iterative_template_parser.pred_for_category(category);
                SubLObject gap_type = com.cyc.cycjava.cycl.rtp.iterative_template_parser.gap_type_for_category(category);
                SubLObject psp_node_if_any = NIL;
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$parse_tokenization$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
                        parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                        parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.asserting_treesP()) {
                            {
                                SubLObject _prev_bind_0_78 = parsing_vars.$parse_root_node$.currentBinding(thread);
                                SubLObject _prev_bind_1_79 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                                try {
                                    parsing_vars.$parse_root_node$.bind(NIL, thread);
                                    parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                                    ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
                                    psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                                } finally {
                                    parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_79, thread);
                                    parsing_vars.$parse_root_node$.rebind(_prev_bind_0_78, thread);
                                }
                            }
                        } else {
                            ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
                        }
                    } finally {
                        parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_2, thread);
                        parsing_vars.$parse_tokenization$.rebind(_prev_bind_1, thread);
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return cons(psp_node_if_any, ans);
            }
        }
    }

    public static SubLObject itp_ps_parse_vbar_internal(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_pred = iterative_template_parser.pred_for_category(category);
        final SubLObject gap_type = iterative_template_parser.gap_type_for_category(category);
        SubLObject psp_node_if_any = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $parse_tokenization$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $parse_tokenization_offset$.currentBinding(thread);
        try {
            $psp_return_mode$.bind($psp_return_mode$.getDynamicValue(thread), thread);
            $parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
            $parse_tokenization_offset$.bind(span.first(), thread);
            if (NIL != iterative_template_parser.asserting_treesP()) {
                final SubLObject _prev_bind_0_$75 = $parse_root_node$.currentBinding(thread);
                final SubLObject _prev_bind_1_$76 = $reify_parse_nodesP$.currentBinding(thread);
                try {
                    $parse_root_node$.bind(NIL, thread);
                    $reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                    ans = ps_parse_vbar(words, pos_pred, get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
                    psp_node_if_any = $parse_root_node$.getDynamicValue(thread);
                } finally {
                    $reify_parse_nodesP$.rebind(_prev_bind_1_$76, thread);
                    $parse_root_node$.rebind(_prev_bind_0_$75, thread);
                }
            } else {
                ans = ps_parse_vbar(words, pos_pred, get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
            }
        } finally {
            $parse_tokenization_offset$.rebind(_prev_bind_3, thread);
            $parse_tokenization$.rebind(_prev_bind_2, thread);
            $psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return cons(psp_node_if_any, ans);
    }

    public static final SubLObject itp_ps_parse_vbar_alt(SubLObject words, SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_parse_vbar_internal(words, span, category, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ITP_PS_PARSE_VBAR, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ITP_PS_PARSE_VBAR, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ITP_PS_PARSE_VBAR, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(words, span, category, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (words.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (span.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (category.equalp(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_ps_parse_vbar_internal(words, span, category, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(words, span, category, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject itp_ps_parse_vbar(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return iterative_template_parser.itp_ps_parse_vbar_internal(words, span, category, mt);
        }
        caching_state = memoization_state_lookup(v_memoization_state, iterative_template_parser.ITP_PS_PARSE_VBAR, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), iterative_template_parser.ITP_PS_PARSE_VBAR, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state_put(v_memoization_state, iterative_template_parser.ITP_PS_PARSE_VBAR, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_4(words, span, category, mt);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (words.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (span.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                return caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(iterative_template_parser.itp_ps_parse_vbar_internal(words, span, category, mt)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(words, span, category, mt));
        return caching_results(results3);
    }

    /**
     *
     *
     * @param STATE
    itp-state
     * 		
     * @param SPAN-WITH-THE-LIST
     * 		naut; (#$TheList NUM1 NUM2...NUMN)
     * @param WORDS
    string
     * 		
     * @return psp-chart
    find a chart that covers all the words in SPAN-WITH-THE-LIST
    note: store the spans in the dictionary without #$TheList
     */
    @LispMethod(comment = "@param STATE\nitp-state\r\n\t\t\r\n@param SPAN-WITH-THE-LIST\r\n\t\tnaut; (#$TheList NUM1 NUM2...NUMN)\r\n@param WORDS\nstring\r\n\t\t\r\n@return psp-chart\r\nfind a chart that covers all the words in SPAN-WITH-THE-LIST\r\nnote: store the spans in the dictionary without #$TheList")
    public static final SubLObject itp_find_or_create_appropriate_chart_alt(SubLObject state, SubLObject span_with_the_list, SubLObject words, SubLObject lex_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject chart_dictionary = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_psp_charts(state);
                SubLObject span = span_with_the_list.rest();
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary));
                while (!((NIL != result) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject chart = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_subspanP(span, chart_span)) {
                            result = chart;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                if (NIL == result) {
                    result = com.cyc.cycjava.cycl.rtp.iterative_template_parser.get_chart_from_extra_psp_charts(words);
                }
                if (NIL == result) {
                    {
                        SubLObject new_chart = psp_syntax.psp_chart_for_string(words, psp_lexicon.get_default_psp_lexicon(lex_mt, UNPROVIDED, UNPROVIDED), $NONE, NIL);
                        dictionary.dictionary_enter(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_psp_charts(state), copy_list(span), new_chart);
                        result = new_chart;
                    }
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt238$length_of_chart_for__S____S__, words, psp_chart.psp_edge_count(result)));
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param STATE
    itp-state
     * 		
     * @param SPAN-WITH-THE-LIST
     * 		naut; (#$TheList NUM1 NUM2...NUMN)
     * @param WORDS
    string
     * 		
     * @return psp-chart
    find a chart that covers all the words in SPAN-WITH-THE-LIST
    note: store the spans in the dictionary without #$TheList
     */
    @LispMethod(comment = "@param STATE\nitp-state\r\n\t\t\r\n@param SPAN-WITH-THE-LIST\r\n\t\tnaut; (#$TheList NUM1 NUM2...NUMN)\r\n@param WORDS\nstring\r\n\t\t\r\n@return psp-chart\r\nfind a chart that covers all the words in SPAN-WITH-THE-LIST\r\nnote: store the spans in the dictionary without #$TheList")
    public static SubLObject itp_find_or_create_appropriate_chart(final SubLObject state, final SubLObject span_with_the_list, final SubLObject words, final SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_dictionary = iterative_template_parser.itp_state_psp_charts(state);
        final SubLObject span = span_with_the_list.rest();
        SubLObject result;
        SubLObject iteration_state;
        for (result = NIL, iteration_state = do_dictionary_contents_state(dictionary_contents(chart_dictionary)); (NIL == result) && (NIL == do_dictionary_contents_doneP(iteration_state)); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != iterative_template_parser.itp_subspanP(span, chart_span)) {
                result = chart;
            }
        }
        do_dictionary_contents_finalize(iteration_state);
        if (NIL == result) {
            result = iterative_template_parser.get_chart_from_extra_psp_charts(words);
        }
        if (NIL == result) {
            final SubLObject new_chart = psp_chart_for_string(words, get_default_psp_lexicon(lex_mt, UNPROVIDED, UNPROVIDED), $NONE, NIL);
            dictionary_enter(iterative_template_parser.itp_state_psp_charts(state), copy_list(span), new_chart);
            result = new_chart;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            recognition.rtp_tracer_output(ONE_INTEGER, list(iterative_template_parser.$str245$length_of_chart_for__S____S__, words, psp_edge_count(result)));
        }
        return result;
    }

    public static final SubLObject get_chart_from_extra_psp_charts_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject good_chart = NIL;
                if (NIL == good_chart) {
                    {
                        SubLObject csome_list_var = parsing_vars.$psp_extra_charts$.getDynamicValue(thread);
                        SubLObject chart = NIL;
                        for (chart = csome_list_var.first(); !((NIL != good_chart) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , chart = csome_list_var.first()) {
                            if (NIL != psp_main.psp_find_string_in_chart(string, chart)) {
                                good_chart = chart;
                            }
                        }
                    }
                }
                return good_chart;
            }
        }
    }

    public static SubLObject get_chart_from_extra_psp_charts(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good_chart = NIL;
        if (NIL == good_chart) {
            SubLObject csome_list_var = $psp_extra_charts$.getDynamicValue(thread);
            SubLObject chart = NIL;
            chart = csome_list_var.first();
            while ((NIL == good_chart) && (NIL != csome_list_var)) {
                if (NIL != psp_find_string_in_chart(string, chart)) {
                    good_chart = chart;
                }
                csome_list_var = csome_list_var.rest();
                chart = csome_list_var.first();
            } 
        }
        return good_chart;
    }

    public static final SubLObject itp_subspanP_alt(SubLObject subspan, SubLObject superspan) {
        return search(subspan, superspan, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itp_subspanP(final SubLObject subspan, final SubLObject superspan) {
        return search(subspan, superspan, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * This function presently only used in the course of calls to the VP-parser
     *
     * @param CAT
    fort
     * 		
     * @return keyword; the type of gap to be found in the VP
     */
    @LispMethod(comment = "This function presently only used in the course of calls to the VP-parser\r\n\r\n@param CAT\nfort\r\n\t\t\r\n@return keyword; the type of gap to be found in the VP")
    public static final SubLObject gap_type_for_category_alt(SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(cat)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.fpred_value(cat, $$gapTypeForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == result) {
                    return $NONE;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "This function presently only used in the course of calls to the VP-parser\r\n\r\n@param CAT\n\t\tfort\r\n\t\t\r\n@return keyword; the type of gap to be found in the VP")
    public static SubLObject gap_type_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(cat)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = fpred_value(cat, iterative_template_parser.$$gapTypeForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            return $NONE;
        }
        return result;
    }/**
     * This function presently only used in the course of calls to the VP-parser
     *
     * @param CAT
    		fort
     * 		
     * @return keyword; the type of gap to be found in the VP
     */


    /**
     * This function presently only used in the course of calls to the VP-parser
     *
     * @param CAT
    fort
     * 		
     * @return cycl-predicate; the pos-predicate that corresponds to the template-category CAT
     */
    @LispMethod(comment = "This function presently only used in the course of calls to the VP-parser\r\n\r\n@param CAT\nfort\r\n\t\t\r\n@return cycl-predicate; the pos-predicate that corresponds to the template-category CAT")
    public static final SubLObject pred_for_category_alt(SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(cat)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.fpred_value(cat, $$posPredForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == result) {
                    Errors.warn($str_alt241$sent_a_weird_category___S__to_pre, cat);
                    return $$verbStrings;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "This function presently only used in the course of calls to the VP-parser\r\n\r\n@param CAT\n\t\tfort\r\n\t\t\r\n@return cycl-predicate; the pos-predicate that corresponds to the template-category CAT")
    public static SubLObject pred_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(cat)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = fpred_value(cat, iterative_template_parser.$$posPredForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn(iterative_template_parser.$str248$sent_a_weird_category___S__to_pre, cat);
            return iterative_template_parser.$$verbStrings;
        }
        return result;
    }/**
     * This function presently only used in the course of calls to the VP-parser
     *
     * @param CAT
    		fort
     * 		
     * @return cycl-predicate; the pos-predicate that corresponds to the template-category CAT
     */


    /**
     * given a particular pos-pred PRED, return the template-category that best
     * corresponds to PRED-form words
     *
     * @param PRED
    predicate
     * 		
     * @return instance of #$ParsingTemplateCategory
     */
    @LispMethod(comment = "given a particular pos-pred PRED, return the template-category that best\r\ncorresponds to PRED-form words\r\n\r\n@param PRED\npredicate\r\n\t\t\r\n@return instance of #$ParsingTemplateCategory\ngiven a particular pos-pred PRED, return the template-category that best\ncorresponds to PRED-form words")
    public static final SubLObject rtp_cat_for_pred_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(pred)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.fpred_value(pred, $$posPredForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == result) {
                    Errors.warn($str_alt243$sent_a_non_categorized_pred___S__, pred);
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "given a particular pos-pred PRED, return the template-category that best\r\ncorresponds to PRED-form words\r\n\r\n@param PRED\n\t\tpredicate\r\n\t\t\r\n@return instance of #$ParsingTemplateCategory\ngiven a particular pos-pred PRED, return the template-category that best\ncorresponds to PRED-form words")
    public static SubLObject rtp_cat_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == fort_p(pred)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = fpred_value(pred, iterative_template_parser.$$posPredForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn(iterative_template_parser.$str250$sent_a_non_categorized_pred___S__, pred);
        }
        return result;
    }/**
     * given a particular pos-pred PRED, return the template-category that best
     * corresponds to PRED-form words
     *
     * @param PRED
    		predicate
     * 		
     * @return instance of #$ParsingTemplateCategory
     */


    /**
     * given a particular part-of-speech POS, return the template-category that best
     * corresponds to POS words
     *
     * @param POS
    fort
     * 		
     * @return instance of #$ParsingTemplateCategory
     */
    @LispMethod(comment = "given a particular part-of-speech POS, return the template-category that best\r\ncorresponds to POS words\r\n\r\n@param POS\nfort\r\n\t\t\r\n@return instance of #$ParsingTemplateCategory\ngiven a particular part-of-speech POS, return the template-category that best\ncorresponds to POS words")
    public static final SubLObject rtp_cat_for_pos_alt(SubLObject pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(pos)) {
                return NIL;
            }
            {
                SubLObject pcase_var = pos;
                if (pcase_var.eql($$Noun)) {
                    return $$NPTemplate;
                } else {
                    {
                        SubLObject result = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                                result = kb_mapping_utilities.fpred_value(pos, $$posForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == result) {
                            Errors.warn($str_alt246$sent_un_categorized_category__s_t, pos);
                        }
                        return result;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "given a particular part-of-speech POS, return the template-category that best\r\ncorresponds to POS words\r\n\r\n@param POS\n\t\tfort\r\n\t\t\r\n@return instance of #$ParsingTemplateCategory\ngiven a particular part-of-speech POS, return the template-category that best\ncorresponds to POS words")
    public static SubLObject rtp_cat_for_pos(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == fort_p(pos)) {
            return NIL;
        }
        if (pos.eql(iterative_template_parser.$$Noun)) {
            return iterative_template_parser.$$NPTemplate;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = fpred_value(pos, iterative_template_parser.$$posForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn(iterative_template_parser.$str253$sent_un_categorized_category__s_t, pos);
        }
        return result;
    }/**
     * given a particular part-of-speech POS, return the template-category that best
     * corresponds to POS words
     *
     * @param POS
    		fort
     * 		
     * @return instance of #$ParsingTemplateCategory
     */


    /**
     * given a particular template-parser category CAT, return the POS that best
     * corresponds to CAT constituents
     *
     * @param CAT
     * 		instance of #$ParsingTemplateCategory
     * @return pos; a fort
     */
    @LispMethod(comment = "given a particular template-parser category CAT, return the POS that best\r\ncorresponds to CAT constituents\r\n\r\n@param CAT\r\n\t\tinstance of #$ParsingTemplateCategory\r\n@return pos; a fort\ngiven a particular template-parser category CAT, return the POS that best\ncorresponds to CAT constituents")
    public static final SubLObject pos_for_rtp_cat_alt(SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(cat)) {
                return NIL;
            }
            {
                SubLObject pcase_var = cat;
                if (pcase_var.eql($$NPTemplate)) {
                    return $$Noun;
                } else {
                    {
                        SubLObject result = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                                result = kb_mapping_utilities.fpred_value(cat, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == result) {
                            Errors.warn($str_alt246$sent_un_categorized_category__s_t, cat);
                        }
                        return result;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "given a particular template-parser category CAT, return the POS that best\r\ncorresponds to CAT constituents\r\n\r\n@param CAT\r\n\t\tinstance of #$ParsingTemplateCategory\r\n@return pos; a fort\ngiven a particular template-parser category CAT, return the POS that best\ncorresponds to CAT constituents")
    public static SubLObject pos_for_rtp_cat(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == fort_p(cat)) {
            return NIL;
        }
        if (cat.eql(iterative_template_parser.$$NPTemplate)) {
            return iterative_template_parser.$$Noun;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = fpred_value(cat, iterative_template_parser.$$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn(iterative_template_parser.$str253$sent_un_categorized_category__s_t, cat);
        }
        return result;
    }/**
     * given a particular template-parser category CAT, return the POS that best
     * corresponds to CAT constituents
     *
     * @param CAT
     * 		instance of #$ParsingTemplateCategory
     * @return pos; a fort
     */


    /**
     *
     *
     * @unknown shouldn't just return the first one...
     */
    @LispMethod(comment = "@unknown shouldn\'t just return the first one...")
    public static final SubLObject best_rtp_cat_for_preds_alt(SubLObject preds) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = preds;
                    SubLObject pred = NIL;
                    for (pred = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                        result = com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_cat_for_pred(pred);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown shouldn't just return the first one...
     */
    @LispMethod(comment = "@unknown shouldn\'t just return the first one...")
    public static SubLObject best_rtp_cat_for_preds(final SubLObject preds) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = preds, pred = NIL, pred = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = iterative_template_parser.rtp_cat_for_pred(pred) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return result;
    }

    public static final SubLObject clear_verb_phrasal_template_categoryP_alt() {
        {
            SubLObject cs = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_verb_phrasal_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_verb_phrasal_template_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($verb_phrasal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_verb_phrasal_template_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject verb_phrasal_template_categoryP_internal_alt(SubLObject category) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.verbal_template_categoryP(category)) && (NIL == genls.genl_in_any_mtP(category, $$STemplate)));
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject verb_phrasal_template_categoryP_internal(final SubLObject category) {
        return makeBoolean((NIL != iterative_template_parser.verbal_template_categoryP(category)) && (NIL == genl_in_any_mtP(category, iterative_template_parser.$$STemplate)));
    }

    public static final SubLObject verb_phrasal_template_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym247$VERB_PHRASAL_TEMPLATE_CATEGORY_, $sym248$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.verb_phrasal_template_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject verb_phrasal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_, iterative_template_parser.$sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int$64, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.verb_phrasal_template_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_verbal_template_categoryP_alt() {
        {
            SubLObject cs = $verbal_template_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_verbal_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_verbal_template_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($verbal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_verbal_template_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject verbal_template_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return memberP($$Verb, result, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject verbal_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = pred_values(category, iterative_template_parser.$$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$$Verb, result, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject verbal_template_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $verbal_template_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym249$VERBAL_TEMPLATE_CATEGORY_, $sym250$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.verbal_template_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject verbal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym257$VERBAL_TEMPLATE_CATEGORY_, iterative_template_parser.$sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int$64, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.verbal_template_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_vbar_template_categoryP_alt() {
        {
            SubLObject cs = $vbar_template_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_vbar_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_vbar_template_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_vbar_template_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject vbar_template_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = genls.genlP(category, $$VBarTemplate, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genlP(category, iterative_template_parser.$$VBarTemplate, UNPROVIDED, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject vbar_template_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $vbar_template_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym251$VBAR_TEMPLATE_CATEGORY_, $sym253$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.vbar_template_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym259$VBAR_TEMPLATE_CATEGORY_, iterative_template_parser.$sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.vbar_template_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_rtp_vbar_template_categoryP_alt() {
        {
            SubLObject cs = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rtp_vbar_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rtp_vbar_template_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($rtp_vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rtp_vbar_template_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a #$RTP*VBarTemplate
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a #$RTP*VBarTemplate")
    public static final SubLObject rtp_vbar_template_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind($$RTPVBarTemplateMt, thread);
                        {
                            SubLObject template = NIL;
                            SubLObject pred_var = $$assertTemplate_Reln;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(category, TWO_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(category, TWO_INTEGER, pred_var);
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
                                                            SubLObject done_var_80 = NIL;
                                                            SubLObject token_var_81 = NIL;
                                                            while (NIL == done_var_80) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_81);
                                                                    SubLObject valid_82 = makeBoolean(token_var_81 != assertion);
                                                                    if (NIL != valid_82) {
                                                                        template = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                        if (NIL != genls.genlP(template, $$VPTemplate, UNPROVIDED, UNPROVIDED)) {
                                                                            result = T;
                                                                        }
                                                                    }
                                                                    done_var_80 = makeBoolean(NIL == valid_82);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_83, thread);
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
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a #$RTP*VBarTemplate
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a #$RTP*VBarTemplate")
    public static SubLObject rtp_vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(iterative_template_parser.$$RTPVBarTemplateMt, thread);
            SubLObject template = NIL;
            final SubLObject pred_var = iterative_template_parser.$$assertTemplate_Reln;
            if (NIL != do_gaf_arg_index_key_validator(category, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(category, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$77 = NIL;
                            final SubLObject token_var_$78 = NIL;
                            while (NIL == done_var_$77) {
                                final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$78);
                                final SubLObject valid_$79 = makeBoolean(!token_var_$78.eql(assertion));
                                if (NIL != valid_$79) {
                                    template = gaf_arg(assertion, ONE_INTEGER);
                                    if (NIL != genlP(template, iterative_template_parser.$$VPTemplate, UNPROVIDED, UNPROVIDED)) {
                                        result = T;
                                    }
                                }
                                done_var_$77 = makeBoolean(NIL == valid_$79);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rtp_vbar_template_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym254$RTP_VBAR_TEMPLATE_CATEGORY_, $sym258$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_vbar_template_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rtp_vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym262$RTP_VBAR_TEMPLATE_CATEGORY_, iterative_template_parser.$sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.rtp_vbar_template_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject extended_vbar_template_categoryP_alt(SubLObject category) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.vbar_template_categoryP(category)) || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_vbar_template_categoryP(category)));
    }

    public static SubLObject extended_vbar_template_categoryP(final SubLObject category) {
        return makeBoolean((NIL != iterative_template_parser.vbar_template_categoryP(category)) || (NIL != iterative_template_parser.rtp_vbar_template_categoryP(category)));
    }

    public static final SubLObject clear_predicative_adjp_template_categoryP_alt() {
        {
            SubLObject cs = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_predicative_adjp_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_predicative_adjp_template_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($predicative_adjp_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_predicative_adjp_template_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject predicative_adjp_template_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = genls.genlP(category, $$AdjPTemplate_Predicative, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject predicative_adjp_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genlP(category, iterative_template_parser.$$AdjPTemplate_Predicative, UNPROVIDED, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject predicative_adjp_template_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym259$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_, $sym261$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.predicative_adjp_template_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject predicative_adjp_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_, iterative_template_parser.$sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.predicative_adjp_template_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_nominal_categoryP_alt() {
        {
            SubLObject cs = $nominal_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_nominal_categoryP() {
        final SubLObject cs = iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_nominal_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($nominal_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_nominal_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject nominal_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return memberP($$Noun, result, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject nominal_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = pred_values(category, iterative_template_parser.$$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$$Noun, result, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject nominal_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $nominal_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym262$NOMINAL_CATEGORY_, $sym263$_NOMINAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.nominal_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject nominal_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym269$NOMINAL_CATEGORY_, iterative_template_parser.$sym270$_NOMINAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.nominal_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_adjectival_categoryP_alt() {
        {
            SubLObject cs = $adjectival_categoryP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_adjectival_categoryP() {
        final SubLObject cs = iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_adjectival_categoryP_alt(SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($adjectival_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_adjectival_categoryP(final SubLObject category) {
        return caching_state_remove_function_results_with_args(iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static final SubLObject adjectival_categoryP_internal_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(category)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                        result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return memberP($$Adjective, result, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param CATEGORY
     * 		atom; ostensibly a ParsingTemplateCategory
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tatom; ostensibly a ParsingTemplateCategory")
    public static SubLObject adjectival_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            $mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = pred_values(category, iterative_template_parser.$$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$$Adjective, result, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject adjectival_categoryP_alt(SubLObject category) {
        {
            SubLObject caching_state = $adjectival_categoryP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym264$ADJECTIVAL_CATEGORY_, $sym266$_ADJECTIVAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, category, $kw223$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw223$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.adjectival_categoryP_internal(category)));
                    memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject adjectival_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(iterative_template_parser.$sym271$ADJECTIVAL_CATEGORY_, iterative_template_parser.$sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, category, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(iterative_template_parser.adjectival_categoryP_internal(category)));
            caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject number_template_categoryP_alt(SubLObject category) {
        return memberP(category, $list_alt267, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject number_template_categoryP(final SubLObject category) {
        return subl_promotions.memberP(category, iterative_template_parser.$list274, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD-CAT
     * 		instance of #$SpeechPart
     */
    @LispMethod(comment = "@param WORD-CAT\r\n\t\tinstance of #$SpeechPart")
    public static final SubLObject verbal_categoryP_alt(SubLObject word_cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return lexicon_accessors.genl_posP(word_cat, $$Verb, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @param WORD-CAT
     * 		instance of #$SpeechPart
     */
    @LispMethod(comment = "@param WORD-CAT\r\n\t\tinstance of #$SpeechPart")
    public static SubLObject verbal_categoryP(final SubLObject word_cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genl_posP(word_cat, iterative_template_parser.$$Verb, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
    }

    public static final SubLObject expand_itp_state_completely_alt(SubLObject state, SubLObject mt) {
        while (queues.p_queue_size(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_work_set(state)).isPositive()) {
            com.cyc.cycjava.cycl.rtp.iterative_template_parser.expand_itp_state(state, mt);
        } 
        return state;
    }

    public static SubLObject expand_itp_state_completely(final SubLObject state, final SubLObject mt) {
        while (p_queue_size(iterative_template_parser.itp_state_work_set(state)).isPositive()) {
            iterative_template_parser.expand_itp_state(state, mt);
        } 
        return state;
    }

    public static final SubLObject itp_node_max_child_span_length_alt(SubLObject node) {
        {
            SubLObject biggest_kid = list_utilities.extremal(rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node)), $sym220$_, RESULT_OF_PARSING_SPAN_LENGTH);
            if (NIL != biggest_kid) {
                return parsing_utilities.result_of_parsing_span_length(biggest_kid);
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    public static SubLObject itp_node_max_child_span_length(final SubLObject node) {
        final SubLObject biggest_kid = extremal(rkf_ch_gather_parsing_surrogates(iterative_template_parser.itp_node_new_parse(node)), iterative_template_parser.$sym229$_, iterative_template_parser.RESULT_OF_PARSING_SPAN_LENGTH);
        if (NIL != biggest_kid) {
            return result_of_parsing_span_length(biggest_kid);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject itp_output_sorting_function_alt(SubLObject item) {
        {
            SubLObject span = item.first();
            return add(multiply(length(span), $int$100), span.first());
        }
    }

    public static SubLObject itp_output_sorting_function(final SubLObject item) {
        final SubLObject span = item.first();
        return add(multiply(length(span), $int$100), span.first());
    }

    /**
     * Take the relative span, given the absolute span, and map it into
     * absolute coordinates again. Thus, for absolute (2 3 4), the span
     * (1) should come back as (3). The relative span can be TheList
     * or not.
     */
    @LispMethod(comment = "Take the relative span, given the absolute span, and map it into\r\nabsolute coordinates again. Thus, for absolute (2 3 4), the span\r\n(1) should come back as (3). The relative span can be TheList\r\nor not.\nTake the relative span, given the absolute span, and map it into\nabsolute coordinates again. Thus, for absolute (2 3 4), the span\n(1) should come back as (3). The relative span can be TheList\nor not.")
    public static final SubLObject compute_correct_span_alt(SubLObject absolute, SubLObject relative) {
        {
            SubLObject offset = second(absolute);
            SubLObject new_span = NIL;
            SubLObject numeric_part = (relative.first() == $$TheList) ? ((SubLObject) (relative.rest())) : relative;
            SubLObject numeric_base = absolute.rest();
            if (NIL != search(numeric_part, numeric_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return relative;
            }
            {
                SubLObject cdolist_list_var = relative;
                SubLObject position = NIL;
                for (position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , position = cdolist_list_var.first()) {
                    if (position.isNumber()) {
                        new_span = cons(add(offset, position), new_span);
                    } else {
                        new_span = cons(position, new_span);
                    }
                }
            }
            return nreverse(new_span);
        }
    }

    @LispMethod(comment = "Take the relative span, given the absolute span, and map it into\r\nabsolute coordinates again. Thus, for absolute (2 3 4), the span\r\n(1) should come back as (3). The relative span can be TheList\r\nor not.\nTake the relative span, given the absolute span, and map it into\nabsolute coordinates again. Thus, for absolute (2 3 4), the span\n(1) should come back as (3). The relative span can be TheList\nor not.")
    public static SubLObject compute_correct_span(final SubLObject absolute, final SubLObject relative) {
        final SubLObject offset = second(absolute);
        SubLObject new_span = NIL;
        final SubLObject numeric_part = (relative.first().eql(iterative_template_parser.$$TheList)) ? relative.rest() : relative;
        final SubLObject numeric_base = absolute.rest();
        if (NIL != search(numeric_part, numeric_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return relative;
        }
        SubLObject cdolist_list_var = relative;
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (position.isNumber()) {
                new_span = cons(add(offset, position), new_span);
            } else {
                new_span = cons(position, new_span);
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return nreverse(new_span);
    }/**
     * Take the relative span, given the absolute span, and map it into
     * absolute coordinates again. Thus, for absolute (2 3 4), the span
     * (1) should come back as (3). The relative span can be TheList
     * or not.
     */


    /**
     * Extract the #$TheList spans and adjust the numbers in them to the
     * correct settings, using the span passed in as the base value.
     */
    @LispMethod(comment = "Extract the #$TheList spans and adjust the numbers in them to the\r\ncorrect settings, using the span passed in as the base value.\nExtract the #$TheList spans and adjust the numbers in them to the\ncorrect settings, using the span passed in as the base value.")
    public static final SubLObject adjust_the_spans_alt(SubLObject formula, SubLObject span, SubLObject span_test) {
        if (span_test == UNPROVIDED) {
            span_test = $sym270$IS_THIS_A_THELIST_SPAN_;
        }
        {
            SubLObject lists = list_utilities.tree_gather(formula, span_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject base_span = (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.is_this_a_thelist_spanP(span)) ? ((SubLObject) (span.rest())) : span;
            SubLObject cdolist_list_var = lists;
            SubLObject a_span = NIL;
            for (a_span = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , a_span = cdolist_list_var.first()) {
                {
                    SubLObject spot = a_span;
                    SubLObject cdolist_list_var_84 = a_span;
                    SubLObject number = NIL;
                    for (number = cdolist_list_var_84.first(); NIL != cdolist_list_var_84; cdolist_list_var_84 = cdolist_list_var_84.rest() , number = cdolist_list_var_84.first()) {
                        if (number.isNumber()) {
                            {
                                SubLObject index = nth(number, base_span);
                                if (NIL != index) {
                                    nsubst(index, number, spot, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        spot = spot.rest();
                    }
                }
            }
            return formula;
        }
    }

    @LispMethod(comment = "Extract the #$TheList spans and adjust the numbers in them to the\r\ncorrect settings, using the span passed in as the base value.\nExtract the #$TheList spans and adjust the numbers in them to the\ncorrect settings, using the span passed in as the base value.")
    public static SubLObject adjust_the_spans(final SubLObject formula, final SubLObject span, SubLObject span_test) {
        if (span_test == UNPROVIDED) {
            span_test = iterative_template_parser.$sym277$IS_THIS_A_THELIST_SPAN_;
        }
        final SubLObject lists = tree_gather(formula, span_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject base_span = (NIL != iterative_template_parser.is_this_a_thelist_spanP(span)) ? span.rest() : span;
        SubLObject cdolist_list_var = lists;
        SubLObject a_span = NIL;
        a_span = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject spot = a_span;
            SubLObject cdolist_list_var_$81 = a_span;
            SubLObject number = NIL;
            number = cdolist_list_var_$81.first();
            while (NIL != cdolist_list_var_$81) {
                if (number.isNumber()) {
                    final SubLObject index = nth(number, base_span);
                    if (NIL != index) {
                        nsubst(index, number, spot, UNPROVIDED, UNPROVIDED);
                    }
                }
                spot = spot.rest();
                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                number = cdolist_list_var_$81.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            a_span = cdolist_list_var.first();
        } 
        return formula;
    }/**
     * Extract the #$TheList spans and adjust the numbers in them to the
     * correct settings, using the span passed in as the base value.
     */


    public static final SubLObject is_this_a_thelist_spanP_alt(SubLObject obj) {
        if (!(obj.isCons() && (obj.first() == $$TheList))) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = obj.rest();
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                if (!part.isFixnum()) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject is_this_a_thelist_spanP(final SubLObject obj) {
        if ((!obj.isCons()) || (!obj.first().eql(iterative_template_parser.$$TheList))) {
            return NIL;
        }
        SubLObject cdolist_list_var = obj.rest();
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject is_this_a_numeric_spanP_alt(SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = obj;
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                if (!part.isFixnum()) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject is_this_a_numeric_spanP(final SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        SubLObject cdolist_list_var = obj;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return SPAN ; the possibly-fragmented span covered by the specified dependent(s)
     */
    @LispMethod(comment = "@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return SPAN ; the possibly-fragmented span covered by the specified dependent(s)")
    public static final SubLObject dependent_span_coverage_alt(SubLObject dependents) {
        {
            SubLObject dep_coverage = new_set(UNPROVIDED, UNPROVIDED);
            SubLObject dep_span = NIL;
            SubLObject cdolist_list_var = dependents;
            SubLObject this_dep = NIL;
            for (this_dep = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_dep = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(this_dep)) {
                    dep_span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(this_dep);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.is_this_a_thelist_spanP(this_dep)) {
                        dep_span = this_dep.rest();
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.is_this_a_numeric_spanP(this_dep)) {
                            dep_span = this_dep;
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_85 = dep_span;
                    SubLObject n = NIL;
                    for (n = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , n = cdolist_list_var_85.first()) {
                        set_add(n, dep_coverage);
                    }
                }
            }
            return Sort.sort(set_element_list(dep_coverage), $sym271$_, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return SPAN ; the possibly-fragmented span covered by the specified dependent(s)
     */
    @LispMethod(comment = "@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return SPAN ; the possibly-fragmented span covered by the specified dependent(s)")
    public static SubLObject dependent_span_coverage(final SubLObject dependents) {
        final SubLObject dep_coverage = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject dep_span = NIL;
        SubLObject cdolist_list_var = dependents;
        SubLObject this_dep = NIL;
        this_dep = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != iterative_template_parser.itp_node_p(this_dep)) {
                dep_span = iterative_template_parser.itp_node_span(this_dep);
            } else
                if (NIL != iterative_template_parser.is_this_a_thelist_spanP(this_dep)) {
                    dep_span = this_dep.rest();
                } else
                    if (NIL != iterative_template_parser.is_this_a_numeric_spanP(this_dep)) {
                        dep_span = this_dep;
                    }


            SubLObject cdolist_list_var_$82 = dep_span;
            SubLObject n = NIL;
            n = cdolist_list_var_$82.first();
            while (NIL != cdolist_list_var_$82) {
                set.set_add(n, dep_coverage);
                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                n = cdolist_list_var_$82.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            this_dep = cdolist_list_var.first();
        } 
        return Sort.sort(set.set_element_list(dep_coverage), iterative_template_parser.$sym278$_, UNPROVIDED);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; whose full span we care about
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return SPAN ; the initial span not covered by the specified dependent(s)
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; whose full span we care about\r\n@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return SPAN ; the initial span not covered by the specified dependent(s)")
    public static final SubLObject initial_span_gap_alt(SubLObject self, SubLObject dependents) {
        SubLTrampolineFile.checkType(self, ITP_NODE_P);
        {
            SubLObject dep_coverage = com.cyc.cycjava.cycl.rtp.iterative_template_parser.dependent_span_coverage(dependents);
            SubLObject initial_span = NIL;
            SubLObject span_knownP = NIL;
            if (NIL == span_knownP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(self);
                    SubLObject n = NIL;
                    for (n = csome_list_var.first(); !((NIL != span_knownP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , n = csome_list_var.first()) {
                        if (NIL != memberP(n, dep_coverage, UNPROVIDED, UNPROVIDED)) {
                            span_knownP = T;
                        } else {
                            initial_span = cons(n, initial_span);
                        }
                    }
                }
            }
            return reverse(initial_span);
        }
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; whose full span we care about
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return SPAN ; the initial span not covered by the specified dependent(s)
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; whose full span we care about\r\n@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return SPAN ; the initial span not covered by the specified dependent(s)")
    public static SubLObject initial_span_gap(final SubLObject self, final SubLObject dependents) {
        assert NIL != iterative_template_parser.itp_node_p(self) : "! iterative_template_parser.itp_node_p(self) " + ("iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) ") + self;
        final SubLObject dep_coverage = iterative_template_parser.dependent_span_coverage(dependents);
        SubLObject initial_span = NIL;
        SubLObject span_knownP = NIL;
        if (NIL == span_knownP) {
            SubLObject csome_list_var = iterative_template_parser.itp_node_span(self);
            SubLObject n = NIL;
            n = csome_list_var.first();
            while ((NIL == span_knownP) && (NIL != csome_list_var)) {
                if (NIL != subl_promotions.memberP(n, dep_coverage, UNPROVIDED, UNPROVIDED)) {
                    span_knownP = T;
                } else {
                    initial_span = cons(n, initial_span);
                }
                csome_list_var = csome_list_var.rest();
                n = csome_list_var.first();
            } 
        }
        return reverse(initial_span);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; can some combination of dependents cover self's span?
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return BOOLEANP ; could some combination provide coverage - let others worry about which combinations are 'wff'
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; can some combination of dependents cover self\'s span?\r\n@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return BOOLEANP ; could some combination provide coverage - let others worry about which combinations are \'wff\'")
    public static final SubLObject full_span_coverageP_alt(SubLObject self, SubLObject dependents) {
        SubLTrampolineFile.checkType(self, ITP_NODE_P);
        return list_utilities.fast_sets_equalP(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(self), com.cyc.cycjava.cycl.rtp.iterative_template_parser.dependent_span_coverage(dependents), UNPROVIDED);
    }

    /**
     *
     *
     * @param ITP-NODE-P
     * 		; can some combination of dependents cover self's span?
     * @param LIST
     * 		of ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don't just ignore others
     * @return BOOLEANP ; could some combination provide coverage - let others worry about which combinations are 'wff'
     */
    @LispMethod(comment = "@param ITP-NODE-P\r\n\t\t; can some combination of dependents cover self\'s span?\r\n@param LIST\r\n\t\tof ITP-NODE-P, IS-THIS-A-THELIST-SPAN?, and/or IS-THIS-A-NUMERIC-SPAN? @todo don\'t just ignore others\r\n@return BOOLEANP ; could some combination provide coverage - let others worry about which combinations are \'wff\'")
    public static SubLObject full_span_coverageP(final SubLObject self, final SubLObject dependents) {
        assert NIL != iterative_template_parser.itp_node_p(self) : "! iterative_template_parser.itp_node_p(self) " + ("iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) ") + self;
        return fast_sets_equalP(iterative_template_parser.itp_node_span(self), iterative_template_parser.dependent_span_coverage(dependents), UNPROVIDED);
    }

    public static final SubLObject get_ternary_quant_fns_alt() {
        if (NIL == $ternary_quant_fns$.getGlobalValue()) {
            {
                SubLObject the_fns = ask_utilities.ask_variable($sym272$_FUNC, $list_alt273, $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != the_fns) {
                    $ternary_quant_fns$.setGlobalValue(the_fns);
                } else {
                    $ternary_quant_fns$.setGlobalValue($NONE);
                }
            }
        }
        if (!$ternary_quant_fns$.getGlobalValue().eql($NONE)) {
            return $ternary_quant_fns$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject get_ternary_quant_fns() {
        if (NIL == iterative_template_parser.$ternary_quant_fns$.getGlobalValue()) {
            final SubLObject the_fns = ask_utilities.ask_variable(iterative_template_parser.$sym279$_FUNC, iterative_template_parser.$list280, iterative_template_parser.$$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != the_fns) {
                iterative_template_parser.$ternary_quant_fns$.setGlobalValue(the_fns);
            } else {
                iterative_template_parser.$ternary_quant_fns$.setGlobalValue($NONE);
            }
        }
        if (!iterative_template_parser.$ternary_quant_fns$.getGlobalValue().eql($NONE)) {
            return iterative_template_parser.$ternary_quant_fns$.getGlobalValue();
        }
        return NIL;
    }

    public static final SubLObject is_this_a_quant_fnP_alt(SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        if (NIL != memberP(obj.first(), com.cyc.cycjava.cycl.rtp.iterative_template_parser.get_ternary_quant_fns(), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject is_this_a_quant_fnP(final SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        if (NIL != subl_promotions.memberP(obj.first(), iterative_template_parser.get_ternary_quant_fns(), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     * If the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)
     * <category>) is bigger than 2, it is a multi-word.
     */
    @LispMethod(comment = "If the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)\r\n<category>) is bigger than 2, it is a multi-word.\nIf the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)\n<category>) is bigger than 2, it is a multi-word.")
    public static final SubLObject surrogate_multi_word_componentP_alt(SubLObject surrogate) {
        return numL(TWO_INTEGER, length(third(surrogate)));
    }

    @LispMethod(comment = "If the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)\r\n<category>) is bigger than 2, it is a multi-word.\nIf the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)\n<category>) is bigger than 2, it is a multi-word.")
    public static SubLObject surrogate_multi_word_componentP(final SubLObject surrogate) {
        return numL(TWO_INTEGER, length(third(surrogate)));
    }/**
     * If the span of the span in (#$TheResultOfParsing <string> (#$TheList ...)
     * <category>) is bigger than 2, it is a multi-word.
     */


    /**
     *
     *
     * @param ITP-STATE-P
     * 		; starting point
     * 		Do a depth-first walkdown of the parse tree to find lists of #$Syntactic(Choice)Nodes to enter into the KB.
     */
    @LispMethod(comment = "@param ITP-STATE-P\r\n\t\t; starting point\r\n\t\tDo a depth-first walkdown of the parse tree to find lists of #$Syntactic(Choice)Nodes to enter into the KB.")
    public static final SubLObject reify_itp_alt(SubLObject state) {
        if (state == UNPROVIDED) {
            state = $last_itp_state_created$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($rtp_kb_parse_mt$.getDynamicValue(thread), $sym274$MT_IN_ANY_MT_);
            if (NIL == fi.fi_assert_int(list($$genlMt, $rtp_kb_parse_mt$.getDynamicValue(thread), NIL != parsing_vars.$parse_tree_mt$.getDynamicValue(thread) ? ((SubLObject) (parsing_vars.$parse_tree_mt$.getDynamicValue(thread))) : $$ParseTreeSandboxMt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                Errors.warn($str_alt278$Couldn_t_find_a_parse_tree_mt_to_, $rtp_kb_parse_mt$.getDynamicValue(thread));
            }
            {
                SubLObject good_roots = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_solution_set(state);
                SubLObject this_root = NIL;
                for (this_root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_root = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_parent(this_root)) {
                        {
                            SubLObject undo_assert_traceP = NIL;
                            SubLObject instructions = com.cyc.cycjava.cycl.rtp.iterative_template_parser.reify_itp_int(this_root);
                            SubLObject more_instructions = NIL;
                            if (NIL != instructions) {
                                if (NIL == good_roots) {
                                    good_roots = this_root;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(good_roots)) {
                                        {
                                            SubLObject choice_cat = NIL;
                                            if (NIL == choice_cat) {
                                                choice_cat = $$SyntacticChoiceNode;
                                            }
                                            {
                                                SubLObject new_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_choice_node($rtp_kb_parse_mt$.getDynamicValue(thread), Mapping.mapcar(ITP_NODE_SYNTACTIC_NODE, list(this_root, good_roots)), choice_cat, UNPROVIDED);
                                                if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                                    fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                }
                                                good_roots = new_node;
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject choice_cat = NIL;
                                            SubLObject new_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), NIL, UNPROVIDED);
                                            if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                                fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            }
                                            parsing_utilities.syntactic_node_add_dtr(new_node, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(this_root), NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var_86 = instructions;
                                SubLObject this_gaf = NIL;
                                for (this_gaf = cdolist_list_var_86.first(); NIL != cdolist_list_var_86; cdolist_list_var_86 = cdolist_list_var_86.rest() , this_gaf = cdolist_list_var_86.first()) {
                                    fi.fi_assert_int(this_gaf, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                }
                            }
                            {
                                SubLObject cdolist_list_var_87 = more_instructions;
                                SubLObject this_gaf = NIL;
                                for (this_gaf = cdolist_list_var_87.first(); NIL != cdolist_list_var_87; cdolist_list_var_87 = cdolist_list_var_87.rest() , this_gaf = cdolist_list_var_87.first()) {
                                    fi.fi_assert_int(this_gaf, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                if (NIL == good_roots) {
                    return NIL;
                }
                return parsing_utilities.create_parse_tree_with_root_node(NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(good_roots) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(good_roots))) : good_roots, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param ITP-STATE-P
     * 		; starting point
     * 		Do a depth-first walkdown of the parse tree to find lists of #$Syntactic(Choice)Nodes to enter into the KB.
     */
    @LispMethod(comment = "@param ITP-STATE-P\r\n\t\t; starting point\r\n\t\tDo a depth-first walkdown of the parse tree to find lists of #$Syntactic(Choice)Nodes to enter into the KB.")
    public static SubLObject reify_itp(SubLObject state) {
        if (state == UNPROVIDED) {
            state = iterative_template_parser.$last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) : "! fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) " + ("fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) " + "CommonSymbols.NIL != fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) ") + iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread);
        if (NIL == fi_assert_int(list(iterative_template_parser.$$genlMt, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), NIL != $parse_tree_mt$.getDynamicValue(thread) ? $parse_tree_mt$.getDynamicValue(thread) : iterative_template_parser.$$ParseTreeSandboxMt), iterative_template_parser.$$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
            Errors.warn(iterative_template_parser.$str285$Couldn_t_find_a_parse_tree_mt_to_, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        }
        SubLObject good_roots = NIL;
        SubLObject cdolist_list_var = iterative_template_parser.itp_state_solution_set(state);
        SubLObject this_root = NIL;
        this_root = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == iterative_template_parser.itp_node_parent(this_root)) {
                final SubLObject undo_assert_traceP = NIL;
                final SubLObject instructions = iterative_template_parser.reify_itp_int(this_root);
                final SubLObject more_instructions = NIL;
                if (NIL != instructions) {
                    if (NIL == good_roots) {
                        good_roots = this_root;
                    } else
                        if (NIL != iterative_template_parser.itp_node_p(good_roots)) {
                            SubLObject choice_cat = NIL;
                            if (NIL == choice_cat) {
                                choice_cat = iterative_template_parser.$$SyntacticChoiceNode;
                            }
                            final SubLObject new_node = iterative_template_parser.new_syntactic_choice_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), Mapping.mapcar(iterative_template_parser.ITP_NODE_SYNTACTIC_NODE, list(this_root, good_roots)), choice_cat, UNPROVIDED);
                            if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
                                fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            }
                            good_roots = new_node;
                        } else {
                            final SubLObject choice_cat = NIL;
                            final SubLObject new_node = iterative_template_parser.new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), NIL, UNPROVIDED);
                            if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
                                fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            }
                            syntactic_node_add_dtr(new_node, iterative_template_parser.itp_node_syntactic_node(this_root), NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                        }

                }
                SubLObject cdolist_list_var_$83 = instructions;
                SubLObject this_gaf = NIL;
                this_gaf = cdolist_list_var_$83.first();
                while (NIL != cdolist_list_var_$83) {
                    fi_assert_int(this_gaf, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                    this_gaf = cdolist_list_var_$83.first();
                } 
                SubLObject cdolist_list_var_$84 = more_instructions;
                this_gaf = NIL;
                this_gaf = cdolist_list_var_$84.first();
                while (NIL != cdolist_list_var_$84) {
                    fi_assert_int(this_gaf, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                    this_gaf = cdolist_list_var_$84.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_root = cdolist_list_var.first();
        } 
        if (NIL == good_roots) {
            return NIL;
        }
        return create_parse_tree_with_root_node(NIL != iterative_template_parser.itp_node_p(good_roots) ? iterative_template_parser.itp_node_syntactic_node(good_roots) : good_roots, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject reify_itp_int_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject itp_leafP = makeBoolean((NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(self)) && (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self)));
                SubLObject valid_children = (NIL != itp_leafP) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_get_legitimate_children(self);
                SubLObject these_instructions = NIL;
                if ((NIL == valid_children) && (NIL == itp_leafP)) {
                    return NIL;
                }
                {
                    SubLObject my_component = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(self);
                    SubLObject my_category = (NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) ? ((SubLObject) (parsing_utilities.result_of_parsing_category(my_component))) : NIL;
                    SubLObject my_real_parent = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_parent(self);
                    SubLObject my_kb_parent = NIL;
                    SubLObject my_kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(self);
                    SubLObject my_meaning = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(self);
                    if (NIL == my_category) {
                        my_category = (NIL != my_real_parent) ? ((SubLObject) ($$SyntacticNode_Sentential)) : $$SyntacticNode_MatrixClause;
                    }
                    if (NIL != my_real_parent) {
                        my_kb_parent = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_choice_node_for_component(my_real_parent, my_component);
                        if (NIL == my_kb_parent) {
                            my_kb_parent = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(my_real_parent);
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(my_real_parent)) {
                        if (NIL == my_kb_node) {
                            {
                                SubLObject csome_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_get_legitimate_children(my_real_parent);
                                SubLObject other_child = NIL;
                                for (other_child = csome_list_var.first(); !((NIL != my_kb_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_child = csome_list_var.first()) {
                                    if (!other_child.equal(self)) {
                                        if (com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(self).equal(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(other_child))) {
                                            my_kb_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(other_child);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == my_kb_node) {
                        {
                            SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding(thread);
                            try {
                                $kb_node_gathering_modeP$.bind(T, thread);
                                {
                                    SubLObject choice_cat = my_category;
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), my_category, UNPROVIDED);
                                        SubLObject new_gafs = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                            fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        }
                                        {
                                            SubLObject cdolist_list_var = new_gafs;
                                            SubLObject test_gaf = NIL;
                                            for (test_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_gaf = cdolist_list_var.first()) {
                                                these_instructions = cons(test_gaf, these_instructions);
                                            }
                                        }
                                        my_kb_node = new_node;
                                        if (NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) {
                                            these_instructions = cons(list($$syntacticNodeString, my_kb_node, parsing_utilities.result_of_parsing_words(my_component)), these_instructions);
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_node_p(self)) {
                                                these_instructions = cons(list($$syntacticNodeString, my_kb_node, com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_node_word_list(self)), these_instructions);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = valid_children;
                                            SubLObject child = NIL;
                                            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                                {
                                                    SubLObject this_child_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(child);
                                                    if ((NIL != this_child_node) && (NIL == ask_utilities.ask_variable($sym280$_N, list($$syntacticNodeNthDaughter, my_kb_node, $sym280$_N, this_child_node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                        parsing_utilities.syntactic_node_add_dtr(my_kb_node, this_child_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                                                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.full_span_coverageP(self, list(child))) {
                                                            {
                                                                SubLObject cdolist_list_var_88 = parsing_utilities.syntactic_node_proposed_meanings(this_child_node, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                                                                SubLObject meaning = NIL;
                                                                for (meaning = cdolist_list_var_88.first(); NIL != cdolist_list_var_88; cdolist_list_var_88 = cdolist_list_var_88.rest() , meaning = cdolist_list_var_88.first()) {
                                                                    these_instructions = cons(list($$dependentMeaning, my_kb_node, meaning, this_child_node, meaning), these_instructions);
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
                                $kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    com.cyc.cycjava.cycl.rtp.iterative_template_parser._csetf_itp_node_syntactic_node(self, my_kb_node);
                    if ((my_category.eql($$isa) && (NIL == valid_children)) && (NIL != isa.isa_in_any_mtP(my_kb_parent, $$SyntacticChoiceNode))) {
                        these_instructions = cons(list($$excludedOptionNodes, my_kb_parent, my_kb_node), these_instructions);
                    }
                    if ((NIL != my_real_parent) && (NIL == my_kb_parent)) {
                        my_kb_parent = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(my_real_parent);
                    }
                    if (NIL != my_kb_parent) {
                        if (NIL != isa.isa_in_any_mtP(my_kb_parent, $$SyntacticChoiceNode)) {
                            these_instructions = cons(list($$optionNodes, my_kb_parent, my_kb_node), these_instructions);
                        } else {
                            if (NIL == ask_utilities.ask_variable($sym280$_N, list($$syntacticNodeNthDaughter, my_kb_parent, $sym280$_N, my_kb_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                parsing_utilities.syntactic_node_add_dtr(my_kb_parent, my_kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = valid_children;
                        SubLObject this_child = NIL;
                        for (this_child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_child = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_answer = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_find_or_initialize_syntactic_choices(self, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(this_child));
                                SubLObject the_gafs = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_answer) {
                                    {
                                        SubLObject cdolist_list_var_89 = the_gafs;
                                        SubLObject gaf = NIL;
                                        for (gaf = cdolist_list_var_89.first(); NIL != cdolist_list_var_89; cdolist_list_var_89 = cdolist_list_var_89.rest() , gaf = cdolist_list_var_89.first()) {
                                            these_instructions = cons(gaf, these_instructions);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.rtp.iterative_template_parser.reify_itp_int(this_child);
                                SubLObject join_componentP = com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_node_p(self);
                                SubLObject need_componentP = makeBoolean((NIL == join_componentP) && (NIL != list_utilities.sublisp_boolean(list_utilities.tree_find_if($sym282$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED))));
                                SubLObject kids_component = (NIL != need_componentP) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(this_child))) : NIL;
                                if (NIL != list_utilities.proper_list_p(gafs)) {
                                    {
                                        SubLObject cdolist_list_var_90 = gafs;
                                        SubLObject this_gaf = NIL;
                                        for (this_gaf = cdolist_list_var_90.first(); NIL != cdolist_list_var_90; cdolist_list_var_90 = cdolist_list_var_90.rest() , this_gaf = cdolist_list_var_90.first()) {
                                            these_instructions = cons(this_gaf, these_instructions);
                                            if (((NIL != need_componentP) && cycl_utilities.formula_arg1(this_gaf, UNPROVIDED).eql(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(this_child))) && (cycl_utilities.formula_arg0(this_gaf).eql($$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf).eql($$dependentMeaning))) {
                                                {
                                                    SubLObject kids_meaning = cycl_utilities.formula_arg2(this_gaf, UNPROVIDED);
                                                    SubLObject this_meaning = list_utilities.tree_substitute(my_meaning, kids_component, kids_meaning);
                                                    if (this_meaning.equalp(my_meaning)) {
                                                        this_meaning = copy_tree(kids_meaning);
                                                    }
                                                    if (!cycl_utilities.formula_arg0(this_meaning).eql($$SubLQuoteFn)) {
                                                        this_meaning = list($$SubLQuoteFn, this_meaning);
                                                    }
                                                    these_instructions = cons(list($$dependentMeaning, my_kb_node, this_meaning, com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(this_child), kids_meaning), these_instructions);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL == $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                                    } else {
                                        com.cyc.cycjava.cycl.rtp.iterative_template_parser.kill_syntactic_node_tree(my_kb_node);
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                    if ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_node_p(self)) && (NIL != isa.isaP(my_kb_node, $$SyntacticNode_Sentential, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED))) {
                        {
                            SubLObject datum = cycl_utilities.formula_args(cycl_utilities.formula_arg2(my_meaning, UNPROVIDED), UNPROVIDED);
                            SubLObject current = datum;
                            SubLObject subj_component = NIL;
                            SubLObject vp_component = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt284);
                            subj_component = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt284);
                            vp_component = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject subj_options = NIL;
                                    SubLObject subj_nodes = NIL;
                                    SubLObject vp_options = NIL;
                                    SubLObject vp_nodes = NIL;
                                    {
                                        SubLObject cdolist_list_var = valid_children;
                                        SubLObject this_child = NIL;
                                        for (this_child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_child = cdolist_list_var.first()) {
                                            {
                                                SubLObject this_component = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(this_child);
                                                SubLObject this_node = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_syntactic_node(this_child);
                                                if (this_component.equal(subj_component)) {
                                                    subj_nodes = cons(this_node, subj_nodes);
                                                } else {
                                                    if (this_component.equal(vp_component)) {
                                                        vp_nodes = cons(this_node, vp_nodes);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = these_instructions;
                                        SubLObject this_gaf = NIL;
                                        for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                                            if (cycl_utilities.formula_arg0(this_gaf).eql($$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf).eql($$dependentMeaning)) {
                                                if (NIL != memberP(cycl_utilities.formula_arg1(this_gaf, UNPROVIDED), subj_nodes, UNPROVIDED, UNPROVIDED)) {
                                                    {
                                                        SubLObject item_var = list(cycl_utilities.formula_arg1(this_gaf, UNPROVIDED), cycl_utilities.formula_arg2(this_gaf, UNPROVIDED));
                                                        if (NIL == member(item_var, subj_options, EQUAL, symbol_function(IDENTITY))) {
                                                            subj_options = cons(item_var, subj_options);
                                                        }
                                                    }
                                                } else {
                                                    if (NIL != memberP(cycl_utilities.formula_arg1(this_gaf, UNPROVIDED), vp_nodes, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject item_var = list(cycl_utilities.formula_arg1(this_gaf, UNPROVIDED), cycl_utilities.formula_arg2(this_gaf, UNPROVIDED));
                                                            if (NIL == member(item_var, vp_options, EQUAL, symbol_function(IDENTITY))) {
                                                                vp_options = cons(item_var, vp_options);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = subj_nodes;
                                        SubLObject node = NIL;
                                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                            {
                                                SubLObject cdolist_list_var_91 = parsing_utilities.syntactic_node_proposed_meanings(node, $rtp_kb_parse_mt$.getDynamicValue(thread), $$proposedMeaning);
                                                SubLObject this_meaning = NIL;
                                                for (this_meaning = cdolist_list_var_91.first(); NIL != cdolist_list_var_91; cdolist_list_var_91 = cdolist_list_var_91.rest() , this_meaning = cdolist_list_var_91.first()) {
                                                    {
                                                        SubLObject item_var = list(node, this_meaning);
                                                        if (NIL == member(item_var, subj_options, EQUAL, symbol_function(IDENTITY))) {
                                                            subj_options = cons(item_var, subj_options);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = vp_nodes;
                                        SubLObject node = NIL;
                                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                            {
                                                SubLObject cdolist_list_var_92 = parsing_utilities.syntactic_node_proposed_meanings(node, $rtp_kb_parse_mt$.getDynamicValue(thread), $$proposedMeaning);
                                                SubLObject this_meaning = NIL;
                                                for (this_meaning = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , this_meaning = cdolist_list_var_92.first()) {
                                                    {
                                                        SubLObject item_var = list(node, this_meaning);
                                                        if (NIL == member(item_var, vp_options, EQUAL, symbol_function(IDENTITY))) {
                                                            vp_options = cons(item_var, vp_options);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if ((NIL == subj_options) || (NIL == vp_options)) {
                                        Errors.warn($str_alt285$____can_t_build_any_meaning_combi, my_kb_node);
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = vp_options;
                                            SubLObject this_vp_option = NIL;
                                            for (this_vp_option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_vp_option = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_93 = this_vp_option;
                                                    SubLObject current_94 = datum_93;
                                                    SubLObject vp_node = NIL;
                                                    SubLObject vp_meaning = NIL;
                                                    destructuring_bind_must_consp(current_94, datum_93, $list_alt286);
                                                    vp_node = current_94.first();
                                                    current_94 = current_94.rest();
                                                    destructuring_bind_must_consp(current_94, datum_93, $list_alt286);
                                                    vp_meaning = current_94.first();
                                                    current_94 = current_94.rest();
                                                    if (NIL == current_94) {
                                                        {
                                                            SubLObject cdolist_list_var_95 = subj_options;
                                                            SubLObject this_subj_option = NIL;
                                                            for (this_subj_option = cdolist_list_var_95.first(); NIL != cdolist_list_var_95; cdolist_list_var_95 = cdolist_list_var_95.rest() , this_subj_option = cdolist_list_var_95.first()) {
                                                                {
                                                                    SubLObject datum_96 = this_subj_option;
                                                                    SubLObject current_97 = datum_96;
                                                                    SubLObject subj_node = NIL;
                                                                    SubLObject subj_meaning = NIL;
                                                                    destructuring_bind_must_consp(current_97, datum_96, $list_alt287);
                                                                    subj_node = current_97.first();
                                                                    current_97 = current_97.rest();
                                                                    destructuring_bind_must_consp(current_97, datum_96, $list_alt287);
                                                                    subj_meaning = current_97.first();
                                                                    current_97 = current_97.rest();
                                                                    if (NIL == current_97) {
                                                                        {
                                                                            SubLObject joined_meaning = list_utilities.tree_substitute(vp_meaning, $$TheSentenceSubject, subj_meaning);
                                                                            joined_meaning = list_utilities.tree_substitute(joined_meaning, $SUBJECT, subj_meaning);
                                                                            these_instructions = cons(list($$dependentMeaning, my_kb_node, joined_meaning, vp_node, vp_meaning), these_instructions);
                                                                            these_instructions = cons(list($$dependentMeaning, my_kb_node, joined_meaning, subj_node, subj_meaning), these_instructions);
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_96, $list_alt287);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum_93, $list_alt286);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt284);
                            }
                        }
                    }
                    if (NIL == list_utilities.tree_find_if($sym282$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED)) {
                        these_instructions = cons(list($$proposedMeaning, my_kb_node, my_meaning), these_instructions);
                    }
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_get_dominance_gafs(self);
                        SubLObject this_gaf = NIL;
                        for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                            these_instructions = cons(this_gaf, these_instructions);
                        }
                    }
                }
                return reverse(these_instructions);
            }
        }
    }

    public static SubLObject reify_itp_int(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject itp_leafP = makeBoolean((NIL == iterative_template_parser.itp_node_children(self)) && (NIL == iterative_template_parser.itp_node_syntactic_node(self)));
        final SubLObject valid_children = (NIL != itp_leafP) ? NIL : iterative_template_parser.itp_node_get_legitimate_children(self);
        SubLObject these_instructions = NIL;
        if ((NIL == valid_children) && (NIL == itp_leafP)) {
            return NIL;
        }
        final SubLObject my_component = iterative_template_parser.itp_node_component(self);
        SubLObject my_category = (NIL != result_of_parsing_formulaP(my_component)) ? result_of_parsing_category(my_component) : NIL;
        final SubLObject my_real_parent = iterative_template_parser.itp_node_parent(self);
        SubLObject my_kb_parent = NIL;
        SubLObject my_kb_node = iterative_template_parser.itp_node_syntactic_node(self);
        final SubLObject my_meaning = iterative_template_parser.itp_node_new_parse(self);
        if (NIL == my_category) {
            my_category = (NIL != my_real_parent) ? iterative_template_parser.$$SyntacticNode_Sentential : iterative_template_parser.$$SyntacticNode_MatrixClause;
        }
        if (NIL != my_real_parent) {
            my_kb_parent = iterative_template_parser.itp_choice_node_for_component(my_real_parent, my_component);
            if (NIL == my_kb_parent) {
                my_kb_parent = iterative_template_parser.itp_node_syntactic_node(my_real_parent);
            }
        }
        if ((NIL != iterative_template_parser.itp_node_p(my_real_parent)) && (NIL == my_kb_node)) {
            SubLObject csome_list_var = iterative_template_parser.itp_node_get_legitimate_children(my_real_parent);
            SubLObject other_child = NIL;
            other_child = csome_list_var.first();
            while ((NIL == my_kb_node) && (NIL != csome_list_var)) {
                if ((!other_child.equal(self)) && iterative_template_parser.itp_node_component(self).equal(iterative_template_parser.itp_node_component(other_child))) {
                    my_kb_node = iterative_template_parser.itp_node_syntactic_node(other_child);
                }
                csome_list_var = csome_list_var.rest();
                other_child = csome_list_var.first();
            } 
        }
        if (NIL == my_kb_node) {
            final SubLObject _prev_bind_0 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
            try {
                iterative_template_parser.$kb_node_gathering_modeP$.bind(T, thread);
                final SubLObject choice_cat = my_category;
                thread.resetMultipleValues();
                final SubLObject new_node = iterative_template_parser.new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), my_category, UNPROVIDED);
                final SubLObject new_gafs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != fort_p(iterative_template_parser.$$CycRecursiveTemplateParser)) {
                    fi_assert_int(list(iterative_template_parser.$$syntacticNodeCreator, list(iterative_template_parser.$$InstanceWithRelationFromFn, list(iterative_template_parser.$$ProgramCopyFn, iterative_template_parser.$$CycRecursiveTemplateParser), iterative_template_parser.$$partOfIBT, iterative_template_parser.$$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                SubLObject cdolist_list_var = new_gafs;
                SubLObject test_gaf = NIL;
                test_gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    these_instructions = cons(test_gaf, these_instructions);
                    cdolist_list_var = cdolist_list_var.rest();
                    test_gaf = cdolist_list_var.first();
                } 
                my_kb_node = new_node;
                if (NIL != result_of_parsing_formulaP(my_component)) {
                    these_instructions = cons(list(iterative_template_parser.$$syntacticNodeString, my_kb_node, result_of_parsing_words(my_component)), these_instructions);
                } else
                    if (NIL != iterative_template_parser.join_template_components_node_p(self)) {
                        these_instructions = cons(list(iterative_template_parser.$$syntacticNodeString, my_kb_node, iterative_template_parser.join_template_components_node_word_list(self)), these_instructions);
                    }

                cdolist_list_var = valid_children;
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject this_child_node = iterative_template_parser.itp_node_syntactic_node(child);
                    if ((NIL != this_child_node) && (NIL == ask_utilities.ask_variable(iterative_template_parser.$sym287$_N, list(iterative_template_parser.$$syntacticNodeNthDaughter, my_kb_node, iterative_template_parser.$sym287$_N, this_child_node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        syntactic_node_add_dtr(my_kb_node, this_child_node, NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                        if (NIL != iterative_template_parser.full_span_coverageP(self, list(child))) {
                            SubLObject cdolist_list_var_$85 = syntactic_node_proposed_meanings(this_child_node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                            SubLObject meaning = NIL;
                            meaning = cdolist_list_var_$85.first();
                            while (NIL != cdolist_list_var_$85) {
                                these_instructions = cons(list(iterative_template_parser.$$dependentMeaning, my_kb_node, meaning, this_child_node, meaning), these_instructions);
                                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                meaning = cdolist_list_var_$85.first();
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            } finally {
                iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
            }
        }
        iterative_template_parser._csetf_itp_node_syntactic_node(self, my_kb_node);
        if ((my_category.eql(iterative_template_parser.$$VPTemplate) && (NIL == valid_children)) && (NIL != isa_in_any_mtP(my_kb_parent, iterative_template_parser.$$SyntacticChoiceNode))) {
            these_instructions = cons(list(iterative_template_parser.$$excludedOptionNodes, my_kb_parent, my_kb_node), these_instructions);
        }
        if ((NIL != my_real_parent) && (NIL == my_kb_parent)) {
            my_kb_parent = iterative_template_parser.itp_node_syntactic_node(my_real_parent);
        }
        if (NIL != my_kb_parent) {
            if (NIL != isa_in_any_mtP(my_kb_parent, iterative_template_parser.$$SyntacticChoiceNode)) {
                these_instructions = cons(list(iterative_template_parser.$$optionNodes, my_kb_parent, my_kb_node), these_instructions);
            } else
                if (NIL == ask_utilities.ask_variable(iterative_template_parser.$sym287$_N, list(iterative_template_parser.$$syntacticNodeNthDaughter, my_kb_parent, iterative_template_parser.$sym287$_N, my_kb_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    syntactic_node_add_dtr(my_kb_parent, my_kb_node, NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                }

        }
        SubLObject cdolist_list_var2 = valid_children;
        SubLObject this_child = NIL;
        this_child = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject v_answer = iterative_template_parser.itp_node_find_or_initialize_syntactic_choices(self, iterative_template_parser.itp_node_component(this_child));
            final SubLObject the_gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_answer) {
                SubLObject cdolist_list_var_$86 = the_gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var_$86.first();
                while (NIL != cdolist_list_var_$86) {
                    these_instructions = cons(gaf, these_instructions);
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    gaf = cdolist_list_var_$86.first();
                } 
            }
            final SubLObject gafs = iterative_template_parser.reify_itp_int(this_child);
            final SubLObject join_componentP = iterative_template_parser.join_template_components_node_p(self);
            final SubLObject need_componentP = makeBoolean((NIL == join_componentP) && (NIL != sublisp_boolean(tree_find_if(iterative_template_parser.$sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED))));
            final SubLObject kids_component = (NIL != need_componentP) ? iterative_template_parser.itp_node_component(this_child) : NIL;
            if (NIL != proper_list_p(gafs)) {
                SubLObject cdolist_list_var_$87 = gafs;
                SubLObject this_gaf = NIL;
                this_gaf = cdolist_list_var_$87.first();
                while (NIL != cdolist_list_var_$87) {
                    these_instructions = cons(this_gaf, these_instructions);
                    if (((NIL != need_componentP) && formula_arg1(this_gaf, UNPROVIDED).eql(iterative_template_parser.itp_node_syntactic_node(this_child))) && (formula_arg0(this_gaf).eql(iterative_template_parser.$$proposedMeaning) || formula_arg0(this_gaf).eql(iterative_template_parser.$$dependentMeaning))) {
                        final SubLObject kids_meaning = formula_arg2(this_gaf, UNPROVIDED);
                        SubLObject this_meaning = tree_substitute(my_meaning, kids_component, kids_meaning);
                        if (this_meaning.equalp(my_meaning)) {
                            this_meaning = copy_tree(kids_meaning);
                        }
                        if (!formula_arg0(this_meaning).eql(iterative_template_parser.$$SubLQuoteFn)) {
                            this_meaning = list(iterative_template_parser.$$SubLQuoteFn, this_meaning);
                        }
                        these_instructions = cons(list(iterative_template_parser.$$dependentMeaning, my_kb_node, this_meaning, iterative_template_parser.itp_node_syntactic_node(this_child), kids_meaning), these_instructions);
                    }
                    cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                    this_gaf = cdolist_list_var_$87.first();
                } 
            } else
                if (NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                    iterative_template_parser.kill_syntactic_node_tree(my_kb_node);
                    return NIL;
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            this_child = cdolist_list_var2.first();
        } 
        if (((NIL != iterative_template_parser.join_template_components_node_p(self)) && (NIL != isaP(my_kb_node, iterative_template_parser.$$SyntacticNode_Sentential, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED))) && formula_arg1(my_meaning, UNPROVIDED).equal(iterative_template_parser.$list290)) {
            SubLObject current;
            final SubLObject datum = current = formula_args(formula_arg2(my_meaning, UNPROVIDED), UNPROVIDED);
            SubLObject subj_component = NIL;
            SubLObject vp_component = NIL;
            destructuring_bind_must_consp(current, datum, iterative_template_parser.$list291);
            subj_component = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, iterative_template_parser.$list291);
            vp_component = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject subj_options = NIL;
                SubLObject subj_nodes = NIL;
                SubLObject vp_options = NIL;
                SubLObject vp_nodes = NIL;
                SubLObject cdolist_list_var3 = valid_children;
                SubLObject this_child2 = NIL;
                this_child2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    final SubLObject this_component = iterative_template_parser.itp_node_component(this_child2);
                    final SubLObject this_node = iterative_template_parser.itp_node_syntactic_node(this_child2);
                    if (this_component.equal(subj_component)) {
                        subj_nodes = cons(this_node, subj_nodes);
                    } else
                        if (this_component.equal(vp_component)) {
                            vp_nodes = cons(this_node, vp_nodes);
                        }

                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_child2 = cdolist_list_var3.first();
                } 
                cdolist_list_var3 = these_instructions;
                SubLObject this_gaf2 = NIL;
                this_gaf2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    if (formula_arg0(this_gaf2).eql(iterative_template_parser.$$proposedMeaning) || formula_arg0(this_gaf2).eql(iterative_template_parser.$$dependentMeaning)) {
                        if (NIL != subl_promotions.memberP(formula_arg1(this_gaf2, UNPROVIDED), subj_nodes, UNPROVIDED, UNPROVIDED)) {
                            final SubLObject item_var = list(formula_arg1(this_gaf2, UNPROVIDED), formula_arg2(this_gaf2, UNPROVIDED));
                            if (NIL == member(item_var, subj_options, EQUAL, symbol_function(IDENTITY))) {
                                subj_options = cons(item_var, subj_options);
                            }
                        } else
                            if (NIL != subl_promotions.memberP(formula_arg1(this_gaf2, UNPROVIDED), vp_nodes, UNPROVIDED, UNPROVIDED)) {
                                final SubLObject item_var = list(formula_arg1(this_gaf2, UNPROVIDED), formula_arg2(this_gaf2, UNPROVIDED));
                                if (NIL == member(item_var, vp_options, EQUAL, symbol_function(IDENTITY))) {
                                    vp_options = cons(item_var, vp_options);
                                }
                            }

                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_gaf2 = cdolist_list_var3.first();
                } 
                cdolist_list_var3 = subj_nodes;
                SubLObject node = NIL;
                node = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$88 = syntactic_node_proposed_meanings(node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), iterative_template_parser.$$proposedMeaning);
                    SubLObject this_meaning2 = NIL;
                    this_meaning2 = cdolist_list_var_$88.first();
                    while (NIL != cdolist_list_var_$88) {
                        final SubLObject item_var2 = list(node, this_meaning2);
                        if (NIL == member(item_var2, subj_options, EQUAL, symbol_function(IDENTITY))) {
                            subj_options = cons(item_var2, subj_options);
                        }
                        cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                        this_meaning2 = cdolist_list_var_$88.first();
                    } 
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    node = cdolist_list_var3.first();
                } 
                cdolist_list_var3 = vp_nodes;
                node = NIL;
                node = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$89 = syntactic_node_proposed_meanings(node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), iterative_template_parser.$$proposedMeaning);
                    SubLObject this_meaning2 = NIL;
                    this_meaning2 = cdolist_list_var_$89.first();
                    while (NIL != cdolist_list_var_$89) {
                        final SubLObject item_var2 = list(node, this_meaning2);
                        if (NIL == member(item_var2, vp_options, EQUAL, symbol_function(IDENTITY))) {
                            vp_options = cons(item_var2, vp_options);
                        }
                        cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                        this_meaning2 = cdolist_list_var_$89.first();
                    } 
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    node = cdolist_list_var3.first();
                } 
                if ((NIL == subj_options) || (NIL == vp_options)) {
                    Errors.warn(iterative_template_parser.$str292$____can_t_build_any_meaning_combi, my_kb_node);
                } else {
                    cdolist_list_var3 = vp_options;
                    SubLObject this_vp_option = NIL;
                    this_vp_option = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        SubLObject current_$91;
                        final SubLObject datum_$90 = current_$91 = this_vp_option;
                        SubLObject vp_node = NIL;
                        SubLObject vp_meaning = NIL;
                        destructuring_bind_must_consp(current_$91, datum_$90, iterative_template_parser.$list293);
                        vp_node = current_$91.first();
                        current_$91 = current_$91.rest();
                        destructuring_bind_must_consp(current_$91, datum_$90, iterative_template_parser.$list293);
                        vp_meaning = current_$91.first();
                        current_$91 = current_$91.rest();
                        if (NIL == current_$91) {
                            SubLObject cdolist_list_var_$90 = subj_options;
                            SubLObject this_subj_option = NIL;
                            this_subj_option = cdolist_list_var_$90.first();
                            while (NIL != cdolist_list_var_$90) {
                                SubLObject current_$92;
                                final SubLObject datum_$91 = current_$92 = this_subj_option;
                                SubLObject subj_node = NIL;
                                SubLObject subj_meaning = NIL;
                                destructuring_bind_must_consp(current_$92, datum_$91, iterative_template_parser.$list294);
                                subj_node = current_$92.first();
                                current_$92 = current_$92.rest();
                                destructuring_bind_must_consp(current_$92, datum_$91, iterative_template_parser.$list294);
                                subj_meaning = current_$92.first();
                                current_$92 = current_$92.rest();
                                if (NIL == current_$92) {
                                    SubLObject joined_meaning = tree_substitute(vp_meaning, iterative_template_parser.$$TheSentenceSubject, subj_meaning);
                                    joined_meaning = tree_substitute(joined_meaning, $SUBJECT, subj_meaning);
                                    these_instructions = cons(list(iterative_template_parser.$$dependentMeaning, my_kb_node, joined_meaning, vp_node, vp_meaning), these_instructions);
                                    these_instructions = cons(list(iterative_template_parser.$$dependentMeaning, my_kb_node, joined_meaning, subj_node, subj_meaning), these_instructions);
                                } else {
                                    cdestructuring_bind_error(datum_$91, iterative_template_parser.$list294);
                                }
                                cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                this_subj_option = cdolist_list_var_$90.first();
                            } 
                        } else {
                            cdestructuring_bind_error(datum_$90, iterative_template_parser.$list293);
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        this_vp_option = cdolist_list_var3.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, iterative_template_parser.$list291);
            }
        }
        if (NIL == tree_find_if(iterative_template_parser.$sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED)) {
            these_instructions = cons(list(iterative_template_parser.$$proposedMeaning, my_kb_node, my_meaning), these_instructions);
        }
        cdolist_list_var2 = iterative_template_parser.itp_node_get_dominance_gafs(self);
        SubLObject this_gaf3 = NIL;
        this_gaf3 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            these_instructions = cons(this_gaf3, these_instructions);
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_gaf3 = cdolist_list_var2.first();
        } 
        return reverse(these_instructions);
    }

    /**
     * Perform the breadth-first walkdown of the parse tree to compute the
     * answers we want to return. Individual nodes are computed via
     * PERFORM-SOLUTION-NODE-ANALYSIS.
     */
    @LispMethod(comment = "Perform the breadth-first walkdown of the parse tree to compute the\r\nanswers we want to return. Individual nodes are computed via\r\nPERFORM-SOLUTION-NODE-ANALYSIS.\nPerform the breadth-first walkdown of the parse tree to compute the\nanswers we want to return. Individual nodes are computed via\nPERFORM-SOLUTION-NODE-ANALYSIS.")
    public static final SubLObject cat_itp_alt(SubLObject state) {
        if (state == UNPROVIDED) {
            state = $last_itp_state_created$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, ITP_STATE_P);
            {
                SubLObject answers = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_state_solution_set(state);
                SubLObject todo = com.cyc.cycjava.cycl.rtp.iterative_template_parser.enqueue_solution_roots(queues.create_queue(), answers);
                SubLObject result_hash = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED);
                SubLObject global_sub_list = NIL;
                SubLObject span = NIL;
                SubLObject section = NIL;
                SubLObject results = NIL;
                SubLObject sub_list = NIL;
                while (NIL == queues.queue_empty_p(todo)) {
                    {
                        SubLObject curr = queues.dequeue(todo);
                        SubLObject the_span = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(curr);
                        if (!span.equal(the_span)) {
                            if (NIL != section) {
                                {
                                    SubLObject cdolist_list_var = section;
                                    SubLObject cycl = NIL;
                                    for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                        hash_table_utilities.pushnew_hash(span, cycl, result_hash, symbol_function(EQUAL));
                                    }
                                }
                            }
                            span = the_span;
                            section = NIL;
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject section_98 = com.cyc.cycjava.cycl.rtp.iterative_template_parser.perform_solution_node_analysis(state, curr, section, todo);
                            SubLObject sub_list_99 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            section = section_98;
                            sub_list = sub_list_99;
                        }
                        global_sub_list = cconcatenate(global_sub_list, sub_list);
                    }
                } 
                if (NIL != section) {
                    {
                        SubLObject cdolist_list_var = section;
                        SubLObject cycl = NIL;
                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                            hash_table_utilities.pushnew_hash(span, cycl, result_hash, symbol_function(EQUAL));
                        }
                    }
                }
                {
                    SubLObject span_100 = NIL;
                    SubLObject cycl = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(result_hash);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                span_100 = getEntryKey(cdohash_entry);
                                cycl = getEntryValue(cdohash_entry);
                                {
                                    SubLObject item_var = list(span_100, cycl);
                                    if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        results = cons(item_var, results);
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                {
                    SubLObject temp_results = NIL;
                    SubLObject temp_result = NIL;
                    SubLObject cdolist_list_var = results;
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        temp_result = result;
                        {
                            SubLObject cdolist_list_var_101 = global_sub_list;
                            SubLObject sub = NIL;
                            for (sub = cdolist_list_var_101.first(); NIL != cdolist_list_var_101; cdolist_list_var_101 = cdolist_list_var_101.rest() , sub = cdolist_list_var_101.first()) {
                                temp_result = subst(second(sub), sub.first(), temp_result, symbol_function(EQUAL), UNPROVIDED);
                                if ((temp_result.isList() && second(temp_result).isList()) && (NIL != assertion_handles.assertion_p(second(temp_result).first()))) {
                                    temp_result = list(temp_result.first(), cconcatenate(second(temp_result), third(sub)));
                                }
                            }
                        }
                        {
                            SubLObject item_var = temp_result;
                            if (NIL == member(item_var, temp_results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                temp_results = cons(item_var, temp_results);
                            }
                        }
                    }
                    results = temp_results;
                }
                return com.cyc.cycjava.cycl.rtp.iterative_template_parser.sort_itp_results(results);
            }
        }
    }

    @LispMethod(comment = "Perform the breadth-first walkdown of the parse tree to compute the\r\nanswers we want to return. Individual nodes are computed via\r\nPERFORM-SOLUTION-NODE-ANALYSIS.\nPerform the breadth-first walkdown of the parse tree to compute the\nanswers we want to return. Individual nodes are computed via\nPERFORM-SOLUTION-NODE-ANALYSIS.")
    public static SubLObject cat_itp(SubLObject state) {
        if (state == UNPROVIDED) {
            state = iterative_template_parser.$last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterative_template_parser.itp_state_p(state) : "! iterative_template_parser.itp_state_p(state) " + ("iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) ") + state;
        final SubLObject answers = iterative_template_parser.itp_state_solution_set(state);
        final SubLObject todo = iterative_template_parser.enqueue_solution_roots(create_queue(UNPROVIDED), answers);
        final SubLObject result_hash = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED);
        SubLObject global_sub_list = NIL;
        SubLObject span = NIL;
        SubLObject section = NIL;
        SubLObject results = NIL;
        SubLObject sub_list = NIL;
        while (NIL == queue_empty_p(todo)) {
            final SubLObject curr = dequeue(todo);
            final SubLObject the_span = iterative_template_parser.itp_node_span(curr);
            if (!span.equal(the_span)) {
                if (NIL != section) {
                    SubLObject cdolist_list_var = section;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        pushnew_hash(span, cycl, result_hash, symbol_function(EQUAL));
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                }
                span = the_span;
                section = NIL;
            }
            thread.resetMultipleValues();
            final SubLObject section_$95 = iterative_template_parser.perform_solution_node_analysis(state, curr, section, todo);
            final SubLObject sub_list_$96 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            section = section_$95;
            sub_list = sub_list_$96;
            global_sub_list = cconcatenate(global_sub_list, sub_list);
        } 
        if (NIL != section) {
            SubLObject cdolist_list_var2 = section;
            SubLObject cycl2 = NIL;
            cycl2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                pushnew_hash(span, cycl2, result_hash, symbol_function(EQUAL));
                cdolist_list_var2 = cdolist_list_var2.rest();
                cycl2 = cdolist_list_var2.first();
            } 
        }
        SubLObject span_$97 = NIL;
        SubLObject cycl2 = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(result_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                span_$97 = getEntryKey(cdohash_entry);
                cycl2 = getEntryValue(cdohash_entry);
                final SubLObject item_var = list(span_$97, cycl2);
                if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject temp_results = NIL;
        SubLObject temp_result = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            temp_result = result;
            SubLObject cdolist_list_var_$98 = global_sub_list;
            SubLObject sub = NIL;
            sub = cdolist_list_var_$98.first();
            while (NIL != cdolist_list_var_$98) {
                temp_result = subst(second(sub), sub.first(), temp_result, symbol_function(EQUAL), UNPROVIDED);
                if ((temp_result.isList() && second(temp_result).isList()) && (NIL != assertion_p(second(temp_result).first()))) {
                    temp_result = list(temp_result.first(), cconcatenate(second(temp_result), third(sub)));
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                sub = cdolist_list_var_$98.first();
            } 
            final SubLObject item_var = temp_result;
            if (NIL == member(item_var, temp_results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                temp_results = cons(item_var, temp_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        results = temp_results;
        return iterative_template_parser.sort_itp_results(results);
    }/**
     * Perform the breadth-first walkdown of the parse tree to compute the
     * answers we want to return. Individual nodes are computed via
     * PERFORM-SOLUTION-NODE-ANALYSIS.
     */


    public static final SubLObject transform_nl_quant_forms_alt(SubLObject formula, SubLObject span_incr) {
        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.nl_attr_w_locationP(formula)) {
            {
                SubLObject incremented = replace_formula_arg(THREE_INTEGER, add(span_incr, cycl_utilities.formula_arg3(formula, UNPROVIDED)), formula);
                formula = incremented;
            }
        }
        if (formula.isAtom()) {
            return formula;
        } else {
            if (NIL != forts.fort_p(formula)) {
                return formula;
            } else {
                if (NIL != el_formula_p(formula)) {
                    if (NIL != cycl_utilities.expression_find_if($sym290$NL_ATTR_W_LOCATION_, formula, UNPROVIDED, UNPROVIDED)) {
                        return cons(com.cyc.cycjava.cycl.rtp.iterative_template_parser.transform_nl_quant_forms(cycl_utilities.formula_arg0(formula), span_incr), com.cyc.cycjava.cycl.rtp.iterative_template_parser.transform_nl_quant_forms(cycl_utilities.formula_args(formula, UNPROVIDED), span_incr));
                    } else {
                        return formula;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject transform_nl_quant_forms(SubLObject formula, final SubLObject span_incr) {
        if (NIL != iterative_template_parser.nl_attr_w_locationP(formula)) {
            final SubLObject incremented = formula = replace_formula_arg(THREE_INTEGER, add(span_incr, formula_arg3(formula, UNPROVIDED)), formula);
        }
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL != fort_p(formula)) {
            return formula;
        }
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        if (NIL != expression_find_if(iterative_template_parser.$sym297$NL_ATTR_W_LOCATION_, formula, UNPROVIDED, UNPROVIDED)) {
            return cons(iterative_template_parser.transform_nl_quant_forms(formula_arg0(formula), span_incr), iterative_template_parser.transform_nl_quant_forms(formula_args(formula, UNPROVIDED), span_incr));
        }
        return formula;
    }

    public static final SubLObject nl_attr_w_locationP_alt(SubLObject formula) {
        return makeBoolean((NIL != memberP(cycl_utilities.formula_arg0(formula), $list_alt291, UNPROVIDED, UNPROVIDED)) && (NIL != formula_arityE(formula, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject nl_attr_w_locationP(final SubLObject formula) {
        return makeBoolean((NIL != subl_promotions.memberP(formula_arg0(formula), iterative_template_parser.$list298, UNPROVIDED, UNPROVIDED)) && (NIL != formula_arityE(formula, THREE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject sort_itp_results_alt(SubLObject parses) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject constit = NIL;
            for (constit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constit = cdolist_list_var.first()) {
                {
                    SubLObject constit_span = constit.first();
                    SubLObject constit_good_result = NIL;
                    SubLObject constit_bad_result = NIL;
                    SubLObject cdolist_list_var_102 = constit.rest().first();
                    SubLObject cycl = NIL;
                    for (cycl = cdolist_list_var_102.first(); NIL != cdolist_list_var_102; cdolist_list_var_102 = cdolist_list_var_102.rest() , cycl = cdolist_list_var_102.first()) {
                        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_contains_invalid_surrogateP(cycl, parses)) {
                            constit_bad_result = cons(cycl, constit_bad_result);
                        } else {
                            constit_good_result = cons(cycl, constit_good_result);
                        }
                    }
                    result = cons(list(constit_span, cconcatenate(reverse(constit_good_result), reverse(constit_bad_result))), result);
                }
            }
            return Sort.sort(result, symbol_function($sym220$_), symbol_function(ITP_OUTPUT_SORTING_FUNCTION));
        }
    }

    public static SubLObject sort_itp_results(final SubLObject parses) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject constit = NIL;
        constit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constit_span = constit.first();
            SubLObject constit_good_result = NIL;
            SubLObject constit_bad_result = NIL;
            SubLObject cdolist_list_var_$99 = constit.rest().first();
            SubLObject cycl = NIL;
            cycl = cdolist_list_var_$99.first();
            while (NIL != cdolist_list_var_$99) {
                if (NIL != iterative_template_parser.rtp_contains_invalid_surrogateP(cycl, parses)) {
                    constit_bad_result = cons(cycl, constit_bad_result);
                } else {
                    constit_good_result = cons(cycl, constit_good_result);
                }
                cdolist_list_var_$99 = cdolist_list_var_$99.rest();
                cycl = cdolist_list_var_$99.first();
            } 
            result = cons(list(constit_span, cconcatenate(reverse(constit_good_result), reverse(constit_bad_result))), result);
            cdolist_list_var = cdolist_list_var.rest();
            constit = cdolist_list_var.first();
        } 
        return Sort.sort(result, symbol_function(iterative_template_parser.$sym229$_), symbol_function(iterative_template_parser.ITP_OUTPUT_SORTING_FUNCTION));
    }

    public static final SubLObject rtp_contains_invalid_surrogateP_alt(SubLObject parse, SubLObject parses) {
        {
            SubLObject surrogates = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(parse);
            SubLObject invalidP = NIL;
            if (NIL == surrogates) {
                return NIL;
            }
            if (NIL == invalidP) {
                {
                    SubLObject csome_list_var = surrogates;
                    SubLObject surrogate = NIL;
                    for (surrogate = csome_list_var.first(); !((NIL != invalidP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , surrogate = csome_list_var.first()) {
                        {
                            SubLObject surrogate_index = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate);
                            if (NIL == find(surrogate_index, parses, EQUAL, FIRST, UNPROVIDED, UNPROVIDED)) {
                                invalidP = T;
                            }
                        }
                    }
                }
            }
            return invalidP;
        }
    }

    public static SubLObject rtp_contains_invalid_surrogateP(final SubLObject parse, final SubLObject parses) {
        final SubLObject surrogates = rkf_ch_gather_parsing_surrogates(parse);
        SubLObject invalidP = NIL;
        if (NIL == surrogates) {
            return NIL;
        }
        if (NIL == invalidP) {
            SubLObject csome_list_var = surrogates;
            SubLObject surrogate = NIL;
            surrogate = csome_list_var.first();
            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                final SubLObject surrogate_index = rkf_ch_parsing_surrogate_token_index_list(surrogate);
                if (NIL == find(surrogate_index, parses, EQUAL, FIRST, UNPROVIDED, UNPROVIDED)) {
                    invalidP = T;
                }
                csome_list_var = csome_list_var.rest();
                surrogate = csome_list_var.first();
            } 
        }
        return invalidP;
    }

    /**
     * is FORMULA an #$AssemblePhraseFn in which not all the arguments are strings?
     *
     * @param FORMULA
    formula
     * 		
     */
    @LispMethod(comment = "is FORMULA an #$AssemblePhraseFn in which not all the arguments are strings?\r\n\r\n@param FORMULA\nformula")
    public static final SubLObject unassembled_phraseP_alt(SubLObject formula) {
        return makeBoolean((formula.isList() && (cycl_utilities.formula_arg0(formula) == $$AssemblePhraseFn)) && (NIL != list_utilities.find_if_not(symbol_function(STRINGP), formula.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    @LispMethod(comment = "is FORMULA an #$AssemblePhraseFn in which not all the arguments are strings?\r\n\r\n@param FORMULA\n\t\tformula")
    public static SubLObject unassembled_phraseP(final SubLObject formula) {
        return makeBoolean((formula.isList() && formula_arg0(formula).eql(iterative_template_parser.$$AssemblePhraseFn)) && (NIL != find_if_not(symbol_function(STRINGP), formula.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }/**
     * is FORMULA an #$AssemblePhraseFn in which not all the arguments are strings?
     *
     * @param FORMULA
    		formula
     * 		
     */


    public static final SubLObject transform_assemble_phrases_alt(SubLObject formula) {
        return values(transform_list_utilities.transform(formula, symbol_function($sym296$UNASSEMBLED_PHRASE_), symbol_function(REWRITE_ASSEMBLE_PHRASE), UNPROVIDED));
    }

    public static SubLObject transform_assemble_phrases(final SubLObject formula) {
        return values(transform(formula, symbol_function(iterative_template_parser.$sym303$UNASSEMBLED_PHRASE_), symbol_function(iterative_template_parser.REWRITE_ASSEMBLE_PHRASE), UNPROVIDED));
    }

    /**
     * Perform the analysis on the node, like adding plain solutions to
     * section, descending into joinTemplateComponents, etc. Children that
     * still need work go to the todo-list. state is available for cache lookup.
     * Returns the new state of section.
     */
    @LispMethod(comment = "Perform the analysis on the node, like adding plain solutions to\r\nsection, descending into joinTemplateComponents, etc. Children that\r\nstill need work go to the todo-list. state is available for cache lookup.\r\nReturns the new state of section.\nPerform the analysis on the node, like adding plain solutions to\nsection, descending into joinTemplateComponents, etc. Children that\nstill need work go to the todo-list. state is available for cache lookup.\nReturns the new state of section.")
    public static final SubLObject perform_solution_node_analysis_alt(SubLObject state, SubLObject node, SubLObject section, SubLObject todo_list) {
        {
            SubLObject expression = com.cyc.cycjava.cycl.rtp.iterative_template_parser.transform_assemble_phrases(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node));
            SubLObject assertion = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_assertion(node);
            SubLObject join_templatesP = com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_join_template_componentsP(expression);
            SubLObject span_start = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_span(node).first();
            SubLObject solution_list = NIL;
            if (((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_substitutable_childrenP(expression)) || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_substitutable_formulaP(expression))) || (NIL != join_templatesP)) {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(node);
                    SubLObject child = NIL;
                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                        if ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_substitutable_formulaP(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(child))) || (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.substitutable_child_nodeP(child))) {
                            {
                                SubLObject modifieds = com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_do_substitutions(expression, child, todo_list);
                                SubLObject cdolist_list_var_103 = modifieds;
                                SubLObject modified = NIL;
                                for (modified = cdolist_list_var_103.first(); NIL != cdolist_list_var_103; cdolist_list_var_103 = cdolist_list_var_103.rest() , modified = cdolist_list_var_103.first()) {
                                    {
                                        SubLObject cycl = modified.first();
                                        SubLObject asserts = second(modified);
                                        SubLObject reformulated = (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_join_template_componentsP(cycl)) ? ((SubLObject) (recognition.reformulate_jointemplatecomponents(cycl))) : cycl;
                                        SubLObject assertion_set = cons(assertion, asserts);
                                        if (NIL != reformulated) {
                                            reformulated = com.cyc.cycjava.cycl.rtp.iterative_template_parser.transform_assemble_phrases(reformulated);
                                            if (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.partial_parsesP(reformulated)) {
                                                {
                                                    SubLObject cdolist_list_var_104 = com.cyc.cycjava.cycl.rtp.iterative_template_parser.find_differences(expression, reformulated, UNPROVIDED);
                                                    SubLObject diff = NIL;
                                                    for (diff = cdolist_list_var_104.first(); NIL != cdolist_list_var_104; cdolist_list_var_104 = cdolist_list_var_104.rest() , diff = cdolist_list_var_104.first()) {
                                                        {
                                                            SubLObject item_var = list(diff.first(), second(diff), assertion_set);
                                                            if (NIL == member(item_var, solution_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                solution_list = cons(item_var, solution_list);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_join_template_componentsP(reformulated)) {
                                                    reformulated = recognition.reformulate_jointemplatecomponents(reformulated);
                                                }
                                                if (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_join_template_componentsP(reformulated)) {
                                                    {
                                                        SubLObject item_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.build_return_format(reformulated, assertion_set, span_start);
                                                        if (NIL == member(item_var, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                            section = cons(item_var, section);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var_105 = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(node);
                                SubLObject child_106 = NIL;
                                for (child_106 = cdolist_list_var_105.first(); NIL != cdolist_list_var_105; cdolist_list_var_105 = cdolist_list_var_105.rest() , child_106 = cdolist_list_var_105.first()) {
                                    if (NIL == queues.queue_find(child_106, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                                        queues.enqueue(child_106, todo_list);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != expression) {
                    {
                        SubLObject item_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.build_return_format(NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_join_template_componentsP(expression) ? ((SubLObject) (recognition.reformulate_jointemplatecomponents(expression))) : expression, list(assertion), span_start);
                        if (NIL == member(item_var, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            section = cons(item_var, section);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(node);
                    SubLObject child = NIL;
                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                        if (NIL == queues.queue_find(child, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                            queues.enqueue(child, todo_list);
                        }
                    }
                }
            }
            return values(com.cyc.cycjava.cycl.rtp.iterative_template_parser.rtp_sort_constit_parses(section), solution_list);
        }
    }

    @LispMethod(comment = "Perform the analysis on the node, like adding plain solutions to\r\nsection, descending into joinTemplateComponents, etc. Children that\r\nstill need work go to the todo-list. state is available for cache lookup.\r\nReturns the new state of section.\nPerform the analysis on the node, like adding plain solutions to\nsection, descending into joinTemplateComponents, etc. Children that\nstill need work go to the todo-list. state is available for cache lookup.\nReturns the new state of section.")
    public static SubLObject perform_solution_node_analysis(final SubLObject state, final SubLObject node, SubLObject section, final SubLObject todo_list) {
        final SubLObject expression = iterative_template_parser.transform_assemble_phrases(iterative_template_parser.itp_node_new_parse(node));
        final SubLObject assertion = iterative_template_parser.itp_node_assertion(node);
        final SubLObject join_templatesP = iterative_template_parser.has_join_template_componentsP(expression);
        final SubLObject span_start = iterative_template_parser.itp_node_span(node).first();
        SubLObject solution_list = NIL;
        if (((NIL != iterative_template_parser.has_substitutable_childrenP(expression)) || (NIL != iterative_template_parser.tp_substitutable_formulaP(expression))) || (NIL != join_templatesP)) {
            SubLObject cdolist_list_var = iterative_template_parser.itp_node_children(node);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != iterative_template_parser.tp_substitutable_formulaP(iterative_template_parser.itp_node_component(child))) || (NIL != iterative_template_parser.substitutable_child_nodeP(child))) {
                    SubLObject cdolist_list_var_$100;
                    final SubLObject modifieds = cdolist_list_var_$100 = iterative_template_parser.tp_do_substitutions(expression, child, todo_list);
                    SubLObject modified = NIL;
                    modified = cdolist_list_var_$100.first();
                    while (NIL != cdolist_list_var_$100) {
                        final SubLObject cycl = modified.first();
                        final SubLObject asserts = second(modified);
                        SubLObject reformulated = (NIL != iterative_template_parser.has_join_template_componentsP(cycl)) ? recognition.reformulate_jointemplatecomponents(cycl) : cycl;
                        final SubLObject assertion_set = cons(assertion, asserts);
                        if (NIL != reformulated) {
                            reformulated = iterative_template_parser.transform_assemble_phrases(reformulated);
                            if (NIL == iterative_template_parser.partial_parsesP(reformulated)) {
                                SubLObject cdolist_list_var_$101 = iterative_template_parser.find_differences(expression, reformulated, UNPROVIDED);
                                SubLObject diff = NIL;
                                diff = cdolist_list_var_$101.first();
                                while (NIL != cdolist_list_var_$101) {
                                    final SubLObject item_var = list(diff.first(), second(diff), assertion_set);
                                    if (NIL == member(item_var, solution_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        solution_list = cons(item_var, solution_list);
                                    }
                                    cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                    diff = cdolist_list_var_$101.first();
                                } 
                                if (NIL != iterative_template_parser.has_join_template_componentsP(reformulated)) {
                                    reformulated = recognition.reformulate_jointemplatecomponents(reformulated);
                                }
                                if (NIL == iterative_template_parser.has_join_template_componentsP(reformulated)) {
                                    final SubLObject item_var2 = iterative_template_parser.build_return_format(reformulated, assertion_set, span_start);
                                    if (NIL == member(item_var2, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        section = cons(item_var2, section);
                                    }
                                }
                            }
                        }
                        cdolist_list_var_$100 = cdolist_list_var_$100.rest();
                        modified = cdolist_list_var_$100.first();
                    } 
                } else {
                    SubLObject cdolist_list_var_$102 = iterative_template_parser.itp_node_children(node);
                    SubLObject child_$103 = NIL;
                    child_$103 = cdolist_list_var_$102.first();
                    while (NIL != cdolist_list_var_$102) {
                        if (NIL == queue_find(child_$103, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                            enqueue(child_$103, todo_list);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        child_$103 = cdolist_list_var_$102.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } else {
            if (NIL != expression) {
                final SubLObject item_var3 = iterative_template_parser.build_return_format(NIL != iterative_template_parser.has_join_template_componentsP(expression) ? recognition.reformulate_jointemplatecomponents(expression) : expression, list(assertion), span_start);
                if (NIL == member(item_var3, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    section = cons(item_var3, section);
                }
            }
            SubLObject cdolist_list_var = iterative_template_parser.itp_node_children(node);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == queue_find(child, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    enqueue(child, todo_list);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        }
        return values(iterative_template_parser.rtp_sort_constit_parses(section), solution_list);
    }/**
     * Perform the analysis on the node, like adding plain solutions to
     * section, descending into joinTemplateComponents, etc. Children that
     * still need work go to the todo-list. state is available for cache lookup.
     * Returns the new state of section.
     */


    public static final SubLObject rtp_sort_constit_parses_alt(SubLObject parses) {
        return parses;
    }

    public static SubLObject rtp_sort_constit_parses(final SubLObject parses) {
        return parses;
    }

    /**
     *
     *
     * @unknown at present, only works for :simple results
     */
    @LispMethod(comment = "@unknown at present, only works for :simple results")
    public static final SubLObject merge_parse_results_alt(SubLObject parse1, SubLObject parse2) {
        {
            SubLObject parse_iterator1 = rtp_iterators.new_itp_result_iterator(parse1, UNPROVIDED, UNPROVIDED);
            SubLObject parse_iterator2 = rtp_iterators.new_itp_result_iterator(parse2, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator1)) {
                {
                    SubLObject span_iterator1 = rtp_iterators.itp_result_iterator_curr(parse_iterator1);
                    SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator1);
                    SubLObject span_iterator2 = rtp_iterators.find_itp_section_iterator(parse_iterator2, span);
                    SubLObject span_result = NIL;
                    if (NIL != span_iterator2) {
                        span_result = rtp_iterators.itp_section_iterator_section(span_iterator2);
                    }
                    span_result = cconcatenate(span_result, rtp_iterators.itp_section_iterator_section(span_iterator1));
                    result = cons(list(span, span_result), result);
                }
                rtp_iterators.itp_result_iterator_next(parse_iterator1);
            } 
            while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator2)) {
                {
                    SubLObject span_iterator2 = rtp_iterators.itp_result_iterator_curr(parse_iterator2);
                    SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator2);
                    SubLObject span_iterator1 = rtp_iterators.find_itp_section_iterator(parse_iterator1, span);
                    SubLObject span_result = NIL;
                    if (NIL == span_iterator1) {
                        span_result = rtp_iterators.itp_section_iterator_section(span_iterator2);
                        result = cons(list(span, span_result), result);
                    }
                }
                rtp_iterators.itp_result_iterator_next(parse_iterator2);
            } 
            return Sort.sort(result, $sym220$_, ITP_OUTPUT_SORTING_FUNCTION);
        }
    }

    /**
     *
     *
     * @unknown at present, only works for :simple results
     */
    @LispMethod(comment = "@unknown at present, only works for :simple results")
    public static SubLObject merge_parse_results(final SubLObject parse1, final SubLObject parse2) {
        final SubLObject parse_iterator1 = rtp_iterators.new_itp_result_iterator(parse1, UNPROVIDED, UNPROVIDED);
        final SubLObject parse_iterator2 = rtp_iterators.new_itp_result_iterator(parse2, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator1)) {
            final SubLObject span_iterator1 = rtp_iterators.itp_result_iterator_curr(parse_iterator1);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator1);
            final SubLObject span_iterator2 = rtp_iterators.find_itp_section_iterator(parse_iterator2, span);
            SubLObject span_result = NIL;
            if (NIL != span_iterator2) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator2);
            }
            span_result = cconcatenate(span_result, rtp_iterators.itp_section_iterator_section(span_iterator1));
            result = cons(list(span, span_result), result);
            rtp_iterators.itp_result_iterator_next(parse_iterator1);
        } 
        while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator2)) {
            final SubLObject span_iterator3 = rtp_iterators.itp_result_iterator_curr(parse_iterator2);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator3);
            final SubLObject span_iterator4 = rtp_iterators.find_itp_section_iterator(parse_iterator1, span);
            SubLObject span_result = NIL;
            if (NIL == span_iterator4) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator3);
                result = cons(list(span, span_result), result);
            }
            rtp_iterators.itp_result_iterator_next(parse_iterator2);
        } 
        return Sort.sort(result, iterative_template_parser.$sym229$_, iterative_template_parser.ITP_OUTPUT_SORTING_FUNCTION);
    }

    /**
     *
     *
     * @param LIST1
    formula
     * 		
     * @param LIST2
    formula
     * 		
     * @param TEST
    function
     * 		
     * @return list; a list of pairs of formulas
    Given two formulas, this function finds the differences in them by comparing their
    arg0 positions.  If the arg0's are the same, it recurs on the cdrs, while if they
    are different, it returns the formulas as a pair.
     */
    @LispMethod(comment = "@param LIST1\nformula\r\n\t\t\r\n@param LIST2\nformula\r\n\t\t\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list of pairs of formulas\r\nGiven two formulas, this function finds the differences in them by comparing their\r\narg0 positions.  If the arg0\'s are the same, it recurs on the cdrs, while if they\r\nare different, it returns the formulas as a pair.")
    public static final SubLObject find_differences_alt(SubLObject list1, SubLObject list2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        if (NIL != funcall(test, list1, list2)) {
            return NIL;
        } else {
            if ((NIL != constant_p(list1)) || (NIL != constant_p(list2))) {
                return list(list(list1, list2));
            } else {
                if ((list1.first().isAtom() || list2.first().isAtom()) && (NIL == funcall(test, list1.first(), list2.first()))) {
                    return list(list(list1, list2));
                } else {
                    return cconcatenate(com.cyc.cycjava.cycl.rtp.iterative_template_parser.find_differences(list1.first(), list2.first(), UNPROVIDED), com.cyc.cycjava.cycl.rtp.iterative_template_parser.find_differences(list1.rest(), list2.rest(), UNPROVIDED));
                }
            }
        }
    }

    /**
     *
     *
     * @param LIST1
    formula
     * 		
     * @param LIST2
    formula
     * 		
     * @param TEST
    function
     * 		
     * @return list; a list of pairs of formulas
    Given two formulas, this function finds the differences in them by comparing their
    arg0 positions.  If the arg0's are the same, it recurs on the cdrs, while if they
    are different, it returns the formulas as a pair.
     */
    @LispMethod(comment = "@param LIST1\nformula\r\n\t\t\r\n@param LIST2\nformula\r\n\t\t\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list of pairs of formulas\r\nGiven two formulas, this function finds the differences in them by comparing their\r\narg0 positions.  If the arg0\'s are the same, it recurs on the cdrs, while if they\r\nare different, it returns the formulas as a pair.")
    public static SubLObject find_differences(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        if (NIL != funcall(test, list1, list2)) {
            return NIL;
        }
        if ((NIL != constant_p(list1)) || (NIL != constant_p(list2))) {
            return list(list(list1, list2));
        }
        if ((list1.first().isAtom() || list2.first().isAtom()) && (NIL == funcall(test, list1.first(), list2.first()))) {
            return list(list(list1, list2));
        }
        return cconcatenate(iterative_template_parser.find_differences(list1.first(), list2.first(), UNPROVIDED), iterative_template_parser.find_differences(list1.rest(), list2.rest(), UNPROVIDED));
    }

    /**
     *
     *
     * @param SEM
    formula
     * 		
     * @param ASSERTIONS
    assertion
     * 		
     * @return list; a list that either is the output, or is a list containing the cycl as the
    first element, followed by any extra material
     */
    @LispMethod(comment = "@param SEM\nformula\r\n\t\t\r\n@param ASSERTIONS\nassertion\r\n\t\t\r\n@return list; a list that either is the output, or is a list containing the cycl as the\r\nfirst element, followed by any extra material")
    public static final SubLObject build_return_format_alt(SubLObject sem, SubLObject assertion, SubLObject span_start) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sem = com.cyc.cycjava.cycl.rtp.iterative_template_parser.transform_nl_quant_forms(sem, span_start);
            {
                SubLObject pcase_var = rtp_vars.$rtp_return_style$.getDynamicValue(thread);
                if (pcase_var.eql($SIMPLE)) {
                    return sem;
                } else {
                    if (pcase_var.eql($ASSERTION)) {
                        return list(sem, assertion);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param SEM
    formula
     * 		
     * @param ASSERTIONS
    assertion
     * 		
     * @return list; a list that either is the output, or is a list containing the cycl as the
    first element, followed by any extra material
     */
    @LispMethod(comment = "@param SEM\nformula\r\n\t\t\r\n@param ASSERTIONS\nassertion\r\n\t\t\r\n@return list; a list that either is the output, or is a list containing the cycl as the\r\nfirst element, followed by any extra material")
    public static SubLObject build_return_format(SubLObject sem, final SubLObject assertion, final SubLObject span_start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sem = iterative_template_parser.transform_nl_quant_forms(sem, span_start);
        final SubLObject pcase_var = rtp_vars.$rtp_return_style$.getDynamicValue(thread);
        if (pcase_var.eql($SIMPLE)) {
            return sem;
        }
        if (pcase_var.eql($ASSERTION)) {
            return list(sem, assertion);
        }
        return NIL;
    }

    /**
     * given a particular justification, return the syntactic category thereof
     *
     * @unknown if there are several justifications, just take the category of the first one
     * @param JUSTIFICATION
     * 		list of assertions or constant
     * @return atom; an instance of #$TemplateParserCategory
     */
    @LispMethod(comment = "given a particular justification, return the syntactic category thereof\r\n\r\n@unknown if there are several justifications, just take the category of the first one\r\n@param JUSTIFICATION\r\n\t\tlist of assertions or constant\r\n@return atom; an instance of #$TemplateParserCategory")
    public static final SubLObject cat_for_result_alt(SubLObject justification) {
        if (justification.isList() && (NIL != assertion_handles.assertion_p(justification.first()))) {
            return assertions_high.gaf_arg1(justification.first());
        } else {
            return justification.first();
        }
    }

    @LispMethod(comment = "given a particular justification, return the syntactic category thereof\r\n\r\n@unknown if there are several justifications, just take the category of the first one\r\n@param JUSTIFICATION\r\n\t\tlist of assertions or constant\r\n@return atom; an instance of #$TemplateParserCategory")
    public static SubLObject cat_for_result(final SubLObject justification) {
        if (justification.isList() && (NIL != assertion_p(justification.first()))) {
            return gaf_arg1(justification.first());
        }
        return justification.first();
    }/**
     * given a particular justification, return the syntactic category thereof
     *
     * @unknown if there are several justifications, just take the category of the first one
     * @param JUSTIFICATION
     * 		list of assertions or constant
     * @return atom; an instance of #$TemplateParserCategory
     */


    /**
     * given a particular justification, return the sentential force thereof
     *
     * @unknown normalizes predicates in code rather than looking in the KB
     * @unknown if there are several justifications, just take the force of the first one
     * @param JUSTIFICATION
     * 		list of assertions or constant
     * @return atom; an instance of #$ParseTemplatePredicate; note that sentential force is assumed
    to be carried by the predicate
     */
    @LispMethod(comment = "given a particular justification, return the sentential force thereof\r\n\r\n@unknown normalizes predicates in code rather than looking in the KB\r\n@unknown if there are several justifications, just take the force of the first one\r\n@param JUSTIFICATION\r\n\t\tlist of assertions or constant\r\n@return atom; an instance of #$ParseTemplatePredicate; note that sentential force is assumed\r\nto be carried by the predicate")
    public static final SubLObject force_for_result_alt(SubLObject justification) {
        if (justification.isList() && ((justification.first() == $$NPTemplate) || (NIL != lexicon_accessors.npP(justification.first())))) {
            return $$termTemplate;
        } else {
            if (justification.isList() && ((NIL != memberP(justification.first(), $list_alt300, UNPROVIDED, UNPROVIDED)) || (NIL != lexicon_accessors.vbarP(justification.first())))) {
                return $$assertTemplate;
            } else {
                if (justification.first() == $$Adjective) {
                    return $$termTemplate;
                } else {
                    if (justification.isList() && (NIL != assertion_handles.assertion_p(justification.first()))) {
                        {
                            SubLObject pred = assertions_high.gaf_arg0(justification.first());
                            SubLObject pcase_var = pred;
                            if (pcase_var.eql($$termTemplate)) {
                                return $$termTemplate;
                            } else {
                                if (pcase_var.eql($$termTemplate_Reln)) {
                                    return $$termTemplate;
                                } else {
                                    if (pcase_var.eql($$termTemplate_Test)) {
                                        return $$termTemplate;
                                    } else {
                                        if (pcase_var.eql($$assertTemplate)) {
                                            return $$assertTemplate;
                                        } else {
                                            if (pcase_var.eql($$assertTemplate_Reln)) {
                                                return $$assertTemplate;
                                            } else {
                                                if (pcase_var.eql($$assertTemplate_Test)) {
                                                    return $$assertTemplate;
                                                } else {
                                                    if (pcase_var.eql($$queryTemplate)) {
                                                        return $$queryTemplate;
                                                    } else {
                                                        if (pcase_var.eql($$queryTemplate_Reln)) {
                                                            return $$queryTemplate;
                                                        } else {
                                                            if (pcase_var.eql($$queryTemplate_Test)) {
                                                                return $$queryTemplate;
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
                        Errors.warn($str_alt308$sent__S_to_force_for_result__, justification);
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "given a particular justification, return the sentential force thereof\r\n\r\n@unknown normalizes predicates in code rather than looking in the KB\r\n@unknown if there are several justifications, just take the force of the first one\r\n@param JUSTIFICATION\r\n\t\tlist of assertions or constant\r\n@return atom; an instance of #$ParseTemplatePredicate; note that sentential force is assumed\r\nto be carried by the predicate")
    public static SubLObject force_for_result(final SubLObject justification) {
        if (justification.isList() && (justification.first().eql(iterative_template_parser.$$NPTemplate) || (NIL != npP(justification.first())))) {
            return iterative_template_parser.$$termTemplate;
        }
        if (justification.isList() && ((NIL != subl_promotions.memberP(justification.first(), iterative_template_parser.$list307, UNPROVIDED, UNPROVIDED)) || (NIL != vbarP(justification.first())))) {
            return iterative_template_parser.$$assertTemplate;
        }
        if (justification.first().eql(iterative_template_parser.$$Adjective)) {
            return iterative_template_parser.$$termTemplate;
        }
        if ((!justification.isList()) || (NIL == assertion_p(justification.first()))) {
            Errors.warn(iterative_template_parser.$str315$sent__S_to_force_for_result__, justification);
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = gaf_arg0(justification.first());
        if (pcase_var.eql(iterative_template_parser.$$termTemplate)) {
            return iterative_template_parser.$$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$termTemplate_Reln)) {
            return iterative_template_parser.$$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$termTemplate_Test)) {
            return iterative_template_parser.$$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$assertTemplate)) {
            return iterative_template_parser.$$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$assertTemplate_Reln)) {
            return iterative_template_parser.$$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$assertTemplate_Test)) {
            return iterative_template_parser.$$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$queryTemplate)) {
            return iterative_template_parser.$$queryTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$queryTemplate_Reln)) {
            return iterative_template_parser.$$queryTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$$queryTemplate_Test)) {
            return iterative_template_parser.$$queryTemplate;
        }
        return NIL;
    }/**
     * given a particular justification, return the sentential force thereof
     *
     * @unknown normalizes predicates in code rather than looking in the KB
     * @unknown if there are several justifications, just take the force of the first one
     * @param JUSTIFICATION
     * 		list of assertions or constant
     * @return atom; an instance of #$ParseTemplatePredicate; note that sentential force is assumed
    to be carried by the predicate
     */


    public static final SubLObject tp_do_substitutions_alt(SubLObject expression, SubLObject node, SubLObject todo_list) {
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_do_substitutions_int(list(expression, NIL), node, todo_list);
    }

    public static SubLObject tp_do_substitutions(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        return iterative_template_parser.tp_do_substitutions_int(list(expression, NIL), node, todo_list);
    }

    /**
     * Given a particular Cycl sentence and a NODE that contains something that can be substituted
     * into the sentence, determine if the semantics of any of the children on of NODE should
     * be substituted into EXPRESSION.  Perform this recursively, since some of the children
     * might themselves need substitution.
     *
     * @param EXPRESSION
     * 		sentence; a two-element list containing a cycl-sentence and an assertion-list
     * @param NODE
    itp-node
     * 		
     * @param TODO-LIST
    list
     * 		
     * @return list; a list of cycl sentences/assertion-list pairs
     */
    @LispMethod(comment = "Given a particular Cycl sentence and a NODE that contains something that can be substituted\r\ninto the sentence, determine if the semantics of any of the children on of NODE should\r\nbe substituted into EXPRESSION.  Perform this recursively, since some of the children\r\nmight themselves need substitution.\r\n\r\n@param EXPRESSION\r\n\t\tsentence; a two-element list containing a cycl-sentence and an assertion-list\r\n@param NODE\nitp-node\r\n\t\t\r\n@param TODO-LIST\nlist\r\n\t\t\r\n@return list; a list of cycl sentences/assertion-list pairs\nGiven a particular Cycl sentence and a NODE that contains something that can be substituted\ninto the sentence, determine if the semantics of any of the children on of NODE should\nbe substituted into EXPRESSION.  Perform this recursively, since some of the children\nmight themselves need substitution.")
    public static final SubLObject tp_do_substitutions_int_alt(SubLObject expression, SubLObject node, SubLObject todo_list) {
        {
            SubLObject result = NIL;
            SubLObject this_result = NIL;
            if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.substitutable_child_nodeP(node)) {
                this_result = list(subst(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node), com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(node), expression.first(), symbol_function(EQUALP), UNPROVIDED), cons(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_assertion(node), second(expression)));
                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.has_substitutable_childrenP(this_result.first())) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_children(node);
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_107 = com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_do_substitutions_int(this_result, child, todo_list);
                                SubLObject child_result = NIL;
                                for (child_result = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , child_result = cdolist_list_var_107.first()) {
                                    result = cons(child_result, result);
                                }
                            }
                        }
                    }
                } else {
                    result = cons(this_result, result);
                    if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                        queues.enqueue(node, todo_list);
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.tp_substitutable_formulaP(expression.first())) {
                    result = cons(list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node), list(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_assertion(node))), result);
                    if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                        queues.enqueue(node, todo_list);
                    }
                } else {
                    result = list(expression);
                    if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                        queues.enqueue(node, todo_list);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Given a particular Cycl sentence and a NODE that contains something that can be substituted\r\ninto the sentence, determine if the semantics of any of the children on of NODE should\r\nbe substituted into EXPRESSION.  Perform this recursively, since some of the children\r\nmight themselves need substitution.\r\n\r\n@param EXPRESSION\r\n\t\tsentence; a two-element list containing a cycl-sentence and an assertion-list\r\n@param NODE\n\t\titp-node\r\n\t\t\r\n@param TODO-LIST\n\t\tlist\r\n\t\t\r\n@return list; a list of cycl sentences/assertion-list pairs\nGiven a particular Cycl sentence and a NODE that contains something that can be substituted\ninto the sentence, determine if the semantics of any of the children on of NODE should\nbe substituted into EXPRESSION.  Perform this recursively, since some of the children\nmight themselves need substitution.")
    public static SubLObject tp_do_substitutions_int(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        SubLObject result = NIL;
        SubLObject this_result = NIL;
        if (NIL != iterative_template_parser.substitutable_child_nodeP(node)) {
            this_result = list(subst(iterative_template_parser.itp_node_new_parse(node), iterative_template_parser.itp_node_component(node), expression.first(), symbol_function(EQUALP), UNPROVIDED), cons(iterative_template_parser.itp_node_assertion(node), second(expression)));
            if (NIL != iterative_template_parser.has_substitutable_childrenP(this_result.first())) {
                SubLObject cdolist_list_var = iterative_template_parser.itp_node_children(node);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$104 = iterative_template_parser.tp_do_substitutions_int(this_result, child, todo_list);
                    SubLObject child_result = NIL;
                    child_result = cdolist_list_var_$104.first();
                    while (NIL != cdolist_list_var_$104) {
                        result = cons(child_result, result);
                        cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                        child_result = cdolist_list_var_$104.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            } else {
                result = cons(this_result, result);
                if (NIL == queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    enqueue(node, todo_list);
                }
            }
        } else
            if (NIL != iterative_template_parser.tp_substitutable_formulaP(expression.first())) {
                result = cons(list(iterative_template_parser.itp_node_new_parse(node), list(iterative_template_parser.itp_node_assertion(node))), result);
                if (NIL == queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    enqueue(node, todo_list);
                }
            } else {
                result = list(expression);
                if (NIL == queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    enqueue(node, todo_list);
                }
            }

        return result;
    }/**
     * Given a particular Cycl sentence and a NODE that contains something that can be substituted
     * into the sentence, determine if the semantics of any of the children on of NODE should
     * be substituted into EXPRESSION.  Perform this recursively, since some of the children
     * might themselves need substitution.
     *
     * @param EXPRESSION
     * 		sentence; a two-element list containing a cycl-sentence and an assertion-list
     * @param NODE
    		itp-node
     * 		
     * @param TODO-LIST
    		list
     * 		
     * @return list; a list of cycl sentences/assertion-list pairs
     */


    public static final SubLObject tp_substitutable_formulaP_alt(SubLObject formula) {
        if (NIL == collection_defns.el_expressionP(formula)) {
            return NIL;
        }
        {
            SubLObject v_arity = expression_arity(formula, UNPROVIDED);
            return makeBoolean(((v_arity.isInteger() && v_arity.numE(FOUR_INTEGER)) && (NIL != parsing_utilities.result_of_parsing_formulaP(formula))) && (NIL != member(cycl_utilities.formula_arg3(formula, UNPROVIDED), $list_alt309, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject tp_substitutable_formulaP(final SubLObject formula) {
        if (NIL == el_expressionP(formula)) {
            return NIL;
        }
        final SubLObject v_arity = expression_arity(formula, UNPROVIDED);
        return makeBoolean(((v_arity.isInteger() && v_arity.numE(FOUR_INTEGER)) && (NIL != result_of_parsing_formulaP(formula))) && (NIL != member(formula_arg3(formula, UNPROVIDED), iterative_template_parser.$list316, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject substitutable_child_nodeP_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.rtp.iterative_template_parser.substitutable_child_formulaP(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_component(node));
    }

    public static SubLObject substitutable_child_nodeP(final SubLObject node) {
        return iterative_template_parser.substitutable_child_formulaP(iterative_template_parser.itp_node_component(node));
    }

    public static final SubLObject substitutable_child_formulaP_alt(SubLObject formula) {
        if (formula.isList()) {
            return makeBoolean((NIL != parsing_utilities.result_of_parsing_formulaP(formula)) && (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.verbal_template_categoryP(parsing_utilities.result_of_parsing_category(formula))));
        }
        return NIL;
    }

    public static SubLObject substitutable_child_formulaP(final SubLObject formula) {
        if (formula.isList()) {
            return makeBoolean((NIL != result_of_parsing_formulaP(formula)) && (NIL != iterative_template_parser.verbal_template_categoryP(result_of_parsing_category(formula))));
        }
        return NIL;
    }

    public static final SubLObject enqueue_solution_roots_alt(SubLObject queue, SubLObject answers) {
        {
            SubLObject cdolist_list_var = answers;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_parent(node)) {
                    queues.enqueue(node, queue);
                }
            }
        }
        return queue;
    }

    public static SubLObject enqueue_solution_roots(final SubLObject queue, final SubLObject answers) {
        SubLObject cdolist_list_var = answers;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == iterative_template_parser.itp_node_parent(node)) {
                enqueue(node, queue);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return queue;
    }

    public static final SubLObject join_template_components_p_alt(SubLObject formula) {
        return eql(cycl_utilities.formula_arg0(formula), $$joinTemplateComponents);
    }

    public static SubLObject join_template_components_p(final SubLObject formula) {
        return eql(formula_arg0(formula), iterative_template_parser.$$joinTemplateComponents);
    }

    public static final SubLObject join_template_components_node_p_alt(SubLObject node) {
        if ((NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_p(node)) && (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_p(com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node)))) {
            return com.cyc.cycjava.cycl.rtp.iterative_template_parser.itp_node_new_parse(node);
        }
        return NIL;
    }

    public static SubLObject join_template_components_node_p(final SubLObject node) {
        if ((NIL != iterative_template_parser.itp_node_p(node)) && (NIL != iterative_template_parser.join_template_components_p(iterative_template_parser.itp_node_new_parse(node)))) {
            return iterative_template_parser.itp_node_new_parse(node);
        }
        return NIL;
    }

    public static final SubLObject join_template_components_word_list_alt(SubLObject formula) {
        if (NIL != com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_p(formula)) {
            {
                SubLObject all_words = NIL;
                SubLObject args = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    if (NIL != parsing_utilities.result_of_parsing_formulaP(result)) {
                        {
                            SubLObject cdolist_list_var_108 = rkf_concept_harvester.rkf_ch_string_tokenize(parsing_utilities.result_of_parsing_words(result));
                            SubLObject this_word = NIL;
                            for (this_word = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , this_word = cdolist_list_var_108.first()) {
                                all_words = cons(this_word, all_words);
                            }
                        }
                    }
                }
                return string_utilities.bunge(reverse(all_words), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject join_template_components_word_list(final SubLObject formula) {
        if (NIL != iterative_template_parser.join_template_components_p(formula)) {
            SubLObject all_words = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = formula_args(formula_arg2(formula, UNPROVIDED), $IGNORE);
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != result_of_parsing_formulaP(result)) {
                    SubLObject cdolist_list_var_$105 = rkf_ch_string_tokenize(result_of_parsing_words(result));
                    SubLObject this_word = NIL;
                    this_word = cdolist_list_var_$105.first();
                    while (NIL != cdolist_list_var_$105) {
                        all_words = cons(this_word, all_words);
                        cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                        this_word = cdolist_list_var_$105.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            return bunge(reverse(all_words), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject join_template_components_node_word_list_alt(SubLObject node) {
        {
            SubLObject formula = com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_node_p(node);
            if (NIL != formula) {
                return com.cyc.cycjava.cycl.rtp.iterative_template_parser.join_template_components_word_list(formula);
            }
        }
        return NIL;
    }

    public static SubLObject join_template_components_node_word_list(final SubLObject node) {
        final SubLObject formula = iterative_template_parser.join_template_components_node_p(node);
        if (NIL != formula) {
            return iterative_template_parser.join_template_components_word_list(formula);
        }
        return NIL;
    }

    public static final SubLObject has_join_template_componentsP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != recognition.$perform_template_component_join$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($$joinTemplateComponents, formula, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject has_join_template_componentsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != recognition.$perform_template_component_join$.getDynamicValue(thread)) && (NIL != tree_find(iterative_template_parser.$$joinTemplateComponents, formula, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject has_substitutable_childrenP_alt(SubLObject formula) {
        return list_utilities.tree_find_if($sym312$SUBSTITUTABLE_CHILD_FORMULA_, formula, UNPROVIDED);
    }

    public static SubLObject has_substitutable_childrenP(final SubLObject formula) {
        return tree_find_if(iterative_template_parser.$sym319$SUBSTITUTABLE_CHILD_FORMULA_, formula, UNPROVIDED);
    }

    public static final SubLObject partial_parse_filter_function_alt(SubLObject item) {
        return makeBoolean((item == $$TheSentenceSubject) || item.isKeyword());
    }

    public static SubLObject partial_parse_filter_function(final SubLObject item) {
        return makeBoolean(item.eql(iterative_template_parser.$$TheSentenceSubject) || item.isKeyword());
    }

    public static final SubLObject partial_parsesP_alt(SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(PARTIAL_PARSE_FILTER_FUNCTION), formula, UNPROVIDED);
    }

    public static SubLObject partial_parsesP(final SubLObject formula) {
        return tree_find_if(symbol_function(iterative_template_parser.PARTIAL_PARSE_FILTER_FUNCTION), formula, UNPROVIDED);
    }

    public static SubLObject declare_iterative_template_parser_file() {
        declareFunction("kb_node_analyze_category", "KB-NODE-ANALYZE-CATEGORY", 2, 0, false);
        declareFunction("reset_kb_node_internal_counter", "RESET-KB-NODE-INTERNAL-COUNTER", 0, 0, false);
        declareFunction("next_available_kb_node", "NEXT-AVAILABLE-KB-NODE", 2, 1, false);
        declareFunction("new_syntactic_functional_node", "NEW-SYNTACTIC-FUNCTIONAL-NODE", 1, 2, false);
        declareFunction("new_syntactic_choice_node", "NEW-SYNTACTIC-CHOICE-NODE", 1, 3, false);
        declareFunction("kb_nodes_kill", "KB-NODES-KILL", 1, 0, false);
        declareFunction("kill_syntactic_node_tree", "KILL-SYNTACTIC-NODE-TREE", 1, 0, false);
        declareMacro("with_new_syntactic_kb_node", "WITH-NEW-SYNTACTIC-KB-NODE");
        declareMacro("with_new_syntactic_kb_node_wXgafs", "WITH-NEW-SYNTACTIC-KB-NODE-W/GAFS");
        declareFunction("syntactic_option_node_p", "SYNTACTIC-OPTION-NODE-P", 1, 0, false);
        declareFunction("cb_link_syntactic_node_toolkit", "CB-LINK-SYNTACTIC-NODE-TOOLKIT", 1, 0, false);
        declareFunction("exclude_syntactic_option", "EXCLUDE-SYNTACTIC-OPTION", 1, 0, false);
        declareFunction("restore_syntactic_option", "RESTORE-SYNTACTIC-OPTION", 1, 0, false);
        declareFunction("asserting_treesP", "ASSERTING-TREES?", 0, 0, false);
        declareMacro("while_saving_rtp_parse_into_kb", "WHILE-SAVING-RTP-PARSE-INTO-KB");
        declareFunction("save_rtp_kb_parse_if_desired", "SAVE-RTP-KB-PARSE-IF-DESIRED", 1, 0, false);
        declareFunction("get_rtp_kb_parse_node", "GET-RTP-KB-PARSE-NODE", 0, 0, false);
        declareFunction("get_and_erase_rtp_kb_parse_node", "GET-AND-ERASE-RTP-KB-PARSE-NODE", 0, 0, false);
        declareMacro("with_the_rtp_parse_tokenization", "WITH-THE-RTP-PARSE-TOKENIZATION");
        declareFunction("rtp_component_tokenization", "RTP-COMPONENT-TOKENIZATION", 1, 1, false);
        declareFunction("rtp_parse_exp", "RTP-PARSE-EXP", 1, 3, false);
        declareFunction("rtp_parse_exp_wXvpp", "RTP-PARSE-EXP-W/VPP", 1, 3, false);
        declareFunction("rtp_parse_wXvpp", "RTP-PARSE-W/VPP", 1, 3, false);
        declareFunction("itp_sequel", "ITP-SEQUEL", 1, 3, false);
        declareFunction("categorized_rtp_parse_exp", "CATEGORIZED-RTP-PARSE-EXP", 1, 3, false);
        declareFunction("categorized_itp_sequel", "CATEGORIZED-ITP-SEQUEL", 1, 3, false);
        declareFunction("delete_duplicate_tp_results", "DELETE-DUPLICATE-TP-RESULTS", 1, 0, false);
        declareFunction("itp_rewrite", "ITP-REWRITE", 1, 3, false);
        declareFunction("rewrites_only", "REWRITES-ONLY", 1, 0, false);
        declareFunction("rewrites_helper", "REWRITES-HELPER", 1, 0, false);
        declareFunction("itp_nuke_syntactic_nodes", "ITP-NUKE-SYNTACTIC-NODES", 0, 1, false);
        declareFunction("itp_node_print_function_trampoline", "ITP-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_node_p", "ITP-NODE-P", 1, 0, false);
        new iterative_template_parser.$itp_node_p$UnaryFunction();
        declareFunction("itp_node_id", "ITP-NODE-ID", 1, 0, false);
        declareFunction("itp_node_parent", "ITP-NODE-PARENT", 1, 0, false);
        declareFunction("itp_node_component", "ITP-NODE-COMPONENT", 1, 0, false);
        declareFunction("itp_node_span", "ITP-NODE-SPAN", 1, 0, false);
        declareFunction("itp_node_new_parse", "ITP-NODE-NEW-PARSE", 1, 0, false);
        declareFunction("itp_node_assertion", "ITP-NODE-ASSERTION", 1, 0, false);
        declareFunction("itp_node_children", "ITP-NODE-CHILDREN", 1, 0, false);
        declareFunction("itp_node_permutations", "ITP-NODE-PERMUTATIONS", 1, 0, false);
        declareFunction("itp_node_syntactic_node", "ITP-NODE-SYNTACTIC-NODE", 1, 0, false);
        declareFunction("itp_node_syntactic_choices", "ITP-NODE-SYNTACTIC-CHOICES", 1, 0, false);
        declareFunction("_csetf_itp_node_id", "_CSETF-ITP-NODE-ID", 2, 0, false);
        declareFunction("_csetf_itp_node_parent", "_CSETF-ITP-NODE-PARENT", 2, 0, false);
        declareFunction("_csetf_itp_node_component", "_CSETF-ITP-NODE-COMPONENT", 2, 0, false);
        declareFunction("_csetf_itp_node_span", "_CSETF-ITP-NODE-SPAN", 2, 0, false);
        declareFunction("_csetf_itp_node_new_parse", "_CSETF-ITP-NODE-NEW-PARSE", 2, 0, false);
        declareFunction("_csetf_itp_node_assertion", "_CSETF-ITP-NODE-ASSERTION", 2, 0, false);
        declareFunction("_csetf_itp_node_children", "_CSETF-ITP-NODE-CHILDREN", 2, 0, false);
        declareFunction("_csetf_itp_node_permutations", "_CSETF-ITP-NODE-PERMUTATIONS", 2, 0, false);
        declareFunction("_csetf_itp_node_syntactic_node", "_CSETF-ITP-NODE-SYNTACTIC-NODE", 2, 0, false);
        declareFunction("_csetf_itp_node_syntactic_choices", "_CSETF-ITP-NODE-SYNTACTIC-CHOICES", 2, 0, false);
        declareFunction("make_itp_node", "MAKE-ITP-NODE", 0, 1, false);
        declareFunction("visit_defstruct_itp_node", "VISIT-DEFSTRUCT-ITP-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_node_method", "VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD", 2, 0, false);
        declareFunction("print_itp_node", "PRINT-ITP-NODE", 3, 0, false);
        declareFunction("construct_itp_node", "CONSTRUCT-ITP-NODE", 5, 0, false);
        declareFunction("add_itp_node_child", "ADD-ITP-NODE-CHILD", 2, 1, false);
        declareFunction("itp_node_create_initial_head", "ITP-NODE-CREATE-INITIAL-HEAD", 3, 0, false);
        declareFunction("itp_node_get_legitimate_children", "ITP-NODE-GET-LEGITIMATE-CHILDREN", 1, 0, false);
        declareFunction("itp_node_get_dominance_gafs", "ITP-NODE-GET-DOMINANCE-GAFS", 1, 0, false);
        declareFunction("itp_node_clear_syntactic_choices", "ITP-NODE-CLEAR-SYNTACTIC-CHOICES", 1, 1, false);
        declareFunction("itp_node_initialize_syntactic_choices", "ITP-NODE-INITIALIZE-SYNTACTIC-CHOICES", 1, 1, false);
        declareFunction("itp_choice_node_for_component", "ITP-CHOICE-NODE-FOR-COMPONENT", 2, 0, false);
        declareFunction("itp_node_find_or_initialize_syntactic_choices", "ITP-NODE-FIND-OR-INITIALIZE-SYNTACTIC-CHOICES", 2, 0, false);
        declareFunction("itp_node_tokenization", "ITP-NODE-TOKENIZATION", 1, 0, false);
        declareFunction("itp_node_equalP", "ITP-NODE-EQUAL?", 2, 0, false);
        declareFunction("find_or_create_itp_node_syntactic_node", "FIND-OR-CREATE-ITP-NODE-SYNTACTIC-NODE", 2, 2, false);
        declareFunction("itp_state_print_function_trampoline", "ITP-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_state_p", "ITP-STATE-P", 1, 0, false);
        new iterative_template_parser.$itp_state_p$UnaryFunction();
        declareFunction("itp_state_sequence", "ITP-STATE-SEQUENCE", 1, 0, false);
        declareFunction("itp_state_complete_parses_only", "ITP-STATE-COMPLETE-PARSES-ONLY", 1, 0, false);
        declareFunction("itp_state_work_set", "ITP-STATE-WORK-SET", 1, 0, false);
        declareFunction("itp_state_solution_set", "ITP-STATE-SOLUTION-SET", 1, 0, false);
        declareFunction("itp_state_sentence", "ITP-STATE-SENTENCE", 1, 0, false);
        declareFunction("itp_state_category", "ITP-STATE-CATEGORY", 1, 0, false);
        declareFunction("itp_state_cache", "ITP-STATE-CACHE", 1, 0, false);
        declareFunction("itp_state_psp_charts", "ITP-STATE-PSP-CHARTS", 1, 0, false);
        declareFunction("itp_state_working_mt", "ITP-STATE-WORKING-MT", 1, 0, false);
        declareFunction("_csetf_itp_state_sequence", "_CSETF-ITP-STATE-SEQUENCE", 2, 0, false);
        declareFunction("_csetf_itp_state_complete_parses_only", "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY", 2, 0, false);
        declareFunction("_csetf_itp_state_work_set", "_CSETF-ITP-STATE-WORK-SET", 2, 0, false);
        declareFunction("_csetf_itp_state_solution_set", "_CSETF-ITP-STATE-SOLUTION-SET", 2, 0, false);
        declareFunction("_csetf_itp_state_sentence", "_CSETF-ITP-STATE-SENTENCE", 2, 0, false);
        declareFunction("_csetf_itp_state_category", "_CSETF-ITP-STATE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_itp_state_cache", "_CSETF-ITP-STATE-CACHE", 2, 0, false);
        declareFunction("_csetf_itp_state_psp_charts", "_CSETF-ITP-STATE-PSP-CHARTS", 2, 0, false);
        declareFunction("_csetf_itp_state_working_mt", "_CSETF-ITP-STATE-WORKING-MT", 2, 0, false);
        declareFunction("make_itp_state", "MAKE-ITP-STATE", 0, 1, false);
        declareFunction("visit_defstruct_itp_state", "VISIT-DEFSTRUCT-ITP-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_state_method", "VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD", 2, 0, false);
        declareFunction("print_itp_state", "PRINT-ITP-STATE", 3, 0, false);
        declareFunction("new_itp_state", "NEW-ITP-STATE", 1, 2, false);
        declareFunction("destroy_itp_state", "DESTROY-ITP-STATE", 1, 0, false);
        declareFunction("new_itp_state_psp_chart_dictionary_internal", "NEW-ITP-STATE-PSP-CHART-DICTIONARY-INTERNAL", 0, 0, false);
        declareFunction("new_itp_state_psp_chart_dictionary", "NEW-ITP-STATE-PSP-CHART-DICTIONARY", 0, 0, false);
        declareFunction("add_to_itp_solution", "ADD-TO-ITP-SOLUTION", 2, 0, false);
        declareFunction("memoize_itp_attempt", "MEMOIZE-ITP-ATTEMPT", 2, 0, false);
        declareFunction("is_a_known_itp_attemptP", "IS-A-KNOWN-ITP-ATTEMPT?", 2, 0, false);
        declareFunction("prime_itp_pump", "PRIME-ITP-PUMP", 2, 0, false);
        declareFunction("extend_itp_state", "EXTEND-ITP-STATE", 5, 3, false);
        declareFunction("extend_itp_state_multiple", "EXTEND-ITP-STATE-MULTIPLE", 5, 0, false);
        declareFunction("extend_itp_state_by_ps_parse", "EXTEND-ITP-STATE-BY-PS-PARSE", 6, 0, false);
        declareFunction("expand_itp_state", "EXPAND-ITP-STATE", 2, 0, false);
        declareFunction("appropriate_span_for_np_parsingP", "APPROPRIATE-SPAN-FOR-NP-PARSING?", 2, 0, false);
        declareFunction("appropriate_span_for_vbar_parsingP", "APPROPRIATE-SPAN-FOR-VBAR-PARSING?", 2, 0, false);
        declareFunction("appropriate_span_for_nbar_parsingP", "APPROPRIATE-SPAN-FOR-NBAR-PARSING?", 2, 0, false);
        declareFunction("itp_ps_get_cycls_for_phrase_internal", "ITP-PS-GET-CYCLS-FOR-PHRASE-INTERNAL", 6, 0, false);
        declareFunction("itp_ps_get_cycls_for_phrase", "ITP-PS-GET-CYCLS-FOR-PHRASE", 6, 0, false);
        declareFunction("itp_ps_parse_vbar_internal", "ITP-PS-PARSE-VBAR-INTERNAL", 2, 2, false);
        declareFunction("itp_ps_parse_vbar", "ITP-PS-PARSE-VBAR", 2, 2, false);
        declareFunction("itp_find_or_create_appropriate_chart", "ITP-FIND-OR-CREATE-APPROPRIATE-CHART", 4, 0, false);
        declareFunction("get_chart_from_extra_psp_charts", "GET-CHART-FROM-EXTRA-PSP-CHARTS", 1, 0, false);
        declareFunction("itp_subspanP", "ITP-SUBSPAN?", 2, 0, false);
        declareFunction("gap_type_for_category", "GAP-TYPE-FOR-CATEGORY", 1, 0, false);
        declareFunction("pred_for_category", "PRED-FOR-CATEGORY", 1, 0, false);
        declareFunction("rtp_cat_for_pred", "RTP-CAT-FOR-PRED", 1, 0, false);
        declareFunction("rtp_cat_for_pos", "RTP-CAT-FOR-POS", 1, 0, false);
        declareFunction("pos_for_rtp_cat", "POS-FOR-RTP-CAT", 1, 0, false);
        declareFunction("best_rtp_cat_for_preds", "BEST-RTP-CAT-FOR-PREDS", 1, 0, false);
        declareFunction("clear_verb_phrasal_template_categoryP", "CLEAR-VERB-PHRASAL-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction("remove_verb_phrasal_template_categoryP", "REMOVE-VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("verb_phrasal_template_categoryP_internal", "VERB-PHRASAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("verb_phrasal_template_categoryP", "VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("clear_verbal_template_categoryP", "CLEAR-VERBAL-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction("remove_verbal_template_categoryP", "REMOVE-VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("verbal_template_categoryP_internal", "VERBAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("verbal_template_categoryP", "VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("clear_vbar_template_categoryP", "CLEAR-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction("remove_vbar_template_categoryP", "REMOVE-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("vbar_template_categoryP_internal", "VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("vbar_template_categoryP", "VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("clear_rtp_vbar_template_categoryP", "CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction("remove_rtp_vbar_template_categoryP", "REMOVE-RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("rtp_vbar_template_categoryP_internal", "RTP-VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("rtp_vbar_template_categoryP", "RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("extended_vbar_template_categoryP", "EXTENDED-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("clear_predicative_adjp_template_categoryP", "CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction("remove_predicative_adjp_template_categoryP", "REMOVE-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("predicative_adjp_template_categoryP_internal", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("predicative_adjp_template_categoryP", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("clear_nominal_categoryP", "CLEAR-NOMINAL-CATEGORY?", 0, 0, false);
        declareFunction("remove_nominal_categoryP", "REMOVE-NOMINAL-CATEGORY?", 1, 0, false);
        declareFunction("nominal_categoryP_internal", "NOMINAL-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("nominal_categoryP", "NOMINAL-CATEGORY?", 1, 0, false);
        declareFunction("clear_adjectival_categoryP", "CLEAR-ADJECTIVAL-CATEGORY?", 0, 0, false);
        declareFunction("remove_adjectival_categoryP", "REMOVE-ADJECTIVAL-CATEGORY?", 1, 0, false);
        declareFunction("adjectival_categoryP_internal", "ADJECTIVAL-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction("adjectival_categoryP", "ADJECTIVAL-CATEGORY?", 1, 0, false);
        declareFunction("number_template_categoryP", "NUMBER-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction("verbal_categoryP", "VERBAL-CATEGORY?", 1, 0, false);
        declareFunction("expand_itp_state_completely", "EXPAND-ITP-STATE-COMPLETELY", 2, 0, false);
        declareFunction("itp_node_max_child_span_length", "ITP-NODE-MAX-CHILD-SPAN-LENGTH", 1, 0, false);
        declareFunction("itp_output_sorting_function", "ITP-OUTPUT-SORTING-FUNCTION", 1, 0, false);
        declareFunction("compute_correct_span", "COMPUTE-CORRECT-SPAN", 2, 0, false);
        declareFunction("adjust_the_spans", "ADJUST-THE-SPANS", 2, 1, false);
        declareFunction("is_this_a_thelist_spanP", "IS-THIS-A-THELIST-SPAN?", 1, 0, false);
        declareFunction("is_this_a_numeric_spanP", "IS-THIS-A-NUMERIC-SPAN?", 1, 0, false);
        declareFunction("dependent_span_coverage", "DEPENDENT-SPAN-COVERAGE", 1, 0, false);
        declareFunction("initial_span_gap", "INITIAL-SPAN-GAP", 2, 0, false);
        declareFunction("full_span_coverageP", "FULL-SPAN-COVERAGE?", 2, 0, false);
        declareFunction("get_ternary_quant_fns", "GET-TERNARY-QUANT-FNS", 0, 0, false);
        declareFunction("is_this_a_quant_fnP", "IS-THIS-A-QUANT-FN?", 1, 0, false);
        declareFunction("surrogate_multi_word_componentP", "SURROGATE-MULTI-WORD-COMPONENT?", 1, 0, false);
        declareFunction("reify_itp", "REIFY-ITP", 0, 1, false);
        declareFunction("reify_itp_int", "REIFY-ITP-INT", 1, 0, false);
        declareFunction("cat_itp", "CAT-ITP", 0, 1, false);
        declareFunction("transform_nl_quant_forms", "TRANSFORM-NL-QUANT-FORMS", 2, 0, false);
        declareFunction("nl_attr_w_locationP", "NL-ATTR-W-LOCATION?", 1, 0, false);
        declareFunction("sort_itp_results", "SORT-ITP-RESULTS", 1, 0, false);
        declareFunction("rtp_contains_invalid_surrogateP", "RTP-CONTAINS-INVALID-SURROGATE?", 2, 0, false);
        declareFunction("unassembled_phraseP", "UNASSEMBLED-PHRASE?", 1, 0, false);
        declareFunction("transform_assemble_phrases", "TRANSFORM-ASSEMBLE-PHRASES", 1, 0, false);
        declareFunction("perform_solution_node_analysis", "PERFORM-SOLUTION-NODE-ANALYSIS", 4, 0, false);
        declareFunction("rtp_sort_constit_parses", "RTP-SORT-CONSTIT-PARSES", 1, 0, false);
        declareFunction("merge_parse_results", "MERGE-PARSE-RESULTS", 2, 0, false);
        declareFunction("find_differences", "FIND-DIFFERENCES", 2, 1, false);
        declareFunction("build_return_format", "BUILD-RETURN-FORMAT", 3, 0, false);
        declareFunction("cat_for_result", "CAT-FOR-RESULT", 1, 0, false);
        declareFunction("force_for_result", "FORCE-FOR-RESULT", 1, 0, false);
        declareFunction("tp_do_substitutions", "TP-DO-SUBSTITUTIONS", 3, 0, false);
        declareFunction("tp_do_substitutions_int", "TP-DO-SUBSTITUTIONS-INT", 3, 0, false);
        declareFunction("tp_substitutable_formulaP", "TP-SUBSTITUTABLE-FORMULA?", 1, 0, false);
        declareFunction("substitutable_child_nodeP", "SUBSTITUTABLE-CHILD-NODE?", 1, 0, false);
        declareFunction("substitutable_child_formulaP", "SUBSTITUTABLE-CHILD-FORMULA?", 1, 0, false);
        declareFunction("enqueue_solution_roots", "ENQUEUE-SOLUTION-ROOTS", 2, 0, false);
        declareFunction("join_template_components_p", "JOIN-TEMPLATE-COMPONENTS-P", 1, 0, false);
        declareFunction("join_template_components_node_p", "JOIN-TEMPLATE-COMPONENTS-NODE-P", 1, 0, false);
        declareFunction("join_template_components_word_list", "JOIN-TEMPLATE-COMPONENTS-WORD-LIST", 1, 0, false);
        declareFunction("join_template_components_node_word_list", "JOIN-TEMPLATE-COMPONENTS-NODE-WORD-LIST", 1, 0, false);
        declareFunction("has_join_template_componentsP", "HAS-JOIN-TEMPLATE-COMPONENTS?", 1, 0, false);
        declareFunction("has_substitutable_childrenP", "HAS-SUBSTITUTABLE-CHILDREN?", 1, 0, false);
        declareFunction("partial_parse_filter_function", "PARTIAL-PARSE-FILTER-FUNCTION", 1, 0, false);
        declareFunction("partial_parsesP", "PARTIAL-PARSES?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_iterative_template_parser_file_alt() {
        defparameter("*KB-NODE-GATHERING-MODE?*", NIL);
        defparameter("*KB-NODE-REIFY-AS-FUNCTIONS?*", NIL);
        defparameter("*KB-NODE-INTERNAL-COUNTER*", ZERO_INTEGER);
        defparameter("*LAST-ITP-STATE-CREATED*", NIL);
        defparameter("*RTP-GRAPHING-FILTER*", $RTP);
        defparameter("*RTP-TRACE-AGGRESSIVELY?*", NIL);
        defparameter("*RTP-KB-PARSE-MT*", NIL);
        defparameter("*RTP-EXHAUSTIVE-KB-PARSE?*", NIL);
        defparameter("*RTP-REIFY-DOOMED-PARSES?*", NIL);
        defparameter("*RTP-LATEST-KB-PARSE-TREE*", NIL);
        deflexical("*RTP-COMPONENT-TOKENIZATIONS*", NIL != boundp($rtp_component_tokenizations$) ? ((SubLObject) ($rtp_component_tokenizations$.getGlobalValue())) : dictionary.new_dictionary(EQUAL, UNPROVIDED));
        defparameter("*RTP-RELEVANT-TOKENIZATION*", NIL);
        defconstant("*DTP-ITP-NODE*", ITP_NODE);
        defconstant("*DTP-ITP-STATE*", ITP_STATE);
        defparameter("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", NIL);
        defparameter("*NPPARSE-GRAPH-TYPE*", $$$R);
        defparameter("*TRACE-ITP-STATE-EXPANSION*", NIL);
        defparameter("*POSSIBLE-NPS*", NIL);
        deflexical("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*NOMINAL-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*ADJECTIVAL-CATEGORY?-CACHING-STATE*", NIL);
        defparameter("*COMPUTE-TOP-LEVEL-FORM-ONLY*", NIL);
        defparameter("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", NIL);
        deflexical("*INFORM-ABOUT-PRUNED-TEMPLATES*", NIL);
        defparameter("*SET-OF-ATTEMPTED-SUBPARSES*", NIL);
        deflexical("*TERNARY-QUANT-FNS*", NIL);
        return NIL;
    }

    public static SubLObject init_iterative_template_parser_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*KB-NODE-GATHERING-MODE?*", NIL);
            defparameter("*KB-NODE-REIFY-AS-FUNCTIONS?*", NIL);
            defparameter("*KB-NODE-INTERNAL-COUNTER*", ZERO_INTEGER);
            defparameter("*LAST-ITP-STATE-CREATED*", NIL);
            defparameter("*RTP-GRAPHING-FILTER*", $RTP);
            defparameter("*RTP-TRACE-AGGRESSIVELY?*", NIL);
            defparameter("*RTP-KB-PARSE-MT*", NIL);
            defparameter("*RTP-EXHAUSTIVE-KB-PARSE?*", NIL);
            defparameter("*RTP-REIFY-DOOMED-PARSES?*", NIL);
            defparameter("*RTP-LATEST-KB-PARSE-TREE*", NIL);
            deflexical("*RTP-COMPONENT-TOKENIZATIONS*", SubLTrampolineFile.maybeDefault(iterative_template_parser.$rtp_component_tokenizations$, iterative_template_parser.$rtp_component_tokenizations$, () -> new_dictionary(EQUAL, UNPROVIDED)));
            defparameter("*RTP-RELEVANT-TOKENIZATION*", NIL);
            defconstant("*DTP-ITP-NODE*", iterative_template_parser.ITP_NODE);
            defconstant("*DTP-ITP-STATE*", iterative_template_parser.ITP_STATE);
            defparameter("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", NIL);
            defparameter("*NPPARSE-GRAPH-TYPE*", iterative_template_parser.$$$R);
            defparameter("*TRACE-ITP-STATE-EXPANSION*", NIL);
            defparameter("*POSSIBLE-NPS*", NIL);
            deflexical("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*NOMINAL-CATEGORY?-CACHING-STATE*", NIL);
            deflexical("*ADJECTIVAL-CATEGORY?-CACHING-STATE*", NIL);
            defparameter("*COMPUTE-TOP-LEVEL-FORM-ONLY*", NIL);
            defparameter("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", NIL);
            deflexical("*INFORM-ABOUT-PRUNED-TEMPLATES*", NIL);
            defparameter("*SET-OF-ATTEMPTED-SUBPARSES*", NIL);
            deflexical("*TERNARY-QUANT-FNS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RTP-COMPONENT-TOKENIZATIONS*", NIL != boundp($rtp_component_tokenizations$) ? ((SubLObject) ($rtp_component_tokenizations$.getGlobalValue())) : dictionary.new_dictionary(EQUAL, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_iterative_template_parser_file_Previous() {
        defparameter("*KB-NODE-GATHERING-MODE?*", NIL);
        defparameter("*KB-NODE-REIFY-AS-FUNCTIONS?*", NIL);
        defparameter("*KB-NODE-INTERNAL-COUNTER*", ZERO_INTEGER);
        defparameter("*LAST-ITP-STATE-CREATED*", NIL);
        defparameter("*RTP-GRAPHING-FILTER*", $RTP);
        defparameter("*RTP-TRACE-AGGRESSIVELY?*", NIL);
        defparameter("*RTP-KB-PARSE-MT*", NIL);
        defparameter("*RTP-EXHAUSTIVE-KB-PARSE?*", NIL);
        defparameter("*RTP-REIFY-DOOMED-PARSES?*", NIL);
        defparameter("*RTP-LATEST-KB-PARSE-TREE*", NIL);
        deflexical("*RTP-COMPONENT-TOKENIZATIONS*", SubLTrampolineFile.maybeDefault(iterative_template_parser.$rtp_component_tokenizations$, iterative_template_parser.$rtp_component_tokenizations$, () -> new_dictionary(EQUAL, UNPROVIDED)));
        defparameter("*RTP-RELEVANT-TOKENIZATION*", NIL);
        defconstant("*DTP-ITP-NODE*", iterative_template_parser.ITP_NODE);
        defconstant("*DTP-ITP-STATE*", iterative_template_parser.ITP_STATE);
        defparameter("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", NIL);
        defparameter("*NPPARSE-GRAPH-TYPE*", iterative_template_parser.$$$R);
        defparameter("*TRACE-ITP-STATE-EXPANSION*", NIL);
        defparameter("*POSSIBLE-NPS*", NIL);
        deflexical("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*NOMINAL-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*ADJECTIVAL-CATEGORY?-CACHING-STATE*", NIL);
        defparameter("*COMPUTE-TOP-LEVEL-FORM-ONLY*", NIL);
        defparameter("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", NIL);
        deflexical("*INFORM-ABOUT-PRUNED-TEMPLATES*", NIL);
        defparameter("*SET-OF-ATTEMPTED-SUBPARSES*", NIL);
        deflexical("*TERNARY-QUANT-FNS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_iterative_template_parser_file_alt() {
        setup_cb_link_method($SYNTACTIC_NODE_TOOLKIT, CB_LINK_SYNTACTIC_NODE_TOOLKIT, ONE_INTEGER);
        html_macros.note_html_handler_function(EXCLUDE_SYNTACTIC_OPTION);
        html_macros.note_html_handler_function(RESTORE_SYNTACTIC_OPTION);
        declare_defglobal($rtp_component_tokenizations$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_node$.getGlobalValue(), symbol_function(ITP_NODE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITP_NODE_ID, _CSETF_ITP_NODE_ID);
        def_csetf(ITP_NODE_PARENT, _CSETF_ITP_NODE_PARENT);
        def_csetf(ITP_NODE_COMPONENT, _CSETF_ITP_NODE_COMPONENT);
        def_csetf(ITP_NODE_SPAN, _CSETF_ITP_NODE_SPAN);
        def_csetf(ITP_NODE_NEW_PARSE, _CSETF_ITP_NODE_NEW_PARSE);
        def_csetf(ITP_NODE_ASSERTION, _CSETF_ITP_NODE_ASSERTION);
        def_csetf(ITP_NODE_CHILDREN, _CSETF_ITP_NODE_CHILDREN);
        def_csetf(ITP_NODE_PERMUTATIONS, _CSETF_ITP_NODE_PERMUTATIONS);
        def_csetf(ITP_NODE_SYNTACTIC_NODE, _CSETF_ITP_NODE_SYNTACTIC_NODE);
        def_csetf(ITP_NODE_SYNTACTIC_CHOICES, _CSETF_ITP_NODE_SYNTACTIC_CHOICES);
        identity(ITP_NODE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_state$.getGlobalValue(), symbol_function(ITP_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITP_STATE_SEQUENCE, _CSETF_ITP_STATE_SEQUENCE);
        def_csetf(ITP_STATE_COMPLETE_PARSES_ONLY, _CSETF_ITP_STATE_COMPLETE_PARSES_ONLY);
        def_csetf(ITP_STATE_WORK_SET, _CSETF_ITP_STATE_WORK_SET);
        def_csetf(ITP_STATE_SOLUTION_SET, _CSETF_ITP_STATE_SOLUTION_SET);
        def_csetf(ITP_STATE_SENTENCE, _CSETF_ITP_STATE_SENTENCE);
        def_csetf(ITP_STATE_CATEGORY, _CSETF_ITP_STATE_CATEGORY);
        def_csetf(ITP_STATE_CACHE, _CSETF_ITP_STATE_CACHE);
        def_csetf(ITP_STATE_PSP_CHARTS, _CSETF_ITP_STATE_PSP_CHARTS);
        def_csetf(ITP_STATE_WORKING_MT, _CSETF_ITP_STATE_WORKING_MT);
        identity(ITP_STATE);
        memoization_state.note_memoized_function(NEW_ITP_STATE_PSP_CHART_DICTIONARY);
        memoization_state.note_memoized_function(ITP_PS_GET_CYCLS_FOR_PHRASE);
        memoization_state.note_memoized_function(ITP_PS_PARSE_VBAR);
        memoization_state.note_globally_cached_function($sym247$VERB_PHRASAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym249$VERBAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym251$VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym254$RTP_VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym259$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym262$NOMINAL_CATEGORY_);
        memoization_state.note_globally_cached_function($sym264$ADJECTIVAL_CATEGORY_);
        return NIL;
    }

    public static SubLObject setup_iterative_template_parser_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method(iterative_template_parser.$SYNTACTIC_NODE_TOOLKIT, iterative_template_parser.CB_LINK_SYNTACTIC_NODE_TOOLKIT, ONE_INTEGER);
            note_cgi_handler_function(iterative_template_parser.EXCLUDE_SYNTACTIC_OPTION, $HTML_HANDLER);
            note_cgi_handler_function(iterative_template_parser.RESTORE_SYNTACTIC_OPTION, $HTML_HANDLER);
            declare_defglobal(iterative_template_parser.$rtp_component_tokenizations$);
            register_method($print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), symbol_function(iterative_template_parser.ITP_NODE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(iterative_template_parser.$list131);
            def_csetf(iterative_template_parser.ITP_NODE_ID, iterative_template_parser._CSETF_ITP_NODE_ID);
            def_csetf(iterative_template_parser.ITP_NODE_PARENT, iterative_template_parser._CSETF_ITP_NODE_PARENT);
            def_csetf(iterative_template_parser.ITP_NODE_COMPONENT, iterative_template_parser._CSETF_ITP_NODE_COMPONENT);
            def_csetf(iterative_template_parser.ITP_NODE_SPAN, iterative_template_parser._CSETF_ITP_NODE_SPAN);
            def_csetf(iterative_template_parser.ITP_NODE_NEW_PARSE, iterative_template_parser._CSETF_ITP_NODE_NEW_PARSE);
            def_csetf(iterative_template_parser.ITP_NODE_ASSERTION, iterative_template_parser._CSETF_ITP_NODE_ASSERTION);
            def_csetf(iterative_template_parser.ITP_NODE_CHILDREN, iterative_template_parser._CSETF_ITP_NODE_CHILDREN);
            def_csetf(iterative_template_parser.ITP_NODE_PERMUTATIONS, iterative_template_parser._CSETF_ITP_NODE_PERMUTATIONS);
            def_csetf(iterative_template_parser.ITP_NODE_SYNTACTIC_NODE, iterative_template_parser._CSETF_ITP_NODE_SYNTACTIC_NODE);
            def_csetf(iterative_template_parser.ITP_NODE_SYNTACTIC_CHOICES, iterative_template_parser._CSETF_ITP_NODE_SYNTACTIC_CHOICES);
            identity(iterative_template_parser.ITP_NODE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), symbol_function(iterative_template_parser.VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), symbol_function(iterative_template_parser.ITP_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(iterative_template_parser.$list198);
            def_csetf(iterative_template_parser.ITP_STATE_SEQUENCE, iterative_template_parser._CSETF_ITP_STATE_SEQUENCE);
            def_csetf(iterative_template_parser.ITP_STATE_COMPLETE_PARSES_ONLY, iterative_template_parser._CSETF_ITP_STATE_COMPLETE_PARSES_ONLY);
            def_csetf(iterative_template_parser.ITP_STATE_WORK_SET, iterative_template_parser._CSETF_ITP_STATE_WORK_SET);
            def_csetf(iterative_template_parser.ITP_STATE_SOLUTION_SET, iterative_template_parser._CSETF_ITP_STATE_SOLUTION_SET);
            def_csetf(iterative_template_parser.ITP_STATE_SENTENCE, iterative_template_parser._CSETF_ITP_STATE_SENTENCE);
            def_csetf(iterative_template_parser.ITP_STATE_CATEGORY, iterative_template_parser._CSETF_ITP_STATE_CATEGORY);
            def_csetf(iterative_template_parser.ITP_STATE_CACHE, iterative_template_parser._CSETF_ITP_STATE_CACHE);
            def_csetf(iterative_template_parser.ITP_STATE_PSP_CHARTS, iterative_template_parser._CSETF_ITP_STATE_PSP_CHARTS);
            def_csetf(iterative_template_parser.ITP_STATE_WORKING_MT, iterative_template_parser._CSETF_ITP_STATE_WORKING_MT);
            identity(iterative_template_parser.ITP_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), symbol_function(iterative_template_parser.VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD));
            note_memoized_function(iterative_template_parser.NEW_ITP_STATE_PSP_CHART_DICTIONARY);
            note_memoized_function(iterative_template_parser.ITP_PS_GET_CYCLS_FOR_PHRASE);
            note_memoized_function(iterative_template_parser.ITP_PS_PARSE_VBAR);
            note_globally_cached_function(iterative_template_parser.$sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym257$VERBAL_TEMPLATE_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym259$VBAR_TEMPLATE_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym262$RTP_VBAR_TEMPLATE_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym269$NOMINAL_CATEGORY_);
            note_globally_cached_function(iterative_template_parser.$sym271$ADJECTIVAL_CATEGORY_);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(EXCLUDE_SYNTACTIC_OPTION);
            html_macros.note_html_handler_function(RESTORE_SYNTACTIC_OPTION);
            memoization_state.note_globally_cached_function($sym247$VERB_PHRASAL_TEMPLATE_CATEGORY_);
            memoization_state.note_globally_cached_function($sym249$VERBAL_TEMPLATE_CATEGORY_);
            memoization_state.note_globally_cached_function($sym251$VBAR_TEMPLATE_CATEGORY_);
            memoization_state.note_globally_cached_function($sym254$RTP_VBAR_TEMPLATE_CATEGORY_);
            memoization_state.note_globally_cached_function($sym259$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
            memoization_state.note_globally_cached_function($sym262$NOMINAL_CATEGORY_);
            memoization_state.note_globally_cached_function($sym264$ADJECTIVAL_CATEGORY_);
        }
        return NIL;
    }

    public static SubLObject setup_iterative_template_parser_file_Previous() {
        setup_cb_link_method(iterative_template_parser.$SYNTACTIC_NODE_TOOLKIT, iterative_template_parser.CB_LINK_SYNTACTIC_NODE_TOOLKIT, ONE_INTEGER);
        note_cgi_handler_function(iterative_template_parser.EXCLUDE_SYNTACTIC_OPTION, $HTML_HANDLER);
        note_cgi_handler_function(iterative_template_parser.RESTORE_SYNTACTIC_OPTION, $HTML_HANDLER);
        declare_defglobal(iterative_template_parser.$rtp_component_tokenizations$);
        register_method($print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), symbol_function(iterative_template_parser.ITP_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(iterative_template_parser.$list131);
        def_csetf(iterative_template_parser.ITP_NODE_ID, iterative_template_parser._CSETF_ITP_NODE_ID);
        def_csetf(iterative_template_parser.ITP_NODE_PARENT, iterative_template_parser._CSETF_ITP_NODE_PARENT);
        def_csetf(iterative_template_parser.ITP_NODE_COMPONENT, iterative_template_parser._CSETF_ITP_NODE_COMPONENT);
        def_csetf(iterative_template_parser.ITP_NODE_SPAN, iterative_template_parser._CSETF_ITP_NODE_SPAN);
        def_csetf(iterative_template_parser.ITP_NODE_NEW_PARSE, iterative_template_parser._CSETF_ITP_NODE_NEW_PARSE);
        def_csetf(iterative_template_parser.ITP_NODE_ASSERTION, iterative_template_parser._CSETF_ITP_NODE_ASSERTION);
        def_csetf(iterative_template_parser.ITP_NODE_CHILDREN, iterative_template_parser._CSETF_ITP_NODE_CHILDREN);
        def_csetf(iterative_template_parser.ITP_NODE_PERMUTATIONS, iterative_template_parser._CSETF_ITP_NODE_PERMUTATIONS);
        def_csetf(iterative_template_parser.ITP_NODE_SYNTACTIC_NODE, iterative_template_parser._CSETF_ITP_NODE_SYNTACTIC_NODE);
        def_csetf(iterative_template_parser.ITP_NODE_SYNTACTIC_CHOICES, iterative_template_parser._CSETF_ITP_NODE_SYNTACTIC_CHOICES);
        identity(iterative_template_parser.ITP_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), symbol_function(iterative_template_parser.VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), symbol_function(iterative_template_parser.ITP_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(iterative_template_parser.$list198);
        def_csetf(iterative_template_parser.ITP_STATE_SEQUENCE, iterative_template_parser._CSETF_ITP_STATE_SEQUENCE);
        def_csetf(iterative_template_parser.ITP_STATE_COMPLETE_PARSES_ONLY, iterative_template_parser._CSETF_ITP_STATE_COMPLETE_PARSES_ONLY);
        def_csetf(iterative_template_parser.ITP_STATE_WORK_SET, iterative_template_parser._CSETF_ITP_STATE_WORK_SET);
        def_csetf(iterative_template_parser.ITP_STATE_SOLUTION_SET, iterative_template_parser._CSETF_ITP_STATE_SOLUTION_SET);
        def_csetf(iterative_template_parser.ITP_STATE_SENTENCE, iterative_template_parser._CSETF_ITP_STATE_SENTENCE);
        def_csetf(iterative_template_parser.ITP_STATE_CATEGORY, iterative_template_parser._CSETF_ITP_STATE_CATEGORY);
        def_csetf(iterative_template_parser.ITP_STATE_CACHE, iterative_template_parser._CSETF_ITP_STATE_CACHE);
        def_csetf(iterative_template_parser.ITP_STATE_PSP_CHARTS, iterative_template_parser._CSETF_ITP_STATE_PSP_CHARTS);
        def_csetf(iterative_template_parser.ITP_STATE_WORKING_MT, iterative_template_parser._CSETF_ITP_STATE_WORKING_MT);
        identity(iterative_template_parser.ITP_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), symbol_function(iterative_template_parser.VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD));
        note_memoized_function(iterative_template_parser.NEW_ITP_STATE_PSP_CHART_DICTIONARY);
        note_memoized_function(iterative_template_parser.ITP_PS_GET_CYCLS_FOR_PHRASE);
        note_memoized_function(iterative_template_parser.ITP_PS_PARSE_VBAR);
        note_globally_cached_function(iterative_template_parser.$sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym257$VERBAL_TEMPLATE_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym259$VBAR_TEMPLATE_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym262$RTP_VBAR_TEMPLATE_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym269$NOMINAL_CATEGORY_);
        note_globally_cached_function(iterative_template_parser.$sym271$ADJECTIVAL_CATEGORY_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        iterative_template_parser.declare_iterative_template_parser_file();
    }

    @Override
    public void initializeVariables() {
        iterative_template_parser.init_iterative_template_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        iterative_template_parser.setup_iterative_template_parser_file();
    }

    static {
    }

    public static final class $itp_node_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $parent;

        public SubLObject $component;

        public SubLObject $span;

        public SubLObject $new_parse;

        public SubLObject $assertion;

        public SubLObject $children;

        public SubLObject $permutations;

        public SubLObject $syntactic_node;

        public SubLObject $syntactic_choices;

        private static final SubLStructDeclNative structDecl;

        public $itp_node_native() {
            iterative_template_parser.$itp_node_native.this.$id = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$parent = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$component = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$span = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$new_parse = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$assertion = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$children = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$permutations = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$syntactic_node = Lisp.NIL;
            iterative_template_parser.$itp_node_native.this.$syntactic_choices = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return iterative_template_parser.$itp_node_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return iterative_template_parser.$itp_node_native.this.$parent;
        }

        @Override
        public SubLObject getField4() {
            return iterative_template_parser.$itp_node_native.this.$component;
        }

        @Override
        public SubLObject getField5() {
            return iterative_template_parser.$itp_node_native.this.$span;
        }

        @Override
        public SubLObject getField6() {
            return iterative_template_parser.$itp_node_native.this.$new_parse;
        }

        @Override
        public SubLObject getField7() {
            return iterative_template_parser.$itp_node_native.this.$assertion;
        }

        @Override
        public SubLObject getField8() {
            return iterative_template_parser.$itp_node_native.this.$children;
        }

        @Override
        public SubLObject getField9() {
            return iterative_template_parser.$itp_node_native.this.$permutations;
        }

        @Override
        public SubLObject getField10() {
            return iterative_template_parser.$itp_node_native.this.$syntactic_node;
        }

        @Override
        public SubLObject getField11() {
            return iterative_template_parser.$itp_node_native.this.$syntactic_choices;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$parent = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$component = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$span = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$new_parse = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$assertion = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$children = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$permutations = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$syntactic_node = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return iterative_template_parser.$itp_node_native.this.$syntactic_choices = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native.class, iterative_template_parser.ITP_NODE, iterative_template_parser.ITP_NODE_P, iterative_template_parser.$list125, iterative_template_parser.$list126, new String[]{ "$id", "$parent", "$component", "$span", "$new_parse", "$assertion", "$children", "$permutations", "$syntactic_node", "$syntactic_choices" }, iterative_template_parser.$list127, iterative_template_parser.$list128, iterative_template_parser.PRINT_ITP_NODE);
        }
    }

    public static final class $itp_node_p$UnaryFunction extends UnaryFunction {
        public $itp_node_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterative_template_parser.itp_node_p(arg1);
        }
    }

    public static final class $itp_state_p$UnaryFunction extends UnaryFunction {
        public $itp_state_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterative_template_parser.itp_state_p(arg1);
        }
    }

    static private final SubLList $list_alt4 = list(makeSymbol("?CAT"));

    static private final SubLList $list_alt10 = list(makeSymbol("?TEMPLATE-TYPE"));

    static private final SubLList $list_alt11 = list(list(reader_make_constant_shell("nlPhraseTypeForTemplateCategory"), makeSymbol("?TYPE"), makeSymbol("?TEMPLATE-TYPE")));

    static private final SubLString $str_alt16$Node__A__D = makeString("Node-~A-~D");

    static private final SubLList $list_alt19 = list(makeSymbol("NODE-TYPE"), makeSymbol("LINGUISTIC-CATEGORY"));

    static private final SubLList $list_alt23 = list(makeSymbol("FUNC"), makeSymbol("CAT"));

    static private final SubLString $str_alt24$_A_A = makeString("~A~A");

    static private final SubLString $str_alt28$____creating_a__A_node__of_type__ = makeString("*** creating a ~A node, of type ~A and cat ~A");

    static private final SubLString $str_alt39$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt45$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt46 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt47$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt55 = list(list(makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell("CycRecursiveTemplateParser"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt56 = list(makeKeyword("CATEGORY"), makeKeyword("OPTIONS"), makeKeyword("CHOICE"), makeKeyword("SOURCE"));

    static private final SubLSymbol $sym63$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");

    static private final SubLList $list_alt69 = list(reader_make_constant_shell("SyntacticChoiceNode"));

    static private final SubLList $list_alt79 = list(reader_make_constant_shell("partOfIBT"), reader_make_constant_shell("Cyc"));

    static private final SubLList $list_alt80 = list(list(new SubLObject[]{ makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("NEW-GAFS"), makeSymbol("OLD-GAFS"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell("CycRecursiveTemplateParser")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym81$TEST_GAF = makeUninternedSymbol("TEST-GAF");

    static private final SubLSymbol $sym82$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");

    static private final SubLList $list_alt83 = list(makeSymbol("*KB-NODE-GATHERING-MODE?*"), T);

    static private final SubLString $str_alt89$restore_syntactic_option__A = makeString("restore-syntactic-option&~A");

    static private final SubLString $str_alt90$_Restore_Syntactic_Option_ = makeString("[Restore Syntactic Option]");

    static private final SubLString $str_alt91$exclude_syntactic_option__A = makeString("exclude-syntactic-option&~A");

    static private final SubLString $str_alt92$_Exclude_Syntactic_Option_ = makeString("[Exclude Syntactic Option]");

    static private final SubLList $list_alt98 = list(list(makeSymbol("*RTP-LATEST-KB-PARSE-TREE*"), $SAVE));

    static private final SubLList $list_alt101 = list(list(makeSymbol("SAVE-HERE"), makeSymbol("OFFSET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt106 = list(makeSymbol("ASSERTING-TREES?"));

    static private final SubLString $str_alt116$_S_is_not_a_template_category__ = makeString("~S is not a template category~%");

    static private final SubLList $list_alt123 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("PARENT"), makeSymbol("COMPONENT"), makeSymbol("SPAN"), makeSymbol("NEW-PARSE"), makeSymbol("ASSERTION"), makeSymbol("CHILDREN"), makeSymbol("PERMUTATIONS"), makeSymbol("SYNTACTIC-NODE"), makeSymbol("SYNTACTIC-CHOICES") });

    static private final SubLList $list_alt124 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("PARENT"), makeKeyword("COMPONENT"), $SPAN, makeKeyword("NEW-PARSE"), makeKeyword("ASSERTION"), makeKeyword("CHILDREN"), makeKeyword("PERMUTATIONS"), makeKeyword("SYNTACTIC-NODE"), makeKeyword("SYNTACTIC-CHOICES") });

    static private final SubLList $list_alt125 = list(new SubLObject[]{ makeSymbol("ITP-NODE-ID"), makeSymbol("ITP-NODE-PARENT"), makeSymbol("ITP-NODE-COMPONENT"), makeSymbol("ITP-NODE-SPAN"), makeSymbol("ITP-NODE-NEW-PARSE"), makeSymbol("ITP-NODE-ASSERTION"), makeSymbol("ITP-NODE-CHILDREN"), makeSymbol("ITP-NODE-PERMUTATIONS"), makeSymbol("ITP-NODE-SYNTACTIC-NODE"), makeSymbol("ITP-NODE-SYNTACTIC-CHOICES") });

    static private final SubLList $list_alt126 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-NODE-ID"), makeSymbol("_CSETF-ITP-NODE-PARENT"), makeSymbol("_CSETF-ITP-NODE-COMPONENT"), makeSymbol("_CSETF-ITP-NODE-SPAN"), makeSymbol("_CSETF-ITP-NODE-NEW-PARSE"), makeSymbol("_CSETF-ITP-NODE-ASSERTION"), makeSymbol("_CSETF-ITP-NODE-CHILDREN"), makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES") });

    static private final SubLString $str_alt158$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt159$__ = makeString("#<");

    static private final SubLString $str_alt161$_ = makeString(" ");

    static private final SubLString $str_alt162$__ = makeString("~%");

    static private final SubLSymbol $sym170$_VBAR = makeSymbol("?VBAR");

    static private final SubLSymbol $sym172$_CHILD = makeSymbol("?CHILD");

    static private final SubLList $list_alt174 = list(list(reader_make_constant_shell("syntacticDaughters"), makeSymbol("?VBAR"), makeSymbol("?CHILD")), list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?VBAR"), list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Verb"))));

    static private final SubLSymbol $sym175$_V = makeSymbol("?V");

    static private final SubLList $list_alt177 = list(makeSymbol("?V"));

    static private final SubLList $list_alt178 = list(list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?V"), reader_make_constant_shell("Verb")));

    static private final SubLList $list_alt181 = list(ONE_INTEGER, makeSymbol("?NODE"));

    static private final SubLList $list_alt182 = list(list(reader_make_constant_shell("syntacticNodeCategory"), makeSymbol("?NODE"), reader_make_constant_shell("Verb")));

    static private final SubLString $str_alt183$____RTP_____Couldn_t_create_KB_no = makeString("*** RTP *** Couldn't create KB node for ~A in ~A");

    static private final SubLList $list_alt186 = list(new SubLObject[]{ makeSymbol("SEQUENCE"), makeSymbol("COMPLETE-PARSES-ONLY"), makeSymbol("WORK-SET"), makeSymbol("SOLUTION-SET"), makeSymbol("SENTENCE"), makeSymbol("CATEGORY"), makeSymbol("CACHE"), makeSymbol("PSP-CHARTS"), makeSymbol("WORKING-MT") });

    static private final SubLList $list_alt187 = list(new SubLObject[]{ makeKeyword("SEQUENCE"), makeKeyword("COMPLETE-PARSES-ONLY"), makeKeyword("WORK-SET"), makeKeyword("SOLUTION-SET"), makeKeyword("SENTENCE"), makeKeyword("CATEGORY"), makeKeyword("CACHE"), makeKeyword("PSP-CHARTS"), makeKeyword("WORKING-MT") });

    static private final SubLList $list_alt188 = list(new SubLObject[]{ makeSymbol("ITP-STATE-SEQUENCE"), makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("ITP-STATE-WORK-SET"), makeSymbol("ITP-STATE-SOLUTION-SET"), makeSymbol("ITP-STATE-SENTENCE"), makeSymbol("ITP-STATE-CATEGORY"), makeSymbol("ITP-STATE-CACHE"), makeSymbol("ITP-STATE-PSP-CHARTS"), makeSymbol("ITP-STATE-WORKING-MT") });

    static private final SubLList $list_alt189 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-STATE-SEQUENCE"), makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("_CSETF-ITP-STATE-WORK-SET"), makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET"), makeSymbol("_CSETF-ITP-STATE-SENTENCE"), makeSymbol("_CSETF-ITP-STATE-CATEGORY"), makeSymbol("_CSETF-ITP-STATE-CACHE"), makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS"), makeSymbol("_CSETF-ITP-STATE-WORKING-MT") });

    static private final SubLString $str_alt218$Work___D_Solution___D_KB_Mt___A = makeString("Work: ~D Solution: ~D KB Mt: ~A");

    static private final SubLSymbol $sym220$_ = makeSymbol(">");

    public static final SubLSymbol $kw223$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt228$Expanding_itp_node__A________S__ = makeString("Expanding itp-node ~A:~%    ~S~%");

    static private final SubLString $str_alt230$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt231 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    static private final SubLString $str_alt238$length_of_chart_for__S____S__ = makeString("length of chart for ~S = ~S~%");

    static private final SubLString $str_alt241$sent_a_weird_category___S__to_pre = makeString("sent a weird category (~S) to pred-for-category (the vp-parser)~%");

    static private final SubLString $str_alt243$sent_a_non_categorized_pred___S__ = makeString("sent a non-categorized pred (~S) to RTP-CAT-FOR-PRED~%");

    static private final SubLString $str_alt246$sent_un_categorized_category__s_t = makeString("sent un-categorized category ~s to RTP-CAT-FOR-POS~%");

    static private final SubLSymbol $sym247$VERB_PHRASAL_TEMPLATE_CATEGORY_ = makeSymbol("VERB-PHRASAL-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym248$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym249$VERBAL_TEMPLATE_CATEGORY_ = makeSymbol("VERBAL-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym250$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym251$VBAR_TEMPLATE_CATEGORY_ = makeSymbol("VBAR-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym253$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym254$RTP_VBAR_TEMPLATE_CATEGORY_ = makeSymbol("RTP-VBAR-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym258$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym259$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ = makeSymbol("PREDICATIVE-ADJP-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym261$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym262$NOMINAL_CATEGORY_ = makeSymbol("NOMINAL-CATEGORY?");

    static private final SubLSymbol $sym263$_NOMINAL_CATEGORY__CACHING_STATE_ = makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");

    static private final SubLSymbol $sym264$ADJECTIVAL_CATEGORY_ = makeSymbol("ADJECTIVAL-CATEGORY?");

    static private final SubLSymbol $sym266$_ADJECTIVAL_CATEGORY__CACHING_STATE_ = makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");

    static private final SubLList $list_alt267 = list(reader_make_constant_shell("NumberTemplate"), reader_make_constant_shell("OrdinalTemplate"));

    static private final SubLSymbol $sym270$IS_THIS_A_THELIST_SPAN_ = makeSymbol("IS-THIS-A-THELIST-SPAN?");

    static private final SubLSymbol $sym271$_ = makeSymbol("<");

    static private final SubLSymbol $sym272$_FUNC = makeSymbol("?FUNC");

    static private final SubLList $list_alt273 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("NLTaggedTermDenotingFunction")), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("TernaryFunction")));

    static private final SubLSymbol $sym274$MT_IN_ANY_MT_ = makeSymbol("MT-IN-ANY-MT?");

    static private final SubLString $str_alt278$Couldn_t_find_a_parse_tree_mt_to_ = makeString("Couldn't find a parse-tree mt to be a genls of ~A -- some assertions may bomb out accordingly");

    static private final SubLSymbol $sym280$_N = makeSymbol("?N");

    static private final SubLSymbol $sym282$RESULT_OF_PARSING_FORMULA_ = makeSymbol("RESULT-OF-PARSING-FORMULA?");

    static private final SubLList $list_alt283 = list(reader_make_constant_shell("TheList"), reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("VPTemplate"));

    static private final SubLList $list_alt284 = list(makeSymbol("SUBJ-COMPONENT"), makeSymbol("VP-COMPONENT"));

    static private final SubLString $str_alt285$____can_t_build_any_meaning_combi = makeString("*** can't build any meaning combinations for ~A");

    static private final SubLList $list_alt286 = list(makeSymbol("VP-NODE"), makeSymbol("VP-MEANING"));

    static private final SubLList $list_alt287 = list(makeSymbol("SUBJ-NODE"), makeSymbol("SUBJ-MEANING"));

    static private final SubLSymbol $sym290$NL_ATTR_W_LOCATION_ = makeSymbol("NL-ATTR-W-LOCATION?");

    static private final SubLList $list_alt291 = list(reader_make_constant_shell("NLDefinitenessFn"), reader_make_constant_shell("NLQuantFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"));

    static private final SubLSymbol $sym296$UNASSEMBLED_PHRASE_ = makeSymbol("UNASSEMBLED-PHRASE?");

    static private final SubLList $list_alt300 = list(reader_make_constant_shell("STemplate"), reader_make_constant_shell("VPTemplate"));

    static private final SubLString $str_alt308$sent__S_to_force_for_result__ = makeString("sent ~S to force-for-result~%");

    static private final SubLList $list_alt309 = list(reader_make_constant_shell("STemplate"), reader_make_constant_shell("QuestionTemplate"));

    static private final SubLSymbol $sym312$SUBSTITUTABLE_CHILD_FORMULA_ = makeSymbol("SUBSTITUTABLE-CHILD-FORMULA?");
}

/**
 * Total time: 2927 ms synthetic
 */
