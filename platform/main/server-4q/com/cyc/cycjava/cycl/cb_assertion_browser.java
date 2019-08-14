/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_perform_access_diagnostics$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_show_el_formula$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_show_english$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_show_hl_formula$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_wrap_assertions$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_editing_enabled$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_ke_text_mode$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_show_el_assertion_readably_last_formula$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_show_el_assertion_readably_last_mt$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_lookup;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$assertion_filter_hook$;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_form_method_table$;
import static com.cyc.cycjava.cycl.cb_utilities.$rule_unlabelled_dont_care_variables$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_assertion_el_formula;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form_assertion_formula;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_deduction;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_inactive_left_arrow;
import static com.cyc.cycjava.cycl.cb_utilities.cb_inactive_right_arrow;
import static com.cyc.cycjava.cycl.cb_utilities.cb_left_arrow;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_right_arrow;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_cyclist;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_date;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_direction;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_hl_support_formula_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_hl_support_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_question_in_nl;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_second;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_sentence_in_nl;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_strength;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_support_module;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_truth;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$show_assertions_in_english$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_icon_definitions$;
import static com.cyc.cycjava.cycl.deduction_handles.$dtp_deduction$;
import static com.cyc.cycjava.cycl.deduction_handles.deduction_id;
import static com.cyc.cycjava.cycl.deduction_handles.deduction_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.rule_formula_unlabelled_dont_care_variables;
import static com.cyc.cycjava.cycl.hl_supports.hl_validate_wff_violations;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_prin1;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.cycjava.cycl.wff.el_wffP;
import static com.cyc.cycjava.cycl.wff.explain_why_not_wff;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.rtp.rtp_madlibs;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-ASSERTION-BROWSER
 * source file: /cyc/top/cycl/cb-assertion-browser.lisp
 * created:     2019/07/03 17:38:05
 */
public final class cb_assertion_browser extends SubLTranslatedFile implements V12 {
    public static final SubLObject cb_paraphrase_bugzilla_summary_for_cycl(SubLObject cycl) {
        return format(NIL, $str_alt87$Bad_paraphrase___S, cycl);
    }

    /**
     * Print a Bugzilla link for the paraphrase of CYCL.
     */
    @LispMethod(comment = "Print a Bugzilla link for the paraphrase of CYCL.")
    public static final SubLObject cb_paraphrase_bugzilla_link(SubLObject cycl, SubLObject paraphrase, SubLObject subl_form_string) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        if (subl_form_string == UNPROVIDED) {
            subl_form_string = $$$unknown;
        }
        {
            SubLObject product = $$$NL;
            SubLObject component = $$$NL_Generation;
            SubLObject summary = com.cyc.cycjava.cycl.cb_assertion_browser.cb_paraphrase_bugzilla_summary_for_cycl(cycl);
            SubLObject comment = com.cyc.cycjava.cycl.cb_assertion_browser.cb_paraphrase_bugzilla_comment_for_cycl(cycl, paraphrase, subl_form_string);
            bugzilla.cb_bugzilla_link(product, component, summary, comment, UNPROVIDED);
            return NIL;
        }
    }

    /**
     *
     *
     * @param SUBL-FORM-STRING
     * 		stringp; showing the SubL form that was used to generate PARAPHRASE.
     */
    @LispMethod(comment = "@param SUBL-FORM-STRING\r\n\t\tstringp; showing the SubL form that was used to generate PARAPHRASE.")
    public static final SubLObject cb_paraphrase_bugzilla_comment_for_cycl(SubLObject cycl, SubLObject paraphrase, SubLObject subl_form_string) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        if (subl_form_string == UNPROVIDED) {
            subl_form_string = $$$unknown;
        }
        if (NIL == paraphrase) {
            paraphrase = pph_main.generate_phrase(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            subl_form_string = format(NIL, $str_alt88$_GENERATE_PHRASE__S_, cycl);
        }
        {
            SubLObject comment = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                format(stream, $str_alt89$Paraphrase___S, paraphrase);
                terpri(stream);
                format(stream, $str_alt90$SubL___A, subl_form_string);
                comment = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return comment;
        }
    }

    /**
     * Creates the cb-link for the hl-data display of an assertion.
     */
    @LispMethod(comment = "Creates the cb-link for the hl-data display of an assertion.")
    public static final SubLObject cb_link_describe_assertion(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt136$_HL_Data_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$cb_describe_assertion__A, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return assertion;
        }
    }

    public static final SubLObject cb_describe_assertion(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Assertion_HL_Data_page);
            } else {
                {
                    SubLObject assertion = cb_guess_assertion(args);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        cb_error($str_alt115$_a_does_not_specify_a_Cyc_asserti, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Assertion_HL_Data;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                            try {
                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_head_shortcut_icon();
                                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                                if (NIL != title_var) {
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_princ(title_var);
                                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                }
                                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_body_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str_alt8$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != title_var) {
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(TWO_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    html_princ(title_var);
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(TWO_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                }
                                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        cb_help_preamble($CB_HL_DATA_ASSERTION, UNPROVIDED, UNPROVIDED);
                                                        html_indent(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt117$HL_Data_for_Assertion__);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        cb_show_assertion_readably(assertion, T, T);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(ZERO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt120$ID_Number__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertion_handles.assertion_id(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt122$Formula_Data__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertions_low.assertion_formula_data(assertion), ZERO_INTEGER, T);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt123$Mt__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt124$Flags__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertions_low.assertion_flags(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt125$GAF___);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                                                                                    html_princ($$$True);
                                                                                } else {
                                                                                    html_princ($$$False);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt128$Direction__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_show_direction(assertions_high.assertion_direction(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt129$Truth__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_show_truth(assertions_high.assertion_truth(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt130$Strength__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_show_strength(assertions_high.assertion_strength(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt131$Arguments__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_princ($str_alt132$PList__);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(assertions_low.assertion_plist(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($TOP));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($RIGHT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt133$_a__, sg_term_rank.$term_rank_utility_label$.getDynamicValue(thread));
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($LEFT));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt134$_a, sg_term_rank.sg_tr_assertion_utility(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLFile me = new cb_assertion_browser();

 public static final String myName = "com.cyc.cycjava.cycl.cb_assertion_browser";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_assertion_info_dependent_assertion_count_threshold$ = makeSymbol("*CB-ASSERTION-INFO-DEPENDENT-ASSERTION-COUNT-THRESHOLD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_deduction_id_url_pattern$ = makeSymbol("*CB-DEDUCTION-ID-URL-PATTERN*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Find_Assertion = makeString("Find Assertion");

    static private final SubLString $str1$cb_handle_find_assertion = makeString("cb-handle-find-assertion");

    private static final SubLSymbol CB_FIND_ASSERTION = makeSymbol("CB-FIND-ASSERTION");

    private static final SubLSymbol $CB_FIND_ASSERTION = makeKeyword("CB-FIND-ASSERTION");

    private static final SubLString $str5$cb_find_assertion_html = makeString("cb-find-assertion.html");



    private static final SubLString $str7$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str8$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str13$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $$$Reset = makeString("Reset");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    private static final SubLString $str21$use_genl_mts = makeString("use-genl-mts");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str23$Additionally_search_genlMts_for_t = makeString("Additionally search genlMts for this assertion");

    private static final SubLString $str25$cb_find_assertion = makeString("cb-find-assertion");

    private static final SubLSymbol CB_LINK_FIND_ASSERTION = makeSymbol("CB-LINK-FIND-ASSERTION");

    private static final SubLString $$$FindAsrt = makeString("FindAsrt");

    private static final SubLString $$$Find_a_CycL_Assertion = makeString("Find a CycL Assertion");

    private static final SubLString $str30$Sentence_was_not_well_formed_ = makeString("Sentence was not well-formed.");

    private static final SubLString $str31$No_assertions_were_found_ = makeString("No assertions were found.");

    private static final SubLString $str32$Some_assertions_were_found__ = makeString("Some assertions were found :");

    private static final SubLSymbol CB_HANDLE_FIND_ASSERTION = makeSymbol("CB-HANDLE-FIND-ASSERTION");

    private static final SubLList $list34 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLList $list35 = list(makeSymbol("ASSERTION-ID"));

    private static final SubLString $str36$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    private static final SubLString $$$Find_Similar_Assertion = makeString("Find Similar Assertion");

    private static final SubLSymbol CB_FIND_SIMILAR_ASSERTION = makeSymbol("CB-FIND-SIMILAR-ASSERTION");

    private static final SubLString $str40$_Find_Similar_ = makeString("[Find Similar]");

    private static final SubLString $str42$cb_find_similar_assertion__A = makeString("cb-find-similar-assertion&~A");

    private static final SubLSymbol $FIND_SIMILAR_ASSERTION = makeKeyword("FIND-SIMILAR-ASSERTION");

    private static final SubLSymbol CB_LINK_FIND_SIMILAR_ASSERTION = makeSymbol("CB-LINK-FIND-SIMILAR-ASSERTION");

    private static final SubLSymbol CB_ASSERTION = makeSymbol("CB-ASSERTION");

    private static final SubLSymbol CB_AF = makeSymbol("CB-AF");

    private static final SubLString $$$Public_ = makeString("Public ");

    private static final SubLString $str48$ = makeString("");

    private static final SubLString $str49$Assertion__ = makeString("Assertion #");

    private static final SubLString $str50$Meta_Assertions__ = makeString("Meta Assertions :");

    private static final SubLString $str53$Truth___ = makeString("Truth : ");

    private static final SubLString $str54$Strength___ = makeString("Strength : ");

    private static final SubLString $str55$Direction___ = makeString("Direction : ");

    private static final SubLString $$$Arguments = makeString("Arguments");

    private static final SubLString $str58$___ = makeString(" : ");

    private static final SubLString $$$No_Dependents = makeString("No Dependents");

    private static final SubLString $$$Dependents = makeString("Dependents");

    private static final SubLString $str62$_ = makeString("(");

    private static final SubLString $str63$_A_assertion_P = makeString("~A assertion~P");

    private static final SubLString $str64$___A_unique_sentences_ = makeString(" (~A unique sentences)");

    private static final SubLString $str65$__ = makeString(", ");

    private static final SubLString $str66$_A_KB_HL_support_P = makeString("~A KB HL support~P");

    private static final SubLString $str67$_ = makeString(")");

    private static final SubLSymbol $TRANSFORMATION_RULE_STATISTICS = makeKeyword("TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str69$Backward_Inference_Statistics__ = makeString("Backward Inference Statistics :");

    private static final SubLSymbol $CLEAR_TRANSFORMATION_RULE_STATISTICS = makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str73$_Clear_ = makeString("[Clear]");

    private static final SubLSymbol $RULE_FORWARD_INFERENCE_METRICS = makeKeyword("RULE-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str76$Forward_Inference_Statistics__ = makeString("Forward Inference Statistics :");

    private static final SubLString $str77$Rule_properties__ = makeString("Rule properties: ");

    private static final SubLString $str78$Self_Looping_ = makeString("Self-Looping ");

    private static final SubLString $str79$Self_Expanding_ = makeString("Self-Expanding ");

    private static final SubLString $str80$Modification_of_this_Assertion_is = makeString("Modification of this Assertion is not permitted.");

    private static final SubLString $$$Assertion_not_well_formed = makeString("Assertion not well formed");

    private static final SubLList $list82 = list(makeKeyword("IO-MODE"), makeKeyword("NL"));

    private static final SubLString $str83$Assertion_is_either_miscanonicali = makeString("Assertion is either miscanonicalized or incorrectly indexed.");

    private static final SubLString $str84$This_is_probably_due_to_a_canonic = makeString("This is probably due to a canonicalizer directive on ");

    private static final SubLString $str85$_ = makeString(".");



    private static final SubLString $str87$This_is_probably_due_to_a___trueS = makeString("This is probably due to a #$trueSentence wrapper being used in the original EL to avoid skolemization.");

    private static final SubLString $str88$Assertion_excepted_in_some_mts__ = makeString("Assertion excepted in some mts :");

    private static final SubLString $str89$Assertion_doomed_due_to__ = makeString("Assertion doomed due to :");

    private static final SubLList $list90 = cons(makeSymbol("DESCRIPTION"), makeSymbol("MORE-DESCRIPTIONS"));

    private static final SubLString $$$EL_and_ = makeString("EL and ");

    private static final SubLString $str93$EL_Formula___ = makeString("EL Formula : ");

    private static final SubLString $str94$f__ = makeString("f: ");

    private static final SubLString $str95$__ = makeString(" .");

    private static final SubLString $str96$HL_Formula___ = makeString("HL Formula : ");

    private static final SubLString $str97$__ = makeString(". ");

    private static final SubLString $str99$English_Translation___ = makeString("English Translation : ");

    private static final SubLList $list101 = list(makeSymbol("ISA-COLS"), makeSymbol("GENLS-COLS"), makeSymbol("QISA-COLS"));







    private static final SubLString $str108$Rule_Variable_Constraints__ = makeString("Rule Variable Constraints :");

    private static final SubLString $$$Variable = makeString("Variable");

    private static final SubLSymbol $sym110$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLString $str111$_dddddd = makeString("#dddddd");

    private static final SubLString $str112$_cccccc = makeString("#cccccc");



    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell("queryTemplate-Reln");

    private static final SubLString $str115$____which_ought_to_parse_any_of__ = makeString("... which ought to parse any of: ");

    private static final SubLList $list116 = list(makeSymbol("SYNTAX"), makeSymbol("SEMANTICS"));

    private static final SubLString $str118$Exceptions__ = makeString("Exceptions :");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_ASSERTION_LINK_WITH_MT = makeSymbol("CB-ASSERTION-LINK-WITH-MT");

    private static final SubLSymbol CB_ASSERTION_LINK = makeSymbol("CB-ASSERTION-LINK");

    private static final SubLString $str124$Pragmatic_Requirements__ = makeString("Pragmatic Requirements :");

    private static final SubLSymbol CB_ASSERTION_WITH_SHOW_ENGLISH = makeSymbol("CB-ASSERTION-WITH-SHOW-ENGLISH");

    private static final SubLString $str126$_Show_English_ = makeString("[Show English]");

    private static final SubLString $str127$cb_assertion_with_show_english__a = makeString("cb-assertion-with-show-english&~a");

    private static final SubLSymbol CB_LINK_SHOW_ENGLISH = makeSymbol("CB-LINK-SHOW-ENGLISH");

    private static final SubLSymbol CB_ASSERTION_WITH_SHOW_EL_FORMULA = makeSymbol("CB-ASSERTION-WITH-SHOW-EL-FORMULA");

    private static final SubLString $str131$_EL_Formula_ = makeString("[EL Formula]");

    private static final SubLString $str132$cb_assertion_with_show_el_formula = makeString("cb-assertion-with-show-el-formula&~a");

    private static final SubLSymbol $SHOW_EL_FORMULA = makeKeyword("SHOW-EL-FORMULA");

    private static final SubLSymbol CB_LINK_SHOW_EL_FORMULA = makeSymbol("CB-LINK-SHOW-EL-FORMULA");

    private static final SubLString $str136$cb_arguments_html = makeString("cb-arguments.html");

    private static final SubLString $str137$_A_does_not_specify_an_assertion = makeString("~A does not specify an assertion");

    private static final SubLString $str138$Arguments_for_Assertion___S = makeString("Arguments for Assertion #~S");

    private static final SubLString $str139$Assertion___ = makeString("Assertion : ");

    private static final SubLSymbol CB_ARGUMENTS = makeSymbol("CB-ARGUMENTS");

    private static final SubLString $str141$cb_arguments__A = makeString("cb-arguments&~A");

    private static final SubLSymbol CB_LINK_ARGUMENTS = makeSymbol("CB-LINK-ARGUMENTS");

    private static final SubLString $str144$cb_dependents_html = makeString("cb-dependents.html");

    private static final SubLString $str145$Dependents_for_Assertion___S = makeString("Dependents for Assertion #~S");

    private static final SubLString $str146$_A_Assertions_Deduced_using_Asser = makeString("~A Assertions Deduced using Assertion: ");

    private static final SubLString $str147$Assertion_Deduced_using_Assertion = makeString("Assertion Deduced using Assertion: ");

    private static final SubLString $str148$Supports___ = makeString("Supports : ");

    private static final SubLString $str149$_Deduction_ = makeString("[Deduction ");

    private static final SubLString $str150$_ = makeString("]");

    private static final SubLSymbol CB_DEPENDENTS = makeSymbol("CB-DEPENDENTS");

    private static final SubLString $str153$cb_dependents__A = makeString("cb-dependents&~A");

    private static final SubLSymbol CB_LINK_DEPENDENTS = makeSymbol("CB-LINK-DEPENDENTS");

    private static final SubLSymbol CB_ASSERTION_DEPENDENCIES = makeSymbol("CB-ASSERTION-DEPENDENCIES");

    private static final SubLString $str156$_Dependencies_ = makeString("[Dependencies]");

    private static final SubLString $str157$cb_assertion_dependencies__A = makeString("cb-assertion-dependencies&~A");

    private static final SubLSymbol CB_LINK_ASSERTION_DEPENDENCIES = makeSymbol("CB-LINK-ASSERTION-DEPENDENCIES");

    private static final SubLString $$$Assertion_Dependencies = makeString("Assertion Dependencies");

    private static final SubLString $str161$_S_dependent_assertion_A = makeString("~S dependent assertion~A");

    private static final SubLString $str162$s__in_order = makeString("s, in order");

    private static final SubLString $str163$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $str164$_A_does_not_specify_an_argument = makeString("~A does not specify an argument");

    private static final SubLSymbol CB_DEDUCTION = makeSymbol("CB-DEDUCTION");

    private static final SubLString $str166$cb_deduction__A = makeString("cb-deduction&~A");

    private static final SubLString $str167$Dont_know_how_to_convert__A_into_ = makeString("Dont know how to convert ~A into a deduction.");

    private static final SubLString $str169$Deduction___A = makeString("Deduction #~A");

    private static final SubLSymbol CB_LINK_DEDUCTION = makeSymbol("CB-LINK-DEDUCTION");

    private static final SubLString $str171$__ = makeString("#<");

    private static final SubLString $str172$DEDUCTION___A = makeString("DEDUCTION #~A");

    private static final SubLString $str173$_ = makeString(">");

    private static final SubLString $str174$__DEDUCTION___ = makeString("#<DEDUCTION ?>");

    private static final SubLSymbol CB_LINK_DEDUCTION_STRUCT = makeSymbol("CB-LINK-DEDUCTION-STRUCT");

    private static final SubLSymbol CB_FORM_DEDUCTION_METHOD = makeSymbol("CB-FORM-DEDUCTION-METHOD");

    private static final SubLString $$$Deduced_Argument_detail = makeString("Deduced Argument detail");

    private static final SubLString $str180$cb_source_html = makeString("cb-source.html");

    private static final SubLString $str181$Deduced_Argument___S = makeString("Deduced Argument #~S");

    private static final SubLString $str183$_Remove_Deduction_ = makeString("[Remove Deduction]");

    private static final SubLString $$$Previous = makeString("Previous");

    private static final SubLString $$$Next = makeString("Next");

    private static final SubLString $$$Argument_was_Overruled = makeString("Argument was Overruled");

    private static final SubLString $str187$Conclusion__ = makeString("Conclusion :");

    private static final SubLString $str188$Mt___ = makeString("Mt : ");

    private static final SubLString $str189$Supported_conclusion_is_invalid_ = makeString("Supported conclusion is invalid!");

    private static final SubLString $str190$Justification___ = makeString("Justification : ");

    private static final SubLList $list191 = cons(makeSymbol("A"), makeSymbol("COUNT"));

    private static final SubLSymbol $sym192$_ = makeSymbol("<");

    private static final SubLString $str193$Date_of_most_recent_supporting_as = makeString("Date of most recent supporting asserted assertion : ");

    private static final SubLString $str194$Supporting_asserted_assertions___ = makeString("Supporting asserted assertions : ");

    private static final SubLString $$$Supports = makeString("Supports");

    private static final SubLString $$$_and_pragmatic_supports = makeString(" and pragmatic supports");

    private static final SubLString $str197$_max_floor_mts___ = makeString(" max-floor-mts : ");

    private static final SubLSymbol $sym200$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLString $str201$Bound_rule_justification___ = makeString("Bound rule justification : ");

    public static final SubLSymbol $cb_justify_table$ = makeSymbol("*CB-JUSTIFY-TABLE*");

    private static final SubLString $str204$cb_justify_html = makeString("cb-justify.html");

    private static final SubLString $str206$Full_justification_for_Assertion_ = makeString("Full justification for Assertion #~S");

    private static final SubLString $str207$Assertion_Supported__ = makeString("Assertion Supported :");

    private static final SubLSymbol CB_JUSTIFY = makeSymbol("CB-JUSTIFY");

    private static final SubLString $str209$_Justify_ = makeString("[Justify]");

    private static final SubLString $str210$cb_justify__A = makeString("cb-justify&~A");

    private static final SubLSymbol CB_LINK_JUSTIFY = makeSymbol("CB-LINK-JUSTIFY");

    private static final SubLString $str213$Complete_Justification_for_Assert = makeString("Complete Justification for Assertion :");

    private static final SubLString $str214$Arguments_Supporting_Assertion__ = makeString("Arguments Supporting Assertion :");

    private static final SubLString $str215$Argument___ = makeString("Argument : ");

    private static final SubLString $$$Justified_Above = makeString("Justified Above");

    private static final SubLString $$$disc = makeString("disc");

    private static final SubLString $$$1 = makeString("1");

    private static final SubLString $$$Asserted_locally = makeString("Asserted locally");

    private static final SubLString $$$_by_ = makeString(" by ");

    private static final SubLString $$$_on_ = makeString(" on ");

    private static final SubLString $$$_at_ = makeString(" at ");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLList $list226 = list(makeSymbol("ID"), makeSymbol("VALIDATION-LEVEL-STR"));

    private static final SubLString $str227$_A_does_not_specify_an_HL_support = makeString("~A does not specify an HL support");

    private static final SubLSymbol CB_HL_SUPPORT = makeSymbol("CB-HL-SUPPORT");

    private static final SubLSymbol INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL-P");

    private static final SubLString $str231$cb_hl_support__A__A = makeString("cb-hl-support&~A&~A");

    private static final SubLSymbol CB_LINK_HL_SUPPORT = makeSymbol("CB-LINK-HL-SUPPORT");

    private static final SubLString $str234$KB_HL_Support__S_Detail = makeString("KB HL Support ~S Detail");

    private static final SubLString $$$HL_Support_Detail = makeString("HL Support Detail");

    private static final SubLSymbol $CB_HL_SUPPORT = makeKeyword("CB-HL-SUPPORT");

    private static final SubLString $str237$cb_hl_support_html = makeString("cb-hl-support.html");

    private static final SubLSymbol $HL_SUPPORT_VALIDATE = makeKeyword("HL-SUPPORT-VALIDATE");

    private static final SubLString $str239$_Validate_ = makeString("[Validate]");

    private static final SubLSymbol $HL_SUPPORT_SIMILAR_QUERY = makeKeyword("HL-SUPPORT-SIMILAR-QUERY");

    private static final SubLString $str241$_Query_Similar_ = makeString("[Query Similar]");

    private static final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLString $str243$Module___ = makeString("Module : ");

    private static final SubLString $$$None_available = makeString("None available");

    private static final SubLString $$$Nothing_deeper_available = makeString("Nothing deeper available");

    private static final SubLString $str246$Computed_forward_mt_combos___ = makeString("Computed forward mt combos : ");



    private static final SubLString $str248$__This_HL_support_has_a_very_slow = makeString(" (This HL support has a very slow forward-mt-combos call of ~A seconds.)");

    private static final SubLString $str249$__This_HL_support_has_a_stale_mt_ = makeString(" (This HL support has a stale mt.)");

    private static final SubLString $str250$KB_HL_Support_argument___ = makeString("KB HL Support argument : ");

    private static final SubLString $str251$_A_KB_HL_Support_dependents___ = makeString("~A KB HL Support dependents : ");

    private static final SubLString $str252$cb_hl_validate__A__A = makeString("cb-hl-validate&~A&~A");

    private static final SubLSymbol CB_LINK_HL_SUPPORT_VALIDATE = makeSymbol("CB-LINK-HL-SUPPORT-VALIDATE");

    private static final SubLString $str254$The_hl_support_is_not_available_ = makeString("The hl-support is not available.");

    private static final SubLSymbol CB_HL_VALIDATE = makeSymbol("CB-HL-VALIDATE");

    private static final SubLString $str256$cb_hl_support_similar_query__A = makeString("cb-hl-support-similar-query&~A");

    private static final SubLSymbol CB_LINK_HL_SUPPORT_SIMILAR_QUERY = makeSymbol("CB-LINK-HL-SUPPORT-SIMILAR-QUERY");

    private static final SubLSymbol CB_HL_SUPPORT_SIMILAR_QUERY = makeSymbol("CB-HL-SUPPORT-SIMILAR-QUERY");

    private static final SubLString $str259$_A_does_not_specify_an_HL_clause_ = makeString("~A does not specify an HL clause-struc");

    private static final SubLSymbol CB_CLAUSE_STRUC = makeSymbol("CB-CLAUSE-STRUC");

    private static final SubLSymbol CLAUSE_STRUC_P = makeSymbol("CLAUSE-STRUC-P");

    private static final SubLString $str262$cb_clause_struc__A = makeString("cb-clause-struc&~A");

    private static final SubLString $str263$CLAUSE_STRUC___S = makeString("CLAUSE-STRUC #~S");

    private static final SubLSymbol CB_LINK_CLAUSE_STRUC = makeSymbol("CB-LINK-CLAUSE-STRUC");

    private static final SubLSymbol CB_FORM_CLAUSE_STRUC_METHOD = makeSymbol("CB-FORM-CLAUSE-STRUC-METHOD");

    private static final SubLSymbol $CB_CLAUSE_STRUC = makeKeyword("CB-CLAUSE-STRUC");

    private static final SubLString $str268$cb_clause_struc_html = makeString("cb-clause-struc.html");

    private static final SubLString $str269$Clause_Struc___S = makeString("Clause Struc #~S");

    private static final SubLString $str270$CNF_clause___ = makeString("CNF clause : ");

    private static final SubLString $str271$Assertions_using_this_clause___ = makeString("Assertions using this clause : ");

    private static final SubLString $str272$__ = makeString("((");

    private static final SubLString $str273$__ = makeString("))");

    private static final SubLString $str274$assertion_id = makeString("assertion-id");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLString $str276$sentence_type = makeString("sentence-type");

    private static final SubLString $$$question = makeString("question");

    private static final SubLString $str278$question_type = makeString("question-type");

    private static final SubLSymbol CB_PROCESS_SUGGESTED_ENGLISH = makeSymbol("CB-PROCESS-SUGGESTED-ENGLISH");

    // Definitions
    public static final SubLObject cb_find_assertion_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_assertion_browser.cb_find_assertion_internal($$$Find_Assertion, $str_alt1$cb_handle_find_assertion, UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    public static SubLObject cb_find_assertion(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_find_assertion_internal($$$Find_Assertion, $str1$cb_handle_find_assertion, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_find_assertion_internal_alt(SubLObject title_string, SubLObject handler, SubLObject sentence, SubLObject mt) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = title_string;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_script_utilities.html_simple_applet_input_definition_script();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt8$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject script = html_script_utilities.html_simple_applet_input_onsubmit_script(html_script_utilities.$default_sentence_input_simple_applets$.getGlobalValue());
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_indent(ONE_INTEGER);
                                            html_markup(script);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input(handler, NIL, UNPROVIDED);
                                                    cb_help_preamble($CB_FIND_ASSERTION, NIL, UNPROVIDED);
                                                    html_reset_input($$$Reset);
                                                    html_indent(ONE_INTEGER);
                                                    html_submit_input($$$Find_Assertion, UNPROVIDED, UNPROVIDED);
                                                    html_indent(ONE_INTEGER);
                                                    html_newline(UNPROVIDED);
                                                    cb_form_widgets.cb_mt_input_section(mt, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    cb_form_widgets.cb_el_sentence_input_section(sentence, $list_alt10);
                                                    html_newline(UNPROVIDED);
                                                    html_checkbox_input($str_alt11$use_genl_mts, $$$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_princ_strong($str_alt13$Additionally_search_genlMts_for_t);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_find_assertion_internal(final SubLObject title_string, final SubLObject handler, SubLObject sentence, SubLObject mt) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
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
                if (NIL != title_string) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_string);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                    html_markup($str13$yui_skin_sam);
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
                        if (NIL != title_string) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_string);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input(handler, T, UNPROVIDED);
                            cb_help_preamble($CB_FIND_ASSERTION, NIL, UNPROVIDED);
                            html_reset_input($$$Reset);
                            html_indent(ONE_INTEGER);
                            html_submit_input($$$Find_Assertion, UNPROVIDED, UNPROVIDED);
                            html_indent(ONE_INTEGER);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(sentence, $list20);
                            html_newline(UNPROVIDED);
                            html_checkbox_input($str21$use_genl_mts, $$$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ_strong($str23$Additionally_search_genlMts_for_t);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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

    public static final SubLObject cb_link_find_assertion_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Find_Assertion;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt15$cb_find_assertion);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_find_assertion(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Find_Assertion;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str25$cb_find_assertion);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_handle_find_assertion_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject error = com.cyc.cycjava.cycl.cb_assertion_browser.cb_extract_find_assertion_args(args);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject sentence = thread.thirdMultipleValue();
                SubLObject use_genl_mtsP = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error) {
                    return NIL;
                }
                thread.resetMultipleValues();
                {
                    SubLObject assertions = fi.sentence_assertions_in_mt(sentence, mt, use_genl_mtsP);
                    SubLObject all_presentP = thread.secondMultipleValue();
                    SubLObject czer_error = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != czer_error) {
                        return cb_error($str_alt20$Sentence_was_not_well_formed_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL == assertions) {
                            return cb_error($str_alt21$No_assertions_were_found_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if ((NIL != list_utilities.singletonP(assertions)) && (NIL != all_presentP)) {
                                return com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_internal(assertions.first());
                            } else {
                                {
                                    SubLObject title_var = $$$Find_Assertion;
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                        try {
                                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                                            html_macros.html_head_content_type();
                                            cb_head_shortcut_icon();
                                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                                            if (NIL != title_var) {
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                            }
                                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($str_alt8$yui_skin_sam);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (NIL != title_var) {
                                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                html_markup(TWO_INTEGER);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                html_princ(title_var);
                                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                html_markup(TWO_INTEGER);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                            }
                                                            html_princ_strong($str_alt22$Some_assertions_were_found__);
                                                            {
                                                                SubLObject cdolist_list_var = assertions;
                                                                SubLObject assertion = NIL;
                                                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_show_assertion_readably(assertion, T, T);
                                                                }
                                                            }
                                                            html_source_readability_terpri(UNPROVIDED);
                                                            html_copyright_notice();
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
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

    public static SubLObject cb_handle_find_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_find_assertion_args(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject use_genl_mtsP = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_assertions_cycl_in_mt(sentence, mt, use_genl_mtsP);
        final SubLObject all_presentP = thread.secondMultipleValue();
        final SubLObject czer_error = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != czer_error) {
            return cb_error($str30$Sentence_was_not_well_formed_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == assertions) {
            return cb_error($str31$No_assertions_were_found_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != list_utilities.singletonP(assertions)) && (NIL != all_presentP)) {
            return cb_assertion_internal(assertions.first());
        }
        final SubLObject title_var = $$$Find_Assertion;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
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
                        html_princ_strong($str32$Some_assertions_were_found__);
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_newline(TWO_INTEGER);
                            cb_show_assertion_readably(assertion, T, T);
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        } 
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_extract_find_assertion_args_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                SubLObject mt_error = thread.secondMultipleValue();
                SubLObject mt_error_string = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != mt_error) {
                    cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
                    return values(mt_error, NIL, NIL);
                }
                thread.resetMultipleValues();
                {
                    SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list_alt24);
                    SubLObject sentence_error = thread.secondMultipleValue();
                    SubLObject sentence_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != sentence_error) {
                        cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
                        return values(sentence_error, NIL, NIL);
                    }
                    {
                        SubLObject use_genl_mtsP = html_extract_input($str_alt11$use_genl_mts, args);
                        return values(NIL, mt, sentence, use_genl_mtsP);
                    }
                }
            }
        }
    }

    public static SubLObject cb_extract_find_assertion_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return values(mt_error, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list34);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
            return values(sentence_error, NIL, NIL);
        }
        final SubLObject use_genl_mtsP = html_extract_input($str21$use_genl_mts, args);
        return values(NIL, mt, sentence, use_genl_mtsP);
    }

    public static final SubLObject cb_find_similar_assertion_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject assertion_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            assertion_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = cb_guess_assertion(assertion_id);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        return cb_error($str_alt26$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject sentence = ke.ke_assertion_edit_formula(assertion);
                        return com.cyc.cycjava.cycl.cb_assertion_browser.cb_find_assertion_internal($$$Find_Similar_Assertion, $str_alt1$cb_handle_find_assertion, sentence, mt);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject cb_find_similar_assertion(final SubLObject args) {
        SubLObject assertion_id = NIL;
        destructuring_bind_must_consp(args, args, $list35);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list35);
            return NIL;
        }
        final SubLObject assertion = cb_guess_assertion(assertion_id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str36$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject sentence = ke.ke_assertion_edit_formula(assertion);
        return cb_find_assertion_internal($$$Find_Similar_Assertion, $str1$cb_handle_find_assertion, sentence, mt);
    }

    public static final SubLObject cb_link_find_similar_assertion_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL == linktext) {
                linktext = $str_alt30$_Find_Similar_;
            }
            {
                SubLObject id = assertion_handles.assertion_id(assertion);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt32$cb_find_similar_assertion__A, id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return assertion;
            }
        }
    }

    public static SubLObject cb_link_find_similar_assertion(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == linktext) {
            linktext = $str40$_Find_Similar_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str42$cb_find_similar_assertion__A, id);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static final SubLObject cb_assertion_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject assertion_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            assertion_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = cb_guess_assertion(assertion_id);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        return cb_error($str_alt26$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_internal(assertion);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject cb_assertion(final SubLObject args) {
        SubLObject assertion_id = NIL;
        destructuring_bind_must_consp(args, args, $list35);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject assertion = cb_guess_assertion(assertion_id);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                return cb_error($str36$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cb_assertion_internal(assertion);
        } else {
            cdestructuring_bind_error(args, $list35);
        }
        return NIL;
    }

    public static final SubLObject cb_af_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion(args);
    }

    public static SubLObject cb_af(final SubLObject args) {
        return cb_assertion(args);
    }

    public static final SubLObject cb_assertion_internal_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_tools.cb_add_to_assertion_history(assertion);
            {
                SubLObject id = assertion_handles.assertion_id(assertion);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt37$Cyc_Assertion___A, id);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        if (NIL != cb_browser.cb_public_assertionP(assertion)) {
                                            html_princ($str_alt38$Public_);
                                        }
                                        html_princ($str_alt39$Cyc_Assertion_);
                                        html_princ(id);
                                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        cb_assertion_editor.cb_assertion_toolbar(assertion);
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_info(assertion);
                                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_diagnostics(assertion);
                                        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($str_alt40$Meta_Assertions__);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_newline(TWO_INTEGER);
                                            cb_browser.cb_c_total_internal(assertion);
                                            if (kb_indexing.num_exception_rule_index(assertion, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_exception_rule_index(assertion);
                                            }
                                            if (kb_indexing.num_pragma_rule_index(assertion, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_pragma_rule_index(assertion);
                                            }
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_tools.cb_add_to_assertion_history(assertion);
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject publicP = NIL;
        final SubLObject title_var;
        final SubLObject title = title_var = cconcatenate(format_nil.format_nil_a_no_copy(NIL != publicP ? $$$Public_ : $str48$), new SubLObject[]{ $str49$Assertion__, format_nil.format_nil_a_no_copy(id) });
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        if (NIL != cb_tools.cb_bookmarks_supported_for_current_user()) {
                            cb_browser.cb_add_bookmark_term_link(assertion);
                        }
                        html_princ(title);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        html_script_utilities.cb_hoverover_page_init();
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_assertion_editor.cb_assertion_toolbar(assertion);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_assertion_info(assertion);
                            cb_assertion_diagnostics(assertion);
                            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                final SubLObject _prev_bind_0_$15 = $cb_assertion_for_the_assertion_sentence_replacement$.currentBinding(thread);
                                try {
                                    $cb_assertion_for_the_assertion_sentence_replacement$.bind(assertion, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str50$Meta_Assertions__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    cb_browser.cb_c_total_internal(assertion);
                                    if (kb_indexing.num_exception_rule_index(assertion, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        cb_show_exception_rule_index(assertion);
                                    }
                                    if (kb_indexing.num_pragma_rule_index(assertion, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        cb_show_pragma_rule_index(assertion);
                                    }
                                } finally {
                                    $cb_assertion_for_the_assertion_sentence_replacement$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                            cb_assertion_variable_info(assertion);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_info_alt(SubLObject assertion) {
        if ($UNKNOWN == assertions_high.assertion_truth(assertion)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str_alt42$Truth___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_truth($UNKNOWN);
        } else {
            {
                SubLObject strength = assertions_high.assertion_strength(assertion);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt43$Strength___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                cb_show_strength(strength);
            }
        }
        {
            SubLObject direction = assertions_high.assertion_direction(assertion);
            html_indent(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str_alt44$Direction___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_direction(direction);
        }
        {
            SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            html_indent(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_link($ARGUMENTS, assertion, $str_alt46$Arguments___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_princ(length(v_arguments));
        }
        {
            SubLObject dependents = assertions_high.assertion_dependents(assertion);
            html_indent(TWO_INTEGER);
            if (NIL != dependents) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_link($DEPENDENTS, assertion, $str_alt48$Dependents___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_princ(length(dependents));
            } else {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($$$No_Dependents);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        }
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            html_newline(UNPROVIDED);
            com.cyc.cycjava.cycl.cb_assertion_browser.cb_asserted_argument(assertion);
        }
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            html_newline(TWO_INTEGER);
            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_rule_info(assertion);
        } else {
            html_newline(UNPROVIDED);
        }
        com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_show_formula_variants(assertion);
        return NIL;
    }

    public static SubLObject cb_assertion_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNKNOWN == assertions_high.assertion_truth(assertion)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str53$Truth___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_truth($UNKNOWN);
        } else {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str54$Strength___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_strength(strength);
        }
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        html_indent(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str55$Direction___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_show_direction(direction);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        html_indent(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_link($ARGUMENTS, assertion, $$$Arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str58$___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_princ(length(v_arguments));
        html_indent(TWO_INTEGER);
        if (NIL == assertions_high.assertion_has_dependents_p(assertion)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($$$No_Dependents);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        } else {
            final SubLObject dependent_deduction_count = assertions_high.assertion_dependent_count(assertion);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_link($DEPENDENTS, assertion, $$$Dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_princ($str58$___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_princ(dependent_deduction_count);
            if (dependent_deduction_count.numL($cb_assertion_info_dependent_assertion_count_threshold$.getDynamicValue(thread))) {
                html_indent(UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject dependent_assertion_count = assertion_utilities.assertion_dependent_supported_object_counts(assertion);
                final SubLObject dependent_kb_hl_support_count = thread.secondMultipleValue();
                final SubLObject dependent_clause_struct_count = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject some_assertionsP = plusp(dependent_assertion_count);
                final SubLObject some_kb_hl_supportsP = plusp(dependent_kb_hl_support_count);
                html_princ($str62$_);
                if (NIL != some_assertionsP) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str63$_A_assertion_P, dependent_assertion_count, dependent_assertion_count);
                    if ((!dependent_clause_struct_count.isZero()) && (!dependent_assertion_count.eql(dependent_clause_struct_count))) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str64$___A_unique_sentences_, dependent_clause_struct_count);
                    }
                }
                if ((NIL != some_assertionsP) && (NIL != some_kb_hl_supportsP)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str65$__);
                }
                if (NIL != some_kb_hl_supportsP) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str66$_A_KB_HL_support_P, dependent_kb_hl_support_count, dependent_kb_hl_support_count);
                }
                html_princ($str67$_);
            }
        }
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            html_newline(UNPROVIDED);
            cb_asserted_argument(assertion);
        }
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            html_newline(TWO_INTEGER);
            cb_show_rule_info(assertion);
        } else {
            html_newline(UNPROVIDED);
        }
        cb_assertion_show_formula_variants(assertion);
        return NIL;
    }

    public static final SubLObject cb_show_rule_info_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_link($TRANSFORMATION_RULE_STATISTICS, $str_alt51$Backward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_query.cb_show_transformation_rule_statistics_for_rule(rule, $VERBOSE);
                                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && inference_analysis.transformation_rule_considered_count(rule).isPositive()) {
                                        html_indent(UNPROVIDED);
                                        cb_link($CLEAR_TRANSFORMATION_RULE_STATISTICS, rule, $str_alt55$_Clear_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    if ((NIL != assertions_high.forward_assertionP(rule)) && (NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue(thread))) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_link($RULE_FORWARD_INFERENCE_METRICS, rule, $str_alt57$Forward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_glyph($NBSP, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_query.cb_show_forward_inference_statistics_for_rule(rule);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_show_rule_info(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_link($TRANSFORMATION_RULE_STATISTICS, $str69$Backward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_query.cb_show_transformation_rule_statistics_for_rule(rule, $VERBOSE);
                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && inference_analysis.transformation_rule_considered_count(rule).isPositive()) {
                        html_indent(UNPROVIDED);
                        cb_link($CLEAR_TRANSFORMATION_RULE_STATISTICS, rule, $str73$_Clear_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if ((NIL != assertions_high.forward_assertionP(rule)) && (NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue(thread))) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_link($RULE_FORWARD_INFERENCE_METRICS, rule, $str76$Forward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_query.cb_show_forward_inference_statistics_for_rule(rule);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        final SubLObject self_looping = assertion_utilities.self_looping_ruleP(rule);
        final SubLObject self_expanding = assertion_utilities.self_expanding_ruleP(rule);
        if ((NIL != self_looping) || (NIL != self_expanding)) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str77$Rule_properties__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != self_looping) {
                            html_princ($str78$Self_Looping_);
                        }
                        if (NIL != self_expanding) {
                            html_princ($str79$Self_Expanding_);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_diagnostics_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL == cb_assertion_editor.assertion_modification_permittedP(assertion))) {
                html_newline(TWO_INTEGER);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_princ($str_alt58$Modification_of_this_Assertion_is);
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            if (NIL != $cb_a_perform_access_diagnostics$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_access_diagnostics(assertion);
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_diagnostics(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL == cb_assertion_editor.assertion_modification_permittedP(assertion))) {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_princ($str80$Modification_of_this_Assertion_is);
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        cb_assertion_exception_info(assertion);
        cb_assertion_doomed_info(assertion);
        cb_rule_assertion_analysis_info(assertion);
        if (NIL != $cb_a_perform_access_diagnostics$.getDynamicValue(thread)) {
            cb_assertion_access_diagnostics(assertion);
        }
        return NIL;
    }

    /**
     * Returns T iff ASSERTION won't recanonicalize to itself
     */
    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself")
    public static final SubLObject cb_canonicalizer_problemP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            thread.resetMultipleValues();
            {
                SubLObject el_formula = cb_assertion_el_formula(assertion, UNPROVIDED);
                SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(NIL == subl_promotions.memberP(assertion, fi.sentence_assertions(el_formula, el_mt), UNPROVIDED, UNPROVIDED));
            }
        }
    }

    /**
     * Returns T iff ASSERTION won't recanonicalize to itself
     */
    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself")
    public static SubLObject cb_canonicalizer_problemP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(cb_canonicalizer_problems(assertion));
    }

    public static SubLObject cb_canonicalizer_problems(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject el_formula = cb_assertion_el_formula(assertion, UNPROVIDED);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == wff.el_wffP(el_formula, el_mt, UNPROVIDED)) {
            result = cons(list($$$Assertion_not_well_formed, wff.explanation_of_why_not_wff(el_formula, el_mt, $list82)), result);
        }
        if (NIL == subl_promotions.memberP(assertion, fi.sentence_assertions(el_formula, el_mt), UNPROVIDED, UNPROVIDED)) {
            result = cons(list($str83$Assertion_is_either_miscanonicali), result);
            if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != czer_utilities.some_canonicalizer_directive_assertions_somewhereP(assertions_high.gaf_predicate(assertion)))) {
                result = cons(list(NIL, cconcatenate($str84$This_is_probably_due_to_a_canonic, new SubLObject[]{ format_nil.format_nil_s_no_copy(assertions_high.gaf_predicate(assertion)), $str85$_ })), result);
            }
            if (NIL != cycl_utilities.expression_find($$trueSentence, assertions_high.assertion_cnf(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                result = cons(list(NIL, $str87$This_is_probably_due_to_a___trueS), result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject cb_assertion_exception_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification = assertion_utilities.excepted_assertion_in_any_mtP(assertion, T, UNPROVIDED);
        if (NIL != justification) {
            html_newline(UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_princ($str88$Assertion_excepted_in_some_mts__);
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject _prev_bind_0 = $cb_assertion_for_the_assertion_sentence_replacement$.currentBinding(thread);
            try {
                $cb_assertion_for_the_assertion_sentence_replacement$.bind(assertion, thread);
                SubLObject cdolist_list_var = justification;
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_newline(UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    cb_show_assertion_readably(support, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            } finally {
                $cb_assertion_for_the_assertion_sentence_replacement$.rebind(_prev_bind_0, thread);
            }
            html_newline(TWO_INTEGER);
        }
        return justification;
    }

    public static SubLObject cb_assertion_doomed_info(final SubLObject assertion) {
        final SubLObject justification = assertion_utilities.doomed_assertionP(assertion, T, UNPROVIDED);
        if (NIL != justification) {
            html_newline(UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_princ($str89$Assertion_doomed_due_to__);
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_show_assertion_readably(support, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            html_newline(TWO_INTEGER);
        }
        return justification;
    }

    public static SubLObject cb_rule_assertion_analysis_info(final SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_access_diagnostics_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject some_problem = NIL;
                if (NIL != com.cyc.cycjava.cycl.cb_assertion_browser.cb_canonicalizer_problemP(assertion)) {
                    some_problem = T;
                    html_newline(TWO_INTEGER);
                    {
                        SubLObject color_val = $RED;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_princ($str_alt60$Assertion_Access_Problem__);
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_newline(UNPROVIDED);
                    html_princ($str_alt61$Assertion_is_either_miscanonicali);
                }
                {
                    SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    if (NIL == el_wffP(formula, mt, UNPROVIDED)) {
                        some_problem = T;
                        html_macros.verify_not_within_html_pre();
                        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                {
                                    SubLObject color_val = $RED;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != color_val) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(color_val));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_princ($str_alt62$Assertion_Not_Well_formed__);
                                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    explain_why_not_wff(formula, mt, html_macros.$html_stream$.getDynamicValue(thread));
                                }
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                    }
                }
                return some_problem;
            }
        }
    }

    public static SubLObject cb_assertion_access_diagnostics(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject problems = cdolist_list_var = cb_canonicalizer_problems(assertion);
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = problem;
            SubLObject description = NIL;
            SubLObject more_descriptions = NIL;
            destructuring_bind_must_consp(current, datum, $list90);
            description = current.first();
            current = more_descriptions = current.rest();
            if (description.isString()) {
                html_newline(UNPROVIDED);
                final SubLObject color_val = $RED;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_princ(description);
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject cdolist_list_var_$28 = more_descriptions;
            SubLObject more_description = NIL;
            more_description = cdolist_list_var_$28.first();
            while (NIL != cdolist_list_var_$28) {
                html_macros.verify_not_within_html_pre();
                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    html_princ(more_description);
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                more_description = cdolist_list_var_$28.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        } 
        return problems;
    }

    public static final SubLObject cb_assertion_show_formula_variants_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
                html_newline(UNPROVIDED);
                if (NIL != $cb_a_show_el_formula$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject el_formula = cb_assertion_el_formula(assertion, hl_formula);
                        SubLObject el_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula))) && (NIL != $cb_a_show_hl_formula$.getDynamicValue(thread))) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str_alt63$EL_and_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } else {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str_alt64$EL_Formula___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_browser.cb_c_mt_header(el_mt, NIL, NIL, NIL);
                            html_newline(UNPROVIDED);
                            cb_form_assertion_formula(assertion, el_formula, ZERO_INTEGER, T);
                            html_newline(TWO_INTEGER);
                        }
                    }
                }
                if (NIL != $cb_a_show_hl_formula$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt65$HL_Formula___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    cb_browser.cb_c_mt_header(assertions_high.assertion_mt(assertion), NIL, NIL, NIL);
                    html_newline(UNPROVIDED);
                    cb_form(assertion, ZERO_INTEGER, T);
                    html_newline(UNPROVIDED);
                }
                if ((NIL != $cb_a_show_english$.getDynamicValue(thread)) || (NIL != $show_assertions_in_english$.getDynamicValue(thread))) {
                    {
                        SubLObject _prev_bind_0 = $show_assertions_in_english$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                        try {
                            $show_assertions_in_english$.bind(T, thread);
                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str_alt66$English_Translation___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_show_assertion_readably(assertion, NIL, NIL);
                            html_indent(UNPROVIDED);
                            {
                                SubLObject subl_form_string = NIL;
                                SubLObject paraphrase = NIL;
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    format(stream, $str_alt67$_CB_SHOW_ASSERTION_READABLY__FIND, uncanonicalizer.assertion_el_formula(assertion), assertions_high.assertion_mt(assertion));
                                    subl_form_string = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject stream_18 = NIL;
                                    try {
                                        stream_18 = make_private_string_output_stream();
                                        {
                                            SubLObject _prev_bind_0_19 = html_macros.$html_stream$.currentBinding(thread);
                                            try {
                                                html_macros.$html_stream$.bind(stream_18, thread);
                                                cb_show_assertion_readably(assertion, NIL, NIL);
                                            } finally {
                                                html_macros.$html_stream$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                        paraphrase = get_output_stream_string(stream_18);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                close(stream_18, UNPROVIDED);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                    }
                                }
                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_paraphrase_bugzilla_link(assertion, pph_utilities.pph_remove_html_tags(paraphrase, UNPROVIDED), subl_form_string);
                            }
                            html_newline(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1_22 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt68$cb_process_suggested_english, T, UNPROVIDED);
                                        html_hidden_input($str_alt69$assertion_id, assertion_handles.assertion_id(assertion), UNPROVIDED);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_princ($str_alt70$Please_suggest_better_English_tra);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_newline(TWO_INTEGER);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt71$Sentence__);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_text_input($$$sentence, NIL, $int$80);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_radio_input($str_alt74$sentence_type, $COMMON, T);
                                                                html_indent(UNPROVIDED);
                                                                html_princ($$$commonly_used);
                                                                html_indent(TWO_INTEGER);
                                                                html_radio_input($str_alt74$sentence_type, $PRECISE, UNPROVIDED);
                                                                html_indent(UNPROVIDED);
                                                                html_princ($str_alt78$precise__Cyclish_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt79$Question__);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_text_input($$$question, NIL, $int$80);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_radio_input($str_alt81$question_type, $COMMON, T);
                                                                html_indent(UNPROVIDED);
                                                                html_princ($$$commonly_used);
                                                                html_indent(TWO_INTEGER);
                                                                html_radio_input($str_alt81$question_type, $PRECISE, UNPROVIDED);
                                                                html_indent(UNPROVIDED);
                                                                html_princ($str_alt78$precise__Cyclish_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        html_submit_input($$$Submit, $SUBMIT, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1_22, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        } finally {
                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_1, thread);
                            $show_assertions_in_english$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != rtp_madlibs.rtp_madlibs_formula_p(hl_formula, UNPROVIDED)) {
                        html_newline(UNPROVIDED);
                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_formula_madlibs(hl_formula);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_show_formula_variants(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
        SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
        try {
            html_cycl_string_printer.$html_large_string_limit$.bind(NIL, thread);
            html_newline(UNPROVIDED);
            if (NIL != $cb_a_show_el_formula$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject el_formula = cb_assertion_el_formula(assertion, hl_formula);
                final SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula))) && (NIL != $cb_a_show_hl_formula$.getDynamicValue(thread))) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$EL_and_);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str93$EL_Formula___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    cb_browser.cb_c_mt_header(el_mt, NIL, NIL, NIL);
                    html_newline(UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = $rule_unlabelled_dont_care_variables$.currentBinding(thread);
                    try {
                        $rule_unlabelled_dont_care_variables$.bind(NIL != assertions_high.rule_assertionP(assertion) ? rule_formula_unlabelled_dont_care_variables(el_formula) : NIL, thread);
                        if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
                            html_princ($str94$f__);
                        }
                        cb_form_assertion_formula(assertion, el_formula, ZERO_INTEGER, T, UNPROVIDED);
                        if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
                            html_princ($str95$__);
                        }
                    } finally {
                        $rule_unlabelled_dont_care_variables$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_newline(TWO_INTEGER);
                }
            }
            if (NIL != $cb_a_show_hl_formula$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str96$HL_Formula___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cb_browser.cb_c_mt_header(assertions_high.assertion_mt(assertion), NIL, NIL, NIL);
                html_newline(UNPROVIDED);
                if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_princ($str94$f__);
                }
                cb_form(assertion, ZERO_INTEGER, T);
                if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_princ($str97$__);
                }
                html_newline(UNPROVIDED);
            }
        } finally {
            html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != $cb_a_show_english$.getDynamicValue(thread)) || ($NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread))) {
            _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
            try {
                control_vars.$cb_major_presentation_language$.bind($NL, thread);
                pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str99$English_Translation___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cb_show_assertion_readably(assertion, NIL, NIL);
                html_newline(UNPROVIDED);
            } finally {
                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
                control_vars.$cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            if (NIL != rtp_madlibs.rtp_madlibs_formula_p(hl_formula, UNPROVIDED)) {
                html_newline(UNPROVIDED);
                cb_show_formula_madlibs(hl_formula);
            }
        }
        return NIL;
    }

    public static SubLObject rule_variable_arg_constraints_formula(final SubLObject rule_assertion) {
        final SubLObject hl_formula = assertions_high.assertion_formula(rule_assertion);
        final SubLObject mt = assertions_high.assertion_mt(rule_assertion);
        final SubLObject analysis_formula = make_conjunction(list(cycl_utilities.formula_arg1(hl_formula, UNPROVIDED), cycl_utilities.formula_arg2(hl_formula, UNPROVIDED)));
        final SubLObject constraints_dict = at_var_types.formula_variables_arg_constraints_dict(analysis_formula, mt, symbol_function(VARIABLE_P), UNPROVIDED);
        final SubLObject constraints_formula = constraint_formula_from_constraints_dict(constraints_dict, mt);
        return constraints_formula;
    }

    public static SubLObject constraint_formula_from_constraints_dict(final SubLObject dict, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = constraints;
            SubLObject isa_cols = NIL;
            SubLObject genls_cols = NIL;
            SubLObject qisa_cols = NIL;
            destructuring_bind_must_consp(current, datum, $list101);
            isa_cols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list101);
            genls_cols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list101);
            qisa_cols = current.first();
            current = current.rest();
            if (NIL == current) {
                isa_cols = genls.min_cols(isa_cols, mt, UNPROVIDED);
                qisa_cols = genls.min_cols(qisa_cols, mt, UNPROVIDED);
                genls_cols = genls.min_cols(genls_cols, mt, UNPROVIDED);
                SubLObject cdolist_list_var = isa_cols;
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(make_binary_formula($$isa, var, v_isa), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                } 
                cdolist_list_var = qisa_cols;
                SubLObject qisa = NIL;
                qisa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(make_binary_formula($$quotedIsa, var, qisa), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    qisa = cdolist_list_var.first();
                } 
                cdolist_list_var = genls_cols;
                SubLObject genl = NIL;
                genl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(make_binary_formula($$genls, var, genl), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    genl = cdolist_list_var.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list101);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.conjoin(nreverse(result), UNPROVIDED);
    }

    public static SubLObject cb_assertion_variable_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject formula = make_conjunction(list(cycl_utilities.formula_arg1(el_formula, UNPROVIDED), cycl_utilities.formula_arg2(el_formula, UNPROVIDED)));
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict(formula, mt, UNPROVIDED, UNPROVIDED);
            if (NIL == dictionary.dictionary_empty_p(variables_arg_constraints_dict)) {
                final SubLObject all_values = dictionary.dictionary_values(variables_arg_constraints_dict);
                final SubLObject some_genlsP = find_if(symbol_function(BOOLEAN), all_values, symbol_function(SECOND), UNPROVIDED, UNPROVIDED);
                final SubLObject some_qisaP = find_if(symbol_function(BOOLEAN), all_values, symbol_function(THIRD), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_hr(UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str108$Rule_Variable_Constraints__);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(THREE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_dark_grey$.getGlobalValue()) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_dark_grey$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$Variable);
                            html_glyph($NBSP, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_form($$isa, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (NIL != some_genlsP) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                cb_form($$genls, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        if (NIL != some_qisaP) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                cb_form($$quotedIsa, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject v_variables = list_utilities.remove_duplicates_preserving_order(nreverse(cycl_utilities.expression_gather(formula, $sym110$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                    SubLObject bgcolor = NIL;
                    SubLObject color_toggle = NIL;
                    SubLObject list_var = NIL;
                    SubLObject var = NIL;
                    SubLObject ignore_me = NIL;
                    list_var = v_variables;
                    var = list_var.first();
                    for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                        if (NIL != color_toggle) {
                            color_toggle = NIL;
                        } else {
                            color_toggle = T;
                        }
                        bgcolor = (NIL != color_toggle) ? $str111$_dddddd : $str112$_cccccc;
                        final SubLObject isa_genl_qisa = dictionary.dictionary_lookup(variables_arg_constraints_dict, var, UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(bgcolor);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ(var);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = assertion_variable_info_cols(isa_genl_qisa.first(), mt);
                                SubLObject col = NIL;
                                col = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_glyph($NBSP, UNPROVIDED);
                                    cb_form(col, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    col = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            if (NIL != some_genlsP) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = assertion_variable_info_cols(second(isa_genl_qisa), mt);
                                    SubLObject col = NIL;
                                    col = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        html_glyph($NBSP, UNPROVIDED);
                                        cb_form(col, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        col = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            if (NIL != some_qisaP) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = assertion_variable_info_cols(third(isa_genl_qisa), mt);
                                    SubLObject col = NIL;
                                    col = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        html_glyph($NBSP, UNPROVIDED);
                                        cb_form(col, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        col = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject assertion_variable_info_cols(final SubLObject cols, final SubLObject mt) {
        return remove($$Thing, genls.min_cols(cols, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_show_formula_madlibs_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(sentence, UNPROVIDED);
                SubLObject query_modeP = genl_predicates.genl_predicateP(predicate, $$queryTemplate_Reln, UNPROVIDED, UNPROVIDED);
                SubLObject madlibs = rtp_madlibs.rtp_generate_madlibs(sentence, SIX_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                if (NIL != set.non_empty_set_p(madlibs)) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt92$____which_ought_to_parse_any_of__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    {
                        SubLObject set_contents_var = set.do_set_internal(madlibs);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject madlib = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, madlib)) {
                                    {
                                        SubLObject datum = madlib;
                                        SubLObject current = datum;
                                        SubLObject syntax = NIL;
                                        SubLObject semantics = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt93);
                                        syntax = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt93);
                                        semantics = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != query_modeP) {
                                                cb_show_question_in_nl(syntax, UNPROVIDED);
                                            } else {
                                                cb_show_sentence_in_nl(syntax, UNPROVIDED);
                                            }
                                            html_newline(UNPROVIDED);
                                            html_indent(SIX_INTEGER);
                                            cb_form(semantics, TWO_INTEGER, NIL);
                                            html_newline(UNPROVIDED);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt93);
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

    public static SubLObject cb_show_formula_madlibs(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = literal_predicate(sentence, UNPROVIDED);
        final SubLObject query_modeP = genl_predicates.genl_predicateP(predicate, $$queryTemplate_Reln, UNPROVIDED, UNPROVIDED);
        final SubLObject madlibs = rtp_madlibs.rtp_generate_madlibs(sentence, SIX_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        if (NIL != set.non_empty_set_p(madlibs)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str115$____which_ought_to_parse_any_of__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(madlibs);
            SubLObject basis_object;
            SubLObject state;
            SubLObject madlib;
            SubLObject current;
            SubLObject datum;
            SubLObject syntax;
            SubLObject semantics;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                madlib = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, madlib)) {
                    datum = current = madlib;
                    syntax = NIL;
                    semantics = NIL;
                    destructuring_bind_must_consp(current, datum, $list116);
                    syntax = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list116);
                    semantics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != query_modeP) {
                            cb_show_question_in_nl(syntax, UNPROVIDED);
                        } else {
                            cb_show_sentence_in_nl(syntax, UNPROVIDED);
                        }
                        html_newline(UNPROVIDED);
                        html_indent(SIX_INTEGER);
                        cb_form(semantics, TWO_INTEGER, NIL);
                        html_newline(UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list116);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_show_exception_rule_index_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    {
                        SubLObject reuseP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_36 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    {
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_37 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                {
                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    {
                                                        SubLObject _prev_bind_0_38 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                Errors.error($str_alt94$Invalid_attempt_to_reuse_memoizat);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_39 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = $assertion_filter_hook$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                                                            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                            html_princ($str_alt95$Exceptions__);
                                                                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_newline(UNPROVIDED);
                                                                            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_exception_rule_rec(rule);
                                                                        } finally {
                                                                            $assertion_filter_hook$.rebind(_prev_bind_1, thread);
                                                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_39, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_38, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_36, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                }
                            }
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_exception_rule_index(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$40 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$41 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$42 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$43 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$44 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                        $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_princ($str118$Exceptions__);
                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        cb_show_exception_rule_rec(rule);
                                    } finally {
                                        $assertion_filter_hook$.rebind(_prev_bind_3, thread);
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$44, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$43, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$42, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$41, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$40, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_show_exception_rule_rec_alt(SubLObject rule) {
        {
            SubLObject mts = kb_indexing.key_exception_rule_index(rule, UNPROVIDED);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_exception_rule_rec_mt(rule, mt);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_exception_rule_rec(final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_indexing.key_exception_rule_index(rule, UNPROVIDED);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_show_exception_rule_rec_mt(rule, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_show_exception_rule_rec_mt_alt(SubLObject rule, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_browser.cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? ((SubLObject) (symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY))) : symbol_function(CB_ASSERTION_LINK);
                {
                    SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
                    try {
                        $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
                        $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
                        kb_mapping.map_exception_rule_index(assertion_link_fn, rule, NIL, mt);
                    } finally {
                        $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1, thread);
                        $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_exception_rule_rec_mt(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
        final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
        try {
            $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
            $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
            kb_mapping.map_exception_rule_index(assertion_link_fn, rule, NIL, mt);
        } finally {
            $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
            $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_show_pragma_rule_index_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    {
                        SubLObject reuseP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_42 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    {
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_43 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                {
                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    {
                                                        SubLObject _prev_bind_0_44 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                Errors.error($str_alt94$Invalid_attempt_to_reuse_memoizat);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_45 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = $assertion_filter_hook$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                                                            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                            html_princ($str_alt101$Pragmatic_Requirements__);
                                                                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_newline(UNPROVIDED);
                                                                            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_pragma_rule_rec(rule);
                                                                        } finally {
                                                                            $assertion_filter_hook$.rebind(_prev_bind_1, thread);
                                                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_45, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_44, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                }
                            }
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_pragma_rule_index(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$47 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$48 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$49 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$50 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$51 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                        $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_princ($str124$Pragmatic_Requirements__);
                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        cb_show_pragma_rule_rec(rule);
                                    } finally {
                                        $assertion_filter_hook$.rebind(_prev_bind_3, thread);
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$51, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$49, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$48, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$47, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_show_pragma_rule_rec_alt(SubLObject rule) {
        {
            SubLObject mts = kb_indexing.key_pragma_rule_index(rule, UNPROVIDED);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_pragma_rule_rec_mt(rule, mt);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_pragma_rule_rec(final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_indexing.key_pragma_rule_index(rule, UNPROVIDED);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_show_pragma_rule_rec_mt(rule, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_show_pragma_rule_rec_mt_alt(SubLObject rule, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_browser.cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? ((SubLObject) (symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY))) : symbol_function(CB_ASSERTION_LINK);
                {
                    SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
                    try {
                        $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
                        $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
                        kb_mapping.map_pragma_rule_index(assertion_link_fn, rule, NIL, mt);
                    } finally {
                        $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1, thread);
                        $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_pragma_rule_rec_mt(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
        final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
        try {
            $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
            $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
            kb_mapping.map_pragma_rule_index(assertion_link_fn, rule, NIL, mt);
        } finally {
            $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
            $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_with_show_english_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cb_a_show_english$.currentBinding(thread);
                try {
                    $cb_a_show_english$.bind(T, thread);
                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion(args);
                } finally {
                    $cb_a_show_english$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_with_show_english(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_a_show_english$.currentBinding(thread);
        try {
            $cb_a_show_english$.bind(T, thread);
            cb_assertion(args);
        } finally {
            $cb_a_show_english$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Provides a link to cb-assertion-with-show-english.
     */
    @LispMethod(comment = "Provides a link to cb-assertion-with-show-english.")
    public static final SubLObject cb_link_show_english_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt103$_Show_English_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt104$cb_assertion_with_show_english__a, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return assertion;
        }
    }

    /**
     * Provides a link to cb-assertion-with-show-english.
     */
    @LispMethod(comment = "Provides a link to cb-assertion-with-show-english.")
    public static SubLObject cb_link_show_english(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str126$_Show_English_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str127$cb_assertion_with_show_english__a, assertion_handles.assertion_id(assertion));
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static final SubLObject cb_assertion_with_show_el_formula_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cb_a_show_el_formula$.currentBinding(thread);
                try {
                    $cb_a_show_el_formula$.bind(T, thread);
                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion(args);
                } finally {
                    $cb_a_show_el_formula$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_with_show_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_a_show_el_formula$.currentBinding(thread);
        try {
            $cb_a_show_el_formula$.bind(T, thread);
            cb_assertion(args);
        } finally {
            $cb_a_show_el_formula$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Provides a link to cb-assertion-with-el-formula.
     */
    @LispMethod(comment = "Provides a link to cb-assertion-with-el-formula.")
    public static final SubLObject cb_link_show_el_formula_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt108$_EL_Formula_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$cb_assertion_with_show_el_formula, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return assertion;
        }
    }

    /**
     * Provides a link to cb-assertion-with-el-formula.
     */
    @LispMethod(comment = "Provides a link to cb-assertion-with-el-formula.")
    public static SubLObject cb_link_show_el_formula(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str131$_EL_Formula_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str132$cb_assertion_with_show_el_formula, assertion_handles.assertion_id(assertion));
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    /**
     * Display all the arguments for an assertion
     */
    @LispMethod(comment = "Display all the arguments for an assertion")
    public static final SubLObject cb_arguments_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt142$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                {
                    SubLObject title = format(NIL, $str_alt143$Arguments_for_Assertion___S, assertion_handles.assertion_id(assertion));
                    SubLObject title_var = title;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_head_shortcut_icon();
                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ(title_var);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_85 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt8$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_help_preamble($CB_ARGUMENTS, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt144$Assertion___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_internal(assertion, NIL);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_85, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Display all the arguments for an assertion")
    public static SubLObject cb_arguments(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str138$Arguments_for_Assertion___S, assertion_handles.assertion_id(assertion));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$54 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$55 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_ARGUMENTS, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str139$Assertion___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_justify_internal(assertion, NIL);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$54, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Display all the arguments for an assertion
     */


    public static final SubLObject cb_link_arguments_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt146$cb_arguments__A, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_princ(linktext);
                        } else {
                            html_princ(length(assertions_high.assertion_arguments(assertion)));
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_arguments(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str141$cb_arguments__A, assertion_handles.assertion_id(assertion));
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                html_princ(length(assertions_high.assertion_arguments(assertion)));
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Display all the dependents for an assertion
     */
    @LispMethod(comment = "Display all the dependents for an assertion")
    public static final SubLObject cb_dependents_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt142$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                {
                    SubLObject title = format(NIL, $str_alt150$Dependents_for_Assertion___S, assertion_handles.assertion_id(assertion));
                    SubLObject title_var = title;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_head_shortcut_icon();
                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ(title_var);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_88 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt8$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_help_preamble($CB_DEPENDENTS, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt144$Assertion___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), T);
                                                    {
                                                        SubLObject deductions = assertions_high.assertion_dependents(assertion);
                                                        SubLObject total = length(deductions);
                                                        SubLObject index = ZERO_INTEGER;
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        if (total.numG(ONE_INTEGER)) {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt151$_A_Arguments_Deduced_using_Assert, total);
                                                        } else {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt152$Argument_Deduced_using_Assertion_, total);
                                                        }
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        {
                                                            SubLObject cdolist_list_var = deductions;
                                                            SubLObject deduction = NIL;
                                                            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject assertion_91 = deductions_high.deduction_assertion(deduction);
                                                                    index = add(index, ONE_INTEGER);
                                                                    html_newline(TWO_INTEGER);
                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt153$_A__, index);
                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_indent(UNPROVIDED);
                                                                    cb_link($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt155$_supporting__);
                                                                    html_newline(UNPROVIDED);
                                                                    if (NIL != assertion_handles.assertion_p(assertion_91)) {
                                                                        cb_show_assertion_readably(assertion_91, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_support(assertion_91, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_88, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Display all the dependents for an assertion")
    public static SubLObject cb_dependents(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject deductions = assertions_high.assertion_dependent_list(assertion);
        final SubLObject deduction_count = length(deductions);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), deduction_count);
        final SubLObject title = format(NIL, $str145$Dependents_for_Assertion___S, assertion_handles.assertion_id(assertion));
        SubLObject cdolist_list_var = deductions;
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_push(v_dictionary, deductions_high.deduction_assertion(deduction), deduction);
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$59 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$60 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_DEPENDENTS, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str139$Assertion___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), T);
                            final SubLObject assertion_count = dictionary.dictionary_length(v_dictionary);
                            SubLObject index = ZERO_INTEGER;
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            if (assertion_count.numG(ONE_INTEGER)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str146$_A_Assertions_Deduced_using_Asser, assertion_count);
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str147$Assertion_Deduced_using_Assertion, assertion_count);
                            }
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject dependent_assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject deductions_$64 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                index = add(index, ONE_INTEGER);
                                html_newline(TWO_INTEGER);
                                if (NIL != assertion_handles.assertion_p(dependent_assertion)) {
                                    cb_show_assertion_readably(dependent_assertion, UNPROVIDED, UNPROVIDED);
                                } else {
                                    cb_show_support(dependent_assertion, UNPROVIDED);
                                }
                                html_newline(UNPROVIDED);
                                html_indent(THREE_INTEGER);
                                html_princ($str148$Supports___);
                                SubLObject cdolist_list_var2 = deductions_$64;
                                SubLObject deduction2 = NIL;
                                deduction2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    html_indent(UNPROVIDED);
                                    final SubLObject id = deduction_handles.deduction_id(deduction2);
                                    final SubLObject linktext = cconcatenate($str149$_Deduction_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str150$_ });
                                    cb_link($DEDUCTION, deduction2, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    deduction2 = cdolist_list_var2.first();
                                } 
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$60, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$59, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Display all the dependents for an assertion
     */


    public static final SubLObject cb_link_dependents_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt157$cb_dependents__A, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_princ(linktext);
                        } else {
                            html_princ(length(assertions_high.assertion_dependents(assertion)));
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_dependents(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str153$cb_dependents__A, assertion_handles.assertion_id(assertion));
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                html_princ(assertions_high.assertion_dependent_count(assertion));
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_assertion_dependencies(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_assertion_dependencies_internal(assertion);
    }

    public static SubLObject cb_link_assertion_dependencies(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == linktext) {
            linktext = $str156$_Dependencies_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str157$cb_assertion_dependencies__A, id);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static SubLObject cb_assertion_dependencies_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Assertion_Dependencies;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
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
                        cb_assertion_dependencies_section(assertion);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$65, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_assertion_dependencies_section(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dependent_assertions = assertions_interface.all_dependent_assertions(assertion);
        final SubLObject count = number_utilities.f_1_(length(dependent_assertions));
        cb_show_assertion_readably(assertion, T, T);
        html_newline(TWO_INTEGER);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str161$_S_dependent_assertion_A, count, NIL != number_utilities.onep(count) ? $str48$ : $str162$s__in_order);
        html_indent(FOUR_INTEGER);
        cb_link($ASSERTION_DEPENDENCIES, assertion, $str163$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        SubLObject cdolist_list_var = dependent_assertions;
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == kb_utilities.kbeq(dependent, assertion)) {
                html_newline(UNPROVIDED);
                cb_show_assertion_readably(dependent, T, T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        return count;
    }

    /**
     * Display a single argument for an assertion
     */
    @LispMethod(comment = "Display a single argument for an assertion")
    public static final SubLObject cb_deduction_alt(SubLObject args) {
        {
            SubLObject deduction = cb_guess_deduction(args);
            if (NIL == deduction_p(deduction)) {
                cb_error($str_alt159$_A_does_not_specify_an_argument, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_deduction_internal(deduction);
        }
    }

    /**
     * Display a single argument for an assertion
     */
    @LispMethod(comment = "Display a single argument for an assertion")
    public static SubLObject cb_deduction(final SubLObject args) {
        final SubLObject deduction = cb_guess_deduction(args);
        if (NIL == deduction_handles.deduction_p(deduction)) {
            cb_error($str164$_A_does_not_specify_an_argument, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_deduction_internal(deduction);
    }/**
     * Display a single argument for an assertion
     */


    public static SubLObject cb_deduction_id_url(final SubLObject v_object) {
        if (NIL != subl_promotions.non_negative_integer_p(v_object)) {
            return format(NIL, $cb_deduction_id_url_pattern$.getGlobalValue(), v_object);
        }
        if (NIL != deduction_handles.deduction_p(v_object)) {
            return cb_deduction_id_url(deduction_handles.deduction_id(v_object));
        }
        Errors.error($str167$Dont_know_how_to_convert__A_into_, v_object);
        return NIL;
    }

    public static final SubLObject cb_link_deduction_alt(SubLObject deduction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            {
                SubLObject id = deduction_id(deduction);
                cb_adornments.handle_adornments($DEDUCTION, $MAIN, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt162$cb_deduction__A, id);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != linktext) {
                                html_princ(linktext);
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt163$Deduction___A, id);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
            }
            return deduction;
        }
    }

    public static SubLObject cb_link_deduction(final SubLObject deduction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject id = deduction_handles.deduction_id(deduction);
        cb_adornments.handle_adornments($DEDUCTION, $MAIN, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $cb_deduction_id_url_pattern$.getGlobalValue(), id);
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str169$Deduction___A, id);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return deduction;
    }

    public static final SubLObject cb_link_deduction_struct_alt(SubLObject deduction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            {
                SubLObject id = deduction_id(deduction);
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt162$cb_deduction__A, id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_princ(linktext);
                        } else {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            if (id.isInteger()) {
                                html_princ($str_alt165$__);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt166$DEDUCTION___A, id);
                                html_princ($str_alt167$_);
                            } else {
                                html_princ($str_alt168$__DEDUCTION___);
                            }
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return deduction;
        }
    }

    public static SubLObject cb_link_deduction_struct(final SubLObject deduction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $cb_deduction_id_url_pattern$.getGlobalValue(), id);
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (id.isInteger()) {
                    html_princ($str171$__);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str172$DEDUCTION___A, id);
                    html_princ($str173$_);
                } else {
                    html_princ($str174$__DEDUCTION___);
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return deduction;
    }

    public static final SubLObject cb_form_deduction_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($DEDUCTION_STRUCT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_form_deduction_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($DEDUCTION_STRUCT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * modelled on @xref cb-hl-support-internal
     */
    @LispMethod(comment = "modelled on @xref cb-hl-support-internal")
    public static final SubLObject cb_deduction_internal_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Deduced_Argument_detail);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_deduction_toolbar(deduction);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_deduction_info(deduction);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_deduction_supports(deduction);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                }
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return deduction;
        }
    }

    /**
     * modelled on @xref cb-hl-support-internal
     */
    @LispMethod(comment = "modelled on @xref cb-hl-support-internal")
    public static SubLObject cb_deduction_internal(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str8$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Deduced_Argument_detail);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_deduction_toolbar(deduction);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_deduction_info(deduction);
                        cb_deduction_supports(deduction);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$69, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return deduction;
    }/**
     * modelled on @xref cb-hl-support-internal
     */


    /**
     * modelled on @xref cb-assertion-toolbar
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-toolbar")
    public static final SubLObject cb_deduction_toolbar_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != deduction_p(deduction)) {
                {
                    SubLObject id = deduction_id(deduction);
                    SubLObject title = format(NIL, $str_alt175$Deduced_Argument___S, id);
                    cb_help_preamble($CB_SOURCE, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(title);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_indent(TWO_INTEGER);
                    cb_link($DEDUCTION, deduction, $str_alt176$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                        html_newline(UNPROVIDED);
                        cb_link($REMOVE_DEDUCTION, deduction, $str_alt178$_Remove_Deduction_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * modelled on @xref cb-assertion-toolbar
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-toolbar")
    public static SubLObject cb_deduction_toolbar(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != deduction_handles.deduction_p(deduction)) {
            final SubLObject id = deduction_handles.deduction_id(deduction);
            final SubLObject title = format(NIL, $str181$Deduced_Argument___S, id);
            cb_help_preamble($CB_SOURCE, UNPROVIDED, UNPROVIDED);
            cb_goto_previous_deduction_control(deduction);
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_indent(UNPROVIDED);
            cb_goto_next_deduction_control(deduction);
            html_indent(TWO_INTEGER);
            cb_link($DEDUCTION, deduction, $str163$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                html_newline(UNPROVIDED);
                cb_link($REMOVE_DEDUCTION, deduction, $str183$_Remove_Deduction_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }/**
     * modelled on @xref cb-assertion-toolbar
     */


    public static SubLObject cb_goto_previous_deduction_control(final SubLObject deduction) {
        final SubLObject prev_d = kb_utilities.previous_deduction(deduction);
        if (NIL != deduction_handles.deduction_p(prev_d)) {
            cb_left_arrow(cb_deduction_id_url(prev_d), $$$Previous, UNPROVIDED);
        } else {
            cb_inactive_left_arrow();
        }
        return deduction;
    }

    public static SubLObject cb_goto_next_deduction_control(final SubLObject deduction) {
        final SubLObject next_d = kb_utilities.next_deduction(deduction);
        if (NIL != deduction_handles.deduction_p(next_d)) {
            cb_right_arrow(cb_deduction_id_url(next_d), $$$Next, UNPROVIDED);
        } else {
            cb_inactive_right_arrow();
        }
        return deduction;
    }

    /**
     * modelled on @xref cb-hl-support-info
     */
    @LispMethod(comment = "modelled on @xref cb-hl-support-info")
    public static final SubLObject cb_deduction_info_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = deductions_high.deduction_assertion(deduction);
                SubLObject truth = arguments.argument_truth(deduction);
                if ($UNKNOWN != truth) {
                    {
                        SubLObject strength = arguments.argument_strength(deduction);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str_alt43$Strength___);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_show_strength(strength);
                        html_indent(TWO_INTEGER);
                    }
                }
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt42$Truth___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                cb_show_truth(truth);
                html_indent(TWO_INTEGER);
                if (NIL != arguments.valid_supportP(assertion, UNPROVIDED)) {
                    if (!truth.equal(arguments.support_truth(assertion))) {
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        {
                            SubLObject color_val = $RED;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Argument_was_Overruled);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                    }
                    html_newline(TWO_INTEGER);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt180$Conclusion__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    {
                        SubLObject mt = arguments.support_mt(assertion);
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str_alt181$Mt___);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_form(mt, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_show_formula_variants(assertion);
                    } else {
                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_show_formula_variants(assertion);
                    }
                } else {
                    html_newline(TWO_INTEGER);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt182$Supported_conclusion_is_invalid_);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * modelled on @xref cb-hl-support-info
     */
    @LispMethod(comment = "modelled on @xref cb-hl-support-info")
    public static SubLObject cb_deduction_info(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        final SubLObject truth = arguments.argument_truth(deduction);
        if ($UNKNOWN != truth) {
            final SubLObject strength = arguments.argument_strength(deduction);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str54$Strength___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_strength(strength);
            html_indent(TWO_INTEGER);
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str53$Truth___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_show_truth(truth);
        html_indent(TWO_INTEGER);
        if (NIL != arguments.valid_supportP(supported_object, UNPROVIDED)) {
            if (!truth.equal(arguments.support_truth(supported_object))) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                final SubLObject color_val = $RED;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Argument_was_Overruled);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_indent(TWO_INTEGER);
            }
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str187$Conclusion__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject mt = arguments.support_mt(supported_object);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str188$Mt___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(supported_object)) {
                cb_assertion_show_formula_variants(supported_object);
            } else {
                cb_hl_support_show_formula_variants(supported_object);
            }
        } else {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str189$Supported_conclusion_is_invalid_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        return NIL;
    }/**
     * modelled on @xref cb-hl-support-info
     */


    public static final SubLObject cb_deduction_supports_alt(SubLObject deduction) {
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str_alt183$Justification___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        {
            SubLObject supports = deductions_high.deduction_supports(deduction);
            html_newline(UNPROVIDED);
            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_justification_readably(supports, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_deduction_supports(final SubLObject deduction) {
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str190$Justification___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        html_newline(UNPROVIDED);
        cb_show_justification_readably(supports, UNPROVIDED);
        final SubLObject assertion_dictionary = assertion_utilities.deduction_asserted_assertion_supports(deduction, UNPROVIDED);
        SubLObject assertion_mts = NIL;
        SubLObject latest_assertion_date = NIL;
        SubLObject sorted_assertions = NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_dictionary, $sym192$_);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject a = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list191);
            a = current.first();
            current = count = current.rest();
            final SubLObject date = assertions_high.asserted_when(a);
            if ((NIL != date) && ((NIL == latest_assertion_date) || date.numG(latest_assertion_date))) {
                latest_assertion_date = date;
            }
            final SubLObject item_var = assertions_high.assertion_mt(a);
            if (NIL == member(item_var, assertion_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                assertion_mts = cons(item_var, assertion_mts);
            }
            sorted_assertions = cons(a, sorted_assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        html_newline(UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str193$Date_of_most_recent_supporting_as);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_princ(latest_assertion_date);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str194$Supporting_asserted_assertions___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cdolist_list_var = sorted_assertions;
        SubLObject a2 = NIL;
        a2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ(dictionary.dictionary_lookup(assertion_dictionary, a2, UNPROVIDED));
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_indent(UNPROVIDED);
            cb_show_assertion_readably(a2, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            a2 = cdolist_list_var.first();
        } 
        final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(deduction);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Supports);
        if (NIL != pragmatic_support_mts) {
            html_princ($$$_and_pragmatic_supports);
        }
        html_princ($str197$_max_floor_mts___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(append(pragmatic_support_mts, Mapping.mapcar(SUPPORT_MT, deductions_high.deduction_supports(deduction))), UNPROVIDED, UNPROVIDED);
        SubLObject mt = NIL;
        mt = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            html_newline(UNPROVIDED);
            html_indent(UNPROVIDED);
            html_glyph($BULL, UNPROVIDED);
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt = cdolist_list_var2.first();
        } 
        final SubLObject v_bindings = deductions_high.deduction_bindings(deduction);
        if (NIL != v_bindings) {
            final SubLObject rule = find_if($sym200$RULE_ASSERTION_, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str201$Bound_rule_justification___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject rule_bindings = bindings.apply_bindings_backwards(inference_worker_transformation.rule_assertion_base_variable_map(rule), v_bindings);
            final SubLObject rule_bound_el_formula = bindings.apply_bindings(rule_bindings, uncanonicalizer.assertion_el_formula(rule));
            html_newline(UNPROVIDED);
            cb_form(rule_bound_el_formula, ZERO_INTEGER, T);
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Display a full justification for an assertion
     */
    @LispMethod(comment = "Display a full justification for an assertion")
    public static final SubLObject cb_justify_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt142$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL == $cb_justify_table$.getDynamicValue(thread)) {
                    $cb_justify_table$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
                }
                clrhash($cb_justify_table$.getDynamicValue(thread));
                sethash(assertion, $cb_justify_table$.getDynamicValue(thread), T);
                {
                    SubLObject title = format(NIL, $str_alt188$Full_justification_for_Assertion_, assertion_handles.assertion_id(assertion));
                    SubLObject title_var = title;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_head_shortcut_icon();
                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ(title_var);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_94 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt8$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_help_preamble($CB_JUSTIFY, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt189$Assertion_Supported__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_internal(assertion, T);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_94, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Display a full justification for an assertion
     */
    @LispMethod(comment = "Display a full justification for an assertion")
    public static SubLObject cb_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL == $cb_justify_table$.getDynamicValue(thread)) {
            $cb_justify_table$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
        }
        clrhash($cb_justify_table$.getDynamicValue(thread));
        sethash(assertion, $cb_justify_table$.getDynamicValue(thread), T);
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str206$Full_justification_for_Assertion_, assertion_handles.assertion_id(assertion));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$73 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_JUSTIFY, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str207$Assertion_Supported__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_justify_internal(assertion, T);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$73, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$72, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Display a full justification for an assertion
     */


    public static final SubLObject cb_link_justify_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt191$_Justify_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt192$cb_justify__A, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return assertion;
        }
    }

    public static SubLObject cb_link_justify(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str209$_Justify_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str210$cb_justify__A, assertion_handles.assertion_id(assertion));
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static final SubLObject cb_justify_internal_alt(SubLObject assertion, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), T);
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (NIL != recurse) {
                html_princ($str_alt195$Complete_Justification_for_Assert);
            } else {
                html_princ($str_alt196$Arguments_Supporting_Assertion__);
            }
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            {
                SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
                if (NIL != asserted_argument) {
                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_asserted_argument(assertion);
                    html_newline(UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = v_arguments;
                    SubLObject argument = NIL;
                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                        if (!argument.eql(asserted_argument)) {
                            if (argument != v_arguments.first()) {
                                html_newline(UNPROVIDED);
                            }
                            com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_deduction(argument, recurse);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_justify_internal(final SubLObject assertion, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), T);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (NIL != recurse) {
            html_princ($str213$Complete_Justification_for_Assert);
        } else {
            html_princ($str214$Arguments_Supporting_Assertion__);
        }
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
        if (NIL != asserted_argument) {
            cb_asserted_argument(assertion);
            html_newline(UNPROVIDED);
        }
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!argument.eql(asserted_argument)) {
                if (!argument.eql(v_arguments.first())) {
                    html_newline(UNPROVIDED);
                }
                cb_justify_deduction(argument, recurse);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_justify_deduction_alt(SubLObject deduction, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        html_princ($str_alt197$Argument___);
        cb_link($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        {
            SubLObject supports = deductions_high.deduction_supports(deduction);
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_support(support, recurse);
                html_newline(UNPROVIDED);
            }
        }
        return deduction;
    }

    public static SubLObject cb_justify_deduction(final SubLObject deduction, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        html_princ($str215$Argument___);
        cb_link($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_justify_support(support, recurse);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return deduction;
    }

    public static final SubLObject cb_justify_support_alt(SubLObject support, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_support(support, UNPROVIDED);
            if ((NIL != recurse) && (NIL != assertion_handles.assertion_p(support))) {
                if (NIL != gethash(support, $cb_justify_table$.getDynamicValue(thread), UNPROVIDED)) {
                    if (NIL == assertions_high.asserted_assertionP(support)) {
                        html_newline(UNPROVIDED);
                        html_princ($$$Justified_Above);
                    }
                } else {
                    sethash(support, $cb_justify_table$.getDynamicValue(thread), T);
                    {
                        SubLObject v_arguments = assertions_high.assertion_arguments(support);
                        SubLObject asserted_argument = assertions_high.get_asserted_argument(support);
                        if (NIL != list_utilities.singletonP(v_arguments)) {
                            if (NIL == asserted_argument) {
                                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$disc);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_deduction(v_arguments.first(), UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                        } else {
                            html_markup(html_macros.$html_ordered_list_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != asserted_argument) {
                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$1);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_asserted_argument(support);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                    {
                                        SubLObject cdolist_list_var = v_arguments;
                                        SubLObject argument = NIL;
                                        for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                            if (!argument.eql(asserted_argument)) {
                                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$1);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_justify_deduction(argument, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_ordered_list_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_justify_support(final SubLObject support, SubLObject recurse) {
        if (recurse == UNPROVIDED) {
            recurse = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_support(support, UNPROVIDED);
        if ((NIL != recurse) && (NIL != assertion_handles.assertion_p(support))) {
            if (NIL != gethash(support, $cb_justify_table$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL == assertions_high.asserted_assertionP(support)) {
                    html_newline(UNPROVIDED);
                    html_princ($$$Justified_Above);
                }
            } else {
                sethash(support, $cb_justify_table$.getDynamicValue(thread), T);
                final SubLObject v_arguments = assertions_high.assertion_arguments(support);
                final SubLObject asserted_argument = assertions_high.get_asserted_argument(support);
                if (NIL != list_utilities.singletonP(v_arguments)) {
                    if (NIL == asserted_argument) {
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$disc);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_justify_deduction(v_arguments.first(), UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    }
                } else {
                    html_markup(html_macros.$html_ordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != asserted_argument) {
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$1);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_asserted_argument(support);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        SubLObject cdolist_list_var = v_arguments;
                        SubLObject argument = NIL;
                        argument = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (!argument.eql(asserted_argument)) {
                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$1);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_justify_deduction(argument, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                                }
                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            argument = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_ordered_list_tail$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_asserted_argument_alt(SubLObject assertion) {
        {
            SubLObject cyclist = assertions_high.asserted_by(assertion);
            SubLObject date = assertions_high.asserted_when(assertion);
            SubLObject purpose = assertions_high.asserted_why(assertion);
            SubLObject second = assertions_high.asserted_second(assertion);
            html_princ($$$Asserted_locally);
            if (NIL != cyclist) {
                html_princ($str_alt202$_by_);
                cb_show_cyclist(cyclist);
            }
            if (NIL != date) {
                html_princ($str_alt203$_on_);
                cb_show_date(date);
            }
            if (NIL != second) {
                html_princ($str_alt204$_at_);
                cb_show_second(second);
            }
            if (NIL != purpose) {
                html_princ($str_alt205$_for_);
                cb_form(purpose, UNPROVIDED, UNPROVIDED);
            }
        }
        return assertion;
    }

    public static SubLObject cb_asserted_argument(final SubLObject assertion) {
        final SubLObject cyclist = assertions_high.asserted_by(assertion);
        final SubLObject date = assertions_high.asserted_when(assertion);
        final SubLObject purpose = assertions_high.asserted_why(assertion);
        final SubLObject second = assertions_high.asserted_second(assertion);
        html_princ($$$Asserted_locally);
        if (NIL != cyclist) {
            html_princ($$$_by_);
            cb_show_cyclist(cyclist);
        }
        if (NIL != date) {
            html_princ($$$_on_);
            cb_show_date(date);
        }
        if (NIL != second) {
            html_princ($$$_at_);
            cb_show_second(second);
        }
        if (NIL != purpose) {
            html_princ($$$_for_);
            cb_form(purpose, UNPROVIDED, UNPROVIDED);
        }
        return assertion;
    }

    public static final SubLObject cb_show_support_alt(SubLObject support, SubLObject validation_level) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            cb_show_assertion_readably(support, T, UNPROVIDED);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                {
                    SubLObject hl_support = kb_hl_supports.kb_hl_support_hl_support(support);
                    cb_show_hl_support_readably(hl_support, validation_level);
                }
            } else {
                cb_show_hl_support_readably(support, validation_level);
            }
        }
        return support;
    }

    public static SubLObject cb_show_support(final SubLObject support, SubLObject validation_level) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            cb_show_assertion_readably(support, T, UNPROVIDED);
        } else
            if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(support);
                cb_show_hl_support_readably(hl_support, validation_level);
            } else {
                cb_show_hl_support_readably(support, validation_level);
            }

        return support;
    }

    public static final SubLObject cb_show_justification_readably_alt(SubLObject justification, SubLObject validation_level) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = justification;
                        SubLObject support = NIL;
                        for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_support(support, validation_level);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_show_justification_readably(final SubLObject justification, SubLObject validation_level) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_show_support(support, validation_level);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * modelled on @xref cb-assertion
     */
    @LispMethod(comment = "modelled on @xref cb-assertion")
    public static final SubLObject cb_hl_support_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id = NIL;
            SubLObject validation_level_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt207);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            validation_level_str = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_hl_support(id);
                    SubLObject validation_level = make_keyword(validation_level_str);
                    if (NIL == arguments.hl_support_p(hl_support)) {
                        cb_error($str_alt208$_A_does_not_specify_an_HL_support, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    return com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_internal(hl_support, validation_level);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt207);
            }
        }
        return NIL;
    }

    /**
     * modelled on @xref cb-assertion
     */
    @LispMethod(comment = "modelled on @xref cb-assertion")
    public static SubLObject cb_hl_support(final SubLObject args) {
        SubLObject id = NIL;
        SubLObject validation_level_str = NIL;
        destructuring_bind_must_consp(args, args, $list226);
        id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list226);
        validation_level_str = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list226);
            return NIL;
        }
        final SubLObject hl_support = cb_guess_hl_support(id);
        final SubLObject validation_level = make_keyword(validation_level_str);
        if (NIL == arguments.hl_support_p(hl_support)) {
            cb_error($str227$_A_does_not_specify_an_HL_support, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_hl_support_internal(hl_support, validation_level);
    }/**
     * modelled on @xref cb-assertion
     */


    public static final SubLObject cb_link_hl_support_alt(SubLObject hl_support, SubLObject validation_level, SubLObject linktext) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
            SubLTrampolineFile.checkType(validation_level, INTERMEDIATE_STEP_VALIDATION_LEVEL_P);
            {
                SubLObject id = com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_identifier(hl_support);
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt212$cb_hl_support__A__A, id, validation_level);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_princ(linktext);
                        } else {
                            html_prin1(arguments.support_module(hl_support));
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return hl_support;
        }
    }

    public static SubLObject cb_link_hl_support(final SubLObject hl_support, SubLObject validation_level, SubLObject linktext) {
        if (validation_level == UNPROVIDED) {
            validation_level = $NONE;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) : "! inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) " + ("inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) ") + validation_level;
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str231$cb_hl_support__A__A, id, validation_level);
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                html_prin1(arguments.support_module(hl_support));
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }

    /**
     * modelled on @xref cb-assertion-internal
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-internal")
    public static final SubLObject cb_hl_support_internal_alt(SubLObject hl_support, SubLObject validation_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$HL_Support_Detail);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_toolbar(hl_support, validation_level);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_info(hl_support);
                                    com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_justify(hl_support);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                }
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return hl_support;
        }
    }

    /**
     * modelled on @xref cb-assertion-internal
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-internal")
    public static SubLObject cb_hl_support_internal(final SubLObject hl_support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str8$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (NIL != kb_hl_support_handles.kb_hl_support_p(possible_kb_hl_support)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id(possible_kb_hl_support));
            } else {
                html_princ($$$HL_Support_Detail);
            }
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_hl_support_toolbar(hl_support, validation_level);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_hl_support_info(hl_support);
                        cb_hl_support_justify(hl_support);
                        cb_hl_support_more_info(hl_support);
                        cb_hl_support_argument(hl_support);
                        cb_hl_support_dependents(hl_support);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$82, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return hl_support;
    }/**
     * modelled on @xref cb-assertion-internal
     */


    /**
     * modelled on @xref cb-assertion-toolbar
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-toolbar")
    public static final SubLObject cb_hl_support_toolbar_alt(SubLObject hl_support, SubLObject validation_level) {
        if (NIL != arguments.hl_support_p(hl_support)) {
            cb_help_preamble($CB_HL_SUPPORT, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($$$HL_Support_Detail);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT_VALIDATE, hl_support, validation_level, $str_alt219$_Validate_, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT, hl_support, validation_level, $str_alt176$_Refresh_, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT_SIMILAR_QUERY, hl_support, $str_alt221$_Query_Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * modelled on @xref cb-assertion-toolbar
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-toolbar")
    public static SubLObject cb_hl_support_toolbar(final SubLObject hl_support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arguments.hl_support_p(hl_support)) {
            cb_help_preamble($CB_HL_SUPPORT, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (NIL != kb_hl_support_handles.kb_hl_support_p(possible_kb_hl_support)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id(possible_kb_hl_support));
            } else {
                html_princ($$$HL_Support_Detail);
            }
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT_VALIDATE, hl_support, validation_level, $str239$_Validate_, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT, hl_support, validation_level, $str163$_Refresh_, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_link($HL_SUPPORT_SIMILAR_QUERY, hl_support, $str241$_Query_Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }/**
     * modelled on @xref cb-assertion-toolbar
     */


    /**
     * modelled on @xref cb-assertion-info
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-info")
    public static final SubLObject cb_hl_support_info_alt(SubLObject hl_support) {
        if ($UNKNOWN == arguments.support_truth(hl_support)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str_alt42$Truth___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_princ($$$Unknown);
        } else {
            {
                SubLObject strength = arguments.support_strength(hl_support);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt43$Strength___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                cb_show_strength(strength);
            }
        }
        {
            SubLObject module = arguments.support_module(hl_support);
            html_indent(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str_alt223$Module___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_support_module(module);
        }
        {
            SubLObject mt = arguments.support_mt(hl_support);
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str_alt181$Mt___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_form(mt, UNPROVIDED, UNPROVIDED);
        }
        com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_show_formula_variants(hl_support);
        return NIL;
    }

    /**
     * modelled on @xref cb-assertion-info
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-info")
    public static SubLObject cb_hl_support_info(final SubLObject hl_support) {
        if ($UNKNOWN == arguments.support_truth(hl_support)) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str53$Truth___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_princ($$$Unknown);
        } else {
            final SubLObject strength = arguments.support_strength(hl_support);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str54$Strength___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_show_strength(strength);
        }
        final SubLObject module = arguments.support_module(hl_support);
        html_indent(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str243$Module___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_show_support_module(module);
        final SubLObject mt = arguments.support_mt(hl_support);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str188$Mt___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_form(mt, UNPROVIDED, UNPROVIDED);
        cb_hl_support_show_formula_variants(hl_support);
        return NIL;
    }/**
     * modelled on @xref cb-assertion-info
     */


    /**
     * modelled on @xref cb-assertion-show-formula-variants
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-show-formula-variants")
    public static final SubLObject cb_hl_support_show_formula_variants_alt(SubLObject hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_formula = arguments.support_formula(hl_support);
                if ((NIL != $cb_a_show_hl_formula$.getDynamicValue(thread)) || (NIL != $cb_a_show_el_formula$.getDynamicValue(thread))) {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt65$HL_Formula___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    cb_form(hl_formula, ZERO_INTEGER, T);
                    html_newline(UNPROVIDED);
                }
                if (NIL != $cb_a_show_english$.getDynamicValue(thread)) {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str_alt66$English_Translation___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = $show_assertions_in_english$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                        try {
                            $show_assertions_in_english$.bind(T, thread);
                            pph_vars.$pph_domain_mt$.bind(arguments.support_mt(hl_support), thread);
                            cb_show_hl_support_formula_readably(hl_formula);
                        } finally {
                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_1, thread);
                            $show_assertions_in_english$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_newline(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * modelled on @xref cb-assertion-show-formula-variants
     */
    @LispMethod(comment = "modelled on @xref cb-assertion-show-formula-variants")
    public static SubLObject cb_hl_support_show_formula_variants(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = arguments.support_formula(hl_support);
        if ((NIL != $cb_a_show_hl_formula$.getDynamicValue(thread)) || (NIL != $cb_a_show_el_formula$.getDynamicValue(thread))) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str96$HL_Formula___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            cb_form(hl_formula, ZERO_INTEGER, T);
            html_newline(UNPROVIDED);
        }
        if (NIL != $cb_a_show_english$.getDynamicValue(thread)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str99$English_Translation___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            final SubLObject _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                control_vars.$cb_major_presentation_language$.bind($NL, thread);
                pph_vars.$pph_domain_mt$.bind(arguments.support_mt(hl_support), thread);
                cb_show_hl_support_formula_readably(hl_formula);
            } finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
                control_vars.$cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            html_newline(UNPROVIDED);
        }
        return NIL;
    }/**
     * modelled on @xref cb-assertion-show-formula-variants
     */


    public static final SubLObject cb_hl_support_justify_alt(SubLObject hl_support) {
        {
            SubLObject justification = arguments.support_justification(hl_support);
            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_justify_int(hl_support, justification);
        }
    }

    public static SubLObject cb_hl_support_justify(final SubLObject hl_support) {
        final SubLObject justification = arguments.support_justification(hl_support);
        return cb_hl_support_justify_int(hl_support, justification);
    }

    public static final SubLObject cb_hl_support_justify_int_alt(SubLObject hl_support, SubLObject justification) {
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str_alt183$Justification___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == justification) {
            html_princ($$$None_available);
        } else {
            if ((NIL != list_utilities.singletonP(justification)) && hl_support.equal(justification.first())) {
                html_princ($$$Nothing_deeper_available);
            } else {
                {
                    SubLObject cdolist_list_var = justification;
                    SubLObject justify_support = NIL;
                    for (justify_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justify_support = cdolist_list_var.first()) {
                        html_newline(UNPROVIDED);
                        com.cyc.cycjava.cycl.cb_assertion_browser.cb_show_support(justify_support, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_hl_support_justify_int(final SubLObject hl_support, final SubLObject justification) {
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str190$Justification___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == justification) {
            html_princ($$$None_available);
        } else
            if ((NIL != list_utilities.singletonP(justification)) && hl_support.equal(justification.first())) {
                html_princ($$$Nothing_deeper_available);
            } else {
                SubLObject cdolist_list_var = justification;
                SubLObject justify_support = NIL;
                justify_support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_newline(UNPROVIDED);
                    cb_show_support(justify_support, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    justify_support = cdolist_list_var.first();
                } 
            }

        return NIL;
    }

    public static SubLObject cb_hl_support_more_info(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str246$Computed_forward_mt_combos___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject mts = NIL;
        SubLObject forward_mt_combos_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        mts = Mapping.mapcar(SUPPORT_MT, hl_supports.hl_forward_mt_combos(arguments.make_hl_support(arguments.hl_support_module(hl_support), arguments.hl_support_sentence(hl_support), $$InferencePSC, UNPROVIDED)));
        forward_mt_combos_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (forward_mt_combos_time.numG(ONE_INTEGER)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color($RED));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str248$__This_HL_support_has_a_very_slow, forward_mt_combos_time);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        if (NIL == list_utilities.member_kbeqP(arguments.support_mt(hl_support), mts)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color($RED));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str249$__This_HL_support_has_a_stale_mt_);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_newline(UNPROVIDED);
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_hl_support_argument(final SubLObject hl_support) {
        final SubLObject kb_hl_support = (NIL != kb_hl_support_handles.kb_hl_support_p(hl_support)) ? hl_support : NIL != arguments.hl_support_p(hl_support) ? kb_hl_supports_high.find_kb_hl_support(hl_support) : NIL;
        if (NIL != kb_hl_support) {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str250$KB_HL_Support_argument___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject deduction = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_link($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            SubLObject cdolist_list_var = nreverse(deductions_high.deduction_supports(deduction));
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                cb_show_support(support, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return kb_hl_support;
    }

    public static SubLObject cb_hl_support_dependents(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_hl_support = (NIL != kb_hl_support_handles.kb_hl_support_p(hl_support)) ? hl_support : NIL != arguments.hl_support_p(hl_support) ? kb_hl_supports_high.find_kb_hl_support(hl_support) : NIL;
        if (NIL != kb_hl_support) {
            final SubLObject deductions = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str251$_A_KB_HL_Support_dependents___, length(deductions));
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            SubLObject cdolist_list_var = deductions;
            SubLObject deduction = NIL;
            deduction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_link($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_princ($str58$___);
                cb_form(deductions_high.deduction_supported_object(deduction), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                deduction = cdolist_list_var.first();
            } 
        }
        return kb_hl_support;
    }

    public static final SubLObject cb_hl_support_identifier_alt(SubLObject hl_support) {
        return cb_glob_id(hl_support);
    }

    public static SubLObject cb_hl_support_identifier(final SubLObject hl_support) {
        return cb_glob_id(hl_support);
    }

    public static final SubLObject cb_guess_hl_support_alt(SubLObject args) {
        if (args.isInteger()) {
            return cb_glob_lookup(args);
        } else {
            if (NIL != arguments.hl_support_p(args)) {
                return args;
            } else {
                if (NIL == args) {
                    return NIL;
                } else {
                    if (args.isString()) {
                        {
                            SubLObject id = read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED);
                            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_hl_support(id);
                        }
                    } else {
                        if (args.isCons()) {
                            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_hl_support(args.first());
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_guess_hl_support(final SubLObject args) {
        if (args.isInteger()) {
            return cb_glob_lookup(args);
        }
        if (NIL != arguments.hl_support_p(args)) {
            return args;
        }
        if (NIL == args) {
            return NIL;
        }
        if (args.isString()) {
            final SubLObject id = read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED);
            return cb_guess_hl_support(id);
        }
        if (args.isCons()) {
            return cb_guess_hl_support(args.first());
        }
        return NIL;
    }

    public static final SubLObject cb_link_hl_support_validate_alt(SubLObject hl_support, SubLObject validation_level, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
            SubLTrampolineFile.checkType(validation_level, INTERMEDIATE_STEP_VALIDATION_LEVEL_P);
            if (validation_level == $NONE) {
                return hl_support;
            }
            if (NIL == linktext) {
                linktext = $str_alt219$_Validate_;
            }
            {
                SubLObject id = com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_identifier(hl_support);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt226$cb_hl_validate__A__A, id, validation_level);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return hl_support;
        }
    }

    public static SubLObject cb_link_hl_support_validate(final SubLObject hl_support, final SubLObject validation_level, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) : "! inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) " + ("inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) ") + validation_level;
        if (validation_level == $NONE) {
            return hl_support;
        }
        if (NIL == linktext) {
            linktext = $str239$_Validate_;
        }
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str252$cb_hl_validate__A__A, id, validation_level);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }

    public static final SubLObject cb_hl_validate_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id = NIL;
            SubLObject validation_level_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt207);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            validation_level_str = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_hl_support(id);
                    SubLObject validation_level = make_keyword(validation_level_str);
                    if (NIL == hl_support) {
                        return cb_error($str_alt228$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject sentence = arguments.support_el_sentence(hl_support);
                        SubLObject mt = arguments.support_elmt(hl_support);
                        SubLObject violations = hl_validate_wff_violations(hl_support, validation_level);
                        return cb_assertion_editor.cb_explain_why_not_wff(sentence, mt, violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt207);
            }
        }
        return NIL;
    }

    public static SubLObject cb_hl_validate(final SubLObject args) {
        SubLObject id = NIL;
        SubLObject validation_level_str = NIL;
        destructuring_bind_must_consp(args, args, $list226);
        id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list226);
        validation_level_str = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list226);
            return NIL;
        }
        final SubLObject hl_support = cb_guess_hl_support(id);
        final SubLObject validation_level = make_keyword(validation_level_str);
        if (NIL == hl_support) {
            return cb_error($str254$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = arguments.support_el_sentence(hl_support);
        final SubLObject mt = arguments.support_elmt(hl_support);
        final SubLObject violations = hl_supports.hl_validate_wff_violations(hl_support, validation_level);
        return cb_assertion_editor.cb_explain_why_not_wff(sentence, mt, violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_link_hl_support_similar_query_alt(SubLObject hl_support, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
            if (NIL == linktext) {
                linktext = $str_alt221$_Query_Similar_;
            }
            {
                SubLObject id = com.cyc.cycjava.cycl.cb_assertion_browser.cb_hl_support_identifier(hl_support);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$cb_hl_support_similar_query__A, id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return hl_support;
        }
    }

    public static SubLObject cb_link_hl_support_similar_query(final SubLObject hl_support, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        if (NIL == linktext) {
            linktext = $str241$_Query_Similar_;
        }
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str256$cb_hl_support_similar_query__A, id);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }

    public static final SubLObject cb_hl_support_similar_query_alt(SubLObject args) {
        {
            SubLObject hl_support = com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_hl_support(args);
            if (NIL == hl_support) {
                return cb_error($str_alt228$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject sentence = arguments.support_el_sentence(hl_support);
                SubLObject mt = arguments.support_elmt(hl_support);
                return cb_query.cb_similar_query(sentence, mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject cb_hl_support_similar_query(final SubLObject args) {
        final SubLObject hl_support = cb_guess_hl_support(args);
        if (NIL == hl_support) {
            return cb_error($str254$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = arguments.support_el_sentence(hl_support);
        final SubLObject mt = arguments.support_elmt(hl_support);
        return cb_query.cb_similar_query(sentence, mt, UNPROVIDED);
    }

    public static final SubLObject cb_clause_struc_alt(SubLObject args) {
        {
            SubLObject clause_struc = com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_clause_struc(args);
            if (NIL == clause_strucs.clause_struc_p(clause_struc)) {
                cb_error($str_alt233$_A_does_not_specify_an_HL_clause_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_clause_struc_internal(clause_struc);
        }
    }

    public static SubLObject cb_clause_struc(final SubLObject args) {
        final SubLObject clause_struc = cb_guess_clause_struc(args);
        if (NIL == clause_strucs.clause_struc_p(clause_struc)) {
            cb_error($str259$_A_does_not_specify_an_HL_clause_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_clause_struc_internal(clause_struc);
    }

    public static final SubLObject cb_link_clause_struc_alt(SubLObject clause_struc, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(clause_struc, CLAUSE_STRUC_P);
            {
                SubLObject id = clause_strucs.clause_struc_id(clause_struc);
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt236$cb_clause_struc__A, id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_princ(linktext);
                        } else {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            html_princ($str_alt165$__);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt237$CLAUSE_STRUC___S, id);
                            html_princ($str_alt167$_);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return clause_struc;
        }
    }

    public static SubLObject cb_link_clause_struc(final SubLObject clause_struc, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clause_strucs.clause_struc_p(clause_struc) : "! clause_strucs.clause_struc_p(clause_struc) " + ("clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) ") + clause_struc;
        final SubLObject id = clause_strucs.clause_struc_id(clause_struc);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str262$cb_clause_struc__A, id);
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
            if (NIL != linktext) {
                html_princ(linktext);
            } else {
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_princ($str171$__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str263$CLAUSE_STRUC___S, id);
                html_princ($str173$_);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return clause_struc;
    }

    public static final SubLObject cb_form_clause_struc_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($CLAUSE_STRUC, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_form_clause_struc_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($CLAUSE_STRUC, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_clause_struc_internal_alt(SubLObject clause_struc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = clause_strucs.clause_struc_cnf(clause_struc);
                SubLObject title = format(NIL, $str_alt243$Clause_Struc___S, clause_strucs.clause_struc_id(clause_struc));
                SubLObject title_var = title;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_104 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt8$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_CLAUSE_STRUC, UNPROVIDED, UNPROVIDED);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                html_princ($str_alt244$CNF_clause___);
                                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                com.cyc.cycjava.cycl.cb_assertion_browser.cb_cnf(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
                                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                {
                                                    SubLObject assertions = clause_strucs.clause_struc_assertions(clause_struc);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_princ($str_alt245$Assertions_using_this_clause___);
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject cdolist_list_var = assertions;
                                                        SubLObject assertion = NIL;
                                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                                            html_newline(UNPROVIDED);
                                                            cb_show_assertion_readably(assertion, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_104, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_clause_struc_internal(final SubLObject clause_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = clause_strucs.clause_struc_cnf(clause_struc);
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str269$Clause_Struc___S, clause_strucs.clause_struc_id(clause_struc));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$85 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$86 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str13$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_CLAUSE_STRUC, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_princ($str270$CNF_clause___);
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            cb_cnf(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            final SubLObject assertions = clause_strucs.clause_struc_assertions(clause_struc);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_princ($str271$Assertions_using_this_clause___);
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = NIL;
                            assertion = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_newline(UNPROVIDED);
                                cb_show_assertion_readably(assertion, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                assertion = cdolist_list_var.first();
                            } 
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$86, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$85, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_cnf_alt(SubLObject neg_lits, SubLObject pos_lits) {
        html_princ($str_alt246$__);
        {
            SubLObject first = T;
            SubLObject cdolist_list_var = neg_lits;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if (NIL == first) {
                    html_newline(UNPROVIDED);
                    html_glyph($NBSP, TWO_INTEGER);
                }
                cb_form(lit, ONE_INTEGER, UNPROVIDED);
                first = NIL;
            }
        }
        html_princ($str_alt247$_);
        html_newline(UNPROVIDED);
        html_glyph($NBSP, UNPROVIDED);
        html_princ($str_alt248$_);
        {
            SubLObject first = T;
            SubLObject cdolist_list_var = pos_lits;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if (NIL == first) {
                    html_newline(UNPROVIDED);
                    html_glyph($NBSP, TWO_INTEGER);
                }
                cb_form(lit, ONE_INTEGER, UNPROVIDED);
                first = NIL;
            }
        }
        html_princ($str_alt249$__);
        return NIL;
    }

    public static SubLObject cb_cnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        html_princ($str272$__);
        SubLObject first = T;
        SubLObject cdolist_list_var = neg_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == first) {
                html_newline(UNPROVIDED);
                html_glyph($NBSP, TWO_INTEGER);
            }
            cb_form(lit, ONE_INTEGER, UNPROVIDED);
            first = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        html_princ($str67$_);
        html_newline(UNPROVIDED);
        html_glyph($NBSP, UNPROVIDED);
        html_princ($str62$_);
        first = T;
        cdolist_list_var = pos_lits;
        lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == first) {
                html_newline(UNPROVIDED);
                html_glyph($NBSP, TWO_INTEGER);
            }
            cb_form(lit, ONE_INTEGER, UNPROVIDED);
            first = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        html_princ($str273$__);
        return NIL;
    }

    public static final SubLObject cb_guess_clause_struc_alt(SubLObject args) {
        if (args.isInteger()) {
            return clause_strucs.find_clause_struc_by_id(args);
        } else {
            if (NIL != clause_strucs.clause_struc_p(args)) {
                return args;
            } else {
                if (NIL == args) {
                    return NIL;
                } else {
                    if (args.isString()) {
                        {
                            SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (id.isInteger()) {
                                return clause_strucs.find_clause_struc_by_id(id);
                            }
                        }
                        return NIL;
                    } else {
                        if (args.isCons()) {
                            return com.cyc.cycjava.cycl.cb_assertion_browser.cb_guess_clause_struc(args.first());
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_guess_clause_struc(final SubLObject args) {
        if (args.isInteger()) {
            return clause_strucs.find_clause_struc_by_id(args);
        }
        if (NIL != clause_strucs.clause_struc_p(args)) {
            return args;
        }
        if (NIL == args) {
            return NIL;
        }
        if (args.isString()) {
            final SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (id.isInteger()) {
                return clause_strucs.find_clause_struc_by_id(id);
            }
            return NIL;
        } else {
            if (args.isCons()) {
                return cb_guess_clause_struc(args.first());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_process_suggested_english_alt(SubLObject args) {
        {
            SubLObject assertion_id = read_from_string(html_extract_input($str_alt69$assertion_id, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
            SubLObject assertion_cycl = uncanonicalizer.assertion_el_formula(assertion);
            SubLObject sentence = html_extract_input($$$sentence, args);
            SubLObject sentence_type = string_utilities.keyword_from_string(html_extract_input($str_alt74$sentence_type, args));
            SubLObject v_question = html_extract_input($$$question, args);
            SubLObject question_type = string_utilities.keyword_from_string(html_extract_input($str_alt81$question_type, args));
            if (NIL == string_utilities.empty_string_p(sentence)) {
                parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, sentence, $S, sentence_type, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == string_utilities.empty_string_p(v_question)) {
                parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, v_question, $Q, question_type, UNPROVIDED, UNPROVIDED);
            }
            com.cyc.cycjava.cycl.cb_assertion_browser.cb_assertion_internal(assertion);
        }
        return NIL;
    }

    public static SubLObject cb_process_suggested_english(final SubLObject args) {
        final SubLObject assertion_id = read_from_string(html_extract_input($str274$assertion_id, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        final SubLObject assertion_cycl = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject sentence = html_extract_input($$$sentence, args);
        final SubLObject sentence_type = string_utilities.keyword_from_string(html_extract_input($str276$sentence_type, args));
        final SubLObject v_question = html_extract_input($$$question, args);
        final SubLObject question_type = string_utilities.keyword_from_string(html_extract_input($str278$question_type, args));
        if (NIL == string_utilities.empty_string_p(sentence)) {
            parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, sentence, $S, sentence_type, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == string_utilities.empty_string_p(v_question)) {
            parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, v_question, $Q, question_type, UNPROVIDED, UNPROVIDED);
        }
        cb_assertion_internal(assertion);
        return NIL;
    }

    public static final SubLObject declare_cb_assertion_browser_file_alt() {
        declareFunction("cb_find_assertion", "CB-FIND-ASSERTION", 0, 1, false);
        declareFunction("cb_find_assertion_internal", "CB-FIND-ASSERTION-INTERNAL", 2, 2, false);
        declareFunction("cb_link_find_assertion", "CB-LINK-FIND-ASSERTION", 0, 1, false);
        declareFunction("cb_handle_find_assertion", "CB-HANDLE-FIND-ASSERTION", 1, 0, false);
        declareFunction("cb_extract_find_assertion_args", "CB-EXTRACT-FIND-ASSERTION-ARGS", 1, 0, false);
        declareFunction("cb_find_similar_assertion", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false);
        declareFunction("cb_link_find_similar_assertion", "CB-LINK-FIND-SIMILAR-ASSERTION", 1, 1, false);
        declareFunction("cb_assertion", "CB-ASSERTION", 1, 0, false);
        declareFunction("cb_af", "CB-AF", 1, 0, false);
        declareFunction("cb_assertion_internal", "CB-ASSERTION-INTERNAL", 1, 0, false);
        declareFunction("cb_assertion_info", "CB-ASSERTION-INFO", 1, 0, false);
        declareFunction("cb_show_rule_info", "CB-SHOW-RULE-INFO", 1, 0, false);
        declareFunction("cb_assertion_diagnostics", "CB-ASSERTION-DIAGNOSTICS", 1, 0, false);
        declareFunction("cb_canonicalizer_problemP", "CB-CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("cb_assertion_access_diagnostics", "CB-ASSERTION-ACCESS-DIAGNOSTICS", 1, 0, false);
        declareFunction("cb_assertion_show_formula_variants", "CB-ASSERTION-SHOW-FORMULA-VARIANTS", 1, 0, false);
        declareFunction("cb_paraphrase_bugzilla_link", "CB-PARAPHRASE-BUGZILLA-LINK", 1, 2, false);
        declareFunction("cb_paraphrase_bugzilla_summary_for_cycl", "CB-PARAPHRASE-BUGZILLA-SUMMARY-FOR-CYCL", 1, 0, false);
        declareFunction("cb_paraphrase_bugzilla_comment_for_cycl", "CB-PARAPHRASE-BUGZILLA-COMMENT-FOR-CYCL", 1, 2, false);
        declareFunction("cb_show_formula_madlibs", "CB-SHOW-FORMULA-MADLIBS", 1, 0, false);
        declareFunction("cb_show_exception_rule_index", "CB-SHOW-EXCEPTION-RULE-INDEX", 1, 0, false);
        declareFunction("cb_show_exception_rule_rec", "CB-SHOW-EXCEPTION-RULE-REC", 1, 0, false);
        declareFunction("cb_show_exception_rule_rec_mt", "CB-SHOW-EXCEPTION-RULE-REC-MT", 2, 0, false);
        declareFunction("cb_show_pragma_rule_index", "CB-SHOW-PRAGMA-RULE-INDEX", 1, 0, false);
        declareFunction("cb_show_pragma_rule_rec", "CB-SHOW-PRAGMA-RULE-REC", 1, 0, false);
        declareFunction("cb_show_pragma_rule_rec_mt", "CB-SHOW-PRAGMA-RULE-REC-MT", 2, 0, false);
        declareFunction("cb_assertion_with_show_english", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false);
        declareFunction("cb_link_show_english", "CB-LINK-SHOW-ENGLISH", 1, 1, false);
        declareFunction("cb_assertion_with_show_el_formula", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false);
        declareFunction("cb_link_show_el_formula", "CB-LINK-SHOW-EL-FORMULA", 1, 1, false);
        declareFunction("cb_describe_assertion", "CB-DESCRIBE-ASSERTION", 1, 0, false);
        declareFunction("cb_link_describe_assertion", "CB-LINK-DESCRIBE-ASSERTION", 1, 1, false);
        declareFunction("cb_arguments", "CB-ARGUMENTS", 1, 0, false);
        declareFunction("cb_link_arguments", "CB-LINK-ARGUMENTS", 1, 1, false);
        declareFunction("cb_dependents", "CB-DEPENDENTS", 1, 0, false);
        declareFunction("cb_link_dependents", "CB-LINK-DEPENDENTS", 1, 1, false);
        declareFunction("cb_deduction", "CB-DEDUCTION", 1, 0, false);
        declareFunction("cb_link_deduction", "CB-LINK-DEDUCTION", 1, 1, false);
        declareFunction("cb_link_deduction_struct", "CB-LINK-DEDUCTION-STRUCT", 1, 1, false);
        declareFunction("cb_form_deduction_method", "CB-FORM-DEDUCTION-METHOD", 1, 2, false);
        declareFunction("cb_deduction_internal", "CB-DEDUCTION-INTERNAL", 1, 0, false);
        declareFunction("cb_deduction_toolbar", "CB-DEDUCTION-TOOLBAR", 1, 0, false);
        declareFunction("cb_deduction_info", "CB-DEDUCTION-INFO", 1, 0, false);
        declareFunction("cb_deduction_supports", "CB-DEDUCTION-SUPPORTS", 1, 0, false);
        declareFunction("cb_justify", "CB-JUSTIFY", 1, 0, false);
        declareFunction("cb_link_justify", "CB-LINK-JUSTIFY", 1, 1, false);
        declareFunction("cb_justify_internal", "CB-JUSTIFY-INTERNAL", 1, 1, false);
        declareFunction("cb_justify_deduction", "CB-JUSTIFY-DEDUCTION", 1, 1, false);
        declareFunction("cb_justify_support", "CB-JUSTIFY-SUPPORT", 1, 1, false);
        declareFunction("cb_asserted_argument", "CB-ASSERTED-ARGUMENT", 1, 0, false);
        declareFunction("cb_show_support", "CB-SHOW-SUPPORT", 1, 1, false);
        declareFunction("cb_show_justification_readably", "CB-SHOW-JUSTIFICATION-READABLY", 1, 1, false);
        declareFunction("cb_hl_support", "CB-HL-SUPPORT", 1, 0, false);
        declareFunction("cb_link_hl_support", "CB-LINK-HL-SUPPORT", 1, 2, false);
        declareFunction("cb_hl_support_internal", "CB-HL-SUPPORT-INTERNAL", 2, 0, false);
        declareFunction("cb_hl_support_toolbar", "CB-HL-SUPPORT-TOOLBAR", 2, 0, false);
        declareFunction("cb_hl_support_info", "CB-HL-SUPPORT-INFO", 1, 0, false);
        declareFunction("cb_hl_support_show_formula_variants", "CB-HL-SUPPORT-SHOW-FORMULA-VARIANTS", 1, 0, false);
        declareFunction("cb_hl_support_justify", "CB-HL-SUPPORT-JUSTIFY", 1, 0, false);
        declareFunction("cb_hl_support_justify_int", "CB-HL-SUPPORT-JUSTIFY-INT", 2, 0, false);
        declareFunction("cb_hl_support_identifier", "CB-HL-SUPPORT-IDENTIFIER", 1, 0, false);
        declareFunction("cb_guess_hl_support", "CB-GUESS-HL-SUPPORT", 1, 0, false);
        declareFunction("cb_link_hl_support_validate", "CB-LINK-HL-SUPPORT-VALIDATE", 2, 1, false);
        declareFunction("cb_hl_validate", "CB-HL-VALIDATE", 1, 0, false);
        declareFunction("cb_link_hl_support_similar_query", "CB-LINK-HL-SUPPORT-SIMILAR-QUERY", 1, 1, false);
        declareFunction("cb_hl_support_similar_query", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false);
        declareFunction("cb_clause_struc", "CB-CLAUSE-STRUC", 1, 0, false);
        declareFunction("cb_link_clause_struc", "CB-LINK-CLAUSE-STRUC", 1, 1, false);
        declareFunction("cb_form_clause_struc_method", "CB-FORM-CLAUSE-STRUC-METHOD", 1, 2, false);
        declareFunction("cb_clause_struc_internal", "CB-CLAUSE-STRUC-INTERNAL", 1, 0, false);
        declareFunction("cb_cnf", "CB-CNF", 2, 0, false);
        declareFunction("cb_guess_clause_struc", "CB-GUESS-CLAUSE-STRUC", 1, 0, false);
        declareFunction("cb_process_suggested_english", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_assertion_browser_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_find_assertion", "CB-FIND-ASSERTION", 0, 1, false);
            declareFunction("cb_find_assertion_internal", "CB-FIND-ASSERTION-INTERNAL", 2, 2, false);
            declareFunction("cb_link_find_assertion", "CB-LINK-FIND-ASSERTION", 0, 1, false);
            declareFunction("cb_handle_find_assertion", "CB-HANDLE-FIND-ASSERTION", 1, 0, false);
            declareFunction("cb_extract_find_assertion_args", "CB-EXTRACT-FIND-ASSERTION-ARGS", 1, 0, false);
            declareFunction("cb_find_similar_assertion", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false);
            declareFunction("cb_link_find_similar_assertion", "CB-LINK-FIND-SIMILAR-ASSERTION", 1, 1, false);
            declareFunction("cb_assertion", "CB-ASSERTION", 1, 0, false);
            declareFunction("cb_af", "CB-AF", 1, 0, false);
            declareFunction("cb_assertion_internal", "CB-ASSERTION-INTERNAL", 1, 0, false);
            declareFunction("cb_assertion_info", "CB-ASSERTION-INFO", 1, 0, false);
            declareFunction("cb_show_rule_info", "CB-SHOW-RULE-INFO", 1, 0, false);
            declareFunction("cb_assertion_diagnostics", "CB-ASSERTION-DIAGNOSTICS", 1, 0, false);
            declareFunction("cb_canonicalizer_problemP", "CB-CANONICALIZER-PROBLEM?", 1, 0, false);
            declareFunction("cb_canonicalizer_problems", "CB-CANONICALIZER-PROBLEMS", 1, 0, false);
            declareFunction("cb_assertion_exception_info", "CB-ASSERTION-EXCEPTION-INFO", 1, 0, false);
            declareFunction("cb_assertion_doomed_info", "CB-ASSERTION-DOOMED-INFO", 1, 0, false);
            declareFunction("cb_rule_assertion_analysis_info", "CB-RULE-ASSERTION-ANALYSIS-INFO", 1, 0, false);
            declareFunction("cb_assertion_access_diagnostics", "CB-ASSERTION-ACCESS-DIAGNOSTICS", 1, 0, false);
            declareFunction("cb_assertion_show_formula_variants", "CB-ASSERTION-SHOW-FORMULA-VARIANTS", 1, 0, false);
            declareFunction("rule_variable_arg_constraints_formula", "RULE-VARIABLE-ARG-CONSTRAINTS-FORMULA", 1, 0, false);
            declareFunction("constraint_formula_from_constraints_dict", "CONSTRAINT-FORMULA-FROM-CONSTRAINTS-DICT", 1, 1, false);
            declareFunction("cb_assertion_variable_info", "CB-ASSERTION-VARIABLE-INFO", 1, 0, false);
            declareFunction("assertion_variable_info_cols", "ASSERTION-VARIABLE-INFO-COLS", 2, 0, false);
            declareFunction("cb_show_formula_madlibs", "CB-SHOW-FORMULA-MADLIBS", 1, 0, false);
            declareFunction("cb_show_exception_rule_index", "CB-SHOW-EXCEPTION-RULE-INDEX", 1, 0, false);
            declareFunction("cb_show_exception_rule_rec", "CB-SHOW-EXCEPTION-RULE-REC", 1, 0, false);
            declareFunction("cb_show_exception_rule_rec_mt", "CB-SHOW-EXCEPTION-RULE-REC-MT", 2, 0, false);
            declareFunction("cb_show_pragma_rule_index", "CB-SHOW-PRAGMA-RULE-INDEX", 1, 0, false);
            declareFunction("cb_show_pragma_rule_rec", "CB-SHOW-PRAGMA-RULE-REC", 1, 0, false);
            declareFunction("cb_show_pragma_rule_rec_mt", "CB-SHOW-PRAGMA-RULE-REC-MT", 2, 0, false);
            declareFunction("cb_assertion_with_show_english", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false);
            declareFunction("cb_link_show_english", "CB-LINK-SHOW-ENGLISH", 1, 1, false);
            declareFunction("cb_assertion_with_show_el_formula", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false);
            declareFunction("cb_link_show_el_formula", "CB-LINK-SHOW-EL-FORMULA", 1, 1, false);
            declareFunction("cb_arguments", "CB-ARGUMENTS", 1, 0, false);
            declareFunction("cb_link_arguments", "CB-LINK-ARGUMENTS", 1, 1, false);
            declareFunction("cb_dependents", "CB-DEPENDENTS", 1, 0, false);
            declareFunction("cb_link_dependents", "CB-LINK-DEPENDENTS", 1, 1, false);
            declareFunction("cb_assertion_dependencies", "CB-ASSERTION-DEPENDENCIES", 1, 0, false);
            declareFunction("cb_link_assertion_dependencies", "CB-LINK-ASSERTION-DEPENDENCIES", 1, 1, false);
            declareFunction("cb_assertion_dependencies_internal", "CB-ASSERTION-DEPENDENCIES-INTERNAL", 1, 0, false);
            declareFunction("cb_assertion_dependencies_section", "CB-ASSERTION-DEPENDENCIES-SECTION", 1, 0, false);
            declareFunction("cb_deduction", "CB-DEDUCTION", 1, 0, false);
            declareFunction("cb_deduction_id_url", "CB-DEDUCTION-ID-URL", 1, 0, false);
            declareFunction("cb_link_deduction", "CB-LINK-DEDUCTION", 1, 1, false);
            declareFunction("cb_link_deduction_struct", "CB-LINK-DEDUCTION-STRUCT", 1, 1, false);
            declareFunction("cb_form_deduction_method", "CB-FORM-DEDUCTION-METHOD", 1, 2, false);
            declareFunction("cb_deduction_internal", "CB-DEDUCTION-INTERNAL", 1, 0, false);
            declareFunction("cb_deduction_toolbar", "CB-DEDUCTION-TOOLBAR", 1, 0, false);
            declareFunction("cb_goto_previous_deduction_control", "CB-GOTO-PREVIOUS-DEDUCTION-CONTROL", 1, 0, false);
            declareFunction("cb_goto_next_deduction_control", "CB-GOTO-NEXT-DEDUCTION-CONTROL", 1, 0, false);
            declareFunction("cb_deduction_info", "CB-DEDUCTION-INFO", 1, 0, false);
            declareFunction("cb_deduction_supports", "CB-DEDUCTION-SUPPORTS", 1, 0, false);
            declareFunction("cb_justify", "CB-JUSTIFY", 1, 0, false);
            declareFunction("cb_link_justify", "CB-LINK-JUSTIFY", 1, 1, false);
            declareFunction("cb_justify_internal", "CB-JUSTIFY-INTERNAL", 1, 1, false);
            declareFunction("cb_justify_deduction", "CB-JUSTIFY-DEDUCTION", 1, 1, false);
            declareFunction("cb_justify_support", "CB-JUSTIFY-SUPPORT", 1, 1, false);
            declareFunction("cb_asserted_argument", "CB-ASSERTED-ARGUMENT", 1, 0, false);
            declareFunction("cb_show_support", "CB-SHOW-SUPPORT", 1, 1, false);
            declareFunction("cb_show_justification_readably", "CB-SHOW-JUSTIFICATION-READABLY", 1, 1, false);
            declareFunction("cb_hl_support", "CB-HL-SUPPORT", 1, 0, false);
            declareFunction("cb_link_hl_support", "CB-LINK-HL-SUPPORT", 1, 2, false);
            declareFunction("cb_hl_support_internal", "CB-HL-SUPPORT-INTERNAL", 2, 0, false);
            declareFunction("cb_hl_support_toolbar", "CB-HL-SUPPORT-TOOLBAR", 2, 0, false);
            declareFunction("cb_hl_support_info", "CB-HL-SUPPORT-INFO", 1, 0, false);
            declareFunction("cb_hl_support_show_formula_variants", "CB-HL-SUPPORT-SHOW-FORMULA-VARIANTS", 1, 0, false);
            declareFunction("cb_hl_support_justify", "CB-HL-SUPPORT-JUSTIFY", 1, 0, false);
            declareFunction("cb_hl_support_justify_int", "CB-HL-SUPPORT-JUSTIFY-INT", 2, 0, false);
            declareFunction("cb_hl_support_more_info", "CB-HL-SUPPORT-MORE-INFO", 1, 0, false);
            declareFunction("cb_hl_support_argument", "CB-HL-SUPPORT-ARGUMENT", 1, 0, false);
            declareFunction("cb_hl_support_dependents", "CB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
            declareFunction("cb_hl_support_identifier", "CB-HL-SUPPORT-IDENTIFIER", 1, 0, false);
            declareFunction("cb_guess_hl_support", "CB-GUESS-HL-SUPPORT", 1, 0, false);
            declareFunction("cb_link_hl_support_validate", "CB-LINK-HL-SUPPORT-VALIDATE", 2, 1, false);
            declareFunction("cb_hl_validate", "CB-HL-VALIDATE", 1, 0, false);
            declareFunction("cb_link_hl_support_similar_query", "CB-LINK-HL-SUPPORT-SIMILAR-QUERY", 1, 1, false);
            declareFunction("cb_hl_support_similar_query", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false);
            declareFunction("cb_clause_struc", "CB-CLAUSE-STRUC", 1, 0, false);
            declareFunction("cb_link_clause_struc", "CB-LINK-CLAUSE-STRUC", 1, 1, false);
            declareFunction("cb_form_clause_struc_method", "CB-FORM-CLAUSE-STRUC-METHOD", 1, 2, false);
            declareFunction("cb_clause_struc_internal", "CB-CLAUSE-STRUC-INTERNAL", 1, 0, false);
            declareFunction("cb_cnf", "CB-CNF", 2, 0, false);
            declareFunction("cb_guess_clause_struc", "CB-GUESS-CLAUSE-STRUC", 1, 0, false);
            declareFunction("cb_process_suggested_english", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_paraphrase_bugzilla_link", "CB-PARAPHRASE-BUGZILLA-LINK", 1, 2, false);
            declareFunction("cb_paraphrase_bugzilla_summary_for_cycl", "CB-PARAPHRASE-BUGZILLA-SUMMARY-FOR-CYCL", 1, 0, false);
            declareFunction("cb_paraphrase_bugzilla_comment_for_cycl", "CB-PARAPHRASE-BUGZILLA-COMMENT-FOR-CYCL", 1, 2, false);
            declareFunction("cb_describe_assertion", "CB-DESCRIBE-ASSERTION", 1, 0, false);
            declareFunction("cb_link_describe_assertion", "CB-LINK-DESCRIBE-ASSERTION", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_assertion_browser_file_Previous() {
        declareFunction("cb_find_assertion", "CB-FIND-ASSERTION", 0, 1, false);
        declareFunction("cb_find_assertion_internal", "CB-FIND-ASSERTION-INTERNAL", 2, 2, false);
        declareFunction("cb_link_find_assertion", "CB-LINK-FIND-ASSERTION", 0, 1, false);
        declareFunction("cb_handle_find_assertion", "CB-HANDLE-FIND-ASSERTION", 1, 0, false);
        declareFunction("cb_extract_find_assertion_args", "CB-EXTRACT-FIND-ASSERTION-ARGS", 1, 0, false);
        declareFunction("cb_find_similar_assertion", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false);
        declareFunction("cb_link_find_similar_assertion", "CB-LINK-FIND-SIMILAR-ASSERTION", 1, 1, false);
        declareFunction("cb_assertion", "CB-ASSERTION", 1, 0, false);
        declareFunction("cb_af", "CB-AF", 1, 0, false);
        declareFunction("cb_assertion_internal", "CB-ASSERTION-INTERNAL", 1, 0, false);
        declareFunction("cb_assertion_info", "CB-ASSERTION-INFO", 1, 0, false);
        declareFunction("cb_show_rule_info", "CB-SHOW-RULE-INFO", 1, 0, false);
        declareFunction("cb_assertion_diagnostics", "CB-ASSERTION-DIAGNOSTICS", 1, 0, false);
        declareFunction("cb_canonicalizer_problemP", "CB-CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("cb_canonicalizer_problems", "CB-CANONICALIZER-PROBLEMS", 1, 0, false);
        declareFunction("cb_assertion_exception_info", "CB-ASSERTION-EXCEPTION-INFO", 1, 0, false);
        declareFunction("cb_assertion_doomed_info", "CB-ASSERTION-DOOMED-INFO", 1, 0, false);
        declareFunction("cb_rule_assertion_analysis_info", "CB-RULE-ASSERTION-ANALYSIS-INFO", 1, 0, false);
        declareFunction("cb_assertion_access_diagnostics", "CB-ASSERTION-ACCESS-DIAGNOSTICS", 1, 0, false);
        declareFunction("cb_assertion_show_formula_variants", "CB-ASSERTION-SHOW-FORMULA-VARIANTS", 1, 0, false);
        declareFunction("rule_variable_arg_constraints_formula", "RULE-VARIABLE-ARG-CONSTRAINTS-FORMULA", 1, 0, false);
        declareFunction("constraint_formula_from_constraints_dict", "CONSTRAINT-FORMULA-FROM-CONSTRAINTS-DICT", 1, 1, false);
        declareFunction("cb_assertion_variable_info", "CB-ASSERTION-VARIABLE-INFO", 1, 0, false);
        declareFunction("assertion_variable_info_cols", "ASSERTION-VARIABLE-INFO-COLS", 2, 0, false);
        declareFunction("cb_show_formula_madlibs", "CB-SHOW-FORMULA-MADLIBS", 1, 0, false);
        declareFunction("cb_show_exception_rule_index", "CB-SHOW-EXCEPTION-RULE-INDEX", 1, 0, false);
        declareFunction("cb_show_exception_rule_rec", "CB-SHOW-EXCEPTION-RULE-REC", 1, 0, false);
        declareFunction("cb_show_exception_rule_rec_mt", "CB-SHOW-EXCEPTION-RULE-REC-MT", 2, 0, false);
        declareFunction("cb_show_pragma_rule_index", "CB-SHOW-PRAGMA-RULE-INDEX", 1, 0, false);
        declareFunction("cb_show_pragma_rule_rec", "CB-SHOW-PRAGMA-RULE-REC", 1, 0, false);
        declareFunction("cb_show_pragma_rule_rec_mt", "CB-SHOW-PRAGMA-RULE-REC-MT", 2, 0, false);
        declareFunction("cb_assertion_with_show_english", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false);
        declareFunction("cb_link_show_english", "CB-LINK-SHOW-ENGLISH", 1, 1, false);
        declareFunction("cb_assertion_with_show_el_formula", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false);
        declareFunction("cb_link_show_el_formula", "CB-LINK-SHOW-EL-FORMULA", 1, 1, false);
        declareFunction("cb_arguments", "CB-ARGUMENTS", 1, 0, false);
        declareFunction("cb_link_arguments", "CB-LINK-ARGUMENTS", 1, 1, false);
        declareFunction("cb_dependents", "CB-DEPENDENTS", 1, 0, false);
        declareFunction("cb_link_dependents", "CB-LINK-DEPENDENTS", 1, 1, false);
        declareFunction("cb_assertion_dependencies", "CB-ASSERTION-DEPENDENCIES", 1, 0, false);
        declareFunction("cb_link_assertion_dependencies", "CB-LINK-ASSERTION-DEPENDENCIES", 1, 1, false);
        declareFunction("cb_assertion_dependencies_internal", "CB-ASSERTION-DEPENDENCIES-INTERNAL", 1, 0, false);
        declareFunction("cb_assertion_dependencies_section", "CB-ASSERTION-DEPENDENCIES-SECTION", 1, 0, false);
        declareFunction("cb_deduction", "CB-DEDUCTION", 1, 0, false);
        declareFunction("cb_deduction_id_url", "CB-DEDUCTION-ID-URL", 1, 0, false);
        declareFunction("cb_link_deduction", "CB-LINK-DEDUCTION", 1, 1, false);
        declareFunction("cb_link_deduction_struct", "CB-LINK-DEDUCTION-STRUCT", 1, 1, false);
        declareFunction("cb_form_deduction_method", "CB-FORM-DEDUCTION-METHOD", 1, 2, false);
        declareFunction("cb_deduction_internal", "CB-DEDUCTION-INTERNAL", 1, 0, false);
        declareFunction("cb_deduction_toolbar", "CB-DEDUCTION-TOOLBAR", 1, 0, false);
        declareFunction("cb_goto_previous_deduction_control", "CB-GOTO-PREVIOUS-DEDUCTION-CONTROL", 1, 0, false);
        declareFunction("cb_goto_next_deduction_control", "CB-GOTO-NEXT-DEDUCTION-CONTROL", 1, 0, false);
        declareFunction("cb_deduction_info", "CB-DEDUCTION-INFO", 1, 0, false);
        declareFunction("cb_deduction_supports", "CB-DEDUCTION-SUPPORTS", 1, 0, false);
        declareFunction("cb_justify", "CB-JUSTIFY", 1, 0, false);
        declareFunction("cb_link_justify", "CB-LINK-JUSTIFY", 1, 1, false);
        declareFunction("cb_justify_internal", "CB-JUSTIFY-INTERNAL", 1, 1, false);
        declareFunction("cb_justify_deduction", "CB-JUSTIFY-DEDUCTION", 1, 1, false);
        declareFunction("cb_justify_support", "CB-JUSTIFY-SUPPORT", 1, 1, false);
        declareFunction("cb_asserted_argument", "CB-ASSERTED-ARGUMENT", 1, 0, false);
        declareFunction("cb_show_support", "CB-SHOW-SUPPORT", 1, 1, false);
        declareFunction("cb_show_justification_readably", "CB-SHOW-JUSTIFICATION-READABLY", 1, 1, false);
        declareFunction("cb_hl_support", "CB-HL-SUPPORT", 1, 0, false);
        declareFunction("cb_link_hl_support", "CB-LINK-HL-SUPPORT", 1, 2, false);
        declareFunction("cb_hl_support_internal", "CB-HL-SUPPORT-INTERNAL", 2, 0, false);
        declareFunction("cb_hl_support_toolbar", "CB-HL-SUPPORT-TOOLBAR", 2, 0, false);
        declareFunction("cb_hl_support_info", "CB-HL-SUPPORT-INFO", 1, 0, false);
        declareFunction("cb_hl_support_show_formula_variants", "CB-HL-SUPPORT-SHOW-FORMULA-VARIANTS", 1, 0, false);
        declareFunction("cb_hl_support_justify", "CB-HL-SUPPORT-JUSTIFY", 1, 0, false);
        declareFunction("cb_hl_support_justify_int", "CB-HL-SUPPORT-JUSTIFY-INT", 2, 0, false);
        declareFunction("cb_hl_support_more_info", "CB-HL-SUPPORT-MORE-INFO", 1, 0, false);
        declareFunction("cb_hl_support_argument", "CB-HL-SUPPORT-ARGUMENT", 1, 0, false);
        declareFunction("cb_hl_support_dependents", "CB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        declareFunction("cb_hl_support_identifier", "CB-HL-SUPPORT-IDENTIFIER", 1, 0, false);
        declareFunction("cb_guess_hl_support", "CB-GUESS-HL-SUPPORT", 1, 0, false);
        declareFunction("cb_link_hl_support_validate", "CB-LINK-HL-SUPPORT-VALIDATE", 2, 1, false);
        declareFunction("cb_hl_validate", "CB-HL-VALIDATE", 1, 0, false);
        declareFunction("cb_link_hl_support_similar_query", "CB-LINK-HL-SUPPORT-SIMILAR-QUERY", 1, 1, false);
        declareFunction("cb_hl_support_similar_query", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false);
        declareFunction("cb_clause_struc", "CB-CLAUSE-STRUC", 1, 0, false);
        declareFunction("cb_link_clause_struc", "CB-LINK-CLAUSE-STRUC", 1, 1, false);
        declareFunction("cb_form_clause_struc_method", "CB-FORM-CLAUSE-STRUC-METHOD", 1, 2, false);
        declareFunction("cb_clause_struc_internal", "CB-CLAUSE-STRUC-INTERNAL", 1, 0, false);
        declareFunction("cb_cnf", "CB-CNF", 2, 0, false);
        declareFunction("cb_guess_clause_struc", "CB-GUESS-CLAUSE-STRUC", 1, 0, false);
        declareFunction("cb_process_suggested_english", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_assertion_browser_file() {
        defparameter("*CB-ASSERTION-INFO-DEPENDENT-ASSERTION-COUNT-THRESHOLD*", $int$1000);
        deflexical("*CB-DEDUCTION-ID-URL-PATTERN*", $str166$cb_deduction__A);
        defparameter("*CB-JUSTIFY-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_assertion_browser_file_alt() {
        html_macros.note_html_handler_function(CB_FIND_ASSERTION);
        sethash($CB_FIND_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt4$cb_find_assertion_html, NIL));
        setup_cb_link_method($FIND_ASSERTION, CB_LINK_FIND_ASSERTION, ONE_INTEGER);
        declare_cb_tool($FIND_ASSERTION, $$$Find_Assertion, $$$FindAsrt, $$$Find_a_CycL_Assertion);
        html_macros.note_html_handler_function(CB_HANDLE_FIND_ASSERTION);
        html_macros.note_html_handler_function(CB_FIND_SIMILAR_ASSERTION);
        setup_cb_link_method($FIND_SIMILAR_ASSERTION, CB_LINK_FIND_SIMILAR_ASSERTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_ASSERTION);
        html_macros.note_html_handler_function(CB_AF);
        html_macros.note_html_handler_function(CB_ASSERTION_WITH_SHOW_ENGLISH);
        setup_cb_link_method($SHOW_ENGLISH, CB_LINK_SHOW_ENGLISH, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_ASSERTION_WITH_SHOW_EL_FORMULA);
        setup_cb_link_method($SHOW_EL_FORMULA, CB_LINK_SHOW_EL_FORMULA, TWO_INTEGER);
        sethash($CB_HL_DATA_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt113$cb_hl_data_assertion_html, NIL));
        html_macros.note_html_handler_function(CB_DESCRIBE_ASSERTION);
        setup_cb_link_method($DESCRIBE_ASSERTION, CB_LINK_DESCRIBE_ASSERTION, TWO_INTEGER);
        sethash($CB_ARGUMENTS, $cb_help_definitions$.getGlobalValue(), list($str_alt141$cb_arguments_html, NIL));
        html_macros.note_html_handler_function(CB_ARGUMENTS);
        setup_cb_link_method($ARGUMENTS, CB_LINK_ARGUMENTS, TWO_INTEGER);
        sethash($CB_DEPENDENTS, $cb_help_definitions$.getGlobalValue(), list($str_alt149$cb_dependents_html, NIL));
        html_macros.note_html_handler_function(CB_DEPENDENTS);
        setup_cb_link_method($DEPENDENTS, CB_LINK_DEPENDENTS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_DEDUCTION);
        setup_cb_link_method($DEDUCTION, CB_LINK_DEDUCTION, TWO_INTEGER);
        setup_cb_link_method($DEDUCTION_STRUCT, CB_LINK_DEDUCTION_STRUCT, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), symbol_function(CB_FORM_DEDUCTION_METHOD));
        sethash($CB_SOURCE, $cb_help_definitions$.getGlobalValue(), list($str_alt174$cb_source_html, NIL));
        register_html_state_variable($cb_justify_table$);
        sethash($CB_JUSTIFY, $cb_help_definitions$.getGlobalValue(), list($str_alt186$cb_justify_html, NIL));
        html_macros.note_html_handler_function(CB_JUSTIFY);
        setup_cb_link_method($JUSTIFY, CB_LINK_JUSTIFY, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HL_SUPPORT);
        setup_cb_link_method($HL_SUPPORT, CB_LINK_HL_SUPPORT, THREE_INTEGER);
        sethash($CB_HL_SUPPORT, $cb_help_definitions$.getGlobalValue(), list($str_alt217$cb_hl_support_html, NIL));
        setup_cb_link_method($HL_SUPPORT_VALIDATE, CB_LINK_HL_SUPPORT_VALIDATE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HL_VALIDATE);
        setup_cb_link_method($HL_SUPPORT_SIMILAR_QUERY, CB_LINK_HL_SUPPORT_SIMILAR_QUERY, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HL_SUPPORT_SIMILAR_QUERY);
        html_macros.note_html_handler_function(CB_CLAUSE_STRUC);
        setup_cb_link_method($CLAUSE_STRUC, CB_LINK_CLAUSE_STRUC, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), symbol_function(CB_FORM_CLAUSE_STRUC_METHOD));
        sethash($CB_CLAUSE_STRUC, $cb_icon_definitions$.getGlobalValue(), list($str_alt242$cb_clause_struc_html, NIL));
        html_macros.note_html_handler_function(CB_PROCESS_SUGGESTED_ENGLISH);
        return NIL;
    }

    public static SubLObject setup_cb_assertion_browser_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(CB_FIND_ASSERTION, $HTML_HANDLER);
            sethash($CB_FIND_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str5$cb_find_assertion_html, NIL));
            setup_cb_link_method($FIND_ASSERTION, CB_LINK_FIND_ASSERTION, ONE_INTEGER);
            declare_cb_tool($FIND_ASSERTION, $$$Find_Assertion, $$$FindAsrt, $$$Find_a_CycL_Assertion);
            html_macros.note_cgi_handler_function(CB_HANDLE_FIND_ASSERTION, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_FIND_SIMILAR_ASSERTION, $HTML_HANDLER);
            setup_cb_link_method($FIND_SIMILAR_ASSERTION, CB_LINK_FIND_SIMILAR_ASSERTION, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERTION, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_AF, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_ASSERTION_WITH_SHOW_ENGLISH, $HTML_HANDLER);
            setup_cb_link_method($SHOW_ENGLISH, CB_LINK_SHOW_ENGLISH, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERTION_WITH_SHOW_EL_FORMULA, $HTML_HANDLER);
            setup_cb_link_method($SHOW_EL_FORMULA, CB_LINK_SHOW_EL_FORMULA, TWO_INTEGER);
            sethash($CB_ARGUMENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str136$cb_arguments_html, NIL));
            html_macros.note_cgi_handler_function(CB_ARGUMENTS, $HTML_HANDLER);
            setup_cb_link_method($ARGUMENTS, CB_LINK_ARGUMENTS, TWO_INTEGER);
            sethash($CB_DEPENDENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str144$cb_dependents_html, NIL));
            html_macros.note_cgi_handler_function(CB_DEPENDENTS, $HTML_HANDLER);
            setup_cb_link_method($DEPENDENTS, CB_LINK_DEPENDENTS, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERTION_DEPENDENCIES, $HTML_HANDLER);
            setup_cb_link_method($ASSERTION_DEPENDENCIES, CB_LINK_ASSERTION_DEPENDENCIES, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_DEDUCTION, $HTML_HANDLER);
            setup_cb_link_method($DEDUCTION, CB_LINK_DEDUCTION, TWO_INTEGER);
            setup_cb_link_method($DEDUCTION_STRUCT, CB_LINK_DEDUCTION_STRUCT, TWO_INTEGER);
            register_method($cb_form_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(CB_FORM_DEDUCTION_METHOD));
            sethash($CB_SOURCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str180$cb_source_html, NIL));
            register_html_state_variable($cb_justify_table$);
            sethash($CB_JUSTIFY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str204$cb_justify_html, NIL));
            html_macros.note_cgi_handler_function(CB_JUSTIFY, $HTML_HANDLER);
            setup_cb_link_method($JUSTIFY, CB_LINK_JUSTIFY, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_HL_SUPPORT, $HTML_HANDLER);
            setup_cb_link_method($HL_SUPPORT, CB_LINK_HL_SUPPORT, THREE_INTEGER);
            sethash($CB_HL_SUPPORT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str237$cb_hl_support_html, NIL));
            setup_cb_link_method($HL_SUPPORT_VALIDATE, CB_LINK_HL_SUPPORT_VALIDATE, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_HL_VALIDATE, $HTML_HANDLER);
            setup_cb_link_method($HL_SUPPORT_SIMILAR_QUERY, CB_LINK_HL_SUPPORT_SIMILAR_QUERY, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_HL_SUPPORT_SIMILAR_QUERY, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_CLAUSE_STRUC, $HTML_HANDLER);
            setup_cb_link_method($CLAUSE_STRUC, CB_LINK_CLAUSE_STRUC, TWO_INTEGER);
            register_method($cb_form_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), symbol_function(CB_FORM_CLAUSE_STRUC_METHOD));
            sethash($CB_CLAUSE_STRUC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str268$cb_clause_struc_html, NIL));
            html_macros.note_cgi_handler_function(CB_PROCESS_SUGGESTED_ENGLISH, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_FIND_ASSERTION);
            sethash($CB_FIND_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt4$cb_find_assertion_html, NIL));
            html_macros.note_html_handler_function(CB_HANDLE_FIND_ASSERTION);
            html_macros.note_html_handler_function(CB_FIND_SIMILAR_ASSERTION);
            html_macros.note_html_handler_function(CB_ASSERTION);
            html_macros.note_html_handler_function(CB_AF);
            html_macros.note_html_handler_function(CB_ASSERTION_WITH_SHOW_ENGLISH);
            html_macros.note_html_handler_function(CB_ASSERTION_WITH_SHOW_EL_FORMULA);
            sethash($CB_HL_DATA_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt113$cb_hl_data_assertion_html, NIL));
            html_macros.note_html_handler_function(CB_DESCRIBE_ASSERTION);
            setup_cb_link_method($DESCRIBE_ASSERTION, CB_LINK_DESCRIBE_ASSERTION, TWO_INTEGER);
            sethash($CB_ARGUMENTS, $cb_help_definitions$.getGlobalValue(), list($str_alt141$cb_arguments_html, NIL));
            html_macros.note_html_handler_function(CB_ARGUMENTS);
            sethash($CB_DEPENDENTS, $cb_help_definitions$.getGlobalValue(), list($str_alt149$cb_dependents_html, NIL));
            html_macros.note_html_handler_function(CB_DEPENDENTS);
            html_macros.note_html_handler_function(CB_DEDUCTION);
            sethash($CB_SOURCE, $cb_help_definitions$.getGlobalValue(), list($str_alt174$cb_source_html, NIL));
            sethash($CB_JUSTIFY, $cb_help_definitions$.getGlobalValue(), list($str_alt186$cb_justify_html, NIL));
            html_macros.note_html_handler_function(CB_JUSTIFY);
            html_macros.note_html_handler_function(CB_HL_SUPPORT);
            sethash($CB_HL_SUPPORT, $cb_help_definitions$.getGlobalValue(), list($str_alt217$cb_hl_support_html, NIL));
            html_macros.note_html_handler_function(CB_HL_VALIDATE);
            html_macros.note_html_handler_function(CB_HL_SUPPORT_SIMILAR_QUERY);
            html_macros.note_html_handler_function(CB_CLAUSE_STRUC);
            sethash($CB_CLAUSE_STRUC, $cb_icon_definitions$.getGlobalValue(), list($str_alt242$cb_clause_struc_html, NIL));
            html_macros.note_html_handler_function(CB_PROCESS_SUGGESTED_ENGLISH);
        }
        return NIL;
    }

    public static SubLObject setup_cb_assertion_browser_file_Previous() {
        html_macros.note_cgi_handler_function(CB_FIND_ASSERTION, $HTML_HANDLER);
        sethash($CB_FIND_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str5$cb_find_assertion_html, NIL));
        setup_cb_link_method($FIND_ASSERTION, CB_LINK_FIND_ASSERTION, ONE_INTEGER);
        declare_cb_tool($FIND_ASSERTION, $$$Find_Assertion, $$$FindAsrt, $$$Find_a_CycL_Assertion);
        html_macros.note_cgi_handler_function(CB_HANDLE_FIND_ASSERTION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FIND_SIMILAR_ASSERTION, $HTML_HANDLER);
        setup_cb_link_method($FIND_SIMILAR_ASSERTION, CB_LINK_FIND_SIMILAR_ASSERTION, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_AF, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_WITH_SHOW_ENGLISH, $HTML_HANDLER);
        setup_cb_link_method($SHOW_ENGLISH, CB_LINK_SHOW_ENGLISH, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_WITH_SHOW_EL_FORMULA, $HTML_HANDLER);
        setup_cb_link_method($SHOW_EL_FORMULA, CB_LINK_SHOW_EL_FORMULA, TWO_INTEGER);
        sethash($CB_ARGUMENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str136$cb_arguments_html, NIL));
        html_macros.note_cgi_handler_function(CB_ARGUMENTS, $HTML_HANDLER);
        setup_cb_link_method($ARGUMENTS, CB_LINK_ARGUMENTS, TWO_INTEGER);
        sethash($CB_DEPENDENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str144$cb_dependents_html, NIL));
        html_macros.note_cgi_handler_function(CB_DEPENDENTS, $HTML_HANDLER);
        setup_cb_link_method($DEPENDENTS, CB_LINK_DEPENDENTS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_DEPENDENCIES, $HTML_HANDLER);
        setup_cb_link_method($ASSERTION_DEPENDENCIES, CB_LINK_ASSERTION_DEPENDENCIES, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DEDUCTION, $HTML_HANDLER);
        setup_cb_link_method($DEDUCTION, CB_LINK_DEDUCTION, TWO_INTEGER);
        setup_cb_link_method($DEDUCTION_STRUCT, CB_LINK_DEDUCTION_STRUCT, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(CB_FORM_DEDUCTION_METHOD));
        sethash($CB_SOURCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str180$cb_source_html, NIL));
        register_html_state_variable($cb_justify_table$);
        sethash($CB_JUSTIFY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str204$cb_justify_html, NIL));
        html_macros.note_cgi_handler_function(CB_JUSTIFY, $HTML_HANDLER);
        setup_cb_link_method($JUSTIFY, CB_LINK_JUSTIFY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HL_SUPPORT, $HTML_HANDLER);
        setup_cb_link_method($HL_SUPPORT, CB_LINK_HL_SUPPORT, THREE_INTEGER);
        sethash($CB_HL_SUPPORT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str237$cb_hl_support_html, NIL));
        setup_cb_link_method($HL_SUPPORT_VALIDATE, CB_LINK_HL_SUPPORT_VALIDATE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HL_VALIDATE, $HTML_HANDLER);
        setup_cb_link_method($HL_SUPPORT_SIMILAR_QUERY, CB_LINK_HL_SUPPORT_SIMILAR_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HL_SUPPORT_SIMILAR_QUERY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CLAUSE_STRUC, $HTML_HANDLER);
        setup_cb_link_method($CLAUSE_STRUC, CB_LINK_CLAUSE_STRUC, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), symbol_function(CB_FORM_CLAUSE_STRUC_METHOD));
        sethash($CB_CLAUSE_STRUC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str268$cb_clause_struc_html, NIL));
        html_macros.note_cgi_handler_function(CB_PROCESS_SUGGESTED_ENGLISH, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_assertion_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_assertion_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_assertion_browser_file();
    }

    static {
    }

    static private final SubLString $str_alt1$cb_handle_find_assertion = makeString("cb-handle-find-assertion");

    static private final SubLString $str_alt4$cb_find_assertion_html = makeString("cb-find-assertion.html");

    static private final SubLString $str_alt7$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt8$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    static private final SubLString $str_alt11$use_genl_mts = makeString("use-genl-mts");

    static private final SubLString $str_alt13$Additionally_search_genlMts_for_t = makeString("Additionally search genlMts for this assertion");

    static private final SubLString $str_alt15$cb_find_assertion = makeString("cb-find-assertion");

    static private final SubLString $str_alt20$Sentence_was_not_well_formed_ = makeString("Sentence was not well-formed.");

    static private final SubLString $str_alt21$No_assertions_were_found_ = makeString("No assertions were found.");

    static private final SubLString $str_alt22$Some_assertions_were_found__ = makeString("Some assertions were found :");

    static private final SubLList $list_alt24 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    static private final SubLList $list_alt25 = list(makeSymbol("ASSERTION-ID"));

    static private final SubLString $str_alt26$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    static private final SubLString $str_alt30$_Find_Similar_ = makeString("[Find Similar]");

    static private final SubLString $str_alt32$cb_find_similar_assertion__A = makeString("cb-find-similar-assertion&~A");

    static private final SubLString $str_alt37$Cyc_Assertion___A = makeString("Cyc Assertion #~A");

    static private final SubLString $str_alt38$Public_ = makeString("Public ");

    static private final SubLString $str_alt39$Cyc_Assertion_ = makeString("Cyc Assertion ");

    static private final SubLString $str_alt40$Meta_Assertions__ = makeString("Meta Assertions :");

    static private final SubLString $str_alt42$Truth___ = makeString("Truth : ");

    static private final SubLString $str_alt43$Strength___ = makeString("Strength : ");

    static private final SubLString $str_alt44$Direction___ = makeString("Direction : ");

    static private final SubLString $str_alt46$Arguments___ = makeString("Arguments : ");

    static private final SubLString $str_alt48$Dependents___ = makeString("Dependents : ");

    static private final SubLString $str_alt51$Backward_Inference_Statistics__ = makeString("Backward Inference Statistics :");

    static private final SubLString $str_alt55$_Clear_ = makeString("[Clear]");

    static private final SubLString $str_alt57$Forward_Inference_Statistics__ = makeString("Forward Inference Statistics :");

    static private final SubLString $str_alt58$Modification_of_this_Assertion_is = makeString("Modification of this Assertion is not permitted.");

    static private final SubLString $str_alt60$Assertion_Access_Problem__ = makeString("Assertion Access Problem :");

    static private final SubLString $str_alt61$Assertion_is_either_miscanonicali = makeString("Assertion is either miscanonicalized or incorrectly indexed.");

    static private final SubLString $str_alt62$Assertion_Not_Well_formed__ = makeString("Assertion Not Well-formed :");

    static private final SubLString $str_alt63$EL_and_ = makeString("EL and ");

    static private final SubLString $str_alt64$EL_Formula___ = makeString("EL Formula : ");

    static private final SubLString $str_alt65$HL_Formula___ = makeString("HL Formula : ");

    static private final SubLString $str_alt66$English_Translation___ = makeString("English Translation : ");

    static private final SubLString $str_alt67$_CB_SHOW_ASSERTION_READABLY__FIND = makeString("(CB-SHOW-ASSERTION-READABLY (FIND-ASSERTION-CYCL '~S ~S) NIL NIL)");

    static private final SubLString $str_alt68$cb_process_suggested_english = makeString("cb-process-suggested-english");

    static private final SubLString $str_alt69$assertion_id = makeString("assertion-id");

    static private final SubLString $str_alt70$Please_suggest_better_English_tra = makeString("Please suggest better English translations (if any): ");

    static private final SubLString $str_alt71$Sentence__ = makeString("Sentence: ");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $str_alt74$sentence_type = makeString("sentence-type");

    private static final SubLSymbol $COMMON = makeKeyword("COMMON");

    static private final SubLString $$$commonly_used = makeString("commonly used");

    static private final SubLString $str_alt78$precise__Cyclish_ = makeString("precise (Cyclish)");

    static private final SubLString $str_alt79$Question__ = makeString("Question: ");

    static private final SubLString $str_alt81$question_type = makeString("question-type");

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$NL = makeString("NL");

    static private final SubLString $$$NL_Generation = makeString("NL Generation");

    static private final SubLString $str_alt87$Bad_paraphrase___S = makeString("Bad paraphrase: ~S");

    static private final SubLString $str_alt88$_GENERATE_PHRASE__S_ = makeString("(GENERATE-PHRASE ~S)");

    static private final SubLString $str_alt89$Paraphrase___S = makeString("Paraphrase: ~S");

    static private final SubLString $str_alt90$SubL___A = makeString("SubL: ~A");

    static private final SubLString $str_alt92$____which_ought_to_parse_any_of__ = makeString("... which ought to parse any of: ");

    static private final SubLList $list_alt93 = list(makeSymbol("SYNTAX"), makeSymbol("SEMANTICS"));

    static private final SubLString $str_alt94$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt95$Exceptions__ = makeString("Exceptions :");

    static private final SubLString $str_alt101$Pragmatic_Requirements__ = makeString("Pragmatic Requirements :");

    static private final SubLString $str_alt103$_Show_English_ = makeString("[Show English]");

    static private final SubLString $str_alt104$cb_assertion_with_show_english__a = makeString("cb-assertion-with-show-english&~a");

    static private final SubLString $str_alt108$_EL_Formula_ = makeString("[EL Formula]");

    static private final SubLString $str_alt109$cb_assertion_with_show_el_formula = makeString("cb-assertion-with-show-el-formula&~a");

    private static final SubLSymbol $CB_HL_DATA_ASSERTION = makeKeyword("CB-HL-DATA-ASSERTION");

    static private final SubLString $str_alt113$cb_hl_data_assertion_html = makeString("cb-hl-data-assertion.html");

    static private final SubLString $$$the_Assertion_HL_Data_page = makeString("the Assertion HL Data page");

    static private final SubLString $str_alt115$_a_does_not_specify_a_Cyc_asserti = makeString("~a does not specify a Cyc assertion");

    static private final SubLString $$$Assertion_HL_Data = makeString("Assertion HL Data");

    static private final SubLString $str_alt117$HL_Data_for_Assertion__ = makeString("HL Data for Assertion :");

    static private final SubLString $str_alt120$ID_Number__ = makeString("ID Number :");

    static private final SubLString $str_alt122$Formula_Data__ = makeString("Formula Data :");

    static private final SubLString $str_alt123$Mt__ = makeString("Mt :");

    static private final SubLString $str_alt124$Flags__ = makeString("Flags :");

    static private final SubLString $str_alt125$GAF___ = makeString("GAF? :");

    static private final SubLString $$$True = makeString("True");

    static private final SubLString $$$False = makeString("False");

    static private final SubLString $str_alt128$Direction__ = makeString("Direction :");

    static private final SubLString $str_alt129$Truth__ = makeString("Truth :");

    static private final SubLString $str_alt130$Strength__ = makeString("Strength :");

    static private final SubLString $str_alt131$Arguments__ = makeString("Arguments :");

    static private final SubLString $str_alt132$PList__ = makeString("PList :");

    static private final SubLString $str_alt133$_a__ = makeString("~a :");

    static private final SubLString $str_alt134$_a = makeString("~a");

    private static final SubLSymbol CB_DESCRIBE_ASSERTION = makeSymbol("CB-DESCRIBE-ASSERTION");

    static private final SubLString $str_alt136$_HL_Data_ = makeString("[HL Data]");

    static private final SubLString $str_alt137$cb_describe_assertion__A = makeString("cb-describe-assertion&~A");

    private static final SubLSymbol $DESCRIBE_ASSERTION = makeKeyword("DESCRIBE-ASSERTION");

    private static final SubLSymbol CB_LINK_DESCRIBE_ASSERTION = makeSymbol("CB-LINK-DESCRIBE-ASSERTION");

    static private final SubLString $str_alt141$cb_arguments_html = makeString("cb-arguments.html");

    static private final SubLString $str_alt142$_A_does_not_specify_an_assertion = makeString("~A does not specify an assertion");

    static private final SubLString $str_alt143$Arguments_for_Assertion___S = makeString("Arguments for Assertion #~S");

    static private final SubLString $str_alt144$Assertion___ = makeString("Assertion : ");

    static private final SubLString $str_alt146$cb_arguments__A = makeString("cb-arguments&~A");

    static private final SubLString $str_alt149$cb_dependents_html = makeString("cb-dependents.html");

    static private final SubLString $str_alt150$Dependents_for_Assertion___S = makeString("Dependents for Assertion #~S");

    static private final SubLString $str_alt151$_A_Arguments_Deduced_using_Assert = makeString("~A Arguments Deduced using Assertion: ");

    static private final SubLString $str_alt152$Argument_Deduced_using_Assertion_ = makeString("Argument Deduced using Assertion: ");

    static private final SubLString $str_alt153$_A__ = makeString("~A :");

    static private final SubLString $str_alt155$_supporting__ = makeString(" supporting :");

    static private final SubLString $str_alt157$cb_dependents__A = makeString("cb-dependents&~A");

    static private final SubLString $str_alt159$_A_does_not_specify_an_argument = makeString("~A does not specify an argument");

    static private final SubLString $str_alt162$cb_deduction__A = makeString("cb-deduction&~A");

    static private final SubLString $str_alt163$Deduction___A = makeString("Deduction #~A");

    static private final SubLString $str_alt165$__ = makeString("#<");

    static private final SubLString $str_alt166$DEDUCTION___A = makeString("DEDUCTION #~A");

    static private final SubLString $str_alt167$_ = makeString(">");

    static private final SubLString $str_alt168$__DEDUCTION___ = makeString("#<DEDUCTION ?>");

    static private final SubLString $str_alt174$cb_source_html = makeString("cb-source.html");

    static private final SubLString $str_alt175$Deduced_Argument___S = makeString("Deduced Argument #~S");

    static private final SubLString $str_alt176$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $str_alt178$_Remove_Deduction_ = makeString("[Remove Deduction]");

    static private final SubLString $str_alt180$Conclusion__ = makeString("Conclusion :");

    static private final SubLString $str_alt181$Mt___ = makeString("Mt : ");

    static private final SubLString $str_alt182$Supported_conclusion_is_invalid_ = makeString("Supported conclusion is invalid!");

    static private final SubLString $str_alt183$Justification___ = makeString("Justification : ");

    static private final SubLString $str_alt186$cb_justify_html = makeString("cb-justify.html");

    static private final SubLString $str_alt188$Full_justification_for_Assertion_ = makeString("Full justification for Assertion #~S");

    static private final SubLString $str_alt189$Assertion_Supported__ = makeString("Assertion Supported :");

    static private final SubLString $str_alt191$_Justify_ = makeString("[Justify]");

    static private final SubLString $str_alt192$cb_justify__A = makeString("cb-justify&~A");

    static private final SubLString $str_alt195$Complete_Justification_for_Assert = makeString("Complete Justification for Assertion :");

    static private final SubLString $str_alt196$Arguments_Supporting_Assertion__ = makeString("Arguments Supporting Assertion :");

    static private final SubLString $str_alt197$Argument___ = makeString("Argument : ");

    static private final SubLString $str_alt202$_by_ = makeString(" by ");

    static private final SubLString $str_alt203$_on_ = makeString(" on ");

    static private final SubLString $str_alt204$_at_ = makeString(" at ");

    static private final SubLString $str_alt205$_for_ = makeString(" for ");

    static private final SubLList $list_alt207 = list(makeSymbol("ID"), makeSymbol("VALIDATION-LEVEL-STR"));

    static private final SubLString $str_alt208$_A_does_not_specify_an_HL_support = makeString("~A does not specify an HL support");

    static private final SubLString $str_alt212$cb_hl_support__A__A = makeString("cb-hl-support&~A&~A");

    static private final SubLString $str_alt217$cb_hl_support_html = makeString("cb-hl-support.html");

    static private final SubLString $str_alt219$_Validate_ = makeString("[Validate]");

    static private final SubLString $str_alt221$_Query_Similar_ = makeString("[Query Similar]");

    static private final SubLString $str_alt223$Module___ = makeString("Module : ");

    static private final SubLString $str_alt226$cb_hl_validate__A__A = makeString("cb-hl-validate&~A&~A");

    static private final SubLString $str_alt228$The_hl_support_is_not_available_ = makeString("The hl-support is not available.");

    static private final SubLString $str_alt230$cb_hl_support_similar_query__A = makeString("cb-hl-support-similar-query&~A");

    static private final SubLString $str_alt233$_A_does_not_specify_an_HL_clause_ = makeString("~A does not specify an HL clause-struc");

    static private final SubLString $str_alt236$cb_clause_struc__A = makeString("cb-clause-struc&~A");

    static private final SubLString $str_alt237$CLAUSE_STRUC___S = makeString("CLAUSE-STRUC #~S");

    static private final SubLString $str_alt242$cb_clause_struc_html = makeString("cb-clause-struc.html");

    static private final SubLString $str_alt243$Clause_Struc___S = makeString("Clause Struc #~S");

    static private final SubLString $str_alt244$CNF_clause___ = makeString("CNF clause : ");

    static private final SubLString $str_alt245$Assertions_using_this_clause___ = makeString("Assertions using this clause : ");

    static private final SubLString $str_alt246$__ = makeString("((");

    static private final SubLString $str_alt247$_ = makeString(")");

    static private final SubLString $str_alt248$_ = makeString("(");

    static private final SubLString $str_alt249$__ = makeString("))");
}

/**
 * Total time: 1639 ms
 */
