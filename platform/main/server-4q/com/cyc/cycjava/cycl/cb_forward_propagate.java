/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-FORWARD-PROPAGATE
 *  source file: /cyc/top/cycl/cb-forward-propagate.lisp
 *  created:     2019/07/03 17:38:12
 */
public final class cb_forward_propagate extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_forward_propagate() {
    }

    public static final SubLFile me = new cb_forward_propagate();


    // // Definitions
    public static final SubLObject cb_forward_propagate_mt_background(SubLObject source_mt, SubLObject target_mt, SubLObject filter_trivial, SubLObject number, SubLObject time, SubLObject depth) {
        if (target_mt == UNPROVIDED) {
            target_mt = source_mt;
        }
        if (filter_trivial == UNPROVIDED) {
            filter_trivial = T;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject process_name = format(NIL, $str_alt0$Forward_Propagating__S_into__S, source_mt, target_mt);
            return subl_promotions.make_process_with_args(process_name, symbol_function(CB_FORWARD_PROPAGATE_MT_WRAPPER), list(source_mt, target_mt, filter_trivial, number, time, depth));
        }
    }

    public static final SubLObject cb_forward_propagate_mt_wrapper(SubLObject source_mt, SubLObject target_mt, SubLObject filter_trivial, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$filter_deductions_for_trivially_derivable_gafs$.currentBinding(thread);
                    try {
                        control_vars.$filter_deductions_for_trivially_derivable_gafs$.bind(filter_trivial, thread);
                        v_answer = forward_propagate_assertions.forward_propagate_mt(source_mt, target_mt, number, time, depth);
                    } finally {
                        control_vars.$filter_deductions_for_trivially_derivable_gafs$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject cb_link_forward_propagate_mt(SubLObject linktext, SubLObject mt) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt2$_Forward_Propagate_Mt_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt4$cb_forward_propagate_mt__A, cb_utilities.cb_fort_identifier(mt));
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
    public static final SubLSymbol $cb_forward_propagate_mt_default_mt$ = makeSymbol("*CB-FORWARD-PROPAGATE-MT-DEFAULT-MT*");

    // defparameter
    public static final SubLSymbol $cb_forward_propagate_mt_default_filter_trivial_deductions$ = makeSymbol("*CB-FORWARD-PROPAGATE-MT-DEFAULT-FILTER-TRIVIAL-DEDUCTIONS*");

    // defparameter
    public static final SubLSymbol $cb_forward_propagate_mt_default_number$ = makeSymbol("*CB-FORWARD-PROPAGATE-MT-DEFAULT-NUMBER*");

    // defparameter
    public static final SubLSymbol $cb_forward_propagate_mt_default_time$ = makeSymbol("*CB-FORWARD-PROPAGATE-MT-DEFAULT-TIME*");

    // defparameter
    public static final SubLSymbol $cb_forward_propagate_mt_default_depth$ = makeSymbol("*CB-FORWARD-PROPAGATE-MT-DEFAULT-DEPTH*");

    public static final SubLObject cb_forward_propagate_mt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject mt = $cb_forward_propagate_mt_default_mt$.getDynamicValue(thread);
                SubLObject filter_trivial_deductions = $cb_forward_propagate_mt_default_filter_trivial_deductions$.getDynamicValue(thread);
                SubLObject number = $cb_forward_propagate_mt_default_number$.getDynamicValue(thread);
                SubLObject time = $cb_forward_propagate_mt_default_time$.getDynamicValue(thread);
                SubLObject depth = $cb_forward_propagate_mt_default_depth$.getDynamicValue(thread);
                SubLObject mt_error = NIL;
                if (((NIL != args) && args.isList()) && (NIL != args.first())) {
                    {
                        SubLObject guess_mt = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                        if (NIL != hlmt.hlmt_p(guess_mt)) {
                            mt = guess_mt;
                        }
                    }
                }
                {
                    SubLObject title_var = $$$Forward_Propagate_Mt;
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
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt16$cb_forward_propagate_mt_handler, T, UNPROVIDED);
                                                        cb_utilities.cb_help_preamble($CB_FORWARD_PROPAGATE_MT, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_submit_input($str_alt17$Submit_Forward_Propagation_Settin, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt18$Mt___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_arghash.html_arghash_fort_input(arghash, $MT, mt, cb_parameters.$cb_constant_input_width$.getDynamicValue(thread), $$$Complete, $$Microtheory);
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                        html_arghash.html_arghash_clear_input_button(arghash, $MT, $FORT, $$$Clear_Mt);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        if (NIL != mt_error) {
                                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                            if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                                                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(mt_error);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                        }
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.set_arghash_value($FILTER_TRIVIAL_DEDUCTIONS, arghash, filter_trivial_deductions);
                                                        html_arghash.html_arghash_checkbox_input(arghash, $FILTER_TRIVIAL_DEDUCTIONS, T, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                        html_utilities.html_princ($str_alt25$_Filter_trival_deductions);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
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
                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                html_utilities.html_princ($$$Number_Cutoff);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                html_utilities.html_princ($$$Time_Cutoff);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                html_utilities.html_princ($$$Depth_Cutoff);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.set_arghash_value($CUTOFF_NUMBER, arghash, list_utilities.sublisp_boolean(number));
                                                                                html_arghash.html_arghash_focus_radio_input(arghash, $CUTOFF_NUMBER, $NUMBER, $INTEGER, T, $BOOLEAN);
                                                                                html_utilities.html_indent(UNPROVIDED);
                                                                                html_arghash.html_arghash_text_input(arghash, $NUMBER, number, FOUR_INTEGER, $INTEGER);
                                                                                html_utilities.html_princ($str_alt33$_answers);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.set_arghash_value($CUTOFF_TIME, arghash, list_utilities.sublisp_boolean(time));
                                                                                html_arghash.html_arghash_focus_radio_input(arghash, $CUTOFF_TIME, $TIME, $INTEGER, T, $BOOLEAN);
                                                                                html_utilities.html_indent(UNPROVIDED);
                                                                                html_arghash.html_arghash_text_input(arghash, $TIME, time, FOUR_INTEGER, $INTEGER);
                                                                                html_utilities.html_princ($str_alt36$_seconds);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.set_arghash_value($CUTOFF_DEPTH, arghash, list_utilities.sublisp_boolean(depth));
                                                                                html_arghash.html_arghash_focus_radio_input(arghash, $CUTOFF_DEPTH, $DEPTH, $INTEGER, T, $BOOLEAN);
                                                                                html_utilities.html_indent(UNPROVIDED);
                                                                                html_arghash.html_arghash_text_input(arghash, $DEPTH, depth, FOUR_INTEGER, $INTEGER);
                                                                                html_utilities.html_princ($str_alt39$_proof_steps);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.html_arghash_clear_radio_input(arghash, $CUTOFF_NUMBER, $NUMBER, $INTEGER, NIL, $BOOLEAN);
                                                                                html_utilities.html_princ($str_alt40$_Get_Everything);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.html_arghash_clear_radio_input(arghash, $CUTOFF_TIME, $TIME, $INTEGER, NIL, $BOOLEAN);
                                                                                html_utilities.html_princ($str_alt41$_Run_Forever);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_arghash.html_arghash_clear_radio_input(arghash, $CUTOFF_DEPTH, $DEPTH, $INTEGER, NIL, $BOOLEAN);
                                                                                html_utilities.html_princ($str_alt42$_Infinite_Depth);
                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_forward_propagate_mt_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject mt = NIL;
                SubLObject filter_trivial_deductions = NIL;
                SubLObject number = NIL;
                SubLObject time = NIL;
                SubLObject depth = NIL;
                SubLObject target_mt = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject value = html_arghash.get_arghash_value($MT, arghash);
                    SubLObject has_valueP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != has_valueP) {
                        if ((NIL != forts.fort_p(value)) && (NIL != isa.isa_in_any_mtP(value, $$Microtheory))) {
                            mt = value;
                        } else {
                            cb_utilities.cb_error(format(NIL, $str_alt44$__A__is_not_a_Microtheory, html_utilities.html_extract_input($str_alt45$__mt, args)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject value = html_arghash.get_arghash_value($FILTER_TRIVIAL_DEDUCTIONS, arghash);
                    SubLObject has_valueP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != has_valueP) {
                        filter_trivial_deductions = value;
                    }
                }
                if (NIL != html_arghash.get_arghash_value($CUTOFF_NUMBER, arghash)) {
                    {
                        SubLObject poss_number = html_arghash.get_arghash_value($NUMBER, arghash);
                        if (poss_number.isInteger()) {
                            number = poss_number;
                        } else {
                            cb_utilities.cb_error($str_alt46$Number_cutoff_must_be_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    number = NIL;
                }
                if (NIL != html_arghash.get_arghash_value($CUTOFF_TIME, arghash)) {
                    {
                        SubLObject poss_time = html_arghash.get_arghash_value($TIME, arghash);
                        if (poss_time.isInteger()) {
                            time = poss_time;
                        } else {
                            cb_utilities.cb_error($str_alt47$Time_cutoff_must_be_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    time = NIL;
                }
                if (NIL != html_arghash.get_arghash_value($CUTOFF_DEPTH, arghash)) {
                    {
                        SubLObject poss_depth = html_arghash.get_arghash_value($DEPTH, arghash);
                        if (poss_depth.isInteger()) {
                            depth = poss_depth;
                        } else {
                            cb_utilities.cb_error($str_alt48$Depth_cutoff_must_be_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    depth = NIL;
                }
                target_mt = prove.hypothesize_spec_mt(mt, $str_alt49$Forward_Prop);
                cb_tools.cb_add_to_constant_history(target_mt);
                {
                    SubLObject title_var = $$$Forward_Propagate_Mt;
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
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt50$cb_forward_propagate_mt_handler_v, T, UNPROVIDED);
                                                        cb_utilities.cb_help_preamble($CB_FORWARD_PROPAGATE_MT, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Start_Forward_Propagation, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_princ($str_alt52$Are_you_sure_you_want_to_run_forw);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_arghash.html_arghash_hidden_input_force(arghash, $TARGET_MT, target_mt, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt54$Target_mt___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(target_mt, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt55$__newly_created_);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.html_arghash_hidden_input_force(arghash, $SOURCE_MT, mt, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt57$Source_mt___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.html_arghash_hidden_input_force(arghash, $FILTER_TRIVIAL_DEDUCTIONS, filter_trivial_deductions, $BOOLEAN, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt58$Filter_trival_deductions___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(filter_trivial_deductions, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.html_arghash_hidden_input_force(arghash, $NUMBER, number, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt59$Number_cutoff___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(number, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.html_arghash_hidden_input(arghash, $TIME, time, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt60$Time_cutoff___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(time, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_arghash.html_arghash_hidden_input(arghash, $DEPTH, depth, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt61$Depth_cutoff___);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(depth, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_18, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_forward_propagate_mt_handler_verified(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject source_mt = html_arghash.get_arghash_value($SOURCE_MT, arghash);
                SubLObject target_mt = html_arghash.get_arghash_value($TARGET_MT, arghash);
                SubLObject filter_trivial_deductions = html_arghash.get_arghash_value($FILTER_TRIVIAL_DEDUCTIONS, arghash);
                SubLObject number = html_arghash.get_arghash_value($NUMBER, arghash);
                SubLObject time = html_arghash.get_arghash_value($TIME, arghash);
                SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
                cb_forward_propagate_mt_background(source_mt, target_mt, filter_trivial_deductions, number, time, depth);
                {
                    SubLObject title_var = $$$Forward_Propagate_Mt;
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
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            html_utilities.html_princ($str_alt63$Forward_propagation_of_);
                                            cb_utilities.cb_form(source_mt, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt64$_into_);
                                            cb_utilities.cb_form(target_mt, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt65$_has_begun_);
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_forward_propagate_file() {
        declareFunction("cb_forward_propagate_mt_background", "CB-FORWARD-PROPAGATE-MT-BACKGROUND", 1, 5, false);
        declareFunction("cb_forward_propagate_mt_wrapper", "CB-FORWARD-PROPAGATE-MT-WRAPPER", 6, 0, false);
        declareFunction("cb_link_forward_propagate_mt", "CB-LINK-FORWARD-PROPAGATE-MT", 0, 2, false);
        declareFunction("cb_forward_propagate_mt", "CB-FORWARD-PROPAGATE-MT", 0, 1, false);
        declareFunction("cb_forward_propagate_mt_handler", "CB-FORWARD-PROPAGATE-MT-HANDLER", 1, 0, false);
        declareFunction("cb_forward_propagate_mt_handler_verified", "CB-FORWARD-PROPAGATE-MT-HANDLER-VERIFIED", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_forward_propagate_file() {
        defparameter("*CB-FORWARD-PROPAGATE-MT-DEFAULT-MT*", NIL);
        defparameter("*CB-FORWARD-PROPAGATE-MT-DEFAULT-FILTER-TRIVIAL-DEDUCTIONS*", T);
        defparameter("*CB-FORWARD-PROPAGATE-MT-DEFAULT-NUMBER*", NIL);
        defparameter("*CB-FORWARD-PROPAGATE-MT-DEFAULT-TIME*", $int$120);
        defparameter("*CB-FORWARD-PROPAGATE-MT-DEFAULT-DEPTH*", FOUR_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_cb_forward_propagate_file() {
                cb_utilities.setup_cb_link_method($FORWARD_PROPAGATE_MT, CB_LINK_FORWARD_PROPAGATE_MT, TWO_INTEGER);
        cb_utilities.declare_cb_tool($FORWARD_PROPAGATE_MT, $$$Forward_Propagate_Mt, $$$FPMt, $$$Forward_Propagate_in_Mt);
        sethash($CB_FORWARD_PROPAGATE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt12$cb_forward_propagate_mt_html, NIL));
        html_macros.note_html_handler_function(CB_FORWARD_PROPAGATE_MT);
        sethash($CB_FORWARD_PROPAGATE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt12$cb_forward_propagate_mt_html, NIL));
        html_macros.note_html_handler_function(CB_FORWARD_PROPAGATE_MT_HANDLER);
        html_macros.note_html_handler_function(CB_FORWARD_PROPAGATE_MT_HANDLER_VERIFIED);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$Forward_Propagating__S_into__S = makeString("Forward Propagating ~S into ~S");

    private static final SubLSymbol CB_FORWARD_PROPAGATE_MT_WRAPPER = makeSymbol("CB-FORWARD-PROPAGATE-MT-WRAPPER");

    static private final SubLString $str_alt2$_Forward_Propagate_Mt_ = makeString("[Forward Propagate Mt]");



    static private final SubLString $str_alt4$cb_forward_propagate_mt__A = makeString("cb-forward-propagate-mt&~A");

    private static final SubLSymbol $FORWARD_PROPAGATE_MT = makeKeyword("FORWARD-PROPAGATE-MT");

    private static final SubLSymbol CB_LINK_FORWARD_PROPAGATE_MT = makeSymbol("CB-LINK-FORWARD-PROPAGATE-MT");

    static private final SubLString $$$Forward_Propagate_Mt = makeString("Forward Propagate Mt");

    static private final SubLString $$$FPMt = makeString("FPMt");

    static private final SubLString $$$Forward_Propagate_in_Mt = makeString("Forward Propagate in Mt");

    public static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLSymbol $CB_FORWARD_PROPAGATE_MT = makeKeyword("CB-FORWARD-PROPAGATE-MT");

    static private final SubLString $str_alt12$cb_forward_propagate_mt_html = makeString("cb-forward-propagate-mt.html");



    static private final SubLString $str_alt14$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt15$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt16$cb_forward_propagate_mt_handler = makeString("cb-forward-propagate-mt-handler");

    static private final SubLString $str_alt17$Submit_Forward_Propagation_Settin = makeString("Submit Forward Propagation Settings");

    static private final SubLString $str_alt18$Mt___ = makeString("Mt : ");



    static private final SubLString $$$Complete = makeString("Complete");

    public static final SubLObject $$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));



    static private final SubLString $$$Clear_Mt = makeString("Clear Mt");

    private static final SubLSymbol $FILTER_TRIVIAL_DEDUCTIONS = makeKeyword("FILTER-TRIVIAL-DEDUCTIONS");

    static private final SubLString $str_alt25$_Filter_trival_deductions = makeString(" Filter trival deductions");

    static private final SubLString $$$Number_Cutoff = makeString("Number Cutoff");

    static private final SubLString $$$Time_Cutoff = makeString("Time Cutoff");

    static private final SubLString $$$Depth_Cutoff = makeString("Depth Cutoff");

    private static final SubLSymbol $CUTOFF_NUMBER = makeKeyword("CUTOFF-NUMBER");







    static private final SubLString $str_alt33$_answers = makeString(" answers");

    private static final SubLSymbol $CUTOFF_TIME = makeKeyword("CUTOFF-TIME");



    static private final SubLString $str_alt36$_seconds = makeString(" seconds");

    private static final SubLSymbol $CUTOFF_DEPTH = makeKeyword("CUTOFF-DEPTH");



    static private final SubLString $str_alt39$_proof_steps = makeString(" proof steps");

    static private final SubLString $str_alt40$_Get_Everything = makeString(" Get Everything");

    static private final SubLString $str_alt41$_Run_Forever = makeString(" Run Forever");

    static private final SubLString $str_alt42$_Infinite_Depth = makeString(" Infinite Depth");

    private static final SubLSymbol CB_FORWARD_PROPAGATE_MT = makeSymbol("CB-FORWARD-PROPAGATE-MT");

    static private final SubLString $str_alt44$__A__is_not_a_Microtheory = makeString("\"~A\" is not a Microtheory");

    static private final SubLString $str_alt45$__mt = makeString(":$mt");

    static private final SubLString $str_alt46$Number_cutoff_must_be_specified_ = makeString("Number cutoff must be specified.");

    static private final SubLString $str_alt47$Time_cutoff_must_be_specified_ = makeString("Time cutoff must be specified.");

    static private final SubLString $str_alt48$Depth_cutoff_must_be_specified_ = makeString("Depth cutoff must be specified.");

    static private final SubLString $str_alt49$Forward_Prop = makeString("Forward-Prop");

    static private final SubLString $str_alt50$cb_forward_propagate_mt_handler_v = makeString("cb-forward-propagate-mt-handler-verified");

    static private final SubLString $$$Start_Forward_Propagation = makeString("Start Forward Propagation");

    static private final SubLString $str_alt52$Are_you_sure_you_want_to_run_forw = makeString("Are you sure you want to run forward propagation with the following settings?");



    static private final SubLString $str_alt54$Target_mt___ = makeString("Target mt : ");

    static private final SubLString $str_alt55$__newly_created_ = makeString(" (newly created)");



    static private final SubLString $str_alt57$Source_mt___ = makeString("Source mt : ");

    static private final SubLString $str_alt58$Filter_trival_deductions___ = makeString("Filter trival deductions : ");

    static private final SubLString $str_alt59$Number_cutoff___ = makeString("Number cutoff : ");

    static private final SubLString $str_alt60$Time_cutoff___ = makeString("Time cutoff : ");

    static private final SubLString $str_alt61$Depth_cutoff___ = makeString("Depth cutoff : ");

    private static final SubLSymbol CB_FORWARD_PROPAGATE_MT_HANDLER = makeSymbol("CB-FORWARD-PROPAGATE-MT-HANDLER");

    static private final SubLString $str_alt63$Forward_propagation_of_ = makeString("Forward propagation of ");

    static private final SubLString $str_alt64$_into_ = makeString(" into ");

    static private final SubLString $str_alt65$_has_begun_ = makeString(" has begun.");

    private static final SubLSymbol CB_FORWARD_PROPAGATE_MT_HANDLER_VERIFIED = makeSymbol("CB-FORWARD-PROPAGATE-MT-HANDLER-VERIFIED");

    // // Initializers
    public void declareFunctions() {
        declare_cb_forward_propagate_file();
    }

    public void initializeVariables() {
        init_cb_forward_propagate_file();
    }

    public void runTopLevelForms() {
        setup_cb_forward_propagate_file();
    }
}

