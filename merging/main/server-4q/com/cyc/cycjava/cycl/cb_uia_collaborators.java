/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cyblack.cyblack_cyc_event_bb_agenda;
import com.cyc.cycjava.cycl.cyblack.cyblack_isi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      CB-UIA-COLLABORATORS
 *  source file: /cyc/top/cycl/cb-uia-collaborators.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uia_collaborators extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_collaborators() {
    }

    public static final SubLFile me = new cb_uia_collaborators();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_collaborators";

    // // Definitions
    // defparameter
    private static final SubLSymbol $cb_use_virb3_for_powerloom$ = makeSymbol("*CB-USE-VIRB3-FOR-POWERLOOM*");

    public static final SubLObject uiaext_fire_results_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject term_a = args.first();
            SubLObject term_b = second(args);
            return format(NIL, $str_alt16$FIRE_of__A_and__A, pph_main.generate_phrase(term_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_main.generate_phrase(term_b, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static final SubLObject cb_uiaext_fire_results_display(SubLObject interaction) {
        {
            SubLObject initializedP = user_interaction_agenda.ui_state_lookup(interaction, $kw17$INITIALIZED_, UNPROVIDED);
            if (NIL == initializedP) {
                cb_uiaext_fire_results_constructor(interaction);
            }
            cb_uiaext_fire_results_display_guts(interaction);
        }
        return interaction;
    }

    public static final SubLObject cb_uiaext_fire_results_constructor(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject term_a = args.first();
            SubLObject term_b = second(args);
            SubLObject results = third(args);
            user_interaction_agenda.ui_state_update(interaction, $TERM_A, term_a);
            user_interaction_agenda.ui_state_update(interaction, $TERM_B, term_b);
            user_interaction_agenda.ui_state_update(interaction, $RESULTS, results);
            user_interaction_agenda.ui_state_update(interaction, $kw17$INITIALIZED_, T);
        }
        return interaction;
    }

    public static final SubLObject cb_uiaext_fire_results_display_guts(SubLObject interaction) {
        {
            SubLObject term_a = user_interaction_agenda.ui_state_lookup(interaction, $TERM_A, UNPROVIDED);
            SubLObject term_b = user_interaction_agenda.ui_state_lookup(interaction, $TERM_B, UNPROVIDED);
            SubLObject results = user_interaction_agenda.ui_state_lookup(interaction, $RESULTS, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$FIRE_Analogy_Server_Insights);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_princ($str_alt22$FIRE_compared_the_two_terms_);
            cb_uia_display_primitives.cb_uia_show_term(term_a, UNPROVIDED);
            html_utilities.html_princ($str_alt23$_and_);
            cb_uia_display_primitives.cb_uia_show_term(term_b, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    {
                        SubLObject correspondences = second(assoc($CORRESPONDENCES, result, UNPROVIDED, UNPROVIDED));
                        SubLObject inferences = second(assoc($INFERENCES, result, UNPROVIDED, UNPROVIDED));
                        cb_uiaext_fire_results_display_correspondences(term_a, term_b, correspondences);
                    }
                }
            }
            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt27$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_fire_results_display_correspondences(SubLObject term_a, SubLObject term_b, SubLObject correspondences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Correspondences);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($CENTER));
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
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(term_a, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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
                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(term_b, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = correspondences;
                        SubLObject correspondence = NIL;
                        for (correspondence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , correspondence = cdolist_list_var.first()) {
                            {
                                SubLObject datum = correspondence;
                                SubLObject current = datum;
                                SubLObject feature_a = NIL;
                                SubLObject feature_b = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                feature_a = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                feature_b = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (!((NIL != forts.fort_p(feature_a)) || (NIL != forts.fort_p(feature_b)))) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_display_primitives.cb_uia_show_sentence(feature_a, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
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
                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_display_primitives.cb_uia_show_sentence(feature_b, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt30);
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uiaext_fire_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject fsession = user_interaction_agenda.uia_state_lookup(v_agenda, $FSESSION, UNPROVIDED);
                SubLObject machine = (NIL != fsession) ? ((SubLObject) (rkf_collaborator_fire.fire_session_machine(fsession))) : $str_alt32$cthulhu_cyc_com;
                SubLObject port = (NIL != fsession) ? ((SubLObject) (rkf_collaborator_fire.fire_session_port(fsession))) : $int$1000;
                SubLObject kb_path = (NIL != fsession) ? ((SubLObject) (rkf_collaborator_fire.fire_session_kb_path(fsession))) : $str_alt34$C__FIRE_;
                SubLObject kb_name = (NIL != fsession) ? ((SubLObject) (rkf_collaborator_fire.fire_session_kb_name(fsession))) : $str_alt35$cyc_kb;
                SubLObject pred_style = (NIL != fsession) ? ((SubLObject) (rkf_collaborator_fire.fire_session_predstyle(fsession))) : $MIXED_CASE;
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
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
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt37$cb_uiaext_make_fire_session, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$FIRE_Analogy_Server_Setup);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
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
                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt39$Machine___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$machine, machine, $int$60);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt42$Port___);
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
                                                                    html_utilities.html_text_input($$$port, string_utilities.to_string(port), TWENTY_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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
                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt44$Path__);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($str_alt45$kb_path, kb_path, $int$60);
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
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt46$Name__);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($str_alt47$kb_name, kb_name, $int$60);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_utilities.html_hidden_input($str_alt48$pred_style, symbol_name(pred_style), UNPROVIDED);
                                            html_utilities.html_newline(TWO_INTEGER);
                                            html_utilities.html_submit_input($$$Setup, $$$setup, UNPROVIDED);
                                            html_utilities.html_indent(TWO_INTEGER);
                                            html_utilities.html_submit_input($$$Continue, $$$continue, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
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

    public static final SubLObject cb_uiaext_make_fire_session(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject setup = html_utilities.html_extract_input($$$setup, args);
            SubLObject v_continue = html_utilities.html_extract_input($$$continue, args);
            if (NIL == v_continue) {
                {
                    SubLObject machine = html_utilities.html_extract_input($$$machine, args);
                    SubLObject port = parse_integer(html_utilities.html_extract_input($$$port, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject kb_path = html_utilities.html_extract_input($str_alt45$kb_path, args);
                    SubLObject kb_name = html_utilities.html_extract_input($str_alt47$kb_name, args);
                    SubLObject pred_style = intern(html_utilities.html_extract_input($str_alt48$pred_style, args), find_package($$$KEYWORD));
                    SubLObject fsession = user_interaction_agenda.uia_state_lookup(v_agenda, $FSESSION, UNPROVIDED);
                    if (NIL != rkf_collaborator_fire.fire_session_p(fsession)) {
                        rkf_collaborator_fire.fire_end_session(fsession);
                        rkf_collaborator_fire.fire_close_kb(fsession);
                    }
                    fsession = rkf_collaborator_fire.create_fire_session(machine, port);
                    rkf_collaborator_fire.fire_open_kb(kb_path, kb_name, pred_style, fsession);
                    user_interaction_agenda.uia_state_update(v_agenda, $FSESSION, fsession);
                }
            }
            user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt55$FIRE_Analogy_Server_operational_);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject uiaext_is_fire_initializedP(SubLObject v_agenda) {
        return rkf_collaborator_fire.fire_session_p(user_interaction_agenda.uia_state_lookup(v_agenda, $FSESSION, UNPROVIDED));
    }

    public static final SubLObject uiaext_spawn_fire_analogy(SubLObject v_agenda, SubLObject term_1, SubLObject term_2) {
        subl_promotions.make_process_with_args($$$FIRE_Analogy_Assistant, UIAEXT_FIRE_ANALOGY_REASONER_THREAD, list(v_agenda, term_1, term_2));
        {
            SubLObject phrase_1 = uia_trampolines.uia_term_phrase(v_agenda, term_1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject phrase_2 = uia_trampolines.uia_term_phrase(v_agenda, term_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject message = format(NIL, $str_alt59$FIRE_is_investigating_the_analogy, phrase_1, phrase_2);
            return user_interaction_agenda.uia_act_new_comment(v_agenda, message);
        }
    }

    public static final SubLObject uiaext_fire_analogy_reasoner_thread(SubLObject v_agenda, SubLObject term_1, SubLObject term_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            {
                                SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                SubLObject fsession = user_interaction_agenda.uia_state_lookup(v_agenda, $FSESSION, UNPROVIDED);
                                SubLObject results = NIL;
                                if (NIL == rkf_collaborator_fire.fire_session_p(fsession)) {
                                    user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt62$FIRE_reasoning_failed_due_to_erro);
                                } else {
                                    rkf_collaborator_fire.fire_start_session(fsession);
                                    results = rkf_collaborator_fire.make_fire_analogy_of_terms(term_1, term_2, mt, fsession);
                                    user_interaction_agenda.uia_act_new_interaction(v_agenda, $RELEVANT, $FIRE_RESULTS, list(term_1, term_2, results), UNPROVIDED);
                                    rkf_collaborator_fire.fire_end_session(UNPROVIDED);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
            return v_agenda;
        }
    }

    // defparameter
    public static final SubLSymbol $powerloom_test_query$ = makeSymbol("*POWERLOOM-TEST-QUERY*");

    // defparameter
    public static final SubLSymbol $powerloom_test_mt$ = makeSymbol("*POWERLOOM-TEST-MT*");

    public static final SubLObject uia_act_new_isi_why_not(SubLObject v_agenda, SubLObject mode, SubLObject plist) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ISI_WHY_NOT, plist, UNPROVIDED);
    }

    public static final SubLObject uiaext_isi_why_not_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW_CONTRIBUTION, args.first());
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
            return request;
        }
    }

    public static final SubLObject uiaext_isi_why_not_hint(SubLObject interaction) {
        return $str_alt71$ISI_Why_Not_Proposal;
    }

    public static final SubLObject cb_uiaext_isi_why_not_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW_CONTRIBUTION)) {
                    {
                        SubLObject datum_23 = plist;
                        SubLObject current_24 = datum_23;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_24;
                        SubLObject bad = NIL;
                        SubLObject current_25 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_23, $list_alt73);
                            current_25 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_23, $list_alt73);
                            if (NIL == member(current_25, $list_alt74, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_25 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_23, $list_alt73);
                        }
                        {
                            SubLObject missing_tail = property_list_member($MISSING, current_24);
                            SubLObject missing = (NIL != missing_tail) ? ((SubLObject) (cadr(missing_tail))) : NIL;
                            SubLObject mt_tail = property_list_member($MT, current_24);
                            SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                            SubLObject explanation_tail = property_list_member($EXPLANATION, current_24);
                            SubLObject explanation = (NIL != explanation_tail) ? ((SubLObject) (cadr(explanation_tail))) : NIL;
                            SubLObject query_tail = property_list_member($QUERY, current_24);
                            SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                            SubLObject html_tail = property_list_member($HTML, current_24);
                            SubLObject html = (NIL != html_tail) ? ((SubLObject) (cadr(html_tail))) : NIL;
                            cb_uiaext_isi_why_not_render_show_contribution(interaction, missing, mt, explanation, query, html);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_isi_why_not_render_show_contribution(SubLObject interaction, SubLObject missing, SubLObject mt, SubLObject explanation, SubLObject query, SubLObject html) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt81$Query_Critique_from_ISI_s_WhyNot_);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            html_utilities.html_princ($$$For_the_question);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_show_question(query, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            if (NIL != missing) {
                html_utilities.html_princ($str_alt83$_the_Why_Not_module_has_determine);
                html_utilities.html_princ($str_alt84$_following_facts_would_have_to_be);
                html_utilities.html_newline(TWO_INTEGER);
            } else {
                html_utilities.html_princ($str_alt85$_the_WhyNot_module_could_not_iden);
                html_utilities.html_princ($str_alt86$_missing_knowledge_);
                html_utilities.html_newline(TWO_INTEGER);
            }
            if (NIL != missing) {
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = missing;
                            SubLObject fact = NIL;
                            for (fact = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_display_primitives.cb_uia_show_sentence(fact, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
                html_utilities.html_newline(ONE_INTEGER);
            }
            if (NIL != missing) {
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                html_utilities.html_princ($str_alt87$Reminder__);
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt88$If_you_want_to_add_these_facts__c);
                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_utilities.html_princ($str_alt89$___);
                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt90$_next_to_the_sentence_and_use_the);
                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_utilities.html_princ($str_alt91$__Assert_Similar__);
                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt92$_tool_to_add_them_);
                html_utilities.html_newline(TWO_INTEGER);
            }
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt27$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_princ($str_alt93$Explanation_Detail_);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            if (NIL != html) {
                format(html_macros.$html_stream$.getDynamicValue(thread), html);
            } else {
                html_macros.verify_not_within_html_pre();
                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind(T, thread);
                        html_utilities.html_princ(explanation);
                    } finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt27$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_link_uiaext_criticize_query(SubLObject interaction, SubLObject sf_state, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt94$_Ask_ISI_WhyNot_Query_Critiquer_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction), sf_state);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt96$cb_uiaext_criticize_query, arglist);
                }
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

    public static final SubLObject cb_uiaext_criticize_query(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            SubLObject sf_state = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt99);
            ui_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt99);
            sf_state = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
                    cb_uiaext_convert_sf_state_to_isi_query(interaction, sf_state);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt99);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_convert_sf_state_to_isi_query(SubLObject interaction, SubLObject sf_state) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject qc_query = rkf_solution_finder.sf_state_query(sf_state);
            if (NIL != qc_query) {
                {
                    SubLObject formula = rkf_query_constructor.qc_query_cycl(qc_query);
                    SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                    SubLObject number = rkf_solution_finder.sf_state_number(sf_state);
                    SubLObject time = rkf_solution_finder.sf_state_time(sf_state);
                    SubLObject backchains = rkf_solution_finder.sf_state_backchain(sf_state);
                    SubLObject depth = rkf_solution_finder.sf_state_depth(sf_state);
                    return uiaext_isi_spawn_powerloom_query_critiquer(v_agenda, formula, mt, backchains, number, time, depth);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject bb_enqueue_powerloom_problematic_query(SubLObject query, SubLObject mt, SubLObject backchains, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            methods.funcall_instance_method_with_1_args(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread), ENQUEUE_SERIALIZED_EVENT, list($str_alt102$FAILED_QUERY, $PROBLEM, cyblack_isi_macros.create_isi_problem(query, mt, backchains, number, time, depth)));
            return NIL;
        }
    }

    public static final SubLObject uiaext_isi_spawn_powerloom_query_critiquer(SubLObject v_agenda, SubLObject query, SubLObject mt, SubLObject backchains, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cb_use_virb3_for_powerloom$.getDynamicValue(thread)) {
                bb_enqueue_powerloom_problematic_query(query, mt, backchains, number, time, depth);
            } else {
                rkf_collaborator_powerloom.enqueue_powerloom_problematic_query(query, mt, backchains, number, time, depth);
            }
            $cb_current_uia_stashed$.setGlobalValue(v_agenda);
            user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt104$The_query__S_with_the_settings_Mt, new SubLObject[]{ query, mt, backchains, number, time, depth }));
            return v_agenda;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_current_uia_stashed$ = makeSymbol("*CB-CURRENT-UIA-STASHED*");

    public static final SubLObject uiaext_isi_handle_powerloom_query_response(SubLObject reply) {
        {
            SubLObject v_agenda = $cb_current_uia_stashed$.getGlobalValue();
            SubLObject message = uiaext_isi_extract_message(reply);
            uia_act_new_isi_why_not(v_agenda, $RELEVANT, list(message));
        }
        return NIL;
    }

    public static final SubLObject uiaext_isi_extract_message(SubLObject reply) {
        {
            SubLObject v_arguments = reply.rest();
            SubLObject contribution = second(member($CONTR, v_arguments, UNPROVIDED, UNPROVIDED)).first();
            SubLObject outgoing = NIL;
            SubLObject datum = contribution;
            SubLObject current = datum;
            SubLObject proposal = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt106);
            proposal = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_27 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt106);
                    current_27 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt106);
                    if (NIL == member(current_27, $list_alt107, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_27 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt106);
                }
                {
                    SubLObject solution_tail = property_list_member($SOLUTION, current);
                    SubLObject solution = (NIL != solution_tail) ? ((SubLObject) (cadr(solution_tail))) : NIL;
                    SubLObject answer_to_tail = property_list_member($ANSWER_TO, current);
                    SubLObject answer_to = (NIL != answer_to_tail) ? ((SubLObject) (cadr(answer_to_tail))) : NIL;
                    SubLObject missing = second(assoc($MISSING_ASSERTIONS, solution, UNPROVIDED, UNPROVIDED));
                    SubLObject explanation_xml = second(assoc($EXPLANATION_XML, solution, UNPROVIDED, UNPROVIDED));
                    SubLObject explanation_ascii = second(assoc($EXPLANATION_ASCII, solution, UNPROVIDED, UNPROVIDED));
                    SubLObject explanation_html = second(assoc($EXPLANATION_HTML, solution, UNPROVIDED, UNPROVIDED));
                    SubLObject formula = second(assoc($FORMULA, answer_to, UNPROVIDED, UNPROVIDED));
                    SubLObject mt = second(assoc($MT, answer_to, UNPROVIDED, UNPROVIDED));
                    SubLObject backchains = second(assoc($BACKCHAINS, answer_to, UNPROVIDED, UNPROVIDED));
                    SubLObject number = second(assoc($NUMBER, answer_to, UNPROVIDED, UNPROVIDED));
                    SubLObject time = second(assoc($TIME, answer_to, UNPROVIDED, UNPROVIDED));
                    SubLObject depth = second(assoc($DEPTH, answer_to, UNPROVIDED, UNPROVIDED));
                    missing = rkf_collaborator_powerloom.string_expression_to_cycl_expression(missing);
                    mt = rkf_collaborator_powerloom.string_expression_to_cycl_expression(mt);
                    formula = rkf_collaborator_powerloom.string_expression_to_cycl_expression(formula);
                    outgoing = list(new SubLObject[]{ $MISSING, missing, $MT, mt, $EXPLANATION, explanation_ascii, $HTML, explanation_html, $QUERY, formula });
                }
            }
            return outgoing;
        }
    }

    // deflexical
    private static final SubLSymbol $powerloom_server_runningP$ = makeSymbol("*POWERLOOM-SERVER-RUNNING?*");

    public static final SubLObject is_isi_why_not_query_critiquer_availableP() {
        return $powerloom_server_runningP$.getGlobalValue();
    }

    public static final SubLObject cb_uiaext_isi_why_not_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
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
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt119$cb_uiaext_isi_why_not_session, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt120$ISI_Why_Not_Setup);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt121$The_ISI_Why_Not_Server_is_current);
                                        html_utilities.html_princ(NIL != $powerloom_server_runningP$.getGlobalValue() ? ((SubLObject) ($$$running)) : $$$not_running);
                                        html_utilities.html_princ($str_alt124$_);
                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Setup, $$$setup, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Run_Test, $$$test, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Continue, $$$continue, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
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
            return args;
        }
    }

    public static final SubLObject cb_uiaext_isi_why_not_session(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject setupP = html_utilities.html_extract_input($$$setup, args);
                SubLObject testP = html_utilities.html_extract_input($$$test, args);
                if (NIL != setupP) {
                    if (NIL == $powerloom_server_runningP$.getGlobalValue()) {
                        $powerloom_server_runningP$.setGlobalValue(rkf_collaborator_powerloom.initialize_powerloom_handling());
                        rkf_collaborator_powerloom.register_powerloom_result_handler(UIAEXT_ISI_HANDLE_POWERLOOM_QUERY_RESPONSE);
                    }
                }
                if (NIL != testP) {
                    {
                        SubLObject query = $powerloom_test_query$.getDynamicValue(thread);
                        SubLObject mt = $powerloom_test_mt$.getDynamicValue(thread);
                        SubLObject backchains = TWO_INTEGER;
                        SubLObject number = NIL;
                        SubLObject time = $int$30;
                        SubLObject depth = TWENTY_INTEGER;
                        uiaext_isi_spawn_powerloom_query_critiquer(v_agenda, query, mt, backchains, number, time, depth);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_uiaext_nusketch_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW_CONTRIBUTION)) {
                    {
                        SubLObject datum_30 = plist;
                        SubLObject current_31 = datum_30;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_31;
                        SubLObject bad = NIL;
                        SubLObject current_32 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_30, $list_alt131);
                            current_32 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_30, $list_alt131);
                            if (NIL == member(current_32, $list_alt132, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_32 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_30, $list_alt131);
                        }
                        {
                            SubLObject entity_tail = property_list_member($ENTITY, current_31);
                            SubLObject entity = (NIL != entity_tail) ? ((SubLObject) (cadr(entity_tail))) : NIL;
                            cb_uiaext_nusketch_render_request_show(interaction, entity);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_nusketch_render_request_show(SubLObject interaction, SubLObject entity) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$nuSketch_Battlespace_Module);
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_princ($str_alt135$Entity__);
        html_utilities.html_princ(entity);
        html_utilities.html_newline(TWO_INTEGER);
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt27$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(TWO_INTEGER);
        return interaction;
    }







    // deflexical
    private static final SubLSymbol $uiaext_create_new_guid_for_sketch$ = makeSymbol("*UIAEXT-CREATE-NEW-GUID-FOR-SKETCH*");



    public static final SubLObject cb_uiaext_nusketch_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, NIL);
                SubLObject machine = (NIL != nsession) ? ((SubLObject) (rkf_collaborator_nusketch.nusketch_session_machine(nsession))) : $uiaext_default_nusketch_machine$.getDynamicValue(thread);
                SubLObject port = (NIL != nsession) ? ((SubLObject) (rkf_collaborator_nusketch.nusketch_session_port(nsession))) : $uiaext_default_nusketch_port$.getDynamicValue(thread);
                $uiaext_default_nusketch_machine$.setDynamicValue(machine, thread);
                $uiaext_default_nusketch_port$.setDynamicValue(port, thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
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
                                        SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt155$cb_uiaext_nusketch_session, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$nuSketch_Battlespace_Setup);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                            html_utilities.html_newline(TWO_INTEGER);
                                            if (NIL != uia_coa_utilities.uia_coa_valid_nusketch_connectionP(v_agenda)) {
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ(format(NIL, $str_alt157$Nusketch_server_is_active_on__A_p, rkf_collaborator_nusketch.nusketch_session_machine(nsession), rkf_collaborator_nusketch.nusketch_session_port(nsession)));
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_submit_input($$$Reset_nuSketch_connection, $$$reset, UNPROVIDED);
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt39$Machine___);
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
                                                                        html_utilities.html_text_input($$$machine, machine, $int$40);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt42$Port___);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($$$port, string_utilities.to_string(port), TWENTY_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt161$We_will_be_discussing_the_followi);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$SketchGuid);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = $uiaext_known_nusketch_guids_for_sketches$.getGlobalValue();
                                                            SubLObject sketch_guid = NIL;
                                                            for (sketch_guid = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sketch_guid = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = sketch_guid;
                                                                    SubLObject current = datum;
                                                                    SubLObject allow_other_keys_p = NIL;
                                                                    SubLObject rest = current;
                                                                    SubLObject bad = NIL;
                                                                    SubLObject current_43 = NIL;
                                                                    for (; NIL != rest;) {
                                                                        destructuring_bind_must_consp(rest, datum, $list_alt163);
                                                                        current_43 = rest.first();
                                                                        rest = rest.rest();
                                                                        destructuring_bind_must_consp(rest, datum, $list_alt163);
                                                                        if (NIL == member(current_43, $list_alt164, UNPROVIDED, UNPROVIDED)) {
                                                                            bad = T;
                                                                        }
                                                                        if (current_43 == $ALLOW_OTHER_KEYS) {
                                                                            allow_other_keys_p = rest.first();
                                                                        }
                                                                        rest = rest.rest();
                                                                    }
                                                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                                        cdestructuring_bind_error(datum, $list_alt163);
                                                                    }
                                                                    {
                                                                        SubLObject name_tail = property_list_member($NAME, current);
                                                                        SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                                                                        SubLObject guid_tail = property_list_member($GUID, current);
                                                                        SubLObject guid = (NIL != guid_tail) ? ((SubLObject) (cadr(guid_tail))) : NIL;
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        if (NIL != guid) {
                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(guid);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(name);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt165$Interview_me_about_new_terms_);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
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
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$80);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Immediately);
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
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$80);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Later);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
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
                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$80);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Never);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$priority, $str_alt171$_relevant, NIL);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
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
                                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$priority, $str_alt172$_possible, T);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
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
                                                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$priority, $str_alt173$_none, NIL);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_submit_input($$$Setup, $$$setup, UNPROVIDED);
                                            }
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
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
            return args;
        }
    }

    public static final SubLObject cb_uiaext_nusketch_session(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
            SubLObject setup = html_utilities.html_extract_input($$$setup, args);
            SubLObject reset = html_utilities.html_extract_input($$$reset, args);
            SubLObject priority = html_utilities.html_extract_input($$$priority, args);
            SubLObject guid_choice = html_utilities.html_extract_input($$$SketchGuid, args);
            if (NIL != reset) {
                if (NIL != uia_coa_utilities.uia_coa_valid_nusketch_connectionP(v_agenda)) {
                    user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt175$Stopping_polling_thread___));
                    rkf_collaborator_nusketch.rkfcoll_nusketch_polling_stop(uima);
                }
                user_interaction_agenda.uima_state_clear(uima, $NSESSION);
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
            if (NIL != setup) {
                {
                    SubLObject machine = html_utilities.html_extract_input($$$machine, args);
                    SubLObject port = parse_integer(html_utilities.html_extract_input($$$port, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject nsession = user_interaction_agenda.uima_state_lookup(uima, $NSESSION, rkf_collaborator_nusketch.make_nusketch_session(UNPROVIDED));
                    $uiaext_salient_descriptor_priority$.setDynamicValue(uiat_nusketch_decode_priority(priority));
                    if (NIL != Guids.guid_string_p(guid_choice)) {
                        user_interaction_agenda.uima_state_update(uima, $NUSKETCH_GUID, Guids.string_to_guid(guid_choice));
                    } else
                        if (NIL != Strings.string_equal(guid_choice, $uiaext_create_new_guid_for_sketch$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            user_interaction_agenda.uima_state_update(uima, $NUSKETCH_GUID, Guids.new_guid());
                        } else {
                            user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, $str_alt177$The_sketch_you_identified_was_not);
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }

                    rkf_collaborator_nusketch._csetf_nusketch_session_machine(nsession, machine);
                    rkf_collaborator_nusketch._csetf_nusketch_session_port(nsession, port);
                    if (NIL != rkf_collaborator_nusketch.rkfcoll_nusketch_valid_connection_p(nsession)) {
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt178$Setting_up_connection_to_server_o, machine, port), v_agenda);
                        user_interaction_agenda.uima_state_update(uima, $NSESSION, nsession);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_fill_session_info(nsession);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_make_bundle_assertions(nsession, v_agenda);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt179$nuSketch_Battlespace_Server_opera, machine, port), v_agenda);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt180$Starting_polling_thread_for_extra), v_agenda);
                        {
                            SubLObject lock = user_interaction_agenda.uima_state_lookup(uima, $POLLING_LOCK, make_lock($$$nuSketch_Polling_Lock));
                            SubLObject args_54 = list($MACHINE, machine, $PORT, port);
                            user_interaction_agenda.uima_state_update(uima, $POLLING_LOCK, lock);
                            user_interaction_agenda.uima_state_update(uima, $POLLING_ARGS, args_54);
                        }
                        rkf_collaborator_nusketch.rkfcoll_nusketch_polling_start(uima);
                    } else {
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt186$Unable_to_contact_server_on__A__p, machine, port), v_agenda);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiaext_nusketch_highlight(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt188$cb_uiaext_nusketch_highlight, arglist);
                }
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiaext_nusketch_unhighlight(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt191$cb_uiaext_nusketch_unhighlight, arglist);
                }
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiaext_nusketch_highlight(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
            SubLObject nsession = user_interaction_agenda.uima_state_lookup(uima, $NSESSION, NIL);
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt194);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != nsession) {
                    {
                        SubLObject highlights = user_interaction_agenda.uia_state_lookup(v_agenda, $HIGHLIGHTS, UNPROVIDED);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_highlight_entity(nsession, v_term);
                        set.set_add(v_term, highlights);
                        user_interaction_agenda.uia_state_update(v_agenda, $HIGHLIGHTS, highlights);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt196$Highlighting__A_in_nuSketch, v_term), v_agenda);
                        uia_tools_browsing.uia_act_new_concept_clarifier(v_agenda, $REQUIRED, v_term);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt194);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uiaext_nusketch_unhighlight(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
            SubLObject nsession = user_interaction_agenda.uia_state_lookup(uima, $NSESSION, NIL);
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt194);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != nsession) {
                    {
                        SubLObject highlights = user_interaction_agenda.uia_state_lookup(v_agenda, $HIGHLIGHTS, UNPROVIDED);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_unhighlight_entity(nsession, v_term);
                        set.set_remove(v_term, highlights);
                        user_interaction_agenda.uia_state_update(v_agenda, $HIGHLIGHTS, highlights);
                        rkf_collaborator_nusketch.rkfcoll_nusketch_trace(format(NIL, $str_alt199$Unhighlighting__A_in_nuSketch, v_term), v_agenda);
                        uia_tools_browsing.uia_act_new_concept_clarifier(v_agenda, $REQUIRED, v_term);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt194);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject uia_act_new_nusketch(SubLObject v_agenda, SubLObject mode, SubLObject plist) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $NUSKETCH, plist, UNPROVIDED);
    }

    public static final SubLObject uiaext_nusketch_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW_CONTRIBUTION, args.first());
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
            return request;
        }
    }

    public static final SubLObject uiaext_nusketch_hint(SubLObject interaction) {
        return $$$nuSketch_Battlespace_server;
    }

    public static final SubLObject uiat_nusketch_decode_priority(SubLObject priority) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != Strings.string_equal(priority, $str_alt172$_possible, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return $POSSIBLE;
            } else
                if (NIL != Strings.string_equal(priority, $str_alt171$_relevant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return $RELEVANT;
                } else
                    if (NIL != Strings.string_equal(priority, $str_alt173$_none, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return $NONE;
                    } else {
                        return $uiaext_salient_descriptor_priority$.getDynamicValue(thread);
                    }


        }
    }

    public static final SubLObject is_nusketch_server_availableP() {
        {
            SubLObject uima = cb_user_interaction_agenda.cb_current_uima();
            return NIL == uima ? ((SubLObject) (NIL)) : user_interaction_agenda.uima_state_lookup(uima, $NSESSION, NIL);
        }
    }

    public static final SubLObject is_nusketch_term_highlightableP(SubLObject v_agenda, SubLObject v_term) {
        return makeBoolean((NIL != is_nusketch_server_availableP()) && (NIL != isa.isaP(v_term, $$CoaDiagramObject, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED)));
    }

    public static final SubLObject is_nusketch_sentence_highlightableP(SubLObject v_agenda, SubLObject sentence) {
        {
            SubLObject doneP = NIL;
            SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
            SubLObject rest = NIL;
            for (rest = terms; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject v_term = rest.first();
                    if (NIL != forts.fort_p(v_term)) {
                        doneP = is_nusketch_term_highlightableP(v_agenda, v_term);
                    } else
                        if (v_term.isCons()) {
                            doneP = is_nusketch_sentence_highlightableP(v_agenda, v_term);
                        }

                }
            }
            return doneP;
        }
    }

    public static final SubLObject is_nusketch_assertion_highlightableP(SubLObject v_agenda, SubLObject assertion) {
        {
            SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
            return is_nusketch_sentence_highlightableP(v_agenda, formula);
        }
    }

    public static final SubLObject uiaext_nusketch_potentially_highlight_term(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, UNPROVIDED);
            SubLObject highlights = user_interaction_agenda.uia_state_lookup(v_agenda, $HIGHLIGHTS, UNPROVIDED);
            if (NIL != is_nusketch_term_highlightableP(v_agenda, v_term)) {
                rkf_collaborator_nusketch.rkfcoll_nusketch_highlight_entity(nsession, v_term);
                set.set_add(v_term, highlights);
            }
        }
        return v_agenda;
    }

    public static final SubLObject uiaext_nusketch_potentially_highlight_sentence(SubLObject v_agenda, SubLObject sentence) {
        {
            SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != forts.fort_p(v_term)) {
                    uiaext_nusketch_potentially_highlight_term(v_agenda, v_term);
                } else
                    if (v_term.isCons()) {
                        uiaext_nusketch_potentially_highlight_sentence(v_agenda, v_term);
                    }

            }
        }
        return v_agenda;
    }

    public static final SubLObject uiaext_nusketch_potentially_highlight_assertion(SubLObject v_agenda, SubLObject assertion) {
        {
            SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
            return uiaext_nusketch_potentially_highlight_sentence(v_agenda, formula);
        }
    }

    public static final SubLObject uiaext_get_term_highlight_state(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject highlights = user_interaction_agenda.uia_state_lookup(v_agenda, $HIGHLIGHTS, UNPROVIDED);
            if (NIL == set.set_p(highlights)) {
                highlights = set.new_set(UNPROVIDED, UNPROVIDED);
                user_interaction_agenda.uia_state_update(v_agenda, $HIGHLIGHTS, highlights);
            }
            return NIL != set.set_memberP(v_term, highlights) ? ((SubLObject) ($HIGH_LIGHTED)) : $NOT_HIGH_LIGHTED;
        }
    }

    public static final SubLObject uiaext_unhighlight_all_terms(SubLObject v_agenda) {
        {
            SubLObject highlights = user_interaction_agenda.uia_state_lookup(v_agenda, $HIGHLIGHTS, UNPROVIDED);
            SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, UNPROVIDED);
            if ((NIL != nsession) && (NIL != set.set_p(highlights))) {
                {
                    SubLObject set_contents_var = set.do_set_internal(highlights);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                                rkf_collaborator_nusketch.rkfcoll_nusketch_unhighlight_entity(nsession, v_term);
                            }
                        }
                    }
                }
            }
            user_interaction_agenda.uia_state_update(v_agenda, $HIGHLIGHTS, set.new_set(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Set up all the UIA specific aspects and then pass the action on
     * down to the low level details of the thread implementation.
     */
    public static final SubLObject uiaext_nusketch_polling_thread(SubLObject uima) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        api_control_vars.$the_cyclist$.bind(uia_setup_state.uima_user(uima), thread);
                        result = rkf_collaborator_nusketch.rkfcoll_nusketch_polling_thread(uima);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    // deflexical
    public static final SubLSymbol $cb_actioneditor_archive$ = makeSymbol("*CB-ACTIONEDITOR-ARCHIVE*");

    // deflexical
    public static final SubLSymbol $cb_actioneditor_codebase$ = makeSymbol("*CB-ACTIONEDITOR-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_actioneditor_class_file$ = makeSymbol("*CB-ACTIONEDITOR-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_actioneditor_default_height$ = makeSymbol("*CB-ACTIONEDITOR-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_actioneditor_default_width$ = makeSymbol("*CB-ACTIONEDITOR-DEFAULT-WIDTH*");

    public static final SubLObject cb_uiat_launch_action_editor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject domain_mt = constants_high.constant_name(user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                SubLObject lexical_mt = constants_high.constant_name(user_interaction_agenda.uia_lexical_interaction_mt(v_agenda));
                SubLObject port = add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$fi_port_offset$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Action_Editor);
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
                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($str_alt216$Add_Preconditions_and_Postconditi);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_actioneditor_class_file$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_actioneditor_codebase$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_actioneditor_archive$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_actioneditor_default_height$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($cb_actioneditor_default_width$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$scene);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt218$);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$microtheory);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(domain_mt);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$lexicalmicrotheory);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(lexical_mt);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$port);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(port);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$demo);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$false);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$user);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(uia_setup_state.uia_user(v_agenda));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt27$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
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

    public static final SubLObject cb_uiaext_scoop_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject scoop_session = user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED);
            if (NIL != rkf_collaborator_scoop.scoop_session_initializedP(scoop_session)) {
                cb_uiaext_show_current_scoop_settings(v_agenda, scoop_session);
            } else {
                cb_uiaext_offer_scoop_launching(v_agenda);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_show_current_scoop_settings(SubLObject v_agenda, SubLObject scoop_session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
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
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt227$cb_uiaext_modify_scoop_settings, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$SCOOP_Connection_Setup);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        {
                                            SubLObject machine = rkf_collaborator_scoop.scoop_session_machine(scoop_session);
                                            SubLObject port = rkf_collaborator_scoop.scoop_session_port(scoop_session);
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt229$SCOOP_is_currently_active_and_run);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
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
                                                SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt39$Machine___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$machine, machine, $int$60);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt42$Port___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$port, string_utilities.to_string(port), TWENTY_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Continue, $$$continue, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Stop, $$$stop, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Restart, $$$restart, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
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

    public static final SubLObject cb_uiaext_offer_scoop_launching(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
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
                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt227$cb_uiaext_modify_scoop_settings, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$SCOOP_Connection_Setup);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        {
                                            SubLObject machine = rkf_collaborator_scoop.$scoop_server_machine$.getDynamicValue(thread);
                                            SubLObject port = rkf_collaborator_scoop.$scoop_server_port$.getDynamicValue(thread);
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt234$Complete_the_following_informatio);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt235$Recall_that_the_SCOOP_connection_);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
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
                                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt39$Machine___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$machine, machine, $int$60);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt42$Port___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_text_input($$$port, string_utilities.to_string(port), TWENTY_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Start, $$$start, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Do_not_launch, $$$skip, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
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

    public static final SubLObject cb_uiaext_modify_scoop_settings(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject machine = html_utilities.html_extract_input($$$machine, args);
            SubLObject port_string = html_utilities.html_extract_input($$$port, args);
            SubLObject port = read_from_string_ignoring_errors(port_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != string_utilities.non_empty_stringP(html_utilities.html_extract_input($$$start, args))) {
                {
                    SubLObject scoop_session = rkf_collaborator_scoop.initialize_scoop_session(machine, port);
                    user_interaction_agenda.uia_state_update(v_agenda, $SCOOP_SESSION, scoop_session);
                    cb_uiaext_synchronize_scoop_with_topic(v_agenda, scoop_session);
                    user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt240$SCOOP_Server_operational_);
                }
            } else
                if (NIL != string_utilities.non_empty_stringP(html_utilities.html_extract_input($$$restart, args))) {
                    {
                        SubLObject scoop_session = user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED);
                        rkf_collaborator_scoop.restart_scoop_session(scoop_session);
                    }
                    user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt241$SCOOP_Server_connection_restarted);
                } else
                    if (NIL != string_utilities.non_empty_stringP(html_utilities.html_extract_input($$$stop, args))) {
                        {
                            SubLObject scoop_session = user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED);
                            rkf_collaborator_scoop.shutdown_scoop_session(scoop_session);
                            user_interaction_agenda.uia_state_clear(v_agenda, $SCOOP_SESSION);
                        }
                        user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt242$SCOOP_Server_halted_);
                    } else
                        if ((NIL != string_utilities.non_empty_stringP(html_utilities.html_extract_input($$$skip, args))) || (NIL != string_utilities.non_empty_stringP(html_utilities.html_extract_input($$$continue, args)))) {
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }



            cb_uiaext_scoop_setup(NIL);
        }
        return NIL;
    }

    public static final SubLObject cb_uiaext_synchronize_scoop_with_topic(SubLObject v_agenda, SubLObject scoop_session) {
        user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt244$Synchronizing_SCOOP_with_the_curr);
        rkf_collaborator_scoop.scoop_schedule_login_message(uia_setup_state.uia_user(v_agenda), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
        user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt245$SCOOP_synchronized_with_current_t);
        return v_agenda;
    }

    public static final SubLObject cb_uiaext_decouple_from_scoop(SubLObject v_agenda, SubLObject scoop_session) {
        rkf_collaborator_scoop.scoop_schedule_logout_message(uia_setup_state.uia_user(v_agenda), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
        user_interaction_agenda.uia_act_new_comment(v_agenda, $str_alt246$SCOOP_decoupled_from_current_topi);
        return v_agenda;
    }

    public static final SubLObject cb_uiaext_is_scoop_initializedP(SubLObject v_agenda) {
        {
            SubLObject scoop_session = user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED);
            return makeBoolean((NIL != rkf_collaborator_scoop.scoop_session_p(scoop_session)) && (NIL != rkf_collaborator_scoop.scoop_session_initializedP(scoop_session)));
        }
    }

    public static final SubLObject declare_cb_uia_collaborators_file() {
        declareFunction("uiaext_fire_results_hint", "UIAEXT-FIRE-RESULTS-HINT", 1, 0, false);
        declareFunction("cb_uiaext_fire_results_display", "CB-UIAEXT-FIRE-RESULTS-DISPLAY", 1, 0, false);
        declareFunction("cb_uiaext_fire_results_constructor", "CB-UIAEXT-FIRE-RESULTS-CONSTRUCTOR", 1, 0, false);
        declareFunction("cb_uiaext_fire_results_display_guts", "CB-UIAEXT-FIRE-RESULTS-DISPLAY-GUTS", 1, 0, false);
        declareFunction("cb_uiaext_fire_results_display_correspondences", "CB-UIAEXT-FIRE-RESULTS-DISPLAY-CORRESPONDENCES", 3, 0, false);
        declareFunction("cb_uiaext_fire_setup", "CB-UIAEXT-FIRE-SETUP", 0, 1, false);
        declareFunction("cb_uiaext_make_fire_session", "CB-UIAEXT-MAKE-FIRE-SESSION", 1, 0, false);
        declareFunction("uiaext_is_fire_initializedP", "UIAEXT-IS-FIRE-INITIALIZED?", 1, 0, false);
        declareFunction("uiaext_spawn_fire_analogy", "UIAEXT-SPAWN-FIRE-ANALOGY", 3, 0, false);
        declareFunction("uiaext_fire_analogy_reasoner_thread", "UIAEXT-FIRE-ANALOGY-REASONER-THREAD", 3, 0, false);
        declareFunction("uia_act_new_isi_why_not", "UIA-ACT-NEW-ISI-WHY-NOT", 3, 0, false);
        declareFunction("uiaext_isi_why_not_generate_request", "UIAEXT-ISI-WHY-NOT-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiaext_isi_why_not_hint", "UIAEXT-ISI-WHY-NOT-HINT", 1, 0, false);
        declareFunction("cb_uiaext_isi_why_not_render_request", "CB-UIAEXT-ISI-WHY-NOT-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiaext_isi_why_not_render_show_contribution", "CB-UIAEXT-ISI-WHY-NOT-RENDER-SHOW-CONTRIBUTION", 6, 0, false);
        declareFunction("cb_link_uiaext_criticize_query", "CB-LINK-UIAEXT-CRITICIZE-QUERY", 3, 0, false);
        declareFunction("cb_uiaext_criticize_query", "CB-UIAEXT-CRITICIZE-QUERY", 1, 0, false);
        declareFunction("cb_uiaext_convert_sf_state_to_isi_query", "CB-UIAEXT-CONVERT-SF-STATE-TO-ISI-QUERY", 2, 0, false);
        declareFunction("bb_enqueue_powerloom_problematic_query", "BB-ENQUEUE-POWERLOOM-PROBLEMATIC-QUERY", 6, 0, false);
        declareFunction("uiaext_isi_spawn_powerloom_query_critiquer", "UIAEXT-ISI-SPAWN-POWERLOOM-QUERY-CRITIQUER", 7, 0, false);
        declareFunction("uiaext_isi_handle_powerloom_query_response", "UIAEXT-ISI-HANDLE-POWERLOOM-QUERY-RESPONSE", 1, 0, false);
        declareFunction("uiaext_isi_extract_message", "UIAEXT-ISI-EXTRACT-MESSAGE", 1, 0, false);
        declareFunction("is_isi_why_not_query_critiquer_availableP", "IS-ISI-WHY-NOT-QUERY-CRITIQUER-AVAILABLE?", 0, 0, false);
        declareFunction("cb_uiaext_isi_why_not_setup", "CB-UIAEXT-ISI-WHY-NOT-SETUP", 0, 1, false);
        declareFunction("cb_uiaext_isi_why_not_session", "CB-UIAEXT-ISI-WHY-NOT-SESSION", 1, 0, false);
        declareFunction("cb_uiaext_nusketch_render_request", "CB-UIAEXT-NUSKETCH-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiaext_nusketch_render_request_show", "CB-UIAEXT-NUSKETCH-RENDER-REQUEST-SHOW", 2, 0, false);
        declareFunction("cb_uiaext_nusketch_setup", "CB-UIAEXT-NUSKETCH-SETUP", 0, 1, false);
        declareFunction("cb_uiaext_nusketch_session", "CB-UIAEXT-NUSKETCH-SESSION", 1, 0, false);
        declareFunction("cb_link_uiaext_nusketch_highlight", "CB-LINK-UIAEXT-NUSKETCH-HIGHLIGHT", 2, 0, false);
        declareFunction("cb_link_uiaext_nusketch_unhighlight", "CB-LINK-UIAEXT-NUSKETCH-UNHIGHLIGHT", 2, 0, false);
        declareFunction("cb_uiaext_nusketch_highlight", "CB-UIAEXT-NUSKETCH-HIGHLIGHT", 1, 0, false);
        declareFunction("cb_uiaext_nusketch_unhighlight", "CB-UIAEXT-NUSKETCH-UNHIGHLIGHT", 1, 0, false);
        declareFunction("uia_act_new_nusketch", "UIA-ACT-NEW-NUSKETCH", 3, 0, false);
        declareFunction("uiaext_nusketch_generate_request", "UIAEXT-NUSKETCH-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiaext_nusketch_hint", "UIAEXT-NUSKETCH-HINT", 1, 0, false);
        declareFunction("uiat_nusketch_decode_priority", "UIAT-NUSKETCH-DECODE-PRIORITY", 1, 0, false);
        declareFunction("is_nusketch_server_availableP", "IS-NUSKETCH-SERVER-AVAILABLE?", 0, 0, false);
        declareFunction("is_nusketch_term_highlightableP", "IS-NUSKETCH-TERM-HIGHLIGHTABLE?", 2, 0, false);
        declareFunction("is_nusketch_sentence_highlightableP", "IS-NUSKETCH-SENTENCE-HIGHLIGHTABLE?", 2, 0, false);
        declareFunction("is_nusketch_assertion_highlightableP", "IS-NUSKETCH-ASSERTION-HIGHLIGHTABLE?", 2, 0, false);
        declareFunction("uiaext_nusketch_potentially_highlight_term", "UIAEXT-NUSKETCH-POTENTIALLY-HIGHLIGHT-TERM", 2, 0, false);
        declareFunction("uiaext_nusketch_potentially_highlight_sentence", "UIAEXT-NUSKETCH-POTENTIALLY-HIGHLIGHT-SENTENCE", 2, 0, false);
        declareFunction("uiaext_nusketch_potentially_highlight_assertion", "UIAEXT-NUSKETCH-POTENTIALLY-HIGHLIGHT-ASSERTION", 2, 0, false);
        declareFunction("uiaext_get_term_highlight_state", "UIAEXT-GET-TERM-HIGHLIGHT-STATE", 2, 0, false);
        declareFunction("uiaext_unhighlight_all_terms", "UIAEXT-UNHIGHLIGHT-ALL-TERMS", 1, 0, false);
        declareFunction("uiaext_nusketch_polling_thread", "UIAEXT-NUSKETCH-POLLING-THREAD", 1, 0, false);
        declareFunction("cb_uiat_launch_action_editor", "CB-UIAT-LAUNCH-ACTION-EDITOR", 0, 1, false);
        declareFunction("cb_uiaext_scoop_setup", "CB-UIAEXT-SCOOP-SETUP", 0, 1, false);
        declareFunction("cb_uiaext_show_current_scoop_settings", "CB-UIAEXT-SHOW-CURRENT-SCOOP-SETTINGS", 2, 0, false);
        declareFunction("cb_uiaext_offer_scoop_launching", "CB-UIAEXT-OFFER-SCOOP-LAUNCHING", 1, 0, false);
        declareFunction("cb_uiaext_modify_scoop_settings", "CB-UIAEXT-MODIFY-SCOOP-SETTINGS", 1, 0, false);
        declareFunction("cb_uiaext_synchronize_scoop_with_topic", "CB-UIAEXT-SYNCHRONIZE-SCOOP-WITH-TOPIC", 2, 0, false);
        declareFunction("cb_uiaext_decouple_from_scoop", "CB-UIAEXT-DECOUPLE-FROM-SCOOP", 2, 0, false);
        declareFunction("cb_uiaext_is_scoop_initializedP", "CB-UIAEXT-IS-SCOOP-INITIALIZED?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_collaborators_file() {
        defparameter("*CB-USE-VIRB3-FOR-POWERLOOM*", NIL);
        defparameter("*POWERLOOM-TEST-QUERY*", $list_alt64);
        defparameter("*POWERLOOM-TEST-MT*", $const65$BiologicalWarfareDemoEnvironmentM);
        deflexical("*CB-CURRENT-UIA-STASHED*", NIL);
        deflexical("*POWERLOOM-SERVER-RUNNING?*", NIL);
        defparameter("*UIAEXT-DEFAULT-NUSKETCH-MACHINE*", Environment.get_network_name(Environment.get_machine_name($$$unknown)));
        defparameter("*UIAEXT-DEFAULT-NUSKETCH-PORT*", $int$1000);
        defparameter("*UIAEXT-SALIENT-DESCRIPTOR-PRIORITY*", $POSSIBLE);
        deflexical("*UIAEXT-CREATE-NEW-GUID-FOR-SKETCH*", $str_alt141$_create_new_guid_for_sketch_);
        deflexical("*UIAEXT-KNOWN-NUSKETCH-GUIDS-FOR-SKETCHES*", NIL != boundp($uiaext_known_nusketch_guids_for_sketches$) ? ((SubLObject) ($uiaext_known_nusketch_guids_for_sketches$.getGlobalValue())) : list(list($NAME, $$$Bridgehead_Sketch_Nr1, $GUID, $str_alt146$e38415fa_d886_11d6_934d_0002b3891), list($NAME, $$$Bridgehead_Sketch_Nr2, $GUID, $str_alt148$e38415fc_d886_11d6_934d_0002b3891), list($NAME, $$$Objective_Chester_Sketch_Nr1, $GUID, $str_alt150$e38415f8_d886_11d6_934d_0002b3891), list($NAME, $$$Objective_Chester_Sketch_Nr2, $GUID, $str_alt152$e3843d00_d886_11d6_934d_0002b3891), list($NAME, $$$Some_other_sketch, $GUID, $uiaext_create_new_guid_for_sketch$.getGlobalValue())));
        deflexical("*CB-ACTIONEDITOR-ARCHIVE*", $str_alt210$actioneditor_jar);
        deflexical("*CB-ACTIONEDITOR-CODEBASE*", $str_alt211$_java_rkf);
        deflexical("*CB-ACTIONEDITOR-CLASS-FILE*", $str_alt212$ActionEditor_class);
        deflexical("*CB-ACTIONEDITOR-DEFAULT-HEIGHT*", $int$600);
        deflexical("*CB-ACTIONEDITOR-DEFAULT-WIDTH*", $int$800);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_collaborators_file() {
                cb_uia_launchers.declare_cb_uia_launcher_internal($FIRE_SETUP, $SETUP, $$$FIRE_Server, $str_alt3$cb_uiaext_fire_setup, NIL, NIL, $$$Configure_the_FIRE_Server, NIL, NIL);
        cb_uia_launchers.declare_cb_uia_launcher_internal($ISI_WHY_NOT_SETUP, $SETUP, $$$ISI_WhyNot, $str_alt7$cb_uiaext_isi_why_not_setup, NIL, NIL, $$$Configure_the_ISI_WhyNot_Tool, NIL, NIL);
        cb_uia_launchers.declare_cb_uia_launcher_internal($NUSKETCH_SETUP, $SETUP, $$$nuSketch_Battlespace, $str_alt11$cb_uiaext_nusketch_setup, NIL, NIL, $str_alt12$Configure_the_nuSketch_Battlespac, NIL, NIL);
        uia_tool_declaration.declare_uia_tool($FIRE_RESULTS, $list_alt14);
        cb_uia_tool_declaration.declare_cb_uia_tool($FIRE_RESULTS, $list_alt15);
        html_macros.note_html_handler_function(CB_UIAEXT_FIRE_SETUP);
        html_macros.note_html_handler_function(CB_UIAEXT_MAKE_FIRE_SESSION);
        uia_tool_declaration.declare_uia_tool($ISI_WHY_NOT, $list_alt67);
        cb_uia_tool_declaration.declare_cb_uia_tool($ISI_WHY_NOT, $list_alt68);
        cb_utilities.setup_cb_link_method($UIAEXT_CRITICIZE_QUERY, CB_LINK_UIAEXT_CRITICIZE_QUERY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAEXT_CRITICIZE_QUERY);
        html_macros.note_html_handler_function(CB_UIAEXT_ISI_WHY_NOT_SETUP);
        html_macros.note_html_handler_function(CB_UIAEXT_ISI_WHY_NOT_SESSION);
        utilities_macros.register_html_state_variable($uiaext_default_nusketch_machine$);
        utilities_macros.register_html_state_variable($uiaext_default_nusketch_port$);
        utilities_macros.register_html_state_variable($uiaext_salient_descriptor_priority$);
        subl_macro_promotions.declare_defglobal($uiaext_known_nusketch_guids_for_sketches$);
        html_macros.note_html_handler_function(CB_UIAEXT_NUSKETCH_SETUP);
        html_macros.note_html_handler_function(CB_UIAEXT_NUSKETCH_SESSION);
        cb_utilities.setup_cb_link_method($UIAEXT_NUSKETCH_HIGHLIGHT, CB_LINK_UIAEXT_NUSKETCH_HIGHLIGHT, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAEXT_NUSKETCH_UNHIGHLIGHT, CB_LINK_UIAEXT_NUSKETCH_UNHIGHLIGHT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAEXT_NUSKETCH_HIGHLIGHT);
        html_macros.note_html_handler_function(CB_UIAEXT_NUSKETCH_UNHIGHLIGHT);
        uia_tool_declaration.declare_uia_tool($NUSKETCH, $list_alt202);
        cb_uia_tool_declaration.declare_cb_uia_tool($NUSKETCH, $list_alt203);
        html_macros.note_html_handler_function(CB_UIAT_LAUNCH_ACTION_EDITOR);
        html_macros.note_html_handler_function(CB_UIAEXT_SCOOP_SETUP);
        html_macros.note_html_handler_function(CB_UIAEXT_MODIFY_SCOOP_SETTINGS);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $FIRE_SETUP = makeKeyword("FIRE-SETUP");



    static private final SubLString $$$FIRE_Server = makeString("FIRE Server");

    static private final SubLString $str_alt3$cb_uiaext_fire_setup = makeString("cb-uiaext-fire-setup");

    static private final SubLString $$$Configure_the_FIRE_Server = makeString("Configure the FIRE Server");

    private static final SubLSymbol $ISI_WHY_NOT_SETUP = makeKeyword("ISI-WHY-NOT-SETUP");

    static private final SubLString $$$ISI_WhyNot = makeString("ISI WhyNot");

    static private final SubLString $str_alt7$cb_uiaext_isi_why_not_setup = makeString("cb-uiaext-isi-why-not-setup");

    static private final SubLString $$$Configure_the_ISI_WhyNot_Tool = makeString("Configure the ISI WhyNot Tool");

    private static final SubLSymbol $NUSKETCH_SETUP = makeKeyword("NUSKETCH-SETUP");

    static private final SubLString $$$nuSketch_Battlespace = makeString("nuSketch Battlespace");

    static private final SubLString $str_alt11$cb_uiaext_nusketch_setup = makeString("cb-uiaext-nusketch-setup");

    static private final SubLString $str_alt12$Configure_the_nuSketch_Battlespac = makeString("Configure the nuSketch Battlespace connection");

    private static final SubLSymbol $FIRE_RESULTS = makeKeyword("FIRE-RESULTS");

    static private final SubLList $list_alt14 = list($NAME, makeString("FIRE Analogy Server Results"), makeKeyword("HINT-METHOD"), makeSymbol("UIAEXT-FIRE-RESULTS-HINT"));

    static private final SubLList $list_alt15 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAEXT-FIRE-RESULTS-DISPLAY"));

    static private final SubLString $str_alt16$FIRE_of__A_and__A = makeString("FIRE of ~A and ~A");

    public static final SubLSymbol $kw17$INITIALIZED_ = makeKeyword("INITIALIZED?");

    private static final SubLSymbol $TERM_A = makeKeyword("TERM-A");

    private static final SubLSymbol $TERM_B = makeKeyword("TERM-B");



    static private final SubLString $$$FIRE_Analogy_Server_Insights = makeString("FIRE Analogy Server Insights");

    static private final SubLString $str_alt22$FIRE_compared_the_two_terms_ = makeString("FIRE compared the two terms ");

    static private final SubLString $str_alt23$_and_ = makeString(" and ");





    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt27$_Continue_ = makeString("[Continue]");

    static private final SubLString $$$Correspondences = makeString("Correspondences");



    static private final SubLList $list_alt30 = list(makeSymbol("FEATURE-A"), makeSymbol("FEATURE-B"));

    private static final SubLSymbol $FSESSION = makeKeyword("FSESSION");

    static private final SubLString $str_alt32$cthulhu_cyc_com = makeString("cthulhu.cyc.com");



    static private final SubLString $str_alt34$C__FIRE_ = makeString("C:\\FIRE\\");

    static private final SubLString $str_alt35$cyc_kb = makeString("cyc-kb");

    private static final SubLSymbol $MIXED_CASE = makeKeyword("MIXED-CASE");

    static private final SubLString $str_alt37$cb_uiaext_make_fire_session = makeString("cb-uiaext-make-fire-session");

    static private final SubLString $$$FIRE_Analogy_Server_Setup = makeString("FIRE Analogy Server Setup");

    static private final SubLString $str_alt39$Machine___ = makeString("Machine : ");

    static private final SubLString $$$machine = makeString("machine");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt42$Port___ = makeString("Port : ");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $str_alt44$Path__ = makeString("Path :");

    static private final SubLString $str_alt45$kb_path = makeString("kb-path");

    static private final SubLString $str_alt46$Name__ = makeString("Name :");

    static private final SubLString $str_alt47$kb_name = makeString("kb-name");

    static private final SubLString $str_alt48$pred_style = makeString("pred-style");

    static private final SubLString $$$Setup = makeString("Setup");

    static private final SubLString $$$setup = makeString("setup");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLString $$$continue = makeString("continue");

    private static final SubLSymbol CB_UIAEXT_FIRE_SETUP = makeSymbol("CB-UIAEXT-FIRE-SETUP");

    static private final SubLString $$$KEYWORD = makeString("KEYWORD");

    static private final SubLString $str_alt55$FIRE_Analogy_Server_operational_ = makeString("FIRE Analogy Server operational.");

    private static final SubLSymbol CB_UIAEXT_MAKE_FIRE_SESSION = makeSymbol("CB-UIAEXT-MAKE-FIRE-SESSION");

    static private final SubLString $$$FIRE_Analogy_Assistant = makeString("FIRE Analogy Assistant");

    private static final SubLSymbol UIAEXT_FIRE_ANALOGY_REASONER_THREAD = makeSymbol("UIAEXT-FIRE-ANALOGY-REASONER-THREAD");

    static private final SubLString $str_alt59$FIRE_is_investigating_the_analogy = makeString("FIRE is investigating the analogy between ~A and ~A .");

    static private final SubLString $$$CYC = makeString("CYC");



    static private final SubLString $str_alt62$FIRE_reasoning_failed_due_to_erro = makeString("FIRE reasoning failed due to error in FIRE session.");



    static private final SubLList $list_alt64 = list(constant_handles.reader_make_constant_shell(makeString("organismTypeCanLethallyInfect")), constant_handles.reader_make_constant_shell(makeString("Anthrax-Bacterium")), constant_handles.reader_make_constant_shell(makeString("Animal")));

    public static final SubLObject $const65$BiologicalWarfareDemoEnvironmentM = constant_handles.reader_make_constant_shell(makeString("BiologicalWarfareDemoEnvironmentMt"));

    private static final SubLSymbol $ISI_WHY_NOT = makeKeyword("ISI-WHY-NOT");

    static private final SubLList $list_alt67 = list($NAME, makeString("ISI Why Not"), makeKeyword("HINT-METHOD"), makeSymbol("UIAEXT-ISI-WHY-NOT-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAEXT-ISI-WHY-NOT-GENERATE-REQUEST"));

    static private final SubLList $list_alt68 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAEXT-ISI-WHY-NOT-RENDER-REQUEST"));

    private static final SubLSymbol $SHOW_CONTRIBUTION = makeKeyword("SHOW-CONTRIBUTION");



    static private final SubLString $str_alt71$ISI_Why_Not_Proposal = makeString("ISI Why-Not Proposal");

    static private final SubLList $list_alt72 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));

    static private final SubLList $list_alt73 = list(makeSymbol("&KEY"), makeSymbol("MISSING"), makeSymbol("MT"), makeSymbol("EXPLANATION"), makeSymbol("QUERY"), makeSymbol("HTML"));

    static private final SubLList $list_alt74 = list(makeKeyword("MISSING"), makeKeyword("MT"), makeKeyword("EXPLANATION"), makeKeyword("QUERY"), $HTML);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    static private final SubLString $str_alt81$Query_Critique_from_ISI_s_WhyNot_ = makeString("Query Critique from ISI's WhyNot Module");

    static private final SubLString $$$For_the_question = makeString("For the question");

    static private final SubLString $str_alt83$_the_Why_Not_module_has_determine = makeString(" the Why-Not module has determined that all of the");

    static private final SubLString $str_alt84$_following_facts_would_have_to_be = makeString(" following facts would have to be known for the query to succeed.");

    static private final SubLString $str_alt85$_the_WhyNot_module_could_not_iden = makeString(" the WhyNot module could not identify any particular");

    static private final SubLString $str_alt86$_missing_knowledge_ = makeString(" missing knowledge.");

    static private final SubLString $str_alt87$Reminder__ = makeString("Reminder: ");

    static private final SubLString $str_alt88$If_you_want_to_add_these_facts__c = makeString("If you want to add these facts, click on the ");

    static private final SubLString $str_alt89$___ = makeString("[+]");

    static private final SubLString $str_alt90$_next_to_the_sentence_and_use_the = makeString(" next to the sentence and use the ");

    static private final SubLString $str_alt91$__Assert_Similar__ = makeString(" [Assert Similar] ");

    static private final SubLString $str_alt92$_tool_to_add_them_ = makeString(" tool to add them.");

    static private final SubLString $str_alt93$Explanation_Detail_ = makeString("Explanation Detail:");

    static private final SubLString $str_alt94$_Ask_ISI_WhyNot_Query_Critiquer_ = makeString("[Ask ISI WhyNot Query Critiquer]");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt96$cb_uiaext_criticize_query = makeString("cb-uiaext-criticize-query");

    private static final SubLSymbol $UIAEXT_CRITICIZE_QUERY = makeKeyword("UIAEXT-CRITICIZE-QUERY");

    private static final SubLSymbol CB_LINK_UIAEXT_CRITICIZE_QUERY = makeSymbol("CB-LINK-UIAEXT-CRITICIZE-QUERY");

    static private final SubLList $list_alt99 = list(makeSymbol("UI-ID"), makeSymbol("SF-STATE"));

    private static final SubLSymbol CB_UIAEXT_CRITICIZE_QUERY = makeSymbol("CB-UIAEXT-CRITICIZE-QUERY");



    static private final SubLString $str_alt102$FAILED_QUERY = makeString("FAILED-QUERY");



    static private final SubLString $str_alt104$The_query__S_with_the_settings_Mt = makeString("The query ~S with the settings Mt ~S, Backchains ~S, number ~S, time ~S and depth ~S was sent off to the ISI Why-Not Query Critiquer.");

    private static final SubLSymbol $CONTR = makeKeyword("CONTR");

    static private final SubLList $list_alt106 = list(makeSymbol("PROPOSAL"), makeSymbol("&KEY"), makeSymbol("SOLUTION"), makeSymbol("ANSWER-TO"));

    static private final SubLList $list_alt107 = list(makeKeyword("SOLUTION"), makeKeyword("ANSWER-TO"));

    private static final SubLSymbol $SOLUTION = makeKeyword("SOLUTION");

    private static final SubLSymbol $ANSWER_TO = makeKeyword("ANSWER-TO");

    private static final SubLSymbol $MISSING_ASSERTIONS = makeKeyword("MISSING-ASSERTIONS");

    private static final SubLSymbol $EXPLANATION_XML = makeKeyword("EXPLANATION-XML");

    private static final SubLSymbol $EXPLANATION_ASCII = makeKeyword("EXPLANATION-ASCII");

    private static final SubLSymbol $EXPLANATION_HTML = makeKeyword("EXPLANATION-HTML");



    private static final SubLSymbol $BACKCHAINS = makeKeyword("BACKCHAINS");







    static private final SubLString $str_alt119$cb_uiaext_isi_why_not_session = makeString("cb-uiaext-isi-why-not-session");

    static private final SubLString $str_alt120$ISI_Why_Not_Setup = makeString("ISI Why-Not Setup");

    static private final SubLString $str_alt121$The_ISI_Why_Not_Server_is_current = makeString("The ISI Why-Not Server is currently ");

    static private final SubLString $$$running = makeString("running");

    static private final SubLString $$$not_running = makeString("not running");

    static private final SubLString $str_alt124$_ = makeString(".");

    static private final SubLString $$$Run_Test = makeString("Run Test");

    static private final SubLString $$$test = makeString("test");

    private static final SubLSymbol CB_UIAEXT_ISI_WHY_NOT_SETUP = makeSymbol("CB-UIAEXT-ISI-WHY-NOT-SETUP");

    private static final SubLSymbol UIAEXT_ISI_HANDLE_POWERLOOM_QUERY_RESPONSE = makeSymbol("UIAEXT-ISI-HANDLE-POWERLOOM-QUERY-RESPONSE");

    public static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol CB_UIAEXT_ISI_WHY_NOT_SESSION = makeSymbol("CB-UIAEXT-ISI-WHY-NOT-SESSION");

    static private final SubLList $list_alt131 = list(makeSymbol("&KEY"), makeSymbol("ENTITY"));

    static private final SubLList $list_alt132 = list(makeKeyword("ENTITY"));

    private static final SubLSymbol $ENTITY = makeKeyword("ENTITY");

    static private final SubLString $$$nuSketch_Battlespace_Module = makeString("nuSketch Battlespace Module");

    static private final SubLString $str_alt135$Entity__ = makeString("Entity: ");

    static private final SubLString $$$unknown = makeString("unknown");

    public static final SubLSymbol $uiaext_default_nusketch_machine$ = makeSymbol("*UIAEXT-DEFAULT-NUSKETCH-MACHINE*");

    public static final SubLSymbol $uiaext_default_nusketch_port$ = makeSymbol("*UIAEXT-DEFAULT-NUSKETCH-PORT*");



    public static final SubLSymbol $uiaext_salient_descriptor_priority$ = makeSymbol("*UIAEXT-SALIENT-DESCRIPTOR-PRIORITY*");

    static private final SubLString $str_alt141$_create_new_guid_for_sketch_ = makeString("$create new guid for sketch$");

    public static final SubLSymbol $uiaext_known_nusketch_guids_for_sketches$ = makeSymbol("*UIAEXT-KNOWN-NUSKETCH-GUIDS-FOR-SKETCHES*");



    static private final SubLString $$$Bridgehead_Sketch_Nr1 = makeString("Bridgehead Sketch Nr1");



    static private final SubLString $str_alt146$e38415fa_d886_11d6_934d_0002b3891 = makeString("e38415fa-d886-11d6-934d-0002b3891c5a");

    static private final SubLString $$$Bridgehead_Sketch_Nr2 = makeString("Bridgehead Sketch Nr2");

    static private final SubLString $str_alt148$e38415fc_d886_11d6_934d_0002b3891 = makeString("e38415fc-d886-11d6-934d-0002b3891c5a");

    static private final SubLString $$$Objective_Chester_Sketch_Nr1 = makeString("Objective Chester Sketch Nr1");

    static private final SubLString $str_alt150$e38415f8_d886_11d6_934d_0002b3891 = makeString("e38415f8-d886-11d6-934d-0002b3891c5a");

    static private final SubLString $$$Objective_Chester_Sketch_Nr2 = makeString("Objective Chester Sketch Nr2");

    static private final SubLString $str_alt152$e3843d00_d886_11d6_934d_0002b3891 = makeString("e3843d00-d886-11d6-934d-0002b3891c5a");

    static private final SubLString $$$Some_other_sketch = makeString("Some other sketch");

    private static final SubLSymbol $NSESSION = makeKeyword("NSESSION");

    static private final SubLString $str_alt155$cb_uiaext_nusketch_session = makeString("cb-uiaext-nusketch-session");

    static private final SubLString $$$nuSketch_Battlespace_Setup = makeString("nuSketch Battlespace Setup");

    static private final SubLString $str_alt157$Nusketch_server_is_active_on__A_p = makeString("Nusketch server is active on ~A port ~A");

    static private final SubLString $$$Reset_nuSketch_connection = makeString("Reset nuSketch connection");

    static private final SubLString $$$reset = makeString("reset");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt161$We_will_be_discussing_the_followi = makeString("We will be discussing the following nuSketch: ");

    static private final SubLString $$$SketchGuid = makeString("SketchGuid");

    static private final SubLList $list_alt163 = list(makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("GUID"));

    static private final SubLList $list_alt164 = list($NAME, $GUID);

    static private final SubLString $str_alt165$Interview_me_about_new_terms_ = makeString("Interview me about new terms:");

    static private final SubLString $$$80 = makeString("80");

    static private final SubLString $$$Immediately = makeString("Immediately");

    static private final SubLString $$$Later = makeString("Later");

    static private final SubLString $$$Never = makeString("Never");

    static private final SubLString $$$priority = makeString("priority");

    static private final SubLString $str_alt171$_relevant = makeString(":relevant");

    static private final SubLString $str_alt172$_possible = makeString(":possible");

    static private final SubLString $str_alt173$_none = makeString(":none");

    private static final SubLSymbol CB_UIAEXT_NUSKETCH_SETUP = makeSymbol("CB-UIAEXT-NUSKETCH-SETUP");

    static private final SubLString $str_alt175$Stopping_polling_thread___ = makeString("Stopping polling thread.~%");

    private static final SubLSymbol $NUSKETCH_GUID = makeKeyword("NUSKETCH-GUID");

    static private final SubLString $str_alt177$The_sketch_you_identified_was_not = makeString("The sketch you identified was not understood; nuSketch connection failed.");

    static private final SubLString $str_alt178$Setting_up_connection_to_server_o = makeString("Setting up connection to server on ~A, port ~A~%");

    static private final SubLString $str_alt179$nuSketch_Battlespace_Server_opera = makeString("nuSketch Battlespace Server operational~%Running on ~A, port ~A~%");

    static private final SubLString $str_alt180$Starting_polling_thread_for_extra = makeString("Starting polling thread for extracting user actions from nuSketch.~%");

    private static final SubLSymbol $POLLING_LOCK = makeKeyword("POLLING-LOCK");

    static private final SubLString $$$nuSketch_Polling_Lock = makeString("nuSketch Polling Lock");





    private static final SubLSymbol $POLLING_ARGS = makeKeyword("POLLING-ARGS");

    static private final SubLString $str_alt186$Unable_to_contact_server_on__A__p = makeString("Unable to contact server on ~A, port ~A~%NuSketch not initialized.~%");

    private static final SubLSymbol CB_UIAEXT_NUSKETCH_SESSION = makeSymbol("CB-UIAEXT-NUSKETCH-SESSION");

    static private final SubLString $str_alt188$cb_uiaext_nusketch_highlight = makeString("cb-uiaext-nusketch-highlight");

    private static final SubLSymbol $UIAEXT_NUSKETCH_HIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-HIGHLIGHT");

    private static final SubLSymbol CB_LINK_UIAEXT_NUSKETCH_HIGHLIGHT = makeSymbol("CB-LINK-UIAEXT-NUSKETCH-HIGHLIGHT");

    static private final SubLString $str_alt191$cb_uiaext_nusketch_unhighlight = makeString("cb-uiaext-nusketch-unhighlight");

    private static final SubLSymbol $UIAEXT_NUSKETCH_UNHIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-UNHIGHLIGHT");

    private static final SubLSymbol CB_LINK_UIAEXT_NUSKETCH_UNHIGHLIGHT = makeSymbol("CB-LINK-UIAEXT-NUSKETCH-UNHIGHLIGHT");

    static private final SubLList $list_alt194 = list(makeSymbol("TERM"));

    private static final SubLSymbol $HIGHLIGHTS = makeKeyword("HIGHLIGHTS");

    static private final SubLString $str_alt196$Highlighting__A_in_nuSketch = makeString("Highlighting ~A in nuSketch");



    private static final SubLSymbol CB_UIAEXT_NUSKETCH_HIGHLIGHT = makeSymbol("CB-UIAEXT-NUSKETCH-HIGHLIGHT");

    static private final SubLString $str_alt199$Unhighlighting__A_in_nuSketch = makeString("Unhighlighting ~A in nuSketch");

    private static final SubLSymbol CB_UIAEXT_NUSKETCH_UNHIGHLIGHT = makeSymbol("CB-UIAEXT-NUSKETCH-UNHIGHLIGHT");

    private static final SubLSymbol $NUSKETCH = makeKeyword("NUSKETCH");

    static private final SubLList $list_alt202 = list($NAME, makeString("nuSketch Battlespace"), makeKeyword("HINT-METHOD"), makeSymbol("UIAEXT-NUSKETCH-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAEXT-NUSKETCH-GENERATE-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("NusketchBattlespaceSketchTool")));

    static private final SubLList $list_alt203 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAEXT-NUSKETCH-RENDER-REQUEST"));

    static private final SubLString $$$nuSketch_Battlespace_server = makeString("nuSketch Battlespace server");



    public static final SubLObject $$CoaDiagramObject = constant_handles.reader_make_constant_shell(makeString("CoaDiagramObject"));



    private static final SubLSymbol $HIGH_LIGHTED = makeKeyword("HIGH-LIGHTED");

    private static final SubLSymbol $NOT_HIGH_LIGHTED = makeKeyword("NOT-HIGH-LIGHTED");

    static private final SubLString $str_alt210$actioneditor_jar = makeString("actioneditor.jar");

    static private final SubLString $str_alt211$_java_rkf = makeString("/java/rkf");

    static private final SubLString $str_alt212$ActionEditor_class = makeString("ActionEditor.class");

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$800 = makeInteger(800);

    static private final SubLString $$$Action_Editor = makeString("Action Editor");

    static private final SubLString $str_alt216$Add_Preconditions_and_Postconditi = makeString("Add Preconditions and Postconditions of Scene");

    static private final SubLString $$$scene = makeString("scene");

    static private final SubLString $str_alt218$ = makeString("");

    static private final SubLString $$$microtheory = makeString("microtheory");

    static private final SubLString $$$lexicalmicrotheory = makeString("lexicalmicrotheory");

    static private final SubLString $$$demo = makeString("demo");

    static private final SubLString $$$false = makeString("false");

    static private final SubLString $$$user = makeString("user");

    private static final SubLSymbol CB_UIAT_LAUNCH_ACTION_EDITOR = makeSymbol("CB-UIAT-LAUNCH-ACTION-EDITOR");

    private static final SubLSymbol $SCOOP_SESSION = makeKeyword("SCOOP-SESSION");

    private static final SubLSymbol CB_UIAEXT_SCOOP_SETUP = makeSymbol("CB-UIAEXT-SCOOP-SETUP");

    static private final SubLString $str_alt227$cb_uiaext_modify_scoop_settings = makeString("cb-uiaext-modify-scoop-settings");

    static private final SubLString $$$SCOOP_Connection_Setup = makeString("SCOOP Connection Setup");

    static private final SubLString $str_alt229$SCOOP_is_currently_active_and_run = makeString("SCOOP is currently active and running.");

    static private final SubLString $$$Stop = makeString("Stop");

    static private final SubLString $$$stop = makeString("stop");

    static private final SubLString $$$Restart = makeString("Restart");

    static private final SubLString $$$restart = makeString("restart");

    static private final SubLString $str_alt234$Complete_the_following_informatio = makeString("Complete the following information to launch SCOOP.");

    static private final SubLString $str_alt235$Recall_that_the_SCOOP_connection_ = makeString("Recall that the SCOOP connection has to have been started before the SCOOP Server itself can be launched.");

    static private final SubLString $$$Start = makeString("Start");

    static private final SubLString $$$start = makeString("start");

    static private final SubLString $$$Do_not_launch = makeString("Do not launch");

    static private final SubLString $$$skip = makeString("skip");

    static private final SubLString $str_alt240$SCOOP_Server_operational_ = makeString("SCOOP Server operational.");

    static private final SubLString $str_alt241$SCOOP_Server_connection_restarted = makeString("SCOOP Server connection restarted.");

    static private final SubLString $str_alt242$SCOOP_Server_halted_ = makeString("SCOOP Server halted.");

    private static final SubLSymbol CB_UIAEXT_MODIFY_SCOOP_SETTINGS = makeSymbol("CB-UIAEXT-MODIFY-SCOOP-SETTINGS");

    static private final SubLString $str_alt244$Synchronizing_SCOOP_with_the_curr = makeString("Synchronizing SCOOP with the current topic.");

    static private final SubLString $str_alt245$SCOOP_synchronized_with_current_t = makeString("SCOOP synchronized with current topic.");

    static private final SubLString $str_alt246$SCOOP_decoupled_from_current_topi = makeString("SCOOP decoupled from current topic.");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_collaborators_file();
    }

    public void initializeVariables() {
        init_cb_uia_collaborators_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_collaborators_file();
    }
}

