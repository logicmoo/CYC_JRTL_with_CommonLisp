/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HYPOTHESIS-CORROBORATION
 *  source file: /cyc/top/cycl/hypothesis-corroboration.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class hypothesis_corroboration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private hypothesis_corroboration() {
    }

    public static final SubLFile me = new hypothesis_corroboration();


    // // Definitions
    public static final SubLObject cb_link_hyp_corrob(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt0$_HypCorrob_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt2$cb_hc);
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

    // defparameter
    public static final SubLSymbol $hc_cb_refresh_main_pageP$ = makeSymbol("*HC-CB-REFRESH-MAIN-PAGE?*");

    public static final SubLObject cb_hc(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject title = $$$Hypothesis_Corroboration;
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                if (NIL != $hc_cb_refresh_main_pageP$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_meta_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$Refresh);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_meta_content$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt11$5__URL_cg_cb_hyp_corrob);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    cb_utilities.cb_link($HYP_CORROB, $str_alt12$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(TWO_INTEGER);
                                    arghash = cb_hc_display_tells(arghash);
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_hc_display_tells(SubLObject arghash) {
        {
            SubLObject tells = isa.all_fort_instances_in_all_mts($$ScenarioTell);
            SubLObject cdolist_list_var = tells;
            SubLObject tell = NIL;
            for (tell = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tell = cdolist_list_var.first()) {
                arghash = cb_hc_display_tell(tell, arghash);
            }
        }
        return arghash;
    }

    public static final SubLObject tell_scenario_mt(SubLObject tell) {
        return kb_mapping_utilities.fpred_value_in_any_mt(tell, $$tellDerivesFromScenario, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the #$DataMicrotheory that is arg3 in the #$tellForTypeInData GAF
     * for TELL.
     */
    public static final SubLObject tell_data_mt(SubLObject tell) {
        return kb_mapping_utilities.fpred_value_in_any_mt(tell, $$tellForTypeInData, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject tell_mt_and_type(SubLObject tell) {
        return kb_mapping_utilities.pred_value_tuples_in_any_mt(tell, $$tellForType, ONE_INTEGER, $list_alt18, UNPROVIDED).first();
    }

    public static final SubLObject cb_hc_display_tell(SubLObject tell, SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_scenario = tell_scenario_mt(tell);
                SubLObject tell_mt_and_type = tell_mt_and_type(tell);
                SubLObject tell_mt = tell_mt_and_type.first();
                SubLObject tell_type = second(tell_mt_and_type);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                cb_utilities.cb_form(tell, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_indent(TWO_INTEGER);
                cb_utilities.cb_link($HC_START_TELL_QUERY, tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ($str_alt20$Type__);
                cb_utilities.cb_form(tell_type, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ($str_alt21$Mt__);
                cb_utilities.cb_form(tell_mt, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ($str_alt22$Scenario_Mt__);
                cb_utilities.cb_form(v_scenario, UNPROVIDED, UNPROVIDED);
                if (((NIL != v_scenario) && (kb_indexing.num_mt_index(v_scenario) == ZERO_INTEGER)) && (NIL != Filesys.probe_file(hc_tell_scenario_partition_file(tell)))) {
                    html_utilities.html_indent(TWO_INTEGER);
                    cb_utilities.cb_link($HC_LOAD_TELL_SCENARIO_PARTITION, tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject inference = get_tell_property(tell, $QUERY_INFERENCE);
                    if (NIL != inference_datastructures_inference.inference_p(inference)) {
                        html_utilities.html_princ($str_alt25$Tell_Query_);
                        html_utilities.html_indent(UNPROVIDED);
                        cb_utilities.cb_form(inference, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
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
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_query.cb_show_query_answer_section(inference, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        cb_utilities.cb_link($HC_CONSTRUCT_CORROB_QUERIES, tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject corroboration_query_formulas = get_tell_property(tell, $CORROBORATION_QUERY_FORMULAS);
                    SubLObject corroboration_query_inferences = get_tell_property(tell, $CORROBORATION_QUERY_INFERENCES);
                    SubLObject list_var = NIL;
                    SubLObject corroboration_query_formula = NIL;
                    SubLObject corroboration_num = NIL;
                    for (list_var = corroboration_query_formulas, corroboration_query_formula = list_var.first(), corroboration_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , corroboration_query_formula = list_var.first() , corroboration_num = add(ONE_INTEGER, corroboration_num)) {
                        cb_utilities.cb_form(corroboration_query_formula, ONE_INTEGER, T);
                        html_utilities.html_indent(TWO_INTEGER);
                        {
                            SubLObject corroboration_query_inference = nth(corroboration_num, corroboration_query_inferences);
                            if (NIL != inference_datastructures_inference.inference_p(corroboration_query_inference)) {
                                cb_utilities.cb_form(corroboration_query_inference, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($HC_START_CORROBORATION_QUERY, tell, corroboration_num, $str_alt30$_Rerun_query_, UNPROVIDED, UNPROVIDED);
                            } else {
                                cb_utilities.cb_link($HC_START_CORROBORATION_QUERY, tell, corroboration_num, $str_alt31$_Run_Query_, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        html_utilities.html_newline(UNPROVIDED);
                    }
                }
                {
                    SubLObject error_messages = get_tell_property(tell, $ERROR_MESSAGES);
                    if (NIL != error_messages) {
                        {
                            SubLObject color_val = $RED;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str_alt34$There_were_errors_with_this_tell_);
                                    html_utilities.html_newline(UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = error_messages;
                                        SubLObject error_message = NIL;
                                        for (error_message = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_message = cdolist_list_var.first()) {
                                            html_utilities.html_indent(TWO_INTEGER);
                                            html_utilities.html_princ(error_message);
                                            html_utilities.html_newline(UNPROVIDED);
                                        }
                                    }
                                    cb_utilities.cb_link($HC_CLEAR_TELL_ERRORS, tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static final SubLObject cb_link_hc_start_tell_query(SubLObject tell, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt36$_Run_Tell_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt37$cb_hc_run_tell_query__A, cb_utilities.cb_fort_identifier(tell));
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

    public static final SubLObject cb_hc_run_tell_query(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject tell = html_arghash.get_arghash_value($JUST_FORT, arghash);
            if (NIL == forts.fort_p(tell)) {
                return NIL;
            }
            hc_start_new_tell_query(tell);
            sleep(ONE_INTEGER);
        }
        return cb_hc(args);
    }

    public static final SubLObject cb_link_hc_load_tell_scenario_partition(SubLObject tell, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt41$_Load_Partition_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt42$cb_hc_load_tell_scenario_partitio, cb_utilities.cb_fort_identifier(tell));
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

    public static final SubLObject cb_hc_load_tell_scenario_partition(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject tell = html_arghash.get_arghash_value($JUST_FORT, arghash);
            if (NIL == forts.fort_p(tell)) {
                return NIL;
            }
            {
                SubLObject partition_file = hc_tell_scenario_partition_file(tell);
		com.cyc.cycjava.cycl.partitions.load_partition_clean(partition_file, UNPROVIDED);
            }
        }
        return cb_hc(args);
    }

    public static final SubLObject hc_tell_scenario_partition_file(SubLObject tell) {
        {
            SubLObject v_scenario = tell_scenario_mt(tell);
            if (NIL != forts.fort_p(v_scenario)) {
                return cconcatenate($str_alt45$_cyc_projects_InformationFusion_s, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_utilities.hl_external_id_string(v_scenario)), $str_alt46$_cpart });
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_hc_construct_corrob_queries(SubLObject tell, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt47$_Construct_Corroboration_Queries_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt48$cb_hc_construct_corroboration_que, cb_utilities.cb_fort_identifier(tell));
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

    public static final SubLObject cb_hc_construct_corroboration_queries(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject tell = html_arghash.get_arghash_value($JUST_FORT, arghash);
            SubLObject tell_inference = get_tell_property(tell, $QUERY_INFERENCE);
            if (NIL == forts.fort_p(tell)) {
                return NIL;
            }
            {
                SubLObject corroboration_query_formulas = hc_construct_corroboration_query_formulas(tell, tell_inference);
                set_tell_property(tell, $CORROBORATION_QUERY_FORMULAS, corroboration_query_formulas);
                set_tell_property(tell, $CORROBORATION_QUERY_INFERENCES, make_list(length(corroboration_query_formulas), UNPROVIDED));
            }
        }
        return cb_hc(args);
    }

    public static final SubLObject cb_link_hc_start_corroboration_query(SubLObject tell, SubLObject n, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt51$_Run_Corroboration_Query_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt52$cb_hc_run_corroboration_query__A_, cb_utilities.cb_fort_identifier(tell), n);
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

    public static final SubLObject cb_hc_run_corroboration_query(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject tell = html_arghash.get_arghash_value($JUST_FORT, arghash);
            SubLObject corroboration_num = html_arghash.get_arghash_value($N, arghash);
            if (NIL == forts.fort_p(tell)) {
                return NIL;
            }
            hc_start_new_corroboration_query(tell, corroboration_num);
            sleep(ONE_INTEGER);
        }
        return cb_hc(args);
    }

    public static final SubLObject cb_link_hc_clear_tell_errors(SubLObject tell, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt56$_Clear_Errors_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt57$cb_hc_clear_tell_errors__A, cb_utilities.cb_fort_identifier(tell));
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

    public static final SubLObject cb_hc_clear_tell_errors(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject tell = html_arghash.get_arghash_value($JUST_FORT, arghash);
            set_tell_property(tell, $ERROR_MESSAGES, NIL);
        }
        return cb_hc(args);
    }



    public static final SubLObject get_tell_property(SubLObject tell, SubLObject property) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tell_plist = gethash(tell, $hc_state$.getDynamicValue(thread), UNPROVIDED);
                return getf(tell_plist, property, UNPROVIDED);
            }
        }
    }

    public static final SubLObject set_tell_property(SubLObject tell, SubLObject property, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tell_plist = gethash(tell, $hc_state$.getDynamicValue(thread), UNPROVIDED);
                tell_plist = putf(tell_plist, property, value);
                sethash(tell, $hc_state$.getDynamicValue(thread), tell_plist);
            }
            return NIL;
        }
    }

    public static final SubLObject add_tell_property(SubLObject tell, SubLObject property, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tell_plist = gethash(tell, $hc_state$.getDynamicValue(thread), UNPROVIDED);
                SubLObject value_list = getf(tell_plist, property, UNPROVIDED);
                if (!value_list.isList()) {
                    Errors.warn($str_alt61$Tell__A_property__A_not_a_listp__, tell, property, value_list);
                } else {
                    value_list = cons(value, value_list);
                    tell_plist = putf(tell_plist, property, value_list);
                    sethash(tell, $hc_state$.getDynamicValue(thread), tell_plist);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tell_recoverable_error(SubLObject tell, SubLObject error_message) {
        return add_tell_property(tell, $ERROR_MESSAGES, error_message);
    }

    public static final SubLObject hc_start_new_tell_query(SubLObject tell) {
        {
            SubLObject query_term = kb_mapping_utilities.fpred_value_in_any_mt(tell, $$testQuerySpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == kb_query.kbq_query_spec_p(query_term)) {
                tell_recoverable_error(tell, $str_alt63$Could_not_determine_tell_s_KB_que);
                return NIL;
            }
            {
		SubLObject tell_inference = kb_query.new_continuable_inference_from_kbq(query_term, UNPROVIDED, UNPROVIDED);
                if (NIL == inference_datastructures_inference.inference_p(tell_inference)) {
                    tell_recoverable_error(tell, $str_alt64$Could_not_create_tell_s_KB_query_);
                    return NIL;
                }
                {
                    SubLObject process_wrapper = process_utilities.new_process_wrapper(cconcatenate($str_alt65$Query_for_tell_, format_nil.format_nil_a_no_copy(tell)), HC_RUN_INFERENCE, list(tell_inference));
                    set_tell_property(tell, $QUERY_INFERENCE, tell_inference);
                    add_tell_property(tell, $PROCESS_WRAPPER, process_wrapper);
                }
                return tell_inference;
            }
        }
    }

    public static final SubLObject hc_run_inference(SubLObject process_wrapper, SubLObject tell_inference) {
        inference_kernel.continue_inference(tell_inference, $list_alt68);
        return NIL;
    }

    public static final SubLObject hc_start_new_corroboration_query(SubLObject tell, SubLObject corroboration_query_num) {
        {
            SubLObject query_term = kb_mapping_utilities.fpred_value_in_any_mt(tell, $$testQuerySpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject query_mt = kb_query.kbq_mt(query_term);
            SubLObject corroboration_query_formulas = get_tell_property(tell, $CORROBORATION_QUERY_FORMULAS);
            SubLObject corroboration_query_formula = nth(corroboration_query_num, corroboration_query_formulas);
            SubLObject corroboration_inference = inference_kernel.new_continuable_inference(corroboration_query_formula, query_mt, UNPROVIDED);
            if (NIL == inference_datastructures_inference.inference_p(corroboration_inference)) {
                tell_recoverable_error(tell, cconcatenate($str_alt69$Could_not_create_corroboration_qu, new SubLObject[]{ format_nil.format_nil_a_no_copy(corroboration_query_num), $str_alt70$_ }));
                return NIL;
            }
            {
                SubLObject process_wrapper = process_utilities.new_process_wrapper(cconcatenate($str_alt65$Query_for_tell_, format_nil.format_nil_a_no_copy(tell)), HC_RUN_INFERENCE, list(corroboration_inference));
                SubLObject corroboration_query_inferences = get_tell_property(tell, $CORROBORATION_QUERY_INFERENCES);
                set_nth(corroboration_query_num, corroboration_query_inferences, corroboration_inference);
                set_tell_property(tell, $CORROBORATION_QUERY_INFERENCES, corroboration_query_inferences);
            }
        }
        return NIL;
    }

    /**
     * Returns the observability of FORMULA in MT.
     *
     * @param FORMULA
     * 		el-formula-p
     * @param MT
     * 		hlmt-p
     * @return floatp; a number between 0 and 1
     */
    public static final SubLObject hc_observability_of_formula(SubLObject formula, SubLObject mt) {
        {
            SubLObject observability = $float$1_0;
            SubLObject cdolist_list_var = formula;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL == cycl_grammar.el_variable_p(arg)) {
                    {
                        SubLObject arg_observability = ask_utilities.query_variable($sym72$_NUM, listS($$observabilityOfTermInData, arg, mt, $list_alt74), mt, UNPROVIDED).first();
                        if (NIL != arg_observability) {
                            if (arg_observability.numL(observability)) {
                                observability = arg_observability;
                            }
                        } else {
                            observability = $float$0_0;
                        }
                    }
                }
            }
            return observability;
        }
    }

    /**
     * Remove literals that contain variables that have a single occurrence in all
     * the input LITERALS.
     *
     * @param listp;
     * 		of literals
     * @return listp; of literals
     */
    public static final SubLObject hc_remove_singleton_var_literals(SubLObject literals) {
        {
            SubLObject var_count_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject result_literals = NIL;
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_4 = literal;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , v_term = cdolist_list_var_4.first()) {
                            if (NIL != cycl_grammar.el_variable_p(v_term)) {
                                dictionary_utilities.dictionary_increment(var_count_dict, v_term, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject drop_literalP = NIL;
                        SubLObject cdolist_list_var_5 = literal;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , v_term = cdolist_list_var_5.first()) {
                            if ((NIL != cycl_grammar.el_variable_p(v_term)) && dictionary.dictionary_lookup(var_count_dict, v_term, UNPROVIDED).numE(ONE_INTEGER)) {
                                drop_literalP = T;
                            }
                        }
                        if (NIL == drop_literalP) {
                            result_literals = cons(literal, result_literals);
                        }
                    }
                }
            }
            return nreverse(result_literals);
        }
    }

    /**
     * Returns EL sentences from temporally qualified spec-MTs of SCENARIO-MT.
     */
    public static final SubLObject hc_add_sentences_from_temporally_qualified_mts(SubLObject scenario_mt) {
        {
            SubLObject scenario_mt_assertions = NIL;
            SubLObject cdolist_list_var = inference_kernel.new_cyc_query(list($$thereExists, $sym78$_WHAT_TIME_FRAME, list($$thereExists, $sym79$_WHAT_GRANULARITY, list($$thereExists, $sym80$_ARGS, list($$thereExists, $sym81$_PRED, listS($$and, $list_alt83, listS($$ist_Asserted, listS($$MtSpace, scenario_mt, $list_alt86), $list_alt87), $list_alt88))))), $$InferencePSC, UNPROVIDED);
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject Psentence = sublis(binding, $sym76$_SENTENCE, UNPROVIDED, UNPROVIDED);
                    scenario_mt_assertions = cons(Psentence, scenario_mt_assertions);
                }
            }
            return scenario_mt_assertions;
        }
    }

    public static final SubLObject hc_construct_corroboration_query_formulas(SubLObject tell, SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject scenario_mt = tell_scenario_mt(tell);
                SubLObject data_mt = tell_data_mt(tell);
		SubLObject inference_answers = inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED);
                SubLObject inference_answers_bindings = Mapping.mapcar(INFERENCE_ANSWER_BINDINGS, inference_answers);
                SubLObject variable_substitutions_for_scenario_raw = kb_mapping_utilities.pred_value_tuples_in_any_mt(scenario_mt, $$variableSubstitutionsForScenario, ONE_INTEGER, $list_alt18, UNPROVIDED).first();
                SubLObject subst_skolem_variables = el_utilities.el_list_items(variable_substitutions_for_scenario_raw.first());
                SubLObject subst_variable_keywords = el_utilities.el_list_items(second(variable_substitutions_for_scenario_raw));
                SubLObject subst_el_vars = Mapping.mapcar(MAKE_EL_VAR, subst_variable_keywords);
		SubLObject subst_bindings = com.cyc.cycjava.cycl.bindings.make_variable_bindings(subst_el_vars, subst_skolem_variables);
                SubLObject observability_threshold = ask_utilities.query_variable($sym72$_NUM, listS($$observabilityThresholdForData, data_mt, $list_alt74), data_mt, UNPROVIDED).first();
                SubLObject scenario_mt_assertions = NIL;
                SubLObject result = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(scenario_mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(scenario_mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(scenario_mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != a);
                                            if (NIL != valid) {
                                                scenario_mt_assertions = cons(a, scenario_mt_assertions);
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(scenario_mt, NIL)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt96$do_broad_mt_index, STRINGP);
                                {
                                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble($str_alt96$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject a = NIL;
                                                while (NIL != id) {
                                                    a = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, a, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(a, scenario_mt, NIL, NIL)) {
                                                            scenario_mt_assertions = cons(a, scenario_mt_assertions);
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                            }
                        }
                    }

                {
                    SubLObject cdolist_list_var = inference_answers_bindings;
                    SubLObject inference_answer_bindings = NIL;
                    for (inference_answer_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_answer_bindings = cdolist_list_var.first()) {
                        {
                            SubLObject query_literals = NIL;
                            {
                                SubLObject cdolist_list_var_6 = scenario_mt_assertions;
                                SubLObject a = NIL;
                                for (a = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , a = cdolist_list_var_6.first()) {
                                    if (NIL != assertions_high.gaf_assertionP(a)) {
                                        {
                                            SubLObject hl_formula = assertions_high.assertion_formula(a);
                                            if (NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(hl_formula), $$MetaLanguagePredicate)) {
                                                {
                                                    SubLObject scenario_terms_out = bindings.apply_bindings_backwards(subst_bindings, hl_formula);
                                                    SubLObject indeterminate_term_foundP = NIL;
                                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(scenario_mt);
                                                    {
                                                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                            indeterminate_term_foundP = list_utilities.tree_find_if($sym100$INDETERMINATE_TERM_, scenario_terms_out, UNPROVIDED);
                                                        } finally {
                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    if (NIL == indeterminate_term_foundP) {
                                                        {
                                                            SubLObject query_bindings_in = bindings.apply_bindings(inference_answer_bindings, scenario_terms_out);
                                                            if (hc_observability_of_formula(query_bindings_in, data_mt).numGE(observability_threshold)) {
                                                                query_literals = cons(query_bindings_in, query_literals);
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
                                SubLObject cdolist_list_var_7 = hc_add_sentences_from_temporally_qualified_mts(scenario_mt);
                                SubLObject hl_formula = NIL;
                                for (hl_formula = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , hl_formula = cdolist_list_var_7.first()) {
                                    if (NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(hl_formula), $$MetaLanguagePredicate)) {
                                        {
                                            SubLObject scenario_terms_out = bindings.apply_bindings_backwards(subst_bindings, hl_formula);
                                            SubLObject indeterminate_term_foundP = NIL;
                                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(scenario_mt);
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                    indeterminate_term_foundP = list_utilities.tree_find_if($sym100$INDETERMINATE_TERM_, scenario_terms_out, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (NIL == indeterminate_term_foundP) {
                                                {
                                                    SubLObject query_bindings_in = bindings.apply_bindings(inference_answer_bindings, scenario_terms_out);
                                                    if (hc_observability_of_formula(query_bindings_in, data_mt).numGE(observability_threshold)) {
                                                        query_literals = cons(query_bindings_in, query_literals);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            query_literals = hc_remove_singleton_var_literals(query_literals);
                            {
                                SubLObject different_literals = hc_corrob_query_different_literals(scenario_mt, data_mt);
                                if (NIL != different_literals) {
                                    query_literals = cconcatenate(query_literals, different_literals);
                                }
                            }
                            result = cons(clauses.dnf_formula(czer_main.sort_clause_literals(clause_utilities.clause_from_el_literals(query_literals), UNPROVIDED)), result);
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     * Returns a list of #$different clauses to be used in the construction of the
     * corroboration query.
     */
    public static final SubLObject hc_corrob_query_different_literals(SubLObject scenario_mt, SubLObject data_mt) {
        {
            SubLObject var_keyword_lists = ask_utilities.query_variable($sym101$_X, listS($const102$variablesExpectedDifferentInCorro, scenario_mt, data_mt, $list_alt103), $$TestVocabularyMt, UNPROVIDED);
            SubLObject different_literals = NIL;
            SubLObject cdolist_list_var = var_keyword_lists;
            SubLObject var_keyword_list = NIL;
            for (var_keyword_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_keyword_list = cdolist_list_var.first()) {
                {
                    SubLObject vars = Mapping.mapcar(MAKE_EL_VAR, var_keyword_list.rest());
                    SubLObject different_literal = cconcatenate($list_alt105, vars);
                    different_literals = cons(different_literal, different_literals);
                }
            }
            return different_literals;
        }
    }

    /**
     *
     *
     * @param GRAPH
     * 		listp; the scenario graph whose skolem terms are to be
     * 		substituted with non-skolem terms
     * @param INFERENCE
     * 		inference-p; the inference object containing the bindings
     * 		list binding variables to non-skolem terms
     * @param VAR-SUBST-SPECIFICATION-MT;
     * 		the microtheory in which to find the
     * 		variable/skolem mapping
     * @return list; a list of alists, where each alist maps the assertions in GRAPH
    before skolem substitution to their corresponding el sentences after skolem
    substitution IF a substitution occurred
     */
    public static final SubLObject substitute_terms_for_skolems(SubLObject v_graph, SubLObject inference, SubLObject var_subst_specification_mt) {
        {
            SubLObject v_bindings = inference_kernel.inference_all_answer_result_bindings(inference);
            return substitute_terms_for_skolems_internal(v_graph, v_bindings, var_subst_specification_mt);
        }
    }

    /**
     *
     *
     * @param GRAPH
     * 		listp; the scenario graph whose skolem terms are to be
     * 		substituted with non-skolem terms
     * @param BINDINGS
     * 		listp; the bindings list binding variables to non-skolem
     * 		terms
     * @param VAR-SUBST-SPECIFICATION-MT;
     * 		the microtheory in which to find the
     * 		variable/skolem mapping
     * @return list; a list of alists, where each alist maps the assertions in GRAPH
    before skolem substitution to their corresponding el sentences after skolem
    substitution IF a substitution occurred
     */
    public static final SubLObject substitute_terms_for_skolems_internal(SubLObject v_graph, SubLObject unmarked_bindings, SubLObject var_subst_specification_mt) {
        {
            SubLObject v_bindings = hc_mark_binding_values_for_substitution(unmarked_bindings);
            SubLObject var_skolem_substitutions = get_var_skolem_substitutions(var_subst_specification_mt);
            SubLObject skolem_term_substitutions = bindings.apply_bindings(var_skolem_substitutions, v_bindings);
            SubLObject formulas = gather_formulas_from_graph(v_graph);
            SubLObject formula_mappings = NIL;
            SubLObject cdolist_list_var = skolem_term_substitutions;
            SubLObject skolem_term_substitution = NIL;
            for (skolem_term_substitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem_term_substitution = cdolist_list_var.first()) {
                {
                    SubLObject formula_mapping = NIL;
                    SubLObject cdolist_list_var_8 = formulas;
                    SubLObject formula0 = NIL;
                    for (formula0 = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , formula0 = cdolist_list_var_8.first()) {
                        {
                            SubLObject formula = (NIL != assertion_handles.assertion_p(formula0)) ? ((SubLObject) (uncanonicalizer.assertion_el_formula(formula0))) : formula0;
                            SubLObject subst_formula = bindings.apply_bindings(skolem_term_substitution, formula);
                            if (!formula.equal(subst_formula)) {
                                formula_mapping = cons(cons(formula0, subst_formula), formula_mapping);
                            }
                        }
                    }
                    formula_mappings = cons(list(formula_mapping, dictionary_utilities.new_dictionary_from_alist(skolem_term_substitution, UNPROVIDED)), formula_mappings);
                }
            }
            return formula_mappings;
        }
    }

    public static final SubLObject hc_mark_binding_values_for_substitution(SubLObject unmarked_bindings) {
        {
            SubLObject marked_bindings = NIL;
            SubLObject cdolist_list_var = unmarked_bindings;
            SubLObject binding_set = NIL;
            for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                {
                    SubLObject new_binding_set = NIL;
                    SubLObject cdolist_list_var_9 = binding_set;
                    SubLObject binding_tuple = NIL;
                    for (binding_tuple = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , binding_tuple = cdolist_list_var_9.first()) {
                        {
                            SubLObject datum = binding_tuple;
                            SubLObject current = datum;
                            SubLObject variable = NIL;
                            SubLObject contents = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt106);
                            variable = current.first();
                            current = current.rest();
                            contents = current;
                            {
                                SubLObject new_contents = list($MODIFIED, contents);
                                SubLObject new_binding_tuple = cons(variable, new_contents);
                                new_binding_set = cons(new_binding_tuple, new_binding_set);
                            }
                        }
                    }
                    new_binding_set = nreverse(new_binding_set);
                    marked_bindings = cons(new_binding_set, marked_bindings);
                }
            }
            return nreverse(marked_bindings);
        }
    }

    /**
     *
     *
     * @param GRAPH
     * 		listp;
     * @return listp; a list of all formulas in GRAPH, converted to el
     */
    public static final SubLObject gather_formulas_from_graph(SubLObject v_graph) {
        {
            SubLObject formulas = NIL;
            SubLObject cdolist_list_var = v_graph;
            SubLObject keyXrole_fillers = NIL;
            for (keyXrole_fillers = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyXrole_fillers = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_10 = keyXrole_fillers.rest();
                    SubLObject roleXfillers = NIL;
                    for (roleXfillers = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , roleXfillers = cdolist_list_var_10.first()) {
                        {
                            SubLObject cdolist_list_var_11 = roleXfillers.rest();
                            SubLObject formula = NIL;
                            for (formula = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , formula = cdolist_list_var_11.first()) {
                                if (!((NIL != collection_defns.hl_assertion_p(formula)) || (NIL != el_utilities.el_formula_p(formula)))) {
                                    Errors.error($str_alt108$Expected_an_assertion_or_el_formu, formula);
                                }
                                {
                                    SubLObject item_var = formula;
                                    if (NIL == member(item_var, formulas, EQ, symbol_function(IDENTITY))) {
                                        formulas = cons(item_var, formulas);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return formulas;
        }
    }

    /**
     * return list; a variable->skolem alist mapping using the information of #$variableSubstitutionsForScenario in MT
     */
    public static final SubLObject get_var_skolem_substitutions(SubLObject mt) {
        SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
        {
            SubLObject variable_substitutions_for_scenario_raw = kb_mapping_utilities.pred_value_tuples_in_any_mt(mt, $$variableSubstitutionsForScenario, ONE_INTEGER, $list_alt18, UNPROVIDED).first();
            SubLObject subst_skolem_variables = el_utilities.el_list_items(variable_substitutions_for_scenario_raw.first());
            SubLObject subst_variable_keywords = el_utilities.el_list_items(second(variable_substitutions_for_scenario_raw));
            SubLObject subst_el_vars = Mapping.mapcar(MAKE_EL_VAR, subst_variable_keywords);
            SubLObject var_skolem_bindings = bindings.make_variable_bindings(subst_el_vars, subst_skolem_variables);
            return var_skolem_bindings;
        }
    }

    /**
     * Returns an alist of scenario types and their corresponding examples.
     */
    // defparameter
    private static final SubLSymbol $hc_scenario_example_tuples$ = makeSymbol("*HC-SCENARIO-EXAMPLE-TUPLES*");

    // defparameter
    private static final SubLSymbol $hc_scenario_example_types$ = makeSymbol("*HC-SCENARIO-EXAMPLE-TYPES*");

    /**
     * Compute all of the scenario and tell information. The layout of the result
     * set is described in the comment for @see HC-SCENARIO-AND-TELL-INFO-IMPL
     */
    public static final SubLObject hc_scenario_and_tell_info(SubLObject scenario_types) {
        if (scenario_types == UNPROVIDED) {
            scenario_types = $hc_scenario_example_types$.getDynamicValue();
        }
        {
            SubLObject accumulator = accumulation.new_list_accumulator(UNPROVIDED);
            hc_scenario_and_tell_info_impl(scenario_types, accumulator);
            return accumulation.accumulation_contents(accumulator, $RESET);
        }
    }

    /**
     * Compute all of the scenario and tell information. Results are posted as soon
     * as they become available. The layout of the elements of the result set posted
     * is described in the comment for @see HC-SCENARIO-AND-TELL-INFO-IMPL
     *
     * @return FIXNUMP the number of values accumulated
     */
    public static final SubLObject hc_scenario_and_tell_info_asynchronous(SubLObject scenario_types) {
        if (scenario_types == UNPROVIDED) {
            scenario_types = $hc_scenario_example_types$.getDynamicValue();
        }
        {
            SubLObject data_acc = accumulation.new_list_accumulator(UNPROVIDED);
            SubLObject results_acc = task_processor.new_intermediate_results_accumulator(data_acc);
            hc_scenario_and_tell_info_impl(scenario_types, results_acc);
            return accumulation.accumulation_size(data_acc);
        }
    }

    /**
     * Each record in the result list has the following items:
     * - NL generation of scenario-type
     * - Example scenario
     * - Scenario MT
     * - Tell constant
     * - Tell query sentence
     * - Tell data-MT
     */
    public static final SubLObject hc_scenario_and_tell_info_impl(SubLObject scenario_types, SubLObject accumulator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = scenario_types;
                SubLObject scenario_type = NIL;
                for (scenario_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , scenario_type = cdolist_list_var.first()) {
                    {
                        SubLObject nl_generation = pph_main.generate_phrase_for_java(scenario_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject pph_list = list(nl_generation, scenario_type);
                        SubLObject example_scenario = assoc(scenario_type, $hc_scenario_example_tuples$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                        SubLObject tell = kb_mapping_utilities.fpred_value_in_any_mt(scenario_type, $$tellForTypeInData, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                        SubLObject scenario_mt = tell_scenario_mt(tell);
                        SubLObject tell_query_formula = second(ask_utilities.query_variable($sym101$_X, list($const115$sentenceParameterValueInSpecifica, $sym101$_X, list($$TestQueryFn, tell)), $$TestVocabularyMt, UNPROVIDED).first());
                        SubLObject tell_data_mt = tell_data_mt(tell);
                        SubLObject payload = list(pph_list, example_scenario, scenario_mt, tell, tell_query_formula, tell_data_mt);
                        accumulation.accumulation_add(accumulator, payload);
                    }
                }
            }
            return accumulator;
        }
    }

    /**
     * Generates original graph for SCENARIO-EXAMPLE within SCENARIO-MT.  Then, runs
     * the Tell that is associated with the SCENARIO-EXAMPLE.  Combines the results
     * of the Tell with the original graph and returns the updated graph.
     */
    public static final SubLObject hc_updated_graphs_after_tell(SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell) {
        {
            SubLObject accumulator = accumulation.new_list_accumulator(UNPROVIDED);
            hc_updated_graphs_after_tell_impl(accumulator, scenario_example, scenario_mt, tell);
            return accumulation.accumulation_contents(accumulator, $RESET);
        }
    }

    /**
     * Generates original graph for SCENARIO-EXAMPLE within SCENARIO-MT.  Then, runs
     * the Tell that is associated with the SCENARIO-EXAMPLE.  Combines the results
     * of the Tell with the original graph, posting results as they become available
     *
     * @return INTEGERP the number of results identified
     */
    public static final SubLObject hc_updated_graphs_after_tell_asynchronous(SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell) {
        {
            SubLObject data_acc = accumulation.new_list_accumulator(UNPROVIDED);
            SubLObject results_acc = task_processor.new_intermediate_results_accumulator(data_acc);
            hc_updated_graphs_after_tell_impl(results_acc, scenario_example, scenario_mt, tell);
            return accumulation.accumulation_size(data_acc);
        }
    }

    public static final SubLObject hc_updated_graphs_after_tell_impl(SubLObject accumulator, SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell) {
        {
            SubLObject v_graph = script_instance_editor_api.get_complete_graph_for_script_instance(scenario_example, scenario_mt);
            SubLObject tell_inference = hc_start_new_tell_query(tell);
            SubLObject tell_inference_ids = list(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(tell_inference)), inference_datastructures_inference.inference_suid(tell_inference));
            SubLObject substitutions = NIL;
            await_end_of_hc_inference(tell_inference);
            substitutions = nreverse(substitute_terms_for_skolems(v_graph, tell_inference, scenario_mt));
            if (length(substitutions).numG(TEN_INTEGER)) {
                substitutions = subseq(substitutions, ZERO_INTEGER, NINE_INTEGER);
            }
            {
                SubLObject list_var = NIL;
                SubLObject substitution_info = NIL;
                SubLObject i = NIL;
                for (list_var = substitutions, substitution_info = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , substitution_info = list_var.first() , i = add(ONE_INTEGER, i)) {
                    {
                        SubLObject substitution = substitution_info.first();
                        SubLObject term_substitution = second(substitution_info);
                        SubLObject substitution_keys = Mapping.mapcar(FIRST, substitution);
                        SubLObject substitution_values = Mapping.mapcar(REST, substitution);
                        SubLObject substitution_map = dictionary_utilities.add_values_from_lists_to_dictionary(substitution_keys, substitution_values, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                        SubLObject augmented_graph = script_instance_editor_api.augment_complete_graph_for_script_instance(v_graph, substitution_map, term_substitution);
                        SubLObject payload = list(augmented_graph, tell_inference_ids, i);
                        accumulation.accumulation_add(accumulator, payload);
                    }
                }
            }
        }
        return accumulator;
    }

    /**
     * Constructs and runs the corroborated query that corresponds to the particular
     * input Tell.  Then, combines the results of the corroboration query with the
     * input GRAPH to generate updated graphs that are returned as the result.
     *
     * @return listp; of updated graph data-structures
     */
    public static final SubLObject hc_updated_graphs_after_corroboration_query(SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell, SubLObject tell_inference_ids, SubLObject tell_num) {
        {
            SubLObject accumulator = accumulation.new_list_accumulator(UNPROVIDED);
            hc_updated_graphs_after_corroboration_query_impl(accumulator, scenario_example, scenario_mt, tell, tell_inference_ids, tell_num);
            return accumulation.accumulation_contents(accumulator, $RESET);
        }
    }

    /**
     * Constructs and runs the corroborated query that corresponds to the particular
     * input Tell.  Then, combines the results of the corroboration query with the
     * input GRAPH to generate updated graphs which are returned as they become
     * available.
     *
     * @return INTEGERP the number of results identified
     */
    public static final SubLObject hc_updated_graphs_after_corroboration_query_asynchronous(SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell, SubLObject tell_inference_ids, SubLObject tell_num) {
        {
            SubLObject data_acc = accumulation.new_list_accumulator(UNPROVIDED);
            SubLObject results_acc = task_processor.new_intermediate_results_accumulator(data_acc);
            hc_updated_graphs_after_corroboration_query_impl(results_acc, scenario_example, scenario_mt, tell, tell_inference_ids, tell_num);
            return accumulation.accumulation_size(data_acc);
        }
    }

    public static final SubLObject hc_updated_graphs_after_corroboration_query_impl(SubLObject accumulator, SubLObject scenario_example, SubLObject scenario_mt, SubLObject tell, SubLObject tell_inference_ids, SubLObject tell_num) {
        {
            SubLObject v_graph = script_instance_editor_api.get_complete_graph_for_script_instance(scenario_example, scenario_mt);
            SubLObject tell_inference = inference_datastructures_problem_store.find_inference_by_ids(tell_inference_ids.first(), second(tell_inference_ids));
            {
                SubLObject relevant_tell_bindings = list(nth(tell_num, inference_kernel.inference_all_answer_result_bindings(tell_inference)));
                SubLObject substitution_info = substitute_terms_for_skolems_internal(v_graph, relevant_tell_bindings, scenario_mt).first();
                SubLObject term_substitution = second(substitution_info);
                SubLObject substitution = substitution_info.first();
                SubLObject substitution_keys = Mapping.mapcar(FIRST, substitution);
                SubLObject substitution_values = Mapping.mapcar(REST, substitution);
                SubLObject substitution_map = dictionary_utilities.add_values_from_lists_to_dictionary(substitution_keys, substitution_values, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                v_graph = script_instance_editor_api.augment_complete_graph_for_script_instance(v_graph, substitution_map, term_substitution);
            }
            {
                SubLObject corroboration_query_formulas = hc_construct_corroboration_query_formulas(tell, tell_inference);
                SubLObject corroboration_query_formula = nth(tell_num, corroboration_query_formulas);
                SubLObject corrob_query_mt = kb_query.kbq_mt(kb_mapping_utilities.fpred_value_in_any_mt(tell, $$testQuerySpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject corroboration_inference = inference_kernel.new_continuable_inference(corroboration_query_formula, corrob_query_mt, UNPROVIDED);
                SubLObject process_wrapper = process_utilities.new_process_wrapper(cconcatenate($str_alt123$Corroboration_Query_for_Tell__, format_nil.format_nil_a_no_copy(tell)), HC_RUN_INFERENCE, list(corroboration_inference));
                SubLObject substitutions = NIL;
                await_end_of_hc_inference(corroboration_inference);
                substitutions = nreverse(substitute_terms_for_skolems(v_graph, corroboration_inference, scenario_mt));
                if (length(substitutions).numG(TEN_INTEGER)) {
                    substitutions = subseq(substitutions, ZERO_INTEGER, NINE_INTEGER);
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject substitution_info = NIL;
                    SubLObject i = NIL;
                    for (list_var = substitutions, substitution_info = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , substitution_info = list_var.first() , i = add(ONE_INTEGER, i)) {
                        {
                            SubLObject substitution = substitution_info.first();
                            SubLObject term_substitution = second(substitution_info);
                            SubLObject substitution_keys = Mapping.mapcar(FIRST, substitution);
                            SubLObject substitution_values = Mapping.mapcar(REST, substitution);
                            SubLObject substitution_map = dictionary_utilities.add_values_from_lists_to_dictionary(substitution_keys, substitution_values, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                            SubLObject augmented_graph = script_instance_editor_api.augment_complete_graph_for_script_instance(v_graph, substitution_map, term_substitution);
                            SubLObject payload = list(augmented_graph, i);
                            accumulation.accumulation_add(accumulator, payload);
                        }
                    }
                }
                inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_inference.inference_problem_store(corroboration_inference));
            }
        }
        return accumulator;
    }

    // deflexical
    private static final SubLSymbol $default_hc_inference_polling_slice$ = makeSymbol("*DEFAULT-HC-INFERENCE-POLLING-SLICE*");

    // defparameter
    private static final SubLSymbol $hc_inference_polling_slice$ = makeSymbol("*HC-INFERENCE-POLLING-SLICE*");

    public static final SubLObject await_end_of_hc_inference(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (NIL == inference_datastructures_inference.exhausted_inference_p(inference)) {
                if (NIL != inference_datastructures_inference.inference_invalid_p(inference)) {
                    return $BAILING;
                } else
                    if (NIL != inference_datastructures_inference.suspended_inference_p(inference)) {
                        inference_kernel.continue_inference(inference, UNPROVIDED);
                    } else {
                        sleep($hc_inference_polling_slice$.getDynamicValue(thread));
                    }

            } 
            return $DONE;
        }
    }

    /**
     *
     *
     * @see HC-FIND-HIGHER-ALERT-SCENARIO-TYPES-INT
     */
    public static final SubLObject hc_find_higher_alert_scenario_types(SubLObject scenario_types, SubLObject data_mt, SubLObject data_mt_time) {
        if (data_mt == UNPROVIDED) {
            data_mt = $const128$RedDawnAvailableData_1700_08_2606;
        }
        if (data_mt_time == UNPROVIDED) {
            data_mt_time = $list_alt129;
        }
        return hc_scenario_and_tell_info(hc_find_higher_alert_scenario_types_int(scenario_types, data_mt, data_mt_time));
    }

    /**
     * Returns results one at a time.  @see HC-FIND-HIGHER-ALERT-SCENARIO-TYPES-INT
     */
    public static final SubLObject hc_find_higher_alert_scenario_types_asynchronous(SubLObject scenario_types, SubLObject data_mt, SubLObject data_mt_time) {
        if (data_mt == UNPROVIDED) {
            data_mt = $const128$RedDawnAvailableData_1700_08_2606;
        }
        if (data_mt_time == UNPROVIDED) {
            data_mt_time = $list_alt129;
        }
        return hc_scenario_and_tell_info_asynchronous(hc_find_higher_alert_scenario_types_int(scenario_types, data_mt, data_mt_time));
    }

    /**
     * Find a higher alert scenario-types that subsume the input scenario-types that
     * seem to have occurred given the data in the input data MT.
     */
    public static final SubLObject hc_find_higher_alert_scenario_types_int(SubLObject scenario_types, SubLObject data_mt, SubLObject data_mt_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject higher_alert_scenario_types = NIL;
                {
                    SubLObject cdolist_list_var = scenario_types;
                    SubLObject scenario_type = NIL;
                    for (scenario_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , scenario_type = cdolist_list_var.first()) {
                        {
                            SubLObject formula = list($$suspectedTypeInData, scenario_type, data_mt);
                            thread.resetMultipleValues();
                            {
                                SubLObject assertedP = ke.ke_assert_now(formula, data_mt, UNPROVIDED, UNPROVIDED);
                                SubLObject error_msg = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == assertedP) {
                                    Errors.warn($str_alt132$Failed_to_assert__S_in__S_due_to_, formula, data_mt, error_msg);
                                }
                            }
                        }
                    }
                }
                higher_alert_scenario_types = ask_utilities.query_variable($sym133$_ALERTING_TYPE, list($$thereExists, $sym134$_SUSPECT_TYPE, list($$and, list($$highAlertTypeForDomain, $sym133$_ALERTING_TYPE, data_mt), list($$suspectedTypeInData, $sym134$_SUSPECT_TYPE, data_mt), $list_alt136, list($$unknownSentence, list($$thereExists, $sym138$_FREE_SUSPECT_TYPE, listS($$and, list($$suspectedTypeInData, $sym138$_FREE_SUSPECT_TYPE, data_mt), $list_alt139))))), list($$MtSpace, data_mt, list($$MtTimeDimFn, data_mt_time)), UNPROVIDED);
                {
                    SubLObject cdolist_list_var = scenario_types;
                    SubLObject scenario_type = NIL;
                    for (scenario_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , scenario_type = cdolist_list_var.first()) {
                        {
                            SubLObject formula = list($$suspectedTypeInData, scenario_type, data_mt);
                            thread.resetMultipleValues();
                            {
                                SubLObject unassertedP = ke.ke_unassert_now(formula, data_mt);
                                SubLObject error_msg = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == unassertedP) {
                                    Errors.warn($str_alt141$Failed_to_unassert__S_in__S_due_t, formula, data_mt, error_msg);
                                }
                            }
                        }
                    }
                }
                return higher_alert_scenario_types;
            }
        }
    }

    public static final SubLObject declare_hypothesis_corroboration_file() {
        declareFunction("cb_link_hyp_corrob", "CB-LINK-HYP-CORROB", 0, 1, false);
        declareFunction("cb_hc", "CB-HC", 1, 0, false);
        declareFunction("cb_hc_display_tells", "CB-HC-DISPLAY-TELLS", 1, 0, false);
        declareFunction("tell_scenario_mt", "TELL-SCENARIO-MT", 1, 0, false);
        declareFunction("tell_data_mt", "TELL-DATA-MT", 1, 0, false);
        declareFunction("tell_mt_and_type", "TELL-MT-AND-TYPE", 1, 0, false);
        declareFunction("cb_hc_display_tell", "CB-HC-DISPLAY-TELL", 2, 0, false);
        declareFunction("cb_link_hc_start_tell_query", "CB-LINK-HC-START-TELL-QUERY", 1, 1, false);
        declareFunction("cb_hc_run_tell_query", "CB-HC-RUN-TELL-QUERY", 1, 0, false);
        declareFunction("cb_link_hc_load_tell_scenario_partition", "CB-LINK-HC-LOAD-TELL-SCENARIO-PARTITION", 1, 1, false);
        declareFunction("cb_hc_load_tell_scenario_partition", "CB-HC-LOAD-TELL-SCENARIO-PARTITION", 1, 0, false);
        declareFunction("hc_tell_scenario_partition_file", "HC-TELL-SCENARIO-PARTITION-FILE", 1, 0, false);
        declareFunction("cb_link_hc_construct_corrob_queries", "CB-LINK-HC-CONSTRUCT-CORROB-QUERIES", 1, 1, false);
        declareFunction("cb_hc_construct_corroboration_queries", "CB-HC-CONSTRUCT-CORROBORATION-QUERIES", 1, 0, false);
        declareFunction("cb_link_hc_start_corroboration_query", "CB-LINK-HC-START-CORROBORATION-QUERY", 2, 1, false);
        declareFunction("cb_hc_run_corroboration_query", "CB-HC-RUN-CORROBORATION-QUERY", 1, 0, false);
        declareFunction("cb_link_hc_clear_tell_errors", "CB-LINK-HC-CLEAR-TELL-ERRORS", 1, 1, false);
        declareFunction("cb_hc_clear_tell_errors", "CB-HC-CLEAR-TELL-ERRORS", 1, 0, false);
        declareFunction("get_tell_property", "GET-TELL-PROPERTY", 2, 0, false);
        declareFunction("set_tell_property", "SET-TELL-PROPERTY", 3, 0, false);
        declareFunction("add_tell_property", "ADD-TELL-PROPERTY", 3, 0, false);
        declareFunction("tell_recoverable_error", "TELL-RECOVERABLE-ERROR", 2, 0, false);
        declareFunction("hc_start_new_tell_query", "HC-START-NEW-TELL-QUERY", 1, 0, false);
        declareFunction("hc_run_inference", "HC-RUN-INFERENCE", 2, 0, false);
        declareFunction("hc_start_new_corroboration_query", "HC-START-NEW-CORROBORATION-QUERY", 2, 0, false);
        declareFunction("hc_observability_of_formula", "HC-OBSERVABILITY-OF-FORMULA", 2, 0, false);
        declareFunction("hc_remove_singleton_var_literals", "HC-REMOVE-SINGLETON-VAR-LITERALS", 1, 0, false);
        declareFunction("hc_add_sentences_from_temporally_qualified_mts", "HC-ADD-SENTENCES-FROM-TEMPORALLY-QUALIFIED-MTS", 1, 0, false);
        declareFunction("hc_construct_corroboration_query_formulas", "HC-CONSTRUCT-CORROBORATION-QUERY-FORMULAS", 2, 0, false);
        declareFunction("hc_corrob_query_different_literals", "HC-CORROB-QUERY-DIFFERENT-LITERALS", 2, 0, false);
        declareFunction("substitute_terms_for_skolems", "SUBSTITUTE-TERMS-FOR-SKOLEMS", 3, 0, false);
        declareFunction("substitute_terms_for_skolems_internal", "SUBSTITUTE-TERMS-FOR-SKOLEMS-INTERNAL", 3, 0, false);
        declareFunction("hc_mark_binding_values_for_substitution", "HC-MARK-BINDING-VALUES-FOR-SUBSTITUTION", 1, 0, false);
        declareFunction("gather_formulas_from_graph", "GATHER-FORMULAS-FROM-GRAPH", 1, 0, false);
        declareFunction("get_var_skolem_substitutions", "GET-VAR-SKOLEM-SUBSTITUTIONS", 1, 0, false);
        declareFunction("hc_scenario_and_tell_info", "HC-SCENARIO-AND-TELL-INFO", 0, 1, false);
        declareFunction("hc_scenario_and_tell_info_asynchronous", "HC-SCENARIO-AND-TELL-INFO-ASYNCHRONOUS", 0, 1, false);
        declareFunction("hc_scenario_and_tell_info_impl", "HC-SCENARIO-AND-TELL-INFO-IMPL", 2, 0, false);
        declareFunction("hc_updated_graphs_after_tell", "HC-UPDATED-GRAPHS-AFTER-TELL", 3, 0, false);
        declareFunction("hc_updated_graphs_after_tell_asynchronous", "HC-UPDATED-GRAPHS-AFTER-TELL-ASYNCHRONOUS", 3, 0, false);
        declareFunction("hc_updated_graphs_after_tell_impl", "HC-UPDATED-GRAPHS-AFTER-TELL-IMPL", 4, 0, false);
        declareFunction("hc_updated_graphs_after_corroboration_query", "HC-UPDATED-GRAPHS-AFTER-CORROBORATION-QUERY", 5, 0, false);
        declareFunction("hc_updated_graphs_after_corroboration_query_asynchronous", "HC-UPDATED-GRAPHS-AFTER-CORROBORATION-QUERY-ASYNCHRONOUS", 5, 0, false);
        declareFunction("hc_updated_graphs_after_corroboration_query_impl", "HC-UPDATED-GRAPHS-AFTER-CORROBORATION-QUERY-IMPL", 6, 0, false);
        declareFunction("await_end_of_hc_inference", "AWAIT-END-OF-HC-INFERENCE", 1, 0, false);
        declareFunction("hc_find_higher_alert_scenario_types", "HC-FIND-HIGHER-ALERT-SCENARIO-TYPES", 1, 2, false);
        declareFunction("hc_find_higher_alert_scenario_types_asynchronous", "HC-FIND-HIGHER-ALERT-SCENARIO-TYPES-ASYNCHRONOUS", 1, 2, false);
        declareFunction("hc_find_higher_alert_scenario_types_int", "HC-FIND-HIGHER-ALERT-SCENARIO-TYPES-INT", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_hypothesis_corroboration_file() {
        defparameter("*HC-CB-REFRESH-MAIN-PAGE?*", NIL);
        defparameter("*HC-STATE*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*HC-SCENARIO-EXAMPLE-TUPLES*", $list_alt110);
        defparameter("*HC-SCENARIO-EXAMPLE-TYPES*", $list_alt111);
        deflexical("*DEFAULT-HC-INFERENCE-POLLING-SLICE*", $float$0_5);
        defparameter("*HC-INFERENCE-POLLING-SLICE*", $default_hc_inference_polling_slice$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject setup_hypothesis_corroboration_file() {
                cb_utilities.setup_cb_link_method($HYP_CORROB, CB_LINK_HYP_CORROB, ONE_INTEGER);
        cb_utilities.declare_cb_tool($HYP_CORROB, $$$Hypothesis_Corroboration_Tool, $$$HypCorrob, $str_alt7$Find_hypotheses_and_generate_corr);
        utilities_macros.register_html_state_variable($sym8$_HC_CB_REFRESH_MAIN_PAGE__);
        html_macros.note_html_handler_function(CB_HC);
        cb_utilities.setup_cb_link_method($HC_START_TELL_QUERY, CB_LINK_HC_START_TELL_QUERY, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HC_RUN_TELL_QUERY);
        cb_utilities.setup_cb_link_method($HC_LOAD_TELL_SCENARIO_PARTITION, CB_LINK_HC_LOAD_TELL_SCENARIO_PARTITION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HC_LOAD_TELL_SCENARIO_PARTITION);
        cb_utilities.setup_cb_link_method($HC_CONSTRUCT_CORROB_QUERIES, CB_LINK_HC_CONSTRUCT_CORROB_QUERIES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HC_CONSTRUCT_CORROBORATION_QUERIES);
        cb_utilities.setup_cb_link_method($HC_START_CORROBORATION_QUERY, CB_LINK_HC_START_CORROBORATION_QUERY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HC_RUN_CORROBORATION_QUERY);
        cb_utilities.setup_cb_link_method($HC_CLEAR_TELL_ERRORS, CB_LINK_HC_CLEAR_TELL_ERRORS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HC_CLEAR_TELL_ERRORS);
        utilities_macros.register_html_state_variable($hc_state$);
        access_macros.register_external_symbol(HC_SCENARIO_AND_TELL_INFO);
        access_macros.register_external_symbol(HC_SCENARIO_AND_TELL_INFO_ASYNCHRONOUS);
        access_macros.register_external_symbol(HC_UPDATED_GRAPHS_AFTER_TELL);
        access_macros.register_external_symbol(HC_UPDATED_GRAPHS_AFTER_TELL_ASYNCHRONOUS);
        access_macros.register_external_symbol(HC_UPDATED_GRAPHS_AFTER_CORROBORATION_QUERY);
        access_macros.register_external_symbol(HC_UPDATED_GRAPHS_AFTER_CORROBORATION_QUERY_ASYNCHRONOUS);
        access_macros.register_external_symbol(HC_FIND_HIGHER_ALERT_SCENARIO_TYPES);
        access_macros.register_external_symbol(HC_FIND_HIGHER_ALERT_SCENARIO_TYPES_ASYNCHRONOUS);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_HypCorrob_ = makeString("[HypCorrob]");



    static private final SubLString $str_alt2$cb_hc = makeString("cb-hc");

    private static final SubLSymbol $HYP_CORROB = makeKeyword("HYP-CORROB");

    private static final SubLSymbol CB_LINK_HYP_CORROB = makeSymbol("CB-LINK-HYP-CORROB");

    static private final SubLString $$$Hypothesis_Corroboration_Tool = makeString("Hypothesis Corroboration Tool");

    static private final SubLString $$$HypCorrob = makeString("HypCorrob");

    static private final SubLString $str_alt7$Find_hypotheses_and_generate_corr = makeString("Find hypotheses and generate corroboration queries.");

    static private final SubLSymbol $sym8$_HC_CB_REFRESH_MAIN_PAGE__ = makeSymbol("*HC-CB-REFRESH-MAIN-PAGE?*");

    static private final SubLString $$$Hypothesis_Corroboration = makeString("Hypothesis Corroboration");

    static private final SubLString $$$Refresh = makeString("Refresh");

    static private final SubLString $str_alt11$5__URL_cg_cb_hyp_corrob = makeString("5; URL=cg?cb-hyp-corrob");

    static private final SubLString $str_alt12$_Refresh_ = makeString("[Refresh]");

    private static final SubLSymbol CB_HC = makeSymbol("CB-HC");

    public static final SubLObject $$ScenarioTell = constant_handles.reader_make_constant_shell(makeString("ScenarioTell"));

    public static final SubLObject $$tellDerivesFromScenario = constant_handles.reader_make_constant_shell(makeString("tellDerivesFromScenario"));

    public static final SubLObject $$tellForTypeInData = constant_handles.reader_make_constant_shell(makeString("tellForTypeInData"));

    public static final SubLObject $$tellForType = constant_handles.reader_make_constant_shell(makeString("tellForType"));

    static private final SubLList $list_alt18 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol $HC_START_TELL_QUERY = makeKeyword("HC-START-TELL-QUERY");

    static private final SubLString $str_alt20$Type__ = makeString("Type: ");

    static private final SubLString $str_alt21$Mt__ = makeString("Mt: ");

    static private final SubLString $str_alt22$Scenario_Mt__ = makeString("Scenario Mt: ");

    private static final SubLSymbol $HC_LOAD_TELL_SCENARIO_PARTITION = makeKeyword("HC-LOAD-TELL-SCENARIO-PARTITION");

    private static final SubLSymbol $QUERY_INFERENCE = makeKeyword("QUERY-INFERENCE");

    static private final SubLString $str_alt25$Tell_Query_ = makeString("Tell Query:");

    private static final SubLSymbol $HC_CONSTRUCT_CORROB_QUERIES = makeKeyword("HC-CONSTRUCT-CORROB-QUERIES");

    private static final SubLSymbol $CORROBORATION_QUERY_FORMULAS = makeKeyword("CORROBORATION-QUERY-FORMULAS");

    private static final SubLSymbol $CORROBORATION_QUERY_INFERENCES = makeKeyword("CORROBORATION-QUERY-INFERENCES");

    private static final SubLSymbol $HC_START_CORROBORATION_QUERY = makeKeyword("HC-START-CORROBORATION-QUERY");

    static private final SubLString $str_alt30$_Rerun_query_ = makeString("[Rerun query]");

    static private final SubLString $str_alt31$_Run_Query_ = makeString("[Run Query]");

    private static final SubLSymbol $ERROR_MESSAGES = makeKeyword("ERROR-MESSAGES");



    static private final SubLString $str_alt34$There_were_errors_with_this_tell_ = makeString("There were errors with this tell:");

    private static final SubLSymbol $HC_CLEAR_TELL_ERRORS = makeKeyword("HC-CLEAR-TELL-ERRORS");

    static private final SubLString $str_alt36$_Run_Tell_ = makeString("[Run Tell]");

    static private final SubLString $str_alt37$cb_hc_run_tell_query__A = makeString("cb-hc-run-tell-query&~A");

    private static final SubLSymbol CB_LINK_HC_START_TELL_QUERY = makeSymbol("CB-LINK-HC-START-TELL-QUERY");



    private static final SubLSymbol CB_HC_RUN_TELL_QUERY = makeSymbol("CB-HC-RUN-TELL-QUERY");

    static private final SubLString $str_alt41$_Load_Partition_ = makeString("[Load Partition]");

    static private final SubLString $str_alt42$cb_hc_load_tell_scenario_partitio = makeString("cb-hc-load-tell-scenario-partition&~A");

    private static final SubLSymbol CB_LINK_HC_LOAD_TELL_SCENARIO_PARTITION = makeSymbol("CB-LINK-HC-LOAD-TELL-SCENARIO-PARTITION");

    private static final SubLSymbol CB_HC_LOAD_TELL_SCENARIO_PARTITION = makeSymbol("CB-HC-LOAD-TELL-SCENARIO-PARTITION");

    static private final SubLString $str_alt45$_cyc_projects_InformationFusion_s = makeString("/cyc/projects/InformationFusion/scenario-rep-and-rec/scenario-generation/partitions/");

    static private final SubLString $str_alt46$_cpart = makeString(".cpart");

    static private final SubLString $str_alt47$_Construct_Corroboration_Queries_ = makeString("[Construct Corroboration Queries]");

    static private final SubLString $str_alt48$cb_hc_construct_corroboration_que = makeString("cb-hc-construct-corroboration-queries&~A");

    private static final SubLSymbol CB_LINK_HC_CONSTRUCT_CORROB_QUERIES = makeSymbol("CB-LINK-HC-CONSTRUCT-CORROB-QUERIES");

    private static final SubLSymbol CB_HC_CONSTRUCT_CORROBORATION_QUERIES = makeSymbol("CB-HC-CONSTRUCT-CORROBORATION-QUERIES");

    static private final SubLString $str_alt51$_Run_Corroboration_Query_ = makeString("[Run Corroboration Query]");

    static private final SubLString $str_alt52$cb_hc_run_corroboration_query__A_ = makeString("cb-hc-run-corroboration-query&~A&:.n=~A");

    private static final SubLSymbol CB_LINK_HC_START_CORROBORATION_QUERY = makeSymbol("CB-LINK-HC-START-CORROBORATION-QUERY");



    private static final SubLSymbol CB_HC_RUN_CORROBORATION_QUERY = makeSymbol("CB-HC-RUN-CORROBORATION-QUERY");

    static private final SubLString $str_alt56$_Clear_Errors_ = makeString("[Clear Errors]");

    static private final SubLString $str_alt57$cb_hc_clear_tell_errors__A = makeString("cb-hc-clear-tell-errors&~A");

    private static final SubLSymbol CB_LINK_HC_CLEAR_TELL_ERRORS = makeSymbol("CB-LINK-HC-CLEAR-TELL-ERRORS");

    private static final SubLSymbol CB_HC_CLEAR_TELL_ERRORS = makeSymbol("CB-HC-CLEAR-TELL-ERRORS");

    public static final SubLSymbol $hc_state$ = makeSymbol("*HC-STATE*");

    static private final SubLString $str_alt61$Tell__A_property__A_not_a_listp__ = makeString("Tell ~A property ~A not a listp (~A) so can't add to it.");

    public static final SubLObject $$testQuerySpecification = constant_handles.reader_make_constant_shell(makeString("testQuerySpecification"));

    static private final SubLString $str_alt63$Could_not_determine_tell_s_KB_que = makeString("Could not determine tell's KB query.");

    static private final SubLString $str_alt64$Could_not_create_tell_s_KB_query_ = makeString("Could not create tell's KB query inference.");

    static private final SubLString $str_alt65$Query_for_tell_ = makeString("Query for tell ");

    private static final SubLSymbol HC_RUN_INFERENCE = makeSymbol("HC-RUN-INFERENCE");

    private static final SubLSymbol $PROCESS_WRAPPER = makeKeyword("PROCESS-WRAPPER");

    static private final SubLList $list_alt68 = list(makeKeyword("BROWSABLE?"), T);

    static private final SubLString $str_alt69$Could_not_create_corroboration_qu = makeString("Could not create corroboration query inference number ");

    static private final SubLString $str_alt70$_ = makeString(".");

    public static final SubLFloat $float$1_0 = makeDouble(1.0);

    static private final SubLSymbol $sym72$_NUM = makeSymbol("?NUM");

    public static final SubLObject $$observabilityOfTermInData = constant_handles.reader_make_constant_shell(makeString("observabilityOfTermInData"));

    static private final SubLList $list_alt74 = list(makeSymbol("?NUM"));

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    static private final SubLSymbol $sym76$_SENTENCE = makeSymbol("?SENTENCE");

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    static private final SubLSymbol $sym78$_WHAT_TIME_FRAME = makeSymbol("?WHAT-TIME-FRAME");

    static private final SubLSymbol $sym79$_WHAT_GRANULARITY = makeSymbol("?WHAT-GRANULARITY");

    static private final SubLSymbol $sym80$_ARGS = makeSymbol("?ARGS");

    static private final SubLSymbol $sym81$_PRED = makeSymbol("?PRED");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt83 = list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeSymbol("?PRED"), list(constant_handles.reader_make_constant_shell(makeString("TheSet")), constant_handles.reader_make_constant_shell(makeString("hasLeaders")), constant_handles.reader_make_constant_shell(makeString("hasMembers")), constant_handles.reader_make_constant_shell(makeString("ableToControl")), constant_handles.reader_make_constant_shell(makeString("possesses")), constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("associates"))));

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    public static final SubLObject $$MtSpace = constant_handles.reader_make_constant_shell(makeString("MtSpace"));

    static private final SubLList $list_alt86 = list(list(constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), makeSymbol("?WHAT-TIME-FRAME"), makeSymbol("?WHAT-GRANULARITY")));

    static private final SubLList $list_alt87 = list(cons(makeSymbol("?PRED"), makeSymbol("?ARGS")));

    static private final SubLList $list_alt88 = list(list(constant_handles.reader_make_constant_shell(makeString("equalSymbols")), makeSymbol("?SENTENCE"), cons(makeSymbol("?PRED"), makeSymbol("?ARGS"))));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol INFERENCE_ANSWER_BINDINGS = makeSymbol("INFERENCE-ANSWER-BINDINGS");

    public static final SubLObject $$variableSubstitutionsForScenario = constant_handles.reader_make_constant_shell(makeString("variableSubstitutionsForScenario"));

    private static final SubLSymbol MAKE_EL_VAR = makeSymbol("MAKE-EL-VAR");

    public static final SubLObject $$observabilityThresholdForData = constant_handles.reader_make_constant_shell(makeString("observabilityThresholdForData"));





    static private final SubLString $str_alt96$do_broad_mt_index = makeString("do-broad-mt-index");





    public static final SubLObject $$MetaLanguagePredicate = constant_handles.reader_make_constant_shell(makeString("MetaLanguagePredicate"));

    static private final SubLSymbol $sym100$INDETERMINATE_TERM_ = makeSymbol("INDETERMINATE-TERM?");

    static private final SubLSymbol $sym101$_X = makeSymbol("?X");

    public static final SubLObject $const102$variablesExpectedDifferentInCorro = constant_handles.reader_make_constant_shell(makeString("variablesExpectedDifferentInCorroboration"));

    static private final SubLList $list_alt103 = list(makeSymbol("?X"));

    public static final SubLObject $$TestVocabularyMt = constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt"));

    static private final SubLList $list_alt105 = list(constant_handles.reader_make_constant_shell(makeString("different")));

    static private final SubLList $list_alt106 = cons(makeSymbol("VARIABLE"), makeSymbol("CONTENTS"));



    static private final SubLString $str_alt108$Expected_an_assertion_or_el_formu = makeString("Expected an assertion or el formula but found ~a");



    static private final SubLList $list_alt110 = list(cons(constant_handles.reader_make_constant_shell(makeString("MilitaryOperation")), constant_handles.reader_make_constant_shell(makeString("HYP-ParamilitaryOpExample-Paramilitary0p001"))), cons(constant_handles.reader_make_constant_shell(makeString("Piracy-AtSea")), constant_handles.reader_make_constant_shell(makeString("HYP-HijackingExample-Hijacking001"))), cons(constant_handles.reader_make_constant_shell(makeString("ScuttlingAWatercraft")), constant_handles.reader_make_constant_shell(makeString("HYP-ScuttlingExample-WatercraftScuttling001"))), cons(constant_handles.reader_make_constant_shell(makeString("TerroristWaterwayBlockingWithPiracy")), constant_handles.reader_make_constant_shell(makeString("HYP-WaterwayBlockingExample-TerroristWaterwayBlockingWithPiracy001"))));

    static private final SubLList $list_alt111 = list(constant_handles.reader_make_constant_shell(makeString("MilitaryOperation")), constant_handles.reader_make_constant_shell(makeString("Piracy-AtSea")), constant_handles.reader_make_constant_shell(makeString("ScuttlingAWatercraft")));

    private static final SubLSymbol HC_SCENARIO_AND_TELL_INFO = makeSymbol("HC-SCENARIO-AND-TELL-INFO");



    private static final SubLSymbol HC_SCENARIO_AND_TELL_INFO_ASYNCHRONOUS = makeSymbol("HC-SCENARIO-AND-TELL-INFO-ASYNCHRONOUS");

    public static final SubLObject $const115$sentenceParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("sentenceParameterValueInSpecification"));

    public static final SubLObject $$TestQueryFn = constant_handles.reader_make_constant_shell(makeString("TestQueryFn"));

    private static final SubLSymbol HC_UPDATED_GRAPHS_AFTER_TELL = makeSymbol("HC-UPDATED-GRAPHS-AFTER-TELL");

    private static final SubLSymbol HC_UPDATED_GRAPHS_AFTER_TELL_ASYNCHRONOUS = makeSymbol("HC-UPDATED-GRAPHS-AFTER-TELL-ASYNCHRONOUS");





    private static final SubLSymbol HC_UPDATED_GRAPHS_AFTER_CORROBORATION_QUERY = makeSymbol("HC-UPDATED-GRAPHS-AFTER-CORROBORATION-QUERY");

    private static final SubLSymbol HC_UPDATED_GRAPHS_AFTER_CORROBORATION_QUERY_ASYNCHRONOUS = makeSymbol("HC-UPDATED-GRAPHS-AFTER-CORROBORATION-QUERY-ASYNCHRONOUS");

    static private final SubLString $str_alt123$Corroboration_Query_for_Tell__ = makeString("Corroboration Query for Tell: ");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol $BAILING = makeKeyword("BAILING");



    private static final SubLSymbol HC_FIND_HIGHER_ALERT_SCENARIO_TYPES = makeSymbol("HC-FIND-HIGHER-ALERT-SCENARIO-TYPES");

    public static final SubLObject $const128$RedDawnAvailableData_1700_08_2606 = constant_handles.reader_make_constant_shell(makeString("RedDawnAvailableData-1700_08_2606Mt"));

    static private final SubLList $list_alt129 = list(constant_handles.reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(26), list(constant_handles.reader_make_constant_shell(makeString("MonthFn")), constant_handles.reader_make_constant_shell(makeString("August")), list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))));

    private static final SubLSymbol HC_FIND_HIGHER_ALERT_SCENARIO_TYPES_ASYNCHRONOUS = makeSymbol("HC-FIND-HIGHER-ALERT-SCENARIO-TYPES-ASYNCHRONOUS");

    public static final SubLObject $$suspectedTypeInData = constant_handles.reader_make_constant_shell(makeString("suspectedTypeInData"));

    static private final SubLString $str_alt132$Failed_to_assert__S_in__S_due_to_ = makeString("Failed to assert ~S in ~S due to error ~S~%");

    static private final SubLSymbol $sym133$_ALERTING_TYPE = makeSymbol("?ALERTING-TYPE");

    static private final SubLSymbol $sym134$_SUSPECT_TYPE = makeSymbol("?SUSPECT-TYPE");

    public static final SubLObject $$highAlertTypeForDomain = constant_handles.reader_make_constant_shell(makeString("highAlertTypeForDomain"));

    static private final SubLList $list_alt136 = list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?ALERTING-TYPE"), makeSymbol("?SUSPECT-TYPE")), list(constant_handles.reader_make_constant_shell(makeString("properSubSituationTypes")), makeSymbol("?ALERTING-TYPE"), makeSymbol("?SUSPECT-TYPE")));

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    static private final SubLSymbol $sym138$_FREE_SUSPECT_TYPE = makeSymbol("?FREE-SUSPECT-TYPE");

    static private final SubLList $list_alt139 = list(list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeSymbol("?FREE-SUSPECT-TYPE"), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?ALERTING-TYPE"), makeSymbol("?X")), list(constant_handles.reader_make_constant_shell(makeString("properSubSituationTypes")), makeSymbol("?ALERTING-TYPE"), makeSymbol("?X")))))));

    public static final SubLObject $$MtTimeDimFn = constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn"));

    static private final SubLString $str_alt141$Failed_to_unassert__S_in__S_due_t = makeString("Failed to unassert ~S in ~S due to error ~S~%");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_hypothesis_corroboration_file();
    }

    @Override
    public void initializeVariables() {
        init_hypothesis_corroboration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hypothesis_corroboration_file();
    }
}

