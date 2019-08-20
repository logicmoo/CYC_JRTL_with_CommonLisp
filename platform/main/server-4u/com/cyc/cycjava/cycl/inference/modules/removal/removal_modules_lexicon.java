/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.arguments.hl_support_p;
import static com.cyc.cycjava.cycl.arguments.make_hl_support;
import static com.cyc.cycjava.cycl.arguments.support_mt;
import static com.cyc.cycjava.cycl.arguments.support_sentence;
import static com.cyc.cycjava.cycl.arguments.support_sentence_operator;
import static com.cyc.cycjava.cycl.arguments.support_truth;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_formula;
import static com.cyc.cycjava.cycl.backward.removal_add_node;
import static com.cyc.cycjava.cycl.backward.removal_ask_justifications;
import static com.cyc.cycjava.cycl.bindings.some_variable_with_conflicting_bindings;
import static com.cyc.cycjava.cycl.bindings.subst_bindings;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.lexicon_initialized_p;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg3;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_args;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_terms;
import static com.cyc.cycjava.cycl.deck.create_deck;
import static com.cyc.cycjava.cycl.deck.deck_pop;
import static com.cyc.cycjava.cycl.deck.deck_push;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.nreplace_formula_arg;
import static com.cyc.cycjava.cycl.formula_pattern_match.formula_matches_pattern;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.function_terms.naut_to_nart;
import static com.cyc.cycjava.cycl.genl_mts.max_floor_mts;
import static com.cyc.cycjava.cycl.genl_predicates.all_spec_preds;
import static com.cyc.cycjava.cycl.genls.genlP;
import static com.cyc.cycjava.cycl.hl_supports.hl_forward_mt_combos;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_max_number;
import static com.cyc.cycjava.cycl.inference.harness.inference_macros.current_controlling_inference;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module_use_generic;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.register_solely_specific_removal_module_predicate;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.inference_preference_module;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.iteration.iteration_done;
import static com.cyc.cycjava.cycl.iteration.iteration_next;
import static com.cyc.cycjava.cycl.iteration.new_iterator;
import static com.cyc.cycjava.cycl.iteration.new_list_iterator;
import static com.cyc.cycjava.cycl.kb_indexing.num_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_indexing.relevant_num_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_indexing.relevant_num_predicate_extent_index;
import static com.cyc.cycjava.cycl.kb_mapping.gather_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_values;
import static com.cyc.cycjava.cycl.lexicon_accessors.all_preds_of_pos;
import static com.cyc.cycjava.cycl.lexicon_accessors.denots_of_string;
import static com.cyc.cycjava.cycl.lexicon_accessors.denots_of_stringXpred;
import static com.cyc.cycjava.cycl.lexicon_accessors.genl_pos_predP;
import static com.cyc.cycjava.cycl.lexicon_accessors.pos_of_pred;
import static com.cyc.cycjava.cycl.lexicon_accessors.pos_of_word;
import static com.cyc.cycjava.cycl.lexicon_accessors.speech_partP;
import static com.cyc.cycjava.cycl.lexicon_accessors.speech_part_predP;
import static com.cyc.cycjava.cycl.lexicon_accessors.words_of_stringXpred;
import static com.cyc.cycjava.cycl.lexicon_cache.strings_of_wordXpred;
import static com.cyc.cycjava.cycl.lexicon_cache.strings_of_word_unit_with_supports;
import static com.cyc.cycjava.cycl.lexicon_cache.words_of_string;
import static com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$;
import static com.cyc.cycjava.cycl.lexicon_utilities.pos_of_cat;
import static com.cyc.cycjava.cycl.lexicon_utilities.preds_of_pos;
import static com.cyc.cycjava.cycl.lexicon_utilities.preds_to_pos_args;
import static com.cyc.cycjava.cycl.lexicon_vars.$lexicon_lookup_mt$;
import static com.cyc.cycjava.cycl.lexicon_vars.$misspellingsP$;
import static com.cyc.cycjava.cycl.lexicon_vars.$parse_morphologically$;
import static com.cyc.cycjava.cycl.lexicon_vars.name_string_predP;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup_without_values;
import static com.cyc.cycjava.cycl.list_utilities.empty_list_p;
import static com.cyc.cycjava.cycl.list_utilities.member_equalP;
import static com.cyc.cycjava.cycl.list_utilities.non_empty_list_p;
import static com.cyc.cycjava.cycl.list_utilities.randomize_list;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.sets_equalP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.inference_relevant_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.mt_info;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.narts_high.nart_substitute;
import static com.cyc.cycjava.cycl.nl_trie.new_nl_trie_iterator;
import static com.cyc.cycjava.cycl.nl_trie.nl_trie_entry_string;
import static com.cyc.cycjava.cycl.nl_trie.nl_trie_word_head_onlyP;
import static com.cyc.cycjava.cycl.nl_trie.nl_trie_word_p;
import static com.cyc.cycjava.cycl.nl_trie.nl_trie_word_word_unit;
import static com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_assertions_with_string_and_namestring_pred;
import static com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_get_term_phrases_supports;
import static com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_hl_forward_mt_combos_word_strings;
import static com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_hl_justify_word_strings;
import static com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_word_pred_and_supports_for_pred;
import static com.cyc.cycjava.cycl.obsolete.cnat_p;
import static com.cyc.cycjava.cycl.parsing_macros.$parsing_timeout_reachedP$;
import static com.cyc.cycjava.cycl.parsing_macros.$parsing_timeout_time$;
import static com.cyc.cycjava.cycl.parsing_macros.$parsing_timeout_time_check_count$;
import static com.cyc.cycjava.cycl.parsing_macros.parsing_compute_timeout_time;
import static com.cyc.cycjava.cycl.parsing_macros.parsing_timeout_time_reachedP;
import static com.cyc.cycjava.cycl.pph_methods_lexicon.hl_justify_string_for_term;
import static com.cyc.cycjava.cycl.psp_main.inference_ps_get_cycls_and_constraints_for_phrase;
import static com.cyc.cycjava.cycl.psp_main.inference_ps_get_cycls_for_phrase;
import static com.cyc.cycjava.cycl.psp_main.psp_hl_justify_parse;
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
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_forward_direction;
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
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_add_node_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$genl_inverse_mode_p$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$relevant_sbhl_tv_function$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_add_node_to_result_test$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_direction$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_module$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_search_module_type$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.$sbhl_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.flip_genl_inverse_modeP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.genl_inverse_mode_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_backward_search_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_forward_search_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_add_node_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_module;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_true_tv;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.relevant_sbhl_tvP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.unification_utilities.term_unify;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.lexicon_macros;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nl_trie;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-LEXICON
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-lexicon.lisp
 * created:     2019/07/03 17:38:16
 */
public final class removal_modules_lexicon extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_97_initializer() {
        return list(new SubLObject[]{ list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"), reader_make_constant_shell("nameString"), makeString("COPD-PFT")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("acronymString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Atherosclerosis"), reader_make_constant_shell("nonPlural-Generic"), makeString("hardening of the arteries")), reader_make_constant_shell("EnglishCompositionalPhrasesLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("presentParticiple"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("OpenEndedInvestmentCompany"), reader_make_constant_shell("nameString"), makeString("OEIC")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("initialismString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ScubaDiving"), reader_make_constant_shell("nonPlural-Generic"), makeString("scuba diving")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("infinitive"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("SupraventricularTachycardia"), reader_make_constant_shell("MassNoun"), makeString("supraventricular tach")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("multiWordString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Hepatitis"), reader_make_constant_shell("massNumber"), makeString("hepatitis")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("massNumber"), reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("GolfCourse"), reader_make_constant_shell("plural"), makeString("links")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"), reader_make_constant_shell("nonPlural-Generic"), makeString("COPD confirmed by a pulmonary function test")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("TetralogyOfFallotWithAbsentPulmonaryValve"), reader_make_constant_shell("nonPlural-Generic"), makeString("Tetralogy of Fallot with absent pulmonary valve")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("pnMassNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("DiseaseOfTheAorta"), reader_make_constant_shell("CountNoun"), makeString("disease of the aorta")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Tennis-TheGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("tennis")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("PorscheCar"), reader_make_constant_shell("nonPlural-Generic"), makeString("Porsche")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("pnSingular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("InLineSkating"), reader_make_constant_shell("nonPlural-Generic"), makeString("roller-blading")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("infinitive"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("EnemaAdministeringEvent"), reader_make_constant_shell("nonPlural-Generic"), makeString("enema")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Exercising"), reader_make_constant_shell("nonPlural-Generic"), makeString("Bewegung")), reader_make_constant_shell("GermanLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("singular-Feminine"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Baseball-TheGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("the game of baseball")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AtrialFibrillationOrFlutter"), reader_make_constant_shell("nonPlural-Generic"), makeString("atrial fibrillation or flutter")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("SinglesTableTennis"), reader_make_constant_shell("nonPlural-Generic"), makeString("singles table tennis")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("VentricularSeptalDefect-Atrial-ventricularCanalType"), reader_make_constant_shell("nonPlural-Generic"), makeString("A-V canal type VSD")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("pnSingular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Poker-CardGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("poker game")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("DiseaseOfTheDescendingAorta"), reader_make_constant_shell("MassNoun"), makeString("disease of the descending aorta")), reader_make_constant_shell("EnglishCompositionalPhrasesLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Franchise"), reader_make_constant_shell("Noun"), makeString("franchises")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genls"), reader_make_constant_shell("denotation"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Ox"), reader_make_constant_shell("CountNoun"), makeString("oxen")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Calcification"), reader_make_constant_shell("MassNoun"), makeString("calcification")), reader_make_constant_shell("EnglishJargonMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AtresiaWithVentricularSeptalDefect-PulmonaryValve"), reader_make_constant_shell("MassNoun"), makeString("pulmonary valve atresia with ventricular septal defect")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("RenalFailure"), reader_make_constant_shell("MassNoun"), makeString("renal failure")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AbnormalNumberOfCusps"), reader_make_constant_shell("nonPlural-Generic"), makeString("abnormal num of cusps")), reader_make_constant_shell("CCFLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), reader_make_constant_shell("Ox"), reader_make_constant_shell("CountNoun"), makeString("oXen")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("CharacterString"), makeString("the yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("NounPhrase"), makeString("a yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("singular-Generic"), makeString("yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))) });
    }

    public static final SubLFile me = new removal_modules_lexicon();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_word_string_check_cost$ = makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_word_strings_unify_cost$ = makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_removal_word_strings_iterator_state$ = makeSymbol("*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $avg_suffix_expansion_cost$ = makeSymbol("*AVG-SUFFIX-EXPANSION-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_term_phrases_cost$ = makeSymbol("*DEFAULT-TERM-PHRASES-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_lexicon_namestring_check_cost$ = makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol HL_VERIFY_WORD_STRINGS = makeSymbol("HL-VERIFY-WORD-STRINGS");

    private static final SubLSymbol HL_JUSTIFY_WORD_STRINGS = makeSymbol("HL-JUSTIFY-WORD-STRINGS");

    private static final SubLSymbol HL_FORWARD_MT_COMBOS_WORD_STRINGS = makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS");

    static private final SubLList $list4 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));



    private static final SubLSymbol $REMOVAL_WORD_STRINGS_CHECK = makeKeyword("REMOVAL-WORD-STRINGS-CHECK");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-pred> <fully bound> <string>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord \"dog\")") });

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_WORD_STRINGS_UNIFY_ARG1 = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1");

    static private final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("POS-PRED")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("POS-PRED"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("WORD-STRINGS"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$wordStrings ?WHAT \"dog\")") });

    static private final SubLList $list12 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("ARG2"));

    private static final SubLSymbol $REMOVAL_WORD_STRINGS_UNIFY_ARG2 = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2");

    static private final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), $COST, makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord ?STRING)") });

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    static private final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str28$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str29$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str30$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE_P = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P");

    static private final SubLList $list33 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("TRIE-ITERATOR"), makeSymbol("ENTRY-ITERATOR"));

    static private final SubLList $list34 = list(makeKeyword("SPEECH-PART-PREDICATE"), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("TRIE-ITERATOR"), makeKeyword("ENTRY-ITERATOR"));

    static private final SubLList $list35 = list(makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("REMOVAL-WSI-STATE-ARG1"), makeSymbol("REMOVAL-WSI-STATE-ARG2"), makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR"));

    private static final SubLList $list36 = list(makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR"));

    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list39 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));

    private static final SubLSymbol REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");

    private static final SubLSymbol REMOVAL_WSI_STATE_ARG1 = makeSymbol("REMOVAL-WSI-STATE-ARG1");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ARG1 = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1");

    private static final SubLSymbol REMOVAL_WSI_STATE_ARG2 = makeSymbol("REMOVAL-WSI-STATE-ARG2");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ARG2 = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2");

    private static final SubLSymbol REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR");

    private static final SubLSymbol REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR");

    private static final SubLSymbol $SPEECH_PART_PREDICATE = makeKeyword("SPEECH-PART-PREDICATE");

    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol("MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD");

    private static final SubLSymbol ITERATOR_WORD_STRINGS_DONE = makeSymbol("ITERATOR-WORD-STRINGS-DONE");

    private static final SubLSymbol ITERATOR_WORD_STRINGS_NEXT = makeSymbol("ITERATOR-WORD-STRINGS-NEXT");

    private static final SubLList $list63 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS");

    static private final SubLList $list66 = cons(makeSymbol("STRING"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT");

    private static final SubLList $list68 = list(makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2"), makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1"), makeKeyword("REMOVAL-WORD-STRINGS-CHECK"));



    private static final SubLSymbol $REMOVAL_WORD_FORMS_CHECK = makeKeyword("REMOVAL-WORD-FORMS-CHECK");

    static private final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully bound> <fully bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Ox-TheWord #$plural \"oxen\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG1 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG1");

    static private final SubLList $list73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD #$plural \"dogs\")") });



    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG2 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG2");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED \"dogs\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG3 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG3");

    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord #$plural ?STRING)") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2");

    private static final SubLList $list80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD ?PRED \"dogs\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3");

    private static final SubLList $list82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED ?STRING)") });



    private static final SubLSymbol HL_VERIFY_TERM_PHRASES = makeSymbol("HL-VERIFY-TERM-PHRASES");

    private static final SubLSymbol HL_JUSTIFY_TERM_PHRASES = makeSymbol("HL-JUSTIFY-TERM-PHRASES");



    private static final SubLObject $$termPhrases_Lexical = reader_make_constant_shell("termPhrases-Lexical");

    private static final SubLObject $$termPhrases_CaseInsensitive = reader_make_constant_shell("termPhrases-CaseInsensitive");

    private static final SubLObject $const90$termPhrases_CaseInsensitive_Lexic = reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical");



    private static final SubLList $list92 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol HL_FORWARD_MT_COMBOS_TERM_PHRASES = makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES");

    private static final SubLSymbol SUPPORT_SENTENCE_OPERATOR = makeSymbol("SUPPORT-SENTENCE-OPERATOR");

    private static final SubLSymbol HL_VERIFY_AND_JUSTIFY_TERM_PHRASES = makeSymbol("HL-VERIFY-AND-JUSTIFY-TERM-PHRASES");

    private static final SubLSymbol $sym97$SUPPORTS_HAVE_PREDS_ = makeSymbol("SUPPORTS-HAVE-PREDS?");

    public static final SubLObject $list103 = removal_modules_lexicon._constant_103_initializer();

    private static final SubLSymbol $sym105$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");





    private static final SubLList $list109 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list110 = list(makeKeyword("OR"), reader_make_constant_shell("termPhrases"), reader_make_constant_shell("termPhrases-CaseInsensitive"));

    private static final SubLList $list111 = list(list(makeSymbol("GAF"), makeSymbol("TERM"), makeSymbol("PREDICATE"), makeSymbol("INDEX-ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list117 = list(makeKeyword("TRUTH"), $TRUE);

    private static final SubLSymbol DO_GAF_ARG_INDEX_NAUT = makeSymbol("DO-GAF-ARG-INDEX-NAUT");

    private static final SubLList $list119 = list(makeSymbol("TERM"), makeSymbol("CONSTRAINT"), makeSymbol("ARG3"));

    private static final SubLSymbol $sym121$GENERIC_PRED_ = makeSymbol("GENERIC-PRED?");



    private static final SubLSymbol $sym123$NAME_STRING_PRED_ = makeSymbol("NAME-STRING-PRED?");









    private static final SubLObject $$nonSingular_Generic = reader_make_constant_shell("nonSingular-Generic");



    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG3");

    private static final SubLList $list132 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG3");

    private static final SubLList $list134 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG3");

    private static final SubLList $list136 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG3");

    private static final SubLList $list138 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1");

    static private final SubLList $list140 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1");

    private static final SubLList $list142 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG1");

    private static final SubLList $list144 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-Lexical ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG1");

    static private final SubLList $list146 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")") });

    private static final SubLList $list147 = list(makeSymbol("ARG1"), makeSymbol("CONSTRAINT"), makeSymbol("STRING"));

    static private final SubLList $list152 = list(reader_make_constant_shell("termPhrases-CaseInsensitive"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"));

    private static final SubLList $list153 = list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"));

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2");

    private static final SubLList $list155 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1-AND-ARG2");

    static private final SubLList $list157 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")") });

    static private final SubLList $list158 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("STRING"));

    static private final SubLList $list159 = list(makeSymbol("DENOT"), makeSymbol("PRED"));







    private static final SubLList $list164 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("STRING"));

    private static final SubLList $list165 = list($BIND, makeSymbol("NAME-PRED"));

    static private final SubLList $list166 = list($BIND, makeSymbol("DENOT"));

    private static final SubLSymbol NAME_PRED = makeSymbol("NAME-PRED");

    private static final SubLSymbol REMOVAL_LEXICON_NAMESTRING_EXPAND = makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND");

    private static final SubLSymbol $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ = makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?");

    private static final SubLSymbol $TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword("TERM-STRINGS-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");

    private static final SubLList $list173 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND = makeKeyword("TERM-PHRASES-STRONGLY-PREFER-AT-LEAST-TERM-OR-STRING-FULLY-BOUND");

    private static final SubLList $list175 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell("termPhrases")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_LEXICON_NAMESTRING = makeKeyword("REMOVAL-LEXICON-NAMESTRING");

    private static final SubLList $list177 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("NL-TRIE-NAME-STRING-PRED?")), makeKeyword("ANYTHING"), list($TEST, makeSymbol("STRINGP"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon."), makeKeyword("EXAMPLE"), makeString("(#$nameString ?WHO \"Cher\")") });

    // Definitions
    public static final SubLObject removal_word_strings_check_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    // Definitions
    public static SubLObject removal_word_strings_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject hl_verify_word_strings_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject asent = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                asent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
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
                                ans = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_word_strings_check_succeedsP(asent);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt0);
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_verify_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, removal_modules_lexicon.$list0);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list0);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list0);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list0);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = removal_modules_lexicon.removal_word_strings_check_succeedsP(asent);
            } finally {
                $relevant_mts$.rebind(_prev_bind_3, thread);
                $relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(support, removal_modules_lexicon.$list0);
        }
        return ans;
    }

    public static final SubLObject hl_justify_word_strings_alt(SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_justify_word_strings(support);
    }

    public static SubLObject hl_justify_word_strings(final SubLObject support) {
        return nl_trie_hl_justify_word_strings(support);
    }

    public static final SubLObject hl_forward_mt_combos_word_strings_alt(SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_forward_mt_combos_word_strings(support);
    }

    public static SubLObject hl_forward_mt_combos_word_strings(final SubLObject support) {
        return nl_trie_hl_forward_mt_combos_word_strings(support);
    }

    public static final SubLObject removal_word_strings_check_succeedsP_alt(SubLObject asent) {
        {
            SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject pos_pred = NIL;
            SubLObject word = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            pos_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            word = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject misspellingsP = mt_relevance_macros.relevant_mtP($$CommonEnglishMisspellingsMt);
                    SubLObject mt = mt_relevance_macros.inference_relevant_mt();
                    SubLObject words = lexicon_accessors.words_of_stringXpred(string, pos_pred, misspellingsP, mt, UNPROVIDED);
                    return subl_promotions.memberP(word, words, symbol_function(EQUAL), UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static SubLObject removal_word_strings_check_succeedsP(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = formula_terms(asent, UNPROVIDED);
        SubLObject pos_pred = NIL;
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list4);
        pos_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list4);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list4);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject misspellingsP = relevant_mtP(removal_modules_lexicon.$$CommonEnglishMisspellingsMt);
            final SubLObject mt = inference_relevant_mt();
            final SubLObject words = words_of_stringXpred(string, pos_pred, misspellingsP, mt, UNPROVIDED);
            return memberP(word, words, symbol_function(EQUAL), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, removal_modules_lexicon.$list4);
        return NIL;
    }

    public static final SubLObject removal_word_strings_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_word_strings_check_succeedsP(asent)) {
            {
                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_word_strings_support(asent);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_word_strings_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_modules_lexicon.removal_word_strings_check_succeedsP(asent)) {
            final SubLObject hl_support = removal_modules_lexicon.make_word_strings_support(asent);
            removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject make_word_strings_support_alt(SubLObject formula) {
        return arguments.make_hl_support($WORD_STRINGS, formula, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_word_strings_support(final SubLObject formula) {
        return make_hl_support($WORD_STRINGS, formula, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_word_strings_unify_arg1_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_strings_unify_arg1_output_generate_alt(SubLObject pos_pred, SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return iteration.new_list_iterator(lexicon_accessors.words_of_stringXpred(string, pos_pred, T, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED));
        }
    }

    public static SubLObject removal_word_strings_unify_arg1_output_generate(final SubLObject pos_pred, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return new_list_iterator(words_of_stringXpred(string, pos_pred, T, $mt$.getDynamicValue(thread), UNPROVIDED));
    }

    public static final SubLObject removal_word_strings_unify_arg2_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_strings_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return kb_indexing.num_gaf_arg_index(word, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject removal_word_strings_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        return num_gaf_arg_index(word, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_word_strings_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject pos_pred = NIL;
                SubLObject word = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt12);
                pos_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt12);
                word = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt12);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding(thread);
                        try {
                            lexicon_vars.$misspellingsP$.bind(mt_relevance_macros.relevant_mtP($$CommonEnglishMisspellingsMt), thread);
                            {
                                SubLObject strings = lexicon_cache.strings_of_wordXpred(word, pos_pred, mt_relevance_macros.mt_info(UNPROVIDED));
                                SubLObject cdolist_list_var = strings;
                                SubLObject string = NIL;
                                for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_bindings = unification_utilities.term_unify(string, arg2, T, T);
                                        SubLObject unify_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != v_bindings) {
                                            {
                                                SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                                                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_word_strings_support(formula);
                                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            lexicon_vars.$misspellingsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt12);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_word_strings_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = formula_terms(asent, UNPROVIDED);
        SubLObject pos_pred = NIL;
        SubLObject word = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list12);
        pos_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list12);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list12);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = $misspellingsP$.currentBinding(thread);
            try {
                $misspellingsP$.bind(relevant_mtP(removal_modules_lexicon.$$CommonEnglishMisspellingsMt), thread);
                SubLObject cdolist_list_var;
                final SubLObject strings = cdolist_list_var = strings_of_wordXpred(word, pos_pred, mt_info(UNPROVIDED));
                SubLObject string = NIL;
                string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = term_unify(string, arg2, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        final SubLObject formula = subst_bindings(v_bindings, asent);
                        final SubLObject hl_support = removal_modules_lexicon.make_word_strings_support(formula);
                        removal_add_node(hl_support, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    string = cdolist_list_var.first();
                } 
            } finally {
                $misspellingsP$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list12);
        }
        return NIL;
    }

    public static final SubLObject removal_word_strings_unify_arg1_and_arg2_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_strings_unify_arg1_and_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject node_var = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = $$True_JustificationTruth;
                            {
                                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(cycl_utilities.atomic_sentence_predicate(asent), sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_7 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject spec_pred = node_var_7;
                                                                {
                                                                    SubLObject _prev_bind_0_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_7)) {
                                                                            count = add(count, kb_indexing.relevant_num_predicate_extent_index(spec_pred));
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_7);
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
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_14 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , node_vars_link_node = cdolist_list_var_14.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_13, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_11, thread);
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
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_15 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , generating_fn = cdolist_list_var_15.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_18 = new_list_17;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , node_vars_link_node = cdolist_list_var_18.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_16, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_10, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_6, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt29$Node__a_does_not_pass_sbhl_type_t, cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_3, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject current_controlling_inference = inference_macros.current_controlling_inference();
                    if (NIL != current_controlling_inference) {
                        {
                            SubLObject number_cutoff = inference_datastructures_inference.inference_max_number(current_controlling_inference);
                            if ((NIL != number_cutoff) && number_cutoff.numL(count)) {
                                count = number_cutoff;
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject node_var = atomic_sentence_predicate(asent);
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = $sbhl_space$.currentBinding(thread);
        try {
            $sbhl_space$.bind(get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = removal_modules_lexicon.$$True_JustificationTruth;
                final SubLObject _prev_bind_0_$1 = $sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                    $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_error(ONE_INTEGER, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_cerror(ONE_INTEGER, removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn(removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn(removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror(removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$2 = $sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $sbhl_module$.currentBinding(thread);
                    try {
                        $sbhl_search_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genlPreds), thread);
                        $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                        $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                        $genl_inverse_mode_p$.bind(NIL, thread);
                        $sbhl_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genlPreds), thread);
                        if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(atomic_sentence_predicate(asent), get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$3 = $sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = $sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = $genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_search_direction$.bind(get_sbhl_backward_search_direction(), thread);
                                $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_backward_search_direction(), get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                                $genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(atomic_sentence_predicate(asent), genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck_pop(recur_deck)) {
                                    final SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$7;
                                    final SubLObject _prev_bind_0_$4 = $genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != apply_sbhl_add_node_test(get_sbhl_search_add_node_test(), node_var_$7)) {
                                            count = add(count, relevant_num_predicate_extent_index(spec_pred));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = get_sbhl_accessible_modules(get_sbhl_module(removal_modules_lexicon.$$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = $sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$5 = $genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                $sbhl_module$.bind(module_var, thread);
                                                $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = naut_to_nart(node_var_$7);
                                                if (NIL != sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = do_dictionary_contents_state(dictionary_contents(mt_links)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = $sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        $sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = do_dictionary_contents_state(dictionary_contents(tv_links)); NIL == do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = $sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck_push(list(node_vars_link_node, genl_inverse_mode_p()), recur_deck);
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
                                                                                                    deck_push(list(node_vars_link_node2, genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    $sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        do_dictionary_contents_finalize(iteration_state_$12);
                                                                    } finally {
                                                                        $sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_error(FIVE_INTEGER, removal_modules_lexicon.$str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$14;
                                                        final SubLObject new_list = cdolist_list_var_$14 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$14.first();
                                                        while (NIL != cdolist_list_var_$14) {
                                                            final SubLObject _prev_bind_0_$8 = $sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                $sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck_push(list(node_vars_link_node3, genl_inverse_mode_p()), recur_deck);
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
                                                                                deck_push(list(node_vars_link_node4, genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                $sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                            generating_fn = cdolist_list_var_$14.first();
                                                        } 
                                                    }

                                            } finally {
                                                $genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                                $sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        $genl_inverse_mode_p$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            } finally {
                                $genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                $sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                $sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            sbhl_warn(TWO_INTEGER, removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, atomic_sentence_predicate(asent), get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $sbhl_module$.rebind(_prev_bind_5, thread);
                        $genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        $sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        $sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        $sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    $relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    $sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            $sbhl_space$.rebind(_prev_bind_0, thread);
        }
        final SubLObject current_controlling_inference = current_controlling_inference();
        if (NIL != current_controlling_inference) {
            final SubLObject number_cutoff = inference_max_number(current_controlling_inference);
            if ((NIL != number_cutoff) && number_cutoff.numL(count)) {
                count = number_cutoff;
            }
        }
        return count;
    }

    public static final SubLObject removal_word_strings_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_word_strings_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject removal_word_strings_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject removal_word_strings_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject removal_wsi_state_speech_part_predicate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject removal_wsi_state_speech_part_predicate(final SubLObject v_object) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject removal_wsi_state_arg1_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject removal_wsi_state_arg1(final SubLObject v_object) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject removal_wsi_state_arg2_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject removal_wsi_state_arg2(final SubLObject v_object) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject removal_wsi_state_trie_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject removal_wsi_state_trie_iterator(final SubLObject v_object) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject removal_wsi_state_entry_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject removal_wsi_state_entry_iterator(final SubLObject v_object) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_removal_wsi_state_speech_part_predicate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_removal_wsi_state_speech_part_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_removal_wsi_state_arg1_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_removal_wsi_state_arg1(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_removal_wsi_state_arg2_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_removal_wsi_state_arg2(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_removal_wsi_state_trie_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_removal_wsi_state_trie_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_removal_wsi_state_entry_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_removal_wsi_state_entry_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) : "! removal_modules_lexicon.removal_word_strings_iterator_state_p(v_object) " + "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_removal_word_strings_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SPEECH_PART_PREDICATE)) {
                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_speech_part_predicate(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ARG1)) {
                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_arg1(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ARG2)) {
                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_arg2(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TRIE_ITERATOR)) {
                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_trie_iterator(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ENTRY_ITERATOR)) {
                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_entry_iterator(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_removal_word_strings_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(removal_modules_lexicon.$SPEECH_PART_PREDICATE)) {
                removal_modules_lexicon._csetf_removal_wsi_state_speech_part_predicate(v_new, current_value);
            } else
                if (pcase_var.eql($ARG1)) {
                    removal_modules_lexicon._csetf_removal_wsi_state_arg1(v_new, current_value);
                } else
                    if (pcase_var.eql($ARG2)) {
                        removal_modules_lexicon._csetf_removal_wsi_state_arg2(v_new, current_value);
                    } else
                        if (pcase_var.eql($TRIE_ITERATOR)) {
                            removal_modules_lexicon._csetf_removal_wsi_state_trie_iterator(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENTRY_ITERATOR)) {
                                removal_modules_lexicon._csetf_removal_wsi_state_entry_iterator(v_new, current_value);
                            } else {
                                Errors.error(removal_modules_lexicon.$str55$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_word_strings_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, removal_modules_lexicon.MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, removal_modules_lexicon.$SPEECH_PART_PREDICATE, removal_modules_lexicon.removal_wsi_state_speech_part_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG1, removal_modules_lexicon.removal_wsi_state_arg1(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG2, removal_modules_lexicon.removal_wsi_state_arg2(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIE_ITERATOR, removal_modules_lexicon.removal_wsi_state_trie_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTRY_ITERATOR, removal_modules_lexicon.removal_wsi_state_entry_iterator(obj));
        funcall(visitor_fn, obj, $END, removal_modules_lexicon.MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_word_strings_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return removal_modules_lexicon.visit_defstruct_removal_word_strings_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject iterator_word_strings_done_alt(SubLObject state) {
        return makeBoolean((NIL != iteration.iteration_done(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_trie_iterator(state))) && ((NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_entry_iterator(state)) || (NIL != iteration.iteration_done(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_entry_iterator(state)))));
    }

    public static SubLObject iterator_word_strings_done(final SubLObject state) {
        return makeBoolean((NIL != iteration_done(removal_modules_lexicon.removal_wsi_state_trie_iterator(state))) && ((NIL == removal_modules_lexicon.removal_wsi_state_entry_iterator(state)) || (NIL != iteration_done(removal_modules_lexicon.removal_wsi_state_entry_iterator(state)))));
    }

    public static final SubLObject wsi_entry_iterator_prepared_p_alt(SubLObject state) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_entry_iterator(state)) && (NIL == iteration.iteration_done(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_entry_iterator(state))));
    }

    public static SubLObject wsi_entry_iterator_prepared_p(final SubLObject state) {
        return makeBoolean((NIL != removal_modules_lexicon.removal_wsi_state_entry_iterator(state)) && (NIL == iteration_done(removal_modules_lexicon.removal_wsi_state_entry_iterator(state))));
    }

    public static final SubLObject wsi_advance_to_next_entry_iterator_alt(SubLObject state) {
        while (!((NIL != iteration.iteration_done(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_trie_iterator(state))) || (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.wsi_entry_iterator_prepared_p(state)))) {
            {
                SubLObject this_pair = iteration.iteration_next(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_trie_iterator(state));
                SubLObject entries = second(this_pair);
                if (NIL != entries) {
                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._csetf_removal_wsi_state_entry_iterator(state, iteration.new_list_iterator(entries));
                }
            }
        } 
        return state;
    }

    public static SubLObject wsi_advance_to_next_entry_iterator(final SubLObject state) {
        while ((NIL == iteration_done(removal_modules_lexicon.removal_wsi_state_trie_iterator(state))) && (NIL == removal_modules_lexicon.wsi_entry_iterator_prepared_p(state))) {
            final SubLObject this_pair = iteration_next(removal_modules_lexicon.removal_wsi_state_trie_iterator(state));
            final SubLObject entries = second(this_pair);
            if (NIL != entries) {
                removal_modules_lexicon._csetf_removal_wsi_state_entry_iterator(state, new_list_iterator(entries));
            }
        } 
        return state;
    }

    public static final SubLObject wsi_current_word_and_string_unifyP_alt(SubLObject state, SubLObject current_word, SubLObject string) {
        return makeBoolean((NIL != unification_utilities.term_unify(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_arg1(state), current_word, UNPROVIDED, UNPROVIDED)) && (NIL != unification_utilities.term_unify(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_arg2(state), string, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject wsi_current_word_and_string_unifyP(final SubLObject state, final SubLObject current_word, final SubLObject string) {
        return makeBoolean((NIL != term_unify(removal_modules_lexicon.removal_wsi_state_arg1(state), current_word, UNPROVIDED, UNPROVIDED)) && (NIL != term_unify(removal_modules_lexicon.removal_wsi_state_arg2(state), string, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject iterator_word_strings_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = NIL;
                SubLObject supported_string = NIL;
                while (!(((NIL != word) && (NIL != supported_string)) || (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.iterator_word_strings_done(state)))) {
                    if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.wsi_entry_iterator_prepared_p(state)) {
                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.wsi_advance_to_next_entry_iterator(state);
                    }
                    while ((NIL == word) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.wsi_entry_iterator_prepared_p(state))) {
                        {
                            SubLObject current_entry = iteration.iteration_next(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_entry_iterator(state));
                            SubLObject speech_part_predicate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_speech_part_predicate(state);
                            if ((NIL != nl_trie.nl_trie_word_p(current_entry, UNPROVIDED)) && (NIL != nl_trie.nl_trie_word_head_onlyP(current_entry))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject entry_pred = nl_trie_accessors.nl_trie_word_pred_and_supports_for_pred(current_entry, speech_part_predicate, UNPROVIDED);
                                    SubLObject supports = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != entry_pred) {
                                        {
                                            SubLObject current_word = nl_trie.nl_trie_word_word_unit(current_entry, NIL);
                                            SubLObject string = nl_trie.nl_trie_entry_string(current_entry);
                                            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.wsi_current_word_and_string_unifyP(state, current_word, string)) {
                                                word = current_word;
                                                supported_string = cons(string, supports);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                } 
                return values(NIL != word ? ((SubLObject) (list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_wsi_state_speech_part_predicate(state), word, supported_string))) : NIL, state, sublisp_null(word));
            }
        }
    }

    public static SubLObject iterator_word_strings_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word = NIL;
        SubLObject supported_string = NIL;
        while (((NIL == word) || (NIL == supported_string)) && (NIL == removal_modules_lexicon.iterator_word_strings_done(state))) {
            if (NIL == removal_modules_lexicon.wsi_entry_iterator_prepared_p(state)) {
                removal_modules_lexicon.wsi_advance_to_next_entry_iterator(state);
            }
            while ((NIL == word) && (NIL != removal_modules_lexicon.wsi_entry_iterator_prepared_p(state))) {
                final SubLObject current_entry = iteration_next(removal_modules_lexicon.removal_wsi_state_entry_iterator(state));
                final SubLObject speech_part_predicate = removal_modules_lexicon.removal_wsi_state_speech_part_predicate(state);
                if ((NIL != nl_trie_word_p(current_entry, UNPROVIDED)) && (NIL != nl_trie_word_head_onlyP(current_entry))) {
                    thread.resetMultipleValues();
                    final SubLObject entry_pred = nl_trie_word_pred_and_supports_for_pred(current_entry, speech_part_predicate, UNPROVIDED);
                    final SubLObject supports = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == entry_pred) {
                        continue;
                    }
                    final SubLObject current_word = nl_trie_word_word_unit(current_entry, NIL);
                    final SubLObject string = nl_trie_entry_string(current_entry);
                    if (NIL == removal_modules_lexicon.wsi_current_word_and_string_unifyP(state, current_word, string)) {
                        continue;
                    }
                    word = current_word;
                    supported_string = cons(string, supports);
                }
            } 
        } 
        return values(NIL != word ? list(removal_modules_lexicon.removal_wsi_state_speech_part_predicate(state), word, supported_string) : NIL, state, sublisp_null(word));
    }

    public static final SubLObject removal_word_strings_unify_arg1_and_arg2_iterator_alt(SubLObject asent) {
        {
            SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject speech_part_predicate = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            speech_part_predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt56);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt56);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject trie_iterator = nl_trie.new_nl_trie_iterator(UNPROVIDED);
                    SubLObject state = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_removal_word_strings_iterator_state(list($TRIE_ITERATOR, trie_iterator, $SPEECH_PART_PREDICATE, speech_part_predicate, $ARG1, arg1, $ARG2, arg2));
                    return iteration.new_iterator(state, symbol_function(ITERATOR_WORD_STRINGS_DONE), symbol_function(ITERATOR_WORD_STRINGS_NEXT), UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt56);
            }
        }
        return NIL;
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_iterator(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = formula_terms(asent, UNPROVIDED);
        SubLObject speech_part_predicate = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list63);
        speech_part_predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list63);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list63);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject trie_iterator = new_nl_trie_iterator(UNPROVIDED);
            final SubLObject state = removal_modules_lexicon.make_removal_word_strings_iterator_state(list($TRIE_ITERATOR, trie_iterator, removal_modules_lexicon.$SPEECH_PART_PREDICATE, speech_part_predicate, $ARG1, arg1, $ARG2, arg2));
            return new_iterator(state, symbol_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_DONE), symbol_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_NEXT), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, removal_modules_lexicon.$list63);
        return NIL;
    }

    public static final SubLObject removal_word_strings_unify_arg1_and_arg2_supports_alt(SubLObject input) {
        return second(input).rest();
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_supports(final SubLObject input) {
        return second(input).rest();
    }

    public static final SubLObject removal_word_strings_unify_arg1_and_arg2_output_asent_alt(SubLObject predicate, SubLObject word, SubLObject supported_string) {
        {
            SubLObject datum = supported_string;
            SubLObject current = datum;
            SubLObject string = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            string = current.first();
            current = current.rest();
            supports = current;
            return make_binary_formula(predicate, word, string);
        }
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_output_asent(final SubLObject predicate, final SubLObject word, final SubLObject supported_string) {
        SubLObject string = NIL;
        SubLObject supports = NIL;
        destructuring_bind_must_consp(supported_string, supported_string, removal_modules_lexicon.$list66);
        string = supported_string.first();
        final SubLObject current = supports = supported_string.rest();
        return make_binary_formula(predicate, word, string);
    }

    public static final SubLObject set_up_removal_support_for_speech_part_predicate_alt(SubLObject spp) {
        inference_modules.register_solely_specific_removal_module_predicate(spp);
        {
            SubLObject cdolist_list_var = $list_alt61;
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                inference_modules.inference_removal_module_use_generic(spp, module);
            }
        }
        return spp;
    }

    public static SubLObject set_up_removal_support_for_speech_part_predicate(final SubLObject spp) {
        register_solely_specific_removal_module_predicate(spp);
        SubLObject cdolist_list_var = removal_modules_lexicon.$list68;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_removal_module_use_generic(spp, module);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return spp;
    }

    public static final SubLObject removal_word_forms_check_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject num_asserted = kb_indexing.relevant_num_gaf_arg_index(word, ONE_INTEGER, pred);
            SubLObject num_rules = kb_indexing.relevant_num_gaf_arg_index(pred, ONE_INTEGER, $$regularSuffix);
            return add(num_asserted, multiply(num_rules, $avg_suffix_expansion_cost$.getGlobalValue()));
        }
    }

    public static SubLObject removal_word_forms_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject num_asserted = relevant_num_gaf_arg_index(word, ONE_INTEGER, pred);
        final SubLObject num_rules = relevant_num_gaf_arg_index(pred, ONE_INTEGER, removal_modules_lexicon.$$regularSuffix);
        return add(num_asserted, multiply(num_rules, removal_modules_lexicon.$avg_suffix_expansion_cost$.getGlobalValue()));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject removal_word_forms_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, NIL, UNPROVIDED);
                SubLObject foundP = NIL;
                if (NIL == gafs) {
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                        try {
                            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.inference_relevant_mt(), thread);
                            {
                                SubLObject words = lexicon_accessors.words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != subl_promotions.memberP(word, words, symbol_function(EQUAL), UNPROVIDED)) {
                                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_word_strings_support(make_binary_formula(pred, word, string)), UNPROVIDED, UNPROVIDED);
                                    foundP = T;
                                }
                            }
                        } finally {
                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = gafs;
                        SubLObject gaf = NIL;
                        for (gaf = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                            if (NIL != Strings.stringE(string, assertions_high.gaf_arg2(gaf), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                foundP = T;
                                backward.removal_add_node(gaf, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject removal_word_forms_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject gafs = gather_gaf_arg_index(word, ONE_INTEGER, pred, NIL, UNPROVIDED);
        SubLObject foundP = NIL;
        if (NIL == gafs) {
            final SubLObject _prev_bind_0 = $lexicon_lookup_mt$.currentBinding(thread);
            try {
                $lexicon_lookup_mt$.bind(inference_relevant_mt(), thread);
                final SubLObject words = words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != memberP(word, words, symbol_function(EQUAL), UNPROVIDED)) {
                    removal_add_node(removal_modules_lexicon.make_word_strings_support(make_binary_formula(pred, word, string)), UNPROVIDED, UNPROVIDED);
                    foundP = T;
                }
            } finally {
                $lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == foundP) {
            SubLObject csome_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != cycl_string.cycl_stringE(string, gaf_arg2(gaf))) {
                    foundP = T;
                    removal_add_node(gaf, UNPROVIDED, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject removal_word_forms_unify_arg1_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_unify_arg1_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            return multiply(TWO_INTEGER, length(lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject removal_word_forms_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        return multiply(TWO_INTEGER, length(words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject removal_word_forms_unify_arg1_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    {
                        SubLObject results = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                        SubLObject cdolist_list_var_19 = results;
                        SubLObject result = NIL;
                        for (result = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , result = cdolist_list_var_19.first()) {
                            {
                                SubLObject lexicon_string = result.first();
                                if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject word_binding = unification_utilities.term_unify(arg1, word, T, T);
                                        SubLObject unify_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != word_binding) {
                                            backward.removal_add_node(cadr(result), word_binding, append(cddr(result), unify_justification));
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

    public static SubLObject removal_word_forms_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17;
            final SubLObject results = cdolist_list_var_$17 = strings_of_word_unit_with_supports(word, list(pred));
            SubLObject result = NIL;
            result = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                final SubLObject lexicon_string = result.first();
                if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject word_binding = term_unify(arg1, word, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != word_binding) {
                        removal_add_node(cadr(result), word_binding, append(cddr(result), unify_justification));
                    }
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                result = cdolist_list_var_$17.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_word_forms_unify_arg2_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
            SubLObject ans = ZERO_INTEGER;
            SubLObject cdolist_list_var = pos_list;
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                ans = add(ans, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED));
            }
            return multiply(TWO_INTEGER, ans);
        }
    }

    public static SubLObject removal_word_forms_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = pos_of_word(word, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = add(ans, num_gaf_arg_index(pos, ONE_INTEGER, removal_modules_lexicon.$$speechPartPreds, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return multiply(TWO_INTEGER, ans);
    }

    public static final SubLObject removal_word_forms_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject cdolist_list_var = pos_list;
                SubLObject pos = NIL;
                for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_20 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , pred = cdolist_list_var_20.first()) {
                            {
                                SubLObject results = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                                SubLObject cdolist_list_var_21 = results;
                                SubLObject result = NIL;
                                for (result = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , result = cdolist_list_var_21.first()) {
                                    {
                                        SubLObject lexicon_string = result.first();
                                        if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings = unification_utilities.term_unify(pred, arg2, T, T);
                                                SubLObject unify_justification = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    backward.removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
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
            return NIL;
        }
    }

    public static SubLObject removal_word_forms_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = pos_of_word(word, UNPROVIDED);
        final SubLObject arg2 = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = preds_of_pos(pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                SubLObject cdolist_list_var_$19;
                final SubLObject results = cdolist_list_var_$19 = strings_of_word_unit_with_supports(word, list(pred));
                SubLObject result = NIL;
                result = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    final SubLObject lexicon_string = result.first();
                    if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = term_unify(pred, arg2, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
                        }
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    result = cdolist_list_var_$19.first();
                } 
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                pred = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_word_forms_unify_arg3_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg3_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_unify_arg3_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return multiply(TWO_INTEGER, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.removal_word_forms_check_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_word_forms_unify_arg3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return multiply(TWO_INTEGER, removal_modules_lexicon.removal_word_forms_check_cost(asent, UNPROVIDED));
    }

    public static final SubLObject removal_word_forms_unify_arg3_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject results = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    {
                        SubLObject string = result.first();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(string, arg3, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_word_forms_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = strings_of_word_unit_with_supports(word, list(pred));
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = result.first();
            thread.resetMultipleValues();
            final SubLObject v_bindings = term_unify(string, arg3, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_word_forms_unify_args_1_and_2_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_unify_args_1_and_2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            SubLObject ans = ZERO_INTEGER;
            SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject word = NIL;
            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                {
                    SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
                    SubLObject cdolist_list_var_22 = pos_list;
                    SubLObject pos = NIL;
                    for (pos = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , pos = cdolist_list_var_22.first()) {
                        ans = add(ans, multiply(TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED)));
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20;
            final SubLObject pos_list = cdolist_list_var_$20 = pos_of_word(word, UNPROVIDED);
            SubLObject pos = NIL;
            pos = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                ans = add(ans, multiply(TWO_INTEGER, num_gaf_arg_index(pos, ONE_INTEGER, removal_modules_lexicon.$$speechPartPreds, UNPROVIDED)));
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                pos = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject removal_word_forms_unify_args_1_and_2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject word_binding = unification_utilities.term_unify(word, arg1, T, T);
                        SubLObject word_unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != word_binding) {
                            {
                                SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
                                SubLObject cdolist_list_var_23 = pos_list;
                                SubLObject pos = NIL;
                                for (pos = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , pos = cdolist_list_var_23.first()) {
                                    {
                                        SubLObject cdolist_list_var_24 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                                        SubLObject pred = NIL;
                                        for (pred = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , pred = cdolist_list_var_24.first()) {
                                            {
                                                SubLObject results = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                                                SubLObject cdolist_list_var_25 = results;
                                                SubLObject result = NIL;
                                                for (result = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , result = cdolist_list_var_25.first()) {
                                                    {
                                                        SubLObject lexicon_string = result.first();
                                                        if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, T, T);
                                                                SubLObject pred_unify_justification = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != pred_binding) {
                                                                    backward.removal_add_node(cadr(result), append(word_binding, pred_binding), append(cddr(result), word_unify_justification, pred_unify_justification));
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
            return NIL;
        }
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject word_binding = term_unify(word, arg1, T, T);
            final SubLObject word_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != word_binding) {
                SubLObject cdolist_list_var_$21;
                final SubLObject pos_list = cdolist_list_var_$21 = pos_of_word(word, UNPROVIDED);
                SubLObject pos = NIL;
                pos = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    SubLObject cdolist_list_var_$22 = preds_of_pos(pos, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        SubLObject cdolist_list_var_$23;
                        final SubLObject results = cdolist_list_var_$23 = strings_of_word_unit_with_supports(word, list(pred));
                        SubLObject result = NIL;
                        result = cdolist_list_var_$23.first();
                        while (NIL != cdolist_list_var_$23) {
                            final SubLObject lexicon_string = result.first();
                            if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                thread.resetMultipleValues();
                                final SubLObject pred_binding = term_unify(pred, arg2, T, T);
                                final SubLObject pred_unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != pred_binding) {
                                    removal_add_node(cadr(result), append(word_binding, pred_binding), append(cddr(result), word_unify_justification, pred_unify_justification));
                                }
                            }
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            result = cdolist_list_var_$23.first();
                        } 
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        pred = cdolist_list_var_$22.first();
                    } 
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    pos = cdolist_list_var_$21.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_word_forms_unify_args_2_and_3_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject removal_word_forms_unify_args_2_and_3_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
            SubLObject ans = ZERO_INTEGER;
            SubLObject cdolist_list_var = pos_list;
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                ans = add(ans, multiply(TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED)));
            }
            return ans;
        }
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = pos_of_word(word, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = add(ans, multiply(TWO_INTEGER, num_gaf_arg_index(pos, ONE_INTEGER, removal_modules_lexicon.$$speechPartPreds, UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject removal_word_forms_unify_args_2_and_3_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject cdolist_list_var = pos_list;
                SubLObject pos = NIL;
                for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_26 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , pred = cdolist_list_var_26.first()) {
                            {
                                SubLObject results = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                                SubLObject cdolist_list_var_27 = results;
                                SubLObject result = NIL;
                                for (result = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , result = cdolist_list_var_27.first()) {
                                    {
                                        SubLObject lexicon_string = result.first();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, T, T);
                                            SubLObject pred_unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != pred_binding) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject string_binding = unification_utilities.term_unify(lexicon_string, arg3, T, T);
                                                    SubLObject string_unify_justification = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != string_binding) {
                                                        backward.removal_add_node(cadr(result), append(pred_binding, string_binding), append(cddr(result), pred_unify_justification, string_unify_justification));
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
            return NIL;
        }
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = pos_of_word(word, UNPROVIDED);
        final SubLObject arg2 = atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = preds_of_pos(pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                SubLObject cdolist_list_var_$25;
                final SubLObject results = cdolist_list_var_$25 = strings_of_word_unit_with_supports(word, list(pred));
                SubLObject result = NIL;
                result = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    final SubLObject lexicon_string = result.first();
                    thread.resetMultipleValues();
                    final SubLObject pred_binding = term_unify(pred, arg2, T, T);
                    final SubLObject pred_unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pred_binding) {
                        thread.resetMultipleValues();
                        final SubLObject string_binding = term_unify(lexicon_string, arg3, T, T);
                        final SubLObject string_unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != string_binding) {
                            removal_add_node(cadr(result), append(pred_binding, string_binding), append(cddr(result), pred_unify_justification, string_unify_justification));
                        }
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    result = cdolist_list_var_$25.first();
                } 
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                pred = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject hl_verify_term_phrases_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.non_empty_list_p(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.hl_justify_term_phrases(support))) {
                return T;
            } else {
                if ($$termStrings == arguments.support_sentence_operator(support)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.destructure_term_phrases_support(support);
                        SubLObject string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject ans = NIL;
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    ans = makeBoolean((NIL == forts.fort_p(v_term)) && (NIL != ($TRUE == arguments.support_truth(support) ? ((SubLObject) (removal_modules_term_strings.removal_term_strings_check_pos_output_check(v_term, string))) : removal_modules_term_strings.removal_term_strings_check_neg_output_check(v_term, string))));
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return ans;
                        }
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.lexical_only_term_phrases_asent_p(arguments.support_sentence(support))) {
                        {
                            SubLObject ans = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.destructure_term_phrases_support(support);
                                SubLObject string = thread.secondMultipleValue();
                                SubLObject constraint = thread.thirdMultipleValue();
                                SubLObject case_insensitiveP = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject parsed_terms = psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP);
                                                ans = ($TRUE == arguments.support_truth(support)) ? ((SubLObject) (list_utilities.member_equalP(v_term, parsed_terms))) : makeBoolean(NIL == list_utilities.member_equalP(v_term, parsed_terms));
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            return ans;
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject hl_verify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != non_empty_list_p(removal_modules_lexicon.hl_justify_term_phrases(support))) {
            return T;
        }
        if (removal_modules_lexicon.$$termStrings.eql(support_sentence_operator(support))) {
            thread.resetMultipleValues();
            final SubLObject v_term = removal_modules_lexicon.destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject ans = NIL;
            final SubLObject mt_var = with_inference_mt_relevance_validate(support_mt(support));
            final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = makeBoolean((NIL == fort_p(v_term)) && (NIL != ($TRUE == support_truth(support) ? removal_modules_term_strings.removal_term_strings_check_pos_output_check(v_term, string) : removal_modules_term_strings.removal_term_strings_check_neg_output_check(v_term, string))));
            } finally {
                $relevant_mts$.rebind(_prev_bind_3, thread);
                $relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        if (NIL == removal_modules_lexicon.lexical_only_term_phrases_asent_p(support_sentence(support))) {
            SubLObject ans2 = NIL;
            thread.resetMultipleValues();
            final SubLObject v_term2 = removal_modules_lexicon.destructure_term_phrases_support(support);
            final SubLObject string2 = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var2 = with_inference_mt_relevance_validate(support_mt(support));
            final SubLObject _prev_bind_4 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $relevant_mts$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var2), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var2), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var2), thread);
                final SubLObject parsed_terms = inference_ps_get_cycls_for_phrase(string2, constraint, case_insensitiveP);
                ans2 = ($TRUE == support_truth(support)) ? member_equalP(v_term2, parsed_terms) : makeBoolean(NIL == member_equalP(v_term2, parsed_terms));
            } finally {
                $relevant_mts$.rebind(_prev_bind_6, thread);
                $relevant_mt_function$.rebind(_prev_bind_5, thread);
                $mt$.rebind(_prev_bind_4, thread);
            }
            return ans2;
        }
        return NIL;
    }

    public static final SubLObject hl_justify_term_phrases_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = arguments.support_mt(support);
                SubLObject supports = NIL;
                if ($TRUE == arguments.support_truth(support)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.destructure_term_phrases_support(support);
                        SubLObject string = thread.secondMultipleValue();
                        SubLObject constraint = thread.thirdMultipleValue();
                        SubLObject case_insensitiveP = thread.fourthMultipleValue();
                        SubLObject lexical_onlyP = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
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
                                    supports = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.get_term_phrases_supports(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject hl_justify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = support_mt(support);
        SubLObject supports = NIL;
        if ($TRUE == support_truth(support)) {
            thread.resetMultipleValues();
            final SubLObject v_term = removal_modules_lexicon.destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            final SubLObject lexical_onlyP = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                supports = removal_modules_lexicon.get_term_phrases_supports(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
            } finally {
                $relevant_mts$.rebind(_prev_bind_3, thread);
                $relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mt$.rebind(_prev_bind_0, thread);
            }
        }
        return supports;
    }

    public static final SubLObject destructure_term_phrases_support_alt(SubLObject support) {
        {
            SubLObject asent = arguments.support_sentence(support);
            SubLObject case_insensitiveP = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent);
            SubLObject lexical_onlyP = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
            SubLObject v_term = NIL;
            SubLObject string = NIL;
            SubLObject constraint = NIL;
            SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (((pcase_var.eql($$termPhrases) || pcase_var.eql($$termPhrases_Lexical)) || pcase_var.eql($$termPhrases_CaseInsensitive)) || pcase_var.eql($const83$termPhrases_CaseInsensitive_Lexic)) {
                {
                    SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                    v_term = datum_evaluated_var.first();
                    constraint = cadr(datum_evaluated_var);
                    string = cddr(datum_evaluated_var).first();
                }
            } else {
                if (pcase_var.eql($$termStrings)) {
                    {
                        SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                        v_term = datum_evaluated_var.first();
                        string = cadr(datum_evaluated_var);
                    }
                    constraint = $$CharacterString;
                }
            }
            return values(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
        }
    }

    public static SubLObject destructure_term_phrases_support(final SubLObject support) {
        final SubLObject asent = support_sentence(support);
        final SubLObject case_insensitiveP = removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent);
        final SubLObject lexical_onlyP = removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
        SubLObject v_term = NIL;
        SubLObject string = NIL;
        SubLObject constraint = NIL;
        final SubLObject pcase_var = atomic_sentence_predicate(asent);
        if (((pcase_var.eql(removal_modules_lexicon.$$termPhrases) || pcase_var.eql(removal_modules_lexicon.$$termPhrases_Lexical)) || pcase_var.eql(removal_modules_lexicon.$$termPhrases_CaseInsensitive)) || pcase_var.eql(removal_modules_lexicon.$const90$termPhrases_CaseInsensitive_Lexic)) {
            final SubLObject datum_evaluated_var = atomic_sentence_args(asent, UNPROVIDED);
            v_term = datum_evaluated_var.first();
            constraint = cadr(datum_evaluated_var);
            string = cddr(datum_evaluated_var).first();
        } else
            if (pcase_var.eql(removal_modules_lexicon.$$termStrings)) {
                final SubLObject datum_evaluated_var = atomic_sentence_args(asent, UNPROVIDED);
                v_term = datum_evaluated_var.first();
                string = cadr(datum_evaluated_var);
                constraint = removal_modules_lexicon.$$CharacterString;
            }

        return values(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
    }

    public static final SubLObject hl_forward_mt_combos_term_phrases_alt(SubLObject support) {
        {
            SubLObject meta_supports = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.hl_justify_term_phrases(support);
            SubLObject mts = NIL;
            SubLObject supports = NIL;
            {
                SubLObject cdolist_list_var = meta_supports;
                SubLObject meta_support = NIL;
                for (meta_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_support = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(meta_support)) {
                        {
                            SubLObject item_var = assertions_high.assertion_mt(meta_support);
                            if (NIL == member(item_var, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                mts = cons(item_var, mts);
                            }
                        }
                    } else {
                        if (NIL != arguments.hl_support_p(meta_support)) {
                            {
                                SubLObject cdolist_list_var_28 = hl_supports.hl_forward_mt_combos(meta_support);
                                SubLObject meta_meta_support = NIL;
                                for (meta_meta_support = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , meta_meta_support = cdolist_list_var_28.first()) {
                                    {
                                        SubLObject item_var = arguments.support_mt(meta_meta_support);
                                        if (NIL == member(item_var, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            mts = cons(item_var, mts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject el_sentence = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt85);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                el_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject cdolist_list_var = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
                        SubLObject mt_29 = NIL;
                        for (mt_29 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_29 = cdolist_list_var.first()) {
                            supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_29, tv), supports);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt85);
                }
            }
            return supports;
        }
    }

    public static SubLObject hl_forward_mt_combos_term_phrases(final SubLObject support) {
        final SubLObject meta_supports = removal_modules_lexicon.hl_justify_term_phrases(support);
        SubLObject mts = NIL;
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = meta_supports;
        SubLObject meta_support = NIL;
        meta_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_p(meta_support)) {
                final SubLObject item_var = assertion_mt(meta_support);
                if (NIL == member(item_var, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
            } else
                if (NIL != hl_support_p(meta_support)) {
                    SubLObject cdolist_list_var_$26 = hl_forward_mt_combos(meta_support);
                    SubLObject meta_meta_support = NIL;
                    meta_meta_support = cdolist_list_var_$26.first();
                    while (NIL != cdolist_list_var_$26) {
                        final SubLObject item_var2 = support_mt(meta_meta_support);
                        if (NIL == member(item_var2, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            mts = cons(item_var2, mts);
                        }
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        meta_meta_support = cdolist_list_var_$26.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        } 
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, removal_modules_lexicon.$list92);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list92);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list92);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, removal_modules_lexicon.$list92);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var2 = max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
            SubLObject mt_$27 = NIL;
            mt_$27 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                supports = cons(make_hl_support(hl_module, el_sentence, mt_$27, tv), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$27 = cdolist_list_var2.first();
            } 
        } else {
            cdestructuring_bind_error(support, removal_modules_lexicon.$list92);
        }
        return supports;
    }

    public static final SubLObject supports_have_predsP_alt(SubLObject supports, SubLObject preds) {
        return list_utilities.sets_equalP(preds, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.get_supports_preds(supports), UNPROVIDED);
    }

    public static SubLObject supports_have_predsP(final SubLObject supports, final SubLObject preds) {
        return sets_equalP(preds, removal_modules_lexicon.get_supports_preds(supports), UNPROVIDED);
    }

    public static final SubLObject get_supports_preds_alt(SubLObject supports) {
        return Mapping.mapcar(SUPPORT_SENTENCE_OPERATOR, supports);
    }

    public static SubLObject get_supports_preds(final SubLObject supports) {
        return Mapping.mapcar(removal_modules_lexicon.SUPPORT_SENTENCE_OPERATOR, supports);
    }

    public static final SubLObject hl_verify_and_justify_term_phrases_alt(SubLObject support) {
        {
            SubLObject narty_support = narts_high.nart_substitute(support);
            return NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.hl_verify_term_phrases(narty_support) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.hl_justify_term_phrases(narty_support))) : NIL;
        }
    }

    public static SubLObject hl_verify_and_justify_term_phrases(final SubLObject support) {
        final SubLObject narty_support = nart_substitute(support);
        return NIL != removal_modules_lexicon.hl_verify_term_phrases(narty_support) ? removal_modules_lexicon.hl_justify_term_phrases(narty_support) : NIL;
    }

    public static final SubLObject removal_term_phrases_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_term_phrases_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static final SubLObject get_term_phrases_supports_alt(SubLObject denot, SubLObject string, SubLObject constraint, SubLObject case_insensitiveP, SubLObject lexical_onlyP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = nl_trie_accessors.nl_trie_get_term_phrases_supports(denot, string, constraint, case_insensitiveP, mt_relevance_macros.$mt$.getDynamicValue(thread));
                SubLObject pos = NIL;
                SubLObject pos_pred = NIL;
                if (!((NIL != supports) || (NIL != lexical_onlyP))) {
                    supports = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.get_non_lexical_term_phrases_supports(denot, string, constraint, case_insensitiveP);
                }
                if (NIL != supports) {
                    {
                        SubLObject pos_pred_support = find_if($sym98$SPEECH_PART_PRED_, supports, SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                        if (NIL != pos_pred_support) {
                            pos_pred = arguments.support_sentence_operator(pos_pred_support);
                        }
                    }
                    if (NIL == pos_pred) {
                        {
                            SubLObject pos_pred_support = find($$abbreviationForLexicalWord, supports, symbol_function(EQL), SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                            if (NIL != pos_pred_support) {
                                pos_pred = cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(pos_pred_support), UNPROVIDED);
                            }
                        }
                    }
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_utilities.preds_to_pos_args()));
                        while (!((NIL != pos) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject pos_arg = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject pos_support = find(pred, supports, symbol_function(EQUAL), SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                                    if (NIL != pos_support) {
                                        pos = cycl_utilities.atomic_sentence_arg(arguments.support_sentence(pos_support), pos_arg, UNPROVIDED);
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    if ((NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) && (!pos.equal(constraint))) {
                        {
                            SubLObject cdolist_list_var = backward.removal_ask_justifications(list($$genls, pos, constraint), mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list_alt102).first();
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = support;
                                    if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                                        supports = cons(item_var, supports);
                                    }
                                }
                            }
                        }
                    }
                }
                if ((NIL != pos) && (NIL != pos_pred)) {
                    if (NIL == member($$speechPartPreds, supports, symbol_function(EQL), SUPPORT_SENTENCE_OPERATOR)) {
                        {
                            SubLObject cdolist_list_var = backward.removal_ask_justifications(list($$speechPartPreds, pos, pos_pred), mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list_alt102).first();
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = support;
                                    if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                                        supports = cons(item_var, supports);
                                    }
                                }
                            }
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, SubLObject case_insensitiveP, SubLObject lexical_onlyP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = remove_if_not(SUPPORT_P, nl_trie_get_term_phrases_supports(denot, string, constraint, case_insensitiveP, $mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pos = NIL;
        SubLObject pos_pred = NIL;
        if ((NIL == supports) && (NIL == lexical_onlyP)) {
            supports = removal_modules_lexicon.get_non_lexical_term_phrases_supports(denot, string, constraint, case_insensitiveP);
        }
        if (NIL != supports) {
            SubLObject pos_pred_support = find_if(removal_modules_lexicon.$sym105$SPEECH_PART_PRED_, supports, removal_modules_lexicon.SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
            if (NIL != pos_pred_support) {
                pos_pred = support_sentence_operator(pos_pred_support);
            }
            if (NIL == pos_pred) {
                pos_pred_support = find(removal_modules_lexicon.$$abbreviationForLexicalWord, supports, symbol_function(EQL), removal_modules_lexicon.SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                if (NIL != pos_pred_support) {
                    pos_pred = atomic_sentence_arg2(support_sentence(pos_pred_support), UNPROVIDED);
                }
            }
            SubLObject iteration_state;
            for (iteration_state = do_dictionary_contents_state(dictionary_contents(preds_to_pos_args())); (NIL == pos) && (NIL == do_dictionary_contents_doneP(iteration_state)); iteration_state = do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = do_dictionary_contents_key_value(iteration_state);
                final SubLObject pos_arg = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pos_support = find(pred, supports, symbol_function(EQUAL), removal_modules_lexicon.SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                if (NIL != pos_support) {
                    pos = atomic_sentence_arg(support_sentence(pos_support), pos_arg, UNPROVIDED);
                }
            }
            do_dictionary_contents_finalize(iteration_state);
            if ((NIL != speech_partP(constraint, UNPROVIDED)) && (!pos.equal(constraint))) {
                SubLObject cdolist_list_var = removal_ask_justifications(list(removal_modules_lexicon.$$genls, pos, constraint), $mt$.getDynamicValue(thread), $TRUE, removal_modules_lexicon.$list109).first();
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                        supports = cons(item_var, supports);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
        }
        if (((NIL != pos) && (NIL != pos_pred)) && (NIL == member(removal_modules_lexicon.$$speechPartPreds, supports, symbol_function(EQL), removal_modules_lexicon.SUPPORT_SENTENCE_OPERATOR))) {
            SubLObject cdolist_list_var = removal_ask_justifications(list(removal_modules_lexicon.$$speechPartPreds, pos, pos_pred), $mt$.getDynamicValue(thread), $TRUE, removal_modules_lexicon.$list109).first();
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = support;
                if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                    supports = cons(item_var, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return supports;
    }

    public static final SubLObject get_non_lexical_term_phrases_supports_alt(SubLObject denot, SubLObject string, SubLObject constraint, SubLObject case_insensitiveP) {
        {
            SubLObject supports = NIL;
            supports = psp_main.psp_hl_justify_parse(string, constraint, denot, case_insensitiveP);
            if (NIL != list_utilities.empty_list_p(supports)) {
                {
                    SubLObject cdolist_list_var = pph_methods_lexicon.hl_justify_string_for_term(denot, string, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(constraint), case_insensitiveP);
                    SubLObject support = NIL;
                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                        if (NIL == formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), list($list_alt103, denot, constraint, string))) {
                            supports = cons(support, supports);
                        }
                    }
                }
            }
            return supports;
        }
    }

    public static SubLObject get_non_lexical_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, final SubLObject case_insensitiveP) {
        SubLObject supports = NIL;
        if (string.isString()) {
            supports = psp_hl_justify_parse(string, constraint, denot, case_insensitiveP);
        }
        if (NIL != empty_list_p(supports)) {
            SubLObject cdolist_list_var = hl_justify_string_for_term(denot, string, removal_modules_lexicon.preds_from_term_phrases_constraint(constraint), case_insensitiveP);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == formula_matches_pattern(support_sentence(support), list(removal_modules_lexicon.$list110, denot, constraint, string))) {
                    supports = cons(support, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return supports;
    }

    public static final SubLObject do_lexical_gafs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt104);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gaf = NIL;
                    SubLObject v_term = NIL;
                    SubLObject predicate = NIL;
                    SubLObject index_arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    gaf = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    index_arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, list(INDEXED_TERM_P, v_term), listS(DO_GAF_ARG_INDEX, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, $list_alt110 }), append(body, NIL)), listS(DO_GAF_ARG_INDEX_NAUT, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, $list_alt110 }), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt104);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_lexical_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf = NIL;
        SubLObject v_term = NIL;
        SubLObject predicate = NIL;
        SubLObject index_arg = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list111);
        gaf = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list111);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list111);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list111);
        index_arg = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, list(INDEXED_TERM_P, v_term), listS(DO_GAF_ARG_INDEX, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, removal_modules_lexicon.$list117 }), append(body, NIL)), listS(removal_modules_lexicon.DO_GAF_ARG_INDEX_NAUT, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, removal_modules_lexicon.$list117 }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, removal_modules_lexicon.$list111);
        return NIL;
    }

    public static final SubLObject removal_term_phrases_unify_arg3_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            SubLObject constraint = NIL;
            SubLObject arg3 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt112);
            constraint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt112);
            arg3 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject preds = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(constraint);
                    SubLObject lexical_onlyP = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
                    if (NIL != preds) {
                        {
                            SubLObject strings = removal_modules_term_strings.inference_strings_for_term(v_term, preds, lexical_onlyP);
                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(strings, asent, arg3);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt112);
            }
        }
        return NIL;
    }

    public static SubLObject removal_term_phrases_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_term = NIL;
        SubLObject constraint = NIL;
        SubLObject arg3 = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list119);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list119);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list119);
        arg3 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject preds = removal_modules_lexicon.preds_from_term_phrases_constraint(constraint);
            final SubLObject lexical_onlyP = removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
            if (NIL != preds) {
                final SubLObject strings = removal_modules_term_strings.inference_strings_for_term(v_term, preds, lexical_onlyP);
                removal_modules_lexicon.add_term_phrases_removal_nodes(strings, asent, arg3);
            }
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list119);
        }
        return NIL;
    }

    public static final SubLObject add_term_phrases_removal_nodes_alt(SubLObject values, SubLObject asent, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = values;
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent)) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.term_unify_case_insensitive(value, target, T, T))) : unification_utilities.term_unify(value, target, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_term_phrases_support(formula);
                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject add_term_phrases_removal_nodes(final SubLObject values, final SubLObject asent, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = (NIL != removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent)) ? removal_modules_lexicon.term_unify_case_insensitive(value, target, T, T) : term_unify(value, target, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject formula = subst_bindings(v_bindings, asent);
                final SubLObject hl_support = removal_modules_lexicon.make_term_phrases_support(formula);
                removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject make_term_phrases_support_alt(SubLObject formula) {
        return arguments.make_hl_support($TERM_PHRASES, formula, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_term_phrases_support(final SubLObject formula) {
        return make_hl_support($TERM_PHRASES, formula, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject term_unify_case_insensitive_alt(SubLObject value, SubLObject target, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        return unification_utilities.term_unify(value.isString() ? ((SubLObject) (Strings.string_downcase(value, UNPROVIDED, UNPROVIDED))) : value, target.isString() ? ((SubLObject) (Strings.string_downcase(target, UNPROVIDED, UNPROVIDED))) : target, share_vars, justifyP);
    }

    public static SubLObject term_unify_case_insensitive(final SubLObject value, final SubLObject target, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        return term_unify(value.isString() ? Strings.string_downcase(value, UNPROVIDED, UNPROVIDED) : value, target.isString() ? Strings.string_downcase(target, UNPROVIDED, UNPROVIDED) : target, share_vars, justifyP);
    }

    public static final SubLObject preds_from_term_phrases_constraint_alt(SubLObject constraint) {
        {
            SubLObject preds = NIL;
            if (NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
                preds = lexicon_accessors.all_preds_of_pos(constraint);
            } else {
                if (NIL != lexicon_accessors.speech_part_predP(constraint, UNPROVIDED)) {
                    preds = remove_if(symbol_function($sym114$GENERIC_PRED_), genl_predicates.all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != isa.isaP(constraint, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED)) {
                        preds = list_utilities.remove_if_not($sym116$NAME_STRING_PRED_, genl_predicates.all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (constraint == $$ProperNameString) {
                            preds = list_utilities.remove_if_not($sym116$NAME_STRING_PRED_, kb_mapping_utilities.pred_values($$ProperNameString, $$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (constraint == $$CharacterString) {
                                preds = $ALL;
                            }
                        }
                    }
                }
            }
            if (NIL == lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
                {
                    SubLObject pos_of_cat = lexicon_utilities.pos_of_cat(constraint, UNPROVIDED);
                    if (NIL != pos_of_cat) {
                        {
                            SubLObject items_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(pos_of_cat);
                            if (items_var.isVector()) {
                                {
                                    SubLObject vector_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(pos_of_cat);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length = length(vector_var);
                                    SubLObject v_iteration = NIL;
                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                            SubLObject item = aref(vector_var, element_num);
                                            preds = cons(item, preds);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(pos_of_cat);
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                        preds = cons(item, preds);
                                    }
                                }
                            }
                        }
                        preds = delete_duplicates(preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            if ((preds != $ALL) && (NIL != genls.genlP($$NLWordForm, constraint, UNPROVIDED, UNPROVIDED))) {
                preds = $ALL;
            }
            if ((NIL != genls.genlP($$NounPhrase, constraint, UNPROVIDED, UNPROVIDED)) && preds.isList()) {
                preds = append(preds, list_utilities.remove_if_not($sym116$NAME_STRING_PRED_, kb_mapping_utilities.pred_values($$ProperNameString, $$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                preds = append(preds, genl_predicates.all_spec_preds($$nonSingular_Generic, UNPROVIDED, UNPROVIDED));
            }
            return preds;
        }
    }

    public static SubLObject preds_from_term_phrases_constraint(final SubLObject constraint) {
        SubLObject preds = NIL;
        if (NIL != speech_partP(constraint, UNPROVIDED)) {
            preds = all_preds_of_pos(constraint);
        } else
            if (NIL != speech_part_predP(constraint, UNPROVIDED)) {
                preds = remove_if(symbol_function(removal_modules_lexicon.$sym121$GENERIC_PRED_), all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != isaP(constraint, removal_modules_lexicon.$$StringIndexingSlot, UNPROVIDED, UNPROVIDED)) {
                    preds = remove_if_not(removal_modules_lexicon.$sym123$NAME_STRING_PRED_, all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (constraint.eql(removal_modules_lexicon.$$ProperNameString)) {
                        preds = remove_if_not(removal_modules_lexicon.$sym123$NAME_STRING_PRED_, pred_values(removal_modules_lexicon.$$ProperNameString, removal_modules_lexicon.$$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (constraint.eql(removal_modules_lexicon.$$CharacterString)) {
                            preds = $ALL;
                        }




        if (NIL == speech_partP(constraint, UNPROVIDED)) {
            final SubLObject pos_of_cat = pos_of_cat(constraint, UNPROVIDED);
            if (NIL != pos_of_cat) {
                final SubLObject items_var = removal_modules_lexicon.preds_from_term_phrases_constraint(pos_of_cat);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        preds = cons(item, preds);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preds = cons(item2, preds);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                preds = delete_duplicates(preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if ((preds != $ALL) && (NIL != genlP(removal_modules_lexicon.$$NLWordForm, constraint, UNPROVIDED, UNPROVIDED))) {
            preds = $ALL;
        }
        if ((NIL != genlP(removal_modules_lexicon.$$NounPhrase, constraint, UNPROVIDED, UNPROVIDED)) && preds.isList()) {
            preds = append(preds, remove_if_not(removal_modules_lexicon.$sym123$NAME_STRING_PRED_, pred_values(removal_modules_lexicon.$$ProperNameString, removal_modules_lexicon.$$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            preds = append(preds, all_spec_preds(removal_modules_lexicon.$$nonSingular_Generic, UNPROVIDED, UNPROVIDED));
        }
        return preds;
    }

    public static final SubLObject generic_predP_alt(SubLObject pred) {
        return isa.isaP(pred, $$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generic_predP(final SubLObject pred) {
        return isaP(pred, removal_modules_lexicon.$$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_term_phrases_unify_arg1_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject arg1 = NIL;
                SubLObject constraint = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt140);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt140);
                constraint = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt140);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject preds = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.preds_from_term_phrases_constraint(constraint);
                        SubLObject case_insensitiveP = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent);
                        SubLObject lexical_onlyP = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
                        {
                            SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                            try {
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == case_insensitiveP ? ((SubLObject) ($ON)) : $OFF, thread);
                                if (preds.isList()) {
                                    {
                                        SubLObject found_oneP = NIL;
                                        SubLObject support_sentence = copy_expression(asent);
                                        SubLObject no_lexical_denotsP = NIL;
                                        {
                                            SubLObject _prev_bind_0_30 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                                            try {
                                                lexicon_vars.$parse_morphologically$.bind($NEVER, thread);
                                                {
                                                    SubLObject cdolist_list_var = preds;
                                                    SubLObject pred = NIL;
                                                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject denots = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.inference_denots_of_stringXpred(string, pred);
                                                            if (NIL != denots) {
                                                                found_oneP = T;
                                                                support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                                                            }
                                                        }
                                                    }
                                                    no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                                                }
                                            } finally {
                                                lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                        if (NIL != no_lexical_denotsP) {
                                            {
                                                SubLObject _prev_bind_0_31 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                                                try {
                                                    lexicon_vars.$parse_morphologically$.bind($ONLY, thread);
                                                    {
                                                        SubLObject cdolist_list_var = preds;
                                                        SubLObject pred = NIL;
                                                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject denots = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.inference_denots_of_stringXpred(string, pred);
                                                                if (NIL != denots) {
                                                                    found_oneP = T;
                                                                    support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                                                                }
                                                            }
                                                        }
                                                        no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                                                    }
                                                } finally {
                                                    lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_31, thread);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.inference_denots_of_string(string), asent, arg1);
                                }
                            } finally {
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == lexical_onlyP) {
                            {
                                SubLObject timed_outP = NIL;
                                if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                                    {
                                        SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                        try {
                                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                                            }
                                            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                        } finally {
                                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                                    timed_outP = NIL;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt140);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_term_phrases_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject constraint = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list147);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list147);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list147);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject preds = removal_modules_lexicon.preds_from_term_phrases_constraint(constraint);
            final SubLObject case_insensitiveP = removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent);
            final SubLObject lexical_onlyP = removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent);
            final SubLObject _prev_bind_0 = $nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                $nl_trie_accessor_default_case_sensitivity$.bind(NIL == case_insensitiveP ? $ON : $OFF, thread);
                if (preds.isList()) {
                    SubLObject found_oneP = NIL;
                    SubLObject support_sentence = copy_expression(asent);
                    SubLObject no_lexical_denotsP = NIL;
                    final SubLObject _prev_bind_0_$28 = $parse_morphologically$.currentBinding(thread);
                    try {
                        $parse_morphologically$.bind($NEVER, thread);
                        SubLObject cdolist_list_var = preds;
                        SubLObject pred = NIL;
                        pred = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject denots = removal_modules_lexicon.inference_denots_of_stringXpred(string, pred);
                            if (NIL != denots) {
                                found_oneP = T;
                                support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                removal_modules_lexicon.add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pred = cdolist_list_var.first();
                        } 
                        no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                    } finally {
                        $parse_morphologically$.rebind(_prev_bind_0_$28, thread);
                    }
                    if (NIL != no_lexical_denotsP) {
                        final SubLObject _prev_bind_0_$29 = $parse_morphologically$.currentBinding(thread);
                        try {
                            $parse_morphologically$.bind($ONLY, thread);
                            SubLObject cdolist_list_var = preds;
                            SubLObject pred = NIL;
                            pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject denots = removal_modules_lexicon.inference_denots_of_stringXpred(string, pred);
                                if (NIL != denots) {
                                    found_oneP = T;
                                    support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                    removal_modules_lexicon.add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            } 
                            no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                        } finally {
                            $parse_morphologically$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                } else {
                    removal_modules_lexicon.add_term_phrases_removal_nodes(removal_modules_lexicon.inference_denots_of_string(string), asent, arg1);
                }
            } finally {
                $nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
            }
            if (NIL == lexical_onlyP) {
                SubLObject timed_outP = NIL;
                if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_2 = $parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        $parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                        $parsing_timeout_time$.bind(parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        $parsing_timeout_reachedP$.bind($parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        $parsing_timeout_reachedP$.setDynamicValue(parsing_timeout_time_reachedP(), thread);
                        if (NIL == $parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            removal_modules_lexicon.add_term_phrases_removal_nodes(inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                        }
                        timed_outP = parsing_timeout_time_reachedP();
                    } finally {
                        $parsing_timeout_reachedP$.rebind(_prev_bind_4, thread);
                        $parsing_timeout_time$.rebind(_prev_bind_3, thread);
                        $parsing_timeout_time_check_count$.rebind(_prev_bind_2, thread);
                    }
                } else {
                    removal_modules_lexicon.add_term_phrases_removal_nodes(inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                    timed_outP = NIL;
                }
            }
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list147);
        }
        return NIL;
    }

    public static final SubLObject case_insensitive_term_phrases_asent_p_alt(SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), $list_alt145, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject case_insensitive_term_phrases_asent_p(final SubLObject asent) {
        return memberP(atomic_sentence_predicate(asent), removal_modules_lexicon.$list152, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lexical_only_term_phrases_asent_p_alt(SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), $list_alt146, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lexical_only_term_phrases_asent_p(final SubLObject asent) {
        return memberP(atomic_sentence_predicate(asent), removal_modules_lexicon.$list153, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_denots_of_string_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denots = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return denots;
            }
        }
    }

    public static SubLObject inference_denots_of_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        final SubLObject _prev_bind_0 = $lexicon_lookup_mt$.currentBinding(thread);
        try {
            $lexicon_lookup_mt$.bind($mt$.getDynamicValue(thread), thread);
            denots = denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static final SubLObject inference_denots_of_stringXpred_alt(SubLObject string, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denots = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        denots = lexicon_accessors.denots_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return denots;
            }
        }
    }

    public static SubLObject inference_denots_of_stringXpred(final SubLObject string, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        final SubLObject _prev_bind_0 = $lexicon_lookup_mt$.currentBinding(thread);
        try {
            $lexicon_lookup_mt$.bind($mt$.getDynamicValue(thread), thread);
            denots = denots_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static final SubLObject removal_term_phrases_unify_arg1_and_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt151);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt151);
                arg2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt151);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                        try {
                            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent) ? ((SubLObject) ($ON)) : $OFF, thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject pred_lists = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_nodes(asent, denots, pred_lists);
                            }
                        } finally {
                            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_1, thread);
                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent)) {
                        {
                            SubLObject timed_outP = NIL;
                            if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                                {
                                    SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                    try {
                                        parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                        if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                            {
                                                SubLObject cdolist_list_var = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent));
                                                SubLObject pair = NIL;
                                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum_32 = pair;
                                                        SubLObject current_33 = datum_32;
                                                        SubLObject denot = NIL;
                                                        SubLObject pred = NIL;
                                                        destructuring_bind_must_consp(current_33, datum_32, $list_alt152);
                                                        denot = current_33.first();
                                                        current_33 = current_33.rest();
                                                        destructuring_bind_must_consp(current_33, datum_32, $list_alt152);
                                                        pred = current_33.first();
                                                        current_33 = current_33.rest();
                                                        if (NIL == current_33) {
                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot, pred);
                                                        } else {
                                                            cdestructuring_bind_error(datum_32, $list_alt152);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                    } finally {
                                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent));
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum_34 = pair;
                                            SubLObject current_35 = datum_34;
                                            SubLObject denot = NIL;
                                            SubLObject pred = NIL;
                                            destructuring_bind_must_consp(current_35, datum_34, $list_alt152);
                                            denot = current_35.first();
                                            current_35 = current_35.rest();
                                            destructuring_bind_must_consp(current_35, datum_34, $list_alt152);
                                            pred = current_35.first();
                                            current_35 = current_35.rest();
                                            if (NIL == current_35) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot, pred);
                                            } else {
                                                cdestructuring_bind_error(datum_34, $list_alt152);
                                            }
                                        }
                                    }
                                    timed_outP = NIL;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt151);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_term_phrases_unify_arg1_and_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = $lexicon_lookup_mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                $lexicon_lookup_mt$.bind($mt$.getDynamicValue(thread), thread);
                $nl_trie_accessor_default_case_sensitivity$.bind(NIL == removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent) ? $ON : $OFF, thread);
                thread.resetMultipleValues();
                final SubLObject denots = denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pred_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_nodes(asent, denots, pred_lists);
            } finally {
                $nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                $lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL == removal_modules_lexicon.lexical_only_term_phrases_asent_p(asent)) {
                SubLObject timed_outP = NIL;
                if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_3 = $parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        $parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                        $parsing_timeout_time$.bind(parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        $parsing_timeout_reachedP$.bind($parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        $parsing_timeout_reachedP$.setDynamicValue(parsing_timeout_time_reachedP(), thread);
                        if (NIL == $parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            SubLObject cdolist_list_var = inference_ps_get_cycls_and_constraints_for_phrase(string, removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent));
                            SubLObject pair = NIL;
                            pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current_$31;
                                final SubLObject datum_$30 = current_$31 = pair;
                                SubLObject denot = NIL;
                                SubLObject pred = NIL;
                                destructuring_bind_must_consp(current_$31, datum_$30, removal_modules_lexicon.$list159);
                                denot = current_$31.first();
                                current_$31 = current_$31.rest();
                                destructuring_bind_must_consp(current_$31, datum_$30, removal_modules_lexicon.$list159);
                                pred = current_$31.first();
                                current_$31 = current_$31.rest();
                                if (NIL == current_$31) {
                                    removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot, pred);
                                } else {
                                    cdestructuring_bind_error(datum_$30, removal_modules_lexicon.$list159);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            } 
                        }
                        timed_outP = parsing_timeout_time_reachedP();
                    } finally {
                        $parsing_timeout_reachedP$.rebind(_prev_bind_5, thread);
                        $parsing_timeout_time$.rebind(_prev_bind_4, thread);
                        $parsing_timeout_time_check_count$.rebind(_prev_bind_3, thread);
                    }
                } else {
                    SubLObject cdolist_list_var2 = inference_ps_get_cycls_and_constraints_for_phrase(string, removal_modules_lexicon.case_insensitive_term_phrases_asent_p(asent));
                    SubLObject pair2 = NIL;
                    pair2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject current_$32;
                        final SubLObject datum_$31 = current_$32 = pair2;
                        SubLObject denot2 = NIL;
                        SubLObject pred2 = NIL;
                        destructuring_bind_must_consp(current_$32, datum_$31, removal_modules_lexicon.$list159);
                        denot2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        destructuring_bind_must_consp(current_$32, datum_$31, removal_modules_lexicon.$list159);
                        pred2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        if (NIL == current_$32) {
                            removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot2, pred2);
                        } else {
                            cdestructuring_bind_error(datum_$31, removal_modules_lexicon.$list159);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pair2 = cdolist_list_var2.first();
                    } 
                    timed_outP = NIL;
                }
            }
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list158);
        }
        return NIL;
    }

    public static final SubLObject add_term_phrases_arg1_and_arg2_removal_nodes_alt(SubLObject asent, SubLObject denots, SubLObject pred_lists) {
        {
            SubLObject denot = NIL;
            SubLObject denot_36 = NIL;
            SubLObject pred_list = NIL;
            SubLObject pred_list_37 = NIL;
            for (denot = denots, denot_36 = denot.first(), pred_list = pred_lists, pred_list_37 = pred_list.first(); !((NIL == pred_list) && (NIL == denot)); denot = denot.rest() , denot_36 = denot.first() , pred_list = pred_list.rest() , pred_list_37 = pred_list.first()) {
                {
                    SubLObject cdolist_list_var = pred_list_37;
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot_36, pred);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject add_term_phrases_arg1_and_arg2_removal_nodes(final SubLObject asent, final SubLObject denots, final SubLObject pred_lists) {
        SubLObject denot = NIL;
        SubLObject denot_$34 = NIL;
        SubLObject pred_list = NIL;
        SubLObject pred_list_$35 = NIL;
        denot = denots;
        denot_$34 = denot.first();
        pred_list = pred_lists;
        pred_list_$35 = pred_list.first();
        while ((NIL != pred_list) || (NIL != denot)) {
            SubLObject cdolist_list_var = pred_list_$35;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                removal_modules_lexicon.add_term_phrases_arg1_and_arg2_removal_node(asent, denot_$34, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            denot = denot.rest();
            denot_$34 = denot.first();
            pred_list = pred_list.rest();
            pred_list_$35 = pred_list.first();
        } 
        return NIL;
    }

    public static final SubLObject add_term_phrases_arg1_and_arg2_removal_node_alt(SubLObject asent, SubLObject denot, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt151);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt151);
                arg2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt151);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    thread.resetMultipleValues();
                    {
                        SubLObject denot_bindings = unification_utilities.term_unify(denot, arg1, T, T);
                        SubLObject denot_unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.term_phrases_constraints_from_pred(pred);
                            SubLObject constraint = NIL;
                            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject constraint_bindings = unification_utilities.term_unify(constraint, arg2, T, T);
                                    SubLObject constraint_unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == bindings.some_variable_with_conflicting_bindings(denot_bindings, constraint_bindings)) {
                                        {
                                            SubLObject all_bindings = append(denot_bindings, constraint_bindings);
                                            SubLObject formula = bindings.subst_bindings(all_bindings, asent);
                                            SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.make_term_phrases_support(formula);
                                            backward.removal_add_node(hl_support, all_bindings, append(denot_unify_justification, constraint_unify_justification));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt151);
                }
            }
            return NIL;
        }
    }

    public static SubLObject add_term_phrases_arg1_and_arg2_removal_node(final SubLObject asent, final SubLObject denot, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list158);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject denot_bindings = term_unify(denot, arg1, T, T);
            final SubLObject denot_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = removal_modules_lexicon.term_phrases_constraints_from_pred(pred);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject constraint_bindings = term_unify(constraint, arg2, T, T);
                final SubLObject constraint_unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == some_variable_with_conflicting_bindings(denot_bindings, constraint_bindings)) {
                    final SubLObject all_bindings = append(denot_bindings, constraint_bindings);
                    final SubLObject formula = subst_bindings(all_bindings, asent);
                    final SubLObject hl_support = removal_modules_lexicon.make_term_phrases_support(formula);
                    removal_add_node(hl_support, all_bindings, append(denot_unify_justification, constraint_unify_justification));
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list158);
        }
        return NIL;
    }

    public static final SubLObject term_phrases_constraints_from_pred_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = list($$CharacterString);
                SubLObject name_string_predP = lexicon_vars.name_string_predP(pred);
                SubLObject pos = ((NIL != name_string_predP) || (NIL == lexicon_accessors.speech_part_predP(pred, UNPROVIDED))) ? ((SubLObject) (NIL)) : lexicon_accessors.pos_of_pred(pred);
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_38 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_39 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_40 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_44 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject genl_predicate = node_var_44;
                                                                {
                                                                    SubLObject _prev_bind_0_45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_44)) {
                                                                            if (NIL != isa.isaP(genl_predicate, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                                                constraints = cons(genl_predicate, constraints);
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_44);
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
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_49)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_49);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_51 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_51.first(); NIL != cdolist_list_var_51; cdolist_list_var_51 = cdolist_list_var_51.rest() , node_vars_link_node = cdolist_list_var_51.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_50, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_49 = dictionary_contents.do_dictionary_contents_next(iteration_state_49);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_49);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_48, thread);
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
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_52 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , generating_fn = cdolist_list_var_52.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_53 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_54 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_55 = new_list_54;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_55.first(); NIL != cdolist_list_var_55; cdolist_list_var_55 = cdolist_list_var_55.rest() , node_vars_link_node = cdolist_list_var_55.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_53, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_47, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_46, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_45, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_43, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_42, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_41, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt29$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_40, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_38, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != name_string_predP) {
                    constraints = cons($$ProperNameString, constraints);
                    constraints = cons($$NounPhrase, constraints);
                    {
                        SubLObject node_var_56 = pred;
                        SubLObject deck_type_57 = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                        SubLObject recur_deck_58 = deck.create_deck(deck_type_57);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject tv_var = NIL;
                                    {
                                        SubLObject _prev_bind_0_59 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (NIL != tv_var) {
                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                        {
                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                            if (pcase_var.eql($ERROR)) {
                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var.eql($CERROR)) {
                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($WARN)) {
                                                                        Errors.warn($str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    } else {
                                                                        Errors.warn($str_alt26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                        Errors.cerror($$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_60 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                SubLObject _prev_bind_1_61 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                        {
                                                            SubLObject _prev_bind_0_62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_64 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                {
                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                    SubLObject module_var = NIL;
                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_65 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                {
                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_56);
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
                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_68 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_68)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_68);
                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_70 = new_list;
                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_70.first(); NIL != cdolist_list_var_70; cdolist_list_var_70 = cdolist_list_var_70.rest() , node_vars_link_node = cdolist_list_var_70.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck_58);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_69, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_68 = dictionary_contents.do_dictionary_contents_next(iteration_state_68);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_68);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_67, thread);
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
                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                            {
                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                SubLObject cdolist_list_var_71 = new_list;
                                                                                                SubLObject generating_fn = NIL;
                                                                                                for (generating_fn = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , generating_fn = cdolist_list_var_71.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                            {
                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                SubLObject new_list_73 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                SubLObject cdolist_list_var_74 = new_list_73;
                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                for (node_vars_link_node = cdolist_list_var_74.first(); NIL != cdolist_list_var_74; cdolist_list_var_74 = cdolist_list_var_74.rest() , node_vars_link_node = cdolist_list_var_74.first()) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck_58);
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
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_66, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_65, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                node_var_56 = deck.deck_pop(recur_deck_58);
                                                                {
                                                                    SubLObject _prev_bind_0_75 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_77 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                        while (NIL != node_var_56) {
                                                                            {
                                                                                SubLObject v_isa = node_var_56;
                                                                                if (NIL != isa.isaP(v_isa, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                                                    constraints = cons(v_isa, constraints);
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_78 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_56);
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
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_81 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_81)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_81);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_82 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_83 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_83.first(); NIL != cdolist_list_var_83; cdolist_list_var_83 = cdolist_list_var_83.rest() , node_vars_link_node = cdolist_list_var_83.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck_58);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_82, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_81 = dictionary_contents.do_dictionary_contents_next(iteration_state_81);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_81);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_80, thread);
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
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_84 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_84.first(); NIL != cdolist_list_var_84; cdolist_list_var_84 = cdolist_list_var_84.rest() , generating_fn = cdolist_list_var_84.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_86 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_87 = new_list_86;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_87.first(); NIL != cdolist_list_var_87; cdolist_list_var_87 = cdolist_list_var_87.rest() , node_vars_link_node = cdolist_list_var_87.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck_58);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_85, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_79, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_78, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_var_56 = deck.deck_pop(recur_deck_58);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_77, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_76, thread);
                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_75, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_64, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_63, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_62, thread);
                                                            }
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt29$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_61, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_60, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    if (NIL != pos) {
                        if (NIL != lexicon_accessors.genl_pos_predP(pred, $$nonSingular_Generic, UNPROVIDED)) {
                            constraints = cons($$NounPhrase, constraints);
                        }
                        {
                            SubLObject node_var_88 = pos;
                            SubLObject deck_type_89 = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck_90 = deck.create_deck(deck_type_89);
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_91 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_92 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_93 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_94 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_95 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_88, UNPROVIDED);
                                                                    while (NIL != node_var_88) {
                                                                        {
                                                                            SubLObject genl = node_var_88;
                                                                            if (NIL != isa.isaP(genl, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                                                constraints = cons(genl, constraints);
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_97 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_88);
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
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_99 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_100 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_100)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_100);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_101 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_102 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_102.first(); NIL != cdolist_list_var_102; cdolist_list_var_102 = cdolist_list_var_102.rest() , node_vars_link_node = cdolist_list_var_102.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck_90);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_101, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_100 = dictionary_contents.do_dictionary_contents_next(iteration_state_100);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_100);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_99, thread);
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
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_103 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_103.first(); NIL != cdolist_list_var_103; cdolist_list_var_103 = cdolist_list_var_103.rest() , generating_fn = cdolist_list_var_103.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_104 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_105 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_106 = new_list_105;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_106.first(); NIL != cdolist_list_var_106; cdolist_list_var_106 = cdolist_list_var_106.rest() , node_vars_link_node = cdolist_list_var_106.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck_90);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_104, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_98, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_97, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var_88 = deck.deck_pop(recur_deck_90);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_96, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_95, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_94, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt29$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_93, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_92, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_91, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return constraints;
            }
        }
    }

    public static SubLObject term_phrases_constraints_from_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraints = list(removal_modules_lexicon.$$CharacterString);
        final SubLObject name_string_predP = name_string_predP(pred);
        final SubLObject pos = ((NIL != name_string_predP) || (NIL == speech_part_predP(pred, UNPROVIDED))) ? NIL : pos_of_pred(pred);
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = $sbhl_space$.currentBinding(thread);
        try {
            $sbhl_space$.bind(get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$36 = $sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                    $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_error(ONE_INTEGER, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_cerror(ONE_INTEGER, removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn(removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn(removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror(removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$37 = $sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = $sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $sbhl_module$.currentBinding(thread);
                    try {
                        $sbhl_search_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genlPreds), thread);
                        $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                        $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                        $genl_inverse_mode_p$.bind(NIL, thread);
                        $sbhl_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genlPreds), thread);
                        if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(pred, get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$38 = $sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = $sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$41 = $genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_search_direction$.bind(get_sbhl_forward_search_direction(), thread);
                                $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_forward_search_direction(), get_sbhl_module(removal_modules_lexicon.$$genlPreds)), thread);
                                $genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck_pop(recur_deck)) {
                                    final SubLObject node_var_$42 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_predicate = node_var_$42;
                                    final SubLObject _prev_bind_0_$39 = $genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != apply_sbhl_add_node_test(get_sbhl_search_add_node_test(), node_var_$42)) && (NIL != isaP(genl_predicate, removal_modules_lexicon.$$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED))) {
                                            constraints = cons(genl_predicate, constraints);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = get_sbhl_accessible_modules(get_sbhl_module(removal_modules_lexicon.$$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$40 = $sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$40 = $genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                $sbhl_module$.bind(module_var, thread);
                                                $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = naut_to_nart(node_var_$42);
                                                if (NIL != sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = do_dictionary_contents_state(dictionary_contents(mt_links)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$41 = $sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        $sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$47;
                                                                        for (iteration_state_$47 = do_dictionary_contents_state(dictionary_contents(tv_links)); NIL == do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = do_dictionary_contents_next(iteration_state_$47)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = do_dictionary_contents_key_value(iteration_state_$47);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$42 = $sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck_push(list(node_vars_link_node, genl_inverse_mode_p()), recur_deck);
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
                                                                                                    deck_push(list(node_vars_link_node2, genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    $sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        do_dictionary_contents_finalize(iteration_state_$47);
                                                                    } finally {
                                                                        $sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                }
                                                            }
                                                            do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_error(FIVE_INTEGER, removal_modules_lexicon.$str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$49;
                                                        final SubLObject new_list = cdolist_list_var_$49 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$49.first();
                                                        while (NIL != cdolist_list_var_$49) {
                                                            final SubLObject _prev_bind_0_$43 = $sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                $sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck_push(list(node_vars_link_node3, genl_inverse_mode_p()), recur_deck);
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
                                                                                deck_push(list(node_vars_link_node4, genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                $sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                            }
                                                            cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                            generating_fn = cdolist_list_var_$49.first();
                                                        } 
                                                    }

                                            } finally {
                                                $genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                $sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        $genl_inverse_mode_p$.rebind(_prev_bind_0_$39, thread);
                                    }
                                }
                            } finally {
                                $genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                $sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                $sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                            }
                        } else {
                            sbhl_warn(TWO_INTEGER, removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pred, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $sbhl_module$.rebind(_prev_bind_5, thread);
                        $genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        $sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        $sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                        $sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                    }
                } finally {
                    $relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    $sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            $sbhl_space$.rebind(_prev_bind_0, thread);
        }
        if (NIL != name_string_predP) {
            constraints = cons(removal_modules_lexicon.$$ProperNameString, constraints);
            constraints = cons(removal_modules_lexicon.$$NounPhrase, constraints);
            final SubLObject deck_type_$53 = $QUEUE;
            final SubLObject recur_deck_$54 = create_deck(deck_type_$53);
            final SubLObject _prev_bind_6 = $sbhl_space$.currentBinding(thread);
            try {
                $sbhl_space$.bind(get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var2 = NIL;
                    final SubLObject _prev_bind_0_$45 = $sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        $sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : get_sbhl_true_tv(), thread);
                        $relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var2) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var2))) {
                            final SubLObject pcase_var2 = $sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql($ERROR)) {
                                sbhl_error(ONE_INTEGER, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var2.eql($CERROR)) {
                                    sbhl_cerror(ONE_INTEGER, removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var2.eql($WARN)) {
                                        Errors.warn(removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn(removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror(removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$46 = $sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = $sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $sbhl_module$.currentBinding(thread);
                        try {
                            $sbhl_search_module$.bind(get_sbhl_module(removal_modules_lexicon.$$isa), thread);
                            $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(removal_modules_lexicon.$$isa)), thread);
                            $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(removal_modules_lexicon.$$isa)), thread);
                            $genl_inverse_mode_p$.bind(NIL, thread);
                            $sbhl_module$.bind(get_sbhl_module(removal_modules_lexicon.$$isa), thread);
                            if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(pred, get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$47 = $sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$42 = $sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$42 = $genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    $sbhl_search_direction$.bind(get_sbhl_forward_search_direction(), thread);
                                    $sbhl_link_direction$.bind(get_sbhl_module_forward_direction(get_sbhl_module(UNPROVIDED)), thread);
                                    $genl_inverse_mode_p$.bind(NIL, thread);
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules2 = cdolist_list_var2 = get_sbhl_accessible_modules(get_sbhl_module(removal_modules_lexicon.$$isa));
                                    SubLObject module_var2 = NIL;
                                    module_var2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject _prev_bind_0_$48 = $sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = $genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            $sbhl_module$.bind(module_var2, thread);
                                            $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node2 = naut_to_nart(pred);
                                            if (NIL != sbhl_node_object_p(node2)) {
                                                final SubLObject d_link2 = get_sbhl_graph_link(node2, get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link2) {
                                                    final SubLObject mt_links2 = get_sbhl_mt_links(d_link2, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links2) {
                                                        SubLObject iteration_state2;
                                                        for (iteration_state2 = do_dictionary_contents_state(dictionary_contents(mt_links2)); NIL == do_dictionary_contents_doneP(iteration_state2); iteration_state2 = do_dictionary_contents_next(iteration_state2)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt2 = do_dictionary_contents_key_value(iteration_state2);
                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != relevant_mtP(mt2)) {
                                                                final SubLObject _prev_bind_0_$49 = $sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_mt$.bind(mt2, thread);
                                                                    SubLObject iteration_state_$48;
                                                                    for (iteration_state_$48 = do_dictionary_contents_state(dictionary_contents(tv_links2)); NIL == do_dictionary_contents_doneP(iteration_state_$48); iteration_state_$48 = do_dictionary_contents_next(iteration_state_$48)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv2 = do_dictionary_contents_key_value(iteration_state_$48);
                                                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != relevant_sbhl_tvP(tv2)) {
                                                                            final SubLObject _prev_bind_0_$50 = $sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                $sbhl_link_tv$.bind(tv2, thread);
                                                                                final SubLObject sol3 = link_nodes3;
                                                                                if (NIL != set.set_p(sol3)) {
                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                    SubLObject basis_object3;
                                                                                    SubLObject state3;
                                                                                    SubLObject node_vars_link_node5;
                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                        node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                            sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                            deck_push(node_vars_link_node5, recur_deck_$54);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol3.isList()) {
                                                                                        SubLObject csome_list_var3 = sol3;
                                                                                        SubLObject node_vars_link_node6 = NIL;
                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                        while (NIL != csome_list_var3) {
                                                                                            if (NIL == sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                deck_push(node_vars_link_node6, recur_deck_$54);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node6 = csome_list_var3.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                    }

                                                                            } finally {
                                                                                $sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    do_dictionary_contents_finalize(iteration_state_$48);
                                                                } finally {
                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                            }
                                                        }
                                                        do_dictionary_contents_finalize(iteration_state2);
                                                    }
                                                } else {
                                                    sbhl_error(FIVE_INTEGER, removal_modules_lexicon.$str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != cnat_p(node2, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$50;
                                                    final SubLObject new_list2 = cdolist_list_var_$50 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn2 = NIL;
                                                    generating_fn2 = cdolist_list_var_$50.first();
                                                    while (NIL != cdolist_list_var_$50) {
                                                        final SubLObject _prev_bind_0_$51 = $sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            $sbhl_link_generator$.bind(generating_fn2, thread);
                                                            final SubLObject sol4;
                                                            final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                            if (NIL != set.set_p(sol4)) {
                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                SubLObject basis_object4;
                                                                SubLObject state4;
                                                                SubLObject node_vars_link_node7;
                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                    node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                        sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                        deck_push(node_vars_link_node7, recur_deck_$54);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol4.isList()) {
                                                                    SubLObject csome_list_var4 = sol4;
                                                                    SubLObject node_vars_link_node8 = NIL;
                                                                    node_vars_link_node8 = csome_list_var4.first();
                                                                    while (NIL != csome_list_var4) {
                                                                        if (NIL == sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                            sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                            deck_push(node_vars_link_node8, recur_deck_$54);
                                                                        }
                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                        node_vars_link_node8 = csome_list_var4.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }

                                                        } finally {
                                                            $sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                        }
                                                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                        generating_fn2 = cdolist_list_var_$50.first();
                                                    } 
                                                }

                                        } finally {
                                            $genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                            $sbhl_module$.rebind(_prev_bind_0_$48, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        module_var2 = cdolist_list_var2.first();
                                    } 
                                    SubLObject node_var_$43 = deck_pop(recur_deck_$54);
                                    final SubLObject _prev_bind_0_$52 = $sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$44 = $genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$43 = $sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(get_sbhl_transfers_through_module(get_sbhl_search_module()), thread);
                                        $genl_inverse_mode_p$.bind(NIL, thread);
                                        $sbhl_link_direction$.bind(get_sbhl_module_forward_direction(get_sbhl_module(UNPROVIDED)), thread);
                                        while (NIL != node_var_$43) {
                                            final SubLObject v_isa = node_var_$43;
                                            if (NIL != isaP(v_isa, removal_modules_lexicon.$$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                constraints = cons(v_isa, constraints);
                                            }
                                            SubLObject cdolist_list_var3;
                                            final SubLObject accessible_modules3 = cdolist_list_var3 = get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                                            SubLObject module_var3 = NIL;
                                            module_var3 = cdolist_list_var3.first();
                                            while (NIL != cdolist_list_var3) {
                                                final SubLObject _prev_bind_0_$53 = $sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$45 = $genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    $sbhl_module$.bind(module_var3, thread);
                                                    $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node3 = naut_to_nart(node_var_$43);
                                                    if (NIL != sbhl_node_object_p(node3)) {
                                                        final SubLObject d_link3 = get_sbhl_graph_link(node3, get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link3) {
                                                            final SubLObject mt_links3 = get_sbhl_mt_links(d_link3, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links3) {
                                                                SubLObject iteration_state3;
                                                                for (iteration_state3 = do_dictionary_contents_state(dictionary_contents(mt_links3)); NIL == do_dictionary_contents_doneP(iteration_state3); iteration_state3 = do_dictionary_contents_next(iteration_state3)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = do_dictionary_contents_key_value(iteration_state3);
                                                                    final SubLObject tv_links3 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$54 = $sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$49;
                                                                            for (iteration_state_$49 = do_dictionary_contents_state(dictionary_contents(tv_links3)); NIL == do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = do_dictionary_contents_next(iteration_state_$49)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv3 = do_dictionary_contents_key_value(iteration_state_$49);
                                                                                final SubLObject link_nodes5 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != relevant_sbhl_tvP(tv3)) {
                                                                                    final SubLObject _prev_bind_0_$55 = $sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        $sbhl_link_tv$.bind(tv3, thread);
                                                                                        final SubLObject sol5 = link_nodes5;
                                                                                        if (NIL != set.set_p(sol5)) {
                                                                                            final SubLObject set_contents_var5 = set.do_set_internal(sol5);
                                                                                            SubLObject basis_object5;
                                                                                            SubLObject state5;
                                                                                            SubLObject node_vars_link_node9;
                                                                                            for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                                                                                                node_vars_link_node9 = set_contents.do_set_contents_next(basis_object5, state5);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state5, node_vars_link_node9)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node9, UNPROVIDED))) {
                                                                                                    sbhl_mark_node_marked(node_vars_link_node9, UNPROVIDED);
                                                                                                    deck_push(node_vars_link_node9, recur_deck_$54);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol5.isList()) {
                                                                                                SubLObject csome_list_var5 = sol5;
                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                node_vars_link_node = csome_list_var5.first();
                                                                                                while (NIL != csome_list_var5) {
                                                                                                    if (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck_push(node_vars_link_node, recur_deck_$54);
                                                                                                    }
                                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                                    node_vars_link_node = csome_list_var5.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol5);
                                                                                            }

                                                                                    } finally {
                                                                                        $sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            do_dictionary_contents_finalize(iteration_state_$49);
                                                                        } finally {
                                                                            $sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                        }
                                                                    }
                                                                }
                                                                do_dictionary_contents_finalize(iteration_state3);
                                                            }
                                                        } else {
                                                            sbhl_error(FIVE_INTEGER, removal_modules_lexicon.$str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != cnat_p(node3, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$51;
                                                            final SubLObject new_list3 = cdolist_list_var_$51 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn3 = NIL;
                                                            generating_fn3 = cdolist_list_var_$51.first();
                                                            while (NIL != cdolist_list_var_$51) {
                                                                final SubLObject _prev_bind_0_$56 = $sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_generator$.bind(generating_fn3, thread);
                                                                    final SubLObject sol6;
                                                                    final SubLObject link_nodes6 = sol6 = funcall(generating_fn3, node3);
                                                                    if (NIL != set.set_p(sol6)) {
                                                                        final SubLObject set_contents_var6 = set.do_set_internal(sol6);
                                                                        SubLObject node_vars_link_node6;
                                                                        SubLObject basis_object6;
                                                                        SubLObject state6;
                                                                        for (basis_object6 = set_contents.do_set_contents_basis_object(set_contents_var6), state6 = NIL, state6 = set_contents.do_set_contents_initial_state(basis_object6, set_contents_var6); NIL == set_contents.do_set_contents_doneP(basis_object6, state6); state6 = set_contents.do_set_contents_update_state(state6)) {
                                                                            node_vars_link_node6 = set_contents.do_set_contents_next(basis_object6, state6);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state6, node_vars_link_node6)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED))) {
                                                                                sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                deck_push(node_vars_link_node6, recur_deck_$54);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol6.isList()) {
                                                                            SubLObject csome_list_var6 = sol6;
                                                                            SubLObject node_vars_link_node3 = NIL;
                                                                            node_vars_link_node3 = csome_list_var6.first();
                                                                            while (NIL != csome_list_var6) {
                                                                                if (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                    sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck_push(node_vars_link_node3, recur_deck_$54);
                                                                                }
                                                                                csome_list_var6 = csome_list_var6.rest();
                                                                                node_vars_link_node3 = csome_list_var6.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol6);
                                                                        }

                                                                } finally {
                                                                    $sbhl_link_generator$.rebind(_prev_bind_0_$56, thread);
                                                                }
                                                                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                                generating_fn3 = cdolist_list_var_$51.first();
                                                            } 
                                                        }

                                                } finally {
                                                    $genl_inverse_mode_p$.rebind(_prev_bind_1_$45, thread);
                                                    $sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                }
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                module_var3 = cdolist_list_var3.first();
                                            } 
                                            node_var_$43 = deck_pop(recur_deck_$54);
                                        } 
                                    } finally {
                                        $sbhl_link_direction$.rebind(_prev_bind_2_$43, thread);
                                        $genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                        $sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                    }
                                } finally {
                                    $genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                    $sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                    $sbhl_search_direction$.rebind(_prev_bind_0_$47, thread);
                                }
                            } else {
                                sbhl_warn(TWO_INTEGER, removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pred, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            $sbhl_module$.rebind(_prev_bind_10, thread);
                            $genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            $sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            $sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                            $sbhl_search_module$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        $relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        $sbhl_tv$.rebind(_prev_bind_0_$45, thread);
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
                $sbhl_space$.rebind(_prev_bind_6, thread);
            }
        } else
            if (NIL != pos) {
                if (NIL != genl_pos_predP(pred, removal_modules_lexicon.$$nonSingular_Generic, UNPROVIDED)) {
                    constraints = cons(removal_modules_lexicon.$$NounPhrase, constraints);
                }
                SubLObject node_var_$44 = pos;
                final SubLObject deck_type_$54 = $STACK;
                final SubLObject recur_deck_$55 = create_deck(deck_type_$54);
                final SubLObject _prev_bind_6 = $sbhl_space$.currentBinding(thread);
                try {
                    $sbhl_space$.bind(get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var2 = NIL;
                        final SubLObject _prev_bind_0_$58 = $sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            $sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : get_sbhl_true_tv(), thread);
                            $relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var2) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var2))) {
                                final SubLObject pcase_var2 = $sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var2.eql($ERROR)) {
                                    sbhl_error(ONE_INTEGER, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var2.eql($CERROR)) {
                                        sbhl_cerror(ONE_INTEGER, removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var2.eql($WARN)) {
                                            Errors.warn(removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn(removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror(removal_modules_lexicon.$$$continue_anyway, removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$59 = $sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$46 = $sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_9 = $genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_10 = $sbhl_module$.currentBinding(thread);
                            try {
                                $sbhl_search_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genls), thread);
                                $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(removal_modules_lexicon.$$genls)), thread);
                                $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(removal_modules_lexicon.$$genls)), thread);
                                $genl_inverse_mode_p$.bind(NIL, thread);
                                $sbhl_module$.bind(get_sbhl_module(removal_modules_lexicon.$$genls), thread);
                                if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(pos, get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$60 = $sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$47 = $sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$44 = $genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_search_direction$.bind(get_sbhl_forward_search_direction(), thread);
                                        $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_forward_search_direction(), get_sbhl_module(removal_modules_lexicon.$$genls)), thread);
                                        $genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_mark_node_marked(node_var_$44, UNPROVIDED);
                                        while (NIL != node_var_$44) {
                                            final SubLObject genl = node_var_$44;
                                            if (NIL != isaP(genl, removal_modules_lexicon.$$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                constraints = cons(genl, constraints);
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = get_sbhl_accessible_modules(get_sbhl_module(removal_modules_lexicon.$$genls));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$61 = $sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$48 = $genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    $sbhl_module$.bind(module_var2, thread);
                                                    $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = naut_to_nart(node_var_$44);
                                                    if (NIL != sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = get_sbhl_graph_link(node2, get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = get_sbhl_mt_links(d_link2, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = do_dictionary_contents_state(dictionary_contents(mt_links2)); NIL == do_dictionary_contents_doneP(iteration_state2); iteration_state2 = do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$62 = $sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$50;
                                                                            for (iteration_state_$50 = do_dictionary_contents_state(dictionary_contents(tv_links2)); NIL == do_dictionary_contents_doneP(iteration_state_$50); iteration_state_$50 = do_dictionary_contents_next(iteration_state_$50)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = do_dictionary_contents_key_value(iteration_state_$50);
                                                                                final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$63 = $sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        $sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes3;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node5;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                    sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                    deck_push(node_vars_link_node5, recur_deck_$55);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (NIL != csome_list_var3) {
                                                                                                    if (NIL == sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                        sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                        deck_push(node_vars_link_node6, recur_deck_$55);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        $sbhl_link_tv$.rebind(_prev_bind_0_$63, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            do_dictionary_contents_finalize(iteration_state_$50);
                                                                        } finally {
                                                                            $sbhl_link_mt$.rebind(_prev_bind_0_$62, thread);
                                                                        }
                                                                    }
                                                                }
                                                                do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_error(FIVE_INTEGER, removal_modules_lexicon.$str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$52;
                                                            final SubLObject new_list2 = cdolist_list_var_$52 = (NIL != sbhl_randomize_lists_p()) ? randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$52.first();
                                                            while (NIL != cdolist_list_var_$52) {
                                                                final SubLObject _prev_bind_0_$64 = $sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node7;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                                sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                deck_push(node_vars_link_node7, recur_deck_$55);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var4 = sol4;
                                                                            SubLObject node_vars_link_node8 = NIL;
                                                                            node_vars_link_node8 = csome_list_var4.first();
                                                                            while (NIL != csome_list_var4) {
                                                                                if (NIL == sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                                    sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                                    deck_push(node_vars_link_node8, recur_deck_$55);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node8 = csome_list_var4.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error(removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    $sbhl_link_generator$.rebind(_prev_bind_0_$64, thread);
                                                                }
                                                                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                                generating_fn2 = cdolist_list_var_$52.first();
                                                            } 
                                                        }

                                                } finally {
                                                    $genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                    $sbhl_module$.rebind(_prev_bind_0_$61, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$44 = deck_pop(recur_deck_$55);
                                        } 
                                    } finally {
                                        $genl_inverse_mode_p$.rebind(_prev_bind_2_$44, thread);
                                        $sbhl_link_direction$.rebind(_prev_bind_1_$47, thread);
                                        $sbhl_search_direction$.rebind(_prev_bind_0_$60, thread);
                                    }
                                } else {
                                    sbhl_warn(TWO_INTEGER, removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pos, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                $sbhl_module$.rebind(_prev_bind_10, thread);
                                $genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                                $sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                                $sbhl_search_module_type$.rebind(_prev_bind_1_$46, thread);
                                $sbhl_search_module$.rebind(_prev_bind_0_$59, thread);
                            }
                        } finally {
                            $relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                            $sbhl_tv$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                } finally {
                    $sbhl_space$.rebind(_prev_bind_6, thread);
                }
            }

        return constraints;
    }

    public static final SubLObject removal_lexicon_namestring_expand_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt157);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt157);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt157);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject cdolist_list_var = nl_trie_accessors.nl_trie_assertions_with_string_and_namestring_pred(string, pred, T, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject as = NIL;
                        for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_formula(as), list($list_alt158, $list_alt159, string));
                                SubLObject v_bindings = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != success) {
                                    {
                                        SubLObject name_pred = list_utilities.alist_lookup_without_values(v_bindings, NAME_PRED, UNPROVIDED, UNPROVIDED);
                                        SubLObject denot = list_utilities.alist_lookup_without_values(v_bindings, DENOT, UNPROVIDED, UNPROVIDED);
                                        if (NIL != lexicon_accessors.genl_pos_predP(name_pred, pred, UNPROVIDED)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings_107 = unification_utilities.term_unify(denot, arg1, T, T);
                                                SubLObject unify_justification = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject more_supports = (name_pred.eql(pred)) ? ((SubLObject) (NIL)) : list(arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, name_pred, pred), UNPROVIDED, UNPROVIDED));
                                                    if (NIL != v_bindings_107) {
                                                        backward.removal_add_node(as, v_bindings_107, append(more_supports, unify_justification));
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
                    cdestructuring_bind_error(datum, $list_alt157);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_lexicon_namestring_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = formula_terms(asent, UNPROVIDED);
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list164);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list164);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, removal_modules_lexicon.$list164);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = nl_trie_assertions_with_string_and_namestring_pred(string, pred, T, $mt$.getDynamicValue(thread), UNPROVIDED);
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_matches_pattern(gaf_formula(as), list(removal_modules_lexicon.$list165, removal_modules_lexicon.$list166, string));
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject name_pred = alist_lookup_without_values(v_bindings, removal_modules_lexicon.NAME_PRED, UNPROVIDED, UNPROVIDED);
                    final SubLObject denot = alist_lookup_without_values(v_bindings, DENOT, UNPROVIDED, UNPROVIDED);
                    if (NIL != genl_pos_predP(name_pred, pred, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$96 = term_unify(denot, arg1, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject more_supports = (name_pred.eql(pred)) ? NIL : list(make_hl_support($GENLPREDS, make_binary_formula(removal_modules_lexicon.$$genlPreds, name_pred, pred), UNPROVIDED, UNPROVIDED));
                        if (NIL != v_bindings_$96) {
                            removal_add_node(as, v_bindings_$96, append(more_supports, unify_justification));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, removal_modules_lexicon.$list164);
        }
        return NIL;
    }

    public static final SubLObject removal_lexicon_namestring_completeP_alt(SubLObject asent) {
        return makeBoolean(NIL == el_formula_with_operator_p(asent, $$termStrings));
    }

    public static SubLObject removal_lexicon_namestring_completeP(final SubLObject asent) {
        return makeBoolean(NIL == el_formula_with_operator_p(asent, removal_modules_lexicon.$$termStrings));
    }

    public static SubLObject declare_removal_modules_lexicon_file() {
        declareFunction("removal_word_strings_check_required", "REMOVAL-WORD-STRINGS-CHECK-REQUIRED", 1, 1, false);
        declareFunction("hl_verify_word_strings", "HL-VERIFY-WORD-STRINGS", 1, 0, false);
        declareFunction("hl_justify_word_strings", "HL-JUSTIFY-WORD-STRINGS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_word_strings", "HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false);
        declareFunction("removal_word_strings_check_succeedsP", "REMOVAL-WORD-STRINGS-CHECK-SUCCEEDS?", 1, 0, false);
        declareFunction("removal_word_strings_check_expand", "REMOVAL-WORD-STRINGS-CHECK-EXPAND", 1, 1, false);
        declareFunction("make_word_strings_support", "MAKE-WORD-STRINGS-SUPPORT", 1, 0, false);
        declareFunction("removal_word_strings_unify_arg1_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        declareFunction("removal_word_strings_unify_arg1_output_generate", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE", 2, 0, false);
        declareFunction("removal_word_strings_unify_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        declareFunction("removal_word_strings_unify_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_word_strings_unify_arg2_expand", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_word_strings_unify_arg1_and_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-REQUIRED", 1, 1, false);
        declareFunction("removal_word_strings_unify_arg1_and_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-COST", 1, 1, false);
        declareFunction("removal_word_strings_iterator_state_print_function_trampoline", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_word_strings_iterator_state_p", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P", 1, 0, false);
        new removal_modules_lexicon.$removal_word_strings_iterator_state_p$UnaryFunction();
        declareFunction("removal_wsi_state_speech_part_predicate", "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 1, 0, false);
        declareFunction("removal_wsi_state_arg1", "REMOVAL-WSI-STATE-ARG1", 1, 0, false);
        declareFunction("removal_wsi_state_arg2", "REMOVAL-WSI-STATE-ARG2", 1, 0, false);
        declareFunction("removal_wsi_state_trie_iterator", "REMOVAL-WSI-STATE-TRIE-ITERATOR", 1, 0, false);
        declareFunction("removal_wsi_state_entry_iterator", "REMOVAL-WSI-STATE-ENTRY-ITERATOR", 1, 0, false);
        declareFunction("_csetf_removal_wsi_state_speech_part_predicate", "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 2, 0, false);
        declareFunction("_csetf_removal_wsi_state_arg1", "_CSETF-REMOVAL-WSI-STATE-ARG1", 2, 0, false);
        declareFunction("_csetf_removal_wsi_state_arg2", "_CSETF-REMOVAL-WSI-STATE-ARG2", 2, 0, false);
        declareFunction("_csetf_removal_wsi_state_trie_iterator", "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR", 2, 0, false);
        declareFunction("_csetf_removal_wsi_state_entry_iterator", "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR", 2, 0, false);
        declareFunction("make_removal_word_strings_iterator_state", "MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_removal_word_strings_iterator_state", "VISIT-DEFSTRUCT-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_removal_word_strings_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("iterator_word_strings_done", "ITERATOR-WORD-STRINGS-DONE", 1, 0, false);
        declareFunction("wsi_entry_iterator_prepared_p", "WSI-ENTRY-ITERATOR-PREPARED-P", 1, 0, false);
        declareFunction("wsi_advance_to_next_entry_iterator", "WSI-ADVANCE-TO-NEXT-ENTRY-ITERATOR", 1, 0, false);
        declareFunction("wsi_current_word_and_string_unifyP", "WSI-CURRENT-WORD-AND-STRING-UNIFY?", 3, 0, false);
        declareFunction("iterator_word_strings_next", "ITERATOR-WORD-STRINGS-NEXT", 1, 0, false);
        declareFunction("removal_word_strings_unify_arg1_and_arg2_iterator", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR", 1, 0, false);
        declareFunction("removal_word_strings_unify_arg1_and_arg2_supports", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS", 1, 0, false);
        declareFunction("removal_word_strings_unify_arg1_and_arg2_output_asent", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT", 3, 0, false);
        declareFunction("set_up_removal_support_for_speech_part_predicate", "SET-UP-REMOVAL-SUPPORT-FOR-SPEECH-PART-PREDICATE", 1, 0, false);
        declareFunction("removal_word_forms_check_required", "REMOVAL-WORD-FORMS-CHECK-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_check_cost", "REMOVAL-WORD-FORMS-CHECK-COST", 1, 1, false);
        declareFunction("removal_word_forms_check_expand", "REMOVAL-WORD-FORMS-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg1_required", "REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg1_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg1_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg2_required", "REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg3_required", "REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG3-COST", 1, 1, false);
        declareFunction("removal_word_forms_unify_arg3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_1_and_2_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_1_and_2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_1_and_2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_2_and_3_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_2_and_3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST", 1, 1, false);
        declareFunction("removal_word_forms_unify_args_2_and_3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND", 1, 1, false);
        declareFunction("hl_verify_term_phrases", "HL-VERIFY-TERM-PHRASES", 1, 0, false);
        declareFunction("hl_justify_term_phrases", "HL-JUSTIFY-TERM-PHRASES", 1, 0, false);
        declareFunction("destructure_term_phrases_support", "DESTRUCTURE-TERM-PHRASES-SUPPORT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_term_phrases", "HL-FORWARD-MT-COMBOS-TERM-PHRASES", 1, 0, false);
        declareFunction("supports_have_predsP", "SUPPORTS-HAVE-PREDS?", 2, 0, false);
        declareFunction("get_supports_preds", "GET-SUPPORTS-PREDS", 1, 0, false);
        declareFunction("hl_verify_and_justify_term_phrases", "HL-VERIFY-AND-JUSTIFY-TERM-PHRASES", 1, 0, false);
        declareFunction("removal_term_phrases_required", "REMOVAL-TERM-PHRASES-REQUIRED", 1, 1, false);
        declareFunction("get_term_phrases_supports", "GET-TERM-PHRASES-SUPPORTS", 3, 2, false);
        declareFunction("get_non_lexical_term_phrases_supports", "GET-NON-LEXICAL-TERM-PHRASES-SUPPORTS", 4, 0, false);
        declareMacro("do_lexical_gafs", "DO-LEXICAL-GAFS");
        declareFunction("removal_term_phrases_unify_arg3_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND", 1, 1, false);
        declareFunction("add_term_phrases_removal_nodes", "ADD-TERM-PHRASES-REMOVAL-NODES", 3, 0, false);
        declareFunction("make_term_phrases_support", "MAKE-TERM-PHRASES-SUPPORT", 1, 0, false);
        declareFunction("term_unify_case_insensitive", "TERM-UNIFY-CASE-INSENSITIVE", 2, 2, false);
        declareFunction("preds_from_term_phrases_constraint", "PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("generic_predP", "GENERIC-PRED?", 1, 0, false);
        declareFunction("removal_term_phrases_unify_arg1_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction("case_insensitive_term_phrases_asent_p", "CASE-INSENSITIVE-TERM-PHRASES-ASENT-P", 1, 0, false);
        declareFunction("lexical_only_term_phrases_asent_p", "LEXICAL-ONLY-TERM-PHRASES-ASENT-P", 1, 0, false);
        declareFunction("inference_denots_of_string", "INFERENCE-DENOTS-OF-STRING", 1, 0, false);
        declareFunction("inference_denots_of_stringXpred", "INFERENCE-DENOTS-OF-STRING&PRED", 2, 0, false);
        declareFunction("removal_term_phrases_unify_arg1_and_arg2_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND", 1, 1, false);
        declareFunction("add_term_phrases_arg1_and_arg2_removal_nodes", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODES", 3, 0, false);
        declareFunction("add_term_phrases_arg1_and_arg2_removal_node", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODE", 3, 0, false);
        declareFunction("term_phrases_constraints_from_pred", "TERM-PHRASES-CONSTRAINTS-FROM-PRED", 1, 0, false);
        declareFunction("removal_lexicon_namestring_expand", "REMOVAL-LEXICON-NAMESTRING-EXPAND", 2, 0, false);
        declareFunction("removal_lexicon_namestring_completeP", "REMOVAL-LEXICON-NAMESTRING-COMPLETE?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_lexicon_file() {
        defparameter("*DEFAULT-WORD-STRING-CHECK-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-WORD-STRINGS-UNIFY-COST*", TWO_INTEGER);
        defconstant("*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*", removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        defconstant("*AVG-SUFFIX-EXPANSION-COST*", THREE_INTEGER);
        defparameter("*DEFAULT-TERM-PHRASES-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_lexicon_file_alt() {
        note_funcall_helper_function(HL_VERIFY_WORD_STRINGS);
        note_funcall_helper_function(HL_JUSTIFY_WORD_STRINGS);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_WORD_STRINGS);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_CHECK, $list_alt7);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_UNIFY_ARG1, $list_alt11);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_UNIFY_ARG2, $list_alt14);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, _CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE);
        def_csetf(REMOVAL_WSI_STATE_ARG1, _CSETF_REMOVAL_WSI_STATE_ARG1);
        def_csetf(REMOVAL_WSI_STATE_ARG2, _CSETF_REMOVAL_WSI_STATE_ARG2);
        def_csetf(REMOVAL_WSI_STATE_TRIE_ITERATOR, _CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR);
        def_csetf(REMOVAL_WSI_STATE_ENTRY_ITERATOR, _CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR);
        identity(REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        note_funcall_helper_function(ITERATOR_WORD_STRINGS_DONE);
        note_funcall_helper_function(ITERATOR_WORD_STRINGS_NEXT);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_CHECK, $list_alt64);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG1, $list_alt66);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG2, $list_alt69);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG3, $list_alt71);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, $list_alt73);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, $list_alt75);
        note_funcall_helper_function(HL_VERIFY_TERM_PHRASES);
        note_funcall_helper_function(HL_JUSTIFY_TERM_PHRASES);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_TERM_PHRASES);
        define_test_case_table_int(HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, list(new SubLObject[]{ $TEST, $sym90$SUPPORTS_HAVE_PREDS_, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt97);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, $list_alt125);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, $list_alt127);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG3, $list_alt129);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, $list_alt131);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1, $list_alt133);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, $list_alt135);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, $list_alt137);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, $list_alt139);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, $list_alt148);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, $list_alt150);
        inference_modules.register_solely_specific_removal_module_predicate($$termPhrases);
        inference_modules.register_solely_specific_removal_module_predicate($$termPhrases_CaseInsensitive);
        inference_modules.register_solely_specific_removal_module_predicate($$wordForms);
        note_funcall_helper_function(REMOVAL_LEXICON_NAMESTRING_EXPAND);
        note_funcall_helper_function($sym164$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
        preference_modules.inference_preference_module($TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list_alt166);
        preference_modules.inference_preference_module($TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, $list_alt168);
        inference_modules.inference_removal_module($REMOVAL_LEXICON_NAMESTRING, $list_alt170);
        return NIL;
    }

    public static SubLObject setup_removal_modules_lexicon_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function(removal_modules_lexicon.HL_VERIFY_WORD_STRINGS);
            note_funcall_helper_function(removal_modules_lexicon.HL_JUSTIFY_WORD_STRINGS);
            note_funcall_helper_function(removal_modules_lexicon.HL_FORWARD_MT_COMBOS_WORD_STRINGS);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_CHECK, removal_modules_lexicon.$list7);
            note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_UNIFY_ARG1, removal_modules_lexicon.$list11);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_UNIFY_ARG2, removal_modules_lexicon.$list14);
            register_method($print_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(removal_modules_lexicon.$list39);
            def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE);
            def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ARG1, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ARG1);
            def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ARG2, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ARG2);
            def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_TRIE_ITERATOR, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR);
            def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ENTRY_ITERATOR, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR);
            identity(removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(removal_modules_lexicon.VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD));
            note_funcall_helper_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_DONE);
            note_funcall_helper_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_NEXT);
            note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR);
            note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS);
            note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_CHECK, removal_modules_lexicon.$list71);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG1, removal_modules_lexicon.$list73);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG2, removal_modules_lexicon.$list76);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG3, removal_modules_lexicon.$list78);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, removal_modules_lexicon.$list80);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, removal_modules_lexicon.$list82);
            note_funcall_helper_function(removal_modules_lexicon.HL_VERIFY_TERM_PHRASES);
            note_funcall_helper_function(removal_modules_lexicon.HL_JUSTIFY_TERM_PHRASES);
            note_funcall_helper_function(removal_modules_lexicon.HL_FORWARD_MT_COMBOS_TERM_PHRASES);
            define_test_case_table_int(removal_modules_lexicon.HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, list(new SubLObject[]{ $TEST, removal_modules_lexicon.$sym97$SUPPORTS_HAVE_PREDS_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), removal_modules_lexicon.$list103);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, removal_modules_lexicon.$list132);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, removal_modules_lexicon.$list134);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG3, removal_modules_lexicon.$list136);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, removal_modules_lexicon.$list138);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG1, removal_modules_lexicon.$list140);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, removal_modules_lexicon.$list142);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, removal_modules_lexicon.$list144);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, removal_modules_lexicon.$list146);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, removal_modules_lexicon.$list155);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, removal_modules_lexicon.$list157);
            register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$termPhrases);
            register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$termPhrases_CaseInsensitive);
            register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$wordForms);
            note_funcall_helper_function(removal_modules_lexicon.REMOVAL_LEXICON_NAMESTRING_EXPAND);
            note_funcall_helper_function(removal_modules_lexicon.$sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
            inference_preference_module(removal_modules_lexicon.$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, removal_modules_lexicon.$list173);
            inference_preference_module(removal_modules_lexicon.$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, removal_modules_lexicon.$list175);
            inference_removal_module(removal_modules_lexicon.$REMOVAL_LEXICON_NAMESTRING, removal_modules_lexicon.$list177);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_CHECK, $list_alt64);
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG1, $list_alt66);
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG2, $list_alt69);
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG3, $list_alt71);
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, $list_alt73);
            inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, $list_alt75);
            define_test_case_table_int(HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, list(new SubLObject[]{ $TEST, $sym90$SUPPORTS_HAVE_PREDS_, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt97);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, $list_alt125);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, $list_alt127);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG3, $list_alt129);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, $list_alt131);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1, $list_alt133);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, $list_alt135);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, $list_alt137);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, $list_alt139);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, $list_alt148);
            inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, $list_alt150);
            note_funcall_helper_function($sym164$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
            preference_modules.inference_preference_module($TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list_alt166);
            preference_modules.inference_preference_module($TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, $list_alt168);
            inference_modules.inference_removal_module($REMOVAL_LEXICON_NAMESTRING, $list_alt170);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_lexicon_file_Previous() {
        note_funcall_helper_function(removal_modules_lexicon.HL_VERIFY_WORD_STRINGS);
        note_funcall_helper_function(removal_modules_lexicon.HL_JUSTIFY_WORD_STRINGS);
        note_funcall_helper_function(removal_modules_lexicon.HL_FORWARD_MT_COMBOS_WORD_STRINGS);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_CHECK, removal_modules_lexicon.$list7);
        note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_UNIFY_ARG1, removal_modules_lexicon.$list11);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_STRINGS_UNIFY_ARG2, removal_modules_lexicon.$list14);
        register_method($print_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(removal_modules_lexicon.$list39);
        def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE);
        def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ARG1, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ARG1);
        def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ARG2, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ARG2);
        def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_TRIE_ITERATOR, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR);
        def_csetf(removal_modules_lexicon.REMOVAL_WSI_STATE_ENTRY_ITERATOR, removal_modules_lexicon._CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR);
        identity(removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(removal_modules_lexicon.VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD));
        note_funcall_helper_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_DONE);
        note_funcall_helper_function(removal_modules_lexicon.ITERATOR_WORD_STRINGS_NEXT);
        note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR);
        note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS);
        note_funcall_helper_function(removal_modules_lexicon.REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_CHECK, removal_modules_lexicon.$list71);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG1, removal_modules_lexicon.$list73);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG2, removal_modules_lexicon.$list76);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARG3, removal_modules_lexicon.$list78);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, removal_modules_lexicon.$list80);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, removal_modules_lexicon.$list82);
        note_funcall_helper_function(removal_modules_lexicon.HL_VERIFY_TERM_PHRASES);
        note_funcall_helper_function(removal_modules_lexicon.HL_JUSTIFY_TERM_PHRASES);
        note_funcall_helper_function(removal_modules_lexicon.HL_FORWARD_MT_COMBOS_TERM_PHRASES);
        define_test_case_table_int(removal_modules_lexicon.HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, list(new SubLObject[]{ $TEST, removal_modules_lexicon.$sym97$SUPPORTS_HAVE_PREDS_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), removal_modules_lexicon.$list103);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, removal_modules_lexicon.$list132);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, removal_modules_lexicon.$list134);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG3, removal_modules_lexicon.$list136);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, removal_modules_lexicon.$list138);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG1, removal_modules_lexicon.$list140);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, removal_modules_lexicon.$list142);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, removal_modules_lexicon.$list144);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, removal_modules_lexicon.$list146);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, removal_modules_lexicon.$list155);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, removal_modules_lexicon.$list157);
        register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$termPhrases);
        register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$termPhrases_CaseInsensitive);
        register_solely_specific_removal_module_predicate(removal_modules_lexicon.$$wordForms);
        note_funcall_helper_function(removal_modules_lexicon.REMOVAL_LEXICON_NAMESTRING_EXPAND);
        note_funcall_helper_function(removal_modules_lexicon.$sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
        inference_preference_module(removal_modules_lexicon.$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, removal_modules_lexicon.$list173);
        inference_preference_module(removal_modules_lexicon.$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, removal_modules_lexicon.$list175);
        inference_removal_module(removal_modules_lexicon.$REMOVAL_LEXICON_NAMESTRING, removal_modules_lexicon.$list177);
        return NIL;
    }

    private static SubLObject _constant_103_initializer() {
        return list(new SubLObject[]{ list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"), reader_make_constant_shell("nameString"), makeString("COPD-PFT")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("acronymString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Atherosclerosis"), reader_make_constant_shell("nonPlural-Generic"), makeString("hardening of the arteries")), reader_make_constant_shell("EnglishCompositionalPhrasesLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("presentParticiple"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("OpenEndedInvestmentCompany"), reader_make_constant_shell("nameString"), makeString("OEIC")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("initialismString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ScubaDiving"), reader_make_constant_shell("nonPlural-Generic"), makeString("scuba diving")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("infinitive"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("SupraventricularTachycardia"), reader_make_constant_shell("MassNoun"), makeString("supraventricular tach")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("multiWordString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Hepatitis"), reader_make_constant_shell("massNumber"), makeString("hepatitis")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("massNumber"), reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("GolfCourse"), reader_make_constant_shell("plural"), makeString("links")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"), reader_make_constant_shell("nonPlural-Generic"), makeString("COPD confirmed by a pulmonary function test")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("TetralogyOfFallotWithAbsentPulmonaryValve"), reader_make_constant_shell("nonPlural-Generic"), makeString("Tetralogy of Fallot with absent pulmonary valve")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("pnMassNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("DiseaseOfTheAorta"), reader_make_constant_shell("CountNoun"), makeString("disease of the aorta")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Tennis-TheGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("tennis")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("PorscheCar"), reader_make_constant_shell("nonPlural-Generic"), makeString("Porsche")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("pnSingular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("InLineSkating"), reader_make_constant_shell("nonPlural-Generic"), makeString("roller-blading")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("infinitive"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("EnemaAdministeringEvent"), reader_make_constant_shell("nonPlural-Generic"), makeString("enema")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Exercising"), reader_make_constant_shell("nonPlural-Generic"), makeString("Bewegung")), reader_make_constant_shell("GermanLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("singular-Feminine"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Baseball-TheGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("the game of baseball")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AtrialFibrillationOrFlutter"), reader_make_constant_shell("nonPlural-Generic"), makeString("atrial fibrillation or flutter")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("SinglesTableTennis"), reader_make_constant_shell("nonPlural-Generic"), makeString("singles table tennis")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("VentricularSeptalDefect-Atrial-ventricularCanalType"), reader_make_constant_shell("nonPlural-Generic"), makeString("A-V canal type VSD")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("pnSingular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Poker-CardGame"), reader_make_constant_shell("nonPlural-Generic"), makeString("poker game")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("DiseaseOfTheDescendingAorta"), reader_make_constant_shell("MassNoun"), makeString("disease of the descending aorta")), reader_make_constant_shell("EnglishCompositionalPhrasesLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("compoundString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Franchise"), reader_make_constant_shell("Noun"), makeString("franchises")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("genls"), reader_make_constant_shell("denotation"), reader_make_constant_shell("regularSuffix"), reader_make_constant_shell("singular"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Ox"), reader_make_constant_shell("CountNoun"), makeString("oxen")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("Calcification"), reader_make_constant_shell("MassNoun"), makeString("calcification")), reader_make_constant_shell("EnglishJargonMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AtresiaWithVentricularSeptalDefect-PulmonaryValve"), reader_make_constant_shell("MassNoun"), makeString("pulmonary valve atresia with ventricular septal defect")), reader_make_constant_shell("MedicalLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("headMedialString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("RenalFailure"), reader_make_constant_shell("MassNoun"), makeString("renal failure")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("massNumber"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("AbnormalNumberOfCusps"), reader_make_constant_shell("nonPlural-Generic"), makeString("abnormal num of cusps")), reader_make_constant_shell("CCFLexicalMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("headMedialString"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), reader_make_constant_shell("Ox"), reader_make_constant_shell("CountNoun"), makeString("oXen")), reader_make_constant_shell("GeneralEnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("speechPartPreds"), reader_make_constant_shell("denotation"), reader_make_constant_shell("plural"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("CharacterString"), makeString("the yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("NounPhrase"), makeString("a yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell("termPhrases"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Submarine"), reader_make_constant_shell("mainColorOfObject"), reader_make_constant_shell("YellowColor")), reader_make_constant_shell("singular-Generic"), makeString("yellow submarine")), reader_make_constant_shell("EnglishMt"), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell("termPhrases-Lexical"))) });
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt4 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-pred> <fully bound> <string>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord \"dog\")") });

    @Override
    public void declareFunctions() {
        removal_modules_lexicon.declare_removal_modules_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        removal_modules_lexicon.init_removal_modules_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        removal_modules_lexicon.setup_removal_modules_lexicon_file();
    }

    static {
    }

    public static final class $removal_word_strings_iterator_state_native extends SubLStructNative {
        public SubLObject $speech_part_predicate;

        public SubLObject $arg1;

        public SubLObject $arg2;

        public SubLObject $trie_iterator;

        public SubLObject $entry_iterator;

        private static final SubLStructDeclNative structDecl;

        public $removal_word_strings_iterator_state_native() {
            removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$speech_part_predicate = Lisp.NIL;
            removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg1 = Lisp.NIL;
            removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg2 = Lisp.NIL;
            removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$trie_iterator = Lisp.NIL;
            removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$entry_iterator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$speech_part_predicate;
        }

        @Override
        public SubLObject getField3() {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg1;
        }

        @Override
        public SubLObject getField4() {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg2;
        }

        @Override
        public SubLObject getField5() {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$trie_iterator;
        }

        @Override
        public SubLObject getField6() {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$entry_iterator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$speech_part_predicate = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg1 = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$arg2 = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$trie_iterator = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return removal_modules_lexicon.$removal_word_strings_iterator_state_native.this.$entry_iterator = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native.class, removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE, removal_modules_lexicon.REMOVAL_WORD_STRINGS_ITERATOR_STATE_P, removal_modules_lexicon.$list33, removal_modules_lexicon.$list34, new String[]{ "$speech_part_predicate", "$arg1", "$arg2", "$trie_iterator", "$entry_iterator" }, removal_modules_lexicon.$list35, removal_modules_lexicon.$list36, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("POS-PRED")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("POS-PRED"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("WORD-STRINGS"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$wordStrings ?WHAT \"dog\")") });

    static private final SubLList $list_alt12 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("ARG2"));

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("SPEECH-PART-PRED?")), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), $COST, makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord ?STRING)") });

    public static final class $removal_word_strings_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $removal_word_strings_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lexicon.removal_word_strings_iterator_state_p(arg1);
        }
    }

    static private final SubLString $str_alt21$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt28$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt29$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt32 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("TRIE-ITERATOR"), makeSymbol("ENTRY-ITERATOR"));

    static private final SubLList $list_alt33 = list(makeKeyword("SPEECH-PART-PREDICATE"), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("TRIE-ITERATOR"), makeKeyword("ENTRY-ITERATOR"));

    static private final SubLList $list_alt34 = list(makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("REMOVAL-WSI-STATE-ARG1"), makeSymbol("REMOVAL-WSI-STATE-ARG2"), makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR"));

    static private final SubLList $list_alt35 = list(makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR"));

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt56 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt59 = cons(makeSymbol("STRING"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt61 = list(makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2"), makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1"), makeKeyword("REMOVAL-WORD-STRINGS-CHECK"));

    static private final SubLList $list_alt64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully bound> <fully bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Ox-TheWord #$plural \"oxen\")") });

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD #$plural \"dogs\")") });

    static private final SubLList $list_alt69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED \"dogs\")") });

    static private final SubLList $list_alt71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord #$plural ?STRING)") });

    static private final SubLList $list_alt73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD ?PRED \"dogs\")") });

    static private final SubLList $list_alt75 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("wordForms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("wordForms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED"), $COST, makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED ?STRING)") });

    public static final SubLObject $const83$termPhrases_CaseInsensitive_Lexic = reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical");

    static private final SubLList $list_alt85 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLSymbol $sym90$SUPPORTS_HAVE_PREDS_ = makeSymbol("SUPPORTS-HAVE-PREDS?");

    static private final SubLString $$$baxter = makeString("baxter");

    public static final SubLObject $list_alt97 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon._constant_97_initializer();

    static private final SubLSymbol $sym98$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    static private final SubLList $list_alt102 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list_alt103 = list(makeKeyword("OR"), reader_make_constant_shell("termPhrases"), reader_make_constant_shell("termPhrases-CaseInsensitive"));

    static private final SubLList $list_alt104 = list(list(makeSymbol("GAF"), makeSymbol("TERM"), makeSymbol("PREDICATE"), makeSymbol("INDEX-ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt110 = list(makeKeyword("TRUTH"), $TRUE);

    static private final SubLList $list_alt112 = list(makeSymbol("TERM"), makeSymbol("CONSTRAINT"), makeSymbol("ARG3"));

    static private final SubLSymbol $sym114$GENERIC_PRED_ = makeSymbol("GENERIC-PRED?");

    static private final SubLSymbol $sym116$NAME_STRING_PRED_ = makeSymbol("NAME-STRING-PRED?");

    static private final SubLList $list_alt125 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)") });

    static private final SubLList $list_alt127 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)") });

    static private final SubLList $list_alt129 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    static private final SubLList $list_alt131 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    static private final SubLList $list_alt133 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?WHAT #$singular \"emu\")") });

    static private final SubLList $list_alt135 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")") });

    static private final SubLList $list_alt137 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-Lexical"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-Lexical ?WHAT #$singular \"emu\")") });

    static private final SubLList $list_alt139 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")") });

    static private final SubLList $list_alt140 = list(makeSymbol("ARG1"), makeSymbol("CONSTRAINT"), makeSymbol("STRING"));

    static private final SubLList $list_alt145 = list(reader_make_constant_shell("termPhrases-CaseInsensitive"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"));

    static private final SubLList $list_alt146 = list(reader_make_constant_shell("termPhrases-Lexical"), reader_make_constant_shell("termPhrases-CaseInsensitive-Lexical"));

    static private final SubLList $list_alt148 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")") });

    static private final SubLList $list_alt150 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termPhrases-CaseInsensitive"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")") });

    static private final SubLList $list_alt151 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("STRING"));

    static private final SubLList $list_alt152 = list(makeSymbol("DENOT"), makeSymbol("PRED"));

    static private final SubLList $list_alt157 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("STRING"));

    static private final SubLList $list_alt158 = list($BIND, makeSymbol("NAME-PRED"));

    static private final SubLList $list_alt159 = list($BIND, makeSymbol("DENOT"));

    static private final SubLSymbol $sym164$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ = makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?");

    static private final SubLList $list_alt166 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt168 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell("termPhrases")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt170 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("NL-TRIE-NAME-STRING-PRED?")), makeKeyword("ANYTHING"), list($TEST, makeSymbol("STRINGP"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon."), makeKeyword("EXAMPLE"), makeString("(#$nameString ?WHO \"Cher\")") });
}

/**
 * Total time: 3448 ms
 */
