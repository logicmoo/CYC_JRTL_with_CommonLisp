/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_uia_forwarding;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_kernel;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-QUICK-QUESTION
 *  source file: /cyc/top/cycl/butler/cb-quick-question.lisp
 *  created:     2019/07/03 17:39:04
 */
public final class cb_quick_question extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_quick_question() {
    }

    public static final SubLFile me = new cb_quick_question();

    public static final String myName = "com.cyc.cycjava.cycl.butler.cb_quick_question";

    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_qq_archive$ = makeSymbol("*CB-QQ-ARCHIVE*");

    // deflexical
    public static final SubLSymbol $cb_qq_codebase$ = makeSymbol("*CB-QQ-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_qq_class_file$ = makeSymbol("*CB-QQ-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_qq_default_height$ = makeSymbol("*CB-QQ-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_qq_default_width$ = makeSymbol("*CB-QQ-DEFAULT-WIDTH*");

    /**
     * When set to a string, that document is loaded instead of the image being accessed.
     */
    // deflexical
    private static final SubLSymbol $cb_qq_xml_document$ = makeSymbol("*CB-QQ-XML-DOCUMENT*");

    /**
     * When set to a string, that is the machine where the question server is running and is to be
     * used instead of the CYC server.
     */
    // deflexical
    private static final SubLSymbol $cb_qq_question_server_host$ = makeSymbol("*CB-QQ-QUESTION-SERVER-HOST*");

    /**
     * When set to a FIXNUMP, this is the machine port where the question server is running and is
     * to be used instead of the CYC server.
     */
    // deflexical
    private static final SubLSymbol $cb_qq_question_server_port$ = makeSymbol("*CB-QQ-QUESTION-SERVER-PORT*");

    // deflexical
    private static final SubLSymbol $cb_qq_default_plist$ = makeSymbol("*CB-QQ-DEFAULT-PLIST*");

    public static final SubLObject cb_qq_get_current_project() {
        {
            SubLObject project = fi.ke_purpose();
            return NIL != forts.fort_p(project) ? ((SubLObject) (project)) : $$GeneralCycKE;
        }
    }

    public static final SubLObject cb_qq_applet(SubLObject generation_mt, SubLObject parsing_mt, SubLObject user, SubLObject project, SubLObject plist) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = NIL;
        }
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = NIL;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        if (project == UNPROVIDED) {
            project = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = $cb_qq_default_plist$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == project) {
                project = cb_qq_get_current_project();
            }
            if (NIL == user) {
                user = operation_communication.the_cyclist();
            }
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    if (NIL == member(current_1, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
                {
                    SubLObject title_tail = property_list_member($TITLE, current);
                    SubLObject title = (NIL != title_tail) ? ((SubLObject) (cadr(title_tail))) : $str_alt6$CYC_s_Quick_Questions;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : $cb_qq_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $cb_qq_default_width$.getGlobalValue();
                    html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_qq_class_file$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_qq_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_qq_archive$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(height);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(width);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject port_string = string_utilities.to_string(cb_uia_forwarding.get_forwarding_base_port());
                                SubLObject host_name_string = cb_uia_forwarding.get_forwarding_machine_name();
                                SubLObject user_string = string_utilities.to_string(user);
                                SubLObject project_string = string_utilities.to_string(project);
                                if (NIL != forts.fort_p(generation_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$generationMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(generation_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (NIL != forts.fort_p(parsing_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$parsingMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(parsing_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$user);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(user_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$project);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(project_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ($cb_qq_xml_document$.getGlobalValue().isString()) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$xmlDocument);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_qq_xml_document$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                } else
                                    if ($cb_qq_question_server_host$.getGlobalValue().isString() && $cb_qq_question_server_port$.getGlobalValue().isFixnum()) {
                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$questionServerMachine);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($cb_qq_question_server_host$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$questionServerPort);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($cb_qq_question_server_port$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    } else {
                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$cycMachine);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(host_name_string);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$cycPort);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(port_string);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    }

                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$title);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(title);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$width);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$height);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(string_utilities.to_string($$$httpState));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (html_kernel.http_state_key_for_request().isString()) {
                                    html_utilities.html_princ(html_kernel.http_state_key_for_request());
                                } else {
                                    html_utilities.html_prin1(html_kernel.http_state_key_for_request());
                                }
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                }
            }
            return user;
        }
    }

    public static final SubLObject cb_qq_get_targeted_backend() {
        if ($cb_qq_xml_document$.getGlobalValue().isString()) {
            return $str_alt26$You_are_targeting_the_JAR_files_b;
        } else
            if ($cb_qq_question_server_host$.getGlobalValue().isString() && $cb_qq_question_server_port$.getGlobalValue().isFixnum()) {
                return cconcatenate($str_alt27$You_are_targeting_the_PostGRES_ba, new SubLObject[]{ format_nil.format_nil_a_no_copy($cb_qq_question_server_host$.getGlobalValue()), $str_alt28$_, format_nil.format_nil_a_no_copy($cb_qq_question_server_port$.getGlobalValue()) });
            } else {
                return cconcatenate($str_alt29$You_are_targeting_the_CYC_image_o, new SubLObject[]{ format_nil.format_nil_a_no_copy(cb_uia_forwarding.get_forwarding_machine_name()), $str_alt28$_, format_nil.format_nil_a_no_copy(cb_uia_forwarding.get_forwarding_base_port()) });
            }

    }





    public static final SubLObject cb_quick_questions_tool(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject loading_mode_string = html_utilities.html_extract_input($str_alt33$loading_mode, args);
                SubLObject loading_mode = (NIL != number_utilities.number_string_p(loading_mode_string)) ? ((SubLObject) (ONE_INTEGER.numE(parse_integer(loading_mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($LOAD_FROM_KB)) : $USE_CACHES)) : $UNKNOWN;
                SubLObject title_var = $str_alt37$Cyc_s_Quick_Questions;
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
                            SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt40$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_princ(cb_quick_questions_tool_get_introduction_text());
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        cb_qq_applet(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        html_utilities.html_princ(cb_qq_get_targeted_backend());
                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
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

    // deflexical
    private static final SubLSymbol $cb_qq_introduction_text$ = makeSymbol("*CB-QQ-INTRODUCTION-TEXT*");

    public static final SubLObject cb_quick_questions_tool_get_introduction_text() {
        return $cb_qq_introduction_text$.getGlobalValue();
    }

    public static final SubLObject cb_link_quick_questions_tool(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt52$_Quick_Questions_Tool_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$cb_quick_questions_tool);
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

    public static final SubLObject declare_cb_quick_question_file() {
        declareFunction("cb_qq_get_current_project", "CB-QQ-GET-CURRENT-PROJECT", 0, 0, false);
        declareFunction("cb_qq_applet", "CB-QQ-APPLET", 0, 5, false);
        declareFunction("cb_qq_get_targeted_backend", "CB-QQ-GET-TARGETED-BACKEND", 0, 0, false);
        declareFunction("cb_quick_questions_tool", "CB-QUICK-QUESTIONS-TOOL", 0, 1, false);
        declareFunction("cb_quick_questions_tool_get_introduction_text", "CB-QUICK-QUESTIONS-TOOL-GET-INTRODUCTION-TEXT", 0, 0, false);
        declareFunction("cb_link_quick_questions_tool", "CB-LINK-QUICK-QUESTIONS-TOOL", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_quick_question_file() {
        deflexical("*CB-QQ-ARCHIVE*", $str_alt0$QuickQuestion_jar_OpenCyc_jar);
        deflexical("*CB-QQ-CODEBASE*", $str_alt1$_java_int_);
        deflexical("*CB-QQ-CLASS-FILE*", $str_alt2$com_cyc_project_butler_quickQuest);
        deflexical("*CB-QQ-DEFAULT-HEIGHT*", $int$600);
        deflexical("*CB-QQ-DEFAULT-WIDTH*", $int$800);
        deflexical("*CB-QQ-XML-DOCUMENT*", NIL);
        deflexical("*CB-QQ-QUESTION-SERVER-HOST*", NIL);
        deflexical("*CB-QQ-QUESTION-SERVER-PORT*", NIL);
        deflexical("*CB-QQ-DEFAULT-PLIST*", list($TITLE, $str_alt6$CYC_s_Quick_Questions, $HEIGHT, $cb_qq_default_height$.getGlobalValue(), $WIDTH, $cb_qq_default_width$.getGlobalValue()));
        defparameter("*CB-QQ-LAST-QUICK-QUESTIONS-ID*", NIL);
        defparameter("*CB-QQ-DEFAULT-START-QUICK-QUESTIONS-ID*", $$Cyc_TestQueryFolder);
        deflexical("*CB-QQ-INTRODUCTION-TEXT*", $str_alt51$Hi__This_is_the_Quick_Questions_T);
        return NIL;
    }

    public static final SubLObject setup_cb_quick_question_file() {
                utilities_macros.register_html_state_variable($cb_qq_last_quick_questions_id$);
        utilities_macros.register_html_state_variable($cb_qq_default_start_quick_questions_id$);
        html_macros.note_html_handler_function(CB_QUICK_QUESTIONS_TOOL);
        cb_utilities.setup_cb_link_method($QUICK_QUESTIONS_TOOL, CB_LINK_QUICK_QUESTIONS_TOOL, ONE_INTEGER);
        cb_utilities.declare_cb_tool($QUICK_QUESTIONS_TOOL, $$$Quick_Questions, $$$QQ, $str_alt58$help_Cyc_to_improve_its_knowledge);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$QuickQuestion_jar_OpenCyc_jar = makeString("QuickQuestion.jar,OpenCyc.jar");

    static private final SubLString $str_alt1$_java_int_ = makeString("/java-int/");

    static private final SubLString $str_alt2$com_cyc_project_butler_quickQuest = makeString("com.cyc.project.butler.quickQuestion.ui.QuickQuestionApplet.class");

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$800 = makeInteger(800);



    static private final SubLString $str_alt6$CYC_s_Quick_Questions = makeString("CYC's Quick Questions");





    public static final SubLObject $$GeneralCycKE = constant_handles.reader_make_constant_shell(makeString("GeneralCycKE"));

    static private final SubLList $list_alt10 = list(makeSymbol("&KEY"), list(makeSymbol("TITLE"), makeString("CYC's Quick Questions")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-QQ-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-QQ-DEFAULT-WIDTH*")));

    static private final SubLList $list_alt11 = list(makeKeyword("TITLE"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$generationMt = makeString("generationMt");

    static private final SubLString $$$parsingMt = makeString("parsingMt");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$xmlDocument = makeString("xmlDocument");

    static private final SubLString $$$questionServerMachine = makeString("questionServerMachine");

    static private final SubLString $$$questionServerPort = makeString("questionServerPort");

    static private final SubLString $$$cycMachine = makeString("cycMachine");

    static private final SubLString $$$cycPort = makeString("cycPort");

    static private final SubLString $$$title = makeString("title");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$httpState = makeString("httpState");

    static private final SubLString $str_alt26$You_are_targeting_the_JAR_files_b = makeString("You are targeting the JAR files built-in question sets.");

    static private final SubLString $str_alt27$You_are_targeting_the_PostGRES_ba = makeString("You are targeting the PostGRES-backed QuestionServer on ");

    static private final SubLString $str_alt28$_ = makeString(":");

    static private final SubLString $str_alt29$You_are_targeting_the_CYC_image_o = makeString("You are targeting the CYC image on ");

    public static final SubLSymbol $cb_qq_last_quick_questions_id$ = makeSymbol("*CB-QQ-LAST-QUICK-QUESTIONS-ID*");

    public static final SubLObject $$Cyc_TestQueryFolder = constant_handles.reader_make_constant_shell(makeString("Cyc-TestQueryFolder"));

    public static final SubLSymbol $cb_qq_default_start_quick_questions_id$ = makeSymbol("*CB-QQ-DEFAULT-START-QUICK-QUESTIONS-ID*");

    static private final SubLString $str_alt33$loading_mode = makeString("loading_mode");

    private static final SubLSymbol $LOAD_FROM_KB = makeKeyword("LOAD-FROM-KB");

    private static final SubLSymbol $USE_CACHES = makeKeyword("USE-CACHES");



    static private final SubLString $str_alt37$Cyc_s_Quick_Questions = makeString("Cyc's Quick Questions");



    static private final SubLString $str_alt39$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt40$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt41$cb_quick_questions_tool = makeString("cb-quick-questions-tool");





    static private final SubLString $str_alt44$Quick_Questions_Loading_Mode__ = makeString("Quick Questions Loading Mode: ");



    static private final SubLString $str_alt46$Load_afresh_from_KB__slower_ = makeString("Load afresh from KB (slower)");

    static private final SubLString $str_alt47$Reuse_previously_loaded_values__f = makeString("Reuse previously loaded values (faster)");

    static private final SubLString $$$Launch_QQ = makeString("Launch QQ");

    static private final SubLString $$$launch = makeString("launch");

    private static final SubLSymbol CB_QUICK_QUESTIONS_TOOL = makeSymbol("CB-QUICK-QUESTIONS-TOOL");

    static private final SubLString $str_alt51$Hi__This_is_the_Quick_Questions_T = makeString("Hi! This is the Quick Questions Tool, which requires Java to be running. If you are having problems running this Applet, check the Java Console of your browser. Typically, the problem is the setup of your policy file. Contact support if you are having problems.");

    static private final SubLString $str_alt52$_Quick_Questions_Tool_ = makeString("[Quick Questions Tool]");



    private static final SubLSymbol $QUICK_QUESTIONS_TOOL = makeKeyword("QUICK-QUESTIONS-TOOL");

    private static final SubLSymbol CB_LINK_QUICK_QUESTIONS_TOOL = makeSymbol("CB-LINK-QUICK-QUESTIONS-TOOL");

    static private final SubLString $$$Quick_Questions = makeString("Quick Questions");

    static private final SubLString $$$QQ = makeString("QQ");

    static private final SubLString $str_alt58$help_Cyc_to_improve_its_knowledge = makeString("help Cyc to improve its knowledge by answering quick questions");

    // // Initializers
    public void declareFunctions() {
        declare_cb_quick_question_file();
    }

    public void initializeVariables() {
        init_cb_quick_question_file();
    }

    public void runTopLevelForms() {
        setup_cb_quick_question_file();
    }
}

