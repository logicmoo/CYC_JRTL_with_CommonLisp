/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_i;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_m;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_z;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-USER-INTERACTION-AGENDA
 *  source file: /cyc/top/cycl/cb-user-interaction-agenda.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_user_interaction_agenda extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_user_interaction_agenda() {
    }

    public static final SubLFile me = new cb_user_interaction_agenda();


    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_uia_show_cyclP$ = makeSymbol("*CB-UIA-SHOW-CYCL?*");



    /**
     * Return the current meta-agenda.
     */
    public static final SubLObject cb_current_uima() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_current_uima$.getDynamicValue(thread);
        }
    }

    /**
     * Return the current agenda under the current meta-agenda.
     */
    public static final SubLObject cb_current_uia() {
        {
            SubLObject meta_agenda = cb_current_uima();
            return NIL != meta_agenda ? ((SubLObject) (user_interaction_agenda.uima_current_agenda(meta_agenda))) : NIL;
        }
    }

    public static final SubLObject execute_within_uima_of_interaction(SubLObject interaction, SubLObject function, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject meta_agenda = user_interaction_agenda.uia_meta_agenda(v_agenda);
                {
                    SubLObject _prev_bind_0 = $cb_current_uima$.currentBinding(thread);
                    try {
                        $cb_current_uima$.bind(meta_agenda, thread);
                        result = apply(function, args);
                    } finally {
                        $cb_current_uima$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject switch_to_specified_uima_uia_tuple(SubLObject uima_id, SubLObject uia_id) {
        {
            SubLObject uima = user_interaction_agenda.uimma_resolve_meta_agenda_id(uima_id);
            if (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(uima)) {
                $cb_current_uima$.setDynamicValue(uima);
                {
                    SubLObject uia = user_interaction_agenda.uima_find_by_id(uima, uia_id);
                    if (NIL != user_interaction_agenda.user_interaction_agenda_p(uia)) {
                        user_interaction_agenda.uima_act_focus(uima, uia);
                    }
                }
            }
            return uima;
        }
    }

    /**
     *
     *
     * @unknown Eventually, we need a more principled way to register
    exit handlers with the agenda -- the resetting of caches is just
    one example of many.
     */
    public static final SubLObject cb_uia_complete_restart(SubLObject v_agenda) {
        $cb_current_uima$.setDynamicValue(NIL);
        rkf_text_processors.rkf_text_processor_reset_caches();
        cb_uia_ensure_initialized();
        v_agenda = cb_current_uia();
        cb_uia_launchers_refresh_script();
        cb_uia_command_interpreter_refresh_script();
        return v_agenda;
    }

    public static final SubLObject cb_uia_ensure_initialized() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_current_uima$.getDynamicValue(thread)) {
                {
                    SubLObject meta_agenda = user_interaction_agenda.uima_act_create(UNPROVIDED);
                    $cb_current_uima$.setDynamicValue(meta_agenda, thread);
                }
            }
            if (NIL == cb_current_uia()) {
                {
                    SubLObject meta_agenda = cb_current_uima();
                    SubLObject v_agenda = user_interaction_agenda.uia_act_create(meta_agenda, UNPROVIDED);
                    cb_uia_initialize(v_agenda);
                    user_interaction_agenda.uima_act_focus(meta_agenda, v_agenda);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_initialize(SubLObject v_agenda) {
        user_interaction_agenda.uia_act_standard_initialization(v_agenda);
        return v_agenda;
    }

    public static final SubLObject cb_uia_new_focal_agenda() {
        {
            SubLObject meta_agenda = cb_current_uima();
            SubLObject v_agenda = user_interaction_agenda.uia_act_create(meta_agenda, UNPROVIDED);
            cb_uia_initialize(v_agenda);
            user_interaction_agenda.uima_act_focus(meta_agenda, v_agenda);
            return v_agenda;
        }
    }

    public static final SubLObject cb_uia_start(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cb_uia_ensure_initialized();
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        cb_uia_application_title(UNPROVIDED);
        cb_uia_emit_new_frame_format();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }



    public static final SubLObject ensure_cb_uia_application_server_initialized() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$cb_uia_application_server$.getDynamicValue(thread).isString()) {
                $cb_uia_application_server$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name($$$unknown)), thread);
            }
            return $cb_uia_application_server$.getDynamicValue(thread);
        }
    }

    public static final SubLObject cb_uia_application_title(SubLObject application) {
        if (application == UNPROVIDED) {
            application = $$$KRAKEN;
        }
        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
        html_macros.html_head_content_type();
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
        html_utilities.html_princ(application);
        html_utilities.html_princ($str_alt27$_on_);
        html_utilities.html_princ(ensure_cb_uia_application_server_initialized());
        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uia_emit_frames_separated() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject main_hsplit = $str_alt28$20____25_;
                SubLObject main_vsplit = $str_alt29$__10_;
                SubLObject agenda_vsplit = $str_alt30$__1_1;
                if (NIL != html_macros.html_inside_body_p()) {
                    Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                if (NIL != main_hsplit) {
                    html_utilities.html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(main_hsplit);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_utilities.cb_frame($UIA_LAUNCHERS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (NIL != main_vsplit) {
                            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(main_vsplit);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_frame($UIA_INTERACTION, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_TYPEIN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (NIL != agenda_vsplit) {
                            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(agenda_vsplit);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$no);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_frame($UIA_AGENDA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_AGENDA_REFRESH, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_NOOP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_emit_new_frame_format() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject main_hsplit = $str_alt33$__25_;
                SubLObject main_vsplit = $str_alt29$__10_;
                SubLObject agenda_vsplit = $str_alt30$__1_1;
                if (NIL != html_macros.html_inside_body_p()) {
                    Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                if (NIL != main_hsplit) {
                    html_utilities.html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(main_hsplit);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (NIL != main_vsplit) {
                            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(main_vsplit);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_frame($UIA_INTERACTION, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_TYPEIN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt31$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (NIL != agenda_vsplit) {
                            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(agenda_vsplit);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$no);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_frame($UIA_AGENDA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_AGENDA_REFRESH, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_utilities.cb_frame($UIA_NOOP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_start(SubLObject target, SubLObject linktext) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt34$_UIA_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt35$cb_uia_start);
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

    public static final SubLObject cb_link_uia_launcher(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        return cb_utilities.cb_link($UIA_START, $MAIN, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    // defparameter
    private static final SubLSymbol $cb_uia_use_menu_based_launchersP$ = makeSymbol("*CB-UIA-USE-MENU-BASED-LAUNCHERS?*");

    public static final SubLObject cb_uia_use_menu_based_launchers_p() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($cb_uia_use_menu_based_launchersP$.getDynamicValue(thread));
        }
    }

    public static final SubLObject cb_uia_launchers(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_current_uia();
            if (NIL != cb_uia_use_menu_based_launchers_p()) {
                cb_uia_menu_based_launchers_guts(v_agenda);
            } else {
                cb_uia_launchers_guts(v_agenda);
            }
        }
        return args;
    }

    public static final SubLObject cb_link_uia_launchers(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt44$_UIA_Launchers_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_LAUNCHERS);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt4$cb_uia_launchers);
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

    public static final SubLObject cb_uia_interaction(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_uia_next_interaction(args);
    }

    public static final SubLObject cb_uia_next_interaction(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_uia_show_next_interaction(cb_current_uia());
    }

    public static final SubLObject cb_link_uia_next_interaction(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt48$_Next_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ(get_uia_next_interaction_function());
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

    public static final SubLObject get_uia_next_interaction_function() {
        return $str_alt51$cb_uia_next_interaction;
    }

    public static final SubLObject cb_uia_choose_interaction(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject status = user_interaction_agenda.ui_status(interaction);
                    SubLObject pcase_var = status;
                    if (pcase_var.eql($PENDING)) {
                        user_interaction_agenda.uia_note_user_selection(v_agenda, interaction);
                        return cb_uia_show_chosen_interaction(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($BLOCKED)) {
                            {
                                SubLObject pending_descendants = user_interaction_agenda.ui_pending_descendant_interactions(interaction);
                                if (NIL != pending_descendants) {
                                    {
                                        SubLObject next_pending_descendant = pending_descendants.first();
                                        user_interaction_agenda.uia_note_user_selection(v_agenda, interaction);
                                        return cb_uia_show_chosen_interaction(v_agenda, next_pending_descendant);
                                    }
                                } else {
                                    return cb_uia_show_next_interaction(v_agenda);
                                }
                            }
                        } else {
                            return cb_uia_show_next_interaction(v_agenda);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list_alt52);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_choose_interaction(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt57$cb_uia_choose_interaction__A, user_interaction_agenda.ui_id(interaction));
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
                        if (NIL != linktext) {
                            html_utilities.html_princ(linktext);
                        } else {
                            cb_uia_show_action_linktext(interaction);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_uia_typein_guts(cb_current_uia());
    }

    public static final SubLObject cb_link_uia_typein(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt61$_UIA_Typein_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_TYPEIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt10$cb_uia_typein);
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

    public static final SubLObject cb_uia_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_uia_agenda_guts(cb_current_uia());
    }

    public static final SubLObject cb_link_uia_agenda(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt64$_UIA_Agenda_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_AGENDA);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt13$cb_uia_agenda);
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

    public static final SubLObject cb_uia_refresh_frames_scripts(SubLObject refresh_frames) {
        {
            SubLObject cdolist_list_var = refresh_frames;
            SubLObject frame = NIL;
            for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = frame;
                    if (pcase_var.eql($UIA_INTERACTION)) {
                        cb_uia_interaction_refresh_script();
                    } else
                        if (pcase_var.eql($UIA_AGENDA)) {
                            cb_uia_agenda_refresh_script();
                        } else
                            if (pcase_var.eql($UIA_LAUNCHERS)) {
                                cb_uia_launchers_refresh_script();
                            } else
                                if (pcase_var.eql($UIA_TYPEIN)) {
                                    cb_uia_command_interpreter_refresh_script();
                                }



                }
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_uia_frame_marker$ = makeSymbol("*CB-UIA-FRAME-MARKER*");

    // deflexical
    private static final SubLSymbol $cb_uia_frame_refresh_script_template$ = makeSymbol("*CB-UIA-FRAME-REFRESH-SCRIPT-TEMPLATE*");

    public static final SubLObject cb_uia_string_quotify(SubLObject string) {
        return cconcatenate($str_alt68$_, new SubLObject[]{ string, $str_alt68$_ });
    }

    public static final SubLObject construct_cb_uia_frame_refresh_script(SubLObject frame) {
        {
            SubLObject substitutions = list(cons($cb_uia_frame_marker$.getGlobalValue(), cb_uia_string_quotify(cb_utilities.cb_frame_name(frame))));
            return html_script_utilities.instantiate_javascript_template($cb_uia_frame_refresh_script_template$.getGlobalValue(), substitutions);
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uia_launchers_refresh_script$ = makeSymbol("*CB-UIA-LAUNCHERS-REFRESH-SCRIPT*");

    // deflexical
    private static final SubLSymbol $cb_uia_command_interpreter_refresh_script$ = makeSymbol("*CB-UIA-COMMAND-INTERPRETER-REFRESH-SCRIPT*");

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_refresh_script$ = makeSymbol("*CB-UIA-AGENDA-REFRESH-SCRIPT*");

    // deflexical
    private static final SubLSymbol $cb_uia_interaction_refresh_script$ = makeSymbol("*CB-UIA-INTERACTION-REFRESH-SCRIPT*");

    public static final SubLObject cb_uia_launchers_refresh_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_uia_launchers_refresh_script$.getGlobalValue()) {
                $cb_uia_launchers_refresh_script$.setGlobalValue(construct_cb_uia_frame_refresh_script($UIA_LAUNCHERS));
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(NIL, thread);
                            html_utilities.html_princ($cb_uia_launchers_refresh_script$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                        }
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_command_interpreter_refresh_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_uia_command_interpreter_refresh_script$.getGlobalValue()) {
                $cb_uia_command_interpreter_refresh_script$.setGlobalValue(construct_cb_uia_frame_refresh_script($UIA_TYPEIN));
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(NIL, thread);
                            html_utilities.html_princ($cb_uia_command_interpreter_refresh_script$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                        }
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_refresh_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_uia_agenda_refresh_script$.getGlobalValue()) {
                $cb_uia_agenda_refresh_script$.setGlobalValue(construct_cb_uia_frame_refresh_script($UIA_AGENDA));
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(NIL, thread);
                            html_utilities.html_princ($cb_uia_agenda_refresh_script$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                        }
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_interaction_refresh_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_uia_interaction_refresh_script$.getGlobalValue()) {
                $cb_uia_interaction_refresh_script$.setGlobalValue(construct_cb_uia_frame_refresh_script($UIA_INTERACTION));
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(NIL, thread);
                            html_utilities.html_princ($cb_uia_interaction_refresh_script$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                        }
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_refresh(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_current_uia();
                SubLObject rate = uima_interface_parameter_declaration.uia_refresh_rate(v_agenda);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                if (rate.isNumber()) {
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_refresh(rate, UNPROVIDED_SYM);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uia_agenda_snapshot_signature_check(v_agenda);
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
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

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_snapshot_signature_template$ = makeSymbol("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-TEMPLATE*");

    public static final SubLObject cb_uia_agenda_snapshot_signature(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject meta_agenda_id = uia_agenda_snapshot_signature(v_agenda);
                SubLObject agenda_id = thread.secondMultipleValue();
                SubLObject current_total = thread.thirdMultipleValue();
                SubLObject current_finished = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $cb_uia_agenda_snapshot_signature_template$.getGlobalValue(), new SubLObject[]{ meta_agenda_id, agenda_id, current_total, current_finished });
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_snapshot_signature_param$ = makeSymbol("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_refresh_snapshot_signature_param$ = makeSymbol("*CB-UIA-AGENDA-REFRESH-SNAPSHOT-SIGNATURE-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_refresh_timeout_param$ = makeSymbol("*CB-UIA-AGENDA-REFRESH-TIMEOUT-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_refresh_timeout$ = makeSymbol("*CB-UIA-AGENDA-REFRESH-TIMEOUT*");

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_snapshot_signature_check_template$ = makeSymbol("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK-TEMPLATE*");

    public static final SubLObject construct_cb_uia_agenda_snapshot_signature_check_template(SubLObject agenda_frame, SubLObject refresh_frame) {
        {
            SubLObject substitutions = list(cons($cb_uia_agenda_snapshot_signature_param$.getGlobalValue(), cb_uia_string_quotify(cb_utilities.cb_frame_name(agenda_frame))), cons($cb_uia_agenda_refresh_snapshot_signature_param$.getGlobalValue(), cb_uia_string_quotify(cb_utilities.cb_frame_name(refresh_frame))), cons($cb_uia_agenda_refresh_timeout_param$.getGlobalValue(), string_utilities.to_string($cb_uia_agenda_refresh_timeout$.getGlobalValue())));
            return html_script_utilities.instantiate_javascript_template($cb_uia_agenda_snapshot_signature_check_template$.getGlobalValue(), substitutions);
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uia_agenda_snapshot_signature_check_script$ = makeSymbol("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK-SCRIPT*");

    public static final SubLObject cb_uia_agenda_snapshot_signature_check(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_uia_agenda_snapshot_signature_check_script$.getGlobalValue()) {
                $cb_uia_agenda_snapshot_signature_check_script$.setGlobalValue(construct_cb_uia_agenda_snapshot_signature_check_template($UIA_AGENDA, $UIA_AGENDA_REFRESH));
            }
            cb_uia_agenda_snapshot_signature(v_agenda);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup($cb_uia_agenda_snapshot_signature_check_script$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject uia_agenda_snapshot_signature(SubLObject v_agenda) {
        if (NIL == user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
            return values(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
        }
        {
            SubLObject meta_agenda_id = user_interaction_agenda.uima_id(user_interaction_agenda.uia_meta_agenda(v_agenda));
            SubLObject agenda_id = user_interaction_agenda.uia_id(v_agenda);
            SubLObject current_total = user_interaction_agenda.uia_total_interaction_count(v_agenda);
            SubLObject current_finished = user_interaction_agenda.uia_finished_interaction_count(v_agenda);
            return values(meta_agenda_id, agenda_id, current_total, current_finished);
        }
    }

    public static final SubLObject cb_uia_noop(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Noop_Frame);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_action(SubLObject action, SubLObject tabulatedP, SubLObject indent_depth) {
        if (tabulatedP == UNPROVIDED) {
            tabulatedP = NIL;
        }
        if (indent_depth == UNPROVIDED) {
            indent_depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tabulatedP) {
                cb_uia_render_action_link(action);
                cb_uia_render_action_description(action, UNPROVIDED);
            } else {
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
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_utilities.html_indent(indent_depth);
                                cb_uia_render_action_link(action);
                                html_utilities.html_indent(ONE_INTEGER);
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uia_render_action_description(action, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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

    public static final SubLObject cb_uia_render_action_link(SubLObject action) {
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        cb_uia_show_action_link(action);
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        return action;
    }

    public static final SubLObject cb_uia_render_action_description(SubLObject action, SubLObject truncate) {
        if (truncate == UNPROVIDED) {
            truncate = $int$100;
        }
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        cb_uia_show_action_hint(action, truncate, UNPROVIDED);
        if (NIL != uima_interface_parameter_declaration.uia_show_debug_linksP(cb_current_uia())) {
            html_utilities.html_indent(UNPROVIDED);
            cb_utilities.cb_link($UIA_DEBUG_INTERACTION, action, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        return action;
    }

    public static final SubLObject cb_uia_show_action_link(SubLObject action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.uia_background_task_p(action)) {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_style_background_color($YELLOW);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_show_action_linktext(action);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            } else {
                {
                    SubLObject pcase_var = user_interaction_agenda.ui_status(action);
                    if (pcase_var.eql($PENDING)) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_style_background_color($GREEN);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_utilities.cb_link($UIA_CHOOSE_INTERACTION, action, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    } else
                        if (pcase_var.eql($BLOCKED)) {
                            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_style_background_color($MEDIUM_RED);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_CHOOSE_INTERACTION, action, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        } else {
                            cb_uia_show_action_linktext(action);
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_action_linktext(SubLObject action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt84$__S_, user_interaction_agenda.ui_id(action));
        }
    }

    public static final SubLObject cb_uia_show_action_hint(SubLObject action, SubLObject truncate, SubLObject v_agenda) {
        if (truncate == UNPROVIDED) {
            truncate = NIL;
        }
        if (v_agenda == UNPROVIDED) {
            v_agenda = cb_current_uia();
        }
        {
            SubLObject hint = user_interaction_agenda.ui_hint(action, v_agenda);
            if ((truncate.isInteger() && hint.isString()) && (NIL != list_utilities.lengthG(hint, truncate, UNPROVIDED))) {
                hint = cconcatenate(string_utilities.substring(hint, ZERO_INTEGER, truncate), $str_alt85$___);
            }
            if (hint.isString()) {
                html_utilities.html_princ(hint);
            } else {
                {
                    SubLObject boldP = NIL;
                    SubLObject cdolist_list_var = hint;
                    SubLObject hint_item = NIL;
                    for (hint_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hint_item = cdolist_list_var.first()) {
                        if (hint_item.isString()) {
                            if (NIL != boldP) {
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ(hint_item);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } else {
                                html_utilities.html_princ(hint_item);
                            }
                            boldP = NIL;
                        } else
                            if (hint_item == $TERM) {
                                boldP = T;
                            } else {
                                Errors.warn($str_alt87$_S_is_an_invalid_hint_specificati, hint_item);
                            }

                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_menu_based_launchers_guts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_draw_launchers_as_menu(v_agenda);
                            html_utilities.html_newline(ONE_INTEGER);
                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                            cb_uia_typein(NIL);
                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($UIA_LAUNCHERS, $str_alt88$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
            return v_agenda;
        }
    }

    public static final SubLObject cb_uia_draw_launchers_as_menu(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dhtml_macros.dhtml_header_stylesheet_links_for_devedge_menu();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt89$init____);
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != dhtml_macros.$dhtml_devedge_menu_class$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_devedge_menu_class$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    if (NIL != dhtml_macros.$dhtml_devedge_menu_system_class$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(dhtml_macros.$dhtml_devedge_menu_system_class$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject sections = cb_uia_launchers.cb_uia_launch_sections();
                                SubLObject list_var = NIL;
                                SubLObject section = NIL;
                                SubLObject counter = NIL;
                                for (list_var = sections, section = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , section = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                    {
                                        SubLObject launchers = cb_uia_launchers.cb_uia_launch_section_launchers(section);
                                        if (NIL != launchers) {
                                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                            if (NIL != dhtml_macros.$dhtml_devedge_submenu_class$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dhtml_macros.$dhtml_devedge_submenu_class$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_show_menu_based_launch_section(section, counter);
                                                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var = launchers;
                                                                SubLObject launcher = NIL;
                                                                for (launcher = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , launcher = cdolist_list_var.first()) {
                                                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_uia_show_menu_based_launcher(launcher);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            return v_agenda;
        }
    }

    public static final SubLObject cb_uia_show_menu_based_launch_section(SubLObject section, SubLObject counter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject section_name = cb_uia_launchers.cb_uia_launch_section_name(section);
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_white$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_white$.getDynamicValue(thread)));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        if (!counter.isZero()) {
                            html_utilities.html_glyph($NBSP, TWO_INTEGER);
                            html_utilities.html_princ($str_alt91$__);
                            html_utilities.html_glyph($NBSP, TWO_INTEGER);
                        }
                        html_utilities.html_princ(section_name);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            return section;
        }
    }

    public static final SubLObject cb_uia_show_menu_based_launcher(SubLObject launcher) {
        {
            SubLObject launcher_name = cb_uia_launchers.cb_uia_launcher_name(launcher);
            SubLObject applicableP = cb_uia_launcher_applicableP(launcher);
            if (NIL != applicableP) {
                if (applicableP == $DISABLED) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ(launcher_name);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                } else {
                    cb_uia_show_launcher_link(launcher, UNPROVIDED);
                }
            }
        }
        return launcher;
    }

    /**
     * Legacy launcher, controled by *cb-uia-use-menu-based-launchers?*
     */
    public static final SubLObject cb_uia_launchers_guts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_launchers_header();
                            {
                                SubLObject sections = cb_uia_launchers.cb_uia_launch_sections();
                                SubLObject cdolist_list_var = sections;
                                SubLObject section = NIL;
                                for (section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , section = cdolist_list_var.first()) {
                                    {
                                        SubLObject launchers = cb_uia_launchers.cb_uia_launch_section_launchers(section);
                                        SubLObject object_id = cb_uia_launcher_section_to_object_id(section);
                                        if (NIL != launchers) {
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt93$text_css);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$screen);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                                                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                                    html_utilities.html_markup($$$none);
                                                    dhtml_macros.dhtml_dom_attribute_postamble();
                                                    dhtml_macros.dhtml_dom_wrapper_postamble();
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                }
                                            }
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                            html_utilities.html_terpri(UNPROVIDED);
                                            cb_uia_show_launch_section(section, object_id);
                                            dhtml_macros.dhtml_set_visibility(object_id, $INVISIBLE, $TEXT);
                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                            if (NIL != object_id) {
                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(object_id);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var_22 = launchers;
                                                                SubLObject launcher = NIL;
                                                                for (launcher = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , launcher = cdolist_list_var_22.first()) {
                                                                    cb_uia_show_launcher(launcher);
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_launchers_header() {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Launchers);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        cb_utilities.cb_link($UIA_LAUNCHERS, $str_alt88$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @unknown the style needs to be done in a much better way
     */
    public static final SubLObject cb_uia_agenda_render_logo(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt99$position_absolute_bottom_1px_righ);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($CYC_LOGO_LARGE_VIOLET_FULL_URL));
                        SubLObject align = $CENTER;
                        SubLObject alt = (true) ? ((SubLObject) ($$$Kraken_by_Cycorp)) : cyc_file_dependencies.get_html_icon_alt_string($CYC_LOGO_LARGE_VIOLET_FULL_URL);
                        SubLObject border = ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            return v_agenda;
        }
    }

    public static final SubLObject cb_uia_render_small_logo(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($CYC_LOGO_LARGE_VIOLET_FULL_URL));
                SubLObject align = $CENTER;
                SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($CYC_LOGO_LARGE_VIOLET_FULL_URL);
                SubLObject border = ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_utilities.html_markup(html_macros.$html_image_height$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($$$19);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_image_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($$$20);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            return v_agenda;
        }
    }

    public static final SubLObject cb_uia_launcher_section_to_object_id(SubLObject section) {
        {
            SubLObject section_name = cb_uia_launchers.cb_uia_launch_section_name(section);
            return string_utilities.string_substitute($str_alt105$_, $str_alt106$_, string_utilities.copy_string(section_name), UNPROVIDED);
        }
    }

    public static final SubLObject cb_uia_show_launch_section(SubLObject section, SubLObject object_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject section_name = cb_uia_launchers.cb_uia_launch_section_name(section);
                SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
                SubLObject click_action = dhtml_macros.dhtml_visibility_generate_js_for_toggle(object_id);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(click_action);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ(section_name);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_launcher(SubLObject launcher) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject launcher_name = cb_uia_launchers.cb_uia_launcher_name(launcher);
                SubLObject applicableP = cb_uia_launcher_applicableP(launcher);
                SubLObject disabledP = eq(applicableP, $DISABLED);
                if (NIL != applicableP) {
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
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str_alt108$_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_glyph($NBSP, UNPROVIDED);
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
                                    if (NIL != disabledP) {
                                        html_utilities.html_princ(launcher_name);
                                    } else {
                                        cb_uia_show_launcher_link(launcher, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_launcher_link(SubLObject launcher, SubLObject link_text) {
        if (link_text == UNPROVIDED) {
            link_text = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject target = cb_uia_launchers.cb_uia_launcher_target(launcher);
                SubLObject displayed_link_text = (NIL != link_text) ? ((SubLObject) (link_text)) : cb_uia_launchers.cb_uia_launcher_name(launcher);
                if (NIL != target) {
                    {
                        SubLObject launcher_url = cb_uia_launchers.cb_uia_launcher_url(launcher);
                        SubLObject launcher_tip = cb_uia_launchers.cb_uia_launcher_tip(launcher);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_princ(launcher_url);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != launcher_tip) {
                            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(launcher_tip);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != target) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(target);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(displayed_link_text);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    {
                        SubLObject launcher_url = cb_uia_launchers.cb_uia_launcher_url(launcher);
                        SubLObject launcher_tip = cb_uia_launchers.cb_uia_launcher_tip(launcher);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        html_utilities.html_princ(launcher_url);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != launcher_tip) {
                            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(launcher_tip);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
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
                                html_utilities.html_princ(displayed_link_text);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Is this launcher appropriate for display to the user?
     *
     * @param LAUNCHER
     * 		a CB-UIA-LAUNCHER
     * @return T, nil, or :disabled
     */
    public static final SubLObject cb_uia_launcher_applicableP(SubLObject launcher) {
        {
            SubLObject applicableP = NIL;
            SubLObject v_agenda = cb_current_uia();
            SubLObject disabled = cb_uia_launchers.cb_uia_launcher_disabled(launcher);
            if (disabled == $DISABLED) {
                applicableP = $DISABLED;
            } else
                if ((disabled == $DISABLED_EXTERNAL) && (NIL != uima_interface_parameter_declaration.uia_external_use_assumptionsP(v_agenda))) {
                    applicableP = $DISABLED;
                } else {
                    {
                        SubLObject launcher_cycl = cb_uia_launchers.cb_uia_launcher_cycl(launcher);
                        SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                        SubLObject relevant_mts = (NIL != launcher_cycl) ? ((SubLObject) (backward.removal_ask_variable($sym111$_MT, listS($$toolRelevantToUIAEnvironment, launcher_cycl, $list_alt113), $$CycUIAMt, UNPROVIDED, UNPROVIDED))) : NIL;
                        if (!((NIL != relevant_mts) && (NIL != launcher_cycl))) {
                            applicableP = T;
                        } else
                            if (((NIL != launcher_cycl) && (NIL != relevant_mts)) && (NIL != intersection(genl_mts.all_spec_mts(domain_mt, UNPROVIDED, UNPROVIDED), relevant_mts, UNPROVIDED, UNPROVIDED))) {
                                applicableP = T;
                            }

                    }
                }

            return applicableP;
        }
    }

    public static final SubLObject cb_uia_handle_reply(SubLObject v_agenda, SubLObject reply) {
        user_interaction_agenda.handle_ui_reply(reply);
        return cb_uia_show_next_interaction(v_agenda);
    }

    /**
     * AGENDA figures out which interaction should go next.
     * Then that interaction is tasked with generating a request,
     * which it may handle itself or pass it off to another interaction.
     * Once a request is returned, it is rendered in HTML.
     */
    public static final SubLObject cb_uia_show_next_interaction(SubLObject v_agenda) {
        {
            SubLObject refresh_frames = $list_alt115;
            return cb_uia_show_next_interaction_with_refresh(v_agenda, refresh_frames);
        }
    }

    public static final SubLObject cb_uia_show_next_interaction_with_refresh(SubLObject v_agenda, SubLObject refresh_frames) {
        {
            SubLObject next = user_interaction_agenda.uia_next_action(v_agenda);
            return cb_uia_show_interaction(v_agenda, next, refresh_frames, UNPROVIDED);
        }
    }

    public static final SubLObject cb_uia_show_chosen_interaction(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject refresh_frames = NIL;
            return cb_uia_show_interaction(v_agenda, interaction, refresh_frames, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param INTERACTION;
     * 		user-interaction-p or NIL.
     */
    public static final SubLObject cb_uia_show_interaction(SubLObject v_agenda, SubLObject interaction, SubLObject refresh_frames, SubLObject hiding_supportP) {
        if (hiding_supportP == UNPROVIDED) {
            hiding_supportP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            if (NIL != refresh_frames) {
                cb_uia_refresh_frames_scripts(refresh_frames);
            }
            cb_uia_macros.cb_uiat_document_expiration();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            cb_uia_show_action_hint(interaction, NIL, v_agenda);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            dhtml_macros.dhtml_with_dom_script();
                            dhtml_macros.dhtml_with_toggle_visibility_support();
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            html_utilities.html_target_definition($$$top);
                            {
                                SubLObject display_method = cb_uia_display_method(interaction);
                                if (display_method.isFunctionSpec()) {
                                    funcall(display_method, interaction);
                                } else {
                                    {
                                        SubLObject request = user_interaction_agenda.uia_generate_request(v_agenda, interaction);
                                        SubLObject render_method = cb_uia_render_request_method(request);
                                        if (render_method.isFunctionSpec() && (NIL != user_interaction_agenda.ui_request_p(request))) {
                                            funcall(render_method, request);
                                        } else {
                                            user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                                            cb_uia_show_next_interaction(v_agenda);
                                        }
                                    }
                                }
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_title(SubLObject operator) {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(uia_tool_declaration.ui_operator_name(operator));
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_show_title_line(SubLObject operator) {
        cb_uia_show_title(operator);
        html_utilities.html_indent(TWO_INTEGER);
        html_utilities.html_newline(UNPROVIDED);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_uia_documentation_root$ = makeSymbol("*CB-UIA-DOCUMENTATION-ROOT*");

    public static final SubLObject cb_uia_show_interaction_preamble(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != interaction) {
                if (NIL != cb_uia_use_menu_based_launchers_p()) {
                    cb_uia_draw_launchers_as_menu(user_interaction_agenda.ui_agenda(interaction));
                }
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_utilities.cb_link($UIA_CHOOSE_INTERACTION, interaction, $str_alt88$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt119$_Reject_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_utilities.cb_link($REPORT_PROBLEM, interaction, $str_alt121$_Report_Problem_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_indent(TWO_INTEGER);
                                        if (NIL != uima_interface_parameter_declaration.uia_show_debug_linksP(user_interaction_agenda.ui_agenda(interaction))) {
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            cb_utilities.cb_link($UIA_DEBUG_INTERACTION, interaction, $str_alt122$_Debug_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_indent(TWO_INTEGER);
                                        }
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($cb_uia_documentation_root$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$documentation);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt124$_Documentation_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(FOUR_INTEGER);
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
                                        cb_uia_show_ancestor_interactions(interaction);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject preamble_method = user_interaction_agenda.ui_state_lookup(interaction, $PREAMBLE_METHOD, UNPROVIDED);
                    if (preamble_method.isFunctionSpec()) {
                        funcall(preamble_method, interaction);
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uia_show_ancestor_interactions(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ancestors = cb_uia_ancestor_interactions(interaction);
                if (NIL != ancestors) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
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
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject object_id = cconcatenate($str_alt126$show_interaction_context_, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)));
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt93$text_css);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$screen);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                                                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                                    html_utilities.html_markup($$$none);
                                                    dhtml_macros.dhtml_dom_attribute_postamble();
                                                    dhtml_macros.dhtml_dom_wrapper_postamble();
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                }
                                            }
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                            html_utilities.html_terpri(UNPROVIDED);
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
                                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt128$Context_);
                                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt129$);
                                                                            html_utilities.html_indent(TWO_INTEGER);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
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
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                    if (NIL != object_id) {
                                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(object_id);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject list_var = NIL;
                                                                        SubLObject ancestor = NIL;
                                                                        SubLObject index = NIL;
                                                                        for (list_var = ancestors, ancestor = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ancestor = list_var.first() , index = add(ONE_INTEGER, index)) {
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
                                                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    cb_uia_agenda_show_action(v_agenda, ancestor, number_utilities.f_1X(index));
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_ancestor_interactions(SubLObject interaction) {
        if (NIL != user_interaction_agenda.ui_parent_interaction(interaction)) {
            return user_interaction_agenda.ui_ancestor_interactions(interaction);
        } else
            if (NIL != user_interaction_agenda.ui_virtual_parent_interaction(interaction)) {
                return user_interaction_agenda.ui_virtual_ancestor_interactions(interaction);
            }

        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_uia_interaction_watermark$ = makeSymbol("*CB-UIA-INTERACTION-WATERMARK*");

    public static final SubLObject cb_uia_add_interaction_watermark(SubLObject interaction) {
        {
            SubLObject ui_signature = user_interaction_agenda.ui_signature(interaction);
            html_utilities.html_hidden_input($cb_uia_interaction_watermark$.getGlobalValue(), string_utilities.to_string(ui_signature), UNPROVIDED);
        }
        return interaction;
    }

    public static final SubLObject cb_uia_obtain_interaction_from_watermark(SubLObject args) {
        {
            SubLObject watermark = html_utilities.html_extract_input($cb_uia_interaction_watermark$.getGlobalValue(), args);
            if (watermark.isString() && (NIL == string_utilities.empty_string_p(watermark))) {
                {
                    SubLObject ui_signature = read_from_string_ignoring_errors(watermark, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != user_interaction_agenda.ui_signature_p(ui_signature)) {
                        return user_interaction_agenda.find_ui_by_signature(ui_signature);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_obtain_agenda_from_watermark(SubLObject args) {
        {
            SubLObject interaction = cb_uia_obtain_interaction_from_watermark(args);
            if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                return user_interaction_agenda.ui_agenda(interaction);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_obtain_meta_agenda_from_watermark(SubLObject args) {
        {
            SubLObject v_agenda = cb_uia_obtain_agenda_from_watermark(args);
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                return user_interaction_agenda.uia_meta_agenda(v_agenda);
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cb_uia_say_this_cols$ = makeSymbol("*CB-UIA-SAY-THIS-COLS*");

    // defparameter
    public static final SubLSymbol $cb_uia_say_this_rows$ = makeSymbol("*CB-UIA-SAY-THIS-ROWS*");

    public static final SubLObject cb_uia_typein_guts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != uia_setup_state.uia_setup_completeP(v_agenda)) {
                                {
                                    SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
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
                                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt132$cb_uia_handle_uia_typein, T, UNPROVIDED);
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
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_render_small_logo(v_agenda);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$message, NIL, $cb_uia_say_this_cols$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_submit_input($$$Say_This, UNPROVIDED, UNPROVIDED);
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
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                            }
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_copyright_notice();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_handle_uia_typein(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            SubLObject message = html_utilities.html_extract_input($$$message, args);
            user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $COMMAND_INTERACTION, list(message), UNPROVIDED);
            {
                SubLObject refresh_frames = $list_alt138;
                return cb_uia_show_next_interaction_with_refresh(v_agenda, refresh_frames);
            }
        }
    }

    public static final SubLObject cb_uia_agenda_guts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_uia_agenda_snapshot_signature(v_agenda);
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_emit_other_refreshers(v_agenda);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($$$Agenda_Summary);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_indent(TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            cb_utilities.cb_link($UIA_AGENDA, $str_alt88$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(UNPROVIDED);
                            cb_utilities.cb_link($UIA_RESET, $str_alt142$_Reset_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(UNPROVIDED);
                            cb_uia_show_mumble_window(v_agenda);
                            html_utilities.html_indent(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                            cb_uia_agenda_show_topic(v_agenda);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_uia_agenda_show_next(v_agenda);
                            cb_uia_agenda_show_undos(v_agenda);
                            cb_uia_agenda_show_history(v_agenda);
                            cb_uia_agenda_show_comments(v_agenda);
                            cb_uia_agenda_show_messages(v_agenda);
                            cb_uia_agenda_show_requirements(v_agenda);
                            cb_uia_agenda_show_relevant_suggestions(v_agenda);
                            cb_uia_agenda_show_possible_suggestions(v_agenda);
                            cb_uia_agenda_show_color_key(v_agenda);
                            cb_uia_agenda_render_logo(v_agenda);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_mumble_window(SubLObject v_agenda) {
        {
            SubLObject my_thoughts = $str_alt143$_My_Thoughts_;
            if (NIL != user_interaction_agenda.uia_can_treat_comments_as_mumblingP()) {
                cb_utilities.cb_link($UIA_OPEN_MUMBLE_WINDOW, my_thoughts, v_agenda, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                html_utilities.html_princ(my_thoughts);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_topic(SubLObject v_agenda) {
        cb_uia_agenda_show_current_topic(v_agenda);
        cb_uia_agenda_show_other_agendas(v_agenda);
        return v_agenda;
    }

    public static final SubLObject cb_uia_agenda_show_current_topic(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                try {
                    rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                    rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject topic = user_interaction_agenda.uia_give_current_topic_and_name(v_agenda);
                        SubLObject topic_name = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (!(($UNDETERMINED == topic) || (NIL == uia_setup_state.uia_setup_completeP(v_agenda)))) {
                            html_utilities.html_princ_strong($str_alt147$Topic___);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_uia_display_primitives.cb_uia_show_term(topic, topic_name);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                        }
                    }
                } finally {
                    rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                    rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_show_other_agendas(SubLObject v_agenda) {
        {
            SubLObject meta_agenda = user_interaction_agenda.uia_meta_agenda(v_agenda);
            SubLObject open_agendas = user_interaction_agenda.uima_open_agendas_sequence(meta_agenda);
            if (NIL != find(v_agenda, open_agendas, symbol_function(NOT_EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                cb_utilities.cb_link($UIA_SPECIFY_TOPIC, $str_alt150$_More_Topics_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_next(SubLObject v_agenda) {
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt48$_Next_, NIL, NIL, NIL, NIL);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        html_utilities.html_indent(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_undos(SubLObject v_agenda) {
        if (NIL != user_interaction_agenda.uia_some_undo_p(v_agenda)) {
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt151$_Undo_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_history(SubLObject v_agenda) {
        if (NIL != user_interaction_agenda.uia_some_history_p(v_agenda)) {
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_utilities.cb_link($UIA_KNOWLEDGE_JOURNAL, $str_alt153$_Journal_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_comments(SubLObject v_agenda) {
        if (NIL != user_interaction_agenda.uia_some_comment_p(v_agenda)) {
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_utilities.cb_link($UIA_COMMENTS, $str_alt155$_Comments_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_messages(SubLObject v_agenda) {
        if (NIL != user_interaction_agenda.uia_some_message_p(v_agenda)) {
            {
                SubLObject actions = user_interaction_agenda.uia_message_sequence(v_agenda);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt156$Messages__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                {
                    SubLObject cdolist_list_var = actions;
                    SubLObject action = NIL;
                    for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                        cb_uia_agenda_show_message(v_agenda, action);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_message(SubLObject v_agenda, SubLObject action) {
        html_utilities.html_indent(UNPROVIDED);
        return cb_uia_show_action_link(action);
    }

    public static final SubLObject cb_uia_agenda_show_requirements(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.uia_some_requirement_p(v_agenda)) {
                {
                    SubLObject actions = user_interaction_agenda.uia_requirement_sequence(v_agenda);
                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt157$Essential_Steps__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    {
                        SubLObject pending_actions = remove($PENDING, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject blocked_actions = remove($BLOCKED, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt159$98_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = pending_actions;
                                    SubLObject action = NIL;
                                    for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                        cb_uia_agenda_show_pending_action(v_agenda, action);
                                    }
                                }
                                if (NIL != blocked_actions) {
                                    {
                                        SubLObject cdolist_list_var = blocked_actions;
                                        SubLObject action = NIL;
                                        for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                            cb_uia_agenda_show_blocked_action(v_agenda, action);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_show_relevant_suggestions(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.uia_some_relevant_suggestion_p(v_agenda)) {
                {
                    SubLObject actions = user_interaction_agenda.uia_relevant_suggestion_sequence(v_agenda);
                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt160$Relevant_Suggestions__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    {
                        SubLObject pending_actions = remove($PENDING, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject blocked_actions = remove($BLOCKED, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt159$98_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = pending_actions;
                                    SubLObject action = NIL;
                                    for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                        cb_uia_agenda_show_pending_action(v_agenda, action);
                                    }
                                }
                                if (NIL != blocked_actions) {
                                    {
                                        SubLObject cdolist_list_var = blocked_actions;
                                        SubLObject action = NIL;
                                        for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                            cb_uia_agenda_show_blocked_action(v_agenda, action);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_show_possible_suggestions(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.uia_some_possible_suggestion_p(v_agenda)) {
                {
                    SubLObject actions = user_interaction_agenda.uia_possible_suggestion_sequence(v_agenda);
                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt161$Possible_Suggestions__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    {
                        SubLObject pending_actions = remove($PENDING, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject blocked_actions = remove($BLOCKED, actions, symbol_function(NOT_EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt159$98_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = pending_actions;
                                    SubLObject action = NIL;
                                    for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                        cb_uia_agenda_show_pending_action(v_agenda, action);
                                    }
                                }
                                if (NIL != blocked_actions) {
                                    {
                                        SubLObject cdolist_list_var = blocked_actions;
                                        SubLObject action = NIL;
                                        for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                            cb_uia_agenda_show_blocked_action(v_agenda, action);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_agenda_show_pending_action(SubLObject v_agenda, SubLObject action) {
        return cb_uia_agenda_show_action(v_agenda, action, UNPROVIDED);
    }

    public static final SubLObject cb_uia_agenda_show_blocked_action(SubLObject v_agenda, SubLObject action) {
        return cb_uia_agenda_show_action(v_agenda, action, UNPROVIDED);
    }

    public static final SubLObject cb_uia_agenda_show_action(SubLObject v_agenda, SubLObject action, SubLObject indent_depth) {
        if (indent_depth == UNPROVIDED) {
            indent_depth = ZERO_INTEGER;
        }
        cb_uia_show_action(action, $TABULATED, indent_depth);
        return NIL;
    }

    public static final SubLObject cb_uia_agenda_show_color_key(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != user_interaction_agenda.uia_requirement_sequence(v_agenda)) || (NIL != user_interaction_agenda.uia_relevant_suggestion_sequence(v_agenda))) || (NIL != user_interaction_agenda.uia_possible_suggestion_sequence(v_agenda))) {
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Color_Key);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_style_background_color($GREEN);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt164$_XX_);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt165$_Can_be_done_immediately);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_style_background_color($YELLOW);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt164$_XX_);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt166$_No_user_action_required);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_style_background_color($MEDIUM_RED);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt164$_XX_);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt167$_Presently_blocked);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_emit_other_refreshers(SubLObject v_agenda) {
        {
            SubLObject frames_to_refresh = user_interaction_agenda.uia_get_frames_scheduled_for_refresh(v_agenda);
            cb_uia_refresh_frames_scripts(frames_to_refresh);
        }
        return v_agenda;
    }

    public static final SubLObject cb_uia_render_request_method(SubLObject request) {
        {
            SubLObject operator = request.first();
            return cb_uia_tool_declaration.cb_uia_operator_render_request_method(operator);
        }
    }

    public static final SubLObject cb_uia_display_method(SubLObject interaction) {
        {
            SubLObject v_agenda = cb_current_uia();
            return cb_uia_tool_declaration.cb_uia_operator_display_method(NIL != interaction ? ((SubLObject) (user_interaction_agenda.ui_operator(interaction))) : user_interaction_agenda.uia_default_operator(v_agenda));
        }
    }

    public static final SubLObject cb_uia_reset(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            uia_tools_basic.uia_act_new_reset_agenda(v_agenda);
            return cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_reset(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt142$_Reset_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt169$cb_uia_reset);
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

    public static final SubLObject cb_uia_complete_interaction(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    return cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt52);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_complete_interaction(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
            if (NIL == linktext) {
                linktext = $str_alt173$_Continue_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt174$cb_uia_complete_interaction__A, user_interaction_agenda.ui_id(interaction));
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

    public static final SubLObject cb_uia_reject_interaction(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    user_interaction_agenda.uia_act_reject(v_agenda, interaction);
                    return cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt52);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_reject_interaction(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
            if (NIL == linktext) {
                linktext = $str_alt119$_Reject_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt178$cb_uia_reject_interaction__A, user_interaction_agenda.ui_id(interaction));
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

    public static final SubLObject cb_uia_comments(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_current_uia();
                SubLObject actions = user_interaction_agenda.uia_comment_sequence(v_agenda);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Comments);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_COMMENTS, $str_alt88$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_FORGET_COMMENTS, $str_alt182$_Forget_All_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                {
                                    SubLObject index = length(actions);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (NIL == actions) {
                                                                html_utilities.html_princ($str_alt183$I_have_no_comments_);
                                                            } else
                                                                if (NIL != list_utilities.singletonP(actions)) {
                                                                    html_utilities.html_princ($str_alt184$I_have_1_comment_);
                                                                } else {
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt185$I_have__S_comments_, index);
                                                                }

                                                            html_utilities.html_newline(TWO_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var = reverse(actions);
                                                SubLObject action = NIL;
                                                for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = user_interaction_agenda.ui_args(action);
                                                        SubLObject current = datum;
                                                        SubLObject message = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt186);
                                                        message = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ(index);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_uia_tools_basic.cb_uiat_show_message_string(message);
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt186);
                                                        }
                                                    }
                                                    index = subtract(index, ONE_INTEGER);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
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

    public static final SubLObject cb_link_uia_comments(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt155$_Comments_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt188$cb_uia_comments);
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

    public static final SubLObject cb_link_uia_forget_comments(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt182$_Forget_All_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt190$cb_uia_forget_comments);
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

    public static final SubLObject cb_uia_forget_comments(SubLObject args) {
        {
            SubLObject v_agenda = cb_current_uia();
            user_interaction_agenda.uia_act_clear_comments(v_agenda);
        }
        return cb_uia_comments(args);
    }

    public static final SubLObject cb_uia_html_encode(SubLObject v_agenda, SubLObject v_object) {
        {
            SubLObject header_char = CHAR_question;
            SubLObject string = $str_alt129$;
            if (NIL != constant_handles.constant_p(v_object)) {
                header_char = CHAR_f;
                string = cb_utilities.cb_string_for_fort(v_object);
            } else
                if (v_object.isInteger()) {
                    header_char = CHAR_i;
                    string = string_utilities.str(v_object);
                } else
                    if (v_object.isString()) {
                        header_char = CHAR_s;
                        string = v_object;
                    } else
                        if (NIL != user_interaction_agenda.user_interaction_p(v_object)) {
                            header_char = CHAR_u;
                            string = string_utilities.str(user_interaction_agenda.ui_id(v_object));
                        } else
                            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_object)) {
                                header_char = CHAR_a;
                                string = string_utilities.str(user_interaction_agenda.uia_id(v_object));
                            } else
                                if (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object)) {
                                    header_char = CHAR_m;
                                    string = string_utilities.str(user_interaction_agenda.uima_id(v_object));
                                } else {
                                    header_char = CHAR_z;
                                    string = string_utilities.str(user_interaction_agenda.uia_glob_add(v_agenda, v_object));
                                }





            return cconcatenate(string_utilities.str(header_char), string);
        }
    }

    public static final SubLObject cb_uia_html_decode(SubLObject v_agenda, SubLObject string) {
        if (string == NIL) {
            return NIL;
        }
        {
            SubLObject header_char = Strings.sublisp_char(string, ZERO_INTEGER);
            SubLObject data_string = string_utilities.substring(string, ONE_INTEGER, UNPROVIDED);
            SubLObject v_object = NIL;
            SubLObject pcase_var = header_char;
            if (pcase_var.eql(CHAR_f)) {
                v_object = cb_utilities.cb_guess_fort(data_string, UNPROVIDED);
            } else
                if (pcase_var.eql(CHAR_i)) {
                    v_object = parse_integer(data_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql(CHAR_s)) {
                        v_object = data_string;
                    } else
                        if (pcase_var.eql(CHAR_a)) {
                            v_object = user_interaction_agenda.uima_find_by_id_string(cb_current_uima(), data_string);
                        } else
                            if (pcase_var.eql(CHAR_m)) {
                                v_object = user_interaction_agenda.uimma_resolve_meta_agenda_id(parse_integer(data_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            } else
                                if (pcase_var.eql(CHAR_u)) {
                                    v_object = user_interaction_agenda.uia_find_by_id_string(v_agenda, data_string);
                                } else
                                    if (pcase_var.eql(CHAR_z)) {
                                        v_object = user_interaction_agenda.uia_glob_lookup_by_id_string(v_agenda, data_string, UNPROVIDED);
                                    }






            return v_object;
        }
    }

    public static final SubLObject cb_uia_html_decode_args(SubLObject v_agenda, SubLObject args) {
        {
            SubLObject decoded_args = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                decoded_args = cons(cb_uia_html_decode(v_agenda, arg), decoded_args);
            }
            return nreverse(decoded_args);
        }
    }

    public static final SubLObject declare_cb_user_interaction_agenda_file() {
        declareFunction("cb_current_uima", "CB-CURRENT-UIMA", 0, 0, false);
        declareFunction("cb_current_uia", "CB-CURRENT-UIA", 0, 0, false);
        declareFunction("execute_within_uima_of_interaction", "EXECUTE-WITHIN-UIMA-OF-INTERACTION", 3, 0, false);
        declareFunction("switch_to_specified_uima_uia_tuple", "SWITCH-TO-SPECIFIED-UIMA-UIA-TUPLE", 2, 0, false);
        declareFunction("cb_uia_complete_restart", "CB-UIA-COMPLETE-RESTART", 1, 0, false);
        declareFunction("cb_uia_ensure_initialized", "CB-UIA-ENSURE-INITIALIZED", 0, 0, false);
        declareFunction("cb_uia_initialize", "CB-UIA-INITIALIZE", 1, 0, false);
        declareFunction("cb_uia_new_focal_agenda", "CB-UIA-NEW-FOCAL-AGENDA", 0, 0, false);
        declareFunction("cb_uia_start", "CB-UIA-START", 0, 1, false);
        declareFunction("ensure_cb_uia_application_server_initialized", "ENSURE-CB-UIA-APPLICATION-SERVER-INITIALIZED", 0, 0, false);
        declareFunction("cb_uia_application_title", "CB-UIA-APPLICATION-TITLE", 0, 1, false);
        declareFunction("cb_uia_emit_frames_separated", "CB-UIA-EMIT-FRAMES-SEPARATED", 0, 0, false);
        declareFunction("cb_uia_emit_new_frame_format", "CB-UIA-EMIT-NEW-FRAME-FORMAT", 0, 0, false);
        declareFunction("cb_link_uia_start", "CB-LINK-UIA-START", 0, 2, false);
        declareFunction("cb_link_uia_launcher", "CB-LINK-UIA-LAUNCHER", 0, 1, false);
        declareFunction("cb_uia_use_menu_based_launchers_p", "CB-UIA-USE-MENU-BASED-LAUNCHERS-P", 0, 0, false);
        declareFunction("cb_uia_launchers", "CB-UIA-LAUNCHERS", 0, 1, false);
        declareFunction("cb_link_uia_launchers", "CB-LINK-UIA-LAUNCHERS", 0, 1, false);
        declareFunction("cb_uia_interaction", "CB-UIA-INTERACTION", 0, 1, false);
        declareFunction("cb_uia_next_interaction", "CB-UIA-NEXT-INTERACTION", 0, 1, false);
        declareFunction("cb_link_uia_next_interaction", "CB-LINK-UIA-NEXT-INTERACTION", 0, 1, false);
        declareFunction("get_uia_next_interaction_function", "GET-UIA-NEXT-INTERACTION-FUNCTION", 0, 0, false);
        declareFunction("cb_uia_choose_interaction", "CB-UIA-CHOOSE-INTERACTION", 1, 0, false);
        declareFunction("cb_link_uia_choose_interaction", "CB-LINK-UIA-CHOOSE-INTERACTION", 1, 1, false);
        declareFunction("cb_uia_typein", "CB-UIA-TYPEIN", 0, 1, false);
        declareFunction("cb_link_uia_typein", "CB-LINK-UIA-TYPEIN", 0, 1, false);
        declareFunction("cb_uia_agenda", "CB-UIA-AGENDA", 0, 1, false);
        declareFunction("cb_link_uia_agenda", "CB-LINK-UIA-AGENDA", 0, 1, false);
        declareFunction("cb_uia_refresh_frames_scripts", "CB-UIA-REFRESH-FRAMES-SCRIPTS", 1, 0, false);
        declareFunction("cb_uia_string_quotify", "CB-UIA-STRING-QUOTIFY", 1, 0, false);
        declareFunction("construct_cb_uia_frame_refresh_script", "CONSTRUCT-CB-UIA-FRAME-REFRESH-SCRIPT", 1, 0, false);
        declareFunction("cb_uia_launchers_refresh_script", "CB-UIA-LAUNCHERS-REFRESH-SCRIPT", 0, 0, false);
        declareFunction("cb_uia_command_interpreter_refresh_script", "CB-UIA-COMMAND-INTERPRETER-REFRESH-SCRIPT", 0, 0, false);
        declareFunction("cb_uia_agenda_refresh_script", "CB-UIA-AGENDA-REFRESH-SCRIPT", 0, 0, false);
        declareFunction("cb_uia_interaction_refresh_script", "CB-UIA-INTERACTION-REFRESH-SCRIPT", 0, 0, false);
        declareFunction("cb_uia_agenda_refresh", "CB-UIA-AGENDA-REFRESH", 0, 1, false);
        declareFunction("cb_uia_agenda_snapshot_signature", "CB-UIA-AGENDA-SNAPSHOT-SIGNATURE", 1, 0, false);
        declareFunction("construct_cb_uia_agenda_snapshot_signature_check_template", "CONSTRUCT-CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK-TEMPLATE", 2, 0, false);
        declareFunction("cb_uia_agenda_snapshot_signature_check", "CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK", 1, 0, false);
        declareFunction("uia_agenda_snapshot_signature", "UIA-AGENDA-SNAPSHOT-SIGNATURE", 1, 0, false);
        declareFunction("cb_uia_noop", "CB-UIA-NOOP", 0, 1, false);
        declareFunction("cb_uia_show_action", "CB-UIA-SHOW-ACTION", 1, 2, false);
        declareFunction("cb_uia_render_action_link", "CB-UIA-RENDER-ACTION-LINK", 1, 0, false);
        declareFunction("cb_uia_render_action_description", "CB-UIA-RENDER-ACTION-DESCRIPTION", 1, 1, false);
        declareFunction("cb_uia_show_action_link", "CB-UIA-SHOW-ACTION-LINK", 1, 0, false);
        declareFunction("cb_uia_show_action_linktext", "CB-UIA-SHOW-ACTION-LINKTEXT", 1, 0, false);
        declareFunction("cb_uia_show_action_hint", "CB-UIA-SHOW-ACTION-HINT", 1, 2, false);
        declareFunction("cb_uia_menu_based_launchers_guts", "CB-UIA-MENU-BASED-LAUNCHERS-GUTS", 1, 0, false);
        declareFunction("cb_uia_draw_launchers_as_menu", "CB-UIA-DRAW-LAUNCHERS-AS-MENU", 1, 0, false);
        declareFunction("cb_uia_show_menu_based_launch_section", "CB-UIA-SHOW-MENU-BASED-LAUNCH-SECTION", 2, 0, false);
        declareFunction("cb_uia_show_menu_based_launcher", "CB-UIA-SHOW-MENU-BASED-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launchers_guts", "CB-UIA-LAUNCHERS-GUTS", 1, 0, false);
        declareFunction("cb_uia_launchers_header", "CB-UIA-LAUNCHERS-HEADER", 0, 0, false);
        declareFunction("cb_uia_agenda_render_logo", "CB-UIA-AGENDA-RENDER-LOGO", 1, 0, false);
        declareFunction("cb_uia_render_small_logo", "CB-UIA-RENDER-SMALL-LOGO", 1, 0, false);
        declareFunction("cb_uia_launcher_section_to_object_id", "CB-UIA-LAUNCHER-SECTION-TO-OBJECT-ID", 1, 0, false);
        declareFunction("cb_uia_show_launch_section", "CB-UIA-SHOW-LAUNCH-SECTION", 2, 0, false);
        declareFunction("cb_uia_show_launcher", "CB-UIA-SHOW-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_show_launcher_link", "CB-UIA-SHOW-LAUNCHER-LINK", 1, 1, false);
        declareFunction("cb_uia_launcher_applicableP", "CB-UIA-LAUNCHER-APPLICABLE?", 1, 0, false);
        declareFunction("cb_uia_handle_reply", "CB-UIA-HANDLE-REPLY", 2, 0, false);
        declareFunction("cb_uia_show_next_interaction", "CB-UIA-SHOW-NEXT-INTERACTION", 1, 0, false);
        declareFunction("cb_uia_show_next_interaction_with_refresh", "CB-UIA-SHOW-NEXT-INTERACTION-WITH-REFRESH", 2, 0, false);
        declareFunction("cb_uia_show_chosen_interaction", "CB-UIA-SHOW-CHOSEN-INTERACTION", 2, 0, false);
        declareFunction("cb_uia_show_interaction", "CB-UIA-SHOW-INTERACTION", 3, 1, false);
        declareFunction("cb_uia_show_title", "CB-UIA-SHOW-TITLE", 1, 0, false);
        declareFunction("cb_uia_show_title_line", "CB-UIA-SHOW-TITLE-LINE", 1, 0, false);
        declareFunction("cb_uia_show_interaction_preamble", "CB-UIA-SHOW-INTERACTION-PREAMBLE", 1, 0, false);
        declareFunction("cb_uia_show_ancestor_interactions", "CB-UIA-SHOW-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction("cb_uia_ancestor_interactions", "CB-UIA-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction("cb_uia_add_interaction_watermark", "CB-UIA-ADD-INTERACTION-WATERMARK", 1, 0, false);
        declareFunction("cb_uia_obtain_interaction_from_watermark", "CB-UIA-OBTAIN-INTERACTION-FROM-WATERMARK", 1, 0, false);
        declareFunction("cb_uia_obtain_agenda_from_watermark", "CB-UIA-OBTAIN-AGENDA-FROM-WATERMARK", 1, 0, false);
        declareFunction("cb_uia_obtain_meta_agenda_from_watermark", "CB-UIA-OBTAIN-META-AGENDA-FROM-WATERMARK", 1, 0, false);
        declareFunction("cb_uia_typein_guts", "CB-UIA-TYPEIN-GUTS", 1, 0, false);
        declareFunction("cb_uia_handle_uia_typein", "CB-UIA-HANDLE-UIA-TYPEIN", 1, 0, false);
        declareFunction("cb_uia_agenda_guts", "CB-UIA-AGENDA-GUTS", 1, 0, false);
        declareFunction("cb_uia_show_mumble_window", "CB-UIA-SHOW-MUMBLE-WINDOW", 1, 0, false);
        declareFunction("cb_uia_agenda_show_topic", "CB-UIA-AGENDA-SHOW-TOPIC", 1, 0, false);
        declareFunction("cb_uia_agenda_show_current_topic", "CB-UIA-AGENDA-SHOW-CURRENT-TOPIC", 1, 0, false);
        declareFunction("cb_uia_agenda_show_other_agendas", "CB-UIA-AGENDA-SHOW-OTHER-AGENDAS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_next", "CB-UIA-AGENDA-SHOW-NEXT", 1, 0, false);
        declareFunction("cb_uia_agenda_show_undos", "CB-UIA-AGENDA-SHOW-UNDOS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_history", "CB-UIA-AGENDA-SHOW-HISTORY", 1, 0, false);
        declareFunction("cb_uia_agenda_show_comments", "CB-UIA-AGENDA-SHOW-COMMENTS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_messages", "CB-UIA-AGENDA-SHOW-MESSAGES", 1, 0, false);
        declareFunction("cb_uia_agenda_show_message", "CB-UIA-AGENDA-SHOW-MESSAGE", 2, 0, false);
        declareFunction("cb_uia_agenda_show_requirements", "CB-UIA-AGENDA-SHOW-REQUIREMENTS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_relevant_suggestions", "CB-UIA-AGENDA-SHOW-RELEVANT-SUGGESTIONS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_possible_suggestions", "CB-UIA-AGENDA-SHOW-POSSIBLE-SUGGESTIONS", 1, 0, false);
        declareFunction("cb_uia_agenda_show_pending_action", "CB-UIA-AGENDA-SHOW-PENDING-ACTION", 2, 0, false);
        declareFunction("cb_uia_agenda_show_blocked_action", "CB-UIA-AGENDA-SHOW-BLOCKED-ACTION", 2, 0, false);
        declareFunction("cb_uia_agenda_show_action", "CB-UIA-AGENDA-SHOW-ACTION", 2, 1, false);
        declareFunction("cb_uia_agenda_show_color_key", "CB-UIA-AGENDA-SHOW-COLOR-KEY", 1, 0, false);
        declareFunction("cb_uia_emit_other_refreshers", "CB-UIA-EMIT-OTHER-REFRESHERS", 1, 0, false);
        declareFunction("cb_uia_render_request_method", "CB-UIA-RENDER-REQUEST-METHOD", 1, 0, false);
        declareFunction("cb_uia_display_method", "CB-UIA-DISPLAY-METHOD", 1, 0, false);
        declareFunction("cb_uia_reset", "CB-UIA-RESET", 1, 0, false);
        declareFunction("cb_link_uia_reset", "CB-LINK-UIA-RESET", 0, 1, false);
        declareFunction("cb_uia_complete_interaction", "CB-UIA-COMPLETE-INTERACTION", 1, 0, false);
        declareFunction("cb_link_uia_complete_interaction", "CB-LINK-UIA-COMPLETE-INTERACTION", 1, 1, false);
        declareFunction("cb_uia_reject_interaction", "CB-UIA-REJECT-INTERACTION", 1, 0, false);
        declareFunction("cb_link_uia_reject_interaction", "CB-LINK-UIA-REJECT-INTERACTION", 1, 1, false);
        declareFunction("cb_uia_comments", "CB-UIA-COMMENTS", 0, 1, false);
        declareFunction("cb_link_uia_comments", "CB-LINK-UIA-COMMENTS", 0, 1, false);
        declareFunction("cb_link_uia_forget_comments", "CB-LINK-UIA-FORGET-COMMENTS", 0, 1, false);
        declareFunction("cb_uia_forget_comments", "CB-UIA-FORGET-COMMENTS", 1, 0, false);
        declareFunction("cb_uia_html_encode", "CB-UIA-HTML-ENCODE", 2, 0, false);
        declareFunction("cb_uia_html_decode", "CB-UIA-HTML-DECODE", 2, 0, false);
        declareFunction("cb_uia_html_decode_args", "CB-UIA-HTML-DECODE-ARGS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_user_interaction_agenda_file() {
        deflexical("*CB-UIA-SHOW-CYCL?*", NIL != boundp($sym0$_CB_UIA_SHOW_CYCL__) ? ((SubLObject) ($cb_uia_show_cyclP$.getGlobalValue())) : NIL);
        defvar("*CB-CURRENT-UIMA*", NIL);
        defparameter("*CB-UIA-APPLICATION-SERVER*", NIL);
        defparameter("*CB-UIA-USE-MENU-BASED-LAUNCHERS?*", T);
        deflexical("*CB-UIA-FRAME-MARKER*", $str_alt66$_FRAME_);
        deflexical("*CB-UIA-FRAME-REFRESH-SCRIPT-TEMPLATE*", $str_alt67$self_parent_frames__FRAME___locat);
        deflexical("*CB-UIA-LAUNCHERS-REFRESH-SCRIPT*", NIL);
        deflexical("*CB-UIA-COMMAND-INTERPRETER-REFRESH-SCRIPT*", NIL);
        deflexical("*CB-UIA-AGENDA-REFRESH-SCRIPT*", NIL);
        deflexical("*CB-UIA-INTERACTION-REFRESH-SCRIPT*", NIL);
        deflexical("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-TEMPLATE*", $str_alt70$_var_uia_meta_agenda_id______A__v);
        deflexical("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-PARAM*", $str_alt71$_AGENDA_);
        deflexical("*CB-UIA-AGENDA-REFRESH-SNAPSHOT-SIGNATURE-PARAM*", $str_alt72$_REFRESH_);
        deflexical("*CB-UIA-AGENDA-REFRESH-TIMEOUT-PARAM*", $str_alt73$_TIMEOUT_);
        deflexical("*CB-UIA-AGENDA-REFRESH-TIMEOUT*", $int$1000);
        deflexical("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK-TEMPLATE*", $str_alt75$_function_uia_agenda_snapshot_sig);
        deflexical("*CB-UIA-AGENDA-SNAPSHOT-SIGNATURE-CHECK-SCRIPT*", NIL);
        deflexical("*CB-UIA-DOCUMENTATION-ROOT*", $str_alt117$_cycdoc_rkf_training_docs_kraken_);
        deflexical("*CB-UIA-INTERACTION-WATERMARK*", $str_alt130$UIA_WATERMARK);
        defparameter("*CB-UIA-SAY-THIS-COLS*", $int$55);
        defparameter("*CB-UIA-SAY-THIS-ROWS*", THREE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_cb_user_interaction_agenda_file() {
                subl_macro_promotions.declare_defglobal($sym0$_CB_UIA_SHOW_CYCL__);
        utilities_macros.register_html_state_variable($cb_current_uima$);
        cb_utilities.register_cb_frame($UIA_LAUNCHERS, $str_alt3$uia_launchers, $str_alt4$cb_uia_launchers, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_utilities.register_cb_frame($UIA_INTERACTION, $str_alt6$uia_interaction, $str_alt7$cb_uia_interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_utilities.register_cb_frame($UIA_TYPEIN, $str_alt9$uia_typein, $str_alt10$cb_uia_typein, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_utilities.register_cb_frame($UIA_AGENDA, $str_alt12$uia_agenda, $str_alt13$cb_uia_agenda, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_utilities.register_cb_frame($UIA_AGENDA_REFRESH, $str_alt15$uia_agenda_refresh, $str_alt16$cb_uia_agenda_refresh, NIL, NIL, NIL);
        cb_utilities.register_cb_frame($UIA_NOOP, $str_alt18$uia_noop, $str_alt19$cb_uia_noop, NIL, NIL, NIL);
        cb_utilities.register_cb_frame($ONTOLOGY_BROWSER, $str_alt21$ontology_browser, $str_alt22$cb_uiat_ontology_browser_start, NIL, T, NIL);
        html_macros.note_html_handler_function(CB_UIA_START);
        utilities_macros.register_html_state_variable($cb_uia_application_server$);
        cb_utilities.setup_cb_link_method($UIA_START, CB_LINK_UIA_START, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_LAUNCHER, CB_LINK_UIA_LAUNCHER, ONE_INTEGER);
        cb_utilities.declare_cb_tool($UIA_LAUNCHER, $$$UIA, $$$UIA, $$$User_Interaction_Agenda);
        html_macros.note_html_handler_function(CB_UIA_LAUNCHERS);
        cb_utilities.setup_cb_link_method($UIA_LAUNCHERS, CB_LINK_UIA_LAUNCHERS, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_INTERACTION);
        html_macros.note_html_handler_function(CB_UIA_NEXT_INTERACTION);
        cb_utilities.setup_cb_link_method($UIA_NEXT_INTERACTION, CB_LINK_UIA_NEXT_INTERACTION, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_CHOOSE_INTERACTION);
        cb_utilities.setup_cb_link_method($UIA_CHOOSE_INTERACTION, CB_LINK_UIA_CHOOSE_INTERACTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_TYPEIN);
        cb_utilities.setup_cb_link_method($UIA_TYPEIN, CB_LINK_UIA_TYPEIN, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_AGENDA);
        cb_utilities.setup_cb_link_method($UIA_AGENDA, CB_LINK_UIA_AGENDA, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_AGENDA_REFRESH);
        html_macros.note_html_handler_function(CB_UIA_NOOP);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_UIA_TYPEIN);
        html_macros.note_html_handler_function(CB_UIA_RESET);
        cb_utilities.setup_cb_link_method($UIA_RESET, CB_LINK_UIA_RESET, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_COMPLETE_INTERACTION);
        cb_utilities.setup_cb_link_method($UIA_COMPLETE_INTERACTION, CB_LINK_UIA_COMPLETE_INTERACTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_REJECT_INTERACTION);
        cb_utilities.setup_cb_link_method($UIA_REJECT_INTERACTION, CB_LINK_UIA_REJECT_INTERACTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_COMMENTS);
        cb_utilities.setup_cb_link_method($UIA_COMMENTS, CB_LINK_UIA_COMMENTS, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_FORGET_COMMENTS, CB_LINK_UIA_FORGET_COMMENTS, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_FORGET_COMMENTS);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_CB_UIA_SHOW_CYCL__ = makeSymbol("*CB-UIA-SHOW-CYCL?*");

    public static final SubLSymbol $cb_current_uima$ = makeSymbol("*CB-CURRENT-UIMA*");

    private static final SubLSymbol $UIA_LAUNCHERS = makeKeyword("UIA-LAUNCHERS");

    static private final SubLString $str_alt3$uia_launchers = makeString("uia-launchers");

    static private final SubLString $str_alt4$cb_uia_launchers = makeString("cb-uia-launchers");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt6$uia_interaction = makeString("uia-interaction");

    static private final SubLString $str_alt7$cb_uia_interaction = makeString("cb-uia-interaction");

    private static final SubLSymbol $UIA_TYPEIN = makeKeyword("UIA-TYPEIN");

    static private final SubLString $str_alt9$uia_typein = makeString("uia-typein");

    static private final SubLString $str_alt10$cb_uia_typein = makeString("cb-uia-typein");

    private static final SubLSymbol $UIA_AGENDA = makeKeyword("UIA-AGENDA");

    static private final SubLString $str_alt12$uia_agenda = makeString("uia-agenda");

    static private final SubLString $str_alt13$cb_uia_agenda = makeString("cb-uia-agenda");

    private static final SubLSymbol $UIA_AGENDA_REFRESH = makeKeyword("UIA-AGENDA-REFRESH");

    static private final SubLString $str_alt15$uia_agenda_refresh = makeString("uia-agenda-refresh");

    static private final SubLString $str_alt16$cb_uia_agenda_refresh = makeString("cb-uia-agenda-refresh");

    private static final SubLSymbol $UIA_NOOP = makeKeyword("UIA-NOOP");

    static private final SubLString $str_alt18$uia_noop = makeString("uia-noop");

    static private final SubLString $str_alt19$cb_uia_noop = makeString("cb-uia-noop");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    static private final SubLString $str_alt21$ontology_browser = makeString("ontology-browser");

    static private final SubLString $str_alt22$cb_uiat_ontology_browser_start = makeString("cb-uiat-ontology-browser-start");

    private static final SubLSymbol CB_UIA_START = makeSymbol("CB-UIA-START");

    public static final SubLSymbol $cb_uia_application_server$ = makeSymbol("*CB-UIA-APPLICATION-SERVER*");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$KRAKEN = makeString("KRAKEN");

    static private final SubLString $str_alt27$_on_ = makeString(" on ");

    static private final SubLString $str_alt28$20____25_ = makeString("20%,*,25%");

    static private final SubLString $str_alt29$__10_ = makeString("*,10%");

    static private final SubLString $str_alt30$__1_1 = makeString("*,1,1");

    static private final SubLString $str_alt31$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    static private final SubLString $$$no = makeString("no");

    static private final SubLString $str_alt33$__25_ = makeString("*,25%");

    static private final SubLString $str_alt34$_UIA_ = makeString("[UIA]");

    static private final SubLString $str_alt35$cb_uia_start = makeString("cb-uia-start");

    private static final SubLSymbol $UIA_START = makeKeyword("UIA-START");

    private static final SubLSymbol CB_LINK_UIA_START = makeSymbol("CB-LINK-UIA-START");



    private static final SubLSymbol $UIA_LAUNCHER = makeKeyword("UIA-LAUNCHER");

    private static final SubLSymbol CB_LINK_UIA_LAUNCHER = makeSymbol("CB-LINK-UIA-LAUNCHER");

    static private final SubLString $$$UIA = makeString("UIA");

    static private final SubLString $$$User_Interaction_Agenda = makeString("User Interaction Agenda");

    private static final SubLSymbol CB_UIA_LAUNCHERS = makeSymbol("CB-UIA-LAUNCHERS");

    static private final SubLString $str_alt44$_UIA_Launchers_ = makeString("[UIA Launchers]");

    private static final SubLSymbol CB_LINK_UIA_LAUNCHERS = makeSymbol("CB-LINK-UIA-LAUNCHERS");

    private static final SubLSymbol CB_UIA_INTERACTION = makeSymbol("CB-UIA-INTERACTION");

    private static final SubLSymbol CB_UIA_NEXT_INTERACTION = makeSymbol("CB-UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt48$_Next_ = makeString("[Next]");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    private static final SubLSymbol CB_LINK_UIA_NEXT_INTERACTION = makeSymbol("CB-LINK-UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt51$cb_uia_next_interaction = makeString("cb-uia-next-interaction");

    static private final SubLList $list_alt52 = list(makeSymbol("ID-STRING"));





    private static final SubLSymbol CB_UIA_CHOOSE_INTERACTION = makeSymbol("CB-UIA-CHOOSE-INTERACTION");



    static private final SubLString $str_alt57$cb_uia_choose_interaction__A = makeString("cb-uia-choose-interaction&~A");

    private static final SubLSymbol $UIA_CHOOSE_INTERACTION = makeKeyword("UIA-CHOOSE-INTERACTION");

    private static final SubLSymbol CB_LINK_UIA_CHOOSE_INTERACTION = makeSymbol("CB-LINK-UIA-CHOOSE-INTERACTION");

    private static final SubLSymbol CB_UIA_TYPEIN = makeSymbol("CB-UIA-TYPEIN");

    static private final SubLString $str_alt61$_UIA_Typein_ = makeString("[UIA Typein]");

    private static final SubLSymbol CB_LINK_UIA_TYPEIN = makeSymbol("CB-LINK-UIA-TYPEIN");

    private static final SubLSymbol CB_UIA_AGENDA = makeSymbol("CB-UIA-AGENDA");

    static private final SubLString $str_alt64$_UIA_Agenda_ = makeString("[UIA Agenda]");

    private static final SubLSymbol CB_LINK_UIA_AGENDA = makeSymbol("CB-LINK-UIA-AGENDA");

    static private final SubLString $str_alt66$_FRAME_ = makeString("%FRAME%");

    static private final SubLString $str_alt67$self_parent_frames__FRAME___locat = makeString("self.parent.frames[%FRAME%].location.href = self.parent.frames[%FRAME%].document.location;");

    static private final SubLString $str_alt68$_ = makeString("\"");

    private static final SubLSymbol CB_UIA_AGENDA_REFRESH = makeSymbol("CB-UIA-AGENDA-REFRESH");

    static private final SubLString $str_alt70$_var_uia_meta_agenda_id______A__v = makeString("\nvar uia_meta_agenda_id   = ~A;\nvar uia_agenda_id        = ~A;\nvar uia_current_total    = ~A;\nvar uia_current_finished = ~A;");

    static private final SubLString $str_alt71$_AGENDA_ = makeString("%AGENDA%");

    static private final SubLString $str_alt72$_REFRESH_ = makeString("%REFRESH%");

    static private final SubLString $str_alt73$_TIMEOUT_ = makeString("%TIMEOUT%");



    static private final SubLString $str_alt75$_function_uia_agenda_snapshot_sig = makeString("\nfunction uia_agenda_snapshot_signature_check() {\n  if (\"undefined\" == typeof self.parent.frames[%AGENDA%]) {\n     alert(\'refreshing agenda based on \'+location);\n     return false;\n  }\n  else {\n    var parent_meta_agenda_id   = self.parent.frames[%AGENDA%].uia_meta_agenda_id;\n    var parent_agenda_id        = self.parent.frames[%AGENDA%].uia_agenda_id;\n    var parent_current_total    = self.parent.frames[%AGENDA%].uia_current_total;\n    var parent_current_finished = self.parent.frames[%AGENDA%].uia_current_finished;\n    return ((self.uia_meta_agenda_id   == parent_meta_agenda_id)\n       && (self.uia_agenda_id        == parent_agenda_id)\n       && (self.uia_current_total    == parent_current_total)\n       && (self.uia_current_finished == parent_current_finished));\n  }\n}\n\nfunction perform_refresh_agenda_check() {\n if (!uia_agenda_snapshot_signature_check()) {\n   var location = self.document.location.href;\n   // alert(\'refreshing agenda based on \'+location);\n   self.parent.frames[%AGENDA%].location.href \n    = location.substring(0, location.indexOf(%REFRESH%))\n      + %AGENDA%;\n }\n}\n\nwindow.setTimeout( \'perform_refresh_agenda_check();\', %TIMEOUT%);\n\n");

    static private final SubLString $$$Noop_Frame = makeString("Noop Frame");

    private static final SubLSymbol CB_UIA_NOOP = makeSymbol("CB-UIA-NOOP");





    private static final SubLSymbol $UIA_DEBUG_INTERACTION = makeKeyword("UIA-DEBUG-INTERACTION");





    private static final SubLSymbol $MEDIUM_RED = makeKeyword("MEDIUM-RED");

    static private final SubLString $str_alt84$__S_ = makeString("[~S]");

    static private final SubLString $str_alt85$___ = makeString("...");



    static private final SubLString $str_alt87$_S_is_an_invalid_hint_specificati = makeString("~S is an invalid hint specification.~%");

    static private final SubLString $str_alt88$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $str_alt89$init____ = makeString("init(); ");



    static private final SubLString $str_alt91$__ = makeString("||");



    static private final SubLString $str_alt93$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");





    static private final SubLString $$$Launchers = makeString("Launchers");

    static private final SubLString $str_alt99$position_absolute_bottom_1px_righ = makeString("position:absolute;bottom:1px;right:1px;background:white;");

    private static final SubLSymbol $CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");



    static private final SubLString $$$Kraken_by_Cycorp = makeString("Kraken by Cycorp");

    static private final SubLString $$$19 = makeString("19");

    static private final SubLString $$$20 = makeString("20");

    static private final SubLString $str_alt105$_ = makeString("_");

    static private final SubLString $str_alt106$_ = makeString(" ");



    static private final SubLString $str_alt108$_ = makeString("-");

    static private final SubLString $str_alt109$_A_ = makeString("~A?");

    private static final SubLSymbol $DISABLED_EXTERNAL = makeKeyword("DISABLED-EXTERNAL");

    static private final SubLSymbol $sym111$_MT = makeSymbol("?MT");

    public static final SubLObject $$toolRelevantToUIAEnvironment = constant_handles.reader_make_constant_shell(makeString("toolRelevantToUIAEnvironment"));

    static private final SubLList $list_alt113 = list(makeSymbol("?MT"));

    public static final SubLObject $$CycUIAMt = constant_handles.reader_make_constant_shell(makeString("CycUIAMt"));

    static private final SubLList $list_alt115 = list(makeKeyword("UIA-AGENDA"));

    static private final SubLString $$$top = makeString("top");

    static private final SubLString $str_alt117$_cycdoc_rkf_training_docs_kraken_ = makeString("/cycdoc/rkf/training-docs/kraken/May2003/0-TableOfContents.html");

    private static final SubLSymbol $UIA_REJECT_INTERACTION = makeKeyword("UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt119$_Reject_ = makeString("[Reject]");

    private static final SubLSymbol $REPORT_PROBLEM = makeKeyword("REPORT-PROBLEM");

    static private final SubLString $str_alt121$_Report_Problem_ = makeString("[Report Problem]");

    static private final SubLString $str_alt122$_Debug_ = makeString("[Debug]");

    static private final SubLString $$$documentation = makeString("documentation");

    static private final SubLString $str_alt124$_Documentation_ = makeString("[Documentation]");

    private static final SubLSymbol $PREAMBLE_METHOD = makeKeyword("PREAMBLE-METHOD");

    static private final SubLString $str_alt126$show_interaction_context_ = makeString("show_interaction_context_");



    static private final SubLString $str_alt128$Context_ = makeString("Context ");

    static private final SubLString $str_alt129$ = makeString("");

    static private final SubLString $str_alt130$UIA_WATERMARK = makeString("UIA-WATERMARK");

    public static final SubLInteger $int$55 = makeInteger(55);

    static private final SubLString $str_alt132$cb_uia_handle_uia_typein = makeString("cb-uia-handle-uia-typein");



    static private final SubLString $$$message = makeString("message");

    static private final SubLString $$$Say_This = makeString("Say This");



    private static final SubLSymbol $COMMAND_INTERACTION = makeKeyword("COMMAND-INTERACTION");

    static private final SubLList $list_alt138 = list(makeKeyword("UIA-AGENDA"), makeKeyword("UIA-TYPEIN"));

    private static final SubLSymbol CB_UIA_HANDLE_UIA_TYPEIN = makeSymbol("CB-UIA-HANDLE-UIA-TYPEIN");

    static private final SubLString $$$Agenda_Summary = makeString("Agenda Summary");

    private static final SubLSymbol $UIA_RESET = makeKeyword("UIA-RESET");

    static private final SubLString $str_alt142$_Reset_ = makeString("[Reset]");

    static private final SubLString $str_alt143$_My_Thoughts_ = makeString("[My Thoughts]");

    private static final SubLSymbol $UIA_OPEN_MUMBLE_WINDOW = makeKeyword("UIA-OPEN-MUMBLE-WINDOW");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");



    static private final SubLString $str_alt147$Topic___ = makeString("Topic : ");



    private static final SubLSymbol $UIA_SPECIFY_TOPIC = makeKeyword("UIA-SPECIFY-TOPIC");

    static private final SubLString $str_alt150$_More_Topics_ = makeString("[More Topics]");

    static private final SubLString $str_alt151$_Undo_ = makeString("[Undo]");

    private static final SubLSymbol $UIA_KNOWLEDGE_JOURNAL = makeKeyword("UIA-KNOWLEDGE-JOURNAL");

    static private final SubLString $str_alt153$_Journal_ = makeString("[Journal]");

    private static final SubLSymbol $UIA_COMMENTS = makeKeyword("UIA-COMMENTS");

    static private final SubLString $str_alt155$_Comments_ = makeString("[Comments]");

    static private final SubLString $str_alt156$Messages__ = makeString("Messages :");

    static private final SubLString $str_alt157$Essential_Steps__ = makeString("Essential Steps :");

    private static final SubLSymbol UI_STATUS = makeSymbol("UI-STATUS");

    static private final SubLString $str_alt159$98_ = makeString("98%");

    static private final SubLString $str_alt160$Relevant_Suggestions__ = makeString("Relevant Suggestions :");

    static private final SubLString $str_alt161$Possible_Suggestions__ = makeString("Possible Suggestions :");

    private static final SubLSymbol $TABULATED = makeKeyword("TABULATED");

    static private final SubLString $$$Color_Key = makeString("Color Key");

    static private final SubLString $str_alt164$_XX_ = makeString("[XX]");

    static private final SubLString $str_alt165$_Can_be_done_immediately = makeString(" Can be done immediately");

    static private final SubLString $str_alt166$_No_user_action_required = makeString(" No user action required");

    static private final SubLString $str_alt167$_Presently_blocked = makeString(" Presently blocked");

    private static final SubLSymbol CB_UIA_RESET = makeSymbol("CB-UIA-RESET");

    static private final SubLString $str_alt169$cb_uia_reset = makeString("cb-uia-reset");

    private static final SubLSymbol CB_LINK_UIA_RESET = makeSymbol("CB-LINK-UIA-RESET");



    private static final SubLSymbol CB_UIA_COMPLETE_INTERACTION = makeSymbol("CB-UIA-COMPLETE-INTERACTION");

    static private final SubLString $str_alt173$_Continue_ = makeString("[Continue]");

    static private final SubLString $str_alt174$cb_uia_complete_interaction__A = makeString("cb-uia-complete-interaction&~A");

    private static final SubLSymbol $UIA_COMPLETE_INTERACTION = makeKeyword("UIA-COMPLETE-INTERACTION");

    private static final SubLSymbol CB_LINK_UIA_COMPLETE_INTERACTION = makeSymbol("CB-LINK-UIA-COMPLETE-INTERACTION");

    private static final SubLSymbol CB_UIA_REJECT_INTERACTION = makeSymbol("CB-UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt178$cb_uia_reject_interaction__A = makeString("cb-uia-reject-interaction&~A");

    private static final SubLSymbol CB_LINK_UIA_REJECT_INTERACTION = makeSymbol("CB-LINK-UIA-REJECT-INTERACTION");

    static private final SubLString $$$Comments = makeString("Comments");

    private static final SubLSymbol $UIA_FORGET_COMMENTS = makeKeyword("UIA-FORGET-COMMENTS");

    static private final SubLString $str_alt182$_Forget_All_ = makeString("[Forget All]");

    static private final SubLString $str_alt183$I_have_no_comments_ = makeString("I have no comments.");

    static private final SubLString $str_alt184$I_have_1_comment_ = makeString("I have 1 comment.");

    static private final SubLString $str_alt185$I_have__S_comments_ = makeString("I have ~S comments.");

    static private final SubLList $list_alt186 = list(makeSymbol("MESSAGE"));

    private static final SubLSymbol CB_UIA_COMMENTS = makeSymbol("CB-UIA-COMMENTS");

    static private final SubLString $str_alt188$cb_uia_comments = makeString("cb-uia-comments");

    private static final SubLSymbol CB_LINK_UIA_COMMENTS = makeSymbol("CB-LINK-UIA-COMMENTS");

    static private final SubLString $str_alt190$cb_uia_forget_comments = makeString("cb-uia-forget-comments");

    private static final SubLSymbol CB_LINK_UIA_FORGET_COMMENTS = makeSymbol("CB-LINK-UIA-FORGET-COMMENTS");

    private static final SubLSymbol CB_UIA_FORGET_COMMENTS = makeSymbol("CB-UIA-FORGET-COMMENTS");

    // // Initializers
    public void declareFunctions() {
        declare_cb_user_interaction_agenda_file();
    }

    public void initializeVariables() {
        init_cb_user_interaction_agenda_file();
    }

    public void runTopLevelForms() {
        setup_cb_user_interaction_agenda_file();
    }
}

