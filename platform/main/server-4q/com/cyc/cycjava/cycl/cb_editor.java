/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.assertion_handles.assertion_id;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.assertion_handles.find_assertion_by_id;
import static com.cyc.cycjava.cycl.assertions_high.assertion_direction;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.assertion_strength;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_el_sentence_error;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_el_sentence_input_section;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_extract_el_sentence_input;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_extract_mt_input;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_error;
import static com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_section;
import static com.cyc.cycjava.cycl.cb_frames.cb_default_content_internal;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_assertion_link_hook$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_default_content$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_gaf_arg_use_binary$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_suppress_body_level_elements$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_confirm_kills$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_editing_enabled$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$show_kb_monitor_links$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_definitional_preds_for_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_doc_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_constant;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_naut;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cyc_system_doc_naming_conventions;
import static com.cyc.cycjava.cycl.cb_utilities.cyc_system_doc_rename_kill;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.declare_deprecated_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.free_constant;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_icon_definitions$;
import static com.cyc.cycjava.cycl.dhtml_macros.get_next_html_element_id;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.html_utilities.html_autocomplete_text_input;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.kb_indexing.num_index;
import static com.cyc.cycjava.cycl.kb_utilities.compact_hl_external_id_string;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-EDITOR
 * source file: /cyc/top/cycl/cb-editor.lisp
 * created:     2019/07/03 17:38:05
 */
public final class cb_editor extends SubLTranslatedFile implements V12 {
    public static final SubLObject cb_link_diagnose_constant(SubLObject constant, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt225$_Diagnose_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt226$cb_diagnose_constant__A, cb_fort_identifier(constant));
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
            return constant;
        }
    }

    /**
     * Returns t iff the name of a is less than the name of b.
     */
    @LispMethod(comment = "Returns t iff the name of a is less than the name of b.")
    public static final SubLObject cb_diagnose_constant_test_name(SubLObject a, SubLObject b) {
        return Strings.string_lessp(Strings.string(a), Strings.string(b), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns t iff the level of a is less than the level b.
     */
    @LispMethod(comment = "Returns t iff the level of a is less than the level b.")
    public static final SubLObject cb_diagnose_constant_test_level(SubLObject a, SubLObject b) {
        return numL(a, b);
    }

    /**
     * Returns t iff the criticality of a is less than criticality b.
     */
    @LispMethod(comment = "Returns t iff the criticality of a is less than criticality b.")
    public static final SubLObject cb_diagnose_constant_test_criticality(SubLObject a, SubLObject b) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.position_L(a, b, $cb_diagnose_constant_criticality_order$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns t iff the concern of a is less than the concern of b.
     * Please note that it's important for these testing functions return nil when the items are equal.
     */
    @LispMethod(comment = "Returns t iff the concern of a is less than the concern of b.\r\nPlease note that it\'s important for these testing functions return nil when the items are equal.\nReturns t iff the concern of a is less than the concern of b.\nPlease note that it\'s important for these testing functions return nil when the items are equal.")
    public static final SubLObject cb_diagnose_constant_test_concern(SubLObject a, SubLObject b) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.position_L(a, b, $cb_diagnose_constant_concern_order$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Oh yes, another function that works completely by side-effect.  Takes the variable *diagnose-constant-main-list* and sorts it by the following precedents: concern, criticaility, level, and finally by name.
     */
    @LispMethod(comment = "Oh yes, another function that works completely by side-effect.  Takes the variable *diagnose-constant-main-list* and sorts it by the following precedents: concern, criticaility, level, and finally by name.")
    public static final SubLObject cb_diagnose_constant_sort_main_list() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject temp = $diagnose_constant_main_list$.getDynamicValue(thread);
                temp = Sort.stable_sort(temp, symbol_function(CB_DIAGNOSE_CONSTANT_TEST_NAME), symbol_function(CB_DIAGNOSE_CONSTANT_GET_NAME));
                temp = Sort.stable_sort(temp, symbol_function(CB_DIAGNOSE_CONSTANT_TEST_LEVEL), symbol_function(CB_DIAGNOSE_CONSTANT_GET_LEVEL));
                temp = Sort.stable_sort(temp, symbol_function(CB_DIAGNOSE_CONSTANT_TEST_CRITICALITY), symbol_function(CB_DIAGNOSE_CONSTANT_GET_CRITICALITY));
                temp = Sort.stable_sort(temp, symbol_function(CB_DIAGNOSE_CONSTANT_TEST_CONCERN), symbol_function(CB_DIAGNOSE_CONSTANT_GET_CONCERN));
                $diagnose_constant_main_list$.setDynamicValue(temp, thread);
            }
            return NIL;
        }
    }

    /**
     * Creates a list that holds all the diagnostics applicable to the variable *last-diagnose-constant* (using also *last-diagnose-applicable*) and stores the result in the var *diagnose-constant-main-list*.  This is a list where each element contains a list (on/off concern criticality level name description).  As you can see, this works completely by side effect.  Sorry.
     */
    @LispMethod(comment = "Creates a list that holds all the diagnostics applicable to the variable *last-diagnose-constant* (using also *last-diagnose-applicable*) and stores the result in the var *diagnose-constant-main-list*.  This is a list where each element contains a list (on/off concern criticality level name description).  As you can see, this works completely by side effect.  Sorry.")
    public static final SubLObject cb_diagnose_constant_make_main_list() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $diagnose_constant_main_list$.setDynamicValue(NIL, thread);
            {
                SubLObject cdolist_list_var = $last_diagnose_applicable$.getDynamicValue(thread);
                SubLObject diag = NIL;
                for (diag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diag = cdolist_list_var.first()) {
                    $diagnose_constant_main_list$.setDynamicValue(cons(list(eval(get(diag, $KBI_SELECT_VAR, UNPROVIDED)), get(diag, $KBI_CONCERN, UNPROVIDED), get(diag, $KBI_CRITICALITY, UNPROVIDED), get(diag, $KBI_LEVEL, UNPROVIDED), diag, get(diag, $KBI_DOC, UNPROVIDED)), $diagnose_constant_main_list$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Handles the user's request to modify and execute their tests.
     */
    @LispMethod(comment = "Handles the user\'s request to modify and execute their tests.")
    public static final SubLObject cb_diagnose_constant_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Diagnostic_Results;
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
                            SubLObject _prev_bind_0_47 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt30$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_DIAGNOSE_CONSTANT, UNPROVIDED, UNPROVIDED);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = $last_diagnose_applicable$.getDynamicValue(thread);
                                                    SubLObject diag = NIL;
                                                    for (diag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diag = cdolist_list_var.first()) {
                                                        kbi_utilities.kbi_unselect_module(diag);
                                                    }
                                                }
                                                {
                                                    SubLObject arg_list = args.rest();
                                                    SubLObject cdolist_list_var = arg_list;
                                                    SubLObject diag_list = NIL;
                                                    for (diag_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diag_list = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject diag_name = read_from_string_ignoring_errors(diag_list.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            kbi_utilities.kbi_select_module(diag_name);
                                                        }
                                                    }
                                                }
                                                html_princ($str_alt218$Executing_the_following_diagnosti);
                                                cb_form($last_diagnose_constant$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                html_princ($str_alt219$_);
                                                html_newline(UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = $last_diagnose_applicable$.getDynamicValue(thread);
                                                    SubLObject diag = NIL;
                                                    for (diag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diag = cdolist_list_var.first()) {
                                                        if (NIL != eval(get(diag, $KBI_SELECT_VAR, UNPROVIDED))) {
                                                            html_indent(TWO_INTEGER);
                                                            html_princ(diag);
                                                            html_newline(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_princ($str_alt220$_Please_be_patient_as_this_may_ta);
                                                html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_newline(THREE_INTEGER);
                                                {
                                                    SubLObject results = kbi_fort.diagnose_constant($last_diagnose_constant$.getDynamicValue(thread));
                                                    html_princ($str_alt221$Tests_complete__);
                                                    if (NIL != results) {
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                                        html_princ($str_alt222$The_following_errors_were_found_);
                                                        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = results;
                                                                    SubLObject bad_module = NIL;
                                                                    for (bad_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad_module = cdolist_list_var.first()) {
                                                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form(kbi_utilities.kbi_whyP(bad_module, $last_diagnose_constant$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                                    } else {
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt223$No_errors_were_found_);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                }
                                                html_newline(TWO_INTEGER);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_47, thread);
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

    /**
     * Returns the name portion of a diagnostic element.
     */
    @LispMethod(comment = "Returns the name portion of a diagnostic element.")
    public static final SubLObject cb_diagnose_constant_get_name(SubLObject a) {
        return fifth(a);
    }

    /**
     * Returns the level portion of a diagnostic element.
     */
    @LispMethod(comment = "Returns the level portion of a diagnostic element.")
    public static final SubLObject cb_diagnose_constant_get_level(SubLObject a) {
        return fourth(a);
    }

    /**
     * Returns whether or not this diagnostic is currently turned on as determined by the main list.
     */
    @LispMethod(comment = "Returns whether or not this diagnostic is currently turned on as determined by the main list.")
    public static final SubLObject cb_diagnose_constant_get_diag_on(SubLObject a) {
        return a.first();
    }

    /**
     * Returns the description portion of a diagnostic element.
     */
    @LispMethod(comment = "Returns the description portion of a diagnostic element.")
    public static final SubLObject cb_diagnose_constant_get_desc(SubLObject a) {
        return sixth(a);
    }

    /**
     * Returns the criticality portion of a diagnostic element.
     */
    @LispMethod(comment = "Returns the criticality portion of a diagnostic element.")
    public static final SubLObject cb_diagnose_constant_get_criticality(SubLObject a) {
        return third(a);
    }

    /**
     * Returns the concern portion of a diagnostic element in the main list.
     */
    @LispMethod(comment = "Returns the concern portion of a diagnostic element in the main list.")
    public static final SubLObject cb_diagnose_constant_get_concern(SubLObject a) {
        return second(a);
    }

    /**
     * Gives the user a Diagnostic screen.  From here they can choose
     * which tests they want and then run them.
     */
    @LispMethod(comment = "Gives the user a Diagnostic screen.  From here they can choose\r\nwhich tests they want and then run them.\nGives the user a Diagnostic screen.  From here they can choose\nwhich tests they want and then run them.")
    public static final SubLObject cb_diagnose_constant(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Constant_Diagnostics_page);
                return NIL;
            } else {
                {
                    SubLObject constant = cb_guess_constant(args);
                    if (NIL == constant_p(constant)) {
                        cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Constant_Diagnostics;
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
                                    SubLObject _prev_bind_0_26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                            html_markup($str_alt30$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_hidden_input($str_alt206$cb_diagnose_constant_handler, T, UNPROVIDED);
                                                            $last_diagnose_constant$.setDynamicValue(constant, thread);
                                                            cb_help_preamble($CB_DIAGNOSE_CONSTANT, UNPROVIDED, UNPROVIDED);
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt207$The_available_diagnostics_for_);
                                                            cb_form(constant, UNPROVIDED, UNPROVIDED);
                                                            html_princ($str_alt208$_are_listed_below___Please_select);
                                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            html_princ($str_alt177$Do_it_);
                                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                            html_princ($str_alt209$__button_);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(TWO_INTEGER);
                                                            html_reset_input($$$Current_Values);
                                                            html_indent(UNPROVIDED);
                                                            html_submit_input($str_alt177$Do_it_, UNPROVIDED, UNPROVIDED);
                                                            html_newline(TWO_INTEGER);
                                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(ZERO_INTEGER);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(ZERO_INTEGER);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(ZERO_INTEGER);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_princ($$$Concerns);
                                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    html_indent(TWO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_princ($$$Criticality);
                                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    html_indent(TWO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_princ($$$Level);
                                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    html_indent(TWO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(TWO_INTEGER);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_princ($$$Description_of_Diagnostic);
                                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    html_indent(TWO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(FIVE_INTEGER);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_source_readability_terpri(UNPROVIDED);
                                                                    $last_diagnose_applicable$.setDynamicValue(kbi_utilities.kbi_applicable_modules(constant), thread);
                                                                    com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_make_main_list();
                                                                    com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_sort_main_list();
                                                                    {
                                                                        SubLObject cdolist_list_var = $diagnose_constant_main_list$.getDynamicValue(thread);
                                                                        SubLObject diag = NIL;
                                                                        for (diag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , diag = cdolist_list_var.first()) {
                                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_checkbox_input(prin1_to_string(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_name(diag)), T, com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_diag_on(diag), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            html_indent(TWO_INTEGER);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_princ(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_concern(diag));
                                                                                            html_indent(TWO_INTEGER);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_princ(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_criticality(diag));
                                                                                            html_indent(TWO_INTEGER);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_princ(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_level(diag));
                                                                                            html_indent(TWO_INTEGER);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_markup(TWO_INTEGER);
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                            html_princ(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_name(diag));
                                                                                            html_princ($str_alt215$___);
                                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_source_readability_terpri(UNPROVIDED);
                                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_markup(THREE_INTEGER);
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_indent(FOUR_INTEGER);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_markup(ONE_INTEGER);
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_form(com.cyc.cycjava.cycl.cb_editor.cb_diagnose_constant_get_desc(diag), UNPROVIDED, UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_source_readability_terpri(UNPROVIDED);
                                                                            html_terpri(UNPROVIDED);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                }
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLSymbol $diagnose_constant_main_list$ = makeSymbol("*DIAGNOSE-CONSTANT-MAIN-LIST*");

    public static final SubLSymbol $last_diagnose_applicable$ = makeSymbol("*LAST-DIAGNOSE-APPLICABLE*");

    public static final SubLSymbol $last_diagnose_constant$ = makeSymbol("*LAST-DIAGNOSE-CONSTANT*");

    static private final SubLString $str_alt36$ = makeString("");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_diagnose_constant_criticality_order$ = makeSymbol("*CB-DIAGNOSE-CONSTANT-CRITICALITY-ORDER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_diagnose_constant_concern_order$ = makeSymbol("*CB-DIAGNOSE-CONSTANT-CONCERN-ORDER*");

    public static final SubLFile me = new cb_editor();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $merge_permitted_functions$ = makeSymbol("*MERGE-PERMITTED-FUNCTIONS*");

    private static final SubLSymbol $sym0$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $CREATE_SIMILAR_LEGACY = makeKeyword("CREATE-SIMILAR-LEGACY");

    private static final SubLSymbol $CREATE_SPEC_PRED = makeKeyword("CREATE-SPEC-PRED");

    private static final SubLSymbol $CREATE_SPEC_MT = makeKeyword("CREATE-SPEC-MT");

    private static final SubLSymbol $KB_MONITOR_INDEX_HOOK = makeKeyword("KB-MONITOR-INDEX-HOOK");

    private static final SubLString $str15$_Take_Test_ = makeString("[Take Test]");

    private static final SubLSymbol $KBQ_ASK_IN_PROOF_CHECKER = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");

    private static final SubLSymbol $KCT_TEST_SET = makeKeyword("KCT-TEST-SET");

    private static final SubLSymbol $SYNTACTIC_NODE_TOOLKIT = makeKeyword("SYNTACTIC-NODE-TOOLKIT");

    private static final SubLSymbol $EDIT_IN_SMT = makeKeyword("EDIT-IN-SMT");



    private static final SubLSymbol $CB_OWL_EXPORT_XML = makeKeyword("CB-OWL-EXPORT-XML");

    private static final SubLString $str31$_OWL_Export_ = makeString("[OWL Export]");

    private static final SubLList $list32 = list(makeString(":type"), makeKeyword("ONTOLOGY"));

    private static final SubLString $str33$_ontology = makeString(":ontology");



    private static final SubLList $list35 = list(reader_make_constant_shell("InstanceNamedFn-Ternary"), reader_make_constant_shell("ProperSubcollectionNamedFn-Ternary"), reader_make_constant_shell("CityNamedFn"), reader_make_constant_shell("PersonNamedFn"), reader_make_constant_shell("PlaceNamedFn"), reader_make_constant_shell("PredicateNamedFn"), reader_make_constant_shell("StreetNamedFn"), reader_make_constant_shell("OrganizationNamedFn"));

    private static final SubLString $str37$cb_create_html = makeString("cb-create.html");

    private static final SubLString $$$the_Create_Constant_page = makeString("the Create Constant page");

    private static final SubLString $$$Create_Constant = makeString("Create Constant");

    private static final SubLString $str40$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str41$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str46$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str52$cb_handle_create = makeString("cb-handle-create");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str54$Enter_name_for_new_constant___ = makeString("Enter name for new constant : ");

    private static final SubLString $str55$new_name = makeString("new-name");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $str57$ = makeString("");



    private static final SubLString $$$creating = makeString("creating");

    private static final SubLString $$$Cyc_Naming_Conventions = makeString("Cyc Naming Conventions");

    private static final SubLSymbol CB_CREATE = makeSymbol("CB-CREATE");

    private static final SubLString $$$Creating = makeString("Creating");

    private static final SubLString $$$No_name_was_specified = makeString("No name was specified");

    private static final SubLString $str65$_S_is_not_a_valid_constant_name = makeString("~S is not a valid constant name");

    private static final SubLString $str66$Already_a_constant_named__a = makeString("Already a constant named ~a");

    private static final SubLString $$$Constant_Create = makeString("Constant Create");

    private static final SubLString $str68$Unable_to_create_a_constant_named = makeString("Unable to create a constant named ~S");

    private static final SubLSymbol CB_HANDLE_CREATE = makeSymbol("CB-HANDLE-CREATE");

    private static final SubLString $str71$create_tool_gif = makeString("create-tool.gif");

    private static final SubLString $$$Create = makeString("Create");

    private static final SubLString $str74$cb_create = makeString("cb-create");

    private static final SubLSymbol CB_LINK_CREATE = makeSymbol("CB-LINK-CREATE");

    private static final SubLString $$$Crt = makeString("Crt");

    private static final SubLString $$$Create_Bare_Cyc_Constant = makeString("Create Bare Cyc Constant");

    private static final SubLSymbol $CB_CREATE_SIMILAR = makeKeyword("CB-CREATE-SIMILAR");

    private static final SubLString $str79$cb_create_similar_html = makeString("cb-create-similar.html");

    public static final SubLSymbol $cb_enable_legacy_create_similar$ = makeSymbol("*CB-ENABLE-LEGACY-CREATE-SIMILAR*");

    private static final SubLString $$$the_Create_Similar_Term_page = makeString("the Create Similar Term page");

    private static final SubLList $list82 = list(makeSymbol("FORT-SPEC"));

    private static final SubLString $str83$_a_does_not_specify_a_Cyc_term = makeString("~a does not specify a Cyc term");

    private static final SubLString $$$Create_Similar_Term = makeString("Create Similar Term");

    private static final SubLString $str85$cb_handle_create_similar_legacy = makeString("cb-handle-create-similar-legacy");

    private static final SubLString $str86$Enter_name_for_new_term_similar_t = makeString("Enter name for new term similar to ");

    private static final SubLString $str87$__ = makeString(" :");

    private static final SubLString $$$Create_Similar = makeString("Create Similar");

    private static final SubLString $$$create = makeString("create");

    private static final SubLString $$$Copy_Assertions = makeString("Copy Assertions");

    private static final SubLString $$$copy = makeString("copy");

    private static final SubLString $$$Check_the_assertions_from_ = makeString("Check the assertions from ");

    private static final SubLString $str93$_which_you_wish_to_copy_as_well__ = makeString(" which you wish to copy as well: ");

    private static final SubLSymbol CB_CREATE_SIMILAR_CHECKBOX = makeSymbol("CB-CREATE-SIMILAR-CHECKBOX");

    private static final SubLSymbol CB_CREATE_SIMILAR_LEGACY = makeSymbol("CB-CREATE-SIMILAR-LEGACY");

    private static final SubLString $$$create_similar_facilities = makeString("create similar facilities");

    private static final SubLString $str98$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    private static final SubLString $$$No_term_was_specified = makeString("No term was specified");

    private static final SubLString $str100$_S_is_not_a_valid_term_name = makeString("~S is not a valid term name");

    private static final SubLString $str101$Already_a_constant_named__S = makeString("Already a constant named ~S");

    private static final SubLString $str102$Constant__S_already_exists_which_ = makeString("Constant ~S already exists which differs from ~S only by case");

    private static final SubLString $str103$Unable_to_create_a_similar_term_n = makeString("Unable to create a similar term named ~S");

    private static final SubLSymbol CB_HANDLE_CREATE_SIMILAR_LEGACY = makeSymbol("CB-HANDLE-CREATE-SIMILAR-LEGACY");

    private static final SubLString $$$error = makeString("error");

    private static final SubLString $str107$_S = makeString("~S");

    private static final SubLString $$$focalterm = makeString("focalterm");

    private static final SubLString $$$response = makeString("response");

    private static final SubLString $$$invalidTerm = makeString("invalidTerm");

    private static final SubLString $str111$_S_is_not_a_valid_term_name_ = makeString("~S is not a valid term name.");

    private static final SubLString $str112$Constant__A_already_exists__which = makeString("Constant ~A already exists, which differs from ~S only by case.");

    private static final SubLString $str113$Unable_to_create_a_term_named__S_ = makeString("Unable to create a term named ~S.");

    private static final SubLString $$$sentence = makeString("sentence");





    private static final SubLString $$$newTermId = makeString("newTermId");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$invalidSentence = makeString("invalidSentence");

    private static final SubLString $$$count = makeString("count");

    private static final SubLString $$$assertionsQueued = makeString("assertionsQueued");

    private static final SubLString $str125$_A_assertions_added_to_the_local_ = makeString("~A assertions added to the local queue.");

    private static final SubLSymbol CB_HANDLE_CREATE_SIMILAR = makeSymbol("CB-HANDLE-CREATE-SIMILAR");

    private static final SubLString $str128$_Create_Similar_ = makeString("[Create Similar]");

    private static final SubLString $str129$cb_create_similar__A = makeString("cb-create-similar&~A");

    private static final SubLSymbol CB_LINK_CREATE_SIMILAR = makeSymbol("CB-LINK-CREATE-SIMILAR");

    private static final SubLString $str131$color_red__font_size_120___font_w = makeString("color:red; font-size:120%; font-weight:700");



    private static final SubLString $str133$Sorry__ = makeString("Sorry, ");

    private static final SubLString $str134$_cannot_make_assertions_using_the = makeString(" cannot make assertions using the tool.   Please ");

    private static final SubLString $$$login = makeString("login");

    private static final SubLString $str137$_using_your_real_name_now_so_that = makeString(" using your real name now so that you can make assertions using this tool.");

    private static final SubLString $$$lookupbutton = makeString("lookupbutton");

    private static final SubLString $$$assertbutton = makeString("assertbutton");

    private static final SubLString $str140$font_size_10pt = makeString("font-size:10pt");

    private static final SubLString $$$All_Mts = makeString("All Mts");

    private static final SubLString $str142$togglecheckall___ = makeString("togglecheckall();");

    private static final SubLString $str143$Check_All___Uncheck_All = makeString("Check All / Uncheck All");

    private static final SubLString $$$Undo = makeString("Undo");

    private static final SubLString $str145$uncommit__ = makeString("uncommit()");

    private static final SubLString $$$Redo = makeString("Redo");

    private static final SubLString $str147$recommit__ = makeString("recommit()");

    private static final SubLString $$$Switch_to_Browse_Mode = makeString("Switch to Browse Mode");

    private static final SubLString $str149$togglelookupmode__ = makeString("togglelookupmode()");

    private static final SubLString $$$SEND = makeString("SEND");

    private static final SubLString $str151$dosubmit__ = makeString("dosubmit()");

    private static final SubLString $$$Assert_selected_sentences = makeString("Assert selected sentences");

    private static final SubLSymbol MAX_ARITY = makeSymbol("MAX-ARITY");

    private static final SubLSymbol $sym155$_ = makeSymbol(">");

    private static final SubLString $str156$_ = makeString(")");

    private static final SubLString $str157$_ = makeString("(");

    private static final SubLString $str158$_ = makeString("_");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$focalTerm = makeString("focalTerm");

    private static final SubLString $$$hlid = makeString("hlid");

    private static final SubLString $$$contentspec = makeString("contentspec");



    private static final SubLString $$$assertions = makeString("assertions");

    private static final SubLString $$$assertion = makeString("assertion");



    private static final SubLSymbol $CB_CREATE_SIMILAR_JS = makeKeyword("CB-CREATE-SIMILAR-JS");

    private static final SubLSymbol CB_CREATE_SIMILAR = makeSymbol("CB-CREATE-SIMILAR");

    private static final SubLString $str174$cb_create_similar_legacy__A = makeString("cb-create-similar-legacy&~A");

    private static final SubLSymbol CB_LINK_CREATE_SIMILAR_LEGACY = makeSymbol("CB-LINK-CREATE-SIMILAR-LEGACY");

    private static final SubLString $str176$_Create_Instance_ = makeString("[Create Instance]");

    private static final SubLString $str177$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'instance');");

    private static final SubLSymbol CB_LINK_CREATE_INSTANCE = makeSymbol("CB-LINK-CREATE-INSTANCE");

    private static final SubLString $str179$_Create_Spec_ = makeString("[Create Spec]");

    private static final SubLString $str180$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'spec');");

    private static final SubLSymbol CB_LINK_CREATE_SPEC = makeSymbol("CB-LINK-CREATE-SPEC");

    private static final SubLString $str182$_Create_Spec_Mt_ = makeString("[Create Spec Mt]");

    private static final SubLString $str183$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'spec-mt');");

    private static final SubLSymbol CB_LINK_CREATE_SPEC_MT = makeSymbol("CB-LINK-CREATE-SPEC-MT");

    private static final SubLString $str185$_Create_Spec_Pred_ = makeString("[Create Spec Pred]");

    private static final SubLString $str186$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'spec-pred');");

    private static final SubLSymbol CB_LINK_CREATE_SPEC_PRED = makeSymbol("CB-LINK-CREATE-SPEC-PRED");

    private static final SubLString $str189$cb_rename_html = makeString("cb-rename.html");

    private static final SubLString $$$the_Rename_Constant_page = makeString("the Rename Constant page");

    private static final SubLString $str191$_a_does_not_specify_a_Cyc_constan = makeString("~a does not specify a Cyc constant");

    private static final SubLString $$$Rename_Constant = makeString("Rename Constant");

    private static final SubLString $str193$cb_handle_rename = makeString("cb-handle-rename");

    private static final SubLString $$$Enter_new_name_for_ = makeString("Enter new name for ");

    private static final SubLString $$$Current_Name = makeString("Current Name");

    private static final SubLString $$$Rename = makeString("Rename");

    private static final SubLString $$$naming = makeString("naming");

    private static final SubLString $$$renaming = makeString("renaming");

    private static final SubLString $str199$Cyc_Rename_Kill = makeString("Cyc Rename/Kill");

    private static final SubLSymbol CB_RENAME = makeSymbol("CB-RENAME");

    private static final SubLString $str201$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~S");

    private static final SubLString $str202$Name_specified_is_same_as_current = makeString("Name specified is same as current name");

    private static final SubLString $$$Constant_Rename = makeString("Constant Rename");

    private static final SubLSymbol CB_HANDLE_RENAME = makeSymbol("CB-HANDLE-RENAME");

    private static final SubLString $str205$_Rename_ = makeString("[Rename]");

    private static final SubLString $str206$cb_rename__A = makeString("cb-rename&~A");

    private static final SubLSymbol CB_LINK_RENAME = makeSymbol("CB-LINK-RENAME");

    private static final SubLString $str209$cb_merge_html = makeString("cb-merge.html");

    private static final SubLString $$$the_Merge_Term_page = makeString("the Merge Term page");

    private static final SubLString $$$Merge_Term = makeString("Merge Term");

    private static final SubLString $str212$cb_handle_merge = makeString("cb-handle-merge");

    private static final SubLString $str213$fort_spec = makeString("fort-spec");

    private static final SubLString $$$Merge_the_term_ = makeString("Merge the term ");

    private static final SubLString $str215$_onto_the_existing_constant_named = makeString(" onto the existing constant named :");

    private static final SubLString $str216$target_name = makeString("target-name");

    private static final SubLString $$$Merge = makeString("Merge");

    private static final SubLSymbol CB_MERGE = makeSymbol("CB-MERGE");

    private static final SubLString $$$merging = makeString("merging");

    private static final SubLString $str220$Attempt_to_merge__S_with_itself_ = makeString("Attempt to merge ~S with itself.");

    private static final SubLSymbol CB_HANDLE_MERGE = makeSymbol("CB-HANDLE-MERGE");

    private static final SubLString $str222$_Merge_ = makeString("[Merge]");

    private static final SubLString $str223$cb_merge__A = makeString("cb-merge&~A");

    private static final SubLSymbol CB_LINK_MERGE = makeSymbol("CB-LINK-MERGE");

    private static final SubLString $$$the_Cyc_term_kill_facility = makeString("the Cyc term kill facility");

    private static final SubLString $$$confirmed = makeString("confirmed");

    private static final SubLString $$$Term_Kill = makeString("Term Kill");

    private static final SubLSymbol CB_KILL = makeSymbol("CB-KILL");

    private static final SubLString $str229$_Kill_ = makeString("[Kill]");

    private static final SubLString $str230$cb_kill__A = makeString("cb-kill&~A");

    private static final SubLString $str231$cb_kill__A_confirmed_T = makeString("cb-kill&~A|confirmed=T");

    private static final SubLSymbol CB_LINK_KILL = makeSymbol("CB-LINK-KILL");

    private static final SubLSymbol $CB_CONFIRM_KILL = makeKeyword("CB-CONFIRM-KILL");

    private static final SubLString $str234$cb_confirm_kill_html = makeString("cb-confirm-kill.html");

    private static final SubLString $$$Confirm_Term_Kill = makeString("Confirm Term Kill");

    private static final SubLString $str236$cb_kill = makeString("cb-kill");

    private static final SubLString $$$T = makeString("T");

    private static final SubLString $str238$NOTE__ = makeString("NOTE: ");

    private static final SubLString $str239$If_you_are_killing_this_term_to_r = makeString("If you are killing this term to remove its assertions and start again from scratch, please go to the ");

    private static final SubLString $str241$_page_instead_ = makeString(" page instead.");

    private static final SubLString $$$Please_confirm_kill_of_ = makeString("Please confirm kill of ");

    private static final SubLString $str243$_and_the_removal_of_all__S_assert = makeString(" and the removal of all ~S assertions involving it.");

    private static final SubLString $$$No = makeString("No");

    private static final SubLString $str246$Yes__Kill = makeString("Yes, Kill");

    private static final SubLString $$$killing_constants = makeString("killing constants");

    private static final SubLSymbol CB_CONFIRM_KILL = makeSymbol("CB-CONFIRM-KILL");

    private static final SubLString $str249$cb_confirm_kill__A = makeString("cb-confirm-kill&~A");

    private static final SubLSymbol CB_LINK_CONFIRM_KILL = makeSymbol("CB-LINK-CONFIRM-KILL");

    private static final SubLString $str252$cb_recreate_html = makeString("cb-recreate.html");

    private static final SubLString $str253$the_Cyc_constant_recreate_facilit = makeString("the Cyc constant recreate facility");

    private static final SubLList $list254 = list(makeSymbol("CONSTANT-SPEC"));

    private static final SubLString $$$Recreate_Constant = makeString("Recreate Constant");

    private static final SubLString $str256$cb_recreate_handler = makeString("cb-recreate-handler");

    private static final SubLString $$$Please_confirm_recreation_of_ = makeString("Please confirm recreation of ");

    private static final SubLString $str258$Yes__Recreate = makeString("Yes, Recreate");

    private static final SubLSymbol CB_RECREATE = makeSymbol("CB-RECREATE");

    private static final SubLString $$$Constant_Recreate = makeString("Constant Recreate");

    private static final SubLSymbol CB_RECREATE_HANDLER = makeSymbol("CB-RECREATE-HANDLER");

    private static final SubLString $str262$_Recreate_ = makeString("[Recreate]");

    private static final SubLString $str263$cb_recreate__A = makeString("cb-recreate&~A");

    private static final SubLSymbol CB_LINK_RECREATE = makeSymbol("CB-LINK-RECREATE");

    private static final SubLSymbol $CB_ALL_ASSERTIONS_TMS_HANDLER = makeKeyword("CB-ALL-ASSERTIONS-TMS-HANDLER");

    private static final SubLString $str266$cb_all_assertions_tms_handler_htm = makeString("cb-all-assertions-tms-handler.html");

    private static final SubLString $$$the_Reperform_TMS_facility = makeString("the Reperform TMS facility");

    private static final SubLString $$$Confirm_Reperform_TMS_Page = makeString("Confirm Reperform TMS Page");

    private static final SubLString $str269$cb_all_assertions_tms_handler = makeString("cb-all-assertions-tms-handler");

    private static final SubLString $str270$These_operations_may_take_some_ti = makeString("These operations may take some time.  Please confirm that you really want to force TMS for all ");

    private static final SubLString $str271$_of_the_assertions_of_the_constan = makeString(" of the assertions of the constant ");

    private static final SubLString $str272$_ = makeString(".");

    private static final SubLString $str273$Do_it_ = makeString("Do it!");

    private static final SubLSymbol CB_ALL_ASSERTIONS_TMS = makeSymbol("CB-ALL-ASSERTIONS-TMS");

    private static final SubLString $str275$Reperform_TMS_on_indexed_Assertio = makeString("Reperform TMS on indexed Assertions");

    private static final SubLSymbol CB_ALL_ASSERTIONS_TMS_HANDLER = makeSymbol("CB-ALL-ASSERTIONS-TMS-HANDLER");

    private static final SubLString $str277$_Force_TMS_ = makeString("[Force TMS]");

    private static final SubLString $str278$cb_all_assertions_tms__A = makeString("cb-all-assertions-tms&~A");

    private static final SubLSymbol $ALL_ASSERTIONS_TMS = makeKeyword("ALL-ASSERTIONS-TMS");

    private static final SubLSymbol CB_LINK_ALL_ASSERTIONS_TMS = makeSymbol("CB-LINK-ALL-ASSERTIONS-TMS");

    public static final SubLSymbol $cb_last_hyp_formula$ = makeSymbol("*CB-LAST-HYP-FORMULA*");

    public static final SubLSymbol $cb_last_hyp_mt$ = makeSymbol("*CB-LAST-HYP-MT*");

    private static final SubLSymbol $CB_HYPOTHESIZE_HANDLER = makeKeyword("CB-HYPOTHESIZE-HANDLER");

    private static final SubLString $str284$cb_hypothesize_handler_html = makeString("cb-hypothesize-handler.html");

    private static final SubLString $$$Hypothesize = makeString("Hypothesize");

    private static final SubLString $str286$cb_hypothesize_handler = makeString("cb-hypothesize-handler");

    private static final SubLString $$$Reset_Values = makeString("Reset Values");

    private static final SubLList $list288 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TEN_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    private static final SubLSymbol CB_HYPOTHESIZE_HANDLER = makeSymbol("CB-HYPOTHESIZE-HANDLER");

    private static final SubLList $list290 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLString $$$Last_hypothesis_in_ = makeString("Last hypothesis in ");

    private static final SubLString $str293$Error_description__ = makeString("Error description: ");

    private static final SubLString $str294$Hypothesis_results___ = makeString("Hypothesis results : ");

    private static final SubLSymbol CB_LINK_HYPOTHESIZE = makeSymbol("CB-LINK-HYPOTHESIZE");

    private static final SubLString $$$Hyp = makeString("Hyp");

    private static final SubLString $$$Hypothesize_a_formula = makeString("Hypothesize a formula");

    private static final SubLString $$$assertionId = makeString("assertionId");

    private static final SubLSymbol XML_ASSERTION_INFO = makeSymbol("XML-ASSERTION-INFO");

    private static final SubLList $list301 = list(makeKeyword("INPUT-NAME"), makeString("cycl"));

    private static final SubLSymbol CB_FORM_SMART = makeSymbol("CB-FORM-SMART");

    // Definitions
    public static final SubLObject cb_create_hook_alt(SubLObject new_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_constant = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        new_constant = ke.ke_create(new_name);
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_constant;
            }
        }
    }

    // Definitions
    public static SubLObject cb_create_hook(final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            return ke.ke_create(new_name);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject cb_hypothesize_hook_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject error = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        try {
                            {
                                SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        ans = prove.fi_hypothesize(formula, mt, UNPROVIDED, UNPROVIDED);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != error ? ((SubLObject) (error)) : ans;
            }
        }
    }

    public static SubLObject cb_hypothesize_hook(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject error = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        ans = prove.fi_hypothesize(formula, mt, UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL != error ? error : ans;
    }

    public static final SubLObject cb_term_toolbar_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(fort)) {
                {
                    SubLObject modification_permittedP = com.cyc.cycjava.cycl.cb_editor.term_modification_permittedP(fort);
                    SubLObject not_modifiableP = makeBoolean(NIL == modification_permittedP);
                    if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($CREATE_SIMILAR, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        if (NIL != fort_types_interface.collectionP(fort)) {
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_link($CREATE_INSTANCE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        if (NIL != fort_types_interface.collectionP(fort)) {
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_link($CREATE_SPEC, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        if (NIL == nart_handles.nart_p(fort)) {
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_link($RENAME, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        if (NIL != com.cyc.cycjava.cycl.cb_editor.term_as_merge_source_permittedP(fort)) {
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_link($MERGE, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        if (NIL != $cb_confirm_kills$.getDynamicValue(thread)) {
                            cb_link($CONFIRM_KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                        } else {
                            cb_link($KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    if (NIL != fort_types_interface.microtheory_p(fort)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($FORWARD_PROPAGATE_MT, NIL, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($ALL_ASSERTIONS_TMS, fort, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    if (NIL == nart_handles.nart_p(fort)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($DIAGNOSE_CONSTANT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    {
                        SubLObject unlexifiedP = lexification_utilities.unlexifiedP(fort, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        if (NIL != unlexifiedP) {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_link($LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } else {
                            cb_link($LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if (NIL != kct_utils.kct_test_spec_p(fort, UNPROVIDED)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($KCT_TEST, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        {
                            SubLObject query = kct_utils.kct_query_specification(fort, UNPROVIDED);
                            if (NIL != forts.fort_p(query)) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                cb_link($KBQ_ASK, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                        }
                    }
                    if (NIL != kct_utils.kct_test_collection_p(fort, UNPROVIDED)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($KCT_TEST_SET, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    if (NIL != kct_utils.kct_test_spec_p(fort, UNPROVIDED)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($KCT_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    if (NIL != kb_query.kbq_query_spec_p(fort)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($KBQ_ASK, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($KBQ_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    if (NIL != iterative_template_parser.syntactic_option_node_p(fort)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($SYNTACTIC_NODE_TOOLKIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    if (NIL != sksi_kb_accessors.sk_source_in_any_mt_p(fort)) {
                        {
                            SubLObject pcase_var = sksi_sks_manager.sks_registration_state(fort);
                            if (pcase_var.eql($NOREG)) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                cb_link($SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } else {
                                if (pcase_var.eql($PARTIAL)) {
                                    html_indent(UNPROVIDED);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    cb_link($SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    cb_link($SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } else {
                                    if (pcase_var.eql($REG)) {
                                        html_indent(UNPROVIDED);
                                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        cb_link($SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_term_toolbar(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(fort)) {
            final SubLObject modification_permittedP = term_modification_permittedP(fort);
            final SubLObject not_modifiableP = makeBoolean(NIL == modification_permittedP);
            if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                if (NIL != $cb_enable_legacy_create_similar$.getDynamicValue(thread)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($CREATE_SIMILAR_LEGACY, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($CREATE_SIMILAR, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (NIL != fort_types_interface.collectionP(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($CREATE_INSTANCE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL != fort_types_interface.collectionP(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($CREATE_SPEC, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL != cycl_grammar.cycl_predicate_p(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($CREATE_SPEC_PRED, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL != fort_types_interface.microtheory_p(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($CREATE_SPEC_MT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL == nart_handles.nart_p(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($RENAME, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL != term_as_merge_source_permittedP(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($MERGE, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (NIL != $cb_confirm_kills$.getDynamicValue(thread)) {
                    cb_link($CONFIRM_KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_link($KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED);
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (NIL != $show_kb_monitor_links$.getDynamicValue(thread)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KB_MONITOR_INDEX_HOOK, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            final SubLObject unlexifiedP = lexification_utilities.unlexifiedP(fort, UNPROVIDED);
            html_indent(UNPROVIDED);
            if (NIL != unlexifiedP) {
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                cb_link($LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            } else {
                cb_link($LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != kct_utils.kct_test_spec_p(fort, UNPROVIDED)) {
                html_indent(UNPROVIDED);
                final SubLObject ttt_linkP = NIL;
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (NIL != ttt_linkP) {
                    cb_link($TTT_TEST, fort, $str15$_Take_Test_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_link($KCT_TEST, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                final SubLObject query = kct_utils.kct_query_specification(fort, UNPROVIDED);
                if (NIL != forts.fort_p(query)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($KBQ_ASK, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    if (NIL != cb_kb_query.kbq_query_practice_rules(query)) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_indent(UNPROVIDED);
                        cb_link($KBQ_ASK_IN_PROOF_CHECKER, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                }
            }
            if (NIL != kct_utils.kct_test_collection_p(fort, UNPROVIDED)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KCT_TEST_SET, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (NIL != kct_utils.kct_test_spec_p(fort, UNPROVIDED)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KCT_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (NIL != kb_query.kbq_query_spec_p(fort)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KBQ_ASK, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (NIL != cb_kb_query.kbq_query_practice_rules(fort)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($KBQ_ASK_IN_PROOF_CHECKER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KBQ_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (NIL != iterative_template_parser.syntactic_option_node_p(fort)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($SYNTACTIC_NODE_TOOLKIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (NIL != sksi_kb_accessors.sk_source_in_any_mt_p(fort)) {
                final SubLObject pcase_var = sksi_sks_manager.sks_registration_state(fort);
                if (pcase_var.eql($NOREG)) {
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } else
                    if (pcase_var.eql($PARTIAL)) {
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } else
                        if (pcase_var.eql($REG)) {
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_link($SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }


                if ((NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread)) && (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(fort))) {
                    cb_link($EDIT_IN_SMT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != isa.isa_in_any_mtP(fort, $$Ontology)) {
                html_indent(UNPROVIDED);
                cb_link($CB_OWL_EXPORT_XML, $str31$_OWL_Export_, html_arghash.arglist_to_arghash(list($list32, list($str33$_ontology, fort))), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Tells whether or not the given term can be modified.
     */
    @LispMethod(comment = "Tells whether or not the given term can be modified.")
    public static final SubLObject term_modification_permittedP_alt(SubLObject v_term) {
        return makeBoolean(!(((NIL != kb_accessors.public_termP(v_term)) || (NIL != sbhl_time_utilities.sbhl_temporal_point_nartP(v_term))) || (NIL != constant_completion.constant_mentioned_in_codeP(v_term))));
    }

    /**
     * Tells whether or not the given term can be modified.
     */
    @LispMethod(comment = "Tells whether or not the given term can be modified.")
    public static SubLObject term_modification_permittedP(final SubLObject v_term) {
        return makeBoolean(NIL == term_modification_forbiddenP(v_term));
    }

    public static SubLObject term_modification_forbiddenP(final SubLObject v_term) {
        if ((NIL != constant_completion.constant_mentioned_in_codeP(v_term)) || (NIL != isa.quoted_isa_in_any_mtP(v_term, $$ReservedConstant))) {
            return T;
        }
        return sbhl_time_utilities.sbhl_temporal_point_nartP(v_term);
    }

    public static final SubLObject term_as_merge_source_permittedP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != constant_p(v_term)) || ((NIL != nart_handles.nart_p(v_term)) && (NIL != list_utilities.member_eqP(cycl_utilities.nat_function(v_term), $merge_permitted_functions$.getDynamicValue(thread)))));
        }
    }

    public static SubLObject term_as_merge_source_permittedP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != constant_p(v_term)) || ((NIL != nart_handles.nart_p(v_term)) && (NIL != list_utilities.member_eqP(cycl_utilities.nat_function(v_term), $merge_permitted_functions$.getDynamicValue(thread)))));
    }

    public static final SubLObject cb_create_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Create_Constant_page);
            } else {
                {
                    SubLObject title_var = $$$Create_Constant;
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
                                SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt30$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_hidden_input($str_alt31$cb_handle_create, T, UNPROVIDED);
                                                        cb_help_preamble($CB_CREATE, NIL, UNPROVIDED);
                                                        html_reset_input($$$Clear);
                                                        html_indent(UNPROVIDED);
                                                        html_submit_input($$$Create_Constant, UNPROVIDED, UNPROVIDED);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt33$Enter_name_for_new_constant___);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(TWO_INTEGER);
                                                        html_complete.html_complete_button($str_alt34$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_indent(UNPROVIDED);
                                                        html_text_input($str_alt34$new_name, $str_alt36$, $int$40);
                                                        html_newline(TWO_INTEGER);
                                                        cb_doc_link($$$creating, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_create(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Create_Constant_page);
        } else {
            final SubLObject title_var = $$$Create_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str46$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
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
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str52$cb_handle_create, T, UNPROVIDED);
                                cb_help_preamble($CB_CREATE, NIL, UNPROVIDED);
                                html_reset_input($$$Clear);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Create_Constant, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str54$Enter_name_for_new_constant___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_complete.html_complete_button($str55$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_text_input($str55$new_name, $str57$, $int$40);
                                html_newline(TWO_INTEGER);
                                cb_doc_link($$$creating, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$2, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_create_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Creating);
            return NIL;
        }
        {
            SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str_alt34$new_name, args));
            if ((!new_name.isString()) || new_name.equal($str_alt36$)) {
                cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                    cb_error($str_alt43$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != constants_high.find_constant(new_name)) {
                        cb_error($str_alt44$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        {
                            SubLObject new_constant = com.cyc.cycjava.cycl.cb_editor.cb_create_hook(new_name);
                            if (NIL != constant_p(new_constant)) {
                                cb_tools.cb_add_to_constant_history(new_constant);
                                cb_assertion_editor.cb_note_edit_change($$$Constant_Create, NIL, UNPROVIDED, UNPROVIDED);
                            } else {
                                cb_error($str_alt46$Unable_to_create_a_constant_named, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_create(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Creating);
            return NIL;
        }
        final SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str55$new_name, args));
        if ((!new_name.isString()) || new_name.equal($str57$)) {
            cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                cb_error($str65$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != constants_high.find_constant(new_name)) {
                    cb_error($str66$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    final SubLObject new_constant = cb_create_hook(new_name);
                    if (NIL != constant_p(new_constant)) {
                        cb_tools.cb_add_to_constant_history(new_constant);
                        cb_assertion_editor.cb_note_edit_change($$$Constant_Create, NIL, UNPROVIDED, UNPROVIDED);
                    } else {
                        cb_error($str68$Unable_to_create_a_constant_named, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }


        return NIL;
    }

    public static final SubLObject cb_link_create_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Create;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt52$cb_create);
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

    public static SubLObject cb_link_create(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Create;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str74$cb_create);
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

    public static SubLObject cb_create_similar_legacy(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Create_Similar_Term_page);
        } else {
            SubLObject fort_spec = NIL;
            destructuring_bind_must_consp(args, args, $list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    cb_error($str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                fort_spec = cb_fort_identifier(fort);
                final SubLObject title_var = $$$Create_Similar_Term;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str41$_meta_http_equiv__X_UA_Compatible);
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
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                            html_markup($str46$yui_skin_sam);
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
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str85$cb_handle_create_similar_legacy, fort_spec, UNPROVIDED);
                                    cb_help_preamble($CB_CREATE_SIMILAR, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str86$Enter_name_for_new_term_similar_t);
                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                    html_princ($str87$__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    html_autocomplete_text_input($str55$new_name, $str57$, $int$40, UNPROVIDED, UNPROVIDED);
                                    html_reset_input($$$Clear);
                                    html_indent(UNPROVIDED);
                                    html_submit_input($$$Create_Similar, $$$create, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_submit_input($$$Copy_Assertions, $$$copy, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                    cb_doc_link($$$creating, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($$$Check_the_assertions_from_);
                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                    html_princ($str93$_which_you_wish_to_copy_as_well__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    final SubLObject _prev_bind_0_$12 = $cb_assertion_link_hook$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = $cb_c_default_content$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $cb_c_suppress_body_level_elements$.currentBinding(thread);
                                    try {
                                        $cb_assertion_link_hook$.bind(CB_CREATE_SIMILAR_CHECKBOX, thread);
                                        $cb_c_gaf_arg_use_binary$.bind(NIL, thread);
                                        $cb_c_default_content$.bind($MAXIMAL, thread);
                                        $cb_c_suppress_body_level_elements$.bind(T, thread);
                                        cb_frames.cb_default_content_internal(fort);
                                    } finally {
                                        $cb_c_suppress_body_level_elements$.rebind(_prev_bind_4, thread);
                                        $cb_c_default_content$.rebind(_prev_bind_2_$14, thread);
                                        $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_$13, thread);
                                        $cb_assertion_link_hook$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
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
            } else {
                cdestructuring_bind_error(args, $list82);
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_create_similar_legacy(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$create_similar_facilities);
            return NIL;
        }
        final SubLObject source_fort = cb_guess_fort(args.first(), UNPROVIDED);
        final SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str55$new_name, args));
        SubLObject target_term = NIL;
        final SubLObject copy = html_extract_input($$$copy, args);
        if (NIL == forts.fort_p(source_fort)) {
            return cb_error($str98$Unable_to_determine_a_term_from__, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((!new_name.isString()) || new_name.equal($str57$)) {
            return cb_error($$$No_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (((NIL == copy) && (NIL == constant_completion_high.valid_constant_name_p(new_name))) && (NIL == cb_guess_naut(new_name, UNPROVIDED))) {
            return cb_error($str100$_S_is_not_a_valid_term_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != cb_guess_naut(new_name, UNPROVIDED)) {
            target_term = cb_guess_naut(new_name, UNPROVIDED);
        } else
            if (NIL != copy) {
                final SubLObject existing_fort = cb_guess_fort(new_name, UNPROVIDED);
                if (NIL == forts.fort_p(existing_fort)) {
                    return cb_error($str98$Unable_to_determine_a_term_from__, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                target_term = existing_fort;
            } else {
                final SubLObject exact_constant = constants_high.find_constant(new_name);
                if (NIL != exact_constant) {
                    return cb_error($str101$Already_a_constant_named__S, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                final SubLObject inexact_constants = constant_completion_high.constant_complete(new_name, NIL, T, UNPROVIDED, UNPROVIDED);
                if (NIL != inexact_constants) {
                    return cb_error($str102$Constant__S_already_exists_which_, inexact_constants.first(), new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                target_term = cb_create_hook(new_name);
            }

        if (NIL == cycl_utilities.fort_or_naut_p(target_term)) {
            return cb_error($str103$Unable_to_create_a_similar_term_n, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_tools.cb_add_to_history(target_term);
        final SubLObject source_fort_el_formula = forts.fort_el_formula(source_fort);
        final SubLObject target_term_el_formula = (NIL != el_formula_p(target_term)) ? target_term : forts.fort_el_formula(target_term);
        SubLObject cdolist_list_var = nthcdr(THREE_INTEGER, args);
        SubLObject copy_spec = NIL;
        copy_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = read_from_string_ignoring_errors(copy_spec.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (id.isInteger()) {
                final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject strength = assertions_high.assertion_strength(assertion);
                    final SubLObject direction = assertions_high.assertion_direction(assertion);
                    if ((NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(source_fort_el_formula, mt, symbol_function(HLMT_EQUAL), UNPROVIDED))) {
                        similar_formula = subst(target_term_el_formula, source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED);
                        mt = subst(target_term_el_formula, source_fort_el_formula, mt, symbol_function(EQUAL), UNPROVIDED);
                        ke.ke_assert(similar_formula, mt, strength, direction);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            copy_spec = cdolist_list_var.first();
        } 
        if (NIL != copy) {
            return cb_assertion_editor.cb_note_edit_change($$$Copy_Assertions, T, UNPROVIDED, UNPROVIDED);
        }
        return cb_assertion_editor.cb_note_edit_change($$$Create_Similar, T, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_handle_create_similar_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$create_similar_facilities);
            return NIL;
        }
        {
            SubLObject source_fort = cb_guess_fort(args.first(), UNPROVIDED);
            SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str_alt34$new_name, args));
            SubLObject target_fort = NIL;
            SubLObject copy = html_extract_input($$$copy, args);
            if (NIL == forts.fort_p(source_fort)) {
                return cb_error($str_alt75$Unable_to_determine_a_term_from__, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if ((!new_name.isString()) || new_name.equal($str_alt36$)) {
                    return cb_error($$$No_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if ((NIL == copy) && (NIL == constant_completion_high.valid_constant_name_p(new_name))) {
                        return cb_error($str_alt43$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            if (NIL != copy) {
                {
                    SubLObject existing_fort = cb_guess_fort(new_name, UNPROVIDED);
                    if (NIL != forts.fort_p(existing_fort)) {
                        target_fort = existing_fort;
                    } else {
                        return cb_error($str_alt75$Unable_to_determine_a_term_from__, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                {
                    SubLObject exact_constant = constants_high.find_constant(new_name);
                    if (NIL != exact_constant) {
                        return cb_error($str_alt77$Already_a_constant_named__S, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        {
                            SubLObject inexact_constants = constant_completion_high.constant_complete(new_name, NIL, T, UNPROVIDED, UNPROVIDED);
                            if (NIL != inexact_constants) {
                                return cb_error($str_alt78$Constant__S_already_exists_which_, inexact_constants.first(), new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                target_fort = com.cyc.cycjava.cycl.cb_editor.cb_create_hook(new_name);
                            }
                        }
                    }
                }
            }
            if (NIL == forts.fort_p(target_fort)) {
                return cb_error($str_alt79$Unable_to_create_a_similar_consta, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != constant_p(target_fort)) {
                cb_tools.cb_add_to_constant_history(target_fort);
            } else {
                if (NIL != nart_handles.nart_p(target_fort)) {
                    cb_tools.cb_add_to_nat_history(target_fort);
                }
            }
            {
                SubLObject source_fort_el_formula = forts.fort_el_formula(source_fort);
                SubLObject target_fort_el_formula = forts.fort_el_formula(target_fort);
                SubLObject cdolist_list_var = nthcdr(THREE_INTEGER, args);
                SubLObject copy_spec = NIL;
                for (copy_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , copy_spec = cdolist_list_var.first()) {
                    {
                        SubLObject id = read_from_string_ignoring_errors(copy_spec.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        if (id.isInteger()) {
                            {
                                SubLObject assertion = find_assertion_by_id(id);
                                if (NIL != assertion_p(assertion)) {
                                    {
                                        SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                                        SubLObject mt = assertion_mt(assertion);
                                        SubLObject strength = assertion_strength(assertion);
                                        SubLObject direction = assertion_direction(assertion);
                                        if ((NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(source_fort_el_formula, mt, symbol_function(HLMT_EQUAL), UNPROVIDED))) {
                                            similar_formula = subst(target_fort_el_formula, source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED);
                                            mt = subst(target_fort_el_formula, source_fort_el_formula, mt, symbol_function(EQUAL), UNPROVIDED);
                                            ke.ke_assert(similar_formula, mt, strength, direction);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != copy) {
                return cb_assertion_editor.cb_note_edit_change($$$Copy_Assertions, T, UNPROVIDED, UNPROVIDED);
            } else {
                return cb_assertion_editor.cb_note_edit_change($$$Create_Similar, T, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject cb_handle_create_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            if (NIL != ke.cyclist_is_guest()) {
                try {
                    final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str107$_S, cyc_navigator_internals.guest_warn_string($$$create_similar_facilities));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$error);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                return NIL;
            }
            final SubLObject new_term_name = html_extract_input($$$focalterm, args);
            SubLObject new_term = cycl_utilities.find_denotational_term(new_term_name);
            SubLObject problem_sentence_info = NIL;
            SubLObject good_sentences = NIL;
            if (NIL == new_term) {
                if (((NIL != new_term_name) && (NIL == create_similar_valid_nat_nameP(new_term_name))) && (NIL == constant_completion_high.valid_constant_name_p(new_term_name))) {
                    try {
                        final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$response, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$invalidTerm, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str111$_S_is_not_a_valid_term_name_, new_term_name);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    xml_utilities.xml_end_tag_internal($$$invalidTerm);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($$$error);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$response);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                    return NIL;
                }
                if ((NIL != new_term_name) && (NIL != constant_completion_high.constant_complete(new_term_name, NIL, T, UNPROVIDED, UNPROVIDED))) {
                    try {
                        final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$response, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$invalidTerm, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str112$Constant__A_already_exists__which, constant_completion_high.constant_complete(new_term_name, NIL, T, UNPROVIDED, UNPROVIDED).first(), new_term_name);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values5 = getValuesAsVector();
                                                    xml_utilities.xml_end_tag_internal($$$invalidTerm);
                                                    restoreValuesFromVector(_values5);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$23, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values6 = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($$$error);
                                        restoreValuesFromVector(_values6);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values7 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$response);
                            restoreValuesFromVector(_values7);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                    return NIL;
                }
                if (NIL != constant_completion_high.valid_constant_name_p(new_term_name)) {
                    new_term = cb_create_hook(new_term_name);
                } else
                    if (NIL != new_term_name) {
                        new_term = read_from_string_ignoring_errors(string_utilities.cyclify_string(new_term_name), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            }
            if ((NIL != new_term_name) && (NIL == cycl_utilities.fort_or_naut_p(new_term))) {
                try {
                    final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$response, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str113$Unable_to_create_a_term_named__S_, new_term_name);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values8 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$error);
                                    restoreValuesFromVector(_values8);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                            return NIL;
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values9 = getValuesAsVector();
                        xml_utilities.xml_end_tag_internal($$$response);
                        restoreValuesFromVector(_values9);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.proper_list_p(arg)) {
                    final SubLObject param = arg.first();
                    if (NIL != string_utilities.starts_with(param, $$$sentence)) {
                        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, list($INPUT_NAME, param));
                        final SubLObject sentence_num = subseq(param, EIGHT_INTEGER, UNPROVIDED);
                        if (cycl_utilities.formula_arg0(sentence).equal($$unknownSentence)) {
                            good_sentences = cons(sentence, good_sentences);
                        } else
                            if (NIL != wff.el_lenient_wff_assertibleP(sentence, UNPROVIDED, UNPROVIDED)) {
                                good_sentences = cons(sentence, good_sentences);
                            } else {
                                problem_sentence_info = cons(list($SENTENCE_NUM, sentence_num, $SENTENCE, html_extract_input(param, args)), problem_sentence_info);
                            }

                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            if (NIL == problem_sentence_info) {
                cdolist_list_var = nreverse(good_sentences);
                SubLObject sentence2 = NIL;
                sentence2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (cycl_utilities.formula_arg0(sentence2).eql($$unknownSentence)) {
                        ke.ke_unassert(cycl_utilities.formula_arg1(sentence2, UNPROVIDED), $$BaseKB);
                    } else {
                        ke.ke_assert(sentence2, $$BaseKB, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence2 = cdolist_list_var.first();
                } 
            }
            try {
                final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$response, list($$$newTermId, kb_utilities.compact_hl_external_id_string(new_term)), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        if (NIL != problem_sentence_info) {
                            try {
                                final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = problem_sentence_info;
                                        SubLObject sentence_info = NIL;
                                        sentence_info = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            final SubLObject sentence3 = getf(sentence_info, $SENTENCE, UNPROVIDED);
                                            final SubLObject attrs = list($$$id, getf(sentence_info, $SENTENCE_NUM, UNPROVIDED));
                                            try {
                                                final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$invalidSentence, attrs, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(format_nil.format_nil_s(sentence3));
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values10 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$invalidSentence);
                                                    restoreValuesFromVector(_values10);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sentence_info = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values11 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$error);
                                    restoreValuesFromVector(_values11);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                }
                            }
                        } else {
                            final SubLObject attrs2 = list($$$count, string_utilities.to_string(length(good_sentences)));
                            try {
                                final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$assertionsQueued, attrs2, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str125$_A_assertions_added_to_the_local_, length(good_sentences));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values12 = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$assertionsQueued);
                                    restoreValuesFromVector(_values12);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values13 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$response);
                    restoreValuesFromVector(_values13);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_link_create_similar_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt82$_Create_Similar_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt83$cb_create_similar__A, cb_fort_identifier(fort));
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
            return fort;
        }
    }

    public static SubLObject cb_link_create_similar(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str128$_Create_Similar_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str129$cb_create_similar__A, cb_fort_identifier(fort));
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
        return fort;
    }

    public static SubLObject cb_create_similar_guest_warn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str131$color_red__font_size_120___font_w);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (operation_communication.the_cyclist().equal($$Guest)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str133$Sorry__);
                cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
                html_princ($str134$_cannot_make_assertions_using_the);
                cyc_navigator_internals.nav_link($CB_LOGIN, NIL, NIL, $$$login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_princ($str137$_using_your_real_name_now_so_that);
                html_br();
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_similar_button_row(SubLObject id_suffix) {
        if (id_suffix == UNPROVIDED) {
            id_suffix = $str57$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_id = cconcatenate($$$lookupbutton, id_suffix);
        final SubLObject assert_id = cconcatenate($$$assertbutton, id_suffix);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$button);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str140$font_size_10pt);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$All_Mts);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str142$togglecheckall___);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str143$Check_All___Uncheck_All);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$button);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str140$font_size_10pt);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$Undo);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str145$uncommit__);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$button);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str140$font_size_10pt);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$Redo);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str147$recommit__);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$button);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str140$font_size_10pt);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != lookup_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(lookup_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$Switch_to_Browse_Mode);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str149$togglelookupmode__);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$button);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str140$font_size_10pt);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != assert_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(assert_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$SEND);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str151$dosubmit__);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$Assert_selected_sentences);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject xml_fort_info(final SubLObject fort_spec, SubLObject content_spec) {
        if (content_spec == UNPROVIDED) {
            content_spec = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
        final SubLObject derived_to_always_include = (NIL != nart_handles.nart_p(fort)) ? narts_high.nart_dependent_assertions(fort) : NIL;
        final SubLObject preds = fort_info_preds(fort, content_spec);
        final SubLObject max_arities = Mapping.mapcar(MAX_ARITY, preds);
        final SubLObject max_arity = list_utilities.extremal(remove(NIL, max_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym155$_, UNPROVIDED);
        final SubLObject copy_term = (NIL != constant_p(fort)) ? fort : constants_high.gentemp_constant(Strings.string_upcase(string_utilities.string_subst($str57$, $str156$_, string_utilities.string_subst($str57$, $str157$_, string_utilities.string_subst($str158$_, $$$_, cycl_utilities.denotational_term_name(fort), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject focal_term_name = constants_high.constant_name(copy_term);
        final SubLObject assertion_attrs = list($$$focalTerm, focal_term_name, $$$hlid, kb_utilities.compact_hl_external_id_string(fort), $$$contentspec, content_spec);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            try {
                final SubLObject _prev_bind_0_$62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$assertions, assertion_attrs, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$63 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        SubLObject end_var;
                        SubLObject pred_index;
                        SubLObject cdolist_list_var;
                        SubLObject pred;
                        SubLObject pred_index_count;
                        SubLObject pred_var;
                        SubLObject iterator_var;
                        SubLObject done_var;
                        SubLObject token_var;
                        SubLObject final_index_spec;
                        SubLObject valid;
                        SubLObject final_index_iterator;
                        SubLObject done_var_$65;
                        SubLObject token_var_$66;
                        SubLObject v_assert;
                        SubLObject valid_$67;
                        SubLObject _prev_bind_0_$64;
                        SubLObject _prev_bind_1_$64;
                        SubLObject _prev_bind_0_$65;
                        SubLObject _prev_bind_0_$66;
                        SubLObject _values;
                        SubLObject _prev_bind_0_$67;
                        SubLObject _values2;
                        for (end_var = max_arity, pred_index = NIL, pred_index = ONE_INTEGER; !pred_index.numGE(end_var); pred_index = number_utilities.f_1X(pred_index)) {
                            cdolist_list_var = preds;
                            pred = NIL;
                            pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                pred_index_count = ZERO_INTEGER;
                                pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, pred_index, pred_var)) {
                                    iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, pred_index, pred_var);
                                    done_var = NIL;
                                    token_var = NIL;
                                    while (NIL == done_var) {
                                        final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                done_var_$65 = NIL;
                                                token_var_$66 = NIL;
                                                while (NIL == done_var_$65) {
                                                    v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                                    valid_$67 = makeBoolean(!token_var_$66.eql(v_assert));
                                                    if (((NIL != valid_$67) && (!pred_index_count.numG(TWENTY_INTEGER))) && (((content_spec == $ALL_INFERRED) || (NIL != assertions_high.asserted_assertionP(v_assert))) || (NIL != subl_promotions.memberP(v_assert, derived_to_always_include, UNPROVIDED, UNPROVIDED)))) {
                                                        pred_index_count = add(pred_index_count, ONE_INTEGER);
                                                        try {
                                                            _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            _prev_bind_1_$64 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$assertion, NIL, NIL, NIL, $UNINITIALIZED);
                                                                _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_mt(assertions_high.assertion_mt(v_assert));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$64, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                                            }
                                                        } finally {
                                                            _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                _values = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$assertion);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                                            }
                                                        }
                                                        cycml.cycml_serialize_sentence(subst(copy_term, fort, assertions_high.assertion_formula(v_assert), UNPROVIDED, UNPROVIDED));
                                                    }
                                                    done_var_$65 = makeBoolean(NIL == valid_$67);
                                                } 
                                            } finally {
                                                _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    _values2 = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            } 
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$63, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$63, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$62, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$assertions);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == constant_p(fort)) {
            free_constant(copy_term);
        }
        return NIL;
    }

    public static SubLObject fort_info_preds(final SubLObject fort, SubLObject content_spec) {
        if (content_spec == UNPROVIDED) {
            content_spec = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = nreverse(list_utilities.remove_duplicates_from_end(nconc(isa.all_instances_in_all_mts($$DocumentationPredicate), copy_list(cb_definitional_preds_for_fort(fort))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (kb_indexing.num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED).numL($int$100)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$74 = NIL;
                                final SubLObject token_var_$75 = NIL;
                                while (NIL == done_var_$74) {
                                    final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$75);
                                    final SubLObject valid_$76 = makeBoolean(!token_var_$75.eql(v_assert));
                                    if (NIL != valid_$76) {
                                        final SubLObject item_var = cycl_utilities.formula_arg0(v_assert);
                                        if (NIL == member(item_var, preds, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            preds = cons(item_var, preds);
                                        }
                                    }
                                    done_var_$74 = makeBoolean(NIL == valid_$76);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(preds);
    }

    public static SubLObject create_similar_valid_nat_nameP(final SubLObject str) {
        final SubLObject cyclified = string_utilities.cyclify_string(str);
        final SubLObject listy = read_from_string_ignoring_errors(cyclified, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return makeBoolean((NIL == cycl_utilities.expression_find_if(SYMBOLP, listy, UNPROVIDED, UNPROVIDED)) && (NIL != term.function_termP(listy)));
    }

    public static final SubLObject cb_create_similar_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Create_Similar_Term_page);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject fort_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    fort_spec = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                            if (NIL == forts.fort_p(fort)) {
                                cb_error($str_alt60$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                return NIL;
                            }
                            fort_spec = cb_fort_identifier(fort);
                            {
                                SubLObject title_var = $$$Create_Similar_Constant;
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
                                                    html_markup($str_alt30$yui_skin_sam);
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
                                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$within_html_form$.bind(T, thread);
                                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                    html_hidden_input($str_alt62$cb_handle_create_similar, fort_spec, UNPROVIDED);
                                                                    cb_help_preamble($CB_CREATE_SIMILAR, UNPROVIDED, UNPROVIDED);
                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_princ($str_alt63$Enter_name_for_new_term_similar_t);
                                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt64$__);
                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_newline(TWO_INTEGER);
                                                                    html_complete.html_complete_button($str_alt34$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_indent(UNPROVIDED);
                                                                    html_text_input($str_alt34$new_name, $str_alt36$, $int$40);
                                                                    html_newline(TWO_INTEGER);
                                                                    html_reset_input($$$Clear);
                                                                    html_indent(UNPROVIDED);
                                                                    html_submit_input($$$Create_Similar, $$$create, UNPROVIDED);
                                                                    html_indent(UNPROVIDED);
                                                                    html_submit_input($$$Copy_Assertions, $$$copy, UNPROVIDED);
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_doc_link($$$creating, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_princ($str_alt69$Check_the_assertions_from_);
                                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt70$_which_you_wish_to_copy_as_well__);
                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_newline(TWO_INTEGER);
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = $cb_assertion_link_hook$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_9 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_10 = $cb_c_default_content$.currentBinding(thread);
                                                                        try {
                                                                            $cb_assertion_link_hook$.bind(CB_CREATE_SIMILAR_CHECKBOX, thread);
                                                                            $cb_c_gaf_arg_use_binary$.bind(NIL, thread);
                                                                            $cb_c_default_content$.bind($MAXIMAL, thread);
                                                                            cb_default_content_internal(fort);
                                                                        } finally {
                                                                            $cb_c_default_content$.rebind(_prev_bind_2_10, thread);
                                                                            $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_9, thread);
                                                                            $cb_assertion_link_hook$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                        }
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
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_create_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_spec = args.first();
        final SubLObject content_spec = html_extract_sexpr($$$contentspec, args, $DEFAULT);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject title_var = $str57$;
            final SubLObject _prev_bind_0_$78 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$79 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str46$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
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
                            cb_create_similar_guest_warn();
                            xml_fort_info(fort_spec, content_spec);
                            cyc_file_dependencies.javascript($CB_CREATE_SIMILAR_JS);
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$79, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$78, thread);
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_create_similar_legacy(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str128$_Create_Similar_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str174$cb_create_similar_legacy__A, cb_fort_identifier(fort));
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
        return fort;
    }

    public static final SubLObject cb_link_create_instance_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt85$_Create_Instance_;
            }
            {
                SubLObject id = get_next_html_element_id();
                SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$javascript_startCreate___A_____A_, compact_hl_external_id_string(fort), id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != id) {
                    html_markup(html_macros.$html_anchor_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
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
            return fort;
        }
    }

    public static SubLObject cb_link_create_instance(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str176$_Create_Instance_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str177$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
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
        return fort;
    }

    public static final SubLObject cb_link_create_spec_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt88$_Create_Spec_;
            }
            {
                SubLObject id = get_next_html_element_id();
                SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt89$javascript_startCreate___A_____A_, compact_hl_external_id_string(fort), id);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != id) {
                    html_markup(html_macros.$html_anchor_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
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
            return fort;
        }
    }

    public static SubLObject cb_link_create_spec(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str179$_Create_Spec_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str180$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
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
        return fort;
    }

    public static SubLObject cb_link_create_spec_mt(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str182$_Create_Spec_Mt_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str183$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
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
        return fort;
    }

    public static SubLObject cb_link_create_spec_pred(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str185$_Create_Spec_Pred_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str186$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
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
        return fort;
    }

    public static final SubLObject cb_create_similar_checkbox_alt(SubLObject assertion) {
        if (NIL != assertion_p(assertion)) {
            {
                SubLObject id = assertion_id(assertion);
                html_checkbox_input(id, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_create_similar_checkbox(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            html_checkbox_input(id, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_rename_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Rename_Constant_page);
            } else {
                {
                    SubLObject constant = cb_guess_constant(args);
                    if (NIL == constant_p(constant)) {
                        cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Rename_Constant;
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
                                    SubLObject _prev_bind_0_11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                            html_markup($str_alt30$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_hidden_input($str_alt96$cb_handle_rename, T, UNPROVIDED);
                                                            html_hidden_input($$$id, cb_fort_identifier(constant), UNPROVIDED);
                                                            cb_help_preamble($CB_RENAME, UNPROVIDED, UNPROVIDED);
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt98$Enter_new_name_for_);
                                                            html_princ(constant);
                                                            html_princ($str_alt64$__);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(TWO_INTEGER);
                                                            html_complete.html_complete_button($str_alt34$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_text_input($str_alt34$new_name, constants_high.constant_name(constant), $int$40);
                                                            html_newline(TWO_INTEGER);
                                                            html_reset_input($$$Current_Name);
                                                            html_indent(UNPROVIDED);
                                                            html_script_utilities.html_clear_input_button($str_alt34$new_name, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_submit_input($$$Rename, UNPROVIDED, UNPROVIDED);
                                                            html_newline(TWO_INTEGER);
                                                            cb_doc_link($$$naming, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                                            html_newline(UNPROVIDED);
                                                            cb_doc_link($$$renaming, $str_alt103$Cyc_Rename_Kill, cyc_system_doc_rename_kill(), UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                }
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rename(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Rename_Constant_page);
        } else {
            final SubLObject constant = cb_guess_constant(args);
            if (NIL == constant_p(constant)) {
                cb_error($str191$_a_does_not_specify_a_Cyc_constan, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Rename_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str46$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
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
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str193$cb_handle_rename, T, UNPROVIDED);
                                html_hidden_input($$$id, cb_fort_identifier(constant), UNPROVIDED);
                                cb_help_preamble($CB_RENAME, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$Enter_new_name_for_);
                                html_princ(constant);
                                html_princ($str87$__);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_complete.html_complete_button($str55$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_text_input($str55$new_name, constants_high.constant_name(constant), $int$40);
                                html_newline(TWO_INTEGER);
                                html_reset_input($$$Current_Name);
                                html_indent(UNPROVIDED);
                                html_script_utilities.html_clear_input_button($str55$new_name, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Rename, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                cb_doc_link($$$naming, $$$Cyc_Naming_Conventions, cyc_system_doc_naming_conventions(), UNPROVIDED);
                                html_newline(UNPROVIDED);
                                cb_doc_link($$$renaming, $str199$Cyc_Rename_Kill, cyc_system_doc_rename_kill(), UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$83, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_rename_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$renaming);
            return NIL;
        }
        {
            SubLObject id = html_extract_input($$$id, args);
            SubLObject new_name = html_extract_input($str_alt34$new_name, args);
            SubLObject constant = cb_guess_constant(id);
            if (NIL == constant_p(constant)) {
                cb_error($str_alt105$Could_not_determine_a_term_from__, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (!new_name.isString()) {
                    cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                        cb_error($str_alt43$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (new_name.equal(constants_high.constant_name(constant))) {
                            cb_error($str_alt106$Name_specified_is_same_as_current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (NIL != constants_high.find_constant(new_name)) {
                                cb_error($str_alt44$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                ke.ke_rename(constant, new_name);
                                cb_assertion_editor.cb_note_edit_change($$$Constant_Rename, T, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_rename(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$renaming);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject new_name = html_extract_input($str55$new_name, args);
        final SubLObject constant = cb_guess_constant(id);
        if (NIL == constant_p(constant)) {
            cb_error($str201$Could_not_determine_a_term_from__, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (!new_name.isString()) {
                cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                    cb_error($str65$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (new_name.equal(constants_high.constant_name(constant))) {
                        cb_error($str202$Name_specified_is_same_as_current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL != constants_high.find_constant(new_name)) {
                            cb_error($str66$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            ke.ke_rename(constant, new_name);
                            cb_assertion_editor.cb_note_edit_change($$$Constant_Rename, T, UNPROVIDED, UNPROVIDED);
                        }




        return NIL;
    }

    public static final SubLObject cb_link_rename_alt(SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt109$_Rename_;
            }
            if (NIL != disabledP) {
                cb_assertion_editor.cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt110$cb_rename__A, cb_fort_identifier(constant));
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
            }
            return constant;
        }
    }

    public static SubLObject cb_link_rename(final SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str205$_Rename_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str206$cb_rename__A, cb_fort_identifier(constant));
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
        }
        return constant;
    }

    public static final SubLObject cb_merge_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Merge_Term_page);
            } else {
                {
                    SubLObject fort = cb_guess_fort(args, UNPROVIDED);
                    if (NIL == forts.fort_p(fort)) {
                        cb_error($str_alt60$_a_does_not_specify_a_Cyc_term, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Merge_Term;
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
                                    SubLObject _prev_bind_0_14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                            html_markup($str_alt30$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_hidden_input($str_alt116$cb_handle_merge, T, UNPROVIDED);
                                                            html_hidden_input($str_alt117$fort_spec, cb_fort_identifier(fort), UNPROVIDED);
                                                            cb_help_preamble($CB_MERGE, UNPROVIDED, UNPROVIDED);
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt118$Merge_the_term_);
                                                            cb_form(fort, ZERO_INTEGER, NIL);
                                                            html_princ($str_alt119$_onto_the_existing_constant_named);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(TWO_INTEGER);
                                                            html_complete.html_complete_button($str_alt120$target_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_text_input($str_alt120$target_name, $str_alt36$, $int$40);
                                                            html_newline(TWO_INTEGER);
                                                            html_script_utilities.html_clear_input_button($str_alt120$target_name, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_submit_input($$$Merge, UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                }
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_merge(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Merge_Term_page);
        } else {
            final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                cb_error($str83$_a_does_not_specify_a_Cyc_term, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Merge_Term;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str46$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
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
                            final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str212$cb_handle_merge, T, UNPROVIDED);
                                html_hidden_input($str213$fort_spec, cb_fort_identifier(fort), UNPROVIDED);
                                cb_help_preamble($CB_MERGE, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$Merge_the_term_);
                                cb_form(fort, ZERO_INTEGER, NIL);
                                html_princ($str215$_onto_the_existing_constant_named);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_autocomplete_text_input($str216$target_name, $str57$, $int$40, UNPROVIDED, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_script_utilities.html_clear_input_button($str216$target_name, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Merge, UNPROVIDED, UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$88, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_merge_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$merging);
            return NIL;
        }
        {
            SubLObject fort_spec = html_extract_input($str_alt117$fort_spec, args);
            SubLObject source_fort = cb_guess_fort(fort_spec, UNPROVIDED);
            SubLObject target_name = html_extract_input($str_alt120$target_name, args);
            if (NIL == forts.fort_p(source_fort)) {
                cb_error($str_alt105$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (!target_name.isString()) {
                    cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject target_term = cb_guess_fort(target_name, UNPROVIDED);
                if (NIL == forts.fort_p(target_term)) {
                    cb_error($str_alt105$Could_not_determine_a_term_from__, target_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (source_fort == target_term) {
                        cb_error($str_alt124$Attempt_to_merge__S_with_itself_, source_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        cb_tools.cb_rem_fort_from_all_histories(source_fort);
                        ke.ke_merge(source_fort, target_term);
                        cb_assertion_editor.cb_note_edit_change($$$Merge_Term, T, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_merge(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$merging);
            return NIL;
        }
        final SubLObject fort_spec = html_extract_input($str213$fort_spec, args);
        final SubLObject source_fort = cb_guess_fort(fort_spec, UNPROVIDED);
        final SubLObject target_name = html_extract_input($str216$target_name, args);
        if (NIL == forts.fort_p(source_fort)) {
            cb_error($str201$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (!target_name.isString()) {
                cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        final SubLObject target_term = cb_guess_fort(target_name, UNPROVIDED);
        if (NIL == forts.fort_p(target_term)) {
            cb_error($str201$Could_not_determine_a_term_from__, target_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (source_fort.eql(target_term)) {
                cb_error($str220$Attempt_to_merge__S_with_itself_, source_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_tools.cb_rem_fort_from_all_histories(source_fort);
                ke.ke_merge(source_fort, target_term);
                cb_assertion_editor.cb_note_edit_change($$$Merge_Term, T, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static final SubLObject cb_link_merge_alt(SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt126$_Merge_;
            }
            if (NIL != disabledP) {
                cb_assertion_editor.cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt127$cb_merge__A, cb_fort_identifier(fort));
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
            }
            return fort;
        }
    }

    public static SubLObject cb_link_merge(final SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str222$_Merge_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str223$cb_merge__A, cb_fort_identifier(fort));
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
        }
        return fort;
    }

    public static final SubLObject cb_kill_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_term_kill_facility);
        } else {
            {
                SubLObject fort_spec = args.first();
                SubLObject confirmed = html_extract_input($$$confirmed, args);
                SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    cb_error($str_alt60$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_tools.cb_rem_fort_from_all_histories(fort);
                ke.ke_kill(fort);
                cb_assertion_editor.cb_note_edit_change($$$Term_Kill, T, NIL != confirmed ? ((SubLObject) (THREE_INTEGER)) : TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_kill(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_term_kill_facility);
        } else {
            final SubLObject fort_spec = args.first();
            final SubLObject confirmed = html_extract_input($$$confirmed, args);
            final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                cb_error($str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            cb_tools.cb_rem_fort_from_all_histories(fort);
            ke.ke_kill(fort);
            cb_assertion_editor.cb_note_edit_change($$$Term_Kill, T, NIL != confirmed ? THREE_INTEGER : TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_link_kill_alt(SubLObject fort, SubLObject linktext, SubLObject disabledP, SubLObject not_confirmedP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        if (not_confirmedP == UNPROVIDED) {
            not_confirmedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt133$_Kill_;
            }
            if (NIL != disabledP) {
                cb_assertion_editor.cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    if (NIL != not_confirmedP) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt134$cb_kill__A, cb_fort_identifier(fort));
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt135$cb_kill__A_confirmed_T, cb_fort_identifier(fort));
                    }
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
            }
            return fort;
        }
    }

    public static SubLObject cb_link_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP, SubLObject not_confirmedP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        if (not_confirmedP == UNPROVIDED) {
            not_confirmedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str229$_Kill_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            if (NIL != not_confirmedP) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str230$cb_kill__A, cb_fort_identifier(fort));
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str231$cb_kill__A_confirmed_T, cb_fort_identifier(fort));
            }
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
        }
        return fort;
    }

    public static final SubLObject cb_confirm_kill_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Cyc_term_kill_facility);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject fort_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    fort_spec = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                            if (NIL == forts.fort_p(fort)) {
                                cb_error($str_alt60$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                return NIL;
                            }
                            {
                                SubLObject assertion_count = num_index(fort);
                                SubLObject title_var = $$$Confirm_Term_Kill;
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
                                            SubLObject _prev_bind_0_17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                    html_markup($str_alt30$yui_skin_sam);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$within_html_form$.bind(T, thread);
                                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                    html_hidden_input($str_alt140$cb_kill, fort_spec, UNPROVIDED);
                                                                    html_hidden_input($$$confirmed, $$$T, UNPROVIDED);
                                                                    cb_help_preamble($CB_CONFIRM_KILL, UNPROVIDED, UNPROVIDED);
                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                    if (NIL == nart_handles.nart_p(fort)) {
                                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                                        html_indent(THREE_INTEGER);
                                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        html_princ($str_alt142$NOTE__);
                                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                        html_newline(UNPROVIDED);
                                                                        html_princ($str_alt143$If_you_are_killing_this_term_to_r);
                                                                        cb_link($RECREATE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        html_princ($str_alt145$_page_instead_);
                                                                        html_newline(UNPROVIDED);
                                                                    }
                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt146$Please_confirm_kill_of_);
                                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                    if (assertion_count.numG(ZERO_INTEGER)) {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt147$_and_the_removal_of_all__S_assert, assertion_count);
                                                                    }
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_back_button($SELF, $$$No);
                                                                    html_submit_input($str_alt150$Yes__Kill, UNPROVIDED, UNPROVIDED);
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_doc_link($$$killing_constants, $str_alt103$Cyc_Rename_Kill, cyc_system_doc_rename_kill(), UNPROVIDED);
                                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                        }
                                                        html_source_readability_terpri(UNPROVIDED);
                                                        html_copyright_notice();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_confirm_kill(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_term_kill_facility);
        } else {
            SubLObject fort_spec = NIL;
            destructuring_bind_must_consp(args, args, $list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    cb_error($str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                final SubLObject assertion_count = kb_indexing.num_index(fort);
                final SubLObject title_var = $$$Confirm_Term_Kill;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$94 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str46$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
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
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str236$cb_kill, fort_spec, UNPROVIDED);
                                    html_hidden_input($$$confirmed, $$$T, UNPROVIDED);
                                    cb_help_preamble($CB_CONFIRM_KILL, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    if (NIL == nart_handles.nart_p(fort)) {
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        html_indent(THREE_INTEGER);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str238$NOTE__);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        html_princ($str239$If_you_are_killing_this_term_to_r);
                                        cb_link($RECREATE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_princ($str241$_page_instead_);
                                        html_newline(UNPROVIDED);
                                    }
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_princ($$$Please_confirm_kill_of_);
                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                    if (assertion_count.numG(ZERO_INTEGER)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str243$_and_the_removal_of_all__S_assert, assertion_count);
                                    }
                                    html_newline(TWO_INTEGER);
                                    cb_back_button($SELF, $$$No);
                                    html_submit_input($str246$Yes__Kill, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                    cb_doc_link($$$killing_constants, $str199$Cyc_Rename_Kill, cyc_system_doc_rename_kill(), UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$94, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list82);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_confirm_kill_alt(SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt133$_Kill_;
            }
            if (NIL != disabledP) {
                cb_assertion_editor.cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt153$cb_confirm_kill__A, cb_fort_identifier(fort));
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
            }
            return fort;
        }
    }

    public static SubLObject cb_link_confirm_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str229$_Kill_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str249$cb_confirm_kill__A, cb_fort_identifier(fort));
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
        }
        return fort;
    }

    /**
     * Brings up a page where the user can recreate a constant.  Once confirmed by the user, a quick little page is then thrown up informing the user that the constant has been recreated.
     */
    @LispMethod(comment = "Brings up a page where the user can recreate a constant.  Once confirmed by the user, a quick little page is then thrown up informing the user that the constant has been recreated.")
    public static final SubLObject cb_recreate_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($str_alt157$the_Cyc_constant_recreate_facilit);
                return NIL;
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject constant_spec = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt158);
                constant_spec = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject constant = cb_guess_constant(constant_spec);
                        if (NIL == constant_p(constant)) {
                            cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, constant_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        {
                            SubLObject title_var = $$$Recreate_Constant;
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
                                        SubLObject _prev_bind_0_20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt30$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt160$cb_recreate_handler, constant_spec, UNPROVIDED);
                                                                cb_help_preamble($CB_RECREATE, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                {
                                                                    SubLObject assertion_count = num_index(constant);
                                                                    html_princ($str_alt161$Please_confirm_recreation_of_);
                                                                    cb_form(constant, UNPROVIDED, UNPROVIDED);
                                                                    if (assertion_count.numG(ZERO_INTEGER)) {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt147$_and_the_removal_of_all__S_assert, assertion_count);
                                                                    }
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_back_button($SELF, $$$No);
                                                                    html_submit_input($str_alt162$Yes__Recreate, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt158);
                }
            }
            return NIL;
        }
    }

    /**
     * Brings up a page where the user can recreate a constant.  Once confirmed by the user, a quick little page is then thrown up informing the user that the constant has been recreated.
     */
    @LispMethod(comment = "Brings up a page where the user can recreate a constant.  Once confirmed by the user, a quick little page is then thrown up informing the user that the constant has been recreated.")
    public static SubLObject cb_recreate(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str253$the_Cyc_constant_recreate_facilit);
            return NIL;
        }
        SubLObject constant_spec = NIL;
        destructuring_bind_must_consp(args, args, $list254);
        constant_spec = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject constant = cb_guess_constant(constant_spec);
            if (NIL == constant_p(constant)) {
                cb_error($str191$_a_does_not_specify_a_Cyc_constan, constant_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Recreate_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$98 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$99 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str46$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
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
                            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str256$cb_recreate_handler, constant_spec, UNPROVIDED);
                                cb_help_preamble($CB_RECREATE, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                final SubLObject assertion_count = kb_indexing.num_index(constant);
                                html_princ($$$Please_confirm_recreation_of_);
                                cb_form(constant, UNPROVIDED, UNPROVIDED);
                                if (assertion_count.numG(ZERO_INTEGER)) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str243$_and_the_removal_of_all__S_assert, assertion_count);
                                }
                                html_newline(TWO_INTEGER);
                                cb_back_button($SELF, $$$No);
                                html_submit_input($str258$Yes__Recreate, UNPROVIDED, UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$99, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$98, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(args, $list254);
        }
        return NIL;
    }

    /**
     * Handles when the user has confirmed that they want to recreate a constant.
     */
    @LispMethod(comment = "Handles when the user has confirmed that they want to recreate a constant.")
    public static final SubLObject cb_recreate_handler_alt(SubLObject args) {
        {
            SubLObject id = args.first();
            SubLObject constant = cb_guess_constant(id);
            if (NIL == constant_p(constant)) {
                cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            ke.ke_recreate(constant);
            cb_assertion_editor.cb_note_edit_change($$$Constant_Recreate, T, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Handles when the user has confirmed that they want to recreate a constant.
     */
    @LispMethod(comment = "Handles when the user has confirmed that they want to recreate a constant.")
    public static SubLObject cb_recreate_handler(final SubLObject args) {
        final SubLObject id = args.first();
        final SubLObject constant = cb_guess_constant(id);
        if (NIL == constant_p(constant)) {
            cb_error($str191$_a_does_not_specify_a_Cyc_constan, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        ke.ke_recreate(constant);
        cb_assertion_editor.cb_note_edit_change($$$Constant_Recreate, T, THREE_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_recreate_alt(SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt166$_Recreate_;
            }
            if (NIL != disabledP) {
                cb_assertion_editor.cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($MAIN);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt167$cb_recreate__A, cb_fort_identifier(constant));
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
            }
            return constant;
        }
    }

    public static SubLObject cb_link_recreate(final SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str262$_Recreate_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str263$cb_recreate__A, cb_fort_identifier(constant));
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
        }
        return constant;
    }

    public static final SubLObject cb_all_assertions_tms_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Reperform_TMS_facility);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject fort_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    fort_spec = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                            if (NIL == forts.fort_p(fort)) {
                                cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                return NIL;
                            }
                            {
                                SubLObject assertion_count = num_index(fort);
                                SubLObject title_var = $$$Confirm_Reperform_TMS_Page;
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
                                            SubLObject _prev_bind_0_23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                    html_markup($str_alt30$yui_skin_sam);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$within_html_form$.bind(T, thread);
                                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                    html_hidden_input($str_alt173$cb_all_assertions_tms_handler, fort_spec, UNPROVIDED);
                                                                    html_hidden_input($$$confirmed, $$$T, UNPROVIDED);
                                                                    cb_help_preamble($CB_ALL_ASSERTIONS_TMS_HANDLER, UNPROVIDED, UNPROVIDED);
                                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt174$These_operations_may_take_some_ti);
                                                                    html_princ(assertion_count);
                                                                    html_princ($str_alt175$_of_the_assertions_of_the_constan);
                                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt176$_);
                                                                    html_newline(TWO_INTEGER);
                                                                    cb_back_button($SELF, $$$No);
                                                                    html_indent(TWO_INTEGER);
                                                                    html_submit_input($str_alt177$Do_it_, UNPROVIDED, UNPROVIDED);
                                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                        }
                                                        html_source_readability_terpri(UNPROVIDED);
                                                        html_copyright_notice();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_all_assertions_tms(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Reperform_TMS_facility);
        } else {
            SubLObject fort_spec = NIL;
            destructuring_bind_must_consp(args, args, $list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    cb_error($str191$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                final SubLObject assertion_count = kb_indexing.num_index(fort);
                final SubLObject title_var = $$$Confirm_Reperform_TMS_Page;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$103 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$104 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str46$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
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
                                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str269$cb_all_assertions_tms_handler, fort_spec, UNPROVIDED);
                                    html_hidden_input($$$confirmed, $$$T, UNPROVIDED);
                                    cb_help_preamble($CB_ALL_ASSERTIONS_TMS_HANDLER, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_princ($str270$These_operations_may_take_some_ti);
                                    html_princ(assertion_count);
                                    html_princ($str271$_of_the_assertions_of_the_constan);
                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                    html_princ($str272$_);
                                    html_newline(TWO_INTEGER);
                                    cb_back_button($SELF, $$$No);
                                    html_indent(TWO_INTEGER);
                                    html_submit_input($str273$Do_it_, UNPROVIDED, UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$104, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$103, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list82);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_all_assertions_tms_handler_alt(SubLObject args) {
        {
            SubLObject fort_spec = args.first();
            SubLObject confirmed = html_extract_input($$$confirmed, args);
            SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                cb_error($str_alt94$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            ke.ke_tms_reconsider_term(fort, UNPROVIDED);
            cb_assertion_editor.cb_note_edit_change($str_alt179$Reperform_TMS_on_indexed_Assertio, T, NIL != confirmed ? ((SubLObject) (THREE_INTEGER)) : TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_all_assertions_tms_handler(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject confirmed = html_extract_input($$$confirmed, args);
        final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            cb_error($str191$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        ke.ke_tms_reconsider_term(fort, UNPROVIDED);
        cb_assertion_editor.cb_note_edit_change($str275$Reperform_TMS_on_indexed_Assertio, T, NIL != confirmed ? THREE_INTEGER : TWO_INTEGER, UNPROVIDED);
        return NIL;
    }

    /**
     * Provides a link to the above cb-all-assertions-tms function.
     */
    @LispMethod(comment = "Provides a link to the above cb-all-assertions-tms function.")
    public static final SubLObject cb_link_all_assertions_tms_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt181$_Force_TMS_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt182$cb_all_assertions_tms__A, cb_fort_identifier(fort));
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
            return fort;
        }
    }

    /**
     * Provides a link to the above cb-all-assertions-tms function.
     */
    @LispMethod(comment = "Provides a link to the above cb-all-assertions-tms function.")
    public static SubLObject cb_link_all_assertions_tms(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str277$_Force_TMS_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str278$cb_all_assertions_tms__A, cb_fort_identifier(fort));
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
        return fort;
    }

    public static final SubLObject cb_hypothesize_handler_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Hypothesize;
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
                        html_script_utilities.html_simple_applet_input_definition_script();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_52 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt30$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject script = html_script_utilities.html_simple_applet_input_onsubmit_script(html_script_utilities.$default_sentence_input_simple_applets$.getGlobalValue());
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
                                            html_indent(ONE_INTEGER);
                                            html_markup(script);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt233$cb_hypothesize_handler, NIL, UNPROVIDED);
                                                    if (NIL != args) {
                                                        com.cyc.cycjava.cycl.cb_editor.cb_hypothesize_results(args);
                                                    }
                                                    cb_help_preamble($CB_HYPOTHESIZE_HANDLER, UNPROVIDED, UNPROVIDED);
                                                    html_reset_input($$$Reset_Values);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($$$Hypothesize, UNPROVIDED, UNPROVIDED);
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject mt = (NIL != forts.fort_p($cb_last_hyp_mt$.getDynamicValue(thread))) ? ((SubLObject) ($cb_last_hyp_mt$.getDynamicValue(thread))) : NIL;
                                                        html_newline(UNPROVIDED);
                                                        cb_mt_input_section(mt, UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                    }
                                                    cb_el_sentence_input_section(NIL != $cb_last_hyp_formula$.getDynamicValue(thread) ? ((SubLObject) ($cb_last_hyp_formula$.getDynamicValue(thread))) : NIL, $list_alt235);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_52, thread);
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

    public static SubLObject cb_hypothesize_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Hypothesize;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str41$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$108 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$109 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str46$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
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
                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str286$cb_hypothesize_handler, T, UNPROVIDED);
                            if (NIL != args) {
                                cb_hypothesize_results(args);
                            }
                            cb_help_preamble($CB_HYPOTHESIZE_HANDLER, UNPROVIDED, UNPROVIDED);
                            html_reset_input($$$Reset_Values);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Hypothesize, UNPROVIDED, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            final SubLObject mt = (NIL != forts.fort_p($cb_last_hyp_mt$.getDynamicValue(thread))) ? $cb_last_hyp_mt$.getDynamicValue(thread) : NIL;
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(NIL != $cb_last_hyp_formula$.getDynamicValue(thread) ? $cb_last_hyp_formula$.getDynamicValue(thread) : NIL, $list288);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$109, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$108, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_hypothesize_results_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mt = cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                SubLObject mt_error = thread.secondMultipleValue();
                SubLObject mt_error_string = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != mt_error) {
                    return cb_mt_error(mt_error, mt_error_string);
                }
                thread.resetMultipleValues();
                {
                    SubLObject sentence = cb_extract_el_sentence_input(args, $list_alt237);
                    SubLObject sentence_error = thread.secondMultipleValue();
                    SubLObject sentence_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != sentence_error) {
                        return cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
                    }
                    $cb_last_hyp_formula$.setDynamicValue(sentence, thread);
                    $cb_last_hyp_mt$.setDynamicValue(mt, thread);
                    {
                        SubLObject result = com.cyc.cycjava.cycl.cb_editor.cb_hypothesize_hook($cb_last_hyp_formula$.getDynamicValue(thread), $cb_last_hyp_mt$.getDynamicValue(thread));
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str_alt238$Last_hypothesis_in_);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_form($cb_last_hyp_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        html_princ($str_alt64$__);
                        html_newline(UNPROVIDED);
                        cb_form($cb_last_hyp_formula$.getDynamicValue(thread), ZERO_INTEGER, T);
                        html_newline(TWO_INTEGER);
                        if (result.equal($ERROR)) {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt240$Error_description__);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                                try {
                                    html_macros.$within_html_pre$.bind(T, thread);
                                    html_newline(UNPROVIDED);
                                    cb_browser.cb_c_documentation_string(fi.fi_get_error_string_int());
                                } finally {
                                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        } else {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str_alt241$Hypothesis_results___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_form(result, UNPROVIDED, UNPROVIDED);
                        }
                        html_hr(UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_hypothesize_results(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list290);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
        }
        $cb_last_hyp_formula$.setDynamicValue(sentence, thread);
        $cb_last_hyp_mt$.setDynamicValue(mt, thread);
        final SubLObject result = cb_hypothesize_hook($cb_last_hyp_formula$.getDynamicValue(thread), $cb_last_hyp_mt$.getDynamicValue(thread));
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Last_hypothesis_in_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_form($cb_last_hyp_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        html_princ($str87$__);
        html_newline(UNPROVIDED);
        cb_form($cb_last_hyp_formula$.getDynamicValue(thread), ZERO_INTEGER, T);
        html_newline(TWO_INTEGER);
        if (result.equal($ERROR)) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str293$Error_description__);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_macros.verify_not_within_html_pre();
            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind(T, thread);
                html_newline(UNPROVIDED);
                cb_browser.cb_c_documentation_string(fi.fi_get_error_string_int());
            } finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str294$Hypothesis_results___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            cb_form(result, UNPROVIDED, UNPROVIDED);
        }
        html_hr(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_hypothesize_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Hypothesize;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt233$cb_hypothesize_handler);
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

    public static SubLObject cb_link_hypothesize(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Hypothesize;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str286$cb_hypothesize_handler);
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

    public static SubLObject xml_assertion_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assert_spec = html_extract_input($$$assertionId, args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject v_assert = cb_guess_assertion(assert_spec);
            final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                try {
                    final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$assertions, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.xml_terpri();
                            try {
                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$assertion, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_mt(assertions_high.assertion_mt(v_assert));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$assertion);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                }
                            }
                            cycml.cycml_serialize_sentence(uncanonicalizer.assertion_el_formula(v_assert));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$115, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$assertions);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$113, thread);
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    private static final SubLSymbol $FORWARD_PROPAGATE_MT = makeKeyword("FORWARD-PROPAGATE-MT");

    private static final SubLSymbol $DIAGNOSE_CONSTANT = makeKeyword("DIAGNOSE-CONSTANT");

    static private final SubLList $list_alt23 = list(reader_make_constant_shell("InstanceNamedFn-Ternary"), reader_make_constant_shell("ProperSubcollectionNamedFn-Ternary"), reader_make_constant_shell("CityNamedFn"), reader_make_constant_shell("PersonNamedFn"), reader_make_constant_shell("PlaceNamedFn"), reader_make_constant_shell("PredicateNamedFn"), reader_make_constant_shell("StreetNamedFn"), reader_make_constant_shell("OrganizationNamedFn"));

    static private final SubLString $str_alt25$cb_create_html = makeString("cb-create.html");

    static private final SubLString $str_alt29$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt30$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt31$cb_handle_create = makeString("cb-handle-create");

    static private final SubLString $str_alt33$Enter_name_for_new_constant___ = makeString("Enter name for new constant : ");

    static private final SubLString $str_alt34$new_name = makeString("new-name");

    static private final SubLString $str_alt43$_S_is_not_a_valid_constant_name = makeString("~S is not a valid constant name");

    static private final SubLString $str_alt44$Already_a_constant_named__a = makeString("Already a constant named ~a");

    static private final SubLString $str_alt46$Unable_to_create_a_constant_named = makeString("Unable to create a constant named ~S");

    static private final SubLString $str_alt49$create_tool_gif = makeString("create-tool.gif");

    static private final SubLString $str_alt52$cb_create = makeString("cb-create");

    static private final SubLString $str_alt57$cb_create_similar_html = makeString("cb-create-similar.html");

    static private final SubLList $list_alt59 = list(makeSymbol("FORT-SPEC"));

    static private final SubLString $str_alt60$_a_does_not_specify_a_Cyc_term = makeString("~a does not specify a Cyc term");

    static private final SubLString $$$Create_Similar_Constant = makeString("Create Similar Constant");

    static private final SubLString $str_alt62$cb_handle_create_similar = makeString("cb-handle-create-similar");

    static private final SubLString $str_alt63$Enter_name_for_new_term_similar_t = makeString("Enter name for new term similar to ");

    static private final SubLString $str_alt64$__ = makeString(" :");

    static private final SubLString $str_alt69$Check_the_assertions_from_ = makeString("Check the assertions from ");

    static private final SubLString $str_alt70$_which_you_wish_to_copy_as_well__ = makeString(" which you wish to copy as well: ");

    public static SubLObject cb_form_smart(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = cb_form_widgets.cb_extract_el_sentence_input(args, $list301);
        final SubLObject assertion = czer_meta.find_assertion_cycl(cycl, UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            if (NIL != assertion) {
                cb_show_assertion_readably(assertion, UNPROVIDED, UNPROVIDED);
            } else {
                cb_form(cycl, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt75$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    static private final SubLString $str_alt77$Already_a_constant_named__S = makeString("Already a constant named ~S");

    static private final SubLString $str_alt78$Constant__S_already_exists_which_ = makeString("Constant ~S already exists which differs from ~S only by case");

    static private final SubLString $str_alt79$Unable_to_create_a_similar_consta = makeString("Unable to create a similar constant named ~S");

    public static final SubLObject declare_cb_editor_file_alt() {
        declareFunction("cb_create_hook", "CB-CREATE-HOOK", 1, 0, false);
        declareFunction("cb_hypothesize_hook", "CB-HYPOTHESIZE-HOOK", 2, 0, false);
        declareFunction("cb_term_toolbar", "CB-TERM-TOOLBAR", 1, 0, false);
        declareFunction("term_modification_permittedP", "TERM-MODIFICATION-PERMITTED?", 1, 0, false);
        declareFunction("term_as_merge_source_permittedP", "TERM-AS-MERGE-SOURCE-PERMITTED?", 1, 0, false);
        declareFunction("cb_create", "CB-CREATE", 0, 1, false);
        declareFunction("cb_handle_create", "CB-HANDLE-CREATE", 1, 0, false);
        declareFunction("cb_link_create", "CB-LINK-CREATE", 0, 1, false);
        declareFunction("cb_create_similar", "CB-CREATE-SIMILAR", 1, 0, false);
        declareFunction("cb_handle_create_similar", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false);
        declareFunction("cb_link_create_similar", "CB-LINK-CREATE-SIMILAR", 1, 1, false);
        declareFunction("cb_link_create_instance", "CB-LINK-CREATE-INSTANCE", 1, 1, false);
        declareFunction("cb_link_create_spec", "CB-LINK-CREATE-SPEC", 1, 1, false);
        declareFunction("cb_create_similar_checkbox", "CB-CREATE-SIMILAR-CHECKBOX", 1, 0, false);
        declareFunction("cb_rename", "CB-RENAME", 1, 0, false);
        declareFunction("cb_handle_rename", "CB-HANDLE-RENAME", 1, 0, false);
        declareFunction("cb_link_rename", "CB-LINK-RENAME", 1, 2, false);
        declareFunction("cb_merge", "CB-MERGE", 1, 0, false);
        declareFunction("cb_handle_merge", "CB-HANDLE-MERGE", 1, 0, false);
        declareFunction("cb_link_merge", "CB-LINK-MERGE", 1, 2, false);
        declareFunction("cb_kill", "CB-KILL", 1, 0, false);
        declareFunction("cb_link_kill", "CB-LINK-KILL", 1, 3, false);
        declareFunction("cb_confirm_kill", "CB-CONFIRM-KILL", 1, 0, false);
        declareFunction("cb_link_confirm_kill", "CB-LINK-CONFIRM-KILL", 1, 2, false);
        declareFunction("cb_recreate", "CB-RECREATE", 1, 0, false);
        declareFunction("cb_recreate_handler", "CB-RECREATE-HANDLER", 1, 0, false);
        declareFunction("cb_link_recreate", "CB-LINK-RECREATE", 1, 2, false);
        declareFunction("cb_all_assertions_tms", "CB-ALL-ASSERTIONS-TMS", 1, 0, false);
        declareFunction("cb_all_assertions_tms_handler", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false);
        declareFunction("cb_link_all_assertions_tms", "CB-LINK-ALL-ASSERTIONS-TMS", 1, 1, false);
        declareFunction("cb_diagnose_constant_get_diag_on", "CB-DIAGNOSE-CONSTANT-GET-DIAG-ON", 1, 0, false);
        declareFunction("cb_diagnose_constant_get_concern", "CB-DIAGNOSE-CONSTANT-GET-CONCERN", 1, 0, false);
        declareFunction("cb_diagnose_constant_get_criticality", "CB-DIAGNOSE-CONSTANT-GET-CRITICALITY", 1, 0, false);
        declareFunction("cb_diagnose_constant_get_level", "CB-DIAGNOSE-CONSTANT-GET-LEVEL", 1, 0, false);
        declareFunction("cb_diagnose_constant_get_name", "CB-DIAGNOSE-CONSTANT-GET-NAME", 1, 0, false);
        declareFunction("cb_diagnose_constant_get_desc", "CB-DIAGNOSE-CONSTANT-GET-DESC", 1, 0, false);
        declareFunction("cb_diagnose_constant_test_concern", "CB-DIAGNOSE-CONSTANT-TEST-CONCERN", 2, 0, false);
        declareFunction("cb_diagnose_constant_test_criticality", "CB-DIAGNOSE-CONSTANT-TEST-CRITICALITY", 2, 0, false);
        declareFunction("cb_diagnose_constant_test_level", "CB-DIAGNOSE-CONSTANT-TEST-LEVEL", 2, 0, false);
        declareFunction("cb_diagnose_constant_test_name", "CB-DIAGNOSE-CONSTANT-TEST-NAME", 2, 0, false);
        declareFunction("cb_diagnose_constant_make_main_list", "CB-DIAGNOSE-CONSTANT-MAKE-MAIN-LIST", 0, 0, false);
        declareFunction("cb_diagnose_constant_sort_main_list", "CB-DIAGNOSE-CONSTANT-SORT-MAIN-LIST", 0, 0, false);
        declareFunction("cb_diagnose_constant", "CB-DIAGNOSE-CONSTANT", 1, 0, false);
        declareFunction("cb_diagnose_constant_handler", "CB-DIAGNOSE-CONSTANT-HANDLER", 1, 0, false);
        declareFunction("cb_link_diagnose_constant", "CB-LINK-DIAGNOSE-CONSTANT", 1, 1, false);
        declareFunction("cb_hypothesize_handler", "CB-HYPOTHESIZE-HANDLER", 0, 1, false);
        declareFunction("cb_hypothesize_results", "CB-HYPOTHESIZE-RESULTS", 1, 0, false);
        declareFunction("cb_link_hypothesize", "CB-LINK-HYPOTHESIZE", 0, 1, false);
        return NIL;
    }

    public static SubLObject declare_cb_editor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_create_hook", "CB-CREATE-HOOK", 1, 0, false);
            declareFunction("cb_hypothesize_hook", "CB-HYPOTHESIZE-HOOK", 2, 0, false);
            declareFunction("cb_term_toolbar", "CB-TERM-TOOLBAR", 1, 0, false);
            declareFunction("term_modification_permittedP", "TERM-MODIFICATION-PERMITTED?", 1, 0, false);
            declareFunction("term_modification_forbiddenP", "TERM-MODIFICATION-FORBIDDEN?", 1, 0, false);
            declareFunction("term_as_merge_source_permittedP", "TERM-AS-MERGE-SOURCE-PERMITTED?", 1, 0, false);
            declareFunction("cb_create", "CB-CREATE", 0, 1, false);
            declareFunction("cb_handle_create", "CB-HANDLE-CREATE", 1, 0, false);
            declareFunction("cb_link_create", "CB-LINK-CREATE", 0, 1, false);
            declareFunction("cb_create_similar_legacy", "CB-CREATE-SIMILAR-LEGACY", 1, 0, false);
            declareFunction("cb_handle_create_similar_legacy", "CB-HANDLE-CREATE-SIMILAR-LEGACY", 1, 0, false);
            declareFunction("cb_handle_create_similar", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false);
            declareFunction("cb_link_create_similar", "CB-LINK-CREATE-SIMILAR", 1, 1, false);
            declareFunction("cb_create_similar_guest_warn", "CB-CREATE-SIMILAR-GUEST-WARN", 0, 0, false);
            declareFunction("cb_similar_button_row", "CB-SIMILAR-BUTTON-ROW", 0, 1, false);
            declareFunction("xml_fort_info", "XML-FORT-INFO", 1, 1, false);
            declareFunction("fort_info_preds", "FORT-INFO-PREDS", 1, 1, false);
            declareFunction("create_similar_valid_nat_nameP", "CREATE-SIMILAR-VALID-NAT-NAME?", 1, 0, false);
            declareFunction("cb_create_similar", "CB-CREATE-SIMILAR", 1, 0, false);
            declareFunction("cb_link_create_similar_legacy", "CB-LINK-CREATE-SIMILAR-LEGACY", 1, 1, false);
            declareFunction("cb_link_create_instance", "CB-LINK-CREATE-INSTANCE", 1, 1, false);
            declareFunction("cb_link_create_spec", "CB-LINK-CREATE-SPEC", 1, 1, false);
            declareFunction("cb_link_create_spec_mt", "CB-LINK-CREATE-SPEC-MT", 1, 1, false);
            declareFunction("cb_link_create_spec_pred", "CB-LINK-CREATE-SPEC-PRED", 1, 1, false);
            declareFunction("cb_create_similar_checkbox", "CB-CREATE-SIMILAR-CHECKBOX", 1, 0, false);
            declareFunction("cb_rename", "CB-RENAME", 1, 0, false);
            declareFunction("cb_handle_rename", "CB-HANDLE-RENAME", 1, 0, false);
            declareFunction("cb_link_rename", "CB-LINK-RENAME", 1, 2, false);
            declareFunction("cb_merge", "CB-MERGE", 1, 0, false);
            declareFunction("cb_handle_merge", "CB-HANDLE-MERGE", 1, 0, false);
            declareFunction("cb_link_merge", "CB-LINK-MERGE", 1, 2, false);
            declareFunction("cb_kill", "CB-KILL", 1, 0, false);
            declareFunction("cb_link_kill", "CB-LINK-KILL", 1, 3, false);
            declareFunction("cb_confirm_kill", "CB-CONFIRM-KILL", 1, 0, false);
            declareFunction("cb_link_confirm_kill", "CB-LINK-CONFIRM-KILL", 1, 2, false);
            declareFunction("cb_recreate", "CB-RECREATE", 1, 0, false);
            declareFunction("cb_recreate_handler", "CB-RECREATE-HANDLER", 1, 0, false);
            declareFunction("cb_link_recreate", "CB-LINK-RECREATE", 1, 2, false);
            declareFunction("cb_all_assertions_tms", "CB-ALL-ASSERTIONS-TMS", 1, 0, false);
            declareFunction("cb_all_assertions_tms_handler", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false);
            declareFunction("cb_link_all_assertions_tms", "CB-LINK-ALL-ASSERTIONS-TMS", 1, 1, false);
            declareFunction("cb_hypothesize_handler", "CB-HYPOTHESIZE-HANDLER", 0, 1, false);
            declareFunction("cb_hypothesize_results", "CB-HYPOTHESIZE-RESULTS", 1, 0, false);
            declareFunction("cb_link_hypothesize", "CB-LINK-HYPOTHESIZE", 0, 1, false);
            declareFunction("xml_assertion_info", "XML-ASSERTION-INFO", 1, 0, false);
            declareFunction("cb_form_smart", "CB-FORM-SMART", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_diagnose_constant_get_diag_on", "CB-DIAGNOSE-CONSTANT-GET-DIAG-ON", 1, 0, false);
            declareFunction("cb_diagnose_constant_get_concern", "CB-DIAGNOSE-CONSTANT-GET-CONCERN", 1, 0, false);
            declareFunction("cb_diagnose_constant_get_criticality", "CB-DIAGNOSE-CONSTANT-GET-CRITICALITY", 1, 0, false);
            declareFunction("cb_diagnose_constant_get_level", "CB-DIAGNOSE-CONSTANT-GET-LEVEL", 1, 0, false);
            declareFunction("cb_diagnose_constant_get_name", "CB-DIAGNOSE-CONSTANT-GET-NAME", 1, 0, false);
            declareFunction("cb_diagnose_constant_get_desc", "CB-DIAGNOSE-CONSTANT-GET-DESC", 1, 0, false);
            declareFunction("cb_diagnose_constant_test_concern", "CB-DIAGNOSE-CONSTANT-TEST-CONCERN", 2, 0, false);
            declareFunction("cb_diagnose_constant_test_criticality", "CB-DIAGNOSE-CONSTANT-TEST-CRITICALITY", 2, 0, false);
            declareFunction("cb_diagnose_constant_test_level", "CB-DIAGNOSE-CONSTANT-TEST-LEVEL", 2, 0, false);
            declareFunction("cb_diagnose_constant_test_name", "CB-DIAGNOSE-CONSTANT-TEST-NAME", 2, 0, false);
            declareFunction("cb_diagnose_constant_make_main_list", "CB-DIAGNOSE-CONSTANT-MAKE-MAIN-LIST", 0, 0, false);
            declareFunction("cb_diagnose_constant_sort_main_list", "CB-DIAGNOSE-CONSTANT-SORT-MAIN-LIST", 0, 0, false);
            declareFunction("cb_diagnose_constant", "CB-DIAGNOSE-CONSTANT", 1, 0, false);
            declareFunction("cb_diagnose_constant_handler", "CB-DIAGNOSE-CONSTANT-HANDLER", 1, 0, false);
            declareFunction("cb_link_diagnose_constant", "CB-LINK-DIAGNOSE-CONSTANT", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_editor_file_Previous() {
        declareFunction("cb_create_hook", "CB-CREATE-HOOK", 1, 0, false);
        declareFunction("cb_hypothesize_hook", "CB-HYPOTHESIZE-HOOK", 2, 0, false);
        declareFunction("cb_term_toolbar", "CB-TERM-TOOLBAR", 1, 0, false);
        declareFunction("term_modification_permittedP", "TERM-MODIFICATION-PERMITTED?", 1, 0, false);
        declareFunction("term_modification_forbiddenP", "TERM-MODIFICATION-FORBIDDEN?", 1, 0, false);
        declareFunction("term_as_merge_source_permittedP", "TERM-AS-MERGE-SOURCE-PERMITTED?", 1, 0, false);
        declareFunction("cb_create", "CB-CREATE", 0, 1, false);
        declareFunction("cb_handle_create", "CB-HANDLE-CREATE", 1, 0, false);
        declareFunction("cb_link_create", "CB-LINK-CREATE", 0, 1, false);
        declareFunction("cb_create_similar_legacy", "CB-CREATE-SIMILAR-LEGACY", 1, 0, false);
        declareFunction("cb_handle_create_similar_legacy", "CB-HANDLE-CREATE-SIMILAR-LEGACY", 1, 0, false);
        declareFunction("cb_handle_create_similar", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false);
        declareFunction("cb_link_create_similar", "CB-LINK-CREATE-SIMILAR", 1, 1, false);
        declareFunction("cb_create_similar_guest_warn", "CB-CREATE-SIMILAR-GUEST-WARN", 0, 0, false);
        declareFunction("cb_similar_button_row", "CB-SIMILAR-BUTTON-ROW", 0, 1, false);
        declareFunction("xml_fort_info", "XML-FORT-INFO", 1, 1, false);
        declareFunction("fort_info_preds", "FORT-INFO-PREDS", 1, 1, false);
        declareFunction("create_similar_valid_nat_nameP", "CREATE-SIMILAR-VALID-NAT-NAME?", 1, 0, false);
        declareFunction("cb_create_similar", "CB-CREATE-SIMILAR", 1, 0, false);
        declareFunction("cb_link_create_similar_legacy", "CB-LINK-CREATE-SIMILAR-LEGACY", 1, 1, false);
        declareFunction("cb_link_create_instance", "CB-LINK-CREATE-INSTANCE", 1, 1, false);
        declareFunction("cb_link_create_spec", "CB-LINK-CREATE-SPEC", 1, 1, false);
        declareFunction("cb_link_create_spec_mt", "CB-LINK-CREATE-SPEC-MT", 1, 1, false);
        declareFunction("cb_link_create_spec_pred", "CB-LINK-CREATE-SPEC-PRED", 1, 1, false);
        declareFunction("cb_create_similar_checkbox", "CB-CREATE-SIMILAR-CHECKBOX", 1, 0, false);
        declareFunction("cb_rename", "CB-RENAME", 1, 0, false);
        declareFunction("cb_handle_rename", "CB-HANDLE-RENAME", 1, 0, false);
        declareFunction("cb_link_rename", "CB-LINK-RENAME", 1, 2, false);
        declareFunction("cb_merge", "CB-MERGE", 1, 0, false);
        declareFunction("cb_handle_merge", "CB-HANDLE-MERGE", 1, 0, false);
        declareFunction("cb_link_merge", "CB-LINK-MERGE", 1, 2, false);
        declareFunction("cb_kill", "CB-KILL", 1, 0, false);
        declareFunction("cb_link_kill", "CB-LINK-KILL", 1, 3, false);
        declareFunction("cb_confirm_kill", "CB-CONFIRM-KILL", 1, 0, false);
        declareFunction("cb_link_confirm_kill", "CB-LINK-CONFIRM-KILL", 1, 2, false);
        declareFunction("cb_recreate", "CB-RECREATE", 1, 0, false);
        declareFunction("cb_recreate_handler", "CB-RECREATE-HANDLER", 1, 0, false);
        declareFunction("cb_link_recreate", "CB-LINK-RECREATE", 1, 2, false);
        declareFunction("cb_all_assertions_tms", "CB-ALL-ASSERTIONS-TMS", 1, 0, false);
        declareFunction("cb_all_assertions_tms_handler", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false);
        declareFunction("cb_link_all_assertions_tms", "CB-LINK-ALL-ASSERTIONS-TMS", 1, 1, false);
        declareFunction("cb_hypothesize_handler", "CB-HYPOTHESIZE-HANDLER", 0, 1, false);
        declareFunction("cb_hypothesize_results", "CB-HYPOTHESIZE-RESULTS", 1, 0, false);
        declareFunction("cb_link_hypothesize", "CB-LINK-HYPOTHESIZE", 0, 1, false);
        declareFunction("xml_assertion_info", "XML-ASSERTION-INFO", 1, 0, false);
        declareFunction("cb_form_smart", "CB-FORM-SMART", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt82$_Create_Similar_ = makeString("[Create Similar]");

    static private final SubLString $str_alt83$cb_create_similar__A = makeString("cb-create-similar&~A");

    static private final SubLString $str_alt85$_Create_Instance_ = makeString("[Create Instance]");

    static private final SubLString $str_alt86$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'instance');");

    static private final SubLString $str_alt88$_Create_Spec_ = makeString("[Create Spec]");

    static private final SubLString $str_alt89$javascript_startCreate___A_____A_ = makeString("javascript:startCreate('~A', '~A', 'spec');");

    static private final SubLString $str_alt92$cb_rename_html = makeString("cb-rename.html");

    static private final SubLString $str_alt94$_a_does_not_specify_a_Cyc_constan = makeString("~a does not specify a Cyc constant");

    static private final SubLString $str_alt96$cb_handle_rename = makeString("cb-handle-rename");

    static private final SubLString $str_alt98$Enter_new_name_for_ = makeString("Enter new name for ");

    static private final SubLString $str_alt103$Cyc_Rename_Kill = makeString("Cyc Rename/Kill");

    static private final SubLString $str_alt105$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~S");

    static private final SubLString $str_alt106$Name_specified_is_same_as_current = makeString("Name specified is same as current name");

    static private final SubLString $str_alt109$_Rename_ = makeString("[Rename]");

    static private final SubLString $str_alt110$cb_rename__A = makeString("cb-rename&~A");

    static private final SubLString $str_alt113$cb_merge_html = makeString("cb-merge.html");

    static private final SubLString $str_alt116$cb_handle_merge = makeString("cb-handle-merge");

    static private final SubLString $str_alt117$fort_spec = makeString("fort-spec");

    static private final SubLString $str_alt118$Merge_the_term_ = makeString("Merge the term ");

    static private final SubLString $str_alt119$_onto_the_existing_constant_named = makeString(" onto the existing constant named :");

    static private final SubLString $str_alt120$target_name = makeString("target-name");

    static private final SubLString $str_alt124$Attempt_to_merge__S_with_itself_ = makeString("Attempt to merge ~S with itself.");

    public static final SubLObject init_cb_editor_file_alt() {
        defparameter("*MERGE-PERMITTED-FUNCTIONS*", $list_alt23);
        defparameter("*LAST-DIAGNOSE-CONSTANT*", NIL);
        defparameter("*LAST-DIAGNOSE-APPLICABLE*", NIL);
        defparameter("*DIAGNOSE-CONSTANT-MAIN-LIST*", NIL);
        defparameter("*CB-DIAGNOSE-CONSTANT-CONCERN-ORDER*", $list_alt187);
        defparameter("*CB-DIAGNOSE-CONSTANT-CRITICALITY-ORDER*", $list_alt188);
        defparameter("*CB-LAST-HYP-FORMULA*", NIL);
        defparameter("*CB-LAST-HYP-MT*", mt_vars.$default_assert_mt$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_cb_editor_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*MERGE-PERMITTED-FUNCTIONS*", $list35);
            defparameter("*CB-ENABLE-LEGACY-CREATE-SIMILAR*", NIL);
            defparameter("*CB-LAST-HYP-FORMULA*", NIL);
            defparameter("*CB-LAST-HYP-MT*", mt_vars.$default_assert_mt$.getGlobalValue());
        }
        if (SubLFiles.USE_V2) {
            defparameter("*MERGE-PERMITTED-FUNCTIONS*", $list_alt23);
            defparameter("*LAST-DIAGNOSE-CONSTANT*", NIL);
            defparameter("*LAST-DIAGNOSE-APPLICABLE*", NIL);
            defparameter("*DIAGNOSE-CONSTANT-MAIN-LIST*", NIL);
            defparameter("*CB-DIAGNOSE-CONSTANT-CONCERN-ORDER*", $list_alt187);
            defparameter("*CB-DIAGNOSE-CONSTANT-CRITICALITY-ORDER*", $list_alt188);
        }
        return NIL;
    }

    public static SubLObject init_cb_editor_file_Previous() {
        defparameter("*MERGE-PERMITTED-FUNCTIONS*", $list35);
        defparameter("*CB-ENABLE-LEGACY-CREATE-SIMILAR*", NIL);
        defparameter("*CB-LAST-HYP-FORMULA*", NIL);
        defparameter("*CB-LAST-HYP-MT*", mt_vars.$default_assert_mt$.getGlobalValue());
        return NIL;
    }

    static private final SubLString $str_alt126$_Merge_ = makeString("[Merge]");

    static private final SubLString $str_alt127$cb_merge__A = makeString("cb-merge&~A");

    public static final SubLObject setup_cb_editor_file_alt() {
        sethash($CB_CREATE, $cb_help_definitions$.getGlobalValue(), list($str_alt25$cb_create_html, NIL));
        html_macros.note_html_handler_function(CB_CREATE);
        html_macros.note_html_handler_function(CB_HANDLE_CREATE);
        sethash($CREATE, $cb_icon_definitions$.getGlobalValue(), list($str_alt49$create_tool_gif, NIL));
        setup_cb_link_method($CREATE, CB_LINK_CREATE, ONE_INTEGER);
        declare_cb_tool($CREATE, $$$Create, $$$Crt, $$$Create_Bare_Cyc_Constant);
        sethash($CB_CREATE_SIMILAR, $cb_help_definitions$.getGlobalValue(), list($str_alt57$cb_create_similar_html, NIL));
        html_macros.note_html_handler_function(CB_CREATE_SIMILAR);
        html_macros.note_html_handler_function(CB_HANDLE_CREATE_SIMILAR);
        setup_cb_link_method($CREATE_SIMILAR, CB_LINK_CREATE_SIMILAR, TWO_INTEGER);
        setup_cb_link_method($CREATE_INSTANCE, CB_LINK_CREATE_INSTANCE, TWO_INTEGER);
        setup_cb_link_method($CREATE_SPEC, CB_LINK_CREATE_SPEC, TWO_INTEGER);
        sethash($CB_RENAME, $cb_help_definitions$.getGlobalValue(), list($str_alt92$cb_rename_html, NIL));
        html_macros.note_html_handler_function(CB_RENAME);
        html_macros.note_html_handler_function(CB_HANDLE_RENAME);
        setup_cb_link_method($RENAME, CB_LINK_RENAME, THREE_INTEGER);
        sethash($CB_MERGE, $cb_help_definitions$.getGlobalValue(), list($str_alt113$cb_merge_html, NIL));
        html_macros.note_html_handler_function(CB_MERGE);
        html_macros.note_html_handler_function(CB_HANDLE_MERGE);
        setup_cb_link_method($MERGE, CB_LINK_MERGE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_KILL);
        setup_cb_link_method($KILL, CB_LINK_KILL, FOUR_INTEGER);
        sethash($CB_CONFIRM_KILL, $cb_help_definitions$.getGlobalValue(), list($str_alt138$cb_confirm_kill_html, NIL));
        html_macros.note_html_handler_function(CB_CONFIRM_KILL);
        setup_cb_link_method($CONFIRM_KILL, CB_LINK_CONFIRM_KILL, THREE_INTEGER);
        sethash($CB_RECREATE, $cb_help_definitions$.getGlobalValue(), list($str_alt156$cb_recreate_html, NIL));
        html_macros.note_html_handler_function(CB_RECREATE);
        html_macros.note_html_handler_function(CB_RECREATE_HANDLER);
        setup_cb_link_method($RECREATE, CB_LINK_RECREATE, THREE_INTEGER);
        sethash($CB_ALL_ASSERTIONS_TMS_HANDLER, $cb_help_definitions$.getGlobalValue(), list($str_alt170$cb_all_assertions_tms_handler_htm, NIL));
        html_macros.note_html_handler_function(CB_ALL_ASSERTIONS_TMS);
        html_macros.note_html_handler_function(CB_ALL_ASSERTIONS_TMS_HANDLER);
        setup_cb_link_method($ALL_ASSERTIONS_TMS, CB_LINK_ALL_ASSERTIONS_TMS, TWO_INTEGER);
        register_html_state_variable($last_diagnose_constant$);
        register_html_state_variable($last_diagnose_applicable$);
        register_html_state_variable($diagnose_constant_main_list$);
        sethash($CB_DIAGNOSE_CONSTANT, $cb_help_definitions$.getGlobalValue(), list($str_alt203$cb_diagnose_constant_html, NIL));
        html_macros.note_html_handler_function(CB_DIAGNOSE_CONSTANT);
        html_macros.note_html_handler_function(CB_DIAGNOSE_CONSTANT_HANDLER);
        setup_cb_link_method($DIAGNOSE_CONSTANT, CB_LINK_DIAGNOSE_CONSTANT, TWO_INTEGER);
        register_html_state_variable($cb_last_hyp_formula$);
        register_html_state_variable($cb_last_hyp_mt$);
        sethash($CB_HYPOTHESIZE_HANDLER, $cb_help_definitions$.getGlobalValue(), list($str_alt231$cb_hypothesize_handler_html, NIL));
        html_macros.note_html_handler_function(CB_HYPOTHESIZE_HANDLER);
        setup_cb_link_method($HYPOTHESIZE, CB_LINK_HYPOTHESIZE, ONE_INTEGER);
        declare_cb_tool($HYPOTHESIZE, $$$Hypothesize, $$$Hyp, $$$Hypothesize_a_formula);
        return NIL;
    }

    public static SubLObject setup_cb_editor_file() {
        if (SubLFiles.USE_V1) {
            sethash($CB_CREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str37$cb_create_html, NIL));
            html_macros.note_cgi_handler_function(CB_CREATE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CREATE, $HTML_HANDLER);
            sethash($CREATE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str71$create_tool_gif, NIL));
            setup_cb_link_method($CREATE, CB_LINK_CREATE, ONE_INTEGER);
            declare_deprecated_cb_tool($CREATE, $$$Create, $$$Crt, $$$Create_Bare_Cyc_Constant);
            sethash($CB_CREATE_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str79$cb_create_similar_html, NIL));
            register_html_state_variable($cb_enable_legacy_create_similar$);
            html_macros.note_cgi_handler_function(CB_CREATE_SIMILAR_LEGACY, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_SIMILAR_LEGACY, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_SIMILAR, $XML_HANDLER);
            setup_cb_link_method($CREATE_SIMILAR, CB_LINK_CREATE_SIMILAR, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_CREATE_SIMILAR, $HTML_HANDLER);
            setup_cb_link_method($CREATE_SIMILAR_LEGACY, CB_LINK_CREATE_SIMILAR_LEGACY, TWO_INTEGER);
            setup_cb_link_method($CREATE_INSTANCE, CB_LINK_CREATE_INSTANCE, TWO_INTEGER);
            setup_cb_link_method($CREATE_SPEC, CB_LINK_CREATE_SPEC, TWO_INTEGER);
            setup_cb_link_method($CREATE_SPEC_MT, CB_LINK_CREATE_SPEC_MT, TWO_INTEGER);
            setup_cb_link_method($CREATE_SPEC_PRED, CB_LINK_CREATE_SPEC_PRED, TWO_INTEGER);
            sethash($CB_RENAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str189$cb_rename_html, NIL));
            html_macros.note_cgi_handler_function(CB_RENAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_RENAME, $HTML_HANDLER);
            setup_cb_link_method($RENAME, CB_LINK_RENAME, THREE_INTEGER);
            sethash($CB_MERGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str209$cb_merge_html, NIL));
            html_macros.note_cgi_handler_function(CB_MERGE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_MERGE, $HTML_HANDLER);
            setup_cb_link_method($MERGE, CB_LINK_MERGE, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_KILL, $HTML_HANDLER);
            setup_cb_link_method($KILL, CB_LINK_KILL, FOUR_INTEGER);
            sethash($CB_CONFIRM_KILL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str234$cb_confirm_kill_html, NIL));
            html_macros.note_cgi_handler_function(CB_CONFIRM_KILL, $HTML_HANDLER);
            setup_cb_link_method($CONFIRM_KILL, CB_LINK_CONFIRM_KILL, THREE_INTEGER);
            sethash($CB_RECREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str252$cb_recreate_html, NIL));
            html_macros.note_cgi_handler_function(CB_RECREATE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_RECREATE_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($RECREATE, CB_LINK_RECREATE, THREE_INTEGER);
            sethash($CB_ALL_ASSERTIONS_TMS_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str266$cb_all_assertions_tms_handler_htm, NIL));
            html_macros.note_cgi_handler_function(CB_ALL_ASSERTIONS_TMS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_ALL_ASSERTIONS_TMS_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($ALL_ASSERTIONS_TMS, CB_LINK_ALL_ASSERTIONS_TMS, TWO_INTEGER);
            register_html_state_variable($cb_last_hyp_formula$);
            register_html_state_variable($cb_last_hyp_mt$);
            sethash($CB_HYPOTHESIZE_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str284$cb_hypothesize_handler_html, NIL));
            html_macros.note_cgi_handler_function(CB_HYPOTHESIZE_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($HYPOTHESIZE, CB_LINK_HYPOTHESIZE, ONE_INTEGER);
            declare_cb_tool($HYPOTHESIZE, $$$Hypothesize, $$$Hyp, $$$Hypothesize_a_formula);
            html_macros.note_cgi_handler_function(XML_ASSERTION_INFO, $XML_HANDLER);
            html_macros.note_cgi_handler_function(CB_FORM_SMART, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            sethash($CB_CREATE, $cb_help_definitions$.getGlobalValue(), list($str_alt25$cb_create_html, NIL));
            html_macros.note_html_handler_function(CB_CREATE);
            html_macros.note_html_handler_function(CB_HANDLE_CREATE);
            sethash($CREATE, $cb_icon_definitions$.getGlobalValue(), list($str_alt49$create_tool_gif, NIL));
            declare_cb_tool($CREATE, $$$Create, $$$Crt, $$$Create_Bare_Cyc_Constant);
            sethash($CB_CREATE_SIMILAR, $cb_help_definitions$.getGlobalValue(), list($str_alt57$cb_create_similar_html, NIL));
            html_macros.note_html_handler_function(CB_CREATE_SIMILAR);
            html_macros.note_html_handler_function(CB_HANDLE_CREATE_SIMILAR);
            sethash($CB_RENAME, $cb_help_definitions$.getGlobalValue(), list($str_alt92$cb_rename_html, NIL));
            html_macros.note_html_handler_function(CB_RENAME);
            html_macros.note_html_handler_function(CB_HANDLE_RENAME);
            sethash($CB_MERGE, $cb_help_definitions$.getGlobalValue(), list($str_alt113$cb_merge_html, NIL));
            html_macros.note_html_handler_function(CB_MERGE);
            html_macros.note_html_handler_function(CB_HANDLE_MERGE);
            html_macros.note_html_handler_function(CB_KILL);
            sethash($CB_CONFIRM_KILL, $cb_help_definitions$.getGlobalValue(), list($str_alt138$cb_confirm_kill_html, NIL));
            html_macros.note_html_handler_function(CB_CONFIRM_KILL);
            sethash($CB_RECREATE, $cb_help_definitions$.getGlobalValue(), list($str_alt156$cb_recreate_html, NIL));
            html_macros.note_html_handler_function(CB_RECREATE);
            html_macros.note_html_handler_function(CB_RECREATE_HANDLER);
            sethash($CB_ALL_ASSERTIONS_TMS_HANDLER, $cb_help_definitions$.getGlobalValue(), list($str_alt170$cb_all_assertions_tms_handler_htm, NIL));
            html_macros.note_html_handler_function(CB_ALL_ASSERTIONS_TMS);
            html_macros.note_html_handler_function(CB_ALL_ASSERTIONS_TMS_HANDLER);
            register_html_state_variable($last_diagnose_constant$);
            register_html_state_variable($last_diagnose_applicable$);
            register_html_state_variable($diagnose_constant_main_list$);
            sethash($CB_DIAGNOSE_CONSTANT, $cb_help_definitions$.getGlobalValue(), list($str_alt203$cb_diagnose_constant_html, NIL));
            html_macros.note_html_handler_function(CB_DIAGNOSE_CONSTANT);
            html_macros.note_html_handler_function(CB_DIAGNOSE_CONSTANT_HANDLER);
            setup_cb_link_method($DIAGNOSE_CONSTANT, CB_LINK_DIAGNOSE_CONSTANT, TWO_INTEGER);
            sethash($CB_HYPOTHESIZE_HANDLER, $cb_help_definitions$.getGlobalValue(), list($str_alt231$cb_hypothesize_handler_html, NIL));
            html_macros.note_html_handler_function(CB_HYPOTHESIZE_HANDLER);
        }
        return NIL;
    }

    public static SubLObject setup_cb_editor_file_Previous() {
        sethash($CB_CREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str37$cb_create_html, NIL));
        html_macros.note_cgi_handler_function(CB_CREATE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CREATE, $HTML_HANDLER);
        sethash($CREATE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str71$create_tool_gif, NIL));
        setup_cb_link_method($CREATE, CB_LINK_CREATE, ONE_INTEGER);
        declare_deprecated_cb_tool($CREATE, $$$Create, $$$Crt, $$$Create_Bare_Cyc_Constant);
        sethash($CB_CREATE_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str79$cb_create_similar_html, NIL));
        register_html_state_variable($cb_enable_legacy_create_similar$);
        html_macros.note_cgi_handler_function(CB_CREATE_SIMILAR_LEGACY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_SIMILAR_LEGACY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_SIMILAR, $XML_HANDLER);
        setup_cb_link_method($CREATE_SIMILAR, CB_LINK_CREATE_SIMILAR, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_CREATE_SIMILAR, $HTML_HANDLER);
        setup_cb_link_method($CREATE_SIMILAR_LEGACY, CB_LINK_CREATE_SIMILAR_LEGACY, TWO_INTEGER);
        setup_cb_link_method($CREATE_INSTANCE, CB_LINK_CREATE_INSTANCE, TWO_INTEGER);
        setup_cb_link_method($CREATE_SPEC, CB_LINK_CREATE_SPEC, TWO_INTEGER);
        setup_cb_link_method($CREATE_SPEC_MT, CB_LINK_CREATE_SPEC_MT, TWO_INTEGER);
        setup_cb_link_method($CREATE_SPEC_PRED, CB_LINK_CREATE_SPEC_PRED, TWO_INTEGER);
        sethash($CB_RENAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str189$cb_rename_html, NIL));
        html_macros.note_cgi_handler_function(CB_RENAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_RENAME, $HTML_HANDLER);
        setup_cb_link_method($RENAME, CB_LINK_RENAME, THREE_INTEGER);
        sethash($CB_MERGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str209$cb_merge_html, NIL));
        html_macros.note_cgi_handler_function(CB_MERGE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_MERGE, $HTML_HANDLER);
        setup_cb_link_method($MERGE, CB_LINK_MERGE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_KILL, $HTML_HANDLER);
        setup_cb_link_method($KILL, CB_LINK_KILL, FOUR_INTEGER);
        sethash($CB_CONFIRM_KILL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str234$cb_confirm_kill_html, NIL));
        html_macros.note_cgi_handler_function(CB_CONFIRM_KILL, $HTML_HANDLER);
        setup_cb_link_method($CONFIRM_KILL, CB_LINK_CONFIRM_KILL, THREE_INTEGER);
        sethash($CB_RECREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str252$cb_recreate_html, NIL));
        html_macros.note_cgi_handler_function(CB_RECREATE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_RECREATE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($RECREATE, CB_LINK_RECREATE, THREE_INTEGER);
        sethash($CB_ALL_ASSERTIONS_TMS_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str266$cb_all_assertions_tms_handler_htm, NIL));
        html_macros.note_cgi_handler_function(CB_ALL_ASSERTIONS_TMS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_ALL_ASSERTIONS_TMS_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($ALL_ASSERTIONS_TMS, CB_LINK_ALL_ASSERTIONS_TMS, TWO_INTEGER);
        register_html_state_variable($cb_last_hyp_formula$);
        register_html_state_variable($cb_last_hyp_mt$);
        sethash($CB_HYPOTHESIZE_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str284$cb_hypothesize_handler_html, NIL));
        html_macros.note_cgi_handler_function(CB_HYPOTHESIZE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($HYPOTHESIZE, CB_LINK_HYPOTHESIZE, ONE_INTEGER);
        declare_cb_tool($HYPOTHESIZE, $$$Hypothesize, $$$Hyp, $$$Hypothesize_a_formula);
        html_macros.note_cgi_handler_function(XML_ASSERTION_INFO, $XML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FORM_SMART, $HTML_HANDLER);
        return NIL;
    }

    static private final SubLString $str_alt133$_Kill_ = makeString("[Kill]");

    static private final SubLString $str_alt134$cb_kill__A = makeString("cb-kill&~A");

    static private final SubLString $str_alt135$cb_kill__A_confirmed_T = makeString("cb-kill&~A|confirmed=T");

    static private final SubLString $str_alt138$cb_confirm_kill_html = makeString("cb-confirm-kill.html");

    static private final SubLString $str_alt140$cb_kill = makeString("cb-kill");

    static private final SubLString $str_alt142$NOTE__ = makeString("NOTE: ");

    static private final SubLString $str_alt143$If_you_are_killing_this_term_to_r = makeString("If you are killing this term to remove its assertions and start again from scratch, please go to the ");

    static private final SubLString $str_alt145$_page_instead_ = makeString(" page instead.");

    static private final SubLString $str_alt146$Please_confirm_kill_of_ = makeString("Please confirm kill of ");

    static private final SubLString $str_alt147$_and_the_removal_of_all__S_assert = makeString(" and the removal of all ~S assertions involving it.");

    static private final SubLString $str_alt150$Yes__Kill = makeString("Yes, Kill");

    static private final SubLString $str_alt153$cb_confirm_kill__A = makeString("cb-confirm-kill&~A");

    static private final SubLString $str_alt156$cb_recreate_html = makeString("cb-recreate.html");

    static private final SubLString $str_alt157$the_Cyc_constant_recreate_facilit = makeString("the Cyc constant recreate facility");

    static private final SubLList $list_alt158 = list(makeSymbol("CONSTANT-SPEC"));

    static private final SubLString $str_alt160$cb_recreate_handler = makeString("cb-recreate-handler");

    static private final SubLString $str_alt161$Please_confirm_recreation_of_ = makeString("Please confirm recreation of ");

    static private final SubLString $str_alt162$Yes__Recreate = makeString("Yes, Recreate");

    static private final SubLString $str_alt166$_Recreate_ = makeString("[Recreate]");

    static private final SubLString $str_alt167$cb_recreate__A = makeString("cb-recreate&~A");

    static private final SubLString $str_alt170$cb_all_assertions_tms_handler_htm = makeString("cb-all-assertions-tms-handler.html");

    static private final SubLString $str_alt173$cb_all_assertions_tms_handler = makeString("cb-all-assertions-tms-handler");

    static private final SubLString $str_alt174$These_operations_may_take_some_ti = makeString("These operations may take some time.  Please confirm that you really want to force TMS for all ");

    @Override
    public void declareFunctions() {
        declare_cb_editor_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_editor_file();
    }

    static private final SubLString $str_alt175$_of_the_assertions_of_the_constan = makeString(" of the assertions of the constant ");

    @Override
    public void runTopLevelForms() {
        setup_cb_editor_file();
    }

    static private final SubLString $str_alt176$_ = makeString(".");

    static {
    }

    static private final SubLString $str_alt177$Do_it_ = makeString("Do it!");

    static private final SubLString $str_alt179$Reperform_TMS_on_indexed_Assertio = makeString("Reperform TMS on indexed Assertions");

    static private final SubLString $str_alt181$_Force_TMS_ = makeString("[Force TMS]");

    static private final SubLString $str_alt182$cb_all_assertions_tms__A = makeString("cb-all-assertions-tms&~A");

    static private final SubLList $list_alt187 = list(makeKeyword("KB"), $CODE, makeKeyword("NL"));

    static private final SubLList $list_alt188 = list(makeKeyword("ERROR"), $WARN, $NOTE);

    private static final SubLSymbol $KBI_SELECT_VAR = makeKeyword("KBI-SELECT-VAR");

    private static final SubLSymbol $KBI_CONCERN = makeKeyword("KBI-CONCERN");

    private static final SubLSymbol $KBI_CRITICALITY = makeKeyword("KBI-CRITICALITY");

    private static final SubLSymbol $KBI_LEVEL = makeKeyword("KBI-LEVEL");

    private static final SubLSymbol $KBI_DOC = makeKeyword("KBI-DOC");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_TEST_NAME = makeSymbol("CB-DIAGNOSE-CONSTANT-TEST-NAME");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_GET_NAME = makeSymbol("CB-DIAGNOSE-CONSTANT-GET-NAME");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_TEST_LEVEL = makeSymbol("CB-DIAGNOSE-CONSTANT-TEST-LEVEL");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_GET_LEVEL = makeSymbol("CB-DIAGNOSE-CONSTANT-GET-LEVEL");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_TEST_CRITICALITY = makeSymbol("CB-DIAGNOSE-CONSTANT-TEST-CRITICALITY");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_GET_CRITICALITY = makeSymbol("CB-DIAGNOSE-CONSTANT-GET-CRITICALITY");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_TEST_CONCERN = makeSymbol("CB-DIAGNOSE-CONSTANT-TEST-CONCERN");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_GET_CONCERN = makeSymbol("CB-DIAGNOSE-CONSTANT-GET-CONCERN");

    private static final SubLSymbol $CB_DIAGNOSE_CONSTANT = makeKeyword("CB-DIAGNOSE-CONSTANT");

    static private final SubLString $str_alt203$cb_diagnose_constant_html = makeString("cb-diagnose-constant.html");

    static private final SubLString $$$the_Constant_Diagnostics_page = makeString("the Constant Diagnostics page");

    static private final SubLString $$$Constant_Diagnostics = makeString("Constant Diagnostics");

    static private final SubLString $str_alt206$cb_diagnose_constant_handler = makeString("cb-diagnose-constant-handler");

    static private final SubLString $str_alt207$The_available_diagnostics_for_ = makeString("The available diagnostics for ");

    static private final SubLString $str_alt208$_are_listed_below___Please_select = makeString(" are listed below.  Please select the diagnostics you wish to execute and click on the [");

    static private final SubLString $str_alt209$__button_ = makeString("] button.");

    static private final SubLString $$$Current_Values = makeString("Current Values");

    static private final SubLString $$$Concerns = makeString("Concerns");

    static private final SubLString $$$Criticality = makeString("Criticality");

    static private final SubLString $$$Level = makeString("Level");

    static private final SubLString $$$Description_of_Diagnostic = makeString("Description of Diagnostic");

    static private final SubLString $str_alt215$___ = makeString(" : ");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT = makeSymbol("CB-DIAGNOSE-CONSTANT");

    static private final SubLString $$$Diagnostic_Results = makeString("Diagnostic Results");

    static private final SubLString $str_alt218$Executing_the_following_diagnosti = makeString("Executing the following diagnostic programs on the constant ");

    static private final SubLString $str_alt219$_ = makeString(":");

    static private final SubLString $str_alt220$_Please_be_patient_as_this_may_ta = makeString("(Please be patient as this may take a while.)");

    static private final SubLString $str_alt221$Tests_complete__ = makeString("Tests complete. ");

    static private final SubLString $str_alt222$The_following_errors_were_found_ = makeString("The following errors were found:");

    static private final SubLString $str_alt223$No_errors_were_found_ = makeString("No errors were found!");

    private static final SubLSymbol CB_DIAGNOSE_CONSTANT_HANDLER = makeSymbol("CB-DIAGNOSE-CONSTANT-HANDLER");

    static private final SubLString $str_alt225$_Diagnose_ = makeString("[Diagnose]");

    static private final SubLString $str_alt226$cb_diagnose_constant__A = makeString("cb-diagnose-constant&~A");

    private static final SubLSymbol CB_LINK_DIAGNOSE_CONSTANT = makeSymbol("CB-LINK-DIAGNOSE-CONSTANT");

    static private final SubLString $str_alt231$cb_hypothesize_handler_html = makeString("cb-hypothesize-handler.html");

    static private final SubLString $str_alt233$cb_hypothesize_handler = makeString("cb-hypothesize-handler");

    static private final SubLList $list_alt235 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TEN_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    static private final SubLList $list_alt237 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    static private final SubLString $str_alt238$Last_hypothesis_in_ = makeString("Last hypothesis in ");

    static private final SubLString $str_alt240$Error_description__ = makeString("Error description: ");

    static private final SubLString $str_alt241$Hypothesis_results___ = makeString("Hypothesis results : ");
}

/**
 * Total time: 2602 ms
 */
