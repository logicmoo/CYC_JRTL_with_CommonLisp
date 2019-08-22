/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
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
 *  module:      CB-FET-APPLET
 *  source file: /cyc/top/cycl/cb-fet-applet.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_fet_applet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_fet_applet() {
    }

    public static final SubLFile me = new cb_fet_applet();


    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_fet_codebase$ = makeSymbol("*CB-FET-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_fet_class_file$ = makeSymbol("*CB-FET-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_fet_default_height$ = makeSymbol("*CB-FET-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_fet_default_width$ = makeSymbol("*CB-FET-DEFAULT-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_fet_default_plist$ = makeSymbol("*CB-FET-DEFAULT-PLIST*");

    public static final SubLObject cb_fet_get_current_project() {
        {
            SubLObject project = fi.ke_purpose();
            return NIL != forts.fort_p(project) ? ((SubLObject) (project)) : $$GeneralCycKE;
        }
    }

    public static final SubLObject cb_fet_applet(SubLObject template_mt, SubLObject focal_term_type, SubLObject user, SubLObject template_topic_id, SubLObject focal_term, SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject searchP, SubLObject project, SubLObject plist) {
        if (template_topic_id == UNPROVIDED) {
            template_topic_id = NIL;
        }
        if (focal_term == UNPROVIDED) {
            focal_term = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (generation_mt == UNPROVIDED) {
            generation_mt = NIL;
        }
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = NIL;
        }
        if (searchP == UNPROVIDED) {
            searchP = NIL;
        }
        if (project == UNPROVIDED) {
            project = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = $cb_fet_default_plist$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == project) {
                project = cb_fet_get_current_project();
            }
            if (NIL == domain_mt) {
                domain_mt = template_mt;
            }
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt9);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt9);
                    if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
                {
                    SubLObject title_tail = property_list_member($TITLE, current);
                    SubLObject title = (NIL != title_tail) ? ((SubLObject) (cadr(title_tail))) : $$$Fact_Entry_Tool;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : $cb_fet_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $cb_fet_default_width$.getGlobalValue();
                    SubLObject archive = cyc_file_dependencies.java_applet_archive_string($$$fet);
                    html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_fet_class_file$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_fet_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(archive);
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
                                SubLObject search_string = (NIL != searchP) ? ((SubLObject) ($$$true)) : $$$false;
                                SubLObject template_mt_string = string_utilities.to_string(cycl_utilities.hl_to_el(template_mt));
                                SubLObject focal_term_type_string = string_utilities.to_string(cycl_utilities.hl_to_el(focal_term_type));
                                SubLObject template_topic_id_string = string_utilities.to_string(cycl_utilities.hl_to_el(template_topic_id));
                                SubLObject user_string = string_utilities.to_string(cycl_utilities.hl_to_el(user));
                                SubLObject focal_term_string = string_utilities.to_string(cycl_utilities.hl_to_el(focal_term));
                                SubLObject project_string = string_utilities.to_string(cycl_utilities.hl_to_el(project));
                                SubLObject domain_mt_string = string_utilities.to_string(cycl_utilities.hl_to_el(domain_mt));
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$templateMt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(template_mt_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$topicType);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(focal_term_type_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$searchMode);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(search_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                if (NIL != forts.fort_p(focal_term)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$focalTerm);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(focal_term_string);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (NIL != forts.fort_p(template_topic_id)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$templateTopicId);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(template_topic_id_string);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$domainMt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(domain_mt_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (NIL != forts.fort_p(parsing_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$parsingMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(parsing_mt));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (NIL != forts.fort_p(generation_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$generationMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(generation_mt));
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
            return template_mt;
        }
    }







    public static final SubLObject cb_fact_entry_choice_list(SubLObject template_topic_id, SubLObject topic_type, SubLObject template_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tuples = formula_template_utilities.get_all_formula_template_definition_tuples();
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
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
                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Template_Topic);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
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
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Type_of_Term);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
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
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Microtheory);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject tuple = NIL;
                            SubLObject counter = NIL;
                            for (list_var = tuples, tuple = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                {
                                    SubLObject datum = tuple;
                                    SubLObject current = datum;
                                    SubLObject term_type = NIL;
                                    SubLObject topic_id = NIL;
                                    SubLObject elmt = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                    term_type = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                    topic_id = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                    elmt = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject selectedP = makeBoolean(((term_type == topic_type) && (topic_id == template_topic_id)) && (elmt == template_mt));
                                            SubLObject bgcolor = (NIL != oddp(counter)) ? ((SubLObject) (html_macros.$html_color_lighter_purple$.getDynamicValue(thread))) : html_macros.$html_color_white$.getDynamicValue(thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_radio_input($str_alt41$fact_entry_choice, counter, selectedP);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
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
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_form(topic_id, UNPROVIDED, UNPROVIDED);
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
                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_form(term_type, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
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
                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_form(elmt, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt40);
                                    }
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

    public static final SubLObject cb_fact_entry_tool(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fact_entry_choice_string = html_utilities.html_extract_input($str_alt41$fact_entry_choice, args);
                SubLObject fact_entry_choice = (NIL != number_utilities.number_string_p(fact_entry_choice_string)) ? ((SubLObject) (parse_integer(fact_entry_choice_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject tuples = (fact_entry_choice.isFixnum()) ? ((SubLObject) (nth(fact_entry_choice, formula_template_utilities.get_all_formula_template_definition_tuples()))) : NIL;
                SubLObject template_mt = nth(TWO_INTEGER, tuples);
                SubLObject domain_mt = misc_kb_utilities.guess_fort(html_utilities.html_extract_input($str_alt42$domain_mt, args));
                SubLObject topic_type = nth(ZERO_INTEGER, tuples);
                SubLObject focal_term = misc_kb_utilities.guess_fort(html_utilities.html_extract_input($str_alt43$focal_term, args));
                SubLObject template_topic_id = nth(ONE_INTEGER, tuples);
                SubLObject loading_mode_string = html_utilities.html_extract_input($str_alt44$loading_mode, args);
                SubLObject loading_mode = (NIL != number_utilities.number_string_p(loading_mode_string)) ? ((SubLObject) (ONE_INTEGER.numE(parse_integer(loading_mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($LOAD_FROM_KB)) : $USE_CACHES)) : $UNKNOWN;
                SubLObject searchP = NIL;
                SubLObject title_var = $$$Fact_Entry_Tool;
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
                            SubLObject _prev_bind_0_12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt50$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_princ(cb_fact_entry_tool_get_introduction_text());
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        if ((NIL == forts.fort_p(template_mt)) || ((NIL == forts.fort_p(topic_type)) && (NIL == forts.fort_p(template_topic_id)))) {
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
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt51$cb_fact_entry_tool, T, UNPROVIDED);
                                                        if (NIL == forts.fort_p(template_mt)) {
                                                            template_mt = $cb_fet_last_template_mt$.getDynamicValue(thread);
                                                        }
                                                        if (NIL == forts.fort_p(topic_type)) {
                                                            topic_type = $cb_fet_last_topic_type$.getDynamicValue(thread);
                                                        }
                                                        if (NIL == forts.fort_p(template_topic_id)) {
                                                            template_topic_id = $cb_fet_last_template_topic_id$.getDynamicValue(thread);
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
                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt52$Template_Choice__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
                                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_fact_entry_choice_list(template_topic_id, topic_type, template_mt);
                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt53$Domain_Mt__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
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
                                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject v_default = (NIL != forts.fort_p(domain_mt)) ? ((SubLObject) (kb_paths.fort_name(domain_mt))) : $str_alt54$;
                                                                                    html_utilities.html_text_input($str_alt42$domain_mt, v_default, $int$60);
                                                                                }
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
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                                            html_utilities.html_princ($str_alt56$_optional__if____Template_Mt_);
                                                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                }
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
                                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt57$Focal_Term__);
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
                                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject v_default = (NIL != forts.fort_p(focal_term)) ? ((SubLObject) (kb_paths.fort_name(focal_term))) : $str_alt54$;
                                                                                    html_utilities.html_text_input($str_alt43$focal_term, v_default, $int$60);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
                                                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                                            html_utilities.html_princ($str_alt58$_optional_);
                                                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                                            {
                                                                                                SubLObject color_val = html_macros.$html_color_dark_blue$.getDynamicValue(thread);
                                                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                                if (NIL != color_val) {
                                                                                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_princ($str_alt59$Not_yet_supported_either_);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                }
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
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt60$Template_Loading_Mode__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
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
                                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt44$loading_mode);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(ONE_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt61$Load_afresh_from_KB__slower_);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt62$Reuse_previously_loaded_values__f);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_submit_input($$$Launch_FET, $$$launch, UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            if (loading_mode == $LOAD_FROM_KB) {
                                                api_widgets.clear_all_api_widgets_caches();
                                            }
                                            cb_fet_applet(template_mt, topic_type, operation_communication.the_cyclist(), template_topic_id, focal_term, domain_mt, searchP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (loading_mode != $UNKNOWN) {
                                                html_utilities.html_newline(TWO_INTEGER);
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
                                                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (loading_mode == $LOAD_FROM_KB) {
                                                                html_utilities.html_princ($str_alt65$Templates_are_loaded_from_KB_);
                                                            } else {
                                                                html_utilities.html_princ($str_alt66$Previously_loaded_templates_are_b);
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                            }
                                            $cb_fet_last_template_topic_id$.setDynamicValue(template_topic_id, thread);
                                            $cb_fet_last_template_mt$.setDynamicValue(template_mt, thread);
                                            $cb_fet_last_topic_type$.setDynamicValue(topic_type, thread);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_12, thread);
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
    private static final SubLSymbol $cb_fet_introduction_text$ = makeSymbol("*CB-FET-INTRODUCTION-TEXT*");

    public static final SubLObject cb_fact_entry_tool_get_introduction_text() {
        return $cb_fet_introduction_text$.getGlobalValue();
    }

    public static final SubLObject declare_cb_fet_applet_file() {
        declareFunction("cb_fet_get_current_project", "CB-FET-GET-CURRENT-PROJECT", 0, 0, false);
        declareFunction("cb_fet_applet", "CB-FET-APPLET", 3, 8, false);
        declareFunction("cb_fact_entry_choice_list", "CB-FACT-ENTRY-CHOICE-LIST", 3, 0, false);
        declareFunction("cb_fact_entry_tool", "CB-FACT-ENTRY-TOOL", 0, 1, false);
        declareFunction("cb_fact_entry_tool_get_introduction_text", "CB-FACT-ENTRY-TOOL-GET-INTRODUCTION-TEXT", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_fet_applet_file() {
        deflexical("*CB-FET-CODEBASE*", $str_alt0$_java_fet);
        deflexical("*CB-FET-CLASS-FILE*", $str_alt1$com_cyc_framework_ui_editor_FETAp);
        deflexical("*CB-FET-DEFAULT-HEIGHT*", $int$480);
        deflexical("*CB-FET-DEFAULT-WIDTH*", $int$640);
        deflexical("*CB-FET-DEFAULT-PLIST*", list($TITLE, $$$Fact_Entry_Tool, $HEIGHT, $cb_fet_default_height$.getGlobalValue(), $WIDTH, $cb_fet_default_width$.getGlobalValue()));
        defparameter("*CB-FET-LAST-TEMPLATE-MT*", NIL);
        defparameter("*CB-FET-LAST-TOPIC-TYPE*", NIL);
        defparameter("*CB-FET-LAST-TEMPLATE-TOPIC-ID*", NIL);
        deflexical("*CB-FET-INTRODUCTION-TEXT*", $str_alt68$Hi__This_is_the_Fact_Entry_Tool__);
        return NIL;
    }

    public static final SubLObject setup_cb_fet_applet_file() {
                utilities_macros.register_html_state_variable($cb_fet_last_template_mt$);
        utilities_macros.register_html_state_variable($cb_fet_last_topic_type$);
        utilities_macros.register_html_state_variable($cb_fet_last_template_topic_id$);
        html_macros.note_html_handler_function(CB_FACT_ENTRY_TOOL);
        cb_utilities.declare_cb_tool($FACT_ENTRY_TOOL, $$$Fact_Entry_Tool, $$$FET, $str_alt71$Create_and_edit_concepts_using_th);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_fet = makeString("/java/fet");

    static private final SubLString $str_alt1$com_cyc_framework_ui_editor_FETAp = makeString("com.cyc.framework.ui.editor.FETApplet");

    public static final SubLInteger $int$480 = makeInteger(480);

    public static final SubLInteger $int$640 = makeInteger(640);



    static private final SubLString $$$Fact_Entry_Tool = makeString("Fact Entry Tool");





    public static final SubLObject $$GeneralCycKE = constant_handles.reader_make_constant_shell(makeString("GeneralCycKE"));

    static private final SubLList $list_alt9 = list(makeSymbol("&KEY"), list(makeSymbol("TITLE"), makeString("Fact Entry Tool")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-FET-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-FET-DEFAULT-WIDTH*")));

    static private final SubLList $list_alt10 = list(makeKeyword("TITLE"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$fet = makeString("fet");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $$$false = makeString("false");

    static private final SubLString $$$templateMt = makeString("templateMt");

    static private final SubLString $$$topicType = makeString("topicType");

    static private final SubLString $$$searchMode = makeString("searchMode");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$cycMachine = makeString("cycMachine");

    static private final SubLString $$$cycPort = makeString("cycPort");

    static private final SubLString $$$focalTerm = makeString("focalTerm");

    static private final SubLString $$$templateTopicId = makeString("templateTopicId");

    static private final SubLString $$$domainMt = makeString("domainMt");

    static private final SubLString $$$parsingMt = makeString("parsingMt");

    static private final SubLString $$$generationMt = makeString("generationMt");

    static private final SubLString $$$title = makeString("title");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$httpState = makeString("httpState");

    public static final SubLSymbol $cb_fet_last_template_mt$ = makeSymbol("*CB-FET-LAST-TEMPLATE-MT*");

    public static final SubLSymbol $cb_fet_last_topic_type$ = makeSymbol("*CB-FET-LAST-TOPIC-TYPE*");

    public static final SubLSymbol $cb_fet_last_template_topic_id$ = makeSymbol("*CB-FET-LAST-TEMPLATE-TOPIC-ID*");







    static private final SubLString $$$Template_Topic = makeString("Template Topic");

    static private final SubLString $$$Type_of_Term = makeString("Type of Term");

    static private final SubLString $$$Microtheory = makeString("Microtheory");

    static private final SubLList $list_alt40 = list(makeSymbol("TERM-TYPE"), makeSymbol("TOPIC-ID"), makeSymbol("ELMT"));

    static private final SubLString $str_alt41$fact_entry_choice = makeString("fact_entry_choice");

    static private final SubLString $str_alt42$domain_mt = makeString("domain_mt");

    static private final SubLString $str_alt43$focal_term = makeString("focal_term");

    static private final SubLString $str_alt44$loading_mode = makeString("loading_mode");

    private static final SubLSymbol $LOAD_FROM_KB = makeKeyword("LOAD-FROM-KB");

    private static final SubLSymbol $USE_CACHES = makeKeyword("USE-CACHES");





    static private final SubLString $str_alt49$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt50$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt51$cb_fact_entry_tool = makeString("cb-fact-entry-tool");

    static private final SubLString $str_alt52$Template_Choice__ = makeString("Template Choice: ");

    static private final SubLString $str_alt53$Domain_Mt__ = makeString("Domain Mt: ");

    static private final SubLString $str_alt54$ = makeString("");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt56$_optional__if____Template_Mt_ = makeString("(optional, if != Template Mt)");

    static private final SubLString $str_alt57$Focal_Term__ = makeString("Focal Term: ");

    static private final SubLString $str_alt58$_optional_ = makeString("(optional)");

    static private final SubLString $str_alt59$Not_yet_supported_either_ = makeString("Not yet supported either.");

    static private final SubLString $str_alt60$Template_Loading_Mode__ = makeString("Template Loading Mode: ");

    static private final SubLString $str_alt61$Load_afresh_from_KB__slower_ = makeString("Load afresh from KB (slower)");

    static private final SubLString $str_alt62$Reuse_previously_loaded_values__f = makeString("Reuse previously loaded values (faster)");

    static private final SubLString $$$Launch_FET = makeString("Launch FET");

    static private final SubLString $$$launch = makeString("launch");

    static private final SubLString $str_alt65$Templates_are_loaded_from_KB_ = makeString("Templates are loaded from KB.");

    static private final SubLString $str_alt66$Previously_loaded_templates_are_b = makeString("Previously loaded templates are being reused.");

    private static final SubLSymbol CB_FACT_ENTRY_TOOL = makeSymbol("CB-FACT-ENTRY-TOOL");

    static private final SubLString $str_alt68$Hi__This_is_the_Fact_Entry_Tool__ = makeString("Hi! This is the Fact Entry Tool, which requires Java to be running. If you are having problems running this Applet, check the Java Console of your browser. Typically, the problem is the setup of your policy file. Contact support if you are having problems.");

    private static final SubLSymbol $FACT_ENTRY_TOOL = makeKeyword("FACT-ENTRY-TOOL");

    static private final SubLString $$$FET = makeString("FET");

    static private final SubLString $str_alt71$Create_and_edit_concepts_using_th = makeString("Create and edit concepts using the Fact Entry Tool suite of tools.");

    // // Initializers
    public void declareFunctions() {
        declare_cb_fet_applet_file();
    }

    public void initializeVariables() {
        init_cb_fet_applet_file();
    }

    public void runTopLevelForms() {
        setup_cb_fet_applet_file();
    }
}

