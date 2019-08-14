/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-FET
 *  source file: /cyc/top/cycl/cb-fet.lisp
 *  created:     2019/07/03 17:38:05
 */
public final class cb_fet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_fet() {
    }

    public static final SubLFile me = new cb_fet();

    public static final String myName = "com.cyc.cycjava.cycl.cb_fet";

    // // Definitions
    public static final SubLObject cb_link_fet_new_instance(SubLObject coll, SubLObject template_topic, SubLObject template_topic_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt1$cb_c_fet_coll_coll__A_topic__A_mt, new SubLObject[]{ cb_utilities.cb_term_identifier(coll), cb_utilities.cb_term_identifier(template_topic), cb_utilities.cb_term_identifier(template_topic_mt) });
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
                        html_utilities.html_princ(kb_paths.fort_name(template_topic));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            return coll;
        }
    }

    public static final SubLObject cb_link_fet_new_spec(SubLObject coll, SubLObject template_topic, SubLObject template_topic_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt1$cb_c_fet_coll_coll__A_topic__A_mt, new SubLObject[]{ cb_utilities.cb_term_identifier(el_utilities.make_specs_fn(coll)), cb_utilities.cb_term_identifier(template_topic), cb_utilities.cb_term_identifier(template_topic_mt) });
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
                        html_utilities.html_princ(kb_paths.fort_name(template_topic));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            return coll;
        }
    }

    public static final SubLObject cb_c_fet_coll(SubLObject args) {
        {
            SubLObject coll = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$coll, args), UNPROVIDED);
            SubLObject template_topic_string = html_utilities.html_extract_input($$$topic, args);
            SubLObject template_topic_term = cb_utilities.cb_guess_term(template_topic_string, UNPROVIDED);
            SubLObject template_topic_mt = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$mt, args), UNPROVIDED);
            SubLObject new_instance = rkf_term_utilities.rkf_create_instance_now(coll, UNPROVIDED);
            return cb_maybe_launch_fet(template_topic_mt, template_topic_term, new_instance, coll);
        }
    }

    public static final SubLObject cb_link_fet(SubLObject v_term, SubLObject template_topic, SubLObject template_topic_mt, SubLObject newlineP) {
        if (newlineP == UNPROVIDED) {
            newlineP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != newlineP) {
                html_utilities.html_newline(UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt10$cb_c_fet_term__A_topic__A_mt__A, new SubLObject[]{ cb_utilities.cb_term_identifier(v_term), cb_utilities.cb_term_identifier(template_topic), cb_utilities.cb_term_identifier(template_topic_mt) });
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
                        html_utilities.html_princ(kb_paths.fort_name(template_topic));
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

    public static final SubLObject cb_c_fet(SubLObject args) {
        {
            SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
            SubLObject template_topic_string = html_utilities.html_extract_input($$$topic, args);
            SubLObject template_topic_term = cb_utilities.cb_guess_term(template_topic_string, UNPROVIDED);
            SubLObject template_topic_mt = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$mt, args), UNPROVIDED);
            return cb_maybe_launch_fet(template_topic_mt, template_topic_term, v_term, UNPROVIDED);
        }
    }

    public static final SubLObject cb_link_fet_induced(SubLObject v_term, SubLObject newlineP) {
        if (newlineP == UNPROVIDED) {
            newlineP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != control_vars.$show_fet_edit_buttonsP$.getDynamicValue(thread)) {
                if (NIL != newlineP) {
                    html_utilities.html_newline(UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name($CONTENT);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt15$cb_c_fet_induced_term__A, cb_utilities.cb_term_identifier(v_term));
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
                            html_utilities.html_princ($$$Induced_Topic);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return v_term;
        }
    }

    public static final SubLObject cb_c_fet_induced(SubLObject args) {
        {
            SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
            SubLObject mt = $$InferencePSC;
            SubLObject topic_type = formula_template_utilities.make_induced_topic_type_for_term(v_term);
            return cb_maybe_launch_fet(mt, topic_type, v_term, UNPROVIDED);
        }
    }

    public static final SubLObject cb_maybe_launch_fet(SubLObject mt, SubLObject input_topic, SubLObject v_term, SubLObject focal_term_type) {
        if (focal_term_type == UNPROVIDED) {
            focal_term_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclist = operation_communication.the_cyclist();
                SubLObject launchedP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject validated_topic = formula_template_utilities.find_valid_fet_topic(input_topic, mt);
                    SubLObject error_message = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != validated_topic) {
                        cb_fet_applet.cb_fet_applet(mt, focal_term_type, cyclist, validated_topic, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        launchedP = T;
                    } else
                        if (NIL != string_utilities.non_empty_stringP(error_message)) {
                            cb_fet_problem(input_topic, error_message);
                        }

                }
                return launchedP;
            }
        }
    }

    public static final SubLObject cb_fet_problem(SubLObject input_topic, SubLObject error_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$FET_problem);
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
                                html_utilities.html_princ($$$FET_problem);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($str_alt22$Problem_launching_FET_for_);
                                cb_utilities.cb_form(input_topic, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str_alt23$_);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_princ(error_message);
                                cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
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
            return NIL;
        }
    }

    public static final SubLObject cb_c_fet_links(SubLObject args) {
        {
            SubLObject v_term = cb_utilities.cb_guess_term(html_utilities.html_extract_input($$$term, args), UNPROVIDED);
            cb_c_print_fet_links(v_term);
        }
        return NIL;
    }

    /**
     * Show the links for opening up an FET.
     */
    public static final SubLObject cb_c_print_fet_links(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != control_vars.$show_fet_edit_buttonsP$.getDynamicValue(thread)) || (NIL != control_vars.$show_fet_create_instance_buttonsP$.getDynamicValue(thread))) || (NIL != control_vars.$show_fet_create_spec_buttonsP$.getDynamicValue(thread))) {
                {
                    SubLObject dhtml_object_id = $$$FET;
                    SubLObject induced_topicP = formula_template_utilities.term_has_induced_fet_topicP(v_term);
                    SubLObject edit_topic_tuples = (NIL != control_vars.$show_fet_edit_buttonsP$.getDynamicValue(thread)) ? ((SubLObject) (cb_c_check_fet(v_term))) : NIL;
                    SubLObject collection_topic_tuples = (((NIL != control_vars.$show_fet_create_instance_buttonsP$.getDynamicValue(thread)) || (NIL != control_vars.$show_fet_create_spec_buttonsP$.getDynamicValue(thread))) && (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED))) ? ((SubLObject) (formula_template_utilities.applicable_template_topics_for_collection(v_term, UNPROVIDED))) : NIL;
                    SubLObject any_fet_linksP = makeBoolean(((NIL != induced_topicP) || (NIL != edit_topic_tuples)) || (NIL != collection_topic_tuples));
                    SubLObject edit_printedP = NIL;
                    if (NIL != any_fet_linksP) {
                        cb_c_print_fet_links_header(dhtml_object_id);
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
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != induced_topicP) {
                                    cb_c_print_fet_induced(v_term);
                                    edit_printedP = T;
                                }
                                if (NIL != edit_topic_tuples) {
                                    cb_c_print_fet_edit_links(v_term, edit_printedP, edit_topic_tuples);
                                }
                                if (NIL != collection_topic_tuples) {
                                    cb_c_print_collection_fet_links(v_term, collection_topic_tuples);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_c_print_fet_induced(SubLObject v_term) {
        html_utilities.html_princ($str_alt28$Edit_);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_glyph($NBSP, TWO_INTEGER);
        cb_utilities.cb_link($FET_INDUCED, v_term, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(UNPROVIDED);
        return v_term;
    }

    public static final SubLObject cb_c_print_fet_edit_links(SubLObject v_term, SubLObject edit_printedP, SubLObject edit_topic_tuples) {
        if (NIL == edit_printedP) {
            html_utilities.html_princ($str_alt28$Edit_);
            html_utilities.html_newline(UNPROVIDED);
            edit_printedP = T;
        }
        {
            SubLObject cdolist_list_var = edit_topic_tuples;
            SubLObject topic_tuple = NIL;
            for (topic_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_tuple = cdolist_list_var.first()) {
                html_utilities.html_glyph($NBSP, TWO_INTEGER);
                {
                    SubLObject datum = topic_tuple;
                    SubLObject current = datum;
                    SubLObject template_topic = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    template_topic = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        cb_utilities.cb_link($FET, v_term, template_topic, mt, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
        }
        return v_term;
    }

    public static final SubLObject cb_c_print_collection_fet_links(SubLObject v_term, SubLObject topic_tuples) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_instance_tuples = NIL;
                SubLObject new_spec_tuples = NIL;
                {
                    SubLObject cdolist_list_var = topic_tuples;
                    SubLObject topic_tuple = NIL;
                    for (topic_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_tuple = cdolist_list_var.first()) {
                        {
                            SubLObject datum = topic_tuple;
                            SubLObject current = datum;
                            SubLObject template_topic = NIL;
                            SubLObject mt = NIL;
                            SubLObject rel = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            template_topic = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            rel = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((rel == $$isa) && (NIL != control_vars.$show_fet_create_instance_buttonsP$.getDynamicValue(thread))) {
                                    new_instance_tuples = cons(topic_tuple, new_instance_tuples);
                                }
                                if ((rel == $$genls) && (NIL != control_vars.$show_fet_create_spec_buttonsP$.getDynamicValue(thread))) {
                                    new_spec_tuples = cons(topic_tuple, new_spec_tuples);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt31);
                            }
                        }
                    }
                }
                new_instance_tuples = nreverse(new_instance_tuples);
                new_spec_tuples = nreverse(new_spec_tuples);
                if (NIL != new_instance_tuples) {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt34$Edit_new_instance_);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = new_instance_tuples;
                        SubLObject topic_tuple = NIL;
                        for (topic_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_tuple = cdolist_list_var.first()) {
                            html_utilities.html_glyph($NBSP, TWO_INTEGER);
                            {
                                SubLObject datum = topic_tuple;
                                SubLObject current = datum;
                                SubLObject template_topic = NIL;
                                SubLObject mt = NIL;
                                SubLObject rel = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                template_topic = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                rel = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    cb_utilities.cb_link($FET_NEW_INSTANCE, v_term, template_topic, mt, rel, NIL);
                                    html_utilities.html_newline(UNPROVIDED);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt31);
                                }
                            }
                        }
                    }
                }
                if (NIL != new_spec_tuples) {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt35$Edit_new_specialization_);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = new_spec_tuples;
                        SubLObject topic_tuple = NIL;
                        for (topic_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_tuple = cdolist_list_var.first()) {
                            html_utilities.html_glyph($NBSP, TWO_INTEGER);
                            {
                                SubLObject datum = topic_tuple;
                                SubLObject current = datum;
                                SubLObject template_topic = NIL;
                                SubLObject mt = NIL;
                                SubLObject rel = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                template_topic = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                rel = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    cb_utilities.cb_link($FET_NEW_SPEC, v_term, template_topic, mt, rel, NIL);
                                    html_utilities.html_newline(UNPROVIDED);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt31);
                                }
                            }
                        }
                    }
                }
            }
            return v_term;
        }
    }

    public static final SubLObject cb_c_print_fet_links_header(SubLObject dhtml_object_id) {
        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str_alt36$);
        html_utilities.html_princ($$$Fact_Entry_Tool);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return NIL;
    }

    /**
     * Returns list of TemplateTopic/MT tuples that are appropriate for this term.
     */
    public static final SubLObject cb_c_check_fet(SubLObject v_term) {
        if (NIL == cycl_utilities.fort_or_naut_p(v_term)) {
            return NIL;
        }
        {
            SubLObject mt = $$InferencePSC;
            return formula_template_utilities.applicable_template_topics_for_term(v_term, mt);
        }
    }

    public static final SubLObject cb_link_fet_on_term(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!linktext.isString()) {
                linktext = kb_paths.fort_name(v_term);
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt39$cb_fet_on_term__A, cb_utilities.cb_term_identifier(v_term));
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
            return v_term;
        }
    }

    public static final SubLObject cb_fet_on_term(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$Edit_with_FET);
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject term_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            term_spec = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_term = cb_utilities.cb_guess_term(term_spec, UNPROVIDED);
                    if (NIL != cycl_grammar.cycl_term_p(v_term)) {
                        cb_fet_on_term_show_isa_selection_form(v_term);
                    } else {
                        cb_utilities.cb_error($str_alt44$_a_does_not_specify_a_Cyc_term, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
        }
        return NIL;
    }

    /**
     * Show a form to let the user specify which isas of TERM to use for the FET.
     */
    public static final SubLObject cb_fet_on_term_show_isa_selection_form(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isas = cb_fet_isas_for_term(v_term);
                if (NIL == isas) {
                    cb_utilities.cb_error($str_alt48$Couldn_t_find_any_collections_to_, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                {
                    SubLObject term_spec = cb_utilities.cb_term_identifier(v_term);
                    SubLObject title_var = $$$Edit_with_FET;
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
                                        html_utilities.html_markup($str_alt51$yui_skin_sam);
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
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt52$cb_handle_fet_on_term, term_spec, UNPROVIDED);
                                                        cb_utilities.cb_help_preamble($CB_FET_ON_TERM, UNPROVIDED, UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_fet_isas_for_term(SubLObject v_term) {
        return isa.all_isa_in_any_mt(v_term);
    }

    public static final SubLObject declare_cb_fet_file() {
        declareFunction("cb_link_fet_new_instance", "CB-LINK-FET-NEW-INSTANCE", 3, 0, false);
        declareFunction("cb_link_fet_new_spec", "CB-LINK-FET-NEW-SPEC", 3, 0, false);
        declareFunction("cb_c_fet_coll", "CB-C-FET-COLL", 1, 0, false);
        declareFunction("cb_link_fet", "CB-LINK-FET", 3, 1, false);
        declareFunction("cb_c_fet", "CB-C-FET", 1, 0, false);
        declareFunction("cb_link_fet_induced", "CB-LINK-FET-INDUCED", 1, 1, false);
        declareFunction("cb_c_fet_induced", "CB-C-FET-INDUCED", 1, 0, false);
        declareFunction("cb_maybe_launch_fet", "CB-MAYBE-LAUNCH-FET", 3, 1, false);
        declareFunction("cb_fet_problem", "CB-FET-PROBLEM", 2, 0, false);
        declareFunction("cb_c_fet_links", "CB-C-FET-LINKS", 1, 0, false);
        declareFunction("cb_c_print_fet_links", "CB-C-PRINT-FET-LINKS", 1, 0, false);
        declareFunction("cb_c_print_fet_induced", "CB-C-PRINT-FET-INDUCED", 1, 0, false);
        declareFunction("cb_c_print_fet_edit_links", "CB-C-PRINT-FET-EDIT-LINKS", 3, 0, false);
        declareFunction("cb_c_print_collection_fet_links", "CB-C-PRINT-COLLECTION-FET-LINKS", 2, 0, false);
        declareFunction("cb_c_print_fet_links_header", "CB-C-PRINT-FET-LINKS-HEADER", 1, 0, false);
        declareFunction("cb_c_check_fet", "CB-C-CHECK-FET", 1, 0, false);
        declareFunction("cb_link_fet_on_term", "CB-LINK-FET-ON-TERM", 1, 1, false);
        declareFunction("cb_fet_on_term", "CB-FET-ON-TERM", 1, 0, false);
        declareFunction("cb_fet_on_term_show_isa_selection_form", "CB-FET-ON-TERM-SHOW-ISA-SELECTION-FORM", 1, 0, false);
        declareFunction("cb_fet_isas_for_term", "CB-FET-ISAS-FOR-TERM", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_fet_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_fet_file() {
                cb_utilities.setup_cb_link_method($FET_NEW_INSTANCE, CB_LINK_FET_NEW_INSTANCE, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($FET_NEW_SPEC, CB_LINK_FET_NEW_SPEC, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_C_FET_COLL);
        cb_utilities.setup_cb_link_method($FET, CB_LINK_FET, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_C_FET);
        cb_utilities.setup_cb_link_method($FET_INDUCED, CB_LINK_FET_INDUCED, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_C_FET_INDUCED);
        html_macros.note_html_handler_function(CB_C_FET_LINKS);
        cb_utilities.setup_cb_link_method($FET_ON_TERM, CB_LINK_FET_ON_TERM, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_FET_ON_TERM);
        sethash($CB_FET_ON_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt47$cb_fet_on_term_html, NIL));
        return NIL;
    }



    static private final SubLString $str_alt1$cb_c_fet_coll_coll__A_topic__A_mt = makeString("cb-c-fet-coll&coll=~A&topic=~A&mt=~A");

    private static final SubLSymbol $FET_NEW_INSTANCE = makeKeyword("FET-NEW-INSTANCE");

    private static final SubLSymbol CB_LINK_FET_NEW_INSTANCE = makeSymbol("CB-LINK-FET-NEW-INSTANCE");

    private static final SubLSymbol $FET_NEW_SPEC = makeKeyword("FET-NEW-SPEC");

    private static final SubLSymbol CB_LINK_FET_NEW_SPEC = makeSymbol("CB-LINK-FET-NEW-SPEC");

    static private final SubLString $$$coll = makeString("coll");

    static private final SubLString $$$topic = makeString("topic");

    static private final SubLString $$$mt = makeString("mt");

    private static final SubLSymbol CB_C_FET_COLL = makeSymbol("CB-C-FET-COLL");

    static private final SubLString $str_alt10$cb_c_fet_term__A_topic__A_mt__A = makeString("cb-c-fet&term=~A&topic=~A&mt=~A");

    private static final SubLSymbol $FET = makeKeyword("FET");

    private static final SubLSymbol CB_LINK_FET = makeSymbol("CB-LINK-FET");

    static private final SubLString $$$term = makeString("term");

    private static final SubLSymbol CB_C_FET = makeSymbol("CB-C-FET");

    static private final SubLString $str_alt15$cb_c_fet_induced_term__A = makeString("cb-c-fet-induced&term=~A");

    static private final SubLString $$$Induced_Topic = makeString("Induced Topic");

    private static final SubLSymbol $FET_INDUCED = makeKeyword("FET-INDUCED");

    private static final SubLSymbol CB_LINK_FET_INDUCED = makeSymbol("CB-LINK-FET-INDUCED");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol CB_C_FET_INDUCED = makeSymbol("CB-C-FET-INDUCED");

    static private final SubLString $$$FET_problem = makeString("FET problem");

    static private final SubLString $str_alt22$Problem_launching_FET_for_ = makeString("Problem launching FET for ");

    static private final SubLString $str_alt23$_ = makeString(":");

    private static final SubLSymbol CB_C_FET_LINKS = makeSymbol("CB-C-FET-LINKS");

    static private final SubLString $$$FET = makeString("FET");





    static private final SubLString $str_alt28$Edit_ = makeString("Edit:");



    static private final SubLList $list_alt30 = list(makeSymbol("TEMPLATE-TOPIC"), makeSymbol("MT"));

    static private final SubLList $list_alt31 = list(makeSymbol("TEMPLATE-TOPIC"), makeSymbol("MT"), makeSymbol("REL"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLString $str_alt34$Edit_new_instance_ = makeString("Edit new instance:");

    static private final SubLString $str_alt35$Edit_new_specialization_ = makeString("Edit new specialization:");

    static private final SubLString $str_alt36$ = makeString("");

    static private final SubLString $$$Fact_Entry_Tool = makeString("Fact Entry Tool");



    static private final SubLString $str_alt39$cb_fet_on_term__A = makeString("cb-fet-on-term&~A");

    private static final SubLSymbol $FET_ON_TERM = makeKeyword("FET-ON-TERM");

    private static final SubLSymbol CB_LINK_FET_ON_TERM = makeSymbol("CB-LINK-FET-ON-TERM");

    static private final SubLString $$$Edit_with_FET = makeString("Edit with FET");

    static private final SubLList $list_alt43 = list(makeSymbol("TERM-SPEC"));

    static private final SubLString $str_alt44$_a_does_not_specify_a_Cyc_term = makeString("~a does not specify a Cyc term");

    private static final SubLSymbol CB_FET_ON_TERM = makeSymbol("CB-FET-ON-TERM");

    private static final SubLSymbol $CB_FET_ON_TERM = makeKeyword("CB-FET-ON-TERM");

    static private final SubLString $str_alt47$cb_fet_on_term_html = makeString("cb-fet-on-term.html");

    static private final SubLString $str_alt48$Couldn_t_find_any_collections_to_ = makeString("Couldn't find any collections to launch FET on ~S");



    static private final SubLString $str_alt50$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt51$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt52$cb_handle_fet_on_term = makeString("cb-handle-fet-on-term");

    // // Initializers
    public void declareFunctions() {
        declare_cb_fet_file();
    }

    public void initializeVariables() {
        init_cb_fet_file();
    }

    public void runTopLevelForms() {
        setup_cb_fet_file();
    }
}

