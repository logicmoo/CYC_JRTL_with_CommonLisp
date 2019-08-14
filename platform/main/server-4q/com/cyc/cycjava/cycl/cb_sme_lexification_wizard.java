/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.create_multiple_selection_listbox;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_create_radiobox_form;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input_values;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_string;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 * module:      CB-SME-LEXIFICATION-WIZARD
 * source file: /cyc/top/cycl/cb-sme-lexification-wizard.lisp
 * created:     2019/07/03 17:38:23
 */
public final class cb_sme_lexification_wizard extends SubLTranslatedFile implements V12 {
    /**
     * Creates initial HTML page for SME lexification wizard, optionally using the lexification settings from the object associated with the :ID hidden value in ARGS
     *
     * @unknown The fields are initialized from @xref *lexwiz-defaults*, which can be shadowed to specify the term and phrase @see display-lex-todo.
     * @unknown isolate common parts shared with @xref invoke-sme-lexification-wizard
     */
    @LispMethod(comment = "Creates initial HTML page for SME lexification wizard, optionally using the lexification settings from the object associated with the :ID hidden value in ARGS\r\n\r\n@unknown The fields are initialized from @xref *lexwiz-defaults*, which can be shadowed to specify the term and phrase @see display-lex-todo.\r\n@unknown isolate common parts shared with @xref invoke-sme-lexification-wizard")
    public static final SubLObject invoke_sme_lexification_wizard(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Dictionary_Assistant);
                return NIL;
            }
            lexification_wizard.$sme_lexwiz_active$.setDynamicValue(T, thread);
            lexification_wizard.init_lexification_wizard(UNPROVIDED);
            {
                SubLObject old_id = html_extract_input($str_alt64$_id, args);
                SubLObject old_object = lexification_wizard.get_lexification_object(old_id);
                SubLObject default_params = (NIL != old_object) ? ((SubLObject) (lexification_wizard.copy_lexification_parameters(old_object))) : lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
                SubLObject id = lexification_wizard.new_lexification_id();
                SubLObject lex_term = lexification_utilities.string_for_field(lexification_wizard.lexwiz_term(default_params));
                SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
                SubLObject lex_phrase = lexification_utilities.string_for_field(lexification_wizard.lexwiz_phrase(default_params));
                lexification_wizard.trace_lexification_parameters(default_params, UNPROVIDED);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(sme_lexification_wizard.lexwiz_title());
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_value));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(sme_lexification_wizard.lexwiz_title());
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
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
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_hidden_input($str_alt65$handle_sme_lexification_wizard, T, UNPROVIDED);
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(FOUR_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            cb_help_preamble($SME_LEXWIZ, UNPROVIDED, UNPROVIDED);
                                            html_princ($str_alt66$_Specify_the_term_and_phrase_for_);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(FOUR_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            lexification_wizard.set_lexification_object(id, default_params);
                                            html_hidden_input($str_alt64$_id, id, UNPROVIDED);
                                            html_complete.html_complete_button($str_alt67$_cyc_term, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_indent(ONE_INTEGER);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($str_alt69$Term__);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_indent(ONE_INTEGER);
                                            html_text_input($str_alt67$_cyc_term, lex_term, $int$50);
                                            html_indent(ONE_INTEGER);
                                            html_script_utilities.html_clear_input_button($str_alt67$_cyc_term, $$$Clear_Term);
                                            if ((NIL == cyc_term) && (string_utilities.char_at(lex_term, ZERO_INTEGER) == CHAR_lparen)) {
                                                html_checkbox_input($str_alt72$_create_term, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_indent(ONE_INTEGER);
                                                html_princ($str_alt73$Create_Term_);
                                            }
                                            html_newline(UNPROVIDED);
                                            {
                                                SubLObject phrase_label = $str_alt74$Phrase__;
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ(phrase_label);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_indent(ONE_INTEGER);
                                                html_text_input($str_alt75$_phrase, lex_phrase, $int$60);
                                                html_indent(ONE_INTEGER);
                                                html_script_utilities.html_clear_input_button($str_alt75$_phrase, $$$Clear_Phrase);
                                                html_newline(UNPROVIDED);
                                            }
                                            if (NIL != lexification_wizard.lexwiz_error_message(default_params)) {
                                                html_newline(UNPROVIDED);
                                                {
                                                    SubLObject color_val = $RED;
                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (NIL != color_val) {
                                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_color(color_val));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ($str_alt78$Error__);
                                                            html_indent(ONE_INTEGER);
                                                            html_princ(lexification_wizard.lexwiz_error_message(default_params));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                                html_newline(TWO_INTEGER);
                                            }
                                            html_submit_input($$$Reset, $str_alt80$_reset, UNPROVIDED);
                                            html_submit_input($$$OK, $str_alt54$_ok, UNPROVIDED);
                                            html_indent($int$30);
                                            if ((NIL != lexification_utilities.lex_empty_stringP(lex_term)) && (NIL != lexification_reminders.lexification_user_actions(UNPROVIDED))) {
                                                html_submit_input($$$Next_Lexification, $str_alt83$_next_action, UNPROVIDED);
                                            }
                                            if (NIL != lexification_wizard.lexwiz_user_action(default_params)) {
                                                html_submit_input($$$Skip_Lexification, $str_alt85$_skip_action, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$_Reason__optional___);
                                                html_text_input($str_alt87$_comment, $str_alt88$, $int$40);
                                            }
                                            html_newline(UNPROVIDED);
                                            if (NIL != $sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                                                html_newline(UNPROVIDED);
                                                html_princ($str_alt60$Tip_);
                                                html_newline(TWO_INTEGER);
                                                html_markup(com.cyc.cycjava.cycl.cb_sme_lexification_wizard.html_encode_text(sme_lexification_wizard.phrase_specification_tip()));
                                                html_newline(UNPROVIDED);
                                            }
                                            if ((NIL != cyc_term) && (NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue())) {
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                cb_browser.cb_print_documentation_information(cyc_term, T);
                                                html_newline(UNPROVIDED);
                                                cb_browser.cb_print_definitional_information(cyc_term);
                                                html_newline(UNPROVIDED);
                                                cb_lexical_info.cb_print_lexical_information(cyc_term, UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                            }
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
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
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return T;
        }
    }

    /**
     * Handle the SME lexification front-end HTML form @see :sme-lexification-wizard.
     * This simply invokes the SME tool proper for performing the lexification.
     *
     * @unknown After the SME tool proper is finished, the front-end form will be displayed again.
    When HTML is used for both, special coordination is needed to ensure proper sequencing.
     */
    @LispMethod(comment = "Handle the SME lexification front-end HTML form @see :sme-lexification-wizard.\r\nThis simply invokes the SME tool proper for performing the lexification.\r\n\r\n@unknown After the SME tool proper is finished, the front-end form will be displayed again.\r\nWhen HTML is used for both, special coordination is needed to ensure proper sequencing.\nHandle the SME lexification front-end HTML form @see :sme-lexification-wizard.\nThis simply invokes the SME tool proper for performing the lexification.")
    public static final SubLObject handle_sme_lexification_wizard(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = html_extract_input($str_alt64$_id, args);
                SubLObject default_params = lexification_wizard.get_lexification_object(id);
                SubLObject lex_term = html_extract_input($str_alt67$_cyc_term, args);
                SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
                SubLObject create_termP = html_extract_input($str_alt72$_create_term, args);
                SubLObject is_relational_termP = lexification_utilities.is_relationalP(cyc_term);
                SubLObject lex_mt = (NIL != is_relational_termP) ? ((SubLObject) (lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread))) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
                SubLObject mt = lexification_utilities.lex_fort_for_string(lex_mt);
                SubLObject lex_phrase = html_extract_string($str_alt75$_phrase, args, UNPROVIDED);
                SubLObject resetP = html_extract_input($str_alt80$_reset, args);
                SubLObject next_actionP = html_extract_input($str_alt83$_next_action, args);
                SubLObject skip_actionP = html_extract_input($str_alt85$_skip_action, args);
                SubLObject re_invoke = NIL;
                lexification_wizard._csetf_lexwiz_error_message(default_params, NIL);
                if (NIL != resetP) {
                    sme_lexification_wizard.reset_sme_lexification_parameters();
                    return com.cyc.cycjava.cycl.cb_sme_lexification_wizard.invoke_sme_lexification_wizard(UNPROVIDED);
                }
                if (NIL != next_actionP) {
                    return lexification_reminders.lexify_next_user_action(UNPROVIDED);
                }
                if (NIL != skip_actionP) {
                    lexification_reminders.remove_lexification_user_action(default_params, lexification_wizard.lexwiz_user_action(default_params));
                    {
                        SubLObject result = lexification_reminders.lexify_next_user_action(UNPROVIDED);
                        return NIL != result ? ((SubLObject) (result)) : com.cyc.cycjava.cycl.cb_sme_lexification_wizard.invoke_sme_lexification_wizard(UNPROVIDED);
                    }
                }
                if (NIL != create_termP) {
                    cyc_term = misc_kb_utilities.find_or_create_nart_from_text(lex_term);
                }
                if (NIL != sme_lexification_wizard.$verify_beforehandP$.getGlobalValue()) {
                    if (NIL == forts.fort_p(cyc_term)) {
                        lexification_wizard._csetf_lexwiz_error_message(default_params, $$$Please_specify_a_valid_term);
                    }
                    if (NIL == string_utilities.non_empty_stringP(lex_phrase)) {
                        lexification_wizard._csetf_lexwiz_error_message(default_params, $$$Please_specify_a_phrase);
                    }
                }
                if (NIL != lexification_wizard.lexwiz_error_message(default_params)) {
                    re_invoke = T;
                    lexification_wizard._csetf_lexwiz_term(default_params, lex_term);
                    lexification_wizard._csetf_lexwiz_phrase(default_params, lex_phrase);
                    lexification_wizard._csetf_lexwiz_mt(default_params, lex_mt);
                } else {
                    {
                        SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
                        instances.set_slot(sme_lexwiz, LEXWIZ_PARAMETERS, lexification_wizard.copy_lexification_parameters(default_params));
                        methods.funcall_instance_method_with_3_args(sme_lexwiz, LEXIFY, cyc_term, lex_phrase, mt);
                        sme_lexification_wizard.reset_sme_lexification_parameters();
                    }
                }
                return NIL != re_invoke ? ((SubLObject) (com.cyc.cycjava.cycl.cb_sme_lexification_wizard.invoke_sme_lexification_wizard(args))) : NIL;
            }
        }
    }

    static private final SubLString $str_alt88$ = makeString("");

    public static final SubLFile me = new cb_sme_lexification_wizard();

 public static final String myName = "com.cyc.cycjava.cycl.cb_sme_lexification_wizard";




    // defconstant
    @LispMethod(comment = "HTML markup to be used in place of tab characters\ndefconstant")
    private static final SubLSymbol $html_tab_expansion$ = makeSymbol("*HTML-TAB-EXPANSION*");

    // deflexical
    @LispMethod(comment = "Maximum size in lines of listboxes for SME lexification\ndeflexical")
    private static final SubLSymbol $max_sme_listbox_size$ = makeSymbol("*MAX-SME-LISTBOX-SIZE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sme_lexwiz_verboseP$ = makeSymbol("*SME-LEXWIZ-VERBOSE?*");

    static private final SubLString $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb = makeString("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT = makeSymbol("HTML-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT = makeSymbol("QUESTION-ANSWERING-AGENT");

    static private final SubLList $list4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-PREAMBLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-PROPER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-TRAILER"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS");

    private static final SubLSymbol USER_DATA = makeSymbol("USER-DATA");

    private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE");

    static private final SubLList $list29 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list30 = list(list(makeSymbol("HTML-DOCUMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DISPLAY-QUESTION-PREAMBLE"))), list(makeSymbol("CB-BASIC-FORM-HANDLER"), list(makeString("handle-html-question-answering")), list(makeSymbol("DISPLAY-QUESTION-PROPER"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DISPLAY-QUESTION-TRAILER"))), list(RET, NIL)));

    private static final SubLString $str31$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str32$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol DISPLAY_QUESTION_PREAMBLE = makeSymbol("DISPLAY-QUESTION-PREAMBLE");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str36$handle_html_question_answering = makeString("handle-html-question-answering");

    private static final SubLSymbol DISPLAY_QUESTION_TRAILER = makeSymbol("DISPLAY-QUESTION-TRAILER");

    private static final SubLSymbol $sym38$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");

    private static final SubLList $list40 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TITLE"), list(makeSymbol("SME-LEXWIZ-TITLE")))), list(makeSymbol("HTML-HEAD"), list(makeSymbol("HTML-TITLE"), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")))), list(makeSymbol("HTML-HEADING"), list(TWO_INTEGER), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")))), list(makeSymbol("HTML-HEADING"), list(FOUR_INTEGER), list(makeSymbol("CB-HELP-PREAMBLE"), makeKeyword("SME-LEXWIZ")), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER)), list(RET, NIL));

    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD = makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD");

    private static final SubLList $list44 = list(list(makeSymbol("HTML-COPYRIGHT-NOTICE")), list(RET, NIL));

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD = makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD");

    private static final SubLSymbol DISPLAY_QUESTION_PROPER = makeSymbol("DISPLAY-QUESTION-PROPER");

    private static final SubLList $list47 = list(new SubLObject[]{ list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("HTML-FONT-COLOR"), list(makeKeyword("RED")), list(makeSymbol("HTML-PRINC"), makeString("Error: ")), list(makeSymbol("HTML-INDENT"), ONE_INTEGER), list(makeSymbol("HTML-PRINC"), makeSymbol("ERROR-MESSAGE")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER))), list(makeSymbol("HTML-MARKUP"), list(makeSymbol("HTML-ENCODE-TEXT"), makeSymbol("QUESTION"))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":object-id"), makeSymbol("ID")), list(makeSymbol("SET-OBJECT-DATA"), makeSymbol("ID"), makeSymbol("SELF")), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":positive-choice"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("HTML-SUBMIT-INPUT"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")), makeString(":yes")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":negative-choice"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("HTML-SUBMIT-INPUT"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF")), makeString(":no"))), list(makeKeyword("ENUMERATED"), list(makeSymbol("CLET"), list(list(makeSymbol("LISTBOX-SIZE"), list(makeSymbol("MIN"), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("PWHEN"), makeSymbol("CHOICES"), list(makeSymbol("IGNORE"), makeSymbol("LISTBOX-SIZE")), list(makeSymbol("HTML-CREATE-RADIOBOX-FORM"), makeString(":response"), makeSymbol("CHOICES"), makeSymbol("VALUES"), makeSymbol("DEFAULT")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("OK"), makeString(":ok")))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("LISTBOX-SIZE"), list(makeSymbol("MIN"), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("CREATE-MULTIPLE-SELECTION-LISTBOX"), makeString(":response"), makeSymbol("CHOICES"), makeSymbol("VALUES"), makeSymbol("LISTBOX-SIZE"), makeSymbol("DEFAULT")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok")))), list(makeKeyword("FREE-FORM"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-TEXT-INPUT"), makeString(":response"), makeSymbol("DEFAULT"), makeSymbol("FIELD-WIDTH")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok"))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-TABLE"), list(ZERO_INTEGER), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LABEL"), makeSymbol("I"), makeSymbol("FIELD-LABELS")), list(makeSymbol("CLET"), list(list(makeSymbol("DEFAULT-VALUE"), list(makeSymbol("ELT"), makeSymbol("DEFAULT"), makeSymbol("I"))), list(makeSymbol("OPTIONAL-DESCRIPTION"), list(makeSymbol("ELT"), makeSymbol("DESCRIPTIONS"), makeSymbol("I")))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-FORMAT"), makeString("~a: "), makeSymbol("LABEL"))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-TEXT-INPUT"), makeString(":response"), makeSymbol("DEFAULT-VALUE"), makeSymbol("FIELD-WIDTH"))), list(makeSymbol("PWHEN"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("OPTIONAL-DESCRIPTION")), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-PRINC"), makeSymbol("OPTIONAL-DESCRIPTION")))))))), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TIP"), makeSymbol("*SME-LEXWIZ-VERBOSE?*")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-PRINC"), makeString("Tip:")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-MARKUP"), list(makeSymbol("HTML-ENCODE-TEXT"), makeSymbol("TIP"))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER)), list(makeSymbol("CLET"), list(list(makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("USER-DATA"))), list(makeSymbol("LEX-ASSERTION"), list(EQ, list(makeSymbol("TYPE-OF"), makeSymbol("LEXWIZ-PARAMETERS")), list(QUOTE, makeSymbol("LEXIFICATION-PARAMETERS")))), list(makeSymbol("ADD-OE-LEXIFICATION-LINK"), list(makeSymbol("LEXWIZ-ID"), makeSymbol("LEXWIZ-PARAMETERS")))), list(RET, NIL) });

    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLString $str50$Error__ = makeString("Error: ");

    private static final SubLString $str51$_object_id = makeString(":object-id");

    private static final SubLString $str53$_positive_choice = makeString(":positive-choice");

    private static final SubLString $str54$_yes = makeString(":yes");

    private static final SubLString $str55$_negative_choice = makeString(":negative-choice");

    private static final SubLString $str56$_no = makeString(":no");

    private static final SubLString $str58$_response = makeString(":response");

    private static final SubLString $$$OK = makeString("OK");

    private static final SubLString $str60$_ok = makeString(":ok");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol $MULTIPLE_FREE_FORM = makeKeyword("MULTIPLE-FREE-FORM");

    private static final SubLString $str65$_a__ = makeString("~a: ");

    private static final SubLString $str66$Tip_ = makeString("Tip:");

    private static final SubLSymbol LEXIFICATION_PARAMETERS = makeSymbol("LEXIFICATION-PARAMETERS");

    private static final SubLString $str68$Warning__ = makeString("Warning: ");

    private static final SubLString $str69$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLList $list70 = list(EQ, list(makeSymbol("TYPE-OF"), makeSymbol("LEXWIZ-PARAMETERS")), list(QUOTE, makeSymbol("LEXIFICATION-PARAMETERS")));

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD");

    private static final SubLString $str72$sme_lexwiz_html = makeString("sme-lexwiz.html");

    private static final SubLString $str73$the__A = makeString("the ~A");

    private static final SubLString $str74$_id = makeString(":id");

    private static final SubLString $str75$cb_handle_sme_lexification_wizard = makeString("cb-handle-sme-lexification-wizard");

    private static final SubLString $str76$_Specify_the_term_and_phrase_for_ = makeString(" Specify the term and phrase for the lexical mapping");

    private static final SubLString $str77$_cyc_term = makeString(":cyc-term");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $str79$Term__ = makeString("Term :");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $$$Clear_Term = makeString("Clear Term");

    private static final SubLString $str82$_create_term = makeString(":create-term");

    private static final SubLString $str83$Create_Term_ = makeString("Create Term?");

    private static final SubLString $str84$Phrase__ = makeString("Phrase :");

    private static final SubLString $str85$_phrase = makeString(":phrase");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$Clear_Phrase = makeString("Clear Phrase");

    private static final SubLString $str88$Error__ = makeString("Error :");

    private static final SubLString $$$Reset = makeString("Reset");

    private static final SubLString $str90$_reset = makeString(":reset");



    private static final SubLString $$$Next_Lexification = makeString("Next Lexification");

    private static final SubLString $str93$_next_action = makeString(":next-action");

    private static final SubLString $$$Skip_Lexification = makeString("Skip Lexification");

    private static final SubLString $str95$_skip_action = makeString(":skip-action");

    private static final SubLString $str96$_Reason__optional___ = makeString(" Reason (optional): ");

    private static final SubLString $str97$_comment = makeString(":comment");

    private static final SubLString $str98$ = makeString("");



    private static final SubLSymbol CB_INVOKE_SME_LEXIFICATION_WIZARD = makeSymbol("CB-INVOKE-SME-LEXIFICATION-WIZARD");

    private static final SubLString $str102$_Invoke_Lexification_Assistant_ = makeString("[Invoke Lexification Assistant]");

    private static final SubLString $str103$Note__For_more_control_over_the_l = makeString("Note: For more control over the lexification, switch to the OE lexifier: ");

    private static final SubLSymbol $OE_LEXIFY_TERM = makeKeyword("OE-LEXIFY-TERM");

    private static final SubLString $str105$sme_lexification_wizard = makeString("sme-lexification-wizard");

    private static final SubLString $str107$cb_invoke_sme_lexification_wizard = makeString("cb-invoke-sme-lexification-wizard");

    private static final SubLSymbol $SME_LEXIFICATION_WIZARD = makeKeyword("SME-LEXIFICATION-WIZARD");

    private static final SubLSymbol CB_LINK_SME_LEXIFICATION_WIZARD = makeSymbol("CB-LINK-SME-LEXIFICATION-WIZARD");

    private static final SubLString $$$SmeLex = makeString("SmeLex");

    private static final SubLString $str111$Perform_lexification_with_SME_lex = makeString("Perform lexification with SME lexwiz tool");

    private static final SubLString $$$Please_specify_a_valid_term = makeString("Please specify a valid term");

    private static final SubLString $$$Please_specify_a_phrase = makeString("Please specify a phrase");

    private static final SubLSymbol CB_HANDLE_SME_LEXIFICATION_WIZARD = makeSymbol("CB-HANDLE-SME-LEXIFICATION-WIZARD");

    private static final SubLList $list119 = list(makeKeyword("MULTIPLE-SELECTION"), makeKeyword("MULTIPLE-FREE-FORM"));

    private static final SubLString $str122$Unable_to_resolve_question_into_u = makeString("Unable to resolve question into underlying object");

    private static final SubLSymbol HANDLE_HTML_QUESTION_ANSWERING = makeSymbol("HANDLE-HTML-QUESTION-ANSWERING");

    private static final SubLString $str124$_br_ = makeString("<br>");

    private static final SubLList $list125 = cons(makeSymbol("OLD-CHAR"), makeSymbol("NEW"));

    public static final SubLObject subloop_reserved_initialize_html_question_answering_agent_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_html_question_answering_agent_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, USER_DATA, NIL);
        return NIL;
    }

    public static final SubLObject html_question_answering_agent_p_alt(SubLObject html_question_answering_agent) {
        return classes.subloop_instanceof_class(html_question_answering_agent, HTML_QUESTION_ANSWERING_AGENT);
    }

    public static SubLObject html_question_answering_agent_p(final SubLObject html_question_answering_agent) {
        return classes.subloop_instanceof_class(html_question_answering_agent, HTML_QUESTION_ANSWERING_AGENT);
    }

    public static final SubLObject html_question_answering_agent_display_question_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            methods.funcall_instance_method_with_0_args(self, DISPLAY_QUESTION_PREAMBLE);
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str_alt31$handle_html_question_answering, T, UNPROVIDED);
                        com.cyc.cycjava.cycl.cb_sme_lexification_wizard.html_question_answering_agent_display_question_proper_method(self);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            methods.funcall_instance_method_with_0_args(self, DISPLAY_QUESTION_TRAILER);
            return NIL;
        }
    }

    public static SubLObject html_question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str32$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            methods.funcall_instance_method_with_0_args(self, DISPLAY_QUESTION_PREAMBLE);
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
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_hidden_input($str36$handle_html_question_answering, T, UNPROVIDED);
                html_question_answering_agent_display_question_proper_method(self);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
            methods.funcall_instance_method_with_0_args(self, DISPLAY_QUESTION_TRAILER);
            return NIL;
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject html_question_answering_agent_display_question_preamble_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_html_question_answering_agent_method = NIL;
            SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
            try {
                try {
                    {
                        SubLObject title_1 = sme_lexification_wizard.lexwiz_title();
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_1);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ(title_1);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_help_preamble($SME_LEXWIZ, UNPROVIDED, UNPROVIDED);
                    html_princ(title);
                    html_newline(TWO_INTEGER);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    sublisp_throw($sym35$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            sme_lexification_wizard.set_question_answering_agent_title(self, title);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
            }
            return catch_var_for_html_question_answering_agent_method;
        }
    }

    public static SubLObject html_question_answering_agent_display_question_preamble_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_question_answering_agent_method = NIL;
        final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject title_$2 = sme_lexification_wizard.sme_lexwiz_title();
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title_$2);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ(title_$2);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(FOUR_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                cb_help_preamble($SME_LEXWIZ, UNPROVIDED, UNPROVIDED);
                html_princ(title);
                html_newline(TWO_INTEGER);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(FOUR_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                sublisp_throw($sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_title(self, title);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_question_answering_agent_method;
    }

    public static final SubLObject html_question_answering_agent_display_question_trailer_method_alt(SubLObject self) {
        html_copyright_notice();
        return NIL;
    }

    public static SubLObject html_question_answering_agent_display_question_trailer_method(final SubLObject self) {
        html_copyright_notice();
        return NIL;
    }

    public static final SubLObject html_question_answering_agent_display_question_proper_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_question_answering_agent_method = NIL;
                SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels(self);
                SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width(self);
                SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default(self);
                SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
                SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions(self);
                SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
                SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
                SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
                SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
                SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
                SubLObject id = sme_lexification_wizard.get_question_answering_agent_id(self);
                try {
                    try {
                        if (NIL != error_message) {
                            {
                                SubLObject color_val = $RED;
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != color_val) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(color_val));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str_alt44$Error__);
                                        html_indent(ONE_INTEGER);
                                        html_princ(error_message);
                                        html_newline(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        }
                        html_markup(com.cyc.cycjava.cycl.cb_sme_lexification_wizard.html_encode_text(v_question));
                        html_newline(UNPROVIDED);
                        html_hidden_input($str_alt45$_object_id, id, UNPROVIDED);
                        sme_lexification_wizard.set_object_data(id, self);
                        {
                            SubLObject pcase_var = question_type;
                            if (pcase_var.eql($BOOLEAN)) {
                                html_newline(UNPROVIDED);
                                html_hidden_input($str_alt47$_positive_choice, sme_lexification_wizard.question_answering_agent_positive_choice_method(self), UNPROVIDED);
                                html_submit_input(sme_lexification_wizard.question_answering_agent_positive_choice_method(self), $str_alt48$_yes, UNPROVIDED);
                                html_hidden_input($str_alt49$_negative_choice, sme_lexification_wizard.question_answering_agent_negative_choice_method(self), UNPROVIDED);
                                html_submit_input(sme_lexification_wizard.question_answering_agent_negative_choice_method(self), $str_alt50$_no, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($ENUMERATED)) {
                                    {
                                        SubLObject listbox_size = min(length(choices), $max_sme_listbox_size$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        if (NIL != choices) {
                                            html_create_radiobox_form($str_alt52$_response, choices, values, v_default, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                        }
                                        html_submit_input($$$OK, $str_alt54$_ok, UNPROVIDED);
                                    }
                                } else {
                                    if (pcase_var.eql($MULTIPLE_SELECTION)) {
                                        {
                                            SubLObject listbox_size = min(length(choices), $max_sme_listbox_size$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                            create_multiple_selection_listbox($str_alt52$_response, choices, values, listbox_size, v_default);
                                            html_newline(UNPROVIDED);
                                            html_submit_input($$$Submit, $str_alt54$_ok, UNPROVIDED);
                                        }
                                    } else {
                                        if (pcase_var.eql($FREE_FORM)) {
                                            html_newline(UNPROVIDED);
                                            html_text_input($str_alt52$_response, v_default, field_width);
                                            html_submit_input($$$Submit, $str_alt54$_ok, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                                                html_newline(UNPROVIDED);
                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ZERO_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject label = NIL;
                                                            SubLObject i = NIL;
                                                            for (list_var = field_labels, label = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , label = list_var.first() , i = add(ONE_INTEGER, i)) {
                                                                {
                                                                    SubLObject default_value = elt(v_default, i);
                                                                    SubLObject optional_description = elt(descriptions, i);
                                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt59$_a__, label);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_text_input($str_alt52$_response, default_value, field_width);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            if (NIL != string_utilities.non_empty_stringP(optional_description)) {
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ(optional_description);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_submit_input($$$Submit, $str_alt54$_ok, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        html_newline(UNPROVIDED);
                        if ((NIL != tip) && (NIL != $sme_lexwiz_verboseP$.getDynamicValue(thread))) {
                            html_newline(TWO_INTEGER);
                            html_princ($str_alt60$Tip_);
                            html_newline(TWO_INTEGER);
                            html_markup(com.cyc.cycjava.cycl.cb_sme_lexification_wizard.html_encode_text(tip));
                            html_newline(TWO_INTEGER);
                        }
                        sublisp_throw($sym42$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                sme_lexification_wizard.set_question_answering_agent_field_labels(self, field_labels);
                                sme_lexification_wizard.set_question_answering_agent_field_width(self, field_width);
                                sme_lexification_wizard.set_question_answering_agent_default(self, v_default);
                                sme_lexification_wizard.set_question_answering_agent_values(self, values);
                                sme_lexification_wizard.set_question_answering_agent_descriptions(self, descriptions);
                                sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                                sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                                sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                                sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                                sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                                sme_lexification_wizard.set_question_answering_agent_id(self, id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
                }
                return catch_var_for_html_question_answering_agent_method;
            }
        }
    }

    public static SubLObject html_question_answering_agent_display_question_proper_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_question_answering_agent_method = NIL;
        final SubLObject user_data = sme_lexification_wizard.get_question_answering_agent_user_data(self);
        final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels(self);
        final SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width(self);
        final SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default(self);
        final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
        final SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject id = sme_lexification_wizard.get_question_answering_agent_id(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                if (NIL != error_message) {
                    final SubLObject color_val = $RED;
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str50$Error__);
                        html_indent(ONE_INTEGER);
                        html_princ(error_message);
                        html_newline(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_markup(html_encode_text(v_question));
                html_newline(UNPROVIDED);
                html_hidden_input($str51$_object_id, id, UNPROVIDED);
                sme_lexification_wizard.set_object_data(id, self);
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql($BOOLEAN)) {
                    html_newline(UNPROVIDED);
                    html_hidden_input($str53$_positive_choice, sme_lexification_wizard.question_answering_agent_positive_choice_method(self), UNPROVIDED);
                    html_submit_input(sme_lexification_wizard.question_answering_agent_positive_choice_method(self), $str54$_yes, UNPROVIDED);
                    html_hidden_input($str55$_negative_choice, sme_lexification_wizard.question_answering_agent_negative_choice_method(self), UNPROVIDED);
                    html_submit_input(sme_lexification_wizard.question_answering_agent_negative_choice_method(self), $str56$_no, UNPROVIDED);
                } else
                    if (pcase_var.eql($ENUMERATED)) {
                        final SubLObject listbox_size = min(length(choices), $max_sme_listbox_size$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        if (NIL != choices) {
                            html_create_radiobox_form($str58$_response, choices, values, v_default, UNPROVIDED);
                            html_newline(UNPROVIDED);
                        }
                        html_submit_input($$$OK, $str60$_ok, UNPROVIDED);
                    } else
                        if (pcase_var.eql($MULTIPLE_SELECTION)) {
                            final SubLObject listbox_size = min(length(choices), $max_sme_listbox_size$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            create_multiple_selection_listbox($str58$_response, choices, values, listbox_size, v_default);
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Submit, $str60$_ok, UNPROVIDED);
                        } else
                            if (pcase_var.eql($FREE_FORM)) {
                                html_newline(UNPROVIDED);
                                html_text_input($str58$_response, v_default, field_width);
                                html_submit_input($$$Submit, $str60$_ok, UNPROVIDED);
                            } else
                                if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ZERO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject list_var = NIL;
                                        SubLObject label = NIL;
                                        SubLObject i = NIL;
                                        list_var = field_labels;
                                        label = list_var.first();
                                        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , label = list_var.first() , i = add(ONE_INTEGER, i)) {
                                            final SubLObject default_value = elt(v_default, i);
                                            final SubLObject optional_description = elt(descriptions, i);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str65$_a__, label);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_text_input($str58$_response, default_value, field_width);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL != string_utilities.non_empty_stringP(optional_description)) {
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ(optional_description);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_submit_input($$$Submit, $str60$_ok, UNPROVIDED);
                                }




                html_newline(UNPROVIDED);
                if ((NIL != tip) && (NIL != $sme_lexwiz_verboseP$.getDynamicValue(thread))) {
                    html_newline(TWO_INTEGER);
                    html_princ($str66$Tip_);
                    html_newline(TWO_INTEGER);
                    html_markup(html_encode_text(tip));
                    html_newline(TWO_INTEGER);
                }
                final SubLObject lexwiz_parameters = user_data;
                if ((type_of(lexwiz_parameters) != LEXIFICATION_PARAMETERS) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str68$Warning__, $str69$____assertion_failed___a______), $list70);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                add_oe_lexification_link(lexification_wizard.lexwiz_id(lexwiz_parameters));
                sublisp_throw($sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_user_data(self, user_data);
                    sme_lexification_wizard.set_question_answering_agent_field_labels(self, field_labels);
                    sme_lexification_wizard.set_question_answering_agent_field_width(self, field_width);
                    sme_lexification_wizard.set_question_answering_agent_default(self, v_default);
                    sme_lexification_wizard.set_question_answering_agent_values(self, values);
                    sme_lexification_wizard.set_question_answering_agent_descriptions(self, descriptions);
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                    sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                    sme_lexification_wizard.set_question_answering_agent_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_question_answering_agent_method;
    }

    public static SubLObject cb_invoke_sme_lexification_wizard(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn(format(NIL, $str73$the__A, sme_lexification_wizard.sme_lexwiz_title()));
            return NIL;
        }
        lexification_wizard.$sme_lexwiz_active$.setDynamicValue(T, thread);
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        final SubLObject old_id = html_extract_input($str74$_id, args);
        final SubLObject old_object = lexification_wizard.get_lexification_object(old_id);
        final SubLObject default_params = (NIL != old_object) ? lexification_wizard.copy_lexification_parameters(old_object) : lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
        final SubLObject id = lexification_wizard.lexwiz_id(default_params);
        final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(default_params));
        final SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
        final SubLObject lex_phrase = lexification_utilities.string_for_field(lexification_wizard.lexwiz_phrase(default_params));
        lexification_wizard.trace_lexification_parameters(default_params, UNPROVIDED);
        html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str32$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(sme_lexification_wizard.sme_lexwiz_title());
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ(sme_lexification_wizard.sme_lexwiz_title());
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
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
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str75$cb_handle_sme_lexification_wizard, T, UNPROVIDED);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_help_preamble($SME_LEXWIZ, UNPROVIDED, UNPROVIDED);
                        html_princ($str76$_Specify_the_term_and_phrase_for_);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_hidden_input($str74$_id, id, UNPROVIDED);
                        html_complete.html_complete_button($str77$_cyc_term, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(ONE_INTEGER);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str79$Term__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_indent(ONE_INTEGER);
                        html_text_input($str77$_cyc_term, lex_term, $int$50);
                        html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button($str77$_cyc_term, $$$Clear_Term, UNPROVIDED);
                        if ((NIL == cyc_term) && string_utilities.char_at(lex_term, ZERO_INTEGER).eql(CHAR_lparen)) {
                            html_checkbox_input($str82$_create_term, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(ONE_INTEGER);
                            html_princ($str83$Create_Term_);
                        }
                        html_newline(UNPROVIDED);
                        final SubLObject phrase_label = $str84$Phrase__;
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ(phrase_label);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_indent(ONE_INTEGER);
                        html_text_input($str85$_phrase, lex_phrase, $int$60);
                        html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button($str85$_phrase, $$$Clear_Phrase, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        if (NIL != lexification_wizard.lexwiz_error_message(default_params)) {
                            html_newline(UNPROVIDED);
                            final SubLObject color_val = $RED;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str88$Error__);
                                html_indent(ONE_INTEGER);
                                html_princ(lexification_wizard.lexwiz_error_message(default_params));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                        }
                        html_submit_input($$$Reset, $str90$_reset, UNPROVIDED);
                        html_submit_input($$$OK, $str60$_ok, UNPROVIDED);
                        html_indent($int$30);
                        if ((NIL != lexification_utilities.lex_empty_stringP(lex_term)) && (NIL != lexification_reminders.lexification_user_actions(UNPROVIDED))) {
                            html_submit_input($$$Next_Lexification, $str93$_next_action, UNPROVIDED);
                        }
                        if (NIL != lexification_wizard.lexwiz_user_action(default_params)) {
                            html_submit_input($$$Skip_Lexification, $str95$_skip_action, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str96$_Reason__optional___);
                            html_text_input($str97$_comment, $str98$, $int$40);
                        }
                        html_newline(UNPROVIDED);
                        if (NIL != $sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                            html_newline(UNPROVIDED);
                            html_princ($str66$Tip_);
                            html_newline(TWO_INTEGER);
                            html_markup(html_encode_text(sme_lexification_wizard.phrase_specification_tip()));
                            html_newline(UNPROVIDED);
                        }
                        add_oe_lexification_link(id);
                        if ((NIL != cyc_term) && (NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue())) {
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_browser.cb_print_documentation_information(cyc_term, T);
                            html_newline(UNPROVIDED);
                            cb_browser.cb_print_definitional_information(cyc_term);
                            html_newline(UNPROVIDED);
                            cb_lexical_info.cb_print_lexical_information(cyc_term, UNPROVIDED);
                            html_newline(UNPROVIDED);
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return T;
    }

    public static SubLObject add_oe_lexification_link(final SubLObject lexwiz_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = lexification_wizard.resolve_lexwiz_object_fort(lexwiz_id);
        final SubLObject lexifier_link_text = $str102$_Invoke_Lexification_Assistant_;
        if ((NIL == lexification_utilities.is_relationalP(fort)) || (NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread))) {
            html_newline(UNPROVIDED);
            html_princ($str103$Note__For_more_control_over_the_l);
            cb_link($OE_LEXIFY_TERM, lexwiz_id, lexifier_link_text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_link_sme_lexification_wizard_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt91$sme_lexification_wizard;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt93$invoke_sme_lexification_wizard);
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

    public static SubLObject cb_link_sme_lexification_wizard(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str105$sme_lexification_wizard;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str107$cb_invoke_sme_lexification_wizard);
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

    public static SubLObject cb_handle_sme_lexification_wizard(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_extract_input($str74$_id, args);
        final SubLObject default_params = lexification_wizard.get_lexification_object(id);
        final SubLObject lex_term = html_extract_input($str77$_cyc_term, args);
        SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
        final SubLObject create_termP = html_extract_input($str82$_create_term, args);
        final SubLObject is_relational_termP = lexification_utilities.is_relationalP(cyc_term);
        final SubLObject lex_mt = (NIL != is_relational_termP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
        final SubLObject mt = lexification_utilities.lex_fort_for_string(lex_mt);
        final SubLObject lex_phrase = html_extract_string($str85$_phrase, args, UNPROVIDED);
        final SubLObject resetP = html_extract_input($str90$_reset, args);
        final SubLObject next_actionP = html_extract_input($str93$_next_action, args);
        final SubLObject skip_actionP = html_extract_input($str95$_skip_action, args);
        SubLObject re_invoke = NIL;
        lexification_wizard._csetf_lexwiz_error_message(default_params, NIL);
        if (NIL != resetP) {
            sme_lexification_wizard.reset_sme_lexification_parameters();
            return cb_invoke_sme_lexification_wizard(UNPROVIDED);
        }
        if (NIL != next_actionP) {
            return lexification_reminders.lexify_next_user_action(UNPROVIDED);
        }
        if (NIL != skip_actionP) {
            lexification_reminders.remove_lexification_user_action(default_params, lexification_wizard.lexwiz_user_action(default_params));
            final SubLObject result = lexification_reminders.lexify_next_user_action(UNPROVIDED);
            return NIL != result ? result : cb_invoke_sme_lexification_wizard(UNPROVIDED);
        }
        if (NIL != create_termP) {
            cyc_term = misc_kb_utilities.find_or_create_nart_from_text(lex_term);
        }
        if (NIL != sme_lexification_wizard.$verify_beforehandP$.getGlobalValue()) {
            if (NIL == forts.fort_p(cyc_term)) {
                lexification_wizard._csetf_lexwiz_error_message(default_params, $$$Please_specify_a_valid_term);
            }
            if (NIL == string_utilities.non_empty_stringP(lex_phrase)) {
                lexification_wizard._csetf_lexwiz_error_message(default_params, $$$Please_specify_a_phrase);
            }
        }
        if (NIL != lexification_wizard.lexwiz_error_message(default_params)) {
            re_invoke = T;
            lexification_wizard._csetf_lexwiz_term(default_params, lex_term);
            lexification_wizard._csetf_lexwiz_phrase(default_params, lex_phrase);
            lexification_wizard._csetf_lexwiz_mt(default_params, lex_mt);
        } else {
            final SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
            instances.set_slot(sme_lexwiz, LEXWIZ_PARAMETERS, lexification_wizard.copy_lexification_parameters(default_params));
            methods.funcall_instance_method_with_3_args(sme_lexwiz, LEXIFY, cyc_term, lex_phrase, mt);
            sme_lexification_wizard.reset_sme_lexification_parameters();
        }
        return NIL != re_invoke ? cb_invoke_sme_lexification_wizard(args) : NIL;
    }

    /**
     * Interpret the user replies to the question from the HTML interface and proceed to the next state if OK
     *
     * @unknown This uses the ID from the hidden field to lookup the object instance for the current interaction
     */
    @LispMethod(comment = "Interpret the user replies to the question from the HTML interface and proceed to the next state if OK\r\n\r\n@unknown This uses the ID from the hidden field to lookup the object instance for the current interaction")
    public static final SubLObject handle_html_question_answering_alt(SubLObject args) {
        {
            SubLObject id = html_extract_input($str_alt45$_object_id, args);
            SubLObject html_question_object = sme_lexification_wizard.get_object_data(id);
            SubLObject response = html_extract_input_values($str_alt52$_response, args);
            SubLObject positive_choice = html_extract_input($str_alt47$_positive_choice, args);
            SubLObject negative_choice = html_extract_input($str_alt49$_negative_choice, args);
            SubLObject yesP = html_extract_input($str_alt48$_yes, args);
            SubLObject noP = html_extract_input($str_alt50$_no, args);
            sme_lexification_wizard.lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), html_question_object);
            if (NIL == subl_promotions.memberP(instances.get_slot(html_question_object, QUESTION_TYPE), $list_alt105, UNPROVIDED, UNPROVIDED)) {
                response = response.first();
            }
            if (NIL != yesP) {
                response = positive_choice;
            }
            if (NIL != noP) {
                response = negative_choice;
            }
            if (NIL != html_question_object) {
                instances.set_slot(html_question_object, ID, id);
                instances.set_slot(html_question_object, ANSWER, response);
                methods.funcall_instance_method_with_1_args(html_question_object, NOTIFY_CLIENT, $INPUT_READY);
            } else {
                com.cyc.cycjava.cycl.cb_sme_lexification_wizard.sme_lexwiz_error($str_alt108$Unable_to_resolve_question_into_u);
            }
            return NIL;
        }
    }

    /**
     * Interpret the user replies to the question from the HTML interface and proceed to the next state if OK
     *
     * @unknown This uses the ID from the hidden field to lookup the object instance for the current interaction
     */
    @LispMethod(comment = "Interpret the user replies to the question from the HTML interface and proceed to the next state if OK\r\n\r\n@unknown This uses the ID from the hidden field to lookup the object instance for the current interaction")
    public static SubLObject handle_html_question_answering(final SubLObject args) {
        final SubLObject id = html_extract_input($str51$_object_id, args);
        final SubLObject html_question_object = sme_lexification_wizard.get_object_data(id);
        SubLObject response = html_extract_input_values($str58$_response, args);
        final SubLObject positive_choice = html_extract_input($str53$_positive_choice, args);
        final SubLObject negative_choice = html_extract_input($str55$_negative_choice, args);
        final SubLObject yesP = html_extract_input($str54$_yes, args);
        final SubLObject noP = html_extract_input($str56$_no, args);
        sme_lexification_wizard.lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), html_question_object);
        if (NIL == subl_promotions.memberP(instances.get_slot(html_question_object, QUESTION_TYPE), $list119, UNPROVIDED, UNPROVIDED)) {
            response = response.first();
        }
        if (NIL != yesP) {
            response = positive_choice;
        }
        if (NIL != noP) {
            response = negative_choice;
        }
        if (NIL != html_question_object) {
            instances.set_slot(html_question_object, ID, id);
            instances.set_slot(html_question_object, ANSWER, response);
            methods.funcall_instance_method_with_1_args(html_question_object, NOTIFY_CLIENT, $INPUT_READY);
        } else {
            sme_lexwiz_error($str122$Unable_to_resolve_question_into_u);
        }
        return NIL;
    }

    /**
     * Displays the error message to the SME user
     */
    @LispMethod(comment = "Displays the error message to the SME user")
    public static final SubLObject sme_lexwiz_error_alt(SubLObject message) {
        if (NIL != sme_lexification_wizard.sme_lexwiz_use_blackboardP()) {
            Errors.warn(message);
        } else {
            cb_error(message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Displays the error message to the SME user
     */
    @LispMethod(comment = "Displays the error message to the SME user")
    public static SubLObject sme_lexwiz_error(final SubLObject message) {
        if (NIL != sme_lexification_wizard.sme_lexwiz_use_blackboardP()) {
            Errors.warn(message);
        } else {
            cb_error(message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return string ; the text with html encoding for any special characters and for whitespace
     * @unknown This is similar to @xref html-string except that the result is returned instead of printed
     * @unknown Apply better method for tab handling
     */
    @LispMethod(comment = "@return string ; the text with html encoding for any special characters and for whitespace\r\n@unknown This is similar to @xref html-string except that the result is returned instead of printed\r\n@unknown Apply better method for tab handling")
    public static final SubLObject html_encode_text_alt(SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hard_escapes = list(cons(CHAR_newline, $str_alt110$_br_), cons(CHAR_tab, $html_tab_expansion$.getGlobalValue()));
                SubLObject soft_escapes = html_macros.$html_escapes_map$.getDynamicValue(thread);
                SubLObject cdolist_list_var = append(soft_escapes, hard_escapes);
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject old_char = NIL;
                        SubLObject v_new = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt111);
                        old_char = current.first();
                        current = current.rest();
                        v_new = current;
                        {
                            SubLObject old = Strings.make_string(ONE_INTEGER, old_char);
                            text = string_utilities.string_substitute(v_new, old, text, UNPROVIDED);
                        }
                    }
                }
            }
            return text;
        }
    }

    /**
     *
     *
     * @return string ; the text with html encoding for any special characters and for whitespace
     * @unknown This is similar to @xref html-string except that the result is returned instead of printed
     * @unknown Apply better method for tab handling
     */
    @LispMethod(comment = "@return string ; the text with html encoding for any special characters and for whitespace\r\n@unknown This is similar to @xref html-string except that the result is returned instead of printed\r\n@unknown Apply better method for tab handling")
    public static SubLObject html_encode_text(SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hard_escapes = list(cons(CHAR_newline, $str124$_br_), cons(CHAR_tab, $html_tab_expansion$.getGlobalValue()));
        final SubLObject soft_escapes = html_macros.$html_escapes_map$.getDynamicValue(thread);
        SubLObject cdolist_list_var = append(soft_escapes, hard_escapes);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject old_char = NIL;
            SubLObject v_new = NIL;
            destructuring_bind_must_consp(current, datum, $list125);
            old_char = current.first();
            current = v_new = current.rest();
            final SubLObject old = Strings.make_string(ONE_INTEGER, old_char);
            text = string_utilities.string_substitute(v_new, old, text, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return text;
    }

    static private final SubLString $str_alt1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb = makeString("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

    public static final SubLObject declare_cb_sme_lexification_wizard_file_alt() {
        declareFunction("subloop_reserved_initialize_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction("html_question_answering_agent_p", "HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_preamble_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_trailer_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_proper_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
        declareFunction("invoke_sme_lexification_wizard", "INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("cb_link_sme_lexification_wizard", "CB-LINK-SME-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("handle_sme_lexification_wizard", "HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false);
        declareFunction("handle_html_question_answering", "HANDLE-HTML-QUESTION-ANSWERING", 1, 0, false);
        declareFunction("sme_lexwiz_error", "SME-LEXWIZ-ERROR", 1, 0, false);
        declareFunction("html_encode_text", "HTML-ENCODE-TEXT", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_sme_lexification_wizard_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("subloop_reserved_initialize_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
            declareFunction("html_question_answering_agent_p", "HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
            declareFunction("html_question_answering_agent_display_question_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
            declareFunction("html_question_answering_agent_display_question_preamble_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false);
            declareFunction("html_question_answering_agent_display_question_trailer_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false);
            declareFunction("html_question_answering_agent_display_question_proper_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
            declareFunction("cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false);
            declareFunction("add_oe_lexification_link", "ADD-OE-LEXIFICATION-LINK", 1, 0, false);
            declareFunction("cb_link_sme_lexification_wizard", "CB-LINK-SME-LEXIFICATION-WIZARD", 0, 1, false);
            declareFunction("cb_handle_sme_lexification_wizard", "CB-HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false);
            declareFunction("handle_html_question_answering", "HANDLE-HTML-QUESTION-ANSWERING", 1, 0, false);
            declareFunction("sme_lexwiz_error", "SME-LEXWIZ-ERROR", 1, 0, false);
            declareFunction("html_encode_text", "HTML-ENCODE-TEXT", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("invoke_sme_lexification_wizard", "INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false);
            declareFunction("handle_sme_lexification_wizard", "HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_sme_lexification_wizard_file_Previous() {
        declareFunction("subloop_reserved_initialize_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction("html_question_answering_agent_p", "HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_preamble_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_trailer_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false);
        declareFunction("html_question_answering_agent_display_question_proper_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
        declareFunction("cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("add_oe_lexification_link", "ADD-OE-LEXIFICATION-LINK", 1, 0, false);
        declareFunction("cb_link_sme_lexification_wizard", "CB-LINK-SME-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("cb_handle_sme_lexification_wizard", "CB-HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false);
        declareFunction("handle_html_question_answering", "HANDLE-HTML-QUESTION-ANSWERING", 1, 0, false);
        declareFunction("sme_lexwiz_error", "SME-LEXWIZ-ERROR", 1, 0, false);
        declareFunction("html_encode_text", "HTML-ENCODE-TEXT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-PREAMBLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-PROPER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-TRAILER"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym26$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE");

    static private final SubLList $list_alt28 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("HTML-DOCUMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DISPLAY-QUESTION-PREAMBLE"))), list(makeSymbol("CB-BASIC-FORM-HANDLER"), list(makeString("handle-html-question-answering")), list(makeSymbol("DISPLAY-QUESTION-PROPER"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DISPLAY-QUESTION-TRAILER"))), list(RET, NIL)));

    static private final SubLString $str_alt31$handle_html_question_answering = makeString("handle-html-question-answering");

    public static SubLObject init_cb_sme_lexification_wizard_file() {
        defvar("*SME-LEXWIZ-VERBOSE?*", T);
        defconstant("*HTML-TAB-EXPANSION*", $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb);
        deflexical("*MAX-SME-LISTBOX-SIZE*", FIFTEEN_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt34 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TITLE"), list(makeSymbol("LEXWIZ-TITLE")))), list(makeSymbol("HTML-HEAD"), list(makeSymbol("HTML-TITLE"), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")))), list(makeSymbol("HTML-HEADING"), list(ONE_INTEGER), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")))), list(makeSymbol("HTML-HEADING"), list(FOUR_INTEGER), list(makeSymbol("CB-HELP-PREAMBLE"), makeKeyword("SME-LEXWIZ")), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER)), list(RET, NIL));

    public static final SubLObject setup_cb_sme_lexification_wizard_file_alt() {
        register_html_state_variable($sme_lexwiz_verboseP$);
        register_html_interface_variable($sme_lexwiz_verboseP$);
        classes.subloop_new_class(HTML_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, $list_alt4);
        classes.class_set_implements_slot_listeners(HTML_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(HTML_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_QUESTION_ANSWERING_AGENT, $sym26$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC);
        com.cyc.cycjava.cycl.cb_sme_lexification_wizard.subloop_reserved_initialize_html_question_answering_agent_class(HTML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt34);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt38);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt41);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
        sethash($SME_LEXWIZ, $cb_help_definitions$.getGlobalValue(), list($str_alt62$sme_lexwiz_html, NIL));
        html_macros.note_html_handler_function(INVOKE_SME_LEXIFICATION_WIZARD);
        setup_cb_link_method($SME_LEXIFICATION_WIZARD, CB_LINK_SME_LEXIFICATION_WIZARD, ONE_INTEGER);
        declare_cb_tool($SME_LEXIFICATION_WIZARD, sme_lexification_wizard.lexwiz_title(), $$$SmeLex, $str_alt97$Perform_lexification_with_SME_too);
        html_macros.note_html_handler_function(HANDLE_SME_LEXIFICATION_WIZARD);
        html_macros.note_html_handler_function(HANDLE_HTML_QUESTION_ANSWERING);
        return NIL;
    }

    public static SubLObject setup_cb_sme_lexification_wizard_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($sme_lexwiz_verboseP$);
            register_html_interface_variable($sme_lexwiz_verboseP$);
            classes.subloop_new_class(HTML_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, $list4);
            classes.class_set_implements_slot_listeners(HTML_QUESTION_ANSWERING_AGENT, NIL);
            classes.subloop_note_class_initialization_function(HTML_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS);
            classes.subloop_note_instance_initialization_function(HTML_QUESTION_ANSWERING_AGENT, $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC);
            subloop_reserved_initialize_html_question_answering_agent_class(HTML_QUESTION_ANSWERING_AGENT);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list30);
            methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list40);
            methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list44);
            methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list47);
            methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
            sethash($SME_LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str72$sme_lexwiz_html, NIL));
            html_macros.note_cgi_handler_function(CB_INVOKE_SME_LEXIFICATION_WIZARD, $HTML_HANDLER);
            setup_cb_link_method($SME_LEXIFICATION_WIZARD, CB_LINK_SME_LEXIFICATION_WIZARD, ONE_INTEGER);
            declare_cb_tool($SME_LEXIFICATION_WIZARD, sme_lexification_wizard.sme_lexwiz_title(), $$$SmeLex, $str111$Perform_lexification_with_SME_lex);
            html_macros.note_cgi_handler_function(CB_HANDLE_SME_LEXIFICATION_WIZARD, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HANDLE_HTML_QUESTION_ANSWERING, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            classes.subloop_note_instance_initialization_function(HTML_QUESTION_ANSWERING_AGENT, $sym26$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt29);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt34);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt38);
            methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT, $list_alt28, NIL, $list_alt41);
            sethash($SME_LEXWIZ, $cb_help_definitions$.getGlobalValue(), list($str_alt62$sme_lexwiz_html, NIL));
            html_macros.note_html_handler_function(INVOKE_SME_LEXIFICATION_WIZARD);
            declare_cb_tool($SME_LEXIFICATION_WIZARD, sme_lexification_wizard.lexwiz_title(), $$$SmeLex, $str_alt97$Perform_lexification_with_SME_too);
            html_macros.note_html_handler_function(HANDLE_SME_LEXIFICATION_WIZARD);
            html_macros.note_html_handler_function(HANDLE_HTML_QUESTION_ANSWERING);
        }
        return NIL;
    }

    public static SubLObject setup_cb_sme_lexification_wizard_file_Previous() {
        register_html_state_variable($sme_lexwiz_verboseP$);
        register_html_interface_variable($sme_lexwiz_verboseP$);
        classes.subloop_new_class(HTML_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, $list4);
        classes.class_set_implements_slot_listeners(HTML_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(HTML_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_QUESTION_ANSWERING_AGENT, $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC);
        subloop_reserved_initialize_html_question_answering_agent_class(HTML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list30);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list40);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PREAMBLE, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list44);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_TRAILER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list47);
        methods.subloop_register_instance_method(HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PROPER, HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
        sethash($SME_LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str72$sme_lexwiz_html, NIL));
        html_macros.note_cgi_handler_function(CB_INVOKE_SME_LEXIFICATION_WIZARD, $HTML_HANDLER);
        setup_cb_link_method($SME_LEXIFICATION_WIZARD, CB_LINK_SME_LEXIFICATION_WIZARD, ONE_INTEGER);
        declare_cb_tool($SME_LEXIFICATION_WIZARD, sme_lexification_wizard.sme_lexwiz_title(), $$$SmeLex, $str111$Perform_lexification_with_SME_lex);
        html_macros.note_cgi_handler_function(CB_HANDLE_SME_LEXIFICATION_WIZARD, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_HTML_QUESTION_ANSWERING, $HTML_HANDLER);
        return NIL;
    }

    static private final SubLSymbol $sym35$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");

    static private final SubLList $list_alt38 = list(list(makeSymbol("HTML-COPYRIGHT-NOTICE")), list(RET, NIL));

    static private final SubLList $list_alt41 = list(new SubLObject[]{ list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("HTML-FONT-COLOR"), list(makeKeyword("RED")), list(makeSymbol("HTML-PRINC"), makeString("Error: ")), list(makeSymbol("HTML-INDENT"), ONE_INTEGER), list(makeSymbol("HTML-PRINC"), makeSymbol("ERROR-MESSAGE")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER))), list(makeSymbol("HTML-MARKUP"), list(makeSymbol("HTML-ENCODE-TEXT"), makeSymbol("QUESTION"))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":object-id"), makeSymbol("ID")), list(makeSymbol("SET-OBJECT-DATA"), makeSymbol("ID"), makeSymbol("SELF")), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":positive-choice"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("HTML-SUBMIT-INPUT"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")), makeString(":yes")), list(makeSymbol("HTML-HIDDEN-INPUT"), makeString(":negative-choice"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("HTML-SUBMIT-INPUT"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF")), makeString(":no"))), list(makeKeyword("ENUMERATED"), list(makeSymbol("CLET"), list(list(makeSymbol("LISTBOX-SIZE"), list(makeSymbol("MIN"), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("PWHEN"), makeSymbol("CHOICES"), list(makeSymbol("IGNORE"), makeSymbol("LISTBOX-SIZE")), list(makeSymbol("HTML-CREATE-RADIOBOX-FORM"), makeString(":response"), makeSymbol("CHOICES"), makeSymbol("VALUES"), makeSymbol("DEFAULT")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("OK"), makeString(":ok")))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("LISTBOX-SIZE"), list(makeSymbol("MIN"), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("CREATE-MULTIPLE-SELECTION-LISTBOX"), makeString(":response"), makeSymbol("CHOICES"), makeSymbol("VALUES"), makeSymbol("LISTBOX-SIZE"), makeSymbol("DEFAULT")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok")))), list(makeKeyword("FREE-FORM"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-TEXT-INPUT"), makeString(":response"), makeSymbol("DEFAULT"), makeSymbol("FIELD-WIDTH")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok"))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-TABLE"), list(ZERO_INTEGER), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LABEL"), makeSymbol("I"), makeSymbol("FIELD-LABELS")), list(makeSymbol("CLET"), list(list(makeSymbol("DEFAULT-VALUE"), list(makeSymbol("ELT"), makeSymbol("DEFAULT"), makeSymbol("I"))), list(makeSymbol("OPTIONAL-DESCRIPTION"), list(makeSymbol("ELT"), makeSymbol("DESCRIPTIONS"), makeSymbol("I")))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-FORMAT"), makeString("~a: "), makeSymbol("LABEL"))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-TEXT-INPUT"), makeString(":response"), makeSymbol("DEFAULT-VALUE"), makeSymbol("FIELD-WIDTH"))), list(makeSymbol("PWHEN"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("OPTIONAL-DESCRIPTION")), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-PRINC"), makeSymbol("OPTIONAL-DESCRIPTION")))))))), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString(":ok")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TIP"), makeSymbol("*SME-LEXWIZ-VERBOSE?*")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-PRINC"), makeString("Tip:")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-MARKUP"), list(makeSymbol("HTML-ENCODE-TEXT"), makeSymbol("TIP"))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER)), list(RET, NIL) });

    @Override
    public void declareFunctions() {
        declare_cb_sme_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_sme_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_sme_lexification_wizard_file();
    }

    static {
    }

    static private final SubLSymbol $sym42$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");

    static private final SubLString $str_alt44$Error__ = makeString("Error: ");

    static private final SubLString $str_alt45$_object_id = makeString(":object-id");

    static private final SubLString $str_alt47$_positive_choice = makeString(":positive-choice");

    static private final SubLString $str_alt48$_yes = makeString(":yes");

    static private final SubLString $str_alt49$_negative_choice = makeString(":negative-choice");

    static private final SubLString $str_alt50$_no = makeString(":no");

    static private final SubLString $str_alt52$_response = makeString(":response");

    static private final SubLString $str_alt54$_ok = makeString(":ok");

    static private final SubLString $str_alt59$_a__ = makeString("~a: ");

    static private final SubLString $str_alt60$Tip_ = makeString("Tip:");

    static private final SubLString $str_alt62$sme_lexwiz_html = makeString("sme-lexwiz.html");

    static private final SubLString $$$the_Dictionary_Assistant = makeString("the Dictionary Assistant");

    static private final SubLString $str_alt64$_id = makeString(":id");

    static private final SubLString $str_alt65$handle_sme_lexification_wizard = makeString("handle-sme-lexification-wizard");

    static private final SubLString $str_alt66$_Specify_the_term_and_phrase_for_ = makeString(" Specify the term and phrase for the lexical mapping");

    static private final SubLString $str_alt67$_cyc_term = makeString(":cyc-term");

    static private final SubLString $str_alt69$Term__ = makeString("Term :");

    static private final SubLString $str_alt72$_create_term = makeString(":create-term");

    static private final SubLString $str_alt73$Create_Term_ = makeString("Create Term?");

    static private final SubLString $str_alt74$Phrase__ = makeString("Phrase :");

    static private final SubLString $str_alt75$_phrase = makeString(":phrase");

    static private final SubLString $str_alt78$Error__ = makeString("Error :");

    static private final SubLString $str_alt80$_reset = makeString(":reset");

    static private final SubLString $str_alt83$_next_action = makeString(":next-action");

    static private final SubLString $str_alt85$_skip_action = makeString(":skip-action");

    static private final SubLString $str_alt86$_Reason__optional___ = makeString(" Reason (optional): ");

    static private final SubLString $str_alt87$_comment = makeString(":comment");

    private static final SubLSymbol INVOKE_SME_LEXIFICATION_WIZARD = makeSymbol("INVOKE-SME-LEXIFICATION-WIZARD");

    static private final SubLString $str_alt91$sme_lexification_wizard = makeString("sme-lexification-wizard");

    static private final SubLString $str_alt93$invoke_sme_lexification_wizard = makeString("invoke-sme-lexification-wizard");

    static private final SubLString $str_alt97$Perform_lexification_with_SME_too = makeString("Perform lexification with SME tool");

    private static final SubLSymbol HANDLE_SME_LEXIFICATION_WIZARD = makeSymbol("HANDLE-SME-LEXIFICATION-WIZARD");

    static private final SubLList $list_alt105 = list(makeKeyword("MULTIPLE-SELECTION"), makeKeyword("MULTIPLE-FREE-FORM"));

    static private final SubLString $str_alt108$Unable_to_resolve_question_into_u = makeString("Unable to resolve question into underlying object");

    static private final SubLString $str_alt110$_br_ = makeString("<br>");

    static private final SubLList $list_alt111 = cons(makeSymbol("OLD-CHAR"), makeSymbol("NEW"));
}

/**
 * Total time: 377 ms
 */
