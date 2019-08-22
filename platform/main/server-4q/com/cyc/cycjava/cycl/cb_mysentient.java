/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-MYSENTIENT
 *  source file: /cyc/top/cycl/cb-mysentient.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_mysentient extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_mysentient() {
    }

    public static final SubLFile me = new cb_mysentient();




    // defparameter
    public static final SubLSymbol $cb_mysentient_user_profile_last_show_cyclP$ = makeSymbol("*CB-MYSENTIENT-USER-PROFILE-LAST-SHOW-CYCL?*");

    // defparameter
    public static final SubLSymbol $cb_mysentient_user_profile_last_link_termsP$ = makeSymbol("*CB-MYSENTIENT-USER-PROFILE-LAST-LINK-TERMS?*");

    public static final SubLObject cb_mysentient_user_profile_users() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject users = mysentient_user_profile_dumper.mysentient_available_users(NIL, UNPROVIDED);
                SubLObject selected_user = $cb_mysentient_user_profile_last_user$.getDynamicValue(thread);
                SubLObject show_cyclP = $cb_mysentient_user_profile_last_show_cyclP$.getDynamicValue(thread);
                SubLObject link_termsP = $cb_mysentient_user_profile_last_link_termsP$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$MySentient_Users);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($$$MySentient_Users);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Select_a_user_from_the_list_below);
                                    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
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
                                                html_utilities.html_hidden_input($str_alt5$cb_mysentient_user_profile_dumper, T, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Get_profile, $$$get, UNPROVIDED);
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
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Choice);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$User);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Profile);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Lexical_Microtheories);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Sessions);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject user = NIL;
                                                            SubLObject counter = NIL;
                                                            for (list_var = users, user = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , user = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                                {
                                                                    SubLObject selectedP = eq(user, selected_user);
                                                                    SubLObject bgcolor = (NIL != oddp(counter)) ? ((SubLObject) (html_macros.$html_color_lighter_purple$.getDynamicValue(thread))) : html_macros.$html_color_white$.getDynamicValue(thread);
                                                                    SubLObject profile_mt = mysentient_user_profile_manager_widgets.get_mysentient_user_profile_mt(user, UNPROVIDED);
                                                                    SubLObject lexical_mts = (NIL != profile_mt) ? ((SubLObject) (mysentient_user_profile_manager_widgets.get_mysentient_userprofile_lexical_mts(hlmt_czer.coerce_to_hlmt(profile_mt), UNPROVIDED))) : NIL;
                                                                    SubLObject session_mts = (NIL != profile_mt) ? ((SubLObject) (mysentient_user_profile_manager_widgets.get_all_mysentient_userprofile_sessions_from_user_profile(hlmt_czer.coerce_to_hlmt(profile_mt), UNPROVIDED))) : NIL;
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    if (NIL != profile_mt) {
                                                                                        html_utilities.html_radio_input($$$user, cb_utilities.cb_string_for_term(user), selectedP);
                                                                                    } else {
                                                                                        html_utilities.html_princ($str_alt16$N_A);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
                                                                            if (NIL != bgcolor) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(bgcolor);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    cb_utilities.cb_form(user, UNPROVIDED, UNPROVIDED);
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
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (NIL != bgcolor) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(bgcolor);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    if (NIL != profile_mt) {
                                                                                        cb_utilities.cb_form(profile_mt, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        html_utilities.html_princ($$$none);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
                                                                            if (NIL != bgcolor) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(bgcolor);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    if (NIL != lexical_mts) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = lexical_mts;
                                                                                            SubLObject mt = NIL;
                                                                                            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                                                                                cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt19$_);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        html_utilities.html_princ($$$none);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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
                                                                            if (NIL != bgcolor) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(bgcolor);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    if (NIL != session_mts) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = session_mts;
                                                                                            SubLObject mt = NIL;
                                                                                            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                                                                                cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt19$_);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        html_utilities.html_princ($$$none);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt20$Show_CycL_);
                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_utilities.html_checkbox_input($str_alt21$show_cycl, ONE_INTEGER, show_cyclP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt22$Link_terms_);
                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_utilities.html_checkbox_input($str_alt23$link_terms, ONE_INTEGER, link_termsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt24$Flush_irrelevance_cache_);
                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_utilities.html_checkbox_input($str_alt25$flush_irrrelevance_cache, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Get_profile, $$$get, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
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

    public static final SubLObject cb_mysentient_user_profile_dumper(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject user = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$user, args), UNPROVIDED);
            SubLObject show_cyclP = stringp(html_utilities.html_extract_input($str_alt21$show_cycl, args));
            SubLObject link_termsP = stringp(html_utilities.html_extract_input($str_alt23$link_terms, args));
            SubLObject flush_irrelevance_cacheP = stringp(html_utilities.html_extract_input($str_alt26$flush_irrelevance_cache, args));
            if (NIL != flush_irrelevance_cacheP) {
                rkf_relevance_utilities.clear_cached_rkf_irrelevant_fort();
            }
            if (NIL != user) {
                mysentient_user_profile_dumper.mysentient_dump_user_profile(user, show_cyclP, link_termsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                $cb_mysentient_user_profile_last_user$.setDynamicValue(user);
                $cb_mysentient_user_profile_last_show_cyclP$.setDynamicValue(show_cyclP);
                $cb_mysentient_user_profile_last_link_termsP$.setDynamicValue(link_termsP);
            } else {
                cb_mysentient_user_profile_users();
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_mysentient_user_profile_dumper(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt28$_MySentient_User_Profile_Dumper_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt5$cb_mysentient_user_profile_dumper);
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

    /**
     * Prints a single row in a tabular form.
     */
    public static final SubLObject form_row(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject label = NIL;
            SubLObject widget = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            label = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            widget = current.first();
            current = current.rest();
            {
                SubLObject explanation = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt36$;
                destructuring_bind_must_listp(current, datum, $list_alt35);
                current = current.rest();
                if (NIL == current) {
                    return list(HTML_TABLE_ROW, list(HTML_FANCY_TABLE_HEADER, $list_alt39, list(HTML_PRINC, label)), list(HTML_TABLE_DATA, widget), list(HTML_TABLE_DATA, list(HTML_PRINC, explanation)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt35);
                }
            }
        }
        return NIL;
    }

    /**
     * Generates all output for the Term Expander when a form is required.
     */
    public static final SubLObject term_expander_form(SubLObject string, SubLObject expansion_types, SubLObject instantiate_collectionsP, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt, SubLObject generation_mt, SubLObject output_format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_expansion_types = mysentient_user_profile_manager_widgets.get_all_expansion_strategy_strings(UNPROVIDED);
                SubLObject expansion_type_offsets = NIL;
                SubLObject output_formats = list($$$xml, $$$html);
                SubLObject output_format_strings = list($$$XML, $$$HTML);
                SubLObject cdolist_list_var = expansion_types;
                SubLObject expansion_type = NIL;
                for (expansion_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expansion_type = cdolist_list_var.first()) {
                    expansion_type_offsets = cons(position(expansion_type, all_expansion_types, symbol_function($sym46$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED), expansion_type_offsets);
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$MySentient_Term_Expander);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                                    html_utilities.html_princ($$$MySentient_Term_Expander);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt48$Enter_a_term_to_be_expanded___For);
                                    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
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
                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt49$cb_mysentient_term_expander, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($$$submit, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt36$);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_submit_input($$$Expand_term, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt36$);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Term);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($$$string, string, $int$30);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt55$Term_to_be_expanded_in_either_Eng);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Output_Format);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_create_dropdown_list($str_alt57$output_format, output_format_strings, output_formats, ONE_INTEGER, position(output_format, output_formats, symbol_function($sym46$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt58$Whether_to_emit_results_in_XML__a);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
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
                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt59$Instantiate_collections_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_create_dropdown_list($str_alt60$instantiate_collections, list($$$Yes, $$$No), list($$$t, $$$nil), ONE_INTEGER, NIL != instantiate_collectionsP ? ((SubLObject) (ZERO_INTEGER)) : ONE_INTEGER, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt65$When_a_string_denoting_a_collecti);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
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
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Strategies);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_create_multiple_selection_listbox($str_alt67$expansion_types, all_expansion_types, all_expansion_types, SIX_INTEGER, expansion_type_offsets);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt68$Which_strategies_to_use___Strateg);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Profile_MT);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($str_alt70$profile_mt, profile_mt, $int$30);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt71$Microtheory_acting_as_user_profil);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Session_MT);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($str_alt73$session_mt, session_mt, $int$30);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt74$Microtheory_acting_as_user_sessio);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
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
                                                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Parsing_MT);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($str_alt76$parsing_mt, parsing_mt, $int$30);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt77$Microtheory_acting_as_user_s_pars);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Paraphrase_MT);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($str_alt79$generation_mt, generation_mt, $int$30);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt80$Microtheory_acting_as_user_s_gene);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
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
                                                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt36$);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_submit_input($$$Expand_term, $$$submit, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt36$);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
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
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Prints an expansion as a single HTML table row.
     */
    public static final SubLObject display_expansions_html_row(SubLObject expansion_string, SubLObject weight, SubLObject expansion_cycl) {
        if (weight == UNPROVIDED) {
            weight = $float$1_0;
        }
        if (expansion_cycl == UNPROVIDED) {
            expansion_cycl = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ(expansion_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ(weight);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != expansion_cycl) {
                                cb_utilities.cb_form(expansion_cycl, UNPROVIDED, UNPROVIDED);
                            } else {
                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
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

    /**
     * Generates all output for Term Expander for results in HTML format.
     */
    public static final SubLObject display_expansions_html(SubLObject term_string, SubLObject term_cycl, SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$MySentient_Term_Expander);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($$$MySentient_Term_Expander);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$String);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ(term_string);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$CycL_Term);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != term_cycl) {
                                                            cb_utilities.cb_form(term_cycl, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            html_utilities.html_princ($str_alt85$Parse_failed_);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = results;
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        {
                                            SubLObject strategy = pair.first();
                                            SubLObject expansion_strings = cadr(pair);
                                            SubLObject weights = list_utilities.caddr(pair);
                                            SubLObject expansion_cycls = list_utilities.cadddr(pair);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(THREE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(format(NIL, $str_alt86$Strategy___A, strategy));
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(THREE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            if (NIL != expansion_strings) {
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Expansion_String);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Confidence);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Expansion_CycL);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        if (NIL != weights) {
                                                            Mapping.mapcar(symbol_function(DISPLAY_EXPANSIONS_HTML_ROW), expansion_strings, new SubLObject[]{ weights, expansion_cycls });
                                                        } else {
                                                            Mapping.mapcar(symbol_function(DISPLAY_EXPANSIONS_HTML_ROW), expansion_strings);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($$$No_expansions_for_this_strategy);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                            }
                                        }
                                    }
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
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

    /**
     * Prints a single expansion in XML.
     */
    public static final SubLObject display_expansions_xml_row(SubLObject expansion_string, SubLObject weight, SubLObject expansion_cycl) {
        if (weight == UNPROVIDED) {
            weight = $float$1_0;
        }
        if (expansion_cycl == UNPROVIDED) {
            expansion_cycl = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($str_alt92$myse_TEXT, list($$$confidence, weight), NIL);
                    if (NIL != expansion_cycl) {
                        xml_utilities.xml_comment(format(NIL, $str_alt94$_A, expansion_cycl));
                    }
                    xml_utilities.xml_print(expansion_string, UNPROVIDED);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($str_alt92$myse_TEXT);
            return NIL;
        }
    }

    /**
     * Generates all output for Term Expander for results in XML format.
     */
    public static final SubLObject display_expansions_xml(SubLObject string, SubLObject term_cycl, SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_weight = apply(symbol_function(MAX), Mapping.mapcan(symbol_function(THIRD), results, EMPTY_SUBL_OBJECT_ARRAY));
                SubLObject xml_output = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_75 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($str_alt97$myse_EXPANSIONS, list($str_alt98$xmlns_myse, $str_alt99$http___www_mysentient_com, $$$confidence, max_weight, $$$module, $str_alt101$com_cyc_project_mysentient_module), NIL);
                                    {
                                        SubLObject _prev_bind_0_76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_77 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($str_alt102$myse_EXPANSION, list($$$confidence, max_weight, $$$length, length(string), $$$offset, ZERO_INTEGER), NIL);
                                            {
                                                SubLObject _prev_bind_0_78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                SubLObject _prev_bind_1_79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($str_alt105$myse_OUTPUT_TEXT, NIL, T);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_79, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_78, thread);
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = results;
                                                SubLObject pair = NIL;
                                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject strategy = pair.first();
                                                        SubLObject expansion_strings = cadr(pair);
                                                        SubLObject weights = list_utilities.caddr(pair);
                                                        SubLObject expansion_cycls = list_utilities.cadddr(pair);
                                                        if (NIL != expansion_strings) {
                                                            {
                                                                SubLObject _prev_bind_0_80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($str_alt106$myse_EXPANSION_TEXTS, list($str_alt107$expansion_type, strategy), NIL);
                                                                    if (NIL != weights) {
                                                                        Mapping.mapcar(symbol_function(DISPLAY_EXPANSIONS_XML_ROW), expansion_strings, new SubLObject[]{ weights, expansion_cycls });
                                                                    } else {
                                                                        Mapping.mapcar(symbol_function(DISPLAY_EXPANSIONS_XML_ROW), expansion_strings);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_81, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_80, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($str_alt106$myse_EXPANSION_TEXTS);
                                                        } else {
                                                            {
                                                                SubLObject _prev_bind_0_82 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($str_alt106$myse_EXPANSION_TEXTS, list($str_alt107$expansion_type, strategy), NIL);
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_83, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_82, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($str_alt106$myse_EXPANSION_TEXTS);
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_84 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                SubLObject _prev_bind_1_85 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($str_alt109$myse_SEMANTICS, NIL, NIL);
                                                    xml_utilities.xml_comment(format(NIL, $str_alt94$_A, term_cycl));
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_85, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_84, thread);
                                                }
                                            }
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($str_alt109$myse_SEMANTICS);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_77, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_76, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($str_alt102$myse_EXPANSION);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_75, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($str_alt97$myse_EXPANSIONS);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    xml_output = get_output_stream_string(stream);
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
                html_utilities.html_markup(xml_output);
            }
            return NIL;
        }
    }

    /**
     * Runs the Term Expander query and displays results in an appropriate format.
     */
    public static final SubLObject expand_term_and_display_expansions(SubLObject string, SubLObject expansion_types, SubLObject instantiate_collectionsP, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt, SubLObject generation_mt, SubLObject output_format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject term_cycl = mysentient_user_profile_manager_widgets.parse_and_expand(string, expansion_types, instantiate_collectionsP, profile_mt, session_mt, parsing_mt, generation_mt);
                SubLObject expansion_results = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject display_term = ((NIL != instantiate_collectionsP) && (NIL != fort_types_interface.isa_collectionP(term_cycl, UNPROVIDED))) ? ((SubLObject) (list($$SomeExampleFn, term_cycl))) : term_cycl;
                    if (NIL != Strings.stringE(output_format, $$$html, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        display_expansions_html(string, display_term, expansion_results);
                    } else
                        if (NIL != Strings.stringE(output_format, $$$xml, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            display_expansions_xml(string, display_term, expansion_results);
                        }

                }
            }
            return NIL;
        }
    }

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_profile_mt$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-PROFILE-MT*");

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_session_mt$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-SESSION-MT*");

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_parsing_mt$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-PARSING-MT*");

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_generation_mt$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-GENERATION-MT*");

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_output_format$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-OUTPUT-FORMAT*");

    // deflexical
    public static final SubLSymbol $cb_mysentient_term_expander_default_instantiate_collectionsP$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-INSTANTIATE-COLLECTIONS?*");



    /**
     * Convenience function for getting an MT from HTML/CGI.
     */
    public static final SubLObject extract_mt(SubLObject name, SubLObject args, SubLObject v_default) {
        {
            SubLObject mt = cb_utilities.cb_guess_term(html_utilities.html_extract_input(name, args), UNPROVIDED);
            return NIL != hlmt.hlmt_p(mt) ? ((SubLObject) (mt)) : v_default;
        }
    }

    /**
     * Convenience function for getting a boolean from an HTML/CGI string that is "t" or "nil".
     */
    public static final SubLObject extract_boolean(SubLObject name, SubLObject args, SubLObject v_default) {
        {
            SubLObject value = html_utilities.html_extract_input(name, args);
            if (value.equal($$$t)) {
                return T;
            } else
                if (value.equal($$$nil)) {
                    return NIL;
                } else {
                    return v_default;
                }

        }
    }

    /**
     * CB handler for MySentient Term Extractor.  Attempts to simulate the MySentient User Profile Manager, while allowing the user to tweak various apsects of the operation.
     */
    public static final SubLObject cb_mysentient_term_expander(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject default_expansion_types = mysentient_user_profile_manager_widgets.get_expansion_strategy_strings(UNPROVIDED);
                SubLObject form_submittedP = stringp(html_utilities.html_extract_value($$$submit, args, UNPROVIDED));
                SubLObject string = html_utilities.html_extract_string($$$string, args, $cb_mysentient_term_expander_last_string$.getDynamicValue(thread));
                SubLObject expansion_types = html_utilities.html_extract_input_values($str_alt67$expansion_types, args);
                SubLObject output_format = html_utilities.html_extract_value($str_alt57$output_format, args, $cb_mysentient_term_expander_default_output_format$.getGlobalValue());
                SubLObject instantiate_collectionsP = extract_boolean($str_alt60$instantiate_collections, args, $cb_mysentient_term_expander_default_instantiate_collectionsP$.getGlobalValue());
                SubLObject profile_mt = extract_mt($str_alt70$profile_mt, args, $cb_mysentient_term_expander_default_profile_mt$.getGlobalValue());
                SubLObject session_mt = extract_mt($str_alt73$session_mt, args, $cb_mysentient_term_expander_default_session_mt$.getGlobalValue());
                SubLObject parsing_mt = extract_mt($str_alt76$parsing_mt, args, $cb_mysentient_term_expander_default_parsing_mt$.getGlobalValue());
                SubLObject generation_mt = extract_mt($str_alt79$generation_mt, args, $cb_mysentient_term_expander_default_generation_mt$.getGlobalValue());
                if (NIL == expansion_types) {
                    expansion_types = default_expansion_types;
                }
                if (NIL == profile_mt) {
                    profile_mt = $cb_mysentient_term_expander_default_profile_mt$.getGlobalValue();
                }
                if (NIL == session_mt) {
                    session_mt = $cb_mysentient_term_expander_default_session_mt$.getGlobalValue();
                }
                if (NIL == parsing_mt) {
                    parsing_mt = $cb_mysentient_term_expander_default_parsing_mt$.getGlobalValue();
                }
                if (NIL == generation_mt) {
                    generation_mt = $cb_mysentient_term_expander_default_generation_mt$.getGlobalValue();
                }
                if (((((((NIL != form_submittedP) && (NIL != string)) && (NIL != Strings.stringNE(string, $str_alt36$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != profile_mt)) && (NIL != session_mt)) && (NIL != parsing_mt)) && (NIL != generation_mt)) {
                    expand_term_and_display_expansions(string, expansion_types, instantiate_collectionsP, profile_mt, session_mt, parsing_mt, generation_mt, output_format);
                } else {
                    term_expander_form(string, expansion_types, instantiate_collectionsP, profile_mt, session_mt, parsing_mt, generation_mt, output_format);
                }
                $cb_mysentient_term_expander_last_string$.setDynamicValue(string, thread);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_mysentient_term_expander(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt117$_MySentient_Term_Expander_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt49$cb_mysentient_term_expander);
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

    public static final SubLObject declare_cb_mysentient_file() {
        declareFunction("cb_mysentient_user_profile_users", "CB-MYSENTIENT-USER-PROFILE-USERS", 0, 0, false);
        declareFunction("cb_mysentient_user_profile_dumper", "CB-MYSENTIENT-USER-PROFILE-DUMPER", 0, 1, false);
        declareFunction("cb_link_mysentient_user_profile_dumper", "CB-LINK-MYSENTIENT-USER-PROFILE-DUMPER", 0, 1, false);
        declareMacro("form_row", "FORM-ROW");
        declareFunction("term_expander_form", "TERM-EXPANDER-FORM", 8, 0, false);
        declareFunction("display_expansions_html_row", "DISPLAY-EXPANSIONS-HTML-ROW", 1, 2, false);
        declareFunction("display_expansions_html", "DISPLAY-EXPANSIONS-HTML", 3, 0, false);
        declareFunction("display_expansions_xml_row", "DISPLAY-EXPANSIONS-XML-ROW", 1, 2, false);
        declareFunction("display_expansions_xml", "DISPLAY-EXPANSIONS-XML", 3, 0, false);
        declareFunction("expand_term_and_display_expansions", "EXPAND-TERM-AND-DISPLAY-EXPANSIONS", 8, 0, false);
        declareFunction("extract_mt", "EXTRACT-MT", 3, 0, false);
        declareFunction("extract_boolean", "EXTRACT-BOOLEAN", 3, 0, false);
        declareFunction("cb_mysentient_term_expander", "CB-MYSENTIENT-TERM-EXPANDER", 0, 1, false);
        declareFunction("cb_link_mysentient_term_expander", "CB-LINK-MYSENTIENT-TERM-EXPANDER", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_mysentient_file() {
        defparameter("*CB-MYSENTIENT-USER-PROFILE-LAST-USER*", NIL);
        defparameter("*CB-MYSENTIENT-USER-PROFILE-LAST-SHOW-CYCL?*", T);
        defparameter("*CB-MYSENTIENT-USER-PROFILE-LAST-LINK-TERMS?*", T);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-PROFILE-MT*", $$MySePrototypeUserProfileMt);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-SESSION-MT*", $$MySePrototypeSessionMt);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-PARSING-MT*", $$MySePrototypeParsingMt);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-GENERATION-MT*", $$MySePrototypeGenerationMt);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-OUTPUT-FORMAT*", $$$html);
        deflexical("*CB-MYSENTIENT-TERM-EXPANDER-DEFAULT-INSTANTIATE-COLLECTIONS?*", T);
        defparameter("*CB-MYSENTIENT-TERM-EXPANDER-LAST-STRING*", $str_alt36$);
        return NIL;
    }

    public static final SubLObject setup_cb_mysentient_file() {
                utilities_macros.register_html_state_variable($cb_mysentient_user_profile_last_user$);
        utilities_macros.register_html_state_variable($sym1$_CB_MYSENTIENT_USER_PROFILE_LAST_SHOW_CYCL__);
        utilities_macros.register_html_state_variable($sym2$_CB_MYSENTIENT_USER_PROFILE_LAST_LINK_TERMS__);
        html_macros.note_html_handler_function(CB_MYSENTIENT_USER_PROFILE_DUMPER);
        cb_utilities.setup_cb_link_method($MYSENTIENT_USER_PROFILE_DUMPER, CB_LINK_MYSENTIENT_USER_PROFILE_DUMPER, ONE_INTEGER);
        cb_utilities.declare_cb_tool($MYSENTIENT_USER_PROFILE_DUMPER, $$$MySentient_User_Profile_Dumper, $$$MySeUPD, $str_alt34$Display_profiles_of_MySentient_us);
        utilities_macros.register_html_state_variable($cb_mysentient_term_expander_last_string$);
        html_macros.note_html_handler_function(CB_MYSENTIENT_TERM_EXPANDER);
        cb_utilities.setup_cb_link_method($MYSENTIENT_TERM_EXPANDER, CB_LINK_MYSENTIENT_TERM_EXPANDER, ONE_INTEGER);
        cb_utilities.declare_cb_tool($MYSENTIENT_TERM_EXPANDER, $$$MySentient_Term_Expander, $$$MySeExp, $str_alt121$Expand_terms_in_the_manner_of_the);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $cb_mysentient_user_profile_last_user$ = makeSymbol("*CB-MYSENTIENT-USER-PROFILE-LAST-USER*");

    static private final SubLSymbol $sym1$_CB_MYSENTIENT_USER_PROFILE_LAST_SHOW_CYCL__ = makeSymbol("*CB-MYSENTIENT-USER-PROFILE-LAST-SHOW-CYCL?*");

    static private final SubLSymbol $sym2$_CB_MYSENTIENT_USER_PROFILE_LAST_LINK_TERMS__ = makeSymbol("*CB-MYSENTIENT-USER-PROFILE-LAST-LINK-TERMS?*");

    static private final SubLString $$$MySentient_Users = makeString("MySentient Users");

    static private final SubLString $$$Select_a_user_from_the_list_below = makeString("Select a user from the list below");

    static private final SubLString $str_alt5$cb_mysentient_user_profile_dumper = makeString("cb-mysentient-user-profile-dumper");

    static private final SubLString $$$Get_profile = makeString("Get profile");

    static private final SubLString $$$get = makeString("get");





    static private final SubLString $$$Choice = makeString("Choice");

    static private final SubLString $$$User = makeString("User");

    static private final SubLString $$$Profile = makeString("Profile");

    static private final SubLString $$$Lexical_Microtheories = makeString("Lexical Microtheories");

    static private final SubLString $$$Sessions = makeString("Sessions");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $str_alt16$N_A = makeString("N/A");



    static private final SubLString $$$none = makeString("none");

    static private final SubLString $str_alt19$_ = makeString(" ");

    static private final SubLString $str_alt20$Show_CycL_ = makeString("Show CycL?");

    static private final SubLString $str_alt21$show_cycl = makeString("show-cycl");

    static private final SubLString $str_alt22$Link_terms_ = makeString("Link terms?");

    static private final SubLString $str_alt23$link_terms = makeString("link-terms");

    static private final SubLString $str_alt24$Flush_irrelevance_cache_ = makeString("Flush irrelevance cache?");

    static private final SubLString $str_alt25$flush_irrrelevance_cache = makeString("flush-irrrelevance-cache");

    static private final SubLString $str_alt26$flush_irrelevance_cache = makeString("flush-irrelevance-cache");

    private static final SubLSymbol CB_MYSENTIENT_USER_PROFILE_DUMPER = makeSymbol("CB-MYSENTIENT-USER-PROFILE-DUMPER");

    static private final SubLString $str_alt28$_MySentient_User_Profile_Dumper_ = makeString("[MySentient User Profile Dumper]");



    private static final SubLSymbol $MYSENTIENT_USER_PROFILE_DUMPER = makeKeyword("MYSENTIENT-USER-PROFILE-DUMPER");

    private static final SubLSymbol CB_LINK_MYSENTIENT_USER_PROFILE_DUMPER = makeSymbol("CB-LINK-MYSENTIENT-USER-PROFILE-DUMPER");

    static private final SubLString $$$MySentient_User_Profile_Dumper = makeString("MySentient User Profile Dumper");

    static private final SubLString $$$MySeUPD = makeString("MySeUPD");

    static private final SubLString $str_alt34$Display_profiles_of_MySentient_us = makeString("Display profiles of MySentient users");

    static private final SubLList $list_alt35 = list(makeSymbol("LABEL"), makeSymbol("WIDGET"), makeSymbol("&OPTIONAL"), list(makeSymbol("EXPLANATION"), makeString("")));

    static private final SubLString $str_alt36$ = makeString("");



    private static final SubLSymbol HTML_FANCY_TABLE_HEADER = makeSymbol("HTML-FANCY-TABLE-HEADER");

    static private final SubLList $list_alt39 = list(makeKeyword("VALIGN"), makeKeyword("TOP"), makeKeyword("ALIGN"), makeKeyword("RIGHT"));





    static private final SubLString $$$xml = makeString("xml");

    static private final SubLString $$$html = makeString("html");

    static private final SubLString $$$XML = makeString("XML");

    static private final SubLString $$$HTML = makeString("HTML");

    static private final SubLSymbol $sym46$STRING_ = makeSymbol("STRING=");

    static private final SubLString $$$MySentient_Term_Expander = makeString("MySentient Term Expander");

    static private final SubLString $str_alt48$Enter_a_term_to_be_expanded___For = makeString("Enter a term to be expanded.  For most faithful reproduction of the User Profile Manager, leave all settings at their default.");

    static private final SubLString $str_alt49$cb_mysentient_term_expander = makeString("cb-mysentient-term-expander");

    static private final SubLString $$$submit = makeString("submit");

    static private final SubLString $$$Expand_term = makeString("Expand term");

    static private final SubLString $$$Term = makeString("Term");

    static private final SubLString $$$string = makeString("string");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt55$Term_to_be_expanded_in_either_Eng = makeString("Term to be expanded in either English or CycL.  In English, will generally be a noun phrase (or N-bar).");

    static private final SubLString $$$Output_Format = makeString("Output Format");

    static private final SubLString $str_alt57$output_format = makeString("output-format");

    static private final SubLString $str_alt58$Whether_to_emit_results_in_XML__a = makeString("Whether to emit results in XML, as the UPM does, or in a more readable HTML format");

    static private final SubLString $str_alt59$Instantiate_collections_ = makeString("Instantiate collections?");

    static private final SubLString $str_alt60$instantiate_collections = makeString("instantiate-collections");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $$$nil = makeString("nil");

    static private final SubLString $str_alt65$When_a_string_denoting_a_collecti = makeString("When a string denoting a collection is used in context, the UPM often interprets this as an instance of that collection. For example, \"dog\" in \"my dog\" is an individual dog, not the collection of all dogs.");

    static private final SubLString $$$Strategies = makeString("Strategies");

    static private final SubLString $str_alt67$expansion_types = makeString("expansion-types");

    static private final SubLString $str_alt68$Which_strategies_to_use___Strateg = makeString("Which strategies to use.  Strategies not selected by default may be experimental.");

    static private final SubLString $$$Profile_MT = makeString("Profile MT");

    static private final SubLString $str_alt70$profile_mt = makeString("profile-mt");

    static private final SubLString $str_alt71$Microtheory_acting_as_user_profil = makeString("Microtheory acting as user profile.");

    static private final SubLString $$$Session_MT = makeString("Session MT");

    static private final SubLString $str_alt73$session_mt = makeString("session-mt");

    static private final SubLString $str_alt74$Microtheory_acting_as_user_sessio = makeString("Microtheory acting as user session.");

    static private final SubLString $$$Parsing_MT = makeString("Parsing MT");

    static private final SubLString $str_alt76$parsing_mt = makeString("parsing-mt");

    static private final SubLString $str_alt77$Microtheory_acting_as_user_s_pars = makeString("Microtheory acting as user's parsing lexicon.");

    static private final SubLString $$$Paraphrase_MT = makeString("Paraphrase MT");

    static private final SubLString $str_alt79$generation_mt = makeString("generation-mt");

    static private final SubLString $str_alt80$Microtheory_acting_as_user_s_gene = makeString("Microtheory acting as user's generation lexicon.");

    public static final SubLFloat $float$1_0 = makeDouble(1.0);



    static private final SubLString $$$String = makeString("String");

    static private final SubLString $$$CycL_Term = makeString("CycL Term");

    static private final SubLString $str_alt85$Parse_failed_ = makeString("Parse failed!");

    static private final SubLString $str_alt86$Strategy___A = makeString("Strategy: ~A");

    static private final SubLString $$$Expansion_String = makeString("Expansion String");

    static private final SubLString $$$Confidence = makeString("Confidence");

    static private final SubLString $$$Expansion_CycL = makeString("Expansion CycL");

    private static final SubLSymbol DISPLAY_EXPANSIONS_HTML_ROW = makeSymbol("DISPLAY-EXPANSIONS-HTML-ROW");

    static private final SubLString $$$No_expansions_for_this_strategy = makeString("No expansions for this strategy");

    static private final SubLString $str_alt92$myse_TEXT = makeString("myse:TEXT");

    static private final SubLString $$$confidence = makeString("confidence");

    static private final SubLString $str_alt94$_A = makeString("~A");





    static private final SubLString $str_alt97$myse_EXPANSIONS = makeString("myse:EXPANSIONS");

    static private final SubLString $str_alt98$xmlns_myse = makeString("xmlns:myse");

    static private final SubLString $str_alt99$http___www_mysentient_com = makeString("http://www.mysentient.com");

    static private final SubLString $$$module = makeString("module");

    static private final SubLString $str_alt101$com_cyc_project_mysentient_module = makeString("com.cyc.project.mysentient.module.userProfileManager");

    static private final SubLString $str_alt102$myse_EXPANSION = makeString("myse:EXPANSION");

    static private final SubLString $$$length = makeString("length");

    static private final SubLString $$$offset = makeString("offset");

    static private final SubLString $str_alt105$myse_OUTPUT_TEXT = makeString("myse:OUTPUT_TEXT");

    static private final SubLString $str_alt106$myse_EXPANSION_TEXTS = makeString("myse:EXPANSION_TEXTS");

    static private final SubLString $str_alt107$expansion_type = makeString("expansion_type");

    private static final SubLSymbol DISPLAY_EXPANSIONS_XML_ROW = makeSymbol("DISPLAY-EXPANSIONS-XML-ROW");

    static private final SubLString $str_alt109$myse_SEMANTICS = makeString("myse:SEMANTICS");

    public static final SubLObject $$SomeExampleFn = constant_handles.reader_make_constant_shell(makeString("SomeExampleFn"));

    public static final SubLObject $$MySePrototypeUserProfileMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeUserProfileMt"));

    public static final SubLObject $$MySePrototypeSessionMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeSessionMt"));

    public static final SubLObject $$MySePrototypeParsingMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeParsingMt"));

    public static final SubLObject $$MySePrototypeGenerationMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeGenerationMt"));

    public static final SubLSymbol $cb_mysentient_term_expander_last_string$ = makeSymbol("*CB-MYSENTIENT-TERM-EXPANDER-LAST-STRING*");

    private static final SubLSymbol CB_MYSENTIENT_TERM_EXPANDER = makeSymbol("CB-MYSENTIENT-TERM-EXPANDER");

    static private final SubLString $str_alt117$_MySentient_Term_Expander_ = makeString("[MySentient Term Expander]");

    private static final SubLSymbol $MYSENTIENT_TERM_EXPANDER = makeKeyword("MYSENTIENT-TERM-EXPANDER");

    private static final SubLSymbol CB_LINK_MYSENTIENT_TERM_EXPANDER = makeSymbol("CB-LINK-MYSENTIENT-TERM-EXPANDER");

    static private final SubLString $$$MySeExp = makeString("MySeExp");

    static private final SubLString $str_alt121$Expand_terms_in_the_manner_of_the = makeString("Expand terms in the manner of the MySentient User Profile Manager");

    // // Initializers
    public void declareFunctions() {
        declare_cb_mysentient_file();
    }

    public void initializeVariables() {
        init_cb_mysentient_file();
    }

    public void runTopLevelForms() {
        setup_cb_mysentient_file();
    }
}

