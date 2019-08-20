/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_change_all_meta_assertions_mt_by_defaultP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_edit_preserve_meta_assertions_by_defaultP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_include_kif_link$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_show_el_formula$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_a_show_english$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_assert_queue_default$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_assertion_indexical$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_constant_input_width$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_default_mt$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_editing_enabled$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_lookup_by_string;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form_assertion_edit_formula;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form_item_list;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_deduction;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_hlmt;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_sentence;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_message_page_with_history;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_direction;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_strength;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_simple_message_page;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_sentence;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$browse_forward_inferencesP$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_icon_definitions$;
import static com.cyc.cycjava.cycl.el_utilities.correct_variables;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.simple_variable_rename_impossibleP;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_boolean;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-ASSERTION-EDITOR
 * source file: /cyc/top/cycl/cb-assertion-editor.lisp
 * created:     2019/07/03 17:38:05
 */
public final class cb_assertion_editor extends SubLTranslatedFile implements V12 {
    public static final SubLObject ke_formula_edit_message(SubLObject old_sentence, SubLObject old_mt, SubLObject new_sentence, SubLObject new_mt, SubLObject email_explanation) {
        {
            SubLObject old_sentence_string = format_cycl_expression.format_cycl_expression_to_string(old_sentence, UNPROVIDED);
            SubLObject new_sentence_string = format_cycl_expression.format_cycl_expression_to_string(new_sentence, UNPROVIDED);
            SubLObject message_body = NIL;
            message_body = format(NIL, $ke_formula_edit_template$.getGlobalValue(), new SubLObject[]{ numeric_date_utilities.datestring(UNPROVIDED), numeric_date_utilities.secondstring(UNPROVIDED), operation_communication.the_cyclist(), old_mt, old_sentence_string, new_mt, new_sentence_string });
            if (NIL != string_utilities.non_empty_stringP(email_explanation)) {
                message_body = cconcatenate(message_body, format(NIL, $ke_formula_edit_explanation_template$.getGlobalValue(), operation_communication.the_cyclist(), email_explanation));
            }
            return message_body;
        }
    }

    public static final SubLObject ke_formula_edit_email_notify_int(SubLObject old_sentence, SubLObject old_mt, SubLObject new_sentence, SubLObject new_mt, SubLObject recipients, SubLObject email_explanation) {
        {
            SubLObject new_cyclist = operation_communication.the_cyclist();
            SubLObject new_email_address = kb_accessors.current_valid_cycorp_email_address_text(new_cyclist);
            SubLObject normalized_recipients_list = NIL;
            if (NIL != new_email_address) {
                {
                    SubLObject cdolist_list_var = string_utilities.string_tokenize(recipients, $list_alt438, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
                    SubLObject recipient = NIL;
                    for (recipient = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , recipient = cdolist_list_var.first()) {
                        if (NIL != string_utilities.contains_charP(recipient, CHAR_at)) {
                            normalized_recipients_list = cons(recipient, normalized_recipients_list);
                        } else {
                            normalized_recipients_list = cons(cconcatenate(recipient, $str_alt437$_cyc_com), normalized_recipients_list);
                        }
                    }
                }
                {
                    SubLObject message_body = ke_formula_edit_message(old_sentence, old_mt, new_sentence, new_mt, email_explanation);
                    mail_utilities.mail_message(new_email_address, normalized_recipients_list, message_body, $ke_formula_edit_email_subject$.getGlobalValue(), mail_utilities.$smtp_host_cycorp$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ke_formula_edit_email_notify(SubLObject old_assertion, SubLObject new_sentence, SubLObject new_mt, SubLObject recipients, SubLObject email_explanation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != assertions_high.asserted_assertionP(old_assertion)) && (NIL != string_utilities.non_empty_stringP(recipients))) {
                thread.resetMultipleValues();
                {
                    SubLObject old_sentence = uncanonicalizer.assertion_el_formula(old_assertion);
                    SubLObject old_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return ke_formula_edit_email_notify_int(old_sentence, old_mt, new_sentence, new_mt, recipients, email_explanation);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return assertion-spec-p or NIL
     */
    @LispMethod(comment = "@return assertion-spec-p or NIL")
    public static final SubLObject cb_new_bug_dependency_meta_assertion_spec_if_needed(SubLObject sentence, SubLObject mt, SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            SubLObject datum = input_options;
            SubLObject current = datum;
            SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
            SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_workaround_assertion_input_default_name$.getGlobalValue();
            if (NIL != html_extract_input(input_name, args)) {
                {
                    SubLObject number = string_utilities.string_to_integer(html_extract_input(cconcatenate(input_name, $str_alt457$_bug_number), args));
                    if (number.isInteger()) {
                        {
                            SubLObject meta_sentence = list($$workaroundAssertionForBug, list($$CycorpBugzillaBugReportFn, number), list($$ist, mt, sentence));
                            SubLObject meta_mt = $$CycorpBugzillaMt;
                            return new_cb_assertion_spec(meta_sentence, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_make_workaround_assertion_section(SubLObject display_options) {
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            SubLObject datum = display_options;
            SubLObject current = datum;
            SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
            SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_workaround_assertion_input_default_name$.getGlobalValue();
            html_checkbox_input(input_name, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str_alt456$note_that_this_assertion_depends_);
            html_text_input(cconcatenate(input_name, $str_alt457$_bug_number), $str_alt225$, FIVE_INTEGER);
            html_princ($str_alt458$_with_a_);
            cb_form($$workaroundAssertionForBug, UNPROVIDED, UNPROVIDED);
            html_princ($str_alt460$_meta_assertion_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_make_bug_dependancy_meta_assertion_if_needed(SubLObject sentence, SubLObject mt, SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            SubLObject datum = input_options;
            SubLObject current = datum;
            SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
            SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_workaround_assertion_input_default_name$.getGlobalValue();
            if (NIL != html_extract_input(input_name, args)) {
                {
                    SubLObject number = string_utilities.string_to_integer(html_extract_input(cconcatenate(input_name, $str_alt457$_bug_number), args));
                    if (number.isInteger()) {
                        ke.ke_assert(list($$workaroundAssertionForBug, list($$CycorpBugzillaBugReportFn, number), list($$ist, mt, sentence)), $$CycorpBugzillaMt, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_email_notify_section(SubLObject recipient_name, SubLObject display_options) {
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_email_notify_input_default_name$.getGlobalValue();
                SubLObject recipients = $str_alt225$;
                SubLObject explanation_input_name = cconcatenate(input_name, $str_alt446$_explanation);
                SubLObject recipients_input_name = cconcatenate(input_name, $str_alt447$_recipients);
                SubLObject employee_email_address = kb_accessors.current_valid_cycorp_email_address_text(recipient_name);
                if (NIL != employee_email_address) {
                    recipients = kb_accessors.cycorp_employee_implied_username_from_email_address(employee_email_address);
                }
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_checkbox_input(input_name, $$$t, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                html_princ_strong($$$email_notify);
                html_indent(UNPROVIDED);
                html_text_input(recipients_input_name, recipients, $$$20);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_princ_strong($str_alt450$with__optional__explanation);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                dhtml_macros.dhtml_switch_visibility_links(explanation_input_name, $str_alt451$_Show_, $str_alt452$_Hide_);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                dhtml_macros.dhtml_set_switched_visibility(explanation_input_name, $INVISIBLE, $PARAGRAPH);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != explanation_input_name) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(explanation_input_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(explanation_input_name);
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
                            html_markup(FIVE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$virtual);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                            }
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_email_notify_if_needed_for_sentence(SubLObject sentence1, SubLObject mt1, SubLObject sentence2, SubLObject mt2, SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            SubLObject datum = input_options;
            SubLObject current = datum;
            SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
            SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_email_notify_input_default_name$.getGlobalValue();
            SubLObject email_notifyP = html_extract_input(input_name, args);
            SubLObject email_notify_recipients = html_extract_input(cconcatenate(input_name, $str_alt447$_recipients), args);
            SubLObject email_explanation = html_extract_input(cconcatenate(input_name, $str_alt446$_explanation), args);
            if ((NIL != email_notifyP) && (NIL != string_utilities.non_empty_stringP(email_notify_recipients))) {
                ke_formula_edit_email_notify_int(sentence1, mt1, sentence2, mt2, email_notify_recipients, email_explanation);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_email_notify_if_needed_for_assertion(SubLObject assertion, SubLObject sentence, SubLObject mt, SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            SubLObject datum = input_options;
            SubLObject current = datum;
            SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
            SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_email_notify_input_default_name$.getGlobalValue();
            SubLObject email_notifyP = html_extract_input(input_name, args);
            SubLObject email_notify_recipients = html_extract_input(cconcatenate(input_name, $str_alt447$_recipients), args);
            SubLObject email_explanation = html_extract_input(cconcatenate(input_name, $str_alt446$_explanation), args);
            if (NIL != email_notifyP) {
                ke_formula_edit_email_notify(assertion, sentence, mt, email_notify_recipients, email_explanation);
            }
            return NIL;
        }
    }

    static private final SubLString $str_alt225$ = makeString("");

    /**
     * The default input name used for make workaround assertion section.
     */
    // deflexical
    @LispMethod(comment = "The default input name used for make workaround assertion section.\ndeflexical")
    private static final SubLSymbol $cb_workaround_assertion_input_default_name$ = makeSymbol("*CB-WORKAROUND-ASSERTION-INPUT-DEFAULT-NAME*");

    /**
     * The default input name used for email-notify section.
     */
    // deflexical
    @LispMethod(comment = "The default input name used for email-notify section.\ndeflexical")
    private static final SubLSymbol $cb_email_notify_input_default_name$ = makeSymbol("*CB-EMAIL-NOTIFY-INPUT-DEFAULT-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ke_formula_edit_explanation_template$ = makeSymbol("*KE-FORMULA-EDIT-EXPLANATION-TEMPLATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ke_formula_edit_template$ = makeSymbol("*KE-FORMULA-EDIT-TEMPLATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ke_formula_edit_email_subject$ = makeSymbol("*KE-FORMULA-EDIT-EMAIL-SUBJECT*");

    public static final SubLFile me = new cb_assertion_editor();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cb_assertion_spec$ = makeSymbol("*DTP-CB-ASSERTION-SPEC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_assert_modes_table$ = makeSymbol("*CB-ASSERT-MODES-TABLE*");

    // deflexical
    // The default input name used for strength input section.
    /**
     * The default input name used for strength input section.
     */
    @LispMethod(comment = "The default input name used for strength input section.\ndeflexical")
    private static final SubLSymbol $cb_strength_input_default_name$ = makeSymbol("*CB-STRENGTH-INPUT-DEFAULT-NAME*");

    // deflexical
    // The default input name used for direction input section.
    /**
     * The default input name used for direction input section.
     */
    @LispMethod(comment = "The default input name used for direction input section.\ndeflexical")
    private static final SubLSymbol $cb_direction_input_default_name$ = makeSymbol("*CB-DIRECTION-INPUT-DEFAULT-NAME*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING = makeSymbol("CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING");

    private static final SubLSymbol CB_ASSERTION_SPEC = makeSymbol("CB-ASSERTION-SPEC");

    private static final SubLSymbol CB_ASSERTION_SPEC_P = makeSymbol("CB-ASSERTION-SPEC-P");

    static private final SubLList $list3 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("UNASSERTS"), makeSymbol("METAS"));

    static private final SubLList $list4 = list(makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("STRENGTH"), makeKeyword("DIRECTION"), makeKeyword("UNASSERTS"), makeKeyword("METAS"));

    static private final SubLList $list5 = list(makeSymbol("ASSERTION-SPEC-SENTENCE"), makeSymbol("ASSERTION-SPEC-MT"), makeSymbol("ASSERTION-SPEC-STRENGTH"), makeSymbol("ASSERTION-SPEC-DIRECTION"), makeSymbol("ASSERTION-SPEC-UNASSERTS"), makeSymbol("ASSERTION-SPEC-METAS"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-ASSERTION-SPEC-SENTENCE"), makeSymbol("_CSETF-ASSERTION-SPEC-MT"), makeSymbol("_CSETF-ASSERTION-SPEC-STRENGTH"), makeSymbol("_CSETF-ASSERTION-SPEC-DIRECTION"), makeSymbol("_CSETF-ASSERTION-SPEC-UNASSERTS"), makeSymbol("_CSETF-ASSERTION-SPEC-METAS"));

    private static final SubLSymbol CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CB-ASSERTION-SPEC-P"));

    private static final SubLSymbol ASSERTION_SPEC_SENTENCE = makeSymbol("ASSERTION-SPEC-SENTENCE");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_SENTENCE = makeSymbol("_CSETF-ASSERTION-SPEC-SENTENCE");

    private static final SubLSymbol ASSERTION_SPEC_MT = makeSymbol("ASSERTION-SPEC-MT");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_MT = makeSymbol("_CSETF-ASSERTION-SPEC-MT");

    private static final SubLSymbol ASSERTION_SPEC_STRENGTH = makeSymbol("ASSERTION-SPEC-STRENGTH");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_STRENGTH = makeSymbol("_CSETF-ASSERTION-SPEC-STRENGTH");

    private static final SubLSymbol ASSERTION_SPEC_DIRECTION = makeSymbol("ASSERTION-SPEC-DIRECTION");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_DIRECTION = makeSymbol("_CSETF-ASSERTION-SPEC-DIRECTION");

    private static final SubLSymbol ASSERTION_SPEC_UNASSERTS = makeSymbol("ASSERTION-SPEC-UNASSERTS");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_UNASSERTS = makeSymbol("_CSETF-ASSERTION-SPEC-UNASSERTS");

    private static final SubLSymbol ASSERTION_SPEC_METAS = makeSymbol("ASSERTION-SPEC-METAS");

    private static final SubLSymbol _CSETF_ASSERTION_SPEC_METAS = makeSymbol("_CSETF-ASSERTION-SPEC-METAS");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CB_ASSERTION_SPEC = makeSymbol("MAKE-CB-ASSERTION-SPEC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLString $str35$_a_operation_was_added_to_queue = makeString("~a operation was added to queue");

    private static final SubLString $str36$_a_operation_completed = makeString("~a operation completed");

    private static final SubLSymbol $CB_WFF_CHECK_FORMULA = makeKeyword("CB-WFF-CHECK-FORMULA");

    private static final SubLString $str38$cb_wff_check_formula_html = makeString("cb-wff-check-formula.html");

    private static final SubLSymbol STACK_P = makeSymbol("STACK-P");

    private static final SubLString $str43$Sentence_not_Well_Formed = makeString("Sentence not Well-Formed");

    private static final SubLString $str44$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str45$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str50$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str55$Mt___ = makeString("Mt : ");

    private static final SubLString $str56$Sentence___ = makeString("Sentence : ");

    private static final SubLString $str57$Repairs___ = makeString("Repairs : ");

    private static final SubLString $str58$No_repairs_available___Could_not_ = makeString("No repairs available.  Could not determine any way to make the above sentence well-formed by adding new knowledge.");

    private static final SubLString $str59$Explanation__ = makeString("Explanation :");

    private static final SubLString $str60$wff_explain = makeString("wff-explain");

    private static final SubLString $str61$Stack_of_pending_assertions_depen = makeString("Stack of pending assertions depending on this one :");

    private static final SubLString $$$__in_ = makeString("  in ");



    private static final SubLSymbol $sym65$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLString $$$The_fact_ = makeString("The fact ");

    private static final SubLString $$$_must_be_added_to_ = makeString(" must be added to ");

    private static final SubLString $str68$_in_order_for_the_above_sentence_ = makeString(" in order for the above sentence to be well-formed.");

    private static final SubLSymbol $REPAIR_AND_REATTEMPT = makeKeyword("REPAIR-AND-REATTEMPT");

    private static final SubLString $$$That_fact_is_already_asserted_in_ = makeString("That fact is already asserted in ");

    private static final SubLString $str73$_ = makeString(".");

    private static final SubLString $str74$You_can_repair_this_by_doing_eith = makeString("You can repair this by doing either of the following:");

    private static final SubLString $str75$1__Lifting_the_assertion_to_ = makeString("1) Lifting the assertion to ");

    private static final SubLString $str76$2__Asserting_it_in_ = makeString("2) Asserting it in ");

    private static final SubLString $$$_as_well = makeString(" as well");

    private static final SubLString $str78$You_can_repair_this_by_doing_the_ = makeString("You can repair this by doing the following:");

    private static final SubLString $$$Asserting_it_in_ = makeString("Asserting it in ");

    private static final SubLString $$$_must_be_lifted_to_ = makeString(" must be lifted to ");

    private static final SubLString $str81$It_is_currently_asserted_in_the_f = makeString("It is currently asserted in the following spec Mts:");

    private static final SubLString $str82$_Make_this_repair_and_then_reatte = makeString("[Make this repair and then reattempt]");

    private static final SubLString $str84$cb_repair_and_reattempt__A__A = makeString("cb-repair-and-reattempt&~A&~A");

    private static final SubLSymbol CB_LINK_REPAIR_AND_REATTEMPT = makeSymbol("CB-LINK-REPAIR-AND-REATTEMPT");

    private static final SubLString $$$the_Cyc_KB_editing_facilities = makeString("the Cyc KB editing facilities");

    private static final SubLList $list87 = list(makeSymbol("REPAIR-ASSERTION-SPEC-ID"), makeSymbol("ASSERTION-STACK-ID"));

    private static final SubLString $str88$Repair_and_assert_operations_comp = makeString("Repair and assert operations completed");

    private static final SubLSymbol CB_REPAIR_AND_REATTEMPT = makeSymbol("CB-REPAIR-AND-REATTEMPT");

    private static final SubLString $str92$cb_af_html = makeString("cb-af.html");

    private static final SubLSymbol $SHOW_EL_FORMULA = makeKeyword("SHOW-EL-FORMULA");

    private static final SubLSymbol $FIND_SIMILAR_ASSERTION = makeKeyword("FIND-SIMILAR-ASSERTION");

    private static final SubLSymbol $CHANGE_META_ASSERTION_MT = makeKeyword("CHANGE-META-ASSERTION-MT");

    private static final SubLSymbol $ASSERTION_PROOF_VIEW = makeKeyword("ASSERTION-PROOF-VIEW");

    private static final SubLString $str112$_Query_Antecedent_ = makeString("[Query Antecedent]");

    private static final SubLSymbol $RULE_KNOWN_EXTENT_QUERY = makeKeyword("RULE-KNOWN-EXTENT-QUERY");

    private static final SubLString $str114$_Known_Extent_ = makeString("[Known Extent]");

    private static final SubLSymbol $RULE_UNKNOWN_EXTENT_QUERY = makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");

    private static final SubLString $str116$_Unknown_Extent_ = makeString("[Unknown Extent]");

    private static final SubLString $str118$_Trigger_Test_ = makeString("[Trigger Test]");

    private static final SubLSymbol $ASSERTION_SIMILAR_QUERY = makeKeyword("ASSERTION-SIMILAR-QUERY");

    private static final SubLSymbol $TEST_GEN_TEMPLATE = makeKeyword("TEST-GEN-TEMPLATE");

    private static final SubLSymbol $USE_IN_PROOF = makeKeyword("USE-IN-PROOF");

    private static final SubLSymbol $USE_IN_PLAN_CHECKING = makeKeyword("USE-IN-PLAN-CHECKING");

    private static final SubLObject $const130$InferenceRelatedBookkeepingPredic = reader_make_constant_shell("InferenceRelatedBookkeepingPredicate");

    private static final SubLSymbol $CB_CHANGE_MT = makeKeyword("CB-CHANGE-MT");

    private static final SubLString $str132$cb_change_mt_html = makeString("cb-change-mt.html");

    private static final SubLString $$$the_Change_Assertion_Mt_page = makeString("the Change Assertion Mt page");

    private static final SubLList $list134 = list(makeSymbol("ID"));

    private static final SubLString $$$Change_Assertion_Mt = makeString("Change Assertion Mt");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str137$cb_handle_change_mt = makeString("cb-handle-change-mt");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $str140$Note___This_assertion_has_meta_as = makeString("Note : This assertion has meta-assertions");

    private static final SubLList $list141 = list(makeKeyword("ANYTIME-PSC-ALLOWED?"), NIL);

    private static final SubLString $$$Abort_Edit = makeString("Abort Edit");

    private static final SubLString $$$Current_Value = makeString("Current Value");

    private static final SubLString $$$Change_Mt = makeString("Change Mt");

    private static final SubLSymbol CB_CHANGE_MT = makeSymbol("CB-CHANGE-MT");

    private static final SubLString $str146$To_change_Mt_of_all_meta_assertio = makeString("To change Mt of all meta-assertions use ");

    private static final SubLString $str147$move_all_meta_assertions = makeString("move-all-meta-assertions");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str149$Change_the_Mt_of_all_meta_asserti = makeString("Change the Mt of all meta-assertions to the new Mt");

    private static final SubLString $$$change_microtheory = makeString("change microtheory");

    private static final SubLString $str151$Assertion_is_already_in__S = makeString("Assertion is already in ~S");

    private static final SubLString $str152$preserve_ = makeString("preserve_");

    private static final SubLSymbol CB_HANDLE_CHANGE_MT = makeSymbol("CB-HANDLE-CHANGE-MT");

    private static final SubLString $str154$_Change_Mt_ = makeString("[Change Mt]");

    private static final SubLString $str155$cb_change_mt__a = makeString("cb-change-mt&~a");

    private static final SubLSymbol CB_LINK_CHANGE_MT = makeSymbol("CB-LINK-CHANGE-MT");

    private static final SubLSymbol $CB_CHANGE_STRENGTH = makeKeyword("CB-CHANGE-STRENGTH");

    private static final SubLString $str158$cb_change_strength_html = makeString("cb-change-strength.html");

    private static final SubLString $str159$the_Change_Assertion_Strength_pag = makeString("the Change Assertion Strength page");

    private static final SubLString $$$Change_Assertion_Strength = makeString("Change Assertion Strength");

    private static final SubLString $str161$cb_handle_change_strength = makeString("cb-handle-change-strength");

    private static final SubLString $str162$Choose_a_new_truth_strength__ = makeString("Choose a new truth strength :");

    private static final SubLString $$$strength = makeString("strength");

    private static final SubLString $str164$_default = makeString(":default");

    private static final SubLString $$$Default = makeString("Default");

    private static final SubLString $str167$_monotonic = makeString(":monotonic");

    private static final SubLString $$$Monotonic = makeString("Monotonic");

    private static final SubLString $$$Change_Strength = makeString("Change Strength");

    private static final SubLSymbol CB_CHANGE_STRENGTH = makeSymbol("CB-CHANGE-STRENGTH");

    private static final SubLString $$$change_strength = makeString("change strength");

    private static final SubLList $list173 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));

    private static final SubLString $str174$_a_was_not_a_microtheory = makeString("~a was not a microtheory");

    private static final SubLSymbol CB_HANDLE_CHANGE_STRENGTH = makeSymbol("CB-HANDLE-CHANGE-STRENGTH");

    private static final SubLString $str176$_Change_Strength_ = makeString("[Change Strength]");

    private static final SubLString $str177$cb_change_strength__a = makeString("cb-change-strength&~a");

    private static final SubLSymbol CB_LINK_CHANGE_STRENGTH = makeSymbol("CB-LINK-CHANGE-STRENGTH");

    private static final SubLSymbol $CB_CHANGE_DIRECTION = makeKeyword("CB-CHANGE-DIRECTION");

    private static final SubLString $str180$cb_change_direction_html = makeString("cb-change-direction.html");

    private static final SubLString $str181$the_Change_Assertion_Direction_pa = makeString("the Change Assertion Direction page");

    private static final SubLString $$$Change_Assertion_Direction = makeString("Change Assertion Direction");

    private static final SubLString $str183$cb_handle_change_direction = makeString("cb-handle-change-direction");

    private static final SubLString $str184$Choose_a_direction__ = makeString("Choose a direction :");

    private static final SubLString $$$direction = makeString("direction");

    private static final SubLString $str186$_backward = makeString(":backward");

    private static final SubLString $$$Backward = makeString("Backward");

    private static final SubLString $str189$_forward = makeString(":forward");

    private static final SubLString $$$Forward = makeString("Forward");

    private static final SubLString $$$Change_Direction = makeString("Change Direction");

    private static final SubLSymbol CB_CHANGE_DIRECTION = makeSymbol("CB-CHANGE-DIRECTION");

    private static final SubLString $$$direction_changes = makeString("direction changes");

    private static final SubLString $str195$shoehorn_ = makeString("shoehorn?");

    private static final SubLString $str196$_a_does_not_specify_a_valid_direc = makeString("~a does not specify a valid direction");



    private static final SubLString $$$This_rule_was_shoehorned_forward_ = makeString("This rule was shoehorned forward ");

    private static final SubLString $$$_by_ = makeString(" by ");

    private static final SubLSymbol CB_HANDLE_CHANGE_DIRECTION = makeSymbol("CB-HANDLE-CHANGE-DIRECTION");

    private static final SubLString $str201$_Change_Direction_ = makeString("[Change Direction]");

    private static final SubLString $str202$cb_change_direction__a = makeString("cb-change-direction&~a");

    private static final SubLSymbol CB_LINK_CHANGE_DIRECTION = makeSymbol("CB-LINK-CHANGE-DIRECTION");

    private static final SubLSymbol $CB_CHANGE_META_ASSERTION_MT = makeKeyword("CB-CHANGE-META-ASSERTION-MT");

    private static final SubLString $str205$cb_change_meta_assertion_mt_html = makeString("cb-change-meta-assertion-mt.html");

    private static final SubLString $$$Change_Meta_Assertions_Mt = makeString("Change Meta Assertions Mt");

    private static final SubLString $str207$cb_handle_change_meta_assertion_m = makeString("cb-handle-change-meta-assertion-mt");

    private static final SubLString $str208$Change_the_Mt_of_Meta_Assertions_ = makeString("Change the Mt of Meta-Assertions of the assertion : ");

    private static final SubLString $str209$change_meta_ = makeString("change_meta_");

    private static final SubLString $str210$Choose_the_meta_assertions__ = makeString("Choose the meta assertions :");

    private static final SubLSymbol CB_CHANGE_META_ASSERTION_MT = makeSymbol("CB-CHANGE-META-ASSERTION-MT");

    private static final SubLSymbol CB_HANDLE_CHANGE_META_ASSERTION_MT = makeSymbol("CB-HANDLE-CHANGE-META-ASSERTION-MT");

    private static final SubLString $str213$_Change_Meta_Assertions_Mt_ = makeString("[Change Meta Assertions Mt]");

    private static final SubLString $str214$cb_change_meta_assertion_mt__a = makeString("cb-change-meta-assertion-mt&~a");

    private static final SubLSymbol CB_LINK_CHANGE_META_ASSERTION_MT = makeSymbol("CB-LINK-CHANGE-META-ASSERTION-MT");

    private static final SubLSymbol $CB_RENAME_VARIABLES = makeKeyword("CB-RENAME-VARIABLES");

    private static final SubLString $str217$cb_rename_variables_html = makeString("cb-rename-variables.html");

    private static final SubLString $$$the_facility_to_rename_variables = makeString("the facility to rename variables");

    private static final SubLString $$$Rename_Assertion_Variables = makeString("Rename Assertion Variables");

    private static final SubLString $str220$cb_handle_rename_variables = makeString("cb-handle-rename-variables");

    private static final SubLString $str221$Rename_the_variables_of_the_asser = makeString("Rename the variables of the assertion : ");

    private static final SubLString $str222$Note__ = makeString("Note: ");

    private static final SubLString $$$Variables_listed_in_ = makeString("Variables listed in ");

    private static final SubLString $$$red = makeString("red");

    private static final SubLString $str225$_have_invalid_variable_names___Va = makeString(" have invalid variable names.  Valid variables must satisfy the regular expression ");

    private static final SubLString $$$Current_Variable = makeString("Current Variable");

    private static final SubLString $$$Changed_Variable = makeString("Changed Variable");

    private static final SubLString $$$Rename_Variables = makeString("Rename Variables");

    private static final SubLString $$$rename = makeString("rename");

    private static final SubLSymbol CB_RENAME_VARIABLES = makeSymbol("CB-RENAME-VARIABLES");

    private static final SubLString $str233$No_variables_were_specified_to_be = makeString("No variables were specified to be renamed.");

    private static final SubLList $list234 = cons(makeSymbol("VARIABLE"), makeSymbol("RENAMED-VARIABLE"));

    private static final SubLString $str235$The_proposed_rename_may_change_th = makeString("The proposed rename may change the logical intent of the assertion, and would require unasserting and reasserting it.  Do you want to continue?");

    private static final SubLString $$$Yes = makeString("Yes");

    private static final SubLString $$$continue = makeString("continue");

    private static final SubLString $$$No = makeString("No");

    private static final SubLSymbol CB_HANDLE_RENAME_VARIABLES = makeSymbol("CB-HANDLE-RENAME-VARIABLES");

    private static final SubLList $list241 = list(makeSymbol("VARIABLE-NAME"), makeSymbol("NEW-VARIABLE-NAME"));

    private static final SubLList $list242 = list(CHAR_space, CHAR_tab, CHAR_newline);

    private static final SubLString $str243$_ = makeString("?");

    private static final SubLString $str244$ = makeString("");

    private static final SubLString $$$Invalid_Variables = makeString("Invalid Variables");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str247$The_following_variables_have_inva = makeString("The following variables have invalid variable names");

    private static final SubLString $str249$__ = makeString(", ");

    private static final SubLString $str250$__and_ = makeString(", and ");

    private static final SubLString $str251$Valid_variables_must_satisfy_the_ = makeString("Valid variables must satisfy the regular expression ");

    private static final SubLString $str252$_Rename_Variables_ = makeString("[Rename Variables]");

    private static final SubLString $str253$cb_rename_variables__a = makeString("cb-rename-variables&~a");

    private static final SubLSymbol CB_LINK_RENAME_VARIABLES = makeSymbol("CB-LINK-RENAME-VARIABLES");

    private static final SubLString $str255$the_facility_to_repropagate_forwa = makeString("the facility to repropagate forward inference on an assertion");

    private static final SubLString $$$Forward_Assertion_Repropagation = makeString("Forward Assertion Repropagation");

    private static final SubLString $str257$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    private static final SubLSymbol CB_REPROPAGATE = makeSymbol("CB-REPROPAGATE");

    private static final SubLString $str259$_Repropagate_ = makeString("[Repropagate]");

    private static final SubLString $str260$cb_repropagate__a = makeString("cb-repropagate&~a");

    private static final SubLSymbol CB_LINK_REPROPAGATE = makeSymbol("CB-LINK-REPROPAGATE");

    private static final SubLString $str262$the_facility_to_repropagate_and_b = makeString("the facility to repropagate and browse forward inference on an assertion");

    private static final SubLString $str263$Forward_repropagation_complete___ = makeString("Forward repropagation complete.  Browse results:");

    private static final SubLSymbol CB_REPROPAGATE_BROWSABLY = makeSymbol("CB-REPROPAGATE-BROWSABLY");

    private static final SubLString $str265$_Repropagate_and_Browse_ = makeString("[Repropagate and Browse]");

    private static final SubLString $str266$cb_repropagate_browsably__a = makeString("cb-repropagate-browsably&~a");

    private static final SubLSymbol CB_LINK_REPROPAGATE_BROWSABLY = makeSymbol("CB-LINK-REPROPAGATE-BROWSABLY");

    private static final SubLString $str268$the_facility_to_recanonicalize_an = makeString("the facility to recanonicalize an assertion");

    private static final SubLString $str269$_S_did_not_specify_an_assertion_ = makeString("~S did not specify an assertion.");

    private static final SubLString $$$Assertion_is_already_canonical = makeString("Assertion is already canonical");

    private static final SubLString $$$Recanonicalize_Assertion = makeString("Recanonicalize Assertion");

    private static final SubLSymbol CB_RECANONICALIZE = makeSymbol("CB-RECANONICALIZE");

    private static final SubLString $str273$_Recanonicalize_ = makeString("[Recanonicalize]");

    private static final SubLString $str274$cb_recanonicalize__a = makeString("cb-recanonicalize&~a");

    private static final SubLSymbol CB_LINK_RECANONICALIZE = makeSymbol("CB-LINK-RECANONICALIZE");

    private static final SubLString $str277$cb_wff_html = makeString("cb-wff.html");

    private static final SubLString $str278$WFF_Check_Sentence = makeString("WFF-Check Sentence");

    private static final SubLString $str279$cb_handle_wff = makeString("cb-handle-wff");

    private static final SubLString $$$Clear = makeString("Clear");



    private static final SubLList $list282 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    private static final SubLSymbol CB_WFF = makeSymbol("CB-WFF");

    private static final SubLString $$$WFF_Check = makeString("WFF Check");

    private static final SubLString $str286$cb_wff = makeString("cb-wff");

    private static final SubLSymbol CB_LINK_WFF = makeSymbol("CB-LINK-WFF");

    private static final SubLString $$$WFF = makeString("WFF");

    private static final SubLString $str290$Check_a_CycL_Expression_for_well_ = makeString("Check a CycL Expression for well-formedness");

    private static final SubLSymbol CB_HANDLE_WFF = makeSymbol("CB-HANDLE-WFF");

    private static final SubLList $list292 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLString $$$Sentence_is_Well_Formed = makeString("Sentence is Well Formed");

    private static final SubLString $str294$WFF_Status___ = makeString("WFF-Status : ");

    private static final SubLString $$$OK = makeString("OK");

    private static final SubLList $list296 = list(list(makeKeyword("DEFAULT"), makeString("cb-handle-assert"), makeString("Assert Sentence"), makeString("Assert Sentence")), list(makeKeyword("SIMILAR"), makeString("cb-handle-assert"), makeString("Assert Similar Sentence"), makeString("Assert Sentence")), list($EDIT, makeString("cb-handle-edit"), makeString("Edit Assertion"), makeString("Perform Edit")), list(makeKeyword("EDIT-SENTENCE"), makeString("cb-handle-sentence-edit"), makeString("Edit Sentence"), makeString("Perform Edit")), list(makeKeyword("FIX-TYPO"), makeString("cb-handle-fix-typo"), makeString("Fix Assertion"), makeString("Perform Fix")), list($META, makeString("cb-handle-assert-meta"), makeString("Assert Meta Assertion"), makeString("Assert Sentence")));

    private static final SubLSymbol CB_ASSERT = makeSymbol("CB-ASSERT");

    private static final SubLString $$$assertions = makeString("assertions");

    private static final SubLString $str299$wff_check = makeString("wff-check");

    private static final SubLString $str300$assertion_queue = makeString("assertion-queue");

    private static final SubLString $str302$Forward_propagation_complete___Br = makeString("Forward propagation complete.  Browse results:");

    private static final SubLString $$$EL_Sentence_Assert = makeString("EL Sentence Assert");

    private static final SubLSymbol CB_HANDLE_ASSERT = makeSymbol("CB-HANDLE-ASSERT");

    private static final SubLString $str307$assert_tool_gif = makeString("assert-tool.gif");

    private static final SubLString $$$Assert = makeString("Assert");

    private static final SubLString $str309$cb_assert = makeString("cb-assert");

    private static final SubLSymbol CB_LINK_ASSERT = makeSymbol("CB-LINK-ASSERT");

    private static final SubLString $$$Asrt = makeString("Asrt");

    private static final SubLString $$$Assert_CycL_Expression = makeString("Assert CycL Expression");

    private static final SubLSymbol $CB_ASSERT_INTERNAL = makeKeyword("CB-ASSERT-INTERNAL");

    private static final SubLString $str314$cb_assert_internal_html = makeString("cb-assert-internal.html");

    private static final SubLString $$$Fatal_Error = makeString("Fatal Error");

    private static final SubLString $str316$cb_assert_called_without_a_valid_ = makeString("cb-assert called without a valid mode");

    private static final SubLList $list317 = list(makeSymbol("KEYWORD"), makeSymbol("HANDLER"), makeSymbol("TITLE"), makeSymbol("ACTION-LABEL"));

    private static final SubLString $$$Please_use_ = makeString("Please use ");

    private static final SubLString $str320$_to_refer_to_the_following_assert = makeString(" to refer to the following assertion :");

    private static final SubLString $$$Reset_All_Fields = makeString("Reset All Fields");

    private static final SubLString $$$assert = makeString("assert");

    private static final SubLString $str324$_local = makeString(":local");

    private static final SubLString $$$Assert_using_Local_queue = makeString("Assert using Local queue");

    private static final SubLString $str327$_browse = makeString(":browse");

    private static final SubLString $str328$Assert_now_and_browse_forward_inf = makeString("Assert now and browse forward inference");

    private static final SubLString $str329$_now = makeString(":now");

    private static final SubLString $str330$Assert_now__bypassing_Local_queue = makeString("Assert now, bypassing Local queue");

    private static final SubLString $str331$cb_assert_parameters = makeString("cb-assert-parameters");

    private static final SubLString $$$Show = makeString("Show");

    private static final SubLString $$$Hide = makeString("Hide");

    private static final SubLString $$$Assert_Context = makeString("Assert Context");

    private static final SubLSymbol $kw338$EDIT_ALLOWED_ = makeKeyword("EDIT-ALLOWED?");

    private static final SubLList $list340 = list(reader_make_constant_shell("UniversalVocabularyMt"));

    private static final SubLSymbol $kw341$ANYTIME_PSC_ALLOWED_ = makeKeyword("ANYTIME-PSC-ALLOWED?");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $$$Cyclify = makeString("Cyclify");

    private static final SubLString $$$Clear_Sentence = makeString("Clear Sentence");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLList $list355 = list(reader_make_constant_shell("TheAssertionSentence"), reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("pragmaticRequirement"), reader_make_constant_shell("salientAssertions"));

    private static final SubLString $str356$cb_handle_fix_typo = makeString("cb-handle-fix-typo");

    private static final SubLString $str357$cb_handle_edit = makeString("cb-handle-edit");

    private static final SubLString $str358$cb_handle_sentence_edit = makeString("cb-handle-sentence-edit");

    private static final SubLString $str359$Choose_analogous_meta_assertions_ = makeString("Choose analogous meta-assertions to assert :");



    private static final SubLString $str361$_a_S = makeString("~a~S");



    private static final SubLString $str364$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory.");

    private static final SubLString $str365$_S_is_not_a_microtheory_ = makeString("~S is not a microtheory.");



    private static final SubLString $str367$Bad_sentence__probably_due_to_a_m = makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");

    static private final SubLList $list368 = list(makeSymbol("FORMULA-ID"), makeSymbol("MT-ID"));



    private static final SubLSymbol CB_ASSERT_FORMULA = makeSymbol("CB-ASSERT-FORMULA");



    private static final SubLString $str372$_Assert_Formula_ = makeString("[Assert Formula]");

    private static final SubLString $str373$cb_assert_formula__A__A = makeString("cb-assert-formula&~A&~A");

    private static final SubLSymbol CB_LINK_ASSERT_FORMULA = makeSymbol("CB-LINK-ASSERT-FORMULA");

    private static final SubLSymbol CB_SIMILAR = makeSymbol("CB-SIMILAR");

    private static final SubLString $str377$_Assert_Similar_ = makeString("[Assert Similar]");

    private static final SubLString $str378$cb_similar__a = makeString("cb-similar&~a");

    private static final SubLSymbol CB_LINK_ASSERT_SIMILAR = makeSymbol("CB-LINK-ASSERT-SIMILAR");

    private static final SubLSymbol CB_ASSERT_META = makeSymbol("CB-ASSERT-META");

    private static final SubLString $$$editing = makeString("editing");

    private static final SubLString $str382$The_sentence_did_not_mention__S_ = makeString("The sentence did not mention ~S.");

    private static final SubLString $$$EL_Meta_Sentence_Assert = makeString("EL Meta Sentence Assert");

    private static final SubLSymbol CB_HANDLE_ASSERT_META = makeSymbol("CB-HANDLE-ASSERT-META");

    private static final SubLString $str385$_Assert_Meta_ = makeString("[Assert Meta]");

    private static final SubLString $str386$cb_assert_meta__a = makeString("cb-assert-meta&~a");

    private static final SubLSymbol CB_LINK_ASSERT_META = makeSymbol("CB-LINK-ASSERT-META");

    private static final SubLSymbol CB_SUGGEST_PRAGMAS = makeSymbol("CB-SUGGEST-PRAGMAS");

    private static final SubLString $str389$_Suggest_Pragmas_ = makeString("[Suggest Pragmas]");

    private static final SubLString $str390$cb_suggest_pragmas__a = makeString("cb-suggest-pragmas&~a");

    private static final SubLSymbol CB_LINK_SUGGEST_PRAGMAS = makeSymbol("CB-LINK-SUGGEST-PRAGMAS");

    private static final SubLString $$$Suggested_Pragmas = makeString("Suggested Pragmas");

    private static final SubLSymbol $CB_SUGGEST_PRAGMAS = makeKeyword("CB-SUGGEST-PRAGMAS");

    private static final SubLString $str394$Pragmatic_requirements_worth_cons = makeString("Pragmatic requirements worth considering for :");



    private static final SubLSymbol $ASSERT_SUGGESTED_PRAGMA = makeKeyword("ASSERT-SUGGESTED-PRAGMA");

    private static final SubLString $str397$_Assert_ = makeString("[Assert]");

    private static final SubLString $str399$cb_assert_suggested_pragma__a__a = makeString("cb-assert-suggested-pragma&~a&~a");

    private static final SubLSymbol CB_LINK_ASSERT_SUGGESTED_PRAGMA = makeSymbol("CB-LINK-ASSERT-SUGGESTED-PRAGMA");

    private static final SubLList $list401 = list(makeSymbol("ID-STRING"), makeSymbol("PRAGMA-STRING"));

    private static final SubLSymbol CB_ASSERT_SUGGESTED_PRAGMA = makeSymbol("CB-ASSERT-SUGGESTED-PRAGMA");

    private static final SubLList $list404 = list(list(makeSymbol("*AT-CHECK-ARG-FORMAT?*"), NIL), list(makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*"), NIL));

    private static final SubLSymbol CB_EDIT = makeSymbol("CB-EDIT");

    private static final SubLString $$$Assertion_Edit = makeString("Assertion Edit");

    private static final SubLSymbol CB_HANDLE_EDIT = makeSymbol("CB-HANDLE-EDIT");

    private static final SubLList $list408 = list(makeSymbol("INPUT-NAME"), makeSymbol("ASSERTION-ID-STRING"));

    private static final SubLString $str409$_Edit_ = makeString("[Edit]");

    private static final SubLString $str410$cb_edit__a = makeString("cb-edit&~a");

    private static final SubLSymbol CB_LINK_EDIT_ASSERTION = makeSymbol("CB-LINK-EDIT-ASSERTION");

    private static final SubLString $$$error = makeString("error");

    private static final SubLString $str413$_S = makeString("~S");

    private static final SubLString $$$assertion_editing_facilities = makeString("assertion editing facilities");

    private static final SubLSymbol $sym415$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $$$oldAssertionId = makeString("oldAssertionId");

    private static final SubLString $$$response = makeString("response");

    private static final SubLSymbol $NOT_WELL_FORMED = makeKeyword("NOT-WELL-FORMED");

    private static final SubLString $$$invalidSentence = makeString("invalidSentence");

    private static final SubLString $$$message = makeString("message");

    private static final SubLString $$$count = makeString("count");

    private static final SubLString $$$assertionsQueued = makeString("assertionsQueued");

    private static final SubLString $str425$_A_assertion_P_added_to_the_local = makeString("~A assertion~P added to the local queue.");

    private static final SubLList $list426 = list(makeString("count"), makeString("1"));

    private static final SubLString $$$unassertedQueued = makeString("unassertedQueued");

    private static final SubLString $str428$_A_unassert__P_added_to_the_local = makeString("~A unassert~:P added to the local queue.");

    private static final SubLSymbol CB_HANDLE_EDIT_ASSERTION = makeSymbol("CB-HANDLE-EDIT-ASSERTION");

    private static final SubLString $str431$_S_did_not_specify_a_CycL_sentenc = makeString("~S did not specify a CycL sentence eligible for editing.");

    private static final SubLSymbol CB_HANDLE_SENTENCE_EDIT = makeSymbol("CB-HANDLE-SENTENCE-EDIT");

    private static final SubLString $$$the_Cyc_KB_typo_fixing_facilities = makeString("the Cyc KB typo fixing facilities");

    private static final SubLSymbol CB_FIX_TYPO_EDIT = makeSymbol("CB-FIX-TYPO-EDIT");

    private static final SubLString $str435$_Fix_Typo_ = makeString("[Fix Typo]");

    private static final SubLString $str436$cb_fix_typo_edit__a = makeString("cb-fix-typo-edit&~a");

    private static final SubLSymbol CB_LINK_FIX_TYPO = makeSymbol("CB-LINK-FIX-TYPO");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLString $str439$Edited_sentence_does_not_differ_o = makeString("Edited sentence does not differ only in strings.");

    private static final SubLSymbol CB_HANDLE_FIX_TYPO = makeSymbol("CB-HANDLE-FIX-TYPO");

    private static final SubLString $$$Reassert = makeString("Reassert");

    private static final SubLSymbol CB_REASSERT = makeSymbol("CB-REASSERT");

    private static final SubLString $str443$_Reassert_ = makeString("[Reassert]");

    private static final SubLString $str444$cb_reassert__a = makeString("cb-reassert&~a");

    private static final SubLSymbol CB_LINK_REASSERT = makeSymbol("CB-LINK-REASSERT");

    private static final SubLString $$$Unassert = makeString("Unassert");

    private static final SubLSymbol CB_UNASSERT = makeSymbol("CB-UNASSERT");

    private static final SubLString $str448$_Unassert_ = makeString("[Unassert]");

    private static final SubLString $str449$cb_unassert__a = makeString("cb-unassert&~a");

    private static final SubLSymbol CB_LINK_UNASSERT = makeSymbol("CB-LINK-UNASSERT");

    private static final SubLString $$$Assertion_Blast = makeString("Assertion Blast");

    private static final SubLSymbol CB_BLAST = makeSymbol("CB-BLAST");

    private static final SubLString $str453$_Blast_ = makeString("[Blast]");

    private static final SubLString $str454$cb_blast__a = makeString("cb-blast&~a");

    private static final SubLSymbol CB_LINK_BLAST = makeSymbol("CB-LINK-BLAST");

    private static final SubLList $list456 = list(makeSymbol("ID-STRING"));

    private static final SubLString $str457$_a_does_not_specify_a_deduction = makeString("~a does not specify a deduction");

    private static final SubLString $$$Deduction_Removal = makeString("Deduction Removal");

    private static final SubLSymbol CB_REMOVE_DEDUCTION = makeSymbol("CB-REMOVE-DEDUCTION");

    private static final SubLString $str460$_Remove_Deduction_ = makeString("[Remove Deduction]");

    private static final SubLString $str461$cb_remove_deduction__a = makeString("cb-remove-deduction&~a");

    private static final SubLSymbol CB_LINK_REMOVE_DEDUCTION = makeSymbol("CB-LINK-REMOVE-DEDUCTION");

    private static final SubLString $$$Redo_TMS_for_Assertion = makeString("Redo TMS for Assertion");

    private static final SubLSymbol CB_ASSERTION_TMS = makeSymbol("CB-ASSERTION-TMS");

    private static final SubLString $str466$_Redo_TMS_ = makeString("[Redo TMS]");

    private static final SubLString $str467$cb_assertion_tms__a = makeString("cb-assertion-tms&~a");

    private static final SubLSymbol CB_LINK_ASSERT_TMS = makeSymbol("CB-LINK-ASSERT-TMS");

    private static final SubLSymbol $CB_DIAGNOSE_ASSERTION = makeKeyword("CB-DIAGNOSE-ASSERTION");

    private static final SubLString $str470$cb_diagnose_assertion_html = makeString("cb-diagnose-assertion.html");

    private static final SubLString $$$the_Assertion_Diagnostics_page = makeString("the Assertion Diagnostics page");

    private static final SubLString $str472$_a_does_not_specify_a_Cyc_asserti = makeString("~a does not specify a Cyc assertion");

    private static final SubLString $$$Assertion_Diagnostics = makeString("Assertion Diagnostics");

    private static final SubLString $str474$Diagnosis_of__ = makeString("Diagnosis of :");

    private static final SubLSymbol CB_DIAGNOSE_ASSERTION = makeSymbol("CB-DIAGNOSE-ASSERTION");

    private static final SubLString $str476$_Run_Diagnostics_ = makeString("[Run Diagnostics]");

    private static final SubLString $str477$cb_diagnose_assertion__A = makeString("cb-diagnose-assertion&~A");

    private static final SubLSymbol CB_LINK_DIAGNOSE_ASSERTION = makeSymbol("CB-LINK-DIAGNOSE-ASSERTION");

    private static final SubLSymbol $sym481$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLString $str482$cb_trigger_test__a__a = makeString("cb-trigger-test&~a&~a");

    private static final SubLString $str483$cb_trigger_test__a = makeString("cb-trigger-test&~a");

    private static final SubLString $str484$cb_trigger_test = makeString("cb-trigger-test");

    private static final SubLSymbol CB_LINK_TRIGGER_TEST = makeSymbol("CB-LINK-TRIGGER-TEST");

    private static final SubLList $list486 = list(makeSymbol("SUPPORT-ID"), makeSymbol("RULE-ID"));

    private static final SubLString $$$the_Trigger_Test_page = makeString("the Trigger Test page");

    private static final SubLSymbol CB_TRIGGER_TEST = makeSymbol("CB-TRIGGER-TEST");



    private static final SubLString $$$Trigger_Test_Results = makeString("Trigger Test Results");

    private static final SubLSymbol $CB_TRIGGER_TEST = makeKeyword("CB-TRIGGER-TEST");

    private static final SubLString $str492$Results_of_triggering__ = makeString("Results of triggering :");

    private static final SubLString $str493$_Retrigger_ = makeString("[Retrigger]");

    private static final SubLString $str494$against_rule__ = makeString("against rule :");

    private static final SubLString $str495$No_results_ = makeString("No results.");

    private static final SubLString $$$One_Conclusion = makeString("One Conclusion");

    private static final SubLString $str497$Conclusions__ = makeString("Conclusions (");

    private static final SubLString $str498$_total_ = makeString(" total)");

    private static final SubLString $$$Justification = makeString("Justification");

    private static final SubLList $list500 = list(list(makeSymbol("GAF-CNF"), makeSymbol("CONCLUDED-MT"), makeSymbol("&REST"), makeSymbol("REST")), list(makeSymbol("DEDUCTION-TOKEN"), makeSymbol("&REST"), makeSymbol("JUSTIFICATION")));

    private static final SubLString $$$just = makeString("just");

    private static final SubLString $$$Trigger_Test_Setup = makeString("Trigger Test Setup");

    private static final SubLString $str504$Support_to_trigger__ = makeString("Support to trigger :");

    private static final SubLString $str505$Please_select_a_rule_to_trigger__ = makeString("Please select a rule to trigger :");

    private static final SubLString $str506$_Trigger_ = makeString("[Trigger]");

    private static final SubLString $str507$There_are_currently_no_rules_in_y = makeString("There are currently no rules in your history.");

    private static final SubLString $str508$Rule_to_trigger__ = makeString("Rule to trigger :");

    private static final SubLString $str509$Please_select_a_support_to_trigge = makeString("Please select a support to trigger :");

    private static final SubLString $str510$There_are_currently_no_supports_i = makeString("There are currently no supports in your history.");

    private static final SubLString $str511$Time_to_implement_cb_trigger_test = makeString("Time to implement cb-trigger-test-unspecified");

    private static final SubLSymbol $cb_proof_checker_rules$ = makeSymbol("*CB-PROOF-CHECKER-RULES*");

    private static final SubLString $str514$Assertion_specified_was_not_a_rul = makeString("Assertion specified was not a rule");

    private static final SubLString $str515$Rule_has_been_added_to_proof_chec = makeString("Rule has been added to proof checker rule set.");

    private static final SubLSymbol CB_USE_IN_PROOF = makeSymbol("CB-USE-IN-PROOF");

    private static final SubLString $str518$_Use_in_Proof_ = makeString("[Use in Proof]");

    private static final SubLString $str519$cb_use_in_proof__a = makeString("cb-use-in-proof&~a");

    private static final SubLSymbol CB_LINK_USE_IN_PROOF = makeSymbol("CB-LINK-USE-IN-PROOF");

    private static final SubLString $str521$_a_does_not_specify_a_rule = makeString("~a does not specify a rule");

    private static final SubLSymbol CB_REINFORCE_RULE = makeSymbol("CB-REINFORCE-RULE");

    private static final SubLString $str523$_Reinforce_ = makeString("[Reinforce]");

    private static final SubLString $str524$cb_reinforce_rule__a = makeString("cb-reinforce-rule&~a");

    private static final SubLSymbol CB_LINK_REINFORCE_RULE = makeSymbol("CB-LINK-REINFORCE-RULE");

    private static final SubLSymbol $STRENGTH_INPUT_NAME = makeKeyword("STRENGTH-INPUT-NAME");

    private static final SubLSymbol $DIRECTION_INPUT_NAME = makeKeyword("DIRECTION-INPUT-NAME");

    private static final SubLString $str529$Strength__ = makeString("Strength :");

    private static final SubLString $str530$_default_strength = makeString(":default-strength");

    private static final SubLString $str531$_monotonic_strength = makeString(":monotonic-strength");

    private static final SubLString $str532$Direction__ = makeString("Direction :");

    private static final SubLString $str533$_ = makeString("[");

    private static final SubLString $str534$_ = makeString("]");

    private static final SubLString $str536$cb_assertion_graph__A = makeString("cb-assertion-graph&~A");

    private static final SubLSymbol CB_LINK_ASSERTION_GRAPH = makeSymbol("CB-LINK-ASSERTION-GRAPH");

    private static final SubLSymbol CB_ASSERTION_GRAPH = makeSymbol("CB-ASSERTION-GRAPH");

    private static final SubLString $$$Graph_of_an_assertion = makeString("Graph of an assertion");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str542$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLString $str543$Graph_for_ = makeString("Graph for:");

    private static final SubLString $$$Rule_Graph = makeString("Rule Graph");

    private static final SubLString $$$Unknown_Graph = makeString("Unknown Graph");

    private static final SubLString $str546$_a = makeString("~a");



    private static final SubLSymbol BBF_RULE = makeSymbol("BBF-RULE");

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLInteger $int$600 = makeInteger(600);

    // Definitions
    public static final SubLObject cb_change_mt_hook_alt(SubLObject assertion, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_change_assertion_mt(assertion, new_mt, meta_assertions_to_preserve);
    }

    // Definitions
    public static SubLObject cb_change_mt_hook(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_change_assertion_mt(assertion, new_mt, meta_assertions_to_preserve);
    }

    public static final SubLObject cb_change_strength_hook_alt(SubLObject assertion, SubLObject strength) {
        return ke.ke_change_assertion_strength(assertion, strength);
    }

    public static SubLObject cb_change_strength_hook(final SubLObject assertion, final SubLObject strength) {
        return ke.ke_change_assertion_strength(assertion, strength);
    }

    public static final SubLObject cb_change_direction_hook_alt(SubLObject assertion, SubLObject direction) {
        return ke.ke_change_assertion_direction(assertion, direction);
    }

    public static SubLObject cb_change_direction_hook(final SubLObject assertion, final SubLObject direction) {
        return ke.ke_change_assertion_direction(assertion, direction);
    }

    public static final SubLObject cb_repropagate_hook_alt(SubLObject assertion) {
        return ke.ke_repropagate_assertion(assertion);
    }

    public static SubLObject cb_repropagate_hook(final SubLObject assertion) {
        return ke.ke_repropagate_assertion(assertion);
    }

    public static final SubLObject cb_repropagate_browsably_hook_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $browse_forward_inferencesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
                    try {
                        $browse_forward_inferencesP$.bind(T, thread);
                        forward.$forward_inference_browsing_callback$.bind(CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
                        cb_forward_inference_browser.prepare_to_browse_new_forward_inference(assertion);
                        result = ke.ke_repropagate_assertion_now(assertion);
                        cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
                    } finally {
                        forward.$forward_inference_browsing_callback$.rebind(_prev_bind_1, thread);
                        $browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cb_repropagate_browsably_hook(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $browse_forward_inferencesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
        final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding(thread);
        try {
            $browse_forward_inferencesP$.bind(T, thread);
            forward.$forward_inference_browsing_callback$.bind(CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
            forward.$forward_inference_browsing_callback_more_infoP$.bind(T, thread);
            cb_forward_inference_browser.prepare_to_browse_new_forward_inference(assertion);
            result = ke.ke_repropagate_assertion_now(assertion);
            cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
        } finally {
            forward.$forward_inference_browsing_callback_more_infoP$.rebind(_prev_bind_3, thread);
            forward.$forward_inference_browsing_callback$.rebind(_prev_bind_2, thread);
            $browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject cb_recanonicalize_hook_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(fi.assertion_fi_ist_formula(assertion, UNPROVIDED), NIL);
        return ke.ke_recanonicalize_assertion(assertion, meta_assertions_to_preserve);
    }

    public static SubLObject cb_recanonicalize_hook(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(fi.assertion_fi_ist_formula(assertion, UNPROVIDED), NIL);
        return ke.ke_recanonicalize_assertion(assertion, meta_assertions_to_preserve);
    }

    public static final SubLObject cb_rename_variables_hook_alt(SubLObject assertion, SubLObject rename_variable_alist) {
        return ke.ke_rename_variables(uncanonicalizer.assertion_el_formula(assertion), rename_variable_alist, assertions_high.assertion_mt(assertion));
    }

    public static SubLObject cb_rename_variables_hook(final SubLObject assertion, final SubLObject rename_variable_alist) {
        return ke.ke_rename_variables(uncanonicalizer.assertion_el_formula(assertion), rename_variable_alist, assertions_high.assertion_mt(assertion));
    }

    public static final SubLObject cb_edit_assertion_hook(SubLObject assertion, SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
        if (NIL != meta_assertions_to_preserve) {
            return ke.ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, sentence, mt, strength, direction);
        } else {
            return ke.ke_edit_assertion(assertion, sentence, mt, strength, direction);
        }
    }

    public static SubLObject cb_edit_assertion_hook(final SubLObject assertion, final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject meta_assertions_to_preserve, SubLObject sentence_string_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        if (sentence_string_to_preserve == UNPROVIDED) {
            sentence_string_to_preserve = NIL;
        }
        SubLObject result = NIL;
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
        if (NIL != meta_assertions_to_preserve) {
            result = ke.ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, sentence, mt, strength, direction);
        } else {
            result = ke.ke_edit_assertion(assertion, sentence, mt, strength, direction);
        }
        if ((NIL != result) && sentence_string_to_preserve.isString()) {
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string_to_preserve, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject cb_null_edit_assertion_hook_alt(SubLObject assertion) {
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            return cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
        } else {
            return ke.ke_reassert_assertion(assertion, assertions_high.assertion_strength(assertion), assertions_high.assertion_direction(assertion));
        }
    }

    public static SubLObject cb_null_edit_assertion_hook(final SubLObject assertion) {
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            return cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
        }
        return ke.ke_reassert_assertion(assertion, assertions_high.assertion_strength(assertion), assertions_high.assertion_direction(assertion));
    }

    public static final SubLObject cb_edit_assertion_strings_hook_alt(SubLObject assertion, SubLObject sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_edit_assertion_strings(assertion, sentence, meta_assertions_to_preserve);
    }

    public static SubLObject cb_edit_assertion_strings_hook(final SubLObject assertion, final SubLObject sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_edit_assertion_strings(assertion, sentence, meta_assertions_to_preserve);
    }

    public static final SubLObject cb_assertion_spec_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_assertion_spec_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cb_assertion_spec_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cb_assertion_spec_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_native.class ? T : NIL;
    }

    public static final SubLObject assertion_spec_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField2();
    }

    public static SubLObject assertion_spec_sentence(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject assertion_spec_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField3();
    }

    public static SubLObject assertion_spec_mt(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject assertion_spec_strength_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField4();
    }

    public static SubLObject assertion_spec_strength(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject assertion_spec_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField5();
    }

    public static SubLObject assertion_spec_direction(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject assertion_spec_unasserts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField6();
    }

    public static SubLObject assertion_spec_unasserts(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject assertion_spec_metas_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.getField7();
    }

    public static SubLObject assertion_spec_metas(final SubLObject v_object) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_assertion_spec_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_assertion_spec_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_assertion_spec_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_assertion_spec_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_assertion_spec_strength_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_assertion_spec_strength(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_assertion_spec_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_assertion_spec_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_assertion_spec_unasserts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_assertion_spec_unasserts(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_assertion_spec_metas_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CB_ASSERTION_SPEC_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_assertion_spec_metas(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_assertion_spec_p(v_object) : "! cb_assertion_editor.cb_assertion_spec_p(v_object) " + "cb_assertion_editor.cb_assertion_spec_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_cb_assertion_spec_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_assertion_spec_sentence(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MT)) {
                            _csetf_assertion_spec_mt(v_new, current_value);
                        } else {
                            if (pcase_var.eql($STRENGTH)) {
                                _csetf_assertion_spec_strength(v_new, current_value);
                            } else {
                                if (pcase_var.eql($DIRECTION)) {
                                    _csetf_assertion_spec_direction(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($UNASSERTS)) {
                                        _csetf_assertion_spec_unasserts(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($METAS)) {
                                            _csetf_assertion_spec_metas(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt27$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cb_assertion_spec(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCE)) {
                _csetf_assertion_spec_sentence(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_assertion_spec_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($STRENGTH)) {
                        _csetf_assertion_spec_strength(v_new, current_value);
                    } else
                        if (pcase_var.eql($DIRECTION)) {
                            _csetf_assertion_spec_direction(v_new, current_value);
                        } else
                            if (pcase_var.eql($UNASSERTS)) {
                                _csetf_assertion_spec_unasserts(v_new, current_value);
                            } else
                                if (pcase_var.eql($METAS)) {
                                    _csetf_assertion_spec_metas(v_new, current_value);
                                } else {
                                    Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cb_assertion_spec(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CB_ASSERTION_SPEC, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, assertion_spec_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, assertion_spec_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $STRENGTH, assertion_spec_strength(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, assertion_spec_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $UNASSERTS, assertion_spec_unasserts(obj));
        funcall(visitor_fn, obj, $SLOT, $METAS, assertion_spec_metas(obj));
        funcall(visitor_fn, obj, $END, MAKE_CB_ASSERTION_SPEC, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cb_assertion_spec_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_assertion_spec(obj, visitor_fn);
    }

    public static final SubLObject new_cb_assertion_spec_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject unasserts, SubLObject metas) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (unasserts == UNPROVIDED) {
            unasserts = NIL;
        }
        if (metas == UNPROVIDED) {
            metas = NIL;
        }
        return make_cb_assertion_spec(list(new SubLObject[]{ $SENTENCE, sentence, $MT, mt, $STRENGTH, strength, $DIRECTION, direction, $UNASSERTS, unasserts, $METAS, metas }));
    }

    public static SubLObject new_cb_assertion_spec(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction, SubLObject unasserts, SubLObject metas) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (unasserts == UNPROVIDED) {
            unasserts = NIL;
        }
        if (metas == UNPROVIDED) {
            metas = NIL;
        }
        return make_cb_assertion_spec(list(new SubLObject[]{ $SENTENCE, sentence, $MT, mt, $STRENGTH, strength, $DIRECTION, direction, $UNASSERTS, unasserts, $METAS, metas }));
    }

    /**
     * Assert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.
     * Ignore the unasserts and metas of CB-ASSERTION-SPEC.
     */
    @LispMethod(comment = "Assert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.\r\nIgnore the unasserts and metas of CB-ASSERTION-SPEC.\nAssert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.\nIgnore the unasserts and metas of CB-ASSERTION-SPEC.")
    public static final SubLObject ke_assert_assertion_spec_alt(SubLObject cb_assertion_spec) {
        SubLTrampolineFile.checkType(cb_assertion_spec, CB_ASSERTION_SPEC_P);
        {
            SubLObject sentence = assertion_spec_sentence(cb_assertion_spec);
            SubLObject mt = assertion_spec_mt(cb_assertion_spec);
            SubLObject strength = assertion_spec_strength(cb_assertion_spec);
            SubLObject direction = assertion_spec_direction(cb_assertion_spec);
            return ke.ke_assert(sentence, mt, strength, direction);
        }
    }

    /**
     * Assert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.
     * Ignore the unasserts and metas of CB-ASSERTION-SPEC.
     */
    @LispMethod(comment = "Assert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.\r\nIgnore the unasserts and metas of CB-ASSERTION-SPEC.\nAssert the sentence of CB-ASSERTION-SPEC in its mt with its strength and direction.\nIgnore the unasserts and metas of CB-ASSERTION-SPEC.")
    public static SubLObject ke_assert_assertion_spec(final SubLObject cb_assertion_spec) {
        assert NIL != cb_assertion_spec_p(cb_assertion_spec) : "! cb_assertion_editor.cb_assertion_spec_p(cb_assertion_spec) " + ("cb_assertion_editor.cb_assertion_spec_p(cb_assertion_spec) " + "CommonSymbols.NIL != cb_assertion_editor.cb_assertion_spec_p(cb_assertion_spec) ") + cb_assertion_spec;
        final SubLObject sentence = assertion_spec_sentence(cb_assertion_spec);
        final SubLObject mt = assertion_spec_mt(cb_assertion_spec);
        final SubLObject strength = assertion_spec_strength(cb_assertion_spec);
        final SubLObject direction = assertion_spec_direction(cb_assertion_spec);
        return ke.ke_assert(sentence, mt, strength, direction);
    }

    public static final SubLObject cb_note_edit_change_alt(SubLObject message, SubLObject queue_usedP, SubLObject back, SubLObject delay) {
        if (back == UNPROVIDED) {
            back = TWO_INTEGER;
        }
        if (delay == UNPROVIDED) {
            delay = $int$2000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject final_message = NIL;
                if ((NIL != queue_usedP) && (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread))) {
                    final_message = format(NIL, $str_alt29$_a_operation_was_added_to_queue, message);
                } else {
                    final_message = format(NIL, $str_alt30$_a_operation_completed, message);
                }
                if (back.eql(ONE_INTEGER)) {
                    return cb_simple_message_page(final_message, back, delay);
                } else {
                    return cb_message_page_with_history(final_message, T);
                }
            }
        }
    }

    public static SubLObject cb_note_edit_change(final SubLObject message, final SubLObject queue_usedP, SubLObject back, SubLObject delay) {
        if (back == UNPROVIDED) {
            back = TWO_INTEGER;
        }
        if (delay == UNPROVIDED) {
            delay = $int$2000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject final_message = NIL;
        if ((NIL != queue_usedP) && (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread))) {
            final_message = format(NIL, $str35$_a_operation_was_added_to_queue, message);
        } else {
            final_message = format(NIL, $str36$_a_operation_completed, message);
        }
        if (back.eql(ONE_INTEGER)) {
            return cb_simple_message_page(final_message, back, delay);
        }
        return cb_message_page_with_history(final_message, T);
    }

    /**
     * Explain why SENTENCE in MT is not well-formed, and, if we can find a way of repairing it, provide the option of doing so.
     */
    @LispMethod(comment = "Explain why SENTENCE in MT is not well-formed, and, if we can find a way of repairing it, provide the option of doing so.")
    public static final SubLObject cb_attempt_to_repair_and_assert_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject args, SubLObject violations) {
        {
            SubLObject metas = NIL;
            SubLObject bug_dependency_meta_assertion_spec = cb_new_bug_dependency_meta_assertion_spec_if_needed(sentence, mt, args, UNPROVIDED);
            if (NIL != bug_dependency_meta_assertion_spec) {
                metas = list(bug_dependency_meta_assertion_spec);
            }
            return cb_explain_why_not_wff(sentence, mt, violations, strength, direction, T, NIL, NIL, metas);
        }
    }

    /**
     * Explain why SENTENCE in MT is not well-formed, and, if we can find a way of repairing it, provide the option of doing so.
     */
    @LispMethod(comment = "Explain why SENTENCE in MT is not well-formed, and, if we can find a way of repairing it, provide the option of doing so.")
    public static SubLObject cb_attempt_to_repair_and_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject args, final SubLObject violations) {
        final SubLObject metas = NIL;
        return cb_explain_why_not_wff(sentence, mt, violations, strength, direction, T, NIL, NIL, metas);
    }

    /**
     *
     *
     * @param ATTEMPT-TO-REPAIR-AND-ASSERT?
     * 		booleanp; whether we provide the option
     * 		of repairing and then asserting the non-wff sentence.  The other optional args
     * 		apply only when this arg is non-nil.
     * @param PENDING-ASSERTIONS
     * 		stack-p; pending assertion-spec-p's that should be
     * 		reattempted as soon as this one is repaired and asserted
     * @param UNASSERTS
     * 		listp; assertion-p's that should be unasserted if SENTENCE
     * 		ends up being repaired and asserted (e.g. as part of an assertion edit)
     * @param METAS
     * 		listp; assertion-spec-p's for meta-assertions that should be
     * 		asserted on SENTENCE if and when it is successfully asserted
     */
    @LispMethod(comment = "@param ATTEMPT-TO-REPAIR-AND-ASSERT?\r\n\t\tbooleanp; whether we provide the option\r\n\t\tof repairing and then asserting the non-wff sentence.  The other optional args\r\n\t\tapply only when this arg is non-nil.\r\n@param PENDING-ASSERTIONS\r\n\t\tstack-p; pending assertion-spec-p\'s that should be\r\n\t\treattempted as soon as this one is repaired and asserted\r\n@param UNASSERTS\r\n\t\tlistp; assertion-p\'s that should be unasserted if SENTENCE\r\n\t\tends up being repaired and asserted (e.g. as part of an assertion edit)\r\n@param METAS\r\n\t\tlistp; assertion-spec-p\'s for meta-assertions that should be\r\n\t\tasserted on SENTENCE if and when it is successfully asserted")
    public static final SubLObject cb_explain_why_not_wff_alt(SubLObject sentence, SubLObject mt, SubLObject violations, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions, SubLObject unasserts, SubLObject metas) {
        if (violations == UNPROVIDED) {
            violations = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (attempt_to_repair_and_assertP == UNPROVIDED) {
            attempt_to_repair_and_assertP = NIL;
        }
        if (pending_assertions == UNPROVIDED) {
            pending_assertions = NIL;
        }
        if (unasserts == UNPROVIDED) {
            unasserts = NIL;
        }
        if (metas == UNPROVIDED) {
            metas = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pending_assertions) {
                SubLTrampolineFile.checkType(pending_assertions, STACK_P);
            } else {
                pending_assertions = stacks.create_stack();
            }
            {
                SubLObject explanation_of_why_not_wff = wff.explanation_of_why_not_wff(sentence, mt, list($IO_MODE, $NL, $VIOLATIONS, violations));
                SubLObject repairs = wff_suggest.non_wffness_repairs(sentence, mt);
                SubLObject old_pending_assertions_list = stacks.stack_elements(pending_assertions);
                SubLObject title_var = $str_alt37$Sentence_not_Well_Formed;
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
                                    html_markup($str_alt40$yui_skin_sam);
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
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt41$Mt___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt42$Sentence___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                cb_form(sentence, ZERO_INTEGER, T);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt43$Repairs___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                if (NIL != list_utilities.non_empty_list_p(repairs)) {
                                                    stacks.stack_push(new_cb_assertion_spec(sentence, mt, strength, direction, unasserts, metas), pending_assertions);
                                                    {
                                                        SubLObject cdolist_list_var = repairs;
                                                        SubLObject repair = NIL;
                                                        for (repair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , repair = cdolist_list_var.first()) {
                                                            cb_wff_repair_advice(repair, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
                                                        }
                                                    }
                                                } else {
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                    html_princ($str_alt44$No_repairs_available___Could_not_);
                                                    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                }
                                                html_macros.verify_not_within_html_pre();
                                                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_4 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt45$Explanation__);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_princ_doc_string(explanation_of_why_not_wff, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                if (NIL != list_utilities.non_empty_list_p(old_pending_assertions_list)) {
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt46$Stack_of_pending_assertions_depen);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject cdolist_list_var = reverse(old_pending_assertions_list);
                                                        SubLObject assertion_spec = NIL;
                                                        for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject pending_sentence = assertion_spec_sentence(assertion_spec);
                                                                SubLObject pending_mt = assertion_spec_mt(assertion_spec);
                                                                cb_form(pending_sentence, ZERO_INTEGER, T);
                                                                html_princ($str_alt47$__in_);
                                                                cb_form(pending_mt, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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

    /**
     *
     *
     * @param ATTEMPT-TO-REPAIR-AND-ASSERT?
     * 		booleanp; whether we provide the option
     * 		of repairing and then asserting the non-wff sentence.  The other optional args
     * 		apply only when this arg is non-nil.
     * @param PENDING-ASSERTIONS
     * 		stack-p; pending assertion-spec-p's that should be
     * 		reattempted as soon as this one is repaired and asserted
     * @param UNASSERTS
     * 		listp; assertion-p's that should be unasserted if SENTENCE
     * 		ends up being repaired and asserted (e.g. as part of an assertion edit)
     * @param METAS
     * 		listp; assertion-spec-p's for meta-assertions that should be
     * 		asserted on SENTENCE if and when it is successfully asserted
     */
    @LispMethod(comment = "@param ATTEMPT-TO-REPAIR-AND-ASSERT?\r\n\t\tbooleanp; whether we provide the option\r\n\t\tof repairing and then asserting the non-wff sentence.  The other optional args\r\n\t\tapply only when this arg is non-nil.\r\n@param PENDING-ASSERTIONS\r\n\t\tstack-p; pending assertion-spec-p\'s that should be\r\n\t\treattempted as soon as this one is repaired and asserted\r\n@param UNASSERTS\r\n\t\tlistp; assertion-p\'s that should be unasserted if SENTENCE\r\n\t\tends up being repaired and asserted (e.g. as part of an assertion edit)\r\n@param METAS\r\n\t\tlistp; assertion-spec-p\'s for meta-assertions that should be\r\n\t\tasserted on SENTENCE if and when it is successfully asserted")
    public static SubLObject cb_explain_why_not_wff(final SubLObject sentence, final SubLObject mt, SubLObject violations, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions, SubLObject unasserts, SubLObject metas) {
        if (violations == UNPROVIDED) {
            violations = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (attempt_to_repair_and_assertP == UNPROVIDED) {
            attempt_to_repair_and_assertP = NIL;
        }
        if (pending_assertions == UNPROVIDED) {
            pending_assertions = NIL;
        }
        if (unasserts == UNPROVIDED) {
            unasserts = NIL;
        }
        if (metas == UNPROVIDED) {
            metas = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pending_assertions) {
            assert NIL != stacks.stack_p(pending_assertions) : "! stacks.stack_p(pending_assertions) " + ("stacks.stack_p(pending_assertions) " + "CommonSymbols.NIL != stacks.stack_p(pending_assertions) ") + pending_assertions;
        } else {
            pending_assertions = stacks.create_stack();
        }
        final SubLObject explanation_of_why_not_wff = wff.explanation_of_why_not_wff(sentence, mt, list($IO_MODE, $NL, $VIOLATIONS, violations));
        final SubLObject repairs = wff_suggest.non_wffness_repairs(sentence, mt);
        final SubLObject old_pending_assertions_list = stacks.stack_elements(pending_assertions);
        final SubLObject title_var = $str43$Sentence_not_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str50$yui_skin_sam);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str55$Mt___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_form(mt, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str56$Sentence___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_form(sentence, ZERO_INTEGER, T);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str57$Repairs___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (NIL != list_utilities.non_empty_list_p(repairs)) {
                                stacks.stack_push(new_cb_assertion_spec(sentence, mt, strength, direction, unasserts, metas), pending_assertions);
                                SubLObject cdolist_list_var = repairs;
                                SubLObject repair = NIL;
                                repair = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cb_wff_repair_advice(repair, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    repair = cdolist_list_var.first();
                                } 
                            } else {
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_princ($str58$No_repairs_available___Could_not_);
                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            }
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str59$Explanation__);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str60$wff_explain);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ_doc_string(explanation_of_why_not_wff, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            if (NIL != list_utilities.non_empty_list_p(old_pending_assertions_list)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str61$Stack_of_pending_assertions_depen);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                SubLObject cdolist_list_var = reverse(old_pending_assertions_list);
                                SubLObject assertion_spec = NIL;
                                assertion_spec = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject pending_sentence = assertion_spec_sentence(assertion_spec);
                                    final SubLObject pending_mt = assertion_spec_mt(assertion_spec);
                                    cb_form(pending_sentence, ZERO_INTEGER, T);
                                    html_princ($$$__in_);
                                    cb_form(pending_mt, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertion_spec = cdolist_list_var.first();
                                } 
                            }
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

    public static final SubLObject cb_wff_repair_advice_alt(SubLObject repair_sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            {
                SubLObject existing_assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        existing_assertions = czer_meta.find_assertions_cycl(repair_sentence, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                existing_assertions = list_utilities.delete_if_not(symbol_function($sym50$ASSERTED_ASSERTION_), existing_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.empty_list_p(existing_assertions)) {
                    cb_wff_repair_advise_assertion_creation(repair_sentence, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
                } else {
                    cb_wff_repair_advise_assertion_creation_or_lift(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
                }
            }
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_wff_repair_advice(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        SubLObject existing_assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            existing_assertions = czer_meta.find_assertions_cycl(repair_sentence, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        existing_assertions = list_utilities.delete_if_not(symbol_function($sym65$ASSERTED_ASSERTION_), existing_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.empty_list_p(existing_assertions)) {
            cb_wff_repair_advise_assertion_creation(repair_sentence, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
        } else {
            cb_wff_repair_advise_assertion_creation_or_lift(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
        }
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_wff_repair_advise_assertion_creation_alt(SubLObject repair_sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions) {
        html_princ($str_alt51$The_fact_);
        cb_form(repair_sentence, ZERO_INTEGER, T);
        html_princ($str_alt52$_must_be_added_to_);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_princ($str_alt53$_in_order_for_the_above_sentence_);
        if (NIL != attempt_to_repair_and_assertP) {
            {
                SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_repair_advise_assertion_creation(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        html_princ($$$The_fact_);
        cb_form(repair_sentence, ZERO_INTEGER, T);
        html_princ($$$_must_be_added_to_);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_princ($str68$_in_order_for_the_above_sentence_);
        if (NIL != attempt_to_repair_and_assertP) {
            final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_wff_repair_advise_assertion_creation_or_lift_alt(SubLObject repair_sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject existing_assertions, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions) {
        {
            SubLObject existing_assertions_in_spec_mts = assertions_in_spec_mts_among(mt, existing_assertions);
            if (NIL != list_utilities.empty_list_p(existing_assertions_in_spec_mts)) {
                cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
            } else {
                cb_wff_repair_advise_assertion_lift_from_spec_mt(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, attempt_to_repair_and_assertP, pending_assertions);
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLObject existing_assertions_in_spec_mts = assertions_in_spec_mts_among(mt, existing_assertions);
        if (NIL != list_utilities.empty_list_p(existing_assertions_in_spec_mts)) {
            cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
        } else {
            cb_wff_repair_advise_assertion_lift_from_spec_mt(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, attempt_to_repair_and_assertP, pending_assertions);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; all assertions in ASSERTIONS whose assertion-mt is a specMt of MT
     */
    @LispMethod(comment = "@return listp; all assertions in ASSERTIONS whose assertion-mt is a specMt of MT")
    public static final SubLObject assertions_in_spec_mts_among_alt(SubLObject mt, SubLObject assertions) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                    if (NIL != genl_mts.genl_mtP(assertion_mt, mt, UNPROVIDED, UNPROVIDED)) {
                        result = cons(assertion, result);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return listp; all assertions in ASSERTIONS whose assertion-mt is a specMt of MT
     */
    @LispMethod(comment = "@return listp; all assertions in ASSERTIONS whose assertion-mt is a specMt of MT")
    public static SubLObject assertions_in_spec_mts_among(final SubLObject mt, final SubLObject assertions) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            if (NIL != genl_mts.genl_mtP(assertion_mt, mt, UNPROVIDED, UNPROVIDED)) {
                result = cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt_alt(SubLObject repair_sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject existing_assertions, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions) {
        {
            SubLObject existing_assertions_mts = Mapping.mapcar(symbol_function(ASSERTION_MT), existing_assertions);
            SubLObject min_ceiling_mts = genl_mts.min_ceiling_mts(cons(mt, existing_assertions_mts), UNPROVIDED, UNPROVIDED);
            SubLObject min_ceiling_mt = (NIL != min_ceiling_mts) ? ((SubLObject) (number_utilities.minimum(min_ceiling_mts, symbol_function(GENERALITY_ESTIMATE)))) : NIL;
            html_princ($str_alt51$The_fact_);
            cb_form(repair_sentence, ZERO_INTEGER, T);
            html_princ($str_alt52$_must_be_added_to_);
            cb_form(mt, ZERO_INTEGER, NIL);
            html_princ($str_alt53$_in_order_for_the_above_sentence_);
            html_newline(UNPROVIDED);
            html_princ($str_alt57$That_fact_is_already_asserted_in_);
            cb_form_item_list(existing_assertions_mts);
            html_princ($str_alt58$_);
            html_newline(UNPROVIDED);
            if (NIL != min_ceiling_mt) {
                html_princ($str_alt59$You_can_repair_this_by_doing_eith);
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str_alt60$1__Lifting_the_assertion_to_);
                cb_form(min_ceiling_mt, UNPROVIDED, UNPROVIDED);
                if (NIL != attempt_to_repair_and_assertP) {
                    {
                        SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, min_ceiling_mt, strength, direction, existing_assertions, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str_alt61$2__Asserting_it_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
                html_princ($str_alt62$_as_well);
                if (NIL != attempt_to_repair_and_assertP) {
                    {
                        SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                html_princ($str_alt63$You_can_repair_this_by_doing_the_);
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str_alt64$Asserting_it_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
                if (NIL != attempt_to_repair_and_assertP) {
                    {
                        SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLObject existing_assertions_mts = Mapping.mapcar(symbol_function(ASSERTION_MT), existing_assertions);
        final SubLObject min_ceiling_mts = genl_mts.min_ceiling_mts(cons(mt, existing_assertions_mts), UNPROVIDED, UNPROVIDED);
        final SubLObject min_ceiling_mt = (NIL != min_ceiling_mts) ? number_utilities.minimum(min_ceiling_mts, symbol_function(GENERALITY_ESTIMATE)) : NIL;
        html_princ($$$The_fact_);
        cb_form(repair_sentence, ZERO_INTEGER, T);
        html_princ($$$_must_be_added_to_);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_princ($str68$_in_order_for_the_above_sentence_);
        html_newline(UNPROVIDED);
        html_princ($$$That_fact_is_already_asserted_in_);
        cb_form_item_list(existing_assertions_mts);
        html_princ($str73$_);
        html_newline(UNPROVIDED);
        if (NIL != min_ceiling_mt) {
            html_princ($str74$You_can_repair_this_by_doing_eith);
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str75$1__Lifting_the_assertion_to_);
            cb_form(min_ceiling_mt, UNPROVIDED, UNPROVIDED);
            if (NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, min_ceiling_mt, strength, direction, existing_assertions, UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str76$2__Asserting_it_in_);
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            html_princ($$$_as_well);
            if (NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            html_princ($str78$You_can_repair_this_by_doing_the_);
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($$$Asserting_it_in_);
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            if (NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_wff_repair_advise_assertion_lift_from_spec_mt_alt(SubLObject repair_sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject existing_assertions_in_spec_mts, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions) {
        html_princ($str_alt51$The_fact_);
        cb_form(repair_sentence, ZERO_INTEGER, T);
        html_princ($str_alt65$_must_be_lifted_to_);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_princ($str_alt53$_in_order_for_the_above_sentence_);
        html_newline(UNPROVIDED);
        html_princ($str_alt66$It_is_currently_asserted_in_the_f);
        {
            SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(ASSERTION_MT), existing_assertions_in_spec_mts);
            SubLObject spec_mt = NIL;
            for (spec_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_mt = cdolist_list_var.first()) {
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                cb_form(spec_mt, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != attempt_to_repair_and_assertP) {
            html_newline(UNPROVIDED);
            {
                SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, UNPROVIDED);
                cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_repair_advise_assertion_lift_from_spec_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions_in_spec_mts, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        html_princ($$$The_fact_);
        cb_form(repair_sentence, ZERO_INTEGER, T);
        html_princ($$$_must_be_lifted_to_);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_princ($str68$_in_order_for_the_above_sentence_);
        html_newline(UNPROVIDED);
        html_princ($str81$It_is_currently_asserted_in_the_f);
        SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(ASSERTION_MT), existing_assertions_in_spec_mts);
        SubLObject spec_mt = NIL;
        spec_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_form(spec_mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            spec_mt = cdolist_list_var.first();
        } 
        if (NIL != attempt_to_repair_and_assertP) {
            html_newline(UNPROVIDED);
            final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, UNPROVIDED);
            cb_link($REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_link_repair_and_reattempt_alt(SubLObject repair_assertion_spec, SubLObject assertion_stack, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt67$_Make_this_repair_and_then_reatte;
            }
            {
                SubLObject repair_assertion_spec_id = cb_glob_id(repair_assertion_spec);
                SubLObject assertion_stack_id = cb_glob_id(assertion_stack);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$cb_repair_and_reattempt__A__A, repair_assertion_spec_id, assertion_stack_id);
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
            return assertion_stack;
        }
    }

    public static SubLObject cb_link_repair_and_reattempt(final SubLObject repair_assertion_spec, final SubLObject assertion_stack, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str82$_Make_this_repair_and_then_reatte;
        }
        final SubLObject repair_assertion_spec_id = cb_glob_id(repair_assertion_spec);
        final SubLObject assertion_stack_id = cb_glob_id(assertion_stack);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str84$cb_repair_and_reattempt__A__A, repair_assertion_spec_id, assertion_stack_id);
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
        return assertion_stack;
    }

    public static final SubLObject cb_repair_and_reattempt_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
            return NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject repair_assertion_spec_id = NIL;
            SubLObject assertion_stack_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            repair_assertion_spec_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            assertion_stack_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject repair_assertion_spec = cb_glob_lookup_by_string(repair_assertion_spec_id);
                    SubLObject assertion_stack = cb_glob_lookup_by_string(assertion_stack_id);
                    SubLObject found_non_wffP = NIL;
                    stacks.stack_push(repair_assertion_spec, assertion_stack);
                    while ((NIL == stacks.stack_empty_p(assertion_stack)) && (NIL == found_non_wffP)) {
                        {
                            SubLObject assertion_spec = stacks.stack_pop(assertion_stack);
                            SubLObject sentence = assertion_spec_sentence(assertion_spec);
                            SubLObject mt = assertion_spec_mt(assertion_spec);
                            SubLObject strength = assertion_spec_strength(assertion_spec);
                            SubLObject direction = assertion_spec_direction(assertion_spec);
                            SubLObject unasserts = assertion_spec_unasserts(assertion_spec);
                            SubLObject metas = assertion_spec_metas(assertion_spec);
                            SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                            if (NIL != wff_violations) {
                                cb_explain_why_not_wff(sentence, mt, wff_violations, strength, direction, T, assertion_stack, UNPROVIDED, UNPROVIDED);
                                found_non_wffP = T;
                            } else {
                                ke.ke_assert_now(sentence, mt, strength, direction);
                                cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
                                {
                                    SubLObject cdolist_list_var = unasserts;
                                    SubLObject unassert = NIL;
                                    for (unassert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unassert = cdolist_list_var.first()) {
                                        ke.ke_unassert_assertion(unassert);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = metas;
                                    SubLObject meta = NIL;
                                    for (meta = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta = cdolist_list_var.first()) {
                                        ke_assert_assertion_spec(meta);
                                    }
                                }
                            }
                        }
                    } 
                    if (NIL == found_non_wffP) {
                        cb_message_page_with_history($str_alt73$Repair_and_assert_operations_comp, T);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt72);
            }
        }
        return NIL;
    }

    public static SubLObject cb_repair_and_reattempt(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
            return NIL;
        }
        SubLObject repair_assertion_spec_id = NIL;
        SubLObject assertion_stack_id = NIL;
        destructuring_bind_must_consp(args, args, $list87);
        repair_assertion_spec_id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list87);
        assertion_stack_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject repair_assertion_spec = cb_glob_lookup_by_string(repair_assertion_spec_id);
            final SubLObject assertion_stack = cb_glob_lookup_by_string(assertion_stack_id);
            SubLObject found_non_wffP = NIL;
            stacks.stack_push(repair_assertion_spec, assertion_stack);
            while ((NIL == stacks.stack_empty_p(assertion_stack)) && (NIL == found_non_wffP)) {
                final SubLObject assertion_spec = stacks.stack_pop(assertion_stack);
                final SubLObject sentence = assertion_spec_sentence(assertion_spec);
                final SubLObject mt = assertion_spec_mt(assertion_spec);
                final SubLObject strength = assertion_spec_strength(assertion_spec);
                final SubLObject direction = assertion_spec_direction(assertion_spec);
                final SubLObject unasserts = assertion_spec_unasserts(assertion_spec);
                final SubLObject metas = assertion_spec_metas(assertion_spec);
                final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                if (NIL != wff_violations) {
                    cb_explain_why_not_wff(sentence, mt, wff_violations, strength, direction, T, assertion_stack, UNPROVIDED, UNPROVIDED);
                    found_non_wffP = T;
                } else {
                    ke.ke_assert_now(sentence, mt, strength, direction);
                    cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
                    SubLObject cdolist_list_var = unasserts;
                    SubLObject unassert = NIL;
                    unassert = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ke.ke_unassert_assertion(unassert);
                        cdolist_list_var = cdolist_list_var.rest();
                        unassert = cdolist_list_var.first();
                    } 
                    cdolist_list_var = metas;
                    SubLObject meta = NIL;
                    meta = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ke_assert_assertion_spec(meta);
                        cdolist_list_var = cdolist_list_var.rest();
                        meta = cdolist_list_var.first();
                    } 
                }
            } 
            if (NIL == found_non_wffP) {
                cb_message_page_with_history($str88$Repair_and_assert_operations_comp, T);
            }
        } else {
            cdestructuring_bind_error(args, $list87);
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_toolbar_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.assertion_p(assertion)) {
                {
                    SubLObject modification_permittedP = assertion_modification_permittedP(assertion);
                    SubLObject forwardP = assertions_high.forward_assertionP(assertion);
                    SubLObject ruleP = assertions_high.rule_assertionP(assertion);
                    SubLObject assertedP = assertions_high.asserted_assertionP(assertion);
                    SubLObject deducedP = assertions_high.deduced_assertionP(assertion);
                    SubLObject non_modifiable_via_fiP = makeBoolean(NIL == modification_permittedP);
                    SubLObject has_meta_assertionsP = assertion_utilities.assertion_has_meta_assertionsP(assertion);
                    cb_help_preamble($CB_AF, UNPROVIDED, UNPROVIDED);
                    if (NIL == $cb_a_show_english$.getDynamicValue(thread)) {
                        cb_link($SHOW_ENGLISH, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL == $cb_a_show_el_formula$.getDynamicValue(thread)) {
                        cb_link($SHOW_EL_FORMULA, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL != $cb_a_include_kif_link$.getDynamicValue(thread)) {
                        cb_link($ASSERTION_KIF_FORMULA, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    cb_link($WFF_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($DIAGNOSE_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($MODUSTOLLENS_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($DESCRIBE_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($FIND_SIMILAR_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != assertedP)) {
                        html_newline(UNPROVIDED);
                        cb_link($CHANGE_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        cb_link($CHANGE_STRENGTH, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        cb_link($CHANGE_DIRECTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        if (NIL != has_meta_assertionsP) {
                            cb_link($CHANGE_META_ASSERTION_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                        if (NIL != assertions_high.assertion_el_variables(assertion)) {
                            if (NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP(assertion)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_link($RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                cb_link($RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            }
                            html_indent(UNPROVIDED);
                        }
                    }
                    if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                        html_newline(UNPROVIDED);
                        cb_link($ASSERT_SIMILAR, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        cb_link($ASSERT_META, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        if ((NIL != assertedP) && (NIL != cb_fix_typo_assertionP(assertion))) {
                            cb_link($FIX_TYPO, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                        if (NIL != assertedP) {
                            cb_link($EDIT_ASSERTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                        if (NIL != assertedP) {
                            cb_link($PRECISION_SUGGEST, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                        cb_link($REASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        if (NIL != assertedP) {
                            cb_link($UNASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                        if (NIL != assertions_high.assertion_arguments(assertion)) {
                            cb_link($BLAST, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                    }
                    if (NIL != assertions_high.rule_assertionP(assertion)) {
                        {
                            SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                            html_newline(UNPROVIDED);
                            if (NIL != clauses.neg_lits(rule_cnf)) {
                                cb_link($ANTECEDENT_QUERY, assertion, $str_alt99$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                            }
                            if (NIL != clauses.pos_lits(rule_cnf)) {
                                cb_link($RULE_KNOWN_EXTENT_QUERY, assertion, $str_alt101$_Known_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                            }
                            if (NIL != clauses.pos_lits(rule_cnf)) {
                                cb_link($RULE_UNKNOWN_EXTENT_QUERY, assertion, $str_alt103$_Unknown_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                            }
                            cb_link($ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                        }
                    }
                    html_newline(UNPROVIDED);
                    if (NIL != deducedP) {
                        cb_link($ASSERT_TMS, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL != deducedP) {
                        cb_link($JUSTIFY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != assertedP)) {
                        cb_link($RECANONICALIZE, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != forwardP)) {
                        cb_link($REPROPAGATE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != forwardP)) {
                        cb_link($REPROPAGATE_BROWSABLY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL == assertions_high.rule_assertionP(assertion)) {
                        cb_link($ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL != ruleP) {
                        cb_link($USE_IN_PROOF, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL != shop_main.shop_planning_assertionP(assertion)) {
                        cb_link($USE_IN_PLAN_CHECKING, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                    }
                    if (NIL != assertions_high.rule_assertionP(assertion)) {
                        cb_link($ASSERTION_GRAPH, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_toolbar(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject modification_permittedP = assertion_modification_permittedP(assertion);
            final SubLObject forwardP = assertions_high.forward_assertionP(assertion);
            final SubLObject ruleP = assertions_high.rule_assertionP(assertion);
            final SubLObject assertedP = assertions_high.asserted_assertionP(assertion);
            final SubLObject deducedP = assertions_high.deduced_assertionP(assertion);
            final SubLObject non_modifiable_via_fiP = makeBoolean(NIL == modification_permittedP);
            final SubLObject has_meta_assertionsP = assertion_utilities.assertion_has_meta_assertionsP(assertion);
            cb_help_preamble($CB_AF, UNPROVIDED, UNPROVIDED);
            if (NIL == $cb_a_show_english$.getDynamicValue(thread)) {
                cb_link($SHOW_ENGLISH, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL == $cb_a_show_el_formula$.getDynamicValue(thread)) {
                cb_link($SHOW_EL_FORMULA, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            cb_link($WFF_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            cb_link($FIND_SIMILAR_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != assertedP)) {
                html_newline(UNPROVIDED);
                cb_link($CHANGE_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_link($CHANGE_STRENGTH, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_link($CHANGE_DIRECTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                if (NIL != has_meta_assertionsP) {
                    cb_link($CHANGE_META_ASSERTION_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != assertions_high.assertion_el_variables(assertion)) {
                    if (NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP(assertion)) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_link($RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } else {
                        cb_link($RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    }
                    html_indent(UNPROVIDED);
                }
            }
            if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                html_newline(UNPROVIDED);
                cb_link($ASSERT_SIMILAR, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_link($ASSERT_META, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                if ((NIL != assertions_high.rule_assertionP(assertion)) && (NIL != pragma_induction.some_suggested_pragma_sentences_for_ruleP(assertion))) {
                    cb_link($SUGGEST_PRAGMAS, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if ((NIL != assertedP) && (NIL != cb_fix_typo_assertionP(assertion))) {
                    cb_link($FIX_TYPO, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != assertedP) {
                    cb_link($EDIT_ASSERTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                cb_link($REASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                if (NIL != assertedP) {
                    cb_link($UNASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != assertions_high.assertion_arguments(assertion)) {
                    cb_link($BLAST, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != assertions_high.deduced_assertionP(assertion)) {
                    cb_link($ASSERTION_PROOF_VIEW, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != assertions_high.rule_assertionP(assertion)) {
                final SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                html_newline(UNPROVIDED);
                if (NIL != clauses.neg_lits(rule_cnf)) {
                    cb_link($ANTECEDENT_QUERY, assertion, $str112$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != clauses.pos_lits(rule_cnf)) {
                    cb_link($RULE_KNOWN_EXTENT_QUERY, assertion, $str114$_Known_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != clauses.pos_lits(rule_cnf)) {
                    cb_link($RULE_UNKNOWN_EXTENT_QUERY, assertion, $str116$_Unknown_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                if (NIL != clauses.neg_lits(rule_cnf)) {
                    cb_link($TRIGGER_TEST, NIL, assertion, $str118$_Trigger_Test_, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
                cb_link($ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            html_newline(UNPROVIDED);
            if (NIL != deducedP) {
                cb_link($ASSERT_TMS, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != deducedP) {
                cb_link($JUSTIFY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != assertions_high.assertion_has_dependents_p(assertion)) {
                cb_link($ASSERTION_DEPENDENCIES, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != assertedP)) {
                cb_link($RECANONICALIZE, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                cb_link($TRIGGER_TEST, assertion, NIL, $str118$_Trigger_Test_, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != forwardP)) {
                cb_link($REPROPAGATE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if ((NIL != $cb_editing_enabled$.getDynamicValue(thread)) && (NIL != forwardP)) {
                cb_link($REPROPAGATE_BROWSABLY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != pph_templates.assertion_has_phrase_naut_argP(assertion))) {
                cb_link($TEST_GEN_TEMPLATE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL == assertions_high.rule_assertionP(assertion)) {
                cb_link($ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != ruleP) {
                cb_link($USE_IN_PROOF, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != shop_main.shop_planning_assertionP(assertion)) {
                cb_link($USE_IN_PLAN_CHECKING, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != assertions_high.rule_assertionP(assertion)) {
                cb_link($REINFORCE_RULE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject assertion_modification_permittedP_alt(SubLObject assertion) {
        if (NIL != assertions_high.code_assertionP(assertion)) {
            return NIL;
        } else {
            if (NIL == assertions_high.gaf_assertionP(assertion)) {
                return T;
            } else {
                return makeBoolean(NIL == isa.isaP(assertions_high.gaf_predicate(assertion), $const113$InferenceRelatedBookkeepingPredic, mt_vars.$inference_related_bookkeeping_predicate_mt$.getGlobalValue(), UNPROVIDED));
            }
        }
    }

    public static SubLObject assertion_modification_permittedP(final SubLObject assertion) {
        if (NIL != assertions_high.code_assertionP(assertion)) {
            return NIL;
        }
        if (NIL == assertions_high.gaf_assertionP(assertion)) {
            return T;
        }
        return makeBoolean(NIL == isa.isaP(assertions_high.gaf_predicate(assertion), $const130$InferenceRelatedBookkeepingPredic, mt_vars.$inference_related_bookkeeping_predicate_mt$.getGlobalValue(), UNPROVIDED));
    }

    /**
     * Output LINKTEXT indicating that it is a link which has been explicitly disabled
     */
    @LispMethod(comment = "Output LINKTEXT indicating that it is a link which has been explicitly disabled")
    public static final SubLObject cb_disabled_link_alt(SubLObject linktext) {
        html_princ(linktext);
        return NIL;
    }

    /**
     * Output LINKTEXT indicating that it is a link which has been explicitly disabled
     */
    @LispMethod(comment = "Output LINKTEXT indicating that it is a link which has been explicitly disabled")
    public static SubLObject cb_disabled_link(final SubLObject linktext) {
        html_princ(linktext);
        return NIL;
    }

    public static final SubLObject cb_change_mt_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Change_Assertion_Mt_page);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject assertion = cb_guess_assertion(id);
                            SubLObject mt = assertions_high.assertion_mt(assertion);
                            SubLObject title_var = $$$Change_Assertion_Mt;
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
                                                html_markup($str_alt40$yui_skin_sam);
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
                                                                html_hidden_input($str_alt119$cb_handle_change_mt, T, UNPROVIDED);
                                                                html_hidden_input($$$id, id, UNPROVIDED);
                                                                cb_help_preamble($CB_CHANGE_MT, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
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
                                                                                html_princ_strong($str_alt122$Note___This_assertion_has_meta_as);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                    html_newline(TWO_INTEGER);
                                                                }
                                                                cb_form_widgets.cb_mt_input_section(mt, $list_alt123);
                                                                cb_back_button($SELF, $$$Abort_Edit);
                                                                html_indent(UNPROVIDED);
                                                                html_reset_input($$$Current_Value);
                                                                html_indent(UNPROVIDED);
                                                                html_submit_input($$$Change_Mt, UNPROVIDED, UNPROVIDED);
                                                                cb_change_all_meta_assertions_mt_check(assertion);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt42$Sentence___);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                                                cb_tabulate_checkable_meta_assertions(assertion, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_change_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Change_Assertion_Mt_page);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject title_var = $$$Change_Assertion_Mt;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str50$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
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
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str137$cb_handle_change_mt, T, UNPROVIDED);
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                    cb_help_preamble($CB_CHANGE_MT, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                        final SubLObject color_val = $RED;
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != color_val) {
                                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(color_val));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ_strong($str140$Note___This_assertion_has_meta_as);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        html_newline(TWO_INTEGER);
                                    }
                                    cb_form_widgets.cb_mt_input_section(mt, $list141);
                                    cb_back_button($SELF, $$$Abort_Edit);
                                    html_indent(UNPROVIDED);
                                    html_reset_input($$$Current_Value);
                                    html_indent(UNPROVIDED);
                                    html_submit_input($$$Change_Mt, UNPROVIDED, UNPROVIDED);
                                    cb_change_all_meta_assertions_mt_check(assertion);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str56$Sentence___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                    cb_tabulate_checkable_meta_assertions(assertion, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_change_all_meta_assertions_mt_check_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                {
                    SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
                    SubLObject assertion_mt = NIL;
                    SubLObject meta_assertion_mt = NIL;
                    assertion_mt = assertions_high.assertion_mt(assertion);
                    {
                        SubLObject cdolist_list_var = all_meta_assertions;
                        SubLObject meta_assertion = NIL;
                        for (meta_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_assertion = cdolist_list_var.first()) {
                            meta_assertion_mt = assertions_high.assertion_mt(meta_assertion);
                            if (!assertion_mt.eql(meta_assertion_mt)) {
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_princ_strong($str_alt128$To_change_Mt_of_all_meta_assertio);
                                cb_link($CHANGE_META_ASSERTION_MT, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                return NIL;
                            }
                        }
                    }
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_checkbox_input($str_alt129$move_all_meta_assertions, $$$t, $cb_a_change_all_meta_assertions_mt_by_defaultP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ_strong($str_alt131$Change_the_Mt_of_all_meta_asserti);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_change_all_meta_assertions_mt_check(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
            SubLObject assertion_mt = NIL;
            SubLObject meta_assertion_mt = NIL;
            assertion_mt = assertions_high.assertion_mt(assertion);
            SubLObject cdolist_list_var = all_meta_assertions;
            SubLObject meta_assertion = NIL;
            meta_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                meta_assertion_mt = assertions_high.assertion_mt(meta_assertion);
                if (!assertion_mt.eql(meta_assertion_mt)) {
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_princ_strong($str146$To_change_Mt_of_all_meta_assertio);
                    cb_link($CHANGE_META_ASSERTION_MT, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                meta_assertion = cdolist_list_var.first();
            } 
            html_hr(UNPROVIDED, UNPROVIDED);
            html_checkbox_input($str147$move_all_meta_assertions, $$$t, $cb_a_change_all_meta_assertions_mt_by_defaultP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_princ_strong($str149$Change_the_Mt_of_all_meta_asserti);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_change_mt_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$change_microtheory);
                return NIL;
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                thread.resetMultipleValues();
                {
                    SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                    SubLObject mt_error = thread.secondMultipleValue();
                    SubLObject mt_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != mt_error) {
                        return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
                    }
                    if (NIL != hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(assertion))) {
                        return cb_error($str_alt133$Assertion_is_already_in__S, new_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject change_meta_assertion_mtP = html_extract_input($str_alt129$move_all_meta_assertions, args);
                        SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, $str_alt134$preserve_, NIL != change_meta_assertion_mtP ? ((SubLObject) (new_mt)) : NIL);
                        cb_change_mt_hook(assertion, new_mt, meta_assertions_to_preserve);
                    }
                    cb_note_edit_change($$$Change_Assertion_Mt, T, THREE_INTEGER, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_change_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$change_microtheory);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        thread.resetMultipleValues();
        final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        if (NIL != hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(assertion))) {
            return cb_error($str151$Assertion_is_already_in__S, new_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject change_meta_assertion_mtP = html_extract_input($str147$move_all_meta_assertions, args);
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, $str152$preserve_, NIL != change_meta_assertion_mtP ? new_mt : NIL);
        cb_change_mt_hook(assertion, new_mt, meta_assertions_to_preserve);
        cb_note_edit_change($$$Change_Assertion_Mt, T, THREE_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_change_mt_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt136$_Change_Mt_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$cb_change_mt__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_change_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str154$_Change_Mt_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str155$cb_change_mt__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_change_strength_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($str_alt141$the_Change_Assertion_Strength_pag);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject assertion = cb_guess_assertion(id);
                            SubLObject strength = assertions_high.assertion_strength(assertion);
                            SubLObject title_var = $$$Change_Assertion_Strength;
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
                                        SubLObject _prev_bind_0_9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt40$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt143$cb_handle_change_strength, T, UNPROVIDED);
                                                                html_hidden_input($$$id, id, UNPROVIDED);
                                                                cb_help_preamble($CB_CHANGE_STRENGTH, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt144$Choose_a_new_truth_strength__);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(TWO_INTEGER);
                                                                html_radio_input($$$strength, $str_alt146$_default, eq(strength, $DEFAULT));
                                                                html_indent(TWO_INTEGER);
                                                                html_princ($$$Default);
                                                                html_newline(UNPROVIDED);
                                                                html_radio_input($$$strength, $str_alt149$_monotonic, eq(strength, $MONOTONIC));
                                                                html_indent(TWO_INTEGER);
                                                                html_princ($$$Monotonic);
                                                                html_newline(TWO_INTEGER);
                                                                cb_back_button($SELF, $$$Abort_Edit);
                                                                html_indent(ONE_INTEGER);
                                                                html_reset_input($$$Current_Value);
                                                                html_indent(ONE_INTEGER);
                                                                html_submit_input($$$Change_Strength, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt41$Mt___);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt42$Sentence___);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_change_strength(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str159$the_Change_Assertion_Strength_pag);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                final SubLObject title_var = $$$Change_Assertion_Strength;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str50$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
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
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str161$cb_handle_change_strength, T, UNPROVIDED);
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                    cb_help_preamble($CB_CHANGE_STRENGTH, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str162$Choose_a_new_truth_strength__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    html_radio_input($$$strength, $str164$_default, eq(strength, $DEFAULT), UNPROVIDED);
                                    html_indent(TWO_INTEGER);
                                    html_princ($$$Default);
                                    html_newline(UNPROVIDED);
                                    html_radio_input($$$strength, $str167$_monotonic, eq(strength, $MONOTONIC), UNPROVIDED);
                                    html_indent(TWO_INTEGER);
                                    html_princ($$$Monotonic);
                                    html_newline(TWO_INTEGER);
                                    cb_back_button($SELF, $$$Abort_Edit);
                                    html_indent(ONE_INTEGER);
                                    html_reset_input($$$Current_Value);
                                    html_indent(ONE_INTEGER);
                                    html_submit_input($$$Change_Strength, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str55$Mt___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str56$Sentence___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_change_strength_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$change_strength);
            return NIL;
        }
        {
            SubLObject id = html_extract_input($$$id, args);
            SubLObject assertion = cb_guess_assertion(id);
            SubLObject new_strength = read_from_string_ignoring_errors(html_extract_input($$$strength, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != subl_promotions.memberP(new_strength, $list_alt155, UNPROVIDED, UNPROVIDED)) {
                if (!new_strength.equal(assertions_high.assertion_strength(assertion))) {
                    cb_change_strength_hook(assertion, new_strength);
                }
                cb_note_edit_change($$$Change_Assertion_Strength, T, TWO_INTEGER, UNPROVIDED);
            } else {
                cb_error($str_alt156$_a_was_not_a_microtheory, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_change_strength(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$change_strength);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        final SubLObject new_strength = read_from_string_ignoring_errors(html_extract_input($$$strength, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != subl_promotions.memberP(new_strength, $list173, UNPROVIDED, UNPROVIDED)) {
            if (!new_strength.equal(assertions_high.assertion_strength(assertion))) {
                cb_change_strength_hook(assertion, new_strength);
            }
            cb_note_edit_change($$$Change_Assertion_Strength, T, TWO_INTEGER, UNPROVIDED);
        } else {
            cb_error($str174$_a_was_not_a_microtheory, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_link_change_strength_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt158$_Change_Strength_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt159$cb_change_strength__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_change_strength(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str176$_Change_Strength_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str177$cb_change_strength__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_change_direction_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($str_alt163$the_Change_Assertion_Direction_pa);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject assertion = cb_guess_assertion(id);
                            SubLObject direction = assertions_high.assertion_direction(assertion);
                            SubLObject title_var = $$$Change_Assertion_Direction;
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
                                        SubLObject _prev_bind_0_12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt40$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt165$cb_handle_change_direction, T, UNPROVIDED);
                                                                html_hidden_input($$$id, id, UNPROVIDED);
                                                                cb_help_preamble($CB_CHANGE_DIRECTION, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt166$Choose_a_direction__);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                html_radio_input($$$direction, $str_alt168$_backward, eq(direction, $BACKWARD));
                                                                html_indent(TWO_INTEGER);
                                                                html_princ($$$Backward);
                                                                html_newline(UNPROVIDED);
                                                                html_radio_input($$$direction, $str_alt171$_forward, eq(direction, $FORWARD));
                                                                html_indent(TWO_INTEGER);
                                                                html_princ($$$Forward);
                                                                if (NIL != assertions_high.rule_assertionP(assertion)) {
                                                                    {
                                                                        SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                                                                        if (NIL != clauses.neg_lits(rule_cnf)) {
                                                                            html_indent(TWO_INTEGER);
                                                                            cb_link($ANTECEDENT_QUERY, assertion, $str_alt99$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                html_radio_input($$$direction, $str_alt174$_code, eq(direction, $CODE));
                                                                html_indent(TWO_INTEGER);
                                                                html_princ($$$Code);
                                                                html_newline(TWO_INTEGER);
                                                                cb_back_button($SELF, $$$Abort_Edit);
                                                                html_indent(ONE_INTEGER);
                                                                html_reset_input($$$Current_Value);
                                                                html_indent(ONE_INTEGER);
                                                                html_submit_input($$$Change_Direction, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt41$Mt___);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt42$Sentence___);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_change_direction(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str181$the_Change_Assertion_Direction_pa);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                final SubLObject title_var = $$$Change_Assertion_Direction;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str50$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
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
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str183$cb_handle_change_direction, T, UNPROVIDED);
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                    cb_help_preamble($CB_CHANGE_DIRECTION, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str184$Choose_a_direction__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_radio_input($$$direction, $str186$_backward, eq(direction, $BACKWARD), UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Backward);
                                    html_newline(UNPROVIDED);
                                    html_radio_input($$$direction, $str189$_forward, eq(direction, $FORWARD), UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Forward);
                                    if (NIL != assertions_high.rule_assertionP(assertion)) {
                                        final SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                                        if (NIL != clauses.neg_lits(rule_cnf)) {
                                            html_indent(TWO_INTEGER);
                                            cb_link($ANTECEDENT_QUERY, assertion, $str112$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                    html_newline(TWO_INTEGER);
                                    cb_back_button($SELF, $$$Abort_Edit);
                                    html_indent(ONE_INTEGER);
                                    html_reset_input($$$Current_Value);
                                    html_indent(ONE_INTEGER);
                                    html_submit_input($$$Change_Direction, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str55$Mt___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str56$Sentence___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    cb_form_assertion_edit_formula(assertion, ZERO_INTEGER, T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_change_direction_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$direction_changes);
            return NIL;
        }
        {
            SubLObject id = html_extract_input($$$id, args);
            SubLObject assertion = cb_guess_assertion(id);
            SubLObject new_direction = read_from_string_ignoring_errors(html_extract_input($$$direction, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            if (NIL != enumeration_types.direction_p(new_direction)) {
                if (new_direction != direction) {
                    cb_change_direction_hook(assertion, new_direction);
                }
                cb_note_edit_change($$$Change_Assertion_Direction, T, TWO_INTEGER, UNPROVIDED);
            } else {
                cb_error($str_alt180$_a_does_not_specify_a_valid_direc, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_change_direction(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$direction_changes);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        final SubLObject new_direction = read_from_string_ignoring_errors(html_extract_input($$$direction, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject shoehornP = html_extract_boolean($str195$shoehorn_, args, UNPROVIDED);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        if (NIL == enumeration_types.direction_p(new_direction)) {
            cb_error($str196$_a_does_not_specify_a_valid_direc, second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (!new_direction.eql(direction)) {
                if (((new_direction == $FORWARD) && (NIL != assertions_high.rule_assertionP(assertion))) && (NIL != shoehornP)) {
                    ke.ke_shoehorn_rule_forward(assertion);
                    ke.ke_assert(list($$cyclistNotes, assertion, cconcatenate($$$This_rule_was_shoehorned_forward_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)), $$$_by_, format_nil.format_nil_a_no_copy(operation_communication.the_cyclist()), $str73$_ })), assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                    cb_note_edit_change($$$Change_Assertion_Direction, T, TWO_INTEGER, UNPROVIDED);
                } else {
                    cb_change_direction_hook(assertion, new_direction);
                    cb_note_edit_change($$$Change_Assertion_Direction, T, TWO_INTEGER, UNPROVIDED);
                }
            }

        return NIL;
    }

    public static final SubLObject cb_link_change_direction_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt182$_Change_Direction_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt183$cb_change_direction__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_change_direction(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str201$_Change_Direction_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str202$cb_change_direction__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_change_meta_assertion_mt_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Change_Assertion_Mt_page);
            } else {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject assertion = cb_guess_assertion(id);
                            SubLObject mt = assertions_high.assertion_mt(assertion);
                            SubLObject title_var = $$$Change_Meta_Assertions_Mt;
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
                                        SubLObject _prev_bind_0_15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt40$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt188$cb_handle_change_meta_assertion_m, T, UNPROVIDED);
                                                                html_hidden_input($$$id, id, UNPROVIDED);
                                                                cb_help_preamble($CB_CHANGE_META_ASSERTION_MT, UNPROVIDED, UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_princ($str_alt189$Change_the_Mt_of_Meta_Assertions_);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(TWO_INTEGER);
                                                                cb_show_assertion_readably(assertion, T, T);
                                                                html_newline(TWO_INTEGER);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                cb_form_widgets.cb_mt_input_section(mt, $list_alt123);
                                                                cb_back_button($SELF, $$$Abort_Edit);
                                                                html_indent(UNPROVIDED);
                                                                html_reset_input($$$Current_Value);
                                                                html_indent(UNPROVIDED);
                                                                html_submit_input($$$Change_Mt, UNPROVIDED, UNPROVIDED);
                                                                cb_tabulate_checkable_meta_assertions(assertion, TWO_INTEGER, $str_alt190$change_meta_, $str_alt191$Choose_the_meta_assertions__, T);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_change_meta_assertion_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Change_Assertion_Mt_page);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject title_var = $$$Change_Meta_Assertions_Mt;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str50$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
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
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str207$cb_handle_change_meta_assertion_m, T, UNPROVIDED);
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                    cb_help_preamble($CB_CHANGE_META_ASSERTION_MT, UNPROVIDED, UNPROVIDED);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str208$Change_the_Mt_of_Meta_Assertions_);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    cb_show_assertion_readably(assertion, T, T);
                                    html_newline(TWO_INTEGER);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    cb_form_widgets.cb_mt_input_section(mt, $list141);
                                    cb_back_button($SELF, $$$Abort_Edit);
                                    html_indent(UNPROVIDED);
                                    html_reset_input($$$Current_Value);
                                    html_indent(UNPROVIDED);
                                    html_submit_input($$$Change_Mt, UNPROVIDED, UNPROVIDED);
                                    cb_tabulate_checkable_meta_assertions(assertion, TWO_INTEGER, $str209$change_meta_, $str210$Choose_the_meta_assertions__, T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_change_meta_assertion_mt_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$change_microtheory);
                return NIL;
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                thread.resetMultipleValues();
                {
                    SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                    SubLObject mt_error = thread.secondMultipleValue();
                    SubLObject mt_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != mt_error) {
                        return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
                    }
                    {
                        SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, $str_alt190$change_meta_, UNPROVIDED);
                        SubLObject operations = ZERO_INTEGER;
                        SubLObject cdolist_list_var = meta_assertions_to_preserve;
                        SubLObject meta_assertion_pair = NIL;
                        for (meta_assertion_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_assertion_pair = cdolist_list_var.first()) {
                            {
                                SubLObject meta_assertion = meta_assertion_pair.first();
                                if (NIL == hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(meta_assertion))) {
                                    cb_change_mt_hook(meta_assertion, new_mt, NIL);
                                    operations = add(operations, ONE_INTEGER);
                                }
                            }
                        }
                        cb_note_edit_change($$$Change_Meta_Assertions_Mt, T, THREE_INTEGER, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_change_meta_assertion_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$change_microtheory);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        thread.resetMultipleValues();
        final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, $str209$change_meta_, UNPROVIDED);
        SubLObject operations = ZERO_INTEGER;
        SubLObject cdolist_list_var = meta_assertions_to_preserve;
        SubLObject meta_assertion_pair = NIL;
        meta_assertion_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject meta_assertion = meta_assertion_pair.first();
            if (NIL == hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(meta_assertion))) {
                cb_change_mt_hook(meta_assertion, new_mt, NIL);
                operations = add(operations, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_assertion_pair = cdolist_list_var.first();
        } 
        cb_note_edit_change($$$Change_Meta_Assertions_Mt, T, THREE_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_change_meta_assertion_mt_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt194$_Change_Meta_Assertions_Mt_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt195$cb_change_meta_assertion_mt__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_change_meta_assertion_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str213$_Change_Meta_Assertions_Mt_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str214$cb_change_meta_assertion_mt__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_rename_variables_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                return cyc_navigator_internals.guest_warn($$$the_facility_to_rename_variables);
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        SubLObject assertion_el_variables = assertions_high.assertion_el_variables(assertion);
                        SubLObject mal_variables = wff_utilities.mal_variables(assertion_el_variables);
                        SubLObject correction_pair_alist = correct_variables(mal_variables);
                        SubLObject corrected_variable = NIL;
                        SubLObject title_var = $$$Rename_Assertion_Variables;
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
                                    SubLObject _prev_bind_0_18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                            html_markup($str_alt40$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_hidden_input($str_alt201$cb_handle_rename_variables, T, UNPROVIDED);
                                                            html_hidden_input($$$id, id, UNPROVIDED);
                                                            cb_help_preamble($CB_RENAME_VARIABLES, UNPROVIDED, UNPROVIDED);
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt202$Rename_the_variables_of_the_asser);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(TWO_INTEGER);
                                                            cb_show_assertion_readably(assertion, T, T);
                                                            html_newline(TWO_INTEGER);
                                                            if (NIL != mal_variables) {
                                                                html_princ_strong($str_alt203$Note__);
                                                                html_princ($str_alt204$Variables_listed_in_);
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
                                                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ_strong($$$red);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                html_princ($str_alt206$_have_invalid_variable_names___Va);
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                                                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                            }
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(html_align($LEFT));
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(html_align($TOP));
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_indent(TWO_INTEGER);
                                                                                    html_princ_strong($$$Current_Variable);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(html_align($LEFT));
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(html_align($TOP));
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_indent(TWO_INTEGER);
                                                                                    html_princ_strong($$$Changed_Variable);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_source_readability_terpri(UNPROVIDED);
                                                                    {
                                                                        SubLObject cdolist_list_var = assertion_el_variables;
                                                                        SubLObject current_variable = NIL;
                                                                        for (current_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_variable = cdolist_list_var.first()) {
                                                                            corrected_variable = list_utilities.alist_lookup(correction_pair_alist, current_variable, UNPROVIDED, UNPROVIDED);
                                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_markup(html_align($LEFT));
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_markup(html_align($TOP));
                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_indent(TWO_INTEGER);
                                                                                            if (NIL != subl_promotions.memberP(current_variable, mal_variables, UNPROVIDED, UNPROVIDED)) {
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
                                                                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_princ_strong(current_variable);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                                }
                                                                                            } else {
                                                                                                html_princ(current_variable);
                                                                                            }
                                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            if (true) {
                                                                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(html_align($LEFT));
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            if (true) {
                                                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(html_align($TOP));
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_indent(TWO_INTEGER);
                                                                                                    html_text_input(current_variable, NIL != corrected_variable ? ((SubLObject) (corrected_variable)) : current_variable, $cb_constant_input_width$.getDynamicValue(thread));
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                                                }
                                                                                            }
                                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                                        }
                                                                                    }
                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_source_readability_terpri(UNPROVIDED);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_indent(TWO_INTEGER);
                                                            html_submit_input($$$Rename_Variables, $$$rename, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                }
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rename_variables(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_facility_to_rename_variables);
        }
        SubLObject id = NIL;
        destructuring_bind_must_consp(args, args, $list134);
        id = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject assertion = cb_guess_assertion(id);
            final SubLObject assertion_el_variables = assertions_high.assertion_el_variables(assertion);
            final SubLObject mal_variables = wff_utilities.mal_variables(assertion_el_variables);
            final SubLObject correction_pair_alist = correct_variables(mal_variables);
            SubLObject corrected_variable = NIL;
            final SubLObject title_var = $$$Rename_Assertion_Variables;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str50$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
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
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str220$cb_handle_rename_variables, T, UNPROVIDED);
                                html_hidden_input($$$id, id, UNPROVIDED);
                                cb_help_preamble($CB_RENAME_VARIABLES, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str221$Rename_the_variables_of_the_asser);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                cb_show_assertion_readably(assertion, T, T);
                                html_newline(TWO_INTEGER);
                                if (NIL != mal_variables) {
                                    html_princ_strong($str222$Note__);
                                    html_princ($$$Variables_listed_in_);
                                    final SubLObject color_val = $RED;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != color_val) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(color_val));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$red);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_princ($str225$_have_invalid_variable_names___Va);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                    html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                                    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                }
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(TWO_INTEGER);
                                            html_princ_strong($$$Current_Variable);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(TWO_INTEGER);
                                            html_princ_strong($$$Changed_Variable);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    SubLObject cdolist_list_var = assertion_el_variables;
                                    SubLObject current_variable = NIL;
                                    current_variable = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        corrected_variable = list_utilities.alist_lookup(correction_pair_alist, current_variable, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_indent(TWO_INTEGER);
                                                if (NIL != subl_promotions.memberP(current_variable, mal_variables, UNPROVIDED, UNPROVIDED)) {
                                                    final SubLObject color_val2 = $RED;
                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (NIL != color_val2) {
                                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_color(color_val2));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ_strong(current_variable);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                } else {
                                                    html_princ(current_variable);
                                                }
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($LEFT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($TOP));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_indent(TWO_INTEGER);
                                                    html_text_input(current_variable, NIL != corrected_variable ? corrected_variable : current_variable, $cb_constant_input_width$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        current_variable = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Rename_Variables, $$$rename, UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$29, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(args, $list134);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_rename_variables_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                SubLObject rename_alist = NIL;
                SubLObject invalid_rename_list = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject rename_alist_30 = cb_extract_variables_from_args(args);
                    SubLObject invalid_rename_list_31 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    rename_alist = rename_alist_30;
                    invalid_rename_list = invalid_rename_list_31;
                }
                if (NIL != invalid_rename_list) {
                    return cb_show_invalid_variables_message(invalid_rename_list);
                }
                if (NIL == rename_alist) {
                    return cb_simple_message_page($str_alt214$No_variables_were_specified_to_be, TWO_INTEGER, $int$2000);
                }
                if (NIL != html_extract_input($$$rename, args)) {
                    if (NIL != simple_variable_rename_impossibleP(assertion, rename_alist)) {
                        {
                            SubLObject title_var = $$$Rename_Assertion_Variables;
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
                                        SubLObject _prev_bind_0_32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt40$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt201$cb_handle_rename_variables, T, UNPROVIDED);
                                                                html_hidden_input($$$id, id, UNPROVIDED);
                                                                {
                                                                    SubLObject cdolist_list_var = rename_alist;
                                                                    SubLObject cons = NIL;
                                                                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject datum = cons;
                                                                            SubLObject current = datum;
                                                                            SubLObject variable = NIL;
                                                                            SubLObject renamed_variable = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt215);
                                                                            variable = current.first();
                                                                            current = current.rest();
                                                                            renamed_variable = current;
                                                                            html_hidden_input(variable, renamed_variable, UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                                html_princ_strong($str_alt216$The_proposed_rename_may_change_th);
                                                                html_newline(TWO_INTEGER);
                                                                html_submit_input($$$Yes, $$$continue, UNPROVIDED);
                                                                html_indent(TWO_INTEGER);
                                                                cb_back_button($SELF, $$$No);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        cb_rename_variables_hook(assertion, rename_alist);
                        cb_note_edit_change($$$Rename_Variables, T, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    if (NIL != html_extract_input($$$continue, args)) {
                        {
                            SubLObject new_formula = copy_tree(uncanonicalizer.assertion_el_formula(assertion));
                            new_formula = sublis(rename_alist, new_formula, UNPROVIDED, UNPROVIDED);
                            cb_assert_internal($EDIT, assertion, new_formula, T);
                            cb_note_edit_change($$$Rename_Variables, T, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_rename_variables(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        SubLObject rename_alist = NIL;
        SubLObject invalid_rename_list = NIL;
        thread.resetMultipleValues();
        final SubLObject rename_alist_$43 = cb_extract_variables_from_args(args);
        final SubLObject invalid_rename_list_$44 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rename_alist = rename_alist_$43;
        invalid_rename_list = invalid_rename_list_$44;
        if (NIL != invalid_rename_list) {
            return cb_show_invalid_variables_message(invalid_rename_list);
        }
        if (NIL == rename_alist) {
            return cb_simple_message_page($str233$No_variables_were_specified_to_be, TWO_INTEGER, $int$2000);
        }
        if (NIL != html_extract_input($$$rename, args)) {
            if (NIL != simple_variable_rename_impossibleP(assertion, rename_alist)) {
                final SubLObject title_var = $$$Rename_Assertion_Variables;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            html_markup($str50$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
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
                                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str220$cb_handle_rename_variables, T, UNPROVIDED);
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                    SubLObject cdolist_list_var = rename_alist;
                                    SubLObject cons = NIL;
                                    cons = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = cons;
                                        SubLObject variable = NIL;
                                        SubLObject renamed_variable = NIL;
                                        destructuring_bind_must_consp(current, datum, $list234);
                                        variable = current.first();
                                        current = renamed_variable = current.rest();
                                        html_hidden_input(variable, renamed_variable, UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        cons = cdolist_list_var.first();
                                    } 
                                    html_princ_strong($str235$The_proposed_rename_may_change_th);
                                    html_newline(TWO_INTEGER);
                                    html_submit_input($$$Yes, $$$continue, UNPROVIDED);
                                    html_indent(TWO_INTEGER);
                                    cb_back_button($SELF, $$$No);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cb_rename_variables_hook(assertion, rename_alist);
                cb_note_edit_change($$$Rename_Variables, T, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != html_extract_input($$$continue, args)) {
                SubLObject new_formula = copy_tree(uncanonicalizer.assertion_el_formula(assertion));
                new_formula = sublis(rename_alist, new_formula, UNPROVIDED, UNPROVIDED);
                cb_assert_internal($EDIT, assertion, new_formula, T);
                cb_note_edit_change($$$Rename_Variables, T, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    /**
     *
     *
     * @return 0 alist-p, containing (VARIABLE . RENAME-VARIABLE) pairs.
     * @return 1 listp,   containing list of invalid variables.
    If the proposed rename field is empty in ARGS, it is not added to RENAME-ALIST.
     */
    @LispMethod(comment = "@return 0 alist-p, containing (VARIABLE . RENAME-VARIABLE) pairs.\r\n@return 1 listp,   containing list of invalid variables.\r\nIf the proposed rename field is empty in ARGS, it is not added to RENAME-ALIST.")
    public static final SubLObject cb_extract_variables_from_args_alt(SubLObject args) {
        {
            SubLObject rename_alist = NIL;
            SubLObject invalid_rename_list = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isCons()) {
                    {
                        SubLObject datum = arg;
                        SubLObject current = datum;
                        SubLObject variable_name = NIL;
                        SubLObject new_variable_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt222);
                        variable_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt222);
                        new_variable_name = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            new_variable_name = Strings.string_trim($list_alt223, new_variable_name);
                            if (((NIL != string_utilities.starts_with(variable_name, $str_alt224$_)) && (NIL == Strings.string_equal(new_variable_name, $str_alt225$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != Strings.string_not_equal(variable_name, new_variable_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                if (NIL != cycl_variables.valid_el_var_nameP(new_variable_name)) {
                                    rename_alist = list_utilities.alist_enter(rename_alist, cycl_variables.make_el_var(variable_name), cycl_variables.make_el_var(new_variable_name), UNPROVIDED);
                                } else {
                                    invalid_rename_list = cons(new_variable_name, invalid_rename_list);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt222);
                        }
                    }
                }
            }
            return values(rename_alist, invalid_rename_list);
        }
    }

    /**
     *
     *
     * @return 0 alist-p, containing (VARIABLE . RENAME-VARIABLE) pairs.
     * @return 1 listp,   containing list of invalid variables.
    If the proposed rename field is empty in ARGS, it is not added to RENAME-ALIST.
     */
    @LispMethod(comment = "@return 0 alist-p, containing (VARIABLE . RENAME-VARIABLE) pairs.\r\n@return 1 listp,   containing list of invalid variables.\r\nIf the proposed rename field is empty in ARGS, it is not added to RENAME-ALIST.")
    public static SubLObject cb_extract_variables_from_args(final SubLObject args) {
        SubLObject rename_alist = NIL;
        SubLObject invalid_rename_list = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject variable_name = NIL;
                SubLObject new_variable_name = NIL;
                destructuring_bind_must_consp(current, datum, $list241);
                variable_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list241);
                new_variable_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    new_variable_name = Strings.string_trim($list242, new_variable_name);
                    if (((NIL != string_utilities.starts_with(variable_name, $str243$_)) && (NIL == Strings.string_equal(new_variable_name, $str244$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != Strings.string_not_equal(variable_name, new_variable_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        if (NIL != cycl_variables.valid_el_var_nameP(new_variable_name)) {
                            rename_alist = list_utilities.alist_enter(rename_alist, cycl_variables.make_el_var(variable_name), cycl_variables.make_el_var(new_variable_name), UNPROVIDED);
                        } else {
                            invalid_rename_list = cons(new_variable_name, invalid_rename_list);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list241);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return values(rename_alist, invalid_rename_list);
    }

    public static final SubLObject cb_show_invalid_variables_message_alt(SubLObject invalid_variables_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Invalid_Variables;
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
                            SubLObject _prev_bind_0_35 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt40$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_back_button($SELF, $$$Back);
                                                html_newline(TWO_INTEGER);
                                                html_princ_strong($str_alt228$The_following_variables_have_inva);
                                                html_newline(TWO_INTEGER);
                                                html_princ(string_utilities.stringify_items(invalid_variables_list, symbol_function(STR), $str_alt230$__, $str_alt231$__and_));
                                                html_newline(TWO_INTEGER);
                                                html_princ_strong($str_alt232$Valid_variables_must_satisfy_the_);
                                                html_newline(UNPROVIDED);
                                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_35, thread);
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

    public static SubLObject cb_show_invalid_variables_message(final SubLObject invalid_variables_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Invalid_Variables;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$50 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
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
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button($SELF, $$$Back);
                            html_newline(TWO_INTEGER);
                            html_princ_strong($str247$The_following_variables_have_inva);
                            html_newline(TWO_INTEGER);
                            html_princ(string_utilities.stringify_items(invalid_variables_list, symbol_function(STR), $str249$__, $str250$__and_));
                            html_newline(TWO_INTEGER);
                            html_princ_strong($str251$Valid_variables_must_satisfy_the_);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$50, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_link_rename_variables_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt233$_Rename_Variables_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$cb_rename_variables__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_rename_variables(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str252$_Rename_Variables_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str253$cb_rename_variables__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_repropagate_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt236$the_facility_to_repropagate_forwa);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        if (direction == $FORWARD) {
                            cb_repropagate_hook(assertion);
                            cb_note_edit_change($$$Forward_Assertion_Repropagation, T, ONE_INTEGER, UNPROVIDED);
                        } else {
                            cb_error($str_alt238$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_repropagate(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str255$the_facility_to_repropagate_forwa);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                if (direction == $FORWARD) {
                    cb_repropagate_hook(assertion);
                    cb_note_edit_change($$$Forward_Assertion_Repropagation, T, ONE_INTEGER, UNPROVIDED);
                } else {
                    cb_error($str257$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_repropagate_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt240$_Repropagate_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt241$cb_repropagate__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_repropagate(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str259$_Repropagate_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str260$cb_repropagate__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_repropagate_browsably_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt243$the_facility_to_repropagate_and_b);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        if (direction == $FORWARD) {
                            cb_repropagate_browsably_hook(assertion);
                            cb_forward_inference_browser.cb_forward_inference_browser(list($str_alt244$Forward_repropagation_complete___));
                        } else {
                            cb_error($str_alt238$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_repropagate_browsably(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str262$the_facility_to_repropagate_and_b);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                if (direction == $FORWARD) {
                    cb_repropagate_browsably_hook(assertion);
                    cb_forward_inference_browser.cb_forward_inference_browser(list($str263$Forward_repropagation_complete___));
                } else {
                    cb_error($str257$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_repropagate_browsably_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt246$_Repropagate_and_Browse_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt247$cb_repropagate_browsably__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_repropagate_browsably(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str265$_Repropagate_and_Browse_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str266$cb_repropagate_browsably__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_recanonicalize_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt249$the_facility_to_recanonicalize_an);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        if (NIL == assertion_handles.assertion_p(assertion)) {
                            return cb_error($str_alt250$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == czer_main.canonicalizer_problemP(assertion)) {
                            return cb_simple_message_page($$$Assertion_is_already_canonical, TWO_INTEGER, $int$2000);
                        }
                        cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
                        cb_note_edit_change($$$Recanonicalize_Assertion, T, ONE_INTEGER, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_recanonicalize(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str268$the_facility_to_recanonicalize_an);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    return cb_error($str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == czer_main.canonicalizer_problemP(assertion)) {
                    return cb_simple_message_page($$$Assertion_is_already_canonical, TWO_INTEGER, $int$2000);
                }
                cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
                cb_note_edit_change($$$Recanonicalize_Assertion, T, ONE_INTEGER, UNPROVIDED);
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_recanonicalize_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt254$_Recanonicalize_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt255$cb_recanonicalize__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_recanonicalize(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str273$_Recanonicalize_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str274$cb_recanonicalize__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_wff_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt259$WFF_Check_Sentence;
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
                            SubLObject _prev_bind_0_38 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt40$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt260$cb_handle_wff, NIL, UNPROVIDED);
                                                    cb_help_preamble($CB_WFF, NIL, UNPROVIDED);
                                                    html_reset_input($$$Clear);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($str_alt259$WFF_Check_Sentence, UNPROVIDED, UNPROVIDED);
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    cb_form_widgets.cb_mt_input_section($$UniversalVocabularyMt, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    cb_form_widgets.cb_el_sentence_input_section(NIL, $list_alt263);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_38, thread);
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

    public static SubLObject cb_wff(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str278$WFF_Check_Sentence;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
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
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str279$cb_handle_wff, T, UNPROVIDED);
                            cb_help_preamble($CB_WFF, NIL, UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_indent(UNPROVIDED);
                            html_submit_input($str278$WFF_Check_Sentence, UNPROVIDED, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section($$UniversalVocabularyMt, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(NIL, $list282);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$55, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_link_wff_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$WFF_Check;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt267$cb_wff);
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

    public static SubLObject cb_link_wff(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$WFF_Check;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str286$cb_wff);
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

    public static final SubLObject cb_handle_wff_alt(SubLObject args) {
        return cb_wff_check_formula(args, NIL);
    }

    public static SubLObject cb_handle_wff(final SubLObject args) {
        return cb_wff_check_formula(args, NIL);
    }

    public static final SubLObject cb_wff_check_formula_alt(SubLObject args, SubLObject assert_modeP) {
        if (assert_modeP == UNPROVIDED) {
            assert_modeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                SubLObject mt_error = thread.secondMultipleValue();
                SubLObject mt_error_string = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != mt_error) {
                    return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
                }
                thread.resetMultipleValues();
                {
                    SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list_alt273);
                    SubLObject sentence_error = thread.secondMultipleValue();
                    SubLObject sentence_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != sentence_error) {
                        return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
                    }
                    return cb_wff_check_sentence_int(sentence, mt, T, assert_modeP);
                }
            }
        }
    }

    public static SubLObject cb_wff_check_formula(final SubLObject args, SubLObject assert_modeP) {
        if (assert_modeP == UNPROVIDED) {
            assert_modeP = NIL;
        }
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
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list292);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_string, UNPROVIDED);
        }
        return cb_wff_check_sentence_int(sentence, mt, T, assert_modeP);
    }

    public static final SubLObject cb_wff_check_formula_ok_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Sentence_is_Well_Formed;
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
                            SubLObject _prev_bind_0_41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt40$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt41$Mt___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt42$Sentence___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                cb_form(sentence, ZERO_INTEGER, T);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt275$WFF_Status___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_princ($$$OK);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_41, thread);
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

    public static SubLObject cb_wff_check_formula_ok(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Sentence_is_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$60 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$61 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
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
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str55$Mt___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_form(mt, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str56$Sentence___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_form(sentence, ZERO_INTEGER, T);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str294$WFF_Status___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ($$$OK);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$61, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$60, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_assert_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            cb_assert_internal($DEFAULT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_assert(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            cb_assert_internal($DEFAULT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_assert_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$assertions);
                return NIL;
            }
            if (NIL != list_utilities.sublisp_boolean(html_extract_input($str_alt280$wff_check, args))) {
                return cb_wff_check_formula(args, T);
            }
            thread.resetMultipleValues();
            {
                SubLObject error = cb_extract_some_assert_arguments(args);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject sentence = thread.thirdMultipleValue();
                SubLObject strength = thread.fourthMultipleValue();
                SubLObject direction = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error) {
                    return NIL;
                }
                {
                    SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                    if (NIL != wff_violations) {
                        return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
                    }
                }
                {
                    SubLObject queue = read_from_string_ignoring_errors(html_extract_input($str_alt281$assertion_queue, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pcase_var = queue;
                    if (pcase_var.eql($BROWSE)) {
                        {
                            SubLObject _prev_bind_0 = $browse_forward_inferencesP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
                            try {
                                $browse_forward_inferencesP$.bind(T, thread);
                                forward.$forward_inference_browsing_callback$.bind(CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
                                cb_forward_inference_browser.prepare_to_browse_new_forward_inference(make_ist_sentence(mt, sentence));
                                ke.ke_assert_now(sentence, mt, strength, direction);
                                cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
                            } finally {
                                forward.$forward_inference_browsing_callback$.rebind(_prev_bind_1, thread);
                                $browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
                        return cb_forward_inference_browser.cb_forward_inference_browser(list($str_alt283$Forward_propagation_complete___Br));
                    } else {
                        if (pcase_var.eql($NOW)) {
                            ke.ke_assert_now(sentence, mt, strength, direction);
                        } else {
                            ke.ke_assert(sentence, mt, strength, direction);
                        }
                    }
                }
                cb_make_bug_dependancy_meta_assertion_if_needed(sentence, mt, args, UNPROVIDED);
                cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
            }
            return cb_note_edit_change($$$EL_Sentence_Assert, T, TWO_INTEGER, UNPROVIDED);
        }
    }

    public static SubLObject cb_handle_assert(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$assertions);
            return NIL;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str299$wff_check, args))) {
            return cb_wff_check_formula(args, T);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        final SubLObject sentence_string = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
        if (NIL != wff_violations) {
            return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
        }
        final SubLObject pcase_var;
        final SubLObject queue = pcase_var = read_from_string_ignoring_errors(html_extract_input($str300$assertion_queue, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql($BROWSE)) {
            final SubLObject _prev_bind_0 = $browse_forward_inferencesP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
            final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding(thread);
            try {
                $browse_forward_inferencesP$.bind(T, thread);
                forward.$forward_inference_browsing_callback$.bind(CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
                forward.$forward_inference_browsing_callback_more_infoP$.bind(T, thread);
                cb_forward_inference_browser.prepare_to_browse_new_forward_inference(make_ist_sentence(mt, sentence));
                ke.ke_assert_now(sentence, mt, strength, direction);
                cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
            } finally {
                forward.$forward_inference_browsing_callback_more_infoP$.rebind(_prev_bind_3, thread);
                forward.$forward_inference_browsing_callback$.rebind(_prev_bind_2, thread);
                $browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
            }
            cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, UNPROVIDED);
            return cb_forward_inference_browser.cb_forward_inference_browser(list($str302$Forward_propagation_complete___Br));
        }
        if (pcase_var.eql($NOW)) {
            ke.ke_assert_now(sentence, mt, strength, direction);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, T);
        } else {
            ke.ke_assert(sentence, mt, strength, direction);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, UNPROVIDED);
        }
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
        return cb_note_edit_change($$$EL_Sentence_Assert, T, TWO_INTEGER, UNPROVIDED);
    }

    /**
     * Common helper used by assert/edit/fix-typo handlers.
     *
     * @return 0 error; nil if no error,
    ; if there was an error the appropriate error page is shown
     * @return 1 mt
     * @return 2 sentence
     * @return 3 strength
     * @return 4 direction
     */
    @LispMethod(comment = "Common helper used by assert/edit/fix-typo handlers.\r\n\r\n@return 0 error; nil if no error,\r\n; if there was an error the appropriate error page is shown\r\n@return 1 mt\r\n@return 2 sentence\r\n@return 3 strength\r\n@return 4 direction")
    public static final SubLObject cb_extract_some_assert_arguments_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
                SubLObject mt_error = thread.secondMultipleValue();
                SubLObject mt_error_string = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != mt_error) {
                    cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
                    return values(mt_error, NIL, NIL, NIL, NIL);
                }
                thread.resetMultipleValues();
                {
                    SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list_alt273);
                    SubLObject sentence_error = thread.secondMultipleValue();
                    SubLObject sentence_error_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != sentence_error) {
                        cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
                        return values(sentence_error, NIL, NIL, NIL, NIL);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject strength = cb_extract_strength_and_direction_input(args, UNPROVIDED);
                        SubLObject direction = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values(NIL, mt, sentence, strength, direction);
                    }
                }
            }
        }
    }

    /**
     * Common helper used by assert/edit/fix-typo handlers.
     *
     * @return 0 error; nil if no error,
    ; if there was an error the appropriate error page is shown
     * @return 1 mt
     * @return 2 sentence
     * @return 3 strength
     * @return 4 direction
     */
    @LispMethod(comment = "Common helper used by assert/edit/fix-typo handlers.\r\n\r\n@return 0 error; nil if no error,\r\n; if there was an error the appropriate error page is shown\r\n@return 1 mt\r\n@return 2 sentence\r\n@return 3 strength\r\n@return 4 direction")
    public static SubLObject cb_extract_some_assert_arguments(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return values(mt_error, NIL, NIL, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list292);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_string, UNPROVIDED);
            return values(sentence_error, NIL, NIL, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject strength = cb_extract_strength_and_direction_input(args, UNPROVIDED);
        final SubLObject direction = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(NIL, mt, sentence, strength, direction, sentence_string);
    }

    public static final SubLObject cb_link_assert_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Assert;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt290$cb_assert);
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

    public static SubLObject cb_link_assert(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Assert;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str309$cb_assert);
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

    /**
     * If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.
     */
    @LispMethod(comment = "If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.")
    public static final SubLObject cb_assert_internal_alt(SubLObject mode, SubLObject assertion, SubLObject sentence, SubLObject use_sentenceP) {
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (use_sentenceP == UNPROVIDED) {
            use_sentenceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode_data = assoc(mode, $cb_assert_modes_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                if (NIL == mode_data) {
                    cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str_alt297$cb_assert_called_without_a_valid_));
                    return NIL;
                }
                {
                    SubLObject datum = mode_data;
                    SubLObject current = datum;
                    SubLObject keyword = NIL;
                    SubLObject handler = NIL;
                    SubLObject title = NIL;
                    SubLObject action_label = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt298);
                    keyword = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt298);
                    handler = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt298);
                    title = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt298);
                    action_label = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        thread.resetMultipleValues();
                        {
                            SubLObject id = cb_extract_values_for_assert(assertion, sentence, use_sentenceP, handler);
                            SubLObject formula = thread.secondMultipleValue();
                            SubLObject mt = thread.thirdMultipleValue();
                            SubLObject direction = thread.fourthMultipleValue();
                            SubLObject strength = thread.fifthMultipleValue();
                            SubLObject editing = thread.sixthMultipleValue();
                            SubLObject edit_formula_only = thread.seventhMultipleValue();
                            SubLObject asserted_by = thread.eighthMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == strength) {
                                strength = $DEFAULT;
                            }
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_complete.html_complete_script();
                            dhtml_macros.dhtml_with_dom_script();
                            dhtml_macros.dhtml_with_toggle_visibility_support();
                            html_script_utilities.html_simple_applet_input_definition_script();
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
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
                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_hidden_input(handler, NIL, UNPROVIDED);
                                                        if (NIL != assertion_handles.assertion_p(assertion)) {
                                                            html_hidden_input($$$id, id, UNPROVIDED);
                                                        } else {
                                                            if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                                                                html_hidden_input($$$id, cb_glob_id(sentence), UNPROVIDED);
                                                            }
                                                        }
                                                        if ($META == mode) {
                                                            formula = $cb_assertion_indexical$.getGlobalValue();
                                                            html_princ($str_alt300$Please_use_);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            cb_form(formula, ZERO_INTEGER, NIL);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_princ($str_alt301$_to_refer_to_the_following_assert);
                                                            html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                            cb_show_assertion_readably(assertion, T, T);
                                                            html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                        }
                                                        if (NIL != assertion_handles.assertion_p(assertion)) {
                                                            if (($EDIT == mode) || ($FIX_TYPO == mode)) {
                                                                if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
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
                                                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_princ_strong($str_alt122$Note___This_assertion_has_meta_as);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                    html_newline(TWO_INTEGER);
                                                                }
                                                            }
                                                        }
                                                        cb_help_preamble($CB_ASSERT_INTERNAL, NIL, UNPROVIDED);
                                                        html_reset_input($$$Reset_All_Fields);
                                                        html_indent(ONE_INTEGER);
                                                        html_submit_input($str_alt259$WFF_Check_Sentence, $str_alt280$wff_check, UNPROVIDED);
                                                        html_indent(ONE_INTEGER);
                                                        html_submit_input(action_label, $$$assert, UNPROVIDED);
                                                        html_indent(ONE_INTEGER);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        if ((mode == $DEFAULT) || (mode == $SIMILAR)) {
                                                            {
                                                                SubLObject assertion_queue_input_name = $str_alt281$assertion_queue;
                                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                                html_radio_input(assertion_queue_input_name, $str_alt305$_local, eq($cb_assert_queue_default$.getDynamicValue(thread), $LOCAL));
                                                                html_indent(ONE_INTEGER);
                                                                html_princ($$$Assert_using_Local_queue);
                                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                                html_radio_input(assertion_queue_input_name, $str_alt308$_now, eq($cb_assert_queue_default$.getDynamicValue(thread), $NOW));
                                                                html_indent(ONE_INTEGER);
                                                                html_princ($str_alt309$Assert_now__bypassing_Local_queue);
                                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                                html_radio_input(assertion_queue_input_name, $str_alt310$_browse, eq($cb_assert_queue_default$.getDynamicValue(thread), $BROWSE));
                                                                html_indent(ONE_INTEGER);
                                                                html_princ($str_alt311$Assert_now_and_browse_forward_inf);
                                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                                html_indent(TWO_INTEGER);
                                                            }
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                        }
                                                        dhtml_macros.dhtml_switch_visibility_links($str_alt312$cb_assert_parameters, $$$Show, $$$Hide);
                                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($$$Assert_Context);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        {
                                                            SubLObject initial_visibility = $VISIBLE;
                                                            dhtml_macros.dhtml_set_switched_visibility($str_alt312$cb_assert_parameters, initial_visibility, $PARAGRAPH);
                                                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($str_alt312$cb_assert_parameters);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_strength_and_direction_section(strength, direction, list($EDIT_ONLY, edit_formula_only));
                                                                    {
                                                                        SubLObject display_options = list($kw319$EDIT_ALLOWED_, makeBoolean(NIL == edit_formula_only), $MONAD_CHOICES, $list_alt321, $kw322$ANYTIME_PSC_ALLOWED_, NIL);
                                                                        cb_form_widgets.cb_mt_input_section(mt, display_options);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_newline(UNPROVIDED);
                                                        {
                                                            SubLObject choices = cb_assert_sentence_constant_suggestions(mode);
                                                            SubLObject display_options = list(new SubLObject[]{ $INPUT_NAME, $$$sentence, $COMPLETE_LABEL, $$$Complete, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear_Sentence, $HEIGHT, TWENTY_INTEGER, $WIDTH, $int$80, $CHOICES, choices });
                                                            cb_form_widgets.cb_el_sentence_input_section(formula, display_options);
                                                        }
                                                        if (NIL != editing) {
                                                            html_newline(UNPROVIDED);
                                                            cb_email_notify_section(asserted_by, UNPROVIDED);
                                                        }
                                                        html_newline(UNPROVIDED);
                                                        cb_make_workaround_assertion_section(UNPROVIDED);
                                                        if (NIL != assertion_handles.assertion_p(assertion)) {
                                                            if (($EDIT == mode) || ($FIX_TYPO == mode)) {
                                                                cb_tabulate_checkable_meta_assertions(assertion, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt298);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.
     */
    @LispMethod(comment = "If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.")
    public static SubLObject cb_assert_internal(final SubLObject mode, SubLObject assertion, SubLObject sentence, SubLObject use_sentenceP) {
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (use_sentenceP == UNPROVIDED) {
            use_sentenceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode_data = assoc(mode, $cb_assert_modes_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL == mode_data) {
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str316$cb_assert_called_without_a_valid_));
            return NIL;
        }
        SubLObject current;
        final SubLObject datum = current = mode_data;
        SubLObject keyword = NIL;
        SubLObject handler = NIL;
        SubLObject title = NIL;
        SubLObject action_label = NIL;
        destructuring_bind_must_consp(current, datum, $list317);
        keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list317);
        handler = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list317);
        title = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list317);
        action_label = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject id = cb_extract_values_for_assert(assertion, sentence, use_sentenceP, handler);
            SubLObject formula = thread.secondMultipleValue();
            final SubLObject mt = thread.thirdMultipleValue();
            final SubLObject direction = thread.fourthMultipleValue();
            SubLObject strength = thread.fifthMultipleValue();
            final SubLObject editing = thread.sixthMultipleValue();
            final SubLObject edit_formula_only = thread.seventhMultipleValue();
            final SubLObject asserted_by = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            if (NIL == strength) {
                strength = $DEFAULT;
            }
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_complete.html_complete_script();
                    dhtml_macros.dhtml_with_toggle_visibility_support();
                    dhtml_macros.html_basic_cb_scripts();
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str50$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
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
                            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input(handler, T, UNPROVIDED);
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    html_hidden_input($$$id, id, UNPROVIDED);
                                } else
                                    if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                                        html_hidden_input($$$id, cb_glob_id(sentence), UNPROVIDED);
                                    }

                                if ($META == mode) {
                                    if (NIL == use_sentenceP) {
                                        formula = $cb_assertion_indexical$.getGlobalValue();
                                    }
                                    html_princ($$$Please_use_);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_form($cb_assertion_indexical$.getGlobalValue(), ZERO_INTEGER, NIL);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_princ($str320$_to_refer_to_the_following_assert);
                                    html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                    cb_show_assertion_readably(assertion, T, T);
                                    html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                }
                                if (((NIL != assertion_handles.assertion_p(assertion)) && (($EDIT == mode) || ($FIX_TYPO == mode))) && (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion))) {
                                    final SubLObject color_val = $RED;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != color_val) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(color_val));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($str140$Note___This_assertion_has_meta_as);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                }
                                cb_help_preamble($CB_ASSERT_INTERNAL, NIL, UNPROVIDED);
                                html_reset_input($$$Reset_All_Fields);
                                html_indent(ONE_INTEGER);
                                html_submit_input(action_label, $$$assert, UNPROVIDED);
                                html_indent(ONE_INTEGER);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                if ((mode == $DEFAULT) || (mode == $SIMILAR)) {
                                    final SubLObject assertion_queue_input_name = $str300$assertion_queue;
                                    html_radio_input(assertion_queue_input_name, $str324$_local, eq($cb_assert_queue_default$.getDynamicValue(thread), $LOCAL), $str324$_local);
                                    html_indent(ONE_INTEGER);
                                    html_princ($$$Assert_using_Local_queue);
                                    html_indent(THREE_INTEGER);
                                    html_markup(html_macros.$html_label_head$.getGlobalValue());
                                    html_markup(html_macros.$html_label_for$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color($str327$_browse));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_radio_input(assertion_queue_input_name, $str327$_browse, eq($cb_assert_queue_default$.getDynamicValue(thread), $BROWSE), $str327$_browse);
                                        html_indent(ONE_INTEGER);
                                        html_princ($str328$Assert_now_and_browse_forward_inf);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                                    }
                                    html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                    html_indent(TWO_INTEGER);
                                    html_markup(html_macros.$html_label_head$.getGlobalValue());
                                    html_markup(html_macros.$html_label_for$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color($str329$_now));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_radio_input(assertion_queue_input_name, $str329$_now, eq($cb_assert_queue_default$.getDynamicValue(thread), $NOW), $str329$_now);
                                        html_indent(ONE_INTEGER);
                                        html_princ($str330$Assert_now__bypassing_Local_queue);
                                        html_indent(THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                    }
                                    html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                }
                                dhtml_macros.dhtml_switch_visibility_links($str331$cb_assert_parameters, $$$Show, $$$Hide);
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$Assert_Context);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                final SubLObject initial_visibility = $INVISIBLE;
                                dhtml_macros.dhtml_set_switched_visibility($str331$cb_assert_parameters, initial_visibility, $PARAGRAPH);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str331$cb_assert_parameters);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_strength_and_direction_section(strength, direction, list($EDIT_ONLY, edit_formula_only));
                                    final SubLObject display_options = list($kw338$EDIT_ALLOWED_, makeBoolean(NIL == edit_formula_only), $MONAD_CHOICES, $list340, $kw341$ANYTIME_PSC_ALLOWED_, NIL);
                                    cb_form_widgets.cb_mt_input_section(mt, display_options);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_newline(UNPROVIDED);
                                final SubLObject choices = cb_assert_sentence_constant_suggestions(mode);
                                final SubLObject display_options2 = list(new SubLObject[]{ $INPUT_NAME, $$$sentence, $COMPLETE_LABEL, $$$Complete, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear_Sentence, $HEIGHT, TWENTY_INTEGER, $WIDTH, $int$80, $MODE, $ASSERT, $CHOICES, choices });
                                cb_form_widgets.cb_el_sentence_input_section(formula, display_options2);
                                if ((NIL != assertion_handles.assertion_p(assertion)) && (($EDIT == mode) || ($FIX_TYPO == mode))) {
                                    cb_tabulate_checkable_meta_assertions(assertion, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$65, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list317);
        }
        return NIL;
    }

    public static final SubLObject cb_assert_sentence_constant_suggestions_alt(SubLObject mode) {
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($META)) {
                return $list_alt335;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject cb_assert_sentence_constant_suggestions(final SubLObject mode) {
        if (mode.eql($META)) {
            return $list355;
        }
        return NIL;
    }

    /**
     * If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.
     */
    @LispMethod(comment = "If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.")
    public static final SubLObject cb_extract_values_for_assert_alt(SubLObject assertion, SubLObject sentence, SubLObject use_sentenceP, SubLObject handler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = NIL;
                SubLObject formula = NIL;
                SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
                SubLObject direction = NIL;
                SubLObject strength = NIL;
                SubLObject editing = NIL;
                SubLObject edit_formula_only = NIL;
                SubLObject asserted_by = NIL;
                SubLObject assertion_specifiedP = assertion_handles.assertion_p(assertion);
                SubLObject sentence_specifiedP = possibly_sentence_p(sentence);
                SubLObject ist_sentenceP = ist_sentence_p(sentence);
                if (NIL != $cb_default_mt$.getDynamicValue(thread)) {
                    mt = $cb_default_mt$.getDynamicValue(thread);
                }
                if (NIL != sentence_specifiedP) {
                    if (NIL != ist_sentenceP) {
                        mt = designated_mt(sentence);
                        formula = designated_sentence(sentence);
                    } else {
                        formula = sentence;
                    }
                }
                if (NIL != assertion_specifiedP) {
                    if (!((NIL != ist_sentenceP) && (NIL != use_sentenceP))) {
                        mt = assertions_high.assertion_mt(assertion);
                    }
                    if (!((NIL != sentence_specifiedP) && (NIL != use_sentenceP))) {
                        formula = ke.ke_assertion_edit_formula(assertion);
                    }
                    id = assertion_handles.assertion_id(assertion);
                    direction = assertions_high.assertion_direction(assertion);
                    strength = assertions_high.assertion_strength(assertion);
                    editing = makeBoolean(($str_alt336$cb_handle_fix_typo.equal(handler) || $str_alt337$cb_handle_edit.equal(handler)) || $str_alt338$cb_handle_sentence_edit.equal(handler));
                    edit_formula_only = equal($str_alt336$cb_handle_fix_typo, handler);
                    asserted_by = (NIL != assertions_high.asserted_assertionP(assertion)) ? ((SubLObject) (assertions_high.asserted_by(assertion))) : NIL;
                }
                return values(id, formula, mt, direction, strength, editing, edit_formula_only, asserted_by);
            }
        }
    }

    /**
     * If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.
     */
    @LispMethod(comment = "If both ASSERTION and SENTENCE are provided and USE-SENTENCE? is nil, SENTENCE is ignored.")
    public static SubLObject cb_extract_values_for_assert(final SubLObject assertion, final SubLObject sentence, final SubLObject use_sentenceP, final SubLObject handler) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = NIL;
        SubLObject formula = NIL;
        SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
        SubLObject direction = NIL;
        SubLObject strength = NIL;
        SubLObject editing = NIL;
        SubLObject edit_formula_only = NIL;
        SubLObject asserted_by = NIL;
        final SubLObject assertion_specifiedP = assertion_handles.assertion_p(assertion);
        final SubLObject sentence_specifiedP = possibly_sentence_p(sentence);
        final SubLObject ist_sentenceP = ist_sentence_p(sentence, UNPROVIDED);
        if (NIL != $cb_default_mt$.getDynamicValue(thread)) {
            mt = $cb_default_mt$.getDynamicValue(thread);
        }
        if (NIL != sentence_specifiedP) {
            if (NIL != ist_sentenceP) {
                mt = designated_mt(sentence);
                formula = designated_sentence(sentence);
            } else {
                formula = sentence;
            }
        }
        if (NIL != assertion_specifiedP) {
            if ((NIL == ist_sentenceP) || (NIL == use_sentenceP)) {
                mt = assertions_high.assertion_mt(assertion);
            }
            if ((NIL == sentence_specifiedP) || (NIL == use_sentenceP)) {
                formula = ke.ke_assertion_edit_formula(assertion);
            }
            id = assertion_handles.assertion_id(assertion);
            direction = assertions_high.assertion_direction(assertion);
            strength = assertions_high.assertion_strength(assertion);
            editing = makeBoolean(($str356$cb_handle_fix_typo.equal(handler) || $str357$cb_handle_edit.equal(handler)) || $str358$cb_handle_sentence_edit.equal(handler));
            edit_formula_only = equal($str356$cb_handle_fix_typo, handler);
            asserted_by = (NIL != assertions_high.asserted_assertionP(assertion)) ? assertions_high.asserted_by(assertion) : NIL;
        }
        return values(id, formula, mt, direction, strength, editing, edit_formula_only, asserted_by);
    }

    public static final SubLObject cb_tabulate_checkable_meta_assertions_alt(SubLObject assertion, SubLObject newlines_before_message, SubLObject checkbox_name_prefix, SubLObject message, SubLObject meta_assertions_checkedP) {
        if (newlines_before_message == UNPROVIDED) {
            newlines_before_message = ZERO_INTEGER;
        }
        if (checkbox_name_prefix == UNPROVIDED) {
            checkbox_name_prefix = $str_alt134$preserve_;
        }
        if (message == UNPROVIDED) {
            message = $str_alt339$Choose_analogous_meta_assertions_;
        }
        if (meta_assertions_checkedP == UNPROVIDED) {
            meta_assertions_checkedP = $cb_a_edit_preserve_meta_assertions_by_defaultP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                html_newline(newlines_before_message);
                html_princ_strong(message);
                {
                    SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = all_meta_assertions;
                                SubLObject meta_assertion = NIL;
                                for (meta_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_assertion = cdolist_list_var.first()) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($LEFT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($TOP));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject meta_assertion_checkbox_value = assertion_handles.assertion_id(meta_assertion);
                                                        SubLObject meta_assertion_checkbox_name = format(NIL, $str_alt340$_a_S, checkbox_name_prefix, meta_assertion_checkbox_value);
                                                        html_checkbox_input(meta_assertion_checkbox_name, meta_assertion_checkbox_value, meta_assertions_checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($LEFT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($TOP));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_show_meta_assertion_readably(meta_assertion, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_tabulate_checkable_meta_assertions(final SubLObject assertion, SubLObject newlines_before_message, SubLObject checkbox_name_prefix, SubLObject message, SubLObject meta_assertions_checkedP) {
        if (newlines_before_message == UNPROVIDED) {
            newlines_before_message = ZERO_INTEGER;
        }
        if (checkbox_name_prefix == UNPROVIDED) {
            checkbox_name_prefix = $str152$preserve_;
        }
        if (message == UNPROVIDED) {
            message = $str359$Choose_analogous_meta_assertions_;
        }
        if (meta_assertions_checkedP == UNPROVIDED) {
            meta_assertions_checkedP = $cb_a_edit_preserve_meta_assertions_by_defaultP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            html_newline(newlines_before_message);
            html_princ_strong(message);
            final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = all_meta_assertions;
                SubLObject meta_assertion = NIL;
                meta_assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == assertion_utilities.gaf_assertion_with_pred_p(meta_assertion, $$assertionOriginalText)) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject meta_assertion_checkbox_value = assertion_handles.assertion_id(meta_assertion);
                                final SubLObject meta_assertion_checkbox_name = format(NIL, $str361$_a_S, checkbox_name_prefix, meta_assertion_checkbox_value);
                                html_checkbox_input(meta_assertion_checkbox_name, meta_assertion_checkbox_value, meta_assertions_checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_show_meta_assertion_readably(meta_assertion, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_assertion = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_show_meta_assertion_readably_alt(SubLObject meta_assertion, SubLObject assertion, SubLObject assertion_indexical, SubLObject wrapP, SubLObject include_mtP) {
        if (assertion_indexical == UNPROVIDED) {
            assertion_indexical = $$TheAssertionSentence;
        }
        if (wrapP == UNPROVIDED) {
            wrapP = T;
        }
        if (include_mtP == UNPROVIDED) {
            include_mtP = T;
        }
        return cb_show_assertion_readably(meta_assertion, wrapP, include_mtP);
    }

    public static SubLObject cb_show_meta_assertion_readably(final SubLObject meta_assertion, final SubLObject assertion, SubLObject assertion_indexical, SubLObject wrapP, SubLObject include_mtP) {
        if (assertion_indexical == UNPROVIDED) {
            assertion_indexical = $$TheAssertionSentence;
        }
        if (wrapP == UNPROVIDED) {
            wrapP = T;
        }
        if (include_mtP == UNPROVIDED) {
            include_mtP = T;
        }
        return cb_show_assertion_readably(meta_assertion, wrapP, include_mtP);
    }

    /**
     * Return the Mt specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the Mt specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static final SubLObject cb_extract_mt_from_string_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject mt = cb_guess_hlmt(string);
            if (NIL == hlmt.hlmt_p(mt)) {
                cb_error($str_alt343$_S_did_not_specify_a_microtheory_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            if (NIL == cb_valid_microtheoryP(mt)) {
                cb_error($str_alt344$_S_is_not_a_microtheory_, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            return mt;
        }
    }

    /**
     * Return the Mt specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the Mt specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static SubLObject cb_extract_mt_from_string(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject mt = cb_guess_hlmt(string);
        if (NIL == hlmt.hlmt_p(mt)) {
            cb_error($str364$_S_did_not_specify_a_microtheory_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL == cb_valid_microtheoryP(mt)) {
            cb_error($str365$_S_is_not_a_microtheory_, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return mt;
    }

    public static final SubLObject cb_valid_microtheoryP_alt(SubLObject mt) {
        return makeBoolean(((NIL != mt) && (NIL != hlmt.possibly_hlmt_p(mt))) && (NIL != isa.isa_in_any_mtP(mt, $$Microtheory)));
    }

    public static SubLObject cb_valid_microtheoryP(final SubLObject mt) {
        return makeBoolean(((NIL != mt) && (NIL != hlmt.possibly_hlmt_p(mt))) && (NIL != isa.isa_in_any_mtP(mt, $$Microtheory)));
    }

    /**
     * Return the CycL sentence specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the CycL sentence specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static final SubLObject cb_extract_formula_from_string_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject sentence = read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL == possibly_sentence_p(sentence)) {
                cb_error($str_alt346$Bad_sentence__probably_due_to_a_m, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            if (NIL != mt) {
                {
                    SubLObject wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
                    if (NIL != wff_violations) {
                        return cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return sentence;
        }
    }

    /**
     * Return the CycL sentence specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the CycL sentence specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static SubLObject cb_extract_formula_from_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject sentence = read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        if (NIL == possibly_sentence_p(sentence)) {
            cb_error($str367$Bad_sentence__probably_due_to_a_m, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL != mt) {
            final SubLObject wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
            if (NIL != wff_violations) {
                return cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return sentence;
    }

    public static final SubLObject cb_wff_check_sentence_int_alt(SubLObject sentence, SubLObject mt, SubLObject show_ok_pageP, SubLObject assert_modeP) {
        if (show_ok_pageP == UNPROVIDED) {
            show_ok_pageP = T;
        }
        if (assert_modeP == UNPROVIDED) {
            assert_modeP = NIL;
        }
        {
            SubLObject wff_violations = NIL;
            if (NIL != assert_modeP) {
                wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
            } else {
                wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
            }
            if (NIL != wff_violations) {
                cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != show_ok_pageP) {
                    cb_wff_check_formula_ok(sentence, mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_check_sentence_int(final SubLObject sentence, final SubLObject mt, SubLObject show_ok_pageP, SubLObject assert_modeP) {
        if (show_ok_pageP == UNPROVIDED) {
            show_ok_pageP = T;
        }
        if (assert_modeP == UNPROVIDED) {
            assert_modeP = NIL;
        }
        SubLObject wff_violations = NIL;
        if (NIL != assert_modeP) {
            wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
        } else {
            wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
        }
        if (NIL != wff_violations) {
            cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != show_ok_pageP) {
                cb_wff_check_formula_ok(sentence, mt);
            }

        return NIL;
    }

    /**
     * Bring up the assertion tool in :default mode, but with the given mt and formula filled in automatically.
     */
    @LispMethod(comment = "Bring up the assertion tool in :default mode, but with the given mt and formula filled in automatically.")
    public static final SubLObject cb_assert_formula_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject formula_id = NIL;
                SubLObject mt_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt347);
                formula_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt347);
                mt_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject formula = cb_glob_lookup_by_string(formula_id);
                        SubLObject mt = cb_guess_fort(mt_id, UNPROVIDED);
                        SubLObject sentence = list($$ist, mt, formula);
                        cb_assert_internal($DEFAULT, NIL, sentence, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt347);
                }
            }
        }
        return NIL;
    }

    /**
     * Bring up the assertion tool in :default mode, but with the given mt and formula filled in automatically.
     */
    @LispMethod(comment = "Bring up the assertion tool in :default mode, but with the given mt and formula filled in automatically.")
    public static SubLObject cb_assert_formula(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject formula_id = NIL;
            SubLObject mt_id = NIL;
            destructuring_bind_must_consp(args, args, $list368);
            formula_id = args.first();
            SubLObject current = args.rest();
            destructuring_bind_must_consp(current, args, $list368);
            mt_id = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject formula = cb_glob_lookup_by_string(formula_id);
                final SubLObject mt = cb_guess_fort(mt_id, UNPROVIDED);
                final SubLObject sentence = list($$ist, mt, formula);
                cb_assert_internal($DEFAULT, NIL, sentence, UNPROVIDED);
            } else {
                cdestructuring_bind_error(args, $list368);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_assert_formula_alt(SubLObject formula, SubLObject mt, SubLObject linktext) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = $$BaseKB;
            }
            if (NIL == linktext) {
                linktext = $str_alt351$_Assert_Formula_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt352$cb_assert_formula__A__A, cb_glob_id(formula), cb_fort_identifier(mt));
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
            return formula;
        }
    }

    public static SubLObject cb_link_assert_formula(final SubLObject formula, SubLObject mt, SubLObject linktext) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            mt = $$BaseKB;
        }
        if (NIL == linktext) {
            linktext = $str372$_Assert_Formula_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str373$cb_assert_formula__A__A, cb_glob_id(formula), cb_fort_identifier(mt));
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
        return formula;
    }

    public static final SubLObject cb_similar_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        if (NIL == assertion_handles.assertion_p(assertion)) {
                            cb_error($str_alt238$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        cb_assert_internal($SIMILAR, assertion, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_similar(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_assert_internal($SIMILAR, assertion, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_assert_similar_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt356$_Assert_Similar_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt357$cb_similar__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_assert_similar(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str377$_Assert_Similar_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str378$cb_similar__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_assert_meta_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = cb_guess_assertion(id);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        cb_error($str_alt238$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    return cb_assert_internal($META, assertion, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt117);
            }
        }
        return NIL;
    }

    public static SubLObject cb_assert_meta(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        }
        SubLObject id = NIL;
        destructuring_bind_must_consp(args, args, $list134);
        id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list134);
            return NIL;
        }
        final SubLObject assertion = cb_guess_assertion(id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_assert_internal($META, assertion, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_handle_assert_meta_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$editing);
                return NIL;
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    return cb_error($str_alt250$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thread.resetMultipleValues();
                {
                    SubLObject error = cb_extract_some_assert_arguments(args);
                    SubLObject mt = thread.secondMultipleValue();
                    SubLObject sentence = thread.thirdMultipleValue();
                    SubLObject strength = thread.fourthMultipleValue();
                    SubLObject direction = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != error) {
                        return NIL;
                    }
                    if (NIL == list_utilities.tree_find($cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED)) {
                        return cb_error($str_alt361$The_sentence_did_not_mention__S_, $cb_assertion_indexical$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject assertion_sentence = uncanonicalizer.assertion_el_ist_formula(assertion);
                        sentence = subst(assertion_sentence, $cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str_alt280$wff_check, args))) {
                            return cb_wff_check_sentence_int(sentence, mt, T, UNPROVIDED);
                        }
                        {
                            SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                            if (NIL != wff_violations) {
                                return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
                            }
                        }
                        ke.ke_assert(sentence, mt, strength, direction);
                        cb_make_bug_dependancy_meta_assertion_if_needed(sentence, mt, args, UNPROVIDED);
                        return cb_note_edit_change($$$EL_Meta_Sentence_Assert, T, THREE_INTEGER, UNPROVIDED);
                    }
                }
            }
        }
    }

    public static SubLObject cb_handle_assert_meta(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$editing);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        if (NIL == list_utilities.tree_find($cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED)) {
            return cb_error($str382$The_sentence_did_not_mention__S_, $cb_assertion_indexical$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject assertion_sentence = uncanonicalizer.assertion_el_ist_formula(assertion);
        sentence = subst(assertion_sentence, $cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str299$wff_check, args))) {
            return cb_wff_check_sentence_int(sentence, mt, T, UNPROVIDED);
        }
        final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
        if (NIL != wff_violations) {
            return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
        }
        ke.ke_assert(sentence, mt, strength, direction);
        return cb_note_edit_change($$$EL_Meta_Sentence_Assert, T, THREE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject cb_link_assert_meta_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt364$_Assert_Meta_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt365$cb_assert_meta__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_assert_meta(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str385$_Assert_Meta_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str386$cb_assert_meta__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static SubLObject cb_suggest_pragmas(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_suggest_pragmas_guts(assertion);
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_suggest_pragmas(final SubLObject rule, SubLObject linktext, SubLObject disabledP, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str389$_Suggest_Pragmas_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name(target);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str390$cb_suggest_pragmas__a, assertion_handles.assertion_id(rule));
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
        return rule;
    }

    public static SubLObject cb_suggest_pragmas_guts(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pragmas = pragma_induction.rule_suggested_pragma_sentences(rule, UNPROVIDED);
        final SubLObject title_var = $$$Suggested_Pragmas;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$76 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$77 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
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
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_SUGGEST_PRAGMAS, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str394$Pragmatic_requirements_worth_cons);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_show_assertion_readably(rule, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = pragmas;
                                SubLObject pragma = NIL;
                                pragma = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            final SubLObject pragmatic_requirement = make_binary_formula($$pragmaticRequirement, pragma, $$TheAssertionSentence);
                                            cb_link($ASSERT_SUGGESTED_PRAGMA, rule, pragmatic_requirement, $str397$_Assert_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_glyph($NBSP, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_show_term(pragma, ZERO_INTEGER, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    pragma = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$77, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$76, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_assert_suggested_pragma(final SubLObject assertion, final SubLObject pragma, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str397$_Assert_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject encoded_pragma = cb_string_for_sentence(pragma);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str399$cb_assert_suggested_pragma__a__a, id, encoded_pragma);
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
        return assertion;
    }

    public static SubLObject cb_assert_suggested_pragma(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        }
        SubLObject id_string = NIL;
        SubLObject pragma_string = NIL;
        destructuring_bind_must_consp(args, args, $list401);
        id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list401);
        pragma_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion = cb_guess_assertion(id_string);
            final SubLObject pragma = cb_guess_sentence(pragma_string);
            return cb_assert_internal($META, assertion, pragma, T);
        }
        cdestructuring_bind_error(args, $list401);
        return NIL;
    }

    /**
     * Execute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.
     * Used for editing since it is fairly common that the existing assertion will
     * conflict with the new one, but the existing is going to be unasserted anyway.
     */
    @LispMethod(comment = "Execute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.\r\nUsed for editing since it is fairly common that the existing assertion will\r\nconflict with the new one, but the existing is going to be unasserted anyway.\nExecute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.\nUsed for editing since it is fairly common that the existing assertion will\nconflict with the new one, but the existing is going to be unasserted anyway.")
    public static final SubLObject without_arg_format_and_relator_checking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt368, append(body, NIL));
        }
    }

    /**
     * Execute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.
     * Used for editing since it is fairly common that the existing assertion will
     * conflict with the new one, but the existing is going to be unasserted anyway.
     */
    @LispMethod(comment = "Execute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.\r\nUsed for editing since it is fairly common that the existing assertion will\r\nconflict with the new one, but the existing is going to be unasserted anyway.\nExecute BODY with arg-format and relator (e.g. negationPreds) wff-checking disabled.\nUsed for editing since it is fairly common that the existing assertion will\nconflict with the new one, but the existing is going to be unasserted anyway.")
    public static SubLObject without_arg_format_and_relator_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list404, append(body, NIL));
    }

    public static final SubLObject cb_edit_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        if (NIL == assertion_handles.assertion_p(assertion)) {
                            cb_error($str_alt238$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        cb_assert_internal($EDIT, assertion, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_edit(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_assert_internal($EDIT, assertion, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_edit_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$editing);
                return NIL;
            }
            if (NIL != list_utilities.sublisp_boolean(html_extract_input($str_alt280$wff_check, args))) {
                return cb_wff_check_formula(args, NIL);
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    return cb_error($str_alt250$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thread.resetMultipleValues();
                {
                    SubLObject error = cb_extract_some_assert_arguments(args);
                    SubLObject mt = thread.secondMultipleValue();
                    SubLObject sentence = thread.thirdMultipleValue();
                    SubLObject strength = thread.fourthMultipleValue();
                    SubLObject direction = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != error) {
                        return NIL;
                    }
                    {
                        SubLObject wff_violations = NIL;
                        {
                            SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                            try {
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
                            } finally {
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_1, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != wff_violations) {
                            cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                    }
                    {
                        SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, UNPROVIDED, UNPROVIDED);
                        cb_edit_assertion_hook(assertion, sentence, mt, strength, direction, meta_assertions_to_preserve);
                    }
                    cb_make_bug_dependancy_meta_assertion_if_needed(sentence, mt, args, UNPROVIDED);
                    cb_email_notify_if_needed_for_assertion(assertion, sentence, mt, args, UNPROVIDED);
                    return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject cb_handle_edit(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$editing);
            return NIL;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str299$wff_check, args))) {
            return cb_wff_check_formula(args, NIL);
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        final SubLObject sentence_string = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        SubLObject wff_violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
        } finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != wff_violations) {
            cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, UNPROVIDED, UNPROVIDED);
        cb_edit_assertion_hook(assertion, sentence, mt, strength, direction, meta_assertions_to_preserve, sentence_string);
        return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
    }

    /**
     * Returns list of (<meta assertion> <meta-assertion mt>) pairs which can be used to assert the meta assertion while preserving them in a new mt.
     */
    @LispMethod(comment = "Returns list of (<meta assertion> <meta-assertion mt>) pairs which can be used to assert the meta assertion while preserving them in a new mt.")
    public static final SubLObject cb_extract_meta_assertions_from_args_alt(SubLObject assertion, SubLObject args, SubLObject start_with_prefix, SubLObject new_meta_assertion_mt) {
        if (start_with_prefix == UNPROVIDED) {
            start_with_prefix = $str_alt134$preserve_;
        }
        if (new_meta_assertion_mt == UNPROVIDED) {
            new_meta_assertion_mt = NIL;
        }
        {
            SubLObject meta_assertions_to_preserve = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isCons()) {
                    {
                        SubLObject datum = arg;
                        SubLObject current = datum;
                        SubLObject input_name = NIL;
                        SubLObject assertion_id_string = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt372);
                        input_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt372);
                        assertion_id_string = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != string_utilities.starts_with(input_name, start_with_prefix)) {
                                {
                                    SubLObject meta_assertion = cb_guess_assertion(assertion_id_string);
                                    SubLObject meta_assertion_mt = (NIL != new_meta_assertion_mt) ? ((SubLObject) (new_meta_assertion_mt)) : assertions_high.assertion_mt(meta_assertion);
                                    if ((NIL != assertion_handles.assertion_p(meta_assertion)) && (NIL != cycl_utilities.expression_find(assertion, meta_assertion, T, UNPROVIDED, UNPROVIDED))) {
                                        meta_assertions_to_preserve = cons(list(meta_assertion, meta_assertion_mt), meta_assertions_to_preserve);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt372);
                        }
                    }
                }
            }
            return nreverse(meta_assertions_to_preserve);
        }
    }

    /**
     * Returns list of (<meta assertion> <meta-assertion mt>) pairs which can be used to assert the meta assertion while preserving them in a new mt.
     */
    @LispMethod(comment = "Returns list of (<meta assertion> <meta-assertion mt>) pairs which can be used to assert the meta assertion while preserving them in a new mt.")
    public static SubLObject cb_extract_meta_assertions_from_args(final SubLObject assertion, final SubLObject args, SubLObject start_with_prefix, SubLObject new_meta_assertion_mt) {
        if (start_with_prefix == UNPROVIDED) {
            start_with_prefix = $str152$preserve_;
        }
        if (new_meta_assertion_mt == UNPROVIDED) {
            new_meta_assertion_mt = NIL;
        }
        SubLObject meta_assertions_to_preserve = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject input_name = NIL;
                SubLObject assertion_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list408);
                input_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list408);
                assertion_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != string_utilities.starts_with(input_name, start_with_prefix)) {
                        final SubLObject meta_assertion = cb_guess_assertion(assertion_id_string);
                        final SubLObject meta_assertion_mt = (NIL != new_meta_assertion_mt) ? new_meta_assertion_mt : assertions_high.assertion_mt(meta_assertion);
                        if ((NIL != assertion_handles.assertion_p(meta_assertion)) && (NIL != cycl_utilities.expression_find(assertion, meta_assertion, T, UNPROVIDED, UNPROVIDED))) {
                            meta_assertions_to_preserve = cons(list(meta_assertion, meta_assertion_mt), meta_assertions_to_preserve);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list408);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(meta_assertions_to_preserve);
    }

    public static final SubLObject cb_link_edit_assertion_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt373$_Edit_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name(target);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt374$cb_edit__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_edit_assertion(final SubLObject assertion, SubLObject linktext, SubLObject disabledP, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str409$_Edit_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name(target);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str410$cb_edit__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static SubLObject cb_handle_edit_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            if (NIL != ke.cyclist_is_guest()) {
                try {
                    final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str413$_S, cyc_navigator_internals.guest_warn_string($$$assertion_editing_facilities));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$87, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$86, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$error);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
                return NIL;
            }
            SubLObject problem_sentence_info = NIL;
            SubLObject good_sentence_info = NIL;
            final SubLObject assertion_id_to_delete = html_extract_sexpr($$$oldAssertionId, args, UNPROVIDED);
            final SubLObject assertion_to_delete = (NIL != assertion_id_to_delete) ? assertion_handles.find_assertion_by_id(assertion_id_to_delete) : NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.proper_list_p(arg)) {
                    final SubLObject param = arg.first();
                    if (NIL != string_utilities.starts_with(param, $$$sentence)) {
                        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, list($INPUT_NAME, param));
                        final SubLObject sentence_num = subseq(param, EIGHT_INTEGER, UNPROVIDED);
                        if (NIL != wff.el_wffP(sentence, UNPROVIDED, UNPROVIDED)) {
                            good_sentence_info = cons(list($SENTENCE_NUM, sentence_num, $SENTENCE, sentence), good_sentence_info);
                        } else {
                            problem_sentence_info = cons(list($SENTENCE_NUM, sentence_num, $SENTENCE, html_extract_input(param, args), $MESSAGE, wff.explanation_of_why_not_wff_terse(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()), problem_sentence_info);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            if (NIL == problem_sentence_info) {
                if ((NIL != assertion_to_delete) && (NIL != list_utilities.lengthE(good_sentence_info, ONE_INTEGER, UNPROVIDED))) {
                    final SubLObject to_add = getf(good_sentence_info.first(), $SENTENCE, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject successP = ke.ke_edit_now(uncanonicalizer.assertion_el_formula(assertion_to_delete), to_add, assertions_high.assertion_mt(assertion_to_delete), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject err_msg = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == successP) {
                        problem_sentence_info = cons(list($SENTENCE, to_add, $SENTENCE_NUM, getf(good_sentence_info.first(), $SENTENCE_NUM, UNPROVIDED), $MESSAGE, string_utilities.bunge(wff.explanation_of_why_not_wff_terse_assert(to_add, UNPROVIDED, UNPROVIDED, UNPROVIDED), CHAR_newline)), problem_sentence_info);
                    }
                } else {
                    if (NIL != assertion_to_delete) {
                        ke.ke_unassert_assertion_now(assertion_to_delete);
                    }
                    cdolist_list_var = good_sentence_info;
                    SubLObject sentence_info = NIL;
                    sentence_info = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject sentence2 = getf(sentence_info, $SENTENCE, UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject successP2 = ke.ke_assert_now(sentence2, $$BaseKB, UNPROVIDED, UNPROVIDED);
                        final SubLObject msg = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == successP2) {
                            problem_sentence_info = cons(list($SENTENCE, sentence2, $SENTENCE_NUM, getf(sentence_info, $SENTENCE_NUM, UNPROVIDED), $MESSAGE, msg), problem_sentence_info);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence_info = cdolist_list_var.first();
                    } 
                }
            }
            try {
                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$response, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        if (NIL != problem_sentence_info) {
                            try {
                                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = problem_sentence_info;
                                        SubLObject sentence_info2 = NIL;
                                        sentence_info2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            final SubLObject sentence3 = getf(sentence_info2, $SENTENCE, UNPROVIDED);
                                            final SubLObject error_message = getf(sentence_info2, $MESSAGE, $NOT_WELL_FORMED);
                                            final SubLObject attrs = list($$$id, getf(sentence_info2, $SENTENCE_NUM, UNPROVIDED));
                                            try {
                                                final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$invalidSentence, attrs, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(format_nil.format_nil_s(sentence3));
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$invalidSentence);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                                }
                                            }
                                            try {
                                                final SubLObject _prev_bind_0_$96 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$message, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$97 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(error_message);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$97, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$96, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$message);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sentence_info2 = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$error);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                                }
                            }
                        } else {
                            final SubLObject attrs2 = list($$$count, string_utilities.to_string(length(good_sentence_info)));
                            try {
                                final SubLObject _prev_bind_0_$100 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$assertionsQueued, attrs2, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$101 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str425$_A_assertion_P_added_to_the_local, length(good_sentence_info), length(good_sentence_info));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$101, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$95, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$100, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$assertionsQueued);
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                                }
                            }
                            if (NIL != assertion_to_delete) {
                                final SubLObject attrs_$107 = $list426;
                                try {
                                    final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$unassertedQueued, attrs_$107, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str428$_A_unassert__P_added_to_the_local, ONE_INTEGER);
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values6 = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($$$unassertedQueued);
                                        restoreValuesFromVector(_values6);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values7 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$response);
                    restoreValuesFromVector(_values7);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_sentence_edit_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$editing);
                return NIL;
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject sentence = cb_glob_lookup_by_string(id);
                if (NIL == ist_sentence_p(sentence)) {
                    return cb_error($str_alt376$_S_did_not_specify_a_CycL_sentenc, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thread.resetMultipleValues();
                {
                    SubLObject error = cb_extract_some_assert_arguments(args);
                    SubLObject new_mt = thread.secondMultipleValue();
                    SubLObject new_sentence = thread.thirdMultipleValue();
                    SubLObject new_strength = thread.fourthMultipleValue();
                    SubLObject new_direction = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != error) {
                        return NIL;
                    }
                    {
                        SubLObject wff_violations = NIL;
                        {
                            SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                            try {
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                wff_violations = wff.why_not_wff_assert(new_sentence, new_mt, UNPROVIDED);
                            } finally {
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_1, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != wff_violations) {
                            return cb_explain_why_not_wff(new_sentence, new_mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject old_sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                        SubLObject old_mt = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                        cb_handle_sentence_edit_int(old_sentence, old_mt, new_sentence, new_mt, new_strength, new_direction);
                        cb_email_notify_if_needed_for_sentence(old_sentence, old_mt, new_sentence, new_mt, args, UNPROVIDED);
                    }
                }
            }
            return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
        }
    }

    public static SubLObject cb_handle_sentence_edit(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$editing);
            return NIL;
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject sentence = cb_glob_lookup_by_string(id);
        if (NIL == ist_sentence_p(sentence, UNPROVIDED)) {
            return cb_error($str431$_S_did_not_specify_a_CycL_sentenc, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject new_mt = thread.secondMultipleValue();
        final SubLObject new_sentence = thread.thirdMultipleValue();
        final SubLObject new_strength = thread.fourthMultipleValue();
        final SubLObject new_direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        SubLObject wff_violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            wff_violations = wff.why_not_wff_assert(new_sentence, new_mt, UNPROVIDED);
        } finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != wff_violations) {
            return cb_explain_why_not_wff(new_sentence, new_mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject old_sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject old_mt = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        cb_handle_sentence_edit_int(old_sentence, old_mt, new_sentence, new_mt, new_strength, new_direction);
        return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject cb_handle_sentence_edit_int_alt(SubLObject old_sentence, SubLObject old_mt, SubLObject new_sentence, SubLObject new_mt, SubLObject new_strength, SubLObject new_direction) {
        cb_tools.cb_rem_from_sentence_history(make_ist_sentence(old_mt, old_sentence));
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(new_sentence, new_mt);
        return ke.ke_edit(old_sentence, new_sentence, old_mt, new_mt, new_strength, new_direction);
    }

    public static SubLObject cb_handle_sentence_edit_int(final SubLObject old_sentence, final SubLObject old_mt, final SubLObject new_sentence, final SubLObject new_mt, final SubLObject new_strength, final SubLObject new_direction) {
        cb_tools.cb_rem_from_sentence_history(make_ist_sentence(old_mt, old_sentence));
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(new_sentence, new_mt);
        return ke.ke_edit(old_sentence, new_sentence, old_mt, new_mt, new_strength, new_direction);
    }

    public static final SubLObject cb_fix_typo_edit_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_typo_fixing_facilities);
        } else {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion = cb_guess_assertion(id);
                        if (NIL == assertion_handles.assertion_p(assertion)) {
                            cb_error($str_alt238$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        cb_assert_internal($FIX_TYPO, assertion, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_fix_typo_edit(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_typo_fixing_facilities);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_assert_internal($FIX_TYPO, assertion, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(args, $list134);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_fix_typo_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt380$_Fix_Typo_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt381$cb_fix_typo_edit__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_fix_typo(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str435$_Fix_Typo_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str436$cb_fix_typo_edit__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_handle_fix_typo_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Cyc_KB_typo_fixing_facilities);
                return NIL;
            }
            if (NIL != list_utilities.sublisp_boolean(html_extract_input($str_alt280$wff_check, args))) {
                return cb_wff_check_formula(args, T);
            }
            {
                SubLObject id = html_extract_input($$$id, args);
                SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    return cb_error($str_alt250$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thread.resetMultipleValues();
                {
                    SubLObject error = cb_extract_some_assert_arguments(args);
                    SubLObject mt = thread.secondMultipleValue();
                    SubLObject sentence = thread.thirdMultipleValue();
                    SubLObject strength = thread.fourthMultipleValue();
                    SubLObject direction = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != error) {
                        return NIL;
                    }
                    {
                        SubLObject old_sentence = ke.ke_assertion_edit_formula(assertion);
                        if (NIL == ke.formulas_differ_only_in_strings(old_sentence, sentence)) {
                            return cb_error($str_alt383$Edited_sentence_does_not_differ_o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject wff_violations = NIL;
                        {
                            SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                            try {
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
                            } finally {
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_1, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != wff_violations) {
                            return cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, UNPROVIDED, UNPROVIDED);
                        cb_edit_assertion_strings_hook(assertion, sentence, meta_assertions_to_preserve);
                    }
                    cb_make_bug_dependancy_meta_assertion_if_needed(sentence, mt, args, UNPROVIDED);
                    {
                        SubLObject email_notifyP = html_extract_input($str_alt384$email_notify, args);
                        SubLObject email_notify_recipients = html_extract_input($str_alt385$email_notify_recipients, args);
                        SubLObject email_explanation = html_extract_input($str_alt386$email_explanation, args);
                        if (NIL != email_notifyP) {
                            ke_formula_edit_email_notify(assertion, sentence, mt, email_notify_recipients, email_explanation);
                        }
                    }
                    return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject cb_handle_fix_typo(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_typo_fixing_facilities);
            return NIL;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str299$wff_check, args))) {
            return cb_wff_check_formula(args, T);
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return NIL;
        }
        final SubLObject old_sentence = ke.ke_assertion_edit_formula(assertion);
        if (NIL == ke.formulas_differ_only_in_strings(old_sentence, sentence, CYCL_STRING_P)) {
            return cb_error($str439$Edited_sentence_does_not_differ_o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject wff_violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            wff_violations = wff.why_not_wff_assert(sentence, mt, UNPROVIDED);
        } finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != wff_violations) {
            return cb_explain_why_not_wff(sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, UNPROVIDED, UNPROVIDED);
        cb_edit_assertion_strings_hook(assertion, sentence, meta_assertions_to_preserve);
        return cb_note_edit_change($$$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject cb_fix_typo_assertionP_alt(SubLObject assertion) {
        return cycl_utilities.assertion_find_if(symbol_function(STRINGP), assertion, T, UNPROVIDED);
    }

    public static SubLObject cb_fix_typo_assertionP(final SubLObject assertion) {
        return cycl_utilities.assertion_find_if(symbol_function(STRINGP), assertion, T, UNPROVIDED);
    }

    public static final SubLObject cb_reassert_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt238$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_null_edit_assertion_hook(assertion);
                    cb_note_edit_change($$$Reassert, T, TWO_INTEGER, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_reassert(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            final SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_null_edit_assertion_hook(assertion);
                cb_note_edit_change($$$Reassert, T, TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_reassert_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt390$_Reassert_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt391$cb_reassert__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_reassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str443$_Reassert_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str444$cb_reassert__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_unassert_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt238$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_tools.cb_rem_from_assertion_history(assertion);
                    ke.ke_unassert_assertion(assertion);
                    cb_note_edit_change($$$Unassert, T, TWO_INTEGER, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_unassert(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            final SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_tools.cb_rem_from_assertion_history(assertion);
                ke.ke_unassert_assertion(assertion);
                cb_note_edit_change($$$Unassert, T, TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_unassert_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt395$_Unassert_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt396$cb_unassert__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_unassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str448$_Unassert_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str449$cb_unassert__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_blast_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt238$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_tools.cb_rem_from_assertion_history(assertion);
                    ke.ke_blast_assertion(assertion);
                    cb_note_edit_change($$$Assertion_Blast, T, TWO_INTEGER, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_blast(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            final SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_tools.cb_rem_from_assertion_history(assertion);
                ke.ke_blast_assertion(assertion);
                cb_note_edit_change($$$Assertion_Blast, T, TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_blast_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt400$_Blast_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt401$cb_blast__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_blast(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str453$_Blast_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str454$cb_blast__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_remove_deduction_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt403);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject deduction = cb_guess_deduction(id_string);
                    if (NIL == deduction_handles.deduction_p(deduction)) {
                        return cb_error($str_alt404$_a_does_not_specify_a_deduction, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    ke.ke_remove_deduction(deduction);
                    return cb_note_edit_change($$$Deduction_Removal, T, TWO_INTEGER, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt403);
            }
        }
        return NIL;
    }

    public static SubLObject cb_remove_deduction(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        }
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list456);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list456);
            return NIL;
        }
        final SubLObject deduction = cb_guess_deduction(id_string);
        if (NIL == deduction_handles.deduction_p(deduction)) {
            return cb_error($str457$_a_does_not_specify_a_deduction, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        ke.ke_remove_deduction(deduction);
        return cb_note_edit_change($$$Deduction_Removal, T, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject cb_link_remove_deduction_alt(SubLObject deduction, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt407$_Remove_Deduction_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt408$cb_remove_deduction__a, deduction_handles.deduction_id(deduction));
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
            return deduction;
        }
    }

    public static SubLObject cb_link_remove_deduction(final SubLObject deduction, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str460$_Remove_Deduction_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str461$cb_remove_deduction__a, deduction_handles.deduction_id(deduction));
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
        return deduction;
    }

    /**
     * Intermediary: calls cb-assertion-tms-hook() and displays results.
     */
    @LispMethod(comment = "Intermediary: calls cb-assertion-tms-hook() and displays results.")
    public static final SubLObject cb_assertion_tms_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            {
                SubLObject assertion = cb_guess_assertion(args);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str_alt238$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_tms_reconsider_assertion(assertion);
                    cb_note_edit_change($$$Redo_TMS_for_Assertion, T, TWO_INTEGER, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * Intermediary: calls cb-assertion-tms-hook() and displays results.
     */
    @LispMethod(comment = "Intermediary: calls cb-assertion-tms-hook() and displays results.")
    public static SubLObject cb_assertion_tms(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            final SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                ke.ke_tms_reconsider_assertion(assertion);
                cb_note_edit_change($$$Redo_TMS_for_Assertion, T, TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Provides a link to the above function.
     */
    @LispMethod(comment = "Provides a link to the above function.")
    public static final SubLObject cb_link_assert_tms_alt(SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt413$_Redo_TMS_;
            }
            if (NIL != disabledP) {
                cb_disabled_link(linktext);
            } else {
                {
                    SubLObject frame_name_var = cb_frame_name($SELF);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt414$cb_assertion_tms__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    /**
     * Provides a link to the above function.
     */
    @LispMethod(comment = "Provides a link to the above function.")
    public static SubLObject cb_link_assert_tms(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str466$_Redo_TMS_;
        }
        if (NIL != disabledP) {
            cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str467$cb_assertion_tms__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static final SubLObject cb_diagnose_assertion_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$the_Assertion_Diagnostics_page);
            } else {
                {
                    SubLObject assertion = cb_guess_assertion(args);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        cb_error($str_alt419$_a_does_not_specify_a_Cyc_asserti, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    {
                        SubLObject title_var = $$$Assertion_Diagnostics;
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
                                    SubLObject _prev_bind_0_51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                            html_markup($str_alt40$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        cb_help_preamble($CB_DIAGNOSE_ASSERTION, UNPROVIDED, UNPROVIDED);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt421$Diagnosis_of__);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        cb_show_assertion_readably(assertion, UNPROVIDED, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                        {
                                                            SubLObject access_problem = cb_assertion_browser.cb_assertion_access_diagnostics(assertion);
                                                            SubLObject results = cb_diagnose_assertion_int(assertion);
                                                            if (NIL == results) {
                                                                if (NIL == access_problem) {
                                                                    html_princ($$$OK);
                                                                }
                                                            }
                                                        }
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_51, thread);
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

    public static SubLObject cb_diagnose_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Assertion_Diagnostics_page);
        } else {
            final SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str472$_a_does_not_specify_a_Cyc_asserti, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Assertion_Diagnostics;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$114 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str50$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
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
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                cb_help_preamble($CB_DIAGNOSE_ASSERTION, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str474$Diagnosis_of__);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                cb_show_assertion_readably(assertion, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                final SubLObject access_problem = cb_assertion_browser.cb_assertion_access_diagnostics(assertion);
                                final SubLObject results = cb_diagnose_assertion_int(assertion);
                                if ((NIL == results) && (NIL == access_problem)) {
                                    html_princ($$$OK);
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$114, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$113, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Only run KBI tests internally
     */
    @LispMethod(comment = "Only run KBI tests internally")
    public static final SubLObject cb_diagnose_assertion_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = kbi_assertion.diagnose_assertion_int(assertion);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt423$Results___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        {
                            SubLObject why = kbi_utilities.kbi_whyP(result, assertion, UNPROVIDED);
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                                try {
                                    html_macros.$within_html_pre$.bind(T, thread);
                                    cb_form(result, ZERO_INTEGER, T);
                                    if (why.isString()) {
                                        html_newline(UNPROVIDED);
                                        html_princ_doc_string(why, UNPROVIDED);
                                        html_newline(TWO_INTEGER);
                                    }
                                } finally {
                                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    }
                }
                return results;
            }
        }
    }

    /**
     * Only run KBI tests internally
     */
    @LispMethod(comment = "Only run KBI tests internally")
    public static SubLObject cb_diagnose_assertion_int(final SubLObject assertion) {
        return NIL;
    }

    public static final SubLObject cb_link_diagnose_assertion_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt424$_Run_Diagnostics_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt425$cb_diagnose_assertion__A, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_diagnose_assertion(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str476$_Run_Diagnostics_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str477$cb_diagnose_assertion__A, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static SubLObject cb_link_trigger_test(SubLObject support, SubLObject rule, SubLObject linktext) {
        if (support == UNPROVIDED) {
            support = NIL;
        }
        if (rule == UNPROVIDED) {
            rule = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str118$_Trigger_Test_;
        }
        if (((NIL != support) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == arguments.support_p(support))) {
            throw new AssertionError(support);
        }
        if (((NIL != rule) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == assertions_high.rule_assertionP(rule))) {
            throw new AssertionError(rule);
        }
        thread.resetMultipleValues();
        final SubLObject support_id = cb_trigger_test_id_strings(support, rule);
        final SubLObject rule_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (NIL != rule_id) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str482$cb_trigger_test__a__a, support_id, rule_id);
        } else
            if (NIL != support_id) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str483$cb_trigger_test__a, support_id);
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str484$cb_trigger_test);
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
        return support;
    }

    public static SubLObject cb_trigger_test_id_strings(final SubLObject support, final SubLObject rule) {
        SubLObject support_id = NIL;
        SubLObject rule_id = NIL;
        if (NIL != assertion_handles.assertion_p(support)) {
            support_id = assertion_handles.assertion_id(support);
        }
        if (NIL != rule) {
            rule_id = assertion_handles.assertion_id(rule);
        }
        return values(support_id, rule_id);
    }

    public static SubLObject cb_extract_trigger_test_args(final SubLObject args) {
        if (NIL == args) {
            return values(NIL, NIL);
        }
        if (NIL != list_utilities.singletonP(args)) {
            final SubLObject support = cb_guess_assertion(args);
            return values(support, NIL);
        }
        SubLObject support_id = NIL;
        SubLObject rule_id = NIL;
        destructuring_bind_must_consp(args, args, $list486);
        support_id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list486);
        rule_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject support2 = cb_guess_assertion(support_id);
            final SubLObject rule = cb_guess_assertion(rule_id);
            return values(support2, rule);
        }
        cdestructuring_bind_error(args, $list486);
        return NIL;
    }

    public static SubLObject cb_trigger_test(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Trigger_Test_page);
        }
        thread.resetMultipleValues();
        final SubLObject trigger_support = cb_extract_trigger_test_args(args);
        final SubLObject trigger_rule = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != arguments.support_p(trigger_support)) {
            if (NIL != assertions_high.rule_assertionP(trigger_rule)) {
                return cb_trigger_test_support_and_rule(trigger_support, trigger_rule);
            }
            return cb_trigger_test_support(trigger_support);
        } else {
            if (NIL != assertions_high.rule_assertionP(trigger_rule)) {
                return cb_trigger_test_rule(trigger_rule);
            }
            return cb_trigger_test_unspecified();
        }
    }

    public static SubLObject cb_trigger_test_support_and_rule(final SubLObject trigger_support, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertibles_queue = forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles(trigger_support, rule, $$InferencePSC);
        final SubLObject title_var = $$$Trigger_Test_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$118 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$119 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str492$Results_of_triggering__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_indent(FOUR_INTEGER);
                        cb_link($TRIGGER_TEST, trigger_support, rule, $str493$_Retrigger_, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_assertion_browser.cb_show_support(trigger_support, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str494$against_rule__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_show_assertion_readably(rule, T, T);
                        html_newline(TWO_INTEGER);
                        if (NIL != queues.queue_empty_p(assertibles_queue)) {
                            html_newline(UNPROVIDED);
                            html_princ_strong($str495$No_results_);
                        } else {
                            final SubLObject total = queues.queue_size(assertibles_queue);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        final SubLObject conclusion_label = (NIL != number_utilities.onep(total)) ? $$$One_Conclusion : cconcatenate($str497$Conclusions__, new SubLObject[]{ format_nil.format_nil_s_no_copy(total), $str498$_total_ });
                                        html_princ_strong(conclusion_label);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Justification);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                SubLObject index = ZERO_INTEGER;
                                SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(assertibles_queue);
                                SubLObject assertible = NIL;
                                assertible = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    SubLObject current;
                                    final SubLObject datum = current = assertible;
                                    destructuring_bind_must_consp(current, datum, $list500);
                                    final SubLObject temp = current.rest();
                                    current = current.first();
                                    SubLObject gaf_cnf = NIL;
                                    SubLObject concluded_mt = NIL;
                                    destructuring_bind_must_consp(current, datum, $list500);
                                    gaf_cnf = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list500);
                                    concluded_mt = current.first();
                                    final SubLObject rest;
                                    current = rest = current.rest();
                                    current = temp;
                                    destructuring_bind_must_consp(current, datum, $list500);
                                    final SubLObject temp_$126 = current.rest();
                                    current = current.first();
                                    SubLObject deduction_token = NIL;
                                    destructuring_bind_must_consp(current, datum, $list500);
                                    deduction_token = current.first();
                                    final SubLObject justification;
                                    current = justification = current.rest();
                                    current = temp_$126;
                                    if (NIL == current) {
                                        final SubLObject gaf_formula = clauses.cnf_formula(gaf_cnf, UNPROVIDED);
                                        final SubLObject concluded_gaf = kb_indexing.find_gaf(gaf_formula, concluded_mt);
                                        final SubLObject concluded_support = (NIL != concluded_gaf) ? concluded_gaf : arguments.make_hl_support($OPAQUE, gaf_formula, concluded_mt, UNPROVIDED);
                                        final SubLObject justification_tag = cconcatenate($$$just, format_nil.format_nil_a_no_copy(index));
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_assertion_browser.cb_show_support(concluded_support, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                dhtml_macros.dhtml_switch_visibility_links(justification_tag, $$$Show, $$$Hide);
                                                final SubLObject initial_visibility = $INVISIBLE;
                                                dhtml_macros.dhtml_set_switched_visibility(justification_tag, initial_visibility, $PARAGRAPH);
                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                if (NIL != justification_tag) {
                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(justification_tag);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_assertion_browser.cb_show_justification_readably(justification, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                                                }
                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum, $list500);
                                    }
                                    index = add(index, ONE_INTEGER);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertible = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$119, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$118, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_trigger_test_support(final SubLObject trigger_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Trigger_Test_Setup;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$132 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str504$Support_to_trigger__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_assertion_browser.cb_show_support(trigger_support, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        final SubLObject history_rules = list_utilities.remove_if_not(symbol_function($sym481$RULE_ASSERTION_), cb_tools.cb_assertion_history_items(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != history_rules) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str505$Please_select_a_rule_to_trigger__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = history_rules;
                                SubLObject rule = NIL;
                                rule = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_link($TRIGGER_TEST, trigger_support, rule, $str506$_Trigger_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_show_assertion_readably(rule, T, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    rule = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } else {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str507$There_are_currently_no_rules_in_y);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$132, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$131, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("UNASSERTS"), makeSymbol("METAS"));

    static private final SubLList $list_alt4 = list(makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("STRENGTH"), makeKeyword("DIRECTION"), makeKeyword("UNASSERTS"), makeKeyword("METAS"));

    static private final SubLList $list_alt5 = list(makeSymbol("ASSERTION-SPEC-SENTENCE"), makeSymbol("ASSERTION-SPEC-MT"), makeSymbol("ASSERTION-SPEC-STRENGTH"), makeSymbol("ASSERTION-SPEC-DIRECTION"), makeSymbol("ASSERTION-SPEC-UNASSERTS"), makeSymbol("ASSERTION-SPEC-METAS"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-ASSERTION-SPEC-SENTENCE"), makeSymbol("_CSETF-ASSERTION-SPEC-MT"), makeSymbol("_CSETF-ASSERTION-SPEC-STRENGTH"), makeSymbol("_CSETF-ASSERTION-SPEC-DIRECTION"), makeSymbol("_CSETF-ASSERTION-SPEC-UNASSERTS"), makeSymbol("_CSETF-ASSERTION-SPEC-METAS"));

    static private final SubLString $str_alt27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt29$_a_operation_was_added_to_queue = makeString("~a operation was added to queue");

    static private final SubLString $str_alt30$_a_operation_completed = makeString("~a operation completed");

    static private final SubLString $str_alt32$cb_wff_check_formula_html = makeString("cb-wff-check-formula.html");

    static private final SubLString $str_alt37$Sentence_not_Well_Formed = makeString("Sentence not Well-Formed");

    static private final SubLString $str_alt39$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt40$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt41$Mt___ = makeString("Mt : ");

    static private final SubLString $str_alt42$Sentence___ = makeString("Sentence : ");

    static private final SubLString $str_alt43$Repairs___ = makeString("Repairs : ");

    static private final SubLString $str_alt44$No_repairs_available___Could_not_ = makeString("No repairs available.  Could not determine any way to make the above sentence well-formed by adding new knowledge.");

    static private final SubLString $str_alt45$Explanation__ = makeString("Explanation :");

    static private final SubLString $str_alt46$Stack_of_pending_assertions_depen = makeString("Stack of pending assertions depending on this one :");

    static private final SubLString $str_alt47$__in_ = makeString("  in ");

    static private final SubLSymbol $sym50$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    static private final SubLString $str_alt51$The_fact_ = makeString("The fact ");

    static private final SubLString $str_alt52$_must_be_added_to_ = makeString(" must be added to ");

    static private final SubLString $str_alt53$_in_order_for_the_above_sentence_ = makeString(" in order for the above sentence to be well-formed.");

    static private final SubLString $str_alt57$That_fact_is_already_asserted_in_ = makeString("That fact is already asserted in ");

    static private final SubLString $str_alt58$_ = makeString(".");

    static private final SubLString $str_alt59$You_can_repair_this_by_doing_eith = makeString("You can repair this by doing either of the following:");

    static private final SubLString $str_alt60$1__Lifting_the_assertion_to_ = makeString("1) Lifting the assertion to ");

    static private final SubLString $str_alt61$2__Asserting_it_in_ = makeString("2) Asserting it in ");

    static private final SubLString $str_alt62$_as_well = makeString(" as well");

    static private final SubLString $str_alt63$You_can_repair_this_by_doing_the_ = makeString("You can repair this by doing the following:");

    static private final SubLString $str_alt64$Asserting_it_in_ = makeString("Asserting it in ");

    static private final SubLString $str_alt65$_must_be_lifted_to_ = makeString(" must be lifted to ");

    static private final SubLString $str_alt66$It_is_currently_asserted_in_the_f = makeString("It is currently asserted in the following spec Mts:");

    static private final SubLString $str_alt67$_Make_this_repair_and_then_reatte = makeString("[Make this repair and then reattempt]");

    static private final SubLString $str_alt69$cb_repair_and_reattempt__A__A = makeString("cb-repair-and-reattempt&~A&~A");

    static private final SubLList $list_alt72 = list(makeSymbol("REPAIR-ASSERTION-SPEC-ID"), makeSymbol("ASSERTION-STACK-ID"));

    static private final SubLString $str_alt73$Repair_and_assert_operations_comp = makeString("Repair and assert operations completed");

    static private final SubLString $str_alt76$cb_af_html = makeString("cb-af.html");

    private static final SubLSymbol $ASSERTION_KIF_FORMULA = makeKeyword("ASSERTION-KIF-FORMULA");

    private static final SubLSymbol $MODUSTOLLENS_ASSERTION = makeKeyword("MODUSTOLLENS-ASSERTION");

    private static final SubLSymbol $DESCRIBE_ASSERTION = makeKeyword("DESCRIBE-ASSERTION");

    static private final SubLString $str_alt99$_Query_Antecedent_ = makeString("[Query Antecedent]");

    public static SubLObject cb_trigger_test_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Trigger_Test_Setup;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$139 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$140 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str508$Rule_to_trigger__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_show_assertion_readably(rule, T, T);
                        html_newline(TWO_INTEGER);
                        final SubLObject history_gafs = remove_if(symbol_function($sym481$RULE_ASSERTION_), cb_tools.cb_assertion_history_items(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != history_gafs) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str509$Please_select_a_support_to_trigge);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = history_gafs;
                                SubLObject support = NIL;
                                support = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_link($TRIGGER_TEST, support, rule, $str506$_Trigger_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_show_assertion_readably(support, T, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    support = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } else {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str510$There_are_currently_no_supports_i);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$140, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$139, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt101$_Known_Extent_ = makeString("[Known Extent]");

    static private final SubLString $str_alt103$_Unknown_Extent_ = makeString("[Unknown Extent]");

    public static final SubLObject $const113$InferenceRelatedBookkeepingPredic = reader_make_constant_shell("InferenceRelatedBookkeepingPredicate");

    static private final SubLString $str_alt115$cb_change_mt_html = makeString("cb-change-mt.html");

    static private final SubLList $list_alt117 = list(makeSymbol("ID"));

    static private final SubLString $str_alt119$cb_handle_change_mt = makeString("cb-handle-change-mt");

    static private final SubLString $str_alt122$Note___This_assertion_has_meta_as = makeString("Note : This assertion has meta-assertions");

    static private final SubLList $list_alt123 = list(makeKeyword("ANYTIME-PSC-ALLOWED?"), NIL);

    static private final SubLString $str_alt128$To_change_Mt_of_all_meta_assertio = makeString("To change Mt of all meta-assertions use ");

    static private final SubLString $str_alt129$move_all_meta_assertions = makeString("move-all-meta-assertions");

    static private final SubLString $str_alt131$Change_the_Mt_of_all_meta_asserti = makeString("Change the Mt of all meta-assertions to the new Mt");

    static private final SubLString $str_alt133$Assertion_is_already_in__S = makeString("Assertion is already in ~S");

    static private final SubLString $str_alt134$preserve_ = makeString("preserve_");

    static private final SubLString $str_alt136$_Change_Mt_ = makeString("[Change Mt]");

    static private final SubLString $str_alt137$cb_change_mt__a = makeString("cb-change-mt&~a");

    static private final SubLString $str_alt140$cb_change_strength_html = makeString("cb-change-strength.html");

    static private final SubLString $str_alt141$the_Change_Assertion_Strength_pag = makeString("the Change Assertion Strength page");

    static private final SubLString $str_alt143$cb_handle_change_strength = makeString("cb-handle-change-strength");

    static private final SubLString $str_alt144$Choose_a_new_truth_strength__ = makeString("Choose a new truth strength :");

    static private final SubLString $str_alt146$_default = makeString(":default");

    static private final SubLString $str_alt149$_monotonic = makeString(":monotonic");

    static private final SubLList $list_alt155 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));

    static private final SubLString $str_alt156$_a_was_not_a_microtheory = makeString("~a was not a microtheory");

    static private final SubLString $str_alt158$_Change_Strength_ = makeString("[Change Strength]");

    static private final SubLString $str_alt159$cb_change_strength__a = makeString("cb-change-strength&~a");

    static private final SubLString $str_alt162$cb_change_direction_html = makeString("cb-change-direction.html");

    static private final SubLString $str_alt163$the_Change_Assertion_Direction_pa = makeString("the Change Assertion Direction page");

    static private final SubLString $str_alt165$cb_handle_change_direction = makeString("cb-handle-change-direction");

    static private final SubLString $str_alt166$Choose_a_direction__ = makeString("Choose a direction :");

    static private final SubLString $str_alt168$_backward = makeString(":backward");

    static private final SubLString $str_alt171$_forward = makeString(":forward");

    static private final SubLString $str_alt174$_code = makeString(":code");

    static private final SubLString $$$Code = makeString("Code");

    static private final SubLString $str_alt180$_a_does_not_specify_a_valid_direc = makeString("~a does not specify a valid direction");

    static private final SubLString $str_alt182$_Change_Direction_ = makeString("[Change Direction]");

    static private final SubLString $str_alt183$cb_change_direction__a = makeString("cb-change-direction&~a");

    static private final SubLString $str_alt186$cb_change_meta_assertion_mt_html = makeString("cb-change-meta-assertion-mt.html");

    static private final SubLString $str_alt188$cb_handle_change_meta_assertion_m = makeString("cb-handle-change-meta-assertion-mt");

    static private final SubLString $str_alt189$Change_the_Mt_of_Meta_Assertions_ = makeString("Change the Mt of Meta-Assertions of the assertion : ");

    static private final SubLString $str_alt190$change_meta_ = makeString("change_meta_");

    static private final SubLString $str_alt191$Choose_the_meta_assertions__ = makeString("Choose the meta assertions :");

    static private final SubLString $str_alt194$_Change_Meta_Assertions_Mt_ = makeString("[Change Meta Assertions Mt]");

    static private final SubLString $str_alt195$cb_change_meta_assertion_mt__a = makeString("cb-change-meta-assertion-mt&~a");

    static private final SubLString $str_alt198$cb_rename_variables_html = makeString("cb-rename-variables.html");

    static private final SubLString $str_alt201$cb_handle_rename_variables = makeString("cb-handle-rename-variables");

    static private final SubLString $str_alt202$Rename_the_variables_of_the_asser = makeString("Rename the variables of the assertion : ");

    static private final SubLString $str_alt203$Note__ = makeString("Note: ");

    static private final SubLString $str_alt204$Variables_listed_in_ = makeString("Variables listed in ");

    static private final SubLString $str_alt206$_have_invalid_variable_names___Va = makeString(" have invalid variable names.  Valid variables must satisfy the regular expression ");

    static private final SubLString $str_alt214$No_variables_were_specified_to_be = makeString("No variables were specified to be renamed.");

    static private final SubLList $list_alt215 = cons(makeSymbol("VARIABLE"), makeSymbol("RENAMED-VARIABLE"));

    static private final SubLString $str_alt216$The_proposed_rename_may_change_th = makeString("The proposed rename may change the logical intent of the assertion, and would require unasserting and reasserting it.  Do you want to continue?");

    static private final SubLList $list_alt222 = list(makeSymbol("VARIABLE-NAME"), makeSymbol("NEW-VARIABLE-NAME"));

    static private final SubLList $list_alt223 = list(CHAR_space, CHAR_tab, CHAR_newline);

    static private final SubLString $str_alt224$_ = makeString("?");

    static private final SubLString $str_alt228$The_following_variables_have_inva = makeString("The following variables have invalid variable names");

    static private final SubLString $str_alt230$__ = makeString(", ");

    static private final SubLString $str_alt231$__and_ = makeString(", and ");

    static private final SubLString $str_alt232$Valid_variables_must_satisfy_the_ = makeString("Valid variables must satisfy the regular expression ");

    static private final SubLString $str_alt233$_Rename_Variables_ = makeString("[Rename Variables]");

    static private final SubLString $str_alt234$cb_rename_variables__a = makeString("cb-rename-variables&~a");

    static private final SubLString $str_alt236$the_facility_to_repropagate_forwa = makeString("the facility to repropagate forward inference on an assertion");

    static private final SubLString $str_alt238$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    static private final SubLString $str_alt240$_Repropagate_ = makeString("[Repropagate]");

    static private final SubLString $str_alt241$cb_repropagate__a = makeString("cb-repropagate&~a");

    public static SubLObject cb_trigger_test_unspecified() {
        return cb_error($str511$Time_to_implement_cb_trigger_test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt243$the_facility_to_repropagate_and_b = makeString("the facility to repropagate and browse forward inference on an assertion");

    public static final SubLObject cb_proof_checker_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_proof_checker_rules$.setDynamicValue(list_utilities.delete_if_not(symbol_function(VALID_ASSERTION), $cb_proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return copy_list($cb_proof_checker_rules$.getDynamicValue(thread));
        }
    }

    public static SubLObject cb_proof_checker_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_proof_checker_rules$.setDynamicValue(list_utilities.delete_if_not(symbol_function(VALID_ASSERTION), $cb_proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return copy_list($cb_proof_checker_rules$.getDynamicValue(thread));
    }

    static private final SubLString $str_alt244$Forward_repropagation_complete___ = makeString("Forward repropagation complete.  Browse results:");

    static private final SubLString $str_alt246$_Repropagate_and_Browse_ = makeString("[Repropagate and Browse]");

    public static final SubLObject cb_add_to_proof_checker_rules_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.rule_assertionP(assertion))) {
                {
                    SubLObject item_var = assertion;
                    if (NIL == member(item_var, $cb_proof_checker_rules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $cb_proof_checker_rules$.setDynamicValue(cons(item_var, $cb_proof_checker_rules$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_add_to_proof_checker_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.rule_assertionP(assertion))) && (NIL == member(assertion, $cb_proof_checker_rules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY)))) {
            $cb_proof_checker_rules$.setDynamicValue(cons(assertion, $cb_proof_checker_rules$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt247$cb_repropagate_browsably__a = makeString("cb-repropagate-browsably&~a");

    static private final SubLString $str_alt249$the_facility_to_recanonicalize_an = makeString("the facility to recanonicalize an assertion");

    static private final SubLString $str_alt250$_S_did_not_specify_an_assertion_ = makeString("~S did not specify an assertion.");

    public static final SubLObject cb_delete_from_proof_checker_rules_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_proof_checker_rules$.setDynamicValue(delete(assertion, $cb_proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return NIL;
        }
    }

    public static SubLObject cb_delete_from_proof_checker_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_proof_checker_rules$.setDynamicValue(delete(assertion, $cb_proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    static private final SubLString $str_alt254$_Recanonicalize_ = makeString("[Recanonicalize]");

    public static final SubLObject cb_delete_all_proof_checker_rules_alt() {
        $cb_proof_checker_rules$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject cb_delete_all_proof_checker_rules() {
        $cb_proof_checker_rules$.setDynamicValue(NIL);
        return NIL;
    }

    static private final SubLString $str_alt255$cb_recanonicalize__a = makeString("cb-recanonicalize&~a");

    public static final SubLObject cb_use_in_proof_alt(SubLObject args) {
        {
            SubLObject assertion = cb_guess_assertion(args);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                return cb_error($str_alt238$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL == assertions_high.rule_assertionP(assertion)) {
                    return cb_error($str_alt429$Assertion_specified_was_not_a_rul, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_add_to_proof_checker_rules(assertion);
                    return cb_simple_message_page($str_alt430$Rule_has_been_added_to_proof_chec, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject cb_use_in_proof(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == assertions_high.rule_assertionP(assertion)) {
            return cb_error($str514$Assertion_specified_was_not_a_rul, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_add_to_proof_checker_rules(assertion);
        return cb_simple_message_page($str515$Rule_has_been_added_to_proof_chec, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt258$cb_wff_html = makeString("cb-wff.html");

    static private final SubLString $str_alt259$WFF_Check_Sentence = makeString("WFF-Check Sentence");

    static private final SubLString $str_alt260$cb_handle_wff = makeString("cb-handle-wff");

    static private final SubLList $list_alt263 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    public static final SubLObject cb_link_use_in_proof_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL == linktext) {
                linktext = $str_alt433$_Use_in_Proof_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt434$cb_use_in_proof__a, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_use_in_proof(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == linktext) {
            linktext = $str518$_Use_in_Proof_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str519$cb_use_in_proof__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    static private final SubLString $str_alt267$cb_wff = makeString("cb-wff");

    static private final SubLString $str_alt271$Check_a_CycL_Expression_for_well_ = makeString("Check a CycL Expression for well-formedness");

    static private final SubLList $list_alt273 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    static private final SubLString $str_alt275$WFF_Status___ = makeString("WFF-Status : ");

    static private final SubLList $list_alt277 = list(list(makeKeyword("DEFAULT"), makeString("cb-handle-assert"), makeString("Assert Sentence"), makeString("Assert Sentence")), list(makeKeyword("SIMILAR"), makeString("cb-handle-assert"), makeString("Assert Similar Sentence"), makeString("Assert Sentence")), list($EDIT, makeString("cb-handle-edit"), makeString("Edit Assertion"), makeString("Perform Edit")), list(makeKeyword("EDIT-SENTENCE"), makeString("cb-handle-sentence-edit"), makeString("Edit Sentence"), makeString("Perform Edit")), list(makeKeyword("FIX-TYPO"), makeString("cb-handle-fix-typo"), makeString("Fix Assertion"), makeString("Perform Fix")), list($META, makeString("cb-handle-assert-meta"), makeString("Assert Meta Assertion"), makeString("Assert Sentence")));

    public static SubLObject cb_reinforce_rule(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            reinforce_rule(assertion, UNPROVIDED);
            return cb_assertion_browser.cb_af(args);
        }
        return cb_error($str521$_a_does_not_specify_a_rule, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt280$wff_check = makeString("wff-check");

    public static SubLObject cb_link_reinforce_rule(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == linktext) {
            linktext = $str523$_Reinforce_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str524$cb_reinforce_rule__a, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    static private final SubLString $str_alt281$assertion_queue = makeString("assertion-queue");

    static private final SubLString $str_alt283$Forward_propagation_complete___Br = makeString("Forward propagation complete.  Browse results:");

    static private final SubLString $str_alt288$assert_tool_gif = makeString("assert-tool.gif");

    static private final SubLString $str_alt290$cb_assert = makeString("cb-assert");

    static private final SubLString $str_alt295$cb_assert_internal_html = makeString("cb-assert-internal.html");

    static private final SubLString $str_alt297$cb_assert_called_without_a_valid_ = makeString("cb-assert called without a valid mode");

    static private final SubLList $list_alt298 = list(makeSymbol("KEYWORD"), makeSymbol("HANDLER"), makeSymbol("TITLE"), makeSymbol("ACTION-LABEL"));

    static private final SubLString $str_alt300$Please_use_ = makeString("Please use ");

    static private final SubLString $str_alt301$_to_refer_to_the_following_assert = makeString(" to refer to the following assertion :");

    public static SubLObject reinforce_rule(final SubLObject rule, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        inference_analysis.increment_transformation_rule_considered_count(rule, T, n, UNPROVIDED);
        inference_analysis.increment_transformation_rule_success_count(rule, T, n, UNPROVIDED);
        return NIL;
    }

    static private final SubLString $str_alt305$_local = makeString(":local");

    public static final SubLObject cb_strength_and_direction_section_alt(SubLObject strength, SubLObject direction, SubLObject display_options) {
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject edit_only_tail = property_list_member($EDIT_ONLY, current);
                SubLObject edit_only = (NIL != edit_only_tail) ? ((SubLObject) (cadr(edit_only_tail))) : NIL;
                SubLObject strength_input_name_tail = property_list_member($STRENGTH_INPUT_NAME, current);
                SubLObject strength_input_name = (NIL != strength_input_name_tail) ? ((SubLObject) (cadr(strength_input_name_tail))) : $cb_strength_input_default_name$.getGlobalValue();
                SubLObject direction_input_name_tail = property_list_member($DIRECTION_INPUT_NAME, current);
                SubLObject direction_input_name = (NIL != direction_input_name_tail) ? ((SubLObject) (cadr(direction_input_name_tail))) : $cb_direction_input_default_name$.getGlobalValue();
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        html_princ($str_alt443$Strength__);
                                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != edit_only) {
                                            html_glyph($NBSP, UNPROVIDED);
                                            cb_show_strength(strength);
                                            html_hidden_input(strength_input_name, strength, UNPROVIDED);
                                            html_indent(TWO_INTEGER);
                                        } else {
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_radio_input(strength_input_name, $str_alt146$_default, eq(strength, $DEFAULT));
                                            html_indent(ONE_INTEGER);
                                            html_princ($$$Default);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_radio_input(strength_input_name, $str_alt149$_monotonic, eq(strength, $MONOTONIC));
                                            html_indent(ONE_INTEGER);
                                            html_princ($$$Monotonic);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_indent(TWO_INTEGER);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        html_princ($str_alt445$Direction__);
                                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != edit_only) {
                                            html_glyph($NBSP, UNPROVIDED);
                                            cb_show_direction(direction);
                                            html_hidden_input(direction_input_name, direction, UNPROVIDED);
                                            html_indent(TWO_INTEGER);
                                        } else {
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_radio_input(direction_input_name, $str_alt168$_backward, NIL);
                                            html_indent(ONE_INTEGER);
                                            html_princ($$$Backward);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_radio_input(direction_input_name, $str_alt171$_forward, NIL);
                                            html_indent(ONE_INTEGER);
                                            html_princ($$$Forward);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_indent(TWO_INTEGER);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_strength_and_direction_section(final SubLObject strength, final SubLObject direction, SubLObject display_options) {
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject edit_only_tail = property_list_member($EDIT_ONLY, current);
        final SubLObject edit_only = (NIL != edit_only_tail) ? cadr(edit_only_tail) : NIL;
        final SubLObject strength_input_name_tail = property_list_member($STRENGTH_INPUT_NAME, current);
        final SubLObject strength_input_name = (NIL != strength_input_name_tail) ? cadr(strength_input_name_tail) : $cb_strength_input_default_name$.getGlobalValue();
        final SubLObject direction_input_name_tail = property_list_member($DIRECTION_INPUT_NAME, current);
        final SubLObject direction_input_name = (NIL != direction_input_name_tail) ? cadr(direction_input_name_tail) : $cb_direction_input_default_name$.getGlobalValue();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str529$Strength__);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != edit_only) {
                        html_glyph($NBSP, UNPROVIDED);
                        cb_show_strength(strength);
                        html_hidden_input(strength_input_name, strength, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                    } else {
                        html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color($str530$_default_strength));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(strength_input_name, $str164$_default, eq(strength, $DEFAULT), $str530$_default_strength);
                            html_indent(ONE_INTEGER);
                            html_princ($$$Default);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                        }
                        html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                        html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color($str531$_monotonic_strength));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(strength_input_name, $str167$_monotonic, eq(strength, $MONOTONIC), $str531$_monotonic_strength);
                            html_indent(ONE_INTEGER);
                            html_princ($$$Monotonic);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                        }
                        html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                        html_indent(TWO_INTEGER);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str532$Direction__);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != edit_only) {
                        html_glyph($NBSP, UNPROVIDED);
                        cb_show_direction(direction);
                        html_hidden_input(direction_input_name, direction, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                    } else {
                        html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color($str186$_backward));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(direction_input_name, $str186$_backward, NIL, $str186$_backward);
                            html_indent(ONE_INTEGER);
                            html_princ($$$Backward);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                        }
                        html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                        html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color($str189$_forward));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(direction_input_name, $str189$_forward, NIL, $str189$_forward);
                            html_indent(ONE_INTEGER);
                            html_princ($$$Forward);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                        html_indent(TWO_INTEGER);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    static private final SubLString $str_alt308$_now = makeString(":now");

    static private final SubLString $str_alt309$Assert_now__bypassing_Local_queue = makeString("Assert now, bypassing Local queue");

    static private final SubLString $str_alt310$_browse = makeString(":browse");

    static private final SubLString $str_alt311$Assert_now_and_browse_forward_inf = makeString("Assert now and browse forward inference");

    static private final SubLString $str_alt312$cb_assert_parameters = makeString("cb-assert-parameters");

    public static final SubLSymbol $kw319$EDIT_ALLOWED_ = makeKeyword("EDIT-ALLOWED?");

    static private final SubLList $list_alt321 = list(reader_make_constant_shell("UniversalVocabularyMt"));

    public static final SubLSymbol $kw322$ANYTIME_PSC_ALLOWED_ = makeKeyword("ANYTIME-PSC-ALLOWED?");

    static private final SubLList $list_alt335 = list(reader_make_constant_shell("TheAssertionSentence"), reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("pragmaticRequirement"), reader_make_constant_shell("salientAssertions"));

    static private final SubLString $str_alt336$cb_handle_fix_typo = makeString("cb-handle-fix-typo");

    static private final SubLString $str_alt337$cb_handle_edit = makeString("cb-handle-edit");

    static private final SubLString $str_alt338$cb_handle_sentence_edit = makeString("cb-handle-sentence-edit");

    static private final SubLString $str_alt339$Choose_analogous_meta_assertions_ = makeString("Choose analogous meta-assertions to assert :");

    static private final SubLString $str_alt340$_a_S = makeString("~a~S");

    static private final SubLString $str_alt343$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory.");

    static private final SubLString $str_alt344$_S_is_not_a_microtheory_ = makeString("~S is not a microtheory.");

    static private final SubLString $str_alt346$Bad_sentence__probably_due_to_a_m = makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");

    static private final SubLList $list_alt347 = list(makeSymbol("FORMULA-ID"), makeSymbol("MT-ID"));

    static private final SubLString $str_alt351$_Assert_Formula_ = makeString("[Assert Formula]");

    static private final SubLString $str_alt352$cb_assert_formula__A__A = makeString("cb-assert-formula&~A&~A");

    static private final SubLString $str_alt356$_Assert_Similar_ = makeString("[Assert Similar]");

    static private final SubLString $str_alt357$cb_similar__a = makeString("cb-similar&~a");

    static private final SubLString $str_alt361$The_sentence_did_not_mention__S_ = makeString("The sentence did not mention ~S.");

    static private final SubLString $str_alt364$_Assert_Meta_ = makeString("[Assert Meta]");

    static private final SubLString $str_alt365$cb_assert_meta__a = makeString("cb-assert-meta&~a");

    static private final SubLList $list_alt368 = list(list(makeSymbol("*AT-CHECK-ARG-FORMAT?*"), NIL), list(makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*"), NIL));

    static private final SubLList $list_alt372 = list(makeSymbol("INPUT-NAME"), makeSymbol("ASSERTION-ID-STRING"));

    static private final SubLString $str_alt373$_Edit_ = makeString("[Edit]");

    static private final SubLString $str_alt374$cb_edit__a = makeString("cb-edit&~a");

    static private final SubLString $str_alt376$_S_did_not_specify_a_CycL_sentenc = makeString("~S did not specify a CycL sentence eligible for editing.");

    static private final SubLString $str_alt380$_Fix_Typo_ = makeString("[Fix Typo]");

    static private final SubLString $str_alt381$cb_fix_typo_edit__a = makeString("cb-fix-typo-edit&~a");

    static private final SubLString $str_alt383$Edited_sentence_does_not_differ_o = makeString("Edited sentence does not differ only in strings.");

    static private final SubLString $str_alt384$email_notify = makeString("email-notify");

    static private final SubLString $str_alt385$email_notify_recipients = makeString("email-notify-recipients");

    static private final SubLString $str_alt386$email_explanation = makeString("email-explanation");

    static private final SubLString $str_alt390$_Reassert_ = makeString("[Reassert]");

    static private final SubLString $str_alt391$cb_reassert__a = makeString("cb-reassert&~a");

    static private final SubLString $str_alt395$_Unassert_ = makeString("[Unassert]");

    static private final SubLString $str_alt396$cb_unassert__a = makeString("cb-unassert&~a");

    static private final SubLString $str_alt400$_Blast_ = makeString("[Blast]");

    static private final SubLString $str_alt401$cb_blast__a = makeString("cb-blast&~a");

    static private final SubLList $list_alt403 = list(makeSymbol("ID-STRING"));

    static private final SubLString $str_alt404$_a_does_not_specify_a_deduction = makeString("~a does not specify a deduction");

    static private final SubLString $str_alt407$_Remove_Deduction_ = makeString("[Remove Deduction]");

    static private final SubLString $str_alt408$cb_remove_deduction__a = makeString("cb-remove-deduction&~a");

    static private final SubLString $str_alt413$_Redo_TMS_ = makeString("[Redo TMS]");

    static private final SubLString $str_alt414$cb_assertion_tms__a = makeString("cb-assertion-tms&~a");

    static private final SubLString $str_alt417$cb_diagnose_assertion_html = makeString("cb-diagnose-assertion.html");

    static private final SubLString $str_alt419$_a_does_not_specify_a_Cyc_asserti = makeString("~a does not specify a Cyc assertion");

    static private final SubLString $str_alt421$Diagnosis_of__ = makeString("Diagnosis of :");

    static private final SubLString $str_alt423$Results___ = makeString("Results : ");

    static private final SubLString $str_alt424$_Run_Diagnostics_ = makeString("[Run Diagnostics]");

    static private final SubLString $str_alt425$cb_diagnose_assertion__A = makeString("cb-diagnose-assertion&~A");

    static private final SubLString $str_alt429$Assertion_specified_was_not_a_rul = makeString("Assertion specified was not a rule");

    static private final SubLString $str_alt430$Rule_has_been_added_to_proof_chec = makeString("Rule has been added to proof checker rule set.");

    public static final SubLObject cb_extract_strength_and_direction_input_alt(SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            SubLObject datum = input_options;
            SubLObject current = datum;
            SubLObject strength_input_name_tail = property_list_member($STRENGTH_INPUT_NAME, current);
            SubLObject strength_input_name = (NIL != strength_input_name_tail) ? ((SubLObject) (cadr(strength_input_name_tail))) : $cb_strength_input_default_name$.getGlobalValue();
            SubLObject direction_input_name_tail = property_list_member($DIRECTION_INPUT_NAME, current);
            SubLObject direction_input_name = (NIL != direction_input_name_tail) ? ((SubLObject) (cadr(direction_input_name_tail))) : $cb_direction_input_default_name$.getGlobalValue();
            SubLObject strength_string = html_extract_input(strength_input_name, args);
            SubLObject direction_string = html_extract_input(direction_input_name, args);
            SubLObject strength = NIL;
            SubLObject direction = NIL;
            if (strength_string.isString()) {
                strength = read_from_string_ignoring_errors(strength_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            }
            if (direction_string.isString()) {
                direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            }
            return values(strength, direction);
        }
    }

    public static SubLObject cb_extract_strength_and_direction_input(final SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = input_options;
        final SubLObject strength_input_name_tail = property_list_member($STRENGTH_INPUT_NAME, current);
        final SubLObject strength_input_name = (NIL != strength_input_name_tail) ? cadr(strength_input_name_tail) : $cb_strength_input_default_name$.getGlobalValue();
        final SubLObject direction_input_name_tail = property_list_member($DIRECTION_INPUT_NAME, current);
        final SubLObject direction_input_name = (NIL != direction_input_name_tail) ? cadr(direction_input_name_tail) : $cb_direction_input_default_name$.getGlobalValue();
        final SubLObject strength_string = html_extract_input(strength_input_name, args);
        final SubLObject direction_string = html_extract_input(direction_input_name, args);
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        if (strength_string.isString()) {
            strength = read_from_string_ignoring_errors(strength_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if (direction_string.isString()) {
            direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        return values(strength, direction);
    }

    static private final SubLString $str_alt433$_Use_in_Proof_ = makeString("[Use in Proof]");

    static private final SubLString $str_alt434$cb_use_in_proof__a = makeString("cb-use-in-proof&~a");

    static private final SubLString $$$Assertion_Edit_Notification = makeString("Assertion Edit Notification");

    static private final SubLString $str_alt437$_cyc_com = makeString("@cyc.com");

    static private final SubLList $list_alt438 = list(makeString(" "), makeString(","));

    static private final SubLString $str_alt439$On__A_at__A__S_edited_the_asserti = makeString("On ~A at ~A\n~S edited the assertion :\n\nMt : ~S\nEL Sentence : ~A\n\nto be this instead :\n\nMt : ~S\nEL Sentence : ~A");

    static private final SubLString $str_alt440$______Additional_explanation_from = makeString("~%~%~%Additional explanation from ~S on why this modification was necessary: ~%~%~A~%");

    static private final SubLString $str_alt443$Strength__ = makeString("Strength :");

    static private final SubLString $str_alt445$Direction__ = makeString("Direction :");

    static private final SubLString $str_alt446$_explanation = makeString("-explanation");

    public static final SubLObject cb_link_assertion_graph_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = cconcatenate($str_alt463$_, new SubLObject[]{ cb_assertion_graph_type_string(assertion), $str_alt464$_ });
            }
            if (NIL != cb_assertion_check_graph(assertion)) {
                {
                    SubLObject frame_name_var = cb_frame_name($CONTENT);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt466$cb_assertion_graph__A, assertion_handles.assertion_id(assertion));
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
            return assertion;
        }
    }

    public static SubLObject cb_link_assertion_graph(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = cconcatenate($str533$_, new SubLObject[]{ cb_assertion_graph_type_string(assertion), $str534$_ });
        }
        if (NIL != cb_assertion_check_graph(assertion)) {
            final SubLObject frame_name_var = cb_frame_name($CONTENT);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str536$cb_assertion_graph__A, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    static private final SubLString $str_alt447$_recipients = makeString("-recipients");

    static private final SubLString $$$email_notify = makeString("email notify");

    static private final SubLString $$$20 = makeString("20");

    static private final SubLString $str_alt450$with__optional__explanation = makeString("with (optional) explanation");

    static private final SubLString $str_alt451$_Show_ = makeString("[Show]");

    static private final SubLString $str_alt452$_Hide_ = makeString("[Hide]");

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $str_alt455$workaround_assertion = makeString("workaround-assertion");

    static private final SubLString $str_alt456$note_that_this_assertion_depends_ = makeString("note that this assertion depends on bugzilla bug #");

    static private final SubLString $str_alt457$_bug_number = makeString("-bug-number");

    static private final SubLString $str_alt458$_with_a_ = makeString(" with a ");



    static private final SubLString $str_alt460$_meta_assertion_ = makeString(" meta assertion.");





    static private final SubLString $str_alt463$_ = makeString("[");

    static private final SubLString $str_alt464$_ = makeString("]");

    static private final SubLString $str_alt466$cb_assertion_graph__A = makeString("cb-assertion-graph&~A");

    public static final SubLObject cb_assertion_graph_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cb_java_utilities.$cb_java_mode$.getDynamicValue(thread)) {
                {
                    SubLObject assertion = cb_guess_assertion(args.first());
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        cb_assertion_graph_internal(assertion);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_assertion_graph(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args.first());
        if (NIL != assertion_handles.assertion_p(assertion)) {
            cb_assertion_graph_internal(assertion);
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_graph_internal_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = $$$Graph_of_an_assertion;
                SubLObject title_var = title;
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
                            SubLObject _prev_bind_0_60 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt40$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_princ($str_alt470$Graph_for_);
                                        html_newline(UNPROVIDED);
                                        cb_form(assertion, NIL, T);
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        cb_assertion_print_graph(assertion);
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_60, thread);
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

    public static SubLObject cb_assertion_graph_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = $$$Graph_of_an_assertion;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str50$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_princ($$$Refresh);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str542$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_princ($str543$Graph_for_);
                        html_newline(UNPROVIDED);
                        cb_form(assertion, NIL, T);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        cb_assertion_print_graph(assertion);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$157, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$156, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt470$Graph_for_ = makeString("Graph for:");

    static private final SubLString $str_alt473$_a = makeString("~a");

    public static final SubLObject cb_assertion_graph_type_string_alt(SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            return $$$Rule_Graph;
        } else {
            return $$$Unknown_Graph;
        }
    }

    public static SubLObject cb_assertion_graph_type_string(final SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            return $$$Rule_Graph;
        }
        return $$$Unknown_Graph;
    }

    /**
     * Possibly show a graph visualization for ASSERTION.
     */
    @LispMethod(comment = "Possibly show a graph visualization for ASSERTION.")
    public static final SubLObject cb_assertion_print_graph_alt(SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            cb_assertion_print_graph_of_rule(assertion);
        }
        return NIL;
    }

    /**
     * Possibly show a graph visualization for ASSERTION.
     */
    @LispMethod(comment = "Possibly show a graph visualization for ASSERTION.")
    public static SubLObject cb_assertion_print_graph(final SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            cb_assertion_print_graph_of_rule(assertion);
        }
        return NIL;
    }

    public static final SubLObject cb_assertion_check_graph_alt(SubLObject assertion) {
        return assertions_high.rule_assertionP(assertion);
    }

    public static SubLObject cb_assertion_check_graph(final SubLObject assertion) {
        return assertions_high.rule_assertionP(assertion);
    }

    public static final SubLObject cb_assertion_print_graph_of_rule_alt(SubLObject assertion) {
        html_newline(TWO_INTEGER);
        {
            SubLObject signature = format(NIL, $str_alt473$_a, random.random(expt(TWO_INTEGER, $int$32)));
            SubLObject mt = assertions_high.assertion_mt(assertion);
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_RULE, $ASSERTIONS, list(assertion), $MT, mt)));
            cb_blue_grapher.cb_blue_applet(list($WIDTH, $int$800, $HEIGHT, $int$600, $SIGNATURE, signature));
        }
        return NIL;
    }

    public static SubLObject cb_assertion_print_graph_of_rule(final SubLObject assertion) {
        html_newline(TWO_INTEGER);
        final SubLObject signature = format(NIL, $str546$_a, random.random(expt(TWO_INTEGER, $int$30)));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_RULE, $ASSERTIONS, list(assertion), $MT, mt)));
        cb_blue_grapher.cb_blue_applet(list($WIDTH, $int$800, $HEIGHT, $int$600, $SIGNATURE, signature));
        return NIL;
    }

    public static final SubLObject declare_cb_assertion_editor_file_alt() {
        declareFunction("cb_change_mt_hook", "CB-CHANGE-MT-HOOK", 2, 1, false);
        declareFunction("cb_change_strength_hook", "CB-CHANGE-STRENGTH-HOOK", 2, 0, false);
        declareFunction("cb_change_direction_hook", "CB-CHANGE-DIRECTION-HOOK", 2, 0, false);
        declareFunction("cb_repropagate_hook", "CB-REPROPAGATE-HOOK", 1, 0, false);
        declareFunction("cb_repropagate_browsably_hook", "CB-REPROPAGATE-BROWSABLY-HOOK", 1, 0, false);
        declareFunction("cb_recanonicalize_hook", "CB-RECANONICALIZE-HOOK", 1, 1, false);
        declareFunction("cb_rename_variables_hook", "CB-RENAME-VARIABLES-HOOK", 2, 0, false);
        declareFunction("cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 1, false);
        declareFunction("cb_null_edit_assertion_hook", "CB-NULL-EDIT-ASSERTION-HOOK", 1, 0, false);
        declareFunction("cb_edit_assertion_strings_hook", "CB-EDIT-ASSERTION-STRINGS-HOOK", 2, 1, false);
        declareFunction("cb_assertion_spec_print_function_trampoline", "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cb_assertion_spec_p", "CB-ASSERTION-SPEC-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_p$UnaryFunction();
        declareFunction("assertion_spec_sentence", "ASSERTION-SPEC-SENTENCE", 1, 0, false);
        declareFunction("assertion_spec_mt", "ASSERTION-SPEC-MT", 1, 0, false);
        declareFunction("assertion_spec_strength", "ASSERTION-SPEC-STRENGTH", 1, 0, false);
        declareFunction("assertion_spec_direction", "ASSERTION-SPEC-DIRECTION", 1, 0, false);
        declareFunction("assertion_spec_unasserts", "ASSERTION-SPEC-UNASSERTS", 1, 0, false);
        declareFunction("assertion_spec_metas", "ASSERTION-SPEC-METAS", 1, 0, false);
        declareFunction("_csetf_assertion_spec_sentence", "_CSETF-ASSERTION-SPEC-SENTENCE", 2, 0, false);
        declareFunction("_csetf_assertion_spec_mt", "_CSETF-ASSERTION-SPEC-MT", 2, 0, false);
        declareFunction("_csetf_assertion_spec_strength", "_CSETF-ASSERTION-SPEC-STRENGTH", 2, 0, false);
        declareFunction("_csetf_assertion_spec_direction", "_CSETF-ASSERTION-SPEC-DIRECTION", 2, 0, false);
        declareFunction("_csetf_assertion_spec_unasserts", "_CSETF-ASSERTION-SPEC-UNASSERTS", 2, 0, false);
        declareFunction("_csetf_assertion_spec_metas", "_CSETF-ASSERTION-SPEC-METAS", 2, 0, false);
        declareFunction("make_cb_assertion_spec", "MAKE-CB-ASSERTION-SPEC", 0, 1, false);
        declareFunction("new_cb_assertion_spec", "NEW-CB-ASSERTION-SPEC", 2, 4, false);
        declareFunction("ke_assert_assertion_spec", "KE-ASSERT-ASSERTION-SPEC", 1, 0, false);
        declareFunction("cb_note_edit_change", "CB-NOTE-EDIT-CHANGE", 2, 2, false);
        declareFunction("cb_attempt_to_repair_and_assert", "CB-ATTEMPT-TO-REPAIR-AND-ASSERT", 6, 0, false);
        declareFunction("cb_explain_why_not_wff", "CB-EXPLAIN-WHY-NOT-WFF", 2, 7, false);
        declareFunction("cb_wff_repair_advice", "CB-WFF-REPAIR-ADVICE", 6, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION", 6, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation_or_lift", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT", 7, 0, false);
        declareFunction("assertions_in_spec_mts_among", "ASSERTIONS-IN-SPEC-MTS-AMONG", 2, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT-TO-MIN-CEILING-MT", 7, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_lift_from_spec_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-LIFT-FROM-SPEC-MT", 7, 0, false);
        declareFunction("cb_link_repair_and_reattempt", "CB-LINK-REPAIR-AND-REATTEMPT", 2, 1, false);
        declareFunction("cb_repair_and_reattempt", "CB-REPAIR-AND-REATTEMPT", 1, 0, false);
        declareFunction("cb_assertion_toolbar", "CB-ASSERTION-TOOLBAR", 1, 0, false);
        declareFunction("assertion_modification_permittedP", "ASSERTION-MODIFICATION-PERMITTED?", 1, 0, false);
        declareFunction("cb_disabled_link", "CB-DISABLED-LINK", 1, 0, false);
        declareFunction("cb_change_mt", "CB-CHANGE-MT", 1, 0, false);
        declareFunction("cb_change_all_meta_assertions_mt_check", "CB-CHANGE-ALL-META-ASSERTIONS-MT-CHECK", 1, 0, false);
        declareFunction("cb_handle_change_mt", "CB-HANDLE-CHANGE-MT", 1, 0, false);
        declareFunction("cb_link_change_mt", "CB-LINK-CHANGE-MT", 1, 2, false);
        declareFunction("cb_change_strength", "CB-CHANGE-STRENGTH", 1, 0, false);
        declareFunction("cb_handle_change_strength", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false);
        declareFunction("cb_link_change_strength", "CB-LINK-CHANGE-STRENGTH", 1, 2, false);
        declareFunction("cb_change_direction", "CB-CHANGE-DIRECTION", 1, 0, false);
        declareFunction("cb_handle_change_direction", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false);
        declareFunction("cb_link_change_direction", "CB-LINK-CHANGE-DIRECTION", 1, 2, false);
        declareFunction("cb_change_meta_assertion_mt", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false);
        declareFunction("cb_handle_change_meta_assertion_mt", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false);
        declareFunction("cb_link_change_meta_assertion_mt", "CB-LINK-CHANGE-META-ASSERTION-MT", 1, 2, false);
        declareFunction("cb_rename_variables", "CB-RENAME-VARIABLES", 1, 0, false);
        declareFunction("cb_handle_rename_variables", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false);
        declareFunction("cb_extract_variables_from_args", "CB-EXTRACT-VARIABLES-FROM-ARGS", 1, 0, false);
        declareFunction("cb_show_invalid_variables_message", "CB-SHOW-INVALID-VARIABLES-MESSAGE", 1, 0, false);
        declareFunction("cb_link_rename_variables", "CB-LINK-RENAME-VARIABLES", 1, 2, false);
        declareFunction("cb_repropagate", "CB-REPROPAGATE", 1, 0, false);
        declareFunction("cb_link_repropagate", "CB-LINK-REPROPAGATE", 1, 2, false);
        declareFunction("cb_repropagate_browsably", "CB-REPROPAGATE-BROWSABLY", 1, 0, false);
        declareFunction("cb_link_repropagate_browsably", "CB-LINK-REPROPAGATE-BROWSABLY", 1, 2, false);
        declareFunction("cb_recanonicalize", "CB-RECANONICALIZE", 1, 0, false);
        declareFunction("cb_link_recanonicalize", "CB-LINK-RECANONICALIZE", 1, 2, false);
        declareFunction("cb_wff", "CB-WFF", 0, 1, false);
        declareFunction("cb_link_wff", "CB-LINK-WFF", 0, 1, false);
        declareFunction("cb_handle_wff", "CB-HANDLE-WFF", 1, 0, false);
        declareFunction("cb_wff_check_formula", "CB-WFF-CHECK-FORMULA", 1, 1, false);
        declareFunction("cb_wff_check_formula_ok", "CB-WFF-CHECK-FORMULA-OK", 2, 0, false);
        declareFunction("cb_assert", "CB-ASSERT", 0, 1, false);
        declareFunction("cb_handle_assert", "CB-HANDLE-ASSERT", 1, 0, false);
        declareFunction("cb_extract_some_assert_arguments", "CB-EXTRACT-SOME-ASSERT-ARGUMENTS", 1, 0, false);
        declareFunction("cb_link_assert", "CB-LINK-ASSERT", 0, 1, false);
        declareFunction("cb_assert_internal", "CB-ASSERT-INTERNAL", 1, 3, false);
        declareFunction("cb_assert_sentence_constant_suggestions", "CB-ASSERT-SENTENCE-CONSTANT-SUGGESTIONS", 1, 0, false);
        declareFunction("cb_extract_values_for_assert", "CB-EXTRACT-VALUES-FOR-ASSERT", 4, 0, false);
        declareFunction("cb_tabulate_checkable_meta_assertions", "CB-TABULATE-CHECKABLE-META-ASSERTIONS", 1, 4, false);
        declareFunction("cb_show_meta_assertion_readably", "CB-SHOW-META-ASSERTION-READABLY", 2, 3, false);
        declareFunction("cb_extract_mt_from_string", "CB-EXTRACT-MT-FROM-STRING", 1, 0, false);
        declareFunction("cb_valid_microtheoryP", "CB-VALID-MICROTHEORY?", 1, 0, false);
        declareFunction("cb_extract_formula_from_string", "CB-EXTRACT-FORMULA-FROM-STRING", 1, 1, false);
        declareFunction("cb_wff_check_sentence_int", "CB-WFF-CHECK-SENTENCE-INT", 2, 2, false);
        declareFunction("cb_assert_formula", "CB-ASSERT-FORMULA", 1, 0, false);
        declareFunction("cb_link_assert_formula", "CB-LINK-ASSERT-FORMULA", 1, 2, false);
        declareFunction("cb_similar", "CB-SIMILAR", 1, 0, false);
        declareFunction("cb_link_assert_similar", "CB-LINK-ASSERT-SIMILAR", 1, 1, false);
        declareFunction("cb_assert_meta", "CB-ASSERT-META", 1, 0, false);
        declareFunction("cb_handle_assert_meta", "CB-HANDLE-ASSERT-META", 1, 0, false);
        declareFunction("cb_link_assert_meta", "CB-LINK-ASSERT-META", 1, 1, false);
        declareMacro("without_arg_format_and_relator_checking", "WITHOUT-ARG-FORMAT-AND-RELATOR-CHECKING");
        declareFunction("cb_edit", "CB-EDIT", 1, 0, false);
        declareFunction("cb_handle_edit", "CB-HANDLE-EDIT", 1, 0, false);
        declareFunction("cb_extract_meta_assertions_from_args", "CB-EXTRACT-META-ASSERTIONS-FROM-ARGS", 2, 2, false);
        declareFunction("cb_link_edit_assertion", "CB-LINK-EDIT-ASSERTION", 1, 3, false);
        declareFunction("cb_handle_sentence_edit", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false);
        declareFunction("cb_handle_sentence_edit_int", "CB-HANDLE-SENTENCE-EDIT-INT", 6, 0, false);
        declareFunction("cb_fix_typo_edit", "CB-FIX-TYPO-EDIT", 1, 0, false);
        declareFunction("cb_link_fix_typo", "CB-LINK-FIX-TYPO", 1, 2, false);
        declareFunction("cb_handle_fix_typo", "CB-HANDLE-FIX-TYPO", 1, 0, false);
        declareFunction("cb_fix_typo_assertionP", "CB-FIX-TYPO-ASSERTION?", 1, 0, false);
        declareFunction("cb_reassert", "CB-REASSERT", 1, 0, false);
        declareFunction("cb_link_reassert", "CB-LINK-REASSERT", 1, 2, false);
        declareFunction("cb_unassert", "CB-UNASSERT", 1, 0, false);
        declareFunction("cb_link_unassert", "CB-LINK-UNASSERT", 1, 2, false);
        declareFunction("cb_blast", "CB-BLAST", 1, 0, false);
        declareFunction("cb_link_blast", "CB-LINK-BLAST", 1, 2, false);
        declareFunction("cb_remove_deduction", "CB-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("cb_link_remove_deduction", "CB-LINK-REMOVE-DEDUCTION", 1, 2, false);
        declareFunction("cb_assertion_tms", "CB-ASSERTION-TMS", 1, 0, false);
        declareFunction("cb_link_assert_tms", "CB-LINK-ASSERT-TMS", 1, 2, false);
        declareFunction("cb_diagnose_assertion", "CB-DIAGNOSE-ASSERTION", 1, 0, false);
        declareFunction("cb_diagnose_assertion_int", "CB-DIAGNOSE-ASSERTION-INT", 1, 0, false);
        declareFunction("cb_link_diagnose_assertion", "CB-LINK-DIAGNOSE-ASSERTION", 1, 1, false);
        declareFunction("cb_proof_checker_rules", "CB-PROOF-CHECKER-RULES", 0, 0, false);
        declareFunction("cb_add_to_proof_checker_rules", "CB-ADD-TO-PROOF-CHECKER-RULES", 1, 0, false);
        declareFunction("cb_delete_from_proof_checker_rules", "CB-DELETE-FROM-PROOF-CHECKER-RULES", 1, 0, false);
        declareFunction("cb_delete_all_proof_checker_rules", "CB-DELETE-ALL-PROOF-CHECKER-RULES", 0, 0, false);
        declareFunction("cb_use_in_proof", "CB-USE-IN-PROOF", 1, 0, false);
        declareFunction("cb_link_use_in_proof", "CB-LINK-USE-IN-PROOF", 1, 1, false);
        declareFunction("ke_formula_edit_email_notify", "KE-FORMULA-EDIT-EMAIL-NOTIFY", 5, 0, false);
        declareFunction("ke_formula_edit_email_notify_int", "KE-FORMULA-EDIT-EMAIL-NOTIFY-INT", 6, 0, false);
        declareFunction("ke_formula_edit_message", "KE-FORMULA-EDIT-MESSAGE", 5, 0, false);
        declareFunction("cb_strength_and_direction_section", "CB-STRENGTH-AND-DIRECTION-SECTION", 2, 1, false);
        declareFunction("cb_extract_strength_and_direction_input", "CB-EXTRACT-STRENGTH-AND-DIRECTION-INPUT", 1, 1, false);
        declareFunction("cb_email_notify_section", "CB-EMAIL-NOTIFY-SECTION", 1, 1, false);
        declareFunction("cb_email_notify_if_needed_for_assertion", "CB-EMAIL-NOTIFY-IF-NEEDED-FOR-ASSERTION", 4, 1, false);
        declareFunction("cb_email_notify_if_needed_for_sentence", "CB-EMAIL-NOTIFY-IF-NEEDED-FOR-SENTENCE", 5, 1, false);
        declareFunction("cb_make_workaround_assertion_section", "CB-MAKE-WORKAROUND-ASSERTION-SECTION", 0, 1, false);
        declareFunction("cb_make_bug_dependancy_meta_assertion_if_needed", "CB-MAKE-BUG-DEPENDANCY-META-ASSERTION-IF-NEEDED", 3, 1, false);
        declareFunction("cb_new_bug_dependency_meta_assertion_spec_if_needed", "CB-NEW-BUG-DEPENDENCY-META-ASSERTION-SPEC-IF-NEEDED", 3, 1, false);
        declareFunction("cb_link_assertion_graph", "CB-LINK-ASSERTION-GRAPH", 1, 1, false);
        declareFunction("cb_assertion_graph", "CB-ASSERTION-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_graph_internal", "CB-ASSERTION-GRAPH-INTERNAL", 1, 0, false);
        declareFunction("cb_assertion_graph_type_string", "CB-ASSERTION-GRAPH-TYPE-STRING", 1, 0, false);
        declareFunction("cb_assertion_print_graph", "CB-ASSERTION-PRINT-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_check_graph", "CB-ASSERTION-CHECK-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_print_graph_of_rule", "CB-ASSERTION-PRINT-GRAPH-OF-RULE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_assertion_editor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_change_mt_hook", "CB-CHANGE-MT-HOOK", 2, 1, false);
            declareFunction("cb_change_strength_hook", "CB-CHANGE-STRENGTH-HOOK", 2, 0, false);
            declareFunction("cb_change_direction_hook", "CB-CHANGE-DIRECTION-HOOK", 2, 0, false);
            declareFunction("cb_repropagate_hook", "CB-REPROPAGATE-HOOK", 1, 0, false);
            declareFunction("cb_repropagate_browsably_hook", "CB-REPROPAGATE-BROWSABLY-HOOK", 1, 0, false);
            declareFunction("cb_recanonicalize_hook", "CB-RECANONICALIZE-HOOK", 1, 1, false);
            declareFunction("cb_rename_variables_hook", "CB-RENAME-VARIABLES-HOOK", 2, 0, false);
            declareFunction("cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 2, false);
            declareFunction("cb_null_edit_assertion_hook", "CB-NULL-EDIT-ASSERTION-HOOK", 1, 0, false);
            declareFunction("cb_edit_assertion_strings_hook", "CB-EDIT-ASSERTION-STRINGS-HOOK", 2, 1, false);
            declareFunction("cb_assertion_spec_print_function_trampoline", "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("cb_assertion_spec_p", "CB-ASSERTION-SPEC-P", 1, 0, false);
            new cb_assertion_editor.$cb_assertion_spec_p$UnaryFunction();
            declareFunction("assertion_spec_sentence", "ASSERTION-SPEC-SENTENCE", 1, 0, false);
            declareFunction("assertion_spec_mt", "ASSERTION-SPEC-MT", 1, 0, false);
            declareFunction("assertion_spec_strength", "ASSERTION-SPEC-STRENGTH", 1, 0, false);
            declareFunction("assertion_spec_direction", "ASSERTION-SPEC-DIRECTION", 1, 0, false);
            declareFunction("assertion_spec_unasserts", "ASSERTION-SPEC-UNASSERTS", 1, 0, false);
            declareFunction("assertion_spec_metas", "ASSERTION-SPEC-METAS", 1, 0, false);
            declareFunction("_csetf_assertion_spec_sentence", "_CSETF-ASSERTION-SPEC-SENTENCE", 2, 0, false);
            declareFunction("_csetf_assertion_spec_mt", "_CSETF-ASSERTION-SPEC-MT", 2, 0, false);
            declareFunction("_csetf_assertion_spec_strength", "_CSETF-ASSERTION-SPEC-STRENGTH", 2, 0, false);
            declareFunction("_csetf_assertion_spec_direction", "_CSETF-ASSERTION-SPEC-DIRECTION", 2, 0, false);
            declareFunction("_csetf_assertion_spec_unasserts", "_CSETF-ASSERTION-SPEC-UNASSERTS", 2, 0, false);
            declareFunction("_csetf_assertion_spec_metas", "_CSETF-ASSERTION-SPEC-METAS", 2, 0, false);
            declareFunction("make_cb_assertion_spec", "MAKE-CB-ASSERTION-SPEC", 0, 1, false);
            declareFunction("visit_defstruct_cb_assertion_spec", "VISIT-DEFSTRUCT-CB-ASSERTION-SPEC", 2, 0, false);
            declareFunction("visit_defstruct_object_cb_assertion_spec_method", "VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD", 2, 0, false);
            declareFunction("new_cb_assertion_spec", "NEW-CB-ASSERTION-SPEC", 2, 4, false);
            declareFunction("ke_assert_assertion_spec", "KE-ASSERT-ASSERTION-SPEC", 1, 0, false);
            declareFunction("cb_note_edit_change", "CB-NOTE-EDIT-CHANGE", 2, 2, false);
            declareFunction("cb_attempt_to_repair_and_assert", "CB-ATTEMPT-TO-REPAIR-AND-ASSERT", 6, 0, false);
            declareFunction("cb_explain_why_not_wff", "CB-EXPLAIN-WHY-NOT-WFF", 2, 7, false);
            declareFunction("cb_wff_repair_advice", "CB-WFF-REPAIR-ADVICE", 6, 0, false);
            declareFunction("cb_wff_repair_advise_assertion_creation", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION", 6, 0, false);
            declareFunction("cb_wff_repair_advise_assertion_creation_or_lift", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT", 7, 0, false);
            declareFunction("assertions_in_spec_mts_among", "ASSERTIONS-IN-SPEC-MTS-AMONG", 2, 0, false);
            declareFunction("cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT-TO-MIN-CEILING-MT", 7, 0, false);
            declareFunction("cb_wff_repair_advise_assertion_lift_from_spec_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-LIFT-FROM-SPEC-MT", 7, 0, false);
            declareFunction("cb_link_repair_and_reattempt", "CB-LINK-REPAIR-AND-REATTEMPT", 2, 1, false);
            declareFunction("cb_repair_and_reattempt", "CB-REPAIR-AND-REATTEMPT", 1, 0, false);
            declareFunction("cb_assertion_toolbar", "CB-ASSERTION-TOOLBAR", 1, 0, false);
            declareFunction("assertion_modification_permittedP", "ASSERTION-MODIFICATION-PERMITTED?", 1, 0, false);
            declareFunction("cb_disabled_link", "CB-DISABLED-LINK", 1, 0, false);
            declareFunction("cb_change_mt", "CB-CHANGE-MT", 1, 0, false);
            declareFunction("cb_change_all_meta_assertions_mt_check", "CB-CHANGE-ALL-META-ASSERTIONS-MT-CHECK", 1, 0, false);
            declareFunction("cb_handle_change_mt", "CB-HANDLE-CHANGE-MT", 1, 0, false);
            declareFunction("cb_link_change_mt", "CB-LINK-CHANGE-MT", 1, 2, false);
            declareFunction("cb_change_strength", "CB-CHANGE-STRENGTH", 1, 0, false);
            declareFunction("cb_handle_change_strength", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false);
            declareFunction("cb_link_change_strength", "CB-LINK-CHANGE-STRENGTH", 1, 2, false);
            declareFunction("cb_change_direction", "CB-CHANGE-DIRECTION", 1, 0, false);
            declareFunction("cb_handle_change_direction", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false);
            declareFunction("cb_link_change_direction", "CB-LINK-CHANGE-DIRECTION", 1, 2, false);
            declareFunction("cb_change_meta_assertion_mt", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false);
            declareFunction("cb_handle_change_meta_assertion_mt", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false);
            declareFunction("cb_link_change_meta_assertion_mt", "CB-LINK-CHANGE-META-ASSERTION-MT", 1, 2, false);
            declareFunction("cb_rename_variables", "CB-RENAME-VARIABLES", 1, 0, false);
            declareFunction("cb_handle_rename_variables", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false);
            declareFunction("cb_extract_variables_from_args", "CB-EXTRACT-VARIABLES-FROM-ARGS", 1, 0, false);
            declareFunction("cb_show_invalid_variables_message", "CB-SHOW-INVALID-VARIABLES-MESSAGE", 1, 0, false);
            declareFunction("cb_link_rename_variables", "CB-LINK-RENAME-VARIABLES", 1, 2, false);
            declareFunction("cb_repropagate", "CB-REPROPAGATE", 1, 0, false);
            declareFunction("cb_link_repropagate", "CB-LINK-REPROPAGATE", 1, 2, false);
            declareFunction("cb_repropagate_browsably", "CB-REPROPAGATE-BROWSABLY", 1, 0, false);
            declareFunction("cb_link_repropagate_browsably", "CB-LINK-REPROPAGATE-BROWSABLY", 1, 2, false);
            declareFunction("cb_recanonicalize", "CB-RECANONICALIZE", 1, 0, false);
            declareFunction("cb_link_recanonicalize", "CB-LINK-RECANONICALIZE", 1, 2, false);
            declareFunction("cb_wff", "CB-WFF", 0, 1, false);
            declareFunction("cb_link_wff", "CB-LINK-WFF", 0, 1, false);
            declareFunction("cb_handle_wff", "CB-HANDLE-WFF", 1, 0, false);
            declareFunction("cb_wff_check_formula", "CB-WFF-CHECK-FORMULA", 1, 1, false);
            declareFunction("cb_wff_check_formula_ok", "CB-WFF-CHECK-FORMULA-OK", 2, 0, false);
            declareFunction("cb_assert", "CB-ASSERT", 0, 1, false);
            declareFunction("cb_handle_assert", "CB-HANDLE-ASSERT", 1, 0, false);
            declareFunction("cb_extract_some_assert_arguments", "CB-EXTRACT-SOME-ASSERT-ARGUMENTS", 1, 0, false);
            declareFunction("cb_link_assert", "CB-LINK-ASSERT", 0, 1, false);
            declareFunction("cb_assert_internal", "CB-ASSERT-INTERNAL", 1, 3, false);
            declareFunction("cb_assert_sentence_constant_suggestions", "CB-ASSERT-SENTENCE-CONSTANT-SUGGESTIONS", 1, 0, false);
            declareFunction("cb_extract_values_for_assert", "CB-EXTRACT-VALUES-FOR-ASSERT", 4, 0, false);
            declareFunction("cb_tabulate_checkable_meta_assertions", "CB-TABULATE-CHECKABLE-META-ASSERTIONS", 1, 4, false);
            declareFunction("cb_show_meta_assertion_readably", "CB-SHOW-META-ASSERTION-READABLY", 2, 3, false);
            declareFunction("cb_extract_mt_from_string", "CB-EXTRACT-MT-FROM-STRING", 1, 0, false);
            declareFunction("cb_valid_microtheoryP", "CB-VALID-MICROTHEORY?", 1, 0, false);
            declareFunction("cb_extract_formula_from_string", "CB-EXTRACT-FORMULA-FROM-STRING", 1, 1, false);
            declareFunction("cb_wff_check_sentence_int", "CB-WFF-CHECK-SENTENCE-INT", 2, 2, false);
            declareFunction("cb_assert_formula", "CB-ASSERT-FORMULA", 1, 0, false);
            declareFunction("cb_link_assert_formula", "CB-LINK-ASSERT-FORMULA", 1, 2, false);
            declareFunction("cb_similar", "CB-SIMILAR", 1, 0, false);
            declareFunction("cb_link_assert_similar", "CB-LINK-ASSERT-SIMILAR", 1, 1, false);
            declareFunction("cb_assert_meta", "CB-ASSERT-META", 1, 0, false);
            declareFunction("cb_handle_assert_meta", "CB-HANDLE-ASSERT-META", 1, 0, false);
            declareFunction("cb_link_assert_meta", "CB-LINK-ASSERT-META", 1, 1, false);
            declareFunction("cb_suggest_pragmas", "CB-SUGGEST-PRAGMAS", 1, 0, false);
            declareFunction("cb_link_suggest_pragmas", "CB-LINK-SUGGEST-PRAGMAS", 1, 3, false);
            declareFunction("cb_suggest_pragmas_guts", "CB-SUGGEST-PRAGMAS-GUTS", 1, 0, false);
            declareFunction("cb_link_assert_suggested_pragma", "CB-LINK-ASSERT-SUGGESTED-PRAGMA", 2, 1, false);
            declareFunction("cb_assert_suggested_pragma", "CB-ASSERT-SUGGESTED-PRAGMA", 1, 0, false);
            declareMacro("without_arg_format_and_relator_checking", "WITHOUT-ARG-FORMAT-AND-RELATOR-CHECKING");
            declareFunction("cb_edit", "CB-EDIT", 1, 0, false);
            declareFunction("cb_handle_edit", "CB-HANDLE-EDIT", 1, 0, false);
            declareFunction("cb_extract_meta_assertions_from_args", "CB-EXTRACT-META-ASSERTIONS-FROM-ARGS", 2, 2, false);
            declareFunction("cb_link_edit_assertion", "CB-LINK-EDIT-ASSERTION", 1, 3, false);
            declareFunction("cb_handle_edit_assertion", "CB-HANDLE-EDIT-ASSERTION", 1, 0, false);
            declareFunction("cb_handle_sentence_edit", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false);
            declareFunction("cb_handle_sentence_edit_int", "CB-HANDLE-SENTENCE-EDIT-INT", 6, 0, false);
            declareFunction("cb_fix_typo_edit", "CB-FIX-TYPO-EDIT", 1, 0, false);
            declareFunction("cb_link_fix_typo", "CB-LINK-FIX-TYPO", 1, 2, false);
            declareFunction("cb_handle_fix_typo", "CB-HANDLE-FIX-TYPO", 1, 0, false);
            declareFunction("cb_fix_typo_assertionP", "CB-FIX-TYPO-ASSERTION?", 1, 0, false);
            declareFunction("cb_reassert", "CB-REASSERT", 1, 0, false);
            declareFunction("cb_link_reassert", "CB-LINK-REASSERT", 1, 2, false);
            declareFunction("cb_unassert", "CB-UNASSERT", 1, 0, false);
            declareFunction("cb_link_unassert", "CB-LINK-UNASSERT", 1, 2, false);
            declareFunction("cb_blast", "CB-BLAST", 1, 0, false);
            declareFunction("cb_link_blast", "CB-LINK-BLAST", 1, 2, false);
            declareFunction("cb_remove_deduction", "CB-REMOVE-DEDUCTION", 1, 0, false);
            declareFunction("cb_link_remove_deduction", "CB-LINK-REMOVE-DEDUCTION", 1, 2, false);
            declareFunction("cb_assertion_tms", "CB-ASSERTION-TMS", 1, 0, false);
            declareFunction("cb_link_assert_tms", "CB-LINK-ASSERT-TMS", 1, 2, false);
            declareFunction("cb_diagnose_assertion", "CB-DIAGNOSE-ASSERTION", 1, 0, false);
            declareFunction("cb_diagnose_assertion_int", "CB-DIAGNOSE-ASSERTION-INT", 1, 0, false);
            declareFunction("cb_link_diagnose_assertion", "CB-LINK-DIAGNOSE-ASSERTION", 1, 1, false);
            declareFunction("cb_link_trigger_test", "CB-LINK-TRIGGER-TEST", 0, 3, false);
            declareFunction("cb_trigger_test_id_strings", "CB-TRIGGER-TEST-ID-STRINGS", 2, 0, false);
            declareFunction("cb_extract_trigger_test_args", "CB-EXTRACT-TRIGGER-TEST-ARGS", 1, 0, false);
            declareFunction("cb_trigger_test", "CB-TRIGGER-TEST", 1, 0, false);
            declareFunction("cb_trigger_test_support_and_rule", "CB-TRIGGER-TEST-SUPPORT-AND-RULE", 2, 0, false);
            declareFunction("cb_trigger_test_support", "CB-TRIGGER-TEST-SUPPORT", 1, 0, false);
            declareFunction("cb_trigger_test_rule", "CB-TRIGGER-TEST-RULE", 1, 0, false);
            declareFunction("cb_trigger_test_unspecified", "CB-TRIGGER-TEST-UNSPECIFIED", 0, 0, false);
            declareFunction("cb_proof_checker_rules", "CB-PROOF-CHECKER-RULES", 0, 0, false);
            declareFunction("cb_add_to_proof_checker_rules", "CB-ADD-TO-PROOF-CHECKER-RULES", 1, 0, false);
            declareFunction("cb_delete_from_proof_checker_rules", "CB-DELETE-FROM-PROOF-CHECKER-RULES", 1, 0, false);
            declareFunction("cb_delete_all_proof_checker_rules", "CB-DELETE-ALL-PROOF-CHECKER-RULES", 0, 0, false);
            declareFunction("cb_use_in_proof", "CB-USE-IN-PROOF", 1, 0, false);
            declareFunction("cb_link_use_in_proof", "CB-LINK-USE-IN-PROOF", 1, 1, false);
            declareFunction("cb_reinforce_rule", "CB-REINFORCE-RULE", 1, 0, false);
            declareFunction("cb_link_reinforce_rule", "CB-LINK-REINFORCE-RULE", 1, 1, false);
            declareFunction("reinforce_rule", "REINFORCE-RULE", 1, 1, false);
            declareFunction("cb_strength_and_direction_section", "CB-STRENGTH-AND-DIRECTION-SECTION", 2, 1, false);
            declareFunction("cb_extract_strength_and_direction_input", "CB-EXTRACT-STRENGTH-AND-DIRECTION-INPUT", 1, 1, false);
            declareFunction("cb_link_assertion_graph", "CB-LINK-ASSERTION-GRAPH", 1, 1, false);
            declareFunction("cb_assertion_graph", "CB-ASSERTION-GRAPH", 1, 0, false);
            declareFunction("cb_assertion_graph_internal", "CB-ASSERTION-GRAPH-INTERNAL", 1, 0, false);
            declareFunction("cb_assertion_graph_type_string", "CB-ASSERTION-GRAPH-TYPE-STRING", 1, 0, false);
            declareFunction("cb_assertion_print_graph", "CB-ASSERTION-PRINT-GRAPH", 1, 0, false);
            declareFunction("cb_assertion_check_graph", "CB-ASSERTION-CHECK-GRAPH", 1, 0, false);
            declareFunction("cb_assertion_print_graph_of_rule", "CB-ASSERTION-PRINT-GRAPH-OF-RULE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 1, false);
            declareFunction("ke_formula_edit_email_notify", "KE-FORMULA-EDIT-EMAIL-NOTIFY", 5, 0, false);
            declareFunction("ke_formula_edit_email_notify_int", "KE-FORMULA-EDIT-EMAIL-NOTIFY-INT", 6, 0, false);
            declareFunction("ke_formula_edit_message", "KE-FORMULA-EDIT-MESSAGE", 5, 0, false);
            declareFunction("cb_email_notify_section", "CB-EMAIL-NOTIFY-SECTION", 1, 1, false);
            declareFunction("cb_email_notify_if_needed_for_assertion", "CB-EMAIL-NOTIFY-IF-NEEDED-FOR-ASSERTION", 4, 1, false);
            declareFunction("cb_email_notify_if_needed_for_sentence", "CB-EMAIL-NOTIFY-IF-NEEDED-FOR-SENTENCE", 5, 1, false);
            declareFunction("cb_make_workaround_assertion_section", "CB-MAKE-WORKAROUND-ASSERTION-SECTION", 0, 1, false);
            declareFunction("cb_make_bug_dependancy_meta_assertion_if_needed", "CB-MAKE-BUG-DEPENDANCY-META-ASSERTION-IF-NEEDED", 3, 1, false);
            declareFunction("cb_new_bug_dependency_meta_assertion_spec_if_needed", "CB-NEW-BUG-DEPENDENCY-META-ASSERTION-SPEC-IF-NEEDED", 3, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_assertion_editor_file_Previous() {
        declareFunction("cb_change_mt_hook", "CB-CHANGE-MT-HOOK", 2, 1, false);
        declareFunction("cb_change_strength_hook", "CB-CHANGE-STRENGTH-HOOK", 2, 0, false);
        declareFunction("cb_change_direction_hook", "CB-CHANGE-DIRECTION-HOOK", 2, 0, false);
        declareFunction("cb_repropagate_hook", "CB-REPROPAGATE-HOOK", 1, 0, false);
        declareFunction("cb_repropagate_browsably_hook", "CB-REPROPAGATE-BROWSABLY-HOOK", 1, 0, false);
        declareFunction("cb_recanonicalize_hook", "CB-RECANONICALIZE-HOOK", 1, 1, false);
        declareFunction("cb_rename_variables_hook", "CB-RENAME-VARIABLES-HOOK", 2, 0, false);
        declareFunction("cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 2, false);
        declareFunction("cb_null_edit_assertion_hook", "CB-NULL-EDIT-ASSERTION-HOOK", 1, 0, false);
        declareFunction("cb_edit_assertion_strings_hook", "CB-EDIT-ASSERTION-STRINGS-HOOK", 2, 1, false);
        declareFunction("cb_assertion_spec_print_function_trampoline", "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cb_assertion_spec_p", "CB-ASSERTION-SPEC-P", 1, 0, false);
        new cb_assertion_editor.$cb_assertion_spec_p$UnaryFunction();
        declareFunction("assertion_spec_sentence", "ASSERTION-SPEC-SENTENCE", 1, 0, false);
        declareFunction("assertion_spec_mt", "ASSERTION-SPEC-MT", 1, 0, false);
        declareFunction("assertion_spec_strength", "ASSERTION-SPEC-STRENGTH", 1, 0, false);
        declareFunction("assertion_spec_direction", "ASSERTION-SPEC-DIRECTION", 1, 0, false);
        declareFunction("assertion_spec_unasserts", "ASSERTION-SPEC-UNASSERTS", 1, 0, false);
        declareFunction("assertion_spec_metas", "ASSERTION-SPEC-METAS", 1, 0, false);
        declareFunction("_csetf_assertion_spec_sentence", "_CSETF-ASSERTION-SPEC-SENTENCE", 2, 0, false);
        declareFunction("_csetf_assertion_spec_mt", "_CSETF-ASSERTION-SPEC-MT", 2, 0, false);
        declareFunction("_csetf_assertion_spec_strength", "_CSETF-ASSERTION-SPEC-STRENGTH", 2, 0, false);
        declareFunction("_csetf_assertion_spec_direction", "_CSETF-ASSERTION-SPEC-DIRECTION", 2, 0, false);
        declareFunction("_csetf_assertion_spec_unasserts", "_CSETF-ASSERTION-SPEC-UNASSERTS", 2, 0, false);
        declareFunction("_csetf_assertion_spec_metas", "_CSETF-ASSERTION-SPEC-METAS", 2, 0, false);
        declareFunction("make_cb_assertion_spec", "MAKE-CB-ASSERTION-SPEC", 0, 1, false);
        declareFunction("visit_defstruct_cb_assertion_spec", "VISIT-DEFSTRUCT-CB-ASSERTION-SPEC", 2, 0, false);
        declareFunction("visit_defstruct_object_cb_assertion_spec_method", "VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD", 2, 0, false);
        declareFunction("new_cb_assertion_spec", "NEW-CB-ASSERTION-SPEC", 2, 4, false);
        declareFunction("ke_assert_assertion_spec", "KE-ASSERT-ASSERTION-SPEC", 1, 0, false);
        declareFunction("cb_note_edit_change", "CB-NOTE-EDIT-CHANGE", 2, 2, false);
        declareFunction("cb_attempt_to_repair_and_assert", "CB-ATTEMPT-TO-REPAIR-AND-ASSERT", 6, 0, false);
        declareFunction("cb_explain_why_not_wff", "CB-EXPLAIN-WHY-NOT-WFF", 2, 7, false);
        declareFunction("cb_wff_repair_advice", "CB-WFF-REPAIR-ADVICE", 6, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION", 6, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation_or_lift", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT", 7, 0, false);
        declareFunction("assertions_in_spec_mts_among", "ASSERTIONS-IN-SPEC-MTS-AMONG", 2, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT-TO-MIN-CEILING-MT", 7, 0, false);
        declareFunction("cb_wff_repair_advise_assertion_lift_from_spec_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-LIFT-FROM-SPEC-MT", 7, 0, false);
        declareFunction("cb_link_repair_and_reattempt", "CB-LINK-REPAIR-AND-REATTEMPT", 2, 1, false);
        declareFunction("cb_repair_and_reattempt", "CB-REPAIR-AND-REATTEMPT", 1, 0, false);
        declareFunction("cb_assertion_toolbar", "CB-ASSERTION-TOOLBAR", 1, 0, false);
        declareFunction("assertion_modification_permittedP", "ASSERTION-MODIFICATION-PERMITTED?", 1, 0, false);
        declareFunction("cb_disabled_link", "CB-DISABLED-LINK", 1, 0, false);
        declareFunction("cb_change_mt", "CB-CHANGE-MT", 1, 0, false);
        declareFunction("cb_change_all_meta_assertions_mt_check", "CB-CHANGE-ALL-META-ASSERTIONS-MT-CHECK", 1, 0, false);
        declareFunction("cb_handle_change_mt", "CB-HANDLE-CHANGE-MT", 1, 0, false);
        declareFunction("cb_link_change_mt", "CB-LINK-CHANGE-MT", 1, 2, false);
        declareFunction("cb_change_strength", "CB-CHANGE-STRENGTH", 1, 0, false);
        declareFunction("cb_handle_change_strength", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false);
        declareFunction("cb_link_change_strength", "CB-LINK-CHANGE-STRENGTH", 1, 2, false);
        declareFunction("cb_change_direction", "CB-CHANGE-DIRECTION", 1, 0, false);
        declareFunction("cb_handle_change_direction", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false);
        declareFunction("cb_link_change_direction", "CB-LINK-CHANGE-DIRECTION", 1, 2, false);
        declareFunction("cb_change_meta_assertion_mt", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false);
        declareFunction("cb_handle_change_meta_assertion_mt", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false);
        declareFunction("cb_link_change_meta_assertion_mt", "CB-LINK-CHANGE-META-ASSERTION-MT", 1, 2, false);
        declareFunction("cb_rename_variables", "CB-RENAME-VARIABLES", 1, 0, false);
        declareFunction("cb_handle_rename_variables", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false);
        declareFunction("cb_extract_variables_from_args", "CB-EXTRACT-VARIABLES-FROM-ARGS", 1, 0, false);
        declareFunction("cb_show_invalid_variables_message", "CB-SHOW-INVALID-VARIABLES-MESSAGE", 1, 0, false);
        declareFunction("cb_link_rename_variables", "CB-LINK-RENAME-VARIABLES", 1, 2, false);
        declareFunction("cb_repropagate", "CB-REPROPAGATE", 1, 0, false);
        declareFunction("cb_link_repropagate", "CB-LINK-REPROPAGATE", 1, 2, false);
        declareFunction("cb_repropagate_browsably", "CB-REPROPAGATE-BROWSABLY", 1, 0, false);
        declareFunction("cb_link_repropagate_browsably", "CB-LINK-REPROPAGATE-BROWSABLY", 1, 2, false);
        declareFunction("cb_recanonicalize", "CB-RECANONICALIZE", 1, 0, false);
        declareFunction("cb_link_recanonicalize", "CB-LINK-RECANONICALIZE", 1, 2, false);
        declareFunction("cb_wff", "CB-WFF", 0, 1, false);
        declareFunction("cb_link_wff", "CB-LINK-WFF", 0, 1, false);
        declareFunction("cb_handle_wff", "CB-HANDLE-WFF", 1, 0, false);
        declareFunction("cb_wff_check_formula", "CB-WFF-CHECK-FORMULA", 1, 1, false);
        declareFunction("cb_wff_check_formula_ok", "CB-WFF-CHECK-FORMULA-OK", 2, 0, false);
        declareFunction("cb_assert", "CB-ASSERT", 0, 1, false);
        declareFunction("cb_handle_assert", "CB-HANDLE-ASSERT", 1, 0, false);
        declareFunction("cb_extract_some_assert_arguments", "CB-EXTRACT-SOME-ASSERT-ARGUMENTS", 1, 0, false);
        declareFunction("cb_link_assert", "CB-LINK-ASSERT", 0, 1, false);
        declareFunction("cb_assert_internal", "CB-ASSERT-INTERNAL", 1, 3, false);
        declareFunction("cb_assert_sentence_constant_suggestions", "CB-ASSERT-SENTENCE-CONSTANT-SUGGESTIONS", 1, 0, false);
        declareFunction("cb_extract_values_for_assert", "CB-EXTRACT-VALUES-FOR-ASSERT", 4, 0, false);
        declareFunction("cb_tabulate_checkable_meta_assertions", "CB-TABULATE-CHECKABLE-META-ASSERTIONS", 1, 4, false);
        declareFunction("cb_show_meta_assertion_readably", "CB-SHOW-META-ASSERTION-READABLY", 2, 3, false);
        declareFunction("cb_extract_mt_from_string", "CB-EXTRACT-MT-FROM-STRING", 1, 0, false);
        declareFunction("cb_valid_microtheoryP", "CB-VALID-MICROTHEORY?", 1, 0, false);
        declareFunction("cb_extract_formula_from_string", "CB-EXTRACT-FORMULA-FROM-STRING", 1, 1, false);
        declareFunction("cb_wff_check_sentence_int", "CB-WFF-CHECK-SENTENCE-INT", 2, 2, false);
        declareFunction("cb_assert_formula", "CB-ASSERT-FORMULA", 1, 0, false);
        declareFunction("cb_link_assert_formula", "CB-LINK-ASSERT-FORMULA", 1, 2, false);
        declareFunction("cb_similar", "CB-SIMILAR", 1, 0, false);
        declareFunction("cb_link_assert_similar", "CB-LINK-ASSERT-SIMILAR", 1, 1, false);
        declareFunction("cb_assert_meta", "CB-ASSERT-META", 1, 0, false);
        declareFunction("cb_handle_assert_meta", "CB-HANDLE-ASSERT-META", 1, 0, false);
        declareFunction("cb_link_assert_meta", "CB-LINK-ASSERT-META", 1, 1, false);
        declareFunction("cb_suggest_pragmas", "CB-SUGGEST-PRAGMAS", 1, 0, false);
        declareFunction("cb_link_suggest_pragmas", "CB-LINK-SUGGEST-PRAGMAS", 1, 3, false);
        declareFunction("cb_suggest_pragmas_guts", "CB-SUGGEST-PRAGMAS-GUTS", 1, 0, false);
        declareFunction("cb_link_assert_suggested_pragma", "CB-LINK-ASSERT-SUGGESTED-PRAGMA", 2, 1, false);
        declareFunction("cb_assert_suggested_pragma", "CB-ASSERT-SUGGESTED-PRAGMA", 1, 0, false);
        declareMacro("without_arg_format_and_relator_checking", "WITHOUT-ARG-FORMAT-AND-RELATOR-CHECKING");
        declareFunction("cb_edit", "CB-EDIT", 1, 0, false);
        declareFunction("cb_handle_edit", "CB-HANDLE-EDIT", 1, 0, false);
        declareFunction("cb_extract_meta_assertions_from_args", "CB-EXTRACT-META-ASSERTIONS-FROM-ARGS", 2, 2, false);
        declareFunction("cb_link_edit_assertion", "CB-LINK-EDIT-ASSERTION", 1, 3, false);
        declareFunction("cb_handle_edit_assertion", "CB-HANDLE-EDIT-ASSERTION", 1, 0, false);
        declareFunction("cb_handle_sentence_edit", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false);
        declareFunction("cb_handle_sentence_edit_int", "CB-HANDLE-SENTENCE-EDIT-INT", 6, 0, false);
        declareFunction("cb_fix_typo_edit", "CB-FIX-TYPO-EDIT", 1, 0, false);
        declareFunction("cb_link_fix_typo", "CB-LINK-FIX-TYPO", 1, 2, false);
        declareFunction("cb_handle_fix_typo", "CB-HANDLE-FIX-TYPO", 1, 0, false);
        declareFunction("cb_fix_typo_assertionP", "CB-FIX-TYPO-ASSERTION?", 1, 0, false);
        declareFunction("cb_reassert", "CB-REASSERT", 1, 0, false);
        declareFunction("cb_link_reassert", "CB-LINK-REASSERT", 1, 2, false);
        declareFunction("cb_unassert", "CB-UNASSERT", 1, 0, false);
        declareFunction("cb_link_unassert", "CB-LINK-UNASSERT", 1, 2, false);
        declareFunction("cb_blast", "CB-BLAST", 1, 0, false);
        declareFunction("cb_link_blast", "CB-LINK-BLAST", 1, 2, false);
        declareFunction("cb_remove_deduction", "CB-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("cb_link_remove_deduction", "CB-LINK-REMOVE-DEDUCTION", 1, 2, false);
        declareFunction("cb_assertion_tms", "CB-ASSERTION-TMS", 1, 0, false);
        declareFunction("cb_link_assert_tms", "CB-LINK-ASSERT-TMS", 1, 2, false);
        declareFunction("cb_diagnose_assertion", "CB-DIAGNOSE-ASSERTION", 1, 0, false);
        declareFunction("cb_diagnose_assertion_int", "CB-DIAGNOSE-ASSERTION-INT", 1, 0, false);
        declareFunction("cb_link_diagnose_assertion", "CB-LINK-DIAGNOSE-ASSERTION", 1, 1, false);
        declareFunction("cb_link_trigger_test", "CB-LINK-TRIGGER-TEST", 0, 3, false);
        declareFunction("cb_trigger_test_id_strings", "CB-TRIGGER-TEST-ID-STRINGS", 2, 0, false);
        declareFunction("cb_extract_trigger_test_args", "CB-EXTRACT-TRIGGER-TEST-ARGS", 1, 0, false);
        declareFunction("cb_trigger_test", "CB-TRIGGER-TEST", 1, 0, false);
        declareFunction("cb_trigger_test_support_and_rule", "CB-TRIGGER-TEST-SUPPORT-AND-RULE", 2, 0, false);
        declareFunction("cb_trigger_test_support", "CB-TRIGGER-TEST-SUPPORT", 1, 0, false);
        declareFunction("cb_trigger_test_rule", "CB-TRIGGER-TEST-RULE", 1, 0, false);
        declareFunction("cb_trigger_test_unspecified", "CB-TRIGGER-TEST-UNSPECIFIED", 0, 0, false);
        declareFunction("cb_proof_checker_rules", "CB-PROOF-CHECKER-RULES", 0, 0, false);
        declareFunction("cb_add_to_proof_checker_rules", "CB-ADD-TO-PROOF-CHECKER-RULES", 1, 0, false);
        declareFunction("cb_delete_from_proof_checker_rules", "CB-DELETE-FROM-PROOF-CHECKER-RULES", 1, 0, false);
        declareFunction("cb_delete_all_proof_checker_rules", "CB-DELETE-ALL-PROOF-CHECKER-RULES", 0, 0, false);
        declareFunction("cb_use_in_proof", "CB-USE-IN-PROOF", 1, 0, false);
        declareFunction("cb_link_use_in_proof", "CB-LINK-USE-IN-PROOF", 1, 1, false);
        declareFunction("cb_reinforce_rule", "CB-REINFORCE-RULE", 1, 0, false);
        declareFunction("cb_link_reinforce_rule", "CB-LINK-REINFORCE-RULE", 1, 1, false);
        declareFunction("reinforce_rule", "REINFORCE-RULE", 1, 1, false);
        declareFunction("cb_strength_and_direction_section", "CB-STRENGTH-AND-DIRECTION-SECTION", 2, 1, false);
        declareFunction("cb_extract_strength_and_direction_input", "CB-EXTRACT-STRENGTH-AND-DIRECTION-INPUT", 1, 1, false);
        declareFunction("cb_link_assertion_graph", "CB-LINK-ASSERTION-GRAPH", 1, 1, false);
        declareFunction("cb_assertion_graph", "CB-ASSERTION-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_graph_internal", "CB-ASSERTION-GRAPH-INTERNAL", 1, 0, false);
        declareFunction("cb_assertion_graph_type_string", "CB-ASSERTION-GRAPH-TYPE-STRING", 1, 0, false);
        declareFunction("cb_assertion_print_graph", "CB-ASSERTION-PRINT-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_check_graph", "CB-ASSERTION-CHECK-GRAPH", 1, 0, false);
        declareFunction("cb_assertion_print_graph_of_rule", "CB-ASSERTION-PRINT-GRAPH-OF-RULE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_assertion_editor_file_alt() {
        defconstant("*DTP-CB-ASSERTION-SPEC*", CB_ASSERTION_SPEC);
        defparameter("*CB-ASSERT-MODES-TABLE*", $list_alt277);
        defparameter("*CB-PROOF-CHECKER-RULES*", NIL);
        deflexical("*KE-FORMULA-EDIT-EMAIL-SUBJECT*", $$$Assertion_Edit_Notification);
        deflexical("*KE-FORMULA-EDIT-TEMPLATE*", $str_alt439$On__A_at__A__S_edited_the_asserti);
        deflexical("*KE-FORMULA-EDIT-EXPLANATION-TEMPLATE*", $str_alt440$______Additional_explanation_from);
        deflexical("*CB-STRENGTH-INPUT-DEFAULT-NAME*", $$$strength);
        deflexical("*CB-DIRECTION-INPUT-DEFAULT-NAME*", $$$direction);
        deflexical("*CB-EMAIL-NOTIFY-INPUT-DEFAULT-NAME*", $str_alt384$email_notify);
        deflexical("*CB-WORKAROUND-ASSERTION-INPUT-DEFAULT-NAME*", $str_alt455$workaround_assertion);
        return NIL;
    }

    public static SubLObject init_cb_assertion_editor_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-CB-ASSERTION-SPEC*", CB_ASSERTION_SPEC);
            defparameter("*CB-ASSERT-MODES-TABLE*", $list296);
            defparameter("*CB-PROOF-CHECKER-RULES*", NIL);
            deflexical("*CB-STRENGTH-INPUT-DEFAULT-NAME*", $$$strength);
            deflexical("*CB-DIRECTION-INPUT-DEFAULT-NAME*", $$$direction);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CB-ASSERT-MODES-TABLE*", $list_alt277);
            deflexical("*KE-FORMULA-EDIT-EMAIL-SUBJECT*", $$$Assertion_Edit_Notification);
            deflexical("*KE-FORMULA-EDIT-TEMPLATE*", $str_alt439$On__A_at__A__S_edited_the_asserti);
            deflexical("*KE-FORMULA-EDIT-EXPLANATION-TEMPLATE*", $str_alt440$______Additional_explanation_from);
            deflexical("*CB-EMAIL-NOTIFY-INPUT-DEFAULT-NAME*", $str_alt384$email_notify);
            deflexical("*CB-WORKAROUND-ASSERTION-INPUT-DEFAULT-NAME*", $str_alt455$workaround_assertion);
        }
        return NIL;
    }

    public static SubLObject init_cb_assertion_editor_file_Previous() {
        defconstant("*DTP-CB-ASSERTION-SPEC*", CB_ASSERTION_SPEC);
        defparameter("*CB-ASSERT-MODES-TABLE*", $list296);
        defparameter("*CB-PROOF-CHECKER-RULES*", NIL);
        deflexical("*CB-STRENGTH-INPUT-DEFAULT-NAME*", $$$strength);
        deflexical("*CB-DIRECTION-INPUT-DEFAULT-NAME*", $$$direction);
        return NIL;
    }

    public static final SubLObject setup_cb_assertion_editor_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), symbol_function(CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ASSERTION_SPEC_SENTENCE, _CSETF_ASSERTION_SPEC_SENTENCE);
        def_csetf(ASSERTION_SPEC_MT, _CSETF_ASSERTION_SPEC_MT);
        def_csetf(ASSERTION_SPEC_STRENGTH, _CSETF_ASSERTION_SPEC_STRENGTH);
        def_csetf(ASSERTION_SPEC_DIRECTION, _CSETF_ASSERTION_SPEC_DIRECTION);
        def_csetf(ASSERTION_SPEC_UNASSERTS, _CSETF_ASSERTION_SPEC_UNASSERTS);
        def_csetf(ASSERTION_SPEC_METAS, _CSETF_ASSERTION_SPEC_METAS);
        identity(CB_ASSERTION_SPEC);
        sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt32$cb_wff_check_formula_html, NIL));
        setup_cb_link_method($REPAIR_AND_REATTEMPT, CB_LINK_REPAIR_AND_REATTEMPT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_REPAIR_AND_REATTEMPT);
        sethash($CB_AF, $cb_help_definitions$.getGlobalValue(), list($str_alt76$cb_af_html, NIL));
        sethash($CB_CHANGE_MT, $cb_help_definitions$.getGlobalValue(), list($str_alt115$cb_change_mt_html, NIL));
        html_macros.note_html_handler_function(CB_CHANGE_MT);
        html_macros.note_html_handler_function(CB_HANDLE_CHANGE_MT);
        setup_cb_link_method($CHANGE_MT, CB_LINK_CHANGE_MT, THREE_INTEGER);
        sethash($CB_CHANGE_STRENGTH, $cb_help_definitions$.getGlobalValue(), list($str_alt140$cb_change_strength_html, NIL));
        html_macros.note_html_handler_function(CB_CHANGE_STRENGTH);
        html_macros.note_html_handler_function(CB_HANDLE_CHANGE_STRENGTH);
        setup_cb_link_method($CHANGE_STRENGTH, CB_LINK_CHANGE_STRENGTH, THREE_INTEGER);
        sethash($CB_CHANGE_DIRECTION, $cb_help_definitions$.getGlobalValue(), list($str_alt162$cb_change_direction_html, NIL));
        html_macros.note_html_handler_function(CB_CHANGE_DIRECTION);
        html_macros.note_html_handler_function(CB_HANDLE_CHANGE_DIRECTION);
        setup_cb_link_method($CHANGE_DIRECTION, CB_LINK_CHANGE_DIRECTION, THREE_INTEGER);
        sethash($CB_CHANGE_META_ASSERTION_MT, $cb_help_definitions$.getGlobalValue(), list($str_alt186$cb_change_meta_assertion_mt_html, NIL));
        html_macros.note_html_handler_function(CB_CHANGE_META_ASSERTION_MT);
        html_macros.note_html_handler_function(CB_HANDLE_CHANGE_META_ASSERTION_MT);
        setup_cb_link_method($CHANGE_META_ASSERTION_MT, CB_LINK_CHANGE_META_ASSERTION_MT, THREE_INTEGER);
        sethash($CB_RENAME_VARIABLES, $cb_help_definitions$.getGlobalValue(), list($str_alt198$cb_rename_variables_html, NIL));
        html_macros.note_html_handler_function(CB_RENAME_VARIABLES);
        html_macros.note_html_handler_function(CB_HANDLE_RENAME_VARIABLES);
        setup_cb_link_method($RENAME_VARIABLES, CB_LINK_RENAME_VARIABLES, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_REPROPAGATE);
        setup_cb_link_method($REPROPAGATE, CB_LINK_REPROPAGATE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_REPROPAGATE_BROWSABLY);
        setup_cb_link_method($REPROPAGATE_BROWSABLY, CB_LINK_REPROPAGATE_BROWSABLY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_RECANONICALIZE);
        setup_cb_link_method($RECANONICALIZE, CB_LINK_RECANONICALIZE, THREE_INTEGER);
        sethash($CB_WFF, $cb_help_definitions$.getGlobalValue(), list($str_alt258$cb_wff_html, NIL));
        html_macros.note_html_handler_function(CB_WFF);
        setup_cb_link_method($WFF, CB_LINK_WFF, ONE_INTEGER);
        declare_cb_tool($WFF, $$$WFF_Check, $$$WFF, $str_alt271$Check_a_CycL_Expression_for_well_);
        html_macros.note_html_handler_function(CB_HANDLE_WFF);
        sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt32$cb_wff_check_formula_html, NIL));
        html_macros.note_html_handler_function(CB_ASSERT);
        html_macros.note_html_handler_function(CB_HANDLE_ASSERT);
        sethash($ASSERT, $cb_icon_definitions$.getGlobalValue(), list($str_alt288$assert_tool_gif, NIL));
        setup_cb_link_method($ASSERT, CB_LINK_ASSERT, ONE_INTEGER);
        declare_cb_tool($ASSERT, $$$Assert, $$$Asrt, $$$Assert_CycL_Expression);
        sethash($CB_ASSERT_INTERNAL, $cb_help_definitions$.getGlobalValue(), list($str_alt295$cb_assert_internal_html, NIL));
        html_macros.note_html_handler_function(CB_ASSERT_FORMULA);
        setup_cb_link_method($ASSERT_FORMULA, CB_LINK_ASSERT_FORMULA, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SIMILAR);
        setup_cb_link_method($ASSERT_SIMILAR, CB_LINK_ASSERT_SIMILAR, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_ASSERT_META);
        html_macros.note_html_handler_function(CB_HANDLE_ASSERT_META);
        setup_cb_link_method($ASSERT_META, CB_LINK_ASSERT_META, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_EDIT);
        html_macros.note_html_handler_function(CB_HANDLE_EDIT);
        setup_cb_link_method($EDIT_ASSERTION, CB_LINK_EDIT_ASSERTION, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SENTENCE_EDIT);
        html_macros.note_html_handler_function(CB_FIX_TYPO_EDIT);
        setup_cb_link_method($FIX_TYPO, CB_LINK_FIX_TYPO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_FIX_TYPO);
        html_macros.note_html_handler_function(CB_REASSERT);
        setup_cb_link_method($REASSERT, CB_LINK_REASSERT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UNASSERT);
        setup_cb_link_method($UNASSERT, CB_LINK_UNASSERT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_BLAST);
        setup_cb_link_method($BLAST, CB_LINK_BLAST, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_REMOVE_DEDUCTION);
        setup_cb_link_method($REMOVE_DEDUCTION, CB_LINK_REMOVE_DEDUCTION, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_ASSERTION_TMS);
        setup_cb_link_method($ASSERT_TMS, CB_LINK_ASSERT_TMS, THREE_INTEGER);
        sethash($CB_DIAGNOSE_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt417$cb_diagnose_assertion_html, NIL));
        html_macros.note_html_handler_function(CB_DIAGNOSE_ASSERTION);
        setup_cb_link_method($DIAGNOSE_ASSERTION, CB_LINK_DIAGNOSE_ASSERTION, TWO_INTEGER);
        register_html_state_variable($cb_proof_checker_rules$);
        html_macros.note_html_handler_function(CB_USE_IN_PROOF);
        setup_cb_link_method($USE_IN_PROOF, CB_LINK_USE_IN_PROOF, TWO_INTEGER);
        setup_cb_link_method($ASSERTION_GRAPH, CB_LINK_ASSERTION_GRAPH, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_ASSERTION_GRAPH);
        return NIL;
    }

    public static SubLObject setup_cb_assertion_editor_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), symbol_function(CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(ASSERTION_SPEC_SENTENCE, _CSETF_ASSERTION_SPEC_SENTENCE);
            def_csetf(ASSERTION_SPEC_MT, _CSETF_ASSERTION_SPEC_MT);
            def_csetf(ASSERTION_SPEC_STRENGTH, _CSETF_ASSERTION_SPEC_STRENGTH);
            def_csetf(ASSERTION_SPEC_DIRECTION, _CSETF_ASSERTION_SPEC_DIRECTION);
            def_csetf(ASSERTION_SPEC_UNASSERTS, _CSETF_ASSERTION_SPEC_UNASSERTS);
            def_csetf(ASSERTION_SPEC_METAS, _CSETF_ASSERTION_SPEC_METAS);
            identity(CB_ASSERTION_SPEC);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD));
            sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str38$cb_wff_check_formula_html, NIL));
            setup_cb_link_method($REPAIR_AND_REATTEMPT, CB_LINK_REPAIR_AND_REATTEMPT, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_REPAIR_AND_REATTEMPT, $HTML_HANDLER);
            sethash($CB_AF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str92$cb_af_html, NIL));
            sethash($CB_CHANGE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str132$cb_change_mt_html, NIL));
            html_macros.note_cgi_handler_function(CB_CHANGE_MT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_MT, $HTML_HANDLER);
            setup_cb_link_method($CHANGE_MT, CB_LINK_CHANGE_MT, THREE_INTEGER);
            sethash($CB_CHANGE_STRENGTH, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str158$cb_change_strength_html, NIL));
            html_macros.note_cgi_handler_function(CB_CHANGE_STRENGTH, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_STRENGTH, $HTML_HANDLER);
            setup_cb_link_method($CHANGE_STRENGTH, CB_LINK_CHANGE_STRENGTH, THREE_INTEGER);
            sethash($CB_CHANGE_DIRECTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str180$cb_change_direction_html, NIL));
            html_macros.note_cgi_handler_function(CB_CHANGE_DIRECTION, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_DIRECTION, $HTML_HANDLER);
            setup_cb_link_method($CHANGE_DIRECTION, CB_LINK_CHANGE_DIRECTION, THREE_INTEGER);
            sethash($CB_CHANGE_META_ASSERTION_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str205$cb_change_meta_assertion_mt_html, NIL));
            html_macros.note_cgi_handler_function(CB_CHANGE_META_ASSERTION_MT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_META_ASSERTION_MT, $HTML_HANDLER);
            setup_cb_link_method($CHANGE_META_ASSERTION_MT, CB_LINK_CHANGE_META_ASSERTION_MT, THREE_INTEGER);
            sethash($CB_RENAME_VARIABLES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str217$cb_rename_variables_html, NIL));
            html_macros.note_cgi_handler_function(CB_RENAME_VARIABLES, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_RENAME_VARIABLES, $HTML_HANDLER);
            setup_cb_link_method($RENAME_VARIABLES, CB_LINK_RENAME_VARIABLES, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_REPROPAGATE, $HTML_HANDLER);
            setup_cb_link_method($REPROPAGATE, CB_LINK_REPROPAGATE, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_REPROPAGATE_BROWSABLY, $HTML_HANDLER);
            setup_cb_link_method($REPROPAGATE_BROWSABLY, CB_LINK_REPROPAGATE_BROWSABLY, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_RECANONICALIZE, $HTML_HANDLER);
            setup_cb_link_method($RECANONICALIZE, CB_LINK_RECANONICALIZE, THREE_INTEGER);
            sethash($CB_WFF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str277$cb_wff_html, NIL));
            html_macros.note_cgi_handler_function(CB_WFF, $HTML_HANDLER);
            setup_cb_link_method($WFF, CB_LINK_WFF, ONE_INTEGER);
            declare_cb_tool($WFF, $$$WFF_Check, $$$WFF, $str290$Check_a_CycL_Expression_for_well_);
            html_macros.note_cgi_handler_function(CB_HANDLE_WFF, $HTML_HANDLER);
            sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str38$cb_wff_check_formula_html, NIL));
            html_macros.note_cgi_handler_function(CB_ASSERT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_ASSERT, $HTML_HANDLER);
            sethash($ASSERT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str307$assert_tool_gif, NIL));
            setup_cb_link_method($ASSERT, CB_LINK_ASSERT, ONE_INTEGER);
            declare_cb_tool($ASSERT, $$$Assert, $$$Asrt, $$$Assert_CycL_Expression);
            sethash($CB_ASSERT_INTERNAL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str314$cb_assert_internal_html, NIL));
            html_macros.note_cgi_handler_function(CB_ASSERT_FORMULA, $HTML_HANDLER);
            setup_cb_link_method($ASSERT_FORMULA, CB_LINK_ASSERT_FORMULA, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_SIMILAR, $HTML_HANDLER);
            setup_cb_link_method($ASSERT_SIMILAR, CB_LINK_ASSERT_SIMILAR, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERT_META, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_ASSERT_META, $HTML_HANDLER);
            setup_cb_link_method($ASSERT_META, CB_LINK_ASSERT_META, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_SUGGEST_PRAGMAS, $HTML_HANDLER);
            setup_cb_link_method($SUGGEST_PRAGMAS, CB_LINK_SUGGEST_PRAGMAS, FOUR_INTEGER);
            setup_cb_link_method($ASSERT_SUGGESTED_PRAGMA, CB_LINK_ASSERT_SUGGESTED_PRAGMA, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERT_SUGGESTED_PRAGMA, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_EDIT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_EDIT, $HTML_HANDLER);
            setup_cb_link_method($EDIT_ASSERTION, CB_LINK_EDIT_ASSERTION, FOUR_INTEGER);
            html_macros.note_cgi_handler_function(CB_HANDLE_EDIT_ASSERTION, $XML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_SENTENCE_EDIT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_FIX_TYPO_EDIT, $HTML_HANDLER);
            setup_cb_link_method($FIX_TYPO, CB_LINK_FIX_TYPO, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_HANDLE_FIX_TYPO, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_REASSERT, $HTML_HANDLER);
            setup_cb_link_method($REASSERT, CB_LINK_REASSERT, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_UNASSERT, $HTML_HANDLER);
            setup_cb_link_method($UNASSERT, CB_LINK_UNASSERT, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_BLAST, $HTML_HANDLER);
            setup_cb_link_method($BLAST, CB_LINK_BLAST, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_REMOVE_DEDUCTION, $HTML_HANDLER);
            setup_cb_link_method($REMOVE_DEDUCTION, CB_LINK_REMOVE_DEDUCTION, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERTION_TMS, $HTML_HANDLER);
            setup_cb_link_method($ASSERT_TMS, CB_LINK_ASSERT_TMS, THREE_INTEGER);
            sethash($CB_DIAGNOSE_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str470$cb_diagnose_assertion_html, NIL));
            html_macros.note_cgi_handler_function(CB_DIAGNOSE_ASSERTION, $HTML_HANDLER);
            setup_cb_link_method($DIAGNOSE_ASSERTION, CB_LINK_DIAGNOSE_ASSERTION, TWO_INTEGER);
            setup_cb_link_method($TRIGGER_TEST, CB_LINK_TRIGGER_TEST, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_TRIGGER_TEST, $HTML_HANDLER);
            register_html_state_variable($cb_proof_checker_rules$);
            html_macros.note_cgi_handler_function(CB_USE_IN_PROOF, $HTML_HANDLER);
            setup_cb_link_method($USE_IN_PROOF, CB_LINK_USE_IN_PROOF, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_REINFORCE_RULE, $HTML_HANDLER);
            setup_cb_link_method($REINFORCE_RULE, CB_LINK_REINFORCE_RULE, TWO_INTEGER);
            setup_cb_link_method($ASSERTION_GRAPH, CB_LINK_ASSERTION_GRAPH, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ASSERTION_GRAPH, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt32$cb_wff_check_formula_html, NIL));
            html_macros.note_html_handler_function(CB_REPAIR_AND_REATTEMPT);
            sethash($CB_AF, $cb_help_definitions$.getGlobalValue(), list($str_alt76$cb_af_html, NIL));
            sethash($CB_CHANGE_MT, $cb_help_definitions$.getGlobalValue(), list($str_alt115$cb_change_mt_html, NIL));
            html_macros.note_html_handler_function(CB_CHANGE_MT);
            html_macros.note_html_handler_function(CB_HANDLE_CHANGE_MT);
            sethash($CB_CHANGE_STRENGTH, $cb_help_definitions$.getGlobalValue(), list($str_alt140$cb_change_strength_html, NIL));
            html_macros.note_html_handler_function(CB_CHANGE_STRENGTH);
            html_macros.note_html_handler_function(CB_HANDLE_CHANGE_STRENGTH);
            sethash($CB_CHANGE_DIRECTION, $cb_help_definitions$.getGlobalValue(), list($str_alt162$cb_change_direction_html, NIL));
            html_macros.note_html_handler_function(CB_CHANGE_DIRECTION);
            html_macros.note_html_handler_function(CB_HANDLE_CHANGE_DIRECTION);
            sethash($CB_CHANGE_META_ASSERTION_MT, $cb_help_definitions$.getGlobalValue(), list($str_alt186$cb_change_meta_assertion_mt_html, NIL));
            html_macros.note_html_handler_function(CB_CHANGE_META_ASSERTION_MT);
            html_macros.note_html_handler_function(CB_HANDLE_CHANGE_META_ASSERTION_MT);
            sethash($CB_RENAME_VARIABLES, $cb_help_definitions$.getGlobalValue(), list($str_alt198$cb_rename_variables_html, NIL));
            html_macros.note_html_handler_function(CB_RENAME_VARIABLES);
            html_macros.note_html_handler_function(CB_HANDLE_RENAME_VARIABLES);
            html_macros.note_html_handler_function(CB_REPROPAGATE);
            html_macros.note_html_handler_function(CB_REPROPAGATE_BROWSABLY);
            html_macros.note_html_handler_function(CB_RECANONICALIZE);
            sethash($CB_WFF, $cb_help_definitions$.getGlobalValue(), list($str_alt258$cb_wff_html, NIL));
            html_macros.note_html_handler_function(CB_WFF);
            declare_cb_tool($WFF, $$$WFF_Check, $$$WFF, $str_alt271$Check_a_CycL_Expression_for_well_);
            html_macros.note_html_handler_function(CB_HANDLE_WFF);
            sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt32$cb_wff_check_formula_html, NIL));
            html_macros.note_html_handler_function(CB_ASSERT);
            html_macros.note_html_handler_function(CB_HANDLE_ASSERT);
            sethash($ASSERT, $cb_icon_definitions$.getGlobalValue(), list($str_alt288$assert_tool_gif, NIL));
            sethash($CB_ASSERT_INTERNAL, $cb_help_definitions$.getGlobalValue(), list($str_alt295$cb_assert_internal_html, NIL));
            html_macros.note_html_handler_function(CB_ASSERT_FORMULA);
            html_macros.note_html_handler_function(CB_SIMILAR);
            html_macros.note_html_handler_function(CB_ASSERT_META);
            html_macros.note_html_handler_function(CB_HANDLE_ASSERT_META);
            html_macros.note_html_handler_function(CB_EDIT);
            html_macros.note_html_handler_function(CB_HANDLE_EDIT);
            html_macros.note_html_handler_function(CB_HANDLE_SENTENCE_EDIT);
            html_macros.note_html_handler_function(CB_FIX_TYPO_EDIT);
            html_macros.note_html_handler_function(CB_HANDLE_FIX_TYPO);
            html_macros.note_html_handler_function(CB_REASSERT);
            html_macros.note_html_handler_function(CB_UNASSERT);
            html_macros.note_html_handler_function(CB_BLAST);
            html_macros.note_html_handler_function(CB_REMOVE_DEDUCTION);
            html_macros.note_html_handler_function(CB_ASSERTION_TMS);
            sethash($CB_DIAGNOSE_ASSERTION, $cb_help_definitions$.getGlobalValue(), list($str_alt417$cb_diagnose_assertion_html, NIL));
            html_macros.note_html_handler_function(CB_DIAGNOSE_ASSERTION);
            html_macros.note_html_handler_function(CB_USE_IN_PROOF);
            html_macros.note_html_handler_function(CB_ASSERTION_GRAPH);
        }
        return NIL;
    }

    public static SubLObject setup_cb_assertion_editor_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), symbol_function(CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(ASSERTION_SPEC_SENTENCE, _CSETF_ASSERTION_SPEC_SENTENCE);
        def_csetf(ASSERTION_SPEC_MT, _CSETF_ASSERTION_SPEC_MT);
        def_csetf(ASSERTION_SPEC_STRENGTH, _CSETF_ASSERTION_SPEC_STRENGTH);
        def_csetf(ASSERTION_SPEC_DIRECTION, _CSETF_ASSERTION_SPEC_DIRECTION);
        def_csetf(ASSERTION_SPEC_UNASSERTS, _CSETF_ASSERTION_SPEC_UNASSERTS);
        def_csetf(ASSERTION_SPEC_METAS, _CSETF_ASSERTION_SPEC_METAS);
        identity(CB_ASSERTION_SPEC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD));
        sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str38$cb_wff_check_formula_html, NIL));
        setup_cb_link_method($REPAIR_AND_REATTEMPT, CB_LINK_REPAIR_AND_REATTEMPT, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_REPAIR_AND_REATTEMPT, $HTML_HANDLER);
        sethash($CB_AF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str92$cb_af_html, NIL));
        sethash($CB_CHANGE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str132$cb_change_mt_html, NIL));
        html_macros.note_cgi_handler_function(CB_CHANGE_MT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_MT, $HTML_HANDLER);
        setup_cb_link_method($CHANGE_MT, CB_LINK_CHANGE_MT, THREE_INTEGER);
        sethash($CB_CHANGE_STRENGTH, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str158$cb_change_strength_html, NIL));
        html_macros.note_cgi_handler_function(CB_CHANGE_STRENGTH, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_STRENGTH, $HTML_HANDLER);
        setup_cb_link_method($CHANGE_STRENGTH, CB_LINK_CHANGE_STRENGTH, THREE_INTEGER);
        sethash($CB_CHANGE_DIRECTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str180$cb_change_direction_html, NIL));
        html_macros.note_cgi_handler_function(CB_CHANGE_DIRECTION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_DIRECTION, $HTML_HANDLER);
        setup_cb_link_method($CHANGE_DIRECTION, CB_LINK_CHANGE_DIRECTION, THREE_INTEGER);
        sethash($CB_CHANGE_META_ASSERTION_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str205$cb_change_meta_assertion_mt_html, NIL));
        html_macros.note_cgi_handler_function(CB_CHANGE_META_ASSERTION_MT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CHANGE_META_ASSERTION_MT, $HTML_HANDLER);
        setup_cb_link_method($CHANGE_META_ASSERTION_MT, CB_LINK_CHANGE_META_ASSERTION_MT, THREE_INTEGER);
        sethash($CB_RENAME_VARIABLES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str217$cb_rename_variables_html, NIL));
        html_macros.note_cgi_handler_function(CB_RENAME_VARIABLES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_RENAME_VARIABLES, $HTML_HANDLER);
        setup_cb_link_method($RENAME_VARIABLES, CB_LINK_RENAME_VARIABLES, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_REPROPAGATE, $HTML_HANDLER);
        setup_cb_link_method($REPROPAGATE, CB_LINK_REPROPAGATE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_REPROPAGATE_BROWSABLY, $HTML_HANDLER);
        setup_cb_link_method($REPROPAGATE_BROWSABLY, CB_LINK_REPROPAGATE_BROWSABLY, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_RECANONICALIZE, $HTML_HANDLER);
        setup_cb_link_method($RECANONICALIZE, CB_LINK_RECANONICALIZE, THREE_INTEGER);
        sethash($CB_WFF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str277$cb_wff_html, NIL));
        html_macros.note_cgi_handler_function(CB_WFF, $HTML_HANDLER);
        setup_cb_link_method($WFF, CB_LINK_WFF, ONE_INTEGER);
        declare_cb_tool($WFF, $$$WFF_Check, $$$WFF, $str290$Check_a_CycL_Expression_for_well_);
        html_macros.note_cgi_handler_function(CB_HANDLE_WFF, $HTML_HANDLER);
        sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str38$cb_wff_check_formula_html, NIL));
        html_macros.note_cgi_handler_function(CB_ASSERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_ASSERT, $HTML_HANDLER);
        sethash($ASSERT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str307$assert_tool_gif, NIL));
        setup_cb_link_method($ASSERT, CB_LINK_ASSERT, ONE_INTEGER);
        declare_cb_tool($ASSERT, $$$Assert, $$$Asrt, $$$Assert_CycL_Expression);
        sethash($CB_ASSERT_INTERNAL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str314$cb_assert_internal_html, NIL));
        html_macros.note_cgi_handler_function(CB_ASSERT_FORMULA, $HTML_HANDLER);
        setup_cb_link_method($ASSERT_FORMULA, CB_LINK_ASSERT_FORMULA, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SIMILAR, $HTML_HANDLER);
        setup_cb_link_method($ASSERT_SIMILAR, CB_LINK_ASSERT_SIMILAR, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERT_META, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_ASSERT_META, $HTML_HANDLER);
        setup_cb_link_method($ASSERT_META, CB_LINK_ASSERT_META, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SUGGEST_PRAGMAS, $HTML_HANDLER);
        setup_cb_link_method($SUGGEST_PRAGMAS, CB_LINK_SUGGEST_PRAGMAS, FOUR_INTEGER);
        setup_cb_link_method($ASSERT_SUGGESTED_PRAGMA, CB_LINK_ASSERT_SUGGESTED_PRAGMA, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERT_SUGGESTED_PRAGMA, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_EDIT, $HTML_HANDLER);
        setup_cb_link_method($EDIT_ASSERTION, CB_LINK_EDIT_ASSERTION, FOUR_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_EDIT_ASSERTION, $XML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_SENTENCE_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FIX_TYPO_EDIT, $HTML_HANDLER);
        setup_cb_link_method($FIX_TYPO, CB_LINK_FIX_TYPO, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_FIX_TYPO, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_REASSERT, $HTML_HANDLER);
        setup_cb_link_method($REASSERT, CB_LINK_REASSERT, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_UNASSERT, $HTML_HANDLER);
        setup_cb_link_method($UNASSERT, CB_LINK_UNASSERT, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_BLAST, $HTML_HANDLER);
        setup_cb_link_method($BLAST, CB_LINK_BLAST, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_REMOVE_DEDUCTION, $HTML_HANDLER);
        setup_cb_link_method($REMOVE_DEDUCTION, CB_LINK_REMOVE_DEDUCTION, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_TMS, $HTML_HANDLER);
        setup_cb_link_method($ASSERT_TMS, CB_LINK_ASSERT_TMS, THREE_INTEGER);
        sethash($CB_DIAGNOSE_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str470$cb_diagnose_assertion_html, NIL));
        html_macros.note_cgi_handler_function(CB_DIAGNOSE_ASSERTION, $HTML_HANDLER);
        setup_cb_link_method($DIAGNOSE_ASSERTION, CB_LINK_DIAGNOSE_ASSERTION, TWO_INTEGER);
        setup_cb_link_method($TRIGGER_TEST, CB_LINK_TRIGGER_TEST, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TRIGGER_TEST, $HTML_HANDLER);
        register_html_state_variable($cb_proof_checker_rules$);
        html_macros.note_cgi_handler_function(CB_USE_IN_PROOF, $HTML_HANDLER);
        setup_cb_link_method($USE_IN_PROOF, CB_LINK_USE_IN_PROOF, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_REINFORCE_RULE, $HTML_HANDLER);
        setup_cb_link_method($REINFORCE_RULE, CB_LINK_REINFORCE_RULE, TWO_INTEGER);
        setup_cb_link_method($ASSERTION_GRAPH, CB_LINK_ASSERTION_GRAPH, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_GRAPH, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_assertion_editor_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_assertion_editor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_assertion_editor_file();
    }

    static {
    }

    public static final class $cb_assertion_spec_native extends SubLStructNative {
        public SubLObject $sentence;

        public SubLObject $mt;

        public SubLObject $strength;

        public SubLObject $direction;

        public SubLObject $unasserts;

        public SubLObject $metas;

        private static final SubLStructDeclNative structDecl;

        public $cb_assertion_spec_native() {
            cb_assertion_editor.$cb_assertion_spec_native.this.$sentence = Lisp.NIL;
            cb_assertion_editor.$cb_assertion_spec_native.this.$mt = Lisp.NIL;
            cb_assertion_editor.$cb_assertion_spec_native.this.$strength = Lisp.NIL;
            cb_assertion_editor.$cb_assertion_spec_native.this.$direction = Lisp.NIL;
            cb_assertion_editor.$cb_assertion_spec_native.this.$unasserts = Lisp.NIL;
            cb_assertion_editor.$cb_assertion_spec_native.this.$metas = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$sentence;
        }

        @Override
        public SubLObject getField3() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$strength;
        }

        @Override
        public SubLObject getField5() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$direction;
        }

        @Override
        public SubLObject getField6() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$unasserts;
        }

        @Override
        public SubLObject getField7() {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$metas;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$sentence = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$strength = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$direction = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$unasserts = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return cb_assertion_editor.$cb_assertion_spec_native.this.$metas = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cb_assertion_editor.$cb_assertion_spec_native.class, CB_ASSERTION_SPEC, CB_ASSERTION_SPEC_P, $list3, $list4, new String[]{ "$sentence", "$mt", "$strength", "$direction", "$unasserts", "$metas" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cb_assertion_spec_p$UnaryFunction extends UnaryFunction {
        public $cb_assertion_spec_p$UnaryFunction() {
            super(extractFunctionNamed("CB-ASSERTION-SPEC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cb_assertion_spec_p(arg1);
        }
    }
}

/**
 * Total time: 3893 ms synthetic
 */
