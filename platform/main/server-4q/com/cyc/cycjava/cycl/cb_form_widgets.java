/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_hlmt_input_width$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_js_sentence_editor_enabled$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_show_cyclify_button$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_date;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_time_parameter;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_display_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_time_interval_display_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_time_parameter_display_string;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_gather;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-FORM-WIDGETS
 * source file: /cyc/top/cycl/cb-form-widgets.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_form_widgets extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @unknown T when any el sentence input should use
    the Java applet CycL editor.
     */
    @LispMethod(comment = "@unknown T when any el sentence input should use\r\nthe Java applet CycL editor.")
    public static final SubLObject use_gke_for_el_sentence_editing() {
        return NIL;
    }

    public static final SubLObject new_el_sentence_error(SubLObject error_type) {
        return list($EL_SENTENCE_ERROR, error_type);
    }

    public static final SubLObject cb_show_sentence_error_page(SubLObject title_string, SubLObject error_showing_func, SubLObject error_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title_string);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_string);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                funcall(error_showing_func, error_string);
                                cb_back_button(UNPROVIDED, UNPROVIDED);
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
            return NIL;
        }
    }

    /**
     * Display an input section suitable for inputting an EL sentence specification in a form.
     * If non-nil, SENTENCE is the EL sentence with which to begin editing.
     * DISPLAY-OPTIONS is a plist with the following optional properties :
     * :INPUT-NAME     ; <stringp>
     * :COMPLETE-LABEL ; <stringp>
     * :CHOICES        ; <list of constant-p>
     * :PRETTY-NAME    ; <stringp>
     * :CYCLIFY-LABEL  ; <stringp>
     * :CLEAR-LABEL    ; <stringp>
     * :WIDTH          ; <non-negative-integer-p>
     * :HEIGHT         ; <non-negative-integer-p>
     */
    @LispMethod(comment = "Display an input section suitable for inputting an EL sentence specification in a form.\r\nIf non-nil, SENTENCE is the EL sentence with which to begin editing.\r\nDISPLAY-OPTIONS is a plist with the following optional properties :\r\n:INPUT-NAME     ; <stringp>\r\n:COMPLETE-LABEL ; <stringp>\r\n:CHOICES        ; <list of constant-p>\r\n:PRETTY-NAME    ; <stringp>\r\n:CYCLIFY-LABEL  ; <stringp>\r\n:CLEAR-LABEL    ; <stringp>\r\n:WIDTH          ; <non-negative-integer-p>\r\n:HEIGHT         ; <non-negative-integer-p>\nDisplay an input section suitable for inputting an EL sentence specification in a form.\nIf non-nil, SENTENCE is the EL sentence with which to begin editing.\nDISPLAY-OPTIONS is a plist with the following optional properties :\n:INPUT-NAME     ; <stringp>\n:COMPLETE-LABEL ; <stringp>\n:CHOICES        ; <list of constant-p>\n:PRETTY-NAME    ; <stringp>\n:CYCLIFY-LABEL  ; <stringp>\n:CLEAR-LABEL    ; <stringp>\n:WIDTH          ; <non-negative-integer-p>\n:HEIGHT         ; <non-negative-integer-p>")
    public static final SubLObject cb_el_sentence_input_section_html(SubLObject sentence, SubLObject display_options) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_35 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt94);
                    current_35 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt94);
                    if (NIL == member(current_35, $list_alt95, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_35 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt94);
                }
                {
                    SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                    SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_sentence_input_default_name$.getGlobalValue();
                    SubLObject complete_label_tail = property_list_member($COMPLETE_LABEL, current);
                    SubLObject complete_label = (NIL != complete_label_tail) ? ((SubLObject) (cadr(complete_label_tail))) : $$$Complete;
                    SubLObject choices_tail = property_list_member($CHOICES, current);
                    SubLObject choices = (NIL != choices_tail) ? ((SubLObject) (cadr(choices_tail))) : NIL;
                    SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, current);
                    SubLObject pretty_name = (NIL != pretty_name_tail) ? ((SubLObject) (cadr(pretty_name_tail))) : $$$EL_Sentence;
                    SubLObject clear_label_tail = property_list_member($CLEAR_LABEL, current);
                    SubLObject clear_label = (NIL != clear_label_tail) ? ((SubLObject) (cadr(clear_label_tail))) : $$$Clear_Sentence;
                    SubLObject cyclify_label_tail = property_list_member($CYCLIFY_LABEL, current);
                    SubLObject cyclify_label = (NIL != cyclify_label_tail) ? ((SubLObject) (cadr(cyclify_label_tail))) : NIL;
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $int$80;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : TWENTY_INTEGER;
                    SubLTrampolineFile.checkType(input_name, STRINGP);
                    SubLTrampolineFile.checkType(width, POSITIVE_INTEGER_P);
                    SubLTrampolineFile.checkType(height, POSITIVE_INTEGER_P);
                    if (NIL != complete_label) {
                        SubLTrampolineFile.checkType(complete_label, STRINGP);
                    }
                    {
                        SubLObject list_var = choices;
                        SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                        {
                            SubLObject cdolist_list_var = list_var;
                            SubLObject elem = NIL;
                            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                                SubLTrampolineFile.checkType(elem, CONSTANT_P);
                            }
                        }
                    }
                    if (NIL != pretty_name) {
                        SubLTrampolineFile.checkType(pretty_name, STRINGP);
                    }
                    if (NIL != cyclify_label) {
                        SubLTrampolineFile.checkType(cyclify_label, STRINGP);
                    }
                    if (NIL != clear_label) {
                        SubLTrampolineFile.checkType(clear_label, STRINGP);
                    }
                    if ((((NIL != complete_label) || (NIL != pretty_name)) || (NIL != cyclify_label)) || (NIL != clear_label)) {
                        if (NIL != complete_label) {
                            html_complete.html_complete_button(input_name, complete_label, NIL, NIL, NIL, choices);
                            html_indent(ONE_INTEGER);
                        }
                        if (NIL != pretty_name) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(pretty_name);
                            html_princ($str_alt92$__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        if ((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) {
                            html_indent(ONE_INTEGER);
                            html_complete.html_cyclify_button(input_name, cyclify_label);
                        }
                        if (NIL != clear_label) {
                            html_indent(FOUR_INTEGER);
                            html_script_utilities.html_clear_input_button(input_name, clear_label);
                        }
                        html_newline(UNPROVIDED);
                    }
                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(input_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != width) {
                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != height) {
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(height);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$virtual);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != sentence) {
                                html_princ(format_cycl_expression.format_cycl_expression_to_string(sentence, ZERO_INTEGER));
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_el_sentence_input_section_gke(SubLObject sentence, SubLObject display_options) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            SubLObject datum = display_options;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_34 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt77);
                current_34 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt77);
                if (NIL == member(current_34, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_34 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt77);
            }
            {
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_sentence_input_default_name$.getGlobalValue();
                SubLObject complete_label_tail = property_list_member($COMPLETE_LABEL, current);
                SubLObject complete_label = (NIL != complete_label_tail) ? ((SubLObject) (cadr(complete_label_tail))) : $$$Complete;
                SubLObject choices_tail = property_list_member($CHOICES, current);
                SubLObject choices = (NIL != choices_tail) ? ((SubLObject) (cadr(choices_tail))) : NIL;
                SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, current);
                SubLObject pretty_name = (NIL != pretty_name_tail) ? ((SubLObject) (cadr(pretty_name_tail))) : $$$EL_Sentence;
                SubLObject clear_label_tail = property_list_member($CLEAR_LABEL, current);
                SubLObject clear_label = (NIL != clear_label_tail) ? ((SubLObject) (cadr(clear_label_tail))) : $$$Clear_Sentence;
                SubLObject cyclify_label_tail = property_list_member($CYCLIFY_LABEL, current);
                SubLObject cyclify_label = (NIL != cyclify_label_tail) ? ((SubLObject) (cadr(cyclify_label_tail))) : NIL;
                SubLObject domain_mt_tail = property_list_member($DOMAIN_MT, current);
                SubLObject domain_mt = (NIL != domain_mt_tail) ? ((SubLObject) (cadr(domain_mt_tail))) : $$InferencePSC;
                SubLObject width_tail = property_list_member($WIDTH, current);
                SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $int$80;
                SubLObject height_tail = property_list_member($HEIGHT, current);
                SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : TWENTY_INTEGER;
                if (NIL != pretty_name) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(pretty_name);
                    html_princ($str_alt92$__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                }
		com.cyc.cycjava.cycl.cb_gke2_applet.cb_gke2_applet(sentence, domain_mt, $UNCONSTRAINED_CYCL, input_name, UNPROVIDED);
            }
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$ = makeString("");

    /**
     * The default input name used for EL sentence input sections.
     */
    // deflexical
    @LispMethod(comment = "The default input name used for EL sentence input sections.\ndeflexical")
    private static final SubLSymbol $cb_el_sentence_input_default_name$ = makeSymbol("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*");

    public static final SubLFile me = new cb_form_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.cb_form_widgets";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $legacy_sentence_editor_class$ = makeSymbol("*LEGACY-SENTENCE-EDITOR-CLASS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $sentence_editor_textarea_class$ = makeSymbol("*SENTENCE-EDITOR-TEXTAREA-CLASS*");



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ke_text_code_editor_textarea_class$ = makeSymbol("*KE-TEXT-CODE-EDITOR-TEXTAREA-CLASS*");



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $subl_code_editor_textarea_class$ = makeSymbol("*SUBL-CODE-EDITOR-TEXTAREA-CLASS*");



    // deflexical
    /**
     * The default input name used as a prefix for all MT pieces in an mt input
     * section.
     */
    @LispMethod(comment = "The default input name used as a prefix for all MT pieces in an mt input\r\nsection.\ndeflexical\nThe default input name used as a prefix for all MT pieces in an mt input\nsection.")
    private static final SubLSymbol $cb_mt_input_default_name$ = makeSymbol("*CB-MT-INPUT-DEFAULT-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_el_formula_input_default_name$ = makeSymbol("*CB-EL-FORMULA-INPUT-DEFAULT-NAME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $codemirror_editor_start_script$ = makeSymbol("*CODEMIRROR-EDITOR-START-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $utf8_nbsp$ = makeSymbol("*UTF8-NBSP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $return_string$ = makeSymbol("*RETURN-STRING*");

    // deflexical
    // The default input name used for EL term input sections.
    /**
     * The default input name used for EL term input sections.
     */
    @LispMethod(comment = "The default input name used for EL term input sections.\ndeflexical")
    private static final SubLSymbol $cb_el_term_input_default_name$ = makeSymbol("*CB-EL-TERM-INPUT-DEFAULT-NAME*");

    private static final SubLString $$$legacySentenceEditor = makeString("legacySentenceEditor");

    private static final SubLString $$$CycLEditorArea = makeString("CycLEditorArea");

    public static final SubLSymbol $cb_use_codemirror_sentence_editorP$ = makeSymbol("*CB-USE-CODEMIRROR-SENTENCE-EDITOR?*");

    private static final SubLString $$$KETextEditorArea = makeString("KETextEditorArea");

    public static final SubLSymbol $cb_use_ke_text_editorP$ = makeSymbol("*CB-USE-KE-TEXT-EDITOR?*");

    private static final SubLString $$$SubLEditorArea = makeString("SubLEditorArea");

    public static final SubLSymbol $cb_use_subl_code_editorP$ = makeSymbol("*CB-USE-SUBL-CODE-EDITOR?*");

    private static final SubLString $str7$ = makeString("");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $str10$_A_monad_dimension_specified = makeString("~A-monad-dimension-specified");

    private static final SubLSymbol $kw11$EDIT_ALLOWED_ = makeKeyword("EDIT-ALLOWED?");

    private static final SubLString $$$Complete = makeString("Complete");



    private static final SubLString $str16$Mt___ = makeString("Mt : ");

    private static final SubLString $$$Clear_Mt = makeString("Clear Mt");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$Monad_Dimension = makeString("Monad Dimension");

    private static final SubLString $str23$Monad_Mt___ = makeString("Monad Mt : ");

    private static final SubLString $str24$autocomplete_ = makeString("autocomplete-");

    private static final SubLString $str25$input_ = makeString("input-");

    private static final SubLString $str26$autocomplete_results_ = makeString("autocomplete-results-");

    private static final SubLString $str27$yui_ac = makeString("yui-ac");

    private static final SubLString $str28$position_static = makeString("position:static");

    private static final SubLString $str29$yui_ac_input = makeString("yui-ac-input");

    private static final SubLString $str30$yui_ac_container = makeString("yui-ac-container");

    private static final SubLString $str31$_A_monad = makeString("~A-monad");

    private static final SubLString $str32$_A_time_dimension_specified = makeString("~A-time-dimension-specified");

    private static final SubLSymbol $kw33$ANYTIME_PSC_ALLOWED_ = makeKeyword("ANYTIME-PSC-ALLOWED?");

    private static final SubLString $$$na = makeString("na");

    private static final SubLString $$$Time_Dimension = makeString("Time Dimension");

    private static final SubLList $list36 = list(reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("Now"), reader_make_constant_shell("Now-Indexical"));



    private static final SubLString $$$Time_ = makeString("Time ");

    private static final SubLString $str39$Interval___ = makeString("Interval : ");

    private static final SubLString $$$Clear_Interval = makeString("Clear Interval");

    private static final SubLString $str41$_A_time_interval = makeString("~A-time-interval");

    static private final SubLList $list42 = list(reader_make_constant_shell("Null-TimeParameter"), reader_make_constant_shell("TimePoint"));



    private static final SubLString $str44$Parameter___ = makeString("Parameter : ");

    private static final SubLString $$$Clear_Parameter = makeString("Clear Parameter");

    private static final SubLString $str46$_A_time_parameter = makeString("~A-time-parameter");

    private static final SubLSymbol $kw47$ALLOW_VARIABLE_ = makeKeyword("ALLOW-VARIABLE?");



    private static final SubLList $list55 = list(makeSymbol("MT-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("PART-TYPE"));

    private static final SubLString $str57$No_microtheory_was_specified_ = makeString("No microtheory was specified.");

    private static final SubLString $str59$No_monadic_microtheory_was_specif = makeString("No monadic microtheory was specified.");

    private static final SubLString $str60$No_microtheory_time_dimension_was = makeString("No microtheory time dimension was specified.");

    private static final SubLString $str61$No_microtheory_time_interval_was_ = makeString("No microtheory time interval was specified.");

    private static final SubLString $str62$No_microtheory_time_parameter_was = makeString("No microtheory time parameter was specified.");

    private static final SubLString $str63$The_MT_part__A_was_not_specified_ = makeString("The MT part ~A was not specified.");

    private static final SubLString $str65$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a microtheory.");

    private static final SubLString $str66$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a microtheory time dimension.");

    private static final SubLString $str67$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a time interval.");

    private static final SubLString $str68$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a time parameter.");

    private static final SubLString $str69$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense for MT part ~A.");

    private static final SubLString $str71$Unmatched_Parentheses_in_microthe = makeString("Unmatched Parentheses in microtheory ~S.");

    private static final SubLString $str72$Unmatched_Parentheses_in_microthe = makeString("Unmatched Parentheses in microtheory time dimension ~S.");

    private static final SubLString $str73$Unmatched_Parentheses_in_time_int = makeString("Unmatched Parentheses in time interval ~S.");

    private static final SubLString $str74$Unmatched_Parentheses_in_time_par = makeString("Unmatched Parentheses in time parameter ~S.");

    private static final SubLString $str75$Unmatched_Parentheses_in_mt_part_ = makeString("Unmatched Parentheses in mt part ~S.");

    private static final SubLString $str77$MT_parts__S_were_unspecified_ = makeString("MT parts ~S were unspecified.");

    private static final SubLString $str79$_S_did_not_specify_a_monadic_micr = makeString("~S did not specify a monadic microtheory.");

    private static final SubLString $str80$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory.");

    private static final SubLString $str81$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory time dimension.");

    private static final SubLSymbol $NON_TIME_INTERVAL = makeKeyword("NON-TIME-INTERVAL");

    private static final SubLString $str83$_S_did_not_specify_a_time_interva = makeString("~S did not specify a time interval.");

    private static final SubLSymbol $NON_TIME_PARAMETER = makeKeyword("NON-TIME-PARAMETER");

    private static final SubLString $str85$_S_did_not_specify_a_time_paramet = makeString("~S did not specify a time parameter.");

    private static final SubLString $str86$_S_did_not_specify_a_term_suitabl = makeString("~S did not specify a term suitable for MT part ~A.");

    private static final SubLString $str87$MT_ERROR__S____S__S__S = makeString("MT ERROR ~S : ~S ~S ~S");

    private static final SubLString $str88$_S____S = makeString("~S : ~S");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLList $list90 = list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-FORMULA-INPUT-DEFAULT-NAME*")), list(makeSymbol("COMPLETE-LABEL"), makeString("Complete")), makeSymbol("CHOICES"), list(makeSymbol("PRETTY-NAME"), makeString("EL Sentence")), list(makeSymbol("CLEAR-LABEL"), makeString("Clear Sentence")), makeSymbol("CYCLIFY-LABEL"), list(makeSymbol("WIDTH"), makeInteger(80)), list(makeSymbol("HEIGHT"), TWENTY_INTEGER), list(makeSymbol("MODE"), makeKeyword("ASSERT")) });

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeKeyword("COMPLETE-LABEL"), makeKeyword("CHOICES"), makeKeyword("PRETTY-NAME"), makeKeyword("CLEAR-LABEL"), makeKeyword("CYCLIFY-LABEL"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), $MODE });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$EL_Sentence = makeString("EL Sentence");

    private static final SubLString $$$Clear_Sentence = makeString("Clear Sentence");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str109$__ = makeString(" :");

    private static final SubLSymbol UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");

    private static final SubLSymbol CYCL_STRING_TO_UTF8_STRING = makeSymbol("CYCL-STRING-TO-UTF8-STRING");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $str115$_script_Event_onDOMReady_function = makeString("<script>Event.onDOMReady(function() {setupSentenceEditor(~S, ~S, ~S, ~A);});</script>");

    private static final SubLString $str116$var_options____________var_editor = makeString("var options = {};\n     var editor = CycCodeEditor.fromTextArea(document.getElementById(~S), options);");

    private static final SubLSymbol $HTML_EDITOR_SCRIPTS = makeKeyword("HTML-EDITOR-SCRIPTS");

    private static final SubLString $$$javascript = makeString("javascript");

    private static final SubLSymbol $kw119$REQUIRE_SENTENCE_ = makeKeyword("REQUIRE-SENTENCE?");

    private static final SubLList $list120 = list(makeSymbol("&KEY"), list(makeSymbol("REQUIRED?"), T), list(makeSymbol("REQUIRE-SENTENCE?"), NIL), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-FORMULA-INPUT-DEFAULT-NAME*")), list(makeSymbol("AUTO-CYCLIFY"), T));

    private static final SubLList $list121 = list(makeKeyword("REQUIRED?"), makeKeyword("REQUIRE-SENTENCE?"), makeKeyword("INPUT-NAME"), makeKeyword("AUTO-CYCLIFY"));

    private static final SubLSymbol CB_EXTRACT_QUERY_FORMULA_FROM_STRING = makeSymbol("CB-EXTRACT-QUERY-FORMULA-FROM-STRING");

    private static final SubLList $list125 = list(makeSymbol("CB-EXTRACT-EL-FORMULA-INPUT"));

    private static final SubLString $str126$Bad_formula__probably_due_to_a_mi = makeString("Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~S");

    private static final SubLSymbol SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

    private static final SubLSymbol $SYMBOLS_FOR_INVALID_CONSTANTS = makeKeyword("SYMBOLS-FOR-INVALID-CONSTANTS");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLList $list136 = list(makeString("\""));

    private static final SubLString $str137$_ = makeString("\"");

    private static final SubLObject $ic138 = vector(new SubLObject[]{ makeInteger(160) });

    private static final SubLString $str139$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list141 = list(makeKeyword("EL-FORMULA-ERROR"), makeKeyword("EL-SENTENCE-ERROR"));

    private static final SubLSymbol EL_FORMULA_ERROR_P = makeSymbol("EL-FORMULA-ERROR-P");

    private static final SubLList $list144 = list(makeSymbol("EL-FORMULA-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"));

    private static final SubLString $$$No_sentence_was_specified_in_ = makeString("No sentence was specified in ");

    private static final SubLString $str146$_ = makeString(".");

    private static final SubLString $str147$No_sentence_was_specified_ = makeString("No sentence was specified.");

    private static final SubLString $str148$_A = makeString("~A");

    private static final SubLString $$$Invalid_Constant_References_in_ = makeString("Invalid Constant References in ");

    private static final SubLString $$$Invalid_Constant_References = makeString("Invalid Constant References");

    private static final SubLSymbol CB_SHOW_INVALID_CONSTANTS = makeSymbol("CB-SHOW-INVALID-CONSTANTS");

    private static final SubLString $$$Unmatched_Parentheses_in_ = makeString("Unmatched Parentheses in ");

    private static final SubLString $$$Unmatched_Parentheses = makeString("Unmatched Parentheses");

    private static final SubLSymbol CB_SHOW_UNMATCHED_PARENTHESES = makeSymbol("CB-SHOW-UNMATCHED-PARENTHESES");

    private static final SubLString $$$Unfinished_Formula_in_ = makeString("Unfinished Formula in ");

    private static final SubLString $$$Unfinished_Formula = makeString("Unfinished Formula");

    private static final SubLSymbol CB_SHOW_EOF_EXPLANATION = makeSymbol("CB-SHOW-EOF-EXPLANATION");

    private static final SubLString $$$Unreadable_Formula_in_ = makeString("Unreadable Formula in ");

    private static final SubLString $$$Unreadable_Formula = makeString("Unreadable Formula");

    private static final SubLSymbol CB_SHOW_READER_ERROR_EXPLANATION = makeSymbol("CB-SHOW-READER-ERROR-EXPLANATION");

    private static final SubLSymbol CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS = makeSymbol("CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS");

    private static final SubLString $$$Not_a_Sentence_in_ = makeString("Not a Sentence in ");

    private static final SubLString $$$Not_a_Sentence = makeString("Not a Sentence");

    private static final SubLSymbol CB_SHOW_NON_SENTENCE_EXPLANATION = makeSymbol("CB-SHOW-NON-SENTENCE-EXPLANATION");

    private static final SubLSymbol $EL_FORMULA_ERROR = makeKeyword("EL-FORMULA-ERROR");

    private static final SubLString $str166$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str167$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$term = makeString("term");

    private static final SubLString $$$Clear_Term = makeString("Clear Term");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $$$completeContainer = makeString("completeContainer");

    private static final SubLString $$$textArea = makeString("textArea");

    private static final SubLString $str174$width__ = makeString("width: ");

    private static final SubLString $str175$px_ = makeString("px;");

    private static final SubLString $str176$px__position_static = makeString("px; position:static");

    private static final SubLString $$$autocomplete = makeString("autocomplete");

    private static final SubLString $$$cycAutocompleteContainer = makeString("cycAutocompleteContainer");

    private static final SubLList $list179 = list(makeSymbol("&KEY"), list(makeSymbol("REQUIRED?"), T), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-TERM-INPUT-DEFAULT-NAME*")), list(makeSymbol("AUTO-CYCLIFY"), T));

    private static final SubLList $list180 = list(makeKeyword("REQUIRED?"), makeKeyword("INPUT-NAME"), makeKeyword("AUTO-CYCLIFY"));

    private static final SubLSymbol $EL_TERM_ERROR = makeKeyword("EL-TERM-ERROR");

    private static final SubLSymbol EL_TERM_ERROR_P = makeSymbol("EL-TERM-ERROR-P");

    private static final SubLList $list183 = list(makeSymbol("EL-TERM-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"));

    private static final SubLString $$$No_term_was_specified_in_ = makeString("No term was specified in ");

    private static final SubLString $str185$No_term_was_specified_ = makeString("No term was specified.");

    private static final SubLString $$$Unfinished_Term_in_ = makeString("Unfinished Term in ");

    private static final SubLString $$$Unfinished_Term = makeString("Unfinished Term");

    private static final SubLString $$$Unreadable_Term_in_ = makeString("Unreadable Term in ");

    private static final SubLString $$$Unreadable_Term = makeString("Unreadable Term");

    private static final SubLSymbol CB_CONVERT_STRINGS_TO_CYCL = makeSymbol("CB-CONVERT-STRINGS-TO-CYCL");

    private static final SubLList $list197 = list(list(list(list(reader_make_constant_shell("nameString"), reader_make_constant_shell("CityOfBeijingChina"), makeString("&#21271;&#20140;&#24066;"))), list(reader_make_constant_shell("nameString"), reader_make_constant_shell("CityOfBeijingChina"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u5317;&u4EAC;&u5E02;")))), list(list(list(reader_make_constant_shell("nameString"), reader_make_constant_shell("CityOfBeijingChina"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u5317;&u4eac;&u5e02;")))), list(reader_make_constant_shell("nameString"), reader_make_constant_shell("CityOfBeijingChina"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u5317;&u4EAC;&u5E02;")))), list(list(list(reader_make_constant_shell("nameString"), reader_make_constant_shell("Thing"), makeString("The Big Thing"))), list(reader_make_constant_shell("nameString"), reader_make_constant_shell("Thing"), makeString("The Big Thing"))), list(list(list(reader_make_constant_shell("nameString"), reader_make_constant_shell("Thing"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("The Big Thing")))), list(reader_make_constant_shell("nameString"), reader_make_constant_shell("Thing"), makeString("The Big Thing"))), list(list(list(reader_make_constant_shell("mathRenderAs"), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u2260;")))), list(reader_make_constant_shell("mathRenderAs"), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u2260;")))), list(list(list(reader_make_constant_shell("mathRenderAs"), reader_make_constant_shell("InfixTimesFn"), makeString("&ne;"))), list(reader_make_constant_shell("mathRenderAs"), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u2260;")))), list(list(list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u2260;"))), list(reader_make_constant_shell("UnicodeStringFn"), makeString("&u2260;"))));

    // Definitions
    public static final SubLObject cb_monad_mt_display_string_alt(SubLObject monad_mt) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        return NIL != monad_mt ? ((SubLObject) (cb_term_display_string(monad_mt))) : $str_alt0$;
    }

    // Definitions
    public static SubLObject cb_monad_mt_display_string(SubLObject monad_mt) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        return NIL != monad_mt ? cb_term_display_string(monad_mt) : $str7$;
    }

    /**
     * Display an input section suitable for inputting an MT in a form.
     * MT, if provided, is used to specify the intitial values for the section.
     * DISPLAY-OPTIONS is a plist with the following optional properties :
     * :EDIT-ALLOWED?             ; <boolean>, default T
     * :INPUT-NAME                ; <stringp>
     * :MONAD-CHOICES             ; <list of constant-p>
     */
    @LispMethod(comment = "Display an input section suitable for inputting an MT in a form.\r\nMT, if provided, is used to specify the intitial values for the section.\r\nDISPLAY-OPTIONS is a plist with the following optional properties :\r\n:EDIT-ALLOWED?             ; <boolean>, default T\r\n:INPUT-NAME                ; <stringp>\r\n:MONAD-CHOICES             ; <list of constant-p>\nDisplay an input section suitable for inputting an MT in a form.\nMT, if provided, is used to specify the intitial values for the section.\nDISPLAY-OPTIONS is a plist with the following optional properties :\n:EDIT-ALLOWED?             ; <boolean>, default T\n:INPUT-NAME                ; <stringp>\n:MONAD-CHOICES             ; <list of constant-p>")
    public static final SubLObject cb_mt_input_section_alt(SubLObject mt, SubLObject display_options) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
                SubLObject time_mt = hlmt.hlmt_temporal_mt(mt);
                if (NIL != hlmt.hlmts_supportedP()) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_monad_dimension_section(monad_mt, display_options);
                            com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_time_dimension_section(time_mt, display_options);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } else {
                    com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_monad_mt_section(monad_mt, display_options);
                }
            }
            return NIL;
        }
    }

    /**
     * Display an input section suitable for inputting an MT in a form.
     * MT, if provided, is used to specify the intitial values for the section.
     * DISPLAY-OPTIONS is a plist with the following optional properties :
     * :EDIT-ALLOWED?             ; <boolean>, default T
     * :INPUT-NAME                ; <stringp>
     * :MONAD-CHOICES             ; <list of constant-p>
     */
    @LispMethod(comment = "Display an input section suitable for inputting an MT in a form.\r\nMT, if provided, is used to specify the intitial values for the section.\r\nDISPLAY-OPTIONS is a plist with the following optional properties :\r\n:EDIT-ALLOWED?             ; <boolean>, default T\r\n:INPUT-NAME                ; <stringp>\r\n:MONAD-CHOICES             ; <list of constant-p>\nDisplay an input section suitable for inputting an MT in a form.\nMT, if provided, is used to specify the intitial values for the section.\nDISPLAY-OPTIONS is a plist with the following optional properties :\n:EDIT-ALLOWED?             ; <boolean>, default T\n:INPUT-NAME                ; <stringp>\n:MONAD-CHOICES             ; <list of constant-p>")
    public static SubLObject cb_mt_input_section(SubLObject mt, SubLObject display_options) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        final SubLObject time_mt = hlmt.hlmt_temporal_mt(mt);
        if (NIL != hlmt.hlmts_supportedP()) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_mt_input_monad_dimension_section(monad_mt, display_options);
                cb_mt_input_time_dimension_section(time_mt, display_options);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else {
            cb_mt_input_monad_mt_section(monad_mt, display_options);
        }
        return NIL;
    }

    public static final SubLObject cb_monad_dimension_specified_name_alt(SubLObject input_name) {
        SubLTrampolineFile.checkType(input_name, STRINGP);
        return format(NIL, $str_alt3$_A_monad_dimension_specified, input_name);
    }

    public static SubLObject cb_monad_dimension_specified_name(final SubLObject input_name) {
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        return format(NIL, $str10$_A_monad_dimension_specified, input_name);
    }

    /**
     * Monad Mt support for when there are no hlmts.
     *
     * @param MONAD-MT;
     * 		nil or monad-mt-p
     */
    @LispMethod(comment = "Monad Mt support for when there are no hlmts.\r\n\r\n@param MONAD-MT;\r\n\t\tnil or monad-mt-p")
    public static final SubLObject cb_mt_input_monad_mt_section_alt(SubLObject monad_mt, SubLObject display_options) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject edit_allowedP_tail = property_list_member($kw4$EDIT_ALLOWED_, current);
                SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? ((SubLObject) (cadr(edit_allowedP_tail))) : T;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_mt_input_default_name$.getGlobalValue();
                SubLObject monad_choices_tail = property_list_member($MONAD_CHOICES, current);
                SubLObject monad_choices = (NIL != monad_choices_tail) ? ((SubLObject) (cadr(monad_choices_tail))) : NIL;
                SubLObject monad_mt_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_mt_input_name(input_name);
                if (NIL != edit_allowedP) {
                    html_complete.html_complete_button(monad_mt_input_name, $$$Complete, $$Microtheory, NIL, NIL, monad_choices);
                    html_indent(ONE_INTEGER);
                }
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt9$Mt___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                {
                    SubLObject mt_string = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_mt_display_string(monad_mt);
                    if (NIL != edit_allowedP) {
                        html_text_input(monad_mt_input_name, mt_string, $cb_hlmt_input_width$.getDynamicValue(thread));
                        html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button(monad_mt_input_name, $$$Clear_Mt);
                    } else {
                        cb_form(monad_mt, UNPROVIDED, UNPROVIDED);
                        html_hidden_input(monad_mt_input_name, mt_string, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Monad Mt support for when there are no hlmts.
     *
     * @param MONAD-MT;
     * 		nil or monad-mt-p
     */
    @LispMethod(comment = "Monad Mt support for when there are no hlmts.\r\n\r\n@param MONAD-MT;\r\n\t\tnil or monad-mt-p")
    public static SubLObject cb_mt_input_monad_mt_section(SubLObject monad_mt, SubLObject display_options) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject edit_allowedP_tail = property_list_member($kw11$EDIT_ALLOWED_, current);
        final SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? cadr(edit_allowedP_tail) : T;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_mt_input_default_name$.getGlobalValue();
        final SubLObject monad_choices_tail = property_list_member($MONAD_CHOICES, current);
        final SubLObject monad_choices = (NIL != monad_choices_tail) ? cadr(monad_choices_tail) : NIL;
        final SubLObject monad_mt_input_name = cb_monad_mt_input_name(input_name);
        if (NIL != edit_allowedP) {
            html_complete.html_complete_button(monad_mt_input_name, $$$Complete, $$Microtheory, NIL, NIL, monad_choices, UNPROVIDED);
            html_indent(ONE_INTEGER);
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str16$Mt___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject mt_string = cb_monad_mt_display_string(monad_mt);
        if (NIL != edit_allowedP) {
            html_text_input(monad_mt_input_name, mt_string, $cb_hlmt_input_width$.getDynamicValue(thread));
            html_indent(ONE_INTEGER);
            html_script_utilities.html_clear_input_button(monad_mt_input_name, $$$Clear_Mt, UNPROVIDED);
        } else {
            cb_form(monad_mt, UNPROVIDED, UNPROVIDED);
            html_hidden_input(monad_mt_input_name, mt_string, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Monad Mt support for when there are hlmts.
     *
     * @param MONAD-MT;
     * 		nil or monad-mt-p
     */
    @LispMethod(comment = "Monad Mt support for when there are hlmts.\r\n\r\n@param MONAD-MT;\r\n\t\tnil or monad-mt-p")
    public static final SubLObject cb_mt_input_monad_dimension_section_alt(SubLObject monad_mt, SubLObject display_options) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject edit_allowedP_tail = property_list_member($kw4$EDIT_ALLOWED_, current);
                SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? ((SubLObject) (cadr(edit_allowedP_tail))) : T;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_mt_input_default_name$.getGlobalValue();
                SubLObject monad_choices_tail = property_list_member($MONAD_CHOICES, current);
                SubLObject monad_choices = (NIL != monad_choices_tail) ? ((SubLObject) (cadr(monad_choices_tail))) : NIL;
                if (NIL != edit_allowedP) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject monad_dimension_specified_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_dimension_specified_name(input_name);
                                        html_checkbox_input(monad_dimension_specified_name, $$$t, T, NIL, NIL, T);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($$$Monad_Dimension);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject monad_mt_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_mt_input_name(input_name);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != edit_allowedP) {
                                        html_complete.html_complete_button(monad_mt_input_name, $$$Complete, $$Microtheory, NIL, NIL, monad_choices);
                                        html_indent(ONE_INTEGER);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str_alt16$Monad_Mt___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            {
                                SubLObject mt_string = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_mt_display_string(monad_mt);
                                if (NIL != edit_allowedP) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(monad_mt_input_name);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(mt_string);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
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
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_script_utilities.html_clear_input_button(monad_mt_input_name, $$$Clear_Mt);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_form(monad_mt, UNPROVIDED, UNPROVIDED);
                                            html_hidden_input(monad_mt_input_name, mt_string, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Monad Mt support for when there are hlmts.
     *
     * @param MONAD-MT;
     * 		nil or monad-mt-p
     */
    @LispMethod(comment = "Monad Mt support for when there are hlmts.\r\n\r\n@param MONAD-MT;\r\n\t\tnil or monad-mt-p")
    public static SubLObject cb_mt_input_monad_dimension_section(SubLObject monad_mt, SubLObject display_options) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject edit_allowedP_tail = property_list_member($kw11$EDIT_ALLOWED_, current);
        final SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? cadr(edit_allowedP_tail) : T;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_mt_input_default_name$.getGlobalValue();
        final SubLObject monad_choices_tail = property_list_member($MONAD_CHOICES, current);
        final SubLObject monad_choices = (NIL != monad_choices_tail) ? cadr(monad_choices_tail) : NIL;
        if (NIL != edit_allowedP) {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject monad_dimension_specified_name = cb_monad_dimension_specified_name(input_name);
                    html_checkbox_input(monad_dimension_specified_name, $$$t, T, NIL, NIL, T);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(THREE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Monad_Dimension);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject monad_mt_input_name = cb_monad_mt_input_name(input_name);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != edit_allowedP) {
                    html_complete.html_complete_button(monad_mt_input_name, $$$Complete, $$Microtheory, NIL, NIL, monad_choices, UNPROVIDED);
                    html_indent(ONE_INTEGER);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($RIGHT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str23$Monad_Mt___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            final SubLObject mt_string = cb_monad_mt_display_string(monad_mt);
            if (NIL != edit_allowedP) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) {
                        final SubLObject id_num = html_macros.next_html_id(UNPROVIDED);
                        final SubLObject autocomplete_id = cconcatenate($str24$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
                        final SubLObject input_id = cconcatenate($str25$input_, format_nil.format_nil_a_no_copy(id_num));
                        final SubLObject result_id = cconcatenate($str26$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (NIL != autocomplete_id) {
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(autocomplete_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str27$yui_ac);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(monad_mt_input_name);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != input_id) {
                                html_markup(html_macros.$html_textarea_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(input_id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_style$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str28$position_static);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str29$yui_ac_input);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(mt_string);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (NIL != result_id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(result_id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str30$yui_ac_container);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $$Microtheory);
                    } else {
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(monad_mt_input_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(mt_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_script_utilities.html_clear_input_button(monad_mt_input_name, $$$Clear_Mt, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_form(monad_mt, UNPROVIDED, UNPROVIDED);
                    html_hidden_input(monad_mt_input_name, mt_string, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_monad_mt_input_name_alt(SubLObject input_name) {
        SubLTrampolineFile.checkType(input_name, STRINGP);
        return format(NIL, $str_alt17$_A_monad, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_monad_mt_input_name(final SubLObject input_name) {
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        return format(NIL, $str31$_A_monad, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_time_dimension_specified_name_alt(SubLObject input_name) {
        SubLTrampolineFile.checkType(input_name, STRINGP);
        return format(NIL, $str_alt18$_A_time_dimension_specified, input_name);
    }

    public static SubLObject cb_time_dimension_specified_name(final SubLObject input_name) {
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        return format(NIL, $str32$_A_time_dimension_specified, input_name);
    }

    public static final SubLObject cb_mt_input_time_dimension_section_alt(SubLObject time_mt, SubLObject display_options) {
        if (time_mt == UNPROVIDED) {
            time_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject edit_allowedP_tail = property_list_member($kw4$EDIT_ALLOWED_, current);
                SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? ((SubLObject) (cadr(edit_allowedP_tail))) : T;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_mt_input_default_name$.getGlobalValue();
                SubLObject anytime_psc_allowedP_tail = property_list_member($kw19$ANYTIME_PSC_ALLOWED_, current);
                SubLObject anytime_psc_allowedP = (NIL != anytime_psc_allowedP_tail) ? ((SubLObject) (cadr(anytime_psc_allowedP_tail))) : T;
                SubLObject time_interval_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_interval_input_name(input_name);
                SubLObject time_parameter_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_parameter_input_name(input_name);
                SubLObject anytime_pscP = hlmt.anytime_psc_p(time_mt);
                SubLObject time_interval = NIL;
                SubLObject time_parameter = NIL;
                if (NIL == anytime_pscP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject time_interval_10 = hlmt.explode_hlmt_temporal_facets_with_defaults(time_mt);
                        SubLObject time_parameter_11 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        time_interval = time_interval_10;
                        time_parameter = time_parameter_11;
                    }
                }
                {
                    SubLObject time_dimension_specified_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_dimension_specified_name(input_name);
                    if (NIL == edit_allowedP) {
                        html_hidden_input(time_dimension_specified_name, $$$na, UNPROVIDED);
                    } else {
                        if (NIL == anytime_psc_allowedP) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input(time_dimension_specified_name, $$$t, T, NIL, NIL, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(THREE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($$$Time_Dimension);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_hidden_input(time_dimension_specified_name, $$$na, UNPROVIDED);
                        } else {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input(time_dimension_specified_name, $$$t, makeBoolean(NIL == anytime_pscP), NIL, NIL, makeBoolean(NIL == anytime_psc_allowedP));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(THREE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($$$Time_Dimension);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_time_interval_section(time_interval, time_interval_input_name, edit_allowedP);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        com.cyc.cycjava.cycl.cb_form_widgets.cb_mt_input_time_parameter_section(time_parameter, time_parameter_input_name, edit_allowedP);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_mt_input_time_dimension_section(SubLObject time_mt, SubLObject display_options) {
        if (time_mt == UNPROVIDED) {
            time_mt = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject edit_allowedP_tail = property_list_member($kw11$EDIT_ALLOWED_, current);
        final SubLObject edit_allowedP = (NIL != edit_allowedP_tail) ? cadr(edit_allowedP_tail) : T;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_mt_input_default_name$.getGlobalValue();
        final SubLObject anytime_psc_allowedP_tail = property_list_member($kw33$ANYTIME_PSC_ALLOWED_, current);
        final SubLObject anytime_psc_allowedP = (NIL != anytime_psc_allowedP_tail) ? cadr(anytime_psc_allowedP_tail) : T;
        final SubLObject time_interval_input_name = cb_time_interval_input_name(input_name);
        final SubLObject time_parameter_input_name = cb_time_parameter_input_name(input_name);
        final SubLObject anytime_pscP = hlmt.anytime_psc_p(time_mt);
        SubLObject time_interval = NIL;
        SubLObject time_parameter = NIL;
        if (NIL == anytime_pscP) {
            thread.resetMultipleValues();
            final SubLObject time_interval_$13 = hlmt.explode_hlmt_temporal_facets_with_defaults(time_mt);
            final SubLObject time_parameter_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            time_interval = time_interval_$13;
            time_parameter = time_parameter_$14;
        }
        final SubLObject time_dimension_specified_name = cb_time_dimension_specified_name(input_name);
        if (NIL == edit_allowedP) {
            html_hidden_input(time_dimension_specified_name, $$$na, UNPROVIDED);
        } else
            if (NIL == anytime_psc_allowedP) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_checkbox_input(time_dimension_specified_name, $$$t, T, NIL, NIL, T);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$Time_Dimension);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_hidden_input(time_dimension_specified_name, $$$na, UNPROVIDED);
            } else {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_checkbox_input(time_dimension_specified_name, $$$t, makeBoolean(NIL == anytime_pscP), NIL, NIL, makeBoolean(NIL == anytime_psc_allowedP));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$Time_Dimension);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }

        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_mt_input_time_interval_section(time_interval, time_interval_input_name, edit_allowedP);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_mt_input_time_parameter_section(time_parameter, time_parameter_input_name, edit_allowedP);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param TIME-INTERVAL;
     * 		nil or a CycL term denoting a time interval.
     */
    @LispMethod(comment = "@param TIME-INTERVAL;\r\n\t\tnil or a CycL term denoting a time interval.")
    public static final SubLObject cb_mt_input_time_interval_section_alt(SubLObject time_interval, SubLObject time_interval_input_name, SubLObject edit_allowedP) {
        if (time_interval == UNPROVIDED) {
            time_interval = NIL;
        }
        if (time_interval_input_name == UNPROVIDED) {
            time_interval_input_name = NIL;
        }
        if (edit_allowedP == UNPROVIDED) {
            edit_allowedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != edit_allowedP) {
                        {
                            SubLObject time_interval_choices = $list_alt22;
                            html_complete.html_complete_button(time_interval_input_name, $$$Complete, $$TimeInterval, NIL, NIL, time_interval_choices);
                        }
                        html_indent(ONE_INTEGER);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL == edit_allowedP) {
                        html_princ_strong($str_alt24$Time_);
                    }
                    html_princ_strong($str_alt25$Interval___);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            {
                SubLObject interval_string = cb_time_interval_display_string(time_interval);
                if (NIL != edit_allowedP) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject time_interval_input_rows = SIX_INTEGER;
                                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(time_interval_input_name);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != time_interval_input_rows) {
                                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(time_interval_input_rows);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$virtual);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(interval_string);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
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
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_script_utilities.html_clear_input_button(time_interval_input_name, $$$Clear_Interval);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_form(time_interval, UNPROVIDED, UNPROVIDED);
                            html_hidden_input(time_interval_input_name, interval_string, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TIME-INTERVAL;
     * 		nil or a CycL term denoting a time interval.
     */
    @LispMethod(comment = "@param TIME-INTERVAL;\r\n\t\tnil or a CycL term denoting a time interval.")
    public static SubLObject cb_mt_input_time_interval_section(SubLObject time_interval, SubLObject time_interval_input_name, SubLObject edit_allowedP) {
        if (time_interval == UNPROVIDED) {
            time_interval = NIL;
        }
        if (time_interval_input_name == UNPROVIDED) {
            time_interval_input_name = NIL;
        }
        if (edit_allowedP == UNPROVIDED) {
            edit_allowedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != edit_allowedP) {
                final SubLObject time_interval_choices = $list36;
                html_complete.html_complete_button(time_interval_input_name, $$$Complete, $$TimeInterval, NIL, NIL, time_interval_choices, UNPROVIDED);
                html_indent(ONE_INTEGER);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($RIGHT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL == edit_allowedP) {
                html_princ_strong($$$Time_);
            }
            html_princ_strong($str39$Interval___);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        final SubLObject interval_string = cb_time_interval_display_string(time_interval);
        if (NIL != edit_allowedP) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject time_interval_input_rows = FOUR_INTEGER;
                if (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) {
                    final SubLObject id_num = html_macros.next_html_id(UNPROVIDED);
                    final SubLObject autocomplete_id = cconcatenate($str24$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
                    final SubLObject input_id = cconcatenate($str25$input_, format_nil.format_nil_a_no_copy(id_num));
                    final SubLObject result_id = cconcatenate($str26$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != autocomplete_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(autocomplete_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str27$yui_ac);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(time_interval_input_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != input_id) {
                            html_markup(html_macros.$html_textarea_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(input_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != time_interval_input_rows) {
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(time_interval_input_rows);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_textarea_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str28$position_static);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str29$yui_ac_input);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(interval_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (NIL != result_id) {
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(result_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str30$yui_ac_container);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $$TimeInterval);
                } else {
                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(time_interval_input_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != time_interval_input_rows) {
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(time_interval_input_rows);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(interval_string);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_script_utilities.html_clear_input_button(time_interval_input_name, $$$Clear_Interval, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_form(time_interval, UNPROVIDED, UNPROVIDED);
                html_hidden_input(time_interval_input_name, interval_string, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_time_interval_input_name_alt(SubLObject input_name) {
        SubLTrampolineFile.checkType(input_name, STRINGP);
        return format(NIL, $str_alt28$_A_time_interval, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_time_interval_input_name(final SubLObject input_name) {
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        return format(NIL, $str41$_A_time_interval, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @param TIME-PARAMETER;
     * 		nil or a CycL term denoting a time parameter.
     */
    @LispMethod(comment = "@param TIME-PARAMETER;\r\n\t\tnil or a CycL term denoting a time parameter.")
    public static final SubLObject cb_mt_input_time_parameter_section_alt(SubLObject time_parameter, SubLObject time_parameter_input_name, SubLObject edit_allowedP) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        if (time_parameter_input_name == UNPROVIDED) {
            time_parameter_input_name = NIL;
        }
        if (edit_allowedP == UNPROVIDED) {
            edit_allowedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != edit_allowedP) {
                        {
                            SubLObject time_parameter_choices = $list_alt29;
                            html_complete.html_complete_button(time_parameter_input_name, $$$Complete, $$TimeParameter, NIL, NIL, time_parameter_choices);
                            html_indent(ONE_INTEGER);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL == edit_allowedP) {
                        html_princ_strong($str_alt24$Time_);
                    }
                    html_princ_strong($str_alt31$Parameter___);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            {
                SubLObject parameter_string = cb_time_parameter_display_string(time_parameter);
                if (NIL != edit_allowedP) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
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
                            html_markup(time_parameter_input_name);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(parameter_string);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
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
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_script_utilities.html_clear_input_button(time_parameter_input_name, $$$Clear_Parameter);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_form(time_parameter, UNPROVIDED, UNPROVIDED);
                            html_hidden_input(time_parameter_input_name, parameter_string, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TIME-PARAMETER;
     * 		nil or a CycL term denoting a time parameter.
     */
    @LispMethod(comment = "@param TIME-PARAMETER;\r\n\t\tnil or a CycL term denoting a time parameter.")
    public static SubLObject cb_mt_input_time_parameter_section(SubLObject time_parameter, SubLObject time_parameter_input_name, SubLObject edit_allowedP) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        if (time_parameter_input_name == UNPROVIDED) {
            time_parameter_input_name = NIL;
        }
        if (edit_allowedP == UNPROVIDED) {
            edit_allowedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != edit_allowedP) {
                final SubLObject time_parameter_choices = $list42;
                html_complete.html_complete_button(time_parameter_input_name, $$$Complete, $$TimeParameter, NIL, NIL, time_parameter_choices, UNPROVIDED);
                html_indent(ONE_INTEGER);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($RIGHT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL == edit_allowedP) {
                html_princ_strong($$$Time_);
            }
            html_princ_strong($str44$Parameter___);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        final SubLObject parameter_string = cb_time_parameter_display_string(time_parameter);
        if (NIL != edit_allowedP) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) {
                    final SubLObject id_num = html_macros.next_html_id(UNPROVIDED);
                    final SubLObject autocomplete_id = cconcatenate($str24$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
                    final SubLObject input_id = cconcatenate($str25$input_, format_nil.format_nil_a_no_copy(id_num));
                    final SubLObject result_id = cconcatenate($str26$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != autocomplete_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(autocomplete_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str27$yui_ac);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(time_parameter_input_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != input_id) {
                            html_markup(html_macros.$html_textarea_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(input_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_textarea_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str28$position_static);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str29$yui_ac_input);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(parameter_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (NIL != result_id) {
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(result_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str30$yui_ac_container);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $$TimeParameter);
                } else {
                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(time_parameter_input_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != $cb_hlmt_input_width$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($cb_hlmt_input_width$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(parameter_string);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_script_utilities.html_clear_input_button(time_parameter_input_name, $$$Clear_Parameter, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_form(time_parameter, UNPROVIDED, UNPROVIDED);
                html_hidden_input(time_parameter_input_name, parameter_string, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_time_parameter_input_name_alt(SubLObject input_name) {
        SubLTrampolineFile.checkType(input_name, STRINGP);
        return format(NIL, $str_alt33$_A_time_parameter, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_time_parameter_input_name(final SubLObject input_name) {
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        return format(NIL, $str46$_A_time_parameter, Strings.string_downcase(input_name, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Extract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.
     * DEFAULT-MT, if provided, is used to specify the default values to use if
     * widget returns with any portions of the MT unspecified.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :INPUT-NAME ; <stringp>
     * :ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions
     *
     * @return 0 ; mt or nil ; the resulting specified mt, or nil if there was an mt-error.
     * @return 1 ; nil or mt-error-p ; a description of the mt error, suitable for CB-MT-ERROR.
     * @return 2 ; nil or stringp    ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.\r\nDEFAULT-MT, if provided, is used to specify the default values to use if\r\nwidget returns with any portions of the MT unspecified.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:INPUT-NAME ; <stringp>\r\n:ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions\r\n\r\n@return 0 ; mt or nil ; the resulting specified mt, or nil if there was an mt-error.\r\n@return 1 ; nil or mt-error-p ; a description of the mt error, suitable for CB-MT-ERROR.\r\n@return 2 ; nil or stringp    ; the input string (if any) that led to the error.\nExtract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.\nDEFAULT-MT, if provided, is used to specify the default values to use if\nwidget returns with any portions of the MT unspecified.\nINPUT-OPTIONS is a plist with the following optional properties :\n:INPUT-NAME ; <stringp>\n:ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions")
    public static final SubLObject cb_extract_mt_input_alt(SubLObject args, SubLObject default_mt, SubLObject input_options) {
        if (default_mt == UNPROVIDED) {
            default_mt = NIL;
        }
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = input_options;
                SubLObject current = datum;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_mt_input_default_name$.getGlobalValue();
                SubLObject allow_variableP_tail = property_list_member($kw34$ALLOW_VARIABLE_, current);
                SubLObject allow_variableP = (NIL != allow_variableP_tail) ? ((SubLObject) (cadr(allow_variableP_tail))) : NIL;
                SubLObject default_monad_mt = hlmt.hlmt_monad_mt_without_default(default_mt);
                SubLObject default_time_interval = NIL;
                SubLObject default_time_parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject default_time_interval_20 = hlmt.explode_hlmt_temporal_facets(default_mt, NIL, NIL);
                    SubLObject default_time_parameter_21 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    default_time_interval = default_time_interval_20;
                    default_time_parameter = default_time_parameter_21;
                }
                {
                    SubLObject monad_mt = $UNINITIALIZED;
                    SubLObject time_mt = $UNINITIALIZED;
                    SubLObject mt_error = $UNINITIALIZED;
                    SubLObject monad_mt_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_monad_mt_input_name(input_name);
                    SubLObject monad_mt_string = html_extract_input(monad_mt_input_name, args);
                    thread.resetMultipleValues();
                    {
                        SubLObject monad_mt_22 = com.cyc.cycjava.cycl.cb_form_widgets.cb_determine_monad_mt(monad_mt_string, default_monad_mt, allow_variableP);
                        SubLObject mt_error_23 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        monad_mt = monad_mt_22;
                        mt_error = mt_error_23;
                    }
                    if (NIL != mt_error) {
                        return values(NIL, mt_error, monad_mt_string);
                    }
                    if (NIL == hlmt.hlmts_supportedP()) {
                        return values(monad_mt, NIL, NIL);
                    }
                    {
                        SubLObject time_dimension_specified_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_dimension_specified_name(input_name);
                        SubLObject time_dimension_specifiedP = html_extract_input(time_dimension_specified_name, args);
                        if (NIL != time_dimension_specifiedP) {
                            {
                                SubLObject time_interval = $UNINITIALIZED;
                                SubLObject time_parameter = $UNINITIALIZED;
                                SubLObject time_interval_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_interval_input_name(input_name);
                                SubLObject time_interval_string = html_extract_input(time_interval_input_name, args);
                                thread.resetMultipleValues();
                                {
                                    SubLObject time_interval_24 = com.cyc.cycjava.cycl.cb_form_widgets.cb_determine_time_interval(time_interval_string, default_time_interval, allow_variableP);
                                    SubLObject mt_error_25 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    time_interval = time_interval_24;
                                    mt_error = mt_error_25;
                                }
                                if (NIL != mt_error) {
                                    return values(NIL, mt_error, time_interval_string);
                                }
                                {
                                    SubLObject time_parameter_input_name = com.cyc.cycjava.cycl.cb_form_widgets.cb_time_parameter_input_name(input_name);
                                    SubLObject time_parameter_string = html_extract_input(time_parameter_input_name, args);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject time_parameter_26 = com.cyc.cycjava.cycl.cb_form_widgets.cb_determine_time_parameter(time_parameter_string, default_time_parameter, allow_variableP);
                                        SubLObject mt_error_27 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        time_parameter = time_parameter_26;
                                        mt_error = mt_error_27;
                                    }
                                    if (NIL != mt_error) {
                                        return values(NIL, mt_error, time_parameter_string);
                                    }
                                }
                                time_mt = hlmt.new_time_dimension(time_interval, time_parameter);
                            }
                        } else {
                            time_mt = hlmt.new_time_dimension($$AnytimePSC, UNPROVIDED);
                        }
                    }
                    if (!((NIL != monad_mt) || (NIL != time_mt))) {
                        {
                            SubLObject mt_error_28 = com.cyc.cycjava.cycl.cb_form_widgets.new_wholly_unspecified_mt_error();
                            return values(NIL, mt_error_28, NIL);
                        }
                    }
                    if (!((NIL != monad_mt) && (NIL != time_mt))) {
                        {
                            SubLObject missing_mt_parts = nconc(NIL != monad_mt ? ((SubLObject) (NIL)) : list($MONAD_MT), NIL != time_mt ? ((SubLObject) (NIL)) : list($TIME_MT));
                            SubLObject mt_error_29 = com.cyc.cycjava.cycl.cb_form_widgets.new_incompletely_specified_mt_error(missing_mt_parts);
                            return values(NIL, mt_error_29, NIL);
                        }
                    }
                    {
                        SubLObject v_hlmt = hlmt.new_canonicalized_temporal_hlmt(monad_mt, time_mt);
                        return values(v_hlmt, NIL, NIL);
                    }
                }
            }
        }
    }

    /**
     * Extract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.
     * DEFAULT-MT, if provided, is used to specify the default values to use if
     * widget returns with any portions of the MT unspecified.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :INPUT-NAME ; <stringp>
     * :ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions
     *
     * @return 0 ; mt or nil ; the resulting specified mt, or nil if there was an mt-error.
     * @return 1 ; nil or mt-error-p ; a description of the mt error, suitable for CB-MT-ERROR.
     * @return 2 ; nil or stringp    ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.\r\nDEFAULT-MT, if provided, is used to specify the default values to use if\r\nwidget returns with any portions of the MT unspecified.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:INPUT-NAME ; <stringp>\r\n:ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions\r\n\r\n@return 0 ; mt or nil ; the resulting specified mt, or nil if there was an mt-error.\r\n@return 1 ; nil or mt-error-p ; a description of the mt error, suitable for CB-MT-ERROR.\r\n@return 2 ; nil or stringp    ; the input string (if any) that led to the error.\nExtract the specifed mt from ARGS, which comes from a form with mt inputs via CB-MT-INPUT-SECTION.\nDEFAULT-MT, if provided, is used to specify the default values to use if\nwidget returns with any portions of the MT unspecified.\nINPUT-OPTIONS is a plist with the following optional properties :\n:INPUT-NAME ; <stringp>\n:ALLOW-VARIABLE? ; <boolean-p> allows variable as input in any of the MT portions")
    public static SubLObject cb_extract_mt_input(final SubLObject args, SubLObject default_mt, SubLObject input_options) {
        if (default_mt == UNPROVIDED) {
            default_mt = NIL;
        }
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = input_options;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_mt_input_default_name$.getGlobalValue();
        final SubLObject allow_variableP_tail = property_list_member($kw47$ALLOW_VARIABLE_, current);
        final SubLObject allow_variableP = (NIL != allow_variableP_tail) ? cadr(allow_variableP_tail) : NIL;
        final SubLObject default_monad_mt = hlmt.hlmt_monad_mt_without_default(default_mt);
        SubLObject default_time_interval = NIL;
        SubLObject default_time_parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject default_time_interval_$29 = hlmt.explode_hlmt_temporal_facets(default_mt, NIL, NIL);
        final SubLObject default_time_parameter_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        default_time_interval = default_time_interval_$29;
        default_time_parameter = default_time_parameter_$30;
        SubLObject monad_mt = $UNINITIALIZED;
        SubLObject time_mt = $UNINITIALIZED;
        SubLObject mt_error = $UNINITIALIZED;
        final SubLObject monad_mt_input_name = cb_monad_mt_input_name(input_name);
        final SubLObject monad_mt_string = html_extract_input(monad_mt_input_name, args);
        if (NIL != monad_mt_string) {
            thread.resetMultipleValues();
            final SubLObject monad_mt_$31 = cb_determine_monad_mt(monad_mt_string, default_monad_mt, allow_variableP);
            final SubLObject mt_error_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            monad_mt = monad_mt_$31;
            mt_error = mt_error_$32;
        } else {
            mt_error = new_wholly_unspecified_mt_error();
        }
        if (NIL != mt_error) {
            return values(NIL, mt_error, monad_mt_string);
        }
        if (NIL == hlmt.hlmts_supportedP()) {
            return values(monad_mt, NIL, NIL);
        }
        final SubLObject time_dimension_specified_name = cb_time_dimension_specified_name(input_name);
        final SubLObject time_dimension_specifiedP = html_extract_input(time_dimension_specified_name, args);
        if (NIL != time_dimension_specifiedP) {
            SubLObject time_interval = $UNINITIALIZED;
            SubLObject time_parameter = $UNINITIALIZED;
            final SubLObject time_interval_input_name = cb_time_interval_input_name(input_name);
            final SubLObject time_interval_string = html_extract_input(time_interval_input_name, args);
            thread.resetMultipleValues();
            final SubLObject time_interval_$33 = cb_determine_time_interval(time_interval_string, default_time_interval, allow_variableP);
            final SubLObject mt_error_$33 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            time_interval = time_interval_$33;
            mt_error = mt_error_$33;
            if (NIL != mt_error) {
                return values(NIL, mt_error, time_interval_string);
            }
            final SubLObject time_parameter_input_name = cb_time_parameter_input_name(input_name);
            final SubLObject time_parameter_string = html_extract_input(time_parameter_input_name, args);
            thread.resetMultipleValues();
            final SubLObject time_parameter_$35 = cb_determine_time_parameter(time_parameter_string, default_time_parameter, allow_variableP);
            final SubLObject mt_error_$34 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            time_parameter = time_parameter_$35;
            mt_error = mt_error_$34;
            if (NIL != mt_error) {
                return values(NIL, mt_error, time_parameter_string);
            }
            time_mt = hlmt.new_time_dimension(time_interval, time_parameter);
        } else {
            time_mt = hlmt.new_time_dimension($$AnytimePSC, UNPROVIDED);
        }
        if ((NIL == monad_mt) && (NIL == time_mt)) {
            final SubLObject mt_error_$35 = new_wholly_unspecified_mt_error();
            return values(NIL, mt_error_$35, NIL);
        }
        if ((NIL == monad_mt) || (NIL == time_mt)) {
            final SubLObject missing_mt_parts = nconc(NIL != monad_mt ? NIL : list($MONAD_MT), NIL != time_mt ? NIL : list($TIME_MT));
            final SubLObject mt_error_$36 = new_incompletely_specified_mt_error(missing_mt_parts);
            return values(NIL, mt_error_$36, NIL);
        }
        final SubLObject v_hlmt = hlmt.new_canonicalized_temporal_hlmt(monad_mt, time_mt);
        return values(v_hlmt, NIL, NIL);
    }

    public static final SubLObject cb_determine_monad_mt_alt(SubLObject input_string, SubLObject default_monad_mt, SubLObject allow_variableP) {
        SubLTrampolineFile.checkType(input_string, STRINGP);
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_monad_mt) {
                return values(default_monad_mt, NIL);
            } else {
                return values(NIL, NIL);
            }
        }
        {
            SubLObject monad_mt = cb_guess_term(input_string, UNPROVIDED);
            if (NIL == monad_mt) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unintelligible_mt_error($MONAD_MT));
                } else {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unmatched_paren_error($MONAD_MT));
                }
            }
            if (NIL == cb_assertion_editor.cb_valid_microtheoryP(monad_mt)) {
                if (!((NIL != allow_variableP) && (NIL != collection_defns.el_variableP(monad_mt)))) {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_semantic_mt_error($MONAD_MT));
                }
            }
            return values(monad_mt, NIL);
        }
    }

    public static SubLObject cb_determine_monad_mt(SubLObject input_string, final SubLObject default_monad_mt, final SubLObject allow_variableP) {
        assert NIL != stringp(input_string) : "! stringp(input_string) " + ("Types.stringp(input_string) " + "CommonSymbols.NIL != Types.stringp(input_string) ") + input_string;
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_monad_mt) {
                return values(default_monad_mt, NIL);
            }
            return values(NIL, NIL);
        } else {
            final SubLObject monad_mt = cb_guess_term(input_string, UNPROVIDED);
            if (NIL == monad_mt) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, new_unintelligible_mt_error($MONAD_MT));
                }
                return values(NIL, new_unmatched_paren_error($MONAD_MT));
            } else {
                if ((NIL == cb_assertion_editor.cb_valid_microtheoryP(monad_mt)) && ((NIL == allow_variableP) || (NIL == collection_defns.el_variableP(monad_mt)))) {
                    return values(NIL, new_semantic_mt_error($MONAD_MT));
                }
                return values(monad_mt, NIL);
            }
        }
    }

    public static final SubLObject cb_determine_time_interval_alt(SubLObject input_string, SubLObject default_time_interval, SubLObject allow_variableP) {
        SubLTrampolineFile.checkType(input_string, STRINGP);
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_time_interval) {
                return values(default_time_interval, NIL);
            } else {
                return values(NIL, NIL);
            }
        }
        {
            SubLObject possible_variable = cb_guess_term(input_string, UNPROVIDED);
            if ((NIL != allow_variableP) && (NIL != collection_defns.el_variableP(possible_variable))) {
                return values(possible_variable, NIL);
            }
        }
        {
            SubLObject time_interval = cb_guess_date(input_string);
            if (NIL == time_interval) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unintelligible_mt_error($TIME_INTERVAL));
                } else {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unmatched_paren_error($TIME_INTERVAL));
                }
            }
            if (NIL == hlmt.temporal_objectP(time_interval)) {
                return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_semantic_mt_error($TIME_INTERVAL));
            }
            return values(time_interval, NIL);
        }
    }

    public static SubLObject cb_determine_time_interval(SubLObject input_string, final SubLObject default_time_interval, final SubLObject allow_variableP) {
        assert NIL != stringp(input_string) : "! stringp(input_string) " + ("Types.stringp(input_string) " + "CommonSymbols.NIL != Types.stringp(input_string) ") + input_string;
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_time_interval) {
                return values(default_time_interval, NIL);
            }
            return values(NIL, NIL);
        } else {
            final SubLObject possible_variable = cb_guess_term(input_string, UNPROVIDED);
            if ((NIL != allow_variableP) && (NIL != collection_defns.el_variableP(possible_variable))) {
                return values(possible_variable, NIL);
            }
            final SubLObject time_interval = cb_guess_date(input_string);
            if (NIL == time_interval) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, new_unintelligible_mt_error($TIME_INTERVAL));
                }
                return values(NIL, new_unmatched_paren_error($TIME_INTERVAL));
            } else {
                if (NIL == hlmt.temporal_objectP(time_interval)) {
                    return values(NIL, new_semantic_mt_error($TIME_INTERVAL));
                }
                return values(time_interval, NIL);
            }
        }
    }

    public static final SubLObject cb_determine_time_parameter_alt(SubLObject input_string, SubLObject default_time_parameter, SubLObject allow_variableP) {
        SubLTrampolineFile.checkType(input_string, STRINGP);
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_time_parameter) {
                return values(default_time_parameter, NIL);
            } else {
                return values(NIL, NIL);
            }
        }
        {
            SubLObject possible_variable = cb_guess_term(input_string, UNPROVIDED);
            if ((NIL != allow_variableP) && (NIL != collection_defns.el_variableP(possible_variable))) {
                return values(possible_variable, NIL);
            }
        }
        {
            SubLObject time_parameter = cb_guess_time_parameter(input_string);
            if (NIL == time_parameter) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unintelligible_mt_error($TIME_PARAMETER));
                } else {
                    return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_unmatched_paren_error($TIME_PARAMETER));
                }
            }
            if (NIL == hlmt.time_parameterP(time_parameter)) {
                return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_semantic_mt_error($TIME_PARAMETER));
            }
            return values(time_parameter, NIL);
        }
    }

    public static SubLObject cb_determine_time_parameter(SubLObject input_string, final SubLObject default_time_parameter, final SubLObject allow_variableP) {
        assert NIL != stringp(input_string) : "! stringp(input_string) " + ("Types.stringp(input_string) " + "CommonSymbols.NIL != Types.stringp(input_string) ") + input_string;
        input_string = string_utilities.subst_whitespace(string_utilities.trim_whitespace(input_string));
        if (NIL != string_utilities.empty_string_p(input_string)) {
            if (NIL != default_time_parameter) {
                return values(default_time_parameter, NIL);
            }
            return values(NIL, NIL);
        } else {
            final SubLObject possible_variable = cb_guess_term(input_string, UNPROVIDED);
            if ((NIL != allow_variableP) && (NIL != collection_defns.el_variableP(possible_variable))) {
                return values(possible_variable, NIL);
            }
            final SubLObject time_parameter = cb_guess_time_parameter(input_string);
            if (NIL == time_parameter) {
                if (NIL != string_utilities.all_parens_matchedP(input_string, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, new_unintelligible_mt_error($TIME_PARAMETER));
                }
                return values(NIL, new_unmatched_paren_error($TIME_PARAMETER));
            } else {
                if (NIL == hlmt.time_parameterP(time_parameter)) {
                    return values(NIL, new_semantic_mt_error($TIME_PARAMETER));
                }
                return values(time_parameter, NIL);
            }
        }
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an MT from an mt-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan MT from an mt-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan MT from an mt-input section of a form.")
    public static final SubLObject mt_error_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && ($MT_ERROR == v_object.first()));
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an MT from an mt-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan MT from an mt-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan MT from an mt-input section of a form.")
    public static SubLObject mt_error_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && ($MT_ERROR == v_object.first()));
    }

    /**
     * Show an error page indicating that an MT-ERROR occurred while trying to extract
     * an MT from an mt-input section of a form.
     * INPUT-STRING, if provided, is the actual input string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an MT-ERROR occurred while trying to extract\r\nan MT from an mt-input section of a form.\r\nINPUT-STRING, if provided, is the actual input string from the input section with the problem.\nShow an error page indicating that an MT-ERROR occurred while trying to extract\nan MT from an mt-input section of a form.\nINPUT-STRING, if provided, is the actual input string from the input section with the problem.")
    public static final SubLObject cb_mt_error_alt(SubLObject mt_error, SubLObject input_string) {
        if (input_string == UNPROVIDED) {
            input_string = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.cb_form_widgets.mt_error_p(mt_error)) {
            {
                SubLObject datum = mt_error;
                SubLObject current = datum;
                SubLObject mt_error_keyword = NIL;
                SubLObject error_type = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt42);
                mt_error_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                error_type = current.first();
                current = current.rest();
                {
                    SubLObject part_type = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt42);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = error_type;
                            if (pcase_var.eql($WHOLLY_UNSPECIFIED)) {
                                return cb_error($str_alt44$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($UNSPECIFIED)) {
                                    {
                                        SubLObject pcase_var_30 = part_type;
                                        if (pcase_var_30.eql($MONAD_MT)) {
                                            if (NIL != hlmt.hlmts_supportedP()) {
                                                return cb_error($str_alt46$No_monadic_microtheory_was_specif, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                return cb_error($str_alt44$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } else {
                                            if (pcase_var_30.eql($TIME_MT)) {
                                                return cb_error($str_alt47$No_microtheory_time_dimension_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                if (pcase_var_30.eql($TIME_INTERVAL)) {
                                                    return cb_error($str_alt48$No_microtheory_time_interval_was_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    if (pcase_var_30.eql($TIME_PARAMETER)) {
                                                        return cb_error($str_alt49$No_microtheory_time_parameter_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        return cb_error($str_alt50$The_MT_part__A_was_not_specified_, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($UNINTELLIGIBLE)) {
                                        {
                                            SubLObject pcase_var_31 = part_type;
                                            if (pcase_var_31.eql($MONAD_MT)) {
                                                return cb_error($str_alt52$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                if (pcase_var_31.eql($TIME_MT)) {
                                                    return cb_error($str_alt53$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    if (pcase_var_31.eql($TIME_INTERVAL)) {
                                                        return cb_error($str_alt54$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var_31.eql($TIME_PARAMETER)) {
                                                            return cb_error($str_alt55$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            return cb_error($str_alt56$The_string__S_did_not_make_sense_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($UNMATCHED_PAREN)) {
                                            {
                                                SubLObject pcase_var_32 = part_type;
                                                if (pcase_var_32.eql($MONAD_MT)) {
                                                    return cb_error($str_alt58$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    if (pcase_var_32.eql($TIME_MT)) {
                                                        return cb_error($str_alt59$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var_32.eql($TIME_INTERVAL)) {
                                                            return cb_error($str_alt60$Unmatched_Parentheses_in_time_int, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var_32.eql($TIME_PARAMETER)) {
                                                                return cb_error($str_alt61$Unmatched_Parentheses_in_time_par, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                return cb_error($str_alt62$Unmatched_Parentheses_in_mt_part_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($INCOMPLETELY_SPECIFIED)) {
                                                {
                                                    SubLObject missing_parts = part_type;
                                                    return cb_error($str_alt64$MT_parts__S_were_unspecified_, missing_parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else {
                                                if (pcase_var.eql($SEMANTIC)) {
                                                    {
                                                        SubLObject pcase_var_33 = part_type;
                                                        if (pcase_var_33.eql($MONAD_MT)) {
                                                            if (NIL != hlmt.hlmts_supportedP()) {
                                                                return cb_error($str_alt66$_S_did_not_specify_a_monadic_micr, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                return cb_error($str_alt67$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else {
                                                            if (pcase_var_33.eql($TIME_MT)) {
                                                                return cb_error($str_alt68$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var_33.eql($NON_TIME_INTERVAL)) {
                                                                    return cb_error($str_alt70$_S_did_not_specify_a_time_interva, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var_33.eql($NON_TIME_PARAMETER)) {
                                                                        return cb_error($str_alt72$_S_did_not_specify_a_time_paramet, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        return cb_error($str_alt73$_S_did_not_specify_a_term_suitabl, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    return cb_error($str_alt74$MT_ERROR__S____S__S__S, error_type, part_type, input_string, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt42);
                    }
                }
            }
        } else {
            return cb_error($str_alt75$_S____S, mt_error, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Show an error page indicating that an MT-ERROR occurred while trying to extract
     * an MT from an mt-input section of a form.
     * INPUT-STRING, if provided, is the actual input string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an MT-ERROR occurred while trying to extract\r\nan MT from an mt-input section of a form.\r\nINPUT-STRING, if provided, is the actual input string from the input section with the problem.\nShow an error page indicating that an MT-ERROR occurred while trying to extract\nan MT from an mt-input section of a form.\nINPUT-STRING, if provided, is the actual input string from the input section with the problem.")
    public static SubLObject cb_mt_error(final SubLObject mt_error, SubLObject input_string) {
        if (input_string == UNPROVIDED) {
            input_string = NIL;
        }
        if (NIL == mt_error_p(mt_error)) {
            return cb_error($str88$_S____S, mt_error, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject mt_error_keyword = NIL;
        SubLObject error_type = NIL;
        destructuring_bind_must_consp(mt_error, mt_error, $list55);
        mt_error_keyword = mt_error.first();
        SubLObject current = mt_error.rest();
        destructuring_bind_must_consp(current, mt_error, $list55);
        error_type = current.first();
        current = current.rest();
        final SubLObject part_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, mt_error, $list55);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(mt_error, $list55);
            return NIL;
        }
        final SubLObject pcase_var = error_type;
        if (pcase_var.eql($WHOLLY_UNSPECIFIED)) {
            return cb_error($str57$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($UNSPECIFIED)) {
            final SubLObject pcase_var_$39 = part_type;
            if (pcase_var_$39.eql($MONAD_MT)) {
                if (NIL != hlmt.hlmts_supportedP()) {
                    return cb_error($str59$No_monadic_microtheory_was_specif, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return cb_error($str57$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (pcase_var_$39.eql($TIME_MT)) {
                    return cb_error($str60$No_microtheory_time_dimension_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (pcase_var_$39.eql($TIME_INTERVAL)) {
                    return cb_error($str61$No_microtheory_time_interval_was_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (pcase_var_$39.eql($TIME_PARAMETER)) {
                    return cb_error($str62$No_microtheory_time_parameter_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return cb_error($str63$The_MT_part__A_was_not_specified_, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (pcase_var.eql($UNINTELLIGIBLE)) {
                final SubLObject pcase_var_$40 = part_type;
                if (pcase_var_$40.eql($MONAD_MT)) {
                    return cb_error($str65$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (pcase_var_$40.eql($TIME_MT)) {
                    return cb_error($str66$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (pcase_var_$40.eql($TIME_INTERVAL)) {
                    return cb_error($str67$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (pcase_var_$40.eql($TIME_PARAMETER)) {
                    return cb_error($str68$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return cb_error($str69$The_string__S_did_not_make_sense_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($UNMATCHED_PAREN)) {
                    final SubLObject pcase_var_$41 = part_type;
                    if (pcase_var_$41.eql($MONAD_MT)) {
                        return cb_error($str71$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (pcase_var_$41.eql($TIME_MT)) {
                        return cb_error($str72$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (pcase_var_$41.eql($TIME_INTERVAL)) {
                        return cb_error($str73$Unmatched_Parentheses_in_time_int, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (pcase_var_$41.eql($TIME_PARAMETER)) {
                        return cb_error($str74$Unmatched_Parentheses_in_time_par, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return cb_error($str75$Unmatched_Parentheses_in_mt_part_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (pcase_var.eql($INCOMPLETELY_SPECIFIED)) {
                        final SubLObject missing_parts = part_type;
                        return cb_error($str77$MT_parts__S_were_unspecified_, missing_parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (!pcase_var.eql($SEMANTIC)) {
                        return cb_error($str87$MT_ERROR__S____S__S__S, error_type, part_type, input_string, UNPROVIDED, UNPROVIDED);
                    }
                    final SubLObject pcase_var_$42 = part_type;
                    if (pcase_var_$42.eql($MONAD_MT)) {
                        if (NIL != hlmt.hlmts_supportedP()) {
                            return cb_error($str79$_S_did_not_specify_a_monadic_micr, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return cb_error($str80$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (pcase_var_$42.eql($TIME_MT)) {
                            return cb_error($str81$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (pcase_var_$42.eql($NON_TIME_INTERVAL)) {
                            return cb_error($str83$_S_did_not_specify_a_time_interva, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (pcase_var_$42.eql($NON_TIME_PARAMETER)) {
                            return cb_error($str85$_S_did_not_specify_a_time_paramet, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return cb_error($str86$_S_did_not_specify_a_term_suitabl, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }


    }

    public static final SubLObject new_wholly_unspecified_mt_error_alt() {
        return list($MT_ERROR, $WHOLLY_UNSPECIFIED);
    }

    public static SubLObject new_wholly_unspecified_mt_error() {
        return list($MT_ERROR, $WHOLLY_UNSPECIFIED);
    }

    public static final SubLObject wholly_unspecified_mt_error_p_alt(SubLObject mt_error) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cb_form_widgets.mt_error_p(mt_error)) && ($WHOLLY_UNSPECIFIED == second(mt_error)));
    }

    public static SubLObject wholly_unspecified_mt_error_p(final SubLObject mt_error) {
        return makeBoolean((NIL != mt_error_p(mt_error)) && ($WHOLLY_UNSPECIFIED == second(mt_error)));
    }

    public static final SubLObject new_unintelligible_mt_error_alt(SubLObject mt_part) {
        return list($MT_ERROR, $UNINTELLIGIBLE, mt_part);
    }

    public static SubLObject new_unintelligible_mt_error(final SubLObject mt_part) {
        return list($MT_ERROR, $UNINTELLIGIBLE, mt_part);
    }

    public static final SubLObject new_unmatched_paren_error_alt(SubLObject mt_part) {
        return list($MT_ERROR, $UNMATCHED_PAREN, mt_part);
    }

    public static SubLObject new_unmatched_paren_error(final SubLObject mt_part) {
        return list($MT_ERROR, $UNMATCHED_PAREN, mt_part);
    }

    public static final SubLObject new_semantic_mt_error_alt(SubLObject mt_part) {
        return list($MT_ERROR, $SEMANTIC, mt_part);
    }

    public static SubLObject new_semantic_mt_error(final SubLObject mt_part) {
        return list($MT_ERROR, $SEMANTIC, mt_part);
    }

    public static final SubLObject new_incompletely_specified_mt_error_alt(SubLObject missing_mt_parts) {
        if (missing_mt_parts == UNPROVIDED) {
            missing_mt_parts = NIL;
        }
        if (NIL != list_utilities.singletonP(missing_mt_parts)) {
            return list($MT_ERROR, $UNSPECIFIED, missing_mt_parts.first());
        } else {
            return list($MT_ERROR, $INCOMPLETELY_SPECIFIED, missing_mt_parts);
        }
    }

    public static SubLObject new_incompletely_specified_mt_error(SubLObject missing_mt_parts) {
        if (missing_mt_parts == UNPROVIDED) {
            missing_mt_parts = NIL;
        }
        if (NIL != list_utilities.singletonP(missing_mt_parts)) {
            return list($MT_ERROR, $UNSPECIFIED, missing_mt_parts.first());
        }
        return list($MT_ERROR, $INCOMPLETELY_SPECIFIED, missing_mt_parts);
    }

    public static SubLObject use_js_el_sentence_editorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_js_sentence_editor_enabled$.getDynamicValue(thread);
    }

    public static final SubLObject cb_el_sentence_input_section_alt(SubLObject sentence, SubLObject display_options) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.cb_form_widgets.use_gke_for_el_sentence_editing()) {
            return com.cyc.cycjava.cycl.cb_form_widgets.cb_el_sentence_input_section_gke(sentence, display_options);
        } else {
            return com.cyc.cycjava.cycl.cb_form_widgets.cb_el_sentence_input_section_html(sentence, display_options);
        }
    }

    public static SubLObject cb_el_sentence_input_section(SubLObject sentence, SubLObject display_options) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        return cb_el_formula_input_section_html(sentence, display_options);
    }

    public static SubLObject cb_el_formula_input_section(SubLObject formula, SubLObject display_options) {
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        return cb_el_formula_input_section_html(formula, display_options);
    }

    public static SubLObject cb_el_formula_input_section_html(SubLObject sentence, SubLObject display_options) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$43 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list90);
            current_$43 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list90);
            if (NIL == member(current_$43, $list91, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$43 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list90);
        }
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_el_formula_input_default_name$.getGlobalValue();
        final SubLObject complete_label_tail = property_list_member($COMPLETE_LABEL, current);
        final SubLObject complete_label = (NIL != complete_label_tail) ? cadr(complete_label_tail) : $$$Complete;
        final SubLObject choices_tail = property_list_member($CHOICES, current);
        final SubLObject choices = (NIL != choices_tail) ? cadr(choices_tail) : NIL;
        final SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, current);
        final SubLObject pretty_name = (NIL != pretty_name_tail) ? cadr(pretty_name_tail) : $$$EL_Sentence;
        final SubLObject clear_label_tail = property_list_member($CLEAR_LABEL, current);
        final SubLObject clear_label = (NIL != clear_label_tail) ? cadr(clear_label_tail) : $$$Clear_Sentence;
        final SubLObject cyclify_label_tail = property_list_member($CYCLIFY_LABEL, current);
        final SubLObject cyclify_label = (NIL != cyclify_label_tail) ? cadr(cyclify_label_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : $int$80;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : TWENTY_INTEGER;
        final SubLObject mode_tail = property_list_member($MODE, current);
        final SubLObject mode = (NIL != mode_tail) ? cadr(mode_tail) : $ASSERT;
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        assert NIL != subl_promotions.positive_integer_p(width) : "! subl_promotions.positive_integer_p(width) " + ("subl_promotions.positive_integer_p(width) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(width) ") + width;
        assert NIL != subl_promotions.positive_integer_p(height) : "! subl_promotions.positive_integer_p(height) " + ("subl_promotions.positive_integer_p(height) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(height) ") + height;
        if (((NIL != complete_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(complete_label))) {
            throw new AssertionError(complete_label);
        }
        final SubLObject list_var = choices;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != constant_p(elem) : "! constant_handles.constant_p(elem) " + ("constant_handles.constant_p(elem) " + "CommonSymbols.NIL != constant_handles.constant_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (((NIL != pretty_name) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(pretty_name))) {
            throw new AssertionError(pretty_name);
        }
        if (((NIL != cyclify_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyclify_label))) {
            throw new AssertionError(cyclify_label);
        }
        if (((NIL != clear_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(clear_label))) {
            throw new AssertionError(clear_label);
        }
        if (((NIL != mode) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == keywordp(mode))) {
            throw new AssertionError(mode);
        }
        if ((((NIL != complete_label) || (NIL != pretty_name)) || (NIL != cyclify_label)) || (NIL != clear_label)) {
            if (NIL != complete_label) {
                html_complete.html_complete_button(input_name, complete_label, NIL, NIL, NIL, choices, $legacy_sentence_editor_class$.getGlobalValue());
                html_indent(ONE_INTEGER);
            }
            if (NIL != pretty_name) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(pretty_name);
                html_princ($str109$__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            if ((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) {
                html_indent(ONE_INTEGER);
                html_complete.html_cyclify_button(input_name, cyclify_label, $legacy_sentence_editor_class$.getGlobalValue());
            }
            if (NIL != clear_label) {
                html_indent(FOUR_INTEGER);
                html_script_utilities.html_clear_input_button(input_name, clear_label, $legacy_sentence_editor_class$.getGlobalValue());
            }
            html_newline(UNPROVIDED);
        }
        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(input_name);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != width) {
            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(width);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != input_name) {
            html_markup(html_macros.$html_textarea_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(input_name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != height) {
            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(height);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != $sentence_editor_textarea_class$.getGlobalValue()) {
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($sentence_editor_textarea_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != sentence) {
                cb_format_sentence_editor_sentence(sentence, mode);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        html_script_utilities.html_sentence_editor_enable_editors();
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_format_sentence_editor_sentence(final SubLObject sentence, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sentence.isString()) {
            html_princ(sentence);
        } else {
            format_cycl_expression.format_cycl_expression(cycl_utilities.expression_transform(sentence, UNICODE_NAUT_P, CYCL_STRING_TO_UTF8_STRING, UNPROVIDED, UNPROVIDED), html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
        }
        return sentence;
    }

    public static SubLObject cb_sentence_editor_start(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id) {
        if (mode == UNPROVIDED) {
            mode = $ASSERT;
        }
        if (id == UNPROVIDED) {
            id = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != use_js_el_sentence_editorP()) {
            if (NIL != $cb_use_codemirror_sentence_editorP$.getDynamicValue(thread)) {
                cb_sentence_editor_start_codemirror(input_name, width, mode, id);
            } else {
                cb_sentence_editor_start_1(input_name, width, mode, id);
            }
        }
        return NIL;
    }

    public static SubLObject cb_sentence_editor_start_1(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id) {
        if (mode == UNPROVIDED) {
            mode = $ASSERT;
        }
        if (id == UNPROVIDED) {
            id = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject strict_wff_checking = (mode == $QUERY) ? $$$false : $$$true;
        format(html_macros.$html_stream$.getDynamicValue(thread), $str115$_script_Event_onDOMReady_function, new SubLObject[]{ input_name, width, id, strict_wff_checking });
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_sentence_editor_start_codemirror(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id) {
        if (mode == UNPROVIDED) {
            mode = $ASSERT;
        }
        if (id == UNPROVIDED) {
            id = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.javascript($HTML_EDITOR_SCRIPTS);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $codemirror_editor_start_script$.getDynamicValue(thread), input_name);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Extract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :REQUIRED?    ; <boolean>, default T
     * :INPUT-NAME   ; <stringp>
     * :AUTO-CYCLIFY ; <boolean>
     * If :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.
     *
     * @return 0 ; sentence or nil ; the resulting specified sentence, or nil if there was an el-sentence-error.
     * @return 1 ; nil or el-sentence-error-p ; a description of the el sentence error, suitable for CB-EL-SENTENCE-ERROR.
     * @return 2 ; nil or stringp  ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:REQUIRED?    ; <boolean>, default T\r\n:INPUT-NAME   ; <stringp>\r\n:AUTO-CYCLIFY ; <boolean>\r\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.\r\n\r\n@return 0 ; sentence or nil ; the resulting specified sentence, or nil if there was an el-sentence-error.\r\n@return 1 ; nil or el-sentence-error-p ; a description of the el sentence error, suitable for CB-EL-SENTENCE-ERROR.\r\n@return 2 ; nil or stringp  ; the input string (if any) that led to the error.\nExtract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.\nINPUT-OPTIONS is a plist with the following optional properties :\n:REQUIRED?    ; <boolean>, default T\n:INPUT-NAME   ; <stringp>\n:AUTO-CYCLIFY ; <boolean>\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.")
    public static final SubLObject cb_extract_el_sentence_input_alt(SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = input_options;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_36 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt99);
                    current_36 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt99);
                    if (NIL == member(current_36, $list_alt100, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_36 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt99);
                }
                {
                    SubLObject requiredP_tail = property_list_member($REQUIRED_, current);
                    SubLObject requiredP = (NIL != requiredP_tail) ? ((SubLObject) (cadr(requiredP_tail))) : T;
                    SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                    SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_sentence_input_default_name$.getGlobalValue();
                    SubLObject auto_cyclify_tail = property_list_member($AUTO_CYCLIFY, current);
                    SubLObject auto_cyclify = (NIL != auto_cyclify_tail) ? ((SubLObject) (cadr(auto_cyclify_tail))) : T;
                    SubLObject sentence_string = html_extract_input(input_name, args);
                    if (NIL == sentence_string) {
                        {
                            SubLObject el_sentence_error = (NIL != requiredP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($UNSPECIFIED))) : NIL;
                            return values(NIL, el_sentence_error);
                        }
                    }
                    if (NIL != auto_cyclify) {
                        sentence_string = string_utilities.cyclify_string(sentence_string);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence = com.cyc.cycjava.cycl.cb_form_widgets.cb_determine_el_sentence(com.cyc.cycjava.cycl.cb_form_widgets.cb_normalize_formula_string(sentence_string), requiredP);
                        SubLObject el_sentence_error = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != el_sentence_error) {
                            return values(NIL, el_sentence_error, sentence_string);
                        }
                        return values(sentence, NIL, NIL);
                    }
                }
            }
        }
    }

    /**
     * Extract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :REQUIRED?    ; <boolean>, default T
     * :INPUT-NAME   ; <stringp>
     * :AUTO-CYCLIFY ; <boolean>
     * If :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.
     *
     * @return 0 ; sentence or nil ; the resulting specified sentence, or nil if there was an el-sentence-error.
     * @return 1 ; nil or el-sentence-error-p ; a description of the el sentence error, suitable for CB-EL-SENTENCE-ERROR.
     * @return 2 ; nil or stringp  ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:REQUIRED?    ; <boolean>, default T\r\n:INPUT-NAME   ; <stringp>\r\n:AUTO-CYCLIFY ; <boolean>\r\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.\r\n\r\n@return 0 ; sentence or nil ; the resulting specified sentence, or nil if there was an el-sentence-error.\r\n@return 1 ; nil or el-sentence-error-p ; a description of the el sentence error, suitable for CB-EL-SENTENCE-ERROR.\r\n@return 2 ; nil or stringp  ; the input string (if any) that led to the error.\nExtract the specifed EL sentence from ARGS, which comes from a form with mt inputs via CB-EL-SENTENCE-INPUT-SECTION.\nINPUT-OPTIONS is a plist with the following optional properties :\n:REQUIRED?    ; <boolean>, default T\n:INPUT-NAME   ; <stringp>\n:AUTO-CYCLIFY ; <boolean>\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.")
    public static SubLObject cb_extract_el_sentence_input(final SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        return cb_extract_el_formula_input(args, putf(list_utilities.merge_plist(list($INPUT_NAME, $$$sentence), input_options), $kw119$REQUIRE_SENTENCE_, T));
    }

    public static SubLObject cb_extract_el_formula_input(final SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = input_options;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$44 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list120);
            current_$44 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list120);
            if (NIL == member(current_$44, $list121, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$44 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list120);
        }
        final SubLObject requiredP_tail = property_list_member($REQUIRED_, current);
        final SubLObject requiredP = (NIL != requiredP_tail) ? cadr(requiredP_tail) : T;
        final SubLObject require_sentenceP_tail = property_list_member($kw119$REQUIRE_SENTENCE_, current);
        final SubLObject require_sentenceP = (NIL != require_sentenceP_tail) ? cadr(require_sentenceP_tail) : NIL;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_el_formula_input_default_name$.getGlobalValue();
        final SubLObject auto_cyclify_tail = property_list_member($AUTO_CYCLIFY, current);
        final SubLObject auto_cyclify = (NIL != auto_cyclify_tail) ? cadr(auto_cyclify_tail) : T;
        SubLObject formula_string = html_extract_input(input_name, args);
        if (NIL == formula_string) {
            final SubLObject el_formula_error = (NIL != requiredP) ? new_el_formula_error($UNSPECIFIED) : NIL;
            return values(NIL, el_formula_error, NIL);
        }
        if (NIL != auto_cyclify) {
            formula_string = string_utilities.cyclify_string(formula_string);
        }
        thread.resetMultipleValues();
        final SubLObject formula = cb_determine_el_formula(cb_normalize_formula_string(formula_string), requiredP, require_sentenceP);
        final SubLObject el_formula_error2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_formula_error2) {
            return values(NIL, el_formula_error2, formula_string);
        }
        return values(formula, NIL, formula_string);
    }

    /**
     * Return the CycL formula specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the CycL formula specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static final SubLObject cb_extract_query_formula_from_string_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject formula = read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL == el_formula_p(formula)) {
                cb_error($str_alt105$Bad_formula__probably_due_to_a_mi, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            if (NIL != mt) {
                if (NIL == wff.wff_queryP(formula, mt, UNPROVIDED)) {
                    cb_assertion_editor.cb_explain_why_not_wff(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
            }
            return formula;
        }
    }

    /**
     * Return the CycL formula specified by STRING, or generate an error page explaining the problem and return NIL.
     */
    @LispMethod(comment = "Return the CycL formula specified by STRING, or generate an error page explaining the problem and return NIL.")
    public static SubLObject cb_extract_query_formula_from_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject formula = read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        if (NIL == el_formula_p(formula)) {
            cb_error($str126$Bad_formula__probably_due_to_a_mi, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if ((NIL != mt) && (NIL == wff.wff_queryP(formula, mt, UNPROVIDED))) {
            cb_assertion_editor.cb_explain_why_not_wff(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return formula;
    }

    public static final SubLObject cb_determine_el_sentence_alt(SubLObject sentence_string, SubLObject requiredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence_string, STRINGP);
            sentence_string = string_utilities.trim_whitespace(sentence_string);
            if (NIL != string_utilities.empty_string_p(sentence_string)) {
                {
                    SubLObject el_sentence_error = (NIL != requiredP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($UNSPECIFIED))) : NIL;
                    return values(NIL, el_sentence_error);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.cb_form_widgets.cb_invalid_constant_names_in_stringP(sentence_string)) {
                return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($INVALID_CONSTANTS));
            }
            thread.resetMultipleValues();
            {
                SubLObject sentence = read_from_string_ignoring_errors(sentence_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                SubLObject end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($EOF == sentence) {
                    if (NIL == string_utilities.all_parens_matchedP(sentence_string, UNPROVIDED, UNPROVIDED)) {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($UNMATCHED_PARENTHESES));
                    } else {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($EOF));
                    }
                } else {
                    if ($ERROR == end) {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($READ_ERROR));
                    } else {
                        if (NIL != expression_gather(sentence, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($SYMBOLS_FOR_INVALID_CONSTANTS));
                        } else {
                            if (NIL == el_grammar.el_sentence_p(sentence)) {
                                return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_sentence_error($NON_SENTENCE));
                            } else {
                                return values(sentence, NIL);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_determine_el_sentence(final SubLObject formula_string, final SubLObject requiredP) {
        return cb_determine_el_formula(formula_string, requiredP, T);
    }

    public static SubLObject cb_determine_el_formula(SubLObject formula_string, final SubLObject requiredP, SubLObject require_sentenceP) {
        if (require_sentenceP == UNPROVIDED) {
            require_sentenceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(formula_string) : "! stringp(formula_string) " + ("Types.stringp(formula_string) " + "CommonSymbols.NIL != Types.stringp(formula_string) ") + formula_string;
        formula_string = string_utilities.trim_whitespace(formula_string);
        if (NIL != string_utilities.empty_string_p(formula_string)) {
            final SubLObject el_formula_error = (NIL != requiredP) ? new_el_formula_error($UNSPECIFIED) : NIL;
            return values(NIL, el_formula_error);
        }
        if (NIL != cb_invalid_constant_names_in_stringP(formula_string)) {
            return values(NIL, new_el_formula_error($INVALID_CONSTANTS));
        }
        thread.resetMultipleValues();
        SubLObject formula = read_from_string_ignoring_errors(formula_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        final SubLObject end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = cb_convert_strings_to_cycl(formula);
        if ($EOF == formula) {
            if (NIL == string_utilities.all_parens_matchedP(formula_string, UNPROVIDED, UNPROVIDED)) {
                return values(NIL, new_el_formula_error($UNMATCHED_PARENTHESES));
            }
            return values(NIL, new_el_formula_error($EOF));
        } else {
            if ($ERROR == end) {
                return values(NIL, new_el_formula_error($READ_ERROR));
            }
            if (NIL != cycl_utilities.expression_gather(formula, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return values(NIL, new_el_formula_error($SYMBOLS_FOR_INVALID_CONSTANTS));
            }
            if ((NIL != require_sentenceP) && (NIL == el_grammar.el_sentence_p(formula))) {
                return values(NIL, new_el_formula_error($NON_SENTENCE));
            }
            return values(formula, NIL);
        }
    }

    public static SubLObject cb_convert_strings_to_cycl(SubLObject sexp) {
        if (sexp.isSymbol()) {
            return sexp;
        }
        SubLObject arg_positions = cycl_utilities.arg_positions_if_dfs(CYCL_STRING_P, sexp, UNPROVIDED);
        SubLObject strings = NIL;
        if (NIL != cycl_string.cycl_string_p(sexp)) {
            arg_positions = cons(NIL, arg_positions);
        }
        SubLObject cdolist_list_var = arg_positions;
        SubLObject arg_position = NIL;
        arg_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(butlast(arg_position, UNPROVIDED), arg_positions, symbol_function(EQUAL), UNPROVIDED)) || (NIL == unicode_nauts.unicode_naut_p(cycl_utilities.formula_arg_position(sexp, butlast(arg_position, UNPROVIDED), UNPROVIDED), UNPROVIDED))) {
                strings = cons(cycl_utilities.formula_arg_position(sexp, arg_position, UNPROVIDED), strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position = cdolist_list_var.first();
        } 
        cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject replacement = (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) ? cycl_string.canonicalize_cycl_string(string) : cycl_string.convert_string_to_cycl(string);
            if (!replacement.equal(string)) {
                sexp = cycl_utilities.expression_subst(replacement, string, sexp, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return sexp;
    }

    /**
     * Returns the are invalid constants in the STRING, but ignores invalid constants in quoted string inside STRING
     */
    @LispMethod(comment = "Returns the are invalid constants in the STRING, but ignores invalid constants in quoted string inside STRING")
    public static final SubLObject cb_invalid_constant_names_in_string_alt(SubLObject string) {
        {
            SubLObject sub_strings = string_utilities.string_tokenize(string, $list_alt114, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject quoted_startP = NIL;
            SubLObject invalid_constants = NIL;
            SubLObject cdolist_list_var = sub_strings;
            SubLObject sub_string = NIL;
            for (sub_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_string = cdolist_list_var.first()) {
                if (NIL != quoted_startP) {
                    if (sub_string.equal($str_alt115$_)) {
                        quoted_startP = NIL;
                    }
                } else {
                    if (sub_string.equal($str_alt115$_)) {
                        quoted_startP = T;
                    } else {
                        invalid_constants = append(invalid_constants, string_utilities.invalid_constant_names_in_string(sub_string, T));
                    }
                }
            }
            return invalid_constants;
        }
    }

    /**
     * Returns the are invalid constants in the STRING, but ignores invalid constants in quoted string inside STRING
     */
    @LispMethod(comment = "Returns the are invalid constants in the STRING, but ignores invalid constants in quoted string inside STRING")
    public static SubLObject cb_invalid_constant_names_in_string(final SubLObject string) {
        final SubLObject sub_strings = string_utilities.string_tokenize(string, $list136, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject quoted_startP = NIL;
        SubLObject invalid_constants = NIL;
        SubLObject cdolist_list_var = sub_strings;
        SubLObject sub_string = NIL;
        sub_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != quoted_startP) {
                if (sub_string.equal($str137$_)) {
                    quoted_startP = NIL;
                }
            } else
                if (sub_string.equal($str137$_)) {
                    quoted_startP = T;
                } else {
                    invalid_constants = append(invalid_constants, string_utilities.invalid_constant_names_in_string(sub_string, T));
                }

            cdolist_list_var = cdolist_list_var.rest();
            sub_string = cdolist_list_var.first();
        } 
        return invalid_constants;
    }

    public static SubLObject utf8_nbsp() {
        if ($utf8_nbsp$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector($ic138, UNPROVIDED, UNPROVIDED));
            if (init_value == $UNINITIALIZED) {
                Errors.error($str139$Unable_to_initialize__A__, $utf8_nbsp$.getGlobalValue());
            }
            $utf8_nbsp$.setGlobalValue(init_value);
        }
        return $utf8_nbsp$.getGlobalValue();
    }

    public static SubLObject return_string() {
        if ($return_string$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = Strings.make_string(ONE_INTEGER, CHAR_return);
            if (init_value == $UNINITIALIZED) {
                Errors.error($str139$Unable_to_initialize__A__, $return_string$.getGlobalValue());
            }
            $return_string$.setGlobalValue(init_value);
        }
        return $return_string$.getGlobalValue();
    }

    public static final SubLObject cb_normalize_formula_string_alt(SubLObject formula_string) {
        {
            SubLObject result = formula_string;
            result = string_utilities.string_substitute($str_alt0$, Strings.make_string(ONE_INTEGER, CHAR_return), result, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject cb_normalize_formula_string(final SubLObject formula_string) {
        SubLObject result = string_utilities.string_substitute($str7$, return_string(), formula_string, UNPROVIDED);
        result = string_utilities.string_substitute($$$_, utf8_nbsp(), result, UNPROVIDED);
        result = string_utilities.normalize_spaces(result);
        return result;
    }

    public static final SubLObject cb_invalid_constant_names_in_stringP_alt(SubLObject string) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.cb_form_widgets.cb_invalid_constant_names_in_string(string));
    }

    public static SubLObject cb_invalid_constant_names_in_stringP(final SubLObject string) {
        return list_utilities.sublisp_boolean(cb_invalid_constant_names_in_string(string));
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an EL sentence from an el-sentence-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan EL sentence from an el-sentence-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan EL sentence from an el-sentence-input section of a form.")
    public static final SubLObject el_sentence_error_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($EL_SENTENCE_ERROR == v_object.first()));
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an EL sentence from an el-sentence-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan EL sentence from an el-sentence-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan EL sentence from an el-sentence-input section of a form.")
    public static SubLObject el_sentence_error_p(final SubLObject v_object) {
        return el_formula_error_p(v_object);
    }

    public static SubLObject el_formula_error_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != member(v_object.first(), $list141, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Show an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract
     * an EL sentence from an el-sentence-input section of a form.
     * SENTENCE-STRING, if provided, is the actual string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract\r\nan EL sentence from an el-sentence-input section of a form.\r\nSENTENCE-STRING, if provided, is the actual string from the input section with the problem.\nShow an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract\nan EL sentence from an el-sentence-input section of a form.\nSENTENCE-STRING, if provided, is the actual string from the input section with the problem.")
    public static final SubLObject cb_el_sentence_error_alt(SubLObject el_sentence_error, SubLObject sentence_string, SubLObject error_options) {
        if (sentence_string == UNPROVIDED) {
            sentence_string = NIL;
        }
        if (error_options == UNPROVIDED) {
            error_options = NIL;
        }
        SubLTrampolineFile.checkType(el_sentence_error, EL_SENTENCE_ERROR_P);
        if (NIL != sentence_string) {
            SubLTrampolineFile.checkType(sentence_string, STRINGP);
        }
        {
            SubLObject datum = error_options;
            SubLObject current = datum;
            SubLObject location_tail = property_list_member($LOCATION, current);
            SubLObject location = (NIL != location_tail) ? ((SubLObject) (cadr(location_tail))) : NIL;
            if (NIL != location) {
                SubLTrampolineFile.checkType(location, STRINGP);
            }
            {
                SubLObject datum_37 = el_sentence_error;
                SubLObject current_38 = datum_37;
                SubLObject el_sentence_error_keyword = NIL;
                SubLObject error_type = NIL;
                destructuring_bind_must_consp(current_38, datum_37, $list_alt119);
                el_sentence_error_keyword = current_38.first();
                current_38 = current_38.rest();
                destructuring_bind_must_consp(current_38, datum_37, $list_alt119);
                error_type = current_38.first();
                current_38 = current_38.rest();
                if (NIL == current_38) {
                    {
                        SubLObject pcase_var = error_type;
                        if (pcase_var.eql($UNSPECIFIED)) {
                            {
                                SubLObject error_string = NIL;
                                if (NIL != location) {
                                    error_string = cconcatenate($str_alt120$No_sentence_was_specified_in_, new SubLObject[]{ location, $str_alt121$_ });
                                } else {
                                    error_string = $str_alt122$No_sentence_was_specified_;
                                }
                                cb_error($str_alt123$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql($INVALID_CONSTANTS)) {
                                {
                                    SubLObject error_string = NIL;
                                    if (NIL != location) {
                                        error_string = cconcatenate($str_alt124$Invalid_Constant_References_in_, location);
                                    } else {
                                        error_string = $$$Invalid_Constant_References;
                                    }
                                    com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_INVALID_CONSTANTS, sentence_string);
                                }
                            } else {
                                if (pcase_var.eql($UNMATCHED_PARENTHESES)) {
                                    {
                                        SubLObject error_string = NIL;
                                        if (NIL != location) {
                                            error_string = cconcatenate($str_alt127$Unmatched_Parentheses_in_, location);
                                        } else {
                                            error_string = $$$Unmatched_Parentheses;
                                        }
                                        com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_UNMATCHED_PARENTHESES, sentence_string);
                                    }
                                } else {
                                    if (pcase_var.eql($EOF)) {
                                        {
                                            SubLObject error_string = NIL;
                                            if (NIL != location) {
                                                error_string = cconcatenate($str_alt130$Unfinished_Sentence_in_, location);
                                            } else {
                                                error_string = $$$Unfinished_Sentence;
                                            }
                                            com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_EOF_EXPLANATION, sentence_string);
                                        }
                                    } else {
                                        if (pcase_var.eql($READ_ERROR)) {
                                            {
                                                SubLObject error_string = NIL;
                                                if (NIL != location) {
                                                    error_string = cconcatenate($str_alt133$Unreadable_Sentence_in_, location);
                                                } else {
                                                    error_string = $$$Unreadable_Sentence;
                                                }
                                                com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_READER_ERROR_EXPLANATION, sentence_string);
                                            }
                                        } else {
                                            if (pcase_var.eql($SYMBOLS_FOR_INVALID_CONSTANTS)) {
                                                {
                                                    SubLObject error_string = NIL;
                                                    if (NIL != location) {
                                                        error_string = cconcatenate($str_alt124$Invalid_Constant_References_in_, location);
                                                    } else {
                                                        error_string = $$$Invalid_Constant_References;
                                                    }
                                                    com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, sentence_string);
                                                }
                                            } else {
                                                if (pcase_var.eql($NON_SENTENCE)) {
                                                    {
                                                        SubLObject error_string = NIL;
                                                        if (NIL != location) {
                                                            error_string = cconcatenate($str_alt137$Not_a_Sentence_in_, location);
                                                        } else {
                                                            error_string = $$$Not_a_Sentence;
                                                        }
                                                        com.cyc.cycjava.cycl.cb_form_widgets.cb_show_sentence_error_page(error_string, CB_SHOW_NON_SENTENCE_EXPLANATION, sentence_string);
                                                    }
                                                } else {
                                                    cb_error($str_alt123$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum_37, $list_alt119);
                }
            }
        }
        return NIL;
    }

    /**
     * Show an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract
     * an EL sentence from an el-sentence-input section of a form.
     * SENTENCE-STRING, if provided, is the actual string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract\r\nan EL sentence from an el-sentence-input section of a form.\r\nSENTENCE-STRING, if provided, is the actual string from the input section with the problem.\nShow an error page indicating that an EL-SENTENCE-ERROR occurred while trying to extract\nan EL sentence from an el-sentence-input section of a form.\nSENTENCE-STRING, if provided, is the actual string from the input section with the problem.")
    public static SubLObject cb_el_sentence_error(final SubLObject el_formula_error, SubLObject formula_string, SubLObject error_options) {
        if (formula_string == UNPROVIDED) {
            formula_string = NIL;
        }
        if (error_options == UNPROVIDED) {
            error_options = NIL;
        }
        return cb_el_formula_error(el_formula_error, formula_string, error_options);
    }

    public static SubLObject cb_el_formula_error(final SubLObject el_formula_error, SubLObject formula_string, SubLObject error_options) {
        if (formula_string == UNPROVIDED) {
            formula_string = NIL;
        }
        if (error_options == UNPROVIDED) {
            error_options = NIL;
        }
        assert NIL != el_formula_error_p(el_formula_error) : "! cb_form_widgets.el_formula_error_p(el_formula_error) " + ("cb_form_widgets.el_formula_error_p(el_formula_error) " + "CommonSymbols.NIL != cb_form_widgets.el_formula_error_p(el_formula_error) ") + el_formula_error;
        if (((NIL != formula_string) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(formula_string))) {
            throw new AssertionError(formula_string);
        }
        final SubLObject current;
        final SubLObject datum = current = error_options;
        final SubLObject location_tail = property_list_member($LOCATION, current);
        final SubLObject location = (NIL != location_tail) ? cadr(location_tail) : NIL;
        if (((NIL != location) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(location))) {
            throw new AssertionError(location);
        }
        SubLObject el_formula_error_keyword = NIL;
        SubLObject error_type = NIL;
        destructuring_bind_must_consp(el_formula_error, el_formula_error, $list144);
        el_formula_error_keyword = el_formula_error.first();
        SubLObject current_$46 = el_formula_error.rest();
        destructuring_bind_must_consp(current_$46, el_formula_error, $list144);
        error_type = current_$46.first();
        current_$46 = current_$46.rest();
        if (NIL == current_$46) {
            final SubLObject pcase_var = error_type;
            if (pcase_var.eql($UNSPECIFIED)) {
                SubLObject error_string = NIL;
                if (NIL != location) {
                    error_string = cconcatenate($$$No_sentence_was_specified_in_, new SubLObject[]{ location, $str146$_ });
                } else {
                    error_string = $str147$No_sentence_was_specified_;
                }
                cb_error($str148$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($INVALID_CONSTANTS)) {
                    SubLObject error_string = NIL;
                    if (NIL != location) {
                        error_string = cconcatenate($$$Invalid_Constant_References_in_, location);
                    } else {
                        error_string = $$$Invalid_Constant_References;
                    }
                    cb_show_formula_error_page(error_string, CB_SHOW_INVALID_CONSTANTS, formula_string);
                } else
                    if (pcase_var.eql($UNMATCHED_PARENTHESES)) {
                        SubLObject error_string = NIL;
                        if (NIL != location) {
                            error_string = cconcatenate($$$Unmatched_Parentheses_in_, location);
                        } else {
                            error_string = $$$Unmatched_Parentheses;
                        }
                        cb_show_formula_error_page(error_string, CB_SHOW_UNMATCHED_PARENTHESES, formula_string);
                    } else
                        if (pcase_var.eql($EOF)) {
                            SubLObject error_string = NIL;
                            if (NIL != location) {
                                error_string = cconcatenate($$$Unfinished_Formula_in_, location);
                            } else {
                                error_string = $$$Unfinished_Formula;
                            }
                            cb_show_formula_error_page(error_string, CB_SHOW_EOF_EXPLANATION, formula_string);
                        } else
                            if (pcase_var.eql($READ_ERROR)) {
                                SubLObject error_string = NIL;
                                if (NIL != location) {
                                    error_string = cconcatenate($$$Unreadable_Formula_in_, location);
                                } else {
                                    error_string = $$$Unreadable_Formula;
                                }
                                cb_show_formula_error_page(error_string, CB_SHOW_READER_ERROR_EXPLANATION, formula_string);
                            } else
                                if (pcase_var.eql($SYMBOLS_FOR_INVALID_CONSTANTS)) {
                                    SubLObject error_string = NIL;
                                    if (NIL != location) {
                                        error_string = cconcatenate($$$Invalid_Constant_References_in_, location);
                                    } else {
                                        error_string = $$$Invalid_Constant_References;
                                    }
                                    cb_show_formula_error_page(error_string, CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, formula_string);
                                } else
                                    if (pcase_var.eql($NON_SENTENCE)) {
                                        SubLObject error_string = NIL;
                                        if (NIL != location) {
                                            error_string = cconcatenate($$$Not_a_Sentence_in_, location);
                                        } else {
                                            error_string = $$$Not_a_Sentence;
                                        }
                                        cb_show_formula_error_page(error_string, CB_SHOW_NON_SENTENCE_EXPLANATION, formula_string);
                                    } else {
                                        cb_error($str148$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }






        } else {
            cdestructuring_bind_error(el_formula_error, $list144);
        }
        return NIL;
    }

    public static SubLObject new_el_formula_error(final SubLObject error_type) {
        return list($EL_FORMULA_ERROR, error_type);
    }

    public static SubLObject cb_show_formula_error_page(final SubLObject title_string, final SubLObject error_showing_func, final SubLObject error_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str166$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str167$_meta_http_equiv__X_UA_Compatible);
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
            html_princ(title_string);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$47 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ(title_string);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    funcall(error_showing_func, error_string);
                    cb_back_button(UNPROVIDED, UNPROVIDED);
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$47, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     * Display an input section suitable for inputting an EL term specification in a form.
     * If non-nil, TERM is the EL term with which to begin editing.
     * DISPLAY-OPTIONS is a plist with the following optional properties :
     * :INPUT-NAME     ; <stringp>
     * :COMPLETE-LABEL ; <stringp>
     * :COMPLETE-TYPE  ; <collection?>
     * :PRETTY-NAME    ; <stringp>
     * :CYCLIFY-LABEL  ; <stringp>
     * :CLEAR-LABEL    ; <stringp>
     * :WIDTH          ; <non-negative-integer-p> number of pixels for the input box
     * :HEIGHT         ; <non-negative-integer-p>
     */
    @LispMethod(comment = "Display an input section suitable for inputting an EL term specification in a form.\r\nIf non-nil, TERM is the EL term with which to begin editing.\r\nDISPLAY-OPTIONS is a plist with the following optional properties :\r\n:INPUT-NAME     ; <stringp>\r\n:COMPLETE-LABEL ; <stringp>\r\n:COMPLETE-TYPE  ; <collection?>\r\n:PRETTY-NAME    ; <stringp>\r\n:CYCLIFY-LABEL  ; <stringp>\r\n:CLEAR-LABEL    ; <stringp>\r\n:WIDTH          ; <non-negative-integer-p> number of pixels for the input box\r\n:HEIGHT         ; <non-negative-integer-p>\nDisplay an input section suitable for inputting an EL term specification in a form.\nIf non-nil, TERM is the EL term with which to begin editing.\nDISPLAY-OPTIONS is a plist with the following optional properties :\n:INPUT-NAME     ; <stringp>\n:COMPLETE-LABEL ; <stringp>\n:COMPLETE-TYPE  ; <collection?>\n:PRETTY-NAME    ; <stringp>\n:CYCLIFY-LABEL  ; <stringp>\n:CLEAR-LABEL    ; <stringp>\n:WIDTH          ; <non-negative-integer-p> number of pixels for the input box\n:HEIGHT         ; <non-negative-integer-p>")
    public static final SubLObject cb_el_term_input_section_alt(SubLObject v_term, SubLObject display_options) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_term_input_default_name$.getGlobalValue();
                SubLObject complete_label_tail = property_list_member($COMPLETE_LABEL, current);
                SubLObject complete_label = (NIL != complete_label_tail) ? ((SubLObject) (cadr(complete_label_tail))) : $$$Complete;
                SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, current);
                SubLObject pretty_name = (NIL != pretty_name_tail) ? ((SubLObject) (cadr(pretty_name_tail))) : NIL;
                SubLObject clear_label_tail = property_list_member($CLEAR_LABEL, current);
                SubLObject clear_label = (NIL != clear_label_tail) ? ((SubLObject) (cadr(clear_label_tail))) : $$$Clear_Term;
                SubLObject cyclify_label_tail = property_list_member($CYCLIFY_LABEL, current);
                SubLObject cyclify_label = (NIL != cyclify_label_tail) ? ((SubLObject) (cadr(cyclify_label_tail))) : NIL;
                SubLTrampolineFile.checkType(input_name, STRINGP);
                if (NIL != complete_label) {
                    SubLTrampolineFile.checkType(complete_label, STRINGP);
                }
                if (NIL != pretty_name) {
                    SubLTrampolineFile.checkType(pretty_name, STRINGP);
                }
                if (NIL != cyclify_label) {
                    SubLTrampolineFile.checkType(cyclify_label, STRINGP);
                }
                if (NIL != clear_label) {
                    SubLTrampolineFile.checkType(clear_label, STRINGP);
                }
                if (!((((NIL != complete_label) || (NIL != pretty_name)) || (NIL != cyclify_label)) || (NIL != clear_label))) {
                    return com.cyc.cycjava.cycl.cb_form_widgets.cb_el_term_input_section_internal(v_term, display_options);
                }
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) || (NIL != clear_label)) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if ((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) {
                                                html_complete.html_cyclify_button(input_name, cyclify_label);
                                            }
                                            if (NIL != clear_label) {
                                                html_indent(ONE_INTEGER);
                                                html_script_utilities.html_clear_input_button(input_name, clear_label);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != pretty_name) {
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ(pretty_name);
                                            html_princ($str_alt92$__);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        com.cyc.cycjava.cycl.cb_form_widgets.cb_el_term_input_section_internal(v_term, display_options);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
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

    /**
     * Display an input section suitable for inputting an EL term specification in a form.
     * If non-nil, TERM is the EL term with which to begin editing.
     * DISPLAY-OPTIONS is a plist with the following optional properties :
     * :INPUT-NAME     ; <stringp>
     * :COMPLETE-LABEL ; <stringp>
     * :COMPLETE-TYPE  ; <collection?>
     * :PRETTY-NAME    ; <stringp>
     * :CYCLIFY-LABEL  ; <stringp>
     * :CLEAR-LABEL    ; <stringp>
     * :WIDTH          ; <non-negative-integer-p> number of pixels for the input box
     * :HEIGHT         ; <non-negative-integer-p>
     */
    @LispMethod(comment = "Display an input section suitable for inputting an EL term specification in a form.\r\nIf non-nil, TERM is the EL term with which to begin editing.\r\nDISPLAY-OPTIONS is a plist with the following optional properties :\r\n:INPUT-NAME     ; <stringp>\r\n:COMPLETE-LABEL ; <stringp>\r\n:COMPLETE-TYPE  ; <collection?>\r\n:PRETTY-NAME    ; <stringp>\r\n:CYCLIFY-LABEL  ; <stringp>\r\n:CLEAR-LABEL    ; <stringp>\r\n:WIDTH          ; <non-negative-integer-p> number of pixels for the input box\r\n:HEIGHT         ; <non-negative-integer-p>\nDisplay an input section suitable for inputting an EL term specification in a form.\nIf non-nil, TERM is the EL term with which to begin editing.\nDISPLAY-OPTIONS is a plist with the following optional properties :\n:INPUT-NAME     ; <stringp>\n:COMPLETE-LABEL ; <stringp>\n:COMPLETE-TYPE  ; <collection?>\n:PRETTY-NAME    ; <stringp>\n:CYCLIFY-LABEL  ; <stringp>\n:CLEAR-LABEL    ; <stringp>\n:WIDTH          ; <non-negative-integer-p> number of pixels for the input box\n:HEIGHT         ; <non-negative-integer-p>")
    public static SubLObject cb_el_term_input_section(SubLObject v_term, SubLObject display_options) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_el_term_input_default_name$.getGlobalValue();
        final SubLObject complete_label_tail = property_list_member($COMPLETE_LABEL, current);
        final SubLObject complete_label = (NIL != complete_label_tail) ? cadr(complete_label_tail) : $$$Complete;
        final SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, current);
        final SubLObject pretty_name = (NIL != pretty_name_tail) ? cadr(pretty_name_tail) : NIL;
        final SubLObject clear_label_tail = property_list_member($CLEAR_LABEL, current);
        final SubLObject clear_label = (NIL != clear_label_tail) ? cadr(clear_label_tail) : $$$Clear_Term;
        final SubLObject cyclify_label_tail = property_list_member($CYCLIFY_LABEL, current);
        final SubLObject cyclify_label = (NIL != cyclify_label_tail) ? cadr(cyclify_label_tail) : NIL;
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        if (((NIL != complete_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(complete_label))) {
            throw new AssertionError(complete_label);
        }
        if (((NIL != pretty_name) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(pretty_name))) {
            throw new AssertionError(pretty_name);
        }
        if (((NIL != cyclify_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyclify_label))) {
            throw new AssertionError(cyclify_label);
        }
        if (((NIL != clear_label) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(clear_label))) {
            throw new AssertionError(clear_label);
        }
        if ((((NIL == complete_label) && (NIL == pretty_name)) && (NIL == cyclify_label)) && (NIL == clear_label)) {
            return cb_el_term_input_section_internal(v_term, display_options);
        }
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
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
            if (((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) || (NIL != clear_label)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if ((NIL != cyclify_label) && (NIL != $cb_show_cyclify_button$.getDynamicValue(thread))) {
                            html_complete.html_cyclify_button(input_name, cyclify_label, UNPROVIDED);
                        }
                        if (NIL != clear_label) {
                            html_indent(ONE_INTEGER);
                            html_script_utilities.html_clear_input_button(input_name, clear_label, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != pretty_name) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ(pretty_name);
                        html_princ($str109$__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_el_term_input_section_internal(v_term, display_options);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_el_term_input_section_internal_alt(SubLObject v_term, SubLObject display_options) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = display_options;
                SubLObject current = datum;
                SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_term_input_default_name$.getGlobalValue();
                SubLObject complete_type_tail = property_list_member($COMPLETE_TYPE, current);
                SubLObject complete_type = (NIL != complete_type_tail) ? ((SubLObject) (cadr(complete_type_tail))) : NIL;
                SubLObject width_tail = property_list_member($WIDTH, current);
                SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $int$300;
                SubLObject height_tail = property_list_member($HEIGHT, current);
                SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : ONE_INTEGER;
                SubLTrampolineFile.checkType(input_name, STRINGP);
                SubLTrampolineFile.checkType(width, POSITIVE_INTEGER_P);
                SubLTrampolineFile.checkType(height, POSITIVE_INTEGER_P);
                {
                    SubLObject html_id_suffix = string_utilities.to_string(html_macros.next_html_id(UNPROVIDED));
                    SubLObject parent_div_id = html_id_suffix;
                    SubLObject autocomplete_container_id = cconcatenate($$$completeContainer, html_id_suffix);
                    SubLObject text_area_id = cconcatenate($$$textArea, html_id_suffix);
                    SubLObject parent_style = cconcatenate($str_alt146$width__, new SubLObject[]{ format_nil_a_no_copy(width), $str_alt147$px_ });
                    SubLObject input_style = cconcatenate($str_alt146$width__, new SubLObject[]{ format_nil_a_no_copy(width), $str_alt148$px__position_static });
                    SubLObject initial_value = (NIL != v_term) ? ((SubLObject) (format_cycl_expression.format_cycl_expression_to_string(v_term, ZERO_INTEGER))) : $str_alt0$;
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != parent_div_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(parent_div_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$autocomplete);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_div_style$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(parent_style);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (height.numG(ONE_INTEGER)) {
                                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(input_name);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != text_area_id) {
                                    html_markup(html_macros.$html_textarea_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(text_area_id);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != height) {
                                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(height);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != input_style) {
                                    html_markup(html_macros.$html_textarea_style$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(input_style);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != v_term) {
                                            html_princ(initial_value);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            } else {
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_text$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_style$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(input_style);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != text_area_id) {
                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(text_area_id);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != input_name) {
                                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(input_name);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != initial_value) {
                                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_princ(initial_value);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (NIL != autocomplete_container_id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(autocomplete_container_id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$cycAutocompleteContainer);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_complete.html_print_js_autocomplete_setup_int(text_area_id, autocomplete_container_id, TWENTY_INTEGER, TWO_INTEGER, NIL, complete_type);
                    html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_el_term_input_section_internal(SubLObject v_term, SubLObject display_options) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (display_options == UNPROVIDED) {
            display_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_el_term_input_default_name$.getGlobalValue();
        final SubLObject complete_type_tail = property_list_member($COMPLETE_TYPE, current);
        final SubLObject complete_type = (NIL != complete_type_tail) ? cadr(complete_type_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : $int$300;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : ONE_INTEGER;
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        assert NIL != subl_promotions.positive_integer_p(width) : "! subl_promotions.positive_integer_p(width) " + ("subl_promotions.positive_integer_p(width) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(width) ") + width;
        assert NIL != subl_promotions.positive_integer_p(height) : "! subl_promotions.positive_integer_p(height) " + ("subl_promotions.positive_integer_p(height) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(height) ") + height;
        final SubLObject parent_div_id;
        final SubLObject html_id_suffix = parent_div_id = string_utilities.to_string(html_macros.next_html_id(UNPROVIDED));
        final SubLObject autocomplete_container_id = cconcatenate($$$completeContainer, html_id_suffix);
        final SubLObject text_area_id = cconcatenate($$$textArea, html_id_suffix);
        final SubLObject parent_style = cconcatenate($str174$width__, new SubLObject[]{ format_nil.format_nil_a_no_copy(width), $str175$px_ });
        final SubLObject input_style = cconcatenate($str174$width__, new SubLObject[]{ format_nil.format_nil_a_no_copy(width), $str176$px__position_static });
        final SubLObject initial_value = (NIL != v_term) ? format_cycl_expression.format_cycl_expression_to_string(v_term, ZERO_INTEGER) : $str7$;
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != parent_div_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(parent_div_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$autocomplete);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(parent_style);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (height.numG(ONE_INTEGER)) {
                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(input_name);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != text_area_id) {
                    html_markup(html_macros.$html_textarea_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(text_area_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != height) {
                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(height);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != input_style) {
                    html_markup(html_macros.$html_textarea_style$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(input_style);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != v_term) {
                        html_princ(initial_value);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_text$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(input_style);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != text_area_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(text_area_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != input_name) {
                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(input_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != initial_value) {
                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_princ(initial_value);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
            }
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != autocomplete_container_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(autocomplete_container_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$cycAutocompleteContainer);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_complete.html_print_js_autocomplete_setup_int(text_area_id, autocomplete_container_id, TWENTY_INTEGER, TWO_INTEGER, NIL, complete_type);
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     * Extract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :REQUIRED?    ; <boolean>, default T
     * :INPUT-NAME   ; <stringp>
     * :AUTO-CYCLIFY ; <boolean>
     * If :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.
     *
     * @return 0 ; term or nil ; the resulting specified term, or nil if there was an el-term-error.
     * @return 1 ; nil or el-term-error-p ; a description of the el term error, suitable for CB-EL-TERM-ERROR.
     * @return 2 ; nil or stringp  ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:REQUIRED?    ; <boolean>, default T\r\n:INPUT-NAME   ; <stringp>\r\n:AUTO-CYCLIFY ; <boolean>\r\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.\r\n\r\n@return 0 ; term or nil ; the resulting specified term, or nil if there was an el-term-error.\r\n@return 1 ; nil or el-term-error-p ; a description of the el term error, suitable for CB-EL-TERM-ERROR.\r\n@return 2 ; nil or stringp  ; the input string (if any) that led to the error.\nExtract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.\nINPUT-OPTIONS is a plist with the following optional properties :\n:REQUIRED?    ; <boolean>, default T\n:INPUT-NAME   ; <stringp>\n:AUTO-CYCLIFY ; <boolean>\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.")
    public static final SubLObject cb_extract_el_term_input_alt(SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = input_options;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_47 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt151);
                    current_47 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt151);
                    if (NIL == member(current_47, $list_alt100, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_47 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt151);
                }
                {
                    SubLObject requiredP_tail = property_list_member($REQUIRED_, current);
                    SubLObject requiredP = (NIL != requiredP_tail) ? ((SubLObject) (cadr(requiredP_tail))) : T;
                    SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
                    SubLObject input_name = (NIL != input_name_tail) ? ((SubLObject) (cadr(input_name_tail))) : $cb_el_term_input_default_name$.getGlobalValue();
                    SubLObject auto_cyclify_tail = property_list_member($AUTO_CYCLIFY, current);
                    SubLObject auto_cyclify = (NIL != auto_cyclify_tail) ? ((SubLObject) (cadr(auto_cyclify_tail))) : T;
                    SubLObject term_string = html_extract_input(input_name, args);
                    if (NIL == term_string) {
                        {
                            SubLObject el_term_error = (NIL != requiredP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($UNSPECIFIED))) : NIL;
                            return values(NIL, el_term_error);
                        }
                    }
                    if (NIL != auto_cyclify) {
                        term_string = string_utilities.cyclify_string(term_string);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = com.cyc.cycjava.cycl.cb_form_widgets.cb_determine_el_term(com.cyc.cycjava.cycl.cb_form_widgets.cb_normalize_formula_string(term_string), requiredP);
                        SubLObject el_term_error = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != el_term_error) {
                            return values(NIL, el_term_error, term_string);
                        }
                        return values(v_term, NIL, NIL);
                    }
                }
            }
        }
    }

    /**
     * Extract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.
     * INPUT-OPTIONS is a plist with the following optional properties :
     * :REQUIRED?    ; <boolean>, default T
     * :INPUT-NAME   ; <stringp>
     * :AUTO-CYCLIFY ; <boolean>
     * If :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.
     *
     * @return 0 ; term or nil ; the resulting specified term, or nil if there was an el-term-error.
     * @return 1 ; nil or el-term-error-p ; a description of the el term error, suitable for CB-EL-TERM-ERROR.
     * @return 2 ; nil or stringp  ; the input string (if any) that led to the error.
     */
    @LispMethod(comment = "Extract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.\r\nINPUT-OPTIONS is a plist with the following optional properties :\r\n:REQUIRED?    ; <boolean>, default T\r\n:INPUT-NAME   ; <stringp>\r\n:AUTO-CYCLIFY ; <boolean>\r\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.\r\n\r\n@return 0 ; term or nil ; the resulting specified term, or nil if there was an el-term-error.\r\n@return 1 ; nil or el-term-error-p ; a description of the el term error, suitable for CB-EL-TERM-ERROR.\r\n@return 2 ; nil or stringp  ; the input string (if any) that led to the error.\nExtract the specifed EL term from ARGS, which comes from a form with term input via CB-EL-TERM-INPUT-SECTION.\nINPUT-OPTIONS is a plist with the following optional properties :\n:REQUIRED?    ; <boolean>, default T\n:INPUT-NAME   ; <stringp>\n:AUTO-CYCLIFY ; <boolean>\nIf :REQUIRED? is non-nil, then it is deemed an error to not have the sentence specified.")
    public static SubLObject cb_extract_el_term_input(final SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = input_options;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$56 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list179);
            current_$56 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list179);
            if (NIL == member(current_$56, $list180, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$56 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list179);
        }
        final SubLObject requiredP_tail = property_list_member($REQUIRED_, current);
        final SubLObject requiredP = (NIL != requiredP_tail) ? cadr(requiredP_tail) : T;
        final SubLObject input_name_tail = property_list_member($INPUT_NAME, current);
        final SubLObject input_name = (NIL != input_name_tail) ? cadr(input_name_tail) : $cb_el_term_input_default_name$.getGlobalValue();
        final SubLObject auto_cyclify_tail = property_list_member($AUTO_CYCLIFY, current);
        final SubLObject auto_cyclify = (NIL != auto_cyclify_tail) ? cadr(auto_cyclify_tail) : T;
        SubLObject term_string = html_extract_input(input_name, args);
        if (NIL == term_string) {
            final SubLObject el_term_error = (NIL != requiredP) ? new_el_term_error($UNSPECIFIED) : NIL;
            return values(NIL, el_term_error);
        }
        if (NIL != auto_cyclify) {
            term_string = string_utilities.cyclify_string(term_string);
        }
        thread.resetMultipleValues();
        final SubLObject v_term = cb_determine_el_term(cb_normalize_formula_string(term_string), requiredP);
        final SubLObject el_term_error2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_term_error2) {
            return values(NIL, el_term_error2, term_string);
        }
        return values(v_term, NIL, NIL);
    }

    public static final SubLObject cb_determine_el_term_alt(SubLObject term_string, SubLObject requiredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(term_string, STRINGP);
            term_string = string_utilities.trim_whitespace(term_string);
            if (NIL != string_utilities.empty_string_p(term_string)) {
                {
                    SubLObject el_term_error = (NIL != requiredP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($UNSPECIFIED))) : NIL;
                    return values(NIL, el_term_error);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.cb_form_widgets.cb_invalid_constant_names_in_stringP(term_string)) {
                return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($INVALID_CONSTANTS));
            }
            thread.resetMultipleValues();
            {
                SubLObject v_term = read_from_string_ignoring_errors(term_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                SubLObject end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($EOF == v_term) {
                    if (NIL == string_utilities.all_parens_matchedP(term_string, UNPROVIDED, UNPROVIDED)) {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($UNMATCHED_PARENTHESES));
                    } else {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($EOF));
                    }
                } else {
                    if ($ERROR == end) {
                        return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($READ_ERROR));
                    } else {
                        if (NIL != expression_gather(v_term, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return values(NIL, com.cyc.cycjava.cycl.cb_form_widgets.new_el_term_error($SYMBOLS_FOR_INVALID_CONSTANTS));
                        } else {
                            return values(v_term, NIL);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_determine_el_term(SubLObject term_string, final SubLObject requiredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(term_string) : "! stringp(term_string) " + ("Types.stringp(term_string) " + "CommonSymbols.NIL != Types.stringp(term_string) ") + term_string;
        term_string = string_utilities.trim_whitespace(term_string);
        if (NIL != string_utilities.empty_string_p(term_string)) {
            final SubLObject el_term_error = (NIL != requiredP) ? new_el_term_error($UNSPECIFIED) : NIL;
            return values(NIL, el_term_error);
        }
        if (NIL != cb_invalid_constant_names_in_stringP(term_string)) {
            return values(NIL, new_el_term_error($INVALID_CONSTANTS));
        }
        thread.resetMultipleValues();
        final SubLObject v_term = read_from_string_ignoring_errors(term_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        final SubLObject end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ($EOF == v_term) {
            if (NIL == string_utilities.all_parens_matchedP(term_string, UNPROVIDED, UNPROVIDED)) {
                return values(NIL, new_el_term_error($UNMATCHED_PARENTHESES));
            }
            return values(NIL, new_el_term_error($EOF));
        } else {
            if ($ERROR == end) {
                return values(NIL, new_el_term_error($READ_ERROR));
            }
            if (NIL != cycl_utilities.expression_gather(v_term, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return values(NIL, new_el_term_error($SYMBOLS_FOR_INVALID_CONSTANTS));
            }
            return values(v_term, NIL);
        }
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an EL term from an el-term-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan EL term from an el-term-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan EL term from an el-term-input section of a form.")
    public static final SubLObject el_term_error_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($EL_TERM_ERROR == v_object.first()));
    }

    /**
     * Return T iff OBJECT is an object that indicates an error occurred while trying to extract
     * an EL term from an el-term-input section of a form.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that indicates an error occurred while trying to extract\r\nan EL term from an el-term-input section of a form.\nReturn T iff OBJECT is an object that indicates an error occurred while trying to extract\nan EL term from an el-term-input section of a form.")
    public static SubLObject el_term_error_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($EL_TERM_ERROR == v_object.first()));
    }

    /**
     * Show an error page indicating that an EL-TERM-ERROR occurred while trying to extract
     * an EL term from an el-term-input section of a form.
     * TERM-STRING, if provided, is the actual string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an EL-TERM-ERROR occurred while trying to extract\r\nan EL term from an el-term-input section of a form.\r\nTERM-STRING, if provided, is the actual string from the input section with the problem.\nShow an error page indicating that an EL-TERM-ERROR occurred while trying to extract\nan EL term from an el-term-input section of a form.\nTERM-STRING, if provided, is the actual string from the input section with the problem.")
    public static final SubLObject cb_el_term_error_alt(SubLObject el_term_error, SubLObject term_string, SubLObject error_options) {
        if (term_string == UNPROVIDED) {
            term_string = NIL;
        }
        if (error_options == UNPROVIDED) {
            error_options = NIL;
        }
        SubLTrampolineFile.checkType(el_term_error, EL_TERM_ERROR_P);
        if (NIL != term_string) {
            SubLTrampolineFile.checkType(term_string, STRINGP);
        }
        {
            SubLObject datum = error_options;
            SubLObject current = datum;
            SubLObject location_tail = property_list_member($LOCATION, current);
            SubLObject location = (NIL != location_tail) ? ((SubLObject) (cadr(location_tail))) : NIL;
            if (NIL != location) {
                SubLTrampolineFile.checkType(location, STRINGP);
            }
            {
                SubLObject datum_48 = el_term_error;
                SubLObject current_49 = datum_48;
                SubLObject el_term_error_keyword = NIL;
                SubLObject error_type = NIL;
                destructuring_bind_must_consp(current_49, datum_48, $list_alt154);
                el_term_error_keyword = current_49.first();
                current_49 = current_49.rest();
                destructuring_bind_must_consp(current_49, datum_48, $list_alt154);
                error_type = current_49.first();
                current_49 = current_49.rest();
                if (NIL == current_49) {
                    {
                        SubLObject pcase_var = error_type;
                        if (pcase_var.eql($UNSPECIFIED)) {
                            {
                                SubLObject error_string = NIL;
                                if (NIL != location) {
                                    error_string = cconcatenate($str_alt155$No_term_was_specified_in_, new SubLObject[]{ location, $str_alt121$_ });
                                } else {
                                    error_string = $str_alt156$No_term_was_specified_;
                                }
                                cb_error($str_alt123$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql($INVALID_CONSTANTS)) {
                                {
                                    SubLObject error_string = NIL;
                                    if (NIL != location) {
                                        error_string = cconcatenate($str_alt124$Invalid_Constant_References_in_, location);
                                    } else {
                                        error_string = $$$Invalid_Constant_References;
                                    }
                                    com.cyc.cycjava.cycl.cb_form_widgets.cb_show_term_error_page(error_string, CB_SHOW_INVALID_CONSTANTS, term_string);
                                }
                            } else {
                                if (pcase_var.eql($UNMATCHED_PARENTHESES)) {
                                    {
                                        SubLObject error_string = NIL;
                                        if (NIL != location) {
                                            error_string = cconcatenate($str_alt127$Unmatched_Parentheses_in_, location);
                                        } else {
                                            error_string = $$$Unmatched_Parentheses;
                                        }
                                        com.cyc.cycjava.cycl.cb_form_widgets.cb_show_term_error_page(error_string, CB_SHOW_UNMATCHED_PARENTHESES, term_string);
                                    }
                                } else {
                                    if (pcase_var.eql($EOF)) {
                                        {
                                            SubLObject error_string = NIL;
                                            if (NIL != location) {
                                                error_string = cconcatenate($str_alt157$Unfinished_Term_in_, location);
                                            } else {
                                                error_string = $$$Unfinished_Term;
                                            }
                                            com.cyc.cycjava.cycl.cb_form_widgets.cb_show_term_error_page(error_string, CB_SHOW_EOF_EXPLANATION, term_string);
                                        }
                                    } else {
                                        if (pcase_var.eql($READ_ERROR)) {
                                            {
                                                SubLObject error_string = NIL;
                                                if (NIL != location) {
                                                    error_string = cconcatenate($str_alt159$Unreadable_Term_in_, location);
                                                } else {
                                                    error_string = $$$Unreadable_Term;
                                                }
                                                com.cyc.cycjava.cycl.cb_form_widgets.cb_show_term_error_page(error_string, CB_SHOW_READER_ERROR_EXPLANATION, term_string);
                                            }
                                        } else {
                                            if (pcase_var.eql($SYMBOLS_FOR_INVALID_CONSTANTS)) {
                                                {
                                                    SubLObject error_string = NIL;
                                                    if (NIL != location) {
                                                        error_string = cconcatenate($str_alt124$Invalid_Constant_References_in_, location);
                                                    } else {
                                                        error_string = $$$Invalid_Constant_References;
                                                    }
                                                    com.cyc.cycjava.cycl.cb_form_widgets.cb_show_term_error_page(error_string, CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, term_string);
                                                }
                                            } else {
                                                cb_error($str_alt123$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum_48, $list_alt154);
                }
            }
        }
        return NIL;
    }

    /**
     * Show an error page indicating that an EL-TERM-ERROR occurred while trying to extract
     * an EL term from an el-term-input section of a form.
     * TERM-STRING, if provided, is the actual string from the input section with the problem.
     */
    @LispMethod(comment = "Show an error page indicating that an EL-TERM-ERROR occurred while trying to extract\r\nan EL term from an el-term-input section of a form.\r\nTERM-STRING, if provided, is the actual string from the input section with the problem.\nShow an error page indicating that an EL-TERM-ERROR occurred while trying to extract\nan EL term from an el-term-input section of a form.\nTERM-STRING, if provided, is the actual string from the input section with the problem.")
    public static SubLObject cb_el_term_error(final SubLObject el_term_error, SubLObject term_string, SubLObject error_options) {
        if (term_string == UNPROVIDED) {
            term_string = NIL;
        }
        if (error_options == UNPROVIDED) {
            error_options = NIL;
        }
        assert NIL != el_term_error_p(el_term_error) : "! cb_form_widgets.el_term_error_p(el_term_error) " + ("cb_form_widgets.el_term_error_p(el_term_error) " + "CommonSymbols.NIL != cb_form_widgets.el_term_error_p(el_term_error) ") + el_term_error;
        if (((NIL != term_string) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(term_string))) {
            throw new AssertionError(term_string);
        }
        final SubLObject current;
        final SubLObject datum = current = error_options;
        final SubLObject location_tail = property_list_member($LOCATION, current);
        final SubLObject location = (NIL != location_tail) ? cadr(location_tail) : NIL;
        if (((NIL != location) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(location))) {
            throw new AssertionError(location);
        }
        SubLObject el_term_error_keyword = NIL;
        SubLObject error_type = NIL;
        destructuring_bind_must_consp(el_term_error, el_term_error, $list183);
        el_term_error_keyword = el_term_error.first();
        SubLObject current_$58 = el_term_error.rest();
        destructuring_bind_must_consp(current_$58, el_term_error, $list183);
        error_type = current_$58.first();
        current_$58 = current_$58.rest();
        if (NIL == current_$58) {
            final SubLObject pcase_var = error_type;
            if (pcase_var.eql($UNSPECIFIED)) {
                SubLObject error_string = NIL;
                if (NIL != location) {
                    error_string = cconcatenate($$$No_term_was_specified_in_, new SubLObject[]{ location, $str146$_ });
                } else {
                    error_string = $str185$No_term_was_specified_;
                }
                cb_error($str148$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($INVALID_CONSTANTS)) {
                    SubLObject error_string = NIL;
                    if (NIL != location) {
                        error_string = cconcatenate($$$Invalid_Constant_References_in_, location);
                    } else {
                        error_string = $$$Invalid_Constant_References;
                    }
                    cb_show_term_error_page(error_string, CB_SHOW_INVALID_CONSTANTS, term_string);
                } else
                    if (pcase_var.eql($UNMATCHED_PARENTHESES)) {
                        SubLObject error_string = NIL;
                        if (NIL != location) {
                            error_string = cconcatenate($$$Unmatched_Parentheses_in_, location);
                        } else {
                            error_string = $$$Unmatched_Parentheses;
                        }
                        cb_show_term_error_page(error_string, CB_SHOW_UNMATCHED_PARENTHESES, term_string);
                    } else
                        if (pcase_var.eql($EOF)) {
                            SubLObject error_string = NIL;
                            if (NIL != location) {
                                error_string = cconcatenate($$$Unfinished_Term_in_, location);
                            } else {
                                error_string = $$$Unfinished_Term;
                            }
                            cb_show_term_error_page(error_string, CB_SHOW_EOF_EXPLANATION, term_string);
                        } else
                            if (pcase_var.eql($READ_ERROR)) {
                                SubLObject error_string = NIL;
                                if (NIL != location) {
                                    error_string = cconcatenate($$$Unreadable_Term_in_, location);
                                } else {
                                    error_string = $$$Unreadable_Term;
                                }
                                cb_show_term_error_page(error_string, CB_SHOW_READER_ERROR_EXPLANATION, term_string);
                            } else
                                if (pcase_var.eql($SYMBOLS_FOR_INVALID_CONSTANTS)) {
                                    SubLObject error_string = NIL;
                                    if (NIL != location) {
                                        error_string = cconcatenate($$$Invalid_Constant_References_in_, location);
                                    } else {
                                        error_string = $$$Invalid_Constant_References;
                                    }
                                    cb_show_term_error_page(error_string, CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, term_string);
                                } else {
                                    cb_error($str148$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }





        } else {
            cdestructuring_bind_error(el_term_error, $list183);
        }
        return NIL;
    }

    public static final SubLObject new_el_term_error_alt(SubLObject error_type) {
        return list($EL_TERM_ERROR, error_type);
    }

    public static SubLObject new_el_term_error(final SubLObject error_type) {
        return list($EL_TERM_ERROR, error_type);
    }

    public static final SubLObject cb_show_term_error_page_alt(SubLObject title_string, SubLObject error_showing_func, SubLObject error_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title_string);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_string);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                funcall(error_showing_func, error_string);
                                cb_back_button(UNPROVIDED, UNPROVIDED);
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
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
            return NIL;
        }
    }

    public static SubLObject cb_show_term_error_page(final SubLObject title_string, final SubLObject error_showing_func, final SubLObject error_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str166$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str167$_meta_http_equiv__X_UA_Compatible);
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
            html_princ(title_string);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$59 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ(title_string);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    funcall(error_showing_func, error_string);
                    cb_back_button(UNPROVIDED, UNPROVIDED);
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$59, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject declare_cb_form_widgets_file_alt() {
        declareFunction("cb_monad_mt_display_string", "CB-MONAD-MT-DISPLAY-STRING", 0, 1, false);
        declareFunction("cb_mt_input_section", "CB-MT-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_monad_dimension_specified_name", "CB-MONAD-DIMENSION-SPECIFIED-NAME", 1, 0, false);
        declareFunction("cb_mt_input_monad_mt_section", "CB-MT-INPUT-MONAD-MT-SECTION", 0, 2, false);
        declareFunction("cb_mt_input_monad_dimension_section", "CB-MT-INPUT-MONAD-DIMENSION-SECTION", 0, 2, false);
        declareFunction("cb_monad_mt_input_name", "CB-MONAD-MT-INPUT-NAME", 1, 0, false);
        declareFunction("cb_time_dimension_specified_name", "CB-TIME-DIMENSION-SPECIFIED-NAME", 1, 0, false);
        declareFunction("cb_mt_input_time_dimension_section", "CB-MT-INPUT-TIME-DIMENSION-SECTION", 0, 2, false);
        declareFunction("cb_mt_input_time_interval_section", "CB-MT-INPUT-TIME-INTERVAL-SECTION", 0, 3, false);
        declareFunction("cb_time_interval_input_name", "CB-TIME-INTERVAL-INPUT-NAME", 1, 0, false);
        declareFunction("cb_mt_input_time_parameter_section", "CB-MT-INPUT-TIME-PARAMETER-SECTION", 0, 3, false);
        declareFunction("cb_time_parameter_input_name", "CB-TIME-PARAMETER-INPUT-NAME", 1, 0, false);
        declareFunction("cb_extract_mt_input", "CB-EXTRACT-MT-INPUT", 1, 2, false);
        declareFunction("cb_determine_monad_mt", "CB-DETERMINE-MONAD-MT", 3, 0, false);
        declareFunction("cb_determine_time_interval", "CB-DETERMINE-TIME-INTERVAL", 3, 0, false);
        declareFunction("cb_determine_time_parameter", "CB-DETERMINE-TIME-PARAMETER", 3, 0, false);
        declareFunction("mt_error_p", "MT-ERROR-P", 1, 0, false);
        declareFunction("cb_mt_error", "CB-MT-ERROR", 1, 1, false);
        declareFunction("new_wholly_unspecified_mt_error", "NEW-WHOLLY-UNSPECIFIED-MT-ERROR", 0, 0, false);
        declareFunction("wholly_unspecified_mt_error_p", "WHOLLY-UNSPECIFIED-MT-ERROR-P", 1, 0, false);
        declareFunction("new_unintelligible_mt_error", "NEW-UNINTELLIGIBLE-MT-ERROR", 1, 0, false);
        declareFunction("new_unmatched_paren_error", "NEW-UNMATCHED-PAREN-ERROR", 1, 0, false);
        declareFunction("new_semantic_mt_error", "NEW-SEMANTIC-MT-ERROR", 1, 0, false);
        declareFunction("new_incompletely_specified_mt_error", "NEW-INCOMPLETELY-SPECIFIED-MT-ERROR", 0, 1, false);
        declareFunction("use_gke_for_el_sentence_editing", "USE-GKE-FOR-EL-SENTENCE-EDITING", 0, 0, false);
        declareFunction("cb_el_sentence_input_section", "CB-EL-SENTENCE-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_el_sentence_input_section_gke", "CB-EL-SENTENCE-INPUT-SECTION-GKE", 0, 2, false);
        declareFunction("cb_el_sentence_input_section_html", "CB-EL-SENTENCE-INPUT-SECTION-HTML", 0, 2, false);
        declareFunction("cb_extract_el_sentence_input", "CB-EXTRACT-EL-SENTENCE-INPUT", 1, 1, false);
        declareFunction("cb_extract_query_formula_from_string", "CB-EXTRACT-QUERY-FORMULA-FROM-STRING", 1, 1, false);
        declareFunction("cb_determine_el_sentence", "CB-DETERMINE-EL-SENTENCE", 2, 0, false);
        declareFunction("cb_invalid_constant_names_in_string", "CB-INVALID-CONSTANT-NAMES-IN-STRING", 1, 0, false);
        declareFunction("cb_normalize_formula_string", "CB-NORMALIZE-FORMULA-STRING", 1, 0, false);
        declareFunction("cb_invalid_constant_names_in_stringP", "CB-INVALID-CONSTANT-NAMES-IN-STRING?", 1, 0, false);
        declareFunction("el_sentence_error_p", "EL-SENTENCE-ERROR-P", 1, 0, false);
        declareFunction("cb_el_sentence_error", "CB-EL-SENTENCE-ERROR", 1, 2, false);
        declareFunction("new_el_sentence_error", "NEW-EL-SENTENCE-ERROR", 1, 0, false);
        declareFunction("cb_show_sentence_error_page", "CB-SHOW-SENTENCE-ERROR-PAGE", 3, 0, false);
        declareFunction("cb_el_term_input_section", "CB-EL-TERM-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_el_term_input_section_internal", "CB-EL-TERM-INPUT-SECTION-INTERNAL", 0, 2, false);
        declareFunction("cb_extract_el_term_input", "CB-EXTRACT-EL-TERM-INPUT", 1, 1, false);
        declareFunction("cb_determine_el_term", "CB-DETERMINE-EL-TERM", 2, 0, false);
        declareFunction("el_term_error_p", "EL-TERM-ERROR-P", 1, 0, false);
        declareFunction("cb_el_term_error", "CB-EL-TERM-ERROR", 1, 2, false);
        declareFunction("new_el_term_error", "NEW-EL-TERM-ERROR", 1, 0, false);
        declareFunction("cb_show_term_error_page", "CB-SHOW-TERM-ERROR-PAGE", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_form_widgets_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_monad_mt_display_string", "CB-MONAD-MT-DISPLAY-STRING", 0, 1, false);
            declareFunction("cb_mt_input_section", "CB-MT-INPUT-SECTION", 0, 2, false);
            declareFunction("cb_monad_dimension_specified_name", "CB-MONAD-DIMENSION-SPECIFIED-NAME", 1, 0, false);
            declareFunction("cb_mt_input_monad_mt_section", "CB-MT-INPUT-MONAD-MT-SECTION", 0, 2, false);
            declareFunction("cb_mt_input_monad_dimension_section", "CB-MT-INPUT-MONAD-DIMENSION-SECTION", 0, 2, false);
            declareFunction("cb_monad_mt_input_name", "CB-MONAD-MT-INPUT-NAME", 1, 0, false);
            declareFunction("cb_time_dimension_specified_name", "CB-TIME-DIMENSION-SPECIFIED-NAME", 1, 0, false);
            declareFunction("cb_mt_input_time_dimension_section", "CB-MT-INPUT-TIME-DIMENSION-SECTION", 0, 2, false);
            declareFunction("cb_mt_input_time_interval_section", "CB-MT-INPUT-TIME-INTERVAL-SECTION", 0, 3, false);
            declareFunction("cb_time_interval_input_name", "CB-TIME-INTERVAL-INPUT-NAME", 1, 0, false);
            declareFunction("cb_mt_input_time_parameter_section", "CB-MT-INPUT-TIME-PARAMETER-SECTION", 0, 3, false);
            declareFunction("cb_time_parameter_input_name", "CB-TIME-PARAMETER-INPUT-NAME", 1, 0, false);
            declareFunction("cb_extract_mt_input", "CB-EXTRACT-MT-INPUT", 1, 2, false);
            declareFunction("cb_determine_monad_mt", "CB-DETERMINE-MONAD-MT", 3, 0, false);
            declareFunction("cb_determine_time_interval", "CB-DETERMINE-TIME-INTERVAL", 3, 0, false);
            declareFunction("cb_determine_time_parameter", "CB-DETERMINE-TIME-PARAMETER", 3, 0, false);
            declareFunction("mt_error_p", "MT-ERROR-P", 1, 0, false);
            declareFunction("cb_mt_error", "CB-MT-ERROR", 1, 1, false);
            declareFunction("new_wholly_unspecified_mt_error", "NEW-WHOLLY-UNSPECIFIED-MT-ERROR", 0, 0, false);
            declareFunction("wholly_unspecified_mt_error_p", "WHOLLY-UNSPECIFIED-MT-ERROR-P", 1, 0, false);
            declareFunction("new_unintelligible_mt_error", "NEW-UNINTELLIGIBLE-MT-ERROR", 1, 0, false);
            declareFunction("new_unmatched_paren_error", "NEW-UNMATCHED-PAREN-ERROR", 1, 0, false);
            declareFunction("new_semantic_mt_error", "NEW-SEMANTIC-MT-ERROR", 1, 0, false);
            declareFunction("new_incompletely_specified_mt_error", "NEW-INCOMPLETELY-SPECIFIED-MT-ERROR", 0, 1, false);
            declareFunction("use_js_el_sentence_editorP", "USE-JS-EL-SENTENCE-EDITOR?", 0, 0, false);
            declareFunction("cb_el_sentence_input_section", "CB-EL-SENTENCE-INPUT-SECTION", 0, 2, false);
            declareFunction("cb_el_formula_input_section", "CB-EL-FORMULA-INPUT-SECTION", 0, 2, false);
            declareFunction("cb_el_formula_input_section_html", "CB-EL-FORMULA-INPUT-SECTION-HTML", 0, 2, false);
            declareFunction("cb_format_sentence_editor_sentence", "CB-FORMAT-SENTENCE-EDITOR-SENTENCE", 2, 0, false);
            declareFunction("cb_sentence_editor_start", "CB-SENTENCE-EDITOR-START", 2, 2, false);
            declareFunction("cb_sentence_editor_start_1", "CB-SENTENCE-EDITOR-START-1", 2, 2, false);
            declareFunction("cb_sentence_editor_start_codemirror", "CB-SENTENCE-EDITOR-START-CODEMIRROR", 2, 2, false);
            declareFunction("cb_extract_el_sentence_input", "CB-EXTRACT-EL-SENTENCE-INPUT", 1, 1, false);
            declareFunction("cb_extract_el_formula_input", "CB-EXTRACT-EL-FORMULA-INPUT", 1, 1, false);
            declareFunction("cb_extract_query_formula_from_string", "CB-EXTRACT-QUERY-FORMULA-FROM-STRING", 1, 1, false);
            declareFunction("cb_determine_el_sentence", "CB-DETERMINE-EL-SENTENCE", 2, 0, false);
            declareFunction("cb_determine_el_formula", "CB-DETERMINE-EL-FORMULA", 2, 1, false);
            declareFunction("cb_convert_strings_to_cycl", "CB-CONVERT-STRINGS-TO-CYCL", 1, 0, false);
            declareFunction("cb_invalid_constant_names_in_string", "CB-INVALID-CONSTANT-NAMES-IN-STRING", 1, 0, false);
            declareFunction("utf8_nbsp", "UTF8-NBSP", 0, 0, false);
            declareFunction("return_string", "RETURN-STRING", 0, 0, false);
            declareFunction("cb_normalize_formula_string", "CB-NORMALIZE-FORMULA-STRING", 1, 0, false);
            declareFunction("cb_invalid_constant_names_in_stringP", "CB-INVALID-CONSTANT-NAMES-IN-STRING?", 1, 0, false);
            declareFunction("el_sentence_error_p", "EL-SENTENCE-ERROR-P", 1, 0, false);
            declareFunction("el_formula_error_p", "EL-FORMULA-ERROR-P", 1, 0, false);
            declareFunction("cb_el_sentence_error", "CB-EL-SENTENCE-ERROR", 1, 2, false);
            declareFunction("cb_el_formula_error", "CB-EL-FORMULA-ERROR", 1, 2, false);
            declareFunction("new_el_formula_error", "NEW-EL-FORMULA-ERROR", 1, 0, false);
            declareFunction("cb_show_formula_error_page", "CB-SHOW-FORMULA-ERROR-PAGE", 3, 0, false);
            declareFunction("cb_el_term_input_section", "CB-EL-TERM-INPUT-SECTION", 0, 2, false);
            declareFunction("cb_el_term_input_section_internal", "CB-EL-TERM-INPUT-SECTION-INTERNAL", 0, 2, false);
            declareFunction("cb_extract_el_term_input", "CB-EXTRACT-EL-TERM-INPUT", 1, 1, false);
            declareFunction("cb_determine_el_term", "CB-DETERMINE-EL-TERM", 2, 0, false);
            declareFunction("el_term_error_p", "EL-TERM-ERROR-P", 1, 0, false);
            declareFunction("cb_el_term_error", "CB-EL-TERM-ERROR", 1, 2, false);
            declareFunction("new_el_term_error", "NEW-EL-TERM-ERROR", 1, 0, false);
            declareFunction("cb_show_term_error_page", "CB-SHOW-TERM-ERROR-PAGE", 3, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("use_gke_for_el_sentence_editing", "USE-GKE-FOR-EL-SENTENCE-EDITING", 0, 0, false);
            declareFunction("cb_el_sentence_input_section_gke", "CB-EL-SENTENCE-INPUT-SECTION-GKE", 0, 2, false);
            declareFunction("cb_el_sentence_input_section_html", "CB-EL-SENTENCE-INPUT-SECTION-HTML", 0, 2, false);
            declareFunction("new_el_sentence_error", "NEW-EL-SENTENCE-ERROR", 1, 0, false);
            declareFunction("cb_show_sentence_error_page", "CB-SHOW-SENTENCE-ERROR-PAGE", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_form_widgets_file_Previous() {
        declareFunction("cb_monad_mt_display_string", "CB-MONAD-MT-DISPLAY-STRING", 0, 1, false);
        declareFunction("cb_mt_input_section", "CB-MT-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_monad_dimension_specified_name", "CB-MONAD-DIMENSION-SPECIFIED-NAME", 1, 0, false);
        declareFunction("cb_mt_input_monad_mt_section", "CB-MT-INPUT-MONAD-MT-SECTION", 0, 2, false);
        declareFunction("cb_mt_input_monad_dimension_section", "CB-MT-INPUT-MONAD-DIMENSION-SECTION", 0, 2, false);
        declareFunction("cb_monad_mt_input_name", "CB-MONAD-MT-INPUT-NAME", 1, 0, false);
        declareFunction("cb_time_dimension_specified_name", "CB-TIME-DIMENSION-SPECIFIED-NAME", 1, 0, false);
        declareFunction("cb_mt_input_time_dimension_section", "CB-MT-INPUT-TIME-DIMENSION-SECTION", 0, 2, false);
        declareFunction("cb_mt_input_time_interval_section", "CB-MT-INPUT-TIME-INTERVAL-SECTION", 0, 3, false);
        declareFunction("cb_time_interval_input_name", "CB-TIME-INTERVAL-INPUT-NAME", 1, 0, false);
        declareFunction("cb_mt_input_time_parameter_section", "CB-MT-INPUT-TIME-PARAMETER-SECTION", 0, 3, false);
        declareFunction("cb_time_parameter_input_name", "CB-TIME-PARAMETER-INPUT-NAME", 1, 0, false);
        declareFunction("cb_extract_mt_input", "CB-EXTRACT-MT-INPUT", 1, 2, false);
        declareFunction("cb_determine_monad_mt", "CB-DETERMINE-MONAD-MT", 3, 0, false);
        declareFunction("cb_determine_time_interval", "CB-DETERMINE-TIME-INTERVAL", 3, 0, false);
        declareFunction("cb_determine_time_parameter", "CB-DETERMINE-TIME-PARAMETER", 3, 0, false);
        declareFunction("mt_error_p", "MT-ERROR-P", 1, 0, false);
        declareFunction("cb_mt_error", "CB-MT-ERROR", 1, 1, false);
        declareFunction("new_wholly_unspecified_mt_error", "NEW-WHOLLY-UNSPECIFIED-MT-ERROR", 0, 0, false);
        declareFunction("wholly_unspecified_mt_error_p", "WHOLLY-UNSPECIFIED-MT-ERROR-P", 1, 0, false);
        declareFunction("new_unintelligible_mt_error", "NEW-UNINTELLIGIBLE-MT-ERROR", 1, 0, false);
        declareFunction("new_unmatched_paren_error", "NEW-UNMATCHED-PAREN-ERROR", 1, 0, false);
        declareFunction("new_semantic_mt_error", "NEW-SEMANTIC-MT-ERROR", 1, 0, false);
        declareFunction("new_incompletely_specified_mt_error", "NEW-INCOMPLETELY-SPECIFIED-MT-ERROR", 0, 1, false);
        declareFunction("use_js_el_sentence_editorP", "USE-JS-EL-SENTENCE-EDITOR?", 0, 0, false);
        declareFunction("cb_el_sentence_input_section", "CB-EL-SENTENCE-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_el_formula_input_section", "CB-EL-FORMULA-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_el_formula_input_section_html", "CB-EL-FORMULA-INPUT-SECTION-HTML", 0, 2, false);
        declareFunction("cb_format_sentence_editor_sentence", "CB-FORMAT-SENTENCE-EDITOR-SENTENCE", 2, 0, false);
        declareFunction("cb_sentence_editor_start", "CB-SENTENCE-EDITOR-START", 2, 2, false);
        declareFunction("cb_sentence_editor_start_1", "CB-SENTENCE-EDITOR-START-1", 2, 2, false);
        declareFunction("cb_sentence_editor_start_codemirror", "CB-SENTENCE-EDITOR-START-CODEMIRROR", 2, 2, false);
        declareFunction("cb_extract_el_sentence_input", "CB-EXTRACT-EL-SENTENCE-INPUT", 1, 1, false);
        declareFunction("cb_extract_el_formula_input", "CB-EXTRACT-EL-FORMULA-INPUT", 1, 1, false);
        declareFunction("cb_extract_query_formula_from_string", "CB-EXTRACT-QUERY-FORMULA-FROM-STRING", 1, 1, false);
        declareFunction("cb_determine_el_sentence", "CB-DETERMINE-EL-SENTENCE", 2, 0, false);
        declareFunction("cb_determine_el_formula", "CB-DETERMINE-EL-FORMULA", 2, 1, false);
        declareFunction("cb_convert_strings_to_cycl", "CB-CONVERT-STRINGS-TO-CYCL", 1, 0, false);
        declareFunction("cb_invalid_constant_names_in_string", "CB-INVALID-CONSTANT-NAMES-IN-STRING", 1, 0, false);
        declareFunction("utf8_nbsp", "UTF8-NBSP", 0, 0, false);
        declareFunction("return_string", "RETURN-STRING", 0, 0, false);
        declareFunction("cb_normalize_formula_string", "CB-NORMALIZE-FORMULA-STRING", 1, 0, false);
        declareFunction("cb_invalid_constant_names_in_stringP", "CB-INVALID-CONSTANT-NAMES-IN-STRING?", 1, 0, false);
        declareFunction("el_sentence_error_p", "EL-SENTENCE-ERROR-P", 1, 0, false);
        declareFunction("el_formula_error_p", "EL-FORMULA-ERROR-P", 1, 0, false);
        declareFunction("cb_el_sentence_error", "CB-EL-SENTENCE-ERROR", 1, 2, false);
        declareFunction("cb_el_formula_error", "CB-EL-FORMULA-ERROR", 1, 2, false);
        declareFunction("new_el_formula_error", "NEW-EL-FORMULA-ERROR", 1, 0, false);
        declareFunction("cb_show_formula_error_page", "CB-SHOW-FORMULA-ERROR-PAGE", 3, 0, false);
        declareFunction("cb_el_term_input_section", "CB-EL-TERM-INPUT-SECTION", 0, 2, false);
        declareFunction("cb_el_term_input_section_internal", "CB-EL-TERM-INPUT-SECTION-INTERNAL", 0, 2, false);
        declareFunction("cb_extract_el_term_input", "CB-EXTRACT-EL-TERM-INPUT", 1, 1, false);
        declareFunction("cb_determine_el_term", "CB-DETERMINE-EL-TERM", 2, 0, false);
        declareFunction("el_term_error_p", "EL-TERM-ERROR-P", 1, 0, false);
        declareFunction("cb_el_term_error", "CB-EL-TERM-ERROR", 1, 2, false);
        declareFunction("new_el_term_error", "NEW-EL-TERM-ERROR", 1, 0, false);
        declareFunction("cb_show_term_error_page", "CB-SHOW-TERM-ERROR-PAGE", 3, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt3$_A_monad_dimension_specified = makeString("~A-monad-dimension-specified");

    public static final SubLSymbol $kw4$EDIT_ALLOWED_ = makeKeyword("EDIT-ALLOWED?");

    static private final SubLString $str_alt9$Mt___ = makeString("Mt : ");

    static private final SubLString $str_alt16$Monad_Mt___ = makeString("Monad Mt : ");

    static private final SubLString $str_alt17$_A_monad = makeString("~A-monad");

    static private final SubLString $str_alt18$_A_time_dimension_specified = makeString("~A-time-dimension-specified");

    public static final SubLSymbol $kw19$ANYTIME_PSC_ALLOWED_ = makeKeyword("ANYTIME-PSC-ALLOWED?");

    static private final SubLList $list_alt22 = list(reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("Now"), reader_make_constant_shell("Now-Indexical"));

    static private final SubLString $str_alt24$Time_ = makeString("Time ");

    static private final SubLString $str_alt25$Interval___ = makeString("Interval : ");

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $str_alt28$_A_time_interval = makeString("~A-time-interval");

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("Null-TimeParameter"), reader_make_constant_shell("TimePoint"));

    static private final SubLString $str_alt31$Parameter___ = makeString("Parameter : ");

    static private final SubLString $str_alt33$_A_time_parameter = makeString("~A-time-parameter");

    public static final SubLSymbol $kw34$ALLOW_VARIABLE_ = makeKeyword("ALLOW-VARIABLE?");

    public static final SubLObject init_cb_form_widgets_file_alt() {
        deflexical("*CB-MT-INPUT-DEFAULT-NAME*", $$$mt);
        deflexical("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*", $$$sentence);
        deflexical("*CB-EL-TERM-INPUT-DEFAULT-NAME*", $$$term);
        return NIL;
    }

    public static SubLObject init_cb_form_widgets_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*LEGACY-SENTENCE-EDITOR-CLASS*", $$$legacySentenceEditor);
            defconstant("*SENTENCE-EDITOR-TEXTAREA-CLASS*", $$$CycLEditorArea);
            defparameter("*CB-USE-CODEMIRROR-SENTENCE-EDITOR?*", T);
            defconstant("*KE-TEXT-CODE-EDITOR-TEXTAREA-CLASS*", $$$KETextEditorArea);
            defparameter("*CB-USE-KE-TEXT-EDITOR?*", T);
            defconstant("*SUBL-CODE-EDITOR-TEXTAREA-CLASS*", $$$SubLEditorArea);
            defparameter("*CB-USE-SUBL-CODE-EDITOR?*", NIL);
            deflexical("*CB-MT-INPUT-DEFAULT-NAME*", $$$mt);
            deflexical("*CB-EL-FORMULA-INPUT-DEFAULT-NAME*", $$$sentence);
            defparameter("*CODEMIRROR-EDITOR-START-SCRIPT*", $str116$var_options____________var_editor);
            deflexical("*UTF8-NBSP*", $UNINITIALIZED);
            deflexical("*RETURN-STRING*", $UNINITIALIZED);
            deflexical("*CB-EL-TERM-INPUT-DEFAULT-NAME*", $$$term);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*", $$$sentence);
        }
        return NIL;
    }

    public static SubLObject init_cb_form_widgets_file_Previous() {
        defconstant("*LEGACY-SENTENCE-EDITOR-CLASS*", $$$legacySentenceEditor);
        defconstant("*SENTENCE-EDITOR-TEXTAREA-CLASS*", $$$CycLEditorArea);
        defparameter("*CB-USE-CODEMIRROR-SENTENCE-EDITOR?*", T);
        defconstant("*KE-TEXT-CODE-EDITOR-TEXTAREA-CLASS*", $$$KETextEditorArea);
        defparameter("*CB-USE-KE-TEXT-EDITOR?*", T);
        defconstant("*SUBL-CODE-EDITOR-TEXTAREA-CLASS*", $$$SubLEditorArea);
        defparameter("*CB-USE-SUBL-CODE-EDITOR?*", NIL);
        deflexical("*CB-MT-INPUT-DEFAULT-NAME*", $$$mt);
        deflexical("*CB-EL-FORMULA-INPUT-DEFAULT-NAME*", $$$sentence);
        defparameter("*CODEMIRROR-EDITOR-START-SCRIPT*", $str116$var_options____________var_editor);
        deflexical("*UTF8-NBSP*", $UNINITIALIZED);
        deflexical("*RETURN-STRING*", $UNINITIALIZED);
        deflexical("*CB-EL-TERM-INPUT-DEFAULT-NAME*", $$$term);
        return NIL;
    }

    static private final SubLList $list_alt42 = list(makeSymbol("MT-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("PART-TYPE"));

    static private final SubLString $str_alt44$No_microtheory_was_specified_ = makeString("No microtheory was specified.");

    static private final SubLString $str_alt46$No_monadic_microtheory_was_specif = makeString("No monadic microtheory was specified.");

    static private final SubLString $str_alt47$No_microtheory_time_dimension_was = makeString("No microtheory time dimension was specified.");

    static private final SubLString $str_alt48$No_microtheory_time_interval_was_ = makeString("No microtheory time interval was specified.");

    static private final SubLString $str_alt49$No_microtheory_time_parameter_was = makeString("No microtheory time parameter was specified.");

    public static final SubLObject setup_cb_form_widgets_file_alt() {
        define_obsolete_register(CB_EXTRACT_QUERY_FORMULA_FROM_STRING, $list_alt104);
        return NIL;
    }

    public static SubLObject setup_cb_form_widgets_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_use_codemirror_sentence_editorP$);
            register_html_state_variable($cb_use_ke_text_editorP$);
            register_html_state_variable($cb_use_subl_code_editorP$);
            define_obsolete_register(CB_EXTRACT_QUERY_FORMULA_FROM_STRING, $list125);
            define_test_case_table_int(CB_CONVERT_STRINGS_TO_CYCL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list197);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(CB_EXTRACT_QUERY_FORMULA_FROM_STRING, $list_alt104);
        }
        return NIL;
    }

    public static SubLObject setup_cb_form_widgets_file_Previous() {
        register_html_state_variable($cb_use_codemirror_sentence_editorP$);
        register_html_state_variable($cb_use_ke_text_editorP$);
        register_html_state_variable($cb_use_subl_code_editorP$);
        define_obsolete_register(CB_EXTRACT_QUERY_FORMULA_FROM_STRING, $list125);
        define_test_case_table_int(CB_CONVERT_STRINGS_TO_CYCL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list197);
        return NIL;
    }

    static private final SubLString $str_alt50$The_MT_part__A_was_not_specified_ = makeString("The MT part ~A was not specified.");

    static private final SubLString $str_alt52$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a microtheory.");

    static private final SubLString $str_alt53$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a microtheory time dimension.");

    static private final SubLString $str_alt54$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a time interval.");

    @Override
    public void declareFunctions() {
        declare_cb_form_widgets_file();
    }

    static private final SubLString $str_alt55$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense as a time parameter.");

    @Override
    public void initializeVariables() {
        init_cb_form_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_form_widgets_file();
    }

    static private final SubLString $str_alt56$The_string__S_did_not_make_sense_ = makeString("The string ~S did not make sense for MT part ~A.");

    static {
    }

    static private final SubLString $str_alt58$Unmatched_Parentheses_in_microthe = makeString("Unmatched Parentheses in microtheory ~S.");

    static private final SubLString $str_alt59$Unmatched_Parentheses_in_microthe = makeString("Unmatched Parentheses in microtheory time dimension ~S.");

    static private final SubLString $str_alt60$Unmatched_Parentheses_in_time_int = makeString("Unmatched Parentheses in time interval ~S.");

    static private final SubLString $str_alt61$Unmatched_Parentheses_in_time_par = makeString("Unmatched Parentheses in time parameter ~S.");

    static private final SubLString $str_alt62$Unmatched_Parentheses_in_mt_part_ = makeString("Unmatched Parentheses in mt part ~S.");

    static private final SubLString $str_alt64$MT_parts__S_were_unspecified_ = makeString("MT parts ~S were unspecified.");

    static private final SubLString $str_alt66$_S_did_not_specify_a_monadic_micr = makeString("~S did not specify a monadic microtheory.");

    static private final SubLString $str_alt67$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory.");

    static private final SubLString $str_alt68$_S_did_not_specify_a_microtheory_ = makeString("~S did not specify a microtheory time dimension.");

    static private final SubLString $str_alt70$_S_did_not_specify_a_time_interva = makeString("~S did not specify a time interval.");

    static private final SubLString $str_alt72$_S_did_not_specify_a_time_paramet = makeString("~S did not specify a time parameter.");

    static private final SubLString $str_alt73$_S_did_not_specify_a_term_suitabl = makeString("~S did not specify a term suitable for MT part ~A.");

    static private final SubLString $str_alt74$MT_ERROR__S____S__S__S = makeString("MT ERROR ~S : ~S ~S ~S");

    static private final SubLString $str_alt75$_S____S = makeString("~S : ~S");

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*")), list(makeSymbol("COMPLETE-LABEL"), makeString("Complete")), makeSymbol("CHOICES"), list(makeSymbol("PRETTY-NAME"), makeString("EL Sentence")), list(makeSymbol("CLEAR-LABEL"), makeString("Clear Sentence")), makeSymbol("CYCLIFY-LABEL"), list(makeSymbol("DOMAIN-MT"), reader_make_constant_shell("InferencePSC")), list(makeSymbol("WIDTH"), makeInteger(80)), list(makeSymbol("HEIGHT"), TWENTY_INTEGER) });

    static private final SubLList $list_alt78 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeKeyword("COMPLETE-LABEL"), makeKeyword("CHOICES"), makeKeyword("PRETTY-NAME"), makeKeyword("CLEAR-LABEL"), makeKeyword("CYCLIFY-LABEL"), makeKeyword("DOMAIN-MT"), makeKeyword("WIDTH"), makeKeyword("HEIGHT") });



    static private final SubLString $str_alt92$__ = makeString(" :");

    private static final SubLSymbol $UNCONSTRAINED_CYCL = makeKeyword("UNCONSTRAINED-CYCL");

    static private final SubLList $list_alt94 = list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*")), list(makeSymbol("COMPLETE-LABEL"), makeString("Complete")), makeSymbol("CHOICES"), list(makeSymbol("PRETTY-NAME"), makeString("EL Sentence")), list(makeSymbol("CLEAR-LABEL"), makeString("Clear Sentence")), makeSymbol("CYCLIFY-LABEL"), list(makeSymbol("WIDTH"), makeInteger(80)), list(makeSymbol("HEIGHT"), TWENTY_INTEGER) });

    static private final SubLList $list_alt95 = list(makeKeyword("INPUT-NAME"), makeKeyword("COMPLETE-LABEL"), makeKeyword("CHOICES"), makeKeyword("PRETTY-NAME"), makeKeyword("CLEAR-LABEL"), makeKeyword("CYCLIFY-LABEL"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"));

    static private final SubLList $list_alt99 = list(makeSymbol("&KEY"), list(makeSymbol("REQUIRED?"), T), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-SENTENCE-INPUT-DEFAULT-NAME*")), list(makeSymbol("AUTO-CYCLIFY"), T));

    static private final SubLList $list_alt100 = list(makeKeyword("REQUIRED?"), makeKeyword("INPUT-NAME"), makeKeyword("AUTO-CYCLIFY"));

    static private final SubLList $list_alt104 = list(makeSymbol("CB-EXTRACT-EL-SENTENCE-INPUT"));

    static private final SubLString $str_alt105$Bad_formula__probably_due_to_a_mi = makeString("Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~S");

    static private final SubLList $list_alt114 = list(makeString("\""));

    static private final SubLString $str_alt115$_ = makeString("\"");

    private static final SubLSymbol $EL_SENTENCE_ERROR = makeKeyword("EL-SENTENCE-ERROR");

    private static final SubLSymbol EL_SENTENCE_ERROR_P = makeSymbol("EL-SENTENCE-ERROR-P");

    static private final SubLList $list_alt119 = list(makeSymbol("EL-SENTENCE-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"));

    static private final SubLString $str_alt120$No_sentence_was_specified_in_ = makeString("No sentence was specified in ");

    static private final SubLString $str_alt121$_ = makeString(".");

    static private final SubLString $str_alt122$No_sentence_was_specified_ = makeString("No sentence was specified.");

    static private final SubLString $str_alt123$_A = makeString("~A");

    static private final SubLString $str_alt124$Invalid_Constant_References_in_ = makeString("Invalid Constant References in ");

    static private final SubLString $str_alt127$Unmatched_Parentheses_in_ = makeString("Unmatched Parentheses in ");

    static private final SubLString $str_alt130$Unfinished_Sentence_in_ = makeString("Unfinished Sentence in ");

    static private final SubLString $$$Unfinished_Sentence = makeString("Unfinished Sentence");

    static private final SubLString $str_alt133$Unreadable_Sentence_in_ = makeString("Unreadable Sentence in ");

    static private final SubLString $$$Unreadable_Sentence = makeString("Unreadable Sentence");

    static private final SubLString $str_alt137$Not_a_Sentence_in_ = makeString("Not a Sentence in ");

    static private final SubLString $str_alt146$width__ = makeString("width: ");

    static private final SubLString $str_alt147$px_ = makeString("px;");

    static private final SubLString $str_alt148$px__position_static = makeString("px; position:static");

    static private final SubLList $list_alt151 = list(makeSymbol("&KEY"), list(makeSymbol("REQUIRED?"), T), list(makeSymbol("INPUT-NAME"), makeSymbol("*CB-EL-TERM-INPUT-DEFAULT-NAME*")), list(makeSymbol("AUTO-CYCLIFY"), T));

    static private final SubLList $list_alt154 = list(makeSymbol("EL-TERM-ERROR-KEYWORD"), makeSymbol("ERROR-TYPE"));

    static private final SubLString $str_alt155$No_term_was_specified_in_ = makeString("No term was specified in ");

    static private final SubLString $str_alt156$No_term_was_specified_ = makeString("No term was specified.");

    static private final SubLString $str_alt157$Unfinished_Term_in_ = makeString("Unfinished Term in ");

    static private final SubLString $str_alt159$Unreadable_Term_in_ = makeString("Unreadable Term in ");
}

/**
 * Total time: 1207 ms synthetic
 */
