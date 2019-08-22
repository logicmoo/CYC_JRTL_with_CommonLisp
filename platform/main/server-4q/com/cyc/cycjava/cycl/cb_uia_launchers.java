/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.eighth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ninth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.seventh;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 *  module:      CB-UIA-LAUNCHERS
 *  source file: /cyc/top/cycl/cb-uia-launchers.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uia_launchers extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_launchers() {
    }

    public static final SubLFile me = new cb_uia_launchers();


    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_uia_launch_sections$ = makeSymbol("*CB-UIA-LAUNCH-SECTIONS*");

    public static final SubLObject cb_uia_launch_sections() {
        return Mapping.mapcar(symbol_function(FIRST), $cb_uia_launch_sections$.getGlobalValue());
    }

    public static final SubLObject cb_uia_launch_section_name(SubLObject section_spec) {
        return second(assoc(section_spec, $cb_uia_launch_sections$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    // deflexical
    private static final SubLSymbol $cb_uia_launchers$ = makeSymbol("*CB-UIA-LAUNCHERS*");

    public static final SubLObject cb_uia_launch_section_launchers(SubLObject section_spec) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            if (!(($SETUP.eql(section_spec) || $DEBUGGING.eql(section_spec)) || (NIL != uia_setup_state.uia_setup_completeP(v_agenda)))) {
                return NIL;
            }
            if ($DEBUGGING.eql(section_spec) && (NIL == uima_interface_parameter_declaration.uia_show_debug_linksP(v_agenda))) {
                return NIL;
            }
            {
                SubLObject v_answer = NIL;
                SubLObject cdolist_list_var = $cb_uia_launchers$.getGlobalValue();
                SubLObject launcher_info = NIL;
                for (launcher_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , launcher_info = cdolist_list_var.first()) {
                    if (section_spec == second(launcher_info)) {
                        v_answer = cons(launcher_info.first(), v_answer);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @param DISABLED:
     * 		NIL, :DISABLED, or :DISABLED-EXTERNAL.
     */
    public static final SubLObject declare_cb_uia_launcher_internal(SubLObject launcher_spec, SubLObject section_spec, SubLObject launcher_name, SubLObject launcher_url, SubLObject disabled, SubLObject target, SubLObject launcher_tip, SubLObject cycl, SubLObject on_click) {
        if (disabled == UNPROVIDED) {
            disabled = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (launcher_tip == UNPROVIDED) {
            launcher_tip = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (on_click == UNPROVIDED) {
            on_click = NIL;
        }
        SubLTrampolineFile.checkType(launcher_spec, KEYWORDP);
        SubLTrampolineFile.checkType(section_spec, KEYWORDP);
        SubLTrampolineFile.checkType(launcher_name, STRINGP);
        SubLTrampolineFile.checkType(launcher_url, STRINGP);
        if (NIL != target) {
            SubLTrampolineFile.checkType(target, STRINGP);
        }
        {
            SubLObject launcher_info = assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == launcher_info) {
                launcher_info = make_list(NINE_INTEGER, UNPROVIDED);
                $cb_uia_launchers$.setGlobalValue(cons(launcher_info, $cb_uia_launchers$.getGlobalValue()));
            }
            set_nth(ZERO_INTEGER, launcher_info, launcher_spec);
            set_nth(ONE_INTEGER, launcher_info, section_spec);
            set_nth(TWO_INTEGER, launcher_info, launcher_name);
            set_nth(THREE_INTEGER, launcher_info, launcher_url);
            set_nth(FOUR_INTEGER, launcher_info, disabled);
            set_nth(FIVE_INTEGER, launcher_info, target);
            set_nth(SIX_INTEGER, launcher_info, launcher_tip);
            set_nth(SEVEN_INTEGER, launcher_info, cycl);
            set_nth(EIGHT_INTEGER, launcher_info, on_click);
        }
        return launcher_spec;
    }

    public static final SubLObject cb_uia_launcher_spec_from_launcher(SubLObject launcher) {
        return launcher.first();
    }

    public static final SubLObject cb_uia_launcher_section_from_launcher(SubLObject launcher) {
        return second(launcher);
    }

    public static final SubLObject cb_uia_launcher_name_from_launcher(SubLObject launcher) {
        return third(launcher);
    }

    public static final SubLObject cb_uia_launcher_url_from_launcher(SubLObject launcher) {
        return fourth(launcher);
    }

    public static final SubLObject cb_uia_launcher_disabled_from_launcher(SubLObject launcher) {
        return fifth(launcher);
    }

    public static final SubLObject cb_uia_launcher_target_from_launcher(SubLObject launcher) {
        return sixth(launcher);
    }

    public static final SubLObject cb_uia_launcher_tip_from_launcher(SubLObject launcher) {
        return seventh(launcher);
    }

    public static final SubLObject cb_uia_launcher_cycl_from_launcher(SubLObject launcher) {
        return eighth(launcher);
    }

    public static final SubLObject cb_uia_launcher_on_click_from_launcher(SubLObject launcher) {
        return ninth(launcher);
    }

    public static final SubLObject cb_uia_launcher_name(SubLObject launcher_spec) {
        return cb_uia_launcher_name_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_url(SubLObject launcher_spec) {
        return cb_uia_launcher_url_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_disabled(SubLObject launcher_spec) {
        return cb_uia_launcher_disabled_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_target(SubLObject launcher_spec) {
        return cb_uia_launcher_target_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_tip(SubLObject launcher_spec) {
        return cb_uia_launcher_tip_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_cycl(SubLObject launcher_spec) {
        return cb_uia_launcher_cycl_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_on_click(SubLObject launcher_spec) {
        return cb_uia_launcher_on_click_from_launcher(assoc(launcher_spec, $cb_uia_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uia_launcher_from_cycl(SubLObject cycl) {
        if (NIL != cycl) {
            return find(cycl, $cb_uia_launchers$.getGlobalValue(), EQ, CB_UIA_LAUNCHER_CYCL_FROM_LAUNCHER, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TERM
     * 		cycl-term
     * @param MT
     * 		
     * @return vector, the cb-uia-launcher, as described in @xref declare-cb-uia-launcher-internal
     */
    public static final SubLObject cb_uia_salient_descriptor_launcher_for_term_internal(SubLObject v_term, SubLObject mt) {
        return cb_uia_launcher_spec_from_launcher(cb_uia_launcher_from_cycl(ask_utilities.ask_variable($sym8$_X, list($const9$uiaSalientDescriptorLauncherForTe, $sym8$_X, v_term), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
    }

    public static final SubLObject cb_uia_salient_descriptor_launcher_for_term(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return cb_uia_salient_descriptor_launcher_for_term_internal(v_term, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CB_UIA_SALIENT_DESCRIPTOR_LAUNCHER_FOR_TERM, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CB_UIA_SALIENT_DESCRIPTOR_LAUNCHER_FOR_TERM, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CB_UIA_SALIENT_DESCRIPTOR_LAUNCHER_FOR_TERM, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(cb_uia_salient_descriptor_launcher_for_term_internal(v_term, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown stub
     */
    public static final SubLObject cb_uia_launcher_allow_salient_descriptionP(SubLObject v_term, SubLObject mt) {
        if (v_term == rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue()) {
            return NIL;
        } else {
            return T;
        }
    }

    public static final SubLObject declare_cb_uia_launcher(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject launcher_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            launcher_spec = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt11);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt11);
                    if (NIL == member(current_1, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
                {
                    SubLObject section_tail = property_list_member($SECTION, current);
                    SubLObject section = (NIL != section_tail) ? ((SubLObject) (cadr(section_tail))) : $DEBUGGING;
                    SubLObject name_tail = property_list_member($NAME, current);
                    SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : $$$Unnamed_Launcher;
                    SubLObject url_tail = property_list_member($URL, current);
                    SubLObject url = (NIL != url_tail) ? ((SubLObject) (cadr(url_tail))) : NIL;
                    SubLObject disabled_tail = property_list_member($DISABLED, current);
                    SubLObject disabled = (NIL != disabled_tail) ? ((SubLObject) (cadr(disabled_tail))) : NIL;
                    SubLObject target_tail = property_list_member($TARGET, current);
                    SubLObject target = (NIL != target_tail) ? ((SubLObject) (cadr(target_tail))) : NIL;
                    SubLObject tip_tail = property_list_member($TIP, current);
                    SubLObject tip = (NIL != tip_tail) ? ((SubLObject) (cadr(tip_tail))) : NIL;
                    SubLObject help_url_tail = property_list_member($HELP_URL, current);
                    SubLObject help_url = (NIL != help_url_tail) ? ((SubLObject) (cadr(help_url_tail))) : NIL;
                    SubLObject cycl_tail = property_list_member($CYCL, current);
                    SubLObject cycl = (NIL != cycl_tail) ? ((SubLObject) (cadr(cycl_tail))) : NIL;
                    SubLObject on_click_tail = property_list_member($ON_CLICK, current);
                    SubLObject on_click = (NIL != on_click_tail) ? ((SubLObject) (cadr(on_click_tail))) : NIL;
                    return list(new SubLObject[]{ DECLARE_CB_UIA_LAUNCHER_INTERNAL, launcher_spec, section, name, url, disabled, target, tip, cycl, on_click });
                }
            }
        }
    }

    public static final SubLObject cb_uia_launch_configure_interface(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_setup.uia_act_new_configure_interface(v_agenda);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_user_modeler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_setup.uia_act_new_user_modeler(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_topic_specifier(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_setup.uia_act_new_topic_specifier(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_specify_topic(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt39$_Specify_Topic_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(EMPTY_SUBL_OBJECT_ARRAY);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt37$cb_uia_launch_topic_specifier, arglist);
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

    public static final SubLObject cb_uia_launch_knowledge_scrapbook(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $KNOWLEDGE_SCRAPBOOK, NIL, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_domain_examples(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_browsing.uia_act_new_domain_examples(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_ontology_browser(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_browsing.uia_act_new_focused_ontology_browser(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_concept_recognizer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Concept_Recognizer);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt61$cb_uia_handle_launch_concept_reco, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Concept_Recognizer);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), cb_uia_macros.$cb_uiat_generate_entry_boxes_js$.getGlobalValue());
                                        {
                                            SubLObject size = $int$30;
                                            SubLObject id_stem = $$$phrase;
                                            SubLObject parent_id = $str_alt64$phrase_cell;
                                            html_utilities.html_newline(UNPROVIDED);
                                            {
                                                SubLObject counter_name = cb_uia_macros.cb_uiat_generate_counters_name(id_stem);
                                                SubLObject counter_id = cb_uia_macros.cb_uiat_generate_counters_id(id_stem);
                                                html_utilities.html_hidden_input(counter_name, ZERO_INTEGER, counter_id);
                                                html_utilities.html_hidden_input($$$StemId, id_stem, UNPROVIDED);
                                            }
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
                                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$3);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt69$Concept_to_search_for__);
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                    {
                                                                        SubLObject event_script = cb_uia_macros.cb_uiat_compute_generating_event_js(parent_id, id_stem, size, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($$$button);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_princ($$$add_another);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (NIL != event_script) {
                                                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(event_script);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != parent_id) {
                                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(parent_id);
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
                                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject input_id = cb_uia_macros.cb_uiat_non_generated_id(id_stem, UNPROVIDED);
                                                                        html_utilities.html_text_input(input_id, NIL, size);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
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
                                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_submit_input($$$Search, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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

    public static final SubLObject cb_uia_handle_launch_concept_recognizer(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject values = cb_uia_macros.cb_uiat_extract_generated_input_values(args, $$$phrase);
            SubLObject cdolist_list_var = nreverse(values);
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                if (NIL == string_utilities.empty_string_p(phrase)) {
                    uia_tools_browsing.uia_act_new_concept_recognizer(v_agenda, $REQUIRED, phrase, NIL);
                }
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_asserted_sentences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Known_Facts);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
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
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt80$cb_uia_handle_launch_asserted_sen, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Known_Facts);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt81$Show_known_facts_about__);
                                        html_utilities.html_text_input($$$phrase, NIL, $int$30);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_handle_launch_asserted_sentences(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
            uia_tools_browsing.uia_act_new_asserted_sentences(v_agenda, $REQUIRED, phrase, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_glossary(SubLObject args) {
        cb_uia_tools_glossary.cb_uia_show_glossary(NIL);
        return NIL;
    }

    public static final SubLObject cb_uia_handle_launch_glossary(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject possible_glossaries = uia_tools_glossary.uia_relevant_glossaries(v_agenda);
            SubLObject glossary_requested = NIL;
            SubLObject cdolist_list_var = possible_glossaries;
            SubLObject glossary = NIL;
            for (glossary = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , glossary = cdolist_list_var.first()) {
                if (NIL != html_utilities.html_extract_input(format(NIL, $str_alt89$GLOSSARY_A, glossary), args)) {
                    glossary_requested = glossary;
                }
            }
            if (NIL != glossary_requested) {
                uia_tools_glossary.uia_act_new_glossary(v_agenda, $REQUIRED, glossary_requested, UNPROVIDED, UNPROVIDED);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_concept_comparator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                if (args.isString()) {
                    phrase = args;
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Concept_Comparator);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt97$cb_uia_handle_launch_concept_comp, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Concept_Comparator);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($$$I_want_to_compare_and_contrast);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_text_input($$$phrase1, phrase, $int$40);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($$$and);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_text_input($$$phrase2, NIL, $int$40);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
    }

    public static final SubLObject cb_uia_handle_launch_concept_comparator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase1 = html_utilities.html_extract_input($$$phrase1, args);
            SubLObject phrase2 = html_utilities.html_extract_input($$$phrase2, args);
            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
            uia_tools_browsing.uia_act_new_concept_comparator(v_agenda, $REQUIRED, phrase1, phrase2, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_concept_relator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Concept_Relator);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
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
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt110$cb_uia_handle_launch_concept_rela, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Concept_Relator);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt111$Show_terms_related_to__);
                                        html_utilities.html_text_input($$$phrase, NIL, $int$30);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_handle_launch_concept_relator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
            cb_uia_tools_browsing.uia_act_new_concept_relator(v_agenda, $REQUIRED, phrase, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_predicate_suggestor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Predicate_Suggestor);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt119$cb_uia_handle_launch_predicate_su, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Predicate_Suggestor);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($$$What_predicates_could_apply_to);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$phrase, NIL, $int$30);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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

    public static final SubLObject cb_uia_handle_launch_predicate_suggestor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
            uia_tools_browsing.uia_act_new_predicate_suggestor(v_agenda, $REQUIRED, phrase, NIL, $$Collection);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_relationship_suggestor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Relationship_Suggestor);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt129$cb_uia_handle_launch_relationship, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Relationship_Suggestor);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($$$How_could_I_relate);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$phrase1, NIL, $int$40);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($$$and);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$phrase2, NIL, $int$40);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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

    public static final SubLObject cb_uia_handle_launch_relationship_suggestor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase1 = html_utilities.html_extract_input($$$phrase1, args);
            SubLObject phrase2 = html_utilities.html_extract_input($$$phrase2, args);
            uia_tools_browsing.uia_act_new_relationship_suggestor(v_agenda, $REQUIRED, phrase1, phrase2, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    /**
     * Format the Dictionary Search front-end HTML form
     */
    public static final SubLObject cb_uia_launch_lexicon_search(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Dictionary_Search);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt139$cb_uia_handle_launch_lexicon_sear, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Dictionary_Search);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt140$Find_concepts_with_the_words_);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($str_alt141$_pattern, NIL, $int$30);
                                        html_utilities.html_submit_input($$$Search, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt142$occurring_);
                                        html_utilities.html_radio_input($str_alt143$_search_type, $str_alt144$_prefix, NIL, UNPROVIDED_SYM);
                                        html_utilities.html_princ($$$at_the_beginning);
                                        html_utilities.html_indent(UNPROVIDED);
                                        html_utilities.html_radio_input($str_alt143$_search_type, $str_alt146$_infix, T);
                                        html_utilities.html_princ($$$anywhere);
                                        html_utilities.html_indent(UNPROVIDED);
                                        html_utilities.html_radio_input($str_alt143$_search_type, $str_alt148$_suffix, NIL);
                                        html_utilities.html_princ($$$at_the_end);
                                        html_utilities.html_indent(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        if (NIL == nl_trie_accessors.nl_trie_rotation_index_initializedP()) {
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt150$Note__The_dictionary_searching_in);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt151$This_may_take_a_few_minutes_);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
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

    /**
     * Invoke the lexicon search using :pattern and :search-type extracted from the html form fields in ARGS
     */
    public static final SubLObject cb_uia_handle_launch_lexicon_search(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject pattern = html_utilities.html_extract_input($str_alt141$_pattern, args);
            SubLObject search_type_text = html_utilities.html_extract_input($str_alt143$_search_type, args);
            SubLObject search_type = read_from_string_ignoring_errors(search_type_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            uia_tools_browsing.uia_act_new_lexicon_search(v_agenda, $REQUIRED, pattern, search_type);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_concept_creator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Concept_Creator);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt159$cb_uia_handle_launch_concept_crea, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Concept_Creator);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt160$I_want_to_describe_a_new_sense_of);
                                        html_utilities.html_newline(UNPROVIDED);
                                        {
                                            SubLObject name = html_utilities.get_encoded_form_field_name($$$phrase);
                                            html_utilities.html_text_input(name, NIL, $int$30);
                                        }
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        {
                                            SubLObject name = html_utilities.get_encoded_form_field_name($str_alt161$check_first_);
                                            SubLObject value = NIL;
                                            SubLObject checkedP = T;
                                            SubLObject explanation = cb_uia_concept_creator_launcher_check_first_explanation_text(checkedP);
                                            html_utilities.html_checkbox_input(name, value, checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            cb_query.html_princ_with_explanation($str_alt162$Check_first_, explanation, NIL, NIL, T);
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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

    public static final SubLObject cb_uia_concept_creator_launcher_check_first_explanation_text(SubLObject checkedP) {
        if (NIL != checkedP) {
            return $str_alt164$Uncheck_this_box_to_create_a_new_;
        } else {
            return $str_alt165$Check_this_box_to_see_whether_I_a;
        }
    }

    public static final SubLObject cb_uia_handle_launch_concept_creator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.extract_encoded_form_field_value($$$phrase, args);
            SubLObject check_firstP = list_utilities.sublisp_boolean(html_utilities.extract_encoded_form_field_value($str_alt161$check_first_, args));
            if (NIL != check_firstP) {
                uia_tools_browsing.uia_act_new_concept_recognizer(v_agenda, $REQUIRED, phrase, T);
            } else {
                uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_salient_descriptor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Concept_Refinement_Interview);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt173$cb_uia_handle_launch_salient_desc, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Concept_Refinement_Interview);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt174$I_want_to_refine__);
                                        html_utilities.html_text_input($$$phrase, NIL, $int$30);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
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

    public static final SubLObject cb_uia_handle_launch_salient_descriptor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
            uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, phrase, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_predicate_creator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            cb_predicate_creator.uia_act_new_predicate_creator(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_assertion_creator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Assertion_Creator);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt185$cb_uia_handle_launch_assertion_cr, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Assertion_Creator);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt186$I_want_to_tell_you_the_following_);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$sentence);
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
                                            html_utilities.html_markup(FIVE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$virtual);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
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

    public static final SubLObject cb_uia_handle_launch_assertion_creator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject sentence = html_utilities.html_extract_input($$$sentence, args);
            uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, sentence, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_rule_constructor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.uia_memoization_state(cb_user_interaction_agenda.cb_current_uia());
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                {
                                    SubLObject tool_cycl = $$CycRuleConstructor;
                                    SubLObject if_text = user_interaction_agenda.kraken_help_text_for_launcher_section(tool_cycl, $IF_CLAUSE);
                                    SubLObject then_text = user_interaction_agenda.kraken_help_text_for_launcher_section(tool_cycl, $THEN_CLAUSE);
                                    SubLObject intro_text = user_interaction_agenda.kraken_help_text_for_launcher_section(tool_cycl, $LAUNCHER_INTRO);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Rule_Constructor);
                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    cb_uia_macros.cb_uiat_document_expiration();
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                        try {
                                            html_macros.$html_inside_bodyP$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hidden_input($str_alt202$cb_uia_handle_launch_rule_constru, T, UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_utilities.html_princ($$$Rule_Constructor);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(intro_text);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(if_text);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt203$if_sentence);
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
                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$virtual);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(then_text);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt204$then_sentence);
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
                                                                    html_utilities.html_markup(TWO_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$virtual);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_submit_input($$$Next_Step, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_submit_input($$$Cancel, $$$cancel, UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_handle_launch_rule_constructor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject if_sentence = html_utilities.html_extract_input($str_alt203$if_sentence, args);
            SubLObject then_sentence = html_utilities.html_extract_input($str_alt204$then_sentence, args);
            SubLObject cancelP = html_utilities.html_extract_input($$$cancel, args);
            if (NIL == cancelP) {
                cb_uia_tools_introduction.uia_act_new_rule_constructor(v_agenda, if_sentence, then_sentence, UNPROVIDED, UNPROVIDED);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_analogy_developer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                if (args.isList()) {
                    phrase = args.first();
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Analogy_Developer);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt215$cb_uia_handle_launch_analogy_deve, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Analogy_Developer);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_text_input($$$phrase1, phrase, $int$40);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt216$is_are_like);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_text_input($$$phrase2, NIL, $int$40);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
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
    }

    public static final SubLObject cb_uia_handle_launch_analogy_developer(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase1 = html_utilities.html_extract_input($$$phrase1, args);
            SubLObject phrase2 = html_utilities.html_extract_input($$$phrase2, args);
            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
            uia_tools_introduction.uia_act_new_analogy_developer(v_agenda, $REQUIRED, phrase1, phrase2, UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_concept_creator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt222);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            } else {
                cdestructuring_bind_error(datum, $list_alt222);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_concept_creator(SubLObject phrase, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt224$cb_uia_concept_creator_);
                html_utilities.html_url_princ(phrase);
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

    public static final SubLObject cb_uia_launch_process_descriptor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Process_Descriptor);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt228$cb_uia_handle_launch_process_desc, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Process_Descriptor);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        {
                                            SubLObject existing_processes = uia_trampolines.uia_enumerate_sme_owned_processes(UNPROVIDED);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt229$Name_a_new_process_to_describe_);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_text_input($$$description, $str_alt231$, $int$60);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                            if (NIL != existing_processes) {
                                                {
                                                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_princ($str_alt232$Or_continue_work_on_an_existing_p);
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
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject list_var = NIL;
                                                                SubLObject process = NIL;
                                                                SubLObject counter = NIL;
                                                                for (list_var = existing_processes, process = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , process = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject process_code = cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, process);
                                                                                        SubLObject index = add(counter, ONE_INTEGER);
                                                                                        SubLObject number_string = format(NIL, $str_alt234$__D__, index);
                                                                                        SubLObject hidden_id = cconcatenate($str_alt235$process_, string_utilities.to_string(index));
                                                                                        html_utilities.html_submit_input(number_string, $$$select, UNPROVIDED);
                                                                                        html_utilities.html_hidden_input(hidden_id, process_code, UNPROVIDED);
                                                                                    }
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
                                                                                    cb_uia_display_primitives.cb_uia_show_term(process, UNPROVIDED);
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
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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

    public static final SubLObject cb_uia_handle_launch_process_descriptor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject description = html_utilities.html_extract_input($$$description, args);
            SubLObject selection = html_utilities.html_extract_input($$$select, args);
            SubLObject process = NIL;
            if (!((NIL == selection) || (NIL != string_utilities.empty_string_p(selection)))) {
                {
                    SubLObject index = parse_integer(selection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject process_code_name = cconcatenate($str_alt235$process_, string_utilities.to_string(index));
                    SubLObject process_code = html_utilities.html_extract_input(process_code_name, args);
                    SubLObject process_42 = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, process_code);
                    if ((NIL == description) || (NIL != string_utilities.empty_string_p(description))) {
                        description = uia_trampolines.uia_term_phrase(v_agenda, process_42, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            uia_tools_wizards.uia_act_new_process_descriptor(v_agenda, $REQUIRED, description, process);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_scenario_constructor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, NIL, $REQUIRED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_common_queries(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uia_act_new_common_queries(v_agenda, $REQUIRED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_solution_finder(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Solution_Finder);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uia_macros.cb_uiat_document_expiration();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt259$cb_uia_handle_launch_solution_fin, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Solution_Finder);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt260$Please_answer_the_following_quest);
                                        {
                                            SubLObject field_name = html_utilities.get_encoded_form_field_name($$$question);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(field_name);
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
                                                html_utilities.html_markup(FIVE_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$virtual);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input(cb_uia_get_solution_finder_submit_label_for_ask_question(), $str_alt262$ask_question, UNPROVIDED);
                                        if (NIL != system_info.cycorp_execution_context_p()) {
                                            html_utilities.html_indent(TWO_INTEGER);
                                            html_utilities.html_submit_input(cb_uia_get_solution_finder_submit_label_for_ask_quirk(), $str_alt263$ask_quirk, UNPROVIDED);
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
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

    // deflexical
    private static final SubLSymbol $cb_uia_current_context_is_quirk_contextP$ = makeSymbol("*CB-UIA-CURRENT-CONTEXT-IS-QUIRK-CONTEXT?*");

    public static final SubLObject cb_uia_get_solution_finder_submit_label_for_ask_question() {
        return NIL != $cb_uia_current_context_is_quirk_contextP$.getGlobalValue() ? ((SubLObject) ($str_alt265$Use_RKF_s_Dialog)) : $$$Answer_from_KB;
    }

    public static final SubLObject cb_uia_get_solution_finder_submit_label_for_ask_quirk() {
        return NIL != $cb_uia_current_context_is_quirk_contextP$.getGlobalValue() ? ((SubLObject) ($$$Use_QUIRK)) : $$$Use_Text_Corpora;
    }

    public static final SubLObject cb_uia_handle_launch_solution_finder(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject ask_questionP = html_utilities.html_extract_boolean($str_alt262$ask_question, args, UNPROVIDED);
            SubLObject ask_quirkP = html_utilities.html_extract_boolean($str_alt263$ask_quirk, args, UNPROVIDED);
            SubLObject v_question = html_utilities.extract_encoded_form_field_value($$$question, args);
            if (NIL != ask_questionP) {
                cb_uia_tools_review_and_testing.uia_act_new_solution_finder(v_agenda, v_question, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != ask_quirkP) {
                    uia_tools_review_and_testing.uia_act_new_quirk_question(v_agenda, v_question, UNPROVIDED);
                }

            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_common_queries_about(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uia_act_new_common_queries_about(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_knowledge_reviewer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_lex_knowledge_reviewer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_act_new_lex_knowledge_reviewer(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_knowledge_tester(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $TEST_SUITE_TOOL, NIL, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_knowledge_finalizer(SubLObject args) {
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
                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt295$cb_uia_handle_launch_knowledge_fi, T, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt296$Are_you_sure_that_you_really_want);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($str_alt297$Yes_, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
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

    public static final SubLObject cb_uia_handle_launch_knowledge_finalizer(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $KNOWLEDGE_FINALIZER, NIL, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    /**
     * Launches the problem-reporting page showing instructions for e-mailing a report.
     *
     * @unknown If ARGS is given, the first item is the ID string of the current interaction.
     */
    public static final SubLObject cb_uia_launch_problem_window(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = NIL;
                if (NIL != args) {
                    interaction = user_interaction_agenda.uia_find_by_id_string(cb_user_interaction_agenda.cb_current_uia(), args.first());
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                                cb_uia_problem_reporting.uia_show_problem_reporting_page(interaction);
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
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

    public static final SubLObject cb_uia_launch_echo_message(SubLObject args) {
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
                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt311$cb_uia_handle_launch_echo_message, T, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt312$Enter_a_message_for_me_to_say_bac);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$message, NIL, $int$40);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Say_it, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
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

    public static final SubLObject cb_uia_handle_launch_echo_message(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject message = html_utilities.html_extract_input($$$message, args);
            user_interaction_agenda.uia_act_new_message(v_agenda, message);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_create_interaction(SubLObject args) {
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
                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt320$cb_uia_handle_launch_create_inter, T, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Create_it_Now, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt322$Mode__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$mode, $str_alt324$_required, $int$40);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt325$Operator__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($$$operator, NIL, $int$40);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt327$Args__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$args);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($int$40);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FIVE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$virtual);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt329$__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt330$State__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$state);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($int$40);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FIVE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$virtual);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt329$__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
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

    public static final SubLObject cb_uia_handle_launch_create_interaction(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject mode_string = html_utilities.html_extract_input($$$mode, args);
            SubLObject operator_string = html_utilities.html_extract_input($$$operator, args);
            SubLObject action_args_string = html_utilities.html_extract_input($$$args, args);
            SubLObject state_string = html_utilities.html_extract_input($$$state, args);
            SubLObject mode = read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject operator = read_from_string_ignoring_errors(operator_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject action_args = read_from_string_ignoring_errors(action_args_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject state = read_from_string_ignoring_errors(state_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, operator, action_args, state);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject declare_cb_uia_launchers_file() {
        declareFunction("cb_uia_launch_sections", "CB-UIA-LAUNCH-SECTIONS", 0, 0, false);
        declareFunction("cb_uia_launch_section_name", "CB-UIA-LAUNCH-SECTION-NAME", 1, 0, false);
        declareFunction("cb_uia_launch_section_launchers", "CB-UIA-LAUNCH-SECTION-LAUNCHERS", 1, 0, false);
        declareFunction("declare_cb_uia_launcher_internal", "DECLARE-CB-UIA-LAUNCHER-INTERNAL", 4, 5, false);
        declareFunction("cb_uia_launcher_spec_from_launcher", "CB-UIA-LAUNCHER-SPEC-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_section_from_launcher", "CB-UIA-LAUNCHER-SECTION-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_name_from_launcher", "CB-UIA-LAUNCHER-NAME-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_url_from_launcher", "CB-UIA-LAUNCHER-URL-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_disabled_from_launcher", "CB-UIA-LAUNCHER-DISABLED-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_target_from_launcher", "CB-UIA-LAUNCHER-TARGET-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_tip_from_launcher", "CB-UIA-LAUNCHER-TIP-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_cycl_from_launcher", "CB-UIA-LAUNCHER-CYCL-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_on_click_from_launcher", "CB-UIA-LAUNCHER-ON-CLICK-FROM-LAUNCHER", 1, 0, false);
        declareFunction("cb_uia_launcher_name", "CB-UIA-LAUNCHER-NAME", 1, 0, false);
        declareFunction("cb_uia_launcher_url", "CB-UIA-LAUNCHER-URL", 1, 0, false);
        declareFunction("cb_uia_launcher_disabled", "CB-UIA-LAUNCHER-DISABLED", 1, 0, false);
        declareFunction("cb_uia_launcher_target", "CB-UIA-LAUNCHER-TARGET", 1, 0, false);
        declareFunction("cb_uia_launcher_tip", "CB-UIA-LAUNCHER-TIP", 1, 0, false);
        declareFunction("cb_uia_launcher_cycl", "CB-UIA-LAUNCHER-CYCL", 1, 0, false);
        declareFunction("cb_uia_launcher_on_click", "CB-UIA-LAUNCHER-ON-CLICK", 1, 0, false);
        declareFunction("cb_uia_launcher_from_cycl", "CB-UIA-LAUNCHER-FROM-CYCL", 1, 0, false);
        declareFunction("cb_uia_salient_descriptor_launcher_for_term_internal", "CB-UIA-SALIENT-DESCRIPTOR-LAUNCHER-FOR-TERM-INTERNAL", 2, 0, false);
        declareFunction("cb_uia_salient_descriptor_launcher_for_term", "CB-UIA-SALIENT-DESCRIPTOR-LAUNCHER-FOR-TERM", 2, 0, false);
        declareFunction("cb_uia_launcher_allow_salient_descriptionP", "CB-UIA-LAUNCHER-ALLOW-SALIENT-DESCRIPTION?", 2, 0, false);
        declareMacro("declare_cb_uia_launcher", "DECLARE-CB-UIA-LAUNCHER");
        declareFunction("cb_uia_launch_configure_interface", "CB-UIA-LAUNCH-CONFIGURE-INTERFACE", 0, 1, false);
        declareFunction("cb_uia_launch_user_modeler", "CB-UIA-LAUNCH-USER-MODELER", 0, 1, false);
        declareFunction("cb_uia_launch_topic_specifier", "CB-UIA-LAUNCH-TOPIC-SPECIFIER", 0, 1, false);
        declareFunction("cb_link_uia_specify_topic", "CB-LINK-UIA-SPECIFY-TOPIC", 0, 1, false);
        declareFunction("cb_uia_launch_knowledge_scrapbook", "CB-UIA-LAUNCH-KNOWLEDGE-SCRAPBOOK", 0, 1, false);
        declareFunction("cb_uia_launch_domain_examples", "CB-UIA-LAUNCH-DOMAIN-EXAMPLES", 0, 1, false);
        declareFunction("cb_uia_launch_ontology_browser", "CB-UIA-LAUNCH-ONTOLOGY-BROWSER", 0, 1, false);
        declareFunction("cb_uia_launch_concept_recognizer", "CB-UIA-LAUNCH-CONCEPT-RECOGNIZER", 0, 1, false);
        declareFunction("cb_uia_handle_launch_concept_recognizer", "CB-UIA-HANDLE-LAUNCH-CONCEPT-RECOGNIZER", 1, 0, false);
        declareFunction("cb_uia_launch_asserted_sentences", "CB-UIA-LAUNCH-ASSERTED-SENTENCES", 0, 1, false);
        declareFunction("cb_uia_handle_launch_asserted_sentences", "CB-UIA-HANDLE-LAUNCH-ASSERTED-SENTENCES", 1, 0, false);
        declareFunction("cb_uia_launch_glossary", "CB-UIA-LAUNCH-GLOSSARY", 1, 0, false);
        declareFunction("cb_uia_handle_launch_glossary", "CB-UIA-HANDLE-LAUNCH-GLOSSARY", 1, 0, false);
        declareFunction("cb_uia_launch_concept_comparator", "CB-UIA-LAUNCH-CONCEPT-COMPARATOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_concept_comparator", "CB-UIA-HANDLE-LAUNCH-CONCEPT-COMPARATOR", 1, 0, false);
        declareFunction("cb_uia_launch_concept_relator", "CB-UIA-LAUNCH-CONCEPT-RELATOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_concept_relator", "CB-UIA-HANDLE-LAUNCH-CONCEPT-RELATOR", 1, 0, false);
        declareFunction("cb_uia_launch_predicate_suggestor", "CB-UIA-LAUNCH-PREDICATE-SUGGESTOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_predicate_suggestor", "CB-UIA-HANDLE-LAUNCH-PREDICATE-SUGGESTOR", 1, 0, false);
        declareFunction("cb_uia_launch_relationship_suggestor", "CB-UIA-LAUNCH-RELATIONSHIP-SUGGESTOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_relationship_suggestor", "CB-UIA-HANDLE-LAUNCH-RELATIONSHIP-SUGGESTOR", 1, 0, false);
        declareFunction("cb_uia_launch_lexicon_search", "CB-UIA-LAUNCH-LEXICON-SEARCH", 0, 1, false);
        declareFunction("cb_uia_handle_launch_lexicon_search", "CB-UIA-HANDLE-LAUNCH-LEXICON-SEARCH", 1, 0, false);
        declareFunction("cb_uia_launch_concept_creator", "CB-UIA-LAUNCH-CONCEPT-CREATOR", 0, 1, false);
        declareFunction("cb_uia_concept_creator_launcher_check_first_explanation_text", "CB-UIA-CONCEPT-CREATOR-LAUNCHER-CHECK-FIRST-EXPLANATION-TEXT", 1, 0, false);
        declareFunction("cb_uia_handle_launch_concept_creator", "CB-UIA-HANDLE-LAUNCH-CONCEPT-CREATOR", 1, 0, false);
        declareFunction("cb_uia_launch_salient_descriptor", "CB-UIA-LAUNCH-SALIENT-DESCRIPTOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_salient_descriptor", "CB-UIA-HANDLE-LAUNCH-SALIENT-DESCRIPTOR", 1, 0, false);
        declareFunction("cb_uia_launch_predicate_creator", "CB-UIA-LAUNCH-PREDICATE-CREATOR", 1, 0, false);
        declareFunction("cb_uia_launch_assertion_creator", "CB-UIA-LAUNCH-ASSERTION-CREATOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_assertion_creator", "CB-UIA-HANDLE-LAUNCH-ASSERTION-CREATOR", 1, 0, false);
        declareFunction("cb_uia_launch_rule_constructor", "CB-UIA-LAUNCH-RULE-CONSTRUCTOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_rule_constructor", "CB-UIA-HANDLE-LAUNCH-RULE-CONSTRUCTOR", 1, 0, false);
        declareFunction("cb_uia_launch_analogy_developer", "CB-UIA-LAUNCH-ANALOGY-DEVELOPER", 0, 1, false);
        declareFunction("cb_uia_handle_launch_analogy_developer", "CB-UIA-HANDLE-LAUNCH-ANALOGY-DEVELOPER", 1, 0, false);
        declareFunction("cb_uia_concept_creator", "CB-UIA-CONCEPT-CREATOR", 1, 0, false);
        declareFunction("cb_link_uia_concept_creator", "CB-LINK-UIA-CONCEPT-CREATOR", 2, 0, false);
        declareFunction("cb_uia_launch_process_descriptor", "CB-UIA-LAUNCH-PROCESS-DESCRIPTOR", 0, 1, false);
        declareFunction("cb_uia_handle_launch_process_descriptor", "CB-UIA-HANDLE-LAUNCH-PROCESS-DESCRIPTOR", 1, 0, false);
        declareFunction("cb_uia_launch_scenario_constructor", "CB-UIA-LAUNCH-SCENARIO-CONSTRUCTOR", 0, 1, false);
        declareFunction("cb_uia_launch_common_queries", "CB-UIA-LAUNCH-COMMON-QUERIES", 0, 1, false);
        declareFunction("cb_uia_launch_solution_finder", "CB-UIA-LAUNCH-SOLUTION-FINDER", 0, 1, false);
        declareFunction("cb_uia_get_solution_finder_submit_label_for_ask_question", "CB-UIA-GET-SOLUTION-FINDER-SUBMIT-LABEL-FOR-ASK-QUESTION", 0, 0, false);
        declareFunction("cb_uia_get_solution_finder_submit_label_for_ask_quirk", "CB-UIA-GET-SOLUTION-FINDER-SUBMIT-LABEL-FOR-ASK-QUIRK", 0, 0, false);
        declareFunction("cb_uia_handle_launch_solution_finder", "CB-UIA-HANDLE-LAUNCH-SOLUTION-FINDER", 1, 0, false);
        declareFunction("cb_uia_launch_common_queries_about", "CB-UIA-LAUNCH-COMMON-QUERIES-ABOUT", 0, 1, false);
        declareFunction("cb_uia_launch_knowledge_reviewer", "CB-UIA-LAUNCH-KNOWLEDGE-REVIEWER", 0, 1, false);
        declareFunction("cb_uia_launch_lex_knowledge_reviewer", "CB-UIA-LAUNCH-LEX-KNOWLEDGE-REVIEWER", 0, 1, false);
        declareFunction("cb_uia_launch_knowledge_tester", "CB-UIA-LAUNCH-KNOWLEDGE-TESTER", 0, 1, false);
        declareFunction("cb_uia_launch_knowledge_finalizer", "CB-UIA-LAUNCH-KNOWLEDGE-FINALIZER", 0, 1, false);
        declareFunction("cb_uia_handle_launch_knowledge_finalizer", "CB-UIA-HANDLE-LAUNCH-KNOWLEDGE-FINALIZER", 1, 0, false);
        declareFunction("cb_uia_launch_problem_window", "CB-UIA-LAUNCH-PROBLEM-WINDOW", 0, 1, false);
        declareFunction("cb_uia_launch_echo_message", "CB-UIA-LAUNCH-ECHO-MESSAGE", 0, 1, false);
        declareFunction("cb_uia_handle_launch_echo_message", "CB-UIA-HANDLE-LAUNCH-ECHO-MESSAGE", 1, 0, false);
        declareFunction("cb_uia_launch_create_interaction", "CB-UIA-LAUNCH-CREATE-INTERACTION", 0, 1, false);
        declareFunction("cb_uia_handle_launch_create_interaction", "CB-UIA-HANDLE-LAUNCH-CREATE-INTERACTION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_launchers_file() {
        deflexical("*CB-UIA-LAUNCH-SECTIONS*", $list_alt0);
        deflexical("*CB-UIA-LAUNCHERS*", NIL);
        deflexical("*CB-UIA-CURRENT-CONTEXT-IS-QUIRK-CONTEXT?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_launchers_file() {
                memoization_state.note_memoized_function(CB_UIA_SALIENT_DESCRIPTOR_LAUNCHER_FOR_TERM);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CONFIGURE_INTERFACE);
        declare_cb_uia_launcher_internal($CONFIGURE_INTERFACE, $SETUP, $$$Configure_Interface, $str_alt28$cb_uia_launch_configure_interface, NIL, NIL, $$$Configure_Interface, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_USER_MODELER);
        declare_cb_uia_launcher_internal($USER_MODELER, $SETUP, $$$Describe_Myself, $str_alt33$cb_uia_launch_user_modeler, $DISABLED, NIL, $$$Describe_Myself, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_TOPIC_SPECIFIER);
        declare_cb_uia_launcher_internal($TOPIC_SPECIFIER, $SETUP, $$$Specify_Topic, $str_alt37$cb_uia_launch_topic_specifier, NIL, NIL, $$$Change_the_Topic, NIL, NIL);
        cb_utilities.setup_cb_link_method($UIA_SPECIFY_TOPIC, CB_LINK_UIA_SPECIFY_TOPIC, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_KNOWLEDGE_SCRAPBOOK);
        declare_cb_uia_launcher_internal($KNOWLEDGE_SCRAPBOOK, $BROWSING, $$$My_Scrapbook, $str_alt47$cb_uia_launch_knowledge_scrapbook, NIL, NIL, $$$Browse_My_Scrapbook, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_DOMAIN_EXAMPLES);
        declare_cb_uia_launcher_internal($DOMAIN_EXAMPLES, $BROWSING, $$$Examples, $str_alt52$cb_uia_launch_domain_examples, NIL, NIL, $$$Browse_Domain_Examples, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_ONTOLOGY_BROWSER);
        declare_cb_uia_launcher_internal($ONTOLOGY_BROWSER, $BROWSING, $$$Browse_Ontology, $str_alt57$cb_uia_launch_ontology_browser, NIL, $str_alt58$ontology_browser, $$$Browse_Known_Concepts, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CONCEPT_RECOGNIZER);
        declare_cb_uia_launcher_internal($CONCEPT_RECOGNIZER, $BROWSING, $$$Recognize, $str_alt76$cb_uia_launch_concept_recognizer, NIL, NIL, $$$Find_Concept, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_CONCEPT_RECOGNIZER);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_ASSERTED_SENTENCES);
        declare_cb_uia_launcher_internal($ASSERTED_SENTENCES, $BROWSING, $$$Known_Facts, $str_alt85$cb_uia_launch_asserted_sentences, NIL, NIL, $$$Find_Known_Facts_for_Concept, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_ASSERTED_SENTENCES);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_GLOSSARY);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_GLOSSARY);
        declare_cb_uia_launcher_internal($GLOSSARY, $BROWSING, $$$Glossaries, $str_alt93$cb_uia_launch_glossary, NIL, NIL, $$$View_Glossaries, $$Glossary, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CONCEPT_COMPARATOR);
        declare_cb_uia_launcher_internal($CONCEPT_COMPARATOR, $BROWSING, $str_alt105$Compare___Contrast, $str_alt106$cb_uia_launch_concept_comparator, NIL, NIL, $str_alt107$Compare___Contrast_Concepts, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_CONCEPT_COMPARATOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CONCEPT_RELATOR);
        declare_cb_uia_launcher_internal($CONCEPT_RELATOR, $BROWSING, $$$Related_Terms, $str_alt115$cb_uia_launch_concept_relator, NIL, NIL, $$$Find_Related_Concepts, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_CONCEPT_RELATOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_PREDICATE_SUGGESTOR);
        declare_cb_uia_launcher_internal($PREDICATE_SUGGESTOR, $BROWSING, $$$Suggest_a_Predicate, $str_alt124$cb_uia_launch_predicate_suggestor, $DISABLED, NIL, $$$Find_Predicate, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_PREDICATE_SUGGESTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_RELATIONSHIP_SUGGESTOR);
        declare_cb_uia_launcher_internal($RELATIONSHIP_SUGGESTOR, $BROWSING, $$$Suggest_a_Relation, $str_alt134$cb_uia_launch_relationship_sugges, $DISABLED_EXTERNAL, NIL, $$$Find_Relation, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_RELATIONSHIP_SUGGESTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_LEXICON_SEARCH);
        declare_cb_uia_launcher_internal($LEXICON_SEARCH, $BROWSING, $$$Search_Dictionary, $str_alt155$cb_uia_launch_lexicon_search, NIL, NIL, $$$Search_Lexical_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_LEXICON_SEARCH);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CONCEPT_CREATOR);
        declare_cb_uia_launcher_internal($CONCEPT_CREATOR, $INTRODUCTION, $$$New_Concept, $str_alt169$cb_uia_launch_concept_creator, NIL, NIL, $$$Create_Concept, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_CONCEPT_CREATOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_SALIENT_DESCRIPTOR);
        declare_cb_uia_launcher_internal($SALIENT_DESCRIPTOR, $INTRODUCTION, $$$Concept_Refinement_Interview, $str_alt177$cb_uia_launch_salient_descriptor, NIL, NIL, $$$Concept_Refinement_Interview, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_SALIENT_DESCRIPTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_PREDICATE_CREATOR);
        declare_cb_uia_launcher_internal($PREDICATE_CREATOR, $INTRODUCTION, $$$New_Predicate, $str_alt182$cb_uia_launch_predicate_creator, NIL, NIL, $$$Create_Predicate, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_ASSERTION_CREATOR);
        declare_cb_uia_launcher_internal($ASSERTION_CREATOR, $INTRODUCTION, $$$New_Fact, $str_alt193$cb_uia_launch_assertion_creator, NIL, NIL, $$$Create_Fact, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_ASSERTION_CREATOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_RULE_CONSTRUCTOR);
        declare_cb_uia_launcher_internal($RULE_CONSTRUCTOR, $INTRODUCTION, $$$New_Rule, $str_alt211$cb_uia_launch_rule_constructor, NIL, NIL, $$$Create_Rule, $$CycRuleConstructor, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_RULE_CONSTRUCTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_ANALOGY_DEVELOPER);
        declare_cb_uia_launcher_internal($ANALOGY_DEVELOPER, $INTRODUCTION, $$$State_Analogy, $str_alt220$cb_uia_launch_analogy_developer, NIL, NIL, $$$State_Analogy, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_ANALOGY_DEVELOPER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_CREATOR);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_CREATOR, CB_LINK_UIA_CONCEPT_CREATOR, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_PROCESS_DESCRIPTOR);
        declare_cb_uia_launcher_internal($PROCESS_DESCRIPTOR, $INTRODUCTION, $$$Process_Descriptor, $str_alt239$cb_uia_launch_process_descriptor, NIL, NIL, $$$Create_and_Edit_Processes, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_PROCESS_DESCRIPTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_SCENARIO_CONSTRUCTOR);
        declare_cb_uia_launcher_internal($SCENARIO_CONSTRUCTOR, $WIZARDS, $$$Scenario_Constructor, $str_alt246$cb_uia_launch_scenario_constructo, T, NIL, $$$Create_Scenario, NIL, NIL);
        declare_cb_uia_launcher_internal($LEXIFICATION_WIZARD, $WIZARDS, $$$Dictionary_Assistant, $str_alt250$cb_uia_launch_lexification_wizard, NIL, NIL, $$$Create_Lexical_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_COMMON_QUERIES);
        declare_cb_uia_launcher_internal($COMMON_QUERIES, $REVIEW, $$$Common_Queries, $str_alt256$cb_uia_launch_common_queries, NIL, NIL, $$$View_Common_Questions, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_SOLUTION_FINDER);
        declare_cb_uia_launcher_internal($SOLUTION_FINDER, $REVIEW, $$$Ask_a_Question, $str_alt271$cb_uia_launch_solution_finder, NIL, NIL, $$$Create_Question, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_SOLUTION_FINDER);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_COMMON_QUERIES_ABOUT);
        declare_cb_uia_launcher_internal($COMMON_QUERIES_ABOUT, $REVIEW, $str_alt276$Ask_a_Question_About____, $str_alt277$cb_uia_launch_common_queries_abou, NIL, NIL, $$$Find_Common_Questions_for_Concept, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_KNOWLEDGE_REVIEWER);
        declare_cb_uia_launcher_internal($KNOWLEDGE_REVIEWER, $REVIEW, $$$Review_Knowledge, $str_alt282$cb_uia_launch_knowledge_reviewer, NIL, NIL, $$$Review_My_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_LEX_KNOWLEDGE_REVIEWER);
        declare_cb_uia_launcher_internal($LEX_KNOWLEDGE_REVIEWER, $REVIEW, $$$Review_Lexical_Knowledge, $str_alt287$cb_uia_launch_lex_knowledge_revie, NIL, NIL, $$$Review_My_Lexical_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_KNOWLEDGE_TESTER);
        declare_cb_uia_launcher_internal($KNOWLEDGE_TESTER, $REVIEW, $$$Test_Knowledge, $str_alt293$cb_uia_launch_knowledge_tester, NIL, NIL, $$$Test_My_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_KNOWLEDGE_FINALIZER);
        declare_cb_uia_launcher_internal($KNOWLEDGE_FINALIZER, $FINALIZATION, $$$Finalize_Knowledge, $str_alt302$cb_uia_launch_knowledge_finalizer, $DISABLED, NIL, $$$Finalize_My_Knowledge, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_KNOWLEDGE_FINALIZER);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_PROBLEM_WINDOW);
        declare_cb_uia_launcher_internal($PROBLEM, $DEBUGGING, $$$Problem, $str_alt308$cb_uia_launch_problem_window, NIL, $$$problem, $$$Report_a_Problem, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_ECHO_MESSAGE);
        declare_cb_uia_launcher_internal($ECHO_MESSAGE, $DEBUGGING, $$$Echo_Message, $str_alt318$cb_uia_launch_echo_message, NIL, NIL, $$$Echo_Message, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_ECHO_MESSAGE);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_CREATE_INTERACTION);
        declare_cb_uia_launcher_internal($CREATE_INTERACTION, $DEBUGGING, $$$Create_Interaction, $str_alt335$cb_uia_launch_create_interaction, NIL, NIL, $$$Create_Interaction_By_Hand, NIL, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_CREATE_INTERACTION);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeKeyword("SETUP"), makeString("Setup")), list(makeKeyword("BROWSING"), makeString("Browse CYC")), list(makeKeyword("INTRODUCTION"), makeString("Add to CYC")), list(makeKeyword("REVIEW"), makeString("Test CYC")), list(makeKeyword("FINALIZATION"), makeString("Submit")), list(makeKeyword("WIZARDS"), makeString("Wizards")), list(makeKeyword("DEBUGGING"), makeString("Debugging")));





    private static final SubLSymbol $DEBUGGING = makeKeyword("DEBUGGING");





    private static final SubLSymbol CB_UIA_LAUNCHER_CYCL_FROM_LAUNCHER = makeSymbol("CB-UIA-LAUNCHER-CYCL-FROM-LAUNCHER");

    private static final SubLSymbol CB_UIA_SALIENT_DESCRIPTOR_LAUNCHER_FOR_TERM = makeSymbol("CB-UIA-SALIENT-DESCRIPTOR-LAUNCHER-FOR-TERM");

    static private final SubLSymbol $sym8$_X = makeSymbol("?X");

    public static final SubLObject $const9$uiaSalientDescriptorLauncherForTe = constant_handles.reader_make_constant_shell(makeString("uiaSalientDescriptorLauncherForTerm"));

    public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("LAUNCHER-SPEC"), makeSymbol("&KEY"), list(makeSymbol("SECTION"), makeKeyword("DEBUGGING")), list(makeSymbol("NAME"), makeString("Unnamed Launcher")), list(makeSymbol("URL"), NIL), list(makeSymbol("DISABLED"), NIL), list(makeSymbol("TARGET"), NIL), list(makeSymbol("TIP"), NIL), list(makeSymbol("HELP-URL"), NIL), list(makeSymbol("CYCL"), NIL), list(makeSymbol("ON-CLICK"), NIL) });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SECTION"), $NAME, makeKeyword("URL"), makeKeyword("DISABLED"), makeKeyword("TARGET"), makeKeyword("TIP"), makeKeyword("HELP-URL"), $CYCL, makeKeyword("ON-CLICK") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    static private final SubLString $$$Unnamed_Launcher = makeString("Unnamed Launcher");







    private static final SubLSymbol $TIP = makeKeyword("TIP");

    private static final SubLSymbol $HELP_URL = makeKeyword("HELP-URL");



    private static final SubLSymbol $ON_CLICK = makeKeyword("ON-CLICK");

    private static final SubLSymbol DECLARE_CB_UIA_LAUNCHER_INTERNAL = makeSymbol("DECLARE-CB-UIA-LAUNCHER-INTERNAL");

    private static final SubLSymbol CB_UIA_LAUNCH_CONFIGURE_INTERFACE = makeSymbol("CB-UIA-LAUNCH-CONFIGURE-INTERFACE");

    private static final SubLSymbol $CONFIGURE_INTERFACE = makeKeyword("CONFIGURE-INTERFACE");

    static private final SubLString $$$Configure_Interface = makeString("Configure Interface");

    static private final SubLString $str_alt28$cb_uia_launch_configure_interface = makeString("cb-uia-launch-configure-interface");



    private static final SubLSymbol CB_UIA_LAUNCH_USER_MODELER = makeSymbol("CB-UIA-LAUNCH-USER-MODELER");

    private static final SubLSymbol $USER_MODELER = makeKeyword("USER-MODELER");

    static private final SubLString $$$Describe_Myself = makeString("Describe Myself");

    static private final SubLString $str_alt33$cb_uia_launch_user_modeler = makeString("cb-uia-launch-user-modeler");

    private static final SubLSymbol CB_UIA_LAUNCH_TOPIC_SPECIFIER = makeSymbol("CB-UIA-LAUNCH-TOPIC-SPECIFIER");

    private static final SubLSymbol $TOPIC_SPECIFIER = makeKeyword("TOPIC-SPECIFIER");

    static private final SubLString $$$Specify_Topic = makeString("Specify Topic");

    static private final SubLString $str_alt37$cb_uia_launch_topic_specifier = makeString("cb-uia-launch-topic-specifier");

    static private final SubLString $$$Change_the_Topic = makeString("Change the Topic");

    static private final SubLString $str_alt39$_Specify_Topic_ = makeString("[Specify Topic]");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    private static final SubLSymbol $UIA_SPECIFY_TOPIC = makeKeyword("UIA-SPECIFY-TOPIC");

    private static final SubLSymbol CB_LINK_UIA_SPECIFY_TOPIC = makeSymbol("CB-LINK-UIA-SPECIFY-TOPIC");

    private static final SubLSymbol $KNOWLEDGE_SCRAPBOOK = makeKeyword("KNOWLEDGE-SCRAPBOOK");

    private static final SubLSymbol CB_UIA_LAUNCH_KNOWLEDGE_SCRAPBOOK = makeSymbol("CB-UIA-LAUNCH-KNOWLEDGE-SCRAPBOOK");

    private static final SubLSymbol $BROWSING = makeKeyword("BROWSING");

    static private final SubLString $$$My_Scrapbook = makeString("My Scrapbook");

    static private final SubLString $str_alt47$cb_uia_launch_knowledge_scrapbook = makeString("cb-uia-launch-knowledge-scrapbook");

    static private final SubLString $$$Browse_My_Scrapbook = makeString("Browse My Scrapbook");

    private static final SubLSymbol CB_UIA_LAUNCH_DOMAIN_EXAMPLES = makeSymbol("CB-UIA-LAUNCH-DOMAIN-EXAMPLES");

    private static final SubLSymbol $DOMAIN_EXAMPLES = makeKeyword("DOMAIN-EXAMPLES");

    static private final SubLString $$$Examples = makeString("Examples");

    static private final SubLString $str_alt52$cb_uia_launch_domain_examples = makeString("cb-uia-launch-domain-examples");

    static private final SubLString $$$Browse_Domain_Examples = makeString("Browse Domain Examples");

    private static final SubLSymbol CB_UIA_LAUNCH_ONTOLOGY_BROWSER = makeSymbol("CB-UIA-LAUNCH-ONTOLOGY-BROWSER");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    static private final SubLString $$$Browse_Ontology = makeString("Browse Ontology");

    static private final SubLString $str_alt57$cb_uia_launch_ontology_browser = makeString("cb-uia-launch-ontology-browser");

    static private final SubLString $str_alt58$ontology_browser = makeString("ontology-browser");

    static private final SubLString $$$Browse_Known_Concepts = makeString("Browse Known Concepts");

    static private final SubLString $$$Concept_Recognizer = makeString("Concept Recognizer");

    static private final SubLString $str_alt61$cb_uia_handle_launch_concept_reco = makeString("cb-uia-handle-launch-concept-recognizer");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $$$phrase = makeString("phrase");

    static private final SubLString $str_alt64$phrase_cell = makeString("phrase_cell");

    static private final SubLString $$$StemId = makeString("StemId");



    static private final SubLString $$$3 = makeString("3");



    static private final SubLString $str_alt69$Concept_to_search_for__ = makeString("Concept to search for: ");

    static private final SubLString $$$button = makeString("button");

    static private final SubLString $$$add_another = makeString("add another");

    static private final SubLString $$$Search = makeString("Search");

    private static final SubLSymbol CB_UIA_LAUNCH_CONCEPT_RECOGNIZER = makeSymbol("CB-UIA-LAUNCH-CONCEPT-RECOGNIZER");

    private static final SubLSymbol $CONCEPT_RECOGNIZER = makeKeyword("CONCEPT-RECOGNIZER");

    static private final SubLString $$$Recognize = makeString("Recognize");

    static private final SubLString $str_alt76$cb_uia_launch_concept_recognizer = makeString("cb-uia-launch-concept-recognizer");

    static private final SubLString $$$Find_Concept = makeString("Find Concept");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_CONCEPT_RECOGNIZER = makeSymbol("CB-UIA-HANDLE-LAUNCH-CONCEPT-RECOGNIZER");

    static private final SubLString $$$Known_Facts = makeString("Known Facts");

    static private final SubLString $str_alt80$cb_uia_handle_launch_asserted_sen = makeString("cb-uia-handle-launch-asserted-sentences");

    static private final SubLString $str_alt81$Show_known_facts_about__ = makeString("Show known facts about: ");

    static private final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol CB_UIA_LAUNCH_ASSERTED_SENTENCES = makeSymbol("CB-UIA-LAUNCH-ASSERTED-SENTENCES");

    private static final SubLSymbol $ASSERTED_SENTENCES = makeKeyword("ASSERTED-SENTENCES");

    static private final SubLString $str_alt85$cb_uia_launch_asserted_sentences = makeString("cb-uia-launch-asserted-sentences");

    static private final SubLString $$$Find_Known_Facts_for_Concept = makeString("Find Known Facts for Concept");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_ASSERTED_SENTENCES = makeSymbol("CB-UIA-HANDLE-LAUNCH-ASSERTED-SENTENCES");

    private static final SubLSymbol CB_UIA_LAUNCH_GLOSSARY = makeSymbol("CB-UIA-LAUNCH-GLOSSARY");

    static private final SubLString $str_alt89$GLOSSARY_A = makeString("GLOSSARY~A");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_GLOSSARY = makeSymbol("CB-UIA-HANDLE-LAUNCH-GLOSSARY");

    private static final SubLSymbol $GLOSSARY = makeKeyword("GLOSSARY");

    static private final SubLString $$$Glossaries = makeString("Glossaries");

    static private final SubLString $str_alt93$cb_uia_launch_glossary = makeString("cb-uia-launch-glossary");

    static private final SubLString $$$View_Glossaries = makeString("View Glossaries");

    public static final SubLObject $$Glossary = constant_handles.reader_make_constant_shell(makeString("Glossary"));

    static private final SubLString $$$Concept_Comparator = makeString("Concept Comparator");

    static private final SubLString $str_alt97$cb_uia_handle_launch_concept_comp = makeString("cb-uia-handle-launch-concept-comparator");

    static private final SubLString $$$I_want_to_compare_and_contrast = makeString("I want to compare and contrast");

    static private final SubLString $$$phrase1 = makeString("phrase1");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$and = makeString("and");

    static private final SubLString $$$phrase2 = makeString("phrase2");

    private static final SubLSymbol CB_UIA_LAUNCH_CONCEPT_COMPARATOR = makeSymbol("CB-UIA-LAUNCH-CONCEPT-COMPARATOR");

    private static final SubLSymbol $CONCEPT_COMPARATOR = makeKeyword("CONCEPT-COMPARATOR");

    static private final SubLString $str_alt105$Compare___Contrast = makeString("Compare & Contrast");

    static private final SubLString $str_alt106$cb_uia_launch_concept_comparator = makeString("cb-uia-launch-concept-comparator");

    static private final SubLString $str_alt107$Compare___Contrast_Concepts = makeString("Compare & Contrast Concepts");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_CONCEPT_COMPARATOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-CONCEPT-COMPARATOR");

    static private final SubLString $$$Concept_Relator = makeString("Concept Relator");

    static private final SubLString $str_alt110$cb_uia_handle_launch_concept_rela = makeString("cb-uia-handle-launch-concept-relator");

    static private final SubLString $str_alt111$Show_terms_related_to__ = makeString("Show terms related to: ");

    private static final SubLSymbol CB_UIA_LAUNCH_CONCEPT_RELATOR = makeSymbol("CB-UIA-LAUNCH-CONCEPT-RELATOR");

    private static final SubLSymbol $CONCEPT_RELATOR = makeKeyword("CONCEPT-RELATOR");

    static private final SubLString $$$Related_Terms = makeString("Related Terms");

    static private final SubLString $str_alt115$cb_uia_launch_concept_relator = makeString("cb-uia-launch-concept-relator");

    static private final SubLString $$$Find_Related_Concepts = makeString("Find Related Concepts");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_CONCEPT_RELATOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-CONCEPT-RELATOR");

    static private final SubLString $$$Predicate_Suggestor = makeString("Predicate Suggestor");

    static private final SubLString $str_alt119$cb_uia_handle_launch_predicate_su = makeString("cb-uia-handle-launch-predicate-suggestor");

    static private final SubLString $$$What_predicates_could_apply_to = makeString("What predicates could apply to");

    private static final SubLSymbol CB_UIA_LAUNCH_PREDICATE_SUGGESTOR = makeSymbol("CB-UIA-LAUNCH-PREDICATE-SUGGESTOR");

    private static final SubLSymbol $PREDICATE_SUGGESTOR = makeKeyword("PREDICATE-SUGGESTOR");

    static private final SubLString $$$Suggest_a_Predicate = makeString("Suggest a Predicate");

    static private final SubLString $str_alt124$cb_uia_launch_predicate_suggestor = makeString("cb-uia-launch-predicate-suggestor");

    static private final SubLString $$$Find_Predicate = makeString("Find Predicate");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_PREDICATE_SUGGESTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-PREDICATE-SUGGESTOR");

    static private final SubLString $$$Relationship_Suggestor = makeString("Relationship Suggestor");

    static private final SubLString $str_alt129$cb_uia_handle_launch_relationship = makeString("cb-uia-handle-launch-relationship-suggestor");

    static private final SubLString $$$How_could_I_relate = makeString("How could I relate");

    private static final SubLSymbol CB_UIA_LAUNCH_RELATIONSHIP_SUGGESTOR = makeSymbol("CB-UIA-LAUNCH-RELATIONSHIP-SUGGESTOR");

    private static final SubLSymbol $RELATIONSHIP_SUGGESTOR = makeKeyword("RELATIONSHIP-SUGGESTOR");

    static private final SubLString $$$Suggest_a_Relation = makeString("Suggest a Relation");

    static private final SubLString $str_alt134$cb_uia_launch_relationship_sugges = makeString("cb-uia-launch-relationship-suggestor");

    private static final SubLSymbol $DISABLED_EXTERNAL = makeKeyword("DISABLED-EXTERNAL");

    static private final SubLString $$$Find_Relation = makeString("Find Relation");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_RELATIONSHIP_SUGGESTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-RELATIONSHIP-SUGGESTOR");

    static private final SubLString $$$Dictionary_Search = makeString("Dictionary Search");

    static private final SubLString $str_alt139$cb_uia_handle_launch_lexicon_sear = makeString("cb-uia-handle-launch-lexicon-search");

    static private final SubLString $str_alt140$Find_concepts_with_the_words_ = makeString("Find concepts with the words:");

    static private final SubLString $str_alt141$_pattern = makeString(":pattern");

    static private final SubLString $str_alt142$occurring_ = makeString("occurring ");

    static private final SubLString $str_alt143$_search_type = makeString(":search-type");

    static private final SubLString $str_alt144$_prefix = makeString(":prefix");

    static private final SubLString $$$at_the_beginning = makeString("at the beginning");

    static private final SubLString $str_alt146$_infix = makeString(":infix");

    static private final SubLString $$$anywhere = makeString("anywhere");

    static private final SubLString $str_alt148$_suffix = makeString(":suffix");

    static private final SubLString $$$at_the_end = makeString("at the end");

    static private final SubLString $str_alt150$Note__The_dictionary_searching_in = makeString("Note: The dictionary searching index needs to be initialized first.");

    static private final SubLString $str_alt151$This_may_take_a_few_minutes_ = makeString("This may take a few minutes.");

    private static final SubLSymbol CB_UIA_LAUNCH_LEXICON_SEARCH = makeSymbol("CB-UIA-LAUNCH-LEXICON-SEARCH");

    private static final SubLSymbol $LEXICON_SEARCH = makeKeyword("LEXICON-SEARCH");

    static private final SubLString $$$Search_Dictionary = makeString("Search Dictionary");

    static private final SubLString $str_alt155$cb_uia_launch_lexicon_search = makeString("cb-uia-launch-lexicon-search");

    static private final SubLString $$$Search_Lexical_Knowledge = makeString("Search Lexical Knowledge");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_LEXICON_SEARCH = makeSymbol("CB-UIA-HANDLE-LAUNCH-LEXICON-SEARCH");

    static private final SubLString $$$Concept_Creator = makeString("Concept Creator");

    static private final SubLString $str_alt159$cb_uia_handle_launch_concept_crea = makeString("cb-uia-handle-launch-concept-creator");

    static private final SubLString $str_alt160$I_want_to_describe_a_new_sense_of = makeString("I want to describe a new sense of:");

    static private final SubLString $str_alt161$check_first_ = makeString("check_first?");

    static private final SubLString $str_alt162$Check_first_ = makeString("Check first?");

    private static final SubLSymbol CB_UIA_LAUNCH_CONCEPT_CREATOR = makeSymbol("CB-UIA-LAUNCH-CONCEPT-CREATOR");

    static private final SubLString $str_alt164$Uncheck_this_box_to_create_a_new_ = makeString("Uncheck this box to create a new concept without first checking whether I am already familiar with the concept.");

    static private final SubLString $str_alt165$Check_this_box_to_see_whether_I_a = makeString("Check this box to see whether I am already familiar with the concept.");

    private static final SubLSymbol $CONCEPT_CREATOR = makeKeyword("CONCEPT-CREATOR");

    private static final SubLSymbol $INTRODUCTION = makeKeyword("INTRODUCTION");

    static private final SubLString $$$New_Concept = makeString("New Concept");

    static private final SubLString $str_alt169$cb_uia_launch_concept_creator = makeString("cb-uia-launch-concept-creator");

    static private final SubLString $$$Create_Concept = makeString("Create Concept");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_CONCEPT_CREATOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-CONCEPT-CREATOR");

    static private final SubLString $$$Concept_Refinement_Interview = makeString("Concept Refinement Interview");

    static private final SubLString $str_alt173$cb_uia_handle_launch_salient_desc = makeString("cb-uia-handle-launch-salient-descriptor");

    static private final SubLString $str_alt174$I_want_to_refine__ = makeString("I want to refine: ");

    private static final SubLSymbol CB_UIA_LAUNCH_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-SALIENT-DESCRIPTOR");

    private static final SubLSymbol $SALIENT_DESCRIPTOR = makeKeyword("SALIENT-DESCRIPTOR");

    static private final SubLString $str_alt177$cb_uia_launch_salient_descriptor = makeString("cb-uia-launch-salient-descriptor");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-SALIENT-DESCRIPTOR");

    private static final SubLSymbol CB_UIA_LAUNCH_PREDICATE_CREATOR = makeSymbol("CB-UIA-LAUNCH-PREDICATE-CREATOR");

    private static final SubLSymbol $PREDICATE_CREATOR = makeKeyword("PREDICATE-CREATOR");

    static private final SubLString $$$New_Predicate = makeString("New Predicate");

    static private final SubLString $str_alt182$cb_uia_launch_predicate_creator = makeString("cb-uia-launch-predicate-creator");

    static private final SubLString $$$Create_Predicate = makeString("Create Predicate");

    static private final SubLString $$$Assertion_Creator = makeString("Assertion Creator");

    static private final SubLString $str_alt185$cb_uia_handle_launch_assertion_cr = makeString("cb-uia-handle-launch-assertion-creator");

    static private final SubLString $str_alt186$I_want_to_tell_you_the_following_ = makeString("I want to tell you the following fact:");

    static private final SubLString $$$sentence = makeString("sentence");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$virtual = makeString("virtual");

    private static final SubLSymbol CB_UIA_LAUNCH_ASSERTION_CREATOR = makeSymbol("CB-UIA-LAUNCH-ASSERTION-CREATOR");

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");

    static private final SubLString $$$New_Fact = makeString("New Fact");

    static private final SubLString $str_alt193$cb_uia_launch_assertion_creator = makeString("cb-uia-launch-assertion-creator");

    static private final SubLString $$$Create_Fact = makeString("Create Fact");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_ASSERTION_CREATOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-ASSERTION-CREATOR");

    static private final SubLString $str_alt196$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLObject $$CycRuleConstructor = constant_handles.reader_make_constant_shell(makeString("CycRuleConstructor"));

    private static final SubLSymbol $IF_CLAUSE = makeKeyword("IF-CLAUSE");

    private static final SubLSymbol $THEN_CLAUSE = makeKeyword("THEN-CLAUSE");

    private static final SubLSymbol $LAUNCHER_INTRO = makeKeyword("LAUNCHER-INTRO");

    static private final SubLString $$$Rule_Constructor = makeString("Rule Constructor");

    static private final SubLString $str_alt202$cb_uia_handle_launch_rule_constru = makeString("cb-uia-handle-launch-rule-constructor");

    static private final SubLString $str_alt203$if_sentence = makeString("if-sentence");

    static private final SubLString $str_alt204$then_sentence = makeString("then-sentence");

    static private final SubLString $$$Next_Step = makeString("Next Step");

    static private final SubLString $$$Cancel = makeString("Cancel");

    static private final SubLString $$$cancel = makeString("cancel");

    private static final SubLSymbol CB_UIA_LAUNCH_RULE_CONSTRUCTOR = makeSymbol("CB-UIA-LAUNCH-RULE-CONSTRUCTOR");

    private static final SubLSymbol $RULE_CONSTRUCTOR = makeKeyword("RULE-CONSTRUCTOR");

    static private final SubLString $$$New_Rule = makeString("New Rule");

    static private final SubLString $str_alt211$cb_uia_launch_rule_constructor = makeString("cb-uia-launch-rule-constructor");

    static private final SubLString $$$Create_Rule = makeString("Create Rule");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_RULE_CONSTRUCTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-RULE-CONSTRUCTOR");

    static private final SubLString $$$Analogy_Developer = makeString("Analogy Developer");

    static private final SubLString $str_alt215$cb_uia_handle_launch_analogy_deve = makeString("cb-uia-handle-launch-analogy-developer");

    static private final SubLString $str_alt216$is_are_like = makeString("is/are like");

    private static final SubLSymbol CB_UIA_LAUNCH_ANALOGY_DEVELOPER = makeSymbol("CB-UIA-LAUNCH-ANALOGY-DEVELOPER");

    private static final SubLSymbol $ANALOGY_DEVELOPER = makeKeyword("ANALOGY-DEVELOPER");

    static private final SubLString $$$State_Analogy = makeString("State Analogy");

    static private final SubLString $str_alt220$cb_uia_launch_analogy_developer = makeString("cb-uia-launch-analogy-developer");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_ANALOGY_DEVELOPER = makeSymbol("CB-UIA-HANDLE-LAUNCH-ANALOGY-DEVELOPER");

    static private final SubLList $list_alt222 = list(makeSymbol("PHRASE"));

    private static final SubLSymbol CB_UIA_CONCEPT_CREATOR = makeSymbol("CB-UIA-CONCEPT-CREATOR");

    static private final SubLString $str_alt224$cb_uia_concept_creator_ = makeString("cb-uia-concept-creator&");

    private static final SubLSymbol $UIA_CONCEPT_CREATOR = makeKeyword("UIA-CONCEPT-CREATOR");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_CREATOR = makeSymbol("CB-LINK-UIA-CONCEPT-CREATOR");

    static private final SubLString $$$Process_Descriptor = makeString("Process Descriptor");

    static private final SubLString $str_alt228$cb_uia_handle_launch_process_desc = makeString("cb-uia-handle-launch-process-descriptor");

    static private final SubLString $str_alt229$Name_a_new_process_to_describe_ = makeString("Name a new process to describe:");

    static private final SubLString $$$description = makeString("description");

    static private final SubLString $str_alt231$ = makeString("");

    static private final SubLString $str_alt232$Or_continue_work_on_an_existing_p = makeString("Or continue work on an existing processes: ");



    static private final SubLString $str_alt234$__D__ = makeString(" ~D  ");

    static private final SubLString $str_alt235$process_ = makeString("process-");

    static private final SubLString $$$select = makeString("select");

    private static final SubLSymbol CB_UIA_LAUNCH_PROCESS_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-PROCESS-DESCRIPTOR");

    private static final SubLSymbol $PROCESS_DESCRIPTOR = makeKeyword("PROCESS-DESCRIPTOR");

    static private final SubLString $str_alt239$cb_uia_launch_process_descriptor = makeString("cb-uia-launch-process-descriptor");

    static private final SubLString $$$Create_and_Edit_Processes = makeString("Create and Edit Processes");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_PROCESS_DESCRIPTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-PROCESS-DESCRIPTOR");

    private static final SubLSymbol CB_UIA_LAUNCH_SCENARIO_CONSTRUCTOR = makeSymbol("CB-UIA-LAUNCH-SCENARIO-CONSTRUCTOR");

    private static final SubLSymbol $SCENARIO_CONSTRUCTOR = makeKeyword("SCENARIO-CONSTRUCTOR");

    private static final SubLSymbol $WIZARDS = makeKeyword("WIZARDS");

    static private final SubLString $$$Scenario_Constructor = makeString("Scenario Constructor");

    static private final SubLString $str_alt246$cb_uia_launch_scenario_constructo = makeString("cb-uia-launch-scenario-constructor");

    static private final SubLString $$$Create_Scenario = makeString("Create Scenario");



    static private final SubLString $$$Dictionary_Assistant = makeString("Dictionary Assistant");

    static private final SubLString $str_alt250$cb_uia_launch_lexification_wizard = makeString("cb-uia-launch-lexification-wizard");

    static private final SubLString $$$Create_Lexical_Knowledge = makeString("Create Lexical Knowledge");

    private static final SubLSymbol CB_UIA_LAUNCH_COMMON_QUERIES = makeSymbol("CB-UIA-LAUNCH-COMMON-QUERIES");

    private static final SubLSymbol $COMMON_QUERIES = makeKeyword("COMMON-QUERIES");

    private static final SubLSymbol $REVIEW = makeKeyword("REVIEW");

    static private final SubLString $$$Common_Queries = makeString("Common Queries");

    static private final SubLString $str_alt256$cb_uia_launch_common_queries = makeString("cb-uia-launch-common-queries");

    static private final SubLString $$$View_Common_Questions = makeString("View Common Questions");

    static private final SubLString $$$Solution_Finder = makeString("Solution Finder");

    static private final SubLString $str_alt259$cb_uia_handle_launch_solution_fin = makeString("cb-uia-handle-launch-solution-finder");

    static private final SubLString $str_alt260$Please_answer_the_following_quest = makeString("Please answer the following question :");

    static private final SubLString $$$question = makeString("question");

    static private final SubLString $str_alt262$ask_question = makeString("ask-question");

    static private final SubLString $str_alt263$ask_quirk = makeString("ask-quirk");

    private static final SubLSymbol CB_UIA_LAUNCH_SOLUTION_FINDER = makeSymbol("CB-UIA-LAUNCH-SOLUTION-FINDER");

    static private final SubLString $str_alt265$Use_RKF_s_Dialog = makeString("Use RKF's Dialog");

    static private final SubLString $$$Answer_from_KB = makeString("Answer from KB");

    static private final SubLString $$$Use_QUIRK = makeString("Use QUIRK");

    static private final SubLString $$$Use_Text_Corpora = makeString("Use Text Corpora");

    private static final SubLSymbol $SOLUTION_FINDER = makeKeyword("SOLUTION-FINDER");

    static private final SubLString $$$Ask_a_Question = makeString("Ask a Question");

    static private final SubLString $str_alt271$cb_uia_launch_solution_finder = makeString("cb-uia-launch-solution-finder");

    static private final SubLString $$$Create_Question = makeString("Create Question");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_SOLUTION_FINDER = makeSymbol("CB-UIA-HANDLE-LAUNCH-SOLUTION-FINDER");

    private static final SubLSymbol CB_UIA_LAUNCH_COMMON_QUERIES_ABOUT = makeSymbol("CB-UIA-LAUNCH-COMMON-QUERIES-ABOUT");

    private static final SubLSymbol $COMMON_QUERIES_ABOUT = makeKeyword("COMMON-QUERIES-ABOUT");

    static private final SubLString $str_alt276$Ask_a_Question_About____ = makeString("Ask a Question About ...");

    static private final SubLString $str_alt277$cb_uia_launch_common_queries_abou = makeString("cb-uia-launch-common-queries-about");

    static private final SubLString $$$Find_Common_Questions_for_Concept = makeString("Find Common Questions for Concept");

    private static final SubLSymbol CB_UIA_LAUNCH_KNOWLEDGE_REVIEWER = makeSymbol("CB-UIA-LAUNCH-KNOWLEDGE-REVIEWER");

    private static final SubLSymbol $KNOWLEDGE_REVIEWER = makeKeyword("KNOWLEDGE-REVIEWER");

    static private final SubLString $$$Review_Knowledge = makeString("Review Knowledge");

    static private final SubLString $str_alt282$cb_uia_launch_knowledge_reviewer = makeString("cb-uia-launch-knowledge-reviewer");

    static private final SubLString $$$Review_My_Knowledge = makeString("Review My Knowledge");

    private static final SubLSymbol CB_UIA_LAUNCH_LEX_KNOWLEDGE_REVIEWER = makeSymbol("CB-UIA-LAUNCH-LEX-KNOWLEDGE-REVIEWER");

    private static final SubLSymbol $LEX_KNOWLEDGE_REVIEWER = makeKeyword("LEX-KNOWLEDGE-REVIEWER");

    static private final SubLString $$$Review_Lexical_Knowledge = makeString("Review Lexical Knowledge");

    static private final SubLString $str_alt287$cb_uia_launch_lex_knowledge_revie = makeString("cb-uia-launch-lex-knowledge-reviewer");

    static private final SubLString $$$Review_My_Lexical_Knowledge = makeString("Review My Lexical Knowledge");

    private static final SubLSymbol $TEST_SUITE_TOOL = makeKeyword("TEST-SUITE-TOOL");

    private static final SubLSymbol CB_UIA_LAUNCH_KNOWLEDGE_TESTER = makeSymbol("CB-UIA-LAUNCH-KNOWLEDGE-TESTER");

    private static final SubLSymbol $KNOWLEDGE_TESTER = makeKeyword("KNOWLEDGE-TESTER");

    static private final SubLString $$$Test_Knowledge = makeString("Test Knowledge");

    static private final SubLString $str_alt293$cb_uia_launch_knowledge_tester = makeString("cb-uia-launch-knowledge-tester");

    static private final SubLString $$$Test_My_Knowledge = makeString("Test My Knowledge");

    static private final SubLString $str_alt295$cb_uia_handle_launch_knowledge_fi = makeString("cb-uia-handle-launch-knowledge-finalizer");

    static private final SubLString $str_alt296$Are_you_sure_that_you_really_want = makeString("Are you sure that you really want to enter all of this bad OE into a perfectly good knowledge base?");

    static private final SubLString $str_alt297$Yes_ = makeString("Yes!");

    private static final SubLSymbol CB_UIA_LAUNCH_KNOWLEDGE_FINALIZER = makeSymbol("CB-UIA-LAUNCH-KNOWLEDGE-FINALIZER");

    private static final SubLSymbol $KNOWLEDGE_FINALIZER = makeKeyword("KNOWLEDGE-FINALIZER");

    private static final SubLSymbol $FINALIZATION = makeKeyword("FINALIZATION");

    static private final SubLString $$$Finalize_Knowledge = makeString("Finalize Knowledge");

    static private final SubLString $str_alt302$cb_uia_launch_knowledge_finalizer = makeString("cb-uia-launch-knowledge-finalizer");

    static private final SubLString $$$Finalize_My_Knowledge = makeString("Finalize My Knowledge");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_KNOWLEDGE_FINALIZER = makeSymbol("CB-UIA-HANDLE-LAUNCH-KNOWLEDGE-FINALIZER");

    private static final SubLSymbol CB_UIA_LAUNCH_PROBLEM_WINDOW = makeSymbol("CB-UIA-LAUNCH-PROBLEM-WINDOW");



    static private final SubLString $$$Problem = makeString("Problem");

    static private final SubLString $str_alt308$cb_uia_launch_problem_window = makeString("cb-uia-launch-problem-window");

    static private final SubLString $$$problem = makeString("problem");

    static private final SubLString $$$Report_a_Problem = makeString("Report a Problem");

    static private final SubLString $str_alt311$cb_uia_handle_launch_echo_message = makeString("cb-uia-handle-launch-echo-message");

    static private final SubLString $str_alt312$Enter_a_message_for_me_to_say_bac = makeString("Enter a message for me to say back to you :");

    static private final SubLString $$$message = makeString("message");

    static private final SubLString $$$Say_it = makeString("Say it");

    private static final SubLSymbol CB_UIA_LAUNCH_ECHO_MESSAGE = makeSymbol("CB-UIA-LAUNCH-ECHO-MESSAGE");

    private static final SubLSymbol $ECHO_MESSAGE = makeKeyword("ECHO-MESSAGE");

    static private final SubLString $$$Echo_Message = makeString("Echo Message");

    static private final SubLString $str_alt318$cb_uia_launch_echo_message = makeString("cb-uia-launch-echo-message");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_ECHO_MESSAGE = makeSymbol("CB-UIA-HANDLE-LAUNCH-ECHO-MESSAGE");

    static private final SubLString $str_alt320$cb_uia_handle_launch_create_inter = makeString("cb-uia-handle-launch-create-interaction");

    static private final SubLString $$$Create_it_Now = makeString("Create it Now");

    static private final SubLString $str_alt322$Mode__ = makeString("Mode :");

    static private final SubLString $$$mode = makeString("mode");

    static private final SubLString $str_alt324$_required = makeString(":required");

    static private final SubLString $str_alt325$Operator__ = makeString("Operator :");

    static private final SubLString $$$operator = makeString("operator");

    static private final SubLString $str_alt327$Args__ = makeString("Args :");

    static private final SubLString $$$args = makeString("args");

    static private final SubLString $str_alt329$__ = makeString("()");

    static private final SubLString $str_alt330$State__ = makeString("State :");

    static private final SubLString $$$state = makeString("state");

    private static final SubLSymbol CB_UIA_LAUNCH_CREATE_INTERACTION = makeSymbol("CB-UIA-LAUNCH-CREATE-INTERACTION");

    private static final SubLSymbol $CREATE_INTERACTION = makeKeyword("CREATE-INTERACTION");

    static private final SubLString $$$Create_Interaction = makeString("Create Interaction");

    static private final SubLString $str_alt335$cb_uia_launch_create_interaction = makeString("cb-uia-launch-create-interaction");

    static private final SubLString $$$Create_Interaction_By_Hand = makeString("Create Interaction By Hand");

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_CREATE_INTERACTION = makeSymbol("CB-UIA-HANDLE-LAUNCH-CREATE-INTERACTION");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_launchers_file();
    }

    public void initializeVariables() {
        init_cb_uia_launchers_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_launchers_file();
    }
}

