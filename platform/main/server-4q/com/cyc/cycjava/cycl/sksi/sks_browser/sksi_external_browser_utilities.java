package com.cyc.cycjava.cycl.sksi.sks_browser;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.control_vars.$default_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_external_browser_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_external_browser_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities";

    public static final String myFingerPrint = "889e0f5916344250cfc3f1117b644717b9e082f5d7d2d531b93120df2aa6eb07";

    // deflexical
    // Definitions
    public static final SubLSymbol $sksi_external_browser_cost_limit$ = makeSymbol("*SKSI-EXTERNAL-BROWSER-COST-LIMIT*");

    // Internal Constants
    public static final SubLSymbol SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN = makeSymbol("SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN");

    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLList $list2 = list(makeSymbol("QUERY-FORM"), makeSymbol("MODULES"));







    private static final SubLString $str6$The_following_error_was_encounter = makeString("The following error was encountered during the ask of ~A in the microtheory ~A:~%~s~%");

    private static final SubLSymbol $sym7$VALID_FORT_ = makeSymbol("VALID-FORT?");





    private static final SubLString $str10$All_SKSI_Conjunctive_Removal_Prob = makeString("All SKSI Conjunctive Removal Problems");

    private static final SubLString $str11$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str12$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str17$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str22$float__right = makeString("float: right");

    private static final SubLSymbol $ALL_SKSI_CONJUNCTIVE_REMOVALS = makeKeyword("ALL-SKSI-CONJUNCTIVE-REMOVALS");

    private static final SubLString $str24$_Refresh_Page_ = makeString("[Refresh Page]");

    private static final SubLSymbol CB_ALL_SKSI_CONJUNCTIVE_REMOVALS = makeSymbol("CB-ALL-SKSI-CONJUNCTIVE-REMOVALS");



    private static final SubLString $str27$_All_SKSI_Conjunctive_Removal_Pro = makeString("[All SKSI Conjunctive Removal Problems");



    private static final SubLString $str29$cb_all_sksi_conjunctive_removals = makeString("cb-all-sksi-conjunctive-removals");

    private static final SubLSymbol CB_LINK_ALL_SKSI_CONJUNCTIVE_REMOVALS = makeSymbol("CB-LINK-ALL-SKSI-CONJUNCTIVE-REMOVALS");









    private static final SubLList $list35 = list(makeKeyword("INFERENCE"));



    private static final SubLString $$$All_SKSI_Conjunctive_Removals = makeString("All SKSI Conjunctive Removals");

    public static SubLObject count_not_too_expensive_for_browser_supportP(final SubLObject count) {
        return makeBoolean((!count.isInteger()) || count.numLE($sksi_external_browser_cost_limit$.getGlobalValue()));
    }

    public static SubLObject sksi_create_query_form_from_required_pattern_internal(final SubLObject required_pattern) {
        SubLObject query_form = required_pattern;
        final SubLObject not_fully_bound_positions = cycl_utilities.arg_positions_bfs($NOT_FULLY_BOUND, query_form, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject position = NIL;
        SubLObject hl_variable_count = NIL;
        list_var = not_fully_bound_positions;
        position = list_var.first();
        for (hl_variable_count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , position = list_var.first() , hl_variable_count = add(ONE_INTEGER, hl_variable_count)) {
            query_form = list_utilities.replace_nested_nth(query_form, position.isList() ? position : list(position), variables.get_variable(hl_variable_count));
        }
        return query_form;
    }

    public static SubLObject sksi_create_query_form_from_required_pattern(final SubLObject required_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_create_query_form_from_required_pattern_internal(required_pattern);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, required_pattern, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_create_query_form_from_required_pattern_internal(required_pattern)));
            memoization_state.caching_state_put(caching_state, required_pattern, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_compute_count_for_external_browser_cache_entry_merge(final SubLObject current_count, final SubLObject new_count) {
        if (current_count.isInteger() && new_count.isInteger()) {
            return add(current_count, new_count);
        }
        if (current_count.isInteger()) {
            return current_count;
        }
        return new_count;
    }

    public static SubLObject sksi_compute_count_for_external_browser_cache_entry_demerge(final SubLObject current_count, final SubLObject removed_count) {
        if (current_count.isInteger() && removed_count.isInteger()) {
            return subtract(current_count, removed_count);
        }
        if (current_count.isInteger()) {
            return current_count;
        }
        return NIL;
    }

    public static SubLObject sksi_display_external_facts(final SubLObject query_form_module_list_pairs, final SubLObject mt) {
        SubLObject cdolist_list_var = query_form_module_list_pairs;
        SubLObject query_form_module_list_pair = NIL;
        query_form_module_list_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_module_list_pair;
            SubLObject query_form = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                sksi_display_external_facts_int(query_form, mt, v_modules);
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_module_list_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_display_external_term_facts(final SubLObject external_term, final SubLObject arg_pos, final SubLObject query_form_module_list_pairs, final SubLObject mt) {
        SubLObject cdolist_list_var = query_form_module_list_pairs;
        SubLObject query_form_module_list_pair = NIL;
        query_form_module_list_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_module_list_pair;
            SubLObject query_form = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject actual_query_form = replace_formula_arg(arg_pos, external_term, query_form);
                sksi_display_external_facts_int(actual_query_form, mt, v_modules);
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_module_list_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_display_external_facts_int(final SubLObject query_form, final SubLObject mt, final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_list = NIL;
        SubLObject error_msg = NIL;
        final SubLObject allowed_modules_spec = sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(v_modules);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    sentence_list = list_utilities.fast_delete_duplicates(backward.removal_ask_template(query_form, query_form, mt, $TRUE, list($ALLOWED_MODULES, allowed_modules_spec)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_msg.isString()) {
            return Errors.warn($str6$The_following_error_was_encounter, query_form, mt, error_msg);
        }
        SubLObject cdolist_list_var = sentence_list;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_sentence_browser.cb_show_sentence_readably(sentence, mt, T, NIL, T);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_term_L_wX_constants_by_name_on(final SubLObject term1, final SubLObject term2) {
        return kb_utilities.term_L(term1, term2, T, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_sksi_supported_browsing_caches() {
        sksi_sks_predicate_indexing.clear_sksi_supported_predicate_cache();
        sksi_sks_mt_indexing.clear_sksi_supported_mt_cache();
        sksi_sks_gaf_arg_indexing.clear_sksi_supported_gaf_argument_cache();
        return NIL;
    }

    public static SubLObject sksi_supported_browsing_registeredP() {
        return makeBoolean(((NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_browsing_registeredP()) || (NIL != sksi_sks_mt_indexing.sksi_supported_mt_browsing_registeredP())) || (NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_browsing_registeredP()));
    }

    public static SubLObject sksi_sort_preds_for_display(SubLObject preds) {
        preds = list_utilities.delete_if_not($sym7$VALID_FORT_, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        preds = kb_utilities.sort_terms(preds, T, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return preds;
    }

    public static SubLObject sksi_sort_mts_for_display(final SubLObject mts) {
        return cb_sort_mts_for_display(mts, UNPROVIDED);
    }

    public static SubLObject sksi_sort_mt_count_pairs(final SubLObject mt_count_pairs) {
        final SubLObject mts = sksi_sort_mts_for_display(Mapping.mapcar(FIRST, mt_count_pairs));
        return list_utilities.sort_via_position(copy_list(mt_count_pairs), mts, HLMT_EQUAL, IDENTITY);
    }

    public static SubLObject sksi_sort_pred_count_pairs(final SubLObject pred_count_pairs) {
        final SubLObject preds = sksi_sort_preds_for_display(Mapping.mapcar(FIRST, pred_count_pairs));
        return list_utilities.sort_via_position(copy_list(pred_count_pairs), preds, EQ, IDENTITY);
    }

    public static SubLObject cb_all_sksi_conjunctive_removals(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str10$All_SKSI_Conjunctive_Removal_Prob;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str11$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str12$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str17$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str22$float__right);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_link($ALL_SKSI_CONJUNCTIVE_REMOVALS, $str24$_Refresh_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        links_to_all_sksi_conjunctive_removals();
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_all_sksi_conjunctive_removals(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str27$_All_SKSI_Conjunctive_Removal_Pro;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str29$cb_all_sksi_conjunctive_removals);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_princ(linktext);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject links_to_all_sksi_conjunctive_removals() {
        final SubLObject latest_store = inference_datastructures_problem_store.most_recent_problem_store();
        if (NIL != latest_store) {
            final SubLObject latest_store_id = inference_datastructures_problem_store.problem_store_suid(latest_store);
            SubLObject end_var;
            SubLObject store_id;
            SubLObject store;
            SubLObject cdolist_list_var;
            SubLObject problem;
            for (end_var = MINUS_ONE_INTEGER, store_id = NIL, store_id = latest_store_id; !store_id.numLE(end_var); store_id = add(store_id, MINUS_ONE_INTEGER)) {
                store = inference_datastructures_problem_store.find_problem_store_by_id(store_id);
                if ((NIL != store) && (NIL != inference_worker_removal.problem_store_has_some_executed_sksi_conjunctive_removal_problemP(store))) {
                    cdolist_list_var = inference_worker_removal.executed_conjunctive_removal_problems(store, $SKSI);
                    problem = NIL;
                    problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_link($PROBLEM, problem, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_inference_browser.cb_show_problem_query(inference_datastructures_problem.problem_query(problem), UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        problem = cdolist_list_var.first();
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_sksi_external_browser_utilities_file() {
        declareFunction(me, "count_not_too_expensive_for_browser_supportP", "COUNT-NOT-TOO-EXPENSIVE-FOR-BROWSER-SUPPORT?", 1, 0, false);
        declareFunction(me, "sksi_create_query_form_from_required_pattern_internal", "SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_create_query_form_from_required_pattern", "SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "sksi_compute_count_for_external_browser_cache_entry_merge", "SKSI-COMPUTE-COUNT-FOR-EXTERNAL-BROWSER-CACHE-ENTRY-MERGE", 2, 0, false);
        declareFunction(me, "sksi_compute_count_for_external_browser_cache_entry_demerge", "SKSI-COMPUTE-COUNT-FOR-EXTERNAL-BROWSER-CACHE-ENTRY-DEMERGE", 2, 0, false);
        declareFunction(me, "sksi_display_external_facts", "SKSI-DISPLAY-EXTERNAL-FACTS", 2, 0, false);
        declareFunction(me, "sksi_display_external_term_facts", "SKSI-DISPLAY-EXTERNAL-TERM-FACTS", 4, 0, false);
        declareFunction(me, "sksi_display_external_facts_int", "SKSI-DISPLAY-EXTERNAL-FACTS-INT", 3, 0, false);
        declareFunction(me, "sksi_term_L_wX_constants_by_name_on", "SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON", 2, 0, false);
        declareFunction(me, "clear_sksi_supported_browsing_caches", "CLEAR-SKSI-SUPPORTED-BROWSING-CACHES", 0, 0, false);
        declareFunction(me, "sksi_supported_browsing_registeredP", "SKSI-SUPPORTED-BROWSING-REGISTERED?", 0, 0, false);
        declareFunction(me, "sksi_sort_preds_for_display", "SKSI-SORT-PREDS-FOR-DISPLAY", 1, 0, false);
        declareFunction(me, "sksi_sort_mts_for_display", "SKSI-SORT-MTS-FOR-DISPLAY", 1, 0, false);
        declareFunction(me, "sksi_sort_mt_count_pairs", "SKSI-SORT-MT-COUNT-PAIRS", 1, 0, false);
        declareFunction(me, "sksi_sort_pred_count_pairs", "SKSI-SORT-PRED-COUNT-PAIRS", 1, 0, false);
        declareFunction(me, "cb_all_sksi_conjunctive_removals", "CB-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 1, false);
        declareFunction(me, "cb_link_all_sksi_conjunctive_removals", "CB-LINK-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 1, false);
        declareFunction(me, "links_to_all_sksi_conjunctive_removals", "LINKS-TO-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_external_browser_utilities_file() {
        deflexical("*SKSI-EXTERNAL-BROWSER-COST-LIMIT*", $default_removal_cost_cutoff$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_sksi_external_browser_utilities_file() {
        memoization_state.note_memoized_function(SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN);
        html_macros.note_cgi_handler_function(CB_ALL_SKSI_CONJUNCTIVE_REMOVALS, $HTML_HANDLER);
        setup_cb_link_method($ALL_SKSI_CONJUNCTIVE_REMOVALS, CB_LINK_ALL_SKSI_CONJUNCTIVE_REMOVALS, ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link($ALL_SKSI_CONJUNCTIVE_REMOVALS, $TEXT, $list35, $str29$cb_all_sksi_conjunctive_removals, ZERO_INTEGER, $MAIN, $$$All_SKSI_Conjunctive_Removals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_external_browser_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_external_browser_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_external_browser_utilities_file();
    }

    
}

/**
 * Total time: 110 ms
 */
