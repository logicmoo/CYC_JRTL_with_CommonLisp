package com.cyc.cycjava.cycl.sksi.sks_browser;

import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_external_browser_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities";
    public static final String myFingerPrint = "889e0f5916344250cfc3f1117b644717b9e082f5d7d2d531b93120df2aa6eb07";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 860L)
    public static SubLSymbol $sksi_external_browser_cost_limit$;
    private static final SubLSymbol $sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN;
    private static final SubLSymbol $kw1$NOT_FULLY_BOUND;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLSymbol $kw5$ALLOWED_MODULES;
    private static final SubLString $str6$The_following_error_was_encounter;
    private static final SubLSymbol $sym7$VALID_FORT_;
    private static final SubLSymbol $sym8$FIRST;
    private static final SubLSymbol $sym9$HLMT_EQUAL;
    private static final SubLString $str10$All_SKSI_Conjunctive_Removal_Prob;
    private static final SubLString $str11$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str12$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw13$UNINITIALIZED;
    private static final SubLSymbol $kw14$CB_CYC;
    private static final SubLSymbol $kw15$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw16$SHA1;
    private static final SubLString $str17$yui_skin_sam;
    private static final SubLString $str18$reloadFrameButton;
    private static final SubLString $str19$button;
    private static final SubLString $str20$reload;
    private static final SubLString $str21$Refresh_Frames;
    private static final SubLString $str22$float__right;
    private static final SubLSymbol $kw23$ALL_SKSI_CONJUNCTIVE_REMOVALS;
    private static final SubLString $str24$_Refresh_Page_;
    private static final SubLSymbol $sym25$CB_ALL_SKSI_CONJUNCTIVE_REMOVALS;
    private static final SubLSymbol $kw26$HTML_HANDLER;
    private static final SubLString $str27$_All_SKSI_Conjunctive_Removal_Pro;
    private static final SubLSymbol $kw28$SELF;
    private static final SubLString $str29$cb_all_sksi_conjunctive_removals;
    private static final SubLSymbol $sym30$CB_LINK_ALL_SKSI_CONJUNCTIVE_REMOVALS;
    private static final SubLSymbol $kw31$PROBLEM;
    private static final SubLSymbol $kw32$VERBOSE;
    private static final SubLSymbol $kw33$SKSI;
    private static final SubLSymbol $kw34$TEXT;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$MAIN;
    private static final SubLString $str37$All_SKSI_Conjunctive_Removals;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 949L)
    public static SubLObject count_not_too_expensive_for_browser_supportP(final SubLObject count) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!count.isInteger() || count.numLE(sksi_external_browser_utilities.$sksi_external_browser_cost_limit$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 1197L)
    public static SubLObject sksi_create_query_form_from_required_pattern_internal(final SubLObject required_pattern) {
        SubLObject query_form = required_pattern;
        final SubLObject not_fully_bound_positions = cycl_utilities.arg_positions_bfs((SubLObject)sksi_external_browser_utilities.$kw1$NOT_FULLY_BOUND, query_form, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        SubLObject list_var = (SubLObject)sksi_external_browser_utilities.NIL;
        SubLObject position = (SubLObject)sksi_external_browser_utilities.NIL;
        SubLObject hl_variable_count = (SubLObject)sksi_external_browser_utilities.NIL;
        list_var = not_fully_bound_positions;
        position = list_var.first();
        for (hl_variable_count = (SubLObject)sksi_external_browser_utilities.ZERO_INTEGER; sksi_external_browser_utilities.NIL != list_var; list_var = list_var.rest(), position = list_var.first(), hl_variable_count = Numbers.add((SubLObject)sksi_external_browser_utilities.ONE_INTEGER, hl_variable_count)) {
            query_form = list_utilities.replace_nested_nth(query_form, (SubLObject)(position.isList() ? position : ConsesLow.list(position)), variables.get_variable(hl_variable_count));
        }
        return query_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 1197L)
    public static SubLObject sksi_create_query_form_from_required_pattern(final SubLObject required_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_external_browser_utilities.NIL;
        if (sksi_external_browser_utilities.NIL == v_memoization_state) {
            return sksi_create_query_form_from_required_pattern_internal(required_pattern);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_external_browser_utilities.$sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        if (sksi_external_browser_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_external_browser_utilities.$sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, (SubLObject)sksi_external_browser_utilities.ONE_INTEGER, (SubLObject)sksi_external_browser_utilities.NIL, (SubLObject)sksi_external_browser_utilities.EQUAL, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_external_browser_utilities.$sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, required_pattern, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_create_query_form_from_required_pattern_internal(required_pattern)));
            memoization_state.caching_state_put(caching_state, required_pattern, results, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 2075L)
    public static SubLObject sksi_compute_count_for_external_browser_cache_entry_merge(final SubLObject current_count, final SubLObject new_count) {
        if (current_count.isInteger() && new_count.isInteger()) {
            return Numbers.add(current_count, new_count);
        }
        if (current_count.isInteger()) {
            return current_count;
        }
        return new_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 2361L)
    public static SubLObject sksi_compute_count_for_external_browser_cache_entry_demerge(final SubLObject current_count, final SubLObject removed_count) {
        if (current_count.isInteger() && removed_count.isInteger()) {
            return Numbers.subtract(current_count, removed_count);
        }
        if (current_count.isInteger()) {
            return current_count;
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 2655L)
    public static SubLObject sksi_display_external_facts(final SubLObject query_form_module_list_pairs, final SubLObject mt) {
        SubLObject cdolist_list_var = query_form_module_list_pairs;
        SubLObject query_form_module_list_pair = (SubLObject)sksi_external_browser_utilities.NIL;
        query_form_module_list_pair = cdolist_list_var.first();
        while (sksi_external_browser_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_module_list_pair;
            SubLObject query_form = (SubLObject)sksi_external_browser_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_external_browser_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_browser_utilities.$list2);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_browser_utilities.$list2);
            v_modules = current.first();
            current = current.rest();
            if (sksi_external_browser_utilities.NIL == current) {
                sksi_display_external_facts_int(query_form, mt, v_modules);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_external_browser_utilities.$list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_module_list_pair = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 2655L)
    public static SubLObject sksi_display_external_term_facts(final SubLObject external_term, final SubLObject arg_pos, final SubLObject query_form_module_list_pairs, final SubLObject mt) {
        SubLObject cdolist_list_var = query_form_module_list_pairs;
        SubLObject query_form_module_list_pair = (SubLObject)sksi_external_browser_utilities.NIL;
        query_form_module_list_pair = cdolist_list_var.first();
        while (sksi_external_browser_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_module_list_pair;
            SubLObject query_form = (SubLObject)sksi_external_browser_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_external_browser_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_browser_utilities.$list2);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_browser_utilities.$list2);
            v_modules = current.first();
            current = current.rest();
            if (sksi_external_browser_utilities.NIL == current) {
                final SubLObject actual_query_form = el_utilities.replace_formula_arg(arg_pos, external_term, query_form);
                sksi_display_external_facts_int(actual_query_form, mt, v_modules);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_external_browser_utilities.$list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_module_list_pair = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 2655L)
    public static SubLObject sksi_display_external_facts_int(final SubLObject query_form, final SubLObject mt, final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_list = (SubLObject)sksi_external_browser_utilities.NIL;
        SubLObject error_msg = (SubLObject)sksi_external_browser_utilities.NIL;
        final SubLObject allowed_modules_spec = sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(v_modules);
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_external_browser_utilities.$sym3$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    sentence_list = list_utilities.fast_delete_duplicates(backward.removal_ask_template(query_form, query_form, mt, (SubLObject)sksi_external_browser_utilities.$kw4$TRUE, (SubLObject)ConsesLow.list((SubLObject)sksi_external_browser_utilities.$kw5$ALLOWED_MODULES, allowed_modules_spec)), (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_external_browser_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_msg.isString()) {
            return Errors.warn((SubLObject)sksi_external_browser_utilities.$str6$The_following_error_was_encounter, query_form, mt, error_msg);
        }
        SubLObject cdolist_list_var = sentence_list;
        SubLObject sentence = (SubLObject)sksi_external_browser_utilities.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_external_browser_utilities.NIL != cdolist_list_var) {
            cb_sentence_browser.cb_show_sentence_readably(sentence, mt, (SubLObject)sksi_external_browser_utilities.T, (SubLObject)sksi_external_browser_utilities.NIL, (SubLObject)sksi_external_browser_utilities.T);
            html_utilities.html_newline((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4085L)
    public static SubLObject sksi_term_L_wX_constants_by_name_on(final SubLObject term1, final SubLObject term2) {
        return kb_utilities.term_L(term1, term2, (SubLObject)sksi_external_browser_utilities.T, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4201L)
    public static SubLObject clear_sksi_supported_browsing_caches() {
        sksi_sks_predicate_indexing.clear_sksi_supported_predicate_cache();
        sksi_sks_mt_indexing.clear_sksi_supported_mt_cache();
        sksi_sks_gaf_arg_indexing.clear_sksi_supported_gaf_argument_cache();
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4439L)
    public static SubLObject sksi_supported_browsing_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_external_browser_utilities.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_browsing_registeredP() || sksi_external_browser_utilities.NIL != sksi_sks_mt_indexing.sksi_supported_mt_browsing_registeredP() || sksi_external_browser_utilities.NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_browsing_registeredP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4669L)
    public static SubLObject sksi_sort_preds_for_display(SubLObject preds) {
        preds = list_utilities.delete_if_not((SubLObject)sksi_external_browser_utilities.$sym7$VALID_FORT_, preds, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        preds = kb_utilities.sort_terms(preds, (SubLObject)sksi_external_browser_utilities.T, (SubLObject)sksi_external_browser_utilities.T, (SubLObject)sksi_external_browser_utilities.T, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject sksi_sort_mts_for_display(final SubLObject mts) {
        return cb_utilities.cb_sort_mts_for_display(mts, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject sksi_sort_mt_count_pairs(final SubLObject mt_count_pairs) {
        final SubLObject mts = sksi_sort_mts_for_display(Mapping.mapcar((SubLObject)sksi_external_browser_utilities.$sym8$FIRST, mt_count_pairs));
        return list_utilities.sort_via_position(conses_high.copy_list(mt_count_pairs), mts, (SubLObject)sksi_external_browser_utilities.$sym9$HLMT_EQUAL, (SubLObject)sksi_external_browser_utilities.IDENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject sksi_sort_pred_count_pairs(final SubLObject pred_count_pairs) {
        final SubLObject preds = sksi_sort_preds_for_display(Mapping.mapcar((SubLObject)sksi_external_browser_utilities.$sym8$FIRST, pred_count_pairs));
        return list_utilities.sort_via_position(conses_high.copy_list(pred_count_pairs), preds, (SubLObject)sksi_external_browser_utilities.EQ, (SubLObject)sksi_external_browser_utilities.IDENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject cb_all_sksi_conjunctive_removals(SubLObject args) {
        if (args == sksi_external_browser_utilities.UNPROVIDED) {
            args = (SubLObject)sksi_external_browser_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)sksi_external_browser_utilities.$str10$All_SKSI_Conjunctive_Removal_Prob;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((sksi_external_browser_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str11$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (sksi_external_browser_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str12$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == sksi_external_browser_utilities.$kw13$UNINITIALIZED) ? ConsesLow.list(sksi_external_browser_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)sksi_external_browser_utilities.$kw14$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (sksi_external_browser_utilities.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)sksi_external_browser_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (sksi_external_browser_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str17$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_external_browser_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str18$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_external_browser_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str19$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str20$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)sksi_external_browser_utilities.$str21$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            if (sksi_external_browser_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (sksi_external_browser_utilities.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_external_browser_utilities.$str22$float__right);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_external_browser_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)sksi_external_browser_utilities.$kw23$ALL_SKSI_CONJUNCTIVE_REMOVALS, (SubLObject)sksi_external_browser_utilities.$str24$_Refresh_Page_, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        links_to_all_sksi_conjunctive_removals();
                        html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject cb_link_all_sksi_conjunctive_removals(SubLObject linktext) {
        if (linktext == sksi_external_browser_utilities.UNPROVIDED) {
            linktext = (SubLObject)sksi_external_browser_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_external_browser_utilities.NIL == linktext) {
            linktext = (SubLObject)sksi_external_browser_utilities.$str27$_All_SKSI_Conjunctive_Removal_Pro;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_external_browser_utilities.$kw28$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_browser_utilities.$str29$cb_all_sksi_conjunctive_removals);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        if (sksi_external_browser_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_external_browser_utilities.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-browser-utilities.lisp", position = 4832L)
    public static SubLObject links_to_all_sksi_conjunctive_removals() {
        final SubLObject latest_store = inference_datastructures_problem_store.most_recent_problem_store();
        if (sksi_external_browser_utilities.NIL != latest_store) {
            final SubLObject latest_store_id = inference_datastructures_problem_store.problem_store_suid(latest_store);
            SubLObject end_var;
            SubLObject store_id;
            SubLObject store;
            SubLObject cdolist_list_var;
            SubLObject problem;
            for (end_var = (SubLObject)sksi_external_browser_utilities.MINUS_ONE_INTEGER, store_id = (SubLObject)sksi_external_browser_utilities.NIL, store_id = latest_store_id; !store_id.numLE(end_var); store_id = Numbers.add(store_id, (SubLObject)sksi_external_browser_utilities.MINUS_ONE_INTEGER)) {
                store = inference_datastructures_problem_store.find_problem_store_by_id(store_id);
                if (sksi_external_browser_utilities.NIL != store && sksi_external_browser_utilities.NIL != inference_worker_removal.problem_store_has_some_executed_sksi_conjunctive_removal_problemP(store)) {
                    cdolist_list_var = inference_worker_removal.executed_conjunctive_removal_problems(store, (SubLObject)sksi_external_browser_utilities.$kw33$SKSI);
                    problem = (SubLObject)sksi_external_browser_utilities.NIL;
                    problem = cdolist_list_var.first();
                    while (sksi_external_browser_utilities.NIL != cdolist_list_var) {
                        cb_utilities.cb_link((SubLObject)sksi_external_browser_utilities.$kw31$PROBLEM, problem, (SubLObject)sksi_external_browser_utilities.$kw32$VERBOSE, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        cb_inference_browser.cb_show_problem_query(inference_datastructures_problem.problem_query(problem), (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)sksi_external_browser_utilities.TWO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    public static SubLObject declare_sksi_external_browser_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "count_not_too_expensive_for_browser_supportP", "COUNT-NOT-TOO-EXPENSIVE-FOR-BROWSER-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_create_query_form_from_required_pattern_internal", "SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_create_query_form_from_required_pattern", "SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_compute_count_for_external_browser_cache_entry_merge", "SKSI-COMPUTE-COUNT-FOR-EXTERNAL-BROWSER-CACHE-ENTRY-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_compute_count_for_external_browser_cache_entry_demerge", "SKSI-COMPUTE-COUNT-FOR-EXTERNAL-BROWSER-CACHE-ENTRY-DEMERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_display_external_facts", "SKSI-DISPLAY-EXTERNAL-FACTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_display_external_term_facts", "SKSI-DISPLAY-EXTERNAL-TERM-FACTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_display_external_facts_int", "SKSI-DISPLAY-EXTERNAL-FACTS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_term_L_wX_constants_by_name_on", "SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "clear_sksi_supported_browsing_caches", "CLEAR-SKSI-SUPPORTED-BROWSING-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_supported_browsing_registeredP", "SKSI-SUPPORTED-BROWSING-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_sort_preds_for_display", "SKSI-SORT-PREDS-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_sort_mts_for_display", "SKSI-SORT-MTS-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_sort_mt_count_pairs", "SKSI-SORT-MT-COUNT-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "sksi_sort_pred_count_pairs", "SKSI-SORT-PRED-COUNT-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "cb_all_sksi_conjunctive_removals", "CB-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "cb_link_all_sksi_conjunctive_removals", "CB-LINK-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities", "links_to_all_sksi_conjunctive_removals", "LINKS-TO-ALL-SKSI-CONJUNCTIVE-REMOVALS", 0, 0, false);
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    public static SubLObject init_sksi_external_browser_utilities_file() {
        sksi_external_browser_utilities.$sksi_external_browser_cost_limit$ = SubLFiles.deflexical("*SKSI-EXTERNAL-BROWSER-COST-LIMIT*", control_vars.$default_removal_cost_cutoff$.getGlobalValue());
        return (SubLObject)sksi_external_browser_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_external_browser_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_external_browser_utilities.$sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN);
        html_macros.note_cgi_handler_function((SubLObject)sksi_external_browser_utilities.$sym25$CB_ALL_SKSI_CONJUNCTIVE_REMOVALS, (SubLObject)sksi_external_browser_utilities.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)sksi_external_browser_utilities.$kw23$ALL_SKSI_CONJUNCTIVE_REMOVALS, (SubLObject)sksi_external_browser_utilities.$sym30$CB_LINK_ALL_SKSI_CONJUNCTIVE_REMOVALS, (SubLObject)sksi_external_browser_utilities.ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link((SubLObject)sksi_external_browser_utilities.$kw23$ALL_SKSI_CONJUNCTIVE_REMOVALS, (SubLObject)sksi_external_browser_utilities.$kw34$TEXT, (SubLObject)sksi_external_browser_utilities.$list35, (SubLObject)sksi_external_browser_utilities.$str29$cb_all_sksi_conjunctive_removals, (SubLObject)sksi_external_browser_utilities.ZERO_INTEGER, (SubLObject)sksi_external_browser_utilities.$kw36$MAIN, (SubLObject)sksi_external_browser_utilities.$str37$All_SKSI_Conjunctive_Removals, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED, (SubLObject)sksi_external_browser_utilities.UNPROVIDED);
        return (SubLObject)sksi_external_browser_utilities.NIL;
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
    
    static {
        me = (SubLFile)new sksi_external_browser_utilities();
        sksi_external_browser_utilities.$sksi_external_browser_cost_limit$ = null;
        $sym0$SKSI_CREATE_QUERY_FORM_FROM_REQUIRED_PATTERN = SubLObjectFactory.makeSymbol("SKSI-CREATE-QUERY-FORM-FROM-REQUIRED-PATTERN");
        $kw1$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $sym3$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw5$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $str6$The_following_error_was_encounter = SubLObjectFactory.makeString("The following error was encountered during the ask of ~A in the microtheory ~A:~%~s~%");
        $sym7$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $sym8$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym9$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $str10$All_SKSI_Conjunctive_Removal_Prob = SubLObjectFactory.makeString("All SKSI Conjunctive Removal Problems");
        $str11$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str12$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw13$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw14$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw15$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw16$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str17$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str18$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str19$button = SubLObjectFactory.makeString("button");
        $str20$reload = SubLObjectFactory.makeString("reload");
        $str21$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str22$float__right = SubLObjectFactory.makeString("float: right");
        $kw23$ALL_SKSI_CONJUNCTIVE_REMOVALS = SubLObjectFactory.makeKeyword("ALL-SKSI-CONJUNCTIVE-REMOVALS");
        $str24$_Refresh_Page_ = SubLObjectFactory.makeString("[Refresh Page]");
        $sym25$CB_ALL_SKSI_CONJUNCTIVE_REMOVALS = SubLObjectFactory.makeSymbol("CB-ALL-SKSI-CONJUNCTIVE-REMOVALS");
        $kw26$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str27$_All_SKSI_Conjunctive_Removal_Pro = SubLObjectFactory.makeString("[All SKSI Conjunctive Removal Problems");
        $kw28$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str29$cb_all_sksi_conjunctive_removals = SubLObjectFactory.makeString("cb-all-sksi-conjunctive-removals");
        $sym30$CB_LINK_ALL_SKSI_CONJUNCTIVE_REMOVALS = SubLObjectFactory.makeSymbol("CB-LINK-ALL-SKSI-CONJUNCTIVE-REMOVALS");
        $kw31$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw32$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $kw33$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw34$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"));
        $kw36$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str37$All_SKSI_Conjunctive_Removals = SubLObjectFactory.makeString("All SKSI Conjunctive Removals");
    }
}

/*

	Total time: 110 ms
	
*/