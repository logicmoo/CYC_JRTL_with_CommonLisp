/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      CB-FACT-SHEETS
 *  source file: /cyc/top/cycl/cb-fact-sheets.lisp
 *  created:     2019/07/03 17:38:05
 */
public final class cb_fact_sheets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_fact_sheets() {
    }

    public static final SubLFile me = new cb_fact_sheets();

    public static final String myName = "com.cyc.cycjava.cycl.cb_fact_sheets";

    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_fact_sheet_verbosities$ = makeSymbol("*CB-FACT-SHEET-VERBOSITIES*");

    /**
     * This gates whether we provide links to generate fact sheets in the left pane of the browser.
     */
    // deflexical
    private static final SubLSymbol $allow_fact_sheet_generationP$ = makeSymbol("*ALLOW-FACT-SHEET-GENERATION?*");

    public static final SubLObject verbosity_keyword_from_string(SubLObject verbosity) {
        {
            SubLObject res = find(verbosity, $cb_fact_sheet_verbosities$.getGlobalValue(), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            return NIL != res ? ((SubLObject) (cadr(res))) : cadr($cb_fact_sheet_verbosities$.getGlobalValue().first());
        }
    }

    public static final SubLObject verbosity_string_from_keyword(SubLObject verbosity_keyword) {
        {
            SubLObject res = find(verbosity_keyword, $cb_fact_sheet_verbosities$.getGlobalValue(), symbol_function(EQ), symbol_function(CADR), UNPROVIDED, UNPROVIDED);
            return NIL != res ? ((SubLObject) (res.first())) : $cb_fact_sheet_verbosities$.getGlobalValue().first().first();
        }
    }

    public static final SubLObject cb_c_fact_sheet_links(SubLObject args) {
        {
            SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
            cb_c_print_fact_sheet_links(v_term);
        }
        return NIL;
    }

    /**
     * Show links for fact sheets
     */
    public static final SubLObject cb_c_print_fact_sheet_links(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject verbosities_precached = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
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
                                            Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = $cb_fact_sheet_verbosities$.getGlobalValue();
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        {
                                            SubLObject verbosity_keyword = second(pair);
                                            if (NIL != fact_sheets.term_has_precached_fact_sheetP(v_term, verbosity_keyword, $ANY, $ANY)) {
                                                verbosities_precached = cons(pair, verbosities_precached);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != $allow_fact_sheet_generationP$.getGlobalValue()) {
                                            {
                                                SubLObject ok_for_fact_sheetP = fact_sheets.term_ok_for_fact_sheet_p(v_term, NIL);
                                                SubLObject ok_but_not_precached_verbosity_keywords = NIL;
                                                if ((NIL == subl_promotions.memberP($MINI, verbosities_precached, symbol_function(EQ), symbol_function(SECOND))) && (NIL != fact_sheets.term_ok_for_fact_sheet_p(v_term, T))) {
                                                    ok_but_not_precached_verbosity_keywords = cons($MINI, ok_but_not_precached_verbosity_keywords);
                                                }
                                                {
                                                    SubLObject cdolist_list_var = $list_alt9;
                                                    SubLObject verbosity_keyword = NIL;
                                                    for (verbosity_keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , verbosity_keyword = cdolist_list_var.first()) {
                                                        if ((NIL != ok_for_fact_sheetP) && (NIL == subl_promotions.memberP(verbosity_keyword, verbosities_precached, symbol_function(EQ), symbol_function(SECOND)))) {
                                                            ok_but_not_precached_verbosity_keywords = cons(verbosity_keyword, ok_but_not_precached_verbosity_keywords);
                                                        }
                                                    }
                                                }
                                                if ((NIL != list_utilities.non_empty_list_p(verbosities_precached)) || (NIL != list_utilities.non_empty_list_p(ok_but_not_precached_verbosity_keywords))) {
                                                    {
                                                        SubLObject dhtml_object_id = $$$FactSheets;
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                        dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str_alt11$);
                                                        html_utilities.html_princ($str_alt12$Fact_sheets__);
                                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                        {
                                                            SubLObject cdolist_list_var = verbosities_precached;
                                                            SubLObject pair = NIL;
                                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject verbosity_string = pair.first();
                                                                    SubLObject verbosity = second(pair);
                                                                    SubLObject mts_id = cconcatenate(dhtml_object_id, verbosity_string);
                                                                    if (NIL != fact_sheets.term_has_precached_fact_sheetP(v_term, verbosity, $DEFAULT, $DEFAULT)) {
                                                                        cb_link_fact_sheet(v_term, verbosity_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), verbosity_string);
                                                                    }
                                                                    dhtml_macros.dhtml_switch_visibility_links_arrows(mts_id, $str_alt11$);
                                                                    html_utilities.html_princ($str_alt14$_);
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var = verbosities_precached;
                                                            SubLObject pair = NIL;
                                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject verbosity_string = pair.first();
                                                                    SubLObject verbosity = second(pair);
                                                                    SubLObject mts_id = cconcatenate(dhtml_object_id, verbosity_string);
                                                                    SubLObject mt_alist = fact_sheets.mts_with_precached_fact_sheet_data_for_term(v_term, verbosity);
                                                                    dhtml_macros.dhtml_set_switched_visibility(mts_id, $INVISIBLE, $TEXT);
                                                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                    if (NIL != mts_id) {
                                                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(mts_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var_4 = mt_alist;
                                                                                        SubLObject cons = NIL;
                                                                                        for (cons = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , cons = cdolist_list_var_4.first()) {
                                                                                            {
                                                                                                SubLObject datum = cons;
                                                                                                SubLObject current = datum;
                                                                                                SubLObject domain_mt = NIL;
                                                                                                SubLObject language_mts = NIL;
                                                                                                destructuring_bind_must_consp(current, datum, $list_alt17);
                                                                                                domain_mt = current.first();
                                                                                                current = current.rest();
                                                                                                language_mts = current;
                                                                                                html_utilities.html_indent(THREE_INTEGER);
                                                                                                html_utilities.html_princ(cb_utilities.cb_term_display_string(domain_mt));
                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt18$Language_Mts_);
                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var_5 = language_mts;
                                                                                                    SubLObject language_mt = NIL;
                                                                                                    for (language_mt = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , language_mt = cdolist_list_var_5.first()) {
                                                                                                        {
                                                                                                            SubLObject link_text = cb_utilities.cb_term_display_string(language_mt);
                                                                                                            html_utilities.html_indent(FIVE_INTEGER);
                                                                                                            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                    cb_link_fact_sheet(v_term, verbosity_string, link_text, domain_mt, language_mt);
                                                                                                                } finally {
                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                                                                }
                                                                                                            }
                                                                                                            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
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
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != list_utilities.non_empty_list_p(verbosities_precached)) {
                                                                    html_utilities.html_indent(THREE_INTEGER);
                                                                    html_utilities.html_princ($str_alt19$Regenerate__);
                                                                    {
                                                                        SubLObject cdolist_list_var = verbosities_precached;
                                                                        SubLObject pair = NIL;
                                                                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject verbosity_string = pair.first();
                                                                                cb_link_fact_sheet_update(v_term, verbosity_string);
                                                                            }
                                                                            html_utilities.html_princ($str_alt14$_);
                                                                        }
                                                                    }
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                }
                                                                if (NIL != list_utilities.non_empty_list_p(ok_but_not_precached_verbosity_keywords)) {
                                                                    html_utilities.html_indent(THREE_INTEGER);
                                                                    html_utilities.html_princ($str_alt20$Generate__);
                                                                    {
                                                                        SubLObject cdolist_list_var = ok_but_not_precached_verbosity_keywords;
                                                                        SubLObject keyword = NIL;
                                                                        for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject verbosity_string = verbosity_string_from_keyword(keyword);
                                                                                cb_link_fact_sheet_update(v_term, verbosity_string);
                                                                            }
                                                                            html_utilities.html_princ($str_alt14$_);
                                                                        }
                                                                    }
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                }
                                                                html_utilities.html_indent(THREE_INTEGER);
                                                                cb_link_fact_sheet_update_queue(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != verbosities_precached) {
                                                html_utilities.html_princ($str_alt12$Fact_sheets__);
                                                {
                                                    SubLObject cdolist_list_var = nreverse(verbosities_precached);
                                                    SubLObject pair = NIL;
                                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject verbosity_string = pair.first();
                                                            cb_link_fact_sheet(v_term, verbosity_string, $str_alt11$, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        html_utilities.html_princ($str_alt14$_);
                                                    }
                                                }
                                            }
                                        }
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
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

    public static final SubLObject cb_link_fact_sheet(SubLObject v_term, SubLObject verbosity_string, SubLObject link_text, SubLObject domain_mt, SubLObject language_mt) {
        if (link_text == UNPROVIDED) {
            link_text = verbosity_string;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt22$cb_c_fact_sheet_term__A_verbosity, cb_utilities.cb_term_identifier(v_term), verbosity_string);
                if (NIL != domain_mt) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt23$_domain_mt__A, cb_utilities.cb_term_identifier(domain_mt));
                }
                if (NIL != language_mt) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_language_mt__A, cb_utilities.cb_term_identifier(language_mt));
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
                        html_utilities.html_princ(link_text);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            return v_term;
        }
    }

    public static final SubLObject cb_c_fact_sheet(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
                SubLObject verbosity = verbosity_keyword_from_string(html_utilities.html_extract_input($$$verbosity, args));
                SubLObject domain_mt = cb_utilities.cb_guess_term(html_utilities.html_extract_input($str_alt28$domain_mt, args), UNPROVIDED);
                SubLObject language_mt = cb_utilities.cb_guess_term(html_utilities.html_extract_input($str_alt29$language_mt, args), UNPROVIDED);
                SubLObject html = cb_fact_sheet_html_for_term(v_term, verbosity, domain_mt, language_mt);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        {
                            SubLObject title_var = $$$Fact_Sheet;
                            {
                                SubLObject _prev_bind_0_8 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
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
                                                html_utilities.html_markup($str_alt31$yui_skin_sam);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            if (verbosity.eql($MINI)) {
                                                                html_utilities.html_princ($str_alt32$Mini_);
                                                            }
                                                            html_utilities.html_princ($str_alt33$Fact_Sheet_for_);
                                                            cb_utilities.cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html);
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
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_fact_sheet_html_for_term(SubLObject v_term, SubLObject verbosity, SubLObject domain_mt, SubLObject language_mt) {
        if (verbosity == UNPROVIDED) {
            verbosity = $NORMAL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $DEFAULT;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == domain_mt) {
                domain_mt = $DEFAULT;
            }
            if (NIL == language_mt) {
                language_mt = $DEFAULT;
            }
            if (NIL == verbosity) {
                verbosity = $NORMAL;
            }
            {
                SubLObject html = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_addressee$.currentBinding(thread);
                    try {
                        pph_vars.$pph_speaker$.bind($$Cyc, thread);
                        pph_vars.$pph_addressee$.bind(operation_communication.the_cyclist(), thread);
                        html = fact_sheets.get_fact_sheet_for_term_in_html(v_term, verbosity, domain_mt, language_mt, UNPROVIDED).first();
                    } finally {
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_speaker$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_c_replace_fact_sheet_markups(cb_c_remove_fact_sheet_base_uri(html), verbosity);
            }
        }
    }

    public static final SubLObject cb_c_remove_fact_sheet_base_uri(SubLObject html) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject base_uri_string = NIL;
                SubLObject href = http_kernel.http_server_base_url(T);
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_base_head$.getGlobalValue());
                            if (NIL != href) {
                                html_utilities.html_markup(html_macros.$html_base_href$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(href);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    base_uri_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject result = string_utilities.replace_substring_once(html, base_uri_string, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                    return NIL != result ? ((SubLObject) (result)) : html;
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $cb_fact_sheet_verbosity$ = makeSymbol("*CB-FACT-SHEET-VERBOSITY*");

    public static final SubLObject cb_c_replace_fact_sheet_markups(SubLObject html, SubLObject verbosity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cb_fact_sheet_verbosity$.currentBinding(thread);
                    try {
                        $cb_fact_sheet_verbosity$.bind(verbosity.eql($MINI) ? ((SubLObject) ($NORMAL)) : verbosity, thread);
                        ans = fact_sheets.replace_fact_sheet_markups(html, CB_C_FACT_SHEET_LINK_FOR_TERM, UNPROVIDED);
                    } finally {
                        $cb_fact_sheet_verbosity$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject cb_c_fact_sheet_link_for_term(SubLObject v_term, SubLObject linked_text, SubLObject link_text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cb_c_fact_sheet_link_for_term_and_verbosity(v_term, $cb_fact_sheet_verbosity$.getDynamicValue(thread), linked_text);
        }
    }

    public static final SubLObject cb_c_fact_sheet_link_for_term_and_verbosity(SubLObject v_term, SubLObject verbosity, SubLObject linked_text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject link = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            if (NIL != fact_sheets.term_ok_for_fact_sheet_p(v_term, UNPROVIDED)) {
                                cb_link_fact_sheet(v_term, princ_to_string(verbosity), linked_text, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL == assertion_handles.assertion_p(v_term)) {
                                    {
                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                            html_utilities.html_princ(linked_text);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                } else
                                    if (NIL != string_utilities.substringP($str_alt38$_Edit_, linked_text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        cb_assertion_editor.cb_link_edit_assertion(v_term, linked_text, NIL, $MAIN);
                                    } else {
                                        cb_utilities.cb_assertion_ball(v_term, $BOTTOM);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                html_utilities.html_princ(linked_text);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    }


                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    link = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return link;
            }
        }
    }







    public static final SubLObject cb_link_fact_sheet_update(SubLObject v_term, SubLObject verbosity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt44$cb_c_fact_sheet_update_term__A_ve, cb_utilities.cb_term_identifier(v_term), verbosity);
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
                        html_utilities.html_princ(verbosity);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            return v_term;
        }
    }

    public static final SubLObject cb_c_fact_sheet_update(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
                SubLObject verbosity = verbosity_keyword_from_string(html_utilities.html_extract_input($$$verbosity, args));
                SubLObject domain_mt = $DEFAULT;
                SubLObject language_mt = $DEFAULT;
                cb_possibly_initialize_fact_sheet_update_queue();
                cb_possibly_initialize_fact_sheet_update_daemon();
                {
                    SubLObject task = list(v_term, verbosity, domain_mt, language_mt);
                    SubLObject timed_outP = NIL;
                    cb_fact_sheet_enqueue_update_task(task);
                    {
                        SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            {
                                SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                    {
                                        SubLObject timer = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_14 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = subl_macro_promotions.with_timeout_start_timer(ONE_INTEGER, tag);
                                                    while (NIL == cb_fact_sheet_update_current_task()) {
                                                        sleep($float$0_1);
                                                    } 
                                                } finally {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                    }
                    html_print_cb_fact_sheet_update_queue_contents();
                    html_utilities.html_newline(UNPROVIDED);
                    cb_link_fact_sheet_update_queue($str_alt48$_Start_Auto_Refresh_);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_fact_sheet_enqueue_update_task(SubLObject task) {
        return process_utilities.ipc_enqueue(task, $cb_fact_sheet_update_queue$.getGlobalValue());
    }

    public static final SubLObject cb_fact_sheet_dequeue_update_task() {
        return process_utilities.ipc_dequeue($cb_fact_sheet_update_queue$.getGlobalValue());
    }

    public static final SubLObject cb_fact_sheet_queue_contents() {
        return process_utilities.ipc_current_queue_content($cb_fact_sheet_update_queue$.getGlobalValue());
    }

    public static final SubLObject cb_fact_sheet_update_current_task() {
        return $cb_fact_sheet_update_current_task$.getGlobalValue();
    }

    public static final SubLObject cb_link_fact_sheet_update_queue(SubLObject link_text) {
        if (link_text == UNPROVIDED) {
            link_text = $str_alt50$Show_fact_sheet_generation_reques;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$cb_c_fact_sheet_update_queue);
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
                        html_utilities.html_princ(link_text);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_c_fact_sheet_update_queue(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_utilities.html_refresh(FIVE_INTEGER);
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_print_cb_fact_sheet_update_queue_contents();
            return NIL;
        }
    }

    public static final SubLObject html_print_cb_fact_sheet_update_queue_contents() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_possibly_initialize_fact_sheet_update_queue();
            {
                SubLObject contents = cb_fact_sheet_queue_contents();
                SubLObject size = length(contents);
                SubLObject current_task = cb_fact_sheet_update_current_task();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt55$As_of__A_on__A___, numeric_date_utilities.secondstring(UNPROVIDED), numeric_date_utilities.datestring(UNPROVIDED));
                html_utilities.html_newline(UNPROVIDED);
                if (NIL != current_task) {
                    html_utilities.html_princ($str_alt56$Currently_being_generated_);
                    html_utilities.html_newline(UNPROVIDED);
                    html_print_update_fact_sheet_args(current_task);
                } else {
                    html_utilities.html_princ($str_alt57$No_fact_sheets_currently_being_ge);
                }
                html_utilities.html_newline(TWO_INTEGER);
                if (size.isZero()) {
                    html_utilities.html_princ($str_alt58$No_fact_sheets_waiting_to_be_gene);
                } else {
                    html_utilities.html_princ($str_alt59$Currently_waiting_to_be_generated);
                    {
                        SubLObject max_to_show = ELEVEN_INTEGER;
                        SubLObject ellipsis_cutoff_index = subtract(max_to_show, FOUR_INTEGER);
                        SubLObject excess_size = (size.numG(max_to_show)) ? ((SubLObject) (subtract(size, add(ellipsis_cutoff_index, TWO_INTEGER)))) : NIL;
                        SubLObject index = ZERO_INTEGER;
                        SubLObject done = NIL;
                        SubLObject rest = NIL;
                        for (rest = contents; !((NIL != done) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject update_fact_sheet_args = rest.first();
                                html_utilities.html_newline(UNPROVIDED);
                                html_print_update_fact_sheet_args(update_fact_sheet_args);
                                done = makeBoolean((NIL != excess_size) && index.numGE(ellipsis_cutoff_index));
                                index = number_utilities.f_1X(index);
                            }
                        }
                        if (NIL != excess_size) {
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_princ(cconcatenate($str_alt60$_____, new SubLObject[]{ string_utilities.to_string(excess_size), $str_alt61$_more_____ }));
                            html_utilities.html_newline(TWO_INTEGER);
                            html_print_update_fact_sheet_args(list_utilities.last_one(contents));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject html_print_update_fact_sheet_args(SubLObject update_fact_sheet_args) {
        {
            SubLObject v_term = update_fact_sheet_args.first();
            SubLObject verbosity = second(update_fact_sheet_args);
            cb_utilities.cb_form(v_term, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt14$_);
            html_utilities.html_prin1(verbosity);
        }
        return NIL;
    }

    public static final SubLObject cb_possibly_initialize_fact_sheet_update_queue() {
        if (NIL == process_utilities.ipc_queue_p($cb_fact_sheet_update_queue$.getGlobalValue())) {
            $cb_fact_sheet_update_queue$.setGlobalValue(process_utilities.new_ipc_queue($str_alt62$Cyc_Browser_Fact_Sheet_Update_Que));
        }
        return $cb_fact_sheet_update_queue$.getGlobalValue();
    }

    public static final SubLObject cb_possibly_initialize_fact_sheet_update_daemon() {
        if (NIL == valid_process_p($cb_fact_sheet_update_daemon$.getGlobalValue())) {
            $cb_fact_sheet_update_daemon$.setGlobalValue(process_utilities.make_cyc_server_process($$$Cyc_Browser_Fact_Sheet_Updater, CB_PROCESS_FACT_SHEET_UPDATE_QUEUE));
        }
        return $cb_fact_sheet_update_daemon$.getGlobalValue();
    }

    public static final SubLObject cb_process_fact_sheet_update_queue() {
        SubLTrampolineFile.checkType($cb_fact_sheet_update_queue$.getGlobalValue(), IPC_QUEUE_P);
        while (true) {
            {
                SubLObject task = cb_fact_sheet_dequeue_update_task();
                SubLObject datum = task;
                SubLObject current = datum;
                SubLObject v_term = NIL;
                SubLObject verbosity = NIL;
                SubLObject domain_mt = NIL;
                SubLObject language_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt66);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt66);
                verbosity = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt66);
                domain_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt66);
                language_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    $cb_fact_sheet_update_current_task$.setGlobalValue(task);
                    fact_sheets.update_fact_sheet_for_term(v_term, verbosity, domain_mt, language_mt, UNPROVIDED, UNPROVIDED);
                    $cb_fact_sheet_update_current_task$.setGlobalValue(NIL);
                } else {
                    cdestructuring_bind_error(datum, $list_alt66);
                }
            }
        } 
    }

    public static final SubLObject declare_cb_fact_sheets_file() {
        declareFunction("verbosity_keyword_from_string", "VERBOSITY-KEYWORD-FROM-STRING", 1, 0, false);
        declareFunction("verbosity_string_from_keyword", "VERBOSITY-STRING-FROM-KEYWORD", 1, 0, false);
        declareFunction("cb_c_fact_sheet_links", "CB-C-FACT-SHEET-LINKS", 1, 0, false);
        declareFunction("cb_c_print_fact_sheet_links", "CB-C-PRINT-FACT-SHEET-LINKS", 1, 0, false);
        declareFunction("cb_link_fact_sheet", "CB-LINK-FACT-SHEET", 2, 3, false);
        declareFunction("cb_c_fact_sheet", "CB-C-FACT-SHEET", 1, 0, false);
        declareFunction("cb_fact_sheet_html_for_term", "CB-FACT-SHEET-HTML-FOR-TERM", 1, 3, false);
        declareFunction("cb_c_remove_fact_sheet_base_uri", "CB-C-REMOVE-FACT-SHEET-BASE-URI", 1, 0, false);
        declareFunction("cb_c_replace_fact_sheet_markups", "CB-C-REPLACE-FACT-SHEET-MARKUPS", 2, 0, false);
        declareFunction("cb_c_fact_sheet_link_for_term", "CB-C-FACT-SHEET-LINK-FOR-TERM", 3, 0, false);
        declareFunction("cb_c_fact_sheet_link_for_term_and_verbosity", "CB-C-FACT-SHEET-LINK-FOR-TERM-AND-VERBOSITY", 3, 0, false);
        declareFunction("cb_link_fact_sheet_update", "CB-LINK-FACT-SHEET-UPDATE", 2, 0, false);
        declareFunction("cb_c_fact_sheet_update", "CB-C-FACT-SHEET-UPDATE", 1, 0, false);
        declareFunction("cb_fact_sheet_enqueue_update_task", "CB-FACT-SHEET-ENQUEUE-UPDATE-TASK", 1, 0, false);
        declareFunction("cb_fact_sheet_dequeue_update_task", "CB-FACT-SHEET-DEQUEUE-UPDATE-TASK", 0, 0, false);
        declareFunction("cb_fact_sheet_queue_contents", "CB-FACT-SHEET-QUEUE-CONTENTS", 0, 0, false);
        declareFunction("cb_fact_sheet_update_current_task", "CB-FACT-SHEET-UPDATE-CURRENT-TASK", 0, 0, false);
        declareFunction("cb_link_fact_sheet_update_queue", "CB-LINK-FACT-SHEET-UPDATE-QUEUE", 0, 1, false);
        declareFunction("cb_c_fact_sheet_update_queue", "CB-C-FACT-SHEET-UPDATE-QUEUE", 1, 0, false);
        declareFunction("html_print_cb_fact_sheet_update_queue_contents", "HTML-PRINT-CB-FACT-SHEET-UPDATE-QUEUE-CONTENTS", 0, 0, false);
        declareFunction("html_print_update_fact_sheet_args", "HTML-PRINT-UPDATE-FACT-SHEET-ARGS", 1, 0, false);
        declareFunction("cb_possibly_initialize_fact_sheet_update_queue", "CB-POSSIBLY-INITIALIZE-FACT-SHEET-UPDATE-QUEUE", 0, 0, false);
        declareFunction("cb_possibly_initialize_fact_sheet_update_daemon", "CB-POSSIBLY-INITIALIZE-FACT-SHEET-UPDATE-DAEMON", 0, 0, false);
        declareFunction("cb_process_fact_sheet_update_queue", "CB-PROCESS-FACT-SHEET-UPDATE-QUEUE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_fact_sheets_file() {
        deflexical("*CB-FACT-SHEET-VERBOSITIES*", $list_alt0);
        deflexical("*ALLOW-FACT-SHEET-GENERATION?*", T);
        defparameter("*CB-FACT-SHEET-VERBOSITY*", $NORMAL);
        deflexical("*CB-FACT-SHEET-UPDATE-DAEMON*", NIL != boundp($cb_fact_sheet_update_daemon$) ? ((SubLObject) ($cb_fact_sheet_update_daemon$.getGlobalValue())) : NIL);
        deflexical("*CB-FACT-SHEET-UPDATE-QUEUE*", NIL != boundp($cb_fact_sheet_update_queue$) ? ((SubLObject) ($cb_fact_sheet_update_queue$.getGlobalValue())) : NIL);
        deflexical("*CB-FACT-SHEET-UPDATE-CURRENT-TASK*", NIL != boundp($cb_fact_sheet_update_current_task$) ? ((SubLObject) ($cb_fact_sheet_update_current_task$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_fact_sheets_file() {
                html_macros.note_html_handler_function(CB_C_FACT_SHEET_LINKS);
        cb_utilities.setup_cb_link_method($FACT_SHEET, CB_LINK_FACT_SHEET, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_C_FACT_SHEET);
        utilities_macros.note_funcall_helper_function(CB_C_FACT_SHEET_LINK_FOR_TERM);
        subl_macro_promotions.declare_defglobal($cb_fact_sheet_update_daemon$);
        subl_macro_promotions.declare_defglobal($cb_fact_sheet_update_queue$);
        subl_macro_promotions.declare_defglobal($cb_fact_sheet_update_current_task$);
        cb_utilities.setup_cb_link_method($FACT_SHEET_UPDATE, CB_LINK_FACT_SHEET_UPDATE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_C_FACT_SHEET_UPDATE);
        cb_utilities.setup_cb_link_method($FACT_SHEET_UPDATE_QUEUE, CB_LINK_FACT_SHEET_UPDATE_QUEUE, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_C_FACT_SHEET_UPDATE_QUEUE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeString("normal"), makeKeyword("NORMAL")), list(makeString("verbose"), makeKeyword("VERBOSE")), list(makeString("mini"), $MINI));





    static private final SubLString $$$term = makeString("term");

    private static final SubLSymbol CB_C_FACT_SHEET_LINKS = makeSymbol("CB-C-FACT-SHEET-LINKS");

    static private final SubLString $str_alt5$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");







    static private final SubLList $list_alt9 = list(makeKeyword("VERBOSE"), makeKeyword("NORMAL"));

    static private final SubLString $$$FactSheets = makeString("FactSheets");

    static private final SubLString $str_alt11$ = makeString("");

    static private final SubLString $str_alt12$Fact_sheets__ = makeString("Fact sheets: ");



    static private final SubLString $str_alt14$_ = makeString(" ");





    static private final SubLList $list_alt17 = cons(makeSymbol("DOMAIN-MT"), makeSymbol("LANGUAGE-MTS"));

    static private final SubLString $str_alt18$Language_Mts_ = makeString("Language Mts:");

    static private final SubLString $str_alt19$Regenerate__ = makeString("Regenerate: ");

    static private final SubLString $str_alt20$Generate__ = makeString("Generate: ");



    static private final SubLString $str_alt22$cb_c_fact_sheet_term__A_verbosity = makeString("cb-c-fact-sheet&term=~A&verbosity=~A");

    static private final SubLString $str_alt23$_domain_mt__A = makeString("&domain-mt=~A");

    static private final SubLString $str_alt24$_language_mt__A = makeString("&language-mt=~A");



    private static final SubLSymbol CB_LINK_FACT_SHEET = makeSymbol("CB-LINK-FACT-SHEET");

    static private final SubLString $$$verbosity = makeString("verbosity");

    static private final SubLString $str_alt28$domain_mt = makeString("domain-mt");

    static private final SubLString $str_alt29$language_mt = makeString("language-mt");

    static private final SubLString $$$Fact_Sheet = makeString("Fact Sheet");

    static private final SubLString $str_alt31$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt32$Mini_ = makeString("Mini ");

    static private final SubLString $str_alt33$Fact_Sheet_for_ = makeString("Fact Sheet for ");

    private static final SubLSymbol CB_C_FACT_SHEET = makeSymbol("CB-C-FACT-SHEET");



    public static final SubLObject $$Cyc = constant_handles.reader_make_constant_shell(makeString("Cyc"));

    private static final SubLSymbol CB_C_FACT_SHEET_LINK_FOR_TERM = makeSymbol("CB-C-FACT-SHEET-LINK-FOR-TERM");

    static private final SubLString $str_alt38$_Edit_ = makeString("[Edit]");





    public static final SubLSymbol $cb_fact_sheet_update_daemon$ = makeSymbol("*CB-FACT-SHEET-UPDATE-DAEMON*");

    public static final SubLSymbol $cb_fact_sheet_update_queue$ = makeSymbol("*CB-FACT-SHEET-UPDATE-QUEUE*");

    public static final SubLSymbol $cb_fact_sheet_update_current_task$ = makeSymbol("*CB-FACT-SHEET-UPDATE-CURRENT-TASK*");

    static private final SubLString $str_alt44$cb_c_fact_sheet_update_term__A_ve = makeString("cb-c-fact-sheet-update&term=~A&verbosity=~A");

    private static final SubLSymbol $FACT_SHEET_UPDATE = makeKeyword("FACT-SHEET-UPDATE");

    private static final SubLSymbol CB_LINK_FACT_SHEET_UPDATE = makeSymbol("CB-LINK-FACT-SHEET-UPDATE");

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLString $str_alt48$_Start_Auto_Refresh_ = makeString("[Start Auto Refresh]");

    private static final SubLSymbol CB_C_FACT_SHEET_UPDATE = makeSymbol("CB-C-FACT-SHEET-UPDATE");

    static private final SubLString $str_alt50$Show_fact_sheet_generation_reques = makeString("Show fact sheet generation request queue");

    static private final SubLString $str_alt51$cb_c_fact_sheet_update_queue = makeString("cb-c-fact-sheet-update-queue");

    private static final SubLSymbol $FACT_SHEET_UPDATE_QUEUE = makeKeyword("FACT-SHEET-UPDATE-QUEUE");

    private static final SubLSymbol CB_LINK_FACT_SHEET_UPDATE_QUEUE = makeSymbol("CB-LINK-FACT-SHEET-UPDATE-QUEUE");

    private static final SubLSymbol CB_C_FACT_SHEET_UPDATE_QUEUE = makeSymbol("CB-C-FACT-SHEET-UPDATE-QUEUE");

    static private final SubLString $str_alt55$As_of__A_on__A___ = makeString("As of ~A on ~A...");

    static private final SubLString $str_alt56$Currently_being_generated_ = makeString("Currently being generated:");

    static private final SubLString $str_alt57$No_fact_sheets_currently_being_ge = makeString("No fact sheets currently being generated.");

    static private final SubLString $str_alt58$No_fact_sheets_waiting_to_be_gene = makeString("No fact sheets waiting to be generated.");

    static private final SubLString $str_alt59$Currently_waiting_to_be_generated = makeString("Currently waiting to be generated:");

    static private final SubLString $str_alt60$_____ = makeString("... (");

    static private final SubLString $str_alt61$_more_____ = makeString(" more) ...");

    static private final SubLString $str_alt62$Cyc_Browser_Fact_Sheet_Update_Que = makeString("Cyc Browser Fact Sheet Update Queue");

    static private final SubLString $$$Cyc_Browser_Fact_Sheet_Updater = makeString("Cyc Browser Fact Sheet Updater");

    private static final SubLSymbol CB_PROCESS_FACT_SHEET_UPDATE_QUEUE = makeSymbol("CB-PROCESS-FACT-SHEET-UPDATE-QUEUE");

    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    static private final SubLList $list_alt66 = list(makeSymbol("TERM"), makeSymbol("VERBOSITY"), makeSymbol("DOMAIN-MT"), makeSymbol("LANGUAGE-MT"));

    // // Initializers
    public void declareFunctions() {
        declare_cb_fact_sheets_file();
    }

    public void initializeVariables() {
        init_cb_fact_sheets_file();
    }

    public void runTopLevelForms() {
        setup_cb_fact_sheets_file();
    }
}

