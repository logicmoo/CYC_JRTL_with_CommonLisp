/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SUGGESTIONS-REVIEW-TOOL
 *  source file: /cyc/top/cycl/butler/suggestions-review-tool.lisp
 *  created:     2019/07/03 17:39:04
 */
public final class suggestions_review_tool extends SubLTranslatedFile implements V02 {
    // // Constructor
    private suggestions_review_tool() {
    }

    public static final SubLFile me = new suggestions_review_tool();

    public static final String myName = "com.cyc.cycjava.cycl.butler.suggestions_review_tool";

    // // Definitions
    /**
     * The tool name to display on the intro page, etc.
     */
    // deflexical
    private static final SubLSymbol $suggestions_review_tool_name$ = makeSymbol("*SUGGESTIONS-REVIEW-TOOL-NAME*");

    // deflexical
    private static final SubLSymbol $review_pred_choice_guid_strings$ = makeSymbol("*REVIEW-PRED-CHOICE-GUID-STRINGS*");

    /**
     * Possible types of sentences to review
     */
    // deflexical
    private static final SubLSymbol $review_pred_choices$ = makeSymbol("*REVIEW-PRED-CHOICES*");

    public static final SubLObject initialize_review_pred_choices() {
        {
            SubLObject choices = NIL;
            SubLObject cdolist_list_var = $review_pred_choice_guid_strings$.getGlobalValue();
            SubLObject guid_string = NIL;
            for (guid_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , guid_string = cdolist_list_var.first()) {
                {
                    SubLObject pred = NIL;
                    SubLObject error = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    pred = constants_high.find_constant_by_guid(Guids.string_to_guid(guid_string));
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL == error) {
                        if (NIL == pred) {
                            error = cconcatenate($str_alt5$Failed_to_find_a_constant_with_th, format_nil.format_nil_s_no_copy(guid_string));
                        } else {
                            choices = cons(pred, choices);
                        }
                    }
                    if (NIL != error) {
                        Errors.warn($str_alt6$While_initializing__REVIEW_PRED_C, error);
                    }
                }
            }
            $review_pred_choices$.setGlobalValue(nreverse(choices));
        }
        return NIL;
    }

    public static final SubLObject review_pred_choices() {
        if ($review_pred_choices$.getGlobalValue() == $UNINITIALIZED) {
            initialize_review_pred_choices();
        }
        return $review_pred_choices$.getGlobalValue();
    }

    // defconstant
    private static final SubLSymbol $output_pred$ = makeSymbol("*OUTPUT-PRED*");

    /**
     * A lock for synchronizing access to the pools of suggested sentences.
     */
    // deflexical
    private static final SubLSymbol $suggested_sentence_pools_lock$ = makeSymbol("*SUGGESTED-SENTENCE-POOLS-LOCK*");

    /**
     * A dictionary mapping mt->sentence-pool
     * where 'sentence-pool' means dictionary mapping pred->sentence-set
     * where sentence-set is the set of sentences in need of review because they appear as arguments to the relevant pred in the relevant mt and haven't been reviewed (enough) yet
     */
    // deflexical
    private static final SubLSymbol $suggested_sentence_pools_dictionary$ = makeSymbol("*SUGGESTED-SENTENCE-POOLS-DICTIONARY*");

    public static final SubLObject get_one_suggested_sentence(SubLObject source_mt) {
        {
            SubLObject sentence = NIL;
            SubLObject predicate = NIL;
            SubLObject lock = $suggested_sentence_pools_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                possibly_initialize_suggested_sentence_pool(source_mt);
                {
                    SubLObject predicates = sentence_suggestion_predicates_for_mt(source_mt);
                    if (NIL != predicates) {
                        predicate = list_utilities.random_element(predicates);
                        sentence = get_one_suggested_sentence_for_predicate(predicate, source_mt);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return values(sentence, predicate);
        }
    }

    public static final SubLObject sentence_suggestion_predicates_for_mt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preds = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sentence_pool_for_mt(mt)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject sentence_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == set.set_emptyP(sentence_set)) {
                            preds = cons(pred, preds);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return preds;
            }
        }
    }

    public static final SubLObject get_one_suggested_sentence_for_predicate(SubLObject predicate, SubLObject source_mt) {
        {
            SubLObject v_set = get_sentence_set_for_pred(predicate, source_mt);
            return set_utilities.set_remove_random_element(v_set);
        }
    }

    public static final SubLObject get_sentence_set_for_pred(SubLObject pred, SubLObject source_mt) {
        {
            SubLObject pool = get_sentence_pool_for_mt(source_mt);
            return get_sentence_set_for_pred_from_pool(pred, pool);
        }
    }

    public static final SubLObject get_sentence_pool_for_mt(SubLObject mt) {
        return dictionary.dictionary_lookup($suggested_sentence_pools_dictionary$.getGlobalValue(), mt, UNPROVIDED);
    }

    public static final SubLObject get_sentence_set_for_pred_from_pool(SubLObject pred, SubLObject pool) {
        return dictionary.dictionary_lookup(pool, pred, UNPROVIDED);
    }

    public static final SubLObject possibly_initialize_suggested_sentence_pool(SubLObject source_mt) {
        if (NIL == dictionary.dictionary_p(dictionary.dictionary_lookup($suggested_sentence_pools_dictionary$.getGlobalValue(), source_mt, UNPROVIDED))) {
            return initialize_suggested_sentence_pool(source_mt);
        }
        return NIL;
    }

    /**
     * Initialize the pool of not-yet-reviewed suggested sentences in SOURCE-MT.
     */
    public static final SubLObject initialize_suggested_sentence_pool(SubLObject source_mt) {
        {
            SubLObject preds = review_pred_choices();
            SubLObject pool = dictionary.new_dictionary(symbol_function(EQ), length(preds));
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                initialize_sentence_set_for_pred_in_pool(pred, pool, source_mt);
            }
            return dictionary.dictionary_enter($suggested_sentence_pools_dictionary$.getGlobalValue(), source_mt, pool);
        }
    }

    public static final SubLObject initialize_sentence_set_for_pred_in_pool(SubLObject pred, SubLObject pool, SubLObject source_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(source_mt, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                            SubLObject done_var_1 = NIL;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assn = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assn);
                                                                    if (NIL != valid_3) {
                                                                        set.set_add(cycl_utilities.formula_arg2(assn, UNPROVIDED), sentence_set);
                                                                    }
                                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(narts_high.find_nart(ssrev_evaluations_mt(source_mt)), thread);
                        {
                            SubLObject pred_var = $output_pred$.getGlobalValue();
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                            SubLObject done_var_5 = NIL;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject assn = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != assn);
                                                                    if (NIL != valid_7) {
                                                                        set.set_remove(cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(assn, UNPROVIDED), UNPROVIDED), sentence_set);
                                                                    }
                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
                return dictionary.dictionary_enter(pool, pred, sentence_set);
            }
        }
    }

    public static final SubLObject ssrev_handle_init_params(SubLObject args) {
        {
            SubLObject source_mt_identifier = html_utilities.html_extract_input($str_alt11$source_mt, args);
            SubLObject source_mt = cb_utilities.cb_guess_term(source_mt_identifier, UNPROVIDED);
            return hyp_sent_tool_int(source_mt_identifier, source_mt);
        }
    }

    public static final SubLObject ssrev_initialize_parameters(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $suggestions_review_tool_name$.getGlobalValue();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt15$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(frame_name_var);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt16$ssrev_handle_init_params, T, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt17$Source_Microtheory_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    {
                                                        SubLObject suggestions_mts_in_el = NIL;
                                                        SubLObject mt_identifiers = NIL;
                                                        {
                                                            SubLObject _prev_bind_0_12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_13 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = review_pred_choices();
                                                                    SubLObject pred = NIL;
                                                                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject pred_var = pred;
                                                                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                                                {
                                                                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                                                            SubLObject done_var_14 = NIL;
                                                                                                            SubLObject token_var_15 = NIL;
                                                                                                            while (NIL == done_var_14) {
                                                                                                                {
                                                                                                                    SubLObject assn = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                                                                                    SubLObject valid_16 = makeBoolean(token_var_15 != assn);
                                                                                                                    if (NIL != valid_16) {
                                                                                                                        {
                                                                                                                            SubLObject mt = assertions_high.assertion_mt(assn);
                                                                                                                            SubLObject mt_in_el = cycl_utilities.hl_to_el(mt);
                                                                                                                            if (NIL == subl_promotions.memberP(mt_in_el, suggestions_mts_in_el, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                                suggestions_mts_in_el = cons(mt_in_el, suggestions_mts_in_el);
                                                                                                                                mt_identifiers = cons(cb_utilities.cb_term_identifier(mt), mt_identifiers);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var_14 = makeBoolean(NIL == valid_16);
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } finally {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
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
                                                                    }
                                                                }
                                                            } finally {
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_13, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                        html_utilities.html_select_from_list($str_alt11$source_mt, $$SuggestedSentencesMt, suggestions_mts_in_el, mt_identifiers);
                                                    }
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns the MT in which all the evaluation assertions (of the suggested
     * sentences) shall be made.
     *
     * @param SOURCE-MT;
     * 		microtheory from which the suggested sentences are drawn
     * @return EVALUATIONS-MT, a microtheory.
     */
    public static final SubLObject ssrev_evaluations_mt(SubLObject source_mt) {
        {
            SubLObject evaluations_mt = list($$SuggestedSentenceEvaluationsMtFn, source_mt);
            if (NIL == narts_high.find_nart(evaluations_mt)) {
                rkf_assertion_utilities.rkf_assert_with_implicature(list($$genlMt, evaluations_mt, source_mt), $$UniversalVocabularyMt, $NOW);
            }
            return evaluations_mt;
        }
    }

    public static final SubLObject ssrev_get_referring_urls(SubLObject sentence) {
        {
            SubLObject nart_mts = NIL;
            SubLObject cdolist_list_var = assertion_utilities.mts_of_assertions(czer_meta.find_assertions_cycl(sentence, UNPROVIDED));
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                if (NIL != nart_handles.nart_p(mt)) {
                    {
                        SubLObject item_var = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(mt, UNPROVIDED), UNPROVIDED), UNPROVIDED);
                        if (NIL == member(item_var, nart_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            nart_mts = cons(item_var, nart_mts);
                        }
                    }
                }
            }
            return nart_mts;
        }
    }

    public static final SubLObject rb_ynd_block(SubLObject string, SubLObject header, SubLObject pos_string, SubLObject neg_string, SubLObject dunno_string) {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(header);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ(pos_string);
        html_utilities.html_radio_input(string, $YES, NIL);
        html_utilities.html_glyph($NBSP, FOUR_INTEGER);
        html_utilities.html_princ(neg_string);
        html_utilities.html_radio_input(string, $NO, NIL);
        html_utilities.html_glyph($NBSP, FOUR_INTEGER);
        html_utilities.html_princ(dunno_string);
        html_utilities.html_radio_input(string, $UNSURE, T);
        html_utilities.html_newline(TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject cb_link_review_suggested_sentences(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt30$_Sentence_Review_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt32$hyp_sent_tool);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject hyp_sent_tool(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($suggestions_review_tool_name$.getGlobalValue());
        } else {
            ssrev_initialize_parameters(args);
        }
        return NIL;
    }

    public static final SubLObject hyp_sent_tool_int(SubLObject source_mt_identifier, SubLObject source_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sent = get_one_suggested_sentence(source_mt);
                SubLObject pred = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject sentence_text = pph_main.generate_text(sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject starttime = get_universal_time();
                    if (NIL == sent) {
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ($str_alt40$No_more_unreviewed_sentences_in_t);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt41$Mt__);
                        cb_utilities.cb_form(source_mt, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($REVIEW_SUGGESTED_SENTENCES, $str_alt42$Click_to_re_enter_tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        html_utilities.html_princ($str_alt43$Sentence_);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ(sentence_text);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ($str_alt44$CycL_Assertion_);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        cb_utilities.cb_form(sent, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt45$Sentence_type__);
                        cb_utilities.cb_form(pred, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                        {
                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input($str_alt46$hyp_sent_handle, T, UNPROVIDED);
                                    html_utilities.html_hidden_input($$$sentence, string_utilities.to_lisp_string(sent), UNPROVIDED);
                                    html_utilities.html_hidden_input($str_alt11$source_mt, source_mt_identifier, UNPROVIDED);
                                    html_utilities.html_hidden_input($$$textreviewed, sentence_text, UNPROVIDED);
                                    html_utilities.html_hidden_input($$$starttime, starttime, UNPROVIDED);
                                    if (source_mt != $$GAFGatheringExperimentLogMt) {
                                        html_utilities.html_submit_input($$$This_is_incomprehensible, $$$done, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$This_is_ridiculous, $$$done, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                    }
                                    if (source_mt != $$GAFGatheringExperimentLogMt) {
                                        {
                                            SubLObject _prev_bind_0_18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1_19 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                {
                                                    SubLObject sources = ssrev_get_referring_urls(sent);
                                                    if (NIL != list_utilities.non_empty_list_p(sources)) {
                                                        html_utilities.html_princ($str_alt54$Sources_);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = sources;
                                                            SubLObject source = NIL;
                                                            for (source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source = cdolist_list_var.first()) {
                                                                if (NIL != source) {
                                                                    cb_utilities.cb_form(source, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_19, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    }
                                    if (source_mt != $$GAFGatheringExperimentLogMt) {
                                        rb_ynd_block($$$goodparse, $str_alt56$Is_this_a_good_parse_of_the_sourc, $$$Good_parse, $str_alt58$Bad_Incorrect_parse, $$$Not_sure);
                                        rb_ynd_block($$$plausible, $str_alt61$How_reasonable__plausible__does_t, $$$Reasonable, $$$Unreasonable, $$$Not_sure);
                                        rb_ynd_block($$$interesting, $str_alt65$Is_this_something_Cyc_should_know, $$$Worth_knowing, $$$Not_worth_knowing, $str_alt68$Don_t_know);
                                    }
                                    rb_ynd_block($$$true, $str_alt70$Is_this_sentence_true__correct__, $$$Yes, $$$No, $str_alt68$Don_t_know);
                                    if (source_mt != $$GAFGatheringExperimentLogMt) {
                                        html_utilities.html_glyph($NBSP, EIGHT_INTEGER);
                                        html_utilities.html_princ($str_alt73$If_information_was_found_on_the_w);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_glyph($NBSP, EIGHT_INTEGER);
                                        html_utilities.html_text_input($$$url, string_utilities.$empty_string$.getGlobalValue(), $int$80);
                                        html_utilities.html_newline(TWO_INTEGER);
                                    }
                                    html_utilities.html_submit_input($$$Done, $$$done, UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        }
                        cb_utilities.cb_help_preamble($CB_SUGGESTED_SENTENCE_REVIEW, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_glyph($LARR, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                        html_utilities.html_princ($$$Click_for_help_with_these_choices);
                        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject hyp_sent_handle(SubLObject args) {
        {
            SubLObject sent = read_from_string(string_utilities.remove_substring(string_utilities.string_substitute($str_alt79$_, $str_alt80$__, html_utilities.html_extract_input($$$sentence, args), UNPROVIDED), $str_alt81$__), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject source_mt_identifier = html_utilities.html_extract_input($str_alt11$source_mt, args);
            SubLObject source_mt = cb_utilities.cb_guess_term(source_mt_identifier, UNPROVIDED);
            SubLObject evaluations_mt = ssrev_evaluations_mt(source_mt);
            SubLObject text = html_utilities.html_extract_input($$$textreviewed, args);
            SubLObject start_date = date_utilities.universal_time_to_cycl_date(read_from_string(html_utilities.html_extract_input($$$starttime, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject submit_val = html_utilities.html_extract_input($$$done, args);
            SubLObject goodparse = html_utilities.html_extract_input($$$goodparse, args);
            SubLObject plausible = html_utilities.html_extract_input($$$plausible, args);
            SubLObject interesting = html_utilities.html_extract_input($$$interesting, args);
            SubLObject truth = html_utilities.html_extract_input($$$true, args);
            SubLObject url = html_utilities.html_extract_input($$$url, args);
            SubLObject eval_properties = list($START, start_date, $TEXT, text);
            if (NIL != Strings.stringE(submit_val, $$$This_is_incomprehensible, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                putf(eval_properties, $FAIL, $UNCLEAR);
            }
            if (NIL != Strings.stringE(submit_val, $$$This_is_ridiculous, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                putf(eval_properties, $FAIL, $RIDICULOUS);
            }
            if (NIL != Strings.stringE(submit_val, $$$Done, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                if (NIL != string_utilities.non_empty_string_p(url)) {
                    putf(eval_properties, $URL, url);
                }
                if (goodparse.isString()) {
                    if (NIL != Strings.stringE(goodparse, $$$YES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        putf(eval_properties, $GOODPARSE, T);
                    } else
                        if (NIL != Strings.stringE(goodparse, $$$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            putf(eval_properties, $GOODPARSE, NIL);
                        }

                }
                if (plausible.isString()) {
                    if (NIL != Strings.stringE(plausible, $$$YES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        putf(eval_properties, $PLAUSIBLE, T);
                    } else
                        if (NIL != Strings.stringE(plausible, $$$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            putf(eval_properties, $PLAUSIBLE, NIL);
                        }

                }
                if (interesting.isString()) {
                    if (NIL != Strings.stringE(interesting, $$$YES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        putf(eval_properties, $INTERESTING, T);
                    } else
                        if (NIL != Strings.stringE(interesting, $$$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            putf(eval_properties, $INTERESTING, NIL);
                        }

                }
                if (truth.isString()) {
                    if (NIL != Strings.stringE(truth, $$$YES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        putf(eval_properties, $TRUTH, T);
                    } else
                        if (NIL != Strings.stringE(truth, $$$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            putf(eval_properties, $TRUTH, NIL);
                        }

                }
            }
            create_sentence_evaluation(sent, evaluations_mt, eval_properties);
            hyp_sent_tool_int(source_mt_identifier, source_mt);
        }
        return T;
    }

    // defconstant
    private static final SubLSymbol $eval_nart_function$ = makeSymbol("*EVAL-NART-FUNCTION*");

    // defconstant
    private static final SubLSymbol $eval_function$ = makeSymbol("*EVAL-FUNCTION*");

    // defconstant
    private static final SubLSymbol $starting_date_pred$ = makeSymbol("*STARTING-DATE-PRED*");

    // defconstant
    private static final SubLSymbol $ending_date_pred$ = makeSymbol("*ENDING-DATE-PRED*");

    // defconstant
    private static final SubLSymbol $proposition_coll$ = makeSymbol("*PROPOSITION-COLL*");

    // defconstant
    private static final SubLSymbol $evaluee_pred$ = makeSymbol("*EVALUEE-PRED*");

    // defparameter
    private static final SubLSymbol $evaluation_pred_guid_strings$ = makeSymbol("*EVALUATION-PRED-GUID-STRINGS*");

    /**
     * This gets initialized in @xref ENSURE-EVALUATION-PREDS-INITIALIZED using @xref *EVALUATION-PRED-GUID-STRINGS*
     */
    // defparameter
    private static final SubLSymbol $evaluation_preds$ = makeSymbol("*EVALUATION-PREDS*");

    // defparameter
    private static final SubLSymbol $negated_evaluation_pred_guid_strings$ = makeSymbol("*NEGATED-EVALUATION-PRED-GUID-STRINGS*");

    /**
     * This gets initialized in @xref ENSURE-EVALUATION-PREDS-INITIALIZED using @xref *NEGATED-EVALUATION-PRED-GUID-STRINGS*
     */
    // defparameter
    private static final SubLSymbol $negated_evaluation_preds$ = makeSymbol("*NEGATED-EVALUATION-PREDS*");

    public static final SubLObject evaluation_preds_initializedP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean($negated_evaluation_preds$.getDynamicValue(thread).isCons() && $evaluation_preds$.getDynamicValue(thread).isCons());
        }
    }

    public static final SubLObject initialize_evaluation_preds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = $evaluation_pred_guid_strings$.getDynamicValue(thread);
                SubLObject tuple = NIL;
                for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                    {
                        SubLObject tag = tuple.first();
                        SubLObject guid_string = tuple.rest();
                        SubLObject guid = Guids.string_to_guid(guid_string);
                        result = cons(cons(tag, constants_high.find_constant_by_external_id(guid)), result);
                    }
                }
                $evaluation_preds$.setDynamicValue(result, thread);
            }
            return list_utilities.sublisp_boolean($evaluation_preds$.getDynamicValue(thread));
        }
    }

    public static final SubLObject initialize_negated_evaluation_preds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = $negated_evaluation_pred_guid_strings$.getDynamicValue(thread);
                SubLObject tuple = NIL;
                for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                    {
                        SubLObject tag = tuple.first();
                        SubLObject guid_string = tuple.rest();
                        SubLObject guid = Guids.string_to_guid(guid_string);
                        result = cons(cons(tag, constants_high.find_constant_by_external_id(guid)), result);
                    }
                }
                $negated_evaluation_preds$.setDynamicValue(result, thread);
            }
            return list_utilities.sublisp_boolean($negated_evaluation_preds$.getDynamicValue(thread));
        }
    }

    public static final SubLObject ensure_evaluation_preds_initialized() {
        if (NIL == evaluation_preds_initializedP()) {
            initialize_evaluation_preds();
            initialize_negated_evaluation_preds();
        }
        return evaluation_preds_initializedP();
    }

    /**
     *
     *
     * @param tag:
     * 		a symbol that maps to a constant in *evaluation-preds*,
     * 		such as :plausible
     * @param positive-sense?:
     * 		if nil, return the _negated_ constant (i.e.,
     * 		(eval-pred :plausible nil -> #$sentenceDeemedImplausible) )
     * 		This is an accessor to the constants used in the KB to represent axes
     * 		of evaluation.
     */
    public static final SubLObject eval_pred(SubLObject tag, SubLObject positive_senseP) {
        if (positive_senseP == UNPROVIDED) {
            positive_senseP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_evaluation_preds_initialized();
            if (NIL != positive_senseP) {
                return assoc(tag, $evaluation_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
            } else {
                return assoc(tag, $negated_evaluation_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
            }
        }
    }

    public static final SubLObject current_sentence_reviewer() {
        return operation_communication.the_cyclist();
    }

    public static final SubLObject assert_eval_output(SubLObject nart, SubLObject pred, SubLObject mt, SubLObject val) {
        if (val == UNPROVIDED) {
            val = NIL;
        }
        {
            SubLObject sent = second(nart);
            if (NIL == val) {
                ke.ke_assert(list($output_pred$.getGlobalValue(), nart, list(pred, sent)), mt, UNPROVIDED, UNPROVIDED);
            } else {
                ke.ke_assert(list($output_pred$.getGlobalValue(), nart, list(pred, sent, val)), mt, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param sent:
     * 		the CycL sentence whose content is being evaluated
     * @param mt:
     * 		mt in which the assertions pertaining to its evaluation
     * 		should be made
     * @param evaluation-properties:
     * 		a plist of the properties that describe
     * 		the evaluation made of the sentence.  See *evaluation-preds*
     * 		and *negated-evaluation-preds* for supported axes.
     * @unknown Some non-axis constants still not factored out.
     */
    public static final SubLObject create_sentence_evaluation(SubLObject sent, SubLObject mt, SubLObject evaluation_properties) {
        if (evaluation_properties == UNPROVIDED) {
            evaluation_properties = NIL;
        }
        SubLTrampolineFile.checkType(sent, CYCL_SENTENCE_P);
        SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
        SubLTrampolineFile.checkType(evaluation_properties, PROPERTY_LIST_P);
        {
            SubLObject submit_time = get_universal_time();
            SubLObject user = current_sentence_reviewer();
            SubLObject end_date = date_utilities.universal_time_to_cycl_date(submit_time);
            SubLObject start_date = getf(evaluation_properties, $START, UNPROVIDED);
            SubLObject text = getf(evaluation_properties, $TEXT, UNPROVIDED);
            SubLObject nart = list($eval_nart_function$.getGlobalValue(), sent, user, submit_time);
            ke.ke_assert(list($$isa, nart, list($eval_function$.getGlobalValue(), $proposition_coll$.getGlobalValue())), mt, UNPROVIDED, UNPROVIDED);
            ke.ke_assert(list($ending_date_pred$.getGlobalValue(), nart, end_date), mt, UNPROVIDED, UNPROVIDED);
            if (NIL != start_date) {
                ke.ke_assert(list($starting_date_pred$.getGlobalValue(), nart, start_date), mt, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != text) {
                ke.ke_assert(list($evaluee_pred$.getGlobalValue(), nart, text), mt, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != list_utilities.indicator_presentP(evaluation_properties, $FAIL)) {
                assert_eval_output(nart, eval_pred(getf(evaluation_properties, $FAIL, UNPROVIDED), UNPROVIDED), mt, UNPROVIDED);
            } else {
                handle_eval_properties(nart, mt, remf(remf(evaluation_properties, $START), $TEXT));
            }
        }
        return T;
    }

    public static final SubLObject handle_eval_properties(SubLObject nart, SubLObject mt, SubLObject eval_properties) {
        if (NIL != list_utilities.indicator_presentP(eval_properties, $URL)) {
            assert_eval_output(nart, eval_pred($URL, UNPROVIDED), mt, getf(eval_properties, $URL, UNPROVIDED));
        }
        {
            SubLObject ep = remf(eval_properties, $URL);
            SubLObject remainder = NIL;
            for (remainder = ep; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject tag = remainder.first();
                    SubLObject val = cadr(remainder);
                    assert_eval_output(nart, eval_pred(tag, val), mt, UNPROVIDED);
                }
            }
        }
        return T;
    }

    public static final SubLObject get_evaluated_rules_of_type(SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $$CorrectRule;
        }
        if (mt == UNPROVIDED) {
            mt = $$SuggestedRulesMt;
        }
        return ask_utilities.query_template($list_alt109, list($$and, $list_alt111, list($$assertedSentence, list($$evaluationOutputSentences, $list_alt113, list($$inducedRuleEvaluation, $sym115$_RULE, type)))), mt, $list_alt116);
    }

    /**
     * Compile a dictionary of RULE -> Cyclists who voted for that rule being correct.
     */
    public static final SubLObject get_votes_for_evaluated_rules_of_type(SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $$CorrectRule;
        }
        if (mt == UNPROVIDED) {
            mt = $$SuggestedRulesMt;
        }
        {
            SubLObject evaluatated_rules = get_evaluated_rules_of_type(type, mt);
            SubLObject voted_rules = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = evaluatated_rules;
            SubLObject evaluated_rule_tuple = NIL;
            for (evaluated_rule_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evaluated_rule_tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = evaluated_rule_tuple;
                    SubLObject current = datum;
                    SubLObject rule = NIL;
                    SubLObject cyclist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    rule = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    cyclist = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        dictionary_utilities.dictionary_push(voted_rules, rule, cyclist);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
            }
            return voted_rules;
        }
    }

    // defparameter
    private static final SubLSymbol $current_compute_vote_display_ordering_set$ = makeSymbol("*CURRENT-COMPUTE-VOTE-DISPLAY-ORDERING-SET*");

    public static final SubLObject suggested_voted_ruleL(SubLObject rule_1, SubLObject rule_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ordering_set = $current_compute_vote_display_ordering_set$.getDynamicValue(thread);
                SubLObject votes_1 = length(dictionary.dictionary_lookup(ordering_set, rule_1, UNPROVIDED));
                SubLObject votes_2 = length(dictionary.dictionary_lookup(ordering_set, rule_2, UNPROVIDED));
                return numL(votes_1, votes_2);
            }
        }
    }

    public static final SubLObject compute_votes_for_evaluated_rules_display_ordering(SubLObject voted_rules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keys = dictionary.dictionary_keys(voted_rules);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $current_compute_vote_display_ordering_set$.currentBinding(thread);
                    try {
                        $current_compute_vote_display_ordering_set$.bind(voted_rules, thread);
                        result = Sort.sort(keys, $sym118$SUGGESTED_VOTED_RULE_, UNPROVIDED);
                    } finally {
                        $current_compute_vote_display_ordering_set$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cb_link_review_rule_evals(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt123$_RuleEvals_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt124$cb_review_rule_evaluations);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_review_rule_evaluations(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Rules_Evaluation_Reviewer);
        } else {
            cb_review_rule_evaluations_internal(args);
        }
        return args;
    }

    public static final SubLObject cb_review_rule_evaluations_internal(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject voted_rules = get_votes_for_evaluated_rules_of_type(UNPROVIDED, UNPROVIDED);
                SubLObject rules_in_display_order = compute_votes_for_evaluated_rules_display_ordering(voted_rules);
                SubLObject title_var = $$$Rules_Evaluation_Reviewer;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt15$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(frame_name_var);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt128$handle_get_review_of_rule_evaluat, T, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(EIGHT_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt129$_xb0e2ff);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_utilities.html_princ($$$Accept);
                                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_utilities.html_princ($$$Rule);
                                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_utilities.html_princ($$$Recommended_by);
                                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            {
                                                                SubLObject list_var = NIL;
                                                                SubLObject rule = NIL;
                                                                SubLObject number = NIL;
                                                                for (list_var = rules_in_display_order, rule = list_var.first(), number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , rule = list_var.first() , number = add(ONE_INTEGER, number)) {
                                                                    {
                                                                        SubLObject voters = dictionary.dictionary_lookup(voted_rules, rule, UNPROVIDED);
                                                                        SubLObject is_assertedP = NIL;
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        is_assertedP = assertion_handles.assertion_p(czer_meta.find_visible_assertion_cycl(rule, $$InferencePSC));
                                                                                        if (NIL != is_assertedP) {
                                                                                            {
                                                                                                SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($GREEN_BALL);
                                                                                                SubLObject align = $TOP;
                                                                                                SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($GREEN_BALL);
                                                                                                SubLObject border = ZERO_INTEGER;
                                                                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(image_src);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                if (NIL != alt) {
                                                                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(alt);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                if (NIL != align) {
                                                                                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(html_utilities.html_align(align));
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                if (NIL != border) {
                                                                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(border);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                                                            }
                                                                                        } else {
                                                                                            html_utilities.html_checkbox_input($$$assert, string_utilities.to_string(number), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        if (NIL != is_assertedP) {
                                                                                            cb_utilities.cb_form(czer_meta.find_visible_assertion_cycl(rule, $$InferencePSC), ZERO_INTEGER, T);
                                                                                        } else {
                                                                                            cb_utilities.cb_form(rule, ZERO_INTEGER, T);
                                                                                        }
                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_32 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                                                                            try {
                                                                                                pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                                                                                cb_utilities.cb_show_sentence_in_nl(rule, UNPROVIDED);
                                                                                            } finally {
                                                                                                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_32, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject cdolist_list_var = voters;
                                                                                            SubLObject voter = NIL;
                                                                                            for (voter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , voter = cdolist_list_var.first()) {
                                                                                                cb_utilities.cb_form(voter, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt139$Note__);
                                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    {
                                                        SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($GREEN_BALL);
                                                        SubLObject align = $TOP;
                                                        SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($GREEN_BALL);
                                                        SubLObject border = ZERO_INTEGER;
                                                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(image_src);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (NIL != alt) {
                                                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(alt);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != align) {
                                                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align(align));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != border) {
                                                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(border);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_princ($str_alt140$_indicates_that_the_rule_is_alrea);
                                                    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                    html_utilities.html_indent(THREE_INTEGER);
                                                    html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_20, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
                return args;
            }
        }
    }

    public static final SubLObject handle_get_review_of_rule_evaluations(SubLObject args) {
        {
            SubLObject voted_rules = get_votes_for_evaluated_rules_of_type(UNPROVIDED, UNPROVIDED);
            SubLObject rules_in_display_order = compute_votes_for_evaluated_rules_display_ordering(voted_rules);
            SubLObject selected_rule_ids = html_utilities.html_extract_input_values($$$assert, args);
            if (NIL != selected_rule_ids) {
                {
                    SubLObject cdolist_list_var = selected_rule_ids;
                    SubLObject selected_rule_id = NIL;
                    for (selected_rule_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_rule_id = cdolist_list_var.first()) {
                        if (NIL != string_utilities.integer_string_p(selected_rule_id)) {
                            {
                                SubLObject index = parse_integer(selected_rule_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject formula = nth(index, rules_in_display_order);
                                cyc_kernel.cyc_assert(formula, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return cb_review_rule_evaluations_internal(NIL);
        }
    }

    public static final SubLObject declare_suggestions_review_tool_file() {
        declareFunction("initialize_review_pred_choices", "INITIALIZE-REVIEW-PRED-CHOICES", 0, 0, false);
        declareFunction("review_pred_choices", "REVIEW-PRED-CHOICES", 0, 0, false);
        declareFunction("get_one_suggested_sentence", "GET-ONE-SUGGESTED-SENTENCE", 1, 0, false);
        declareFunction("sentence_suggestion_predicates_for_mt", "SENTENCE-SUGGESTION-PREDICATES-FOR-MT", 1, 0, false);
        declareFunction("get_one_suggested_sentence_for_predicate", "GET-ONE-SUGGESTED-SENTENCE-FOR-PREDICATE", 2, 0, false);
        declareFunction("get_sentence_set_for_pred", "GET-SENTENCE-SET-FOR-PRED", 2, 0, false);
        declareFunction("get_sentence_pool_for_mt", "GET-SENTENCE-POOL-FOR-MT", 1, 0, false);
        declareFunction("get_sentence_set_for_pred_from_pool", "GET-SENTENCE-SET-FOR-PRED-FROM-POOL", 2, 0, false);
        declareFunction("possibly_initialize_suggested_sentence_pool", "POSSIBLY-INITIALIZE-SUGGESTED-SENTENCE-POOL", 1, 0, false);
        declareFunction("initialize_suggested_sentence_pool", "INITIALIZE-SUGGESTED-SENTENCE-POOL", 1, 0, false);
        declareFunction("initialize_sentence_set_for_pred_in_pool", "INITIALIZE-SENTENCE-SET-FOR-PRED-IN-POOL", 3, 0, false);
        declareFunction("ssrev_handle_init_params", "SSREV-HANDLE-INIT-PARAMS", 1, 0, false);
        declareFunction("ssrev_initialize_parameters", "SSREV-INITIALIZE-PARAMETERS", 1, 0, false);
        declareFunction("ssrev_evaluations_mt", "SSREV-EVALUATIONS-MT", 1, 0, false);
        declareFunction("ssrev_get_referring_urls", "SSREV-GET-REFERRING-URLS", 1, 0, false);
        declareFunction("rb_ynd_block", "RB-YND-BLOCK", 5, 0, false);
        declareFunction("cb_link_review_suggested_sentences", "CB-LINK-REVIEW-SUGGESTED-SENTENCES", 0, 1, false);
        declareFunction("hyp_sent_tool", "HYP-SENT-TOOL", 1, 0, false);
        declareFunction("hyp_sent_tool_int", "HYP-SENT-TOOL-INT", 2, 0, false);
        declareFunction("hyp_sent_handle", "HYP-SENT-HANDLE", 1, 0, false);
        declareFunction("evaluation_preds_initializedP", "EVALUATION-PREDS-INITIALIZED?", 0, 0, false);
        declareFunction("initialize_evaluation_preds", "INITIALIZE-EVALUATION-PREDS", 0, 0, false);
        declareFunction("initialize_negated_evaluation_preds", "INITIALIZE-NEGATED-EVALUATION-PREDS", 0, 0, false);
        declareFunction("ensure_evaluation_preds_initialized", "ENSURE-EVALUATION-PREDS-INITIALIZED", 0, 0, false);
        declareFunction("eval_pred", "EVAL-PRED", 1, 1, false);
        declareFunction("current_sentence_reviewer", "CURRENT-SENTENCE-REVIEWER", 0, 0, false);
        declareFunction("assert_eval_output", "ASSERT-EVAL-OUTPUT", 3, 1, false);
        declareFunction("create_sentence_evaluation", "CREATE-SENTENCE-EVALUATION", 2, 1, false);
        declareFunction("handle_eval_properties", "HANDLE-EVAL-PROPERTIES", 3, 0, false);
        declareFunction("get_evaluated_rules_of_type", "GET-EVALUATED-RULES-OF-TYPE", 0, 2, false);
        declareFunction("get_votes_for_evaluated_rules_of_type", "GET-VOTES-FOR-EVALUATED-RULES-OF-TYPE", 0, 2, false);
        declareFunction("suggested_voted_ruleL", "SUGGESTED-VOTED-RULE<", 2, 0, false);
        declareFunction("compute_votes_for_evaluated_rules_display_ordering", "COMPUTE-VOTES-FOR-EVALUATED-RULES-DISPLAY-ORDERING", 1, 0, false);
        declareFunction("cb_link_review_rule_evals", "CB-LINK-REVIEW-RULE-EVALS", 0, 1, false);
        declareFunction("cb_review_rule_evaluations", "CB-REVIEW-RULE-EVALUATIONS", 0, 1, false);
        declareFunction("cb_review_rule_evaluations_internal", "CB-REVIEW-RULE-EVALUATIONS-INTERNAL", 1, 0, false);
        declareFunction("handle_get_review_of_rule_evaluations", "HANDLE-GET-REVIEW-OF-RULE-EVALUATIONS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_suggestions_review_tool_file() {
        deflexical("*SUGGESTIONS-REVIEW-TOOL-NAME*", $$$Suggested_Sentence_Review);
        deflexical("*REVIEW-PRED-CHOICE-GUID-STRINGS*", list($str_alt1$164caa78_8230_11da_8000_0002b3a85, $str_alt2$1154731a_89cf_11da_8000_0002b3a85));
        deflexical("*REVIEW-PRED-CHOICES*", $UNINITIALIZED);
        defconstant("*OUTPUT-PRED*", $$evaluationOutputSentences);
        deflexical("*SUGGESTED-SENTENCE-POOLS-LOCK*", make_lock($$$Suggested_Sentence_Pools_Lock));
        deflexical("*SUGGESTED-SENTENCE-POOLS-DICTIONARY*", dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        defconstant("*EVAL-NART-FUNCTION*", $$EvaluationOfByOnFn);
        defconstant("*EVAL-FUNCTION*", $$EvaluatingFn);
        defconstant("*STARTING-DATE-PRED*", $$startingDate);
        defconstant("*ENDING-DATE-PRED*", $$endingDate);
        defconstant("*PROPOSITION-COLL*", $$Proposition);
        defconstant("*EVALUEE-PRED*", $$evaluationInput);
        defparameter("*EVALUATION-PRED-GUID-STRINGS*", $list_alt101);
        defparameter("*EVALUATION-PREDS*", NIL);
        defparameter("*NEGATED-EVALUATION-PRED-GUID-STRINGS*", $list_alt102);
        defparameter("*NEGATED-EVALUATION-PREDS*", NIL);
        defparameter("*CURRENT-COMPUTE-VOTE-DISPLAY-ORDERING-SET*", NIL);
        return NIL;
    }

    public static final SubLObject setup_suggestions_review_tool_file() {
                html_macros.note_html_handler_function(SSREV_HANDLE_INIT_PARAMS);
        cb_utilities.setup_cb_link_method($REVIEW_SUGGESTED_SENTENCES, CB_LINK_REVIEW_SUGGESTED_SENTENCES, ONE_INTEGER);
        cb_utilities.declare_cb_tool($REVIEW_SUGGESTED_SENTENCES, $suggestions_review_tool_name$.getGlobalValue(), $$$SSRev, $str_alt36$Review_instances_of___suggestedSe);
        html_macros.note_html_handler_function(HYP_SENT_TOOL);
        sethash($CB_SUGGESTED_SENTENCE_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt39$cb_suggested_sentence_review_html, NIL));
        html_macros.note_html_handler_function(HYP_SENT_HANDLE);
        cb_utilities.declare_cb_tool($REVIEW_RULE_EVALS, $$$Review_Rule_Evaluations, $$$RuleEvals, $str_alt122$Review_how_suggested_rules_where_);
        cb_utilities.setup_cb_link_method($REVIEW_RULE_EVALS, CB_LINK_REVIEW_RULE_EVALS, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_REVIEW_RULE_EVALUATIONS);
        html_macros.note_html_handler_function(HANDLE_GET_REVIEW_OF_RULE_EVALUATIONS);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Suggested_Sentence_Review = makeString("Suggested Sentence Review");

    static private final SubLString $str_alt1$164caa78_8230_11da_8000_0002b3a85 = makeString("164caa78-8230-11da-8000-0002b3a8515e");

    static private final SubLString $str_alt2$1154731a_89cf_11da_8000_0002b3a85 = makeString("1154731a-89cf-11da-8000-0002b3a8518e");





    static private final SubLString $str_alt5$Failed_to_find_a_constant_with_th = makeString("Failed to find a constant with the GUID-string ");

    static private final SubLString $str_alt6$While_initializing__REVIEW_PRED_C = makeString("While initializing *REVIEW-PRED-CHOICES*: ~A");

    public static final SubLObject $$evaluationOutputSentences = constant_handles.reader_make_constant_shell(makeString("evaluationOutputSentences"));

    static private final SubLString $$$Suggested_Sentence_Pools_Lock = makeString("Suggested Sentence Pools Lock");





    static private final SubLString $str_alt11$source_mt = makeString("source-mt");

    private static final SubLSymbol SSREV_HANDLE_INIT_PARAMS = makeSymbol("SSREV-HANDLE-INIT-PARAMS");



    static private final SubLString $str_alt14$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt15$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt16$ssrev_handle_init_params = makeString("ssrev-handle-init-params");

    static private final SubLString $str_alt17$Source_Microtheory_ = makeString("Source Microtheory:");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$SuggestedSentencesMt = constant_handles.reader_make_constant_shell(makeString("SuggestedSentencesMt"));

    static private final SubLString $$$Continue = makeString("Continue");

    public static final SubLObject $$SuggestedSentenceEvaluationsMtFn = constant_handles.reader_make_constant_shell(makeString("SuggestedSentenceEvaluationsMtFn"));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));









    private static final SubLSymbol $UNSURE = makeKeyword("UNSURE");

    static private final SubLString $str_alt30$_Sentence_Review_ = makeString("[Sentence Review]");



    static private final SubLString $str_alt32$hyp_sent_tool = makeString("hyp-sent-tool");

    private static final SubLSymbol $REVIEW_SUGGESTED_SENTENCES = makeKeyword("REVIEW-SUGGESTED-SENTENCES");

    private static final SubLSymbol CB_LINK_REVIEW_SUGGESTED_SENTENCES = makeSymbol("CB-LINK-REVIEW-SUGGESTED-SENTENCES");

    static private final SubLString $$$SSRev = makeString("SSRev");

    static private final SubLString $str_alt36$Review_instances_of___suggestedSe = makeString("Review instances of #$suggestedSentence for plausibility, interest and truth.");

    private static final SubLSymbol HYP_SENT_TOOL = makeSymbol("HYP-SENT-TOOL");

    private static final SubLSymbol $CB_SUGGESTED_SENTENCE_REVIEW = makeKeyword("CB-SUGGESTED-SENTENCE-REVIEW");

    static private final SubLString $str_alt39$cb_suggested_sentence_review_html = makeString("cb-suggested-sentence-review.html");

    static private final SubLString $str_alt40$No_more_unreviewed_sentences_in_t = makeString("No more unreviewed sentences in this Mt.");

    static private final SubLString $str_alt41$Mt__ = makeString("Mt: ");

    static private final SubLString $str_alt42$Click_to_re_enter_tool = makeString("Click to re-enter tool");

    static private final SubLString $str_alt43$Sentence_ = makeString("Sentence:");

    static private final SubLString $str_alt44$CycL_Assertion_ = makeString("CycL Assertion:");

    static private final SubLString $str_alt45$Sentence_type__ = makeString("Sentence type: ");

    static private final SubLString $str_alt46$hyp_sent_handle = makeString("hyp-sent-handle");

    static private final SubLString $$$sentence = makeString("sentence");

    static private final SubLString $$$textreviewed = makeString("textreviewed");

    static private final SubLString $$$starttime = makeString("starttime");

    public static final SubLObject $$GAFGatheringExperimentLogMt = constant_handles.reader_make_constant_shell(makeString("GAFGatheringExperimentLogMt"));

    static private final SubLString $$$This_is_incomprehensible = makeString("This is incomprehensible");

    static private final SubLString $$$done = makeString("done");

    static private final SubLString $$$This_is_ridiculous = makeString("This is ridiculous");

    static private final SubLString $str_alt54$Sources_ = makeString("Sources:");

    static private final SubLString $$$goodparse = makeString("goodparse");

    static private final SubLString $str_alt56$Is_this_a_good_parse_of_the_sourc = makeString("Is this a good parse of the source material?");

    static private final SubLString $$$Good_parse = makeString("Good parse");

    static private final SubLString $str_alt58$Bad_Incorrect_parse = makeString("Bad/Incorrect parse");

    static private final SubLString $$$Not_sure = makeString("Not sure");

    static private final SubLString $$$plausible = makeString("plausible");

    static private final SubLString $str_alt61$How_reasonable__plausible__does_t = makeString("How reasonable (plausible) does this seem?");

    static private final SubLString $$$Reasonable = makeString("Reasonable");

    static private final SubLString $$$Unreasonable = makeString("Unreasonable");

    static private final SubLString $$$interesting = makeString("interesting");

    static private final SubLString $str_alt65$Is_this_something_Cyc_should_know = makeString("Is this something Cyc should know?");

    static private final SubLString $$$Worth_knowing = makeString("Worth knowing");

    static private final SubLString $$$Not_worth_knowing = makeString("Not worth knowing");

    static private final SubLString $str_alt68$Don_t_know = makeString("Don't know");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $str_alt70$Is_this_sentence_true__correct__ = makeString("Is this sentence true (correct)?");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $str_alt73$If_information_was_found_on_the_w = makeString("If information was found on the web, enter URL:");

    static private final SubLString $$$url = makeString("url");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $$$Done = makeString("Done");



    static private final SubLString $$$Click_for_help_with_these_choices = makeString("Click for help with these choices");

    static private final SubLString $str_alt79$_ = makeString(")");

    static private final SubLString $str_alt80$__ = makeString(")>");

    static private final SubLString $str_alt81$__ = makeString("#<");







    private static final SubLSymbol $UNCLEAR = makeKeyword("UNCLEAR");

    private static final SubLSymbol $RIDICULOUS = makeKeyword("RIDICULOUS");



    static private final SubLString $$$YES = makeString("YES");

    private static final SubLSymbol $GOODPARSE = makeKeyword("GOODPARSE");

    static private final SubLString $$$NO = makeString("NO");

    private static final SubLSymbol $PLAUSIBLE = makeKeyword("PLAUSIBLE");





    private static final SubLSymbol HYP_SENT_HANDLE = makeSymbol("HYP-SENT-HANDLE");

    public static final SubLObject $$EvaluationOfByOnFn = constant_handles.reader_make_constant_shell(makeString("EvaluationOfByOnFn"));

    public static final SubLObject $$EvaluatingFn = constant_handles.reader_make_constant_shell(makeString("EvaluatingFn"));

    public static final SubLObject $$startingDate = constant_handles.reader_make_constant_shell(makeString("startingDate"));

    public static final SubLObject $$endingDate = constant_handles.reader_make_constant_shell(makeString("endingDate"));

    public static final SubLObject $$Proposition = constant_handles.reader_make_constant_shell(makeString("Proposition"));

    public static final SubLObject $$evaluationInput = constant_handles.reader_make_constant_shell(makeString("evaluationInput"));

    static private final SubLList $list_alt101 = list(cons(makeKeyword("UNCLEAR"), makeString("550197b6-882b-41d8-9b2d-895d4767fe44")), cons(makeKeyword("RIDICULOUS"), makeString("83ccec94-882b-41d8-9abe-ad3872850019")), cons(makeKeyword("GOODPARSE"), makeString("017db6f2-b72c-11d9-8000-0007e90d99bf")), cons(makeKeyword("URL"), makeString("59f7cb64-882b-41d8-86be-a40cc5158f65")), cons(makeKeyword("PLAUSIBLE"), makeString("55ae9f10-882b-41d8-9884-fc48900fb3b7")), cons(makeKeyword("INTERESTING"), makeString("583b5e26-882b-41d8-8390-f4355e0236ca")), cons(makeKeyword("TRUTH"), makeString("95fc3882-bfe6-41d8-9737-d1c22bcb34b5")));

    static private final SubLList $list_alt102 = list(cons(makeKeyword("GOODPARSE"), makeString("6bb1933a-b72d-11d9-8000-0007e90d99bf")), cons(makeKeyword("PLAUSIBLE"), makeString("563c3e7e-882b-41d8-872f-d899fe6cc0b5")), cons(makeKeyword("INTERESTING"), makeString("58d312de-882b-41d8-93b7-b56ac359f863")), cons(makeKeyword("TRUTH"), makeString("96bc4fa0-bfe6-41d8-87ba-8ec337392673")));







    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$CorrectRule = constant_handles.reader_make_constant_shell(makeString("CorrectRule"));

    public static final SubLObject $$SuggestedRulesMt = constant_handles.reader_make_constant_shell(makeString("SuggestedRulesMt"));

    static private final SubLList $list_alt109 = list(makeSymbol("?RULE"), makeSymbol("?CYCLIST"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt111 = list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(constant_handles.reader_make_constant_shell(makeString("suggestedRule")), makeSymbol("?RULE")));

    public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

    static private final SubLList $list_alt113 = list(constant_handles.reader_make_constant_shell(makeString("EvaluationOfByOnFn")), makeSymbol("?RULE"), makeSymbol("?CYCLIST"), makeSymbol("??TIMESTAMP"));

    public static final SubLObject $$inducedRuleEvaluation = constant_handles.reader_make_constant_shell(makeString("inducedRuleEvaluation"));

    static private final SubLSymbol $sym115$_RULE = makeSymbol("?RULE");

    static private final SubLList $list_alt116 = list(new SubLObject[]{ makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    static private final SubLList $list_alt117 = list(makeSymbol("RULE"), makeSymbol("CYCLIST"));

    static private final SubLSymbol $sym118$SUGGESTED_VOTED_RULE_ = makeSymbol("SUGGESTED-VOTED-RULE<");

    private static final SubLSymbol $REVIEW_RULE_EVALS = makeKeyword("REVIEW-RULE-EVALS");

    static private final SubLString $$$Review_Rule_Evaluations = makeString("Review Rule Evaluations");

    static private final SubLString $$$RuleEvals = makeString("RuleEvals");

    static private final SubLString $str_alt122$Review_how_suggested_rules_where_ = makeString("Review how suggested rules where evaluated");

    static private final SubLString $str_alt123$_RuleEvals_ = makeString("[RuleEvals]");

    static private final SubLString $str_alt124$cb_review_rule_evaluations = makeString("cb-review-rule-evaluations");

    private static final SubLSymbol CB_LINK_REVIEW_RULE_EVALS = makeSymbol("CB-LINK-REVIEW-RULE-EVALS");

    static private final SubLString $$$Rules_Evaluation_Reviewer = makeString("Rules Evaluation Reviewer");

    private static final SubLSymbol CB_REVIEW_RULE_EVALUATIONS = makeSymbol("CB-REVIEW-RULE-EVALUATIONS");

    static private final SubLString $str_alt128$handle_get_review_of_rule_evaluat = makeString("handle-get-review-of-rule-evaluations");

    static private final SubLString $str_alt129$_xb0e2ff = makeString("#xb0e2ff");



    static private final SubLString $$$Accept = makeString("Accept");

    static private final SubLString $$$Rule = makeString("Rule");

    static private final SubLString $$$Recommended_by = makeString("Recommended by");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));





    static private final SubLString $$$assert = makeString("assert");



    static private final SubLString $str_alt139$Note__ = makeString("Note: ");

    static private final SubLString $str_alt140$_indicates_that_the_rule_is_alrea = makeString(" indicates that the rule is already asserted in the system.");

    static private final SubLString $$$Assert = makeString("Assert");

    private static final SubLSymbol HANDLE_GET_REVIEW_OF_RULE_EVALUATIONS = makeSymbol("HANDLE-GET-REVIEW-OF-RULE-EVALUATIONS");

    // // Initializers
    public void declareFunctions() {
        declare_suggestions_review_tool_file();
    }

    public void initializeVariables() {
        init_suggestions_review_tool_file();
    }

    public void runTopLevelForms() {
        setup_suggestions_review_tool_file();
    }
}

