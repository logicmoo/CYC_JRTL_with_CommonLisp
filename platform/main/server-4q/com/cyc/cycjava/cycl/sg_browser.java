/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-BROWSER
 *  source file: /cyc/top/cycl/sg-browser.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_browser extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_browser() {
    }

    public static final SubLFile me = new sg_browser();


    // // Definitions
    public static final SubLObject cb_link_scen_gen(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt0$_ScenGen_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt2$sg_cb_main);
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

    // deflexical
    private static final SubLSymbol $sg_cb_test_cases$ = makeSymbol("*SG-CB-TEST-CASES*");

    // deflexical
    private static final SubLSymbol $sg_cb_use_case_situations$ = makeSymbol("*SG-CB-USE-CASE-SITUATIONS*");





    /**
     * This parameter toggles NL presentation in the SG browser
     */
    // defparameter
    private static final SubLSymbol $sg_show_assertions_in_english$ = makeSymbol("*SG-SHOW-ASSERTIONS-IN-ENGLISH*");

    public static final SubLObject sg_cb_process_by_id(SubLObject id) {
        return dictionary.dictionary_lookup($sg_cb_process_id_mapping$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject sg_cb_process_by_id_string(SubLObject id_string) {
        return dictionary.dictionary_lookup($sg_cb_process_id_mapping$.getGlobalValue(), read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    // defparameter
    public static final SubLSymbol $sg_cb_refresh_main_pageP$ = makeSymbol("*SG-CB-REFRESH-MAIN-PAGE?*");

    // defparameter
    public static final SubLSymbol $sg_cb_modules_loaded_at_least_onceP$ = makeSymbol("*SG-CB-MODULES-LOADED-AT-LEAST-ONCE?*");



    public static final SubLObject sg_cb_get_process_from_args(SubLObject args) {
        if (NIL != list_utilities.singletonP(args)) {
            return sg_cb_process_by_id(read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            return NIL;
        }
    }

    public static final SubLObject sg_css_sg_control_style(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(HTML_FANCY_DIV, $list_alt14, append(body, NIL));
        }
    }

    public static final SubLObject sg_css_sg_browser_style(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(HTML_FANCY_DIV, $list_alt15, append(body, NIL));
        }
    }

    public static final SubLObject sg_browser_style_span(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(HTML_FANCY_SPAN, $list_alt15, append(body, NIL));
        }
    }

    public static final SubLObject sg_control_style_span(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(HTML_FANCY_SPAN, $list_alt14, append(body, NIL));
        }
    }

    public static final SubLObject sg_cb_stylesheet_link() {
        return html_macros.html_stylesheet_link($str_alt17$_javascript_sg_browser_css, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown *sg-cb-test-cases*
     * @unknown *sg-cb-use-case-situations*
     */
    public static final SubLObject sg_cb_update_test_cases() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_vars.$mt_mt$.getGlobalValue(), thread);
                    $sg_cb_test_cases$.setGlobalValue(gt_methods.gt_all_inferiors($$genlMt, sg_utilities.$sg_root_mt$.getGlobalValue(), mt_vars.$mt_mt$.getGlobalValue()));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            $sg_cb_test_cases$.setGlobalValue(Sort.sort($sg_cb_test_cases$.getGlobalValue(), symbol_function($sym20$STRING_), symbol_function(FORT_NAME)));
            {
                SubLObject sits = NIL;
                SubLObject cdolist_list_var = $sg_cb_test_cases$.getGlobalValue();
                SubLObject use_case = NIL;
                for (use_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , use_case = cdolist_list_var.first()) {
                    sits = sg_utilities.sg_util_seeds_of_scenario(use_case);
                    dictionary.dictionary_enter($sg_cb_use_case_situations$.getGlobalValue(), use_case, sits);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_main(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject title = $$$Scenario_Generator;
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                sg_cb_stylesheet_link();
                sg_halt_auto_refresh_when_all_completed();
                if (NIL != $sg_cb_refresh_main_pageP$.getDynamicValue(thread)) {
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
                        html_utilities.html_markup($str_alt26$5__URL_cg_sg_cb_main);
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
                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt27$sg_control);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                cb_parameters.cyc_cgi_url_int();
                                                html_utilities.html_princ($str_alt28$sg_cb_refresh_use_cases);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != frame_name_var) {
                                                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(frame_name_var);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt29$_Reload_Use_Cases_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                html_utilities.html_indent(UNPROVIDED);
                                                cb_utilities.cb_link($SG_MODULE_BROWSER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    if (NIL == $sg_cb_test_cases$.getGlobalValue()) {
                                        sg_cb_update_test_cases();
                                    }
                                    sg_cb_display_processes();
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    sg_cb_select_test_case(arghash);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    sg_cb_show_new_kb_state(arghash);
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
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sg_browser_context(SubLObject test_mt, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject handler = $str_alt32$sg_cb_browser_context;
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt33$sg_browser);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            cb_parameters.cyc_cgi_url_int();
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$_a__a, handler, cb_utilities.cb_fort_identifier(test_mt));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != linktext) {
                                        html_utilities.html_princ(linktext);
                                    } else
                                        if (NIL != constant_handles.constant_p(test_mt)) {
                                            html_utilities.html_princ(kb_paths.fort_name(test_mt));
                                        } else
                                            if (NIL != nart_handles.nart_p(format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$_a, narts_high.nart_el_formula(test_mt)))) {
                                            }


                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_refresh_use_cases(SubLObject args) {
        sg_cb_update_test_cases();
        return sg_cb_main(args);
    }

    public static final SubLObject sg_situation_formula(SubLObject situation) {
        if (NIL != forts.fort_p(situation)) {
            return forts.fort_el_formula(situation);
        } else
            if (NIL != narts_high.naut_p(situation)) {
                return situation;
            }

        return NIL;
    }

    public static final SubLObject sg_cb_select_test_case(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt40$Select_a_test_case__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = $sg_cb_test_cases$.getGlobalValue();
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            {
                                SubLObject sits = dictionary.dictionary_lookup($sg_cb_use_case_situations$.getGlobalValue(), mt, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($str_alt27$sg_control);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_link($SG_LAUNCH, mt, $str_alt43$_Generate_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                                html_utilities.html_indent(UNPROVIDED);
                                                cb_utilities.cb_link($SG_BROWSER_CONTEXT, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var_8 = sits;
                                                    SubLObject sit = NIL;
                                                    for (sit = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , sit = cdolist_list_var_8.first()) {
                                                        html_utilities.html_glyph($NBSP, FOUR_INTEGER);
                                                        cb_utilities.cb_link($SG_BROWSER_CONTEXT, mt, sg_situation_formula(sit), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_browser_context(SubLObject args) {
        {
            SubLObject fort = cb_utilities.cb_guess_fort(args, UNPROVIDED);
            SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
            html_arghash.set_arghash_value($SCEN_MT, arghash, fort);
            sg_cb_display_scenario(arghash);
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_scenario_mt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_utilities.cb_link($SG_BROWSER_CONTEXT, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            if (NIL != $sg_cb_show_sub_context_counts$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt48$__a_, number_utilities.f_1_(length(gt_methods.gt_all_inferiors($$genlMt, mt, mt_vars.$mt_mt$.getGlobalValue()))));
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_scenario_mt_data(SubLObject scen_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_form($$genlMt, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt49$_);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                sg_cb_display_genl_scenarios(scen_mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        sg_cb_display_scenario_mt(scen_mt);
                                        html_utilities.html_newline(UNPROVIDED);
                                        sg_cb_display_spec_scenarios(scen_mt);
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
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_genl_scenarios(SubLObject scen_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genl_scen_mts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_vars.$mt_mt$.getGlobalValue(), thread);
                        genl_scen_mts = kb_mapping_utilities.pred_values(scen_mt, $$genlMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = genl_scen_mts;
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                        if (NIL != sg_utilities.sg_scenario_context_p(mt)) {
                            html_utilities.html_indent(TEN_INTEGER);
                            sg_cb_display_scenario_mt(mt);
                            html_utilities.html_newline(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_spec_scenarios(SubLObject scen_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genl_scen_mts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_vars.$mt_mt$.getGlobalValue(), thread);
                        genl_scen_mts = kb_mapping_utilities.pred_values(scen_mt, $$genlMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = genl_scen_mts;
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                        if (NIL != sg_utilities.sg_scenario_context_p(mt)) {
                            html_utilities.html_indent(TEN_INTEGER);
                            sg_cb_display_scenario_mt(mt);
                            html_utilities.html_newline(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_gaf(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(gaf, $sym51$GAF_ASSERTION_);
            {
                SubLObject args = assertions_high.gaf_args(gaf);
                {
                    SubLObject _prev_bind_0 = control_vars.$show_assertions_in_english$.currentBinding(thread);
                    try {
                        control_vars.$show_assertions_in_english$.bind($sg_show_assertions_in_english$.getDynamicValue(thread), thread);
                        if ((TWO_INTEGER == length(args)) && (NIL == control_vars.$show_assertions_in_english$.getDynamicValue(thread))) {
                            sg_cb_display_gaf_slot(gaf);
                        } else {
                            cb_utilities.cb_show_assertion_readably(gaf, T, NIL);
                        }
                    } finally {
                        control_vars.$show_assertions_in_english$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_gaf_slot(SubLObject gaf) {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        cb_utilities.cb_form(assertions_high.gaf_predicate(gaf), UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str_alt52$___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_link($ASSERTION, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_utilities.cb_form(assertions_high.gaf_arg2(gaf), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject sg_cb_display_scenario_assertions(SubLObject scen_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = sg_utilities.sg_util_scenario_terms(scen_mt);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt54$Local_Assertions_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                sg_cb_display_local_assertions(scen_mt, terms);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt27$sg_control);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject show_id = dhtml_macros.dhtml_visibility_generate_ids_and_actions($str_alt55$inherited_facts);
                            SubLObject show_action = thread.secondMultipleValue();
                            SubLObject hide_id = thread.thirdMultipleValue();
                            SubLObject hide_action = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
                            {
                                SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                if (NIL != show_id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(show_id);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt56$);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(href);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(show_action);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt57$_Show_Inherited_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                if (NIL != hide_id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(hide_id);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt56$);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(href);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(hide_action);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt58$_Hide_Inherited_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                dhtml_macros.dhtml_set_switched_visibility($str_alt55$inherited_facts, $INVISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt55$inherited_facts);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ($str_alt61$Inherited_Assertions_);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        sg_cb_display_inherited_assertions(scen_mt, terms);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_display_local_assertions(SubLObject mt, SubLObject terms) {
        if (terms == UNPROVIDED) {
            terms = NIL;
        }
        if (NIL == terms) {
            terms = sg_utilities.sg_util_scenario_terms(mt);
        }
        {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject assertions = sg_utilities.sg_util_assertions_of_term_in_mt(v_term, mt);
                    if (NIL != assertions) {
                        cb_utilities.cb_form(v_term, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_princ($str_alt49$_);
                        html_utilities.html_newline(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var_14 = assertions;
                            SubLObject cur_as = NIL;
                            for (cur_as = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , cur_as = cdolist_list_var_14.first()) {
                                sg_cb_display_gaf(cur_as);
                                html_utilities.html_newline(UNPROVIDED);
                            }
                        }
                        html_utilities.html_newline(UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_cb_display_inherited_assertions(SubLObject mt, SubLObject terms) {
        if (terms == UNPROVIDED) {
            terms = NIL;
        }
        if (NIL == terms) {
            terms = sg_utilities.sg_util_scenario_terms(mt);
        }
        {
            SubLObject v_context = NIL;
            for (v_context = sg_utilities.sg_util_next_scenario_context(mt); NIL != sg_utilities.sg_scenario_context_p(v_context); v_context = sg_utilities.sg_util_next_scenario_context(v_context)) {
                cb_utilities.cb_form(v_context, UNPROVIDED, UNPROVIDED);
                html_utilities.html_princ($str_alt49$_);
                html_utilities.html_newline(TWO_INTEGER);
                {
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject assertions = sg_utilities.sg_util_assertions_of_term_in_mt(v_term, v_context);
                            if (NIL != assertions) {
                                cb_utilities.cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str_alt49$_);
                                html_utilities.html_newline(UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var_15 = sg_utilities.sg_util_assertions_of_term_in_mt(v_term, v_context);
                                    SubLObject cur_as = NIL;
                                    for (cur_as = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , cur_as = cdolist_list_var_15.first()) {
                                        sg_cb_display_gaf(cur_as);
                                        html_utilities.html_newline(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline(UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_cb_display_scenario_module_info(SubLObject arghash) {
        {
            SubLObject mt = html_arghash.get_arghash_value($SCEN_MT, arghash);
            SubLObject expansion = kb_mapping_utilities.fpred_value_in_mt(mt, $$scenarioGeneratedByExpansion, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            if (NIL != forts.fort_p(expansion)) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt63$Expansion__);
                cb_utilities.cb_form(expansion, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_scenario(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject scen_mt = html_arghash.get_arghash_value($SCEN_MT, arghash);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                sg_cb_stylesheet_link();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
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
                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($str_alt64$Examining_Scenario__);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_utilities.cb_form(scen_mt, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt27$sg_control);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($SCEN_GEN, $str_alt65$_Main_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_LAUNCH, scen_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_CLEANUP_HYPOTHESES, scen_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_MODULE_BROWSER, $str_alt67$_Modules_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    sg_cb_display_scenario_module_info(arghash);
                                    sg_cb_display_scenario_assertions(scen_mt);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    cb_utilities.cb_form($$ScenarioContext, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_indent(UNPROVIDED);
                                    html_utilities.html_princ($str_alt69$Relations_);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    sg_cb_display_scenario_mt_data(scen_mt);
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_show_new_kb_state(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    kb_utilities.show_new_kb_state(html_macros.$html_stream$.getDynamicValue(thread));
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            cb_utilities.cb_link($SG_CLEAR_NEW_KB_STATE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_sg_clear_new_kb_state(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt71$_Clear_New_KB_State_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt72$sg_cb_clear_new_kb_state);
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
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
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
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt74$WARNING__This_will_change_your_KB, control_vars.build_kb_loaded());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_clear_new_kb_state(SubLObject args) {
        kb_utilities.clear_new_kb_state();
        sg_cb_update_test_cases();
        return sg_cb_main(args);
    }

    // deflexical
    private static final SubLSymbol $sg_cb_scen_gen_process_label$ = makeSymbol("*SG-CB-SCEN-GEN-PROCESS-LABEL*");

    public static final SubLObject sg_cb_launch_func(SubLObject pw, SubLObject arghash) {
        {
            SubLObject mt = html_arghash.get_arghash_value($SG_MT, arghash);
            SubLObject time_limit_p = html_arghash.get_arghash_value($SG_TIME_LIMIT_P, arghash);
            SubLObject time_limit = html_arghash.get_arghash_value($SG_TIME_LIMIT, arghash);
            SubLObject search_type = html_arghash.get_arghash_value($SG_SEARCH_TYPE, arghash);
            SubLObject initial_refinementP = html_arghash.get_arghash_value($SG_INITIAL_REFINEMENT, arghash);
            SubLObject refinement_cutoff = html_arghash.get_arghash_value($SG_REFINEMENT_CUTOFF, arghash);
            SubLObject refinement_cutoff_iterations_number = html_arghash.get_arghash_value($SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, arghash);
            SubLObject active_modules = sg_modules.sg_mod_all_active_modules();
            SubLObject search_properties = sg_abduction.sg_ab_default_search_properties();
            search_properties = putf(search_properties, $PROCESS_WRAPPER, pw);
            search_properties = putf(search_properties, $SEARCH_TYPE, search_type);
            search_properties = putf(search_properties, $ACTIVE_MODULES, active_modules);
            search_properties = putf(search_properties, $SG_INITIAL_REFINEMENT, initial_refinementP);
            search_properties = putf(search_properties, $SG_REFINEMENT_CUTOFF, refinement_cutoff);
            search_properties = putf(search_properties, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, refinement_cutoff_iterations_number);
            if (time_limit_p == $NO_LIMIT) {
                search_properties = putf(search_properties, $TIME_CUTOFF, NIL);
            } else {
                search_properties = putf(search_properties, $TIME_CUTOFF, time_limit);
            }
            return sg_abduction.sg_abductive_search(mt, search_properties);
        }
    }

    public static final SubLObject sg_cb_launch_scen_gen(SubLObject arghash) {
        {
            SubLObject mt = html_arghash.get_arghash_value($SG_MT, arghash);
            SubLObject pw = process_utilities.new_process_wrapper($sg_cb_scen_gen_process_label$.getGlobalValue(), SG_CB_LAUNCH_FUNC, list(arghash));
            SubLObject id = process_utilities.process_wrapper_get_id(pw);
            process_utilities.process_wrapper_set_property(pw, $SG_MT, mt);
            process_utilities.process_wrapper_set_property(pw, $INFERENCE_LOG, queues.create_queue());
            process_utilities.process_wrapper_set_property(pw, $ACTIVE_MODULES, sg_modules.sg_mod_all_active_modules());
            dictionary.dictionary_enter($sg_cb_process_id_mapping$.getGlobalValue(), id, pw);
            $sg_cb_processes$.setGlobalValue(cons(id, $sg_cb_processes$.getGlobalValue()));
            return NIL;
        }
    }

    public static final SubLObject sg_cb_launch_options(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_limit = html_arghash.get_arghash_value($SG_TIME_LIMIT, arghash);
                html_arghash.set_arghash_value($SG_TIME_LIMIT_P, arghash, $LIMIT);
                html_arghash.set_arghash_value($SG_TIME_LIMIT, arghash, $int$360);
                html_arghash.set_arghash_value($SG_SEARCH_TYPE, arghash, $BREADTH_FIRST);
                html_arghash.set_arghash_value($SG_REFINEMENT_CUTOFF, arghash, $QUIESCENCE);
                html_arghash.set_arghash_value($SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, arghash, ONE_INTEGER);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
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
                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_arghash.html_arghash_checkbox_input(arghash, $SG_INITIAL_REFINEMENT, T, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_glyph($NBSP, UNPROVIDED);
                                        html_utilities.html_princ($str_alt96$Perform_initial_refinement_in_See);
                                        html_utilities.html_newline(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
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
                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_utilities.html_princ($str_alt97$Time_Cutoff_);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_TIME_LIMIT_P, $NO_LIMIT);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_princ($$$Run_forever);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_TIME_LIMIT_P, $LIMIT);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_arghash.html_arghash_text_input(arghash, $SG_TIME_LIMIT, time_limit, THREE_INTEGER, UNPROVIDED);
                                                                html_utilities.html_princ($str_alt99$_seconds);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
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
                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_utilities.html_princ($str_alt100$Search_Type_);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_SEARCH_TYPE, $BREADTH_FIRST);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_princ($$$Breadth_First);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_SEARCH_TYPE, $BEST_FIRST);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_princ($str_alt103$Best_First__Experimental_);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
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
                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_utilities.html_princ($str_alt104$Refinement_Cutoff_);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_REFINEMENT_CUTOFF, $QUIESCENCE);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_princ($$$Quiescence);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_radio_input(arghash, $SG_REFINEMENT_CUTOFF, $ITERATIONS);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_arghash.html_arghash_text_input(arghash, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, time_limit, THREE_INTEGER, UNPROVIDED);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_princ($$$iterations);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sg_launch(SubLObject mt, SubLObject linktext) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt43$_Generate_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                if (NIL != mt) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt108$sg_cb_launcher_page__a, cb_utilities.cb_fort_identifier(mt));
                } else {
                    html_utilities.html_princ($str_alt109$sg_cb_launcher_page);
                }
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

    public static final SubLObject sg_cb_launcher_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
                SubLObject mt = NIL;
                if (NIL != args) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject id = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt111);
                        id = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            mt = cb_utilities.cb_guess_fort(id, UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt111);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                sg_cb_stylesheet_link();
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
                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($$$Launch_New_Scenario_Generation);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt27$sg_control);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($SCEN_GEN, $str_alt65$_Main_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_MODULE_BROWSER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
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
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt113$sg_cb_launch_page_handler, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt114$Enter_Starting_Scenario_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_arghash.html_arghash_fort_input(arghash, $SG_MT, mt, $int$40, $$$Complete, $$ScenarioContext);
                                                html_utilities.html_indent(FIVE_INTEGER);
                                                html_arghash.html_arghash_submit_input(arghash, $$$Generate, $SG_LAUNCH_SCEN_GEN, UNPROVIDED);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                sg_cb_launch_options(arghash);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
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
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_launch_page_handler(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject launchingP = html_arghash.exists_arghash_valueP($SG_LAUNCH_SCEN_GEN, arghash);
            if (NIL != launchingP) {
                sg_cb_launch_scen_gen(arghash);
            }
            return sg_cb_main(NIL);
        }
    }

    public static final SubLObject cb_link_sg_abort_launch(SubLObject id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt121$_Abort_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt27$sg_control);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt122$sg_cb_abort_launch__a, id);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(linktext);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_abort_launch(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt125);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pw = sg_cb_process_by_id(id);
                    if (!((NIL != process_utilities.process_wrapper_process_completedP(pw)) || (NIL != process_utilities.process_wrapper_process_abortedP(pw)))) {
                        process_utilities.process_wrapper_process_abort(pw);
                    }
                    return sg_cb_main(NIL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt125);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sg_forget(SubLObject id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt127$_Forget_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt27$sg_control);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt128$sg_cb_forget__a, id);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(linktext);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_forget(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt125);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pw = sg_cb_process_by_id(id);
                    sg_cb_destroy_inference_log(pw);
                    $sg_cb_processes$.setGlobalValue(remove(id, $sg_cb_processes$.getGlobalValue(), symbol_function($sym131$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    dictionary.dictionary_remove($sg_cb_process_id_mapping$.getGlobalValue(), id);
                }
                return sg_cb_main(NIL);
            } else {
                cdestructuring_bind_error(datum, $list_alt125);
            }
        }
        return NIL;
    }

    /**
     * This function makes sure that any inferenes (forwards and backwards)
     * created during the process run can be reclaimed by the GC when this
     * process is destroyed.
     */
    public static final SubLObject sg_cb_destroy_inference_log(SubLObject pw) {
        {
            SubLObject inference_log = process_utilities.process_wrapper_get_property(pw, $INFERENCE_LOG, UNPROVIDED);
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_log);
            SubLObject inference = NIL;
            for (inference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference = cdolist_list_var.first()) {
                if (NIL != cb_forward_inference_browser.forward_inference_clump_p(inference)) {
                    cb_forward_inference_browser.destroy_forward_inference_clump(inference);
                }
                if (NIL != inference_datastructures_inference.inference_p(inference)) {
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                }
                if (NIL != inference_datastructures_problem_store.problem_store_p(inference)) {
                    inference_datastructures_problem_store.destroy_problem_store(inference);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_get_pw_state_string(SubLObject state) {
        return Strings.string_upcase(write_to_string(state, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sg_cb_display_processes() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dictionary.dictionary_empty_p($sg_cb_process_id_mapping$.getGlobalValue())) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$No_running_processes_at_this_time);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } else {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt134$Scenario_Generation_Processes_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt27$sg_control);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_utilities.cb_link($SG_REFRESH_TOGGLE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = $sg_cb_processes$.getGlobalValue();
                            SubLObject id = NIL;
                            for (id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , id = cdolist_list_var.first()) {
                                {
                                    SubLObject pw = sg_cb_process_by_id(id);
                                    sg_cb_display_pw_table_row(pw);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_pw_table_row(SubLObject pw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = process_utilities.process_wrapper_get_state(pw);
                SubLObject state_string = sg_cb_get_pw_state_string(state);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject mt = process_utilities.process_wrapper_get_property(pw, $SG_MT, NIL);
                                    if (NIL != mt) {
                                        cb_utilities.cb_link($SG_BROWSER_CONTEXT, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        html_utilities.html_princ($$$No_Mt_Specified);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(state_string);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject id = process_utilities.process_wrapper_get_id(pw);
                                    if ((NIL != process_utilities.process_wrapper_process_completedP(pw)) || (NIL != process_utilities.process_wrapper_process_abortedP(pw))) {
                                        cb_utilities.cb_link($SG_FORGET, id, $str_alt127$_Forget_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        cb_utilities.cb_link($SG_ABORT_LAUNCH, id, $str_alt121$_Abort_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    html_utilities.html_indent(UNPROVIDED);
                                    cb_utilities.cb_link($SG_INFERENCE_BROWSER, id, $str_alt138$_Browse_Inferences_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_sg_cleanup_hypotheses(SubLObject mt, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt139$_Clean_Up_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt139$_Clean_Up_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt140$sg_cb_cleanup_hypotheses__a, cb_utilities.cb_fort_identifier(mt));
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

    public static final SubLObject sg_cb_cleanup_hypotheses(SubLObject args) {
        {
            SubLObject mt = cb_utilities.cb_guess_fort(args, UNPROVIDED);
            SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
            sg_utilities.sg_util_clean_up_hypotheses(mt);
            html_arghash.set_arghash_value($SCEN_MT, arghash, mt);
            return sg_cb_display_scenario(arghash);
        }
    }

    public static final SubLObject cb_link_sg_refresh_toggle() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt143$sg_cb_switch_auto_refresh);
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
                        if (NIL != $sg_cb_refresh_main_pageP$.getDynamicValue(thread)) {
                            html_utilities.html_princ($str_alt144$_Halt_Auto_Refresh_);
                        } else {
                            html_utilities.html_princ($str_alt145$_Auto_Refresh_);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_switch_auto_refresh(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sg_cb_refresh_main_pageP$.setDynamicValue(sublisp_null($sg_cb_refresh_main_pageP$.getDynamicValue(thread)), thread);
            return sg_cb_main(NIL);
        }
    }

    public static final SubLObject sg_halt_auto_refresh_when_all_completed() {
        {
            SubLObject any_runningP = NIL;
            if (NIL == any_runningP) {
                {
                    SubLObject csome_list_var = $sg_cb_processes$.getGlobalValue();
                    SubLObject id = NIL;
                    for (id = csome_list_var.first(); !((NIL != any_runningP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , id = csome_list_var.first()) {
                        {
                            SubLObject pw = sg_cb_process_by_id(id);
                            if (!((NIL != process_utilities.process_wrapper_process_completedP(pw)) || (NIL != process_utilities.process_wrapper_process_abortedP(pw)))) {
                                any_runningP = T;
                            }
                        }
                    }
                }
            }
            if (NIL == any_runningP) {
                $sg_cb_refresh_main_pageP$.setDynamicValue(NIL);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sg_module_browser(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt148$_Module_Browser_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt149$sg_cb_module_page);
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

    public static final SubLObject sg_cb_module_summary(SubLObject arghash, SubLObject module) {
        if (NIL == module) {
            return NIL;
        }
        {
            SubLObject value = cb_utilities.cb_fort_identifier(module);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_arghash.html_arghash_checkbox_input(arghash, $$$amodules, value, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            cb_utilities.cb_link($SG_MODULE, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject sg_cb_set_disabled_modules_in_arghash(SubLObject arghash) {
        if (NIL != html_arghash.exists_arghash_valueP($$$amodules, arghash)) {
            return arghash;
        }
        {
            SubLObject v_modules = sg_modules.sg_mod_all_active_modules();
            SubLObject mod_ids = Mapping.mapcar(CB_FORT_IDENTIFIER, v_modules);
            html_arghash.set_arghash_value_list($$$amodules, arghash, mod_ids);
            return arghash;
        }
    }

    public static final SubLObject sg_cb_module_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                if (NIL != $sg_cb_modules_loaded_at_least_onceP$.getDynamicValue(thread)) {
                    return sg_cb_module_page_int(arghash);
                } else {
                    $sg_cb_modules_loaded_at_least_onceP$.setDynamicValue(T, thread);
                    return sg_cb_reload_modules(args);
                }
            }
        }
    }

    public static final SubLObject sg_cb_module_page_int(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expansions = sg_modules.sg_module_type_modules($EXPANSION, T);
                SubLObject refinements = sg_modules.sg_module_type_modules($REFINEMENT, T);
                SubLObject meta_expansions = sg_modules.sg_module_type_modules($META_EXPANSION, T);
                arghash = sg_cb_set_disabled_modules_in_arghash(arghash);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt158$Scenario_Generation_Module_Browse);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                sg_cb_clear_all_selections_script();
                sg_cb_stylesheet_link();
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
                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
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
                                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt159$sg_cb_module_page_handler, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt158$Scenario_Generation_Module_Browse);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($str_alt27$sg_control);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_link($SCEN_GEN, $str_alt65$_Main_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        {
                                                            SubLObject frame_name_var_58 = cb_utilities.cb_frame_name($MAIN);
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            cb_parameters.cyc_cgi_url_int();
                                                            html_utilities.html_princ($str_alt160$sg_cb_reload_modules);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            if (NIL != frame_name_var_58) {
                                                                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(frame_name_var_58);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt161$_Reload_Modules_from_KB_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = sg_modules.$sg_module_types$.getGlobalValue();
                                                                    SubLObject cons = NIL;
                                                                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject datum = cons;
                                                                            SubLObject current = datum;
                                                                            SubLObject type = NIL;
                                                                            SubLObject value = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt162);
                                                                            type = current.first();
                                                                            current = current.rest();
                                                                            value = current;
                                                                            html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(sg_modules.sg_module_type_string(type));
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject exp_module = NIL;
                                                            SubLObject exp_module_63 = NIL;
                                                            SubLObject ref_module = NIL;
                                                            SubLObject ref_module_64 = NIL;
                                                            SubLObject meta_exp_module = NIL;
                                                            SubLObject meta_exp_module_65 = NIL;
                                                            for (exp_module = expansions, exp_module_63 = exp_module.first(), ref_module = refinements, ref_module_64 = ref_module.first(), meta_exp_module = meta_expansions, meta_exp_module_65 = meta_exp_module.first(); !(((NIL == meta_exp_module) && (NIL == ref_module)) && (NIL == exp_module)); exp_module = exp_module.rest() , exp_module_63 = exp_module.first() , ref_module = ref_module.rest() , ref_module_64 = ref_module.first() , meta_exp_module = meta_exp_module.rest() , meta_exp_module_65 = meta_exp_module.first()) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                sg_cb_module_summary(arghash, exp_module_63);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                sg_cb_module_summary(arghash, ref_module_64);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                sg_cb_module_summary(arghash, meta_exp_module_65);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_arghash.html_arghash_submit_input(arghash, $$$Use_Selected_Modules_Only, $REDO_DISABLED, UNPROVIDED);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                sg_cb_clear_all_selections_button($str_alt165$__amodules);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
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
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_module_page_handler(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject active_mod_ids = html_arghash.get_arghash_value_list($$$amodules, arghash);
            SubLObject active_modules = Mapping.mapcar(CB_GUESS_FORT, active_mod_ids);
            sg_modules.sg_mod_disable_all_modules();
            {
                SubLObject cdolist_list_var = active_modules;
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    sg_modules.sg_mod_enable_module(module);
                }
            }
            return sg_cb_module_page_int(arghash);
        }
    }

    public static final SubLObject sg_cb_reload_modules(SubLObject args) {
        sg_mod_reset_modules();
        return sg_cb_module_page(NIL);
    }

    public static final SubLObject sg_mod_reset_modules() {
        sg_modules.sg_mod_clear_modules();
        return sg_modules.sg_mod_import_modules(UNPROVIDED);
    }

    public static final SubLObject cb_link_sg_module(SubLObject module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mod_string = (NIL != forts.fort_p(module)) ? ((SubLObject) (cb_utilities.cb_fort_identifier(module))) : symbol_name(module);
                if (NIL == linktext) {
                    if (NIL != constant_handles.constant_p(module)) {
                        linktext = kb_paths.fort_name(module);
                    } else
                        if (mod_string.isString()) {
                            linktext = write_to_string(mod_string, EMPTY_SUBL_OBJECT_ARRAY);
                        }

                }
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt33$sg_browser);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            cb_parameters.cyc_cgi_url_int();
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt170$sg_cb_module_info_page__a, mod_string);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ(linktext);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_module_info_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(args, UNPROVIDED);
                SubLObject module = (NIL != fort) ? ((SubLObject) (fort)) : make_keyword(Strings.string_upcase(args.first(), UNPROVIDED, UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                sg_cb_stylesheet_link();
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
                                SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != forts.fort_p(module)) {
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($str_alt172$SG_Module__);
                                        cb_utilities.cb_form(module, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    }
                                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt27$sg_control);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($SCEN_GEN, $str_alt65$_Main_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_MODULE_BROWSER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($str_alt173$25_);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($$$Property);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($$$Value);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            {
                                                SubLObject remainder = NIL;
                                                for (remainder = sg_modules.sg_mod_find_module_plist(module); NIL != remainder; remainder = cddr(remainder)) {
                                                    {
                                                        SubLObject prop = remainder.first();
                                                        SubLObject value = cadr(remainder);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(prop);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != list_utilities.list_of_type_p(ASSERTION_P, value)) {
                                                                            {
                                                                                SubLObject cdolist_list_var = value;
                                                                                SubLObject as = NIL;
                                                                                for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                                                                                    cb_utilities.cb_show_assertion_readably(as, UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cb_utilities.cb_form(value, ZERO_INTEGER, T);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
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
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sg_inference_browser(SubLObject id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt178$_Browse_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt27$sg_control);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt179$sg_cb_inference_browser__a, id);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(linktext);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_inference_browser(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt125);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pw = sg_cb_process_by_id(id);
                    return sg_cb_inference_browser_page(pw);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt125);
            }
        }
        return NIL;
    }

    /**
     * This parameter controls whether or not all inferences should be displayed in the
     * SG inference browser, or just the backwards ones.
     */
    // defparameter
    public static final SubLSymbol $sg_cb_show_all_inferencesP$ = makeSymbol("*SG-CB-SHOW-ALL-INFERENCES?*");

    public static final SubLObject sg_cb_inference_browser_page(SubLObject pw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_log = process_utilities.process_wrapper_get_property(pw, $INFERENCE_LOG, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                sg_cb_stylesheet_link();
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
                                SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($str_alt183$Scenario_Generation_Inference_Bro);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt27$sg_control);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($SCEN_GEN, $str_alt65$_Main_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_MODULE_BROWSER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(UNPROVIDED);
                                            if (NIL != $sg_cb_show_all_inferencesP$.getDynamicValue(thread)) {
                                                cb_utilities.cb_link($SG_CB_INF_BROWSER_BACKWARDS_INFERENCES, pw, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                cb_utilities.cb_link($SG_CB_INF_BROWSER_ALL_INFERENCES, pw, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            html_utilities.html_indent(UNPROVIDED);
                                            cb_utilities.cb_link($SG_CB_INF_BROWSER_REFRESH_INFERENCES, pw, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    if (NIL != queues.queue_empty_p(inference_log)) {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt187$No_inferences_associated_with_thi);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } else {
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
                                            SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Inference_Object);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Mt);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Info);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Status);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_log);
                                                    SubLObject inference = NIL;
                                                    for (inference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference = cdolist_list_var.first()) {
                                                        sg_cb_inference_browser_entry(inference);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
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
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_inference_browser_entry(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                return sg_cb_inference_browser_backward_entry(inference);
            } else
                if (NIL == $sg_cb_show_all_inferencesP$.getDynamicValue(thread)) {
                    return NIL;
                } else
                    if (NIL != cb_forward_inference_browser.forward_inference_clump_p(inference)) {
                        return sg_cb_inference_browser_forward_entry(inference);
                    } else
                        if (NIL != inference_datastructures_problem_store.problem_store_p(inference)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(FOUR_INTEGER);
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
                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt192$Forward_inferences_during_refinem);
                                            cb_utilities.cb_form(inference, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else
                            if (inference.isString()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FOUR_INTEGER);
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
                                            SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(inference);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } else {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FOUR_INTEGER);
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
                                            SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_utilities.cb_form(inference, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }




            return NIL;
        }
    }

    public static final SubLObject sg_cb_inference_browser_backward_entry(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_link($INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_link($SG_BROWSER_CONTEXT, inference_datastructures_inference.inference_input_mt(inference), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_form(inference_datastructures_inference.inference_el_query(inference), NIL, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ(inference_datastructures_inference.inference_suspend_status(inference));
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $sg_abnormal_inference_abort_timeout$ = makeSymbol("*SG-ABNORMAL-INFERENCE-ABORT-TIMEOUT*");

    public static final SubLObject sg_cb_inference_browser_forward_entry(SubLObject clump) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_answer_count = cb_forward_inference_browser.forward_inference_clump_total_answer_count(clump);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_link($SG_FORWARD_INFERENCE, clump, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                if (NIL == subl_promotions.positive_integer_p(total_answer_count)) {
                                    html_utilities.html_princ($str_alt195$No_answers_);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(THREE_INTEGER);
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
                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                sg_cb_display_forward_inference_module(clump);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(total_answer_count)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FOUR_INTEGER);
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
                                SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject inference_infos = cb_forward_inference_browser.forward_inference_clump_inference_infos(clump);
                                        SubLObject processed_asents = NIL;
                                        SubLObject abnormal_asents = NIL;
                                        SubLObject timed_out_asents = NIL;
                                        SubLObject concluded_asents = NIL;
                                        {
                                            SubLObject cdolist_list_var = inference_infos;
                                            SubLObject inference_info = NIL;
                                            for (inference_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject rule = cb_forward_inference_browser.forward_inference_info_rule(inference_info);
                                                    SubLObject inference = cb_forward_inference_browser.forward_inference_info_inference(inference_info);
                                                    SubLObject inference_mt = inference_datastructures_inference.inference_mt(inference);
                                                    SubLObject more_info = cb_forward_inference_browser.forward_inference_info_more_info(inference_info);
                                                    SubLObject trigger_bindings = getf(more_info, $TRIGGER_BINDINGS, UNPROVIDED);
                                                    SubLObject forward_results = getf(more_info, $FORWARD_RESULTS, UNPROVIDED);
                                                    SubLObject target_asent = getf(more_info, $TARGET_ASENT, UNPROVIDED);
                                                    SubLObject cdolist_list_var_99 = forward_results;
                                                    SubLObject forward_result = NIL;
                                                    for (forward_result = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , forward_result = cdolist_list_var_99.first()) {
                                                        {
                                                            SubLObject datum = forward_result;
                                                            SubLObject current = datum;
                                                            SubLObject inference_bindings = NIL;
                                                            SubLObject inference_supports = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt199);
                                                            inference_bindings = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt199);
                                                            inference_supports = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject asent = bindings.apply_bindings(inference_bindings, target_asent);
                                                                    if (NIL == subl_promotions.memberP(asent, processed_asents, symbol_function(EQUAL), UNPROVIDED)) {
                                                                        processed_asents = cons(asent, processed_asents);
                                                                        {
                                                                            SubLObject duration = NIL;
                                                                            SubLObject abnormalP = NIL;
                                                                            SubLObject timed_outP = NIL;
                                                                            SubLObject time_var = get_internal_real_time();
                                                                            {
                                                                                SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                                                                try {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_100 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                                                                        try {
                                                                                            subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                                                            {
                                                                                                SubLObject timer = NIL;
                                                                                                try {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_101 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                        try {
                                                                                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                            timer = subl_macro_promotions.with_timeout_start_timer($sg_abnormal_inference_abort_timeout$.getGlobalValue(), tag);
                                                                                                            abnormalP = abnormal.forward_bindings_abnormalP(inference_mt, rule, trigger_bindings, inference_bindings);
                                                                                                        } finally {
                                                                                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_101, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_102, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_100, thread);
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable ccatch_env_var) {
                                                                                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                                }
                                                                            }
                                                                            duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                            if (NIL != timed_outP) {
                                                                                timed_out_asents = cons(make_conclusion_spec(asent, inference_mt, duration), timed_out_asents);
                                                                            } else
                                                                                if (NIL != abnormalP) {
                                                                                    abnormal_asents = cons(make_conclusion_spec(asent, inference_mt, duration), abnormal_asents);
                                                                                } else {
                                                                                    concluded_asents = cons(make_conclusion_spec(asent, inference_mt, duration), concluded_asents);
                                                                                }

                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt199);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject dhtml_object_id = format(NIL, $str_alt200$sg_clump__A, cb_forward_inference_browser.forward_inference_clump_id(clump));
                                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_utilities.html_indent(ZERO_INTEGER);
                                            dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str_alt56$);
                                            {
                                                SubLObject total_unique_answer_count = add(length(timed_out_asents), length(abnormal_asents), length(concluded_asents));
                                                html_utilities.html_princ($str_alt201$Results__);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                if ((NIL != timed_out_asents) || (NIL != abnormal_asents)) {
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
                                                            SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(total_unique_answer_count);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                } else {
                                                    html_utilities.html_princ(total_unique_answer_count);
                                                }
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_princ($str_alt202$_unique_out_of_);
                                                html_utilities.html_princ(total_answer_count);
                                                html_utilities.html_princ($str_alt203$_total_answers_);
                                            }
                                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                            if (NIL != dhtml_object_id) {
                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dhtml_object_id);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = concluded_asents;
                                                        SubLObject concluded_asent = NIL;
                                                        for (concluded_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concluded_asent = cdolist_list_var.first()) {
                                                            html_print_conclusion_spec(concluded_asent, UNPROVIDED);
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = abnormal_asents;
                                                        SubLObject abnormal_asent = NIL;
                                                        for (abnormal_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , abnormal_asent = cdolist_list_var.first()) {
                                                            html_print_conclusion_spec(abnormal_asent, $str_alt204$Abnormal__);
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = timed_out_asents;
                                                        SubLObject timed_out_asent = NIL;
                                                        for (timed_out_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , timed_out_asent = cdolist_list_var.first()) {
                                                            html_print_conclusion_spec(timed_out_asent, $str_alt205$Abnormal_check_timed_out__);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject make_conclusion_spec(SubLObject asent, SubLObject mt, SubLObject duration) {
        return list(asent, mt, duration);
    }

    public static final SubLObject html_print_conclusion_spec(SubLObject asent_duration_pair, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = asent_duration_pair.first();
                SubLObject mt = second(asent_duration_pair);
                SubLObject duration = third(asent_duration_pair);
                SubLObject objects = NIL;
                if (NIL != mt) {
                    objects = czer_meta.find_visible_assertions_cycl(asent, mt);
                }
                if (NIL == objects) {
                    objects = list(asent);
                }
                html_utilities.html_princ(duration);
                html_utilities.html_princ($str_alt206$s__);
                if (NIL != message) {
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
                                html_utilities.html_princ(message);
                                html_utilities.html_newline(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                }
                {
                    SubLObject cdolist_list_var = objects;
                    SubLObject v_object = NIL;
                    for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                        cb_utilities.cb_form(v_object, NIL, T);
                        html_utilities.html_indent(UNPROVIDED);
                        cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_cb_display_forward_inference_module(SubLObject clump) {
        {
            SubLObject assertion = cb_forward_inference_browser.forward_inference_clump_triggering_assertion(clump);
            cb_utilities.cb_show_assertion_readably(assertion, T, NIL);
        }
        return NIL;
    }

    public static final SubLObject sg_cb_forward_inference_browser(SubLObject args) {
        {
            SubLObject id_string = args.first();
            SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject clump = cb_forward_inference_browser.cb_forward_inference_clump_lookup_by_id(id);
            return cb_forward_inference_browser.cb_forward_inference_browser_int(clump, $str_alt207$Scenario_Generation_Forward_Infer);
        }
    }

    public static final SubLObject cb_link_sg_forward_inference(SubLObject clump, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Forward_Inference_Clump;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt210$sg_cb_forward_inference_browser__, cb_forward_inference_browser.forward_inference_clump_id(clump));
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

    public static final SubLObject cb_link_sg_cb_inf_browser_refresh_inferences(SubLObject pw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = process_utilities.process_wrapper_get_id(pw);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt179$sg_cb_inference_browser__a, id);
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
                        html_utilities.html_princ($str_alt212$_Refresh_Inferences_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sg_cb_inf_browser_all_inferences(SubLObject pw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = process_utilities.process_wrapper_get_id(pw);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt214$sg_cb_show_all_inferences__a, id);
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
                        html_utilities.html_princ($str_alt215$_Show_All_Inferences_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sg_cb_inf_browser_backwards_inferences(SubLObject pw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = process_utilities.process_wrapper_get_id(pw);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt217$sg_cb_show_backwards_inferences__, id);
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
                        html_utilities.html_princ($str_alt218$_Show_Expansions_Only_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject sg_cb_show_all_inferences(SubLObject args) {
        {
            SubLObject pw = sg_cb_get_process_from_args(args);
            $sg_cb_show_all_inferencesP$.setDynamicValue(T);
            return sg_cb_inference_browser_page(pw);
        }
    }

    public static final SubLObject sg_cb_show_backwards_inferences(SubLObject args) {
        {
            SubLObject pw = sg_cb_get_process_from_args(args);
            $sg_cb_show_all_inferencesP$.setDynamicValue(NIL);
            return sg_cb_inference_browser_page(pw);
        }
    }

    // deflexical
    private static final SubLSymbol $sg_cb_select_all_label$ = makeSymbol("*SG-CB-SELECT-ALL-LABEL*");

    // deflexical
    private static final SubLSymbol $sg_cb_unselect_all_label$ = makeSymbol("*SG-CB-UNSELECT-ALL-LABEL*");

    // defparameter
    private static final SubLSymbol $sg_cb_check_all_button_script$ = makeSymbol("*SG-CB-CHECK-ALL-BUTTON-SCRIPT*");

    // defparameter
    private static final SubLSymbol $sg_cb_check_all_script$ = makeSymbol("*SG-CB-CHECK-ALL-SCRIPT*");

    public static final SubLObject sg_cb_clear_all_selections_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $sg_cb_check_all_script$.getDynamicValue(thread), $sg_cb_select_all_label$.getGlobalValue(), $sg_cb_unselect_all_label$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject sg_cb_clear_all_selections_button(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(NIL, thread);
                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != $sg_cb_select_all_label$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_princ($sg_cb_select_all_label$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_indent(ONE_INTEGER);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $sg_cb_check_all_button_script$.getDynamicValue(thread), id);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_sg_browser_file() {
        declareFunction("cb_link_scen_gen", "CB-LINK-SCEN-GEN", 0, 1, false);
        declareFunction("sg_cb_process_by_id", "SG-CB-PROCESS-BY-ID", 1, 0, false);
        declareFunction("sg_cb_process_by_id_string", "SG-CB-PROCESS-BY-ID-STRING", 1, 0, false);
        declareFunction("sg_cb_get_process_from_args", "SG-CB-GET-PROCESS-FROM-ARGS", 1, 0, false);
        declareMacro("sg_css_sg_control_style", "SG-CSS-SG-CONTROL-STYLE");
        declareMacro("sg_css_sg_browser_style", "SG-CSS-SG-BROWSER-STYLE");
        declareMacro("sg_browser_style_span", "SG-BROWSER-STYLE-SPAN");
        declareMacro("sg_control_style_span", "SG-CONTROL-STYLE-SPAN");
        declareFunction("sg_cb_stylesheet_link", "SG-CB-STYLESHEET-LINK", 0, 0, false);
        declareFunction("sg_cb_update_test_cases", "SG-CB-UPDATE-TEST-CASES", 0, 0, false);
        declareFunction("sg_cb_main", "SG-CB-MAIN", 1, 0, false);
        declareFunction("cb_link_sg_browser_context", "CB-LINK-SG-BROWSER-CONTEXT", 1, 1, false);
        declareFunction("sg_cb_refresh_use_cases", "SG-CB-REFRESH-USE-CASES", 1, 0, false);
        declareFunction("sg_situation_formula", "SG-SITUATION-FORMULA", 1, 0, false);
        declareFunction("sg_cb_select_test_case", "SG-CB-SELECT-TEST-CASE", 1, 0, false);
        declareFunction("sg_cb_browser_context", "SG-CB-BROWSER-CONTEXT", 1, 0, false);
        declareFunction("sg_cb_display_scenario_mt", "SG-CB-DISPLAY-SCENARIO-MT", 1, 0, false);
        declareFunction("sg_cb_display_scenario_mt_data", "SG-CB-DISPLAY-SCENARIO-MT-DATA", 1, 0, false);
        declareFunction("sg_cb_display_genl_scenarios", "SG-CB-DISPLAY-GENL-SCENARIOS", 1, 0, false);
        declareFunction("sg_cb_display_spec_scenarios", "SG-CB-DISPLAY-SPEC-SCENARIOS", 1, 0, false);
        declareFunction("sg_cb_display_gaf", "SG-CB-DISPLAY-GAF", 1, 0, false);
        declareFunction("sg_cb_display_gaf_slot", "SG-CB-DISPLAY-GAF-SLOT", 1, 0, false);
        declareFunction("sg_cb_display_scenario_assertions", "SG-CB-DISPLAY-SCENARIO-ASSERTIONS", 1, 0, false);
        declareFunction("sg_cb_display_local_assertions", "SG-CB-DISPLAY-LOCAL-ASSERTIONS", 1, 1, false);
        declareFunction("sg_cb_display_inherited_assertions", "SG-CB-DISPLAY-INHERITED-ASSERTIONS", 1, 1, false);
        declareFunction("sg_cb_display_scenario_module_info", "SG-CB-DISPLAY-SCENARIO-MODULE-INFO", 1, 0, false);
        declareFunction("sg_cb_display_scenario", "SG-CB-DISPLAY-SCENARIO", 1, 0, false);
        declareFunction("sg_cb_show_new_kb_state", "SG-CB-SHOW-NEW-KB-STATE", 1, 0, false);
        declareFunction("cb_link_sg_clear_new_kb_state", "CB-LINK-SG-CLEAR-NEW-KB-STATE", 0, 1, false);
        declareFunction("sg_cb_clear_new_kb_state", "SG-CB-CLEAR-NEW-KB-STATE", 1, 0, false);
        declareFunction("sg_cb_launch_func", "SG-CB-LAUNCH-FUNC", 2, 0, false);
        declareFunction("sg_cb_launch_scen_gen", "SG-CB-LAUNCH-SCEN-GEN", 1, 0, false);
        declareFunction("sg_cb_launch_options", "SG-CB-LAUNCH-OPTIONS", 1, 0, false);
        declareFunction("cb_link_sg_launch", "CB-LINK-SG-LAUNCH", 0, 2, false);
        declareFunction("sg_cb_launcher_page", "SG-CB-LAUNCHER-PAGE", 1, 0, false);
        declareFunction("sg_cb_launch_page_handler", "SG-CB-LAUNCH-PAGE-HANDLER", 1, 0, false);
        declareFunction("cb_link_sg_abort_launch", "CB-LINK-SG-ABORT-LAUNCH", 1, 1, false);
        declareFunction("sg_cb_abort_launch", "SG-CB-ABORT-LAUNCH", 1, 0, false);
        declareFunction("cb_link_sg_forget", "CB-LINK-SG-FORGET", 1, 1, false);
        declareFunction("sg_cb_forget", "SG-CB-FORGET", 1, 0, false);
        declareFunction("sg_cb_destroy_inference_log", "SG-CB-DESTROY-INFERENCE-LOG", 1, 0, false);
        declareFunction("sg_cb_get_pw_state_string", "SG-CB-GET-PW-STATE-STRING", 1, 0, false);
        declareFunction("sg_cb_display_processes", "SG-CB-DISPLAY-PROCESSES", 0, 0, false);
        declareFunction("sg_cb_display_pw_table_row", "SG-CB-DISPLAY-PW-TABLE-ROW", 1, 0, false);
        declareFunction("cb_link_sg_cleanup_hypotheses", "CB-LINK-SG-CLEANUP-HYPOTHESES", 1, 1, false);
        declareFunction("sg_cb_cleanup_hypotheses", "SG-CB-CLEANUP-HYPOTHESES", 1, 0, false);
        declareFunction("cb_link_sg_refresh_toggle", "CB-LINK-SG-REFRESH-TOGGLE", 0, 0, false);
        declareFunction("sg_cb_switch_auto_refresh", "SG-CB-SWITCH-AUTO-REFRESH", 1, 0, false);
        declareFunction("sg_halt_auto_refresh_when_all_completed", "SG-HALT-AUTO-REFRESH-WHEN-ALL-COMPLETED", 0, 0, false);
        declareFunction("cb_link_sg_module_browser", "CB-LINK-SG-MODULE-BROWSER", 0, 1, false);
        declareFunction("sg_cb_module_summary", "SG-CB-MODULE-SUMMARY", 2, 0, false);
        declareFunction("sg_cb_set_disabled_modules_in_arghash", "SG-CB-SET-DISABLED-MODULES-IN-ARGHASH", 1, 0, false);
        declareFunction("sg_cb_module_page", "SG-CB-MODULE-PAGE", 1, 0, false);
        declareFunction("sg_cb_module_page_int", "SG-CB-MODULE-PAGE-INT", 1, 0, false);
        declareFunction("sg_cb_module_page_handler", "SG-CB-MODULE-PAGE-HANDLER", 1, 0, false);
        declareFunction("sg_cb_reload_modules", "SG-CB-RELOAD-MODULES", 1, 0, false);
        declareFunction("sg_mod_reset_modules", "SG-MOD-RESET-MODULES", 0, 0, false);
        declareFunction("cb_link_sg_module", "CB-LINK-SG-MODULE", 1, 1, false);
        declareFunction("sg_cb_module_info_page", "SG-CB-MODULE-INFO-PAGE", 1, 0, false);
        declareFunction("cb_link_sg_inference_browser", "CB-LINK-SG-INFERENCE-BROWSER", 1, 1, false);
        declareFunction("sg_cb_inference_browser", "SG-CB-INFERENCE-BROWSER", 1, 0, false);
        declareFunction("sg_cb_inference_browser_page", "SG-CB-INFERENCE-BROWSER-PAGE", 1, 0, false);
        declareFunction("sg_cb_inference_browser_entry", "SG-CB-INFERENCE-BROWSER-ENTRY", 1, 0, false);
        declareFunction("sg_cb_inference_browser_backward_entry", "SG-CB-INFERENCE-BROWSER-BACKWARD-ENTRY", 1, 0, false);
        declareFunction("sg_cb_inference_browser_forward_entry", "SG-CB-INFERENCE-BROWSER-FORWARD-ENTRY", 1, 0, false);
        declareFunction("make_conclusion_spec", "MAKE-CONCLUSION-SPEC", 3, 0, false);
        declareFunction("html_print_conclusion_spec", "HTML-PRINT-CONCLUSION-SPEC", 1, 1, false);
        declareFunction("sg_cb_display_forward_inference_module", "SG-CB-DISPLAY-FORWARD-INFERENCE-MODULE", 1, 0, false);
        declareFunction("sg_cb_forward_inference_browser", "SG-CB-FORWARD-INFERENCE-BROWSER", 1, 0, false);
        declareFunction("cb_link_sg_forward_inference", "CB-LINK-SG-FORWARD-INFERENCE", 1, 1, false);
        declareFunction("cb_link_sg_cb_inf_browser_refresh_inferences", "CB-LINK-SG-CB-INF-BROWSER-REFRESH-INFERENCES", 1, 0, false);
        declareFunction("cb_link_sg_cb_inf_browser_all_inferences", "CB-LINK-SG-CB-INF-BROWSER-ALL-INFERENCES", 1, 0, false);
        declareFunction("cb_link_sg_cb_inf_browser_backwards_inferences", "CB-LINK-SG-CB-INF-BROWSER-BACKWARDS-INFERENCES", 1, 0, false);
        declareFunction("sg_cb_show_all_inferences", "SG-CB-SHOW-ALL-INFERENCES", 1, 0, false);
        declareFunction("sg_cb_show_backwards_inferences", "SG-CB-SHOW-BACKWARDS-INFERENCES", 1, 0, false);
        declareFunction("sg_cb_clear_all_selections_script", "SG-CB-CLEAR-ALL-SELECTIONS-SCRIPT", 0, 0, false);
        declareFunction("sg_cb_clear_all_selections_button", "SG-CB-CLEAR-ALL-SELECTIONS-BUTTON", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_browser_file() {
        deflexical("*SG-CB-TEST-CASES*", NIL);
        deflexical("*SG-CB-USE-CASE-SITUATIONS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*SG-CB-PROCESS-ID-MAPPING*", NIL != boundp($sg_cb_process_id_mapping$) ? ((SubLObject) ($sg_cb_process_id_mapping$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*SG-CB-PROCESSES*", NIL != boundp($sg_cb_processes$) ? ((SubLObject) ($sg_cb_processes$.getGlobalValue())) : NIL);
        defparameter("*SG-SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
        defparameter("*SG-CB-REFRESH-MAIN-PAGE?*", NIL);
        defparameter("*SG-CB-MODULES-LOADED-AT-LEAST-ONCE?*", NIL);
        defparameter("*SG-CB-SHOW-SUB-CONTEXT-COUNTS*", T);
        deflexical("*SG-CB-SCEN-GEN-PROCESS-LABEL*", $$$Scenario_Generation);
        defparameter("*SG-CB-SHOW-ALL-INFERENCES?*", NIL);
        deflexical("*SG-ABNORMAL-INFERENCE-ABORT-TIMEOUT*", FIVE_INTEGER);
        deflexical("*SG-CB-SELECT-ALL-LABEL*", $$$Select_All);
        deflexical("*SG-CB-UNSELECT-ALL-LABEL*", $$$Unselect_All);
        defparameter("*SG-CB-CHECK-ALL-BUTTON-SCRIPT*", $str_alt224$onClick__this_value_sg_toggle_all);
        defparameter("*SG-CB-CHECK-ALL-SCRIPT*", $str_alt225$__var_checkflag___false__var_sele);
        return NIL;
    }

    public static final SubLObject setup_sg_browser_file() {
                cb_utilities.setup_cb_link_method($SCEN_GEN, CB_LINK_SCEN_GEN, ONE_INTEGER);
        cb_utilities.declare_cb_tool($SCEN_GEN, $$$Scenario_Generation_Tool, $$$ScenGen, $str_alt7$Generate_Abductive_Scenarios_for_);
        subl_macro_promotions.declare_defglobal($sg_cb_process_id_mapping$);
        subl_macro_promotions.declare_defglobal($sg_cb_processes$);
        utilities_macros.register_html_state_variable($sym10$_SG_CB_REFRESH_MAIN_PAGE__);
        utilities_macros.register_html_state_variable($sym11$_SG_CB_MODULES_LOADED_AT_LEAST_ONCE__);
        utilities_macros.register_html_state_variable($sg_cb_show_sub_context_counts$);
        sethash($SG_CB_MAIN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt23$sg_cb_main_html, NIL));
        html_macros.note_html_handler_function(SG_CB_MAIN);
        cb_utilities.setup_cb_link_method($SG_BROWSER_CONTEXT, CB_LINK_SG_BROWSER_CONTEXT, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_REFRESH_USE_CASES);
        html_macros.note_html_handler_function(SG_CB_SELECT_TEST_CASE);
        html_macros.note_html_handler_function(SG_CB_BROWSER_CONTEXT);
        cb_utilities.setup_cb_link_method($SG_CLEAR_NEW_KB_STATE, CB_LINK_SG_CLEAR_NEW_KB_STATE, ONE_INTEGER);
        html_macros.note_html_handler_function(SG_CB_CLEAR_NEW_KB_STATE);
        cb_utilities.setup_cb_link_method($SG_LAUNCH, CB_LINK_SG_LAUNCH, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_LAUNCHER_PAGE);
        html_macros.note_html_handler_function(SG_CB_LAUNCH_PAGE_HANDLER);
        cb_utilities.setup_cb_link_method($SG_ABORT_LAUNCH, CB_LINK_SG_ABORT_LAUNCH, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_ABORT_LAUNCH);
        cb_utilities.setup_cb_link_method($SG_FORGET, CB_LINK_SG_FORGET, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_FORGET);
        cb_utilities.setup_cb_link_method($SG_CLEANUP_HYPOTHESES, CB_LINK_SG_CLEANUP_HYPOTHESES, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_CLEANUP_HYPOTHESES);
        cb_utilities.setup_cb_link_method($SG_REFRESH_TOGGLE, CB_LINK_SG_REFRESH_TOGGLE, ZERO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_SWITCH_AUTO_REFRESH);
        cb_utilities.setup_cb_link_method($SG_MODULE_BROWSER, CB_LINK_SG_MODULE_BROWSER, ONE_INTEGER);
        html_macros.note_html_handler_function(SG_CB_MODULE_PAGE);
        html_macros.note_html_handler_function(SG_CB_MODULE_PAGE_INT);
        html_macros.note_html_handler_function(SG_CB_MODULE_PAGE_HANDLER);
        html_macros.note_html_handler_function(SG_CB_RELOAD_MODULES);
        cb_utilities.setup_cb_link_method($SG_MODULE, CB_LINK_SG_MODULE, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_MODULE_INFO_PAGE);
        cb_utilities.setup_cb_link_method($SG_INFERENCE_BROWSER, CB_LINK_SG_INFERENCE_BROWSER, TWO_INTEGER);
        html_macros.note_html_handler_function(SG_CB_INFERENCE_BROWSER);
        utilities_macros.register_html_state_variable($sym182$_SG_CB_SHOW_ALL_INFERENCES__);
        html_macros.note_html_handler_function(SG_CB_FORWARD_INFERENCE_BROWSER);
        cb_utilities.setup_cb_link_method($SG_FORWARD_INFERENCE, CB_LINK_SG_FORWARD_INFERENCE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($SG_CB_INF_BROWSER_REFRESH_INFERENCES, CB_LINK_SG_CB_INF_BROWSER_REFRESH_INFERENCES, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($SG_CB_INF_BROWSER_ALL_INFERENCES, CB_LINK_SG_CB_INF_BROWSER_ALL_INFERENCES, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($SG_CB_INF_BROWSER_BACKWARDS_INFERENCES, CB_LINK_SG_CB_INF_BROWSER_BACKWARDS_INFERENCES, ONE_INTEGER);
        html_macros.note_html_handler_function(SG_CB_SHOW_ALL_INFERENCES);
        html_macros.note_html_handler_function(SG_CB_SHOW_BACKWARDS_INFERENCES);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_ScenGen_ = makeString("[ScenGen]");



    static private final SubLString $str_alt2$sg_cb_main = makeString("sg-cb-main");

    private static final SubLSymbol $SCEN_GEN = makeKeyword("SCEN-GEN");

    private static final SubLSymbol CB_LINK_SCEN_GEN = makeSymbol("CB-LINK-SCEN-GEN");

    static private final SubLString $$$Scenario_Generation_Tool = makeString("Scenario Generation Tool");

    static private final SubLString $$$ScenGen = makeString("ScenGen");

    static private final SubLString $str_alt7$Generate_Abductive_Scenarios_for_ = makeString("Generate Abductive Scenarios for Situations");

    public static final SubLSymbol $sg_cb_process_id_mapping$ = makeSymbol("*SG-CB-PROCESS-ID-MAPPING*");

    public static final SubLSymbol $sg_cb_processes$ = makeSymbol("*SG-CB-PROCESSES*");

    static private final SubLSymbol $sym10$_SG_CB_REFRESH_MAIN_PAGE__ = makeSymbol("*SG-CB-REFRESH-MAIN-PAGE?*");

    static private final SubLSymbol $sym11$_SG_CB_MODULES_LOADED_AT_LEAST_ONCE__ = makeSymbol("*SG-CB-MODULES-LOADED-AT-LEAST-ONCE?*");

    public static final SubLSymbol $sg_cb_show_sub_context_counts$ = makeSymbol("*SG-CB-SHOW-SUB-CONTEXT-COUNTS*");

    private static final SubLSymbol HTML_FANCY_DIV = makeSymbol("HTML-FANCY-DIV");

    static private final SubLList $list_alt14 = list(makeKeyword("CLASS"), makeString("sg-control"));

    static private final SubLList $list_alt15 = list(makeKeyword("CLASS"), makeString("sg-browser"));

    private static final SubLSymbol HTML_FANCY_SPAN = makeSymbol("HTML-FANCY-SPAN");

    static private final SubLString $str_alt17$_javascript_sg_browser_css = makeString("/javascript/sg-browser.css");



    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLSymbol $sym20$STRING_ = makeSymbol("STRING<");



    private static final SubLSymbol $SG_CB_MAIN = makeKeyword("SG-CB-MAIN");

    static private final SubLString $str_alt23$sg_cb_main_html = makeString("sg-cb-main.html");

    static private final SubLString $$$Scenario_Generator = makeString("Scenario Generator");

    static private final SubLString $$$Refresh = makeString("Refresh");

    static private final SubLString $str_alt26$5__URL_cg_sg_cb_main = makeString("5; URL=cg?sg-cb-main");

    static private final SubLString $str_alt27$sg_control = makeString("sg-control");

    static private final SubLString $str_alt28$sg_cb_refresh_use_cases = makeString("sg-cb-refresh-use-cases");

    static private final SubLString $str_alt29$_Reload_Use_Cases_ = makeString("[Reload Use Cases]");

    private static final SubLSymbol $SG_MODULE_BROWSER = makeKeyword("SG-MODULE-BROWSER");

    private static final SubLSymbol SG_CB_MAIN = makeSymbol("SG-CB-MAIN");

    static private final SubLString $str_alt32$sg_cb_browser_context = makeString("sg-cb-browser-context");

    static private final SubLString $str_alt33$sg_browser = makeString("sg-browser");



    static private final SubLString $str_alt35$_a__a = makeString("~a&~a");

    static private final SubLString $str_alt36$_a = makeString("~a");

    private static final SubLSymbol $SG_BROWSER_CONTEXT = makeKeyword("SG-BROWSER-CONTEXT");

    private static final SubLSymbol CB_LINK_SG_BROWSER_CONTEXT = makeSymbol("CB-LINK-SG-BROWSER-CONTEXT");

    private static final SubLSymbol SG_CB_REFRESH_USE_CASES = makeSymbol("SG-CB-REFRESH-USE-CASES");

    static private final SubLString $str_alt40$Select_a_test_case__ = makeString("Select a test case: ");



    private static final SubLSymbol $SG_LAUNCH = makeKeyword("SG-LAUNCH");

    static private final SubLString $str_alt43$_Generate_ = makeString("[Generate]");



    private static final SubLSymbol SG_CB_SELECT_TEST_CASE = makeSymbol("SG-CB-SELECT-TEST-CASE");

    private static final SubLSymbol $SCEN_MT = makeKeyword("SCEN-MT");

    private static final SubLSymbol SG_CB_BROWSER_CONTEXT = makeSymbol("SG-CB-BROWSER-CONTEXT");

    static private final SubLString $str_alt48$__a_ = makeString("[~a]");

    static private final SubLString $str_alt49$_ = makeString(":");

    static private final SubLString $str_alt50$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym51$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLString $str_alt52$___ = makeString(" : ");



    static private final SubLString $str_alt54$Local_Assertions_ = makeString("Local Assertions:");

    static private final SubLString $str_alt55$inherited_facts = makeString("inherited-facts");

    static private final SubLString $str_alt56$ = makeString("");

    static private final SubLString $str_alt57$_Show_Inherited_ = makeString("[Show Inherited]");

    static private final SubLString $str_alt58$_Hide_Inherited_ = makeString("[Hide Inherited]");





    static private final SubLString $str_alt61$Inherited_Assertions_ = makeString("Inherited Assertions:");

    public static final SubLObject $$scenarioGeneratedByExpansion = constant_handles.reader_make_constant_shell(makeString("scenarioGeneratedByExpansion"));

    static private final SubLString $str_alt63$Expansion__ = makeString("Expansion: ");

    static private final SubLString $str_alt64$Examining_Scenario__ = makeString("Examining Scenario: ");

    static private final SubLString $str_alt65$_Main_ = makeString("[Main]");

    private static final SubLSymbol $SG_CLEANUP_HYPOTHESES = makeKeyword("SG-CLEANUP-HYPOTHESES");

    static private final SubLString $str_alt67$_Modules_ = makeString("[Modules]");

    public static final SubLObject $$ScenarioContext = constant_handles.reader_make_constant_shell(makeString("ScenarioContext"));

    static private final SubLString $str_alt69$Relations_ = makeString("Relations:");

    private static final SubLSymbol $SG_CLEAR_NEW_KB_STATE = makeKeyword("SG-CLEAR-NEW-KB-STATE");

    static private final SubLString $str_alt71$_Clear_New_KB_State_ = makeString("[Clear New KB State]");

    static private final SubLString $str_alt72$sg_cb_clear_new_kb_state = makeString("sg-cb-clear-new-kb-state");



    static private final SubLString $str_alt74$WARNING__This_will_change_your_KB = makeString("WARNING: This will change your KB to a fresh KB ~A and remove everything counted above!!!");

    private static final SubLSymbol CB_LINK_SG_CLEAR_NEW_KB_STATE = makeSymbol("CB-LINK-SG-CLEAR-NEW-KB-STATE");

    private static final SubLSymbol SG_CB_CLEAR_NEW_KB_STATE = makeSymbol("SG-CB-CLEAR-NEW-KB-STATE");

    static private final SubLString $$$Scenario_Generation = makeString("Scenario Generation");

    private static final SubLSymbol $SG_MT = makeKeyword("SG-MT");

    private static final SubLSymbol $SG_TIME_LIMIT_P = makeKeyword("SG-TIME-LIMIT-P");

    private static final SubLSymbol $SG_TIME_LIMIT = makeKeyword("SG-TIME-LIMIT");

    private static final SubLSymbol $SG_SEARCH_TYPE = makeKeyword("SG-SEARCH-TYPE");

    private static final SubLSymbol $SG_INITIAL_REFINEMENT = makeKeyword("SG-INITIAL-REFINEMENT");

    private static final SubLSymbol $SG_REFINEMENT_CUTOFF = makeKeyword("SG-REFINEMENT-CUTOFF");

    private static final SubLSymbol $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER = makeKeyword("SG-REFINEMENT-CUTOFF-ITERATIONS-NUMBER");

    private static final SubLSymbol $PROCESS_WRAPPER = makeKeyword("PROCESS-WRAPPER");





    private static final SubLSymbol $NO_LIMIT = makeKeyword("NO-LIMIT");



    private static final SubLSymbol SG_CB_LAUNCH_FUNC = makeSymbol("SG-CB-LAUNCH-FUNC");

    private static final SubLSymbol $INFERENCE_LOG = makeKeyword("INFERENCE-LOG");



    public static final SubLInteger $int$360 = makeInteger(360);





    static private final SubLString $str_alt96$Perform_initial_refinement_in_See = makeString("Perform initial refinement in Seed Mt");

    static private final SubLString $str_alt97$Time_Cutoff_ = makeString("Time Cutoff:");

    static private final SubLString $$$Run_forever = makeString("Run forever");

    static private final SubLString $str_alt99$_seconds = makeString(" seconds");

    static private final SubLString $str_alt100$Search_Type_ = makeString("Search Type:");

    static private final SubLString $$$Breadth_First = makeString("Breadth First");

    private static final SubLSymbol $BEST_FIRST = makeKeyword("BEST-FIRST");

    static private final SubLString $str_alt103$Best_First__Experimental_ = makeString("Best First (Experimental)");

    static private final SubLString $str_alt104$Refinement_Cutoff_ = makeString("Refinement Cutoff:");

    static private final SubLString $$$Quiescence = makeString("Quiescence");



    static private final SubLString $$$iterations = makeString("iterations");

    static private final SubLString $str_alt108$sg_cb_launcher_page__a = makeString("sg-cb-launcher-page&~a");

    static private final SubLString $str_alt109$sg_cb_launcher_page = makeString("sg-cb-launcher-page");

    private static final SubLSymbol CB_LINK_SG_LAUNCH = makeSymbol("CB-LINK-SG-LAUNCH");

    static private final SubLList $list_alt111 = list(makeSymbol("ID"));

    static private final SubLString $$$Launch_New_Scenario_Generation = makeString("Launch New Scenario Generation");

    static private final SubLString $str_alt113$sg_cb_launch_page_handler = makeString("sg-cb-launch-page-handler");

    static private final SubLString $str_alt114$Enter_Starting_Scenario_ = makeString("Enter Starting Scenario:");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$Complete = makeString("Complete");

    static private final SubLString $$$Generate = makeString("Generate");

    private static final SubLSymbol $SG_LAUNCH_SCEN_GEN = makeKeyword("SG-LAUNCH-SCEN-GEN");

    private static final SubLSymbol SG_CB_LAUNCHER_PAGE = makeSymbol("SG-CB-LAUNCHER-PAGE");

    private static final SubLSymbol SG_CB_LAUNCH_PAGE_HANDLER = makeSymbol("SG-CB-LAUNCH-PAGE-HANDLER");

    static private final SubLString $str_alt121$_Abort_ = makeString("[Abort]");

    static private final SubLString $str_alt122$sg_cb_abort_launch__a = makeString("sg-cb-abort-launch&~a");

    private static final SubLSymbol $SG_ABORT_LAUNCH = makeKeyword("SG-ABORT-LAUNCH");

    private static final SubLSymbol CB_LINK_SG_ABORT_LAUNCH = makeSymbol("CB-LINK-SG-ABORT-LAUNCH");

    static private final SubLList $list_alt125 = list(makeSymbol("ID-STRING"));

    private static final SubLSymbol SG_CB_ABORT_LAUNCH = makeSymbol("SG-CB-ABORT-LAUNCH");

    static private final SubLString $str_alt127$_Forget_ = makeString("[Forget]");

    static private final SubLString $str_alt128$sg_cb_forget__a = makeString("sg-cb-forget&~a");

    private static final SubLSymbol $SG_FORGET = makeKeyword("SG-FORGET");

    private static final SubLSymbol CB_LINK_SG_FORGET = makeSymbol("CB-LINK-SG-FORGET");

    static private final SubLSymbol $sym131$_ = makeSymbol("=");

    private static final SubLSymbol SG_CB_FORGET = makeSymbol("SG-CB-FORGET");

    static private final SubLString $$$No_running_processes_at_this_time = makeString("No running processes at this time");

    static private final SubLString $str_alt134$Scenario_Generation_Processes_ = makeString("Scenario Generation Processes:");

    private static final SubLSymbol $SG_REFRESH_TOGGLE = makeKeyword("SG-REFRESH-TOGGLE");

    static private final SubLString $$$No_Mt_Specified = makeString("No Mt Specified");

    private static final SubLSymbol $SG_INFERENCE_BROWSER = makeKeyword("SG-INFERENCE-BROWSER");

    static private final SubLString $str_alt138$_Browse_Inferences_ = makeString("[Browse Inferences]");

    static private final SubLString $str_alt139$_Clean_Up_ = makeString("[Clean Up]");

    static private final SubLString $str_alt140$sg_cb_cleanup_hypotheses__a = makeString("sg-cb-cleanup-hypotheses&~a");

    private static final SubLSymbol CB_LINK_SG_CLEANUP_HYPOTHESES = makeSymbol("CB-LINK-SG-CLEANUP-HYPOTHESES");

    private static final SubLSymbol SG_CB_CLEANUP_HYPOTHESES = makeSymbol("SG-CB-CLEANUP-HYPOTHESES");

    static private final SubLString $str_alt143$sg_cb_switch_auto_refresh = makeString("sg-cb-switch-auto-refresh");

    static private final SubLString $str_alt144$_Halt_Auto_Refresh_ = makeString("[Halt Auto Refresh]");

    static private final SubLString $str_alt145$_Auto_Refresh_ = makeString("[Auto Refresh]");

    private static final SubLSymbol CB_LINK_SG_REFRESH_TOGGLE = makeSymbol("CB-LINK-SG-REFRESH-TOGGLE");

    private static final SubLSymbol SG_CB_SWITCH_AUTO_REFRESH = makeSymbol("SG-CB-SWITCH-AUTO-REFRESH");

    static private final SubLString $str_alt148$_Module_Browser_ = makeString("[Module Browser]");

    static private final SubLString $str_alt149$sg_cb_module_page = makeString("sg-cb-module-page");

    private static final SubLSymbol CB_LINK_SG_MODULE_BROWSER = makeSymbol("CB-LINK-SG-MODULE-BROWSER");

    static private final SubLString $$$amodules = makeString("amodules");

    private static final SubLSymbol $SG_MODULE = makeKeyword("SG-MODULE");

    private static final SubLSymbol CB_FORT_IDENTIFIER = makeSymbol("CB-FORT-IDENTIFIER");

    private static final SubLSymbol SG_CB_MODULE_PAGE = makeSymbol("SG-CB-MODULE-PAGE");



    private static final SubLSymbol $REFINEMENT = makeKeyword("REFINEMENT");

    private static final SubLSymbol $META_EXPANSION = makeKeyword("META-EXPANSION");

    static private final SubLString $str_alt158$Scenario_Generation_Module_Browse = makeString("Scenario Generation Module Browser");

    static private final SubLString $str_alt159$sg_cb_module_page_handler = makeString("sg-cb-module-page-handler");

    static private final SubLString $str_alt160$sg_cb_reload_modules = makeString("sg-cb-reload-modules");

    static private final SubLString $str_alt161$_Reload_Modules_from_KB_ = makeString("[Reload Modules from KB]");

    static private final SubLList $list_alt162 = cons(makeSymbol("TYPE"), makeUninternedSymbol("VALUE"));

    static private final SubLString $$$Use_Selected_Modules_Only = makeString("Use Selected Modules Only");

    private static final SubLSymbol $REDO_DISABLED = makeKeyword("REDO-DISABLED");

    static private final SubLString $str_alt165$__amodules = makeString("__amodules");

    private static final SubLSymbol SG_CB_MODULE_PAGE_INT = makeSymbol("SG-CB-MODULE-PAGE-INT");

    private static final SubLSymbol CB_GUESS_FORT = makeSymbol("CB-GUESS-FORT");

    private static final SubLSymbol SG_CB_MODULE_PAGE_HANDLER = makeSymbol("SG-CB-MODULE-PAGE-HANDLER");

    private static final SubLSymbol SG_CB_RELOAD_MODULES = makeSymbol("SG-CB-RELOAD-MODULES");

    static private final SubLString $str_alt170$sg_cb_module_info_page__a = makeString("sg-cb-module-info-page&~a");

    private static final SubLSymbol CB_LINK_SG_MODULE = makeSymbol("CB-LINK-SG-MODULE");

    static private final SubLString $str_alt172$SG_Module__ = makeString("SG Module: ");

    static private final SubLString $str_alt173$25_ = makeString("25%");

    static private final SubLString $$$Property = makeString("Property");

    static private final SubLString $$$Value = makeString("Value");



    private static final SubLSymbol SG_CB_MODULE_INFO_PAGE = makeSymbol("SG-CB-MODULE-INFO-PAGE");

    static private final SubLString $str_alt178$_Browse_ = makeString("[Browse]");

    static private final SubLString $str_alt179$sg_cb_inference_browser__a = makeString("sg-cb-inference-browser&~a");

    private static final SubLSymbol CB_LINK_SG_INFERENCE_BROWSER = makeSymbol("CB-LINK-SG-INFERENCE-BROWSER");

    private static final SubLSymbol SG_CB_INFERENCE_BROWSER = makeSymbol("SG-CB-INFERENCE-BROWSER");

    static private final SubLSymbol $sym182$_SG_CB_SHOW_ALL_INFERENCES__ = makeSymbol("*SG-CB-SHOW-ALL-INFERENCES?*");

    static private final SubLString $str_alt183$Scenario_Generation_Inference_Bro = makeString("Scenario Generation Inference Browser");

    private static final SubLSymbol $SG_CB_INF_BROWSER_BACKWARDS_INFERENCES = makeKeyword("SG-CB-INF-BROWSER-BACKWARDS-INFERENCES");

    private static final SubLSymbol $SG_CB_INF_BROWSER_ALL_INFERENCES = makeKeyword("SG-CB-INF-BROWSER-ALL-INFERENCES");

    private static final SubLSymbol $SG_CB_INF_BROWSER_REFRESH_INFERENCES = makeKeyword("SG-CB-INF-BROWSER-REFRESH-INFERENCES");

    static private final SubLString $str_alt187$No_inferences_associated_with_thi = makeString("No inferences associated with this process.");

    static private final SubLString $$$Inference_Object = makeString("Inference Object");

    static private final SubLString $$$Mt = makeString("Mt");

    static private final SubLString $$$Info = makeString("Info");

    static private final SubLString $$$Status = makeString("Status");

    static private final SubLString $str_alt192$Forward_inferences_during_refinem = makeString("Forward inferences during refinement using problem store: ");



    private static final SubLSymbol $SG_FORWARD_INFERENCE = makeKeyword("SG-FORWARD-INFERENCE");

    static private final SubLString $str_alt195$No_answers_ = makeString("No answers.");







    static private final SubLList $list_alt199 = list(makeSymbol("INFERENCE-BINDINGS"), makeSymbol("INFERENCE-SUPPORTS"));

    static private final SubLString $str_alt200$sg_clump__A = makeString("sg_clump_~A");

    static private final SubLString $str_alt201$Results__ = makeString("Results: ");

    static private final SubLString $str_alt202$_unique_out_of_ = makeString(" unique out of ");

    static private final SubLString $str_alt203$_total_answers_ = makeString(" total answers.");

    static private final SubLString $str_alt204$Abnormal__ = makeString("Abnormal: ");

    static private final SubLString $str_alt205$Abnormal_check_timed_out__ = makeString("Abnormal check timed out: ");

    static private final SubLString $str_alt206$s__ = makeString("s: ");

    static private final SubLString $str_alt207$Scenario_Generation_Forward_Infer = makeString("Scenario Generation Forward Inference Browser");

    private static final SubLSymbol SG_CB_FORWARD_INFERENCE_BROWSER = makeSymbol("SG-CB-FORWARD-INFERENCE-BROWSER");

    static private final SubLString $$$Forward_Inference_Clump = makeString("Forward Inference Clump");

    static private final SubLString $str_alt210$sg_cb_forward_inference_browser__ = makeString("sg-cb-forward-inference-browser&~A");

    private static final SubLSymbol CB_LINK_SG_FORWARD_INFERENCE = makeSymbol("CB-LINK-SG-FORWARD-INFERENCE");

    static private final SubLString $str_alt212$_Refresh_Inferences_ = makeString("[Refresh Inferences]");

    private static final SubLSymbol CB_LINK_SG_CB_INF_BROWSER_REFRESH_INFERENCES = makeSymbol("CB-LINK-SG-CB-INF-BROWSER-REFRESH-INFERENCES");

    static private final SubLString $str_alt214$sg_cb_show_all_inferences__a = makeString("sg-cb-show-all-inferences&~a");

    static private final SubLString $str_alt215$_Show_All_Inferences_ = makeString("[Show All Inferences]");

    private static final SubLSymbol CB_LINK_SG_CB_INF_BROWSER_ALL_INFERENCES = makeSymbol("CB-LINK-SG-CB-INF-BROWSER-ALL-INFERENCES");

    static private final SubLString $str_alt217$sg_cb_show_backwards_inferences__ = makeString("sg-cb-show-backwards-inferences&~a");

    static private final SubLString $str_alt218$_Show_Expansions_Only_ = makeString("[Show Expansions Only]");

    private static final SubLSymbol CB_LINK_SG_CB_INF_BROWSER_BACKWARDS_INFERENCES = makeSymbol("CB-LINK-SG-CB-INF-BROWSER-BACKWARDS-INFERENCES");

    private static final SubLSymbol SG_CB_SHOW_ALL_INFERENCES = makeSymbol("SG-CB-SHOW-ALL-INFERENCES");

    private static final SubLSymbol SG_CB_SHOW_BACKWARDS_INFERENCES = makeSymbol("SG-CB-SHOW-BACKWARDS-INFERENCES");

    static private final SubLString $$$Select_All = makeString("Select All");

    static private final SubLString $$$Unselect_All = makeString("Unselect All");

    static private final SubLString $str_alt224$onClick__this_value_sg_toggle_all = makeString("onClick=\"this.value=sg_toggle_all_checkboxes(this.form,\'~a\')\"");

    static private final SubLString $str_alt225$__var_checkflag___false__var_sele = makeString("\n\nvar checkflag = false;\nvar select_all_label = \"~a\";\nvar unselect_all_label = \"~a\";\n\nfunction sg_toggle_all_checkboxes(form,name) {\n  if (checkflag == false) { \n    for (i = 0 ; i < form.elements.length ; i++) {\n      var field = form.elements[i];\n      if (field.name == name) {\n        field.checked = true;\n      }\n    }\n    checkflag = true;\n    return unselect_all_label;\n  } else {\n    for (i = 0 ; i < form.elements.length ; i++) {\n      var field = form.elements[i];\n      if (field.name == name) {\n        field.checked = false;\n      }\n    }\n    checkflag = false;\n    return select_all_label; \n  }\n}");

    // // Initializers
    public void declareFunctions() {
        declare_sg_browser_file();
    }

    public void initializeVariables() {
        init_sg_browser_file();
    }

    public void runTopLevelForms() {
        setup_sg_browser_file();
    }
}

