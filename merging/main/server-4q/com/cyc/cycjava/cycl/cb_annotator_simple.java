/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.declare_deprecated_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.html_utilities.url_to_text;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.leader.parse_tree_gui;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-ANNOTATOR-SIMPLE
 * source file: /cyc/top/cycl/cb-annotator-simple.lisp
 * created:     2019/07/03 17:38:57
 */
public final class cb_annotator_simple extends SubLTranslatedFile implements V12 {
    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$ = makeString("");

    public static final SubLFile me = new cb_annotator_simple();

 public static final String myName = "com.cyc.cycjava.cycl.cb_annotator_simple";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$ = makeString("");

    public static final SubLSymbol $simple_annotator_text$ = makeSymbol("*SIMPLE-ANNOTATOR-TEXT*");

    public static final SubLSymbol $simple_annotator_url$ = makeSymbol("*SIMPLE-ANNOTATOR-URL*");

    static private final SubLString $$$Text_Annotator = makeString("Text Annotator");

    private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str10$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str16$cb_handle_simple_annotator = makeString("cb-handle-simple-annotator");

    private static final SubLString $str17$Text__ = makeString("Text: ");

    private static final SubLString $$$text = makeString("text");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$Annotate_Text = makeString("Annotate Text");

    private static final SubLString $str21$annotate_text = makeString("annotate_text");

    private static final SubLString $str22$URL__ = makeString("URL: ");

    private static final SubLString $$$url = makeString("url");

    private static final SubLString $$$Annotate_URL = makeString("Annotate URL");

    private static final SubLString $str25$annotate_url = makeString("annotate_url");

    private static final SubLSymbol CB_SIMPLE_ANNOTATOR = makeSymbol("CB-SIMPLE-ANNOTATOR");

    private static final SubLString $$$Annotation_Results = makeString("Annotation Results");

    private static final SubLSymbol CB_HANDLE_SIMPLE_ANNOTATOR = makeSymbol("CB-HANDLE-SIMPLE-ANNOTATOR");

    private static final SubLString $str30$_p_Original_Sentence___S_br_ = makeString("<p>Original Sentence: ~S<br>");

    private static final SubLList $list31 = list(makeSymbol("STRING"), makeSymbol("CYCLS"), makeSymbol("ARG3"));

    private static final SubLString $str32$_A_ = makeString("~A ");

    private static final SubLString $str33$_ = makeString("{");

    private static final SubLString $str34$_A = makeString("~A");

    private static final SubLString $str35$___A = makeString(", ~A");

    private static final SubLString $str36$__ = makeString("} ");

    private static final SubLString $str38$_br__sentence_cycl__br_ = makeString("<br><sentence_cycl><br>");

    private static final SubLString $str39$_A_br_ = makeString("~A<br>");

    private static final SubLString $str40$_br___sentence_cycl__br_ = makeString("<br></sentence_cycl><br>");

    private static final SubLString $$$Annot = makeString("Annot");

    private static final SubLString $str43$cb_simple_annotator = makeString("cb-simple-annotator");

    private static final SubLSymbol CB_LINK_SIMPLE_ANNOTATOR = makeSymbol("CB-LINK-SIMPLE-ANNOTATOR");

    private static final SubLString $$$Simple_Text_Annotator = makeString("Simple Text Annotator");

    public static final SubLObject cb_simple_annotator_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Text_Annotator;
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
                                    html_markup($str_alt6$yui_skin_sam);
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
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt7$cb_handle_simple_annotator, T, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt8$Text__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$text, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$text);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($int$80);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(TEN_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_submit_input($$$Annotate_Text, $str_alt12$annotate_text, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt13$URL__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$url, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_text_input($$$url, $simple_annotator_url$.getDynamicValue(thread), $int$80);
                                                    html_submit_input($$$Annotate_URL, $str_alt16$annotate_url, UNPROVIDED);
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

    public static SubLObject cb_simple_annotator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Text_Annotator;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
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
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
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
                    html_markup($str10$yui_skin_sam);
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
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
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
                            html_hidden_input($str16$cb_handle_simple_annotator, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str17$Text__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$text, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$text);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$80);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Annotate_Text, $str21$annotate_text, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str22$URL__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$url, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_text_input($$$url, $simple_annotator_url$.getDynamicValue(thread), $int$80);
                            html_submit_input($$$Annotate_URL, $str25$annotate_url, UNPROVIDED);
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

    public static final SubLObject cb_handle_simple_annotator_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject text = html_extract_input($$$text, args);
                SubLObject url = html_extract_input($$$url, args);
                SubLObject annotate_urlP = html_extract_input($str_alt16$annotate_url, args);
                SubLObject sentence_annotations = (NIL != annotate_urlP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_annotator_simple.annotate_simple_url(url))) : com.cyc.cycjava.cycl.cb_annotator_simple.annotate_simple_text(text);
                SubLObject title_var = $$$Annotation_Results;
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
                            SubLObject _prev_bind_0_5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt6$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                {
                                                    SubLObject cdolist_list_var = sentence_annotations;
                                                    SubLObject sentence = NIL;
                                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                        cb_form(sentence, UNPROVIDED, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                }
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
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject cb_handle_simple_annotator(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = html_extract_input($$$text, args);
        final SubLObject url = html_extract_input($$$url, args);
        final SubLObject annotate_urlP = html_extract_input($str25$annotate_url, args);
        final SubLObject sentence_annotations = (NIL != annotate_urlP) ? annotate_simple_url(url) : annotate_simple_text(text);
        final SubLObject title_var = $$$Annotation_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str10$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
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
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            SubLObject cdolist_list_var = sentence_annotations;
                            SubLObject sentence = NIL;
                            sentence = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cb_form(sentence, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                cdolist_list_var = cdolist_list_var.rest();
                                sentence = cdolist_list_var.first();
                            } 
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject annotate_simple_text_alt(SubLObject text) {
        {
            SubLObject sentences = document.sentencify_string(text);
            SubLObject sentence_count = length(sentences);
            SubLObject ged = parse_tree_gui.new_gui_enabled_document(sentence_count, UNPROVIDED);
            SubLObject result = NIL;
            {
                SubLObject list_var = NIL;
                SubLObject sentence = NIL;
                SubLObject n = NIL;
                for (list_var = sentences, sentence = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , n = add(ONE_INTEGER, n)) {
                    parse_tree_gui.add_sentence_to_ged(ged, sentence, n);
                }
            }
            {
                SubLObject n = NIL;
                for (n = ZERO_INTEGER; n.numL(sentence_count); n = add(n, ONE_INTEGER)) {
                    {
                        SubLObject sentence_result = NIL;
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_output_stream();
                            {
                                SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), n);
                                format(stream, $str_alt20$_p_Original_Sentence___S_br_, nth(n, sentences));
                                {
                                    SubLObject cdolist_list_var = parse_tree_gui.get_ges_annotated_leaves(ges);
                                    SubLObject leaf = NIL;
                                    for (leaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , leaf = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = leaf;
                                            SubLObject current = datum;
                                            SubLObject string = NIL;
                                            SubLObject cycls = NIL;
                                            SubLObject arg3 = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            string = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            cycls = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            arg3 = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                format(stream, $str_alt22$_A_, string);
                                                if (NIL != cycls) {
                                                    format(stream, $str_alt23$_);
                                                    format(stream, $str_alt24$_A, cycls.first());
                                                    {
                                                        SubLObject cdolist_list_var_8 = cycls.rest();
                                                        SubLObject cycl = NIL;
                                                        for (cycl = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , cycl = cdolist_list_var_8.first()) {
                                                            format(stream, $str_alt25$___A, cycl);
                                                        }
                                                    }
                                                    format(stream, $str_alt26$__);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt21);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject tree = parse_tree_gui.ges_current_parse_tree(ges);
                                    SubLObject parses = methods.funcall_instance_method_with_0_args(tree, CYCLIFY);
                                    format(stream, $str_alt28$_br__sentence_cycl__br_);
                                    {
                                        SubLObject cdolist_list_var = parses;
                                        SubLObject parse = NIL;
                                        for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                            format(stream, $str_alt29$_A_br_, parse);
                                        }
                                    }
                                    format(stream, $str_alt30$_br___sentence_cycl__br_);
                                }
                            }
                            sentence_result = get_output_stream_string(stream);
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
                        result = cons(sentence_result, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject annotate_simple_text(final SubLObject text) {
        final SubLObject sentences = document.sentencify_string(text);
        final SubLObject sentence_count = length(sentences);
        final SubLObject ged = parse_tree_gui.new_gui_enabled_document(sentence_count, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject sentence = NIL;
        SubLObject n = NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , n = add(ONE_INTEGER, n)) {
            parse_tree_gui.add_sentence_to_ged(ged, sentence, n);
        }
        SubLObject n2;
        SubLObject sentence_result;
        SubLObject stream;
        SubLObject ges;
        SubLObject cdolist_list_var;
        SubLObject leaf;
        SubLObject current;
        SubLObject datum;
        SubLObject string;
        SubLObject cycls;
        SubLObject arg3;
        SubLObject cdolist_list_var_$12;
        SubLObject cycl;
        SubLObject tree;
        SubLObject parses;
        SubLObject cdolist_list_var2;
        SubLObject parse;
        SubLObject _prev_bind_0;
        SubLObject _values;
        for (n2 = NIL, n2 = ZERO_INTEGER; n2.numL(sentence_count); n2 = add(n2, ONE_INTEGER)) {
            sentence_result = NIL;
            stream = NIL;
            try {
                stream = make_private_string_output_stream();
                ges = aref(parse_tree_gui.ged_sentences(ged), n2);
                format(stream, $str30$_p_Original_Sentence___S_br_, nth(n2, sentences));
                cdolist_list_var = parse_tree_gui.get_ges_annotated_leaves(ges);
                leaf = NIL;
                leaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    datum = current = leaf;
                    string = NIL;
                    cycls = NIL;
                    arg3 = NIL;
                    destructuring_bind_must_consp(current, datum, $list31);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list31);
                    cycls = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list31);
                    arg3 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        format(stream, $str32$_A_, string);
                        if (NIL != cycls) {
                            format(stream, $str33$_);
                            format(stream, $str34$_A, cycls.first());
                            cdolist_list_var_$12 = cycls.rest();
                            cycl = NIL;
                            cycl = cdolist_list_var_$12.first();
                            while (NIL != cdolist_list_var_$12) {
                                format(stream, $str35$___A, cycl);
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                cycl = cdolist_list_var_$12.first();
                            } 
                            format(stream, $str36$__);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list31);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    leaf = cdolist_list_var.first();
                } 
                tree = parse_tree_gui.ges_current_parse_tree(ges);
                parses = methods.funcall_instance_method_with_0_args(tree, CYCLIFY);
                format(stream, $str38$_br__sentence_cycl__br_);
                cdolist_list_var2 = parses;
                parse = NIL;
                parse = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    format(stream, $str39$_A_br_, parse);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    parse = cdolist_list_var2.first();
                } 
                format(stream, $str40$_br___sentence_cycl__br_);
                sentence_result = get_output_stream_string(stream);
            } finally {
                _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            result = cons(sentence_result, result);
        }
        return nreverse(result);
    }

    public static final SubLObject annotate_simple_url_alt(SubLObject url) {
        return com.cyc.cycjava.cycl.cb_annotator_simple.annotate_simple_text(url_to_text(url));
    }

    public static SubLObject annotate_simple_url(final SubLObject url) {
        return annotate_simple_text(url_to_text(url));
    }

    public static final SubLObject cb_link_simple_annotator_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Annot;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt33$cb_simple_annotator);
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

    public static SubLObject cb_link_simple_annotator(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Annot;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str43$cb_simple_annotator);
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

    public static SubLObject declare_cb_annotator_simple_file() {
        declareFunction("cb_simple_annotator", "CB-SIMPLE-ANNOTATOR", 0, 1, false);
        declareFunction("cb_handle_simple_annotator", "CB-HANDLE-SIMPLE-ANNOTATOR", 1, 0, false);
        declareFunction("annotate_simple_text", "ANNOTATE-SIMPLE-TEXT", 1, 0, false);
        declareFunction("annotate_simple_url", "ANNOTATE-SIMPLE-URL", 1, 0, false);
        declareFunction("cb_link_simple_annotator", "CB-LINK-SIMPLE-ANNOTATOR", 0, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt5$text_javascript = makeString("text/javascript");

    public static SubLObject init_cb_annotator_simple_file() {
        defparameter("*SIMPLE-ANNOTATOR-TEXT*", $str0$);
        defparameter("*SIMPLE-ANNOTATOR-URL*", $str0$);
        return NIL;
    }

    static private final SubLString $str_alt6$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt7$cb_handle_simple_annotator = makeString("cb-handle-simple-annotator");

    public static final SubLObject setup_cb_annotator_simple_file_alt() {
        register_html_state_variable($simple_annotator_text$);
        register_html_state_variable($simple_annotator_url$);
        html_macros.note_html_handler_function(CB_SIMPLE_ANNOTATOR);
        html_macros.note_html_handler_function(CB_HANDLE_SIMPLE_ANNOTATOR);
        setup_cb_link_method($SIMPLE_ANNOTATOR, CB_LINK_SIMPLE_ANNOTATOR, ONE_INTEGER);
        declare_cb_tool($SIMPLE_ANNOTATOR, $$$Text_Annotator, $$$Annot, $$$Simple_Text_Annotator);
        return NIL;
    }

    public static SubLObject setup_cb_annotator_simple_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($simple_annotator_text$);
            register_html_state_variable($simple_annotator_url$);
            html_macros.note_cgi_handler_function(CB_SIMPLE_ANNOTATOR, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_SIMPLE_ANNOTATOR, $HTML_HANDLER);
            setup_cb_link_method($SIMPLE_ANNOTATOR, CB_LINK_SIMPLE_ANNOTATOR, ONE_INTEGER);
            declare_deprecated_cb_tool($SIMPLE_ANNOTATOR, $$$Text_Annotator, $$$Annot, $$$Simple_Text_Annotator);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_SIMPLE_ANNOTATOR);
            html_macros.note_html_handler_function(CB_HANDLE_SIMPLE_ANNOTATOR);
            declare_cb_tool($SIMPLE_ANNOTATOR, $$$Text_Annotator, $$$Annot, $$$Simple_Text_Annotator);
        }
        return NIL;
    }

    public static SubLObject setup_cb_annotator_simple_file_Previous() {
        register_html_state_variable($simple_annotator_text$);
        register_html_state_variable($simple_annotator_url$);
        html_macros.note_cgi_handler_function(CB_SIMPLE_ANNOTATOR, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_SIMPLE_ANNOTATOR, $HTML_HANDLER);
        setup_cb_link_method($SIMPLE_ANNOTATOR, CB_LINK_SIMPLE_ANNOTATOR, ONE_INTEGER);
        declare_deprecated_cb_tool($SIMPLE_ANNOTATOR, $$$Text_Annotator, $$$Annot, $$$Simple_Text_Annotator);
        return NIL;
    }

    static private final SubLString $str_alt8$Text__ = makeString("Text: ");

    static private final SubLString $str_alt12$annotate_text = makeString("annotate_text");

    static private final SubLString $str_alt13$URL__ = makeString("URL: ");

    @Override
    public void declareFunctions() {
        declare_cb_annotator_simple_file();
    }

    static private final SubLString $str_alt16$annotate_url = makeString("annotate_url");

    @Override
    public void initializeVariables() {
        init_cb_annotator_simple_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_annotator_simple_file();
    }

    

    static private final SubLString $str_alt20$_p_Original_Sentence___S_br_ = makeString("<p>Original Sentence: ~S<br>");

    static private final SubLList $list_alt21 = list(makeSymbol("STRING"), makeSymbol("CYCLS"), makeSymbol("ARG3"));

    static private final SubLString $str_alt22$_A_ = makeString("~A ");

    static private final SubLString $str_alt23$_ = makeString("{");

    static private final SubLString $str_alt24$_A = makeString("~A");

    static private final SubLString $str_alt25$___A = makeString(", ~A");

    static private final SubLString $str_alt26$__ = makeString("} ");

    static private final SubLString $str_alt28$_br__sentence_cycl__br_ = makeString("<br><sentence_cycl><br>");

    static private final SubLString $str_alt29$_A_br_ = makeString("~A<br>");

    static private final SubLString $str_alt30$_br___sentence_cycl__br_ = makeString("<br></sentence_cycl><br>");

    static private final SubLString $str_alt33$cb_simple_annotator = makeString("cb-simple-annotator");
}

/**
 * Total time: 291 ms
 */
