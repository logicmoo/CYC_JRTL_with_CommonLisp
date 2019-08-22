/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-WEBSTORE-VIEWER
 *  source file: /cyc/top/cycl/cb-webstore-viewer.lisp
 *  created:     2019/07/03 17:38:59
 */
public final class cb_webstore_viewer extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_webstore_viewer() {
    }

    public static final SubLFile me = new cb_webstore_viewer();

    public static final String myName = "com.cyc.cycjava.cycl.cb_webstore_viewer";





    public static final SubLObject cb_view_webstore(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Lucene_Webstore_Viewer;
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
                                    html_utilities.html_markup($str_alt7$yui_skin_sam);
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
                                                cb_webstoreview_show_settings();
                                                cb_webstoreview_show_old_searches();
                                                cb_webstoreview_show_searchbox();
                                                cb_webstoreview_show_results();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
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
            return NIL;
        }
    }

    public static final SubLObject cb_link_view_webstore(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt9$_Lucene_Webstore_Viewer_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt11$cb_view_webstore);
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

    public static final SubLObject cb_webstoreview_show_settings() {
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
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$30px);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($VIEW_WEBSTORE, $str_alt20$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt21$cb_webstoreview_change_settings, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Webstore_Status);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        {
                                                            SubLObject operationalP = lucene_index.ws_index_server_aliveP($cb_webstore_host$.getDynamicValue(thread), $cb_webstore_port$.getDynamicValue(thread), UNPROVIDED);
                                                            SubLObject color = (NIL != operationalP) ? ((SubLObject) (html_macros.$html_color_lighter_green$.getDynamicValue(thread))) : html_macros.$html_color_lighter_red$.getDynamicValue(thread);
                                                            SubLObject message = (NIL != operationalP) ? ((SubLObject) ($$$operational)) : $$$not_responding;
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (NIL != color) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(color);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(message);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Recheck, $$$recheck, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Webstore_Host);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt28$webstore_host, $cb_webstore_host$.getDynamicValue(thread), $int$60);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Change, $$$change, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Webstore_Port);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt33$webstore_port, $cb_webstore_port$.getDynamicValue(thread), SIX_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Change, $$$change, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
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
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
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

    public static final SubLObject cb_webstoreview_change_settings(SubLObject args) {
        {
            SubLObject new_host = html_utilities.html_extract_input($str_alt28$webstore_host, args);
            SubLObject port_spec = html_utilities.html_extract_input($str_alt33$webstore_port, args);
            SubLObject new_port = (NIL != number_utilities.number_string_p(port_spec)) ? ((SubLObject) (parse_integer(port_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            if (new_host.isString()) {
                $cb_webstore_host$.setDynamicValue(new_host);
            }
            if (new_port.isFixnum()) {
                $cb_webstore_port$.setDynamicValue(new_port);
            }
        }
        return cb_view_webstore(UNPROVIDED);
    }



    public static final SubLObject next_webstoreview_search_id() {
        return integer_sequence_generator.integer_sequence_generator_next($cb_webstoreview_isg$.getGlobalValue());
    }



    public static final SubLObject with_current_webstoreview_search(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($cb_webstoreview_current_search$, id)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt37);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_webstoreview_current_search() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_webstoreview_current_search$.getDynamicValue(thread);
        }
    }

    public static final SubLObject cb_webstoreview_search_activeP() {
        return fixnump(cb_webstoreview_current_search());
    }

    public static final SubLObject cb_webstoreview_focus_search(SubLObject id) {
        $cb_webstoreview_current_search$.setDynamicValue(id);
        return id;
    }



    public static final SubLObject get_webstoreview_search(SubLObject id) {
        if (id == UNPROVIDED) {
            id = $cb_webstoreview_current_search$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_lookup($cb_webstoreview_searches$.getDynamicValue(thread), id, UNPROVIDED);
        }
    }

    public static final SubLObject set_webstoreview_search(SubLObject id, SubLObject search_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_enter($cb_webstoreview_searches$.getDynamicValue(thread), id, search_info);
        }
    }

    public static final SubLObject delete_webstoreview_search(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_remove($cb_webstoreview_searches$.getDynamicValue(thread), id);
        }
    }

    public static final SubLObject all_webstoreview_search_ids() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Sort.sort(dictionary.dictionary_keys($cb_webstoreview_searches$.getDynamicValue(thread)), symbol_function($sym40$_), UNPROVIDED);
        }
    }

    public static final SubLObject webstoreview_searches_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_length($cb_webstoreview_searches$.getDynamicValue(thread));
        }
    }

    public static final class $webstoreview_search_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cb_webstore_viewer.$webstoreview_search_native.structDecl;
        }

        public SubLObject getField2() {
            return $id;
        }

        public SubLObject getField3() {
            return $query;
        }

        public SubLObject getField4() {
            return $keys;
        }

        public SubLObject getField5() {
            return $results;
        }

        public SubLObject setField2(SubLObject value) {
            return $id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $query = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $keys = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $results = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $query = Lisp.NIL;

        public SubLObject $keys = Lisp.NIL;

        public SubLObject $results = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cb_webstore_viewer.$webstoreview_search_native.class, WEBSTOREVIEW_SEARCH, WEBSTOREVIEW_SEARCH_P, $list_alt43, $list_alt44, new String[]{ "$id", "$query", "$keys", "$results" }, $list_alt45, $list_alt46, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_webstoreview_search$ = makeSymbol("*DTP-WEBSTOREVIEW-SEARCH*");

    public static final SubLObject webstoreview_search_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject webstoreview_search_p(SubLObject v_object) {
        return v_object.getClass() == cb_webstore_viewer.$webstoreview_search_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $webstoreview_search_p$UnaryFunction extends UnaryFunction {
        public $webstoreview_search_p$UnaryFunction() {
            super(extractFunctionNamed("WEBSTOREVIEW-SEARCH-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return webstoreview_search_p(arg1);
        }
    }

    public static final SubLObject webstoreview_search_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.getField2();
    }

    public static final SubLObject webstoreview_search_query(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.getField3();
    }

    public static final SubLObject webstoreview_search_keys(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.getField4();
    }

    public static final SubLObject webstoreview_search_results(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_webstoreview_search_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_webstoreview_search_query(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_webstoreview_search_keys(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_webstoreview_search_results(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WEBSTOREVIEW_SEARCH_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_webstoreview_search(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cb_webstore_viewer.$webstoreview_search_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_webstoreview_search_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY)) {
                            _csetf_webstoreview_search_query(v_new, current_value);
                        } else
                            if (pcase_var.eql($KEYS)) {
                                _csetf_webstoreview_search_keys(v_new, current_value);
                            } else
                                if (pcase_var.eql($RESULTS)) {
                                    _csetf_webstoreview_search_results(v_new, current_value);
                                } else {
                                    Errors.error($str_alt61$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_webstoreview_search(SubLObject query) {
        {
            SubLObject search_info = make_webstoreview_search(UNPROVIDED);
            SubLObject new_id = next_webstoreview_search_id();
            _csetf_webstoreview_search_id(search_info, new_id);
            _csetf_webstoreview_search_query(search_info, query);
            _csetf_webstoreview_search_keys(search_info, cb_webstoreview_search_keys(query));
            set_webstoreview_search(new_id, search_info);
            return search_info;
        }
    }

    public static final SubLObject current_webstoreview_search_query() {
        {
            SubLObject search_info = get_webstoreview_search(UNPROVIDED);
            if (NIL != webstoreview_search_p(search_info)) {
                return webstoreview_search_query(search_info);
            }
        }
        return NIL;
    }

    public static final SubLObject current_webstoreview_search_keys() {
        {
            SubLObject search_info = get_webstoreview_search(UNPROVIDED);
            if (NIL != webstoreview_search_p(search_info)) {
                return webstoreview_search_keys(search_info);
            }
        }
        return NIL;
    }

    public static final SubLObject current_webstoreview_search_results() {
        {
            SubLObject search_info = get_webstoreview_search(UNPROVIDED);
            if (NIL != webstoreview_search_p(search_info)) {
                return webstoreview_search_results(search_info);
            }
        }
        return NIL;
    }

    public static final SubLObject set_current_webstoreview_search_results(SubLObject results) {
        {
            SubLObject search_info = get_webstoreview_search(UNPROVIDED);
            if (NIL != webstoreview_search_p(search_info)) {
                _csetf_webstoreview_search_results(search_info, results);
            }
        }
        return results;
    }

    public static final SubLObject forget_webstoreview_search(SubLObject id) {
        if (id == UNPROVIDED) {
            id = $cb_webstoreview_current_search$.getDynamicValue();
        }
        delete_webstoreview_search(id);
        {
            SubLObject next = nreverse(all_webstoreview_search_ids()).first();
            cb_webstoreview_focus_search(next);
            return next;
        }
    }

    public static final SubLObject cb_webstoreview_show_old_searches() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ONE_INTEGER.numL(webstoreview_searches_count())) {
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
                            html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$40px);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($$$Previous_Searches);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$ID);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$Query);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$Results);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = all_webstoreview_search_ids();
                                            SubLObject id = NIL;
                                            for (id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , id = cdolist_list_var.first()) {
                                                if (!id.numE(cb_webstoreview_current_search())) {
                                                    {
                                                        SubLObject search_info = get_webstoreview_search(id);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != html_macros.$html_color_dark_green$.getDynamicValue(thread)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_color_dark_green$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject color_val = html_macros.$html_color_white$.getDynamicValue(thread);
                                                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                            if (NIL != color_val) {
                                                                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$__A_, id);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
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
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(webstoreview_search_query(search_info));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(length(webstoreview_search_results(search_info)));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($WEBSTOREVIEW_DELETE_SEARCH, id, $str_alt72$_Delete_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($WEBSTOREVIEW_FOCUS_SEARCH, id, $str_alt74$_Focus_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
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

    public static final SubLObject cb_link_webstoreview_delete_search(SubLObject id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!linktext.isString()) {
                linktext = cconcatenate($str_alt75$_Delete_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt76$_ });
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt77$cb_webstoreview_delete_search_id_, id);
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

    public static final SubLObject cb_link_webstoreview_focus_search(SubLObject id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!linktext.isString()) {
                linktext = cconcatenate($str_alt79$_Focus_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt76$_ });
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt80$cb_webstoreview_focus_id__A, id);
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

    public static final SubLObject cb_webstoreview_show_results() {
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
                        html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$40px);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            if (NIL != cb_webstoreview_search_activeP()) {
                                html_utilities.html_princ($str_alt82$Results_for_Query__);
                                html_utilities.html_princ(cb_webstoreview_current_search());
                            } else {
                                html_utilities.html_princ($$$Query_Result_Section);
                            }
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            if (NIL != cb_webstoreview_search_activeP()) {
                {
                    SubLObject query = current_webstoreview_search_query();
                    SubLObject results = current_webstoreview_search_results();
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($0);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt85$Query__);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                                            html_utilities.html_princ(query);
                                                            html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt86$Hits__);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
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
                                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(length(results));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL == current_webstoreview_search_results()) {
                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt87$Currently__no_results_to_show_);
                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                            } else {
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
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
                                    html_utilities.html_markup(FIVE_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$Number);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$File_Path);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject list_var = NIL;
                                            SubLObject file_path = NIL;
                                            SubLObject counter = NIL;
                                            for (list_var = current_webstoreview_search_results(), file_path = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , file_path = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                {
                                                    SubLObject number = add(counter, ONE_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject linktext = cconcatenate($str_alt90$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(number), $str_alt76$_ });
                                                                        cb_utilities.cb_link($VIEW_WEBSTORE_DOC, cb_webstoreview_current_search(), counter, linktext, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
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
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                                                    html_utilities.html_princ(file_path);
                                                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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

    public static final SubLObject cb_webstoreview_show_searchbox() {
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
                        html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$40px);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            html_utilities.html_princ($$$Search);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt93$For_help_with_the_query_language_);
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt94$http___lucene_apache_org_java_doc);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Lucene_Query_Parser_Syntax);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt96$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt97$cb_webstoreview_search_request, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt98$search_request);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($int$60);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(THREE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (current_webstoreview_search_query().isString()) {
                                                                            html_utilities.html_princ(current_webstoreview_search_query());
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                                                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Search, $$$search, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
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
     * Identifies the key terms in the search-string, which are later highlighted
     * when the document is displayed.
     */
    public static final SubLObject cb_webstoreview_search_keys(SubLObject query_string) {
        {
            SubLObject quoted_terms = regular_expression_utilities.find_all_matches_for_regular_expression($str_alt100$__________, query_string, UNPROVIDED, UNPROVIDED);
            SubLObject required_terms = regular_expression_utilities.find_all_matches_for_regular_expression($str_alt101$___w_, query_string, UNPROVIDED, UNPROVIDED);
            SubLObject negated_terms = regular_expression_utilities.find_all_matches_for_regular_expression($str_alt102$___w_, query_string, UNPROVIDED, UNPROVIDED);
            SubLObject terms = union(Mapping.mapcar(UNQUOTE_STRING, quoted_terms), Mapping.mapcar(STRIP_FIRST, required_terms), UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = union(quoted_terms, union(required_terms, negated_terms, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                query_string = string_utilities.remove_substring(query_string, v_term);
            }
            return remove_if(EMPTY_STRING_P, union(terms, string_utilities.split_string(query_string, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject cb_webstoreview_search_request(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject basic_query_string = html_utilities.html_extract_input($str_alt98$search_request, args);
                SubLObject raw_query_string = string_utilities.reduce_whitespace(substitute(CHAR_space, CHAR_newline, basic_query_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject query_string = cb_webstoreview_expand_cycl_references(raw_query_string);
                SubLObject raw_results = lucene_index.ws_index_search_for_pathnames(query_string, $cb_webstore_host$.getDynamicValue(thread), $cb_webstore_port$.getDynamicValue(thread));
                SubLObject search_info = new_webstoreview_search(raw_query_string);
                cb_webstoreview_focus_search(webstoreview_search_id(search_info));
                set_current_webstoreview_search_results(raw_results);
            }
            return cb_view_webstore(UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown -- find and expand all CycL terms here!
     */
    public static final SubLObject cb_webstoreview_expand_cycl_references(SubLObject query_string) {
        {
            SubLObject cdolist_list_var = string_utilities.constant_names_in_string(query_string, UNPROVIDED);
            SubLObject constant_name = NIL;
            for (constant_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant_name = cdolist_list_var.first()) {
                {
                    SubLObject constant = constants_high.find_constant(constant_name);
                    SubLObject external_id = kb_utilities.hl_external_id_string(constant);
                    query_string = string_utilities.string_substitute(external_id, cconcatenate($str_alt107$__, constant_name), query_string, UNPROVIDED);
                }
            }
        }
        return query_string;
    }

    /**
     * Returns T if one of the substrings is in STRING
     */
    public static final SubLObject cb_webstoreview_string_containsP(SubLObject string, SubLObject substrings) {
        {
            SubLObject cdolist_list_var = substrings;
            SubLObject substring = NIL;
            for (substring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , substring = cdolist_list_var.first()) {
                if (NIL != string_utilities.substringP(substring, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_webstoreview_delete_search(SubLObject args) {
        {
            SubLObject search_id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject search_id = (NIL != number_utilities.number_string_p(search_id_string)) ? ((SubLObject) (parse_integer(search_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            if (search_id.isFixnum()) {
                forget_webstoreview_search(search_id);
            }
        }
        return cb_view_webstore(UNPROVIDED);
    }

    public static final SubLObject cb_webstoreview_focus(SubLObject args) {
        {
            SubLObject search_id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject search_id = (NIL != number_utilities.number_string_p(search_id_string)) ? ((SubLObject) (parse_integer(search_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            if (search_id.isFixnum()) {
                cb_webstoreview_focus_search(search_id);
            }
        }
        return cb_view_webstore(UNPROVIDED);
    }

    // deflexical
    public static final SubLSymbol $cb_webstore_document_fields$ = makeSymbol("*CB-WEBSTORE-DOCUMENT-FIELDS*");

    public static final SubLObject cb_webstoreview_render_document(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject index_string = html_utilities.html_extract_input($$$filenum, args);
                SubLObject index = (NIL != number_utilities.number_string_p(index_string)) ? ((SubLObject) (parse_integer(index_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject search_id_string = html_utilities.html_extract_input($$$id, args);
                SubLObject search_id = (NIL != number_utilities.number_string_p(search_id_string)) ? ((SubLObject) (parse_integer(search_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject filepath = NIL;
                SubLObject title_var = $$$Webstore_Document;
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
                            SubLObject _prev_bind_0_63 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt7$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt114$Return_to_);
                                        cb_utilities.cb_link($VIEW_WEBSTORE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_65 = $cb_webstoreview_current_search$.currentBinding(thread);
                                            try {
                                                $cb_webstoreview_current_search$.bind(search_id, thread);
                                                if (index.isFixnum()) {
                                                    filepath = nth(index, current_webstoreview_search_results());
                                                }
                                                if (NIL == filepath) {
                                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                    {
                                                        SubLObject color_val = html_macros.$html_color_lighter_red$.getDynamicValue(thread);
                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                        if (NIL != color_val) {
                                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt115$Warning__Invalid_filenumber__A_sp, index_string);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                } else {
                                                    {
                                                        SubLObject fields = $cb_webstore_document_fields$.getGlobalValue();
                                                        SubLObject line_counter = ZERO_INTEGER;
                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(TWO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(TWO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject file_var = filepath;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_68 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_text(file_var, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_68, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt117$Unable_to_open__S, file_var);
                                                                        }
                                                                        {
                                                                            SubLObject stream_var = stream;
                                                                            if (stream_var.isStream()) {
                                                                                {
                                                                                    SubLObject stream_var_69 = stream_var;
                                                                                    SubLObject line_number_var = NIL;
                                                                                    SubLObject line = NIL;
                                                                                    for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_69, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_69, NIL, NIL, UNPROVIDED)) {
                                                                                        if (NIL == fields) {
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    if (line_counter.isZero()) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        if (true) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                                                html_utilities.html_princ($$$Contents);
                                                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                        line_counter = ONE_INTEGER;
                                                                                                    } else {
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
                                                                                                        if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_princ(line_counter);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    }
                                                                                                    line_counter = add(line_counter, ONE_INTEGER);
                                                                                                    if (NIL != cb_webstoreview_string_containsP(line, current_webstoreview_search_keys())) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        if (NIL != html_macros.$html_color_lighter_green$.getDynamicValue(thread)) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_green$.getDynamicValue(thread));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        if (true) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup($$$66em);
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_princ(line);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    } else {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        if (true) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup($$$66em);
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_princ(line);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject datum = fields;
                                                                                                SubLObject current = datum;
                                                                                                SubLObject field = NIL;
                                                                                                SubLObject remainder = NIL;
                                                                                                destructuring_bind_must_consp(current, datum, $list_alt120);
                                                                                                field = current.first();
                                                                                                current = current.rest();
                                                                                                remainder = current;
                                                                                                fields = remainder;
                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                                                html_utilities.html_princ(field);
                                                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_princ(line);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                $cb_webstoreview_current_search$.rebind(_prev_bind_0_65, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt114$Return_to_);
                                        cb_utilities.cb_link($VIEW_WEBSTORE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_63, thread);
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

    public static final SubLObject cb_link_view_webstore_doc(SubLObject search_id, SubLObject filenum, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!linktext.isString()) {
                linktext = cconcatenate($str_alt90$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filenum), $str_alt76$_ });
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt122$cb_webstoreview_render_document_i, search_id, filenum);
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

    public static final SubLObject declare_cb_webstore_viewer_file() {
        declareFunction("cb_view_webstore", "CB-VIEW-WEBSTORE", 0, 1, false);
        declareFunction("cb_link_view_webstore", "CB-LINK-VIEW-WEBSTORE", 0, 1, false);
        declareFunction("cb_webstoreview_show_settings", "CB-WEBSTOREVIEW-SHOW-SETTINGS", 0, 0, false);
        declareFunction("cb_webstoreview_change_settings", "CB-WEBSTOREVIEW-CHANGE-SETTINGS", 1, 0, false);
        declareFunction("next_webstoreview_search_id", "NEXT-WEBSTOREVIEW-SEARCH-ID", 0, 0, false);
        declareMacro("with_current_webstoreview_search", "WITH-CURRENT-WEBSTOREVIEW-SEARCH");
        declareFunction("cb_webstoreview_current_search", "CB-WEBSTOREVIEW-CURRENT-SEARCH", 0, 0, false);
        declareFunction("cb_webstoreview_search_activeP", "CB-WEBSTOREVIEW-SEARCH-ACTIVE?", 0, 0, false);
        declareFunction("cb_webstoreview_focus_search", "CB-WEBSTOREVIEW-FOCUS-SEARCH", 1, 0, false);
        declareFunction("get_webstoreview_search", "GET-WEBSTOREVIEW-SEARCH", 0, 1, false);
        declareFunction("set_webstoreview_search", "SET-WEBSTOREVIEW-SEARCH", 2, 0, false);
        declareFunction("delete_webstoreview_search", "DELETE-WEBSTOREVIEW-SEARCH", 1, 0, false);
        declareFunction("all_webstoreview_search_ids", "ALL-WEBSTOREVIEW-SEARCH-IDS", 0, 0, false);
        declareFunction("webstoreview_searches_count", "WEBSTOREVIEW-SEARCHES-COUNT", 0, 0, false);
        declareFunction("webstoreview_search_print_function_trampoline", "WEBSTOREVIEW-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("webstoreview_search_p", "WEBSTOREVIEW-SEARCH-P", 1, 0, false);
        new cb_webstore_viewer.$webstoreview_search_p$UnaryFunction();
        declareFunction("webstoreview_search_id", "WEBSTOREVIEW-SEARCH-ID", 1, 0, false);
        declareFunction("webstoreview_search_query", "WEBSTOREVIEW-SEARCH-QUERY", 1, 0, false);
        declareFunction("webstoreview_search_keys", "WEBSTOREVIEW-SEARCH-KEYS", 1, 0, false);
        declareFunction("webstoreview_search_results", "WEBSTOREVIEW-SEARCH-RESULTS", 1, 0, false);
        declareFunction("_csetf_webstoreview_search_id", "_CSETF-WEBSTOREVIEW-SEARCH-ID", 2, 0, false);
        declareFunction("_csetf_webstoreview_search_query", "_CSETF-WEBSTOREVIEW-SEARCH-QUERY", 2, 0, false);
        declareFunction("_csetf_webstoreview_search_keys", "_CSETF-WEBSTOREVIEW-SEARCH-KEYS", 2, 0, false);
        declareFunction("_csetf_webstoreview_search_results", "_CSETF-WEBSTOREVIEW-SEARCH-RESULTS", 2, 0, false);
        declareFunction("make_webstoreview_search", "MAKE-WEBSTOREVIEW-SEARCH", 0, 1, false);
        declareFunction("new_webstoreview_search", "NEW-WEBSTOREVIEW-SEARCH", 1, 0, false);
        declareFunction("current_webstoreview_search_query", "CURRENT-WEBSTOREVIEW-SEARCH-QUERY", 0, 0, false);
        declareFunction("current_webstoreview_search_keys", "CURRENT-WEBSTOREVIEW-SEARCH-KEYS", 0, 0, false);
        declareFunction("current_webstoreview_search_results", "CURRENT-WEBSTOREVIEW-SEARCH-RESULTS", 0, 0, false);
        declareFunction("set_current_webstoreview_search_results", "SET-CURRENT-WEBSTOREVIEW-SEARCH-RESULTS", 1, 0, false);
        declareFunction("forget_webstoreview_search", "FORGET-WEBSTOREVIEW-SEARCH", 0, 1, false);
        declareFunction("cb_webstoreview_show_old_searches", "CB-WEBSTOREVIEW-SHOW-OLD-SEARCHES", 0, 0, false);
        declareFunction("cb_link_webstoreview_delete_search", "CB-LINK-WEBSTOREVIEW-DELETE-SEARCH", 1, 1, false);
        declareFunction("cb_link_webstoreview_focus_search", "CB-LINK-WEBSTOREVIEW-FOCUS-SEARCH", 1, 1, false);
        declareFunction("cb_webstoreview_show_results", "CB-WEBSTOREVIEW-SHOW-RESULTS", 0, 0, false);
        declareFunction("cb_webstoreview_show_searchbox", "CB-WEBSTOREVIEW-SHOW-SEARCHBOX", 0, 0, false);
        declareFunction("cb_webstoreview_search_keys", "CB-WEBSTOREVIEW-SEARCH-KEYS", 1, 0, false);
        declareFunction("cb_webstoreview_search_request", "CB-WEBSTOREVIEW-SEARCH-REQUEST", 1, 0, false);
        declareFunction("cb_webstoreview_expand_cycl_references", "CB-WEBSTOREVIEW-EXPAND-CYCL-REFERENCES", 1, 0, false);
        declareFunction("cb_webstoreview_string_containsP", "CB-WEBSTOREVIEW-STRING-CONTAINS?", 2, 0, false);
        declareFunction("cb_webstoreview_delete_search", "CB-WEBSTOREVIEW-DELETE-SEARCH", 1, 0, false);
        declareFunction("cb_webstoreview_focus", "CB-WEBSTOREVIEW-FOCUS", 1, 0, false);
        declareFunction("cb_webstoreview_render_document", "CB-WEBSTOREVIEW-RENDER-DOCUMENT", 1, 0, false);
        declareFunction("cb_link_view_webstore_doc", "CB-LINK-VIEW-WEBSTORE-DOC", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_webstore_viewer_file() {
        defparameter("*CB-WEBSTORE-HOST*", $$$localhost);
        defparameter("*CB-WEBSTORE-PORT*", $int$7777);
        deflexical("*CB-WEBSTOREVIEW-ISG*", NIL != boundp($cb_webstoreview_isg$) ? ((SubLObject) ($cb_webstoreview_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*CB-WEBSTOREVIEW-CURRENT-SEARCH*", NIL);
        defparameter("*CB-WEBSTOREVIEW-SEARCHES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-WEBSTOREVIEW-SEARCH*", WEBSTOREVIEW_SEARCH);
        deflexical("*CB-WEBSTORE-DOCUMENT-FIELDS*", $list_alt111);
        return NIL;
    }

    public static final SubLObject setup_cb_webstore_viewer_file() {
                utilities_macros.register_html_state_variable($cb_webstore_host$);
        utilities_macros.register_html_state_variable($cb_webstore_port$);
        html_macros.note_html_handler_function(CB_VIEW_WEBSTORE);
        cb_utilities.setup_cb_link_method($VIEW_WEBSTORE, CB_LINK_VIEW_WEBSTORE, ONE_INTEGER);
        cb_utilities.declare_cb_tool($VIEW_WEBSTORE, $$$WebStore_Viewer, $$$WebView, $str_alt16$View_the_Lucene_index_of_webstore);
        html_macros.note_html_handler_function(CB_WEBSTOREVIEW_CHANGE_SETTINGS);
        subl_macro_promotions.declare_defglobal($cb_webstoreview_isg$);
        utilities_macros.register_html_state_variable($cb_webstoreview_current_search$);
        utilities_macros.register_html_state_variable($cb_webstoreview_searches$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_webstoreview_search$.getGlobalValue(), symbol_function(WEBSTOREVIEW_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(WEBSTOREVIEW_SEARCH_ID, _CSETF_WEBSTOREVIEW_SEARCH_ID);
        def_csetf(WEBSTOREVIEW_SEARCH_QUERY, _CSETF_WEBSTOREVIEW_SEARCH_QUERY);
        def_csetf(WEBSTOREVIEW_SEARCH_KEYS, _CSETF_WEBSTOREVIEW_SEARCH_KEYS);
        def_csetf(WEBSTOREVIEW_SEARCH_RESULTS, _CSETF_WEBSTOREVIEW_SEARCH_RESULTS);
        identity(WEBSTOREVIEW_SEARCH);
        cb_utilities.setup_cb_link_method($WEBSTOREVIEW_DELETE_SEARCH, CB_LINK_WEBSTOREVIEW_DELETE_SEARCH, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($WEBSTOREVIEW_FOCUS_SEARCH, CB_LINK_WEBSTOREVIEW_FOCUS_SEARCH, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_WEBSTOREVIEW_SEARCH_REQUEST);
        html_macros.note_html_handler_function(CB_WEBSTOREVIEW_DELETE_SEARCH);
        html_macros.note_html_handler_function(CB_WEBSTOREVIEW_FOCUS);
        html_macros.note_html_handler_function(CB_WEBSTOREVIEW_RENDER_DOCUMENT);
        cb_utilities.setup_cb_link_method($VIEW_WEBSTORE_DOC, CB_LINK_VIEW_WEBSTORE_DOC, THREE_INTEGER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$localhost = makeString("localhost");

    public static final SubLSymbol $cb_webstore_host$ = makeSymbol("*CB-WEBSTORE-HOST*");

    public static final SubLInteger $int$7777 = makeInteger(7777);

    public static final SubLSymbol $cb_webstore_port$ = makeSymbol("*CB-WEBSTORE-PORT*");

    static private final SubLString $$$Lucene_Webstore_Viewer = makeString("Lucene Webstore Viewer");



    static private final SubLString $str_alt6$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt7$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLSymbol CB_VIEW_WEBSTORE = makeSymbol("CB-VIEW-WEBSTORE");

    static private final SubLString $str_alt9$_Lucene_Webstore_Viewer_ = makeString("[Lucene Webstore Viewer]");



    static private final SubLString $str_alt11$cb_view_webstore = makeString("cb-view-webstore");

    private static final SubLSymbol $VIEW_WEBSTORE = makeKeyword("VIEW-WEBSTORE");

    private static final SubLSymbol CB_LINK_VIEW_WEBSTORE = makeSymbol("CB-LINK-VIEW-WEBSTORE");

    static private final SubLString $$$WebStore_Viewer = makeString("WebStore Viewer");

    static private final SubLString $$$WebView = makeString("WebView");

    static private final SubLString $str_alt16$View_the_Lucene_index_of_webstore = makeString("View the Lucene index of webstore files.");





    static private final SubLString $$$30px = makeString("30px");

    static private final SubLString $str_alt20$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $str_alt21$cb_webstoreview_change_settings = makeString("cb-webstoreview-change-settings");

    static private final SubLString $$$Webstore_Status = makeString("Webstore Status");

    static private final SubLString $$$operational = makeString("operational");

    static private final SubLString $$$not_responding = makeString("not responding");

    static private final SubLString $$$Recheck = makeString("Recheck");

    static private final SubLString $$$recheck = makeString("recheck");

    static private final SubLString $$$Webstore_Host = makeString("Webstore Host");

    static private final SubLString $str_alt28$webstore_host = makeString("webstore_host");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$Change = makeString("Change");

    static private final SubLString $$$change = makeString("change");

    static private final SubLString $$$Webstore_Port = makeString("Webstore Port");

    static private final SubLString $str_alt33$webstore_port = makeString("webstore_port");

    private static final SubLSymbol CB_WEBSTOREVIEW_CHANGE_SETTINGS = makeSymbol("CB-WEBSTOREVIEW-CHANGE-SETTINGS");

    public static final SubLSymbol $cb_webstoreview_isg$ = makeSymbol("*CB-WEBSTOREVIEW-ISG*");

    public static final SubLSymbol $cb_webstoreview_current_search$ = makeSymbol("*CB-WEBSTOREVIEW-CURRENT-SEARCH*");

    static private final SubLList $list_alt37 = list(list(makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cb_webstoreview_searches$ = makeSymbol("*CB-WEBSTOREVIEW-SEARCHES*");

    static private final SubLSymbol $sym40$_ = makeSymbol("<");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH = makeSymbol("WEBSTOREVIEW-SEARCH");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH_P = makeSymbol("WEBSTOREVIEW-SEARCH-P");

    static private final SubLList $list_alt43 = list(makeSymbol("ID"), makeSymbol("QUERY"), makeSymbol("KEYS"), makeSymbol("RESULTS"));

    static private final SubLList $list_alt44 = list(makeKeyword("ID"), makeKeyword("QUERY"), $KEYS, makeKeyword("RESULTS"));

    static private final SubLList $list_alt45 = list(makeSymbol("WEBSTOREVIEW-SEARCH-ID"), makeSymbol("WEBSTOREVIEW-SEARCH-QUERY"), makeSymbol("WEBSTOREVIEW-SEARCH-KEYS"), makeSymbol("WEBSTOREVIEW-SEARCH-RESULTS"));

    static private final SubLList $list_alt46 = list(makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-ID"), makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-QUERY"), makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-KEYS"), makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-RESULTS"));



    private static final SubLSymbol WEBSTOREVIEW_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WEBSTOREVIEW-SEARCH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH_ID = makeSymbol("WEBSTOREVIEW-SEARCH-ID");

    public static final SubLSymbol _CSETF_WEBSTOREVIEW_SEARCH_ID = makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-ID");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH_QUERY = makeSymbol("WEBSTOREVIEW-SEARCH-QUERY");

    public static final SubLSymbol _CSETF_WEBSTOREVIEW_SEARCH_QUERY = makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-QUERY");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH_KEYS = makeSymbol("WEBSTOREVIEW-SEARCH-KEYS");

    public static final SubLSymbol _CSETF_WEBSTOREVIEW_SEARCH_KEYS = makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-KEYS");

    private static final SubLSymbol WEBSTOREVIEW_SEARCH_RESULTS = makeSymbol("WEBSTOREVIEW-SEARCH-RESULTS");

    public static final SubLSymbol _CSETF_WEBSTOREVIEW_SEARCH_RESULTS = makeSymbol("_CSETF-WEBSTOREVIEW-SEARCH-RESULTS");









    static private final SubLString $str_alt61$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    static private final SubLString $$$40px = makeString("40px");

    static private final SubLString $$$Previous_Searches = makeString("Previous Searches");



    static private final SubLString $$$ID = makeString("ID");

    static private final SubLString $$$Query = makeString("Query");

    static private final SubLString $$$Results = makeString("Results");

    static private final SubLString $str_alt69$__A_ = makeString("[~A]");



    private static final SubLSymbol $WEBSTOREVIEW_DELETE_SEARCH = makeKeyword("WEBSTOREVIEW-DELETE-SEARCH");

    static private final SubLString $str_alt72$_Delete_ = makeString("[Delete]");

    private static final SubLSymbol $WEBSTOREVIEW_FOCUS_SEARCH = makeKeyword("WEBSTOREVIEW-FOCUS-SEARCH");

    static private final SubLString $str_alt74$_Focus_ = makeString("[Focus]");

    static private final SubLString $str_alt75$_Delete_ = makeString("[Delete ");

    static private final SubLString $str_alt76$_ = makeString("]");

    static private final SubLString $str_alt77$cb_webstoreview_delete_search_id_ = makeString("cb-webstoreview-delete-search&id=~A");

    private static final SubLSymbol CB_LINK_WEBSTOREVIEW_DELETE_SEARCH = makeSymbol("CB-LINK-WEBSTOREVIEW-DELETE-SEARCH");

    static private final SubLString $str_alt79$_Focus_ = makeString("[Focus ");

    static private final SubLString $str_alt80$cb_webstoreview_focus_id__A = makeString("cb-webstoreview-focus&id=~A");

    private static final SubLSymbol CB_LINK_WEBSTOREVIEW_FOCUS_SEARCH = makeSymbol("CB-LINK-WEBSTOREVIEW-FOCUS-SEARCH");

    static private final SubLString $str_alt82$Results_for_Query__ = makeString("Results for Query #");

    static private final SubLString $$$Query_Result_Section = makeString("Query Result Section");

    public static final SubLSymbol $0 = makeKeyword("0");

    static private final SubLString $str_alt85$Query__ = makeString("Query: ");

    static private final SubLString $str_alt86$Hits__ = makeString("Hits: ");

    static private final SubLString $str_alt87$Currently__no_results_to_show_ = makeString("Currently, no results to show.");

    static private final SubLString $$$Number = makeString("Number");

    static private final SubLString $$$File_Path = makeString("File Path");

    static private final SubLString $str_alt90$_ = makeString("[");

    private static final SubLSymbol $VIEW_WEBSTORE_DOC = makeKeyword("VIEW-WEBSTORE-DOC");

    static private final SubLString $$$Search = makeString("Search");

    static private final SubLString $str_alt93$For_help_with_the_query_language_ = makeString("For help with the query language, see ");

    static private final SubLString $str_alt94$http___lucene_apache_org_java_doc = makeString("http://lucene.apache.org/java/docs/queryparsersyntax.html");

    static private final SubLString $$$Lucene_Query_Parser_Syntax = makeString("Lucene Query Parser Syntax");

    static private final SubLString $str_alt96$_ = makeString(".");

    static private final SubLString $str_alt97$cb_webstoreview_search_request = makeString("cb-webstoreview-search-request");

    static private final SubLString $str_alt98$search_request = makeString("search_request");

    static private final SubLString $$$search = makeString("search");

    static private final SubLString $str_alt100$__________ = makeString("\\\"[^\\\"]+\\\"");

    static private final SubLString $str_alt101$___w_ = makeString("\\+\\w+");

    static private final SubLString $str_alt102$___w_ = makeString("\\-\\w+");

    private static final SubLSymbol UNQUOTE_STRING = makeSymbol("UNQUOTE-STRING");

    private static final SubLSymbol STRIP_FIRST = makeSymbol("STRIP-FIRST");



    private static final SubLSymbol CB_WEBSTOREVIEW_SEARCH_REQUEST = makeSymbol("CB-WEBSTOREVIEW-SEARCH-REQUEST");

    static private final SubLString $str_alt107$__ = makeString("#$");

    static private final SubLString $$$id = makeString("id");

    private static final SubLSymbol CB_WEBSTOREVIEW_DELETE_SEARCH = makeSymbol("CB-WEBSTOREVIEW-DELETE-SEARCH");

    private static final SubLSymbol CB_WEBSTOREVIEW_FOCUS = makeSymbol("CB-WEBSTOREVIEW-FOCUS");

    static private final SubLList $list_alt111 = list(makeString("ID"), makeString("Site"), makeString("URL"), makeString("Title"), makeString("Date"), makeString("Linkdate"), makeString("Location"));

    static private final SubLString $$$filenum = makeString("filenum");

    static private final SubLString $$$Webstore_Document = makeString("Webstore Document");

    static private final SubLString $str_alt114$Return_to_ = makeString("Return to ");

    static private final SubLString $str_alt115$Warning__Invalid_filenumber__A_sp = makeString("Warning: Invalid filenumber ~A specified.");



    static private final SubLString $str_alt117$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$Contents = makeString("Contents");

    static private final SubLString $$$66em = makeString("66em");

    static private final SubLList $list_alt120 = cons(makeSymbol("FIELD"), makeSymbol("REMAINDER"));

    private static final SubLSymbol CB_WEBSTOREVIEW_RENDER_DOCUMENT = makeSymbol("CB-WEBSTOREVIEW-RENDER-DOCUMENT");

    static private final SubLString $str_alt122$cb_webstoreview_render_document_i = makeString("cb-webstoreview-render-document&id=~A&filenum=~A");

    private static final SubLSymbol CB_LINK_VIEW_WEBSTORE_DOC = makeSymbol("CB-LINK-VIEW-WEBSTORE-DOC");

    // // Initializers
    public void declareFunctions() {
        declare_cb_webstore_viewer_file();
    }

    public void initializeVariables() {
        init_cb_webstore_viewer_file();
    }

    public void runTopLevelForms() {
        setup_cb_webstore_viewer_file();
    }
}

