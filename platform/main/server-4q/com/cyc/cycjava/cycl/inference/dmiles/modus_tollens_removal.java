/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.dmiles;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
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
 *  module:      MODUS-TOLLENS-REMOVAL
 *  source file: /cyc/top/cycl/inference/dmiles/modus-tollens-removal.lisp
 *  created:     2019/07/03 17:39:04
 */
public final class modus_tollens_removal extends SubLTranslatedFile implements V02 {
    // // Constructor
    private modus_tollens_removal() {
    }

    public static final SubLFile me = new modus_tollens_removal();

    public static final String myName = "com.cyc.cycjava.cycl.inference.dmiles.modus_tollens_removal";

    // // Definitions
    public static final SubLObject bench_1d_arrays(SubLObject size, SubLObject runs) {
        if (size == UNPROVIDED) {
            size = $int$100000;
        }
        if (runs == UNPROVIDED) {
            runs = TEN_INTEGER;
        }
        {
            SubLObject ones = make_vector(size, ONE_INTEGER);
            SubLObject twos = make_vector(size, TWO_INTEGER);
            SubLObject threes = make_vector(size, ZERO_INTEGER);
            SubLObject run = NIL;
            for (run = ZERO_INTEGER; run.numL(runs); run = add(run, ONE_INTEGER)) {
                {
                    SubLObject pos = NIL;
                    for (pos = ZERO_INTEGER; pos.numL(size); pos = add(pos, ONE_INTEGER)) {
                        set_aref(threes, pos, add(aref(ones, pos), aref(twos, pos)));
                    }
                }
                sublisp_null(search(list(FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), threes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return values(EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static final SubLObject cb_modustollens_assertion(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Assertion_Modus_Tollens_page);
            } else {
                {
                    SubLObject assertion = cb_utilities.cb_guess_assertion(args);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        cb_utilities.cb_error($str_alt4$_a_does_not_specify_a_Cyc_asserti, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Assertion_Modus_Tollens;
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
                                            html_utilities.html_markup($str_alt8$yui_skin_sam);
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
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        cb_utilities.cb_help_preamble($CB_MODUS_HL_TOLLENS_ASSERTION, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt9$Modus_Tollens_for_Assertion__);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        cb_utilities.cb_show_assertion_readably(assertion, T, T);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt12$ID_Number__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertion_handles.assertion_id(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
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
                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt14$Formula_Data__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertions_low.assertion_formula_data(assertion), ZERO_INTEGER, T);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
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
                                                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt15$Mt__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
                                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt16$Flags__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertions_low.assertion_flags(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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
                                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt17$GAF___);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                                                                                    html_utilities.html_princ($$$True);
                                                                                } else {
                                                                                    html_utilities.html_princ($$$False);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
                                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt20$Direction__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_show_direction(assertions_high.assertion_direction(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
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
                                                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt21$Truth__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_show_truth(assertions_high.assertion_truth(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
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
                                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt22$Strength__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_show_strength(assertions_high.assertion_strength(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt23$Arguments__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
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
                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt24$PList__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(assertions_low.assertion_plist(assertion), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
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
                                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt25$_a__, sg_term_rank.$term_rank_utility_label$.getDynamicValue(thread));
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt26$_a, sg_term_rank.sg_tr_assertion_utility(assertion));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
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
            }
            return NIL;
        }
    }

    /**
     * Creates the cb-link for the modus-hl-tollens display of an assertion.
     */
    public static final SubLObject cb_link_modustollens_assertion(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt28$_Modus_Tollens_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt30$cb_modustollens_assertion__A, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static final SubLObject declare_modus_tollens_removal_file() {
        declareFunction("bench_1d_arrays", "BENCH-1D-ARRAYS", 0, 2, false);
        declareFunction("cb_modustollens_assertion", "CB-MODUSTOLLENS-ASSERTION", 1, 0, false);
        declareFunction("cb_link_modustollens_assertion", "CB-LINK-MODUSTOLLENS-ASSERTION", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_modus_tollens_removal_file() {
        return NIL;
    }

    public static final SubLObject setup_modus_tollens_removal_file() {
                sethash($CB_MODUS_HL_TOLLENS_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt2$cb_modus_hl_tollens_assertion_htm, NIL));
        html_macros.note_html_handler_function(CB_MODUSTOLLENS_ASSERTION);
        cb_utilities.setup_cb_link_method($MODUSTOLLENS_ASSERTION, CB_LINK_MODUSTOLLENS_ASSERTION, TWO_INTEGER);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLSymbol $CB_MODUS_HL_TOLLENS_ASSERTION = makeKeyword("CB-MODUS-HL-TOLLENS-ASSERTION");

    static private final SubLString $str_alt2$cb_modus_hl_tollens_assertion_htm = makeString("cb-modus-hl-tollens-assertion.html");

    static private final SubLString $$$the_Assertion_Modus_Tollens_page = makeString("the Assertion Modus Tollens page");

    static private final SubLString $str_alt4$_a_does_not_specify_a_Cyc_asserti = makeString("~a does not specify a Cyc assertion");

    static private final SubLString $$$Assertion_Modus_Tollens = makeString("Assertion Modus Tollens");



    static private final SubLString $str_alt7$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt8$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt9$Modus_Tollens_for_Assertion__ = makeString("Modus Tollens for Assertion :");





    static private final SubLString $str_alt12$ID_Number__ = makeString("ID Number :");



    static private final SubLString $str_alt14$Formula_Data__ = makeString("Formula Data :");

    static private final SubLString $str_alt15$Mt__ = makeString("Mt :");

    static private final SubLString $str_alt16$Flags__ = makeString("Flags :");

    static private final SubLString $str_alt17$GAF___ = makeString("GAF? :");

    static private final SubLString $$$True = makeString("True");

    static private final SubLString $$$False = makeString("False");

    static private final SubLString $str_alt20$Direction__ = makeString("Direction :");

    static private final SubLString $str_alt21$Truth__ = makeString("Truth :");

    static private final SubLString $str_alt22$Strength__ = makeString("Strength :");

    static private final SubLString $str_alt23$Arguments__ = makeString("Arguments :");

    static private final SubLString $str_alt24$PList__ = makeString("PList :");

    static private final SubLString $str_alt25$_a__ = makeString("~a :");

    static private final SubLString $str_alt26$_a = makeString("~a");

    private static final SubLSymbol CB_MODUSTOLLENS_ASSERTION = makeSymbol("CB-MODUSTOLLENS-ASSERTION");

    static private final SubLString $str_alt28$_Modus_Tollens_ = makeString("[Modus Tollens]");



    static private final SubLString $str_alt30$cb_modustollens_assertion__A = makeString("cb-modustollens-assertion&~A");

    private static final SubLSymbol $MODUSTOLLENS_ASSERTION = makeKeyword("MODUSTOLLENS-ASSERTION");

    private static final SubLSymbol CB_LINK_MODUSTOLLENS_ASSERTION = makeSymbol("CB-LINK-MODUSTOLLENS-ASSERTION");

    // // Initializers
    public void declareFunctions() {
        declare_modus_tollens_removal_file();
    }

    public void initializeVariables() {
        init_modus_tollens_removal_file();
    }

    public void runTopLevelForms() {
        setup_modus_tollens_removal_file();
    }
}

