/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-HALO
 *  source file: /cyc/top/cycl/cb-halo.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class cb_halo extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_halo() {
    }

    public static final SubLFile me = new cb_halo();

    public static final String myName = "com.cyc.cycjava.cycl.cb_halo";

    // // Definitions
    // defparameter
    private static final SubLSymbol $cb_halo_default_query_mt$ = makeSymbol("*CB-HALO-DEFAULT-QUERY-MT*");









    // deflexical
    private static final SubLSymbol $cb_halo_auto_refresh_seconds$ = makeSymbol("*CB-HALO-AUTO-REFRESH-SECONDS*");

    public static final SubLObject cb_halo_display_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = $str_alt8$Halo_Question_Answering_Applicati;
                SubLObject refresh = NIL;
                if (NIL != $cb_halo_query_thread$.getDynamicValue(thread)) {
                    refresh = $cb_halo_auto_refresh_seconds$.getGlobalValue();
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                if (NIL != refresh) {
                    html_utilities.html_refresh(refresh);
                }
                html_complete.html_complete_script();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt9$cb_halo_tools_handler, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject size_val = $str_alt10$_1;
                                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                        if (NIL != size_val) {
                                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(size_val);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ($str_alt11$Please_select_encoding_document_y);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$30);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    if (NIL == $cb_halo_dont_show_mt_choice$.getGlobalValue()) {
                                                                        html_utilities.html_princ($str_alt13$Ask_queries_in_mt_);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt14$cb_halo_test_specification_name);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject cdolist_list_var = halo_compute_test_spec_forts();
                                                                                SubLObject test_spec_fort_string = NIL;
                                                                                for (test_spec_fort_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_spec_fort_string = cdolist_list_var.first()) {
                                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                    if (NIL != test_spec_fort_string) {
                                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(test_spec_fort_string);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ(test_spec_fort_string);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$30);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (NIL != $cb_halo_dont_show_mt_choice$.getGlobalValue()) {
                                                                        html_utilities.html_hidden_input($str_alt15$cb_halo_test_specification_mt, $cb_halo_test_spec_mts$.getDynamicValue(thread).first(), UNPROVIDED);
                                                                    } else {
                                                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($str_alt15$cb_halo_test_specification_mt);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(ONE_INTEGER);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var = $cb_halo_test_spec_mts$.getDynamicValue(thread);
                                                                                    SubLObject test_spec_mt_string = NIL;
                                                                                    for (test_spec_mt_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_spec_mt_string = cdolist_list_var.first()) {
                                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        if (NIL != test_spec_mt_string) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(test_spec_mt_string);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(test_spec_mt_string);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject size_val = MINUS_ONE_INTEGER;
                                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                        if (NIL != size_val) {
                                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(size_val);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ($str_alt16$The_most_recently_created_encodin);
                                                                                html_utilities.html_br();
                                                                                html_utilities.html_princ($str_alt17$This_is_the_name_of_the_test_suit);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            cb_halo_per_question_interface();
                                            cb_halo_possibly_dump_to_file();
                                            cb_halo_display_output_files();
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                }
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
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_halo_per_question_interface() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject size_val = $str_alt10$_1;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != size_val) {
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(size_val);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt19$Then_choose_one_of_the_following_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt20$Either_run_a_Single_Question__may);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_princ($str_alt21$Answer_Question_number__);
            html_utilities.html_indent(THREE_INTEGER);
            html_utilities.html_text_input($str_alt22$cb_halo_question_number, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(UNPROVIDED);
            html_script_utilities.html_clear_input_button($str_alt22$cb_halo_question_number, UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            html_utilities.html_submit_input($$$Submit, $str_alt24$cb_halo_submit_question_number, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_halo_display_file_root$ = makeSymbol("*CB-HALO-DISPLAY-FILE-ROOT*");

    public static final SubLObject cb_halo_display_output_files() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject files = halo_directory_listing();
                if (NIL != files) {
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt26$Or_View_the_Results_of_Previous_B);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt27$Output_files_);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = files;
                                SubLObject file = NIL;
                                for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($HALO_FILE_LINK, cconcatenate($cb_halo_display_file_root$.getGlobalValue(), file), halo_display_file_name(file), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_display_file_name(SubLObject raw_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = read_from_string_ignoring_errors(subseq(raw_name, ZERO_INTEGER, TEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject sec = decode_universal_time(time, UNPROVIDED);
                    SubLObject min = thread.secondMultipleValue();
                    SubLObject hour = thread.thirdMultipleValue();
                    SubLObject date = thread.fourthMultipleValue();
                    SubLObject month = thread.fifthMultipleValue();
                    SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    sec = halo_pad_time(sec);
                    min = halo_pad_time(min);
                    hour = halo_pad_time(hour);
                    return format(NIL, $str_alt29$File_started_at__A__A__A_on__A__A, new SubLObject[]{ hour, min, sec, month, date, year });
                }
            }
        }
    }

    public static final SubLObject halo_file_filter(SubLObject word) {
        return makeBoolean((length(word) == FIFTEEN_INTEGER) && (NIL != string_utilities.ends_with(word, $$$html, UNPROVIDED)));
    }

    public static final SubLObject halo_directory_listing() {
        {
            SubLObject raw_list = list_utilities.remove_if_not(symbol_function(HALO_FILE_FILTER), Filesys.directory($cb_halo_display_file_root$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sorted = Sort.sort(raw_list, symbol_function($sym31$STRING_), UNPROVIDED);
            return subseq(sorted, ZERO_INTEGER, FIVE_INTEGER);
        }
    }

    public static final SubLObject halo_compute_test_spec_forts() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Mapping.mapcar(symbol_function(CONSTANT_NAME), Sort.sort(ask_utilities.ask_variable($sym33$_TEST_SPEC, $list_alt34, $cb_halo_default_query_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(HALO_TEST_SPEC_FORT_ORDER), UNPROVIDED));
        }
    }

    public static final SubLObject halo_test_spec_fort_order(SubLObject term_1, SubLObject term_2) {
        return makeBoolean(NIL == funcall($sym36$CREATION_TIME__, term_1, term_2));
    }

    public static final SubLObject halo_compute_test_spec_mts() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(constants_high.constant_name($cb_halo_default_query_mt$.getDynamicValue(thread)));
        }
    }

    public static final SubLObject cb_halo_possibly_dump_to_file() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt37$Or_Start_Answering_all_Questions_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            if (NIL != halo_query_thread_aliveP()) {
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                html_utilities.html_princ($str_alt38$There_already_appears_to_be_a_bat);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                cb_halo_display_process_info($cb_halo_query_thread$.getDynamicValue(thread));
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ($str_alt39$Abort_this_run_);
                html_utilities.html_indent(THREE_INTEGER);
                html_utilities.html_submit_input($$$Yes, $str_alt41$cb_halo_abort_run, UNPROVIDED);
                if ($cb_halo_auto_refresh_seconds$.getGlobalValue().isFixnum()) {
                    html_utilities.html_newline(UNPROVIDED);
                    {
                        SubLObject size_val = MINUS_ONE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt42$Note__During_batch_runs__this_pag);
                                html_utilities.html_princ($cb_halo_auto_refresh_seconds$.getGlobalValue());
                                html_utilities.html_princ($str_alt43$_seconds_);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                }
            } else {
                html_utilities.html_princ($str_alt44$Start_a_batch_run_);
                html_utilities.html_indent(THREE_INTEGER);
                html_utilities.html_submit_input($$$Yes, $str_alt45$cb_halo_submit_output_file, UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_halo_display_process_info(SubLObject process_wrapper) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = process_utilities.process_wrapper_get_property(process_wrapper, $USER, UNPROVIDED);
                SubLObject start_time = process_utilities.process_wrapper_get_property(process_wrapper, $START_TIME, UNPROVIDED);
                SubLObject test_spec = process_utilities.process_wrapper_get_property(process_wrapper, $TEST_SPEC, UNPROVIDED);
                SubLObject total_number = process_utilities.process_wrapper_get_property(process_wrapper, $TOTAL_QUESTIONS, UNPROVIDED);
                SubLObject current_number = process_utilities.process_wrapper_get_property(process_wrapper, $CURRENT_QUESTION, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject sec = decode_universal_time(start_time, UNPROVIDED);
                    SubLObject min = thread.secondMultipleValue();
                    SubLObject hour = thread.thirdMultipleValue();
                    SubLObject date = thread.fourthMultipleValue();
                    SubLObject month = thread.fifthMultipleValue();
                    SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    sec = halo_pad_time(sec);
                    min = halo_pad_time(min);
                    hour = halo_pad_time(hour);
                    html_utilities.html_br();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$Encoded_document__A_was_started_a, new SubLObject[]{ constants_high.constant_name(test_spec), hour, min, sec, month, date, year });
                    cb_utilities.cb_form(user, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt52$Status__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    if (total_number.isNumber() && current_number.isNumber()) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt53$Currently__HALO_is_working_on_pro, new SubLObject[]{ current_number, total_number, truncate(multiply($int$100, divide(subtract(current_number, ONE_INTEGER), total_number)), UNPROVIDED) });
                    } else {
                        html_utilities.html_princ($str_alt55$Setting_up_infrastructure_for_run);
                    }
                    html_utilities.html_br();
                }
            }
            return NIL;
        }
    }

    public static final SubLObject halo_pad_time(SubLObject time) {
        if (time.numL(TEN_INTEGER)) {
            return cconcatenate($$$0, string_utilities.to_string(time));
        }
        return time;
    }

    public static final SubLObject cb_halo_tools_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject submit_questionP = html_utilities.html_extract_input($str_alt24$cb_halo_submit_question_number, args);
            SubLObject submit_fileP = html_utilities.html_extract_input($str_alt45$cb_halo_submit_output_file, args);
            SubLObject abort_runP = html_utilities.html_extract_input($str_alt41$cb_halo_abort_run, args);
            if (NIL != submit_questionP) {
                return cb_halo_handle_single_question(args);
            }
            if (NIL != submit_fileP) {
                return cb_halo_handle_output_file(args);
            }
            if (NIL != abort_runP) {
                return cb_halo_warn_thread_exists(args);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_halo_handle_single_question(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject question_number = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt22$cb_halo_question_number, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject test_spec = constants_high.find_constant(html_utilities.html_extract_input($str_alt14$cb_halo_test_specification_name, args));
                SubLObject test_mt = constants_high.find_constant(html_utilities.html_extract_input($str_alt15$cb_halo_test_specification_mt, args));
                SubLObject title_var = $str_alt58$Results_;
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
                                    html_utilities.html_markup($str_alt61$yui_skin_sam);
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
                                        if ((question_number.isNumber() && (NIL != constantp(test_spec, UNPROVIDED))) && (NIL != constantp(test_mt, UNPROVIDED))) {
                                            halo_qa_interface.halo_generate_answer_for_number(question_number, html_macros.$html_stream$.getDynamicValue(thread), test_mt, test_spec);
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt62$You_didn_t_enter_a_valid_question);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($HALO_QA_TOOL, $str_alt64$_Ask_another_question_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
            return NIL;
        }
    }

    public static final SubLObject cb_halo_handle_output_file(SubLObject args) {
        {
            SubLObject output_file = html_utilities.html_extract_input($str_alt45$cb_halo_submit_output_file, args);
            if (NIL != Filesys.probe_file(output_file)) {
                return cb_halo_warn_file_exists(args);
            }
            if (NIL != halo_query_thread_aliveP()) {
                return cb_halo_warn_thread_exists(UNPROVIDED);
            } else {
                return cb_halo_notify_thread_created(args);
            }
        }
    }

    public static final SubLObject cb_halo_warn_file_exists(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_file = html_utilities.html_extract_input($str_alt45$cb_halo_submit_output_file, args);
                SubLObject title_var = $$$Warning;
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
                            SubLObject _prev_bind_0_23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt61$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt68$cb_halo_handle_file_warning, T, UNPROVIDED);
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_A_already_exists_, output_file);
                                                    html_utilities.html_br();
                                                    html_utilities.html_princ($str_alt70$Do_you_want_to_overwrite_the_file);
                                                    html_utilities.html_submit_input($$$Yes, $str_alt71$cb_halo_overwrite_file, UNPROVIDED);
                                                    html_utilities.html_indent(THREE_INTEGER);
                                                    html_utilities.html_submit_input($str_alt72$No__Go_Back, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt73$cb_halo_output_file, html_utilities.html_extract_input($str_alt73$cb_halo_output_file, args), UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt14$cb_halo_test_specification_name, html_utilities.html_extract_input($str_alt14$cb_halo_test_specification_name, args), UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt15$cb_halo_test_specification_mt, html_utilities.html_extract_input($str_alt15$cb_halo_test_specification_mt, args), UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_23, thread);
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

    public static final SubLObject cb_halo_handle_file_warning(SubLObject args) {
        {
            SubLObject overwriteP = html_utilities.html_extract_input($str_alt71$cb_halo_overwrite_file, args);
            if (NIL != overwriteP) {
                return cb_halo_notify_thread_created(args);
            }
            return cb_halo_display_setup(UNPROVIDED);
        }
    }

    public static final SubLObject cb_halo_warn_thread_exists(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt76$Warning__Batch_Process_Running;
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
                            SubLObject _prev_bind_0_26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt61$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt77$cb_halo_handle_thread_warning, T, UNPROVIDED);
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt38$There_already_appears_to_be_a_bat);
                                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                    cb_halo_display_process_info($cb_halo_query_thread$.getDynamicValue(thread));
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt78$Are_you_sure_you_want_to_abort_th);
                                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                    html_utilities.html_submit_input($$$Yes, $str_alt41$cb_halo_abort_run, UNPROVIDED);
                                                    html_utilities.html_indent(THREE_INTEGER);
                                                    html_utilities.html_submit_input($$$No, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_26, thread);
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

    public static final SubLObject cb_halo_handle_thread_warning(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject abortP = html_utilities.html_extract_input($str_alt41$cb_halo_abort_run, args);
                if ((NIL != abortP) && (NIL != halo_query_thread_aliveP())) {
                    process_utilities.process_wrapper_process_abort($cb_halo_query_thread$.getDynamicValue(thread));
                    $cb_halo_query_thread$.setDynamicValue(NIL, thread);
                }
            }
            return cb_halo_display_setup(UNPROVIDED);
        }
    }

    public static final SubLObject cb_halo_notify_thread_created(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = get_universal_time();
                SubLObject output_file = file_utilities.relative_filename($cb_halo_display_file_root$.getGlobalValue(), string_utilities.to_string(time), $$$html);
                SubLObject test_spec = constants_high.find_constant(html_utilities.html_extract_input($str_alt14$cb_halo_test_specification_name, args));
                SubLObject test_mt = constants_high.find_constant(html_utilities.html_extract_input($str_alt15$cb_halo_test_specification_mt, args));
                $cb_halo_query_thread$.setDynamicValue(process_utilities.new_process_wrapper($$$Halo_Question_Answering_Thread, symbol_function(HALO_START_QUERY_THREAD), list(test_mt, output_file, test_spec)), thread);
                process_utilities.process_wrapper_set_property($cb_halo_query_thread$.getDynamicValue(thread), $OUTPUT_FILE, output_file);
                process_utilities.process_wrapper_set_property($cb_halo_query_thread$.getDynamicValue(thread), $START_TIME, time);
                process_utilities.process_wrapper_set_property($cb_halo_query_thread$.getDynamicValue(thread), $TEST_SPEC, test_spec);
                process_utilities.process_wrapper_set_property($cb_halo_query_thread$.getDynamicValue(thread), $USER, operation_communication.the_cyclist());
                {
                    SubLObject title_var = $str_alt85$Batch_Run_of_Encoding_Document_St;
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
                                SubLObject _prev_bind_0_29 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_utilities.html_markup($str_alt61$yui_skin_sam);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            cb_halo_display_process_info($cb_halo_query_thread$.getDynamicValue(thread));
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($HALO_QA_TOOL, $str_alt86$_Back_to_the_Main_page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_newline(TWO_INTEGER);
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_29, thread);
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

    public static final SubLObject halo_start_query_thread(SubLObject process_wrapper, SubLObject test_mt, SubLObject output_file, SubLObject test_spec) {
        halo_qa_interface.halo_generate_answers_with_process_wrapper(process_wrapper, test_mt, output_file, test_spec);
        return NIL;
    }

    public static final SubLObject halo_query_thread_aliveP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == process_utilities.process_wrapper_p($cb_halo_query_thread$.getDynamicValue(thread))) {
                return NIL;
            }
            return process_utilities.process_wrapper_process_runningP($cb_halo_query_thread$.getDynamicValue(thread));
        }
    }

    public static final SubLObject cb_link_halo_qa_tool(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Halo_tools;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt90$cb_halo_display_setup);
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

    public static final SubLObject cb_link_halo_file_link(SubLObject filename, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Halo_output_file;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt96$cb_halo_file_displayer__A, filename);
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

    public static final SubLObject cb_halo_file_displayer(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = args.first();
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt99$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            {
                                SubLObject line = read_line(s, NIL, $EOF, UNPROVIDED);
                                if (line == $EOF) {
                                    doneP = eq(line, $EOF);
                                } else {
                                    write_string(line, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_halo_file() {
        declareFunction("cb_halo_display_setup", "CB-HALO-DISPLAY-SETUP", 0, 1, false);
        declareFunction("cb_halo_per_question_interface", "CB-HALO-PER-QUESTION-INTERFACE", 0, 0, false);
        declareFunction("cb_halo_display_output_files", "CB-HALO-DISPLAY-OUTPUT-FILES", 0, 0, false);
        declareFunction("halo_display_file_name", "HALO-DISPLAY-FILE-NAME", 1, 0, false);
        declareFunction("halo_file_filter", "HALO-FILE-FILTER", 1, 0, false);
        declareFunction("halo_directory_listing", "HALO-DIRECTORY-LISTING", 0, 0, false);
        declareFunction("halo_compute_test_spec_forts", "HALO-COMPUTE-TEST-SPEC-FORTS", 0, 0, false);
        declareFunction("halo_test_spec_fort_order", "HALO-TEST-SPEC-FORT-ORDER", 2, 0, false);
        declareFunction("halo_compute_test_spec_mts", "HALO-COMPUTE-TEST-SPEC-MTS", 0, 0, false);
        declareFunction("cb_halo_possibly_dump_to_file", "CB-HALO-POSSIBLY-DUMP-TO-FILE", 0, 0, false);
        declareFunction("cb_halo_display_process_info", "CB-HALO-DISPLAY-PROCESS-INFO", 1, 0, false);
        declareFunction("halo_pad_time", "HALO-PAD-TIME", 1, 0, false);
        declareFunction("cb_halo_tools_handler", "CB-HALO-TOOLS-HANDLER", 0, 1, false);
        declareFunction("cb_halo_handle_single_question", "CB-HALO-HANDLE-SINGLE-QUESTION", 1, 0, false);
        declareFunction("cb_halo_handle_output_file", "CB-HALO-HANDLE-OUTPUT-FILE", 1, 0, false);
        declareFunction("cb_halo_warn_file_exists", "CB-HALO-WARN-FILE-EXISTS", 1, 0, false);
        declareFunction("cb_halo_handle_file_warning", "CB-HALO-HANDLE-FILE-WARNING", 1, 0, false);
        declareFunction("cb_halo_warn_thread_exists", "CB-HALO-WARN-THREAD-EXISTS", 0, 1, false);
        declareFunction("cb_halo_handle_thread_warning", "CB-HALO-HANDLE-THREAD-WARNING", 1, 0, false);
        declareFunction("cb_halo_notify_thread_created", "CB-HALO-NOTIFY-THREAD-CREATED", 1, 0, false);
        declareFunction("halo_start_query_thread", "HALO-START-QUERY-THREAD", 4, 0, false);
        declareFunction("halo_query_thread_aliveP", "HALO-QUERY-THREAD-ALIVE?", 0, 0, false);
        declareFunction("cb_link_halo_qa_tool", "CB-LINK-HALO-QA-TOOL", 0, 1, false);
        declareFunction("cb_link_halo_file_link", "CB-LINK-HALO-FILE-LINK", 1, 1, false);
        declareFunction("cb_halo_file_displayer", "CB-HALO-FILE-DISPLAYER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_halo_file() {
        defparameter("*CB-HALO-DEFAULT-QUERY-MT*", $const0$UIA_HaloChemistry_DemoEnvironment);
        defparameter("*CB-HALO-TEST-SPEC-MTS*", list(constants_high.constant_name($cb_halo_default_query_mt$.getDynamicValue())));
        defparameter("*CB-HALO-DEFAULT-OUTPUT-FILE*", file_utilities.cyc_home_filename(NIL, $$$artefact1, $$$html));
        defparameter("*CB-HALO-QUERY-THREAD*", NIL);
        deflexical("*CB-HALO-DONT-SHOW-MT-CHOICE*", NIL != boundp($cb_halo_dont_show_mt_choice$) ? ((SubLObject) ($cb_halo_dont_show_mt_choice$.getGlobalValue())) : T);
        deflexical("*CB-HALO-AUTO-REFRESH-SECONDS*", $int$60);
        deflexical("*CB-HALO-DISPLAY-FILE-ROOT*", $str_alt25$_tmp_);
        return NIL;
    }

    public static final SubLObject setup_cb_halo_file() {
                utilities_macros.register_html_state_variable($cb_halo_test_spec_mts$);
        utilities_macros.register_html_state_variable($cb_halo_default_output_file$);
        utilities_macros.register_html_state_variable($cb_halo_query_thread$);
        subl_macro_promotions.declare_defglobal($cb_halo_dont_show_mt_choice$);
        html_macros.note_html_handler_function(CB_HALO_DISPLAY_SETUP);
        html_macros.note_html_handler_function(CB_HALO_TOOLS_HANDLER);
        html_macros.note_html_handler_function(CB_HALO_HANDLE_SINGLE_QUESTION);
        html_macros.note_html_handler_function(CB_HALO_HANDLE_OUTPUT_FILE);
        html_macros.note_html_handler_function(CB_HALO_WARN_FILE_EXISTS);
        html_macros.note_html_handler_function(CB_HALO_HANDLE_FILE_WARNING);
        html_macros.note_html_handler_function(CB_HALO_WARN_THREAD_EXISTS);
        html_macros.note_html_handler_function(CB_HALO_HANDLE_THREAD_WARNING);
        html_macros.note_html_handler_function(CB_HALO_NOTIFY_THREAD_CREATED);
        cb_utilities.setup_cb_link_method($HALO_QA_TOOL, CB_LINK_HALO_QA_TOOL, ONE_INTEGER);
        cb_utilities.declare_cb_tool($HALO_QA_TOOL, $$$Halo_Interface, $$$Halo, $$$Halo_Question_Answering_Interface);
        cb_utilities.setup_cb_link_method($HALO_FILE_LINK, CB_LINK_HALO_FILE_LINK, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HALO_FILE_DISPLAYER);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $const0$UIA_HaloChemistry_DemoEnvironment = constant_handles.reader_make_constant_shell(makeString("UIA-HaloChemistry-DemoEnvironmentMt"));

    public static final SubLSymbol $cb_halo_test_spec_mts$ = makeSymbol("*CB-HALO-TEST-SPEC-MTS*");

    static private final SubLString $$$artefact1 = makeString("artefact1");

    static private final SubLString $$$html = makeString("html");

    public static final SubLSymbol $cb_halo_default_output_file$ = makeSymbol("*CB-HALO-DEFAULT-OUTPUT-FILE*");

    public static final SubLSymbol $cb_halo_query_thread$ = makeSymbol("*CB-HALO-QUERY-THREAD*");

    public static final SubLSymbol $cb_halo_dont_show_mt_choice$ = makeSymbol("*CB-HALO-DONT-SHOW-MT-CHOICE*");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt8$Halo_Question_Answering_Applicati = makeString("Halo Question-Answering Application");

    static private final SubLString $str_alt9$cb_halo_tools_handler = makeString("cb-halo-tools-handler");

    static private final SubLString $str_alt10$_1 = makeString("+1");

    static private final SubLString $str_alt11$Please_select_encoding_document_y = makeString("Please select encoding document you wish to use:");

    static private final SubLString $$$30 = makeString("30");

    static private final SubLString $str_alt13$Ask_queries_in_mt_ = makeString("Ask queries in mt:");

    static private final SubLString $str_alt14$cb_halo_test_specification_name = makeString("cb-halo-test-specification-name");

    static private final SubLString $str_alt15$cb_halo_test_specification_mt = makeString("cb-halo-test-specification-mt");

    static private final SubLString $str_alt16$The_most_recently_created_encodin = makeString("The most recently created encoding document appears first and is selected by default.");

    static private final SubLString $str_alt17$This_is_the_name_of_the_test_suit = makeString("This is the name of the test suite and not necessarily the name of the file from which the test suite was loaded during encoding document upload.");

    private static final SubLSymbol CB_HALO_DISPLAY_SETUP = makeSymbol("CB-HALO-DISPLAY-SETUP");

    static private final SubLString $str_alt19$Then_choose_one_of_the_following_ = makeString("Then choose one of the following:");

    static private final SubLString $str_alt20$Either_run_a_Single_Question__may = makeString("Either run a Single Question (may take several minutes):");

    static private final SubLString $str_alt21$Answer_Question_number__ = makeString("Answer Question number: ");

    static private final SubLString $str_alt22$cb_halo_question_number = makeString("cb-halo-question-number");

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $str_alt24$cb_halo_submit_question_number = makeString("cb-halo-submit-question-number");

    static private final SubLString $str_alt25$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt26$Or_View_the_Results_of_Previous_B = makeString("Or View the Results of Previous Batch Runs:");

    static private final SubLString $str_alt27$Output_files_ = makeString("Output files:");

    private static final SubLSymbol $HALO_FILE_LINK = makeKeyword("HALO-FILE-LINK");

    static private final SubLString $str_alt29$File_started_at__A__A__A_on__A__A = makeString("File started at ~A:~A:~A on ~A/~A/~A");

    private static final SubLSymbol HALO_FILE_FILTER = makeSymbol("HALO-FILE-FILTER");

    static private final SubLSymbol $sym31$STRING_ = makeSymbol("STRING>");



    static private final SubLSymbol $sym33$_TEST_SPEC = makeSymbol("?TEST-SPEC");

    static private final SubLList $list_alt34 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TEST-SPEC"), constant_handles.reader_make_constant_shell(makeString("HaloKnowledgeEntryTestSpecificationType")));

    private static final SubLSymbol HALO_TEST_SPEC_FORT_ORDER = makeSymbol("HALO-TEST-SPEC-FORT-ORDER");

    static private final SubLSymbol $sym36$CREATION_TIME__ = makeSymbol("CREATION-TIME-<");

    static private final SubLString $str_alt37$Or_Start_Answering_all_Questions_ = makeString("Or Start Answering all Questions in the Encoding Document:");

    static private final SubLString $str_alt38$There_already_appears_to_be_a_bat = makeString("There already appears to be a batch process running.");

    static private final SubLString $str_alt39$Abort_this_run_ = makeString("Abort this run?");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $str_alt41$cb_halo_abort_run = makeString("cb-halo-abort-run");

    static private final SubLString $str_alt42$Note__During_batch_runs__this_pag = makeString("Note: During batch runs, this page will reload automatically every ");

    static private final SubLString $str_alt43$_seconds_ = makeString(" seconds.");

    static private final SubLString $str_alt44$Start_a_batch_run_ = makeString("Start a batch run?");

    static private final SubLString $str_alt45$cb_halo_submit_output_file = makeString("cb-halo-submit-output-file");







    private static final SubLSymbol $TOTAL_QUESTIONS = makeKeyword("TOTAL-QUESTIONS");

    private static final SubLSymbol $CURRENT_QUESTION = makeKeyword("CURRENT-QUESTION");

    static private final SubLString $str_alt51$Encoded_document__A_was_started_a = makeString("Encoded document ~A was started at ~A:~A:~A ~A/~A/~A by ");

    static private final SubLString $str_alt52$Status__ = makeString("Status: ");

    static private final SubLString $str_alt53$Currently__HALO_is_working_on_pro = makeString("Currently, HALO is working on problem ~A of ~A (~A% done)");



    static private final SubLString $str_alt55$Setting_up_infrastructure_for_run = makeString("Setting up infrastructure for running ... please wait.");

    static private final SubLString $$$0 = makeString("0");

    private static final SubLSymbol CB_HALO_TOOLS_HANDLER = makeSymbol("CB-HALO-TOOLS-HANDLER");

    static private final SubLString $str_alt58$Results_ = makeString("Results:");



    static private final SubLString $str_alt60$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt61$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt62$You_didn_t_enter_a_valid_question = makeString("You didn't enter a valid question number");

    private static final SubLSymbol $HALO_QA_TOOL = makeKeyword("HALO-QA-TOOL");

    static private final SubLString $str_alt64$_Ask_another_question_ = makeString("[Ask another question]");

    private static final SubLSymbol CB_HALO_HANDLE_SINGLE_QUESTION = makeSymbol("CB-HALO-HANDLE-SINGLE-QUESTION");

    private static final SubLSymbol CB_HALO_HANDLE_OUTPUT_FILE = makeSymbol("CB-HALO-HANDLE-OUTPUT-FILE");

    static private final SubLString $$$Warning = makeString("Warning");

    static private final SubLString $str_alt68$cb_halo_handle_file_warning = makeString("cb-halo-handle-file-warning");

    static private final SubLString $str_alt69$_A_already_exists_ = makeString("~A already exists!");

    static private final SubLString $str_alt70$Do_you_want_to_overwrite_the_file = makeString("Do you want to overwrite the file?");

    static private final SubLString $str_alt71$cb_halo_overwrite_file = makeString("cb-halo-overwrite-file");

    static private final SubLString $str_alt72$No__Go_Back = makeString("No, Go Back");

    static private final SubLString $str_alt73$cb_halo_output_file = makeString("cb-halo-output-file");

    private static final SubLSymbol CB_HALO_WARN_FILE_EXISTS = makeSymbol("CB-HALO-WARN-FILE-EXISTS");

    private static final SubLSymbol CB_HALO_HANDLE_FILE_WARNING = makeSymbol("CB-HALO-HANDLE-FILE-WARNING");

    static private final SubLString $str_alt76$Warning__Batch_Process_Running = makeString("Warning: Batch Process Running");

    static private final SubLString $str_alt77$cb_halo_handle_thread_warning = makeString("cb-halo-handle-thread-warning");

    static private final SubLString $str_alt78$Are_you_sure_you_want_to_abort_th = makeString("Are you sure you want to abort this batch run?");

    static private final SubLString $$$No = makeString("No");

    private static final SubLSymbol CB_HALO_WARN_THREAD_EXISTS = makeSymbol("CB-HALO-WARN-THREAD-EXISTS");

    private static final SubLSymbol CB_HALO_HANDLE_THREAD_WARNING = makeSymbol("CB-HALO-HANDLE-THREAD-WARNING");

    static private final SubLString $$$Halo_Question_Answering_Thread = makeString("Halo Question Answering Thread");

    private static final SubLSymbol HALO_START_QUERY_THREAD = makeSymbol("HALO-START-QUERY-THREAD");



    static private final SubLString $str_alt85$Batch_Run_of_Encoding_Document_St = makeString("Batch Run of Encoding Document Started");

    static private final SubLString $str_alt86$_Back_to_the_Main_page_ = makeString("[Back to the Main page]");

    private static final SubLSymbol CB_HALO_NOTIFY_THREAD_CREATED = makeSymbol("CB-HALO-NOTIFY-THREAD-CREATED");

    static private final SubLString $$$Halo_tools = makeString("Halo tools");



    static private final SubLString $str_alt90$cb_halo_display_setup = makeString("cb-halo-display-setup");

    private static final SubLSymbol CB_LINK_HALO_QA_TOOL = makeSymbol("CB-LINK-HALO-QA-TOOL");

    static private final SubLString $$$Halo_Interface = makeString("Halo Interface");

    static private final SubLString $$$Halo = makeString("Halo");

    static private final SubLString $$$Halo_Question_Answering_Interface = makeString("Halo Question Answering Interface");

    static private final SubLString $$$Halo_output_file = makeString("Halo output file");

    static private final SubLString $str_alt96$cb_halo_file_displayer__A = makeString("cb-halo-file-displayer&~A");

    private static final SubLSymbol CB_LINK_HALO_FILE_LINK = makeSymbol("CB-LINK-HALO-FILE-LINK");



    static private final SubLString $str_alt99$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLSymbol CB_HALO_FILE_DISPLAYER = makeSymbol("CB-HALO-FILE-DISPLAYER");

    // // Initializers
    public void declareFunctions() {
        declare_cb_halo_file();
    }

    public void initializeVariables() {
        init_cb_halo_file();
    }

    public void runTopLevelForms() {
        setup_cb_halo_file();
    }
}

